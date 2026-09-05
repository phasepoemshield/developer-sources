/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01929
 *  minecraft.class07135
 */
package net.fabricmc.fabric.api.datagen.v1;

import java.util.concurrent.CompletableFuture;
import minecraft.class01929;
import minecraft.class07135;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

@FunctionalInterface
public interface FabricDataGenerator$Pack$RegistryDependentFactory<T extends class07135> {
    public T create(FabricDataOutput var1, CompletableFuture<class01929> var2);
}

