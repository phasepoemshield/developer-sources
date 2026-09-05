/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.lookup.v1.block;

import minecraft.class00394;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface BlockApiLookup$BlockEntityApiProvider<A, C> {
    public @Nullable A find(class00394 var1, C var2);
}

