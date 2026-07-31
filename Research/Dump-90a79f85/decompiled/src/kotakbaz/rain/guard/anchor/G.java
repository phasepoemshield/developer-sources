/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.guard.anchor;

public final class G {
    public static final int a = 25;
    public static final String A = "1.21.8:25:rain-visuals";

    private G() {
        super();
    }

    public static int fold(int n) {
        return n ^ A.hashCode() ^ 0x6D248CC3;
    }
}

