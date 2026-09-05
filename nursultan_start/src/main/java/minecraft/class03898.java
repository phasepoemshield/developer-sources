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
import minecraft.class03876;
import minecraft.class03877;
import minecraft.class03880;
import minecraft.class03881;
import minecraft.class03979;

public final class class03898
extends Record
implements class03880 {
    private final class03876 offsetNoise;
    static final class03979<class03898> N = class03865.N(class03876.N, class03898::new, class03898::u);

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    public class03898(class03876 class038762) {
        this.offsetNoise = class038762;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03898.class, "offsetNoise", "offsetNoise"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03898.class, "offsetNoise", "offsetNoise"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03898.class, "offsetNoise", "offsetNoise"}, this);
    }

    @Override
    public class03876 u() {
        return this.offsetNoise;
    }

    @Override
    public double N(class03875 class038752) {
        return this.N(class038752.y(), 0.0, class038752.u());
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03898(class038812.N(this.offsetNoise)));
    }
}

