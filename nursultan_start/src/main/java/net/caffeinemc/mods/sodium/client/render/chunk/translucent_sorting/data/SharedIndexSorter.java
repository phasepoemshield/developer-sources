/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import java.nio.IntBuffer;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

public record SharedIndexSorter(int quadCount) implements Sorter
{
    @Override
    public void destroy() {
    }

    @Override
    public IntBuffer getIntBuffer() {
        return null;
    }

    @Override
    public NativeBuffer getIndexBuffer() {
        return null;
    }

    @Override
    public void writeIndexBuffer(CombinedCameraPos combinedCameraPos, boolean bl) {
    }
}

