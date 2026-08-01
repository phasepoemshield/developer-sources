/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.draggable;

import java.awt.Color;
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
import kotakbaz.rain.client.draggable.D;
import kotakbaz.rain.client.draggable.a;
import kotakbaz.rain.client.draggable.b_0;
import kotakbaz.rain.client.draggable.c;
import kotakbaz.rain.client.draggable.d;
import kotakbaz.rain.client.draggable.d_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotakbaz.rain.client.util.animations.Easings;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.client.util.render.RenderUtils;
import kotakbaz.rain.client.util.render.display.BasicRectRenderer;
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline;
import kotakbaz.rain.client.util.render.font.E;
import kotakbaz.rain.client.util.render.font.Font;
import kotakbaz.rain.module.modules.hud.container.HudStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.client.gui.screen.ChatScreen;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.glfw.GLFW;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002-.B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u0003J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010+\u00a8\u0006/"}, d2={"Lkotakbaz/rain/client/draggable/HudAlignment;", "", "<init>", "()V", "Lkotakbaz/rain/client/draggable/Draggable;", "drag", "", "x", "y", "Lkotakbaz/rain/client/draggable/HudAlignment$Pos;", "snap", "(Lkotakbaz/rain/client/draggable/Draggable;FF)Lkotakbaz/rain/client/draggable/HudAlignment$Pos;", "", "render", "pos", "size", "", "vertical", "Lkotakbaz/rain/client/draggable/HudAlignment$Axis;", "snapAxis", "(FFZ)Lkotakbaz/rain/client/draggable/HudAlignment$Axis;", "w", "h", "a", "line", "(FFFFF)V", "width", "height", "hint", "(FFF)V", "clearGuides", "altDown", "()Z", "SNAP", "F", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "alpha", "Lkotakbaz/rain/client/util/animations/AnimationUtil;", "active", "Lkotakbaz/rain/client/draggable/Draggable;", "free", "Z", "guideX", "Ljava/lang/Float;", "guideY", "Pos", "Axis", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nHudAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HudAlignment.kt\nkotakbaz/rain/client/draggable/HudAlignment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n1#2:134\n296#3,2:135\n1915#3,2:137\n*S KotlinDebug\n*F\n+ 1 HudAlignment.kt\nkotakbaz/rain/client/draggable/HudAlignment\n*L\n41#1:135,2\n81#1:137,2\n*E\n"})
public final class Draggable {
    @NotNull
    public static final Draggable INSTANCE;
    private static final float a = 5.0f;
    @NotNull
    private static final AnimationUtil A;
    @Nullable
    private static c b;
    private static boolean B;
    @Nullable
    private static Float c;
    @Nullable
    private static Float C;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    private Draggable() {
    }

