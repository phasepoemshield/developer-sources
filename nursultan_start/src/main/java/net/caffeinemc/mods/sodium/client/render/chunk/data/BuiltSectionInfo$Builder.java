/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class00394
 *  minecraft.class03476
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.chunk.data;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import minecraft.class00394;
import minecraft.class03476;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import org.jspecify.annotations.NonNull;

public class BuiltSectionInfo$Builder {
    private final List<TerrainRenderPass> blockRenderPasses = new ArrayList<TerrainRenderPass>();
    private final List<class00394> globalBlockEntities = new ArrayList<class00394>();
    private final List<class00394> culledBlockEntities = new ArrayList<class00394>();
    private final Set<class08388> animatedSprites = new ObjectOpenHashSet();
    private class03476 occlusionData;

    public BuiltSectionInfo build() {
        return new BuiltSectionInfo(this.blockRenderPasses, this.globalBlockEntities, this.culledBlockEntities, this.animatedSprites, this.occlusionData);
    }

    public void addRenderPass(TerrainRenderPass terrainRenderPass) {
        this.blockRenderPasses.add(terrainRenderPass);
    }

    public void setOcclusionData(class03476 class034762) {
        this.occlusionData = class034762;
    }

    public void addSprite(@NonNull class08388 class083882) {
        if (SpriteUtil.INSTANCE.hasAnimation(class083882)) {
            this.animatedSprites.add(class083882);
        }
    }

    public void addBlockEntity(class00394 class003942, boolean bl) {
        (bl ? this.culledBlockEntities : this.globalBlockEntities).add(class003942);
    }
}

