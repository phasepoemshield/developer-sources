/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongSet
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03345
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import minecraft.class03345;

final class class01672
extends Record {
    final LongSet chunksWhichReceivedNeighbors;
    final BlockingQueue<class03345> sectionsToPropagateFrom;

    class01672() {
        this((LongSet)new LongOpenHashSet(), new LinkedBlockingQueue<class03345>());
    }

    private class01672(LongSet longSet, BlockingQueue<class03345> blockingQueue) {
        this.chunksWhichReceivedNeighbors = longSet;
        this.sectionsToPropagateFrom = blockingQueue;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01672.class, "chunksWhichReceivedNeighbors;sectionsToPropagateFrom", "chunksWhichReceivedNeighbors", "sectionsToPropagateFrom"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01672.class, "chunksWhichReceivedNeighbors;sectionsToPropagateFrom", "chunksWhichReceivedNeighbors", "sectionsToPropagateFrom"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01672.class, "chunksWhichReceivedNeighbors;sectionsToPropagateFrom", "chunksWhichReceivedNeighbors", "sectionsToPropagateFrom"}, this);
    }

    public BlockingQueue<class03345> y() {
        return this.sectionsToPropagateFrom;
    }

    public LongSet N() {
        return this.chunksWhichReceivedNeighbors;
    }
}

