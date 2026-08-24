package kotlin.ranges

import java.util.NoSuchElementException
import kotlin.jvm.internal.Intrinsics

// $VF: Compiled from ProgressionIterators.kt
internal class CharProgressionIterator(first: Char, last: Char, step: Int) : CharIterator {
   private final var next: Int
   private final val finalElement: Int
   private final var hasNext: Boolean
   public final val step: Int

   public override operator fun hasNext(): Boolean {
      return this.hasNext
   }

   public override fun nextChar(): Char {
      val value: Int = this.next
      if (this.next == this.finalElement) {
         if (!this.hasNext) {
            throw NoSuchElementException()
         }

         this.hasNext = false
      } else {
         this.next = this.next + this.step
      }

      return (char)value
   }

   init {
      this.step = step
      this.finalElement = last
      this.hasNext = if (this.step > 0) Intrinsics.compare(first, last) <= 0 else Intrinsics.compare(first, last) >= 0
      this.next = if (this.hasNext) first else this.finalElement
   }
}
