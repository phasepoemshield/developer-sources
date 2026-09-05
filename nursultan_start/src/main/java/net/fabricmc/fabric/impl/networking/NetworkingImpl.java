/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.networking;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.impl.networking.RegistrationPayload;
import net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class NetworkingImpl {
    public static final String MOD_ID = "fabric-networking-api-v1";
    public static final Logger LOGGER = LoggerFactory.getLogger((String)"fabric-networking-api-v1");
    public static final class01894 REGISTER_CHANNEL = class01894.y((String)"register");
    public static final class01894 UNREGISTER_CHANNEL = class01894.y((String)"unregister");

    public static void init() {
        PayloadTypeRegistry.configurationS2C().register(RegistrationPayload.REGISTER, RegistrationPayload.REGISTER_CODEC);
        PayloadTypeRegistry.configurationS2C().register(RegistrationPayload.UNREGISTER, RegistrationPayload.UNREGISTER_CODEC);
        PayloadTypeRegistry.configurationC2S().register(RegistrationPayload.REGISTER, RegistrationPayload.REGISTER_CODEC);
        PayloadTypeRegistry.configurationC2S().register(RegistrationPayload.UNREGISTER, RegistrationPayload.UNREGISTER_CODEC);
        PayloadTypeRegistry.playS2C().register(RegistrationPayload.REGISTER, RegistrationPayload.REGISTER_CODEC);
        PayloadTypeRegistry.playS2C().register(RegistrationPayload.UNREGISTER, RegistrationPayload.UNREGISTER_CODEC);
        PayloadTypeRegistry.playC2S().register(RegistrationPayload.REGISTER, RegistrationPayload.REGISTER_CODEC);
        PayloadTypeRegistry.playC2S().register(RegistrationPayload.UNREGISTER, RegistrationPayload.UNREGISTER_CODEC);
        NetworkingImpl.registerGeneric(FabricSplitPacketPayload.ID, FabricSplitPacketPayload.CODEC);
    }

    private static <T extends class01659> void registerGeneric(class01666<T> class016662, class02362<? super class00667, T> class023622) {
        PayloadTypeRegistry.configurationS2C().register(class016662, class023622);
        PayloadTypeRegistry.configurationC2S().register(class016662, class023622);
        PayloadTypeRegistry.playS2C().register(class016662, class023622);
        PayloadTypeRegistry.playC2S().register(class016662, class023622);
    }

    public static boolean isReservedCommonChannel(class01894 class018942) {
        return class018942.equals((Object)REGISTER_CHANNEL) || class018942.equals((Object)UNREGISTER_CHANNEL);
    }
}

