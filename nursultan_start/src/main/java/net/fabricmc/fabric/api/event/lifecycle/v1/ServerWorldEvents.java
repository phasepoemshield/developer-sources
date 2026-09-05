/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.event.lifecycle.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents$Load;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents$Unload;

public final class ServerWorldEvents {
    public static final Event<ServerWorldEvents$Load> LOAD = EventFactory.createArrayBacked(ServerWorldEvents$Load.class, serverWorldEvents$LoadArray -> (class027962, class047822) -> {
        for (ServerWorldEvents$Load serverWorldEvents$Load : serverWorldEvents$LoadArray) {
            serverWorldEvents$Load.onWorldLoad(class027962, class047822);
        }
    });
    public static final Event<ServerWorldEvents$Unload> UNLOAD = EventFactory.createArrayBacked(ServerWorldEvents$Unload.class, serverWorldEvents$UnloadArray -> (class027962, class047822) -> {
        for (ServerWorldEvents$Unload serverWorldEvents$Unload : serverWorldEvents$UnloadArray) {
            serverWorldEvents$Unload.onWorldUnload(class027962, class047822);
        }
    });

    private ServerWorldEvents() {
    }
}

