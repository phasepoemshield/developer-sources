package kotlinx.serialization.internal

// $VF: Compiled from CollectionSerializers.kt
@PublishedApi
internal abstract class PrimitiveArrayBuilder<Array> {
   internal abstract fun build(): Any {
   }

   internal abstract val position: Int

   internal abstract fun ensureCapacity(requiredCapacity: Int = ...) {
   }
}
