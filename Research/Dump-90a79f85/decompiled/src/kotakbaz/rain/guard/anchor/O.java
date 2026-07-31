/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class O {
    public static final int a = 26;
    public static final String A = "1.21.8:26:rain-visuals";

    private O() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x71822BFE;
    }
}

