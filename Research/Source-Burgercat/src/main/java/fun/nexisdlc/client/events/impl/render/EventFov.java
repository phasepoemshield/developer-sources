package fun.nexisdlc.client.events.impl.render;

import fun.nexisdlc.client.events.api.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventFov extends Event {
    private int fov = 70;
    private float tickDelta = 1.0f;
    private boolean changingFov = true;
}
