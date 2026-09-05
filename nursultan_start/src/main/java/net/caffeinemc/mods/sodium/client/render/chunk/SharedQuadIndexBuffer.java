/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapFlags
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapping
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferUsage
 *  net.caffeinemc.mods.sodium.client.gl.buffer.GlMutableBuffer
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.gl.util.EnumBitField
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapping;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferUsage;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlMutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;
import net.caffeinemc.mods.sodium.client.render.chunk.SharedQuadIndexBuffer$IndexType;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

public class SharedQuadIndexBuffer {
    private static final int ELEMENTS_PER_PRIMITIVE = 6;
    private static final int VERTICES_PER_PRIMITIVE = 4;
    private final GlMutableBuffer buffer;
    private final SharedQuadIndexBuffer$IndexType indexType;
    private int maxPrimitives;

    public SharedQuadIndexBuffer(CommandList commandList, SharedQuadIndexBuffer$IndexType sharedQuadIndexBuffer$IndexType) {
        this.buffer = commandList.createMutableBuffer();
        this.indexType = sharedQuadIndexBuffer$IndexType;
    }

    public void delete(CommandList commandList) {
        commandList.deleteBuffer((GlBuffer)this.buffer);
    }

    public void ensureCapacity(CommandList commandList, int n) {
        if (n > this.indexType.getMaxElementCount()) {
            throw new IllegalArgumentException("Tried to reserve storage for more vertices in this buffer than it can hold");
        }
        int n2 = n / 6;
        if (n2 > this.maxPrimitives) {
            this.grow(commandList, this.getNextSize(n2));
        }
    }

    private void grow(CommandList commandList, int n) {
        int n2 = n * this.indexType.getBytesPerElement() * 6;
        commandList.allocateStorage(this.buffer, (long)n2, GlBufferUsage.STATIC_DRAW);
        GlBufferMapping glBufferMapping = commandList.mapBuffer((GlBuffer)this.buffer, 0L, (long)n2, EnumBitField.of((Enum[])new GlBufferMapFlags[]{GlBufferMapFlags.INVALIDATE_BUFFER, GlBufferMapFlags.WRITE, GlBufferMapFlags.UNSYNCHRONIZED}));
        this.indexType.createIndexBuffer(glBufferMapping.getMemoryBuffer(), n);
        commandList.unmap(glBufferMapping);
        this.maxPrimitives = n;
    }

    private int getNextSize(int n) {
        return Math.min(Math.max(this.maxPrimitives * 2, n + 16384), this.indexType.getMaxPrimitiveCount());
    }

    public static NativeBuffer createIndexBuffer(SharedQuadIndexBuffer$IndexType sharedQuadIndexBuffer$IndexType, int n) {
        int n2 = n * sharedQuadIndexBuffer$IndexType.getBytesPerElement() * 6;
        NativeBuffer nativeBuffer = new NativeBuffer(n2);
        sharedQuadIndexBuffer$IndexType.createIndexBuffer(nativeBuffer.getDirectBuffer(), n);
        return nativeBuffer;
    }

    public GlBuffer getBufferObject() {
        return this.buffer;
    }
}

