/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03865;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03895;
import minecraft.class03979;

final class class03868
extends Record
implements class03895 {
    private final class03877 input;
    static final class03979<class03868> N = class03865.N(class03868::new, class03868::u);

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    class03868(class03877 class038772) {
        this.input = class038772;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03868.class, "input", "input"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03868.class, "input", "input"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03868.class, "input", "input"}, this);
    }

    @Override
    public class03877 u() {
        return this.input;
    }

    @Override
    public double y() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03868(this.input.N(class038812)));
    }

    @Override
    public double N() {
        return Double.NEGATIVE_INFINITY;
    }

    @Override
    public double N(class03875 class038752, double d) {
        return class038752.i().N(class038752, d);
    }
}

