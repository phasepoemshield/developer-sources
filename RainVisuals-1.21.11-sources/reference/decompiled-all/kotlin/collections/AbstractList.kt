package kotlin.collections

import java.util.NoSuchElementException
import java.util.RandomAccess
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from AbstractList.kt
@SinceKotlin(version = "1.1")
public abstract class AbstractList<E> : AbstractCollection<E>, java.util.List<E>, KMappedMarker {
   public override fun listIterator(): ListIterator<Any> {
      return AbstractList.ListIteratorImpl(0)
   }

   public abstract override operator fun get(index: Int): Any {
   }

   public override fun listIterator(index: Int): ListIterator<Any> {
      return AbstractList.ListIteratorImpl(index)
   }

   public override fun lastIndexOf(element: Any): Int {
      val `iterator$iv`: java.util.ListIterator = this.listIterator(this.size())

      var var10000: Int
      while (true) {
         if (`iterator$iv`.hasPrevious()) {
            if (!(`iterator$iv`.previous() == element)) {
               continue
            }

            var10000 = `iterator$iv`.nextIndex()
            break
         }

         var10000 = -1
         break
      }

      return var10000
   }

   public override fun hashCode(): Int {
      return Companion.orderedHashCode$kotlin_stdlib(this)
   }

   override fun remove(index: Int): E {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public abstract val size: Int

   open fun AbstractList() {
   }

   public override fun indexOf(element: Any): Int {
      val `$this$indexOfFirst$iv`: java.util.List = this
      var `index$iv`: Int = 0
      val var5: java.util.Iterator = `$this$indexOfFirst$iv`.iterator()

      var var10000: Int
      while (true) {
         if (!var5.hasNext()) {
            var10000 = -1
            break
         }

         if (var5.next() == element) {
            var10000 = `index$iv`
            break
         }

         `index$iv`++
      }

      return var10000
   }

   override fun add(element: Int, index: E) {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override fun subList(fromIndex: Int, toIndex: Int): List<Any> {
      return AbstractList.SubList<>(this, fromIndex, toIndex)
   }

   public override operator fun iterator(): Iterator<Any> {
      return AbstractList.IteratorImpl()
   }

   override fun addAll(index: Int, elements: MutableCollection<E>): Boolean {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   override fun set(index: Int, element: E): E {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   public override operator fun equals(other: Any?): Boolean {
      return other === this || other is java.util.List && Companion.orderedEquals$kotlin_stdlib(this, other as MutableCollection<*>)
   }

   // $VF: Compiled from AbstractList.kt
   internal companion object {
      private const val maxArraySize: Int = 2147483639

      internal fun orderedHashCode(c: Collection<*>): Int {
         var hashCode: Int = 1

         for (e in c) {
            hashCode = 31 * hashCode + (if (e != null) e.hashCode() else 0)
         }

         return hashCode
      }

      internal fun orderedEquals(c: Collection<*>, other: Collection<*>): Boolean {
         if (c.size() != other.size()) {
            return false
         } else {
            val otherIterator: java.util.Iterator = other.iterator()

            for (elem in c) {
               if (!(elem == otherIterator.next())) {
                  return false
               }
            }

            return true
         }
      }

      internal fun checkPositionIndex(index: Int, size: Int) {
         if (index < 0 || index > size) {
            throw IndexOutOfBoundsException("index: $index, size: $size")
         }
      }

      internal fun checkRangeIndexes(fromIndex: Int, toIndex: Int, size: Int) {
         if (fromIndex < 0 || toIndex > size) {
            throw IndexOutOfBoundsException("fromIndex: $fromIndex, toIndex: $toIndex, size: $size")
         } else if (fromIndex > toIndex) {
            throw IllegalArgumentException("fromIndex: $fromIndex > toIndex: $toIndex")
         }
      }

      internal fun checkBoundsIndexes(startIndex: Int, endIndex: Int, size: Int) {
         if (startIndex < 0 || endIndex > size) {
            throw IndexOutOfBoundsException("startIndex: $startIndex, endIndex: $endIndex, size: $size")
         } else if (startIndex > endIndex) {
            throw IllegalArgumentException("startIndex: $startIndex > endIndex: $endIndex")
         }
      }

      internal fun checkElementIndex(index: Int, size: Int) {
         if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException("index: $index, size: $size")
         }
      }

      internal fun newCapacity(oldCapacity: Int, minCapacity: Int): Int {
         var newCapacity: Int = oldCapacity + (oldCapacity shr 1)
         if (oldCapacity + (oldCapacity shr 1) - minCapacity < 0) {
            newCapacity = minCapacity
         }

         if (newCapacity - 2147483639 > 0) {
            newCapacity = if (minCapacity > 2147483639) Integer.MAX_VALUE else 2147483639
         }

         return newCapacity
      }
   }

   // $VF: Compiled from AbstractList.kt
   private open inner class IteratorImpl : java.util.Iterator<E>, KMappedMarker {
      protected final var index: Int

      override fun remove() {
         throw UnsupportedOperationException("Operation is not supported for read-only collection")
      }

      public override operator fun next(): Any {
         if (!this.hasNext()) {
            throw NoSuchElementException()
         } else {
            return AbstractList.this.get(this.index++)
         }
      }

      public override operator fun hasNext(): Boolean {
         return this.index < AbstractList.this.size()
      }
   }

   // $VF: Compiled from AbstractList.kt
   private open inner class ListIteratorImpl(index: Int) : AbstractList<E>.IteratorImpl, KMappedMarker, java.util.ListIterator {
      override fun add(element: E) {
         throw UnsupportedOperationException("Operation is not supported for read-only collection")
      }

      public override fun nextIndex(): Int {
         return this.getIndex()
      }

      public override fun hasPrevious(): Boolean {
         return this.getIndex() > 0
      }

      init {
         AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, AbstractList.this.size())
         this.setIndex(index)
      }

      public override fun previousIndex(): Int {
         return this.getIndex() - 1
      }

      public override fun previous(): Any {
         if (!this.hasPrevious()) {
            throw NoSuchElementException()
         } else {
            val var10000: AbstractList = AbstractList.this
            this.setIndex(this.getIndex() + -1)
            return (E)var10000.get(this.getIndex())
         }
      }

      override fun set(element: E) {
         throw UnsupportedOperationException("Operation is not supported for read-only collection")
      }
   }

   // $VF: Compiled from AbstractList.kt
   private class SubList<E>(list: AbstractList<Any>, fromIndex: Int, toIndex: Int) : AbstractList<E>, RandomAccess {
      private final val list: AbstractList<Any>
      private final val fromIndex: Int
      private final var _size: Int

      public open val size: Int
         public open get() {
            return this._size
         }


      public override operator fun get(index: Int): Any {
         AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this._size)
         return this.list.get(this.fromIndex + index)
      }

      init {
         this.list = list
         this.fromIndex = fromIndex
         AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(this.fromIndex, toIndex, this.list.size())
         this._size = toIndex - this.fromIndex
      }
   }
}
