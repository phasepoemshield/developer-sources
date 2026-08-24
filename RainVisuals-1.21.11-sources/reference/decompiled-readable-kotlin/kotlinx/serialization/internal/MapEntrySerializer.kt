package kotlinx.serialization.internal

import kotlin.collections.Map.Entry
import kotlin.jvm.internal.markers.KMappedMarker
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptorsKt
import kotlinx.serialization.descriptors.StructureKind

// $VF: Compiled from Tuples.kt
@PublishedApi
internal class MapEntrySerializer<K, V>(keySerializer: KSerializer<Any>, valueSerializer: KSerializer<Any>) : KeyValueSerializer(keySerializer, valueSerializer) {
   public open val descriptor: SerialDescriptor

   protected open fun toResult(key: Any, value: Any): Entry<Any, Any> {
      return MapEntrySerializer.MapEntry<>((K)key, (V)value)
   }

   protected open val key: Any
      protected open get() {
         return (K)`$this$key`.getKey()
      }


   protected open val value: Any
      protected open get() {
         return (V)`$this$value`.getValue()
      }


   init {
      this.descriptor = SerialDescriptorsKt.buildSerialDescriptor(
         "kotlin.collections.Map.Entry", StructureKind.MAP.INSTANCE, arrayOfNulls(0),       // $VF: Compiled from Tuples.kt
   {
            ClassSerialDescriptorBuilder.element$default(`$this$buildSerialDescriptor`, "key", keySerializer.descriptor, null, false, 12, null)
            ClassSerialDescriptorBuilder.element$default(`$this$buildSerialDescriptor`, "value", valueSerializer.descriptor, null, false, 12, null)
         } as (ClassSerialDescriptorBuilder?) -> Unit
      )
   }

   // $VF: Compiled from Tuples.kt
   private data class MapEntry<K, V>(key: Any, value: Any) : KMappedMarker, java.util.Map.Entry {
      public open val key: Any
      public open val value: Any

      public operator fun component2(): Any {
         return this.value
      }

      override fun setValue(newValue: V): V {
         throw UnsupportedOperationException("Operation is not supported for read-only collection")
      }

      public override fun toString(): String {
         return "MapEntry(key=${this.key}, value=${this.value})"
      }

      public fun copy(key: Any = this.key, value: Any = this.value): kotlinx.serialization.internal.MapEntrySerializer.MapEntry<Any, Any> {
         return MapEntrySerializer.MapEntry<>((K)key, (V)value)
      }

      init {
         this.key = (K)key
         this.value = (V)value
      }

      public override operator fun equals(other: Any?): Boolean {
         label28@
         if (this === other) {
            return true
         } else {
            return other is MapEntrySerializer.MapEntry
               && this.key == (other as MapEntrySerializer.MapEntry).key
               && this.value == (other as MapEntrySerializer.MapEntry).value
            }
      }

      public override fun hashCode(): Int {
         return (if (this.key == null) 0 else this.key.hashCode()) * 31 + (if (this.value == null) 0 else this.value.hashCode())
      }

      public operator fun component1(): Any {
         return this.key
      }
   }
}
