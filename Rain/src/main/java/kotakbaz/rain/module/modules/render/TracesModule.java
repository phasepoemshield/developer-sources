/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.ClientColorModule;
import kotakbaz.rain.module.modules.render.U;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.RainRenderLayers;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Quaternionfc;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001RB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJO\u0010\u0019\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ7\u0010%\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b'\u0010(J'\u0010*\u001a\u00020)2\u0006\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0002\u00a2\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b1\u0010\u0003R\u0014\u00102\u001a\u00020\u00148\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u0002048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b8\u00106R\u0014\u00109\u001a\u00020)8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010G\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bG\u0010HR$\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00100Ij\b\u0012\u0004\u0012\u00020\u0010`J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bP\u0010Q\u00a8\u0006S"}, d2={"Lkotakbaz/rain/module/modules/render/TracesModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_4588;", "buffer", "Lkotakbaz/rain/module/modules/render/TracesModule$TrailPoint;", "point", "Lnet/minecraft/class_243;", "cameraPos", "", "red", "green", "blue", "alpha", "renderTrailPoint", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4588;Lkotakbaz/rain/module/modules/render/TracesModule$TrailPoint;Lnet/minecraft/class_243;IIII)V", "", "now", "updateSelfTrail", "(J)V", "currentPos", "previousPos", "velocity", "", "onGround", "time", "appendTrailPointIfNeeded", "(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;ZJ)V", "resolveLastPosition", "(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Z)Lnet/minecraft/class_243;", "", "calculateMovementYaw", "(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)F", "progress", "calculateAlpha", "(F)F", "lifetimeMillis", "()J", "clearState", "BUFFER_SIZE", "I", "", "MIN_DISTANCE_FOR_YAW", "D", "MAX_POINT_DISTANCE", "TRAIL_Y_OFFSET", "TRAIL_SIZE", "F", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "trailLifetime", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "stepDistance", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "trailColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Lnet/minecraft/class_2960;", "kotlin.jvm.PlatformType", "texture", "Lnet/minecraft/class_2960;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "trailPoints", "Ljava/util/ArrayList;", "Lnet/minecraft/class_638;", "trackedWorld", "Lnet/minecraft/class_638;", "lastSelfPosition", "Lnet/minecraft/class_243;", "TrailPoint", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTracesModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TracesModule.kt\nkotakbaz/rain/module/modules/render/TracesModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,255:1\n1915#2,2:256\n*S KotlinDebug\n*F\n+ 1 TracesModule.kt\nkotakbaz/rain/module/modules/render/TracesModule\n*L\n95#1:256,2\n*E\n"})
public final class TracesModule
extends Module {
    @NotNull
    public static final TracesModule INSTANCE;
    private static final int a = 262144;
    private static final double A = 0.01;
    private static final double b = 3.0;
    private static final double B = 0.05;
    private static final float c = 1.1f;
    @NotNull
    private static final SliderSetting C;
    @NotNull
    private static final SliderSetting d;
    @NotNull
    private static final BooleanSetting D;
    @NotNull
    private static final ColorSetting e;
    private static final Identifier E;
    @NotNull
    private static final ArrayList<U> f;
    @Nullable
    private static ClientWorld F;
    @Nullable
    private static Vec3d g;
    private static Object[] G;
    private static Object H;
    private static Object[] i;
    private static Object[] h;
    private static Object[] I;
    public static int[] j;

    private TracesModule() {
        int n2 = j[0];
        n2 ^= j[1];
        n2 ^= j[2];
        int n3 = j[3];
        n3 += j[4];
        int n4 = j[6];
        n4 += j[7];
        int n5 = j[9];
        n5 -= j[10];
        super((String)G[n2], a_0.getRENDER(), (String)G[n3 -= j[5]] + (String)G[n4 ^= j[8]] + (String)G[n5 += j[11]]);
    }

    @Override
    public void onEnable() {
        this.clearState();
    }

    @Override
    public void onDisable() {
        this.clearState();
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = -5309149801100708823L;
        int n2 = j[12];
        n2 += j[13];
        Intrinsics.checkNotNullParameter(event, (String)G[n2 -= j[14]]);
        if (!this.isEnabled()) {
            return;
        }
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            TracesModule tracesModule = this;
            long l3 = l2;
            int n3 = j[15];
            n3 ^= j[16];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= j[17]);
            tracesModule.clearState();
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        if (F != clientWorld2) {
            this.clearState();
            F = clientWorld2;
        }
        long l4 = System.currentTimeMillis();
        long l5 = this.lifetimeMillis();
        f.removeIf(arg_0 -> TracesModule.onUpdate$lambda$2(arg_0 -> TracesModule.onUpdate$lambda$1(l4, l5, arg_0), arg_0));
        this.updateSelfTrail(l4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        long l2 = 8640037013663382803L;
        long l3 = 5913508857605750593L;
        long l4 = -1119095615399900706L;
        int n2 = j[18];
        n2 -= j[19];
        Intrinsics.checkNotNullParameter(event, (String)G[n2 ^= j[20]]);
        if (!this.isEnabled()) {
            return;
        }
        if (f.isEmpty()) {
            return;
        }
        Vec3d vec3d = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getPos();
        long l5 = System.currentTimeMillis();
        float f2 = RangesKt.coerceAtLeast((float)this.lifetimeMillis(), 1.0f);
        Color color = (Boolean)D.getValue() != false && ClientColorModule.INSTANCE.isEnabled() ? ClientColorModule.INSTANCE.getClientColor() : (Color)e.getValue();
        RenderLayer renderLayer = RainRenderLayers.getTrailSprite((Identifier)E);
        int n3 = j[21];
        n3 ^= j[22];
        try (BufferAllocator bufferAllocator = new BufferAllocator(n3 ^= j[23]);){
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)bufferAllocator);
            VertexConsumer vertexConsumer = immediate.getBuffer(renderLayer);
            Iterable iterable = f;
            long l6 = l2;
            int n4 = j[24];
            n4 -= j[25];
            l2 = l6 ^ (0L ^ l6) & -1L << (n4 ^= j[26]);
            for (Object t2 : iterable) {
                U u = (U)t2;
                long l7 = l2;
                int n5 = j[27];
                n5 -= j[28];
                l2 = l7 ^ (0L ^ l7) & -1L >>> (n5 -= j[29]);
                float f3 = RangesKt.coerceAtLeast((float)(l5 - u.getTime()) / f2, 0.0f);
                float f4 = INSTANCE.calculateAlpha(f3);
                if (f4 <= 0.0f) continue;
                int n6 = j[30];
                n6 ^= j[31];
                n6 -= j[32];
                int n7 = j[33];
                n7 -= j[34];
                n7 += j[35];
                int n8 = j[36];
                n8 ^= j[37];
                long l8 = l4;
                int n9 = j[39];
                n9 ^= j[40];
                l4 = l8 ^ ((long)RangesKt.coerceIn((int)((float)color.getAlpha() * f4), n6, n7) << (n8 ^= j[38]) ^ l8) & -1L << (n9 ^= j[41]);
                int n10 = j[42];
                n10 += j[43];
                if ((int)(l4 >>> (n10 += j[44])) <= 0) continue;
                Intrinsics.checkNotNull(vertexConsumer);
                Intrinsics.checkNotNull(vec3d);
                int n11 = j[45];
                n11 += j[46];
                INSTANCE.renderTrailPoint(event, vertexConsumer, u, vec3d, color.getRed(), color.getGreen(), color.getBlue(), (int)(l4 >>> (n11 += j[47])));
            }
            immediate.draw();
        }
    }

    private final void renderTrailPoint(Render3DEvent event, VertexConsumer buffer, U point, Vec3d cameraPos, int red, int green, int blue, int alpha2) {
        float f2 = 0.55f;
        event.getMatrices().push();
        event.getMatrices().translate(point.getPosition().x - cameraPos.x, point.getPosition().y - cameraPos.y + Double.longBitsToDouble(0x7A8ADD25203D2CF0L ^ 0x452344BCB9A4B56AL), point.getPosition().z - cameraPos.z);
        event.getMatrices().multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(-point.getYaw() + 180.0f));
        event.getMatrices().scale(1.1f, 1.1f, 1.1f);
        MatrixStack.Entry entry = event.getMatrices().peek();
        buffer.vertex(entry, -f2, 0.0f, -f2).color(red, green, blue, alpha2).texture(0.0f, 0.0f);
        buffer.vertex(entry, f2, 0.0f, -f2).color(red, green, blue, alpha2).texture(1.0f, 0.0f);
        buffer.vertex(entry, f2, 0.0f, f2).color(red, green, blue, alpha2).texture(1.0f, 1.0f);
        buffer.vertex(entry, -f2, 0.0f, f2).color(red, green, blue, alpha2).texture(0.0f, 1.0f);
        event.getMatrices().pop();
    }

    private final void updateSelfTrail(long now) {
        long l2 = 8533601004091321950L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            TracesModule tracesModule = this;
            long l3 = l2;
            int n2 = j[48];
            n2 -= j[49];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 ^= j[50]);
            g = null;
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        Vec3d vec3d = clientPlayerEntity2.getPos();
        Vec3d vec3d2 = g;
        if (vec3d2 == null) {
            g = vec3d;
            return;
        }
        Intrinsics.checkNotNull(vec3d);
        Vec3d vec3d3 = clientPlayerEntity2.getVelocity();
        int n3 = j[51];
        n3 ^= j[52];
        int n4 = j[54];
        n4 ^= j[55];
        Intrinsics.checkNotNullExpressionValue(vec3d3, (String)G[n3 -= j[53]] + (String)G[n4 += j[56]]);
        this.appendTrailPointIfNeeded(vec3d, vec3d2, vec3d3, clientPlayerEntity2.isOnGround(), now);
        g = this.resolveLastPosition(vec3d2, vec3d, clientPlayerEntity2.isOnGround());
    }

    private final void appendTrailPointIfNeeded(Vec3d currentPos, Vec3d previousPos, Vec3d velocity, boolean onGround, long time) {
        double d2 = currentPos.distanceTo(previousPos);
        if (onGround && d2 >= (double)((Number)d.getValue()).floatValue() && d2 <= Double.longBitsToDouble(0x3B1C598FB4B1B766L ^ 0x7B14598FB4B1B766L)) {
            f.add(new U(currentPos, this.calculateMovementYaw(velocity, previousPos, currentPos), time));
        }
    }

    private final Vec3d resolveLastPosition(Vec3d previousPos, Vec3d currentPos, boolean onGround) {
        double d2 = currentPos.distanceTo(previousPos);
        return !onGround || d2 >= (double)((Number)d.getValue()).floatValue() && d2 <= Double.longBitsToDouble(0xBF833EEB78B6B61CL ^ 0xFF8B3EEB78B6B61CL) ? currentPos : previousPos;
    }

    private final float calculateMovementYaw(Vec3d velocity, Vec3d previousPos, Vec3d currentPos) {
        double d2 = Math.sqrt(velocity.x * velocity.x + velocity.z * velocity.z);
        if (d2 > Double.longBitsToDouble(0x44D65C7CF936F606L ^ 0x7B52269DBE98E27DL)) {
            return (float)Math.toDegrees(Math.atan2(-velocity.x, velocity.z));
        }
        double d3 = currentPos.x - previousPos.x;
        double d4 = currentPos.z - previousPos.z;
        double d5 = Math.sqrt(d3 * d3 + d4 * d4);
        if (d5 > Double.longBitsToDouble(0x79513789B37F99D2L ^ 0x46D54D68F4D18DA9L)) {
            return (float)Math.toDegrees(Math.atan2(-d3, d4));
        }
        return 0.0f;
    }

    private final float calculateAlpha(float progress2) {
        return progress2 < 0.2f ? RangesKt.coerceIn(progress2 / 0.2f, 0.0f, 1.0f) : (progress2 > 0.8f ? RangesKt.coerceIn(1.0f - (progress2 - 0.8f) / 0.2f, 0.0f, 1.0f) : 1.0f);
    }

    private final long lifetimeMillis() {
        return RangesKt.coerceAtLeast((long)(((Number)C.getValue()).floatValue() * 1000.0f), 1L);
    }

    private final void clearState() {
        f.clear();
        F = null;
        g = null;
    }

    private static final boolean useClientColor$lambda$0() {
        return ClientColorModule.INSTANCE.isEnabled();
    }

    private static final boolean trailColor$lambda$0() {
        int n2;
        if (!((Boolean)D.getValue()).booleanValue() || !ClientColorModule.INSTANCE.isEnabled()) {
            int n3 = j[57];
            n3 += j[58];
            n2 = n3 += j[59];
        } else {
            int n4 = j[60];
            n4 += j[61];
            n2 = n4 -= j[62];
        }
        return n2 != 0;
    }

    private static final boolean onUpdate$lambda$1(long $now, long $lifetimeMillis, U it) {
        boolean bl;
        int n2 = j[63];
        n2 ^= j[64];
        Intrinsics.checkNotNullParameter(it, (String)G[n2 -= j[65]]);
        if ($now - it.getTime() > $lifetimeMillis) {
            boolean bl2 = j[66];
            bl2 ^= j[67];
            bl = bl2 += j[68];
        } else {
            boolean bl3 = j[69];
            bl3 -= j[70];
            bl = bl3 += j[71];
        }
        return bl;
    }

    private static final boolean onUpdate$lambda$2(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    static {
        TracesModule.b();
        long l2 = 298881026761312834L;
        long l3 = -3681103469058917322L;
        long l4 = 3494781119824294147L;
        long l5 = 6127922019128024112L;
        long l6 = 6293920657264560454L;
        long l7 = 6329798915127348755L;
        long l8 = 6167011869566178147L;
        long l9 = 2408375239736244480L;
        long l10 = -3742801216874620161L;
        long l11 = 945917366120628642L;
        long l12 = 1941383066934270552L;
        long l13 = 7368287434115583907L;
        long l14 = 8805292512117210850L;
        long l15 = 3282877284397659745L;
        int n2 = j[72];
        n2 ^= j[73];
        G = new Object[n2 += j[74]];
        long l16 = l15;
        int n3 = j[75];
        n3 ^= j[76];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= j[77]);
        Object[] objectArray = new Object[j[78]];
        objectArray[TracesModule.j[79]] = h;
        objectArray[TracesModule.j[80]] = j[81];
        int n4 = j[82];
        Object object = TracesModule.A()[j[83]];
        if (object == null) {
            char[] cArray = "\ue89c\ue8ad\ue892\ue8da\ue908\ue8c3\ue908\ue8a9\ue896\ue8f0\ue8a6\ue8a9\ue94e\ue907\ue8a3\ue89a\ue8fc\ue898\ue89d\ue8b9\ue8a7\ue8d4\ue8f2\ue8a8\ue8a6\ue892\ue8af\ue90c\ue8ad\ue8ba\ue904\ue90c\ue94e\ue909\ue8af\ue8ac\ue932\ue90d\ue8d7\ue8a6\ue8db\ue899\ue8ad\ue883\ue90f\ue908\ue893\ue90e\ue8f5\ue8d8\ue8af\ue8a8\ue94e\ue8f0\ue8a4\ue8ad\ue891\ue8d4\ue881\ue8b8\ue893\ue881\ue8db\ue8c3\ue8d8\ue90c\ue8af\ue8af\ue881\ue8ad\ue8b9\ue8ad\ue8a4\ue8a9\ue907\ue8a7\ue908\ue8fc\ue898\ue892\ue8bd\ue94c\ue892\ue8da\ue892\ue8c3\ue8c3\ue8f5\ue90f\ue90f\ue94c\ue892\ue898\ue89a\ue8a4\ue89d\ue909\ue932\ue8a8\ue8d6\ue909\ue8ad\ue8a4\ue8bb\ue8d7\ue893\ue8a7\ue8bb\ue890\ue8ba\ue890\ue891\ue8f1\ue909\ue8a8\ue8d7\ue8b8\ue895\ue897\ue932\ue897\ue881\ue881\ue931\ue8f0\ue89d\ue8ad\ue90f\ue8f2\ue8a6\ue8d8\ue8f0\ue8b8\ue8aa\ue90a\ue89d\ue8ad\ue90a\ue8a9\ue8a3\ue8d8\ue8f5\ue8e1\ue906\ue892\ue907\ue8d8\ue8b7\ue932\ue90a\ue892\ue8e1\ue908\ue8f1\ue8a7\ue8ac\ue893\ue897\ue8a9\ue8a3\ue8f2\ue8aa\ue898\ue8ae\ue8db\ue909\ue90d\ue908\ue8f3\ue8da\ue89a\ue8d6\ue90e\ue8d4\ue8aa\ue883\ue8d6\ue897\ue8e1\ue8fc\ue8ba\ue8a3\ue8a4\ue8bd\ue8ae\ue8aa\ue89b\ue8bd\ue8a4\ue8ae\ue8b6\ue897\ue890\ue932\ue90d\ue8a3\ue8f3\ue891\ue8a4\ue8f0\ue89c\ue8aa\ue892\ue8a7\ue898\ue899\ue931\ue8c3\ue8bb\ue894\ue898\ue891\ue8b9\ue8dd\ue90a\ue895\ue90d\ue8a4\ue8ba\ue8ba\ue8b8\ue8ac\ue8a9\ue8b6\ue8d8\ue8b4\ue8fc\ue90f\ue89d\ue8ad\ue8d4\ue908\ue8f3\ue932\ue8d6\ue90a\ue8d4\ue89c\ue89c\ue932\ue8a4\ue891\ue8f3\ue909\ue90e\ue90a\ue894\ue8f5\ue909\ue8b4\ue8ad\ue8b8\ue8f0\ue89c\ue8a3\ue8ad\ue891\ue906\ue899\ue8b9\ue90e\ue8f0\ue89a\ue8f5\ue891\ue892\ue8b7\ue895\ue8aa\ue8d7\ue89d\ue8a8\ue897\ue8b4\ue896\ue89a\ue904\ue8b7\ue8a6\ue883\ue907\ue8c3\ue8a4\ue8b4\ue8ac\ue94e\ue891\ue898\ue90e\ue8da\ue909\ue8f2\ue8f3\ue90f\ue893\ue898\ue8dd\ue8a7\ue8d6\ue8bd\ue8b7\ue8f5\ue891\ue8b9\ue8b8\ue891\ue894\ue881\ue90e\ue893\ue8b8\ue8b6\ue8ae\ue8b9\ue8d6\ue8a3\ue8bb\ue898\ue8dd\ue8f3\ue8f5\ue909\ue883\ue8b6\ue893\ue94c\ue8a4\ue90a\ue909\ue908\ue8a7\ue906\ue8f3\ue8e1\ue894\ue90e\ue8d4\ue8da\ue8f3\ue90a\ue8ac\ue931\ue8bd\ue89a\ue8d7\ue908\ue90f\ue8b6\ue89a\ue897\ue94c\ue8bd\ue8b9\ue90c\ue8f5\ue8d8\ue8aa\ue90e\ue8bb\ue89c\ue8c3\ue8a9\ue896\ue8c0".toCharArray();
            for (int i2 = j[84]; i2 < j[85]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= j[86];
                n5 += j[87];
                n5 += j[88];
                n5 ^= j[89];
                n5 ^= j[90];
                n5 ^= j[91];
                n5 += j[92];
                n5 ^= j[93];
                n5 += j[94];
                n5 ^= j[95];
                cArray[i2] = (char)(n5 ^= j[96]);
            }
            object = TracesModule.A()[TracesModule.j[97]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)TracesModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = j[98];
        n6 += j[99];
        l6 = l17 ^ (0xB700000000L ^ l17) & -1L << (n6 -= j[100]);
        long l18 = l13;
        int n7 = j[101];
        n7 ^= j[102];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += j[103]);
        while (true) {
            int n8 = j[104];
            n8 -= j[105];
            if ((int)l13 >= (int)(l6 >>> (n8 -= j[106]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = j[107];
            n10 ^= j[108];
            int n11 = j[110];
            n11 -= j[111];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= j[109])) & -1L >>> (n11 -= j[112]);
            long l20 = l9;
            int n12 = j[113];
            n12 -= j[114];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= j[115]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = j[116];
            n14 -= j[117];
            int n15 = j[119];
            n15 += j[120];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= j[118])) & -1L >>> (n15 += j[121]);
            int n16 = j[122];
            n16 -= j[123];
            long l22 = l10;
            int n17 = j[125];
            n17 -= j[126];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += j[124]) ^ l22) & -1L << (n17 -= j[127]);
            int n18 = j[128];
            n18 += j[129];
            n18 += j[130];
            int n19 = j[131];
            n19 ^= j[132];
            long l23 = l12;
            int n20 = j[134];
            n20 -= j[135];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= j[133]))) ^ l23) & -1L >>> (n20 += j[136]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = j[137];
            n21 += j[138];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += j[139]);
            while (true) {
                int n22 = j[140];
                n22 -= j[141];
                if ((int)(l14 >>> (n22 ^= j[142])) >= (int)l12) break;
                int n23 = j[143];
                n23 ^= j[144];
                int n24 = j[146];
                n24 -= j[147];
                cArray2[(int)(l14 >>> (n23 -= TracesModule.j[145]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= j[148]))];
                l14 += 0x100000000L;
            }
            int n25 = j[149];
            n25 ^= j[150];
            int n26 = (int)(l15 >>> (n25 ^= j[151]));
            l15 += 0x100000000L;
            TracesModule.G[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = j[152];
            n27 ^= j[153];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= j[154]);
        }
        INSTANCE = new TracesModule();
        int n28 = j[155];
        n28 -= j[156];
        C = INSTANCE.slider((String)G[n28 ^= j[157]], 1.5f, 0.5f, 5.0f, 0.1f);
        int n29 = j[158];
        n29 -= j[159];
        int n30 = j[161];
        n30 ^= j[162];
        d = INSTANCE.slider((String)G[n29 += j[160]] + (String)G[n30 += j[163]], 1.5f, 0.1f, 2.5f, 0.1f);
        int n31 = j[164];
        n31 -= j[165];
        boolean bl = j[167];
        bl -= j[168];
        D = INSTANCE.cfr_renamed_0((String)G[n31 -= j[166]], bl -= j[169]).setVisible(TracesModule::useClientColor$lambda$0);
        int n32 = j[170];
        n32 -= j[171];
        String string = (String)G[n32 ^= j[172]];
        Color color = Color.WHITE;
        int n33 = j[173];
        n33 += j[174];
        Intrinsics.checkNotNullExpressionValue(color, (String)G[n33 ^= j[175]]);
        e = INSTANCE.color(string, color).setVisible(TracesModule::trailColor$lambda$0);
        int n34 = j[176];
        n34 -= j[177];
        int n35 = j[179];
        n35 ^= j[180];
        int n36 = j[182];
        n36 ^= j[183];
        E = Identifier.of((String)((String)G[n34 += j[178]]), (String)((String)G[n35 += j[181]] + (String)G[n36 -= j[184]]));
        f = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[j[185]];
        String string = (String)object[j[186]];
        object = object[j[187]];
        Object[] objectArray = i;
        if (i == null) {
            objectArray = i = new Object[j[188]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[j[189]];
                h = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[j[191] ^ j[192]];
                byArray[TracesModule.j[193] ^ TracesModule.j[194]] = j[195] ^ j[196];
                byArray[TracesModule.j[197] ^ TracesModule.j[198]] = j[199] ^ j[200];
                byArray[TracesModule.j[201] ^ TracesModule.j[202]] = j[203] ^ j[204];
                byArray[TracesModule.j[205] ^ TracesModule.j[206]] = j[207] ^ j[208];
                byArray[TracesModule.j[209] ^ TracesModule.j[210]] = j[211] ^ j[212];
                byArray[TracesModule.j[213] ^ TracesModule.j[214]] = j[215] ^ j[216];
                byArray[TracesModule.j[217] ^ TracesModule.j[218]] = j[219] ^ j[220];
                byArray[TracesModule.j[221] ^ TracesModule.j[222]] = j[223] ^ j[224];
                byArray[TracesModule.j[225] ^ TracesModule.j[226]] = j[227] ^ j[228];
                byArray[TracesModule.j[229] ^ TracesModule.j[230]] = j[231] ^ j[232];
                byArray[TracesModule.j[233] ^ TracesModule.j[234]] = j[235] ^ j[236];
                byArray[TracesModule.j[237] ^ TracesModule.j[238]] = j[239] ^ j[240];
                byArray[TracesModule.j[241] ^ TracesModule.j[242]] = j[243] ^ j[244];
                byArray[TracesModule.j[245] ^ TracesModule.j[246]] = j[247] ^ j[248];
                byArray[TracesModule.j[249] ^ TracesModule.j[250]] = j[251] ^ j[252];
                byArray[TracesModule.j[253] ^ TracesModule.j[254]] = j[255] ^ j[256];
                objectArray2[TracesModule.j[190]] = byArray;
            }
            byte[] byArray = (byte[])object3[j[257]];
            if (H == null) {
                byte[] byArray2 = new byte[j[258] ^ j[259]];
                byArray2[TracesModule.j[260] ^ TracesModule.j[261]] = j[262] ^ j[263];
                byArray2[TracesModule.j[264] ^ TracesModule.j[265]] = j[266] ^ j[267];
                byArray2[TracesModule.j[268] ^ TracesModule.j[269]] = j[270] ^ j[271];
                byArray2[TracesModule.j[272] ^ TracesModule.j[273]] = j[274] ^ j[275];
                byArray2[TracesModule.j[276] ^ TracesModule.j[277]] = j[278] ^ j[279];
                byArray2[TracesModule.j[280] ^ TracesModule.j[281]] = j[282] ^ j[283];
                byArray2[TracesModule.j[284] ^ TracesModule.j[285]] = j[286] ^ j[287];
                byArray2[TracesModule.j[288] ^ TracesModule.j[289]] = j[290] ^ j[291];
                byArray2[TracesModule.j[292] ^ TracesModule.j[293]] = j[294] ^ j[295];
                byArray2[TracesModule.j[296] ^ TracesModule.j[297]] = j[298] ^ j[299];
                byArray2[TracesModule.j[300] ^ TracesModule.j[301]] = j[302] ^ j[303];
                byArray2[TracesModule.j[304] ^ TracesModule.j[305]] = j[306] ^ j[307];
                byArray2[TracesModule.j[308] ^ TracesModule.j[309]] = j[310] ^ j[311];
                byArray2[TracesModule.j[312] ^ TracesModule.j[313]] = j[314] ^ j[315];
                byArray2[TracesModule.j[316] ^ TracesModule.j[317]] = j[318] ^ j[319];
                byArray2[TracesModule.j[320] ^ TracesModule.j[321]] = j[322] ^ j[323];
                byArray2[TracesModule.j[324] ^ TracesModule.j[325]] = j[326] ^ j[327];
                byArray2[TracesModule.j[328] ^ TracesModule.j[329]] = j[330] ^ j[331];
                byArray2[TracesModule.j[332] ^ TracesModule.j[333]] = j[334] ^ j[335];
                byArray2[TracesModule.j[336] ^ TracesModule.j[337]] = j[338] ^ j[339];
                byArray2[TracesModule.j[340] ^ TracesModule.j[341]] = j[342] ^ j[343];
                byArray2[TracesModule.j[344] ^ TracesModule.j[345]] = j[346] ^ j[347];
                byArray2[TracesModule.j[348] ^ TracesModule.j[349]] = j[350] ^ j[351];
                byArray2[TracesModule.j[352] ^ TracesModule.j[353]] = j[354] ^ j[355];
                byArray2[TracesModule.j[356] ^ TracesModule.j[357]] = j[358] ^ j[359];
                byArray2[TracesModule.j[360] ^ TracesModule.j[361]] = j[362] ^ j[363];
                byArray2[TracesModule.j[364] ^ TracesModule.j[365]] = j[366] ^ j[367];
                byArray2[TracesModule.j[368] ^ TracesModule.j[369]] = j[370] ^ j[371];
                byArray2[TracesModule.j[372] ^ TracesModule.j[373]] = j[374] ^ j[375];
                byArray2[TracesModule.j[376] ^ TracesModule.j[377]] = j[378] ^ j[379];
                byArray2[TracesModule.j[380] ^ TracesModule.j[381]] = j[382] ^ j[383];
                byArray2[TracesModule.j[384] ^ TracesModule.j[385]] = j[386] ^ j[387];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, j[388], byArray3, j[389], byArray.length);
                System.arraycopy(byArray2, j[390], byArray3, byArray.length, byArray2.length);
                Object object4 = TracesModule.A()[j[391]];
                if (object4 == null) {
                    char[] cArray = "\u25c4\u25f2\u25c9\u25f0\u25ee\u2522\u25fd\u24eb\u24e0\u248c\u25ec\u24e7\u2493\u2491\u25c1\u25ec\u25f3\u2523".toCharArray();
                    for (int i2 = j[392]; i2 < j[393]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= j[394];
                        n3 -= j[395];
                        n3 += j[396];
                        n3 -= j[397];
                        n3 += j[398];
                        n3 -= j[399];
                        n3 -= 5422;
                        n3 -= 4533;
                        n3 ^= 0xEF57;
                        n3 ^= 0x6198;
                        n3 ^= 0xD58;
                        n3 ^= 0x2BF8;
                        cArray[i2] = (char)(n3 += 59993);
                    }
                    object4 = TracesModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[7] = 35;
                byArray4[5] = -94;
                byArray4[12] = -93;
                byArray4[11] = -16;
                byArray4[15] = 7;
                byArray4[9] = -17;
                byArray4[13] = 6;
                byArray4[8] = 72;
                byArray4[6] = 35;
                byArray4[0] = 29;
                byArray4[1] = 123;
                byArray4[14] = -122;
                byArray4[10] = 9;
                byArray4[2] = -43;
                byArray4[4] = -114;
                byArray4[3] = 81;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 26, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = TracesModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u10de\u1102\u116c".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 40960;
                        n4 += 6801;
                        n4 -= 31634;
                        n4 -= 34338;
                        n4 += 55124;
                        n4 ^= 0xBFD5;
                        n4 += 53481;
                        n4 ^= 0x17AA;
                        n4 ^= 0xED1C;
                        n4 += 1262;
                        cArray[i3] = (char)(n4 += 42462);
                    }
                    object5 = TracesModule.A()[2] = new String(cArray);
                }
                H = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = TracesModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u04bb\u04bf\u0389\u04e5\u04b9\u04ba\u04b9\u04e5\u038c\u04c1\u04b9\u0389\u04af\u038c\u055b\u0560\u0560\u0563\u0566\u055d".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 42753;
                    n5 += 33170;
                    n5 ^= 0x5AE3;
                    n5 += 19510;
                    n5 += 49271;
                    n5 += 65272;
                    n5 ^= 0xEF59;
                    n5 ^= 0xA2F9;
                    n5 -= 53437;
                    n5 += 20190;
                    cArray[i4] = (char)(n5 += 45870);
                }
                object6 = TracesModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)H), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = I;
        if (I == null) {
            I = new Object[4];
            objectArray = I;
        }
        return objectArray;
    }

    public static void b() {
        j = new int[0x41BE ^ 0x402E];
        TracesModule.j[0xD0E6 ^ 0xD1F5] = 0xAE5C ^ 0xD1F5;
        TracesModule.j[0x5BCC ^ 0x5A47] = 0x7D86 ^ 0x5A47;
        TracesModule.j[0xF704 ^ 0xF710] = 0xF735 ^ 0xF710;
        TracesModule.j[0x2F43 ^ 0x2F4F] = 0xFFFFD0B1 ^ 0x2F4F;
        TracesModule.j[0x8C3E ^ 0x8D79] = 0x1058 ^ 0x8D79;
        TracesModule.j[0x37AF ^ 0x36EF] = 0xCE16 ^ 0x36EF;
        TracesModule.j[0xB266 ^ 0xB2F0] = 0xB2BA ^ 0xB2F0;
        TracesModule.j[0x4B2A ^ 0x4B8D] = 0x4BA9 ^ 0x4B8D;
        TracesModule.j[0xC697 ^ 0xC79F] = 0x5833 ^ 0xC79F;
        TracesModule.j[0xF684 ^ 0xF6BB] = 0xF6B1 ^ 0xF6BB;
        TracesModule.j[0xA78 ^ 0xB17] = 0xC483 ^ 0xB17;
        TracesModule.j[0x9DF0 ^ 0x9DF4] = 0x9DC4 ^ 0x9DF4;
        TracesModule.j[0x42C5 ^ 0x43F0] = 0x386A ^ 0x43F0;
        TracesModule.j[0x342F ^ 0x344C] = 0x346C ^ 0x344C;
        TracesModule.j[0x1A78 ^ 0x1B2F] = 0x2B4D ^ 0x1B2F;
        TracesModule.j[0xADE1 ^ 0xAD64] = 0xAD18 ^ 0xAD64;
        TracesModule.j[0x3C68 ^ 0x3D1D] = 0x65B7 ^ 0x3D1D;
        TracesModule.j[0x8D41 ^ 0x8C73] = 0xF9DF ^ 0x8C73;
        TracesModule.j[0x104ED ^ 0x104CA] = 0xFFFEFB20 ^ 0x104CA;
        TracesModule.j[0x91AA ^ 0x9101] = 0x9175 ^ 0x9101;
        TracesModule.j[0xE98A ^ 0xE952] = 0xDFBA ^ 0xE952;
        TracesModule.j[0xC9B9 ^ 0xC8A9] = 0xB70E ^ 0xC8A9;
        TracesModule.j[0x14B8 ^ 0x145C] = 0x5BB1 ^ 0x145C;
        TracesModule.j[0x84B2 ^ 0x8499] = 0x8488 ^ 0x8499;
        TracesModule.j[0x2CF6 ^ 0x2D78] = 0x8450 ^ 0x2D78;
        TracesModule.j[0x22ED ^ 0x22FF] = 0xFFFFDD54 ^ 0x22FF;
        TracesModule.j[0xEBCE ^ 0xEB0B] = 0xF5C7 ^ 0xEB0B;
        TracesModule.j[0x20FF ^ 0x218F] = 0xE9AD ^ 0x218F;
        TracesModule.j[0xA98A ^ 0xA896] = 0x26CB ^ 0xA896;
        TracesModule.j[0xE65A ^ 0xE6A4] = 0xD88 ^ 0xE6A4;
        TracesModule.j[0x9290 ^ 0x9283] = 0xFFFF6D08 ^ 0x9283;
        TracesModule.j[0x2108 ^ 0x210F] = 0xFFFFDE89 ^ 0x210F;
        TracesModule.j[0x38C1 ^ 0x38CF] = 0x3896 ^ 0x38CF;
        TracesModule.j[0x10A03 ^ 0x10A78] = 0xFFFEF5A3 ^ 0x10A78;
        TracesModule.j[0x83DD ^ 0x834F] = 0xFFFF7C7C ^ 0x834F;
        TracesModule.j[0x9E90 ^ 0x9E6C] = 0x3550 ^ 0x9E6C;
        TracesModule.j[0x7216 ^ 0x723C] = 0x7267 ^ 0x723C;
        TracesModule.j[0x10B06 ^ 0x10B22] = 0xFFFEF4EC ^ 0x10B22;
        TracesModule.j[0xDE25 ^ 0xDE96] = 0xDEB3 ^ 0xDE96;
        TracesModule.j[0x9ECF ^ 0x9ED4] = 0x9ED8 ^ 0x9ED4;
        TracesModule.j[0xA332 ^ 0xA21E] = 0x5D77 ^ 0xA21E;
        TracesModule.j[0x11DA ^ 0x1055] = 0x4778 ^ 0x1055;
        TracesModule.j[0x6E0C ^ 0x6EA9] = 0x6EF0 ^ 0x6EA9;
        TracesModule.j[0x7BAF ^ 0x7B5F] = 0xEDA9 ^ 0x7B5F;
        TracesModule.j[0x33C5 ^ 0x324F] = 0x5FEF ^ 0x324F;
        TracesModule.j[0x10584 ^ 0x1054E] = 0x1E088 ^ 0x1054E;
        TracesModule.j[0xE3A8 ^ 0xE2B6] = 0x6CB7 ^ 0xE2B6;
        TracesModule.j[0x1953 ^ 0x1984] = 0x2F5F ^ 0x1984;
        TracesModule.j[0x8881 ^ 0x8998] = 0x8BA1 ^ 0x8998;
        TracesModule.j[0xD536 ^ 0xD474] = 0xFFFFD344 ^ 0xD474;
        TracesModule.j[0x29BE ^ 0x2945] = 0x8205 ^ 0x2945;
        TracesModule.j[0xA14A ^ 0xA172] = 0xA138 ^ 0xA172;
        TracesModule.j[0xCA0B ^ 0xCA4F] = 0xFFFF35FD ^ 0xCA4F;
        TracesModule.j[0x46F3 ^ 0x47CA] = 0x76D4 ^ 0x47CA;
        TracesModule.j[0x7823 ^ 0x7900] = 0x6ABE ^ 0x7900;
        TracesModule.j[0x810 ^ 0x994] = 0x994 ^ 0x994;
        TracesModule.j[0x7BD8 ^ 0x7BB5] = 0xFFFF8417 ^ 0x7BB5;
        TracesModule.j[0xD14 ^ 0xD69] = 0xDF6 ^ 0xD69;
        TracesModule.j[0x38BD ^ 0x393D] = 0xC50F ^ 0x393D;
        TracesModule.j[0x6F4D ^ 0x6F1C] = 0x6F1C ^ 0x6F1C;
        TracesModule.j[0x6667 ^ 0x6630] = 0x67A5 ^ 0x6630;
        TracesModule.j[0xA5F7 ^ 0xA58F] = 0xFFFF5A42 ^ 0xA58F;
        TracesModule.j[0x60EC ^ 0x61F9] = 0x46FC ^ 0x61F9;
        TracesModule.j[0xB06C ^ 0xB029] = 0xFFFF4FD4 ^ 0xB029;
        TracesModule.j[0xB5BC ^ 0xB56C] = 0x1B49F ^ 0xB56C;
        TracesModule.j[0x100BB ^ 0x1005E] = 0x12584 ^ 0x1005E;
        TracesModule.j[0x7FBA ^ 0x7F1A] = 0x7F79 ^ 0x7F1A;
        TracesModule.j[0x6179 ^ 0x614A] = 0x610C ^ 0x614A;
        TracesModule.j[0xE586 ^ 0xE4FF] = 0x9530 ^ 0xE4FF;
        TracesModule.j[0x2ADB ^ 0x2A88] = 0x2A88 ^ 0x2A88;
        TracesModule.j[0x5B2C ^ 0x5AA5] = 0x5AB7 ^ 0x5AA5;
        TracesModule.j[0xF88B ^ 0xF845] = 0x1F9B6 ^ 0xF845;
        TracesModule.j[0x4A5 ^ 0x411] = 0x40B ^ 0x411;
        TracesModule.j[0xB424 ^ 0xB4D3] = 0xFFFF9B55 ^ 0xB4D3;
        TracesModule.j[0x107B8 ^ 0x107D7] = 0xFFFEF870 ^ 0x107D7;
        TracesModule.j[0x7BEA ^ 0x7AB8] = 0xFFFF9EE1 ^ 0x7AB8;
        TracesModule.j[0xD1E1 ^ 0xD175] = 0xFFFF2ED4 ^ 0xD175;
        TracesModule.j[0x52E1 ^ 0x53DC] = 0xCF78 ^ 0x53DC;
        TracesModule.j[0x6F0C ^ 0x6FCD] = 0xD82F ^ 0x6FCD;
        TracesModule.j[0xD7BA ^ 0xD689] = 0xA31A ^ 0xD689;
        TracesModule.j[0x1A6F ^ 0x1A2C] = 0xFFFFE590 ^ 0x1A2C;
        TracesModule.j[0x97D0 ^ 0x976A] = 0x9768 ^ 0x976A;
        TracesModule.j[0x71F0 ^ 0x719A] = 0x71F7 ^ 0x719A;
        TracesModule.j[0x108A6 ^ 0x1089C] = 0x1088F ^ 0x1089C;
        TracesModule.j[0x5A9C ^ 0x5A1A] = 0x5A53 ^ 0x5A1A;
        TracesModule.j[0xD83E ^ 0xD85F] = 0xD85F ^ 0xD85F;
        TracesModule.j[0xC255 ^ 0xC323] = 0x9B90 ^ 0xC323;
        TracesModule.j[0xFFC9 ^ 0xFEED] = 0x691 ^ 0xFEED;
        TracesModule.j[0x97DC ^ 0x9728] = 0xA8D0 ^ 0x9728;
        TracesModule.j[0x6E6 ^ 0x79E] = 0x7658 ^ 0x79E;
        TracesModule.j[0x2BB0 ^ 0x2AD6] = 0xFFFEDED5 ^ 0x2AD6;
        TracesModule.j[0x98DE ^ 0x999F] = 0x6176 ^ 0x999F;
        TracesModule.j[0xC7EE ^ 0xC69F] = 0xEA6 ^ 0xC69F;
        TracesModule.j[0x165A ^ 0x1731] = 0xA28 ^ 0x1731;
        TracesModule.j[0xE182 ^ 0xE0C6] = 0x7DE4 ^ 0xE0C6;
        TracesModule.j[0x666B ^ 0x6689] = 0x2964 ^ 0x6689;
        TracesModule.j[0x908E ^ 0x90CC] = 0xFFFF6F3F ^ 0x90CC;
        TracesModule.j[0x789B ^ 0x7989] = 0xFFFFF9B4 ^ 0x7989;
        TracesModule.j[0x20AC ^ 0x20B0] = 0xFFFFDF2E ^ 0x20B0;
        TracesModule.j[0x4F38 ^ 0x4FC2] = 0xE4FE ^ 0x4FC2;
        TracesModule.j[0xEDC4 ^ 0xECBB] = 0x6A73 ^ 0xECBB;
        TracesModule.j[0x8953 ^ 0x89F2] = 0xFFFF7659 ^ 0x89F2;
        TracesModule.j[0xDC2A ^ 0xDC1D] = 0xDC45 ^ 0xDC1D;
        TracesModule.j[0xC6E3 ^ 0xC631] = 0xF55C ^ 0xC631;
        TracesModule.j[0x4150 ^ 0x41F9] = 0x4183 ^ 0x41F9;
        TracesModule.j[0xCAE6 ^ 0xCBE3] = 0xEB7C ^ 0xCBE3;
        TracesModule.j[0xFC3F ^ 0xFC70] = 0xFC70 ^ 0xFC70;
        TracesModule.j[0x8E38 ^ 0x8EB4] = 0x8E91 ^ 0x8EB4;
        TracesModule.j[0x6355 ^ 0x638C] = 0xB310 ^ 0x638C;
        TracesModule.j[0xA2B7 ^ 0xA2D1] = 0xA2D3 ^ 0xA2D1;
        TracesModule.j[0xEFA1 ^ 0xEFBE] = 0xEFFE ^ 0xEFBE;
        TracesModule.j[0x7706 ^ 0x770E] = 0x7707 ^ 0x770E;
        TracesModule.j[0x6ACE ^ 0x6BEB] = 0x9388 ^ 0x6BEB;
        TracesModule.j[0x8F41 ^ 0x8E5C] = 0x15 ^ 0x8E5C;
        TracesModule.j[0xE882 ^ 0xE89A] = 0xE8FD ^ 0xE89A;
        TracesModule.j[0xE2B4 ^ 0xE2EB] = 0x6225 ^ 0xE2EB;
        TracesModule.j[0x10578 ^ 0x10593] = 0xFFFE63CB ^ 0x10593;
        TracesModule.j[0x1874 ^ 0x187B] = 0x1838 ^ 0x187B;
        TracesModule.j[0xF10B ^ 0xF042] = 0xB2A3 ^ 0xF042;
        TracesModule.j[0xB601 ^ 0xB707] = 0xFFFF6823 ^ 0xB707;
        TracesModule.j[0x437D ^ 0x421F] = 0x3513 ^ 0x421F;
        TracesModule.j[0xFBAB ^ 0xFA8B] = 0xE922 ^ 0xFA8B;
        TracesModule.j[0x1573 ^ 0x1428] = 0x32A1 ^ 0x1428;
        TracesModule.j[0xD429 ^ 0xD499] = 0xD491 ^ 0xD499;
        TracesModule.j[0x685A ^ 0x6898] = 0xDF77 ^ 0x6898;
        TracesModule.j[0x50CE ^ 0x50FF] = 0xFFFFAF55 ^ 0x50FF;
        TracesModule.j[0x5E3 ^ 0x504] = 0x20CF ^ 0x504;
        TracesModule.j[0x10431 ^ 0x104AC] = 0x104FB ^ 0x104AC;
        TracesModule.j[0x4D5B ^ 0x4DCA] = 0x4DD8 ^ 0x4DCA;
        TracesModule.j[0xD147 ^ 0xD161] = 0xFFFF2EC3 ^ 0xD161;
        TracesModule.j[0xF305 ^ 0xF361] = 0xF343 ^ 0xF361;
        TracesModule.j[0x49EF ^ 0x496C] = 0x4984 ^ 0x496C;
        TracesModule.j[0x9483 ^ 0x95F0] = 0x5DC9 ^ 0x95F0;
        TracesModule.j[0x2C10 ^ 0x2CED] = 0xC7C4 ^ 0x2CED;
        TracesModule.j[0x7082 ^ 0x7080] = 0xFFFF8F02 ^ 0x7080;
        TracesModule.j[0x3E6C ^ 0x3E02] = 0xFFFFC14E ^ 0x3E02;
        TracesModule.j[0xE1DE ^ 0xE052] = 0xC731 ^ 0xE052;
        TracesModule.j[0x8657 ^ 0x86FF] = 0xFFFF7955 ^ 0x86FF;
        TracesModule.j[0x2441 ^ 0x242D] = 0x2426 ^ 0x242D;
        TracesModule.j[0x6ADB ^ 0x6A95] = 0x6A96 ^ 0x6A95;
        TracesModule.j[0xD194 ^ 0xD0CA] = 0xFFFFEBE8 ^ 0xD0CA;
        TracesModule.j[0x26AF ^ 0x26A5] = 0xFFFFD952 ^ 0x26A5;
        TracesModule.j[0x1BF7 ^ 0x1BCA] = 0xFFFFE420 ^ 0x1BCA;
        TracesModule.j[0xA040 ^ 0xA0AD] = 0x3657 ^ 0xA0AD;
        TracesModule.j[0x7115 ^ 0x7033] = 0xFFFF77F9 ^ 0x7033;
        TracesModule.j[0xD784 ^ 0xD7CD] = 0xFFFF2814 ^ 0xD7CD;
        TracesModule.j[0xEAE4 ^ 0xEBBD] = 0xCD34 ^ 0xEBBD;
        TracesModule.j[0x2DCC ^ 0x2D55] = 0x2D63 ^ 0x2D55;
        TracesModule.j[0x806A ^ 0x8092] = 0x508C ^ 0x8092;
        TracesModule.j[0x1DCF ^ 0x1DDA] = 0x41D80 ^ 0x1DDA;
        TracesModule.j[0xA6F1 ^ 0xA774] = 0xA774 ^ 0xA774;
        TracesModule.j[0xB042 ^ 0xB05B] = 0xFFFF4FB3 ^ 0xB05B;
        TracesModule.j[0x7977 ^ 0x781A] = 0xB78E ^ 0x781A;
        TracesModule.j[0xDB41 ^ 0xDAC6] = 0xDAC7 ^ 0xDAC6;
        TracesModule.j[0x100D1 ^ 0x1006E] = 0x15DF2 ^ 0x1006E;
        TracesModule.j[0x17B3 ^ 0x1708] = 0x1708 ^ 0x1708;
        TracesModule.j[0xF9A9 ^ 0xF96F] = 0xE7A8 ^ 0xF96F;
        TracesModule.j[0x8265 ^ 0x832E] = 0xC1CF ^ 0x832E;
        TracesModule.j[0xBE28 ^ 0xBEBF] = 0xBE81 ^ 0xBEBF;
        TracesModule.j[0x6D67 ^ 0x6D47] = 0x6D27 ^ 0x6D47;
        TracesModule.j[0x1388 ^ 0x138E] = 0x1309 ^ 0x138E;
        TracesModule.j[0xE43E ^ 0xE562] = 0x21CF ^ 0xE562;
        TracesModule.j[0x4C69 ^ 0x4CF3] = 0x4CCB ^ 0x4CF3;
        TracesModule.j[0xDECC ^ 0xDE6E] = 0xFFFF21AD ^ 0xDE6E;
        TracesModule.j[0x6CA9 ^ 0x6CEE] = 0x6CF4 ^ 0x6CEE;
        TracesModule.j[0xDB3 ^ 0xDE6] = 0xC8A ^ 0xDE6;
        TracesModule.j[0x3D43 ^ 0x3C69] = 0xFFFF8B0E ^ 0x3C69;
        TracesModule.j[0x74F ^ 0x78B] = 0xB064 ^ 0x78B;
        TracesModule.j[0x646E ^ 0x65ED] = 0x99CA ^ 0x65ED;
        TracesModule.j[0x3C06 ^ 0x3C38] = 0x3C52 ^ 0x3C38;
        TracesModule.j[0x4F45 ^ 0x4E16] = 0x55D7 ^ 0x4E16;
        TracesModule.j[0x8D2B ^ 0x8D9D] = 0x8DF8 ^ 0x8D9D;
        TracesModule.j[0x9E5 ^ 0x8B1] = 0x38D5 ^ 0x8B1;
        TracesModule.j[0x4D51 ^ 0x4D8D] = 0x9D11 ^ 0x4D8D;
        TracesModule.j[0x44E6 ^ 0x45B7] = 0x5E76 ^ 0x45B7;
        TracesModule.j[0x806F ^ 0x8054] = 0xFFFF7FA8 ^ 0x8054;
        TracesModule.j[0x1D53 ^ 0x1DF0] = 0xFFFFE253 ^ 0x1DF0;
        TracesModule.j[0xB9F4 ^ 0xB950] = 0xB965 ^ 0xB950;
        TracesModule.j[0xDFD0 ^ 0xDFC0] = 0xFFFF207E ^ 0xDFC0;
        TracesModule.j[0xE8F1 ^ 0xE831] = 0xB5BD ^ 0xE831;
        TracesModule.j[0xCFAE ^ 0xCF26] = 0xFFFF30F2 ^ 0xCF26;
        TracesModule.j[0xFD63 ^ 0xFDEA] = 0xFDB3 ^ 0xFDEA;
        TracesModule.j[0x1017 ^ 0x104C] = 0x2526 ^ 0x104C;
        TracesModule.j[0xA102 ^ 0xA1B5] = 0xFFFF5E19 ^ 0xA1B5;
        TracesModule.j[0x204 ^ 0x2EB] = 0xFFFF6BF4 ^ 0x2EB;
        TracesModule.j[0x7323 ^ 0x7254] = 0x2AFE ^ 0x7254;
        TracesModule.j[0x3F53 ^ 0x3F1B] = 0xFFFFC0E8 ^ 0x3F1B;
        TracesModule.j[0xEB6E ^ 0xEB88] = 0xCE55 ^ 0xEB88;
        TracesModule.j[0x44C2 ^ 0x45CC] = 0xFFFFF5CF ^ 0x45CC;
        TracesModule.j[0x8FAB ^ 0x8ED9] = 0x46D2 ^ 0x8ED9;
        TracesModule.j[0x11D7 ^ 0x10A9] = 0x9653 ^ 0x10A9;
        TracesModule.j[0x90B6 ^ 0x902E] = 0x9000 ^ 0x902E;
        TracesModule.j[0xC94 ^ 0xD15] = 0xF132 ^ 0xD15;
        TracesModule.j[0x1EB8 ^ 0x1E16] = 0x1E44 ^ 0x1E16;
        TracesModule.j[0xFBBE ^ 0xFBBE] = 0xFB9C ^ 0xFBBE;
        TracesModule.j[0x32E7 ^ 0x32BF] = 0x8A49 ^ 0x32BF;
        TracesModule.j[0x148F ^ 0x15EA] = 0x11E14 ^ 0x15EA;
        TracesModule.j[0xD368 ^ 0xD201] = 0xCF18 ^ 0xD201;
        TracesModule.j[0x100D2 ^ 0x100FB] = 0x100E6 ^ 0x100FB;
        TracesModule.j[0x44B3 ^ 0x44D8] = 0xFFFFBB70 ^ 0x44D8;
        TracesModule.j[0x1851 ^ 0x1976] = 0xE115 ^ 0x1976;
        TracesModule.j[0xAA9E ^ 0xAA32] = 0xFFFF558A ^ 0xAA32;
        TracesModule.j[0x4D62 ^ 0x4D00] = 0x4D22 ^ 0x4D00;
        TracesModule.j[0xD296 ^ 0xD21D] = 0xD230 ^ 0xD21D;
        TracesModule.j[0x76F5 ^ 0x767A] = 0xFFFF89E7 ^ 0x767A;
        TracesModule.j[0x6E9D ^ 0x6FA2] = 0xF306 ^ 0x6FA2;
        TracesModule.j[0xA233 ^ 0xA20A] = 0xFFFF5DF8 ^ 0xA20A;
        TracesModule.j[0xA5D5 ^ 0xA5F0] = 0xA5BC ^ 0xA5F0;
        TracesModule.j[0x509C ^ 0x519D] = 0x519D ^ 0x519D;
        TracesModule.j[0xA81F ^ 0xA814] = 0xFFFF57E7 ^ 0xA814;
        TracesModule.j[0x55BA ^ 0x551C] = 0xFFFFAACA ^ 0x551C;
        TracesModule.j[0x1456 ^ 0x1510] = 0x886E ^ 0x1510;
        TracesModule.j[0x1DF0 ^ 0x1D33] = 0xAAD1 ^ 0x1D33;
        TracesModule.j[0xCBF2 ^ 0xCAA4] = 0xFFFF0529 ^ 0xCAA4;
        TracesModule.j[0xBACA ^ 0xBBB0] = 0xCA0B ^ 0xBBB0;
        TracesModule.j[0xA894 ^ 0xA845] = 0x9B29 ^ 0xA845;
        TracesModule.j[0xCCB5 ^ 0xCCEC] = 0x2C8A ^ 0xCCEC;
        TracesModule.j[0x2A74 ^ 0x2AC9] = 0x2AC8 ^ 0x2AC9;
        TracesModule.j[0x5873 ^ 0x5970] = 0x8FE1 ^ 0x5970;
        TracesModule.j[0x2AE2 ^ 0x2ACC] = 0x2AEB ^ 0x2ACC;
        TracesModule.j[0x6849 ^ 0x68CB] = 0xFFFF9729 ^ 0x68CB;
        TracesModule.j[0xA2B3 ^ 0xA268] = 0xFFFF8D25 ^ 0xA268;
        TracesModule.j[0xDD53 ^ 0xDC5F] = 0x93C1 ^ 0xDC5F;
        TracesModule.j[0xD40 ^ 0xD31] = 0xD66 ^ 0xD31;
        TracesModule.j[0xD0BA ^ 0xD132] = 0xD132 ^ 0xD132;
        TracesModule.j[0x2E6 ^ 0x39B] = 0x8553 ^ 0x39B;
        TracesModule.j[0x5706 ^ 0x5656] = 0x4D89 ^ 0x5656;
        TracesModule.j[0x10223 ^ 0x102A9] = 0xFFFEFD33 ^ 0x102A9;
        TracesModule.j[0x8A8D ^ 0x8B8F] = 0x5D3E ^ 0x8B8F;
        TracesModule.j[0xD980 ^ 0xD91B] = 0xD92F ^ 0xD91B;
        TracesModule.j[0x793E ^ 0x7859] = 0x173A7 ^ 0x7859;
        TracesModule.j[0xC3D1 ^ 0xC2FF] = 0x3DD9 ^ 0xC2FF;
        TracesModule.j[0xFAAB ^ 0xFAAA] = 0xFFFF0507 ^ 0xFAAA;
        TracesModule.j[0x10E9A ^ 0x10EFA] = 0x19D15 ^ 0x10EFA;
        TracesModule.j[0x5EA3 ^ 0x5E9F] = 0x5E1F ^ 0x5E9F;
        TracesModule.j[0x4B8B ^ 0x4BF9] = 0xFFFFB414 ^ 0x4BF9;
        TracesModule.j[0x7F41 ^ 0x7E0B] = 0x3C87 ^ 0x7E0B;
        TracesModule.j[0x5953 ^ 0x5844] = 0x7F41 ^ 0x5844;
        TracesModule.j[0x8281 ^ 0x838B] = 0x1C28 ^ 0x838B;
        TracesModule.j[0x249B ^ 0x25EF] = 0x7D4D ^ 0x25EF;
        TracesModule.j[0x5A8D ^ 0x5A90] = 0x5ADE ^ 0x5A90;
        TracesModule.j[0xE331 ^ 0xE344] = 0xFFFF1CCA ^ 0xE344;
        TracesModule.j[0x6C30 ^ 0x6CB4] = 0x6CC0 ^ 0x6CB4;
        TracesModule.j[0xEE40 ^ 0xEF7E] = 0x73F9 ^ 0xEF7E;
        TracesModule.j[0xAC78 ^ 0xACE6] = 0xFFFF5340 ^ 0xACE6;
        TracesModule.j[0x9AEB ^ 0x9AC3] = 0xFFFF6514 ^ 0x9AC3;
        TracesModule.j[0x6C4A ^ 0x6CFF] = 0xFFFF933B ^ 0x6CFF;
        TracesModule.j[0xD600 ^ 0xD6AA] = 0xD681 ^ 0xD6AA;
        TracesModule.j[0x754F ^ 0x7401] = 0xF859 ^ 0x7401;
        TracesModule.j[0x36B ^ 0x34A] = 0x3FB ^ 0x34A;
        TracesModule.j[0x5DDD ^ 0x5CC7] = 0xFFFFA148 ^ 0x5CC7;
        TracesModule.j[0x6A8 ^ 0x6FA] = 0x6F8 ^ 0x6FA;
        TracesModule.j[0xCDD9 ^ 0xCCA2] = 0xBD6D ^ 0xCCA2;
        TracesModule.j[0xEECF ^ 0xEECC] = 0xFFFF1119 ^ 0xEECC;
        TracesModule.j[0xDB1F ^ 0xDB8F] = 0xFFFF2420 ^ 0xDB8F;
        TracesModule.j[0xB988 ^ 0xB917] = 0xB917 ^ 0xB917;
        TracesModule.j[0x10B29 ^ 0x10A29] = 0x1E105 ^ 0x10A29;
        TracesModule.j[0xB54D ^ 0xB47A] = 0xCFE0 ^ 0xB47A;
        TracesModule.j[0x1064C ^ 0x10765] = 0x14F90 ^ 0x10765;
        TracesModule.j[0x1585 ^ 0x159B] = 0x15BB ^ 0x159B;
        TracesModule.j[0xCE56 ^ 0xCF03] = 0xFF61 ^ 0xCF03;
        TracesModule.j[0xFA6B ^ 0xFA26] = 0xFA41 ^ 0xFA26;
        TracesModule.j[0x79DB ^ 0x78D2] = 0xE774 ^ 0x78D2;
        TracesModule.j[0x8236 ^ 0x823B] = 0x8259 ^ 0x823B;
        TracesModule.j[0xA115 ^ 0xA02D] = 0x9131 ^ 0xA02D;
        TracesModule.j[0x38E ^ 0x349] = 0x1D9D ^ 0x349;
        TracesModule.j[0xC710 ^ 0xC7A8] = 0xFFFF3810 ^ 0xC7A8;
        TracesModule.j[0xDDCE ^ 0xDD43] = 0xFFFF22AB ^ 0xDD43;
        TracesModule.j[0x7F94 ^ 0x7E9F] = 0xE139 ^ 0x7E9F;
        TracesModule.j[0x6329 ^ 0x624D] = 0x169A5 ^ 0x624D;
        TracesModule.j[0x406F ^ 0x40A7] = 0x5E60 ^ 0x40A7;
        TracesModule.j[0x27B6 ^ 0x26DA] = 0xE95D ^ 0x26DA;
        TracesModule.j[0xA4FD ^ 0xA59C] = 0xD289 ^ 0xA59C;
        TracesModule.j[0x61CC ^ 0x61EF] = 0x61A3 ^ 0x61EF;
        TracesModule.j[0x395A ^ 0x396C] = 0xFFFFC6F4 ^ 0x396C;
        TracesModule.j[0xEDD6 ^ 0xEDA2] = 0xFFFF12F4 ^ 0xEDA2;
        TracesModule.j[0x9040 ^ 0x90EF] = 0xFFFF6F5D ^ 0x90EF;
        TracesModule.j[0x10182 ^ 0x101C3] = 0xFFFEFE76 ^ 0x101C3;
        TracesModule.j[0xA881 ^ 0xA907] = 0xA907 ^ 0xA907;
        TracesModule.j[0x7C8E ^ 0x7D03] = 0xC885 ^ 0x7D03;
        TracesModule.j[0xEEAC ^ 0xEEC5] = 0xFFFF1178 ^ 0xEEC5;
        TracesModule.j[0xD875 ^ 0xD89C] = 0x4154 ^ 0xD89C;
        TracesModule.j[0xD42D ^ 0xD493] = 0xD493 ^ 0xD493;
        TracesModule.j[0x6A81 ^ 0x6AAD] = 0xFFFF9519 ^ 0x6AAD;
        TracesModule.j[0xC2F1 ^ 0xC24D] = 0xC24C ^ 0xC24D;
        TracesModule.j[0x6397 ^ 0x63CB] = 0x66F0 ^ 0x63CB;
        TracesModule.j[0x268A ^ 0x2647] = 0x127B7 ^ 0x2647;
        TracesModule.j[0x6B84 ^ 0x6AF8] = 0xEC3D ^ 0x6AF8;
        TracesModule.j[0x2569 ^ 0x2537] = 0xD9FA ^ 0x2537;
        TracesModule.j[0xEFC4 ^ 0xEF43] = 0xFFFF10BE ^ 0xEF43;
        TracesModule.j[0xC0AE ^ 0xC1E1] = 0x4DAD ^ 0xC1E1;
        TracesModule.j[0x5B86 ^ 0x5BB2] = 0xFFFFA40C ^ 0x5BB2;
        TracesModule.j[0x3D6E ^ 0x3D0B] = 0x3D77 ^ 0x3D0B;
        TracesModule.j[0x97CC ^ 0x973A] = 0x4724 ^ 0x973A;
        TracesModule.j[0x7C62 ^ 0x7D01] = 0xA14 ^ 0x7D01;
        TracesModule.j[0x10241 ^ 0x102A1] = 0x1A860 ^ 0x102A1;
        TracesModule.j[0xC150 ^ 0xC116] = 0xC101 ^ 0xC116;
        TracesModule.j[0xBB50 ^ 0xBBA3] = 0xFFFF7BC6 ^ 0xBBA3;
        TracesModule.j[0x17DB ^ 0x16C4] = 0x988D ^ 0x16C4;
        TracesModule.j[0xD520 ^ 0xD576] = 0x2E87 ^ 0xD576;
        TracesModule.j[0x43DA ^ 0x42BA] = 0x35B3 ^ 0x42BA;
        TracesModule.j[0x86AE ^ 0x87EB] = 0x1ACA ^ 0x87EB;
        TracesModule.j[0x96CE ^ 0x96FE] = 0xFFFF692A ^ 0x96FE;
        TracesModule.j[0xA96E ^ 0xA9B0] = 0x371 ^ 0xA9B0;
        TracesModule.j[0x5ACF ^ 0x5AB1] = 0x5AD3 ^ 0x5AB1;
        TracesModule.j[0x84 ^ 4] = 0x12 ^ 4;
        TracesModule.j[0x1412 ^ 0x152E] = 0x898D ^ 0x152E;
        TracesModule.j[0x9FE5 ^ 0x9EA8] = 0x12E4 ^ 0x9EA8;
        TracesModule.j[0x96DD ^ 0x96C7] = 0x9698 ^ 0x96C7;
        TracesModule.j[0xA09D ^ 0xA1B5] = 0xE959 ^ 0xA1B5;
        TracesModule.j[0x2199 ^ 0x20C1] = 0x64D ^ 0x20C1;
        TracesModule.j[0x90CF ^ 0x9076] = 0x9077 ^ 0x9076;
        TracesModule.j[0x3C4E ^ 0x3C1A] = 0x3C1A ^ 0x3C1A;
        TracesModule.j[0x1E15 ^ 0x1EC0] = 0x2820 ^ 0x1EC0;
        TracesModule.j[0x7C6A ^ 0x7DE8] = 0x818C ^ 0x7DE8;
        TracesModule.j[0x10D43 ^ 0x10C61] = 0x11FB3 ^ 0x10C61;
        TracesModule.j[0xFB48 ^ 0xFA20] = 0xE735 ^ 0xFA20;
        TracesModule.j[0xB59E ^ 0xB574] = 0x2CB2 ^ 0xB574;
        TracesModule.j[0x10640 ^ 0x10770] = 0x172FE ^ 0x10770;
        TracesModule.j[0xFF ^ 0x1C5] = 0x30F3 ^ 0x1C5;
        TracesModule.j[0xE7E5 ^ 0xE7D7] = 0xE7DD ^ 0xE7D7;
        TracesModule.j[0xBA0E ^ 0xBB2F] = 0xA891 ^ 0xBB2F;
        TracesModule.j[0x2D80 ^ 0x2C96] = 0xFFFFF45C ^ 0x2C96;
        TracesModule.j[0x92CD ^ 0x9223] = 0x4D5 ^ 0x9223;
        TracesModule.j[0x8BD0 ^ 0x8B21] = 0xB4DD ^ 0x8B21;
        TracesModule.j[0x6AC7 ^ 0x6BC8] = 0x244E ^ 0x6BC8;
        TracesModule.j[0xD654 ^ 0xD65D] = 0xD658 ^ 0xD65D;
        TracesModule.j[0x6051 ^ 0x6112] = 0x99FB ^ 0x6112;
        TracesModule.j[0x498A ^ 0x48A5] = 0xB7DE ^ 0x48A5;
        TracesModule.j[0xC288 ^ 0xC277] = 0x2934 ^ 0xC277;
        TracesModule.j[0xCF00 ^ 0xCFCF] = 0x1CE16 ^ 0xCFCF;
        TracesModule.j[0x5DC5 ^ 0x5D1A] = 0xF787 ^ 0x5D1A;
        TracesModule.j[0xD4E3 ^ 0xD451] = 0xD449 ^ 0xD451;
        TracesModule.j[0x20FE ^ 0x204F] = 0x205F ^ 0x204F;
        TracesModule.j[0x21DD ^ 0x21CA] = 0xFFFFDE09 ^ 0x21CA;
        TracesModule.j[0xF75 ^ 0xE78] = 0x41FE ^ 0xE78;
        TracesModule.j[0xD157 ^ 0xD1BF] = 0xF462 ^ 0xD1BF;
        TracesModule.j[0xD494 ^ 0xD46D] = 0x7F53 ^ 0xD46D;
        TracesModule.j[0x586B ^ 0x5923] = 0x1BC3 ^ 0x5923;
        TracesModule.j[0x3DD7 ^ 0x3D56] = 0x3D4E ^ 0x3D56;
        TracesModule.j[0xF9E6 ^ 0xF9CB] = 0xF9F8 ^ 0xF9CB;
        TracesModule.j[0x1EE6 ^ 0x1FBC] = 0xFFFFC6B1 ^ 0x1FBC;
        TracesModule.j[0x7307 ^ 0x725A] = 0xB6F7 ^ 0x725A;
        TracesModule.j[0x9F11 ^ 0x9FE3] = 0xA01B ^ 0x9FE3;
        TracesModule.j[0xEA4D ^ 0xEB23] = 0x24D3 ^ 0xEB23;
        TracesModule.j[0x39BE ^ 0x39C7] = 0xFFFFC63E ^ 0x39C7;
        TracesModule.j[0xD190 ^ 0xD0AB] = 0xE1B5 ^ 0xD0AB;
        TracesModule.j[0x416C ^ 0x411B] = 0x4141 ^ 0x411B;
        TracesModule.j[0x272A ^ 0x27E6] = 0xC220 ^ 0x27E6;
        TracesModule.j[0x9148 ^ 0x915E] = 0xFFFF6EC7 ^ 0x915E;
        TracesModule.j[0x862D ^ 0x867D] = 0x867C ^ 0x867D;
        TracesModule.j[0x8565 ^ 0x85AC] = 0x6060 ^ 0x85AC;
        TracesModule.j[0xA7D7 ^ 0xA74B] = 0xFFFF5896 ^ 0xA74B;
        TracesModule.j[0x5B46 ^ 0x5B36] = 0xFFFFA4B3 ^ 0x5B36;
        TracesModule.j[0x3AC8 ^ 0x3BFC] = 0x4069 ^ 0x3BFC;
        TracesModule.j[0xE85D ^ 0xE8A8] = 0x38BF ^ 0xE8A8;
        TracesModule.j[0x1AEF ^ 0x1A24] = 0xFFCC ^ 0x1A24;
        TracesModule.j[0x7978 ^ 0x79ED] = 0x79B9 ^ 0x79ED;
        TracesModule.j[0x25A4 ^ 0x24FB] = 0xE056 ^ 0x24FB;
        TracesModule.j[0x5BF4 ^ 0x5BBF] = 0x5B9E ^ 0x5BBF;
        TracesModule.j[0x8E8A ^ 0x8E04] = 0x8E19 ^ 0x8E04;
        TracesModule.j[0xF9A ^ 0xFB8] = 0xFFFFF046 ^ 0xFB8;
        TracesModule.j[0xADF8 ^ 0xAD82] = 0xFFFF5242 ^ 0xAD82;
        TracesModule.j[0x106B3 ^ 0x10667] = 0x1350A ^ 0x10667;
        TracesModule.j[0x7674 ^ 0x7629] = 0x67D4 ^ 0x7629;
        TracesModule.j[0x6320 ^ 0x620B] = 0x2AFE ^ 0x620B;
        TracesModule.j[0x27D5 ^ 0x2739] = 0xBEFF ^ 0x2739;
        TracesModule.j[0x4840 ^ 0x48A1] = 0x74A ^ 0x48A1;
        TracesModule.j[0xB495 ^ 0xB4CF] = 0xAE08 ^ 0xB4CF;
        TracesModule.j[0xC66D ^ 0xC6BB] = 0xF053 ^ 0xC6BB;
        TracesModule.j[0xE586 ^ 0xE49E] = 0xE6B6 ^ 0xE49E;
        TracesModule.j[0x5996 ^ 0x59F1] = 0xFFFFA653 ^ 0x59F1;
        TracesModule.j[0x4640 ^ 0x46D3] = 0xFFFFB961 ^ 0x46D3;
        TracesModule.j[0x9436 ^ 0x9522] = 0xB22C ^ 0x9522;
        TracesModule.j[0xEB07 ^ 0xEB4B] = 0xEB2D ^ 0xEB4B;
        TracesModule.j[0xB666 ^ 0xB60E] = 0xB644 ^ 0xB60E;
        TracesModule.j[0x10687 ^ 0x107B1] = 0x17C2B ^ 0x107B1;
        TracesModule.j[0x1E7C ^ 0x1E6D] = 0xFFFFE1B0 ^ 0x1E6D;
        TracesModule.j[0x4872 ^ 0x4838] = 0xFFFFB7D0 ^ 0x4838;
        TracesModule.j[0x94B7 ^ 0x94CB] = 0x94F0 ^ 0x94CB;
        TracesModule.j[0x15F8 ^ 0x15B8] = 0xFFFFEA0F ^ 0x15B8;
        TracesModule.j[0x1A08 ^ 0x1A7E] = 0xFFFFE5B7 ^ 0x1A7E;
        TracesModule.j[0xD85A ^ 0xD95E] = 0xF9DB ^ 0xD95E;
        TracesModule.j[0xEB71 ^ 0xEBDC] = 0xFFFF1482 ^ 0xEBDC;
        TracesModule.j[0x16E ^ 0x11D] = 0x157 ^ 0x11D;
        TracesModule.j[0xD8B0 ^ 0xD9B7] = 0xF928 ^ 0xD9B7;
        TracesModule.j[0x3103 ^ 0x3136] = 0xFFFFCEDA ^ 0x3136;
        TracesModule.j[0xB8A5 ^ 0xB876] = 0x8B7D ^ 0xB876;
        TracesModule.j[0x3C69 ^ 0x3D44] = 0xC23F ^ 0x3D44;
        TracesModule.j[0xC989 ^ 0xC954] = 0x639A ^ 0xC954;
        TracesModule.j[0xD04A ^ 0xD04F] = 0xFFFF2FB8 ^ 0xD04F;
        TracesModule.j[0x1104 ^ 0x1048] = 0x9C00 ^ 0x1048;
        TracesModule.j[0xB4BC ^ 0xB466] = 0x64FA ^ 0xB466;
        TracesModule.j[0x7509 ^ 0x7438] = 0x1AB ^ 0x7438;
        TracesModule.j[0x6C5A ^ 0x6D41] = 0x6F78 ^ 0x6D41;
        TracesModule.j[0x1A41 ^ 0x1A3E] = 0x1A23 ^ 0x1A3E;
        TracesModule.j[0x10579 ^ 0x10468] = 0x17BC1 ^ 0x10468;
        TracesModule.j[0x10F38 ^ 0x10F17] = 0xFFFEF0D1 ^ 0x10F17;
        TracesModule.j[0x4007 ^ 0x40E4] = 0xF27 ^ 0x40E4;
        TracesModule.j[0x423C ^ 0x4356] = 0xFFFFA183 ^ 0x4356;
    }
}

