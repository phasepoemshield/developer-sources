/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pipeline.WorldRenderingPhase
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 */
package net.irisshaders.iris.layer;

import net.irisshaders.iris.Iris;
import net.irisshaders.iris.layer.RenderingWrapper;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;

public class SetStateShard
implements RenderingWrapper {
    public static final RenderingWrapper SUN = new SetStateShard("iris_sun", WorldRenderingPhase.SUN);
    public static final RenderingWrapper SUNSET = new SetStateShard("iris_sunset", WorldRenderingPhase.SUNSET);
    public static final RenderingWrapper MOON = new SetStateShard("iris_moon", WorldRenderingPhase.MOON);
    private final WorldRenderingPhase name;

    public SetStateShard(String string, WorldRenderingPhase worldRenderingPhase) {
        this.name = worldRenderingPhase;
    }

    @Override
    public void clear() {
        Iris.getPipelineManager().getPipeline().ifPresent(worldRenderingPipeline -> worldRenderingPipeline.setPhase(WorldRenderingPhase.NONE));
    }

    @Override
    public void setup() {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline != null) {
            worldRenderingPipeline.setPhase(this.name);
        }
    }
}

