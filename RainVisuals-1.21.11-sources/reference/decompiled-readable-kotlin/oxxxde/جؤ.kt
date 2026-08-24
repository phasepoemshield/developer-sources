package oxxxde

import kotakbaz.rain.module.Module
import net.minecraft.component.DataComponentTypes
import net.minecraft.component.type.DyedColorComponent
import net.minecraft.entity.EquipmentSlot
import net.minecraft.item.Item
import net.minecraft.item.ItemConvertible
import net.minecraft.item.ItemStack
import net.minecraft.item.Items

// $VF: Compiled from heavy
public object جؤ : Module("FriendsColor", PLAYER, "Отображает друзей в зелёной броне") {
   private const val FRIEND_ARMOR_COLOR: Int = 65280

   fun createColoredArmor(item: Item): ItemStack {
      val var2: ItemStack = ItemStack(item as ItemConvertible)
      var2.set(DataComponentTypes.DYED_COLOR, DyedColorComponent(65280))
      var2
   }

   public fun shouldReplaceArmor(playerName: String?, invisible: Boolean): Boolean {
      return this.isEnabled() && !invisible && شغ.INSTANCE.isFriend(playerName)
   }

   fun createReplacementArmor(slot: EquipmentSlot?): ItemStack? {
      run label26@{
         var var10000: Item
         when (if (slot == null) -1 else بص.$EnumSwitchMapping$0[slot.ordinal()]) {
            1 -> var10000 = Items.LEATHER_HELMET
            2 -> var10000 = Items.LEATHER_CHESTPLATE
            3 -> var10000 = Items.LEATHER_LEGGINGS
            4 -> var10000 = Items.LEATHER_BOOTS
            else -> var10000 = null
         }

         if (var10000 == null) null else this.createColoredArmor(var10000)
      }
   }
}
