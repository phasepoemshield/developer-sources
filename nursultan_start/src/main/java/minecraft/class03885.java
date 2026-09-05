/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10213
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 */
package minecraft;

import Nursultan.class10213;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03912;
import minecraft.class03979;

public final class class03885
extends Record
implements class03877 {
    private final class03556<class03877> function;

    @Override
    public class03979<? extends class03877> L() {
        throw new UnsupportedOperationException("Calling .codec() on HolderHolder");
    }

    public class03885(class03556<class03877> class035562) {
        this.function = class035562;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03885.class, "function", "function"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03885.class, "function", "function"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03885.class, "function", "function"}, this);
    }

    public class03556<class03877> u() {
        return this.function;
    }

    @Override
    public double y() {
        return this.function.y() ? ((class03877)this.function.N()).y() : Double.POSITIVE_INFINITY;
    }

    @Override
    public double N() {
        return this.function.y() ? ((class03877)this.function.N()).N() : Double.NEGATIVE_INFINITY;
    }

    @Override
    public double N(class03875 class038752) {
        return ((class03877)this.function.N()).N(class038752);
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        ((class03877)this.function.N()).N(dArray, class039122);
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03885((class03556<class03877>)new class10213((Object)((class03877)this.function.N()).N(class038812))));
    }
}

