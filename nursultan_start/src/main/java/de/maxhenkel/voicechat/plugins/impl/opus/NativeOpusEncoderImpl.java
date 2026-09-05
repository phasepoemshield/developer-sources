/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.opus4j.OpusEncoder
 *  de.maxhenkel.opus4j.OpusEncoder$Application
 *  de.maxhenkel.opus4j.UnknownPlatformException
 *  de.maxhenkel.voicechat.api.opus.OpusEncoder
 */
package de.maxhenkel.voicechat.plugins.impl.opus;

import de.maxhenkel.opus4j.OpusEncoder;
import de.maxhenkel.opus4j.UnknownPlatformException;
import de.maxhenkel.voicechat.plugins.impl.opus.NativeOpusEncoderImpl$State;
import java.io.IOException;
import java.lang.ref.Cleaner;

public class NativeOpusEncoderImpl
implements de.maxhenkel.voicechat.api.opus.OpusEncoder {
    private static final Cleaner CLEANER = Cleaner.create();
    private final NativeOpusEncoderImpl$State state;
    private final Cleaner.Cleanable cleanable;

    public NativeOpusEncoderImpl(int n, int n2, OpusEncoder.Application application) throws IOException, UnknownPlatformException {
        OpusEncoder opusEncoder = new OpusEncoder(n, n2, application);
        opusEncoder.setMaxPacketLossPercentage(0.05f);
        this.state = new NativeOpusEncoderImpl$State(opusEncoder);
        this.cleanable = CLEANER.register(this, this.state);
    }

    public byte[] encode(short[] sArray) {
        return this.state.encoder.encode(sArray);
    }

    public void close() {
        this.cleanable.clean();
    }

    public void resetState() {
        this.state.encoder.resetState();
    }

    public void setMaxPayloadSize(int n) {
        this.state.encoder.setMaxPayloadSize(n);
    }

    public boolean isClosed() {
        return this.state.encoder.isClosed();
    }
}

