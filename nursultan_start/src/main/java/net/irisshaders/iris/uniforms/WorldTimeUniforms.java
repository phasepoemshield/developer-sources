/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00608
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class08165
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.shaderpack.DimensionId
 */
package net.irisshaders.iris.uniforms;

import java.util.Objects;
import minecraft.class00608;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class08165;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.shaderpack.DimensionId;
import net.irisshaders.iris.uniforms.CapturedRenderingState;

public final class WorldTimeUniforms {
    private WorldTimeUniforms() {
    }

    private static class03448 getWorld() {
        return Objects.requireNonNull((class03448)class06202.Nq().T_3);
    }

    public static void addWorldTimeUniforms(UniformHolder uniformHolder) {
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_TICK, "worldTime", WorldTimeUniforms::getWorldDayTime).uniform1i(UniformUpdateFrequency.PER_TICK, "worldDay", WorldTimeUniforms::getWorldDay).uniform1i(UniformUpdateFrequency.PER_TICK, "moonPhase", () -> ((class08165)((class03386)class06202.Nq().i_5).s().U().N(class00608.s, CapturedRenderingState.INSTANCE.getTickDelta())).N());
    }

    static int getWorldDayTime() {
        long l = WorldTimeUniforms.getWorld().method_8532();
        if (Iris.getCurrentDimension() == DimensionId.END || Iris.getCurrentDimension() == DimensionId.NETHER) {
            return (int)(l % 24000L);
        }
        long l2 = WorldTimeUniforms.getWorld().method_8597().u() ? 0L : l % 24000L;
        return (int)l2;
    }

    private static int getWorldDay() {
        long l = WorldTimeUniforms.getWorld().method_8532();
        long l2 = l / 24000L;
        return (int)l2;
    }
}

