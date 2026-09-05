/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.registry;

import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry$DynamicPathNodeTypeProvider;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry$StaticPathNodeTypeProvider;

public sealed interface LandPathNodeTypesRegistry$PathNodeTypeProvider
permits LandPathNodeTypesRegistry.StaticPathNodeTypeProvider, LandPathNodeTypesRegistry$DynamicPathNodeTypeProvider {
}

