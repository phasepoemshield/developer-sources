/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.SwingAnimations
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class04995
 *  org.joml.Quaternionfc
 */
package Nursultan;

import Nursultan.SwingAnimations;
import Nursultan.class11442;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class04995;
import org.joml.Quaternionfc;

public class class11440
extends class11442 {
    public class11440(SwingAnimations swingAnimations, String string, boolean bl) {
        super(swingAnimations, string, bl);
    }

    @Override
    public void N(class01421 class014212, int n, float f, float f2, float f3, float f4, float f5) {
        float f6 = class04995.m((double)(f4 * f4 * (float)Math.PI));
        float f7 = class04995.m((double)(class04995.N((float)f4) * (float)Math.PI));
        class014212.N((float)n * 0.56f, -0.52f, -0.72f);
        class014212.N((Quaternionfc)class02058.u.N((float)n * (45.0f + f6 * -20.0f)));
        class014212.N((Quaternionfc)class02058.R.N((float)n * f7 * -20.0f));
        class014212.N((Quaternionfc)class02058.y.N(f7 * -f3));
        class014212.N((Quaternionfc)class02058.u.N((float)n * -45.0f));
    }
}

