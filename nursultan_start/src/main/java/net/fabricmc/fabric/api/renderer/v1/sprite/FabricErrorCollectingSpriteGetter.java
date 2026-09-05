/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 */
package net.fabricmc.fabric.api.renderer.v1.sprite;

import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.api.renderer.v1.sprite.SpriteFinderGetter;

@Environment(value=EnvType.CLIENT)
public interface FabricErrorCollectingSpriteGetter
extends SpriteFinderGetter {
    default public SpriteFinder spriteFinder(class01894 class018942) {
        throw new UnsupportedOperationException();
    }

    @Override
    default public SpriteFinder spriteFinder(QuadAtlas quadAtlas) {
        return this.spriteFinder(quadAtlas.getTextureId());
    }
}

