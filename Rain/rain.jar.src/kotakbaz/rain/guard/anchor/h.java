/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class h {
    public static final int a = 3;
    public static final String A = "1.21.8:03:rain-visuals";

    private h() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0xD18DDB1;
    }
}

