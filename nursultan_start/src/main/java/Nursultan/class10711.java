/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04489
 *  minecraft.class07049
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04489;
import minecraft.class07049;

public final class class10711
extends Record
implements class04489 {
    private final class07049 entity;

    public class10711(class07049 class070492) {
        this.entity = class070492;
    }

    public String get() {
        return this.entity.toString();
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10711.class, "entity", "entity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10711.class, "entity", "entity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10711.class, "entity", "entity"}, this);
    }

    public class07049 N() {
        return this.entity;
    }
}

