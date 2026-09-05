/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00648
 *  minecraft.class01644
 *  minecraft.class01659
 *  minecraft.class01874
 *  minecraft.class01894
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents
 *  net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents$Register
 *  net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents$Unregister
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Complete
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Disconnect
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Init
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Ready
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Start
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$ConfigurationPayloadHandler
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$Context
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.mixin.networking.client.accessor.ClientCommonPacketListenerImplAccessor
 *  net.fabricmc.fabric.mixin.networking.client.accessor.ClientConfigurationPacketListenerImplAccessor
 */
package net.fabricmc.fabric.impl.networking.client;

import java.util.List;
import minecraft.class00381;
import minecraft.class00648;
import minecraft.class01644;
import minecraft.class01659;
import minecraft.class01874;
import minecraft.class01894;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.impl.networking.ChannelInfoHolder;
import net.fabricmc.fabric.impl.networking.RegistrationPayload;
import net.fabricmc.fabric.impl.networking.client.ClientCommonNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon$ContextImpl;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientCommonPacketListenerImplAccessor;
import net.fabricmc.fabric.mixin.networking.client.accessor.ClientConfigurationPacketListenerImplAccessor;

@Environment(value=EnvType.CLIENT)
public final class ClientConfigurationNetworkAddon
extends ClientCommonNetworkAddon<ClientConfigurationNetworking.ConfigurationPayloadHandler<?>, class01874> {
    private final ClientConfigurationNetworkAddon$ContextImpl context;
    private boolean sentInitialRegisterPacket;
    private boolean hasStarted;

    public ClientConfigurationNetworkAddon(class01874 class018742, class06202 class062022) {
        super(ClientNetworkingImpl.CONFIGURATION, ((ClientCommonPacketListenerImplAccessor)class018742).getConnection(), "ClientPlayNetworkAddon for " + ((ClientConfigurationPacketListenerImplAccessor)class018742).getProfile().name(), class018742, class062022);
        this.context = new ClientConfigurationNetworkAddon$ContextImpl(class062022, class018742, this);
        this.registerPendingChannels((ChannelInfoHolder)this.connection, class00648.field_45671);
    }

    @Override
    public boolean handle(class01659 class016592) {
        boolean bl = super.handle(class016592);
        if (class016592 instanceof class01644) {
            this.invokeStartEvent();
        }
        return bl;
    }

    public ChannelInfoHolder getChannelInfoHolder() {
        return (ChannelInfoHolder)((ClientCommonPacketListenerImplAccessor)this.handler).getConnection();
    }

    @Override
    protected void receive(ClientConfigurationNetworking.ConfigurationPayloadHandler<?> configurationPayloadHandler, class01659 class016592) {
        configurationPayloadHandler.receive(class016592, (ClientConfigurationNetworking.Context)this.context);
    }

    @Override
    public void onServerReady() {
        super.onServerReady();
        this.invokeStartEvent();
    }

    @Override
    public void invokeRegisterEvent(List<class01894> list) {
        ((C2SConfigurationChannelEvents.Register)C2SConfigurationChannelEvents.REGISTER.invoker()).onChannelRegister((class01874)this.handler, (PacketSender)this, this.client, list);
    }

    @Override
    public void invokeUnregisterEvent(List<class01894> list) {
        ((C2SConfigurationChannelEvents.Unregister)C2SConfigurationChannelEvents.UNREGISTER.invoker()).onChannelUnregister((class01874)this.handler, (PacketSender)this, this.client, list);
    }

    @Override
    public void invokeDisconnectEvent() {
        ((ClientConfigurationConnectionEvents.Disconnect)ClientConfigurationConnectionEvents.DISCONNECT.invoker()).onConfigurationDisconnect((class01874)this.handler, this.client);
    }

    @Override
    public void receiveRegistration(boolean bl, RegistrationPayload registrationPayload) {
        super.receiveRegistration(bl, registrationPayload);
        if (bl && !this.sentInitialRegisterPacket) {
            this.sendInitialChannelRegistrationPacket();
            this.sentInitialRegisterPacket = true;
            this.onServerReady();
        }
    }

    public void handleComplete() {
        ((ClientConfigurationConnectionEvents.Complete)ClientConfigurationConnectionEvents.COMPLETE.invoker()).onConfigurationComplete((class01874)this.handler, this.client);
        ((ClientConfigurationConnectionEvents.Ready)ClientConfigurationConnectionEvents.READY.invoker()).onConfigurationReady((class01874)this.handler, this.client);
        ClientNetworkingImpl.setClientConfigurationAddon(null);
    }

    private void invokeStartEvent() {
        if (!this.hasStarted) {
            this.hasStarted = true;
            ((ClientConfigurationConnectionEvents.Start)ClientConfigurationConnectionEvents.START.invoker()).onConfigurationStart((class01874)this.handler, this.client);
        }
    }

    public class00381<?> createPacket(class01659 class016592) {
        return ClientPlayNetworking.createC2SPacket((class01659)class016592);
    }

    @Override
    public void invokeInitEvent() {
        ((ClientConfigurationConnectionEvents.Init)ClientConfigurationConnectionEvents.INIT.invoker()).onConfigurationInit((class01874)this.handler, this.client);
    }

    @Override
    public boolean isOnReceiveThread() {
        return true;
    }
}

