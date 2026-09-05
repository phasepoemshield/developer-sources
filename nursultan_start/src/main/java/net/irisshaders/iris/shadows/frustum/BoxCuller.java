/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 */
package net.irisshaders.iris.shadows.frustum;

import minecraft.class00734;

public class BoxCuller {
    private final double maxDistance;
    private double minAllowedX;
    private double maxAllowedX;
    private double minAllowedY;
    private double maxAllowedY;
    private double minAllowedZ;
    private double maxAllowedZ;

    public BoxCuller(double d) {
        this.maxDistance = d;
    }

    public String toString() {
        return "Box Culling active; max distance " + this.maxDistance;
    }

    public int intersectAab(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d4 < -this.maxDistance || d > this.maxDistance) {
            return -3;
        }
        if (d5 < -this.maxDistance || d2 > this.maxDistance) {
            return -3;
        }
        if (d6 < -this.maxDistance || d3 > this.maxDistance) {
            return -3;
        }
        if (d >= -this.maxDistance && d4 <= this.maxDistance && d2 >= -this.maxDistance && d5 <= this.maxDistance && d3 >= -this.maxDistance && d6 <= this.maxDistance) {
            return -2;
        }
        return -1;
    }

    public void setPosition(double d, double d2, double d3) {
        this.minAllowedX = d - this.maxDistance;
        this.maxAllowedX = d + this.maxDistance;
        this.minAllowedY = d2 - this.maxDistance;
        this.maxAllowedY = d2 + this.maxDistance;
        this.minAllowedZ = d3 - this.maxDistance;
        this.maxAllowedZ = d3 + this.maxDistance;
    }

    public boolean isCulledSodium(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d4 < -this.maxDistance || d > this.maxDistance) {
            return true;
        }
        if (d5 < -this.maxDistance || d2 > this.maxDistance) {
            return true;
        }
        return d6 < -this.maxDistance || d3 > this.maxDistance;
    }

    public boolean isCulled(double d, double d2, double d3, double d4, double d5, double d6) {
        if (d4 < this.minAllowedX || d > this.maxAllowedX) {
            return true;
        }
        if (d5 < this.minAllowedY || d2 > this.maxAllowedY) {
            return true;
        }
        return d6 < this.minAllowedZ || d3 > this.maxAllowedZ;
    }

    public boolean isCulled(class00734 class007342) {
        return this.isCulled((float)class007342.N, (float)class007342.y, (float)class007342.L, (float)class007342.u, (float)class007342.i, (float)class007342.R);
    }
}

