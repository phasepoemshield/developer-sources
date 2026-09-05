/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01999
 *  minecraft.class07209
 *  minecraft.class07295
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.Renderer
 */
package net.fabricmc.fabric.api.renderer.v1.render;

import minecraft.class00500;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01999;
import minecraft.class07209;
import minecraft.class07295;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.Renderer;

@Environment(value=EnvType.CLIENT)
public interface FabricBlockRenderManager {
    default public void renderBlockAsEntity(class00500 class005002, class01421 class014212, class01407 class014072, int n, int n2, class07295 class072952, class07209 class072092) {
        Renderer.get().renderBlockAsEntity((class01999)this, class005002, class014212, class014072, n, n2, class072952, class072092);
    }
}

