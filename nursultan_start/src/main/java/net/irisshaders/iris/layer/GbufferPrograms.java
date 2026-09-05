/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.state.StateUpdateNotifiers
 *  net.irisshaders.iris.pipeline.WorldRenderingPhase
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 */
package net.irisshaders.iris.layer;

import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.state.StateUpdateNotifiers;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;

public class GbufferPrograms {
    private static boolean entities;
    private static boolean blockEntities;
    private static boolean outline;
    private static Runnable phaseChangeListener;
    private static Runnable fallbackEntityListener;

    public static void setOverridePhase(WorldRenderingPhase worldRenderingPhase) {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline != null) {
            worldRenderingPipeline.setOverridePhase(worldRenderingPhase);
        }
    }

    static {
        StateUpdateNotifiers.phaseChangeNotifier = runnable -> {
            phaseChangeListener = runnable;
        };
        StateUpdateNotifiers.fallbackEntityNotifier = runnable -> {
            fallbackEntityListener = runnable;
        };
    }

    public static void init() {
    }

    public static void beginEntities() {
        GbufferPrograms.checkReentrancy();
        GbufferPrograms.setPhase(WorldRenderingPhase.ENTITIES);
        entities = true;
    }

    public static WorldRenderingPhase getCurrentPhase() {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline != null) {
            return worldRenderingPipeline.getPhase();
        }
        return WorldRenderingPhase.NONE;
    }

    public static void endBlockEntities() {
        if (!blockEntities) {
            throw new IllegalStateException("GbufferPrograms in weird state, tried to call endBlockEntities when blockEntities = false");
        }
        GbufferPrograms.setPhase(WorldRenderingPhase.NONE);
        blockEntities = false;
    }

    private static void checkReentrancy() {
        if (entities || blockEntities || outline) {
            throw new IllegalStateException("GbufferPrograms in weird state, tried to call begin function when entities = " + entities + ", blockEntities = " + blockEntities + ", outline = " + outline);
        }
    }

    public static void endEntities() {
        if (!entities) {
            throw new IllegalStateException("GbufferPrograms in weird state, tried to call endEntities when entities = false");
        }
        GbufferPrograms.setPhase(WorldRenderingPhase.NONE);
        entities = false;
    }

    public static void beginOutline() {
        GbufferPrograms.checkReentrancy();
        GbufferPrograms.setPhase(WorldRenderingPhase.OUTLINE);
        outline = true;
    }

    public static void beginBlockEntities() {
        GbufferPrograms.checkReentrancy();
        GbufferPrograms.setPhase(WorldRenderingPhase.BLOCK_ENTITIES);
        blockEntities = true;
    }

    private static void setPhase(WorldRenderingPhase worldRenderingPhase) {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline != null) {
            worldRenderingPipeline.setPhase(worldRenderingPhase);
        }
    }

    public static void runFallbackEntityListener() {
        if (fallbackEntityListener != null) {
            fallbackEntityListener.run();
        }
    }

    public static void runPhaseChangeNotifier() {
        if (phaseChangeListener != null) {
            phaseChangeListener.run();
        }
    }

    public static void endOutline() {
        if (!outline) {
            throw new IllegalStateException("GbufferPrograms in weird state, tried to call endOutline when outline = false");
        }
        GbufferPrograms.setPhase(WorldRenderingPhase.NONE);
        outline = false;
    }
}

