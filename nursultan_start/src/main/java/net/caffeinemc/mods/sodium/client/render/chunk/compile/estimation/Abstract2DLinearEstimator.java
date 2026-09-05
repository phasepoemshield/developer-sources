/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$DataBatch
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$DataPair;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Abstract2DLinearEstimator$LinearFunction;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator;

public abstract class Abstract2DLinearEstimator<C, TBatch extends Estimator.DataBatch<Abstract2DLinearEstimator$DataPair<C>>, TModel extends Abstract2DLinearEstimator$LinearFunction<C, TBatch>>
extends Estimator<C, Abstract2DLinearEstimator$DataPair<C>, TBatch, Long, Long, TModel> {
    protected final long initialOutput;

    public Abstract2DLinearEstimator(long l) {
        this.initialOutput = l;
    }
}

