package kotlin.ranges

// $VF: Compiled from ULongRange.kt
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public class ULongRange(start: ULong, endInclusive: ULong) : ULongRange(start, endInclusive), OpenEndRange, ClosedRange {
   public override fun isEmpty(): Boolean {
      return java.lang.Long.compareUnsigned(this.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */(), this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */()) > 0
   }

   public open operator fun contains(value: ULong): Boolean {
      return java.lang.Long.compareUnsigned(this.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */(), value) <= 0
         && java.lang.Long.compareUnsigned(value, this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */()) <= 0
      }

   public open val start: ULong
      public open get() {
         return this.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */()
      }


   @Deprecated(
      message = "Can throw an exception when it's impossible to represent the value with ULong type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw."
   )
   @WasExperimental(markerClass = ExperimentalStdlibApi.class)
   @SinceKotlin(version = "1.9")
   public open val endExclusive: ULong
      public open get() {
         if (this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */() == -1L) {
            throw IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString())
         } else {
            return ULong.constructor_impl/* $VF was: constructor-impl */(
               this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */() + ULong.constructor_impl/* $VF was: constructor-impl */((long)1 and 4294967295L)
            )
         }
      }


   public override fun toString(): String {
      return "${ULong.toString_impl/* $VF was: toString-impl */(this.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */())}..${ULong.toString_impl/* $VF was: toString-impl */(
         this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */()
      )}"
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is ULongRange
         && (
            this.isEmpty() && (other as ULongRange).isEmpty()
               || this.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */() == (other as ULongRange).getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */()
                  && this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */() == (other as ULongRange).getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */()
         )
      }

   public open val endInclusive: ULong
      public open get() {
         return this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */()
      }


   fun ULongRange(start: Long, endInclusive: Long) {
      super(start, endInclusive, 1L, null)
   }

   public override fun hashCode(): Int {
      return if (this.isEmpty())
         -1
         else
         31
               * (int)ULong.constructor_impl/* $VF was: constructor-impl */(
                  this.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */() xor ULong.constructor_impl/* $VF was: constructor-impl */(
                     this.getFirst_s_VKNKU/* $VF was: getFirst-s-VKNKU */() ushr 32
                  )
               )
            + (int)ULong.constructor_impl/* $VF was: constructor-impl */(
               this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */() xor ULong.constructor_impl/* $VF was: constructor-impl */(
                  this.getLast_s_VKNKU/* $VF was: getLast-s-VKNKU */() ushr 32
               )
            )
         }

   // $VF: Compiled from ULongRange.kt
   public companion object {
      public final val EMPTY: ULongRange
   }
}
