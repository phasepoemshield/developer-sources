/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01894
 *  minecraft.class08880
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.model.loading.CustomUnbakedBlockStateModelRegistry
 */
package net.fabricmc.fabric.api.client.model.loading.v1;

import com.mojang.serialization.MapCodec;
import minecraft.class01894;
import minecraft.class08880;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.model.loading.CustomUnbakedBlockStateModelRegistry;

@Environment(value=EnvType.CLIENT)
public interface CustomUnbakedBlockStateModel
extends class08880 {
    public static void register(class01894 class018942, MapCodec<? extends CustomUnbakedBlockStateModel> mapCodec) {
        CustomUnbakedBlockStateModelRegistry.register((class01894)class018942, mapCodec);
    }

    public MapCodec<? extends CustomUnbakedBlockStateModel> codec();
}

