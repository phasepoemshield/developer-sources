/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02714
 *  minecraft.class02721
 *  minecraft.class04802
 *  minecraft.class06067
 *  minecraft.class06079
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class07648
 *  minecraft.class08450
 *  minecraft.class08468
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02714;
import minecraft.class02721;
import minecraft.class04802;
import minecraft.class06067;
import minecraft.class06079;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class07648;
import minecraft.class08450;
import minecraft.class08468;

public class class02600
extends class06249<class08468, class02721> {
    private final class06079 N;

    public class02600(class06252<class08468, class02721> class062522, class01140 class011402) {
        super(class062522);
        this.N = new class06079(class011402.N(class04802.LT));
    }

    private void N(class01421 class014212, class01237 class012372, int n, class08468 class084682, class07648 class076482, float f, float f2, boolean bl) {
        class014212.N();
        class014212.N(bl ? 0.4f : -0.4f, class084682.Z ? -1.3f : -1.5f, 0.0f);
        class08450 class084502 = new class08450();
        class084502.L = class06067.field_3464;
        class084502.P = class084682.P;
        class084502.NN = class084682.NN;
        class084502.Ny = class084682.Ny;
        class084502.D = f;
        class084502.h = f2;
        class012372.N((class06271)this.N, (Object)class084502, class014212, this.N.method_23500(class02714.N((class07648)class076482)), n, class01384.u, class084682.l, null);
        class014212.y();
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08468 class084682, float f, float f2) {
        class07648 class076482;
        class07648 class076483 = class084682.NY;
        if (class076483 != null) {
            this.N(class014212, class012372, n, class084682, class076483, f, f2, true);
        }
        if ((class076482 = class084682.NQ) != null) {
            this.N(class014212, class012372, n, class084682, class076482, f, f2, false);
        }
    }
}

