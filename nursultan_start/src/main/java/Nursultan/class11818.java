/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11808;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public class class11818
extends Record {
    public Consumer<Object>[] invokers;
    public class11808[] handlers;

    class11818(class11808[] class11808Array, Consumer<Object>[] consumerArray) {
        this.handlers = class11808Array;
        this.invokers = consumerArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11818.class, "handlers;invokers", "handlers", "invokers"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11818.class, "handlers;invokers", "handlers", "invokers"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11818.class, "handlers;invokers", "handlers", "invokers"}, this);
    }

    public class11808[] y() {
        return this.handlers;
    }

    public Consumer<Object>[] N() {
        return this.invokers;
    }
}

