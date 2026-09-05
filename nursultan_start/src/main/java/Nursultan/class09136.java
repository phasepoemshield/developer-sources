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

public class class09136
extends Record {
    public float acceleration;
    public float speed;

    public class09136(float f, float f2) {
        this.speed = f;
        this.acceleration = f2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09136.class, "speed;acceleration", "speed", "acceleration"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09136.class, "speed;acceleration", "speed", "acceleration"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09136.class, "speed;acceleration", "speed", "acceleration"}, this);
    }

    public float y() {
        return this.speed;
    }

    public float N() {
        return this.acceleration;
    }
}

