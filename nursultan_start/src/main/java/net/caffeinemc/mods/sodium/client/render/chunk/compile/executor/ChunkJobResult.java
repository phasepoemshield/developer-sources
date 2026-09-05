/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07878
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.executor;

import minecraft.class07878;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.JobEffort;

public class ChunkJobResult<OUTPUT> {
    private final OUTPUT output;
    private final Throwable throwable;
    private final JobEffort jobEffort;

    public OUTPUT unwrap() {
        Throwable throwable = this.throwable;
        if (throwable instanceof class07878) {
            class07878 class078782 = (class07878)throwable;
            throw class078782;
        }
        if (this.throwable != null) {
            throw new RuntimeException("Exception thrown while executing job", this.throwable);
        }
        return this.output;
    }

    private ChunkJobResult(OUTPUT OUTPUT, Throwable throwable, JobEffort jobEffort) {
        this.output = OUTPUT;
        this.throwable = throwable;
        this.jobEffort = jobEffort;
    }

    public static <OUTPUT> ChunkJobResult<OUTPUT> exceptionally(Throwable throwable) {
        return new ChunkJobResult<Object>(null, throwable, null);
    }

    public static <OUTPUT> ChunkJobResult<OUTPUT> successfully(OUTPUT OUTPUT) {
        return new ChunkJobResult<OUTPUT>(OUTPUT, null, null);
    }

    public static <OUTPUT> ChunkJobResult<OUTPUT> successfully(OUTPUT OUTPUT, JobEffort jobEffort) {
        return new ChunkJobResult<OUTPUT>(OUTPUT, null, jobEffort);
    }

    public JobEffort getJobEffort() {
        return this.jobEffort;
    }
}

