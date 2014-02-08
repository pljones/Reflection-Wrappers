package info.drealm.s3pi.demoWrapper

import info.drealm.s3pi._

object DemoResourceHandler extends Sims3ResourceHandler {

    override def supportedResourceTypes = Seq(new ResourceType(1234))

    override def apply(pkg: Sims3Package, resourceIdentifier: ResourceIdentifier) =
        internalApply(resourceIdentifier.resourceType, _ => { new DemoResource(pkg, resourceIdentifier) })

    override def apply(resourceType: ResourceType) = internalApply(resourceType, _ => { new DemoResource })

}

class DemoResource extends Sims3Resource {
    def this(pkg: Sims3Package, resourceIdentifier: ResourceIdentifier) = { this(); load(pkg, resourceIdentifier) }
    def load(byteStream: io.Source) = new Exception("Unsupported operation")
}