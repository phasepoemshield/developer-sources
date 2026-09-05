/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00780
 *  minecraft.class02158
 *  minecraft.class03322
 *  minecraft.class03460
 *  minecraft.class03556
 *  minecraft.class04995
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class08050
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Function;
import minecraft.class00780;
import minecraft.class02158;
import minecraft.class03322;
import minecraft.class03460;
import minecraft.class03556;
import minecraft.class04995;
import minecraft.class06057;
import minecraft.class06069;
import minecraft.class06072;
import minecraft.class06080;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class08050;

public class class06062
extends class02158<class06072> {
    public class06062(Codec<class06072> codec) {
        super(codec);
    }

    private boolean N(class06080 class060802, float[] fArray, double d, double d2, double d3, int n) {
        int n2 = n - class060802.i();
        return (d * d + d3 * d3) * (double)fArray[n2 - 1] + d2 * d2 / 6.0 >= 1.0;
    }

    private double N(class06072 class060722, class06069 class060692, double d, float f, float f2) {
        float f3 = 1.0f - class04995.L((float)(0.5f - f2 / f)) * 2.0f;
        return (double)(class060722.i.R + class060722.i.M * f3) * d * (double)class04995.y((class06069)class060692, (float)0.75f, (float)1.0f);
    }

    public boolean N(class06072 class060722, class06069 class060692) {
        return class060692.z() <= class060722.y;
    }

    public boolean N(class06080 class060802, class06072 class060722, class08050 class080502, Function<class07209, class03556<class00780>> function, class06069 class060692, class03460 class034602, class07321 class073212, class03322 class033222) {
        int n = (this.u() * 2 - 1) * 16;
        double d = class073212.N(class060692.y(16));
        int n2 = class060722.B.N(class060692, (class06057)class060802);
        double d2 = class073212.y(class060692.y(16));
        float f = class060692.z() * ((float)Math.PI * 2);
        float f2 = class060722.u.N(class060692);
        double d3 = class060722.Z.N(class060692);
        float f3 = class060722.i.L.N(class060692);
        int n3 = (int)((float)n * class060722.i.y.N(class060692));
        boolean bl = false;
        this.N(class060802, class060722, class080502, function, class060692.B(), class034602, d, n2, d2, f3, f, f2, 0, n3, d3, class033222);
        return true;
    }

    private void N(class06080 class060803, class06072 class060722, class08050 class080502, Function<class07209, class03556<class00780>> function, long l, class03460 class034602, double d4, double d5, double d6, float f, float f2, float f3, int n2, int n3, double d7, class03322 class033222) {
        class06069 class060692 = class06069.y(l);
        float[] fArray = this.N(class060803, class060722, class060692);
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i = n2; i < n3; ++i) {
            double d8 = 1.5 + (double)(class04995.m((double)((float)i * (float)Math.PI / (float)n3)) * f);
            double d9 = d8 * d7;
            d8 *= (double)class060722.i.i.N(class060692);
            d9 = this.N(class060722, class060692, d9, n3, i);
            float f6 = class04995.P((double)f3);
            float f7 = class04995.m((double)f3);
            d4 += (double)(class04995.P((double)f2) * f6);
            d5 += (double)f7;
            d6 += (double)(class04995.m((double)f2) * f6);
            f3 *= 0.7f;
            f3 += f5 * 0.05f;
            f2 += f4 * 0.05f;
            f5 *= 0.8f;
            f4 *= 0.5f;
            f5 += (class060692.z() - class060692.z()) * class060692.z() * 2.0f;
            f4 += (class060692.z() - class060692.z()) * class060692.z() * 4.0f;
            if (class060692.y(4) == 0) continue;
            if (!class06062.N((class07321)class080502.R(), (double)d4, (double)d6, (int)i, (int)n3, (float)f)) {
                return;
            }
            this.N(class060803, class060722, class080502, function, class034602, d4, d5, d6, d8, d9, class033222, (class060802, d, d2, d3, n) -> this.N(class060802, fArray, d, d2, d3, n));
        }
    }

    private float[] N(class06080 class060802, class06072 class060722, class06069 class060692) {
        int n = class060802.R();
        float[] fArray = new float[n];
        float f = 1.0f;
        for (int i = 0; i < n; ++i) {
            if (i == 0 || class060692.y(class060722.i.u) == 0) {
                f = 1.0f + class060692.z() * class060692.z();
            }
            fArray[i] = f * f;
        }
        return fArray;
    }
}

