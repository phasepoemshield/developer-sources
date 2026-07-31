/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.listener.listeners;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.Rain;
import kotakbaz.rain.client.draggable.D;
import kotakbaz.rain.client.draggable.Draggable;
import kotakbaz.rain.client.draggable.c;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.listener.Listener;
import kotakbaz.rain.client.listener.listeners.InputListener;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.b_0;
import kotakbaz.rain.client.render.main.blend.a;
import kotakbaz.rain.client.render.main.blend.a_0;
import kotakbaz.rain.client.util.other.CustomScreen;
import kotakbaz.rain.client.util.other.FrameGate;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.TextureLoader;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.controls.LayerControl;
import kotakbaz.rain.client.util.render.engine.controls.MatrixControl;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.client.waypoint.WayPointManager;
import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.OverlayRenderEvent;
import kotakbaz.rain.event.types.Event;
import kotakbaz.rain.module.modules.render.ModuleAspectRatio;
import kotakbaz.rain.module.modules.render.ModuleColorSaturation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import net.minecraft.client.gl.GlGpuBuffer;
import net.minecraft.client.gui.screen.ChatScreen;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J)\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%\u00a8\u0006&"}, d2={"Lkotakbaz/rain/client/listener/listeners/RenderListener;", "Lkotakbaz/rain/client/listener/Listener;", "<init>", "()V", "", "init", "ensureLoaded", "", "partialTicks", "", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipelines", "hookRender", "(F[Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "flushFramePipelines", "([Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "Lkotakbaz/rain/client/render/main/ChromaRenderer$FramebufferState;", "beginFramePipelines", "()Lkotakbaz/rain/client/render/main/ChromaRenderer$FramebufferState;", "fbState", "endFramePipelines", "(Lkotakbaz/rain/client/render/main/ChromaRenderer$FramebufferState;)V", "registerShaderLibs", "", "file", "Lkotakbaz/rain/client/render/main/compile/GlShaderLibrary;", "registerShaderLib", "(Ljava/lang/String;)Lkotakbaz/rain/client/render/main/compile/GlShaderLibrary;", "", "loaded", "Z", "getLoaded", "()Z", "setLoaded", "(Z)V", "Lkotakbaz/rain/client/util/other/FrameGate;", "frameGate", "Lkotakbaz/rain/client/util/other/FrameGate;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nRenderListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderListener.kt\nkotakbaz/rain/client/listener/listeners/RenderListener\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n37#2,2:150\n1915#3,2:152\n*S KotlinDebug\n*F\n+ 1 RenderListener.kt\nkotakbaz/rain/client/listener/listeners/RenderListener\n*L\n45#1:150,2\n82#1:152,2\n*E\n"})
public final class RenderListener
extends Listener {
    @NotNull
    public static final RenderListener INSTANCE;
    private static boolean a;
    @NotNull
    private static final FrameGate A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private RenderListener() {
    }

    public final boolean getLoaded() {
        return a;
    }

    public final void setLoaded(boolean bl) {
        a = bl;
    }

    @Override
    public void init() {
        ChromaRenderer.init(RenderListener::init$lambda$0, RenderListener::init$lambda$1);
        this.registerShaderLibs();
        int n2 = D[0];
        n2 ^= D[1];
        int n3 = D[3];
        n3 -= D[4];
        int n4 = D[6];
        n4 += D[7];
        TextureLoader.INSTANCE.register((String)b[n2 ^= D[2]], (String)b[n3 ^= D[5]] + (String)b[n4 += D[8]]);
        int n5 = D[9];
        n5 -= D[10];
        n5 ^= D[11];
        int n6 = D[12];
        n6 += D[13];
        int n7 = D[15];
        n7 ^= D[16];
        int n8 = D[18];
        n8 ^= D[19];
        TextureLoader.INSTANCE.register((String)b[n5] + (String)b[n6 += D[14]], (String)b[n7 -= D[17]] + (String)b[n8 -= D[20]]);
    }

    public final void ensureLoaded() {
        long l2 = 878421547083319437L;
        if (a) {
            return;
        }
        int n2 = D[21];
        n2 -= D[22];
        SpreadBuilder spreadBuilder = new SpreadBuilder(n2 -= D[23]);
        spreadBuilder.add(RenderUtils.INSTANCE.getADVANCED_RECT());
        spreadBuilder.add(RenderUtils.INSTANCE.getKAWASE());
        Collection collection = Font.INSTANCE.getAll();
        long l3 = l2;
        int n3 = D[24];
        n3 -= D[25];
        l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= D[26]);
        Collection collection2 = collection;
        int n4 = D[27];
        n4 += D[28];
        spreadBuilder.addSpread(collection2.toArray(new E[n4 ^= D[29]]));
        LayerControl.INSTANCE.loadShaders((Renderable[])spreadBuilder.toArray(new Renderable[spreadBuilder.size()]));
        LayerControl.INSTANCE.loadRender();
        TextureLoader.INSTANCE.load();
        int n5 = D[30];
        n5 -= D[31];
        a = n5 -= D[32];
    }

    public final void hookRender(float partialTicks, ClientRenderPipeline ... pipelines) {
        CustomScreen customScreen;
        Object object;
        Object object2;
        long l2 = 6423330016683095189L;
        long l3 = -3176553510058277725L;
        long l4 = -4811113000573420357L;
        long l5 = -1039393039809458646L;
        long l6 = 1023097791689825917L;
        int n2 = D[33];
        n2 -= D[34];
        Intrinsics.checkNotNullParameter(pipelines, (String)b[n2 += D[35]]);
        this.ensureLoaded();
        if (kotakbaz.rain.client.extensions.b.getMc().player == null || kotakbaz.rain.client.extensions.b.getMc().world == null) {
            this.flushFramePipelines(Arrays.copyOf(pipelines, pipelines.length));
            return;
        }
        if (ArraysKt.contains(pipelines, ClientRenderPipeline.HUD_RECT)) {
            ModuleAspectRatio.INSTANCE.renderWorldIfNeeded();
            ModuleColorSaturation.INSTANCE.renderWorldIfNeeded();
        }
        int n3 = D[36];
        n3 -= D[37];
        long l7 = l5;
        int n4 = D[39];
        n4 ^= D[40];
        long l8 = l5 = l7 ^ ((long)InputListener.INSTANCE.mouseX() << (n3 ^= D[38]) ^ l7) & -1L << (n4 ^= D[41]);
        int n5 = D[42];
        n5 -= D[43];
        l5 = l8 ^ ((long)InputListener.INSTANCE.mouseY() ^ l8) & -1L >>> (n5 ^= D[44]);
        MatrixControl.INSTANCE.unscaledProjection();
        MatrixControl.INSTANCE.reset();
        GlStateManager._disableDepthTest();
        if (ArraysKt.contains(pipelines, ClientRenderPipeline.LOW)) {
            int n6 = D[45];
            n6 -= D[46];
            A.execute(n6 ^= D[47], RenderListener::hookRender$lambda$0);
        }
        ChromaRenderer.FramebufferState framebufferState = this.beginFramePipelines();
        if (ArraysKt.contains(pipelines, ClientRenderPipeline.HUD_RECT)) {
            WayPointManager.INSTANCE.renderHud(partialTicks);
        }
        if (ArraysKt.contains(pipelines, ClientRenderPipeline.HUD_RECT) && kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof ChatScreen) {
            Collection<c> collection = kotakbaz.rain.client.draggable.D.INSTANCE.getDraggables().values();
            int n7 = D[48];
            n7 -= D[49];
            int n8 = D[51];
            n8 += D[52];
            int n9 = D[54];
            n9 ^= D[55];
            Intrinsics.checkNotNullExpressionValue(collection, (String)b[n7 += D[50]] + (String)b[n8 -= D[53]] + (String)b[n9 -= D[56]]);
            object2 = collection;
            long l9 = l6;
            int n10 = D[57];
            n10 ^= D[58];
            l6 = l9 ^ (0L ^ l9) & -1L << (n10 ^= D[59]);
            object = object2.iterator();
            while (object.hasNext()) {
                customScreen = object.next();
                c c2 = (c)((Object)customScreen);
                long l10 = l6;
                int n11 = D[60];
                n11 += D[61];
                l6 = l10 ^ (0L ^ l10) & -1L >>> (n11 += D[62]);
                if (!c2.getModule().isEnabled()) continue;
                c2.onDraw();
            }
        }
        OverlayRenderEvent overlayRenderEvent = new OverlayRenderEvent();
        object = overlayRenderEvent;
        long l11 = l2;
        int n12 = D[63];
        n12 -= D[64];
        l2 = l11 ^ (0L ^ l11) & -1L << (n12 ^= D[65]);
        ((Event)object).put(OverlayRenderEvent.a.getPARTIAL_TICKS(), Float.valueOf(partialTicks));
        int n13 = D[66];
        n13 -= D[67];
        ((Event)object).put(OverlayRenderEvent.a.getMOUSE_X(), (int)(l5 >>> (n13 ^= D[68])));
        ((Event)object).put(OverlayRenderEvent.a.getMOUSE_Y(), (int)l5);
        object2 = overlayRenderEvent;
        EventManager.INSTANCE.post(object2);
        if (ArraysKt.contains(pipelines, ClientRenderPipeline.HUD_RECT)) {
            Draggable.INSTANCE.render();
        }
        CustomScreen customScreen2 = Rain.INSTANCE.getCustomScreen();
        if (customScreen2 != null) {
            customScreen = customScreen2;
            long l12 = l3;
            int n14 = D[69];
            n14 += D[70];
            l3 = l12 ^ (0L ^ l12) & -1L >>> (n14 += D[71]);
            int n15 = D[72];
            n15 -= D[73];
            customScreen.render((int)(l5 >>> (n15 -= D[74])), (int)l5, partialTicks);
            if (customScreen.shouldRemove()) {
                Rain.INSTANCE.setCustomScreen(null);
            }
        }
        LayerControl.INSTANCE.flushPipelines(Arrays.copyOf(pipelines, pipelines.length));
        this.endFramePipelines(framebufferState);
        MatrixControl.INSTANCE.scaledProjection();
    }

    private final void flushFramePipelines(ClientRenderPipeline ... pipelines) {
        MatrixControl.INSTANCE.unscaledProjection();
        MatrixControl.INSTANCE.reset();
        GlStateManager._disableDepthTest();
        ChromaRenderer.FramebufferState framebufferState = this.beginFramePipelines();
        LayerControl.INSTANCE.flushPipelines(Arrays.copyOf(pipelines, pipelines.length));
        this.endFramePipelines(framebufferState);
        MatrixControl.INSTANCE.scaledProjection();
    }

    private final ChromaRenderer.FramebufferState beginFramePipelines() {
        ChromaRenderer.FramebufferState framebufferState = ChromaRenderer.captureFramebufferState();
        ChromaRenderer.bindMainFramebuffer();
        ChromaRenderer.applyBlend(kotakbaz.rain.client.render.main.blend.a.F, a_0.E, kotakbaz.rain.client.render.main.blend.a.c, a_0.G);
        Intrinsics.checkNotNull(framebufferState);
        return framebufferState;
    }

    private final void endFramePipelines(ChromaRenderer.FramebufferState fbState) {
        ChromaRenderer.restoreFramebufferState(fbState);
    }

    private final void registerShaderLibs() {
        int n2 = D[75];
        n2 ^= D[76];
        kotakbaz.rain.client.render.main.compile.a_0[] a_0Array = new kotakbaz.rain.client.render.main.compile.a_0[n2 += D[77]];
        int n3 = D[78];
        n3 ^= D[79];
        int n4 = D[81];
        n4 ^= D[82];
        a_0Array[n3 ^= RenderListener.D[80]] = this.registerShaderLib((String)b[n4 ^= D[83]]);
        int n5 = D[84];
        n5 ^= D[85];
        int n6 = D[87];
        n6 ^= D[88];
        a_0Array[n5 ^= RenderListener.D[86]] = this.registerShaderLib((String)b[n6 -= D[89]]);
        int n7 = D[90];
        n7 += D[91];
        int n8 = D[93];
        n8 -= D[94];
        a_0Array[n7 += RenderListener.D[92]] = this.registerShaderLib((String)b[n8 += D[95]]);
        int n9 = D[96];
        n9 += D[97];
        int n10 = D[99];
        n10 += D[100];
        a_0Array[n9 += RenderListener.D[98]] = this.registerShaderLib((String)b[n10 ^= D[101]]);
        kotakbaz.rain.client.render.main.compile.b.registerShaderLibraries(a_0Array);
    }

    private final kotakbaz.rain.client.render.main.compile.a_0 registerShaderLib(String file) {
        int n2 = D[102];
        n2 -= D[103];
        String string = file;
        String string2 = Renderable.h.getSHADER_INCLUDE_PATH();
        int n3 = D[105];
        n3 ^= D[106];
        kotakbaz.rain.client.render.main.compile.a_0 a_02 = b_0.a.createShaderLibraryBuilder(new kotakbaz.rain.client.render.main.program.a[n2 += D[104]]).name(file).library(string2 + string + (String)b[n3 ^= D[107]]).build();
        int n4 = D[108];
        n4 -= D[109];
        Intrinsics.checkNotNullExpressionValue(a_02, (String)b[n4 -= D[110]]);
        return a_02;
    }

    private static final Integer init$lambda$0(GlGpuBuffer glGpuBuffer) {
        return glGpuBuffer.id;
    }

    private static final Integer init$lambda$1() {
        return kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaleFactor();
    }

    private static final Unit hookRender$lambda$0() {
        RenderUtils.INSTANCE.getKAWASE().applyBlur();
        return Unit.INSTANCE;
    }

    static {
        RenderListener.b();
        long l2 = -315061548728328458L;
        long l3 = -510931873813531150L;
        long l4 = -5416085446891689192L;
        long l5 = -7931197579346040742L;
        long l6 = -6358964383482100473L;
        long l7 = 7779752090326041973L;
        long l8 = -3522032053587881700L;
        long l9 = -1363688536794633710L;
        long l10 = 6883632304445291587L;
        long l11 = -8904327319313188891L;
        long l12 = 8394909642810436079L;
        long l13 = -7409097140021889378L;
        long l14 = -8295210717490672306L;
        long l15 = 1388183651696423478L;
        int n2 = D[111];
        n2 ^= D[112];
        b = new Object[n2 ^= D[113]];
        long l16 = l15;
        int n3 = D[114];
        n3 += D[115];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= D[116]);
        Object[] objectArray = new Object[D[117]];
        objectArray[RenderListener.D[118]] = B;
        objectArray[RenderListener.D[119]] = D[120];
        int n4 = D[121];
        Object object = RenderListener.A()[D[122]];
        if (object == null) {
            char[] cArray = "\u0aa9\u0a4c\u0ab7\u0ac6\u0a75\u0a7b\u0a81\u0a75\u0a4b\u0a6c\u0a9f\u0aa8\u0ac6\u0a81\u0a75\u0a52\u0aa4\u0a4c\u0a77\u0aa9\u0a80\u0a86\u0a7d\u0a52\u0aab\u0a50\u0ab0\u0a6a\u0a7f\u0a80\u0a7b\u0aaf\u0a80\u0a82\u0aa9\u0a4a\u0a51\u0ac6\u0a51\u0a6f\u0a85\u0a51\u0a52\u0a49\u0ac6\u0a70\u0a6c\u0a86\u0aa3\u0ab2\u0ac5\u0a49\u0a51\u0a85\u0a7e\u0ac6\u0a66\u0a81\u0a9b\u0a55\u0a57\u0a50\u0a88\u0a78\u0aaa\u0a9d\u0a55\u0a7c\u0a6f\u0a57\u0a85\u0aaf\u0a49\u0aaa\u0a78\u0a85\u0aac\u0ac5\u0a52\u0a75\u0a4c\u0a52\u0a70\u0a7c\u0aa3\u0a4b\u0a77\u0a56\u0a7f\u0a65\u0aa1\u0aaf\u0a77\u0a4f\u0a9c\u0bdd\u0a4b\u0a65\u0aa1\u0a4b\u0aab\u0a52\u0a6f\u0a69\u0a78\u0aab\u0a6b\u0a76\u0a57\u0a57\u0ab0\u0a4b\u0a7c\u0a4b\u0a81\u0aac\u0a58\u0aa3\u0a6c\u0aab\u0ac6\u0a80\u0a56\u0a49\u0a6a\u0ab7\u0aa4\u0a58\u0a51\u0a7e\u0aa2\u0a9b\u0aa2\u0a77\u0a6b\u0ab7\u0bdd\u0a7d\u0aaf\u0a6a\u0ac6\u0aaa\u0ab7\u0aab\u0a9e\u0a7d\u0aa1\u0bdd\u0a81\u0a81\u0ac5\u0a56\u0ab2\u0ab2\u0a71\u0a6f\u0ab2\u0a7b\u0a82\u0a70\u0a6c\u0a82\u0a81\u0a7e\u0a4b\u0aac\u0a84\u0a65\u0a86\u0a57\u0a52\u0a50\u0a7e\u0a77\u0ab0\u0a85\u0aa2\u0ac6\u0a56\u0a76\u0a55\u0a84\u0a85\u0a85\u0aa2\u0aa2\u0a84\u0a69\u0ab1\u0aaa\u0a9d\u0a4f\u0aa4\u0a9f\u0bdd\u0a76\u0aa8\u0a9b\u0a88\u0aa0\u0a4a\u0ab7\u0a6c\u0a6a\u0aa2\u0a58\u0a80\u0a4b\u0a75\u0a7b\u0aa4\u0a84\u0a88\u0a4c\u0a49\u0aaf\u0a4a\u0a77\u0a9e\u0ac5\u0a56\u0aa8\u0aa9\u0ab7\u0a55\u0a9c\u0a77\u0a4a\u0ab0\u0a83\u0aa7\u0ac6\u0a76\u0ab1\u0a56\u0a69\u0aa9\u0a6f\u0aac\u0a87\u0aa4\u0a6f\u0bdd\u0bdd\u0a6a\u0a49\u0aaa\u0a86\u0bdd\u0a4a\u0a56\u0a7e\u0a84\u0a78\u0a77\u0aab\u0aab\u0a78\u0aaa\u0aa8\u0a6a\u0aa0\u0a7e\u0a80\u0aa4\u0a86\u0bdd\u0a71\u0ac6\u0a70\u0a9e\u0a7e\u0a75\u0aa8\u0a6a\u0a6a\u0aa7\u0ac6\u0aac\u0a65\u0a9e\u0a76\u0a83\u0aa1\u0a83\u0aab\u0aa4\u0ab0\u0a87\u0a58\u0ab0\u0a6a\u0a80\u0a58\u0a4f\u0a58\u0a52\u0a81\u0a4b\u0ab3".toCharArray();
            for (int i2 = D[123]; i2 < D[124]; ++i2) {
                int n5 = cArray[i2];
                n5 -= D[125];
                n5 += D[126];
                n5 -= D[127];
                n5 ^= D[128];
                n5 += D[129];
                n5 -= D[130];
                n5 -= D[131];
                n5 -= D[132];
                n5 += D[133];
                n5 += D[134];
                n5 -= D[135];
                n5 ^= D[136];
                n5 ^= D[137];
                cArray[i2] = (char)(n5 += D[138]);
            }
            object = RenderListener.A()[RenderListener.D[139]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)RenderListener.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = D[140];
        n6 -= D[141];
        l6 = l17 ^ (0xC400000000L ^ l17) & -1L << (n6 += D[142]);
        long l18 = l13;
        int n7 = D[143];
        n7 -= D[144];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += D[145]);
        while (true) {
            int n8 = D[146];
            n8 += D[147];
            if ((int)l13 >= (int)(l6 >>> (n8 += D[148]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = D[149];
            n10 ^= D[150];
            int n11 = D[152];
            n11 ^= D[153];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= D[151])) & -1L >>> (n11 ^= D[154]);
            long l20 = l9;
            int n12 = D[155];
            n12 -= D[156];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= D[157]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = D[158];
            n14 ^= D[159];
            int n15 = D[161];
            n15 -= D[162];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= D[160])) & -1L >>> (n15 -= D[163]);
            int n16 = D[164];
            n16 += D[165];
            long l22 = l10;
            int n17 = D[167];
            n17 ^= D[168];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += D[166]) ^ l22) & -1L << (n17 -= D[169]);
            int n18 = D[170];
            n18 ^= D[171];
            n18 ^= D[172];
            int n19 = D[173];
            n19 += D[174];
            long l23 = l12;
            int n20 = D[176];
            n20 ^= D[177];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= D[175]))) ^ l23) & -1L >>> (n20 ^= D[178]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = D[179];
            n21 ^= D[180];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= D[181]);
            while (true) {
                int n22 = D[182];
                n22 += D[183];
                if ((int)(l14 >>> (n22 -= D[184])) >= (int)l12) break;
                int n23 = D[185];
                n23 -= D[186];
                int n24 = D[188];
                n24 += D[189];
                cArray2[(int)(l14 >>> (n23 ^= RenderListener.D[187]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= D[190]))];
                l14 += 0x100000000L;
            }
            int n25 = D[191];
            n25 -= D[192];
            int n26 = (int)(l15 >>> (n25 += D[193]));
            l15 += 0x100000000L;
            RenderListener.b[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = D[194];
            n27 ^= D[195];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= D[196]);
        }
        INSTANCE = new RenderListener();
        int n28 = D[197];
        n28 ^= D[198];
        A = new FrameGate(null, n28 += D[199], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[D[200]];
        String string = (String)object[D[201]];
        object = object[D[202]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[203]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[204]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[206] ^ D[207]];
                byArray[RenderListener.D[208] ^ RenderListener.D[209]] = D[210] ^ D[211];
                byArray[RenderListener.D[212] ^ RenderListener.D[213]] = D[214] ^ D[215];
                byArray[RenderListener.D[216] ^ RenderListener.D[217]] = D[218] ^ D[219];
                byArray[RenderListener.D[220] ^ RenderListener.D[221]] = D[222] ^ D[223];
                byArray[RenderListener.D[224] ^ RenderListener.D[225]] = D[226] ^ D[227];
                byArray[RenderListener.D[228] ^ RenderListener.D[229]] = D[230] ^ D[231];
                byArray[RenderListener.D[232] ^ RenderListener.D[233]] = D[234] ^ D[235];
                byArray[RenderListener.D[236] ^ RenderListener.D[237]] = D[238] ^ D[239];
                byArray[RenderListener.D[240] ^ RenderListener.D[241]] = D[242] ^ D[243];
                byArray[RenderListener.D[244] ^ RenderListener.D[245]] = D[246] ^ D[247];
                byArray[RenderListener.D[248] ^ RenderListener.D[249]] = D[250] ^ D[251];
                byArray[RenderListener.D[252] ^ RenderListener.D[253]] = D[254] ^ D[255];
                byArray[RenderListener.D[256] ^ RenderListener.D[257]] = D[258] ^ D[259];
                byArray[RenderListener.D[260] ^ RenderListener.D[261]] = D[262] ^ D[263];
                byArray[RenderListener.D[264] ^ RenderListener.D[265]] = D[266] ^ D[267];
                byArray[RenderListener.D[268] ^ RenderListener.D[269]] = D[270] ^ D[271];
                objectArray2[RenderListener.D[205]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[272]];
            if (c == null) {
                byte[] byArray2 = new byte[D[273] ^ D[274]];
                byArray2[RenderListener.D[275] ^ RenderListener.D[276]] = D[277] ^ D[278];
                byArray2[RenderListener.D[279] ^ RenderListener.D[280]] = D[281] ^ D[282];
                byArray2[RenderListener.D[283] ^ RenderListener.D[284]] = D[285] ^ D[286];
                byArray2[RenderListener.D[287] ^ RenderListener.D[288]] = D[289] ^ D[290];
                byArray2[RenderListener.D[291] ^ RenderListener.D[292]] = D[293] ^ D[294];
                byArray2[RenderListener.D[295] ^ RenderListener.D[296]] = D[297] ^ D[298];
                byArray2[RenderListener.D[299] ^ RenderListener.D[300]] = D[301] ^ D[302];
                byArray2[RenderListener.D[303] ^ RenderListener.D[304]] = D[305] ^ D[306];
                byArray2[RenderListener.D[307] ^ RenderListener.D[308]] = D[309] ^ D[310];
                byArray2[RenderListener.D[311] ^ RenderListener.D[312]] = D[313] ^ D[314];
                byArray2[RenderListener.D[315] ^ RenderListener.D[316]] = D[317] ^ D[318];
                byArray2[RenderListener.D[319] ^ RenderListener.D[320]] = D[321] ^ D[322];
                byArray2[RenderListener.D[323] ^ RenderListener.D[324]] = D[325] ^ D[326];
                byArray2[RenderListener.D[327] ^ RenderListener.D[328]] = D[329] ^ D[330];
                byArray2[RenderListener.D[331] ^ RenderListener.D[332]] = D[333] ^ D[334];
                byArray2[RenderListener.D[335] ^ RenderListener.D[336]] = D[337] ^ D[338];
                byArray2[RenderListener.D[339] ^ RenderListener.D[340]] = D[341] ^ D[342];
                byArray2[RenderListener.D[343] ^ RenderListener.D[344]] = D[345] ^ D[346];
                byArray2[RenderListener.D[347] ^ RenderListener.D[348]] = D[349] ^ D[350];
                byArray2[RenderListener.D[351] ^ RenderListener.D[352]] = D[353] ^ D[354];
                byArray2[RenderListener.D[355] ^ RenderListener.D[356]] = D[357] ^ D[358];
                byArray2[RenderListener.D[359] ^ RenderListener.D[360]] = D[361] ^ D[362];
                byArray2[RenderListener.D[363] ^ RenderListener.D[364]] = D[365] ^ D[366];
                byArray2[RenderListener.D[367] ^ RenderListener.D[368]] = D[369] ^ D[370];
                byArray2[RenderListener.D[371] ^ RenderListener.D[372]] = D[373] ^ D[374];
                byArray2[RenderListener.D[375] ^ RenderListener.D[376]] = D[377] ^ D[378];
                byArray2[RenderListener.D[379] ^ RenderListener.D[380]] = D[381] ^ D[382];
                byArray2[RenderListener.D[383] ^ RenderListener.D[384]] = D[385] ^ D[386];
                byArray2[RenderListener.D[387] ^ RenderListener.D[388]] = D[389] ^ D[390];
                byArray2[RenderListener.D[391] ^ RenderListener.D[392]] = D[393] ^ D[394];
                byArray2[RenderListener.D[395] ^ RenderListener.D[396]] = D[397] ^ D[398];
                byArray2[RenderListener.D[399] ^ 0xE14F] = 0xE104 ^ 0xE14F;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = RenderListener.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u805d\u80af\u8048\u80b1\u8043\u83bf\u8074\u8066\u8041\u8065\u8045\u807a\u804e\u8050\u80a0\u8045\u80ae\u83be".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0x2620;
                        n3 -= 6592;
                        n3 += 64241;
                        n3 -= 53827;
                        n3 ^= 0xE073;
                        n3 -= 30356;
                        n3 -= 57513;
                        n3 -= 6379;
                        n3 ^= 0x960B;
                        n3 -= 7883;
                        n3 += 8991;
                        cArray[i2] = (char)(n3 -= 30463);
                    }
                    object4 = RenderListener.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = -53;
                byArray4[14] = 53;
                byArray4[2] = -102;
                byArray4[10] = 40;
                byArray4[0] = -2;
                byArray4[4] = -84;
                byArray4[15] = -20;
                byArray4[11] = 30;
                byArray4[1] = -65;
                byArray4[8] = -39;
                byArray4[9] = -28;
                byArray4[5] = 77;
                byArray4[13] = -54;
                byArray4[6] = 66;
                byArray4[7] = 38;
                byArray4[3] = -70;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 21, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = RenderListener.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u15ff\u15fb\u1549".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 44976;
                        n4 -= 15025;
                        n4 -= 12385;
                        n4 -= 57186;
                        n4 ^= 0x5EA3;
                        n4 -= 4339;
                        n4 -= 57482;
                        n4 += 14046;
                        n4 -= 65454;
                        n4 ^= 0x3CEE;
                        n4 += 10894;
                        cArray[i3] = (char)(n4 += 7662);
                    }
                    object5 = RenderListener.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = RenderListener.A()[3];
            if (object6 == null) {
                char[] cArray = "\uf2d4\uf2d8\uf302\uf2de\uf2d2\uf2d3\uf2d2\uf2de\uf305\uf2fa\uf2d2\uf302\uf2e8\uf305\uf2f4\uf2f9\uf2f9\uf31c\uf31f\uf2f6".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 17376;
                    n5 += 13572;
                    n5 += 64453;
                    n5 += 20134;
                    n5 += 39911;
                    n5 ^= 0x4CD9;
                    n5 ^= 0x3B4A;
                    n5 += 65402;
                    n5 -= 57274;
                    n5 -= 39611;
                    cArray[i4] = (char)(n5 -= 43613);
                }
                object6 = RenderListener.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)c), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = d;
        if (d == null) {
            d = new Object[4];
            objectArray = d;
        }
        return objectArray;
    }

    public static void b() {
        D = new int[0x10C44 ^ 0x10DD4];
        RenderListener.D[0x103BE ^ 0x103E3] = 0xFFFEFC70 ^ 0x103E3;
        RenderListener.D[0x40E6 ^ 0x40C8] = 0x4094 ^ 0x40C8;
        RenderListener.D[0x5988 ^ 0x58E0] = 0xC917 ^ 0x58E0;
        RenderListener.D[0x8B68 ^ 0x8BA2] = 0x8BA2 ^ 0x8BA2;
        RenderListener.D[0xAF91 ^ 0xAF59] = 0xAF58 ^ 0xAF59;
        RenderListener.D[0x83CE ^ 0x83D3] = 0x83E8 ^ 0x83D3;
        RenderListener.D[0xC8DE ^ 0xC8A0] = 0x4089 ^ 0xC8A0;
        RenderListener.D[0xD3D3 ^ 0xD3D1] = 0xFFFF2C47 ^ 0xD3D1;
        RenderListener.D[0x80CA ^ 0x802D] = 0x3E0E ^ 0x802D;
        RenderListener.D[0x7A04 ^ 0x7B6F] = 0x18B4 ^ 0x7B6F;
        RenderListener.D[0x287C ^ 0x2834] = 0xFFFFD7DB ^ 0x2834;
        RenderListener.D[0x7702 ^ 0x768C] = 0x4315 ^ 0x768C;
        RenderListener.D[0xB40E ^ 0xB51E] = 0xB51E ^ 0xB51E;
        RenderListener.D[0x9E3D ^ 0x9E3C] = 0x9E58 ^ 0x9E3C;
        RenderListener.D[0xDA5 ^ 0xC9B] = 0x10E4F ^ 0xC9B;
        RenderListener.D[0xF257 ^ 0xF25B] = 0xFFFF0D1C ^ 0xF25B;
        RenderListener.D[0x58EB ^ 0x5809] = 0xFFFF3753 ^ 0x5809;
        RenderListener.D[0x1501 ^ 0x1488] = 0xFFFF6DB2 ^ 0x1488;
        RenderListener.D[0x105B2 ^ 0x105A3] = 0xFFFEFA17 ^ 0x105A3;
        RenderListener.D[0x8342 ^ 0x837B] = 0x8325 ^ 0x837B;
        RenderListener.D[0xEBFA ^ 0xEBF0] = 0xEB9B ^ 0xEBF0;
        RenderListener.D[0xB487 ^ 0xB44E] = 0xB44C ^ 0xB44E;
        RenderListener.D[0xEDD5 ^ 0xECB8] = 0xFFFF70B8 ^ 0xECB8;
        RenderListener.D[0xAB29 ^ 0xABBD] = 0xFFFF545C ^ 0xABBD;
        RenderListener.D[0xF56E ^ 0xF51E] = 0xFFFF0AD1 ^ 0xF51E;
        RenderListener.D[0x1527 ^ 0x159F] = 0x1595 ^ 0x159F;
        RenderListener.D[0xD1C4 ^ 0xD145] = 0xCC8 ^ 0xD145;
        RenderListener.D[0xF6BE ^ 0xF796] = 0x9142 ^ 0xF796;
        RenderListener.D[0x6439 ^ 0x645D] = 0x6437 ^ 0x645D;
        RenderListener.D[0x6D24 ^ 0x6C7A] = 0x707D ^ 0x6C7A;
        RenderListener.D[0x57E2 ^ 0x56C2] = 0x28AC ^ 0x56C2;
        RenderListener.D[0xD784 ^ 0xD6A5] = 0xFFFF5763 ^ 0xD6A5;
        RenderListener.D[0x6FB0 ^ 0x6ECF] = 0x99EF ^ 0x6ECF;
        RenderListener.D[0x79AB ^ 0x798A] = 0xFFFF86E4 ^ 0x798A;
        RenderListener.D[0xE10 ^ 0xF5E] = 0xC35E ^ 0xF5E;
        RenderListener.D[0xDA9E ^ 0xDAAF] = 0xFFFF2530 ^ 0xDAAF;
        RenderListener.D[0x12F9 ^ 0x13B6] = 0x384C ^ 0x13B6;
        RenderListener.D[0xA54E ^ 0xA4C8] = 0x13A6 ^ 0xA4C8;
        RenderListener.D[0x5FB7 ^ 0x5F7A] = 0x5F7A ^ 0x5F7A;
        RenderListener.D[0x67D8 ^ 0x6689] = 0x4D6F ^ 0x6689;
        RenderListener.D[0xF5D8 ^ 0xF523] = 0x2F62 ^ 0xF523;
        RenderListener.D[0xD289 ^ 0xD3F5] = 0x65F6 ^ 0xD3F5;
        RenderListener.D[0xB559 ^ 0xB515] = 0xB570 ^ 0xB515;
        RenderListener.D[0x8B5B ^ 0x8BB7] = 0x5EF7 ^ 0x8BB7;
        RenderListener.D[0x101EF ^ 0x1009A] = 0xFFFE8399 ^ 0x1009A;
        RenderListener.D[0xD70F ^ 0xD706] = 0xD710 ^ 0xD706;
        RenderListener.D[0x87EC ^ 0x8759] = 0x876D ^ 0x8759;
        RenderListener.D[0x448C ^ 0x446D] = 0xD4DF ^ 0x446D;
        RenderListener.D[0x106E9 ^ 0x107EC] = 0x13CCC ^ 0x107EC;
        RenderListener.D[0x746D ^ 0x75ED] = 0x82D2 ^ 0x75ED;
        RenderListener.D[0xD425 ^ 0xD4AE] = 0xD4AE ^ 0xD4AE;
        RenderListener.D[0x3A02 ^ 0x3B21] = 0xFBF2 ^ 0x3B21;
        RenderListener.D[0xE73C ^ 0xE7EA] = 0x1238 ^ 0xE7EA;
        RenderListener.D[0x41A2 ^ 0x40BB] = 0x14910 ^ 0x40BB;
        RenderListener.D[0xD732 ^ 0xD735] = 0xFFFF28ED ^ 0xD735;
        RenderListener.D[0x7B92 ^ 0x7BE4] = 0x7BE4 ^ 0x7BE4;
        RenderListener.D[0x77E9 ^ 0x76D1] = 0x3538 ^ 0x76D1;
        RenderListener.D[0x1CA ^ 0x1F6] = 0xFFFFFE83 ^ 0x1F6;
        RenderListener.D[0xC9E5 ^ 0xC8E2] = 0xF3C2 ^ 0xC8E2;
        RenderListener.D[0x10F25 ^ 0x10E76] = 0x187FB ^ 0x10E76;
        RenderListener.D[0xD953 ^ 0xD855] = 0xE372 ^ 0xD855;
        RenderListener.D[0x10080 ^ 0x10027] = 0x10035 ^ 0x10027;
        RenderListener.D[0xCEB3 ^ 0xCEF2] = 0xCEFD ^ 0xCEF2;
        RenderListener.D[0x2186 ^ 0x20CF] = 0xFFFF0400 ^ 0x20CF;
        RenderListener.D[0x5FBF ^ 0x5FFB] = 0xFFFFA01B ^ 0x5FFB;
        RenderListener.D[0xD9E6 ^ 0xD863] = 0x6F41 ^ 0xD863;
        RenderListener.D[0xCF2D ^ 0xCE4F] = 0x46AD ^ 0xCE4F;
        RenderListener.D[0xEDA8 ^ 0xED26] = 0xED3F ^ 0xED26;
        RenderListener.D[0x290F ^ 0x29DD] = 0xC978 ^ 0x29DD;
        RenderListener.D[0xFDDC ^ 0xFC97] = 0x3099 ^ 0xFC97;
        RenderListener.D[0xB251 ^ 0xB24D] = 0xFFFF4DDA ^ 0xB24D;
        RenderListener.D[0x2106 ^ 0x213E] = 0x2150 ^ 0x213E;
        RenderListener.D[0x976E ^ 0x9635] = 0x8A28 ^ 0x9635;
        RenderListener.D[0xE192 ^ 0xE0F1] = 0xC93A ^ 0xE0F1;
        RenderListener.D[0xF651 ^ 0xF6E0] = 0xF6F1 ^ 0xF6E0;
        RenderListener.D[0xBBF9 ^ 0xBB2E] = 0x4EE7 ^ 0xBB2E;
        RenderListener.D[0x9EAC ^ 0x9F86] = 0xF952 ^ 0x9F86;
        RenderListener.D[0x276 ^ 0x313] = 0xFFFFD52C ^ 0x313;
        RenderListener.D[0x999C ^ 0x99FC] = 0xFFFF662C ^ 0x99FC;
        RenderListener.D[0xA5F1 ^ 0xA5D2] = 0xA5A5 ^ 0xA5D2;
        RenderListener.D[0xB112 ^ 0xB1D7] = 0xFFFF4E7C ^ 0xB1D7;
        RenderListener.D[0x6F1E ^ 0x6E00] = 0x7A15 ^ 0x6E00;
        RenderListener.D[0x5EE6 ^ 0x5E88] = 0xFFFFA158 ^ 0x5E88;
        RenderListener.D[0xBCC6 ^ 0xBDC5] = 0x1B9CC ^ 0xBDC5;
        RenderListener.D[0x7FCC ^ 0x7FCC] = 0xFFFF803B ^ 0x7FCC;
        RenderListener.D[0xAB45 ^ 0xAB6C] = 0xAB70 ^ 0xAB6C;
        RenderListener.D[0x2EAF ^ 0x2F80] = 0x7BBD ^ 0x2F80;
        RenderListener.D[0x73EF ^ 0x7353] = 0x738B ^ 0x7353;
        RenderListener.D[0x3B17 ^ 0x3A3C] = 0xE3B1 ^ 0x3A3C;
        RenderListener.D[0x939B ^ 0x92FD] = 0xBB23 ^ 0x92FD;
        RenderListener.D[0xC015 ^ 0xC197] = 0x36A8 ^ 0xC197;
        RenderListener.D[0xCA9B ^ 0xCA57] = 0xCA56 ^ 0xCA57;
        RenderListener.D[0x1D74 ^ 0x1D28] = 0x1D27 ^ 0x1D28;
        RenderListener.D[0x4C7F ^ 0x4CBB] = 0xFFFFB36D ^ 0x4CBB;
        RenderListener.D[0x4886 ^ 0x4800] = 0xE171 ^ 0x4800;
        RenderListener.D[0x2A06 ^ 0x2A53] = 0x2A60 ^ 0x2A53;
        RenderListener.D[0xD02E ^ 0xD082] = 0xD0C5 ^ 0xD082;
        RenderListener.D[0x58BF ^ 0x59EA] = 0xD05B ^ 0x59EA;
        RenderListener.D[0x9F7A ^ 0x9F07] = 0x93C1 ^ 0x9F07;
        RenderListener.D[0xB9FC ^ 0xB8AC] = 0x9352 ^ 0xB8AC;
        RenderListener.D[0x41D0 ^ 0x4093] = 0x2871 ^ 0x4093;
        RenderListener.D[0x5E67 ^ 0x5EE4] = 0xE2AB ^ 0x5EE4;
        RenderListener.D[0x3630 ^ 0x376F] = 0xBF86 ^ 0x376F;
        RenderListener.D[0xDA4 ^ 0xDEF] = 0xFFFFF27C ^ 0xDEF;
        RenderListener.D[0x5CF5 ^ 0x5C89] = 0x5DA5 ^ 0x5C89;
        RenderListener.D[0x1AA8 ^ 0x1A34] = 0x1A39 ^ 0x1A34;
        RenderListener.D[0xD028 ^ 0xD00C] = 0xD02C ^ 0xD00C;
        RenderListener.D[0x2E9C ^ 0x2FEC] = 0x87C9 ^ 0x2FEC;
        RenderListener.D[0x75CE ^ 0x7446] = 0xF2BA ^ 0x7446;
        RenderListener.D[0x29D7 ^ 0x294C] = 0x2907 ^ 0x294C;
        RenderListener.D[0x5C34 ^ 0x5CD4] = 0xCC6E ^ 0x5CD4;
        RenderListener.D[0xFDA7 ^ 0xFD9A] = 0xFDFA ^ 0xFD9A;
        RenderListener.D[0xE0B0 ^ 0xE0AE] = 0xFFFF1F65 ^ 0xE0AE;
        RenderListener.D[0x8DD0 ^ 0x8D2F] = 0x2566 ^ 0x8D2F;
        RenderListener.D[0x40D9 ^ 0x40BC] = 0x4097 ^ 0x40BC;
        RenderListener.D[0x6EBD ^ 0x6E37] = 0xAA48 ^ 0x6E37;
        RenderListener.D[0xE3F1 ^ 0xE31E] = 0x3650 ^ 0xE31E;
        RenderListener.D[0xC998 ^ 0xC90B] = 0xFFFF3695 ^ 0xC90B;
        RenderListener.D[0xD7A8 ^ 0xD7F6] = 0xFFFF285D ^ 0xD7F6;
        RenderListener.D[0x10789 ^ 0x10732] = 0x10749 ^ 0x10732;
        RenderListener.D[0x18E6 ^ 0x19B2] = 0x902B ^ 0x19B2;
        RenderListener.D[0xC939 ^ 0xC9BB] = 0x56B4 ^ 0xC9BB;
        RenderListener.D[0x76EA ^ 0x77F6] = 0x63E3 ^ 0x77F6;
        RenderListener.D[0xFF47 ^ 0xFE0B] = 0x320B ^ 0xFE0B;
        RenderListener.D[0x1BCB ^ 0x1B04] = 0xD069 ^ 0x1B04;
        RenderListener.D[0xA5E2 ^ 0xA562] = 0xAA0F ^ 0xA562;
        RenderListener.D[0x325A ^ 0x3232] = 0xFFFFCDCA ^ 0x3232;
        RenderListener.D[0x86FD ^ 0x86AB] = 0xFFFF790E ^ 0x86AB;
        RenderListener.D[0x51AE ^ 0x5160] = 0x9A1D ^ 0x5160;
        RenderListener.D[0x9F0F ^ 0x9E68] = 0xF93 ^ 0x9E68;
        RenderListener.D[0x9EB8 ^ 0x9ED1] = 0x9EC8 ^ 0x9ED1;
        RenderListener.D[0xCC4F ^ 0xCC0D] = 0xCC0C ^ 0xCC0D;
        RenderListener.D[0xD4C8 ^ 0xD582] = 0xEF0 ^ 0xD582;
        RenderListener.D[0x1D0B ^ 0x1DDF] = 0xE813 ^ 0x1DDF;
        RenderListener.D[0x6579 ^ 0x6521] = 0xFFFF9AD6 ^ 0x6521;
        RenderListener.D[0x4D22 ^ 0x4C13] = 0xFFFFE79D ^ 0x4C13;
        RenderListener.D[0x6EE7 ^ 0x6FF6] = 0xF628 ^ 0x6FF6;
        RenderListener.D[0xF0D5 ^ 0xF1D8] = 0x4823 ^ 0xF1D8;
        RenderListener.D[0xD6FC ^ 0xD7FD] = 0x1D3F4 ^ 0xD7FD;
        RenderListener.D[0x10E4 ^ 0x1069] = 0x100E ^ 0x1069;
        RenderListener.D[0x5897 ^ 0x5993] = 0x62BE ^ 0x5993;
        RenderListener.D[0xE439 ^ 0xE51D] = 0x25C1 ^ 0xE51D;
        RenderListener.D[0xACF ^ 0xA3C] = 0x4741 ^ 0xA3C;
        RenderListener.D[0x7E1 ^ 0x6DA] = 0x10415 ^ 0x6DA;
        RenderListener.D[0x9141 ^ 0x919A] = 0xADFD ^ 0x919A;
        RenderListener.D[0xD9C1 ^ 0xD89C] = 0xFFFF3B00 ^ 0xD89C;
        RenderListener.D[0x10A7D ^ 0x10B2F] = 0x120D1 ^ 0x10B2F;
        RenderListener.D[0x3D66 ^ 0x3DA7] = 0x3DCE ^ 0x3DA7;
        RenderListener.D[0x2E85 ^ 0x2E71] = 0xAD99 ^ 0x2E71;
        RenderListener.D[0x3CCF ^ 0x3CDB] = 0x3CF2 ^ 0x3CDB;
        RenderListener.D[0xD01F ^ 0xD0A8] = 0xD0EA ^ 0xD0A8;
        RenderListener.D[0xBD56 ^ 0xBD79] = 0xBD14 ^ 0xBD79;
        RenderListener.D[0xD51B ^ 0xD5EA] = 0x9897 ^ 0xD5EA;
        RenderListener.D[0x3E9D ^ 0x3E87] = 0x3E9E ^ 0x3E87;
        RenderListener.D[0x301D ^ 0x30EB] = 0xFFFF4CDF ^ 0x30EB;
        RenderListener.D[0x9669 ^ 0x9610] = 0x9612 ^ 0x9610;
        RenderListener.D[0x777E ^ 0x77D8] = 0xFFFF886C ^ 0x77D8;
        RenderListener.D[0xC338 ^ 0xC3A7] = 0xC3E3 ^ 0xC3A7;
        RenderListener.D[0x319C ^ 0x30F0] = 0x532D ^ 0x30F0;
        RenderListener.D[0xB180 ^ 0xB185] = 0xFFFF4E73 ^ 0xB185;
        RenderListener.D[0x513B ^ 0x5150] = 0xFFFFAE90 ^ 0x5150;
        RenderListener.D[0xA72 ^ 0xA7F] = 0xA15 ^ 0xA7F;
        RenderListener.D[0x39DA ^ 0x39C9] = 0x39EF ^ 0x39C9;
        RenderListener.D[0xCC1E ^ 0xCC5E] = 0xCC66 ^ 0xCC5E;
        RenderListener.D[0xA61 ^ 0xA62] = 0xFFFFF5EF ^ 0xA62;
        RenderListener.D[0x2628 ^ 0x274C] = 0xE92 ^ 0x274C;
        RenderListener.D[0x10401 ^ 0x1053C] = 0xFFFFF80C ^ 0x1053C;
        RenderListener.D[0x4044 ^ 0x40AE] = 0xFFFF10F6 ^ 0x40AE;
        RenderListener.D[0x8E39 ^ 0x8F4D] = 0xF3AA ^ 0x8F4D;
        RenderListener.D[0xDEC4 ^ 0xDFD7] = 0xB7A0 ^ 0xDFD7;
        RenderListener.D[0x8476 ^ 0x84CB] = 0xFFFF7B4D ^ 0x84CB;
        RenderListener.D[0x9D9A ^ 0x9D7F] = 0x235C ^ 0x9D7F;
        RenderListener.D[0x10D7E ^ 0x10D82] = 0x1A5CB ^ 0x10D82;
        RenderListener.D[0x4D1C ^ 0x4D23] = 0x4D44 ^ 0x4D23;
        RenderListener.D[0x398A ^ 0x3984] = 0x39CB ^ 0x3984;
        RenderListener.D[0x997E ^ 0x99DC] = 0x99EA ^ 0x99DC;
        RenderListener.D[0x572C ^ 0x5783] = 0xFFFFA820 ^ 0x5783;
        RenderListener.D[0x1338 ^ 0x1225] = 0x607 ^ 0x1225;
        RenderListener.D[0xD4FD ^ 0xD4BE] = 0xD4FF ^ 0xD4BE;
        RenderListener.D[0xFF8A ^ 0xFF30] = 0xFF63 ^ 0xFF30;
        RenderListener.D[0x138 ^ 0x4F] = 0xB976 ^ 0x4F;
        RenderListener.D[0xA54E ^ 0xA519] = 0xFFFF5A96 ^ 0xA519;
        RenderListener.D[0x23FA ^ 0x2313] = 0x8CC5 ^ 0x2313;
        RenderListener.D[0x7D0B ^ 0x7D10] = 0x7DB4 ^ 0x7D10;
        RenderListener.D[0x4B15 ^ 0x4B6A] = 0xC4C6 ^ 0x4B6A;
        RenderListener.D[0x36B5 ^ 0x36EE] = 0x36FD ^ 0x36EE;
        RenderListener.D[0x3A89 ^ 0x3A0E] = 0xABD ^ 0x3A0E;
        RenderListener.D[0x2A2C ^ 0x2A82] = 0xFFFFD559 ^ 0x2A82;
        RenderListener.D[0x85DA ^ 0x85AB] = 0xFFFF7A46 ^ 0x85AB;
        RenderListener.D[0x979A ^ 0x968F] = 0xFE8A ^ 0x968F;
        RenderListener.D[0xF79A ^ 0xF7EE] = 0xF79C ^ 0xF7EE;
        RenderListener.D[0xB68F ^ 0xB6B1] = 0xB6FA ^ 0xB6B1;
        RenderListener.D[0xED98 ^ 0xED28] = 0xFFFF12DC ^ 0xED28;
        RenderListener.D[0x1514 ^ 0x15B5] = 0x159C ^ 0x15B5;
        RenderListener.D[0xC5BD ^ 0xC5F4] = 0xFFFF3A44 ^ 0xC5F4;
        RenderListener.D[0xF11E ^ 0xF1B6] = 0xFFFF0E61 ^ 0xF1B6;
        RenderListener.D[0xBFF8 ^ 0xBECB] = 0x7737 ^ 0xBECB;
        RenderListener.D[0x80A5 ^ 0x8079] = 0x90E2 ^ 0x8079;
        RenderListener.D[0xB5BF ^ 0xB5C4] = 0xB5C4 ^ 0xB5C4;
        RenderListener.D[0x10461 ^ 0x104F7] = 0x104CD ^ 0x104F7;
        RenderListener.D[0x700 ^ 0x785] = 0x6CF4 ^ 0x785;
        RenderListener.D[0xC8D8 ^ 0xC9ED] = 0x5E ^ 0xC9ED;
        RenderListener.D[0xD91A ^ 0xD955] = 0xD977 ^ 0xD955;
        RenderListener.D[0x785E ^ 0x7872] = 0x781D ^ 0x7872;
        RenderListener.D[0xBB98 ^ 0xBB45] = 0xABD9 ^ 0xBB45;
        RenderListener.D[0xE530 ^ 0xE5F3] = 0xFFFF1A08 ^ 0xE5F3;
        RenderListener.D[0x10D2E ^ 0x10D31] = 0xFFFEF2C8 ^ 0x10D31;
        RenderListener.D[0xB7E ^ 0xA14] = 0x9BE3 ^ 0xA14;
        RenderListener.D[0xF5E7 ^ 0xF5D7] = 0xFFFF0A82 ^ 0xF5D7;
        RenderListener.D[0xD8B6 ^ 0xD8DB] = 0xD8E8 ^ 0xD8DB;
        RenderListener.D[0x333 ^ 0x227] = 0x6A47 ^ 0x227;
        RenderListener.D[0x5E8 ^ 0x5BA] = 0xFFFFFA23 ^ 0x5BA;
        RenderListener.D[0x4AAB ^ 0x4AF1] = 0xFFFFB511 ^ 0x4AF1;
        RenderListener.D[0x3FA3 ^ 0x3F95] = 0xFFFFC00B ^ 0x3F95;
        RenderListener.D[0x3543 ^ 0x3574] = 0xFFFFCA91 ^ 0x3574;
        RenderListener.D[0xC0A6 ^ 0xC075] = 0x20E1 ^ 0xC075;
        RenderListener.D[0xDE76 ^ 0xDE04] = 0xDE34 ^ 0xDE04;
        RenderListener.D[0x8A86 ^ 0x8A1E] = 0xFFFF75C4 ^ 0x8A1E;
        RenderListener.D[0xAB71 ^ 0xAA63] = 0x339D ^ 0xAA63;
        RenderListener.D[0x9FD3 ^ 0x9F37] = 0x211F ^ 0x9F37;
        RenderListener.D[0x5D2F ^ 0x5DE4] = 0x5DE5 ^ 0x5DE4;
        RenderListener.D[0x7492 ^ 0x742D] = 0xFFFF8BD0 ^ 0x742D;
        RenderListener.D[0xC837 ^ 0xC81A] = 0xC8D5 ^ 0xC81A;
        RenderListener.D[0xBA60 ^ 0xBA66] = 0xBA7D ^ 0xBA66;
        RenderListener.D[0xABBF ^ 0xAAB6] = 0x7DF0 ^ 0xAAB6;
        RenderListener.D[0x9A1B ^ 0x9AF5] = 0xFFFFB036 ^ 0x9AF5;
        RenderListener.D[0xD1A8 ^ 0xD127] = 0xD174 ^ 0xD127;
        RenderListener.D[0x10988 ^ 0x10951] = 0x13536 ^ 0x10951;
        RenderListener.D[0xE348 ^ 0xE3FE] = 0xFFFF1C16 ^ 0xE3FE;
        RenderListener.D[0x3220 ^ 0x3341] = 0xBBDA ^ 0x3341;
        RenderListener.D[0xE6C4 ^ 0xE660] = 0xE674 ^ 0xE660;
        RenderListener.D[0x67AD ^ 0x6621] = 0x53B8 ^ 0x6621;
        RenderListener.D[0xABE6 ^ 0xAAD6] = 0xFEEE ^ 0xAAD6;
        RenderListener.D[0x3D47 ^ 0x3D92] = 0xC85B ^ 0x3D92;
        RenderListener.D[0x79A9 ^ 0x796B] = 0x7966 ^ 0x796B;
        RenderListener.D[0xA3FA ^ 0xA320] = 0x9F1E ^ 0xA320;
        RenderListener.D[0xE774 ^ 0xE7FD] = 0x9243 ^ 0xE7FD;
        RenderListener.D[0xB2EB ^ 0xB38B] = 0x3B69 ^ 0xB38B;
        RenderListener.D[0x5404 ^ 0x553D] = 0x16F7 ^ 0x553D;
        RenderListener.D[0x19CA ^ 0x1933] = 0xC372 ^ 0x1933;
        RenderListener.D[0xDBE ^ 0xDE1] = 0xDFF ^ 0xDE1;
        RenderListener.D[0xC0AD ^ 0xC004] = 0xFFFF3FA1 ^ 0xC004;
        RenderListener.D[0x7EE5 ^ 0x7E6D] = 0xCB78 ^ 0x7E6D;
        RenderListener.D[0xA86D ^ 0xA914] = 0xFFFFEF9E ^ 0xA914;
        RenderListener.D[0xC24 ^ 0xC57] = 0xC35 ^ 0xC57;
        RenderListener.D[0xF198 ^ 0xF1AA] = 0xF1FF ^ 0xF1AA;
        RenderListener.D[0x114B ^ 0x1161] = 0xFFFFEE98 ^ 0x1161;
        RenderListener.D[0xEDF2 ^ 0xECB6] = 0x844D ^ 0xECB6;
        RenderListener.D[0x50AF ^ 0x50CE] = 0x50EF ^ 0x50CE;
        RenderListener.D[0xFE3F ^ 0xFE5C] = 0xFFFF019E ^ 0xFE5C;
        RenderListener.D[0x4185 ^ 0x41B1] = 0x41A5 ^ 0x41B1;
        RenderListener.D[0x61D4 ^ 0x6146] = 0x61E7 ^ 0x6146;
        RenderListener.D[0x1B96 ^ 0x1B4E] = 0x272A ^ 0x1B4E;
        RenderListener.D[0x4304 ^ 0x4285] = 0xB580 ^ 0x4285;
        RenderListener.D[0x51E7 ^ 0x50C5] = 0x2EAB ^ 0x50C5;
        RenderListener.D[0xD267 ^ 0xD2F7] = 0xD2EF ^ 0xD2F7;
        RenderListener.D[0x9E1E ^ 0x9EFD] = 0xE4F ^ 0x9EFD;
        RenderListener.D[0x49D2 ^ 0x48E0] = 0x1CD8 ^ 0x48E0;
        RenderListener.D[0x100B6 ^ 0x101F1] = 0x1DA84 ^ 0x101F1;
        RenderListener.D[0xFD89 ^ 0xFD4F] = 0xFD3F ^ 0xFD4F;
        RenderListener.D[0xD3AA ^ 0xD28D] = 0xB459 ^ 0xD28D;
        RenderListener.D[0xE4BF ^ 0xE49F] = 0xFFFF1B4E ^ 0xE49F;
        RenderListener.D[0x586D ^ 0x593B] = 0xD0A2 ^ 0x593B;
        RenderListener.D[0x9849 ^ 0x9846] = 0xFFFF67E7 ^ 0x9846;
        RenderListener.D[0xFA13 ^ 0xFA75] = 0xFA4D ^ 0xFA75;
        RenderListener.D[0xA64A ^ 0xA748] = 0x1A355 ^ 0xA748;
        RenderListener.D[0x10F46 ^ 0x10E46] = 0xA4B ^ 0x10E46;
        RenderListener.D[0xA82F ^ 0xA925] = 0x7E16 ^ 0xA925;
        RenderListener.D[0x85B ^ 0x8E5] = 0x89B ^ 0x8E5;
        RenderListener.D[0x4126 ^ 0x4104] = 0xFFFFBEDD ^ 0x4104;
        RenderListener.D[0x8207 ^ 0x82D7] = 0x6245 ^ 0x82D7;
        RenderListener.D[0x1498 ^ 0x14C8] = 0x14FB ^ 0x14C8;
        RenderListener.D[0xC709 ^ 0xC620] = 0xA0C5 ^ 0xC620;
        RenderListener.D[0x3397 ^ 0x3280] = 0x13B39 ^ 0x3280;
        RenderListener.D[0xABFE ^ 0xAAF0] = 0x1312 ^ 0xAAF0;
        RenderListener.D[0x9955 ^ 0x98D8] = 0xAD7E ^ 0x98D8;
        RenderListener.D[0x7863 ^ 0x79E4] = 0xFF0A ^ 0x79E4;
        RenderListener.D[0x5323 ^ 0x5366] = 0xFFFFACBE ^ 0x5366;
        RenderListener.D[0x1A6 ^ 0x131] = 0x16F ^ 0x131;
        RenderListener.D[0x360F ^ 0x3757] = 0xB6DD ^ 0x3757;
        RenderListener.D[0x80F8 ^ 0x80B6] = 0x80A7 ^ 0x80B6;
        RenderListener.D[0xDE73 ^ 0xDF49] = 0x9CA0 ^ 0xDF49;
        RenderListener.D[0xC07C ^ 0xC0D9] = 0xC081 ^ 0xC0D9;
        RenderListener.D[0x6F33 ^ 0x6F44] = 0x6F45 ^ 0x6F44;
        RenderListener.D[0xD0A0 ^ 0xD0D8] = 0xD0D8 ^ 0xD0D8;
        RenderListener.D[0x947F ^ 0x9525] = 0x14AF ^ 0x9525;
        RenderListener.D[0x8501 ^ 0x841A] = 0x9007 ^ 0x841A;
        RenderListener.D[0x708 ^ 0x7D6] = 0xFFFFE8DB ^ 0x7D6;
        RenderListener.D[0x2D2C ^ 0x2D9F] = 0x2DEB ^ 0x2D9F;
        RenderListener.D[0x4811 ^ 0x48BA] = 0x48FF ^ 0x48BA;
        RenderListener.D[0x3F12 ^ 0x3F4B] = 0x3F24 ^ 0x3F4B;
        RenderListener.D[0x5B5B ^ 0x5BAC] = 0xD845 ^ 0x5BAC;
        RenderListener.D[0xA19E ^ 0xA1EB] = 0xA1E8 ^ 0xA1EB;
        RenderListener.D[0x7DC7 ^ 0x7D5D] = 0x7D78 ^ 0x7D5D;
        RenderListener.D[0xD2FA ^ 0xD2EF] = 0xD2ED ^ 0xD2EF;
        RenderListener.D[0xE227 ^ 0xE365] = 0xAFB0 ^ 0xE365;
        RenderListener.D[0x1310 ^ 0x122F] = 0x5EF8 ^ 0x122F;
        RenderListener.D[0x2521 ^ 0x2461] = 0x68B4 ^ 0x2461;
        RenderListener.D[0x4BC5 ^ 0x4BF0] = 0xFFFFB463 ^ 0x4BF0;
        RenderListener.D[0xCDB ^ 0xCF0] = 0xFFFFF35A ^ 0xCF0;
        RenderListener.D[0xE051 ^ 0xE147] = 0x8927 ^ 0xE147;
        RenderListener.D[0x95C2 ^ 0x957B] = 0x95D5 ^ 0x957B;
        RenderListener.D[0x5798 ^ 0x56BE] = 0x9662 ^ 0x56BE;
        RenderListener.D[0xD967 ^ 0xD85B] = 0x1DA8F ^ 0xD85B;
        RenderListener.D[0xE896 ^ 0xE919] = 0x85B ^ 0xE919;
        RenderListener.D[0x78F ^ 0x7C9] = 0x7BB ^ 0x7C9;
        RenderListener.D[0x98AD ^ 0x98BF] = 0x98AE ^ 0x98BF;
        RenderListener.D[0xDB37 ^ 0xDA49] = 0x6C4A ^ 0xDA49;
        RenderListener.D[0x9429 ^ 0x94C4] = 0x418A ^ 0x94C4;
        RenderListener.D[0xF819 ^ 0xF8D9] = 0xF89F ^ 0xF8D9;
        RenderListener.D[0xDA69 ^ 0xDA4C] = 0xFFFF25BB ^ 0xDA4C;
        RenderListener.D[0xC834 ^ 0xC89E] = 0xC88C ^ 0xC89E;
        RenderListener.D[0xA04F ^ 0xA150] = 0xDF3F ^ 0xA150;
        RenderListener.D[0x29FB ^ 0x2892] = 0xB979 ^ 0x2892;
        RenderListener.D[0xCCCB ^ 0xCC6B] = 0xFFFF33CC ^ 0xCC6B;
        RenderListener.D[0x63A1 ^ 0x6334] = 0x6351 ^ 0x6334;
        RenderListener.D[0x3E31 ^ 0x3F2B] = 0x13683 ^ 0x3F2B;
        RenderListener.D[0xEFF8 ^ 0xEFB2] = 0xEFAD ^ 0xEFB2;
        RenderListener.D[0x7CCC ^ 0x7C39] = 0xFFD0 ^ 0x7C39;
        RenderListener.D[0x8FDC ^ 0x8E99] = 0xE65B ^ 0x8E99;
        RenderListener.D[0x7B04 ^ 0x7A72] = 0x695 ^ 0x7A72;
        RenderListener.D[0xC7BB ^ 0xC6FA] = 0xFFFF75F1 ^ 0xC6FA;
        RenderListener.D[0xCFD6 ^ 0xCE9E] = 0x15EC ^ 0xCE9E;
        RenderListener.D[0x6E69 ^ 0x6E2E] = 0xFFFF91F8 ^ 0x6E2E;
        RenderListener.D[0x3E2A ^ 0x3F22] = 0xE86D ^ 0x3F22;
        RenderListener.D[0x108D8 ^ 0x10825] = 0x1A06C ^ 0x10825;
        RenderListener.D[0x8BB7 ^ 0x8B9F] = 0xFFFF7475 ^ 0x8B9F;
        RenderListener.D[0x7AB4 ^ 0x7BCE] = 0xC2FE ^ 0x7BCE;
        RenderListener.D[0xF8FD ^ 0xF83A] = 0xF81C ^ 0xF83A;
        RenderListener.D[0x655F ^ 0x65C2] = 0x65DC ^ 0x65C2;
        RenderListener.D[0xA1E ^ 0xA92] = 0xAFC ^ 0xA92;
        RenderListener.D[0x1056B ^ 0x105BA] = 0x1E52E ^ 0x105BA;
        RenderListener.D[0xA9E3 ^ 0xA999] = 0xA999 ^ 0xA999;
        RenderListener.D[0x8F66 ^ 0x8F0A] = 0x8F01 ^ 0x8F0A;
        RenderListener.D[0xB63A ^ 0xB622] = 0xB627 ^ 0xB622;
        RenderListener.D[0x1F86 ^ 0x1EA3] = 0xDE1B ^ 0x1EA3;
        RenderListener.D[0xC1CF ^ 0xC127] = 0x6EFD ^ 0xC127;
        RenderListener.D[0xE47F ^ 0xE4A0] = 0xF43C ^ 0xE4A0;
        RenderListener.D[0x53AD ^ 0x53E0] = 0x53EE ^ 0x53E0;
        RenderListener.D[0x7B01 ^ 0x7A73] = 0xD256 ^ 0x7A73;
        RenderListener.D[0x82C0 ^ 0x83CF] = 0x3A34 ^ 0x83CF;
        RenderListener.D[0x7723 ^ 0x77C5] = 0xC9A5 ^ 0x77C5;
        RenderListener.D[0xD85 ^ 0xD7D] = 0xD736 ^ 0xD7D;
        RenderListener.D[0x4D4A ^ 0x4D28] = 0x4D3A ^ 0x4D28;
        RenderListener.D[0x10058 ^ 0x10101] = 0x180F7 ^ 0x10101;
        RenderListener.D[0x9284 ^ 0x939C] = 0x19A34 ^ 0x939C;
        RenderListener.D[0xD06A ^ 0xD1EE] = 0x6680 ^ 0xD1EE;
        RenderListener.D[0x88CB ^ 0x89B3] = 0x3083 ^ 0x89B3;
        RenderListener.D[0xF846 ^ 0xF8B8] = 0xFFFFAF4B ^ 0xF8B8;
        RenderListener.D[0xBAA0 ^ 0xBAAB] = 0xFFFF450A ^ 0xBAAB;
        RenderListener.D[0x4F63 ^ 0x4E68] = 0x992E ^ 0x4E68;
        RenderListener.D[0xD9E4 ^ 0xD8B8] = 0xC4BF ^ 0xD8B8;
        RenderListener.D[0xBEC7 ^ 0xBE6A] = 0xFFFF4182 ^ 0xBE6A;
        RenderListener.D[0x4467 ^ 0x4463] = 0xFFFFBBFB ^ 0x4463;
        RenderListener.D[0xCE17 ^ 0xCF66] = 0xFFFF98F9 ^ 0xCF66;
        RenderListener.D[0x9AD3 ^ 0x9BFD] = 0x4273 ^ 0x9BFD;
        RenderListener.D[0xEE78 ^ 0xEE6E] = 0xEE14 ^ 0xEE6E;
        RenderListener.D[0xEC37 ^ 0xEC3F] = 0xEC31 ^ 0xEC3F;
        RenderListener.D[0x42AD ^ 0x439A] = 0x63 ^ 0x439A;
        RenderListener.D[0x71B8 ^ 0x713C] = 0x156C ^ 0x713C;
        RenderListener.D[0x69BF ^ 0x6954] = 0xC682 ^ 0x6954;
        RenderListener.D[0x14D ^ 0x127] = 0xFFFFFEEE ^ 0x127;
        RenderListener.D[0xF8C6 ^ 0xF892] = 0xFFFF0705 ^ 0xF892;
        RenderListener.D[0x9EEC ^ 0x9EFC] = 0x9EE5 ^ 0x9EFC;
        RenderListener.D[0x327B ^ 0x3377] = 0x8A8E ^ 0x3377;
        RenderListener.D[0x19F7 ^ 0x1943] = 0x1923 ^ 0x1943;
        RenderListener.D[0xA585 ^ 0xA40F] = 0x22F3 ^ 0xA40F;
        RenderListener.D[0xE909 ^ 0xE9BB] = 0xFFFF167E ^ 0xE9BB;
        RenderListener.D[0x5C60 ^ 0x5D0E] = 0x3ED3 ^ 0x5D0E;
        RenderListener.D[0x5EE0 ^ 0x5ED3] = 0xFFFFA152 ^ 0x5ED3;
        RenderListener.D[0x947D ^ 0x95FE] = 0x2286 ^ 0x95FE;
        RenderListener.D[0xA04A ^ 0xA0E9] = 0xFFFF5F3A ^ 0xA0E9;
        RenderListener.D[0x568D ^ 0x5706] = 0x6281 ^ 0x5706;
        RenderListener.D[0xA3BD ^ 0xA2D2] = 0xAEA ^ 0xA2D2;
        RenderListener.D[0xAA18 ^ 0xAA89] = 0xFFFF556C ^ 0xAA89;
        RenderListener.D[0x707C ^ 0x7013] = 0x7020 ^ 0x7013;
        RenderListener.D[0x1E53 ^ 0x1EA9] = 0xC4B5 ^ 0x1EA9;
        RenderListener.D[0x77D9 ^ 0x7694] = 0xBAA7 ^ 0x7694;
        RenderListener.D[0xF7AA ^ 0xF758] = 0xFFFF45FF ^ 0xF758;
        RenderListener.D[0x66D5 ^ 0x6793] = 0xF68 ^ 0x6793;
        RenderListener.D[0x8003 ^ 0x809D] = 0xFFFF7F71 ^ 0x809D;
        RenderListener.D[0xBA6F ^ 0xBA76] = 0xFFFF45BA ^ 0xBA76;
        RenderListener.D[0x6B21 ^ 0x6BD1] = 0x26A3 ^ 0x6BD1;
        RenderListener.D[0xEA3 ^ 0xE84] = 0xFFFFF152 ^ 0xE84;
        RenderListener.D[0xEAA6 ^ 0xEBD5] = 0x9721 ^ 0xEBD5;
        RenderListener.D[0x82EC ^ 0x83D8] = 0x4A3C ^ 0x83D8;
        RenderListener.D[0x10A70 ^ 0x10A17] = 0x10A27 ^ 0x10A17;
        RenderListener.D[0x280E ^ 0x2938] = 0xE0DC ^ 0x2938;
        RenderListener.D[0x38CC ^ 0x39B7] = 0x8FA8 ^ 0x39B7;
        RenderListener.D[0xEC69 ^ 0xEC7E] = 0xFFFF13FB ^ 0xEC7E;
        RenderListener.D[0x4408 ^ 0x4575] = 0xFFFF0CBA ^ 0x4575;
        RenderListener.D[0x2EE2 ^ 0x2ED8] = 0x2EEE ^ 0x2ED8;
        RenderListener.D[0x10002 ^ 0x10024] = 0x1002D ^ 0x10024;
        RenderListener.D[0x107F0 ^ 0x107A3] = 0x107DE ^ 0x107A3;
        RenderListener.D[0xB0DC ^ 0xB0E7] = 0xB0AF ^ 0xB0E7;
        RenderListener.D[0xBF01 ^ 0xBE2C] = 0xFFFF9833 ^ 0xBE2C;
        RenderListener.D[0x917A ^ 0x91E3] = 0xFFFF6E3C ^ 0x91E3;
        RenderListener.D[0xC659 ^ 0xC775] = 0x1EFB ^ 0xC775;
        RenderListener.D[0xFBE9 ^ 0xFABE] = 0x7B3E ^ 0xFABE;
        RenderListener.D[0xC5F ^ 0xC0E] = 0xFFFFF3E5 ^ 0xC0E;
    }
}

