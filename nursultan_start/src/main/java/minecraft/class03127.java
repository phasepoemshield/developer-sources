/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00676
 *  minecraft.class00753
 *  minecraft.class01237
 *  minecraft.class01383
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class02454
 *  minecraft.class04507
 *  minecraft.class04511
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07311
 *  minecraft.class08792
 *  minecraft.class08800
 */
package minecraft;

import minecraft.class00676;
import minecraft.class00753;
import minecraft.class01237;
import minecraft.class01383;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class02454;
import minecraft.class04507;
import minecraft.class04511;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07311;
import minecraft.class08792;
import minecraft.class08800;

public class class03127
extends class04507<class00676, class08792> {
    private static final class01894 N = class01894.y((String)"textures/entity/end_crystal/end_crystal.png");
    private static final class07311 y = class06851.M((class01894)N);
    private final class02454 L;

    public class03127(class04832 class048322) {
        super(class048322);
        this.field_4673 = 0.5f;
        this.L = new class02454(class048322.N(class04802.Nr));
    }

    public boolean method_3933(class00676 class006762, class01383 class013832, double d, double d2, double d3) {
        return super.method_3933((class07049)class006762, class013832, d, d2, d3) || class006762.N() != null;
    }

    public void method_3936(class08792 class087922, class01421 class014212, class01237 class012372, class06959 class069592) {
        class014212.N();
        class014212.y(2.0f, 2.0f, 2.0f);
        class014212.N(0.0f, -0.5f, 0.0f);
        class012372.N((class06271)this.L, (Object)class087922, class014212, y, class087922.G, class01384.u, class087922.l, null);
        class014212.y();
        class06889 class068892 = class087922.y;
        if (class068892 != null) {
            float f = class03127.N(class087922.P);
            float f2 = (float)class068892.M;
            float f3 = (float)class068892.B;
            float f4 = (float)class068892.Z;
            class014212.N(class068892);
            class04511.N((float)(-f2), (float)(-f3 + f), (float)(-f4), (float)class087922.P, (class01421)class014212, (class01237)class012372, (int)class087922.G);
        }
        super.method_3936((class08800)class087922, class014212, class012372, class069592);
    }

    public void method_62354(class00676 class006762, class08792 class087922, float f) {
        super.method_62354((class07049)class006762, (class08800)class087922, f);
        class087922.P = (float)class006762.N + f;
        class087922.N = class006762.y();
        class07209 class072092 = class006762.N();
        class087922.y = class072092 != null ? class06889.y((class00753)class072092).u(class006762.method_30950(f)) : null;
    }

    public class08792 method_55269() {
        return new class08792();
    }

    public static float N(float f) {
        float f2 = class04995.m((double)(f * 0.2f)) / 2.0f + 0.5f;
        f2 = (f2 * f2 + f2) * 0.4f;
        return f2 - 1.4f;
    }
}

