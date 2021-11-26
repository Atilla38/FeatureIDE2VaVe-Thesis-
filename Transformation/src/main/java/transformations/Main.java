package transformations;

import java.io.File;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.util.FeatureIDEXSDResourceFactoryImpl;
import transformations.vave2xml.Vave2XMLTransformation;
import transformations.xml2vave.XML2VaveTransformation;
import vavemodel.VavemodelPackage;

/**
 * This is the main class of the transformation. You can run the transformation
 * and can set the name and path of the files.
 * 
 * @author Atilla
 *
 */
public class Main {
	private static XML2VaveTransformation xml2vaveTransformation;
	private static Vave2XMLTransformation vave2xmlTransformation;

	// TODO: Docs
	public static void main(String[] args) {
		File featureIDEFile = new File("src/test/resource/vave2xml/FeatureIDE/car.xml");
		generateVaveModel(featureIDEFile, "car", null);
		File vaveFile = new File("src/test/resource/vave2xml/vave/car.vavemodel");
		generateFeatureIDEXMLFile(vaveFile, "car", null);
	}

	/**
	 * Generates a FeatureIDE XML-File.
	 * @param vavemodel The Vavemodel which should be transformed to a FeatureIDE XML-File.
	 * @param fileName The name of the generated FeatueIDE XML-File.
	 * @param folder The folder, in which the generated XML-File should be saved.
	 */
	public static void generateFeatureIDEXMLFile(File vavemodel, String fileName, String folder) {
		vave2xmlTransformation = new Vave2XMLTransformation();
		if (fileName != null) {
			vave2xmlTransformation.setFileName(fileName);
		}

		if (folder != null) {
			vave2xmlTransformation.setTargetFolder(folder);
		}

		Resource resource = loadVavemodel(vavemodel);
		vavemodel.System root = (vavemodel.System) resource.getContents().get(0);
		vave2xmlTransformation.start(root);
	}

	/**
	 * Generates a Vavemodel from a given FeatureIDE XML-File.
	 * @param featureIDEXML The FeatureIDEXML file which should be transformed to a vavemodel.
	 * @param fileName The name of the generated Vavemodel.
	 * @param folder The folder, in which the generated XML-File should be saved.
	 */
	public static void generateVaveModel(File featureIDEXML, String fileName, String folder) {
		System.out.println(fileName);
		xml2vaveTransformation = new XML2VaveTransformation();

		if (fileName != null) {
			xml2vaveTransformation.setFileName(fileName);
		}

		if (folder != null) {
			xml2vaveTransformation.setTargetFolder(folder);
		}

		Resource resource = loadFeatureIDEXMLFile(featureIDEXML);
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
		xml2vaveTransformation.start(root);
	}

	/**
	 * Loads the FeatureIDEXMLFile.
	 * @param file The file which should be loaded.
	 * @return Returns the file as a resource instance.
	 */
	public static Resource loadFeatureIDEXMLFile(File file) {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",
				new FeatureIDEXSDResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("featureIDExml",
				new FeatureIDEXSDResourceFactoryImpl());

		return resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
	}

	/**
	 * Loads the Vavemodel.
	 * @param file The file which should be loaded.
	 * @return Returns the file as a resource instance.
	 */
	public static Resource loadVavemodel(File file) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vavemodel", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		VavemodelPackage vavePackage = VavemodelPackage.eINSTANCE;
		resSet.getPackageRegistry().put(vavePackage.getNsURI(), vavePackage);
		// Get the resource
		return resSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
	}

}
