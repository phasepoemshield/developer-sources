/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  org.joml.Vector3f
 */
package net.irisshaders.iris.vertices;

import minecraft.class04995;
import org.joml.Vector3f;

public class NormI8 {
    private static final int X_COMPONENT_OFFSET = 0;
    private static final int Y_COMPONENT_OFFSET = 8;
    private static final int Z_COMPONENT_OFFSET = 16;
    private static final int W_COMPONENT_OFFSET = 24;
    private static final float COMPONENT_RANGE = 127.0f;
    private static final float NORM = 0.007874016f;

    public static int pack(Vector3f vector3f, float f) {
        return NormI8.pack(vector3f.x(), vector3f.y(), vector3f.z(), f);
    }

    public static int pack(Vector3f vector3f) {
        return NormI8.pack(vector3f.x(), vector3f.y(), vector3f.z(), 0.0f);
    }

    public static int pack(float f, float f2, float f3, float f4) {
        return (int)(f * 127.0f) & 0xFF | ((int)(f2 * 127.0f) & 0xFF) << 8 | ((int)(f3 * 127.0f) & 0xFF) << 16 | ((int)(f4 * 127.0f) & 0xFF) << 24;
    }

    private static int encode(float f) {
        return (int)(class04995.N((float)f, (float)-1.0f, (float)1.0f) * 127.0f) & 0xFF;
    }

    public static float unpackZ(int n) {
        return (float)((byte)(n >> 16 & 0xFF)) * 0.007874016f;
    }

    public static float unpackX(int n) {
        return (float)((byte)(n >> 0 & 0xFF)) * 0.007874016f;
    }

    public static float unpackY(int n) {
        return (float)((byte)(n >> 8 & 0xFF)) * 0.007874016f;
    }

    public static byte toByte(float f) {
        return (byte)((byte)(f * 127.0f) & 0xFF);
    }

    public static int packColor(float f, float f2, float f3, float f4) {
        return (int)(f * 127.0f) & 0xFF | ((int)(f2 * 127.0f) & 0xFF) << 8 | ((int)(f3 * 127.0f) & 0xFF) << 16 | ((int)f4 & 0xFF) << 24;
    }

    public static float unpackW(int n) {
        return (float)((byte)(n >> 24 & 0xFF)) * 0.007874016f;
    }
}

