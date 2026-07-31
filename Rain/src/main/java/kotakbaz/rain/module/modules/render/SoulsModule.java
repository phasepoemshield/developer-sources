/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.opengl.GlStateManager;
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
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.Render3DEvent;
import kotakbaz.rain.event.events.TotemPopEvent;
import kotakbaz.rain.mixin.EntityRenderDispatcherAccessor;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.h;
import kotakbaz.rain.module.modules.render.p;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002FGB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b\"\u0010#J7\u0010(\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b-\u0010\u0003R\u0014\u0010/\u001a\u00020.8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b3\u00102R\u0014\u00104\u001a\u00020.8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b4\u00100R\u0014\u00106\u001a\u0002058\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b=\u0010<R$\u0010A\u001a\u0012\u0012\u0004\u0012\u00020?0>j\b\u0012\u0004\u0012\u00020?`@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u00100\u00a8\u0006H"}, d2={"Lkotakbaz/rain/module/modules/render/SoulsModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/TotemPopEvent;", "event", "onTotemPop", "(Lkotakbaz/rain/event/events/TotemPopEvent;)V", "Lkotakbaz/rain/event/events/AttackEvent;", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lkotakbaz/rain/event/events/Render3DEvent;", "onRender3D", "(Lkotakbaz/rain/event/events/Render3DEvent;)V", "Lnet/minecraft/class_1657;", "target", "spawnSoul", "(Lnet/minecraft/class_1657;)V", "", "ghostName", "Lcom/mojang/authlib/GameProfile;", "createGhostProfile", "(Lnet/minecraft/class_1657;Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;", "Lnet/minecraft/class_745;", "ghost", "", "yaw", "pitch", "applyInitialGhostRotation", "(Lnet/minecraft/class_745;FF)V", "", "x", "y", "z", "updateGhostForRender", "(Lnet/minecraft/class_745;DDDF)V", "scoreHolder", "hideNameTag", "(Ljava/lang/String;)V", "clearHideTeam", "", "DURATION_MS", "J", "RISE_HEIGHT", "F", "GHOST_ALPHA_START", "LAST_HIT_WINDOW_MS", "", "LIGHT", "I", "HIDE_TEAM", "Ljava/lang/String;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "onDeath", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "onTotem", "Ljava/util/ArrayList;", "Lkotakbaz/rain/module/modules/render/SoulsModule$Soul;", "Lkotlin/collections/ArrayList;", "souls", "Ljava/util/ArrayList;", "lastTarget", "Lnet/minecraft/class_1657;", "lastHitAt", "Soul", "AlphaVertexConsumerProvider", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nSoulsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoulsModule.kt\nkotakbaz/rain/module/modules/render/SoulsModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,305:1\n1#2:306\n*E\n"})
public final class SoulsModule
extends Module {
    @NotNull
    public static final SoulsModule INSTANCE;
    private static final long a = 1600L;
    private static final float A = 1.8f;
    private static final float b = 0.65f;
    private static final long B = 3000L;
    private static final int c = 0xF000F0;
    @NotNull
    private static final String C = "rain_soul_hidden";
    @NotNull
    private static final BooleanSetting d;
    @NotNull
    private static final BooleanSetting D;
    @NotNull
    private static final ArrayList<p> e;
    @Nullable
    private static PlayerEntity E;
    private static long f;
    private static Object[] F;
    private static Object G;
    private static Object[] h;
    private static Object[] g;
    private static Object[] H;
    public static int[] i;

    private SoulsModule() {
        int n2 = i[0];
        n2 += i[1];
        int n3 = i[3];
        n3 -= i[4];
        int n4 = i[6];
        n4 += i[7];
        super((String)F[n2 += i[2]], a_0.getRENDER(), (String)F[n3 -= i[5]] + (String)F[n4 -= i[8]]);
    }

    @Override
    public void onEnable() {
        e.clear();
        E = null;
        this.clearHideTeam();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        e.clear();
        E = null;
        this.clearHideTeam();
        super.onDisable();
    }

    @Commando
    public final void onTotemPop(@NotNull TotemPopEvent event) {
        int n2 = i[9];
        n2 ^= i[10];
        Intrinsics.checkNotNullParameter(event, (String)F[n2 ^= i[11]]);
        if (!((Boolean)D.getValue()).booleanValue() || kotakbaz.rain.client.extensions.b.getMc().world == null || kotakbaz.rain.client.extensions.b.getMc().player == null) {
            return;
        }
        PlayerEntity playerEntity = event.getPlayer();
        if (Intrinsics.areEqual(playerEntity, kotakbaz.rain.client.extensions.b.getMc().player)) {
            return;
        }
        this.spawnSoul(playerEntity);
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        int n2 = i[12];
        n2 -= i[13];
        Intrinsics.checkNotNullParameter(event, (String)F[n2 ^= i[14]]);
        if (!((Boolean)d.getValue()).booleanValue()) {
            return;
        }
        Entity entity = event.getEntity();
        PlayerEntity playerEntity = entity instanceof PlayerEntity ? (PlayerEntity)entity : null;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity playerEntity2 = playerEntity;
        if (Intrinsics.areEqual(playerEntity2, kotakbaz.rain.client.extensions.b.getMc().player)) {
            return;
        }
        E = playerEntity2;
        f = System.currentTimeMillis();
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        int n2;
        long l2 = 5964271757909588546L;
        long l3 = 1396375730676246209L;
        int n3 = i[15];
        n3 += i[16];
        Intrinsics.checkNotNullParameter(event, (String)F[n3 -= i[17]]);
        long l4 = System.currentTimeMillis();
        e.removeIf(arg_0 -> SoulsModule.onUpdate$lambda$1(arg_0 -> SoulsModule.onUpdate$lambda$0(l4, arg_0), arg_0));
        if (!((Boolean)d.getValue()).booleanValue() || kotakbaz.rain.client.extensions.b.getMc().player == null || kotakbaz.rain.client.extensions.b.getMc().world == null) {
            return;
        }
        PlayerEntity playerEntity = E;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity playerEntity2 = playerEntity;
        if (!playerEntity2.isAlive() || playerEntity2.getHealth() <= 0.0f) {
            int n4 = i[18];
            n4 ^= i[19];
            n2 = n4 -= i[20];
        } else {
            int n5 = i[21];
            n5 ^= i[22];
            n2 = n5 ^= i[23];
        }
        int n6 = i[24];
        n6 ^= i[25];
        long l5 = l3;
        int n7 = i[27];
        n7 -= i[28];
        l3 = l5 ^ ((long)n2 << (n6 += i[26]) ^ l5) & -1L << (n7 += i[29]);
        int n8 = i[30];
        n8 += i[31];
        if ((int)(l3 >>> (n8 -= i[32])) != 0 && l4 - f <= 3000L) {
            this.spawnSoul(playerEntity2);
            E = null;
        } else {
            int n9 = i[33];
            n9 -= i[34];
            if ((int)(l3 >>> (n9 ^= i[35])) != 0) {
                E = null;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Commando
    public final void onRender3D(@NotNull Render3DEvent event) {
        long l2 = 3496556523174310827L;
        long l3 = 4277736879775332319L;
        int n2 = i[36];
        n2 -= i[37];
        Intrinsics.checkNotNullParameter(event, (String)F[n2 += i[38]]);
        if (kotakbaz.rain.client.extensions.b.getMc().player == null || kotakbaz.rain.client.extensions.b.getMc().world == null || e.isEmpty()) {
            return;
        }
        EntityRenderDispatcher entityRenderDispatcher = kotakbaz.rain.client.extensions.b.getMc().getEntityRenderDispatcher();
        VertexConsumerProvider.Immediate immediate = kotakbaz.rain.client.extensions.b.getMc().getBufferBuilders().getEntityVertexConsumers();
        Vec3d vec3d = kotakbaz.rain.client.extensions.b.getMc().gameRenderer.getCamera().getPos();
        long l4 = System.currentTimeMillis();
        int n3 = i[39];
        n3 ^= i[40];
        int n4 = i[42];
        n4 += i[43];
        Intrinsics.checkNotNull(entityRenderDispatcher, (String)F[n3 ^= i[41]] + (String)F[n4 ^= i[44]]);
        int n5 = i[45];
        n5 -= i[46];
        long l5 = l3;
        int n6 = i[48];
        n6 ^= i[49];
        l3 = l5 ^ ((long)((EntityRenderDispatcherAccessor)entityRenderDispatcher).rain$getRenderShadows() << (n5 += i[47]) ^ l5) & -1L << (n6 += i[50]);
        GlStateManager._enableBlend();
        GlStateManager._enableDepthTest();
        GlStateManager._disableCull();
        try {
            boolean bl = i[51];
            bl += i[52];
            entityRenderDispatcher.setRenderShadows(bl += i[53]);
            Iterator<p> iterator2 = e.iterator();
            int n7 = i[54];
            n7 += i[55];
            Intrinsics.checkNotNullExpressionValue(iterator2, (String)F[n7 -= i[56]]);
            Iterator<p> iterator3 = iterator2;
            while (iterator3.hasNext()) {
                p p2;
                int n8 = i[57];
                n8 ^= i[58];
                Intrinsics.checkNotNullExpressionValue(iterator3.next(), (String)F[n8 += i[59]]);
                float f2 = RangesKt.coerceIn((float)(l4 - p2.getStartAt()) / (float)1600L, 0.0f, 1.0f);
                if (f2 >= 1.0f) {
                    iterator3.remove();
                    continue;
                }
                float f3 = 1.0f - (1.0f - f2) * (1.0f - f2) * (1.0f - f2);
                float f4 = RangesKt.coerceIn(0.65f * (1.0f - f2), 0.0f, 1.0f);
                double d2 = p2.getStartPos().x;
                double d3 = p2.getStartPos().y + (double)(f3 * 1.8f);
                double d4 = p2.getStartPos().z;
                float f5 = p2.getBaseYaw() + 360.0f * f3;
                this.updateGhostForRender(p2.getGhost(), d2, d3, d4, f5);
                Intrinsics.checkNotNull(immediate);
                h h2 = new h((VertexConsumerProvider)immediate, f4);
                event.getMatrices().push();
                int n9 = i[60];
                n9 -= i[61];
                entityRenderDispatcher.render((Entity)p2.getGhost(), d2 - vec3d.x, d3 - vec3d.y, d4 - vec3d.z, event.getPartialTicks(), event.getMatrices(), (VertexConsumerProvider)h2, n9 -= i[62]);
                event.getMatrices().pop();
            }
            immediate.draw();
        }
        catch (Throwable throwable) {
            int n10 = i[66];
            n10 -= i[67];
            entityRenderDispatcher.setRenderShadows((boolean)(l3 >>> (n10 ^= i[68])));
            GlStateManager._enableCull();
            GlStateManager._disableBlend();
            throw throwable;
        }
        int n11 = i[63];
        n11 += i[64];
        entityRenderDispatcher.setRenderShadows((boolean)(l3 >>> (n11 ^= i[65])));
        GlStateManager._enableCull();
        GlStateManager._disableBlend();
    }

    private final void spawnSoul(PlayerEntity target) {
        long l2;
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        long l3 = l2 = System.currentTimeMillis();
        int n2 = i[69];
        n2 += i[70];
        GameProfile gameProfile = this.createGhostProfile(target, (String)F[n2 += i[71]] + l3);
        OtherClientPlayerEntity otherClientPlayerEntity = new OtherClientPlayerEntity(clientWorld2, gameProfile);
        Vec3d vec3d = new Vec3d(target.getX(), target.getY() + Double.longBitsToDouble(0xBE1CCF5A34DF0CA4L ^ 0x81A556C3AD46953EL), target.getZ());
        float f2 = target.getYaw();
        float f3 = target.getPitch();
        otherClientPlayerEntity.copyPositionAndRotation((Entity)target);
        this.applyInitialGhostRotation(otherClientPlayerEntity, f2, f3);
        otherClientPlayerEntity.setVelocity(Vec3d.ZERO);
        otherClientPlayerEntity.setCustomName(null);
        boolean bl = i[72];
        bl += i[73];
        otherClientPlayerEntity.setCustomNameVisible(bl ^= i[74]);
        boolean bl2 = i[75];
        bl2 ^= i[76];
        otherClientPlayerEntity.setInvisible(bl2 -= i[77]);
        String string = gameProfile.getName();
        int n3 = i[78];
        n3 ^= i[79];
        Intrinsics.checkNotNullExpressionValue(string, (String)F[n3 ^= i[80]]);
        this.hideNameTag(string);
        e.add(new p(vec3d, l2, otherClientPlayerEntity, f2));
    }

    private final GameProfile createGhostProfile(PlayerEntity target, String ghostName) {
        long l2 = 4194940229559712890L;
        if (target instanceof AbstractClientPlayerEntity) {
            GameProfile gameProfile;
            GameProfile gameProfile2 = ((AbstractClientPlayerEntity)target).getGameProfile();
            GameProfile gameProfile3 = gameProfile = new GameProfile(gameProfile2.getId(), ghostName);
            long l3 = l2;
            int n2 = i[81];
            n2 += i[82];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 += i[83]);
            SoulsModule soulsModule = INSTANCE;
            try {
                Object object = soulsModule;
                long l4 = l2;
                int n3 = i[84];
                n3 -= i[85];
                l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 -= i[86]);
                object = Result.cfr_renamed_1(gameProfile3.getProperties().putAll((Multimap)gameProfile2.getProperties()));
            }
            catch (Throwable throwable) {
                Object object = Result.cfr_renamed_1(ResultKt.createFailure(throwable));
            }
            return gameProfile;
        }
        return new GameProfile(target.getUuid(), ghostName);
    }

    private final void applyInitialGhostRotation(OtherClientPlayerEntity ghost, float yaw, float pitch) {
        ghost.setYaw(yaw);
        ghost.setPitch(pitch);
        ghost.setHeadYaw(yaw);
        ghost.setBodyYaw(yaw);
    }

    private final void updateGhostForRender(OtherClientPlayerEntity ghost, double x2, double y, double z, float yaw) {
        Vec3d vec3d = new Vec3d(x2, y, z);
        ghost.setPos(x2, y, z);
        ghost.updatePosition(x2, y, z);
        ghost.refreshPositionAndAngles(x2, y, z, yaw, 0.0f);
        ghost.setLastPositionAndAngles(vec3d, yaw, 0.0f);
        ghost.lastX = x2;
        ghost.lastY = y;
        ghost.lastZ = z;
        ghost.lastRenderX = x2;
        ghost.lastRenderY = y;
        ghost.lastRenderZ = z;
        ghost.setYaw(yaw);
        ghost.setPitch(0.0f);
        ghost.lastYaw = yaw;
        ghost.lastPitch = 0.0f;
        ghost.setHeadYaw(yaw);
        ghost.lastHeadYaw = yaw;
        ghost.setBodyYaw(yaw);
        ghost.lastBodyYaw = yaw;
        ghost.setVelocity(Vec3d.ZERO);
        int n2 = i[87];
        n2 ^= i[88];
        ghost.age = n2 -= i[89];
        int n3 = i[90];
        n3 ^= i[91];
        ghost.handSwinging = n3 += i[92];
        int n4 = i[93];
        n4 -= i[94];
        ghost.handSwingTicks = n4 += i[95];
        ghost.lastHandSwingProgress = 0.0f;
        ghost.handSwingProgress = 0.0f;
        int n5 = i[96];
        n5 += i[97];
        ghost.hurtTime = n5 ^= i[98];
        int n6 = i[99];
        n6 += i[100];
        ghost.maxHurtTime = n6 -= i[101];
        int n7 = i[102];
        n7 += i[103];
        ghost.deathTime = n7 -= i[104];
        ghost.distanceTraveled = 0.0f;
        ghost.speed = 0.0f;
        ghost.fallDistance = 0.0;
        int n8 = i[105];
        n8 -= i[106];
        ghost.timeUntilRegen = n8 += i[107];
        ghost.limbAnimator.reset();
        boolean bl = i[108];
        bl += i[109];
        ghost.setOnGround(bl -= i[110]);
        ghost.setPose(EntityPose.STANDING);
        boolean bl2 = i[111];
        bl2 ^= i[112];
        ghost.setSneaking(bl2 += i[113]);
        boolean bl3 = i[114];
        bl3 ^= i[115];
        ghost.setSprinting(bl3 ^= i[116]);
        boolean bl4 = i[117];
        bl4 ^= i[118];
        ghost.setSwimming(bl4 -= i[119]);
        boolean bl5 = i[120];
        bl5 += i[121];
        ghost.setInvisible(bl5 -= i[122]);
        ghost.setCustomName(null);
        boolean bl6 = i[123];
        bl6 += i[124];
        ghost.setCustomNameVisible(bl6 -= i[125]);
    }

    private final void hideNameTag(String scoreHolder) {
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getScoreboard()) == null) {
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        int n2 = i[126];
        n2 -= i[127];
        int n3 = i[129];
        n3 -= i[130];
        Team team = clientWorld2.getTeam((String)F[n2 += i[128]] + (String)F[n3 ^= i[131]]);
        if (team == null) {
            int n4 = i[132];
            n4 += i[133];
            int n5 = i[135];
            n5 -= i[136];
            team = clientWorld2.addTeam((String)F[n4 ^= i[134]] + (String)F[n5 -= i[137]]);
        }
        Team team2 = team;
        team2.setNameTagVisibilityRule(AbstractTeam.VisibilityRule.NEVER);
        clientWorld2.addScoreHolderToTeam(scoreHolder, team2);
    }

    private final void clearHideTeam() {
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getScoreboard()) == null) {
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        int n2 = i[138];
        n2 += i[139];
        int n3 = i[141];
        n3 -= i[142];
        Team team = clientWorld2.getTeam((String)F[n2 += i[140]] + (String)F[n3 ^= i[143]]);
        if (team == null) {
            return;
        }
        Team team2 = team;
        clientWorld2.removeTeam(team2);
    }

    private static final boolean onUpdate$lambda$0(long $now, p it) {
        boolean bl;
        int n2 = i[144];
        n2 += i[145];
        Intrinsics.checkNotNullParameter(it, (String)F[n2 += i[146]]);
        if ($now - it.getStartAt() > 1800L) {
            boolean bl2 = i[147];
            bl2 -= i[148];
            bl = bl2 += i[149];
        } else {
            boolean bl3 = i[150];
            bl3 -= i[151];
            bl = bl3 -= i[152];
        }
        return bl;
    }

    private static final boolean onUpdate$lambda$1(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    static {
        SoulsModule.b();
        long l2 = 6374539698240670804L;
        long l3 = 4807385424552920681L;
        long l4 = 5660622409892532771L;
        long l5 = -8184100173150306330L;
        long l6 = -7175624553830015663L;
        long l7 = 2187745928380032006L;
        long l8 = -7028978374746064129L;
        long l9 = -3494241982864058951L;
        long l10 = 6139931149521183163L;
        long l11 = 2490123573176089151L;
        long l12 = 3756976311830532882L;
        long l13 = 5348754964653606618L;
        long l14 = 6907670939914224233L;
        long l15 = -5304209324135549499L;
        int n2 = i[153];
        n2 ^= i[154];
        F = new Object[n2 += i[155]];
        long l16 = l15;
        int n3 = i[156];
        n3 ^= i[157];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= i[158]);
        Object[] objectArray = new Object[i[159]];
        objectArray[SoulsModule.i[160]] = g;
        objectArray[SoulsModule.i[161]] = i[162];
        int n4 = i[163];
        Object object = SoulsModule.A()[i[164]];
        if (object == null) {
            char[] cArray = "\u9e9e\u9d7d\u9e8a\u9d7f\ub3cc\ub3ae\ub3dd\u9e97\ub3cf\ub3de\ub3c6\ub3ad\ub3f8\u9d63\ub3c6\u9d6b\ub3ac\ub3d8\u9e80\ub3cf\ub3f0\ub3f3\u9e9f\u9d67\ub3c6\ub3f3\u9d67\u9e80\ub3cb\u9e81\ub3dd\ub3f2\u9e81\ub3ae\ub3c4\ub3d8\ub3cf\u9e82\ub3dd\ub3ac\u9e9d\ub3f1\ub3c3\ub3ca\ub3f3\u9d7c\u9e88\u9d68\u9e8a\u9d67\u9d7d\ub3c4\u9e9c\u9d66\ub3cd\ub3d2\u9e83\ub3c2\u9e9e\ub3ae\ub3ce\ub3c4\u9e9f\u9e81\u9d63\ub3de\u9d64\u9d6b\u9d66\u9d6a\u9e89\u9e82\ub3ce\ub3d0\ub3d3\u9d63\ub3d8\ub3f0\ub3c0\ub3d2\ub3c9\ub3cb\u9d67\u9d7d\ub3d1\ub3c4\u9d60\u9e83\u9d7e\u9e9c\u9e89\u9d69\ub3c1\u9e8a\u9d64\u9e9e\ub3dd\ub3ca\ub3c6\ub3cf\ub3c5\ub3c5\u9d67\ub3d1\u9d7e\u9d64\ub3dd\ub3c0\ub3ae\u9e9f\u9e9c\ub3c0\ub3c1\ub3dd\u9d64\ub3dc\u9d61\ub3c6\ub3f8\ub3d2\ub3f1\ub3ca\u9d7f\ub3c2\u9d7e\u9e8a\ub3f1\ub3d2\u9d6b\ub3ae\ub3f3\u9d64\ub3d0\ub3df\ub3d0\ub3ad\u9e8a\ub3ca\ub3d3\ub3ac\u9e8a\u9d6a\ub3f7\u9e82\ub3d1\u9e83\ub3f0\u9d7c\ub3ca\u9d60\u9e89\u9e86\u9d63\u9e8a\ub3d1\ub3c8\u9d65\u9d69\ub3c4\ub3ce\ub3d3\ub3d1\u9e81\u9d6a\u9d61\u9e88\u9e9d\u9d62\ub3f1\ub3c8\ub3cd\u9e9f\ub3d3\u9d7d\ub3f0\ub3ce\ub3c8\ub3d1\ub3c7\ub3dc\ub3de\u9d65\ub3f7\ub3c8\ub3cb\u9e89\ub3c4\u9d64\u9d67\ub3c4\u9e9e\ub3dd\ub3df\ub3ac\ub3f1\ub3d8\ub3ae\u9e9f\u9e9f\u9e81\ub3c0\ub3c4\ub3cb\ub3d3\u9e83\ub3c5\ub3f8\ub3af\ub3cf\u9e81\ub3d8\u9d67\u9e9e\ub3cb\ub3ad\u9d67\ub3ae\ub3d2\u9d63\ub3cd\ub3ce\ub3dc\u9d66\u9e9e\ub3cb\ub3c3\u9d7e\ub3c5\u9d63\ub3c8\u9e81\ub3dd\ub3c4\ub3dc\u9d6a\ub3ac\ub3c8\ub3d0\u9d7d\ub3c1\ub3d0\u9d7f\ub3d3\u9d63\u9d64\ub3ae\ub3d1\ub3ac\ub3ae\u9d67\ub3d1\ub3c6\ub3c4\u9d61\u9e83\u9e86\u9d63\u9e80\ub3cb\u9d63\ub3ad\ub3ae\ub3dd\u9d7c\ub3d2\u9e9f\ub3dd\u9d7f\u9e82\u9d7c\ub3c9\u9e89\ub3c8\ub3de\u9e88\ub3c4\ub3d3\u9e83\ub3ad\ub3f1\ub3ad\ub3dc\u9e83\ub3c5\u9d7c\ub3d2\u9d7e\ub3f3\u9e81\u9e86\ub3c4\ub3f8\ub3d0\ub3dc\u9d66\ub3d2\ub3ac\u9e8a\u9e81\ub3c9\ub3dc\ub3cf\ub3c8\ub3ae\ub3c9\u9e81\u9e82\u9e9d\u9d6a\ub3ac\ub3c3\ub3f7\u9e97\u9d6b\u9e8a\u9d6b\ub3c8\ub3df\u9d6a\ub3cb\ub3f7\u9e9e\ub3d0\ub3f8\ub3cf\ub3c0\u9d7e\ub3c6\ub3c0\ub3c5\ub3f2\ub3c5\ub3d2\ub3ce\ub3c0\u9d62\ub3ca\ub3c9\u9e82\ub3dc\u9e82\ub3f2\u9e80\ub3c3\u9e9e\ub3ad\ub3cb\u9e97\ub3ad\ub3df\u9d60\u9e9f\ub3ae\ub3dc\u9d6a\u9e89\u9d6b\u9e9e\u9e9d\ub3cf\ub3c5\ub3c7\u9d7e\u9d65\u9d60\ub3c9\u9e9f\ub3f7\ub3f0\u9d63\u9e88\u9d7e\ub3de\ub3c5\ub3f7\ub3c7\ub3d1\ub3c9\ub3ad\u9e83\ub3d1\ub3ac\u9e9f\ub3dc\ub3ca\ub3c8\ub3cf\u9e88\u9e83\ub3c0\u9d69\ub3ca\u9d61\ub3c7\u9d65\u9d67\ub3f0\u9d7d\ub3cd\ub3cf\u9e81\ub3c1\u9d68\u9d6b\u9e81\u9d64\u9d7e\ub3d3\u9e9e\ub3de\u9e9f\ub3c0\ub3ce\ub3d1\u9e88\ub3c2\ub3c1\u9e86\u9e80\ub3cd\ub3c6\u9d69\u9d7d\u9e81\u9d6a\ub3c8\u9e8a\u9d69\ub3f1\ub3ce\ub3f1\ub3c4\u9e9f\ub3f8\ub3df\u9d67\ub3dc\ub3ca\ub3ce\u9e9f\u9e9d\u9d62\ub3af\ub3cb\ub3f3\ub3df\u9d63\u9d62\ub3f7\u9e89\ub3dd\u9e89\ub3c8\ub3cc\u9e9d\ub3c5\ub3af\ub3cb\ub3ad\u9d68\ub3ac\u9e9c\u9d7e\ub3d3\u9d65\ub3c8\u9d60\ub3d1\u9e86\u9e9e\ub3f8\ub3c5\ub3f7\ub3ae\u9e86\u9e9c\u9d7c\ub3d1\u9e88\u9e9c\ub3f8\ub3c2\u9e88\ub3cf\u9d7e\u9d67\ub3cb\u9d7e\u9e82\ub3d3\ub3c5\ub3af\u9e88\ub3d3\u9e82\ub3ce\ub3af\ub3dc\u9e89\ub3d3\u9d64\ub3c5\ub3cc\ub3ca\ub3d1\u9e8a\ub3cb\ub3c5\u9d66\ub3c2\u9d69\u9e83\u9d7d\ub3dc\ub3f7\u9e86\u9d65\u9e9f\u9d6a\ub3c4\u9d61\u9e9e\u9d69\u9d63\ub3de\ub3f8\ub3c7\u9e81\u9d67\ub3c2\ub3cc\u9e89\u9e97\ub3f8\u9eb4\u9eb4".toCharArray();
            for (int i2 = i[165]; i2 < i[166]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= i[167];
                n5 -= i[168];
                n5 -= i[169];
                n5 -= i[170];
                n5 ^= i[171];
                n5 += i[172];
                n5 += i[173];
                n5 += i[174];
                n5 -= i[175];
                n5 -= i[176];
                n5 -= i[177];
                cArray[i2] = (char)(n5 ^= i[178]);
            }
            object = SoulsModule.A()[SoulsModule.i[179]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)SoulsModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = i[180];
        n6 += i[181];
        l6 = l17 ^ (0x14100000000L ^ l17) & -1L << (n6 += i[182]);
        long l18 = l13;
        int n7 = i[183];
        n7 -= i[184];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= i[185]);
        while (true) {
            int n8 = i[186];
            n8 ^= i[187];
            if ((int)l13 >= (int)(l6 >>> (n8 -= i[188]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = i[189];
            n10 -= i[190];
            int n11 = i[192];
            n11 ^= i[193];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += i[191])) & -1L >>> (n11 ^= i[194]);
            long l20 = l9;
            int n12 = i[195];
            n12 -= i[196];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= i[197]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = i[198];
            n14 ^= i[199];
            int n15 = i[201];
            n15 ^= i[202];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= i[200])) & -1L >>> (n15 += i[203]);
            int n16 = i[204];
            n16 ^= i[205];
            long l22 = l10;
            int n17 = i[207];
            n17 += i[208];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= i[206]) ^ l22) & -1L << (n17 -= i[209]);
            int n18 = i[210];
            n18 -= i[211];
            n18 ^= i[212];
            int n19 = i[213];
            n19 -= i[214];
            long l23 = l12;
            int n20 = i[216];
            n20 -= i[217];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += i[215]))) ^ l23) & -1L >>> (n20 += i[218]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = i[219];
            n21 -= i[220];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= i[221]);
            while (true) {
                int n22 = i[222];
                n22 ^= i[223];
                if ((int)(l14 >>> (n22 -= i[224])) >= (int)l12) break;
                int n23 = i[225];
                n23 += i[226];
                int n24 = i[228];
                n24 += i[229];
                cArray2[(int)(l14 >>> (n23 ^= SoulsModule.i[227]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += i[230]))];
                l14 += 0x100000000L;
            }
            int n25 = i[231];
            n25 ^= i[232];
            int n26 = (int)(l15 >>> (n25 += i[233]));
            l15 += 0x100000000L;
            SoulsModule.F[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = i[234];
            n27 += i[235];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= i[236]);
        }
        INSTANCE = new SoulsModule();
        int n28 = i[237];
        n28 ^= i[238];
        boolean bl = i[240];
        bl ^= i[241];
        d = INSTANCE.cfr_renamed_0((String)F[n28 += i[239]], bl ^= i[242]);
        int n29 = i[243];
        n29 += i[244];
        int n30 = i[246];
        n30 ^= i[247];
        boolean bl2 = i[249];
        bl2 -= i[250];
        D = INSTANCE.cfr_renamed_0((String)F[n29 ^= i[245]] + (String)F[n30 += i[248]], bl2 ^= i[251]);
        e = new ArrayList();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[i[252]];
        String string = (String)object[i[253]];
        object = object[i[254]];
        Object[] objectArray = h;
        if (h == null) {
            objectArray = h = new Object[i[255]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[i[256]];
                g = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[i[258] ^ i[259]];
                byArray[SoulsModule.i[260] ^ SoulsModule.i[261]] = i[262] ^ i[263];
                byArray[SoulsModule.i[264] ^ SoulsModule.i[265]] = i[266] ^ i[267];
                byArray[SoulsModule.i[268] ^ SoulsModule.i[269]] = i[270] ^ i[271];
                byArray[SoulsModule.i[272] ^ SoulsModule.i[273]] = i[274] ^ i[275];
                byArray[SoulsModule.i[276] ^ SoulsModule.i[277]] = i[278] ^ i[279];
                byArray[SoulsModule.i[280] ^ SoulsModule.i[281]] = i[282] ^ i[283];
                byArray[SoulsModule.i[284] ^ SoulsModule.i[285]] = i[286] ^ i[287];
                byArray[SoulsModule.i[288] ^ SoulsModule.i[289]] = i[290] ^ i[291];
                byArray[SoulsModule.i[292] ^ SoulsModule.i[293]] = i[294] ^ i[295];
                byArray[SoulsModule.i[296] ^ SoulsModule.i[297]] = i[298] ^ i[299];
                byArray[SoulsModule.i[300] ^ SoulsModule.i[301]] = i[302] ^ i[303];
                byArray[SoulsModule.i[304] ^ SoulsModule.i[305]] = i[306] ^ i[307];
                byArray[SoulsModule.i[308] ^ SoulsModule.i[309]] = i[310] ^ i[311];
                byArray[SoulsModule.i[312] ^ SoulsModule.i[313]] = i[314] ^ i[315];
                byArray[SoulsModule.i[316] ^ SoulsModule.i[317]] = i[318] ^ i[319];
                byArray[SoulsModule.i[320] ^ SoulsModule.i[321]] = i[322] ^ i[323];
                objectArray2[SoulsModule.i[257]] = byArray;
            }
            byte[] byArray = (byte[])object3[i[324]];
            if (G == null) {
                byte[] byArray2 = new byte[i[325] ^ i[326]];
                byArray2[SoulsModule.i[327] ^ SoulsModule.i[328]] = i[329] ^ i[330];
                byArray2[SoulsModule.i[331] ^ SoulsModule.i[332]] = i[333] ^ i[334];
                byArray2[SoulsModule.i[335] ^ SoulsModule.i[336]] = i[337] ^ i[338];
                byArray2[SoulsModule.i[339] ^ SoulsModule.i[340]] = i[341] ^ i[342];
                byArray2[SoulsModule.i[343] ^ SoulsModule.i[344]] = i[345] ^ i[346];
                byArray2[SoulsModule.i[347] ^ SoulsModule.i[348]] = i[349] ^ i[350];
                byArray2[SoulsModule.i[351] ^ SoulsModule.i[352]] = i[353] ^ i[354];
                byArray2[SoulsModule.i[355] ^ SoulsModule.i[356]] = i[357] ^ i[358];
                byArray2[SoulsModule.i[359] ^ SoulsModule.i[360]] = i[361] ^ i[362];
                byArray2[SoulsModule.i[363] ^ SoulsModule.i[364]] = i[365] ^ i[366];
                byArray2[SoulsModule.i[367] ^ SoulsModule.i[368]] = i[369] ^ i[370];
                byArray2[SoulsModule.i[371] ^ SoulsModule.i[372]] = i[373] ^ i[374];
                byArray2[SoulsModule.i[375] ^ SoulsModule.i[376]] = i[377] ^ i[378];
                byArray2[SoulsModule.i[379] ^ SoulsModule.i[380]] = i[381] ^ i[382];
                byArray2[SoulsModule.i[383] ^ SoulsModule.i[384]] = i[385] ^ i[386];
                byArray2[SoulsModule.i[387] ^ SoulsModule.i[388]] = i[389] ^ i[390];
                byArray2[SoulsModule.i[391] ^ SoulsModule.i[392]] = i[393] ^ i[394];
                byArray2[SoulsModule.i[395] ^ SoulsModule.i[396]] = i[397] ^ i[398];
                byArray2[SoulsModule.i[399] ^ 0x8C71] = 0x8C14 ^ 0x8C71;
                byArray2[0x24F9 ^ 0x24E1] = 0xFFFFDB3E ^ 0x24E1;
                byArray2[0xC6D4 ^ 0xC6D5] = 0xC6B1 ^ 0xC6D5;
                byArray2[0xBCAE ^ 0xBCA5] = 0xFFFF4366 ^ 0xBCA5;
                byArray2[0xA00E ^ 0xA009] = 0xA038 ^ 0xA009;
                byArray2[0x362D ^ 0x3637] = 0x3600 ^ 0x3637;
                byArray2[0xB7D4 ^ 0xB7DC] = 0xB7A3 ^ 0xB7DC;
                byArray2[0x3B5A ^ 0x3B57] = 0x3B7B ^ 0x3B57;
                byArray2[0xB95 ^ 0xB97] = 0xFFFFF40B ^ 0xB97;
                byArray2[0xF209 ^ 0xF20C] = 0xFFFF0D87 ^ 0xF20C;
                byArray2[0xCA90 ^ 0xCA87] = 0xCABB ^ 0xCA87;
                byArray2[0x2C76 ^ 0x2C62] = 0x2C69 ^ 0x2C62;
                byArray2[0xA7CC ^ 0xA7D1] = 0xFFFF587A ^ 0xA7D1;
                byArray2[0xBC75 ^ 0xBC7A] = 0xFFFF43D7 ^ 0xBC7A;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = SoulsModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u6b64\u6b62\u6b6b\u6b60\u6b5e\u6af2\u6b4f\u63bd\u63b0\u63bc\u6b5c\u63c9\u6515\u63c3\u6b53\u6b5c\u6b35\u6b05".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 37840;
                        n3 -= 29298;
                        n3 -= 21794;
                        n3 += 24436;
                        n3 += 132;
                        n3 ^= 0xB896;
                        n3 ^= 0xDD1A;
                        n3 ^= 0x4ABB;
                        n3 ^= 0x539C;
                        n3 += 28892;
                        n3 ^= 0xE2DD;
                        cArray[i2] = (char)(n3 += 39262);
                    }
                    object4 = SoulsModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[14] = -110;
                byArray4[10] = 1;
                byArray4[6] = -105;
                byArray4[2] = 3;
                byArray4[1] = -67;
                byArray4[9] = -9;
                byArray4[5] = -99;
                byArray4[12] = -122;
                byArray4[8] = -5;
                byArray4[13] = -36;
                byArray4[11] = -66;
                byArray4[7] = 46;
                byArray4[3] = -47;
                byArray4[0] = 85;
                byArray4[15] = 60;
                byArray4[4] = -13;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 22, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = SoulsModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u5fc9\u5fcd\u5fa3".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 58179;
                        n4 ^= 0x1EB3;
                        n4 ^= 0x1CA4;
                        n4 ^= 0xA9E4;
                        n4 -= 4245;
                        n4 ^= 0xD816;
                        n4 -= 61975;
                        n4 -= 17770;
                        n4 -= 62554;
                        n4 -= 35243;
                        n4 += 39340;
                        cArray[i3] = (char)(n4 ^= 0x35D);
                    }
                    object5 = SoulsModule.A()[2] = new String(cArray);
                }
                G = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = SoulsModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\uae2a\uafc6\uaf20\uaf84\uae30\uafc9\uae30\uaf84\uaf1b\uaf28\uae30\uaf20\uaf96\uaf1b\uafca\uafe7\uafe7\uafc2\uae3d\uafcc".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0xF8C1;
                    n5 -= 12321;
                    n5 += 26690;
                    n5 -= 15619;
                    n5 -= 25352;
                    n5 ^= 0x5A8C;
                    n5 += 46029;
                    n5 ^= 0x43EF;
                    n5 ^= 0xBFF0;
                    n5 ^= 0x8513;
                    n5 += 18132;
                    n5 += 45848;
                    n5 += 12253;
                    cArray[i4] = (char)(n5 ^= 0x3A5E);
                }
                object6 = SoulsModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)G), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = H;
        if (H == null) {
            H = new Object[4];
            objectArray = H;
        }
        return objectArray;
    }

    public static void b() {
        i = new int[0xCE04 ^ 0xCF94];
        SoulsModule.i[0xF543 ^ 0xF523] = 0xF553 ^ 0xF523;
        SoulsModule.i[0x4A7 ^ 0x5E6] = 0x93CA ^ 0x5E6;
        SoulsModule.i[0xEAA8 ^ 0xEB8C] = 0xC0AF ^ 0xEB8C;
        SoulsModule.i[0xA3C2 ^ 0xA32D] = 0xA33B ^ 0xA32D;
        SoulsModule.i[0xBCFD ^ 0xBCD7] = 0xBC98 ^ 0xBCD7;
        SoulsModule.i[0xFF1C ^ 0xFF17] = 0xFFFF00D1 ^ 0xFF17;
        SoulsModule.i[0x4BC6 ^ 0x4B10] = 0x4B16 ^ 0x4B10;
        SoulsModule.i[0xE99B ^ 0xE8AD] = 0x6AF3 ^ 0xE8AD;
        SoulsModule.i[0xDA16 ^ 0xDB96] = 0x81DF ^ 0xDB96;
        SoulsModule.i[0x5AF7 ^ 0x5AAB] = 0xFFFFA52F ^ 0x5AAB;
        SoulsModule.i[0x6138 ^ 0x6064] = 0x5B17 ^ 0x6064;
        SoulsModule.i[0x2BD3 ^ 0x2BB8] = 0xFFFFD45D ^ 0x2BB8;
        SoulsModule.i[0x1D2A ^ 0x1D38] = 0x1D7A ^ 0x1D38;
        SoulsModule.i[0x9C58 ^ 0x9C8C] = 0x9CA1 ^ 0x9C8C;
        SoulsModule.i[0x9F19 ^ 0x9FDF] = 0x9FDE ^ 0x9FDF;
        SoulsModule.i[0x8FBB ^ 0x8F2C] = 0x8F6E ^ 0x8F2C;
        SoulsModule.i[0x5D83 ^ 0x5CAC] = 0x7D15 ^ 0x5CAC;
        SoulsModule.i[0xFAB1 ^ 0xFAAF] = 0xFA16 ^ 0xFAAF;
        SoulsModule.i[0x59CD ^ 0x597E] = 0x597E ^ 0x597E;
        SoulsModule.i[0xA05F ^ 0xA01B] = 0xA027 ^ 0xA01B;
        SoulsModule.i[0x39CC ^ 0x38DD] = 0x9112 ^ 0x38DD;
        SoulsModule.i[0xC8AA ^ 0xC8C9] = 0xC882 ^ 0xC8C9;
        SoulsModule.i[0x6454 ^ 0x64A1] = 0xFFFF9B45 ^ 0x64A1;
        SoulsModule.i[0xB0A3 ^ 0xB120] = 0x3350 ^ 0xB120;
        SoulsModule.i[0x1AC4 ^ 0x1AC9] = 0x1AB1 ^ 0x1AC9;
        SoulsModule.i[0x712 ^ 0x70F] = 0xFFFFF8A4 ^ 0x70F;
        SoulsModule.i[0x40AF ^ 0x404F] = 0xFFFFBF9F ^ 0x404F;
        SoulsModule.i[0xAD03 ^ 0xAD45] = 0xAD3D ^ 0xAD45;
        SoulsModule.i[0xA989 ^ 0xA8A5] = 0x8914 ^ 0xA8A5;
        SoulsModule.i[0xF566 ^ 0xF524] = 0xF525 ^ 0xF524;
        SoulsModule.i[0x1C4B ^ 0x1C30] = 0xFFFFE3D0 ^ 0x1C30;
        SoulsModule.i[0x14B6 ^ 0x1401] = 0xFFFFEBA7 ^ 0x1401;
        SoulsModule.i[0xC9D ^ 0xCDD] = 0xFFFFF35E ^ 0xCDD;
        SoulsModule.i[0x1296 ^ 0x128A] = 0x12CB ^ 0x128A;
        SoulsModule.i[0x7B9F ^ 0x7B22] = 0xFFFF84C3 ^ 0x7B22;
        SoulsModule.i[0xE61 ^ 0xE71] = 0xFFFFF18A ^ 0xE71;
        SoulsModule.i[0xF8AD ^ 0xF9B2] = 0xA2C2 ^ 0xF9B2;
        SoulsModule.i[0x30A1 ^ 0x3065] = 0x3025 ^ 0x3065;
        SoulsModule.i[0x296B ^ 0x29B7] = 0xFFFFD633 ^ 0x29B7;
        SoulsModule.i[0x6323 ^ 0x6375] = 0x631A ^ 0x6375;
        SoulsModule.i[0x321E ^ 0x3254] = 0xFFFFCDA4 ^ 0x3254;
        SoulsModule.i[0x4212 ^ 0x42E4] = 0xFFFFBD79 ^ 0x42E4;
        SoulsModule.i[0x6852 ^ 0x6870] = 0x682D ^ 0x6870;
        SoulsModule.i[0x70EC ^ 0x71C7] = 0xDBD2 ^ 0x71C7;
        SoulsModule.i[0x6F ^ 0x11D] = 0xBB61 ^ 0x11D;
        SoulsModule.i[0x8BE9 ^ 0x8BC0] = 0xFFFF745B ^ 0x8BC0;
        SoulsModule.i[0xB94A ^ 0xB867] = 0x99DE ^ 0xB867;
        SoulsModule.i[0x5693 ^ 0x56F7] = 0xFFFFA95A ^ 0x56F7;
        SoulsModule.i[0xB1BC ^ 0xB031] = 0xFFFFC7B3 ^ 0xB031;
        SoulsModule.i[0x48E3 ^ 0x48F8] = 0x484E ^ 0x48F8;
        SoulsModule.i[0x983C ^ 0x995D] = 0xC453 ^ 0x995D;
        SoulsModule.i[0xE682 ^ 0xE7F8] = 0x5E2F ^ 0xE7F8;
        SoulsModule.i[0xBFEE ^ 0xBEF2] = 0xE583 ^ 0xBEF2;
        SoulsModule.i[0xD846 ^ 0xD86B] = 0xD856 ^ 0xD86B;
        SoulsModule.i[0xECA4 ^ 0xECDC] = 0xFFFF1334 ^ 0xECDC;
        SoulsModule.i[0xF0FA ^ 0xF1C1] = 0xF7DD ^ 0xF1C1;
        SoulsModule.i[0xC6D1 ^ 0xC7AC] = 0xFFFF9597 ^ 0xC7AC;
        SoulsModule.i[0x802 ^ 0x86E] = 0xFFFFF7AC ^ 0x86E;
        SoulsModule.i[0x30DD ^ 0x3063] = 0xFFFFCFCA ^ 0x3063;
        SoulsModule.i[0xD905 ^ 0xD9FD] = 0xFFFF264A ^ 0xD9FD;
        SoulsModule.i[0xFD1F ^ 0xFD56] = 0xFFFF02E0 ^ 0xFD56;
        SoulsModule.i[0xB714 ^ 0xB716] = 0xFFFF48C4 ^ 0xB716;
        SoulsModule.i[0xE5D0 ^ 0xE488] = 0xDD80 ^ 0xE488;
        SoulsModule.i[0x13A ^ 0x16A] = 0xFFFFFE9C ^ 0x16A;
        SoulsModule.i[0x24C ^ 0x365] = 0xA970 ^ 0x365;
        SoulsModule.i[0x50FF ^ 0x50CF] = 0xFFFFAF67 ^ 0x50CF;
        SoulsModule.i[0x1FE6 ^ 0x1F95] = 0x1F9F ^ 0x1F95;
        SoulsModule.i[0xFCFA ^ 0xFC35] = 0xFC36 ^ 0xFC35;
        SoulsModule.i[0x77B0 ^ 0x76F0] = 0xE0D7 ^ 0x76F0;
        SoulsModule.i[0x10768 ^ 0x1070A] = 0x10707 ^ 0x1070A;
        SoulsModule.i[0x10E11 ^ 0x10EF0] = 0xFFFEF191 ^ 0x10EF0;
        SoulsModule.i[0xD4D8 ^ 0xD5D2] = 0xFFFF375F ^ 0xD5D2;
        SoulsModule.i[0xC048 ^ 0xC1CE] = 0x43B4 ^ 0xC1CE;
        SoulsModule.i[0x6E9E ^ 0x6E9F] = 0xFFFF9101 ^ 0x6E9F;
        SoulsModule.i[0x1080C ^ 0x10942] = 0x15E29 ^ 0x10942;
        SoulsModule.i[0x2315 ^ 0x2294] = 0xFFFF876C ^ 0x2294;
        SoulsModule.i[0x4C28 ^ 0x4CB8] = 0x4CDE ^ 0x4CB8;
        SoulsModule.i[0xA97A ^ 0xA92E] = 0xA904 ^ 0xA92E;
        SoulsModule.i[0x4C10 ^ 0x4CDE] = 0x4CD3 ^ 0x4CDE;
        SoulsModule.i[0xD0D3 ^ 0xD1FB] = 0x7BE9 ^ 0xD1FB;
        SoulsModule.i[0x7C2D ^ 0x7D7C] = 0xFFFF500A ^ 0x7D7C;
        SoulsModule.i[0x9906 ^ 0x99BF] = 0xFFFF663B ^ 0x99BF;
        SoulsModule.i[0xB2A0 ^ 0xB2DC] = 0xB2F3 ^ 0xB2DC;
        SoulsModule.i[0xB68D ^ 0xB638] = 0xFFFF49F2 ^ 0xB638;
        SoulsModule.i[0x5119 ^ 0x5091] = 0x45F3 ^ 0x5091;
        SoulsModule.i[0x1037A ^ 0x10376] = 0x1035A ^ 0x10376;
        SoulsModule.i[0x9259 ^ 0x932C] = 0xB5E0 ^ 0x932C;
        SoulsModule.i[0x49F0 ^ 0x48B6] = 0x6E0B ^ 0x48B6;
        SoulsModule.i[0x5109 ^ 0x5132] = 0x516B ^ 0x5132;
        SoulsModule.i[0x6A26 ^ 0x6A4E] = 0x6A35 ^ 0x6A4E;
        SoulsModule.i[0xE062 ^ 0xE0A7] = 0xFFFF1F7A ^ 0xE0A7;
        SoulsModule.i[0xA6B8 ^ 0xA619] = 0xA618 ^ 0xA619;
        SoulsModule.i[0x9044 ^ 0x910F] = 0xC668 ^ 0x910F;
        SoulsModule.i[0xF3B ^ 0xF17] = 0xF08 ^ 0xF17;
        SoulsModule.i[0xE01C ^ 0xE009] = 0xFFFF1FCB ^ 0xE009;
        SoulsModule.i[0xDD2E ^ 0xDC59] = 0x659E ^ 0xDC59;
        SoulsModule.i[0x5EBE ^ 0x5F83] = 0x2585 ^ 0x5F83;
        SoulsModule.i[0x25A1 ^ 0x24B8] = 0xD27B ^ 0x24B8;
        SoulsModule.i[0x1CFF ^ 0x1D9B] = 0xA6AD ^ 0x1D9B;
        SoulsModule.i[0x10076 ^ 0x100E3] = 0x10098 ^ 0x100E3;
        SoulsModule.i[0x760F ^ 0x771D] = 0xFFFF2171 ^ 0x771D;
        SoulsModule.i[0x3ED1 ^ 0x3FC9] = 0xC900 ^ 0x3FC9;
        SoulsModule.i[0x8F27 ^ 0x8F2F] = 0xFFFF70C7 ^ 0x8F2F;
        SoulsModule.i[0x29B5 ^ 0x28B3] = 0xFFFF9071 ^ 0x28B3;
        SoulsModule.i[0xD9C2 ^ 0xD8E7] = 0xF3CB ^ 0xD8E7;
        SoulsModule.i[0xD04A ^ 0xD144] = 0x4ADF ^ 0xD144;
        SoulsModule.i[0xB6B2 ^ 0xB62E] = 0xB645 ^ 0xB62E;
        SoulsModule.i[0x9E19 ^ 0x9F26] = 0xE520 ^ 0x9F26;
        SoulsModule.i[0xC6F4 ^ 0xC7D5] = 0xA4F8 ^ 0xC7D5;
        SoulsModule.i[0x606D ^ 0x608F] = 0x60BB ^ 0x608F;
        SoulsModule.i[0x4816 ^ 0x48FC] = 0x48E4 ^ 0x48FC;
        SoulsModule.i[0xEA6A ^ 0xEB19] = 0xCD8E ^ 0xEB19;
        SoulsModule.i[0x10CC1 ^ 0x10DDB] = 0xFFFE04E2 ^ 0x10DDB;
        SoulsModule.i[0x69BF ^ 0x6964] = 0xFFFF9697 ^ 0x6964;
        SoulsModule.i[0xAB27 ^ 0xABEE] = 0xAB3B ^ 0xABEE;
        SoulsModule.i[0x1D0D ^ 0x1D43] = 0xFFFFE2CA ^ 0x1D43;
        SoulsModule.i[0x90B4 ^ 0x90CB] = 0x908D ^ 0x90CB;
        SoulsModule.i[0x2333 ^ 0x23D7] = 0x23E0 ^ 0x23D7;
        SoulsModule.i[0xCD12 ^ 0xCDCD] = 0xCDF9 ^ 0xCDCD;
        SoulsModule.i[0x1352 ^ 0x1261] = 0x7905 ^ 0x1261;
        SoulsModule.i[0xA832 ^ 0xA844] = 0xA843 ^ 0xA844;
        SoulsModule.i[0x7517 ^ 0x745B] = 0x2330 ^ 0x745B;
        SoulsModule.i[0xE64 ^ 0xEF2] = 0xFFFFF12A ^ 0xEF2;
        SoulsModule.i[0x339A ^ 0x32A2] = 0x34BA ^ 0x32A2;
        SoulsModule.i[0x107FB ^ 0x10707] = 0x10706 ^ 0x10707;
        SoulsModule.i[0x47E8 ^ 0x4718] = 0x473B ^ 0x4718;
        SoulsModule.i[0x15B1 ^ 0x15E3] = 0x1591 ^ 0x15E3;
        SoulsModule.i[0xC7E7 ^ 0xC6C1] = 0xEDA5 ^ 0xC6C1;
        SoulsModule.i[0xAC9F ^ 0xAD92] = 0x3638 ^ 0xAD92;
        SoulsModule.i[0xA2A2 ^ 0xA395] = 0x21D0 ^ 0xA395;
        SoulsModule.i[0x5331 ^ 0x521F] = 0xFFFF8C60 ^ 0x521F;
        SoulsModule.i[0x2AF9 ^ 0x2A76] = 0xFFFFD5B0 ^ 0x2A76;
        SoulsModule.i[0xC0D5 ^ 0xC1AD] = 0x787A ^ 0xC1AD;
        SoulsModule.i[0x55CE ^ 0x55A9] = 0xFFFFAA53 ^ 0x55A9;
        SoulsModule.i[0xF3B1 ^ 0xF238] = 0xFFFF18A7 ^ 0xF238;
        SoulsModule.i[0xAAD ^ 0xBF0] = 0xFFFFCF35 ^ 0xBF0;
        SoulsModule.i[0x6414 ^ 0x6579] = 0x305A ^ 0x6579;
        SoulsModule.i[0x4F26 ^ 0x4E48] = 0x1B71 ^ 0x4E48;
        SoulsModule.i[0x3016 ^ 0x311A] = 0xAAB6 ^ 0x311A;
        SoulsModule.i[0xF0D6 ^ 0xF1AF] = 0xFFFFB79F ^ 0xF1AF;
        SoulsModule.i[0x38B4 ^ 0x3808] = 0x3816 ^ 0x3808;
        SoulsModule.i[0x24F7 ^ 0x25FE] = 0x38DC ^ 0x25FE;
        SoulsModule.i[0x5457 ^ 0x54BF] = 0xFFFFAB26 ^ 0x54BF;
        SoulsModule.i[0xD435 ^ 0xD493] = 0xD68B ^ 0xD493;
        SoulsModule.i[0x2BF4 ^ 0x2A9E] = 0x1E11 ^ 0x2A9E;
        SoulsModule.i[0x53B9 ^ 0x539D] = 0xFFFFAC0B ^ 0x539D;
        SoulsModule.i[0xDD59 ^ 0xDC2F] = 0xFAAD ^ 0xDC2F;
        SoulsModule.i[0x587D ^ 0x58A4] = 0xFFFFA77C ^ 0x58A4;
        SoulsModule.i[0xDF37 ^ 0xDF6C] = 0xDF08 ^ 0xDF6C;
        SoulsModule.i[0x129B ^ 0x127E] = 0xFFFFED88 ^ 0x127E;
        SoulsModule.i[0x31D3 ^ 0x315D] = 0x311B ^ 0x315D;
        SoulsModule.i[0x163A ^ 0x1760] = 0x2E68 ^ 0x1760;
        SoulsModule.i[0x561C ^ 0x5688] = 0x56A2 ^ 0x5688;
        SoulsModule.i[0x9203 ^ 0x92D6] = 0xFFFF6D6E ^ 0x92D6;
        SoulsModule.i[0x51E2 ^ 0x51C1] = 0x51AF ^ 0x51C1;
        SoulsModule.i[0x2594 ^ 0x2587] = 0x25BF ^ 0x2587;
        SoulsModule.i[0x6C97 ^ 0x6CBF] = 0xFFFF9343 ^ 0x6CBF;
        SoulsModule.i[0xDAD2 ^ 0xDA97] = 0xFFFF2589 ^ 0xDA97;
        SoulsModule.i[0x17EA ^ 0x168C] = 0xADBA ^ 0x168C;
        SoulsModule.i[0xAAE1 ^ 0xAA7C] = 0xAA38 ^ 0xAA7C;
        SoulsModule.i[0xCE0 ^ 0xCC0] = 0xCEF ^ 0xCC0;
        SoulsModule.i[0x507D ^ 0x50B7] = 0x50FF ^ 0x50B7;
        SoulsModule.i[0x5832 ^ 0x58A8] = 0x588B ^ 0x58A8;
        SoulsModule.i[0x886E ^ 0x886B] = 0xFFFF77D3 ^ 0x886B;
        SoulsModule.i[0x100FF ^ 0x101BD] = 0x197CC ^ 0x101BD;
        SoulsModule.i[0x488D ^ 0x49E6] = 0x1CC3 ^ 0x49E6;
        SoulsModule.i[0xC54B ^ 0xC408] = 0x5224 ^ 0xC408;
        SoulsModule.i[0xB367 ^ 0xB394] = 0xFFFF4C35 ^ 0xB394;
        SoulsModule.i[0x7D34 ^ 0x7DA6] = 0xFFFF825A ^ 0x7DA6;
        SoulsModule.i[0xB981 ^ 0xB8D3] = 0x6A2B ^ 0xB8D3;
        SoulsModule.i[0xC8BF ^ 0xC821] = 0xC82E ^ 0xC821;
        SoulsModule.i[0x10E84 ^ 0x10E63] = 0x10E4B ^ 0x10E63;
        SoulsModule.i[0xD09F ^ 0xD1BC] = 0xB291 ^ 0xD1BC;
        SoulsModule.i[0x68DB ^ 0x682F] = 0x6868 ^ 0x682F;
        SoulsModule.i[0xCD0B ^ 0xCD5C] = 0xFFFF3281 ^ 0xCD5C;
        SoulsModule.i[0xF82B ^ 0xF80D] = 0xF824 ^ 0xF80D;
        SoulsModule.i[0x4884 ^ 0x4835] = 0x6CF8 ^ 0x4835;
        SoulsModule.i[0x9D33 ^ 0x9D85] = 0xFFFF625C ^ 0x9D85;
        SoulsModule.i[0x4789 ^ 0x4796] = 0xFFFFB800 ^ 0x4796;
        SoulsModule.i[0xB7B6 ^ 0xB702] = 0xB77F ^ 0xB702;
        SoulsModule.i[0xDC3F ^ 0xDD0D] = 0xB617 ^ 0xDD0D;
        SoulsModule.i[0xB4CC ^ 0xB4DB] = 0xFFFF4B68 ^ 0xB4DB;
        SoulsModule.i[0x7351 ^ 0x7328] = 0xFFFF8CE7 ^ 0x7328;
        SoulsModule.i[0x25F4 ^ 0x2478] = 0xAC7E ^ 0x2478;
        SoulsModule.i[0x36F7 ^ 0x3611] = 0xFFFFC9E2 ^ 0x3611;
        SoulsModule.i[0x24A3 ^ 0x241C] = 0xFFFFDBD5 ^ 0x241C;
        SoulsModule.i[0x350D ^ 0x3437] = 0x3211 ^ 0x3437;
        SoulsModule.i[0x488F ^ 0x49C8] = 0xC468 ^ 0x49C8;
        SoulsModule.i[0xD39C ^ 0xD3A3] = 0xD39D ^ 0xD3A3;
        SoulsModule.i[0x2C54 ^ 0x2D7E] = 0xFFFF788E ^ 0x2D7E;
        SoulsModule.i[0x405 ^ 0x541] = 0x541 ^ 0x541;
        SoulsModule.i[0xDC6A ^ 0xDD2F] = 0xFBB2 ^ 0xDD2F;
        SoulsModule.i[0x64BF ^ 0x6405] = 0x6417 ^ 0x6405;
        SoulsModule.i[0x37D7 ^ 0x37A3] = 0xFFFFC820 ^ 0x37A3;
        SoulsModule.i[0x27F3 ^ 0x26EE] = 0x7D9E ^ 0x26EE;
        SoulsModule.i[0x9DC2 ^ 0x9C9C] = 0xA7EF ^ 0x9C9C;
        SoulsModule.i[0xF6B7 ^ 0xF667] = 0xF656 ^ 0xF667;
        SoulsModule.i[0x9BDF ^ 0x9B82] = 0x9B12 ^ 0x9B82;
        SoulsModule.i[0xB1FD ^ 0xB1F2] = 0xB1AA ^ 0xB1F2;
        SoulsModule.i[0x4982 ^ 0x4942] = 0x4930 ^ 0x4942;
        SoulsModule.i[0x2542 ^ 0x256D] = 0x256A ^ 0x256D;
        SoulsModule.i[0xC7EC ^ 0xC668] = 0x4412 ^ 0xC668;
        SoulsModule.i[0xE977 ^ 0xE9D9] = 0x3030 ^ 0xE9D9;
        SoulsModule.i[0x27E9 ^ 0x27B3] = 0x27AB ^ 0x27B3;
        SoulsModule.i[0x2386 ^ 0x22F8] = 0x8F0C ^ 0x22F8;
        SoulsModule.i[0x7E79 ^ 0x7F19] = 0x223E ^ 0x7F19;
        SoulsModule.i[0x8FFC ^ 0x8FA3] = 0xFFFF7005 ^ 0x8FA3;
        SoulsModule.i[0x9EF1 ^ 0x9FC8] = 0x99D4 ^ 0x9FC8;
        SoulsModule.i[0xF1F8 ^ 0xF150] = 0xDF54 ^ 0xF150;
        SoulsModule.i[0xF396 ^ 0xF3DD] = 0xFFFF0C08 ^ 0xF3DD;
        SoulsModule.i[0x610B ^ 0x6176] = 0x6179 ^ 0x6176;
        SoulsModule.i[0xD3DB ^ 0xD3D1] = 0xFFFF2C6D ^ 0xD3D1;
        SoulsModule.i[0x209B ^ 0x20AD] = 0xFFFFDF7E ^ 0x20AD;
        SoulsModule.i[0x3275 ^ 0x33F7] = 0x69BE ^ 0x33F7;
        SoulsModule.i[0x71F8 ^ 0x70A8] = 0xA250 ^ 0x70A8;
        SoulsModule.i[0xB8A0 ^ 0xB827] = 0xB8FC ^ 0xB827;
        SoulsModule.i[0xD627 ^ 0xD63E] = 0xD65E ^ 0xD63E;
        SoulsModule.i[0x2549 ^ 0x25BE] = 0xFFFFDA75 ^ 0x25BE;
        SoulsModule.i[0x9ED4 ^ 0x9EFA] = 0x9EDE ^ 0x9EFA;
        SoulsModule.i[0x5360 ^ 0x5235] = 0xFFFFAEFE ^ 0x5235;
        SoulsModule.i[0x3103 ^ 0x3124] = 0x3157 ^ 0x3124;
        SoulsModule.i[0xC867 ^ 0xC8CB] = 0xD86D ^ 0xC8CB;
        SoulsModule.i[0xEDD4 ^ 0xED3F] = 0xFFFF12C6 ^ 0xED3F;
        SoulsModule.i[0xEDFD ^ 0xED23] = 0xFFFF12E7 ^ 0xED23;
        SoulsModule.i[0xF3CE ^ 0xF309] = 0xFFFF0CCC ^ 0xF309;
        SoulsModule.i[0x3DF ^ 0x2B3] = 0x578A ^ 0x2B3;
        SoulsModule.i[0xD879 ^ 0xD94C] = 0x5B09 ^ 0xD94C;
        SoulsModule.i[0x59AD ^ 0x599A] = 0xFFFFA672 ^ 0x599A;
        SoulsModule.i[0x36F7 ^ 0x36A9] = 0x369F ^ 0x36A9;
        SoulsModule.i[0x4B8D ^ 0x4AE8] = 0xF1D5 ^ 0x4AE8;
        SoulsModule.i[0xCF4C ^ 0xCFC9] = 0xCFEF ^ 0xCFC9;
        SoulsModule.i[0xC54C ^ 0xC5C1] = 0xC5D8 ^ 0xC5C1;
        SoulsModule.i[0xC5D8 ^ 0xC5E4] = 0xF0C504 ^ 0xC5E4;
        SoulsModule.i[0xAD89 ^ 0xACDF] = 0xAFA9 ^ 0xACDF;
        SoulsModule.i[0x8C78 ^ 0x8D7B] = 0x5A91 ^ 0x8D7B;
        SoulsModule.i[0x1446 ^ 0x1457] = 0x1412 ^ 0x1457;
        SoulsModule.i[0x7AD6 ^ 0x7A35] = 0xFFFF8580 ^ 0x7A35;
        SoulsModule.i[0x55AC ^ 0x54BC] = 0xFD71 ^ 0x54BC;
        SoulsModule.i[0xA65F ^ 0xA62D] = 0xFFFF59A4 ^ 0xA62D;
        SoulsModule.i[0xCFCF ^ 0xCFAA] = 0xFFFF3052 ^ 0xCFAA;
        SoulsModule.i[0x48F7 ^ 0x480E] = 0xFFFFB78E ^ 0x480E;
        SoulsModule.i[0xF255 ^ 0xF30A] = 0xAE29 ^ 0xF30A;
        SoulsModule.i[0x91A4 ^ 0x90EB] = 0x421D ^ 0x90EB;
        SoulsModule.i[0x1B1D ^ 0x1BBD] = 0x1BBD ^ 0x1BBD;
        SoulsModule.i[0x3872 ^ 0x3977] = 0x7E3D ^ 0x3977;
        SoulsModule.i[0x811A ^ 0x81B1] = 0xF704 ^ 0x81B1;
        SoulsModule.i[0xAAA5 ^ 0xAB91] = 0x29D4 ^ 0xAB91;
        SoulsModule.i[0x3ACB ^ 0x3BD8] = 0x9217 ^ 0x3BD8;
        SoulsModule.i[0x202B ^ 0x20A8] = 0x2096 ^ 0x20A8;
        SoulsModule.i[0x1876 ^ 0x19F8] = 0x91FE ^ 0x19F8;
        SoulsModule.i[0x5373 ^ 0x538E] = 0x538C ^ 0x538E;
        SoulsModule.i[0x6300 ^ 0x63C8] = 0xFFFF9C0B ^ 0x63C8;
        SoulsModule.i[0x748A ^ 0x75D9] = 0x76B0 ^ 0x75D9;
        SoulsModule.i[0x2FC1 ^ 0x2F64] = 0x2F64 ^ 0x2F64;
        SoulsModule.i[0x5F9D ^ 0x5F1D] = 0x5F6A ^ 0x5F1D;
        SoulsModule.i[0xB564 ^ 0xB5D4] = 0x8ADF ^ 0xB5D4;
        SoulsModule.i[0xB861 ^ 0xB8B3] = 0xB88F ^ 0xB8B3;
        SoulsModule.i[0xA560 ^ 0xA51E] = 0xFFFF5ACA ^ 0xA51E;
        SoulsModule.i[0x763 ^ 0x76A] = 0x713 ^ 0x76A;
        SoulsModule.i[0x3EEC ^ 0x3E99] = 0xFFFFC128 ^ 0x3E99;
        SoulsModule.i[0x8CC1 ^ 0x8CF8] = 0x8CD4 ^ 0x8CF8;
        SoulsModule.i[0x1F4C ^ 0x1F94] = 0x1FD7 ^ 0x1F94;
        SoulsModule.i[0x7C0E ^ 0x7C18] = 0x7C69 ^ 0x7C18;
        SoulsModule.i[0x9DA4 ^ 0x9D3B] = 0x9D38 ^ 0x9D3B;
        SoulsModule.i[0x9264 ^ 0x92E5] = 0x92FF ^ 0x92E5;
        SoulsModule.i[0x8A92 ^ 0x8A14] = 0xFFFF75D6 ^ 0x8A14;
        SoulsModule.i[0xCFA1 ^ 0xCEC9] = 0xFA46 ^ 0xCEC9;
        SoulsModule.i[0x7A2D ^ 0x7A19] = 0x7A60 ^ 0x7A19;
        SoulsModule.i[0xCE01 ^ 0xCF70] = 0xFFFF8AE6 ^ 0xCF70;
        SoulsModule.i[0x9146 ^ 0x91BC] = 0xFFFF6E46 ^ 0x91BC;
        SoulsModule.i[0xB59 ^ 0xAD6] = 0x86A7 ^ 0xAD6;
        SoulsModule.i[0xA2C4 ^ 0xA2EF] = 0xFFFF5D28 ^ 0xA2EF;
        SoulsModule.i[0xF79D ^ 0xF715] = 0xF770 ^ 0xF715;
        SoulsModule.i[0x6C47 ^ 0x6C96] = 0x6C82 ^ 0x6C96;
        SoulsModule.i[0xF73F ^ 0xF702] = 0xFFFF08BB ^ 0xF702;
        SoulsModule.i[0xC456 ^ 0xC450] = 0xFFFF3BD2 ^ 0xC450;
        SoulsModule.i[0x1DF7 ^ 0x1DB0] = 0x1DC9 ^ 0x1DB0;
        SoulsModule.i[0x10369 ^ 0x10321] = 0x1031B ^ 0x10321;
        SoulsModule.i[0xFFE0 ^ 0xFEE1] = 0xFEE1 ^ 0xFEE1;
        SoulsModule.i[0x4AEF ^ 0x4BDE] = 0x20BA ^ 0x4BDE;
        SoulsModule.i[0xAB3D ^ 0xABB1] = 0xFFFF5449 ^ 0xABB1;
        SoulsModule.i[0xC682 ^ 0xC6EB] = 0xFFFF3932 ^ 0xC6EB;
        SoulsModule.i[0x67CB ^ 0x67CC] = 0x67BA ^ 0x67CC;
        SoulsModule.i[0x3CF1 ^ 0x3C18] = 0x3C77 ^ 0x3C18;
        SoulsModule.i[0x1892 ^ 0x187E] = 0xFFFFE78F ^ 0x187E;
        SoulsModule.i[0xF742 ^ 0xF732] = 0xFFFF08E4 ^ 0xF732;
        SoulsModule.i[0xFCD3 ^ 0xFC5A] = 0xFC31 ^ 0xFC5A;
        SoulsModule.i[0xF72E ^ 0xF7D5] = 0xFFFF0852 ^ 0xF7D5;
        SoulsModule.i[0xFE24 ^ 0xFE96] = 0xDB89 ^ 0xFE96;
        SoulsModule.i[0x5329 ^ 0x530C] = 0xFFFFACA0 ^ 0x530C;
        SoulsModule.i[0x8513 ^ 0x852D] = 0x851A ^ 0x852D;
        SoulsModule.i[0x105C2 ^ 0x10530] = 0x1055A ^ 0x10530;
        SoulsModule.i[0xC531 ^ 0xC413] = 0xFFFF58DD ^ 0xC413;
        SoulsModule.i[0xFC33 ^ 0xFCA0] = 0xFFFF0310 ^ 0xFCA0;
        SoulsModule.i[0x7898 ^ 0x789C] = 0x78ED ^ 0x789C;
        SoulsModule.i[0x2B0A ^ 0x2B46] = 0xFFFFD4FC ^ 0x2B46;
        SoulsModule.i[0xC80F ^ 0xC8CC] = 0xC8F1 ^ 0xC8CC;
        SoulsModule.i[0x280D ^ 0x2959] = 0x2A2F ^ 0x2959;
        SoulsModule.i[0x81B7 ^ 0x8176] = 0xFFFF7EA8 ^ 0x8176;
        SoulsModule.i[0x2586 ^ 0x25E8] = 0xFFFFDA39 ^ 0x25E8;
        SoulsModule.i[0x5BD4 ^ 0x5B7D] = 0xCC19 ^ 0x5B7D;
        SoulsModule.i[0x32A5 ^ 0x32BD] = 0x32CB ^ 0x32BD;
        SoulsModule.i[0xCC4F ^ 0xCC92] = 0xCCDD ^ 0xCC92;
        SoulsModule.i[0x10E5E ^ 0x10F25] = 0x1A2CF ^ 0x10F25;
        SoulsModule.i[0x98EA ^ 0x98A9] = 0xFFFF674C ^ 0x98A9;
        SoulsModule.i[0x1671 ^ 0x1741] = 0x7C20 ^ 0x1741;
        SoulsModule.i[0x7089 ^ 0x71E6] = 0xCB93 ^ 0x71E6;
        SoulsModule.i[0xABA ^ 0xBD8] = 0x56FF ^ 0xBD8;
        SoulsModule.i[0x10129 ^ 0x10168] = 0xFFFEFE89 ^ 0x10168;
        SoulsModule.i[0x100BF ^ 0x1008C] = 0xFFFEFF4E ^ 0x1008C;
        SoulsModule.i[0xB4F3 ^ 0xB45C] = 0xAE35 ^ 0xB45C;
        SoulsModule.i[0x55D3 ^ 0x55E6] = 0xFFFFAA23 ^ 0x55E6;
        SoulsModule.i[0x89DA ^ 0x88C4] = 0xD3E3 ^ 0x88C4;
        SoulsModule.i[0xE112 ^ 0xE123] = 0xE179 ^ 0xE123;
        SoulsModule.i[0x7221 ^ 0x724E] = 0x726D ^ 0x724E;
        SoulsModule.i[0xBB56 ^ 0xBB55] = 0xBB7E ^ 0xBB55;
        SoulsModule.i[0xE2A2 ^ 0xE23A] = 0xFFFF1DAC ^ 0xE23A;
        SoulsModule.i[0x9BC1 ^ 0x9BCF] = 0xFFFF646A ^ 0x9BCF;
        SoulsModule.i[0x637E ^ 0x63A4] = 0xFFFF9C11 ^ 0x63A4;
        SoulsModule.i[0x9B95 ^ 0x9AF6] = 0x21DB ^ 0x9AF6;
        SoulsModule.i[0xF2D1 ^ 0xF29E] = 0xF2EB ^ 0xF29E;
        SoulsModule.i[0xBF6D ^ 0xBE19] = 0x989B ^ 0xBE19;
        SoulsModule.i[0xF696 ^ 0xF654] = 0xFFFF09D8 ^ 0xF654;
        SoulsModule.i[0xB8E2 ^ 0xB848] = 0xFB0C ^ 0xB848;
        SoulsModule.i[0x7FF5 ^ 0x7F94] = 0xFFFF8009 ^ 0x7F94;
        SoulsModule.i[0xB2F2 ^ 0xB251] = 0xB253 ^ 0xB251;
        SoulsModule.i[0x10500 ^ 0x10469] = 0xFFFECF59 ^ 0x10469;
        SoulsModule.i[0xD0A6 ^ 0xD0D7] = 0xD0DB ^ 0xD0D7;
        SoulsModule.i[0xC5BA ^ 0xC5D0] = 0xFFFF3A6E ^ 0xC5D0;
        SoulsModule.i[0x9EA8 ^ 0x9FE2] = 0x1253 ^ 0x9FE2;
        SoulsModule.i[0xAB88 ^ 0xAB65] = 0xAB5A ^ 0xAB65;
        SoulsModule.i[0x8F80 ^ 0x8E87] = 0xC9CD ^ 0x8E87;
        SoulsModule.i[0xEAF8 ^ 0xEA5F] = 0x16CE ^ 0xEA5F;
        SoulsModule.i[0x1492 ^ 0x14FF] = 0x14EF ^ 0x14FF;
        SoulsModule.i[0x81A9 ^ 0x8193] = 0xFFFF7E14 ^ 0x8193;
        SoulsModule.i[0x572A ^ 0x57A8] = 0xFFFFA84A ^ 0x57A8;
        SoulsModule.i[0xF907 ^ 0xF9F9] = 0xF9F9 ^ 0xF9F9;
        SoulsModule.i[0xEF50 ^ 0xEE4B] = 0x1888 ^ 0xEE4B;
        SoulsModule.i[0x224A ^ 0x2303] = 0xAEC6 ^ 0x2303;
        SoulsModule.i[0xAE86 ^ 0xAFDD] = 0x94B8 ^ 0xAFDD;
        SoulsModule.i[0xA56E ^ 0xA57A] = 0xA503 ^ 0xA57A;
        SoulsModule.i[0x2297 ^ 0x2310] = 0x3671 ^ 0x2310;
        SoulsModule.i[0x9767 ^ 0x966C] = 0x8B4E ^ 0x966C;
        SoulsModule.i[0xC381 ^ 0xC30A] = 0xFFFF3C80 ^ 0xC30A;
        SoulsModule.i[0x9888 ^ 0x98D0] = 0x98AD ^ 0x98D0;
        SoulsModule.i[0x4E2D ^ 0x4EE6] = 0xFFFFB165 ^ 0x4EE6;
        SoulsModule.i[0x72C1 ^ 0x7216] = 0x7278 ^ 0x7216;
        SoulsModule.i[0x1BB0 ^ 0x1A3B] = 0x922F ^ 0x1A3B;
        SoulsModule.i[0xAFE0 ^ 0xAFFA] = 0xAFF0 ^ 0xAFFA;
        SoulsModule.i[0x42C1 ^ 0x43C1] = 0x43C0 ^ 0x43C1;
        SoulsModule.i[0xDC8 ^ 0xC85] = 0xFFFFA473 ^ 0xC85;
        SoulsModule.i[0x2EDC ^ 0x2FFB] = 0x4D7 ^ 0x2FFB;
        SoulsModule.i[0xC929 ^ 0xC95E] = 0xFFFF36E8 ^ 0xC95E;
        SoulsModule.i[0xA6AB ^ 0xA699] = 0xA6B7 ^ 0xA699;
        SoulsModule.i[0xE7B1 ^ 0xE6E8] = 0xDFC8 ^ 0xE6E8;
        SoulsModule.i[0x7F93 ^ 0x7E19] = 0x6B7B ^ 0x7E19;
        SoulsModule.i[0xE15F ^ 0xE106] = 0xFFFF1EA6 ^ 0xE106;
        SoulsModule.i[0xC74A ^ 0xC674] = 0xFFFF4383 ^ 0xC674;
        SoulsModule.i[0x464C ^ 0x46D5] = 0x46F8 ^ 0x46D5;
        SoulsModule.i[0xA17D ^ 0xA068] = 0xA46D ^ 0xA068;
        SoulsModule.i[0x8DD4 ^ 0x8DB2] = 0x8D33 ^ 0x8DB2;
        SoulsModule.i[0x10BDF ^ 0x10B92] = 0x10BFD ^ 0x10B92;
        SoulsModule.i[0xA7A7 ^ 0xA6A8] = 0x3D02 ^ 0xA6A8;
        SoulsModule.i[0xCEFF ^ 0xCE85] = 0xFFFF3132 ^ 0xCE85;
        SoulsModule.i[0x7EBD ^ 0x7F81] = 0x58A ^ 0x7F81;
        SoulsModule.i[0x8C71 ^ 0x8CCA] = 0x8CE6 ^ 0x8CCA;
        SoulsModule.i[0x3D7F ^ 0x3C18] = 0x891 ^ 0x3C18;
        SoulsModule.i[0x1FFF ^ 0x1E7A] = 0xFFFF639F ^ 0x1E7A;
        SoulsModule.i[0x8AD3 ^ 0x8BAF] = 0x265B ^ 0x8BAF;
        SoulsModule.i[0xF86D ^ 0xF979] = 0xFD75 ^ 0xF979;
        SoulsModule.i[0x9312 ^ 0x9333] = 0x9398 ^ 0x9333;
        SoulsModule.i[0x7AF5 ^ 0x7A38] = 0x7A50 ^ 0x7A38;
        SoulsModule.i[0x73EF ^ 0x73BC] = 0x73F7 ^ 0x73BC;
        SoulsModule.i[0xDF0C ^ 0xDE1B] = 0xDA1E ^ 0xDE1B;
        SoulsModule.i[0xFDD2 ^ 0xFCD0] = 0x2B2A ^ 0xFCD0;
        SoulsModule.i[0x3CD8 ^ 0x3C0B] = 0xFFFFC3F4 ^ 0x3C0B;
        SoulsModule.i[0x26 ^ 0xC8] = 0xFFFFFF05 ^ 0xC8;
        SoulsModule.i[0x9C81 ^ 0x9D89] = 0x80A7 ^ 0x9D89;
        SoulsModule.i[0xF34B ^ 0xF3F3] = 0xF3F1 ^ 0xF3F3;
        SoulsModule.i[0x1B54 ^ 0x1BAB] = 0x1BAA ^ 0x1BAB;
        SoulsModule.i[0x4B84 ^ 0x4AA4] = 0x298A ^ 0x4AA4;
        SoulsModule.i[0x30A0 ^ 0x3004] = 0x3004 ^ 0x3004;
        SoulsModule.i[0x324A ^ 0x321B] = 0xFFFFCD78 ^ 0x321B;
        SoulsModule.i[0x731 ^ 0x709] = 0xFFFFF8BD ^ 0x709;
        SoulsModule.i[0xC42B ^ 0xC53D] = 0xC15A ^ 0xC53D;
        SoulsModule.i[0x7BF ^ 0x712] = 0x8E1A ^ 0x712;
        SoulsModule.i[0x4C4B ^ 0x4CBA] = 0x4CF2 ^ 0x4CBA;
        SoulsModule.i[0x30D8 ^ 0x30D8] = 0x3048 ^ 0x30D8;
        SoulsModule.i[0x43E5 ^ 0x4295] = 0xF8E9 ^ 0x4295;
        SoulsModule.i[0x2B1E ^ 0x2A1A] = 0x6D5E ^ 0x2A1A;
        SoulsModule.i[0x889B ^ 0x880A] = 0xFFFF7795 ^ 0x880A;
        SoulsModule.i[0xA6C0 ^ 0xA64A] = 0xA6DE ^ 0xA64A;
        SoulsModule.i[0x4CB4 ^ 0x4DE3] = 0x74F8 ^ 0x4DE3;
        SoulsModule.i[0x100E9 ^ 0x10196] = 0x15BC6 ^ 0x10196;
        SoulsModule.i[0x202A ^ 0x20E6] = 0x20A3 ^ 0x20E6;
        SoulsModule.i[0x7C1 ^ 0x794] = 0xFFFFF80F ^ 0x794;
        SoulsModule.i[0xA529 ^ 0xA5B2] = 0xA5BB ^ 0xA5B2;
        SoulsModule.i[0x9749 ^ 0x9601] = 0x1BB0 ^ 0x9601;
        SoulsModule.i[0x8469 ^ 0x84ED] = 0xFFFF7B47 ^ 0x84ED;
        SoulsModule.i[0x30DA ^ 0x3078] = 0x3078 ^ 0x3078;
    }
}

