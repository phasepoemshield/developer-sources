/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class e {
    public static final int a = 15;
    public static final String A = "1.21.8:15:rain-visuals";

    private e() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x417C5475;
    }
}

