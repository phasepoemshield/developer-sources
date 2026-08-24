package moscow.rockstar.util.inventory.group.impl;

import java.util.List;
import moscow.rockstar.util.inventory.group.SlotGroup;
import moscow.rockstar.util.inventory.slots.OffhandSlot;

public class OffhandSlotGroup extends SlotGroup<OffhandSlot> {
   public OffhandSlotGroup() {
      super(List.of(new OffhandSlot()));
   }
}
