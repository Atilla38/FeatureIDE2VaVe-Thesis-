package transformations;

import java.io.File;
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

import FeatureIDEXSD.DocumentRoot;
import FeatureIDEXSD.util.FeatureIDEXSDResourceFactoryImpl;
import transformations.vave2xml.Vave2XMLTransformation;
import transformations.xml2vave.XML2VaveTransformation;

public class Main {
	static XML2VaveTransformation xml2vaveTransformation;
	static Vave2XMLTransformation vave2xmlTransformation;
	private static Path projectFolder = Paths.get(".").normalize().toAbsolutePath();

	public static void main(String[] args) {
		File xmlFile = new File("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\FeatureIDE-Projects\\Car\\car.xml");
		generateVaveModel(xmlFile);
		File vaveFile = new File("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\Transformation\\models\\car_withFeatures.vavemodel");
		generateFeatureIDEXMLFile(vaveFile);
		
		/*File newXmlFile = new File("D:\\Uni\\Bachelorarbeit\\Thesis Repository\\Transformation\\models\\FeatureIDEXML.featureidexsd");
		generateVaveModel(newXmlFile);*/

	}
	
	private static void generateFeatureIDEXMLFile(File vavemodel) {
		vave2xmlTransformation = new Vave2XMLTransformation();
		Resource resource = loadVavemodel(vavemodel);
		vavemodel.System root = (vavemodel.System) resource.getContents().get(0);
		vave2xmlTransformation.start(root);
	}

	private static void generateVaveModel(File featureIDEXML) {
		xml2vaveTransformation = new XML2VaveTransformation();
		Resource resource = loadFeatureIDEXMLFile(featureIDEXML);
		DocumentRoot root = (DocumentRoot) resource.getContents().get(0);
		
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml",
				new FeatureIDEXSDResourceFactoryImpl());
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("featureIDExsd",
				new FeatureIDEXSDResourceFactoryImpl());
		Resource resource1 = resSet.createResource(
				URI.createFileURI(projectFolder.resolve("models/prased.xml").toString()));
		resource1.getContents().add(root);
		
		try {
			resource1.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
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
