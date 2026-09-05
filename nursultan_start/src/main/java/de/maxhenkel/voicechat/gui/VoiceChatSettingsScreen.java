/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.natives.SpeexManager
 *  de.maxhenkel.voicechat.voice.client.KeyEvents
 *  de.maxhenkel.voicechat.voice.client.MicrophoneActivationType
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08394
 */
package de.maxhenkel.voicechat.gui;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.VoiceChatScreenBase;
import de.maxhenkel.voicechat.gui.VoiceChatSettingsScreen$1;
import de.maxhenkel.voicechat.gui.audiodevice.SelectMicrophoneScreen;
import de.maxhenkel.voicechat.gui.audiodevice.SelectSpeakerScreen;
import de.maxhenkel.voicechat.gui.widgets.AgcButton;
import de.maxhenkel.voicechat.gui.widgets.DenoiserButton;
import de.maxhenkel.voicechat.gui.widgets.KeybindButton;
import de.maxhenkel.voicechat.gui.widgets.MicActivationButton;
import de.maxhenkel.voicechat.gui.widgets.MicAmplificationSlider;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton;
import de.maxhenkel.voicechat.gui.widgets.VadButton;
import de.maxhenkel.voicechat.gui.widgets.VoiceActivationSlider;
import de.maxhenkel.voicechat.gui.widgets.VoiceSoundSlider;
import de.maxhenkel.voicechat.natives.SpeexManager;
import de.maxhenkel.voicechat.voice.client.KeyEvents;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08394;

public class VoiceChatSettingsScreen
extends VoiceChatScreenBase {
    private static final class01894 TEXTURE = class01894.N((String)"voicechat", (String)"textures/gui/gui_voicechat_settings.png");
    private static final class00392 TITLE = class00392.L((String)"gui.voicechat.voice_chat_settings.title");
    private static final class00392 ASSIGN_TOOLTIP = class00392.L((String)"message.voicechat.press_to_reassign_key");
    private static final class00392 PUSH_TO_TALK = class00392.L((String)"message.voicechat.activation_type.ptt");
    private static final class00392 SELECT_MICROPHONE = class00392.L((String)"message.voicechat.select_microphone");
    private static final class00392 SELECT_SPEAKER = class00392.L((String)"message.voicechat.select_speaker");
    private static final class00392 BACK = class00392.L((String)"message.voicechat.back");
    @Nullable
    private final class05096 parent;
    private VoiceActivationSlider voiceActivationSlider;
    MicTestButton micTestButton;
    private KeybindButton keybindButton;

    public VoiceChatSettingsScreen(@Nullable class05096 class050962) {
        super(TITLE, 248, 219);
        this.parent = class050962;
    }

    public VoiceChatSettingsScreen() {
        this(null);
    }

    @Override
    public void method_25426() {
        super.method_25426();
        int n = this.guiTop + 20;
        this.method_37063((class04654)new VoiceSoundSlider(this.guiLeft + 10, n, this.xSize - 20, 20));
        boolean bl2 = SpeexManager.canUseAgc();
        MicAmplificationSlider micAmplificationSlider = new MicAmplificationSlider(this.guiLeft + 10 + (bl2 ? 81 : 0), n += 21, this.xSize - 20 - (bl2 ? 80 : 0) - 1, 20);
        if (bl2) {
            this.method_37063((class04654)new AgcButton(this.guiLeft + 10, n, 80, 20, bl -> micAmplificationSlider.setActive(bl == false)));
        }
        this.method_37063((class04654)micAmplificationSlider);
        this.method_37063((class04654)new DenoiserButton(this.guiLeft + 10, n += 21, this.xSize - 20, 20));
        this.voiceActivationSlider = new VoiceActivationSlider(this.guiLeft + 10, (n += 21) + 42, this.xSize - 20, 20);
        VadButton vadButton = new VadButton(this.guiLeft + 10, n + 21, this.xSize - 20, 20);
        this.micTestButton = new MicTestButton(this.guiLeft + 10, n, false, this.voiceActivationSlider);
        this.keybindButton = new KeybindButton(KeyEvents.KEY_PTT, this.guiLeft + 10, n + 21, this.xSize - 20, 20, PUSH_TO_TALK);
        this.method_37063((class04654)new MicActivationButton(this.guiLeft + 10 + 20 + 1, n, this.xSize - 20 - 20 - 1, 20, microphoneActivationType -> {
            vadButton.field_22764 = MicrophoneActivationType.VOICE.equals(microphoneActivationType);
            this.keybindButton.field_22764 = MicrophoneActivationType.PTT.equals(microphoneActivationType);
            this.keybindButton.resetListening();
        }));
        this.method_37063((class04654)this.micTestButton);
        this.method_37063((class04654)vadButton);
        this.method_37063((class04654)this.voiceActivationSlider);
        this.method_37063((class04654)this.keybindButton);
        this.method_37063((class04654)new VoiceChatSettingsScreen$1(this, this.guiLeft + 10, n += 63, this.xSize - 20, 20, VoicechatClient.CLIENT_CONFIG.audioType));
        this.method_37063((class04654)class05362.method_46430((class00392)SELECT_MICROPHONE, class053622 -> this.field_22787.N((class05096)new SelectMicrophoneScreen(this))).N(this.guiLeft + 10, n += 21, (this.xSize - 20) / 2 - 1, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)SELECT_SPEAKER, class053622 -> this.field_22787.N((class05096)new SelectSpeakerScreen(this))).N(this.guiLeft + this.xSize / 2 + 1, n, (this.xSize - 20) / 2 - 1, 20).N());
        n += 21;
        if (!this.isIngame() && this.parent != null) {
            this.method_37063((class04654)class05362.method_46430((class00392)BACK, class053622 -> this.field_22787.N(this.parent)).N(this.guiLeft + 10, n, this.xSize - 20, 20).N());
        }
    }

    public boolean method_25422() {
        if (this.keybindButton.isListening()) {
            return false;
        }
        return super.method_25422();
    }

    public boolean method_25404(class06601 class066012) {
        if (this.keybindButton.method_25404(class066012)) {
            return true;
        }
        return super.method_25404(class066012);
    }

    @Override
    public void method_25420(class01054 class010542, int n, int n2, float f) {
        if (this.isIngame()) {
            class010542.N(class08394.Na, TEXTURE, this.guiLeft, this.guiTop, 0.0f, 0.0f, this.xSize, this.ySize, 256, 256);
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.keybindButton.method_25402(class066132, bl)) {
            return true;
        }
        return super.method_25402(class066132, bl);
    }

    public boolean method_16803(class06601 class066012) {
        if (this.keybindButton.method_16803(class066012)) {
            return true;
        }
        return super.method_16803(class066012);
    }

    @Override
    public void renderForeground(class01054 class010542, int n, int n2, float f) {
        int n3 = this.field_22793.N((class05936)TITLE);
        class010542.N(this.field_22793, TITLE.method_30937(), this.guiLeft + (this.xSize - n3) / 2, this.guiTop + 7, this.getFontColor(), false);
        class00392 class003922 = this.voiceActivationSlider.getHoverText();
        if (this.voiceActivationSlider.method_49606() && class003922 != null) {
            class010542.N(this.field_22793, class003922, n, n2);
        } else if (this.keybindButton.method_49606()) {
            class010542.N(this.field_22793, ASSIGN_TOOLTIP, n, n2);
        }
    }
}

