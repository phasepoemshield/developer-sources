package sky.core.events;

import com.darkmagician6.eventapi.events.Event;
import lombok.Getter;
import lombok.Setter;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

@Getter
@Setter
public class EventMoving implements Event {
    public Vec3d from, to, motion;
    private final boolean toGround;
    private final Box aabbFrom;
    @Getter
    public boolean ignoreHorizontal, ignoreVertical, collidedHorizontal, collidedVertical;

    public EventMoving(Vec3d from, Vec3d to, Vec3d motion, boolean toGround, boolean isCollidedHorizontal, boolean isCollidedVertical, Box aabbFrom) {
        this.from = from;
        this.to = to;
        this.motion = motion;
        this.toGround = toGround;
        this.collidedHorizontal = isCollidedHorizontal;
        this.collidedVertical = isCollidedVertical;
        this.aabbFrom = aabbFrom;
    }

    public Vec3d motion() {
        return this.motion;
    }

}
