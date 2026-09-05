/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class04247
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf
 */
package net.fabricmc.fabric.impl.particle;

import java.util.Set;
import minecraft.class01894;
import minecraft.class04247;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.impl.networking.FabricRegistryByteBuf;
import net.fabricmc.fabric.impl.particle.ExtendedBlockStateParticleEffectSync$DummyPayload;

public class ExtendedBlockStateParticleEffectSync
implements ModInitializer {
    static final class01894 PACKET_ID = class01894.N((String)"fabric", (String)"extended_block_state_particle_effect_sync");

    public static boolean shouldEncodeFallback(class04247 class042472) {
        Set set = ((FabricRegistryByteBuf)class042472).fabric_getSendableConfigurationChannels();
        if (set == null) {
            return true;
        }
        return !set.contains(PACKET_ID);
    }

    public void onInitialize() {
        PayloadTypeRegistry.configurationS2C().register(ExtendedBlockStateParticleEffectSync$DummyPayload.ID, ExtendedBlockStateParticleEffectSync$DummyPayload.CODEC);
    }
}

