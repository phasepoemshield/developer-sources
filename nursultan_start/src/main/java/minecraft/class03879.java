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
import java.util.Arrays;
import minecraft.class03865;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03908;
import minecraft.class03912;
import minecraft.class03979;

final class class03879
extends Record
implements class03908 {
    final double value;
    static final class03979<class03879> y = class03865.N(class03865.y, class03879::new, class03879::N);
    static final class03879 L = new class03879(0.0);

    @Override
    public class03979<? extends class03877> L() {
        return y;
    }

    class03879(double d) {
        this.value = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03879.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03879.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03879.class, "value", "value"}, this);
    }

    public double u() {
        return this.value;
    }

    @Override
    public double y() {
        return this.value;
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        Arrays.fill(dArray, this.value);
    }

    @Override
    public double N() {
        return this.value;
    }

    @Override
    public double N(class03875 class038752) {
        return this.value;
    }
}

