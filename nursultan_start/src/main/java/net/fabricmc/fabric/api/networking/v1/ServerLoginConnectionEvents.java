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
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents$Disconnect;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents$Init;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents$QueryStart;

public final class ServerLoginConnectionEvents {
    public static final Event<ServerLoginConnectionEvents$Init> INIT = EventFactory.createArrayBacked(ServerLoginConnectionEvents$Init.class, serverLoginConnectionEvents$InitArray -> (class016102, class027962) -> {
        for (ServerLoginConnectionEvents$Init serverLoginConnectionEvents$Init : serverLoginConnectionEvents$InitArray) {
            serverLoginConnectionEvents$Init.onLoginInit(class016102, class027962);
        }
    });
    public static final Event<ServerLoginConnectionEvents$QueryStart> QUERY_START = EventFactory.createArrayBacked(ServerLoginConnectionEvents$QueryStart.class, serverLoginConnectionEvents$QueryStartArray -> (class016102, class027962, loginPacketSender, serverLoginNetworking$LoginSynchronizer) -> {
        for (ServerLoginConnectionEvents$QueryStart serverLoginConnectionEvents$QueryStart : serverLoginConnectionEvents$QueryStartArray) {
            serverLoginConnectionEvents$QueryStart.onLoginStart(class016102, class027962, loginPacketSender, serverLoginNetworking$LoginSynchronizer);
        }
    });
    public static final Event<ServerLoginConnectionEvents$Disconnect> DISCONNECT = EventFactory.createArrayBacked(ServerLoginConnectionEvents$Disconnect.class, serverLoginConnectionEvents$DisconnectArray -> (class016102, class027962) -> {
        for (ServerLoginConnectionEvents$Disconnect serverLoginConnectionEvents$Disconnect : serverLoginConnectionEvents$DisconnectArray) {
            serverLoginConnectionEvents$Disconnect.onLoginDisconnect(class016102, class027962);
        }
    });

    private ServerLoginConnectionEvents() {
    }
}

