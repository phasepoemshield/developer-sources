/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.item.v1.CustomDamageHandler
 *  net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.item;

import net.fabricmc.fabric.api.item.v1.CustomDamageHandler;
import net.fabricmc.fabric.api.item.v1.EquipmentSlotProvider;
import org.jspecify.annotations.Nullable;

public final class FabricItemInternals$ExtraData {
    @Nullable EquipmentSlotProvider equipmentSlotProvider;
    @Nullable CustomDamageHandler customDamageHandler;

    public void customDamage(CustomDamageHandler customDamageHandler) {
        this.customDamageHandler = customDamageHandler;
    }

    public void equipmentSlot(EquipmentSlotProvider equipmentSlotProvider) {
        this.equipmentSlotProvider = equipmentSlotProvider;
    }
}

