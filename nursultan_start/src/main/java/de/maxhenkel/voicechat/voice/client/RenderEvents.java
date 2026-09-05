/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.gui.onboarding.OnboardingManager
 *  de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager
 *  de.maxhenkel.voicechat.plugins.ClientPluginManager
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06851
 *  minecraft.class06959
 *  minecraft.class07049
 *  minecraft.class08388
 *  minecraft.class08394
 *  minecraft.class08468
 *  minecraft.class08589
 *  minecraft.class08626
 *  minecraft.class08800
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.onboarding.OnboardingManager;
import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager;
import de.maxhenkel.voicechat.plugins.ClientPluginManager;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import de.maxhenkel.voicechat.voice.client.GroupChatManager;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06851;
import minecraft.class06959;
import minecraft.class07049;
import minecraft.class08388;
import minecraft.class08394;
import minecraft.class08468;
import minecraft.class08589;
import minecraft.class08626;
import minecraft.class08800;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;

public class RenderEvents {
    private static final class01894 MICROPHONE_ICON = class01894.N((String)"voicechat", (String)"icons/microphone");
    private static final class01894 WHISPER_MICROPHONE_ICON = class01894.N((String)"voicechat", (String)"icons/microphone_whisper");
    private static final class01894 MICROPHONE_OFF_ICON = class01894.N((String)"voicechat", (String)"icons/microphone_off");
    private static final class01894 SPEAKER_ICON = class01894.N((String)"voicechat", (String)"icons/speaker");
    private static final class01894 WHISPER_SPEAKER_ICON = class01894.N((String)"voicechat", (String)"icons/speaker_whisper");
    private static final class01894 SPEAKER_OFF_ICON = class01894.N((String)"voicechat", (String)"icons/speaker_off");
    private static final class01894 DISCONNECT_ICON = class01894.N((String)"voicechat", (String)"icons/disconnected");
    private static final class01894 GROUP_ICON = class01894.N((String)"voicechat", (String)"icons/group");
    private final class06202 minecraft = class06202.Nq();

    public RenderEvents() {
        ClientCompatibilityManager.INSTANCE.onRenderNamePlate(this::onRenderName);
        ClientCompatibilityManager.INSTANCE.onRenderHUD(this::onRenderHUD);
    }

    private boolean shouldShowIcons() {
        if (OnboardingManager.isOnboarding()) {
            return false;
        }
        if (ClientManager.getClient() != null && ClientManager.getClient().getConnection() != null && ClientManager.getClient().getConnection().isInitialized()) {
            return true;
        }
        return this.minecraft.Na() == null || this.minecraft.Na().P();
    }

