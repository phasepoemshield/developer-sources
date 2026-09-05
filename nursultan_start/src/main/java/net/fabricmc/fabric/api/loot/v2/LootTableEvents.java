/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class05074
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.loot.v2;

import minecraft.class00751;
import minecraft.class05074;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents$Loaded;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents$Modify;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents$Replace;

@Deprecated
public final class LootTableEvents {
    @Deprecated
    public static final Event<LootTableEvents$Replace> REPLACE = EventFactory.createArrayBacked(LootTableEvents$Replace.class, lootTableEvents$ReplaceArray -> (class059462, class050742, lootTableSource) -> {
        for (LootTableEvents$Replace lootTableEvents$Replace : lootTableEvents$ReplaceArray) {
            class05074 class050743 = lootTableEvents$Replace.replaceLootTable((class05946<class05074>)class059462, class050742, lootTableSource);
            if (class050743 == null) continue;
            return class050743;
        }
        return null;
    });
    @Deprecated
    public static final Event<LootTableEvents$Modify> MODIFY = EventFactory.createArrayBacked(LootTableEvents$Modify.class, lootTableEvents$ModifyArray -> (class059462, class050622, lootTableSource) -> {
        for (LootTableEvents$Modify lootTableEvents$Modify : lootTableEvents$ModifyArray) {
            lootTableEvents$Modify.modifyLootTable((class05946<class05074>)class059462, class050622, lootTableSource);
        }
    });
    @Deprecated
    public static final Event<LootTableEvents$Loaded> ALL_LOADED = EventFactory.createArrayBacked(LootTableEvents$Loaded.class, lootTableEvents$LoadedArray -> (class010892, class007512) -> {
        for (LootTableEvents$Loaded lootTableEvents$Loaded : lootTableEvents$LoadedArray) {
            lootTableEvents$Loaded.onLootTablesLoaded(class010892, (class00751<class05074>)class007512);
        }
    });

    private LootTableEvents() {
    }
}

