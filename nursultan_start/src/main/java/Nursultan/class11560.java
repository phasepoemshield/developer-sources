/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector3i
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector3i;

public class class11560
extends Record {
    public Vector3i min;
    public Vector3i max;

    class11560(Vector3i vector3i, Vector3i vector3i2) {
        this.min = vector3i;
        this.max = vector3i2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11560.class, "min;max", "min", "max"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11560.class, "min;max", "min", "max"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11560.class, "min;max", "min", "max"}, this);
    }

    public Vector3i y() {
        return this.max;
    }

    public Vector3i N() {
        return this.min;
    }
}

