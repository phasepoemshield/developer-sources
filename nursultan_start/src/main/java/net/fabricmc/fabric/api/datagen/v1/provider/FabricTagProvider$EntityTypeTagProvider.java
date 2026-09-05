/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class04227
 *  minecraft.class07078
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.concurrent.CompletableFuture;
import minecraft.class01929;
import minecraft.class04227;
import minecraft.class07078;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider$FabricValueLookupTagProvider;

public abstract class FabricTagProvider$EntityTypeTagProvider
extends FabricTagProvider$FabricValueLookupTagProvider<class07078<?>> {
    public FabricTagProvider$EntityTypeTagProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        super(fabricDataOutput, class04227.I, completableFuture, class070782 -> class070782.T().B());
    }
}

