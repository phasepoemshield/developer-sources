/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.executor;

import java.util.function.Consumer;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.JobEffort;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobResult;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderTask;

public class ChunkJobTyped<TASK extends ChunkBuilderTask<OUTPUT>, OUTPUT extends BuilderTaskOutput>
implements ChunkJob {
    private final TASK task;
    private final Consumer<ChunkJobResult<OUTPUT>> consumer;
    private final boolean blocking;
    private volatile boolean cancelled;
    private volatile boolean started;

    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public boolean isBlocking() {
        return this.blocking;
    }

    @Override
    public boolean isStarted() {
        return this.started;
    }

    ChunkJobTyped(TASK TASK, Consumer<ChunkJobResult<OUTPUT>> consumer, boolean bl) {
        this.task = TASK;
        this.consumer = consumer;
        this.blocking = bl;
    }

    @Override
    public void execute(ChunkBuildContext chunkBuildContext) {
        ChunkJobResult chunkJobResult;
        if (this.cancelled) {
            return;
        }
        this.started = true;
        try {
            long l = System.nanoTime();
            Object OUTPUT = ((ChunkBuilderTask)this.task).execute(chunkBuildContext, this);
            if (OUTPUT == null) {
                return;
            }
            chunkJobResult = ChunkJobResult.successfully(OUTPUT, JobEffort.untilNowWithEffort(this.task.getClass(), l, OUTPUT.getResultSize()));
        }
        catch (Throwable throwable) {
            chunkJobResult = ChunkJobResult.exceptionally(throwable);
            ChunkBuilder.LOGGER.error("Chunk build failed", throwable);
        }
        try {
            this.consumer.accept(chunkJobResult);
        }
        catch (Throwable throwable) {
            throw new RuntimeException("Exception while consuming result", throwable);
        }
    }

    public void setCancelled() {
        this.cancelled = true;
    }

    @Override
    public long getEstimatedSize() {
        return ((ChunkBuilderTask)this.task).getEstimatedSize();
    }

    @Override
    public long getEstimatedUploadDuration() {
        return ((ChunkBuilderTask)this.task).getEstimatedUploadDuration();
    }

    @Override
    public long getEstimatedDuration() {
        return ((ChunkBuilderTask)this.task).getEstimatedDuration();
    }
}

