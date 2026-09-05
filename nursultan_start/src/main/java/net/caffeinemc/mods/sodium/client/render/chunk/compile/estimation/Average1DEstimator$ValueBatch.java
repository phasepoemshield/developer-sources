/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Average1DEstimator$Value;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$DataBatch;

public class Average1DEstimator$ValueBatch<BatchCategory>
implements Estimator$DataBatch<Average1DEstimator$Value<BatchCategory>> {
    private long valueSum;
    long count;

    protected Average1DEstimator$ValueBatch() {
    }

    @Override
    public void reset() {
        this.valueSum = 0L;
        this.count = 0L;
    }

    public double getAverage() {
        return (double)this.valueSum / (double)this.count;
    }

    @Override
    public void addDataPoint(Average1DEstimator$Value<BatchCategory> average1DEstimator$Value) {
        this.valueSum += average1DEstimator$Value.value();
        ++this.count;
    }
}

