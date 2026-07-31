/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class c {
    public static final int a = 18;
    public static final String A = "1.21.8:18:rain-visuals";

    private c() {
    }

    public static int fold(int input) {
        return input ^ A.hashCode() ^ 0x4E953226;
    }
}

