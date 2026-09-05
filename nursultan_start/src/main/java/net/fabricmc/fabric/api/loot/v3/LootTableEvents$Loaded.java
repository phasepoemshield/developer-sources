/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01089
 *  minecraft.class05074
 */
package net.fabricmc.fabric.api.loot.v3;

import minecraft.class00751;
import minecraft.class01089;
import minecraft.class05074;

@FunctionalInterface
public interface LootTableEvents$Loaded {
    public void onLootTablesLoaded(class01089 var1, class00751<class05074> var2);
}

