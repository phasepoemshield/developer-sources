/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$LinearRegressionBatch
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator;

public class ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch<C>
extends Abstract2DLinearEstimator.LinearRegressionBatch<C> {
    boolean deferredClear = false;

    protected ExpDecayLinear2DEstimator$ClearingLinearRegressionBatch() {
    }

    public void reset() {
        if (!this.deferredClear) {
            this.clear();
        }
        this.deferredClear = false;
    }

    boolean checkUpdateDefer(int n) {
        if (this.size() < n) {
            this.deferredClear = true;
            return true;
        }
        return false;
    }
}

