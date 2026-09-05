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
import net.fabricmc.fabric.api.item.v1.EnchantmentEvents;
import net.fabricmc.fabric.api.item.v1.EnchantmentEvents$AllowEnchanting;
import net.fabricmc.fabric.api.util.TriState;

public interface FabricItemStack {
    default public String getCreatorNamespace() {
        return ((class06584)this).B().getCreatorNamespace((class06584)this);
    }

    default public class06584 getRecipeRemainder() {
        return ((class06584)this).B().getRecipeRemainder((class06584)this);
    }

    default public boolean canBeEnchantedWith(class03556<class07304> class035562, EnchantingContext enchantingContext) {
        TriState triState = ((EnchantmentEvents$AllowEnchanting)EnchantmentEvents.ALLOW_ENCHANTING.invoker()).allowEnchanting(class035562, (class06584)this, enchantingContext);
        return triState.orElseGet(() -> ((class06584)this).B().canBeEnchantedWith((class06584)this, class035562, enchantingContext));
    }
}

