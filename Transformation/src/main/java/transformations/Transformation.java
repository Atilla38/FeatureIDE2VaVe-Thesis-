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
import transformations.featureIDE2vave.FeatureIDE2VaveTransformation;
import transformations.vave2FeatureIDE.Vave2FeatureIDETransformation;
import vavemodel.VavemodelPackage;

public class Transformation {
	private static FeatureIDE2VaveTransformation xml2vaveTransformation;
	private static Vave2FeatureIDETransformation vave2xmlTransformation;

	/**
	 * Generates a FeatureIDE XML-File.
	 * 
	 * @param vavemodel The Vavemodel which should be transformed to a FeatureIDE
	 *                  XML-File.
	 * @param fileName  The name of the generated FeatueIDE XML-File.
	 * @param folder    The folder, in which the generated XML-File should be saved.
	 */
	public static void generateFeatureIDEXMLFile(File vavemodel, String fileName, String folder) {
		vave2xmlTransformation = new Vave2FeatureIDETransformation();
		if (!fileName.equals("null")) {
			vave2xmlTransformation.setFileName(fileName);
		}

		if (!folder.equals("null")) {
			vave2xmlTransformation.setTargetFolder(folder);
		}

		Resource resource = loadVavemodel(vavemodel);
		vavemodel.System root = (vavemodel.System) resource.getContents().get(0);
		vave2xmlTransformation.start(root);
	}

	/**
	 * Generates a Vavemodel from a given FeatureIDE XML-File.
	 * 
	 * @param featureIDEXML The FeatureIDEXML file which should be transformed to a
	 *                      vavemodel.
	 * @param fileName      The name of the generated Vavemodel.
	 * @param folder        The folder, in which the generated XML-File should be
	 *                      saved.
	 */
	public static Resource generateVaveModel(File featureIDEXML, String fileName, String folder) {
		xml2vaveTransformation = new FeatureIDE2VaveTransformation();

		if (!fileName.equals("null")) {
			xml2vaveTransformation.setFileName(fileName);
		}

		if (!folder.equals("null")) {
			xml2vaveTransformation.setTargetFolder(folder);
		}

		Resource resource = loadFeatureIDEXMLFile(featureIDEXML);
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
		xml2vaveTransformation.start(root);
		return xml2vaveTransformation.getResource();
	}

	/**
	 * Loads the FeatureIDEXMLFile.
	 * 
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
	 * 
	 * @param file The file which should be loaded.
	 * @return Returns the file as a resource instance.
	 */
	public static Resource loadVavemodel(File file) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		map.put("vavemodel", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();
		VavemodelPackage vavePackage = VavemodelPackage.eINSTANCE;
		resSet.getPackageRegistry().put(vavePackage.getNsURI(), vavePackage);
		// Get the resource
		return resSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
	}
}
