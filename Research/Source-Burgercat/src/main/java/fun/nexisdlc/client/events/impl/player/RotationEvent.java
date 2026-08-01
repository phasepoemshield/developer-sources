package fun.nexisdlc.client.events.impl.player;

import fun.nexisdlc.client.events.api.Event;
import fun.nexisdlc.client.utils.player.rotation.CorrectionType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import net.minecraft.entity.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
public class RotationEvent extends Event {
    public float yaw, pitch;
    public CorrectionType correctionType;
    public Entity target;
    public float targetYaw = Float.NaN;

    @Getter
    static RotationEvent lastRotationEvent;

    public RotationEvent(float yaw, float pitch, CorrectionType correctionType) {
        this.yaw = yaw;
        this.pitch = clampPitch(pitch);
        this.correctionType = correctionType;
        this.target = null;
        this.targetYaw = Float.NaN;

        lastRotationEvent = this;
    }

    public void rotate(float yaw, float pitch, CorrectionType correctionType) {
        this.yaw = yaw;
        this.pitch = clampPitch(pitch);
        this.correctionType = correctionType;
        this.target = null;
        this.targetYaw = Float.NaN;

        lastRotationEvent = this;
    }

    public void rotate(float yaw, float pitch, CorrectionType correctionType, Entity target) {
        this.yaw = yaw;
        this.pitch = clampPitch(pitch);
        this.correctionType = correctionType;
        this.target = target;
        this.targetYaw = Float.NaN;
    }

    public void rotate(float yaw, float pitch, CorrectionType correctionType, Entity target, float targetYaw) {
        this.yaw = yaw;
        this.pitch = clampPitch(pitch);
        this.correctionType = correctionType;
        this.target = target;
        this.targetYaw = targetYaw;
    }

    public boolean hasTarget() {
        return target != null;
    }

    public boolean hasTargetYaw() {
        return !Float.isNaN(targetYaw);
    }

    private static float clampPitch(float pitch) {
        if (!Float.isFinite(pitch)) {
            return 0f;
        }
        if (pitch > 90f) return 90f;
        if (pitch < -90f) return -90f;
        return pitch;
    }
}
