/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class04476
 *  minecraft.class07135
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl
 *  net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl$SoundType
 */
package net.fabricmc.fabric.api.client.datagen.v1.provider;

import com.mojang.serialization.Codec;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class04476;
import minecraft.class07135;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricSoundsProvider$SoundExporter;
import net.fabricmc.fabric.impl.datagen.client.SoundTypeBuilderImpl;

@Environment(value=EnvType.CLIENT)
public abstract class FabricSoundsProvider
implements class07135 {
    private static final Codec<Map<String, SoundTypeBuilderImpl.SoundType>> CODEC = Codec.unboundedMap((Codec)Codec.STRING, (Codec)SoundTypeBuilderImpl.SoundType.CODEC);
    private final CompletableFuture<class01929> registriesFuture;
    private final class01996 output;

    protected abstract void configure(class01929 var1, FabricSoundsProvider$SoundExporter var2);

    public FabricSoundsProvider(class01996 class019962, CompletableFuture<class01929> completableFuture) {
        this.registriesFuture = completableFuture;
        this.output = class019962;
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.registriesFuture.thenCompose(class019292 -> {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.configure((class01929)class019292, (class018942, soundTypeBuilder) -> {
                if (linkedHashMap.computeIfAbsent(class018942.y(), string -> new LinkedHashMap()).put(class018942.N(), ((SoundTypeBuilderImpl)soundTypeBuilder).build()) != null) {
                    throw new IllegalStateException("Duplicate sound for event " + String.valueOf(class018942));
                }
            });
            return CompletableFuture.allOf((CompletableFuture[])linkedHashMap.entrySet().stream().map(entry -> {
                Path path = this.output.method_45972(class02024.field_39368).resolve((String)entry.getKey() + "/sounds.json");
                return class07135.N((class04476)class044762, (class01929)class019292, CODEC, (Object)((Map)entry.getValue()), (Path)path);
            }).toArray(CompletableFuture[]::new));
        });
    }
}

