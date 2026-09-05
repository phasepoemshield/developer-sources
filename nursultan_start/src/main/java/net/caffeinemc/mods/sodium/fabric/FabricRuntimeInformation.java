/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 */
package net.caffeinemc.mods.sodium.fabric;

import java.nio.file.Path;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.fabricmc.loader.api.FabricLoader;

public class FabricRuntimeInformation
implements PlatformRuntimeInformation {
    @Override
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public Path getGameDirectory() {
        return FabricLoader.getInstance().getGameDir();
    }

    @Override
    public Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }

    @Override
    public boolean usesAlphaMultiplication() {
        return false;
    }

    @Override
    public boolean platformHasEarlyLoadingScreen() {
        return false;
    }

    @Override
    public boolean isModInLoadingList(String string) {
        return FabricLoader.getInstance().isModLoaded(string);
    }

    @Override
    public boolean platformUsesRefmap() {
        return true;
    }
}

