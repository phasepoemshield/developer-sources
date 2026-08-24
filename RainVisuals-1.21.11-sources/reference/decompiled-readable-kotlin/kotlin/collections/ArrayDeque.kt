package kotlin.collections

import java.util.NoSuchElementException
import kotlin.internal.InlineOnly

// $VF: Compiled from ArrayDeque.kt
@SinceKotlin(version = "1.4")
@WasExperimental(markerClass = [ExperimentalStdlibApi::class])
public class ArrayDeque<E> : AbstractMutableList<E> {
   public open var size: Int
      private set

   private final var elementData: Array<Any?>
   private final var head: Int

   private fun copyCollectionElements(internalIndex: Int, elements: Collection<Any>) {
      val iterator: java.util.Iterator = elements.iterator()
      var index: Int = internalIndex

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var5: Int = this.elementData.length
      while (true) {
         if (index < var5 && iterator.hasNext()) break
         this.elementData[index] = iterator.next()

         index++
      }

      index = 0

      // $VF: Unable to resugar Kotlin loop from Java for loop
      val var7: Int = this.head
      while (true) {
         if (index < var7 && iterator.hasNext()) break
         this.elementData[index] = iterator.next()

         index++
      }

      this.size = this.size() + elements.size()
   }

   public override fun lastIndexOf(element: Any): Int {
      val tail: Int = this.positiveMod(this.head + this.size())
      if (this.head < tail) {
         var index: Int = tail + -1
         val var4: Int = this.head
         if (this.head <= index) {
            while (true) {
               if (element == this.elementData[index]) {
                  return index - this.head
               }

               if (index == var4) {
                  break
               }

               index--
            }
         }
      } else if (this.head > tail) {
         for (var5 in tail + -1 downTo 0) {
            if (element == this.elementData[var5]) {
               return var5 + this.elementData.length - this.head
            }
         }

         var var6: Int = ArraysKt.getLastIndex(this.elementData)
         val var7: Int = this.head
         if (this.head <= var6) {
            while (true) {
               if (element == this.elementData[var6]) {
                  return var6 - this.head
               }

               if (var6 == var7) {
                  break
               }

               var6--
            }
         }
      }

      return -1
   }

   public fun last(): Any {
      if (this.isEmpty()) {
         throw NoSuchElementException("ArrayDeque is empty.")
      } else {
         return (E)this.elementData[this.positiveMod(this.head + CollectionsKt.getLastIndex(this))]
      }
   }

   private fun incremented(index: Int): Int {
      return if (index == ArraysKt.getLastIndex(this.elementData)) 0 else index + 1
   }

   public constructor(initialCapacity: Int)  {
      val var10001: Array<Any>
      if (initialCapacity == 0) {
         var10001 = emptyElementData
      } else {
         if (initialCapacity <= 0) {
            throw IllegalArgumentException("Illegal Capacity: $initialCapacity")
         }

         var10001 = arrayOfNulls(initialCapacity)
      }

      this.elementData = var10001
   }

   public override fun add(element: Any): Boolean {
      this.addLast((E)element)
      return true
   }

   public fun first(): Any {
      if (this.isEmpty()) {
         throw NoSuchElementException("ArrayDeque is empty.")
      } else {
         return (E)this.elementData[this.head]
      }
   }

   public override fun removeLast(): Any {
      if (this.isEmpty()) {
         throw NoSuchElementException("ArrayDeque is empty.")
      } else {
         val internalLastIndex: Int = this.positiveMod(this.head + CollectionsKt.getLastIndex(this))
         val element: Any = this.elementData[internalLastIndex]
         this.elementData[internalLastIndex] = null
         this.size = this.size() - 1
         return (E)element
      }
   }

   public override fun remove(element: Any): Boolean {
      val index: Int = this.indexOf(element)
      if (index == -1) {
         return false
      } else {
         this.remove(index)
         return true
      }
   }

