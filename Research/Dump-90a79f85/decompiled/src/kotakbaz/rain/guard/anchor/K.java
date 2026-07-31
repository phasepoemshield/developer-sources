/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class K {
    public static final int a = 21;
    public static final String A = "1.21.8:21:rain-visuals";

    private K() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x5BAE0FD7;
    }
}

