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

public final class class02753
extends Record {
    final double y;
    final float yRot;

    public class02753(double d, float f) {
        this.y = d;
        this.yRot = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02753.class, "y;yRot", "y", "yRot"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02753.class, "y;yRot", "y", "yRot"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02753.class, "y;yRot", "y", "yRot"}, this);
    }

    public float y() {
        return this.yRot;
    }

    public double N() {
        return this.y;
    }
}

