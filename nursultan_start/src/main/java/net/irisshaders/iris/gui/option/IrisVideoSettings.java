/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class04344
 *  minecraft.class04355
 *  minecraft.class04363
 *  minecraft.class04369
 *  minecraft.class04370
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pathways.colorspace.ColorSpace
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 */
package net.irisshaders.iris.gui.option;

import java.io.IOException;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class04344;
import minecraft.class04355;
import minecraft.class04363;
import minecraft.class04369;
import minecraft.class04370;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.option.ShadowDistanceOption;
import net.irisshaders.iris.pathways.colorspace.ColorSpace;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;

public class IrisVideoSettings {
    private static final class04141 DISABLED_TOOLTIP = class04141.N((class00392)class00392.L((String)"options.iris.shadowDistance.disabled"));
    private static final class04141 ENABLED_TOOLTIP = class04141.N((class00392)class00392.L((String)"options.iris.shadowDistance.enabled"));
    public static int shadowDistance = 32;
    public static ColorSpace colorSpace = ColorSpace.SRGB;
    public static final class04370<Integer> RENDER_DISTANCE = new ShadowDistanceOption<Integer>("options.iris.shadowDistance", (class04355<Integer>)((class04355)n -> {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        class04141 class041412 = worldRenderingPipeline != null ? (worldRenderingPipeline.getForcedShadowRenderDistanceChunksForDisplay().isPresent() ? DISABLED_TOOLTIP : ENABLED_TOOLTIP) : ENABLED_TOOLTIP;
        return class041412;
    }), (class04363<Integer>)((class04363)(class003922, n) -> {
        WorldRenderingPipeline worldRenderingPipeline = Iris.getPipelineManager().getPipelineNullable();
        if (worldRenderingPipeline != null) {
            n = worldRenderingPipeline.getForcedShadowRenderDistanceChunksForDisplay().orElse((int)n);
        }
        if ((double)n.intValue() <= 0.0) {
            return class00392.N((String)"options.generic_value", (Object[])new Object[]{class00392.L((String)"options.iris.shadowDistance"), "0 (disabled)"});
        }
        return class00392.N((String)"options.generic_value", (Object[])new Object[]{class00392.L((String)"options.iris.shadowDistance"), class00392.N((String)"options.chunks", (Object[])new Object[]{n})});
    }), (class04344<Integer>)new class04369(0, 32), IrisVideoSettings.getOverriddenShadowDistance(shadowDistance), n -> {
        shadowDistance = n;
        try {
            Iris.getIrisConfig().save();
        }
        catch (IOException iOException) {
            Iris.logger.fatal("Failed to save config!", (Throwable)iOException);
        }
    });

    public static boolean isShadowDistanceSliderEnabled() {
        return Iris.getPipelineManager().getPipeline().map(worldRenderingPipeline -> worldRenderingPipeline.getForcedShadowRenderDistanceChunksForDisplay().isEmpty()).orElse(true);
    }

    public static int getOverriddenShadowDistance(int n) {
        return (Integer)Iris.getPipelineManager().getPipeline().map(worldRenderingPipeline -> worldRenderingPipeline.getForcedShadowRenderDistanceChunksForDisplay().orElse(n)).orElse(n);
    }
}

