/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06573
 *  minecraft.class06581
 */
package net.fabricmc.fabric.impl.item;

import java.util.WeakHashMap;
import minecraft.class06573;
import minecraft.class06581;
import net.fabricmc.fabric.impl.item.FabricItemInternals$ExtraData;
import net.fabricmc.fabric.impl.item.ItemExtensions;

public final class FabricItemInternals {
    private static final WeakHashMap<class06573, FabricItemInternals$ExtraData> extraData = new WeakHashMap();

    private FabricItemInternals() {
    }

    public static FabricItemInternals$ExtraData computeExtraData(class06573 class065733) {
        return extraData.computeIfAbsent(class065733, class065732 -> new FabricItemInternals$ExtraData());
    }

    public static void onBuild(class06573 class065732, class06581 class065812) {
        FabricItemInternals$ExtraData fabricItemInternals$ExtraData = extraData.get(class065732);
        if (fabricItemInternals$ExtraData != null) {
            ((ItemExtensions)class065812).fabric_setEquipmentSlotProvider(fabricItemInternals$ExtraData.equipmentSlotProvider);
            ((ItemExtensions)class065812).fabric_setCustomDamageHandler(fabricItemInternals$ExtraData.customDamageHandler);
        }
    }
}

