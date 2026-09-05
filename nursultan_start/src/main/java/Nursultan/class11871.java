/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  Nursultan.class11494
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09785;
import Nursultan.class11494;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11871
extends Record {
    public class11494 value;
    public Consumer<class11494> onChange;
    public class11494 minMax;
    public float increment;
    public class09785<Boolean> wasMove;
    public Supplier<String> postfix;

    public float L() {
        return this.N() - this.u();
    }

    public float M() {
        return this.increment;
    }

    public class11871(class11494 class114942, class11494 class114943, float f, Supplier<String> supplier, Consumer<class11494> consumer, class09785<Boolean> class097852) {
        this.value = class114942;
        this.minMax = class114943;
        this.increment = f;
        this.postfix = supplier;
        this.onChange = consumer;
        this.wasMove = class097852;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11871.class, "value;minMax;increment;postfix;onChange;wasMove", "value", "minMax", "increment", "postfix", "onChange", "wasMove"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11871.class, "value;minMax;increment;postfix;onChange;wasMove", "value", "minMax", "increment", "postfix", "onChange", "wasMove"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11871.class, "value;minMax;increment;postfix;onChange;wasMove", "value", "minMax", "increment", "postfix", "onChange", "wasMove"}, this);
    }

    public class11494 B() {
        return this.value;
    }

    public Supplier<String> Z() {
        return this.postfix;
    }

    public class09785<Boolean> i() {
        return this.wasMove;
    }

    public float U() {
        return (this.value.N() - this.u()) / this.L();
    }

    public class11494 z() {
        return this.minMax;
    }

    public float u() {
        return this.minMax.N();
    }

    public float y() {
        return (this.value.L() - this.u()) / this.L();
    }

    public float N() {
        return this.minMax.L();
    }

    public Consumer<class11494> R() {
        return this.onChange;
    }
}

