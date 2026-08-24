package kotlinx.serialization.internal

import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptorsKt

// $VF: Compiled from Tuples.kt
@PublishedApi
internal class PairSerializer<K, V>(keySerializer: KSerializer<Any>, valueSerializer: KSerializer<Any>) : KeyValueSerializer(keySerializer, valueSerializer) {
   public open val descriptor: SerialDescriptor

   protected open fun toResult(key: Any, value: Any): Pair<Any, Any> {
      return key to value
   }

   protected open val key: Any
      protected open get() {
         return (K)`$this$key`.first
      }


   init {
      this.descriptor = SerialDescriptorsKt.buildClassSerialDescriptor("kotlin.Pair", arrayOfNulls(0),       // $VF: Compiled from Tuples.kt
{
         ClassSerialDescriptorBuilder.element$default(`$this$buildClassSerialDescriptor`, "first", keySerializer.descriptor, null, false, 12, null)
         ClassSerialDescriptorBuilder.element$default(`$this$buildClassSerialDescriptor`, "second", valueSerializer.descriptor, null, false, 12, null)
      } as (ClassSerialDescriptorBuilder?) -> Unit)
   }

   protected open val value: Any
      protected open get() {
         return (V)`$this$value`.second
      }

}
