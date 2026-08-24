package kotlin.collections

import java.io.Serializable
import kotlin.jvm.internal.CollectionToArray
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Sets.kt
internal object EmptySet : Serializable, java.util.Set, KMappedMarker {
   private const val serialVersionUID: Long = 3406603774387020532L

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun toString(): String {
      return "[]"
   }

   public override fun containsAll(elements: Collection<Nothing>): Boolean {
      return elements.isEmpty()
   }

   override fun remove(element: Any): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is java.util.Set && (other as java.util.Set).isEmpty()
   }

   override fun addAll(elements: java.util.Collection): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun isEmpty(): Boolean {
      return true
   }

   override fun <T> toArray(array: Array<T>): Array<T> {
      CollectionToArray.toArray(this, array)
   }

   override fun toArray(): Array<Any> {
      CollectionToArray.toArray(this)
   }

   public override operator fun iterator(): Iterator<Nothing> {
      return EmptyIterator.INSTANCE
   }

   public override fun hashCode(): Int {
      return 0
   }

   override fun retainAll(elements: java.util.Collection): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   private fun readResolve(): Any {
      return INSTANCE
   }

   fun add(element: Void): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public open operator fun contains(element: Nothing): Boolean {
      return false
   }

   public open val size: Int
      public open get() {
         return 0
      }


   override fun removeAll(elements: java.util.Collection): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
