/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.joml.Vector4fc
 */
package Nursultan;

import Nursultan.class09924;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector4fc;

public final class class09907
extends Record
implements class09924 {
    private final float x;
    private final float y;
    private final float width;
    private final float height;
    private final float blurRadius;
    private final int color;
    private final Vector4fc borderRadius;

    public float L() {
        return this.width;
    }

    public Vector4fc M() {
        return this.borderRadius;
    }

    public class09907(float f, float f2, float f3, float f4, float f5, int n, Vector4fc vector4fc) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        this.blurRadius = f5;
        this.color = n;
        this.borderRadius = vector4fc;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09907.class, "x;y;width;height;blurRadius;color;borderRadius", "x", "y", "width", "height", "blurRadius", "color", "borderRadius"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09907.class, "x;y;width;height;blurRadius;color;borderRadius", "x", "y", "width", "height", "blurRadius", "color", "borderRadius"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09907.class, "x;y;width;height;blurRadius;color;borderRadius", "x", "y", "width", "height", "blurRadius", "color", "borderRadius"}, this);
    }

    public float i() {
        return this.blurRadius;
    }

    public float u() {
        return this.height;
    }

    public float y() {
        return this.y;
    }

    public float N() {
        return this.x;
    }

    public int R() {
        return this.color;
    }
}

