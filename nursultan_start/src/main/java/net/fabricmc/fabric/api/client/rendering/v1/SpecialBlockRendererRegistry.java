/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00335
 *  minecraft.class00891
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.SpecialBlockRendererRegistryImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import minecraft.class00335;
import minecraft.class00891;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.SpecialBlockRendererRegistryImpl;

@Environment(value=EnvType.CLIENT)
public final class SpecialBlockRendererRegistry {
    private SpecialBlockRendererRegistry() {
    }

    public static void register(class00891 class008912, class00335 class003352) {
        SpecialBlockRendererRegistryImpl.register((class00891)class008912, (class00335)class003352);
    }
}

