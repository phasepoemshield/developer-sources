/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class01894
 *  minecraft.class03464
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.networking.v1;

import java.util.Set;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01894;
import minecraft.class03464;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking$LoginQueryRequestHandler;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class ClientLoginNetworking {
    private ClientLoginNetworking() {
    }

    public static Set<class01894> getGlobalReceivers() {
        return ClientNetworkingImpl.LOGIN.getChannels();
    }

    public static boolean registerReceiver(class01894 class018942, ClientLoginNetworking$LoginQueryRequestHandler clientLoginNetworking$LoginQueryRequestHandler) throws IllegalStateException {
        class00638 class006382;
        class00642 class006422 = ClientNetworkingImpl.getLoginConnection();
        if (class006422 != null && (class006382 = class006422.method_10744()) instanceof class03464) {
            return ClientNetworkingImpl.getAddon((class03464)((class03464)class006382)).registerChannel(class018942, (Object)clientLoginNetworking$LoginQueryRequestHandler);
        }
        throw new IllegalStateException("Cannot register receiver while client is not logging in!");
    }

    public static @Nullable ClientLoginNetworking$LoginQueryRequestHandler unregisterReceiver(class01894 class018942) throws IllegalStateException {
        class00638 class006382;
        class00642 class006422 = ClientNetworkingImpl.getLoginConnection();
        if (class006422 != null && (class006382 = class006422.method_10744()) instanceof class03464) {
            return (ClientLoginNetworking$LoginQueryRequestHandler)ClientNetworkingImpl.getAddon((class03464)((class03464)class006382)).unregisterChannel(class018942);
        }
        throw new IllegalStateException("Cannot unregister receiver while client is not logging in!");
    }

    public static @Nullable ClientLoginNetworking$LoginQueryRequestHandler unregisterGlobalReceiver(class01894 class018942) {
        return (ClientLoginNetworking$LoginQueryRequestHandler)ClientNetworkingImpl.LOGIN.unregisterGlobalReceiver(class018942);
    }

    public static boolean registerGlobalReceiver(class01894 class018942, ClientLoginNetworking$LoginQueryRequestHandler clientLoginNetworking$LoginQueryRequestHandler) {
        return ClientNetworkingImpl.LOGIN.registerGlobalReceiver(class018942, (Object)clientLoginNetworking$LoginQueryRequestHandler);
    }
}

