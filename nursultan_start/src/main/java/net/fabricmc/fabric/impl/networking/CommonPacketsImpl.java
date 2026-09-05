/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00648
 *  minecraft.class04176
 *  minecraft.class04188
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking
 *  net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl
 */
package net.fabricmc.fabric.impl.networking;

import java.util.Arrays;
import minecraft.class00648;
import minecraft.class04176;
import minecraft.class04188;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.impl.networking.CommonPacketsImpl$CommonRegisterConfigurationTask;
import net.fabricmc.fabric.impl.networking.CommonPacketsImpl$CommonVersionConfigurationTask;
import net.fabricmc.fabric.impl.networking.CommonRegisterPayload;
import net.fabricmc.fabric.impl.networking.CommonVersionPayload;
import net.fabricmc.fabric.impl.networking.NetworkingImpl;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;

public class CommonPacketsImpl {
    public static final int PACKET_VERSION_1 = 1;
    public static final int[] SUPPORTED_COMMON_PACKET_VERSIONS = new int[]{1};

    public static void init() {
        PayloadTypeRegistry.configurationC2S().register(CommonVersionPayload.ID, CommonVersionPayload.CODEC);
        PayloadTypeRegistry.configurationS2C().register(CommonVersionPayload.ID, CommonVersionPayload.CODEC);
        PayloadTypeRegistry.playC2S().register(CommonVersionPayload.ID, CommonVersionPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(CommonVersionPayload.ID, CommonVersionPayload.CODEC);
        PayloadTypeRegistry.configurationC2S().register(CommonRegisterPayload.ID, CommonRegisterPayload.CODEC);
        PayloadTypeRegistry.configurationS2C().register(CommonRegisterPayload.ID, CommonRegisterPayload.CODEC);
        PayloadTypeRegistry.playC2S().register(CommonRegisterPayload.ID, CommonRegisterPayload.CODEC);
        PayloadTypeRegistry.playS2C().register(CommonRegisterPayload.ID, CommonRegisterPayload.CODEC);
        ServerConfigurationNetworking.registerGlobalReceiver(CommonVersionPayload.ID, (commonVersionPayload, context) -> {
            ServerConfigurationNetworkAddon serverConfigurationNetworkAddon = ServerNetworkingImpl.getAddon((class04176)context.networkHandler());
            serverConfigurationNetworkAddon.onCommonVersionPacket(CommonPacketsImpl.getNegotiatedVersion(commonVersionPayload));
            context.networkHandler().completeTask(CommonPacketsImpl$CommonVersionConfigurationTask.KEY);
        });
        ServerConfigurationNetworking.registerGlobalReceiver(CommonRegisterPayload.ID, (commonRegisterPayload, context) -> {
            ServerConfigurationNetworkAddon serverConfigurationNetworkAddon = ServerNetworkingImpl.getAddon((class04176)context.networkHandler());
            if ("play".equals(commonRegisterPayload.phase())) {
                if (commonRegisterPayload.version() != serverConfigurationNetworkAddon.getNegotiatedVersion()) {
                    throw new IllegalStateException("Negotiated common packet version: %d but received packet with version: %d".formatted(new Object[]{serverConfigurationNetworkAddon.getNegotiatedVersion(), commonRegisterPayload.version()}));
                }
                serverConfigurationNetworkAddon.getChannelInfoHolder().fabric_getPendingChannelsNames(class00648.field_20591).addAll(commonRegisterPayload.channels());
                NetworkingImpl.LOGGER.debug("Received accepted channels from the client for play phase");
            } else {
                serverConfigurationNetworkAddon.onCommonRegisterPacket((CommonRegisterPayload)commonRegisterPayload);
            }
            context.networkHandler().completeTask(CommonPacketsImpl$CommonRegisterConfigurationTask.KEY);
        });
        ServerConfigurationConnectionEvents.CONFIGURE.register((class041762, class027962) -> {
            ServerConfigurationNetworkAddon serverConfigurationNetworkAddon = ServerNetworkingImpl.getAddon((class04176)class041762);
            if (ServerConfigurationNetworking.canSend((class04176)class041762, CommonVersionPayload.ID)) {
                class041762.addTask((class04188)new CommonPacketsImpl$CommonVersionConfigurationTask(serverConfigurationNetworkAddon));
                if (ServerConfigurationNetworking.canSend((class04176)class041762, CommonRegisterPayload.ID)) {
                    class041762.addTask((class04188)new CommonPacketsImpl$CommonRegisterConfigurationTask(serverConfigurationNetworkAddon));
                }
            }
        });
    }

    public static int getHighestCommonVersion(int[] nArray, int[] nArray2) {
        int[] nArray3 = (int[])nArray.clone();
        int[] nArray4 = (int[])nArray2.clone();
        Arrays.sort(nArray3);
        Arrays.sort(nArray4);
        int n = nArray3.length - 1;
        int n2 = nArray4.length - 1;
        while (n >= 0 && n2 >= 0) {
            if (nArray3[n] == nArray4[n2]) {
                return nArray3[n];
            }
            if (nArray3[n] > nArray4[n2]) {
                --n;
                continue;
            }
            --n2;
        }
        return -1;
    }

    private static int getNegotiatedVersion(CommonVersionPayload commonVersionPayload) {
        int n = CommonPacketsImpl.getHighestCommonVersion(commonVersionPayload.versions(), SUPPORTED_COMMON_PACKET_VERSIONS);
        if (n <= 0) {
            throw new UnsupportedOperationException("server does not support any requested versions from client");
        }
        return n;
    }
}

