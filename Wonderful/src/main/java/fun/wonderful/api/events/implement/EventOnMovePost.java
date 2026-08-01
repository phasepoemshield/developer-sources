package fun.wonderful.api.events.implement;

import fun.wonderful.api.events.Event;
import lombok.Generated;
import net.minecraft.util.math.Vec3d;

public class EventOnMovePost
extends Event {
    private final float speed;
    private final Vec3d movementInput;

    @Generated
    public float getSpeed() {
        return this.speed;
    }

    @Generated
    public Vec3d getMovementInput() {
        return this.movementInput;
    }

    @Generated
    public EventOnMovePost(float speed, Vec3d movementInput) {
        this.speed = speed;
        this.movementInput = movementInput;
    }
}