/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11225
extends Record {
    public double gravity;
    public float waterDrag;
    public float airDrag;
    public static Object L_0;
    public static Object L_1;
    public static Object L_2;
    public static Object L_3;
    public static Object L_4;
    public static Object L_5;

    public double L() {
        return this.gravity;
    }

    public class11225(double d, float f, float f2) {
        this.gravity = d;
        this.airDrag = f;
        this.waterDrag = f2;
    }

    static {
        class11225.u();
        L_0 = new class11225(0.05, 0.99f, 0.6f);
        L_1 = new class11225(0.05, 0.99f, 0.99f);
        L_2 = new class11225(0.03, 0.99f, 0.8f);
        L_3 = new class11225(0.05, 0.99f, 0.8f);
        L_4 = new class11225(0.03, 0.99f, 0.8f);
        L_5 = new class11225(0.0, 1.0f, 0.8f);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11225.class, "gravity;airDrag;waterDrag", "gravity", "airDrag", "waterDrag"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11225.class, "gravity;airDrag;waterDrag", "gravity", "airDrag", "waterDrag"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11225.class, "gravity;airDrag;waterDrag", "gravity", "airDrag", "waterDrag"}, this);
    }

    private static void u() {
        L_0 = null;
        L_1 = null;
        L_2 = null;
        L_3 = null;
        L_4 = null;
        L_5 = null;
    }

    public float y() {
        return this.waterDrag;
    }

    public float N() {
        return this.airDrag;
    }
}

