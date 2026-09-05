/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.Double2IntMap
 *  it.unimi.dsi.fastutil.doubles.Double2IntOpenHashMap
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleCollection
 *  it.unimi.dsi.fastutil.doubles.DoubleComparators
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet
 *  minecraft.class00494
 *  minecraft.class00734
 *  minecraft.class06864
 *  minecraft.class06889
 *  minecraft.class06890
 *  minecraft.class07185
 *  minecraft.class07739
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.ArrayVoxelShapeInvoker
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.BitSetDiscreteVoxelShapeAccessor
 */
package net.caffeinemc.mods.lithium.common.shapes;

import it.unimi.dsi.fastutil.doubles.Double2IntMap;
import it.unimi.dsi.fastutil.doubles.Double2IntOpenHashMap;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleCollection;
import it.unimi.dsi.fastutil.doubles.DoubleComparators;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import java.util.BitSet;
import java.util.List;
import java.util.Optional;
import minecraft.class00494;
import minecraft.class00734;
import minecraft.class06864;
import minecraft.class06889;
import minecraft.class06890;
import minecraft.class07185;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.ArrayVoxelShapeInvoker;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.BitSetDiscreteVoxelShapeAccessor;

public class VoxelShapeHelper {
    private static int getIndex(int n, int n2, int n3, int n4, int n5, int n6) {
        return (n * n5 + n2) * n6 + n3;
    }

    public static Optional<class06889> getClosestPointTo(class06889 class068892, class00494 class004942, List<class00734> list) {
        int n;
        class00734 class0073422;
        DoubleOpenHashSet doubleOpenHashSet = new DoubleOpenHashSet();
        DoubleOpenHashSet doubleOpenHashSet2 = new DoubleOpenHashSet();
        DoubleOpenHashSet doubleOpenHashSet3 = new DoubleOpenHashSet();
        doubleOpenHashSet.addAll((DoubleCollection)class004942.method_1109(class07185.field_11048));
        doubleOpenHashSet2.addAll((DoubleCollection)class004942.method_1109(class07185.field_11052));
        doubleOpenHashSet3.addAll((DoubleCollection)class004942.method_1109(class07185.field_11051));
        double d = class004942.method_1091(class07185.field_11048);
        double d2 = class004942.method_1105(class07185.field_11048);
        double d3 = class004942.method_1091(class07185.field_11052);
        double d4 = class004942.method_1105(class07185.field_11052);
        double d5 = class004942.method_1091(class07185.field_11051);
        double d6 = class004942.method_1105(class07185.field_11051);
        for (class00734 class0073422 : list) {
            if (class0073422.N > d) {
                doubleOpenHashSet.add(class0073422.N);
            }
            if (class0073422.u < d2) {
                doubleOpenHashSet.add(class0073422.u);
            }
            if (class0073422.y > d3) {
                doubleOpenHashSet2.add(class0073422.y);
            }
            if (class0073422.i < d4) {
                doubleOpenHashSet2.add(class0073422.i);
            }
            if (class0073422.L > d5) {
                doubleOpenHashSet3.add(class0073422.L);
            }
            if (!(class0073422.R < d6)) continue;
            doubleOpenHashSet3.add(class0073422.R);
        }
        DoubleArrayList doubleArrayList = new DoubleArrayList((DoubleCollection)doubleOpenHashSet);
        class0073422 = new DoubleArrayList((DoubleCollection)doubleOpenHashSet2);
        DoubleArrayList doubleArrayList2 = new DoubleArrayList((DoubleCollection)doubleOpenHashSet3);
        doubleArrayList.sort(DoubleComparators.NATURAL_COMPARATOR);
        class0073422.sort(DoubleComparators.NATURAL_COMPARATOR);
        doubleArrayList2.sort(DoubleComparators.NATURAL_COMPARATOR);
        Double2IntOpenHashMap double2IntOpenHashMap = new Double2IntOpenHashMap();
        Double2IntOpenHashMap double2IntOpenHashMap2 = new Double2IntOpenHashMap();
        Double2IntOpenHashMap double2IntOpenHashMap3 = new Double2IntOpenHashMap();
        for (n = 0; n < doubleArrayList.size(); ++n) {
            double2IntOpenHashMap.put(doubleArrayList.getDouble(n), n);
        }
        for (n = 0; n < class0073422.size(); ++n) {
            double2IntOpenHashMap2.put(class0073422.getDouble(n), n);
        }
        for (n = 0; n < doubleArrayList2.size(); ++n) {
            double2IntOpenHashMap3.put(doubleArrayList2.getDouble(n), n);
        }
        n = doubleArrayList.size() - 1;
        int n2 = class0073422.size() - 1;
        int n3 = doubleArrayList2.size() - 1;
        class06890 class068902 = new class06890(n, n2, n3);
        class068902.method_1049(0, 0, 0);
        class068902.method_1049(n, n2, n3);
        BitSet bitSet = ((BitSetDiscreteVoxelShapeAccessor)class068902).getStorage();
        bitSet.clear();
        VoxelShapeHelper.initVoxelSet(bitSet, class004942, list, doubleArrayList, (DoubleList)class0073422, (DoubleList)doubleArrayList2, (Double2IntMap)double2IntOpenHashMap, (Double2IntMap)double2IntOpenHashMap2, (Double2IntMap)double2IntOpenHashMap3, n, n2, n3);
        class06864 class068642 = ArrayVoxelShapeInvoker.init((class07739)class068902, (DoubleList)doubleArrayList, (DoubleList)class0073422, (DoubleList)doubleArrayList2);
        return class068642.method_33661(class068892);
    }

    private static void initVoxelSet(BitSet bitSet, class00494 class004942, List<class00734> list, DoubleArrayList doubleArrayList, DoubleList doubleList, DoubleList doubleList2, Double2IntMap double2IntMap, Double2IntMap double2IntMap2, Double2IntMap double2IntMap3, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        for (Object object : class004942.method_1090()) {
            int n12 = double2IntMap.get(((class00734)object).N);
            n11 = double2IntMap.get(((class00734)object).u);
            n10 = double2IntMap2.get(((class00734)object).y);
            n9 = double2IntMap2.get(((class00734)object).i);
            n8 = double2IntMap3.get(((class00734)object).L);
            n7 = double2IntMap3.get(((class00734)object).R);
            for (n6 = n12; n6 < n11; ++n6) {
                for (n5 = n10; n5 < n9; ++n5) {
                    for (n4 = n8; n4 < n7; ++n4) {
                        bitSet.set(VoxelShapeHelper.getIndex(n6, n5, n4, n, n2, n3), true);
                    }
                }
            }
        }
        BitSet bitSet2 = new BitSet(bitSet.size());
        for (class00734 class007342 : list) {
            n11 = double2IntMap.getOrDefault(class007342.N, 0);
            n10 = double2IntMap.getOrDefault(class007342.u, n);
            n9 = double2IntMap2.getOrDefault(class007342.y, 0);
            n8 = double2IntMap2.getOrDefault(class007342.i, n2);
            n7 = double2IntMap3.getOrDefault(class007342.L, 0);
            n6 = double2IntMap3.getOrDefault(class007342.R, n3);
            for (n5 = n11; n5 < n10; ++n5) {
                for (n4 = n9; n4 < n8; ++n4) {
                    for (int i = n7; i < n6; ++i) {
                        bitSet2.set(VoxelShapeHelper.getIndex(n5, n4, i, n, n2, n3));
                    }
                }
            }
        }
        bitSet.andNot(bitSet2);
    }
}

