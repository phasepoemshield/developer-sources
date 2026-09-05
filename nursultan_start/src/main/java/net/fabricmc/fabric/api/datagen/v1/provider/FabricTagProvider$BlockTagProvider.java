/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01929
 *  minecraft.class04227
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.concurrent.CompletableFuture;
import minecraft.class00891;
import minecraft.class01929;
import minecraft.class04227;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider$FabricValueLookupTagProvider;

public abstract class FabricTagProvider$BlockTagProvider
extends FabricTagProvider$FabricValueLookupTagProvider<class00891> {
    public FabricTagProvider$BlockTagProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        super(fabricDataOutput, class04227.Z, completableFuture, class008912 -> class008912.s().B());
    }
}

