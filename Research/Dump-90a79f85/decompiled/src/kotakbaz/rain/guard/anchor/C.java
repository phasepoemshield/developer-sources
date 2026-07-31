/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class C {
    public static final int a = 4;
    public static final String A = "1.21.8:04:rain-visuals";

    private C() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x11767CEC;
    }
}

