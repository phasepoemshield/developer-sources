package fun.nexisdlc.client.utils.player.rotation;

import fun.nexisdlc.client.utils.math.MathUtil;
import lombok.Data;

@Data
public class RotateVector {
    public float yaw;
    public float pitch;

    public RotateVector(float yaw, float pitch) {
        this.yaw = yaw;
        this.pitch = MathUtil.clamp(pitch, -90, 90);
    }

    public void setPitch(float pitch) {
        this.pitch = MathUtil.clamp(pitch, -90, 90);
    }

    public void setRotation(float yaw, float pitch) {
        this.yaw = yaw;
        this.pitch = MathUtil.clamp(pitch, -90, 90);
    }

    public void setRotation(RotateVector rotateVector) {
        this.setRotation(rotateVector.getYaw(), rotateVector.getPitch());
    }
}