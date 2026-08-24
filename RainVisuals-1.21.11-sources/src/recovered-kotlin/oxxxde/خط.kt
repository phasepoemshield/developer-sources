package oxxxde

import kotakbaz.rain.module.modules.player.ItemSwapModule$SwapItem

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class خط {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(ItemSwapModule$SwapItem.values().length)

      try {
         var0[ItemSwapModule$SwapItem.TALISMAN.ordinal()] = 1
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[ItemSwapModule$SwapItem.SPHERE.ordinal()] = 2
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
