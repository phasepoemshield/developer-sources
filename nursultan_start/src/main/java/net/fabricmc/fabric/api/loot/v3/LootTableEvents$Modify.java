/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class05062
 *  minecraft.class05074
 *  minecraft.class05946
 */
package net.fabricmc.fabric.api.loot.v3;

import minecraft.class01929;
import minecraft.class05062;
import minecraft.class05074;
import minecraft.class05946;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;

@FunctionalInterface
public interface LootTableEvents$Modify {
    public void modifyLootTable(class05946<class05074> var1, class05062 var2, LootTableSource var3, class01929 var4);
}

