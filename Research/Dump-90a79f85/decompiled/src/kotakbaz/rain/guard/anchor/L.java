/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class L {
    public static final int a = 7;
    public static final String A = "1.21.8:07:rain-visuals";

    private L() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x1E8F5A9D;
    }
}

