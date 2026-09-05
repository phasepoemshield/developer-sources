/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03871;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03892;
import minecraft.class03912;

final class class03913
extends Record
implements class03871 {
    private final class03892 type;
    private final class03877 argument1;
    private final class03877 argument2;
    private final double minValue;
    private final double maxValue;

    class03913(class03892 class038922, class03877 class038772, class03877 class038773, double d, double d2) {
        this.type = class038922;
        this.argument1 = class038772;
        this.argument2 = class038773;
        this.minValue = d;
        this.maxValue = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03913.class, "type;argument1;argument2;minValue;maxValue", "type", "argument1", "argument2", "minValue", "maxValue"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03913.class, "type;argument1;argument2;minValue;maxValue", "type", "argument1", "argument2", "minValue", "maxValue"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03913.class, "type;argument1;argument2;minValue;maxValue", "type", "argument1", "argument2", "minValue", "maxValue"}, this);
    }

    @Override
    public class03877 i() {
        return this.argument1;
    }

    @Override
    public class03892 u() {
        return this.type;
    }

    @Override
    public double y() {
        return this.maxValue;
    }

    @Override
    public double N(class03875 class038752) {
        double d = this.argument1.N(class038752);
        return switch (this.type.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> d + this.argument2.N(class038752);
            case 1 -> {
                if (d == 0.0) {
                    yield 0.0;
                }
                yield d * this.argument2.N(class038752);
            }
            case 2 -> {
                if (d < this.argument2.N()) {
                    yield d;
                }
                yield Math.min(d, this.argument2.N(class038752));
            }
            case 3 -> d > this.argument2.y() ? d : Math.max(d, this.argument2.N(class038752));
        };
    }

    @Override
    public double N() {
        return this.minValue;
    }

    @Override
    public void N(double[] dArray, class03912 class039122) {
        this.argument1.N(dArray, class039122);
        switch (this.type.ordinal()) {
            case 0: {
                double[] dArray2 = new double[dArray.length];
                this.argument2.N(dArray2, class039122);
                for (int i = 0; i < dArray.length; ++i) {
                    dArray[i] = dArray[i] + dArray2[i];
                }
                break;
            }
            case 1: {
                for (int i = 0; i < dArray.length; ++i) {
                    double d = dArray[i];
                    dArray[i] = d == 0.0 ? 0.0 : d * this.argument2.N(class039122.L(i));
                }
                break;
            }
            case 2: {
                double d = this.argument2.N();
                for (int i = 0; i < dArray.length; ++i) {
                    double d2 = dArray[i];
                    dArray[i] = d2 < d ? d2 : Math.min(d2, this.argument2.N(class039122.L(i)));
                }
                break;
            }
            case 3: {
                double d = this.argument2.y();
                for (int i = 0; i < dArray.length; ++i) {
                    double d3 = dArray[i];
                    dArray[i] = d3 > d ? d3 : Math.max(d3, this.argument2.N(class039122.L(i)));
                }
                break;
            }
        }
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(class03871.N(this.type, this.argument1.N(class038812), this.argument2.N(class038812)));
    }

    @Override
    public class03877 W() {
        return this.argument2;
    }
}

