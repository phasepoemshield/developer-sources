/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.EvictingQueue
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  com.mojang.blaze3d.platform.GLX
 *  com.mojang.logging.LogUtils
 *  java.util.HexFormat
 *  minecraft.class06417
 *  minecraft.class08879
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.ARBDebugOutput
 *  org.lwjgl.opengl.GL
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GLCapabilities
 *  org.lwjgl.opengl.GLDebugMessageARBCallback
 *  org.lwjgl.opengl.GLDebugMessageARBCallbackI
 *  org.lwjgl.opengl.GLDebugMessageCallback
 *  org.lwjgl.opengl.GLDebugMessageCallbackI
 *  org.lwjgl.opengl.KHRDebug
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.EvictingQueue;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import minecraft.class06417;
import minecraft.class08277;
import minecraft.class08879;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBDebugOutput;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLCapabilities;
import org.lwjgl.opengl.GLDebugMessageARBCallback;
import org.lwjgl.opengl.GLDebugMessageARBCallbackI;
import org.lwjgl.opengl.GLDebugMessageCallback;
import org.lwjgl.opengl.GLDebugMessageCallbackI;
import org.lwjgl.opengl.KHRDebug;
import org.slf4j.Logger;

public class class08263 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 10;
    private final Queue<class08277> L = EvictingQueue.create((int)10);
    private volatile @Nullable class08277 u;
    private static final List<Integer> i = ImmutableList.of((Object)37190, (Object)37191, (Object)37192, (Object)33387);
    private static final List<Integer> R = ImmutableList.of((Object)37190, (Object)37191, (Object)37192);

    public static String L(int n) {
        switch (n) {
            case 37190: {
                return "HIGH";
            }
            case 37191: {
                return "MEDIUM";
            }
            case 37192: {
                return "LOW";
            }
            case 33387: {
                return "NOTIFICATION";
            }
        }
        return class08263.u(n);
    }

    private static String u(int n) {
        return "Unknown (0x" + HexFormat.of().withUpperCase().toHexDigits(n) + ")";
    }

    public static String y(int n) {
        switch (n) {
            case 33356: {
                return "ERROR";
            }
            case 33357: {
                return "DEPRECATED BEHAVIOR";
            }
            case 33358: {
                return "UNDEFINED BEHAVIOR";
            }
            case 33359: {
                return "PORTABILITY";
            }
            case 33360: {
                return "PERFORMANCE";
            }
            case 33361: {
                return "OTHER";
            }
            case 33384: {
                return "MARKER";
            }
        }
        return class08263.u(n);
    }

    public static String N(int n) {
        switch (n) {
            case 33350: {
                return "API";
            }
            case 33351: {
                return "WINDOW SYSTEM";
            }
            case 33352: {
                return "SHADER COMPILER";
            }
            case 33353: {
                return "THIRD PARTY";
            }
            case 33354: {
                return "APPLICATION";
            }
            case 33355: {
                return "OTHER";
            }
        }
        return class08263.u(n);
    }

    public static @Nullable class08263 N(int n, boolean bl, Set<String> set) {
        if (n <= 0) {
            return null;
        }
        GLCapabilities gLCapabilities = GL.getCapabilities();
        if (gLCapabilities.GL_KHR_debug && class08879.y) {
            class08263 class082632 = new class08263();
            set.add("GL_KHR_debug");
            GL11.glEnable((int)37600);
            if (bl) {
                GL11.glEnable((int)33346);
            }
            for (int i = 0; i < class08263.i.size(); ++i) {
                boolean bl2 = i < n;
                KHRDebug.glDebugMessageControl((int)4352, (int)4352, (int)class08263.i.get(i), (int[])null, (boolean)bl2);
            }
            KHRDebug.glDebugMessageCallback((GLDebugMessageCallbackI)((GLDebugMessageCallbackI)GLX.make((Object)GLDebugMessageCallback.create(class082632::N), class06417::N)), (long)0L);
            return class082632;
        }
        if (gLCapabilities.GL_ARB_debug_output && class08879.u) {
            class08263 class082633 = new class08263();
            set.add("GL_ARB_debug_output");
            if (bl) {
                GL11.glEnable((int)33346);
            }
            for (int i = 0; i < R.size(); ++i) {
                boolean bl3 = i < n;
                ARBDebugOutput.glDebugMessageControlARB((int)4352, (int)4352, (int)R.get(i), (int[])null, (boolean)bl3);
            }
            ARBDebugOutput.glDebugMessageCallbackARB((GLDebugMessageARBCallbackI)((GLDebugMessageARBCallbackI)GLX.make((Object)GLDebugMessageARBCallback.create(class082633::N), class06417::N)), (long)0L);
            return class082633;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List<String> N() {
        Queue<class08277> var1 = this.L;
        synchronized (var1) {
            ArrayList arrayList = Lists.newArrayListWithCapacity((int)this.L.size());
            for (class08277 class082772 : this.L) {
                arrayList.add(String.valueOf(class082772) + " x " + class082772.N);
            }
            return arrayList;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(int n, int n2, int n3, int n4, int n5, long l, long l2) {
        class08277 class082772;
        String string = GLDebugMessageCallback.getMessage((int)n5, (long)l);
        Queue<class08277> var12 = this.L;
        synchronized (var12) {
            class082772 = this.u;
            if (class082772 == null || !class082772.N(n, n2, n3, n4, string)) {
                class082772 = new class08277(n, n2, n3, n4, string);
                this.L.add(class082772);
                this.u = class082772;
            } else {
                ++class082772.N;
            }
        }
        N.info("OpenGL debug message: {}", (Object)class082772);
    }
}

