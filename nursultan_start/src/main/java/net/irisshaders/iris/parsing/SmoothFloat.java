/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.uniforms.SystemTimeUniforms
 */
package net.irisshaders.iris.parsing;

import net.irisshaders.iris.uniforms.SystemTimeUniforms;

public class SmoothFloat {
    private static final double LN_OF_2 = Math.log(2.0);
    private float accumulator;
    private boolean hasInitialValue;
    private float cachedHalfLifeUp;
    private float cachedDecayUp;
    private float cachedHalfLifeDown;
    private float cachedDecayDown;

    public float updateAndGet(float f, float f2, float f3) {
        float f4;
        if (f2 != this.cachedHalfLifeUp) {
            this.cachedHalfLifeUp = f2;
            this.cachedDecayUp = f2 == 0.0f ? 0.0f : this.computeDecay(f2 * 0.1f);
        }
        if (f3 != this.cachedHalfLifeDown) {
            this.cachedHalfLifeDown = f3;
            this.cachedDecayDown = f3 == 0.0f ? 0.0f : this.computeDecay(f3 * 0.1f);
        }
        if (!this.hasInitialValue) {
            this.accumulator = f;
            this.hasInitialValue = true;
            return this.accumulator;
        }
        float f5 = SystemTimeUniforms.TIMER.getLastFrameTime();
        float f6 = f4 = f > this.accumulator ? this.cachedDecayUp : this.cachedDecayDown;
        if (f4 == 0.0f) {
            this.accumulator = f;
            return this.accumulator;
        }
        float f7 = 1.0f - SmoothFloat.exponentialDecayFactor(f4, f5);
        this.accumulator = SmoothFloat.lerp(this.accumulator, f, f7);
        return this.accumulator;
    }

    private static float lerp(float f, float f2, float f3) {
        return (1.0f - f3) * f + f3 * f2;
    }

    private float computeDecay(float f) {
        return (float)(1.0 / ((double)f / LN_OF_2));
    }

    private static float exponentialDecayFactor(float f, float f2) {
        return (float)Math.exp(-f * f2);
    }
}

