/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class04452 {
    private static final String[] N = new String[]{"O o o", "o O o", "o o O", "o O o"};
    private static final long y = 300L;

    public static String N(long l) {
        int n = (int)(l / 300L % (long)N.length);
        return N[n];
    }
}

