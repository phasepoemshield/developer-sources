/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1.world;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface WorldRenderEvents$EndExtraction {
    public void endExtraction(WorldExtractionContext var1);
}

