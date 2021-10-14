package xsd2vave;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import FeatureIDEXSD.ConstraintsType;
import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.RuleType;
import FeatureIDEXSD.StructType;
import vavemodel.FeatureOption;
import vavemodel.VavemodelFactory;

public class XSD2VaveTransformation {

	private vavemodel.System system;
	private Path projectFolder = Paths.get(".").normalize().toAbsolutePath();
	private StructTransformation structTransformation;
	private CrossTreeConstraintTransformation constraintTransformation;

	public XSD2VaveTransformation() {
		this.system = VavemodelFactory.eINSTANCE.createSystem();
		this.structTransformation = new StructTransformation(system);
		this.constraintTransformation = new CrossTreeConstraintTransformation(system);

	}

	public void start(DocumentRoot root) {

		StructType struct;
		ConstraintsType constraints;

		if (root.getFeatureModel() != null) {
			FeatureModelType featureModel = root.getFeatureModel();
			struct = featureModel.getStruct();
			constraints = featureModel.getConstraints();
		} else {
			System.out.println("featureModel is null");
			return;
		}

		if (struct.getAlt() != null) {
			this.structTransformation.parseAlt(struct.getAlt(), null, null);
		}

		if (struct.getAnd() != null) {
			this.structTransformation.parseAnd(struct.getAnd(), null, null);
		}

		if (struct.getOr() != null) {
			this.structTransformation.parseOr(struct.getOr(), null, null);
		}

		if (constraints != null && constraints.getRule() != null) {
			for (RuleType rule : constraints.getRule()) {
				vavemodel.CrossTreeConstraint crossTreeConstr = VavemodelFactory.eINSTANCE.createCrossTreeConstraint();
				vavemodel.Expression<FeatureOption> expression = null;
				
				if (rule.getConj() != null) {
					this.constraintTransformation.parseConj(rule.getConj());
				}

				if (rule.getImp() != null) {
					expression = this.constraintTransformation.parseImp(rule.getImp());
				}

				crossTreeConstr.setExpression(expression);
				system.getConstraint().add(crossTreeConstr);
			}

		}

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vavemodel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(
				URI.createFileURI(this.projectFolder.resolve("models/car_withFeatures.vavemodel").toString()));
		resource.getContents().add(system);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("FOLDER: " + this.projectFolder);
	}

}
