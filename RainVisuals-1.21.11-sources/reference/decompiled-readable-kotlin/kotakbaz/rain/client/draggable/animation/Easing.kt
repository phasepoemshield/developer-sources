package kotakbaz.rain.client.draggable.animation

import kotlin.enums.EnumEntries

// $VF: Compiled from Easing.kt
public enum class Easing {
   LINEAR,
   SINE_OUT;

   @JvmStatic
   fun getEntries(): EnumEntries<Easing> {
      $ENTRIES
   }

   public fun apply(x: Float): Float {
      return (float)this.apply((double)x)
   }

   public abstract fun apply(x: Double): Double {
   }
}
