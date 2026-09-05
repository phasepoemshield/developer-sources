/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02855
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class07504
 *  minecraft.class07507
 *  minecraft.class08454
 *  minecraft.class08472
 */
package minecraft;

import minecraft.class00500;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02855;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class07504;
import minecraft.class07507;
import minecraft.class08454;
import minecraft.class08472;

public class class02652
extends class02855<class07507, class08472> {
    public class02652(class04832 class048322) {
        super(class048322, class04802.uq);
    }

    public void method_62354(class07507 class075072, class08472 class084722, float f) {
        super.method_62354((class07504)class075072, (class08454)class084722, f);
        class084722.q = class075072.U() > -1 ? (float)class075072.U() - f + 1.0f : -1.0f;
    }

    protected void N(class08472 class084722, class00500 class005002, class01421 class014212, class01237 class012372, int n) {
        float f = class084722.q;
        if (f > -1.0f && f < 10.0f) {
            float f2 = 1.0f - f / 10.0f;
            f2 = class04995.N((float)f2, (float)0.0f, (float)1.0f);
            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0f + f2 * 0.3f;
            class014212.y(f3, f3, f3);
        }
        class02652.N(class005002, class014212, class012372, n, f > -1.0f && (int)f / 5 % 2 == 0, class084722.l);
    }

    public static void N(class00500 class005002, class01421 class014212, class01237 class012372, int n, boolean bl, int n2) {
        int n3 = bl ? class01384.N((int)class01384.N((float)1.0f), (int)10) : class01384.u;
        class012372.N(class014212, class005002, n, n3, n2);
    }

    public class08472 method_55269() {
        return new class08472();
    }
}

