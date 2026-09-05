/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.buffers;

import java.nio.ByteBuffer;

public interface GpuBuffer$MappedView
extends AutoCloseable {
    public ByteBuffer data();

    @Override
    public void close();
}

