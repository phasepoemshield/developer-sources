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
import minecraft.class04562;
import minecraft.class04573;

final class class04569<C, I extends class04573<C>>
extends Record {
    private final float location;
    private final class04562<C, I> value;
    private final float derivative;

    public float L() {
        return this.derivative;
    }

    class04569(float f, class04562<C, I> class045622, float f2) {
        this.location = f;
        this.value = class045622;
        this.derivative = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04569.class, "location;value;derivative", "location", "value", "derivative"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04569.class, "location;value;derivative", "location", "value", "derivative"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04569.class, "location;value;derivative", "location", "value", "derivative"}, this);
    }

    public class04562<C, I> y() {
        return this.value;
    }

    public float N() {
        return this.location;
    }
}

