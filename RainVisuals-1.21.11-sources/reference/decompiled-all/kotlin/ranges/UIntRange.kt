package kotlin.ranges

// $VF: Compiled from UIntRange.kt
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = [ExperimentalUnsignedTypes::class])
public class UIntRange(start: UInt, endInclusive: UInt) : UIntRange(start, endInclusive), OpenEndRange, ClosedRange {
   @Deprecated(
      message = "Can throw an exception when it's impossible to represent the value with UInt type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw."
   )
   @SinceKotlin(version = "1.9")
   @WasExperimental(markerClass = ExperimentalStdlibApi.class)
   public open val endExclusive: UInt
      public open get() {
         if (this.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */() == -1) {
            throw IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.".toString())
         } else {
            return UInt.constructor_impl/* $VF was: constructor-impl */(this.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */() + 1)
         }
      }


   public open operator fun contains(value: UInt): Boolean {
      return Integer.compareUnsigned(this.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */(), value) <= 0
         && Integer.compareUnsigned(value, this.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */()) <= 0
      }

   public open val endInclusive: UInt
      public open get() {
         return this.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */()
      }


   public override fun hashCode(): Int {
      return if (this.isEmpty()) -1 else 31 * this.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */() + this.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */()
   }

   fun UIntRange(endInclusive: Int, start: Int) {
      super(start, endInclusive, 1, null)
   }

   public override fun isEmpty(): Boolean {
      return Integer.compareUnsigned(this.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */(), this.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */()) > 0
   }

   public open val start: UInt
      public open get() {
         return this.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */()
      }


   public override fun toString(): String {
      return "${UInt.toString_impl/* $VF was: toString-impl */(this.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */())}..${UInt.toString_impl/* $VF was: toString-impl */(
         this.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */()
      )}"
   }

   public override operator fun equals(other: Any?): Boolean {
      return other is UIntRange
         && (
            this.isEmpty() && (other as UIntRange).isEmpty()
               || this.getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */() == (other as UIntRange).getFirst_pVg5ArA/* $VF was: getFirst-pVg5ArA */()
                  && this.getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */() == (other as UIntRange).getLast_pVg5ArA/* $VF was: getLast-pVg5ArA */()
         )
      }

   // $VF: Compiled from UIntRange.kt
   public companion object {
      public final val EMPTY: UIntRange
   }
}
