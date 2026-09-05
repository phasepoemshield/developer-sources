/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class03114
 *  minecraft.class04995
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class08798
 *  minecraft.class08898
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class03114;
import minecraft.class04995;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class08798;
import minecraft.class08898;

public class class02249
extends class06249<class08798, class03114> {
    public class02249(class06252<class08798, class03114> class062522) {
        super(class062522);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08798 class087982, float f, float f2) {
        class08898 class088982 = class087982.J;
        if (class088982.i()) {
            return;
        }
        class014212.N();
        float f3 = 1.0f;
        float f4 = -1.0f;
        float f5 = class04995.L((float)class087982.h) / 60.0f;
        if (class087982.h < 0.0f) {
            class014212.N(0.0f, 1.0f - f5 * 0.5f, -1.0f + f5 * 0.5f);
        } else {
            class014212.N(0.0f, 1.0f + f5 * 0.8f, -1.0f + f5 * 0.2f);
        }
        class088982.N(class014212, class012372, n, class01384.u, class087982.l);
        class014212.y();
    }
}

