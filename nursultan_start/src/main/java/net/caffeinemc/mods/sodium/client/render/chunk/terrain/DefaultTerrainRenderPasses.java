/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08743
 */
package net.caffeinemc.mods.sodium.client.render.chunk.terrain;

import minecraft.class08743;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;

public class DefaultTerrainRenderPasses {
    public static final TerrainRenderPass SOLID = new TerrainRenderPass(class08743.field_60923, false, false);
    public static final TerrainRenderPass CUTOUT = new TerrainRenderPass(class08743.field_60925, false, true);
    public static final TerrainRenderPass TRANSLUCENT = new TerrainRenderPass(class08743.field_60926, true, true);
    public static final TerrainRenderPass[] ALL = new TerrainRenderPass[]{SOLID, CUTOUT, TRANSLUCENT};
}

