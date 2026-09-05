/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class04233
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.AtlasSourceRegistryImpl
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class04233;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.AtlasSourceRegistryImpl;

@Environment(value=EnvType.CLIENT)
public final class AtlasSourceRegistry {
    private AtlasSourceRegistry() {
    }

    public static void register(class01894 class018942, MapCodec<? extends class04233> mapCodec) {
        AtlasSourceRegistryImpl.register((class01894)class018942, mapCodec);
    }
}

