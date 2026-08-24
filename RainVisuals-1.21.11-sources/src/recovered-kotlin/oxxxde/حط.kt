package oxxxde

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class حط {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(ضث.values().length)

      try {
         var0[ضث.OPENING_INVENTORY.ordinal()] = 1
      } catch (var7: NoSuchFieldError) {
      }

      try {
         var0[ضث.PICKING_CHEST_SLOT.ordinal()] = 2
      } catch (var6: NoSuchFieldError) {
      }

      try {
         var0[ضث.PICKING_TARGET_SLOT.ordinal()] = 3
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[ضث.PLACING_CHEST_SLOT.ordinal()] = 4
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[ضث.CLOSING_INVENTORY.ordinal()] = 5
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[ضث.IDLE.ordinal()] = 6
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
