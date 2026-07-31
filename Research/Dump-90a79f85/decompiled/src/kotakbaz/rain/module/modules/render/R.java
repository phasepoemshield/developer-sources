/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.minecraft.class_1297
 *  net.minecraft.class_1657
 *  net.minecraft.class_1921
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_7833
 *  net.minecraft.class_9799
 *  org.joml.Quaternionfc
 *  org.lwjgl.opengl.GL11
 */
package kotakbaz.rain.module.modules.render;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.draggable.animation.A;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.events.B;
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.event.events.d_0;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.render.N;
import kotakbaz.rain.module.modules.render.P;
import kotakbaz.rain.module.modules.render.target.a;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_7833;
import net.minecraft.class_9799;
import net.minecraft.client.render.RainRenderLayers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionfc;
import org.lwjgl.opengl.GL11;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0004\u0089\u0001\u008a\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0002\u00a2\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020(0/2\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\b0\u00101J'\u00106\u001a\u0002052\u0006\u00102\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b6\u00107J\u001f\u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000203H\u0002\u00a2\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u0002032\u0006\u0010>\u001a\u000203H\u0002\u00a2\u0006\u0004\b?\u0010@J\u009f\u0001\u0010U\u001a\u00020\u00062\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020\u001a2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001a2\u0006\u0010H\u001a\u00020(2\u0006\u0010I\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020\u001a2\u0006\u0010K\u001a\u00020\u001a2\u0006\u0010L\u001a\u00020(2\u0006\u0010M\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u001a2\u0006\u0010P\u001a\u00020(2\u0006\u0010Q\u001a\u00020\u001a2\u0006\u0010R\u001a\u00020\u001a2\u0006\u0010S\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020(H\u0002\u00a2\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\bW\u0010\u0003R\u0014\u0010X\u001a\u00020-8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010Z\u001a\u0002088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u0002088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\\\u0010[R\u0014\u0010]\u001a\u00020-8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b]\u0010YR\u0014\u0010^\u001a\u00020-8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b^\u0010YR\u0014\u0010_\u001a\u00020-8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b_\u0010YR\u0014\u0010`\u001a\u00020-8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b`\u0010YR\u0014\u0010a\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u0002038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010e\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\be\u0010bR\u0014\u0010f\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bf\u0010bR\u0014\u0010g\u001a\u00020\u001a8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bg\u0010bR\u0014\u0010h\u001a\u0002038\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bh\u0010dR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010m\u001a\u00020l8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010u\u001a\u00020r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bu\u0010tR\u001c\u0010w\u001a\n v*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bw\u0010xR\u001c\u0010y\u001a\n v*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\by\u0010xR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010}\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b}\u0010~R\u001f\u0010\u007f\u001a\n v*\u0004\u0018\u000105058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0081\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0081\u0001\u0010bR\u0018\u0010\u0082\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0082\u0001\u0010bR\u0018\u0010\u0083\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0083\u0001\u0010bR\u0018\u0010\u0084\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0084\u0001\u0010bR\u0019\u0010\u0085\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0087\u0001\u0010bR\u0018\u0010\u0088\u0001\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\b\u0088\u0001\u0010b\u00a8\u0006\u008b\u0001"}, d2={"Lkotakbaz/rain/module/modules/render/TargetEspModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/AttackEvent;", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "onDisable", "updateLegacyAnimation", "Lnet/minecraft/class_4597$class_4598;", "consumers", "renderMarker", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4597$class_4598;)V", "Lnet/minecraft/class_1921;", "fillLayer", "outlineLayer", "renderRing", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4597$class_4598;Lnet/minecraft/class_1921;Lnet/minecraft/class_1921;)V", "", "partialTicks", "updateTrackedPosition", "(F)V", "Lnet/minecraft/class_1657;", "resolveLiveTarget", "()Lnet/minecraft/class_1657;", "player", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "Lnet/minecraft/class_2960;", "selectedTexture", "()Lnet/minecraft/class_2960;", "Ljava/awt/Color;", "selectedEspColor", "()Ljava/awt/Color;", "isRingStyle", "()Z", "", "maxSegments", "", "resolveRingColors", "(I)[Ljava/awt/Color;", "segment", "", "radius", "Lnet/minecraft/class_243;", "ringPoint", "(IID)Lnet/minecraft/class_243;", "", "frameTime", "targetHeight", "Lkotakbaz/rain/module/modules/render/TargetEspModule$RingSweepState;", "resolveRingSweep", "(JD)Lkotakbaz/rain/module/modules/render/TargetEspModule$RingSweepState;", "value", "easeInOutQuad", "(D)D", "Lnet/minecraft/class_4588;", "quadBuffer", "Lnet/minecraft/class_4587$class_4665;", "entry", "x1", "y1", "z1", "color1", "x2", "y2", "z2", "color2", "x3", "y3", "z3", "color3", "x4", "y4", "z4", "color4", "drawColoredQuad", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFLjava/awt/Color;FFFLjava/awt/Color;FFFLjava/awt/Color;FFFLjava/awt/Color;)V", "resetAnimations", "BUFFER_SIZE", "I", "LEGACY_ANIMATION_MILLIS", "J", "RING_ANIMATION_MILLIS", "STYLE_CIRCLE", "STYLE_DIAMOND", "STYLE_RING", "RING_SEGMENTS", "RING_RADIUS_MULTIPLIER", "F", "RING_SWEEP_DURATION_MILLIS", "D", "RING_BRIGHT_ALPHA", "RING_FADE_ALPHA", "RING_OUTLINE_ALPHA", "RING_OUTLINE_WIDTH", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "espColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Lkotakbaz/rain/module/setting/ModeSetting;", "style", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "markerSize", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "speedMod", "kotlin.jvm.PlatformType", "circleTexture", "Lnet/minecraft/class_2960;", "diamondTexture", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "showAnimation", "Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "displayTarget", "Lnet/minecraft/class_1657;", "lastTargetPos", "Lnet/minecraft/class_243;", "lastTargetHeight", "rotation", "prevRotation", "rotationSpeed", "flip", "Z", "circleStep", "prevCircleStep", "RingSweepState", "QuadVertices", "rain-visuals"})
public final class R
extends a_0 {
    @NotNull
    public static final R INSTANCE;
    private static final int a = 262144;
    private static final long A = 120L;
    private static final long b = 500L;
    private static final int B = 0;
    private static final int c = 1;
    private static final int C = 2;
    private static final int d = 360;
    private static final float D = 0.8f;
    private static final double e = 2000.0;
    private static final float E = 0.88f;
    private static final float f = 0.01f;
    private static final float F = 0.16f;
    private static final double g = 1.5;
    @NotNull
    private static final c G;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.B h;
    @NotNull
    private static final kotakbaz.rain.module.setting.c H;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 i;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 I;
    private static final class_2960 j;
    private static final class_2960 J;
    @NotNull
    private static final A k;
    @Nullable
    private static class_1657 K;
    private static class_243 l;
    private static float L;
    private static float m;
    private static float M;
    private static float n;
    private static boolean N;
    private static float o;
    private static float O;
    private static Object[] p;
    private static Object q;
    private static Object[] Q;
    private static Object[] P;
    private static Object[] r;
    public static int[] R;

    private R() {
        int n = R[0];
        n += R[1];
        int n2 = R[3];
        n2 ^= R[4];
        int n3 = R[6];
        n3 ^= R[7];
        super((String)p[n += R[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)p[n2 += R[5]] + (String)p[n3 += R[8]]);
    }

    @Commando
    public final void onUpdate(@NotNull D d2) {
        int n;
        long l = -513953527086558020L;
        long l2 = 5978001320862958713L;
        int n2 = R[9];
        n2 -= R[10];
        Intrinsics.checkNotNullParameter(d2, (String)p[n2 -= R[11]]);
        kotakbaz.rain.module.modules.render.target.a.INSTANCE.update();
        class_1657 class_16572 = this.resolveLiveTarget();
        if (class_16572 != null) {
            K = class_16572;
        }
        M = m;
        O = o;
        if (class_16572 != null) {
            int n3 = R[12];
            n3 -= R[13];
            n = n3 -= R[14];
        } else {
            int n4 = R[15];
            n4 ^= R[16];
            n = n4 ^= R[17];
        }
        int n5 = R[18];
        n5 -= R[19];
        long l3 = l2;
        int n6 = R[21];
        n6 ^= R[22];
        l2 = l3 ^ ((long)n << (n5 ^= R[20]) ^ l3) & -1L << (n6 += R[23]);
        int n7 = R[24];
        n7 ^= R[25];
        double d3 = (int)(l2 >>> (n7 -= R[26])) != 0 ? 1.0 : 0.0;
        boolean bl = R[27];
        bl -= R[28];
        k.run(d3, this.isRingStyle() ? 500L : 120L, kotakbaz.rain.client.draggable.animation.a_0.b, bl += R[29]);
        int n8 = R[30];
        n8 ^= R[31];
        if ((int)(l2 >>> (n8 += R[32])) == 0 && k.get() <= 0.0f) {
            K = null;
            this.resetAnimations();
            return;
        }
        if (K == null || k.get() <= 0.0f) {
            return;
        }
        if (this.isRingStyle()) {
            o += 0.15f * ((Number)I.getValue()).floatValue();
        } else {
            this.updateLegacyAnimation();
        }
    }

    @Commando
    public final void onAttack(@NotNull d_0 d_02) {
        int n = R[33];
        n += R[34];
        Intrinsics.checkNotNullParameter(d_02, (String)p[n -= R[35]]);
        if (!this.isEnabled()) {
            return;
        }
        class_1297 class_12972 = d_02.getEntity();
        class_1657 class_16572 = class_12972 instanceof class_1657 ? (class_1657)class_12972 : null;
        if (class_16572 == null) {
            return;
        }
        class_1657 class_16573 = class_16572;
        if (!this.isUsableTarget(class_16573)) {
            return;
        }
        kotakbaz.rain.module.modules.render.target.a.INSTANCE.track(class_16573);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull B b2) {
        long l = -1238705380434295386L;
        int n = R[36];
        n += R[37];
        Intrinsics.checkNotNullParameter(b2, (String)p[n ^= R[38]]);
        if (!this.isEnabled()) {
            return;
        }
        k.update();
        if (k.get() <= 0.0f) {
            return;
        }
        this.updateTrackedPosition(b2.getPartialTicks());
        int n2 = R[39];
        n2 -= R[40];
        AutoCloseable autoCloseable = (AutoCloseable)new class_9799(n2 += R[41]);
        Throwable throwable = null;
        try {
            Object object;
            block11: {
                class_4597.class_4598 class_45982;
                block10: {
                    object = (class_9799)autoCloseable;
                    long l2 = l;
                    int n3 = R[42];
                    n3 ^= R[43];
                    l = l2 ^ (0L ^ l2) & -1L << (n3 ^= R[44]);
                    class_45982 = class_4597.method_22991((class_9799)object);
                    if (!INSTANCE.isRingStyle()) break block10;
                    class_1921 class_19212 = class_1921.method_49042();
                    class_1921 class_19213 = class_1921.method_49043((double)Double.longBitsToDouble(0x90BD21987DC8E384L ^ 0xAF4521987DC8E384L));
                    GlStateManager._enableBlend();
                    int n4 = R[45];
                    n4 ^= R[46];
                    n4 -= R[47];
                    int n5 = R[48];
                    n5 -= R[49];
                    int n6 = R[51];
                    n6 -= R[52];
                    int n7 = R[54];
                    n7 ^= R[55];
                    GlStateManager._blendFuncSeparate((int)n4, (int)(n5 ^= R[50]), (int)(n6 += R[53]), (int)(n7 ^= R[56]));
                    GlStateManager._enableDepthTest();
                    GlStateManager._disableCull();
                    int n8 = R[57];
                    n8 += R[58];
                    GL11.glEnable((int)(n8 ^= R[59]));
                    int n9 = R[60];
                    n9 ^= R[61];
                    int n10 = R[63];
                    n10 ^= R[64];
                    GL11.glHint((int)(n9 -= R[62]), (int)(n10 += R[65]));
                    try {
                        Intrinsics.checkNotNull(class_45982);
                        Intrinsics.checkNotNull(class_19212);
                        Intrinsics.checkNotNull(class_19213);
                        INSTANCE.renderRing(b2, class_45982, class_19212, class_19213);
                    }
                    catch (Throwable throwable2) {
                        int n11 = R[69];
                        n11 -= R[70];
                        GL11.glDisable((int)(n11 ^= R[71]));
                        GlStateManager._enableCull();
                        GlStateManager._enableDepthTest();
                        GlStateManager._disableBlend();
                        throw throwable2;
                    }
                    int n12 = R[66];
                    n12 ^= R[67];
                    GL11.glDisable((int)(n12 -= R[68]));
                    GlStateManager._enableCull();
                    GlStateManager._enableDepthTest();
                    GlStateManager._disableBlend();
                    break block11;
                }
                Intrinsics.checkNotNull(class_45982);
                INSTANCE.renderMarker(b2, class_45982);
                class_45982.method_22993();
            }
            object = Unit.INSTANCE;
        }
        catch (Throwable throwable3) {
            throwable = throwable3;
            throw throwable3;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }

    @Override
    public void onDisable() {
        K = null;
        l = class_243.field_1353;
        L = 0.0f;
        this.resetAnimations();
        k.snap(0.0);
    }

    private final void updateLegacyAnimation() {
        if (k.get() > 0.8f) {
            if ((m += n) >= 360.0f) {
                m -= 360.0f;
                M -= 360.0f;
            } else if (m <= -360.0f) {
                m += 360.0f;
                M += 360.0f;
            }
            if (n > 25.0f) {
                int n = R[72];
                n ^= R[73];
                N = n += R[74];
            }
            if (n < -25.0f) {
                int n = R[75];
                n += R[76];
                N = n -= R[77];
            }
        }
        n = (N ? n - 0.5f : n + 0.5f) * k.get();
    }

    private final void renderMarker(B b2, class_4597.class_4598 class_45982) {
        long l = -2758804602470618128L;
        long l2 = -8766650002766906876L;
        long l3 = 5673567350430186412L;
        float f2 = RangesKt.coerceIn(k.get(), 0.0f, 1.0f);
        if (f2 <= 0.0f) {
            return;
        }
        Color color = this.selectedEspColor();
        int n = R[78];
        n -= R[79];
        n -= R[80];
        int n2 = R[81];
        n2 -= R[82];
        n2 -= R[83];
        int n3 = R[84];
        n3 ^= R[85];
        long l4 = l3;
        int n4 = R[87];
        n4 ^= R[88];
        l3 = l4 ^ ((long)RangesKt.coerceIn((int)((float)color.getAlpha() * f2), n, n2) << (n3 += R[86]) ^ l4) & -1L << (n4 ^= R[89]);
        int n5 = R[90];
        n5 ^= R[91];
        if ((int)(l3 >>> (n5 ^= R[92])) <= 0) {
            return;
        }
        float f3 = M + (m - M) * b2.getPartialTicks();
        float f4 = ((Number)i.getValue()).floatValue() * (1.0f + 0.5f * (1.0f - f2));
        float f5 = f4 * 0.5f;
        class_243 class_2432 = b_0.getMc().field_1773.method_19418().method_19326();
        class_1921 class_19212 = RainRenderLayers.getTargetEsp(this.selectedTexture());
        b2.getMatrices().method_22903();
        b2.getMatrices().method_22904(kotakbaz.rain.module.modules.render.R.l.field_1352 - class_2432.field_1352, kotakbaz.rain.module.modules.render.R.l.field_1351 - class_2432.field_1351 + (double)(L * 0.5f), kotakbaz.rain.module.modules.render.R.l.field_1350 - class_2432.field_1350);
        b2.getMatrices().method_22907((Quaternionfc)b_0.getMc().field_1773.method_19418().method_23767());
        b2.getMatrices().method_22907((Quaternionfc)class_7833.field_40718.rotationDegrees(f3));
        b2.getMatrices().method_22904(-((double)f5), -((double)f5), 0.0);
        class_4587.class_4665 class_46652 = b2.getMatrices().method_23760();
        class_4588 class_45882 = class_45982.getBuffer(class_19212);
        int n6 = R[93];
        n6 += R[94];
        class_45882.method_56824(class_46652, 0.0f, 0.0f, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n6 ^= R[95]))).method_22913(0.0f, 1.0f);
        int n7 = R[96];
        n7 ^= R[97];
        class_45882.method_56824(class_46652, f4, 0.0f, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n7 += R[98]))).method_22913(1.0f, 1.0f);
        int n8 = R[99];
        n8 += R[100];
        class_45882.method_56824(class_46652, f4, f4, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n8 ^= R[101]))).method_22913(1.0f, 0.0f);
        int n9 = R[102];
        n9 ^= R[103];
        class_45882.method_56824(class_46652, 0.0f, f4, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n9 -= R[104]))).method_22913(0.0f, 0.0f);
        b2.getMatrices().method_22909();
    }

    private final void renderRing(B b2, class_4597.class_4598 class_45982, class_1921 class_19212, class_1921 class_19213) {
        Color color;
        class_243 class_2432;
        long l = 8817369041641398019L;
        long l2 = 7874071522188246848L;
        long l3 = -5945941989255976209L;
        long l4 = 7586675604406040719L;
        long l5 = -2877488279112267800L;
        long l6 = 1135768535351208866L;
        class_1657 class_16572 = K;
        if (class_16572 == null) {
            return;
        }
        class_1657 class_16573 = class_16572;
        if (!this.isUsableTarget(class_16573)) {
            return;
        }
        float f2 = RangesKt.coerceIn(k.get(), 0.0f, 1.0f);
        if (f2 <= 0.0f) {
            return;
        }
        float f3 = class_16573.method_17681() * 0.8f;
        long l7 = System.currentTimeMillis();
        N n = this.resolveRingSweep(l7, L);
        class_243 class_2433 = b_0.getMc().field_1773.method_19418().method_19326();
        double d2 = kotakbaz.rain.module.modules.render.R.l.field_1352 - class_2433.field_1352;
        double d3 = kotakbaz.rain.module.modules.render.R.l.field_1351 - class_2433.field_1351;
        double d4 = kotakbaz.rain.module.modules.render.R.l.field_1350 - class_2433.field_1350;
        class_4587.class_4665 class_46652 = b2.getMatrices().method_23760();
        int n2 = R[105];
        n2 -= R[106];
        Color[] colorArray = this.resolveRingColors(n2 += R[107]);
        class_4588 class_45882 = class_45982.getBuffer(class_19212);
        float f4 = (float)(d3 + n.getLeadingEdgeY());
        float f5 = (float)((double)f4 + n.getTrailOffset());
        long l8 = l6;
        int n3 = R[108];
        n3 -= R[109];
        l6 = l8 ^ (0L ^ l8) & -1L << (n3 -= R[110]);
        while (true) {
            int n4 = R[111];
            n4 += R[112];
            int n5 = R[114];
            n5 ^= R[115];
            if ((int)(l6 >>> (n4 ^= R[113])) >= (n5 ^= R[116])) break;
            int n6 = R[117];
            n6 -= R[118];
            int n7 = R[120];
            n7 ^= R[121];
            class_243 class_2434 = this.ringPoint((int)(l6 >>> (n6 ^= R[119])), n7 ^= R[122], f3);
            int n8 = R[123];
            n8 += R[124];
            int n9 = R[126];
            n9 += R[127];
            int n10 = R[129];
            n10 += R[130];
            class_2432 = this.ringPoint((int)(l6 >>> (n8 -= R[125])) + (n9 ^= R[128]), n10 -= R[131], f3);
            int n11 = R[132];
            n11 -= R[133];
            color = colorArray[(int)(l6 >>> (n11 ^= R[134]))];
            int n12 = R[135];
            n12 += R[136];
            int n13 = R[138];
            n13 -= R[139];
            Color color2 = colorArray[(int)(l6 >>> (n12 -= R[137])) + (n13 += R[140])];
            Intrinsics.checkNotNull(class_45882);
            Intrinsics.checkNotNull(class_46652);
            this.drawColoredQuad(class_45882, class_46652, (float)(d2 + class_2434.field_1352), f4, (float)(d4 + class_2434.field_1350), kotakbaz.rain.client.util.color.a_0.INSTANCE.setAlpha(color, 0.88f * f2), (float)(d2 + class_2434.field_1352), f5, (float)(d4 + class_2434.field_1350), kotakbaz.rain.client.util.color.a_0.INSTANCE.setAlpha(color, 0.01f * f2), (float)(d2 + class_2432.field_1352), f5, (float)(d4 + class_2432.field_1350), kotakbaz.rain.client.util.color.a_0.INSTANCE.setAlpha(color2, 0.01f * f2), (float)(d2 + class_2432.field_1352), f4, (float)(d4 + class_2432.field_1350), kotakbaz.rain.client.util.color.a_0.INSTANCE.setAlpha(color2, 0.88f * f2));
            l6 += 0x100000000L;
        }
        class_45982.method_22994(class_19212);
        class_4588 class_45883 = class_45982.getBuffer(class_19213);
        long l9 = l4;
        int n14 = R[141];
        n14 -= R[142];
        l4 = l9 ^ (0L ^ l9) & -1L << (n14 -= R[143]);
        while (true) {
            int n15 = R[144];
            n15 -= R[145];
            int n16 = R[147];
            n16 += R[148];
            if ((int)(l4 >>> (n15 ^= R[146])) >= (n16 ^= R[149])) break;
            int n17 = R[150];
            n17 += R[151];
            int n18 = R[153];
            n18 += R[154];
            class_2432 = this.ringPoint((int)(l4 >>> (n17 ^= R[152])), n18 += R[155], f3);
            int n19 = R[156];
            color = kotakbaz.rain.client.util.color.a_0.INSTANCE.setAlpha(colorArray[(int)(l4 >>> (n19 += R[157]))], 0.16f * f2);
            class_45883.method_56824(class_46652, (float)(d2 + class_2432.field_1352), f4, (float)(d4 + class_2432.field_1350)).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, 0.0f, 1.0f, 0.0f);
            l4 += 0x100000000L;
        }
        class_45982.method_22994(class_19213);
    }

    private final void updateTrackedPosition(float f2) {
        class_1657 class_16572 = K;
        if (class_16572 == null) {
            return;
        }
        class_1657 class_16573 = class_16572;
        if (!this.isUsableTarget(class_16573)) {
            return;
        }
        l = class_16573.method_30950(f2);
        L = class_16573.method_17682();
    }

    private final class_1657 resolveLiveTarget() {
        class_1657 class_16572 = kotakbaz.rain.module.modules.render.target.a.INSTANCE.currentTarget();
        if (class_16572 == null) {
            return null;
        }
        class_1657 class_16573 = class_16572;
        if (!this.isUsableTarget(class_16573)) {
            return null;
        }
        return class_16573;
    }

    private final boolean isUsableTarget(class_1657 class_16572) {
        int n;
        if (!class_16572.method_31481() && class_16572.method_5805() && !class_16572.method_5767()) {
            int n2 = R[158];
            n2 ^= R[159];
            n = n2 ^= R[160];
        } else {
            int n3 = R[161];
            n3 ^= R[162];
            n = n3 += R[163];
        }
        return n != 0;
    }

    private final class_2960 selectedTexture() {
        class_2960 class_29602;
        switch (H.getSelectedIndex()) {
            case 1: {
                class_2960 class_29603 = J;
                class_29602 = class_29603;
                int n = R[164];
                n ^= R[165];
                Intrinsics.checkNotNullExpressionValue(class_29603, (String)p[n -= R[166]]);
                break;
            }
            case 0: {
                class_2960 class_29604 = j;
                class_29602 = class_29604;
                int n = R[167];
                n -= R[168];
                Intrinsics.checkNotNullExpressionValue(class_29604, (String)p[n ^= R[169]]);
                break;
            }
            default: {
                class_2960 class_29605 = j;
                class_29602 = class_29605;
                int n = R[170];
                n -= R[171];
                Intrinsics.checkNotNullExpressionValue(class_29605, (String)p[n ^= R[172]]);
            }
        }
        return class_29602;
    }

    private final Color selectedEspColor() {
        return (Boolean)G.getValue() != false && kotakbaz.rain.module.modules.render.P.INSTANCE.isEnabled() ? kotakbaz.rain.module.modules.render.P.INSTANCE.getClientColor() : (Color)h.getValue();
    }

    private final boolean isRingStyle() {
        boolean bl;
        int n = R[173];
        n += R[174];
        if (H.getSelectedIndex() == (n += R[175])) {
            boolean bl2 = R[176];
            bl2 ^= R[177];
            bl = bl2 -= R[178];
        } else {
            boolean bl3 = R[179];
            bl3 -= R[180];
            bl = bl3 -= R[181];
        }
        return bl;
    }

    private final Color[] resolveRingColors(int n) {
        long l = -3864106265819040298L;
        long l2 = 3526540039913575354L;
        long l3 = 5363588004829370266L;
        long l4 = -2679153214667876951L;
        long l5 = 3099125851268898693L;
        Color color = this.selectedEspColor();
        long l6 = l5;
        int n2 = R[182];
        n2 += R[183];
        l5 = l6 ^ (0L ^ l6) & -1L << (n2 += R[184]);
        int n3 = R[185];
        n3 -= R[186];
        n3 ^= R[187];
        int n4 = R[188];
        n4 += R[189];
        long l7 = l3;
        int n5 = R[191];
        n5 += R[192];
        l3 = l7 ^ ((long)(n + n3) << (n4 ^= R[190]) ^ l7) & -1L << (n5 ^= R[193]);
        int n6 = R[194];
        n6 -= R[195];
        Color[] colorArray = new Color[(int)(l3 >>> (n6 += R[196]))];
        while (true) {
            int n7 = R[197];
            n7 -= R[198];
            int n8 = R[200];
            n8 ^= R[201];
            if ((int)(l5 >>> (n7 += R[199])) >= (int)(l3 >>> (n8 += R[202]))) break;
            int n9 = R[203];
            n9 ^= R[204];
            n9 -= R[205];
            int n10 = R[206];
            n10 += R[207];
            long l8 = l4;
            int n11 = R[209];
            n11 -= R[210];
            l4 = l8 ^ ((long)((int)(l5 >>> n9)) << (n10 += R[208]) ^ l8) & -1L << (n11 += R[211]);
            int n12 = R[212];
            n12 ^= R[213];
            colorArray[(int)(l4 >>> (n12 -= kotakbaz.rain.module.modules.render.R.R[214]))] = color;
            l5 += 0x100000000L;
        }
        return colorArray;
    }

    private final class_243 ringPoint(int n, int n2, double d2) {
        long l = 7501223427106718557L;
        int n3 = R[215];
        n3 ^= R[216];
        long l2 = l;
        int n4 = R[218];
        n4 += R[219];
        l = l2 ^ ((long)Math.min(n, n2) << (n3 -= R[217]) ^ l2) & -1L << (n4 += R[220]);
        int n5 = R[221];
        n5 -= R[222];
        double d3 = (double)((int)(l >>> (n5 ^= R[223]))) * Double.longBitsToDouble(0x6C94B404B9C78FEEL ^ 0x2C8D95FFED83A2F6L) / (double)n2;
        return new class_243(Math.cos(d3) * d2, 0.0, -Math.sin(d3) * d2);
    }

    private final N resolveRingSweep(long l, double d2) {
        int n;
        double d3;
        long l2 = 4213596009242840845L;
        long l3 = 6564512941285246141L;
        double d4 = RangesKt.coerceAtLeast(Double.longBitsToDouble(0xF5FD1A60863D6F23L ^ 0xB5625A60863D6F23L) / (double)((Number)I.getValue()).floatValue(), Double.longBitsToDouble(0xFE50DD8AA9658635L ^ 0xBE253D8AA9658635L));
        double d5 = l % (long)d4;
        if (d5 > (d3 = d4 * Double.longBitsToDouble(0x99577DE8B3A71AAAL ^ 0xA6B77DE8B3A71AAAL))) {
            int n2 = R[224];
            n2 += R[225];
            n = n2 += R[226];
        } else {
            int n3 = R[227];
            n3 -= R[228];
            n = n3 -= R[229];
        }
        int n4 = R[230];
        n4 += R[231];
        long l4 = l3;
        int n5 = R[233];
        n5 ^= R[234];
        l3 = l4 ^ ((long)n << (n4 += R[232]) ^ l4) & -1L << (n5 ^= R[235]);
        double d6 = d5 / d3;
        int n6 = R[236];
        n6 -= R[237];
        d6 = (int)(l3 >>> (n6 -= R[238])) != 0 ? d6 - 1.0 : 1.0 - d6;
        d6 = this.easeInOutQuad(RangesKt.coerceIn(d6, 0.0, 1.0));
        int n7 = R[239];
        n7 += R[240];
        double d7 = d2 / Double.longBitsToDouble(0xC4A5CD29E08C18B4L ^ 0xFB56FE1AD3BF2B87L) * (d6 > Double.longBitsToDouble(0x2731BF8D2714B8B1L ^ 0x18D1BF8D2714B8B1L) ? 1.0 - d6 : d6) * ((int)(l3 >>> (n7 -= R[241])) != 0 ? Double.longBitsToDouble(0x4A5C5B5A472D948DL ^ 0xF5AC5B5A472D948DL) : 1.0);
        return new N(d2 * d6, d7);
    }

    private final double easeInOutQuad(double d2) {
        return d2 < Double.longBitsToDouble(0x60915BAF736D3766L ^ 0x5F715BAF736D3766L) ? Double.longBitsToDouble(0x13C31EB7A4D18B53L ^ 0x53C31EB7A4D18B53L) * d2 * d2 : 1.0 - Math.pow(Double.longBitsToDouble(0x106CA591FBB71B4BL ^ 0xD06CA591FBB71B4BL) * d2 + Double.longBitsToDouble(0xFE7BA4F048D33521L ^ 0xBE7BA4F048D33521L), Double.longBitsToDouble(0xA9D7A0329C447B3FL ^ 0xE9D7A0329C447B3FL)) * Double.longBitsToDouble(0x25B316A91980315CL ^ 0x1A5316A91980315CL);
    }

    private final void drawColoredQuad(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, Color color, float f5, float f6, float f7, Color color2, float f8, float f9, float f10, Color color3, float f11, float f12, float f13, Color color4) {
        class_45882.method_56824(class_46652, f2, f3, f4).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_45882.method_56824(class_46652, f5, f6, f7).method_1336(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
        class_45882.method_56824(class_46652, f8, f9, f10).method_1336(color3.getRed(), color3.getGreen(), color3.getBlue(), color3.getAlpha());
        class_45882.method_56824(class_46652, f11, f12, f13).method_1336(color4.getRed(), color4.getGreen(), color4.getBlue(), color4.getAlpha());
    }

    private final void resetAnimations() {
        m = 1.0f;
        M = 0.0f;
        n = 1.0f;
        int n = R[242];
        n -= R[243];
        N = n ^= R[244];
        o = 0.0f;
        O = 0.0f;
    }

    private static final boolean useClientColor$lambda$0() {
        return kotakbaz.rain.module.modules.render.P.INSTANCE.isEnabled();
    }

    private static final boolean espColor$lambda$0() {
        int n;
        if (!((Boolean)G.getValue()).booleanValue() || !kotakbaz.rain.module.modules.render.P.INSTANCE.isEnabled()) {
            int n2 = R[245];
            n2 ^= R[246];
            n = n2 += R[247];
        } else {
            int n3 = R[248];
            n3 ^= R[249];
            n = n3 ^= R[250];
        }
        return n != 0;
    }

    private static final boolean markerSize$lambda$0() {
        boolean bl;
        if (!INSTANCE.isRingStyle()) {
            boolean bl2 = R[251];
            bl2 -= R[252];
            bl = bl2 += R[253];
        } else {
            boolean bl3 = R[254];
            bl3 += R[255];
            bl = bl3 -= R[256];
        }
        return bl;
    }

    private static final boolean speedMod$lambda$0() {
        return INSTANCE.isRingStyle();
    }

    static {
        kotakbaz.rain.module.modules.render.R.b();
        long l = 5926915559425899965L;
        long l2 = -7247179678334879305L;
        long l3 = -2182433304358200467L;
        long l4 = 5953092990722763161L;
        long l5 = 5664117362175812019L;
        long l6 = 994685490860020640L;
        long l7 = -496601840003553127L;
        long l8 = 6544808083790099662L;
        long l9 = 7420688345138614927L;
        long l10 = 1485683341727782656L;
        long l11 = 6931164982798320547L;
        long l12 = 7432267208608300351L;
        long l13 = -5479566847966259217L;
        long l14 = 940458195468517717L;
        int n = R[257];
        n -= R[258];
        p = new Object[n ^= R[259]];
        long l15 = l14;
        int n2 = R[260];
        n2 += R[261];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= R[262]);
        Object[] objectArray = new Object[R[263]];
        objectArray[kotakbaz.rain.module.modules.render.R.R[264]] = P;
        objectArray[kotakbaz.rain.module.modules.render.R.R[265]] = R[266];
        int n3 = R[267];
        Object object = kotakbaz.rain.module.modules.render.R.A()[R[268]];
        if (object == null) {
            char[] cArray = "\u6895\u6894\u69b9\u69bf\u69b4\u69b4\u689e\u69b8\u695e\u689f\u69b9\u69b6\u68e7\u695c\u68e9\u69b1\u698a\u6955\u695d\u689c\u695a\u6987\u689c\u6985\u69bb\u6988\u68e0\u695d\u6986\u68e6\u69b5\u69ba\u6982\u6980\u6894\u6951\u6956\u6981\u6898\u69bf\u6957\u69b5\u6951\u6985\u68e7\u69ba\u6895\u6989\u69bd\u689a\u6955\u6956\u6951\u695b\u695c\u695c\u68e9\u6898\u6958\u6955\u68e1\u69ba\u689a\u689f\u6894\u6894\u695e\u68e5\u6956\u695b\u689e\u695f\u6954\u68e0\u69b8\u689a\u69bb\u68eb\u698e\u695c\u6984\u6981\u689c\u6980\u6985\u6982\u6958\u695e\u68c0\u69be\u6984\u6898\u6986\u68e6\u6982\u6983\u6957\u6957\u6959\u68e3\u6898\u69b1\u6988\u6955\u6954\u68ea\u6895\u69b5\u689a\u68e4\u6985\u698a\u69bd\u69b8\u6988\u6982\u6955\u69b4\u69b5\u6896\u68e6\u6951\u69bd\u68ea\u6895\u68e6\u68e3\u68e5\u68e8\u6958\u68e9\u6982\u698b\u695b\u6989\u689c\u69bd\u69bb\u689a\u69bc\u6897\u69b9\u6982\u69bb\u68e1\u69bf\u698b\u6988\u6988\u69b6\u698e\u6957\u689e\u698a\u6894\u68e0\u6894\u6954\u698a\u689b\u695b\u69b1\u69b4\u68c0\u6956\u69bc\u6958\u6896\u6957\u698e\u689b\u695a\u698a\u69bd\u68e6\u6959\u6980\u6897\u6955\u69bb\u6984\u6989\u69b5\u69bb\u689f\u6984\u6989\u698a\u6951\u6987\u69bc\u6896\u69bc\u68e8\u68e3\u695f\u6955\u68e3\u6958\u6959\u69b7\u6954\u6983\u6985\u6987\u69b8\u695f\u695e\u6896\u6957\u69b9\u6982\u68e1\u68ea\u695d\u6986\u689c\u689a\u6897\u6958\u6958\u68e9\u68e5\u6981\u698a\u68e6\u6982\u69b7\u6986\u69bb\u6982\u69bf\u6896\u6956\u68e5\u68e4\u6894\u69b4\u68eb\u68ee\u6956\u6982\u69bd\u689f\u68eb\u68eb\u68e8\u689a\u6984\u698e\u6986\u6957\u68ee\u69b6\u68ee\u68e6\u68e7\u68eb\u68e9\u68e3\u68c0\u6989\u695b\u68e7\u695b\u69b6\u6951\u69b4\u69b9\u689b\u69be\u69b4\u6954\u69bd\u695d\u6986\u698b\u68e9\u68ea\u6959\u68e0\u68e0\u68e8\u695c\u695e\u6986\u695a\u6983\u689b\u689a\u68e3\u689f\u698b\u6957\u698a\u68ea\u6896\u6954\u6899\u6989\u6983\u695e\u68e8\u69b8\u6987\u69be\u69bf\u695a\u698b\u695a\u68e4\u6988\u6959\u6983\u689c\u698a\u698e\u6894\u68ea\u68e1\u698a\u69b4\u695e\u6957\u69ba\u6959\u6958\u6959\u698e\u695c\u6896\u6959\u689e\u6896\u6959\u69bd\u6898\u6986\u68ea\u695b\u68e5\u6894\u68e4\u69b9\u68ee\u6981\u68e0\u68ee\u689a\u689b\u68e1\u6982\u68ea\u68e2\u6955\u68e3\u6986\u69b8\u689b\u698b\u68e8\u68ea\u68e7\u695a\u695d\u698a\u68e9\u689f\u69b4\u6988\u6895\u698b\u68ee\u69b6\u68e9\u6897\u695e\u6951\u695b\u69b1\u695c\u695c\u6988\u68e1\u6988\u6898\u69b7\u69be\u689c\u68e0\u69b9\u68e2\u68eb\u695c\u68eb\u69be\u68c0\u6958\u68ea\u68e3\u695e\u6894\u6897\u6989\u689b\u68e5\u6957\u6983\u6954\u68e6\u69b9\u6982\u68e4\u68e1\u69b4\u695d\u68ee\u689b\u6898\u69b5\u68ea\u6957\u6898\u6894\u695a\u68e2\u689a\u69bc\u68e7\u6951\u68e1\u69ba\u6955\u6898\u69b9\u6896\u68e5\u68e9\u69bd\u6980\u69b5\u6958\u689e\u69b7\u6958\u6958\u68e4\u69bd\u695a\u68e8\u69bc\u698b\u6985\u6988\u68e0\u6898\u68e5\u69bb\u6895\u69b9\u689c\u6959\u68e9\u6981\u69bd\u6959\u68e8\u689b\u69b7\u6982\u68e1\u68e1\u6896\u698a\u695a\u689f\u69b9\u6956\u6954\u6989\u6986\u6958\u695c\u6988\u6986\u68ea\u6895\u6956\u689e\u69b6\u695e\u69bf\u6989\u68e5\u6985\u695b\u6983\u6899\u69bd\u698b\u6981\u698a\u698b\u69be\u69b8\u68e3\u68e6\u68ea\u6984\u6899\u689b\u689c".toCharArray();
            for (int i2 = R[269]; i2 < R[270]; ++i2) {
                int n4 = cArray[i2];
                n4 ^= R[271];
                n4 -= R[272];
                n4 += R[273];
                n4 += R[274];
                n4 -= R[275];
                n4 -= R[276];
                n4 ^= R[277];
                n4 -= R[278];
                n4 += R[279];
                n4 -= R[280];
                n4 -= R[281];
                n4 -= R[282];
                cArray[i2] = (char)(n4 += R[283]);
            }
            object = kotakbaz.rain.module.modules.render.R.A()[kotakbaz.rain.module.modules.render.R.R[284]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.module.modules.render.R.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = R[285];
        n5 ^= R[286];
        l5 = l16 ^ (0x11600000000L ^ l16) & -1L << (n5 -= R[287]);
        long l17 = l12;
        int n6 = R[288];
        n6 -= R[289];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= R[290]);
        while (true) {
            int n7 = R[291];
            n7 -= R[292];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= R[293]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = R[294];
            n9 -= R[295];
            int n10 = R[297];
            n10 ^= R[298];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += R[296])) & -1L >>> (n10 -= R[299]);
            long l19 = l8;
            int n11 = R[300];
            n11 -= R[301];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += R[302]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = R[303];
            n13 += R[304];
            int n14 = R[306];
            n14 ^= R[307];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= R[305])) & -1L >>> (n14 ^= R[308]);
            int n15 = R[309];
            n15 ^= R[310];
            long l21 = l9;
            int n16 = R[312];
            n16 ^= R[313];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += R[311]) ^ l21) & -1L << (n16 ^= R[314]);
            int n17 = R[315];
            n17 ^= R[316];
            n17 -= R[317];
            int n18 = R[318];
            n18 ^= R[319];
            long l22 = l11;
            int n19 = R[321];
            n19 -= R[322];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= R[320]))) ^ l22) & -1L >>> (n19 -= R[323]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = R[324];
            n20 += R[325];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= R[326]);
            while (true) {
                int n21 = R[327];
                n21 -= R[328];
                if ((int)(l13 >>> (n21 -= R[329])) >= (int)l11) break;
                int n22 = R[330];
                n22 += R[331];
                int n23 = R[333];
                n23 += R[334];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.module.modules.render.R.R[332]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += R[335]))];
                l13 += 0x100000000L;
            }
            int n24 = R[336];
            n24 -= R[337];
            int n25 = (int)(l14 >>> (n24 -= R[338]));
            l14 += 0x100000000L;
            kotakbaz.rain.module.modules.render.R.p[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = R[339];
            n26 ^= R[340];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += R[341]);
        }
        INSTANCE = new R();
        int n27 = R[342];
        n27 += R[343];
        boolean bl = R[345];
        bl -= R[346];
        G = INSTANCE.boolean((String)p[n27 ^= R[344]], bl ^= R[347]).setVisible(R::useClientColor$lambda$0);
        int n28 = R[348];
        n28 -= R[349];
        n28 -= R[350];
        int n29 = R[351];
        n29 += R[352];
        n29 -= R[353];
        int n30 = R[354];
        n30 += R[355];
        int n31 = R[357];
        n31 -= R[358];
        int n32 = R[360];
        n32 -= R[361];
        h = INSTANCE.color((String)p[n28], new Color(n29, n30 += R[356], n31 ^= R[359], n32 -= R[362])).setVisible(R::espColor$lambda$0);
        int n33 = R[363];
        n33 ^= R[364];
        n33 ^= R[365];
        int n34 = R[366];
        n34 += R[367];
        String[] stringArray = new String[n34 ^= R[368]];
        int n35 = R[369];
        n35 += R[370];
        int n36 = R[372];
        n36 ^= R[373];
        stringArray[n35 -= kotakbaz.rain.module.modules.render.R.R[371]] = (String)p[n36 += R[374]];
        int n37 = R[375];
        n37 += R[376];
        int n38 = R[378];
        n38 ^= R[379];
        stringArray[n37 += kotakbaz.rain.module.modules.render.R.R[377]] = (String)p[n38 += R[380]];
        int n39 = R[381];
        n39 ^= R[382];
        int n40 = R[384];
        n40 ^= R[385];
        stringArray[n39 ^= kotakbaz.rain.module.modules.render.R.R[383]] = (String)p[n40 ^= R[386]];
        int n41 = R[387];
        n41 ^= R[388];
        int n42 = R[390];
        n42 ^= R[391];
        H = a_0.mode$default(INSTANCE, (String)p[n33], CollectionsKt.listOf(stringArray), n41 -= R[389], n42 -= R[392], null);
        int n43 = R[393];
        n43 -= R[394];
        i = INSTANCE.slider((String)p[n43 -= R[395]], 1.0f, 0.5f, 1.0f, 0.05f).setVisible(R::markerSize$lambda$0);
        int n44 = R[396];
        n44 -= R[397];
        int n45 = R[399];
        n45 -= -5;
        I = INSTANCE.slider((String)p[n44 += R[398]] + (String)p[n45 -= 36], 1.5f, 0.5f, 2.0f, 0.05f).setVisible(R::speedMod$lambda$0);
        int n46 = -71;
        n46 ^= 0xFFFFFF8C;
        int n47 = 32;
        n47 ^= 0xFFFFFFBE;
        int n48 = -126;
        n48 -= -55;
        j = class_2960.method_60655((String)((String)p[n46 -= 40]), (String)((String)p[n47 += 109] + (String)p[n48 ^= 0xFFFFFFB8]));
        int n49 = 211;
        n49 ^= 0x52;
        int n50 = -55;
        n50 -= 25;
        int n51 = -17;
        n51 ^= 0xFFFFFFBC;
        J = class_2960.method_60655((String)((String)p[n49 += -106]), (String)((String)p[n50 += 90] + (String)p[n51 ^= 0x55]));
        k = new A();
        kotakbaz.rain.module.modules.render.R.l = class_243.field_1353;
        m = 1.0f;
        kotakbaz.rain.module.modules.render.R.n = 1.0f;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = Q;
        if (Q == null) {
            objectArray = Q = new Object[1];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                P = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x10451 ^ 0x10441];
                byArray[0xD1FD ^ 0xD1F7] = 0xFFFF2E3C ^ 0xD1F7;
                byArray[0x308F ^ 0x3084] = 0x30C6 ^ 0x3084;
                byArray[0xC4C ^ 0xC43] = 0xFFFFF38B ^ 0xC43;
                byArray[0xD79D ^ 0xD790] = 0xFFFF2811 ^ 0xD790;
                byArray[0x8630 ^ 0x8638] = 0x8611 ^ 0x8638;
                byArray[0x2A82 ^ 0x2A87] = 0xFFFFD55C ^ 0x2A87;
                byArray[0x47BB ^ 0x47B9] = 0x47D5 ^ 0x47B9;
                byArray[0xED2D ^ 0xED29] = 0xED73 ^ 0xED29;
                byArray[0xA5A7 ^ 0xA5A1] = 0xFFFF5A20 ^ 0xA5A1;
                byArray[0xA0A6 ^ 0xA0AA] = 0xFFFF5F69 ^ 0xA0AA;
                byArray[0x8AF ^ 0x8A1] = 0xFFFFF754 ^ 0x8A1;
                byArray[0xB768 ^ 0xB761] = 0xFFFF48AF ^ 0xB761;
                byArray[0x8231 ^ 0x8232] = 0xFFFF7DB3 ^ 0x8232;
                byArray[0x4A9A ^ 0x4A9D] = 0x4AB6 ^ 0x4A9D;
                byArray[0x957A ^ 0x957B] = 0xFFFF6AAE ^ 0x957B;
                byArray[0x10A4D ^ 0x10A4D] = 0x10A51 ^ 0x10A4D;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (q == null) {
                byte[] byArray2 = new byte[0x63AE ^ 0x638E];
                byArray2[0xA251 ^ 0xA241] = 0xA23C ^ 0xA241;
                byArray2[0x635F ^ 0x6344] = 0xFFFF9CAB ^ 0x6344;
                byArray2[0x806D ^ 0x8074] = 0xFFFF7FBF ^ 0x8074;
                byArray2[0xE941 ^ 0xE94E] = 0xFFFF16CC ^ 0xE94E;
                byArray2[0x32C6 ^ 0x32DB] = 0x32DC ^ 0x32DB;
                byArray2[0x65E9 ^ 0x65E4] = 0x65A3 ^ 0x65E4;
                byArray2[0xEF5 ^ 0xEF4] = 0xEB0 ^ 0xEF4;
                byArray2[0x92EE ^ 0x92F8] = 0x92EA ^ 0x92F8;
                byArray2[0x56BA ^ 0x56B0] = 0xFFFFA95F ^ 0x56B0;
                byArray2[0xA7FF ^ 0xA7E0] = 0xFFFF5810 ^ 0xA7E0;
                byArray2[0x35E5 ^ 0x35E1] = 0xFFFFCA2D ^ 0x35E1;
                byArray2[0x9986 ^ 0x9995] = 0x99FB ^ 0x9995;
                byArray2[0xC921 ^ 0xC93D] = 0xFFFF36A9 ^ 0xC93D;
                byArray2[0x255F ^ 0x2559] = 0x255C ^ 0x2559;
                byArray2[0xA22A ^ 0xA221] = 0xA268 ^ 0xA221;
                byArray2[0xEE9 ^ 0xEE0] = 0xE93 ^ 0xEE0;
                byArray2[0xD01C ^ 0xD01C] = 0xFFFF2FE8 ^ 0xD01C;
                byArray2[0xB41A ^ 0xB404] = 0xFFFF4BEC ^ 0xB404;
                byArray2[0xEB4D ^ 0xEB5F] = 0xFFFF14E4 ^ 0xEB5F;
                byArray2[0x10876 ^ 0x1087E] = 0xFFFEF78F ^ 0x1087E;
                byArray2[0x200C ^ 0x200E] = 0xFFFFDF8B ^ 0x200E;
                byArray2[0xD80E ^ 0xD814] = 0xFFFF2789 ^ 0xD814;
                byArray2[0x80AD ^ 0x80BA] = 0x80E4 ^ 0x80BA;
                byArray2[0xBF6F ^ 0xBF7E] = 0xFFFF408D ^ 0xBF7E;
                byArray2[0x1750 ^ 0x1744] = 0xFFFFE8CC ^ 0x1744;
                byArray2[0x10999 ^ 0x10997] = 0x109A2 ^ 0x10997;
                byArray2[0x723D ^ 0x7225] = 0xFFFF8DFD ^ 0x7225;
                byArray2[0x5A54 ^ 0x5A41] = 0x5A04 ^ 0x5A41;
                byArray2[0xEFB5 ^ 0xEFB0] = 0xEFA4 ^ 0xEFB0;
                byArray2[0x609 ^ 0x60E] = 0x605 ^ 0x60E;
                byArray2[0x6F61 ^ 0x6F62] = 0x6F13 ^ 0x6F62;
                byArray2[0x9FFA ^ 0x9FF6] = 0xFFFF605A ^ 0x9FF6;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.module.modules.render.R.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u874a\u8744\u874d\u8746\u8740\u8534\u8751\u8763\u8776\u8762\u8742\u876f\u875b\u8765\u8755\u8742\u853b\u852b".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 -= 41056;
                        n2 += 36896;
                        n2 ^= 0x4EA4;
                        n2 ^= 0xA907;
                        n2 ^= 0x3EA7;
                        n2 += 28299;
                        n2 -= 32877;
                        n2 += 113;
                        n2 += 30455;
                        n2 -= 24279;
                        n2 += 65307;
                        n2 += 15515;
                        cArray[i2] = (char)(n2 += 4061);
                    }
                    object4 = kotakbaz.rain.module.modules.render.R.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[5] = 87;
                byArray4[13] = 43;
                byArray4[10] = -128;
                byArray4[0] = -70;
                byArray4[6] = -89;
                byArray4[15] = 124;
                byArray4[7] = 67;
                byArray4[12] = -31;
                byArray4[8] = -10;
                byArray4[2] = 47;
                byArray4[4] = 6;
                byArray4[1] = 57;
                byArray4[3] = 49;
                byArray4[11] = -18;
                byArray4[9] = 78;
                byArray4[14] = -80;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.module.modules.render.R.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u3fe7\u3feb\u3f99".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 27201;
                        n3 += 48898;
                        n3 -= 14915;
                        n3 ^= 0x8D25;
                        n3 -= 4070;
                        n3 -= 47785;
                        n3 ^= 0xB16A;
                        n3 -= 50798;
                        n3 -= 3471;
                        n3 ^= 0x2ACF;
                        n3 ^= 0x3851;
                        n3 += 30995;
                        cArray[i3] = (char)(n3 -= 65428);
                    }
                    object5 = kotakbaz.rain.module.modules.render.R.A()[2] = new String(cArray);
                }
                q = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.module.modules.render.R.A()[3];
            if (object6 == null) {
                char[] cArray = "\ua75f\ua773\ua60d\ua759\ua77d\ua77c\ua77d\ua759\ua776\ua775\ua77d\ua60d\ua763\ua776\ua5ff\ua61a\ua61a\ua617\ua618\ua601".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 += 31618;
                    n4 ^= 0xB13;
                    n4 -= 51268;
                    n4 ^= 0x8426;
                    n4 ^= 0xAE29;
                    n4 ^= 0x21AA;
                    n4 -= 24891;
                    n4 ^= 0x7B7C;
                    n4 -= 61900;
                    n4 -= 31245;
                    cArray[i4] = (char)(n4 += 63598);
                }
                object6 = kotakbaz.rain.module.modules.render.R.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)q), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = r;
        if (r == null) {
            r = new Object[4];
            objectArray = r;
        }
        return objectArray;
    }

    public static void b() {
        R = new int[0x1715 ^ 0x1685];
        kotakbaz.rain.module.modules.render.R.R[0x3AEF ^ 0x3B88] = 0x3BE1 ^ 0x3B88;
        kotakbaz.rain.module.modules.render.R.R[0xDFBF ^ 0xDF70] = 0xDF62 ^ 0xDF70;
        kotakbaz.rain.module.modules.render.R.R[0x6860 ^ 0x6838] = 0x6841 ^ 0x6838;
        kotakbaz.rain.module.modules.render.R.R[0x6301 ^ 0x63E7] = 0x6348 ^ 0x63E7;
        kotakbaz.rain.module.modules.render.R.R[0xF671 ^ 0xF749] = 0xFFFF08B1 ^ 0xF749;
        kotakbaz.rain.module.modules.render.R.R[0xD910 ^ 0xD931] = 0xD97C ^ 0xD931;
        kotakbaz.rain.module.modules.render.R.R[0x106E5 ^ 0x106B0] = 0x106FC ^ 0x106B0;
        kotakbaz.rain.module.modules.render.R.R[0x1E4 ^ 0x19C] = 0x9A ^ 0x19C;
        kotakbaz.rain.module.modules.render.R.R[0x3F00 ^ 0x3FE9] = 0x3FD2 ^ 0x3FE9;
        kotakbaz.rain.module.modules.render.R.R[0x3C4A ^ 0x3C11] = 0xFFFFC3CA ^ 0x3C11;
        kotakbaz.rain.module.modules.render.R.R[0xB483 ^ 0xB5BA] = 0xB5F9 ^ 0xB5BA;
        kotakbaz.rain.module.modules.render.R.R[0x5B48 ^ 0x5B88] = 0x5BF2 ^ 0x5B88;
        kotakbaz.rain.module.modules.render.R.R[0xC966 ^ 0xC823] = 0xFFFF37D0 ^ 0xC823;
        kotakbaz.rain.module.modules.render.R.R[0x5E1B ^ 0x5F47] = 0x5F85 ^ 0x5F47;
        kotakbaz.rain.module.modules.render.R.R[0xD60A ^ 0xD6AC] = 0xD6C7 ^ 0xD6AC;
        kotakbaz.rain.module.modules.render.R.R[0x8970 ^ 0x886A] = 0x87B4 ^ 0x886A;
        kotakbaz.rain.module.modules.render.R.R[0x10707 ^ 0x107FC] = 0x107CF ^ 0x107FC;
        kotakbaz.rain.module.modules.render.R.R[0x7D0 ^ 0x749] = 0x7FB ^ 0x749;
        kotakbaz.rain.module.modules.render.R.R[0xA423 ^ 0xA4CD] = 0xFFFF5B08 ^ 0xA4CD;
        kotakbaz.rain.module.modules.render.R.R[0xE21B ^ 0xE2D6] = 0xE2BB ^ 0xE2D6;
        kotakbaz.rain.module.modules.render.R.R[0xD266 ^ 0xD257] = 0xD202 ^ 0xD257;
        kotakbaz.rain.module.modules.render.R.R[0x6D3A ^ 0x6D18] = 0xFFFF92B7 ^ 0x6D18;
        kotakbaz.rain.module.modules.render.R.R[0x17CF ^ 0x172C] = 0xFFFFE8FF ^ 0x172C;
        kotakbaz.rain.module.modules.render.R.R[0x4CCA ^ 0x4CDF] = 0xFFFFB39F ^ 0x4CDF;
        kotakbaz.rain.module.modules.render.R.R[0x10B9A ^ 0x10B69] = 0xFFFEF4BE ^ 0x10B69;
        kotakbaz.rain.module.modules.render.R.R[0xFF71 ^ 0xFE0E] = 0xFE33 ^ 0xFE0E;
        kotakbaz.rain.module.modules.render.R.R[0x3A31 ^ 0x3A48] = 0xFFFFC591 ^ 0x3A48;
        kotakbaz.rain.module.modules.render.R.R[0x77F ^ 0x640] = 0x631 ^ 0x640;
        kotakbaz.rain.module.modules.render.R.R[0xFDA8 ^ 0xFDB3] = 0xFD85 ^ 0xFDB3;
        kotakbaz.rain.module.modules.render.R.R[0xA0AE ^ 0xA0E9] = 0xFFFF5F0B ^ 0xA0E9;
        kotakbaz.rain.module.modules.render.R.R[0x449D ^ 0x4438] = 0x4412 ^ 0x4438;
        kotakbaz.rain.module.modules.render.R.R[9 ^ 0x1E] = 0xFFFFFF9C ^ 0x1E;
        kotakbaz.rain.module.modules.render.R.R[0xD9C6 ^ 0xD9A2] = 0xD9F7 ^ 0xD9A2;
        kotakbaz.rain.module.modules.render.R.R[0x74E3 ^ 0x7431] = 0xFFFF8BC6 ^ 0x7431;
        kotakbaz.rain.module.modules.render.R.R[0x3709 ^ 0x367F] = 0x3663 ^ 0x367F;
        kotakbaz.rain.module.modules.render.R.R[0x108AC ^ 0x1098F] = 0xFFFEF614 ^ 0x1098F;
        kotakbaz.rain.module.modules.render.R.R[0xC2FB ^ 0xC2ED] = 0xFFFF3D33 ^ 0xC2ED;
        kotakbaz.rain.module.modules.render.R.R[0x803D ^ 0x8010] = 0x82CF ^ 0x8010;
        kotakbaz.rain.module.modules.render.R.R[0xF9A5 ^ 0xF8B5] = 0xE2F5 ^ 0xF8B5;
        kotakbaz.rain.module.modules.render.R.R[0xF90D ^ 0xF926] = 0xF955 ^ 0xF926;
        kotakbaz.rain.module.modules.render.R.R[0xE5E ^ 0xED7] = 0xFFFFF126 ^ 0xED7;
        kotakbaz.rain.module.modules.render.R.R[0x6FA0 ^ 0x6F0F] = 0xFFFF90C3 ^ 0x6F0F;
        kotakbaz.rain.module.modules.render.R.R[0xAE82 ^ 0xAFD7] = 0xFFFF5054 ^ 0xAFD7;
        kotakbaz.rain.module.modules.render.R.R[0xD703 ^ 0xD68E] = 0xD6E8 ^ 0xD68E;
        kotakbaz.rain.module.modules.render.R.R[0xE1A5 ^ 0xE1CB] = 0xFFFF1E5B ^ 0xE1CB;
        kotakbaz.rain.module.modules.render.R.R[0xD5BE ^ 0xD581] = 0xC50F ^ 0xD581;
        kotakbaz.rain.module.modules.render.R.R[0x3BD ^ 0x2FE] = 0x2BF ^ 0x2FE;
        kotakbaz.rain.module.modules.render.R.R[0x47BE ^ 0x4736] = 0x4726 ^ 0x4736;
        kotakbaz.rain.module.modules.render.R.R[0x7493 ^ 0x7448] = 0x7448 ^ 0x7448;
        kotakbaz.rain.module.modules.render.R.R[0xB8CD ^ 0xB80C] = 0xB827 ^ 0xB80C;
        kotakbaz.rain.module.modules.render.R.R[0xBB93 ^ 0xBA81] = 0x2F62 ^ 0xBA81;
        kotakbaz.rain.module.modules.render.R.R[0xDCA ^ 0xD28] = 0xFFFFF2BC ^ 0xD28;
        kotakbaz.rain.module.modules.render.R.R[0xDB0C ^ 0xDB26] = 0xDB1E ^ 0xDB26;
        kotakbaz.rain.module.modules.render.R.R[0xE663 ^ 0xE61D] = 0xFFFF19A5 ^ 0xE61D;
        kotakbaz.rain.module.modules.render.R.R[0x2730 ^ 0x273E] = 0xFFFFD8CB ^ 0x273E;
        kotakbaz.rain.module.modules.render.R.R[0x19DE ^ 0x19EE] = 0x19A3 ^ 0x19EE;
        kotakbaz.rain.module.modules.render.R.R[0x1F4F ^ 0x1F6C] = 0xFFFFE086 ^ 0x1F6C;
        kotakbaz.rain.module.modules.render.R.R[0x8DC3 ^ 0x8C9B] = 0x8CBD ^ 0x8C9B;
        kotakbaz.rain.module.modules.render.R.R[0xDD93 ^ 0xDD43] = 0xDD30 ^ 0xDD43;
        kotakbaz.rain.module.modules.render.R.R[0x72A6 ^ 0x7252] = 0xFFFF8DC0 ^ 0x7252;
        kotakbaz.rain.module.modules.render.R.R[0x537B ^ 0x53A6] = 0x539A ^ 0x53A6;
        kotakbaz.rain.module.modules.render.R.R[0xEF22 ^ 0xEE75] = 0xFFFF118A ^ 0xEE75;
        kotakbaz.rain.module.modules.render.R.R[0xAC92 ^ 0xADFB] = 0xADAC ^ 0xADFB;
        kotakbaz.rain.module.modules.render.R.R[0x9B74 ^ 0x9BEE] = 0x9BB7 ^ 0x9BEE;
        kotakbaz.rain.module.modules.render.R.R[0xF53B ^ 0xF4BB] = 0xFFFF0B54 ^ 0xF4BB;
        kotakbaz.rain.module.modules.render.R.R[0xC7A ^ 0xC62] = 0xFFFFF393 ^ 0xC62;
        kotakbaz.rain.module.modules.render.R.R[0x1158 ^ 0x112F] = 0xFFFFEEC6 ^ 0x112F;
        kotakbaz.rain.module.modules.render.R.R[0xEC3D ^ 0xEC76] = 0xEC58 ^ 0xEC76;
        kotakbaz.rain.module.modules.render.R.R[0x64F2 ^ 0x65D3] = 0xFFFF9A5C ^ 0x65D3;
        kotakbaz.rain.module.modules.render.R.R[0x2F9B ^ 0x2F05] = 0xFFFFD0C2 ^ 0x2F05;
        kotakbaz.rain.module.modules.render.R.R[0x15D9 ^ 0x1450] = 0x14C9 ^ 0x1450;
        kotakbaz.rain.module.modules.render.R.R[0x179D ^ 0x16B3] = 0x16DC ^ 0x16B3;
        kotakbaz.rain.module.modules.render.R.R[0x94BC ^ 0x94BB] = 0xFFFF6B41 ^ 0x94BB;
        kotakbaz.rain.module.modules.render.R.R[0xA177 ^ 0xA012] = 0xA051 ^ 0xA012;
        kotakbaz.rain.module.modules.render.R.R[0xB60A ^ 0xB768] = 0xB637 ^ 0xB768;
        kotakbaz.rain.module.modules.render.R.R[0x247D ^ 0x2415] = 0x2459 ^ 0x2415;
        kotakbaz.rain.module.modules.render.R.R[0x582D ^ 0x587E] = 0x5859 ^ 0x587E;
        kotakbaz.rain.module.modules.render.R.R[0xFB6A ^ 0xFBF8] = 0xFFFF0459 ^ 0xFBF8;
        kotakbaz.rain.module.modules.render.R.R[0x6FBE ^ 0x6FB4] = 0xFFFF9016 ^ 0x6FB4;
        kotakbaz.rain.module.modules.render.R.R[0x6052 ^ 0x6081] = 0x608B ^ 0x6081;
        kotakbaz.rain.module.modules.render.R.R[0xBC5 ^ 0xB7C] = 0xFFFFF48A ^ 0xB7C;
        kotakbaz.rain.module.modules.render.R.R[0x41C4 ^ 0x41FA] = 0x41E3 ^ 0x41FA;
        kotakbaz.rain.module.modules.render.R.R[0xEF02 ^ 0xEFCC] = 0xFFFF1057 ^ 0xEFCC;
        kotakbaz.rain.module.modules.render.R.R[0x10606 ^ 0x10690] = 0xFFFEF964 ^ 0x10690;
        kotakbaz.rain.module.modules.render.R.R[0x4507 ^ 0x457D] = 0xFFFFBACA ^ 0x457D;
        kotakbaz.rain.module.modules.render.R.R[0x3509 ^ 0x3587] = 0x35D2 ^ 0x3587;
        kotakbaz.rain.module.modules.render.R.R[0xA291 ^ 0xA288] = 0xFFFF5D37 ^ 0xA288;
        kotakbaz.rain.module.modules.render.R.R[0xB43A ^ 0xB44E] = 0xB442 ^ 0xB44E;
        kotakbaz.rain.module.modules.render.R.R[0x53B1 ^ 0x534B] = 0x5322 ^ 0x534B;
        kotakbaz.rain.module.modules.render.R.R[0xA5C4 ^ 0xA4FF] = 0xFFFF5B1C ^ 0xA4FF;
        kotakbaz.rain.module.modules.render.R.R[0xF1E9 ^ 0xF0DA] = 0xF0B6 ^ 0xF0DA;
        kotakbaz.rain.module.modules.render.R.R[0xA74D ^ 0xA704] = 0xFFFF58C2 ^ 0xA704;
        kotakbaz.rain.module.modules.render.R.R[0x184D ^ 0x1899] = 0xFFFFE753 ^ 0x1899;
        kotakbaz.rain.module.modules.render.R.R[0x642D ^ 0x6565] = 0xFFFF9AED ^ 0x6565;
        kotakbaz.rain.module.modules.render.R.R[0x10805 ^ 0x10951] = 0xFFFEF69E ^ 0x10951;
        kotakbaz.rain.module.modules.render.R.R[0xE2EC ^ 0xE250] = 0xE254 ^ 0xE250;
        kotakbaz.rain.module.modules.render.R.R[0xCAE3 ^ 0xCBCA] = 0xFFFF3447 ^ 0xCBCA;
        kotakbaz.rain.module.modules.render.R.R[0x47FA ^ 0x4733] = 0x4747 ^ 0x4733;
        kotakbaz.rain.module.modules.render.R.R[0x21AF ^ 0x215E] = 0xFFFFDEE7 ^ 0x215E;
        kotakbaz.rain.module.modules.render.R.R[0x1C47 ^ 0x1CBF] = 0xFFFFE34A ^ 0x1CBF;
        kotakbaz.rain.module.modules.render.R.R[0x1A1B ^ 0x1B04] = 0x1B1B ^ 0x1B04;
        kotakbaz.rain.module.modules.render.R.R[0x9C29 ^ 0x9CDC] = 0xFFFF6360 ^ 0x9CDC;
        kotakbaz.rain.module.modules.render.R.R[0x43B3 ^ 0x4304] = 0xFFFFBC8A ^ 0x4304;
        kotakbaz.rain.module.modules.render.R.R[0xFEBE ^ 0xFE86] = 0xFFFF017C ^ 0xFE86;
        kotakbaz.rain.module.modules.render.R.R[0x7D80 ^ 0x7D1F] = 0xFFFF82E4 ^ 0x7D1F;
        kotakbaz.rain.module.modules.render.R.R[0x8F53 ^ 0x8ED9] = 0x8EB9 ^ 0x8ED9;
        kotakbaz.rain.module.modules.render.R.R[0xE403 ^ 0xE4CB] = 0xFFFF1B05 ^ 0xE4CB;
        kotakbaz.rain.module.modules.render.R.R[0x9E43 ^ 0x9E5C] = 0x9E29 ^ 0x9E5C;
        kotakbaz.rain.module.modules.render.R.R[0x9830 ^ 0x9914] = 0x9903 ^ 0x9914;
        kotakbaz.rain.module.modules.render.R.R[0xA8B0 ^ 0xA821] = 0xFFFF57BC ^ 0xA821;
        kotakbaz.rain.module.modules.render.R.R[0x10884 ^ 0x1088F] = 0x108C1 ^ 0x1088F;
        kotakbaz.rain.module.modules.render.R.R[0x25F0 ^ 0x24AB] = 0xFFFFDB40 ^ 0x24AB;
        kotakbaz.rain.module.modules.render.R.R[0x3782 ^ 0x36F8] = 0xFFFFC972 ^ 0x36F8;
        kotakbaz.rain.module.modules.render.R.R[0x6A50 ^ 0x6A93] = 0xFFFF957C ^ 0x6A93;
        kotakbaz.rain.module.modules.render.R.R[0x4D17 ^ 0x4C38] = 0x4C7C ^ 0x4C38;
        kotakbaz.rain.module.modules.render.R.R[0x3390 ^ 0x3213] = 0x323D ^ 0x3213;
        kotakbaz.rain.module.modules.render.R.R[0x243E ^ 0x2503] = 0x256C ^ 0x2503;
        kotakbaz.rain.module.modules.render.R.R[0xF867 ^ 0xF840] = 0x4F826 ^ 0xF840;
        kotakbaz.rain.module.modules.render.R.R[0x3E08 ^ 0x3ECC] = 0xFFFFC17E ^ 0x3ECC;
        kotakbaz.rain.module.modules.render.R.R[0xEE51 ^ 0xEE50] = 0xEE10 ^ 0xEE50;
        kotakbaz.rain.module.modules.render.R.R[0xE461 ^ 0xE433] = 0xE433 ^ 0xE433;
        kotakbaz.rain.module.modules.render.R.R[0xEA82 ^ 0xEBA8] = 0xEBCD ^ 0xEBA8;
        kotakbaz.rain.module.modules.render.R.R[0x3412 ^ 0x3507] = 0x2E6A ^ 0x3507;
        kotakbaz.rain.module.modules.render.R.R[0x887F ^ 0x88D8] = 0x884C ^ 0x88D8;
        kotakbaz.rain.module.modules.render.R.R[0x3B17 ^ 0x3B74] = 0xFFFFC404 ^ 0x3B74;
        kotakbaz.rain.module.modules.render.R.R[0x7D78 ^ 0x7D09] = 0x7D25 ^ 0x7D09;
        kotakbaz.rain.module.modules.render.R.R[0x9B83 ^ 0x9AA6] = 0xFFFF6502 ^ 0x9AA6;
        kotakbaz.rain.module.modules.render.R.R[0xB10D ^ 0xB17E] = 0xB12F ^ 0xB17E;
        kotakbaz.rain.module.modules.render.R.R[0x46F1 ^ 0x47D3] = 0x4786 ^ 0x47D3;
        kotakbaz.rain.module.modules.render.R.R[0xAAA ^ 0xBFB] = 0xB99 ^ 0xBFB;
        kotakbaz.rain.module.modules.render.R.R[0x2CE1 ^ 0x2CD5] = 0x2CDE ^ 0x2CD5;
        kotakbaz.rain.module.modules.render.R.R[0x8785 ^ 0x877B] = 0x8702 ^ 0x877B;
        kotakbaz.rain.module.modules.render.R.R[0xBCCF ^ 0xBC85] = 0xFFFF4321 ^ 0xBC85;
        kotakbaz.rain.module.modules.render.R.R[0x953F ^ 0x9504] = 0xFFFF6AEE ^ 0x9504;
        kotakbaz.rain.module.modules.render.R.R[0x96FD ^ 0x9646] = 0x967A ^ 0x9646;
        kotakbaz.rain.module.modules.render.R.R[0x72FA ^ 0x7291] = 0x72EA ^ 0x7291;
        kotakbaz.rain.module.modules.render.R.R[0xE143 ^ 0xE1A4] = 0xFFFF1E0F ^ 0xE1A4;
        kotakbaz.rain.module.modules.render.R.R[0x480 ^ 0x504] = 0xFFFFFADD ^ 0x504;
        kotakbaz.rain.module.modules.render.R.R[0xAE7A ^ 0xAF06] = 0xAF7A ^ 0xAF06;
        kotakbaz.rain.module.modules.render.R.R[0x25BB ^ 0x25F3] = 0xFFFFDA68 ^ 0x25F3;
        kotakbaz.rain.module.modules.render.R.R[0x862C ^ 0x8673] = 0x861E ^ 0x8673;
        kotakbaz.rain.module.modules.render.R.R[0xB04E ^ 0xB0D5] = 0xB088 ^ 0xB0D5;
        kotakbaz.rain.module.modules.render.R.R[0x80C5 ^ 0x81BB] = 0x8182 ^ 0x81BB;
        kotakbaz.rain.module.modules.render.R.R[0x10623 ^ 0x106C2] = 0xFFFEF95F ^ 0x106C2;
        kotakbaz.rain.module.modules.render.R.R[0xC2C3 ^ 0xC395] = 0xC3B1 ^ 0xC395;
        kotakbaz.rain.module.modules.render.R.R[0x193B ^ 0x1989] = 0x19C7 ^ 0x1989;
        kotakbaz.rain.module.modules.render.R.R[0x10CF8 ^ 0x10DA5] = 0x10DFD ^ 0x10DA5;
        kotakbaz.rain.module.modules.render.R.R[0x91F3 ^ 0x9095] = 0xFFFF6F38 ^ 0x9095;
        kotakbaz.rain.module.modules.render.R.R[0x75D4 ^ 0x7492] = 0x74EF ^ 0x7492;
        kotakbaz.rain.module.modules.render.R.R[0xF293 ^ 0xF218] = 0xFFFF0DC3 ^ 0xF218;
        kotakbaz.rain.module.modules.render.R.R[0x1690 ^ 0x1715] = 0xFFFFE8E2 ^ 0x1715;
        kotakbaz.rain.module.modules.render.R.R[0xE7B9 ^ 0xE79F] = 0xE7D2 ^ 0xE79F;
        kotakbaz.rain.module.modules.render.R.R[0x91D ^ 0x903] = 0xFFFFF683 ^ 0x903;
        kotakbaz.rain.module.modules.render.R.R[0xBDB0 ^ 0xBCCD] = 0xBCCB ^ 0xBCCD;
        kotakbaz.rain.module.modules.render.R.R[0xD40D ^ 0xD40E] = 0xD407 ^ 0xD40E;
        kotakbaz.rain.module.modules.render.R.R[0xC4B5 ^ 0xC4F7] = 0xCFFC ^ 0xC4F7;
        kotakbaz.rain.module.modules.render.R.R[0x1DA1 ^ 0x1CF1] = 0x1C47 ^ 0x1CF1;
        kotakbaz.rain.module.modules.render.R.R[0x4957 ^ 0x4922] = 0xFFFFB6F8 ^ 0x4922;
        kotakbaz.rain.module.modules.render.R.R[0x817F ^ 0x8150] = 0xFFFF7EAC ^ 0x8150;
        kotakbaz.rain.module.modules.render.R.R[0xDFBC ^ 0xDEA4] = 0x8F98 ^ 0xDEA4;
        kotakbaz.rain.module.modules.render.R.R[0x18F3 ^ 0x1992] = 0xFFFFE607 ^ 0x1992;
        kotakbaz.rain.module.modules.render.R.R[0x108FE ^ 0x10846] = 0xFFFEF781 ^ 0x10846;
        kotakbaz.rain.module.modules.render.R.R[0xB8B3 ^ 0xB8E7] = 0xB8AA ^ 0xB8E7;
        kotakbaz.rain.module.modules.render.R.R[0xB951 ^ 0xB975] = 0xB953 ^ 0xB975;
        kotakbaz.rain.module.modules.render.R.R[0x7074 ^ 0x717D] = 0x717C ^ 0x717D;
        kotakbaz.rain.module.modules.render.R.R[0xD73F ^ 0xD781] = 0xD785 ^ 0xD781;
        kotakbaz.rain.module.modules.render.R.R[0x6A65 ^ 0x6ABB] = 0x6AE9 ^ 0x6ABB;
        kotakbaz.rain.module.modules.render.R.R[0xAF57 ^ 0xAE1B] = 0xAE38 ^ 0xAE1B;
        kotakbaz.rain.module.modules.render.R.R[0xFB44 ^ 0xFBD1] = 0xFFFF0431 ^ 0xFBD1;
        kotakbaz.rain.module.modules.render.R.R[0xED87 ^ 0xED4D] = 0xED2B ^ 0xED4D;
        kotakbaz.rain.module.modules.render.R.R[0xA440 ^ 0xA49F] = 0xFFFF5B55 ^ 0xA49F;
        kotakbaz.rain.module.modules.render.R.R[0xD7BD ^ 0xD7D2] = 0xFFFF283A ^ 0xD7D2;
        kotakbaz.rain.module.modules.render.R.R[0xAC43 ^ 0xACC4] = 0xACC5 ^ 0xACC4;
        kotakbaz.rain.module.modules.render.R.R[0xC467 ^ 0xC46F] = 0xFFFF3BF6 ^ 0xC46F;
        kotakbaz.rain.module.modules.render.R.R[0x63E9 ^ 0x6380] = 0x62E0 ^ 0x6380;
        kotakbaz.rain.module.modules.render.R.R[0xCC7E ^ 0xCD7F] = 0xCDCE ^ 0xCD7F;
        kotakbaz.rain.module.modules.render.R.R[0xC046 ^ 0xC039] = 0xC030 ^ 0xC039;
        kotakbaz.rain.module.modules.render.R.R[0x150B ^ 0x1556] = 0x1522 ^ 0x1556;
        kotakbaz.rain.module.modules.render.R.R[0xBE64 ^ 0xBEDB] = 0xFFFF414A ^ 0xBEDB;
        kotakbaz.rain.module.modules.render.R.R[0x22EB ^ 0x22BC] = 0x22EF ^ 0x22BC;
        kotakbaz.rain.module.modules.render.R.R[0xB55 ^ 0xB25] = 0xB01 ^ 0xB25;
        kotakbaz.rain.module.modules.render.R.R[0x9FCF ^ 0x9F0A] = 0x9F59 ^ 0x9F0A;
        kotakbaz.rain.module.modules.render.R.R[0x5D24 ^ 0x5DAE] = 0xFFFFA256 ^ 0x5DAE;
        kotakbaz.rain.module.modules.render.R.R[0xD4A5 ^ 0xD49C] = 0xFFFF2026 ^ 0xD49C;
        kotakbaz.rain.module.modules.render.R.R[0x58A3 ^ 0x5820] = 0x587F ^ 0x5820;
        kotakbaz.rain.module.modules.render.R.R[0xA675 ^ 0xA7F3] = 0xA7FD ^ 0xA7F3;
        kotakbaz.rain.module.modules.render.R.R[0xD8A4 ^ 0xD995] = 0xD98F ^ 0xD995;
        kotakbaz.rain.module.modules.render.R.R[0xBCED ^ 0xBCCD] = 0xBCE6 ^ 0xBCCD;
        kotakbaz.rain.module.modules.render.R.R[0xFAEB ^ 0xFAEB] = 0xFFFF052D ^ 0xFAEB;
        kotakbaz.rain.module.modules.render.R.R[0x34F1 ^ 0x34FC] = 0xFFFFCB76 ^ 0x34FC;
        kotakbaz.rain.module.modules.render.R.R[0xAC60 ^ 0xAD67] = 0xAD64 ^ 0xAD67;
        kotakbaz.rain.module.modules.render.R.R[0xD2AC ^ 0xD3C2] = 0xFFFF2CA7 ^ 0xD3C2;
        kotakbaz.rain.module.modules.render.R.R[0x10F7A ^ 0x10F06] = 0x10F46 ^ 0x10F06;
        kotakbaz.rain.module.modules.render.R.R[0x7633 ^ 0x76CE] = 0xFFFF893A ^ 0x76CE;
        kotakbaz.rain.module.modules.render.R.R[0x3344 ^ 0x33A9] = 0xFFFFCC7F ^ 0x33A9;
        kotakbaz.rain.module.modules.render.R.R[0x4B56 ^ 0x4BFC] = 0xFFFFB400 ^ 0x4BFC;
        kotakbaz.rain.module.modules.render.R.R[6 ^ 0xC1] = 0xEE ^ 0xC1;
        kotakbaz.rain.module.modules.render.R.R[0x480C ^ 0x4822] = 0x4803 ^ 0x4822;
        kotakbaz.rain.module.modules.render.R.R[0xF87A ^ 0xF8D3] = 0xF8FB ^ 0xF8D3;
        kotakbaz.rain.module.modules.render.R.R[0x4985 ^ 0x4894] = 0x7B37 ^ 0x4894;
        kotakbaz.rain.module.modules.render.R.R[0x51C1 ^ 0x51F4] = 0x519B ^ 0x51F4;
        kotakbaz.rain.module.modules.render.R.R[0x3DDD ^ 0x3CDE] = 0x3CB3 ^ 0x3CDE;
        kotakbaz.rain.module.modules.render.R.R[0x383F ^ 0x39B3] = 0x39CE ^ 0x39B3;
        kotakbaz.rain.module.modules.render.R.R[0xAB76 ^ 0xAB92] = 0xFFFF5419 ^ 0xAB92;
        kotakbaz.rain.module.modules.render.R.R[0xDFAD ^ 0xDE23] = 0xFFFF21CA ^ 0xDE23;
        kotakbaz.rain.module.modules.render.R.R[0xA425 ^ 0xA4DC] = 0xFFFF5B40 ^ 0xA4DC;
        kotakbaz.rain.module.modules.render.R.R[0xF8B4 ^ 0xF9EB] = 0xF9F5 ^ 0xF9EB;
        kotakbaz.rain.module.modules.render.R.R[0xF7A3 ^ 0xF707] = 0xF7AC ^ 0xF707;
        kotakbaz.rain.module.modules.render.R.R[0x3AD2 ^ 0x3B5A] = 0x3B63 ^ 0x3B5A;
        kotakbaz.rain.module.modules.render.R.R[0xF66C ^ 0xF75E] = 0xFFFF08F3 ^ 0xF75E;
        kotakbaz.rain.module.modules.render.R.R[0xDD45 ^ 0xDD94] = 0xDD99 ^ 0xDD94;
        kotakbaz.rain.module.modules.render.R.R[0x1012D ^ 0x1005F] = 0xFFFEFF91 ^ 0x1005F;
        kotakbaz.rain.module.modules.render.R.R[0x1AC ^ 0x1A3] = 0x1C7 ^ 0x1A3;
        kotakbaz.rain.module.modules.render.R.R[0xCC2B ^ 0xCD79] = 0xCD4D ^ 0xCD79;
        kotakbaz.rain.module.modules.render.R.R[0x19F1 ^ 0x1906] = 0x195A ^ 0x1906;
        kotakbaz.rain.module.modules.render.R.R[0x90E ^ 0x819] = 0x1E4E ^ 0x819;
        kotakbaz.rain.module.modules.render.R.R[0x3A60 ^ 0x3A8B] = 0x3AD7 ^ 0x3A8B;
        kotakbaz.rain.module.modules.render.R.R[0xD472 ^ 0xD561] = 0xF108 ^ 0xD561;
        kotakbaz.rain.module.modules.render.R.R[0x25E4 ^ 0x2592] = 0x2583 ^ 0x2592;
        kotakbaz.rain.module.modules.render.R.R[0xDE74 ^ 0xDE34] = 0xDE56 ^ 0xDE34;
        kotakbaz.rain.module.modules.render.R.R[0x1022 ^ 0x1124] = 0xFFFFEEFD ^ 0x1124;
        kotakbaz.rain.module.modules.render.R.R[0x7D85 ^ 0x7D81] = 0x7DAF ^ 0x7D81;
        kotakbaz.rain.module.modules.render.R.R[0x8D30 ^ 0x8C29] = 0xF634 ^ 0x8C29;
        kotakbaz.rain.module.modules.render.R.R[0xEEB ^ 0xE31] = 0xFFFFF1CA ^ 0xE31;
        kotakbaz.rain.module.modules.render.R.R[0x52D8 ^ 0x52CC] = 0xFFFFAD3C ^ 0x52CC;
        kotakbaz.rain.module.modules.render.R.R[0xB652 ^ 0xB7D0] = 0xB7A5 ^ 0xB7D0;
        kotakbaz.rain.module.modules.render.R.R[0xD779 ^ 0xD729] = 0xD71B ^ 0xD729;
        kotakbaz.rain.module.modules.render.R.R[0xD0ED ^ 0xD02F] = 0xD072 ^ 0xD02F;
        kotakbaz.rain.module.modules.render.R.R[0xEFF4 ^ 0xEE98] = 0xEEB1 ^ 0xEE98;
        kotakbaz.rain.module.modules.render.R.R[0x42EA ^ 0x43DE] = 0xFFFFBC3F ^ 0x43DE;
        kotakbaz.rain.module.modules.render.R.R[0x6C5F ^ 0x6C99] = 0x6CFB ^ 0x6C99;
        kotakbaz.rain.module.modules.render.R.R[0xFA8C ^ 0xFAC9] = 0xFFFF0E46 ^ 0xFAC9;
        kotakbaz.rain.module.modules.render.R.R[0xB59A ^ 0xB54F] = 0xFFFF4AA9 ^ 0xB54F;
        kotakbaz.rain.module.modules.render.R.R[0xBFB9 ^ 0xBFE5] = 0xBFD2 ^ 0xBFE5;
        kotakbaz.rain.module.modules.render.R.R[0xD454 ^ 0xD4D6] = 0xD4A8 ^ 0xD4D6;
        kotakbaz.rain.module.modules.render.R.R[0xCB52 ^ 0xCA5A] = 0xCA5A ^ 0xCA5A;
        kotakbaz.rain.module.modules.render.R.R[0xA98B ^ 0xA92B] = 0xA916 ^ 0xA92B;
        kotakbaz.rain.module.modules.render.R.R[0x939 ^ 0x8BE] = 0x88D ^ 0x8BE;
        kotakbaz.rain.module.modules.render.R.R[0x783 ^ 0x6A5] = 0x61E ^ 0x6A5;
        kotakbaz.rain.module.modules.render.R.R[0x2FA3 ^ 0x2F33] = 0xFFFFD02D ^ 0x2F33;
        kotakbaz.rain.module.modules.render.R.R[0x7C73 ^ 0x7C9B] = 0xFFFF835D ^ 0x7C9B;
        kotakbaz.rain.module.modules.render.R.R[0x7748 ^ 0x7654] = 0x7654 ^ 0x7654;
        kotakbaz.rain.module.modules.render.R.R[0x102AD ^ 0x10248] = 0x10200 ^ 0x10248;
        kotakbaz.rain.module.modules.render.R.R[0xB7A2 ^ 0xB70E] = 0xFFFF489F ^ 0xB70E;
        kotakbaz.rain.module.modules.render.R.R[0xD357 ^ 0xD37B] = 0xD310 ^ 0xD37B;
        kotakbaz.rain.module.modules.render.R.R[0x4B7D ^ 0x4A3F] = 0x4A3F ^ 0x4A3F;
        kotakbaz.rain.module.modules.render.R.R[0xB854 ^ 0xB8DB] = 0xB881 ^ 0xB8DB;
        kotakbaz.rain.module.modules.render.R.R[0x374F ^ 0x363A] = 0x3679 ^ 0x363A;
        kotakbaz.rain.module.modules.render.R.R[0x1A24 ^ 0x1B60] = 0x1B0A ^ 0x1B60;
        kotakbaz.rain.module.modules.render.R.R[0xBE90 ^ 0xBFD7] = 0xFFFF405E ^ 0xBFD7;
        kotakbaz.rain.module.modules.render.R.R[0x8DCA ^ 0x8CA0] = 0x8CF8 ^ 0x8CA0;
        kotakbaz.rain.module.modules.render.R.R[0x28B9 ^ 0x29F2] = 0xFFFFD66D ^ 0x29F2;
        kotakbaz.rain.module.modules.render.R.R[0x9D6C ^ 0x9D56] = 0x9D46 ^ 0x9D56;
        kotakbaz.rain.module.modules.render.R.R[0x7348 ^ 0x73BE] = 0x73A7 ^ 0x73BE;
        kotakbaz.rain.module.modules.render.R.R[0xA7B3 ^ 0xA6BE] = 0xA6BE ^ 0xA6BE;
        kotakbaz.rain.module.modules.render.R.R[0xFD05 ^ 0xFDD9] = 0xFDFC ^ 0xFDD9;
        kotakbaz.rain.module.modules.render.R.R[0xD09A ^ 0xD09C] = 0xFFFF2F10 ^ 0xD09C;
        kotakbaz.rain.module.modules.render.R.R[0x21A0 ^ 0x214F] = 0x2170 ^ 0x214F;
        kotakbaz.rain.module.modules.render.R.R[0xC5BE ^ 0xC597] = 0xFFFF3A56 ^ 0xC597;
        kotakbaz.rain.module.modules.render.R.R[0xD97E ^ 0xD806] = 0xFFFF27F0 ^ 0xD806;
        kotakbaz.rain.module.modules.render.R.R[0x6AF5 ^ 0x6AF0] = 0xFFFF9510 ^ 0x6AF0;
        kotakbaz.rain.module.modules.render.R.R[0xD8A9 ^ 0xD855] = 0xD873 ^ 0xD855;
        kotakbaz.rain.module.modules.render.R.R[0x88D9 ^ 0x89B2] = 0xFFFF7650 ^ 0x89B2;
        kotakbaz.rain.module.modules.render.R.R[0xC11D ^ 0xC17C] = 0xFFFF3E94 ^ 0xC17C;
        kotakbaz.rain.module.modules.render.R.R[0xCAB9 ^ 0xCBD1] = 0xCA7F ^ 0xCBD1;
        kotakbaz.rain.module.modules.render.R.R[0x869A ^ 0x868B] = 0x86B5 ^ 0x868B;
        kotakbaz.rain.module.modules.render.R.R[0x4AE ^ 0x4C3] = 0x4E2 ^ 0x4C3;
        kotakbaz.rain.module.modules.render.R.R[0xCAD0 ^ 0xCAEC] = 0xFFFF392A ^ 0xCAEC;
        kotakbaz.rain.module.modules.render.R.R[0xB4F ^ 0xA11] = 0xA4D ^ 0xA11;
        kotakbaz.rain.module.modules.render.R.R[0x187C ^ 0x181B] = 0xFFFFE7B2 ^ 0x181B;
        kotakbaz.rain.module.modules.render.R.R[0xF779 ^ 0xF675] = 0xF675 ^ 0xF675;
        kotakbaz.rain.module.modules.render.R.R[0x4162 ^ 0x4147] = 0x416F ^ 0x4147;
        kotakbaz.rain.module.modules.render.R.R[0x4E7A ^ 0x4ECB] = 0x4E86 ^ 0x4ECB;
        kotakbaz.rain.module.modules.render.R.R[0x525B ^ 0x532B] = 0xFFFFAC83 ^ 0x532B;
        kotakbaz.rain.module.modules.render.R.R[0x53B9 ^ 0x52A2] = 0x5D1C ^ 0x52A2;
        kotakbaz.rain.module.modules.render.R.R[0x4EBB ^ 0x4EF5] = 0xFFFFB14A ^ 0x4EF5;
        kotakbaz.rain.module.modules.render.R.R[0x9C73 ^ 0x9C0E] = 0x9C58 ^ 0x9C0E;
        kotakbaz.rain.module.modules.render.R.R[0x5CE1 ^ 0x5D95] = 0xFFFFA223 ^ 0x5D95;
        kotakbaz.rain.module.modules.render.R.R[0x3529 ^ 0x34A6] = 0x3494 ^ 0x34A6;
        kotakbaz.rain.module.modules.render.R.R[0x1045A ^ 0x1043F] = 0xFFFEFBDA ^ 0x1043F;
        kotakbaz.rain.module.modules.render.R.R[0x12A2 ^ 0x12B1] = 0xFFFFED58 ^ 0x12B1;
        kotakbaz.rain.module.modules.render.R.R[0x75F6 ^ 0x7496] = 0x74E0 ^ 0x7496;
        kotakbaz.rain.module.modules.render.R.R[0x443F ^ 0x4492] = 0x441A ^ 0x4492;
        kotakbaz.rain.module.modules.render.R.R[0xB464 ^ 0xB4F0] = 0xB4A4 ^ 0xB4F0;
        kotakbaz.rain.module.modules.render.R.R[0xE9F9 ^ 0xE8CE] = 0xFFFF170E ^ 0xE8CE;
        kotakbaz.rain.module.modules.render.R.R[0x3235 ^ 0x32CA] = 0x32C9 ^ 0x32CA;
        kotakbaz.rain.module.modules.render.R.R[0x1107 ^ 0x105E] = 0xFFFFEF26 ^ 0x105E;
        kotakbaz.rain.module.modules.render.R.R[0x6245 ^ 0x6214] = 0x6332 ^ 0x6214;
        kotakbaz.rain.module.modules.render.R.R[0x1041C ^ 0x1056F] = 0xFFFEFAB1 ^ 0x1056F;
        kotakbaz.rain.module.modules.render.R.R[0x8FA ^ 0x983] = 0x9F8 ^ 0x983;
        kotakbaz.rain.module.modules.render.R.R[0x3B71 ^ 0x3A47] = 0x3A79 ^ 0x3A47;
        kotakbaz.rain.module.modules.render.R.R[0xC950 ^ 0xC819] = 0xFFFF37F8 ^ 0xC819;
        kotakbaz.rain.module.modules.render.R.R[0xF1C2 ^ 0xF184] = 0xFFFF0E49 ^ 0xF184;
        kotakbaz.rain.module.modules.render.R.R[0x1170 ^ 0x11FC] = 0xFFFFEE18 ^ 0x11FC;
        kotakbaz.rain.module.modules.render.R.R[0xFFCB ^ 0xFE40] = 0xFE69 ^ 0xFE40;
        kotakbaz.rain.module.modules.render.R.R[0xBE28 ^ 0xBEC2] = 0xBE85 ^ 0xBEC2;
        kotakbaz.rain.module.modules.render.R.R[0xF8E9 ^ 0xF9A7] = 0xF9F2 ^ 0xF9A7;
        kotakbaz.rain.module.modules.render.R.R[0x7F26 ^ 0x7E69] = 0x7E4C ^ 0x7E69;
        kotakbaz.rain.module.modules.render.R.R[0x1AE7 ^ 0x1A7B] = 0xFFFFE5A3 ^ 0x1A7B;
        kotakbaz.rain.module.modules.render.R.R[0x10838 ^ 0x10943] = 0x10941 ^ 0x10943;
        kotakbaz.rain.module.modules.render.R.R[0xED26 ^ 0xED88] = 0xFFFF1226 ^ 0xED88;
        kotakbaz.rain.module.modules.render.R.R[0x10D7F ^ 0x10D3E] = 0x10D28 ^ 0x10D3E;
        kotakbaz.rain.module.modules.render.R.R[0x37AD ^ 0x3728] = 0x373D ^ 0x3728;
        kotakbaz.rain.module.modules.render.R.R[0xD6BF ^ 0xD798] = 0xD7FB ^ 0xD798;
        kotakbaz.rain.module.modules.render.R.R[0xAA27 ^ 0xAAB0] = 0xAAC1 ^ 0xAAB0;
        kotakbaz.rain.module.modules.render.R.R[0x1E56 ^ 0x1E8F] = 0x1EB6 ^ 0x1E8F;
        kotakbaz.rain.module.modules.render.R.R[0x5125 ^ 0x51F3] = 0x51FF ^ 0x51F3;
        kotakbaz.rain.module.modules.render.R.R[0xF598 ^ 0xF5AF] = 0xFFFF0A15 ^ 0xF5AF;
        kotakbaz.rain.module.modules.render.R.R[0xF909 ^ 0xF991] = 0xF9D4 ^ 0xF991;
        kotakbaz.rain.module.modules.render.R.R[0xA3E5 ^ 0xA286] = 0xFFFF5D0E ^ 0xA286;
        kotakbaz.rain.module.modules.render.R.R[0x57E2 ^ 0x577F] = 0x5737 ^ 0x577F;
        kotakbaz.rain.module.modules.render.R.R[0xC205 ^ 0xC339] = 0xFFFF3CA5 ^ 0xC339;
        kotakbaz.rain.module.modules.render.R.R[0x5869 ^ 0x5941] = 0xFFFFA6E8 ^ 0x5941;
        kotakbaz.rain.module.modules.render.R.R[0x24F ^ 0x22F] = 0xFFFFFDD4 ^ 0x22F;
        kotakbaz.rain.module.modules.render.R.R[0xC422 ^ 0xC578] = 0xFFFF3AF5 ^ 0xC578;
        kotakbaz.rain.module.modules.render.R.R[0x8FED ^ 0x8F6C] = 0x8E25 ^ 0x8F6C;
        kotakbaz.rain.module.modules.render.R.R[0xBC94 ^ 0xBCA7] = 0xFFFF433A ^ 0xBCA7;
        kotakbaz.rain.module.modules.render.R.R[0xBC13 ^ 0xBD92] = 0xFFFF421D ^ 0xBD92;
        kotakbaz.rain.module.modules.render.R.R[0xD3BD ^ 0xD3A0] = 0xFFFF2C52 ^ 0xD3A0;
        kotakbaz.rain.module.modules.render.R.R[0xC296 ^ 0xC222] = 0xFFFF3DB3 ^ 0xC222;
        kotakbaz.rain.module.modules.render.R.R[0x28B6 ^ 0x29B8] = 0x2BB8 ^ 0x29B8;
        kotakbaz.rain.module.modules.render.R.R[0xE703 ^ 0xE755] = 0xE74A ^ 0xE755;
        kotakbaz.rain.module.modules.render.R.R[0x1CC1 ^ 0x1DAE] = 0x1DE8 ^ 0x1DAE;
        kotakbaz.rain.module.modules.render.R.R[0x4BA6 ^ 0x4BEB] = 0xFFFFB406 ^ 0x4BEB;
        kotakbaz.rain.module.modules.render.R.R[0x9E93 ^ 0x9F8E] = 0xFFFF6056 ^ 0x9F8E;
        kotakbaz.rain.module.modules.render.R.R[0x29F0 ^ 0x294A] = 0xFFFFD6F3 ^ 0x294A;
        kotakbaz.rain.module.modules.render.R.R[0xB57E ^ 0xB43E] = 0xFFFF4BC8 ^ 0xB43E;
        kotakbaz.rain.module.modules.render.R.R[0x791F ^ 0x7833] = 0xFFFF87B3 ^ 0x7833;
        kotakbaz.rain.module.modules.render.R.R[0xC37B ^ 0xC338] = 0xC338 ^ 0xC338;
        kotakbaz.rain.module.modules.render.R.R[0xA03E ^ 0xA173] = 0xFFFF5ED5 ^ 0xA173;
        kotakbaz.rain.module.modules.render.R.R[0x2A16 ^ 0x2B61] = 0xFFFFD4F1 ^ 0x2B61;
        kotakbaz.rain.module.modules.render.R.R[0x107EA ^ 0x10788] = 0x10785 ^ 0x10788;
        kotakbaz.rain.module.modules.render.R.R[0xB1E ^ 0xB74] = 0xB07 ^ 0xB74;
        kotakbaz.rain.module.modules.render.R.R[0x8025 ^ 0x8013] = 0x8053 ^ 0x8013;
        kotakbaz.rain.module.modules.render.R.R[0x306A ^ 0x30C8] = 0x3098 ^ 0x30C8;
        kotakbaz.rain.module.modules.render.R.R[0x6DB9 ^ 0x6D84] = 0xFFFF9229 ^ 0x6D84;
        kotakbaz.rain.module.modules.render.R.R[0x8184 ^ 0x8132] = 0x81F9 ^ 0x8132;
        kotakbaz.rain.module.modules.render.R.R[0x58E3 ^ 0x5811] = 0xFFFFA778 ^ 0x5811;
        kotakbaz.rain.module.modules.render.R.R[0x2E15 ^ 0x2E0F] = 0x2E21 ^ 0x2E0F;
        kotakbaz.rain.module.modules.render.R.R[0xE63B ^ 0xE686] = 0xE6A6 ^ 0xE686;
        kotakbaz.rain.module.modules.render.R.R[0x5853 ^ 0x5884] = 0x5889 ^ 0x5884;
        kotakbaz.rain.module.modules.render.R.R[0xD343 ^ 0xD3C3] = 0xFFFF2C03 ^ 0xD3C3;
        kotakbaz.rain.module.modules.render.R.R[0x16BE ^ 0x160D] = 0xFFFFE93F ^ 0x160D;
        kotakbaz.rain.module.modules.render.R.R[0xE1D9 ^ 0xE0CF] = 0xF05F ^ 0xE0CF;
        kotakbaz.rain.module.modules.render.R.R[0x112B ^ 0x11B8] = 0xFFFFEF8D ^ 0x11B8;
        kotakbaz.rain.module.modules.render.R.R[0x88EB ^ 0x8887] = 0xFFFF7756 ^ 0x8887;
        kotakbaz.rain.module.modules.render.R.R[0xD019 ^ 0xD0B8] = 0xFFFF2F6C ^ 0xD0B8;
        kotakbaz.rain.module.modules.render.R.R[0xAA73 ^ 0xAB7C] = 0x885C ^ 0xAB7C;
        kotakbaz.rain.module.modules.render.R.R[0x1EB3 ^ 0x1F89] = 0xFFFFE012 ^ 0x1F89;
        kotakbaz.rain.module.modules.render.R.R[0xACDC ^ 0xAC04] = 0xAC50 ^ 0xAC04;
        kotakbaz.rain.module.modules.render.R.R[0xDBFC ^ 0xDBA6] = 0xFFFF246A ^ 0xDBA6;
        kotakbaz.rain.module.modules.render.R.R[0x7051 ^ 0x7164] = 0x713A ^ 0x7164;
        kotakbaz.rain.module.modules.render.R.R[0x6D78 ^ 0x6DDB] = 0x6DA7 ^ 0x6DDB;
        kotakbaz.rain.module.modules.render.R.R[0xD35F ^ 0xD3F4] = 0xD39D ^ 0xD3F4;
        kotakbaz.rain.module.modules.render.R.R[0x10687 ^ 0x1064B] = 0xFFFEF9A1 ^ 0x1064B;
        kotakbaz.rain.module.modules.render.R.R[0x2D2C ^ 0x2C27] = 0x2C25 ^ 0x2C27;
        kotakbaz.rain.module.modules.render.R.R[0x9939 ^ 0x99F2] = 0xFFFF6695 ^ 0x99F2;
        kotakbaz.rain.module.modules.render.R.R[0xB1BE ^ 0xB133] = 0xB1FC ^ 0xB133;
        kotakbaz.rain.module.modules.render.R.R[0xBF38 ^ 0xBF28] = 0xBF72 ^ 0xBF28;
        kotakbaz.rain.module.modules.render.R.R[0x8C2B ^ 0x8C50] = 0x8C66 ^ 0x8C50;
        kotakbaz.rain.module.modules.render.R.R[0xABDF ^ 0xAB3F] = 0xABEF ^ 0xAB3F;
        kotakbaz.rain.module.modules.render.R.R[0x8C60 ^ 0x8D7E] = 0xFFFF7299 ^ 0x8D7E;
        kotakbaz.rain.module.modules.render.R.R[0x4F37 ^ 0x4F82] = 0xFFFFB023 ^ 0x4F82;
        kotakbaz.rain.module.modules.render.R.R[0xBE81 ^ 0xBF85] = 0xFFFF406D ^ 0xBF85;
        kotakbaz.rain.module.modules.render.R.R[0x873C ^ 0x8762] = 0xFFFF78BB ^ 0x8762;
        kotakbaz.rain.module.modules.render.R.R[0x43DB ^ 0x4288] = 0xFFFFBDDA ^ 0x4288;
        kotakbaz.rain.module.modules.render.R.R[0x7F6B ^ 0x7F69] = 0x7F6B ^ 0x7F69;
        kotakbaz.rain.module.modules.render.R.R[0xEA36 ^ 0xEA50] = 0xFFFF1595 ^ 0xEA50;
        kotakbaz.rain.module.modules.render.R.R[0x7069 ^ 0x7075] = 0x7052 ^ 0x7075;
        kotakbaz.rain.module.modules.render.R.R[0x491E ^ 0x495A] = 0xFFFFB6B1 ^ 0x495A;
        kotakbaz.rain.module.modules.render.R.R[0x215B ^ 0x2076] = 0xFFFFDFB9 ^ 0x2076;
        kotakbaz.rain.module.modules.render.R.R[0x6802 ^ 0x684D] = 0xFFFF97C0 ^ 0x684D;
        kotakbaz.rain.module.modules.render.R.R[0xC56D ^ 0xC44D] = 0xC449 ^ 0xC44D;
        kotakbaz.rain.module.modules.render.R.R[0xE0A3 ^ 0xE091] = 0xFFFF1F68 ^ 0xE091;
        kotakbaz.rain.module.modules.render.R.R[0x8A29 ^ 0x8B29] = 0x8B55 ^ 0x8B29;
        kotakbaz.rain.module.modules.render.R.R[0x242E ^ 0x2543] = 0xFFFFDA81 ^ 0x2543;
        kotakbaz.rain.module.modules.render.R.R[0xD2C7 ^ 0xD28B] = 0xFFFF2D34 ^ 0xD28B;
        kotakbaz.rain.module.modules.render.R.R[0x5EDF ^ 0x5FDA] = 0x5FCB ^ 0x5FDA;
        kotakbaz.rain.module.modules.render.R.R[0xE889 ^ 0xE89B] = 0xFFFF1722 ^ 0xE89B;
        kotakbaz.rain.module.modules.render.R.R[0xCFAC ^ 0xCE87] = 0xFFFF314F ^ 0xCE87;
        kotakbaz.rain.module.modules.render.R.R[0x8A5C ^ 0x8AEC] = 0x8AEE ^ 0x8AEC;
        kotakbaz.rain.module.modules.render.R.R[0xBA9C ^ 0xBA34] = 0xBA44 ^ 0xBA34;
        kotakbaz.rain.module.modules.render.R.R[0xDF41 ^ 0xDF4D] = 0xFFFF20CD ^ 0xDF4D;
        kotakbaz.rain.module.modules.render.R.R[0x41D6 ^ 0x4097] = 0x40F6 ^ 0x4097;
        kotakbaz.rain.module.modules.render.R.R[0xDE75 ^ 0xDE7C] = 0xDE78 ^ 0xDE7C;
        kotakbaz.rain.module.modules.render.R.R[0xC38E ^ 0xC284] = 0xC284 ^ 0xC284;
        kotakbaz.rain.module.modules.render.R.R[0x9BB3 ^ 0x9AB1] = 0x9A8D ^ 0x9AB1;
        kotakbaz.rain.module.modules.render.R.R[0xD07A ^ 0xD096] = 0xFFFF2F2D ^ 0xD096;
        kotakbaz.rain.module.modules.render.R.R[0xE5DE ^ 0xE494] = 0xE430 ^ 0xE494;
        kotakbaz.rain.module.modules.render.R.R[0xB0DB ^ 0xB1AA] = 0xB1BA ^ 0xB1AA;
        kotakbaz.rain.module.modules.render.R.R[0xD677 ^ 0xD749] = 0xFFFF28EE ^ 0xD749;
        kotakbaz.rain.module.modules.render.R.R[0x8D9B ^ 0x8DC2] = 0x8DC8 ^ 0x8DC2;
        kotakbaz.rain.module.modules.render.R.R[0xB498 ^ 0xB5A8] = 0xFFFF4A7F ^ 0xB5A8;
        kotakbaz.rain.module.modules.render.R.R[0x7A62 ^ 0x7AE6] = 0xFFFF8508 ^ 0x7AE6;
        kotakbaz.rain.module.modules.render.R.R[0x210F ^ 0x21FF] = 0xFFFFDE65 ^ 0x21FF;
        kotakbaz.rain.module.modules.render.R.R[0xC69F ^ 0xC6ED] = 0xC7D8 ^ 0xC6ED;
        kotakbaz.rain.module.modules.render.R.R[0xE7A4 ^ 0xE78C] = 0xE7AB ^ 0xE78C;
        kotakbaz.rain.module.modules.render.R.R[0x18A0 ^ 0x1826] = 0xFFFFE7DF ^ 0x1826;
        kotakbaz.rain.module.modules.render.R.R[0xF36C ^ 0xF208] = 0xF210 ^ 0xF208;
        kotakbaz.rain.module.modules.render.R.R[0xA31A ^ 0xA20E] = 0x5A03 ^ 0xA20E;
    }
}

