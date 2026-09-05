/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06607
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.util.sorting;

import minecraft.class06607;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.sorting.RadixSort;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSortingExtended;
import org.jspecify.annotations.NonNull;

abstract class VertexSorters$AbstractSorter
implements VertexSortingExtended {
    VertexSorters$AbstractSorter() {
    }

    public final int @NonNull [] sort(class06607 class066072) {
        int n = class066072.N();
        int[] nArray = new int[n];
        int[] nArray2 = new int[n];
        for (int i = 0; i < n; ++i) {
            nArray[i] = ~MathUtil.floatToComparableInt(this.applyMetric(class066072.N(i), class066072.y(i), class066072.L(i)));
            nArray2[i] = i;
        }
        RadixSort.sortIndirect(nArray2, nArray, true);
        return nArray2;
    }
}

