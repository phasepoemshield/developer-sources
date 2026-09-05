/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00642
 *  minecraft.class00648
 *  minecraft.class01615
 *  minecraft.class01659
 *  minecraft.class01894
 *  minecraft.class02796
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents
 *  net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents$Register
 *  net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents$Unregister
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents$Disconnect
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents$Init
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents$Join
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking$Context
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking$PlayPayloadHandler
 *  net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon
 *  net.fabricmc.fabric.impl.networking.ChannelInfoHolder
 *  net.fabricmc.fabric.impl.networking.NetworkingImpl
 *  net.fabricmc.fabric.impl.networking.RegistrationPayload
 */
package net.fabricmc.fabric.impl.networking.server;

import java.util.Collections;
import java.util.List;
import minecraft.class00381;
import minecraft.class00642;
import minecraft.class00648;
import minecraft.class01615;
import minecraft.class01659;
import minecraft.class01894;
import minecraft.class02796;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon;
import net.fabricmc.fabric.impl.networking.ChannelInfoHolder;
import net.fabricmc.fabric.impl.networking.NetworkingImpl;
import net.fabricmc.fabric.impl.networking.RegistrationPayload;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon$ContextImpl;

public final class ServerPlayNetworkAddon
extends AbstractChanneledNetworkAddon<ServerPlayNetworking.PlayPayloadHandler<?>> {
    private final class01615 handler;
    private final class02796 server;
    private final ServerPlayNetworking.Context context;
    private boolean sentInitialRegisterPacket;
    private boolean requestedReconfigure = false;

    public void reconfigure() {
        if (this.requestedReconfigure) {
            throw new IllegalStateException("Already requested reconfigure");
        }
        this.requestedReconfigure = true;
        this.handler.method_52414();
    }

    public ServerPlayNetworkAddon(class01615 class016152, class00642 class006422, class02796 class027962) {
        super(ServerNetworkingImpl.PLAY, class006422, "ServerPlayNetworkAddon for " + String.valueOf(class016152.field_14140.method_5476()));
        this.handler = class016152;
        this.server = class027962;
        this.context = new ServerPlayNetworkAddon$ContextImpl(class027962, class016152, (PacketSender)this);
        this.registerPendingChannels((ChannelInfoHolder)this.connection, class00648.field_20591);
    }

    public void schedule(Runnable runnable) {
        this.handler.field_14140.method_51469().method_8503().execute(runnable);
    }

    public boolean requestedReconfigure() {
        return this.requestedReconfigure;
    }

    protected void receive(ServerPlayNetworking.PlayPayloadHandler<?> playPayloadHandler, class01659 class016592) {
        playPayloadHandler.receive(class016592, this.context);
    }

    public void invokeRegisterEvent(List<class01894> list) {
        ((S2CPlayChannelEvents.Register)S2CPlayChannelEvents.REGISTER.invoker()).onChannelRegister(this.handler, (PacketSender)this, this.server, list);
    }

    public void invokeUnregisterEvent(List<class01894> list) {
        ((S2CPlayChannelEvents.Unregister)S2CPlayChannelEvents.UNREGISTER.invoker()).onChannelUnregister(this.handler, (PacketSender)this, this.server, list);
    }

    public void invokeDisconnectEvent() {
        ((ServerPlayConnectionEvents.Disconnect)ServerPlayConnectionEvents.DISCONNECT.invoker()).onPlayDisconnect(this.handler, this.server);
    }

    public class00381<?> createPacket(class01659 class016592) {
        return ServerPlayNetworking.createS2CPacket((class01659)class016592);
    }

    public boolean isReservedChannel(class01894 class018942) {
        return NetworkingImpl.isReservedCommonChannel((class01894)class018942);
    }

    public void invokeInitEvent() {
        ((ServerPlayConnectionEvents.Init)ServerPlayConnectionEvents.INIT.invoker()).onPlayInit(this.handler, this.server);
    }

    public boolean isOnReceiveThread() {
        return this.server.yK().N();
    }

    public void handleUnregistration(class01894 class018942) {
        RegistrationPayload registrationPayload;
        if (this.sentInitialRegisterPacket && (registrationPayload = this.createRegistrationPayload(RegistrationPayload.UNREGISTER, Collections.singleton(class018942))) != null) {
            this.sendPacket((class01659)registrationPayload);
        }
    }

    public void handleRegistration(class01894 class018942) {
        RegistrationPayload registrationPayload;
        if (this.sentInitialRegisterPacket && (registrationPayload = this.createRegistrationPayload(RegistrationPayload.REGISTER, Collections.singleton(class018942))) != null) {
            this.sendPacket((class01659)registrationPayload);
        }
    }

    public void onClientReady() {
        ((ServerPlayConnectionEvents.Join)ServerPlayConnectionEvents.JOIN.invoker()).onPlayReady(this.handler, (PacketSender)this, this.server);
        this.sendInitialChannelRegistrationPacket();
        this.sentInitialRegisterPacket = true;
    }
}

