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
import java.util.Locale;
import minecraft.class04562;
import minecraft.class04567;
import minecraft.class04573;

public final class class04550<C, I extends class04573<C>>
extends Record
implements class04562<C, I> {
    private final float value;

    @Override
    public float L() {
        return this.value;
    }

    public class04550(float f) {
        this.value = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04550.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04550.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04550.class, "value", "value"}, this);
    }

    public float u() {
        return this.value;
    }

    @Override
    public float y() {
        return this.value;
    }

    @Override
    public class04562<C, I> N_48(class04567<I> class045672) {
        return this;
    }

    @Override
    public float N(C c) {
        return this.value;
    }

    @Override
    public String N() {
        return String.format(Locale.ROOT, "k=%.3f", Float.valueOf(this.value));
    }
}

