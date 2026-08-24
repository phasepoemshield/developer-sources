/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.OtherClientPlayerEntity
 *  net.minecraft.client.render.entity.EntityRenderManager
 *  net.minecraft.client.render.entity.state.EntityRenderState
 *  net.minecraft.client.render.entity.state.LivingEntityRenderState
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityPose
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.scoreboard.AbstractTeam$VisibilityRule
 *  net.minecraft.scoreboard.Team
 *  net.minecraft.util.math.Vec3d
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package kotakbaz.rain.module.modules.render;

import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Iterator;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.EntitySubmitEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.TotemPopEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.render.entity.EntityRenderManager;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.AbstractTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0635\u062f;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001SB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0011H\u0007\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b\"\u0010#J7\u0010(\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b(\u0010)J7\u0010*\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b*\u0010)J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0002\u00a2\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b2\u00101J\u0017\u00103\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b3\u00101J\u0017\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b7\u0010\u0003R\u0014\u00109\u001a\u0002088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010;\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010?\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b?\u0010<R\u0014\u0010@\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b@\u0010<R\u0014\u0010A\u001a\u0002088\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bA\u0010:R\u0014\u0010C\u001a\u00020B8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bJ\u0010IR$\u0010N\u001a\u0012\u0012\u0004\u0012\u00020L0Kj\b\u0012\u0004\u0012\u00020L`M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010P\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u0002088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bR\u0010:\u00a8\u0006T"}, d2={"Loxxxde/\u062c\u0637;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0631\u0643;", "event", "onTotemPop", "(Lkotakbaz/rain/event/events/TotemPopEvent;)V", "Loxxxde/\u0630\u0645;", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Loxxxde/\u0633\u062d;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Loxxxde/\u0628\u0629;", "onEntitySubmit", "(Lkotakbaz/rain/event/events/EntitySubmitEvent;)V", "Lnet/minecraft/class_1657;", "target", "spawnSoul", "(Lnet/minecraft/class_1657;)V", "", "ghostName", "Lcom/mojang/authlib/GameProfile;", "createGhostProfile", "(Lnet/minecraft/class_1657;Ljava/lang/String;)Lcom/mojang/authlib/GameProfile;", "Lnet/minecraft/class_745;", "ghost", "", "yaw", "pitch", "applyInitialGhostRotation", "(Lnet/minecraft/class_745;FF)V", "", "x", "y", "z", "updateGhostForRender", "(Lnet/minecraft/class_745;DDDF)V", "syncPreviousRenderState", "Lnet/minecraft/class_10017;", "state", "prepareSoulRenderState", "(Lnet/minecraft/class_10017;)V", "progress", "easeOutCubic", "(F)F", "soulAlpha", "smootherStep", "scoreHolder", "hideNameTag", "(Ljava/lang/String;)V", "clearHideTeam", "", "DURATION_MS", "J", "RISE_HEIGHT", "F", "GHOST_ALPHA_START", "FADE_OUT_START", "FADE_OUT_END", "SPIN_DEGREES", "LAST_HIT_WINDOW_MS", "", "LIGHT", "I", "HIDE_TEAM", "Ljava/lang/String;", "Loxxxde/\u062e\u0630;", "onDeath", "Loxxxde/\u062e\u0630;", "onTotem", "Ljava/util/ArrayList;", "Loxxxde/\u062d;", "Lkotlin/collections/ArrayList;", "souls", "Ljava/util/ArrayList;", "lastTarget", "Lnet/minecraft/class_1657;", "lastHitAt", "Soul", "rain-visuals"})
@RecompileFormat
public final class SoulsModule
extends Module {
    @NotNull
    private static final String HIDE_TEAM = "rain_soul_hidden";
    @NotNull
    private static final ArrayList<Soul> souls;
    private static long lastHitAt;
    private static final long DURATION_MS = 1600L;
    private static final float GHOST_ALPHA_START = 0.65f;
    private static final long LAST_HIT_WINDOW_MS = 3000L;
    @Nullable
    private static PlayerEntity lastTarget;
    @NotNull
    private static final BooleanSetting onTotem;
    private static final float FADE_OUT_START = 0.62f;
    private static final int LIGHT = 0xF000F0;
    private static final float FADE_OUT_END = 0.94f;
    @NotNull
    private static final BooleanSetting onDeath;
    @NotNull
    public static final SoulsModule INSTANCE;
    private static final float RISE_HEIGHT = 1.8f;
    private static final float SPIN_DEGREES = 180.0f;

    private static final void onEntitySubmit$lambda$0(EntityRenderManager $dispatcher, EntityRenderState $state, EntitySubmitEvent $event, Vec3d $cameraPos) {
        $dispatcher.render($state, $event.getCameraState(), $state.x - $cameraPos.x, $state.y - $cameraPos.y, $state.z - $cameraPos.z, $event.getMatrices(), $event.getCollector());
    }

    private SoulsModule() {
        super("Souls", \u0638\u0646.getRENDER(), "\u0412\u044b\u043b\u0435\u0442 \u0434\u0443\u0448\u0438 \u0438\u0433\u0440\u043e\u043a\u0430");
    }

    private final void spawnSoul(PlayerEntity target) {
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        long now = System.currentTimeMillis();
        GameProfile profile = this.createGhostProfile(target, "rain_soul_" + now);
        OtherClientPlayerEntity ghost = new OtherClientPlayerEntity(world, profile);
        Vec3d spawnPos = new Vec3d(target.getX(), target.getY() + 0.1, target.getZ());
        float yaw = \u0637\u062b.getYaw((Entity)target);
        float pitch = \u0637\u062b.getPitch((Entity)target);
        ghost.copyPositionAndRotation((Entity)target);
        this.applyInitialGhostRotation(ghost, yaw, pitch);
        ghost.setVelocity(Vec3d.ZERO);
        ghost.setCustomName(null);
        ghost.setCustomNameVisible(false);
        ghost.setInvisible(false);
        String string = profile.name();
        Intrinsics.checkNotNullExpressionValue(string, "name(...)");
        this.hideNameTag(string);
        souls.add(new Soul(spawnPos, now, ghost, yaw));
    }

    @Override
    public void onEnable() {
        souls.clear();
        lastTarget = null;
        this.clearHideTeam();
        super.onEnable();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        long now = System.currentTimeMillis();
        souls.removeIf(arg_0 -> SoulsModule.onUpdate$lambda$1(arg_0 -> SoulsModule.onUpdate$lambda$0(now, arg_0), arg_0));
        if ((Boolean)onDeath.getValue() == false) return;
        if (\u0636\u0643.getMc().player == null) return;
        if (\u0636\u0643.getMc().world == null) {
            return;
        }
        PlayerEntity playerEntity = lastTarget;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity target = playerEntity;
        if (target.isAlive()) {
            if (!(target.getHealth() <= 0.0f)) return;
        }
        boolean bl = true;
        boolean dead = bl;
        if (dead && now - lastHitAt <= 3000L) {
            this.spawnSoul(target);
            lastTarget = null;
            return;
        } else {
            if (!dead) return;
            lastTarget = null;
        }
    }

    private final float soulAlpha(float progress) {
        float fadeProgress = RangesKt.coerceIn((progress - 0.62f) / 0.32f, 0.0f, 1.0f);
        return RangesKt.coerceIn(0.65f * (1.0f - this.smootherStep(fadeProgress)), 0.0f, 0.65f);
    }

    private final float easeOutCubic(float progress) {
        float inverted = 1.0f - progress;
        return 1.0f - inverted * inverted * inverted;
    }

    private static final boolean onUpdate$lambda$0(long $now, Soul it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return $now - it.getStartAt() > 1800L;
    }

    private final float smootherStep(float progress) {
        return progress * progress * progress * (progress * (progress * 6.0f - 15.0f) + 10.0f);
    }

    private final void applyInitialGhostRotation(OtherClientPlayerEntity ghost, float yaw, float pitch) {
        \u0637\u062b.setYaw((Entity)ghost, yaw);
        \u0637\u062b.setPitch((Entity)ghost, pitch);
        \u0637\u062b.setHeadYaw((LivingEntity)ghost, yaw);
        \u0637\u062b.setBodyYaw((LivingEntity)ghost, yaw);
    }

    /*
     * WARNING - void declaration
     */
    private final void updateGhostForRender(OtherClientPlayerEntity ghost, double x, double y, double z, float yaw) {
        void var1_2;
        void var13_12;
        void position$iv;
        void $this$setLastPositionAndAngles$iv;
        void yaw$iv;
        Entity $this$refreshPositionAndAngles$iv;
        double y$iv;
        double x$iv;
        Entity $this$updatePosition$iv;
        Vec3d position = new Vec3d(x, y, z);
        ghost.setPosition(position);
        Entity entity = (Entity)ghost;
        double d = x;
        double d2 = y;
        double z$iv = z;
        boolean $i$f$updatePosition22 = false;
        $this$updatePosition$iv.setPosition(x$iv, y$iv, z$iv);
        $this$updatePosition$iv = (Entity)ghost;
        x$iv = x;
        y$iv = y;
        z$iv = z;
        float $i$f$updatePosition22 = yaw;
        float pitch$iv = 0.0f;
        boolean $i$f$refreshPositionAndAngles = false;
        $this$refreshPositionAndAngles$iv.refreshPositionAndAngles(x$iv, y$iv, z$iv, (float)yaw$iv, pitch$iv);
        $this$refreshPositionAndAngles$iv = (Entity)ghost;
        Vec3d x$iv2 = position;
        float yaw$iv2 = yaw;
        float pitch$iv2 = 0.0f;
        boolean $i$f$setLastPositionAndAngles = false;
        $this$setLastPositionAndAngles$iv.setLastPositionAndAngles((Vec3d)position$iv, yaw$iv2, (float)var13_12);
        this.syncPreviousRenderState(ghost, x, y, z, yaw);
        \u0637\u062b.setYaw((Entity)ghost, yaw);
        \u0637\u062b.setPitch((Entity)ghost, 0.0f);
        \u0637\u062b.setHeadYaw((LivingEntity)ghost, yaw);
        \u0637\u062b.setBodyYaw((LivingEntity)ghost, yaw);
        ghost.setVelocity(Vec3d.ZERO);
        ghost.age = 0;
        ghost.hurtTime = 0;
        ghost.deathTime = 0;
        ghost.setMovementSpeed(0.0f);
        ghost.limbAnimator.reset();
        ghost.fallDistance = 0.0;
        ghost.setOnGround(true);
        ghost.setPose(EntityPose.STANDING);
        LivingEntity $this$setSneaking$iv = (LivingEntity)ghost;
        boolean bl = true;
        boolean bl2 = false;
        entity.setSneaking(bl);
        ghost.setSprinting(false);
        ghost.setSwimming(false);
        var1_2.setInvisible(false);
        var1_2.setCustomName(null);
        var1_2.setCustomNameVisible(false);
    }

    /*
     * WARNING - void declaration
     */
    private final void hideNameTag(String scoreHolder) {
        void var6_6;
        void var4_9;
        ClientWorld $this$getTeam$iv;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getScoreboard()) == null) {
            return;
        }
        ClientWorld scoreboard = clientWorld;
        ClientWorld clientWorld2 = scoreboard;
        String name$iv = HIDE_TEAM;
        boolean $i$f$getTeam = false;
        Team team = $this$getTeam$iv.getTeam(name$iv);
        if (team == null) {
            void $this$addTeam$iv;
            $this$getTeam$iv = scoreboard;
            name$iv = HIDE_TEAM;
            boolean $i$f$addTeam = false;
            Team team2 = $this$addTeam$iv.addTeam(name$iv);
            team = team2;
            Intrinsics.checkNotNullExpressionValue(team2, "addPlayerTeam(...)");
        }
        Team team3 = team;
        Team $this$setNameTagVisibilityRule$iv = team3;
        AbstractTeam.VisibilityRule visibility$iv = AbstractTeam.VisibilityRule.NEVER;
        boolean $i$f$setNameTagVisibilityRule = false;
        $this$setNameTagVisibilityRule$iv.setNameTagVisibilityRule(visibility$iv);
        ClientWorld $this$addScoreHolderToTeam$iv = scoreboard;
        String scoreHolder$iv = scoreHolder;
        Team team$iv = team3;
        boolean $i$f$addScoreHolderToTeam = false;
        var4_9.addScoreHolderToTeam((String)clientWorld2, (Team)var6_6);
    }

    private static final boolean onUpdate$lambda$1(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    @Commando
    public final void onTotemPop(@NotNull TotemPopEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!((Boolean)onTotem.getValue()).booleanValue() || \u0636\u0643.getMc().world == null || \u0636\u0643.getMc().player == null) {
            return;
        }
        PlayerEntity target = event.getPlayer();
        if (Intrinsics.areEqual(target, \u0636\u0643.getMc().player)) {
            return;
        }
        this.spawnSoul(target);
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!((Boolean)onDeath.getValue()).booleanValue()) {
            return;
        }
        Entity entity = event.getEntity();
        PlayerEntity playerEntity = entity instanceof PlayerEntity ? (PlayerEntity)entity : null;
        if (playerEntity == null) {
            return;
        }
        PlayerEntity target = playerEntity;
        if (Intrinsics.areEqual(target, \u0636\u0643.getMc().player)) {
            return;
        }
        lastTarget = target;
        lastHitAt = System.currentTimeMillis();
    }

    private final void prepareSoulRenderState(EntityRenderState state) {
        state.light = 0xF000F0;
        state.outlineColor = 0;
        state.displayName = null;
        state.nameLabelPos = null;
        state.leashDatas = null;
        state.shadowRadius = 0.0f;
        state.shadowPieces.clear();
        state.onFire = false;
        state.invisible = true;
        if (state instanceof LivingEntityRenderState) {
            ((LivingEntityRenderState)state).invisibleToPlayer = false;
            ((LivingEntityRenderState)state).hurt = false;
            ((LivingEntityRenderState)var1_1).deathTime = 0.0f;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final GameProfile createGhostProfile(PlayerEntity target, String ghostName) {
        void var2_2;
        if (target instanceof AbstractClientPlayerEntity) {
            GameProfile gameProfile;
            GameProfile gameProfile2 = ((AbstractClientPlayerEntity)target).getGameProfile();
            Intrinsics.checkNotNullExpressionValue(gameProfile2, "getGameProfile(...)");
            GameProfile original = gameProfile2;
            GameProfile copy = gameProfile = new GameProfile(original.id(), ghostName);
            boolean bl = false;
            SoulsModule soulsModule = INSTANCE;
            try {
                SoulsModule $this$createGhostProfile_u24lambda_u240_u240 = soulsModule;
                boolean bl2 = false;
                Object object = Result.constructor-impl(copy.properties().putAll((Multimap)original.properties()));
            }
            catch (Throwable throwable) {
                Object object = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
            return gameProfile;
        }
        return new GameProfile(target.getUuid(), (String)var2_2);
    }

    /*
     * WARNING - void declaration
     */
    private final void clearHideTeam() {
        void $this$removeTeam$iv;
        void $this$getTeam$iv;
        ClientWorld scoreboard;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null || (clientWorld = clientWorld.getScoreboard()) == null) {
            return;
        }
        ClientWorld clientWorld2 = scoreboard = clientWorld;
        String name$iv = HIDE_TEAM;
        boolean $i$f$getTeam = false;
        Team team = $this$getTeam$iv.getTeam(name$iv);
        if (team == null) {
            return;
        }
        Team team2 = team;
        ClientWorld clientWorld3 = scoreboard;
        Team team$iv = team2;
        boolean $i$f$removeTeam = false;
        $this$removeTeam$iv.removeTeam(team$iv);
    }

    private final void syncPreviousRenderState(OtherClientPlayerEntity ghost, double x, double y, double z, float yaw) {
        ghost.lastX = x;
        ghost.lastY = y;
        ghost.lastZ = z;
        ghost.lastRenderX = x;
        ghost.lastRenderY = y;
        ghost.lastRenderZ = z;
        ghost.lastYaw = yaw;
        ghost.lastPitch = 0.0f;
        ghost.lastBodyYaw = yaw;
        ghost.lastHeadYaw = yaw;
    }

    static {
        INSTANCE = new SoulsModule();
        onDeath = Module.boolean$default(INSTANCE, "\u041f\u0440\u0438 \u0441\u043c\u0435\u0440\u0442\u0438", true, null, 4, null);
        onTotem = Module.boolean$default(INSTANCE, "\u041f\u0440\u0438 \u043f\u0440\u043e\u0436\u0438\u043c\u0435 \u0442\u043e\u0442\u0435\u043c\u0430", true, null, 4, null);
        souls = new ArrayList();
    }

    @Commando
    public final void onEntitySubmit(@NotNull EntitySubmitEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (\u0636\u0643.getMc().player == null || \u0636\u0643.getMc().world == null || souls.isEmpty()) {
            return;
        }
        EntityRenderManager entityRenderManager = \u0636\u0643.getMc().getEntityRenderDispatcher();
        Intrinsics.checkNotNullExpressionValue(entityRenderManager, "getEntityRenderDispatcher(...)");
        EntityRenderManager dispatcher = entityRenderManager;
        Vec3d vec3d = event.getCameraState().pos;
        Intrinsics.checkNotNullExpressionValue(vec3d, "pos");
        Vec3d cameraPos = vec3d;
        long now = System.currentTimeMillis();
        Iterator<Soul> iterator2 = souls.iterator();
        Intrinsics.checkNotNullExpressionValue(iterator2, "iterator(...)");
        Iterator<Soul> iterator3 = iterator2;
        while (iterator3.hasNext()) {
            EntityRenderState state;
            Soul soul;
            Intrinsics.checkNotNullExpressionValue(iterator3.next(), "next(...)");
            float progress = RangesKt.coerceIn((float)(now - soul.getStartAt()) / (float)1600L, 0.0f, 1.0f);
            if (progress >= 1.0f) {
                iterator3.remove();
                continue;
            }
            float eased = this.easeOutCubic(progress);
            float alpha = this.soulAlpha(progress);
            if (alpha <= 0.001f) continue;
            double ghostX = soul.getStartPos().x;
            double ghostY = soul.getStartPos().y + (double)(eased * 1.8f);
            double ghostZ = soul.getStartPos().z;
            float renderYaw = soul.getBaseYaw() + 180.0f * eased;
            this.updateGhostForRender(soul.getGhost(), ghostX, ghostY, ghostZ, renderYaw);
            Intrinsics.checkNotNullExpressionValue(dispatcher.getAndUpdateRenderState((Entity)soul.getGhost(), event.getPartialTicks()), "extractEntity(...)");
            this.prepareSoulRenderState(state);
            \u0635\u062f.withAlpha(alpha, () -> SoulsModule.onEntitySubmit$lambda$0(dispatcher, state, event, cameraPos));
        }
    }

    @Override
    public void onDisable() {
        souls.clear();
        lastTarget = null;
        this.clearHideTeam();
        super.onDisable();
    }

    @Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bH\u00c6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J8\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u00020\u001aH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u00020\u001dH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0013\u00a8\u0006("}, d2={"Loxxxde/\u062d;", "", "Lnet/minecraft/class_243;", "startPos", "", "startAt", "Lnet/minecraft/class_745;", "ghost", "", "baseYaw", "<init>", "(Lnet/minecraft/class_243;JLnet/minecraft/class_745;F)V", "component1", "()Lnet/minecraft/class_243;", "component2", "()J", "component3", "()Lnet/minecraft/class_745;", "component4", "()F", "copy", "(Lnet/minecraft/class_243;JLnet/minecraft/class_745;F)Lkotakbaz/rain/module/modules/render/SoulsModule$Soul;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_243;", "getStartPos", "J", "getStartAt", "Lnet/minecraft/class_745;", "getGhost", "F", "getBaseYaw", "rain-visuals"})
    private static final class Soul {
        private final long startAt;
        @NotNull
        private final Vec3d startPos;
        private final float baseYaw;
        @NotNull
        private final OtherClientPlayerEntity ghost;

        public final float getBaseYaw() {
            return this.baseYaw;
        }

        @NotNull
        public final Vec3d component1() {
            return this.startPos;
        }

        @NotNull
        public final OtherClientPlayerEntity getGhost() {
            return this.ghost;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Soul)) {
                return false;
            }
            Soul soul = (Soul)other;
            if (!Intrinsics.areEqual(this.startPos, soul.startPos)) {
                return false;
            }
            if (this.startAt != soul.startAt) {
                return false;
            }
            if (!Intrinsics.areEqual(this.ghost, soul.ghost)) {
                return false;
            }
            if (Float.compare(this.baseYaw, soul.baseYaw) != 0) {
                return false;
            }
            return true;
        }

        @NotNull
        public final Vec3d getStartPos() {
            return this.startPos;
        }

        public final long component2() {
            return this.startAt;
        }

        public Soul(@NotNull Vec3d startPos, long startAt, @NotNull OtherClientPlayerEntity ghost, float baseYaw) {
            Intrinsics.checkNotNullParameter(startPos, "startPos");
            Intrinsics.checkNotNullParameter(ghost, "ghost");
            this.startPos = startPos;
            this.startAt = startAt;
            this.ghost = ghost;
            this.baseYaw = baseYaw;
        }

        public final float component4() {
            return this.baseYaw;
        }

        @NotNull
        public String toString() {
            return "Soul(startPos=" + this.startPos + ", startAt=" + this.startAt + ", ghost=" + this.ghost + ", baseYaw=" + this.baseYaw + ")";
        }

        @NotNull
        public final Soul copy(@NotNull Vec3d startPos, long startAt, @NotNull OtherClientPlayerEntity ghost, float baseYaw) {
            Intrinsics.checkNotNullParameter(startPos, "startPos");
            Intrinsics.checkNotNullParameter(ghost, "ghost");
            return new Soul(startPos, startAt, ghost, baseYaw);
        }

        public static /* synthetic */ Soul copy$default(Soul soul, Vec3d vec3d, long l, OtherClientPlayerEntity otherClientPlayerEntity, float f, int n, Object object) {
            if ((n & 1) != 0) {
                vec3d = soul.startPos;
            }
            if ((n & 2) != 0) {
                l = soul.startAt;
            }
            if ((n & 4) != 0) {
                otherClientPlayerEntity = soul.ghost;
            }
            if ((n & 8) != 0) {
                f = soul.baseYaw;
            }
            return soul.copy(vec3d, l, otherClientPlayerEntity, f);
        }

        public final long getStartAt() {
            return this.startAt;
        }

        @NotNull
        public final OtherClientPlayerEntity component3() {
            return this.ghost;
        }

        public int hashCode() {
            int result = this.startPos.hashCode();
            result = result * 31 + Long.hashCode(this.startAt);
            result = result * 31 + this.ghost.hashCode();
            result = result * 31 + Float.hashCode(this.baseYaw);
            return result;
        }
    }
}

