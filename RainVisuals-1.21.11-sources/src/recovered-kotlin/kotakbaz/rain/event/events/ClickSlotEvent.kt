package kotakbaz.rain.event.events

import net.minecraft.screen.slot.SlotActionType
import oxxxde.سض

// $VF: Compiled from ClickSlotEvent.kt
public class ClickSlotEvent : سض {
   private SlotActionType slotActionType;
   public final val syncId: Int
   public final val slot: Int
   public final val button: Int

   fun getSlotActionType(): SlotActionType {
      this.slotActionType
   }

   fun ClickSlotEvent(syncId: SlotActionType, button: Int, slot: Int, slotActionType: Int) {
      this.slotActionType = slotActionType
      this.slot = slot
      this.button = button
      this.syncId = syncId
   }
}
