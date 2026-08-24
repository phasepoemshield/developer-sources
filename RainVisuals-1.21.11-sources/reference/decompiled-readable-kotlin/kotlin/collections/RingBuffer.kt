package kotlin.collections

import java.util.Arrays
import java.util.RandomAccess

// $VF: Compiled from SlidingWindow.kt
private class RingBuffer<T>(vararg buffer: Any, filledSize: Int) : AbstractList<T>, RandomAccess {
   private final val buffer: Array<Any?>

   public open var size: Int
      private set

   private final var startIndex: Int
   private final val capacity: Int

   public fun add(element: Any) {
      if (this.isFull()) {
         throw IllegalStateException("ring buffer is full")
      } else {
         this.buffer[(this.startIndex + this.size()) % access$getCapacity$p(this)] = element
         this.size = this.size() + 1
      }
   }

   public constructor(capacity: Int) : this(arrayOfNulls(capacity), 0)
   protected override fun toArray(): Array<Any?> {
      return this.toArray(arrayOfNulls(this.size()))
   }

   protected override fun <T> toArray(array: Array<Any>): Array<Any> {
      val var10000: Array<Any>
      if (array.length < this.size()) {
         var10000 = Arrays.copyOf(array, this.size())
      } else {
         var10000 = array
      }

      val result: Array<Any> = var10000
      val size: Int = this.size()
      var widx: Int = 0

      // $VF: Unable to resugar Kotlin loop from Java for loop
      var idx: Int = this.startIndex
      while (true) {
         if (widx < size && idx < this.capacity) break
         result[widx] = this.buffer[idx]
         widx++

         idx++
      }
            return (T[])CollectionsKt.terminateCollectionToArray(size, result)
   }

   public fun isFull(): Boolean {
      return this.size() == this.capacity
   }

   public override operator fun iterator(): Iterator<Any> {
      return       // $VF: Compiled from SlidingWindow.kt
object : AbstractIterator<Any> {
         private final var count: Int = RingBuffer.this.size()
         private final var index: Int = RingBuffer.this.startIndex

         protected override fun computeNext() {
            if (this.count == 0) {
               this.done()
            } else {
               this.setNext((T)RingBuffer.this.buffer[this.index])
               this.index = (this.index + 1) % RingBuffer.this.capacity
               this.count += -1
            }
         }
      }
   }

   public fun expanded(maxCapacity: Int): RingBuffer<Any> {
      val newCapacity: Int = RangesKt.coerceAtMost(this.capacity + (this.capacity shr 1) + 1, maxCapacity)
      val var10000: Array<Any>
      if (this.startIndex == 0) {
         var10000 = Arrays.copyOf(this.buffer, newCapacity)
      } else {
         var10000 = this.toArray(arrayOfNulls(newCapacity))
      }

      return RingBuffer<>(var10000, this.size())
   }

   init {
      this.buffer = buffer
      if (filledSize < 0) {
         throw IllegalArgumentException(("ring buffer filled size should not be negative but it is $filledSize").toString())
      } else if (filledSize > this.buffer.length) {
         throw IllegalArgumentException(("ring buffer filled size: $filledSize cannot be larger than the buffer size: ${this.buffer.length}").toString())
      } else {
         this.capacity = this.buffer.length
         this.size = filledSize
      }
   }

   private inline fun Int.forward(n: Int): Int {
      return (`$this$forward` + n) % access$getCapacity$p(this)
   }

   public fun removeFirst(n: Int) {
      if (n < 0) {
         throw IllegalArgumentException(("n shouldn't be negative but it is $n").toString())
      } else if (n > this.size()) {
         throw IllegalArgumentException(("n shouldn't be greater than the buffer size: n = $n, size = ${this.size()}").toString())
      } else {
         if (n > 0) {
            val var8: Int = this.startIndex
            val end: Int = (this.startIndex + n) % access$getCapacity$p(this)
            if (var8 > end) {
               ArraysKt.fill(this.buffer, null, var8, this.capacity)
               ArraysKt.fill(this.buffer, null, 0, end)
            } else {
               ArraysKt.fill(this.buffer, null, var8, end)
            }

            this.startIndex = end
            this.size = this.size() - n
         }
      }
   }

   public override operator fun get(index: Int): Any {
      AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, this.size())
      return (T)this.buffer[(this.startIndex + index) % access$getCapacity$p(this)]
   }
}
