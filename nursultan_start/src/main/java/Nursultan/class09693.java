/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class09693 {
    public static float N(float f, float f2) {
        if (!Float.isFinite(f)) {
            return f;
        }
        if (!Float.isFinite(f2) || f2 <= 0.0f) {
            return f;
        }
        return (float)Math.round(f * f2) / f2;
    }

    public static float N(float f) {
        return class09693.N(f, 0.0f, 1.0f);
    }

    public static int N(int n, int n2, int n3) {
        return Math.min(Math.max(n, n2), n3);
    }

    public static float N(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }
}

