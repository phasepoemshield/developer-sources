/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentSorter
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;

public abstract class DynamicSorter
extends PresentSorter {
    private final int quadCount;

    DynamicSorter(int n) {
        this.quadCount = n;
    }

    public int getResultSize() {
        return TranslucentData.quadCountToIndexBytes((int)this.quadCount);
    }

    public void writeIndexBuffer(CombinedCameraPos combinedCameraPos, boolean bl) {
        this.initBufferWithQuadLength(this.quadCount);
        this.writeSort(combinedCameraPos, bl);
    }

    public int getQuadCount() {
        return this.quadCount;
    }

    abstract void writeSort(CombinedCameraPos var1, boolean var2);
}

