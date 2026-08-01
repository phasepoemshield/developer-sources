package fun.wonderful.client.modules.impl.combat.components.rotations;

import fun.wonderful.api.IMinecraft;
import fun.wonderful.api.utils.combat.rotation.Rotation;
import java.security.SecureRandom;

public abstract class БазоваяРотация
implements IMinecraft {
    protected final SecureRandom rng = new SecureRandom();
    protected float lastYaw;
    protected float lastPitch;
    protected boolean noCircling;

    public abstract void update(Rotation var1, boolean var2);

    public float getYaw() {
        return this.lastYaw;
    }

    public float getPitch() {
        return this.lastPitch;
    }

    public void setYaw(float yaw) {
        this.lastYaw = yaw;
    }

    public void setPitch(float pitch) {
        this.lastPitch = pitch;
    }

    public void setNoCircling(boolean noCircling) {
        this.noCircling = noCircling;
    }
}