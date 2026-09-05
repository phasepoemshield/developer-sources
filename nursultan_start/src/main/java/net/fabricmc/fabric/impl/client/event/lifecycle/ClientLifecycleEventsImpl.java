/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents$Unload
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents
 *  net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache
 */
package net.fabricmc.fabric.impl.client.event.lifecycle;

import minecraft.class00394;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientBlockEntityEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache;

@Environment(value=EnvType.CLIENT)
public final class ClientLifecycleEventsImpl
implements ClientModInitializer {
    public void onInitializeClient() {
        ClientChunkEvents.CHUNK_LOAD.register((class034482, class005702) -> ((LoadedChunksCache)class034482).fabric_markLoaded(class005702));
        ClientChunkEvents.CHUNK_UNLOAD.register((class034482, class005702) -> ((LoadedChunksCache)class034482).fabric_markUnloaded(class005702));
        ClientChunkEvents.CHUNK_UNLOAD.register((class034482, class005702) -> {
            for (class00394 class003942 : class005702.o().values()) {
                ((ClientBlockEntityEvents.Unload)ClientBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003942, class034482);
            }
        });
    }
}

