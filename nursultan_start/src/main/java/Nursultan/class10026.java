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

final class class10026
extends Record {
    private final String text;
    private final float width;
    private final float height;
    private final int lineCount;

    public float L() {
        return this.height;
    }

    class10026(String string, float f, float f2, int n) {
        this.text = string;
        this.width = f;
        this.height = f2;
        this.lineCount = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10026.class, "text;width;height;lineCount", "text", "width", "height", "lineCount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10026.class, "text;width;height;lineCount", "text", "width", "height", "lineCount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10026.class, "text;width;height;lineCount", "text", "width", "height", "lineCount"}, this);
    }

    public int u() {
        return this.lineCount;
    }

    public float y() {
        return this.width;
    }

    public String N() {
        return this.text;
    }
}

