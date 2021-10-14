package xsd2vave;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import FeatureIDEXSD.ConstraintsType;
import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.StructType;
import FeatureIDEXSD.util.FeatureIDEXSDResourceFactoryImpl;

public class Main {
	static XSD2VaveTransformation transformation;

	public static void main(String[] args) {
		File file = new File("D:\\Projekte\\workspace\\Car\\Car.xml");
		transformation = new XSD2VaveTransformation();
		Resource resource = loadFeatureIDEXMLFile(file);
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
