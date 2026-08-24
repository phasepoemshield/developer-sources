package oxxxde

import kotakbaz.rain.module.modules.render.predicts.PredictedProjectile

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class صذ {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(PredictedProjectile.values().length)

      try {
         var0[PredictedProjectile.TRIDENT.ordinal()] = 1
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[PredictedProjectile.BOW_ARROW.ordinal()] = 2
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
