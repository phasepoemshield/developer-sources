/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.loot.v2.LootTableEvents
 *  net.fabricmc.fabric.api.loot.v2.LootTableEvents$Loaded
 *  net.fabricmc.fabric.api.loot.v2.LootTableEvents$Modify
 *  net.fabricmc.fabric.api.loot.v2.LootTableEvents$Replace
 *  net.fabricmc.fabric.api.loot.v2.LootTableSource
 *  net.fabricmc.fabric.api.loot.v3.LootTableEvents
 *  net.fabricmc.fabric.api.loot.v3.LootTableSource
 */
package net.fabricmc.fabric.impl.loot.v2;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;

public class LootInitializer
implements ModInitializer {
    private static net.fabricmc.fabric.api.loot.v2.LootTableSource toV2Source(LootTableSource lootTableSource) {
        return switch (lootTableSource) {
            default -> throw new MatchException(null, null);
            case LootTableSource.VANILLA -> net.fabricmc.fabric.api.loot.v2.LootTableSource.VANILLA;
            case LootTableSource.MOD -> net.fabricmc.fabric.api.loot.v2.LootTableSource.MOD;
            case LootTableSource.DATA_PACK -> net.fabricmc.fabric.api.loot.v2.LootTableSource.DATA_PACK;
            case LootTableSource.REPLACED -> net.fabricmc.fabric.api.loot.v2.LootTableSource.REPLACED;
        };
    }

    public void onInitialize() {
        net.fabricmc.fabric.api.loot.v3.LootTableEvents.REPLACE.register((class059462, class050742, lootTableSource, class019292) -> ((LootTableEvents.Replace)LootTableEvents.REPLACE.invoker()).replaceLootTable(class059462, class050742, LootInitializer.toV2Source(lootTableSource)));
        net.fabricmc.fabric.api.loot.v3.LootTableEvents.MODIFY.register((class059462, class050622, lootTableSource, class019292) -> ((LootTableEvents.Modify)LootTableEvents.MODIFY.invoker()).modifyLootTable(class059462, class050622, LootInitializer.toV2Source(lootTableSource)));
        net.fabricmc.fabric.api.loot.v3.LootTableEvents.ALL_LOADED.register((class010892, class007512) -> ((LootTableEvents.Loaded)LootTableEvents.ALL_LOADED.invoker()).onLootTablesLoaded(class010892, class007512));
    }
}

