package kotlinx.serialization.internal

import kotlin.jvm.internal.IntCompanionObject
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.BuiltinSerializersKt
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from ValueClasses.kt
@PublishedApi
internal object UIntSerializer : KSerializer<UInt> {
   public open val descriptor: SerialDescriptor =
      InlineClassDescriptorKt.InlinePrimitiveDescriptor("kotlin.UInt", BuiltinSerializersKt.serializer(IntCompanionObject.INSTANCE))

   public open fun serialize(encoder: Encoder, value: UInt) {
      encoder.encodeInline(this.descriptor).encodeInt(value)
   }

   public open fun deserialize(decoder: Decoder): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(decoder.decodeInline(this.descriptor).decodeInt())
   }
}
