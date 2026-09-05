/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class06078
 *  minecraft.class06240
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06584
 *  minecraft.class06733
 *  minecraft.class07070
 *  minecraft.class08155
 *  minecraft.class08827
 *  minecraft.class08898
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class06078;
import minecraft.class06240;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06584;
import minecraft.class06733;
import minecraft.class07070;
import minecraft.class08155;
import minecraft.class08827;
import minecraft.class08898;
import org.joml.Quaternionfc;

public class class02758<S extends class08827, M extends class06078<S>>
extends class06249<S, M> {
    public class02758(class06252<S, M> class062522) {
        super(class062522);
    }

    protected void N(S s, class08898 class088982, class06584 class065842, class07070 class070702, class01421 class014212, class01237 class012372, int n) {
        float f;
        if (class088982.i()) {
            return;
        }
        class014212.N();
        ((class06240)this.u()).N(s, class070702, class014212);
        class014212.N((Quaternionfc)class02058.y.N(-90.0f));
        class014212.N((Quaternionfc)class02058.u.N(180.0f));
        boolean bl = class070702 == class07070.field_6182;
        class014212.N((float)(bl ? -1 : 1) / 16.0f, 0.125f, -0.625f);
        if (((class08827)s).NX > 0.0f && ((class08827)s).NJ == class070702 && ((class08827)s).Nc == class08155.field_63400) {
            class06733.N(s, (class01421)class014212);
        }
        if ((f = s.N(class070702)) != 0.0f) {
            (class070702 == class07070.field_6183 ? ((class08827)s).No : ((class08827)s).NV).N(s, class014212, f, class070702, class065842);
        }
        class088982.N(class014212, class012372, n, class01384.u, ((class08827)s).l);
        class014212.y();
    }

    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        this.N(s, ((class08827)s).Nq, ((class08827)s).NK, class07070.field_6183, class014212, class012372, n);
        this.N(s, ((class08827)s).Ne, ((class08827)s).NH, class07070.field_6182, class014212, class012372, n);
    }
}

