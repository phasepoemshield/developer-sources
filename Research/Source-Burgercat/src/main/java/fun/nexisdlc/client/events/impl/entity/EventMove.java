package fun.nexisdlc.client.events.impl.entity;

import fun.nexisdlc.client.events.api.Event;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.minecraft.util.math.Vec3d;

@EqualsAndHashCode(callSuper = true)
@Data
public class EventMove extends Event {
    private double x, y, z;

    public EventMove(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vec3d getMovement() {
        return new Vec3d(x, y, z);
    }

    public void setMovement(Vec3d movement) {
        this.x = movement.x;
        this.y = movement.y;
        this.z = movement.z;
    }
}
