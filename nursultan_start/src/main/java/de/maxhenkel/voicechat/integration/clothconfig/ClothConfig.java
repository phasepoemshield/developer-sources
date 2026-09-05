/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  me.shedaniel.clothconfig2.gui.ClothConfigScreen
 *  minecraft.class05096
 *  minecraft.class06202
 */
package de.maxhenkel.voicechat.integration.clothconfig;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.gui.VoiceChatSettingsScreen;
import de.maxhenkel.voicechat.integration.clothconfig.ClothConfigIntegration;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import me.shedaniel.clothconfig2.gui.ClothConfigScreen;
import minecraft.class05096;
import minecraft.class06202;

public class ClothConfig {
    private static final class06202 MC = class06202.Nq();
    private static Boolean loaded;

    public static void init() {
        if (ClothConfig.isLoaded()) {
            ClientCompatibilityManager.INSTANCE.onClientTick(ClothConfig::onTick);
        }
    }

    public static boolean isLoaded() {
        if (loaded == null) {
            loaded = ClothConfig.checkLoaded();
        }
        return loaded;
    }

    private static void onTick() {
        ClothConfigScreen clothConfigScreen;
        class05096 class050962;
        if (ClothConfig.isLoaded() && (class050962 = (class05096)ClothConfig.MC.v_3) instanceof ClothConfigScreen && (clothConfigScreen = (ClothConfigScreen)class050962).getSelectedCategory().equals((Object)ClothConfigIntegration.OTHER_SETTINGS)) {
            clothConfigScreen.selectedCategoryIndex = 0;
            MC.N((class05096)new VoiceChatSettingsScreen((class05096)ClothConfig.MC.v_3));
        }
    }

    private static boolean checkLoaded() {
        if (CommonCompatibilityManager.INSTANCE.isModLoaded("cloth-config") || CommonCompatibilityManager.INSTANCE.isModLoaded("cloth-config2") || CommonCompatibilityManager.INSTANCE.isModLoaded("cloth_config")) {
            try {
                Class.forName("me.shedaniel.clothconfig2.api.ConfigBuilder");
                Voicechat.LOGGER.info("Using Cloth Config GUI", new Object[0]);
                return true;
            }
            catch (Exception exception) {
                Voicechat.LOGGER.warn("Failed to load Cloth Config", new Object[]{exception});
            }
        }
        return false;
    }
}

