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
import net.fabricmc.fabric.api.event.player.ItemEvents$UseCallback;
import net.fabricmc.fabric.api.event.player.ItemEvents$UseOnCallback;

public interface ItemEvents {
    public static final Event<ItemEvents$UseOnCallback> USE_ON = EventFactory.createArrayBacked(ItemEvents$UseOnCallback.class, itemEvents$UseOnCallbackArray -> class065012 -> {
        for (ItemEvents$UseOnCallback itemEvents$UseOnCallback : itemEvents$UseOnCallbackArray) {
            class07082 class070822 = itemEvents$UseOnCallback.useOn(class065012);
            if (class070822 == null) continue;
            return class070822;
        }
        return null;
    });
    public static final Event<ItemEvents$UseCallback> USE = EventFactory.createArrayBacked(ItemEvents$UseCallback.class, itemEvents$UseCallbackArray -> (class072992, class080362, class070502) -> {
        for (ItemEvents$UseCallback itemEvents$UseCallback : itemEvents$UseCallbackArray) {
            class07082 class070822 = itemEvents$UseCallback.use(class072992, class080362, class070502);
            if (class070822 == null) continue;
            return class070822;
        }
        return null;
    });
}

