/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02089
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02089;
import minecraft.class03249;

public final class class03251
extends Record
implements class02089 {
    private final boolean forward;

    public class03251(boolean bl) {
        this.forward = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03251.class, "forward", "forward"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03251.class, "forward", "forward"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03251.class, "forward", "forward"}, this);
    }

    public boolean y() {
        return this.forward;
    }

    public class03249 N() {
        return this.forward ? class03249.field_41827 : class03249.field_41826;
    }
}

