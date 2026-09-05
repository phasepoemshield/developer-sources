/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

public interface Estimator$DataBatch<TBatchPoint> {
    public void reset();

    public void addDataPoint(TBatchPoint var1);
}

