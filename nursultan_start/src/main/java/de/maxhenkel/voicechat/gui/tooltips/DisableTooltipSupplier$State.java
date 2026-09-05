/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package de.maxhenkel.voicechat.gui.tooltips;

import de.maxhenkel.voicechat.gui.tooltips.DisableTooltipSupplier;
import minecraft.class00392;

enum DisableTooltipSupplier$State {
    ENABLED(DisableTooltipSupplier.DISABLE_DISABLED),
    DISABLED(DisableTooltipSupplier.DISABLE_ENABLED),
    NO_SPEAKER(DisableTooltipSupplier.DISABLE_NO_SPEAKER);

    private final class00392 component;

    public class00392 getComponent() {
        return this.component;
    }

    private DisableTooltipSupplier$State(class00392 class003922) {
        this.component = class003922;
    }
}

