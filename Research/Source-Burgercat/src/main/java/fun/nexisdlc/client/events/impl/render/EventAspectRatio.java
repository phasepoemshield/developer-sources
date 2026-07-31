package fun.nexisdlc.client.events.impl.render;

import fun.nexisdlc.client.events.api.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventAspectRatio extends Event {
    private float value = 1.0f;
}
