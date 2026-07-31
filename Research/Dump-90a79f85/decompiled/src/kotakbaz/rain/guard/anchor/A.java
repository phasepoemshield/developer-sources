/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class A {
    public static final int a = 27;
    public static final String A = "1.21.8:27:rain-visuals";

    private A() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x75DFCB39;
    }
}

