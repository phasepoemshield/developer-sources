/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package de.maxhenkel.voicechat.gui.widgets;

import de.maxhenkel.voicechat.gui.widgets.MicTestButton;
import minecraft.class00392;

enum MicTestButton$State {
    ENABLED(MicTestButton.TEST_ENABLED),
    DISABLED(MicTestButton.TEST_DISABLED),
    UNAVAILABLE(MicTestButton.TEST_UNAVAILABLE);

    private final class00392 component;

    public class00392 getComponent() {
        return this.component;
    }

    private MicTestButton$State(class00392 class003922) {
        this.component = class003922;
    }
}

