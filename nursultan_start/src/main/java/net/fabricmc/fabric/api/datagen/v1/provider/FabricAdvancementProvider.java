/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.collect.Sets
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01929
 *  minecraft.class01997
 *  minecraft.class03519
 *  minecraft.class03711
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class07135
 *  minecraft.class07151
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.impl.datagen.FabricDataGenHelper
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import minecraft.class01929;
import minecraft.class01997;
import minecraft.class03519;
import minecraft.class03711;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class07135;
import minecraft.class07151;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;

public abstract class FabricAdvancementProvider
implements class07135 {
    protected final FabricDataOutput output;
    private final class01997 pathResolver;
    private final CompletableFuture<class01929> registryLookup;

    protected FabricAdvancementProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        this.output = fabricDataOutput;
        this.pathResolver = fabricDataOutput.method_60917(class04227.yK);
        this.registryLookup = completableFuture;
    }

    public String method_10321() {
        return "Advancements";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.registryLookup.thenCompose(class019292 -> {
            HashSet hashSet = Sets.newHashSet();
            HashSet hashSet2 = Sets.newHashSet();
            this.generateAdvancement((class01929)class019292, hashSet2::add);
            class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
            ArrayList<CompletableFuture> arrayList = new ArrayList<CompletableFuture>();
            for (class03711 class037112 : hashSet2) {
                if (!hashSet.add(class037112.N())) {
                    throw new IllegalStateException("Duplicate advancement " + String.valueOf(class037112.N()));
                }
                JsonObject jsonObject = ((JsonElement)class07151.N.encodeStart((DynamicOps)class035192, (Object)class037112.y()).getOrThrow(IllegalStateException::new)).getAsJsonObject();
                FabricDataGenHelper.addConditions((JsonObject)jsonObject, (ResourceCondition[])FabricDataGenHelper.consumeConditions((Object)class037112));
                arrayList.add(class07135.N((class04476)class044762, (JsonElement)jsonObject, (Path)this.getOutputPath(class037112)));
            }
            return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
        });
    }

    protected Consumer<class03711> withConditions(Consumer<class03711> consumer, ResourceCondition ... resourceConditionArray) {
        Preconditions.checkArgument((resourceConditionArray.length > 0 ? 1 : 0) != 0, (Object)"Must add at least one condition.");
        return class037112 -> {
            FabricDataGenHelper.addConditions((Object)class037112, (ResourceCondition[])resourceConditionArray);
            consumer.accept((class03711)class037112);
        };
    }

    public abstract void generateAdvancement(class01929 var1, Consumer<class03711> var2);

    private Path getOutputPath(class03711 class037112) {
        return this.pathResolver.N(class037112.N());
    }
}

