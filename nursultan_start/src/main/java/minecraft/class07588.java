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

final class class07588
extends Record {
    private final float a;
    private final float b;
    private final float c;

    public float L() {
        return this.c;
    }

    class07588(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07588.class, "a;b;c", "a", "b", "c"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07588.class, "a;b;c", "a", "b", "c"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07588.class, "a;b;c", "a", "b", "c"}, this);
    }

    public float y(float f) {
        return (3.0f * this.a * f + 2.0f * this.b) * f + this.c;
    }

    public float y() {
        return this.b;
    }

    public float N() {
        return this.a;
    }

    public float N(float f) {
        return ((this.a * f + this.b) * f + this.c) * f;
    }
}

