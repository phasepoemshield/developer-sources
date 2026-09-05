/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.impl.color;

import eu.pb4.placeholders.impl.GeneralUtils;

public record HSV(float h, float s, float v) {
    public static HSV fromRgb(int n) {
        float f = (float)(n % 256) / 255.0f;
        float f2 = (float)((n >>= 8) % 256) / 255.0f;
        float f3 = (float)((n >>= 8) % 256) / 255.0f;
        float f4 = Math.max(f3, Math.max(f2, f));
        float f5 = Math.min(f3, Math.min(f2, f));
        float f6 = f4 - f5;
        float f7 = -1.0f;
        float f8 = -1.0f;
        if (f4 == f5) {
            f7 = 0.0f;
        } else if (f4 == f3) {
            f7 = (0.1666f * ((f2 - f) / f6) + 1.0f) % 1.0f;
        } else if (f4 == f2) {
            f7 = (0.1666f * ((f - f3) / f6) + 0.333f) % 1.0f;
        } else if (f4 == f) {
            f7 = (0.1666f * ((f3 - f2) / f6) + 0.666f) % 1.0f;
        }
        f8 = f4 == 0.0f ? 0.0f : f6 / f4;
        return new HSV(f7, f8, f4);
    }

    public int toRgb() {
        return HSV.toRgb(this.h, this.s, this.v);
    }

    public static int toRgb(float f, float f2, float f3) {
        int n = (int)(f * 6.0f) % 6;
        float f4 = f * 6.0f - (float)n;
        float f5 = f3 * (1.0f - f2);
        float f6 = f3 * (1.0f - f4 * f2);
        float f7 = f3 * (1.0f - (1.0f - f4) * f2);
        return switch (n) {
            case 0 -> GeneralUtils.rgbToInt(f3, f7, f5);
            case 1 -> GeneralUtils.rgbToInt(f6, f3, f5);
            case 2 -> GeneralUtils.rgbToInt(f5, f3, f7);
            case 3 -> GeneralUtils.rgbToInt(f5, f6, f3);
            case 4 -> GeneralUtils.rgbToInt(f7, f5, f3);
            case 5 -> GeneralUtils.rgbToInt(f3, f5, f6);
            default -> 0;
        };
    }
}

