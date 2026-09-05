/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.opus4j.OpusDecoder
 */
package de.maxhenkel.voicechat.plugins.impl.opus;

import de.maxhenkel.opus4j.OpusDecoder;

final class NativeOpusDecoderImpl$State
implements Runnable {
    final OpusDecoder decoder;

    NativeOpusDecoderImpl$State(OpusDecoder opusDecoder) {
        this.decoder = opusDecoder;
    }

    @Override
    public void run() {
        this.decoder.close();
    }
}