    private void renderPlayerIcon(UUID uUID, boolean bl, class00392 class003922, class01894 class018942, class01421 class014212, class01237 class012372, int n) {
        if (!ClientPluginManager.instance().shouldRenderPlayerIcons(uUID)) {
            return;
        }
        float f = ((class01590)this.minecraft.i_3).N((class05936)class003922) / 2 + 2;
        int n2 = 32;
        float f2 = -1.0f;
        class08626 class086262 = this.minecraft.yW().N(class08589.B);
        class08388 class083882 = class086262.N(class018942);
        class012372.N(class014212, class06851.n((class01894)class083882.method_45852()), (class014232, class013912) -> {
            if (bl) {
                RenderEvents.vertex(class013912, class014232, f, 10.0f + f2, 0.0f, class083882.method_4594(), class083882.method_4575(), n2, n);
                RenderEvents.vertex(class013912, class014232, f + 10.0f, 10.0f + f2, 0.0f, class083882.method_4577(), class083882.method_4575(), n2, n);
                RenderEvents.vertex(class013912, class014232, f + 10.0f, f2, 0.0f, class083882.method_4577(), class083882.method_4593(), n2, n);
                RenderEvents.vertex(class013912, class014232, f, f2, 0.0f, class083882.method_4594(), class083882.method_4593(), n2, n);
            } else {
                RenderEvents.vertex(class013912, class014232, f, 10.0f + f2, 0.0f, class083882.method_4594(), class083882.method_4575(), n);
                RenderEvents.vertex(class013912, class014232, f + 10.0f, 10.0f + f2, 0.0f, class083882.method_4577(), class083882.method_4575(), n);
                RenderEvents.vertex(class013912, class014232, f + 10.0f, f2, 0.0f, class083882.method_4577(), class083882.method_4593(), n);
                RenderEvents.vertex(class013912, class014232, f, f2, 0.0f, class083882.method_4594(), class083882.method_4593(), n);
            }
        });
        if (!bl) {
            class012372.N(class014212, class06851.d((class01894)class083882.method_45852()), (class014232, class013912) -> {
                RenderEvents.vertex(class013912, class014232, f, 10.0f + f2, 0.0f, class083882.method_4594(), class083882.method_4575(), n2, n);
                RenderEvents.vertex(class013912, class014232, f + 10.0f, 10.0f + f2, 0.0f, class083882.method_4577(), class083882.method_4575(), n2, n);
                RenderEvents.vertex(class013912, class014232, f + 10.0f, f2, 0.0f, class083882.method_4577(), class083882.method_4593(), n2, n);
                RenderEvents.vertex(class013912, class014232, f, f2, 0.0f, class083882.method_4594(), class083882.method_4593(), n2, n);
            });
        }
    }

    private void onRenderName(class08800 class088002, class06959 class069592, class01421 class014212, class01237 class012372) {
        if (!(class088002 instanceof class08468)) {
            return;
        }
        class08468 class084682 = (class08468)class088002;
        class00392 class003922 = class088002.w;
        if (class003922 == null) {
            return;
        }
        if (class088002.k == null) {
            return;
        }
        if (!this.shouldShowIcons()) {
            return;
        }
        if (((Boolean)VoicechatClient.CLIENT_CONFIG.hideIcons.get()).booleanValue()) {
            return;
        }
        if (!((Boolean)VoicechatClient.CLIENT_CONFIG.showNametagIcons.get()).booleanValue()) {
            return;
        }
        if ((class04453)this.minecraft.T_4 == null || (class03448)this.minecraft.T_3 == null) {
            return;
        }
        class07049 class070492 = ((class03448)this.minecraft.T_3).method_8469(class084682.NO);
        if (class070492 == null || class070492.equals((Object)((class04453)this.minecraft.T_4))) {
            return;
        }
        if (((class05630)this.minecraft.i_7).NG) {
            return;
        }
        ClientPlayerStateManager clientPlayerStateManager = ClientManager.getPlayerStateManager();
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        UUID uUID = class070492.method_5667();
        UUID uUID2 = clientPlayerStateManager.getGroup(uUID);
        class014212.N();
        class014212.N(class084682.k);
        class014212.N(0.0, 0.5, 0.0);
        class014212.N((Quaternionfc)class069592.i);
        class014212.y(0.025f, -0.025f, 0.025f);
        if (clientVoicechat != null && clientVoicechat.getTalkCache().isWhispering(uUID)) {
            this.renderPlayerIcon(uUID, class084682.n, class003922, WHISPER_SPEAKER_ICON, class014212, class012372, class084682.G);
        } else if (clientVoicechat != null && clientVoicechat.getTalkCache().isTalking(uUID)) {
            this.renderPlayerIcon(uUID, class084682.n, class003922, SPEAKER_ICON, class014212, class012372, class084682.G);
        } else if (clientPlayerStateManager.isPlayerDisconnected(uUID)) {
            this.renderPlayerIcon(uUID, class084682.n, class003922, DISCONNECT_ICON, class014212, class012372, class084682.G);
        } else if (uUID2 != null && !uUID2.equals(clientPlayerStateManager.getGroupID())) {
            this.renderPlayerIcon(uUID, class084682.n, class003922, GROUP_ICON, class014212, class012372, class084682.G);
        } else if (clientPlayerStateManager.isPlayerDisabled(uUID)) {
            this.renderPlayerIcon(uUID, class084682.n, class003922, SPEAKER_OFF_ICON, class014212, class012372, class084682.G);
        }
        class014212.y();
    }

