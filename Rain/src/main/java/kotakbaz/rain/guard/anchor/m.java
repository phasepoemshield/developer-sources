/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class m {
    public static final int a = 10;
    public static final String A = "1.21.8:10:rain-visuals";

    private m() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x2BA8384E;
    }
}

