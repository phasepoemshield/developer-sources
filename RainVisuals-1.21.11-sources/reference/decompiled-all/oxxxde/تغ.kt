package oxxxde

import net.minecraft.screen.slot.SlotActionType

// $VF: Compiled from ClickSlotEvent.kt
public class تغ : سض {
   private SlotActionType slotActionType;
   public final val syncId: Int
   public final val slot: Int
   public final val button: Int

   fun getSlotActionType(): SlotActionType {
      this.slotActionType
   }

   fun تغ(syncId: SlotActionType, button: Int, slot: Int, slotActionType: Int) {
      this.slotActionType = slotActionType
      this.slot = slot
      this.button = button
      this.syncId = syncId
   }
}
