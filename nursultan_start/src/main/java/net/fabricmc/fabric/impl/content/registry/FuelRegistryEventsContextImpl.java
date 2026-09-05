/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class03767
 *  net.fabricmc.fabric.api.registry.FuelRegistryEvents$Context
 */
package net.fabricmc.fabric.impl.content.registry;

import minecraft.class01929;
import minecraft.class03767;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public record FuelRegistryEventsContextImpl(class01929 registries, class03767 enabledFeatures, int baseSmeltTime) implements FuelRegistryEvents.Context
{
}

