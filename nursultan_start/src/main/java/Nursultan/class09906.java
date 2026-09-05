/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09689
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09689;
import Nursultan.class09924;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09906
extends Record
implements class09924 {
    private final String textureRef;
    private final float x;
    private final float y;
    private final float width;
    private final float height;
    private final int color;
    private final class09689 uv;

    public float L() {
        return this.y;
    }

    public class09689 M() {
        return this.uv;
    }

    public class09906(String string, float f, float f2, float f3, float f4, int n) {
        this(string, f, f2, f3, f4, n, class09689.N);
    }

    public class09906(String string, float f, float f2, float f3, float f4, int n, class09689 class096892) {
        this.textureRef = string;
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        this.color = n;
        this.uv = class096892;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09906.class, "textureRef;x;y;width;height;color;uv", "textureRef", "x", "y", "width", "height", "color", "uv"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09906.class, "textureRef;x;y;width;height;color;uv", "textureRef", "x", "y", "width", "height", "color", "uv"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09906.class, "textureRef;x;y;width;height;color;uv", "textureRef", "x", "y", "width", "height", "color", "uv"}, this);
    }

    public float i() {
        return this.height;
    }

    public float u() {
        return this.width;
    }

    public float y() {
        return this.x;
    }

    public String N() {
        return this.textureRef;
    }

    public int R() {
        return this.color;
    }
}

