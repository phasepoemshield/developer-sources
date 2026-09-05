/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05946
 *  minecraft.class06911
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl
 */
package net.fabricmc.fabric.api.itemgroup.v1;

import minecraft.class05946;
import minecraft.class06911;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents$ModifyEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents$ModifyEntriesAll;
import net.fabricmc.fabric.impl.itemgroup.ItemGroupEventsImpl;

public final class ItemGroupEvents {
    public static final Event<ItemGroupEvents$ModifyEntriesAll> MODIFY_ENTRIES_ALL = EventFactory.createArrayBacked(ItemGroupEvents$ModifyEntriesAll.class, itemGroupEvents$ModifyEntriesAllArray -> (class069112, fabricItemGroupEntries) -> {
        for (ItemGroupEvents$ModifyEntriesAll itemGroupEvents$ModifyEntriesAll : itemGroupEvents$ModifyEntriesAllArray) {
            itemGroupEvents$ModifyEntriesAll.modifyEntries(class069112, fabricItemGroupEntries);
        }
    });

    private ItemGroupEvents() {
    }

    public static Event<ItemGroupEvents$ModifyEntries> modifyEntriesEvent(class05946<class06911> class059462) {
        return ItemGroupEventsImpl.getOrCreateModifyEntriesEvent(class059462);
    }
}

