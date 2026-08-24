package oxxxde

import java.util.ArrayList
import net.minecraft.entity.EquipmentSlot
import net.minecraft.entity.player.PlayerEntity
import net.minecraft.item.ItemStack

// $VF: Compiled from heavy
public companion object تء {
   public final val ARMOR_SLOTS: IntRange

   public final val HOTBAR_SLOTS: IntRange

   public final val INVENTORY_SLOTS: IntRange

   public final val MANAGED_SLOTS: IntRange

   public final val STORAGE_SLOTS: IntRange

   fun capture(player: PlayerEntity): ّ {
      val var10000: java.util.List = CollectionsKt.listOf(
         player.getEquippedStack(EquipmentSlot.HEAD).copy(),
         player.getEquippedStack(EquipmentSlot.CHEST).copy(),
         player.getEquippedStack(EquipmentSlot.LEGS).copy(),
         player.getEquippedStack(EquipmentSlot.FEET).copy()
      )
      val var10001: ItemStack = player.getEquippedStack(EquipmentSlot.OFFHAND).copy()
      var var19: java.lang.Iterable = IntRange(9, 35)
      var `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(var19, 10))
      var var7: java.util.Iterator = var19.iterator()

      while (var7.hasNext()) {
         val var34: ItemStack = player.getInventory().getStack((var7 as IntIterator).nextInt()).copy()
         `destination$iv$iv`.add(var34)
      }

      val var31: java.util.List = `destination$iv$iv` as java.util.List
      var19 = IntRange(0, 8)
      `destination$iv$iv` = ArrayList(CollectionsKt.collectionSizeOrDefault(var19, 10))
      var7 = var19.iterator()

      while (var7.hasNext()) {
         val var35: ItemStack = player.getInventory().getStack((var7 as IntIterator).nextInt()).copy()
         `destination$iv$iv`.add(var35)
      }

      ّ(var10000, var10001, var31, `destination$iv$iv` as MutableList<ItemStack>)
   }
}
