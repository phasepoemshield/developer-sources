package kotlinx.serialization.internal

import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from CollectionDescriptors.kt
internal class PrimitiveArrayDescriptor internal constructor(primitive: SerialDescriptor) : ListLikeDescriptor(primitive) {
   public open val serialName: String

   init {
      this.serialName = "${primitive.serialName}Array"
   }
}
