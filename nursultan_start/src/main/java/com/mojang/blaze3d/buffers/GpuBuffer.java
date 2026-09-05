/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.buffers;

import com.mojang.blaze3d.buffers.GpuBufferSlice;

public abstract class GpuBuffer
implements AutoCloseable {
    public static final int USAGE_MAP_READ = 1;
    public static final int USAGE_MAP_WRITE = 2;
    public static final int USAGE_HINT_CLIENT_STORAGE = 4;
    public static final int USAGE_COPY_DST = 8;
    public static final int USAGE_COPY_SRC = 16;
    public static final int USAGE_VERTEX = 32;
    public static final int USAGE_INDEX = 64;
    public static final int USAGE_UNIFORM = 128;
    public static final int USAGE_UNIFORM_TEXEL_BUFFER = 256;
    private final int usage;
    private final long size;

    public GpuBuffer(int n, long l) {
        this.size = l;
        this.usage = n;
    }

    public long size() {
        return this.size;
    }

    @Override
    public abstract void close();

    public GpuBufferSlice slice(long l, long l2) {
        if (l < 0L || l2 < 0L || l + l2 > this.size) {
            throw new IllegalArgumentException("Offset of " + l + " and length " + l2 + " would put new slice outside buffer's range (of 0," + l2 + ")");
        }
        return new GpuBufferSlice(this, l, l2);
    }

    public GpuBufferSlice slice() {
        return new GpuBufferSlice(this, 0L, this.size);
    }

    public int usage() {
        return this.usage;
    }

    public abstract boolean isClosed();
}

