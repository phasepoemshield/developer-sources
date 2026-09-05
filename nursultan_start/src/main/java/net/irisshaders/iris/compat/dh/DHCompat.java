/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05630
 *  minecraft.class06202
 *  net.irisshaders.iris.pipeline.IrisRenderingPipeline
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.joml.Matrix4f
 */
package net.irisshaders.iris.compat.dh;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.InvocationTargetException;
import minecraft.class05630;
import minecraft.class06202;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.shader.ShaderCompileException;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Matrix4f;

public class DHCompat {
    private static boolean dhPresent = true;
    private static boolean lastIncompatible;
    private static MethodHandle deletePipeline;
    private static MethodHandle incompatible;
    private static MethodHandle getDepthTex;
    private static MethodHandle getFarPlane;
    private static MethodHandle getNearPlane;
    private static MethodHandle getDepthTexNoTranslucent;
    private static MethodHandle checkFrame;
    private static MethodHandle getRenderDistance;
    private Object compatInternalInstance;

    public void clearPipeline() {
        if (this.compatInternalInstance == null) {
            return;
        }
        try {
            deletePipeline.invoke(this.compatInternalInstance);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static float getFarPlane() {
        if (!dhPresent) {
            return 0.01f;
        }
        try {
            return getFarPlane.invoke();
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static int getRenderDistance() {
        if (!dhPresent) {
            return ((class05630)class06202.Nq().i_7).Nh();
        }
        try {
            return getRenderDistance.invoke();
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static Matrix4f getProjection() {
        if (!dhPresent) {
            return new Matrix4f(CapturedRenderingState.INSTANCE.getGbufferProjection());
        }
        Matrix4f matrix4f = new Matrix4f(CapturedRenderingState.INSTANCE.getGbufferProjection());
        return new Matrix4f().setPerspective(matrix4f.perspectiveFov(), matrix4f.m11() / matrix4f.m00(), DHCompat.getNearPlane(), DHCompat.getFarPlane());
    }

    public int getDepthTex() {
        if (this.compatInternalInstance == null) {
            return 0;
        }
        try {
            return getDepthTex.invoke(this.compatInternalInstance);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static float getNearPlane() {
        if (!dhPresent) {
            return 0.01f;
        }
        try {
            return getNearPlane.invoke();
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public DHCompat(IrisRenderingPipeline irisRenderingPipeline, boolean bl) {
        try {
            if (dhPresent) {
                this.compatInternalInstance = Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal").getDeclaredConstructor(irisRenderingPipeline.getClass(), Boolean.TYPE).newInstance(irisRenderingPipeline, bl);
                lastIncompatible = incompatible.invoke(this.compatInternalInstance);
            }
        }
        catch (Throwable throwable) {
            lastIncompatible = false;
            Throwable throwable2 = throwable.getCause();
            if (throwable2 instanceof ShaderCompileException) {
                ShaderCompileException shaderCompileException = (ShaderCompileException)throwable2;
                throw shaderCompileException;
            }
            if (throwable instanceof InvocationTargetException) {
                InvocationTargetException invocationTargetException = (InvocationTargetException)throwable;
                throw new RuntimeException("Unknown error loading Distant Horizons compatibility.", invocationTargetException.getCause());
            }
            throw new RuntimeException("Unknown error loading Distant Horizons compatibility.", throwable);
        }
    }

    public static void run() {
        try {
            if (IrisPlatformHelpers.getInstance().isModLoaded("distanthorizons")) {
                deletePipeline = MethodHandles.lookup().findVirtual(Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal"), "clear", MethodType.methodType(Void.TYPE));
                MethodHandle methodHandle = MethodHandles.lookup().findStatic(Class.forName("net.irisshaders.iris.compat.dh.LodRendererEvents"), "setupEventHandlers", MethodType.methodType(Void.TYPE));
                getDepthTex = MethodHandles.lookup().findVirtual(Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal"), "getStoredDepthTex", MethodType.methodType(Integer.TYPE));
                getRenderDistance = MethodHandles.lookup().findStatic(Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal"), "getRenderDistance", MethodType.methodType(Integer.TYPE));
                incompatible = MethodHandles.lookup().findVirtual(Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal"), "incompatiblePack", MethodType.methodType(Boolean.TYPE));
                getFarPlane = MethodHandles.lookup().findStatic(Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal"), "getFarPlane", MethodType.methodType(Float.TYPE));
                getNearPlane = MethodHandles.lookup().findStatic(Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal"), "getNearPlane", MethodType.methodType(Float.TYPE));
                getDepthTexNoTranslucent = MethodHandles.lookup().findVirtual(Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal"), "getDepthTexNoTranslucent", MethodType.methodType(Integer.TYPE));
                checkFrame = MethodHandles.lookup().findStatic(Class.forName("net.irisshaders.iris.compat.dh.DHCompatInternal"), "checkFrame", MethodType.methodType(Boolean.TYPE));
                methodHandle.invoke();
            } else {
                dhPresent = false;
            }
        }
        catch (Throwable throwable) {
            dhPresent = false;
            if (IrisPlatformHelpers.getInstance().isModLoaded("distanthorizons")) {
                if (throwable instanceof ExceptionInInitializerError) {
                    ExceptionInInitializerError exceptionInInitializerError = (ExceptionInInitializerError)throwable;
                    throw new RuntimeException("Failure loading DH compat.", exceptionInInitializerError.getCause());
                }
                throw new RuntimeException("DH found, but one or more API methods are missing. Iris requires DH [2.0.4] or DH API version [1.1.0] or newer. Please make sure you are on the latest version of DH and Iris.", throwable);
            }
            Iris.logger.info("DH not found, and classes not found.");
        }
    }

    public Object getInstance() {
        return this.compatInternalInstance;
    }

    public static boolean checkFrame() {
        if (!dhPresent) {
            return false;
        }
        try {
            return checkFrame.invoke();
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static boolean lastPackIncompatible() {
        return dhPresent && DHCompat.hasRenderingEnabled() && lastIncompatible;
    }

    public int getDepthTexNoTranslucent() {
        if (this.compatInternalInstance == null) {
            return 0;
        }
        try {
            return getDepthTexNoTranslucent.invoke(this.compatInternalInstance);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public static boolean hasRenderingEnabled() {
        if (!dhPresent) {
            return false;
        }
        return DHCompat.checkFrame();
    }
}

