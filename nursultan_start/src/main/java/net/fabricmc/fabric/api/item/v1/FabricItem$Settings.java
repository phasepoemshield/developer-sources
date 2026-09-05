/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class06573
 *  net.fabricmc.fabric.impl.item.FabricItemInternals
 */
package net.fabricmc.fabric.api.item.v1;

import minecraft.class01894;
import minecraft.class06573;
import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import net.fabricmc.fabric.impl.item.FabricItemInternals;

public interface FabricItem$Settings {
    default public class06573 customDamage(CustomDamageHandler customDamageHandler) {
        FabricItemInternals.computeExtraData((class06573)((class06573)this)).customDamage(customDamageHandler);
        return (class06573)this;
    }

    default public class06573 equipmentSlot(EquipmentSlotProvider equipmentSlotProvider) {
        FabricItemInternals.computeExtraData((class06573)((class06573)this)).equipmentSlot(equipmentSlotProvider);
        return (class06573)this;
    }

    default public class06573 modelId(class01894 class018942) {
        return (class06573)this;
    }
}

