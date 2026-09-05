/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  org.joml.Matrix4f
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import org.joml.Matrix4f;

public final class class08142
extends Record {
    private final Matrix4f pose;
    private final float x;
    private final float y;
    private final class00392 text;
    private final int lightCoords;
    private final int color;
    private final int backgroundColor;
    private final double distanceToCameraSq;

    public float L() {
        return this.y;
    }

    public int M() {
        return this.backgroundColor;
    }

    public class08142(Matrix4f matrix4f, float f, float f2, class00392 class003922, int n, int n2, int n3, double d) {
        this.pose = matrix4f;
        this.x = f;
        this.y = f2;
        this.text = class003922;
        this.lightCoords = n;
        this.color = n2;
        this.backgroundColor = n3;
        this.distanceToCameraSq = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08142.class, "pose;x;y;text;lightCoords;color;backgroundColor;distanceToCameraSq", "pose", "x", "y", "text", "lightCoords", "color", "backgroundColor", "distanceToCameraSq"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08142.class, "pose;x;y;text;lightCoords;color;backgroundColor;distanceToCameraSq", "pose", "x", "y", "text", "lightCoords", "color", "backgroundColor", "distanceToCameraSq"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08142.class, "pose;x;y;text;lightCoords;color;backgroundColor;distanceToCameraSq", "pose", "x", "y", "text", "lightCoords", "color", "backgroundColor", "distanceToCameraSq"}, this);
    }

    public double B() {
        return this.distanceToCameraSq;
    }

    public int i() {
        return this.lightCoords;
    }

    public class00392 u() {
        return this.text;
    }

    public float y() {
        return this.x;
    }

    public Matrix4f N() {
        return this.pose;
    }

    public int R() {
        return this.color;
    }
}

