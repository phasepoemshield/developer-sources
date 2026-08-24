package kotlin.collections

import java.io.Serializable
import java.util.RandomAccess
import kotlin.jvm.internal.CollectionToArray
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Collections.kt
internal object EmptyList : RandomAccess, java.util.List, Serializable, KMappedMarker {
   private const val serialVersionUID: Long = -7390468764508069838L

   override fun remove(element: Any): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun isEmpty(): Boolean {
      return true
   }

   public open operator fun get(index: Int): Nothing {
      throw IndexOutOfBoundsException("Empty list doesn't contain element at index $index.")
   }

   public open val size: Int
      public open get() {
         return 0
      }


   override fun retainAll(elements: java.util.Collection): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   fun add(element: Void): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun containsAll(elements: Collection<Nothing>): Boolean {
      return elements.isEmpty()
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun toArray(): Array<Any> {
      CollectionToArray.toArray(this)
   }

   private fun readResolve(): Any {
      return INSTANCE
   }

   public open fun indexOf(element: Nothing): Int {
      return -1
   }

   public open operator fun contains(element: Nothing): Boolean {
      return false
   }

   fun add(index: Int, element: Void) {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   fun remove(index: Int): Void {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun hashCode(): Int {
      return 1
   }

   override fun removeAll(elements: java.util.Collection): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun addAll(elements: java.util.Collection): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun iterator(): Iterator<Nothing> {
      return EmptyIterator.INSTANCE
   }

   public override fun subList(fromIndex: Int, toIndex: Int): List<Nothing> {
      if (fromIndex == 0 && toIndex == 0) {
         return this
      } else {
         throw IndexOutOfBoundsException("fromIndex: $fromIndex, toIndex: $toIndex")
      }
   }

   override fun addAll(index: Int, elements: java.util.Collection): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   fun set(index: Int, element: Void): Void {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun listIterator(index: Int): ListIterator<Nothing> {
      if (index != 0) {
         throw IndexOutOfBoundsException("Index: $index")
      } else {
         return EmptyIterator.INSTANCE
      }
   }

   public override fun listIterator(): ListIterator<Nothing> {
      return EmptyIterator.INSTANCE
   }

   public open fun lastIndexOf(element: Nothing): Int {
      return -1
   }

   override fun <T> toArray(array: Array<T>): Array<T> {
      CollectionToArray.toArray(this, array)
   }

   public override fun toString(): String {
      return "[]"
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is java.util.List && (other as java.util.List).isEmpty()
   }
}
