/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class06584;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.player.PlayerPickItemEvents$PickItemFromBlock;
import net.fabricmc.fabric.api.event.player.PlayerPickItemEvents$PickItemFromEntity;

public final class PlayerPickItemEvents {
    public static final Event<PlayerPickItemEvents$PickItemFromBlock> BLOCK = EventFactory.createArrayBacked(PlayerPickItemEvents$PickItemFromBlock.class, playerPickItemEvents$PickItemFromBlockArray -> (class047702, class072092, class005002, bl) -> {
        for (PlayerPickItemEvents$PickItemFromBlock playerPickItemEvents$PickItemFromBlock : playerPickItemEvents$PickItemFromBlockArray) {
            class06584 class065842 = playerPickItemEvents$PickItemFromBlock.onPickItemFromBlock(class047702, class072092, class005002, bl);
            if (class065842 == null) continue;
            return class065842;
        }
        return null;
    });
    public static final Event<PlayerPickItemEvents$PickItemFromEntity> ENTITY = EventFactory.createArrayBacked(PlayerPickItemEvents$PickItemFromEntity.class, playerPickItemEvents$PickItemFromEntityArray -> (class047702, class070492, bl) -> {
        for (PlayerPickItemEvents$PickItemFromEntity playerPickItemEvents$PickItemFromEntity : playerPickItemEvents$PickItemFromEntityArray) {
            class06584 class065842 = playerPickItemEvents$PickItemFromEntity.onPickItemFromEntity(class047702, class070492, bl);
            if (class065842 == null) continue;
            return class065842;
        }
        return null;
    });

    private PlayerPickItemEvents() {
    }
}

