/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class03556
 *  minecraft.class05074
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.loot.v3;

import minecraft.class00751;
import minecraft.class03556;
import minecraft.class05074;
import minecraft.class05946;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents$Loaded;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents$Modify;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents$ModifyDrops;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents$Replace;

public final class LootTableEvents {
    public static final Event<LootTableEvents$Replace> REPLACE = EventFactory.createArrayBacked(LootTableEvents$Replace.class, lootTableEvents$ReplaceArray -> (class059462, class050742, lootTableSource, class019292) -> {
        for (LootTableEvents$Replace lootTableEvents$Replace : lootTableEvents$ReplaceArray) {
            class05074 class050743 = lootTableEvents$Replace.replaceLootTable((class05946<class05074>)class059462, class050742, lootTableSource, class019292);
            if (class050743 == null) continue;
            return class050743;
        }
        return null;
    });
    public static final Event<LootTableEvents$Modify> MODIFY = EventFactory.createArrayBacked(LootTableEvents$Modify.class, lootTableEvents$ModifyArray -> (class059462, class050622, lootTableSource, class019292) -> {
        for (LootTableEvents$Modify lootTableEvents$Modify : lootTableEvents$ModifyArray) {
            lootTableEvents$Modify.modifyLootTable((class05946<class05074>)class059462, class050622, lootTableSource, class019292);
        }
    });
    public static final Event<LootTableEvents$Loaded> ALL_LOADED = EventFactory.createArrayBacked(LootTableEvents$Loaded.class, lootTableEvents$LoadedArray -> (class010892, class007512) -> {
        for (LootTableEvents$Loaded lootTableEvents$Loaded : lootTableEvents$LoadedArray) {
            lootTableEvents$Loaded.onLootTablesLoaded(class010892, (class00751<class05074>)class007512);
        }
    });
    public static final Event<LootTableEvents$ModifyDrops> MODIFY_DROPS = EventFactory.createArrayBacked(LootTableEvents$ModifyDrops.class, lootTableEvents$ModifyDropsArray -> (class035562, class059082, list) -> {
        for (LootTableEvents$ModifyDrops lootTableEvents$ModifyDrops : lootTableEvents$ModifyDropsArray) {
            lootTableEvents$ModifyDrops.modifyLootTableDrops((class03556<class05074>)class035562, class059082, list);
        }
    });

    private LootTableEvents() {
    }
}

