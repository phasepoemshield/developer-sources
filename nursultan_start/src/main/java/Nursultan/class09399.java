/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  org.joml.Vector3fc
 */
package Nursultan;

import minecraft.class00734;
import org.joml.Vector3fc;

public class class09399 {
    private float N = Float.POSITIVE_INFINITY;
    private float y = Float.POSITIVE_INFINITY;
    private float L = Float.POSITIVE_INFINITY;
    private float u = Float.NEGATIVE_INFINITY;
    private float i = Float.NEGATIVE_INFINITY;
    private float R = Float.NEGATIVE_INFINITY;

    public void N(Vector3fc vector3fc) {
        this.N = Math.min(this.N, vector3fc.x());
        this.y = Math.min(this.y, vector3fc.y());
        this.L = Math.min(this.L, vector3fc.z());
        this.u = Math.max(this.u, vector3fc.x());
        this.i = Math.max(this.i, vector3fc.y());
        this.R = Math.max(this.R, vector3fc.z());
    }

    public class00734 N() {
        return new class00734((double)this.N, (double)this.y, (double)this.L, (double)this.u, (double)this.i, (double)this.R);
    }
}

