/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 *  org.apache.commons.lang3.Validate
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.executor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import minecraft.class03448;
import minecraft.class04995;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkBuilder$WorkerRunnable;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobQueue;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobResult;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJobTyped;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.tasks.ChunkBuilderTask;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ChunkBuilder {
    static final Logger LOGGER = LogManager.getLogger((String)"ChunkBuilder");
    final ChunkJobQueue queue = new ChunkJobQueue();
    private final List<Thread> threads = new ArrayList<Thread>();
    final AtomicInteger busyThreadCount = new AtomicInteger();
    private final ChunkBuildContext localContext;

    private static int getThreadCount() {
        int n = SodiumClientMod.options().performance.chunkBuilderThreads;
        return n == 0 ? ChunkBuilder.getOptimalThreadCount() : Math.min(n, ChunkBuilder.getMaxThreadCount());
    }

    public ChunkBuilder(class03448 class034482, ChunkVertexType chunkVertexType) {
        int n = ChunkBuilder.getThreadCount();
        for (int i = 0; i < n; ++i) {
            ChunkBuildContext chunkBuildContext = new ChunkBuildContext(class034482, chunkVertexType);
            ChunkBuilder$WorkerRunnable chunkBuilder$WorkerRunnable = new ChunkBuilder$WorkerRunnable(this, "Chunk Render Task Executor #" + i, chunkBuildContext);
            Thread thread = new Thread((Runnable)chunkBuilder$WorkerRunnable, "Chunk Render Task Executor #" + i);
            thread.setPriority(Math.max(0, 3));
            thread.start();
            this.threads.add(thread);
        }
        LOGGER.info("Started {} worker threads", (Object)this.threads.size());
        this.localContext = new ChunkBuildContext(class034482, chunkVertexType);
    }

    public void shutdown() {
        if (!this.queue.isRunning()) {
            throw new IllegalStateException("Worker threads are not running");
        }
        Collection<ChunkJob> collection = this.queue.shutdown();
        for (ChunkJob chunkJob : collection) {
            chunkJob.setCancelled();
        }
        this.shutdownThreads();
    }

    public int getTotalThreadCount() {
        return this.threads.size();
    }

    public boolean isBuildQueueEmpty() {
        return this.queue.isEmpty();
    }

    public <TASK extends ChunkBuilderTask<OUTPUT>, OUTPUT extends BuilderTaskOutput> ChunkJobTyped<TASK, OUTPUT> scheduleTask(TASK TASK, boolean bl, Consumer<ChunkJobResult<OUTPUT>> consumer, boolean bl2) {
        Validate.notNull(TASK, (String)"Task must be non-null", (Object[])new Object[0]);
        if (!this.queue.isRunning()) {
            throw new IllegalStateException("Executor is stopped");
        }
        ChunkJobTyped<TASK, OUTPUT> chunkJobTyped = new ChunkJobTyped<TASK, OUTPUT>(TASK, consumer, bl2);
        this.queue.add(chunkJobTyped, bl);
        return chunkJobTyped;
    }

    public float getBusyFraction(long l) {
        return (float)this.queue.getJobDurationSum() / (float)(l * (long)this.threads.size());
    }

    public int getBusyThreadCount() {
        return this.busyThreadCount.get();
    }

    public void tryStealTask(ChunkJob chunkJob) {
        if (!this.queue.stealJob(chunkJob)) {
            return;
        }
        ChunkBuildContext chunkBuildContext = this.localContext;
        try {
            chunkJob.execute(chunkBuildContext);
        }
        finally {
            chunkBuildContext.cleanup();
        }
    }

    private static int getMaxThreadCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private void shutdownThreads() {
        LOGGER.info("Stopping worker threads");
        for (Thread thread : this.threads) {
            try {
                thread.join();
            }
            catch (InterruptedException interruptedException) {}
        }
        this.threads.clear();
    }

    public long getTotalRemainingDuration(long l) {
        return Math.max(0L, (long)this.threads.size() * l - this.queue.getJobDurationSum());
    }

    public int getScheduledJobCount() {
        return this.queue.size();
    }

    private static int getOptimalThreadCount() {
        return class04995.N((int)Math.max(ChunkBuilder.getMaxThreadCount() / 3, ChunkBuilder.getMaxThreadCount() - 6), (int)1, (int)10);
    }
}

