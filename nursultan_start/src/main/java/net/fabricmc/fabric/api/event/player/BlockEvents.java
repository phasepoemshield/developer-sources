/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07082
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class07082;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.player.BlockEvents$UseItemOnCallback;
import net.fabricmc.fabric.api.event.player.BlockEvents$UseWithoutItemCallback;

public interface BlockEvents {
    public static final Event<BlockEvents$UseItemOnCallback> USE_ITEM_ON = EventFactory.createArrayBacked(BlockEvents$UseItemOnCallback.class, blockEvents$UseItemOnCallbackArray -> (class065842, class005002, class072992, class072092, class080362, class070502, class061832) -> {
        for (BlockEvents$UseItemOnCallback blockEvents$UseItemOnCallback : blockEvents$UseItemOnCallbackArray) {
            class07082 class070822 = blockEvents$UseItemOnCallback.useItemOn(class065842, class005002, class072992, class072092, class080362, class070502, class061832);
            if (class070822 == null) continue;
            return class070822;
        }
        return null;
    });
    public static final Event<BlockEvents$UseWithoutItemCallback> USE_WITHOUT_ITEM = EventFactory.createArrayBacked(BlockEvents$UseWithoutItemCallback.class, blockEvents$UseWithoutItemCallbackArray -> (class005002, class072992, class072092, class080362, class061832) -> {
        for (BlockEvents$UseWithoutItemCallback blockEvents$UseWithoutItemCallback : blockEvents$UseWithoutItemCallbackArray) {
            class07082 class070822 = blockEvents$UseWithoutItemCallback.useWithoutItem(class005002, class072992, class072092, class080362, class061832);
            if (class070822 == null) continue;
            return class070822;
        }
        return null;
    });
}

