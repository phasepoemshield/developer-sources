/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.raphimc.viabedrock.api.resourcepack.http.ResourcePackHttpServer
 *  net.raphimc.viabedrock.platform.ViaBedrockConfig
 *  net.raphimc.viabedrock.platform.ViaBedrockPlatform
 */
package net.raphimc.viabedrock;

import java.net.InetSocketAddress;
import java.util.logging.Level;
import net.raphimc.viabedrock.api.resourcepack.http.ResourcePackHttpServer;
import net.raphimc.viabedrock.platform.ViaBedrockConfig;
import net.raphimc.viabedrock.platform.ViaBedrockPlatform;

public class ViaBedrock {
    public static final String VERSION = "0.0.27-SNAPSHOT";
    public static final String IMPL_VERSION = "git-ViaBedrock-0.0.27-SNAPSHOT:449686c8";
    private static ViaBedrockPlatform platform;
    private static ViaBedrockConfig config;
    private static ResourcePackHttpServer resourcePackServer;

    private ViaBedrock() {
    }

    public static void init(ViaBedrockPlatform platform, ViaBedrockConfig config) {
        if (ViaBedrock.platform != null) {
            throw new IllegalStateException("ViaBedrock is already initialized");
        }
        ViaBedrock.platform = platform;
        ViaBedrock.config = config;
        if (config.shouldTranslateResourcePacks()) {
            try {
                resourcePackServer = new ResourcePackHttpServer(new InetSocketAddress(config.getResourcePackHost(), config.getResourcePackPort()));
                platform.getLogger().log(Level.INFO, "Started resource pack HTTP server on " + resourcePackServer.getUrl());
            }
            catch (Throwable e) {
                throw new IllegalStateException("Failed to start resource pack HTTP server", e);
            }
        }
        if (config.shouldEnableExperimentalFeatures()) {
            platform.getLogger().log(Level.WARNING, "Experimental features are enabled. These features might not be fully stable/tested and may cause issues.");
        }
    }

    public static ResourcePackHttpServer getResourcePackServer() {
        return resourcePackServer;
    }

    public static ViaBedrockPlatform getPlatform() {
        return platform;
    }

    public static ViaBedrockConfig getConfig() {
        return config;
    }
}

