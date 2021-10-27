package transformations;

import java.io.File;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.util.FeatureIDEXSDResourceFactoryImpl;
import transformations.xml2vave.XML2VaveTransformation;

public class Main {
	static XML2VaveTransformation transformation;

	public static void main(String[] args) {
		File file = new File("D:\\Projekte\\Feature\\Elevator-Antenna-v1.0\\Elevator-Antenna-v1.0.xml");
		generateVaveModel(file);

	}

	private static void generateVaveModel(File featureIDEXML) {
		transformation = new XML2VaveTransformation();
		Resource resource = loadFeatureIDEXMLFile(featureIDEXML);
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);

		transformation.start(root);
	}

	public static Resource loadFeatureIDEXMLFile(File musicXMLFile) {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",
				new FeatureIDEXSDResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("featureIDExml",
				new FeatureIDEXSDResourceFactoryImpl());

		return resourceSet.getResource(URI.createFileURI(musicXMLFile.getAbsolutePath()), true);
	}

}
