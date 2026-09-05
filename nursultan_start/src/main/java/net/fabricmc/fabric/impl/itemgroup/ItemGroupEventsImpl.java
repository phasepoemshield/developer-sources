/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05946
 *  minecraft.class06911
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents$ModifyEntries
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.itemgroup;

import java.util.HashMap;
import java.util.Map;
import minecraft.class05946;
import minecraft.class06911;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import org.jspecify.annotations.Nullable;

public class ItemGroupEventsImpl {
    private static final Map<class05946<class06911>, Event<ItemGroupEvents.ModifyEntries>> ITEM_GROUP_EVENT_MAP = new HashMap<class05946<class06911>, Event<ItemGroupEvents.ModifyEntries>>();

    public static @Nullable Event<// Could not load outer class - annotation placement on inner may be incorrect
    ItemGroupEvents.ModifyEntries> getModifyEntriesEvent(class05946<class06911> class059462) {
        return ITEM_GROUP_EVENT_MAP.get(class059462);
    }

    public static Event<ItemGroupEvents.ModifyEntries> getOrCreateModifyEntriesEvent(class05946<class06911> class059463) {
        return ITEM_GROUP_EVENT_MAP.computeIfAbsent(class059463, class059462 -> ItemGroupEventsImpl.createModifyEvent());
    }

    private static Event<ItemGroupEvents.ModifyEntries> createModifyEvent() {
        return EventFactory.createArrayBacked(ItemGroupEvents.ModifyEntries.class, modifyEntriesArray -> fabricItemGroupEntries -> {
            for (ItemGroupEvents.ModifyEntries modifyEntries : modifyEntriesArray) {
                modifyEntries.modifyEntries(fabricItemGroupEntries);
            }
        });
    }
}

