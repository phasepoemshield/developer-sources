/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class N {
    public static final int a = 2;
    public static final String A = "1.21.8:02:rain-visuals";

    private N() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x8BB3E76;
    }
}

