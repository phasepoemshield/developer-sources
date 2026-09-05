/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.ChatUtils
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.KeyEvents
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06541
 */
package de.maxhenkel.voicechat.gui.onboarding;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.onboarding.IntroductionOnboardingScreen;
import de.maxhenkel.voicechat.voice.client.ChatUtils;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.KeyEvents;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06541;

public class OnboardingManager {
    private static final class06202 MC = class06202.Nq();

    public static class05096 getOnboardingScreen(@Nullable class05096 class050962) {
        return new IntroductionOnboardingScreen(class050962);
    }

    public static void onConnecting() {
        if (!OnboardingManager.isOnboarding()) {
            return;
        }
        ChatUtils.sendModMessage((class00392)class00392.N((String)"message.voicechat.set_up", (Object[])new Object[]{KeyEvents.KEY_VOICE_CHAT.m().L().N(new class06541[]{class06541.field_1067, class06541.field_1073})}));
    }

    public static void startOnboarding(@Nullable class05096 class050962) {
        MC.N(OnboardingManager.getOnboardingScreen(class050962));
    }

    public static boolean isOnboarding() {
        return (Boolean)VoicechatClient.CLIENT_CONFIG.onboardingFinished.get() == false;
    }

    public static void finishOnboarding() {
        VoicechatClient.CLIENT_CONFIG.muted.set((Object)true).save();
        VoicechatClient.CLIENT_CONFIG.disabled.set((Object)false).save();
        VoicechatClient.CLIENT_CONFIG.onboardingFinished.set((Object)true).save();
        ClientManager.getPlayerStateManager().onFinishOnboarding();
        MC.N(null);
    }
}

