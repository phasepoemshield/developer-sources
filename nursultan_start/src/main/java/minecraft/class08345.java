/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08387;

public final class class08345<T extends class08387>
extends Record {
    final T entry;
    final int width;
    final int height;

    public int L() {
        return this.height;
    }

    public class08345(T t, int n, int n2) {
        this.entry = t;
        this.width = n;
        this.height = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08345.class, "entry;width;height", "entry", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08345.class, "entry;width;height", "entry", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08345.class, "entry;width;height", "entry", "width", "height"}, this);
    }

    public int y() {
        return this.width;
    }

    public T N() {
        return this.entry;
    }
}

