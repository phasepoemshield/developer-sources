package oxxxde

import net.minecraft.util.math.Direction.Axis

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class ست {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(Axis.values().length)

      try {
         var0[Axis.X.ordinal()] = 1
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[Axis.Y.ordinal()] = 2
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[Axis.Z.ordinal()] = 3
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
