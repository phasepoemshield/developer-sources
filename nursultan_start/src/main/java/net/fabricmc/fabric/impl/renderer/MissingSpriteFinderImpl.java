/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder
 */
package net.fabricmc.fabric.impl.renderer;

import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;

@Environment(value=EnvType.CLIENT)
public record MissingSpriteFinderImpl(class08388 missingSprite) implements SpriteFinder
{
    public class08388 find(QuadView quadView) {
        return this.missingSprite;
    }

    public class08388 find(float f, float f2) {
        return this.missingSprite;
    }
}

