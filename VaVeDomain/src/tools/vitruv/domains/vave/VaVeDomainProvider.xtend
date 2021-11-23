package tools.vitruv.domains.vave

import tools.vitruv.framework.domains.VitruvDomainProvider

class VaVeDomainProvider implements VitruvDomainProvider<VaVeDomain> {
    static var VaVeDomain instance

    override getDomain() {
        if(instance === null) {
            instance = new VaVeDomain()
        }
        return instance
    }

}
