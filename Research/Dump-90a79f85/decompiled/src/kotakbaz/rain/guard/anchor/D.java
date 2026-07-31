/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class D {
    public static final int a = 9;
    public static final String A = "1.21.8:09:rain-visuals";

    private D() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x274A9913;
    }
}

