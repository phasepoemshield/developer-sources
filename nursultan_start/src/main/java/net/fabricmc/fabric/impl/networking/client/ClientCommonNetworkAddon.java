/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00642
 *  minecraft.class01866
 *  minecraft.class01894
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.networking.client;

import java.util.Collections;
import minecraft.class00642;
import minecraft.class01866;
import minecraft.class01894;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.networking.AbstractChanneledNetworkAddon;
import net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry;
import net.fabricmc.fabric.impl.networking.NetworkingImpl;
import net.fabricmc.fabric.impl.networking.RegistrationPayload;

@Environment(value=EnvType.CLIENT)
abstract class ClientCommonNetworkAddon<H, T extends class01866>
extends AbstractChanneledNetworkAddon<H> {
    protected final T handler;
    protected final class06202 client;
    protected boolean isServerReady = false;

    protected ClientCommonNetworkAddon(GlobalReceiverRegistry<H> globalReceiverRegistry, class00642 class006422, String string, T t, class06202 class062022) {
        super(globalReceiverRegistry, class006422, string);
        this.handler = t;
        this.client = class062022;
    }

    @Override
    public void schedule(Runnable runnable) {
        this.client.execute(runnable);
    }

    public void onServerReady() {
        this.isServerReady = true;
    }

    @Override
    public boolean isReservedChannel(class01894 class018942) {
        return NetworkingImpl.isReservedCommonChannel(class018942);
    }

    @Override
    public void handleUnregistration(class01894 class018942) {
        RegistrationPayload registrationPayload;
        if (this.isServerReady && (registrationPayload = this.createRegistrationPayload(RegistrationPayload.UNREGISTER, Collections.singleton(class018942))) != null) {
            this.sendPacket(registrationPayload);
        }
    }

    @Override
    public void handleRegistration(class01894 class018942) {
        RegistrationPayload registrationPayload;
        if (this.isServerReady && (registrationPayload = this.createRegistrationPayload(RegistrationPayload.REGISTER, Collections.singleton(class018942))) != null) {
            this.sendPacket(registrationPayload);
        }
    }
}

