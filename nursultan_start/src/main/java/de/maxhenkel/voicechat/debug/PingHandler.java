/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.voice.server.Server
 *  io.netty.buffer.Unpooled
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.debug;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.voice.server.Server;
import io.netty.buffer.Unpooled;
import java.net.SocketAddress;
import java.util.UUID;
import minecraft.class00667;

public class PingHandler {
    public static final UUID PING_V1 = UUID.fromString("58bc9ae9-c7a8-45e4-a11c-efbb67199425");

    public static boolean onPacket(Server server, SocketAddress socketAddress, UUID uUID, class00667 class006672) {
        if (!((Boolean)Voicechat.SERVER_CONFIG.allowPings.get()).booleanValue()) {
            return false;
        }
        if (!PING_V1.equals(uUID)) {
            return false;
        }
        try {
            byte[] byArray = class006672.y();
            class00667 class006673 = new class00667(Unpooled.wrappedBuffer((byte[])byArray));
            UUID uUID2 = class006673.m();
            long l = class006673.readLong();
            Voicechat.LOGGER.debug("Received ping {} from {}", new Object[]{uUID2, socketAddress});
            class00667 class006674 = new class00667(Unpooled.buffer((int)24));
            class006674.N(uUID2);
            class006674.writeLong(l);
            byte[] byArray2 = new byte[class006674.readableBytes()];
            class006674.readBytes(byArray2);
            server.getSocket().send(byArray2, socketAddress);
        }
        catch (Exception exception) {
            Voicechat.LOGGER.debug("Failed to send ping to {}: {}", new Object[]{socketAddress, exception.getMessage()});
        }
        return true;
    }
}

