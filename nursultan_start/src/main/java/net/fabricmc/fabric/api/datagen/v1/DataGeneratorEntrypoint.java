/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02061
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.datagen.v1;

import minecraft.class02061;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.JsonKeySortOrderCallback;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
public interface DataGeneratorEntrypoint {
    default public @Nullable String getEffectiveModId() {
        return null;
    }

    default public void buildRegistry(class02061 class020612) {
    }

    default public void addJsonKeySortOrders(JsonKeySortOrderCallback jsonKeySortOrderCallback) {
    }

    public void onInitializeDataGenerator(FabricDataGenerator var1);
}

