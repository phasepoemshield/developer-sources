/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02650
 *  minecraft.class04388
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class08255
 */
package minecraft;

import minecraft.class01894;
import minecraft.class02650;
import minecraft.class04388;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class05574;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class08255;

public class class05546
extends class02650<class05574> {
    private static final class01894 N = class01894.y((String)"textures/entity/squid/glow_squid.png");

    public class05546(class04832 class048322, class04388 class043882, class04388 class043883) {
        super(class048322, class043882, class043883);
    }

    public class01894 N(class08255 class082552) {
        return N;
    }

    protected int method_24087(class05574 class055742, class07209 class072092) {
        int n = (int)class04995.y((float)(1.0f - (float)class055742.v() / 10.0f), (float)0.0f, (float)15.0f);
        if (n == 15) {
            return 15;
        }
        return Math.max(n, super.method_24087((class07049)class055742, class072092));
    }
}

