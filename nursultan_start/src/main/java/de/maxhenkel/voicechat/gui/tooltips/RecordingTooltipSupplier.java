/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.ClientManager
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechat
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05096
 */
package de.maxhenkel.voicechat.gui.tooltips;

import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$TooltipSupplier;
import de.maxhenkel.voicechat.voice.client.ClientManager;
import de.maxhenkel.voicechat.voice.client.ClientVoicechat;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05096;

public class RecordingTooltipSupplier
implements ImageButton$TooltipSupplier {
    public static final class00392 RECORDING_ENABLED = class00392.L((String)"message.voicechat.recording.enabled");
    public static final class00392 RECORDING_DISABLED = class00392.L((String)"message.voicechat.recording.disabled");
    private final class05096 screen;
    @Nullable
    private Boolean lastState;

    public RecordingTooltipSupplier(class05096 class050962) {
        this.screen = class050962;
    }

    @Override
    public void updateTooltip(ImageButton imageButton) {
        boolean bl;
        ClientVoicechat clientVoicechat = ClientManager.getClient();
        boolean bl2 = bl = clientVoicechat != null && clientVoicechat.getRecorder() != null;
        if (this.lastState == null || this.lastState != bl) {
            this.lastState = bl;
            imageButton.method_47400(class04141.N((class00392)(bl ? RECORDING_ENABLED : RECORDING_DISABLED)));
        }
    }
}

