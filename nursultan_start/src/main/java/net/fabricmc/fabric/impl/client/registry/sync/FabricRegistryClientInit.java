/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01666
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking
 *  net.fabricmc.fabric.impl.registry.sync.packet.RegistrySyncPayload
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.client.registry.sync;

import minecraft.class01666;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.impl.client.registry.sync.ClientRegistrySyncHandler;
import net.fabricmc.fabric.impl.registry.sync.packet.RegistrySyncPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public class FabricRegistryClientInit
implements ClientModInitializer {
    private static final Logger LOGGER = LoggerFactory.getLogger(FabricRegistryClientInit.class);

    public void onInitializeClient() {
        ClientConfigurationNetworking.registerGlobalReceiver((class01666)RegistrySyncPayload.ID, ClientRegistrySyncHandler::receivePacket);
    }
}

