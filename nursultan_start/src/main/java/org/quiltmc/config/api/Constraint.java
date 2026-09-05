/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api;

import java.util.Comparator;
import java.util.Optional;
import org.quiltmc.config.api.Constraint$1;
import org.quiltmc.config.api.Constraint$All;
import org.quiltmc.config.api.Constraint$Range;

public interface Constraint {
    public Optional test(Object var1);

    public static Constraint range(int n, int n2) {
        Integer n3 = n;
        Comparator comparator = Integer::compareTo;
        return new Constraint$Range(n3, n2, comparator);
    }

    public static Constraint range(double d, double d2) {
        Double d3 = d;
        Comparator comparator = Double::compareTo;
        return new Constraint$Range(d3, d2, comparator);
    }

    public static Constraint range(float f, float f2) {
        Float f3 = Float.valueOf(f);
        Comparator comparator = Float::compareTo;
        return new Constraint$Range(f3, Float.valueOf(f2), comparator);
    }

    public static Constraint range(long l, long l2) {
        Long l3 = l;
        Comparator comparator = Long::compareTo;
        return new Constraint$Range(l3, l2, comparator);
    }

    public static Constraint all(Constraint constraint) {
        return new Constraint$All(constraint);
    }

    public static Constraint matching(String string) {
        return new Constraint$1(string);
    }

    public String getRepresentation();
}

