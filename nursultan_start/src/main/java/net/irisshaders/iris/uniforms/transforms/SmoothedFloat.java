/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.uniform.FloatSupplier
 */
package net.irisshaders.iris.uniforms.transforms;

import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.uniforms.FrameUpdateNotifier;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;

public class SmoothedFloat
implements FloatSupplier {
    private static final double LN_OF_2 = Math.log(2.0);
    private final FloatSupplier unsmoothed;
    private final float decayConstantUp;
    private final float decayConstantDown;
    private float accumulator;
    private boolean hasInitialValue;

    public SmoothedFloat(float f, float f2, FloatSupplier floatSupplier, FrameUpdateNotifier frameUpdateNotifier) {
        this.decayConstantUp = this.computeDecay(f * 0.1f);
        this.decayConstantDown = this.computeDecay(f2 * 0.1f);
        this.unsmoothed = floatSupplier;
        frameUpdateNotifier.addListener(this::update);
    }

    private void update() {
        if (!this.hasInitialValue) {
            this.accumulator = this.unsmoothed.getAsFloat();
            this.hasInitialValue = true;
            return;
        }
        float f = this.unsmoothed.getAsFloat();
        float f2 = SystemTimeUniforms.TIMER.getLastFrameTime();
        float f3 = 1.0f - SmoothedFloat.exponentialDecayFactor(f > this.accumulator ? this.decayConstantUp : this.decayConstantDown, f2);
        this.accumulator = SmoothedFloat.lerp(this.accumulator, f, f3);
    }

    public float getAsFloat() {
        if (!this.hasInitialValue) {
            return this.unsmoothed.getAsFloat();
        }
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

