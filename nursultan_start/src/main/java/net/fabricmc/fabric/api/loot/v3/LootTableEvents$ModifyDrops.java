/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class05074
 *  minecraft.class05908
 *  minecraft.class06584
 */
package net.fabricmc.fabric.api.loot.v3;

import java.util.List;
import minecraft.class03556;
import minecraft.class05074;
import minecraft.class05908;
import minecraft.class06584;

@FunctionalInterface
public interface LootTableEvents$ModifyDrops {
    public void modifyLootTableDrops(class03556<class05074> var1, class05908 var2, List<class06584> var3);
}

