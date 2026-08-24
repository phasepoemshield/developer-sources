package kotlinx.serialization.descriptors

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Iterables.kt
// $VF: local visibility outside of methodSupplier
internal class `SerialDescriptorKt$special$$inlined$Iterable$1` : KMappedMarker, java.lang.Iterable {
   fun `SerialDescriptorKt$special$$inlined$Iterable$1`(var1: SerialDescriptor) {
      this.$this_elementDescriptors$inlined = var1
   }

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from SerialDescriptor.kt
object : Iterator<SerialDescriptor> {
         private final var elementsLeft: Int = SerialDescriptorKt.this.elementsCount

         public override operator fun hasNext(): Boolean {
            return this.elementsLeft > 0
         }

         override fun remove() {
            throw UnsupportedOperationException("Operation is not supported for read-only collection")
         }

         public open operator fun next(): SerialDescriptor {
            val var10000: SerialDescriptor = SerialDescriptorKt.this
            val var10001: Int = SerialDescriptorKt.this.elementsCount
            val var1: Int = this.elementsLeft
            this.elementsLeft += -1
            return var10000.getElementDescriptor(var10001 - var1)
         }
      }
   }
}
