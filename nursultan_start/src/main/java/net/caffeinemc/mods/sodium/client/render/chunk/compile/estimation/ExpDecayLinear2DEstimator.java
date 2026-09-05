/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.ExpDecayLinear2DEstimator$ExpDecayLinearFunction;

public abstract class ExpDecayLinear2DEstimator<C>
extends Abstract2DLinearEstimator<C, ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch<C>, ExpDecayLinear2DEstimator$ExpDecayLinearFunction<C>> {
    private final double newDataRatio;
    private final int initialSampleTarget;
    private final int minBatchSize;

    public ExpDecayLinear2DEstimator(double d, int n, int n2, long l) {
        super(l);
        this.newDataRatio = d;
        this.initialSampleTarget = n;
        this.minBatchSize = n2;
    }

    protected ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch<C> createNewDataBatch() {
        return new ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch();
    }

    protected ExpDecayLinear2DEstimator$ExpDecayLinearFunction<C> createNewModel() {
        return new ExpDecayLinear2DEstimator$ExpDecayLinearFunction(this.newDataRatio, this.initialSampleTarget, this.minBatchSize, this.initialOutput);
    }
}

