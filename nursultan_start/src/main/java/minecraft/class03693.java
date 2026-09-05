/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03664;
import minecraft.class04995;

final class class03693
extends Record
implements class03664 {
    private final float previous;
    private final float current;

    class03693(float f, float f2) {
        this.previous = f;
        this.current = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03693.class, "previous;current", "previous", "current"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03693.class, "previous;current", "previous", "current"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03693.class, "previous;current", "previous", "current"}, this);
    }

    public float y() {
        return this.current;
    }

    public float N() {
        return this.previous;
    }

    @Override
    public float method_48886(float f) {
        return class04995.B((float)f, (float)this.previous, (float)this.current);
    }
}

