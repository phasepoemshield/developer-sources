/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11830
extends Record {
    public float max;
    public float increment;
    public class09785<Boolean> wasMove;
    public Consumer<Float> onChange;
    public float value;
    public float min;
    public Supplier<String> postfix;

    public float L() {
        return this.max - this.min;
    }

    public class09785<Boolean> M() {
        return this.wasMove;
    }

    public class11830(float f, float f2, float f3, float f4, Supplier<String> supplier, Consumer<Float> consumer, class09785<Boolean> class097852) {
        this.value = f;
        this.min = f2;
        this.max = f3;
        this.increment = f4;
        this.postfix = supplier;
        this.onChange = consumer;
        this.wasMove = class097852;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11830.class, "value;min;max;increment;postfix;onChange;wasMove", "value", "min", "max", "increment", "postfix", "onChange", "wasMove"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11830.class, "value;min;max;increment;postfix;onChange;wasMove", "value", "min", "max", "increment", "postfix", "onChange", "wasMove"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11830.class, "value;min;max;increment;postfix;onChange;wasMove", "value", "min", "max", "increment", "postfix", "onChange", "wasMove"}, this);
    }

    public float B() {
        return this.value;
    }

    public Consumer<Float> Z() {
        return this.onChange;
    }

    public float i() {
        return this.min;
    }

    public Supplier<String> u() {
        return this.postfix;
    }

    public float y() {
        return this.increment;
    }

    public float N() {
        return (this.value - this.min) / this.L();
    }

    public float R() {
        return this.max;
    }
}

