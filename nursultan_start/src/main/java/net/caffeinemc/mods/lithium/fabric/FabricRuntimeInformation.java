/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.lithium.common.services.PlatformRuntimeInformation
 *  net.fabricmc.loader.api.FabricLoader
 */
package net.caffeinemc.mods.lithium.fabric;

import java.nio.file.Path;
import net.caffeinemc.mods.lithium.common.services.PlatformRuntimeInformation;
import net.fabricmc.loader.api.FabricLoader;

public class FabricRuntimeInformation
implements PlatformRuntimeInformation {
    public boolean isDevelopmentEnvironment() {
        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    public Path getGameDirectory() {
        return FabricLoader.getInstance().getGameDir();
    }

    public Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }

    public boolean usesAlphaMultiplication() {
        return false;
    }

    public boolean platformHasEarlyLoadingScreen() {
        return false;
    }

    public boolean isModInLoadingList(String string) {
        return FabricLoader.getInstance().isModLoaded(string);
    }

    public boolean platformUsesRefmap() {
        return false;
    }
}

