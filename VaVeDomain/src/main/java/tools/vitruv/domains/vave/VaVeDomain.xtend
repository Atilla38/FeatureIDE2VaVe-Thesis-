package tools.vitruv.domains.vave

import tools.vitruv.framework.domains.AbstractVitruvDomain
import vavemodel.VavemodelPackage

class VaVeDomain extends AbstractVitruvDomain {
    public static val String METAMODEL_NAME = "Vavemodel"
    public static val String FILE_EXTENSION = "vavemodel"

    package new() {
        super(METAMODEL_NAME, VavemodelPackage.eINSTANCE, FILE_EXTENSION)
    }

}
