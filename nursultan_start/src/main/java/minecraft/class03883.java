/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03891;
import minecraft.class03899;
import minecraft.class03979;
import minecraft.class04995;

public final class class03883
extends Record
implements class03899 {
    private final class03891 type;
    private final class03877 input;
    private final double minValue;
    private final double maxValue;

    @Override
    public class03979<? extends class03877> L() {
        return this.type.field_37087;
    }

    protected class03883(class03891 class038912, class03877 class038772, double d, double d2) {
        this.type = class038912;
        this.input = class038772;
        this.minValue = d;
        this.maxValue = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03883.class, "type;input;minValue;maxValue", "type", "input", "minValue", "maxValue"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03883.class, "type;input;minValue;maxValue", "type", "input", "minValue", "maxValue"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03883.class, "type;input;minValue;maxValue", "type", "input", "minValue", "maxValue"}, this);
    }

    public class03891 i() {
        return this.type;
    }

    @Override
    public double y() {
        return this.maxValue;
    }

    @Override
    public class03883 N(class03881 class038812) {
        return class03883.N(this.type, this.input.N(class038812));
    }

    @Override
    public double N(double d) {
        return class03883.N(this.type, d);
    }

    @Override
    public double N() {
        return this.minValue;
    }

    private static double N(class03891 class038912, double d) {
        return switch (class038912.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> Math.abs(d);
            case 1 -> d * d;
            case 2 -> d * d * d;
            case 3 -> {
                if (d > 0.0) {
                    yield d;
                }
                yield d * 0.5;
            }
            case 4 -> {
                if (d > 0.0) {
                    yield d;
                }
                yield d * 0.25;
            }
            case 5 -> 1.0 / d;
            case 6 -> {
                double var3_2 = class04995.N((double)d, (double)-1.0, (double)1.0);
                yield var3_2 / 2.0 - var3_2 * var3_2 * var3_2 / 24.0;
            }
        };
    }

    public static class03883 N(class03891 class038912, class03877 class038772) {
        double d = class038772.N();
        double d2 = class038772.y();
        double d3 = class03883.N(class038912, d);
        double d4 = class03883.N(class038912, d2);
        if (class038912 == class03891.field_61470) {
            if (d < 0.0 && d2 > 0.0) {
                return new class03883(class038912, class038772, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
            }
            return new class03883(class038912, class038772, d4, d3);
        }
        if (class038912 == class03891.field_36555 || class038912 == class03891.field_36556) {
            return new class03883(class038912, class038772, Math.max(0.0, d), Math.max(d3, d4));
        }
        return new class03883(class038912, class038772, d3, d4);
    }

    @Override
    public class03877 az_() {
        return this.input;
    }
}

