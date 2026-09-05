/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.pipeline.programs;

import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.WorldRenderingPhase;
import net.irisshaders.iris.pipeline.programs.ShaderKey;

public class ShaderOverrides {
    public static ShaderKey getSkyShader(IrisRenderingPipeline irisRenderingPipeline) {
        if (ShaderOverrides.isSky(irisRenderingPipeline)) {
            return ShaderKey.SKY_BASIC;
        }
        return ShaderKey.BASIC;
    }

    public static ShaderKey getSkyTexShader(IrisRenderingPipeline irisRenderingPipeline) {
        if (ShaderOverrides.isSky(irisRenderingPipeline)) {
            return ShaderKey.SKY_TEXTURED;
        }
        return ShaderKey.TEXTURED;
    }

    public static ShaderKey getSkyColorShader(IrisRenderingPipeline irisRenderingPipeline) {
        if (ShaderOverrides.isSky(irisRenderingPipeline)) {
            return ShaderKey.SKY_BASIC_COLOR;
        }
        return ShaderKey.BASIC_COLOR;
    }

    public static boolean isBlockEntities(IrisRenderingPipeline irisRenderingPipeline) {
        return irisRenderingPipeline != null && irisRenderingPipeline.getPhase() == WorldRenderingPhase.BLOCK_ENTITIES;
    }

    public static ShaderKey getSkyTexColorShader(IrisRenderingPipeline irisRenderingPipeline) {
        if (ShaderOverrides.isSky(irisRenderingPipeline)) {
            return ShaderKey.SKY_TEXTURED_COLOR;
        }
        return ShaderKey.TEXTURED_COLOR;
    }

    public static boolean isSky(IrisRenderingPipeline irisRenderingPipeline) {
        if (irisRenderingPipeline != null) {
            return switch (irisRenderingPipeline.getPhase()) {
                case WorldRenderingPhase.CUSTOM_SKY, WorldRenderingPhase.SKY, WorldRenderingPhase.SUNSET, WorldRenderingPhase.SUN, WorldRenderingPhase.STARS, WorldRenderingPhase.VOID, WorldRenderingPhase.MOON -> true;
                default -> false;
            };
        }
        return false;
    }

    public static boolean isPhase(IrisRenderingPipeline irisRenderingPipeline, WorldRenderingPhase worldRenderingPhase) {
        if (irisRenderingPipeline != null) {
            return irisRenderingPipeline.getPhase() == worldRenderingPhase;
        }
        return false;
    }

    public static boolean isEntities(IrisRenderingPipeline irisRenderingPipeline) {
        return irisRenderingPipeline != null && irisRenderingPipeline.getPhase() == WorldRenderingPhase.ENTITIES;
    }
}

