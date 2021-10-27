package transformations.vave2xml;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.emf.common.util.EList;

import FeatureIDEXSD.FeatureIDEXSDFactory;
import FeatureIDEXSD.FeatureModelType;
import transformations.vave2xml.CrossTreeConstraintTransformation;
import transformations.vave2xml.StructTransformation;
import vavemodel.CrossTreeConstraint;
import vavemodel.Feature;

public class Vave2XMLTransformation {

	private FeatureModelType featureModel;
	private Path projectFolder = Paths.get(".").normalize().toAbsolutePath();
	private StructTransformation structTransformation;
	private CrossTreeConstraintTransformation constraintTransformation;
	
	
	public Vave2XMLTransformation() {
		this.featureModel = FeatureIDEXSDFactory.eINSTANCE.createFeatureModelType();
		this.structTransformation = new StructTransformation(featureModel);
		this.constraintTransformation = new CrossTreeConstraintTransformation(featureModel);
	}
	
	public void start(vavemodel.System root) {
		EList<Feature> features;
		EList<CrossTreeConstraint> constraints;
		
		if (root.getFeature() != null) {
			features = root.getFeature();
		} else {
			System.out.println("No feature found");
			return;
		}
		
		this.structTransformation.start(features);
	
		if (root.getConstraint() != null) {
			constraints = root.getConstraint();
		} else {
			System.out.println("No constraint found");
			return;
		}
		
		this.constraintTransformation.start(constraints);
		
		
		
	}

}
