/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.speex4j;

import de.maxhenkel.speex4j.NativeInitializer;
import de.maxhenkel.speex4j.UnknownPlatformException;
import java.io.IOException;

public class AutomaticGainControl
implements AutoCloseable {
    private long pointer;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getTarget() {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            return this.getTarget0(this.pointer);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public AutomaticGainControl(int n, int n2) throws IOException, UnknownPlatformException {
        Class<AutomaticGainControl> clazz = AutomaticGainControl.class;
        synchronized (AutomaticGainControl.class) {
            NativeInitializer.load("libspeex4j");
            // ** MonitorExit[var3_3] (shouldn't be in output)
            this.pointer = AutomaticGainControl.createAgc0(n, n2);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            this.destroyAgc0(this.pointer);
            this.pointer = 0L;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setTarget(int n) {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            this.setTarget0(this.pointer, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getIncrement() {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            return this.getIncrement0(this.pointer);
        }
    }

    private static native long createAgc0(int var0, int var1);

    private native int getTarget0(long var1);

    private native boolean agc0(long var1, short[] var3);

    private native void setTarget0(long var1, int var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getMaxGain() {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            return this.getMaxGain0(this.pointer);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setMaxGain(int n) {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            this.setMaxGain0(this.pointer, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean isClosed() {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            return this.pointer == 0L;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean agc(short[] sArray) {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            return this.agc0(this.pointer, sArray);
        }
    }

    private native void setVadProbContinue0(long var1, int var3);

    private native int getVadProbContinue0(long var1);

    private native void setMaxGain0(long var1, int var3);

    private native int getIncrement0(long var1);

    private native void setVadProbStart0(long var1, int var3);

    private native int getVadProbStart0(long var1);

    private native void destroyAgc0(long var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setIncrement(int n) {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            this.setIncrement0(this.pointer, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setVadProbStart(int n) {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            this.setVadProbStart0(this.pointer, n);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getVadProbStart() {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            return this.getVadProbStart0(this.pointer);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getVadProbContinue() {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            return this.getVadProbContinue0(this.pointer);
        }
    }

    private native int getMaxGain0(long var1);

    private native void setDecrement0(long var1, int var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setDecrement(int n) {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            this.setDecrement0(this.pointer, n);
        }
    }

    private native int getDecrement0(long var1);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setVadProbContinue(int n) {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            this.setVadProbContinue0(this.pointer, n);
        }
    }

    private native void setIncrement0(long var1, int var3);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public int getDecrement() {
        AutomaticGainControl automaticGainControl = this;
        synchronized (automaticGainControl) {
            return this.getDecrement0(this.pointer);
        }
    }
}

