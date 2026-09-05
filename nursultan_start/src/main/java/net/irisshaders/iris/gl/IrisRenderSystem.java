/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00062
 *  minecraft.class00312
 *  minecraft.class06202
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  org.joml.Matrix4f
 *  org.joml.Vector3i
 *  org.lwjgl.opengl.ARBDrawBuffersBlend
 *  org.lwjgl.opengl.EXTShaderImageLoadStore
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL30C
 *  org.lwjgl.opengl.GL32C
 *  org.lwjgl.opengl.GL33C
 *  org.lwjgl.opengl.GL42C
 *  org.lwjgl.opengl.GL43C
 *  org.lwjgl.opengl.GL45C
 *  org.lwjgl.opengl.GL46C
 */
package net.irisshaders.iris.gl;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import minecraft.class00062;
import minecraft.class00312;
import minecraft.class06202;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.BooleanStateExtended;
import net.irisshaders.iris.gl.IrisRenderSystem$DSAARB;
import net.irisshaders.iris.gl.IrisRenderSystem$DSAAccess;
import net.irisshaders.iris.gl.IrisRenderSystem$DSACore;
import net.irisshaders.iris.gl.IrisRenderSystem$DSAUnsupported;
import net.irisshaders.iris.gl.sampler.SamplerLimits;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import org.joml.Matrix4f;
import org.joml.Vector3i;
import org.lwjgl.opengl.ARBDrawBuffersBlend;
import org.lwjgl.opengl.EXTShaderImageLoadStore;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL30C;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.opengl.GL33C;
import org.lwjgl.opengl.GL42C;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.opengl.GL45C;
import org.lwjgl.opengl.GL46C;

public class IrisRenderSystem {
    private static final int[] emptyArray = new int[SamplerLimits.get().getMaxTextureUnits()];
    private static GpuBufferSlice backupProjection;
    private static class00062 perspectiveProjectionMatrixBuffer;
    private static class00312 backupProjectionType;
    private static IrisRenderSystem$DSAAccess dsaState;
    private static boolean hasMultibind;
    private static boolean supportsCompute;
    private static boolean supportsTesselation;
    private static int polygonMode;
    private static int backupPolygonMode;
    private static int[] samplers;
    private static final IntList textureToUnswizzle;
    private static int lastTex;
    private static boolean cullingState;

    public static void readBuffer(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        dsaState.readBuffer(n, n2);
    }

    public static void initRenderer() {
        if (GL.getCapabilities().OpenGL45) {
            dsaState = new IrisRenderSystem$DSACore();
            Iris.logger.info("OpenGL 4.5 detected, enabling DSA.");
        } else if (GL.getCapabilities().GL_ARB_direct_state_access) {
            dsaState = new IrisRenderSystem$DSAARB();
            Iris.logger.info("ARB_direct_state_access detected, enabling DSA.");
        } else {
            dsaState = new IrisRenderSystem$DSAUnsupported();
            Iris.logger.info("DSA support not detected.");
        }
        hasMultibind = GL.getCapabilities().OpenGL45 || GL.getCapabilities().GL_ARB_multi_bind;
        perspectiveProjectionMatrixBuffer = new class00062("Iris shadow map projection");
        supportsCompute = GL.getCapabilities().glDispatchCompute != 0L;
        supportsTesselation = GL.getCapabilities().GL_ARB_tessellation_shader || GL.getCapabilities().OpenGL40;
        samplers = new int[SamplerLimits.get().getMaxTextureUnits()];
    }

    public static int createTexture(int n) {
        return dsaState.createTexture(n);
    }

    public static String getStringi(int n, int n2) {
        return GL46C.glGetStringi((int)n, (int)n2);
    }

    public static void onProgramUse() {
        for (int i = 0; i < textureToUnswizzle.size(); ++i) {
            int[] nArray = new int[4];
            nArray[0] = 6403;
            nArray[1] = 6404;
            nArray[2] = 6405;
            nArray[3] = 6406;
            IrisRenderSystem.texParameteriv(textureToUnswizzle.getInt(i), TextureType.TEXTURE_2D.getGlType(), 36422, nArray);
        }
        textureToUnswizzle.clear();
    }

