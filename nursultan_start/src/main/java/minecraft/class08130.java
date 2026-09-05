/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08453
 *  org.joml.Matrix4f
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class08453;
import org.joml.Matrix4f;

public final class class08130
extends Record {
    private final Matrix4f pose;
    private final float radius;
    private final List<class08453> pieces;

    public List<class08453> L() {
        return this.pieces;
    }

    public class08130(Matrix4f matrix4f, float f, List<class08453> list) {
        this.pose = matrix4f;
        this.radius = f;
        this.pieces = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08130.class, "pose;radius;pieces", "pose", "radius", "pieces"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08130.class, "pose;radius;pieces", "pose", "radius", "pieces"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08130.class, "pose;radius;pieces", "pose", "radius", "pieces"}, this);
    }

    public float y() {
        return this.radius;
    }

    public Matrix4f N() {
        return this.pose;
    }
}

