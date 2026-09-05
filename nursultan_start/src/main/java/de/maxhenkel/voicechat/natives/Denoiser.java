/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.rnnoise4j.Denoiser
 *  de.maxhenkel.rnnoise4j.UnknownPlatformException
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.rnnoise4j.UnknownPlatformException;
import de.maxhenkel.voicechat.natives.Denoiser$State;
import java.io.IOException;
import java.lang.ref.Cleaner;

public class Denoiser
implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();
    private final Denoiser$State state;
    private final Cleaner.Cleanable cleanable;

    public Denoiser() throws IOException, UnknownPlatformException {
        de.maxhenkel.rnnoise4j.Denoiser denoiser = new de.maxhenkel.rnnoise4j.Denoiser();
        this.state = new Denoiser$State(denoiser);
        this.cleanable = CLEANER.register(this, this.state);
    }

    @Override
    public void close() {
        this.cleanable.clean();
    }

    public int getFrameSize() {
        return this.state.denoiser.getFrameSize();
    }

    public float denoiseInPlace(short[] sArray) {
        return this.state.denoiser.denoiseInPlace(sArray);
    }

    public short[] denoise(short[] sArray) {
        return this.state.denoiser.denoise(sArray);
    }

    public boolean isClosed() {
        return this.state.denoiser.isClosed();
    }

    public float getSpeechProbability(short[] sArray) {
        return this.state.denoiser.getSpeechProbability(sArray);
    }
}

