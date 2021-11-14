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

public class Main {
	static XML2VaveTransformation xml2vaveTransformation;
	static Vave2XMLTransformation vave2xmlTransformation;

	public static void main(String[] args) {
		File xmlFile = new File("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\FeatureIDE-Projects\\Car\\car.xml");
		generateVaveModel(xmlFile, "car", "target/src/test/resource/models/vave/");
		File vaveFile = new File(
				"target/src/test/resource/models/vave/car.vavemodel");
		generateFeatureIDEXMLFile(vaveFile, "car", null);
	}

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

	public static void generateVaveModel(File featureIDEXML, String fileName, String folder) {
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

	public static Resource loadFeatureIDEXMLFile(File file) {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",
				new FeatureIDEXSDResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("featureIDExml",
				new FeatureIDEXSDResourceFactoryImpl());

		return resourceSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
	}

	public static Resource loadVavemodel(File file) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("vavemodel", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		return resSet.getResource(URI.createFileURI(file.getAbsolutePath()), true);
	}

}
