/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class04995
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07079
 */
package minecraft;

import java.util.Optional;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07079;

public final class class04494 {
    public static Optional<class06889> N(class07079 class070792, class06889 class068892, float f, int n, boolean bl) {
        class06889 class068893 = class070792.method_73189();
        class06889 class068894 = new class06889(class068892.M - class068893.M, 0.0, class068892.Z - class068893.Z).u().L(0.5);
        class06889 class068895 = class068892.u(class068894).u(class068893);
        float f2 = (float)n * (float)Math.PI / 180.0f;
        double d = Math.atan2(class068895.Z, class068895.M);
        double d2 = class068895.N(0.0, class068895.B, 0.0).B();
        double d3 = Math.sqrt(d2);
        double d4 = class068895.B;
        double d5 = class070792.method_56989();
        double d6 = Math.sin(2.0f * f2);
        double d7 = Math.pow(Math.cos(f2), 2.0);
        double d8 = Math.sin(f2);
        double d9 = Math.cos(f2);
        double d10 = Math.sin(d);
        double d11 = Math.cos(d);
        double d12 = d2 * d5 / (d3 * d6 - 2.0 * d4 * d7);
        if (d12 < 0.0) {
            return Optional.empty();
        }
        double d13 = Math.sqrt(d12);
        if (d13 > (double)f) {
            return Optional.empty();
        }
        double d14 = d13 * d9;
        double d15 = d13 * d8;
        if (bl) {
            int n2 = class04995.L((double)(d3 / d14)) * 2;
            double d16 = 0.0;
            class06889 class068896 = null;
            class01325 class013252 = class070792.method_18377(class01312.field_30095);
            for (int i = 0; i < n2 - 1; ++i) {
                double d17 = d8 / d9 * (d16 += d3 / (double)n2) - Math.pow(d16, 2.0) * d5 / (2.0 * d12 * Math.pow(d9, 2.0));
                double d18 = d16 * d11;
                double d19 = d16 * d10;
                class06889 class068897 = new class06889(class068893.M + d18, class068893.B + d17, class068893.Z + d19);
                if (class068896 != null && !class04494.N(class070792, class013252, class068896, class068897)) {
                    return Optional.empty();
                }
                class068896 = class068897;
            }
        }
        return Optional.of(new class06889(d14 * d11, d15, d14 * d10).L((double)0.95f));
    }

    private static boolean N(class07079 class070792, class01325 class013252, class06889 class068892, class06889 class068893) {
        class06889 class068894 = class068893.u(class068892);
        double d = Math.min(class013252.N(), class013252.y());
        int n = class04995.L((double)(class068894.M() / d));
        class06889 class068895 = class068894.u();
        class06889 class068896 = class068892;
        for (int i = 0; i < n; ++i) {
            class06889 class068897 = class068896 = i == n - 1 ? class068893 : class068896.i(class068895.L(d * (double)0.9f));
            if (class070792.method_73183().method_8587((class07049)class070792, class013252.N(class068896))) continue;
            return false;
        }
        return true;
    }
}

