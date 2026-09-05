/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Average1DEstimator$Average;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Average1DEstimator$Value;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Average1DEstimator$ValueBatch;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator;

public abstract class Average1DEstimator<C>
extends Estimator<C, Average1DEstimator$Value<C>, Average1DEstimator$ValueBatch<C>, Void, Long, Average1DEstimator$Average<C>> {
    private final double newDataRatio;
    private final long initialEstimate;

    public Average1DEstimator(double d, long l) {
        this.newDataRatio = d;
        this.initialEstimate = l;
    }

    public Long predict(C c) {
        return (Long)super.predict(c, null);
    }

    @Override
    protected Average1DEstimator$ValueBatch<C> createNewDataBatch() {
        return new Average1DEstimator$ValueBatch();
    }

    @Override
    protected Average1DEstimator$Average<C> createNewModel() {
        return new Average1DEstimator$Average(this.newDataRatio, this.initialEstimate);
    }
}

