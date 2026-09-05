/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.executor;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;

class ChunkJobQueue {
    private final ConcurrentLinkedDeque<ChunkJob> jobs = new ConcurrentLinkedDeque();
    private final AtomicLong jobDurationSum = new AtomicLong();
    private final Semaphore semaphore = new Semaphore(0);
    private final AtomicBoolean isRunning = new AtomicBoolean(true);

    public boolean isRunning() {
        return this.isRunning.get();
    }

    ChunkJobQueue() {
    }

    public Collection<ChunkJob> shutdown() {
        ArrayDeque<ChunkJob> arrayDeque = new ArrayDeque<ChunkJob>();
        this.isRunning.set(false);
        while (this.semaphore.tryAcquire()) {
            ChunkJob chunkJob = this.jobs.poll();
            if (chunkJob == null) continue;
            arrayDeque.add(chunkJob);
        }
        this.semaphore.release(Runtime.getRuntime().availableProcessors());
        this.jobDurationSum.set(0L);
        return arrayDeque;
    }

    public int size() {
        return this.semaphore.availablePermits();
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public void add(ChunkJob chunkJob, boolean bl) {
        Validate.isTrue((boolean)this.isRunning(), (String)"Queue is no longer running", (Object[])new Object[0]);
        if (bl) {
            this.jobs.addFirst(chunkJob);
        } else {
            this.jobs.addLast(chunkJob);
        }
        this.jobDurationSum.addAndGet(chunkJob.getEstimatedDuration());
        this.semaphore.release(1);
    }

    public @Nullable ChunkJob waitForNextJob() throws InterruptedException {
        if (!this.isRunning()) {
            return null;
        }
        this.semaphore.acquire();
        ChunkJob chunkJob = this.getNextTask();
        if (chunkJob != null) {
            this.jobDurationSum.addAndGet(-chunkJob.getEstimatedDuration());
        }
        return chunkJob;
    }

    private @Nullable ChunkJob getNextTask() {
        return this.jobs.poll();
    }

    public long getJobDurationSum() {
        return this.jobDurationSum.get();
    }

    public boolean stealJob(ChunkJob chunkJob) {
        if (!this.semaphore.tryAcquire()) {
            return false;
        }
        boolean bl = this.jobs.remove(chunkJob);
        if (bl) {
            this.jobDurationSum.addAndGet(-chunkJob.getEstimatedDuration());
        } else {
            this.semaphore.release(1);
        }
        return bl;
    }
}

