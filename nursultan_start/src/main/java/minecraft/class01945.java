/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 *  minecraft.class07211
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;
import minecraft.class07211;

final class class01945
extends Record {
    private final double xd;
    private final double yd;
    private final double zd;
    private static final double u = 1.0;
    private static final double i = 0.1;

    public double L() {
        return this.zd;
    }

    private class01945(double d, double d2, double d3) {
        this.xd = d;
        this.yd = d2;
        this.zd = d3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01945.class, "xd;yd;zd", "xd", "yd", "zd"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01945.class, "xd;yd;zd", "xd", "yd", "zd"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01945.class, "xd;yd;zd", "xd", "yd", "zd"}, this);
    }

    public double y() {
        return this.yd;
    }

    public double N() {
        return this.xd;
    }

    public static class01945 N(class06889 class068892, class07211 class072112) {
        double d = 0.0;
        return switch (class072112) {
            default -> throw new MatchException(null, null);
            case class07211.field_11033, class07211.field_11036 -> new class01945(class068892.L(), 0.0, -class068892.N());
            case class07211.field_11043 -> new class01945(1.0, 0.0, -0.1);
            case class07211.field_11035 -> new class01945(-1.0, 0.0, 0.1);
            case class07211.field_11039 -> new class01945(-0.1, 0.0, -1.0);
            case class07211.field_11034 -> new class01945(0.1, 0.0, 1.0);
        };
    }
}

