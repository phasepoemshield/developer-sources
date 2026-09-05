/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Ints
 *  com.seibel.distanthorizons.api.DhApi$Delayed
 *  com.seibel.distanthorizons.api.objects.math.DhApiVec3f
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  net.irisshaders.iris.gl.uniform.LocationalUniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.pipeline.transform.PatchShaderType
 *  net.irisshaders.iris.pipeline.transform.ShaderPrinter
 *  net.irisshaders.iris.pipeline.transform.TransformPatcher
 *  net.irisshaders.iris.samplers.IrisSamplers
 *  net.irisshaders.iris.shaderpack.programs.ProgramSource
 *  net.irisshaders.iris.uniforms.CommonUniforms
 *  net.irisshaders.iris.uniforms.builtin.BuiltinReplacementUniforms
 *  net.irisshaders.iris.uniforms.custom.CustomUniforms
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.lwjgl.opengl.GL32
 *  org.lwjgl.opengl.GL43C
 *  org.lwjgl.opengl.GL46C
 *  org.lwjgl.system.MemoryStack
 */
package net.irisshaders.iris.compat.dh;

import com.google.common.primitives.Ints;
import com.seibel.distanthorizons.api.DhApi;
import com.seibel.distanthorizons.api.objects.math.DhApiVec3f;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.blending.BufferBlendOverride;
import net.irisshaders.iris.gl.image.ImageHolder;
import net.irisshaders.iris.gl.program.ProgramImages;
import net.irisshaders.iris.gl.program.ProgramImages$Builder;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramSamplers$Builder;
import net.irisshaders.iris.gl.program.ProgramUniforms;
import net.irisshaders.iris.gl.program.ProgramUniforms$Builder;
import net.irisshaders.iris.gl.sampler.SamplerHolder;
import net.irisshaders.iris.gl.shader.GlShader;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.gl.uniform.LocationalUniformHolder;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.ShaderPrinter;
import net.irisshaders.iris.pipeline.transform.TransformPatcher;
import net.irisshaders.iris.samplers.IrisSamplers;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;
import net.irisshaders.iris.uniforms.CommonUniforms;
import net.irisshaders.iris.uniforms.builtin.BuiltinReplacementUniforms;
import net.irisshaders.iris.uniforms.custom.CustomUniforms;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.opengl.GL46C;
import org.lwjgl.system.MemoryStack;

public class IrisLodRenderProgram {
    public final int modelOffsetUniform;
    public final int worldYOffsetUniform;
    public final int mircoOffsetUniform;
    public final int modelViewUniform;
    public final int modelViewInverseUniform;
    public final int projectionUniform;
    public final int projectionInverseUniform;
    public final int normalMatrix3fUniform;
    public final int clipDistanceUniform;
    private final int id = GL43C.glCreateProgram();
    private final ProgramUniforms uniforms;
    private final CustomUniforms customUniforms;
    private final ProgramSamplers samplers;
    private final ProgramImages images;
    private final BlendModeOverride blend;
    private final BufferBlendOverride[] bufferBlendOverrides;

