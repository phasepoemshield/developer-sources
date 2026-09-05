/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadResourceBudget;

public class LimitedResourceBudget
implements UploadResourceBudget {
    private long duration;
    private long size;

    @Override
    public void consume(long l, long l2) {
        this.duration -= l;
        this.size -= l2;
    }

    @Override
    public boolean isAvailable() {
        return this.duration > 0L && this.size > 0L;
    }

    public LimitedResourceBudget(long l, long l2) {
        this.duration = l;
        this.size = l2;
    }
}