    @NotNull
    public final d_0 snap(@NotNull c drag, float x, float y) {
        long l2 = -6406604205968008469L;
        int n2 = F[0];
        n2 -= F[1];
        Intrinsics.checkNotNullParameter(drag, (String)d[n2 ^= F[2]]);
        b = drag;
        B = this.altDown();
        if (B || drag.getWidth() <= 0.0f || drag.getHeight() <= 0.0f) {
            d d2;
            d d3 = d2 = new d(x, y);
            long l3 = l2;
            int n3 = F[3];
            n3 -= F[4];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= F[5]);
            INSTANCE.clearGuides();
            return d2;
        }
        boolean bl = F[6];
        bl += F[7];
        a a2 = this.snapAxis(x, drag.getWidth(), bl += F[8]);
        boolean bl2 = F[9];
        bl2 += F[10];
        a a3 = this.snapAxis(y, drag.getHeight(), bl2 ^= F[11]);
        c = a2.getGuide();
        C = a3.getGuide();
        return new d(a2.getPos(), a3.getPos());
    }

    public final void render() {
        c c2;
        long l2 = -152852523784891694L;
        long l3 = 3411962525582241863L;
        if (kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof ChatScreen) {
            Object v4;
            block10: {
                Collection<c> collection = kotakbaz.rain.client.draggable.D.INSTANCE.getDraggables().values();
                int n2 = F[12];
                n2 ^= F[13];
                int n3 = F[15];
                n3 -= F[16];
                Intrinsics.checkNotNullExpressionValue(collection, (String)d[n2 -= F[14]] + (String)d[n3 += F[17]]);
                Iterable iterable = collection;
                long l4 = l2;
                int n4 = F[18];
                n4 += F[19];
                l2 = l4 ^ (0L ^ l4) & -1L << (n4 -= F[20]);
                for (Object t2 : iterable) {
                    int n5;
                    c c3 = (c)t2;
                    long l5 = l2;
                    int n6 = F[21];
                    n6 += F[22];
                    l2 = l5 ^ (0L ^ l5) & -1L >>> (n6 -= F[23]);
                    if (c3.isDragging() && c3.getModule().isEnabled()) {
                        int n7 = F[24];
                        n7 += F[25];
                        n5 = n7 -= F[26];
                    } else {
                        int n8 = F[27];
                        n8 ^= F[28];
                        n5 = n8 += F[29];
                    }
                    if (n5 == 0) continue;
                    v4 = t2;
                    break block10;
                }
                v4 = null;
            }
            c2 = v4;
        } else {
            c2 = null;
        }
        c c4 = c2;
        float f2 = A.animate(c4 != null ? 1.0f : 0.0f, 120.0f, new b_0(Easings.INSTANCE));
        if (f2 <= 0.01f) {
            return;
        }
        float f3 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth();
        float f4 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight();
        if (!B) {
            float f5;
            Float f6 = c;
            if (f6 != null) {
                f5 = ((Number)f6).floatValue();
                long l6 = l3;
                int n9 = F[30];
                n9 += F[31];
                l3 = l6 ^ (0L ^ l6) & -1L << (n9 += F[32]);
                INSTANCE.line(f5, 0.0f, 1.0f, f4, f2);
            }
            Float f7 = C;
            if (f7 != null) {
                f5 = ((Number)f7).floatValue();
                long l7 = l3;
                int n10 = F[33];
                n10 += F[34];
                l3 = l7 ^ (0L ^ l7) & -1L << (n10 ^= F[35]);
                INSTANCE.line(0.0f, f5, f3, 1.0f, f2);
            }
        }
        this.hint(f3, f4, f2);
        if (c4 == null) {
            b = null;
        }
    }

    private final a snapAxis(float pos, float size, boolean vertical) {
        long l2 = -281281857792769360L;
        long l3 = -3542201910411278032L;
        int n2 = F[36];
        n2 -= F[37];
        long l4 = l2;
        int n3 = F[39];
        n3 += F[40];
        l2 = l4 ^ ((long)(vertical ? kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledWidth() : kotakbaz.rain.client.extensions.b.getMc().getWindow().getScaledHeight()) << (n2 -= F[38]) ^ l4) & -1L << (n3 ^= F[41]);
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = 5.0f;
        Ref.FloatRef floatRef2 = new Ref.FloatRef();
        Ref.ObjectRef<Float> objectRef = new Ref.ObjectRef<Float>();
        int n4 = F[42];
        n4 += F[43];
        Draggable.snapAxis$test(pos, size, floatRef, floatRef2, objectRef, (float)((int)(l2 >>> (n4 += F[44]))) / 2.0f);
        Collection<c> collection = kotakbaz.rain.client.draggable.D.INSTANCE.getDraggables().values();
        int n5 = F[45];
        n5 -= F[46];
        int n6 = F[48];
        n6 -= F[49];
        Intrinsics.checkNotNullExpressionValue(collection, (String)d[n5 ^= F[47]] + (String)d[n6 += F[50]]);
        Iterable iterable = collection;
        long l5 = l3;
        int n7 = F[51];
        n7 ^= F[52];
        l3 = l5 ^ (0L ^ l5) & -1L << (n7 -= F[53]);
        for (Object t2 : iterable) {
            c c2 = (c)t2;
            long l6 = l3;
            int n8 = F[54];
            n8 ^= F[55];
            l3 = l6 ^ (0L ^ l6) & -1L >>> (n8 += F[56]);
            if (c2 == b || !c2.getModule().isEnabled() || c2.getWidth() <= 0.0f || c2.getHeight() <= 0.0f) continue;
            float f2 = vertical ? c2.getX() : c2.getY();
            float f3 = vertical ? c2.getWidth() : c2.getHeight();
            Draggable.snapAxis$test(pos, size, floatRef, floatRef2, objectRef, f2);
            Draggable.snapAxis$test(pos, size, floatRef, floatRef2, objectRef, f2 + f3 / 2.0f);
            Draggable.snapAxis$test(pos, size, floatRef, floatRef2, objectRef, f2 + f3);
        }
        return new a(pos + floatRef2.element, (Float)objectRef.element);
    }

    private final void line(float x, float y, float w, float h2, float a2) {
        BasicRectRenderer basicRectRenderer = RenderUtils.INSTANCE.getBASIC_RECT().priority(ClientRenderPipeline.HUD_RECT);
        Color color = Color.WHITE;
        int n2 = F[57];
        n2 += F[58];
        Intrinsics.checkNotNullExpressionValue(color, (String)d[n2 -= F[59]]);
        basicRectRenderer.color(ColorUtil.INSTANCE.setAlpha(color, 0.55f * a2)).round(0.0f).draw(x, y, w, h2);
    }

    private final void hint(float width2, float height, float a2) {
        String string;
        if (B) {
            int n2 = F[60];
            n2 ^= F[61];
            int n3 = F[63];
            n3 -= F[64];
            string = (String)d[n2 += F[62]] + (String)d[n3 += F[65]];
        } else {
            int n4 = F[66];
            n4 ^= F[67];
            int n5 = F[69];
            n5 ^= F[70];
            string = (String)d[n4 -= F[68]] + (String)d[n5 -= F[71]];
        }
        String string2 = string;
        float f2 = HudStyle.INSTANCE.scaled(7.5f);
        float f3 = HudStyle.INSTANCE.scaled(8.0f);
        float f4 = HudStyle.INSTANCE.scaled(4.5f);
        int n6 = F[72];
        n6 -= F[73];
        float f5 = kotakbaz.rain.client.util.render.font.E.getWidth$default(Font.INSTANCE.getGS_MEDIUM(), string2, f2, 0.0f, n6 -= F[74], null);
        float f6 = f5 + f3 * 2.0f;
        float f7 = f2 + f4 * 2.0f;
        float f8 = width2 / 2.0f - f6 / 2.0f;
        float f9 = height - 40.0f - f7 - HudStyle.INSTANCE.scaled(18.0f);
        RenderUtils.INSTANCE.getBLURRED_RECT().priority(ClientRenderPipeline.HUD_RECT).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getPANEL_COLOR(), 0.82f * a2)).mix(0.9f).round(f7 / 2.0f).draw(f8, f9, f6, f7);
        Font.INSTANCE.getGS_MEDIUM().priority(ClientRenderPipeline.HUD_TEXT).size(f2).color(ColorUtil.INSTANCE.setAlpha(HudStyle.INSTANCE.getTITLE_COLOR(), a2)).drawText(string2, f8 + f3, f9 + f4 - HudStyle.INSTANCE.scaled(0.6f));
    }

    private final void clearGuides() {
        c = null;
        C = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean altDown() {
        int n2;
        long l2 = kotakbaz.rain.client.extensions.b.getMc().getWindow().getHandle();
        int n3 = F[75];
        n3 += F[76];
        int n4 = F[78];
        n4 -= F[79];
        if (GLFW.glfwGetKey((long)l2, (int)(n3 ^= F[77])) != (n4 ^= F[80])) {
            int n5 = F[81];
            n5 ^= F[82];
            int n6 = F[84];
            n6 ^= F[85];
            if (GLFW.glfwGetKey((long)l2, (int)(n5 += F[83])) != (n6 ^= F[86])) {
                int n7 = F[90];
                n7 -= F[91];
                n2 = n7 += F[92];
                return n2 != 0;
            }
        }
        int n8 = F[87];
        n8 -= F[88];
        n2 = n8 += F[89];
        return n2 != 0;
    }

    private static final void snapAxis$test$anchor(float $target, Ref.FloatRef best, Ref.FloatRef delta, Ref.ObjectRef<Float> guide, float value2) {
        float f2 = Math.abs(value2 - $target);
        if (f2 < best.element) {
            best.element = f2;
            delta.element = $target - value2;
            guide.element = Float.valueOf($target);
        }
    }

    private static final void snapAxis$test(float $pos, float $size, Ref.FloatRef best, Ref.FloatRef delta, Ref.ObjectRef<Float> guide, float target) {
        Draggable.snapAxis$test$anchor(target, best, delta, guide, $pos);
        Draggable.snapAxis$test$anchor(target, best, delta, guide, $pos + $size / 2.0f);
        Draggable.snapAxis$test$anchor(target, best, delta, guide, $pos + $size);
    }

    static {
        Draggable.b();
        long l2 = -7445438824484180343L;
        long l3 = -3298611859023202175L;
        long l4 = 4234367288910105311L;
        long l5 = -783582762596126418L;
        long l6 = -1259462340842502171L;
        long l7 = -4192040341689817927L;
        long l8 = -6959441079239518451L;
        long l9 = -4073551592189635350L;
        long l10 = 6509681170745914847L;
        long l11 = 8683768682562718910L;
        long l12 = -7723863571980725748L;
        long l13 = 782552634680341663L;
        long l14 = -4992343401673909565L;
        long l15 = -1585066725776116267L;
        int n2 = F[93];
        n2 ^= F[94];
        d = new Object[n2 -= F[95]];
        long l16 = l15;
        int n3 = F[96];
        n3 ^= F[97];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= F[98]);
        Object[] objectArray = new Object[F[99]];
        objectArray[Draggable.F[100]] = D;
        objectArray[Draggable.F[101]] = F[102];
        int n4 = F[103];
        Object object = Draggable.A()[F[104]];
        if (object == null) {
            char[] cArray = "\u4952\u494f\u494b\u493c\u4871\u494e\u492f\u4954\u493c\u492d\u4966\u494b\u4889\u492d\u4874\u4884\u492e\u4946\u493f\u4932\u486e\u4951\u4872\u494e\u4932\u494a\u4953\u4940\u4946\u4883\u48db\u4889\u4964\u494d\u493c\u4870\u4951\u4967\u4932\u4963\u4889\u4952\u493e\u4871\u4947\u48e2\u4945\u4930\u4874\u4930\u4966\u4883\u4967\u492b\u4946\u4886\u48e2\u492c\u495c\u4874\u4930\u486f\u4969\u4872\u4889\u4950\u494c\u48e1\u4951\u4966\u4968\u4930\u494d\u4941\u4952\u4943\u4954\u4969\u48de\u4964\u48e1\u4943\u4941\u492b\u4951\u494e\u4872\u48e0\u4964\u4945\u4965\u494f\u486e\u493c\u492c\u494d\u4884\u4932\u486f\u4889\u492f\u48de\u48de\u4874\u4964\u48e0\u4872\u4968\u4969\u4885\u48de\u4949\u493d\u4953\u493f\u4953\u4872\u486b\u494b\u486b\u48dd\u492c\u4943\u4870\u494b\u4950\u4945\u48db\u4943\u493c\u48df\u492d\u493f\u4945\u495c\u4930\u494d\u492e\u48dd\u4966\u48de\u486f\u4883\u48de\u4969\u4946\u4942\u4951\u4944\u4889\u4964\u495c\u4889\u4943\u4885\u4870\u4886\u4950\u493d\u486d\u4932\u4873\u494f\u494b\u4870\u494c\u492f\u4930\u48e2\u4884\u486b\u4932\u496a\u4963\u4873\u4953\u4965\u4948\u4941\u4931\u4883\u492b\u4931\u4870\u486b\u4964\u48de\u494f\u4946\u4871\u493c\u493b\u4952\u486d\u4940\u486f\u494e\u4968\u4966\u48db\u4966\u4950\u4942\u494f\u492d\u4870\u4945\u486b\u4886\u495c\u4963\u4886\u48e2\u4951\u4883\u4885\u4968\u48dd\u495c\u4872\u4873\u494a\u4965\u495c\u486f\u486d\u4944\u48e2\u493e\u494c\u48e1\u492f\u4941\u4945\u4886\u494c\u4874\u494e\u4948\u486d\u48e0\u4931\u4931\u48e0\u486e\u486e\u4940\u4964\u4874\u4930\u495c\u4968\u4966\u492c\u4930\u4940".toCharArray();
            for (int i2 = F[105]; i2 < F[106]; ++i2) {
                int n5 = cArray[i2];
                n5 += F[107];
                n5 += F[108];
                n5 += F[109];
                n5 += F[110];
                n5 ^= F[111];
                n5 -= F[112];
                n5 ^= F[113];
                n5 ^= F[114];
                n5 -= F[115];
                n5 -= F[116];
                n5 -= F[117];
                cArray[i2] = (char)(n5 -= F[118]);
            }
            object = Draggable.A()[Draggable.F[119]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)Draggable.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = F[120];
        n6 -= F[121];
        l6 = l17 ^ (0x7A00000000L ^ l17) & -1L << (n6 -= F[122]);
        long l18 = l13;
        int n7 = F[123];
        n7 += F[124];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= F[125]);
        while (true) {
            int n8 = F[126];
            n8 ^= F[127];
            if ((int)l13 >= (int)(l6 >>> (n8 -= F[128]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = F[129];
            n10 -= F[130];
            int n11 = F[132];
            n11 -= F[133];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= F[131])) & -1L >>> (n11 -= F[134]);
            long l20 = l9;
            int n12 = F[135];
            n12 -= F[136];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= F[137]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = F[138];
            n14 += F[139];
            int n15 = F[141];
            n15 ^= F[142];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= F[140])) & -1L >>> (n15 ^= F[143]);
            int n16 = F[144];
            n16 -= F[145];
            long l22 = l10;
            int n17 = F[147];
            n17 -= F[148];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += F[146]) ^ l22) & -1L << (n17 -= F[149]);
            int n18 = F[150];
            n18 ^= F[151];
            n18 += F[152];
            int n19 = F[153];
            n19 -= F[154];
            long l23 = l12;
            int n20 = F[156];
            n20 -= F[157];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= F[155]))) ^ l23) & -1L >>> (n20 ^= F[158]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = F[159];
            n21 -= F[160];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += F[161]);
            while (true) {
                int n22 = F[162];
                n22 ^= F[163];
                if ((int)(l14 >>> (n22 -= F[164])) >= (int)l12) break;
                int n23 = F[165];
                n23 += F[166];
                int n24 = F[168];
                n24 += F[169];
                cArray2[(int)(l14 >>> (n23 += Draggable.F[167]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= F[170]))];
                l14 += 0x100000000L;
            }
            int n25 = F[171];
            n25 -= F[172];
            int n26 = (int)(l15 >>> (n25 -= F[173]));
            l15 += 0x100000000L;
            Draggable.d[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = F[174];
            n27 ^= F[175];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= F[176]);
        }
        INSTANCE = new Draggable();
        int n28 = F[177];
        n28 ^= F[178];
        A = new AnimationUtil(0.0f, n28 += F[179], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[F[180]];
        String string = (String)object[F[181]];
        object = object[F[182]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[183]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[184]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[186] ^ F[187]];
                byArray[Draggable.F[188] ^ Draggable.F[189]] = F[190] ^ F[191];
                byArray[Draggable.F[192] ^ Draggable.F[193]] = F[194] ^ F[195];
                byArray[Draggable.F[196] ^ Draggable.F[197]] = F[198] ^ F[199];
                byArray[Draggable.F[200] ^ Draggable.F[201]] = F[202] ^ F[203];
                byArray[Draggable.F[204] ^ Draggable.F[205]] = F[206] ^ F[207];
                byArray[Draggable.F[208] ^ Draggable.F[209]] = F[210] ^ F[211];
                byArray[Draggable.F[212] ^ Draggable.F[213]] = F[214] ^ F[215];
                byArray[Draggable.F[216] ^ Draggable.F[217]] = F[218] ^ F[219];
                byArray[Draggable.F[220] ^ Draggable.F[221]] = F[222] ^ F[223];
                byArray[Draggable.F[224] ^ Draggable.F[225]] = F[226] ^ F[227];
                byArray[Draggable.F[228] ^ Draggable.F[229]] = F[230] ^ F[231];
                byArray[Draggable.F[232] ^ Draggable.F[233]] = F[234] ^ F[235];
                byArray[Draggable.F[236] ^ Draggable.F[237]] = F[238] ^ F[239];
                byArray[Draggable.F[240] ^ Draggable.F[241]] = F[242] ^ F[243];
                byArray[Draggable.F[244] ^ Draggable.F[245]] = F[246] ^ F[247];
                byArray[Draggable.F[248] ^ Draggable.F[249]] = F[250] ^ F[251];
                objectArray2[Draggable.F[185]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[252]];
            if (e == null) {
                byte[] byArray2 = new byte[F[253] ^ F[254]];
                byArray2[Draggable.F[255] ^ Draggable.F[256]] = F[257] ^ F[258];
                byArray2[Draggable.F[259] ^ Draggable.F[260]] = F[261] ^ F[262];
                byArray2[Draggable.F[263] ^ Draggable.F[264]] = F[265] ^ F[266];
                byArray2[Draggable.F[267] ^ Draggable.F[268]] = F[269] ^ F[270];
                byArray2[Draggable.F[271] ^ Draggable.F[272]] = F[273] ^ F[274];
                byArray2[Draggable.F[275] ^ Draggable.F[276]] = F[277] ^ F[278];
                byArray2[Draggable.F[279] ^ Draggable.F[280]] = F[281] ^ F[282];
                byArray2[Draggable.F[283] ^ Draggable.F[284]] = F[285] ^ F[286];
                byArray2[Draggable.F[287] ^ Draggable.F[288]] = F[289] ^ F[290];
                byArray2[Draggable.F[291] ^ Draggable.F[292]] = F[293] ^ F[294];
                byArray2[Draggable.F[295] ^ Draggable.F[296]] = F[297] ^ F[298];
                byArray2[Draggable.F[299] ^ Draggable.F[300]] = F[301] ^ F[302];
                byArray2[Draggable.F[303] ^ Draggable.F[304]] = F[305] ^ F[306];
                byArray2[Draggable.F[307] ^ Draggable.F[308]] = F[309] ^ F[310];
                byArray2[Draggable.F[311] ^ Draggable.F[312]] = F[313] ^ F[314];
                byArray2[Draggable.F[315] ^ Draggable.F[316]] = F[317] ^ F[318];
                byArray2[Draggable.F[319] ^ Draggable.F[320]] = F[321] ^ F[322];
                byArray2[Draggable.F[323] ^ Draggable.F[324]] = F[325] ^ F[326];
                byArray2[Draggable.F[327] ^ Draggable.F[328]] = F[329] ^ F[330];
                byArray2[Draggable.F[331] ^ Draggable.F[332]] = F[333] ^ F[334];
                byArray2[Draggable.F[335] ^ Draggable.F[336]] = F[337] ^ F[338];
                byArray2[Draggable.F[339] ^ Draggable.F[340]] = F[341] ^ F[342];
                byArray2[Draggable.F[343] ^ Draggable.F[344]] = F[345] ^ F[346];
                byArray2[Draggable.F[347] ^ Draggable.F[348]] = F[349] ^ F[350];
                byArray2[Draggable.F[351] ^ Draggable.F[352]] = F[353] ^ F[354];
                byArray2[Draggable.F[355] ^ Draggable.F[356]] = F[357] ^ F[358];
                byArray2[Draggable.F[359] ^ Draggable.F[360]] = F[361] ^ F[362];
                byArray2[Draggable.F[363] ^ Draggable.F[364]] = F[365] ^ F[366];
                byArray2[Draggable.F[367] ^ Draggable.F[368]] = F[369] ^ F[370];
                byArray2[Draggable.F[371] ^ Draggable.F[372]] = F[373] ^ F[374];
                byArray2[Draggable.F[375] ^ Draggable.F[376]] = F[377] ^ F[378];
                byArray2[Draggable.F[379] ^ Draggable.F[380]] = F[381] ^ F[382];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, F[383], byArray3, F[384], byArray.length);
                System.arraycopy(byArray2, F[385], byArray3, byArray.length, byArray2.length);
                Object object4 = Draggable.A()[F[386]];
                if (object4 == null) {
                    char[] cArray = "\u4cba\u4ccc\u4ca7\u4cce\u4cf0\u4cdc\u4cd3\u4c85\u4c9e\u4c82\u4ca2\u4c89\u4cad\u4caf\u4cbf\u4ca2\u4ccd\u4cdd".toCharArray();
                    for (int i2 = F[387]; i2 < F[388]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= F[389];
                        n3 ^= F[390];
                        n3 ^= F[391];
                        n3 -= F[392];
                        n3 -= F[393];
                        n3 -= F[394];
                        n3 += F[395];
                        n3 ^= F[396];
                        n3 -= F[397];
                        cArray[i2] = (char)(n3 -= F[398]);
                    }
                    object4 = Draggable.A()[Draggable.F[399]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = -59;
                byArray4[0] = 74;
                byArray4[9] = -66;
                byArray4[13] = 125;
                byArray4[1] = 127;
                byArray4[11] = 51;
                byArray4[7] = 7;
                byArray4[2] = 15;
                byArray4[8] = 22;
                byArray4[15] = -78;
                byArray4[4] = -92;
                byArray4[5] = -117;
                byArray4[3] = 124;
                byArray4[14] = -111;
                byArray4[10] = 26;
                byArray4[6] = 27;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 11, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = Draggable.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u8bcd\u8c11\u8c1b".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 26081;
                        n4 ^= 0x8364;
                        n4 -= 28436;
                        n4 += 40325;
                        n4 += 11003;
                        n4 ^= 0x561B;
                        n4 += 2635;
                        n4 ^= 0x650B;
                        n4 += 36940;
                        cArray[i3] = (char)(n4 ^= 0x51FE);
                    }
                    object5 = Draggable.A()[2] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = Draggable.A()[3];
            if (object6 == null) {
                char[] cArray = "\ua3c1\ua02d\ua3d7\ub11b\ua3c7\ua3c6\ua3c7\ub11b\ua3d8\ua02f\ua3c7\ua3d7\ub0dd\ua3d8\ua0e1\ua0e4\ua0e4\ua3c9\ua3da\ua3d3".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0xBA22;
                    n5 += 8834;
                    n5 += 49827;
                    n5 ^= 0x33F5;
                    n5 ^= 0xF465;
                    n5 -= 57639;
                    n5 -= 55305;
                    n5 ^= 0xBBB;
                    n5 += 45772;
                    n5 += 64239;
                    cArray[i4] = (char)(n5 ^= 0x22CF);
                }
                object6 = Draggable.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)e), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = f;
        if (f == null) {
            f = new Object[4];
            objectArray = f;
        }
        return objectArray;
    }

    public static void b() {
        F = new int[0xB01A ^ 0xB18A];
        Draggable.F[0xBAFF ^ 0xBA91] = 0x63C3 ^ 0xBA91;
        Draggable.F[0x3649 ^ 0x3715] = 0x1354D ^ 0x3715;
        Draggable.F[0xE036 ^ 0xE073] = 0xE017 ^ 0xE073;
        Draggable.F[0x77F8 ^ 0x76F4] = 0xA5A3 ^ 0x76F4;
        Draggable.F[0xE2DA ^ 0xE3CF] = 0xFFFF203D ^ 0xE3CF;
        Draggable.F[0x7143 ^ 0x7195] = 0xFFFF4FB1 ^ 0x7195;
        Draggable.F[0xA44E ^ 0xA416] = 0xA40D ^ 0xA416;
        Draggable.F[0xBEE9 ^ 0xBF64] = 0x590E ^ 0xBF64;
        Draggable.F[0x2FC7 ^ 0x2EAD] = 0xF520 ^ 0x2EAD;
        Draggable.F[0x1310 ^ 0x1293] = 0x1293 ^ 0x1293;
        Draggable.F[0x8E83 ^ 0x8E10] = 0xFFFF7195 ^ 0x8E10;
        Draggable.F[0x4424 ^ 0x451F] = 0x6FEA ^ 0x451F;
        Draggable.F[0xC062 ^ 0xC01E] = 0xFFFF3FC1 ^ 0xC01E;
        Draggable.F[0x283C ^ 0x2848] = 0x4B41 ^ 0x2848;
        Draggable.F[0x53A5 ^ 0x5399] = 0x53D7 ^ 0x5399;
        Draggable.F[0xD031 ^ 0xD164] = 0xA45F ^ 0xD164;
        Draggable.F[0xA82A ^ 0xA908] = 0xF794 ^ 0xA908;
        Draggable.F[0x10BC5 ^ 0x10A9C] = 0xFFFE7290 ^ 0x10A9C;
        Draggable.F[0xFF3C ^ 0xFFBD] = 0xFFB1 ^ 0xFFBD;
        Draggable.F[0xA630 ^ 0xA76E] = 0x1A536 ^ 0xA76E;
        Draggable.F[0x7353 ^ 0x7202] = 0x24F8 ^ 0x7202;
        Draggable.F[0xDE72 ^ 0xDE86] = 0x647F ^ 0xDE86;
        Draggable.F[0x108E2 ^ 0x108BB] = 0xFFFEF728 ^ 0x108BB;
        Draggable.F[0xF031 ^ 0xF014] = 0xFFFF0FC8 ^ 0xF014;
        Draggable.F[0x2E71 ^ 0x2E5E] = 0xFFFFD189 ^ 0x2E5E;
        Draggable.F[0x7340 ^ 0x7395] = 0xB22E ^ 0x7395;
        Draggable.F[0x10D58 ^ 0x10DC0] = 0xFFFEF277 ^ 0x10DC0;
        Draggable.F[0x10A81 ^ 0x10AA7] = 0xFFFEF572 ^ 0x10AA7;
        Draggable.F[0x55E9 ^ 0x5555] = 0xC9FE ^ 0x5555;
        Draggable.F[0xCFC ^ 0xCB2] = 0xFFFFF30E ^ 0xCB2;
        Draggable.F[0xF620 ^ 0xF72F] = 0xC9E4 ^ 0xF72F;
        Draggable.F[0xAE20 ^ 0xAE30] = 0xAE13 ^ 0xAE30;
        Draggable.F[0xD397 ^ 0xD28A] = 0xFFFF7A30 ^ 0xD28A;
        Draggable.F[0x3084 ^ 0x30A5] = 0x30E8 ^ 0x30A5;
        Draggable.F[0x10437 ^ 0x10400] = 0xFFFEFBCE ^ 0x10400;
        Draggable.F[0x404C ^ 0x4074] = 0x400C ^ 0x4074;
        Draggable.F[0xD8C9 ^ 0xD8FC] = 0xD8F9 ^ 0xD8FC;
        Draggable.F[0xC208 ^ 0xC242] = 0xC25E ^ 0xC242;
        Draggable.F[0x434D ^ 0x4387] = 0xC7FC ^ 0x4387;
        Draggable.F[0xB9CE ^ 0xB88F] = 0xFFFF9A7D ^ 0xB88F;
        Draggable.F[0x6E55 ^ 0x6F25] = 0xAAD8 ^ 0x6F25;
        Draggable.F[0x9567 ^ 0x9502] = 0x9503 ^ 0x9502;
        Draggable.F[0x4351 ^ 0x4253] = 0x3A29 ^ 0x4253;
        Draggable.F[0x5E8D ^ 0x5FBA] = 0x15950 ^ 0x5FBA;
        Draggable.F[0x1A62 ^ 0x1A37] = 0xFFFFE58D ^ 0x1A37;
        Draggable.F[0xA461 ^ 0xA423] = 0xA40A ^ 0xA423;
        Draggable.F[0x944C ^ 0x945E] = 0xFFFF6B97 ^ 0x945E;
        Draggable.F[0xD00E ^ 0xD04E] = 0xD05C ^ 0xD04E;
        Draggable.F[0x77A8 ^ 0x7725] = 0xFFFF8889 ^ 0x7725;
        Draggable.F[0x4D9D ^ 0x4DD2] = 0x4DCB ^ 0x4DD2;
        Draggable.F[0x813B ^ 0x80BB] = 0x80BB ^ 0x80BB;
        Draggable.F[0x55B5 ^ 0x551C] = 0x5548 ^ 0x551C;
        Draggable.F[0xF3E ^ 0xF59] = 0xF5B ^ 0xF59;
        Draggable.F[0xAFF5 ^ 0xAED5] = 0xF049 ^ 0xAED5;
        Draggable.F[0x14DF ^ 0x141C] = 0xDACF ^ 0x141C;
        Draggable.F[0x972E ^ 0x9611] = 0x4B5D ^ 0x9611;
        Draggable.F[0x10B6B ^ 0x10BFD] = 0xFFFEF44A ^ 0x10BFD;
        Draggable.F[0xD030 ^ 0xD0AE] = 0xFFFF2F4E ^ 0xD0AE;
        Draggable.F[0xC5C4 ^ 0xC509] = 0xCED6 ^ 0xC509;
        Draggable.F[0x346D ^ 0x34B2] = 0x1E7D ^ 0x34B2;
        Draggable.F[0x6CD0 ^ 0x6DD8] = 0x6289 ^ 0x6DD8;
        Draggable.F[0x61E ^ 0x69E] = 0xFFFFF926 ^ 0x69E;
        Draggable.F[0x4A18 ^ 0x4B60] = 0x69A0 ^ 0x4B60;
        Draggable.F[0xEDB2 ^ 0xECB5] = 0xE3FC ^ 0xECB5;
        Draggable.F[0xA8AF ^ 0xA84A] = 0xD728 ^ 0xA84A;
        Draggable.F[0x6C56 ^ 0x6C8D] = 0xB454 ^ 0x6C8D;
        Draggable.F[0x747C ^ 0x751D] = 0xFFFFA886 ^ 0x751D;
        Draggable.F[0x7D0B ^ 0x7D5D] = 0x7D51 ^ 0x7D5D;
        Draggable.F[0x200F ^ 0x2002] = 0xFFFFDFA7 ^ 0x2002;
        Draggable.F[0x8068 ^ 0x80D3] = 0x17C6 ^ 0x80D3;
        Draggable.F[0x826B ^ 0x8317] = 0xB53E ^ 0x8317;
        Draggable.F[0x1424 ^ 0x1534] = 0x2BE8 ^ 0x1534;
        Draggable.F[0x126 ^ 0x59] = 0x59 ^ 0x59;
        Draggable.F[0x4D05 ^ 0x4DF5] = 0x786B ^ 0x4DF5;
        Draggable.F[0x15F3 ^ 0x15F4] = 0x15DD ^ 0x15F4;
        Draggable.F[0x5537 ^ 0x5453] = 0x47E1 ^ 0x5453;
        Draggable.F[0xA26E ^ 0xA25E] = 0xA2EB ^ 0xA25E;
        Draggable.F[0x1849 ^ 0x1958] = 0xFFFFD826 ^ 0x1958;
        Draggable.F[0x1FBE ^ 0x1F37] = 0xFFFFE0B0 ^ 0x1F37;
        Draggable.F[0x7FE0 ^ 0x7F8D] = 0x9D1C ^ 0x7F8D;
        Draggable.F[0x2AE0 ^ 0x2BE9] = 0x24EF ^ 0x2BE9;
        Draggable.F[0x1CDC ^ 0x1CB7] = 0xE516 ^ 0x1CB7;
        Draggable.F[0xFC40 ^ 0xFC49] = 0xFC41 ^ 0xFC49;
        Draggable.F[0x9B73 ^ 0x9BAF] = 0xB161 ^ 0x9BAF;
        Draggable.F[0x3AAD ^ 0x3B2A] = 0xAC18 ^ 0x3B2A;
        Draggable.F[0xE8D6 ^ 0xE981] = 0x6E07 ^ 0xE981;
        Draggable.F[0x4A72 ^ 0x4BF8] = 0xE00F ^ 0x4BF8;
        Draggable.F[0xA158 ^ 0xA055] = 0x735D ^ 0xA055;
        Draggable.F[0x10AB2 ^ 0x10B80] = 0x177E0 ^ 0x10B80;
        Draggable.F[0x96CA ^ 0x96A5] = 0x393 ^ 0x96A5;
        Draggable.F[0x88CB ^ 0x89BA] = 0xFFFFB3B3 ^ 0x89BA;
        Draggable.F[0x8EE9 ^ 0x8EFD] = 0x8EE0 ^ 0x8EFD;
        Draggable.F[0x630 ^ 0x680] = 0xFFFFF940 ^ 0x680;
        Draggable.F[0x129D ^ 0x12E5] = 0x12AC ^ 0x12E5;
        Draggable.F[0xD4C0 ^ 0xD4C2] = 0xFFFF2B71 ^ 0xD4C2;
        Draggable.F[0x10A0A ^ 0x10B41] = 0xF4E ^ 0x10B41;
        Draggable.F[0x867B ^ 0x868A] = 0xB314 ^ 0x868A;
        Draggable.F[0x4D34 ^ 0x4CB5] = 0x4CB5 ^ 0x4CB5;
        Draggable.F[0x8D78 ^ 0x8C03] = 0xBA31 ^ 0x8C03;
        Draggable.F[0x2CAA ^ 0x2DB0] = 0x8ACE ^ 0x2DB0;
        Draggable.F[0x9BA ^ 0x96E] = 0xC8DE ^ 0x96E;
        Draggable.F[0xEB32 ^ 0xEA62] = 0xBC94 ^ 0xEA62;
        Draggable.F[0xC079 ^ 0xC0A7] = 0xFFFF15F8 ^ 0xC0A7;
        Draggable.F[0x26EF ^ 0x26CC] = 0x26F7 ^ 0x26CC;
        Draggable.F[0xCB3E ^ 0xCAB8] = 0x5F8A ^ 0xCAB8;
        Draggable.F[0xEAF8 ^ 0xEBCB] = 0x295E ^ 0xEBCB;
        Draggable.F[0x589B ^ 0x59C6] = 0xFFFEA44F ^ 0x59C6;
        Draggable.F[0x9610 ^ 0x9739] = 0x19D97 ^ 0x9739;
        Draggable.F[0x92AC ^ 0x9245] = 0xF474 ^ 0x9245;
        Draggable.F[0xCA9F ^ 0xCA1A] = 0xCA36 ^ 0xCA1A;
        Draggable.F[0x5D86 ^ 0x5DEC] = 0x5CEC ^ 0x5DEC;
        Draggable.F[0xC9EA ^ 0xC8A8] = 0x15E7 ^ 0xC8A8;
        Draggable.F[0x4BEF ^ 0x4B4D] = 0xFFFFB41B ^ 0x4B4D;
        Draggable.F[0xBB12 ^ 0xBA23] = 0xC628 ^ 0xBA23;
        Draggable.F[0xB2B3 ^ 0xB2C6] = 0x84AF ^ 0xB2C6;
        Draggable.F[0x2AB6 ^ 0x2A6C] = 0xF2EC ^ 0x2A6C;
        Draggable.F[0x6E5E ^ 0x6EA1] = 0x16D5 ^ 0x6EA1;
        Draggable.F[0x57D2 ^ 0x5791] = 0x57F8 ^ 0x5791;
        Draggable.F[0xD4EC ^ 0xD4C6] = 0xFFFF2BA8 ^ 0xD4C6;
        Draggable.F[0x697D ^ 0x6956] = 0x6900 ^ 0x6956;
        Draggable.F[0x9E04 ^ 0x9EA5] = 0xFFFF6175 ^ 0x9EA5;
        Draggable.F[0xD41F ^ 0xD437] = 0xD40D ^ 0xD437;
        Draggable.F[0x68C0 ^ 0x69CE] = 0xBA99 ^ 0x69CE;
        Draggable.F[0xBD52 ^ 0xBC7E] = 0x85CA ^ 0xBC7E;
        Draggable.F[0x9993 ^ 0x9972] = 0x2C91 ^ 0x9972;
        Draggable.F[0xD4D7 ^ 0xD4D7] = 0xFFFF2B5E ^ 0xD4D7;
        Draggable.F[0x1B41 ^ 0x1B8A] = 0x9F8D ^ 0x1B8A;
        Draggable.F[0xCE4 ^ 0xCD5] = 0xC95 ^ 0xCD5;
        Draggable.F[0xF73B ^ 0xF7D3] = 0x91E6 ^ 0xF7D3;
        Draggable.F[0xA78 ^ 0xA8D] = 0xB07B ^ 0xA8D;
        Draggable.F[0x7539 ^ 0x759A] = 0xFFFF8A43 ^ 0x759A;
        Draggable.F[0x97DD ^ 0x979C] = 0xFFFF684C ^ 0x979C;
        Draggable.F[0xB175 ^ 0xB1C6] = 0xFFFF4E01 ^ 0xB1C6;
        Draggable.F[0xE4E7 ^ 0xE468] = 0xFFFF1BA8 ^ 0xE468;
        Draggable.F[0xE373 ^ 0xE220] = 0x9712 ^ 0xE220;
        Draggable.F[0x6EAD ^ 0x6EE9] = 0x6ED3 ^ 0x6EE9;
        Draggable.F[0xC9BF ^ 0xC8A1] = 0x9FAC ^ 0xC8A1;
        Draggable.F[0xDB8F ^ 0xDBB0] = 0xDBF9 ^ 0xDBB0;
        Draggable.F[0xB455 ^ 0xB56F] = 0x1B393 ^ 0xB56F;
        Draggable.F[0x7A8D ^ 0x7A9E] = 0x7AEA ^ 0x7A9E;
        Draggable.F[0xAFDA ^ 0xAEFD] = 0x1A415 ^ 0xAEFD;
        Draggable.F[0xCFF8 ^ 0xCE93] = 0xFBF6 ^ 0xCE93;
        Draggable.F[0xC5C3 ^ 0xC510] = 0xDFE6 ^ 0xC510;
        Draggable.F[0xAF57 ^ 0xAFDD] = 0xAFD3 ^ 0xAFDD;
        Draggable.F[0x10485 ^ 0x105E5] = 0x127D8 ^ 0x105E5;
        Draggable.F[0xCF6A ^ 0xCFCE] = 0xCFA1 ^ 0xCFCE;
        Draggable.F[0x6AF1 ^ 0x6AE0] = 0xFFFF9544 ^ 0x6AE0;
        Draggable.F[0x914 ^ 0x948] = 0x903 ^ 0x948;
        Draggable.F[0xA834 ^ 0xA934] = 0xD14E ^ 0xA934;
        Draggable.F[0x317A ^ 0x31D4] = 0x3186 ^ 0x31D4;
        Draggable.F[0x10379 ^ 0x102FC] = 0x1016C ^ 0x102FC;
        Draggable.F[0xDE03 ^ 0xDF3A] = 0xFFFE2637 ^ 0xDF3A;
        Draggable.F[0x9EE ^ 0x9F2] = 0x9A4 ^ 0x9F2;
        Draggable.F[0x22D0 ^ 0x23C6] = 0x1FD7 ^ 0x23C6;
        Draggable.F[0xCCF2 ^ 0xCCD5] = 0xFFFF339F ^ 0xCCD5;
        Draggable.F[0x364E ^ 0x3772] = 0x1D95 ^ 0x3772;
        Draggable.F[0xD1AC ^ 0xD12B] = 0xD134 ^ 0xD12B;
        Draggable.F[0x546B ^ 0x54E8] = 0xFFFFAB73 ^ 0x54E8;
        Draggable.F[0x458C ^ 0x45A2] = 0xFFFFBA0D ^ 0x45A2;
        Draggable.F[0x6D40 ^ 0x6D9D] = 0x4752 ^ 0x6D9D;
        Draggable.F[0x3DA2 ^ 0x3DB4] = 0xFFFFC233 ^ 0x3DB4;
        Draggable.F[0x39B9 ^ 0x39F1] = 0xFFFFC61A ^ 0x39F1;
        Draggable.F[0x753C ^ 0x7599] = 0x755B ^ 0x7599;
        Draggable.F[0xFF3D ^ 0xFF82] = 0x6323 ^ 0xFF82;
        Draggable.F[0xA130 ^ 0xA1FE] = 0xAA4A ^ 0xA1FE;
        Draggable.F[0x2C1E ^ 0x2C40] = 0xFFFFD3CC ^ 0x2C40;
        Draggable.F[0x9C2E ^ 0x9D06] = 0x197E9 ^ 0x9D06;
        Draggable.F[0x7D5F ^ 0x7C18] = 0x8A8A ^ 0x7C18;
        Draggable.F[0xAC5B ^ 0xAD11] = 0x5B82 ^ 0xAD11;
        Draggable.F[0xD4F2 ^ 0xD4ED] = 0xFFFF2B69 ^ 0xD4ED;
        Draggable.F[0x23CF ^ 0x23B5] = 0x23EA ^ 0x23B5;
        Draggable.F[0x2027 ^ 0x20D5] = 0x153A ^ 0x20D5;
        Draggable.F[0x74BC ^ 0x74C3] = 0x74C7 ^ 0x74C3;
        Draggable.F[0xC162 ^ 0xC163] = 0xFFFF3EB4 ^ 0xC163;
        Draggable.F[0x5928 ^ 0x59A4] = 0xFFFFA630 ^ 0x59A4;
        Draggable.F[0x6E74 ^ 0x6F1A] = 0x5A77 ^ 0x6F1A;
        Draggable.F[0x3108 ^ 0x307B] = 0xC85D ^ 0x307B;
        Draggable.F[0x2122 ^ 0x204A] = 0xFBC7 ^ 0x204A;
        Draggable.F[0x10888 ^ 0x10840] = 0x18C44 ^ 0x10840;
        Draggable.F[0xA4A0 ^ 0xA414] = 0xA415 ^ 0xA414;
        Draggable.F[0xA5F5 ^ 0xA5C8] = 0xFFFF5A01 ^ 0xA5C8;
        Draggable.F[0xF161 ^ 0xF16A] = 0xF166 ^ 0xF16A;
        Draggable.F[0x6C1F ^ 0x6CF2] = 0x21C5 ^ 0x6CF2;
        Draggable.F[0x1811 ^ 0x18ED] = 0x18ED ^ 0x18ED;
        Draggable.F[0x428 ^ 0x44E] = 0x44E ^ 0x44E;
        Draggable.F[0x797D ^ 0x7997] = 0xFFFFE053 ^ 0x7997;
        Draggable.F[0xAAE7 ^ 0xAA01] = 0xD57E ^ 0xAA01;
        Draggable.F[0xB896 ^ 0xB98F] = 0x1EAE ^ 0xB98F;
        Draggable.F[0xF92F ^ 0xF81A] = 0xFFFFC512 ^ 0xF81A;
        Draggable.F[0xAB10 ^ 0xAB2B] = 0xFFFF54CC ^ 0xAB2B;
        Draggable.F[0x6517 ^ 0x6421] = 0xA6B4 ^ 0x6421;
        Draggable.F[0x8C9 ^ 0x822] = 0x6E13 ^ 0x822;
        Draggable.F[0x4557 ^ 0x45D9] = 0x4595 ^ 0x45D9;
        Draggable.F[0x1450 ^ 0x14FB] = 0x1494 ^ 0x14FB;
        Draggable.F[0x8A62 ^ 0x8B68] = 0x8439 ^ 0x8B68;
        Draggable.F[0x9FA7 ^ 0x9ED9] = 0xA8F0 ^ 0x9ED9;
        Draggable.F[0xDD2E ^ 0xDDBE] = 0xFFFF222B ^ 0xDDBE;
        Draggable.F[0x1871 ^ 0x1836] = 0x182A ^ 0x1836;
        Draggable.F[0x2752 ^ 0x2674] = 0xC977 ^ 0x2674;
        Draggable.F[0x4705 ^ 0x462E] = 0x7F8B ^ 0x462E;
        Draggable.F[0x2A49 ^ 0x2A3E] = 0x2A3E ^ 0x2A3E;
        Draggable.F[0x3373 ^ 0x3385] = 0xFFFF768B ^ 0x3385;
        Draggable.F[0xD1B5 ^ 0xD0D6] = 0xC366 ^ 0xD0D6;
        Draggable.F[0xD4D4 ^ 0xD4E6] = 0xFFFF2B6B ^ 0xD4E6;
        Draggable.F[0x3B7C ^ 0x3B9E] = 0x8E7B ^ 0x3B9E;
        Draggable.F[0xFAE2 ^ 0xFA1A] = 0x428B ^ 0xFA1A;
        Draggable.F[0xFC11 ^ 0xFC4B] = 0xFFFF0311 ^ 0xFC4B;
        Draggable.F[0xB6C3 ^ 0xB7D1] = 0x890D ^ 0xB7D1;
        Draggable.F[0x723 ^ 0x73D] = 0x7D4 ^ 0x73D;
        Draggable.F[0xB81A ^ 0xB824] = 0xB859 ^ 0xB824;
        Draggable.F[0x8606 ^ 0x860A] = 0xFFFF792E ^ 0x860A;
        Draggable.F[0x1F93 ^ 0x1EDF] = 0x11ADA ^ 0x1EDF;
        Draggable.F[0x3664 ^ 0x3750] = 0xF5C5 ^ 0x3750;
        Draggable.F[0x667B ^ 0x6767] = 0x306A ^ 0x6767;
        Draggable.F[0x6E33 ^ 0x6E6C] = 0x6E30 ^ 0x6E6C;
        Draggable.F[0x5EB6 ^ 0x5EAE] = 0x5ECA ^ 0x5EAE;
        Draggable.F[0xDAF9 ^ 0xDA4B] = 0xFFFF2594 ^ 0xDA4B;
        Draggable.F[0xE660 ^ 0xE736] = 0x9214 ^ 0xE736;
        Draggable.F[0x462 ^ 0x55F] = 0x2FBE ^ 0x55F;
        Draggable.F[0x9D8D ^ 0x9D76] = 0x25EB ^ 0x9D76;
        Draggable.F[0x10479 ^ 0x10510] = 0xFFFE2127 ^ 0x10510;
        Draggable.F[0xD197 ^ 0xD1C3] = 0xFFFF2E74 ^ 0xD1C3;
        Draggable.F[0xC46D ^ 0xC482] = 0x89B5 ^ 0xC482;
        Draggable.F[0x1AE0 ^ 0x1AC4] = 0xFFFFE515 ^ 0x1AC4;
        Draggable.F[0xA32E ^ 0xA20D] = 0x4D01 ^ 0xA20D;
        Draggable.F[0x2905 ^ 0x29A3] = 0xFFFFD62F ^ 0x29A3;
        Draggable.F[0x286D ^ 0x28C7] = 0xFFFFD776 ^ 0x28C7;
        Draggable.F[0x7C15 ^ 0x7C4E] = 0xFFFF83EB ^ 0x7C4E;
        Draggable.F[0xC2EB ^ 0xC39D] = 0x3BB2 ^ 0xC39D;
        Draggable.F[0x96F1 ^ 0x9616] = 0xE974 ^ 0x9616;
        Draggable.F[0xC775 ^ 0xC7E1] = 0xFFFF387D ^ 0xC7E1;
        Draggable.F[0xBCCE ^ 0xBC5B] = 0xFFFF4392 ^ 0xBC5B;
        Draggable.F[0x4F6B ^ 0x4E1F] = 0xB630 ^ 0x4E1F;
        Draggable.F[0x4928 ^ 0x4941] = 0x4941 ^ 0x4941;
        Draggable.F[0xF255 ^ 0xF2EC] = 0xF2EC ^ 0xF2EC;
        Draggable.F[0x10A4C ^ 0x10B2B] = 0x1D0B5 ^ 0x10B2B;
        Draggable.F[0xF086 ^ 0xF195] = 0xCD89 ^ 0xF195;
        Draggable.F[0xDC5A ^ 0xDCDC] = 0xDC91 ^ 0xDCDC;
        Draggable.F[0xC49E ^ 0xC484] = 0xC4C6 ^ 0xC484;
        Draggable.F[0xCCD5 ^ 0xCCA5] = 0x3BA2 ^ 0xCCA5;
        Draggable.F[0xD110 ^ 0xD124] = 0xD130 ^ 0xD124;
        Draggable.F[0x415F ^ 0x4148] = 0xFFFFBEDE ^ 0x4148;
        Draggable.F[0x8CC7 ^ 0x8CC2] = 0x8CD7 ^ 0x8CC2;
        Draggable.F[0x43FF ^ 0x4386] = 0xFFFFBC4C ^ 0x4386;
        Draggable.F[0x5C06 ^ 0x5C77] = 0xDA40 ^ 0x5C77;
        Draggable.F[0xF4F3 ^ 0xF45F] = 0xF436 ^ 0xF45F;
        Draggable.F[0xF236 ^ 0xF34B] = 0xC565 ^ 0xF34B;
        Draggable.F[0x2451 ^ 0x2534] = 0xFFFFC934 ^ 0x2534;
        Draggable.F[0x10DA0 ^ 0x10D08] = 0xFFFEF235 ^ 0x10D08;
        Draggable.F[0x906D ^ 0x90A1] = 0x9B76 ^ 0x90A1;
        Draggable.F[0x10DF0 ^ 0x10DFA] = 0x10DFE ^ 0x10DFA;
        Draggable.F[0x8D54 ^ 0x8DAE] = 0xFFFFCADF ^ 0x8DAE;
        Draggable.F[0xD4EF ^ 0xD5EC] = 0x843B ^ 0xD5EC;
        Draggable.F[0xFBD9 ^ 0xFB39] = 0x4ED3 ^ 0xFB39;
        Draggable.F[0x10685 ^ 0x1061A] = 0xFFFEF9EF ^ 0x1061A;
        Draggable.F[0x34CC ^ 0x34E0] = 0x34BC ^ 0x34E0;
        Draggable.F[0x105FF ^ 0x104FA] = 0xFFFEAA85 ^ 0x104FA;
        Draggable.F[0xE10B ^ 0xE192] = 0xFFFF1E49 ^ 0xE192;
        Draggable.F[0xF982 ^ 0xF91E] = 0xFFFF0675 ^ 0xF91E;
        Draggable.F[0x7B66 ^ 0x7BA0] = 0x34B7 ^ 0x7BA0;
        Draggable.F[0xA82C ^ 0xA909] = 0x4611 ^ 0xA909;
        Draggable.F[0x5F03 ^ 0x5E3D] = 0x74DA ^ 0x5E3D;
        Draggable.F[0x39F2 ^ 0x3989] = 0x39A5 ^ 0x3989;
        Draggable.F[0x2ED1 ^ 0x2EB2] = 0x2EB1 ^ 0x2EB2;
        Draggable.F[0xF02E ^ 0xF0EB] = 0xBF94 ^ 0xF0EB;
        Draggable.F[0x6297 ^ 0x620A] = 0xFFFF9DA1 ^ 0x620A;
        Draggable.F[0x6476 ^ 0x64B6] = 0xAA68 ^ 0x64B6;
        Draggable.F[0x700E ^ 0x7111] = 0x2F92 ^ 0x7111;
        Draggable.F[0xBFF0 ^ 0xBF13] = 0xAF0 ^ 0xBF13;
        Draggable.F[0x10CD ^ 0x10A1] = 0xA8B0 ^ 0x10A1;
        Draggable.F[0xD996 ^ 0xD8D8] = 0x1DCDD ^ 0xD8D8;
        Draggable.F[0x6D61 ^ 0x6CE8] = 0x67DE ^ 0x6CE8;
        Draggable.F[0xB8A7 ^ 0xB9AC] = 0x6AE2 ^ 0xB9AC;
        Draggable.F[0x105F0 ^ 0x105DD] = 0xFFFEFA50 ^ 0x105DD;
        Draggable.F[0x10CB4 ^ 0x10DC1] = 0x1F5D1 ^ 0x10DC1;
        Draggable.F[0xE38E ^ 0xE386] = 0xE398 ^ 0xE386;
        Draggable.F[0xDC0F ^ 0xDC5C] = 0xFFFF239F ^ 0xDC5C;
        Draggable.F[0x862B ^ 0x8632] = 0xFFFF79ED ^ 0x8632;
        Draggable.F[0x8E9C ^ 0x8E22] = 0xFFFFED7B ^ 0x8E22;
        Draggable.F[0x6FB5 ^ 0x6E9F] = 0x16470 ^ 0x6E9F;
        Draggable.F[0x1BD1 ^ 0x1BAF] = 0xFFFFE473 ^ 0x1BAF;
        Draggable.F[0xBDE4 ^ 0xBCE5] = 0xC4CE ^ 0xBCE5;
        Draggable.F[0x75F4 ^ 0x752C] = 0xADFB ^ 0x752C;
        Draggable.F[0x4CF ^ 0x58A] = 0xFFFFCD17 ^ 0x58A;
        Draggable.F[0x10F13 ^ 0x10E55] = 0x1392E ^ 0x10E55;
        Draggable.F[0x938 ^ 0x93B] = 0xFFFFF6EB ^ 0x93B;
        Draggable.F[0x6CE9 ^ 0x6C10] = 0xD48D ^ 0x6C10;
        Draggable.F[0x810B ^ 0x8071] = 0xA2B1 ^ 0x8071;
        Draggable.F[0xFC43 ^ 0xFC75] = 0xFC13 ^ 0xFC75;
        Draggable.F[0x9D91 ^ 0x9D26] = 0x9D27 ^ 0x9D26;
        Draggable.F[0xD46A ^ 0xD438] = 0xFFFF2BB4 ^ 0xD438;
        Draggable.F[0xD6A8 ^ 0xD6DA] = 0x9FAD ^ 0xD6DA;
        Draggable.F[0x27CE ^ 0x2722] = 0x6A17 ^ 0x2722;
        Draggable.F[0xC86F ^ 0xC9E0] = 0xC9E1 ^ 0xC9E0;
        Draggable.F[0x8922 ^ 0x885B] = 0xFFFF5566 ^ 0x885B;
        Draggable.F[0x63F9 ^ 0x6329] = 0x79D8 ^ 0x6329;
        Draggable.F[0x4496 ^ 0x441E] = 0x4466 ^ 0x441E;
        Draggable.F[0xC9DA ^ 0xC9BE] = 0xC9BE ^ 0xC9BE;
        Draggable.F[0x3CAB ^ 0x3C92] = 0x3CA7 ^ 0x3C92;
        Draggable.F[0x71D7 ^ 0x70CC] = 0x27DB ^ 0x70CC;
        Draggable.F[0x4CC5 ^ 0x4CCB] = 0x4CB5 ^ 0x4CCB;
        Draggable.F[0x414D ^ 0x4009] = 0x7772 ^ 0x4009;
        Draggable.F[0x48DD ^ 0x4955] = 0x3F31 ^ 0x4955;
        Draggable.F[0xC1FB ^ 0xC16C] = 0xFFFF3E82 ^ 0xC16C;
        Draggable.F[0x534E ^ 0x539C] = 0xFFFFB6CC ^ 0x539C;
        Draggable.F[0x322D ^ 0x32C9] = 0x4DAE ^ 0x32C9;
        Draggable.F[0xAE5F ^ 0xAF6F] = 0xD30F ^ 0xAF6F;
        Draggable.F[0xEFF2 ^ 0xEE9E] = 0xDBF3 ^ 0xEE9E;
        Draggable.F[0x1379 ^ 0x12F7] = 0xC938 ^ 0x12F7;
        Draggable.F[0x661C ^ 0x6797] = 0x9950 ^ 0x6797;
        Draggable.F[0x10C3B ^ 0x10D3D] = 0x15CF6 ^ 0x10D3D;
        Draggable.F[0x9F01 ^ 0x9F5C] = 0xFFFF60B6 ^ 0x9F5C;
        Draggable.F[0x65AA ^ 0x65E1] = 0xFFFF9B13 ^ 0x65E1;
        Draggable.F[0x10C50 ^ 0x10CAD] = 0x15D62 ^ 0x10CAD;
        Draggable.F[0xF9C6 ^ 0xF84A] = 0x24A3 ^ 0xF84A;
        Draggable.F[0x970 ^ 0x864] = 0x3475 ^ 0x864;
        Draggable.F[0x48A5 ^ 0x49C3] = 0x5A71 ^ 0x49C3;
        Draggable.F[0xBE4D ^ 0xBEFC] = 0xFFFF4119 ^ 0xBEFC;
        Draggable.F[0x9F43 ^ 0x9F4C] = 0x9FC8 ^ 0x9F4C;
        Draggable.F[0x2A37 ^ 0x2AB5] = 0x2AC7 ^ 0x2AB5;
        Draggable.F[0xABED ^ 0xAB57] = 0x3C52 ^ 0xAB57;
        Draggable.F[0x9BD ^ 0x8AA] = 0xAFDF ^ 0x8AA;
        Draggable.F[0xB9C5 ^ 0xB8B2] = 0x9A76 ^ 0xB8B2;
        Draggable.F[0xB5F2 ^ 0xB4A9] = 0x1B6E4 ^ 0xB4A9;
        Draggable.F[0x71A3 ^ 0x70F1] = 0x2607 ^ 0x70F1;
        Draggable.F[0x10B9 ^ 0x108A] = 0x10BB ^ 0x108A;
        Draggable.F[0xCB95 ^ 0xCBE3] = 0x472F ^ 0xCBE3;
        Draggable.F[0x10D78 ^ 0x10DBC] = 0x142C5 ^ 0x10DBC;
        Draggable.F[0x10C58 ^ 0x10CF8] = 0xFFFEF35D ^ 0x10CF8;
        Draggable.F[0x3A8E ^ 0x3BD6] = 0xBC4E ^ 0x3BD6;
        Draggable.F[0x34A7 ^ 0x3487] = 0xFFFFCB34 ^ 0x3487;
        Draggable.F[0xA6B7 ^ 0xA601] = 0xA601 ^ 0xA601;
        Draggable.F[0x58DF ^ 0x581D] = 0xFFFF6928 ^ 0x581D;
        Draggable.F[0xDF28 ^ 0xDFEF] = 0x9090 ^ 0xDFEF;
        Draggable.F[0x46D3 ^ 0x460A] = 0x9ED3 ^ 0x460A;
        Draggable.F[0x5E0F ^ 0x5EBA] = 0x5EB8 ^ 0x5EBA;
        Draggable.F[0x32D0 ^ 0x33F1] = 0x6D26 ^ 0x33F1;
        Draggable.F[0xF537 ^ 0xF5B3] = 0xF52A ^ 0xF5B3;
        Draggable.F[0x4C3 ^ 0x402] = 0xCAD1 ^ 0x402;
        Draggable.F[0x1DBB ^ 0x1DEA] = 0xFFFFE3F1 ^ 0x1DEA;
        Draggable.F[0x40BE ^ 0x40F2] = 0xFFFFBF1E ^ 0x40F2;
        Draggable.F[0x882B ^ 0x8866] = 0xFFFF77EE ^ 0x8866;
        Draggable.F[0x107FF ^ 0x10692] = 0x133BF ^ 0x10692;
        Draggable.F[0xA332 ^ 0xA272] = 0x7F3D ^ 0xA272;
        Draggable.F[0xDEEE ^ 0xDFA6] = 0x2935 ^ 0xDFA6;
        Draggable.F[0x5E9A ^ 0x5E9C] = 0xFFFFA126 ^ 0x5E9C;
        Draggable.F[0x9F88 ^ 0x9EE7] = 0x5B1C ^ 0x9EE7;
        Draggable.F[0x4309 ^ 0x430D] = 0xFFFFBC96 ^ 0x430D;
        Draggable.F[0xF359 ^ 0xF21A] = 0xC575 ^ 0xF21A;
        Draggable.F[0x196B ^ 0x1846] = 0xFFFFDE5B ^ 0x1846;
        Draggable.F[0x10FAC ^ 0x10F11] = 0x193B0 ^ 0x10F11;
        Draggable.F[0x6CFE ^ 0x6CEB] = 0x6CC4 ^ 0x6CEB;
        Draggable.F[0x19BD ^ 0x19EA] = 0x1963 ^ 0x19EA;
        Draggable.F[0x6DBC ^ 0x6DCF] = 0xD137 ^ 0x6DCF;
        Draggable.F[0x6E0B ^ 0x6EA4] = 0xFFFF9116 ^ 0x6EA4;
        Draggable.F[0x7D42 ^ 0x7C0D] = 0x2AFE ^ 0x7C0D;
        Draggable.F[0x1089 ^ 0x1031] = 0x1030 ^ 0x1031;
        Draggable.F[0xCEC3 ^ 0xCF9C] = 0xEDBC ^ 0xCF9C;
        Draggable.F[0xE4C7 ^ 0xE4E5] = 0xFFFF1B2B ^ 0xE4E5;
        Draggable.F[0xB872 ^ 0xB93F] = 0x1BD05 ^ 0xB93F;
        Draggable.F[0x10C14 ^ 0x10D3B] = 0x17157 ^ 0x10D3B;
        Draggable.F[0xA79A ^ 0xA74B] = 0xBDBD ^ 0xA74B;
        Draggable.F[0xDA15 ^ 0xDA75] = 0xDA02 ^ 0xDA75;
        Draggable.F[0xC385 ^ 0xC2A1] = 0x2DA2 ^ 0xC2A1;
        Draggable.F[0x420D ^ 0x42C4] = 0xC6C3 ^ 0x42C4;
        Draggable.F[0x6E9C ^ 0x6ED5] = 0xFFFF911E ^ 0x6ED5;
        Draggable.F[0x5CCF ^ 0x5CAE] = 0xFFFFA321 ^ 0x5CAE;
        Draggable.F[0xE31B ^ 0xE235] = 0xDB81 ^ 0xE235;
        Draggable.F[0x827 ^ 0x9A5] = 0x9A4 ^ 0x9A5;
        Draggable.F[0x20D0 ^ 0x2027] = 0x9AD1 ^ 0x2027;
        Draggable.F[0xD98 ^ 0xC1C] = 0xC0E ^ 0xC1C;
        Draggable.F[0x1C2F ^ 0x1C69] = 0x1C11 ^ 0x1C69;
        Draggable.F[0x5108 ^ 0x5132] = 0xFFFFAE88 ^ 0x5132;
        Draggable.F[0xAAEE ^ 0xAA10] = 0xFBFF ^ 0xAA10;
        Draggable.F[0x11F9 ^ 0x11E4] = 0x119D ^ 0x11E4;
        Draggable.F[0x91C5 ^ 0x9154] = 0xFFFF6E97 ^ 0x9154;
        Draggable.F[0xEA3D ^ 0xEACE] = 0xDF50 ^ 0xEACE;
        Draggable.F[0xDF19 ^ 0xDF49] = 0xFFFF20EB ^ 0xDF49;
        Draggable.F[0x4B7B ^ 0x4BB4] = 0x406B ^ 0x4BB4;
        Draggable.F[0xE0B0 ^ 0xE0D2] = 0xFFFF1F0A ^ 0xE0D2;
        Draggable.F[0x353F ^ 0x3516] = 0xFFFFCAB2 ^ 0x3516;
        Draggable.F[0x65AD ^ 0x64A9] = 0x3562 ^ 0x64A9;
        Draggable.F[0xB247 ^ 0xB22F] = 0xB22F ^ 0xB22F;
        Draggable.F[0x508F ^ 0x5061] = 0xFFFFE2B7 ^ 0x5061;
        Draggable.F[0xD935 ^ 0xD82D] = 0x7F53 ^ 0xD82D;
        Draggable.F[0x1844 ^ 0x18E3] = 0xFFFFE731 ^ 0x18E3;
        Draggable.F[0x73B0 ^ 0x72D2] = 0x50EF ^ 0x72D2;
        Draggable.F[0x6AFB ^ 0x6A69] = 0x6A27 ^ 0x6A69;
        Draggable.F[0x110B ^ 0x105F] = 0x657D ^ 0x105F;
        Draggable.F[0xBBF0 ^ 0xBAB9] = 0x4C73 ^ 0xBAB9;
        Draggable.F[0x10680 ^ 0x1060B] = 0xFFFEF98C ^ 0x1060B;
        Draggable.F[0x658 ^ 0x760] = 0x1019C ^ 0x760;
        Draggable.F[0x7AA2 ^ 0x7BD0] = 0xBE2D ^ 0x7BD0;
        Draggable.F[0x7B73 ^ 0x7A29] = 0xFDB1 ^ 0x7A29;
        Draggable.F[0x94CD ^ 0x94D6] = 0xFFFF6B07 ^ 0x94D6;
        Draggable.F[0x7760 ^ 0x771D] = 0xFFFF88F6 ^ 0x771D;
        Draggable.F[0x6115 ^ 0x61C2] = 0xA079 ^ 0x61C2;
        Draggable.F[0x9D7 ^ 0x97A] = 0xFFFFF69C ^ 0x97A;
        Draggable.F[0x395E ^ 0x39C4] = 0xFFFFC633 ^ 0x39C4;
        Draggable.F[0xF45D ^ 0xF4C6] = 0xFFFF0B02 ^ 0xF4C6;
    }
}

