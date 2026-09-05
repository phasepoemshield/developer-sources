/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09914;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09901
extends Record
implements class09914 {
    private final float pivotX;
    private final float pivotY;
    private final float scale;
    private final float rotationDegrees;

    public float L() {
        return this.pivotY;
    }

    public class09901(float f, float f2, float f3, float f4) {
        this.pivotX = f;
        this.pivotY = f2;
        this.scale = f3;
        this.rotationDegrees = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09901.class, "pivotX;pivotY;scale;rotationDegrees", "pivotX", "pivotY", "scale", "rotationDegrees"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09901.class, "pivotX;pivotY;scale;rotationDegrees", "pivotX", "pivotY", "scale", "rotationDegrees"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09901.class, "pivotX;pivotY;scale;rotationDegrees", "pivotX", "pivotY", "scale", "rotationDegrees"}, this);
    }

    public float i() {
        return this.rotationDegrees;
    }

    public float u() {
        return this.scale;
    }

    public float y() {
        return this.pivotX;
    }
}

