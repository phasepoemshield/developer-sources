/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class04688
 *  minecraft.class05885
 *  minecraft.class08743
 */
package net.caffeinemc.mods.sodium.client.render.chunk.terrain.material;

import minecraft.class00500;
import minecraft.class04688;
import minecraft.class05885;
import minecraft.class08743;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.parameters.AlphaCutoffParameter;

public class DefaultMaterials {
    public static final Material SOLID = new Material(DefaultTerrainRenderPasses.SOLID, AlphaCutoffParameter.ZERO, true);
    public static final Material CUTOUT_MIPPED = new Material(DefaultTerrainRenderPasses.CUTOUT, AlphaCutoffParameter.HALF, true);
    public static final Material TRANSLUCENT = new Material(DefaultTerrainRenderPasses.TRANSLUCENT, AlphaCutoffParameter.TINY, true);
    public static final Material TRIPWIRE = new Material(DefaultTerrainRenderPasses.TRANSLUCENT, AlphaCutoffParameter.TINY, true);

    public static Material forChunkLayer(class08743 class087432) {
        return switch (class087432) {
            default -> throw new MatchException(null, null);
            case class08743.field_60923 -> SOLID;
            case class08743.field_60925 -> CUTOUT_MIPPED;
            case class08743.field_60926 -> TRANSLUCENT;
            case class08743.field_60927 -> TRIPWIRE;
        };
    }

    public static Material forBlockState(class00500 class005002) {
        return DefaultMaterials.forChunkLayer(class05885.N((class00500)class005002));
    }

    public static Material forFluidState(class04688 class046882) {
        return DefaultMaterials.forChunkLayer(class05885.N((class04688)class046882));
    }
}

