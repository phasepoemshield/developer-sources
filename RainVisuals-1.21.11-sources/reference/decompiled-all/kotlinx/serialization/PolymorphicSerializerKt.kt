package kotlinx.serialization

import kotlinx.serialization.encoding.CompositeDecoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.AbstractPolymorphicSerializer
import kotlinx.serialization.internal.AbstractPolymorphicSerializerKt

// $VF: Compiled from PolymorphicSerializer.kt
@InternalSerializationApi
public fun <T : Any> AbstractPolymorphicSerializer<Any>.findPolymorphicSerializer(decoder: CompositeDecoder, klassName: String?): DeserializationStrategy<Any> {
   val var10000: DeserializationStrategy = `$this$findPolymorphicSerializer`.findPolymorphicSerializerOrNull(decoder, klassName)
   if (var10000 == null) {
      AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(klassName, `$this$findPolymorphicSerializer`.baseClass)
      throw KotlinNothingValueException()
   } else {
      return var10000
   }
}

@InternalSerializationApi
public fun <T : Any> AbstractPolymorphicSerializer<Any>.findPolymorphicSerializer(encoder: Encoder, value: Any): SerializationStrategy<Any> {
   val var10000: SerializationStrategy = `$this$findPolymorphicSerializer`.findPolymorphicSerializerOrNull(encoder, value)
   if (var10000 == null) {
      AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(value.getClass()::class, `$this$findPolymorphicSerializer`.baseClass)
      throw KotlinNothingValueException()
   } else {
      return var10000
   }
}
