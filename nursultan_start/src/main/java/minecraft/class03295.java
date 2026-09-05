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
import java.util.Locale;

final class class03295
extends Record {
    private final String dimensionName;
    private final double x;
    private final double y;
    private final double z;
    private final float yRot;
    private final float xRot;

    public double L() {
        return this.x;
    }

    public float M() {
        return this.xRot;
    }

    class03295(String string, double d, double d2, double d3, float f, float f2) {
        this.dimensionName = string;
        this.x = d;
        this.y = d2;
        this.z = d3;
        this.yRot = f;
        this.xRot = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03295.class, "dimensionName;x;y;z;yRot;xRot", "dimensionName", "x", "y", "z", "yRot", "xRot"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03295.class, "dimensionName;x;y;z;yRot;xRot", "dimensionName", "x", "y", "z", "yRot", "xRot"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03295.class, "dimensionName;x;y;z;yRot;xRot", "dimensionName", "x", "y", "z", "yRot", "xRot"}, this);
    }

    public double i() {
        return this.z;
    }

    public double u() {
        return this.y;
    }

    public String y() {
        return this.dimensionName;
    }

    String N() {
        return String.format(Locale.ROOT, "t %s %.2f %.2f %.2f %.2f %.2f\n", this.dimensionName, this.x, this.y, this.z, Float.valueOf(this.yRot), Float.valueOf(this.xRot));
    }

    public float R() {
        return this.yRot;
    }
}

