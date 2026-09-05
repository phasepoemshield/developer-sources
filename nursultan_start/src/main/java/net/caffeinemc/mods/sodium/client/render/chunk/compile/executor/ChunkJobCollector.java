/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.function.Consumer;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobResult;

public class ChunkJobCollector {
    private final Semaphore semaphore = new Semaphore(0);
    private final Consumer<ChunkJobResult<? extends BuilderTaskOutput>> collector;
    private final List<ChunkJob> submitted = new ArrayList<ChunkJob>();
    private long duration;

    public ChunkJobCollector(Consumer<ChunkJobResult<? extends BuilderTaskOutput>> consumer) {
        this.duration = Long.MAX_VALUE;
        this.collector = consumer;
    }

    public ChunkJobCollector(long l, Consumer<ChunkJobResult<? extends BuilderTaskOutput>> consumer) {
        this.duration = l;
        this.collector = consumer;
    }

    public void awaitCompletion(ChunkBuilder chunkBuilder) {
        if (this.submitted.isEmpty()) {
            return;
        }
        for (ChunkJob chunkJob : this.submitted) {
            if (chunkJob.isStarted() || chunkJob.isCancelled()) continue;
            chunkBuilder.tryStealTask(chunkJob);
        }
        this.semaphore.acquireUninterruptibly(this.submitted.size());
    }

    public void addSubmittedJob(ChunkJob chunkJob) {
        this.submitted.add(chunkJob);
        this.duration -= chunkJob.getEstimatedDuration();
    }

    public boolean hasBudgetRemaining() {
        return this.duration > 0L;
    }

    public void onJobFinished(ChunkJobResult<? extends BuilderTaskOutput> chunkJobResult) {
        this.semaphore.release(1);
        this.collector.accept(chunkJobResult);
    }

    public int getSubmittedTaskCount() {
        return this.submitted.size();
    }
}

