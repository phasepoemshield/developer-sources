package kotlin.collections.builders

import java.util.Map.Entry

// $VF: Compiled from MapBuilder.kt
internal abstract class AbstractMapBuilderEntrySet<E extends Entry<? extends K, ? extends V>, K, V> : AbstractMutableSet<E> {
   public operator fun contains(element: Any): Boolean {
      return this.containsEntry(element)
   }

   public abstract fun containsEntry(element: kotlin.collections.Map.Entry<Any, Any>): Boolean {
   }
}
