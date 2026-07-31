/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class J {
    public static final int a = 17;
    public static final String A = "1.21.8:17:rain-visuals";

    private J() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x4A3792EB;
    }
}

