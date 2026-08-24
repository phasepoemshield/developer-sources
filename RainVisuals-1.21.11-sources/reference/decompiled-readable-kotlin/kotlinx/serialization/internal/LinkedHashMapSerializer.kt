package kotlinx.serialization.internal

import java.util.LinkedHashMap
import kotlin.collections.Map.Entry
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from CollectionSerializers.kt
@PublishedApi
internal class LinkedHashMapSerializer<K, V>(kSerializer: KSerializer<Any>, vSerializer: KSerializer<Any>) : MapLikeSerializer(kSerializer, vSerializer) {
   public open val descriptor: SerialDescriptor

   protected open fun Map<Any, Any>.collectionIterator(): Iterator<Entry<Any, Any>> {
      return `$this$collectionIterator`.entrySet().iterator()
   }

   protected open fun LinkedHashMap<Any, Any>.toResult(): Map<Any, Any> {
      return `$this$toResult`
   }

   protected open fun LinkedHashMap<Any, Any>.checkCapacity(size: Int) {
   }

   protected open fun Map<Any, Any>.collectionSize(): Int {
      return `$this$collectionSize`.size()
   }

   protected open fun Map<Any, Any>.toBuilder(): LinkedHashMap<Any, Any> {
      var var10000: LinkedHashMap = `$this$toBuilder` as? LinkedHashMap
      if ((`$this$toBuilder` as? LinkedHashMap) == null) {
         var10000 = LinkedHashMap(`$this$toBuilder`)
      }

      return var10000
   }

   protected open fun LinkedHashMap<Any, Any>.builderSize(): Int {
      return `$this$builderSize`.size() * 2
   }

   protected open fun LinkedHashMap<Any, Any>.insertKeyValuePair(index: Int, key: Any, value: Any) {
      `$this$insertKeyValuePair`.put(key, value)
   }

   init {
      this.descriptor = LinkedHashMapClassDesc(kSerializer.descriptor, vSerializer.descriptor)
   }

   protected open fun builder(): LinkedHashMap<Any, Any> {
      return LinkedHashMap<>()
   }
}
