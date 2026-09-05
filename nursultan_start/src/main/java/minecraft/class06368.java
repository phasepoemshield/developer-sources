/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01686
 *  minecraft.class02221
 *  minecraft.class02245
 *  minecraft.class02758
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06230
 *  minecraft.class06252
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07070
 *  minecraft.class08468
 *  minecraft.class08898
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01686;
import minecraft.class02221;
import minecraft.class02245;
import minecraft.class02758;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06230;
import minecraft.class06252;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07070;
import minecraft.class08468;
import minecraft.class08898;

public class class06368<S extends class08468, M extends class06078<S> & class06230>
extends class02758<S, M> {
    private static final float N = -0.5235988f;
    private static final float y = 1.5707964f;

    public class06368(class06252<S, M> class062522) {
        super(class062522);
    }

    private void N(S s, class07070 class070702, class01421 class014212, class01237 class012372, int n) {
        class014212.N();
        this.u().method_63512().N(class014212);
        class01686 class016862 = ((class06230)this.u()).R();
        float f = class016862.i;
        class016862.i = class04995.N((float)class016862.i, (float)-0.5235988f, (float)1.5707964f);
        class016862.N(class014212);
        class016862.i = f;
        class02245.N((class01421)class014212, (class02221)class02221.N);
        boolean bl = class070702 == class07070.field_6182;
        class014212.N((bl ? -2.5f : 2.5f) / 16.0f, -0.0625f, 0.0f);
        ((class08468)s).NI.N(class014212, class012372, n, class01384.u, ((class08468)s).l);
        class014212.y();
    }

    protected void N(S s, class08898 class088982, class06584 class065842, class07070 class070702, class01421 class014212, class01237 class012372, int n) {
        class07050 class070502;
        if (class088982.i()) {
            return;
        }
        class07050 class070503 = class070502 = class070702 == ((class08468)s).NJ ? class07050.field_5808 : class07050.field_5810;
        if (((class08468)s).o && ((class08468)s).B == class070502 && ((class08468)s).NX < 1.0E-5f && !((class08468)s).NI.i()) {
            this.N(s, class070702, class014212, class012372, n);
        } else {
            super.N(s, class088982, class065842, class070702, class014212, class012372, n);
        }
    }
}

