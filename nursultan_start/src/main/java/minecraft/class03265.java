/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01423
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01423;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public final class class03265
extends Record {
    private final Vector3fc rotation;
    private final Vector3fc translation;
    private final Vector3fc scale;
    public static final class03265 N = new class03265((Vector3fc)new Vector3f(), (Vector3fc)new Vector3f(), (Vector3fc)new Vector3f(1.0f, 1.0f, 1.0f));

    public Vector3fc L() {
        return this.scale;
    }

    public class03265(Vector3fc vector3fc, Vector3fc vector3fc2, Vector3fc vector3fc3) {
        this.rotation = vector3fc;
        this.translation = vector3fc2;
        this.scale = vector3fc3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03265.class, "rotation;translation;scale", "rotation", "translation", "scale"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03265.class, "rotation;translation;scale", "rotation", "translation", "scale"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03265.class, "rotation;translation;scale", "rotation", "translation", "scale"}, this);
    }

    public Vector3fc y() {
        return this.translation;
    }

    public void N(boolean bl, class01423 class014232) {
        float f;
        float f2;
        float f3;
        if (this == N) {
            class014232.N(-0.5f, -0.5f, -0.5f);
            return;
        }
        if (bl) {
            f3 = -this.translation.x();
            f2 = -this.rotation.y();
            f = -this.rotation.z();
        } else {
            f3 = this.translation.x();
            f2 = this.rotation.y();
            f = this.rotation.z();
        }
        class014232.N(f3, this.translation.y(), this.translation.z());
        class014232.N((Quaternionfc)new Quaternionf().rotationXYZ(this.rotation.x() * ((float)Math.PI / 180), f2 * ((float)Math.PI / 180), f * ((float)Math.PI / 180)));
        class014232.y(this.scale.x(), this.scale.y(), this.scale.z());
        class014232.N(-0.5f, -0.5f, -0.5f);
    }

    public Vector3fc N() {
        return this.rotation;
    }
}

