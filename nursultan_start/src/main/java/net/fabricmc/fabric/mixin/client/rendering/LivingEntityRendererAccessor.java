/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class08476
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.client.rendering;

import minecraft.class06078;
import minecraft.class06249;
import minecraft.class08476;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface LivingEntityRendererAccessor<S extends class08476, M extends class06078<? super S>> {
    public boolean callAddFeature(class06249<S, M> var1);
}