   private inline fun filterInPlace(predicate: (Any) -> Boolean): Boolean {
      if (!this.isEmpty() && this.elementData.length != 0) {
         val tail: Int = this.positiveMod(this.head + this.size())
         var newTail: Int = this.head
         var modified: Boolean = false
         if (this.head < tail) {
            for (index in this.head..tail) {
               val element: Any = this.elementData[index]
               if (predicate(this.elementData[index]) as java.lang.Boolean) {
                  this.elementData[newTail++] = element
               } else {
                  modified = true
               }
            }

            ArraysKt.fill(this.elementData, null, newTail, tail)
         } else {
            var var9: Int = this.head

            for (var11 in this.elementData.length..var9) {
               val elementx: Any = this.elementData[var9]
               this.elementData[var9] = null
               if (predicate(elementx) as java.lang.Boolean) {
                  this.elementData[newTail++] = elementx
               } else {
                  modified = true
               }
            }

            newTail = this.positiveMod(newTail)

            repeat(tail) { var10 ->
               val var12: Any = this.elementData[var10]
               this.elementData[var10] = null
               if (predicate(var12) as java.lang.Boolean) {
                  this.elementData[newTail] = var12
                  newTail = this.incremented(newTail)
               } else {
                  modified = true
               }
            }
         }

         if (modified) {
            this.size = this.negativeMod(newTail - this.head)
         }

         return modified
      } else {
         return false
      }
   }