    private IrisLodRenderProgram(String string, boolean bl, boolean bl2, BlendModeOverride blendModeOverride, BufferBlendOverride[] bufferBlendOverrideArray, String string2, String string3, String string4, String string5, String string6, CustomUniforms customUniforms, IrisRenderingPipeline irisRenderingPipeline) {
        GL32.glBindAttribLocation((int)this.id, (int)0, (CharSequence)"vPosition");
        GL32.glBindAttribLocation((int)this.id, (int)1, (CharSequence)"iris_color");
        GL32.glBindAttribLocation((int)this.id, (int)2, (CharSequence)"irisExtra");
        this.bufferBlendOverrides = bufferBlendOverrideArray;
        GlShader glShader = new GlShader(ShaderType.VERTEX, string + ".vsh", string2);
        GL43C.glAttachShader((int)this.id, (int)glShader.getHandle());
        GlShader glShader2 = null;
        if (string3 != null) {
            glShader2 = new GlShader(ShaderType.TESSELATION_CONTROL, string + ".tcs", string3);
            GL43C.glAttachShader((int)this.id, (int)glShader2.getHandle());
        }
        GlShader glShader3 = null;
        if (string4 != null) {
            glShader3 = new GlShader(ShaderType.TESSELATION_EVAL, string + ".tes", string4);
            GL43C.glAttachShader((int)this.id, (int)glShader3.getHandle());
        }
        GlShader glShader4 = null;
        if (string5 != null) {
            glShader4 = new GlShader(ShaderType.GEOMETRY, string + ".gsh", string5);
            GL43C.glAttachShader((int)this.id, (int)glShader4.getHandle());
        }
        GlShader glShader5 = new GlShader(ShaderType.FRAGMENT, string + ".fsh", string6);
        GL43C.glAttachShader((int)this.id, (int)glShader5.getHandle());
        GL32.glLinkProgram((int)this.id);
        int n = GL32.glGetProgrami((int)this.id, (int)35714);
        if (n != 1) {
            String string7 = "Shader link error in Iris DH program! Details: " + GL32.glGetProgramInfoLog((int)this.id);
            this.free();
            throw new RuntimeException(string7);
        }
        GL32.glUseProgram((int)this.id);
        glShader.destroy();
        glShader5.destroy();
        if (glShader2 != null) {
            glShader2.destroy();
        }
        if (glShader3 != null) {
            glShader3.destroy();
        }
        if (glShader4 != null) {
            glShader4.destroy();
        }
        this.blend = blendModeOverride;
        ProgramUniforms$Builder programUniforms$Builder = ProgramUniforms.builder(string, this.id);
        ProgramSamplers$Builder programSamplers$Builder = ProgramSamplers.builder(this.id, (Set<Integer>)IrisSamplers.WORLD_RESERVED_TEXTURE_UNITS);
        CommonUniforms.addDynamicUniforms((DynamicUniformHolder)programUniforms$Builder, (FogMode)FogMode.PER_VERTEX);
        customUniforms.assignTo((LocationalUniformHolder)programUniforms$Builder);
        BuiltinReplacementUniforms.addBuiltinReplacementUniforms((UniformHolder)programUniforms$Builder);
        ProgramImages$Builder programImages$Builder = ProgramImages.builder(this.id);
        irisRenderingPipeline.addGbufferOrShadowSamplers((SamplerHolder)programSamplers$Builder, (ImageHolder)programImages$Builder, bl ? () -> ((IrisRenderingPipeline)irisRenderingPipeline).getFlippedBeforeShadow() : () -> bl2 ? irisRenderingPipeline.getFlippedAfterTranslucent() : irisRenderingPipeline.getFlippedAfterPrepare(), bl, false, true, false);
        customUniforms.mapholderToPass((LocationalUniformHolder)programUniforms$Builder, (Object)this);
        this.uniforms = programUniforms$Builder.buildUniforms();
        this.customUniforms = customUniforms;
        this.samplers = programSamplers$Builder.build();
        this.images = programImages$Builder.build();
        this.modelOffsetUniform = this.tryGetUniformLocation2("modelOffset");
        this.worldYOffsetUniform = this.tryGetUniformLocation2("worldYOffset");
        this.mircoOffsetUniform = this.tryGetUniformLocation2("mircoOffset");
        this.projectionUniform = this.tryGetUniformLocation2("iris_ProjectionMatrix");
        this.projectionInverseUniform = this.tryGetUniformLocation2("iris_ProjectionMatrixInverse");
        this.modelViewUniform = this.tryGetUniformLocation2("iris_ModelViewMatrix");
        this.modelViewInverseUniform = this.tryGetUniformLocation2("iris_ModelViewMatrixInverse");
        this.normalMatrix3fUniform = this.tryGetUniformLocation2("iris_NormalMatrix");
        this.clipDistanceUniform = this.tryGetUniformLocation2("clipDistance");
    }

    public void free() {
        GL43C.glDeleteProgram((int)this.id);
    }

    public void bind() {
        GL43C.glUseProgram((int)this.id);
        if (this.blend != null) {
            this.blend.apply();
        }
        for (BufferBlendOverride bufferBlendOverride : this.bufferBlendOverrides) {
            bufferBlendOverride.apply();
        }
    }

    private void setUniform(int n, float f) {
        GL43C.glUniform1f((int)n, (float)f);
    }

    private void setUniform(int n, DhApiVec3f dhApiVec3f) {
        GL43C.glUniform3f((int)n, (float)dhApiVec3f.x, (float)dhApiVec3f.y, (float)dhApiVec3f.z);
    }

