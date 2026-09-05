/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.event.lifecycle.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents$EquipmentChange;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents$Load;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents$Unload;

public final class ServerEntityEvents {
    public static final Event<ServerEntityEvents$Load> ENTITY_LOAD = EventFactory.createArrayBacked(ServerEntityEvents$Load.class, serverEntityEvents$LoadArray -> (class070492, class047822) -> {
        for (ServerEntityEvents$Load serverEntityEvents$Load : serverEntityEvents$LoadArray) {
            serverEntityEvents$Load.onLoad(class070492, class047822);
        }
    });
    public static final Event<ServerEntityEvents$Unload> ENTITY_UNLOAD = EventFactory.createArrayBacked(ServerEntityEvents$Unload.class, serverEntityEvents$UnloadArray -> (class070492, class047822) -> {
        for (ServerEntityEvents$Unload serverEntityEvents$Unload : serverEntityEvents$UnloadArray) {
            serverEntityEvents$Unload.onUnload(class070492, class047822);
        }
    });
    public static final Event<ServerEntityEvents$EquipmentChange> EQUIPMENT_CHANGE = EventFactory.createArrayBacked(ServerEntityEvents$EquipmentChange.class, serverEntityEvents$EquipmentChangeArray -> (class074382, class070852, class065842, class065843) -> {
        for (ServerEntityEvents$EquipmentChange serverEntityEvents$EquipmentChange : serverEntityEvents$EquipmentChangeArray) {
            serverEntityEvents$EquipmentChange.onChange(class074382, class070852, class065842, class065843);
        }
    });

    private ServerEntityEvents() {
    }
}

