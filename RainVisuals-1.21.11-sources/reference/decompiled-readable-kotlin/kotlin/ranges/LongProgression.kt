package kotlin.ranges

import kotlin.jvm.internal.markers.KMappedMarker

// $VF: Compiled from Progressions.kt
public open class LongProgression internal constructor(start: Long, endInclusive: Long, step: Long) : KMappedMarker, java.lang.Iterable {
   public final val step: Long
   public final val last: Long
   public final val first: Long

   public override fun hashCode(): Int {
      return if (this.isEmpty())
         -1
         else
         (int)(31 * (31 * (this.first xor this.first ushr 32) + (this.last xor this.last ushr 32)) + (this.step xor this.step ushr 32))
      }

   public override fun toString(): String {
      return if (this.step > 0L) "${this.first}..${this.last} step ${this.step}" else "${this.first} downTo ${this.last} step ${-this.step}"
   }

   public open fun isEmpty(): Boolean {
      return if (this.step > 0L) this.first > this.last else this.first < this.last
   }

   public open operator fun iterator(): LongIterator {
      return LongProgressionIterator(this.first, this.last, this.step)
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is LongProgression
         && (
            this.isEmpty() && (other as LongProgression).isEmpty()
               || this.first == (other as LongProgression).first
                  && this.last == (other as LongProgression).last
                  && this.step == (other as LongProgression).step
         )
      }

   // $VF: Compiled from Progressions.kt
   public companion object {
      public fun fromClosedRange(rangeStart: Long, rangeEnd: Long, step: Long): LongProgression {
         return LongProgression(rangeStart, rangeEnd, step)
      }
   }
}
