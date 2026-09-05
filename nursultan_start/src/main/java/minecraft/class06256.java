/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public final class class06256
extends Record {
    private final long chunkPos;
    private final List<Runnable> tasks;

    public class06256(long l, List<Runnable> list) {
        this.chunkPos = l;
        this.tasks = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06256.class, "chunkPos;tasks", "chunkPos", "tasks"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06256.class, "chunkPos;tasks", "chunkPos", "tasks"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06256.class, "chunkPos;tasks", "chunkPos", "tasks"}, this);
    }

    public List<Runnable> y() {
        return this.tasks;
    }

    public long N() {
        return this.chunkPos;
    }
}

