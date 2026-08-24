package kotlin.ranges

import java.util.NoSuchElementException
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from UIntRange.kt
@SinceKotlin(version = "1.3")
private class UIntProgressionIterator(first: UInt, last: UInt, step: Int) : UIntProgressionIterator(first, last, step), java.util.Iterator<UInt>, KMappedMarker {
   private final val finalElement: UInt
   private final val step: UInt
   private final var hasNext: Boolean
   private final var next: UInt

   public override operator fun hasNext(): Boolean {
      return this.hasNext
   }

   override fun remove() {
      throw UnsupportedOperationException("Operation is not supported for read-only collection")
   }

   fun UIntProgressionIterator(step: Int, first: Int, last: Int) {
      this.finalElement = last
      this.hasNext = if (step > 0) Integer.compareUnsigned(first, last) <= 0 else Integer.compareUnsigned(first, last) >= 0
      this.step = UInt.constructor_impl/* $VF was: constructor-impl */(step)
      this.next = if (this.hasNext) first else this.finalElement
   }

   public open operator fun next(): UInt {
      val value: Int = this.next
      if (this.next == this.finalElement) {
         if (!this.hasNext) {
            throw NoSuchElementException()
         }

         this.hasNext = false
      } else {
         this.next = UInt.constructor_impl/* $VF was: constructor-impl */(this.next + this.step)
      }

      return value
   }
}
