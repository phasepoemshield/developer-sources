/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.gl.buffer;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import org.lwjgl.system.MemoryUtil;

public class GlBufferMapping {
    private final GlBuffer buffer;
    private final ByteBuffer map;
    protected boolean disposed;

    public GlBufferMapping(GlBuffer glBuffer, ByteBuffer byteBuffer) {
        this.buffer = glBuffer;
        this.map = byteBuffer;
    }

    public void write(ByteBuffer byteBuffer, int n) {
        MemoryUtil.memCopy((long)MemoryUtil.memAddress((ByteBuffer)byteBuffer), (long)MemoryUtil.memAddress((ByteBuffer)this.map, (int)n), (long)byteBuffer.remaining());
    }

    public void dispose() {
        this.disposed = true;
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    public ByteBuffer getMemoryBuffer() {
        return this.map;
    }

    public GlBuffer getBufferObject() {
        return this.buffer;
    }
}

