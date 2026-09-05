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
import Nursultan.class09981;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.joml.Vector4fc;

public final class class09925
extends Record
implements class09924 {
    private final float x;
    private final float y;
    private final float width;
    private final float height;
    private final Vector4fc borderRadius;
    private final int fillColor;
    private final int borderColor;
    private final float borderThickness;
    private final class09981 borderPosition;
    private final int shadowColor;
    private final float shadowRadius;

    public float L() {
        return this.width;
    }

    public int M() {
        return this.borderColor;
    }

    public class09925(float f, float f2, float f3, float f4, Vector4fc vector4fc, int n, int n2, float f5, class09981 class099812, int n3, float f6) {
        if (class099812 == null) {
            class099812 = class09981.INSIDE;
        }
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        this.borderRadius = vector4fc;
        this.fillColor = n;
        this.borderColor = n2;
        this.borderThickness = f5;
        this.borderPosition = class099812;
        this.shadowColor = n3;
        this.shadowRadius = f6;
    }

    public class09925(float f, float f2, float f3, float f4, Vector4fc vector4fc, int n, int n2, float f5, int n3, float f6) {
        this(f, f2, f3, f4, vector4fc, n, n2, f5, class09981.INSIDE, n3, f6);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09925.class, "x;y;width;height;borderRadius;fillColor;borderColor;borderThickness;borderPosition;shadowColor;shadowRadius", "x", "y", "width", "height", "borderRadius", "fillColor", "borderColor", "borderThickness", "borderPosition", "shadowColor", "shadowRadius"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09925.class, "x;y;width;height;borderRadius;fillColor;borderColor;borderThickness;borderPosition;shadowColor;shadowRadius", "x", "y", "width", "height", "borderRadius", "fillColor", "borderColor", "borderThickness", "borderPosition", "shadowColor", "shadowRadius"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09925.class, "x;y;width;height;borderRadius;fillColor;borderColor;borderThickness;borderPosition;shadowColor;shadowRadius", "x", "y", "width", "height", "borderRadius", "fillColor", "borderColor", "borderThickness", "borderPosition", "shadowColor", "shadowRadius"}, this);
    }

    public float B() {
        return this.borderThickness;
    }

    public class09981 Z() {
        return this.borderPosition;
    }

    public Vector4fc i() {
        return this.borderRadius;
    }

    public float U() {
        return this.shadowRadius;
    }

    public int z() {
        return this.shadowColor;
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
        return this.fillColor;
    }
}

