/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01134
 *  minecraft.class01237
 *  minecraft.class01383
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01894
 *  minecraft.class02058
 *  minecraft.class02840
 *  minecraft.class04802
 *  minecraft.class04832
 *  minecraft.class04995
 *  minecraft.class06078
 *  minecraft.class06202
 *  minecraft.class06346
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class07311
 *  minecraft.class07438
 *  minecraft.class07549
 *  minecraft.class08455
 *  minecraft.class08476
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00734;
import minecraft.class01134;
import minecraft.class01237;
import minecraft.class01383;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01894;
import minecraft.class02058;
import minecraft.class02840;
import minecraft.class04802;
import minecraft.class04832;
import minecraft.class04995;
import minecraft.class06078;
import minecraft.class06202;
import minecraft.class06346;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class07311;
import minecraft.class07438;
import minecraft.class07549;
import minecraft.class08455;
import minecraft.class08476;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class03840
extends class02840<class07549, class08455, class06346> {
    private static final class01894 N = class01894.y((String)"textures/entity/guardian.png");
    private static final class01894 i = class01894.y((String)"textures/entity/guardian_beam.png");
    private static final class07311 R = class06851.M((class01894)i);

    public class03840(class04832 class048322) {
        this(class048322, 0.5f, class04802.ym);
    }

    public class03840(class04832 class048322, float f, class01134 class011342) {
        super(class048322, (class06078)new class06346(class048322.N(class011342)), f);
    }

    public class08455 method_55269() {
        return new class08455();
    }

    public boolean method_3933(class07549 class075492, class01383 class013832, double d, double d2, double d3) {
        class07438 class074382;
        if (super.method_3933((class07049)class075492, class013832, d, d2, d3)) {
            return true;
        }
        if (class075492.v() && (class074382 = class075492.n()) != null) {
            class06889 class068892 = this.N(class074382, (double)class074382.method_17682() * 0.5, 1.0f);
            class06889 class068893 = this.N((class07438)class075492, class075492.method_5751(), 1.0f);
            return class013832.method_23093(new class00734(class068893.M, class068893.B, class068893.Z, class068892.M, class068892.B, class068892.Z));
        }
        return false;
    }

    private static @Nullable class07049 N(class07549 class075492) {
        class07049 class070492 = class06202.Nq().F();
        if (class075492.v()) {
            return class075492.n();
        }
        return class070492;
    }

    public void method_3936(class08455 class084552, class01421 class014212, class01237 class012372, class06959 class069592) {
        super.method_3936((class08476)class084552, class014212, class012372, class069592);
        class06889 class068892 = class084552.R;
        if (class068892 != null) {
            float f = class084552.M * 0.5f % 1.0f;
            class014212.N();
            class014212.N(0.0f, class084552.b, 0.0f);
            class03840.N(class014212, class012372, class068892.u(class084552.L), class084552.M, class084552.B, f);
            class014212.y();
        }
    }

    private class06889 N(class07438 class074382, double d, float f) {
        double d2 = class04995.u((double)f, (double)class074382.field_6038, (double)class074382.method_23317());
        double d3 = class04995.u((double)f, (double)class074382.field_5971, (double)class074382.method_23318()) + d;
        double d4 = class04995.u((double)f, (double)class074382.field_5989, (double)class074382.method_23321());
        return new class06889(d2, d3, d4);
    }

    private static void N(class01421 class014212, class01237 class012372, class06889 class068892, float f, float f2, float f3) {
        float f4 = (float)(class068892.M() + 1.0);
        class068892 = class068892.u();
        float f5 = (float)Math.acos(class068892.B);
        float f6 = 1.5707964f - (float)Math.atan2(class068892.Z, class068892.M);
        class014212.N((Quaternionfc)class02058.u.N(f6 * 57.295776f));
        class014212.N((Quaternionfc)class02058.y.N(f5 * 57.295776f));
        float f7 = f * 0.05f * -1.5f;
        float f8 = f2 * f2;
        int n = 64 + (int)(f8 * 191.0f);
        int n2 = 32 + (int)(f8 * 191.0f);
        int n3 = 128 - (int)(f8 * 64.0f);
        float f9 = 0.2f;
        float f10 = 0.282f;
        float f11 = class04995.P((double)(f7 + 2.3561945f)) * 0.282f;
        float f12 = class04995.m((double)(f7 + 2.3561945f)) * 0.282f;
        float f13 = class04995.P((double)(f7 + 0.7853982f)) * 0.282f;
        float f14 = class04995.m((double)(f7 + 0.7853982f)) * 0.282f;
        float f15 = class04995.P((double)(f7 + 3.926991f)) * 0.282f;
        float f16 = class04995.m((double)(f7 + 3.926991f)) * 0.282f;
        float f17 = class04995.P((double)(f7 + 5.4977875f)) * 0.282f;
        float f18 = class04995.m((double)(f7 + 5.4977875f)) * 0.282f;
        float f19 = class04995.P((double)(f7 + (float)Math.PI)) * 0.2f;
        float f20 = class04995.m((double)(f7 + (float)Math.PI)) * 0.2f;
        float f21 = class04995.P((double)(f7 + 0.0f)) * 0.2f;
        float f22 = class04995.m((double)(f7 + 0.0f)) * 0.2f;
        float f23 = class04995.P((double)(f7 + 1.5707964f)) * 0.2f;
        float f24 = class04995.m((double)(f7 + 1.5707964f)) * 0.2f;
        float f25 = class04995.P((double)(f7 + 4.712389f)) * 0.2f;
        float f26 = class04995.m((double)(f7 + 4.712389f)) * 0.2f;
        float f27 = f4;
        float f28 = 0.0f;
        float f29 = 0.4999f;
        float f30 = -1.0f + f3;
        float f31 = f30 + f4 * 2.5f;
        class012372.N(class014212, R, (class014232, class013912) -> {
            class03840.N(class013912, class014232, f19, f27, f20, n, n2, n3, 0.4999f, f31);
            class03840.N(class013912, class014232, f19, 0.0f, f20, n, n2, n3, 0.4999f, f30);
            class03840.N(class013912, class014232, f21, 0.0f, f22, n, n2, n3, 0.0f, f30);
            class03840.N(class013912, class014232, f21, f27, f22, n, n2, n3, 0.0f, f31);
            class03840.N(class013912, class014232, f23, f27, f24, n, n2, n3, 0.4999f, f31);
            class03840.N(class013912, class014232, f23, 0.0f, f24, n, n2, n3, 0.4999f, f30);
            class03840.N(class013912, class014232, f25, 0.0f, f26, n, n2, n3, 0.0f, f30);
            class03840.N(class013912, class014232, f25, f27, f26, n, n2, n3, 0.0f, f31);
            float f21 = class04995.y((float)f) % 2 == 0 ? 0.5f : 0.0f;
            class03840.N(class013912, class014232, f11, f27, f12, n, n2, n3, 0.5f, f21 + 0.5f);
            class03840.N(class013912, class014232, f13, f27, f14, n, n2, n3, 1.0f, f21 + 0.5f);
            class03840.N(class013912, class014232, f17, f27, f18, n, n2, n3, 1.0f, f21);
            class03840.N(class013912, class014232, f15, f27, f16, n, n2, n3, 0.5f, f21);
        });
    }

    public void method_62354(class07549 class075492, class08455 class084552, float f) {
        super.method_62354((class07438)class075492, (class08476)class084552, f);
        class084552.N = class075492.i(f);
        class084552.y = class075492.u(f);
        class084552.L = class075492.method_5836(f);
        class07049 class070492 = class03840.N(class075492);
        if (class070492 != null) {
            class084552.u = class075492.method_5828(f);
            class084552.i = class070492.method_5836(f);
        } else {
            class084552.u = null;
            class084552.i = null;
        }
        class07438 class074382 = class075492.n();
        if (class074382 != null) {
            class084552.B = class075492.R(f);
            class084552.M = class075492.t() + f;
            class084552.R = this.N(class074382, (double)class074382.method_17682() * 0.5, f);
        } else {
            class084552.R = null;
        }
    }

    public class01894 N(class08455 class084552) {
        return N;
    }

    private static void N(class01391 class013912, class01423 class014232, float f, float f2, float f3, int n, int n2, int n3, float f4, float f5) {
        class013912.N(class014232, f, f2, f3).method_1336(n, n2, n3, 255).method_22913(f4, f5).method_22922(class01384.u).method_60803(0xF000F0).y(class014232, 0.0f, 1.0f, 0.0f);
    }
}

