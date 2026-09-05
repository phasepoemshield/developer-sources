/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.entity.event.v1;

import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents$AfterEntityChange;
import net.fabricmc.fabric.api.entity.event.v1.ServerEntityWorldChangeEvents$AfterPlayerChange;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class ServerEntityWorldChangeEvents {
    public static final Event<ServerEntityWorldChangeEvents$AfterEntityChange> AFTER_ENTITY_CHANGE_WORLD = EventFactory.createArrayBacked(ServerEntityWorldChangeEvents$AfterEntityChange.class, serverEntityWorldChangeEvents$AfterEntityChangeArray -> (class070492, class070493, class047822, class047823) -> {
        for (ServerEntityWorldChangeEvents$AfterEntityChange serverEntityWorldChangeEvents$AfterEntityChange : serverEntityWorldChangeEvents$AfterEntityChangeArray) {
            serverEntityWorldChangeEvents$AfterEntityChange.afterChangeWorld(class070492, class070493, class047822, class047823);
        }
    });
    public static final Event<ServerEntityWorldChangeEvents$AfterPlayerChange> AFTER_PLAYER_CHANGE_WORLD = EventFactory.createArrayBacked(ServerEntityWorldChangeEvents$AfterPlayerChange.class, serverEntityWorldChangeEvents$AfterPlayerChangeArray -> (class047702, class047822, class047823) -> {
        for (ServerEntityWorldChangeEvents$AfterPlayerChange serverEntityWorldChangeEvents$AfterPlayerChange : serverEntityWorldChangeEvents$AfterPlayerChangeArray) {
            serverEntityWorldChangeEvents$AfterPlayerChange.afterChangeWorld(class047702, class047822, class047823);
        }
    });

    private ServerEntityWorldChangeEvents() {
    }
}

