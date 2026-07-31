/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class M {
    public static final int a = 20;
    public static final String A = "1.21.8:20:rain-visuals";

    private M() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x5750709C;
    }
}

