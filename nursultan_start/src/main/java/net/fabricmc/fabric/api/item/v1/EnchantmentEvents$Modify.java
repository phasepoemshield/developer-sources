/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05946
 *  minecraft.class07301
 *  minecraft.class07304
 */
package net.fabricmc.fabric.api.item.v1;

import minecraft.class05946;
import minecraft.class07301;
import minecraft.class07304;
import net.fabricmc.fabric.api.item.v1.EnchantmentSource;

@FunctionalInterface
public interface EnchantmentEvents$Modify {
    public void modify(class05946<class07304> var1, class07301 var2, EnchantmentSource var3);
}

