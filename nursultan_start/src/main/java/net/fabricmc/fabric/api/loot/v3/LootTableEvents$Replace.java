/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class05074
 *  minecraft.class05946
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.loot.v3;

import minecraft.class01929;
import minecraft.class05074;
import minecraft.class05946;
import net.fabricmc.fabric.api.loot.v3.LootTableSource;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface LootTableEvents$Replace {
    public @Nullable class05074 replaceLootTable(class05946<class05074> var1, class05074 var2, LootTableSource var3, class01929 var4);
}

