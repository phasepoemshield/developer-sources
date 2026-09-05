/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class04159
 *  minecraft.class04188
 */
package net.fabricmc.fabric.impl.networking;

import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class04159;
import minecraft.class04188;
import net.fabricmc.fabric.impl.networking.CommonPacketsImpl;
import net.fabricmc.fabric.impl.networking.CommonVersionPayload;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon;

record CommonPacketsImpl$CommonVersionConfigurationTask(ServerConfigurationNetworkAddon addon) implements class04188
{
    public static final class04159 KEY = new class04159(CommonVersionPayload.ID.N().toString());

    public class04159 method_52375() {
        return KEY;
    }

    public void method_52376(Consumer<class00381<?>> consumer) {
        this.addon.sendPacket(new CommonVersionPayload(CommonPacketsImpl.SUPPORTED_COMMON_PACKET_VERSIONS));
    }
}

