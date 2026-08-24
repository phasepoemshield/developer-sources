package kotlin

import java.util.Arrays
import java.util.NoSuchElementException
import kotlin.jvm.internal.CollectionToArray
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from UByteArray.kt
@JvmInline
@ExperimentalUnsignedTypes
@SinceKotlin(version = "1.3")
public value class UByteArray : KMappedMarker, java.util.Collection {
   @PublishedApi
   internal final val storage: ByteArray

   @JvmStatic
   public open fun containsAll(elements: Collection<UByte>): Boolean {
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
            if (it !is UByte || !ArraysKt.contains(arg0, (it as UByte).unbox_impl/* $VF was: unbox-impl */())) {
               var10000 = false
               break
            }
         }
      }

      return var10000
   }

   override fun <T> toArray(array: Array<T>): Array<T> {
      CollectionToArray.toArray(this as MutableCollection<*>, array)
   }

   override fun addAll(elements: MutableCollection<UByte>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun toArray(): Array<Any> {
      CollectionToArray.toArray(this as MutableCollection<*>)
   }

   fun getSize(): Int {
      size
   }

   override fun isEmpty(): Boolean {
      isEmpty_impl/* $VF was: isEmpty-impl */(this.storage)
   }

   @JvmStatic
   public open operator fun iterator(): kotlin.collections.Iterator<UByte> {
      return UByteArray.Iterator(arg0)
   }

   override fun clear() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public open val size: Int
      public open get() {
         return arg0.length
      }


   override fun containsAll(elements: MutableCollection<Any>): Boolean {
      containsAll_impl/* $VF was: containsAll-impl */(this.storage, elements)
   }

   @JvmStatic
   public operator fun get(index: Int): UByte {
      return UByte.constructor_impl/* $VF was: constructor-impl */(arg0[index])
   }

   override fun removeAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun iterator(): MutableIterator<UByte> {
      iterator_impl/* $VF was: iterator-impl */(this.storage)
   }

   fun `add-7apg3OU`(element: Byte): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   @JvmStatic
   public open fun toString(): String {
      return "UByteArray(storage=${Arrays.toString(arg0)})"
   }

   @JvmStatic
   fun `constructor-impl`(size: Int): ByteArray {
      constructor_impl/* $VF was: constructor-impl */(ByteArray(size))
   }

   override fun equals(other: Any): Boolean {
      equals_impl/* $VF was: equals-impl */(this.storage, other)
   }

   @PublishedApi
   @JvmStatic
   fun `constructor-impl`(storage: ByteArray): ByteArray {
      storage
   }

   @JvmStatic
   public open operator fun equals(other: Any?): Boolean {
      return other is UByteArray && arg0 == (other as UByteArray).unbox_impl/* $VF was: unbox-impl */()
   }

   @JvmStatic
   public open operator fun contains(element: UByte): Boolean {
      return ArraysKt.contains(arg0, element)
   }

   @JvmStatic
   public open fun isEmpty(): Boolean {
      return arg0.length == 0
   }

   @JvmStatic
   public operator fun set(index: Int, value: UByte) {
      arg0[index] = value
   }

   fun `contains-7apg3OU`(element: Byte): Boolean {
      contains_7apg3OU/* $VF was: contains-7apg3OU */(this.storage, element)
   }

   override fun toString(): java.lang.String {
      toString_impl/* $VF was: toString-impl */(this.storage)
   }

   override fun remove(element: Any): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun hashCode(): Int {
      hashCode_impl/* $VF was: hashCode-impl */(this.storage)
   }

   @JvmStatic
   public open fun hashCode(): Int {
      return Arrays.hashCode(arg0)
   }

   override fun retainAll(elements: MutableCollection<Any>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   @JvmStatic
   fun `equals-impl0`(p1: ByteArray, p2: ByteArray): Boolean {
      p1 == p2
   }

   // $VF: Compiled from UByteArray.kt
   private class Iterator(array: ByteArray) : java.util.Iterator<UByte>, KMappedMarker {
      private final var index: Int
      private final val array: ByteArray

      init {
         this.array = array
      }

      public override operator fun hasNext(): Boolean {
         return this.index < this.array.length
      }

      public open operator fun next(): UByte {
         if (this.index < this.array.length) {
            return UByte.constructor_impl/* $VF was: constructor-impl */(this.array[this.index++])
         } else {
            throw NoSuchElementException(java.lang.String.valueOf(this.index))
         }
      }

      override fun remove() {
         throw UnsupportedOperationException("Operation is not supported for read-only collection")
      }
   }
}
