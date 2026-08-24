package kotlin

import java.util.Arrays
import java.util.NoSuchElementException
import kotlin.jvm.internal.CollectionToArray
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from UIntArray.kt
@JvmInline
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public value class UIntArray : java.util.Collection<UInt>, KMappedMarker {
   @PublishedApi
   internal final val storage: IntArray

   @JvmStatic
   public operator fun get(index: Int): UInt {
      return UInt.constructor_impl/* $VF was: constructor-impl */(arg0[index])
   }

   @JvmStatic
   public open operator fun contains(element: UInt): Boolean {
      return ArraysKt.contains(arg0, element)
   }

   override fun iterator(): MutableIterator<UInt> {
      iterator_impl/* $VF was: iterator-impl */(this.storage)
   }

   override fun toArray(): Array<Any> {
      CollectionToArray.toArray(this as MutableCollection<*>)
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is UIntArray && arg0 == (other as UIntArray).unbox_impl/* $VF was: unbox-impl */()
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.storage)
   }

   override fun containsAll(elements: MutableCollection<Any>): Boolean {
      containsAll_impl/* $VF was: containsAll-impl */(this.storage, elements)
   }

   @PublishedApi
   @JvmStatic
   fun `constructor-impl`(storage: IntArray): IntArray {
      storage
   }

   override fun addAll(elements: MutableCollection<UInt>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun retainAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   @JvmStatic
   public open fun containsAll(elements: Collection<UInt>): Boolean {
      val `$this$all$iv`: java.lang.Iterable = elements
      var var10000: Boolean
      if ((elements as java.util.Collection).isEmpty()) {
         var10000 = true
      } else {
         val var4: java.util.Iterator = `$this$all$iv`.iterator()

         while (true) {
            if (!var4.hasNext()) {
               var10000 = true
               break
            }

            val it: Any = var4.next()
            if (it !is UInt || !ArraysKt.contains(arg0, (it as UInt).unbox_impl/* $VF was: unbox-impl */())) {
               var10000 = false
               break
            }
         }
      }

      return var10000
   }

   @JvmStatic
   public operator fun set(index: Int, value: UInt) {
      arg0[index] = value
   }

   public open val size: Int
      public open get() {
         return arg0.length
      }


   @JvmStatic
   fun `constructor-impl`(size: Int): IntArray {
      constructor_impl/* $VF was: constructor-impl */(IntArray(size))
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return Arrays.hashCode(arg0)
   }

   override fun remove(element: Any): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun isEmpty(): Boolean {
      isEmpty_impl/* $VF was: isEmpty-impl */(this.storage)
   }

   fun `add-WZ4Q5Ns`(element: Int): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.storage, other)
   }

   @JvmStatic
   fun `equals-impl0`(p2: IntArray, p1: IntArray): Boolean {
      p1 == p2
   }

   fun `contains-WZ4Q5Ns`(element: Int): Boolean {
      contains_WZ4Q5Ns/* $VF was: contains-WZ4Q5Ns */(this.storage, element)
   }

   fun getSize(): Int {
      size
   }

   @JvmStatic
   public open fun toString(): String {
      return "UIntArray(storage=${Arrays.toString(arg0)})"
   }

   override fun removeAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun <T> toArray(array: Array<T>): Array<T> {
      CollectionToArray.toArray(this as MutableCollection<*>, array)
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   @JvmStatic
   public open fun isEmpty(): Boolean {
      return arg0.length == 0
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.storage)
   }

   @JvmStatic
   public open operator fun iterator(): kotlin.collections.Iterator<UInt> {
      return UIntArray.Iterator(arg0)
   }

   // $VF: Compiled from UIntArray.kt
   private class Iterator(array: IntArray) : java.util.Iterator<UInt>, KMappedMarker {
      private final var index: Int
      private final val array: IntArray

      public override operator fun hasNext(): Boolean {
         return this.index < this.array.length
      }

      override fun remove() {
         throw UnsupportedOperationException("Operation is not supported for read-only collection")
      }

      public open operator fun next(): UInt {
         if (this.index < this.array.length) {
            return UInt.constructor_impl/* $VF was: constructor-impl */(this.array[this.index++])
         } else {
            throw NoSuchElementException(java.lang.String.valueOf(this.index))
         }
      }

      init {
         this.array = array
      }
   }
}
