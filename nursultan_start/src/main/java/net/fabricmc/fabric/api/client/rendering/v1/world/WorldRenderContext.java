/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01407
 *  minecraft.class01421
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1.world;

import minecraft.class01237;
import minecraft.class01407;
import minecraft.class01421;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldTerrainRenderContext;

@Environment(value=EnvType.CLIENT)
public interface WorldRenderContext
extends WorldTerrainRenderContext {
    public class01421 matrices();

    public class01407 consumers();

    public class01237 commandQueue();
}

