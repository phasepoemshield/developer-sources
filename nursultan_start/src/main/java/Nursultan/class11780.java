/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11808
 *  Nursultan.class11826
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11777;
import Nursultan.class11808;
import Nursultan.class11826;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;

public class class11780<T>
extends Record
implements class11808 {
    public boolean ignoreCancelled;
    public Class<?> eventType;
    public class11826<T> eventListener;
    public class11777 priority;

    public class11777 L() {
        return this.priority;
    }

    public class11780(Class<?> clazz, class11777 class117772, boolean bl, class11826<T> class118262) {
        this.eventType = clazz;
        this.priority = class117772;
        this.ignoreCancelled = bl;
        this.eventListener = class118262;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11780.class, "eventType;priority;ignoreCancelled;eventListener", "eventType", "priority", "ignoreCancelled", "eventListener"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11780.class, "eventType;priority;ignoreCancelled;eventListener", "eventType", "priority", "ignoreCancelled", "eventListener"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11780.class, "eventType;priority;ignoreCancelled;eventListener", "eventType", "priority", "ignoreCancelled", "eventListener"}, this);
    }

    public Class<?> B() {
        return this.eventType;
    }

    public class11826<T> Z() {
        return this.eventListener;
    }

    public boolean i() {
        return this.ignoreCancelled;
    }

    public Class<?> u() {
        return this.eventType;
    }

    public Consumer<Object> N() {
        return object -> this.eventListener.listen(object);
    }
}

