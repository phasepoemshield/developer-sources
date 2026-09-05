/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package squeek.appleskin.client;

import squeek.appleskin.helpers.ColorHelper;

enum TooltipOverlayHandler$FoodOutline {
    NEGATIVE,
    EXTRA,
    NORMAL,
    PARTIAL,
    MISSING;


    public static TooltipOverlayHandler$FoodOutline get(int n, int n2, int n3) {
        if (n < 0) {
            return NEGATIVE;
        }
        if (n > n2 && n2 <= n3) {
            return EXTRA;
        }
        if (n > n3 + 1 || n2 == n) {
            return NORMAL;
        }
        if (n == n3 + 1) {
            return PARTIAL;
        }
        return MISSING;
    }

    public int argb() {
        return switch (this.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> ColorHelper.argbFromRGBA(1.0f, 1.0f, 1.0f, 1.0f);
            case 1 -> ColorHelper.argbFromRGBA(0.06f, 0.32f, 0.02f, 1.0f);
            case 2 -> ColorHelper.argbFromRGBA(0.0f, 0.0f, 0.0f, 1.0f);
            case 3 -> ColorHelper.argbFromRGBA(0.53f, 0.21f, 0.08f, 1.0f);
            case 4 -> ColorHelper.argbFromRGBA(0.62f, 0.0f, 0.0f, 0.5f);
        };
    }
}

