/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 */
package net.irisshaders.iris.uniforms;

import java.util.function.IntSupplier;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.uniforms.SystemTimeUniforms$FrameCounter;
import net.irisshaders.iris.uniforms.SystemTimeUniforms$Timer;

public final class SystemTimeUniforms {
    public static final SystemTimeUniforms$Timer TIMER = new SystemTimeUniforms$Timer();
    public static final SystemTimeUniforms$FrameCounter COUNTER = new SystemTimeUniforms$FrameCounter();

    private SystemTimeUniforms() {
    }

    public static void addSystemTimeUniforms(UniformHolder uniformHolder) {
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "frameCounter", (IntSupplier)COUNTER).uniform1f(UniformUpdateFrequency.PER_FRAME, "frameTime", TIMER::getLastFrameTime).uniform1f(UniformUpdateFrequency.PER_FRAME, "frameTimeCounter", TIMER::getFrameTimeCounter);
    }
}

