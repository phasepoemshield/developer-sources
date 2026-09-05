/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02024
 *  minecraft.class04476
 *  minecraft.class07135
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.nio.file.Path;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02024;
import minecraft.class04476;
import minecraft.class07135;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider$TranslationBuilder;

public abstract class FabricLanguageProvider
implements class07135 {
    protected final FabricDataOutput dataOutput;
    private final String languageCode;
    private final CompletableFuture<class01929> registryLookup;

    protected FabricLanguageProvider(FabricDataOutput fabricDataOutput, CompletableFuture<class01929> completableFuture) {
        this(fabricDataOutput, "en_us", completableFuture);
    }

    protected FabricLanguageProvider(FabricDataOutput fabricDataOutput, String string, CompletableFuture<class01929> completableFuture) {
        this.dataOutput = fabricDataOutput;
        this.languageCode = string;
        this.registryLookup = completableFuture;
    }

    public String method_10321() {
        return "Language (%s)".formatted(new Object[]{this.languageCode});
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        TreeMap treeMap = new TreeMap();
        return this.registryLookup.thenCompose(class019292 -> {
            this.generateTranslations((class01929)class019292, (string, string2) -> {
                Objects.requireNonNull(string);
                Objects.requireNonNull(string2);
                if (treeMap.containsKey(string)) {
                    throw new RuntimeException("Existing translation key found - " + string + " - Duplicate will be ignored.");
                }
                treeMap.put(string, string2);
            });
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry entry : treeMap.entrySet()) {
                jsonObject.addProperty((String)entry.getKey(), (String)entry.getValue());
            }
            return class07135.N((class04476)class044762, (JsonElement)jsonObject, (Path)this.getLangFilePath(this.languageCode));
        });
    }

    public abstract void generateTranslations(class01929 var1, FabricLanguageProvider$TranslationBuilder var2);

    protected Path getLangFilePath(String string) {
        return this.dataOutput.method_45973(class02024.field_39368, "lang").N(class01894.N((String)this.dataOutput.getModId(), (String)string));
    }
}

