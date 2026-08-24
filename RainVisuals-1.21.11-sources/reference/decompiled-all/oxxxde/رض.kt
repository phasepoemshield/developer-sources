package oxxxde

import kotlin.enums.EnumEntries

// $VF: Compiled from Easing.kt
public enum class رض {
   LINEAR,
   SINE_OUT;

   @JvmStatic
   fun getEntries(): EnumEntries<رض> {
      $ENTRIES
   }

   public fun apply(x: Float): Float {
      return (float)this.apply((double)x)
   }

   public abstract fun apply(x: Double): Double {
   }
}
