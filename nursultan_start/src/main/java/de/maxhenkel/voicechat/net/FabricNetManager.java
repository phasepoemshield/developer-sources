/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04770
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 *  net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
 *  net.fabricmc.loader.api.FabricLoader
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.net.Channel;
import de.maxhenkel.voicechat.net.ClientServerChannel;
import de.maxhenkel.voicechat.net.FabricNetManager$1;
import de.maxhenkel.voicechat.net.NetManager;
import de.maxhenkel.voicechat.net.Packet;
import de.maxhenkel.voicechat.net.RequestSecretPacket;
import java.util.HashSet;
import java.util.Set;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04770;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.loader.api.FabricLoader;

public class FabricNetManager
extends NetManager {
    private final Set<class01894> packets = new HashSet<class01894>();

    @Override
    protected void sendToServerInternal(Packet<?> packet) {
        ClientPlayNetworking.send(packet);
    }

    @Override
    public <T extends Packet<T>> Channel<T> registerReceiver(Class<T> clazz, boolean bl, boolean bl2) {
        ClientServerChannel clientServerChannel = new ClientServerChannel();
        try {
            Packet packet2 = (Packet)clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            class01666 class016662 = packet2.method_56479();
            this.packets.add(class016662.N());
            FabricNetManager$1 fabricNetManager$1 = new FabricNetManager$1(this, clazz);
            if (bl2) {
                PayloadTypeRegistry.playC2S().register(class016662, (class02362)fabricNetManager$1);
                ServerPlayNetworking.registerGlobalReceiver(class016662, (packet, context) -> {
                    try {
                        if (!Voicechat.SERVER.isCompatible(context.player()) && !clazz.equals(RequestSecretPacket.class)) {
                            return;
                        }
                        clientServerChannel.onServerPacket(context.player(), packet);
                    }
                    catch (Exception exception) {
                        Voicechat.LOGGER.error("Failed to process packet", exception);
                    }
                });
            }
            if (bl) {
                PayloadTypeRegistry.playS2C().register(class016662, (class02362)fabricNetManager$1);
                if (FabricLoader.getInstance().getEnvironmentType().equals((Object)EnvType.CLIENT)) {
                    ClientPlayNetworking.registerGlobalReceiver(class016662, (packet, context) -> {
                        try {
                            class06202.Nq().execute(() -> clientServerChannel.onClientPacket(context.player(), packet));
                        }
                        catch (Exception exception) {
                            Voicechat.LOGGER.error("Failed to register packet receiver", exception);
                        }
                    });
                }
            }
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(exception);
        }
        return clientServerChannel;
    }

    @Override
    public void sendToClient(Packet<?> packet, class04770 class047702) {
        ServerPlayNetworking.send((class04770)class047702, packet);
    }

    public Set<class01894> getPackets() {
        return this.packets;
    }
}

