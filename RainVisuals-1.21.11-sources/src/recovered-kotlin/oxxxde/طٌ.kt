package oxxxde

import kotakbaz.rain.ui.api.RenderIn

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class طٌ {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(RenderIn.values().length)

      try {
         var0[RenderIn.HUD.ordinal()] = 1
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[RenderIn.GUI.ordinal()] = 2
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[RenderIn.WINDOW.ordinal()] = 3
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
