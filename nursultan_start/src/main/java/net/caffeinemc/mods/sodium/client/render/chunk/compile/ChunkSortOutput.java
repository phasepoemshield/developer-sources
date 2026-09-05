/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData$DynamicTopoSorter
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile;

import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

public class ChunkSortOutput
extends BuilderTaskOutput {
    private Sorter sorter;
    private boolean reuseUploadedIndexData;

    public ChunkSortOutput(RenderSection renderSection, int n) {
        super(renderSection, n);
    }

    public ChunkSortOutput(RenderSection renderSection, int n, Sorter sorter) {
        this(renderSection, n);
        this.setSorter(sorter);
    }

    @Override
    public void destroy() {
        super.destroy();
        if (this.sorter != null) {
            this.sorter.destroy();
        }
    }

    public DynamicTopoData.DynamicTopoSorter getDynamicSorter() {
        DynamicTopoData.DynamicTopoSorter dynamicTopoSorter;
        Sorter sorter = this.sorter;
        return sorter instanceof DynamicTopoData.DynamicTopoSorter ? (dynamicTopoSorter = (DynamicTopoData.DynamicTopoSorter)sorter) : null;
    }

    @Override
    protected long calculateResultSize() {
        if (this.sorter == null) {
            return 0L;
        }
        NativeBuffer nativeBuffer = this.sorter.getIndexBuffer();
        if (nativeBuffer == null) {
            return 0L;
        }
        return nativeBuffer.getLength();
    }

    public void markAsReusingUploadedData() {
        this.reuseUploadedIndexData = true;
    }

    public boolean isReusingUploadedIndexData() {
        return this.reuseUploadedIndexData;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
        this.reuseUploadedIndexData = false;
    }

    public Sorter getSorter() {
        return this.sorter;
    }
}

