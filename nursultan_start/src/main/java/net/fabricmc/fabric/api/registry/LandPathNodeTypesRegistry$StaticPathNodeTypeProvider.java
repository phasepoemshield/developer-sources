/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04425
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.registry;

import minecraft.class00500;
import minecraft.class04425;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry$PathNodeTypeProvider;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public non-sealed interface LandPathNodeTypesRegistry$StaticPathNodeTypeProvider
extends LandPathNodeTypesRegistry$PathNodeTypeProvider {
    public @Nullable class04425 getPathNodeType(class00500 var1, boolean var2);
}

