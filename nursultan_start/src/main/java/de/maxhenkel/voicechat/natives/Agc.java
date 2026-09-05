/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.speex4j.AutomaticGainControl
 *  de.maxhenkel.speex4j.UnknownPlatformException
 */
package de.maxhenkel.voicechat.natives;

import de.maxhenkel.speex4j.AutomaticGainControl;
import de.maxhenkel.speex4j.UnknownPlatformException;
import de.maxhenkel.voicechat.natives.Agc$State;
import java.io.IOException;
import java.lang.ref.Cleaner;

public class Agc
implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();
    private final Agc$State state;
    private final Cleaner.Cleanable cleanable;

    public int getTarget() {
        return this.state.agc.getTarget();
    }

    public Agc(int n, int n2) throws IOException, UnknownPlatformException {
        AutomaticGainControl automaticGainControl = new AutomaticGainControl(n, n2);
        this.state = new Agc$State(automaticGainControl);
        this.cleanable = CLEANER.register(this, this.state);
    }

    @Override
    public void close() {
        this.cleanable.clean();
    }

    public void setTarget(int n) {
        this.state.agc.setTarget(n);
    }

    public int getIncrement() {
        return this.state.agc.getIncrement();
    }

    public int getMaxGain() {
        return this.state.agc.getMaxGain();
    }

    public void setMaxGain(int n) {
        this.state.agc.setMaxGain(n);
    }

    public boolean isClosed() {
        return this.state.agc.isClosed();
    }

    public boolean agc(short[] sArray) {
        return this.state.agc.agc(sArray);
    }

    public void setIncrement(int n) {
        this.state.agc.setIncrement(n);
    }

    public void setVadProbStart(int n) {
        this.state.agc.setVadProbStart(n);
    }

    public int getVadProbStart() {
        return this.state.agc.getVadProbStart();
    }

    public int getVadProbContinue() {
        return this.state.agc.getVadProbContinue();
    }

    public void setDecrement(int n) {
        this.state.agc.setDecrement(n);
    }

    public void setVadProbContinue(int n) {
        this.state.agc.setVadProbContinue(n);
    }

    public int getDecrement() {
        return this.state.agc.getDecrement();
    }
}

