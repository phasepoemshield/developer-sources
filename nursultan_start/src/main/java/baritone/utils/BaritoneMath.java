/*
 * Decompiled with CFR 0.152.
 */
package baritone.utils;

public final class BaritoneMath {
    private static final double FLOOR_DOUBLE_D = 1.073741824E9;
    private static final int FLOOR_DOUBLE_I = 0x40000000;

    private BaritoneMath() {
    }

    public static int fastFloor(double d) {
        return (int)(d + 1.073741824E9) - 0x40000000;
    }

    public static int fastCeil(double d) {
        return 0x40000000 - (int)(1.073741824E9 - d);
    }
}

