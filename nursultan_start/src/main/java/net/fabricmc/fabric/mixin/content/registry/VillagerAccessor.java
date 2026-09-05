/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06581
 *  minecraft.class08041
 */
package net.fabricmc.fabric.mixin.content.registry;

import java.util.Map;
import minecraft.class06581;
import minecraft.class08041;

public interface VillagerAccessor {
    public static /* synthetic */ void fabric_setItemFoodValues(Map<class06581, Integer> map) {
        class08041.N(map);
    }
}

