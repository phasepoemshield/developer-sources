/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas
 */
package net.fabricmc.fabric.api.renderer.v1.sprite;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface SpriteFinderGetter {
    public SpriteFinder spriteFinder(QuadAtlas var1);
}

