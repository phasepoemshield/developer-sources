/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

public interface Estimator$Model<TModelInput, TModelOutput, TModelBatch> {
    public void update(TModelBatch var1);

    public TModelOutput predict(TModelInput var1);
}

