/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.Rotation
 */
package baritone.pathing.movement;

import baritone.api.utils.Rotation;
import java.util.Optional;

public class MovementState$MovementTarget {
    public Rotation rotation;
    private boolean forceRotations;

    public MovementState$MovementTarget() {
        this(null, false);
    }

    public MovementState$MovementTarget(Rotation rotation, boolean bl) {
        this.rotation = rotation;
        this.forceRotations = bl;
    }

    public final Optional<Rotation> getRotation() {
        return Optional.ofNullable(this.rotation);
    }

    public boolean hasToForceRotations() {
        return this.forceRotations;
    }
}

