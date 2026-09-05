/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01687
 *  org.joml.Matrix4f
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01687;
import org.joml.Matrix4f;

public class class11237
extends Record {
    public Matrix4f matrix;
    public float volume;
    public class01687 cuboid;

    public class01687 L() {
        return this.cuboid;
    }

    public class11237(Matrix4f matrix4f, class01687 class016872, float f) {
        this.matrix = matrix4f;
        this.cuboid = class016872;
        this.volume = f;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11237.class, "matrix;cuboid;volume", "matrix", "cuboid", "volume"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11237.class, "matrix;cuboid;volume", "matrix", "cuboid", "volume"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11237.class, "matrix;cuboid;volume", "matrix", "cuboid", "volume"}, this);
    }

    public Matrix4f y() {
        return this.matrix;
    }

    public float N() {
        return this.volume;
    }
}

