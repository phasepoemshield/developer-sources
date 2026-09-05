/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package me.flashyreese.mods.sodiumextra.client;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class FrameCounter$FrameSample
extends Record {
    final long timestamp;
    final long deltaNanos;

    FrameCounter$FrameSample(long l, long l2) {
        this.timestamp = l;
        this.deltaNanos = l2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{FrameCounter$FrameSample.class, "timestamp;deltaNanos", "timestamp", "deltaNanos"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{FrameCounter$FrameSample.class, "timestamp;deltaNanos", "timestamp", "deltaNanos"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{FrameCounter$FrameSample.class, "timestamp;deltaNanos", "timestamp", "deltaNanos"}, this);
    }

    public long timestamp() {
        return this.timestamp;
    }

    public long deltaNanos() {
        return this.deltaNanos;
    }
}

