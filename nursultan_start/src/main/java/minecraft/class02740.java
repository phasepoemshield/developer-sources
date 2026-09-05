/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class04995
 *  minecraft.class06071
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class08482
 *  minecraft.class08898
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class04995;
import minecraft.class06071;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class08482;
import minecraft.class08898;

public class class02740
extends class06249<class08482, class06071> {
    public class02740(class06252<class08482, class06071> class062522) {
        super(class062522);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08482 class084822, float f, float f2) {
        class08898 class088982 = class084822.J;
        if (class088982.i() || !class084822.M || class084822.R) {
            return;
        }
        float f3 = -0.6f;
        float f4 = 1.4f;
        if (class084822.i) {
            f3 -= 0.2f * class04995.m((double)(class084822.P * 0.6f)) + 0.2f;
            f4 -= 0.09f * class04995.m((double)(class084822.P * 0.6f));
        }
        class014212.N();
        class014212.N(0.1f, f4, f3);
        class088982.N(class014212, class012372, n, class01384.u, class084822.l);
        class014212.y();
    }
}

