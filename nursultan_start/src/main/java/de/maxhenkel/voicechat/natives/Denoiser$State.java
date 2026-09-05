/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.rnnoise4j.Denoiser
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.rnnoise4j.Denoiser;

final class Denoiser$State
implements Runnable {
    final Denoiser denoiser;

    Denoiser$State(Denoiser denoiser) {
        this.denoiser = denoiser;
    }

    @Override
    public void run() {
        this.denoiser.close();
    }
}

