package kotlin.collections.builders

import java.io.NotSerializableException
import java.io.Serializable
import java.util.Arrays
import java.util.ConcurrentModificationException
import java.util.NoSuchElementException
import java.util.RandomAccess
import kotlin.jvm.internal.markers.KMutableList
import kotlin.jvm.internal.markers.KMutableListIterator

// $VF: Compiled from ListBuilder.kt
internal class ListBuilder<E> private constructor(vararg array: Any,
      offset: Int,
      length: Int,
      isReadOnly: Boolean,
      backing: ListBuilder<Any>?,
      root: ListBuilder<Any>?
   )
   : AbstractMutableList<E>,
   RandomAccess,
   KMutableList,
   Serializable,
   java.util.List {
   private final val backing: ListBuilder<Any>?
   private final var length: Int
   private final var array: Array<Any>
   private final var offset: Int
   private final val root: ListBuilder<Any>?
   private final var isReadOnly: Boolean

   init {
      this.array = (E[])array
      this.offset = offset
      this.length = length
      this.isReadOnly = isReadOnly
      this.backing = backing
      this.root = root
      if (this.backing != null) {
         this.modCount = this.backing.modCount
      }
   }

   public override operator fun get(index: Int): Any {
      this.checkForComodification()
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length)
      return this.array[this.offset + index]
   }

   private fun retainOrRemoveAllInternal(rangeOffset: Int, rangeLength: Int, elements: Collection<Any>, retain: Boolean): Int {
      val var10000: Int
      if (this.backing != null) {
         var10000 = this.backing.retainOrRemoveAllInternal(rangeOffset, rangeLength, elements, retain)
      } else {
         var i: Int = 0
         var j: Int = 0

         while (i < rangeLength) {
            if (elements.contains(this.array[rangeOffset + i]) == retain) {
               this.array[rangeOffset + j++] = this.array[rangeOffset + i++]
            } else {
               i++
            }
         }

         val removed: Int = rangeLength - j
         ArraysKt.copyInto((E[])this.array, (E[])this.array, rangeOffset + j, rangeOffset + rangeLength, this.length)
         ListBuilderKt.resetRange(this.array, this.length - removed, this.length)
         var10000 = removed
      }

      if (var10000 > 0) {
         this.registerModification()
      }

      this.length -= var10000
      return var10000
   }

   private fun removeAtInternal(i: Int): Any {
      this.registerModification()
      if (this.backing != null) {
         val var7: Any = this.backing.removeAtInternal(i)
         this.length += -1
         return (E)var7
      } else {
         val old: Any = this.array[i]
         ArraysKt.copyInto((E[])this.array, (E[])this.array, i, i + 1, this.offset + this.length)
         ListBuilderKt.resetAt(this.array, this.offset + this.length - 1)
         this.length += -1
         return (E)old
      }
   }

   public constructor(initialCapacity: Int) : this((E[])ListBuilderKt.arrayOfUninitializedElements(initialCapacity), 0, 0, false, null, null)
   public override fun add(index: Int, element: Any) {
      this.checkIsMutable()
      this.checkForComodification()
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length)
      this.addAtInternal(this.offset + index, (E)element)
   }

   public override fun removeAt(index: Int): Any {
      this.checkIsMutable()
      this.checkForComodification()
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length)
      return this.removeAtInternal(this.offset + index)
   }

   public override fun addAll(elements: Collection<Any>): Boolean {
      this.checkIsMutable()
      this.checkForComodification()
      val n: Int = elements.size()
      this.addAllInternal(this.offset + this.length, elements, n)
      return n > 0
   }

   public override fun hashCode(): Int {
      this.checkForComodification()
      return ListBuilderKt.access$subarrayContentHashCode(this.array, this.offset, this.length)
   }

   public override fun clear() {
      this.checkIsMutable()
      this.checkForComodification()
      this.removeRangeInternal(this.offset, this.length)
   }

   public override fun <T> toArray(destination: Array<Any>): Array<Any> {
      this.checkForComodification()
      if (destination.length < this.length) {
         val var10000: Array<Any> = Arrays.copyOfRange(this.array, this.offset, this.offset + this.length, (Class<? extends Object[]>)destination.getClass())
         return (T[])var10000
      } else {
         ArraysKt.copyInto((E[])this.array, (E[])destination, 0, this.offset, this.offset + this.length)
         return (T[])CollectionsKt.terminateCollectionToArray(this.length, destination)
      }
   }

   public override operator fun set(index: Int, element: Any): Any {
      this.checkIsMutable()
      this.checkForComodification()
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.length)
      val old: Any = this.array[this.offset + index]
      this.array[this.offset + index] = (E)element
      return (E)old
   }

   public constructor() : this(10)
   private fun writeReplace(): Any {
      if (this.isEffectivelyReadOnly) {
         return SerializedCollection(this, 0)
      } else {
         throw NotSerializableException("The list cannot be serialized while it is being built.")
      }
   }

   public override fun subList(fromIndex: Int, toIndex: Int): MutableList<Any> {
      AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(fromIndex, toIndex, this.length)
      val var10000: ListBuilder = ListBuilder
      val var10003: Int = this.offset + fromIndex
      val var10004: Int = toIndex - fromIndex
      var var10007: ListBuilder = this.root
      if (this.root == null) {
         var10007 = this
      }

      var10000./* $VF: Unable to resugar constructor */<init>(this.array, var10003, var10004, this.isReadOnly, this, var10007)
      return var10000
   }

   public override fun remove(element: Any): Boolean {
      this.checkIsMutable()
      this.checkForComodification()
      val i: Int = this.indexOf(element)
      if (i >= 0) {
         this.remove(i)
      }

      return i >= 0
   }

   private fun ensureCapacityInternal(minCapacity: Int) {
      if (minCapacity < 0) {
         throw OutOfMemoryError()
      } else {
         if (minCapacity > this.array.length) {
            this.array = ListBuilderKt.copyOfUninitializedElements(this.array, AbstractList.Companion.newCapacity$kotlin_stdlib(this.array.length, minCapacity))
         }
      }
   }

   private fun insertAtInternal(i: Int, n: Int) {
      this.ensureExtraCapacity(n)
      ArraysKt.copyInto((E[])this.array, (E[])this.array, i + n, i, this.offset + this.length)
      this.length += n
   }

   public override fun toString(): String {
      this.checkForComodification()
      return ListBuilderKt.access$subarrayContentToString(this.array, this.offset, this.length, this)
   }

   public override fun addAll(index: Int, elements: Collection<Any>): Boolean {
      this.checkIsMutable()
      this.checkForComodification()
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length)
      val n: Int = elements.size()
      this.addAllInternal(this.offset + index, elements, n)
      return n > 0
   }

   public override fun listIterator(index: Int): MutableListIterator<Any> {
      this.checkForComodification()
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.length)
      return ListBuilder.Itr<>(this, index)
   }

   private fun registerModification() {
      this.modCount++
   }

   private fun checkForComodification() {
      if (this.root != null && this.root.modCount != this.modCount) {
         throw ConcurrentModificationException()
      }
   }

   public override fun toArray(): Array<Any?> {
      this.checkForComodification()
      return ArraysKt.copyOfRange((Object[])this.array, this.offset, this.offset + this.length)
   }

   private fun removeRangeInternal(rangeOffset: Int, rangeLength: Int) {
      if (rangeLength > 0) {
         this.registerModification()
      }

      if (this.backing != null) {
         this.backing.removeRangeInternal(rangeOffset, rangeLength)
      } else {
         ArraysKt.copyInto((E[])this.array, (E[])this.array, rangeOffset, rangeOffset + rangeLength, this.length)
         ListBuilderKt.resetRange(this.array, this.length - rangeLength, this.length)
      }

      this.length -= rangeLength
   }

   public override fun isEmpty(): Boolean {
      this.checkForComodification()
      return this.length == 0
   }

   private fun addAllInternal(i: Int, elements: Collection<Any>, n: Int) {
      this.registerModification()
      if (this.backing != null) {
         this.backing.addAllInternal(i, elements, n)
         this.array = this.backing.array
         this.length += n
      } else {
         this.insertAtInternal(i, n)
         var j: Int = 0
         val it: java.util.Iterator = elements.iterator()

         while (j < n) {
            this.array[i + j] = (E)it.next()
            j++
         }
      }
   }

   public override operator fun iterator(): MutableIterator<Any> {
      return this.listIterator(0)
   }

   private fun contentEquals(other: List<*>): Boolean {
      return ListBuilderKt.access$subarrayContentEquals(this.array, this.offset, this.length, other)
   }

   public override fun add(element: Any): Boolean {
      this.checkIsMutable()
      this.checkForComodification()
      this.addAtInternal(this.offset + this.length, (E)element)
      return true
   }

   private fun addAtInternal(i: Int, element: Any) {
      this.registerModification()
      if (this.backing != null) {
         this.backing.addAtInternal(i, (E)element)
         this.array = this.backing.array
         val var3: Int = this.length++
      } else {
         this.insertAtInternal(i, 1)
         this.array[i] = (E)element
      }
   }

   public override operator fun equals(other: Any?): Boolean {
      this.checkForComodification()
      return other === this || other is java.util.List && this.contentEquals(other as MutableList<*>)
   }

   public override fun retainAll(elements: Collection<Any>): Boolean {
      this.checkIsMutable()
      this.checkForComodification()
      return this.retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0
   }

   public override fun removeAll(elements: Collection<Any>): Boolean {
      this.checkIsMutable()
      this.checkForComodification()
      return this.retainOrRemoveAllInternal(this.offset, this.length, elements, false) > 0
   }

   private fun ensureExtraCapacity(n: Int) {
      this.ensureCapacityInternal(this.length + n)
   }

   public open val size: Int
      public open get() {
         this.checkForComodification()
         return this.length
      }


   public override fun listIterator(): MutableListIterator<Any> {
      return this.listIterator(0)
   }

   public override fun indexOf(element: Any): Int {
      this.checkForComodification()
            return -1
   }

   @JvmStatic
   fun {
      val var0: ListBuilder = ListBuilder(0)
      var0.isReadOnly = true
      Empty = var0
   }

   private final val isEffectivelyReadOnly: Boolean
      private final get() {
         return this.isReadOnly || this.root != null && this.root.isReadOnly
      }


   public fun build(): List<Any> {
      if (this.backing != null) {
         throw IllegalStateException()
      } else {
         this.checkIsMutable()
         this.isReadOnly = true
         return if (this.length > 0) this else Empty
      }
   }

   private fun checkIsMutable() {
      if (this.isEffectivelyReadOnly) {
         throw UnsupportedOperationException()
      }
   }

   public override fun lastIndexOf(element: Any): Int {
      this.checkForComodification()

      // $VF: Unable to resugar Kotlin loop from Java for loop
      var i: Int = this.length - 1
      while (true) {
         if (i >= 0) break
         if (this.array[this.offset + i] == element) {
            return i
         }

         i--
      }

      return -1
   }

   // $VF: Compiled from ListBuilder.kt
   private companion object {
      private final val Empty: ListBuilder<Nothing>
   }

   // $VF: Compiled from ListBuilder.kt
   private class Itr<E> : java.util.ListIterator<E>, KMutableListIterator {
      private final var lastIndex: Int
      private final val list: ListBuilder<Any>
      private final var index: Int
      private final var expectedModCount: Int

      public override operator fun hasNext(): Boolean {
         return this.index < this.list.length
      }

      public override fun remove() {
         this.checkForComodification()
         if (this.lastIndex == -1) {
            throw IllegalStateException("Call next() or previous() before removing element from the iterator.".toString())
         } else {
            this.list.remove(this.lastIndex)
            this.index = this.lastIndex
            this.lastIndex = -1
            this.expectedModCount = this.list.modCount
         }
      }

      public override fun add(element: Any) {
         this.checkForComodification()
         this.list.add(this.index++, (E)element)
         this.lastIndex = -1
         this.expectedModCount = this.list.modCount
      }

      public constructor(list: ListBuilder<Any>, index: Int)  {
         this.list = list
         this.index = index
         this.lastIndex = -1
         this.expectedModCount = list.modCount
      }

      public override fun hasPrevious(): Boolean {
         return this.index > 0
      }

      public override fun set(element: Any) {
         this.checkForComodification()
         if (this.lastIndex == -1) {
            throw IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString())
         } else {
            this.list.set(this.lastIndex, (E)element)
         }
      }

      public override fun previousIndex(): Int {
         return this.index - 1
      }

      private fun checkForComodification() {
         if (this.list.modCount != this.expectedModCount) {
            throw ConcurrentModificationException()
         }
      }

      public override operator fun next(): Any {
         this.checkForComodification()
         if (this.index >= this.list.length) {
            throw NoSuchElementException()
         } else {
            this.lastIndex = this.index++
            return this.list.array[this.list.offset + this.lastIndex]
         }
      }

      public override fun nextIndex(): Int {
         return this.index
      }

      public override fun previous(): Any {
         this.checkForComodification()
         if (this.index <= 0) {
            throw NoSuchElementException()
         } else {
            this.index += -1
            this.lastIndex = this.index
            return this.list.array[this.list.offset + this.lastIndex]
         }
      }
   }
}
