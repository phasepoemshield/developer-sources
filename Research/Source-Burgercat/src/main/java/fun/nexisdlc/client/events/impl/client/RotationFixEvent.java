package fun.nexisdlc.client.events.impl.client;

import fun.nexisdlc.client.events.api.Event;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.minecraft.util.math.MathHelper;

@EqualsAndHashCode(callSuper = true)
@Data
public class RotationFixEvent extends Event {
    float yaw;
    float pitch;

    public float getYaw() {
        if (!Float.isFinite(yaw)) {
            return 0f;
        }
        return yaw == 0.0f ? 0.0f : yaw;
    }

    public void setYaw(float yaw) {
        if (!Float.isFinite(yaw)) {
            this.yaw = 0f;
            return;
        }
        this.yaw = yaw == 0.0f ? 0.0f : yaw;
    }

    public float getPitch() {
        if (!Float.isFinite(pitch)) {
            return 0f;
        }
        return MathHelper.clamp(pitch, -90f, 90f);
    }

    public void setPitch(float pitch) {
        if (!Float.isFinite(pitch)) {
            this.pitch = 0f;
            return;
        }
        this.pitch = MathHelper.clamp(pitch, -90f, 90f);
    }
}