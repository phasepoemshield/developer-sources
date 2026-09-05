/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07185
 *  org.joml.Matrix4f
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04122;
import minecraft.class07185;
import org.joml.Matrix4f;
import org.joml.Vector3fc;

public final class class04136
extends Record
implements class04122 {
    private final class07185 axis;
    private final float angle;

    public float L() {
        return this.angle;
    }

    public class04136(class07185 class071852, float f) {
        this.axis = class071852;
        this.angle = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04136.class, "axis;angle", "axis", "angle"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04136.class, "axis;angle", "axis", "angle"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04136.class, "axis;angle", "axis", "angle"}, this);
    }

    public class07185 y() {
        return this.axis;
    }

    @Override
    public Matrix4f N() {
        Matrix4f matrix4f = new Matrix4f();
        if (this.angle == 0.0f) {
            return matrix4f;
        }
        Vector3fc vector3fc = this.axis.u().m();
        matrix4f.rotation(this.angle * ((float)Math.PI / 180), vector3fc);
        return matrix4f;
    }
}

