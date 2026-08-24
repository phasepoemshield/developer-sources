package oxxxde

import kotlin.enums.EnumEntries
import net.minecraft.item.ItemStack
import net.minecraft.item.Items

// $VF: Compiled from heavy
private enum class ثج(title: String) {
   TALISMAN("Талисман"),
   SPHERE("Сфера");

   public final val title: String

   fun matches(stack: ItemStack): Boolean {
      var var10000: Boolean
      when (خط.$EnumSwitchMapping$0[this.ordinal()]) {
         1 -> var10000 = stack.isOf(Items.TOTEM_OF_UNDYING) && stack.hasGlint()
         2 -> var10000 = stack.isOf(Items.PLAYER_HEAD)
         else -> throw NoWhenBranchMatchedException()
      }

      var10000
   }

   init {
      this.title = title
   }

   @JvmStatic
   fun getEntries(): EnumEntries<ثج> {
      $ENTRIES
   }
}
