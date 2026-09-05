/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.irisshaders.iris.gl.texture.TextureType
 */
package net.irisshaders.iris.gl.program;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.program.ComputeProgram;
import net.irisshaders.iris.gl.program.Program;
import net.irisshaders.iris.gl.program.ProgramImages;
import net.irisshaders.iris.gl.program.ProgramImages$Builder;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramSamplers$Builder;
import net.irisshaders.iris.gl.program.ProgramUniforms$Builder;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.shader.GlShader;
import net.irisshaders.iris.gl.shader.ProgramCreator;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.TextureType;

public class ProgramBuilder
extends ProgramUniforms$Builder
implements ImageHolder,
SamplerHolder {
    private final int program;
    private final ProgramSamplers$Builder samplers;
    private final ProgramImages$Builder images;

    private ProgramBuilder(String string, int n, ImmutableSet<Integer> immutableSet) {
        super(string, n);
        this.program = n;
        this.samplers = ProgramSamplers.builder(n, immutableSet);
        this.images = ProgramImages.builder(n);
    }

    public static ProgramBuilder begin(String string, String string2, String string3, String string4, ImmutableSet<Integer> immutableSet) {
        RenderSystem.assertOnRenderThread();
        GlShader glShader = ProgramBuilder.buildShader(ShaderType.VERTEX, string + ".vsh", string2);
        GlShader glShader2 = string3 != null ? ProgramBuilder.buildShader(ShaderType.GEOMETRY, string + ".gsh", string3) : null;
        GlShader glShader3 = ProgramBuilder.buildShader(ShaderType.FRAGMENT, string + ".fsh", string4);
        int n = glShader2 != null ? ProgramCreator.create(string, glShader, glShader2, glShader3) : ProgramCreator.create(string, glShader, glShader3);
        glShader.destroy();
        if (glShader2 != null) {
            glShader2.destroy();
        }
        glShader3.destroy();
        return new ProgramBuilder(string, n, immutableSet);
    }

    public Program build() {
        return new Program(this.program, super.buildUniforms(), this.samplers.build(), this.images.build());
    }

    public ComputeProgram buildCompute() {
        return new ComputeProgram(this.program, super.buildUniforms(), this.samplers.build(), this.images.build());
    }

    @Override
    public void addExternalSampler(int n, String ... stringArray) {
        this.samplers.addExternalSampler(n, stringArray);
    }

    @Override
    public boolean addDynamicSampler(TextureType textureType, IntSupplier intSupplier, Supplier<GlSampler> supplier, String ... stringArray) {
        return this.samplers.addDynamicSampler(textureType, intSupplier, supplier, stringArray);
    }

    @Override
    public boolean addDynamicSampler(IntSupplier intSupplier, GlSampler glSampler, ValueUpdateNotifier valueUpdateNotifier, String ... stringArray) {
        return this.samplers.addDynamicSampler(intSupplier, glSampler, valueUpdateNotifier, stringArray);
    }

    @Override
    public boolean addDynamicSampler(IntSupplier intSupplier, GlSampler glSampler, String ... stringArray) {
        return this.samplers.addDynamicSampler(intSupplier, glSampler, stringArray);
    }

    @Override
    public boolean addDynamicSampler(TextureType textureType, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier, Supplier<GlSampler> supplier, String ... stringArray) {
        return this.samplers.addDynamicSampler(textureType, intSupplier, valueUpdateNotifier, supplier, stringArray);
    }

    public static ProgramBuilder beginCompute(String string, String string2, ImmutableSet<Integer> immutableSet) {
        RenderSystem.assertOnRenderThread();
        if (!IrisRenderSystem.supportsCompute()) {
            throw new IllegalStateException("This PC does not support compute shaders, but it's attempting to be used???");
        }
        GlShader glShader = ProgramBuilder.buildShader(ShaderType.COMPUTE, string + ".csh", string2);
        int n = ProgramCreator.create(string, glShader);
        glShader.destroy();
        return new ProgramBuilder(string, n, immutableSet);
    }

    @Override
    public boolean addDefaultSampler(IntSupplier intSupplier, String ... stringArray) {
        return this.samplers.addDefaultSampler(intSupplier, stringArray);
    }

    @Override
    public boolean addDefaultSampler(TextureType textureType, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier, Supplier<GlSampler> supplier, String ... stringArray) {
        return this.samplers.addDefaultSampler(textureType, intSupplier, valueUpdateNotifier, supplier, stringArray);
    }

    private static GlShader buildShader(ShaderType shaderType, String string, String string2) {
        try {
            return new GlShader(shaderType, string, string2);
        }
        catch (ShaderCompileException shaderCompileException) {
            throw shaderCompileException;
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException("Failed to compile " + String.valueOf((Object)shaderType) + " shader for program " + string, runtimeException);
        }
    }

    @Override
    public void addTextureImage(IntSupplier intSupplier, InternalTextureFormat internalTextureFormat, String string) {
        this.images.addTextureImage(intSupplier, internalTextureFormat, string);
    }

    public void bindAttributeLocation(int n, String string) {
        IrisRenderSystem.bindAttributeLocation(this.program, n, string);
    }

    @Override
    public boolean hasSampler(String string) {
        return this.samplers.hasSampler(string);
    }

    @Override
    public boolean hasImage(String string) {
        return this.images.hasImage(string);
    }
}

