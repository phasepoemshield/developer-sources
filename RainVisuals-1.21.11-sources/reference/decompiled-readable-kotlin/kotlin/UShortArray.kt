package kotlin

import java.util.Arrays
import java.util.NoSuchElementException
import kotlin.jvm.internal.CollectionToArray
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from UShortArray.kt
@JvmInline
@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
public value class UShortArray : java.util.Collection<UShort>, KMappedMarker {
   @PublishedApi
   internal final val storage: ShortArray

   override fun addAll(elements: MutableCollection<UShort>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   @PublishedApi
   @JvmStatic
   fun `constructor-impl`(storage: ShortArray): ShortArray {
      storage
   }

   fun `add-xj2QHRw`(element: Short): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun retainAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun toArray(): Array<Any> {
      CollectionToArray.toArray(this as MutableCollection<*>)
   }

   override fun containsAll(elements: MutableCollection<Any>): Boolean {
      containsAll_impl/* $VF was: containsAll-impl */(this.storage, elements)
   }

   public open val size: Int
      public open get() {
         return arg0.length
      }


   @JvmStatic
   fun `equals-impl0`(p2: ShortArray, p1: ShortArray): Boolean {
      p1 == p2
   }

   @JvmStatic
   fun `constructor-impl`(size: Int): ShortArray {
      constructor_impl/* $VF was: constructor-impl */(ShortArray(size))
   }

   @JvmStatic
   public operator fun get(index: Int): UShort {
      return UShort.constructor_impl/* $VF was: constructor-impl */(arg0[index])
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return Arrays.hashCode(arg0)
   }

   @JvmStatic
   public open fun toString(): String {
      return "UShortArray(storage=${Arrays.toString(arg0)})"
   }

   @JvmStatic
   public operator fun set(index: Int, value: UShort) {
      arg0[index] = value
   }

   @JvmStatic
   public open operator fun contains(element: UShort): Boolean {
      return ArraysKt.contains(arg0, element)
   }

   @JvmStatic
   public open operator fun iterator(): kotlin.collections.Iterator<UShort> {
      return UShortArray.Iterator(arg0)
   }

   fun `contains-xj2QHRw`(element: Short): Boolean {
      contains_xj2QHRw/* $VF was: contains-xj2QHRw */(this.storage, element)
   }

   override fun iterator(): MutableIterator<UShort> {
      iterator_impl/* $VF was: iterator-impl */(this.storage)
   }

   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.storage, other)
   }

   override fun remove(element: Any): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is UShortArray && arg0 == (other as UShortArray).unbox_impl/* $VF was: unbox-impl */()
   }

   @JvmStatic
   public open fun isEmpty(): Boolean {
      return arg0.length == 0
   }

   fun getSize(): Int {
      size
   }

   override fun isEmpty(): Boolean {
      isEmpty_impl/* $VF was: isEmpty-impl */(this.storage)
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.storage)
   }

   override fun <T> toArray(array: Array<T>): Array<T> {
      CollectionToArray.toArray(this as MutableCollection<*>, array)
   }

   @JvmStatic
   public open fun containsAll(elements: Collection<UShort>): Boolean {
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
            if (it !is UShort || !ArraysKt.contains(arg0, (it as UShort).unbox_impl/* $VF was: unbox-impl */())) {
               var10000 = false
               break
            }
         }
      }

      return var10000
   }

   override fun removeAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.storage)
   }

   // $VF: Compiled from UShortArray.kt
   private class Iterator(array: ShortArray) : java.util.Iterator<UShort>, KMappedMarker {
      private final val array: ShortArray
      private final var index: Int

      init {
         this.array = array
      }

      public open operator fun next(): UShort {
         if (this.index < this.array.length) {
            return UShort.constructor_impl/* $VF was: constructor-impl */(this.array[this.index++])
         } else {
            throw NoSuchElementException(java.lang.String.valueOf(this.index))
         }
      }

      public override operator fun hasNext(): Boolean {
         return this.index < this.array.length
      }

      override fun remove() {
         throw UnsupportedOperationException("Operation is not supported for read-only collection")
      }
   }
}
