package fun.wonderful.api.events.implement;

import fun.wonderful.api.events.Event;
import lombok.Generated;

public class EventMotion
extends Event {
    private float yaw;
    private float pitch;
    private boolean ground;

    public EventMotion(float yaw, float pitch, boolean ground) {
        this.yaw = yaw;
        this.pitch = pitch;
        this.ground = ground;
    }

    @Generated
    public float getYaw() {
        return this.yaw;
    }

    @Generated
    public float getPitch() {
        return this.pitch;
    }

    @Generated
    public boolean isGround() {
        return this.ground;
    }

    @Generated
    public void setYaw(float yaw) {
        this.yaw = yaw;
    }

    @Generated
    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    @Generated
    public void setGround(boolean ground) {
        this.ground = ground;
    }
}