/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation;

import java.util.Map;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.ExpDecayLinear2DEstimator;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.estimation.UploadDurationEstimator$VoidKeyMap;

public class UploadDurationEstimator
extends ExpDecayLinear2DEstimator<Void> {
    public static final double NEW_DATA_RATIO = 0.05;
    public static final int INITIAL_SAMPLE_TARGET = 100;
    public static final int MIN_BATCH_SIZE = 100;
    private static final long INITIAL_UPLOAD_TIME_ESTIMATE = 100000L;

    public UploadDurationEstimator() {
        super(0.05, 100, 100, 100000L);
    }

    protected <T> Map<Void, T> createMap() {
        return new UploadDurationEstimator$VoidKeyMap();
    }

    public long estimateUploadDuration(long l) {
        return (Long)this.predict(null, l);
    }
}

