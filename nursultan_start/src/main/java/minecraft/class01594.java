/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class04649
 *  minecraft.class06221
 *  minecraft.class08844
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWMonitorCallback
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import minecraft.class04649;
import minecraft.class06221;
import minecraft.class08844;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWMonitorCallback;
import org.slf4j.Logger;

public class class01594 {
    private static final Logger N = LogUtils.getLogger();
    private final Long2ObjectMap<class06221> y = new Long2ObjectOpenHashMap();
    private final class04649 L;

    public class01594(class04649 class046492) {
        this.L = class046492;
        GLFW.glfwSetMonitorCallback(this::N);
        PointerBuffer pointerBuffer = GLFW.glfwGetMonitors();
        if (pointerBuffer != null) {
            for (int i = 0; i < pointerBuffer.limit(); ++i) {
                long l = pointerBuffer.get(i);
                this.y.put(l, (Object)class046492.createMonitor(l));
            }
        }
    }

    public @Nullable class06221 N(class08844 class088442) {
        long l = GLFW.glfwGetWindowMonitor((long)class088442.B());
        if (l != 0L) {
            return this.N(l);
        }
        int n = class088442.T();
        int n2 = n + class088442.W();
        int n3 = class088442.b();
        int n4 = n3 + class088442.m();
        int n5 = -1;
        class06221 class062212 = null;
        long l2 = GLFW.glfwGetPrimaryMonitor();
        N.debug("Selecting monitor - primary: {}, current monitors: {}", (Object)l2, this.y);
        for (class06221 class062213 : this.y.values()) {
            int n6;
            int n7 = class062213.L();
            int n8 = n7 + class062213.y().N();
            int n9 = class062213.u();
            int n10 = n9 + class062213.y().y();
            int n11 = class01594.N(n, n7, n8);
            int n12 = class01594.N(n2, n7, n8);
            int n13 = class01594.N(n3, n9, n10);
            int n14 = class01594.N(n4, n9, n10);
            int n15 = Math.max(0, n12 - n11);
            int n16 = n15 * (n6 = Math.max(0, n14 - n13));
            if (n16 > n5) {
                class062212 = class062213;
                n5 = n16;
                continue;
            }
            if (n16 != n5 || l2 != class062213.R()) continue;
            N.debug("Primary monitor {} is preferred to monitor {}", (Object)class062213, (Object)class062212);
            class062212 = class062213;
        }
        N.debug("Selected monitor: {}", class062212);
        return class062212;
    }

    public void N() {
        RenderSystem.assertOnRenderThread();
        GLFWMonitorCallback gLFWMonitorCallback = GLFW.glfwSetMonitorCallback(null);
        if (gLFWMonitorCallback != null) {
            gLFWMonitorCallback.free();
        }
    }

    public static int N(int n, int n2, int n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }

    private void N(long l, int n) {
        RenderSystem.assertOnRenderThread();
        if (n == 262145) {
            this.y.put(l, (Object)this.L.createMonitor(l));
            N.debug("Monitor {} connected. Current monitors: {}", (Object)l, this.y);
        } else if (n == 262146) {
            this.y.remove(l);
            N.debug("Monitor {} disconnected. Current monitors: {}", (Object)l, this.y);
        }
    }

    public @Nullable class06221 N(long l) {
        return (class06221)this.y.get(l);
    }
}

