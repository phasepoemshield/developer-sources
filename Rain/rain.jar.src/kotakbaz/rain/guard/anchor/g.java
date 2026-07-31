/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class g {
    public static final int a = 12;
    public static final String A = "1.21.8:12:rain-visuals";

    private g() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x346376C4;
    }
}

