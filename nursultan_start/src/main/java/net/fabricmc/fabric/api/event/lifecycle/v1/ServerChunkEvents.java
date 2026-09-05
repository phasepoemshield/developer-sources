/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.event.lifecycle.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$Generate;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$LevelTypeChange;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$Load;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerChunkEvents$Unload;

public final class ServerChunkEvents {
    public static final Event<ServerChunkEvents$Load> CHUNK_LOAD = EventFactory.createArrayBacked(ServerChunkEvents$Load.class, serverChunkEvents$LoadArray -> (class047822, class005702) -> {
        for (ServerChunkEvents$Load serverChunkEvents$Load : serverChunkEvents$LoadArray) {
            serverChunkEvents$Load.onChunkLoad(class047822, class005702);
        }
    });
    public static final Event<ServerChunkEvents$Generate> CHUNK_GENERATE = EventFactory.createArrayBacked(ServerChunkEvents$Generate.class, serverChunkEvents$GenerateArray -> (class047822, class005702) -> {
        for (ServerChunkEvents$Generate serverChunkEvents$Generate : serverChunkEvents$GenerateArray) {
            serverChunkEvents$Generate.onChunkGenerate(class047822, class005702);
        }
    });
    public static final Event<ServerChunkEvents$Unload> CHUNK_UNLOAD = EventFactory.createArrayBacked(ServerChunkEvents$Unload.class, serverChunkEvents$UnloadArray -> (class047822, class005702) -> {
        for (ServerChunkEvents$Unload serverChunkEvents$Unload : serverChunkEvents$UnloadArray) {
            serverChunkEvents$Unload.onChunkUnload(class047822, class005702);
        }
    });
    public static final Event<ServerChunkEvents$LevelTypeChange> CHUNK_LEVEL_TYPE_CHANGE = EventFactory.createArrayBacked(ServerChunkEvents$LevelTypeChange.class, (class047822, class005702, class047632, class047633) -> {}, serverChunkEvents$LevelTypeChangeArray -> (class047822, class005702, class047632, class047633) -> {
        for (ServerChunkEvents$LevelTypeChange serverChunkEvents$LevelTypeChange : serverChunkEvents$LevelTypeChangeArray) {
            serverChunkEvents$LevelTypeChange.onChunkLevelTypeChange(class047822, class005702, class047632, class047633);
        }
    });

    private ServerChunkEvents() {
    }
}

