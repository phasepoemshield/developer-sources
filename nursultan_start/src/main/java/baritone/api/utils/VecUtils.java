/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class05989
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 */
package baritone.api.utils;

import minecraft.class00494;
import minecraft.class00500;
import minecraft.class05989;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;

public final class VecUtils {
    private VecUtils() {
    }

    public static class06889 getBlockPosCenter(class07209 class072092) {
        return new class06889((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5);
    }

    public static double distanceToCenter(class07209 class072092, double d, double d2, double d3) {
        double d4 = (double)class072092.method_10263() + 0.5 - d;
        double d5 = (double)class072092.method_10264() + 0.5 - d2;
        double d6 = (double)class072092.method_10260() + 0.5 - d3;
        return Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public static class06889 calculateBlockCenter(class07299 class072992, class07209 class072092) {
        class00500 class005002 = class072992.method_8320(class072092);
        class00494 class004942 = class005002.M((class07290)class072992, class072092);
        if (class004942.method_1110()) {
            return VecUtils.getBlockPosCenter(class072092);
        }
        double d = (class004942.method_1091(class07185.field_11048) + class004942.method_1105(class07185.field_11048)) / 2.0;
        double d2 = (class004942.method_1091(class07185.field_11052) + class004942.method_1105(class07185.field_11052)) / 2.0;
        double d3 = (class004942.method_1091(class07185.field_11051) + class004942.method_1105(class07185.field_11051)) / 2.0;
        if (Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3)) {
            throw new IllegalStateException(String.valueOf(class005002) + " " + String.valueOf(class072092) + " " + String.valueOf(class004942));
        }
        if (class005002.i() instanceof class05989) {
            d2 = 0.0;
        }
        return new class06889((double)class072092.method_10263() + d, (double)class072092.method_10264() + d2, (double)class072092.method_10260() + d3);
    }

    public static double entityDistanceToCenter(class07049 class070492, class07209 class072092) {
        return VecUtils.distanceToCenter(class072092, class070492.method_73189().M, class070492.method_73189().B, class070492.method_73189().Z);
    }

    public static double entityFlatDistanceToCenter(class07049 class070492, class07209 class072092) {
        return VecUtils.distanceToCenter(class072092, class070492.method_73189().M, (double)class072092.method_10264() + 0.5, class070492.method_73189().Z);
    }
}

