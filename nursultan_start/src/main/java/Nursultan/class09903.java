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

public final class class09903
extends Record
implements class09935 {
    private final float x;
    private final float y;
    private final float width;
    private final float height;
    private final List<class09935> children;

    public float L() {
        return this.width;
    }

    public class09903(float f, float f2, float f3, float f4, List<class09935> list) {
        Objects.requireNonNull(list, "children");
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        this.children = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09903.class, "x;y;width;height;children", "x", "y", "width", "height", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09903.class, "x;y;width;height;children", "x", "y", "width", "height", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09903.class, "x;y;width;height;children", "x", "y", "width", "height", "children"}, this);
    }

    public List<class09935> i() {
        return this.children;
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
}

