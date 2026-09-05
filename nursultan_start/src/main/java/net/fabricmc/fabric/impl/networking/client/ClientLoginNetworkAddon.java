/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class03464
 *  minecraft.class04191
 *  minecraft.class06202
 *  minecraft.class07812
 *  minecraft.class07847
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$Disconnect
 *  net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$Init
 *  net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$QueryStart
 *  net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking$LoginQueryRequestHandler
 *  net.fabricmc.fabric.api.networking.v1.PacketByteBufs
 *  net.fabricmc.fabric.mixin.networking.client.accessor.ClientHandshakePacketListenerImplAccessor
 */
package net.fabricmc.fabric.impl.networking.client;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class03464;
import minecraft.class04191;
import minecraft.class06202;
import minecraft.class07812;
import minecraft.class07847;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.impl.networking.AbstractNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientHandshakePacketListenerImplAccessor;

@Environment(value=EnvType.CLIENT)
public final class ClientLoginNetworkAddon
extends AbstractNetworkAddon<ClientLoginNetworking.LoginQueryRequestHandler> {
    private final class03464 handler;
    private final class06202 client;
    private boolean firstResponse = true;

    public ClientLoginNetworkAddon(class03464 class034642, class06202 class062022) {
        super(ClientNetworkingImpl.LOGIN, "ClientLoginNetworkAddon for Client");
        this.handler = class034642;
        this.client = class062022;
    }

    @Override
    public void invokeDisconnectEvent() {
        ((ClientLoginConnectionEvents.Disconnect)ClientLoginConnectionEvents.DISCONNECT.invoker()).onLoginDisconnect(this.handler, this.client);
    }

    public boolean handlePacket(class07812 class078122) {
        PacketByteBufLoginQueryRequestPayload packetByteBufLoginQueryRequestPayload = (PacketByteBufLoginQueryRequestPayload)class078122.y();
        return this.handlePacket(class078122.N(), class078122.y().comp_1571(), packetByteBufLoginQueryRequestPayload.data());
    }

    private boolean handlePacket(int n, class01894 class018942, class00667 class006673) {
        ClientLoginNetworking.LoginQueryRequestHandler loginQueryRequestHandler;
        this.logger.debug("Handling inbound login response with id {} and channel with name {}", (Object)n, (Object)class018942);
        if (this.firstResponse) {
            ((ClientLoginConnectionEvents.QueryStart)ClientLoginConnectionEvents.QUERY_START.invoker()).onLoginQueryStart(this.handler, this.client);
            this.firstResponse = false;
        }
        if ((loginQueryRequestHandler = (ClientLoginNetworking.LoginQueryRequestHandler)this.getHandler(class018942)) == null) {
            return false;
        }
        class00667 class006674 = PacketByteBufs.slice((ByteBuf)class006673);
        ArrayList arrayList = new ArrayList();
        try {
            CompletableFuture completableFuture = loginQueryRequestHandler.receive(this.client, this.handler, class006674, arrayList::add);
            completableFuture.thenAccept(class006672 -> {
                class07847 class078472 = new class07847(n, (class04191)(class006672 == null ? null : new PacketByteBufLoginQueryResponse((class00667)class006672)));
                ((ClientHandshakePacketListenerImplAccessor)this.handler).getConnection().method_10752((class00381)class078472, channelFuture -> {
                    for (ChannelFutureListener channelFutureListener : arrayList) {
                        channelFutureListener.operationComplete(channelFuture);
                    }
                });
            });
        }
        catch (Throwable throwable) {
            this.logger.error("Encountered exception while handling in channel with name \"{}\"", (Object)class018942, (Object)throwable);
            throw throwable;
        }
        return true;
    }

    @Override
    public boolean isReservedChannel(class01894 class018942) {
        return false;
    }

    @Override
    public void invokeInitEvent() {
        ((ClientLoginConnectionEvents.Init)ClientLoginConnectionEvents.INIT.invoker()).onLoginStart(this.handler, this.client);
    }

    @Override
    public void handleUnregistration(class01894 class018942) {
    }

    @Override
    public void handleRegistration(class01894 class018942) {
    }
}

