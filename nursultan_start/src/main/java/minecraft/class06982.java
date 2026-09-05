/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07211
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07211;

public final class class06982
extends Record {
    private final class07211 direction;
    final double distance;

    public class06982(class07211 class072112, double d) {
        this.direction = class072112;
        this.distance = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06982.class, "direction;distance", "direction", "distance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06982.class, "direction;distance", "direction", "distance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06982.class, "direction;distance", "direction", "distance"}, this);
    }

    public double y() {
        return this.distance;
    }

    public class07211 N() {
        return this.direction;
    }
}

