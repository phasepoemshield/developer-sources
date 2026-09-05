/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package minecraft;

import minecraft.class00780;
import minecraft.class00785;
import minecraft.class07209;

final class class00804
extends class00785 {
    class00804(String string, int n, String string2) {
    }

    @Override
    public float N(class07209 class072092, float f) {
        double d;
        double d2 = class00780.i.N((double)class072092.method_10263() * 0.05, (double)class072092.method_10260() * 0.05, false) * 7.0;
        if (d2 + (d = class00780.R.N((double)class072092.method_10263() * 0.2, (double)class072092.method_10260() * 0.2, false)) < 0.3 && class00780.R.N((double)class072092.method_10263() * 0.09, (double)class072092.method_10260() * 0.09, false) < 0.8) {
            return 0.2f;
        }
        return f;
    }
}

