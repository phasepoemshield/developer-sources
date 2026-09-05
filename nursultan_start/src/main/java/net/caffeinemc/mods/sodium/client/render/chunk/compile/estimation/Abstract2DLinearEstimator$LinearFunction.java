/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$DataBatch
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$Model
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import java.util.Locale;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$DataPair;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator;

public abstract class Abstract2DLinearEstimator$LinearFunction<C, TBatch extends Estimator.DataBatch<Abstract2DLinearEstimator$DataPair<C>>>
implements Estimator.Model<Long, Long, TBatch> {
    protected final long initialOutput;
    protected double yIntercept;
    protected double slope;
    protected int gatheredSamples = 0;

    public Abstract2DLinearEstimator$LinearFunction(long l) {
        this.initialOutput = l;
    }

    public String toString() {
        return String.format(Locale.US, "s=%.2f,y=%.0f", this.slope, this.yIntercept);
    }

    public Long predict(Long l) {
        if (this.gatheredSamples == 0) {
            return this.initialOutput;
        }
        return (long)(this.yIntercept + this.slope * (double)l.longValue());
    }
}

