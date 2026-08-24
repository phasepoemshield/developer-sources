package oxxxde

import kotakbaz.rain.ui.inventory.FunTimeOnlineHelperController$State

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class خؤ {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(FunTimeOnlineHelperController$State.values().length)

      try {
         var0[FunTimeOnlineHelperController$State.IDLE.ordinal()] = 1
      } catch (var8: NoSuchFieldError) {
      }

      try {
         var0[FunTimeOnlineHelperController$State.SELECT_ANARCHY.ordinal()] = 2
      } catch (var7: NoSuchFieldError) {
      }

      try {
         var0[FunTimeOnlineHelperController$State.SELECT_TEAM.ordinal()] = 3
      } catch (var6: NoSuchFieldError) {
      }

      try {
         var0[FunTimeOnlineHelperController$State.WAIT_SERVERS.ordinal()] = 4
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[FunTimeOnlineHelperController$State.SELECT_BEST_TEAM.ordinal()] = 5
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[FunTimeOnlineHelperController$State.WAIT_BEST_SERVER.ordinal()] = 6
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[FunTimeOnlineHelperController$State.JOIN_BEST.ordinal()] = 7
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
