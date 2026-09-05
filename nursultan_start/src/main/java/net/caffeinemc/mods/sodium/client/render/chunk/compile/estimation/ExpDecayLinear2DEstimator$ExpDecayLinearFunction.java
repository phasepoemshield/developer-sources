/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$DataPair
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$LinearFunction
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch;

public class ExpDecayLinear2DEstimator$ExpDecayLinearFunction<C>
extends Abstract2DLinearEstimator.LinearFunction<C, ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch<C>> {
    private final double newDataRatioInv;
    private final int initialSampleTarget;
    private final int minBatchSize;
    private double xMeanOld = 0.0;
    private double yMeanOld = 0.0;
    private double covarianceOld = 0.0;
    private double varianceOld = 0.0;

    public ExpDecayLinear2DEstimator$ExpDecayLinearFunction(double d, int n, int n2, long l) {
        super(l);
        this.newDataRatioInv = 1.0 / d;
        this.initialSampleTarget = n;
        this.minBatchSize = n2;
    }

    public void update(ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch<C> expDecayLinear2DEstimator$ClearingLinearRegressionBatch) {
        double d;
        double d2;
        if (expDecayLinear2DEstimator$ClearingLinearRegressionBatch.isEmpty() || expDecayLinear2DEstimator$ClearingLinearRegressionBatch.checkUpdateDefer(this.minBatchSize)) {
            return;
        }
        int n = expDecayLinear2DEstimator$ClearingLinearRegressionBatch.size();
        int n2 = this.gatheredSamples + n;
        if (n2 <= this.initialSampleTarget) {
            d2 = n2;
            d = this.gatheredSamples;
            this.gatheredSamples = n2;
        } else {
            d = (double)n * this.newDataRatioInv - (double)n;
            d2 = d + (double)n;
        }
        double d3 = 1.0 / d2;
        long l = 0L;
        long l2 = 0L;
        ObjectListIterator objectListIterator = expDecayLinear2DEstimator$ClearingLinearRegressionBatch.iterator();
        while (objectListIterator.hasNext()) {
            Abstract2DLinearEstimator.DataPair dataPair = (Abstract2DLinearEstimator.DataPair)objectListIterator.next();
            l += dataPair.x();
            l2 += dataPair.y();
        }
        double d4 = (this.xMeanOld * d + (double)l) * d3;
        double d5 = (this.yMeanOld * d + (double)l2) * d3;
        double d6 = 0.0;
        double d7 = 0.0;
        ObjectListIterator objectListIterator2 = expDecayLinear2DEstimator$ClearingLinearRegressionBatch.iterator();
        while (objectListIterator2.hasNext()) {
            Abstract2DLinearEstimator.DataPair dataPair = (Abstract2DLinearEstimator.DataPair)objectListIterator2.next();
            double d8 = (double)dataPair.x() - d4;
            double d9 = (double)dataPair.y() - d5;
            d6 += d8 * d9;
            d7 += d8 * d8;
        }
        if (Math.abs(d7) <= Double.MIN_NORMAL) {
            return;
        }
        this.slope = Math.max(0.0, (d6 += this.covarianceOld * d) / (d7 += this.varianceOld * d));
        this.yIntercept = d5 - this.slope * d4;
        this.xMeanOld = d4;
        this.yMeanOld = d5;
        this.covarianceOld = d6 * d3;
        this.varianceOld = d7 * d3;
    }
}

