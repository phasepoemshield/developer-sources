/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01999
 *  minecraft.class02020
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class08887
 *  minecraft.class08931
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider
 *  net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter
 *  net.fabricmc.fabric.impl.renderer.RendererManager
 */
package net.fabricmc.fabric.api.renderer.v1;

import minecraft.class00500;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01999;
import minecraft.class02020;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class08887;
import minecraft.class08931;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableMesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.BlockVertexConsumerProvider;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import net.fabricmc.fabric.impl.renderer.RendererManager;

@Environment(value=EnvType.CLIENT)
public interface Renderer {
    public static Renderer get() {
        return RendererManager.getRenderer();
    }

    public static void register(Renderer renderer) {
        RendererManager.registerRenderer((Renderer)renderer);
    }

    public void render(class02020 var1, class07295 var2, class08887 var3, class00500 var4, class07209 var5, class01421 var6, BlockVertexConsumerProvider var7, boolean var8, long var9, int var11);

    public void render(class01423 var1, BlockVertexConsumerProvider var2, class08887 var3, float var4, float var5, float var6, int var7, int var8, class07295 var9, class07209 var10, class00500 var11);

    public QuadEmitter getLayerRenderStateEmitter(class08931 var1);

    public void renderBlockAsEntity(class01999 var1, class00500 var2, class01421 var3, class01407 var4, int var5, int var6, class07295 var7, class07209 var8);

    public void setLayerRenderTypeGetter(class08931 var1, ItemRenderTypeGetter var2);

    public MutableMesh mutableMesh();
}

