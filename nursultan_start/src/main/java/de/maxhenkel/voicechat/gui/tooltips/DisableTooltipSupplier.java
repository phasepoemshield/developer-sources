/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager
 *  javax.annotation.Nullable
 *  minecraft.class00392
 *  minecraft.class04141
 *  minecraft.class05096
 */
package de.maxhenkel.voicechat.gui.tooltips;

import de.maxhenkel.voicechat.gui.tooltips.DisableTooltipSupplier$State;
import de.maxhenkel.voicechat.gui.widgets.ImageButton;
import de.maxhenkel.voicechat.gui.widgets.ImageButton$TooltipSupplier;
import de.maxhenkel.voicechat.voice.client.ClientPlayerStateManager;
import javax.annotation.Nullable;
import minecraft.class00392;
import minecraft.class04141;
import minecraft.class05096;

public class DisableTooltipSupplier
implements ImageButton$TooltipSupplier {
    public static final class00392 DISABLE_ENABLED = class00392.L((String)"message.voicechat.disable.enabled");
    public static final class00392 DISABLE_DISABLED = class00392.L((String)"message.voicechat.disable.disabled");
    public static final class00392 DISABLE_NO_SPEAKER = class00392.L((String)"message.voicechat.disable.no_speaker");
    private final class05096 screen;
    private final ClientPlayerStateManager stateManager;
    @Nullable
    private DisableTooltipSupplier$State lastState;

    public DisableTooltipSupplier(class05096 class050962, ClientPlayerStateManager clientPlayerStateManager) {
        this.screen = class050962;
        this.stateManager = clientPlayerStateManager;
    }

    private DisableTooltipSupplier$State getState() {
        if (!this.stateManager.canEnable()) {
            return DisableTooltipSupplier$State.NO_SPEAKER;
        }
        if (this.stateManager.isDisabled()) {
            return DisableTooltipSupplier$State.DISABLED;
        }
        return DisableTooltipSupplier$State.ENABLED;
    }

    @Override
    public void updateTooltip(ImageButton imageButton) {
        DisableTooltipSupplier$State disableTooltipSupplier$State = this.getState();
        if (disableTooltipSupplier$State != this.lastState) {
            this.lastState = disableTooltipSupplier$State;
            imageButton.method_47400(class04141.N((class00392)disableTooltipSupplier$State.getComponent()));
        }
    }
}

