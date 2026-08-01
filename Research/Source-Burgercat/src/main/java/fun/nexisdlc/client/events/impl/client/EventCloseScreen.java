package fun.nexisdlc.client.events.impl.client;

import fun.nexisdlc.client.events.api.Event;
import lombok.Getter;
import net.minecraft.client.gui.screen.Screen;

@Getter
public class EventCloseScreen extends Event {
    private final Screen screen;

    public EventCloseScreen(Screen screen) {
        this.screen = screen;
    }
}
