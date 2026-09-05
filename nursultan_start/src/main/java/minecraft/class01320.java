/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class08460
 *  minecraft.class08898
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01316;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class08460;
import minecraft.class08898;
import org.joml.Quaternionfc;

public class class01320
extends class06249<class08460, class01316> {
    public class01320(class06252<class08460, class01316> class062522) {
        super(class062522);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08460 class084602, float f, float f2) {
        class08898 class088982 = class084602.J;
        if (class088982.i()) {
            return;
        }
        boolean bl = class084602.u;
        boolean bl2 = class084602.NB;
        class014212.N();
        class014212.N(((class01316)this.u()).y.y / 16.0f, ((class01316)this.u()).y.L / 16.0f, ((class01316)this.u()).y.u / 16.0f);
        if (bl2) {
            float f3 = 0.75f;
            class014212.y(0.75f, 0.75f, 0.75f);
        }
        class014212.N((Quaternionfc)class02058.R.rotation(class084602.N));
        class014212.N((Quaternionfc)class02058.u.N(f));
        class014212.N((Quaternionfc)class02058.y.N(f2));
        if (class084602.NB) {
            if (bl) {
                class014212.N(0.4f, 0.26f, 0.15f);
            } else {
                class014212.N(0.06f, 0.26f, -0.5f);
            }
        } else if (bl) {
            class014212.N(0.46f, 0.26f, 0.22f);
        } else {
            class014212.N(0.06f, 0.27f, -0.5f);
        }
        class014212.N((Quaternionfc)class02058.y.N(90.0f));
        if (bl) {
            class014212.N((Quaternionfc)class02058.R.N(90.0f));
        }
        class088982.N(class014212, class012372, n, class01384.u, class084602.l);
        class014212.y();
    }
}

