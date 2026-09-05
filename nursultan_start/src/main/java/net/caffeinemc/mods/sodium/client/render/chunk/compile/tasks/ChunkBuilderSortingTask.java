/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04643
 *  minecraft.class08700
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkSortOutput
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.caffeinemc.mods.sodium.client.util.task.CancellationToken
 *  org.joml.Vector3dc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks;

import minecraft.class04643;
import minecraft.class08700;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkSortOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.MeshTaskSizeEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderTask;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.util.task.CancellationToken;
import org.joml.Vector3dc;

public class ChunkBuilderSortingTask
extends ChunkBuilderTask<ChunkSortOutput> {
    private final DynamicSorter sorter;

    public ChunkBuilderSortingTask(RenderSection renderSection, int n, Vector3dc vector3dc, DynamicSorter dynamicSorter) {
        super(renderSection, n, vector3dc);
        this.sorter = dynamicSorter;
    }

    @Override
    public ChunkSortOutput execute(ChunkBuildContext chunkBuildContext, CancellationToken cancellationToken) {
        if (cancellationToken.isCancelled()) {
            return null;
        }
        class04643 class046432 = class08700.N();
        class046432.N("translucency sorting");
        this.sorter.writeIndexBuffer(this, false);
        class046432.L();
        return new ChunkSortOutput(this.render, this.submitTime, (Sorter)this.sorter);
    }

    public static ChunkBuilderSortingTask createTask(RenderSection renderSection, int n, Vector3dc vector3dc) {
        TranslucentData translucentData = renderSection.getTranslucentData();
        if (translucentData instanceof DynamicData) {
            DynamicData dynamicData = (DynamicData)translucentData;
            return new ChunkBuilderSortingTask(renderSection, n, vector3dc, dynamicData.getSorter());
        }
        return null;
    }

    @Override
    public long estimateTaskSizeWith(MeshTaskSizeEstimator meshTaskSizeEstimator) {
        return this.sorter.getResultSize();
    }
}