   public override operator fun set(index: Int, element: Any): Any {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size())
      val internalIndex: Int = this.positiveMod(this.head + index)
      val oldElement: Any = this.elementData[internalIndex]
      this.elementData[internalIndex] = element
      return (E)oldElement
   }

   @InlineOnly
   private inline fun internalGet(internalIndex: Int): Any {
      return (E)this.elementData[internalIndex]
   }

   public override fun indexOf(element: Any): Int {
      val tail: Int = this.positiveMod(this.head + this.size())
      if (this.head < tail) {
         for (index in this.head..tail) {
            if (element == this.elementData[index]) {
               return index - this.head
            }
         }
      } else if (this.head >= tail) {
         var var5: Int = this.head

         for (var4 in this.elementData.length..var5) {
            if (element == this.elementData[var5]) {
               return var5 - this.head
            }
         }

         repeat(tail) { var6 ->
            if (element == this.elementData[var6]) {
               return var6 + this.elementData.length - this.head
            }
         }
      }

      return -1
   }

   public override fun isEmpty(): Boolean {
      return this.size() == 0
   }

   public override fun removeAll(elements: Collection<Any>): Boolean {
      val `this_$iv`: ArrayDeque = this
      val var10000: Boolean
      if (!this.isEmpty() && this.elementData.length != 0) {
         val `tail$iv`: Int = this.positiveMod(this.head + this.size())
         var `newTail$iv`: Int = this.head
         var `modified$iv`: Boolean = false
         if (this.head < `tail$iv`) {
            for (var13 in this.head..`tail$iv`) {
               val var15: Any = `this_$iv`.elementData[var13]
               if (!elements.contains(`this_$iv`.elementData[var13])) {
                  `this_$iv`.elementData[`newTail$iv`++] = var15
               } else {
                  `modified$iv` = true
               }
            }

            ArraysKt.fill(`this_$iv`.elementData, null, `newTail$iv`, `tail$iv`)
         } else {
            var `index$iv`: Int = this.head

            for (`element$iv` in this.elementData.length..`index$iv`) {
               val `element$ivx`: Any = `this_$iv`.elementData[`index$iv`]
               `this_$iv`.elementData[`index$iv`] = null
               if (!elements.contains(`element$ivx`)) {
                  `this_$iv`.elementData[`newTail$iv`++] = `element$ivx`
               } else {
                  `modified$iv` = true
               }
            }

            `newTail$iv` = `this_$iv`.positiveMod(`newTail$iv`)

            repeat(`tail$iv`) { var12 ->
               val var14: Any = `this_$iv`.elementData[var12]
               `this_$iv`.elementData[var12] = null
               if (!elements.contains(var14)) {
                  `this_$iv`.elementData[`newTail$iv`] = var14
                  `newTail$iv` = `this_$iv`.incremented(`newTail$iv`)
               } else {
                  `modified$iv` = true
               }
            }
         }

         if (`modified$iv`) {
            `this_$iv`.size = `this_$iv`.negativeMod(`newTail$iv` - `this_$iv`.head)
         }

         var10000 = `modified$iv`
      } else {
         var10000 = false
      }

      return var10000
   }

   public override fun addAll(index: Int, elements: Collection<Any>): Boolean {
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.size())
      if (elements.isEmpty()) {
         return false
      } else if (index == this.size()) {
         return this.addAll(elements)
      } else {
         this.ensureCapacity(this.size() + elements.size())
         val tail: Int = this.positiveMod(this.head + this.size())
         val internalIndex: Int = this.positiveMod(this.head + index)
         val elementsSize: Int = elements.size()
         if (index < this.size() + 1 shr 1) {
            var shiftedInternalIndex: Int = this.head - elementsSize
            if (internalIndex >= this.head) {
               if (shiftedInternalIndex >= 0) {
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, shiftedInternalIndex, this.head, internalIndex)
               } else {
                  shiftedInternalIndex += this.elementData.length
                  val shiftToFront: Int = internalIndex - this.head
                  val shiftToBack: Int = this.elementData.length - shiftedInternalIndex
                  if (this.elementData.length - shiftedInternalIndex >= shiftToFront) {
                     ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, shiftedInternalIndex, this.head, internalIndex)
                  } else {
                     ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, shiftedInternalIndex, this.head, this.head + shiftToBack)
                     ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, 0, this.head + shiftToBack, internalIndex)
                  }
               }
            } else {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, shiftedInternalIndex, this.head, this.elementData.length)
               if (elementsSize >= internalIndex) {
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, this.elementData.length - elementsSize, 0, internalIndex)
               } else {
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, this.elementData.length - elementsSize, 0, elementsSize)
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, 0, elementsSize, internalIndex)
               }
            }

            this.head = shiftedInternalIndex
            this.copyCollectionElements(this.negativeMod(internalIndex - elementsSize), elements)
         } else {
            val var9: Int = internalIndex + elementsSize
            if (internalIndex < tail) {
               if (tail + elementsSize <= this.elementData.length) {
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, var9, internalIndex, tail)
               } else if (var9 >= this.elementData.length) {
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, var9 - this.elementData.length, internalIndex, tail)
               } else {
                  val var10: Int = tail + elementsSize - this.elementData.length
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, 0, tail - (tail + elementsSize - this.elementData.length), tail)
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, var9, internalIndex, tail - var10)
               }
            } else {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, elementsSize, 0, tail)
               if (var9 >= this.elementData.length) {
                  ArraysKt.copyInto(
                     (Object[])this.elementData, (Object[])this.elementData, var9 - this.elementData.length, internalIndex, this.elementData.length
                  )
               } else {
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, 0, this.elementData.length - elementsSize, this.elementData.length)
                  ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, var9, internalIndex, this.elementData.length - elementsSize)
               }
            }

            this.copyCollectionElements(internalIndex, elements)
         }

         return true
      }
   }

   internal fun <T> testToArray(array: Array<Any>): Array<Any> {
      return (T[])this.toArray(array)
   }

   public fun removeLastOrNull(): Any? {
      return if (this.isEmpty()) null else this.removeLast()
   }

   public override fun toArray(): Array<Any?> {
      return this.toArray(arrayOfNulls(this.size()))
   }

   public override fun removeAt(index: Int): Any {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size())
      if (index == CollectionsKt.getLastIndex(this)) {
         return this.removeLast()
      } else if (index == 0) {
         return this.removeFirst()
      } else {
         val internalIndex: Int = this.positiveMod(this.head + index)
         val element: Any = this.elementData[internalIndex]
         if (index < this.size() shr 1) {
            if (internalIndex >= this.head) {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, this.head + 1, this.head, internalIndex)
            } else {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, 1, 0, internalIndex)
               this.elementData[0] = this.elementData[this.elementData.length - 1]
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, this.head + 1, this.head, this.elementData.length - 1)
            }

            this.elementData[this.head] = null
            this.head = this.incremented(this.head)
         } else {
            val internalLastIndex: Int = this.positiveMod(this.head + CollectionsKt.getLastIndex(this))
            if (internalIndex <= internalLastIndex) {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, internalIndex, internalIndex + 1, internalLastIndex + 1)
            } else {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, internalIndex, internalIndex + 1, this.elementData.length)
               this.elementData[this.elementData.length - 1] = this.elementData[0]
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, 0, 1, internalLastIndex + 1)
            }

            this.elementData[internalLastIndex] = null
         }

         this.size = this.size() - 1
         return (E)element
      }
   }

   public override fun retainAll(elements: Collection<Any>): Boolean {
      val `this_$iv`: ArrayDeque = this
      val var10000: Boolean
      if (!this.isEmpty() && this.elementData.length != 0) {
         val `tail$iv`: Int = this.positiveMod(this.head + this.size())
         var `newTail$iv`: Int = this.head
         var `modified$iv`: Boolean = false
         if (this.head < `tail$iv`) {
            for (var13 in this.head..`tail$iv`) {
               val var15: Any = `this_$iv`.elementData[var13]
               if (elements.contains(`this_$iv`.elementData[var13])) {
                  `this_$iv`.elementData[`newTail$iv`++] = var15
               } else {
                  `modified$iv` = true
               }
            }

            ArraysKt.fill(`this_$iv`.elementData, null, `newTail$iv`, `tail$iv`)
         } else {
            var `index$iv`: Int = this.head

            for (`element$iv` in this.elementData.length..`index$iv`) {
               val `element$ivx`: Any = `this_$iv`.elementData[`index$iv`]
               `this_$iv`.elementData[`index$iv`] = null
               if (elements.contains(`element$ivx`)) {
                  `this_$iv`.elementData[`newTail$iv`++] = `element$ivx`
               } else {
                  `modified$iv` = true
               }
            }

            `newTail$iv` = `this_$iv`.positiveMod(`newTail$iv`)

            repeat(`tail$iv`) { var12 ->
               val var14: Any = `this_$iv`.elementData[var12]
               `this_$iv`.elementData[var12] = null
               if (elements.contains(var14)) {
                  `this_$iv`.elementData[`newTail$iv`] = var14
                  `newTail$iv` = `this_$iv`.incremented(`newTail$iv`)
               } else {
                  `modified$iv` = true
               }
            }
         }

         if (`modified$iv`) {
            `this_$iv`.size = `this_$iv`.negativeMod(`newTail$iv` - `this_$iv`.head)
         }

         var10000 = `modified$iv`
      } else {
         var10000 = false
      }

      return var10000
   }

   private fun positiveMod(index: Int): Int {
      return if (index >= this.elementData.length) index - this.elementData.length else index
   }

   internal fun internalStructure(structure: (Int, Array<Any?>) -> Unit) {
      structure(
         if (!this.isEmpty() && this.head >= this.positiveMod(this.head + this.size())) this.head - this.elementData.length else this.head, this.toArray()
      )
   }

   public override fun add(index: Int, element: Any) {
      AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, this.size())
      if (index == this.size()) {
         this.addLast((E)element)
      } else if (index == 0) {
         this.addFirst((E)element)
      } else {
         this.ensureCapacity(this.size() + 1)
         val internalIndex: Int = this.positiveMod(this.head + index)
         if (index < this.size() + 1 shr 1) {
            val tail: Int = this.decremented(internalIndex)
            val decrementedHead: Int = this.decremented(this.head)
            if (tail >= this.head) {
               this.elementData[decrementedHead] = this.elementData[this.head]
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, this.head, this.head + 1, tail + 1)
            } else {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, this.head - 1, this.head, this.elementData.length)
               this.elementData[this.elementData.length - 1] = this.elementData[0]
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, 0, 1, tail + 1)
            }

            this.elementData[tail] = element
            this.head = decrementedHead
         } else {
            val var6: Int = this.positiveMod(this.head + this.size())
            if (internalIndex < var6) {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, internalIndex + 1, internalIndex, var6)
            } else {
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, 1, 0, var6)
               this.elementData[0] = this.elementData[this.elementData.length - 1]
               ArraysKt.copyInto((Object[])this.elementData, (Object[])this.elementData, internalIndex + 1, internalIndex, this.elementData.length - 1)
            }

            this.elementData[internalIndex] = element
         }

         this.size = this.size() + 1
      }
   }

   public override fun <T> toArray(array: Array<Any>): Array<Any> {
      val dest: Array<Any> = if (array.length >= this.size()) array else ArraysKt.arrayOfNulls(array, this.size())
      val tail: Int = this.positiveMod(this.head + this.size())
      if (this.head < tail) {
         ArraysKt.copyInto$default((Object[])this.elementData, (Object[])dest, 0, this.head, tail, 2, null)
      } else if (!this.isEmpty()) {
         ArraysKt.copyInto((Object[])this.elementData, (Object[])dest, 0, this.head, this.elementData.length)
         ArraysKt.copyInto((Object[])this.elementData, (Object[])dest, this.elementData.length - this.head, 0, tail)
      }

      return (T[])CollectionsKt.terminateCollectionToArray(this.size(), dest)
   }

   internal fun testToArray(): Array<Any?> {
      return this.toArray()
   }

   public constructor(elements: Collection<Any>)  {
      this.elementData = elements.toArray(arrayOfNulls(0))
      this.size = this.elementData.length
      if (this.elementData.length == 0) {
         this.elementData = emptyElementData
      }
   }

   public override fun addFirst(element: Any) {
      this.ensureCapacity(this.size() + 1)
      this.head = this.decremented(this.head)
      this.elementData[this.head] = element
      this.size = this.size() + 1
   }

   public override fun clear() {
      val tail: Int = this.positiveMod(this.head + this.size())
      if (this.head < tail) {
         ArraysKt.fill(this.elementData, null, this.head, tail)
      } else if (!this.isEmpty()) {
         ArraysKt.fill(this.elementData, null, this.head, this.elementData.length)
         ArraysKt.fill(this.elementData, null, 0, tail)
      }

      this.head = 0
      this.size = 0
   }

   public fun firstOrNull(): Any? {
      return (E)(if (this.isEmpty()) null else this.elementData[this.head])
   }

   private fun negativeMod(index: Int): Int {
      return if (index < 0) index + this.elementData.length else index
   }

   private fun copyElements(newCapacity: Int) {
      val newElements: Array<Any> = arrayOfNulls(newCapacity)
      ArraysKt.copyInto((Object[])this.elementData, (Object[])newElements, 0, this.head, this.elementData.length)
      ArraysKt.copyInto((Object[])this.elementData, (Object[])newElements, this.elementData.length - this.head, 0, this.head)
      this.head = 0
      this.elementData = newElements
   }

   public override fun addAll(elements: Collection<Any>): Boolean {
      if (elements.isEmpty()) {
         return false
      } else {
         this.ensureCapacity(this.size() + elements.size())
         this.copyCollectionElements(this.positiveMod(this.head + this.size()), elements)
         return true
      }
   }

   public override fun addLast(element: Any) {
      this.ensureCapacity(this.size() + 1)
      this.elementData[this.positiveMod(this.head + this.size())] = element
      this.size = this.size() + 1
   }

   public constructor()  {
      this.elementData = emptyElementData
   }

   private fun decremented(index: Int): Int {
      return if (index == 0) ArraysKt.getLastIndex(this.elementData) else index + -1
   }

   @InlineOnly
   private inline fun internalIndex(index: Int): Int {
      return this.positiveMod(this.head + index)
   }

   public override fun removeFirst(): Any {
      if (this.isEmpty()) {
         throw NoSuchElementException("ArrayDeque is empty.")
      } else {
         val element: Any = this.elementData[this.head]
         this.elementData[this.head] = null
         this.head = this.incremented(this.head)
         this.size = this.size() - 1
         return (E)element
      }
   }

   public fun removeFirstOrNull(): Any? {
      return if (this.isEmpty()) null else this.removeFirst()
   }

   public fun lastOrNull(): Any? {
      return (E)(if (this.isEmpty()) null else this.elementData[this.positiveMod(this.head + CollectionsKt.getLastIndex(this))])
   }

   public override operator fun contains(element: Any): Boolean {
      return this.indexOf(element) != -1
   }

   public override operator fun get(index: Int): Any {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size())
      return (E)this.elementData[this.positiveMod(this.head + index)]
   }

   private fun ensureCapacity(minCapacity: Int) {
      if (minCapacity < 0) {
         throw IllegalStateException("Deque is too big.")
      } else if (minCapacity > this.elementData.length) {
         if (this.elementData === emptyElementData) {
            this.elementData = arrayOfNulls(RangesKt.coerceAtLeast(minCapacity, 10))
         } else {
            this.copyElements(AbstractList.Companion.newCapacity$kotlin_stdlib(this.elementData.length, minCapacity))
         }
      }
   }

   // $VF: Compiled from ArrayDeque.kt
   internal companion object {
      private const val defaultMinCapacity: Int = 10
      private final val emptyElementData: Array<Any?>
   }
}
