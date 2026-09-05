/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06581
 *  minecraft.class08041
 *  net.fabricmc.fabric.mixin.content.registry.VillagerAccessor
 *  net.fabricmc.fabric.mixin.content.registry.WorkAtComposterAccessor
 */
package net.fabricmc.fabric.impl.content.registry;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import minecraft.class06581;
import minecraft.class08041;
import net.fabricmc.fabric.impl.content.registry.util.ImmutableCollectionUtils;
import net.fabricmc.fabric.mixin.content.registry.VillagerAccessor;
import net.fabricmc.fabric.mixin.content.registry.WorkAtComposterAccessor;

public final class VillagerInteractionRegistriesImpl {
    private static final Set<class06581> GATHERABLE_ITEMS = new HashSet<class06581>();

    private VillagerInteractionRegistriesImpl() {
    }

    public static List<class06581> getCompostableRegistry() {
        return ImmutableCollectionUtils.getAsMutableList(WorkAtComposterAccessor::fabric_getCompostable, WorkAtComposterAccessor::fabric_setCompostables);
    }

    public static Set<class06581> getCollectableRegistry() {
        return GATHERABLE_ITEMS;
    }

    public static Map<class06581, Integer> getFoodRegistry() {
        return ImmutableCollectionUtils.getAsMutableMap(() -> class08041.y, VillagerAccessor::fabric_setItemFoodValues);
    }
}

