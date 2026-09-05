/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01285
 *  minecraft.class01894
 *  minecraft.class06134
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.loader.api.FabricLoader
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package squeek.appleskin;

import minecraft.class01285;
import minecraft.class01894;
import minecraft.class06134;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import squeek.appleskin.ModConfig;
import squeek.appleskin.api.AppleSkinApi;
import squeek.appleskin.client.DebugInfoHudEntry;
import squeek.appleskin.client.HUDOverlayHandler;
import squeek.appleskin.client.TooltipOverlayHandler;
import squeek.appleskin.network.ClientSyncHandler;

public class AppleSkin
implements ClientModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();

    public void onInitializeClient() {
        ClientSyncHandler.init();
        ModConfig.init();
        HUDOverlayHandler.init();
        TooltipOverlayHandler.init();
        FabricLoader.getInstance().getEntrypointContainers("appleskin", AppleSkinApi.class).forEach(entrypointContainer -> {
            try {
                ((AppleSkinApi)entrypointContainer.getEntrypoint()).registerEvents();
            }
            catch (Throwable throwable) {
                LOGGER.error("Failed to load entrypoint for mod {}", (Object)entrypointContainer.getProvider().getMetadata().getId(), (Object)throwable);
            }
        });
        class06134.N((class01894)DebugInfoHudEntry.ENTRY_ID, (class01285)new DebugInfoHudEntry());
    }
}

