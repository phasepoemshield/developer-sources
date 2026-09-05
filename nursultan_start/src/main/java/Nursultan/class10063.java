/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class10063
extends Record {
    private final float width;
    private final float height;
    private final float minWidth;
    private final float minHeight;

    public float L() {
        return this.minWidth;
    }

    class10063(float f, float f2, float f3, float f4) {
        this.width = f;
        this.height = f2;
        this.minWidth = f3;
        this.minHeight = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10063.class, "width;height;minWidth;minHeight", "width", "height", "minWidth", "minHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10063.class, "width;height;minWidth;minHeight", "width", "height", "minWidth", "minHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10063.class, "width;height;minWidth;minHeight", "width", "height", "minWidth", "minHeight"}, this);
    }

    public float u() {
        return this.minHeight;
    }

    public float y() {
        return this.height;
    }

    public float N() {
        return this.width;
    }
}

