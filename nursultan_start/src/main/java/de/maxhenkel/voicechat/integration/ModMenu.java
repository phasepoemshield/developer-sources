/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.terraformersmc.modmenu.api.ConfigScreenFactory
 *  com.terraformersmc.modmenu.api.ModMenuApi
 */
package de.maxhenkel.voicechat.integration;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import de.maxhenkel.voicechat.gui.VoiceChatSettingsScreen;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingManager;
import de.maxhenkel.voicechat.integration.clothconfig.ClothConfig;
import de.maxhenkel.voicechat.integration.clothconfig.ClothConfigIntegration;

public class ModMenu
implements ModMenuApi {
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return class050962 -> {
            if (OnboardingManager.isOnboarding()) {
                return OnboardingManager.getOnboardingScreen(class050962);
            }
            if (ClothConfig.isLoaded()) {
                return ClothConfigIntegration.createConfigScreen(class050962);
            }
            return new VoiceChatSettingsScreen(class050962);
        };
    }
}

