package kotlinx.serialization.internal

import kotlinx.serialization.InternalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from InlineClassDescriptor.kt
@InternalSerializationApi
public fun <T> InlinePrimitiveDescriptor(name: String, primitiveSerializer: KSerializer<Any>): SerialDescriptor {
   return InlineClassDescriptor(name,    // $VF: Compiled from InlineClassDescriptor.kt
object : GeneratedSerializer<Any> {
      public open val descriptor: SerialDescriptor
         public open get() {
            throw IllegalStateException("unsupported".toString())
         }


      public override fun childSerializers(): Array<KSerializer<*>> {
         return arrayOf(primitiveSerializer)
      }

      public override fun serialize(encoder: Encoder, value: Any) {
         throw IllegalStateException("unsupported".toString())
      }

      public override fun deserialize(decoder: Decoder): Any {
         throw IllegalStateException("unsupported".toString())
      }

      override fun typeParametersSerializers(): Array<KSerializer<*>> {
         GeneratedSerializer.DefaultImpls.typeParametersSerializers(this)
      }
   })
}
