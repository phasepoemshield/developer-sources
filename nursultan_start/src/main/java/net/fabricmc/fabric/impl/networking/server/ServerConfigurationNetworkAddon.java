/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  minecraft.class00648
 *  minecraft.class01644
 *  minecraft.class01659
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class03462
 *  minecraft.class04176
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents
 *  net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents$Register
 *  net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents$Unregister
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents$Configure
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents$Disconnect
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking$ConfigurationPacketHandler
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking$Context
 *  net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.networking.server;

import io.netty.channel.ChannelFutureListener;
import java.util.Collections;
import java.util.List;
import minecraft.class00381;
import minecraft.class00648;
import minecraft.class01644;
import minecraft.class01659;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class03462;
import minecraft.class04176;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon;
import net.fabricmc.fabric.impl.networking.ChannelInfoHolder;
import net.fabricmc.fabric.impl.networking.NetworkingImpl;
import net.fabricmc.fabric.impl.networking.RegistrationPayload;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon$ContextImpl;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon$RegisterState;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;

public final class ServerConfigurationNetworkAddon
extends AbstractChanneledNetworkAddon<ServerConfigurationNetworking.ConfigurationPacketHandler<?>> {
    private final class04176 handler;
    private final class02796 server;
    private final ServerConfigurationNetworking.Context context;
    private ServerConfigurationNetworkAddon$RegisterState registerState = ServerConfigurationNetworkAddon$RegisterState.NOT_SENT;
    private @Nullable String clientBrand = null;
    private boolean isReconfiguring = false;

    public @Nullable String getClientBrand() {
        return this.clientBrand;
    }

    public ServerConfigurationNetworkAddon(class04176 class041762, class02796 class027962) {
        super(ServerNetworkingImpl.CONFIGURATION, ((ServerCommonPacketListenerImplAccessor)class041762).getConnection(), "ServerConfigurationNetworkAddon for " + class041762.method_52404().name());
        this.handler = class041762;
        this.server = class027962;
        this.context = new ServerConfigurationNetworkAddon$ContextImpl(class027962, class041762, this);
        this.registerPendingChannels((ChannelInfoHolder)this.connection, class00648.field_45671);
    }

    @Override
    public void schedule(Runnable runnable) {
        this.server.execute(runnable);
    }

    public void configuration() {
        ((ServerConfigurationConnectionEvents.Configure)ServerConfigurationConnectionEvents.CONFIGURE.invoker()).onSendConfiguration(this.handler, this.server);
    }

    @Override
    public boolean handle(class01659 class016592) {
        if (class016592 instanceof class01644) {
            class01644 class016442 = (class01644)class016592;
            this.clientBrand = class016442.N();
            return false;
        }
        return super.handle(class016592);
    }

    public ChannelInfoHolder getChannelInfoHolder() {
        return (ChannelInfoHolder)((ServerCommonPacketListenerImplAccessor)this.handler).getConnection();
    }

    @Override
    protected void receive(ServerConfigurationNetworking.ConfigurationPacketHandler<?> configurationPacketHandler, class01659 class016592) {
        configurationPacketHandler.receive(class016592, this.context);
    }

    public void onPong(int n) {
        if (this.registerState == ServerConfigurationNetworkAddon$RegisterState.SENT) {
            this.registerState = ServerConfigurationNetworkAddon$RegisterState.NOT_RECEIVED;
            this.handler.L();
        }
    }

    public boolean isReconfiguring() {
        return this.isReconfiguring;
    }

    public void preConfiguration() {
        ((ServerConfigurationConnectionEvents.Configure)ServerConfigurationConnectionEvents.BEFORE_CONFIGURE.invoker()).onSendConfiguration(this.handler, this.server);
    }

    public boolean startConfiguration() {
        if (this.registerState == ServerConfigurationNetworkAddon$RegisterState.NOT_SENT) {
            this.sendInitialChannelRegistrationPacket();
            this.sendPacket((class00381)new class03462(16430876));
            this.registerState = ServerConfigurationNetworkAddon$RegisterState.SENT;
            return true;
        }
        if (this.registerState != ServerConfigurationNetworkAddon$RegisterState.RECEIVED && this.registerState != ServerConfigurationNetworkAddon$RegisterState.NOT_RECEIVED) {
            throw new IllegalStateException();
        }
        return false;
    }

    @Override
    public void invokeRegisterEvent(List<class01894> list) {
        ((S2CConfigurationChannelEvents.Register)S2CConfigurationChannelEvents.REGISTER.invoker()).onChannelRegister(this.handler, (PacketSender)this, this.server, list);
    }

    @Override
    public void invokeUnregisterEvent(List<class01894> list) {
        ((S2CConfigurationChannelEvents.Unregister)S2CConfigurationChannelEvents.UNREGISTER.invoker()).onChannelUnregister(this.handler, (PacketSender)this, this.server, list);
    }

    @Override
    public void invokeDisconnectEvent() {
        ((ServerConfigurationConnectionEvents.Disconnect)ServerConfigurationConnectionEvents.DISCONNECT.invoker()).onConfigureDisconnect(this.handler, this.server);
    }

    @Override
    public void receiveRegistration(boolean bl, RegistrationPayload registrationPayload) {
        super.receiveRegistration(bl, registrationPayload);
        if (bl && this.registerState == ServerConfigurationNetworkAddon$RegisterState.SENT) {
            this.registerState = ServerConfigurationNetworkAddon$RegisterState.RECEIVED;
            this.handler.L();
        }
    }

    public class00381<?> createPacket(class01659 class016592) {
        return ServerConfigurationNetworking.createS2CPacket((class01659)class016592);
    }

    @Override
    public boolean isReservedChannel(class01894 class018942) {
        return NetworkingImpl.isReservedCommonChannel(class018942);
    }

    @Override
    public void invokeInitEvent() {
    }

    @Override
    public boolean isOnReceiveThread() {
        return true;
    }

    @Override
    public void handleUnregistration(class01894 class018942) {
        RegistrationPayload registrationPayload;
        if (this.registerState != ServerConfigurationNetworkAddon$RegisterState.NOT_SENT && (registrationPayload = this.createRegistrationPayload(RegistrationPayload.UNREGISTER, Collections.singleton(class018942))) != null) {
            this.sendPacket(registrationPayload);
        }
    }

    @Override
    public void handleRegistration(class01894 class018942) {
        RegistrationPayload registrationPayload;
        if (this.registerState != ServerConfigurationNetworkAddon$RegisterState.NOT_SENT && (registrationPayload = this.createRegistrationPayload(RegistrationPayload.REGISTER, Collections.singleton(class018942))) != null) {
            this.sendPacket(registrationPayload);
        }
    }

    public void setReconfiguring() {
        this.isReconfiguring = true;
    }

    @Override
    public void sendPacket(class00381<?> class003812, ChannelFutureListener channelFutureListener) {
        this.handler.method_52391(class003812, channelFutureListener);
    }
}

