/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01929
 *  minecraft.class02061
 *  minecraft.class02076
 *  minecraft.class02965
 *  minecraft.class04105
 *  minecraft.class04206
 *  minecraft.class07135
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint
 *  net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator
 *  net.fabricmc.fabric.api.event.registry.DynamicRegistries
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.impl.datagen.FabricDataGenHelper$1BuilderData
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.entrypoint.EntrypointContainer
 *  org.apache.commons.lang3.ArrayUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.datagen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01929;
import minecraft.class02061;
import minecraft.class02076;
import minecraft.class02965;
import minecraft.class04105;
import minecraft.class04206;
import minecraft.class07135;
import minecraft.class07536;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.event.registry.DynamicRegistries;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;
import org.apache.commons.lang3.ArrayUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class FabricDataGenHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger(FabricDataGenHelper.class);
    public static final boolean ENABLED = System.getProperty("fabric-api.datagen") != null;
    private static final String OUTPUT_DIR = System.getProperty("fabric-api.datagen.output-dir");
    private static final boolean STRICT_VALIDATION = System.getProperty("fabric-api.datagen.strict-validation") != null;
    private static final @Nullable String MOD_ID_FILTER = System.getProperty("fabric-api.datagen.modid");
    private static final String ENTRYPOINT_KEY = "fabric-datagen";
    private static final Map<Object, ResourceCondition[]> CONDITIONS_MAP = new IdentityHashMap<Object, ResourceCondition[]>();

    public static void addConditions(Object object, ResourceCondition[] resourceConditionArray) {
        CONDITIONS_MAP.merge(object, resourceConditionArray, ArrayUtils::addAll);
    }

    public static void addConditions(JsonObject jsonObject, ResourceCondition ... resourceConditionArray) {
        if (jsonObject.has("fabric:load_conditions")) {
            throw new IllegalArgumentException("Object already has a condition entry: " + String.valueOf(jsonObject));
        }
        if (resourceConditionArray == null || resourceConditionArray.length == 0) {
            return;
        }
        jsonObject.add("fabric:load_conditions", (JsonElement)ResourceCondition.LIST_CODEC.encodeStart((DynamicOps)JsonOps.INSTANCE, Arrays.asList(resourceConditionArray)).getOrThrow());
    }

    public static @Nullable ResourceCondition[] consumeConditions(Object object) {
        return CONDITIONS_MAP.remove(object);
    }

    private static void runInternal() {
        Path path = Paths.get(Objects.requireNonNull(OUTPUT_DIR, "No output dir provided with the 'fabric-api.datagen.output-dir' property"), new String[0]);
        List list = FabricLoader.getInstance().getEntrypointContainers(ENTRYPOINT_KEY, DataGeneratorEntrypoint.class);
        if (list.isEmpty()) {
            LOGGER.warn("No data generator entrypoints are defined. Implement {} and add your class to the '{}' entrypoint key in your fabric.mod.json.", (Object)DataGeneratorEntrypoint.class.getName(), (Object)ENTRYPOINT_KEY);
        }
        List list2 = list.stream().map(EntrypointContainer::getEntrypoint).toList();
        CompletableFuture<class01929> completableFuture = CompletableFuture.supplyAsync(() -> FabricDataGenHelper.createRegistryWrapper(list2), (Executor)class07536.B());
        Object2IntOpenHashMap object2IntOpenHashMap = (Object2IntOpenHashMap)class07135.y;
        Object2IntOpenHashMap object2IntOpenHashMap2 = new Object2IntOpenHashMap((Object2IntMap)object2IntOpenHashMap);
        for (EntrypointContainer entrypointContainer : list) {
            String string2 = entrypointContainer.getProvider().getMetadata().getId();
            if (MOD_ID_FILTER != null && !string2.equals(MOD_ID_FILTER)) continue;
            LOGGER.info("Running data generator for {}", (Object)string2);
            try {
                DataGeneratorEntrypoint dataGeneratorEntrypoint = (DataGeneratorEntrypoint)entrypointContainer.getEntrypoint();
                String string3 = dataGeneratorEntrypoint.getEffectiveModId();
                ModContainer modContainer = entrypointContainer.getProvider();
                HashSet hashSet = new HashSet();
                dataGeneratorEntrypoint.addJsonKeySortOrders((string, n) -> {
                    Objects.requireNonNull(string, "Tried to register a priority for a null key");
                    object2IntOpenHashMap.put((Object)string, n);
                    hashSet.add(string);
                });
                if (string3 != null) {
                    modContainer = (ModContainer)FabricLoader.getInstance().getModContainer(string3).orElseThrow(() -> new RuntimeException("Failed to find effective mod container for mod id (%s)".formatted(new Object[]{string3})));
                }
                FabricDataGenerator fabricDataGenerator = new FabricDataGenerator(path, modContainer, STRICT_VALIDATION, completableFuture);
                dataGeneratorEntrypoint.onInitializeDataGenerator(fabricDataGenerator);
                fabricDataGenerator.method_10315();
                object2IntOpenHashMap.keySet().removeAll(hashSet);
                object2IntOpenHashMap.putAll((Map)object2IntOpenHashMap2);
            }
            catch (Throwable throwable) {
                throw new RuntimeException("Failed to run data generator from mod (%s)".formatted(new Object[]{string2}), throwable);
            }
        }
    }

    private FabricDataGenHelper() {
    }

    public static void run() {
        try {
            FabricDataGenHelper.runInternal();
        }
        catch (Throwable throwable) {
            LOGGER.error(LogUtils.FATAL_MARKER, "Failed to run data generation", throwable);
            System.exit(-1);
        }
    }

    private static class01929 createRegistryWrapper(List<DataGeneratorEntrypoint> list) {
        ArrayList<class02061> arrayList = new ArrayList<class02061>();
        arrayList.add(class04105.N);
        for (DataGeneratorEntrypoint object22 : list) {
            class02061 class020612 = new class02061();
            object22.buildRegistry(class020612);
            arrayList.add(class020612);
        }
        HashMap hashMap = new HashMap();
        for (class02965 class029652 : DynamicRegistries.getDynamicRegistries()) {
            hashMap.computeIfAbsent(class029652.N(), class059462 -> new 1BuilderData(class059462));
        }
        for (class02061 class020613 : arrayList) {
            for (class02076 class020762 : class020613.N) {
                hashMap.computeIfAbsent(class020762.N(), class059462 -> new 1BuilderData(class059462)).with(class020762);
            }
        }
        class02061 class020614 = new class02061();
        for (1BuilderData builderData : hashMap.values()) {
            builderData.apply(class020614);
        }
        class01929 class019292 = class020614.N((class01042)class01042.N((class00751)class04206.NF));
        class04105.N((class01929)class019292);
        return class019292;
    }
}

