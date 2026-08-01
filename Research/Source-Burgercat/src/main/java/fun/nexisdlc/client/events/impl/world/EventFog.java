package fun.nexisdlc.client.events.impl.world;

import fun.nexisdlc.client.events.api.Event;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EventFog extends Event {
    private float distance;
    private int color;
}
