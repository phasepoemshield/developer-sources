/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01818
 *  minecraft.class01828
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class07529
 */
package minecraft;

import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01818;
import minecraft.class01828;
import minecraft.class03877;
import minecraft.class03896;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class07529;

public final class class03867 {
    private static final float N = 0.4f;
    private static final int y = 20;
    private static final double L = 0.2;
    private static final float u = 0.7f;
    private static final float i = 0.1f;
    private static final float R = 0.3f;
    private static final float M = 0.6f;
    private static final float B = 0.02f;
    private static final float Z = -0.3f;

    private class03867() {
    }

    protected static class01828 N(class03877 class038772, class03877 class038773, class03877 class038774, class01818 class018182) {
        class00500 class005002 = class07529.NN ? class00869.N.W() : null;
        return class038752 -> {
            double d = class038772.N(class038752);
            int n = class038752.L();
            class03896 class038962 = d > 0.0 ? class03896.field_33603 : class03896.field_33604;
            double d2 = Math.abs(d);
            int n2 = class038962.field_33608 - n;
            int n3 = n - class038962.field_33607;
            if (n3 < 0 || n2 < 0) {
                return class005002;
            }
            double d3 = class04995.N((double)Math.min(n2, n3), (double)0.0, (double)20.0, (double)-0.2, (double)0.0);
            if (d2 + d3 < (double)0.4f) {
                return class005002;
            }
            class06069 class060692 = class018182.N(class038752.y(), n, class038752.u());
            if (class060692.z() > 0.7f) {
                return class005002;
            }
            if (class038773.N(class038752) >= 0.0) {
                return class005002;
            }
            double d4 = class04995.N((double)d2, (double)0.4f, (double)0.6f, (double)0.1f, (double)0.3f);
            if ((double)class060692.z() < d4 && class038774.N(class038752) > (double)-0.3f) {
                return class060692.z() < 0.02f ? class038962.field_33668 : class038962.field_33605;
            }
            return class07529.NN ? class00869.BE.W() : class038962.field_33606;
        };
    }
}

