/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Matrix4f
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04122;
import org.joml.Matrix4f;

public final class class04108
extends Record
implements class04122 {
    private final float x;
    private final float y;
    private final float z;

    public float L() {
        return this.y;
    }

    public class04108(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04108.class, "x;y;z", "x", "y", "z"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04108.class, "x;y;z", "x", "y", "z"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04108.class, "x;y;z", "x", "y", "z"}, this);
    }

    public float u() {
        return this.z;
    }

    public float y() {
        return this.x;
    }

    @Override
    public Matrix4f N() {
        return new Matrix4f().rotationZYX(this.z * ((float)Math.PI / 180), this.y * ((float)Math.PI / 180), this.x * ((float)Math.PI / 180));
    }
}

