/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Lists
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.logging.LogUtils
 *  minecraft.class08844
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.Version
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.glfw.GLFWVidMode
 *  org.lwjgl.system.MemoryUtil
 *  org.slf4j.Logger
 *  oshi.SystemInfo
 *  oshi.hardware.CentralProcessor
 */
package com.mojang.blaze3d.platform;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import minecraft.class08844;
import org.jspecify.annotations.Nullable;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;
import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class GLX {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static @Nullable String cpuInfo;

    public static int _getRefreshRate(class08844 class088442) {
        RenderSystem.assertOnRenderThread();
        long l = GLFW.glfwGetWindowMonitor((long)class088442.B());
        if (l == 0L) {
            l = GLFW.glfwGetPrimaryMonitor();
        }
        GLFWVidMode gLFWVidMode = l == 0L ? null : GLFW.glfwGetVideoMode((long)l);
        return gLFWVidMode == null ? 0 : gLFWVidMode.refreshRate();
    }

    public static boolean _shouldClose(class08844 class088442) {
        return GLFW.glfwWindowShouldClose((long)class088442.B());
    }

    public static <T> T make(Supplier<T> supplier) {
        return supplier.get();
    }

    public static <T> T make(T t, Consumer<T> consumer) {
        consumer.accept(t);
        return t;
    }

    public static String _getCpuInfo() {
        if (cpuInfo == null) {
            cpuInfo = "<unknown>";
            try {
                CentralProcessor centralProcessor = new SystemInfo().getHardware().getProcessor();
                cpuInfo = String.format(Locale.ROOT, "%dx %s", centralProcessor.getLogicalProcessorCount(), centralProcessor.getProcessorIdentifier().getName()).replaceAll("\\s+", " ");
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        return cpuInfo;
    }

    public static LongSupplier _initGlfw() {
        LongSupplier longSupplier;
        class08844.N((n, string) -> {
            throw new IllegalStateException(String.format(Locale.ROOT, "GLFW error before init: [0x%X]%s", n, string));
        });
        ArrayList arrayList = Lists.newArrayList();
        GLFWErrorCallback gLFWErrorCallback = GLFW.glfwSetErrorCallback((n, l) -> {
            String string = l == 0L ? "" : MemoryUtil.memUTF8((long)l);
            arrayList.add(String.format(Locale.ROOT, "GLFW error during init: [0x%X]%s", n, string));
        });
        if (GLFW.glfwInit()) {
            longSupplier = () -> (long)(GLFW.glfwGetTime() * 1.0E9);
            for (String string2 : arrayList) {
                LOGGER.error("GLFW error collected during initialization: {}", (Object)string2);
            }
        } else {
            throw new IllegalStateException("Failed to initialize GLFW, errors: " + Joiner.on((String)",").join((Iterable)arrayList));
        }
        RenderSystem.setErrorCallback((GLFWErrorCallbackI)gLFWErrorCallback);
        return longSupplier;
    }

    public static String _getLWJGLVersion() {
        return Version.getVersion();
    }

    public static void _setGlfwErrorCallback(GLFWErrorCallbackI gLFWErrorCallbackI) {
        GLFWErrorCallback gLFWErrorCallback = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)gLFWErrorCallbackI);
        if (gLFWErrorCallback != null) {
            gLFWErrorCallback.free();
        }
    }
}

