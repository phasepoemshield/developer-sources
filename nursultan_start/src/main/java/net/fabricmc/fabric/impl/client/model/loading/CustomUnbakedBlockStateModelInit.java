/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.model.loading.v1.CustomUnbakedBlockStateModel
 */
package net.fabricmc.fabric.impl.client.model.loading;

import minecraft.class01894;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.model.loading.v1.CustomUnbakedBlockStateModel;
import net.fabricmc.fabric.impl.client.model.loading.CompositeBlockStateModelImpl$Unbaked;

@Environment(value=EnvType.CLIENT)
public class CustomUnbakedBlockStateModelInit
implements ClientModInitializer {
    public void onInitializeClient() {
        CustomUnbakedBlockStateModel.register((class01894)class01894.N((String)"fabric", (String)"composite"), CompositeBlockStateModelImpl$Unbaked.CODEC);
    }
}

