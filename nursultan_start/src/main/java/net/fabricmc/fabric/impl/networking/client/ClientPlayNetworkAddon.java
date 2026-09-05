/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00381
 *  minecraft.class00648
 *  minecraft.class01659
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents
 *  net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents$Register
 *  net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents$Unregister
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Disconnect
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Init
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Join
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$Context
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$PlayPayloadHandler
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  org.slf4j.Logger
 */
package net.fabricmc.fabric.impl.networking.client;

import com.mojang.logging.LogUtils;
import java.util.List;
import minecraft.class00381;
import minecraft.class00648;
import minecraft.class01659;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.impl.networking.ChannelInfoHolder;
import net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon$ContextImpl;
import org.slf4j.Logger;

@Environment(value=EnvType.CLIENT)
public final class ClientPlayNetworkAddon
extends ClientCommonNetworkAddon<ClientPlayNetworking.PlayPayloadHandler<?>, class01683> {
    private final ClientPlayNetworkAddon$ContextImpl context;
    private static final Logger LOGGER = LogUtils.getLogger();

    public ClientPlayNetworkAddon(class01683 class016832, class06202 class062022) {
        super(ClientNetworkingImpl.PLAY, class016832.M(), "ClientPlayNetworkAddon for " + class016832.E().name(), class016832, class062022);
        this.context = new ClientPlayNetworkAddon$ContextImpl(class062022, this);
        this.registerPendingChannels((ChannelInfoHolder)this.connection, class00648.field_20591);
    }

    @Override
    protected void receive(ClientPlayNetworking.PlayPayloadHandler<?> playPayloadHandler, class01659 class016592) {
        playPayloadHandler.receive(class016592, (ClientPlayNetworking.Context)this.context);
    }

    @Override
    public void onServerReady() {
        try {
            ((ClientPlayConnectionEvents.Join)ClientPlayConnectionEvents.JOIN.invoker()).onPlayReady((class01683)this.handler, (PacketSender)this, this.client);
        }
        catch (RuntimeException runtimeException) {
            LOGGER.error("Exception thrown while invoking ClientPlayConnectionEvents.JOIN", (Throwable)runtimeException);
        }
        this.sendInitialChannelRegistrationPacket();
        super.onServerReady();
    }

    @Override
    public void invokeRegisterEvent(List<class01894> list) {
        ((C2SPlayChannelEvents.Register)C2SPlayChannelEvents.REGISTER.invoker()).onChannelRegister((class01683)this.handler, (PacketSender)this, this.client, list);
    }

    @Override
    public void invokeUnregisterEvent(List<class01894> list) {
        ((C2SPlayChannelEvents.Unregister)C2SPlayChannelEvents.UNREGISTER.invoker()).onChannelUnregister((class01683)this.handler, (PacketSender)this, this.client, list);
    }

    @Override
    public void invokeDisconnectEvent() {
        ((ClientPlayConnectionEvents.Disconnect)ClientPlayConnectionEvents.DISCONNECT.invoker()).onPlayDisconnect((class01683)this.handler, this.client);
    }

    public class00381<?> createPacket(class01659 class016592) {
        return ClientPlayNetworking.createC2SPacket((class01659)class016592);
    }

    @Override
    public void invokeInitEvent() {
        ((ClientPlayConnectionEvents.Init)ClientPlayConnectionEvents.INIT.invoker()).onPlayInit((class01683)this.handler, this.client);
    }

    @Override
    public boolean isOnReceiveThread() {
        return this.client.B().N();
    }
}