    public void setUniform(int n, Matrix4fc matrix4fc) {
        if (n == -1 || matrix4fc == null) {
            return;
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            FloatBuffer floatBuffer = memoryStack.callocFloat(16);
            matrix4fc.get(floatBuffer);
            floatBuffer.rewind();
            GL46C.glUniformMatrix4fv((int)n, (boolean)false, (FloatBuffer)floatBuffer);
        }
    }

    public void setUniform(int n, Matrix3f matrix3f) {
        if (n == -1) {
            return;
        }
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            FloatBuffer floatBuffer = memoryStack.callocFloat(9);
            matrix3f.get(floatBuffer);
            floatBuffer.rewind();
            IrisRenderSystem.uniformMatrix3fv(n, false, floatBuffer);
        }
    }

    public void setModelPos(DhApiVec3f dhApiVec3f) {
        this.setUniform(this.modelOffsetUniform, dhApiVec3f);
    }

    public static IrisLodRenderProgram createProgram(String string, boolean bl, boolean bl2, ProgramSource programSource, CustomUniforms customUniforms, IrisRenderingPipeline irisRenderingPipeline) {
        Map map = TransformPatcher.patchDHTerrain((String)string, (String)((String)programSource.getVertexSource().orElseThrow(RuntimeException::new)), (String)programSource.getTessControlSource().orElse(null), (String)programSource.getTessEvalSource().orElse(null), (String)programSource.getGeometrySource().orElse(null), (String)((String)programSource.getFragmentSource().orElseThrow(RuntimeException::new)), (Object2ObjectMap)irisRenderingPipeline.getTextureMap());
        String string2 = (String)map.get(PatchShaderType.VERTEX);
        String string3 = (String)map.get(PatchShaderType.TESS_CONTROL);
        String string4 = (String)map.get(PatchShaderType.TESS_EVAL);
        String string5 = (String)map.get(PatchShaderType.GEOMETRY);
        String string6 = (String)map.get(PatchShaderType.FRAGMENT);
        ShaderPrinter.printProgram((String)string).addSources(map).setName("dh_" + string).print();
        ArrayList arrayList = new ArrayList();
        programSource.getDirectives().getBufferBlendOverrides().forEach(bufferBlendInformation -> {
            int n = Ints.indexOf((int[])programSource.getDirectives().getDrawBuffers(), (int)bufferBlendInformation.index());
            if (n > -1) {
                arrayList.add(new BufferBlendOverride(n, bufferBlendInformation.blendMode()));
            }
        });
        return new IrisLodRenderProgram(string, bl, bl2, programSource.getDirectives().getBlendModeOverride().orElse(null), (BufferBlendOverride[])arrayList.toArray(BufferBlendOverride[]::new), string2, string3, string4, string5, string6, customUniforms, irisRenderingPipeline);
    }

    public void fillUniformData(Matrix4fc matrix4fc, Matrix4fc matrix4fc2, int n, float f) {
        GL43C.glUseProgram((int)this.id);
        this.setUniform(this.modelViewUniform, matrix4fc2);
        this.setUniform(this.modelViewInverseUniform, (Matrix4fc)matrix4fc2.invert(new Matrix4f()));
        this.setUniform(this.projectionUniform, matrix4fc);
        this.setUniform(this.projectionInverseUniform, (Matrix4fc)matrix4fc.invert(new Matrix4f()));
        this.setUniform(this.normalMatrix3fUniform, new Matrix4f(matrix4fc2).invert().transpose3x3(new Matrix3f()));
        this.setUniform(this.mircoOffsetUniform, 0.01f);
        if (this.worldYOffsetUniform != -1) {
            this.setUniform(this.worldYOffsetUniform, n);
        }
        float f2 = DhApi.Delayed.renderProxy.getNearClipPlaneDistanceInBlocks(f);
        this.setUniform(this.clipDistanceUniform, f2);
        this.samplers.update();
        this.uniforms.update();
        this.customUniforms.push((Object)this);
        this.images.update();
    }

    public void unbind() {
        GL43C.glUseProgram((int)0);
        ProgramUniforms.clearActiveUniforms();
        ProgramSamplers.clearActiveSamplers();
        BlendModeOverride.restore();
    }

    public int tryGetUniformLocation2(CharSequence charSequence) {
        return GL32.glGetUniformLocation((int)this.id, (CharSequence)charSequence);
    }
}

