/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.ints.IntBidirectionalIterator
 *  it.unimi.dsi.fastutil.ints.IntRBTreeSet
 *  it.unimi.dsi.fastutil.ints.IntSortedSet
 *  minecraft.class01818
 *  minecraft.class04860
 *  minecraft.class06069
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.ints.IntBidirectionalIterator;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.stream.IntStream;
import minecraft.class01818;
import minecraft.class04860;
import minecraft.class04995;
import minecraft.class06069;
import org.jspecify.annotations.Nullable;

public class class05008 {
    private static final int N = 0x2000000;
    private final @Nullable class04860[] y;
    private final int L;
    private final DoubleList u;
    private final double i;
    private final double R;
    private final double M;

    protected DoubleList L() {
        return this.u;
    }

    private double L(double d) {
        double d2 = 0.0;
        double d3 = this.i;
        for (int i = 0; i < this.y.length; ++i) {
            if (this.y[i] != null) {
                d2 += this.u.getDouble(i) * d * d3;
            }
            d3 /= 2.0;
        }
        return d2;
    }

    protected class05008(class06069 class060692, Pair<Integer, DoubleList> pair, boolean bl) {
        this.L = (Integer)pair.getFirst();
        this.u = (DoubleList)pair.getSecond();
        int n = this.u.size();
        int n2 = -this.L;
        this.y = new class04860[n];
        if (bl) {
            class01818 class018182 = class060692.L();
            for (int i = 0; i < n; ++i) {
                if (this.u.getDouble(i) == 0.0) continue;
                int n3 = this.L + i;
                this.y[i] = new class04860(class018182.N("octave_" + n3));
            }
        } else {
            double d2;
            class04860 class048602 = new class04860(class060692);
            if (n2 >= 0 && n2 < n && (d2 = this.u.getDouble(n2)) != 0.0) {
                this.y[n2] = class048602;
            }
            for (int i = n2 - 1; i >= 0; --i) {
                if (i < n) {
                    double d3 = this.u.getDouble(i);
                    if (d3 != 0.0) {
                        this.y[i] = new class04860(class060692);
                        continue;
                    }
                    class05008.N(class060692);
                    continue;
                }
                class05008.N(class060692);
            }
            if (Arrays.stream(this.y).filter(Objects::nonNull).count() != this.u.stream().filter(d -> d != 0.0).count()) {
                throw new IllegalStateException("Failed to create correct number of noise levels for given non-zero amplitudes");
            }
            if (n2 < n - 1) {
                throw new IllegalArgumentException("Positive octaves are temporarily disabled");
            }
        }
        this.R = Math.pow(2.0, -n2);
        this.i = Math.pow(2.0, n - 1) / (Math.pow(2.0, n) - 1.0);
        this.M = this.L(2.0);
    }

    protected int y() {
        return this.L;
    }

    public static double y(double d) {
        return d - (double)class04995.y(d / 3.3554432E7 + 0.5) * 3.3554432E7;
    }

    public static class05008 y(class06069 class060692, IntStream intStream) {
        return class05008.N(class060692, (List)intStream.boxed().collect(ImmutableList.toImmutableList()));
    }

    public static class05008 y(class06069 class060692, int n, DoubleList doubleList) {
        return new class05008(class060692, (Pair<Integer, DoubleList>)Pair.of((Object)n, (Object)doubleList), true);
    }

    public @Nullable class04860 N(int n) {
        return this.y[this.y.length - 1 - n];
    }

    public double N(double d) {
        return this.L(d + 2.0);
    }

    @Deprecated
    public static class05008 N(class06069 class060692, IntStream intStream) {
        return new class05008(class060692, class05008.N((IntSortedSet)new IntRBTreeSet((Collection)intStream.boxed().collect(ImmutableList.toImmutableList()))), false);
    }

    public void N(StringBuilder stringBuilder) {
        stringBuilder.append("PerlinNoise{");
        List list = this.u.stream().map(d -> String.format(Locale.ROOT, "%.2f", d)).toList();
        stringBuilder.append("first octave: ").append(this.L).append(", amplitudes: ").append(list).append(", noise levels: [");
        for (int i = 0; i < this.y.length; ++i) {
            stringBuilder.append(i).append(": ");
            class04860 class048602 = this.y[i];
            if (class048602 == null) {
                stringBuilder.append("null");
            } else {
                class048602.N(stringBuilder);
            }
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        stringBuilder.append("}");
    }

    private static Pair<Integer, DoubleList> N(IntSortedSet intSortedSet) {
        int n;
        if (intSortedSet.isEmpty()) {
            throw new IllegalArgumentException("Need some octaves!");
        }
        int n2 = -intSortedSet.firstInt();
        int n3 = n2 + (n = intSortedSet.lastInt()) + 1;
        if (n3 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
        }
        DoubleArrayList doubleArrayList = new DoubleArrayList(new double[n3]);
        IntBidirectionalIterator intBidirectionalIterator = intSortedSet.iterator();
        while (intBidirectionalIterator.hasNext()) {
            int n4 = intBidirectionalIterator.nextInt();
            doubleArrayList.set(n4 + n2, 1.0);
        }
        return Pair.of((Object)(-n2), (Object)doubleArrayList);
    }

    public static class05008 N(class06069 class060692, int n, double d, double ... dArray) {
        DoubleArrayList doubleArrayList = new DoubleArrayList(dArray);
        doubleArrayList.add(0, d);
        return new class05008(class060692, (Pair<Integer, DoubleList>)Pair.of((Object)n, (Object)doubleArrayList), true);
    }

    public static class05008 N(class06069 class060692, List<Integer> list) {
        return new class05008(class060692, class05008.N((IntSortedSet)new IntRBTreeSet(list)), true);
    }

    @Deprecated
    public static class05008 N(class06069 class060692, int n, DoubleList doubleList) {
        return new class05008(class060692, (Pair<Integer, DoubleList>)Pair.of((Object)n, (Object)doubleList), false);
    }

    @Deprecated
    public double N(double d, double d2, double d3, double d4, double d5, boolean bl) {
        double d6 = 0.0;
        double d7 = this.R;
        double d8 = this.i;
        for (int i = 0; i < this.y.length; ++i) {
            class04860 class048602 = this.y[i];
            if (class048602 != null) {
                double d9 = class048602.N(class05008.y(d * d7), bl ? -class048602.y : class05008.y(d2 * d7), class05008.y(d3 * d7), d4 * d7, d5 * d7);
                d6 += this.u.getDouble(i) * d9 * d8;
            }
            d7 *= 2.0;
            d8 /= 2.0;
        }
        return d6;
    }

    public double N(double d, double d2, double d3) {
        return this.N(d, d2, d3, 0.0, 0.0, false);
    }

    private static void N(class06069 class060692) {
        class060692.L(262);
    }

    protected double N() {
        return this.M;
    }
}

