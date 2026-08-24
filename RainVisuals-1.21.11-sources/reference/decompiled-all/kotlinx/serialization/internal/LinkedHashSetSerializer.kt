package kotlinx.serialization.internal

import java.util.LinkedHashSet
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor

// $VF: Compiled from CollectionSerializers.kt
@PublishedApi
internal class LinkedHashSetSerializer<E>(eSerializer: KSerializer<Any>) : CollectionSerializer(eSerializer) {
   public open val descriptor: SerialDescriptor

   protected open fun LinkedHashSet<Any>.checkCapacity(size: Int) {
   }

   protected open fun builder(): LinkedHashSet<Any> {
      return LinkedHashSet<>()
   }

   init {
      this.descriptor = LinkedHashSetClassDesc(eSerializer.descriptor)
   }

   protected open fun LinkedHashSet<Any>.insert(index: Int, element: Any) {
      `$this$insert`.add(element)
   }

   protected open fun Set<Any>.toBuilder(): LinkedHashSet<Any> {
      var var10000: LinkedHashSet = `$this$toBuilder` as? LinkedHashSet
      if ((`$this$toBuilder` as? LinkedHashSet) == null) {
         var10000 = LinkedHashSet<>(`$this$toBuilder`)
      }

      return var10000
   }

   protected open fun LinkedHashSet<Any>.toResult(): Set<Any> {
      return `$this$toResult`
   }

   protected open fun LinkedHashSet<Any>.builderSize(): Int {
      return `$this$builderSize`.size()
   }
}
