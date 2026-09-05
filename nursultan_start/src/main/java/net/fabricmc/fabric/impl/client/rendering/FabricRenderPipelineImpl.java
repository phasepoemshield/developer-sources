/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline
 */
package net.fabricmc.fabric.impl.client.rendering;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderPipeline;

@Environment(value=EnvType.CLIENT)
public interface FabricRenderPipelineImpl
extends FabricRenderPipeline {
    public void fabric$setUsePipelineDrawModeForGuiSetter(boolean var1);
}

