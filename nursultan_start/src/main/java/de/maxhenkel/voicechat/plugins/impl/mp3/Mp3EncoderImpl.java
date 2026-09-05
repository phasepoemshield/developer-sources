/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.lame4j.Mp3Encoder
 *  de.maxhenkel.lame4j.UnknownPlatformException
 *  de.maxhenkel.voicechat.api.mp3.Mp3Encoder
 */
package de.maxhenkel.voicechat.plugins.impl.mp3;

import de.maxhenkel.lame4j.UnknownPlatformException;
import de.maxhenkel.voicechat.api.mp3.Mp3Encoder;
import de.maxhenkel.voicechat.plugins.impl.mp3.Mp3EncoderImpl$State;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.Cleaner;
import javax.sound.sampled.AudioFormat;

public class Mp3EncoderImpl
implements Mp3Encoder,
AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();
    private final Mp3EncoderImpl$State state;
    private final Cleaner.Cleanable cleanable;

    public Mp3EncoderImpl(AudioFormat audioFormat, int n, int n2, OutputStream outputStream) throws IOException, UnknownPlatformException {
        de.maxhenkel.lame4j.Mp3Encoder mp3Encoder = new de.maxhenkel.lame4j.Mp3Encoder(audioFormat.getChannels(), (int)audioFormat.getSampleRate(), n, n2, outputStream);
        this.state = new Mp3EncoderImpl$State(mp3Encoder);
        this.cleanable = CLEANER.register(this, this.state);
    }

    public void encode(short[] sArray) throws IOException {
        this.state.encoder.write(sArray);
    }

    @Override
    public void close() {
        this.cleanable.clean();
    }
}