    public static void backupAndDisableCullingState(boolean bl) {
        cullingState = (Boolean)class06202.Nq().U_2;
        Boolean bl2 = (Boolean)class06202.Nq().U_2 != false && !bl;
        class06202.Nq().U_2 = bl2;
    }

    public static void uniformMatrix3fv(int n, boolean bl, float[] fArray) {
        RenderSystem.assertOnRenderThread();
        GL46C.glUniformMatrix3fv((int)n, (boolean)bl, (float[])fArray);
    }

    public static void uniformMatrix3fv(int n, boolean bl, FloatBuffer floatBuffer) {
        RenderSystem.assertOnRenderThread();
        GL46C.glUniformMatrix3fv((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
    }

    public static void copyTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        RenderSystem.assertOnRenderThread();
        GL32C.glCopyTexImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8);
    }

    public static int createBuffers() {
        return dsaState.createBuffers();
    }

    public static void blitFramebuffer(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        dsaState.blitFramebuffer(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12);
    }

    public static int createFramebuffer() {
        return dsaState.createFramebuffer();
    }

    public static void drawBuffers(int n, int[] nArray) {
        RenderSystem.assertOnRenderThread();
        dsaState.drawBuffers(n, nArray);
    }

    public static void restoreTexture() {
        if (lastTex != -1) {
            GL30C.glBindTexture((int)3553, (int)lastTex);
            lastTex = -1;
        }
    }

    public static void clearBufferuiv(int n, int n2, int n3, int[] nArray) {
        RenderSystem.assertOnRenderThread();
        dsaState.clearBufferuiv(n, n2, n3, nArray);
    }

