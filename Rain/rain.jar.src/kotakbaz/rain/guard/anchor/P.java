/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class P {
    public static final int a = 23;
    public static final String A = "1.21.8:23:rain-visuals";

    private P() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x64694E4D;
    }
}

