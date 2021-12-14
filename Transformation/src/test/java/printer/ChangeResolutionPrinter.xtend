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
import counter.EvolutionClassStatisticCounter

/**
 * Prints a user-friendly derived change resolution of the Vitruvius strategy.
 * @author Atilla Ates
 */
class ChangeResolutionPrinter {
	List<String> changeList;

	/**
	 * Prints a user-friendly Vitruvius change resolution.
	 * @param vitruviusChange The change resolution which should be printed.
	 * @param newStateFileName The name of the new state file.
	 * @param oldStateFileName The name of the old state file.
	 * @return Returns the printed user-friendly change resolution.
	 */
	def List<String> print(VitruviusChange vitruviusChange, String newStateFileName, String oldStateFileName) {
		changeList = new ArrayList<String>();
		printChangeBetween(newStateFileName, oldStateFileName)
		for (EChange change : vitruviusChange.EChanges) {
			if (!(change instanceof RemoveRootEObject) && !(change instanceof InsertRootEObject)) {
				var String print = printChange(change);
				println(print)
				changeList.add(print)
			}
		}
		return changeList
	}

	def dispatch String printChange(RemoveRootEObject<EObject> object) {
		// IGNORE
	}

	def dispatch String printChange(InsertRootEObject<EObject> object) {
		// IGNORE
	}

	def dispatch String printChange(CreateEObject<EObject> object) {
		if (object.affectedEObject instanceof Feature) {
			return "Create: Feature(" + (object.affectedEObject as Feature).name + ")"
		}

		if (object.affectedEObject instanceof TreeConstraint) {
			return "Create: TreeConstraint(" + (object.affectedEObject as TreeConstraint).type + ")"
		}
	}

	def dispatch String printChange(DeleteEObject<EObject> object) {
		if (object.affectedEObject instanceof Feature) {
			return "Delete: Feature(" + (object.affectedEObject as Feature).name + ")"
		}

		if (object.affectedEObject instanceof TreeConstraint) {
			return "Delete: TreeConstraint(" + (object.affectedEObject as TreeConstraint).type + ")"
		}
	}

	def dispatch String printChange(ReplaceSingleValuedEAttribute object) {
		var String comand = "Replace attribute of: ";
		var String fromTo = ") from " + object.oldValue + " to " + object.newValue;
		if (object.affectedEObject instanceof Feature) {
			return comand + "Feature(" + (object.affectedEObject as Feature).name + fromTo
		}

		if (object.affectedEObject instanceof TreeConstraint) {
			return comand + "TreeConstraint(" + (object.affectedEObject as TreeConstraint).type + fromTo
		}
	}

	def dispatch String printChange(InsertEReference<EObject, EObject> object) {
		return printInsertOrRemoveReference("Insert", "to", object.newValue, object.affectedEObject);
	}

	def dispatch String printChange(RemoveEReference<EObject, EObject> object) {
		return printInsertOrRemoveReference("Remove", "from", object.oldValue, object.affectedEObject);
	}

	def dispatch String printChange(EChange object) {
		throw new IllegalArgumentException("Change type not supported")
	}

	def String printInsertOrRemoveReference(String comand, String fromOrTo, EObject objectValue,
		EObject affectedEObject) {
		if (objectValue instanceof Feature && affectedEObject instanceof vavemodel.System) {
			return comand + " reference of: Feature(" + (objectValue as Feature).name + ") " + fromOrTo + " System"
		}

		if (objectValue instanceof TreeConstraint && affectedEObject instanceof Feature) {
			return comand + " reference of: TreeConstraint(" + (objectValue as TreeConstraint).type + ") " + fromOrTo +
				" Feature(" + (affectedEObject as Feature).name + ")"
		}

		if (objectValue instanceof Feature && affectedEObject instanceof TreeConstraint) {
			return comand + " reference of: Feature(" + (objectValue as Feature).name + ") " + fromOrTo +
				" TreeConstraint(" + (affectedEObject as TreeConstraint).type + ")"
		}

		throw new IllegalArgumentException("NOT SUPPORTED REMOVE OR INSERT REFERENCE");
	}

	def void printResult(List<EvolutionClassStatisticCounter> counterList, List<String> resultList) {
		this.printSeparator
		for (String result : resultList) {
			println(result)
		}

		this.printSeparator

		for (EvolutionClassStatisticCounter counter : counterList) {
			println(counter.name + " change resolutions: " + counter.totalChangeResolutions)
			println(counter.name + " correct change resolutions: " + counter.correctChangeResolutions)
			println(counter.name + " incorrect change resolutions: " + counter.incorrectChangeResolutions)
			System.out.printf("%.2f", counter.getTotalPercentageCorrect())
			println(" % of the " + counter.name + " derived change resolutions are correct.")
			println(counter.name + " minimal change resolutions: " + counter.totalMinimalChangeResolutions)
			println(counter.name + " not minimal change resolutions: " + counter.totalNotMinimalChangeResolutions)
			
			System.out.printf("%.2f", counter.getTotalPercentageMinimal())
			println(" % of the " + counter.name + " derived change resolutions are minimal.")

			println("--------------------------------------------------------------")
		}

		this.printSeparator
	}

	def void printSeparator() {
		println("==============================================================")
	}

	def void printChangeBetween(String newStateFileName, String oldStateFileName) {
		this.printSeparator
		println("Changes between: " + oldStateFileName + " and " + newStateFileName)
		this.printSeparator
	}
}
