/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$DataPair
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator;

public final class JobEffort
extends Record
implements Abstract2DLinearEstimator.DataPair<Class<?>> {
    private final Class<?> category;
    private final long duration;
    private final long effort;

    public JobEffort(Class<?> clazz, long l, long l2) {
        this.category = clazz;
        this.duration = l;
        this.effort = l2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{JobEffort.class, "category;duration;effort", "category", "duration", "effort"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{JobEffort.class, "category;duration;effort", "category", "duration", "effort"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{JobEffort.class, "category;duration;effort", "category", "duration", "effort"}, this);
    }

    public long x() {
        return this.effort;
    }

    public long duration() {
        return this.duration;
    }

    public long y() {
        return this.duration;
    }

    public Class<?> category() {
        return this.category;
    }

    public static JobEffort untilNowWithEffort(Class<?> clazz, long l, long l2) {
        return new JobEffort(clazz, System.nanoTime() - l, l2);
    }

    public long effort() {
        return this.effort;
    }
}

