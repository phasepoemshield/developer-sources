/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  minecraft.class03448
 *  minecraft.class06202
 *  net.irisshaders.iris.gl.uniform.Uniform
 *  net.irisshaders.iris.gl.uniform.UniformType
 *  net.irisshaders.iris.uniforms.SystemTimeUniforms
 */
package net.irisshaders.iris.gl.program;

import com.google.common.collect.ImmutableList;
import minecraft.class03448;
import minecraft.class06202;
import net.irisshaders.iris.gl.program.ProgramUniforms$Builder;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.Uniform;
import net.irisshaders.iris.gl.uniform.UniformType;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;

public class ProgramUniforms {
    private static ProgramUniforms active;
    private final ImmutableList<Uniform> perTick;
    private final ImmutableList<Uniform> perFrame;
    private final ImmutableList<Uniform> dynamic;
    private final ImmutableList<ValueUpdateNotifier> notifiersToReset;
    long lastTick = -1L;
    int lastFrame = -1;
    private ImmutableList<Uniform> once;

    public ProgramUniforms(ImmutableList<Uniform> immutableList, ImmutableList<Uniform> immutableList2, ImmutableList<Uniform> immutableList3, ImmutableList<Uniform> immutableList4, ImmutableList<ValueUpdateNotifier> immutableList5) {
        this.once = immutableList;
        this.perTick = immutableList2;
        this.perFrame = immutableList3;
        this.dynamic = immutableList4;
        this.notifiersToReset = immutableList5;
    }

    public void update() {
        int n;
        if (active != null) {
            active.removeListeners();
        }
        active = this;
        this.updateStage(this.dynamic);
        if (this.once != null) {
            this.updateStage(this.once);
            this.updateStage(this.perTick);
            this.updateStage(this.perFrame);
            this.lastTick = ProgramUniforms.getCurrentTick();
            this.once = null;
            return;
        }
        long l = ProgramUniforms.getCurrentTick();
        if (this.lastTick != l) {
            this.lastTick = l;
            this.updateStage(this.perTick);
        }
        if (this.lastFrame != (n = SystemTimeUniforms.COUNTER.getAsInt())) {
            this.lastFrame = n;
            this.updateStage(this.perFrame);
        }
    }

    public static ProgramUniforms$Builder builder(String string, int n) {
        return new ProgramUniforms$Builder(string, n);
    }

    static String getTypeName(int n) {
        Object object = n == 5126 ? "float" : (n == 5124 ? "int" : (n == 35676 ? "mat4" : (n == 35666 ? "vec4" : (n == 35675 ? "mat3" : (n == 35665 ? "vec3" : (n == 35674 ? "mat2" : (n == 35664 ? "vec2" : (n == 35667 ? "ivec2" : (n == 35669 ? "ivec4" : (n == 35679 ? "sampler3D" : (n == 35678 ? "sampler2D" : (n == 36306 ? "usampler2D" : (n == 36307 ? "usampler3D" : (n == 35677 ? "sampler1D" : (n == 35682 ? "sampler2DShadow" : (n == 35681 ? "sampler1DShadow" : (n == 36940 ? "image1D" : (n == 36941 ? "image2D" : (n == 36942 ? "image3D" : (n == 36951 ? "iimage1D" : (n == 36952 ? "iimage2D" : (n == 36953 ? "iimage3D" : (n == 36962 ? "uimage1D" : (n == 36963 ? "uimage2D" : (n == 36964 ? "uimage3D" : "(unknown:" + n + ")")))))))))))))))))))))))));
        return object;
    }

    static UniformType getExpectedType(int n) {
        if (n == 5126) {
            return UniformType.FLOAT;
        }
        if (n == 5124) {
            return UniformType.INT;
        }
        if (n == 35670) {
            return UniformType.INT;
        }
        if (n == 35676) {
            return UniformType.MAT4;
        }
        if (n == 35666) {
            return UniformType.VEC4;
        }
        if (n == 35669) {
            return UniformType.VEC4I;
        }
        if (n == 35675) {
            return UniformType.MAT3;
        }
        if (n == 35665) {
            return UniformType.VEC3;
        }
        if (n == 35668) {
            return UniformType.VEC3I;
        }
        if (n == 35674) {
            return null;
        }
        if (n == 35664) {
            return UniformType.VEC2;
        }
        if (n == 35667) {
            return UniformType.VEC2I;
        }
        if (n == 35679) {
            return UniformType.INT;
        }
        if (n == 35678) {
            return UniformType.INT;
        }
        if (n == 36306) {
            return UniformType.INT;
        }
        if (n == 36307) {
            return UniformType.INT;
        }
        if (n == 35677) {
            return UniformType.INT;
        }
        if (n == 35682) {
            return UniformType.INT;
        }
        if (n == 35681) {
            return UniformType.INT;
        }
        return null;
    }

    private static long getCurrentTick() {
        if ((class03448)class06202.Nq().T_3 == null) {
            return 0L;
        }
        return ((class03448)class06202.Nq().T_3).N();
    }

    private void updateStage(ImmutableList<Uniform> immutableList) {
        for (Uniform uniform : immutableList) {
            uniform.update();
        }
    }

    public void removeListeners() {
        active = null;
        for (ValueUpdateNotifier valueUpdateNotifier : this.notifiersToReset) {
            valueUpdateNotifier.setListener(null);
        }
    }

    public static void clearActiveUniforms() {
        if (active != null) {
            active.removeListeners();
        }
    }

    private static boolean isSampler(int n) {
        return n == 35677 || n == 35678 || n == 36306 || n == 36307 || n == 35679 || n == 35681 || n == 35682;
    }

    private static boolean isImage(int n) {
        return n == 36940 || n == 36941 || n == 36962 || n == 36963 || n == 36964 || n == 36951 || n == 36952 || n == 36953 || n == 36942 || n == 36946 || n == 36947;
    }
}

