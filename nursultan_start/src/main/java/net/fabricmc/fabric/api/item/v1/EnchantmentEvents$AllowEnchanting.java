/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class06584
 *  minecraft.class07304
 *  net.fabricmc.fabric.api.util.TriState
 */
package net.fabricmc.fabric.api.item.v1;

import minecraft.class03556;
import minecraft.class06584;
import minecraft.class07304;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import net.fabricmc.fabric.api.util.TriState;

@FunctionalInterface
public interface EnchantmentEvents$AllowEnchanting {
    public TriState allowEnchanting(class03556<class07304> var1, class06584 var2, EnchantingContext var3);
}

