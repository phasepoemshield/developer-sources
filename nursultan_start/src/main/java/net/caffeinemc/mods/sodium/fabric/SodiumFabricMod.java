/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager
 *  net.caffeinemc.mods.sodium.client.services.FRAPIProvider
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 */
package net.caffeinemc.mods.sodium.fabric;

import java.util.function.Consumer;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.services.FRAPIProvider;
import net.caffeinemc.mods.sodium.client.util.FlawlessFrames;
import net.caffeinemc.mods.sodium.fabric.config.ConfigLoaderFabric;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

public class SodiumFabricMod
implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModContainer modContainer = (ModContainer)FabricLoader.getInstance().getModContainer("sodium").orElseThrow(NullPointerException::new);
        SodiumClientMod.onInitialization((String)modContainer.getMetadata().getVersion().getFriendlyString());
        ConfigLoaderFabric.collectConfigEntryPoints();
        ConfigManager.registerConfigsEarly();
        FabricLoader.getInstance().getEntrypoints("frex_flawless_frames", Consumer.class).forEach(consumer -> consumer.accept(FlawlessFrames.getProvider()));
        FRAPIProvider.getInstance().register();
    }
}

