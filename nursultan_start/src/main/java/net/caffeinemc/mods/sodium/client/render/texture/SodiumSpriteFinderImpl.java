/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.render.texture;

import java.util.Map;
import minecraft.class01894;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.model.SodiumQuadAtlas;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinder;
import net.caffeinemc.mods.sodium.client.render.texture.SodiumSpriteFinderImpl$Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SodiumSpriteFinderImpl
implements SodiumSpriteFinder {
    static final Logger LOGGER = LoggerFactory.getLogger(SodiumSpriteFinderImpl.class);
    private final SodiumSpriteFinderImpl$Node root = new SodiumSpriteFinderImpl$Node(this, 0.5f, 0.5f, 0.25f);
    final class08388 missingSprite;
    private final SodiumQuadAtlas atlas;
    int badSpriteCount = 0;

    public SodiumSpriteFinderImpl(Map<class01894, class08388> map, class08388 class083882, SodiumQuadAtlas sodiumQuadAtlas) {
        this.missingSprite = class083882;
        this.atlas = sodiumQuadAtlas;
        map.values().forEach(this.root::add);
    }

    @Override
    public class08388 find(ModelQuadView modelQuadView) {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < 4; ++i) {
            f += modelQuadView.getTexU(i);
            f2 += modelQuadView.getTexV(i);
        }
        return this.find(f * 0.25f, f2 * 0.25f);
    }

    @Override
    public class08388 find(float f, float f2) {
        return this.root.find(f, f2);
    }

    @Override
    public SodiumQuadAtlas getAtlas() {
        return this.atlas;
    }
}

