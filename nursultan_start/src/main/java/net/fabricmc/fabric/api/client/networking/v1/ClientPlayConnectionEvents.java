/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.networking.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Disconnect;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Init;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents$Join;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientPlayConnectionEvents {
    public static final Event<ClientPlayConnectionEvents$Init> INIT = EventFactory.createArrayBacked(ClientPlayConnectionEvents$Init.class, clientPlayConnectionEvents$InitArray -> (class016832, class062022) -> {
        for (ClientPlayConnectionEvents$Init clientPlayConnectionEvents$Init : clientPlayConnectionEvents$InitArray) {
            clientPlayConnectionEvents$Init.onPlayInit(class016832, class062022);
        }
    });
    public static final Event<ClientPlayConnectionEvents$Join> JOIN = EventFactory.createArrayBacked(ClientPlayConnectionEvents$Join.class, clientPlayConnectionEvents$JoinArray -> (class016832, packetSender, class062022) -> {
        for (ClientPlayConnectionEvents$Join clientPlayConnectionEvents$Join : clientPlayConnectionEvents$JoinArray) {
            clientPlayConnectionEvents$Join.onPlayReady(class016832, packetSender, class062022);
        }
    });
    public static final Event<ClientPlayConnectionEvents$Disconnect> DISCONNECT = EventFactory.createArrayBacked(ClientPlayConnectionEvents$Disconnect.class, clientPlayConnectionEvents$DisconnectArray -> (class016832, class062022) -> {
        for (ClientPlayConnectionEvents$Disconnect clientPlayConnectionEvents$Disconnect : clientPlayConnectionEvents$DisconnectArray) {
            clientPlayConnectionEvents$Disconnect.onPlayDisconnect(class016832, class062022);
        }
    });

    private ClientPlayConnectionEvents() {
    }
}

