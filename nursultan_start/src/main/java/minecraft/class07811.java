/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00780
 *  minecraft.class01296
 *  minecraft.class02158
 *  minecraft.class03322
 *  minecraft.class03460
 *  minecraft.class03556
 *  minecraft.class04389
 *  minecraft.class04521
 *  minecraft.class04995
 *  minecraft.class06034
 *  minecraft.class06057
 *  minecraft.class06069
 *  minecraft.class06080
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class08050
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Function;
import minecraft.class00780;
import minecraft.class01296;
import minecraft.class02158;
import minecraft.class03322;
import minecraft.class03460;
import minecraft.class03556;
import minecraft.class04389;
import minecraft.class04521;
import minecraft.class04995;
import minecraft.class06034;
import minecraft.class06057;
import minecraft.class06069;
import minecraft.class06080;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class08050;

public class class07811
extends class02158<class04389> {
    public class07811(Codec<class04389> codec) {
        super(codec);
    }

    protected double y() {
        return 1.0;
    }

    protected void N(class06080 class060802, class04389 class043892, class08050 class080502, Function<class07209, class03556<class00780>> function, long l, class03460 class034602, double d, double d2, double d3, double d4, double d5, float f, float f2, float f3, int n, int n2, double d6, class03322 class033222, class04521 class045212) {
        class06069 class060692 = class06069.y((long)l);
        int n3 = class060692.y(n2 / 2) + n2 / 4;
        boolean bl = class060692.y(6) == 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i = n; i < n2; ++i) {
            double d7 = 1.5 + (double)(class04995.m((double)((float)Math.PI * (float)i / (float)n2)) * f);
            double d8 = d7 * d6;
            float f6 = class04995.P((double)f3);
            d += (double)(class04995.P((double)f2) * f6);
            d2 += (double)class04995.m((double)f3);
            d3 += (double)(class04995.m((double)f2) * f6);
            f3 *= bl ? 0.92f : 0.7f;
            f3 += f5 * 0.1f;
            f2 += f4 * 0.1f;
            f5 *= 0.9f;
            f4 *= 0.75f;
            f5 += (class060692.z() - class060692.z()) * class060692.z() * 2.0f;
            f4 += (class060692.z() - class060692.z()) * class060692.z() * 4.0f;
            if (i == n3 && f > 1.0f) {
                this.N(class060802, class043892, class080502, function, class060692.B(), class034602, d, d2, d3, d4, d5, class060692.z() * 0.5f + 0.5f, f2 - 1.5707964f, f3 / 3.0f, i, n2, 1.0, class033222, class045212);
                this.N(class060802, class043892, class080502, function, class060692.B(), class034602, d, d2, d3, d4, d5, class060692.z() * 0.5f + 0.5f, f2 + 1.5707964f, f3 / 3.0f, i, n2, 1.0, class033222, class045212);
                return;
            }
            if (class060692.y(4) == 0) continue;
            if (!class07811.N((class07321)class080502.R(), (double)d, (double)d3, (int)i, (int)n2, (float)f)) {
                return;
            }
            this.N(class060802, (class06034)class043892, class080502, function, class034602, d, d2, d3, d7 * d4, d8 * d5, class033222, class045212);
        }
    }

    private static boolean N(double d, double d2, double d3, double d4) {
        if (d2 <= d4) {
            return true;
        }
        return d * d + d2 * d2 + d3 * d3 >= 1.0;
    }

    private static /* synthetic */ boolean N(double d, class06080 class060802, double d2, double d3, double d4, int n) {
        return class07811.N(d2, d3, d4, d);
    }

    public boolean N(class04389 class043892, class06069 class060692) {
        return class060692.z() <= class043892.y;
    }

    public boolean N(class06080 class060802, class04389 class043892, class08050 class080502, Function<class07209, class03556<class00780>> function, class06069 class060692, class03460 class034602, class07321 class073212, class03322 class033222) {
        int n = class01296.L((int)(this.u() * 2 - 1));
        int n2 = class060692.y(class060692.y(class060692.y(this.N()) + 1) + 1);
        for (int i = 0; i < n2; ++i) {
            float f;
            double d = class073212.N(class060692.y(16));
            double d2 = class043892.B.N(class060692, (class06057)class060802);
            double d3 = class073212.y(class060692.y(16));
            double d4 = class043892.u.N(class060692);
            double d5 = class043892.i.N(class060692);
            class04521 class045212 = (arg_0, arg_1, arg_2, arg_3, arg_4) -> class07811.N(class043892.W.N(class060692), arg_0, arg_1, arg_2, arg_3, arg_4);
            int n3 = 1;
            if (class060692.y(4) == 0) {
                double d6 = class043892.Z.N(class060692);
                f = 1.0f + class060692.z() * 6.0f;
                this.N(class060802, class043892, class080502, function, class034602, d, d2, d3, f, d6, class033222, class045212);
                n3 += class060692.y(4);
            }
            for (int j = 0; j < n3; ++j) {
                float f2 = class060692.z() * ((float)Math.PI * 2);
                f = (class060692.z() - 0.5f) / 4.0f;
                float f3 = this.N(class060692);
                int n4 = n - class060692.y(n / 4);
                boolean bl = false;
                this.N(class060802, class043892, class080502, function, class060692.B(), class034602, d, d2, d3, d4, d5, f3, f2, f, 0, n4, this.y(), class033222, class045212);
            }
        }
        return true;
    }

    protected int N() {
        return 15;
    }

    protected float N(class06069 class060692) {
        float f = class060692.z() * 2.0f + class060692.z();
        if (class060692.y(10) == 0) {
            f *= class060692.z() * class060692.z() * 3.0f + 1.0f;
        }
        return f;
    }

    protected void N(class06080 class060802, class04389 class043892, class08050 class080502, Function<class07209, class03556<class00780>> function, class03460 class034602, double d, double d2, double d3, float f, double d4, class03322 class033222, class04521 class045212) {
        double d5 = 1.5 + (double)(class04995.m((double)1.5707963705062866) * f);
        double d6 = d5 * d4;
        this.N(class060802, (class06034)class043892, class080502, function, class034602, d + 1.0, d2, d3, d5, d6, class033222, class045212);
    }
}

