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

public interface ItemExtensions {
    public @Nullable CustomDamageHandler fabric_getCustomDamageHandler();

    public @Nullable EquipmentSlotProvider fabric_getEquipmentSlotProvider();

    public void fabric_setCustomDamageHandler(CustomDamageHandler var1);

    public void fabric_setEquipmentSlotProvider(EquipmentSlotProvider var1);
}

