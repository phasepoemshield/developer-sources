/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08280
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 */
package net.irisshaders.iris.pbr.util;

import minecraft.class08280;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;

public class ImageManipulationUtil {
    public static class08280 scaleBilinear(class08280 class082802, int n, int n2) {
        class08280 class082803 = new class08280(class082802.L(), n, n2, false);
        float f = (float)n / (float)class082802.N();
        float f2 = (float)n2 / (float)class082802.y();
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                float f3 = ((float)j + 0.5f) / f;
                float f4 = ((float)i + 0.5f) / f2;
                int n3 = Math.round(f3);
                int n4 = Math.round(f4);
                int n5 = n3 - 1;
                int n6 = n4 - 1;
                boolean bl = true;
                boolean bl2 = true;
                boolean bl3 = true;
                boolean bl4 = true;
                if (n5 < 0) {
                    bl = false;
                }
                if (n6 < 0) {
                    bl2 = false;
                }
                if (n3 >= class082802.N()) {
                    bl3 = false;
                }
                if (n4 >= class082802.y()) {
                    bl4 = false;
                }
                int n7 = 0;
                if (bl & bl2 & bl3 & bl4) {
                    var19_19 = (float)n3 + 0.5f - f3;
                    var20_20 = f3 - ((float)n5 + 0.5f);
                    float f5 = (float)n4 + 0.5f - f4;
                    float f6 = f4 - ((float)n6 + 0.5f);
                    float f7 = var19_19 * f5;
                    float f8 = var20_20 * f5;
                    float f9 = var19_19 * f6;
                    float f10 = var20_20 * f6;
                    int n8 = class082802.N(n5, n6);
                    int n9 = class082802.N(n3, n6);
                    int n10 = class082802.N(n5, n4);
                    int n11 = class082802.N(n3, n4);
                    n7 = ImageManipulationUtil.blendColor(n8, n9, n10, n11, f7, f8, f9, f10);
                } else if (bl & bl3) {
                    var19_19 = (float)n3 + 0.5f - f3;
                    var20_20 = f3 - ((float)n5 + 0.5f);
                    int n12 = bl2 ? n6 : n4;
                    int n13 = class082802.N(n5, n12);
                    int n14 = class082802.N(n3, n12);
                    n7 = ImageManipulationUtil.blendColor(n13, n14, var19_19, var20_20);
                } else if (bl2 & bl4) {
                    var19_19 = (float)n4 + 0.5f - f4;
                    var20_20 = f4 - ((float)n6 + 0.5f);
                    int n15 = bl ? n5 : n3;
                    int n16 = class082802.N(n15, n6);
                    int n17 = class082802.N(n15, n4);
                    n7 = ImageManipulationUtil.blendColor(n16, n17, var19_19, var20_20);
                } else {
                    n7 = class082802.N(bl ? n5 : n3, bl2 ? n6 : n4);
                }
                class082803.y(j, i, n7);
            }
        }
        return class082803;
    }

    private static int blendChannel(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        return Math.round((float)n * f + (float)n2 * f2 + (float)n3 * f3 + (float)n4 * f4);
    }

    private static int blendChannel(int n, int n2, float f, float f2) {
        return Math.round((float)n * f + (float)n2 * f2);
    }

    public static class08280 scaleNearestNeighbor(class08280 class082802, int n, int n2) {
        class08280 class082803 = new class08280(class082802.L(), n, n2, false);
        float f = (float)n / (float)class082802.N();
        float f2 = (float)n2 / (float)class082802.y();
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                float f3 = ((float)j + 0.5f) / f;
                float f4 = ((float)i + 0.5f) / f2;
                class082803.y(j, i, class082802.N((int)f3, (int)f4));
            }
        }
        return class082803;
    }

    private static int packABGR(int n, int n2, int n3, int n4) {
        return ColorABGR.pack((int)n4, (int)n3, (int)n2, (int)n);
    }

    private static int blendColor(int n, int n2, int n3, int n4, float f, float f2, float f3, float f4) {
        return ImageManipulationUtil.packABGR(ImageManipulationUtil.blendChannel(ColorABGR.unpackAlpha((int)n), ColorABGR.unpackAlpha((int)n2), ColorABGR.unpackAlpha((int)n3), ColorABGR.unpackAlpha((int)n4), f, f2, f3, f4), ImageManipulationUtil.blendChannel(ColorABGR.unpackBlue((int)n), ColorABGR.unpackBlue((int)n2), ColorABGR.unpackBlue((int)n3), ColorABGR.unpackBlue((int)n4), f, f2, f3, f4), ImageManipulationUtil.blendChannel(ColorABGR.unpackGreen((int)n), ColorABGR.unpackGreen((int)n2), ColorABGR.unpackGreen((int)n3), ColorABGR.unpackGreen((int)n4), f, f2, f3, f4), ImageManipulationUtil.blendChannel(ColorABGR.unpackRed((int)n), ColorABGR.unpackRed((int)n2), ColorABGR.unpackRed((int)n3), ColorABGR.unpackRed((int)n4), f, f2, f3, f4));
    }

    private static int blendColor(int n, int n2, float f, float f2) {
        return ImageManipulationUtil.packABGR(ImageManipulationUtil.blendChannel(ColorABGR.unpackAlpha((int)n), ColorABGR.unpackAlpha((int)n2), f, f2), ImageManipulationUtil.blendChannel(ColorABGR.unpackBlue((int)n), ColorABGR.unpackBlue((int)n2), f, f2), ImageManipulationUtil.blendChannel(ColorABGR.unpackGreen((int)n), ColorABGR.unpackGreen((int)n2), f, f2), ImageManipulationUtil.blendChannel(ColorABGR.unpackRed((int)n), ColorABGR.unpackRed((int)n2), f, f2));
    }
}

