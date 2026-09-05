/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.opus4j.OpusEncoder
 */
package de.maxhenkel.voicechat.plugins.impl.opus;

import de.maxhenkel.opus4j.OpusEncoder;

final class NativeOpusEncoderImpl$State
implements Runnable {
    final OpusEncoder encoder;

    NativeOpusEncoderImpl$State(OpusEncoder opusEncoder) {
        this.encoder = opusEncoder;
    }

    @Override
    public void run() {
        this.encoder.close();
    }
}

