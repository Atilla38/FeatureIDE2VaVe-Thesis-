package transformations;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.FeatureModelType;
import FeatureIDEXSD.StructType;
import FeatureIDEXSD.util.FeatureIDEXSDResourceFactoryImpl;

public class Main {
	static XSD2VaveTransformation transformation;

	public static void main(String[] args) {
		File file = new File("D:\\Projekte\\Feature\\FeatureIDE\\FeatureIDE.xml");
		transformation = new XSD2VaveTransformation();
		Resource resource = loadFeatureIDEXMLFile(file);
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);

		if (root.getFeatureModel() != null) {
			FeatureModelType featurModel = root.getFeatureModel();
			StructType struct = featurModel.getStruct();
			
			transformation.start(struct);
		}

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
