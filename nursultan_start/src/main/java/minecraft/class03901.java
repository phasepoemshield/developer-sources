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
import minecraft.class03865;
import minecraft.class03871;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03892;
import minecraft.class03899;
import minecraft.class03907;

final class class03901
extends Record
implements class03871,
class03899 {
    private final class03907 specificType;
    private final class03877 input;
    private final double minValue;
    private final double maxValue;
    private final double argument;

    public double P() {
        return this.argument;
    }

    class03901(class03907 class039072, class03877 class038772, double d, double d2, double d3) {
        this.specificType = class039072;
        this.input = class038772;
        this.minValue = d;
        this.maxValue = d2;
        this.argument = d3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03901.class, "specificType;input;minValue;maxValue;argument", "specificType", "input", "minValue", "maxValue", "argument"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03901.class, "specificType;input;minValue;maxValue;argument", "specificType", "input", "minValue", "maxValue", "argument"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03901.class, "specificType;input;minValue;maxValue;argument", "specificType", "input", "minValue", "maxValue", "argument"}, this);
    }

    @Override
    public class03877 i() {
        return class03865.N(this.argument);
    }

    public class03907 m() {
        return this.specificType;
    }

    @Override
    public class03892 u() {
        return this.specificType == class03907.field_36568 ? class03892.field_36545 : class03892.field_36544;
    }

    @Override
    public double y() {
        return this.maxValue;
    }

    @Override
    public class03877 N(class03881 class038812) {
        double d;
        double d2;
        class03877 class038772 = this.input.N(class038812);
        double d3 = class038772.N();
        double d4 = class038772.y();
        if (this.specificType == class03907.field_36569) {
            d2 = d3 + this.argument;
            d = d4 + this.argument;
        } else if (this.argument >= 0.0) {
            d2 = d3 * this.argument;
            d = d4 * this.argument;
        } else {
            d2 = d4 * this.argument;
            d = d3 * this.argument;
        }
        return new class03901(this.specificType, class038772, d2, d, this.argument);
    }

    @Override
    public double N() {
        return this.minValue;
    }

    @Override
    public double N(double d) {
        return switch (this.specificType.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> d * this.argument;
            case 1 -> d + this.argument;
        };
    }

    @Override
    public class03877 W() {
        return this.input;
    }

    @Override
    public class03877 az_() {
        return this.input;
    }
}

