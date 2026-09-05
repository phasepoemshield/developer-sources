/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntRBTreeSet
 *  it.unimi.dsi.fastutil.ints.IntSortedSet
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class07836
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntSortedSet;
import java.util.List;
import minecraft.class05022;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class07836;
import org.jspecify.annotations.Nullable;

public class class05024 {
    private final @Nullable class05022[] N;
    private final double y;
    private final double L;

    public class05024(class06069 class060692, List<Integer> list) {
        this(class060692, (IntSortedSet)new IntRBTreeSet(list));
    }

    private class05024(class06069 class060692, IntSortedSet intSortedSet) {
        int n;
        if (intSortedSet.isEmpty()) {
            throw new IllegalArgumentException("Need some octaves!");
        }
        int n2 = -intSortedSet.firstInt();
        int n3 = n2 + (n = intSortedSet.lastInt()) + 1;
        if (n3 < 1) {
            throw new IllegalArgumentException("Total number of octaves needs to be >= 1");
        }
        class05022 class050222 = new class05022(class060692);
        int n4 = n;
        this.N = new class05022[n3];
        if (n4 >= 0 && n4 < n3 && intSortedSet.contains(0)) {
            this.N[n4] = class050222;
        }
        for (int i = n4 + 1; i < n3; ++i) {
            if (i >= 0 && intSortedSet.contains(n4 - i)) {
                this.N[i] = new class05022(class060692);
                continue;
            }
            class060692.L(262);
        }
        if (n > 0) {
            long l = (long)(class050222.N(class050222.y, class050222.L, class050222.u) * 9.223372036854776E18);
            class07836 class078362 = new class07836((class06069)new class06075(l));
            for (int i = n4 - 1; i >= 0; --i) {
                if (i < n3 && intSortedSet.contains(n4 - i)) {
                    this.N[i] = new class05022((class06069)class078362);
                    continue;
                }
                class078362.L(262);
            }
        }
        this.L = Math.pow(2.0, n);
        this.y = 1.0 / (Math.pow(2.0, n3) - 1.0);
    }

    public double N(double d, double d2, boolean bl) {
        double d3 = 0.0;
        double d4 = this.L;
        double d5 = this.y;
        for (class05022 class050222 : this.N) {
            if (class050222 != null) {
                d3 += class050222.N(d * d4 + (bl ? class050222.y : 0.0), d2 * d4 + (bl ? class050222.L : 0.0)) * d5;
            }
            d4 /= 2.0;
            d5 *= 2.0;
        }
        return d3;
    }
}

