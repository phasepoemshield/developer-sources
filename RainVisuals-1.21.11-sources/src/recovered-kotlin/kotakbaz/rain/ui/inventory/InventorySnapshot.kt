package kotakbaz.rain.ui.inventory

import java.util.ArrayList
import net.minecraft.class_1799
import net.minecraft.item.ItemStack
import oxxxde.تء
import oxxxde.ّ

// $VF: Compiled from heavy
public data class InventorySnapshot {
   @JvmStatic
   private IntRange STORAGE_SLOTS = IntRange(InventorySnapshot.INVENTORY_SLOTS.getFirst(), InventorySnapshot.HOTBAR_SLOTS.getLast());
   public final val armor: List<class_1799>
   @JvmStatic
   public int OFFHAND_SLOT = 45;
   public final val hotbar: List<class_1799>
   @JvmStatic
   private IntRange INVENTORY_SLOTS = IntRange(9, 35);
   @JvmStatic
   private IntRange ARMOR_SLOTS = IntRange(5, 8);
   public final val inventory: List<class_1799>
   @JvmStatic
   public تء Companion = تء(null);
   @JvmStatic
   private IntRange HOTBAR_SLOTS = IntRange(36, 44);
   private ItemStack offhand;
   @JvmStatic
   private IntRange MANAGED_SLOTS = IntRange(ARMOR_SLOTS.getFirst(), 45);

   public override fun toString(): String {
      return "InventorySnapshot(armor=${this.armor}, offhand=${this.offhand}, inventory=${this.inventory}, hotbar=${this.hotbar})"
   }

   public operator fun component4(): List<class_1799> {
      return this.hotbar
   }

   fun getOffhand(): ItemStack {
      this.offhand
   }

   public override fun hashCode(): Int {
      return ((this.armor.hashCode() * 31 + this.offhand.hashCode()) * 31 + this.inventory.hashCode()) * 31 + this.hotbar.hashCode()
   }

   fun component2(): ItemStack {
      this.offhand
   }

   fun expectedAt(menuSlot: Int): ItemStack {
      val var10000: ItemStack
      if (menuSlot <= ARMOR_SLOTS.getLast() && ARMOR_SLOTS.getFirst() <= menuSlot) {
         var10000 = this.armor.get(menuSlot - ARMOR_SLOTS.getFirst())
      } else if (menuSlot <= INVENTORY_SLOTS.getLast() && INVENTORY_SLOTS.getFirst() <= menuSlot) {
         var10000 = this.inventory.get(menuSlot - INVENTORY_SLOTS.getFirst())
      } else if (menuSlot <= HOTBAR_SLOTS.getLast() && HOTBAR_SLOTS.getFirst() <= menuSlot) {
         var10000 = this.hotbar.get(menuSlot - HOTBAR_SLOTS.getFirst())
      } else if (menuSlot == 45) {
         var10000 = this.offhand
      } else {
         var10000 = ItemStack.EMPTY
      }

      var10000
   }

   public fun deepCopy(): ّ {
      val `$this$mapTo$iv$iv`: java.lang.Iterable = this.armor
      var `destination$iv$iv`: java.util.Collection = ArrayList(CollectionsKt.collectionSizeOrDefault(this.armor, 10))

      for (`item$iv$iv` in `$this$mapTo$iv$iv`) {
         val var10000: ItemStack = (`item$iv$iv` as ItemStack).copy()
         `destination$iv$iv`.add(var10000)
      }

      val var42: java.util.List = `destination$iv$iv` as java.util.List
      val var10001: ItemStack = this.offhand.copy()
      var var18: java.lang.Iterable = this.inventory
      `destination$iv$iv` = ArrayList(CollectionsKt.collectionSizeOrDefault(this.inventory, 10))

      for (var30 in var18) {
         val var43: ItemStack = (var30 as ItemStack).copy()
         `destination$iv$iv`.add(var43)
      }

      val var39: java.util.List = `destination$iv$iv` as java.util.List
      var18 = this.hotbar
      `destination$iv$iv` = ArrayList(CollectionsKt.collectionSizeOrDefault(this.hotbar, 10))

      for (var31 in var18) {
         val var44: ItemStack = (var31 as ItemStack).copy()
         `destination$iv$iv`.add(var44)
      }

      return InventorySnapshot(var42, var10001, var39, `destination$iv$iv` as MutableList<ItemStack>)
   }

   public override operator fun equals(other: Any?): Boolean {
      label40@
      if (this === other) {
         return true
      } else {
         return other is InventorySnapshot
            && this.armor == (other as InventorySnapshot).armor
            && this.offhand == (other as InventorySnapshot).offhand
            && this.inventory == (other as InventorySnapshot).inventory
            && this.hotbar == (other as InventorySnapshot).hotbar
         }
   }

   public operator fun component3(): List<class_1799> {
      return this.inventory
   }

   public operator fun component1(): List<class_1799> {
      return this.armor
   }

   fun copy(hotbar: MutableList<ItemStack>, offhand: ItemStack, inventory: MutableList<ItemStack>, armor: MutableList<ItemStack>): InventorySnapshot {
      InventorySnapshot(armor, offhand, inventory, hotbar)
   }

   fun InventorySnapshot(armor: MutableList<ItemStack>, hotbar: ItemStack, inventory: MutableList<ItemStack>, offhand: MutableList<ItemStack>) {
      this.armor = armor
      this.offhand = offhand
      this.inventory = inventory
      this.hotbar = hotbar
   }
}
