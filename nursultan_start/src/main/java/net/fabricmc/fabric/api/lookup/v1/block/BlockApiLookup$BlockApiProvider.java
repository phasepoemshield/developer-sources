/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class07209
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.lookup.v1.block;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class07209;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface BlockApiLookup$BlockApiProvider<A, C> {
    public @Nullable A find(class07299 var1, class07209 var2, class00500 var3, @Nullable class00394 var4, C var5);
}

