/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00743
 *  minecraft.class06584
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 */
package net.caffeinemc.mods.lithium.common.hopper;

import minecraft.class00743;
import minecraft.class06584;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;

public class InventoryHelper {
    public static LithiumStackList getLithiumStackListOrNull(LithiumInventory lithiumInventory) {
        class00743 class007432 = lithiumInventory.getInventoryLithium();
        if (class007432 instanceof LithiumStackList) {
            LithiumStackList lithiumStackList = (LithiumStackList)class007432;
            return lithiumStackList;
        }
        return null;
    }

    public static LithiumStackList getLithiumStackList(LithiumInventory lithiumInventory) {
        class00743 class007432 = lithiumInventory.getInventoryLithium();
        if (class007432 instanceof LithiumStackList) {
            LithiumStackList lithiumStackList = (LithiumStackList)class007432;
            return lithiumStackList;
        }
        return InventoryHelper.upgradeToLithiumStackList(lithiumInventory);
    }

    private static LithiumStackList upgradeToLithiumStackList(LithiumInventory lithiumInventory) {
        lithiumInventory.generateLootLithium();
        class00743 class007432 = lithiumInventory.getInventoryLithium();
        LithiumStackList lithiumStackList = new LithiumStackList((class00743<class06584>)class007432, lithiumInventory.method_5444());
        lithiumInventory.setInventoryLithium((class00743)lithiumStackList);
        return lithiumStackList;
    }
}

