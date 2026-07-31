/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class F {
    public static final int a = 29;
    public static final String A = "1.21.8:29:rain-visuals";

    private F() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x7E9B09AF;
    }
}

