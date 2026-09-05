/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.FabricRenderCommandQueue
 */
package net.fabricmc.fabric.mixin.renderer.client.block.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.FabricRenderCommandQueue;

@Environment(value=EnvType.CLIENT)
public interface OrderedSubmitNodeCollectorMixin
extends FabricRenderCommandQueue {
}

