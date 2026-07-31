/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class H {
    public static final int a = 16;
    public static final String A = "1.21.8:16:rain-visuals";

    private H() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x45D9F3B0;
    }
}

