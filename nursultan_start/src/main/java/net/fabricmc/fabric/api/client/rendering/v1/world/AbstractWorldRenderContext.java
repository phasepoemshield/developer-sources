/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03063
 *  minecraft.class03386
 *  minecraft.class05932
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1.world;

import minecraft.class03063;
import minecraft.class03386;
import minecraft.class05932;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface AbstractWorldRenderContext {
    public class05932 worldState();

    public class03063 worldRenderer();

    public class03386 gameRenderer();
}