    private void renderIcon(class01054 class010542, class01894 class018942) {
        class010542.i().pushMatrix();
        int n = (Integer)VoicechatClient.CLIENT_CONFIG.hudIconPosX.get();
        int n2 = (Integer)VoicechatClient.CLIENT_CONFIG.hudIconPosY.get();
        if (n < 0) {
            class010542.i().translate((float)this.minecraft.Nt().P(), 0.0f);
        }
        if (n2 < 0) {
            class010542.i().translate(0.0f, (float)this.minecraft.Nt().s());
        }
        class010542.i().translate((float)n, (float)n2);
        float f = ((Double)VoicechatClient.CLIENT_CONFIG.hudIconScale.get()).floatValue();
        class010542.i().scale(f, f);
        class010542.N(class08394.Na, class018942, n < 0 ? -16 : 0, n2 < 0 ? -16 : 0, 16, 16);
        class010542.i().popMatrix();
    }

    private static void vertex(class01391 class013912, class01423 class014232, float f, float f2, float f3, float f4, float f5, int n) {
        RenderEvents.vertex(class013912, class014232, f, f2, f3, f4, f5, 255, n);
    }

    private static void vertex(class01391 class013912, class01423 class014232, float f, float f2, float f3, float f4, float f5, int n, int n2) {
        class013912.N((Matrix4fc)class014232.N(), f, f2, f3).method_1336(255, 255, 255, n).method_22913(f4, f5).method_22922(class01384.u).method_60803(n2).y(class014232, 0.0f, 0.0f, -1.0f);
    }

    private boolean isStartup() {
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        return clientVoicechat != null && System.currentTimeMillis() - clientVoicechat.getStartTime() < 5000L;
    }

    private void onRenderHUD(class01054 class010542, float f) {
        if (!this.shouldShowIcons()) {
            return;
        }
        if (((Boolean)VoicechatClient.CLIENT_CONFIG.hideIcons.get()).booleanValue()) {
            return;
        }
        if (!((Boolean)VoicechatClient.CLIENT_CONFIG.showHudIcons.get()).booleanValue()) {
            return;
        }
        ClientPlayerStateManager clientPlayerStateManager = ClientManager.getPlayerStateManager();
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        if (clientPlayerStateManager.isDisconnected() && this.isStartup()) {
            return;
        }
        if (clientPlayerStateManager.isDisconnected()) {
            this.renderIcon(class010542, DISCONNECT_ICON);
        } else if (clientPlayerStateManager.isDisabled()) {
            this.renderIcon(class010542, SPEAKER_OFF_ICON);
        } else if (clientPlayerStateManager.isMuted() && ((MicrophoneActivationType)((Object)VoicechatClient.CLIENT_CONFIG.microphoneActivationType.get())).equals((Object)MicrophoneActivationType.VOICE)) {
            this.renderIcon(class010542, MICROPHONE_OFF_ICON);
        } else if (clientVoicechat != null && clientVoicechat.getMicThread() != null) {
            if (clientVoicechat.getMicThread().isWhispering()) {
                this.renderIcon(class010542, WHISPER_MICROPHONE_ICON);
            } else if (clientVoicechat.getMicThread().isTalking()) {
                this.renderIcon(class010542, MICROPHONE_ICON);
            }
        }
        if (clientPlayerStateManager.getGroupID() != null && ((Boolean)VoicechatClient.CLIENT_CONFIG.showGroupHud.get()).booleanValue()) {
            GroupChatManager.renderIcons(class010542);
        }
    }
}

