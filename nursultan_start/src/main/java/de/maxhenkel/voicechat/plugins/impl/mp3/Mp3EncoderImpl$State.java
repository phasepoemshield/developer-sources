/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.lame4j.Mp3Encoder
 *  de.maxhenkel.voicechat.Voicechat
 */
package de.maxhenkel.voicechat.plugins.impl.mp3;

import de.maxhenkel.lame4j.Mp3Encoder;
import de.maxhenkel.voicechat.Voicechat;
import java.io.IOException;

final class Mp3EncoderImpl$State
implements Runnable {
    final Mp3Encoder encoder;

    Mp3EncoderImpl$State(Mp3Encoder mp3Encoder) {
        this.encoder = mp3Encoder;
    }

    @Override
    public void run() {
        try {
            this.encoder.close();
        }
        catch (IOException iOException) {
            Voicechat.LOGGER.error("Failed to close MP3 encoder", new Object[]{iOException});
        }
    }
}

