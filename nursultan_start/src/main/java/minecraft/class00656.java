/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleLists
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleLists;
import minecraft.class00630;
import minecraft.class00631;

public class class00656
implements class00630 {
    private static final DoubleList N = DoubleLists.unmodifiable((DoubleList)DoubleArrayList.wrap((double[])new double[]{0.0}));
    private final double[] y;
    private final int[] L;
    private final int[] u;
    private final int i;

    public class00656(DoubleList doubleList, DoubleList doubleList2, boolean bl, boolean bl2) {
        double d = Double.NaN;
        int n = doubleList.size();
        int n2 = doubleList2.size();
        int n3 = n + n2;
        this.y = new double[n3];
        this.L = new int[n3];
        this.u = new int[n3];
        boolean bl3 = !bl;
        boolean bl4 = !bl2;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        while (true) {
            double d2;
            boolean bl5;
            boolean bl6;
            boolean bl7 = n5 >= n;
            boolean bl8 = bl6 = n6 >= n2;
            if (bl7 && bl6) break;
            boolean bl9 = bl5 = !bl7 && (bl6 || doubleList.getDouble(n5) < doubleList2.getDouble(n6) + 1.0E-7);
            if (bl5) {
                ++n5;
                if (bl3 && (n6 == 0 || bl6)) {
                    continue;
                }
            } else {
                ++n6;
                if (bl4 && (n5 == 0 || bl7)) continue;
            }
            int n7 = n5 - 1;
            int n8 = n6 - 1;
            double d3 = d2 = bl5 ? doubleList.getDouble(n7) : doubleList2.getDouble(n8);
            if (!(d >= d2 - 1.0E-7)) {
                this.L[n4] = n7;
                this.u[n4] = n8;
                this.y[n4] = d2;
                ++n4;
                d = d2;
                continue;
            }
            this.L[n4 - 1] = n7;
            this.u[n4 - 1] = n8;
        }
        this.i = Math.max(1, n4);
    }

    @Override
    public int size() {
        return this.i;
    }

    @Override
    public boolean method_1065(class00631 class006312) {
        int n = this.i - 1;
        for (int i = 0; i < n; ++i) {
            if (class006312.merge(this.L[i], this.u[i], i)) continue;
            return false;
        }
        return true;
    }

    @Override
    public DoubleList method_1066() {
        return this.i <= 1 ? N : DoubleArrayList.wrap((double[])this.y, (int)this.i);
    }
}

