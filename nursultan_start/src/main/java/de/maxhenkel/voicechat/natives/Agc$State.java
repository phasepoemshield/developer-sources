/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.speex4j.AutomaticGainControl
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.speex4j.AutomaticGainControl;

final class Agc$State
implements Runnable {
    final AutomaticGainControl agc;

    Agc$State(AutomaticGainControl automaticGainControl) {
        this.agc = automaticGainControl;
    }

    @Override
    public void run() {
        this.agc.close();
    }
}

