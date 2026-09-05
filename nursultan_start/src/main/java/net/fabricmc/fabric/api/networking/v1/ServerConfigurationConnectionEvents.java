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
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents$Configure;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationConnectionEvents$Disconnect;

public final class ServerConfigurationConnectionEvents {
    public static final Event<ServerConfigurationConnectionEvents$Configure> BEFORE_CONFIGURE = EventFactory.createArrayBacked(ServerConfigurationConnectionEvents$Configure.class, serverConfigurationConnectionEvents$ConfigureArray -> (class041762, class027962) -> {
        for (ServerConfigurationConnectionEvents$Configure serverConfigurationConnectionEvents$Configure : serverConfigurationConnectionEvents$ConfigureArray) {
            serverConfigurationConnectionEvents$Configure.onSendConfiguration(class041762, class027962);
        }
    });
    public static final Event<ServerConfigurationConnectionEvents$Configure> CONFIGURE = EventFactory.createArrayBacked(ServerConfigurationConnectionEvents$Configure.class, serverConfigurationConnectionEvents$ConfigureArray -> (class041762, class027962) -> {
        for (ServerConfigurationConnectionEvents$Configure serverConfigurationConnectionEvents$Configure : serverConfigurationConnectionEvents$ConfigureArray) {
            serverConfigurationConnectionEvents$Configure.onSendConfiguration(class041762, class027962);
        }
    });
    public static final Event<ServerConfigurationConnectionEvents$Disconnect> DISCONNECT = EventFactory.createArrayBacked(ServerConfigurationConnectionEvents$Disconnect.class, serverConfigurationConnectionEvents$DisconnectArray -> (class041762, class027962) -> {
        for (ServerConfigurationConnectionEvents$Disconnect serverConfigurationConnectionEvents$Disconnect : serverConfigurationConnectionEvents$DisconnectArray) {
            serverConfigurationConnectionEvents$Disconnect.onConfigureDisconnect(class041762, class027962);
        }
    });

    private ServerConfigurationConnectionEvents() {
    }
}

