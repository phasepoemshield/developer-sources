/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL44C
 *  org.lwjgl.system.MemoryUtil
 */
package net.caffeinemc.mods.sodium.client.gl.buffer;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.MappedStagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapping;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStorageFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferUsage;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlMutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL44C;
import org.lwjgl.system.MemoryUtil;

public class GlBufferStreamer {
    private final GlBuffer buffer;
    private final GlBufferMapping mapping;
    private final long writeAddress;
    private final int stride;
    private final long bufferSize;
    private boolean requiresFlush;

    public GlBuffer prepare(CommandList commandList) {
        if (this.requiresFlush) {
            this.requiresFlush = false;
            if (this.mapping != null) {
                commandList.flushMappedRange(this.mapping, 0, (int)this.bufferSize);
                GL44C.glMemoryBarrier((int)16384);
            } else {
                commandList.uploadDataToOffset((GlMutableBuffer)this.buffer, 0, this.writeAddress, (int)this.bufferSize);
            }
        }
        return this.buffer;
    }

    public GlBufferStreamer(CommandList commandList, int n, int n2) {
        this.bufferSize = (long)n * (long)n2;
        this.stride = n2;
        if (SodiumClientMod.options().advanced.useAdvancedStagingBuffers && MappedStagingBuffer.isSupported(RenderDevice.INSTANCE) && GL.getCapabilities().GL_ARB_shader_image_load_store && GL.getCapabilities().glMemoryBarrier != 0L) {
            this.buffer = commandList.createImmutableBuffer(this.bufferSize, EnumBitField.of((Enum[])new GlBufferStorageFlags[]{GlBufferStorageFlags.PERSISTENT, GlBufferStorageFlags.MAP_WRITE}));
            this.mapping = commandList.mapBuffer(this.buffer, 0L, this.bufferSize, EnumBitField.of((Enum[])new GlBufferMapFlags[]{GlBufferMapFlags.PERSISTENT, GlBufferMapFlags.WRITE, GlBufferMapFlags.EXPLICIT_FLUSH}));
            this.writeAddress = MemoryUtil.memAddress((ByteBuffer)this.mapping.getMemoryBuffer());
        } else {
            this.buffer = commandList.createMutableBuffer();
            commandList.allocateStorage((GlMutableBuffer)this.buffer, this.bufferSize, GlBufferUsage.STREAM_DRAW);
            this.mapping = null;
            this.writeAddress = MemoryUtil.nmemAlloc((long)this.bufferSize);
        }
        MemoryUtil.memSet((long)this.writeAddress, (int)0, (long)this.bufferSize);
    }

    public void delete(CommandList commandList) {
        if (this.mapping != null) {
            commandList.unmap(this.mapping);
        } else {
            MemoryUtil.nmemFree((long)this.writeAddress);
        }
        commandList.deleteBuffer(this.buffer);
    }

    public void writeData(int n, int n2) {
        int n3 = n * this.stride;
        if ((long)(n3 + this.stride) > this.bufferSize) {
            throw new IndexOutOfBoundsException("Attempted to write beyond the end of the buffer streamer");
        }
        MemoryUtil.memPutInt((long)(this.writeAddress + (long)n3), (int)n2);
        this.requiresFlush = true;
    }
}

