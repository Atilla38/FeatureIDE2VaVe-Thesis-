package counter

import java.io.File

abstract class Counter {
	def abstract int countFeatures(File file, Boolean bool)

}
