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

final class class10056
extends Record {
    private final float unwrappedWidth;
    private final float lineHeight;
    private final float longestWordWidth;

    public float L() {
        return this.longestWordWidth;
    }

    class10056(float f, float f2, float f3) {
        this.unwrappedWidth = f;
        this.lineHeight = f2;
        this.longestWordWidth = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10056.class, "unwrappedWidth;lineHeight;longestWordWidth", "unwrappedWidth", "lineHeight", "longestWordWidth"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10056.class, "unwrappedWidth;lineHeight;longestWordWidth", "unwrappedWidth", "lineHeight", "longestWordWidth"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10056.class, "unwrappedWidth;lineHeight;longestWordWidth", "unwrappedWidth", "lineHeight", "longestWordWidth"}, this);
    }

    public float y() {
        return this.lineHeight;
    }

    public float N() {
        return this.unwrappedWidth;
    }
}

