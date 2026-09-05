/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class05533 {
    private static final long N = 6364136223846793005L;
    private static final long y = 1442695040888963407L;

    public static long N(long l, long l2) {
        l *= l * 6364136223846793005L + 1442695040888963407L;
        return l += l2;
    }
}

