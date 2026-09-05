/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.arena.staging;

import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.gl.buffer.GlBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;

public interface StagingBuffer {
    public void flush(CommandList var1);

    public void delete(CommandList var1);

    public void flip();

    public void enqueueCopy(CommandList var1, ByteBuffer var2, GlBuffer var3, long var4);

    public long getUploadSizeLimit(long var1);
}

