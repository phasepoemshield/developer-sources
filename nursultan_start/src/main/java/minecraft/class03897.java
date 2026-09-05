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
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;

public final class class03897
extends Record
implements class03894 {
    private final class03909 type;
    private final class03877 wrapped;

    public class03897(class03909 class039092, class03877 class038772) {
        this.type = class039092;
        this.wrapped = class038772;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03897.class, "type;wrapped", "type", "wrapped"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03897.class, "type;wrapped", "type", "wrapped"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03897.class, "type;wrapped", "type", "wrapped"}, this);
    }

    @Override
    public class03909 i() {
        return this.type;
    }

    @Override
    public class03877 u() {
        return this.wrapped;
    }

    @Override
    public double y() {
        return this.wrapped.y();
    }

    @Override
    public double N() {
        return this.wrapped.N();
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        this.wrapped.N(dArray, class039122);
    }

    @Override
    public double N(class03875 class038752) {
        return this.wrapped.N(class038752);
    }
}

