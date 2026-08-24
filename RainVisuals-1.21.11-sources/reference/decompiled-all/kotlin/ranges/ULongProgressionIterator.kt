package kotlin.ranges

import java.util.NoSuchElementException
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from ULongRange.kt
@SinceKotlin(version = "1.3")
private class ULongProgressionIterator(first: ULong, last: ULong, step: Long) : ULongProgressionIterator(first, last, step), KMappedMarker, java.util.Iterator {
   private final var next: ULong
   private final var hasNext: Boolean
   private final val finalElement: ULong
   private final val step: ULong

   fun ULongProgressionIterator(last: Long, first: Long, step: Long) {
      this.finalElement = last
      this.hasNext = if (step > 0L) java.lang.Long.compareUnsigned(first, last) <= 0 else java.lang.Long.compareUnsigned(first, last) >= 0
      this.step = ULong.constructor_impl/* $VF was: constructor-impl */(step)
      this.next = if (this.hasNext) first else this.finalElement
   }

   public open operator fun next(): ULong {
      val value: Long = this.next
      if (this.next == this.finalElement) {
         if (!this.hasNext) {
            throw NoSuchElementException()
         }

         this.hasNext = false
      } else {
         this.next = ULong.constructor_impl/* $VF was: constructor-impl */(this.next + this.step)
      }

      return value
   }

   public override operator fun hasNext(): Boolean {
      return this.hasNext
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }
}
