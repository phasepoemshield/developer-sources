/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class k {
    public static final int a = 14;
    public static final String A = "1.21.8:14:rain-visuals";

    private k() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x3D1EB53A;
    }
}

