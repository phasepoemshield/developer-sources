/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09914
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09914;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09888
extends Record
implements class09914 {
    private final float radius;

    public class09888(float f) {
        this.radius = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09888.class, "radius", "radius"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09888.class, "radius", "radius"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09888.class, "radius", "radius"}, this);
    }

    public float y() {
        return this.radius;
    }

    public float N() {
        return Math.max(0.0f, this.radius);
    }
}

