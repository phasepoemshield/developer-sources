/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.Category;
import kotakbaz.rain.client.util.color.ColorUtil;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.ClientColorSetting;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.BufferAllocator;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J/\u0010$\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b$\u0010%JU\u0010/\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010)\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020*2\u0006\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u00101\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b4\u00103J%\u00106\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u00105\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b9\u0010\u0003R\u0014\u0010:\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b<\u0010;R\u0014\u0010=\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b=\u0010;R\u0014\u0010?\u001a\u00020>8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020*8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bC\u0010;R\u0014\u0010D\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bD\u0010;R\u0014\u0010E\u001a\u00020*8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bE\u0010BR\u0014\u0010F\u001a\u00020>8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bF\u0010@R\u0014\u0010G\u001a\u00020>8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bG\u0010@R\u0014\u0010H\u001a\u00020>8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010@R\u0014\u0010I\u001a\u00020>8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bI\u0010@R\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bS\u0010RR\u0014\u0010T\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bT\u0010RR&\u0010X\u001a\u0014\u0012\u0004\u0012\u00020V\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180W0U8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b[\u0010\\R\u0018\u0010^\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010_\u00a8\u0006`"}, d2={"Lkotakbaz/rain/module/modules/render/PredictsModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "renderTrailMode", "renderPredictMode", "updateTrails", "Lnet/minecraft/class_1297;", "entity", "", "shouldTrackTrailEntity", "(Lnet/minecraft/class_1297;)Z", "Lnet/minecraft/class_638;", "world", "", "Lnet/minecraft/class_243;", "predictEntityPath", "(Lnet/minecraft/class_638;Lnet/minecraft/class_1297;)Ljava/util/List;", "Lnet/minecraft/class_1676;", "projectile", "", "steps", "simulateLinearPath", "(Lnet/minecraft/class_638;Lnet/minecraft/class_1676;I)Ljava/util/List;", "start", "end", "Lnet/minecraft/class_239;", "raycastBlock", "(Lnet/minecraft/class_638;Lnet/minecraft/class_1676;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lnet/minecraft/class_239;", "Lnet/minecraft/class_4597$class_4598;", "consumers", "points", "cameraPos", "", "width", "alphaMultiplier", "brightenToWhite", "reverseFade", "renderPathPass", "(Lkotakbaz/rain/event/events/Render3DEvent;Lnet/minecraft/class_4597$class_4598;Ljava/util/List;Lnet/minecraft/class_243;FFFZ)V", "pos", "isWater", "(Lnet/minecraft/class_638;Lnet/minecraft/class_243;)Z", "isOutOfBounds", "index", "calculateNormal", "(Ljava/util/List;I)Lnet/minecraft/class_243;", "clearTrailState", "clearState", "MODE_TRAIL", "I", "MODE_PREDICT", "BUFFER_SIZE", "", "MIN_DISTANCE_SQ", "D", "TRAIL_LINE_WIDTH", "F", "TRAIL_POINT_LIMIT", "PREDICT_STEPS", "PREDICT_LINE_WIDTH", "HEIGHT_PADDING", "PREDICT_GRAVITY", "PREDICT_AIR_DRAG", "PREDICT_WATER_DRAG", "Lkotakbaz/rain/module/setting/ModeSetting;", "modeSetting", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/ClientColorSetting;", "trailColor", "Lkotakbaz/rain/module/setting/ClientColorSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "enderPearl", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "trident", "crossbow", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Ljava/util/ArrayDeque;", "trails", "Ljava/util/HashMap;", "Lnet/minecraft/class_310;", "getClient", "()Lnet/minecraft/class_310;", "client", "trackedWorld", "Lnet/minecraft/class_638;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nPredictsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PredictsModule.kt\nkotakbaz/rain/module/modules/render/PredictsModule\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n221#2,2:371\n383#3,7:373\n1924#4,3:380\n1#5:383\n*S KotlinDebug\n*F\n+ 1 PredictsModule.kt\nkotakbaz/rain/module/modules/render/PredictsModule\n*L\n98#1:371,2\n195#1:373,7\n329#1:380,3\n*E\n"})
public final class PredictsModule
extends Module {
    @NotNull
    public static final PredictsModule INSTANCE;
    private static final int a = 0;
    private static final int A = 1;
    private static final int b = 262144;
    private static final double B = 1.0E-4;
    private static final float c = 2.4f;
    private static final int C = 80;
    private static final int d = 120;
    private static final float D = 2.2f;
    private static final double e = 12.0;
    private static final double E = 0.03;
    private static final double f = 0.99;
    private static final double F = 0.8;
    @NotNull
    private static final ModeSetting g;
    @NotNull
    private static final ClientColorSetting G;
    @NotNull
    private static final BooleanSetting h;
    @NotNull
    private static final BooleanSetting H;
    @NotNull
    private static final BooleanSetting i;
    @NotNull
    private static final HashMap<UUID, ArrayDeque<Vec3d>> I;
    @Nullable
    private static ClientWorld j;
    private static Object[] J;
    private static Object K;
    private static Object[] l;
    private static Object[] k;
    private static Object[] L;
    public static int[] m;

    private PredictsModule() {
        int n2 = m[0];
        n2 ^= m[1];
        n2 -= m[2];
        int n3 = m[3];
        n3 -= m[4];
        n3 -= m[5];
        int n4 = m[6];
        n4 -= m[7];
        n4 ^= m[8];
        int n5 = m[9];
        n5 -= m[10];
        n5 -= m[11];
        int n6 = m[12];
        n6 += m[13];
        n6 -= m[14];
        int n7 = m[15];
        n7 ^= m[16];
        int n8 = m[18];
        n8 ^= m[19];
        int n9 = m[21];
        n9 ^= m[22];
        super((String)J[n2], new Category((String)J[n3], (String)J[n4], (String)J[n5] + (String)J[n6], null, null, n7 ^= m[17], null), (String)J[n8 += m[20]] + (String)J[n9 ^= m[23]]);
    }

    private final MinecraftClient getClient() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        int n2 = m[24];
        n2 += m[25];
        int n3 = m[27];
        n3 -= m[28];
        Intrinsics.checkNotNullExpressionValue(minecraftClient, (String)J[n2 ^= m[26]] + (String)J[n3 += m[29]]);
        return minecraftClient;
    }

    @Override
    public void onDisable() {
        this.clearState();
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        int n2 = m[30];
        n2 += m[31];
        Intrinsics.checkNotNullParameter(event, (String)J[n2 ^= m[32]]);
        if (!this.isEnabled()) {
            return;
        }
        if (g.getSelectedIndex() == 0) {
            this.updateTrails();
        } else {
            this.clearTrailState();
        }
    }

    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        int n2 = m[33];
        n2 -= m[34];
        Intrinsics.checkNotNullParameter(event, (String)J[n2 += m[35]]);
        if (!this.isEnabled()) {
            return;
        }
        switch (g.getSelectedIndex()) {
            case 0: {
                this.renderTrailMode(event);
                break;
            }
            case 1: {
                this.renderPredictMode(event);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void renderTrailMode(Render3DEvent event) {
        long l2 = 4431260818974150409L;
        if (I.isEmpty()) {
            return;
        }
        Vec3d vec3d = this.getClient().gameRenderer.getCamera().getPos();
        int n2 = m[36];
        n2 += m[37];
        try (BufferAllocator bufferAllocator = new BufferAllocator(n2 ^= m[38]);){
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)bufferAllocator);
            Map map = I;
            long l3 = l2;
            int n3 = m[39];
            n3 ^= m[40];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 += m[41]);
            Iterator iterator2 = map.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry entry;
                Map.Entry entry2 = entry = iterator2.next();
                long l4 = l2;
                int n4 = m[42];
                n4 ^= m[43];
                l2 = l4 ^ (0L ^ l4) & -1L >>> (n4 ^= m[44]);
                ArrayDeque arrayDeque = (ArrayDeque)entry2.getValue();
                int n5 = m[45];
                n5 -= m[46];
                if (arrayDeque.size() < (n5 ^= m[47])) continue;
                Intrinsics.checkNotNull(immediate);
                List list = CollectionsKt.toList(arrayDeque);
                Intrinsics.checkNotNull(vec3d);
                boolean bl = m[48];
                bl -= m[49];
                INSTANCE.renderPathPass(event, immediate, list, vec3d, 4.56f, 0.2f, 0.15f, bl ^= m[50]);
                boolean bl2 = m[51];
                bl2 -= m[52];
                INSTANCE.renderPathPass(event, immediate, CollectionsKt.toList(arrayDeque), vec3d, 2.4f, 0.95f, 0.35f, bl2 ^= m[53]);
            }
            immediate.draw();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void renderPredictMode(Render3DEvent event) {
        long l2 = -3776619277492110576L;
        long l3 = 2653881652754285606L;
        ClientWorld clientWorld = this.getClient().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        Vec3d vec3d = this.getClient().gameRenderer.getCamera().getPos();
        int n2 = m[54];
        n2 += m[55];
        try (BufferAllocator bufferAllocator = new BufferAllocator(n2 += m[56]);){
            VertexConsumerProvider.Immediate immediate = VertexConsumerProvider.immediate((BufferAllocator)bufferAllocator);
            long l4 = l3;
            int n3 = m[57];
            n3 ^= m[58];
            l3 = l4 ^ (0L ^ l4) & -1L << (n3 ^= m[59]);
            for (Entity entity : clientWorld2.getEntities()) {
                Intrinsics.checkNotNull(entity);
                if (!this.shouldTrackTrailEntity(entity)) continue;
                List<Vec3d> list = this.predictEntityPath(clientWorld2, entity);
                int n4 = m[60];
                n4 -= m[61];
                if (list.size() < (n4 += m[62])) continue;
                long l5 = l3;
                int n5 = m[63];
                n5 += m[64];
                l3 = l5 ^ (0x100000000L ^ l5) & -1L << (n5 += m[65]);
                Intrinsics.checkNotNull(immediate);
                Intrinsics.checkNotNull(vec3d);
                boolean bl = m[66];
                bl -= m[67];
                this.renderPathPass(event, immediate, list, vec3d, 3.63f, 0.16f, 0.12f, bl -= m[68]);
                boolean bl2 = m[69];
                bl2 -= m[70];
                this.renderPathPass(event, immediate, list, vec3d, 2.2f, 0.92f, 0.28f, bl2 += m[71]);
            }
            int n6 = m[72];
            n6 -= m[73];
            if ((int)(l3 >>> (n6 += m[74])) != 0) {
                immediate.draw();
            }
        }
    }

    private final void updateTrails() {
        long l2 = -2753621313836802914L;
        long l3 = 5365798759136145886L;
        ClientWorld clientWorld = this.getClient().world;
        if (clientWorld == null) {
            PredictsModule predictsModule = this;
            long l4 = l2;
            int n2 = m[75];
            n2 += m[76];
            l2 = l4 ^ (0L ^ l4) & -1L << (n2 -= m[77]);
            predictsModule.clearState();
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        if (j != clientWorld2) {
            this.clearTrailState();
            j = clientWorld2;
        }
        HashSet<UUID> hashSet = new HashSet<UUID>();
        block0: for (Entity entity : clientWorld2.getEntities()) {
            ArrayDeque arrayDeque;
            block10: {
                Map map;
                block9: {
                    Object object;
                    Intrinsics.checkNotNull(entity);
                    if (!this.shouldTrackTrailEntity(entity)) continue;
                    UUID uUID = entity.getUuid();
                    map = I;
                    UUID uUID2 = uUID;
                    long l5 = l2;
                    int n3 = m[78];
                    n3 ^= m[79];
                    l2 = l5 ^ (0L ^ l5) & -1L >>> (n3 -= m[80]);
                    Object v = map.get(uUID2);
                    if (v == null) {
                        long l6 = l3;
                        int n4 = m[81];
                        n4 += m[82];
                        l3 = l6 ^ (0L ^ l6) & -1L << (n4 -= m[83]);
                        ArrayDeque arrayDeque2 = new ArrayDeque();
                        map.put(uUID2, arrayDeque2);
                        object = arrayDeque2;
                    } else {
                        object = v;
                    }
                    arrayDeque = (ArrayDeque)object;
                    map = entity.getPos();
                    hashSet.add(uUID);
                    if (arrayDeque.isEmpty()) break block9;
                    Object e2 = arrayDeque.peekLast();
                    Intrinsics.checkNotNull(e2);
                    if (!(((Vec3d)e2).squaredDistanceTo((Vec3d)map) > Double.longBitsToDouble(0xFAEFE7C10CEB8CB8L ^ 0xC5F5D123E7F7CF95L))) break block10;
                }
                arrayDeque.addLast(map);
            }
            while (true) {
                int n5 = m[84];
                n5 ^= m[85];
                if (arrayDeque.size() <= (n5 -= m[86])) continue block0;
                arrayDeque.removeFirst();
            }
        }
        I.entrySet().removeIf(arg_0 -> PredictsModule.updateTrails$lambda$3(arg_0 -> PredictsModule.updateTrails$lambda$2(hashSet, arg_0), arg_0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean shouldTrackTrailEntity(Entity entity) {
        int n2;
        if (entity.isRemoved() || !entity.isAlive()) {
            boolean bl = m[87];
            bl -= m[88];
            return bl += m[89];
        }
        Entity entity2 = entity;
        if (entity2 instanceof EnderPearlEntity) {
            n2 = ((Boolean)h.getValue()).booleanValue();
            return n2 != 0;
        }
        if (entity2 instanceof TridentEntity) {
            n2 = ((Boolean)H.getValue()).booleanValue();
            return n2 != 0;
        }
        if (entity2 instanceof PersistentProjectileEntity) {
            if (((Boolean)i.getValue()).booleanValue()) {
                int n3;
                ItemStack itemStack = ((PersistentProjectileEntity)entity).getWeaponStack();
                if (itemStack != null) {
                    int n4 = m[90];
                    n4 -= m[91];
                    if (itemStack.isOf(Items.CROSSBOW) == (n4 -= m[92])) {
                        int n5 = m[93];
                        n5 -= m[94];
                        n3 = n5 ^= m[95];
                    } else {
                        int n6 = m[96];
                        n6 ^= m[97];
                        n3 = n6 ^= m[98];
                    }
                } else {
                    int n7 = m[99];
                    n7 -= m[100];
                    n3 = n7 += m[101];
                }
                if (n3 != 0) {
                    int n8 = m[102];
                    n8 -= m[103];
                    n2 = n8 += m[104];
                    return n2 != 0;
                }
            }
            int n9 = m[105];
            n9 += m[106];
            n2 = n9 ^= m[107];
            return n2 != 0;
        }
        if (!(entity2 instanceof FireworkRocketEntity)) {
            int n10 = m[114];
            n10 += m[115];
            n2 = n10 += m[116];
            return n2 != 0;
        }
        if (((Boolean)i.getValue()).booleanValue() && ((FireworkRocketEntity)entity).wasShotAtAngle()) {
            int n11 = m[108];
            n11 += m[109];
            n2 = n11 ^= m[110];
            return n2 != 0;
        }
        int n12 = m[111];
        n12 -= m[112];
        n2 = n12 += m[113];
        return n2 != 0;
    }

    private final List<Vec3d> predictEntityPath(ClientWorld world, Entity entity) {
        long l2 = -7278007934982457309L;
        long l3 = -1956244841691183892L;
        long l4 = -1131634718747904400L;
        long l5 = -2088166221936222710L;
        ProjectileEntity projectileEntity = entity instanceof ProjectileEntity ? (ProjectileEntity)entity : null;
        if (projectileEntity == null) {
            return CollectionsKt.emptyList();
        }
        ProjectileEntity projectileEntity2 = projectileEntity;
        if (entity instanceof FireworkRocketEntity) {
            int n2 = m[117];
            n2 -= m[118];
            return this.simulateLinearPath(world, projectileEntity2, n2 -= m[119]);
        }
        int n3 = m[120];
        n3 += m[121];
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>(n3 += m[122]);
        Vec3d vec3d = null;
        vec3d = projectileEntity2.getPos();
        Vec3d vec3d2 = null;
        vec3d2 = projectileEntity2.getVelocity();
        arrayList.add(vec3d);
        long l6 = l3;
        int n4 = m[123];
        n4 -= m[124];
        l3 = l6 ^ (0x78L ^ l6) & -1L >>> (n4 ^= m[125]);
        long l7 = l5;
        int n5 = m[126];
        n5 ^= m[127];
        l5 = l7 ^ (0L ^ l7) & -1L >>> (n5 += m[128]);
        while ((int)l5 < (int)l3) {
            Vec3d vec3d3;
            block8: {
                block7: {
                    long l8 = l4;
                    int n6 = m[129];
                    n6 += m[130];
                    l4 = l8 ^ ((long)((int)l5) ^ l8) & -1L >>> (n6 -= m[131]);
                    long l9 = l5;
                    int n7 = m[132];
                    n7 += m[133];
                    l5 = l9 ^ (0L ^ l9) & -1L << (n7 ^= m[134]);
                    Vec3d vec3d4 = vec3d;
                    Vec3d vec3d5 = vec3d4.add(vec3d2);
                    Intrinsics.checkNotNull(vec3d4);
                    Intrinsics.checkNotNull(vec3d5);
                    HitResult hitResult = INSTANCE.raycastBlock(world, projectileEntity2, vec3d4, vec3d5);
                    vec3d3 = hitResult.getType() == HitResult.Type.MISS ? vec3d5 : hitResult.getPos();
                    arrayList.add(vec3d3);
                    if (hitResult.getType() != HitResult.Type.MISS) break block7;
                    Intrinsics.checkNotNull(vec3d3);
                    if (!INSTANCE.isOutOfBounds(world, vec3d3)) break block8;
                }
                return arrayList;
            }
            double d2 = INSTANCE.isWater(world, vec3d3) ? Double.longBitsToDouble(0x2CB99D52A3A55484L ^ 0x135004CB3A3CCD1EL) : Double.longBitsToDouble(0x5BC92DC1411D399EL ^ 0x642683D53BFC7E30L);
            vec3d2 = vec3d2.multiply(d2);
            if (!projectileEntity2.hasNoGravity()) {
                vec3d2 = vec3d2.add(0.0, Double.longBitsToDouble(0xEC4C35E727FEBA49L ^ 0x53D28DB6CC7BA4F1L), 0.0);
            }
            vec3d = vec3d3;
            long l10 = l5;
            int n8 = m[135];
            n8 += m[136];
            int n9 = m[138];
            n9 -= m[139];
            l5 = l10 ^ (l10 ^ l10 + (long)(n8 -= m[137])) & -1L >>> (n9 -= m[140]);
        }
        return arrayList;
    }

    private final List<Vec3d> simulateLinearPath(ClientWorld world, ProjectileEntity projectile, int steps) {
        long l2 = 910282643030281349L;
        long l3 = -3568248612111988058L;
        long l4 = -442385384102099606L;
        int n2 = m[141];
        n2 += m[142];
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>(steps + (n2 -= m[143]));
        Vec3d vec3d = null;
        vec3d = projectile.getPos();
        Vec3d vec3d2 = projectile.getVelocity();
        arrayList.add(vec3d);
        long l5 = l4;
        int n3 = m[144];
        n3 += m[145];
        l4 = l5 ^ (0L ^ l5) & -1L << (n3 += m[146]);
        while (true) {
            Vec3d vec3d3;
            block4: {
                block3: {
                    int n4 = m[147];
                    n4 += m[148];
                    if ((int)(l4 >>> (n4 ^= m[149])) >= steps) break;
                    int n5 = m[150];
                    n5 ^= m[151];
                    long l6 = l2;
                    int n6 = m[153];
                    n6 += m[154];
                    l2 = l6 ^ ((long)((int)(l4 >>> (n5 -= m[152]))) ^ l6) & -1L >>> (n6 += m[155]);
                    long l7 = l3;
                    int n7 = m[156];
                    n7 ^= m[157];
                    l3 = l7 ^ (0L ^ l7) & -1L << (n7 -= m[158]);
                    Vec3d vec3d4 = vec3d;
                    Vec3d vec3d5 = vec3d4.add(vec3d2);
                    Intrinsics.checkNotNull(vec3d4);
                    Intrinsics.checkNotNull(vec3d5);
                    HitResult hitResult = INSTANCE.raycastBlock(world, projectile, vec3d4, vec3d5);
                    vec3d3 = hitResult.getType() == HitResult.Type.MISS ? vec3d5 : hitResult.getPos();
                    arrayList.add(vec3d3);
                    if (hitResult.getType() != HitResult.Type.MISS) break block3;
                    Intrinsics.checkNotNull(vec3d3);
                    if (!INSTANCE.isOutOfBounds(world, vec3d3)) break block4;
                }
                return arrayList;
            }
            vec3d = vec3d3;
            l4 += 0x100000000L;
        }
        return arrayList;
    }

    private final HitResult raycastBlock(ClientWorld world, ProjectileEntity projectile, Vec3d start, Vec3d end) {
        BlockHitResult blockHitResult = world.raycast(new RaycastContext(start, end, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)projectile));
        int n2 = m[159];
        n2 ^= m[160];
        Intrinsics.checkNotNullExpressionValue(blockHitResult, (String)J[n2 -= m[161]]);
        return (HitResult)blockHitResult;
    }

    private final void renderPathPass(Render3DEvent event, VertexConsumerProvider.Immediate consumers, List<? extends Vec3d> points, Vec3d cameraPos, float width2, float alphaMultiplier, float brightenToWhite, boolean reverseFade) {
        long l2 = -7657987675156097835L;
        long l3 = 5501711154258105664L;
        long l4 = -2978489597008486777L;
        long l5 = -6515107596847560302L;
        long l6 = -8632776463316796420L;
        long l7 = 949330565455735536L;
        long l8 = 6627427982799077750L;
        long l9 = 4221007701629608894L;
        int n2 = m[162];
        n2 -= m[163];
        if (points.size() < (n2 += m[164])) {
            return;
        }
        RenderLayer renderLayer = RenderLayer.getDebugLineStrip((double)width2);
        VertexConsumer vertexConsumer = consumers.getBuffer(renderLayer);
        Color color = G.getValue();
        int n3 = m[165];
        n3 -= m[166];
        long l10 = l8;
        int n4 = m[168];
        n4 ^= m[169];
        l8 = l10 ^ ((long)CollectionsKt.getLastIndex(points) << (n3 -= m[167]) ^ l10) & -1L << (n4 ^= m[170]);
        event.getMatrices().push();
        event.getMatrices().translate(-cameraPos.x, -cameraPos.y, -cameraPos.z);
        MatrixStack.Entry entry = event.getMatrices().peek();
        Iterable iterable = points;
        long l11 = l8;
        int n5 = m[171];
        n5 ^= m[172];
        l8 = l11 ^ (0L ^ l11) & -1L >>> (n5 -= m[173]);
        long l12 = l9;
        int n6 = m[174];
        n6 -= m[175];
        l9 = l12 ^ (0L ^ l12) & -1L << (n6 ^= m[176]);
        for (Object t2 : iterable) {
            int n7 = m[177];
            n7 -= m[178];
            int n8 = (int)(l9 >>> (n7 -= m[179]));
            l9 += 0x100000000L;
            int n9 = m[180];
            n9 += m[181];
            long l13 = l3;
            int n10 = m[183];
            n10 ^= m[184];
            l3 = l13 ^ ((long)n8 << (n9 -= m[182]) ^ l13) & -1L << (n10 -= m[185]);
            int n11 = m[186];
            n11 ^= m[187];
            if ((int)(l3 >>> (n11 += m[188])) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int n12 = m[189];
            n12 ^= m[190];
            Vec3d vec3d = (Vec3d)t2;
            long l14 = l6;
            int n13 = m[192];
            n13 ^= m[193];
            l6 = l14 ^ ((long)((int)(l3 >>> (n12 ^= m[191]))) ^ l14) & -1L >>> (n13 -= m[194]);
            long l15 = l4;
            int n14 = m[195];
            n14 -= m[196];
            l4 = l15 ^ (0L ^ l15) & -1L >>> (n14 += m[197]);
            int n15 = m[198];
            n15 += m[199];
            float f2 = (float)((int)l6) / (float)((int)(l8 >>> (n15 ^= m[200])));
            float f3 = reverseFade ? 1.0f - f2 : f2;
            float f4 = 0.15f + f3 * 0.85f;
            Color color2 = Color.WHITE;
            int n16 = m[201];
            n16 -= m[202];
            Intrinsics.checkNotNullExpressionValue(color2, (String)J[n16 -= m[203]]);
            Color color3 = ColorUtil.INSTANCE.interpolateColor(color, color2, brightenToWhite * f2);
            int n17 = m[204];
            n17 -= m[205];
            n17 -= m[206];
            int n18 = m[207];
            n18 += m[208];
            n18 ^= m[209];
            int n19 = m[210];
            n19 -= m[211];
            long l16 = l7;
            int n20 = m[213];
            n20 += m[214];
            l7 = l16 ^ ((long)RangesKt.coerceIn((int)((float)color.getAlpha() * f4 * alphaMultiplier), n17, n18) << (n19 += m[212]) ^ l16) & -1L << (n20 -= m[215]);
            Vec3d vec3d2 = INSTANCE.calculateNormal(points, (int)l6);
            int n21 = m[216];
            n21 -= m[217];
            vertexConsumer.vertex(entry, (float)vec3d.x, (float)vec3d.y, (float)vec3d.z).color(color3.getRed(), color3.getGreen(), color3.getBlue(), (int)(l7 >>> (n21 += m[218]))).normal(entry, (float)vec3d2.x, (float)vec3d2.y, (float)vec3d2.z);
        }
        event.getMatrices().pop();
        consumers.draw(renderLayer);
    }

    private final boolean isWater(ClientWorld world, Vec3d pos) {
        return world.getFluidState(BlockPos.ofFloored((Position)((Position)pos))).isIn(FluidTags.WATER);
    }

    private final boolean isOutOfBounds(ClientWorld world, Vec3d pos) {
        int n2;
        if (pos.y < (double)world.getBottomY() - Double.longBitsToDouble(0xA6A00BF3718134C0L ^ 0xE6880BF3718134C0L) || pos.y > (double)world.getTopYInclusive() + Double.longBitsToDouble(0x376EB70A5B272D15L ^ 0x7746B70A5B272D15L)) {
            int n3 = m[219];
            n3 ^= m[220];
            n2 = n3 -= m[221];
        } else {
            int n4 = m[222];
            n4 -= m[223];
            n2 = n4 += m[224];
        }
        return n2 != 0;
    }

    private final Vec3d calculateNormal(List<? extends Vec3d> points, int index) {
        Vec3d vec3d;
        Vec3d vec3d2;
        int n2;
        Vec3d vec3d3;
        int n3;
        long l2 = 8770370745053394992L;
        long l3 = 4494062596108091465L;
        long l4 = 7778822231355289230L;
        long l5 = 5385868498100673562L;
        long l6 = 2285431285218187157L;
        long l7 = -4168521820628807537L;
        long l8 = -7136504685657428580L;
        Vec3d vec3d4 = points;
        int n4 = m[225];
        n4 ^= m[226];
        n4 ^= m[227];
        int n5 = m[228];
        n5 -= m[229];
        n5 ^= m[230];
        int n6 = m[231];
        n6 += m[232];
        long l9 = l7;
        int n7 = m[234];
        n7 += m[235];
        l7 = l9 ^ ((long)RangesKt.coerceAtLeast(index - n4, n5) << (n6 ^= m[233]) ^ l9) & -1L << (n7 ^= m[236]);
        int n8 = m[237];
        n8 -= m[238];
        int n9 = m[240];
        n9 ^= m[241];
        if ((n8 ^= m[239]) <= (int)(l7 >>> (n9 ^= m[242]))) {
            int n10 = m[243];
            n10 += m[244];
            if ((int)(l7 >>> (n10 ^= m[245])) < vec3d4.size()) {
                int n11 = m[246];
                n11 ^= m[247];
                n3 = n11 += m[248];
            } else {
                int n12 = m[249];
                n12 ^= m[250];
                n3 = n12 ^= m[251];
            }
        } else {
            int n13 = m[252];
            n13 -= m[253];
            n3 = n13 += m[254];
        }
        if (n3 != 0) {
            int n14 = m[255];
            n14 ^= m[256];
            vec3d3 = vec3d4.get((int)(l7 >>> (n14 -= m[257])));
        } else {
            int n15 = m[258];
            n15 += m[259];
            long l10 = l8;
            int n16 = m[261];
            n16 += m[262];
            long l11 = l8 = l10 ^ ((long)((int)(l7 >>> (n15 -= m[260]))) ^ l10) & -1L >>> (n16 -= m[263]);
            int n17 = m[264];
            n17 -= m[265];
            l8 = l11 ^ (0L ^ l11) & -1L << (n17 -= m[266]);
            vec3d3 = points.get(index);
        }
        Vec3d vec3d5 = vec3d3;
        Vec3d vec3d6 = points;
        int n18 = m[267];
        n18 += m[268];
        long l12 = l8;
        int n19 = m[270];
        n19 -= m[271];
        l8 = l12 ^ ((long)RangesKt.coerceAtMost(index + (n18 -= m[269]), CollectionsKt.getLastIndex(points)) ^ l12) & -1L >>> (n19 += m[272]);
        int n20 = m[273];
        n20 += m[274];
        if ((n20 += m[275]) <= (int)l8) {
            if ((int)l8 < vec3d6.size()) {
                int n21 = m[276];
                n21 += m[277];
                n2 = n21 ^= m[278];
            } else {
                int n22 = m[279];
                n22 ^= m[280];
                n2 = n22 -= m[281];
            }
        } else {
            int n23 = m[282];
            n23 ^= m[283];
            n2 = n23 += m[284];
        }
        if (n2 != 0) {
            vec3d2 = vec3d6.get((int)l8);
        } else {
            int n24 = m[285];
            n24 -= m[286];
            long l13 = l8;
            int n25 = m[288];
            n25 -= m[289];
            l8 = l13 ^ ((long)((int)l8) << (n24 -= m[287]) ^ l13) & -1L << (n25 += m[290]);
            long l14 = l4;
            int n26 = m[291];
            n26 ^= m[292];
            l4 = l14 ^ (0L ^ l14) & -1L >>> (n26 ^= m[293]);
            vec3d2 = (Vec3d)points.get(index);
        }
        vec3d4 = vec3d2;
        vec3d6 = vec3d4.subtract(vec3d5);
        if (vec3d6.lengthSquared() <= Double.longBitsToDouble(0x38538D2001A10A13L ^ 0x6E34BD7A114E79EL)) {
            vec3d = new Vec3d(0.0, 1.0, 0.0);
        } else {
            Vec3d vec3d7 = vec3d6.normalize();
            vec3d = vec3d7;
            int n27 = m[294];
            n27 += m[295];
            Intrinsics.checkNotNullExpressionValue(vec3d7, (String)J[n27 -= m[296]]);
        }
        return vec3d;
    }

    private final void clearTrailState() {
        I.clear();
        j = null;
    }

    private final void clearState() {
        this.clearTrailState();
    }

    private static final boolean updateTrails$lambda$2(HashSet hashSet, Map.Entry entry) {
        boolean bl;
        int n2 = m[297];
        n2 -= m[298];
        Intrinsics.checkNotNullParameter(entry, (String)J[n2 += m[299]]);
        Object k2 = entry.getKey();
        int n3 = m[300];
        n3 -= m[301];
        Intrinsics.checkNotNullExpressionValue(k2, (String)J[n3 += m[302]]);
        UUID uUID = (UUID)k2;
        if (!hashSet.contains(uUID)) {
            boolean bl2 = m[303];
            bl2 += m[304];
            bl = bl2 ^= m[305];
        } else {
            boolean bl3 = m[306];
            bl3 -= m[307];
            bl = bl3 ^= m[308];
        }
        return bl;
    }

    private static final boolean updateTrails$lambda$3(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    static {
        PredictsModule.b();
        long l2 = 1921109651217119398L;
        long l3 = -3932054909363401661L;
        long l4 = 9190117810955542044L;
        long l5 = -3832712673379699292L;
        long l6 = 1311511295518974902L;
        long l7 = -1438076731154434359L;
        long l8 = 2816180948677902557L;
        long l9 = -4844145301856084131L;
        long l10 = -7222897554858876304L;
        long l11 = 3827482531606315173L;
        long l12 = -2846176454911114027L;
        long l13 = 4308149780793370544L;
        long l14 = -990875696362349743L;
        long l15 = 376560767889114829L;
        int n2 = m[309];
        n2 += m[310];
        J = new Object[n2 ^= m[311]];
        long l16 = l15;
        int n3 = m[312];
        n3 ^= m[313];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= m[314]);
        Object[] objectArray = new Object[m[315]];
        objectArray[PredictsModule.m[316]] = k;
        objectArray[PredictsModule.m[317]] = m[318];
        int n4 = m[319];
        Object object = PredictsModule.A()[m[320]];
        if (object == null) {
            char[] cArray = "\uc3ba\uc3b0\uc3c4\uc363\uc361\uc3b9\uc40b\uc3db\uc3b1\uc3bc\uc3b7\uc40d\uc3c0\uc3bc\uc3d6\uc3dd\uc399\uc3b0\uc36a\uc3ff\uc40a\uc3b0\uc398\uc3c4\uc39c\uc3b9\uc3bf\uc39d\uc364\uc3b0\uc40d\uc3a2\uc3d0\uc3ba\uc3b1\uc3ca\uc3d8\uc3b5\uc3d0\uc404\uc412\uc39d\uc3ad\uc3cb\uc366\uc412\uc3d5\uc40a\uc3cb\uc3d6\uc3b6\uc3bc\uc363\uc366\uc3bc\uc3d8\uc399\uc363\uc397\uc3bb\uc3ad\uc3b9\uc3db\uc3da\uc3ad\uc412\uc401\uc40d\uc406\uc3ca\uc412\uc39d\uc3b6\uc362\uc3db\uc39e\uc3be\uc3af\uc40b\uc3b2\uc3ba\uc3b5\uc3b4\uc397\uc362\uc3d7\uc406\uc404\uc3c6\uc3b4\uc3cb\uc365\uc3ba\uc3bc\uc3da\uc3c0\uc3da\uc412\uc3dd\uc404\uc3c4\uc39e\uc3b2\uc3d7\uc3c5\uc3d7\uc3bd\uc39c\uc39e\uc364\uc360\uc3ca\uc39c\uc364\uc3c6\uc3c3\uc3bc\uc401\uc3cf\uc398\uc3b8\uc40a\uc3c6\uc365\uc400\uc362\uc39c\uc3d4\uc3c5\uc3c0\uc3be\uc3b1\uc40b\uc3dc\uc3da\uc3b9\uc3d7\uc3c4\uc397\uc3c0\uc3c1\uc400\uc366\uc3bd\uc40a\uc3b2\uc36a\uc361\uc3d0\uc3b0\uc3da\uc365\uc3ff\uc399\uc412\uc39d\uc3b6\uc3b8\uc3c3\uc3cf\uc35f\uc3ff\uc3bb\uc3bf\uc40a\uc361\uc404\uc3d4\uc360\uc3ca\uc3dd\uc3bd\uc3ad\uc3cb\uc364\uc3bb\uc40a\uc35f\uc3b4\uc366\uc3d7\uc398\uc398\uc3d6\uc3ca\uc3c1\uc366\uc360\uc3b8\uc3b7\uc397\uc3c0\uc404\uc3b4\uc3da\uc3dd\uc402\uc3a2\uc3ba\uc397\uc402\uc3c1\uc3dd\uc3be\uc35f\uc3b2\uc401\uc3c0\uc3af\uc3af\uc364\uc3b1\uc401\uc3ad\uc3b1\uc3ca\uc398\uc3c5\uc3b9\uc3c0\uc3d0\uc3b0\uc3da\uc397\uc360\uc3b4\uc3db\uc3c3\uc39d\uc36a\uc3db\uc3cb\uc3b2\uc3b9\uc3b8\uc3db\uc362\uc40d\uc362\uc3c3\uc40b\uc3dc\uc3a2\uc3ad\uc39e\uc40b\uc40a\uc3b9\uc3b5\uc3d6\uc397\uc40d\uc3ad\uc39e\uc3db\uc3d8\uc3ad\uc406\uc3c4\uc3ca\uc3be\uc39c\uc406\uc3b2\uc36b\uc3b9\uc36a\uc3c1\uc406\uc3af\uc400\uc3b9\uc366\uc401\uc3b0\uc397\uc3d5\uc398\uc402\uc401\uc366\uc3b4\uc3dd\uc3d1\uc3d5\uc3c1\uc39c\uc3bb\uc3db\uc40a\uc3dd\uc3c0\uc3bd\uc3c1\uc3bb\uc412\uc3c1\uc3da\uc401\uc365\uc412\uc402\uc400\uc3b1\uc3db\uc3c0\uc397\uc3d7\uc3bd\uc3dc\uc3b2\uc3c4\uc40a\uc361\uc40a\uc406\uc3af\uc3be\uc39c\uc398\uc3c0\uc3c1\uc400\uc3be\uc3d0\uc3b8\uc3c5\uc366\uc40b\uc398\uc3b6\uc3c6\uc3c0\uc397\uc404\uc3ad\uc40a\uc3db\uc3dc\uc3ba\uc360\uc362\uc406\uc3c1\uc3da\uc361\uc3be\uc401\uc3b7\uc3bb\uc3d4\uc363\uc3dc\uc3c3\uc39c\uc3af\uc3b1\uc3b5\uc412\uc3db\uc361\uc3bc\uc404\uc3d5\uc3d4\uc3d4\uc398\uc364\uc3d6\uc412\uc412\uc3bf\uc412\uc36a\uc3ca\uc3ff\uc3b5\uc39d\uc3bf\uc3c5\uc3bf\uc3b7\uc40d\uc404\uc3d7\uc39c\uc3d0\uc397\uc364\uc40a\uc39e\uc404\uc3c3\uc3d5\uc39c\uc401\uc362\uc363\uc3be\uc3b6\uc3d7\uc3bd\uc3b2\uc36b\uc3c3\uc3ad\uc3dc\uc3bd\uc3dc\uc364\uc360\uc360\uc3ad\uc3d7\uc3ca\uc40b\uc404\uc3bb\uc398\uc3af\uc40b\uc3cf\uc35f\uc3b1\uc412\uc36b\uc399\uc3c3\uc3da\uc3c0\uc3be\uc364\uc3b2\uc3be\uc3bb\uc39c\uc3dd\uc40a\uc364\uc3b1\uc3a2\uc39e\uc366\uc3a2\uc3b4\uc412\uc3d7\uc36a\uc400\uc3b9\uc3d5\uc3af\uc3bf\uc3b6\uc3bf\uc35f\uc363\uc3d1\uc3c3\uc3c3\uc3c4\uc402\uc3d6\uc3a2\uc400\uc36a\uc40a\uc400\uc3b5\uc3b2\uc360\uc3ba\uc400\uc3b6\uc39d\uc398\uc362\uc36a\uc39e\uc3db\uc3bc\uc3c6\uc3dc\uc3d1\uc362\uc3bc\uc3ba\uc3ff\uc3d0\uc40d\uc36a\uc3ae".toCharArray();
            for (int i2 = m[321]; i2 < m[322]; ++i2) {
                int n5 = cArray[i2];
                n5 -= m[323];
                n5 += m[324];
                n5 ^= m[325];
                n5 ^= m[326];
                n5 += m[327];
                n5 += m[328];
                n5 ^= m[329];
                n5 += m[330];
                n5 ^= m[331];
                n5 -= m[332];
                n5 += m[333];
                n5 += m[334];
                n5 += m[335];
                n5 -= m[336];
                n5 += m[337];
                cArray[i2] = (char)(n5 += m[338]);
            }
            object = PredictsModule.A()[PredictsModule.m[339]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)PredictsModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = m[340];
        n6 ^= m[341];
        l6 = l17 ^ (0x11500000000L ^ l17) & -1L << (n6 ^= m[342]);
        long l18 = l13;
        int n7 = m[343];
        n7 += m[344];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= m[345]);
        while (true) {
            int n8 = m[346];
            n8 -= m[347];
            if ((int)l13 >= (int)(l6 >>> (n8 -= m[348]))) break;
            int n5 = (int)l13;
            long l19 = l13;
            int n10 = m[349];
            n10 -= m[350];
            int n11 = m[352];
            n11 -= m[353];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= m[351])) & -1L >>> (n11 += m[354]);
            long l20 = l9;
            int n12 = m[355];
            n12 ^= m[356];
            l9 = l20 ^ ((long)cArray[n5] ^ l20) & -1L >>> (n12 ^= m[357]);
            int n9 = (int)l13;
            long l21 = l13;
            int n14 = m[358];
            n14 += m[359];
            int n15 = m[361];
            n15 += m[362];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= m[360])) & -1L >>> (n15 += m[363]);
            int n16 = m[364];
            n16 ^= m[365];
            long l22 = l10;
            int n17 = m[367];
            n17 -= m[368];
            l10 = l22 ^ ((long)cArray[n9] << (n16 -= m[366]) ^ l22) & -1L << (n17 += m[369]);
            int n18 = m[370];
            n18 ^= m[371];
            n18 -= m[372];
            int n19 = m[373];
            n19 ^= m[374];
            long l23 = l12;
            int n20 = m[376];
            n20 += m[377];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= m[375]))) ^ l23) & -1L >>> (n20 -= m[378]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = m[379];
            n21 ^= m[380];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= m[381]);
            while (true) {
                int n22 = m[382];
                n22 -= m[383];
                if ((int)(l14 >>> (n22 ^= m[384])) >= (int)l12) break;
                int n23 = m[385];
                n23 += m[386];
                int n24 = m[388];
                n24 -= m[389];
                cArray2[(int)(l14 >>> (n23 -= PredictsModule.m[387]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= m[390]))];
                l14 += 0x100000000L;
            }
            int n25 = m[391];
            n25 -= m[392];
            int n13 = (int)(l15 >>> (n25 ^= m[393]));
            l15 += 0x100000000L;
            PredictsModule.J[n13] = new String(cArray2);
            long l25 = l13;
            int n27 = m[394];
            n27 += m[395];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= m[396]);
        }
        INSTANCE = new PredictsModule();
        int n28 = m[397];
        n28 += m[398];
        n28 -= m[399];
        int n29 = 9;
        n29 -= 86;
        String[] stringArray = new String[n29 -= -79];
        int n30 = -185;
        n30 += 107;
        int n31 = -48;
        n31 ^= 0xFFFFFFEF;
        stringArray[n30 ^= 0xFFFFFFB2] = (String)J[n31 += -42];
        int n32 = 127;
        n32 ^= 0x14;
        int n33 = 113;
        n33 -= 49;
        stringArray[n32 -= 106] = (String)J[n33 -= 58];
        int n34 = 134;
        n34 += -120;
        int n35 = 85;
        n35 += -4;
        g = Module.mode$default(INSTANCE, (String)J[n28], CollectionsKt.listOf(stringArray), n34 += -14, n35 ^= 0x55, null);
        Module module = INSTANCE;
        int n36 = 57;
        n36 ^= 0xFFFFFF8C;
        String string = (String)J[n36 -= -95];
        Color color = Color.WHITE;
        int n37 = 56;
        n37 ^= 0x52;
        Intrinsics.checkNotNullExpressionValue(color, (String)J[n37 ^= 0x63]);
        int n38 = -67;
        n38 ^= 0x25;
        G = Module.clientColor$default(module, string, color, null, n38 -= -108, null);
        int n39 = -90;
        n39 ^= 0xFFFFFFC9;
        int n14 = -70;
        n14 = n14 ^ 0x28;
        boolean bl2 = n14 - -111;
        h = INSTANCE.cfr_renamed_0((String)J[n39 -= 103], bl2);
        int n15 = -15;
        n15 ^= 0x53;
        int n17 = -42;
        n17 = n17 + -82;
        boolean bl3 = n17 ^ 0xFFFFFF85;
        H = INSTANCE.cfr_renamed_0((String)J[n15 -= -109], bl3);
        int n18 = -105;
        n18 ^= 0xFFFFFF85;
        int n20 = 20;
        n20 = n20 + 89;
        boolean bl4 = n20 - 108;
        i = INSTANCE.cfr_renamed_0((String)J[n18 ^= 0x1C], bl4);
        I = new HashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[1];
        String string = (String)object[2];
        object = object[0];
        Object[] objectArray = l;
        if (l == null) {
            objectArray = l = new Object[1];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[1];
                k = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[0x2DC8 ^ 0x2DD8];
                byArray[0x407B ^ 0x4078] = 0xFFFFBF9F ^ 0x4078;
                byArray[0x8944 ^ 0x8941] = 0xFFFF76F7 ^ 0x8941;
                byArray[0xFEB2 ^ 0xFEB9] = 0xFE95 ^ 0xFEB9;
                byArray[0xEBAD ^ 0xEBA3] = 0xEBAD ^ 0xEBA3;
                byArray[0xC05A ^ 0xC05D] = 0xFFFF3FDF ^ 0xC05D;
                byArray[0xE42E ^ 0xE424] = 0xE47D ^ 0xE424;
                byArray[0xCB1D ^ 0xCB10] = 0xFFFF34BA ^ 0xCB10;
                byArray[0x9F46 ^ 0x9F46] = 0x9F24 ^ 0x9F46;
                byArray[0xEE7A ^ 0xEE76] = 0xEE26 ^ 0xEE76;
                byArray[0x22BF ^ 0x22BB] = 0x22BA ^ 0x22BB;
                byArray[0x20C6 ^ 0x20C4] = 0xFFFFDF09 ^ 0x20C4;
                byArray[0xAABB ^ 0xAAB4] = 0xFFFF5502 ^ 0xAAB4;
                byArray[0x4318 ^ 0x4310] = 0xFFFFBC9E ^ 0x4310;
                byArray[0x3328 ^ 0x332E] = 0xFFFFCC85 ^ 0x332E;
                byArray[0x8F3B ^ 0x8F3A] = 0xFFFF709D ^ 0x8F3A;
                byArray[0x6140 ^ 0x6149] = 0x6171 ^ 0x6149;
                objectArray2[0] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (K == null) {
                byte[] byArray2 = new byte[0xEFA1 ^ 0xEF81];
                byArray2[0x9FCA ^ 0x9FDB] = 0xFFFF601B ^ 0x9FDB;
                byArray2[0x1ED0 ^ 0x1ED4] = 0x1E8A ^ 0x1ED4;
                byArray2[0x5BFC ^ 0x5BE5] = 0xFFFFA44E ^ 0x5BE5;
                byArray2[0x14A4 ^ 0x14BC] = 0x148A ^ 0x14BC;
                byArray2[0x84F8 ^ 0x84FD] = 0xFFFF7B32 ^ 0x84FD;
                byArray2[0x10B14 ^ 0x10B04] = 0x10B64 ^ 0x10B04;
                byArray2[0x16F6 ^ 0x16F8] = 0xFFFFE95F ^ 0x16F8;
                byArray2[0xF902 ^ 0xF90F] = 0xFFFF06C2 ^ 0xF90F;
                byArray2[0xEB8A ^ 0xEB90] = 0xEBAE ^ 0xEB90;
                byArray2[0x6223 ^ 0x6231] = 0xFFFF9DB6 ^ 0x6231;
                byArray2[0x1C6D ^ 0x1C64] = 0x1C60 ^ 0x1C64;
                byArray2[0x2DB1 ^ 0x2DAA] = 0xFFFFD234 ^ 0x2DAA;
                byArray2[0x4F07 ^ 0x4F08] = 0x4F67 ^ 0x4F08;
                byArray2[0x288C ^ 0x2887] = 0xFFFFD768 ^ 0x2887;
                byArray2[0xF79B ^ 0xF799] = 0xF7C5 ^ 0xF799;
                byArray2[0xFFE8 ^ 0xFFFE] = 0xFFFF004F ^ 0xFFFE;
                byArray2[0x1E0A ^ 0x1E19] = 0xFFFFE1AB ^ 0x1E19;
                byArray2[0xB67C ^ 0xB674] = 0xFFFF49D6 ^ 0xB674;
                byArray2[0x10763 ^ 0x10777] = 0x10771 ^ 0x10777;
                byArray2[0x879 ^ 0x866] = 0x80A ^ 0x866;
                byArray2[0x1FA9 ^ 0x1FB5] = 0x1FE9 ^ 0x1FB5;
                byArray2[0xB556 ^ 0xB556] = 0xB50D ^ 0xB556;
                byArray2[0x5FC8 ^ 0x5FCB] = 0x5FA7 ^ 0x5FCB;
                byArray2[0xB3E4 ^ 0xB3F9] = 0xFFFF4C02 ^ 0xB3F9;
                byArray2[0x684D ^ 0x684A] = 0x6850 ^ 0x684A;
                byArray2[0x1BA1 ^ 0x1BAD] = 0x1B89 ^ 0x1BAD;
                byArray2[0x3B35 ^ 0x3B22] = 0x3B42 ^ 0x3B22;
                byArray2[0x4A99 ^ 0x4A9F] = 0x4A88 ^ 0x4A9F;
                byArray2[0x2389 ^ 0x2383] = 0x23C5 ^ 0x2383;
                byArray2[0x80FD ^ 0x80FC] = 0x80DF ^ 0x80FC;
                byArray2[0xC823 ^ 0xC836] = 0xC816 ^ 0xC836;
                byArray2[0x6DD8 ^ 0x6DC6] = 0xFFFF926A ^ 0x6DC6;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = PredictsModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u53b5\u5383\u5338\u5389\u5387\u5393\u53b4\u53da\u53d9\u53dd\u533d\u53de\u53a2\u53a0\u53b0\u533d\u5382\u5392".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0x8E61;
                        n3 += 1281;
                        n3 -= 23842;
                        n3 ^= 0x1F47;
                        n3 -= 3529;
                        n3 -= 60138;
                        n3 += 28267;
                        n3 += 36428;
                        n3 ^= 0xCB8F;
                        n3 ^= 0x4650;
                        n3 ^= 0x3C31;
                        n3 ^= 0x8452;
                        cArray[i2] = (char)(n3 -= 43764);
                    }
                    object4 = PredictsModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[8] = -41;
                byArray4[1] = 16;
                byArray4[3] = 56;
                byArray4[0] = 62;
                byArray4[14] = 63;
                byArray4[2] = -64;
                byArray4[9] = -54;
                byArray4[12] = -81;
                byArray4[15] = -81;
                byArray4[4] = 103;
                byArray4[13] = -116;
                byArray4[6] = -108;
                byArray4[11] = -48;
                byArray4[10] = -112;
                byArray4[5] = 43;
                byArray4[7] = -8;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 26, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = PredictsModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uc084\uc088\uc09a".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 54816;
                        n4 += 21537;
                        n4 -= 11652;
                        n4 ^= 0x1A66;
                        n4 += 25479;
                        n4 ^= 0x2D52;
                        n4 -= 62290;
                        n4 -= 33908;
                        n4 += 27188;
                        n4 += 32630;
                        n4 += 43805;
                        n4 ^= 0x721E;
                        cArray[i3] = (char)(n4 += 60830);
                    }
                    object5 = PredictsModule.A()[2] = new String(cArray);
                }
                K = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = PredictsModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u5faa\u5fa6\u5c7c\u5c70\u5fac\u5fad\u5fac\u5c70\u5c7b\u5f94\u5fac\u5c7c\u5fd6\u5c7b\u5c4a\u5c47\u5c47\u5c32\u5c31\u5c48".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x2670;
                    n5 -= 58115;
                    n5 -= 13156;
                    n5 -= 32708;
                    n5 += 20693;
                    n5 ^= 0x62D6;
                    n5 += 55302;
                    n5 -= 6169;
                    n5 -= 27933;
                    n5 ^= 0xE4AD;
                    cArray[i4] = (char)(n5 ^= 0x4DCE);
                }
                object6 = PredictsModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)K), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = L;
        if (L == null) {
            L = new Object[4];
            objectArray = L;
        }
        return objectArray;
    }

    public static void b() {
        m = new int[0x88AC ^ 0x893C];
        PredictsModule.m[0x3372 ^ 0x3270] = 0xFFFFCD8A ^ 0x3270;
        PredictsModule.m[0x10DA1 ^ 0x10D89] = 0x10DAE ^ 0x10D89;
        PredictsModule.m[0x3898 ^ 0x3999] = 0x39F5 ^ 0x3999;
        PredictsModule.m[0x10E8B ^ 0x10F0E] = 0x10F7E ^ 0x10F0E;
        PredictsModule.m[0xF29D ^ 0xF2DD] = 0xF295 ^ 0xF2DD;
        PredictsModule.m[0x3B23 ^ 0x3B1B] = 0xFFFFC4D8 ^ 0x3B1B;
        PredictsModule.m[0xB277 ^ 0xB36A] = 0xB32D ^ 0xB36A;
        PredictsModule.m[0xAA3C ^ 0xAB63] = 0xFFFF54C8 ^ 0xAB63;
        PredictsModule.m[0x5686 ^ 0x5698] = 0x5620 ^ 0x5698;
        PredictsModule.m[0xA67F ^ 0xA669] = 0xA648 ^ 0xA669;
        PredictsModule.m[0x3D54 ^ 0x3C04] = 0xB37A ^ 0x3C04;
        PredictsModule.m[0x3FE8 ^ 0x3E9D] = 0x3EC3 ^ 0x3E9D;
        PredictsModule.m[0x2E93 ^ 0x2ED5] = 0xFFFFD153 ^ 0x2ED5;
        PredictsModule.m[0x10973 ^ 0x10925] = 0x10938 ^ 0x10925;
        PredictsModule.m[0xF96C ^ 0xF85C] = 0xFFFF0796 ^ 0xF85C;
        PredictsModule.m[0x1035 ^ 0x10E4] = 0xFFFFEF15 ^ 0x10E4;
        PredictsModule.m[0x4367 ^ 0x4382] = 0x43E8 ^ 0x4382;
        PredictsModule.m[0x97B3 ^ 0x9632] = 0x9633 ^ 0x9632;
        PredictsModule.m[0x7B66 ^ 0x7A09] = 0xFFFF85AB ^ 0x7A09;
        PredictsModule.m[0xB5ED ^ 0xB5D4] = 0xB5D4 ^ 0xB5D4;
        PredictsModule.m[0x88BB ^ 0x88FC] = 0xFFFF772D ^ 0x88FC;
        PredictsModule.m[0xB0D0 ^ 0xB00D] = 0xB062 ^ 0xB00D;
        PredictsModule.m[0xE8AC ^ 0xE85B] = 0xFFFF1795 ^ 0xE85B;
        PredictsModule.m[0x2EAF ^ 0x2ED3] = 0xFFFFD17C ^ 0x2ED3;
        PredictsModule.m[0xA508 ^ 0xA41D] = 0xFFFF5BD6 ^ 0xA41D;
        PredictsModule.m[0x935 ^ 0x806] = 0x867 ^ 0x806;
        PredictsModule.m[0xBDDE ^ 0xBDAF] = 0xFFFF422B ^ 0xBDAF;
        PredictsModule.m[0xA6D ^ 0xA78] = 0xA39 ^ 0xA78;
        PredictsModule.m[0x106B ^ 0x105A] = 0xFFFFEFA4 ^ 0x105A;
        PredictsModule.m[0xBFE5 ^ 0xBFB9] = 0xBFD4 ^ 0xBFB9;
        PredictsModule.m[0xE74F ^ 0xE72E] = 0xFFFF18C3 ^ 0xE72E;
        PredictsModule.m[0xB05A ^ 0xB107] = 0xFFFF4E5E ^ 0xB107;
        PredictsModule.m[0x840A ^ 0x84C2] = 0xFFFF7B61 ^ 0x84C2;
        PredictsModule.m[0x5B92 ^ 0x5BB6] = 0xFFFC5BA1 ^ 0x5BB6;
        PredictsModule.m[0xD140 ^ 0xD0C9] = 0xD0B2 ^ 0xD0C9;
        PredictsModule.m[0x5E9 ^ 0x4DE] = 0x492 ^ 0x4DE;
        PredictsModule.m[0x48C4 ^ 0x48A3] = 0x48D6 ^ 0x48A3;
        PredictsModule.m[0x2F5C ^ 0x2F6C] = 0x2F1A ^ 0x2F6C;
        PredictsModule.m[0xC749 ^ 0xC704] = 0xFFFF3887 ^ 0xC704;
        PredictsModule.m[0xA8D4 ^ 0xA86C] = 0xA81D ^ 0xA86C;
        PredictsModule.m[0x4940 ^ 0x4923] = 0xFFFFB6A4 ^ 0x4923;
        PredictsModule.m[0xC957 ^ 0xC94B] = 0xFFFF36E6 ^ 0xC94B;
        PredictsModule.m[0x82CA ^ 0x83E7] = 0x8391 ^ 0x83E7;
        PredictsModule.m[0x105EB ^ 0x105A0] = 0xFFFEFA3B ^ 0x105A0;
        PredictsModule.m[0xB609 ^ 0xB6D3] = 0xFFFF4963 ^ 0xB6D3;
        PredictsModule.m[0x1009A ^ 0x1005A] = 0xFFFEFFE1 ^ 0x1005A;
        PredictsModule.m[0xCC90 ^ 0xCC81] = 0xFFFF3314 ^ 0xCC81;
        PredictsModule.m[0x1CE2 ^ 0x1C30] = 0x1C1A ^ 0x1C30;
        PredictsModule.m[0x6357 ^ 0x6203] = 0xFFFF9D87 ^ 0x6203;
        PredictsModule.m[0x37DF ^ 0x37ED] = 0x3795 ^ 0x37ED;
        PredictsModule.m[0xD387 ^ 0xD3F3] = 0xFFFF2C2B ^ 0xD3F3;
        PredictsModule.m[0xF556 ^ 0xF56D] = 0xF524 ^ 0xF56D;
        PredictsModule.m[0x2FEA ^ 0x2FD5] = 0xFFFFD06C ^ 0x2FD5;
        PredictsModule.m[0x2638 ^ 0x2713] = 0xFFFFD8F0 ^ 0x2713;
        PredictsModule.m[0x10FF0 ^ 0x10F1B] = 0xFFFEF0B2 ^ 0x10F1B;
        PredictsModule.m[0xCC31 ^ 0xCCFA] = 0xCC97 ^ 0xCCFA;
        PredictsModule.m[0x5E99 ^ 0x5EF6] = 0x5E14 ^ 0x5EF6;
        PredictsModule.m[0x628 ^ 0x750] = 0xFFFFF8FB ^ 0x750;
        PredictsModule.m[0x8111 ^ 0x806F] = 0x8063 ^ 0x806F;
        PredictsModule.m[0x9F72 ^ 0x9FA1] = 0xFFFF604C ^ 0x9FA1;
        PredictsModule.m[0x3F38 ^ 0x3F13] = 0x3F12 ^ 0x3F13;
        PredictsModule.m[0x3DD9 ^ 0x3CA0] = 0x3C98 ^ 0x3CA0;
        PredictsModule.m[0x70C4 ^ 0x71CF] = 0xFFFF8E3E ^ 0x71CF;
        PredictsModule.m[0xF01 ^ 0xE15] = 0xFFFFF1FF ^ 0xE15;
        PredictsModule.m[0x5265 ^ 0x52CE] = 0x52AB ^ 0x52CE;
        PredictsModule.m[0xBA3D ^ 0xBA10] = 0xBA18 ^ 0xBA10;
        PredictsModule.m[0xAF8 ^ 0xBF5] = 0xBB6 ^ 0xBF5;
        PredictsModule.m[0x1BFB ^ 0x1AAD] = 0xFFFFE51E ^ 0x1AAD;
        PredictsModule.m[0x87E4 ^ 0x868F] = 0xFFFF796F ^ 0x868F;
        PredictsModule.m[0x7CA5 ^ 0x7C71] = 0xFFFF8392 ^ 0x7C71;
        PredictsModule.m[0xE45B ^ 0xE53F] = 0xFFFF1AE0 ^ 0xE53F;
        PredictsModule.m[0xAB6 ^ 0xA0A] = 0xFFFFF5AF ^ 0xA0A;
        PredictsModule.m[0x72FF ^ 0x7233] = 0xFFFF8DE8 ^ 0x7233;
        PredictsModule.m[0xAB4F ^ 0xAB8E] = 0xFFFF5408 ^ 0xAB8E;
        PredictsModule.m[0x7791 ^ 0x77BB] = 0x77D8 ^ 0x77BB;
        PredictsModule.m[0x3014 ^ 0x3022] = 0x4305B ^ 0x3022;
        PredictsModule.m[0x4AE8 ^ 0x4A1A] = 0x4A3F ^ 0x4A1A;
        PredictsModule.m[0x5CC9 ^ 0x5D8F] = 0x7A89 ^ 0x5D8F;
        PredictsModule.m[0x33FF ^ 0x328E] = 0x32C2 ^ 0x328E;
        PredictsModule.m[0x7750 ^ 0x7796] = 0xFFFF88A5 ^ 0x7796;
        PredictsModule.m[0x609E ^ 0x6005] = 0x6038 ^ 0x6005;
        PredictsModule.m[0x573B ^ 0x5720] = 0xFFFFA85D ^ 0x5720;
        PredictsModule.m[0xA973 ^ 0xA82D] = 0xFFFF5782 ^ 0xA82D;
        PredictsModule.m[0xC9A1 ^ 0xC89B] = 0xFFFF3762 ^ 0xC89B;
        PredictsModule.m[0x2F86 ^ 0x2FAF] = 0xFFFFD008 ^ 0x2FAF;
        PredictsModule.m[0x78F ^ 0x7D4] = 0x7F6 ^ 0x7D4;
        PredictsModule.m[0x6282 ^ 0x63F1] = 0xFFFF9C07 ^ 0x63F1;
        PredictsModule.m[0xDC84 ^ 0xDCE1] = 0xDCFE ^ 0xDCE1;
        PredictsModule.m[0x8F50 ^ 0x8E47] = 0x8E3C ^ 0x8E47;
        PredictsModule.m[0xBBA3 ^ 0xBB82] = 0xBBDC ^ 0xBB82;
        PredictsModule.m[0xF9F9 ^ 0xF8C2] = 0xF8C1 ^ 0xF8C2;
        PredictsModule.m[0x10865 ^ 0x1094F] = 0x10955 ^ 0x1094F;
        PredictsModule.m[0x3DC3 ^ 0x3C89] = 0x4E00 ^ 0x3C89;
        PredictsModule.m[0x92C7 ^ 0x93F3] = 0x9381 ^ 0x93F3;
        PredictsModule.m[0xEED5 ^ 0xEE82] = 0xFFFF116E ^ 0xEE82;
        PredictsModule.m[0x3666 ^ 0x3615] = 0x3614 ^ 0x3615;
        PredictsModule.m[0x60D9 ^ 0x605A] = 0x6052 ^ 0x605A;
        PredictsModule.m[0x4871 ^ 0x4830] = 0x482F ^ 0x4830;
        PredictsModule.m[0xA6A6 ^ 0xA603] = 0xA6B0 ^ 0xA603;
        PredictsModule.m[0x317B ^ 0x3179] = 0x3167 ^ 0x3179;
        PredictsModule.m[0xD289 ^ 0xD255] = 0xD27C ^ 0xD255;
        PredictsModule.m[0xACDE ^ 0xAC19] = 0xAC49 ^ 0xAC19;
        PredictsModule.m[0x36C6 ^ 0x3633] = 0xFFFFC9C6 ^ 0x3633;
        PredictsModule.m[0x9145 ^ 0x90C3] = 0xFFFF6F41 ^ 0x90C3;
        PredictsModule.m[0x8D4 ^ 0x835] = 0x872 ^ 0x835;
        PredictsModule.m[0x44D1 ^ 0x44DF] = 0xFFFFBB1E ^ 0x44DF;
        PredictsModule.m[0x728B ^ 0x73B2] = 0x73C0 ^ 0x73B2;
        PredictsModule.m[0x15B8 ^ 0x1485] = 0x1484 ^ 0x1485;
        PredictsModule.m[0xF0F2 ^ 0xF1D0] = 0xF1AC ^ 0xF1D0;
        PredictsModule.m[0xC27A ^ 0xC2FF] = 0xFFFF3D0C ^ 0xC2FF;
        PredictsModule.m[0xBF7D ^ 0xBE53] = 0xFFFF4184 ^ 0xBE53;
        PredictsModule.m[0x266A ^ 0x26EA] = 0x26D4 ^ 0x26EA;
        PredictsModule.m[0x66C6 ^ 0x6696] = 0xFFFF9944 ^ 0x6696;
        PredictsModule.m[0xD4E3 ^ 0xD483] = 0xD4AA ^ 0xD483;
        PredictsModule.m[0x58DB ^ 0x59FA] = 0x5990 ^ 0x59FA;
        PredictsModule.m[0x9DB2 ^ 0x9CCD] = 0x9CF6 ^ 0x9CCD;
        PredictsModule.m[0x5A57 ^ 0x5A58] = 0xFFFFA5E1 ^ 0x5A58;
        PredictsModule.m[0xF0EE ^ 0xF0B3] = 0xF05B ^ 0xF0B3;
        PredictsModule.m[0xCC1F ^ 0xCD1B] = 0xCD35 ^ 0xCD1B;
        PredictsModule.m[0x781 ^ 0x6A9] = 0x6C2 ^ 0x6A9;
        PredictsModule.m[0x1BE2 ^ 0x1AF8] = 0x1A9E ^ 0x1AF8;
        PredictsModule.m[0xB687 ^ 0xB6EC] = 0xB696 ^ 0xB6EC;
        PredictsModule.m[0x72D9 ^ 0x72B7] = 0xFFFF8D00 ^ 0x72B7;
        PredictsModule.m[0x9380 ^ 0x92D5] = 0x92C2 ^ 0x92D5;
        PredictsModule.m[0x5E01 ^ 0x5E7B] = 0xFFFFA1DB ^ 0x5E7B;
        PredictsModule.m[0x8379 ^ 0x8390] = 0x8398 ^ 0x8390;
        PredictsModule.m[0x10E00 ^ 0x10EB4] = 0x10EA3 ^ 0x10EB4;
        PredictsModule.m[0x54DA ^ 0x54AD] = 0xFFFFAB5E ^ 0x54AD;
        PredictsModule.m[0x3EF3 ^ 0x3E24] = 0x3E01 ^ 0x3E24;
        PredictsModule.m[0x8578 ^ 0x85D9] = 0x8597 ^ 0x85D9;
        PredictsModule.m[0xCC32 ^ 0xCC2D] = 0xFFFF3388 ^ 0xCC2D;
        PredictsModule.m[0x3513 ^ 0x35B5] = 0x35C2 ^ 0x35B5;
        PredictsModule.m[0x2F44 ^ 0x2F4C] = 0xFFFFD094 ^ 0x2F4C;
        PredictsModule.m[0x2BB ^ 0x2DF] = 0xFFFFFD79 ^ 0x2DF;
        PredictsModule.m[0x5442 ^ 0x54C8] = 0xFFFFAB52 ^ 0x54C8;
        PredictsModule.m[0xEE77 ^ 0xEED8] = 0xFFFF1165 ^ 0xEED8;
        PredictsModule.m[0x8ADD ^ 0x8BFA] = 0xFFFF7407 ^ 0x8BFA;
        PredictsModule.m[0x954 ^ 0x854] = 0x83D ^ 0x854;
        PredictsModule.m[0xF1E0 ^ 0xF0F2] = 0xF097 ^ 0xF0F2;
        PredictsModule.m[0x2369 ^ 0x22E5] = 0x22A6 ^ 0x22E5;
        PredictsModule.m[0x7847 ^ 0x787D] = 0x7814 ^ 0x787D;
        PredictsModule.m[0x845D ^ 0x8544] = 0xFFFF7A94 ^ 0x8544;
        PredictsModule.m[0xEBCE ^ 0xEB6C] = 0xFFFF14E6 ^ 0xEB6C;
        PredictsModule.m[0xE1EA ^ 0xE158] = 0xE134 ^ 0xE158;
        PredictsModule.m[0x5FF5 ^ 0x5ED3] = 0x5EA6 ^ 0x5ED3;
        PredictsModule.m[0xE657 ^ 0xE77B] = 0xE7CB ^ 0xE77B;
        PredictsModule.m[0x6B91 ^ 0x6BD3] = 0x6B7D ^ 0x6BD3;
        PredictsModule.m[0xCB7E ^ 0xCB01] = 0xFFFF34AF ^ 0xCB01;
        PredictsModule.m[0x4E99 ^ 0x4F9E] = 0xFFFFB07E ^ 0x4F9E;
        PredictsModule.m[0xCA19 ^ 0xCB62] = 0xFFFF341E ^ 0xCB62;
        PredictsModule.m[0xE80B ^ 0xE939] = 0xE9EA ^ 0xE939;
        PredictsModule.m[0x10620 ^ 0x10659] = 0xFFFEF9E6 ^ 0x10659;
        PredictsModule.m[0x856A ^ 0x85BC] = 0x858F ^ 0x85BC;
        PredictsModule.m[0xABB6 ^ 0xAACB] = 0xAAAC ^ 0xAACB;
        PredictsModule.m[0xBA52 ^ 0xBB7B] = 0xBB35 ^ 0xBB7B;
        PredictsModule.m[0x626B ^ 0x6373] = 0xFFFF9CD8 ^ 0x6373;
        PredictsModule.m[0xB520 ^ 0xB43C] = 0xB403 ^ 0xB43C;
        PredictsModule.m[0x9585 ^ 0x953A] = 0x952C ^ 0x953A;
        PredictsModule.m[0x86D9 ^ 0x86D0] = 0x86FC ^ 0x86D0;
        PredictsModule.m[0x10206 ^ 0x1020A] = 0xFFFEFD9F ^ 0x1020A;
        PredictsModule.m[0x66E ^ 0x61C] = 0x63B ^ 0x61C;
        PredictsModule.m[0xB9F9 ^ 0xB961] = 0xB96B ^ 0xB961;
        PredictsModule.m[0x7ED3 ^ 0x7FF3] = 0x7FFD ^ 0x7FF3;
        PredictsModule.m[0x1069C ^ 0x1064C] = 0xFFFEF99F ^ 0x1064C;
        PredictsModule.m[0x5DD7 ^ 0x5D4A] = 0x5D50 ^ 0x5D4A;
        PredictsModule.m[0xE5AA ^ 0xE4CD] = 0xFFFF1B73 ^ 0xE4CD;
        PredictsModule.m[0xA92E ^ 0xA908] = 0xFFFF56FC ^ 0xA908;
        PredictsModule.m[0x6E9A ^ 0x6E3D] = 0x6E21 ^ 0x6E3D;
        PredictsModule.m[0x7386 ^ 0x733F] = 0x7308 ^ 0x733F;
        PredictsModule.m[0xDF3 ^ 0xDBB] = 0xFFFFF206 ^ 0xDBB;
        PredictsModule.m[0x541A ^ 0x54A0] = 0x54B2 ^ 0x54A0;
        PredictsModule.m[0x484D ^ 0x490F] = 0x48E3 ^ 0x490F;
        PredictsModule.m[0xD02F ^ 0xD0A2] = 0xFFFF2F6F ^ 0xD0A2;
        PredictsModule.m[0x636F ^ 0x63EE] = 0x6397 ^ 0x63EE;
        PredictsModule.m[0xA51 ^ 0xB18] = 0x3B1 ^ 0xB18;
        PredictsModule.m[0x96EA ^ 0x96B5] = 0x96C2 ^ 0x96B5;
        PredictsModule.m[0x1AD6 ^ 0x1A41] = 0x1A20 ^ 0x1A41;
        PredictsModule.m[0xC8AC ^ 0xC8F6] = 0xC866 ^ 0xC8F6;
        PredictsModule.m[0xA543 ^ 0xA50D] = 0xA550 ^ 0xA50D;
        PredictsModule.m[0x93B ^ 0x9BD] = 0xFFFFF64C ^ 0x9BD;
        PredictsModule.m[0xA4A4 ^ 0xA447] = 0xA401 ^ 0xA447;
        PredictsModule.m[0x2028 ^ 0x2140] = 0x2109 ^ 0x2140;
        PredictsModule.m[0x10CF ^ 0x1188] = 0x800F ^ 0x1188;
        PredictsModule.m[0x1518 ^ 0x15BC] = 0x15C0 ^ 0x15BC;
        PredictsModule.m[0xE733 ^ 0xE676] = 0x9953 ^ 0xE676;
        PredictsModule.m[0x10CF5 ^ 0x10CA1] = 0xFFFEF362 ^ 0x10CA1;
        PredictsModule.m[0x2A5F ^ 0x2A96] = 0x2AD1 ^ 0x2A96;
        PredictsModule.m[0x4680 ^ 0x464E] = 0x4671 ^ 0x464E;
        PredictsModule.m[0x38B9 ^ 0x39B6] = 0xFFFFC60A ^ 0x39B6;
        PredictsModule.m[0xBA1F ^ 0xBAEF] = 0xFFFF4547 ^ 0xBAEF;
        PredictsModule.m[0xED7D ^ 0xED69] = 0xED60 ^ 0xED69;
        PredictsModule.m[0xC215 ^ 0xC2FD] = 0xC2B5 ^ 0xC2FD;
        PredictsModule.m[0x4516 ^ 0x4474] = 0xFFFFBBD7 ^ 0x4474;
        PredictsModule.m[0xA67 ^ 0xA93] = 0xAC6 ^ 0xA93;
        PredictsModule.m[0x958B ^ 0x953A] = 0x9580 ^ 0x953A;
        PredictsModule.m[0x54A6 ^ 0x5435] = 0x5428 ^ 0x5435;
        PredictsModule.m[0xD9AA ^ 0xD822] = 0xD828 ^ 0xD822;
        PredictsModule.m[0x16A4 ^ 0x1634] = 0x1620 ^ 0x1634;
        PredictsModule.m[0x748 ^ 0x7D6] = 0xFFFFF826 ^ 0x7D6;
        PredictsModule.m[0x20CC ^ 0x2088] = 0x20E1 ^ 0x2088;
        PredictsModule.m[0xDC15 ^ 0xDCF3] = 0xFFFF2367 ^ 0xDCF3;
        PredictsModule.m[0xB36C ^ 0xB235] = 0xB245 ^ 0xB235;
        PredictsModule.m[0xC6A7 ^ 0xC7EC] = 0xED85 ^ 0xC7EC;
        PredictsModule.m[0x3E06 ^ 0x3E53] = 0xFFFFC1FD ^ 0x3E53;
        PredictsModule.m[0x9C00 ^ 0x9C87] = 0xFFFF6354 ^ 0x9C87;
        PredictsModule.m[0x90FC ^ 0x9038] = 0x900A ^ 0x9038;
        PredictsModule.m[0x5A64 ^ 0x5AFE] = 0x5A9E ^ 0x5AFE;
        PredictsModule.m[0x10A3C ^ 0x10A37] = 0x10A12 ^ 0x10A37;
        PredictsModule.m[0xAC1B ^ 0xAD56] = 0x239D ^ 0xAD56;
        PredictsModule.m[0x5955 ^ 0x586A] = 0x5868 ^ 0x586A;
        PredictsModule.m[0xF397 ^ 0xF3AA] = 0xFFFF0C0E ^ 0xF3AA;
        PredictsModule.m[0x2181 ^ 0x216F] = 0xFFFFDE81 ^ 0x216F;
        PredictsModule.m[0xC11D ^ 0xC194] = 0xFFFF3E42 ^ 0xC194;
        PredictsModule.m[0x87C5 ^ 0x86D3] = 0xFFFF7967 ^ 0x86D3;
        PredictsModule.m[0x338 ^ 0x3DA] = 0x3DA ^ 0x3DA;
        PredictsModule.m[0x3A07 ^ 0x3B22] = 0xFFFFC4C5 ^ 0x3B22;
        PredictsModule.m[0x48E8 ^ 0x48B0] = 0xFFFFB73D ^ 0x48B0;
        PredictsModule.m[0xD715 ^ 0xD692] = 0xD6F7 ^ 0xD692;
        PredictsModule.m[0x3958 ^ 0x39F8] = 0x3989 ^ 0x39F8;
        PredictsModule.m[0xD7F8 ^ 0xD770] = 0xD774 ^ 0xD770;
        PredictsModule.m[0x9B66 ^ 0x9A5A] = 0x9A5A ^ 0x9A5A;
        PredictsModule.m[0x1EEB ^ 0x1EB5] = 0x1EC7 ^ 0x1EB5;
        PredictsModule.m[0xF544 ^ 0xF472] = 0xFFFF0B94 ^ 0xF472;
        PredictsModule.m[0xF7C4 ^ 0xF7CE] = 0xFFFF0832 ^ 0xF7CE;
        PredictsModule.m[0xF798 ^ 0xF752] = 0xFFFF0888 ^ 0xF752;
        PredictsModule.m[0xD7E1 ^ 0xD6E2] = 0xD6B6 ^ 0xD6E2;
        PredictsModule.m[0x5221 ^ 0x52AD] = 0xFFFFAD5F ^ 0x52AD;
        PredictsModule.m[0xA282 ^ 0xA28F] = 0xA2BF ^ 0xA28F;
        PredictsModule.m[0x2295 ^ 0x239C] = 0xFFFFDC0F ^ 0x239C;
        PredictsModule.m[0xD4E8 ^ 0xD567] = 0xD57C ^ 0xD567;
        PredictsModule.m[0xAA9E ^ 0xAA0A] = 0xFFFF55F1 ^ 0xAA0A;
        PredictsModule.m[0xF0F6 ^ 0xF1B7] = 0xF1B7 ^ 0xF1B7;
        PredictsModule.m[0x53A8 ^ 0x5331] = 0xFFFFACB2 ^ 0x5331;
        PredictsModule.m[0x4543 ^ 0x4535] = 0x4539 ^ 0x4535;
        PredictsModule.m[0x1335 ^ 0x13FA] = 0xFFFFECC1 ^ 0x13FA;
        PredictsModule.m[0x109B9 ^ 0x108E2] = 0xFFFEF77D ^ 0x108E2;
        PredictsModule.m[0x6AAF ^ 0x6BFC] = 0x6BFC ^ 0x6BFC;
        PredictsModule.m[0x30A0 ^ 0x304C] = 0x3032 ^ 0x304C;
        PredictsModule.m[0x16B0 ^ 0x1641] = 0xFFFFE9EC ^ 0x1641;
        PredictsModule.m[0x1278 ^ 0x124B] = 0x1221 ^ 0x124B;
        PredictsModule.m[0xB7A9 ^ 0xB7A9] = 0xB7F4 ^ 0xB7A9;
        PredictsModule.m[0xBF4B ^ 0xBF8E] = 0xFFFF404F ^ 0xBF8E;
        PredictsModule.m[0x9CDB ^ 0x9CDF] = 0xFFFF633A ^ 0x9CDF;
        PredictsModule.m[0x741B ^ 0x74F4] = 0x74FE ^ 0x74F4;
        PredictsModule.m[0x7F01 ^ 0x7F6B] = 0x7F7F ^ 0x7F6B;
        PredictsModule.m[0x2FE0 ^ 0x2F43] = 0x2F47 ^ 0x2F43;
        PredictsModule.m[0x4036 ^ 0x402E] = 0xFFFFBF46 ^ 0x402E;
        PredictsModule.m[0x42E5 ^ 0x4227] = 0x423A ^ 0x4227;
        PredictsModule.m[0xA284 ^ 0xA285] = 0xA2F9 ^ 0xA285;
        PredictsModule.m[0x323B ^ 0x336A] = 0xEA95 ^ 0x336A;
        PredictsModule.m[0xE96E ^ 0xE995] = 0xFFFF163C ^ 0xE995;
        PredictsModule.m[0x27EA ^ 0x26EF] = 0xFFFFD946 ^ 0x26EF;
        PredictsModule.m[0x1043B ^ 0x10525] = 0xFFFEFADB ^ 0x10525;
        PredictsModule.m[0x1D6D ^ 0x1DC5] = 0xFFFFE263 ^ 0x1DC5;
        PredictsModule.m[0x5781 ^ 0x56AE] = 0x5684 ^ 0x56AE;
        PredictsModule.m[0x786E ^ 0x787E] = 0x784A ^ 0x787E;
        PredictsModule.m[0x9D7B ^ 0x9C2C] = 0x9CCD ^ 0x9C2C;
        PredictsModule.m[0x9F72 ^ 0x9F8B] = 0xFFFF6073 ^ 0x9F8B;
        PredictsModule.m[0xB9C8 ^ 0xB8B8] = 0xFFFF4776 ^ 0xB8B8;
        PredictsModule.m[0x4E54 ^ 0x4F18] = 0xC292 ^ 0x4F18;
        PredictsModule.m[0xE8DF ^ 0xE843] = 0xE849 ^ 0xE843;
        PredictsModule.m[0xCF2E ^ 0xCF67] = 0xFFFF30AE ^ 0xCF67;
        PredictsModule.m[0xF7AA ^ 0xF759] = 0xFFFF08D9 ^ 0xF759;
        PredictsModule.m[0x2EAE ^ 0x2E1E] = 0xFFFFD1B2 ^ 0x2E1E;
        PredictsModule.m[0xB42B ^ 0xB486] = 0xFFFF4B64 ^ 0xB486;
        PredictsModule.m[0xD5F5 ^ 0xD4F9] = 0xD4AA ^ 0xD4F9;
        PredictsModule.m[0x6F69 ^ 0x6EE2] = 0x6ED1 ^ 0x6EE2;
        PredictsModule.m[0xBBC3 ^ 0xBAD2] = 0xFFFF45E0 ^ 0xBAD2;
        PredictsModule.m[0x7CB3 ^ 0x7DE1] = 0xF23E ^ 0x7DE1;
        PredictsModule.m[0xDB30 ^ 0xDA46] = 0xFFFF25F9 ^ 0xDA46;
        PredictsModule.m[0x80A7 ^ 0x80D7] = 0x80B1 ^ 0x80D7;
        PredictsModule.m[0x7FFB ^ 0x7F38] = 0x7FA9 ^ 0x7F38;
        PredictsModule.m[0x7769 ^ 0x77B7] = 0x77B5 ^ 0x77B7;
        PredictsModule.m[0x813A ^ 0x81F7] = 0xFFFF7E6B ^ 0x81F7;
        PredictsModule.m[0xC058 ^ 0xC139] = 0xC149 ^ 0xC139;
        PredictsModule.m[0xA2B5 ^ 0xA26E] = 0xA237 ^ 0xA26E;
        PredictsModule.m[0x5281 ^ 0x53EC] = 0xFFFFAC19 ^ 0x53EC;
        PredictsModule.m[0x6982 ^ 0x69BC] = 0x6993 ^ 0x69BC;
        PredictsModule.m[0xA33F ^ 0xA3C2] = 0xA3EF ^ 0xA3C2;
        PredictsModule.m[0x392A ^ 0x3846] = 0xFFFFC73F ^ 0x3846;
        PredictsModule.m[0x2446 ^ 0x2559] = 0x2570 ^ 0x2559;
        PredictsModule.m[0xE602 ^ 0xE607] = 0xFFFF19D4 ^ 0xE607;
        PredictsModule.m[0x2E2C ^ 0x2F6F] = 0x6F0F ^ 0x2F6F;
        PredictsModule.m[0xFF ^ 0x8A] = 0xFD ^ 0x8A;
        PredictsModule.m[0xB3BA ^ 0xB38E] = 0xB3B2 ^ 0xB38E;
        PredictsModule.m[0x4875 ^ 0x48DC] = 0xFFFFB726 ^ 0x48DC;
        PredictsModule.m[0x81A1 ^ 0x80F9] = 0xFFFF7F56 ^ 0x80F9;
        PredictsModule.m[0xA24E ^ 0xA253] = 0xA215 ^ 0xA253;
        PredictsModule.m[0xAD60 ^ 0xAC6E] = 0xFFFF53F3 ^ 0xAC6E;
        PredictsModule.m[0xA7D9 ^ 0xA746] = 0xA757 ^ 0xA746;
        PredictsModule.m[0x95A7 ^ 0x9543] = 0xFFFF6ABD ^ 0x9543;
        PredictsModule.m[0xD1A ^ 0xD94] = 0xD8C ^ 0xD94;
        PredictsModule.m[0x68EE ^ 0x6804] = 0x68B1 ^ 0x6804;
        PredictsModule.m[0x9BEB ^ 0x9BCC] = 0x9B92 ^ 0x9BCC;
        PredictsModule.m[0x455B ^ 0x4511] = 0x453D ^ 0x4511;
        PredictsModule.m[0x632F ^ 0x63F0] = 0xFFFF9C79 ^ 0x63F0;
        PredictsModule.m[0x606D ^ 0x6104] = 0xFFFF9ED7 ^ 0x6104;
        PredictsModule.m[0x49F8 ^ 0x49D4] = 0x4996 ^ 0x49D4;
        PredictsModule.m[0x32DE ^ 0x33D4] = 0x33CB ^ 0x33D4;
        PredictsModule.m[0x109D2 ^ 0x109C0] = 0xFFFEF66A ^ 0x109C0;
        PredictsModule.m[0xD21C ^ 0xD253] = 0xFFFF2DFC ^ 0xD253;
        PredictsModule.m[0x4D17 ^ 0x4C9A] = 0xFFFFB32F ^ 0x4C9A;
        PredictsModule.m[0xC2F0 ^ 0xC24E] = 0xC24B ^ 0xC24E;
        PredictsModule.m[0x9756 ^ 0x97B6] = 0xFFFF6831 ^ 0x97B6;
        PredictsModule.m[0x508 ^ 0x560] = 0x525 ^ 0x560;
        PredictsModule.m[0x34C5 ^ 0x35DE] = 0xFFFFCA79 ^ 0x35DE;
        PredictsModule.m[0xA0D8 ^ 0xA196] = 0xA025 ^ 0xA196;
        PredictsModule.m[0x67D0 ^ 0x67FE] = 0x67FC ^ 0x67FE;
        PredictsModule.m[0xC463 ^ 0xC465] = 0xC45D ^ 0xC465;
        PredictsModule.m[0xF93B ^ 0xF84F] = 0xF872 ^ 0xF84F;
        PredictsModule.m[0x9298 ^ 0x9260] = 0x920A ^ 0x9260;
        PredictsModule.m[0x9E6 ^ 0x9A5] = 0x9E1 ^ 0x9A5;
        PredictsModule.m[0x82B9 ^ 0x83E3] = 0xFFFF7CB4 ^ 0x83E3;
        PredictsModule.m[0x2DCC ^ 0x2D48] = 0xFFFFD296 ^ 0x2D48;
        PredictsModule.m[0xD69 ^ 0xD0B] = 0xFFFFF2CF ^ 0xD0B;
        PredictsModule.m[0x308E ^ 0x30E2] = 0x30CC ^ 0x30E2;
        PredictsModule.m[0x2558 ^ 0x241C] = 0x711D ^ 0x241C;
        PredictsModule.m[0x1730 ^ 0x17CF] = 0x172A ^ 0x17CF;
        PredictsModule.m[0x7B93 ^ 0x7B06] = 0x7B3E ^ 0x7B06;
        PredictsModule.m[0x1109 ^ 0x11EE] = 0xFFFFEE0E ^ 0x11EE;
        PredictsModule.m[0xE4B3 ^ 0xE419] = 0xE465 ^ 0xE419;
        PredictsModule.m[0xBAC5 ^ 0xBBCD] = 0xFFFF441F ^ 0xBBCD;
        PredictsModule.m[0xCF88 ^ 0xCE0B] = 0xCE56 ^ 0xCE0B;
        PredictsModule.m[0xFA40 ^ 0xFAD1] = 0xFAB6 ^ 0xFAD1;
        PredictsModule.m[0x10CD6 ^ 0x10DF2] = 0x10D80 ^ 0x10DF2;
        PredictsModule.m[0x8870 ^ 0x8873] = 0xFFFF77CA ^ 0x8873;
        PredictsModule.m[0x2313 ^ 0x23E9] = 0x23B8 ^ 0x23E9;
        PredictsModule.m[0x10BE1 ^ 0x10B77] = 0x10B3C ^ 0x10B77;
        PredictsModule.m[0x6381 ^ 0x63B6] = 0xFFFF9C72 ^ 0x63B6;
        PredictsModule.m[0x8AB0 ^ 0x8A90] = 0x8ADD ^ 0x8A90;
        PredictsModule.m[0x6385 ^ 0x63D6] = 0xFFFF9C21 ^ 0x63D6;
        PredictsModule.m[0xC170 ^ 0xC163] = 0xFFFF3ECD ^ 0xC163;
        PredictsModule.m[0x8455 ^ 0x85DF] = 0x85EF ^ 0x85DF;
        PredictsModule.m[0x63C0 ^ 0x63E2] = 0x63FF ^ 0x63E2;
        PredictsModule.m[0xB3BF ^ 0xB2F7] = 0xED1F ^ 0xB2F7;
        PredictsModule.m[0xBF67 ^ 0xBEE3] = 0xBEF1 ^ 0xBEE3;
        PredictsModule.m[0xA935 ^ 0xA85F] = 0xA832 ^ 0xA85F;
        PredictsModule.m[0x2384 ^ 0x22BA] = 0x22BA ^ 0x22BA;
        PredictsModule.m[0x10220 ^ 0x10318] = 0x10373 ^ 0x10318;
        PredictsModule.m[0xE6E1 ^ 0xE6C4] = 0xFFFF1919 ^ 0xE6C4;
        PredictsModule.m[0x3E01 ^ 0x3EB6] = 0x3E90 ^ 0x3EB6;
        PredictsModule.m[0xFE6A ^ 0xFE33] = 0xFFFF0192 ^ 0xFE33;
        PredictsModule.m[0x187B ^ 0x1887] = 0x18CA ^ 0x1887;
        PredictsModule.m[0xC195 ^ 0xC14C] = 0xC165 ^ 0xC14C;
        PredictsModule.m[0x439A ^ 0x43C8] = 0xFFFFBC13 ^ 0x43C8;
        PredictsModule.m[0xE889 ^ 0xE8CC] = 0xFFFF177A ^ 0xE8CC;
        PredictsModule.m[0xD499 ^ 0xD41B] = 0xFFFF2BB4 ^ 0xD41B;
        PredictsModule.m[0x5210 ^ 0x526E] = 0x5222 ^ 0x526E;
        PredictsModule.m[0x10E32 ^ 0x10E2B] = 0x10E62 ^ 0x10E2B;
        PredictsModule.m[0x7016 ^ 0x7070] = 0x7041 ^ 0x7070;
        PredictsModule.m[0x6C16 ^ 0x6D64] = 0xFFFF92DF ^ 0x6D64;
        PredictsModule.m[0x5C47 ^ 0x5D41] = 0x5D16 ^ 0x5D41;
        PredictsModule.m[0x67D6 ^ 0x67EA] = 0xFFFF989D ^ 0x67EA;
        PredictsModule.m[0x3BCD ^ 0x3ADD] = 0x3AE2 ^ 0x3ADD;
        PredictsModule.m[0x2F98 ^ 0x2FBB] = 0xFFFFD07A ^ 0x2FBB;
        PredictsModule.m[0xAFFA ^ 0xAF4F] = 0xAF79 ^ 0xAF4F;
        PredictsModule.m[0xBF40 ^ 0xBE37] = 0xFFFF41F6 ^ 0xBE37;
        PredictsModule.m[0xBFAA ^ 0xBE9F] = 0xBEF1 ^ 0xBE9F;
        PredictsModule.m[0x7435 ^ 0x7526] = 0x754F ^ 0x7526;
        PredictsModule.m[0x633E ^ 0x63EB] = 0x63F9 ^ 0x63EB;
        PredictsModule.m[0x5D3A ^ 0x5D8C] = 0x5DA1 ^ 0x5D8C;
        PredictsModule.m[0x170F ^ 0x1766] = 0x1700 ^ 0x1766;
        PredictsModule.m[0x31E4 ^ 0x3176] = 0xFFFFCED3 ^ 0x3176;
        PredictsModule.m[0x860A ^ 0x86B7] = 0x8684 ^ 0x86B7;
        PredictsModule.m[0xFF8A ^ 0xFEEC] = 0xFE60 ^ 0xFEEC;
        PredictsModule.m[0x10855 ^ 0x108EE] = 0x10887 ^ 0x108EE;
        PredictsModule.m[0x1590 ^ 0x158A] = 0xFFFFEA3E ^ 0x158A;
        PredictsModule.m[0x3609 ^ 0x3769] = 0x3784 ^ 0x3769;
        PredictsModule.m[0x4833 ^ 0x484B] = 0x4951 ^ 0x484B;
        PredictsModule.m[0x30EA ^ 0x3007] = 0xFFFFCFFF ^ 0x3007;
        PredictsModule.m[0x9FF5 ^ 0x9EC4] = 0xFFFF6131 ^ 0x9EC4;
        PredictsModule.m[0xD0C6 ^ 0xD148] = 0xD138 ^ 0xD148;
        PredictsModule.m[0x45C8 ^ 0x4536] = 0xFFFFBAD6 ^ 0x4536;
        PredictsModule.m[0x80AA ^ 0x805C] = 0x8005 ^ 0x805C;
        PredictsModule.m[0x105AA ^ 0x10506] = 0x10561 ^ 0x10506;
        PredictsModule.m[0x178D ^ 0x17F0] = 0xFFFFE82B ^ 0x17F0;
        PredictsModule.m[0x5111 ^ 0x513E] = 0x513A ^ 0x513E;
        PredictsModule.m[0x11 ^ 0x151] = 0x151 ^ 0x151;
        PredictsModule.m[0xCA8 ^ 0xC70] = 0xCE9 ^ 0xC70;
        PredictsModule.m[0xFE21 ^ 0xFF02] = 0xFFFF00B7 ^ 0xFF02;
        PredictsModule.m[0x604A ^ 0x60C5] = 0xFFFF9F21 ^ 0x60C5;
        PredictsModule.m[0xEC6F ^ 0xEC3E] = 0xEC02 ^ 0xEC3E;
        PredictsModule.m[0x70D8 ^ 0x71BB] = 0x71F9 ^ 0x71BB;
        PredictsModule.m[0x2410 ^ 0x2592] = 0x25EE ^ 0x2592;
        PredictsModule.m[0x771F ^ 0x769F] = 0xFFFF896E ^ 0x769F;
        PredictsModule.m[0x3C28 ^ 0x3D4D] = 0xFFFFC2F0 ^ 0x3D4D;
        PredictsModule.m[0x83B ^ 0x856] = 0xFFFFF7DE ^ 0x856;
        PredictsModule.m[0x8AAA ^ 0x8AE6] = 0x8AEE ^ 0x8AE6;
        PredictsModule.m[0xB033 ^ 0xB15D] = 0xB131 ^ 0xB15D;
        PredictsModule.m[0xDB4 ^ 0xCE8] = 0xFFFFF370 ^ 0xCE8;
        PredictsModule.m[0xB6A9 ^ 0xB7D5] = 0xFFFF482E ^ 0xB7D5;
        PredictsModule.m[0x8C25 ^ 0x8D5F] = 0xFFFF729C ^ 0x8D5F;
        PredictsModule.m[0x8100 ^ 0x8117] = 0x8164 ^ 0x8117;
        PredictsModule.m[0x2EF4 ^ 0x2E7F] = 0xFFFFD1F7 ^ 0x2E7F;
        PredictsModule.m[0x4F19 ^ 0x4F2C] = 0x4F02 ^ 0x4F2C;
        PredictsModule.m[0xDA71 ^ 0xDA0A] = 0xFFFF25A0 ^ 0xDA0A;
        PredictsModule.m[0x4C43 ^ 0x4D0C] = 0x2C5B ^ 0x4D0C;
        PredictsModule.m[0x6257 ^ 0x62E4] = 0x62CA ^ 0x62E4;
        PredictsModule.m[0xBCE5 ^ 0xBCE2] = 0xBC86 ^ 0xBCE2;
        PredictsModule.m[0xC850 ^ 0xC8FE] = 0xFFFF37B7 ^ 0xC8FE;
    }
}

