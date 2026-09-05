/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.api.util;

import minecraft.class04995;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class NormI8 {
    private static final int X_COMPONENT_OFFSET = 0;
    private static final int Y_COMPONENT_OFFSET = 8;
    private static final int Z_COMPONENT_OFFSET = 16;
    private static final float COMPONENT_RANGE = 127.0f;
    private static final float NORM = 0.007874016f;

    public static int pack(float f, float f2, float f3) {
        int n = NormI8.encode(f);
        int n2 = NormI8.encode(f2);
        int n3 = NormI8.encode(f3);
        return n3 << 16 | n2 << 8 | n << 0;
    }

    public static int pack(Vector3fc vector3fc) {
        return NormI8.pack(vector3fc.x(), vector3fc.y(), vector3fc.z());
    }

    public static Vector3f unpack(int n, Vector3f vector3f) {
        return vector3f.set(NormI8.unpackX(n), NormI8.unpackY(n), NormI8.unpackZ(n));
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

    public static boolean isOpposite(int n, int n2) {
        byte by = (byte)(n >> 0);
        byte by2 = (byte)(n >> 8);
        byte by3 = (byte)(n >> 16);
        byte by4 = (byte)(n2 >> 0);
        byte by5 = (byte)(n2 >> 8);
        byte by6 = (byte)(n2 >> 16);
        return by == -by4 && by2 == -by5 && by3 == -by6;
    }

    public static int flipPacked(int n) {
        int n2 = (n >> 0 & 0xFF) * -1 & 0xFF;
        int n3 = (n >> 8 & 0xFF) * -1 & 0xFF;
        int n4 = (n >> 16 & 0xFF) * -1 & 0xFF;
        return n4 << 16 | n3 << 8 | n2 << 0;
    }
}

