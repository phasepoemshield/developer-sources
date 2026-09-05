/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09935;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Objects;

public final class class09919
extends Record
implements class09935 {
    private final float translateX;
    private final float translateY;
    private final float pivotX;
    private final float pivotY;
    private final float scale;
    private final float rotationDegrees;
    private final List<class09935> children;

    public float L() {
        return this.pivotX;
    }

    public List<class09935> M() {
        return this.children;
    }

    public class09919(float f, float f2, float f3, float f4, float f5, float f6, List<class09935> list) {
        Objects.requireNonNull(list, "children");
        this.translateX = f;
        this.translateY = f2;
        this.pivotX = f3;
        this.pivotY = f4;
        this.scale = f5;
        this.rotationDegrees = f6;
        this.children = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09919.class, "translateX;translateY;pivotX;pivotY;scale;rotationDegrees;children", "translateX", "translateY", "pivotX", "pivotY", "scale", "rotationDegrees", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09919.class, "translateX;translateY;pivotX;pivotY;scale;rotationDegrees;children", "translateX", "translateY", "pivotX", "pivotY", "scale", "rotationDegrees", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09919.class, "translateX;translateY;pivotX;pivotY;scale;rotationDegrees;children", "translateX", "translateY", "pivotX", "pivotY", "scale", "rotationDegrees", "children"}, this);
    }

    public float i() {
        return this.scale;
    }

    public float u() {
        return this.pivotY;
    }

    public float y() {
        return this.translateY;
    }

    public static class09919 N(float f, float f2, List<class09935> list) {
        return new class09919(f, f2, 0.0f, 0.0f, 1.0f, 0.0f, list);
    }

    public float N() {
        return this.translateX;
    }

    public float R() {
        return this.rotationDegrees;
    }
}

