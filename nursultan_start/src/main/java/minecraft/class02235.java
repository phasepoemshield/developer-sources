/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06374
 *  minecraft.class08785
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class00500;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06374;
import minecraft.class08785;
import org.joml.Quaternionfc;

public class class02235
extends class06249<class08785, class06374<class08785>> {
    public class02235(class06252<class08785, class06374<class08785>> class062522) {
        super(class062522);
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08785 class087852, float f, float f2) {
        class00500 class005002 = class087852.y;
        if (class005002 == null) {
            return;
        }
        class014212.N();
        class014212.N(0.0f, 0.6875f, -0.75f);
        class014212.N((Quaternionfc)class02058.y.N(20.0f));
        class014212.N((Quaternionfc)class02058.u.N(45.0f));
        class014212.N(0.25f, 0.1875f, 0.25f);
        float f3 = 0.5f;
        class014212.y(-0.5f, -0.5f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(90.0f));
        class012372.N(class014212, class005002, n, class01384.u, class087852.l);
        class014212.y();
    }
}

