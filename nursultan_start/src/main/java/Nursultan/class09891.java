/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09924;
import Nursultan.class09938;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09891
extends Record
implements class09924 {
    private final class09938 renderer;
    private final float x;
    private final float y;
    private final float width;
    private final float height;

    public float L() {
        return this.y;
    }

    public class09891(class09938 class099382, float f, float f2, float f3, float f4) {
        this.renderer = class099382;
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09891.class, "renderer;x;y;width;height", "renderer", "x", "y", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09891.class, "renderer;x;y;width;height", "renderer", "x", "y", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09891.class, "renderer;x;y;width;height", "renderer", "x", "y", "width", "height"}, this);
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

    public class09938 N() {
        return this.renderer;
    }
}

