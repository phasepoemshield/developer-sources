/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.jtracy.Plot
 *  com.mojang.jtracy.TracyClient
 *  minecraft.class04560
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.blending.BlendModeStorage
 *  net.irisshaders.iris.gl.blending.DepthColorStorage
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 *  net.irisshaders.iris.pbr.TextureInfoCache
 *  net.irisshaders.iris.pbr.TextureTracker
 *  net.irisshaders.iris.pbr.texture.PBRTextureManager
 *  net.irisshaders.iris.vertices.ImmediateState
 *  org.joml.Vector4i
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL13
 *  org.lwjgl.opengl.GL14
 *  org.lwjgl.opengl.GL15
 *  org.lwjgl.opengl.GL20
 *  org.lwjgl.opengl.GL20C
 *  org.lwjgl.opengl.GL30
 *  org.lwjgl.opengl.GL32
 *  org.lwjgl.opengl.GL43C
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.mojang.blaze3d.opengl;

import com.mojang.blaze3d.opengl.GlStateManager$class_1017;
import com.mojang.blaze3d.opengl.GlStateManager$class_1021;
import com.mojang.blaze3d.opengl.GlStateManager$class_1022;
import com.mojang.blaze3d.opengl.GlStateManager$class_1025;
import com.mojang.blaze3d.opengl.GlStateManager$class_1026;
import com.mojang.blaze3d.opengl.GlStateManager$class_1031;
import com.mojang.blaze3d.opengl.GlStateManager$class_1039;
import com.mojang.blaze3d.opengl.GlStateManager$class_5518;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.jtracy.Plot;
import com.mojang.jtracy.TracyClient;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.stream.IntStream;
import minecraft.class04560;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.BlendModeStorage;
import net.irisshaders.iris.gl.blending.DepthColorStorage;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;
import net.irisshaders.iris.pbr.TextureInfoCache;
import net.irisshaders.iris.pbr.TextureTracker;
import net.irisshaders.iris.pbr.texture.PBRTextureManager;
import net.irisshaders.iris.vertices.ImmediateState;
import org.joml.Vector4i;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL32;
import org.lwjgl.opengl.GL43C;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class GlStateManager
implements GlStateManagerAccessor {
    private static final Plot PLOT_TEXTURES = TracyClient.createPlot((String)"GPU Textures");
    private static int numTextures = 0;
    private static final Plot PLOT_BUFFERS = TracyClient.createPlot((String)"GPU Buffers");
    private static int numBuffers = 0;
    public static final GlStateManager$class_1017 BLEND = new GlStateManager$class_1017();
    public static final GlStateManager$class_1026 DEPTH = new GlStateManager$class_1026();
    public static final GlStateManager$class_1025 CULL = new GlStateManager$class_1025();
    private static final GlStateManager$class_1031 POLY_OFFSET = new GlStateManager$class_1031();
    private static final GlStateManager$class_1021 COLOR_LOGIC = new GlStateManager$class_1021();
    private static final GlStateManager$class_5518 SCISSOR = new GlStateManager$class_5518();
    private static int activeTexture;
    private static final int TEXTURE_COUNT = 12;
    public static final GlStateManager$class_1039[] TEXTURES;
    private static final GlStateManager$class_1022 COLOR_MASK;
    private static int readFbo;
    private static int writeFbo;
    private static int iris$program;
    private static Vector4i iris$viewport;
    private static Runnable blendFuncListener;
    private static int lastViewportX;
    private static int lastViewportY;
    private static int lastViewportWidth;
    private static int lastViewportHeight;

    public static void _glUseProgram(int n) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        GlStateManager.handler$bdh000$iris$avoidRedundantBind2(n, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.assertOnRenderThread();
        GL20.glUseProgram((int)n);
        GlStateManager.handler$bdg000$iris$resetTessellation(n, null);
    }

    public static void _bindTexture(int n) {
        RenderSystem.assertOnRenderThread();
        if (n != GlStateManager.TEXTURES[GlStateManager.activeTexture].field_5167) {
            GlStateManager.TEXTURES[GlStateManager.activeTexture].field_5167 = n;
            GL11.glBindTexture((int)3553, (int)n);
        }
    }

    public static void _activeTexture(int n) {
        GlStateManager.handler$bdh000$iris$checkActiveTexture(n, null);
        RenderSystem.assertOnRenderThread();
        if (activeTexture != n - 33984) {
            activeTexture = n - 33984;
            GL13.glActiveTexture((int)n);
        }
    }

    private static void handler$bdf000$iris$blendFuncSeparateLock(int n, int n2, int n3, int n4, CallbackInfo callbackInfo) {
        if (BlendModeStorage.isBlendLocked()) {
            BlendModeStorage.deferBlendFunc((int)n, (int)n2, (int)n3, (int)n4);
            callbackInfo.cancel();
        } else if (BlendModeStorage.isBlendUnknown()) {
            GlStateManager.BLEND.field_5049 = n;
            GlStateManager.BLEND.field_5048 = n2;
            GlStateManager.BLEND.field_5047 = n3;
            GlStateManager.BLEND.field_5046 = n4;
            GlStateManager.glBlendFuncSeparate(n, n2, n3, n4);
            callbackInfo.cancel();
        }
    }

    private static void handler$bdh000$iris$checkActiveTexture(int n, CallbackInfo callbackInfo) {
        block3: {
            int n2;
            block2: {
                n2 = n - 33984;
                if (n2 < 0) break block2;
                if (n2 <= 128) break block3;
            }
            throw new IllegalArgumentException("Texture " + n2 + " out of range");
        }
    }

    private static void handler$bdh000$iris$avoidRedundantBind2(int n, CallbackInfo callbackInfo) {
        if (iris$program == 0 && n == 0) {
            callbackInfo.cancel();
        }
        IrisRenderSystem.onProgramUse();
        iris$program = n;
    }

    private static void handler$bhd000$iris$onDeleteTexture(int n, CallbackInfo callbackInfo) {
        GlStateManager.iris$onDeleteTexture(n);
    }

    private static void handler$bdf000$iris$blendDisableLock(CallbackInfo callbackInfo) {
        if (BlendModeStorage.isBlendLocked()) {
            BlendModeStorage.deferBlendModeToggle((boolean)false);
            callbackInfo.cancel();
        }
    }

    private static void handler$bdh000$iris$avoidRedundantBind1(int n, int n2, int n3, int n4, CallbackInfo callbackInfo) {
        if (GlStateManager.iris$viewport.x == n && GlStateManager.iris$viewport.y == n2 && GlStateManager.iris$viewport.z == n3 && GlStateManager.iris$viewport.w == n4) {
            callbackInfo.cancel();
        } else {
            iris$viewport.set(n, n2, n3, n4);
        }
    }

    private static void handler$bdf000$iris$blendEnableLock(CallbackInfo callbackInfo) {
        if (BlendModeStorage.isBlendLocked()) {
            BlendModeStorage.deferBlendModeToggle((boolean)true);
            callbackInfo.cancel();
        }
    }

    private static void handler$bfc000$iris$glGetUniformLocation(int n, CharSequence charSequence, CallbackInfoReturnable callbackInfoReturnable) {
        int n2 = (Integer)callbackInfoReturnable.getReturnValue();
        if (n2 == -1 && charSequence.equals("Sampler0") && (n2 = GlStateManager._glGetUniformLocation(n, "tex")) == -1 && (n2 = GlStateManager._glGetUniformLocation(n, "gtexture")) == -1) {
            n2 = GlStateManager._glGetUniformLocation(n, "texture");
        }
        if (n2 == -1 && charSequence.equals("Sampler1")) {
            n2 = GlStateManager._glGetUniformLocation(n, "iris_overlay");
        }
        if (n2 == -1 && charSequence.equals("Sampler2")) {
            n2 = GlStateManager._glGetUniformLocation(n, "lightmap");
        }
        if ((Integer)callbackInfoReturnable.getReturnValue() == -1 && n2 != -1) {
            callbackInfoReturnable.setReturnValue((Object)n2);
        }
    }

    private static void handler$bdg000$iris$resetTessellation(int n, CallbackInfo callbackInfo) {
        ImmediateState.usingTessellation = false;
    }

    private static boolean wrapWithCondition$cmd000$sodium$skipRedundantViewport(int n, int n2, int n3, int n4) {
        if (n == lastViewportX && n2 == lastViewportY && n3 == lastViewportWidth && n4 == lastViewportHeight) {
            return false;
        }
        lastViewportX = n;
        lastViewportY = n2;
        lastViewportWidth = n3;
        lastViewportHeight = n4;
        return true;
    }

    private static int constant$bde000$iris$increaseMaximumAllowedTextureUnits(int n) {
        return 128;
    }

    public static void _glBindFramebuffer(int n, int n2) {
        if ((n == 36008 || n == 36160) && readFbo != n2) {
            GL30.glBindFramebuffer((int)36008, (int)n2);
            readFbo = n2;
        }
        if ((n == 36009 || n == 36160) && writeFbo != n2) {
            GL30.glBindFramebuffer((int)36009, (int)n2);
            writeFbo = n2;
        }
    }

    public static String _getString(int n) {
        RenderSystem.assertOnRenderThread();
        return GL11.glGetString((int)n);
    }

    public static String glGetShaderInfoLog(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetShaderInfoLog((int)n, (int)n2);
    }

    public static void clearGlErrors() {
        RenderSystem.assertOnRenderThread();
        while (GL11.glGetError() != 0) {
        }
    }

    public static long _glFenceSync(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        return GL32.glFenceSync((int)n, (int)n2);
    }

    public static void _polygonOffset(float f, float f2) {
        RenderSystem.assertOnRenderThread();
        if (f != GlStateManager.POLY_OFFSET.field_5124 || f2 != GlStateManager.POLY_OFFSET.field_5122) {
            GlStateManager.POLY_OFFSET.field_5124 = f;
            GlStateManager.POLY_OFFSET.field_5122 = f2;
            GL11.glPolygonOffset((float)f, (float)f2);
        }
    }

    public static void _texParameter(int n, int n2, int n3) {
        RenderSystem.assertOnRenderThread();
        GL11.glTexParameteri((int)n, (int)n2, (int)n3);
    }

    public static void _texSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, long l) {
        RenderSystem.assertOnRenderThread();
        GL11.glTexSubImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (long)l);
    }

    public static void _texSubImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer) {
        RenderSystem.assertOnRenderThread();
        GL11.glTexSubImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (ByteBuffer)byteBuffer);
    }

    public static int _genTexture() {
        RenderSystem.assertOnRenderThread();
        PLOT_TEXTURES.setValue((double)(++numTextures));
        return GL11.glGenTextures();
    }

    public static int _glClientWaitSync(long l, int n, long l2) {
        RenderSystem.assertOnRenderThread();
        return GL32.glClientWaitSync((long)l, (int)n, (long)l2);
    }

    public static void _drawElements(int n, int n2, int n3, long l) {
        RenderSystem.assertOnRenderThread();
        long l2 = l;
        int n4 = n3;
        int n5 = n2;
        int n6 = n;
        GlStateManager.redirect$bdg000$iris$modify(n6, n5, n4, l2);
    }

    public static void _deleteTexture(int n) {
        RenderSystem.assertOnRenderThread();
        GL11.glDeleteTextures((int)n);
        for (GlStateManager$class_1039 glStateManager$class_1039 : TEXTURES) {
            if (glStateManager$class_1039.field_5167 != n) continue;
            glStateManager$class_1039.field_5167 = -1;
        }
        PLOT_TEXTURES.setValue((double)(--numTextures));
        GlStateManager.handler$bhd000$iris$onDeleteTexture(n, null);
    }

    public static void _drawArrays(int n, int n2, int n3) {
        RenderSystem.assertOnRenderThread();
        GL11.glDrawArrays((int)n, (int)n2, (int)n3);
    }

    public static void _enableCull() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.CULL.field_5072.method_4471();
    }

    public static void _pixelStore(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        GL11.glPixelStorei((int)n, (int)n2);
    }

    public static void _readPixels(int n, int n2, int n3, int n4, int n5, int n6, long l) {
        RenderSystem.assertOnRenderThread();
        GL11.glReadPixels((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (long)l);
    }

    public static void _glDeleteSync(long l) {
        RenderSystem.assertOnRenderThread();
        GL32.glDeleteSync((long)l);
    }

    public static void _polygonMode(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        GL11.glPolygonMode((int)n, (int)n2);
    }

    public static void _disableCull() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.CULL.field_5072.method_4469();
    }

    public static void _texImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, @Nullable ByteBuffer byteBuffer) {
        RenderSystem.assertOnRenderThread();
        GL11.glTexImage2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (ByteBuffer)byteBuffer);
        GlStateManager.handler$bhd000$iris$onTexImage2D(n, n2, n3, n4, n5, n6, n7, n8, byteBuffer, null);
    }

    public static void _enableDepthTest() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.DEPTH.field_5074.method_4471();
    }

    public static int _glGenBuffers() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.incrementTrackedBuffers();
        return GL15.glGenBuffers();
    }

    public static void _glBindBuffer(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        GL15.glBindBuffer((int)n, (int)n2);
    }

    public static void _glDeleteBuffers(int n) {
        RenderSystem.assertOnRenderThread();
        PLOT_BUFFERS.setValue((double)(--numBuffers));
        GL15.glDeleteBuffers((int)n);
    }

    public static int getFrameBuffer(int n) {
        if (n == 36008) {
            return readFbo;
        }
        if (n == 36009) {
            return writeFbo;
        }
        return 0;
    }

    public static void _glBlitFrameBuffer(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        RenderSystem.assertOnRenderThread();
        GL30.glBlitFramebuffer((int)n, (int)n2, (int)n3, (int)n4, (int)n5, (int)n6, (int)n7, (int)n8, (int)n9, (int)n10);
    }

    public static void _glUnmapBuffer(int n) {
        RenderSystem.assertOnRenderThread();
        GL15.glUnmapBuffer((int)n);
    }

    public static void _blendFuncSeparate(int n, int n2, int n3, int n4) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        GlStateManager.handler$bdf000$iris$blendFuncSeparateLock(n, n2, n3, n4, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.assertOnRenderThread();
        if (n != GlStateManager.BLEND.field_5049 || n2 != GlStateManager.BLEND.field_5048 || n3 != GlStateManager.BLEND.field_5047 || n4 != GlStateManager.BLEND.field_5046) {
            GlStateManager.BLEND.field_5049 = n;
            GlStateManager.BLEND.field_5048 = n2;
            GlStateManager.BLEND.field_5047 = n3;
            GlStateManager.BLEND.field_5046 = n4;
            GlStateManager.glBlendFuncSeparate(n, n2, n3, n4);
        }
        GlStateManager.handler$bha000$iris$onBlendFunc(n, n2, n3, n4, null);
    }

    public static void _glBufferData(int n, long l, int n2) {
        RenderSystem.assertOnRenderThread();
        GL15.glBufferData((int)n, (long)l, (int)n2);
    }

    public static void _glBufferData(int n, ByteBuffer byteBuffer, int n2) {
        RenderSystem.assertOnRenderThread();
        GL15.glBufferData((int)n, (ByteBuffer)byteBuffer, (int)n2);
    }

    public static @Nullable ByteBuffer _glMapBufferRange(int n, long l, long l2, int n2) {
        RenderSystem.assertOnRenderThread();
        return GL30.glMapBufferRange((int)n, (long)l, (long)l2, (int)n2);
    }

    public static void _glUniform1i(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        GL20.glUniform1i((int)n, (int)n2);
    }

    public static void glAttachShader(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        GL20.glAttachShader((int)n, (int)n2);
    }

    public static void _enableScissorTest() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.SCISSOR.field_26840.method_4471();
    }

    public static int glCreateShader(int n) {
        RenderSystem.assertOnRenderThread();
        return GL20.glCreateShader((int)n);
    }

    public static void glCompileShader(int n) {
        RenderSystem.assertOnRenderThread();
        GL20.glCompileShader((int)n);
    }

    public static void glDeleteProgram(int n) {
        RenderSystem.assertOnRenderThread();
        GL20.glDeleteProgram((int)n);
    }

    public static int _glGenVertexArrays() {
        RenderSystem.assertOnRenderThread();
        return GL30.glGenVertexArrays();
    }

    public static void _glBindVertexArray(int n) {
        RenderSystem.assertOnRenderThread();
        GL30.glBindVertexArray((int)n);
    }

    public static void _glBufferSubData(int n, long l, ByteBuffer byteBuffer) {
        RenderSystem.assertOnRenderThread();
        GL15.glBufferSubData((int)n, (long)l, (ByteBuffer)byteBuffer);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void glShaderSource(int n, String string) {
        RenderSystem.assertOnRenderThread();
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(byArray.length + 1));
        byteBuffer.put(byArray);
        byteBuffer.put((byte)0);
        byteBuffer.flip();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            pointerBuffer.put(byteBuffer);
            GL20C.nglShaderSource((int)n, (int)1, (long)pointerBuffer.address0(), (long)0L);
        }
        finally {
            MemoryUtil.memFree((Buffer)byteBuffer);
        }
    }

    public static int glCreateProgram() {
        RenderSystem.assertOnRenderThread();
        return GL20.glCreateProgram();
    }

    public static void glLinkProgram(int n) {
        RenderSystem.assertOnRenderThread();
        GL20.glLinkProgram((int)n);
    }

    public static void _scissorBox(int n, int n2, int n3, int n4) {
        RenderSystem.assertOnRenderThread();
        GL20.glScissor((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static int glGetProgrami(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetProgrami((int)n, (int)n2);
    }

    public static void _disableDepthTest() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.DEPTH.field_5074.method_4469();
    }

    public static void _disableBlend() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        GlStateManager.handler$bdf000$iris$blendDisableLock(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.assertOnRenderThread();
        GlStateManager.BLEND.field_5045.method_4469();
    }

    public static void _enableBlend() {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        GlStateManager.handler$bdf000$iris$blendEnableLock(callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.assertOnRenderThread();
        GlStateManager.BLEND.field_5045.method_4471();
    }

    public static void glDeleteShader(int n) {
        RenderSystem.assertOnRenderThread();
        GL20.glDeleteShader((int)n);
    }

    public static int glGetShaderi(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetShaderi((int)n, (int)n2);
    }

    private static void handler$bdg000$iris$depthMaskLock(boolean bl, CallbackInfo callbackInfo) {
        if (DepthColorStorage.isDepthColorLocked()) {
            DepthColorStorage.deferDepthEnable((boolean)bl);
            callbackInfo.cancel();
        }
    }

    private static void handler$bhd000$iris$onTexImage2D(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, ByteBuffer byteBuffer, CallbackInfo callbackInfo) {
        TextureInfoCache.INSTANCE.onTexImage2D(n, n2, n3, n4, n5, n6, n7, n8, byteBuffer);
    }

    private static void redirect$bdg000$iris$modify(int n, int n2, int n3, long l) {
        if (n == 4 && ImmediateState.usingTessellation) {
            n = 14;
        }
        GL43C.glDrawElements((int)n, (int)n2, (int)n3, (long)l);
    }

    public static /* synthetic */ GlStateManager$class_1039[] getTEXTURES$iris_$md$d1eeb7$4() {
        return TEXTURES;
    }

    public static /* synthetic */ int getActiveTexture$iris_$md$d1eeb7$3() {
        return activeTexture;
    }

    private static void handler$bdg000$iris$colorMaskLock(boolean bl, boolean bl2, boolean bl3, boolean bl4, CallbackInfo callbackInfo) {
        if (DepthColorStorage.isDepthColorLocked()) {
            DepthColorStorage.deferColorMask((boolean)bl, (boolean)bl2, (boolean)bl3, (boolean)bl4);
            callbackInfo.cancel();
        }
    }

    public static /* synthetic */ GlStateManager$class_1022 getCOLOR_MASK$iris_$md$d1eeb7$1() {
        return COLOR_MASK;
    }

    private static /* synthetic */ void mdd1eeb7$iris$lambda$static$0$0(Runnable runnable) {
        blendFuncListener = runnable;
    }

    private static void handler$bha000$iris$onBlendFunc(int n, int n2, int n3, int n4, CallbackInfo callbackInfo) {
        if (blendFuncListener != null) {
            blendFuncListener.run();
        }
    }

    public static int _getInteger(int n) {
        RenderSystem.assertOnRenderThread();
        return GL11.glGetInteger((int)n);
    }

    public static void _vertexAttribIPointer(int n, int n2, int n3, int n4, long l) {
        RenderSystem.assertOnRenderThread();
        GL30.glVertexAttribIPointer((int)n, (int)n2, (int)n3, (int)n4, (long)l);
    }

    public static void glBlendFuncSeparate(int n, int n2, int n3, int n4) {
        RenderSystem.assertOnRenderThread();
        GL14.glBlendFuncSeparate((int)n, (int)n2, (int)n3, (int)n4);
    }

    public static void incrementTrackedBuffers() {
        PLOT_BUFFERS.setValue((double)(++numBuffers));
    }

    public static void _enablePolygonOffset() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.POLY_OFFSET.field_5123.method_4471();
    }

    public static int _glGetUniformLocation(int n, CharSequence charSequence) {
        RenderSystem.assertOnRenderThread();
        int n2 = GL20.glGetUniformLocation((int)n, (CharSequence)charSequence);
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true, n2);
        GlStateManager.handler$bfc000$iris$glGetUniformLocation(n, charSequence, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return n2;
    }

    public static void _glDeleteFramebuffers(int n) {
        RenderSystem.assertOnRenderThread();
        GL30.glDeleteFramebuffers((int)n);
        if (readFbo == n) {
            readFbo = 0;
        }
        if (writeFbo == n) {
            writeFbo = 0;
        }
    }

    public static String glGetProgramInfoLog(int n, int n2) {
        RenderSystem.assertOnRenderThread();
        return GL20.glGetProgramInfoLog((int)n, (int)n2);
    }

    public static void _vertexAttribPointer(int n, int n2, int n3, boolean bl, int n4, long l) {
        RenderSystem.assertOnRenderThread();
        GL20.glVertexAttribPointer((int)n, (int)n2, (int)n3, (boolean)bl, (int)n4, (long)l);
    }

    public static void _disableColorLogicOp() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.COLOR_LOGIC.field_5058.method_4469();
    }

    public static void _glFramebufferTexture2D(int n, int n2, int n3, int n4, int n5) {
        RenderSystem.assertOnRenderThread();
        GL30.glFramebufferTexture2D((int)n, (int)n2, (int)n3, (int)n4, (int)n5);
    }

    public static void _enableColorLogicOp() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.COLOR_LOGIC.field_5058.method_4471();
    }

    public static void _disableScissorTest() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.SCISSOR.field_26840.method_4469();
    }

    public static void _disablePolygonOffset() {
        RenderSystem.assertOnRenderThread();
        GlStateManager.POLY_OFFSET.field_5123.method_4469();
    }

    public static int _getTexLevelParameter(int n, int n2, int n3) {
        return GL11.glGetTexLevelParameteri((int)n, (int)n2, (int)n3);
    }

    public static void _enableVertexAttribArray(int n) {
        RenderSystem.assertOnRenderThread();
        GL20.glEnableVertexAttribArray((int)n);
    }

    private static void iris$onDeleteTexture(int n) {
        TextureTracker.INSTANCE.onDeleteTexture(n);
        TextureInfoCache.INSTANCE.onDeleteTexture(n);
        PBRTextureManager.INSTANCE.onDeleteTexture(n);
    }

    public static /* synthetic */ GlStateManager$class_1026 getDEPTH$iris_$md$d1eeb7$2() {
        return DEPTH;
    }

    public static /* synthetic */ GlStateManager$class_1017 getBLEND$iris_$md$d1eeb7$0() {
        return BLEND;
    }

    public static int glGenFramebuffers() {
        RenderSystem.assertOnRenderThread();
        return GL30.glGenFramebuffers();
    }

    public static void _clear(int n) {
        RenderSystem.assertOnRenderThread();
        GL11.glClear((int)n);
        if (class04560.N) {
            GlStateManager._getError();
        }
    }

    public static void _depthMask(boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        GlStateManager.handler$bdg000$iris$depthMaskLock(bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.assertOnRenderThread();
        if (bl != GlStateManager.DEPTH.field_5076) {
            GlStateManager.DEPTH.field_5076 = bl;
            GL11.glDepthMask((boolean)bl);
        }
    }

    public static int _getError() {
        RenderSystem.assertOnRenderThread();
        return GL11.glGetError();
    }

    public static void _depthFunc(int n) {
        RenderSystem.assertOnRenderThread();
        if (n != GlStateManager.DEPTH.field_5075) {
            GlStateManager.DEPTH.field_5075 = n;
            GL11.glDepthFunc((int)n);
        }
    }

    public static void _viewport(int n, int n2, int n3, int n4) {
        block1: {
            CallbackInfo callbackInfo = new CallbackInfo("", true);
            GlStateManager.handler$bdh000$iris$avoidRedundantBind1(n, n2, n3, n4, callbackInfo);
            if (callbackInfo.isCancelled()) {
                return;
            }
            int n5 = n;
            int n6 = n2;
            int n7 = n3;
            int n8 = n4;
            if (!GlStateManager.wrapWithCondition$cmd000$sodium$skipRedundantViewport(n5, n6, n7, n8)) break block1;
            GL11.glViewport((int)n5, (int)n6, (int)n7, (int)n8);
        }
    }

    public static void _colorMask(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        GlStateManager.handler$bdg000$iris$colorMaskLock(bl, bl2, bl3, bl4, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        RenderSystem.assertOnRenderThread();
        if (bl != GlStateManager.COLOR_MASK.field_5063 || bl2 != GlStateManager.COLOR_MASK.field_5062 || bl3 != GlStateManager.COLOR_MASK.field_5061 || bl4 != GlStateManager.COLOR_MASK.field_5060) {
            GlStateManager.COLOR_MASK.field_5063 = bl;
            GlStateManager.COLOR_MASK.field_5062 = bl2;
            GlStateManager.COLOR_MASK.field_5061 = bl3;
            GlStateManager.COLOR_MASK.field_5060 = bl4;
            GL11.glColorMask((boolean)bl, (boolean)bl2, (boolean)bl3, (boolean)bl4);
        }
    }

    public static void _logicOp(int n) {
        RenderSystem.assertOnRenderThread();
        if (n != GlStateManager.COLOR_LOGIC.field_5059) {
            GlStateManager.COLOR_LOGIC.field_5059 = n;
            GL11.glLogicOp((int)n);
        }
    }

    public static void _glBindAttribLocation(int n, int n2, CharSequence charSequence) {
        RenderSystem.assertOnRenderThread();
        GL20.glBindAttribLocation((int)n, (int)n2, (CharSequence)charSequence);
    }

    static {
        TEXTURES = (GlStateManager$class_1039[])IntStream.range(0, 12).mapToObj(n -> new GlStateManager$class_1039()).toArray(GlStateManager$class_1039[]::new);
        COLOR_MASK = new GlStateManager$class_1022();
        iris$viewport = new Vector4i();
    }
}

