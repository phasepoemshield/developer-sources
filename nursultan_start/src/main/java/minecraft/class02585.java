/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class06889;

public final class class02585
extends Record {
    private final class06889 force;
    private final double torque;
    static class02585 N = new class02585(class06889.L, 0.0);

    public class02585(class06889 class068892, double d) {
        this.force = class068892;
        this.torque = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02585.class, "force;torque", "force", "torque"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02585.class, "force;torque", "force", "torque"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02585.class, "force;torque", "force", "torque"}, this);
    }

    public double y() {
        return this.torque;
    }

    static class02585 N(List<class02585> list) {
        if (list.isEmpty()) {
            return N;
        }
        double d = 0.0;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        for (class02585 class025852 : list) {
            class06889 class068892 = class025852.force;
            d += class068892.M;
            d2 += class068892.B;
            d3 += class068892.Z;
            d4 += class025852.torque;
        }
        return new class02585(new class06889(d, d2, d3), d4);
    }

    public class06889 N() {
        return this.force;
    }

    public class02585 N(double d) {
        return new class02585(this.force.L(d), this.torque * d);
    }

    static double N(class06889 class068892, class06889 class068893) {
        return class068892.Z * class068893.M - class068892.M * class068893.Z;
    }
}

