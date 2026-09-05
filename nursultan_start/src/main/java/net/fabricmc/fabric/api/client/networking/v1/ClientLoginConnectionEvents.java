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
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$Disconnect;
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$Init;
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginConnectionEvents$QueryStart;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientLoginConnectionEvents {
    public static final Event<ClientLoginConnectionEvents$Init> INIT = EventFactory.createArrayBacked(ClientLoginConnectionEvents$Init.class, clientLoginConnectionEvents$InitArray -> (class034642, class062022) -> {
        for (ClientLoginConnectionEvents$Init clientLoginConnectionEvents$Init : clientLoginConnectionEvents$InitArray) {
            clientLoginConnectionEvents$Init.onLoginStart(class034642, class062022);
        }
    });
    public static final Event<ClientLoginConnectionEvents$QueryStart> QUERY_START = EventFactory.createArrayBacked(ClientLoginConnectionEvents$QueryStart.class, clientLoginConnectionEvents$QueryStartArray -> (class034642, class062022) -> {
        for (ClientLoginConnectionEvents$QueryStart clientLoginConnectionEvents$QueryStart : clientLoginConnectionEvents$QueryStartArray) {
            clientLoginConnectionEvents$QueryStart.onLoginQueryStart(class034642, class062022);
        }
    });
    public static final Event<ClientLoginConnectionEvents$Disconnect> DISCONNECT = EventFactory.createArrayBacked(ClientLoginConnectionEvents$Disconnect.class, clientLoginConnectionEvents$DisconnectArray -> (class034642, class062022) -> {
        for (ClientLoginConnectionEvents$Disconnect clientLoginConnectionEvents$Disconnect : clientLoginConnectionEvents$DisconnectArray) {
            clientLoginConnectionEvents$Disconnect.onLoginDisconnect(class034642, class062022);
        }
    });

    private ClientLoginConnectionEvents() {
    }
}

