/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08931
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.Renderer
 *  net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter
 */
package net.fabricmc.fabric.api.renderer.v1.render;

import minecraft.class08931;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.Renderer;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;

@Environment(value=EnvType.CLIENT)
public interface FabricLayerRenderState {
    default public QuadEmitter emitter() {
        return Renderer.get().getLayerRenderStateEmitter((class08931)this);
    }

    default public void setRenderTypeGetter(ItemRenderTypeGetter itemRenderTypeGetter) {
        Renderer.get().setLayerRenderTypeGetter((class08931)this, itemRenderTypeGetter);
    }
}

