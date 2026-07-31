package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import com.darkmagician6.eventapi.events.callables.EventCancellable;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.ItemStack;

@Data
@AllArgsConstructor
public class EventWindowClick extends EventCancellable implements Event {
    private int windowId;
    private int slotId;
    private int mouseButton;
    private SlotActionType type;
    private ItemStack clickedItemIn;
    private short actionNumberIn;
}