    public static void copyTexSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        dsaState.copyTexSubImage2D(n, n2, n3, n4, n5, n6, n7, n8, n9);
    }

    public static void texParameteri(int n, int n2, int n3, int n4) {
        RenderSystem.assertOnRenderThread();
        dsaState.texParameteri(n, n2, n3, n4);
    }

    public static boolean supportsCompute() {
        return supportsCompute;
    }

    public static boolean supportsSSBO() {
        return GL.getCapabilities().OpenGL44 || GL.getCapabilities().GL_ARB_shader_storage_buffer_object && GL.getCapabilities().GL_ARB_buffer_storage;
    }

    public static void texParameteriv(int n, int n2, int n3, int[] nArray) {
        RenderSystem.assertOnRenderThread();
        dsaState.texParameteriv(n, n2, n3, nArray);
    }

    public static void clearBufferiv(int n, int n2, int n3, int[] nArray) {
        RenderSystem.assertOnRenderThread();
        dsaState.clearBufferiv(n, n2, n3, nArray);
    }

    public static void generateMipmaps(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        dsaState.generateMipmaps(n, n2);
    }

    public static void clearBufferfv(int n, int n2, int n3, float[] fArray) {
        RenderSystem.assertOnRenderThread();
        dsaState.clearBufferfv(n, n2, n3, fArray);
    }

    public static void texParameterf(int n, int n2, int n3, float f) {
        RenderSystem.assertOnRenderThread();
        dsaState.texParameterf(n, n2, n3, f);
    }

    public static int getTexParameteri(int n, int n2, int n3) {
        RenderSystem.assertOnRenderThread();
        return dsaState.getTexParameteri(n, n2, n3);
    }

    public static void bindTextureToUnit(int n, int n2, int n3) {
        dsaState.bindTextureToUnit(n, n2, n3);
    }

    public static int bufferStorage(int n, float[] fArray, int n2) {
        RenderSystem.assertOnRenderThread();
        return dsaState.bufferStorage(n, fArray, n2);
    }

    public static void bufferStorage(int n, long l, int n2) {
        RenderSystem.assertOnRenderThread();
        GL45C.glBufferStorage((int)n, (long)l, (int)n2);
    }

    public static void uniformMatrix4fv(int n, boolean bl, FloatBuffer floatBuffer) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniformMatrix4fv((int)n, (boolean)bl, (FloatBuffer)floatBuffer);
    }

    public static void uniformMatrix4fv(int n, boolean bl, float[] fArray) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniformMatrix4fv((int)n, (boolean)bl, (float[])fArray);
    }

    public static int getMaxImageUnits() {
        if (GL.getCapabilities().OpenGL42 || GL.getCapabilities().GL_ARB_shader_image_load_store) {
            return GlStateManager._getInteger((int)36664);
        }
        if (GL.getCapabilities().GL_EXT_shader_image_load_store) {
            return GlStateManager._getInteger((int)36664);
        }
        return 0;
    }

    public static void bindBufferBase(int n, Integer n2, int n3) {
        RenderSystem.assertOnRenderThread();
        GL43C.glBindBufferBase((int)n, (int)n2, (int)n3);
    }

    public static void getProgramiv(int n, int n2, int[] nArray) {
        GL32C.glGetProgramiv((int)n, (int)n2, (int[])nArray);
    }

    public static void dispatchCompute(Vector3i vector3i) {
        GL45C.glDispatchCompute((int)vector3i.x, (int)vector3i.y, (int)vector3i.z);
    }

    public static void dispatchCompute(int n, int n2, int n3) {
        GL45C.glDispatchCompute((int)n, (int)n2, (int)n3);
    }

    public static void destroySampler(int n) {
        GL33C.glDeleteSamplers((int)n);
    }

    public static String getShaderInfoLog(int n) {
        RenderSystem.assertOnRenderThread();
        return GL32C.glGetShaderInfoLog((int)n);
    }

    public static void bindSamplerToUnit(int n, int n2) {
        if (samplers[n] == n2) {
            return;
        }
        GL33C.glBindSampler((int)n, (int)n2);
        IrisRenderSystem.samplers[n] = n2;
    }

    public static void blendFuncSeparatei(int n, int n2, int n3, int n4, int n5) {
        RenderSystem.assertOnRenderThread();
        ARBDrawBuffersBlend.glBlendFuncSeparateiARB((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static String getProgramInfoLog(int n) {
        RenderSystem.assertOnRenderThread();
        return GL32C.glGetProgramInfoLog((int)n);
    }

    public static void clearBufferSubData(int n, int n2, long l, long l2, int n3, int n4, int[] nArray) {
        GL43C.glClearBufferSubData((int)n, (int)n2, (long)l, (long)l2, (int)n3, (int)n4, (int[])nArray);
    }

    public static void memoryBarrier(int n) {
        RenderSystem.assertOnRenderThread();
        if (supportsCompute) {
            GL45C.glMemoryBarrier((int)n);
        }
    }

    public static void detachShader(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        GL32C.glDetachShader((int)n, (int)n2);
    }

    public static void unbindAllSamplers() {
        boolean bl = false;
        for (int i = 0; i < samplers.length; ++i) {
            if (samplers[i] == 0) continue;
            bl = true;
            if (!hasMultibind) {
                GL33C.glBindSampler((int)i, (int)0);
            }
            IrisRenderSystem.samplers[i] = 0;
        }
        if (bl && hasMultibind) {
            GL45C.glBindSamplers((int)0, (int[])emptyArray);
        }
    }

    public static void samplerParameteri(int n, int n2, int n3) {
        GL33C.glSamplerParameteri((int)n, (int)n2, (int)n3);
    }

    public static void samplerParameteriv(int n, int n2, int[] nArray) {
        GL33C.glSamplerParameteriv((int)n, (int)n2, (int[])nArray);
    }

    public static void deleteBuffers(int n) {
        RenderSystem.assertOnRenderThread();
        GL43C.glDeleteBuffers((int)n);
    }

    public static void restorePolygonMode() {
        IrisRenderSystem.setPolygonMode(backupPolygonMode);
        backupPolygonMode = 6914;
    }

    public static void copyImageSubData(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        GL46C.glCopyImageSubData((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10, (int)n11, (int)n12, (int)n13, (int)n14, (int)n15);
    }

    public static int getAttribLocation(int n, String string) {
        return GL46C.glGetAttribLocation((int)n, (CharSequence)string);
    }

    public static void getIntegerv(int n, int[] nArray) {
        RenderSystem.assertOnRenderThread();
        GL32C.glGetIntegerv((int)n, (int[])nArray);
    }

    public static void bindImageTexture(int n, int n2, int n3, boolean bl, int n4, int n5, int n6) {
        RenderSystem.assertOnRenderThread();
        if (GL.getCapabilities().OpenGL42 || GL.getCapabilities().GL_ARB_shader_image_load_store) {
            GL42C.glBindImageTexture((int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (int)n5, (int)n6);
        } else {
            EXTShaderImageLoadStore.glBindImageTextureEXT((int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (int)n5, (int)n6);
        }
    }

    public static String getActiveUniform(int n, int n2, int n3, IntBuffer intBuffer, IntBuffer intBuffer2) {
        RenderSystem.assertOnRenderThread();
        return GL32C.glGetActiveUniform((int)n, (int)n2, (int)n3, (IntBuffer)intBuffer, (IntBuffer)intBuffer2);
    }

    public static void disableBufferBlend(int n) {
        RenderSystem.assertOnRenderThread();
        GL32C.glDisablei((int)3042, (int)n);
        ((BooleanStateExtended)GlStateManagerAccessor.getBLEND().field_5045).setUnknownState();
    }

    public static void enableBufferBlend(int n) {
        RenderSystem.assertOnRenderThread();
        GL32C.glEnablei((int)3042, (int)n);
        ((BooleanStateExtended)GlStateManagerAccessor.getBLEND().field_5045).setUnknownState();
    }

    public static void vertexAttrib4f(int n, float f, float f2, float f3, float f4) {
        RenderSystem.assertOnRenderThread();
        GL32C.glVertexAttrib4f((int)n, (float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void samplerParameterf(int n, int n2, float f) {
        GL33C.glSamplerParameterf((int)n, (int)n2, (float)f);
    }

    public static void addUnswizzle(int n) {
        textureToUnswizzle.add(n);
    }

    public static void bindBuffer(int n, int n2) {
        GL46C.glBindBuffer((int)n, (int)n2);
    }

    public static void setPolygonMode(int n) {
        if (n != polygonMode) {
            polygonMode = n;
            GL43C.glPolygonMode((int)1032, (int)n);
        }
    }

    public static void restoreCullingState() {
        Boolean bl = cullingState;
        class06202.Nq().U_2 = bl;
        cullingState = true;
    }

    public static void uniform1f(int n, float f) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniform1f((int)n, (float)f);
    }

    public static boolean supportsImageLoadStore() {
        return GL.getCapabilities().glBindImageTexture != 0L || GL.getCapabilities().OpenGL42 || (GL.getCapabilities().GL_ARB_shader_image_load_store || GL.getCapabilities().GL_EXT_shader_image_load_store) && GL.getCapabilities().GL_ARB_buffer_storage;
    }

    public static boolean supportsBufferBlending() {
        return GL.getCapabilities().GL_ARB_draw_buffers_blend || GL.getCapabilities().OpenGL40;
    }

    public static boolean supportsTesselation() {
        return supportsTesselation;
    }

    public static void framebufferTexture2D(int n, int n2, int n3, int n4, int n5, int n6) {
        dsaState.framebufferTexture2D(n, n2, n3, n4, n5, n6);
    }

    public static void restorePlayerProjection() {
        RenderSystem.setProjectionMatrix((GpuBufferSlice)backupProjection, (class00312)backupProjectionType);
        backupProjection = null;
        backupProjectionType = null;
    }

    public static void overridePolygonMode() {
        backupPolygonMode = polygonMode;
        IrisRenderSystem.setPolygonMode(6914);
    }

    public static void bindTextureForSetup(int n, int n2) {
        if (n == 3553) {
            lastTex = GlStateManagerAccessor.getTEXTURES()[GlStateManagerAccessor.getActiveTexture()].field_5167;
        }
        GL30C.glBindTexture((int)n, (int)n2);
    }

    public static void setShadowProjection(Matrix4f matrix4f) {
        backupProjection = RenderSystem.getProjectionMatrixBuffer();
        backupProjectionType = RenderSystem.getProjectionType();
        RenderSystem.setProjectionMatrix((GpuBufferSlice)perspectiveProjectionMatrixBuffer.N(matrix4f), (class00312)class00312.field_54954);
    }

    public static void texParameterivDirect(int n, int n2, int[] nArray) {
        RenderSystem.assertOnRenderThread();
        GL32C.glTexParameteriv((int)n, (int)n2, (int[])nArray);
    }

    public static void dispatchComputeIndirect(long l) {
        GL43C.glDispatchComputeIndirect((long)l);
    }

    public static void uniformBlockBinding(int n, int n2, int n3) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniformBlockBinding((int)n, (int)n2, (int)n3);
    }

    public static void bindAttributeLocation(int n, int n2, CharSequence charSequence) {
        RenderSystem.assertOnRenderThread();
        GL32C.glBindAttribLocation((int)n, (int)n2, (CharSequence)charSequence);
    }

    public static int getUniformBlockIndex(int n, String string) {
        RenderSystem.assertOnRenderThread();
        return GL32C.glGetUniformBlockIndex((int)n, (CharSequence)string);
    }

    public static int checkFramebufferStatus(int n) {
        return GL46C.glCheckFramebufferStatus((int)n);
    }

    public static void bufferData(int n, float[] fArray, int n2) {
        RenderSystem.assertOnRenderThread();
        GL32C.glBufferData((int)n, (float[])fArray, (int)n2);
    }

    public static void getFloatv(int n, float[] fArray) {
        RenderSystem.assertOnRenderThread();
        GL32C.glGetFloatv((int)n, (float[])fArray);
    }

    public static void texImage1D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        RenderSystem.assertOnRenderThread();
        IrisRenderSystem.bindTextureForSetup(n2, n);
        GL30C.glTexImage1D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (ByteBuffer)byteBuffer);
    }

    public static void texImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, ByteBuffer byteBuffer) {
        RenderSystem.assertOnRenderThread();
        IrisRenderSystem.bindTextureForSetup(n2, n);
        GL32C.glTexImage2D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (ByteBuffer)byteBuffer);
    }

    public static int genSampler() {
        return GL33C.glGenSamplers();
    }

    public static void uniform4f(int n, float f, float f2, float f3, float f4) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniform4f((int)n, (float)f, (float)f2, (float)f3, (float)f4);
    }

    public static void texImage3D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ByteBuffer byteBuffer) {
        RenderSystem.assertOnRenderThread();
        IrisRenderSystem.bindTextureForSetup(n2, n);
        GL30C.glTexImage3D((int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10, (ByteBuffer)byteBuffer);
    }

    public static void clearColor(float f, float f2, float f3, float f4) {
        RenderSystem.assertOnRenderThread();
        GL46C.glClearColor((float)f, (float)f2, (float)f3, (float)f4);
    }

    public static long getVRAM() {
        if (GL.getCapabilities().GL_NVX_gpu_memory_info) {
            return (long)GL32C.glGetInteger((int)36937) * 1024L;
        }
        return 0x100000000L;
    }

    public static void uniform3f(int n, float f, float f2, float f3) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniform3f((int)n, (float)f, (float)f2, (float)f3);
    }

    public static void uniform2f(int n, float f, float f2) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniform2f((int)n, (float)f, (float)f2);
    }

    public static void uniform4i(int n, int n2, int n3, int n4, int n5) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniform4i((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static void uniform3i(int n, int n2, int n3, int n4) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniform3i((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static void readPixels(int n, int n2, int n3, int n4, int n5, int n6, float[] fArray) {
        RenderSystem.assertOnRenderThread();
        GL32C.glReadPixels((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (float[])fArray);
    }

    public static void uniform2i(int n, int n2, int n3) {
        RenderSystem.assertOnRenderThread();
        GL32C.glUniform2i((int)n, (int)n2, (int)n3);
    }

    public static void genBuffers(int[] nArray) {
        GL43C.glGenBuffers((int[])nArray);
    }

    static {
        polygonMode = 6914;
        backupPolygonMode = 6914;
        textureToUnswizzle = new IntArrayList();
        lastTex = -1;
    }
}

