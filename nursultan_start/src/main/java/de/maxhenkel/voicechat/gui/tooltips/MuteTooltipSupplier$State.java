/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package de.maxhenkel.voicechat.gui.tooltips;

import de.maxhenkel.voicechat.gui.tooltips.MuteTooltipSupplier;
import minecraft.class00392;

enum MuteTooltipSupplier$State {
    UNMUTED(MuteTooltipSupplier.MUTE_UNMUTED),
    MUTED(MuteTooltipSupplier.MUTE_MUTED),
    DISABLED_PTT(MuteTooltipSupplier.MUTE_DISABLED_PTT);

    private final class00392 component;

    public class00392 getComponent() {
        return this.component;
    }

    private MuteTooltipSupplier$State(class00392 class003922) {
        this.component = class003922;
    }
}

