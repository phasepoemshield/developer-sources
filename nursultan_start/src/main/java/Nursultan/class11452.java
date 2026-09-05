/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.SwingAnimations
 *  Nursultan.class11938
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class06202
 *  org.joml.Quaternionfc
 */
package Nursultan;

import Nursultan.SwingAnimations;
import Nursultan.class11442;
import Nursultan.class11938;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class06202;
import org.joml.Quaternionfc;

public class class11452
extends class11442 {
    public class11452(SwingAnimations swingAnimations, String string, boolean bl) {
        super(swingAnimations, string, bl);
    }

    @Override
    public void N(class01421 class014212, int n, float f, float f2, float f3, float f4, float f5) {
        class014212.N((float)n * 0.56f, -0.52f, -0.72f);
        if (((Boolean)((SwingAnimations)this.N_0).m().i()).booleanValue()) {
            float f6 = ((float)class11938.j().y() + class06202.Nq().NK().N(true)) * 25.0f / f2;
            class014212.N((Quaternionfc)class02058.N.N(f6));
        } else {
            class014212.N((Quaternionfc)class02058.N.N(f4 * 360.0f));
        }
    }
}

