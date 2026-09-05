/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class01296
 *  minecraft.class04995
 *  minecraft.class05974
 *  minecraft.class06054
 *  minecraft.class06058
 *  minecraft.class06069
 *  minecraft.class06391
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07284
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class01296;
import minecraft.class04995;
import minecraft.class05974;
import minecraft.class06054;
import minecraft.class06058;
import minecraft.class06069;
import minecraft.class06191;
import minecraft.class06209;
import minecraft.class06391;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07284;
import minecraft.class07830;

public class class06203
extends class06391<class06191> {
    public class06203(Codec<class06191> codec) {
        super(codec);
    }

    protected static boolean N(class06069 class060692, float f) {
        if (f <= 0.0f) {
            return true;
        }
        if (f >= 1.0f) {
            return false;
        }
        return class060692.z() >= f;
    }

    public static boolean N(class00500 class005002, Function<class07209, class00500> function, class06069 class060692, class06191 class061912, class06209 class062092, class07218 class072182) {
        if (!class062092.y.N(class005002, class060692)) {
            return false;
        }
        if (class06203.N(class060692, class061912.u)) {
            return true;
        }
        return !class06203.N(function, (class07209)class072182);
    }

    protected boolean N(class05974 class059742, class06069 class060692, class06191 class061912, double d, double d2, double d3, double d4, double d5, double d6, int n, int n2, int n3, int n4, int n5) {
        double d7;
        double d8;
        double d9;
        double d10;
        int n6;
        int n7 = 0;
        BitSet bitSet = new BitSet(n4 * n5 * n4);
        class07218 class072182 = new class07218();
        int n8 = class061912.L;
        double[] dArray = new double[n8 * 4];
        for (n6 = 0; n6 < n8; ++n6) {
            float f = (float)n6 / (float)n8;
            d10 = class04995.u((double)f, (double)d, (double)d2);
            d9 = class04995.u((double)f, (double)d5, (double)d6);
            d8 = class04995.u((double)f, (double)d3, (double)d4);
            d7 = class060692.U() * (double)n8 / 16.0;
            double d11 = ((double)(class04995.m((double)((float)Math.PI * f)) + 1.0f) * d7 + 1.0) / 2.0;
            dArray[n6 * 4 + 0] = d10;
            dArray[n6 * 4 + 1] = d9;
            dArray[n6 * 4 + 2] = d8;
            dArray[n6 * 4 + 3] = d11;
        }
        for (n6 = 0; n6 < n8 - 1; ++n6) {
            if (dArray[n6 * 4 + 3] <= 0.0) continue;
            for (int i = n6 + 1; i < n8; ++i) {
                if (dArray[i * 4 + 3] <= 0.0 || !((d7 = dArray[n6 * 4 + 3] - dArray[i * 4 + 3]) * d7 > (d10 = dArray[n6 * 4 + 0] - dArray[i * 4 + 0]) * d10 + (d9 = dArray[n6 * 4 + 1] - dArray[i * 4 + 1]) * d9 + (d8 = dArray[n6 * 4 + 2] - dArray[i * 4 + 2]) * d8)) continue;
                if (d7 > 0.0) {
                    dArray[i * 4 + 3] = -1.0;
                    continue;
                }
                dArray[n6 * 4 + 3] = -1.0;
            }
        }
        try (class06054 class060542 = new class06054((class07284)class059742);){
            for (int i = 0; i < n8; ++i) {
                d10 = dArray[i * 4 + 3];
                if (d10 < 0.0) continue;
                d9 = dArray[i * 4 + 0];
                d8 = dArray[i * 4 + 1];
                d7 = dArray[i * 4 + 2];
                int n9 = Math.max(class04995.N((double)(d9 - d10)), n);
                int n10 = Math.max(class04995.N((double)(d8 - d10)), n2);
                int n11 = Math.max(class04995.N((double)(d7 - d10)), n3);
                int n12 = Math.max(class04995.N((double)(d9 + d10)), n9);
                int n13 = Math.max(class04995.N((double)(d8 + d10)), n10);
                int n14 = Math.max(class04995.N((double)(d7 + d10)), n11);
                for (int j = n9; j <= n12; ++j) {
                    double d12 = ((double)j + 0.5 - d9) / d10;
                    if (!(d12 * d12 < 1.0)) continue;
                    for (int k = n10; k <= n13; ++k) {
                        double d13 = ((double)k + 0.5 - d8) / d10;
                        if (!(d12 * d12 + d13 * d13 < 1.0)) continue;
                        block11: for (int i2 = n11; i2 <= n14; ++i2) {
                            class00554 class005542;
                            int n15;
                            double d14 = ((double)i2 + 0.5 - d7) / d10;
                            if (!(d12 * d12 + d13 * d13 + d14 * d14 < 1.0) || class059742.method_31601(k) || bitSet.get(n15 = j - n + (k - n2) * n4 + (i2 - n3) * n4 * n5)) continue;
                            bitSet.set(n15);
                            class072182.N(j, k, i2);
                            if (!class059742.u((class07209)class072182) || (class005542 = class060542.N((class07209)class072182)) == null) continue;
                            int n16 = class01296.y((int)j);
                            int n17 = class01296.y((int)k);
                            int n18 = class01296.y((int)i2);
                            class00500 class005002 = class005542.N(n16, n17, n18);
                            for (class06209 class062092 : class061912.y) {
                                if (!class06203.N(class005002, arg_0 -> ((class06054)class060542).y(arg_0), class060692, class061912, class062092, class072182)) continue;
                                class005542.N(n16, n17, n18, class062092.L, false);
                                ++n7;
                                continue block11;
                            }
                        }
                    }
                }
            }
        }
        return n7 > 0;
    }

    public boolean N(class06058<class06191> class060582) {
        class06069 class060692 = class060582.u();
        class07209 class072092 = class060582.i();
        class05974 class059742 = class060582.y();
        class06191 class061912 = (class06191)class060582.R();
        float f = class060692.z() * (float)Math.PI;
        float f2 = (float)class061912.L / 8.0f;
        int n = class04995.u((float)(((float)class061912.L / 16.0f * 2.0f + 1.0f) / 2.0f));
        double d = (double)class072092.method_10263() + Math.sin(f) * (double)f2;
        double d2 = (double)class072092.method_10263() - Math.sin(f) * (double)f2;
        double d3 = (double)class072092.method_10260() + Math.cos(f) * (double)f2;
        double d4 = (double)class072092.method_10260() - Math.cos(f) * (double)f2;
        int n2 = 2;
        double d5 = class072092.method_10264() + class060692.y(3) - 2;
        double d6 = class072092.method_10264() + class060692.y(3) - 2;
        int n3 = class072092.method_10263() - class04995.u((float)f2) - n;
        int n4 = class072092.method_10264() - 2 - n;
        int n5 = class072092.method_10260() - class04995.u((float)f2) - n;
        int n6 = 2 * (class04995.u((float)f2) + n);
        int n7 = 2 * (2 + n);
        for (int i = n3; i <= n3 + n6; ++i) {
            for (int j = n5; j <= n5 + n6; ++j) {
                if (n4 > class059742.method_8624(class07830.field_13195, i, j)) continue;
                return this.N(class059742, class060692, class061912, d, d2, d3, d4, d5, d6, n3, n4, n5, n6, n7);
            }
        }
        return false;
    }
}

