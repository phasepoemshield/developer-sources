/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class06078
 *  minecraft.class06275
 *  minecraft.class08837
 *  minecraft.class08898
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class06078;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06275;
import minecraft.class08837;
import minecraft.class08898;
import org.joml.Quaternionfc;

public class class06174<S extends class08837, M extends class06078<S>>
extends class06249<S, M> {
    public class06174(class06252<S, M> class062522) {
        super(class062522);
    }

    protected void N(S s, class01421 class014212) {
        ((class06275)this.u()).N(s, class014212);
        class014212.N((Quaternionfc)class02058.y.rotation(0.75f));
        class014212.y(1.07f, 1.07f, 1.07f);
        class014212.N(0.0f, 0.13f, -0.34f);
        class014212.N((Quaternionfc)class02058.y.rotation((float)Math.PI));
    }

    @Override
    public void N(class01421 class014212, class01237 class012372, int n, S s, float f, float f2) {
        class08898 class088982 = ((class08837)s).J;
        if (class088982.i()) {
            return;
        }
        class014212.N();
        this.N(s, class014212);
        class088982.N(class014212, class012372, n, class01384.u, ((class08837)s).l);
        class014212.y();
    }
}

