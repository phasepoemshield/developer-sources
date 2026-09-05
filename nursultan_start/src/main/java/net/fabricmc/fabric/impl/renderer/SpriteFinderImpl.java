/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class08388
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 *  net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.renderer;

import java.util.Map;
import minecraft.class01894;
import minecraft.class08388;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.model.SpriteFinder;
import net.fabricmc.fabric.impl.renderer.SpriteFinderImpl$Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class SpriteFinderImpl
implements SpriteFinder {
    static final Logger LOGGER = LoggerFactory.getLogger(SpriteFinderImpl.class);
    private final SpriteFinderImpl$Node root = new SpriteFinderImpl$Node(this, 0.5f, 0.5f, 0.25f);
    final class08388 missingSprite;
    int badSpriteCount = 0;

    public SpriteFinderImpl(Map<class01894, class08388> map, class08388 class083882) {
        this.missingSprite = class083882;
        map.values().forEach(this.root::add);
    }

    public class08388 find(QuadView quadView) {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < 4; ++i) {
            f += quadView.u(i);
            f2 += quadView.v(i);
        }
        return this.find(f * 0.25f, f2 * 0.25f);
    }

    public class08388 find(float f, float f2) {
        return this.root.find(f, f2);
    }
}

