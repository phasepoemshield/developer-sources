/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  minecraft.class01894
 *  minecraft.class01991
 *  minecraft.class08388
 *  net.irisshaders.iris.mixin.texture.TextureAtlasSpriteAccessor
 */
package net.irisshaders.iris.pbr.loader;

import com.mojang.blaze3d.textures.GpuTexture;
import minecraft.class01894;
import minecraft.class01991;
import minecraft.class08388;
import net.irisshaders.iris.mixin.texture.TextureAtlasSpriteAccessor;
import net.irisshaders.iris.pbr.loader.AtlasPBRLoader$PBRSpriteContents;

public class AtlasPBRLoader$PBRTextureAtlasSprite
extends class08388 {
    protected final class08388 baseSprite;
    private class01991 pbrContents;

    protected AtlasPBRLoader$PBRTextureAtlasSprite(class01894 class018942, AtlasPBRLoader$PBRSpriteContents atlasPBRLoader$PBRSpriteContents, int n, int n2, int n3, int n4, class08388 class083882) {
        super(class018942, (class01991)atlasPBRLoader$PBRSpriteContents, n, n2, n3, n4, ((TextureAtlasSpriteAccessor)class083882).getPadding());
        this.baseSprite = class083882;
        this.pbrContents = atlasPBRLoader$PBRSpriteContents;
    }

    public void method_4584(GpuTexture gpuTexture, int n) {
        this.pbrContents.method_45809(gpuTexture, n);
    }

    public class08388 getBaseSprite() {
        return this.baseSprite;
    }
}

