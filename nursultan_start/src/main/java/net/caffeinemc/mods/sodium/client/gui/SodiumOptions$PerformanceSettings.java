/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.DeferMode
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode
 */
package net.caffeinemc.mods.sodium.client.gui;

import net.caffeinemc.mods.sodium.client.render.chunk.DeferMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode;

public class SodiumOptions$PerformanceSettings {
    public int chunkBuilderThreads = 0;
    public DeferMode chunkBuildDeferMode = DeferMode.ALWAYS;
    public boolean animateOnlyVisibleTextures = true;
    public boolean useEntityCulling = true;
    public boolean useFogOcclusion = true;
    public boolean useBlockFaceCulling = true;
    public boolean useNoErrorGLContext = true;
    public QuadSplittingMode quadSplittingMode = QuadSplittingMode.SAFE;
}

