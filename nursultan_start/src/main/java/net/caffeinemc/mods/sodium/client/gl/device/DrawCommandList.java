/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.device;

import net.caffeinemc.mods.sodium.client.gl.device.MultiDrawBatch;
import net.caffeinemc.mods.sodium.client.gl.tessellation.GlIndexType;

public interface DrawCommandList
extends AutoCloseable {
    public void flush();

    @Override
    default public void close() {
        this.flush();
    }

    public void multiDrawElementsBaseVertex(MultiDrawBatch var1, GlIndexType var2);

    public void endTessellating();
}

