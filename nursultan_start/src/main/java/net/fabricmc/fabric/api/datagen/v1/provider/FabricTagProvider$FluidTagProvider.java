/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class04227
 *  minecraft.class04651
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.concurrent.CompletableFuture;
import minecraft.class01929;
import minecraft.class04227;
import minecraft.class04651;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider$FabricValueLookupTagProvider;

public abstract class FabricTagProvider$FluidTagProvider
extends FabricTagProvider$FabricValueLookupTagProvider<class04651> {
    public FabricTagProvider$FluidTagProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        super(fabricDataOutput, class04227.e, completableFuture, class046512 -> class046512.U().B());
    }
}

