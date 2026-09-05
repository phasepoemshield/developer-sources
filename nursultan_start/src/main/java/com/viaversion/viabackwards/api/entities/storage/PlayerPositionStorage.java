/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 */
package com.viaversion.viabackwards.api.entities.storage;

import com.viaversion.viaversion.api.connection.StorableObject;

public abstract class PlayerPositionStorage
implements StorableObject {
    private double x;
    private double y;
    private double z;

    protected PlayerPositionStorage() {
    }

    public double x() {
        return this.x;
    }

    public double z() {
        return this.z;
    }

    public double y() {
        return this.y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPosition(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void addRelativePosition(double relX, double relY, double relZ) {
        this.x += relX;
        this.y += relY;
        this.z += relZ;
    }
}

