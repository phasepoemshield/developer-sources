/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.arena.staging;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferUsage;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlMutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;

public class FallbackStagingBuffer
implements StagingBuffer {
    private final GlMutableBuffer fallbackBufferObject;

    public FallbackStagingBuffer(CommandList commandList) {
        this.fallbackBufferObject = commandList.createMutableBuffer();
    }

    public String toString() {
        return "Fallback";
    }

    @Override
    public void flush(CommandList commandList) {
        commandList.allocateStorage(this.fallbackBufferObject, 0L, GlBufferUsage.STREAM_COPY);
    }

    @Override
    public void delete(CommandList commandList) {
        commandList.deleteBuffer(this.fallbackBufferObject);
    }

    @Override
    public void flip() {
    }

    @Override
    public void enqueueCopy(CommandList commandList, ByteBuffer byteBuffer, GlBuffer glBuffer, long l) {
        commandList.uploadData(this.fallbackBufferObject, byteBuffer, GlBufferUsage.STREAM_COPY);
        commandList.copyBufferSubData(this.fallbackBufferObject, glBuffer, 0L, l, byteBuffer.remaining());
    }

    @Override
    public long getUploadSizeLimit(long l) {
        return Long.MAX_VALUE;
    }
}

