/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01975
 *  minecraft.class03264
 *  minecraft.class03607
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class01975;
import minecraft.class03264;
import minecraft.class03607;

final class class05425
extends Record {
    private final Optional<class01975> condition;
    private final class03264 variants;

    public class03264 L() {
        return this.variants;
    }

    class05425(Optional<class01975> optional, class03264 class032642) {
        this.condition = optional;
        this.variants = class032642;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05425.class, "condition;variants", "condition", "variants"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05425.class, "condition;variants", "condition", "variants"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05425.class, "condition;variants", "condition", "variants"}, this);
    }

    public Optional<class01975> y() {
        return this.condition;
    }

    public class03607 N() {
        return new class03607(this.condition, this.variants.N());
    }
}

