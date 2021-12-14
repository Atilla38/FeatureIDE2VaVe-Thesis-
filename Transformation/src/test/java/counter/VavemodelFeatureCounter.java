package counter;

import java.io.File;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import vavemodel.System;
import vavemodel.VavemodelPackage;

/**
 * Counts the features in a VaVe Feature-Model.
 * 
 * @author Atilla Ates
 */
public class VavemodelFeatureCounter extends Counter {

	/**
	 * Counts the features in a VaVe Feature-Model.
	 * 
	 * @param file The VaVemodel in which the features are counted.
	 * @returns Returns the number of counted features.
	 */
	@Override
	public int countFeatures(File file, Boolean bool) {
		Resource vave = this.loadVavemodel(file);
		vavemodel.System system = (System) vave.getContents().get(0);
		return system.getFeature().size();
	}

	private Resource loadVavemodel(File file) {
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
