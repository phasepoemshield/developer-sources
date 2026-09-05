/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11656
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.platform.GLX
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.logging.LogUtils
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class01018
 *  minecraft.class01594
 *  minecraft.class01622
 *  minecraft.class03499
 *  minecraft.class03652
 *  minecraft.class04560
 *  minecraft.class04655
 *  minecraft.class04678
 *  minecraft.class04760
 *  minecraft.class06221
 *  minecraft.class06619
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 *  minecraft.class08280
 *  minecraft.class08712
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds$Reference
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.amd.AmdWorkarounds
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.nvidia.NvidiaWorkarounds
 *  net.caffeinemc.mods.sodium.client.gui.SodiumOptions
 *  net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  net.irisshaders.iris.Iris
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.glfw.Callbacks
 *  org.lwjgl.glfw.GLFW
 *  org.lwjgl.glfw.GLFWErrorCallback
 *  org.lwjgl.glfw.GLFWErrorCallbackI
 *  org.lwjgl.glfw.GLFWImage
 *  org.lwjgl.glfw.GLFWImage$Buffer
 *  org.lwjgl.glfw.GLFWNativeWin32
 *  org.lwjgl.glfw.GLFWWindowCloseCallback
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.tinyfd.TinyFileDialogs
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11656;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class01018;
import minecraft.class01594;
import minecraft.class01622;
import minecraft.class03499;
import minecraft.class03652;
import minecraft.class04560;
import minecraft.class04655;
import minecraft.class04678;
import minecraft.class04760;
import minecraft.class06221;
import minecraft.class06619;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;
import minecraft.class08280;
import minecraft.class08712;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.amd.AmdWorkarounds;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.nvidia.NvidiaWorkarounds;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.irisshaders.iris.Iris;
import org.jspecify.annotations.Nullable;
import org.lwjgl.PointerBuffer;
import org.lwjgl.glfw.Callbacks;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWImage;
import org.lwjgl.glfw.GLFWNativeWin32;
import org.lwjgl.glfw.GLFWWindowCloseCallback;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.tinyfd.TinyFileDialogs;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class08844
implements AutoCloseable,
NativeWindowHandle {
    private static final Logger L;
    public static final int N = 320;
    public static final int y = 240;
    private final GLFWErrorCallback u = GLFWErrorCallback.create(this::N);
    private final class04678 i;
    private final class01594 R;
    private final long M;
    private int B;
    private int Z;
    private int z;
    private int U;
    private Optional<class04760> E;
    private boolean W;
    private boolean m;
    private int P;
    private int s;
    private int T;
    private int b;
    private int j;
    private int v;
    private int n;
    private int t;
    private int G;
    private String l = "";
    private boolean d;
    private boolean w;
    private boolean k;
    private boolean Y;
    private boolean Q;
    private class06619 O = class06619.N;
    private static String g;

    private void w() {
        GLFW.glfwDefaultWindowHints();
        if (g.contains("mac") && SodiumExtraClientMod.options().extraSettings.reduceResolutionOnMac) {
            GLFW.glfwWindowHint((int)143361, (int)0);
        }
    }

    public boolean L() {
        return GLX._shouldClose((class08844)this);
    }

    public void L(boolean bl) {
        this.Q = bl;
    }

    public void L(int n) {
        this.v = n;
    }

    private void L(long l, boolean bl) {
        this.k = bl;
    }

    private void L(long l, int n, int n2) {
        this.T = n;
        this.b = n2;
    }

    public void M() {
        this.W = !this.W;
    }

    public int P() {
        return this.n;
    }

    public int T() {
        return this.P;
    }

    public class08844(class04678 class046782, class01594 class015942, class01018 class010182, @Nullable String string, String string2) {
        this.R = class015942;
        this.G();
        this.N("Pre startup");
        this.i = class046782;
        Optional<Object> optional = class04760.N((String)string);
        this.E = optional.isPresent() ? optional : (class010182.L().isPresent() && class010182.u().isPresent() ? Optional.of(new class04760(class010182.L().getAsInt(), class010182.u().getAsInt(), 8, 8, 8, 60)) : Optional.empty());
        this.m = this.W = class010182.i();
        class06221 class062212 = class015942.N(GLFW.glfwGetPrimaryMonitor());
        this.z = this.T = Math.max(class010182.N(), 1);
        this.U = this.b = Math.max(class010182.y(), 1);
        this.w();
        GLFW.glfwWindowHint((int)139265, (int)196609);
        GLFW.glfwWindowHint((int)139275, (int)221185);
        GLFW.glfwWindowHint((int)139266, (int)3);
        GLFW.glfwWindowHint((int)139267, (int)3);
        GLFW.glfwWindowHint((int)139272, (int)204801);
        GLFW.glfwWindowHint((int)139270, (int)1);
        long l = this.W && class062212 != null ? class062212.R() : 0L;
        this.N(class046782, class015942, class010182, string, string2, null);
        long l2 = 0L;
        long l3 = l;
        String string3 = string2;
        int n = this.b;
        int n2 = this.T;
        this.M = this.N(n2, n, string3, l3, l2, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)5, (String)"[int, int, java.lang.CharSequence, long, long]");
            return this.N((Integer)objectArray[0], (Integer)objectArray[1], (CharSequence)objectArray[2], (Long)objectArray[3], (Long)objectArray[4]);
        });
        if (class062212 != null) {
            class04760 class047602 = class062212.N(this.W ? this.E : Optional.empty());
            this.B = this.P = class062212.L() + class047602.N() / 2 - this.T / 2;
            this.Z = this.s = class062212.u() + class047602.y() / 2 - this.b / 2;
        } else {
            int[] nArray = new int[1];
            int[] nArray2 = new int[1];
            GLFW.glfwGetWindowPos((long)this.M, (int[])nArray, (int[])nArray2);
            this.B = this.P = nArray[0];
            this.Z = this.s = nArray2[0];
        }
        this.d();
        this.l();
        GLFW.glfwSetFramebufferSizeCallback((long)this.M, this::y);
        GLFW.glfwSetWindowPosCallback((long)this.M, this::N);
        GLFW.glfwSetWindowSizeCallback((long)this.M, this::L);
        GLFW.glfwSetWindowFocusCallback((long)this.M, this::N);
        GLFW.glfwSetCursorEnterCallback((long)this.M, this::y);
        GLFW.glfwSetWindowIconifyCallback((long)this.M, this::L);
    }

    public long B() {
        return this.M;
    }

    public boolean Z() {
        return this.W;
    }

    public Optional<class04760> i() {
        return this.E;
    }

    public int b() {
        return this.s;
    }

    public int s() {
        return this.t;
    }

    public boolean n() {
        return this.Y;
    }

    private void l() {
        int[] nArray = new int[1];
        int[] nArray2 = new int[1];
        GLFW.glfwGetFramebufferSize((long)this.M, (int[])nArray, (int[])nArray2);
        this.j = nArray[0] > 0 ? nArray[0] : 1;
        this.v = nArray2[0] > 0 ? nArray2[0] : 1;
        this.N((CallbackInfo)null);
    }

    private void d() {
        boolean bl;
        boolean bl2 = bl = GLFW.glfwGetWindowMonitor((long)this.M) != 0L;
        if (this.W) {
            class06221 class062212 = this.R.N(this);
            if (class062212 == null) {
                L.warn("Failed to find suitable monitor for fullscreen mode");
                this.W = false;
            } else {
                if (class04560.N) {
                    class04560.N((class08844)this);
                }
                class04760 class047602 = class062212.N(this.E);
                if (!bl) {
                    this.B = this.P;
                    this.Z = this.s;
                    this.z = this.T;
                    this.U = this.b;
                }
                this.P = 0;
                this.s = 0;
                this.T = class047602.N();
                this.b = class047602.y();
                GLFW.glfwSetWindowMonitor((long)this.M, (long)class062212.R(), (int)this.P, (int)this.s, (int)this.T, (int)this.b, (int)class047602.R());
                if (class04560.N) {
                    class04560.y((class08844)this);
                }
            }
        } else {
            this.P = this.B;
            this.s = this.Z;
            this.T = this.z;
            this.b = this.U;
            GLFW.glfwSetWindowMonitor((long)this.M, (long)0L, (int)this.P, (int)this.s, (int)this.T, (int)this.b, (int)-1);
        }
    }

    public int m() {
        return this.b;
    }

    public float t() {
        return Math.max(2.5f, (float)this.U() / 1920.0f * 2.5f);
    }

    public @Nullable class06221 v() {
        return this.R.N(this);
    }

    public int j() {
        return this.G;
    }

    public int U() {
        return this.j;
    }

    @Override
    public void close() {
        RenderSystem.assertOnRenderThread();
        Callbacks.glfwFreeCallbacks((long)this.M);
        this.u.close();
        GLFW.glfwDestroyWindow((long)this.M);
        GLFW.glfwTerminate();
    }

    public boolean z() {
        return this.k;
    }

    public void u() {
        GLFWErrorCallback gLFWErrorCallback = GLFW.glfwSetErrorCallback((GLFWErrorCallbackI)this.u);
        if (gLFWErrorCallback != null) {
            gLFWErrorCallback.free();
        }
    }

    private void u(int n) {
        if (SodiumExtraClientMod.options().extraSettings.useAdaptiveSync) {
            if (GLFW.glfwExtensionSupported((CharSequence)"GLX_EXT_swap_control_tear") || GLFW.glfwExtensionSupported((CharSequence)"WGL_EXT_swap_control_tear")) {
                GLFW.glfwSwapInterval((int)-1);
            } else {
                SodiumExtraClientMod.logger().warn("Adaptive vsync not supported, falling back to vanilla vsync state!");
                SodiumExtraClientMod.options().extraSettings.useAdaptiveSync = false;
                SodiumExtraClientMod.options().writeChanges();
                GLFW.glfwSwapInterval((int)n);
            }
        } else {
            GLFW.glfwSwapInterval((int)n);
        }
    }

    private static void y(int n, long l) {
        String string = "GLFW error " + n + ": " + MemoryUtil.memUTF8((long)l);
        TinyFileDialogs.tinyfd_messageBox((CharSequence)"Minecraft", (CharSequence)(string + ".\n\nPlease make sure you have up-to-date drivers (see aka.ms/mcdriver for instructions)."), (CharSequence)"ok", (CharSequence)"error", (boolean)false);
        throw new class11656(string);
    }

    public void y(boolean bl) {
        class04655.N((class08844)this, (boolean)bl);
    }

    public void y(String string) {
        GLFW.glfwSetWindowTitle((long)this.M, (CharSequence)string);
    }

    private void y(long l, boolean bl) {
        if (bl) {
            this.i.H();
        }
    }

    public void y(int n) {
        this.j = n;
    }

    private void y(long l, int n, int n2) {
        if (l != this.M) {
            return;
        }
        int n3 = this.U();
        int n4 = this.E();
        if (n == 0 || n2 == 0) {
            this.Y = true;
            return;
        }
        this.Y = false;
        this.j = n;
        this.v = n2;
        if (this.U() != n3 || this.E() != n4) {
            try {
                this.i.V();
            }
            catch (Exception exception) {
                class07080 class070802 = class07080.N((Throwable)exception, (String)"Window resize");
                class07074 class070742 = class070802.N("Window Dimensions");
                class070742.N("Old", (Object)(n3 + "x" + n4));
                class070742.N("New", (Object)(n + "x" + n2));
                throw new class07878(class070802);
            }
        }
    }

    public int y() {
        RenderSystem.assertOnRenderThread();
        return GLX._getRefreshRate((class08844)this);
    }

    public int E() {
        return this.v;
    }

    public void N(Runnable runnable) {
        GLFWWindowCloseCallback gLFWWindowCloseCallback = GLFW.glfwSetWindowCloseCallback((long)this.M, l -> runnable.run());
        if (gLFWWindowCloseCallback != null) {
            gLFWWindowCloseCallback.free();
        }
    }

    public void N(class06619 class066192) {
        class06619 class066193;
        class06619 class066194 = class066193 = this.Q ? class066192 : class06619.N;
        if (this.O != class066193) {
            this.O = class066193;
            class066193.N(this);
        }
    }

    private void N(CallbackInfo callbackInfo) {
        if (g.contains("mac") && SodiumExtraClientMod.options().extraSettings.reduceResolutionOnMac) {
            this.j /= 2;
            this.v /= 2;
        }
    }

    private void N(class04678 class046782, class01594 class015942, class01018 class010182, String string, String string2, CallbackInfo callbackInfo) {
        if (Iris.getIrisConfig().areDebugOptionsEnabled()) {
            GLFW.glfwWindowHint((int)139271, (int)1);
            GLFW.glfwWindowHint((int)139274, (int)0);
            Iris.logger.info("OpenGL debug context activated.");
            if (SodiumClientMod.options().performance.useNoErrorGLContext) {
                TinyFileDialogs.tinyfd_messageBox((CharSequence)"Iris", (CharSequence)"Due to a configuration issue, Iris may crash on this launch. This has been fixed automatically for the next launch.", (CharSequence)"ok", (CharSequence)"warning", (boolean)false);
                SodiumClientMod.options().performance.useNoErrorGLContext = false;
                try {
                    SodiumOptions.writeToDisk((SodiumOptions)SodiumClientMod.options());
                }
                catch (IOException iOException) {
                    throw new RuntimeException(iOException);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private long N(int n, int n2, CharSequence charSequence, long l, long l2) {
        NvidiaWorkarounds.applyEnvironmentChanges();
        AmdWorkarounds.applyEnvironmentChanges();
        try {
            long l3 = GLFW.glfwCreateWindow((int)n, (int)n2, (CharSequence)charSequence, (long)l, (long)l2);
            return l3;
        }
        finally {
            NvidiaWorkarounds.undoEnvironmentChanges();
            AmdWorkarounds.undoEnvironmentChanges();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private long N(IntSupplier intSupplier, IntSupplier intSupplier2, Supplier supplier, LongSupplier longSupplier, Operation operation) {
        boolean bl;
        boolean bl2 = bl = !PlatformRuntimeInformation.getInstance().platformHasEarlyLoadingScreen();
        if (bl) {
            NvidiaWorkarounds.applyEnvironmentChanges();
            AmdWorkarounds.applyEnvironmentChanges();
        }
        try {
            long l = (Long)operation.call(new Object[]{intSupplier, intSupplier2, supplier, longSupplier});
            return l;
        }
        finally {
            if (bl) {
                NvidiaWorkarounds.undoEnvironmentChanges();
                AmdWorkarounds.undoEnvironmentChanges();
            }
        }
    }

    public long N(int n, int n2, CharSequence charSequence, long l, long l2, Operation operation) {
        if (!PlatformRuntimeInformation.getInstance().platformHasEarlyLoadingScreen() && SodiumClientMod.options().performance.useNoErrorGLContext && !Workarounds.isWorkaroundEnabled((Workarounds.Reference)Workarounds.Reference.NO_ERROR_CONTEXT_UNSUPPORTED)) {
            GLFW.glfwWindowHint((int)139274, (int)1);
        }
        return (Long)operation.call(new Object[]{n, n2, charSequence, l, l2});
    }

    public static void N(BiConsumer<Integer, String> biConsumer) {
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
            int n = GLFW.glfwGetError((PointerBuffer)pointerBuffer);
            if (n != 0) {
                long l = pointerBuffer.get();
                String string = l == 0L ? "" : MemoryUtil.memUTF8((long)l);
                biConsumer.accept(n, string);
            }
        }
    }

    public static String N() {
        int n = GLFW.glfwGetPlatform();
        return switch (n) {
            case 0 -> "<error>";
            case 393217 -> "win32";
            case 393218 -> "cocoa";
            case 393219 -> "wayland";
            case 393220 -> "x11";
            case 393221 -> "null";
            default -> String.format(Locale.ROOT, "unknown (%08X)", n);
        };
    }

    public void N(@Nullable class08712 class087122) {
        RenderSystem.flipFrame((class08844)this, (class08712)class087122);
        if (this.W != this.m) {
            this.m = this.W;
            this.N(this.w, class087122);
        }
    }

    public void N(Optional<class04760> optional) {
        boolean bl = !optional.equals(this.E);
        this.E = optional;
        if (bl) {
            this.d = true;
        }
    }

    public void N(int n, long l) {
        RenderSystem.assertOnRenderThread();
        String string = MemoryUtil.memUTF8((long)l);
        L.error("########## GL ERROR ##########");
        L.error("@ {}", (Object)this.l);
        L.error("{}: {}", (Object)n, (Object)string);
    }

    public void N(int n, int n2) {
        this.z = n;
        this.U = n2;
        this.W = false;
        this.d();
    }

    private void N(long l, boolean bl) {
        if (l == this.M) {
            this.i.L(bl);
        }
    }

    public void N(boolean bl) {
        RenderSystem.assertOnRenderThread();
        this.w = bl;
        int n = bl ? 1 : 0;
        this.u(n);
    }

    private void N(long l, int n, int n2) {
        this.P = n;
        this.s = n2;
    }

    public void N(int n) {
        this.G = n;
        double d = n;
        int n2 = (int)((double)this.j / d);
        this.n = (double)this.j / d > (double)n2 ? n2 + 1 : n2;
        int n3 = (int)((double)this.v / d);
        this.t = (double)this.v / d > (double)n3 ? n3 + 1 : n3;
    }

    public void N(String string) {
        this.l = string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class01622 class016222, class03499 class034992) throws IOException {
        int n = GLFW.glfwGetPlatform();
        switch (n) {
            case 393217: 
            case 393220: {
                List list = class034992.N(class016222);
                ArrayList<ByteBuffer> arrayList = new ArrayList<ByteBuffer>(list.size());
                try (MemoryStack memoryStack = MemoryStack.stackPush();){
                    GLFWImage.Buffer buffer = GLFWImage.malloc((int)list.size(), (MemoryStack)memoryStack);
                    for (int i = 0; i < list.size(); ++i) {
                        try (class08280 class082802 = class08280.N((InputStream)((InputStream)((class03652)list.get(i)).get()));){
                            ByteBuffer byteBuffer = MemoryUtil.memAlloc((int)(class082802.N() * class082802.y() * 4));
                            arrayList.add(byteBuffer);
                            byteBuffer.asIntBuffer().put(class082802.u());
                            buffer.position(i);
                            buffer.width(class082802.N());
                            buffer.height(class082802.y());
                            buffer.pixels(byteBuffer);
                            continue;
                        }
                    }
                    GLFW.glfwSetWindowIcon((long)this.M, (GLFWImage.Buffer)((GLFWImage.Buffer)buffer.position(0)));
                    break;
                }
                finally {
                    arrayList.forEach(MemoryUtil::memFree);
                }
            }
            case 393218: {
                class04560.N((class03652)class034992.y(class016222));
                break;
            }
            case 393219: 
            case 393221: {
                break;
            }
            default: {
                L.warn("Not setting icon for unrecognized platform: {}", (Object)n);
            }
        }
    }

    private void N(boolean bl, @Nullable class08712 class087122) {
        RenderSystem.assertOnRenderThread();
        try {
            this.d();
            this.i.V();
            this.N(bl);
            this.N(class087122);
        }
        catch (Exception exception) {
            L.error("Couldn't toggle fullscreen", (Throwable)exception);
        }
    }

    public int N(int n, boolean bl) {
        int n2;
        for (n2 = 1; n2 != n && n2 < this.j && n2 < this.v && this.j / (n2 + 1) >= 320 && this.v / (n2 + 1) >= 240; ++n2) {
        }
        if (bl && n2 % 2 != 0) {
            ++n2;
        }
        return n2;
    }

    public long getWin32Handle() {
        return GLFWNativeWin32.glfwGetWin32Window((long)this.B());
    }

    public int W() {
        return this.T;
    }

    public void R() {
        if (this.W && this.d) {
            this.d = false;
            this.d();
            this.i.V();
        }
    }

    private void G() {
        GLFW.glfwSetErrorCallback(class08844::y);
    }

    static {
        g = System.getProperty("os.name").toLowerCase();
        L = LogUtils.getLogger();
    }
}

