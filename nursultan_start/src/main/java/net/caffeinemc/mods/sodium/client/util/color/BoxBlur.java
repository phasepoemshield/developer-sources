/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 */
package net.caffeinemc.mods.sodium.client.util.color;

import minecraft.class04995;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.client.util.color.BoxBlur$ColorBuffer;

public class BoxBlur {
    private static boolean isHomogenous(int[] nArray) {
        int n = nArray[0];
        for (int i = 1; i < nArray.length; ++i) {
            if (nArray[i] == n) continue;
            return false;
        }
        return true;
    }

    public static void blur(int[] nArray, int[] nArray2, int n, int n2, int n3) {
        if (BoxBlur.isHomogenous(nArray)) {
            return;
        }
        BoxBlur.blurImpl(nArray, nArray2, n3, n - n3, n, 0, n2, n2, n3);
        BoxBlur.blurImpl(nArray2, nArray, n3, n - n3, n, n3, n2 - n3, n2, n3);
    }

    private static int getAveragingMultiplier(int n) {
        return class04995.L((double)(1.6777216E7 / (double)n));
    }

    private static void blurImpl(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n7 * 2 + 1;
        int n9 = BoxBlur.getAveragingMultiplier(n8);
        block0: for (int i = n4; i < n5; ++i) {
            int n10;
            int n11;
            int n12 = 0;
            int n13 = 0;
            int n14 = 0;
            int n15 = BoxBlur$ColorBuffer.getIndex(n, i, n3);
            int n16 = n15 - n7;
            int n17 = n15 + n7;
            for (n11 = -n7; n11 <= n7; ++n11) {
                n10 = nArray[n15 + n11];
                n12 += ColorARGB.unpackRed((int)n10);
                n13 += ColorARGB.unpackGreen((int)n10);
                n14 += ColorARGB.unpackBlue((int)n10);
            }
            n11 = n;
            while (true) {
                nArray2[BoxBlur$ColorBuffer.getIndex((int)i, (int)n11, (int)n3)] = BoxBlur.averageRGB(n12, n13, n14, n9);
                if (++n11 >= n2) continue block0;
                n10 = nArray[n16++];
                n12 -= ColorARGB.unpackRed((int)n10);
                n13 -= ColorARGB.unpackGreen((int)n10);
                n14 -= ColorARGB.unpackBlue((int)n10);
                n10 = nArray[++n17];
                n12 += ColorARGB.unpackRed((int)n10);
                n13 += ColorARGB.unpackGreen((int)n10);
                n14 += ColorARGB.unpackBlue((int)n10);
            }
        }
    }

    public static int averageRGB(int n, int n2, int n3, int n4) {
        int n5 = -16777216;
        n5 |= n3 * n4 >>> 24 << 0;
        n5 |= n2 * n4 >>> 24 << 8;
        return n5 |= n * n4 >>> 24 << 16;
    }
}

