package kotlinx.serialization.internal

import java.util.Arrays
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

// $VF: Compiled from Enums.kt
@PublishedApi
internal class EnumSerializer<T extends java.lang.Enum<T>>(serialName: String, vararg values: Any) : KSerializer<T> {
   public open val descriptor: SerialDescriptor
      public open get() {
         return this.descriptor$delegate.value as SerialDescriptor
      }


   private final var overriddenDescriptor: SerialDescriptor?
   private final val values: Array<Any>

   public override fun toString(): String {
      return "kotlinx.serialization.internal.EnumSerializer<${this.descriptor.serialName}>"
   }

   public open fun serialize(encoder: Encoder, value: Any) {
      val index: Int = ArraysKt.indexOf(this.values, value)
      if (index == -1) {
         val var10002: StringBuilder = StringBuilder()
            .append(value)
            .append(" is not a valid enum ")
            .append(this.descriptor.serialName)
            .append(", must be one of ")
            val var10003: java.lang.String = Arrays.toString(this.values)
         throw SerializationException(var10002.append(var10003).toString())
      } else {
         encoder.encodeEnum(this.descriptor, index)
      }
   }

   public open fun deserialize(decoder: Decoder): Any {
      val index: Int = decoder.decodeEnum(this.descriptor)
      if (0 > index || index >= this.values.length) {
         throw SerializationException("$index is not among valid ${this.descriptor.serialName} enum values, values size is ${this.values.length}")
      } else {
         return this.values[index]
      }
   }

   private fun createUnmarkedDescriptor(serialName: String): SerialDescriptor {
      val d: EnumDescriptor = EnumDescriptor(serialName, this.values.length)

      for (`element$iv` in this.values) {
         PluginGeneratedSerialDescriptor.addElement$default(d, `element$iv`.name(), false, 2, null)
      }

      return d
   }

   internal constructor(serialName: String, vararg values: Any, descriptor: SerialDescriptor) : this(serialName, (T[])values) {
      this.overriddenDescriptor = descriptor
   }

   init {
      this.values = (T[])values
      this.descriptor$delegate = LazyKt.lazy(      // $VF: Compiled from Enums.kt
{
         var var10000: SerialDescriptor = EnumSerializer.this.overriddenDescriptor
         if (var10000 == null) {
            var10000 = EnumSerializer.this.createUnmarkedDescriptor(serialName)
         }

         return var10000
      } as () -> T)
   }
}
