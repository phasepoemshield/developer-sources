/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.VoicechatClient
 *  de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager
 *  de.maxhenkel.voicechat.voice.client.MicrophoneActivationType
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05096
 */
package de.maxhenkel.voicechat.gui.tooltips;

import de.maxhenkel.voicechat.VoicechatClient;
import de.maxhenkel.voicechat.gui.tooltips.MuteTooltipSupplier$State;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$TooltipSupplier;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import de.maxhenkel.voicechat.voice.client.MicrophoneActivationType;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05096;

public class MuteTooltipSupplier
implements ImageButton$TooltipSupplier {
    public static final class00392 MUTE_UNMUTED = class00392.L((String)"message.voicechat.mute.disabled");
    public static final class00392 MUTE_MUTED = class00392.L((String)"message.voicechat.mute.enabled");
    public static final class00392 MUTE_DISABLED_PTT = class00392.L((String)"message.voicechat.mute.disabled_ptt");
    private class05096 screen;
    private ClientPlayerStateManager stateManager;
    @Nullable
    private MuteTooltipSupplier$State lastState;

    public MuteTooltipSupplier(class05096 class050962, ClientPlayerStateManager clientPlayerStateManager) {
        this.screen = class050962;
        this.stateManager = clientPlayerStateManager;
    }

    private MuteTooltipSupplier$State getState() {
        if (!MuteTooltipSupplier.canMuteMic()) {
            return MuteTooltipSupplier$State.DISABLED_PTT;
        }
        if (this.stateManager.isMuted()) {
            return MuteTooltipSupplier$State.MUTED;
        }
        return MuteTooltipSupplier$State.UNMUTED;
    }

    @Override
    public void updateTooltip(ImageButton imageButton) {
        MuteTooltipSupplier$State muteTooltipSupplier$State = this.getState();
        if (muteTooltipSupplier$State != this.lastState) {
            this.lastState = muteTooltipSupplier$State;
            imageButton.method_47400(class04141.N((class00392)muteTooltipSupplier$State.getComponent()));
        }
    }

    public static boolean canMuteMic() {
        return ((MicrophoneActivationType)VoicechatClient.CLIENT_CONFIG.microphoneActivationType.get()).equals((Object)MicrophoneActivationType.VOICE);
    }
}

