package kotlinx.serialization.descriptors

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `SerialDescriptorKt$special$$inlined$Iterable$2` : java.lang.Iterable<java.lang.String>, KMappedMarker {
   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from SerialDescriptor.kt
object : Iterator<String> {
         private final var elementsLeft: Int = SerialDescriptorKt.this.elementsCount

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public open operator fun next(): String {
            val var10000: SerialDescriptor = SerialDescriptorKt.this
            val var10001: Int = SerialDescriptorKt.this.elementsCount
            val var1: Int = this.elementsLeft
            this.elementsLeft += -1
            return var10000.getElementName(var10001 - var1)
         }

         public override operator fun hasNext(): Boolean {
            return this.elementsLeft > 0
         }
      }
   }

   fun `SerialDescriptorKt$special$$inlined$Iterable$2`(var1: SerialDescriptor) {
      this.$this_elementNames$inlined = var1
   }
}
