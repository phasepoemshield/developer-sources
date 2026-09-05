/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class03723;

final class class03708
extends Record {
    private final class00392 message;
    private final Consumer<class03723> action;

    class03708(class00392 class003922, Consumer<class03723> consumer) {
        this.message = class003922;
        this.action = consumer;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03708.class, "message;action", "message", "action"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03708.class, "message;action", "message", "action"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03708.class, "message;action", "message", "action"}, this);
    }

    public Consumer<class03723> y() {
        return this.action;
    }

    public class00392 N() {
        return this.message;
    }
}

