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
	List<String> changeList = new ArrayList<String>();
	
	def void print(VitruviusChange vitruviusChange) {
		printSeperator()
		for(EChange change : vitruviusChange.EChanges) {
			var String output = printChange(change)
			changeList.add(output);
		}
	}
	
	def dispatch String printChange(RemoveRootEObject<EObject> object) {
	}
	
	def dispatch String printChange(InsertRootEObject<EObject> object) {
	}
	
	def dispatch String printChange(CreateEObject<EObject> object) {
		if(object.affectedEObject instanceof Feature) {
			return println("Create Feature: " + (object.affectedEObject as Feature).name)
		}
		
		if(object.affectedEObject instanceof TreeConstraint) {
			return println("Create TreeConstraint: " + (object.affectedEObject as TreeConstraint).type)
		}
	}

	def dispatch String printChange(DeleteEObject<EObject> object) {
		if(object.affectedEObject instanceof Feature) {
			return println("Delete Feature: " + (object.affectedEObject as Feature).name)
		}
		
		if(object.affectedEObject instanceof TreeConstraint) {
			return println("Delete TreeConstraint: " + (object.affectedEObject as TreeConstraint).type)
		}
	}

	def dispatch String printChange(ReplaceSingleValuedEAttribute object) {
		return println("Replace attribute of: " + (object.affectedEObject as Feature).name + " from " + object.oldValue + " to " + object.newValue)
	}
	
	def dispatch String printChange(InsertEReference<EObject,EObject> object) {
		return printInsertOrRemoveReference("Insert", object.newValue, object.affectedEObject);
	}
	
	def dispatch String printChange(RemoveEReference<EObject, EObject> object) {
		return printInsertOrRemoveReference("Remove", object.oldValue, object.affectedEObject);
	}
	
	def String printInsertOrRemoveReference(String comand, EObject objectValue, EObject affectedEObject) {
		if(objectValue instanceof Feature && affectedEObject instanceof vavemodel.System) {
			return println(comand + " reference of: " + (objectValue as Feature).name + " in System")
		}
		
		if(objectValue instanceof TreeConstraint && affectedEObject instanceof Feature) {
			return println(comand + " reference of: TreeConstraint(" + (objectValue as TreeConstraint).type + ")" + " in " + (affectedEObject as Feature).name)
		}
		
		if(objectValue instanceof Feature && affectedEObject instanceof TreeConstraint) {
			return println(comand + " reference of: " + (objectValue as Feature).name + " in TreeConstraint(" + (affectedEObject as TreeConstraint).type +")")
		}
		
		throw new IllegalArgumentException("NOT SUPPORTED REMOVE OR INSERT REFERENCE");
	}
	
	private def String printSeperator() {
		println("==============================================================")
		println("Changes")
		println("==============================================================")
	}
}
