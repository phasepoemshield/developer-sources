package kotlin.ranges

import kotlin.internal.UProgressionUtilKt
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from UIntRange.kt
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public open class UIntProgression internal constructor(start: UInt, endInclusive: UInt, step: Int) : UIntProgression(start, endInclusive, step),
   KMappedMarker,
   java.lang.Iterable {
   public final val last: UInt
   public final val first: UInt
   public final val step: Int

   fun UIntProgression(endInclusive: Int, step: Int, start: Int) {
      if (step == 0) {
         throw IllegalArgumentException("Step must be non-zero.")
      } else if (step == Integer.MIN_VALUE) {
         throw IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.")
      } else {
         this.first = start
         this.last = UProgressionUtilKt.getProgressionLastElement_Nkh28Cs/* $VF was: getProgressionLastElement-Nkh28Cs */(start, endInclusive, step)
         this.step = step
      }
   }

   public open fun isEmpty(): Boolean {
      return if (this.step > 0) Integer.compareUnsigned(this.first, this.last) > 0 else Integer.compareUnsigned(this.first, this.last) < 0
   }

   public override fun toString(): String {
      return if (this.step > 0)
         "${UInt.toString_impl/* $VF was: toString-impl */(this.first)}..${UInt.toString_impl/* $VF was: toString-impl */(this.last)} step ${this.step}"
         else
         "${UInt.toString_impl/* $VF was: toString-impl */(this.first)} downTo ${UInt.toString_impl/* $VF was: toString-impl */(this.last)} step ${-this.step}"
      }

   public override fun hashCode(): Int {
      return if (this.isEmpty()) -1 else 31 * (31 * this.first + this.last) + this.step
   }

   public override operator fun iterator(): Iterator<UInt> {
      return UIntProgressionIterator(this.first, this.last, this.step, null)
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is UIntProgression
         && (
            this.isEmpty() && (other as UIntProgression).isEmpty()
               || this.first == (other as UIntProgression).first
                  && this.last == (other as UIntProgression).last
                  && this.step == (other as UIntProgression).step
         )
      }

   // $VF: Compiled from UIntRange.kt
   public companion object {
      public fun fromClosedRange(rangeStart: UInt, rangeEnd: UInt, step: Int): UIntProgression {
         return UIntProgression(rangeStart, rangeEnd, step, null)
      }
   }
}
