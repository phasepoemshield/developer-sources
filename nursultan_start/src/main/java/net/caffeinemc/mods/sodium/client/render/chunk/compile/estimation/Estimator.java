/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import java.util.Map;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$DataBatch;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$DataPoint;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.Estimator$Model;

public abstract class Estimator<TCategory, TPoint extends Estimator$DataPoint<TCategory>, TBatch extends Estimator$DataBatch<TPoint>, TInput, TOutput, TModel extends Estimator$Model<TInput, TOutput, TBatch>> {
    protected final Map<TCategory, TModel> models = this.createMap();
    protected final Map<TCategory, TBatch> batches = this.createMap();

    public String toString(TCategory TCategory) {
        Estimator$Model estimator$Model = (Estimator$Model)this.models.get(TCategory);
        if (estimator$Model == null) {
            return "-";
        }
        return estimator$Model.toString();
    }

    protected abstract <T> Map<TCategory, T> createMap();

    public TOutput predict(TCategory TCategory, TInput TInput) {
        return (TOutput)this.ensureModel(TCategory).predict(TInput);
    }

    public void updateModels() {
        this.batches.forEach((object, estimator$DataBatch) -> {
            this.ensureModel(object).update((Estimator$DataBatch)estimator$DataBatch);
            estimator$DataBatch.reset();
        });
    }

    protected abstract TBatch createNewDataBatch();

    protected abstract TModel createNewModel();

    private TModel ensureModel(TCategory TCategory) {
        Estimator$Model estimator$Model = (Estimator$Model)this.models.get(TCategory);
        if (estimator$Model == null) {
            estimator$Model = this.createNewModel();
            this.models.put(TCategory, estimator$Model);
        }
        return (TModel)estimator$Model;
    }

    public void addData(TPoint TPoint) {
        Object TPointCategory = TPoint.category();
        Estimator$DataBatch<Object> estimator$DataBatch = (Estimator$DataBatch)this.batches.get(TPointCategory);
        if (estimator$DataBatch == null) {
            estimator$DataBatch = this.createNewDataBatch();
            this.batches.put(TPointCategory, estimator$DataBatch);
        }
        estimator$DataBatch.addDataPoint(TPoint);
    }
}

