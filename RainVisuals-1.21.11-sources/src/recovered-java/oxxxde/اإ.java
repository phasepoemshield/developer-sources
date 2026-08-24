/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.OtherClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity$RemovalReason
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.entity.damage.DamageSource
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemConvertible
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.sound.SoundCategory
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.event.events.TotemPopEvent;
import kotakbaz.rain.mixin.LivingEntityInvoker;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import oxxxde.\u0631\u0638;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b(\u0010)J/\u0010/\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0002\u00a2\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u001f2\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0002\u00a2\u0006\u0004\b7\u00108J'\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020=2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bD\u0010\u0003R\u0014\u0010E\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001d\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b[\u0010FR\u0018\u0010\\\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\\\u0010ZR\u0016\u0010]\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b]\u0010^\u00a8\u0006_"}, d2={"Loxxxde/\u0627\u0625;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_1297;", "target", "", "handleAttack", "(Lnet/minecraft/class_1297;)Z", "Lnet/minecraft/class_2664;", "packet", "handleExplosion", "(Lnet/minecraft/class_2664;)V", "entity", "isFakePlayer", "spawnFakePlayer", "Lnet/minecraft/class_745;", "fake", "applyBuffs", "(Lnet/minecraft/class_745;)V", "Lnet/minecraft/class_746;", "player", "copyInventory", "(Lnet/minecraft/class_745;Lnet/minecraft/class_746;)V", "", "cooldown", "calculateMeleeDamage", "(Lnet/minecraft/class_746;Lnet/minecraft/class_745;F)F", "Lnet/minecraft/class_243;", "center", "estimateExplosionDamage", "(Lnet/minecraft/class_243;Lnet/minecraft/class_745;)F", "", "calculateExposure", "(Lnet/minecraft/class_243;Lnet/minecraft/class_745;)D", "min", "max", "", "index", "steps", "lerpBox", "(DDII)D", "damage", "Lnet/minecraft/class_1282;", "damageSource", "applySimulatedDamage", "(Lnet/minecraft/class_745;FLnet/minecraft/class_1282;)V", "", "configuredName", "()Ljava/lang/String;", "Lnet/minecraft/class_638;", "world", "playAttackFeedback", "(Lnet/minecraft/class_638;Lnet/minecraft/class_746;F)V", "Lnet/minecraft/class_3414;", "attackSound", "(Lnet/minecraft/class_746;F)Lnet/minecraft/class_3414;", "shouldPlayCriticalSound", "(Lnet/minecraft/class_746;)Z", "applyLocalHurtFeedback", "(Lnet/minecraft/class_745;Lnet/minecraft/class_1282;)V", "removeFakePlayer", "FAKE_ENTITY_ID", "I", "DEATH_DISABLE_TICKS", "TOTEM_HEALTH", "F", "LOW_COOLDOWN_DAMAGE", "CRYSTAL_EXPLOSION_POWER", "D", "TELEPORT_DISABLE_DISTANCE", "TELEPORT_DISABLE_DISTANCE_SQUARED", "Ljava/util/UUID;", "PROFILE_UUID", "Ljava/util/UUID;", "Loxxxde/\u062e\u0630;", "Loxxxde/\u062e\u0630;", "Loxxxde/\u0639\u062a;", "fakeName", "Loxxxde/\u0639\u062a;", "fakePlayer", "Lnet/minecraft/class_745;", "fakeWorld", "Lnet/minecraft/class_638;", "deathTime", "lastPlayerWorld", "lastPlayerPos", "Lnet/minecraft/class_243;", "rain-visuals"})
public final class \u0627\u0625
extends Module {
    @Nullable
    private static OtherClientPlayerEntity fakePlayer;
    private static final float LOW_COOLDOWN_DAMAGE = 1.0f;
    private static int deathTime;
    @Nullable
    private static ClientWorld fakeWorld;
    @NotNull
    private static Vec3d lastPlayerPos;
    private static final double TELEPORT_DISABLE_DISTANCE_SQUARED = 144.0;
    private static final int FAKE_ENTITY_ID = -20481;
    @NotNull
    private static final TextSetting fakeName;
    private static final double TELEPORT_DISABLE_DISTANCE = 12.0;
    @NotNull
    private static final UUID PROFILE_UUID;
    private static final double CRYSTAL_EXPLOSION_POWER = 6.0;
    private static final int DEATH_DISABLE_TICKS = 10;
    private static final float TOTEM_HEALTH = 10.0f;
    @NotNull
    private static final BooleanSetting copyInventory;
    @NotNull
    public static final \u0627\u0625 INSTANCE;
    @Nullable
    private static ClientWorld lastPlayerWorld;

    /*
     * WARNING - void declaration
     */
    private final void spawnFakePlayer() {
        void var2_2;
        void var3_3;
        void var5_5;
        void var4_4;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        this.removeFakePlayer();
        OtherClientPlayerEntity fake = new OtherClientPlayerEntity(world, new GameProfile(PROFILE_UUID, this.configuredName()));
        fake.setId(-20481);
        fake.copyPositionAndRotation((Entity)player);
        \u0637\u062b.setYaw((Entity)fake, \u0637\u062b.getYaw((Entity)player));
        \u0637\u062b.setPitch((Entity)fake, \u0637\u062b.getPitch((Entity)player));
        \u0637\u062b.setHeadYaw((LivingEntity)fake, \u0637\u062b.getHeadYaw((LivingEntity)player));
        \u0637\u062b.setBodyYaw((LivingEntity)fake, \u0637\u062b.getBodyYaw((LivingEntity)player));
        fake.setVelocity(Vec3d.ZERO);
        fake.setOnGround(player.isOnGround());
        fake.setPose(player.getPose());
        LivingEntity $this$setSneaking$iv = (LivingEntity)fake;
        boolean value$iv = player.isSneaking();
        boolean bl = false;
        var4_4.setSneaking((boolean)var5_5);
        fake.setSprinting(player.isSprinting());
        fake.setSwimming(player.isSwimming());
        fake.setInvisible(false);
        fake.setHealth(fake.getMaxHealth());
        fake.hurtTime = 0;
        fake.deathTime = 0;
        if (((Boolean)copyInventory.getValue()).booleanValue()) {
            this.copyInventory(fake, player);
        }
        fake.setStackInHand(Hand.OFF_HAND, new ItemStack((ItemConvertible)Items.TOTEM_OF_UNDYING));
        world.addEntity((Entity)var3_3);
        this.applyBuffs((OtherClientPlayerEntity)var3_3);
        fakeWorld = var2_2;
        fakePlayer = var3_3;
        deathTime = 0;
    }

    public final void handleExplosion(@NotNull ExplosionS2CPacket packet) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        if (!this.isEnabled()) {
            return;
        }
        OtherClientPlayerEntity otherClientPlayerEntity = fakePlayer;
        if (otherClientPlayerEntity == null) {
            return;
        }
        OtherClientPlayerEntity fake = otherClientPlayerEntity;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld world = clientWorld;
        if (fake.hurtTime != 0) {
            return;
        }
        Vec3d vec3d = packet.center();
        Intrinsics.checkNotNullExpressionValue(vec3d, "center(...)");
        float damage = this.estimateExplosionDamage(vec3d, fake);
        if (damage <= 0.0f) {
            return;
        }
        DamageSource damageSource = world.getDamageSources().generic();
        Intrinsics.checkNotNullExpressionValue(damageSource, "generic(...)");
        this.applySimulatedDamage(fake, damage, damageSource);
    }

    private final void playAttackFeedback(ClientWorld world, ClientPlayerEntity player, float cooldown) {
        SoundEvent sound = this.attackSound(player, cooldown);
        world.playSoundFromEntityClient((Entity)player, sound, SoundCategory.PLAYERS, 1.0f, 1.0f);
    }

    static {
        INSTANCE = new \u0627\u0625();
        UUID uUID = UUID.fromString("66123666-6666-6666-6666-666666666600");
        Intrinsics.checkNotNullExpressionValue(uUID, "fromString(...)");
        PROFILE_UUID = uUID;
        copyInventory = Module.boolean$default(INSTANCE, "\u041a\u043e\u043f\u0438\u044f \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u044f", false, null, 4, null);
        fakeName = Module.text$default(INSTANCE, "\u041d\u0438\u043a\u043d\u0435\u0439\u043c", "\u0411\u0440\u043e\u0432\u0438\u043a", 32, null, 8, null);
        Vec3d vec3d = Vec3d.ZERO;
        Intrinsics.checkNotNullExpressionValue(vec3d, "ZERO");
        lastPlayerPos = vec3d;
    }

    /*
     * WARNING - void declaration
     */
    private final double calculateExposure(Vec3d center, OtherClientPlayerEntity fake) {
        void var7_7;
        void var6_6;
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return 0.0;
        }
        ClientWorld world = clientWorld;
        Box box = fake.getBoundingBox();
        Intrinsics.checkNotNullExpressionValue(box, "getBoundingBox(...)");
        Box box2 = box;
        int steps = 3;
        int clearRays = 0;
        int totalRays = 0;
        int xIndex = 0;
        while (xIndex < steps) {
            void var8_8;
            int yIndex = 0;
            while (yIndex < steps) {
                void var9_9;
                int zIndex = 0;
                while (zIndex < steps) {
                    void var10_10;
                    BlockHitResult result;
                    Vec3d sample = new Vec3d(this.lerpBox(box2.minX, box2.maxX, xIndex, steps), this.lerpBox(box2.minY, box2.maxY, yIndex, steps), this.lerpBox(box2.minZ, box2.maxZ, zIndex, steps));
                    Intrinsics.checkNotNullExpressionValue(world.raycast(new RaycastContext(sample, center, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)fake)), "clip(...)");
                    if (result.getType() == HitResult.Type.MISS) {
                        ++clearRays;
                    }
                    ++totalRays;
                    ++var10_10;
                }
                ++var9_9;
            }
            ++var8_8;
        }
        if (totalRays == 0) {
            return 0.0;
        }
        return (double)var6_6 / (double)var7_7;
    }

    private \u0627\u0625() {
        super("FakePlayer", \u0638\u0646.getPLAYER(), "\u0421\u043e\u0437\u0434\u0430\u043d\u0438\u0435 \u0432\u0430\u0448\u0435\u0439 \u0432\u0438\u0437\u0443\u0430\u043b\u044c\u043d\u043e\u0439 \u043a\u043e\u043f\u0438\u0438");
    }

    private final SoundEvent attackSound(ClientPlayerEntity player, float cooldown) {
        SoundEvent soundEvent;
        if (this.shouldPlayCriticalSound(player)) {
            SoundEvent soundEvent2 = SoundEvents.ENTITY_PLAYER_ATTACK_CRIT;
            soundEvent = soundEvent2;
            Intrinsics.checkNotNullExpressionValue(soundEvent2, "PLAYER_ATTACK_CRIT");
        } else if (player.isSprinting() && cooldown >= 0.9f) {
            SoundEvent soundEvent3 = SoundEvents.ENTITY_PLAYER_ATTACK_KNOCKBACK;
            soundEvent = soundEvent3;
            Intrinsics.checkNotNullExpressionValue(soundEvent3, "PLAYER_ATTACK_KNOCKBACK");
        } else if (cooldown >= 0.9f) {
            SoundEvent soundEvent4 = SoundEvents.ENTITY_PLAYER_ATTACK_STRONG;
            soundEvent = soundEvent4;
            Intrinsics.checkNotNullExpressionValue(soundEvent4, "PLAYER_ATTACK_STRONG");
        } else {
            SoundEvent soundEvent5 = SoundEvents.ENTITY_PLAYER_ATTACK_WEAK;
            soundEvent = soundEvent5;
            Intrinsics.checkNotNullExpressionValue(soundEvent5, "PLAYER_ATTACK_WEAK");
        }
        return soundEvent;
    }

    /*
     * WARNING - void declaration
     */
    public final boolean handleAttack(@NotNull Entity target) {
        void var2_2;
        Intrinsics.checkNotNullParameter(target, "target");
        if (!this.isEnabled()) {
            return false;
        }
        OtherClientPlayerEntity otherClientPlayerEntity = fakePlayer;
        if (otherClientPlayerEntity == null) {
            return false;
        }
        OtherClientPlayerEntity fake = otherClientPlayerEntity;
        if (target.getId() != fake.getId()) {
            return false;
        }
        if (fake.hurtTime != 0) {
            return true;
        }
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return true;
        }
        ClientWorld world = clientWorld;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return true;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        float cooldown = player.getAttackCooldownProgress(0.5f);
        this.playAttackFeedback(world, player, cooldown);
        DamageSource damageSource = player.getDamageSources().playerAttack((PlayerEntity)player);
        Intrinsics.checkNotNullExpressionValue(damageSource, "playerAttack(...)");
        DamageSource damageSource2 = damageSource;
        float damage = cooldown >= 0.85f ? this.calculateMeleeDamage(player, fake, cooldown) : 1.0f;
        this.applySimulatedDamage(fake, damage, damageSource2);
        player.resetTicksSince();
        \u0631\u0638.INSTANCE.post(new AttackEvent((Entity)var2_2));
        return true;
    }

    private final void applyLocalHurtFeedback(OtherClientPlayerEntity fake, DamageSource damageSource) {
        fake.hurtTime = 10;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        fake.animateDamage(clientPlayerEntity != null ? \u0637\u062b.getYaw((Entity)clientPlayerEntity) : \u0637\u062b.getYaw((Entity)fake));
        Intrinsics.checkNotNull(fake, "null cannot be cast to non-null type kotakbaz.rain.mixin.LivingEntityInvoker");
        ((LivingEntityInvoker)fake).rain$playHurtSound(damageSource);
    }

    @Override
    public void onDisable() {
        this.removeFakePlayer();
        deathTime = 0;
        lastPlayerWorld = null;
        Vec3d vec3d = Vec3d.ZERO;
        Intrinsics.checkNotNullExpressionValue(vec3d, "ZERO");
        lastPlayerPos = vec3d;
    }

    @Override
    public void onEnable() {
        lastPlayerWorld = \u0636\u0643.getMc().world;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null || (clientPlayerEntity = \u0637\u062b.getPos((Entity)clientPlayerEntity)) == null) {
            Vec3d vec3d = Vec3d.ZERO;
            clientPlayerEntity = vec3d;
            Intrinsics.checkNotNullExpressionValue(vec3d, "ZERO");
        }
        lastPlayerPos = clientPlayerEntity;
        this.spawnFakePlayer();
    }

    private final void applySimulatedDamage(OtherClientPlayerEntity fake, float damage, DamageSource damageSource) {
        if (damage <= 0.0f) {
            return;
        }
        float remaining = fake.getHealth() + fake.getAbsorptionAmount() - damage;
        this.applyLocalHurtFeedback(fake, damageSource);
        if (remaining > 0.0f) {
            fake.setHealth(remaining);
            return;
        }
        if (fake.getOffHandStack().isOf(Items.TOTEM_OF_UNDYING)) {
            fake.setStackInHand(Hand.OFF_HAND, ItemStack.EMPTY);
            fake.setHealth(10.0f);
            ClientWorld clientWorld = \u0636\u0643.getMc().world;
            if (clientWorld != null) {
                clientWorld.playSoundFromEntityClient((Entity)fake, SoundEvents.ITEM_TOTEM_USE, SoundCategory.PLAYERS, 1.0f, 1.0f);
            }
            \u0631\u0638.INSTANCE.post(new TotemPopEvent((PlayerEntity)fake));
        } else {
            fake.setHealth(0.0f);
            var1_1.deathTime = 1;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean shouldPlayCriticalSound(ClientPlayerEntity player) {
        void var3_3;
        void $this$hasStatusEffect$iv;
        if (!(player.fallDistance > 0.0)) return false;
        if (player.isOnGround()) return false;
        if (\u0637\u062b.isClimbing((LivingEntity)player)) return false;
        if (player.isTouchingWater()) return false;
        if (player.hasVehicle()) return false;
        if (player.isSprinting()) return false;
        LivingEntity livingEntity = (LivingEntity)player;
        RegistryEntry registryEntry = StatusEffects.BLINDNESS;
        Intrinsics.checkNotNullExpressionValue(registryEntry, "BLINDNESS");
        RegistryEntry effect$iv = registryEntry;
        boolean $i$f$hasStatusEffect = false;
        if ($this$hasStatusEffect$iv.hasStatusEffect((RegistryEntry)var3_3)) return false;
        return true;
    }

    private final void copyInventory(OtherClientPlayerEntity fake, ClientPlayerEntity player) {
        fake.setStackInHand(Hand.MAIN_HAND, player.getMainHandStack().copy());
        fake.setStackInHand(Hand.OFF_HAND, player.getOffHandStack().copy());
        fake.getInventory().setStack(36, player.getInventory().getStack(36).copy());
        fake.getInventory().setStack(37, player.getInventory().getStack(37).copy());
        fake.getInventory().setStack(38, player.getInventory().getStack(38).copy());
        fake.getInventory().setStack(39, player.getInventory().getStack(39).copy());
    }

    private final void applyBuffs(OtherClientPlayerEntity fake) {
        fake.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 9999, 2));
        fake.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 9999, 4));
        fake.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 9999, 1));
    }

    private final float calculateMeleeDamage(ClientPlayerEntity player, OtherClientPlayerEntity fake, float cooldown) {
        float damage = (float)player.getAttributeValue(EntityAttributes.ATTACK_DAMAGE);
        damage *= 0.2f + cooldown * cooldown * 0.8f;
        if (this.shouldPlayCriticalSound(player)) {
            damage *= 1.5f;
        }
        return RangesKt.coerceAtLeast(damage, 0.0f);
    }

    private final float estimateExplosionDamage(Vec3d center, OtherClientPlayerEntity fake) {
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        if (clientWorld == null) {
            return 0.0f;
        }
        ClientWorld world = clientWorld;
        double scaledRadius = 12.0;
        double distance = center.distanceTo(\u0637\u062b.getPos((Entity)fake));
        if (distance > scaledRadius) {
            return 0.0f;
        }
        double exposure = this.calculateExposure(center, fake);
        if (exposure <= 0.0) {
            return 0.0f;
        }
        double impact = RangesKt.coerceAtLeast(1.0 - distance / scaledRadius, 0.0) * exposure;
        float f = (float)((impact * impact + impact) / 2.0 * 7.0 * scaledRadius + 1.0);
        return RangesKt.coerceAtLeast(f, 0.0f);
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        ClientWorld clientWorld = \u0636\u0643.getMc().world;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (lastPlayerWorld != null && !Intrinsics.areEqual(lastPlayerWorld, clientWorld)) {
            this.setEnabled(false);
            return;
        }
        Vec3d vec3d = \u0637\u062b.getPos((Entity)clientPlayerEntity);
        if (vec3d.squaredDistanceTo(lastPlayerPos) > 144.0) {
            this.setEnabled(false);
            return;
        }
        lastPlayerWorld = clientWorld;
        lastPlayerPos = \u0637\u062b.getPos((Entity)clientPlayerEntity);
        OtherClientPlayerEntity otherClientPlayerEntity = fakePlayer;
        if (otherClientPlayerEntity == null || otherClientPlayerEntity.isRemoved() || !Intrinsics.areEqual(otherClientPlayerEntity.getEntityWorld(), clientWorld)) {
            this.spawnFakePlayer();
        }
        if ((otherClientPlayerEntity = fakePlayer) == null) {
            return;
        }
        if (!Intrinsics.areEqual(otherClientPlayerEntity.getOffHandStack().getItem(), Items.TOTEM_OF_UNDYING)) {
            otherClientPlayerEntity.setStackInHand(Hand.OFF_HAND, new ItemStack((ItemConvertible)Items.TOTEM_OF_UNDYING));
        }
        if (!otherClientPlayerEntity.isAlive() || otherClientPlayerEntity.getHealth() <= 0.0f) {
            if (++deathTime > 10) {
                this.setEnabled(false);
            }
        } else {
            deathTime = 0;
        }
    }

    private final double lerpBox(double min, double max, int index, int steps) {
        if (steps <= 1) {
            return (min + max) * 0.5;
        }
        double progress = (double)index / (double)(steps - 1);
        return min + (max - min) * progress;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isFakePlayer(@Nullable Entity entity) {
        OtherClientPlayerEntity otherClientPlayerEntity = fakePlayer;
        if (otherClientPlayerEntity == null) {
            return false;
        }
        OtherClientPlayerEntity fake = otherClientPlayerEntity;
        if (entity == null) return false;
        if (entity.getId() != fake.getId()) return false;
        return true;
    }

    private final void removeFakePlayer() {
        OtherClientPlayerEntity otherClientPlayerEntity = fakePlayer;
        if (otherClientPlayerEntity == null) {
            return;
        }
        OtherClientPlayerEntity fake = otherClientPlayerEntity;
        ClientWorld world = fakeWorld;
        if (world != null) {
            world.removeEntity(fake.getId(), Entity.RemovalReason.DISCARDED);
        }
        fake.remove(Entity.RemovalReason.DISCARDED);
        fakePlayer = null;
        fakeWorld = null;
    }

    private final String configuredName() {
        String string;
        String p0 = string = ((Object)StringsKt.trim((CharSequence)((String)fakeName.getValue()))).toString();
        boolean bl = false;
        String string2 = ((CharSequence)p0).length() > 0 ? string : null;
        String string3 = string2;
        if (string2 == null) {
            string3 = "Rain";
        }
        return string3;
    }
}

