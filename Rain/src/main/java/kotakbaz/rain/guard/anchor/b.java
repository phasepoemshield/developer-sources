/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class b {
    public static final int a = 6;
    public static final String A = "1.21.8:06:rain-visuals";

    private b() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x1A31BB62;
    }
}

