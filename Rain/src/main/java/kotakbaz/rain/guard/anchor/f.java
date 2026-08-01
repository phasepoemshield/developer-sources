/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class f {
    public static final int a = 13;
    public static final String A = "1.21.8:13:rain-visuals";

    private f() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x38C115FF;
    }
}

