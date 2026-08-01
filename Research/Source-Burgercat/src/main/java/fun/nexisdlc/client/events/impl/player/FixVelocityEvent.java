package fun.nexisdlc.client.events.impl.player;

import fun.nexisdlc.client.events.api.Event;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class FixVelocityEvent extends Event {
    float yaw;
    float targetYaw = Float.NaN;

    public FixVelocityEvent(float yaw) {
        this.yaw = yaw;
    }
}