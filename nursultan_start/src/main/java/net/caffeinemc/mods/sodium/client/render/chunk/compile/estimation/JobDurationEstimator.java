/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceArrayMap
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceArrayMap;
import java.util.Map;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.ExpDecayLinear2DEstimator;

public class JobDurationEstimator
extends ExpDecayLinear2DEstimator<Class<?>> {
    public static final int INITIAL_SAMPLE_TARGET = 100;
    public static final double NEW_DATA_RATIO = 0.05;
    private static final int MIN_BATCH_SIZE = 40;
    private static final long INITIAL_JOB_DURATION_ESTIMATE = 5000000L;

    public JobDurationEstimator() {
        super(0.05, 100, 40, 5000000L);
    }

    protected <T> Map<Class<?>, T> createMap() {
        return new Reference2ReferenceArrayMap();
    }

    public long estimateJobDuration(Class<?> clazz, long l) {
        return (Long)this.predict(clazz, l);
    }
}

