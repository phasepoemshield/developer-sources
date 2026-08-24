package kotlin.ranges

import kotlin.internal.UProgressionUtilKt
import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from ULongRange.kt
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
@SinceKotlin(version = "1.5")
public open class ULongProgression internal constructor(start: ULong, endInclusive: ULong, step: Long) : ULongProgression(start, endInclusive, step),
   KMappedMarker,
   java.lang.Iterable {
   public final val first: ULong
   public final val step: Long
   public final val last: ULong

   fun ULongProgression(endInclusive: Long, step: Long, start: Long) {
      if (step == 0L) {
         throw IllegalArgumentException("Step must be non-zero.")
      } else if (step == java.lang.Long.MIN_VALUE) {
         throw IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.")
      } else {
         this.first = start
         this.last = UProgressionUtilKt.getProgressionLastElement_7ftBX0g/* $VF was: getProgressionLastElement-7ftBX0g */(start, endInclusive, step)
         this.step = step
      }
   }

   public override fun toString(): String {
      return if (this.step > 0L)
         "${ULong.toString_impl/* $VF was: toString-impl */(this.first)}..${ULong.toString_impl/* $VF was: toString-impl */(this.last)} step ${this.step}"
         else
         "${ULong.toString_impl/* $VF was: toString-impl */(this.first)} downTo ${ULong.toString_impl/* $VF was: toString-impl */(this.last)} step ${-this.step}"
      }

   public override operator fun iterator(): Iterator<ULong> {
      return ULongProgressionIterator(this.first, this.last, this.step, null)
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is ULongProgression
         && (
            this.isEmpty() && (other as ULongProgression).isEmpty()
               || this.first == (other as ULongProgression).first
                  && this.last == (other as ULongProgression).last
                  && this.step == (other as ULongProgression).step
         )
      }

   public open fun isEmpty(): Boolean {
      return if (this.step > 0L) java.lang.Long.compareUnsigned(this.first, this.last) > 0 else java.lang.Long.compareUnsigned(this.first, this.last) < 0
   }

   public override fun hashCode(): Int {
      return if (this.isEmpty())
         -1
         else
         31
               * (
                  31
                        * (int)ULong.constructor_impl/* $VF was: constructor-impl */(
                           this.first xor ULong.constructor_impl/* $VF was: constructor-impl */(this.first ushr 32)
                        )
                     + (int)ULong.constructor_impl/* $VF was: constructor-impl */(
                        this.last xor ULong.constructor_impl/* $VF was: constructor-impl */(this.last ushr 32)
                     )
               )
            + (int)(this.step xor this.step ushr 32)
         }

   // $VF: Compiled from ULongRange.kt
   public companion object {
      public fun fromClosedRange(rangeStart: ULong, rangeEnd: ULong, step: Long): ULongProgression {
         return ULongProgression(rangeStart, rangeEnd, step, null)
      }
   }
}
