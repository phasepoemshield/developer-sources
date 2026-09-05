/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.biome.v1;

import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$AttributesContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$EffectsContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$GenerationSettingsContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$SpawnSettingsContext;
import net.fabricmc.fabric.api.biome.v1.BiomeModificationContext$WeatherContext;

public interface BiomeModificationContext {
    public BiomeModificationContext$AttributesContext getAttributes();

    public BiomeModificationContext$GenerationSettingsContext getGenerationSettings();

    public BiomeModificationContext$EffectsContext getEffects();

    public BiomeModificationContext$WeatherContext getWeather();

    public BiomeModificationContext$SpawnSettingsContext getSpawnSettings();
}

