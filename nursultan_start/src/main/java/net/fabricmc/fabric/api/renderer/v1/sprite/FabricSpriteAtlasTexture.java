/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.sprite;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;

@Environment(value=EnvType.CLIENT)
public interface FabricSpriteAtlasTexture {
    default public SpriteFinder spriteFinder() {
        throw new UnsupportedOperationException();
    }
}

