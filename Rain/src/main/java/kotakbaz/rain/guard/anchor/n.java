/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class n {
    public static final int a = 22;
    public static final String A = "1.21.8:22:rain-visuals";

    private n() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x600BAF12;
    }
}

