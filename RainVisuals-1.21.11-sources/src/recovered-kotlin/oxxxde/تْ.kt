package oxxxde

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class تْ {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(رل.values().length)

      try {
         var0[رل.IDLE.ordinal()] = 1
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[رل.WAITING_FOR_AUCTION.ordinal()] = 2
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[رل.AUCTION_OPEN.ordinal()] = 3
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
