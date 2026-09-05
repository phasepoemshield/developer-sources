/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02566
 *  minecraft.class04995
 */
package eu.pb4.placeholders.impl.color;

import eu.pb4.placeholders.impl.GeneralUtils;
import minecraft.class02566;
import minecraft.class04995;

public record OkLab(float l, float a, float b) {
    static float f(float f) {
        if ((double)f >= 0.0031308) {
            return (float)(1.055 * Math.pow(f, 0.4166666666666667) - 0.055);
        }
        return (float)(12.92 * (double)f);
    }

    private static OkLab fromLinearSRGB(float f, float f2, float f3) {
        float f4 = 0.41222146f * f + 0.53633255f * f2 + 0.051445995f * f3;
        float f5 = 0.2119035f * f + 0.6806995f * f2 + 0.10739696f * f3;
        float f6 = 0.08830246f * f + 0.28171885f * f2 + 0.6299787f * f3;
        float f7 = (float)Math.cbrt(f4);
        float f8 = (float)Math.cbrt(f5);
        float f9 = (float)Math.cbrt(f6);
        return new OkLab(0.21045426f * f7 + 0.7936178f * f8 - 0.004072047f * f9, 1.9779985f * f7 - 2.4285922f * f8 + 0.4505937f * f9, 0.025904037f * f7 + 0.78277177f * f8 - 0.80867577f * f9);
    }

    static float f_inv(float f) {
        if ((double)f >= 0.04045) {
            return (float)Math.pow(((double)f + 0.055) / 1.055, 2.4);
        }
        return f / 12.92f;
    }

    public static OkLab fromRgb(int n) {
        return OkLab.fromLinearSRGB((float)class02566.L((int)n) / 255.0f, (float)class02566.u((int)n) / 255.0f, (float)class02566.i((int)n) / 255.0f);
    }

    public static int toRgb(float f, float f2, float f3) {
        float f4 = f + 0.39633778f * f2 + 0.21580376f * f3;
        float f5 = f - 0.105561346f * f2 - 0.06385417f * f3;
        float f6 = f - 0.08948418f * f2 - 1.2914855f * f3;
        float f7 = f4 * f4 * f4;
        float f8 = f5 * f5 * f5;
        float f9 = f6 * f6 * f6;
        float f10 = 4.0767417f * f7 - 3.3077116f * f8 + 0.23096994f * f9;
        float f11 = -1.268438f * f7 + 2.6097574f * f8 - 0.34131938f * f9;
        float f12 = -0.0041960864f * f7 - 0.7034186f * f8 + 1.7076147f * f9;
        float f13 = Math.max(Math.max(Math.max(f10, f11), f12), 1.0f);
        float f14 = Math.min(Math.min(Math.min(f10, f11), f12), 0.0f);
        float f15 = 1.0f;
        if (f13 > 1.0f || f14 < 0.0f) {
            // empty if block
        }
        return GeneralUtils.rgbToInt(class04995.N((float)(f10 * f15), (float)0.0f, (float)1.0f), class04995.N((float)(f11 * f15), (float)0.0f, (float)1.0f), class04995.N((float)(f12 * f15), (float)0.0f, (float)1.0f));
    }

    public int toRgb() {
        return OkLab.toRgb(this.l, this.a, this.b);
    }
}

