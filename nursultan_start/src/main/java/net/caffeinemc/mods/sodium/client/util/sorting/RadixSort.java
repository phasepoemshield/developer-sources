/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrays
 */
package net.caffeinemc.mods.sodium.client.util.sorting;

import it.unimi.dsi.fastutil.ints.IntArrays;

public class RadixSort {
    private static final int RADIX_SORT_THRESHOLD = 80;
    private static final int DIGIT_BITS = 8;
    private static final int RADIX_KEY_BITS = 32;
    private static final int BUCKET_COUNT = 256;
    private static final int DIGIT_COUNT = 4;
    private static final int DIGIT_MASK = 255;

    private static void sortIndirect(int[] nArray, int[] nArray2, int[][] nArray3, int[] nArray4) {
        int n = nArray.length;
        RadixSort.getHistogram(nArray3, nArray2);
        RadixSort.prefixSums(nArray3);
        int[] nArray5 = nArray;
        for (int i = 0; i < 4; ++i) {
            int[] nArray6 = nArray3[i];
            for (int j = 0; j < n; ++j) {
                int n2 = nArray5[j];
                int n3 = RadixSort.extractDigit(nArray2[n2], i);
                nArray4[nArray6[n3]] = n2;
                int n4 = n3;
                nArray6[n4] = nArray6[n4] + 1;
            }
            int[] nArray7 = nArray4;
            nArray4 = nArray5;
            nArray5 = nArray7;
        }
    }

    public static void sortIndirect(int[] nArray, int[] nArray2, boolean bl) {
        if (nArray.length <= 80) {
            RadixSort.smallSort(nArray, nArray2, bl);
            return;
        }
        try {
            int[][] nArray3 = new int[4][256];
            int[] nArray4 = new int[nArray.length];
            RadixSort.sortIndirect(nArray, nArray2, nArray3, nArray4);
        }
        catch (OutOfMemoryError outOfMemoryError) {
            Object var3_4 = null;
            Object var4_6 = null;
            RadixSort.fallbackSort(nArray, nArray2, bl);
        }
    }

    private static void fallbackSort(int[] nArray, int[] nArray2, boolean bl) {
        IntArrays.quickSortIndirect((int[])nArray, (int[])nArray2);
        if (bl) {
            IntArrays.stabilize((int[])nArray, (int[])nArray2);
        }
    }

    private static void getHistogram(int[][] nArray, int[] nArray2) {
        for (int n : nArray2) {
            for (int i = 0; i < 4; ++i) {
                int[] nArray3 = nArray[i];
                int n2 = RadixSort.extractDigit(n, i);
                nArray3[n2] = nArray3[n2] + 1;
            }
        }
    }

    private static int extractDigit(int n, int n2) {
        return n >>> n2 * 8 & 0xFF;
    }

    private static void prefixSums(int[][] nArray) {
        for (int i = 0; i < 4; ++i) {
            int[] nArray2 = nArray[i];
            int n = 0;
            for (int j = 0; j < 256; ++j) {
                int n2 = n;
                n += nArray2[j];
                nArray2[j] = n2;
            }
        }
    }

    private static void smallSort(int[] nArray, int[] nArray2, boolean bl) {
        if (nArray.length <= 1) {
            return;
        }
        RadixSort.fallbackSort(nArray, nArray2, bl);
    }
}

