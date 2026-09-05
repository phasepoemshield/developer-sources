/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01929
 *  minecraft.class01997
 *  minecraft.class02024
 *  minecraft.class03519
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class07135
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.impl.datagen.FabricDataGenHelper
 *  net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class01929;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class03519;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class07135;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider$Entries;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider$RegistryEntries;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.fabricmc.fabric.impl.registry.sync.DynamicRegistriesImpl;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class FabricDynamicRegistryProvider
implements class07135 {
    private static final Logger LOGGER = LoggerFactory.getLogger(FabricDynamicRegistryProvider.class);
    private final FabricDataOutput output;
    private final CompletableFuture<class01929> registriesFuture;

    protected abstract void configure(class01929 var1, FabricDynamicRegistryProvider$Entries var2);

    public FabricDynamicRegistryProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        this.output = fabricDataOutput;
        this.registriesFuture = completableFuture;
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.registriesFuture.thenCompose(class019292 -> CompletableFuture.supplyAsync(() -> {
            FabricDynamicRegistryProvider$Entries fabricDynamicRegistryProvider$Entries = new FabricDynamicRegistryProvider$Entries((class01929)class019292, this.output.getModId());
            this.configure((class01929)class019292, fabricDynamicRegistryProvider$Entries);
            return fabricDynamicRegistryProvider$Entries;
        }).thenCompose(fabricDynamicRegistryProvider$Entries -> {
            class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
            ArrayList arrayList = new ArrayList();
            for (FabricDynamicRegistryProvider$RegistryEntries<?> fabricDynamicRegistryProvider$RegistryEntries : fabricDynamicRegistryProvider$Entries.queuedEntries.values()) {
                arrayList.add(this.writeRegistryEntries(class044762, (class03519<JsonElement>)class035192, fabricDynamicRegistryProvider$RegistryEntries));
            }
            return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
        }));
    }

    private <T> CompletableFuture<?> writeRegistryEntries(class04476 class044762, class03519<JsonElement> class035192, FabricDynamicRegistryProvider$RegistryEntries<T> fabricDynamicRegistryProvider$RegistryEntries) {
        class05946 class059462 = fabricDynamicRegistryProvider$RegistryEntries.registry;
        boolean bl = class059462.N().y().equals("minecraft") || !DynamicRegistriesImpl.FABRIC_DYNAMIC_REGISTRY_KEYS.contains(class059462);
        String string = bl ? class059462.N().N() : class059462.N().y() + "/" + class059462.N().N();
        class01997 class019972 = this.output.method_45973(class02024.field_39367, string);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : fabricDynamicRegistryProvider$RegistryEntries.entries.entrySet()) {
            Path path = class019972.N(entry.getKey().N());
            arrayList.add(FabricDynamicRegistryProvider.writeToPath(path, class044762, class035192, fabricDynamicRegistryProvider$RegistryEntries.elementCodec, entry.getValue().value(), entry.getValue().conditions()));
        }
        return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
    }

    private static <E> CompletableFuture<?> writeToPath(Path path, class04476 class044762, DynamicOps<JsonElement> dynamicOps, Encoder<E> encoder, E e, @Nullable ResourceCondition[] resourceConditionArray) {
        Optional optional = encoder.encodeStart(dynamicOps, e).resultOrPartial(string -> LOGGER.error("Couldn't serialize element {}: {}", (Object)path, string));
        if (optional.isPresent()) {
            JsonElement jsonElement = (JsonElement)optional.get();
            if (resourceConditionArray != null && resourceConditionArray.length > 0) {
                if (!jsonElement.isJsonObject()) {
                    throw new IllegalStateException("Cannot add conditions to " + String.valueOf(path) + ": JSON is a non-object value");
                }
                FabricDataGenHelper.addConditions((JsonObject)jsonElement.getAsJsonObject(), (ResourceCondition[])resourceConditionArray);
            }
            return class07135.N((class04476)class044762, (JsonElement)jsonElement, (Path)path);
        }
        return CompletableFuture.completedFuture(null);
    }
}

