package transformations.xml2vave;

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
import FeatureIDEXSD.StructType;
import vavemodel.VavemodelFactory;

/**
 * This class transforms the FeatureIDE-Feature-Model XML-File to a Feature-Model in VaVe.
 * @author Atilla
 *
 */
public class XML2VaveTransformation {

	private vavemodel.System system;
	private Path projectFolder = Paths.get(".").normalize().toAbsolutePath();
	private StructTransformation structTransformation;
	private CrossTreeConstraintTransformation constraintTransformation;

	public XML2VaveTransformation() {
		this.system = VavemodelFactory.eINSTANCE.createSystem();
		this.structTransformation = new StructTransformation(system);
		this.constraintTransformation = new CrossTreeConstraintTransformation(system);

	}

	/**
	 * Starts the transformation.
	 * @param root The root element.
	 */
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

		this.structTransformation.start(struct);

		if (constraints != null && constraints.getRule() != null) {
			this.constraintTransformation.start(constraints.getRule());
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
