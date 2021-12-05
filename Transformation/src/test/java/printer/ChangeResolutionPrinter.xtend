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

class ChangeResolutionPrinter {
	List<String> changeList;

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

	def void printResult(EvolutionClassStatisticCounter totalCounter,
		EvolutionClassStatisticCounter specializationCounter, EvolutionClassStatisticCounter generalizationCounter,
		List<String> resultList) {
		var double totalPercentage = 0
		var double specializationPercentage = 0
		var double generalizationPercentage = 0

		if (totalCounter.totalChangeResolutions > 0) {
			totalPercentage = (totalCounter.correctChangeResolutions as double /
				totalCounter.totalChangeResolutions as double) * 100
		}

		if (specializationCounter.totalChangeResolutions > 0) {
			specializationPercentage = specializationCounter.correctChangeResolutions as double /
				specializationCounter.totalChangeResolutions as double * 100
		}

		if (generalizationCounter.totalChangeResolutions > 0) {
			generalizationPercentage = generalizationCounter.correctChangeResolutions as double /
				generalizationCounter.totalChangeResolutions as double * 100
		}

        this.printSeperator
        for(String result : resultList) {
        	println(result)
        }
        
		this.printSeperator
		println("Total change resolutions: " + totalCounter.totalChangeResolutions)
		println("Total correct change resolutions: " + totalCounter.correctChangeResolutions)
		println("Total incorrect change resolutions: " + totalCounter.incorrectChangeResolutions)
		System.out.printf("%.2f", totalPercentage)
		println(" % of the total derived change resolutions are correct.")

		println("--------------------------------------------------------------")

		println("Specialization change resolutions: " + specializationCounter.totalChangeResolutions)
		println("Specialization correct change resolutions: " + specializationCounter.correctChangeResolutions)
		println("Specialization incorrect change resolutions: " + specializationCounter.incorrectChangeResolutions)
		System.out.printf("%.2f", specializationPercentage)
		println(" % of the derived change resolutions, from the specialization evolution class, are correct.")

		println("--------------------------------------------------------------")

		println("Generalization change resolutions: " + generalizationCounter.totalChangeResolutions)
		println("Generalization correct change resolutions: " + generalizationCounter.correctChangeResolutions)
		println("Generalization incorrect change resolutions: " + generalizationCounter.incorrectChangeResolutions)
		System.out.printf("%.2f", generalizationPercentage)
		println(" % of the derived change resolutions, from the generalization evolution class, are correct.")

		this.printSeperator
	}
	
	def void printSeperator() {
		println("==============================================================")
	}

	def void printChangeBetween(String newStateFileName, String oldStateFileName) {
		this.printSeperator
		println("Changes between: " + oldStateFileName + " and " + newStateFileName)
		this.printSeperator
	}
}
