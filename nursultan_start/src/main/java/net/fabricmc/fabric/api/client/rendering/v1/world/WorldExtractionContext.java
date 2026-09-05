/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01383
 *  minecraft.class02233
 *  minecraft.class03448
 *  minecraft.class05363
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.joml.Matrix4fc
 */
package net.fabricmc.fabric.api.client.rendering.v1.world;

import minecraft.class01383;
import minecraft.class02233;
import minecraft.class03448;
import minecraft.class05363;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.AbstractWorldRenderContext;
import org.joml.Matrix4fc;

@Environment(value=EnvType.CLIENT)
public interface WorldExtractionContext
extends AbstractWorldRenderContext {
    public class01383 frustum();

    public class05363 camera();

    public class03448 world();

    public Matrix4fc cullProjectionMatrix();

    public Matrix4fc viewMatrix();

    public boolean blockOutlines();

    public class02233 tickCounter();
}

