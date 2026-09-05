/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class03519
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class05074
 *  minecraft.class06929
 *  minecraft.class07135
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataOutput
 *  net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 */
package net.fabricmc.fabric.impl.datagen.loot;

import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class03519;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class05074;
import minecraft.class06929;
import minecraft.class07135;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;

public final class FabricLootTableProviderImpl {
    private FabricLootTableProviderImpl() {
    }

    public static CompletableFuture<?> run(class04476 class044762, FabricLootTableProvider fabricLootTableProvider, class06929 class069292, FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        HashMap hashMap = Maps.newHashMap();
        HashMap hashMap2 = new HashMap();
        return completableFuture.thenCompose(class019292 -> {
            fabricLootTableProvider.method_10399((class059462, class050622) -> {
                ResourceCondition[] resourceConditionArray = FabricDataGenHelper.consumeConditions(class050622);
                hashMap2.put(class059462.N(), resourceConditionArray);
                if (hashMap.put(class059462.N(), class050622.N(class069292).L()) != null) {
                    throw new IllegalStateException("Duplicate loot table " + String.valueOf(class059462.N()));
                }
            });
            class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
            ArrayList<CompletableFuture> arrayList = new ArrayList<CompletableFuture>();
            for (Map.Entry entry : hashMap.entrySet()) {
                JsonObject jsonObject = (JsonObject)class05074.u.encodeStart((DynamicOps)class035192, (Object)((class05074)entry.getValue())).getOrThrow(IllegalStateException::new);
                FabricDataGenHelper.addConditions(jsonObject, (ResourceCondition[])hashMap2.remove(entry.getKey()));
                arrayList.add(class07135.N((class04476)class044762, (JsonElement)jsonObject, (Path)FabricLootTableProviderImpl.getOutputPath(fabricDataOutput, (class01894)entry.getKey())));
            }
            return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
        });
    }

    private static Path getOutputPath(FabricDataOutput fabricDataOutput, class01894 class018942) {
        return fabricDataOutput.method_60917(class04227.yJ).N(class018942);
    }
}

