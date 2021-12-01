package printer

import tools.vitruv.framework.change.description.VitruviusChange
import tools.vitruv.framework.change.echange.EChange
import tools.vitruv.framework.change.echange.eobject.CreateEObject
import tools.vitruv.framework.change.echange.eobject.DeleteEObject
import tools.vitruv.framework.change.echange.feature.attribute.ReplaceSingleValuedEAttribute
import tools.vitruv.framework.change.echange.feature.reference.InsertEReference
import tools.vitruv.framework.change.echange.feature.reference.RemoveEReference
import tools.vitruv.framework.change.echange.root.InsertRootEObject
import tools.vitruv.framework.change.echange.root.RemoveRootEObject
import vavemodel.Feature
import org.eclipse.emf.ecore.EObject
import vavemodel.TreeConstraint
import java.util.ArrayList
import java.util.List

class ChangeResolutionPrinter {
	List<String> changeList;
	
	def List<String> print(VitruviusChange vitruviusChange) {
		changeList = new ArrayList<String>();
		printSeperator()
		for(EChange change : vitruviusChange.EChanges) {
			if(!(change instanceof RemoveRootEObject) && !(change instanceof InsertRootEObject)) {
			println(printChange(change))
			changeList.add(printChange(change))
			}
		}
		return changeList
	}
	
	def dispatch String printChange(RemoveRootEObject<EObject> object) {
		//IGNORE
	}
	
	def dispatch String printChange(InsertRootEObject<EObject> object) {
		//IGNORE
	}
	
	def dispatch String printChange(CreateEObject<EObject> object) {
		if(object.affectedEObject instanceof Feature) {
			return "Create Feature: " + (object.affectedEObject as Feature).name
		}
		
		if(object.affectedEObject instanceof TreeConstraint) {
			return "Create Feature: " + (object.affectedEObject as Feature).name
		}
	}

	def dispatch String printChange(DeleteEObject<EObject> object) {
		var String output;
		if(object.affectedEObject instanceof Feature) {
			return "Delete Feature: " + (object.affectedEObject as Feature).name
		}
		
		if(object.affectedEObject instanceof TreeConstraint) {
			return "Delete TreeConstraint: " + (object.affectedEObject as TreeConstraint).type
		}
	}

	def dispatch String printChange(ReplaceSingleValuedEAttribute object) {
		return "Replace attribute of: " + (object.affectedEObject as Feature).name + " from " + object.oldValue + " to " + object.newValue
	}
	
	def dispatch String printChange(InsertEReference<EObject,EObject> object) {
		return printInsertOrRemoveReference("Insert", "to", object.newValue, object.affectedEObject);
	}
	
	def dispatch String printChange(RemoveEReference<EObject, EObject> object) {
		return printInsertOrRemoveReference("Remove", "from", object.oldValue, object.affectedEObject);
	}
	
	def String printInsertOrRemoveReference(String comand, String fromOrTo, EObject objectValue, EObject affectedEObject) {
		var String output
		if(objectValue instanceof Feature && affectedEObject instanceof vavemodel.System) {
			return comand + " reference of: " + (objectValue as Feature).name + " " + fromOrTo +" System"
		}
		
		if(objectValue instanceof TreeConstraint && affectedEObject instanceof Feature) {
			return comand + " reference of: TreeConstraint(" + (objectValue as TreeConstraint).type + ") "+ fromOrTo + " " + (affectedEObject as Feature).name 
		}
		
		if(objectValue instanceof Feature && affectedEObject instanceof TreeConstraint) {
			return comand + " reference of: " + (objectValue as Feature).name + " " + fromOrTo + " TreeConstraint(" + (affectedEObject as TreeConstraint).type +")"
		}
		
		throw new IllegalArgumentException("NOT SUPPORTED REMOVE OR INSERT REFERENCE");
	}
	
	 def String printSeperator() {
		println("==============================================================")
		println("Changes")
		println("==============================================================")
	}
}
