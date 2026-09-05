/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.services;

import java.nio.file.Path;
import net.caffeinemc.mods.sodium.client.services.Services;

public interface PlatformRuntimeInformation {
    public static final PlatformRuntimeInformation INSTANCE = Services.load(PlatformRuntimeInformation.class);

    public boolean isDevelopmentEnvironment();

    public Path getGameDirectory();

    public Path getConfigDirectory();

    public static PlatformRuntimeInformation getInstance() {
        return INSTANCE;
    }

    public boolean usesAlphaMultiplication();

    public boolean platformHasEarlyLoadingScreen();

    public boolean isModInLoadingList(String var1);

    public boolean platformUsesRefmap();
}

