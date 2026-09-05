/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.Position
 *  minecraft.class06889
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.api.Position;
import java.util.Objects;
import minecraft.class06889;

public class PositionImpl
implements Position {
    private final class06889 position;

    public PositionImpl(class06889 class068892) {
        this.position = class068892;
    }

    public PositionImpl(double d, double d2, double d3) {
        this.position = new class06889(d, d2, d3);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        PositionImpl positionImpl = (PositionImpl)object;
        return Objects.equals(this.position, positionImpl.position);
    }

    public int hashCode() {
        return this.position != null ? this.position.hashCode() : 0;
    }

    public double getY() {
        return this.position.B;
    }

    public double getX() {
        return this.position.M;
    }

    public double getZ() {
        return this.position.Z;
    }

    public class06889 getPosition() {
        return this.position;
    }
}

