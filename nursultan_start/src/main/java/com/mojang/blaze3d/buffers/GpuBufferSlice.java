/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.buffers;

import com.mojang.blaze3d.buffers.GpuBuffer;

public record GpuBufferSlice(GpuBuffer buffer, long offset, long length) {
    public GpuBufferSlice slice(long l, long l2) {
        if (l < 0L || l2 < 0L || l + l2 > this.length) {
            throw new IllegalArgumentException("Offset of " + l + " and length " + l2 + " would put new slice outside existing slice's range (of " + this.offset + "," + this.length + ")");
        }
        return new GpuBufferSlice(this.buffer, this.offset + l, l2);
    }
}

