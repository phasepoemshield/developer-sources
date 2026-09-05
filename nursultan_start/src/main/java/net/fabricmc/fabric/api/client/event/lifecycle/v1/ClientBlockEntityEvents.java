/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.event.lifecycle.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents$Load;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents$Unload;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientBlockEntityEvents {
    public static final Event<ClientBlockEntityEvents$Load> BLOCK_ENTITY_LOAD = EventFactory.createArrayBacked(ClientBlockEntityEvents$Load.class, clientBlockEntityEvents$LoadArray -> (class003942, class034482) -> {
        for (ClientBlockEntityEvents$Load clientBlockEntityEvents$Load : clientBlockEntityEvents$LoadArray) {
            clientBlockEntityEvents$Load.onLoad(class003942, class034482);
        }
    });
    public static final Event<ClientBlockEntityEvents$Unload> BLOCK_ENTITY_UNLOAD = EventFactory.createArrayBacked(ClientBlockEntityEvents$Unload.class, clientBlockEntityEvents$UnloadArray -> (class003942, class034482) -> {
        for (ClientBlockEntityEvents$Unload clientBlockEntityEvents$Unload : clientBlockEntityEvents$UnloadArray) {
            clientBlockEntityEvents$Unload.onUnload(class003942, class034482);
        }
    });

    private ClientBlockEntityEvents() {
    }
}

