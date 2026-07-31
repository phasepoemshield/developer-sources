/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1921
 *  net.minecraft.class_239
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_3966
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
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
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.events.B;
import kotakbaz.rain.event.events.d_0;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.render.O;
import kotakbaz.rain.module.modules.render.P;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_1921;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3966;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import net.minecraft.client.render.RainRenderLayers;
import org.jetbrains.annotations.NotNull;
import org.joml.Quaternionfc;
import sweetie.evaware.flora.api.Commando;

/*
 * Renamed from kotakbaz.rain.module.modules.render.v
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001.B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0003J/\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010(R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00110*j\b\u0012\u0004\u0012\u00020\u0011`+8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b,\u0010-\u00a8\u0006/"}, d2={"Lkotakbaz/rain/module/modules/render/HitParticlesModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/AttackEvent;", "event", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "updateParticles", "Lnet/minecraft/class_4588;", "buffer", "Lkotakbaz/rain/module/modules/render/HitParticlesModule$BurstParticle;", "particle", "Lnet/minecraft/class_243;", "cameraPos", "renderParticle", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/HitParticlesModule$BurstParticle;Lnet/minecraft/class_243;)V", "Lnet/minecraft/class_2960;", "selectedTexture", "()Lnet/minecraft/class_2960;", "Ljava/awt/Color;", "selectedColor", "()Ljava/awt/Color;", "Lkotakbaz/rain/module/setting/ModeSetting;", "particleType", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "particleColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "count", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "size", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "particles", "Ljava/util/ArrayList;", "BurstParticle", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nHitParticlesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitParticlesModule.kt\nkotakbaz/rain/module/modules/render/HitParticlesModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,226:1\n1915#2,2:227\n*S KotlinDebug\n*F\n+ 1 HitParticlesModule.kt\nkotakbaz/rain/module/modules/render/HitParticlesModule\n*L\n122#1:227,2\n*E\n"})
public final class v_0
extends a_0 {
    @NotNull
    public static final v_0 INSTANCE;
    @NotNull
    private static final kotakbaz.rain.module.setting.c a;
    @NotNull
    private static final c A;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.B b;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 B;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 c;
    @NotNull
    private static final ArrayList<O> C;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    private v_0() {
        int n = F[0];
        n += F[1];
        int n2 = F[3];
        n2 -= F[4];
        int n3 = F[6];
        n3 ^= F[7];
        super((String)d[n ^= F[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)d[n2 += F[5]] + (String)d[n3 -= F[8]]);
    }

    @Override
    public void onEnable() {
        C.clear();
    }

    @Override
    public void onDisable() {
        C.clear();
    }

    @Commando
    public final void onAttack(@NotNull d_0 d_02) {
        long l = 4326647556749679783L;
        long l2 = 4336692500809679924L;
        long l3 = 9075949450902678423L;
        long l4 = 1541128154629252101L;
        long l5 = 4430547526009254122L;
        long l6 = -3516943429344928213L;
        long l7 = -7103076726568075021L;
        long l8 = -7927375126521259260L;
        int n = F[9];
        n ^= F[10];
        Intrinsics.checkNotNullParameter(d_02, (String)d[n += F[11]]);
        if (!this.isEnabled()) {
            return;
        }
        if (b_0.getMc().field_1724 == null || b_0.getMc().field_1687 == null) {
            return;
        }
        class_1297 class_12972 = d_02.getEntity();
        class_239 class_2392 = b_0.getMc().field_1765;
        class_243 class_2432 = class_2392 instanceof class_3966 ? (Intrinsics.areEqual(((class_3966)class_2392).method_17782(), class_12972) ? ((class_3966)class_2392).method_17784() : class_12972.method_19538().method_1031(0.0, (double)class_12972.method_17682() * Double.longBitsToDouble(0x12675C4F07E62FF0L ^ 0x2D875C4F07E62FF0L), 0.0)) : class_12972.method_19538().method_1031(0.0, (double)class_12972.method_17682() * Double.longBitsToDouble(0x6B2A7863F21D518EL ^ 0x54CA7863F21D518EL), 0.0);
        int n2 = F[12];
        n2 ^= F[13];
        long l9 = l6;
        int n3 = F[15];
        n3 += F[16];
        l6 = l9 ^ ((long)Math.max(n2 -= F[14], (int)((Number)B.getValue()).floatValue()) ^ l9) & -1L >>> (n3 -= F[17]);
        long l10 = l8;
        int n4 = F[18];
        n4 ^= F[19];
        l8 = l10 ^ (0L ^ l10) & -1L >>> (n4 ^= F[20]);
        while ((int)l8 < (int)l6) {
            double d2;
            double d3;
            long l11 = l7;
            int n5 = F[21];
            n5 -= F[22];
            l7 = l11 ^ ((long)((int)l8) ^ l11) & -1L >>> (n5 -= F[23]);
            long l12 = l8;
            int n6 = F[24];
            n6 -= F[25];
            l8 = l12 ^ (0L ^ l12) & -1L << (n6 ^= F[26]);
            double d4 = Random.Default.nextDouble() * Double.longBitsToDouble(0xC90D3A45E43CEE24L ^ 0x89041BBEB078C33CL) * Double.longBitsToDouble(0x1487893437F318D2L ^ 0x5487893437F318D2L);
            double d5 = Math.acos(Double.longBitsToDouble(0xE218238DE6333338L ^ 0xA218238DE6333338L) * Random.Default.nextDouble() - 1.0);
            double d6 = Double.longBitsToDouble(0xDA581BF06AA2855L ^ 0x3276B28C35991B66L);
            float f2 = 0.03f;
            double d7 = (Random.Default.nextDouble() * Double.longBitsToDouble(0xD8CB78794E287A6AL ^ 0x98CB78794E287A6AL) - 1.0) * (double)f2 * d6;
            double d8 = 1.0 + (Random.Default.nextDouble() * Double.longBitsToDouble(0x95B42B63AF107B34L ^ 0xAA542B63AF107B34L) - Double.longBitsToDouble(0x88E3461B8E4FF85DL ^ 0xB733461B8E4FF85DL));
            double d9 = Math.sin(d5) * Math.cos(d4) * (double)f2 * d8 * Double.longBitsToDouble(0x485F5CF1F1CC227DL ^ 0x77BF5CF1F1CC227DL);
            double d10 = Math.hypot(d9, d3 = Math.sin(d5) * Math.sin(d4) * (double)f2 * d8 * Double.longBitsToDouble(0x993245C629B49D23L ^ 0xA6D245C629B49D23L));
            if (d10 > Double.longBitsToDouble(0x772BAFE5C68A964AL ^ 0x499B6912663F7BC7L)) {
                d2 = Double.longBitsToDouble(0xA147DA2B18C067DAL ^ 0xE179DA2B18C067DAL);
                int n7 = F[27];
                n7 -= F[28];
                double d11 = (double)(n7 += F[29]) / d2;
                double d12 = Math.min(1.0, d11 / d10);
                d9 *= d12;
                d3 *= d12;
            }
            d2 = (Random.Default.nextDouble() - Double.longBitsToDouble(0xF368323DCA45AB05L ^ 0xCC88323DCA45AB05L)) * Double.longBitsToDouble(0xBF9390B8043BB4F8L ^ 0x805A09219DA22D62L);
            class_243 class_2433 = new class_243(class_2432.field_1352 + d2, class_2432.field_1351 + d2, class_2432.field_1350 + d2);
            int n8 = F[30];
            n8 ^= F[31];
            C.add(new O(class_2433, new class_243(d9, d7, d3), System.currentTimeMillis(), ((Number)c.getValue()).floatValue(), ((Number)c.getValue()).floatValue(), 0L, 0.0f, n8 -= F[32], null));
            long l13 = l8;
            int n9 = F[33];
            n9 -= F[34];
            int n10 = F[36];
            n10 += F[37];
            l8 = l13 ^ (l13 ^ l13 + (long)(n9 ^= F[35])) & -1L >>> (n10 += F[38]);
        }
        int n11 = F[39];
        n11 ^= F[40];
        if (C.size() > (n11 ^= F[41])) {
            int n12 = F[42];
            n12 -= F[43];
            long l14 = l6;
            int n13 = F[45];
            n13 += F[46];
            l6 = l14 ^ ((long)(C.size() - (n12 += F[44])) ^ l14) & -1L >>> (n13 += F[47]);
            long l15 = l8;
            int n14 = F[48];
            n14 -= F[49];
            l8 = l15 ^ (0L ^ l15) & -1L >>> (n14 += F[50]);
            while ((int)l8 < (int)l6) {
                long l16 = l7;
                int n15 = F[51];
                n15 -= F[52];
                l7 = l16 ^ ((long)((int)l8) ^ l16) & -1L >>> (n15 ^= F[53]);
                long l17 = l8;
                int n16 = F[54];
                n16 -= F[55];
                l8 = l17 ^ (0L ^ l17) & -1L << (n16 ^= F[56]);
                int n17 = F[57];
                n17 ^= F[58];
                C.remove(n17 ^= F[59]);
                long l18 = l8;
                int n18 = F[60];
                n18 += F[61];
                int n19 = F[63];
                n19 += F[64];
                l8 = l18 ^ (l18 ^ l18 + (long)(n18 += F[62])) & -1L >>> (n19 -= F[65]);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull B b2) {
        long l = 959042819098242020L;
        long l2 = -1020326622453505953L;
        int n = F[66];
        n += F[67];
        Intrinsics.checkNotNullParameter(b2, (String)d[n -= F[68]]);
        if (!this.isEnabled()) {
            return;
        }
        if (b_0.getMc().field_1724 == null || b_0.getMc().field_1687 == null) {
            return;
        }
        this.updateParticles();
        if (C.isEmpty()) {
            return;
        }
        class_243 class_2432 = b_0.getMc().field_1773.method_19418().method_19326();
        class_1921 class_19212 = RainRenderLayers.getTrailSprite(this.selectedTexture());
        int n2 = F[69];
        n2 += F[70];
        AutoCloseable autoCloseable = (AutoCloseable)new class_9799(n2 -= F[71]);
        Throwable throwable = null;
        try {
            Object object = (class_9799)autoCloseable;
            long l3 = l;
            int n3 = F[72];
            n3 ^= F[73];
            l = l3 ^ (0L ^ l3) & -1L << (n3 += F[74]);
            class_4597.class_4598 class_45982 = class_4597.method_22991((class_9799)object);
            class_4588 class_45882 = class_45982.getBuffer(class_19212);
            Iterable iterable = C;
            long l4 = l;
            int n4 = F[75];
            n4 ^= F[76];
            l = l4 ^ (0L ^ l4) & -1L >>> (n4 += F[77]);
            for (Object t2 : iterable) {
                O o = (O)t2;
                long l5 = l2;
                int n5 = F[78];
                n5 -= F[79];
                l2 = l5 ^ (0L ^ l5) & -1L << (n5 += F[80]);
                if (o.getAlpha() <= 0.0f || o.getCurrentSize() <= 0.0f) continue;
                Intrinsics.checkNotNull(class_45882);
                Intrinsics.checkNotNull(class_2432);
                INSTANCE.renderParticle(b2, class_45882, o, class_2432);
            }
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

    private final void updateParticles() {
        long l = System.currentTimeMillis();
        Iterator<O> iterator2 = C.iterator();
        int n = F[81];
        n += F[82];
        Intrinsics.checkNotNullExpressionValue(iterator2, (String)d[n -= F[83]]);
        Iterator<O> iterator3 = iterator2;
        while (iterator3.hasNext()) {
            O o;
            int n2 = F[84];
            n2 += F[85];
            Intrinsics.checkNotNullExpressionValue(iterator3.next(), (String)d[n2 += F[86]]);
            class_243 class_2432 = o.getPosition().method_1019(o.getVelocity());
            int n3 = F[87];
            n3 += F[88];
            Intrinsics.checkNotNullExpressionValue(class_2432, (String)d[n3 -= F[89]]);
            o.setPosition(class_2432);
            long l2 = l - o.getSpawnedAt();
            if (l2 >= o.getLifeTime()) {
                iterator3.remove();
                continue;
            }
            double d2 = RangesKt.coerceIn((double)l2 / (double)o.getLifeTime(), 0.0, 1.0);
            double d3 = 1.0 - d2;
            double d4 = d3 * d3 * (Double.longBitsToDouble(0x402AFC5B220B9F74L ^ 0x22FC5B220B9F74L) - Double.longBitsToDouble(0x2D756CFF2F1EF58FL ^ 0x6D756CFF2F1EF58FL) * d3);
            o.setAlpha(RangesKt.coerceIn((float)d4, 0.0f, 1.0f));
            o.setCurrentSize(o.getInitialSize() * (float)(1.0 - d2 * Double.longBitsToDouble(0x2119D3368FB7D77CL ^ 0x1EF04AAF162E4EE6L)));
        }
    }

    private final void renderParticle(B b2, class_4588 class_45882, O o, class_243 class_2432) {
        long l = 7953583916347168827L;
        long l2 = -4341204907511106806L;
        long l3 = 8913310293471137915L;
        Color color = this.selectedColor();
        int n = F[90];
        n ^= F[91];
        n -= F[92];
        int n2 = F[93];
        n2 += F[94];
        n2 ^= F[95];
        int n3 = F[96];
        n3 ^= F[97];
        long l4 = l3;
        int n4 = F[99];
        n4 ^= F[100];
        l3 = l4 ^ ((long)RangesKt.coerceIn((int)(255.0f * o.getAlpha()), n, n2) << (n3 -= F[98]) ^ l4) & -1L << (n4 += F[101]);
        float f2 = o.getCurrentSize();
        b2.getMatrices().method_22903();
        b2.getMatrices().method_22904(o.getPosition().field_1352 - class_2432.field_1352, o.getPosition().field_1351 - class_2432.field_1351, o.getPosition().field_1350 - class_2432.field_1350);
        b2.getMatrices().method_22907((Quaternionfc)b_0.getMc().field_1773.method_19418().method_23767());
        class_4587.class_4665 class_46652 = b2.getMatrices().method_23760();
        int n5 = F[102];
        n5 += F[103];
        class_45882.method_56824(class_46652, -f2, f2, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n5 ^= F[104]))).method_22913(0.0f, 0.0f);
        int n6 = F[105];
        n6 -= F[106];
        class_45882.method_56824(class_46652, f2, f2, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n6 ^= F[107]))).method_22913(1.0f, 0.0f);
        int n7 = F[108];
        n7 += F[109];
        class_45882.method_56824(class_46652, f2, -f2, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n7 -= F[110]))).method_22913(1.0f, 1.0f);
        int n8 = F[111];
        n8 -= F[112];
        class_45882.method_56824(class_46652, -f2, -f2, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n8 ^= F[113]))).method_22913(0.0f, 1.0f);
        b2.getMatrices().method_22909();
    }

    private final class_2960 selectedTexture() {
        String string = switch (a.getSelectedIndex()) {
            case 0 -> {
                int var4_1 = F[114];
                var4_1 += F[115];
                yield (String)d[var4_1 -= F[116]];
            }
            case 1 -> {
                int var6_2 = F[117];
                var6_2 ^= F[118];
                yield (String)d[var6_2 += F[119]];
            }
            case 2 -> {
                int var8_3 = F[120];
                var8_3 -= F[121];
                yield (String)d[var8_3 += F[122]];
            }
            case 3 -> {
                int var10_4 = F[123];
                var10_4 += F[124];
                yield (String)d[var10_4 ^= F[125]];
            }
            case 4 -> {
                int var12_5 = F[126];
                var12_5 -= F[127];
                yield (String)d[var12_5 -= F[128]];
            }
            case 5 -> {
                int var14_6 = F[129];
                var14_6 += F[130];
                yield (String)d[var14_6 += F[131]];
            }
            case 6 -> {
                int var16_7 = F[132];
                var16_7 ^= F[133];
                yield (String)d[var16_7 -= F[134]];
            }
            case 7 -> {
                int var18_8 = F[135];
                var18_8 ^= F[136];
                yield (String)d[var18_8 += F[137]];
            }
            default -> {
                int var20_9 = F[138];
                var20_9 += F[139];
                yield (String)d[var20_9 ^= F[140]];
            }
        };
        int n = F[141];
        n += F[142];
        n ^= F[143];
        String string2 = string;
        int n2 = F[144];
        n2 ^= F[145];
        int n3 = F[147];
        n3 += F[148];
        class_2960 class_29602 = class_2960.method_60655((String)((String)d[n]), (String)((String)d[n2 -= F[146]] + (String)d[n3 ^= F[149]] + string2));
        int n4 = F[150];
        n4 ^= F[151];
        Intrinsics.checkNotNullExpressionValue(class_29602, (String)d[n4 += F[152]]);
        return class_29602;
    }

    private final Color selectedColor() {
        return (Boolean)A.getValue() != false && P.INSTANCE.isEnabled() ? P.INSTANCE.getClientColor() : (Color)b.getValue();
    }

    private static final boolean useClientColor$lambda$0() {
        return P.INSTANCE.isEnabled();
    }

    private static final boolean particleColor$lambda$0() {
        int n;
        if (!((Boolean)A.getValue()).booleanValue() || !P.INSTANCE.isEnabled()) {
            int n2 = F[153];
            n2 -= F[154];
            n = n2 += F[155];
        } else {
            int n3 = F[156];
            n3 ^= F[157];
            n = n3 -= F[158];
        }
        return n != 0;
    }

    static {
        v_0.b();
        long l = 7612211541396487592L;
        long l2 = 5908409070386067487L;
        long l3 = -3370907725668200249L;
        long l4 = -7030575040821994549L;
        long l5 = 5095767836550238256L;
        long l6 = -5119712491012861756L;
        long l7 = 8899752902361276801L;
        long l8 = -6385300476492474462L;
        long l9 = 8978073633202630649L;
        long l10 = -1860644565575764412L;
        long l11 = 8329704226319604114L;
        long l12 = -8443495269823955709L;
        long l13 = -5136199672201782955L;
        long l14 = 6284578813419301673L;
        int n = F[159];
        n += F[160];
        d = new Object[n -= F[161]];
        long l15 = l14;
        int n2 = F[162];
        n2 += F[163];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= F[164]);
        Object[] objectArray = new Object[F[165]];
        objectArray[v_0.F[166]] = D;
        objectArray[v_0.F[167]] = F[168];
        int n3 = F[169];
        Object object = v_0.A()[F[170]];
        if (object == null) {
            char[] cArray = "\uf05c\uf00c\uf026\uf060\uf063\uf064\uf0bc\uf0c8\uf0c6\uf096\uf0c9\uf013\uf0af\uf0c4\uf053\uf05f\uf099\uf02a\uf067\uf05e\uf04f\uf0af\uf096\uf0af\uf0c5\uf0b2\uf064\uf067\uf0c6\uf04f\uf097\uf06b\uf069\uf01e\uf0bf\uf05d\uf0b0\uf065\uf062\uf0ca\uf0c1\uf0c2\uf02a\uf027\uf04f\uf068\uf06a\uf053\uf068\uf069\uf0b2\uf061\uf0c1\uf0bc\uf052\uf0c3\uf053\uf04c\uf012\uf029\uf0ca\uf0c9\uf096\uf04c\uf052\uf01e\uf05e\uf097\uf0c9\uf0b2\uf06a\uf01e\uf013\uf0c5\uf0b8\uf00c\uf067\uf0b0\uf099\uf0c8\uf0ad\uf05e\uf0c5\uf06a\uf0be\uf0b7\uf028\uf0ad\uf0b3\uf0bf\uf053\uf096\uf0cb\uf029\uf0ad\uf0b0\uf026\uf063\uf021\uf00d\uf064\uf0c2\uf02a\uf052\uf065\uf0ca\uf0b6\uf0b3\uf0c7\uf053\uf0c6\uf0af\uf0b3\uf0b7\uf0c9\uf0b0\uf0c9\uf0ac\uf098\uf0ca\uf013\uf02a\uf0c7\uf06a\uf0c7\uf028\uf028\uf069\uf026\uf0c8\uf097\uf013\uf05d\uf029\uf0bf\uf06a\uf0bd\uf0bd\uf026\uf096\uf012\uf098\uf0c7\uf00d\uf0bc\uf0ca\uf097\uf0c0\uf090\uf0c7\uf099\uf021\uf065\uf04d\uf0c0\uf0ad\uf096\uf0af\uf0ac\uf00d\uf062\uf0c1\uf05c\uf060\uf0c9\uf064\uf068\uf01e\uf0b7\uf0ad\uf062\uf098\uf013\uf096\uf0c0\uf0b0\uf0ac\uf0c8\uf0ac\uf0c3\uf099\uf061\uf013\uf04d\uf0b9\uf0b2\uf0b3\uf0b8\uf027\uf0ac\uf04c\uf04c\uf099\uf00c\uf0bc\uf0b2\uf0ac\uf0be\uf05d\uf052\uf069\uf05e\uf099\uf0c2\uf0cb\uf099\uf0c2\uf0c6\uf065\uf0b8\uf0c2\uf04c\uf012\uf0c3\uf05c\uf0bd\uf061\uf0c0\uf04c\uf0c4\uf098\uf01e\uf0c6\uf06a\uf069\uf0c0\uf063\uf0be\uf05d\uf098\uf0c5\uf0b8\uf052\uf02a\uf06a\uf065\uf0bd\uf0c0\uf098\uf0be\uf00d\uf012\uf0b0\uf028\uf00d\uf0be\uf012\uf065\uf02a\uf096\uf0c1\uf028\uf0be\uf053\uf097\uf0c6\uf0bc\uf05d\uf0af\uf0b0\uf04d\uf06a\uf099\uf0ac\uf063\uf096\uf00c\uf0c1\uf067\uf063\uf05c\uf02a\uf0b6\uf0c9\uf05d\uf06b\uf0c9\uf0c5\uf028\uf0af\uf0ac\uf060\uf00d\uf029\uf0ca\uf0bd\uf060\uf0bc\uf052\uf0ad\uf0ac\uf026\uf069\uf021\uf01e\uf01e\uf0c0\uf0c3\uf0b8\uf052\uf0b8\uf0b8\uf021\uf066\uf06b\uf028\uf0c3\uf061\uf0c9\uf0c2\uf099\uf053\uf04d\uf04c\uf052\uf05e\uf0c8\uf013\uf00d\uf061\uf053\uf027\uf05c\uf05f\uf05e\uf096\uf0c5\uf053\uf068\uf00d\uf028\uf0ad\uf06b\uf0c9\uf0c8\uf0bf\uf0c2\uf098\uf026\uf0c9\uf0b8\uf098\uf0c9\uf05f\uf0ad\uf00d\uf062\uf0c4\uf052\uf0c8\uf05d\uf0ad\uf0bc\uf097\uf052\uf0c7\uf063\uf0c1\uf0c6\uf0b7\uf0c1\uf04d\uf02a\uf020\uf0c3\uf02a\uf0bc\uf04f\uf0c4\uf0b0\uf097\uf00c\uf04f\uf0bd\uf028\uf096\uf0b3\uf0c9\uf0ca\uf0bc\uf060\uf05c\uf064\uf00c\uf02a\uf060\uf096\uf013\uf0c7\uf066\uf0bc\uf05e\uf097\uf053\uf099\uf0be\uf012\uf065\uf098\uf021\uf062\uf067\uf060\uf0ad\uf0c6\uf069\uf0ad\uf066\uf0ad\uf028\uf0c3\uf0ac\uf096\uf061\uf053\uf069\uf098\uf05f\uf0c6\uf020\uf00c\uf065\uf020\uf0bd\uf0b6\uf069\uf0c5\uf027\uf021\uf064\uf04d\uf097\uf04f\uf052\uf0bf\uf00c\uf097\uf096\uf0c9\uf097\uf0c8\uf068\uf065\uf04c\uf067\uf0ad\uf0c7\uf062\uf0bf\uf065\uf0b7\uf0c4\uf0ac\uf067\uf04d\uf0c8\uf00d\uf0be\uf067\uf0be\uf0b7\uf0c4\uf06b\uf0bc\uf0ac\uf0b8\uf05d\uf02a\uf096\uf0c0\uf06b\uf020\uf097\uf0c9\uf0bc\uf02a\uf064\uf05c\uf0bf\uf021\uf0c8\uf067\uf0ca\uf012\uf05e\uf02a\uf0c4\uf0c0\uf061\uf00c\uf0c7\uf0c0\uf0b2\uf013\uf068\uf099\uf020\uf099\uf061\uf04f\uf067\uf0bd\uf0be\uf0c0\uf05e\uf04c\uf061\uf069\uf05e\uf05e\uf0bf\uf00d\uf0c7\uf0c5\uf0b3\uf067\uf00d\uf0b8\uf067\uf021\uf0c9\uf065\uf067\uf0c5\uf02a\uf052\uf04c\uf05f\uf0bc\uf0ca\uf05c\uf0c8\uf021\uf06b\uf04d\uf01e\uf069\uf096\uf013\uf0c3\uf066\uf0ad\uf065\uf04d\uf028\uf0c9\uf099\uf0b6\uf0b6\uf0bd\uf065\uf00d\uf04c\uf027\uf0c1\uf0c3\uf06b\uf0bc\uf098\uf053\uf053\uf05c\uf068\uf0bd\uf099\uf06b\uf0c4\uf097\uf0af\uf0c8\uf026\uf06a\uf027\uf028\uf05c\uf0bc\uf0c6\uf013\uf05d\uf04c\uf065\uf097\uf068\uf0c8\uf063\uf020\uf0bf\uf061\uf0ca\uf06a\uf06a\uf0ad\uf0c8\uf098\uf06b\uf0b8\uf012\uf099\uf0b9\uf05d\uf099\uf097\uf06b\uf062\uf0b0\uf028\uf0c7\uf066\uf098\uf0c5\uf027\uf02a\uf01e\uf099\uf0c3\uf061\uf05e\uf0c7\uf0c0\uf0cb\uf0c6\uf0bc\uf00c\uf0c8\uf0c0\uf097\uf090\uf013\uf04c\uf0b0\uf060\uf0ac\uf0be\uf090\uf012\uf04f\uf020\uf0c3\uf0b6\uf0bf\uf04d\uf026\uf0b7\uf00c\uf0cb\uf098\uf098\uf069\uf0b2\uf096\uf053\uf05d\uf0c5\uf013\uf06b\uf097\uf02a\uf0b7\uf0bf\uf0c9\uf064\uf00c\uf0b3\uf0b3\uf098\uf0b7\uf027\uf061\uf029\uf05f\uf05c\uf04d\uf052\uf06a\uf068\uf0c2\uf00d\uf052\uf0c4\uf00d\uf0bc\uf05d\uf066\uf014".toCharArray();
            for (int i2 = F[171]; i2 < F[172]; ++i2) {
                int n4 = cArray[i2];
                n4 += F[173];
                n4 -= F[174];
                n4 += F[175];
                n4 ^= F[176];
                n4 ^= F[177];
                n4 -= F[178];
                n4 += F[179];
                n4 -= F[180];
                n4 += F[181];
                n4 ^= F[182];
                n4 += F[183];
                cArray[i2] = (char)(n4 ^= F[184]);
            }
            object = v_0.A()[v_0.F[185]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)v_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = F[186];
        n5 -= F[187];
        l5 = l16 ^ (0x17400000000L ^ l16) & -1L << (n5 += F[188]);
        long l17 = l12;
        int n6 = F[189];
        n6 -= F[190];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += F[191]);
        while (true) {
            int n7 = F[192];
            n7 += F[193];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= F[194]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = F[195];
            n9 -= F[196];
            int n10 = F[198];
            n10 ^= F[199];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= F[197])) & -1L >>> (n10 ^= F[200]);
            long l19 = l8;
            int n11 = F[201];
            n11 -= F[202];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += F[203]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = F[204];
            n13 ^= F[205];
            int n14 = F[207];
            n14 ^= F[208];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= F[206])) & -1L >>> (n14 -= F[209]);
            int n15 = F[210];
            n15 += F[211];
            long l21 = l9;
            int n16 = F[213];
            n16 += F[214];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += F[212]) ^ l21) & -1L << (n16 += F[215]);
            int n17 = F[216];
            n17 ^= F[217];
            n17 ^= F[218];
            int n18 = F[219];
            n18 += F[220];
            long l22 = l11;
            int n19 = F[222];
            n19 ^= F[223];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += F[221]))) ^ l22) & -1L >>> (n19 -= F[224]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = F[225];
            n20 -= F[226];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= F[227]);
            while (true) {
                int n21 = F[228];
                n21 += F[229];
                if ((int)(l13 >>> (n21 -= F[230])) >= (int)l11) break;
                int n22 = F[231];
                n22 ^= F[232];
                int n23 = F[234];
                n23 -= F[235];
                cArray2[(int)(l13 >>> (n22 += v_0.F[233]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += F[236]))];
                l13 += 0x100000000L;
            }
            int n24 = F[237];
            n24 -= F[238];
            int n25 = (int)(l14 >>> (n24 += F[239]));
            l14 += 0x100000000L;
            v_0.d[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = F[240];
            n26 ^= F[241];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= F[242]);
        }
        INSTANCE = new v_0();
        int n27 = F[243];
        n27 ^= F[244];
        n27 ^= F[245];
        int n28 = F[246];
        n28 -= F[247];
        String[] stringArray = new String[n28 += F[248]];
        int n29 = F[249];
        n29 -= F[250];
        int n30 = F[252];
        n30 -= F[253];
        stringArray[n29 -= v_0.F[251]] = (String)d[n30 -= F[254]];
        int n31 = F[255];
        n31 += F[256];
        int n32 = F[258];
        n32 += F[259];
        stringArray[n31 += v_0.F[257]] = (String)d[n32 ^= F[260]];
        int n33 = F[261];
        n33 -= F[262];
        int n34 = F[264];
        n34 -= F[265];
        stringArray[n33 += v_0.F[263]] = (String)d[n34 += F[266]];
        int n35 = F[267];
        n35 -= F[268];
        int n36 = F[270];
        n36 ^= F[271];
        stringArray[n35 -= v_0.F[269]] = (String)d[n36 ^= F[272]];
        int n37 = F[273];
        n37 += F[274];
        int n38 = F[276];
        n38 += F[277];
        stringArray[n37 += v_0.F[275]] = (String)d[n38 ^= F[278]];
        int n39 = F[279];
        n39 ^= F[280];
        int n40 = F[282];
        n40 -= F[283];
        stringArray[n39 -= v_0.F[281]] = (String)d[n40 -= F[284]];
        int n41 = F[285];
        n41 += F[286];
        int n42 = F[288];
        n42 += F[289];
        stringArray[n41 += v_0.F[287]] = (String)d[n42 -= F[290]];
        int n43 = F[291];
        n43 += F[292];
        int n44 = F[294];
        n44 += F[295];
        stringArray[n43 -= v_0.F[293]] = (String)d[n44 += F[296]];
        int n45 = F[297];
        n45 ^= F[298];
        a = INSTANCE.mode((String)d[n27], CollectionsKt.listOf(stringArray), n45 += F[299]);
        int n46 = F[300];
        n46 += F[301];
        boolean bl = F[303];
        bl -= F[304];
        A = INSTANCE.boolean((String)d[n46 ^= F[302]], bl ^= F[305]).setVisible(v_0::useClientColor$lambda$0);
        int n47 = F[306];
        n47 += F[307];
        String string = (String)d[n47 -= F[308]];
        Color color = Color.WHITE;
        int n48 = F[309];
        n48 += F[310];
        Intrinsics.checkNotNullExpressionValue(color, (String)d[n48 += F[311]]);
        b = INSTANCE.color(string, color).setVisible(v_0::particleColor$lambda$0);
        int n49 = F[312];
        n49 += F[313];
        B = INSTANCE.slider((String)d[n49 += F[314]], 20.0f, 1.0f, 100.0f, 1.0f);
        int n50 = F[315];
        n50 += F[316];
        c = INSTANCE.slider((String)d[n50 += F[317]], 0.1f, 0.02f, 0.25f, 0.01f);
        C = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[F[318]];
        String string = (String)object[F[319]];
        object = object[F[320]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[321]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[322]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[324] ^ F[325]];
                byArray[v_0.F[326] ^ v_0.F[327]] = F[328] ^ F[329];
                byArray[v_0.F[330] ^ v_0.F[331]] = F[332] ^ F[333];
                byArray[v_0.F[334] ^ v_0.F[335]] = F[336] ^ F[337];
                byArray[v_0.F[338] ^ v_0.F[339]] = F[340] ^ F[341];
                byArray[v_0.F[342] ^ v_0.F[343]] = F[344] ^ F[345];
                byArray[v_0.F[346] ^ v_0.F[347]] = F[348] ^ F[349];
                byArray[v_0.F[350] ^ v_0.F[351]] = F[352] ^ F[353];
                byArray[v_0.F[354] ^ v_0.F[355]] = F[356] ^ F[357];
                byArray[v_0.F[358] ^ v_0.F[359]] = F[360] ^ F[361];
                byArray[v_0.F[362] ^ v_0.F[363]] = F[364] ^ F[365];
                byArray[v_0.F[366] ^ v_0.F[367]] = F[368] ^ F[369];
                byArray[v_0.F[370] ^ v_0.F[371]] = F[372] ^ F[373];
                byArray[v_0.F[374] ^ v_0.F[375]] = F[376] ^ F[377];
                byArray[v_0.F[378] ^ v_0.F[379]] = F[380] ^ F[381];
                byArray[v_0.F[382] ^ v_0.F[383]] = F[384] ^ F[385];
                byArray[v_0.F[386] ^ v_0.F[387]] = F[388] ^ F[389];
                objectArray2[v_0.F[323]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[390]];
            if (e == null) {
                byte[] byArray2 = new byte[F[391] ^ F[392]];
                byArray2[v_0.F[393] ^ v_0.F[394]] = F[395] ^ F[396];
                byArray2[v_0.F[397] ^ v_0.F[398]] = F[399] ^ 0x9DDC;
                byArray2[0x63BE ^ 0x63BE] = 0xFFFF9C3E ^ 0x63BE;
                byArray2[0xC8C7 ^ 0xC8CC] = 0xFFFF3719 ^ 0xC8CC;
                byArray2[0xDB4A ^ 0xDB43] = 0xDB06 ^ 0xDB43;
                byArray2[0x7C1B ^ 0x7C02] = 0x7C06 ^ 0x7C02;
                byArray2[0x6FF0 ^ 0x6FEA] = 0x6FFC ^ 0x6FEA;
                byArray2[0xB911 ^ 0xB909] = 0xFFFF46EF ^ 0xB909;
                byArray2[0xC89A ^ 0xC887] = 0xC8A0 ^ 0xC887;
                byArray2[0x575E ^ 0x5741] = 0x5767 ^ 0x5741;
                byArray2[0xBE2E ^ 0xBE3C] = 0xFFFF41F1 ^ 0xBE3C;
                byArray2[0x5B1E ^ 0x5B1C] = 0x5B6F ^ 0x5B1C;
                byArray2[0xEC4 ^ 0xEC9] = 0xE87 ^ 0xEC9;
                byArray2[0x5C9C ^ 0x5C96] = 0xFFFFA327 ^ 0x5C96;
                byArray2[0x641A ^ 0x640E] = 0xFFFF9BF3 ^ 0x640E;
                byArray2[0x90C ^ 0x90B] = 0xFFFFF694 ^ 0x90B;
                byArray2[0xFA51 ^ 0xFA40] = 0xFFFF05A5 ^ 0xFA40;
                byArray2[0x8B0C ^ 0x8B1F] = 0xFFFF74F5 ^ 0x8B1F;
                byArray2[0xAA68 ^ 0xAA64] = 0xFFFF5583 ^ 0xAA64;
                byArray2[0xF358 ^ 0xF343] = 0xF312 ^ 0xF343;
                byArray2[0x8B85 ^ 0x8B9B] = 0xFFFF740C ^ 0x8B9B;
                byArray2[0x2BB ^ 0x2A7] = 0x2B7 ^ 0x2A7;
                byArray2[0x296E ^ 0x2968] = 0x2934 ^ 0x2968;
                byArray2[0x7BFA ^ 0x7BFF] = 0x7BF1 ^ 0x7BFF;
                byArray2[0x6462 ^ 0x6477] = 0xFFFF9BEF ^ 0x6477;
                byArray2[0x4D63 ^ 0x4D6D] = 0x4D17 ^ 0x4D6D;
                byArray2[0x2B73 ^ 0x2B70] = 0x2B3C ^ 0x2B70;
                byArray2[0x679D ^ 0x678A] = 0xFFFF984C ^ 0x678A;
                byArray2[0xA3D6 ^ 0xA3DE] = 0xA3E4 ^ 0xA3DE;
                byArray2[0x3F9F ^ 0x3F89] = 0xFFFFC02D ^ 0x3F89;
                byArray2[0xE808 ^ 0xE809] = 0xE838 ^ 0xE809;
                byArray2[0x774C ^ 0x7748] = 0xFFFF88C9 ^ 0x7748;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = v_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u5358\u50aa\u5081\u50ac\u535e\u50da\u506d\u50ff\u509c\u50a0\u5080\u50a3\u5067\u50c9\u50f9\u5080\u50c7\u5337".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= 0xA150;
                        n2 -= 27408;
                        n2 ^= 0xDBA0;
                        n2 -= 36193;
                        n2 -= 18773;
                        n2 += 15928;
                        n2 += 16793;
                        n2 ^= 0x4F2A;
                        n2 -= 11276;
                        n2 ^= 0xAFAC;
                        n2 += 36750;
                        cArray[i2] = (char)(n2 ^= 0x423F);
                    }
                    object4 = v_0.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[6] = 118;
                byArray4[14] = -103;
                byArray4[5] = 28;
                byArray4[12] = -126;
                byArray4[11] = 119;
                byArray4[10] = -82;
                byArray4[0] = 112;
                byArray4[9] = 17;
                byArray4[4] = -53;
                byArray4[15] = 54;
                byArray4[8] = -13;
                byArray4[13] = -64;
                byArray4[2] = -37;
                byArray4[1] = 53;
                byArray4[3] = -28;
                byArray4[7] = 30;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 27, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = v_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ucc2b\ucc1f\ucc1d".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 41955;
                        n3 ^= 0xE725;
                        n3 ^= 0x63E5;
                        n3 -= 13063;
                        n3 -= 40522;
                        n3 ^= 0xCEAB;
                        n3 += 30478;
                        n3 -= 46866;
                        n3 -= 62419;
                        n3 += 39539;
                        n3 -= 19863;
                        n3 ^= 0x9E38;
                        n3 ^= 0xA5F8;
                        cArray[i3] = (char)(n3 ^= 0x3D5A);
                    }
                    object5 = v_0.A()[2] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = v_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u00e4\u00e8\u00f2\u01ee\u00e2\u00e3\u00e2\u01ee\u00f5\u00ea\u00e2\u00f2\u0018\u00f5\u00c4\u00c9\u00c9\u00cc\u0edf\u00c6".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 ^= 0xC6D1;
                    n4 -= 14277;
                    n4 ^= 0x706;
                    n4 ^= 0xBA46;
                    n4 += 21574;
                    n4 ^= 0x4588;
                    n4 += 10696;
                    n4 += 35177;
                    n4 ^= 0x88FA;
                    n4 -= 1467;
                    n4 -= 23595;
                    cArray[i4] = (char)(n4 -= 40110);
                }
                object6 = v_0.A()[3] = new String(cArray);
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
        F = new int[0x7D02 ^ 0x7C92];
        v_0.F[0x78A8 ^ 0x783C] = 0xFFFF87B4 ^ 0x783C;
        v_0.F[0xE9FF ^ 0xE8AC] = 0x837E ^ 0xE8AC;
        v_0.F[0x9F1C ^ 0x9F0B] = 0xFFFF60FA ^ 0x9F0B;
        v_0.F[0xDFAD ^ 0xDEB0] = 0xDE95 ^ 0xDEB0;
        v_0.F[0xE30 ^ 0xFB7] = 0xFA9D ^ 0xFB7;
        v_0.F[0x7FB6 ^ 0x7EA9] = 0x7EA6 ^ 0x7EA9;
        v_0.F[0x1390 ^ 0x136C] = 0x1356 ^ 0x136C;
        v_0.F[0x30D5 ^ 0x30EC] = 0xFFFFCF66 ^ 0x30EC;
        v_0.F[0x9FD5 ^ 0x9EC1] = 0xFFFF6119 ^ 0x9EC1;
        v_0.F[0x9DAD ^ 0x9DE9] = 0x9DE6 ^ 0x9DE9;
        v_0.F[0xE920 ^ 0xE91A] = 0xE961 ^ 0xE91A;
        v_0.F[0x107E0 ^ 0x10791] = 0x1079F ^ 0x10791;
        v_0.F[0x10CA6 ^ 0x10DBD] = 0x10DDB ^ 0x10DBD;
        v_0.F[0x79E6 ^ 0x78DD] = 0x78B5 ^ 0x78DD;
        v_0.F[0x6FBE ^ 0x6E80] = 0x6E81 ^ 0x6E80;
        v_0.F[0xACB1 ^ 0xAC20] = 0xAC2A ^ 0xAC20;
        v_0.F[0x694B ^ 0x69C7] = 0xFFFF9606 ^ 0x69C7;
        v_0.F[0x6045 ^ 0x6163] = 0xFFFF9EEA ^ 0x6163;
        v_0.F[0x85F6 ^ 0x85DC] = 0x86CC ^ 0x85DC;
        v_0.F[0x81BD ^ 0x8103] = 0xFFFF7E9D ^ 0x8103;
        v_0.F[0x8F39 ^ 0x8FCC] = 0xFFFF701C ^ 0x8FCC;
        v_0.F[0x40E9 ^ 0x419C] = 0x36B1 ^ 0x419C;
        v_0.F[0x80A2 ^ 0x80C4] = 0x8097 ^ 0x80C4;
        v_0.F[0x78C6 ^ 0x78A8] = 0xFFFF8758 ^ 0x78A8;
        v_0.F[0x10D45 ^ 0x10DD0] = 0x10DDC ^ 0x10DD0;
        v_0.F[0x1885 ^ 0x180A] = 0x1821 ^ 0x180A;
        v_0.F[0x1E1A ^ 0x1E89] = 0x1E07 ^ 0x1E89;
        v_0.F[0x2580 ^ 0x24AC] = 0xFFFFDB44 ^ 0x24AC;
        v_0.F[0xFF7 ^ 0xF21] = 0xFFFFF0CD ^ 0xF21;
        v_0.F[0xDF70 ^ 0xDFF1] = 0xFFFF2009 ^ 0xDFF1;
        v_0.F[0xF742 ^ 0xF704] = 0xFFFF088D ^ 0xF704;
        v_0.F[0x9107 ^ 0x9024] = 0x907C ^ 0x9024;
        v_0.F[0x6603 ^ 0x6759] = 0x16750 ^ 0x6759;
        v_0.F[0xBC06 ^ 0xBD60] = 0x8765 ^ 0xBD60;
        v_0.F[0x527C ^ 0x522D] = 0x52BA ^ 0x522D;
        v_0.F[0xDA37 ^ 0xDA36] = 0xFFFF25FA ^ 0xDA36;
        v_0.F[0x8955 ^ 0x895D] = 0xFFFF76EA ^ 0x895D;
        v_0.F[0x5F52 ^ 0x5F52] = 0x5F0C ^ 0x5F52;
        v_0.F[0xBCF6 ^ 0xBD99] = 0xE496 ^ 0xBD99;
        v_0.F[0x83DF ^ 0x83F1] = 0xFFFF7C6F ^ 0x83F1;
        v_0.F[0xEE39 ^ 0xEF5C] = 0x16E ^ 0xEF5C;
        v_0.F[0x51FB ^ 0x5186] = 0xFFFFAE2D ^ 0x5186;
        v_0.F[0x7F4 ^ 0x7A4] = 0x7C9 ^ 0x7A4;
        v_0.F[0xA90D ^ 0xA805] = 0xFFFF5794 ^ 0xA805;
        v_0.F[0xE2C ^ 0xEC5] = 0xFFFFF129 ^ 0xEC5;
        v_0.F[0x2311 ^ 0x220B] = 0x222B ^ 0x220B;
        v_0.F[0x7E22 ^ 0x7EFB] = 0x7EB8 ^ 0x7EFB;
        v_0.F[0x5BB6 ^ 0x5ABA] = 0x5ACE ^ 0x5ABA;
        v_0.F[0x37CB ^ 0x364F] = 0x88BD ^ 0x364F;
        v_0.F[0x57CA ^ 0x5680] = 0xF02E ^ 0x5680;
        v_0.F[0xEA06 ^ 0xEB14] = 0xEB7F ^ 0xEB14;
        v_0.F[0x1C3D ^ 0x1D74] = 0xC2A ^ 0x1D74;
        v_0.F[0x9138 ^ 0x91EB] = 0x91CC ^ 0x91EB;
        v_0.F[0x811C ^ 0x81CE] = 0xFFFF7E64 ^ 0x81CE;
        v_0.F[0x1F61 ^ 0x1F19] = 0xFFFFE096 ^ 0x1F19;
        v_0.F[0x5B2A ^ 0x5B42] = 0x5B60 ^ 0x5B42;
        v_0.F[0x10AAB ^ 0x10A05] = 0x10495 ^ 0x10A05;
        v_0.F[0x2C74 ^ 0x2CF3] = 0x2CF0 ^ 0x2CF3;
        v_0.F[0x1A77 ^ 0x1B19] = 0x4216 ^ 0x1B19;
        v_0.F[0xC42F ^ 0xC51C] = 0xFFFF3AE9 ^ 0xC51C;
        v_0.F[0x2F9D ^ 0x2F97] = 0xFFFFD055 ^ 0x2F97;
        v_0.F[0x86F7 ^ 0x8677] = 0xFFFF79DD ^ 0x8677;
        v_0.F[0x4AEE ^ 0x4B9C] = 0x3CB2 ^ 0x4B9C;
        v_0.F[0x295F ^ 0x2913] = 0x290F ^ 0x2913;
        v_0.F[0xCEDC ^ 0xCFB4] = 0xF5E4 ^ 0xCFB4;
        v_0.F[0x17AD ^ 0x17EF] = 0xFFFFE852 ^ 0x17EF;
        v_0.F[0xA87 ^ 0xBA0] = 0xB92 ^ 0xBA0;
        v_0.F[0x6652 ^ 0x6664] = 0xFFFF9910 ^ 0x6664;
        v_0.F[0x3E74 ^ 0x3F7A] = 0xFFFFC092 ^ 0x3F7A;
        v_0.F[0x10D9F ^ 0x10C83] = 0xFFFEF324 ^ 0x10C83;
        v_0.F[0xB3AB ^ 0xB228] = 0xCB9 ^ 0xB228;
        v_0.F[0xB3A5 ^ 0xB2F9] = 0xFFFE4D52 ^ 0xB2F9;
        v_0.F[0x436 ^ 0x537] = 0x52F ^ 0x537;
        v_0.F[0xA40 ^ 0xADC] = 0xFFFFF543 ^ 0xADC;
        v_0.F[0xE67F ^ 0xE6CE] = 0x5469 ^ 0xE6CE;
        v_0.F[0x10A1E ^ 0x10A40] = 0x10A73 ^ 0x10A40;
        v_0.F[0x2B78 ^ 0x2B4D] = 0xFFFFD4E9 ^ 0x2B4D;
        v_0.F[0x33DF ^ 0x32A1] = 0x869C ^ 0x32A1;
        v_0.F[0x10A16 ^ 0x10AA3] = 0x16328 ^ 0x10AA3;
        v_0.F[0x4965 ^ 0x48EA] = 0xD54E ^ 0x48EA;
        v_0.F[0x8923 ^ 0x8956] = 0x8920 ^ 0x8956;
        v_0.F[0xBEFB ^ 0xBEE7] = 0xFFFF412A ^ 0xBEE7;
        v_0.F[0x471F ^ 0x47CB] = 0x4784 ^ 0x47CB;
        v_0.F[0x75CE ^ 0x7503] = 0xFFFF8ABF ^ 0x7503;
        v_0.F[0x412C ^ 0x414E] = 0xFFFFBEFB ^ 0x414E;
        v_0.F[0x5157 ^ 0x5155] = 0x5172 ^ 0x5155;
        v_0.F[0xE3F6 ^ 0xE355] = 0xE332 ^ 0xE355;
        v_0.F[0x7AE0 ^ 0x7A78] = 0x7A62 ^ 0x7A78;
        v_0.F[0xE0F8 ^ 0xE0FC] = 0xFFFF1F01 ^ 0xE0FC;
        v_0.F[0x81EA ^ 0x80AD] = 0x91F3 ^ 0x80AD;
        v_0.F[0x6A19 ^ 0x6AD7] = 0xFFFF9507 ^ 0x6AD7;
        v_0.F[0xC323 ^ 0xC3C4] = 0xC3C2 ^ 0xC3C4;
        v_0.F[0x652B ^ 0x642E] = 0xFFFF9B55 ^ 0x642E;
        v_0.F[0xF19C ^ 0xF09A] = 0xFFFF0F17 ^ 0xF09A;
        v_0.F[0x61C2 ^ 0x610D] = 0x61A7 ^ 0x610D;
        v_0.F[0x10939 ^ 0x109E9] = 0x109C9 ^ 0x109E9;
        v_0.F[0x6148 ^ 0x6147] = 0x61E3 ^ 0x6147;
        v_0.F[0x29A6 ^ 0x29C6] = 0x29CB ^ 0x29C6;
        v_0.F[0x7547 ^ 0x757C] = 0xFFFF8A8D ^ 0x757C;
        v_0.F[0x3CF2 ^ 0x3C58] = 0x3C58 ^ 0x3C58;
        v_0.F[0x58B2 ^ 0x5987] = 0xFFFFA650 ^ 0x5987;
        v_0.F[0x32BF ^ 0x329A] = 0x32EA ^ 0x329A;
        v_0.F[0x1CF2 ^ 0x1C6F] = 0x1C6B ^ 0x1C6F;
        v_0.F[0x91A7 ^ 0x90AA] = 0xFFFF6F5A ^ 0x90AA;
        v_0.F[0xF593 ^ 0xF50D] = 0xFFFF0A96 ^ 0xF50D;
        v_0.F[0x65C2 ^ 0x64B2] = 0xFFFFC21C ^ 0x64B2;
        v_0.F[0x3EEE ^ 0x3F9F] = 0x6690 ^ 0x3F9F;
        v_0.F[0x4EA6 ^ 0x4FCD] = 0xA06B ^ 0x4FCD;
        v_0.F[0x162E ^ 0x1770] = 0xE0A7 ^ 0x1770;
        v_0.F[0x4B9E ^ 0x4A80] = 0xFFFFB552 ^ 0x4A80;
        v_0.F[0xFAF3 ^ 0xFA68] = 0xFFFF05CD ^ 0xFA68;
        v_0.F[0xAFDE ^ 0xAF25] = 0xFFFF50F4 ^ 0xAF25;
        v_0.F[0x254B ^ 0x25EB] = 0xFFFFDA1E ^ 0x25EB;
        v_0.F[0xFBF9 ^ 0xFB1B] = 0xFFFF04E4 ^ 0xFB1B;
        v_0.F[0xF5E8 ^ 0xF587] = 0xF5F5 ^ 0xF587;
        v_0.F[0x10B08 ^ 0x10BC3] = 0x10BCB ^ 0x10BC3;
        v_0.F[0xFD8E ^ 0xFCE3] = 0x1345 ^ 0xFCE3;
        v_0.F[0x16DA ^ 0x17EB] = 0xFFFFE85B ^ 0x17EB;
        v_0.F[0x3781 ^ 0x3729] = 0x3729 ^ 0x3729;
        v_0.F[0x3DE1 ^ 0x3D27] = 0x3D69 ^ 0x3D27;
        v_0.F[0x6B0F ^ 0x6BDE] = 0x6BB4 ^ 0x6BDE;
        v_0.F[0x1E49 ^ 0x1E54] = 0xFFFFE1D7 ^ 0x1E54;
        v_0.F[0xD5B2 ^ 0xD48D] = 0xD48F ^ 0xD48D;
        v_0.F[0x4AE6 ^ 0x4BB1] = 0x1638 ^ 0x4BB1;
        v_0.F[0x3505 ^ 0x3413] = 0xFFFFCBB0 ^ 0x3413;
        v_0.F[0x4E19 ^ 0x4E24] = 0xFFFFB1AF ^ 0x4E24;
        v_0.F[0xE30A ^ 0xE3F3] = 0xE3EB ^ 0xE3F3;
        v_0.F[0xBEEF ^ 0xBECB] = 0xFFFF413E ^ 0xBECB;
        v_0.F[0x1508 ^ 0x155C] = 0x1551 ^ 0x155C;
        v_0.F[0xE15F ^ 0xE1F3] = 0xE35F ^ 0xE1F3;
        v_0.F[0x6904 ^ 0x693B] = 0x6997 ^ 0x693B;
        v_0.F[0xF2FC ^ 0xF286] = 0xF2CE ^ 0xF286;
        v_0.F[0x10EFF ^ 0x10E13] = 0xFFFEF1D0 ^ 0x10E13;
        v_0.F[0x46EC ^ 0x46CA] = 0xFFFFB971 ^ 0x46CA;
        v_0.F[0x9CE ^ 0x97D] = 0x3145 ^ 0x97D;
        v_0.F[0x902B ^ 0x90A5] = 0x90D5 ^ 0x90A5;
        v_0.F[0xC2A9 ^ 0xC3F4] = 0x1C3F8 ^ 0xC3F4;
        v_0.F[0xE87C ^ 0xE90F] = 0x9E22 ^ 0xE90F;
        v_0.F[0x97E5 ^ 0x96E7] = 0xFFFF694B ^ 0x96E7;
        v_0.F[0x6E58 ^ 0x6EAC] = 0x6E8D ^ 0x6EAC;
        v_0.F[0x1340 ^ 0x133C] = 0x137D ^ 0x133C;
        v_0.F[0x9FAF ^ 0x9EA8] = 0x9EBC ^ 0x9EA8;
        v_0.F[0xCE87 ^ 0xCE96] = 0xCEC8 ^ 0xCE96;
        v_0.F[0x4DB6 ^ 0x4D57] = 0x4D42 ^ 0x4D57;
        v_0.F[0x3861 ^ 0x38A9] = 0x38E2 ^ 0x38A9;
        v_0.F[0x28C3 ^ 0x288B] = 0xFFFFD7A8 ^ 0x288B;
        v_0.F[0x10207 ^ 0x10351] = 0x15ED2 ^ 0x10351;
        v_0.F[0x10A18 ^ 0x10A8E] = 0x10AA9 ^ 0x10A8E;
        v_0.F[0x3039 ^ 0x308F] = 0x99F4 ^ 0x308F;
        v_0.F[0x542A ^ 0x54AE] = 0x54C6 ^ 0x54AE;
        v_0.F[0xE944 ^ 0xE86E] = 0xFFFF17E2 ^ 0xE86E;
        v_0.F[0x113 ^ 0x64] = 0xE59C ^ 0x64;
        v_0.F[0x2F20 ^ 0x2FAB] = 0x2FF2 ^ 0x2FAB;
        v_0.F[0xDD58 ^ 0xDCD5] = 0x4106 ^ 0xDCD5;
        v_0.F[0x5C55 ^ 0x5C77] = 0xFFFFA3AA ^ 0x5C77;
        v_0.F[0x94E7 ^ 0x95F6] = 0xFFFF6A8C ^ 0x95F6;
        v_0.F[0xAB2B ^ 0xAAA1] = 0x2EF9 ^ 0xAAA1;
        v_0.F[0x62B0 ^ 0x62DB] = 0x62C5 ^ 0x62DB;
        v_0.F[0x8BD3 ^ 0x8AEE] = 0xFFFF7563 ^ 0x8AEE;
        v_0.F[0x5547 ^ 0x550D] = 0xFFFFAA95 ^ 0x550D;
        v_0.F[0xB6A ^ 0xB19] = 0xFFFFF4A2 ^ 0xB19;
        v_0.F[0x9685 ^ 0x964C] = 0xFFFF6999 ^ 0x964C;
        v_0.F[0x7B33 ^ 0x7BE9] = 0x7B8D ^ 0x7BE9;
        v_0.F[0x7318 ^ 0x7233] = 0xFFFF8D80 ^ 0x7233;
        v_0.F[0x63D7 ^ 0x62A3] = 0x15B6 ^ 0x62A3;
        v_0.F[0x2F4E ^ 0x2E0B] = 0x6C06 ^ 0x2E0B;
        v_0.F[0x906E ^ 0x914A] = 0xFFFF6E86 ^ 0x914A;
        v_0.F[0xE563 ^ 0xE550] = 0xFFFF1A9C ^ 0xE550;
        v_0.F[0x6B4 ^ 0x7BF] = 0x7D8 ^ 0x7BF;
        v_0.F[0x2916 ^ 0x2968] = 0xFFFFD60F ^ 0x2968;
        v_0.F[0xBFA7 ^ 0xBFB8] = 0xFFFF4057 ^ 0xBFB8;
        v_0.F[0x9029 ^ 0x91AC] = 0x2F3D ^ 0x91AC;
        v_0.F[0x179F ^ 0x17A1] = 0xFFFFE833 ^ 0x17A1;
        v_0.F[0xFAEE ^ 0xFB96] = 0x1E1C ^ 0xFB96;
        v_0.F[0x4052 ^ 0x40D8] = 0xFFFFBFA5 ^ 0x40D8;
        v_0.F[0xE592 ^ 0xE551] = 0xFFFF1A8F ^ 0xE551;
        v_0.F[0x6140 ^ 0x619D] = 0x61D7 ^ 0x619D;
        v_0.F[0xB25B ^ 0xB242] = 0xFFFF4DDD ^ 0xB242;
        v_0.F[0xCD75 ^ 0xCDC9] = 0xCD96 ^ 0xCDC9;
        v_0.F[0xAAF3 ^ 0xAA41] = 0x3CC9 ^ 0xAA41;
        v_0.F[0xCFA1 ^ 0xCEA2] = 0xCE81 ^ 0xCEA2;
        v_0.F[0x10B8 ^ 0x1093] = 0x10BE ^ 0x1093;
        v_0.F[0x1DE3 ^ 0x1C6F] = 0x9837 ^ 0x1C6F;
        v_0.F[0xF68B ^ 0xF6C0] = 0xF683 ^ 0xF6C0;
        v_0.F[0x1024F ^ 0x1028D] = 0x102F8 ^ 0x1028D;
        v_0.F[0x45B8 ^ 0x44EA] = 0x2F36 ^ 0x44EA;
        v_0.F[0x6B07 ^ 0x6A2A] = 0xFFFF95CE ^ 0x6A2A;
        v_0.F[0x4463 ^ 0x4551] = 0x4514 ^ 0x4551;
        v_0.F[0xDB15 ^ 0xDB24] = 0xDB05 ^ 0xDB24;
        v_0.F[0x2688 ^ 0x267F] = 0xFFFFD984 ^ 0x267F;
        v_0.F[0x10E74 ^ 0x10E0B] = 0xFFFEF1B6 ^ 0x10E0B;
        v_0.F[0x45F7 ^ 0x4585] = 0x451E ^ 0x4585;
        v_0.F[0xCC91 ^ 0xCC2E] = 0xCC50 ^ 0xCC2E;
        v_0.F[0x103A4 ^ 0x1028C] = 0x102D5 ^ 0x1028C;
        v_0.F[0x7834 ^ 0x788D] = 0x788D ^ 0x788D;
        v_0.F[0xE1D8 ^ 0xE122] = 0xE165 ^ 0xE122;
        v_0.F[0x5EAF ^ 0x5E86] = 0xFFFFA116 ^ 0x5E86;
        v_0.F[0x84BE ^ 0x8472] = 0x841F ^ 0x8472;
        v_0.F[0x68E1 ^ 0x69F4] = 0xFFFF9629 ^ 0x69F4;
        v_0.F[0x9B7C ^ 0x9A16] = 0x75B1 ^ 0x9A16;
        v_0.F[0xE3E0 ^ 0xE383] = 0xFFFF1CFF ^ 0xE383;
        v_0.F[0xFC6C ^ 0xFC82] = 0xFCA2 ^ 0xFC82;
        v_0.F[0xE3BA ^ 0xE2B0] = 0xE28E ^ 0xE2B0;
        v_0.F[0x72E2 ^ 0x736B] = 0xF723 ^ 0x736B;
        v_0.F[0x1A4A ^ 0x1AA1] = 0xFFFFE516 ^ 0x1AA1;
        v_0.F[0xCFBE ^ 0xCF38] = 0xFFFF30B9 ^ 0xCF38;
        v_0.F[0x25FF ^ 0x259A] = 0xFFFFDA0F ^ 0x259A;
        v_0.F[0x8935 ^ 0x8991] = 0xFFFF7614 ^ 0x8991;
        v_0.F[0xCE5B ^ 0xCF1F] = 0x8D02 ^ 0xCF1F;
        v_0.F[0x10B9C ^ 0x10AD2] = 0x1E722 ^ 0x10AD2;
        v_0.F[0x10C1F ^ 0x10C5C] = 0x10C32 ^ 0x10C5C;
        v_0.F[0xFB57 ^ 0xFB1E] = 0xFFFF04B5 ^ 0xFB1E;
        v_0.F[0x40AB ^ 0x40CF] = 0xFFFFBF38 ^ 0x40CF;
        v_0.F[0xFFB ^ 0xEDA] = 0xEC9 ^ 0xEDA;
        v_0.F[0xB0E2 ^ 0xB1DA] = 0xB18E ^ 0xB1DA;
        v_0.F[0x81BC ^ 0x8191] = 0x8137 ^ 0x8191;
        v_0.F[0x6F4F ^ 0x6E66] = 0xFFFF91B9 ^ 0x6E66;
        v_0.F[0x1E0E ^ 0x1F55] = 0x11F59 ^ 0x1F55;
        v_0.F[0x658B ^ 0x6554] = 0xFFFF9AFA ^ 0x6554;
        v_0.F[0x282D ^ 0x2978] = 0x42AA ^ 0x2978;
        v_0.F[0x41DD ^ 0x40E7] = 0x40C9 ^ 0x40E7;
        v_0.F[0x223B ^ 0x2263] = 0xFFFFDD8E ^ 0x2263;
        v_0.F[0x6870 ^ 0x683F] = 0xFFFF978B ^ 0x683F;
        v_0.F[0x3C92 ^ 0x3C99] = 0xFFFFC329 ^ 0x3C99;
        v_0.F[0x13E4 ^ 0x1266] = 0xACF8 ^ 0x1266;
        v_0.F[0x721E ^ 0x7208] = 0x725F ^ 0x7208;
        v_0.F[0x5D69 ^ 0x5D8D] = 0x5DE7 ^ 0x5D8D;
        v_0.F[0x8AA3 ^ 0x8B25] = 0x8B25 ^ 0x8B25;
        v_0.F[0xB41D ^ 0xB43D] = 0xFFFF4B98 ^ 0xB43D;
        v_0.F[0x10A79 ^ 0x10A86] = 0xFFFEF578 ^ 0x10A86;
        v_0.F[0xCF3E ^ 0xCE44] = 0x225D ^ 0xCE44;
        v_0.F[0x5093 ^ 0x5001] = 0x505D ^ 0x5001;
        v_0.F[0x1070C ^ 0x107FD] = 0x107C7 ^ 0x107FD;
        v_0.F[0x55CA ^ 0x55DE] = 0x55D2 ^ 0x55DE;
        v_0.F[0xB2BA ^ 0xB2A0] = 0xFFFF4D3B ^ 0xB2A0;
        v_0.F[0xA3B5 ^ 0xA2AC] = 0xFFFF5D6A ^ 0xA2AC;
        v_0.F[0x83CC ^ 0x83BA] = 0x83ED ^ 0x83BA;
        v_0.F[0x74E8 ^ 0x7441] = 0x7443 ^ 0x7441;
        v_0.F[0xD1A ^ 0xD63] = 0xFFFFF2DF ^ 0xD63;
        v_0.F[0x10CE ^ 0x11AF] = 0xE673 ^ 0x11AF;
        v_0.F[0x5B04 ^ 0x5A44] = 0x5A44 ^ 0x5A44;
        v_0.F[0x9B09 ^ 0x9A89] = 0x2E9F ^ 0x9A89;
        v_0.F[0x39E9 ^ 0x394C] = 0x394F ^ 0x394C;
        v_0.F[0x8A29 ^ 0x8A40] = 0x8AF0 ^ 0x8A40;
        v_0.F[0xD49D ^ 0xD4DC] = 0xD4D2 ^ 0xD4DC;
        v_0.F[0xC73D ^ 0xC7E8] = 0xFFFF3838 ^ 0xC7E8;
        v_0.F[0x1AD5 ^ 0x1A8A] = 0x1A85 ^ 0x1A8A;
        v_0.F[0x658 ^ 0x77A] = 0x725 ^ 0x77A;
        v_0.F[0x6145 ^ 0x600E] = 0xC6A8 ^ 0x600E;
        v_0.F[0x107D1 ^ 0x107C1] = 0xFFFEF81B ^ 0x107C1;
        v_0.F[0x96FB ^ 0x961B] = 0x9617 ^ 0x961B;
        v_0.F[0x3AC1 ^ 0x3BBD] = 0xFFFF2803 ^ 0x3BBD;
        v_0.F[0x3C9B ^ 0x3DAB] = 0x3DB0 ^ 0x3DAB;
        v_0.F[0xAADF ^ 0xAA9A] = 0x4AA1E ^ 0xAA9A;
        v_0.F[0x2ACB ^ 0x2A91] = 0xFFFFD542 ^ 0x2A91;
        v_0.F[0x10B3B ^ 0x10A2C] = 0xFFFEF5E5 ^ 0x10A2C;
        v_0.F[0x10C5 ^ 0x1189] = 0xFFFF48C2 ^ 0x1189;
        v_0.F[0xD048 ^ 0xD0B8] = 0xFFFF2F33 ^ 0xD0B8;
        v_0.F[0x3B82 ^ 0x3B90] = 0x3BEC ^ 0x3B90;
        v_0.F[0x10496 ^ 0x1047B] = 0x104C7 ^ 0x1047B;
        v_0.F[0x883B ^ 0x889C] = 0x889D ^ 0x889C;
        v_0.F[0x2DA6 ^ 0x2D6C] = 0xFFFFD2D1 ^ 0x2D6C;
        v_0.F[0x49BF ^ 0x4837] = 0xBD3D ^ 0x4837;
        v_0.F[0xAEC1 ^ 0xAE7A] = 0xFFFF51C7 ^ 0xAE7A;
        v_0.F[0xF261 ^ 0xF2B9] = 0xF28E ^ 0xF2B9;
        v_0.F[0x10349 ^ 0x10324] = 0x10373 ^ 0x10324;
        v_0.F[0x8A14 ^ 0x8B5C] = 0x9A31 ^ 0x8B5C;
        v_0.F[0xBCC5 ^ 0xBC5C] = 0xBC02 ^ 0xBC5C;
        v_0.F[0xF848 ^ 0xF833] = 0xFFFF0751 ^ 0xF833;
        v_0.F[0x923A ^ 0x92E4] = 0xFFFF6D66 ^ 0x92E4;
        v_0.F[0xACAF ^ 0xAC3F] = 0xAC53 ^ 0xAC3F;
        v_0.F[0xDF89 ^ 0xDFC4] = 0xFFFF2005 ^ 0xDFC4;
        v_0.F[0x33A5 ^ 0x33BE] = 0x33F2 ^ 0x33BE;
        v_0.F[0xC73D ^ 0xC7FA] = 0xC7DF ^ 0xC7FA;
        v_0.F[0xC72F ^ 0xC662] = 0x60C4 ^ 0xC662;
        v_0.F[0xBB95 ^ 0xBAA2] = 0xFFFF4555 ^ 0xBAA2;
        v_0.F[0x64E7 ^ 0x6453] = 0xCB7A ^ 0x6453;
        v_0.F[0xDA8F ^ 0xDADA] = 0xDA89 ^ 0xDADA;
        v_0.F[0x1A86 ^ 0x1A8B] = 0x1AFE ^ 0x1A8B;
        v_0.F[0x840A ^ 0x8414] = 0xFFFF7BFE ^ 0x8414;
        v_0.F[0xFB93 ^ 0xFB95] = 0xFBC7 ^ 0xFB95;
        v_0.F[0xCC33 ^ 0xCC1B] = 0xCC61 ^ 0xCC1B;
        v_0.F[0x264E ^ 0x26E1] = 0x8535 ^ 0x26E1;
        v_0.F[0x5442 ^ 0x54CF] = 0xFFFFAB09 ^ 0x54CF;
        v_0.F[0x2BA7 ^ 0x2B5A] = 0x2B4B ^ 0x2B5A;
        v_0.F[0x10C0 ^ 0x11BB] = 0xFDA4 ^ 0x11BB;
        v_0.F[0xBEE2 ^ 0xBE67] = 0xFFFF4183 ^ 0xBE67;
        v_0.F[0xA51B ^ 0xA56C] = 0xFFFF5A8D ^ 0xA56C;
        v_0.F[0x309 ^ 0x209] = 0xFFFFFDE2 ^ 0x209;
        v_0.F[0x3CBC ^ 0x3DE5] = 0x606C ^ 0x3DE5;
        v_0.F[0x706C ^ 0x712E] = 0x712F ^ 0x712E;
        v_0.F[0x73E0 ^ 0x73BB] = 0x73DF ^ 0x73BB;
        v_0.F[0xD70E ^ 0xD786] = 0xD783 ^ 0xD786;
        v_0.F[0x23 ^ 0x94] = 0x4538 ^ 0x94;
        v_0.F[0x60EE ^ 0x61AD] = 0x61AD ^ 0x61AD;
        v_0.F[0x616B ^ 0x61D1] = 0xFFFF9EAF ^ 0x61D1;
        v_0.F[0xE52 ^ 0xEFF] = 0x4E0F ^ 0xEFF;
        v_0.F[0xBD1 ^ 0xA50] = 0xBE69 ^ 0xA50;
        v_0.F[0xE9D0 ^ 0xE933] = 0xFFFF16C5 ^ 0xE933;
        v_0.F[0x8EB ^ 0x9FB] = 0xFFFFF602 ^ 0x9FB;
        v_0.F[0x378A ^ 0x3683] = 0xFFFFC93E ^ 0x3683;
        v_0.F[0xE42F ^ 0xE45F] = 0xE41B ^ 0xE45F;
        v_0.F[0x2E2E ^ 0x2E72] = 0xFFFFD1C5 ^ 0x2E72;
        v_0.F[0x77CD ^ 0x77CA] = 0xFFFF8820 ^ 0x77CA;
        v_0.F[0x8B7A ^ 0x8BD8] = 0xFFFF74E6 ^ 0x8BD8;
        v_0.F[0x10D4E ^ 0x10C01] = 0x1E1FD ^ 0x10C01;
        v_0.F[0x34F5 ^ 0x34DA] = 0xFFFFCB06 ^ 0x34DA;
        v_0.F[0x3283 ^ 0x3265] = 0x321F ^ 0x3265;
        v_0.F[0x95A7 ^ 0x95D3] = 0x95E5 ^ 0x95D3;
        v_0.F[0x658F ^ 0x6480] = 0x64B3 ^ 0x6480;
        v_0.F[0x6798 ^ 0x6760] = 0xFFFF98B4 ^ 0x6760;
        v_0.F[0xE82A ^ 0xE86A] = 0xFFFF17E8 ^ 0xE86A;
        v_0.F[0x101CA ^ 0x101F2] = 0xFFFEFE32 ^ 0x101F2;
        v_0.F[0xA7CC ^ 0xA6FA] = 0xA6BA ^ 0xA6FA;
        v_0.F[0x1202 ^ 0x1366] = 0xFD4F ^ 0x1366;
        v_0.F[0x811A ^ 0x8009] = 0x8016 ^ 0x8009;
        v_0.F[0x62EE ^ 0x622F] = 0xFFFF9DC2 ^ 0x622F;
        v_0.F[0xBD4F ^ 0xBC2C] = 0x521E ^ 0xBC2C;
        v_0.F[0x44D3 ^ 0x458C] = 0xB250 ^ 0x458C;
        v_0.F[0x7F7A ^ 0x7FED] = 0xFFFF8026 ^ 0x7FED;
        v_0.F[0x8D57 ^ 0x8C35] = 0x620A ^ 0x8C35;
        v_0.F[0x85F6 ^ 0x8597] = 0xFFFF7A4F ^ 0x8597;
        v_0.F[0xFEC3 ^ 0xFEAF] = 0xFFFF0116 ^ 0xFEAF;
        v_0.F[0x4D1E ^ 0x4D50] = 0xFFFFB237 ^ 0x4D50;
        v_0.F[0x36DF ^ 0x3667] = 0x3C59 ^ 0x3667;
        v_0.F[0xB385 ^ 0xB3A9] = 0xB394 ^ 0xB3A9;
        v_0.F[0x807E ^ 0x8077] = 0xFFFF7FDC ^ 0x8077;
        v_0.F[0x27D9 ^ 0x26B0] = 0x1CB2 ^ 0x26B0;
        v_0.F[0xFAFC ^ 0xFAAE] = 0xFFFF0525 ^ 0xFAAE;
        v_0.F[0x34B9 ^ 0x3412] = 0x3412 ^ 0x3412;
        v_0.F[0x351A ^ 0x35E4] = 0x35FC ^ 0x35E4;
        v_0.F[0xC0F5 ^ 0xC1AD] = 0x9C4E ^ 0xC1AD;
        v_0.F[0xE04B ^ 0xE0ED] = 0xE0ED ^ 0xE0ED;
        v_0.F[0xFE2F ^ 0xFE9F] = 0x9B6A ^ 0xFE9F;
        v_0.F[0x9BAC ^ 0x9ADA] = 0x7F20 ^ 0x9ADA;
        v_0.F[0x3A01 ^ 0x3B78] = 0xDE80 ^ 0x3B78;
        v_0.F[0x107FE ^ 0x1069E] = 0x1F107 ^ 0x1069E;
        v_0.F[0xE82D ^ 0xE823] = 0xFFFF17E5 ^ 0xE823;
        v_0.F[0xAEEC ^ 0xAFE8] = 0xFFFF502E ^ 0xAFE8;
        v_0.F[0x7755 ^ 0x7765] = 0x7729 ^ 0x7765;
        v_0.F[0x7706 ^ 0x7661] = 0x4C63 ^ 0x7661;
        v_0.F[0x781A ^ 0x795C] = 0x680B ^ 0x795C;
        v_0.F[0xFB8 ^ 0xF57] = 0xFFFFF0D3 ^ 0xF57;
        v_0.F[0x77E6 ^ 0x76C6] = 0x76AB ^ 0x76C6;
        v_0.F[0xCA6F ^ 0xCB03] = 0x24C2 ^ 0xCB03;
        v_0.F[0x63B9 ^ 0x639A] = 0x63C9 ^ 0x639A;
        v_0.F[0xE675 ^ 0xE69F] = 0xE68B ^ 0xE69F;
        v_0.F[0x7BE6 ^ 0x7B3D] = 0xFFFF8488 ^ 0x7B3D;
        v_0.F[0x150B ^ 0x1539] = 0xFFFFEACC ^ 0x1539;
        v_0.F[0xEEA0 ^ 0xEFF4] = 0xFFFF7BEC ^ 0xEFF4;
        v_0.F[0xCD55 ^ 0xCC2A] = 0x7813 ^ 0xCC2A;
        v_0.F[0x8AA4 ^ 0x8AF9] = 0x8A44 ^ 0x8AF9;
        v_0.F[0x4D04 ^ 0x4D01] = 0xFFFFB2F4 ^ 0x4D01;
        v_0.F[0x4C5B ^ 0x4CFA] = 0x4CF7 ^ 0x4CFA;
        v_0.F[0x3500 ^ 0x3503] = 0x351B ^ 0x3503;
        v_0.F[0xE42B ^ 0xE4C3] = 0xE4F1 ^ 0xE4C3;
        v_0.F[0x5236 ^ 0x525C] = 0x522E ^ 0x525C;
        v_0.F[0x4BAC ^ 0x4B6C] = 0x4B04 ^ 0x4B6C;
        v_0.F[0x423B ^ 0x427C] = 0x4271 ^ 0x427C;
        v_0.F[0xB7C4 ^ 0xB793] = 0xB79C ^ 0xB793;
        v_0.F[0x7818 ^ 0x782F] = 0xFFFF87BB ^ 0x782F;
        v_0.F[0xFEC1 ^ 0xFFF8] = 0xFFFF006E ^ 0xFFF8;
        v_0.F[0x2481 ^ 0x25BD] = 0x259D ^ 0x25BD;
        v_0.F[0x85F4 ^ 0x85AD] = 0xFFFF7A55 ^ 0x85AD;
        v_0.F[0xAECA ^ 0xAE16] = 0xAE37 ^ 0xAE16;
        v_0.F[0x118C ^ 0x10B8] = 0x10A3 ^ 0x10B8;
        v_0.F[0x176 ^ 0x37] = 0x36 ^ 0x37;
        v_0.F[0x5ABD ^ 0x5A81] = 0x5A65 ^ 0x5A81;
        v_0.F[0xC93 ^ 0xD1D] = 0x90C1 ^ 0xD1D;
        v_0.F[0x8527 ^ 0x85C2] = 0x85F2 ^ 0x85C2;
        v_0.F[0x5233 ^ 0x5363] = 0xFFFF411C ^ 0x5363;
        v_0.F[0x63F7 ^ 0x6305] = 0xFFFF9C94 ^ 0x6305;
        v_0.F[0x5983 ^ 0x58D2] = 0xB52E ^ 0x58D2;
        v_0.F[0xFCA9 ^ 0xFCB1] = 0xFFFF03EB ^ 0xFCB1;
        v_0.F[0x495A ^ 0x497D] = 0xFFFFB5B7 ^ 0x497D;
        v_0.F[0x4CB0 ^ 0x4C84] = 0x4CCC ^ 0x4C84;
        v_0.F[0x9EFF ^ 0x9E0C] = 0xFFFF61FA ^ 0x9E0C;
        v_0.F[0xC3FE ^ 0xC361] = 0xC35A ^ 0xC361;
        v_0.F[0xCC44 ^ 0xCCCD] = 0xCCC4 ^ 0xCCCD;
        v_0.F[0xBA0 ^ 0xB23] = 0xB1C ^ 0xB23;
        v_0.F[0x4B28 ^ 0x4B3B] = 0x4B6B ^ 0x4B3B;
        v_0.F[0xC786 ^ 0xC60D] = 0x4249 ^ 0xC60D;
        v_0.F[0x93EF ^ 0x9338] = 0x935C ^ 0x9338;
        v_0.F[0xDE59 ^ 0xDE78] = 0xDE57 ^ 0xDE78;
        v_0.F[0x76A6 ^ 0x76F5] = 0x76E8 ^ 0x76F5;
        v_0.F[0x70D1 ^ 0x71F4] = 0x71E9 ^ 0x71F4;
        v_0.F[0x7EF4 ^ 0x7E76] = 0xFFFF81A3 ^ 0x7E76;
        v_0.F[0x9B05 ^ 0x9BC0] = 0xFFFF6447 ^ 0x9BC0;
        v_0.F[0x7677 ^ 0x767B] = 0xFFFF89C9 ^ 0x767B;
        v_0.F[0xFD54 ^ 0xFD33] = 0xFFFF029C ^ 0xFD33;
        v_0.F[0xA6BA ^ 0xA7C7] = 0x4BD8 ^ 0xA7C7;
        v_0.F[0x749E ^ 0x748B] = 0x74E3 ^ 0x748B;
        v_0.F[0x5FCD ^ 0x5ED5] = 0x5ED7 ^ 0x5ED5;
        v_0.F[0xB328 ^ 0xB206] = 0xFFFF4DD4 ^ 0xB206;
        v_0.F[0xF87B ^ 0xF8C6] = 0xFFFF0786 ^ 0xF8C6;
        v_0.F[0x1241 ^ 0x12B7] = 0x1298 ^ 0x12B7;
        v_0.F[0x8875 ^ 0x88EF] = 0x88ED ^ 0x88EF;
        v_0.F[0xFC89 ^ 0xFCDF] = 0xFFFF037C ^ 0xFCDF;
        v_0.F[0xE52 ^ 0xE96] = 0xEC0 ^ 0xE96;
        v_0.F[0x3FE8 ^ 0x3EC7] = 0xFFFFC10B ^ 0x3EC7;
    }
}

