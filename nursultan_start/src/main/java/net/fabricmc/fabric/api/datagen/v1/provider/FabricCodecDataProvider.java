/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01997
 *  minecraft.class02024
 *  minecraft.class03519
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class07135
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01997;
import minecraft.class02024;
import minecraft.class03519;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class07135;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

public abstract class FabricCodecDataProvider<T>
implements class07135 {
    private final class01997 pathResolver;
    private final CompletableFuture<class01929> registriesFuture;
    private final Codec<T> codec;

    protected abstract void configure(BiConsumer<class01894, T> var1, class01929 var2);

    private FabricCodecDataProvider(class01997 class019972, CompletableFuture<class01929> completableFuture, Codec<T> codec) {
        this.pathResolver = class019972;
        this.registriesFuture = Objects.requireNonNull(completableFuture);
        this.codec = codec;
    }

    protected FabricCodecDataProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture, class05946<? extends class00751<?>> class059462, Codec<T> codec) {
        this(fabricDataOutput.method_60917(class059462), completableFuture, codec);
    }

    protected FabricCodecDataProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture, class02024 class020242, String string, Codec<T> codec) {
        this(fabricDataOutput.method_45973(class020242, string), completableFuture, codec);
    }

    private JsonElement convert(class01894 class018942, T t, DynamicOps<JsonElement> dynamicOps) {
        DataResult dataResult = this.codec.encodeStart(dynamicOps, t);
        return (JsonElement)dataResult.mapError(string -> "Invalid entry %s: %s".formatted(new Object[]{class018942, string})).getOrThrow();
    }

    private CompletableFuture<?> write(class04476 class044762, Map<class01894, JsonElement> map) {
        return CompletableFuture.allOf((CompletableFuture[])map.entrySet().stream().map(entry -> {
            Path path = this.pathResolver.N((class01894)entry.getKey());
            return class07135.N((class04476)class044762, (JsonElement)((JsonElement)entry.getValue()), (Path)path);
        }).toArray(CompletableFuture[]::new));
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.registriesFuture.thenCompose(class019292 -> {
            HashMap<class01894, JsonElement> hashMap = new HashMap<class01894, JsonElement>();
            class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
            BiConsumer<class01894, Object> biConsumer = (class018942, object) -> {
                JsonElement jsonElement = this.convert((class01894)class018942, (T)object, (DynamicOps<JsonElement>)class035192);
                JsonElement jsonElement2 = hashMap.put((class01894)class018942, jsonElement);
                if (jsonElement2 != null) {
                    throw new IllegalArgumentException("Duplicate entry " + String.valueOf(class018942));
                }
            };
            this.configure((BiConsumer<class01894, T>)biConsumer, (class01929)class019292);
            return this.write(class044762, hashMap);
        });
    }
}

