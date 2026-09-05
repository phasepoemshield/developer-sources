/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$DataBatch
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$DataPair;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator;

public abstract class Abstract2DLinearEstimator$LinearRegressionBatch<C>
extends ObjectArrayList<Abstract2DLinearEstimator$DataPair<C>>
implements Estimator.DataBatch<Abstract2DLinearEstimator$DataPair<C>> {
    protected Abstract2DLinearEstimator$LinearRegressionBatch() {
    }

    public void addDataPoint(Abstract2DLinearEstimator$DataPair<C> abstract2DLinearEstimator$DataPair) {
        this.add(abstract2DLinearEstimator$DataPair);
    }
}

