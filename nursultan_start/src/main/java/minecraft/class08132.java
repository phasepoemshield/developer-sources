/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01422
 *  minecraft.class03042
 *  minecraft.class04995
 *  minecraft.class06851
 *  minecraft.class07937
 *  minecraft.class08804
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package minecraft;

import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01422;
import minecraft.class03042;
import minecraft.class04995;
import minecraft.class06851;
import minecraft.class07937;
import minecraft.class08146;
import minecraft.class08804;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class08132 {
    private static final int N = 24;
    private static final float y = 0.05f;

    private static void N(class01391 class013912, Matrix4f matrix4f, float f, float f2, float f3, float f4, float f5, float f6, int n, boolean bl, class08804 class088042) {
        float f7 = (float)n / 24.0f;
        int n2 = (int)class04995.B((float)f7, (float)class088042.u, (float)class088042.i);
        int n3 = (int)class04995.B((float)f7, (float)class088042.R, (float)class088042.M);
        int n4 = class03042.N((int)n2, (int)n3);
        float f8 = n % 2 == (bl ? 1 : 0) ? 0.7f : 1.0f;
        float f9 = 0.5f * f8;
        float f10 = 0.4f * f8;
        float f11 = 0.3f * f8;
        float f12 = f * f7;
        float f13 = class088042.B ? (f2 > 0.0f ? f2 * f7 * f7 : f2 - f2 * (1.0f - f7) * (1.0f - f7)) : f2 * f7;
        float f14 = f3 * f7;
        class013912.N((Matrix4fc)matrix4f, f12 - f5, f13 + f4, f14 + f6).method_22915(f9, f10, f11, 1.0f).method_60803(n4);
        class013912.N((Matrix4fc)matrix4f, f12 + f5, f13 + 0.05f - f4, f14 - f6).method_22915(f9, f10, f11, 1.0f).method_60803(n4);
    }

    private static void N(Matrix4f matrix4f, class01407 class014072, class08804 class088042) {
        int n;
        float f = (float)(class088042.L.M - class088042.y.M);
        float f2 = (float)(class088042.L.B - class088042.y.B);
        float f3 = (float)(class088042.L.Z - class088042.y.Z);
        float f4 = class04995.B((float)(f * f + f3 * f3)) * 0.05f / 2.0f;
        float f5 = f3 * f4;
        float f6 = f * f4;
        matrix4f.translate((float)class088042.N.M, (float)class088042.N.B, (float)class088042.N.Z);
        class01391 class013912 = class014072.method_73477(class06851.u());
        for (n = 0; n <= 24; ++n) {
            class08132.N(class013912, matrix4f, f, f2, f3, 0.05f, f5, f6, n, false, class088042);
        }
        for (n = 24; n >= 0; --n) {
            class08132.N(class013912, matrix4f, f, f2, f3, 0.0f, f5, f6, n, true, class088042);
        }
    }

    public void N(class07937 class079372, class01422 class014222) {
        for (class08146 class081462 : class079372.i()) {
            class08132.N(class081462.N(), (class01407)class014222, class081462.y());
        }
    }
}

