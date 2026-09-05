/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03428
 *  minecraft.class04141
 *  minecraft.class06541
 *  minecraft.class06611
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$TooltipSupplier;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton$MicListener;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton$State;
import de.maxhenkel.voicechat.gui.widgets.MicTestButton$VoiceThread;
import de.maxhenkel.voicechat.gui.widgets.ToggleImageButton;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03428;
import minecraft.class04141;
import minecraft.class06541;
import minecraft.class06611;

public class MicTestButton
extends ToggleImageButton
implements ImageButton$TooltipSupplier {
    private static final class01894 MICROPHONE = class01894.N((String)"voicechat", (String)"icons/microphone_button");
    static final class00392 TEST_DISABLED = class00392.L((String)"message.voicechat.mic_test.disabled");
    static final class00392 TEST_ENABLED = class00392.L((String)"message.voicechat.mic_test.enabled");
    static final class00392 TEST_UNAVAILABLE = class00392.L((String)"message.voicechat.mic_test_unavailable").N(class06541.field_1061);
    private boolean micActive;
    @Nullable
    private MicTestButton$VoiceThread voiceThread;
    @Nullable
    final MicTestButton$MicListener micListener;
    final boolean raw;
    @Nullable
    final ClientVoicechat client;
    @Nullable
    private MicTestButton$State lastState;

    public MicTestButton(int n, int n2, boolean bl, @Nullable MicTestButton$MicListener micTestButton$MicListener) {
        super(n, n2, MICROPHONE, null, null, null);
        this.raw = bl;
        this.micListener = micTestButton$MicListener;
        this.client = ClientManager.getClient();
        this.field_22763 = this.client == null || this.client.getSoundManager() != null;
        this.stateSupplier = () -> !this.micActive;
        this.tooltipSupplier = this;
    }

    public MicTestButton(int n, int n2, boolean bl) {
        this(n, n2, bl, null);
    }

    public void stop() {
        this.close();
        this.setMicActive(false);
    }

    private MicTestButton$State getState() {
        if (!this.field_22763) {
            return MicTestButton$State.UNAVAILABLE;
        }
        if (this.micActive) {
            return MicTestButton$State.ENABLED;
        }
        return MicTestButton$State.DISABLED;
    }

    private void close() {
        if (this.voiceThread != null) {
            this.voiceThread.close();
            this.voiceThread = null;
        }
    }

    public void updateLastRender() {
        if (this.voiceThread != null) {
            this.voiceThread.updateLastRender();
        }
    }

    public boolean isMicActive() {
        return this.micActive;
    }

    public void setMicActive(boolean bl) {
        this.micActive = bl;
    }

    @Override
    public void updateTooltip(ImageButton imageButton) {
        MicTestButton$State micTestButton$State = this.getState();
        if (micTestButton$State != this.lastState) {
            this.lastState = micTestButton$State;
            imageButton.method_47400(class04141.N((class00392)micTestButton$State.getComponent()));
        }
    }

    @Override
    public void method_25306(class06611 class066112) {
        this.setMicActive(!this.micActive);
        if (this.micActive) {
            this.close();
            try {
                this.voiceThread = new MicTestButton$VoiceThread(this, microphoneException -> {
                    this.setMicActive(false);
                    this.field_22763 = false;
                    Voicechat.LOGGER.error("Microphone error", new Object[]{microphoneException});
                });
                this.voiceThread.start();
            }
            catch (Exception exception) {
                this.setMicActive(false);
                this.field_22763 = false;
                Voicechat.LOGGER.error("Microphone error", new Object[]{exception});
            }
        } else {
            this.close();
        }
    }

    @Override
    public void method_75752(class01054 class010542, int n, int n2, float f) {
        super.method_75752(class010542, n, n2, f);
        this.updateLastRender();
    }

    @Override
    public void method_47399(class03428 class034282) {
        this.method_37021(class034282);
    }
}

