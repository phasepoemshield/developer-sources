/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

public abstract class PresentSorter
implements Sorter {
    private NativeBuffer indexBuffer;

    @Override
    public void destroy() {
        if (this.indexBuffer != null) {
            this.indexBuffer.free();
        }
    }

    @Override
    public NativeBuffer getIndexBuffer() {
        return this.indexBuffer;
    }

    void initBufferWithQuadLength(int n) {
        this.indexBuffer = new NativeBuffer(TranslucentData.quadCountToIndexBytes(n));
    }
}

