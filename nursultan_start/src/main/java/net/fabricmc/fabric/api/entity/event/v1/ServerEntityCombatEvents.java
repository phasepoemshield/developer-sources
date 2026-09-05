/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.entity.event.v1;

import net.fabricmc.fabric.api.entity.event.v1.ServerEntityCombatEvents$AfterKilledOtherEntity;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class ServerEntityCombatEvents {
    public static final Event<ServerEntityCombatEvents$AfterKilledOtherEntity> AFTER_KILLED_OTHER_ENTITY = EventFactory.createArrayBacked(ServerEntityCombatEvents$AfterKilledOtherEntity.class, serverEntityCombatEvents$AfterKilledOtherEntityArray -> (class047822, class070492, class074382, class070722) -> {
        for (ServerEntityCombatEvents$AfterKilledOtherEntity serverEntityCombatEvents$AfterKilledOtherEntity : serverEntityCombatEvents$AfterKilledOtherEntityArray) {
            serverEntityCombatEvents$AfterKilledOtherEntity.afterKilledOtherEntity(class047822, class070492, class074382, class070722);
        }
    });

    private ServerEntityCombatEvents() {
    }
}

