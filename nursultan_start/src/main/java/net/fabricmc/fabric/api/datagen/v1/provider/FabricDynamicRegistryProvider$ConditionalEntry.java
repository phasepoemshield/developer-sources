/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import org.jspecify.annotations.Nullable;

record FabricDynamicRegistryProvider$ConditionalEntry<T>(T value, @Nullable ResourceCondition[] conditions) {
}

