/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface FabricRenderPipeline {
    default public boolean usePipelineDrawModeForGui() {
        throw new AssertionError((Object)"Implemented in Mixin");
    }
}

