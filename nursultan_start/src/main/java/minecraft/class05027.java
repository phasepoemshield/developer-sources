/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 */
package minecraft;

import minecraft.class07211;

public class class05027 {
    private static final int N = 4;
    private static final int y = 6;
    private static final long L = 15L;
    private static final long u = 1008L;
    private static final long i = 1024L;
    private static final long R = 2048L;

    private static long L(long l, class07211 class072112) {
        return l & (1L << class072112.ordinal() + 4 ^ 0xFFFFFFFFFFFFFFFFL);
    }

    public static boolean L(long l) {
        return (l & 0x800L) != 0L;
    }

    private static long y(long l, class07211 class072112) {
        return l | 1L << class072112.ordinal() + 4;
    }

    public static long y(int n, boolean bl, class07211 class072112) {
        long l = 0L;
        if (bl) {
            l |= 0x400L;
        }
        l = class05027.y(l, class072112);
        return class05027.N(l, n);
    }

    public static boolean y(long l) {
        return (l & 0x400L) != 0L;
    }

    public static long N(int n, class07211 class072112) {
        return class05027.N(class05027.L(1008L, class072112), n);
    }

    public static boolean N(long l, class07211 class072112) {
        return (l & 1L << class072112.ordinal() + 4) != 0L;
    }

    private static long N(long l, int n) {
        return l & 0xFFFFFFFFFFFFFFF0L | (long)n & 0xFL;
    }

    public static int N(long l) {
        return (int)(l & 0xFL);
    }

    public static long N(int n, boolean bl, class07211 class072112) {
        long l = class05027.L(1008L, class072112);
        if (bl) {
            l |= 0x400L;
        }
        return class05027.N(l, n);
    }

    public static long N(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        long l = class05027.N(0L, 15);
        if (bl) {
            l = class05027.y(l, class07211.field_11033);
        }
        if (bl2) {
            l = class05027.y(l, class07211.field_11043);
        }
        if (bl3) {
            l = class05027.y(l, class07211.field_11035);
        }
        if (bl4) {
            l = class05027.y(l, class07211.field_11039);
        }
        if (bl5) {
            l = class05027.y(l, class07211.field_11034);
        }
        return l;
    }

    public static long N(int n) {
        return class05027.N(1008L, n);
    }

    public static long N(int n, boolean bl) {
        long l = 1008L;
        l |= 0x800L;
        if (bl) {
            l |= 0x400L;
        }
        return class05027.N(l, n);
    }
}

