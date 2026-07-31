/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class I {
    public static final int a = 19;
    public static final String A = "1.21.8:19:rain-visuals";

    private I() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x52F2D161;
    }
}

