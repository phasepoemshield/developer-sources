/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04425
 *  minecraft.class07209
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.registry;

import minecraft.class00500;
import minecraft.class04425;
import minecraft.class07209;
import minecraft.class07290;
import net.fabricmc.fabric.api.registry.LandPathNodeTypesRegistry$PathNodeTypeProvider;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public non-sealed interface LandPathNodeTypesRegistry$DynamicPathNodeTypeProvider
extends LandPathNodeTypesRegistry$PathNodeTypeProvider {
    public @Nullable class04425 getPathNodeType(class00500 var1, class07290 var2, class07209 var3, boolean var4);
}

