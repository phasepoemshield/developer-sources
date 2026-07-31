/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class d {
    public static final int a = 1;
    public static final String A = "1.21.8:01:rain-visuals";

    private d() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x45D9F3B;
    }
}

