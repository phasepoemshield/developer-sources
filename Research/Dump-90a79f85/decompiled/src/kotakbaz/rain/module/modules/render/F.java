/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
 *  net.minecraft.class_1921
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_3532
 *  net.minecraft.class_4184
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_746
 *  net.minecraft.class_9799
 *  org.joml.Quaternionfc
 */
package kotakbaz.rain.module.modules.render;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.events.B;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.render.I;
import kotakbaz.rain.module.modules.render.P;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1657;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_746;
import net.minecraft.class_9799;
import net.minecraft.client.render.RainRenderLayers;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001[B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J5\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u008f\u0001\u00101\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!2\u0006\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020!2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0002\u00a2\u0006\u0004\b1\u00102J\u000f\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020.H\u0002\u00a2\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u00122\u0006\u00108\u001a\u00020\u000b2\u0006\u00109\u001a\u00020!H\u0002\u00a2\u0006\u0004\b:\u0010;J\u0017\u0010>\u001a\u00020.2\u0006\u0010=\u001a\u00020<H\u0002\u00a2\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020<H\u0002\u00a2\u0006\u0004\b@\u0010AJ\u001f\u0010=\u001a\u00020<2\u0006\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b=\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u001c\u0010S\u001a\n R*\u0004\u0018\u000103038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bS\u0010TR\u001c\u0010U\u001a\n R*\u0004\u0018\u000103038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bU\u0010TR<\u0010Y\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00120W0Vj\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00120W`X8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bY\u0010Z\u00a8\u0006\\"}, d2={"Lkotakbaz/rain/module/modules/render/TrailsModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/Render3DEvent;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1657;", "player", "", "lifetimeSeconds", "renderNewMode", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_1657;D)V", "renderLineMode", "Lnet/minecraft/class_243;", "cameraPos", "", "Lkotakbaz/rain/module/modules/render/TrailsModule$TrailPoint;", "points", "renderRibbonFill", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_1657;Lnet/minecraft/class_243;Ljava/util/List;)V", "", "top", "renderRibbonLine", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_1657;Lnet/minecraft/class_243;Ljava/util/List;Z)V", "Lnet/minecraft/class_4588;", "buffer", "Lnet/minecraft/class_4587$class_4665;", "entry", "", "x1", "y1", "z1", "x2", "y2", "z2", "x3", "y3", "z3", "x4", "y4", "z4", "Ljava/awt/Color;", "startColor", "endColor", "addRibbonQuad", "(Lnet/minecraft/class_4588;Lnet/minecraft/class_4587$class_4665;FFFFFFFFFFFFLjava/awt/Color;Ljava/awt/Color;)V", "Lnet/minecraft/class_2960;", "resolveSpriteTexture", "()Lnet/minecraft/class_2960;", "selectedColor", "()Ljava/awt/Color;", "entity", "partialTicks", "getSmoothPos", "(Lnet/minecraft/class_1657;F)Lnet/minecraft/class_243;", "", "alpha", "tintedColor", "(I)Ljava/awt/Color;", "maxTrailPoints", "()I", "", "createdAt", "(JD)I", "Lkotakbaz/rain/module/setting/ModeSetting;", "mode", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "length", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "size", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "trailColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "kotlin.jvm.PlatformType", "glowTexture", "Lnet/minecraft/class_2960;", "pointTexture", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "Lkotlin/collections/ArrayList;", "trail", "Ljava/util/ArrayList;", "TrailPoint", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTrailsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TrailsModule.kt\nkotakbaz/rain/module/modules/render/TrailsModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,294:1\n1924#2,3:295\n1642#2,10:298\n1915#2:308\n1916#2:310\n1652#2:311\n1915#2,2:312\n1#3:309\n*S KotlinDebug\n*F\n+ 1 TrailsModule.kt\nkotakbaz/rain/module/modules/render/TrailsModule\n*L\n83#1:295,3\n127#1:298,10\n127#1:308\n127#1:310\n127#1:311\n214#1:312,2\n127#1:309\n*E\n"})
public final class F
extends a_0 {
    @NotNull
    public static final F INSTANCE;
    @NotNull
    private static final kotakbaz.rain.module.setting.c a;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 A;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 b;
    @NotNull
    private static final c B;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.B c;
    private static final class_2960 C;
    private static final class_2960 d;
    @NotNull
    private static final ArrayList<Pair<Long, class_243>> D;
    private static Object[] e;
    private static Object f;
    private static Object[] F;
    private static Object[] E;
    private static Object[] g;
    public static int[] G;

    private F() {
        int n = G[0];
        n += G[1];
        int n2 = G[3];
        n2 -= G[4];
        int n3 = G[6];
        n3 ^= G[7];
        super((String)e[n += G[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)e[n2 ^= G[5]] + (String)e[n3 += G[8]]);
    }

    @Override
    public void onEnable() {
        D.clear();
    }

    @Override
    public void onDisable() {
        D.clear();
    }

    @Commando
    public final void onRender3D(@NotNull B b2) {
        class_243 class_2432;
        int n = G[9];
        n ^= G[10];
        Intrinsics.checkNotNullParameter(b2, (String)e[n -= G[11]]);
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_7462 == null) {
            return;
        }
        class_746 class_7463 = class_7462;
        if (!this.isEnabled()) {
            return;
        }
        if (b_0.getMc().field_1687 == null) {
            return;
        }
        double d2 = ((Number)A.getValue()).floatValue();
        long l = RangesKt.coerceAtLeast((long)(d2 * Double.longBitsToDouble(0x44FD07F2D6C26E89L ^ 0x47247F2D6C26E89L)), 1L);
        long l2 = System.currentTimeMillis();
        D.removeIf(arg_0 -> F.onRender3D$lambda$1(arg_0 -> F.onRender3D$lambda$0(l2, l, arg_0), arg_0));
        class_243 class_2433 = this.getSmoothPos((class_1657)class_7463, b2.getPartialTicks());
        Pair pair = (Pair)CollectionsKt.lastOrNull((List)D);
        Object object = class_2432 = pair != null ? (class_243)pair.getSecond() : null;
        if (class_2432 == null || class_2432.method_1025(class_2433) > Double.longBitsToDouble(0xC3CAF90D26BB5CE7L ^ 0xFCD0CFEFCDA71FCAL)) {
            D.add(TuplesKt.to(l2, class_2433));
            while (D.size() > this.maxTrailPoints()) {
                int n2 = G[12];
                n2 += G[13];
                D.remove(n2 ^= G[14]);
            }
        }
        if (b_0.getMc().field_1690.method_31044().method_31034()) {
            return;
        }
        if (a.getSelectedIndex() == 0) {
            this.renderLineMode(b2, (class_1657)class_7463, d2);
        } else {
            this.renderNewMode(b2, (class_1657)class_7463, d2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void renderNewMode(B b2, class_1657 class_16572, double d2) {
        long l = 2888610830373601332L;
        long l2 = 8952342776680588555L;
        long l3 = 8639899495161177158L;
        long l4 = -1353599978194332893L;
        long l5 = -2829503301482736966L;
        long l6 = -6280803053251278329L;
        if (D.isEmpty()) {
            return;
        }
        class_4184 class_41842 = b_0.getMc().field_1773.method_19418();
        class_243 class_2432 = class_41842.method_19326();
        class_1921 class_19212 = RainRenderLayers.getTrailSprite(this.resolveSpriteTexture());
        int n = G[15];
        n += G[16];
        try (class_9799 class_97992 = new class_9799(n ^= G[17]);){
            class_4597.class_4598 class_45982 = class_4597.method_22991((class_9799)class_97992);
            class_4588 class_45882 = class_45982.getBuffer(class_19212);
            Color color = this.selectedColor();
            Iterable iterable = D;
            long l7 = l4;
            int n2 = G[18];
            n2 += G[19];
            l4 = l7 ^ (0L ^ l7) & -1L << (n2 -= G[20]);
            long l8 = l5;
            int n3 = G[21];
            n3 ^= G[22];
            l5 = l8 ^ (0L ^ l8) & -1L << (n3 -= G[23]);
            for (Object t2 : iterable) {
                int n4 = G[24];
                n4 ^= G[25];
                int n5 = (int)(l5 >>> (n4 ^= G[26]));
                l5 += 0x100000000L;
                int n6 = G[27];
                n6 -= G[28];
                long l9 = l6;
                int n7 = G[30];
                n7 -= G[31];
                l6 = l9 ^ ((long)n5 << (n6 -= G[29]) ^ l9) & -1L << (n7 ^= G[32]);
                int n8 = G[33];
                n8 -= G[34];
                if ((int)(l6 >>> (n8 -= G[35])) < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                int n9 = G[36];
                n9 ^= G[37];
                Pair pair = (Pair)t2;
                long l10 = l;
                int n10 = G[39];
                n10 ^= G[40];
                l = l10 ^ ((long)((int)(l6 >>> (n9 ^= G[38]))) ^ l10) & -1L >>> (n10 ^= G[41]);
                long l11 = l2;
                int n11 = G[42];
                n11 += G[43];
                l2 = l11 ^ (0L ^ l11) & -1L << (n11 += G[44]);
                class_243 class_2433 = ((class_243)pair.getSecond()).method_1020(class_2432);
                int n12 = G[45];
                n12 += G[46];
                long l12 = l3;
                int n13 = G[48];
                n13 += G[49];
                l3 = l12 ^ ((long)INSTANCE.alpha(((Number)pair.getFirst()).longValue(), d2) << (n12 += G[47]) ^ l12) & -1L << (n13 -= G[50]);
                int n14 = G[51];
                n14 -= G[52];
                if ((int)(l3 >>> (n14 += G[53])) <= 0) continue;
                int n15 = G[54];
                n15 += G[55];
                int n16 = G[57];
                n16 += G[58];
                int n17 = G[60];
                n17 += G[61];
                Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), RangesKt.coerceIn((int)(l3 >>> (n15 += G[56])), n16 ^= G[59], n17 -= G[62]));
                float f2 = ((Number)b.getValue()).floatValue();
                b2.getMatrices().method_22903();
                b2.getMatrices().method_22904(class_2433.field_1352, class_2433.field_1351 + (double)class_16572.method_17682() * Double.longBitsToDouble(0x875AC7CBAA850FF4L ^ 0xB8BAC7CBAA850FF4L), class_2433.field_1350);
                b2.getMatrices().method_22907((Quaternionfc)class_41842.method_23767());
                b2.getMatrices().method_22905(0.1f, 0.1f, 0.1f);
                class_4587.class_4665 class_46652 = b2.getMatrices().method_23760();
                class_45882.method_56824(class_46652, -f2, f2, 0.0f).method_1336(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).method_22913(0.0f, 0.0f);
                class_45882.method_56824(class_46652, f2, f2, 0.0f).method_1336(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).method_22913(1.0f, 0.0f);
                class_45882.method_56824(class_46652, f2, -f2, 0.0f).method_1336(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).method_22913(1.0f, 1.0f);
                class_45882.method_56824(class_46652, -f2, -f2, 0.0f).method_1336(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha()).method_22913(0.0f, 1.0f);
                b2.getMatrices().method_22909();
            }
            class_45982.method_22993();
        }
    }

    private final void renderLineMode(B b2, class_1657 class_16572, double d2) {
        long l = -1633365812086878876L;
        long l2 = -8101236069242628509L;
        long l3 = -5057000357169694101L;
        long l4 = -6251849417887241337L;
        long l5 = 6728071275456351807L;
        int n = G[63];
        n += G[64];
        if (D.size() < (n += G[65])) {
            return;
        }
        class_243 class_2432 = b_0.getMc().field_1773.method_19418().method_19326();
        Iterable iterable = D;
        long l6 = l3;
        int n2 = G[66];
        n2 += G[67];
        l3 = l6 ^ (0L ^ l6) & -1L << (n2 ^= G[68]);
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList();
        long l7 = l3;
        int n3 = G[69];
        n3 += G[70];
        l3 = l7 ^ (0L ^ l7) & -1L >>> (n3 -= G[71]);
        Iterable iterable3 = iterable2;
        long l8 = l4;
        int n4 = G[72];
        n4 -= G[73];
        l4 = l8 ^ (0L ^ l8) & -1L << (n4 -= G[74]);
        Iterator iterator2 = iterable3.iterator();
        while (iterator2.hasNext()) {
            I i2;
            Object t2;
            Object t3 = t2 = iterator2.next();
            long l9 = l4;
            int n5 = G[75];
            n5 -= G[76];
            l4 = l9 ^ (0L ^ l9) & -1L >>> (n5 -= G[77]);
            Pair pair = (Pair)t3;
            long l10 = l5;
            int n6 = G[78];
            n6 += G[79];
            l5 = l10 ^ (0L ^ l10) & -1L << (n6 -= G[80]);
            long l11 = ((Number)pair.component1()).longValue();
            class_243 class_2433 = (class_243)pair.component2();
            long l12 = l5;
            int n7 = G[81];
            n7 -= G[82];
            l5 = l12 ^ ((long)INSTANCE.alpha(l11, d2) ^ l12) & -1L >>> (n7 += G[83]);
            if (((int)l5 <= 0 ? null : new I(class_2433, (int)l5)) == null) continue;
            i2 = i2;
            long l13 = l2;
            int n8 = G[84];
            n8 ^= G[85];
            l2 = l13 ^ (0L ^ l13) & -1L << (n8 -= G[86]);
            collection.add(i2);
        }
        List list = (List)collection;
        int n9 = G[87];
        n9 ^= G[88];
        if (list.size() < (n9 -= G[89])) {
            return;
        }
        Intrinsics.checkNotNull(class_2432);
        this.renderRibbonFill(b2, class_16572, class_2432, list);
        boolean bl = G[90];
        bl ^= G[91];
        this.renderRibbonLine(b2, class_16572, class_2432, list, bl += G[92]);
        boolean bl2 = G[93];
        bl2 ^= G[94];
        this.renderRibbonLine(b2, class_16572, class_2432, list, bl2 += G[95]);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void renderRibbonFill(B b2, class_1657 class_16572, class_243 class_2432, List<I> list) {
        long l = 2375810912973086845L;
        long l2 = 4072415531243430090L;
        long l3 = -4550610088685622690L;
        long l4 = -3170302288870530587L;
        int n = G[96];
        n += G[97];
        AutoCloseable autoCloseable = (AutoCloseable)new class_9799(n ^= G[98]);
        Throwable throwable = null;
        try {
            Object object = (class_9799)autoCloseable;
            long l5 = l2;
            int n2 = G[99];
            n2 -= G[100];
            l2 = l5 ^ (0L ^ l5) & -1L << (n2 += G[101]);
            class_4597.class_4598 class_45982 = class_4597.method_22991((class_9799)object);
            boolean bl = G[102];
            bl ^= G[103];
            class_1921 class_19212 = RainRenderLayers.getHitBoxQuad(bl += G[104]);
            class_4588 class_45882 = class_45982.getBuffer(class_19212);
            float f2 = RangesKt.coerceAtLeast((float)class_16572.method_5829().method_17940(), class_16572.method_17682());
            float f3 = 0.02f;
            float f4 = 0.02f;
            b2.getMatrices().method_22903();
            b2.getMatrices().method_22904(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
            class_4587.class_4665 class_46652 = b2.getMatrices().method_23760();
            long l6 = l4;
            int n3 = G[105];
            n3 ^= G[106];
            l4 = l6 ^ (0L ^ l6) & -1L >>> (n3 += G[107]);
            int n4 = G[108];
            n4 += G[109];
            long l7 = l4;
            int n5 = G[111];
            n5 += G[112];
            l4 = l7 ^ ((long)CollectionsKt.getLastIndex(list) << (n4 += G[110]) ^ l7) & -1L << (n5 ^= G[113]);
            while (true) {
                int n6 = G[114];
                n6 -= G[115];
                if ((int)l4 >= (int)(l4 >>> (n6 ^= G[116]))) break;
                I i2 = list.get((int)l4);
                int n7 = G[117];
                n7 ^= G[118];
                I i3 = list.get((int)l4 + (n7 ^= G[119]));
                Color color = INSTANCE.tintedColor(i2.getAlpha());
                Color color2 = INSTANCE.tintedColor(i3.getAlpha());
                float f5 = (float)i2.getPosition().field_1351 + f3;
                float f6 = (float)i2.getPosition().field_1351 + f2 - f4;
                float f7 = (float)i3.getPosition().field_1351 + f3;
                float f8 = (float)i3.getPosition().field_1351 + f2 - f4;
                Intrinsics.checkNotNull(class_45882);
                Intrinsics.checkNotNull(class_46652);
                INSTANCE.addRibbonQuad(class_45882, class_46652, (float)i2.getPosition().field_1352, f5, (float)i2.getPosition().field_1350, (float)i2.getPosition().field_1352, f6, (float)i2.getPosition().field_1350, (float)i3.getPosition().field_1352, f8, (float)i3.getPosition().field_1350, (float)i3.getPosition().field_1352, f7, (float)i3.getPosition().field_1350, color, color2);
                long l8 = l4;
                int n8 = G[120];
                n8 ^= G[121];
                int n9 = G[123];
                n9 ^= G[124];
                l4 = l8 ^ (l8 ^ l8 + (long)(n8 -= G[122])) & -1L >>> (n9 -= G[125]);
            }
            b2.getMatrices().method_22909();
            class_45982.method_22994(class_19212);
            object = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void renderRibbonLine(B b2, class_1657 class_16572, class_243 class_2432, List<I> list, boolean bl) {
        long l = 12701862307522529L;
        long l2 = 14665611888009485L;
        int n = G[126];
        n ^= G[127];
        AutoCloseable autoCloseable = (AutoCloseable)new class_9799(n ^= G[128]);
        Throwable throwable = null;
        try {
            Object object = (class_9799)autoCloseable;
            long l3 = l;
            int n2 = G[129];
            n2 -= G[130];
            l = l3 ^ (0L ^ l3) & -1L << (n2 += G[131]);
            class_4597.class_4598 class_45982 = class_4597.method_22991((class_9799)object);
            class_1921 class_19212 = class_1921.method_49043((double)Double.longBitsToDouble(0x793E1DA62C41495EL ^ 0x39361DA62C41495EL));
            class_4588 class_45882 = class_45982.getBuffer(class_19212);
            float f2 = RangesKt.coerceAtLeast((float)class_16572.method_5829().method_17940(), class_16572.method_17682());
            float f3 = 0.02f;
            float f4 = 0.02f;
            b2.getMatrices().method_22903();
            b2.getMatrices().method_22904(-class_2432.field_1352, -class_2432.field_1351, -class_2432.field_1350);
            class_4587.class_4665 class_46652 = b2.getMatrices().method_23760();
            Iterable iterable = list;
            long l4 = l;
            int n3 = G[132];
            n3 -= G[133];
            l = l4 ^ (0L ^ l4) & -1L >>> (n3 += G[134]);
            for (Object t2 : iterable) {
                I i2 = (I)t2;
                long l5 = l2;
                int n4 = G[135];
                n4 += G[136];
                l2 = l5 ^ (0L ^ l5) & -1L << (n4 ^= G[137]);
                Color color = INSTANCE.tintedColor(i2.getAlpha());
                float f5 = bl ? (float)i2.getPosition().field_1351 + f2 - f4 : (float)i2.getPosition().field_1351 + f3;
                class_45882.method_56824(class_46652, (float)i2.getPosition().field_1352, f5, (float)i2.getPosition().field_1350).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha()).method_60831(class_46652, 0.0f, 1.0f, 0.0f);
            }
            b2.getMatrices().method_22909();
            class_45982.method_22994(class_19212);
            object = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, throwable);
        }
    }

    private final void addRibbonQuad(class_4588 class_45882, class_4587.class_4665 class_46652, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, Color color, Color color2) {
        class_45882.method_56824(class_46652, f2, f3, f4).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_45882.method_56824(class_46652, f5, f6, f7).method_1336(color.getRed(), color.getGreen(), color.getBlue(), color.getAlpha());
        class_45882.method_56824(class_46652, f8, f9, f10).method_1336(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
        class_45882.method_56824(class_46652, f11, f12, f13).method_1336(color2.getRed(), color2.getGreen(), color2.getBlue(), color2.getAlpha());
    }

    private final class_2960 resolveSpriteTexture() {
        class_2960 class_29602;
        int n = G[138];
        n -= G[139];
        if (a.getSelectedIndex() == (n -= G[140])) {
            class_2960 class_29603 = C;
            class_29602 = class_29603;
            int n2 = G[141];
            n2 -= G[142];
            Intrinsics.checkNotNullExpressionValue(class_29603, (String)e[n2 -= G[143]]);
        } else {
            class_2960 class_29604 = d;
            class_29602 = class_29604;
            int n3 = G[144];
            n3 += G[145];
            Intrinsics.checkNotNullExpressionValue(class_29604, (String)e[n3 += G[146]]);
        }
        return class_29602;
    }

    private final Color selectedColor() {
        return (Boolean)B.getValue() != false && P.INSTANCE.isEnabled() ? P.INSTANCE.getClientColor() : (Color)c.getValue();
    }

    private final class_243 getSmoothPos(class_1657 class_16572, float f2) {
        class_243 class_2432 = class_16572.method_30950(f2);
        int n = G[147];
        n ^= G[148];
        int n2 = G[150];
        n2 += G[151];
        Intrinsics.checkNotNullExpressionValue(class_2432, (String)e[n -= G[149]] + (String)e[n2 -= G[152]]);
        return class_2432;
    }

    private final Color tintedColor(int n) {
        Color color = this.selectedColor();
        int n2 = G[153];
        n2 += G[154];
        int n3 = G[156];
        n3 ^= G[157];
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), RangesKt.coerceIn(n, n2 -= G[155], n3 ^= G[158]));
    }

    private final int maxTrailPoints() {
        int n = G[159];
        n ^= G[160];
        return RangesKt.coerceAtLeast((int)(((Number)A.getValue()).floatValue() * 240.0f), n ^= G[161]);
    }

    private final int alpha(long l, double d2) {
        long l2 = System.currentTimeMillis();
        double d3 = d2 * Double.longBitsToDouble(0xE2315DCB5FD2B366L ^ 0xA2BE1DCB5FD2B366L) - (double)(l2 - l);
        double d4 = d2 * Double.longBitsToDouble(0x1E4DA032E1F0976DL ^ 0x5EC2E032E1F0976DL);
        double d5 = d4 <= 0.0 ? 0.0 : d3 / d4;
        int n = G[162];
        n ^= G[163];
        int n2 = G[165];
        n2 += G[166];
        return class_3532.method_15340((int)((int)(Double.longBitsToDouble(0x9FC96E57A439B1E4L ^ 0xDFABAE57A439B1E4L) * d5)), (int)(n ^= G[164]), (int)(n2 -= G[167]));
    }

    private static final boolean size$lambda$0() {
        boolean bl;
        int n = G[168];
        n ^= G[169];
        if (a.getSelectedIndex() == (n -= G[170])) {
            boolean bl2 = G[171];
            bl2 += G[172];
            bl = bl2 ^= G[173];
        } else {
            boolean bl3 = G[174];
            bl3 -= G[175];
            bl = bl3 -= G[176];
        }
        return bl;
    }

    private static final boolean trailColor$lambda$0() {
        boolean bl;
        if (!((Boolean)B.getValue()).booleanValue()) {
            boolean bl2 = G[177];
            bl2 ^= G[178];
            bl = bl2 ^= G[179];
        } else {
            boolean bl3 = G[180];
            bl3 -= G[181];
            bl = bl3 += G[182];
        }
        return bl;
    }

    private static final boolean onRender3D$lambda$0(long l, long l2, Pair pair) {
        boolean bl;
        int n = G[183];
        n -= G[184];
        Intrinsics.checkNotNullParameter(pair, (String)e[n += G[185]]);
        if (l - ((Number)pair.getFirst()).longValue() > l2) {
            boolean bl2 = G[186];
            bl2 += G[187];
            bl = bl2 += G[188];
        } else {
            boolean bl3 = G[189];
            bl3 += G[190];
            bl = bl3 -= G[191];
        }
        return bl;
    }

    private static final boolean onRender3D$lambda$1(Function1 function1, Object object) {
        return (Boolean)function1.invoke(object);
    }

    static {
        kotakbaz.rain.module.modules.render.F.b();
        long l = -5663398163209006540L;
        long l2 = 7591779931946720341L;
        long l3 = -1560326571013724402L;
        long l4 = -6791294354081576290L;
        long l5 = -4802715550118191099L;
        long l6 = 2343064057536484614L;
        long l7 = 168050198645148444L;
        long l8 = -3869402740839828578L;
        long l9 = -6516513115247208288L;
        long l10 = -7423450411275853473L;
        long l11 = 9072015596440400435L;
        long l12 = -5701338769246282915L;
        long l13 = 8585019662233661224L;
        long l14 = 4121514992960053052L;
        int n = G[192];
        n += G[193];
        e = new Object[n -= G[194]];
        long l15 = l14;
        int n2 = G[195];
        n2 ^= G[196];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += G[197]);
        Object[] objectArray = new Object[G[198]];
        objectArray[kotakbaz.rain.module.modules.render.F.G[199]] = E;
        objectArray[kotakbaz.rain.module.modules.render.F.G[200]] = G[201];
        int n3 = G[202];
        Object object = kotakbaz.rain.module.modules.render.F.A()[G[203]];
        if (object == null) {
            char[] cArray = "\ua730\ua718\ua75c\ua735\ua736\ua72b\ua70b\ua712\ua70b\ua751\ua720\ua755\ua739\ua758\ua738\ua72a\ua75d\ua759\ua75f\ua709\ua710\ua72f\ua720\ua718\ua712\ua702\ua747\ua70f\ua712\ua737\ua722\ua70c\ua72b\ua73a\ua756\ua72b\ua710\ua75a\ua71a\ua709\ua73e\ua712\ua75f\ua73c\ua711\ua718\ua73a\ua75d\ua72d\ua71a\ua75e\ua733\ua740\ua73f\ua718\ua73c\ua72d\ua736\ua712\ua712\ua71d\ua747\ua747\ua73e\ua733\ua732\ua72c\ua733\ua702\ua739\ua731\ua70d\ua72a\ua73a\ua72f\ua755\ua714\ua72a\ua70d\ua75a\ua73c\ua702\ua70e\ua70d\ua718\ua72c\ua73c\ua755\ua71e\ua72b\ua755\ua754\ua712\ua756\ua72c\ua753\ua758\ua739\ua72d\ua70c\ua731\ua71e\ua738\ua718\ua718\ua760\ua753\ua730\ua732\ua75d\ua736\ua757\ua75b\ua757\ua738\ua720\ua73b\ua70b\ua732\ua732\ua70a\ua753\ua71f\ua754\ua75f\ua75e\ua71e\ua75c\ua757\ua73e\ua734\ua734\ua72e\ua72f\ua719\ua732\ua734\ua73f\ua712\ua75c\ua71f\ua73c\ua70f\ua72b\ua752\ua720\ua72a\ua719\ua752\ua732\ua73d\ua736\ua70e\ua73b\ua70d\ua75c\ua70e\ua712\ua72a\ua73d\ua71e\ua75f\ua75f\ua752\ua702\ua758\ua72d\ua70d\ua752\ua722\ua70b\ua710\ua72d\ua720\ua739\ua755\ua733\ua70c\ua75b\ua735\ua70e\ua720\ua755\ua702\ua730\ua70a\ua75a\ua734\ua757\ua70f\ua71d\ua760\ua702\ua70e\ua711\ua754\ua757\ua754\ua737\ua72c\ua73c\ua70c\ua752\ua732\ua759\ua739\ua737\ua75b\ua73f\ua735\ua756\ua711\ua702\ua72a\ua710\ua75d\ua760\ua739\ua71e\ua752\ua731\ua720\ua747\ua70d\ua760\ua72a\ua756\ua751\ua734\ua737\ua737\ua722\ua738\ua738\ua712\ua722\ua739\ua738\ua754\ua730\ua71a\ua759\ua729\ua733\ua70a\ua752\ua719\ua71a\ua70b\ua72e\ua70c\ua72d\ua720\ua70d\ua70e\ua758\ua72c\ua757\ua734\ua729\ua722\ua756\ua752\ua70b\ua72a\ua712\ua751\ua75a\ua754\ua718\ua730\ua735\ua709\ua730\ua71f\ua73c\ua75f\ua734\ua73e\ua731\ua710\ua735\ua720\ua73a\ua709\ua71d\ua733\ua738\ua73d\ua70c\ua753\ua70b\ua712\ua70c\ua70d\ua737\ua754\ua738\ua734\ua753\ua747\ua75c\ua73b\ua75e\ua72c\ua70c\ua756\ua70e\ua72f\ua731\ua732\ua710\ua71e\ua752\ua71f\ua719\ua75d\ua73b\ua732\ua738\ua727\ua72c\ua757\ua73f\ua75c\ua710\ua753\ua730\ua747\ua73a\ua760\ua729\ua70e\ua73c\ua734\ua75a\ua751\ua738\ua752\ua71d\ua72d\ua738\ua73b\ua72d\ua730\ua73a\ua733\ua72f\ua756\ua714\ua719\ua729\ua71d\ua754\ua718\ua75f\ua71b\ua73e\ua747\ua712\ua735\ua75c\ua70f\ua72a\ua75c\ua714\ua736\ua712\ua711\ua752\ua710\ua71f\ua712\ua711\ua73f\ua72e\ua73d\ua75e\ua71a\ua755\ua70c\ua75d\ua729\ua729\ua747\ua710\ua73a\ua755\ua753\ua752\ua70d\ua730\ua71d\ua710\ua73f\ua752\ua722\ua73d\ua759\ua75b\ua709\ua71c\ua70e\ua736\ua75b\ua710\ua70c\ua71c\ua709\ua710\ua70a\ua70e\ua75d\ua72e\ua70e\ua71e\ua75f\ua70c\ua739\ua72e\ua719\ua737\ua70f\ua70c\ua740\ua709\ua75c\ua706".toCharArray();
            for (int i2 = G[204]; i2 < G[205]; ++i2) {
                int n4 = cArray[i2];
                n4 -= G[206];
                n4 -= G[207];
                n4 ^= G[208];
                n4 -= G[209];
                n4 += G[210];
                n4 -= G[211];
                n4 += G[212];
                n4 += G[213];
                n4 += G[214];
                n4 += G[215];
                cArray[i2] = (char)(n4 -= G[216]);
            }
            object = kotakbaz.rain.module.modules.render.F.A()[kotakbaz.rain.module.modules.render.F.G[217]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.module.modules.render.F.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = G[218];
        n5 ^= G[219];
        l5 = l16 ^ (0xE500000000L ^ l16) & -1L << (n5 ^= G[220]);
        long l17 = l12;
        int n6 = G[221];
        n6 += G[222];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= G[223]);
        while (true) {
            int n7 = G[224];
            n7 ^= G[225];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= G[226]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = G[227];
            n9 ^= G[228];
            int n10 = G[230];
            n10 -= G[231];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= G[229])) & -1L >>> (n10 ^= G[232]);
            long l19 = l8;
            int n11 = G[233];
            n11 ^= G[234];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += G[235]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = G[236];
            n13 += G[237];
            int n14 = G[239];
            n14 -= G[240];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= G[238])) & -1L >>> (n14 ^= G[241]);
            int n15 = G[242];
            n15 += G[243];
            long l21 = l9;
            int n16 = G[245];
            n16 ^= G[246];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= G[244]) ^ l21) & -1L << (n16 -= G[247]);
            int n17 = G[248];
            n17 += G[249];
            n17 += G[250];
            int n18 = G[251];
            n18 += G[252];
            long l22 = l11;
            int n19 = G[254];
            n19 -= G[255];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= G[253]))) ^ l22) & -1L >>> (n19 ^= G[256]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = G[257];
            n20 += G[258];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += G[259]);
            while (true) {
                int n21 = G[260];
                n21 -= G[261];
                if ((int)(l13 >>> (n21 += G[262])) >= (int)l11) break;
                int n22 = G[263];
                n22 += G[264];
                int n23 = G[266];
                n23 += G[267];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.module.modules.render.F.G[265]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= G[268]))];
                l13 += 0x100000000L;
            }
            int n24 = G[269];
            n24 += G[270];
            int n25 = (int)(l14 >>> (n24 ^= G[271]));
            l14 += 0x100000000L;
            kotakbaz.rain.module.modules.render.F.e[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = G[272];
            n26 += G[273];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= G[274]);
        }
        INSTANCE = new F();
        int n27 = G[275];
        n27 -= G[276];
        n27 ^= G[277];
        int n28 = G[278];
        n28 -= G[279];
        String[] stringArray = new String[n28 -= G[280]];
        int n29 = G[281];
        n29 += G[282];
        int n30 = G[284];
        n30 ^= G[285];
        stringArray[n29 -= kotakbaz.rain.module.modules.render.F.G[283]] = (String)e[n30 ^= G[286]];
        int n31 = G[287];
        n31 -= G[288];
        int n32 = G[290];
        n32 ^= G[291];
        stringArray[n31 += kotakbaz.rain.module.modules.render.F.G[289]] = (String)e[n32 += G[292]];
        int n33 = G[293];
        n33 ^= G[294];
        int n34 = G[296];
        n34 += G[297];
        a = a_0.mode$default(INSTANCE, (String)e[n27], CollectionsKt.listOf(stringArray), n33 -= G[295], n34 += G[298], null);
        int n35 = G[299];
        n35 -= G[300];
        A = INSTANCE.slider((String)e[n35 -= G[301]], 0.3f, 0.1f, 2.0f, 0.1f);
        int n36 = G[302];
        n36 += G[303];
        b = INSTANCE.slider((String)e[n36 += G[304]], 2.0f, 0.5f, 4.0f, 0.1f).setVisible(F::size$lambda$0);
        int n37 = G[305];
        n37 ^= G[306];
        boolean bl = G[308];
        bl ^= G[309];
        B = INSTANCE.boolean((String)e[n37 += G[307]], bl -= G[310]);
        int n38 = G[311];
        n38 -= G[312];
        String string = (String)e[n38 -= G[313]];
        Color color = Color.WHITE;
        int n39 = G[314];
        n39 += G[315];
        Intrinsics.checkNotNullExpressionValue(color, (String)e[n39 -= G[316]]);
        c = INSTANCE.color(string, color).setVisible(F::trailColor$lambda$0);
        int n40 = G[317];
        n40 -= G[318];
        int n41 = G[320];
        n41 += G[321];
        int n42 = G[323];
        n42 -= G[324];
        C = class_2960.method_60655((String)((String)e[n40 += G[319]]), (String)((String)e[n41 -= G[322]] + (String)e[n42 += G[325]]));
        int n43 = G[326];
        n43 -= G[327];
        int n44 = G[329];
        n44 -= G[330];
        int n45 = G[332];
        n45 -= G[333];
        d = class_2960.method_60655((String)((String)e[n43 -= G[328]]), (String)((String)e[n44 ^= G[331]] + (String)e[n45 ^= G[334]]));
        D = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[G[335]];
        String string = (String)object[G[336]];
        object = object[G[337]];
        Object[] objectArray = F;
        if (F == null) {
            objectArray = F = new Object[G[338]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[G[339]];
                E = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[G[341] ^ G[342]];
                byArray[kotakbaz.rain.module.modules.render.F.G[343] ^ kotakbaz.rain.module.modules.render.F.G[344]] = G[345] ^ G[346];
                byArray[kotakbaz.rain.module.modules.render.F.G[347] ^ kotakbaz.rain.module.modules.render.F.G[348]] = G[349] ^ G[350];
                byArray[kotakbaz.rain.module.modules.render.F.G[351] ^ kotakbaz.rain.module.modules.render.F.G[352]] = G[353] ^ G[354];
                byArray[kotakbaz.rain.module.modules.render.F.G[355] ^ kotakbaz.rain.module.modules.render.F.G[356]] = G[357] ^ G[358];
                byArray[kotakbaz.rain.module.modules.render.F.G[359] ^ kotakbaz.rain.module.modules.render.F.G[360]] = G[361] ^ G[362];
                byArray[kotakbaz.rain.module.modules.render.F.G[363] ^ kotakbaz.rain.module.modules.render.F.G[364]] = G[365] ^ G[366];
                byArray[kotakbaz.rain.module.modules.render.F.G[367] ^ kotakbaz.rain.module.modules.render.F.G[368]] = G[369] ^ G[370];
                byArray[kotakbaz.rain.module.modules.render.F.G[371] ^ kotakbaz.rain.module.modules.render.F.G[372]] = G[373] ^ G[374];
                byArray[kotakbaz.rain.module.modules.render.F.G[375] ^ kotakbaz.rain.module.modules.render.F.G[376]] = G[377] ^ G[378];
                byArray[kotakbaz.rain.module.modules.render.F.G[379] ^ kotakbaz.rain.module.modules.render.F.G[380]] = G[381] ^ G[382];
                byArray[kotakbaz.rain.module.modules.render.F.G[383] ^ kotakbaz.rain.module.modules.render.F.G[384]] = G[385] ^ G[386];
                byArray[kotakbaz.rain.module.modules.render.F.G[387] ^ kotakbaz.rain.module.modules.render.F.G[388]] = G[389] ^ G[390];
                byArray[kotakbaz.rain.module.modules.render.F.G[391] ^ kotakbaz.rain.module.modules.render.F.G[392]] = G[393] ^ G[394];
                byArray[kotakbaz.rain.module.modules.render.F.G[395] ^ kotakbaz.rain.module.modules.render.F.G[396]] = G[397] ^ G[398];
                byArray[kotakbaz.rain.module.modules.render.F.G[399] ^ 0x5E8] = 0x5D9 ^ 0x5E8;
                byArray[0x263F ^ 0x263F] = 0x2617 ^ 0x263F;
                objectArray2[kotakbaz.rain.module.modules.render.F.G[340]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (f == null) {
                byte[] byArray2 = new byte[0x2F5F ^ 0x2F7F];
                byArray2[0xEDCF ^ 0xEDC7] = 0xFFFF1238 ^ 0xEDC7;
                byArray2[0xEE57 ^ 0xEE55] = 0xEE22 ^ 0xEE55;
                byArray2[0xA8B6 ^ 0xA8B0] = 0xA8B2 ^ 0xA8B0;
                byArray2[0x3AB3 ^ 0x3AA9] = 0xFFFFC53B ^ 0x3AA9;
                byArray2[0x7D96 ^ 0x7D86] = 0xFFFF820C ^ 0x7D86;
                byArray2[0x77EE ^ 0x77F2] = 0x77A0 ^ 0x77F2;
                byArray2[0x119F ^ 0x1193] = 0x11EE ^ 0x1193;
                byArray2[0xCBBD ^ 0xCBB2] = 0xCBF2 ^ 0xCBB2;
                byArray2[0x3A36 ^ 0x3A3C] = 0xFFFFC5C0 ^ 0x3A3C;
                byArray2[0x7A08 ^ 0x7A03] = 0x7A7D ^ 0x7A03;
                byArray2[0x25D9 ^ 0x25DE] = 0xFFFFDA13 ^ 0x25DE;
                byArray2[0x10A43 ^ 0x10A50] = 0xFFFEF5F8 ^ 0x10A50;
                byArray2[0x530F ^ 0x5319] = 0x5335 ^ 0x5319;
                byArray2[0x4C74 ^ 0x4C65] = 0xFFFFB3C8 ^ 0x4C65;
                byArray2[0x2A25 ^ 0x2A26] = 0x2A0D ^ 0x2A26;
                byArray2[0xDBBE ^ 0xDBBE] = 0xDBE4 ^ 0xDBBE;
                byArray2[0xBB1A ^ 0xBB17] = 0xBB72 ^ 0xBB17;
                byArray2[0x3E4D ^ 0x3E4C] = 0xFFFFC1AD ^ 0x3E4C;
                byArray2[0xD944 ^ 0xD956] = 0xFFFF268E ^ 0xD956;
                byArray2[0x48FE ^ 0x48EA] = 0x488F ^ 0x48EA;
                byArray2[0x4DD8 ^ 0x4DD1] = 0xFFFFB20C ^ 0x4DD1;
                byArray2[0xB010 ^ 0xB008] = 0xFFFF4FE0 ^ 0xB008;
                byArray2[0x2644 ^ 0x264A] = 0xFFFFD9A1 ^ 0x264A;
                byArray2[0x7DF2 ^ 0x7DE9] = 0x7D94 ^ 0x7DE9;
                byArray2[0xCA52 ^ 0xCA45] = 0xFFFF35A3 ^ 0xCA45;
                byArray2[0xC039 ^ 0xC02C] = 0xFFFF3F88 ^ 0xC02C;
                byArray2[0xD864 ^ 0xD860] = 0xFFFF27DA ^ 0xD860;
                byArray2[0x83B8 ^ 0x83BD] = 0xFFFF7C0D ^ 0x83BD;
                byArray2[0xFC26 ^ 0xFC3B] = 0xFFFF03A7 ^ 0xFC3B;
                byArray2[0xA3C0 ^ 0xA3DE] = 0xFFFF5C60 ^ 0xA3DE;
                byArray2[0x1825 ^ 0x183C] = 0xFFFFE7FE ^ 0x183C;
                byArray2[0xD4DE ^ 0xD4C1] = 0xD4CB ^ 0xD4C1;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.module.modules.render.F.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u2beb\u2c5d\u2bf6\u2c5f\u2ac1\u2c4d\u2bf2\u2c94\u2b8f\u2c93\u2bf3\u2c78\u2c7c\u2c7e\u2bee\u2bf3\u2c5c\u2c4c".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 += 27490;
                        n2 -= 63170;
                        n2 ^= 0x3F65;
                        n2 -= 38471;
                        n2 ^= 0xCF28;
                        n2 += 43594;
                        n2 += 12493;
                        n2 -= 63504;
                        n2 += 10960;
                        n2 ^= 0xF672;
                        n2 += 29426;
                        n2 ^= 0x87B7;
                        n2 += 37692;
                        cArray[i2] = (char)(n2 -= 42397);
                    }
                    object4 = kotakbaz.rain.module.modules.render.F.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = -123;
                byArray4[1] = 121;
                byArray4[5] = 69;
                byArray4[10] = -34;
                byArray4[13] = -122;
                byArray4[11] = -50;
                byArray4[6] = -39;
                byArray4[7] = -108;
                byArray4[0] = -48;
                byArray4[2] = -77;
                byArray4[4] = -21;
                byArray4[14] = 12;
                byArray4[15] = -67;
                byArray4[9] = -79;
                byArray4[3] = -22;
                byArray4[8] = -57;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 15, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.module.modules.render.F.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ue0a4\ue0b8\ue0ca".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 63457;
                        n3 ^= 0x6E22;
                        n3 ^= 0x3367;
                        n3 -= 47499;
                        n3 += 34411;
                        n3 += 22002;
                        n3 ^= 0xF6B3;
                        n3 += 59220;
                        n3 -= 48340;
                        n3 += 48372;
                        n3 ^= 0x77D7;
                        n3 += 18616;
                        cArray[i3] = (char)(n3 ^= 0x7ABB);
                    }
                    object5 = kotakbaz.rain.module.modules.render.F.A()[2] = new String(cArray);
                }
                f = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.module.modules.render.F.A()[3];
            if (object6 == null) {
                char[] cArray = "\ua1a4\ua1c0\ua1fa\ua26e\ua1aa\ua1a7\ua1aa\ua26e\ua1f9\ua1c2\ua1aa\ua1fa\ua270\ua1f9\ua184\ua185\ua185\ua15c\ua15b\ua156".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 ^= 0x9020;
                    n4 -= 7280;
                    n4 -= 1298;
                    n4 += 31378;
                    n4 -= 43876;
                    n4 ^= 0xA0F5;
                    n4 -= 29285;
                    n4 += 30726;
                    n4 ^= 0xA9A6;
                    n4 -= 22696;
                    n4 ^= 0x84DC;
                    cArray[i4] = (char)(n4 += 44925);
                }
                object6 = kotakbaz.rain.module.modules.render.F.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)f), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = g;
        if (g == null) {
            g = new Object[4];
            objectArray = g;
        }
        return objectArray;
    }

    public static void b() {
        G = new int[0x8330 ^ 0x82A0];
        kotakbaz.rain.module.modules.render.F.G[0x9595 ^ 0x9571] = 0xFFFF6AF5 ^ 0x9571;
        kotakbaz.rain.module.modules.render.F.G[0x60E2 ^ 0x604C] = 0xFFFF9FA3 ^ 0x604C;
        kotakbaz.rain.module.modules.render.F.G[0xD461 ^ 0xD529] = 0xD530 ^ 0xD529;
        kotakbaz.rain.module.modules.render.F.G[0xD7F3 ^ 0xD79E] = 0xFFFF2805 ^ 0xD79E;
        kotakbaz.rain.module.modules.render.F.G[0x2982 ^ 0x2925] = 0xFFFFD69D ^ 0x2925;
        kotakbaz.rain.module.modules.render.F.G[0xE1AA ^ 0xE0F4] = 0x65C0 ^ 0xE0F4;
        kotakbaz.rain.module.modules.render.F.G[0xD45E ^ 0xD43D] = 0xFFFF2B74 ^ 0xD43D;
        kotakbaz.rain.module.modules.render.F.G[0x7A67 ^ 0x7B1B] = 0x8EC5 ^ 0x7B1B;
        kotakbaz.rain.module.modules.render.F.G[0xAE0B ^ 0xAE53] = 0xAE69 ^ 0xAE53;
        kotakbaz.rain.module.modules.render.F.G[0x98EE ^ 0x9845] = 0x9867 ^ 0x9845;
        kotakbaz.rain.module.modules.render.F.G[0x143F ^ 0x141C] = 0x1445 ^ 0x141C;
        kotakbaz.rain.module.modules.render.F.G[0x3E01 ^ 0x3EBD] = 0xFFFFC17D ^ 0x3EBD;
        kotakbaz.rain.module.modules.render.F.G[0xCEC8 ^ 0xCFDD] = 0xFFFF3076 ^ 0xCFDD;
        kotakbaz.rain.module.modules.render.F.G[0x537D ^ 0x5383] = 0x53F0 ^ 0x5383;
        kotakbaz.rain.module.modules.render.F.G[0xE352 ^ 0xE25A] = 0xFFFF1D85 ^ 0xE25A;
        kotakbaz.rain.module.modules.render.F.G[0x8D64 ^ 0x8D72] = 0xFFFF72F8 ^ 0x8D72;
        kotakbaz.rain.module.modules.render.F.G[0x1A54 ^ 0x1BDA] = 0xB378 ^ 0x1BDA;
        kotakbaz.rain.module.modules.render.F.G[0x2F70 ^ 0x2FB2] = 0xFFFFD068 ^ 0x2FB2;
        kotakbaz.rain.module.modules.render.F.G[0x170D ^ 0x1792] = 0x17B4 ^ 0x1792;
        kotakbaz.rain.module.modules.render.F.G[0x276E ^ 0x27F9] = 0xFFFFD83C ^ 0x27F9;
        kotakbaz.rain.module.modules.render.F.G[0x64B8 ^ 0x6403] = 0x6435 ^ 0x6403;
        kotakbaz.rain.module.modules.render.F.G[0x7DA6 ^ 0x7D5E] = 0x7D5A ^ 0x7D5E;
        kotakbaz.rain.module.modules.render.F.G[0x327B ^ 0x3312] = 0xFFFF712A ^ 0x3312;
        kotakbaz.rain.module.modules.render.F.G[0xB502 ^ 0xB551] = 0xB50C ^ 0xB551;
        kotakbaz.rain.module.modules.render.F.G[0x54A5 ^ 0x5598] = 0x55BB ^ 0x5598;
        kotakbaz.rain.module.modules.render.F.G[0xCD13 ^ 0xCD79] = 0xFFFF32FF ^ 0xCD79;
        kotakbaz.rain.module.modules.render.F.G[0x10D8D ^ 0x10DB0] = 0x10D93 ^ 0x10DB0;
        kotakbaz.rain.module.modules.render.F.G[0xEEFD ^ 0xEE60] = 0xFFFF11CD ^ 0xEE60;
        kotakbaz.rain.module.modules.render.F.G[0x32AC ^ 0x332F] = 0xE280 ^ 0x332F;
        kotakbaz.rain.module.modules.render.F.G[0x3ED2 ^ 0x3F81] = 0x3F80 ^ 0x3F81;
        kotakbaz.rain.module.modules.render.F.G[0x5D64 ^ 0x5D0A] = 0x5D43 ^ 0x5D0A;
        kotakbaz.rain.module.modules.render.F.G[0x9EB3 ^ 0x9FF7] = 0xFFFF605D ^ 0x9FF7;
        kotakbaz.rain.module.modules.render.F.G[0x7F14 ^ 0x7FB0] = 0x7FCA ^ 0x7FB0;
        kotakbaz.rain.module.modules.render.F.G[0x3D28 ^ 0x3C67] = 0x3C66 ^ 0x3C67;
        kotakbaz.rain.module.modules.render.F.G[0x10149 ^ 0x101F9] = 0xFFFEFE2D ^ 0x101F9;
        kotakbaz.rain.module.modules.render.F.G[0xCE24 ^ 0xCF0F] = 0xCF2C ^ 0xCF0F;
        kotakbaz.rain.module.modules.render.F.G[0x65D ^ 0x629] = 0x653 ^ 0x629;
        kotakbaz.rain.module.modules.render.F.G[0x9E9F ^ 0x9EE0] = 0xFFFF615F ^ 0x9EE0;
        kotakbaz.rain.module.modules.render.F.G[0x177E ^ 0x1798] = 0xFFFFE86D ^ 0x1798;
        kotakbaz.rain.module.modules.render.F.G[0xCA43 ^ 0xCAFE] = 0xCA57 ^ 0xCAFE;
        kotakbaz.rain.module.modules.render.F.G[0xE5E8 ^ 0xE4B5] = 0xFFFF9E21 ^ 0xE4B5;
        kotakbaz.rain.module.modules.render.F.G[0x4F2E ^ 0x4FB0] = 0x4F8E ^ 0x4FB0;
        kotakbaz.rain.module.modules.render.F.G[0xF14D ^ 0xF06A] = 0xF054 ^ 0xF06A;
        kotakbaz.rain.module.modules.render.F.G[0x2FE7 ^ 0x2EAA] = 0xFFFFD116 ^ 0x2EAA;
        kotakbaz.rain.module.modules.render.F.G[0x62C5 ^ 0x6220] = 0xFFFF9DF2 ^ 0x6220;
        kotakbaz.rain.module.modules.render.F.G[0xFA04 ^ 0xFA76] = 0xFA6F ^ 0xFA76;
        kotakbaz.rain.module.modules.render.F.G[0xFB34 ^ 0xFA1C] = 0xFABE ^ 0xFA1C;
        kotakbaz.rain.module.modules.render.F.G[0x5149 ^ 0x5018] = 0x5018 ^ 0x5018;
        kotakbaz.rain.module.modules.render.F.G[0xDC9F ^ 0xDC32] = 0xDC6B ^ 0xDC32;
        kotakbaz.rain.module.modules.render.F.G[0xC8E6 ^ 0xC850] = 0xFFFF37A9 ^ 0xC850;
        kotakbaz.rain.module.modules.render.F.G[0x8DA9 ^ 0x8D3C] = 0x8D7E ^ 0x8D3C;
        kotakbaz.rain.module.modules.render.F.G[0xF5FE ^ 0xF4C6] = 0xF4CC ^ 0xF4C6;
        kotakbaz.rain.module.modules.render.F.G[0xC150 ^ 0xC067] = 0xFFFF3FC7 ^ 0xC067;
        kotakbaz.rain.module.modules.render.F.G[0x4DD2 ^ 0x4C9E] = 0xFFFFB34B ^ 0x4C9E;
        kotakbaz.rain.module.modules.render.F.G[0x7ADB ^ 0x7A99] = 0xFFFF8507 ^ 0x7A99;
        kotakbaz.rain.module.modules.render.F.G[0x9BEA ^ 0x9BDF] = 0xFFFF646C ^ 0x9BDF;
        kotakbaz.rain.module.modules.render.F.G[0xE998 ^ 0xE8E9] = 0xFFFFCA9F ^ 0xE8E9;
        kotakbaz.rain.module.modules.render.F.G[0x18 ^ 0x105] = 0xFFFFFE80 ^ 0x105;
        kotakbaz.rain.module.modules.render.F.G[0x5D46 ^ 0x5D82] = 0x5D84 ^ 0x5D82;
        kotakbaz.rain.module.modules.render.F.G[0x9CE6 ^ 0x9D82] = 0x306E ^ 0x9D82;
        kotakbaz.rain.module.modules.render.F.G[0x78E ^ 0x6CB] = 0x6F1 ^ 0x6CB;
        kotakbaz.rain.module.modules.render.F.G[0x4C92 ^ 0x4C1F] = 0xFFFFB3E2 ^ 0x4C1F;
        kotakbaz.rain.module.modules.render.F.G[0xC836 ^ 0xC817] = 0xC889 ^ 0xC817;
        kotakbaz.rain.module.modules.render.F.G[0x47DD ^ 0x47D9] = 0xFFFFB813 ^ 0x47D9;
        kotakbaz.rain.module.modules.render.F.G[0xA6FD ^ 0xA6E5] = 0xFFFF5943 ^ 0xA6E5;
        kotakbaz.rain.module.modules.render.F.G[0x6054 ^ 0x606C] = 0xFFFF9F8E ^ 0x606C;
        kotakbaz.rain.module.modules.render.F.G[0x2A31 ^ 0x2A92] = 0x2AB1 ^ 0x2A92;
        kotakbaz.rain.module.modules.render.F.G[0x462 ^ 0x4FE] = 0xFFFFFB92 ^ 0x4FE;
        kotakbaz.rain.module.modules.render.F.G[0x25FB ^ 0x25F1] = 0x25F9 ^ 0x25F1;
        kotakbaz.rain.module.modules.render.F.G[0x10BFA ^ 0x10B89] = 0xFFFEF436 ^ 0x10B89;
        kotakbaz.rain.module.modules.render.F.G[0xA0D1 ^ 0xA058] = 0xA023 ^ 0xA058;
        kotakbaz.rain.module.modules.render.F.G[0x4698 ^ 0x47FB] = 0xEA15 ^ 0x47FB;
        kotakbaz.rain.module.modules.render.F.G[0x34F ^ 0x255] = 0x22B ^ 0x255;
        kotakbaz.rain.module.modules.render.F.G[0x193E ^ 0x18BB] = 0xFFFF36F5 ^ 0x18BB;
        kotakbaz.rain.module.modules.render.F.G[0x5A2F ^ 0x5A31] = 0xFFFFA58A ^ 0x5A31;
        kotakbaz.rain.module.modules.render.F.G[0xBF86 ^ 0xBF3C] = 0xBF37 ^ 0xBF3C;
        kotakbaz.rain.module.modules.render.F.G[0x593A ^ 0x594F] = 0x5903 ^ 0x594F;
        kotakbaz.rain.module.modules.render.F.G[0x10377 ^ 0x10211] = 0x1AFFD ^ 0x10211;
        kotakbaz.rain.module.modules.render.F.G[0x72E8 ^ 0x7382] = 0xCE3F ^ 0x7382;
        kotakbaz.rain.module.modules.render.F.G[0x1734 ^ 0x17D7] = 0x1780 ^ 0x17D7;
        kotakbaz.rain.module.modules.render.F.G[0x7828 ^ 0x788E] = 0xFFFF8723 ^ 0x788E;
        kotakbaz.rain.module.modules.render.F.G[0x8508 ^ 0x85DB] = 0x6561 ^ 0x85DB;
        kotakbaz.rain.module.modules.render.F.G[0x69B4 ^ 0x6992] = 0x6985 ^ 0x6992;
        kotakbaz.rain.module.modules.render.F.G[0x5C47 ^ 0x5CC0] = 0x5CC2 ^ 0x5CC0;
        kotakbaz.rain.module.modules.render.F.G[0x35AD ^ 0x3572] = 0xFFFFCAE7 ^ 0x3572;
        kotakbaz.rain.module.modules.render.F.G[0xF5B3 ^ 0xF4A1] = 0xF4DF ^ 0xF4A1;
        kotakbaz.rain.module.modules.render.F.G[0xC3A7 ^ 0xC2A5] = 0xFFFF3D1D ^ 0xC2A5;
        kotakbaz.rain.module.modules.render.F.G[0x48BE ^ 0x48E7] = 0xFFFFB745 ^ 0x48E7;
        kotakbaz.rain.module.modules.render.F.G[0xF0DF ^ 0xF019] = 0xF01A ^ 0xF019;
        kotakbaz.rain.module.modules.render.F.G[0xAABA ^ 0xAA63] = 0xAA63 ^ 0xAA63;
        kotakbaz.rain.module.modules.render.F.G[0x7EAF ^ 0x7E5B] = 0xFFFF818C ^ 0x7E5B;
        kotakbaz.rain.module.modules.render.F.G[0xECE4 ^ 0xEDCB] = 0xFFFF1232 ^ 0xEDCB;
        kotakbaz.rain.module.modules.render.F.G[0xECD2 ^ 0xED95] = 0xFFFF122C ^ 0xED95;
        kotakbaz.rain.module.modules.render.F.G[0x2881 ^ 0x29E4] = 0x844C ^ 0x29E4;
        kotakbaz.rain.module.modules.render.F.G[0x5DE2 ^ 0x5CD9] = 0xFFFFA331 ^ 0x5CD9;
        kotakbaz.rain.module.modules.render.F.G[0x8A9B ^ 0x8A00] = 0xFFFF75D0 ^ 0x8A00;
        kotakbaz.rain.module.modules.render.F.G[0x509C ^ 0x5049] = 0x9372 ^ 0x5049;
        kotakbaz.rain.module.modules.render.F.G[0x2BAB ^ 0x2B04] = 0x2B1F ^ 0x2B04;
        kotakbaz.rain.module.modules.render.F.G[0xEEAC ^ 0xEEC9] = 0xEEAC ^ 0xEEC9;
        kotakbaz.rain.module.modules.render.F.G[0xF888 ^ 0xF988] = 0xF9B5 ^ 0xF988;
        kotakbaz.rain.module.modules.render.F.G[0xEA9D ^ 0xEA0E] = 0xFFFF15D0 ^ 0xEA0E;
        kotakbaz.rain.module.modules.render.F.G[0x4F29 ^ 0x4F3D] = 0xFFFFB0FE ^ 0x4F3D;
        kotakbaz.rain.module.modules.render.F.G[0x552F ^ 0x55FE] = 0x9699 ^ 0x55FE;
        kotakbaz.rain.module.modules.render.F.G[0x7F19 ^ 0x7F58] = 0x7F13 ^ 0x7F58;
        kotakbaz.rain.module.modules.render.F.G[0x104DD ^ 0x105E7] = 0xFFFEFA18 ^ 0x105E7;
        kotakbaz.rain.module.modules.render.F.G[0xD169 ^ 0xD1BB] = 0x2662 ^ 0xD1BB;
        kotakbaz.rain.module.modules.render.F.G[0x106AE ^ 0x107D4] = 0x14CAF ^ 0x107D4;
        kotakbaz.rain.module.modules.render.F.G[0xA0B1 ^ 0xA0FB] = 0xA0FE ^ 0xA0FB;
        kotakbaz.rain.module.modules.render.F.G[0x51EB ^ 0x51DB] = 0x51C8 ^ 0x51DB;
        kotakbaz.rain.module.modules.render.F.G[0x6AE6 ^ 0x6AB7] = 0xFFFF956E ^ 0x6AB7;
        kotakbaz.rain.module.modules.render.F.G[0x35EE ^ 0x34EB] = 0xFFFFCB44 ^ 0x34EB;
        kotakbaz.rain.module.modules.render.F.G[0x2A9B ^ 0x2BF9] = 0x77A9 ^ 0x2BF9;
        kotakbaz.rain.module.modules.render.F.G[0xED3 ^ 0xE32] = 0xE64 ^ 0xE32;
        kotakbaz.rain.module.modules.render.F.G[0x51A8 ^ 0x51BD] = 0xFFFFAE11 ^ 0x51BD;
        kotakbaz.rain.module.modules.render.F.G[0x9012 ^ 0x9116] = 0xFFFF6E9F ^ 0x9116;
        kotakbaz.rain.module.modules.render.F.G[0xE48 ^ 0xF56] = 0xF78 ^ 0xF56;
        kotakbaz.rain.module.modules.render.F.G[0x4F5B ^ 0x4E0C] = 0x9982 ^ 0x4E0C;
        kotakbaz.rain.module.modules.render.F.G[0x2EE9 ^ 0x2EE8] = 0xFFFFD14F ^ 0x2EE8;
        kotakbaz.rain.module.modules.render.F.G[0xBFD2 ^ 0xBFC8] = 0xBF82 ^ 0xBFC8;
        kotakbaz.rain.module.modules.render.F.G[0xC1F1 ^ 0xC0E2] = 0xFFFF3F52 ^ 0xC0E2;
        kotakbaz.rain.module.modules.render.F.G[0xCC9F ^ 0xCDCB] = 0xCDCB ^ 0xCDCB;
        kotakbaz.rain.module.modules.render.F.G[0x6012 ^ 0x6064] = 0x6031 ^ 0x6064;
        kotakbaz.rain.module.modules.render.F.G[0xD52C ^ 0xD531] = 0xFFFF2AB0 ^ 0xD531;
        kotakbaz.rain.module.modules.render.F.G[0x9224 ^ 0x927E] = 0x926C ^ 0x927E;
        kotakbaz.rain.module.modules.render.F.G[0x5673 ^ 0x57F4] = 0x7D6B ^ 0x57F4;
        kotakbaz.rain.module.modules.render.F.G[0x6BF8 ^ 0x6B28] = 0xFA3E ^ 0x6B28;
        kotakbaz.rain.module.modules.render.F.G[0xC67F ^ 0xC68C] = 0xFFFF3976 ^ 0xC68C;
        kotakbaz.rain.module.modules.render.F.G[0x45F2 ^ 0x4560] = 0xFFFFBA90 ^ 0x4560;
        kotakbaz.rain.module.modules.render.F.G[0x6BB2 ^ 0x6BBB] = 0xFFFF9407 ^ 0x6BBB;
        kotakbaz.rain.module.modules.render.F.G[0x16E4 ^ 0x1794] = 0xCA3D ^ 0x1794;
        kotakbaz.rain.module.modules.render.F.G[0x4D45 ^ 0x4D91] = 0x458A ^ 0x4D91;
        kotakbaz.rain.module.modules.render.F.G[0xC4C3 ^ 0xC42F] = 0xC44E ^ 0xC42F;
        kotakbaz.rain.module.modules.render.F.G[0x7BE4 ^ 0x7BE1] = 0xFFFF8433 ^ 0x7BE1;
        kotakbaz.rain.module.modules.render.F.G[0xAC93 ^ 0xAC9B] = 0xACE0 ^ 0xAC9B;
        kotakbaz.rain.module.modules.render.F.G[0x5AB5 ^ 0x5A8C] = 0xFFFFA561 ^ 0x5A8C;
        kotakbaz.rain.module.modules.render.F.G[0x3EC0 ^ 0x3E48] = 0x3E11 ^ 0x3E48;
        kotakbaz.rain.module.modules.render.F.G[0x1480 ^ 0x15B1] = 0xFFFFEA2D ^ 0x15B1;
        kotakbaz.rain.module.modules.render.F.G[0x4B94 ^ 0x4AB0] = 0x4AEA ^ 0x4AB0;
        kotakbaz.rain.module.modules.render.F.G[0xB17 ^ 0xB5B] = 0xFFFFF495 ^ 0xB5B;
        kotakbaz.rain.module.modules.render.F.G[0xE6C5 ^ 0xE7C4] = 0xE788 ^ 0xE7C4;
        kotakbaz.rain.module.modules.render.F.G[0xB5D7 ^ 0xB5E0] = 0xFFFF4A74 ^ 0xB5E0;
        kotakbaz.rain.module.modules.render.F.G[0xC0DE ^ 0xC1AD] = 0x8640 ^ 0xC1AD;
        kotakbaz.rain.module.modules.render.F.G[0xAB5C ^ 0xAA21] = 0xFFFFA042 ^ 0xAA21;
        kotakbaz.rain.module.modules.render.F.G[0x2919 ^ 0x2968] = 0x2933 ^ 0x2968;
        kotakbaz.rain.module.modules.render.F.G[0x21AD ^ 0x20D9] = 0x673F ^ 0x20D9;
        kotakbaz.rain.module.modules.render.F.G[0x364F ^ 0x370C] = 0xFFFFC88F ^ 0x370C;
        kotakbaz.rain.module.modules.render.F.G[0xC0CA ^ 0xC03F] = 0xC073 ^ 0xC03F;
        kotakbaz.rain.module.modules.render.F.G[0x8FB1 ^ 0x8F25] = 0xFFFF70AA ^ 0x8F25;
        kotakbaz.rain.module.modules.render.F.G[0x7397 ^ 0x732E] = 0x7331 ^ 0x732E;
        kotakbaz.rain.module.modules.render.F.G[0xC443 ^ 0xC417] = 0xC44F ^ 0xC417;
        kotakbaz.rain.module.modules.render.F.G[0xE087 ^ 0xE18C] = 0xE1E8 ^ 0xE18C;
        kotakbaz.rain.module.modules.render.F.G[0x47 ^ 0x16B] = 0xFFFFFEB5 ^ 0x16B;
        kotakbaz.rain.module.modules.render.F.G[0x10EC9 ^ 0x10EE9] = 0x10EE5 ^ 0x10EE9;
        kotakbaz.rain.module.modules.render.F.G[0x10A44 ^ 0x10B49] = 0xFFFEF4DB ^ 0x10B49;
        kotakbaz.rain.module.modules.render.F.G[0x638F ^ 0x6390] = 0xFFFF9C1F ^ 0x6390;
        kotakbaz.rain.module.modules.render.F.G[0xA9CE ^ 0xA847] = 0xFFFF7D6C ^ 0xA847;
        kotakbaz.rain.module.modules.render.F.G[0x8984 ^ 0x8982] = 0x89FF ^ 0x8982;
        kotakbaz.rain.module.modules.render.F.G[0x8900 ^ 0x895F] = 0xFFFF76D4 ^ 0x895F;
        kotakbaz.rain.module.modules.render.F.G[0x6350 ^ 0x636A] = 0xFFFF9C84 ^ 0x636A;
        kotakbaz.rain.module.modules.render.F.G[0xC9D0 ^ 0xC9DD] = 0xFFFF3613 ^ 0xC9DD;
        kotakbaz.rain.module.modules.render.F.G[0x10835 ^ 0x1097F] = 0x10975 ^ 0x1097F;
        kotakbaz.rain.module.modules.render.F.G[0x43CE ^ 0x42DF] = 0x42ED ^ 0x42DF;
        kotakbaz.rain.module.modules.render.F.G[0x81FA ^ 0x81A4] = 0xFFFF7E7B ^ 0x81A4;
        kotakbaz.rain.module.modules.render.F.G[0xD29D ^ 0xD28D] = 0xD2E5 ^ 0xD28D;
        kotakbaz.rain.module.modules.render.F.G[0x91F8 ^ 0x91BF] = 0x91A3 ^ 0x91BF;
        kotakbaz.rain.module.modules.render.F.G[0x90F7 ^ 0x90E5] = 0xFFFF6F18 ^ 0x90E5;
        kotakbaz.rain.module.modules.render.F.G[0x1A99 ^ 0x1A7E] = 0xFFFFE5B5 ^ 0x1A7E;
        kotakbaz.rain.module.modules.render.F.G[0x1015A ^ 0x10170] = 0x101EC ^ 0x10170;
        kotakbaz.rain.module.modules.render.F.G[0xCAF2 ^ 0xCAF0] = 0xCAB8 ^ 0xCAF0;
        kotakbaz.rain.module.modules.render.F.G[0x561 ^ 0x529] = 0x56C ^ 0x529;
        kotakbaz.rain.module.modules.render.F.G[0xBD96 ^ 0xBCC0] = 0x8FB5 ^ 0xBCC0;
        kotakbaz.rain.module.modules.render.F.G[0xB29A ^ 0xB251] = 0xB251 ^ 0xB251;
        kotakbaz.rain.module.modules.render.F.G[0x4AE1 ^ 0x4A6E] = 0x4A74 ^ 0x4A6E;
        kotakbaz.rain.module.modules.render.F.G[0xF9CE ^ 0xF932] = 0xFFFF06CE ^ 0xF932;
        kotakbaz.rain.module.modules.render.F.G[0xB65 ^ 0xBC0] = 0xB61 ^ 0xBC0;
        kotakbaz.rain.module.modules.render.F.G[0x10F8A ^ 0x10E83] = 0x10E90 ^ 0x10E83;
        kotakbaz.rain.module.modules.render.F.G[0xFAF4 ^ 0xFB8F] = 0xE57 ^ 0xFB8F;
        kotakbaz.rain.module.modules.render.F.G[0xFC19 ^ 0xFC28] = 0xFFFF0387 ^ 0xFC28;
        kotakbaz.rain.module.modules.render.F.G[0x4426 ^ 0x4491] = 0x44D5 ^ 0x4491;
        kotakbaz.rain.module.modules.render.F.G[0x4CEF ^ 0x4CD1] = 0x4CE6 ^ 0x4CD1;
        kotakbaz.rain.module.modules.render.F.G[0xD430 ^ 0xD44B] = 0xD45C ^ 0xD44B;
        kotakbaz.rain.module.modules.render.F.G[0xB69C ^ 0xB7CE] = 0xB7CF ^ 0xB7CE;
        kotakbaz.rain.module.modules.render.F.G[0x6A59 ^ 0x6A98] = 0xFFFF9567 ^ 0x6A98;
        kotakbaz.rain.module.modules.render.F.G[0xBDF5 ^ 0xBD1C] = 0xFFFF42C0 ^ 0xBD1C;
        kotakbaz.rain.module.modules.render.F.G[0x27F7 ^ 0x27AB] = 0xFFFFD84D ^ 0x27AB;
        kotakbaz.rain.module.modules.render.F.G[0x1364 ^ 0x13FD] = 0xFFFFEC35 ^ 0x13FD;
        kotakbaz.rain.module.modules.render.F.G[0x9B01 ^ 0x9B4A] = 0xFFFF64AE ^ 0x9B4A;
        kotakbaz.rain.module.modules.render.F.G[0x534F ^ 0x5331] = 0x45359 ^ 0x5331;
        kotakbaz.rain.module.modules.render.F.G[0x6F4E ^ 0x6F92] = 0xFFFF905D ^ 0x6F92;
        kotakbaz.rain.module.modules.render.F.G[0xF728 ^ 0xF6A4] = 0x5E06 ^ 0xF6A4;
        kotakbaz.rain.module.modules.render.F.G[0xA9E3 ^ 0xA8E5] = 0xA8A3 ^ 0xA8E5;
        kotakbaz.rain.module.modules.render.F.G[0xD87F ^ 0xD95E] = 0xFFFF26D9 ^ 0xD95E;
        kotakbaz.rain.module.modules.render.F.G[0xC148 ^ 0xC18B] = 0xFFFF3E67 ^ 0xC18B;
        kotakbaz.rain.module.modules.render.F.G[0xF333 ^ 0xF20F] = 0xFFFF0DE8 ^ 0xF20F;
        kotakbaz.rain.module.modules.render.F.G[0x811A ^ 0x81F0] = 0xFFFF7E4F ^ 0x81F0;
        kotakbaz.rain.module.modules.render.F.G[0xB5FE ^ 0xB513] = 0xB50A ^ 0xB513;
        kotakbaz.rain.module.modules.render.F.G[0x1C8D ^ 0x1C6F] = 0xFFFFE3E8 ^ 0x1C6F;
        kotakbaz.rain.module.modules.render.F.G[0xD957 ^ 0xD98F] = 0xA170 ^ 0xD98F;
        kotakbaz.rain.module.modules.render.F.G[0x10C04 ^ 0x10C15] = 0xFFFEF3E7 ^ 0x10C15;
        kotakbaz.rain.module.modules.render.F.G[0x86C ^ 0x860] = 0x8FE ^ 0x860;
        kotakbaz.rain.module.modules.render.F.G[0x543 ^ 0x5B8] = 0x5B4 ^ 0x5B8;
        kotakbaz.rain.module.modules.render.F.G[0xA8AE ^ 0xA889] = 0xA8C9 ^ 0xA889;
        kotakbaz.rain.module.modules.render.F.G[0x82F8 ^ 0x83E8] = 0x83C4 ^ 0x83E8;
        kotakbaz.rain.module.modules.render.F.G[0x1D71 ^ 0x1DFA] = 0xFFFFE230 ^ 0x1DFA;
        kotakbaz.rain.module.modules.render.F.G[0x67D2 ^ 0x67AA] = 0xFFFF9814 ^ 0x67AA;
        kotakbaz.rain.module.modules.render.F.G[0x95D2 ^ 0x9454] = 0x45F2 ^ 0x9454;
        kotakbaz.rain.module.modules.render.F.G[0x8E01 ^ 0x8E80] = 0x8E5C ^ 0x8E80;
        kotakbaz.rain.module.modules.render.F.G[0x8BD8 ^ 0x8BF0] = 0xFFFF7420 ^ 0x8BF0;
        kotakbaz.rain.module.modules.render.F.G[0xEA0A ^ 0xEB29] = 0xEB4E ^ 0xEB29;
        kotakbaz.rain.module.modules.render.F.G[0x2742 ^ 0x278A] = 0x278B ^ 0x278A;
        kotakbaz.rain.module.modules.render.F.G[0xAC6D ^ 0xAC0A] = 0xAC73 ^ 0xAC0A;
        kotakbaz.rain.module.modules.render.F.G[0xABF4 ^ 0xAB29] = 0xFFFF54D3 ^ 0xAB29;
        kotakbaz.rain.module.modules.render.F.G[0x982E ^ 0x9801] = 0x9836 ^ 0x9801;
        kotakbaz.rain.module.modules.render.F.G[0xF9F2 ^ 0xF884] = 0xBF62 ^ 0xF884;
        kotakbaz.rain.module.modules.render.F.G[0x9525 ^ 0x95D3] = 0xFFFF6A5A ^ 0x95D3;
        kotakbaz.rain.module.modules.render.F.G[0x70D6 ^ 0x71B8] = 0xEE78 ^ 0x71B8;
        kotakbaz.rain.module.modules.render.F.G[0xF603 ^ 0xF66C] = 0xF65B ^ 0xF66C;
        kotakbaz.rain.module.modules.render.F.G[0x5B9F ^ 0x5B98] = 0xFFFFA475 ^ 0x5B98;
        kotakbaz.rain.module.modules.render.F.G[0xE53 ^ 0xF3C] = 0xD29F ^ 0xF3C;
        kotakbaz.rain.module.modules.render.F.G[0x1223 ^ 0x137C] = 0x4F28 ^ 0x137C;
        kotakbaz.rain.module.modules.render.F.G[0x6153 ^ 0x6153] = 0x6146 ^ 0x6153;
        kotakbaz.rain.module.modules.render.F.G[0x598F ^ 0x592D] = 0x5974 ^ 0x592D;
        kotakbaz.rain.module.modules.render.F.G[0xA721 ^ 0xA72F] = 0xA743 ^ 0xA72F;
        kotakbaz.rain.module.modules.render.F.G[0xBC8E ^ 0xBDDE] = 0xBDDC ^ 0xBDDE;
        kotakbaz.rain.module.modules.render.F.G[0x8B47 ^ 0x8A62] = 0x8A5C ^ 0x8A62;
        kotakbaz.rain.module.modules.render.F.G[0x70D2 ^ 0x7058] = 0xFFFF8FF8 ^ 0x7058;
        kotakbaz.rain.module.modules.render.F.G[0xFDA2 ^ 0xFC96] = 0xFFFF033E ^ 0xFC96;
        kotakbaz.rain.module.modules.render.F.G[0x792D ^ 0x795D] = 0x7919 ^ 0x795D;
        kotakbaz.rain.module.modules.render.F.G[0x10B6A ^ 0x10A21] = 0xFFFEF5D1 ^ 0x10A21;
        kotakbaz.rain.module.modules.render.F.G[0x5FD2 ^ 0x5F48] = 0x5F40 ^ 0x5F48;
        kotakbaz.rain.module.modules.render.F.G[0x3482 ^ 0x34C4] = 0xFFFFCB07 ^ 0x34C4;
        kotakbaz.rain.module.modules.render.F.G[0xED8D ^ 0xEDDD] = 0xFFFF126F ^ 0xEDDD;
        kotakbaz.rain.module.modules.render.F.G[0xC2FE ^ 0xC3F1] = 0xFFFF3C13 ^ 0xC3F1;
        kotakbaz.rain.module.modules.render.F.G[0x6901 ^ 0x681A] = 0x6825 ^ 0x681A;
        kotakbaz.rain.module.modules.render.F.G[0x2AB2 ^ 0x2A7D] = 0x55EC ^ 0x2A7D;
        kotakbaz.rain.module.modules.render.F.G[0xCCF2 ^ 0xCCD0] = 0xCCF5 ^ 0xCCD0;
        kotakbaz.rain.module.modules.render.F.G[0x9190 ^ 0x9114] = 0x91DA ^ 0x9114;
        kotakbaz.rain.module.modules.render.F.G[0x79E8 ^ 0x7950] = 0x7907 ^ 0x7950;
        kotakbaz.rain.module.modules.render.F.G[0xAA64 ^ 0xAACD] = 0xAA9F ^ 0xAACD;
        kotakbaz.rain.module.modules.render.F.G[0x10C4D ^ 0x10D2A] = 0x1B09A ^ 0x10D2A;
        kotakbaz.rain.module.modules.render.F.G[0x32D ^ 0x350] = 0xFFFFFC8A ^ 0x350;
        kotakbaz.rain.module.modules.render.F.G[0xE98F ^ 0xE8C6] = 0xFFFF1729 ^ 0xE8C6;
        kotakbaz.rain.module.modules.render.F.G[0x9F6C ^ 0x9E5C] = 0x9E67 ^ 0x9E5C;
        kotakbaz.rain.module.modules.render.F.G[0x973 ^ 0x9C6] = 0xFFFFF65F ^ 0x9C6;
        kotakbaz.rain.module.modules.render.F.G[0xF60F ^ 0xF675] = 0xFFFF09AC ^ 0xF675;
        kotakbaz.rain.module.modules.render.F.G[0x84E1 ^ 0x85CB] = 0xFFFF7A58 ^ 0x85CB;
        kotakbaz.rain.module.modules.render.F.G[0x90F3 ^ 0x9075] = 0xFFFF6FF2 ^ 0x9075;
        kotakbaz.rain.module.modules.render.F.G[0x4968 ^ 0x49B6] = 0xFFFFB60D ^ 0x49B6;
        kotakbaz.rain.module.modules.render.F.G[0xEFB1 ^ 0xEE83] = 0xFFFF1138 ^ 0xEE83;
        kotakbaz.rain.module.modules.render.F.G[0xBFF8 ^ 0xBF93] = 0xBFFA ^ 0xBF93;
        kotakbaz.rain.module.modules.render.F.G[0x7804 ^ 0x7852] = 0x784F ^ 0x7852;
        kotakbaz.rain.module.modules.render.F.G[0x3F1F ^ 0x3E39] = 0x3E39 ^ 0x3E39;
        kotakbaz.rain.module.modules.render.F.G[0x4D96 ^ 0x4DA2] = 0x4D99 ^ 0x4DA2;
        kotakbaz.rain.module.modules.render.F.G[0x14A0 ^ 0x148C] = 0xFFFFEB19 ^ 0x148C;
        kotakbaz.rain.module.modules.render.F.G[0xB3B4 ^ 0xB38B] = 0xFFFF4C5B ^ 0xB38B;
        kotakbaz.rain.module.modules.render.F.G[0x83AC ^ 0x83A7] = 0xFFFF7C15 ^ 0x83A7;
        kotakbaz.rain.module.modules.render.F.G[0x8470 ^ 0x8416] = 0x8403 ^ 0x8416;
        kotakbaz.rain.module.modules.render.F.G[0x6D13 ^ 0x6C10] = 0x6C0C ^ 0x6C10;
        kotakbaz.rain.module.modules.render.F.G[0xE483 ^ 0xE4E2] = 0xFFFF1B78 ^ 0xE4E2;
        kotakbaz.rain.module.modules.render.F.G[0x49D ^ 0x5A8] = 0xFFFFFA34 ^ 0x5A8;
        kotakbaz.rain.module.modules.render.F.G[0x3667 ^ 0x3726] = 0x3711 ^ 0x3726;
        kotakbaz.rain.module.modules.render.F.G[0x9881 ^ 0x9892] = 0xFFFF6774 ^ 0x9892;
        kotakbaz.rain.module.modules.render.F.G[0xC459 ^ 0xC41C] = 0xC465 ^ 0xC41C;
        kotakbaz.rain.module.modules.render.F.G[0xFBD6 ^ 0xFB58] = 0xFFFF0485 ^ 0xFB58;
        kotakbaz.rain.module.modules.render.F.G[0x4F07 ^ 0x4E39] = 0xFFFFB1AE ^ 0x4E39;
        kotakbaz.rain.module.modules.render.F.G[0x1078C ^ 0x10764] = 0x1076E ^ 0x10764;
        kotakbaz.rain.module.modules.render.F.G[0xDAE5 ^ 0xDBC5] = 0xDB92 ^ 0xDBC5;
        kotakbaz.rain.module.modules.render.F.G[0x10C80 ^ 0x10D99] = 0xFFFEF258 ^ 0x10D99;
        kotakbaz.rain.module.modules.render.F.G[0x1E59 ^ 0x1EE6] = 0x1ED2 ^ 0x1EE6;
        kotakbaz.rain.module.modules.render.F.G[0xE266 ^ 0xE311] = 0xA864 ^ 0xE311;
        kotakbaz.rain.module.modules.render.F.G[0x3AF4 ^ 0x3BAF] = 0xBE9C ^ 0x3BAF;
        kotakbaz.rain.module.modules.render.F.G[0x7468 ^ 0x7504] = 0xEAC4 ^ 0x7504;
        kotakbaz.rain.module.modules.render.F.G[0xAE6E ^ 0xAF5D] = 0xFFFF5087 ^ 0xAF5D;
        kotakbaz.rain.module.modules.render.F.G[0x44A4 ^ 0x44AB] = 0xFFFBBB21 ^ 0x44AB;
        kotakbaz.rain.module.modules.render.F.G[0xA628 ^ 0xA73F] = 0xA718 ^ 0xA73F;
        kotakbaz.rain.module.modules.render.F.G[0x70F ^ 0x7C8] = 0x7C8 ^ 0x7C8;
        kotakbaz.rain.module.modules.render.F.G[0xAEA2 ^ 0xAFB6] = 0xAFB2 ^ 0xAFB6;
        kotakbaz.rain.module.modules.render.F.G[0x97CA ^ 0x97BD] = 0x97A5 ^ 0x97BD;
        kotakbaz.rain.module.modules.render.F.G[0x6F3D ^ 0x6E43] = 0x9B9D ^ 0x6E43;
        kotakbaz.rain.module.modules.render.F.G[0xBF95 ^ 0xBF64] = 0xBF2A ^ 0xBF64;
        kotakbaz.rain.module.modules.render.F.G[0x51D9 ^ 0x5184] = 0xFFFFAE2D ^ 0x5184;
        kotakbaz.rain.module.modules.render.F.G[0xEE34 ^ 0xEF22] = 0xEF5A ^ 0xEF22;
        kotakbaz.rain.module.modules.render.F.G[0x8EAD ^ 0x8E3D] = 0x8EA9 ^ 0x8E3D;
        kotakbaz.rain.module.modules.render.F.G[0x1344 ^ 0x1229] = 0x8DE1 ^ 0x1229;
        kotakbaz.rain.module.modules.render.F.G[0x3689 ^ 0x3701] = 0x1D9D ^ 0x3701;
        kotakbaz.rain.module.modules.render.F.G[0xA437 ^ 0xA4BB] = 0xFFFF5B6E ^ 0xA4BB;
        kotakbaz.rain.module.modules.render.F.G[0xEC48 ^ 0xED11] = 0xFFFFC528 ^ 0xED11;
        kotakbaz.rain.module.modules.render.F.G[0x4577 ^ 0x444E] = 0xFFFFBBDD ^ 0x444E;
        kotakbaz.rain.module.modules.render.F.G[0xDA10 ^ 0xDACB] = 0xFFFF2514 ^ 0xDACB;
        kotakbaz.rain.module.modules.render.F.G[0xA69E ^ 0xA6B5] = 0xFFFF595A ^ 0xA6B5;
        kotakbaz.rain.module.modules.render.F.G[0xF826 ^ 0xF84E] = 0xFFFF07DB ^ 0xF84E;
        kotakbaz.rain.module.modules.render.F.G[0xC4FD ^ 0xC5CB] = 0xC5FF ^ 0xC5CB;
        kotakbaz.rain.module.modules.render.F.G[0x485B ^ 0x487E] = 0x486A ^ 0x487E;
        kotakbaz.rain.module.modules.render.F.G[0xFAF3 ^ 0xFBD1] = 0xFFFF0400 ^ 0xFBD1;
        kotakbaz.rain.module.modules.render.F.G[0x1D69 ^ 0x1D20] = 0x1D00 ^ 0x1D20;
        kotakbaz.rain.module.modules.render.F.G[0xDE25 ^ 0xDE4C] = 0xDE7D ^ 0xDE4C;
        kotakbaz.rain.module.modules.render.F.G[0xD80 ^ 0xDC4] = 0xFFFFF27A ^ 0xDC4;
        kotakbaz.rain.module.modules.render.F.G[0xF557 ^ 0xF5E3] = 0xFFFF0A43 ^ 0xF5E3;
        kotakbaz.rain.module.modules.render.F.G[0x2D20 ^ 0x2DDF] = 0x2D89 ^ 0x2DDF;
        kotakbaz.rain.module.modules.render.F.G[0x10B57 ^ 0x10ADC] = 0x1A27B ^ 0x10ADC;
        kotakbaz.rain.module.modules.render.F.G[0x75DD ^ 0x75C4] = 0xFFFF8A08 ^ 0x75C4;
        kotakbaz.rain.module.modules.render.F.G[0xC9EB ^ 0xC8C6] = 0xC8E9 ^ 0xC8C6;
        kotakbaz.rain.module.modules.render.F.G[0x6E28 ^ 0x6E54] = 0xFFFF91B9 ^ 0x6E54;
        kotakbaz.rain.module.modules.render.F.G[0x9006 ^ 0x9146] = 0xFFFF6E8C ^ 0x9146;
        kotakbaz.rain.module.modules.render.F.G[0x6D30 ^ 0x6D9C] = 0x6DAA ^ 0x6D9C;
        kotakbaz.rain.module.modules.render.F.G[0x77E9 ^ 0x7710] = 0xFFFF88FF ^ 0x7710;
        kotakbaz.rain.module.modules.render.F.G[0x5EDE ^ 0x5E5E] = 0xFFFFA189 ^ 0x5E5E;
        kotakbaz.rain.module.modules.render.F.G[0xCAA1 ^ 0xCAD8] = 0xCABC ^ 0xCAD8;
        kotakbaz.rain.module.modules.render.F.G[0x4647 ^ 0x46F6] = 0xFFFFB928 ^ 0x46F6;
        kotakbaz.rain.module.modules.render.F.G[0xBCE4 ^ 0xBC7C] = 0xBC21 ^ 0xBC7C;
        kotakbaz.rain.module.modules.render.F.G[0x3686 ^ 0x37FF] = 0x7CF5 ^ 0x37FF;
        kotakbaz.rain.module.modules.render.F.G[0xC9DA ^ 0xC94B] = 0xFFFF36CD ^ 0xC94B;
        kotakbaz.rain.module.modules.render.F.G[0xA633 ^ 0xA752] = 0xFB4F ^ 0xA752;
        kotakbaz.rain.module.modules.render.F.G[0x4DFD ^ 0x4C7C] = 0xFFFF6F7A ^ 0x4C7C;
        kotakbaz.rain.module.modules.render.F.G[0x758C ^ 0x75D9] = 0x75BC ^ 0x75D9;
        kotakbaz.rain.module.modules.render.F.G[0x10BBA ^ 0x10AF4] = 0x10AE8 ^ 0x10AF4;
        kotakbaz.rain.module.modules.render.F.G[0x940E ^ 0x9415] = 0xFFFF6BF2 ^ 0x9415;
        kotakbaz.rain.module.modules.render.F.G[0x9EF1 ^ 0x9E91] = 0x49E4E ^ 0x9E91;
        kotakbaz.rain.module.modules.render.F.G[0x1D61 ^ 0x1DF7] = 0x1D52 ^ 0x1DF7;
        kotakbaz.rain.module.modules.render.F.G[0xD164 ^ 0xD184] = 0xFFFF2E75 ^ 0xD184;
        kotakbaz.rain.module.modules.render.F.G[0x382A ^ 0x3819] = 0x38B1 ^ 0x3819;
        kotakbaz.rain.module.modules.render.F.G[0xE537 ^ 0xE59F] = 0xFFFF1A4B ^ 0xE59F;
        kotakbaz.rain.module.modules.render.F.G[0x3910 ^ 0x390C] = 0x394A ^ 0x390C;
        kotakbaz.rain.module.modules.render.F.G[0x87ED ^ 0x8669] = 0x57CF ^ 0x8669;
        kotakbaz.rain.module.modules.render.F.G[0x7229 ^ 0x72C2] = 0xFFFF8D7F ^ 0x72C2;
        kotakbaz.rain.module.modules.render.F.G[0x1024F ^ 0x102FD] = 0x102F0 ^ 0x102FD;
        kotakbaz.rain.module.modules.render.F.G[0xA4E6 ^ 0xA4B4] = 0xA4A2 ^ 0xA4B4;
        kotakbaz.rain.module.modules.render.F.G[0xFB40 ^ 0xFA4C] = 0xFA51 ^ 0xFA4C;
        kotakbaz.rain.module.modules.render.F.G[0xF135 ^ 0xF1E3] = 0xB62E ^ 0xF1E3;
        kotakbaz.rain.module.modules.render.F.G[0x1F60 ^ 0x1FE5] = 0x1FD0 ^ 0x1FE5;
        kotakbaz.rain.module.modules.render.F.G[0x9892 ^ 0x9848] = 0x9878 ^ 0x9848;
        kotakbaz.rain.module.modules.render.F.G[0xA5B5 ^ 0xA55B] = 0xA522 ^ 0xA55B;
        kotakbaz.rain.module.modules.render.F.G[0x10631 ^ 0x106F4] = 0x106C2 ^ 0x106F4;
        kotakbaz.rain.module.modules.render.F.G[0x2515 ^ 0x25B4] = 0x25BD ^ 0x25B4;
        kotakbaz.rain.module.modules.render.F.G[0x12EC ^ 0x12BB] = 0xFFFFED25 ^ 0x12BB;
        kotakbaz.rain.module.modules.render.F.G[0x5225 ^ 0x533A] = 0x53EB ^ 0x533A;
        kotakbaz.rain.module.modules.render.F.G[0xD43F ^ 0xD404] = 0xFFFF2BDF ^ 0xD404;
        kotakbaz.rain.module.modules.render.F.G[0xDCBE ^ 0xDCFE] = 0xFFFF2319 ^ 0xDCFE;
        kotakbaz.rain.module.modules.render.F.G[0xAFB8 ^ 0xAF95] = 0xFFFF50E1 ^ 0xAF95;
        kotakbaz.rain.module.modules.render.F.G[0x1628 ^ 0x16D8] = 0xFFFFE960 ^ 0x16D8;
        kotakbaz.rain.module.modules.render.F.G[0xF7B0 ^ 0xF6DB] = 0x691A ^ 0xF6DB;
        kotakbaz.rain.module.modules.render.F.G[0xB6FC ^ 0xB6FF] = 0xFFFF496F ^ 0xB6FF;
        kotakbaz.rain.module.modules.render.F.G[0x107BE ^ 0x10681] = 0xFFFEF907 ^ 0x10681;
        kotakbaz.rain.module.modules.render.F.G[0x10BC6 ^ 0x10AC1] = 0x10A95 ^ 0x10AC1;
        kotakbaz.rain.module.modules.render.F.G[0x187 ^ 0xA] = 0xA88C ^ 0xA;
        kotakbaz.rain.module.modules.render.F.G[0x5656 ^ 0x57D9] = 0x523E ^ 0x57D9;
        kotakbaz.rain.module.modules.render.F.G[0x7D35 ^ 0x7DFC] = 0x7DFC ^ 0x7DFC;
        kotakbaz.rain.module.modules.render.F.G[0x55B ^ 0x5B4] = 0x592 ^ 0x5B4;
        kotakbaz.rain.module.modules.render.F.G[0x1009C ^ 0x10066] = 0x1007B ^ 0x10066;
        kotakbaz.rain.module.modules.render.F.G[0x10681 ^ 0x107D4] = 0x134B1 ^ 0x107D4;
        kotakbaz.rain.module.modules.render.F.G[0xAC0D ^ 0xACC0] = 0xAD6C ^ 0xACC0;
        kotakbaz.rain.module.modules.render.F.G[0x10DE ^ 0x11D0] = 0x11E0 ^ 0x11D0;
        kotakbaz.rain.module.modules.render.F.G[0x80DE ^ 0x81C6] = 0x8189 ^ 0x81C6;
        kotakbaz.rain.module.modules.render.F.G[0x4FEB ^ 0x4F1C] = 0xFFFFB0B9 ^ 0x4F1C;
        kotakbaz.rain.module.modules.render.F.G[0x7DD2 ^ 0x7CB2] = 0x20E2 ^ 0x7CB2;
        kotakbaz.rain.module.modules.render.F.G[0x854C ^ 0x8462] = 0xFFFF7BB7 ^ 0x8462;
        kotakbaz.rain.module.modules.render.F.G[0x599A ^ 0x581A] = 0x84C5 ^ 0x581A;
        kotakbaz.rain.module.modules.render.F.G[0x7621 ^ 0x761D] = 0x770E ^ 0x761D;
        kotakbaz.rain.module.modules.render.F.G[0x5F5E ^ 0x5E42] = 0xFFFFA1E1 ^ 0x5E42;
        kotakbaz.rain.module.modules.render.F.G[0x655D ^ 0x65DF] = 0x659B ^ 0x65DF;
        kotakbaz.rain.module.modules.render.F.G[0xD15D ^ 0xD19D] = 0xFFFF2E6F ^ 0xD19D;
        kotakbaz.rain.module.modules.render.F.G[0xEA1D ^ 0xEA7F] = 0xEA06 ^ 0xEA7F;
        kotakbaz.rain.module.modules.render.F.G[0x9FC4 ^ 0x9F13] = 0x1A3D ^ 0x9F13;
        kotakbaz.rain.module.modules.render.F.G[0xF001 ^ 0xF025] = 0xF006 ^ 0xF025;
        kotakbaz.rain.module.modules.render.F.G[0x10CE8 ^ 0x10C5B] = 0xFFFEF389 ^ 0x10C5B;
        kotakbaz.rain.module.modules.render.F.G[0xE265 ^ 0xE209] = 0xE235 ^ 0xE209;
        kotakbaz.rain.module.modules.render.F.G[0xBA64 ^ 0xBB0C] = 0x6B1 ^ 0xBB0C;
        kotakbaz.rain.module.modules.render.F.G[0x59C4 ^ 0x5987] = 0x5987 ^ 0x5987;
        kotakbaz.rain.module.modules.render.F.G[0x10416 ^ 0x10554] = 0xFFFEFAA4 ^ 0x10554;
        kotakbaz.rain.module.modules.render.F.G[0x728E ^ 0x7224] = 0xFFFF8DA1 ^ 0x7224;
        kotakbaz.rain.module.modules.render.F.G[0x11C7 ^ 0x10CD] = 0xFFFFEF14 ^ 0x10CD;
        kotakbaz.rain.module.modules.render.F.G[0xDE1 ^ 0xD2D] = 0xD2D ^ 0xD2D;
        kotakbaz.rain.module.modules.render.F.G[0xA278 ^ 0xA324] = 0x2610 ^ 0xA324;
        kotakbaz.rain.module.modules.render.F.G[0xEA01 ^ 0xEA28] = 0xFFFF1598 ^ 0xEA28;
        kotakbaz.rain.module.modules.render.F.G[0x5A4A ^ 0x5B38] = 0x8691 ^ 0x5B38;
        kotakbaz.rain.module.modules.render.F.G[0x7FE1 ^ 0x7EC8] = 0xFFFF8107 ^ 0x7EC8;
        kotakbaz.rain.module.modules.render.F.G[0xA43A ^ 0xA562] = 0x72E4 ^ 0xA562;
        kotakbaz.rain.module.modules.render.F.G[0x3DAE ^ 0x3D53] = 0x3D7B ^ 0x3D53;
        kotakbaz.rain.module.modules.render.F.G[0xF7C7 ^ 0xF69D] = 0x211B ^ 0xF69D;
        kotakbaz.rain.module.modules.render.F.G[0x8B04 ^ 0x8B49] = 0xFFFF74BF ^ 0x8B49;
        kotakbaz.rain.module.modules.render.F.G[0xE055 ^ 0xE09F] = 0xE09D ^ 0xE09F;
        kotakbaz.rain.module.modules.render.F.G[0xC446 ^ 0xC4E6] = 0xC4B1 ^ 0xC4E6;
        kotakbaz.rain.module.modules.render.F.G[0x7974 ^ 0x793A] = 0x7975 ^ 0x793A;
        kotakbaz.rain.module.modules.render.F.G[0x3615 ^ 0x3627] = 0xFFFFC985 ^ 0x3627;
        kotakbaz.rain.module.modules.render.F.G[0x9F24 ^ 0x9F33] = 0x9F35 ^ 0x9F33;
        kotakbaz.rain.module.modules.render.F.G[0xA567 ^ 0xA595] = 0xFFFF5A68 ^ 0xA595;
        kotakbaz.rain.module.modules.render.F.G[0x4696 ^ 0x4658] = 0x4D08 ^ 0x4658;
        kotakbaz.rain.module.modules.render.F.G[0xF2FF ^ 0xF2D1] = 0xF2A4 ^ 0xF2D1;
        kotakbaz.rain.module.modules.render.F.G[0xCC70 ^ 0xCC46] = 0xCCEC ^ 0xCC46;
        kotakbaz.rain.module.modules.render.F.G[0x8AE4 ^ 0x8ABF] = 0x8AB7 ^ 0x8ABF;
        kotakbaz.rain.module.modules.render.F.G[0xCCD9 ^ 0xCDA6] = 0x1175 ^ 0xCDA6;
        kotakbaz.rain.module.modules.render.F.G[0x165D ^ 0x1639] = 0xFFFFE9B7 ^ 0x1639;
        kotakbaz.rain.module.modules.render.F.G[0x2165 ^ 0x20EF] = 0xA73 ^ 0x20EF;
        kotakbaz.rain.module.modules.render.F.G[0xB752 ^ 0xB6D0] = 0x6A0F ^ 0xB6D0;
        kotakbaz.rain.module.modules.render.F.G[0xA261 ^ 0xA327] = 0xFFFF5CC7 ^ 0xA327;
        kotakbaz.rain.module.modules.render.F.G[0x1B47 ^ 0x1BC4] = 0xFFFFE44C ^ 0x1BC4;
        kotakbaz.rain.module.modules.render.F.G[0xBA95 ^ 0xBBE0] = 0xFFFF03DD ^ 0xBBE0;
        kotakbaz.rain.module.modules.render.F.G[0x8D7A ^ 0x8DC4] = 0xFFFF724F ^ 0x8DC4;
        kotakbaz.rain.module.modules.render.F.G[0x7D6D ^ 0x7C15] = 0x376E ^ 0x7C15;
        kotakbaz.rain.module.modules.render.F.G[0x4F2E ^ 0x4F61] = 0xFFFFB0E2 ^ 0x4F61;
    }
}

