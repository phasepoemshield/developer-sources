/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.math.Quantiles
 *  com.google.common.math.Quantiles$ScaleAndIndexes
 *  it.unimi.dsi.fastutil.ints.Int2DoubleRBTreeMap
 *  it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap
 *  it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.math.Quantiles;
import it.unimi.dsi.fastutil.ints.Int2DoubleRBTreeMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMap;
import it.unimi.dsi.fastutil.ints.Int2DoubleSortedMaps;
import java.util.Comparator;
import java.util.Map;
import minecraft.class07536;

public class class03213 {
    public static final Quantiles.ScaleAndIndexes N = Quantiles.scale((int)100).indexes(new int[]{50, 75, 90, 99});

    private class03213() {
    }

    public static Map<Integer, Double> N(double[] dArray) {
        return dArray.length == 0 ? Map.of() : class03213.N(N.compute(dArray));
    }

    private static Map<Integer, Double> N(Map<Integer, Double> map) {
        return Int2DoubleSortedMaps.unmodifiable((Int2DoubleSortedMap)((Int2DoubleSortedMap)class07536.N((Object)new Int2DoubleRBTreeMap(Comparator.reverseOrder()), (T int2DoubleRBTreeMap) -> int2DoubleRBTreeMap.putAll(map))));
    }

    public static Map<Integer, Double> N(long[] lArray) {
        return lArray.length == 0 ? Map.of() : class03213.N(N.compute(lArray));
    }

    public static Map<Integer, Double> N(int[] nArray) {
        return nArray.length == 0 ? Map.of() : class03213.N(N.compute(nArray));
    }
}

