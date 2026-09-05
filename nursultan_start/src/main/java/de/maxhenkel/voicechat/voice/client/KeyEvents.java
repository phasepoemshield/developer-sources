/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.gui.VoiceChatScreen
 *  de.maxhenkel.voicechat.gui.VoiceChatSettingsScreen
 *  de.maxhenkel.voicechat.gui.group.GroupScreen
 *  de.maxhenkel.voicechat.gui.group.JoinGroupScreen
 *  de.maxhenkel.voicechat.gui.onboarding.OnboardingManager
 *  de.maxhenkel.voicechat.gui.volume.AdjustVolumesScreen
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04453
 *  minecraft.class04655
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class06384
 *  minecraft.class06428
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.VoiceChatScreen;
import de.maxhenkel.voicechat.gui.VoiceChatSettingsScreen;
import de.maxhenkel.voicechat.gui.group.GroupScreen;
import de.maxhenkel.voicechat.gui.group.JoinGroupScreen;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingManager;
import de.maxhenkel.voicechat.gui.volume.AdjustVolumesScreen;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.common.ClientGroup;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class04655;
import minecraft.class05096;
import minecraft.class06202;
import minecraft.class06384;
import minecraft.class06428;

public class KeyEvents {
    private final class06202 minecraft = class06202.Nq();
    public static class06384 CATEGORY_VOICECHAT;
    public static class06428 KEY_PTT;
    public static class06428 KEY_WHISPER;
    public static class06428 KEY_MUTE;
    public static class06428 KEY_DISABLE;
    public static class06428 KEY_HIDE_ICONS;
    public static class06428 KEY_VOICE_CHAT;
    public static class06428 KEY_VOICE_CHAT_SETTINGS;
    public static class06428 KEY_GROUP;
    public static class06428 KEY_TOGGLE_RECORDING;
    public static class06428 KEY_ADJUST_VOLUMES;
    public static class06428[] ALL_KEYS;

    private void handleKeybinds() {
        class04453 class044532 = (class04453)this.minecraft.T_4;
        if (class044532 == null) {
            return;
        }
        if (OnboardingManager.isOnboarding()) {
            for (class06428 class064282 : ALL_KEYS) {
                if (!class064282.B()) continue;
                OnboardingManager.startOnboarding(null);
                return;
            }
            return;
        }
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        ClientPlayerStateManager clientPlayerStateManager = ClientManager.getPlayerStateManager();
        if (KEY_VOICE_CHAT.B()) {
            if (this.minecraft.U()) {
                if (this.minecraft.s()) {
                    VoicechatClient.CLIENT_CONFIG.onboardingFinished.set((Object)false).save();
                    class044532.method_7353((class00392)class00392.L((String)"message.voicechat.onboarding.reset"), true);
                } else {
                    ClientManager.getDebugOverlay().toggle();
                }
            } else {
                this.minecraft.N((class05096)new VoiceChatScreen());
            }
        }
        if (KEY_GROUP.B()) {
            if (clientVoicechat != null && clientVoicechat.getConnection() != null && clientVoicechat.getConnection().getData().groupsEnabled()) {
                ClientGroup clientGroup = clientPlayerStateManager.getGroup();
                if (clientGroup != null) {
                    this.minecraft.N((class05096)new GroupScreen(clientGroup));
                } else {
                    this.minecraft.N((class05096)new JoinGroupScreen());
                }
            } else {
                class044532.method_7353((class00392)class00392.L((String)"message.voicechat.groups_disabled"), true);
            }
        }
        if (KEY_VOICE_CHAT_SETTINGS.B()) {
            this.minecraft.N((class05096)new VoiceChatSettingsScreen());
        }
        if (KEY_ADJUST_VOLUMES.B()) {
            this.minecraft.N((class05096)new AdjustVolumesScreen());
        }
        if (KEY_PTT.B()) {
            this.checkConnected();
        }
        if (KEY_WHISPER.B()) {
            this.checkConnected();
        }
        if (KEY_MUTE.B()) {
            clientPlayerStateManager.setMuted(!clientPlayerStateManager.isMuted());
        }
        if (KEY_DISABLE.B()) {
            clientPlayerStateManager.setDisabled(!clientPlayerStateManager.isDisabled());
        }
        if (KEY_TOGGLE_RECORDING.B() && clientVoicechat != null) {
            ClientManager.getClient().toggleRecording();
        }
        if (KEY_HIDE_ICONS.B()) {
            boolean bl = (Boolean)VoicechatClient.CLIENT_CONFIG.hideIcons.get() == false;
            VoicechatClient.CLIENT_CONFIG.hideIcons.set((Object)bl).save();
            if (bl) {
                class044532.method_7353((class00392)class00392.L((String)"message.voicechat.icons_hidden"), true);
            } else {
                class044532.method_7353((class00392)class00392.L((String)"message.voicechat.icons_visible"), true);
            }
        }
    }

    private boolean checkConnected() {
        if (ClientManager.getClient() == null || ClientManager.getClient().getConnection() == null || !ClientManager.getClient().getConnection().isInitialized()) {
            this.sendNotConnectedMessage();
            return false;
        }
        return true;
    }

    public KeyEvents() {
        ClientCompatibilityManager.INSTANCE.onHandleKeyBinds(this::handleKeybinds);
    }

    private void sendNotConnectedMessage() {
        class04453 class044532 = (class04453)this.minecraft.T_4;
        if (class044532 == null) {
            Voicechat.LOGGER.warn("Voice chat not connected", new Object[0]);
            return;
        }
        class044532.method_7353((class00392)class00392.L((String)"message.voicechat.voice_chat_not_connected"), true);
    }

    public static void registerKeyBinds() {
        if (KEY_PTT != null) {
            throw new IllegalStateException("Registered key binds twice");
        }
        CATEGORY_VOICECHAT = class06384.N((class01894)class01894.N((String)"voicechat", (String)"voicechat"));
        KEY_PTT = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.push_to_talk", class04655.yI.y(), CATEGORY_VOICECHAT));
        KEY_WHISPER = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.whisper", class04655.yI.y(), CATEGORY_VOICECHAT));
        KEY_MUTE = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.mute_microphone", 77, CATEGORY_VOICECHAT));
        KEY_DISABLE = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.disable_voice_chat", 78, CATEGORY_VOICECHAT));
        KEY_HIDE_ICONS = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.hide_icons", 72, CATEGORY_VOICECHAT));
        KEY_VOICE_CHAT = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.voice_chat", 86, CATEGORY_VOICECHAT));
        KEY_VOICE_CHAT_SETTINGS = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.voice_chat_settings", class04655.yI.y(), CATEGORY_VOICECHAT));
        KEY_GROUP = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.voice_chat_group", class04655.yI.y(), CATEGORY_VOICECHAT));
        KEY_TOGGLE_RECORDING = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.voice_chat_toggle_recording", class04655.yI.y(), CATEGORY_VOICECHAT));
        KEY_ADJUST_VOLUMES = ClientCompatibilityManager.INSTANCE.registerKeyBinding(new class06428("key.voice_chat_adjust_volumes", class04655.yI.y(), CATEGORY_VOICECHAT));
        ALL_KEYS = new class06428[]{KEY_PTT, KEY_WHISPER, KEY_MUTE, KEY_DISABLE, KEY_HIDE_ICONS, KEY_VOICE_CHAT, KEY_VOICE_CHAT_SETTINGS, KEY_GROUP, KEY_TOGGLE_RECORDING, KEY_ADJUST_VOLUMES};
    }
}

