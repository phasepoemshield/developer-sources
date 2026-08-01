/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class j {
    public static final int a = 31;
    public static final String A = "1.21.8:31:rain-visuals";

    private j() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x87564825;
    }
}

