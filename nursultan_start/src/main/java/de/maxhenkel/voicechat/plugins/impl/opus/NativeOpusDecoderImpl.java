/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.opus4j.OpusDecoder
 *  de.maxhenkel.opus4j.UnknownPlatformException
 *  de.maxhenkel.voicechat.api.opus.OpusDecoder
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl.opus;

import de.maxhenkel.opus4j.UnknownPlatformException;
import de.maxhenkel.voicechat.api.opus.OpusDecoder;
import de.maxhenkel.voicechat.plugins.impl.opus.NativeOpusDecoderImpl$State;
import java.io.IOException;
import java.lang.ref.Cleaner;
import javax.annotation.Nullable;

public class NativeOpusDecoderImpl
implements OpusDecoder {
    private static final Cleaner CLEANER = Cleaner.create();
    private final NativeOpusDecoderImpl$State state;
    private final Cleaner.Cleanable cleanable;

    public NativeOpusDecoderImpl(int n, int n2) throws IOException, UnknownPlatformException {
        de.maxhenkel.opus4j.OpusDecoder opusDecoder = new de.maxhenkel.opus4j.OpusDecoder(n, n2);
        this.state = new NativeOpusDecoderImpl$State(opusDecoder);
        this.cleanable = CLEANER.register(this, this.state);
    }

    public short[] decode(@Nullable byte[] byArray) {
        return this.state.decoder.decode(byArray);
    }

    public short[][] decode(byte[] byArray, int n) {
        return this.state.decoder.decode(byArray, n);
    }

    public void close() {
        this.cleanable.clean();
    }

    public void resetState() {
        this.state.decoder.resetState();
    }

    public void setFrameSize(int n) {
        this.state.decoder.setFrameSize(n);
    }

    public boolean isClosed() {
        return this.state.decoder.isClosed();
    }
}

