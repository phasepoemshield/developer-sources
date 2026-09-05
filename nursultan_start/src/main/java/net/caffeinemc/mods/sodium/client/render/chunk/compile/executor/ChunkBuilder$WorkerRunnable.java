/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.jtracy.TracyClient
 *  com.mojang.jtracy.Zone
 *  minecraft.class07529
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.executor;

import com.mojang.jtracy.TracyClient;
import com.mojang.jtracy.Zone;
import minecraft.class07529;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildContext;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.executor.ChunkJob;

class ChunkBuilder$WorkerRunnable
implements Runnable {
    private final String name;
    private final ChunkBuildContext context;
    final /* synthetic */ ChunkBuilder this$0;

    public ChunkBuilder$WorkerRunnable(ChunkBuilder chunkBuilder, String string, ChunkBuildContext chunkBuildContext) {
        this.this$0 = chunkBuilder;
        this.name = string;
        this.context = chunkBuildContext;
    }

    @Override
    public void run() {
        while (this.this$0.queue.isRunning()) {
            ChunkJob chunkJob;
            try {
                chunkJob = this.this$0.queue.waitForNextJob();
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            if (chunkJob == null) continue;
            this.this$0.busyThreadCount.getAndIncrement();
            Zone zone = TracyClient.beginZone((String)this.name, (boolean)class07529.ND);
            try {
                chunkJob.execute(this.context);
            }
            finally {
                this.context.cleanup();
                this.this$0.busyThreadCount.decrementAndGet();
            }
            zone.close();
        }
    }
}

