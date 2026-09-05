/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package net.caffeinemc.mods.sodium.client.gl.arena.staging;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapping;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlImmutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;

final class MappedStagingBuffer$MappedBuffer
extends Record {
    final GlImmutableBuffer buffer;
    final GlBufferMapping map;

    MappedStagingBuffer$MappedBuffer(GlImmutableBuffer glImmutableBuffer, GlBufferMapping glBufferMapping) {
        this.buffer = glImmutableBuffer;
        this.map = glBufferMapping;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{MappedStagingBuffer$MappedBuffer.class, "buffer;map", "buffer", "map"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{MappedStagingBuffer$MappedBuffer.class, "buffer;map", "buffer", "map"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{MappedStagingBuffer$MappedBuffer.class, "buffer;map", "buffer", "map"}, this);
    }

    public GlBufferMapping map() {
        return this.map;
    }

    public GlImmutableBuffer buffer() {
        return this.buffer;
    }

    public void delete(CommandList commandList) {
        commandList.unmap(this.map);
        commandList.deleteBuffer(this.buffer);
    }
}

