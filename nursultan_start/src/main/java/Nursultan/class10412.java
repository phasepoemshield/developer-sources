/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04489
 *  minecraft.class05946
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04489;
import minecraft.class05946;

public final class class10412
extends Record
implements class04489 {
    private final class05946<?> id;

    public class10412(class05946<?> class059462) {
        this.id = class059462;
    }

    public String get() {
        return "->{" + String.valueOf(this.id.N()) + "@" + String.valueOf(this.id.y()) + "}";
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10412.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10412.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10412.class, "id", "id"}, this);
    }

    public class05946<?> N() {
        return this.id;
    }
}

