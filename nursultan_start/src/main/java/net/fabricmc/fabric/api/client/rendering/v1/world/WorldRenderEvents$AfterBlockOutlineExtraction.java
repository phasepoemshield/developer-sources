/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07089
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.rendering.v1.world;

import minecraft.class07089;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldExtractionContext;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface WorldRenderEvents$AfterBlockOutlineExtraction {
    public void afterBlockOutlineExtraction(WorldExtractionContext var1, @Nullable class07089 var2);
}

