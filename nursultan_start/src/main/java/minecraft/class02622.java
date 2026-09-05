/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00674
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class04507
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08243
 *  minecraft.class08800
 *  org.joml.Quaternionfc
 */
package minecraft;

import minecraft.class00674;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class02652;
import minecraft.class04507;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08243;
import minecraft.class08800;
import org.joml.Quaternionfc;

public class class02622
extends class04507<class00674, class08243> {
    public class02622(class04832 class048322) {
        super(class048322);
        this.field_4673 = 0.5f;
    }

    public void method_62354(class00674 class006742, class08243 class082432, float f) {
        super.method_62354((class07049)class006742, (class08800)class082432, f);
        class082432.N = (float)class006742.y() - f + 1.0f;
        class082432.y = class006742.L();
    }

    public class08243 method_55269() {
        return new class08243();
    }

    public void method_3936(class08243 class082432, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.N(0.0f, 0.5f, 0.0f);
        float f = class082432.N;
        if (class082432.N < 10.0f) {
            float f2 = 1.0f - class082432.N / 10.0f;
            f2 = class04995.N((float)f2, (float)0.0f, (float)1.0f);
            f2 *= f2;
            f2 *= f2;
            float f3 = 1.0f + f2 * 0.3f;
            class014212.y(f3, f3, f3);
        }
        class014212.N((Quaternionfc)class02058.u.N(-90.0f));
        class014212.N(-0.5f, -0.5f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(90.0f));
        if (class082432.y != null) {
            class02652.N(class082432.y, class014212, class012372, class082432.G, (int)f / 5 % 2 == 0, class082432.l);
        }
        class014212.y();
        super.method_3936((class08800)class082432, class014212, class012372, class069592);
    }
}

