/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02054
 *  minecraft.class07185
 *  org.joml.Math
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02054;
import minecraft.class04122;
import minecraft.class07185;
import org.joml.Math;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class class04120
extends Record {
    private final Vector3fc origin;
    private final class04122 value;
    private final boolean rescale;
    private final Matrix4fc transform;

    public boolean L() {
        return this.rescale;
    }

    public class04120(Vector3fc vector3fc, class04122 class041222, boolean bl) {
        this(vector3fc, class041222, bl, (Matrix4fc)class04120.N(class041222, bl));
    }

    public class04120(Vector3fc vector3fc, class04122 class041222, boolean bl, Matrix4fc matrix4fc) {
        this.origin = vector3fc;
        this.value = class041222;
        this.rescale = bl;
        this.transform = matrix4fc;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04120.class, "origin;value;rescale;transform", "origin", "value", "rescale", "transform"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04120.class, "origin;value;rescale;transform", "origin", "value", "rescale", "transform"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04120.class, "origin;value;rescale;transform", "origin", "value", "rescale", "transform"}, this);
    }

    public Matrix4fc u() {
        return this.transform;
    }

    public class04122 y() {
        return this.value;
    }

    private static float N(Matrix4fc matrix4fc, class07185 class071852, Vector3f vector3f) {
        Vector3f vector3f2 = vector3f.set(class071852.u().m());
        Vector3f vector3f3 = matrix4fc.transformDirection(vector3f2);
        float f = Math.abs((float)vector3f3.x);
        float f2 = Math.abs((float)vector3f3.y);
        float f3 = Math.abs((float)vector3f3.z);
        float f4 = Math.max((float)Math.max((float)f, (float)f2), (float)f3);
        return 1.0f / f4;
    }

    private static Matrix4f N(class04122 class041222, boolean bl) {
        Matrix4f matrix4f = class041222.N();
        if (bl && !class02054.N((Matrix4fc)matrix4f)) {
            Vector3fc vector3fc = class04120.N((Matrix4fc)matrix4f);
            matrix4f.scale(vector3fc);
        }
        return matrix4f;
    }

    private static Vector3fc N(Matrix4fc matrix4fc) {
        Vector3f vector3f = new Vector3f();
        float f = class04120.N(matrix4fc, class07185.field_11048, vector3f);
        float f2 = class04120.N(matrix4fc, class07185.field_11052, vector3f);
        float f3 = class04120.N(matrix4fc, class07185.field_11051, vector3f);
        return vector3f.set(f, f2, f3);
    }

    public Vector3fc N() {
        return this.origin;
    }
}

