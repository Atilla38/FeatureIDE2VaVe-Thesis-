package transformations.featureIDE2vave;

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
import transformations.xml2vave.CrossTreeConstraintTransformation;
import transformations.xml2vave.StructTransformation;
import vavemodel.VavemodelFactory;

/**
 * This class transforms the FeatureIDE-Feature-Model XML-File to a
 * Feature-Model in VaVe.
 * 
 * @author Atilla
 *
 */
public class XML2VaveTransformation {

	private vavemodel.System system;
	private Path projectFolder = Paths.get(".").normalize().toAbsolutePath();
	private StructTransformation structTransformation;
	private CrossTreeConstraintTransformation constraintTransformation;
	private Resource resource;

	private String fileName = "xml2vave";
	private String targetFolder = "target/src/test/resource/models/vave/";

	public XML2VaveTransformation() {
		this.system = VavemodelFactory.eINSTANCE.createSystem();
		this.structTransformation = new StructTransformation(system);
		this.constraintTransformation = new CrossTreeConstraintTransformation(system);

	}

	/**
	 * Starts the transformation.
	 * 
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
			throw new IllegalArgumentException("featureModel can't be null");
		}

		this.structTransformation.start(struct);

		if (constraints != null && constraints.getRule() != null && constraints.getRule().size() > 0) {
			this.constraintTransformation.start(constraints.getRule());
		}

		this.saveFile();
	}

	/**
	 * Saves the generated Vavemodel file.
	 */
	private void saveFile() {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("vavemodel", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		this.resource = resSet.createResource(URI.createFileURI(
				this.projectFolder.resolve(this.targetFolder + this.fileName + ".vavemodel").toString()));
		resource.getContents().add(system);

		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException exception) {
			exception.printStackTrace();
		}

		System.out.println("FOLDER: " + this.projectFolder + "/" + this.targetFolder + this.fileName + ".vavemodel");
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public void setTargetFolder(String targetFolder) {
		this.targetFolder = targetFolder;
	}
	
	public Resource getResource() {
		return this.resource;
	}

}
