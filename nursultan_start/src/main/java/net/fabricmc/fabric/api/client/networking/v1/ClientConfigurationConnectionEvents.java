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
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Complete;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Disconnect;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Init;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Ready;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents$Start;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientConfigurationConnectionEvents {
    public static final Event<ClientConfigurationConnectionEvents$Init> INIT = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents$Init.class, clientConfigurationConnectionEvents$InitArray -> (class018742, class062022) -> {
        for (ClientConfigurationConnectionEvents$Init clientConfigurationConnectionEvents$Init : clientConfigurationConnectionEvents$InitArray) {
            clientConfigurationConnectionEvents$Init.onConfigurationInit(class018742, class062022);
        }
    });
    public static final Event<ClientConfigurationConnectionEvents$Start> START = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents$Start.class, clientConfigurationConnectionEvents$StartArray -> (class018742, class062022) -> {
        for (ClientConfigurationConnectionEvents$Start clientConfigurationConnectionEvents$Start : clientConfigurationConnectionEvents$StartArray) {
            clientConfigurationConnectionEvents$Start.onConfigurationStart(class018742, class062022);
        }
    });
    public static final Event<ClientConfigurationConnectionEvents$Complete> COMPLETE = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents$Complete.class, clientConfigurationConnectionEvents$CompleteArray -> (class018742, class062022) -> {
        for (ClientConfigurationConnectionEvents$Complete clientConfigurationConnectionEvents$Complete : clientConfigurationConnectionEvents$CompleteArray) {
            clientConfigurationConnectionEvents$Complete.onConfigurationComplete(class018742, class062022);
        }
    });
    public static final Event<ClientConfigurationConnectionEvents$Disconnect> DISCONNECT = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents$Disconnect.class, clientConfigurationConnectionEvents$DisconnectArray -> (class018742, class062022) -> {
        for (ClientConfigurationConnectionEvents$Disconnect clientConfigurationConnectionEvents$Disconnect : clientConfigurationConnectionEvents$DisconnectArray) {
            clientConfigurationConnectionEvents$Disconnect.onConfigurationDisconnect(class018742, class062022);
        }
    });
    @Deprecated
    public static final Event<ClientConfigurationConnectionEvents$Ready> READY = EventFactory.createArrayBacked(ClientConfigurationConnectionEvents$Ready.class, clientConfigurationConnectionEvents$ReadyArray -> (class018742, class062022) -> {
        for (ClientConfigurationConnectionEvents$Ready clientConfigurationConnectionEvents$Ready : clientConfigurationConnectionEvents$ReadyArray) {
            clientConfigurationConnectionEvents$Ready.onConfigurationReady(class018742, class062022);
        }
    });

    private ClientConfigurationConnectionEvents() {
    }
}

