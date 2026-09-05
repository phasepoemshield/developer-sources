/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class03093
 *  minecraft.class06174
 *  minecraft.class06252
 *  minecraft.class08260
 *  minecraft.class08837
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03093;
import minecraft.class06174;
import minecraft.class06252;
import minecraft.class08260;
import minecraft.class08837;
import org.joml.Quaternionfc;

public class class08480
extends class06174<class08260, class03093> {
    public class08480(class06252<class08260, class03093> class062522) {
        super(class062522);
    }

    protected void N(class08260 class082602, class01421 class014212) {
        if (class082602.L) {
            ((class03093)this.u()).method_63512().N(class014212);
            ((class03093)this.u()).N(class014212);
            ((class03093)this.u()).y().N(class014212);
            class014212.N(0.0625f, 0.25f, 0.0f);
            class014212.N((Quaternionfc)class02058.R.N(180.0f));
            class014212.N((Quaternionfc)class02058.y.N(140.0f));
            class014212.N((Quaternionfc)class02058.R.N(10.0f));
            class014212.N((Quaternionfc)class02058.y.N(180.0f));
            return;
        }
        super.N((class08837)class082602, class014212);
    }
}

