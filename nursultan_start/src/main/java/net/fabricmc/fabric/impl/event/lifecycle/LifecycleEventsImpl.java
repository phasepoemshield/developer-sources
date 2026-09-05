/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00570
 *  minecraft.class07049
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents$Unload
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents$Unload
 *  net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents
 */
package net.fabricmc.fabric.impl.event.lifecycle;

import minecraft.class00394;
import minecraft.class00570;
import minecraft.class07049;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerBlockEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerWorldEvents;
import net.fabricmc.fabric.impl.event.lifecycle.LoadedChunksCache;

public final class LifecycleEventsImpl
implements ModInitializer {
    public void onInitialize() {
        ServerChunkEvents.CHUNK_LOAD.register((class047822, class005702) -> ((LoadedChunksCache)class047822).fabric_markLoaded(class005702));
        ServerChunkEvents.CHUNK_UNLOAD.register((class047822, class005702) -> ((LoadedChunksCache)class047822).fabric_markUnloaded(class005702));
        ServerChunkEvents.CHUNK_UNLOAD.register((class047822, class005702) -> {
            for (class00394 class003942 : class005702.o().values()) {
                ((ServerBlockEntityEvents.Unload)ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003942, class047822);
            }
        });
        ServerWorldEvents.UNLOAD.register((class027962, class047822) -> {
            for (class00570 class005702 : ((LoadedChunksCache)class047822).fabric_getLoadedChunks()) {
                for (class00394 class003942 : class005702.o().values()) {
                    ((ServerBlockEntityEvents.Unload)ServerBlockEntityEvents.BLOCK_ENTITY_UNLOAD.invoker()).onUnload(class003942, class047822);
                }
            }
            for (class00570 class005702 : class047822.method_27909()) {
                ((ServerEntityEvents.Unload)ServerEntityEvents.ENTITY_UNLOAD.invoker()).onUnload((class07049)class005702, class047822);
            }
        });
    }
}

