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
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Load;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents$Unload;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientChunkEvents {
    public static final Event<ClientChunkEvents$Load> CHUNK_LOAD = EventFactory.createArrayBacked(ClientChunkEvents$Load.class, clientChunkEvents$LoadArray -> (class034482, class005702) -> {
        for (ClientChunkEvents$Load clientChunkEvents$Load : clientChunkEvents$LoadArray) {
            clientChunkEvents$Load.onChunkLoad(class034482, class005702);
        }
    });
    public static final Event<ClientChunkEvents$Unload> CHUNK_UNLOAD = EventFactory.createArrayBacked(ClientChunkEvents$Unload.class, clientChunkEvents$UnloadArray -> (class034482, class005702) -> {
        for (ClientChunkEvents$Unload clientChunkEvents$Unload : clientChunkEvents$UnloadArray) {
            clientChunkEvents$Unload.onChunkUnload(class034482, class005702);
        }
    });

    private ClientChunkEvents() {
    }
}

