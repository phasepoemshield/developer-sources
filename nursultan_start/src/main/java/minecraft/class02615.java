/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class02135
 *  minecraft.class02142
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06889
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class02135;
import minecraft.class02142;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06889;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import net.fabricmc.fabric.impl.particle.BlockStateParticleEffectExtension;

public class class02615 {
    public static void N(class07284 class072842, class07209 class072092, int n, double d, double d2, boolean bl, class07126 class071262) {
        class06069 class060692 = class072842.method_8409();
        for (int i = 0; i < n; ++i) {
            double d3 = class060692.E() * 0.02;
            double d4 = class060692.E() * 0.02;
            double d5 = class060692.E() * 0.02;
            double d6 = 0.5 - d;
            double d7 = (double)class072092.method_10263() + d6 + class060692.U() * d * 2.0;
            double d8 = (double)class072092.method_10264() + class060692.U() * d2;
            double d9 = (double)class072092.method_10260() + d6 + class060692.U() * d * 2.0;
            if (!bl && class072842.method_8320(class07209.method_49637((double)d7, (double)d8, (double)d9).method_10074()).P()) continue;
            class072842.method_8406(class071262, d7, d8, d9, d3, d4, d5);
        }
    }

    public static void N(class07284 class072842, class07209 class072092, int n, class07126 class071262) {
        double d = 0.5;
        class00500 class005002 = class072842.method_8320(class072092);
        double d2 = class005002.P() ? 1.0 : class005002.R((class07290)class072842, class072092).method_1105(class07185.field_11052);
        class02615.N(class072842, class072092, n, 0.5, d2, true, class071262);
    }

    public static void N(class07299 class072992, class07209 class072092, class06069 class060692, class07126 class071262) {
        double d = (double)class072092.method_10263() + class060692.U();
        double d2 = (double)class072092.method_10264() - 0.05;
        double d3 = (double)class072092.method_10260() + class060692.U();
        class072992.method_8406(class071262, d, d2, d3, 0.0, 0.0, 0.0);
    }

    public static void N(class07284 class072842, class07209 class072092, int n) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        class06889 class068892 = class072092.method_46558().y(0.0, 0.5, 0.0);
        class07105 class071052 = class02615.N(new class07105(class07107.yR, class072842.method_8320(class072092)), class072842, class072092, n);
        int n2 = 0;
        while ((float)n2 < (float)n / 3.0f) {
            d6 = class068892.M + class072842.method_8409().E() / 2.0;
            d5 = class068892.B;
            d4 = class068892.Z + class072842.method_8409().E() / 2.0;
            d3 = class072842.method_8409().E() * (double)0.2f;
            d2 = class072842.method_8409().E() * (double)0.2f;
            d = class072842.method_8409().E() * (double)0.2f;
            class072842.method_8406((class07126)class071052, d6, d5, d4, d3, d2, d);
            ++n2;
        }
        n2 = 0;
        while ((float)n2 < (float)n / 1.5f) {
            d6 = class068892.M + 3.5 * Math.cos(n2) + class072842.method_8409().E() / 2.0;
            d5 = class068892.B;
            d4 = class068892.Z + 3.5 * Math.sin(n2) + class072842.method_8409().E() / 2.0;
            d3 = class072842.method_8409().E() * (double)0.05f;
            d2 = class072842.method_8409().E() * (double)0.05f;
            d = class072842.method_8409().E() * (double)0.05f;
            class072842.method_8406((class07126)class071052, d6, d5, d4, d3, d2, d);
            ++n2;
        }
    }

    private static class07105 N(class07105 class071052, class07284 class072842, class07209 class072092, int n) {
        ((BlockStateParticleEffectExtension)class071052).fabric_setBlockPos(class072092);
        return class071052;
    }

    public static void N(class07299 class072992, class07209 class072092, class07126 class071262, class02142 class021422) {
        for (class07211 class072112 : class07211.values()) {
            class02615.N(class072992, class072092, class071262, class021422, class072112, () -> class02615.N(class072992.field_9229), 0.55);
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class07126 class071262, class02142 class021422, class07211 class072112, Supplier<class06889> supplier, double d) {
        int n = class021422.N(class072992.field_9229);
        for (int i = 0; i < n; ++i) {
            class02615.N(class072992, class072092, class072112, class071262, supplier.get(), d);
        }
    }

    private static class06889 N(class06069 class060692) {
        return new class06889(class04995.N((class06069)class060692, (double)-0.5, (double)0.5), class04995.N((class06069)class060692, (double)-0.5, (double)0.5), class04995.N((class06069)class060692, (double)-0.5, (double)0.5));
    }

    public static void N(class07185 class071852, class07299 class072992, class07209 class072092, double d, class07126 class071262, class02135 class021352) {
        class06889 class068892 = class06889.y((class00753)class072092);
        boolean bl = class071852 == class07185.field_11048;
        boolean bl2 = class071852 == class07185.field_11052;
        boolean bl3 = class071852 == class07185.field_11051;
        int n = class021352.N(class072992.field_9229);
        for (int i = 0; i < n; ++i) {
            double d2 = class068892.M + class04995.N((class06069)class072992.field_9229, (double)-1.0, (double)1.0) * (bl ? 0.5 : d);
            double d3 = class068892.B + class04995.N((class06069)class072992.field_9229, (double)-1.0, (double)1.0) * (bl2 ? 0.5 : d);
            double d4 = class068892.Z + class04995.N((class06069)class072992.field_9229, (double)-1.0, (double)1.0) * (bl3 ? 0.5 : d);
            double d5 = bl ? class04995.N((class06069)class072992.field_9229, (double)-1.0, (double)1.0) : 0.0;
            double d6 = bl2 ? class04995.N((class06069)class072992.field_9229, (double)-1.0, (double)1.0) : 0.0;
            double d7 = bl3 ? class04995.N((class06069)class072992.field_9229, (double)-1.0, (double)1.0) : 0.0;
            class072992.method_8406(class071262, d2, d3, d4, d5, d6, d7);
        }
    }

    public static void N(class07299 class072992, class07209 class072092, class07211 class072112, class07126 class071262, class06889 class068892, double d) {
        class06889 class068893 = class06889.y((class00753)class072092);
        int n = class072112.P();
        int n2 = class072112.s();
        int n3 = class072112.T();
        double d2 = class068893.M + (n == 0 ? class04995.N((class06069)class072992.field_9229, (double)-0.5, (double)0.5) : (double)n * d);
        double d3 = class068893.B + (n2 == 0 ? class04995.N((class06069)class072992.field_9229, (double)-0.5, (double)0.5) : (double)n2 * d);
        double d4 = class068893.Z + (n3 == 0 ? class04995.N((class06069)class072992.field_9229, (double)-0.5, (double)0.5) : (double)n3 * d);
        double d5 = n == 0 ? class068892.N() : 0.0;
        double d6 = n2 == 0 ? class068892.y() : 0.0;
        double d7 = n3 == 0 ? class068892.L() : 0.0;
        class072992.method_8406(class071262, d2, d3, d4, d5, d6, d7);
    }
}

