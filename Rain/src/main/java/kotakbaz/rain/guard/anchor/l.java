/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class l {
    public static final int a = 8;
    public static final String A = "1.21.8:08:rain-visuals";

    private l() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x22ECF9D8;
    }
}

