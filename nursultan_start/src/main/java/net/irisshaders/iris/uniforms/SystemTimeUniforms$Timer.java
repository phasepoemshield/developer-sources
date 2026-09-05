/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.uniforms;

import java.util.OptionalLong;

public final class SystemTimeUniforms$Timer {
    private float frameTimeCounter;
    private float lastFrameTime;
    private OptionalLong lastStartTime;

    public SystemTimeUniforms$Timer() {
        this.reset();
    }

    public void reset() {
        this.frameTimeCounter = 0.0f;
        this.lastFrameTime = 0.0f;
        this.lastStartTime = OptionalLong.empty();
    }

    public void beginFrame(long l) {
        long l2 = l - this.lastStartTime.orElse(l);
        long l3 = l2 / 1000L / 1000L;
        this.lastFrameTime = (float)l3 / 1000.0f;
        this.frameTimeCounter += this.lastFrameTime;
        if (this.frameTimeCounter >= 3600.0f) {
            this.frameTimeCounter = 0.0f;
        }
        this.lastStartTime = OptionalLong.of(l);
    }

    public float getLastFrameTime() {
        return this.lastFrameTime;
    }

    public float getFrameTimeCounter() {
        return this.frameTimeCounter;
    }
}

