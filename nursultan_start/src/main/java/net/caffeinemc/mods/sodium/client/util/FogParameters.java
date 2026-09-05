/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Vector4f
 */
package net.caffeinemc.mods.sodium.client.util;

import org.joml.Vector4f;

public record FogParameters(float red, float green, float blue, float alpha, float environmentalStart, float environmentalEnd, float renderStart, float renderEnd, float cullDistance) {
    public static final FogParameters NONE = new FogParameters(Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, Float.MAX_VALUE, -3.4028235E38f);

    public FogParameters(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this(f, f2, f3, f4, f5, f6, f7, f8, Float.isNaN(f6) ? f8 : Math.min(f8, f6));
    }

    public FogParameters(Vector4f vector4f, FogParameters fogParameters) {
        this(vector4f.x, vector4f.y, vector4f.z, vector4f.w, fogParameters.environmentalStart, fogParameters.environmentalEnd, fogParameters.renderStart, fogParameters.renderEnd);
    }
}

