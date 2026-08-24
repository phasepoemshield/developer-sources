package kotlin

import java.util.Arrays
import java.util.NoSuchElementException
import kotlin.jvm.internal.CollectionToArray
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from ULongArray.kt
@JvmInline
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public value class ULongArray : KMappedMarker, java.util.Collection {
   @PublishedApi
   internal final val storage: LongArray

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is ULongArray && arg0 == (other as ULongArray).unbox_impl/* $VF was: unbox-impl */()
   }

   override fun removeAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   fun `add-VKZWuLQ`(element: Long): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun retainAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun <T> toArray(array: Array<T>): Array<T> {
      CollectionToArray.toArray(this as MutableCollection<*>, array)
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.storage)
   }

   @JvmStatic
   fun `equals-impl0`(p2: LongArray, p1: LongArray): Boolean {
      p1 == p2
   }

   @JvmStatic
   public open operator fun contains(element: ULong): Boolean {
      return ArraysKt.contains(arg0, element)
   }

   fun `contains-VKZWuLQ`(element: Long): Boolean {
      contains_VKZWuLQ/* $VF was: contains-VKZWuLQ */(this.storage, element)
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   @JvmStatic
   public operator fun set(index: Int, value: ULong) {
      arg0[index] = value
   }

   @PublishedApi
   @JvmStatic
   fun `constructor-impl`(storage: LongArray): LongArray {
      storage
   }

   override fun remove(element: Any): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.storage)
   }

   @JvmStatic
   public open operator fun iterator(): kotlin.collections.Iterator<ULong> {
      return ULongArray.Iterator(arg0)
   }

   override fun containsAll(elements: MutableCollection<Any>): Boolean {
      containsAll_impl/* $VF was: containsAll-impl */(this.storage, elements)
   }

   override fun isEmpty(): Boolean {
      isEmpty_impl/* $VF was: isEmpty-impl */(this.storage)
   }

   override fun iterator(): MutableIterator<ULong> {
      iterator_impl/* $VF was: iterator-impl */(this.storage)
   }

   override fun addAll(elements: MutableCollection<ULong>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return Arrays.hashCode(arg0)
   }

   override fun toArray(): Array<Any> {
      CollectionToArray.toArray(this as MutableCollection<*>)
   }

   @JvmStatic
   public operator fun get(index: Int): ULong {
      return ULong.constructor_impl/* $VF was: constructor-impl */(arg0[index])
   }

   fun getSize(): Int {
      size
   }

   @JvmStatic
   fun `constructor-impl`(size: Int): LongArray {
      constructor_impl/* $VF was: constructor-impl */(LongArray(size))
   }

   public open val size: Int
      public open get() {
         return arg0.length
      }


   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.storage, other)
   }

   @JvmStatic
   public open fun containsAll(elements: Collection<ULong>): Boolean {
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
            if (it !is ULong || !ArraysKt.contains(arg0, (it as ULong).unbox_impl/* $VF was: unbox-impl */())) {
               var10000 = false
               break
            }
         }
      }

      return var10000
   }

   @JvmStatic
   public open fun toString(): String {
      return "ULongArray(storage=${Arrays.toString(arg0)})"
   }

   @JvmStatic
   public open fun isEmpty(): Boolean {
      return arg0.length == 0
   }

   // $VF: Compiled from ULongArray.kt
   private class Iterator(array: LongArray) : KMappedMarker, java.util.Iterator {
      private final var index: Int
      private final val array: LongArray

      override fun remove() {
         throw UnsupportedOperationException("Operation is not supported for read-only collection")
      }

      init {
         this.array = array
      }

      public override operator fun hasNext(): Boolean {
         return this.index < this.array.length
      }

      public open operator fun next(): ULong {
         if (this.index < this.array.length) {
            return ULong.constructor_impl/* $VF was: constructor-impl */(this.array[this.index++])
         } else {
            throw NoSuchElementException(java.lang.String.valueOf(this.index))
         }
      }
   }
}
