/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import java.util.Locale;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Average1DEstimator$ValueBatch;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$Model;
import net.caffeinemc.mods.sodium.client.util.MathUtil;

public class Average1DEstimator$Average<C>
implements Estimator$Model<Void, Long, Average1DEstimator$ValueBatch<C>> {
    private final double newDataRatio;
    private boolean hasRealData = false;
    private double average;

    public Average1DEstimator$Average(double d, double d2) {
        this.average = d2;
        this.newDataRatio = d;
    }

    public String toString() {
        return String.format(Locale.US, "%.0f", this.average);
    }

    @Override
    public void update(Average1DEstimator$ValueBatch<C> average1DEstimator$ValueBatch) {
        if (average1DEstimator$ValueBatch.count > 0L) {
            if (this.hasRealData) {
                this.average = MathUtil.exponentialMovingAverage((double)this.average, (double)average1DEstimator$ValueBatch.getAverage(), (double)this.newDataRatio);
            } else {
                this.average = average1DEstimator$ValueBatch.getAverage();
                this.hasRealData = true;
            }
        }
    }

    @Override
    public Long predict(Void void_) {
        return (long)this.average;
    }
}

