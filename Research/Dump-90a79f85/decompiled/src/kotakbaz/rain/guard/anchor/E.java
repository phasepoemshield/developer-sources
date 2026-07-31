/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class E {
    public static final int a = 5;
    public static final String A = "1.21.8:05:rain-visuals";

    private E() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x15D41C27;
    }
}

