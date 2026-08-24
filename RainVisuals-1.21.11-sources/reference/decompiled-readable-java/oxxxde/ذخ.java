/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  net.minecraft.client.gl.GlGpuBuffer
 *  net.minecraft.client.gui.screen.ChatScreen
 */
package oxxxde;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Arrays;
import java.util.Collection;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.listener.Listener;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.compile.GlShaderLibrary;
import kotakbaz.rain.client.render.main.compile.b;
import kotakbaz.rain.client.render.main.program.a;
import kotakbaz.rain.client.util.other.CustomScreen;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.client.waypoint.WayPointManager;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.ui.menu.MenuScreen;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import net.minecraft.client.gl.GlGpuBuffer;
import net.minecraft.client.gui.screen.ChatScreen;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u062f;
import oxxxde.\u062b\u0638;
import oxxxde.\u062b\u064c;
import oxxxde.\u062d\u0644;
import oxxxde.\u062d\u0646;
import oxxxde.\u062f\u062f;
import oxxxde.\u0630\u0631;
import oxxxde.\u0631\u0633;
import oxxxde.\u0631\u0638;
import oxxxde.\u0631\u064e;
import oxxxde.\u0633\u0621;
import oxxxde.\u0634\u0622;
import oxxxde.\u0634\u0633;
import oxxxde.\u0635\u0635;
import oxxxde.\u0635\u0652;
import oxxxde.\u0636\u0634;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u0626;
import oxxxde.\u0638\u0642;
import oxxxde.\u0652;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J)\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ7\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0003J\u0019\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\b\u001f\u0010 R\"\u0010!\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010.\u00a8\u0006/"}, d2={"Loxxxde/\u0630\u062e;", "Loxxxde/\u062a\u0645;", "<init>", "()V", "", "init", "ensureLoaded", "", "partialTicks", "", "Loxxxde/\u0635\u0624;", "pipelines", "hookRender", "(F[Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "", "hasHud", "hasGui", "hookRenderInternal", "(F[Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;ZZ)V", "flushFramePipelines", "([Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "Loxxxde/\u062c\u0638;", "beginFramePipelines", "()Lkotakbaz/rain/client/render/main/ChromaRenderer$FramebufferState;", "fbState", "endFramePipelines", "(Lkotakbaz/rain/client/render/main/ChromaRenderer$FramebufferState;)V", "registerShaderLibs", "", "file", "Loxxxde/\u0635\u063a;", "registerShaderLib", "(Ljava/lang/String;)Lkotakbaz/rain/client/render/main/compile/GlShaderLibrary;", "loaded", "Z", "getLoaded", "()Z", "setLoaded", "(Z)V", "Loxxxde/\u062f\u062f;", "frameGate", "Loxxxde/\u062f\u062f;", "Loxxxde/\u062b\u0622;", "overlayRenderEvent", "Loxxxde/\u062b\u0622;", "framebufferState", "Loxxxde/\u062c\u0638;", "rain-visuals"})
public final class \u0630\u062e
extends Listener {
    @NotNull
    private static final ChromaRenderer.FramebufferState framebufferState;
    @NotNull
    private static final \u062f\u062f frameGate;
    @NotNull
    private static final OverlayRenderEvent overlayRenderEvent;
    private static boolean loaded;
    @NotNull
    public static final \u0630\u062e INSTANCE;

    public final boolean getLoaded() {
        return loaded;
    }

    private final ChromaRenderer.FramebufferState beginFramePipelines() {
        ChromaRenderer.captureFramebufferState(framebufferState);
        ChromaRenderer.bindMainFramebuffer();
        ChromaRenderer.applyBlend(\u0635\u0652.SRC_ALPHA, \u062d\u0646.ONE_MINUS_SRC_ALPHA, \u0635\u0652.ONE, \u062d\u0646.ZERO);
        return framebufferState;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void flushFramePipelines(ClientRenderPipeline ... pipelines) {
        RenderSystem.backupProjectionMatrix();
        ChromaRenderer.FramebufferState fbState = null;
        try {
            \u0628\u062f.INSTANCE.unscaledProjection();
            \u0628\u062f.INSTANCE.reset();
            GlStateManager._disableDepthTest();
            fbState = this.beginFramePipelines();
            \u0637\u0626.INSTANCE.renderQueuedFrom(pipelines);
            \u0638\u0642.INSTANCE.flushPipelineArray(pipelines);
        }
        finally {
            ChromaRenderer.FramebufferState framebufferState = fbState;
            if (framebufferState != null) {
                ChromaRenderer.FramebufferState p0 = framebufferState;
                boolean bl = false;
                this.endFramePipelines(p0);
            }
            RenderSystem.restoreProjectionMatrix();
        }
    }

    private static final int init$lambda$0(GlGpuBuffer glGpuBuffer) {
        return glGpuBuffer.id;
    }

    public final void ensureLoaded() {
        if (loaded) {
            return;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(3);
        spreadBuilder.add(\u0630\u0631.INSTANCE.getADVANCED_RECT());
        spreadBuilder.add(\u0630\u0631.INSTANCE.getKAWASE());
        Collection $this$toTypedArray$iv = \u0631\u064e.INSTANCE.getAll();
        boolean $i$f$toTypedArray = false;
        Collection thisCollection$iv = $this$toTypedArray$iv;
        spreadBuilder.addSpread(thisCollection$iv.toArray(new Font[0]));
        \u0638\u0642.INSTANCE.loadShaders((Renderable[])spreadBuilder.toArray(new Renderable[spreadBuilder.size()]));
        \u0638\u0642.INSTANCE.loadRender();
        \u0634\u0633.INSTANCE.load();
        loaded = true;
    }

    private final void registerShaderLibs() {
        GlShaderLibrary[] glShaderLibraryArray = new GlShaderLibrary[4];
        glShaderLibraryArray[0] = this.registerShaderLib("math_utils");
        glShaderLibraryArray[1] = this.registerShaderLib("shapes");
        glShaderLibraryArray[2] = this.registerShaderLib("matrices");
        glShaderLibraryArray[3] = this.registerShaderLib("scissor_check");
        b.registerShaderLibraries(glShaderLibraryArray);
    }

    private final GlShaderLibrary registerShaderLib(String file) {
        GlShaderLibrary glShaderLibrary = \u0631\u0633.IN_JAR.createShaderLibraryBuilder(new a[0]).name(file).library(Renderable.Companion.getSHADER_INCLUDE_PATH() + file + ".glsl").build();
        Intrinsics.checkNotNullExpressionValue(glShaderLibrary, "build(...)");
        return glShaderLibrary;
    }

    public final void hookRender(float partialTicks, ClientRenderPipeline ... pipelines) {
        Intrinsics.checkNotNullParameter(pipelines, "pipelines");
        boolean hasHud = ArraysKt.contains(pipelines, ClientRenderPipeline.HUD_RECT);
        boolean hasGui = ArraysKt.contains(pipelines, ClientRenderPipeline.GUI_RECT);
        this.hookRenderInternal(partialTicks, pipelines, hasHud, hasGui);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void hookRenderInternal(float partialTicks, ClientRenderPipeline[] pipelines, boolean hasHud, boolean hasGui) {
        ChromaRenderer.FramebufferState framebufferState;
        block22: {
            block21: {
                this.ensureLoaded();
                if (\u0636\u0643.getMc().player == null) break block21;
                if (\u0636\u0643.getMc().world != null) break block22;
            }
            this.flushFramePipelines(Arrays.copyOf(pipelines, pipelines.length));
            return;
        }
        if (hasHud) {
            \u0633\u0621.INSTANCE.renderWorldIfNeeded();
            \u0652.INSTANCE.renderWorldIfNeeded();
        }
        int mouseX = \u062d\u0644.INSTANCE.mouseX();
        int mouseY = \u062d\u0644.INSTANCE.mouseY();
        RenderSystem.backupProjectionMatrix();
        ChromaRenderer.FramebufferState fbState = null;
        try {
            \u0628\u062f.INSTANCE.unscaledProjection();
            \u0628\u062f.INSTANCE.reset();
            GlStateManager._disableDepthTest();
            if (ArraysKt.contains(pipelines, ClientRenderPipeline.LOW) && frameGate.shouldExecute(30)) {
                \u0630\u0631.INSTANCE.getKAWASE().applyBlur();
            }
            fbState = this.beginFramePipelines();
            if (hasHud) {
                WayPointManager.INSTANCE.renderHud(partialTicks);
            }
            if (hasHud && \u0636\u0643.getMc().currentScreen instanceof ChatScreen) {
                Collection<Draggable> collection = \u062b\u064c.INSTANCE.getDraggables().values();
                Intrinsics.checkNotNullExpressionValue(collection, "<get-values>(...)");
                Iterable $this$forEach$iv = collection;
                boolean $i$f$forEach = false;
                for (Object element$iv : $this$forEach$iv) {
                    Draggable draggable = (Draggable)element$iv;
                    boolean bl = false;
                    if (!draggable.getModule().isEnabled()) continue;
                    draggable.onDraw();
                }
            }
            if (hasHud) {
                \u0631\u0638.INSTANCE.post(overlayRenderEvent);
                \u0636\u0634.INSTANCE.render();
            }
            if (hasGui) {
                CustomScreen customScreen = \u0635\u0635.INSTANCE.getCustomScreen();
                if (customScreen != null) {
                    CustomScreen screen = customScreen;
                    boolean bl = false;
                    screen.render(mouseX, mouseY, partialTicks);
                    if (screen.shouldRemove()) {
                        \u0635\u0635.INSTANCE.setCustomScreen(null);
                    }
                }
            }
            \u0637\u0626.INSTANCE.renderQueuedFrom(pipelines);
            \u0638\u0642.INSTANCE.flushPipelineArray(pipelines);
            if (hasGui && (MenuScreen.INSTANCE.canRenderModelPreviews() || \u0634\u0622.hasPendingWork())) {
                \u0634\u0622.renderQueued();
            } else {
                \u0634\u0622.clear();
            }
            if (hasGui) {
                \u062b\u0638.INSTANCE.capturePendingFrame();
            }
            framebufferState = fbState;
        }
        catch (Throwable throwable) {
            ChromaRenderer.FramebufferState framebufferState2 = fbState;
            if (framebufferState2 != null) {
                ChromaRenderer.FramebufferState framebufferState3 = framebufferState2;
                boolean bl = false;
                this.endFramePipelines(framebufferState3);
            }
            RenderSystem.restoreProjectionMatrix();
            throw throwable;
        }
        if (framebufferState != null) {
            ChromaRenderer.FramebufferState framebufferState4 = framebufferState;
            boolean bl = false;
            this.endFramePipelines(framebufferState4);
        }
        RenderSystem.restoreProjectionMatrix();
    }

    private \u0630\u062e() {
    }

    private static final int init$lambda$1() {
        return \u0636\u0643.getMc().getWindow().getScaleFactor();
    }

    private final void endFramePipelines(ChromaRenderer.FramebufferState fbState) {
        ChromaRenderer.restoreFramebufferState(fbState);
    }

    static {
        INSTANCE = new \u0630\u062e();
        frameGate = new \u062f\u062f(null, 1, null);
        overlayRenderEvent = new OverlayRenderEvent();
        framebufferState = new ChromaRenderer.FramebufferState();
    }

    @Override
    public void init() {
        ChromaRenderer.init(\u0630\u062e::init$lambda$0, \u0630\u062e::init$lambda$1);
        this.registerShaderLibs();
        \u0634\u0633.INSTANCE.register("interface_hue", "textures/interface/hue.png");
        \u0634\u0633.INSTANCE.register("interface_avatar", "textures/interface/avatar.png");
        \u0634\u0633.INSTANCE.register("main_menu_background", "textures/mainmenu/mainnew.png");
        \u0634\u0633.INSTANCE.register("main_menu_icon_glow", "images/particles/glow.png");
    }

    public final void setLoaded(boolean bl) {
        loaded = bl;
    }
}

