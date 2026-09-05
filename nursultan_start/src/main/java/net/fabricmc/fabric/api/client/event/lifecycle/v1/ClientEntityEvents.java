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
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents$Load;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientEntityEvents$Unload;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientEntityEvents {
    public static final Event<ClientEntityEvents$Load> ENTITY_LOAD = EventFactory.createArrayBacked(ClientEntityEvents$Load.class, clientEntityEvents$LoadArray -> (class070492, class034482) -> {
        for (ClientEntityEvents$Load clientEntityEvents$Load : clientEntityEvents$LoadArray) {
            clientEntityEvents$Load.onLoad(class070492, class034482);
        }
    });
    public static final Event<ClientEntityEvents$Unload> ENTITY_UNLOAD = EventFactory.createArrayBacked(ClientEntityEvents$Unload.class, clientEntityEvents$UnloadArray -> (class070492, class034482) -> {
        for (ClientEntityEvents$Unload clientEntityEvents$Unload : clientEntityEvents$UnloadArray) {
            clientEntityEvents$Unload.onUnload(class070492, class034482);
        }
    });

    private ClientEntityEvents() {
    }
}

