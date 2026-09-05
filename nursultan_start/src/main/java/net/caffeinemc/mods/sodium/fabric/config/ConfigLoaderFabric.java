/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager
 *  net.caffeinemc.mods.sodium.client.config.ConfigManager$ModMetadata
 *  net.caffeinemc.mods.sodium.client.gui.SodiumConfigBuilder
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.entrypoint.EntrypointContainer
 *  net.fabricmc.loader.api.metadata.ModMetadata
 */
package net.caffeinemc.mods.sodium.fabric.config;

import java.util.List;
import net.caffeinemc.mods.sodium.api.config.ConfigEntryPoint;
import net.caffeinemc.mods.sodium.client.config.ConfigManager;
import net.caffeinemc.mods.sodium.client.gui.SodiumConfigBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.entrypoint.EntrypointContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;

public class ConfigLoaderFabric {
    public static void collectConfigEntryPoints() {
        ConfigManager.setModInfoFunction(ConfigLoaderFabric::getModMetadata);
        List list = FabricLoader.getInstance().getEntrypointContainers("sodium:config_api_user", ConfigEntryPoint.class);
        for (EntrypointContainer entrypointContainer : list) {
            ConfigManager.registerConfigEntryPoint(() -> ((EntrypointContainer)entrypointContainer).getEntrypoint(), (String)entrypointContainer.getProvider().getMetadata().getId());
        }
        ConfigManager.registerConfigEntryPoint(SodiumConfigBuilder::new, (String)"sodium");
    }

    private static ConfigManager.ModMetadata getModMetadata(String string) {
        ModContainer modContainer = (ModContainer)FabricLoader.getInstance().getModContainer(string).orElseThrow(NullPointerException::new);
        ModMetadata modMetadata = modContainer.getMetadata();
        return new ConfigManager.ModMetadata(modMetadata.getName(), modMetadata.getVersion().getFriendlyString());
    }
}

