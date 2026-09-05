/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06078
 *  minecraft.class06249
 *  minecraft.class08800
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class06078;
import minecraft.class06249;
import minecraft.class08800;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface LivingEntityFeatureRendererRegistrationCallback$RegistrationHelper {
    public <T extends class08800> void register(class06249<T, ? extends class06078<T>> var1);
}

