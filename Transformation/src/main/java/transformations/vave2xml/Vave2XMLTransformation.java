package transformations.vave2xml;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.util.FeatureIDEXSDResourceFactoryImpl;
import vavemodel.CrossTreeConstraint;
import vavemodel.Feature;

/**
 * This class transforms the VaVe feature-model to a FeatureIDE feature-model.
 * @author Atilla
 *
 */
public class Vave2XMLTransformation {

	private FeatureModelType featureModel;
	private Path projectFolder = Paths.get(".").normalize().toAbsolutePath();
	private StructTransformation structTransformation;
	private CrossTreeConstraintTransformation constraintTransformation;
	private DocumentRoot documentRoot;
	
	private String fileName = "vave2xml";
	private String targetFolder = "target/src/test/resource/models/FeatureIDE/";
	
	public Vave2XMLTransformation() {
		this.documentRoot = FeatureIDEXSDFactory.eINSTANCE.createDocumentRoot();
		this.featureModel = FeatureIDEXSDFactory.eINSTANCE.createFeatureModelType();
		this.structTransformation = new StructTransformation(featureModel);
		this.constraintTransformation = new CrossTreeConstraintTransformation(featureModel);
	}
	
	/**
	 * Starts the transformation.
	 * @param root The root element of the Vavemodel.
	 */
	public void start(vavemodel.System root) {
		EList<Feature> features;
		EList<CrossTreeConstraint> constraints;
		
		if (root.getFeature() != null) {
			features = root.getFeature();
		} else {
			System.out.println("No feature found");
			return;
		}
		
		try {
			this.structTransformation.start(features);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	
		if (root.getConstraint() != null && root.getConstraint().size() > 0) {
			constraints = root.getConstraint();
			this.constraintTransformation.start(constraints);
		} else {
			System.out.println("No constraint found");
		}
		
		this.documentRoot.setFeatureModel(featureModel);
		
	    safeFile();
		
	}
	
	private void safeFile() {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xml", new FeatureIDEXSDResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(
				URI.createFileURI(this.projectFolder.resolve(this.targetFolder + this.fileName+".xml").toString()));
		resource.getContents().add(documentRoot);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("FOLDER: " + this.projectFolder + "/"+ this.targetFolder + this.fileName+".xml");
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public void setTargetFolder(String targetFolder) {
		this.targetFolder = targetFolder;
	}

}
