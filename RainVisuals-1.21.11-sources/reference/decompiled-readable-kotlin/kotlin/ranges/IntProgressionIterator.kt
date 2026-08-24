package kotlin.ranges

import java.util.NoSuchElementException

// $VF: Compiled from ProgressionIterators.kt
internal class IntProgressionIterator(first: Int, last: Int, step: Int) : IntIterator {
   private final var hasNext: Boolean
   private final var next: Int
   public final val step: Int
   private final val finalElement: Int

   public override fun nextInt(): Int {
      val value: Int = this.next
      if (this.next == this.finalElement) {
         if (!this.hasNext) {
            throw NoSuchElementException()
         }

         this.hasNext = false
      } else {
         this.next = this.next + this.step
      }

      return value
   }

   public override operator fun hasNext(): Boolean {
      return this.hasNext
   }

   init {
      this.step = step
      this.finalElement = last
      this.hasNext = if (this.step > 0) first <= last else first >= last
      this.next = if (this.hasNext) first else this.finalElement
   }
}
