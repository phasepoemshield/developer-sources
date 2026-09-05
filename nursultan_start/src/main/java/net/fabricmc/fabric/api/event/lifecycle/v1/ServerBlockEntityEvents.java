/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.event.lifecycle.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents$Load;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents$Unload;

public final class ServerBlockEntityEvents {
    public static final Event<ServerBlockEntityEvents$Load> BLOCK_ENTITY_LOAD = EventFactory.createArrayBacked(ServerBlockEntityEvents$Load.class, serverBlockEntityEvents$LoadArray -> (class003942, class047822) -> {
        for (ServerBlockEntityEvents$Load serverBlockEntityEvents$Load : serverBlockEntityEvents$LoadArray) {
            serverBlockEntityEvents$Load.onLoad(class003942, class047822);
        }
    });
    public static final Event<ServerBlockEntityEvents$Unload> BLOCK_ENTITY_UNLOAD = EventFactory.createArrayBacked(ServerBlockEntityEvents$Unload.class, serverBlockEntityEvents$UnloadArray -> (class003942, class047822) -> {
        for (ServerBlockEntityEvents$Unload serverBlockEntityEvents$Unload : serverBlockEntityEvents$UnloadArray) {
            serverBlockEntityEvents$Unload.onUnload(class003942, class047822);
        }
    });

    private ServerBlockEntityEvents() {
    }
}

