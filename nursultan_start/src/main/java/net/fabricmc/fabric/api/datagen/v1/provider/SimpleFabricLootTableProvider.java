/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class04476
 *  minecraft.class06925
 *  minecraft.class06929
 *  net.fabricmc.fabric.impl.datagen.loot.FabricLootTableProviderImpl
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class04476;
import minecraft.class06925;
import minecraft.class06929;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.fabricmc.fabric.impl.datagen.loot.FabricLootTableProviderImpl;

public abstract class SimpleFabricLootTableProvider
implements FabricLootTableProvider {
    protected final FabricDataOutput output;
    private final CompletableFuture<class01929> registryLookup;
    protected final class06929 contextType;

    public SimpleFabricLootTableProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture, class06929 class069292) {
        this.output = fabricDataOutput;
        this.registryLookup = completableFuture;
        this.contextType = class069292;
    }

    public String method_10321() {
        return String.valueOf(Objects.requireNonNull((class01894)class06925.N.inverse().get((Object)this.contextType), "Could not get id for loot context type")) + " Loot Table";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return FabricLootTableProviderImpl.run((class04476)class044762, (FabricLootTableProvider)this, (class06929)this.contextType, (FabricDataOutput)this.output, this.registryLookup);
    }
}

