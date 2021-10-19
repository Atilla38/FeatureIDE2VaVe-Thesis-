package transformations.xsd2vave;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.util.FeatureIDEXSDResourceFactoryImpl;

public class Main {
	static XSD2VaveTransformation transformation;

	public static void main(String[] args) {
		File file = new File("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\FeatureIDE-Projects\\Car\\car.xml");
		generateVaveModel(file);

	}

	private static void generateVaveModel(File featureIDEXML) {
		transformation = new XSD2VaveTransformation();
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
