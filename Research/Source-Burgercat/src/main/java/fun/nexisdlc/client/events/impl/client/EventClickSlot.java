package fun.nexisdlc.client.events.impl.client;

import fun.nexisdlc.client.events.api.Event;
import net.minecraft.screen.slot.SlotActionType;

public class EventClickSlot extends Event {
    public final int windowId;
    public final int slotId;
    public final int button;
    public final SlotActionType actionType;

    public EventClickSlot(int windowId, int slotId, int button, SlotActionType actionType) {
        this.windowId = windowId;
        this.slotId = slotId;
        this.button = button;
        this.actionType = actionType;
    }
}
