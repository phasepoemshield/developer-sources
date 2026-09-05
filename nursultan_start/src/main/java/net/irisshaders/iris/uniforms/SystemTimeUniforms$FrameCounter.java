/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.uniforms;

import java.util.function.IntSupplier;

public class SystemTimeUniforms$FrameCounter
implements IntSupplier {
    private int count = 0;

    SystemTimeUniforms$FrameCounter() {
    }

    public void reset() {
        this.count = 0;
    }

    public void beginFrame() {
        this.count = (this.count + 1) % 720720;
    }

    @Override
    public int getAsInt() {
        return this.count;
    }
}

