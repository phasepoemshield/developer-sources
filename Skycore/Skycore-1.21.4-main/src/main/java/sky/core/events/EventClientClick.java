package sky.core.events;

import net.minecraft.text.ClickEvent;

public class EventClientClick extends ClickEvent {
    public EventClientClick(Action action, String value) {
        super(action, value);
    }
}
