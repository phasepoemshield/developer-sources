/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.lookup.v1.item;

import minecraft.class06584;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface ItemApiLookup$ItemApiProvider<A, C> {
    public @Nullable A find(class06584 var1, C var2);
}

