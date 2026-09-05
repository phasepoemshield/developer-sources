/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.net.FabricNetManager
 *  minecraft.class01894
 *  net.fabricmc.loader.api.FabricLoader
 */
package de.maxhenkel.voicechat.integration;

import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.net.FabricNetManager;
import java.util.Set;
import minecraft.class01894;
import net.fabricmc.loader.api.FabricLoader;

public class ViaVersionCompatibility {
    private static final String OLD_VOICECHAT_PREFIX = "vc";

    public static void register() {
        try {
            if (FabricLoader.getInstance().isModLoaded("viaversion")) {
                ViaVersionCompatibility.registerMappings();
                Voicechat.LOGGER.info("Successfully registered ViaVersion mappings", new Object[0]);
            }
        }
        catch (Throwable throwable) {
            Voicechat.LOGGER.error("Failed to register ViaVersion mappings", new Object[]{throwable});
        }
    }

    private static void registerMappings() {
        Set set = ((FabricNetManager)CommonCompatibilityManager.INSTANCE.getNetManager()).getPackets();
        for (class01894 class018942 : set) {
            Protocol1_12_2To1_13.MAPPINGS.getChannelMappings().put((Object)String.format("%s:%s", OLD_VOICECHAT_PREFIX, class018942.N()), (Object)class018942.toString());
        }
    }
}

