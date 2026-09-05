/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.indigo.renderer.render.TerrainRenderContext
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.accessor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.render.TerrainRenderContext;

@Environment(value=EnvType.CLIENT)
public interface AccessChunkRendererRegion {
    public void fabric_setRenderer(TerrainRenderContext var1);

    public TerrainRenderContext fabric_getRenderer();
}

