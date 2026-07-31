/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1921
 *  net.minecraft.class_243
 *  net.minecraft.class_2960
 *  net.minecraft.class_4587$class_4665
 *  net.minecraft.class_4588
 *  net.minecraft.class_4597
 *  net.minecraft.class_4597$class_4598
 *  net.minecraft.class_638
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
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.events.B;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.render.H;
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
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9799;
import net.minecraft.client.render.RainRenderLayers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionfc;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001CB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002\u00a2\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b+\u0010\u0003R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b6\u00107R$\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u000f08j\b\u0012\u0004\u0012\u00020\u000f`98\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bA\u0010B\u00a8\u0006D"}, d2={"Lkotakbaz/rain/module/modules/render/WorldParticlesModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/Render3DEvent;", "event", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_243;", "playerPos", "spawnParticle", "(Lnet/minecraft/class_243;)V", "Lkotakbaz/rain/module/modules/render/WorldParticlesModule$WorldParticle;", "particle", "", "now", "", "updateParticle", "(Lkotakbaz/rain/module/modules/render/WorldParticlesModule$WorldParticle;Lnet/minecraft/class_243;J)Z", "Lnet/minecraft/class_4588;", "buffer", "cameraPos", "Ljava/awt/Color;", "color", "renderParticle", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/WorldParticlesModule$WorldParticle;Lnet/minecraft/class_243;Ljava/awt/Color;)V", "Lnet/minecraft/class_2960;", "selectedTexture", "()Lnet/minecraft/class_2960;", "selectedColor", "()Ljava/awt/Color;", "origin", "", "range", "randomTargetAround", "(Lnet/minecraft/class_243;D)Lnet/minecraft/class_243;", "", "value", "smoothstep", "(F)F", "clearState", "Lkotakbaz/rain/module/setting/ModeSetting;", "particleType", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "spawnCount", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "particleColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "particles", "Ljava/util/ArrayList;", "Lnet/minecraft/class_638;", "trackedWorld", "Lnet/minecraft/class_638;", "lastSimulationAt", "J", "spawnCarry", "D", "WorldParticle", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nWorldParticlesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorldParticlesModule.kt\nkotakbaz/rain/module/modules/render/WorldParticlesModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n1915#2,2:292\n*S KotlinDebug\n*F\n+ 1 WorldParticlesModule.kt\nkotakbaz/rain/module/modules/render/WorldParticlesModule\n*L\n104#1:292,2\n*E\n"})
public final class D
extends a_0 {
    @NotNull
    public static final D INSTANCE;
    @NotNull
    private static final kotakbaz.rain.module.setting.c a;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 A;
    @NotNull
    private static final c b;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.B B;
    @NotNull
    private static final ArrayList<H> c;
    @Nullable
    private static class_638 C;
    private static long d;
    private static double D;
    private static Object[] e;
    private static Object f;
    private static Object[] F;
    private static Object[] E;
    private static Object[] g;
    public static int[] G;

    private D() {
        int n = G[0];
        n -= G[1];
        int n2 = G[3];
        n2 -= G[4];
        int n3 = G[6];
        n3 += G[7];
        super((String)e[n ^= G[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)e[n2 += G[5]] + (String)e[n3 -= G[8]]);
    }

    @Override
    public void onEnable() {
        this.clearState();
    }

    @Override
    public void onDisable() {
        this.clearState();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull B b2) {
        Object object;
        Object object2;
        long l = 885426007252938780L;
        long l2 = 5922111953205251409L;
        int n = G[9];
        n += G[10];
        Intrinsics.checkNotNullParameter(b2, (String)e[n -= G[11]]);
        if (!this.isEnabled()) {
            return;
        }
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            D d2 = this;
            long l3 = l;
            int n2 = G[12];
            n2 += G[13];
            l = l3 ^ (0L ^ l3) & -1L << (n2 ^= G[14]);
            d2.clearState();
            return;
        }
        class_638 class_6383 = class_6382;
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_7462 == null) {
            return;
        }
        class_746 class_7463 = class_7462;
        if (C != class_6383) {
            this.clearState();
            C = class_6383;
        }
        long l4 = System.currentTimeMillis();
        class_243 class_2432 = class_7463.method_30950(b2.getPartialTicks());
        long l5 = RangesKt.coerceAtLeast(l4 - d, 0L);
        long l6 = Math.min(l5, 100L);
        if (d == 0L) {
            d = l4;
        } else {
            double d3 = (double)l6 / Double.longBitsToDouble(0xE3D53A07E8226CE0L ^ 0xA35A7A07E8226CE0L);
            D += d3 * ((Number)A.getValue()).doubleValue() * Double.longBitsToDouble(0x147A32A050BF5C2CL ^ 0x545E32A050BF5C2CL);
            while (D >= 1.0) {
                Intrinsics.checkNotNull(class_2432);
                this.spawnParticle(class_2432);
                D -= 1.0;
            }
            Iterator<H> iterator2 = c.iterator();
            int n3 = G[15];
            n3 ^= G[16];
            Intrinsics.checkNotNullExpressionValue(iterator2, (String)e[n3 -= G[17]]);
            object2 = iterator2;
            while (object2.hasNext()) {
                Object e2 = object2.next();
                int n4 = G[18];
                n4 ^= G[19];
                Intrinsics.checkNotNullExpressionValue(e2, (String)e[n4 -= G[20]]);
                object = (H)e2;
                Intrinsics.checkNotNull(class_2432);
                if (this.updateParticle((H)object, class_2432, l4)) continue;
                object2.remove();
            }
            d = l4;
        }
        if (c.isEmpty()) {
            return;
        }
        class_243 class_2433 = b_0.getMc().field_1773.method_19418().method_19326();
        class_1921 class_19212 = RainRenderLayers.getTrailSprite(this.selectedTexture());
        object2 = this.selectedColor();
        int n5 = G[21];
        n5 ^= G[22];
        object = (AutoCloseable)new class_9799(n5 ^= G[23]);
        Throwable throwable = null;
        try {
            Object object3 = (class_9799)object;
            long l7 = l;
            int n6 = G[24];
            n6 ^= G[25];
            l = l7 ^ (0L ^ l7) & -1L >>> (n6 -= G[26]);
            class_4597.class_4598 class_45982 = class_4597.method_22991((class_9799)object3);
            class_4588 class_45882 = class_45982.getBuffer(class_19212);
            Iterable iterable = c;
            long l8 = l2;
            int n7 = G[27];
            n7 ^= G[28];
            l2 = l8 ^ (0L ^ l8) & -1L << (n7 -= G[29]);
            for (Object t2 : iterable) {
                H h2 = (H)t2;
                long l9 = l2;
                int n8 = G[30];
                n8 ^= G[31];
                l2 = l9 ^ (0L ^ l9) & -1L >>> (n8 -= G[32]);
                if (h2.getAlpha() <= 0.0f || h2.getSize() <= 0.0f) continue;
                Intrinsics.checkNotNull(class_45882);
                Intrinsics.checkNotNull(class_2433);
                INSTANCE.renderParticle(b2, class_45882, h2, class_2433, (Color)object2);
            }
            class_45982.method_22994(class_19212);
            object3 = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally((AutoCloseable)object, throwable);
        }
    }

    private final void spawnParticle(class_243 class_2432) {
        int n = G[33];
        n += G[34];
        if (c.size() >= (n -= G[35])) {
            return;
        }
        double d2 = Random.Default.nextDouble() * Double.longBitsToDouble(0x356FCF44F8814DA4L ^ 0x7566EEBFACC560BCL) * Double.longBitsToDouble(0xB32598A12B96B785L ^ 0xF32598A12B96B785L);
        double d3 = Random.Default.nextDouble() * Double.longBitsToDouble(0x131BC287E8F48116L ^ 0x534FC287E8F48116L);
        double d4 = class_2432.field_1352 + Math.cos(d2) * d3;
        double d5 = class_2432.field_1350 + Math.sin(d2) * d3;
        double d6 = class_2432.field_1351 + (Random.Default.nextDouble() - Double.longBitsToDouble(0x5A8548D3098C6603L ^ 0x656548D3098C6603L)) * Double.longBitsToDouble(0xCCBB35BF00D91EC4L ^ 0x8C8F35BF00D91EC4L);
        class_243 class_2433 = new class_243(d4, d6, d5);
        long l = System.currentTimeMillis();
        int n2 = G[36];
        n2 -= G[37];
        c.add(new H(class_2433, this.randomTargetAround(class_2433, Double.longBitsToDouble(0x3EA734F75D87D2A3L ^ 0x7EAF34F75D87D2A3L)), new class_243((Random.Default.nextDouble() - Double.longBitsToDouble(0xF62BAF34A1FB751L ^ 0x3082BAF34A1FB751L)) * Double.longBitsToDouble(0xF0A8AA12256561C7L ^ 0xCFC03966990F1F3DL), (Random.Default.nextDouble() - Double.longBitsToDouble(0x42C773C9EB20376L ^ 0x3BCC773C9EB20376L)) * Double.longBitsToDouble(0x4064C1B44A251CE7L ^ 0x7F0C52C0F64F621DL), (Random.Default.nextDouble() - Double.longBitsToDouble(0x583587549942C612L ^ 0x67D587549942C612L)) * Double.longBitsToDouble(0xD5E61C4720410A75L ^ 0xEA8E8F339C2B748FL)), l, l, l, 0.0f, 0.0f, n2 -= G[38], null));
    }

    private final boolean updateParticle(H h2, class_243 class_2432, long l) {
        double d2;
        long l2 = l - h2.getCreatedAt();
        if (l2 > 5000L) {
            boolean bl = G[39];
            bl += G[40];
            return bl ^= G[41];
        }
        if (class_2432.method_1022(h2.getPosition()) > Double.longBitsToDouble(0x77B24343F074C779L ^ 0x378C4343F074C779L)) {
            boolean bl = G[42];
            bl -= G[43];
            return bl ^= G[44];
        }
        float f2 = Math.min(5000.0f, (float)l2) / 5000.0f;
        h2.setAlpha(f2 < 0.15f ? this.smoothstep(RangesKt.coerceIn(f2 / 0.15f, 0.0f, 1.0f)) : (f2 > 0.7f ? this.smoothstep(RangesKt.coerceIn((1.0f - f2) / 0.3f, 0.0f, 1.0f)) : 1.0f));
        h2.setSize(0.2f * Math.max(0.0f, 1.0f - (float)l2 / 5000.0f));
        double d3 = RangesKt.coerceIn((double)(l - h2.getLastUpdateAt()) / Double.longBitsToDouble(0x6F7C0C55A895F242L ^ 0x2F4CA6FF023F3D13L), Double.longBitsToDouble(0xBB457B64B85A4AC5L ^ 0x84A57B64B85A4AC5L), Double.longBitsToDouble(0x781EF0036A9E819CL ^ 0x381EF0036A9E819CL));
        h2.setLastUpdateAt(l);
        class_243 class_2433 = h2.getTarget().method_1020(h2.getPosition());
        double d4 = Double.longBitsToDouble(0x2F8076F6E236E166L ^ 0x10B3DFDCD263D307L);
        double d5 = Double.longBitsToDouble(0x2426E5E3FFEDB83CL ^ 0x1B221D56770ED0CDL);
        double d6 = Double.longBitsToDouble(0x787D9AC29458A0C6L ^ 0x47924DC8A9280311L);
        double d7 = Double.longBitsToDouble(0xAE5606F725BC7DCEL ^ 0x91D46860A8F3A2F5L);
        if (f2 > 0.8f) {
            d4 *= Double.longBitsToDouble(0xFA94FC366632C5B1L ^ 0xC54D65AFFFAB5C2BL);
            d5 *= Double.longBitsToDouble(0x9D30D86283827A72L ^ 0xA2D0D86283827A72L);
            d6 = Double.longBitsToDouble(0xDC8DA90D45912ED0L ^ 0xE3624690F7BC2086L);
            float f3 = RangesKt.coerceIn((f2 - 0.8f) / 0.2f, 0.0f, 1.0f);
            double d8 = 1.0 - Double.longBitsToDouble(0xCFBDFC4F7607ECA5L ^ 0xF05B9A2910618AC3L) * (double)f3;
            d7 *= Math.max(Double.longBitsToDouble(0x234AFAA3F02057E6L ^ 0x1C99C990C31364D5L), d8);
        }
        class_243 class_2434 = h2.getVelocity().method_1019(class_2433.method_1021(d4 * d3)).method_1031(0.0, -d5 * d3, 0.0);
        int n = G[45];
        n ^= G[46];
        Intrinsics.checkNotNullExpressionValue(class_2434, (String)e[n += G[47]]);
        h2.setVelocity(class_2434);
        double d9 = Math.sqrt(h2.getVelocity().field_1352 * h2.getVelocity().field_1352 + h2.getVelocity().field_1351 * h2.getVelocity().field_1351 + h2.getVelocity().field_1350 * h2.getVelocity().field_1350);
        if (d9 > d7) {
            d2 = d7 / d9;
            class_243 class_2435 = h2.getVelocity().method_1021(d2);
            int n2 = G[48];
            n2 ^= G[49];
            Intrinsics.checkNotNullExpressionValue(class_2435, (String)e[n2 -= G[50]]);
            h2.setVelocity(class_2435);
        }
        d2 = Math.pow(d6, d3);
        class_243 class_2436 = h2.getVelocity().method_1021(d2);
        int n3 = G[51];
        n3 -= G[52];
        Intrinsics.checkNotNullExpressionValue(class_2436, (String)e[n3 -= G[53]]);
        h2.setVelocity(class_2436);
        class_243 class_2437 = h2.getPosition().method_1019(h2.getVelocity().method_1021(d3));
        int n4 = G[54];
        n4 ^= G[55];
        Intrinsics.checkNotNullExpressionValue(class_2437, (String)e[n4 += G[56]]);
        h2.setPosition(class_2437);
        if (f2 <= 0.8f && class_2433.method_1027() < Double.longBitsToDouble(0xAE5661D3E511E864L ^ 0x91921B32A2BFFC1FL) && l - h2.getLastRetargetAt() > 900L) {
            h2.setTarget(this.randomTargetAround(h2.getPosition(), Double.longBitsToDouble(0x1AE8DBFEE1B4AC77L ^ 0x25014267782D35EDL)));
            h2.setLastRetargetAt(l);
        }
        boolean bl = G[57];
        bl -= G[58];
        return bl -= G[59];
    }

    private final void renderParticle(B b2, class_4588 class_45882, H h2, class_243 class_2432, Color color) {
        long l = -899437286673523455L;
        long l2 = -7338289827420974603L;
        long l3 = -8604574581095090238L;
        int n = G[60];
        n -= G[61];
        n ^= G[62];
        int n2 = G[63];
        n2 ^= G[64];
        n2 += G[65];
        int n3 = G[66];
        n3 ^= G[67];
        long l4 = l3;
        int n4 = G[69];
        n4 -= G[70];
        l3 = l4 ^ ((long)RangesKt.coerceIn((int)(255.0f * h2.getAlpha()), n, n2) << (n3 -= G[68]) ^ l4) & -1L << (n4 -= G[71]);
        float f2 = h2.getSize();
        b2.getMatrices().method_22903();
        b2.getMatrices().method_22904(h2.getPosition().field_1352 - class_2432.field_1352, h2.getPosition().field_1351 - class_2432.field_1351, h2.getPosition().field_1350 - class_2432.field_1350);
        b2.getMatrices().method_22907((Quaternionfc)b_0.getMc().field_1773.method_19418().method_23767());
        class_4587.class_4665 class_46652 = b2.getMatrices().method_23760();
        int n5 = G[72];
        n5 += G[73];
        class_45882.method_56824(class_46652, -f2, f2, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n5 += G[74]))).method_22913(0.0f, 0.0f);
        int n6 = G[75];
        n6 -= G[76];
        class_45882.method_56824(class_46652, f2, f2, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n6 ^= G[77]))).method_22913(1.0f, 0.0f);
        int n7 = G[78];
        n7 -= G[79];
        class_45882.method_56824(class_46652, f2, -f2, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n7 ^= G[80]))).method_22913(1.0f, 1.0f);
        int n8 = G[81];
        n8 += G[82];
        class_45882.method_56824(class_46652, -f2, -f2, 0.0f).method_1336(color.getRed(), color.getGreen(), color.getBlue(), (int)(l3 >>> (n8 -= G[83]))).method_22913(0.0f, 1.0f);
        b2.getMatrices().method_22909();
    }

    private final class_2960 selectedTexture() {
        String string = switch (a.getSelectedIndex()) {
            case 0 -> {
                int var4_1 = G[84];
                var4_1 -= G[85];
                yield (String)e[var4_1 += G[86]];
            }
            case 1 -> {
                int var6_2 = G[87];
                var6_2 -= G[88];
                yield (String)e[var6_2 -= G[89]];
            }
            case 2 -> {
                int var8_3 = G[90];
                var8_3 += G[91];
                yield (String)e[var8_3 += G[92]];
            }
            case 3 -> {
                int var10_4 = G[93];
                var10_4 -= G[94];
                yield (String)e[var10_4 += G[95]];
            }
            case 4 -> {
                int var12_5 = G[96];
                var12_5 ^= G[97];
                yield (String)e[var12_5 -= G[98]];
            }
            case 5 -> {
                int var14_6 = G[99];
                var14_6 += G[100];
                yield (String)e[var14_6 ^= G[101]];
            }
            case 6 -> {
                int var16_7 = G[102];
                var16_7 += G[103];
                yield (String)e[var16_7 -= G[104]];
            }
            case 7 -> {
                int var18_8 = G[105];
                var18_8 -= G[106];
                yield (String)e[var18_8 += G[107]];
            }
            default -> {
                int var20_9 = G[108];
                var20_9 += G[109];
                yield (String)e[var20_9 ^= G[110]];
            }
        };
        int n = G[111];
        n -= G[112];
        n ^= G[113];
        String string2 = string;
        int n2 = G[114];
        n2 ^= G[115];
        int n3 = G[117];
        n3 -= G[118];
        class_2960 class_29602 = class_2960.method_60655((String)((String)e[n]), (String)((String)e[n2 -= G[116]] + (String)e[n3 -= G[119]] + string2));
        int n4 = G[120];
        n4 += G[121];
        Intrinsics.checkNotNullExpressionValue(class_29602, (String)e[n4 += G[122]]);
        return class_29602;
    }

    private final Color selectedColor() {
        return (Boolean)b.getValue() != false && P.INSTANCE.isEnabled() ? P.INSTANCE.getClientColor() : (Color)B.getValue();
    }

    private final class_243 randomTargetAround(class_243 class_2432, double d2) {
        class_243 class_2433 = class_2432.method_1031((Random.Default.nextDouble() - Double.longBitsToDouble(0xABB438924B5E4414L ^ 0x945438924B5E4414L)) * d2, (Random.Default.nextDouble() - Double.longBitsToDouble(0x6F6563610EEF9001L ^ 0x508563610EEF9001L)) * d2, (Random.Default.nextDouble() - Double.longBitsToDouble(0x435CA4095D9DA8DL ^ 0x3BD5CA4095D9DA8DL)) * d2);
        int n = G[123];
        n ^= G[124];
        Intrinsics.checkNotNullExpressionValue(class_2433, (String)e[n ^= G[125]]);
        return class_2433;
    }

    private final float smoothstep(float f2) {
        return f2 * f2 * (3.0f - 2.0f * f2);
    }

    private final void clearState() {
        c.clear();
        C = b_0.getMc().field_1687;
        d = 0L;
        D = 0.0;
    }

    private static final boolean particleColor$lambda$0() {
        int n;
        if (!((Boolean)b.getValue()).booleanValue() || !P.INSTANCE.isEnabled()) {
            int n2 = G[126];
            n2 += G[127];
            n = n2 += G[128];
        } else {
            int n3 = G[129];
            n3 -= G[130];
            n = n3 -= G[131];
        }
        return n != 0;
    }

    static {
        kotakbaz.rain.module.modules.render.D.b();
        long l = 5686319763868675748L;
        long l2 = -4764262287029706884L;
        long l3 = -1123910827804651625L;
        long l4 = -4669551747896616204L;
        long l5 = -8961029175160296164L;
        long l6 = 2258402682015392714L;
        long l7 = -80527375031407630L;
        long l8 = 6140442932451356909L;
        long l9 = -8795552897275662634L;
        long l10 = 3450378164065252433L;
        long l11 = 2073996565429103965L;
        long l12 = -6314177825336983585L;
        long l13 = -7328170732136700924L;
        long l14 = -7666875086280440403L;
        int n = G[132];
        n ^= G[133];
        e = new Object[n ^= G[134]];
        long l15 = l14;
        int n2 = G[135];
        n2 += G[136];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= G[137]);
        Object[] objectArray = new Object[G[138]];
        objectArray[kotakbaz.rain.module.modules.render.D.G[139]] = E;
        objectArray[kotakbaz.rain.module.modules.render.D.G[140]] = G[141];
        int n3 = G[142];
        Object object = kotakbaz.rain.module.modules.render.D.A()[G[143]];
        if (object == null) {
            char[] cArray = "\u350a\u3518\u351c\u351a\u1d4b\u343e\u3514\u343f\u3514\u3502\u3434\u3435\u1d7b\u3500\u3502\u343f\u1d76\u3438\u350a\u206f\u350c\u1d7e\u351b\u206a\u206f\u3434\u3434\u1d7a\u3438\u3519\u351d\u3513\u3515\u351a\u1d7a\u351d\u350e\u3514\u206c\u1d40\u206c\u1d43\u3432\u34e0\u3515\u3512\u1d7f\u351d\u3438\u3434\u1d7e\u34eb\u343d\u3501\u1d75\u1d7e\u3511\u3435\u1d7b\u351b\u1d43\u343a\u350d\u3510\u1d7d\u351a\u3516\u3516\u1d7a\u2071\u1d7e\u1d78\u1d76\u3501\u1d43\u1d76\u3502\u3518\u3515\u3438\u350f\u3438\u206c\u34e0\u1d73\u351d\u1d73\u350d\u1d7f\u1d40\u1d73\u1d73\u3518\u350c\u3511\u343e\u1d77\u1d43\u1d41\u351f\u3513\u351b\u3501\u1d76\u3517\u1d75\u3434\u3513\u1d79\u1d40\u1d70\u3511\u343e\u1d77\u1d7f\u351f\u206c\u1d76\u3500\u3438\u3438\u3434\u3514\u351c\u206f\u1d79\u350d\u1d75\u343c\u343d\u351f\u34e3\u3435\u350c\u350d\u1d4b\u1d7c\u3502\u351d\u3519\u1d70\u1d79\u3515\u343f\u343c\u3435\u1d43\u1d41\u1d7c\u3510\u351a\u3434\u1d41\u1d7d\u1d70\u34e3\u1d73\u34e2\u3435\u351a\u206a\u343a\u34e0\u343e\u3519\u3432\u1d78\u34e2\u1d7a\u1d76\u1d75\u350d\u3503\u3500\u3511\u350a\u1d43\u1d79\u3502\u1d41\u350e\u34e1\u3434\u351c\u3512\u206a\u3512\u351f\u3435\u351c\u1d76\u1d73\u1d76\u1d78\u3502\u1d70\u1d7c\u1d41\u1d40\u1d40\u1d7b\u3511\u1d75\u3502\u3519\u350d\u1d76\u2071\u351d\u3432\u206e\u351a\u1d7a\u3501\u1d7a\u350c\u3519\u3514\u3518\u34e2\u1d73\u1d43\u206d\u1d70\u1d7c\u351a\u350d\u1d79\u1d4b\u34e0\u1d41\u206a\u350e\u351c\u206e\u1d41\u1d41\u206d\u3434\u343a\u3500\u350d\u1d79\u206c\u351f\u34e3\u3517\u1d7b\u1d78\u1d41\u1d7a\u1d75\u34e3\u1d41\u3503\u3513\u3502\u3517\u1d72\u3500\u350c\u1d41\u1d7b\u351a\u1d76\u3435\u3501\u3514\u1d77\u351a\u1d78\u343d\u1d76\u3510\u343d\u1d43\u34e0\u1d4b\u34e3\u1d76\u3514\u34e3\u206a\u350d\u3500\u3501\u3514\u1d79\u1d40\u3502\u3500\u1d41\u1d74\u351a\u3513\u1d7d\u3438\u1d70\u351d\u3432\u3510\u3502\u3435\u350e\u3432\u3519\u1d7d\u350e\u350c\u3514\u351c\u3503\u3519\u1d72\u3512\u351d\u351e\u1d79\u206c\u1d4b\u3501\u343d\u3434\u3515\u1d7e\u1d78\u206c\u206a\u34e2\u350f\u343a\u343c\u1d74\u1d79\u1d7d\u34e1\u1d40\u343e\u3510\u1d74\u1d7a\u3514\u1d7c\u34eb\u3513\u1d41\u1d7e\u1d77\u3519\u3500\u206d\u206d\u1d4b\u206a\u3518\u3503\u1d7a\u343f\u1d43\u3438\u343a\u1d76\u34e1\u351b\u2071\u34eb\u1d7b\u1d77\u3511\u1d72\u3512\u1d76\u1d43\u3501\u1d7a\u2071\u3516\u34e0\u343e\u351a\u3517\u1d74\u3517\u1d75\u3517\u206a\u1d7f\u3435\u1d74\u206e\u351c\u34e0\u343a\u350c\u3517\u350f\u34eb\u350f\u34e0\u3517\u3512\u3501\u343d\u34e1\u34eb\u3432\u343a\u3511\u343e\u3501\u351b\u1d77\u351f\u206d\u3514\u3513\u206c\u206f\u206f\u1d79\u3435\u1d41\u1d40\u343d\u343d\u3516\u3435\u3434\u2071\u34e1\u343a\u351d\u3517\u3517\u351c\u3434\u3514\u350e\u1d4b\u206f\u206a\u3502\u1d40\u34e3\u1d7b\u1d75\u206a\u351e\u3435\u3515\u1d43\u1d4b\u351a\u34e1\u1d79\u3519\u1d74\u351c\u350e\u1d78\u3500\u3503\u34e3\u351a\u1d70\u343e\u3510\u350a\u3518\u3514\u351a\u351c\u3512\u3519\u3435\u34e3\u1d7a\u1d4b\u3500\u351f\u34eb\u1d75\u3514\u351d\u3510\u3435\u1d70\u1d72\u1d7c\u351a\u1d43\u3512\u3502\u2071\u1d79\u350c\u3512\u1d78\u206c\u343a\u1d40\u206c\u351f\u1d43\u206f\u3516\u34e0\u34e0\u206f\u2071\u206f\u1d43\u3500\u1d41\u3516\u350d\u34e1\u1d4b\u3502\u3500\u1d40\u1d78\u351d\u351b\u3510\u343a\u34eb\u3513\u1d4b\u1d7c\u3519\u206e\u1d74\u1d43\u1d73\u1d72\u1d73\u350f\u1d4b\u3438\u351b\u3500\u1d79\u350a\u343d\u3435\u3513\u3515\u351f\u350f\u206a\u351c\u34e3\u343f\u350e\u351e\u1d74\u1d78\u3519\u1d72\u1d7c\u350e\u343c\u206c\u350c\u2071\u1d70\u1d7e\u1d74\u1d7c\u350a\u3512\u34eb\u351f\u3435\u1d79\u1d41\u1d78\u351d\u3510\u351e\u3510\u3502\u206e\u3511\u350a\u1d70\u3517\u1d4b\u1d43\u206c\u351e\u3438\u351b\u3438\u351a\u1d7e\u350c\u1d7e\u34e1\u1d7e\u1d73\u3432\u1d78\u351b\u34eb\u3503\u1d73\u3510\u351a\u3432\u3513\u3514\u1d75\u1d72\u3518\u1d70\u1d74\u3438\u3438\u1d79\u1d7a\u1d79\u3516\u1d40\u350e\u3519\u3512\u34eb\u343e\u1d7e\u1d74\u343e\u3503\u34e0\u1d76\u1d7a\u351b\u206d\u1d73\u3503\u1d79\u350e\u1d76\u1d74\u3510\u350c\u3519\u343e\u1d43\u351e\u1d72\u343f\u1d7d\u206d\u1d70\u3513\u3432\u351d\u206e\u1d70\u206f\u1d79\u3511\u350e\u206c\u1d43\u343d\u351f\u206d\u351a\u3432\u343d\u343f\u3513\u3438\u1d70\u2071\u350e\u3502\u1d7b\u34e3\u34e0\u1d7c\u34e1\u3513\u1d76\u343e\u34e3\u350e\u1d7b\u3438\u343e\u3517\u1d79\u3435\u1d40\u1d7b\u206e\u3511\u34e1\u1d7e\u351b\u351d\u351e\u206d\u1d74\u1d7c\u343a\u1d78\u351d\u34eb\u351c\u350a\u3516\u1d4b\u206f\u1d41\u351f\u1d7c\u1d77\u343a\u3435\u3511\u3516\u3512\u3506\u3506".toCharArray();
            for (int i2 = G[144]; i2 < G[145]; ++i2) {
                int n4 = cArray[i2];
                n4 -= G[146];
                n4 ^= G[147];
                n4 += G[148];
                n4 += G[149];
                n4 -= G[150];
                n4 -= G[151];
                n4 ^= G[152];
                n4 ^= G[153];
                n4 += G[154];
                n4 -= G[155];
                n4 -= G[156];
                n4 ^= G[157];
                n4 ^= G[158];
                cArray[i2] = (char)(n4 -= G[159]);
            }
            object = kotakbaz.rain.module.modules.render.D.A()[kotakbaz.rain.module.modules.render.D.G[160]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.module.modules.render.D.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = G[161];
        n5 += G[162];
        l5 = l16 ^ (0x19D00000000L ^ l16) & -1L << (n5 ^= G[163]);
        long l17 = l12;
        int n6 = G[164];
        n6 ^= G[165];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= G[166]);
        while (true) {
            int n7 = G[167];
            n7 -= G[168];
            if ((int)l12 >= (int)(l5 >>> (n7 -= G[169]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = G[170];
            n9 -= G[171];
            int n10 = G[173];
            n10 ^= G[174];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= G[172])) & -1L >>> (n10 -= G[175]);
            long l19 = l8;
            int n11 = G[176];
            n11 -= G[177];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += G[178]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = G[179];
            n13 += G[180];
            int n14 = G[182];
            n14 ^= G[183];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= G[181])) & -1L >>> (n14 -= G[184]);
            int n15 = G[185];
            n15 ^= G[186];
            long l21 = l9;
            int n16 = G[188];
            n16 ^= G[189];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= G[187]) ^ l21) & -1L << (n16 ^= G[190]);
            int n17 = G[191];
            n17 -= G[192];
            n17 ^= G[193];
            int n18 = G[194];
            n18 -= G[195];
            long l22 = l11;
            int n19 = G[197];
            n19 ^= G[198];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= G[196]))) ^ l22) & -1L >>> (n19 ^= G[199]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = G[200];
            n20 += G[201];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= G[202]);
            while (true) {
                int n21 = G[203];
                n21 -= G[204];
                if ((int)(l13 >>> (n21 ^= G[205])) >= (int)l11) break;
                int n22 = G[206];
                n22 ^= G[207];
                int n23 = G[209];
                n23 += G[210];
                cArray2[(int)(l13 >>> (n22 += kotakbaz.rain.module.modules.render.D.G[208]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += G[211]))];
                l13 += 0x100000000L;
            }
            int n24 = G[212];
            n24 ^= G[213];
            int n25 = (int)(l14 >>> (n24 -= G[214]));
            l14 += 0x100000000L;
            kotakbaz.rain.module.modules.render.D.e[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = G[215];
            n26 += G[216];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= G[217]);
        }
        INSTANCE = new D();
        int n27 = G[218];
        n27 += G[219];
        n27 ^= G[220];
        int n28 = G[221];
        n28 -= G[222];
        String[] stringArray = new String[n28 -= G[223]];
        int n29 = G[224];
        n29 ^= G[225];
        int n30 = G[227];
        n30 ^= G[228];
        stringArray[n29 ^= kotakbaz.rain.module.modules.render.D.G[226]] = (String)e[n30 += G[229]];
        int n31 = G[230];
        n31 -= G[231];
        int n32 = G[233];
        n32 ^= G[234];
        stringArray[n31 += kotakbaz.rain.module.modules.render.D.G[232]] = (String)e[n32 += G[235]];
        int n33 = G[236];
        n33 += G[237];
        int n34 = G[239];
        n34 ^= G[240];
        stringArray[n33 ^= kotakbaz.rain.module.modules.render.D.G[238]] = (String)e[n34 ^= G[241]];
        int n35 = G[242];
        n35 += G[243];
        int n36 = G[245];
        n36 ^= G[246];
        stringArray[n35 -= kotakbaz.rain.module.modules.render.D.G[244]] = (String)e[n36 += G[247]];
        int n37 = G[248];
        n37 ^= G[249];
        int n38 = G[251];
        n38 -= G[252];
        stringArray[n37 -= kotakbaz.rain.module.modules.render.D.G[250]] = (String)e[n38 += G[253]];
        int n39 = G[254];
        n39 ^= G[255];
        int n40 = G[257];
        n40 -= G[258];
        stringArray[n39 ^= kotakbaz.rain.module.modules.render.D.G[256]] = (String)e[n40 ^= G[259]];
        int n41 = G[260];
        n41 ^= G[261];
        int n42 = G[263];
        n42 -= G[264];
        stringArray[n41 -= kotakbaz.rain.module.modules.render.D.G[262]] = (String)e[n42 ^= G[265]];
        int n43 = G[266];
        n43 ^= G[267];
        int n44 = G[269];
        n44 ^= G[270];
        stringArray[n43 += kotakbaz.rain.module.modules.render.D.G[268]] = (String)e[n44 ^= G[271]];
        int n45 = G[272];
        n45 ^= G[273];
        int n46 = G[275];
        n46 ^= G[276];
        a = a_0.mode$default(INSTANCE, (String)e[n27], CollectionsKt.listOf(stringArray), n45 -= G[274], n46 += G[277], null);
        int n47 = G[278];
        n47 += G[279];
        int n48 = G[281];
        n48 -= G[282];
        A = INSTANCE.slider((String)e[n47 += G[280]] + (String)e[n48 ^= G[283]], 15.0f, 1.0f, 30.0f, 1.0f);
        int n49 = G[284];
        n49 -= G[285];
        boolean bl = G[287];
        bl ^= G[288];
        b = INSTANCE.boolean((String)e[n49 ^= G[286]], bl ^= G[289]);
        int n50 = G[290];
        n50 += G[291];
        String string = (String)e[n50 += G[292]];
        Color color = Color.WHITE;
        int n51 = G[293];
        n51 ^= G[294];
        Intrinsics.checkNotNullExpressionValue(color, (String)e[n51 ^= G[295]]);
        B = INSTANCE.color(string, color).setVisible(D::particleColor$lambda$0);
        c = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[G[296]];
        String string = (String)object[G[297]];
        object = object[G[298]];
        Object[] objectArray = F;
        if (F == null) {
            objectArray = F = new Object[G[299]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[G[300]];
                E = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[G[302] ^ G[303]];
                byArray[kotakbaz.rain.module.modules.render.D.G[304] ^ kotakbaz.rain.module.modules.render.D.G[305]] = G[306] ^ G[307];
                byArray[kotakbaz.rain.module.modules.render.D.G[308] ^ kotakbaz.rain.module.modules.render.D.G[309]] = G[310] ^ G[311];
                byArray[kotakbaz.rain.module.modules.render.D.G[312] ^ kotakbaz.rain.module.modules.render.D.G[313]] = G[314] ^ G[315];
                byArray[kotakbaz.rain.module.modules.render.D.G[316] ^ kotakbaz.rain.module.modules.render.D.G[317]] = G[318] ^ G[319];
                byArray[kotakbaz.rain.module.modules.render.D.G[320] ^ kotakbaz.rain.module.modules.render.D.G[321]] = G[322] ^ G[323];
                byArray[kotakbaz.rain.module.modules.render.D.G[324] ^ kotakbaz.rain.module.modules.render.D.G[325]] = G[326] ^ G[327];
                byArray[kotakbaz.rain.module.modules.render.D.G[328] ^ kotakbaz.rain.module.modules.render.D.G[329]] = G[330] ^ G[331];
                byArray[kotakbaz.rain.module.modules.render.D.G[332] ^ kotakbaz.rain.module.modules.render.D.G[333]] = G[334] ^ G[335];
                byArray[kotakbaz.rain.module.modules.render.D.G[336] ^ kotakbaz.rain.module.modules.render.D.G[337]] = G[338] ^ G[339];
                byArray[kotakbaz.rain.module.modules.render.D.G[340] ^ kotakbaz.rain.module.modules.render.D.G[341]] = G[342] ^ G[343];
                byArray[kotakbaz.rain.module.modules.render.D.G[344] ^ kotakbaz.rain.module.modules.render.D.G[345]] = G[346] ^ G[347];
                byArray[kotakbaz.rain.module.modules.render.D.G[348] ^ kotakbaz.rain.module.modules.render.D.G[349]] = G[350] ^ G[351];
                byArray[kotakbaz.rain.module.modules.render.D.G[352] ^ kotakbaz.rain.module.modules.render.D.G[353]] = G[354] ^ G[355];
                byArray[kotakbaz.rain.module.modules.render.D.G[356] ^ kotakbaz.rain.module.modules.render.D.G[357]] = G[358] ^ G[359];
                byArray[kotakbaz.rain.module.modules.render.D.G[360] ^ kotakbaz.rain.module.modules.render.D.G[361]] = G[362] ^ G[363];
                byArray[kotakbaz.rain.module.modules.render.D.G[364] ^ kotakbaz.rain.module.modules.render.D.G[365]] = G[366] ^ G[367];
                objectArray2[kotakbaz.rain.module.modules.render.D.G[301]] = byArray;
            }
            byte[] byArray = (byte[])object3[G[368]];
            if (f == null) {
                byte[] byArray2 = new byte[G[369] ^ G[370]];
                byArray2[kotakbaz.rain.module.modules.render.D.G[371] ^ kotakbaz.rain.module.modules.render.D.G[372]] = G[373] ^ G[374];
                byArray2[kotakbaz.rain.module.modules.render.D.G[375] ^ kotakbaz.rain.module.modules.render.D.G[376]] = G[377] ^ G[378];
                byArray2[kotakbaz.rain.module.modules.render.D.G[379] ^ kotakbaz.rain.module.modules.render.D.G[380]] = G[381] ^ G[382];
                byArray2[kotakbaz.rain.module.modules.render.D.G[383] ^ kotakbaz.rain.module.modules.render.D.G[384]] = G[385] ^ G[386];
                byArray2[kotakbaz.rain.module.modules.render.D.G[387] ^ kotakbaz.rain.module.modules.render.D.G[388]] = G[389] ^ G[390];
                byArray2[kotakbaz.rain.module.modules.render.D.G[391] ^ kotakbaz.rain.module.modules.render.D.G[392]] = G[393] ^ G[394];
                byArray2[kotakbaz.rain.module.modules.render.D.G[395] ^ kotakbaz.rain.module.modules.render.D.G[396]] = G[397] ^ G[398];
                byArray2[kotakbaz.rain.module.modules.render.D.G[399] ^ 0x8D45] = 0x8D5A ^ 0x8D45;
                byArray2[0x2F78 ^ 0x2F70] = 0x2F22 ^ 0x2F70;
                byArray2[0x3659 ^ 0x3655] = 0xFFFFC9EE ^ 0x3655;
                byArray2[0x4C46 ^ 0x4C5E] = 0xFFFFB3CF ^ 0x4C5E;
                byArray2[0x7F20 ^ 0x7F2E] = 0xFFFF8091 ^ 0x7F2E;
                byArray2[0xFDF1 ^ 0xFDF4] = 0xFDCC ^ 0xFDF4;
                byArray2[0x823D ^ 0x8232] = 0xFFFF7D89 ^ 0x8232;
                byArray2[0x10630 ^ 0x10632] = 0x10660 ^ 0x10632;
                byArray2[0x455 ^ 0x446] = 0x417 ^ 0x446;
                byArray2[0x10249 ^ 0x10257] = 0x10239 ^ 0x10257;
                byArray2[0xD23D ^ 0xD239] = 0xFFFF2DB4 ^ 0xD239;
                byArray2[0xCD3C ^ 0xCD20] = 0xCD39 ^ 0xCD20;
                byArray2[0x81AC ^ 0x81A5] = 0x81F9 ^ 0x81A5;
                byArray2[0x5CA4 ^ 0x5CB6] = 0x5C97 ^ 0x5CB6;
                byArray2[0xC357 ^ 0xC35C] = 0xFFFF3CFF ^ 0xC35C;
                byArray2[0x2C87 ^ 0x2C87] = 0xFFFFD37E ^ 0x2C87;
                byArray2[0xF98D ^ 0xF98A] = 0xF982 ^ 0xF98A;
                byArray2[0xECE5 ^ 0xECF0] = 0xFFFF1370 ^ 0xECF0;
                byArray2[0x6E89 ^ 0x6E96] = 0x6ECE ^ 0x6E96;
                byArray2[0x1DF6 ^ 0x1DED] = 0x1DC7 ^ 0x1DED;
                byArray2[0xAA80 ^ 0xAA81] = 0xAA86 ^ 0xAA81;
                byArray2[0xE077 ^ 0xE06E] = 0xE061 ^ 0xE06E;
                byArray2[0xDEC ^ 0xDF8] = 0xD90 ^ 0xDF8;
                byArray2[0x1B82 ^ 0x1B8F] = 0x1B81 ^ 0x1B8F;
                byArray2[0x961 ^ 0x970] = 0xFFFFF6D7 ^ 0x970;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.module.modules.render.D.A()[1];
                if (object4 == null) {
                    char[] cArray = "\ue5e1\ue273\ue270\ue265\ue267\ue543\ue5ec\ue28e\ue275\ue299\ue279\ue292\ue286\ue288\ue558\ue279\ue266\ue536".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 += 43491;
                        n2 ^= 0x3A46;
                        n2 -= 40551;
                        n2 += 51568;
                        n2 += 42224;
                        n2 -= 37393;
                        n2 -= 11315;
                        n2 ^= 0x6EB5;
                        n2 -= 29946;
                        n2 -= 17595;
                        n2 -= 8315;
                        n2 ^= 0x50BD;
                        n2 ^= 0xF95E;
                        cArray[i2] = (char)(n2 += 39327);
                    }
                    object4 = kotakbaz.rain.module.modules.render.D.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[12] = 102;
                byArray4[8] = 126;
                byArray4[1] = 114;
                byArray4[14] = -111;
                byArray4[9] = -89;
                byArray4[0] = -26;
                byArray4[6] = 29;
                byArray4[4] = 126;
                byArray4[5] = 108;
                byArray4[2] = -103;
                byArray4[11] = -87;
                byArray4[13] = -35;
                byArray4[10] = 94;
                byArray4[7] = 59;
                byArray4[3] = 29;
                byArray4[15] = -66;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 8, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.module.modules.render.D.A()[2];
                if (object5 == null) {
                    char[] cArray = "\ub3ce\ub42a\ub3e8".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 32416;
                        n3 -= 32802;
                        n3 -= 1379;
                        n3 -= 50984;
                        n3 ^= 0xFBED;
                        n3 -= 17168;
                        n3 += 58321;
                        n3 -= 45140;
                        n3 ^= 0xD7D5;
                        n3 += 57303;
                        n3 += 46199;
                        n3 -= 60568;
                        n3 ^= 0xBEDC;
                        cArray[i3] = (char)(n3 -= 50397);
                    }
                    object5 = kotakbaz.rain.module.modules.render.D.A()[2] = new String(cArray);
                }
                f = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.module.modules.render.D.A()[3];
            if (object6 == null) {
                char[] cArray = "\u9ca3\u9caf\u9cdd\u9d71\u9cad\u9ca2\u9cad\u9d71\u9cd0\u9cd5\u9cad\u9cdd\u9d7f\u9cd0\u9c83\u9c8c\u9c8c\u9c8b\u9cb6\u9c89".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 33376;
                    n4 -= 56101;
                    n4 += 51398;
                    n4 += 24265;
                    n4 -= 37002;
                    n4 ^= 0xFE6A;
                    n4 += 18251;
                    n4 -= 33325;
                    n4 -= 52974;
                    n4 -= 52752;
                    n4 += 60848;
                    n4 -= 27003;
                    cArray[i4] = (char)(n4 ^= 0xD4DF);
                }
                object6 = kotakbaz.rain.module.modules.render.D.A()[3] = new String(cArray);
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
        G = new int[0xB194 ^ 0xB004];
        kotakbaz.rain.module.modules.render.D.G[0x57D0 ^ 0x56C4] = 0x56C2 ^ 0x56C4;
        kotakbaz.rain.module.modules.render.D.G[0xC362 ^ 0xC24F] = 0xC24F ^ 0xC24F;
        kotakbaz.rain.module.modules.render.D.G[0x3723 ^ 0x3793] = 0x3731 ^ 0x3793;
        kotakbaz.rain.module.modules.render.D.G[0x6780 ^ 0x6798] = 0xFFFF983E ^ 0x6798;
        kotakbaz.rain.module.modules.render.D.G[0x359C ^ 0x357C] = 0xFFFFCACF ^ 0x357C;
        kotakbaz.rain.module.modules.render.D.G[0x476B ^ 0x4730] = 0x4775 ^ 0x4730;
        kotakbaz.rain.module.modules.render.D.G[0xB262 ^ 0xB248] = 0xFFFF4D81 ^ 0xB248;
        kotakbaz.rain.module.modules.render.D.G[0xB332 ^ 0xB30C] = 0xB320 ^ 0xB30C;
        kotakbaz.rain.module.modules.render.D.G[0x6444 ^ 0x6457] = 0xFFFF9BAA ^ 0x6457;
        kotakbaz.rain.module.modules.render.D.G[0xF2BB ^ 0xF225] = 0x4758 ^ 0xF225;
        kotakbaz.rain.module.modules.render.D.G[0x63E9 ^ 0x6310] = 0xFFFF9C9D ^ 0x6310;
        kotakbaz.rain.module.modules.render.D.G[0xEC27 ^ 0xEC3C] = 0xEC77 ^ 0xEC3C;
        kotakbaz.rain.module.modules.render.D.G[0xB1C6 ^ 0xB121] = 0xFFFF4E89 ^ 0xB121;
        kotakbaz.rain.module.modules.render.D.G[0x6458 ^ 0x641F] = 0xFFFF9BAE ^ 0x641F;
        kotakbaz.rain.module.modules.render.D.G[0x2E05 ^ 0x2E5F] = 0xFFFFD1B1 ^ 0x2E5F;
        kotakbaz.rain.module.modules.render.D.G[0x47D ^ 0x573] = 0xFFFFFAE0 ^ 0x573;
        kotakbaz.rain.module.modules.render.D.G[0x12AD ^ 0x1214] = 0xFFFFEDB2 ^ 0x1214;
        kotakbaz.rain.module.modules.render.D.G[0x1FCA ^ 0x1FB3] = 0x1F85 ^ 0x1FB3;
        kotakbaz.rain.module.modules.render.D.G[0xC583 ^ 0xC546] = 0xFFFF3AF5 ^ 0xC546;
        kotakbaz.rain.module.modules.render.D.G[0x4966 ^ 0x4805] = 0x5C86 ^ 0x4805;
        kotakbaz.rain.module.modules.render.D.G[0xC460 ^ 0xC4CB] = 0xC4DA ^ 0xC4CB;
        kotakbaz.rain.module.modules.render.D.G[0x7A8E ^ 0x7B01] = 0xF654 ^ 0x7B01;
        kotakbaz.rain.module.modules.render.D.G[0x30C5 ^ 0x3080] = 0xFFFFCF79 ^ 0x3080;
        kotakbaz.rain.module.modules.render.D.G[0x8E8 ^ 0x987] = 0x6AEC ^ 0x987;
        kotakbaz.rain.module.modules.render.D.G[0x9D8F ^ 0x9DE8] = 0x9DE8 ^ 0x9DE8;
        kotakbaz.rain.module.modules.render.D.G[0x1DF ^ 0x16D] = 0xFFFFFEDE ^ 0x16D;
        kotakbaz.rain.module.modules.render.D.G[0xE632 ^ 0xE6D0] = 0xE6DC ^ 0xE6D0;
        kotakbaz.rain.module.modules.render.D.G[0x10AB2 ^ 0x10AFA] = 0xFFFEF508 ^ 0x10AFA;
        kotakbaz.rain.module.modules.render.D.G[0x2449 ^ 0x2480] = 0xFFFFDB1C ^ 0x2480;
        kotakbaz.rain.module.modules.render.D.G[0x64DE ^ 0x6472] = 0xFFFF9B98 ^ 0x6472;
        kotakbaz.rain.module.modules.render.D.G[0x2280 ^ 0x2268] = 0x2233 ^ 0x2268;
        kotakbaz.rain.module.modules.render.D.G[0x1B8D ^ 0x1B07] = 0x1B04 ^ 0x1B07;
        kotakbaz.rain.module.modules.render.D.G[0xD7EC ^ 0xD69B] = 0x1D52F ^ 0xD69B;
        kotakbaz.rain.module.modules.render.D.G[0x7BA1 ^ 0x7AA0] = 0x7A38 ^ 0x7AA0;
        kotakbaz.rain.module.modules.render.D.G[0x10D52 ^ 0x10C4A] = 0x10C36 ^ 0x10C4A;
        kotakbaz.rain.module.modules.render.D.G[0x10855 ^ 0x1086A] = 0x10926 ^ 0x1086A;
        kotakbaz.rain.module.modules.render.D.G[0xEA64 ^ 0xEB6D] = 0xFFFF14BA ^ 0xEB6D;
        kotakbaz.rain.module.modules.render.D.G[0x9C57 ^ 0x9CF7] = 0x9CF7 ^ 0x9CF7;
        kotakbaz.rain.module.modules.render.D.G[0x53D3 ^ 0x52F6] = 0x52B1 ^ 0x52F6;
        kotakbaz.rain.module.modules.render.D.G[0x792A ^ 0x7991] = 0x79AB ^ 0x7991;
        kotakbaz.rain.module.modules.render.D.G[0xCD9A ^ 0xCD83] = 0xFFFF3258 ^ 0xCD83;
        kotakbaz.rain.module.modules.render.D.G[0xF142 ^ 0xF071] = 0x80FC ^ 0xF071;
        kotakbaz.rain.module.modules.render.D.G[0xB4C5 ^ 0xB473] = 0xFFFF4BBA ^ 0xB473;
        kotakbaz.rain.module.modules.render.D.G[0x593 ^ 0x418] = 0x8DC6 ^ 0x418;
        kotakbaz.rain.module.modules.render.D.G[0xB134 ^ 0xB156] = 0xB14D ^ 0xB156;
        kotakbaz.rain.module.modules.render.D.G[0x88A2 ^ 0x88A3] = 0x88A2 ^ 0x88A3;
        kotakbaz.rain.module.modules.render.D.G[0xD8F5 ^ 0xD810] = 0xFFFF27BE ^ 0xD810;
        kotakbaz.rain.module.modules.render.D.G[0xB52E ^ 0xB5F6] = 0xB5F6 ^ 0xB5F6;
        kotakbaz.rain.module.modules.render.D.G[0x10D8F ^ 0x10D64] = 0xFFFEF29F ^ 0x10D64;
        kotakbaz.rain.module.modules.render.D.G[0xC151 ^ 0xC033] = 0xD49A ^ 0xC033;
        kotakbaz.rain.module.modules.render.D.G[0x3822 ^ 0x38A5] = 0xFFFFC745 ^ 0x38A5;
        kotakbaz.rain.module.modules.render.D.G[0xE023 ^ 0xE10C] = 0x6DA ^ 0xE10C;
        kotakbaz.rain.module.modules.render.D.G[0x6BD ^ 0x6F0] = 0x6FC ^ 0x6F0;
        kotakbaz.rain.module.modules.render.D.G[0xC5D1 ^ 0xC5E2] = 0xC502 ^ 0xC5E2;
        kotakbaz.rain.module.modules.render.D.G[0x77C7 ^ 0x77EE] = 0xFFFF881B ^ 0x77EE;
        kotakbaz.rain.module.modules.render.D.G[0xAFAB ^ 0xAF4A] = 0xFFFF50F5 ^ 0xAF4A;
        kotakbaz.rain.module.modules.render.D.G[0x1A5F ^ 0x1A69] = 0x1A6A ^ 0x1A69;
        kotakbaz.rain.module.modules.render.D.G[0xE8E6 ^ 0xE9A3] = 0xDBEA ^ 0xE9A3;
        kotakbaz.rain.module.modules.render.D.G[0xC349 ^ 0xC343] = 0xC343 ^ 0xC343;
        kotakbaz.rain.module.modules.render.D.G[0x1863 ^ 0x1949] = 0x1949 ^ 0x1949;
        kotakbaz.rain.module.modules.render.D.G[0x4265 ^ 0x4324] = 0xB701 ^ 0x4324;
        kotakbaz.rain.module.modules.render.D.G[0x61E9 ^ 0x60A5] = 0xAF4A ^ 0x60A5;
        kotakbaz.rain.module.modules.render.D.G[0xE854 ^ 0xE874] = 0xE829 ^ 0xE874;
        kotakbaz.rain.module.modules.render.D.G[0x1E5B ^ 0x1E9A] = 0x1EFC ^ 0x1E9A;
        kotakbaz.rain.module.modules.render.D.G[0x4D27 ^ 0x4DB8] = 0xC626 ^ 0x4DB8;
        kotakbaz.rain.module.modules.render.D.G[0x6A1B ^ 0x6A2C] = 0xFFFF95D0 ^ 0x6A2C;
        kotakbaz.rain.module.modules.render.D.G[0xB42E ^ 0xB432] = 0xFFFF4BCD ^ 0xB432;
        kotakbaz.rain.module.modules.render.D.G[0x444 ^ 0x42F] = 0x410 ^ 0x42F;
        kotakbaz.rain.module.modules.render.D.G[0xF9AB ^ 0xF94F] = 0xF93F ^ 0xF94F;
        kotakbaz.rain.module.modules.render.D.G[0x49CD ^ 0x4978] = 0xFFFFB6EC ^ 0x4978;
        kotakbaz.rain.module.modules.render.D.G[0x3393 ^ 0x3283] = 0x32C4 ^ 0x3283;
        kotakbaz.rain.module.modules.render.D.G[0x299B ^ 0x2993] = 0xFFFFD665 ^ 0x2993;
        kotakbaz.rain.module.modules.render.D.G[0x26F2 ^ 0x2771] = 0xA50D ^ 0x2771;
        kotakbaz.rain.module.modules.render.D.G[0x5F5A ^ 0x5E1A] = 0xAA3B ^ 0x5E1A;
        kotakbaz.rain.module.modules.render.D.G[0x1A9 ^ 0x157] = 0x13D ^ 0x157;
        kotakbaz.rain.module.modules.render.D.G[0x3698 ^ 0x36CB] = 0x36DD ^ 0x36CB;
        kotakbaz.rain.module.modules.render.D.G[0x758C ^ 0x74B9] = 0xE831 ^ 0x74B9;
        kotakbaz.rain.module.modules.render.D.G[0xD983 ^ 0xD888] = 0xFFFF2743 ^ 0xD888;
        kotakbaz.rain.module.modules.render.D.G[0x34F2 ^ 0x35AE] = 0x39E3 ^ 0x35AE;
        kotakbaz.rain.module.modules.render.D.G[0x7A28 ^ 0x7A70] = 0xFFFF85F9 ^ 0x7A70;
        kotakbaz.rain.module.modules.render.D.G[0x11CB ^ 0x10C7] = 0x10FA ^ 0x10C7;
        kotakbaz.rain.module.modules.render.D.G[0xF3D3 ^ 0xF35A] = 0xFFFF0C9F ^ 0xF35A;
        kotakbaz.rain.module.modules.render.D.G[0x8AEE ^ 0x8A24] = 0x8A3C ^ 0x8A24;
        kotakbaz.rain.module.modules.render.D.G[0x82F6 ^ 0x82EB] = 0xFFFF7D7F ^ 0x82EB;
        kotakbaz.rain.module.modules.render.D.G[0x1EE6 ^ 0x1F9B] = 0x1921 ^ 0x1F9B;
        kotakbaz.rain.module.modules.render.D.G[0x10AC3 ^ 0x10BB8] = 0x10D77 ^ 0x10BB8;
        kotakbaz.rain.module.modules.render.D.G[0xDBBA ^ 0xDB1D] = 0xFFFF24CA ^ 0xDB1D;
        kotakbaz.rain.module.modules.render.D.G[0x10CBA ^ 0x10C9C] = 0xFFFEF369 ^ 0x10C9C;
        kotakbaz.rain.module.modules.render.D.G[0xAF2B ^ 0xAFA4] = 0xAFA4 ^ 0xAFA4;
        kotakbaz.rain.module.modules.render.D.G[0xFF4C ^ 0xFE56] = 0xFE4C ^ 0xFE56;
        kotakbaz.rain.module.modules.render.D.G[0xBBD0 ^ 0xBAF7] = 0xBAD9 ^ 0xBAF7;
        kotakbaz.rain.module.modules.render.D.G[0x10382 ^ 0x1028A] = 0x10282 ^ 0x1028A;
        kotakbaz.rain.module.modules.render.D.G[0x8648 ^ 0x862C] = 0x8661 ^ 0x862C;
        kotakbaz.rain.module.modules.render.D.G[0xD718 ^ 0xD776] = 0xFFFF28A6 ^ 0xD776;
        kotakbaz.rain.module.modules.render.D.G[0x5ADF ^ 0x5B5B] = 0xD921 ^ 0x5B5B;
        kotakbaz.rain.module.modules.render.D.G[0x6D7E ^ 0x6DCF] = 0x6DFA ^ 0x6DCF;
        kotakbaz.rain.module.modules.render.D.G[0x9C28 ^ 0x9C50] = 0x9C1C ^ 0x9C50;
        kotakbaz.rain.module.modules.render.D.G[0x5F32 ^ 0x5EBA] = 0xE515 ^ 0x5EBA;
        kotakbaz.rain.module.modules.render.D.G[0xD2E2 ^ 0xD233] = 0xD22D ^ 0xD233;
        kotakbaz.rain.module.modules.render.D.G[0xF4D9 ^ 0xF4C3] = 0xF49E ^ 0xF4C3;
        kotakbaz.rain.module.modules.render.D.G[0x7B57 ^ 0x7B66] = 0x7B5D ^ 0x7B66;
        kotakbaz.rain.module.modules.render.D.G[0xBB9D ^ 0xBAC9] = 0x40E9 ^ 0xBAC9;
        kotakbaz.rain.module.modules.render.D.G[0x4AFC ^ 0x4AA8] = 0xFFFFB502 ^ 0x4AA8;
        kotakbaz.rain.module.modules.render.D.G[0xDFCF ^ 0xDE84] = 0xB464 ^ 0xDE84;
        kotakbaz.rain.module.modules.render.D.G[0x10736 ^ 0x10645] = 0x13E85 ^ 0x10645;
        kotakbaz.rain.module.modules.render.D.G[0x6335 ^ 0x62B8] = 0xFFFF14C9 ^ 0x62B8;
        kotakbaz.rain.module.modules.render.D.G[0xA195 ^ 0xA156] = 0xA14C ^ 0xA156;
        kotakbaz.rain.module.modules.render.D.G[0x12A3 ^ 0x13CD] = 0xFFFF8F24 ^ 0x13CD;
        kotakbaz.rain.module.modules.render.D.G[0x355B ^ 0x3580] = 0x35A1 ^ 0x3580;
        kotakbaz.rain.module.modules.render.D.G[0x7931 ^ 0x7834] = 0xFFFF87C1 ^ 0x7834;
        kotakbaz.rain.module.modules.render.D.G[0x47CA ^ 0x475B] = 0x4583 ^ 0x475B;
        kotakbaz.rain.module.modules.render.D.G[0x6B16 ^ 0x6A3A] = 0x6A3B ^ 0x6A3A;
        kotakbaz.rain.module.modules.render.D.G[0xF448 ^ 0xF4DD] = 0x34BA ^ 0xF4DD;
        kotakbaz.rain.module.modules.render.D.G[0x10533 ^ 0x10503] = 0xFFFEFAA6 ^ 0x10503;
        kotakbaz.rain.module.modules.render.D.G[0xE7CF ^ 0xE6E7] = 0xE6E6 ^ 0xE6E7;
        kotakbaz.rain.module.modules.render.D.G[0x33D0 ^ 0x32EE] = 0xB451 ^ 0x32EE;
        kotakbaz.rain.module.modules.render.D.G[0xEDD9 ^ 0xEDEB] = 0xFFFF127F ^ 0xEDEB;
        kotakbaz.rain.module.modules.render.D.G[0x14F0 ^ 0x1420] = 0xFFFFEBF0 ^ 0x1420;
        kotakbaz.rain.module.modules.render.D.G[0xA7B4 ^ 0xA748] = 0xFFFF58AD ^ 0xA748;
        kotakbaz.rain.module.modules.render.D.G[0x9F55 ^ 0x9F35] = 0xFFFF60ED ^ 0x9F35;
        kotakbaz.rain.module.modules.render.D.G[0x1CDF ^ 0x1C5D] = 0xFFFFE3A9 ^ 0x1C5D;
        kotakbaz.rain.module.modules.render.D.G[0x3BB1 ^ 0x3B57] = 0xFFFFC419 ^ 0x3B57;
        kotakbaz.rain.module.modules.render.D.G[0xA7F1 ^ 0xA6AA] = 0x67F2 ^ 0xA6AA;
        kotakbaz.rain.module.modules.render.D.G[0xB846 ^ 0xB913] = 0x433D ^ 0xB913;
        kotakbaz.rain.module.modules.render.D.G[0x639 ^ 0x6F7] = 0xFFFFF97A ^ 0x6F7;
        kotakbaz.rain.module.modules.render.D.G[0xFF3A ^ 0xFF55] = 0xFF59 ^ 0xFF55;
        kotakbaz.rain.module.modules.render.D.G[0xC849 ^ 0xC936] = 0x71D6 ^ 0xC936;
        kotakbaz.rain.module.modules.render.D.G[0xBBBD ^ 0xBA9C] = 0xFFFF4535 ^ 0xBA9C;
        kotakbaz.rain.module.modules.render.D.G[0x251D ^ 0x25B4] = 0xFFFFDA6D ^ 0x25B4;
        kotakbaz.rain.module.modules.render.D.G[0x9D93 ^ 0x9D9A] = 0xFFFF6206 ^ 0x9D9A;
        kotakbaz.rain.module.modules.render.D.G[0xC571 ^ 0xC581] = 0xC582 ^ 0xC581;
        kotakbaz.rain.module.modules.render.D.G[0x185B ^ 0x1881] = 0x18CC ^ 0x1881;
        kotakbaz.rain.module.modules.render.D.G[0x102B2 ^ 0x10220] = 0x18300 ^ 0x10220;
        kotakbaz.rain.module.modules.render.D.G[0x4489 ^ 0x4487] = 0xFFFFBB64 ^ 0x4487;
        kotakbaz.rain.module.modules.render.D.G[0x7CA1 ^ 0x7C72] = 0x7C18 ^ 0x7C72;
        kotakbaz.rain.module.modules.render.D.G[0xCB59 ^ 0xCA08] = 0x98E8 ^ 0xCA08;
        kotakbaz.rain.module.modules.render.D.G[0x92BD ^ 0x938D] = 0xE301 ^ 0x938D;
        kotakbaz.rain.module.modules.render.D.G[0xB590 ^ 0xB4DA] = 0xFFFF21BB ^ 0xB4DA;
        kotakbaz.rain.module.modules.render.D.G[0x351C ^ 0x3402] = 0x345C ^ 0x3402;
        kotakbaz.rain.module.modules.render.D.G[0x1012 ^ 0x111F] = 0x1171 ^ 0x111F;
        kotakbaz.rain.module.modules.render.D.G[0xA207 ^ 0xA340] = 0x9109 ^ 0xA340;
        kotakbaz.rain.module.modules.render.D.G[0xE96E ^ 0xE845] = 0xE844 ^ 0xE845;
        kotakbaz.rain.module.modules.render.D.G[0xF41A ^ 0xF4D8] = 0xFFFF0B66 ^ 0xF4D8;
        kotakbaz.rain.module.modules.render.D.G[0x2819 ^ 0x28CB] = 0xFFFFD753 ^ 0x28CB;
        kotakbaz.rain.module.modules.render.D.G[0x2FB0 ^ 0x2FC0] = 0x2FF8 ^ 0x2FC0;
        kotakbaz.rain.module.modules.render.D.G[0x5B9A ^ 0x5BDB] = 0xFFFFA40F ^ 0x5BDB;
        kotakbaz.rain.module.modules.render.D.G[0x102FC ^ 0x103AC] = 0x15149 ^ 0x103AC;
        kotakbaz.rain.module.modules.render.D.G[0xF9FF ^ 0xF94B] = 0xFFFF06B4 ^ 0xF94B;
        kotakbaz.rain.module.modules.render.D.G[0x149E ^ 0x14E9] = 0xFFFFEB7D ^ 0x14E9;
        kotakbaz.rain.module.modules.render.D.G[0x935D ^ 0x9260] = 0x14C2 ^ 0x9260;
        kotakbaz.rain.module.modules.render.D.G[0xBE4E ^ 0xBE76] = 0xBE6F ^ 0xBE76;
        kotakbaz.rain.module.modules.render.D.G[0x5569 ^ 0x5421] = 0x3EC8 ^ 0x5421;
        kotakbaz.rain.module.modules.render.D.G[0x4CF6 ^ 0x4CE7] = 0x4CDC ^ 0x4CE7;
        kotakbaz.rain.module.modules.render.D.G[0xADC ^ 0xAC2] = 0xAC6 ^ 0xAC2;
        kotakbaz.rain.module.modules.render.D.G[0xAA97 ^ 0xABE2] = 0xFFFF6C96 ^ 0xABE2;
        kotakbaz.rain.module.modules.render.D.G[0x829A ^ 0x82C4] = 0xFFFF7D6A ^ 0x82C4;
        kotakbaz.rain.module.modules.render.D.G[0xB348 ^ 0xB234] = 0xB4ED ^ 0xB234;
        kotakbaz.rain.module.modules.render.D.G[0xD58D ^ 0xD5B1] = 0xD59F ^ 0xD5B1;
        kotakbaz.rain.module.modules.render.D.G[0xEDA2 ^ 0xEDDF] = 0xFFFF126D ^ 0xEDDF;
        kotakbaz.rain.module.modules.render.D.G[0x4B0E ^ 0x4BB6] = 0xFFFFB414 ^ 0x4BB6;
        kotakbaz.rain.module.modules.render.D.G[0xA961 ^ 0xA8E7] = 0x2A9D ^ 0xA8E7;
        kotakbaz.rain.module.modules.render.D.G[0x2292 ^ 0x22EC] = 0x22C4 ^ 0x22EC;
        kotakbaz.rain.module.modules.render.D.G[0x47DE ^ 0x4652] = 0xCF8F ^ 0x4652;
        kotakbaz.rain.module.modules.render.D.G[0x8547 ^ 0x8508] = 0x851A ^ 0x8508;
        kotakbaz.rain.module.modules.render.D.G[0x2350 ^ 0x2372] = 0xFFFFDCCC ^ 0x2372;
        kotakbaz.rain.module.modules.render.D.G[0x5B6B ^ 0x5B22] = 0x5B64 ^ 0x5B22;
        kotakbaz.rain.module.modules.render.D.G[0x6E3A ^ 0x6F5C] = 0xE743 ^ 0x6F5C;
        kotakbaz.rain.module.modules.render.D.G[0x5CFD ^ 0x5CD8] = 0xFFFFA337 ^ 0x5CD8;
        kotakbaz.rain.module.modules.render.D.G[0xD288 ^ 0xD2E5] = 0xFFFF2D38 ^ 0xD2E5;
        kotakbaz.rain.module.modules.render.D.G[0xA1B1 ^ 0xA195] = 0xA131 ^ 0xA195;
        kotakbaz.rain.module.modules.render.D.G[0xAEB0 ^ 0xAFAB] = 0xAFB5 ^ 0xAFAB;
        kotakbaz.rain.module.modules.render.D.G[0xCF6F ^ 0xCF64] = 0xFFFF30F7 ^ 0xCF64;
        kotakbaz.rain.module.modules.render.D.G[0xB28 ^ 0xB37] = 0xB4E ^ 0xB37;
        kotakbaz.rain.module.modules.render.D.G[0x10541 ^ 0x105C4] = 0x105C0 ^ 0x105C4;
        kotakbaz.rain.module.modules.render.D.G[0xED59 ^ 0xEDF8] = 0xEDAE ^ 0xEDF8;
        kotakbaz.rain.module.modules.render.D.G[0xD2C0 ^ 0xD2EE] = 0xD2AC ^ 0xD2EE;
        kotakbaz.rain.module.modules.render.D.G[0x6053 ^ 0x6044] = 0xFFFF9FB1 ^ 0x6044;
        kotakbaz.rain.module.modules.render.D.G[0x6A66 ^ 0x6B07] = 0x7F84 ^ 0x6B07;
        kotakbaz.rain.module.modules.render.D.G[0xD6E ^ 0xD81] = 0xFFFFF249 ^ 0xD81;
        kotakbaz.rain.module.modules.render.D.G[0x7B36 ^ 0x7B1D] = 0x7B1A ^ 0x7B1D;
        kotakbaz.rain.module.modules.render.D.G[0x106ED ^ 0x10699] = 0x10680 ^ 0x10699;
        kotakbaz.rain.module.modules.render.D.G[0x485E ^ 0x4942] = 0x49CF ^ 0x4942;
        kotakbaz.rain.module.modules.render.D.G[0xD01 ^ 0xC25] = 0xFFFFF38F ^ 0xC25;
        kotakbaz.rain.module.modules.render.D.G[0x1F70 ^ 0x1F1A] = 0x1F78 ^ 0x1F1A;
        kotakbaz.rain.module.modules.render.D.G[0xC84C ^ 0xC95F] = 0xFFFF36B1 ^ 0xC95F;
        kotakbaz.rain.module.modules.render.D.G[0x632C ^ 0x6349] = 0xFFFF9C89 ^ 0x6349;
        kotakbaz.rain.module.modules.render.D.G[0x36B8 ^ 0x37DC] = 0xBFC7 ^ 0x37DC;
        kotakbaz.rain.module.modules.render.D.G[0x9068 ^ 0x907D] = 0xFFFB6F98 ^ 0x907D;
        kotakbaz.rain.module.modules.render.D.G[0x103D9 ^ 0x1034F] = 0x11D03 ^ 0x1034F;
        kotakbaz.rain.module.modules.render.D.G[0xF9A5 ^ 0xF9F8] = 0xFFFF0656 ^ 0xF9F8;
        kotakbaz.rain.module.modules.render.D.G[0x1D2 ^ 0x8B] = 0xC1D3 ^ 0x8B;
        kotakbaz.rain.module.modules.render.D.G[0x1A5 ^ 0x178] = 0xFFFFFE44 ^ 0x178;
        kotakbaz.rain.module.modules.render.D.G[0x2252 ^ 0x22B1] = 0x2294 ^ 0x22B1;
        kotakbaz.rain.module.modules.render.D.G[0x8DB6 ^ 0x8D71] = 0x8D3E ^ 0x8D71;
        kotakbaz.rain.module.modules.render.D.G[0x109F5 ^ 0x10968] = 0x11A52 ^ 0x10968;
        kotakbaz.rain.module.modules.render.D.G[0x103D ^ 0x10B0] = 0x10B0 ^ 0x10B0;
        kotakbaz.rain.module.modules.render.D.G[0x3BE7 ^ 0x3B32] = 0xFFFFC4F5 ^ 0x3B32;
        kotakbaz.rain.module.modules.render.D.G[0x7FFA ^ 0x7F0C] = 0x7F4C ^ 0x7F0C;
        kotakbaz.rain.module.modules.render.D.G[0xC3F4 ^ 0xC3C9] = 0xC3CB ^ 0xC3C9;
        kotakbaz.rain.module.modules.render.D.G[0x1492 ^ 0x14E1] = 0x14F3 ^ 0x14E1;
        kotakbaz.rain.module.modules.render.D.G[0xAF92 ^ 0xAF78] = 0xAF7B ^ 0xAF78;
        kotakbaz.rain.module.modules.render.D.G[0xE129 ^ 0xE1AD] = 0xFFFF1E2B ^ 0xE1AD;
        kotakbaz.rain.module.modules.render.D.G[0x702B ^ 0x7102] = 0x7100 ^ 0x7102;
        kotakbaz.rain.module.modules.render.D.G[0xE44B ^ 0xE52B] = 0xF1A8 ^ 0xE52B;
        kotakbaz.rain.module.modules.render.D.G[0x52A4 ^ 0x52FD] = 0xFFFFAD0B ^ 0x52FD;
        kotakbaz.rain.module.modules.render.D.G[0x7AA1 ^ 0x7A7D] = 0x7A33 ^ 0x7A7D;
        kotakbaz.rain.module.modules.render.D.G[0x36B1 ^ 0x37C1] = 0x37C1 ^ 0x37C1;
        kotakbaz.rain.module.modules.render.D.G[0x71AD ^ 0x70AB] = 0x70A6 ^ 0x70AB;
        kotakbaz.rain.module.modules.render.D.G[0x10DAE ^ 0x10CF0] = 0x100CB ^ 0x10CF0;
        kotakbaz.rain.module.modules.render.D.G[0xB014 ^ 0xB02E] = 0xB03F ^ 0xB02E;
        kotakbaz.rain.module.modules.render.D.G[0x8319 ^ 0x8260] = 0x181F4 ^ 0x8260;
        kotakbaz.rain.module.modules.render.D.G[0x10CA8 ^ 0x10D2F] = 0x1B69D ^ 0x10D2F;
        kotakbaz.rain.module.modules.render.D.G[0xD0E4 ^ 0xD067] = 0xFFFF2FB7 ^ 0xD067;
        kotakbaz.rain.module.modules.render.D.G[0x62ED ^ 0x63AF] = 0x97FA ^ 0x63AF;
        kotakbaz.rain.module.modules.render.D.G[0x1C6B ^ 0x1C96] = 0x1CDC ^ 0x1C96;
        kotakbaz.rain.module.modules.render.D.G[0x19F9 ^ 0x18E4] = 0x18A5 ^ 0x18E4;
        kotakbaz.rain.module.modules.render.D.G[0x9A82 ^ 0x9AAD] = 0xFFFF655A ^ 0x9AAD;
        kotakbaz.rain.module.modules.render.D.G[0x8D6B ^ 0x8CEB] = 0x3411 ^ 0x8CEB;
        kotakbaz.rain.module.modules.render.D.G[0x10488 ^ 0x104EB] = 0xFFFEFB9C ^ 0x104EB;
        kotakbaz.rain.module.modules.render.D.G[0x76CF ^ 0x778B] = 0x45C1 ^ 0x778B;
        kotakbaz.rain.module.modules.render.D.G[0x6FA1 ^ 0x6EC8] = 0x2E64 ^ 0x6EC8;
        kotakbaz.rain.module.modules.render.D.G[0xEFBC ^ 0xEF91] = 0xEFCA ^ 0xEF91;
        kotakbaz.rain.module.modules.render.D.G[0x661D ^ 0x6635] = 0xFFFF99DE ^ 0x6635;
        kotakbaz.rain.module.modules.render.D.G[0xA710 ^ 0xA622] = 0xD6CD ^ 0xA622;
        kotakbaz.rain.module.modules.render.D.G[0x5520 ^ 0x5448] = 0x14EF ^ 0x5448;
        kotakbaz.rain.module.modules.render.D.G[0xE556 ^ 0xE4DF] = 0x5F7E ^ 0xE4DF;
        kotakbaz.rain.module.modules.render.D.G[0xB159 ^ 0xB1C2] = 0x1917 ^ 0xB1C2;
        kotakbaz.rain.module.modules.render.D.G[0x378F ^ 0x3713] = 0x4FC9 ^ 0x3713;
        kotakbaz.rain.module.modules.render.D.G[0x9FD3 ^ 0x9EF3] = 0xFFFF612D ^ 0x9EF3;
        kotakbaz.rain.module.modules.render.D.G[0x2B86 ^ 0x2ABF] = 0x9FB5 ^ 0x2ABF;
        kotakbaz.rain.module.modules.render.D.G[0x1A81 ^ 0x1BFF] = 0x1D26 ^ 0x1BFF;
        kotakbaz.rain.module.modules.render.D.G[0x33DE ^ 0x330A] = 0xFFFFCCD9 ^ 0x330A;
        kotakbaz.rain.module.modules.render.D.G[0xE757 ^ 0xE7E4] = 0xFFFF1872 ^ 0xE7E4;
        kotakbaz.rain.module.modules.render.D.G[0x3773 ^ 0x378C] = 0xFFFFC837 ^ 0x378C;
        kotakbaz.rain.module.modules.render.D.G[0x7A22 ^ 0x7B49] = 0x3BE5 ^ 0x7B49;
        kotakbaz.rain.module.modules.render.D.G[0x6732 ^ 0x6620] = 0xFFFF99FB ^ 0x6620;
        kotakbaz.rain.module.modules.render.D.G[0x8356 ^ 0x8219] = 0x4DFB ^ 0x8219;
        kotakbaz.rain.module.modules.render.D.G[0xA908 ^ 0xA855] = 0xA412 ^ 0xA855;
        kotakbaz.rain.module.modules.render.D.G[0x459E ^ 0x45B2] = 0xFFFFBA70 ^ 0x45B2;
        kotakbaz.rain.module.modules.render.D.G[0x86D9 ^ 0x8615] = 0x863C ^ 0x8615;
        kotakbaz.rain.module.modules.render.D.G[0xF09A ^ 0xF1B4] = 0x1672 ^ 0xF1B4;
        kotakbaz.rain.module.modules.render.D.G[0xE1CA ^ 0xE126] = 0xE1B4 ^ 0xE126;
        kotakbaz.rain.module.modules.render.D.G[0xB8E6 ^ 0xB8F2] = 0xFFFF471B ^ 0xB8F2;
        kotakbaz.rain.module.modules.render.D.G[0x10337 ^ 0x10214] = 0x10274 ^ 0x10214;
        kotakbaz.rain.module.modules.render.D.G[0xB6CC ^ 0xB638] = 0xFFFF49C5 ^ 0xB638;
        kotakbaz.rain.module.modules.render.D.G[0x8D65 ^ 0x8C14] = 0xF136 ^ 0x8C14;
        kotakbaz.rain.module.modules.render.D.G[0x4B2A ^ 0x4A35] = 0x4A43 ^ 0x4A35;
        kotakbaz.rain.module.modules.render.D.G[0x702E ^ 0x7108] = 0x716A ^ 0x7108;
        kotakbaz.rain.module.modules.render.D.G[0x106D5 ^ 0x107C4] = 0xFFFEF858 ^ 0x107C4;
        kotakbaz.rain.module.modules.render.D.G[0xA33A ^ 0xA27C] = 0x9008 ^ 0xA27C;
        kotakbaz.rain.module.modules.render.D.G[0x4E3A ^ 0x4E40] = 0xFFFFB1E0 ^ 0x4E40;
        kotakbaz.rain.module.modules.render.D.G[0x342 ^ 0x255] = 0x26E ^ 0x255;
        kotakbaz.rain.module.modules.render.D.G[0x6101 ^ 0x6177] = 0x6163 ^ 0x6177;
        kotakbaz.rain.module.modules.render.D.G[0x8F8 ^ 0x8CC] = 0x8F2 ^ 0x8CC;
        kotakbaz.rain.module.modules.render.D.G[0x1345 ^ 0x131A] = 0x1314 ^ 0x131A;
        kotakbaz.rain.module.modules.render.D.G[0x12A6 ^ 0x129F] = 0x121F ^ 0x129F;
        kotakbaz.rain.module.modules.render.D.G[0x40A ^ 0x4E3] = 0x4C1 ^ 0x4E3;
        kotakbaz.rain.module.modules.render.D.G[0x9839 ^ 0x986C] = 0x986E ^ 0x986C;
        kotakbaz.rain.module.modules.render.D.G[0x2431 ^ 0x2412] = 0x244D ^ 0x2412;
        kotakbaz.rain.module.modules.render.D.G[0x96BF ^ 0x97D8] = 0x1FC4 ^ 0x97D8;
        kotakbaz.rain.module.modules.render.D.G[0x47E8 ^ 0x46F1] = 0x46D5 ^ 0x46F1;
        kotakbaz.rain.module.modules.render.D.G[0x6EAF ^ 0x6E58] = 0x6E60 ^ 0x6E58;
        kotakbaz.rain.module.modules.render.D.G[0xF586 ^ 0xF5EE] = 0xF5F4 ^ 0xF5EE;
        kotakbaz.rain.module.modules.render.D.G[0x11A9 ^ 0x109E] = 0x8C16 ^ 0x109E;
        kotakbaz.rain.module.modules.render.D.G[0x109CC ^ 0x10842] = 0x1819F ^ 0x10842;
        kotakbaz.rain.module.modules.render.D.G[0xD280 ^ 0xD278] = 0xFFFF2D97 ^ 0xD278;
        kotakbaz.rain.module.modules.render.D.G[0x7832 ^ 0x7968] = 0xB84E ^ 0x7968;
        kotakbaz.rain.module.modules.render.D.G[0xC45D ^ 0xC401] = 0xFFFF3BE9 ^ 0xC401;
        kotakbaz.rain.module.modules.render.D.G[0x28D6 ^ 0x29AE] = 0x12A10 ^ 0x29AE;
        kotakbaz.rain.module.modules.render.D.G[0xB2F6 ^ 0xB3B8] = 0xFFFF83A4 ^ 0xB3B8;
        kotakbaz.rain.module.modules.render.D.G[0x8EBF ^ 0x8EE9] = 0x8EB6 ^ 0x8EE9;
        kotakbaz.rain.module.modules.render.D.G[0x2885 ^ 0x29B3] = 0xFFFF4A88 ^ 0x29B3;
        kotakbaz.rain.module.modules.render.D.G[0x8A9D ^ 0x8AE1] = 0xFFFF7507 ^ 0x8AE1;
        kotakbaz.rain.module.modules.render.D.G[0xA54F ^ 0xA43D] = 0xD93F ^ 0xA43D;
        kotakbaz.rain.module.modules.render.D.G[0xCA6F ^ 0xCAAF] = 0xCABE ^ 0xCAAF;
        kotakbaz.rain.module.modules.render.D.G[0x494D ^ 0x4849] = 0xFFFFB7AF ^ 0x4849;
        kotakbaz.rain.module.modules.render.D.G[0x1071F ^ 0x1070D] = 0x1070E ^ 0x1070D;
        kotakbaz.rain.module.modules.render.D.G[0x4A04 ^ 0x4AB3] = 0x4AB8 ^ 0x4AB3;
        kotakbaz.rain.module.modules.render.D.G[0xFF6A ^ 0xFF67] = 0xFF1C ^ 0xFF67;
        kotakbaz.rain.module.modules.render.D.G[0xB042 ^ 0xB0CE] = 0xB0CF ^ 0xB0CE;
        kotakbaz.rain.module.modules.render.D.G[0x5F9D ^ 0x5F0D] = 0x5F0D ^ 0x5F0D;
        kotakbaz.rain.module.modules.render.D.G[0xF220 ^ 0xF277] = 0xFFFF0DEE ^ 0xF277;
        kotakbaz.rain.module.modules.render.D.G[0x1E5D ^ 0x1F0B] = 0xFFFF1AE9 ^ 0x1F0B;
        kotakbaz.rain.module.modules.render.D.G[0x73DA ^ 0x72B7] = 0x11DC ^ 0x72B7;
        kotakbaz.rain.module.modules.render.D.G[0xA0F7 ^ 0xA192] = 0x298E ^ 0xA192;
        kotakbaz.rain.module.modules.render.D.G[0xC682 ^ 0xC6CC] = 0xFFFF392F ^ 0xC6CC;
        kotakbaz.rain.module.modules.render.D.G[0xAF62 ^ 0xAE35] = 0x541B ^ 0xAE35;
        kotakbaz.rain.module.modules.render.D.G[0xBC74 ^ 0xBCB9] = 0xBCC5 ^ 0xBCB9;
        kotakbaz.rain.module.modules.render.D.G[0xE2D7 ^ 0xE2A5] = 0xE281 ^ 0xE2A5;
        kotakbaz.rain.module.modules.render.D.G[0x1A00 ^ 0x1A00] = 0xFFFFE5B7 ^ 0x1A00;
        kotakbaz.rain.module.modules.render.D.G[0x22C7 ^ 0x22F2] = 0x228C ^ 0x22F2;
        kotakbaz.rain.module.modules.render.D.G[0xB398 ^ 0xB347] = 0xFFFF4CD0 ^ 0xB347;
        kotakbaz.rain.module.modules.render.D.G[0x51C2 ^ 0x5040] = 0xE8BA ^ 0x5040;
        kotakbaz.rain.module.modules.render.D.G[0x106C ^ 0x107C] = 0x1016 ^ 0x107C;
        kotakbaz.rain.module.modules.render.D.G[0x5E5 ^ 0x51E] = 0xFFFFFABF ^ 0x51E;
        kotakbaz.rain.module.modules.render.D.G[0xCA48 ^ 0xCA29] = 0xFFFF35D1 ^ 0xCA29;
        kotakbaz.rain.module.modules.render.D.G[0x2589 ^ 0x25CD] = 0xFFFFDA5F ^ 0x25CD;
        kotakbaz.rain.module.modules.render.D.G[0xBD76 ^ 0xBDFE] = 0xBDFB ^ 0xBDFE;
        kotakbaz.rain.module.modules.render.D.G[0x2D9 ^ 0x24D] = 0x984B ^ 0x24D;
        kotakbaz.rain.module.modules.render.D.G[0xEFD3 ^ 0xEFA6] = 0xFFFF1019 ^ 0xEFA6;
        kotakbaz.rain.module.modules.render.D.G[0xE10F ^ 0xE1AC] = 0xE182 ^ 0xE1AC;
        kotakbaz.rain.module.modules.render.D.G[0x4B2B ^ 0x4BAD] = 0xFFFFB409 ^ 0x4BAD;
        kotakbaz.rain.module.modules.render.D.G[0x7730 ^ 0x760C] = 0xF0A8 ^ 0x760C;
        kotakbaz.rain.module.modules.render.D.G[0xEB03 ^ 0xEA16] = 0xEA0A ^ 0xEA16;
        kotakbaz.rain.module.modules.render.D.G[0x32D4 ^ 0x321F] = 0x329A ^ 0x321F;
        kotakbaz.rain.module.modules.render.D.G[0x3F60 ^ 0x3F32] = 0xFFFFC0AD ^ 0x3F32;
        kotakbaz.rain.module.modules.render.D.G[0xDF01 ^ 0xDE53] = 0x8C90 ^ 0xDE53;
        kotakbaz.rain.module.modules.render.D.G[0x6168 ^ 0x61F0] = 0x6A4 ^ 0x61F0;
        kotakbaz.rain.module.modules.render.D.G[0x10AF8 ^ 0x10B7D] = 0x18938 ^ 0x10B7D;
        kotakbaz.rain.module.modules.render.D.G[0xAC ^ 0x72] = 0xFFFFFFEF ^ 0x72;
        kotakbaz.rain.module.modules.render.D.G[0xF6BF ^ 0xF7B5] = 0xF7B4 ^ 0xF7B5;
        kotakbaz.rain.module.modules.render.D.G[0x9F41 ^ 0x9E0C] = 0x51EE ^ 0x9E0C;
        kotakbaz.rain.module.modules.render.D.G[0xAA2F ^ 0xAA14] = 0xAA7A ^ 0xAA14;
        kotakbaz.rain.module.modules.render.D.G[0x103D2 ^ 0x103D4] = 0x103A9 ^ 0x103D4;
        kotakbaz.rain.module.modules.render.D.G[0x8407 ^ 0x84A2] = 0xFFFF7B11 ^ 0x84A2;
        kotakbaz.rain.module.modules.render.D.G[0x596C ^ 0x587A] = 0xFFFFA72B ^ 0x587A;
        kotakbaz.rain.module.modules.render.D.G[0x8478 ^ 0x852B] = 0xD7CB ^ 0x852B;
        kotakbaz.rain.module.modules.render.D.G[0x10BD2 ^ 0x10B68] = 0xFFFEF494 ^ 0x10B68;
        kotakbaz.rain.module.modules.render.D.G[0xEF61 ^ 0xEE43] = 0xEE40 ^ 0xEE43;
        kotakbaz.rain.module.modules.render.D.G[0xCED4 ^ 0xCEB2] = 0xCE82 ^ 0xCEB2;
        kotakbaz.rain.module.modules.render.D.G[0xA6F0 ^ 0xA6B0] = 0xA6D7 ^ 0xA6B0;
        kotakbaz.rain.module.modules.render.D.G[0xBF37 ^ 0xBFAE] = 0xEF7A ^ 0xBFAE;
        kotakbaz.rain.module.modules.render.D.G[0x3C41 ^ 0x3D1E] = 0x3159 ^ 0x3D1E;
        kotakbaz.rain.module.modules.render.D.G[0xFAFC ^ 0xFA5A] = 0xFFFF05C8 ^ 0xFA5A;
        kotakbaz.rain.module.modules.render.D.G[0x1FDC ^ 0x1F0A] = 0xFFFFE0FE ^ 0x1F0A;
        kotakbaz.rain.module.modules.render.D.G[0x72EC ^ 0x729D] = 0xFFFF8D5A ^ 0x729D;
        kotakbaz.rain.module.modules.render.D.G[0x5F45 ^ 0x5F53] = 0x5F43 ^ 0x5F53;
        kotakbaz.rain.module.modules.render.D.G[0xFF7C ^ 0xFFC2] = 0xFFFF003D ^ 0xFFC2;
        kotakbaz.rain.module.modules.render.D.G[0xFC21 ^ 0xFC00] = 0xFD69 ^ 0xFC00;
        kotakbaz.rain.module.modules.render.D.G[0xC59E ^ 0xC5D8] = 0xC5F0 ^ 0xC5D8;
        kotakbaz.rain.module.modules.render.D.G[0xCFC9 ^ 0xCF98] = 0xCF0F ^ 0xCF98;
        kotakbaz.rain.module.modules.render.D.G[0xAD05 ^ 0xADF0] = 0xFFFF527A ^ 0xADF0;
        kotakbaz.rain.module.modules.render.D.G[0x10541 ^ 0x10545] = 0x1050D ^ 0x10545;
        kotakbaz.rain.module.modules.render.D.G[0x1C03 ^ 0x1C83] = 0xFFFFE321 ^ 0x1C83;
        kotakbaz.rain.module.modules.render.D.G[0xEAF7 ^ 0xEB9B] = 0x88FF ^ 0xEB9B;
        kotakbaz.rain.module.modules.render.D.G[0x48E6 ^ 0x49DC] = 0xFC88 ^ 0x49DC;
        kotakbaz.rain.module.modules.render.D.G[0xCCBD ^ 0xCC1F] = 0xFFFF33A7 ^ 0xCC1F;
        kotakbaz.rain.module.modules.render.D.G[0xAB90 ^ 0xAB63] = 0xFFFF54BD ^ 0xAB63;
        kotakbaz.rain.module.modules.render.D.G[0x9D09 ^ 0x9D9A] = 0x70FB ^ 0x9D9A;
        kotakbaz.rain.module.modules.render.D.G[0x593E ^ 0x58BF] = 0xE01D ^ 0x58BF;
        kotakbaz.rain.module.modules.render.D.G[0x540C ^ 0x5482] = 0x5480 ^ 0x5482;
        kotakbaz.rain.module.modules.render.D.G[0xCC51 ^ 0xCC1B] = 0xFFFF33F3 ^ 0xCC1B;
        kotakbaz.rain.module.modules.render.D.G[0x521A ^ 0x52CD] = 0x52F6 ^ 0x52CD;
        kotakbaz.rain.module.modules.render.D.G[0x84B8 ^ 0x8412] = 0xFFFF7BEE ^ 0x8412;
        kotakbaz.rain.module.modules.render.D.G[0x3E1E ^ 0x3E12] = 0xFFFFC15A ^ 0x3E12;
        kotakbaz.rain.module.modules.render.D.G[0x5009 ^ 0x5151] = 0x900B ^ 0x5151;
        kotakbaz.rain.module.modules.render.D.G[0xF457 ^ 0xF521] = 0xCDF6 ^ 0xF521;
        kotakbaz.rain.module.modules.render.D.G[0x8B86 ^ 0x8ABD] = 0x3FB7 ^ 0x8ABD;
        kotakbaz.rain.module.modules.render.D.G[0xF6F5 ^ 0xF61B] = 0xF661 ^ 0xF61B;
        kotakbaz.rain.module.modules.render.D.G[0xEC94 ^ 0xEC79] = 0xFFFF139F ^ 0xEC79;
        kotakbaz.rain.module.modules.render.D.G[0x3D92 ^ 0x3D5D] = 0xFFFFC280 ^ 0x3D5D;
        kotakbaz.rain.module.modules.render.D.G[0xFD7A ^ 0xFC33] = 0x96D3 ^ 0xFC33;
        kotakbaz.rain.module.modules.render.D.G[0xCE8A ^ 0xCE22] = 0xFFFF31FC ^ 0xCE22;
        kotakbaz.rain.module.modules.render.D.G[0xF35 ^ 0xF9A] = 0xF81 ^ 0xF9A;
        kotakbaz.rain.module.modules.render.D.G[0xE0D7 ^ 0xE06A] = 0xFFFF1FD5 ^ 0xE06A;
        kotakbaz.rain.module.modules.render.D.G[0x81C9 ^ 0x80F6] = 0x654 ^ 0x80F6;
        kotakbaz.rain.module.modules.render.D.G[0xA960 ^ 0xA9FA] = 0x40F ^ 0xA9FA;
        kotakbaz.rain.module.modules.render.D.G[0xEE1D ^ 0xEF5E] = 0x1B7B ^ 0xEF5E;
        kotakbaz.rain.module.modules.render.D.G[0xAB72 ^ 0xABD6] = 0xABD7 ^ 0xABD6;
        kotakbaz.rain.module.modules.render.D.G[0x76D9 ^ 0x7689] = 0xFFFF8978 ^ 0x7689;
        kotakbaz.rain.module.modules.render.D.G[0x9C10 ^ 0x9C5C] = 0x9C7F ^ 0x9C5C;
        kotakbaz.rain.module.modules.render.D.G[0x3894 ^ 0x3839] = 0xFFFFC795 ^ 0x3839;
        kotakbaz.rain.module.modules.render.D.G[0xE753 ^ 0xE756] = 0xE77E ^ 0xE756;
        kotakbaz.rain.module.modules.render.D.G[0xF3EB ^ 0xF3CC] = 0xF3C6 ^ 0xF3CC;
        kotakbaz.rain.module.modules.render.D.G[0xCAB5 ^ 0xCA71] = 0xFFFF35F5 ^ 0xCA71;
        kotakbaz.rain.module.modules.render.D.G[0xE087 ^ 0xE075] = 0xE057 ^ 0xE075;
        kotakbaz.rain.module.modules.render.D.G[0xA908 ^ 0xA961] = 0xA942 ^ 0xA961;
        kotakbaz.rain.module.modules.render.D.G[0x95C0 ^ 0x944A] = 0x2FE5 ^ 0x944A;
        kotakbaz.rain.module.modules.render.D.G[0x54CB ^ 0x54C9] = 0xFFFFAB5C ^ 0x54C9;
        kotakbaz.rain.module.modules.render.D.G[0x1022A ^ 0x10225] = 0x1021B ^ 0x10225;
        kotakbaz.rain.module.modules.render.D.G[0xE000 ^ 0xE10F] = 0xFFFF1EFE ^ 0xE10F;
        kotakbaz.rain.module.modules.render.D.G[0xFCCB ^ 0xFC0D] = 0xFFFF03D1 ^ 0xFC0D;
        kotakbaz.rain.module.modules.render.D.G[0x48C3 ^ 0x48C4] = 0xFFFFB75C ^ 0x48C4;
        kotakbaz.rain.module.modules.render.D.G[0xBE6A ^ 0xBF6D] = 0xFFFF40A3 ^ 0xBF6D;
        kotakbaz.rain.module.modules.render.D.G[0xA1F8 ^ 0xA08C] = 0x985B ^ 0xA08C;
        kotakbaz.rain.module.modules.render.D.G[0x87C9 ^ 0x86F1] = 0x33F3 ^ 0x86F1;
        kotakbaz.rain.module.modules.render.D.G[0x5D58 ^ 0x5C32] = 0xFFFFE330 ^ 0x5C32;
        kotakbaz.rain.module.modules.render.D.G[0x10B94 ^ 0x10B65] = 0xFFFEF4AF ^ 0x10B65;
        kotakbaz.rain.module.modules.render.D.G[0xF092 ^ 0xF0E9] = 0xF0B2 ^ 0xF0E9;
        kotakbaz.rain.module.modules.render.D.G[0x5DA6 ^ 0x5DCA] = 0xFFFFA23B ^ 0x5DCA;
        kotakbaz.rain.module.modules.render.D.G[0x9CFC ^ 0x9DFF] = 0x9DB0 ^ 0x9DFF;
        kotakbaz.rain.module.modules.render.D.G[0x312F ^ 0x3181] = 0xFFFFCE16 ^ 0x3181;
        kotakbaz.rain.module.modules.render.D.G[0xD045 ^ 0xD0BF] = 0xD0E1 ^ 0xD0BF;
        kotakbaz.rain.module.modules.render.D.G[0x424 ^ 0x526] = 0x50C ^ 0x526;
        kotakbaz.rain.module.modules.render.D.G[0xDC1E ^ 0xDC95] = 0xDC95 ^ 0xDC95;
        kotakbaz.rain.module.modules.render.D.G[0x9585 ^ 0x953A] = 0x95BD ^ 0x953A;
        kotakbaz.rain.module.modules.render.D.G[0xBE44 ^ 0xBF3E] = 0x1BC80 ^ 0xBF3E;
        kotakbaz.rain.module.modules.render.D.G[0x8D4A ^ 0x8C4A] = 0xFFFF739E ^ 0x8C4A;
        kotakbaz.rain.module.modules.render.D.G[0x98BD ^ 0x983C] = 0xFFFF67F8 ^ 0x983C;
        kotakbaz.rain.module.modules.render.D.G[0x52AB ^ 0x539F] = 0xCF1B ^ 0x539F;
        kotakbaz.rain.module.modules.render.D.G[0xADD5 ^ 0xAD0C] = 0xAD17 ^ 0xAD0C;
        kotakbaz.rain.module.modules.render.D.G[0xBAAC ^ 0xBAAF] = 0xBAEA ^ 0xBAAF;
        kotakbaz.rain.module.modules.render.D.G[0xA7DA ^ 0xA766] = 0xA706 ^ 0xA766;
        kotakbaz.rain.module.modules.render.D.G[0xA428 ^ 0xA519] = 0xD594 ^ 0xA519;
        kotakbaz.rain.module.modules.render.D.G[0x910D ^ 0x914F] = 0xFFFF6ED1 ^ 0x914F;
        kotakbaz.rain.module.modules.render.D.G[0xA411 ^ 0xA45A] = 0xA415 ^ 0xA45A;
        kotakbaz.rain.module.modules.render.D.G[0x1F57 ^ 0x1FC0] = 0x1C12 ^ 0x1FC0;
        kotakbaz.rain.module.modules.render.D.G[0xF769 ^ 0xF7A1] = 0xF73D ^ 0xF7A1;
        kotakbaz.rain.module.modules.render.D.G[0xC91 ^ 0xCD2] = 0xCFE ^ 0xCD2;
        kotakbaz.rain.module.modules.render.D.G[0x10A99 ^ 0x10AE6] = 0x10AD1 ^ 0x10AE6;
    }
}

