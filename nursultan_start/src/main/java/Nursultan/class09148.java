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

public class class09148
extends Record {
    public boolean boosting;
    public float speed;

    public class09148(float f, boolean bl) {
        this.speed = f;
        this.boosting = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09148.class, "speed;boosting", "speed", "boosting"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09148.class, "speed;boosting", "speed", "boosting"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09148.class, "speed;boosting", "speed", "boosting"}, this);
    }

    public boolean y() {
        return this.boosting;
    }

    public float N() {
        return this.speed;
    }
}

