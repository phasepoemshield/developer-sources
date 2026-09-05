/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03249
 *  minecraft.class03287
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02089;
import minecraft.class03249;
import minecraft.class03287;

public final class class02116
extends Record
implements class02089 {
    private final class03249 direction;

    public class02116(class03249 class032492) {
        this.direction = class032492;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02116.class, "direction", "direction"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02116.class, "direction", "direction"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02116.class, "direction", "direction"}, this);
    }

    public class03249 y() {
        return this.direction;
    }

    @Override
    public class03249 N() {
        return this.direction.N() == class03287.field_41823 ? this.direction : class03249.field_41827;
    }
}

