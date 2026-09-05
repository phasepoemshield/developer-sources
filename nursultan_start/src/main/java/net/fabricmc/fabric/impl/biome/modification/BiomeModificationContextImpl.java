/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class00780
 *  minecraft.class01042
 *  minecraft.class03529
 *  minecraft.class05946
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$AttributesContext
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$EffectsContext
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$GenerationSettingsContext
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$SpawnSettingsContext
 *  net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$WeatherContext
 */
package net.fabricmc.fabric.impl.biome.modification;

import minecraft.class00751;
import minecraft.class00780;
import minecraft.class01042;
import minecraft.class03529;
import minecraft.class05946;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl$AttributesContextImpl;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl$EffectsContextImpl;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl$GenerationSettingsContextImpl;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl$SpawnSettingsContextImpl;
import net.fabricmc.fabric.impl.biome.modification.BiomeModificationContextImpl$WeatherContextImpl;

public class BiomeModificationContextImpl
implements BiomeModificationContext {
    final class01042 registries;
    final class00780 biome;
    private final BiomeModificationContext.WeatherContext weather;
    final BiomeModificationContext.AttributesContext attributes;
    private final BiomeModificationContext.EffectsContext effects;
    private final BiomeModificationContextImpl$GenerationSettingsContextImpl generationSettings;
    private final BiomeModificationContextImpl$SpawnSettingsContextImpl spawnSettings;

    public BiomeModificationContextImpl(class01042 class010422, class00780 class007802) {
        this.registries = class010422;
        this.biome = class007802;
        this.weather = new BiomeModificationContextImpl$WeatherContextImpl(this);
        this.attributes = new BiomeModificationContextImpl$AttributesContextImpl(this);
        this.effects = new BiomeModificationContextImpl$EffectsContextImpl(this);
        this.generationSettings = new BiomeModificationContextImpl$GenerationSettingsContextImpl(this);
        this.spawnSettings = new BiomeModificationContextImpl$SpawnSettingsContextImpl(this);
    }

    void freeze() {
        this.generationSettings.freeze();
        this.spawnSettings.freeze();
    }

    public BiomeModificationContext.AttributesContext getAttributes() {
        return this.attributes;
    }

    static <T> class03529<T> getEntry(class00751<T> class007512, class05946<T> class059462) {
        class03529 class035292 = class007512.N(class059462).orElse(null);
        if (class035292 == null) {
            throw new IllegalArgumentException("Couldn't find registry entry for " + String.valueOf(class059462));
        }
        return class035292;
    }

    public BiomeModificationContext.GenerationSettingsContext getGenerationSettings() {
        return this.generationSettings;
    }

    public BiomeModificationContext.EffectsContext getEffects() {
        return this.effects;
    }

    boolean shouldRebuildFeatures() {
        return this.generationSettings.rebuildFeatures;
    }

    public BiomeModificationContext.WeatherContext getWeather() {
        return this.weather;
    }

    public BiomeModificationContext.SpawnSettingsContext getSpawnSettings() {
        return this.spawnSettings;
    }
}

