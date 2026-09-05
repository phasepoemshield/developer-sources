/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  com.mojang.blaze3d.buffers.Std140SizeCalculator
 *  com.mojang.blaze3d.platform.GLX
 *  com.mojang.blaze3d.systems.GpuDevice
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem$1
 *  com.mojang.blaze3d.systems.RenderSystem$class_10827
 *  com.mojang.logging.LogUtils
 *  minecraft.class00049
 *  minecraft.class00312
 *  minecraft.class03063
 *  minecraft.class03393
 *  minecraft.class04189
 *  minecraft.class06202
 *  minecraft.class07533
 *  minecraft.class07536
 *  minecraft.class07607
 *  minecraft.class07849
 *  minecraft.class08178
 *  minecraft.class08681
 *  minecraft.class08712
 *  minecraft.class08844
 *  minecraft.class08879
 *  net.caffeinemc.mods.sodium.client.compatibility.checks.ModuleScanner
 *  net.caffeinemc.mods.sodium.client.compatibility.checks.PostLaunchChecks
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.GlContextInfo
 *  net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.samplers.IrisSamplers
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.glfw.GLFWNativeWin32
 *  org.lwjgl.opengl.WGL
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.mojang.blaze3d.systems;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem$class_5590;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat$class_5596;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.IntConsumer;
import minecraft.class00049;
import minecraft.class00312;
import minecraft.class03063;
import minecraft.class03393;
import minecraft.class04189;
import minecraft.class06202;
import minecraft.class07533;
import minecraft.class07536;
import minecraft.class07607;
import minecraft.class07849;
import minecraft.class08178;
import minecraft.class08681;
import minecraft.class08712;
import minecraft.class08844;
import minecraft.class08879;
import net.caffeinemc.mods.sodium.client.compatibility.checks.ModuleScanner;
import net.caffeinemc.mods.sodium.client.compatibility.checks.PostLaunchChecks;
import net.caffeinemc.mods.sodium.client.compatibility.environment.GlContextInfo;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.samplers.IrisSamplers;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.jspecify.annotations.Nullable;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWNativeWin32;
import org.lwjgl.opengl.WGL;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class RenderSystem {
    static Logger LOGGER = LogUtils.getLogger();
    public static final int MINIMUM_ATLAS_TEXTURE_SIZE = 1024;
    public static final int PROJECTION_MATRIX_UBO_SIZE = new Std140SizeCalculator().putMat4f().get();
    private static @Nullable Thread renderThread;
    private static @Nullable GpuDevice DEVICE;
    private static double lastDrawTime;
    private static final RenderSystem$class_5590 sharedSequential;
    private static final RenderSystem$class_5590 sharedSequentialQuad;
    private static final RenderSystem$class_5590 sharedSequentialLines;
    private static class00312 projectionType;
    private static class00312 savedProjectionType;
    private static final Matrix4fStack modelViewStack;
    private static @Nullable GpuBufferSlice shaderFog;
    private static @Nullable GpuBufferSlice shaderLightDirections;
    private static @Nullable GpuBufferSlice projectionMatrixBuffer;
    private static @Nullable GpuBufferSlice savedProjectionMatrixBuffer;
    private static String apiDescription;
    private static final AtomicLong pollEventsWaitStart;
    private static final AtomicBoolean pollingEvents;
    private static final class04189<class_10827> PENDING_FENCES;
    public static @Nullable GpuTextureView outputColorTextureOverride;
    public static @Nullable GpuTextureView outputDepthTextureOverride;
    private static @Nullable GpuBuffer globalSettingsUniform;
    private static @Nullable class00049 dynamicUniforms;
    private static final class08681 scissorStateForRenderTypeDraws;
    private static class08178 samplerCache;
    private static Runnable fogStartListener;
    private static Runnable fogEndListener;
    private static long wglPrevContext;

    public static String getApiDescription() {
        return apiDescription;
    }

    public static void flipFrame(class08844 class088442, @Nullable class08712 class087122) {
        RenderSystem.redirect$cna000$sodium$removeFirstPoll();
        class07849.y().L();
        GLFW.glfwSwapBuffers((long)class088442.B());
        if (class087122 != null) {
            class087122.y();
        }
        dynamicUniforms.N();
        ((class03063)class06202.Nq().B_2).z();
        RenderSystem.pollEvents();
        RenderSystem.handler$cmo000$sodium$preSwapBuffers(class088442, class087122, null);
    }

    private static void pollEvents() {
        pollEventsWaitStart.set(class07536.L());
        pollingEvents.set(true);
        GLFW.glfwPollEvents();
        pollingEvents.set(false);
    }

    public static class03393 initBackendSystem() {
        return GLX._initGlfw()::getAsLong;
    }

    public static boolean isOnRenderThread() {
        return Thread.currentThread() == renderThread;
    }

    public static void initRenderer(long l, int n, boolean bl, class07607 class076072, boolean bl2) {
        DEVICE = new class08879(l, n, bl, class076072, bl2);
        apiDescription = RenderSystem.getDevice().getImplementationInformation();
        dynamicUniforms = new class00049();
        samplerCache.N();
        RenderSystem.handler$bei000$iris$onRendererInit(l, n, bl, class076072, bl2, null);
        RenderSystem.handler$cmo000$sodium$postContextReady(l, n, bl, class076072, bl2, null);
    }

    public static void setErrorCallback(GLFWErrorCallbackI gLFWErrorCallbackI) {
        GLX._setGlfwErrorCallback((GLFWErrorCallbackI)gLFWErrorCallbackI);
    }

    public static @Nullable GpuBufferSlice getShaderLights() {
        return shaderLightDirections;
    }

    public static @Nullable GpuBufferSlice getShaderFog() {
        return shaderFog;
    }

    public static void limitDisplayFPS(int n) {
        double d = lastDrawTime + 1.0 / (double)n;
        double d2 = GLFW.glfwGetTime();
        while (d2 < d) {
            GLFW.glfwWaitEventsTimeout((double)(d - d2));
            d2 = GLFW.glfwGetTime();
        }
        lastDrawTime = d2;
    }

    public static void setShaderFog(GpuBufferSlice gpuBufferSlice) {
        RenderSystem.handler$bhb000$iris$onFogStart(gpuBufferSlice, null);
        shaderFog = gpuBufferSlice;
    }

    public static void setShaderLights(GpuBufferSlice gpuBufferSlice) {
        shaderLightDirections = gpuBufferSlice;
    }

    public static void setupDefaultState() {
        modelViewStack.clear();
    }

    public static void queueFencedTask(Runnable runnable) {
        PENDING_FENCES.addLast((Object)new class_10827(runnable, RenderSystem.getDevice().createCommandEncoder().createFence()));
    }

    public static @Nullable GpuDevice tryGetDevice() {
        return DEVICE;
    }

    public static class00049 getDynamicUniforms() {
        if (dynamicUniforms == null) {
            throw new IllegalStateException("Can't getDynamicUniforms() before device was initialized");
        }
        return dynamicUniforms;
    }

    public static Matrix4f getModelViewMatrix() {
        RenderSystem.assertOnRenderThread();
        return modelViewStack;
    }

    public static class08178 getSamplerCache() {
        return samplerCache;
    }

    public static Matrix4fStack getModelViewStack() {
        RenderSystem.assertOnRenderThread();
        return modelViewStack;
    }

    public static class00312 getProjectionType() {
        RenderSystem.assertOnRenderThread();
        return projectionType;
    }

    private static IllegalStateException constructThreadException() {
        return new IllegalStateException("Rendersystem called from wrong thread");
    }

    public static void setGlobalSettingsUniform(GpuBuffer gpuBuffer) {
        globalSettingsUniform = gpuBuffer;
    }

    public static @Nullable GpuBufferSlice getProjectionMatrixBuffer() {
        RenderSystem.assertOnRenderThread();
        return projectionMatrixBuffer;
    }

    public static void backupProjectionMatrix() {
        RenderSystem.assertOnRenderThread();
        savedProjectionMatrixBuffer = projectionMatrixBuffer;
        savedProjectionType = projectionType;
    }

    public static boolean isFrozenAtPollEvents() {
        return pollingEvents.get() && class07536.L() - pollEventsWaitStart.get() > 200L;
    }

    public static void executePendingTasks() {
        class_10827 class_108272 = (class_10827)PENDING_FENCES.peekFirst();
        while (class_108272 != null) {
            if (class_108272.comp_3786.awaitCompletion(0L)) {
                try {
                    class_108272.comp_3785.run();
                }
                finally {
                    class_108272.comp_3786.close();
                }
                PENDING_FENCES.removeFirst();
                class_108272 = (class_10827)PENDING_FENCES.peekFirst();
                continue;
            }
            return;
        }
    }

    public static void setProjectionMatrix(GpuBufferSlice gpuBufferSlice, class00312 class003122) {
        RenderSystem.assertOnRenderThread();
        projectionMatrixBuffer = gpuBufferSlice;
        projectionType = class003122;
    }

    public static @Nullable GpuBuffer getGlobalSettingsUniform() {
        return globalSettingsUniform;
    }

    public static void restoreProjectionMatrix() {
        RenderSystem.assertOnRenderThread();
        projectionMatrixBuffer = savedProjectionMatrixBuffer;
        projectionType = savedProjectionType;
    }

    public static class08681 getScissorStateForRenderTypeDraws() {
        return scissorStateForRenderTypeDraws;
    }

    public static void initRenderThread() {
        if (renderThread != null) {
            throw new IllegalStateException("Could not initialize render thread");
        }
        renderThread = Thread.currentThread();
    }

    public static GpuDevice getDevice() {
        if (DEVICE == null) {
            throw new IllegalStateException("Can't getDevice() before it was initialized");
        }
        return DEVICE;
    }

    public static String getBackendDescription() {
        return String.format(Locale.ROOT, "LWJGL version %s", GLX._getLWJGLVersion());
    }

    private static /* synthetic */ void mdd1eeb7$iris$lambda$static$1$0(Runnable runnable) {
        fogEndListener = runnable;
    }

    public static void enableScissorForRenderTypeDraws(int n, int n2, int n3, int n4) {
        scissorStateForRenderTypeDraws.N(n, n2, n3, n4);
    }

    public static void disableScissorForRenderTypeDraws() {
        scissorStateForRenderTypeDraws.N();
    }

    private static void handler$bhb000$iris$onFogStart(GpuBufferSlice gpuBufferSlice, CallbackInfo callbackInfo) {
        if (fogStartListener != null) {
            fogStartListener.run();
        }
        if (fogEndListener != null) {
            fogEndListener.run();
        }
    }

    private static void handler$bei000$iris$onRendererInit(long l, int n, boolean bl, class07607 class076072, boolean bl2, CallbackInfo callbackInfo) {
        Iris.duringRenderSystemInit();
        GLDebug.reloadDebugState();
        IrisRenderSystem.initRenderer();
        IrisSamplers.initRenderer();
        Iris.onRenderSystemInit();
    }

    private static /* synthetic */ void mdd1eeb7$iris$lambda$static$0$1(Runnable runnable) {
        fogStartListener = runnable;
    }

    public static void assertOnRenderThread() {
        if (!RenderSystem.isOnRenderThread()) {
            throw RenderSystem.constructThreadException();
        }
    }

    public static RenderSystem$class_5590 getSequentialBuffer(VertexFormat$class_5596 vertexFormat$class_5596) {
        RenderSystem.assertOnRenderThread();
        return switch (1.field_38976[vertexFormat$class_5596.ordinal()]) {
            case 1 -> sharedSequentialQuad;
            case 2 -> sharedSequentialLines;
            default -> sharedSequential;
        };
    }

    public static void bindDefaultUniforms(RenderPass renderPass) {
        GpuBufferSlice gpuBufferSlice;
        GpuBuffer gpuBuffer;
        GpuBufferSlice gpuBufferSlice2;
        GpuBufferSlice gpuBufferSlice3 = RenderSystem.getProjectionMatrixBuffer();
        if (gpuBufferSlice3 != null) {
            renderPass.setUniform("Projection", gpuBufferSlice3);
        }
        if ((gpuBufferSlice2 = RenderSystem.getShaderFog()) != null) {
            renderPass.setUniform("Fog", gpuBufferSlice2);
        }
        if ((gpuBuffer = RenderSystem.getGlobalSettingsUniform()) != null) {
            renderPass.setUniform("Globals", gpuBuffer);
        }
        if ((gpuBufferSlice = RenderSystem.getShaderLights()) != null) {
            renderPass.setUniform("Lighting", gpuBufferSlice);
        }
    }

    private static void handler$cmo000$sodium$postContextReady(long l, int n, boolean bl, class07607 class076072, boolean bl2, CallbackInfo callbackInfo) {
        GlContextInfo glContextInfo = GlContextInfo.create();
        LOGGER.info("OpenGL Vendor: {}", (Object)glContextInfo.vendor());
        LOGGER.info("OpenGL Renderer: {}", (Object)glContextInfo.renderer());
        LOGGER.info("OpenGL Version: {}", (Object)glContextInfo.version());
        wglPrevContext = class07536.m() == class07533.field_1133 ? WGL.wglGetCurrentContext() : 0L;
        NativeWindowHandle nativeWindowHandle = () -> GLFWNativeWin32.glfwGetWin32Window((long)l);
        PostLaunchChecks.onContextInitialized((NativeWindowHandle)nativeWindowHandle, (GlContextInfo)glContextInfo);
        ModuleScanner.checkModules((NativeWindowHandle)nativeWindowHandle);
    }

    private static void redirect$cna000$sodium$removeFirstPoll() {
    }

    private static void handler$cmo000$sodium$preSwapBuffers(class08844 class088442, class08712 class087122, CallbackInfo callbackInfo) {
        if (wglPrevContext == 0L) {
            return;
        }
        long l = WGL.wglGetCurrentContext();
        if (wglPrevContext == l) {
            return;
        }
        LOGGER.warn("The OpenGL context appears to have been suddenly replaced! Something has likely just injected into the game process.");
        ModuleScanner.checkModules(() -> GLFWNativeWin32.glfwGetWin32Window((long)class088442.B()));
        wglPrevContext = l;
    }

    static {
        lastDrawTime = Double.MIN_VALUE;
        sharedSequential = new RenderSystem$class_5590(1, 1, IntConsumer::accept);
        sharedSequentialQuad = new RenderSystem$class_5590(4, 6, (intConsumer, n) -> {
            intConsumer.accept(n);
            intConsumer.accept(n + 1);
            intConsumer.accept(n + 2);
            intConsumer.accept(n + 2);
            intConsumer.accept(n + 3);
            intConsumer.accept(n);
        });
        sharedSequentialLines = new RenderSystem$class_5590(4, 6, (intConsumer, n) -> {
            intConsumer.accept(n);
            intConsumer.accept(n + 1);
            intConsumer.accept(n + 2);
            intConsumer.accept(n + 3);
            intConsumer.accept(n + 2);
            intConsumer.accept(n + 1);
        });
        projectionType = class00312.field_54953;
        savedProjectionType = class00312.field_54953;
        modelViewStack = new Matrix4fStack(16);
        shaderFog = null;
        apiDescription = "Unknown";
        pollEventsWaitStart = new AtomicLong();
        pollingEvents = new AtomicBoolean(false);
        PENDING_FENCES = new class04189();
        scissorStateForRenderTypeDraws = new class08681();
        samplerCache = new class08178();
    }
}

