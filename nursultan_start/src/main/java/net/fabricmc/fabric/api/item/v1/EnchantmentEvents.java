/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class05946
 *  minecraft.class07304
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.util.TriState
 */
package net.fabricmc.fabric.api.item.v1;

import minecraft.class03556;
import minecraft.class05946;
import minecraft.class07304;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.item.v1.EnchantmentEvents$AllowEnchanting;
import net.fabricmc.fabric.api.item.v1.EnchantmentEvents$Modify;
import net.fabricmc.fabric.api.util.TriState;

public final class EnchantmentEvents {
    public static final Event<EnchantmentEvents$AllowEnchanting> ALLOW_ENCHANTING = EventFactory.createArrayBacked(EnchantmentEvents$AllowEnchanting.class, enchantmentEvents$AllowEnchantingArray -> (class035562, class065842, enchantingContext) -> {
        for (EnchantmentEvents$AllowEnchanting enchantmentEvents$AllowEnchanting : enchantmentEvents$AllowEnchantingArray) {
            TriState triState = enchantmentEvents$AllowEnchanting.allowEnchanting((class03556<class07304>)class035562, class065842, enchantingContext);
            if (triState == TriState.DEFAULT) continue;
            return triState;
        }
        return TriState.DEFAULT;
    });
    public static final Event<EnchantmentEvents$Modify> MODIFY = EventFactory.createArrayBacked(EnchantmentEvents$Modify.class, enchantmentEvents$ModifyArray -> (class059462, class073012, enchantmentSource) -> {
        for (EnchantmentEvents$Modify enchantmentEvents$Modify : enchantmentEvents$ModifyArray) {
            enchantmentEvents$Modify.modify((class05946<class07304>)class059462, class073012, enchantmentSource);
        }
    });

    private EnchantmentEvents() {
    }
}

