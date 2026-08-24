package kotlinx.serialization.encoding

import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from Encoding.kt
public inline fun Encoder.encodeCollection(descriptor: SerialDescriptor, collectionSize: Int, crossinline block: (CompositeEncoder) -> Unit) {
   val composite: CompositeEncoder = `$this$encodeCollection`.beginCollection(descriptor, collectionSize)
   block(composite)
   composite.endStructure(descriptor)
}

public inline fun Encoder.encodeStructure(descriptor: SerialDescriptor, crossinline block: (CompositeEncoder) -> Unit) {
   val composite: CompositeEncoder = `$this$encodeStructure`.beginStructure(descriptor)
   block(composite)
   composite.endStructure(descriptor)
}

public inline fun <E> Encoder.encodeCollection(
   descriptor: SerialDescriptor,
   collection: Collection<Any>,
   crossinline block: (CompositeEncoder, Int, Any) -> Unit
) {
   val `composite$iv`: CompositeEncoder = `$this$encodeCollection`.beginCollection(descriptor, collection.size())
   val `$this$encodeCollection_u24lambda_u241`: CompositeEncoder = `composite$iv`
   val `$this$forEachIndexed$iv`: java.lang.Iterable = collection
   var `index$iv`: Int = 0

   for (`item$iv` in `$this$forEachIndexed$iv`) {
      val var16: Int = `index$iv`++
      if (var16 < 0) {
         CollectionsKt.throwIndexOverflow()
      }

      block(`$this$encodeCollection_u24lambda_u241`, var16, `item$iv`)
   }

   `composite$iv`.endStructure(descriptor)
}
