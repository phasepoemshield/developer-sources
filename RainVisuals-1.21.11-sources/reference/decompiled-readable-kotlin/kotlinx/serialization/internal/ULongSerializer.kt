package kotlinx.serialization.internal

import kotlin.jvm.internal.LongCompanionObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from ValueClasses.kt
@PublishedApi
internal object ULongSerializer : KSerializer<ULong> {
   public open val descriptor: SerialDescriptor =
      InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.ULong", BuiltinSerializersKt.serializer(LongCompanionObject.INSTANCE))

   public open fun deserialize(decoder: Decoder): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(decoder.decodeInline(this.descriptor).decodeLong())
   }

   public open fun serialize(encoder: Encoder, value: ULong) {
      encoder.encodeInline(this.descriptor).encodeLong(value)
   }
}
