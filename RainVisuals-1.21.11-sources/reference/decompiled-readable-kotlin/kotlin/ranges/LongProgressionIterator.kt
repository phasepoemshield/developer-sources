package kotlin.ranges

import java.util.NoSuchElementException

// $VF: Compiled from ProgressionIterators.kt
internal class LongProgressionIterator(first: Long, last: Long, step: Long) : LongIterator {
   private final var next: Long
   private final var hasNext: Boolean
   public final val step: Long
   private final val finalElement: Long

   public override operator fun hasNext(): Boolean {
      return this.hasNext
   }

   public override fun nextLong(): Long {
      val value: Long = this.next
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

   init {
      this.step = step
      this.finalElement = last
      this.hasNext = if (this.step > 0L) first <= last else first >= last
      this.next = if (this.hasNext) first else this.finalElement
   }
}
