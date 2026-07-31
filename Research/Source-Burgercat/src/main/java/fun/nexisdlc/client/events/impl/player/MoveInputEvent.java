package fun.nexisdlc.client.events.impl.player;

import fun.nexisdlc.client.events.api.Event;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class MoveInputEvent extends Event {
    public boolean forward;
    public boolean sideways;
    public float yaw;
    public float targetYaw = Float.NaN;
    public boolean needFix;
    public boolean sneaking;
    public boolean overrideForwardBackward;
    public boolean forwardPressed;
    public boolean backwardPressed;
    public boolean overrideLeftRight;
    public boolean left;
    public boolean right;
    public boolean overrideJump;
    public boolean jumpPressed;
    public boolean overrideSneak;
    public boolean sneakPressed;
}
