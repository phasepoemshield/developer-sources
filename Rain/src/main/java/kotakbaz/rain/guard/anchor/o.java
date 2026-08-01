/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class o {
    public static final int a = 11;
    public static final String A = "1.21.8:11:rain-visuals";

    private o() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x3005D789;
    }
}

