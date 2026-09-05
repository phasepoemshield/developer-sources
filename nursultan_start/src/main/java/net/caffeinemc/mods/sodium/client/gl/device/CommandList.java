/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.device;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.gl.array.GlVertexArray;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferMapping;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferStorageFlags;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferTarget;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBufferUsage;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlImmutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlMutableBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.DrawCommandList;
import net.caffeinemc.mods.sodium.client.gl.sync.GlFence;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlPrimitiveType;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlTessellation;
import net.caffeinemc.mods.sodium.client.gl.tessellation.TessellationBinding;
import net.caffeinemc.mods.sodium.client.gl.util.EnumBitField;

public interface CommandList
extends AutoCloseable {
    public void flush();

    @Override
    default public void close() {
        this.flush();
    }

    public GlFence createFence();

    public void unmap(GlBufferMapping var1);

    public GlImmutableBuffer createImmutableBuffer(long var1, EnumBitField<GlBufferStorageFlags> var3);

    public GlMutableBuffer createMutableBuffer();

    public void uploadData(GlMutableBuffer var1, ByteBuffer var2, GlBufferUsage var3);

    public void bindBuffer(GlBufferTarget var1, GlBuffer var2);

    public GlBufferMapping mapBuffer(GlBuffer var1, long var2, long var4, EnumBitField<GlBufferMapFlags> var6);

    public void copyBufferSubData(GlBuffer var1, GlBuffer var2, long var3, long var5, long var7);

    public void uploadDataToOffset(GlMutableBuffer var1, int var2, long var3, int var5);

    public void deleteBuffer(GlBuffer var1);

    public void allocateStorage(GlMutableBuffer var1, long var2, GlBufferUsage var4);

    public GlTessellation createTessellation(GlPrimitiveType var1, TessellationBinding[] var2);

    public void bindVertexArray(GlVertexArray var1);

    public void unbindVertexArray();

    public DrawCommandList beginTessellating(GlTessellation var1);

    public void flushMappedRange(GlBufferMapping var1, int var2, int var3);

    public void deleteVertexArray(GlVertexArray var1);

    public void deleteTessellation(GlTessellation var1);
}

