/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  minecraft.class00630
 *  minecraft.class00631
 */
package net.caffeinemc.mods.lithium.common.shapes.pairs;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import minecraft.class00630;
import minecraft.class00631;

public final class LithiumDoublePairList
implements class00630 {
    private final double[] merged;
    private final int[] indicesFirst;
    private final int[] indicesSecond;
    private final DoubleArrayList pairs;

    public LithiumDoublePairList(DoubleList doubleList, DoubleList doubleList2, boolean bl, boolean bl2) {
        int n = doubleList.size() + doubleList2.size();
        this.merged = new double[n];
        this.indicesFirst = new int[n];
        this.indicesSecond = new int[n];
        this.pairs = DoubleArrayList.wrap((double[])this.merged);
        this.merge(LithiumDoublePairList.getArray(doubleList), LithiumDoublePairList.getArray(doubleList2), doubleList.size(), doubleList2.size(), bl, bl2);
    }

    public int size() {
        return this.pairs.size();
    }

    private void merge(double[] dArray, double[] dArray2, int n, int n2, boolean bl, boolean bl2) {
        int n3 = 0;
        int n4 = 0;
        double d = 0.0;
        int n5 = 0;
        int n6 = 0;
        while (true) {
            boolean bl3;
            boolean bl4 = n3 < n;
            boolean bl5 = bl3 = n4 < n2;
            if (!bl4 && !bl3) break;
            boolean bl6 = bl4 && (!bl3 || dArray[n3] < dArray2[n4] + 1.0E-7);
            double d2 = bl6 ? dArray[n3++] : dArray2[n4++];
            if ((n3 == 0 || !bl4) && !bl6 && !bl2 || (n4 == 0 || !bl3) && bl6 && !bl) continue;
            if (n6 == 0 || d < d2 - 1.0E-7) {
                this.indicesFirst[n5] = n3 - 1;
                this.indicesSecond[n5] = n4 - 1;
                this.merged[n6] = d2;
                ++n5;
                ++n6;
                d = d2;
                continue;
            }
            if (n6 <= 0) continue;
            this.indicesFirst[n5 - 1] = n3 - 1;
            this.indicesSecond[n5 - 1] = n4 - 1;
        }
        if (n6 == 0) {
            this.merged[n6++] = Math.min(dArray[n - 1], dArray2[n2 - 1]);
        }
        this.pairs.size(n6);
    }

    private static double[] getArray(DoubleList doubleList) {
        if (doubleList instanceof DoubleArrayList) {
            return ((DoubleArrayList)doubleList).elements();
        }
        double[] dArray = new double[doubleList.size()];
        for (int i = 0; i < dArray.length; ++i) {
            dArray[i] = doubleList.getDouble(i);
        }
        return dArray;
    }

    public boolean method_1065(class00631 class006312) {
        int n = this.pairs.size() - 1;
        for (int i = 0; i < n; ++i) {
            if (class006312.merge(this.indicesFirst[i], this.indicesSecond[i], i)) continue;
            return false;
        }
        return true;
    }

    public DoubleList method_1066() {
        return this.pairs;
    }
}

