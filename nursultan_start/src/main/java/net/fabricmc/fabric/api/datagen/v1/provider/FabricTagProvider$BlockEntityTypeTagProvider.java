/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00404
 *  minecraft.class01929
 *  minecraft.class04227
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.concurrent.CompletableFuture;
import minecraft.class00404;
import minecraft.class01929;
import minecraft.class04227;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider$FabricValueLookupTagProvider;

public abstract class FabricTagProvider$BlockEntityTypeTagProvider
extends FabricTagProvider$FabricValueLookupTagProvider<class00404<?>> {
    public FabricTagProvider$BlockEntityTypeTagProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        super(fabricDataOutput, class04227.i, completableFuture, class004042 -> class004042.method_53254().B());
    }
}

