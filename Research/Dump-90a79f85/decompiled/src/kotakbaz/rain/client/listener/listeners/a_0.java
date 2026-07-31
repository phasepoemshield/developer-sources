/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.minecraft.class_10859
 *  net.minecraft.class_408
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
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.client.listener.A;
import kotakbaz.rain.client.listener.listeners.b;
import kotakbaz.rain.client.render.main.B;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.util.other.f;
import kotakbaz.rain.client.util.render.engine.a;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.engine.controls.LayerControl;
import kotakbaz.rain.client.util.render.font.D;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.waypoint.c_0;
import kotakbaz.rain.event.events.C;
import kotakbaz.rain.module.modules.render.f_0;
import kotakbaz.rain.module.modules.render.t_0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import net.minecraft.class_10859;
import net.minecraft.class_408;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.client.listener.listeners.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J)\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n\u00a2\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%\u00a8\u0006&"}, d2={"Lkotakbaz/rain/client/listener/listeners/RenderListener;", "Lkotakbaz/rain/client/listener/Listener;", "<init>", "()V", "", "init", "ensureLoaded", "", "partialTicks", "", "Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;", "pipelines", "hookRender", "(F[Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "flushFramePipelines", "([Lkotakbaz/rain/client/util/render/engine/controls/ClientRenderPipeline;)V", "Lkotakbaz/rain/client/render/main/ChromaRenderer$FramebufferState;", "beginFramePipelines", "()Lkotakbaz/rain/client/render/main/ChromaRenderer$FramebufferState;", "fbState", "endFramePipelines", "(Lkotakbaz/rain/client/render/main/ChromaRenderer$FramebufferState;)V", "registerShaderLibs", "", "file", "Lkotakbaz/rain/client/render/main/compile/GlShaderLibrary;", "registerShaderLib", "(Ljava/lang/String;)Lkotakbaz/rain/client/render/main/compile/GlShaderLibrary;", "", "loaded", "Z", "getLoaded", "()Z", "setLoaded", "(Z)V", "Lkotakbaz/rain/client/util/other/FrameGate;", "frameGate", "Lkotakbaz/rain/client/util/other/FrameGate;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nRenderListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderListener.kt\nkotakbaz/rain/client/listener/listeners/RenderListener\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n37#2,2:150\n1915#3,2:152\n*S KotlinDebug\n*F\n+ 1 RenderListener.kt\nkotakbaz/rain/client/listener/listeners/RenderListener\n*L\n45#1:150,2\n82#1:152,2\n*E\n"})
public final class a_0
extends A {
    @NotNull
    public static final a_0 INSTANCE;
    private static boolean a;
    @NotNull
    private static final kotakbaz.rain.client.util.other.E A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private a_0() {
        super();
    }

    public final boolean getLoaded() {
        return a;
    }

    public final void setLoaded(boolean bl) {
        a = bl;
    }

    @Override
    public void init() {
        ChromaRenderer.init(a_0::init$lambda$0, a_0::init$lambda$1);
        this.registerShaderLibs();
        int n = D[0];
        n ^= D[1];
        int n2 = D[3];
        n2 -= D[4];
        int n3 = D[6];
        n3 += D[7];
        kotakbaz.rain.client.util.render.a_0.INSTANCE.register((String)b[n ^= D[2]], (String)b[n2 ^= D[5]] + (String)b[n3 += D[8]]);
        int n4 = D[9];
        n4 -= D[10];
        n4 ^= D[11];
        int n5 = D[12];
        n5 += D[13];
        int n6 = D[15];
        n6 ^= D[16];
        int n7 = D[18];
        n7 ^= D[19];
        kotakbaz.rain.client.util.render.a_0.INSTANCE.register((String)b[n4] + (String)b[n5 += D[14]], (String)b[n6 -= D[17]] + (String)b[n7 -= D[20]]);
    }

    public final void ensureLoaded() {
        long l = 878421547083319437L;
        if (a) {
            return;
        }
        int n = D[21];
        n -= D[22];
        SpreadBuilder spreadBuilder = new SpreadBuilder(n -= D[23]);
        spreadBuilder.add(kotakbaz.rain.client.util.render.A.INSTANCE.getADVANCED_RECT());
        spreadBuilder.add(kotakbaz.rain.client.util.render.A.INSTANCE.getKAWASE());
        Collection collection = kotakbaz.rain.client.util.render.font.D.INSTANCE.getAll();
        long l2 = l;
        int n2 = D[24];
        n2 -= D[25];
        l = l2 ^ (0L ^ l2) & -1L << (n2 ^= D[26]);
        Collection collection2 = collection;
        int n3 = D[27];
        n3 += D[28];
        spreadBuilder.addSpread(collection2.toArray(new E[n3 ^= D[29]]));
        LayerControl.INSTANCE.loadShaders((kotakbaz.rain.client.util.render.engine.a_0[])spreadBuilder.toArray(new a[spreadBuilder.size()]));
        LayerControl.INSTANCE.loadRender();
        kotakbaz.rain.client.util.render.a_0.INSTANCE.load();
        int n4 = D[30];
        n4 -= D[31];
        a = n4 -= D[32];
    }

    public final void hookRender(float f2, ClientRenderPipeline ... clientRenderPipelineArray) {
        f f3;
        Object object;
        Object object2;
        long l = 6423330016683095189L;
        long l2 = -3176553510058277725L;
        long l3 = -4811113000573420357L;
        long l4 = -1039393039809458646L;
        long l5 = 1023097791689825917L;
        int n = D[33];
        n -= D[34];
        Intrinsics.checkNotNullParameter(clientRenderPipelineArray, (String)b[n += D[35]]);
        this.ensureLoaded();
        if (b_0.getMc().field_1724 == null || b_0.getMc().field_1687 == null) {
            this.flushFramePipelines(Arrays.copyOf(clientRenderPipelineArray, clientRenderPipelineArray.length));
            return;
        }
        if (ArraysKt.contains(clientRenderPipelineArray, ClientRenderPipeline.HUD_RECT)) {
            f_0.INSTANCE.renderWorldIfNeeded();
            t_0.INSTANCE.renderWorldIfNeeded();
        }
        int n2 = D[36];
        n2 -= D[37];
        long l6 = l4;
        int n3 = D[39];
        n3 ^= D[40];
        long l7 = l4 = l6 ^ ((long)kotakbaz.rain.client.listener.listeners.b.INSTANCE.mouseX() << (n2 ^= D[38]) ^ l6) & -1L << (n3 ^= D[41]);
        int n4 = D[42];
        n4 -= D[43];
        l4 = l7 ^ ((long)kotakbaz.rain.client.listener.listeners.b.INSTANCE.mouseY() ^ l7) & -1L >>> (n4 ^= D[44]);
        kotakbaz.rain.client.util.render.engine.controls.a_0.INSTANCE.unscaledProjection();
        kotakbaz.rain.client.util.render.engine.controls.a_0.INSTANCE.reset();
        GlStateManager._disableDepthTest();
        if (ArraysKt.contains(clientRenderPipelineArray, ClientRenderPipeline.LOW)) {
            int n5 = D[45];
            n5 -= D[46];
            A.execute(n5 ^= D[47], a_0::hookRender$lambda$0);
        }
        ChromaRenderer.FramebufferState framebufferState = this.beginFramePipelines();
        if (ArraysKt.contains(clientRenderPipelineArray, ClientRenderPipeline.HUD_RECT)) {
            c_0.INSTANCE.renderHud(f2);
        }
        if (ArraysKt.contains(clientRenderPipelineArray, ClientRenderPipeline.HUD_RECT) && b_0.getMc().field_1755 instanceof class_408) {
            Collection<kotakbaz.rain.client.draggable.c_0> collection = kotakbaz.rain.client.draggable.D.INSTANCE.getDraggables().values();
            int n6 = D[48];
            n6 -= D[49];
            int n7 = D[51];
            n7 += D[52];
            int n8 = D[54];
            n8 ^= D[55];
            Intrinsics.checkNotNullExpressionValue(collection, (String)b[n6 += D[50]] + (String)b[n7 -= D[53]] + (String)b[n8 -= D[56]]);
            object2 = collection;
            long l8 = l5;
            int n9 = D[57];
            n9 ^= D[58];
            l5 = l8 ^ (0L ^ l8) & -1L << (n9 ^= D[59]);
            object = object2.iterator();
            while (object.hasNext()) {
                f3 = object.next();
                kotakbaz.rain.client.draggable.c_0 c_02 = (kotakbaz.rain.client.draggable.c_0)((Object)f3);
                long l9 = l5;
                int n10 = D[60];
                n10 += D[61];
                l5 = l9 ^ (0L ^ l9) & -1L >>> (n10 += D[62]);
                if (!c_02.getModule().isEnabled()) continue;
                c_02.onDraw();
            }
        }
        C c2 = new C();
        object = c2;
        long l10 = l;
        int n11 = D[63];
        n11 -= D[64];
        l = l10 ^ (0L ^ l10) & -1L << (n11 ^= D[65]);
        ((kotakbaz.rain.event.types.A)object).put(kotakbaz.rain.event.events.C.a.getPARTIAL_TICKS(), Float.valueOf(f2));
        int n12 = D[66];
        n12 -= D[67];
        ((kotakbaz.rain.event.types.A)object).put(kotakbaz.rain.event.events.C.a.getMOUSE_X(), (int)(l4 >>> (n12 ^= D[68])));
        ((kotakbaz.rain.event.types.A)object).put(kotakbaz.rain.event.events.C.a.getMOUSE_Y(), (int)l4);
        object2 = c2;
        kotakbaz.rain.event.a.INSTANCE.post(object2);
        if (ArraysKt.contains(clientRenderPipelineArray, ClientRenderPipeline.HUD_RECT)) {
            kotakbaz.rain.client.draggable.A.INSTANCE.render();
        }
        f f4 = Rain.INSTANCE.getCustomScreen();
        if (f4 != null) {
            f3 = f4;
            long l11 = l2;
            int n13 = D[69];
            n13 += D[70];
            l2 = l11 ^ (0L ^ l11) & -1L >>> (n13 += D[71]);
            int n14 = D[72];
            n14 -= D[73];
            f3.render((int)(l4 >>> (n14 -= D[74])), (int)l4, f2);
            if (f3.shouldRemove()) {
                Rain.INSTANCE.setCustomScreen(null);
            }
        }
        LayerControl.INSTANCE.flushPipelines(Arrays.copyOf(clientRenderPipelineArray, clientRenderPipelineArray.length));
        this.endFramePipelines(framebufferState);
        kotakbaz.rain.client.util.render.engine.controls.a_0.INSTANCE.scaledProjection();
    }

    private final void flushFramePipelines(ClientRenderPipeline ... clientRenderPipelineArray) {
        kotakbaz.rain.client.util.render.engine.controls.a_0.INSTANCE.unscaledProjection();
        kotakbaz.rain.client.util.render.engine.controls.a_0.INSTANCE.reset();
        GlStateManager._disableDepthTest();
        ChromaRenderer.FramebufferState framebufferState = this.beginFramePipelines();
        LayerControl.INSTANCE.flushPipelines(Arrays.copyOf(clientRenderPipelineArray, clientRenderPipelineArray.length));
        this.endFramePipelines(framebufferState);
        kotakbaz.rain.client.util.render.engine.controls.a_0.INSTANCE.scaledProjection();
    }

    private final ChromaRenderer.FramebufferState beginFramePipelines() {
        ChromaRenderer.FramebufferState framebufferState = ChromaRenderer.captureFramebufferState();
        ChromaRenderer.bindMainFramebuffer();
        ChromaRenderer.applyBlend(kotakbaz.rain.client.render.main.blend.a_0.F, kotakbaz.rain.client.render.main.blend.A.E, kotakbaz.rain.client.render.main.blend.a_0.c, kotakbaz.rain.client.render.main.blend.A.G);
        Intrinsics.checkNotNull(framebufferState);
        return framebufferState;
    }

    private final void endFramePipelines(ChromaRenderer.FramebufferState framebufferState) {
        ChromaRenderer.restoreFramebufferState(framebufferState);
    }

    private final void registerShaderLibs() {
        int n = D[75];
        n ^= D[76];
        kotakbaz.rain.client.render.main.compile.A[] aArray = new kotakbaz.rain.client.render.main.compile.A[n += D[77]];
        int n2 = D[78];
        n2 ^= D[79];
        int n3 = D[81];
        n3 ^= D[82];
        aArray[n2 ^= a_0.D[80]] = this.registerShaderLib((String)b[n3 ^= D[83]]);
        int n4 = D[84];
        n4 ^= D[85];
        int n5 = D[87];
        n5 ^= D[88];
        aArray[n4 ^= a_0.D[86]] = this.registerShaderLib((String)b[n5 -= D[89]]);
        int n6 = D[90];
        n6 += D[91];
        int n7 = D[93];
        n7 -= D[94];
        aArray[n6 += a_0.D[92]] = this.registerShaderLib((String)b[n7 += D[95]]);
        int n8 = D[96];
        n8 += D[97];
        int n9 = D[99];
        n9 += D[100];
        aArray[n8 += a_0.D[98]] = this.registerShaderLib((String)b[n9 ^= D[101]]);
        kotakbaz.rain.client.render.main.compile.b.registerShaderLibraries(aArray);
    }

    private final kotakbaz.rain.client.render.main.compile.A registerShaderLib(String string) {
        int n = D[102];
        n -= D[103];
        String string2 = string;
        String string3 = kotakbaz.rain.client.util.render.engine.a.h.getSHADER_INCLUDE_PATH();
        int n2 = D[105];
        n2 ^= D[106];
        kotakbaz.rain.client.render.main.compile.A a2 = kotakbaz.rain.client.render.main.B.a.createShaderLibraryBuilder(new kotakbaz.rain.client.render.main.program.a_0[n += D[104]]).name(string).library(string3 + string2 + (String)b[n2 ^= D[107]]).build();
        int n3 = D[108];
        n3 -= D[109];
        Intrinsics.checkNotNullExpressionValue(a2, (String)b[n3 -= D[110]]);
        return a2;
    }

    private static final Integer init$lambda$0(class_10859 class_108592) {
        return class_108592.field_57842;
    }

    private static final Integer init$lambda$1() {
        return b_0.getMc().method_22683().method_4495();
    }

    private static final Unit hookRender$lambda$0() {
        kotakbaz.rain.client.util.render.A.INSTANCE.getKAWASE().applyBlur();
        return Unit.INSTANCE;
    }

    static {
        a_0.b();
        long l = -315061548728328458L;
        long l2 = -510931873813531150L;
        long l3 = -5416085446891689192L;
        long l4 = -7931197579346040742L;
        long l5 = -6358964383482100473L;
        long l6 = 7779752090326041973L;
        long l7 = -3522032053587881700L;
        long l8 = -1363688536794633710L;
        long l9 = 6883632304445291587L;
        long l10 = -8904327319313188891L;
        long l11 = 8394909642810436079L;
        long l12 = -7409097140021889378L;
        long l13 = -8295210717490672306L;
        long l14 = 1388183651696423478L;
        int n = D[111];
        n ^= D[112];
        b = new Object[n ^= D[113]];
        long l15 = l14;
        int n2 = D[114];
        n2 += D[115];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= D[116]);
        Object[] objectArray = new Object[D[117]];
        objectArray[a_0.D[118]] = B;
        objectArray[a_0.D[119]] = D[120];
        int n3 = D[121];
        Object object = a_0.A()[D[122]];
        if (object == null) {
            char[] cArray = "\u0aa9\u0a4c\u0ab7\u0ac6\u0a75\u0a7b\u0a81\u0a75\u0a4b\u0a6c\u0a9f\u0aa8\u0ac6\u0a81\u0a75\u0a52\u0aa4\u0a4c\u0a77\u0aa9\u0a80\u0a86\u0a7d\u0a52\u0aab\u0a50\u0ab0\u0a6a\u0a7f\u0a80\u0a7b\u0aaf\u0a80\u0a82\u0aa9\u0a4a\u0a51\u0ac6\u0a51\u0a6f\u0a85\u0a51\u0a52\u0a49\u0ac6\u0a70\u0a6c\u0a86\u0aa3\u0ab2\u0ac5\u0a49\u0a51\u0a85\u0a7e\u0ac6\u0a66\u0a81\u0a9b\u0a55\u0a57\u0a50\u0a88\u0a78\u0aaa\u0a9d\u0a55\u0a7c\u0a6f\u0a57\u0a85\u0aaf\u0a49\u0aaa\u0a78\u0a85\u0aac\u0ac5\u0a52\u0a75\u0a4c\u0a52\u0a70\u0a7c\u0aa3\u0a4b\u0a77\u0a56\u0a7f\u0a65\u0aa1\u0aaf\u0a77\u0a4f\u0a9c\u0bdd\u0a4b\u0a65\u0aa1\u0a4b\u0aab\u0a52\u0a6f\u0a69\u0a78\u0aab\u0a6b\u0a76\u0a57\u0a57\u0ab0\u0a4b\u0a7c\u0a4b\u0a81\u0aac\u0a58\u0aa3\u0a6c\u0aab\u0ac6\u0a80\u0a56\u0a49\u0a6a\u0ab7\u0aa4\u0a58\u0a51\u0a7e\u0aa2\u0a9b\u0aa2\u0a77\u0a6b\u0ab7\u0bdd\u0a7d\u0aaf\u0a6a\u0ac6\u0aaa\u0ab7\u0aab\u0a9e\u0a7d\u0aa1\u0bdd\u0a81\u0a81\u0ac5\u0a56\u0ab2\u0ab2\u0a71\u0a6f\u0ab2\u0a7b\u0a82\u0a70\u0a6c\u0a82\u0a81\u0a7e\u0a4b\u0aac\u0a84\u0a65\u0a86\u0a57\u0a52\u0a50\u0a7e\u0a77\u0ab0\u0a85\u0aa2\u0ac6\u0a56\u0a76\u0a55\u0a84\u0a85\u0a85\u0aa2\u0aa2\u0a84\u0a69\u0ab1\u0aaa\u0a9d\u0a4f\u0aa4\u0a9f\u0bdd\u0a76\u0aa8\u0a9b\u0a88\u0aa0\u0a4a\u0ab7\u0a6c\u0a6a\u0aa2\u0a58\u0a80\u0a4b\u0a75\u0a7b\u0aa4\u0a84\u0a88\u0a4c\u0a49\u0aaf\u0a4a\u0a77\u0a9e\u0ac5\u0a56\u0aa8\u0aa9\u0ab7\u0a55\u0a9c\u0a77\u0a4a\u0ab0\u0a83\u0aa7\u0ac6\u0a76\u0ab1\u0a56\u0a69\u0aa9\u0a6f\u0aac\u0a87\u0aa4\u0a6f\u0bdd\u0bdd\u0a6a\u0a49\u0aaa\u0a86\u0bdd\u0a4a\u0a56\u0a7e\u0a84\u0a78\u0a77\u0aab\u0aab\u0a78\u0aaa\u0aa8\u0a6a\u0aa0\u0a7e\u0a80\u0aa4\u0a86\u0bdd\u0a71\u0ac6\u0a70\u0a9e\u0a7e\u0a75\u0aa8\u0a6a\u0a6a\u0aa7\u0ac6\u0aac\u0a65\u0a9e\u0a76\u0a83\u0aa1\u0a83\u0aab\u0aa4\u0ab0\u0a87\u0a58\u0ab0\u0a6a\u0a80\u0a58\u0a4f\u0a58\u0a52\u0a81\u0a4b\u0ab3".toCharArray();
            for (int i = D[123]; i < D[124]; ++i) {
                int n4 = cArray[i];
                n4 -= D[125];
                n4 += D[126];
                n4 -= D[127];
                n4 ^= D[128];
                n4 += D[129];
                n4 -= D[130];
                n4 -= D[131];
                n4 -= D[132];
                n4 += D[133];
                n4 += D[134];
                n4 -= D[135];
                n4 ^= D[136];
                n4 ^= D[137];
                cArray[i] = (char)(n4 += D[138]);
            }
            object = a_0.A()[a_0.D[139]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = D[140];
        n5 -= D[141];
        l5 = l16 ^ (0xC400000000L ^ l16) & -1L << (n5 += D[142]);
        long l17 = l12;
        int n6 = D[143];
        n6 -= D[144];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += D[145]);
        while (true) {
            int n7 = D[146];
            n7 += D[147];
            if ((int)l12 >= (int)(l5 >>> (n7 += D[148]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = D[149];
            n9 ^= D[150];
            int n10 = D[152];
            n10 ^= D[153];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= D[151])) & -1L >>> (n10 ^= D[154]);
            long l19 = l8;
            int n11 = D[155];
            n11 -= D[156];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= D[157]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = D[158];
            n13 ^= D[159];
            int n14 = D[161];
            n14 -= D[162];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= D[160])) & -1L >>> (n14 -= D[163]);
            int n15 = D[164];
            n15 += D[165];
            long l21 = l9;
            int n16 = D[167];
            n16 ^= D[168];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += D[166]) ^ l21) & -1L << (n16 -= D[169]);
            int n17 = D[170];
            n17 ^= D[171];
            n17 ^= D[172];
            int n18 = D[173];
            n18 += D[174];
            long l22 = l11;
            int n19 = D[176];
            n19 ^= D[177];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= D[175]))) ^ l22) & -1L >>> (n19 ^= D[178]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = D[179];
            n20 ^= D[180];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= D[181]);
            while (true) {
                int n21 = D[182];
                n21 += D[183];
                if ((int)(l13 >>> (n21 -= D[184])) >= (int)l11) break;
                int n22 = D[185];
                n22 -= D[186];
                int n23 = D[188];
                n23 += D[189];
                cArray2[(int)(l13 >>> (n22 ^= a_0.D[187]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= D[190]))];
                l13 += 0x100000000L;
            }
            int n24 = D[191];
            n24 -= D[192];
            int n25 = (int)(l14 >>> (n24 += D[193]));
            l14 += 0x100000000L;
            a_0.b[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = D[194];
            n26 ^= D[195];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= D[196]);
        }
        INSTANCE = new a_0();
        int n27 = D[197];
        n27 ^= D[198];
        A = new kotakbaz.rain.client.util.other.E(null, n27 += D[199], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[D[200]];
        String string = (String)object[D[201]];
        object = object[D[202]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[203]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[204]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[206] ^ D[207]];
                byArray[a_0.D[208] ^ a_0.D[209]] = D[210] ^ D[211];
                byArray[a_0.D[212] ^ a_0.D[213]] = D[214] ^ D[215];
                byArray[a_0.D[216] ^ a_0.D[217]] = D[218] ^ D[219];
                byArray[a_0.D[220] ^ a_0.D[221]] = D[222] ^ D[223];
                byArray[a_0.D[224] ^ a_0.D[225]] = D[226] ^ D[227];
                byArray[a_0.D[228] ^ a_0.D[229]] = D[230] ^ D[231];
                byArray[a_0.D[232] ^ a_0.D[233]] = D[234] ^ D[235];
                byArray[a_0.D[236] ^ a_0.D[237]] = D[238] ^ D[239];
                byArray[a_0.D[240] ^ a_0.D[241]] = D[242] ^ D[243];
                byArray[a_0.D[244] ^ a_0.D[245]] = D[246] ^ D[247];
                byArray[a_0.D[248] ^ a_0.D[249]] = D[250] ^ D[251];
                byArray[a_0.D[252] ^ a_0.D[253]] = D[254] ^ D[255];
                byArray[a_0.D[256] ^ a_0.D[257]] = D[258] ^ D[259];
                byArray[a_0.D[260] ^ a_0.D[261]] = D[262] ^ D[263];
                byArray[a_0.D[264] ^ a_0.D[265]] = D[266] ^ D[267];
                byArray[a_0.D[268] ^ a_0.D[269]] = D[270] ^ D[271];
                objectArray2[a_0.D[205]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[272]];
            if (c == null) {
                byte[] byArray2 = new byte[D[273] ^ D[274]];
                byArray2[a_0.D[275] ^ a_0.D[276]] = D[277] ^ D[278];
                byArray2[a_0.D[279] ^ a_0.D[280]] = D[281] ^ D[282];
                byArray2[a_0.D[283] ^ a_0.D[284]] = D[285] ^ D[286];
                byArray2[a_0.D[287] ^ a_0.D[288]] = D[289] ^ D[290];
                byArray2[a_0.D[291] ^ a_0.D[292]] = D[293] ^ D[294];
                byArray2[a_0.D[295] ^ a_0.D[296]] = D[297] ^ D[298];
                byArray2[a_0.D[299] ^ a_0.D[300]] = D[301] ^ D[302];
                byArray2[a_0.D[303] ^ a_0.D[304]] = D[305] ^ D[306];
                byArray2[a_0.D[307] ^ a_0.D[308]] = D[309] ^ D[310];
                byArray2[a_0.D[311] ^ a_0.D[312]] = D[313] ^ D[314];
                byArray2[a_0.D[315] ^ a_0.D[316]] = D[317] ^ D[318];
                byArray2[a_0.D[319] ^ a_0.D[320]] = D[321] ^ D[322];
                byArray2[a_0.D[323] ^ a_0.D[324]] = D[325] ^ D[326];
                byArray2[a_0.D[327] ^ a_0.D[328]] = D[329] ^ D[330];
                byArray2[a_0.D[331] ^ a_0.D[332]] = D[333] ^ D[334];
                byArray2[a_0.D[335] ^ a_0.D[336]] = D[337] ^ D[338];
                byArray2[a_0.D[339] ^ a_0.D[340]] = D[341] ^ D[342];
                byArray2[a_0.D[343] ^ a_0.D[344]] = D[345] ^ D[346];
                byArray2[a_0.D[347] ^ a_0.D[348]] = D[349] ^ D[350];
                byArray2[a_0.D[351] ^ a_0.D[352]] = D[353] ^ D[354];
                byArray2[a_0.D[355] ^ a_0.D[356]] = D[357] ^ D[358];
                byArray2[a_0.D[359] ^ a_0.D[360]] = D[361] ^ D[362];
                byArray2[a_0.D[363] ^ a_0.D[364]] = D[365] ^ D[366];
                byArray2[a_0.D[367] ^ a_0.D[368]] = D[369] ^ D[370];
                byArray2[a_0.D[371] ^ a_0.D[372]] = D[373] ^ D[374];
                byArray2[a_0.D[375] ^ a_0.D[376]] = D[377] ^ D[378];
                byArray2[a_0.D[379] ^ a_0.D[380]] = D[381] ^ D[382];
                byArray2[a_0.D[383] ^ a_0.D[384]] = D[385] ^ D[386];
                byArray2[a_0.D[387] ^ a_0.D[388]] = D[389] ^ D[390];
                byArray2[a_0.D[391] ^ a_0.D[392]] = D[393] ^ D[394];
                byArray2[a_0.D[395] ^ a_0.D[396]] = D[397] ^ D[398];
                byArray2[a_0.D[399] ^ 0xE14F] = 0xE104 ^ 0xE14F;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u805d\u80af\u8048\u80b1\u8043\u83bf\u8074\u8066\u8041\u8065\u8045\u807a\u804e\u8050\u80a0\u8045\u80ae\u83be".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 ^= 0x2620;
                        n2 -= 6592;
                        n2 += 64241;
                        n2 -= 53827;
                        n2 ^= 0xE073;
                        n2 -= 30356;
                        n2 -= 57513;
                        n2 -= 6379;
                        n2 ^= 0x960B;
                        n2 -= 7883;
                        n2 += 8991;
                        cArray[i] = (char)(n2 -= 30463);
                    }
                    object4 = a_0.A()[1] = new String(cArray);
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
                Object object5 = a_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u15ff\u15fb\u1549".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 44976;
                        n3 -= 15025;
                        n3 -= 12385;
                        n3 -= 57186;
                        n3 ^= 0x5EA3;
                        n3 -= 4339;
                        n3 -= 57482;
                        n3 += 14046;
                        n3 -= 65454;
                        n3 ^= 0x3CEE;
                        n3 += 10894;
                        cArray[i] = (char)(n3 += 7662);
                    }
                    object5 = a_0.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = a_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\uf2d4\uf2d8\uf302\uf2de\uf2d2\uf2d3\uf2d2\uf2de\uf305\uf2fa\uf2d2\uf302\uf2e8\uf305\uf2f4\uf2f9\uf2f9\uf31c\uf31f\uf2f6".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 17376;
                    n4 += 13572;
                    n4 += 64453;
                    n4 += 20134;
                    n4 += 39911;
                    n4 ^= 0x4CD9;
                    n4 ^= 0x3B4A;
                    n4 += 65402;
                    n4 -= 57274;
                    n4 -= 39611;
                    cArray[i] = (char)(n4 -= 43613);
                }
                object6 = a_0.A()[3] = new String(cArray);
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
        a_0.D[0x103BE ^ 0x103E3] = 0xFFFEFC70 ^ 0x103E3;
        a_0.D[0x40E6 ^ 0x40C8] = 0x4094 ^ 0x40C8;
        a_0.D[0x5988 ^ 0x58E0] = 0xC917 ^ 0x58E0;
        a_0.D[0x8B68 ^ 0x8BA2] = 0x8BA2 ^ 0x8BA2;
        a_0.D[0xAF91 ^ 0xAF59] = 0xAF58 ^ 0xAF59;
        a_0.D[0x83CE ^ 0x83D3] = 0x83E8 ^ 0x83D3;
        a_0.D[0xC8DE ^ 0xC8A0] = 0x4089 ^ 0xC8A0;
        a_0.D[0xD3D3 ^ 0xD3D1] = 0xFFFF2C47 ^ 0xD3D1;
        a_0.D[0x80CA ^ 0x802D] = 0x3E0E ^ 0x802D;
        a_0.D[0x7A04 ^ 0x7B6F] = 0x18B4 ^ 0x7B6F;
        a_0.D[0x287C ^ 0x2834] = 0xFFFFD7DB ^ 0x2834;
        a_0.D[0x7702 ^ 0x768C] = 0x4315 ^ 0x768C;
        a_0.D[0xB40E ^ 0xB51E] = 0xB51E ^ 0xB51E;
        a_0.D[0x9E3D ^ 0x9E3C] = 0x9E58 ^ 0x9E3C;
        a_0.D[0xDA5 ^ 0xC9B] = 0x10E4F ^ 0xC9B;
        a_0.D[0xF257 ^ 0xF25B] = 0xFFFF0D1C ^ 0xF25B;
        a_0.D[0x58EB ^ 0x5809] = 0xFFFF3753 ^ 0x5809;
        a_0.D[0x1501 ^ 0x1488] = 0xFFFF6DB2 ^ 0x1488;
        a_0.D[0x105B2 ^ 0x105A3] = 0xFFFEFA17 ^ 0x105A3;
        a_0.D[0x8342 ^ 0x837B] = 0x8325 ^ 0x837B;
        a_0.D[0xEBFA ^ 0xEBF0] = 0xEB9B ^ 0xEBF0;
        a_0.D[0xB487 ^ 0xB44E] = 0xB44C ^ 0xB44E;
        a_0.D[0xEDD5 ^ 0xECB8] = 0xFFFF70B8 ^ 0xECB8;
        a_0.D[0xAB29 ^ 0xABBD] = 0xFFFF545C ^ 0xABBD;
        a_0.D[0xF56E ^ 0xF51E] = 0xFFFF0AD1 ^ 0xF51E;
        a_0.D[0x1527 ^ 0x159F] = 0x1595 ^ 0x159F;
        a_0.D[0xD1C4 ^ 0xD145] = 0xCC8 ^ 0xD145;
        a_0.D[0xF6BE ^ 0xF796] = 0x9142 ^ 0xF796;
        a_0.D[0x6439 ^ 0x645D] = 0x6437 ^ 0x645D;
        a_0.D[0x6D24 ^ 0x6C7A] = 0x707D ^ 0x6C7A;
        a_0.D[0x57E2 ^ 0x56C2] = 0x28AC ^ 0x56C2;
        a_0.D[0xD784 ^ 0xD6A5] = 0xFFFF5763 ^ 0xD6A5;
        a_0.D[0x6FB0 ^ 0x6ECF] = 0x99EF ^ 0x6ECF;
        a_0.D[0x79AB ^ 0x798A] = 0xFFFF86E4 ^ 0x798A;
        a_0.D[0xE10 ^ 0xF5E] = 0xC35E ^ 0xF5E;
        a_0.D[0xDA9E ^ 0xDAAF] = 0xFFFF2530 ^ 0xDAAF;
        a_0.D[0x12F9 ^ 0x13B6] = 0x384C ^ 0x13B6;
        a_0.D[0xA54E ^ 0xA4C8] = 0x13A6 ^ 0xA4C8;
        a_0.D[0x5FB7 ^ 0x5F7A] = 0x5F7A ^ 0x5F7A;
        a_0.D[0x67D8 ^ 0x6689] = 0x4D6F ^ 0x6689;
        a_0.D[0xF5D8 ^ 0xF523] = 0x2F62 ^ 0xF523;
        a_0.D[0xD289 ^ 0xD3F5] = 0x65F6 ^ 0xD3F5;
        a_0.D[0xB559 ^ 0xB515] = 0xB570 ^ 0xB515;
        a_0.D[0x8B5B ^ 0x8BB7] = 0x5EF7 ^ 0x8BB7;
        a_0.D[0x101EF ^ 0x1009A] = 0xFFFE8399 ^ 0x1009A;
        a_0.D[0xD70F ^ 0xD706] = 0xD710 ^ 0xD706;
        a_0.D[0x87EC ^ 0x8759] = 0x876D ^ 0x8759;
        a_0.D[0x448C ^ 0x446D] = 0xD4DF ^ 0x446D;
        a_0.D[0x106E9 ^ 0x107EC] = 0x13CCC ^ 0x107EC;
        a_0.D[0x746D ^ 0x75ED] = 0x82D2 ^ 0x75ED;
        a_0.D[0xD425 ^ 0xD4AE] = 0xD4AE ^ 0xD4AE;
        a_0.D[0x3A02 ^ 0x3B21] = 0xFBF2 ^ 0x3B21;
        a_0.D[0xE73C ^ 0xE7EA] = 0x1238 ^ 0xE7EA;
        a_0.D[0x41A2 ^ 0x40BB] = 0x14910 ^ 0x40BB;
        a_0.D[0xD732 ^ 0xD735] = 0xFFFF28ED ^ 0xD735;
        a_0.D[0x7B92 ^ 0x7BE4] = 0x7BE4 ^ 0x7BE4;
        a_0.D[0x77E9 ^ 0x76D1] = 0x3538 ^ 0x76D1;
        a_0.D[0x1CA ^ 0x1F6] = 0xFFFFFE83 ^ 0x1F6;
        a_0.D[0xC9E5 ^ 0xC8E2] = 0xF3C2 ^ 0xC8E2;
        a_0.D[0x10F25 ^ 0x10E76] = 0x187FB ^ 0x10E76;
        a_0.D[0xD953 ^ 0xD855] = 0xE372 ^ 0xD855;
        a_0.D[0x10080 ^ 0x10027] = 0x10035 ^ 0x10027;
        a_0.D[0xCEB3 ^ 0xCEF2] = 0xCEFD ^ 0xCEF2;
        a_0.D[0x2186 ^ 0x20CF] = 0xFFFF0400 ^ 0x20CF;
        a_0.D[0x5FBF ^ 0x5FFB] = 0xFFFFA01B ^ 0x5FFB;
        a_0.D[0xD9E6 ^ 0xD863] = 0x6F41 ^ 0xD863;
        a_0.D[0xCF2D ^ 0xCE4F] = 0x46AD ^ 0xCE4F;
        a_0.D[0xEDA8 ^ 0xED26] = 0xED3F ^ 0xED26;
        a_0.D[0x290F ^ 0x29DD] = 0xC978 ^ 0x29DD;
        a_0.D[0xFDDC ^ 0xFC97] = 0x3099 ^ 0xFC97;
        a_0.D[0xB251 ^ 0xB24D] = 0xFFFF4DDA ^ 0xB24D;
        a_0.D[0x2106 ^ 0x213E] = 0x2150 ^ 0x213E;
        a_0.D[0x976E ^ 0x9635] = 0x8A28 ^ 0x9635;
        a_0.D[0xE192 ^ 0xE0F1] = 0xC93A ^ 0xE0F1;
        a_0.D[0xF651 ^ 0xF6E0] = 0xF6F1 ^ 0xF6E0;
        a_0.D[0xBBF9 ^ 0xBB2E] = 0x4EE7 ^ 0xBB2E;
        a_0.D[0x9EAC ^ 0x9F86] = 0xF952 ^ 0x9F86;
        a_0.D[0x276 ^ 0x313] = 0xFFFFD52C ^ 0x313;
        a_0.D[0x999C ^ 0x99FC] = 0xFFFF662C ^ 0x99FC;
        a_0.D[0xA5F1 ^ 0xA5D2] = 0xA5A5 ^ 0xA5D2;
        a_0.D[0xB112 ^ 0xB1D7] = 0xFFFF4E7C ^ 0xB1D7;
        a_0.D[0x6F1E ^ 0x6E00] = 0x7A15 ^ 0x6E00;
        a_0.D[0x5EE6 ^ 0x5E88] = 0xFFFFA158 ^ 0x5E88;
        a_0.D[0xBCC6 ^ 0xBDC5] = 0x1B9CC ^ 0xBDC5;
        a_0.D[0x7FCC ^ 0x7FCC] = 0xFFFF803B ^ 0x7FCC;
        a_0.D[0xAB45 ^ 0xAB6C] = 0xAB70 ^ 0xAB6C;
        a_0.D[0x2EAF ^ 0x2F80] = 0x7BBD ^ 0x2F80;
        a_0.D[0x73EF ^ 0x7353] = 0x738B ^ 0x7353;
        a_0.D[0x3B17 ^ 0x3A3C] = 0xE3B1 ^ 0x3A3C;
        a_0.D[0x939B ^ 0x92FD] = 0xBB23 ^ 0x92FD;
        a_0.D[0xC015 ^ 0xC197] = 0x36A8 ^ 0xC197;
        a_0.D[0xCA9B ^ 0xCA57] = 0xCA56 ^ 0xCA57;
        a_0.D[0x1D74 ^ 0x1D28] = 0x1D27 ^ 0x1D28;
        a_0.D[0x4C7F ^ 0x4CBB] = 0xFFFFB36D ^ 0x4CBB;
        a_0.D[0x4886 ^ 0x4800] = 0xE171 ^ 0x4800;
        a_0.D[0x2A06 ^ 0x2A53] = 0x2A60 ^ 0x2A53;
        a_0.D[0xD02E ^ 0xD082] = 0xD0C5 ^ 0xD082;
        a_0.D[0x58BF ^ 0x59EA] = 0xD05B ^ 0x59EA;
        a_0.D[0x9F7A ^ 0x9F07] = 0x93C1 ^ 0x9F07;
        a_0.D[0xB9FC ^ 0xB8AC] = 0x9352 ^ 0xB8AC;
        a_0.D[0x41D0 ^ 0x4093] = 0x2871 ^ 0x4093;
        a_0.D[0x5E67 ^ 0x5EE4] = 0xE2AB ^ 0x5EE4;
        a_0.D[0x3630 ^ 0x376F] = 0xBF86 ^ 0x376F;
        a_0.D[0xDA4 ^ 0xDEF] = 0xFFFFF27C ^ 0xDEF;
        a_0.D[0x5CF5 ^ 0x5C89] = 0x5DA5 ^ 0x5C89;
        a_0.D[0x1AA8 ^ 0x1A34] = 0x1A39 ^ 0x1A34;
        a_0.D[0xD028 ^ 0xD00C] = 0xD02C ^ 0xD00C;
        a_0.D[0x2E9C ^ 0x2FEC] = 0x87C9 ^ 0x2FEC;
        a_0.D[0x75CE ^ 0x7446] = 0xF2BA ^ 0x7446;
        a_0.D[0x29D7 ^ 0x294C] = 0x2907 ^ 0x294C;
        a_0.D[0x5C34 ^ 0x5CD4] = 0xCC6E ^ 0x5CD4;
        a_0.D[0xFDA7 ^ 0xFD9A] = 0xFDFA ^ 0xFD9A;
        a_0.D[0xE0B0 ^ 0xE0AE] = 0xFFFF1F65 ^ 0xE0AE;
        a_0.D[0x8DD0 ^ 0x8D2F] = 0x2566 ^ 0x8D2F;
        a_0.D[0x40D9 ^ 0x40BC] = 0x4097 ^ 0x40BC;
        a_0.D[0x6EBD ^ 0x6E37] = 0xAA48 ^ 0x6E37;
        a_0.D[0xE3F1 ^ 0xE31E] = 0x3650 ^ 0xE31E;
        a_0.D[0xC998 ^ 0xC90B] = 0xFFFF3695 ^ 0xC90B;
        a_0.D[0xD7A8 ^ 0xD7F6] = 0xFFFF285D ^ 0xD7F6;
        a_0.D[0x10789 ^ 0x10732] = 0x10749 ^ 0x10732;
        a_0.D[0x18E6 ^ 0x19B2] = 0x902B ^ 0x19B2;
        a_0.D[0xC939 ^ 0xC9BB] = 0x56B4 ^ 0xC9BB;
        a_0.D[0x76EA ^ 0x77F6] = 0x63E3 ^ 0x77F6;
        a_0.D[0xFF47 ^ 0xFE0B] = 0x320B ^ 0xFE0B;
        a_0.D[0x1BCB ^ 0x1B04] = 0xD069 ^ 0x1B04;
        a_0.D[0xA5E2 ^ 0xA562] = 0xAA0F ^ 0xA562;
        a_0.D[0x325A ^ 0x3232] = 0xFFFFCDCA ^ 0x3232;
        a_0.D[0x86FD ^ 0x86AB] = 0xFFFF790E ^ 0x86AB;
        a_0.D[0x51AE ^ 0x5160] = 0x9A1D ^ 0x5160;
        a_0.D[0x9F0F ^ 0x9E68] = 0xF93 ^ 0x9E68;
        a_0.D[0x9EB8 ^ 0x9ED1] = 0x9EC8 ^ 0x9ED1;
        a_0.D[0xCC4F ^ 0xCC0D] = 0xCC0C ^ 0xCC0D;
        a_0.D[0xD4C8 ^ 0xD582] = 0xEF0 ^ 0xD582;
        a_0.D[0x1D0B ^ 0x1DDF] = 0xE813 ^ 0x1DDF;
        a_0.D[0x6579 ^ 0x6521] = 0xFFFF9AD6 ^ 0x6521;
        a_0.D[0x4D22 ^ 0x4C13] = 0xFFFFE79D ^ 0x4C13;
        a_0.D[0x6EE7 ^ 0x6FF6] = 0xF628 ^ 0x6FF6;
        a_0.D[0xF0D5 ^ 0xF1D8] = 0x4823 ^ 0xF1D8;
        a_0.D[0xD6FC ^ 0xD7FD] = 0x1D3F4 ^ 0xD7FD;
        a_0.D[0x10E4 ^ 0x1069] = 0x100E ^ 0x1069;
        a_0.D[0x5897 ^ 0x5993] = 0x62BE ^ 0x5993;
        a_0.D[0xE439 ^ 0xE51D] = 0x25C1 ^ 0xE51D;
        a_0.D[0xACF ^ 0xA3C] = 0x4741 ^ 0xA3C;
        a_0.D[0x7E1 ^ 0x6DA] = 0x10415 ^ 0x6DA;
        a_0.D[0x9141 ^ 0x919A] = 0xADFD ^ 0x919A;
        a_0.D[0xD9C1 ^ 0xD89C] = 0xFFFF3B00 ^ 0xD89C;
        a_0.D[0x10A7D ^ 0x10B2F] = 0x120D1 ^ 0x10B2F;
        a_0.D[0x3D66 ^ 0x3DA7] = 0x3DCE ^ 0x3DA7;
        a_0.D[0x2E85 ^ 0x2E71] = 0xAD99 ^ 0x2E71;
        a_0.D[0x3CCF ^ 0x3CDB] = 0x3CF2 ^ 0x3CDB;
        a_0.D[0xD01F ^ 0xD0A8] = 0xD0EA ^ 0xD0A8;
        a_0.D[0xBD56 ^ 0xBD79] = 0xBD14 ^ 0xBD79;
        a_0.D[0xD51B ^ 0xD5EA] = 0x9897 ^ 0xD5EA;
        a_0.D[0x3E9D ^ 0x3E87] = 0x3E9E ^ 0x3E87;
        a_0.D[0x301D ^ 0x30EB] = 0xFFFF4CDF ^ 0x30EB;
        a_0.D[0x9669 ^ 0x9610] = 0x9612 ^ 0x9610;
        a_0.D[0x777E ^ 0x77D8] = 0xFFFF886C ^ 0x77D8;
        a_0.D[0xC338 ^ 0xC3A7] = 0xC3E3 ^ 0xC3A7;
        a_0.D[0x319C ^ 0x30F0] = 0x532D ^ 0x30F0;
        a_0.D[0xB180 ^ 0xB185] = 0xFFFF4E73 ^ 0xB185;
        a_0.D[0x513B ^ 0x5150] = 0xFFFFAE90 ^ 0x5150;
        a_0.D[0xA72 ^ 0xA7F] = 0xA15 ^ 0xA7F;
        a_0.D[0x39DA ^ 0x39C9] = 0x39EF ^ 0x39C9;
        a_0.D[0xCC1E ^ 0xCC5E] = 0xCC66 ^ 0xCC5E;
        a_0.D[0xA61 ^ 0xA62] = 0xFFFFF5EF ^ 0xA62;
        a_0.D[0x2628 ^ 0x274C] = 0xE92 ^ 0x274C;
        a_0.D[0x10401 ^ 0x1053C] = 0xFFFFF80C ^ 0x1053C;
        a_0.D[0x4044 ^ 0x40AE] = 0xFFFF10F6 ^ 0x40AE;
        a_0.D[0x8E39 ^ 0x8F4D] = 0xF3AA ^ 0x8F4D;
        a_0.D[0xDEC4 ^ 0xDFD7] = 0xB7A0 ^ 0xDFD7;
        a_0.D[0x8476 ^ 0x84CB] = 0xFFFF7B4D ^ 0x84CB;
        a_0.D[0x9D9A ^ 0x9D7F] = 0x235C ^ 0x9D7F;
        a_0.D[0x10D7E ^ 0x10D82] = 0x1A5CB ^ 0x10D82;
        a_0.D[0x4D1C ^ 0x4D23] = 0x4D44 ^ 0x4D23;
        a_0.D[0x398A ^ 0x3984] = 0x39CB ^ 0x3984;
        a_0.D[0x997E ^ 0x99DC] = 0x99EA ^ 0x99DC;
        a_0.D[0x572C ^ 0x5783] = 0xFFFFA820 ^ 0x5783;
        a_0.D[0x1338 ^ 0x1225] = 0x607 ^ 0x1225;
        a_0.D[0xD4FD ^ 0xD4BE] = 0xD4FF ^ 0xD4BE;
        a_0.D[0xFF8A ^ 0xFF30] = 0xFF63 ^ 0xFF30;
        a_0.D[0x138 ^ 0x4F] = 0xB976 ^ 0x4F;
        a_0.D[0xA54E ^ 0xA519] = 0xFFFF5A96 ^ 0xA519;
        a_0.D[0x23FA ^ 0x2313] = 0x8CC5 ^ 0x2313;
        a_0.D[0x7D0B ^ 0x7D10] = 0x7DB4 ^ 0x7D10;
        a_0.D[0x4B15 ^ 0x4B6A] = 0xC4C6 ^ 0x4B6A;
        a_0.D[0x36B5 ^ 0x36EE] = 0x36FD ^ 0x36EE;
        a_0.D[0x3A89 ^ 0x3A0E] = 0xABD ^ 0x3A0E;
        a_0.D[0x2A2C ^ 0x2A82] = 0xFFFFD559 ^ 0x2A82;
        a_0.D[0x85DA ^ 0x85AB] = 0xFFFF7A46 ^ 0x85AB;
        a_0.D[0x979A ^ 0x968F] = 0xFE8A ^ 0x968F;
        a_0.D[0xF79A ^ 0xF7EE] = 0xF79C ^ 0xF7EE;
        a_0.D[0xB68F ^ 0xB6B1] = 0xB6FA ^ 0xB6B1;
        a_0.D[0xED98 ^ 0xED28] = 0xFFFF12DC ^ 0xED28;
        a_0.D[0x1514 ^ 0x15B5] = 0x159C ^ 0x15B5;
        a_0.D[0xC5BD ^ 0xC5F4] = 0xFFFF3A44 ^ 0xC5F4;
        a_0.D[0xF11E ^ 0xF1B6] = 0xFFFF0E61 ^ 0xF1B6;
        a_0.D[0xBFF8 ^ 0xBECB] = 0x7737 ^ 0xBECB;
        a_0.D[0x80A5 ^ 0x8079] = 0x90E2 ^ 0x8079;
        a_0.D[0xB5BF ^ 0xB5C4] = 0xB5C4 ^ 0xB5C4;
        a_0.D[0x10461 ^ 0x104F7] = 0x104CD ^ 0x104F7;
        a_0.D[0x700 ^ 0x785] = 0x6CF4 ^ 0x785;
        a_0.D[0xC8D8 ^ 0xC9ED] = 0x5E ^ 0xC9ED;
        a_0.D[0xD91A ^ 0xD955] = 0xD977 ^ 0xD955;
        a_0.D[0x785E ^ 0x7872] = 0x781D ^ 0x7872;
        a_0.D[0xBB98 ^ 0xBB45] = 0xABD9 ^ 0xBB45;
        a_0.D[0xE530 ^ 0xE5F3] = 0xFFFF1A08 ^ 0xE5F3;
        a_0.D[0x10D2E ^ 0x10D31] = 0xFFFEF2C8 ^ 0x10D31;
        a_0.D[0xB7E ^ 0xA14] = 0x9BE3 ^ 0xA14;
        a_0.D[0xF5E7 ^ 0xF5D7] = 0xFFFF0A82 ^ 0xF5D7;
        a_0.D[0xD8B6 ^ 0xD8DB] = 0xD8E8 ^ 0xD8DB;
        a_0.D[0x333 ^ 0x227] = 0x6A47 ^ 0x227;
        a_0.D[0x5E8 ^ 0x5BA] = 0xFFFFFA23 ^ 0x5BA;
        a_0.D[0x4AAB ^ 0x4AF1] = 0xFFFFB511 ^ 0x4AF1;
        a_0.D[0x3FA3 ^ 0x3F95] = 0xFFFFC00B ^ 0x3F95;
        a_0.D[0x3543 ^ 0x3574] = 0xFFFFCA91 ^ 0x3574;
        a_0.D[0xC0A6 ^ 0xC075] = 0x20E1 ^ 0xC075;
        a_0.D[0xDE76 ^ 0xDE04] = 0xDE34 ^ 0xDE04;
        a_0.D[0x8A86 ^ 0x8A1E] = 0xFFFF75C4 ^ 0x8A1E;
        a_0.D[0xAB71 ^ 0xAA63] = 0x339D ^ 0xAA63;
        a_0.D[0x9FD3 ^ 0x9F37] = 0x211F ^ 0x9F37;
        a_0.D[0x5D2F ^ 0x5DE4] = 0x5DE5 ^ 0x5DE4;
        a_0.D[0x7492 ^ 0x742D] = 0xFFFF8BD0 ^ 0x742D;
        a_0.D[0xC837 ^ 0xC81A] = 0xC8D5 ^ 0xC81A;
        a_0.D[0xBA60 ^ 0xBA66] = 0xBA7D ^ 0xBA66;
        a_0.D[0xABBF ^ 0xAAB6] = 0x7DF0 ^ 0xAAB6;
        a_0.D[0x9A1B ^ 0x9AF5] = 0xFFFFB036 ^ 0x9AF5;
        a_0.D[0xD1A8 ^ 0xD127] = 0xD174 ^ 0xD127;
        a_0.D[0x10988 ^ 0x10951] = 0x13536 ^ 0x10951;
        a_0.D[0xE348 ^ 0xE3FE] = 0xFFFF1C16 ^ 0xE3FE;
        a_0.D[0x3220 ^ 0x3341] = 0xBBDA ^ 0x3341;
        a_0.D[0xE6C4 ^ 0xE660] = 0xE674 ^ 0xE660;
        a_0.D[0x67AD ^ 0x6621] = 0x53B8 ^ 0x6621;
        a_0.D[0xABE6 ^ 0xAAD6] = 0xFEEE ^ 0xAAD6;
        a_0.D[0x3D47 ^ 0x3D92] = 0xC85B ^ 0x3D92;
        a_0.D[0x79A9 ^ 0x796B] = 0x7966 ^ 0x796B;
        a_0.D[0xA3FA ^ 0xA320] = 0x9F1E ^ 0xA320;
        a_0.D[0xE774 ^ 0xE7FD] = 0x9243 ^ 0xE7FD;
        a_0.D[0xB2EB ^ 0xB38B] = 0x3B69 ^ 0xB38B;
        a_0.D[0x5404 ^ 0x553D] = 0x16F7 ^ 0x553D;
        a_0.D[0x19CA ^ 0x1933] = 0xC372 ^ 0x1933;
        a_0.D[0xDBE ^ 0xDE1] = 0xDFF ^ 0xDE1;
        a_0.D[0xC0AD ^ 0xC004] = 0xFFFF3FA1 ^ 0xC004;
        a_0.D[0x7EE5 ^ 0x7E6D] = 0xCB78 ^ 0x7E6D;
        a_0.D[0xA86D ^ 0xA914] = 0xFFFFEF9E ^ 0xA914;
        a_0.D[0xC24 ^ 0xC57] = 0xC35 ^ 0xC57;
        a_0.D[0xF198 ^ 0xF1AA] = 0xF1FF ^ 0xF1AA;
        a_0.D[0x114B ^ 0x1161] = 0xFFFFEE98 ^ 0x1161;
        a_0.D[0xEDF2 ^ 0xECB6] = 0x844D ^ 0xECB6;
        a_0.D[0x50AF ^ 0x50CE] = 0x50EF ^ 0x50CE;
        a_0.D[0xFE3F ^ 0xFE5C] = 0xFFFF019E ^ 0xFE5C;
        a_0.D[0x4185 ^ 0x41B1] = 0x41A5 ^ 0x41B1;
        a_0.D[0x61D4 ^ 0x6146] = 0x61E7 ^ 0x6146;
        a_0.D[0x1B96 ^ 0x1B4E] = 0x272A ^ 0x1B4E;
        a_0.D[0x4304 ^ 0x4285] = 0xB580 ^ 0x4285;
        a_0.D[0x51E7 ^ 0x50C5] = 0x2EAB ^ 0x50C5;
        a_0.D[0xD267 ^ 0xD2F7] = 0xD2EF ^ 0xD2F7;
        a_0.D[0x9E1E ^ 0x9EFD] = 0xE4F ^ 0x9EFD;
        a_0.D[0x49D2 ^ 0x48E0] = 0x1CD8 ^ 0x48E0;
        a_0.D[0x100B6 ^ 0x101F1] = 0x1DA84 ^ 0x101F1;
        a_0.D[0xFD89 ^ 0xFD4F] = 0xFD3F ^ 0xFD4F;
        a_0.D[0xD3AA ^ 0xD28D] = 0xB459 ^ 0xD28D;
        a_0.D[0xE4BF ^ 0xE49F] = 0xFFFF1B4E ^ 0xE49F;
        a_0.D[0x586D ^ 0x593B] = 0xD0A2 ^ 0x593B;
        a_0.D[0x9849 ^ 0x9846] = 0xFFFF67E7 ^ 0x9846;
        a_0.D[0xFA13 ^ 0xFA75] = 0xFA4D ^ 0xFA75;
        a_0.D[0xA64A ^ 0xA748] = 0x1A355 ^ 0xA748;
        a_0.D[0x10F46 ^ 0x10E46] = 0xA4B ^ 0x10E46;
        a_0.D[0xA82F ^ 0xA925] = 0x7E16 ^ 0xA925;
        a_0.D[0x85B ^ 0x8E5] = 0x89B ^ 0x8E5;
        a_0.D[0x4126 ^ 0x4104] = 0xFFFFBEDD ^ 0x4104;
        a_0.D[0x8207 ^ 0x82D7] = 0x6245 ^ 0x82D7;
        a_0.D[0x1498 ^ 0x14C8] = 0x14FB ^ 0x14C8;
        a_0.D[0xC709 ^ 0xC620] = 0xA0C5 ^ 0xC620;
        a_0.D[0x3397 ^ 0x3280] = 0x13B39 ^ 0x3280;
        a_0.D[0xABFE ^ 0xAAF0] = 0x1312 ^ 0xAAF0;
        a_0.D[0x9955 ^ 0x98D8] = 0xAD7E ^ 0x98D8;
        a_0.D[0x7863 ^ 0x79E4] = 0xFF0A ^ 0x79E4;
        a_0.D[0x5323 ^ 0x5366] = 0xFFFFACBE ^ 0x5366;
        a_0.D[0x1A6 ^ 0x131] = 0x16F ^ 0x131;
        a_0.D[0x360F ^ 0x3757] = 0xB6DD ^ 0x3757;
        a_0.D[0x80F8 ^ 0x80B6] = 0x80A7 ^ 0x80B6;
        a_0.D[0xDE73 ^ 0xDF49] = 0x9CA0 ^ 0xDF49;
        a_0.D[0xC07C ^ 0xC0D9] = 0xC081 ^ 0xC0D9;
        a_0.D[0x6F33 ^ 0x6F44] = 0x6F45 ^ 0x6F44;
        a_0.D[0xD0A0 ^ 0xD0D8] = 0xD0D8 ^ 0xD0D8;
        a_0.D[0x947F ^ 0x9525] = 0x14AF ^ 0x9525;
        a_0.D[0x8501 ^ 0x841A] = 0x9007 ^ 0x841A;
        a_0.D[0x708 ^ 0x7D6] = 0xFFFFE8DB ^ 0x7D6;
        a_0.D[0x2D2C ^ 0x2D9F] = 0x2DEB ^ 0x2D9F;
        a_0.D[0x4811 ^ 0x48BA] = 0x48FF ^ 0x48BA;
        a_0.D[0x3F12 ^ 0x3F4B] = 0x3F24 ^ 0x3F4B;
        a_0.D[0x5B5B ^ 0x5BAC] = 0xD845 ^ 0x5BAC;
        a_0.D[0xA19E ^ 0xA1EB] = 0xA1E8 ^ 0xA1EB;
        a_0.D[0x7DC7 ^ 0x7D5D] = 0x7D78 ^ 0x7D5D;
        a_0.D[0xD2FA ^ 0xD2EF] = 0xD2ED ^ 0xD2EF;
        a_0.D[0xE227 ^ 0xE365] = 0xAFB0 ^ 0xE365;
        a_0.D[0x1310 ^ 0x122F] = 0x5EF8 ^ 0x122F;
        a_0.D[0x2521 ^ 0x2461] = 0x68B4 ^ 0x2461;
        a_0.D[0x4BC5 ^ 0x4BF0] = 0xFFFFB463 ^ 0x4BF0;
        a_0.D[0xCDB ^ 0xCF0] = 0xFFFFF35A ^ 0xCF0;
        a_0.D[0xE051 ^ 0xE147] = 0x8927 ^ 0xE147;
        a_0.D[0x95C2 ^ 0x957B] = 0x95D5 ^ 0x957B;
        a_0.D[0x5798 ^ 0x56BE] = 0x9662 ^ 0x56BE;
        a_0.D[0xD967 ^ 0xD85B] = 0x1DA8F ^ 0xD85B;
        a_0.D[0xE896 ^ 0xE919] = 0x85B ^ 0xE919;
        a_0.D[0x78F ^ 0x7C9] = 0x7BB ^ 0x7C9;
        a_0.D[0x98AD ^ 0x98BF] = 0x98AE ^ 0x98BF;
        a_0.D[0xDB37 ^ 0xDA49] = 0x6C4A ^ 0xDA49;
        a_0.D[0x9429 ^ 0x94C4] = 0x418A ^ 0x94C4;
        a_0.D[0xF819 ^ 0xF8D9] = 0xF89F ^ 0xF8D9;
        a_0.D[0xDA69 ^ 0xDA4C] = 0xFFFF25BB ^ 0xDA4C;
        a_0.D[0xC834 ^ 0xC89E] = 0xC88C ^ 0xC89E;
        a_0.D[0xA04F ^ 0xA150] = 0xDF3F ^ 0xA150;
        a_0.D[0x29FB ^ 0x2892] = 0xB979 ^ 0x2892;
        a_0.D[0xCCCB ^ 0xCC6B] = 0xFFFF33CC ^ 0xCC6B;
        a_0.D[0x63A1 ^ 0x6334] = 0x6351 ^ 0x6334;
        a_0.D[0x3E31 ^ 0x3F2B] = 0x13683 ^ 0x3F2B;
        a_0.D[0xEFF8 ^ 0xEFB2] = 0xEFAD ^ 0xEFB2;
        a_0.D[0x7CCC ^ 0x7C39] = 0xFFD0 ^ 0x7C39;
        a_0.D[0x8FDC ^ 0x8E99] = 0xE65B ^ 0x8E99;
        a_0.D[0x7B04 ^ 0x7A72] = 0x695 ^ 0x7A72;
        a_0.D[0xC7BB ^ 0xC6FA] = 0xFFFF75F1 ^ 0xC6FA;
        a_0.D[0xCFD6 ^ 0xCE9E] = 0x15EC ^ 0xCE9E;
        a_0.D[0x6E69 ^ 0x6E2E] = 0xFFFF91F8 ^ 0x6E2E;
        a_0.D[0x3E2A ^ 0x3F22] = 0xE86D ^ 0x3F22;
        a_0.D[0x108D8 ^ 0x10825] = 0x1A06C ^ 0x10825;
        a_0.D[0x8BB7 ^ 0x8B9F] = 0xFFFF7475 ^ 0x8B9F;
        a_0.D[0x7AB4 ^ 0x7BCE] = 0xC2FE ^ 0x7BCE;
        a_0.D[0xF8FD ^ 0xF83A] = 0xF81C ^ 0xF83A;
        a_0.D[0x655F ^ 0x65C2] = 0x65DC ^ 0x65C2;
        a_0.D[0xA1E ^ 0xA92] = 0xAFC ^ 0xA92;
        a_0.D[0x1056B ^ 0x105BA] = 0x1E52E ^ 0x105BA;
        a_0.D[0xA9E3 ^ 0xA999] = 0xA999 ^ 0xA999;
        a_0.D[0x8F66 ^ 0x8F0A] = 0x8F01 ^ 0x8F0A;
        a_0.D[0xB63A ^ 0xB622] = 0xB627 ^ 0xB622;
        a_0.D[0x1F86 ^ 0x1EA3] = 0xDE1B ^ 0x1EA3;
        a_0.D[0xC1CF ^ 0xC127] = 0x6EFD ^ 0xC127;
        a_0.D[0xE47F ^ 0xE4A0] = 0xF43C ^ 0xE4A0;
        a_0.D[0x53AD ^ 0x53E0] = 0x53EE ^ 0x53E0;
        a_0.D[0x7B01 ^ 0x7A73] = 0xD256 ^ 0x7A73;
        a_0.D[0x82C0 ^ 0x83CF] = 0x3A34 ^ 0x83CF;
        a_0.D[0x7723 ^ 0x77C5] = 0xC9A5 ^ 0x77C5;
        a_0.D[0xD85 ^ 0xD7D] = 0xD736 ^ 0xD7D;
        a_0.D[0x4D4A ^ 0x4D28] = 0x4D3A ^ 0x4D28;
        a_0.D[0x10058 ^ 0x10101] = 0x180F7 ^ 0x10101;
        a_0.D[0x9284 ^ 0x939C] = 0x19A34 ^ 0x939C;
        a_0.D[0xD06A ^ 0xD1EE] = 0x6680 ^ 0xD1EE;
        a_0.D[0x88CB ^ 0x89B3] = 0x3083 ^ 0x89B3;
        a_0.D[0xF846 ^ 0xF8B8] = 0xFFFFAF4B ^ 0xF8B8;
        a_0.D[0xBAA0 ^ 0xBAAB] = 0xFFFF450A ^ 0xBAAB;
        a_0.D[0x4F63 ^ 0x4E68] = 0x992E ^ 0x4E68;
        a_0.D[0xD9E4 ^ 0xD8B8] = 0xC4BF ^ 0xD8B8;
        a_0.D[0xBEC7 ^ 0xBE6A] = 0xFFFF4182 ^ 0xBE6A;
        a_0.D[0x4467 ^ 0x4463] = 0xFFFFBBFB ^ 0x4463;
        a_0.D[0xCE17 ^ 0xCF66] = 0xFFFF98F9 ^ 0xCF66;
        a_0.D[0x9AD3 ^ 0x9BFD] = 0x4273 ^ 0x9BFD;
        a_0.D[0xEE78 ^ 0xEE6E] = 0xEE14 ^ 0xEE6E;
        a_0.D[0xEC37 ^ 0xEC3F] = 0xEC31 ^ 0xEC3F;
        a_0.D[0x42AD ^ 0x439A] = 0x63 ^ 0x439A;
        a_0.D[0x71B8 ^ 0x713C] = 0x156C ^ 0x713C;
        a_0.D[0x69BF ^ 0x6954] = 0xC682 ^ 0x6954;
        a_0.D[0x14D ^ 0x127] = 0xFFFFFEEE ^ 0x127;
        a_0.D[0xF8C6 ^ 0xF892] = 0xFFFF0705 ^ 0xF892;
        a_0.D[0x9EEC ^ 0x9EFC] = 0x9EE5 ^ 0x9EFC;
        a_0.D[0x327B ^ 0x3377] = 0x8A8E ^ 0x3377;
        a_0.D[0x19F7 ^ 0x1943] = 0x1923 ^ 0x1943;
        a_0.D[0xA585 ^ 0xA40F] = 0x22F3 ^ 0xA40F;
        a_0.D[0xE909 ^ 0xE9BB] = 0xFFFF167E ^ 0xE9BB;
        a_0.D[0x5C60 ^ 0x5D0E] = 0x3ED3 ^ 0x5D0E;
        a_0.D[0x5EE0 ^ 0x5ED3] = 0xFFFFA152 ^ 0x5ED3;
        a_0.D[0x947D ^ 0x95FE] = 0x2286 ^ 0x95FE;
        a_0.D[0xA04A ^ 0xA0E9] = 0xFFFF5F3A ^ 0xA0E9;
        a_0.D[0x568D ^ 0x5706] = 0x6281 ^ 0x5706;
        a_0.D[0xA3BD ^ 0xA2D2] = 0xAEA ^ 0xA2D2;
        a_0.D[0xAA18 ^ 0xAA89] = 0xFFFF556C ^ 0xAA89;
        a_0.D[0x707C ^ 0x7013] = 0x7020 ^ 0x7013;
        a_0.D[0x1E53 ^ 0x1EA9] = 0xC4B5 ^ 0x1EA9;
        a_0.D[0x77D9 ^ 0x7694] = 0xBAA7 ^ 0x7694;
        a_0.D[0xF7AA ^ 0xF758] = 0xFFFF45FF ^ 0xF758;
        a_0.D[0x66D5 ^ 0x6793] = 0xF68 ^ 0x6793;
        a_0.D[0x8003 ^ 0x809D] = 0xFFFF7F71 ^ 0x809D;
        a_0.D[0xBA6F ^ 0xBA76] = 0xFFFF45BA ^ 0xBA76;
        a_0.D[0x6B21 ^ 0x6BD1] = 0x26A3 ^ 0x6BD1;
        a_0.D[0xEA3 ^ 0xE84] = 0xFFFFF152 ^ 0xE84;
        a_0.D[0xEAA6 ^ 0xEBD5] = 0x9721 ^ 0xEBD5;
        a_0.D[0x82EC ^ 0x83D8] = 0x4A3C ^ 0x83D8;
        a_0.D[0x10A70 ^ 0x10A17] = 0x10A27 ^ 0x10A17;
        a_0.D[0x280E ^ 0x2938] = 0xE0DC ^ 0x2938;
        a_0.D[0x38CC ^ 0x39B7] = 0x8FA8 ^ 0x39B7;
        a_0.D[0xEC69 ^ 0xEC7E] = 0xFFFF13FB ^ 0xEC7E;
        a_0.D[0x4408 ^ 0x4575] = 0xFFFF0CBA ^ 0x4575;
        a_0.D[0x2EE2 ^ 0x2ED8] = 0x2EEE ^ 0x2ED8;
        a_0.D[0x10002 ^ 0x10024] = 0x1002D ^ 0x10024;
        a_0.D[0x107F0 ^ 0x107A3] = 0x107DE ^ 0x107A3;
        a_0.D[0xB0DC ^ 0xB0E7] = 0xB0AF ^ 0xB0E7;
        a_0.D[0xBF01 ^ 0xBE2C] = 0xFFFF9833 ^ 0xBE2C;
        a_0.D[0x917A ^ 0x91E3] = 0xFFFF6E3C ^ 0x91E3;
        a_0.D[0xC659 ^ 0xC775] = 0x1EFB ^ 0xC775;
        a_0.D[0xFBE9 ^ 0xFABE] = 0x7B3E ^ 0xFABE;
        a_0.D[0xC5F ^ 0xC0E] = 0xFFFFF3E5 ^ 0xC0E;
    }
}

