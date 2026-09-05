/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector3fc
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04342;
import org.joml.Vector3fc;

public final class class04341
extends Record {
    private final float timestamp;
    private final Vector3fc preTarget;
    private final Vector3fc postTarget;
    private final class04342 interpolation;

    public Vector3fc L() {
        return this.postTarget;
    }

    public class04341(float f, Vector3fc vector3fc, class04342 class043422) {
        this(f, vector3fc, vector3fc, class043422);
    }

    public class04341(float f, Vector3fc vector3fc, Vector3fc vector3fc2, class04342 class043422) {
        this.timestamp = f;
        this.preTarget = vector3fc;
        this.postTarget = vector3fc2;
        this.interpolation = class043422;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04341.class, "timestamp;preTarget;postTarget;interpolation", "timestamp", "preTarget", "postTarget", "interpolation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04341.class, "timestamp;preTarget;postTarget;interpolation", "timestamp", "preTarget", "postTarget", "interpolation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04341.class, "timestamp;preTarget;postTarget;interpolation", "timestamp", "preTarget", "postTarget", "interpolation"}, this);
    }

    public class04342 u() {
        return this.interpolation;
    }

    public Vector3fc y() {
        return this.preTarget;
    }

    public float N() {
        return this.timestamp;
    }
}

