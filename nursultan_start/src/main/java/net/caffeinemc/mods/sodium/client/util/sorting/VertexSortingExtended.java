/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03337
 *  org.joml.Vector3f
 */
package net.caffeinemc.mods.sodium.client.util.sorting;

import minecraft.class03337;
import org.joml.Vector3f;

public interface VertexSortingExtended
extends class03337 {
    public float applyMetric(float var1, float var2, float var3);

    default public float applyMetric(Vector3f vector3f) {
        return this.applyMetric(vector3f.x, vector3f.y, vector3f.z);
    }
}

