package oxxxde

import net.minecraft.entity.EquipmentSlot

// $VF: Class flags could not be determined
// $VF: Compiled from heavy
@JvmSynthetic
internal class بص {
   @JvmStatic
   fun {
      val var0: IntArray = IntArray(EquipmentSlot.values().length)

      try {
         var0[EquipmentSlot.HEAD.ordinal()] = 1
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[EquipmentSlot.CHEST.ordinal()] = 2
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[EquipmentSlot.LEGS.ordinal()] = 3
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[EquipmentSlot.FEET.ordinal()] = 4
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0
   }
}
