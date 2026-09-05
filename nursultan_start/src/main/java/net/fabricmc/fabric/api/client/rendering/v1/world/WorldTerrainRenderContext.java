/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08760
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1.world;

import minecraft.class08760;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext;

@Environment(value=EnvType.CLIENT)
public interface WorldTerrainRenderContext
extends AbstractWorldRenderContext {
    public class08760 sectionState();
}

