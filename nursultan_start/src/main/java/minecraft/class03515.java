/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01921
 *  minecraft.class02042
 *  minecraft.class02055
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01921;
import minecraft.class02042;
import minecraft.class02055;

public final class class03515<T>
extends Record {
    private final class02042<T> owner;
    private final class02055<T> getter;
    private final Lifecycle elementsLifecycle;

    public Lifecycle L() {
        return this.elementsLifecycle;
    }

    public class03515(class02042<T> class020422, class02055<T> class020552, Lifecycle lifecycle) {
        this.owner = class020422;
        this.getter = class020552;
        this.elementsLifecycle = lifecycle;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03515.class, "owner;getter;elementsLifecycle", "owner", "getter", "elementsLifecycle"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03515.class, "owner;getter;elementsLifecycle", "owner", "getter", "elementsLifecycle"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03515.class, "owner;getter;elementsLifecycle", "owner", "getter", "elementsLifecycle"}, this);
    }

    public class02055<T> y() {
        return this.getter;
    }

    public class02042<T> N() {
        return this.owner;
    }

    public static <T> class03515<T> N(class01921<T> class019212) {
        return new class03515<T>(class019212, class019212, class019212.R());
    }
}

