/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00869
 *  minecraft.class01174
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class08479
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class00869;
import minecraft.class01174;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class08479;
import org.joml.Quaternionfc;

public class class02737
extends class06249<class08479, class01174> {
    public class02737(class06252<class08479, class01174> class062522) {
        super(class062522);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08479 class084792, float f, float f2) {
        if (class084792.y == 0) {
            return;
        }
        class014212.N();
        ((class01174)this.u()).y().N(class014212);
        class014212.N(-1.1875f, 1.0625f, -0.9375f);
        class014212.N(0.5f, 0.5f, 0.5f);
        float f3 = 0.5f;
        class014212.y(0.5f, 0.5f, 0.5f);
        class014212.N((Quaternionfc)class02058.y.N(-90.0f));
        class014212.N(-0.5f, -0.5f, -0.5f);
        class012372.N(class014212, class00869.Lu.W(), n, class01384.u, class084792.l);
        class014212.y();
    }
}

