/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Rotation
 */
package baritone.api.event.events;

import baritone.api.event.events.RotationMoveEvent$Type;
import baritone.api.utils.Rotation;

public final class RotationMoveEvent {
    private final RotationMoveEvent$Type type;
    private final Rotation original;
    private float yaw;
    private float pitch;

    public RotationMoveEvent(RotationMoveEvent$Type rotationMoveEvent$Type, float f, float f2) {
        this.type = rotationMoveEvent$Type;
        this.original = new Rotation(f, f2);
        this.yaw = f;
        this.pitch = f2;
    }

    public RotationMoveEvent$Type getType() {
        return this.type;
    }

    public float getYaw() {
        return this.yaw;
    }

    public float getPitch() {
        return this.pitch;
    }

    public Rotation getOriginal() {
        return this.original;
    }

    public void setYaw(float f) {
        this.yaw = f;
    }

    public void setPitch(float f) {
        this.pitch = f;
    }
}

