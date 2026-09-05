/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01666
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking
 *  net.fabricmc.fabric.impl.particle.ExtendedBlockStateParticleEffectSync$DummyPayload
 */
package net.fabricmc.fabric.impl.client.particle;

import minecraft.class01666;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.impl.particle.ExtendedBlockStateParticleEffectSync;

@Environment(value=EnvType.CLIENT)
public class ExtendedBlockStateParticleEffectSyncClient
implements ClientModInitializer {
    public void onInitializeClient() {
        ClientConfigurationNetworking.registerGlobalReceiver((class01666)ExtendedBlockStateParticleEffectSync.DummyPayload.ID, (dummyPayload, context) -> {});
    }
}

