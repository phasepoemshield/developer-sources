/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.SwingAnimations
 *  minecraft.class01421
 *  minecraft.class02058
 *  org.joml.Quaternionfc
 */
package Nursultan;

import Nursultan.SwingAnimations;
import Nursultan.class11442;
import minecraft.class01421;
import minecraft.class02058;
import org.joml.Quaternionfc;

public class class11444
extends class11442 {
    public class11444(SwingAnimations swingAnimations, String string, boolean bl) {
        super(swingAnimations, string, bl);
    }

    @Override
    public void N(class01421 class014212, int n, float f, float f2, float f3, float f4, float f5) {
        class014212.N((float)n * 0.1f, 0.0f, -0.2f);
        class014212.N((float)n * 0.5f, -0.4f, -0.82f);
        class014212.N((Quaternionfc)class02058.u.N((float)(n * 90)));
        class014212.N((Quaternionfc)class02058.R.N((float)(n * -60)));
        class014212.N((Quaternionfc)(n == -1 ? class02058.N.N((float)n * (-80.0f - f3 * f)) : class02058.y.N((float)n * (-80.0f - f3 * f))));
    }
}

