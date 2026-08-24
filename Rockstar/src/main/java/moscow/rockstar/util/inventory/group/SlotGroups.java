package moscow.rockstar.util.inventory.group;

import moscow.rockstar.util.inventory.group.impl.ArmorSlotsGroup;
import moscow.rockstar.util.inventory.group.impl.HotbarSlotsGroup;
import moscow.rockstar.util.inventory.group.impl.InventorySlotsGroup;
import moscow.rockstar.util.inventory.group.impl.OffhandSlotGroup;
import moscow.rockstar.util.inventory.slots.ArmorSlot;
import moscow.rockstar.util.inventory.slots.HotbarSlot;
import moscow.rockstar.util.inventory.slots.InventorySlot;
import moscow.rockstar.util.inventory.slots.OffhandSlot;

public class SlotGroups {
   private SlotGroups() {
   }

   public static SlotGroup<HotbarSlot> hotbar() {
      return new HotbarSlotsGroup();
   }

   public static SlotGroup<InventorySlot> inventory() {
      return new InventorySlotsGroup();
   }

   public static SlotGroup<ArmorSlot> armor() {
      return new ArmorSlotsGroup();
   }

   public static SlotGroup<OffhandSlot> offhand() {
      return new OffhandSlotGroup();
   }
}
