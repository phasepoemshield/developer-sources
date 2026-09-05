/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$DataPair
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator;

public record UploadDuration(long uploadDuration, long size) implements Abstract2DLinearEstimator.DataPair<Void>
{
    public long x() {
        return this.size;
    }

    public long y() {
        return this.uploadDuration;
    }

    public Void category() {
        return null;
    }
}

