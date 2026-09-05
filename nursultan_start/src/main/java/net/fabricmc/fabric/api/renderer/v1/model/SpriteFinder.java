/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08388
 *  minecraft.class08626
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadView
 */
package net.fabricmc.fabric.api.renderer.v1.model;

import minecraft.class08388;
import minecraft.class08626;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;

@Environment(value=EnvType.CLIENT)
public interface SpriteFinder {
    @Deprecated
    public static SpriteFinder get(class08626 class086262) {
        return class086262.spriteFinder();
    }

    @Deprecated
    default public class08388 find(QuadView quadView, int n) {
        return this.find(quadView);
    }

    public class08388 find(QuadView var1);

    public class08388 find(float var1, float var2);
}

