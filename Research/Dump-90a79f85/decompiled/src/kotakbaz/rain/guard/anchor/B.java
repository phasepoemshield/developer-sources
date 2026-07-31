/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class B {
    public static final int a = 30;
    public static final String A = "1.21.8:30:rain-visuals";

    private B() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x82F8A8EA;
    }
}

