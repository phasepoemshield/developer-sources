/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.DoubleArrayList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleListIterator
 *  minecraft.class06069
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleListIterator;
import minecraft.class05008;
import minecraft.class05056;
import minecraft.class06069;

public class class05041 {
    private static final double N = 1.0181268882175227;
    private static final double y = 0.3333333333333333;
    private final double L;
    private final class05008 u;
    private final class05008 i;
    private final double R;
    private final class05056 M;

    private class05041(class06069 class060692, class05056 class050562, boolean bl) {
        int n = class050562.N();
        DoubleList doubleList = class050562.y();
        this.M = class050562;
        if (bl) {
            this.u = class05008.y(class060692, n, doubleList);
            this.i = class05008.y(class060692, n, doubleList);
        } else {
            this.u = class05008.N(class060692, n, doubleList);
            this.i = class05008.N(class060692, n, doubleList);
        }
        int n2 = Integer.MAX_VALUE;
        int n3 = Integer.MIN_VALUE;
        DoubleListIterator doubleListIterator = doubleList.iterator();
        while (doubleListIterator.hasNext()) {
            int n4 = doubleListIterator.nextIndex();
            if (doubleListIterator.nextDouble() == 0.0) continue;
            n2 = Math.min(n2, n4);
            n3 = Math.max(n3, n4);
        }
        this.L = 0.16666666666666666 / class05041.N(n3 - n2);
        this.R = (this.u.N() + this.i.N()) * this.L;
    }

    public static class05041 y(class06069 class060692, class05056 class050562) {
        return new class05041(class060692, class050562, true);
    }

    public class05056 y() {
        return this.M;
    }

    private static double N(int n) {
        return 0.1 * (1.0 + 1.0 / (double)(n + 1));
    }

    public double N(double d, double d2, double d3) {
        double d4 = d * 1.0181268882175227;
        double d5 = d2 * 1.0181268882175227;
        double d6 = d3 * 1.0181268882175227;
        return (this.u.N(d, d2, d3) + this.i.N(d4, d5, d6)) * this.L;
    }

    public void N(StringBuilder stringBuilder) {
        stringBuilder.append("NormalNoise {");
        stringBuilder.append("first: ");
        this.u.N(stringBuilder);
        stringBuilder.append(", second: ");
        this.i.N(stringBuilder);
        stringBuilder.append("}");
    }

    public double N() {
        return this.R;
    }

    public static class05041 N(class06069 class060692, int n, double ... dArray) {
        return class05041.y(class060692, new class05056(n, (DoubleList)new DoubleArrayList(dArray)));
    }

    @Deprecated
    public static class05041 N(class06069 class060692, class05056 class050562) {
        return new class05041(class060692, class050562, false);
    }
}

