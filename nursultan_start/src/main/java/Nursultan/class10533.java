/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class10533
extends Record
implements Runnable {
    final int priority;
    private final Runnable task;

    public class10533(int n, Runnable runnable) {
        this.priority = n;
        this.task = runnable;
    }

    @Override
    public void run() {
        this.task.run();
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10533.class, "priority;task", "priority", "task"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10533.class, "priority;task", "priority", "task"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10533.class, "priority;task", "priority", "task"}, this);
    }

    public Runnable y() {
        return this.task;
    }

    public int N() {
        return this.priority;
    }
}

