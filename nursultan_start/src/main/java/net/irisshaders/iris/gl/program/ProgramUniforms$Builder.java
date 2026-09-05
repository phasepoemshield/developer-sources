/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.uniform.DynamicLocationalUniformHolder
 *  net.irisshaders.iris.gl.uniform.Uniform
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformType
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  org.lwjgl.BufferUtils
 */
package net.irisshaders.iris.gl.program;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalInt;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.program.ProgramUniforms;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.DynamicLocationalUniformHolder;
import net.irisshaders.iris.gl.uniform.Uniform;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformType;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import org.lwjgl.BufferUtils;

public class ProgramUniforms$Builder
implements DynamicLocationalUniformHolder {
    private final String name;
    private final int program;
    private final Map<Integer, String> locations;
    private final Map<String, Uniform> once;
    private final Map<String, Uniform> perTick;
    private final Map<String, Uniform> perFrame;
    private final Map<String, Uniform> dynamic;
    private final Map<String, UniformType> uniformNames;
    private final Map<String, UniformType> externalUniformNames;
    private final List<ValueUpdateNotifier> notifiersToReset;

    protected ProgramUniforms$Builder(String string, int n) {
        this.name = string;
        this.program = n;
        this.locations = new HashMap<Integer, String>();
        this.once = new HashMap<String, Uniform>();
        this.perTick = new HashMap<String, Uniform>();
        this.perFrame = new HashMap<String, Uniform>();
        this.dynamic = new HashMap<String, Uniform>();
        this.uniformNames = new HashMap<String, UniformType>();
        this.externalUniformNames = new HashMap<String, UniformType>();
        this.notifiersToReset = new ArrayList<ValueUpdateNotifier>();
    }

    public OptionalInt location(String string, UniformType uniformType) {
        int n = GlStateManager._glGetUniformLocation((int)this.program, (CharSequence)string);
        if (n == -1) {
            return OptionalInt.empty();
        }
        if (this.locations.containsKey(n) || this.uniformNames.containsKey(string)) {
            Iris.logger.warn("[" + this.name + "] Duplicate uniform: " + uniformType.toString().toLowerCase() + " " + string);
            return OptionalInt.empty();
        }
        this.locations.put(n, string);
        this.uniformNames.put(string, uniformType);
        return OptionalInt.of(n);
    }

    public ProgramUniforms buildUniforms() {
        int n = GlStateManager.glGetProgrami((int)this.program, (int)35718);
        IntBuffer intBuffer = BufferUtils.createIntBuffer((int)1);
        IntBuffer intBuffer2 = BufferUtils.createIntBuffer((int)1);
        for (int i = 0; i < n; ++i) {
            String string = IrisRenderSystem.getActiveUniform(this.program, i, 128, intBuffer, intBuffer2);
            if (string.isEmpty()) continue;
            int n2 = intBuffer.get(0);
            int n3 = intBuffer2.get(0);
            UniformType uniformType = this.uniformNames.get(string);
            UniformType uniformType2 = ProgramUniforms.getExpectedType(n3);
            if (uniformType == null || uniformType == uniformType2) continue;
            Object object = uniformType2 != null ? uniformType2.toString() : "(unsupported type: " + ProgramUniforms.getTypeName(n3) + ")";
            Iris.logger.error("[" + this.name + "] Wrong uniform type for " + string + ": Iris is providing " + String.valueOf(uniformType) + " but the program expects " + (String)object + ". Disabling that uniform.");
            this.once.remove(string);
            this.perTick.remove(string);
            this.perFrame.remove(string);
            this.dynamic.remove(string);
        }
        return new ProgramUniforms((ImmutableList<Uniform>)ImmutableList.copyOf(this.once.values()), (ImmutableList<Uniform>)ImmutableList.copyOf(this.perTick.values()), (ImmutableList<Uniform>)ImmutableList.copyOf(this.perFrame.values()), (ImmutableList<Uniform>)ImmutableList.copyOf(this.dynamic.values()), (ImmutableList<ValueUpdateNotifier>)ImmutableList.copyOf(this.notifiersToReset));
    }

    public ProgramUniforms$Builder addDynamicUniform(Uniform uniform, ValueUpdateNotifier valueUpdateNotifier) {
        Objects.requireNonNull(uniform);
        Objects.requireNonNull(valueUpdateNotifier);
        this.dynamic.put(this.locations.get(uniform.getLocation()), uniform);
        this.notifiersToReset.add(valueUpdateNotifier);
        return this;
    }

    public UniformHolder externallyManagedUniform(String string, UniformType uniformType) {
        this.externalUniformNames.put(string, uniformType);
        return this;
    }

    public ProgramUniforms$Builder addUniform(UniformUpdateFrequency uniformUpdateFrequency, Uniform uniform) {
        Objects.requireNonNull(uniform);
        switch (uniformUpdateFrequency) {
            case ONCE: {
                this.once.put(this.locations.get(uniform.getLocation()), uniform);
                break;
            }
            case PER_TICK: {
                this.perTick.put(this.locations.get(uniform.getLocation()), uniform);
                break;
            }
            case PER_FRAME: {
                this.perFrame.put(this.locations.get(uniform.getLocation()), uniform);
            }
        }
        return this;
    }
}

