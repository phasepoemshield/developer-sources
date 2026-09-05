/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.voice.client;

import java.util.function.Supplier;

public class MicrophoneProcessor$MicActivator {
    private final Supplier<Integer> delay;
    private int deactivationDelay;

    public MicrophoneProcessor$MicActivator(Supplier<Integer> supplier) {
        this.delay = supplier;
    }

    public void reset() {
        this.deactivationDelay = 0;
    }

    public boolean shouldStillSend(boolean bl) {
        if (bl) {
            this.deactivationDelay = this.delay.get();
            return true;
        }
        if (this.deactivationDelay > 0) {
            --this.deactivationDelay;
            return true;
        }
        return false;
    }
}

