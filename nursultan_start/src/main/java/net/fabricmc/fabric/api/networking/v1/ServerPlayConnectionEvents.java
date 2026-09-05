/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.networking.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents$Disconnect;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents$Init;
import net.fabricmc.fabric.api.networking.v1.ServerPlayConnectionEvents$Join;

public final class ServerPlayConnectionEvents {
    public static final Event<ServerPlayConnectionEvents$Init> INIT = EventFactory.createArrayBacked(ServerPlayConnectionEvents$Init.class, serverPlayConnectionEvents$InitArray -> (class016152, class027962) -> {
        for (ServerPlayConnectionEvents$Init serverPlayConnectionEvents$Init : serverPlayConnectionEvents$InitArray) {
            serverPlayConnectionEvents$Init.onPlayInit(class016152, class027962);
        }
    });
    public static final Event<ServerPlayConnectionEvents$Join> JOIN = EventFactory.createArrayBacked(ServerPlayConnectionEvents$Join.class, serverPlayConnectionEvents$JoinArray -> (class016152, packetSender, class027962) -> {
        for (ServerPlayConnectionEvents$Join serverPlayConnectionEvents$Join : serverPlayConnectionEvents$JoinArray) {
            serverPlayConnectionEvents$Join.onPlayReady(class016152, packetSender, class027962);
        }
    });
    public static final Event<ServerPlayConnectionEvents$Disconnect> DISCONNECT = EventFactory.createArrayBacked(ServerPlayConnectionEvents$Disconnect.class, serverPlayConnectionEvents$DisconnectArray -> (class016152, class027962) -> {
        for (ServerPlayConnectionEvents$Disconnect serverPlayConnectionEvents$Disconnect : serverPlayConnectionEvents$DisconnectArray) {
            serverPlayConnectionEvents$Disconnect.onPlayDisconnect(class016152, class027962);
        }
    });

    private ServerPlayConnectionEvents() {
    }
}

