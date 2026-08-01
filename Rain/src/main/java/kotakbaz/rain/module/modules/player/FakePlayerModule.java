/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.player;

import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.EventManager;
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.mixin.LivingEntityInvoker;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.TextSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.DamageUtil;
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
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
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
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b(\u0010)J/\u0010/\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0002\u00a2\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u001f2\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0002\u00a2\u0006\u0004\b7\u00108J'\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020=2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bD\u0010\u0003R\u0014\u0010E\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001d\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b[\u0010FR\u0018\u0010\\\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\\\u0010ZR\u001e\u0010^\u001a\n ]*\u0004\u0018\u00010#0#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010_\u00a8\u0006`"}, d2={"Lkotakbaz/rain/module/modules/player/FakePlayerModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_1297;", "target", "", "handleAttack", "(Lnet/minecraft/class_1297;)Z", "Lnet/minecraft/class_2664;", "packet", "handleExplosion", "(Lnet/minecraft/class_2664;)V", "entity", "isFakePlayer", "spawnFakePlayer", "Lnet/minecraft/class_745;", "fake", "applyBuffs", "(Lnet/minecraft/class_745;)V", "Lnet/minecraft/class_746;", "player", "copyInventory", "(Lnet/minecraft/class_745;Lnet/minecraft/class_746;)V", "", "cooldown", "calculateMeleeDamage", "(Lnet/minecraft/class_746;Lnet/minecraft/class_745;F)F", "Lnet/minecraft/class_243;", "center", "estimateExplosionDamage", "(Lnet/minecraft/class_243;Lnet/minecraft/class_745;)F", "", "calculateExposure", "(Lnet/minecraft/class_243;Lnet/minecraft/class_745;)D", "min", "max", "", "index", "steps", "lerpBox", "(DDII)D", "damage", "Lnet/minecraft/class_1282;", "damageSource", "applySimulatedDamage", "(Lnet/minecraft/class_745;FLnet/minecraft/class_1282;)V", "", "configuredName", "()Ljava/lang/String;", "Lnet/minecraft/class_638;", "world", "playAttackFeedback", "(Lnet/minecraft/class_638;Lnet/minecraft/class_746;F)V", "Lnet/minecraft/class_3414;", "attackSound", "(Lnet/minecraft/class_746;F)Lnet/minecraft/class_3414;", "shouldPlayCriticalSound", "(Lnet/minecraft/class_746;)Z", "applyLocalHurtFeedback", "(Lnet/minecraft/class_745;Lnet/minecraft/class_1282;)V", "removeFakePlayer", "FAKE_ENTITY_ID", "I", "DEATH_DISABLE_TICKS", "TOTEM_HEALTH", "F", "LOW_COOLDOWN_DAMAGE", "CRYSTAL_EXPLOSION_POWER", "D", "TELEPORT_DISABLE_DISTANCE", "TELEPORT_DISABLE_DISTANCE_SQUARED", "Ljava/util/UUID;", "PROFILE_UUID", "Ljava/util/UUID;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/TextSetting;", "fakeName", "Lkotakbaz/rain/module/setting/settings/TextSetting;", "fakePlayer", "Lnet/minecraft/class_745;", "fakeWorld", "Lnet/minecraft/class_638;", "deathTime", "lastPlayerWorld", "kotlin.jvm.PlatformType", "lastPlayerPos", "Lnet/minecraft/class_243;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFakePlayerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FakePlayerModule.kt\nkotakbaz/rain/module/modules/player/FakePlayerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
public final class FakePlayerModule
extends Module {
    @NotNull
    public static final FakePlayerModule INSTANCE;
    private static final int a = -20481;
    private static final int A = 10;
    private static final float b = 10.0f;
    private static final float B = 1.0f;
    private static final double c = 6.0;
    private static final double C = 12.0;
    private static final double d = 144.0;
    @NotNull
    private static final UUID D;
    @NotNull
    private static final BooleanSetting e;
    @NotNull
    private static final TextSetting E;
    @Nullable
    private static OtherClientPlayerEntity f;
    @Nullable
    private static ClientWorld F;
    private static int g;
    @Nullable
    private static ClientWorld G;
    private static Vec3d h;
    private static Object[] H;
    private static Object I;
    private static Object[] j;
    private static Object[] i;
    private static Object[] J;
    public static int[] k;

    private FakePlayerModule() {
        int n2 = k[0];
        n2 += k[1];
        int n3 = k[3];
        n3 -= k[4];
        int n4 = k[6];
        n4 -= k[7];
        super((String)H[n2 ^= k[2]], a_0.getPLAYER(), (String)H[n3 += k[5]] + (String)H[n4 -= k[8]]);
    }

    @Override
    public void onEnable() {
        G = kotakbaz.rain.client.extensions.b.getMc().world;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null || (clientPlayerEntity = clientPlayerEntity.getPos()) == null) {
            clientPlayerEntity = Vec3d.ZERO;
        }
        h = clientPlayerEntity;
        this.spawnFakePlayer();
    }

    @Override
    public void onDisable() {
        this.removeFakePlayer();
        int n2 = k[9];
        n2 ^= k[10];
        g = n2 -= k[11];
        G = null;
        h = Vec3d.ZERO;
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = 5169405000272456146L;
        int n2 = k[12];
        n2 += k[13];
        Intrinsics.checkNotNullParameter(event, (String)H[n2 ^= k[14]]);
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientWorld == null || clientPlayerEntity == null) {
            boolean bl = k[15];
            bl += k[16];
            this.setEnabled(bl ^= k[17]);
            return;
        }
        if (G != null && !Intrinsics.areEqual(G, clientWorld)) {
            boolean bl = k[18];
            bl += k[19];
            this.setEnabled(bl -= k[20]);
            return;
        }
        if (clientPlayerEntity.getPos().squaredDistanceTo(h) > Double.longBitsToDouble(0xEE3B17BCC6050A3BL ^ 0xAE5917BCC6050A3BL)) {
            boolean bl = k[21];
            bl += k[22];
            this.setEnabled(bl += k[23]);
            return;
        }
        G = clientWorld;
        h = clientPlayerEntity.getPos();
        OtherClientPlayerEntity otherClientPlayerEntity = f;
        if (otherClientPlayerEntity == null || otherClientPlayerEntity.isRemoved() || !Intrinsics.areEqual(otherClientPlayerEntity.getWorld(), clientWorld)) {
            this.spawnFakePlayer();
        }
        OtherClientPlayerEntity otherClientPlayerEntity2 = f;
        if (otherClientPlayerEntity2 == null) {
            return;
        }
        OtherClientPlayerEntity otherClientPlayerEntity3 = otherClientPlayerEntity2;
        if (!Intrinsics.areEqual(otherClientPlayerEntity3.getOffHandStack().getItem(), Items.TOTEM_OF_UNDYING)) {
            otherClientPlayerEntity3.setStackInHand(Hand.OFF_HAND, new ItemStack((ItemConvertible)Items.TOTEM_OF_UNDYING));
        }
        if (otherClientPlayerEntity3.isDead()) {
            int n3 = k[24];
            n3 += k[25];
            long l3 = l2;
            int n4 = k[27];
            n4 += k[28];
            l2 = l3 ^ ((long)g << (n3 -= k[26]) ^ l3) & -1L << (n4 += k[29]);
            int n5 = k[30];
            n5 -= k[31];
            int n6 = k[33];
            n6 += k[34];
            g = (int)(l2 >>> (n5 -= k[32])) + (n6 -= k[35]);
            int n7 = k[36];
            n7 -= k[37];
            if (g > (n7 += k[38])) {
                boolean bl = k[39];
                bl -= k[40];
                this.setEnabled(bl += k[41]);
            }
        } else {
            int n8 = k[42];
            n8 += k[43];
            g = n8 += k[44];
        }
    }

    public final boolean handleAttack(@NotNull Entity target) {
        int n2 = k[45];
        n2 -= k[46];
        Intrinsics.checkNotNullParameter(target, (String)H[n2 -= k[47]]);
        if (!this.isEnabled()) {
            boolean bl = k[48];
            bl ^= k[49];
            return bl ^= k[50];
        }
        OtherClientPlayerEntity otherClientPlayerEntity = f;
        if (otherClientPlayerEntity == null) {
            boolean bl = k[51];
            bl += k[52];
            return bl -= k[53];
        }
        OtherClientPlayerEntity otherClientPlayerEntity2 = otherClientPlayerEntity;
        if (target.getId() != otherClientPlayerEntity2.getId()) {
            boolean bl = k[54];
            bl += k[55];
            return bl += k[56];
        }
        if (otherClientPlayerEntity2.hurtTime != 0) {
            boolean bl = k[57];
            bl -= k[58];
            return bl -= k[59];
        }
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            boolean bl = k[60];
            bl += k[61];
            return bl += k[62];
        }
        ClientWorld clientWorld2 = clientWorld;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            boolean bl = k[63];
            bl ^= k[64];
            return bl += k[65];
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        float f2 = clientPlayerEntity2.getAttackCooldownProgress(0.5f);
        this.playAttackFeedback(clientWorld2, clientPlayerEntity2, f2);
        DamageSource damageSource = clientPlayerEntity2.getDamageSources().playerAttack((PlayerEntity)clientPlayerEntity2);
        float f3 = f2 >= 0.85f ? this.calculateMeleeDamage(clientPlayerEntity2, otherClientPlayerEntity2, f2) : 1.0f;
        Intrinsics.checkNotNull(damageSource);
        this.applySimulatedDamage(otherClientPlayerEntity2, f3, damageSource);
        clientPlayerEntity2.resetLastAttackedTicks();
        EventManager.INSTANCE.post(new AttackEvent((Entity)otherClientPlayerEntity2));
        boolean bl = k[66];
        bl += k[67];
        return bl ^= k[68];
    }

    public final void handleExplosion(@NotNull ExplosionS2CPacket packet) {
        int n2 = k[69];
        n2 ^= k[70];
        Intrinsics.checkNotNullParameter(packet, (String)H[n2 ^= k[71]]);
        if (!this.isEnabled()) {
            return;
        }
        OtherClientPlayerEntity otherClientPlayerEntity = f;
        if (otherClientPlayerEntity == null) {
            return;
        }
        OtherClientPlayerEntity otherClientPlayerEntity2 = otherClientPlayerEntity;
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        if (otherClientPlayerEntity2.hurtTime != 0) {
            return;
        }
        Vec3d vec3d = packet.center();
        int n3 = k[72];
        n3 ^= k[73];
        Intrinsics.checkNotNullExpressionValue(vec3d, (String)H[n3 ^= k[74]]);
        float f2 = this.estimateExplosionDamage(vec3d, otherClientPlayerEntity2);
        if (f2 <= 0.0f) {
            return;
        }
        DamageSource damageSource = clientWorld2.getDamageSources().generic();
        int n4 = k[75];
        n4 += k[76];
        Intrinsics.checkNotNullExpressionValue(damageSource, (String)H[n4 ^= k[77]]);
        this.applySimulatedDamage(otherClientPlayerEntity2, f2, damageSource);
    }

    public final boolean isFakePlayer(@Nullable Entity entity) {
        int n2;
        OtherClientPlayerEntity otherClientPlayerEntity = f;
        if (otherClientPlayerEntity == null) {
            boolean bl = k[78];
            bl ^= k[79];
            return bl ^= k[80];
        }
        OtherClientPlayerEntity otherClientPlayerEntity2 = otherClientPlayerEntity;
        if (entity != null && entity.getId() == otherClientPlayerEntity2.getId()) {
            int n3 = k[81];
            n3 -= k[82];
            n2 = n3 += k[83];
        } else {
            int n4 = k[84];
            n4 += k[85];
            n2 = n4 += k[86];
        }
        return n2 != 0;
    }

    private final void spawnFakePlayer() {
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            return;
        }
        ClientWorld clientWorld2 = clientWorld;
        this.removeFakePlayer();
        OtherClientPlayerEntity otherClientPlayerEntity = new OtherClientPlayerEntity(clientWorld2, new GameProfile(D, this.configuredName()));
        int n2 = k[87];
        n2 -= k[88];
        otherClientPlayerEntity.setId(n2 -= k[89]);
        otherClientPlayerEntity.copyPositionAndRotation((Entity)clientPlayerEntity2);
        otherClientPlayerEntity.setYaw(clientPlayerEntity2.getYaw());
        otherClientPlayerEntity.setPitch(clientPlayerEntity2.getPitch());
        otherClientPlayerEntity.setHeadYaw(clientPlayerEntity2.headYaw);
        otherClientPlayerEntity.setBodyYaw(clientPlayerEntity2.bodyYaw);
        otherClientPlayerEntity.setVelocity(Vec3d.ZERO);
        otherClientPlayerEntity.setOnGround(clientPlayerEntity2.isOnGround());
        otherClientPlayerEntity.setPose(clientPlayerEntity2.getPose());
        otherClientPlayerEntity.setSneaking(clientPlayerEntity2.isSneaking());
        otherClientPlayerEntity.setSprinting(clientPlayerEntity2.isSprinting());
        otherClientPlayerEntity.setSwimming(clientPlayerEntity2.isSwimming());
        boolean bl = k[90];
        bl -= k[91];
        otherClientPlayerEntity.setInvisible(bl ^= k[92]);
        otherClientPlayerEntity.setHealth(otherClientPlayerEntity.getMaxHealth());
        int n3 = k[93];
        n3 += k[94];
        otherClientPlayerEntity.hurtTime = n3 ^= k[95];
        int n4 = k[96];
        n4 += k[97];
        otherClientPlayerEntity.maxHurtTime = n4 -= k[98];
        int n5 = k[99];
        n5 -= k[100];
        otherClientPlayerEntity.deathTime = n5 -= k[101];
        int n6 = k[102];
        n6 += k[103];
        otherClientPlayerEntity.timeUntilRegen = n6 ^= k[104];
        int n7 = k[105];
        n7 -= k[106];
        otherClientPlayerEntity.handSwinging = n7 ^= k[107];
        if (((Boolean)e.getValue()).booleanValue()) {
            this.copyInventory(otherClientPlayerEntity, clientPlayerEntity2);
        }
        otherClientPlayerEntity.setStackInHand(Hand.OFF_HAND, new ItemStack((ItemConvertible)Items.TOTEM_OF_UNDYING));
        clientWorld2.addEntity((Entity)otherClientPlayerEntity);
        this.applyBuffs(otherClientPlayerEntity);
        F = clientWorld2;
        f = otherClientPlayerEntity;
        int n8 = k[108];
        n8 ^= k[109];
        g = n8 += k[110];
    }

    private final void applyBuffs(OtherClientPlayerEntity fake) {
        int n2 = k[111];
        n2 ^= k[112];
        int n3 = k[114];
        n3 ^= k[115];
        fake.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, n2 += k[113], n3 -= k[116]));
        int n4 = k[117];
        n4 ^= k[118];
        int n5 = k[120];
        n5 ^= k[121];
        fake.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, n4 -= k[119], n5 ^= k[122]));
        int n6 = k[123];
        n6 ^= k[124];
        int n7 = k[126];
        n7 -= k[127];
        fake.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, n6 += k[125], n7 -= k[128]));
    }

    private final void copyInventory(OtherClientPlayerEntity fake, ClientPlayerEntity player) {
        fake.setStackInHand(Hand.MAIN_HAND, player.getMainHandStack().copy());
        fake.setStackInHand(Hand.OFF_HAND, player.getOffHandStack().copy());
        int n2 = k[129];
        n2 ^= k[130];
        int n3 = k[132];
        n3 += k[133];
        fake.getInventory().setStack(n2 += k[131], player.getInventory().getStack(n3 -= k[134]).copy());
        int n4 = k[135];
        n4 ^= k[136];
        int n5 = k[138];
        n5 -= k[139];
        fake.getInventory().setStack(n4 ^= k[137], player.getInventory().getStack(n5 += k[140]).copy());
        int n6 = k[141];
        n6 ^= k[142];
        int n7 = k[144];
        n7 ^= k[145];
        fake.getInventory().setStack(n6 ^= k[143], player.getInventory().getStack(n7 -= k[146]).copy());
        int n8 = k[147];
        n8 += k[148];
        int n9 = k[150];
        n9 ^= k[151];
        fake.getInventory().setStack(n8 += k[149], player.getInventory().getStack(n9 -= k[152]).copy());
    }

    private final float calculateMeleeDamage(ClientPlayerEntity player, OtherClientPlayerEntity fake, float cooldown) {
        DamageSource damageSource = player.getWeaponStack().getItem().getDamageSource((LivingEntity)player);
        if (damageSource == null) {
            damageSource = player.getDamageSources().playerAttack((PlayerEntity)player);
        }
        DamageSource damageSource2 = damageSource;
        float f2 = (float)player.getAttributeValue(EntityAttributes.ATTACK_DAMAGE);
        f2 *= 0.2f + cooldown * cooldown * 0.8f;
        f2 += player.getWeaponStack().getItem().getBonusAttackDamage((Entity)fake, f2, damageSource2) * cooldown;
        if (this.shouldPlayCriticalSound(player)) {
            f2 *= 1.5f;
        }
        return RangesKt.coerceAtLeast(DamageUtil.getDamageLeft((LivingEntity)((LivingEntity)fake), (float)RangesKt.coerceAtLeast(f2, 0.0f), (DamageSource)damageSource2, (float)fake.getArmor(), (float)((float)fake.getAttributeValue(EntityAttributes.ARMOR_TOUGHNESS))), 0.0f);
    }

    private final float estimateExplosionDamage(Vec3d center, OtherClientPlayerEntity fake) {
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            return 0.0f;
        }
        ClientWorld clientWorld2 = clientWorld;
        double d2 = Double.longBitsToDouble(0x5EFBB15F8C7D6552L ^ 0x1ED3B15F8C7D6552L);
        double d3 = center.distanceTo(fake.getPos());
        if (d3 > d2) {
            return 0.0f;
        }
        double d4 = this.calculateExposure(center, fake);
        if (d4 <= 0.0) {
            return 0.0f;
        }
        double d5 = RangesKt.coerceAtLeast(1.0 - d3 / d2, 0.0) * d4;
        float f2 = (float)((d5 * d5 + d5) / Double.longBitsToDouble(0x41B65F44CAA91F9CL ^ 0x1B65F44CAA91F9CL) * Double.longBitsToDouble(0xBB988F69AE45CCCAL ^ 0xFB848F69AE45CCCAL) * d2 + 1.0);
        return RangesKt.coerceAtLeast(DamageUtil.getDamageLeft((LivingEntity)((LivingEntity)fake), (float)f2, (DamageSource)clientWorld2.getDamageSources().generic(), (float)fake.getArmor(), (float)((float)fake.getAttributeValue(EntityAttributes.ARMOR_TOUGHNESS))), 0.0f);
    }

    private final double calculateExposure(Vec3d center, OtherClientPlayerEntity fake) {
        long l2 = -4341948608462320447L;
        long l3 = 6095486258656117288L;
        long l4 = -4578260405605317804L;
        long l5 = -2633792583082547069L;
        long l6 = -8350754622255261601L;
        long l7 = -1955470456940626572L;
        long l8 = -7119245399630895695L;
        long l9 = -2472407682255428790L;
        long l10 = 113618877596011366L;
        long l11 = -8708284155121674622L;
        long l12 = -1445950396790440071L;
        long l13 = 3060131790545738110L;
        long l14 = -2922813141426716003L;
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            return 0.0;
        }
        ClientWorld clientWorld2 = clientWorld;
        Box box = fake.getBoundingBox();
        long l15 = l13;
        int n2 = k[153];
        n2 ^= k[154];
        l13 = l15 ^ (3L ^ l15) & -1L >>> (n2 -= k[155]);
        long l16 = l14;
        int n3 = k[156];
        n3 ^= k[157];
        long l17 = l14 = l16 ^ (0L ^ l16) & -1L << (n3 += k[158]);
        int n4 = k[159];
        n4 += k[160];
        l14 = l17 ^ (0L ^ l17) & -1L >>> (n4 ^= k[161]);
        long l18 = l11;
        int n5 = k[162];
        n5 += k[163];
        l11 = l18 ^ (0L ^ l18) & -1L << (n5 ^= k[164]);
        while (true) {
            int n6 = k[165];
            n6 += k[166];
            if ((int)(l11 >>> (n6 -= k[167])) >= (int)l13) break;
            long l19 = l12;
            int n7 = k[168];
            n7 -= k[169];
            l12 = l19 ^ (0L ^ l19) & -1L << (n7 ^= k[170]);
            while (true) {
                int n8 = k[171];
                n8 += k[172];
                if ((int)(l12 >>> (n8 -= k[173])) >= (int)l13) break;
                long l20 = l13;
                int n9 = k[174];
                n9 ^= k[175];
                l13 = l20 ^ (0L ^ l20) & -1L << (n9 -= k[176]);
                while (true) {
                    int n10 = k[177];
                    n10 ^= k[178];
                    if ((int)(l13 >>> (n10 += k[179])) >= (int)l13) break;
                    int n11 = k[180];
                    n11 -= k[181];
                    int n12 = k[183];
                    n12 ^= k[184];
                    int n13 = k[186];
                    n13 -= k[187];
                    Vec3d vec3d = new Vec3d(this.lerpBox(box.minX, box.maxX, (int)(l11 >>> (n11 ^= k[182])), (int)l13), this.lerpBox(box.minY, box.maxY, (int)(l12 >>> (n12 += k[185])), (int)l13), this.lerpBox(box.minZ, box.maxZ, (int)(l13 >>> (n13 ^= k[188])), (int)l13));
                    BlockHitResult blockHitResult = clientWorld2.raycast(new RaycastContext(vec3d, center, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)fake));
                    if (blockHitResult.getType() == HitResult.Type.MISS) {
                        l14 += 0x100000000L;
                    }
                    long l21 = l14;
                    int n14 = k[189];
                    n14 -= k[190];
                    int n15 = k[192];
                    n15 -= k[193];
                    l14 = l21 ^ (l21 ^ l21 + (long)(n14 += k[191])) & -1L >>> (n15 ^= k[194]);
                    l13 += 0x100000000L;
                }
                l12 += 0x100000000L;
            }
            l11 += 0x100000000L;
        }
        if ((int)l14 == 0) {
            return 0.0;
        }
        int n16 = k[195];
        n16 ^= k[196];
        return (double)((int)(l14 >>> (n16 ^= k[197]))) / (double)((int)l14);
    }

    private final double lerpBox(double min, double max, int index, int steps) {
        int n2 = k[198];
        n2 -= k[199];
        if (steps <= (n2 -= k[200])) {
            return (min + max) * Double.longBitsToDouble(0xDC1847881F78F6E6L ^ 0xE3F847881F78F6E6L);
        }
        int n3 = k[201];
        n3 += k[202];
        double d2 = (double)index / (double)(steps - (n3 -= k[203]));
        return min + (max - min) * d2;
    }

    private final void applySimulatedDamage(OtherClientPlayerEntity fake, float damage, DamageSource damageSource) {
        block3: {
            long l2 = 1267040201208194933L;
            if (damage <= 0.0f) {
                return;
            }
            fake.onDamaged(damageSource);
            float f2 = fake.getHealth() + fake.getAbsorptionAmount() - damage;
            fake.setHealth(f2);
            this.applyLocalHurtFeedback(fake, damageSource);
            if (!fake.isDead()) {
                return;
            }
            int n2 = k[204];
            n2 += k[205];
            int n3 = k[207];
            n3 += k[208];
            Intrinsics.checkNotNull(fake, (String)H[n2 += k[206]] + (String)H[n3 -= k[209]]);
            if (!((LivingEntityInvoker)fake).rain$tryUseDeathProtector(damageSource)) break block3;
            fake.setHealth(10.0f);
            ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
            if (clientPlayerEntity != null && (clientPlayerEntity = clientPlayerEntity.networkHandler) != null) {
                ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
                long l3 = l2;
                int n4 = k[210];
                n4 -= k[211];
                l2 = l3 ^ (0L ^ l3) & -1L << (n4 -= k[212]);
                byte by = k[213];
                by -= k[214];
                new EntityStatusS2CPacket((Entity)fake, by ^= k[215]).apply((ClientPlayPacketListener)clientPlayerEntity2);
            }
        }
    }

    private final String configuredName() {
        String string;
        int n2;
        String string2;
        long l2 = 4789639002182258252L;
        String string3 = string2 = ((Object)StringsKt.trim((CharSequence)((String)E.getValue()))).toString();
        long l3 = l2;
        int n3 = k[216];
        n3 += k[217];
        l2 = l3 ^ (0L ^ l3) & -1L << (n3 -= k[218]);
        if (((CharSequence)string3).length() > 0) {
            int n4 = k[219];
            n4 += k[220];
            n2 = n4 ^= k[221];
        } else {
            int n5 = k[222];
            n5 -= k[223];
            n2 = n5 -= k[224];
        }
        if ((string = n2 != 0 ? string2 : null) == null) {
            int n6 = k[225];
            n6 += k[226];
            string = (String)H[n6 -= k[227]];
        }
        return string;
    }

    private final void playAttackFeedback(ClientWorld world, ClientPlayerEntity player, float cooldown) {
        SoundEvent soundEvent = this.attackSound(player, cooldown);
        world.playSoundFromEntityClient((Entity)player, soundEvent, SoundCategory.PLAYERS, 1.0f, 1.0f);
    }

    private final SoundEvent attackSound(ClientPlayerEntity player, float cooldown) {
        SoundEvent soundEvent;
        if (this.shouldPlayCriticalSound(player)) {
            SoundEvent soundEvent2 = SoundEvents.ENTITY_PLAYER_ATTACK_CRIT;
            soundEvent = soundEvent2;
            int n2 = k[228];
            n2 ^= k[229];
            int n3 = k[231];
            n3 ^= k[232];
            Intrinsics.checkNotNullExpressionValue(soundEvent2, (String)H[n2 ^= k[230]] + (String)H[n3 ^= k[233]]);
        } else if (player.isSprinting() && cooldown >= 0.9f) {
            SoundEvent soundEvent3 = SoundEvents.ENTITY_PLAYER_ATTACK_KNOCKBACK;
            soundEvent = soundEvent3;
            int n4 = k[234];
            n4 -= k[235];
            int n5 = k[237];
            n5 += k[238];
            Intrinsics.checkNotNullExpressionValue(soundEvent3, (String)H[n4 -= k[236]] + (String)H[n5 ^= k[239]]);
        } else if (cooldown >= 0.9f) {
            SoundEvent soundEvent4 = SoundEvents.ENTITY_PLAYER_ATTACK_STRONG;
            soundEvent = soundEvent4;
            int n6 = k[240];
            n6 -= k[241];
            int n7 = k[243];
            n7 ^= k[244];
            int n8 = k[246];
            n8 ^= k[247];
            Intrinsics.checkNotNullExpressionValue(soundEvent4, (String)H[n6 ^= k[242]] + (String)H[n7 += k[245]] + (String)H[n8 -= k[248]]);
        } else {
            SoundEvent soundEvent5 = SoundEvents.ENTITY_PLAYER_ATTACK_WEAK;
            soundEvent = soundEvent5;
            int n9 = k[249];
            n9 ^= k[250];
            int n10 = k[252];
            n10 += k[253];
            Intrinsics.checkNotNullExpressionValue(soundEvent5, (String)H[n9 += k[251]] + (String)H[n10 ^= k[254]]);
        }
        return soundEvent;
    }

    private final boolean shouldPlayCriticalSound(ClientPlayerEntity player) {
        int n2;
        if (!(!(player.fallDistance > 0.0) || player.isOnGround() || player.isClimbing() || player.isTouchingWater() || player.hasVehicle() || player.isSprinting() || player.hasStatusEffect(StatusEffects.BLINDNESS))) {
            int n3 = k[255];
            n3 -= k[256];
            n2 = n3 += k[257];
        } else {
            int n4 = k[258];
            n4 += k[259];
            n2 = n4 -= k[260];
        }
        return n2 != 0;
    }

    private final void applyLocalHurtFeedback(OtherClientPlayerEntity fake, DamageSource damageSource) {
        int n2 = k[261];
        n2 += k[262];
        fake.hurtTime = n2 -= k[263];
        int n3 = k[264];
        n3 += k[265];
        fake.maxHurtTime = n3 += k[266];
        int n4 = k[267];
        n4 += k[268];
        fake.timeUntilRegen = n4 ^= k[269];
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        fake.animateDamage(clientPlayerEntity != null ? clientPlayerEntity.getYaw() : fake.getYaw());
        int n5 = k[270];
        n5 += k[271];
        int n6 = k[273];
        n6 += k[274];
        Intrinsics.checkNotNull(fake, (String)H[n5 ^= k[272]] + (String)H[n6 ^= k[275]]);
        ((LivingEntityInvoker)fake).rain$playHurtSound(damageSource);
    }

    private final void removeFakePlayer() {
        OtherClientPlayerEntity otherClientPlayerEntity = f;
        if (otherClientPlayerEntity == null) {
            return;
        }
        OtherClientPlayerEntity otherClientPlayerEntity2 = otherClientPlayerEntity;
        ClientWorld clientWorld = F;
        if (clientWorld != null) {
            clientWorld.removeEntity(otherClientPlayerEntity2.getId(), Entity.RemovalReason.DISCARDED);
        }
        otherClientPlayerEntity2.remove(Entity.RemovalReason.DISCARDED);
        f = null;
        F = null;
    }

    static {
        FakePlayerModule.b();
        long l2 = -8469039791124553045L;
        long l3 = -8165445922198007777L;
        long l4 = 5149082726367179233L;
        long l5 = -6763462558819924384L;
        long l6 = 922777760539263245L;
        long l7 = -7675567574954913315L;
        long l8 = -2968336379717887666L;
        long l9 = 1452620563575476478L;
        long l10 = 896234644551271449L;
        long l11 = 4611921072935376922L;
        long l12 = -4835102498479411784L;
        long l13 = 8574899677208009477L;
        long l14 = 3082853389026884341L;
        long l15 = 8895087397648145389L;
        int n2 = k[276];
        n2 ^= k[277];
        H = new Object[n2 ^= k[278]];
        long l16 = l15;
        int n3 = k[279];
        n3 ^= k[280];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= k[281]);
        Object[] objectArray = new Object[k[282]];
        objectArray[FakePlayerModule.k[283]] = i;
        objectArray[FakePlayerModule.k[284]] = k[285];
        int n4 = k[286];
        Object object = FakePlayerModule.A()[k[287]];
        if (object == null) {
            char[] cArray = "\u117f\u119f\u1186\u11a4\u1466\u142f\u1465\u144b\u1433\u144c\u1452\u145c\u1435\u144f\u116b\u1432\u1184\u117a\u117f\u116c\u142a\u11a0\u1466\u1468\u1187\u116b\u144e\u1789\u144d\u1432\u1467\u1793\u11a4\u1450\u1ada\u1467\u1466\u117f\u17bc\u1466\u1434\u11a4\u1449\u1452\u144b\u178a\u142d\u1188\u1ade\u17bb\u142f\u1453\u144d\u144b\u117f\u116c\u1453\u17c5\u1ad9\u1179\u1432\u1789\u142a\u1789\u1433\u117e\u1180\u17bc\u1434\u1793\u1434\u1432\u117f\u17c5\u119e\u17c6\u144c\u142e\u119d\u117a\u1179\u1435\u1434\u1450\u142d\u1449\u117a\u1179\u17bb\u1180\u1451\u1466\u17ab\u1795\u1186\u142a\u117f\u116c\u119f\u142a\u1795\u1789\u1180\u1432\u17c6\u1465\u17bc\u178a\u119f\u1179\u1ada\u144e\u1ade\u1466\u1430\u145c\u1ad9\u145c\u117f\u1187\u142d\u1434\u144c\u1ada\u1188\u144b\u117a\u1adf\u17c7\u142d\u145b\u144a\u1465\u1ade\u145c\u144d\u117d\u116c\u142f\u17ac\u1467\u144f\u142f\u1468\u11a4\u1185\u1184\u1adf\u17ac\u119e\u17bb\u17c5\u1434\u1789\u116c\u119f\u145c\u17c7\u119e\u1450\u142f\u144f\u144b\u1430\u17ac\u17ac\u1add\u1795\u1449\u119e\u144b\u1187\u11a4\u1429\u1ade\u1434\u1ae0\u117d\u142a\u1179\u142f\u17c6\u144c\u1187\u1793\u117e\u144a\u1465\u144d\u1ad9\u1453\u119e\u17bc\u142f\u1429\u17ab\u17ac\u144a\u1ae0\u1add\u17bc\u11a4\u1432\u142a\u17c7\u117a\u17c6\u142e\u1ade\u1ae0\u17c6\u1179\u1789\u1ad9\u144c\u1add\u1449\u178a\u1adf\u1adf\u116b\u117a\u142a\u1ade\u1795\u1431\u1430\u117d\u17bc\u1ada\u117f\u144e\u1429\u142d\u1454\u1468\u1ada\u144c\u1ae0\u17c7\u17ab\u119d\u1ade\u142a\u1187\u17ab\u17c5\u1185\u142a\u144b\u1449\u1ae0\u142a\u1180\u1429\u1431\u1186\u1795\u1466\u142d\u116b\u1793\u119e\u11a0\u1179\u117e\u1186\u1454\u1188\u17c7\u145b\u17ac\u1435\u1add\u1467\u116b\u1188\u145b\u1ade\u17ab\u1184\u178a\u17ac\u1ada\u119f\u1433\u1179\u117f\u17c6\u117f\u142e\u1795\u117a\u1449\u1186\u144d\u144f\u1795\u144f\u1187\u117d\u11a0\u1432\u1180\u1179\u1451\u1ada\u1433\u1450\u17c5\u117f\u116b\u1467\u17c6\u17bb\u142e\u17c6\u1435\u11a0\u1432\u1431\u145b\u1789\u117a\u1452\u144c\u1187\u1ade\u1adf\u1433\u1789\u117e\u1434\u1185\u145c\u1185\u117e\u1ade\u17c5\u117d\u17c5\u1adf\u1adf\u117d\u11a0\u17bb\u1ade\u145b\u1188\u11a0\u1add\u116c\u1793\u144c\u1452\u1187\u144b\u1188\u17ac\u1795\u1ada\u1452\u116c\u117e\u17c7\u144b\u1450\u11a4\u145b\u1185\u1452\u116b\u144e\u119e\u17bc\u1430\u1ada\u1ad9\u178a\u178a\u17ab\u1179\u1450\u116b\u142e\u1185\u119d\u117a\u142a\u144d\u1adf\u1ade\u142e\u117f\u142a\u1467\u1ada\u144f\u1187\u17bb\u142a\u1186\u1ada\u1429\u17ab\u1451\u178a\u1add\u1468\u1adf\u11a4\u142f\u119f\u1180\u144b\u1454\u144e\u178a\u116b\u1434\u145b\u17c7\u1466\u17bc\u119d\u1ade\u1432\u1adf\u1188\u1ade\u1450\u17bc\u116c\u1ade\u1179\u1451\u142f\u142f\u142d\u11a4\u1429\u1454\u142e\u17ab\u1adf\u11a0\u116b\u116b\u1ad9\u1433\u142a\u144e\u1ad9\u1adf\u11a0\u178a\u17bc\u1435\u1449\u1429\u1793\u142d\u17ac\u1454\u17bc\u1179\u1adf\u142e\u1add\u142d\u1184\u178a\u17bc\u145c\u178a\u1453\u117e\u142f\u142f\u1452\u1add\u1789\u1433\u144d\u1453\u1187\u1186\u17ab\u1793\u1188\u17bb\u11a4\u1ae0\u119e\u1452\u1434\u1466\u1466\u1185\u144a\u1795\u144f\u1453\u1429\u1450\u1449\u1ada\u142e\u17ab\u117d\u1466\u1789\u1ae0\u1431\u17c7\u144a\u1ad9\u1430\u1ad9\u144d\u1add\u17ac\u1adf\u119e\u1add\u144c\u117a\u144d\u17c7\u1467\u1186\u1451\u117a\u1450\u119e\u117d\u117f\u1adf\u119e\u1184\u1add\u142d\u1450\u1467\u144e\u142a\u1454\u119f\u1434\u1434\u1430\u1ade\u116c\u1180\u1465\u17c7\u1465\u117d\u116b\u145b\u142e\u1449\u116b\u117a\u119d\u1434\u1451\u1449\u144c\u17ac\u1179\u1433\u1430\u17ac\u144b\u1187\u17c5\u119d\u142d\u142a\u1179\u17c7\u116b\u1453\u144d\u17c7\u1429\u1ad9\u1466\u142d\u119f\u142a\u1432\u119d\u1466\u145c\u1ae0\u116b\u142e\u1adf\u1187\u1188\u117e\u1ad9\u1add\u119f\u1adf\u1432\u116c\u142a\u1186\u1185\u1186\u17c6\u144e\u145b\u1186\u1454\u142e\u1188\u1180\u1ade\u178a\u144f\u17c7\u1187\u144e\u116c\u1435\u1793\u144f\u1449\u117a\u142d\u1453\u1450\u17c7\u142a\u117e\u119d\u1ade\u1465\u1450\u117d\u17c7\u117f\u1467\u1452\u1ad9\u119e\u1adf\u1ade\u11a4\u144d\u17ab\u117e\u17bc\u1429\u116c\u144f\u1184\u144b\u117f\u1adf\u1452\u1add\u1429\u1179\u1432\u142a\u11a0\u142a\u144d\u1465\u17ab\u17ab\u1186\u1795\u1432\u1451\u1429\u1795\u17ac\u17bc\u17ac\u1ada\u1188\u1793\u145c\u1454\u1add\u1793\u1ad9\u1435\u1184\u144c\u144a\u1185\u1431\u17bb\u17bc\u11a4\u1452\u119e\u11a0\u142a\u1179\u1180\u1432\u1188\u145b\u1429\u17ac\u1793\u1188\u1184\u117a\u144f\u17ab\u1184\u119d\u142d\u1ad9\u116c\u11a0\u117f\u1185\u1429\u1435\u144c\u1451\u17c7\u145b\u1187\u178a\u11a4\u116b\u117d\u142e\u1793\u1434\u142a\u1795\u1ade\u145b\u144c\u17c6\u1ae1".toCharArray();
            for (int i2 = k[288]; i2 < k[289]; ++i2) {
                int n5 = cArray[i2];
                n5 += k[290];
                n5 += k[291];
                n5 += k[292];
                n5 -= k[293];
                n5 -= k[294];
                n5 -= k[295];
                n5 += k[296];
                n5 ^= k[297];
                n5 -= k[298];
                n5 ^= k[299];
                n5 -= k[300];
                n5 ^= k[301];
                cArray[i2] = (char)(n5 -= k[302]);
            }
            object = FakePlayerModule.A()[FakePlayerModule.k[303]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)FakePlayerModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = k[304];
        n6 -= k[305];
        l6 = l17 ^ (0x1E100000000L ^ l17) & -1L << (n6 += k[306]);
        long l18 = l13;
        int n7 = k[307];
        n7 += k[308];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= k[309]);
        while (true) {
            int n8 = k[310];
            n8 += k[311];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= k[312]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = k[313];
            n10 -= k[314];
            int n11 = k[316];
            n11 += k[317];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= k[315])) & -1L >>> (n11 ^= k[318]);
            long l20 = l9;
            int n12 = k[319];
            n12 ^= k[320];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= k[321]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = k[322];
            n14 -= k[323];
            int n15 = k[325];
            n15 += k[326];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= k[324])) & -1L >>> (n15 -= k[327]);
            int n16 = k[328];
            n16 -= k[329];
            long l22 = l10;
            int n17 = k[331];
            n17 ^= k[332];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= k[330]) ^ l22) & -1L << (n17 ^= k[333]);
            int n18 = k[334];
            n18 += k[335];
            n18 -= k[336];
            int n19 = k[337];
            n19 ^= k[338];
            long l23 = l12;
            int n20 = k[340];
            n20 -= k[341];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= k[339]))) ^ l23) & -1L >>> (n20 ^= k[342]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = k[343];
            n21 ^= k[344];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += k[345]);
            while (true) {
                int n22 = k[346];
                n22 += k[347];
                if ((int)(l14 >>> (n22 ^= k[348])) >= (int)l12) break;
                int n23 = k[349];
                n23 += k[350];
                int n24 = k[352];
                n24 += k[353];
                cArray2[(int)(l14 >>> (n23 += FakePlayerModule.k[351]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += k[354]))];
                l14 += 0x100000000L;
            }
            int n25 = k[355];
            n25 -= k[356];
            int n26 = (int)(l15 >>> (n25 -= k[357]));
            l15 += 0x100000000L;
            FakePlayerModule.H[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = k[358];
            n27 += k[359];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= k[360]);
        }
        INSTANCE = new FakePlayerModule();
        int n28 = k[361];
        n28 += k[362];
        int n29 = k[364];
        n29 -= k[365];
        UUID uUID = UUID.fromString((String)H[n28 += k[363]] + (String)H[n29 ^= k[366]]);
        int n30 = k[367];
        n30 ^= k[368];
        Intrinsics.checkNotNullExpressionValue(uUID, (String)H[n30 ^= k[369]]);
        D = uUID;
        int n31 = k[370];
        n31 += k[371];
        boolean bl = k[373];
        bl += k[374];
        e = INSTANCE.cfr_renamed_0((String)H[n31 -= k[372]], bl -= k[375]);
        int n32 = k[376];
        n32 ^= k[377];
        int n33 = k[379];
        n33 -= k[380];
        int n34 = k[382];
        n34 ^= k[383];
        E = INSTANCE.text((String)H[n32 += k[378]], (String)H[n33 ^= k[381]], n34 ^= k[384]);
        h = Vec3d.ZERO;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[k[385]];
        String string = (String)object[k[386]];
        object = object[k[387]];
        Object[] objectArray = j;
        if (j == null) {
            objectArray = j = new Object[k[388]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[k[389]];
                i = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[k[391] ^ k[392]];
                byArray[FakePlayerModule.k[393] ^ FakePlayerModule.k[394]] = k[395] ^ k[396];
                byArray[FakePlayerModule.k[397] ^ FakePlayerModule.k[398]] = k[399] ^ 0x4229;
                byArray[0xE804 ^ 0xE800] = 0xFFFF17EE ^ 0xE800;
                byArray[0x8A2A ^ 0x8A27] = 0xFFFF759A ^ 0x8A27;
                byArray[0xE4CA ^ 0xE4C8] = 0xE4CB ^ 0xE4C8;
                byArray[0xA836 ^ 0xA83A] = 0xA816 ^ 0xA83A;
                byArray[0x7024 ^ 0x702E] = 0xFFFF8FDF ^ 0x702E;
                byArray[0x9CBE ^ 0x9CB5] = 0x9CEE ^ 0x9CB5;
                byArray[0x3600 ^ 0x360E] = 0xFFFFC9FD ^ 0x360E;
                byArray[0xC74 ^ 0xC7C] = 0xFFFFF386 ^ 0xC7C;
                byArray[0x6147 ^ 0x6148] = 0xFFFF9EF4 ^ 0x6148;
                byArray[0x177B ^ 0x177A] = 0x1704 ^ 0x177A;
                byArray[0xA60C ^ 0xA60C] = 0xA629 ^ 0xA60C;
                byArray[0x3277 ^ 0x3270] = 0xFFFFCDC2 ^ 0x3270;
                byArray[0xC86F ^ 0xC86C] = 0xFFFF37C5 ^ 0xC86C;
                byArray[0x87FD ^ 0x87FB] = 0x87DD ^ 0x87FB;
                objectArray2[FakePlayerModule.k[390]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (I == null) {
                byte[] byArray2 = new byte[0x6B88 ^ 0x6BA8];
                byArray2[0xAB73 ^ 0xAB66] = 0xAB7D ^ 0xAB66;
                byArray2[0x2600 ^ 0x2605] = 0x2625 ^ 0x2605;
                byArray2[0x1597 ^ 0x158F] = 0x15AC ^ 0x158F;
                byArray2[0x31D6 ^ 0x31D9] = 0xFFFFCE43 ^ 0x31D9;
                byArray2[0x9A52 ^ 0x9A53] = 0x9A0E ^ 0x9A53;
                byArray2[0x1E2D ^ 0x1E2A] = 0xFFFFE1B2 ^ 0x1E2A;
                byArray2[0x89A4 ^ 0x89A6] = 0xFFFF7661 ^ 0x89A6;
                byArray2[0xDBF0 ^ 0xDBFC] = 0xDBD7 ^ 0xDBFC;
                byArray2[0x162E ^ 0x1633] = 0xFFFFE9E7 ^ 0x1633;
                byArray2[0xA04C ^ 0xA058] = 0xA038 ^ 0xA058;
                byArray2[0xB598 ^ 0xB596] = 0xB5FF ^ 0xB596;
                byArray2[0x58E2 ^ 0x58F1] = 0xFFFFA72C ^ 0x58F1;
                byArray2[0xA5E2 ^ 0xA5F2] = 0xFFFF5A59 ^ 0xA5F2;
                byArray2[0xB9F3 ^ 0xB9E4] = 0xFFFF462A ^ 0xB9E4;
                byArray2[0xF3CF ^ 0xF3D0] = 0xF390 ^ 0xF3D0;
                byArray2[0x8E46 ^ 0x8E40] = 0xFFFF71B7 ^ 0x8E40;
                byArray2[0xBC01 ^ 0xBC1F] = 0xFFFF43E2 ^ 0xBC1F;
                byArray2[0x2337 ^ 0x233A] = 0x2333 ^ 0x233A;
                byArray2[0xB3D4 ^ 0xB3C2] = 0xFFFF4C45 ^ 0xB3C2;
                byArray2[0x105BD ^ 0x105BE] = 0xFFFEFA2C ^ 0x105BE;
                byArray2[0xC074 ^ 0xC07D] = 0xFFFF3FA7 ^ 0xC07D;
                byArray2[0x8BAC ^ 0x8BB6] = 0x8BD5 ^ 0x8BB6;
                byArray2[0xAC01 ^ 0xAC0A] = 0xAC62 ^ 0xAC0A;
                byArray2[0x9F23 ^ 0x9F3A] = 0xFFFF60FD ^ 0x9F3A;
                byArray2[0xADF0 ^ 0xADF8] = 0xFFFF5259 ^ 0xADF8;
                byArray2[0xBEC8 ^ 0xBEC8] = 0xFFFF4165 ^ 0xBEC8;
                byArray2[0xC686 ^ 0xC694] = 0xC68D ^ 0xC694;
                byArray2[0x1DC3 ^ 0x1DC9] = 0xFFFFE242 ^ 0x1DC9;
                byArray2[0x56F1 ^ 0x56ED] = 0xFFFFA92E ^ 0x56ED;
                byArray2[0x815 ^ 0x80E] = 0x83F ^ 0x80E;
                byArray2[0xE2A2 ^ 0xE2B3] = 0xFFFF1D1F ^ 0xE2B3;
                byArray2[0x1FCE ^ 0x1FCA] = 0x1F96 ^ 0x1FCA;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = FakePlayerModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u7112\u70dc\u70e1\u70c6\u70d0\u70ec\u70dd\u70bf\u70d6\u70ba\u70da\u70c3\u70c7\u70a9\u70f9\u70da\u70e7\u7137".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xEA11;
                        n3 += 51826;
                        n3 += 25443;
                        n3 ^= 0x6275;
                        n3 -= 26245;
                        n3 ^= 0x2316;
                        n3 -= 50266;
                        n3 ^= 0x440A;
                        n3 += 54347;
                        n3 += 37947;
                        cArray[i2] = (char)(n3 += 45276);
                    }
                    object4 = FakePlayerModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[4] = -50;
                byArray4[8] = -128;
                byArray4[11] = 75;
                byArray4[6] = -79;
                byArray4[9] = -115;
                byArray4[5] = 19;
                byArray4[15] = -39;
                byArray4[14] = -71;
                byArray4[7] = -28;
                byArray4[13] = -52;
                byArray4[2] = -29;
                byArray4[10] = 82;
                byArray4[12] = 77;
                byArray4[1] = -121;
                byArray4[3] = -89;
                byArray4[0] = -58;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 6, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = FakePlayerModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u263a\u263e\u260c".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 355;
                        n4 ^= 0x2AB5;
                        n4 ^= 0xB5F5;
                        n4 -= 53766;
                        n4 ^= 0x7C1A;
                        n4 ^= 0x2CBA;
                        n4 += 32634;
                        n4 += 33131;
                        n4 += 37213;
                        cArray[i3] = (char)(n4 += 46286);
                    }
                    object5 = FakePlayerModule.A()[2] = new String(cArray);
                }
                I = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = FakePlayerModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u75cf\u75d3\u753d\u7579\u75cd\u75cc\u75cd\u7579\u753e\u75d5\u75cd\u753d\u75a3\u753e\u752f\u7532\u7532\u7537\u7538\u7531".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 55776;
                    n5 ^= 0x9C81;
                    n5 ^= 0xAA3;
                    n5 -= 2762;
                    n5 += 48363;
                    n5 -= 51372;
                    n5 += 58446;
                    n5 -= 61871;
                    n5 ^= 0xBED0;
                    n5 += 38612;
                    n5 -= 30843;
                    n5 += 35419;
                    cArray[i4] = (char)(n5 += 92);
                }
                object6 = FakePlayerModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)I), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = J;
        if (J == null) {
            J = new Object[4];
            objectArray = J;
        }
        return objectArray;
    }

    public static void b() {
        k = new int[0x7918 ^ 0x7888];
        FakePlayerModule.k[0xB7EC ^ 0xB780] = 0xB7BD ^ 0xB780;
        FakePlayerModule.k[0xAE0A ^ 0xAE30] = 0xFFFF51C9 ^ 0xAE30;
        FakePlayerModule.k[0x945E ^ 0x943F] = 0xFFFF6BA4 ^ 0x943F;
        FakePlayerModule.k[0xBEC5 ^ 0xBFA3] = 0xBFA8 ^ 0xBFA3;
        FakePlayerModule.k[0xF44C ^ 0xF432] = 0xFFFF0BAD ^ 0xF432;
        FakePlayerModule.k[0x2FB4 ^ 0x2EDC] = 0x2E91 ^ 0x2EDC;
        FakePlayerModule.k[0x8E16 ^ 0x8F07] = 0xFFFF708A ^ 0x8F07;
        FakePlayerModule.k[0xA962 ^ 0xA871] = 0xFFFF57BB ^ 0xA871;
        FakePlayerModule.k[0xAE29 ^ 0xAEE5] = 0xFFFF5114 ^ 0xAEE5;
        FakePlayerModule.k[0x2142 ^ 0x203A] = 0xFFFFDFA2 ^ 0x203A;
        FakePlayerModule.k[0x3DF3 ^ 0x3C9C] = 0xFFFFC339 ^ 0x3C9C;
        FakePlayerModule.k[0x7221 ^ 0x727B] = 0xFFFF8DDB ^ 0x727B;
        FakePlayerModule.k[0xCDD8 ^ 0xCCC0] = 0xFFFF3346 ^ 0xCCC0;
        FakePlayerModule.k[0x1053E ^ 0x10570] = 0xFFFEFAD1 ^ 0x10570;
        FakePlayerModule.k[0xA9A0 ^ 0xA918] = 0xFFFF5684 ^ 0xA918;
        FakePlayerModule.k[0xB6F6 ^ 0xB789] = 0xFFFF4866 ^ 0xB789;
        FakePlayerModule.k[0x4973 ^ 0x4878] = 0x4846 ^ 0x4878;
        FakePlayerModule.k[0xE722 ^ 0xE720] = 0xE73F ^ 0xE720;
        FakePlayerModule.k[0x14D8 ^ 0x145A] = 0x144B ^ 0x145A;
        FakePlayerModule.k[0x4F28 ^ 0x4F1C] = 0x4F0F ^ 0x4F1C;
        FakePlayerModule.k[0xF3F2 ^ 0xF3DB] = 0xF3A0 ^ 0xF3DB;
        FakePlayerModule.k[0x803D ^ 0x81BD] = 0x8191 ^ 0x81BD;
        FakePlayerModule.k[0xFE4F ^ 0xFEBF] = 0xFFFF0151 ^ 0xFEBF;
        FakePlayerModule.k[0x1023A ^ 0x10219] = 0xFFFEFDFD ^ 0x10219;
        FakePlayerModule.k[0xAC66 ^ 0xACA8] = 0xACD6 ^ 0xACA8;
        FakePlayerModule.k[0x3893 ^ 0x38FA] = 0xFFFFC754 ^ 0x38FA;
        FakePlayerModule.k[0x7F1D ^ 0x7F13] = 0x7F7E ^ 0x7F13;
        FakePlayerModule.k[0x2CFA ^ 0x2D98] = 0xFFFFD24E ^ 0x2D98;
        FakePlayerModule.k[0x9031 ^ 0x912C] = 0x912C ^ 0x912C;
        FakePlayerModule.k[0xF1DB ^ 0xF1FA] = 0xFFFF0E41 ^ 0xF1FA;
        FakePlayerModule.k[0xD90 ^ 0xD06] = 0xD73 ^ 0xD06;
        FakePlayerModule.k[0xB3D0 ^ 0xB2D2] = 0xFFFF4D5E ^ 0xB2D2;
        FakePlayerModule.k[0x15F3 ^ 0x14F3] = 0xFFFFEB0A ^ 0x14F3;
        FakePlayerModule.k[0x10DEA ^ 0x10D2E] = 0x10D1C ^ 0x10D2E;
        FakePlayerModule.k[0x4CFC ^ 0x4CA9] = 0xFFFFB354 ^ 0x4CA9;
        FakePlayerModule.k[0x1C9A ^ 0x1CDB] = 0x1CE5 ^ 0x1CDB;
        FakePlayerModule.k[0xC072 ^ 0xC01D] = 0xFFFF18C8 ^ 0xC01D;
        FakePlayerModule.k[0x44B ^ 0x45C] = 0x473 ^ 0x45C;
        FakePlayerModule.k[0xB71C ^ 0xB627] = 0xB669 ^ 0xB627;
        FakePlayerModule.k[0xCB6 ^ 0xDA1] = 0xFFFFF227 ^ 0xDA1;
        FakePlayerModule.k[0xA01E ^ 0xA0BD] = 0xA0BD ^ 0xA0BD;
        FakePlayerModule.k[0x39E1 ^ 0x38AF] = 0xFFFFC706 ^ 0x38AF;
        FakePlayerModule.k[0x3567 ^ 0x3537] = 0xFFFFCAB5 ^ 0x3537;
        FakePlayerModule.k[0x2462 ^ 0x2568] = 0xFFFFDABD ^ 0x2568;
        FakePlayerModule.k[0xA7B2 ^ 0xA757] = 0xFFFF58BB ^ 0xA757;
        FakePlayerModule.k[0x6039 ^ 0x61BE] = 0x4E76 ^ 0x61BE;
        FakePlayerModule.k[0xC2 ^ 0x1EE] = 0xE358 ^ 0x1EE;
        FakePlayerModule.k[0x108DC ^ 0x10843] = 0x10877 ^ 0x10843;
        FakePlayerModule.k[0x5574 ^ 0x55E8] = 0xFFFFAA75 ^ 0x55E8;
        FakePlayerModule.k[0xF487 ^ 0xF4D0] = 0xFFFF5B25 ^ 0xF4D0;
        FakePlayerModule.k[0xBD1C ^ 0xBD8C] = 0xFFFF4278 ^ 0xBD8C;
        FakePlayerModule.k[0xCA8A ^ 0xCAB2] = 0xFFFF3522 ^ 0xCAB2;
        FakePlayerModule.k[0x70D9 ^ 0x7051] = 0xFFFF8FCA ^ 0x7051;
        FakePlayerModule.k[0x299 ^ 0x246] = 0x230 ^ 0x246;
        FakePlayerModule.k[0xE2D4 ^ 0xE22B] = 0xFFFF1DF6 ^ 0xE22B;
        FakePlayerModule.k[0xEDA8 ^ 0xECA5] = 0xEC9B ^ 0xECA5;
        FakePlayerModule.k[0x289C ^ 0x291F] = 0x291F ^ 0x291F;
        FakePlayerModule.k[0xE6 ^ 0xE9] = 0xFFFFFFB6 ^ 0xE9;
        FakePlayerModule.k[0xA523 ^ 0xA456] = 0xFFFF5BA5 ^ 0xA456;
        FakePlayerModule.k[0x832A ^ 0x83E9] = 0x83E4 ^ 0x83E9;
        FakePlayerModule.k[0xD140 ^ 0xD1E4] = 0xFFFF2E06 ^ 0xD1E4;
        FakePlayerModule.k[0xCBB3 ^ 0xCB66] = 0xCBD4 ^ 0xCB66;
        FakePlayerModule.k[0x2CD0 ^ 0x2C41] = 0xFFFFD38B ^ 0x2C41;
        FakePlayerModule.k[0x199B ^ 0x1929] = 0xFFFFE69D ^ 0x1929;
        FakePlayerModule.k[0xE6FE ^ 0xE6F4] = 0xFFFF192B ^ 0xE6F4;
        FakePlayerModule.k[0x479C ^ 0x4716] = 0x472F ^ 0x4716;
        FakePlayerModule.k[0xEA2D ^ 0xEB5E] = 0xFFFF14C3 ^ 0xEB5E;
        FakePlayerModule.k[0x9B06 ^ 0x9BCE] = 0x9BB0 ^ 0x9BCE;
        FakePlayerModule.k[0x40BE ^ 0x40A7] = 0xFFFFBF19 ^ 0x40A7;
        FakePlayerModule.k[0xAF1D ^ 0xAE0F] = 0xAE5D ^ 0xAE0F;
        FakePlayerModule.k[0xF0F7 ^ 0xF1F1] = 0xFFFF0E5F ^ 0xF1F1;
        FakePlayerModule.k[0xE61 ^ 0xF24] = 0xF10 ^ 0xF24;
        FakePlayerModule.k[0x4DCF ^ 0x4C9A] = 0xFFFFB363 ^ 0x4C9A;
        FakePlayerModule.k[0x31B0 ^ 0x3198] = 0x31DB ^ 0x3198;
        FakePlayerModule.k[0xFC66 ^ 0xFC32] = 0xFFFF03D2 ^ 0xFC32;
        FakePlayerModule.k[0x1057B ^ 0x1045D] = 0x1DF74 ^ 0x1045D;
        FakePlayerModule.k[0x6BD8 ^ 0x6B70] = 0x6B77 ^ 0x6B70;
        FakePlayerModule.k[0x2B92 ^ 0x2BF2] = 0x2B8F ^ 0x2BF2;
        FakePlayerModule.k[0x8B87 ^ 0x8B40] = 0x8B59 ^ 0x8B40;
        FakePlayerModule.k[0x6B57 ^ 0x6A58] = 0xFFFF9591 ^ 0x6A58;
        FakePlayerModule.k[0xEDB9 ^ 0xED2C] = 0xED54 ^ 0xED2C;
        FakePlayerModule.k[0x7D62 ^ 0x7C77] = 0x7C0C ^ 0x7C77;
        FakePlayerModule.k[0x6811 ^ 0x68FA] = 0x68B1 ^ 0x68FA;
        FakePlayerModule.k[0x5C95 ^ 0x5CAB] = 0x5C83 ^ 0x5CAB;
        FakePlayerModule.k[0x997A ^ 0x9948] = 0xFFFF66BE ^ 0x9948;
        FakePlayerModule.k[0x96BB ^ 0x96D1] = 0xFFFF692D ^ 0x96D1;
        FakePlayerModule.k[0x118E ^ 0x1080] = 0x10A1 ^ 0x1080;
        FakePlayerModule.k[0x2A82 ^ 0x2ADA] = 0x2AEB ^ 0x2ADA;
        FakePlayerModule.k[0x8F ^ 0x2D] = 0xFFFFFFEF ^ 0x2D;
        FakePlayerModule.k[0x2EB7 ^ 0x2FED] = 0xFFFFD084 ^ 0x2FED;
        FakePlayerModule.k[0x715A ^ 0x71B8] = 0x71BD ^ 0x71B8;
        FakePlayerModule.k[0xC712 ^ 0xC64C] = 0xC62C ^ 0xC64C;
        FakePlayerModule.k[0xD69B ^ 0xD7D4] = 0xD7C6 ^ 0xD7D4;
        FakePlayerModule.k[0xBADE ^ 0xBA3D] = 0xBA35 ^ 0xBA3D;
        FakePlayerModule.k[0xF0EA ^ 0xF0B6] = 0xFFFF0F61 ^ 0xF0B6;
        FakePlayerModule.k[0xC2A6 ^ 0xC22B] = 0xFFFF3DC8 ^ 0xC22B;
        FakePlayerModule.k[0x2426 ^ 0x24F7] = 0x249C ^ 0x24F7;
        FakePlayerModule.k[0x7D2B ^ 0x7C63] = 0x7C47 ^ 0x7C63;
        FakePlayerModule.k[0x3E37 ^ 0x3E37] = 0x3E2F ^ 0x3E37;
        FakePlayerModule.k[0x10877 ^ 0x10967] = 0xFFFEF68F ^ 0x10967;
        FakePlayerModule.k[0x1F27 ^ 0x1F8B] = 0xFFFFE029 ^ 0x1F8B;
        FakePlayerModule.k[0xB60B ^ 0xB750] = 0xB779 ^ 0xB750;
        FakePlayerModule.k[0xB01C ^ 0xB0D1] = 0xFFFF4F44 ^ 0xB0D1;
        FakePlayerModule.k[0x2CF7 ^ 0x2D90] = 0x2DF2 ^ 0x2D90;
        FakePlayerModule.k[0x2BE0 ^ 0x2B4E] = 0xFFFFD49C ^ 0x2B4E;
        FakePlayerModule.k[0x12FF ^ 0x1206] = 0x1214 ^ 0x1206;
        FakePlayerModule.k[0xD2CC ^ 0xD2FF] = 0xFFFF2D1D ^ 0xD2FF;
        FakePlayerModule.k[0x81A8 ^ 0x8089] = 0x8265 ^ 0x8089;
        FakePlayerModule.k[0x1273 ^ 0x1251] = 0x127B ^ 0x1251;
        FakePlayerModule.k[0xECB ^ 0xFD5] = 0xFD7 ^ 0xFD5;
        FakePlayerModule.k[0x9B4E ^ 0x9B45] = 0x9B03 ^ 0x9B45;
        FakePlayerModule.k[0xB809 ^ 0xB81A] = 0xFFFF4788 ^ 0xB81A;
        FakePlayerModule.k[0xF6AB ^ 0xF7E9] = 0xF74C ^ 0xF7E9;
        FakePlayerModule.k[0x120A ^ 0x1387] = 0x51A7 ^ 0x1387;
        FakePlayerModule.k[0x5910 ^ 0x590A] = 0x5942 ^ 0x590A;
        FakePlayerModule.k[0xE4C6 ^ 0xE45B] = 0xE46B ^ 0xE45B;
        FakePlayerModule.k[0xC9D ^ 0xC65] = 0xC39 ^ 0xC65;
        FakePlayerModule.k[0x44C9 ^ 0x45FD] = 0xFFFFBA5C ^ 0x45FD;
        FakePlayerModule.k[0x5DDE ^ 0x5DAC] = 0xFFFFA262 ^ 0x5DAC;
        FakePlayerModule.k[0xF871 ^ 0xF92C] = 0xFFFF064B ^ 0xF92C;
        FakePlayerModule.k[0xB1CC ^ 0xB158] = 0xFFFF4EC2 ^ 0xB158;
        FakePlayerModule.k[0x342B ^ 0x346C] = 0x3435 ^ 0x346C;
        FakePlayerModule.k[0x5B87 ^ 0x5B31] = 0x5B14 ^ 0x5B31;
        FakePlayerModule.k[0xF050 ^ 0xF159] = 0xFFFF0EBC ^ 0xF159;
        FakePlayerModule.k[0x27E7 ^ 0x27EA] = 0xFFFFD860 ^ 0x27EA;
        FakePlayerModule.k[0xFF4E ^ 0xFEC6] = 0xD11E ^ 0xFEC6;
        FakePlayerModule.k[0x6E91 ^ 0x6EE7] = 0xFFFF911F ^ 0x6EE7;
        FakePlayerModule.k[0x8F52 ^ 0x8E29] = 0xFFFF715C ^ 0x8E29;
        FakePlayerModule.k[0x6FA5 ^ 0x6FCB] = 0x6F80 ^ 0x6FCB;
        FakePlayerModule.k[0x1FA6 ^ 0x1E91] = 0xFFFFE13B ^ 0x1E91;
        FakePlayerModule.k[0xAA34 ^ 0xAAFE] = 0xAAA6 ^ 0xAAFE;
        FakePlayerModule.k[0x9D19 ^ 0x9DEF] = 0x9DC1 ^ 0x9DEF;
        FakePlayerModule.k[0x5119 ^ 0x51F8] = 0x51FE ^ 0x51F8;
        FakePlayerModule.k[0x4D52 ^ 0x4D2B] = 0xFFFFB2B3 ^ 0x4D2B;
        FakePlayerModule.k[0xD5F7 ^ 0xD584] = 0xD59F ^ 0xD584;
        FakePlayerModule.k[0x4418 ^ 0x44AC] = 0x44B9 ^ 0x44AC;
        FakePlayerModule.k[0xD5E3 ^ 0xD570] = 0xD565 ^ 0xD570;
        FakePlayerModule.k[0x441 ^ 0x4CA] = 0x4E8 ^ 0x4CA;
        FakePlayerModule.k[0xD2AD ^ 0xD208] = 0xD20C ^ 0xD208;
        FakePlayerModule.k[0x761 ^ 0x62A] = 0x679 ^ 0x62A;
        FakePlayerModule.k[0x60D4 ^ 0x60A8] = 0x60EB ^ 0x60A8;
        FakePlayerModule.k[0xA6A7 ^ 0xA7DB] = 0xFFFF5852 ^ 0xA7DB;
        FakePlayerModule.k[0xE313 ^ 0xE366] = 0xFFFF3B89 ^ 0xE366;
        FakePlayerModule.k[0x12DD ^ 0x1205] = 0x128D ^ 0x1205;
        FakePlayerModule.k[0x7B87 ^ 0x7B57] = 0x7B6E ^ 0x7B57;
        FakePlayerModule.k[0x7F42 ^ 0x7F73] = 0x7F56 ^ 0x7F73;
        FakePlayerModule.k[0x9602 ^ 0x96D5] = 0x96A9 ^ 0x96D5;
        FakePlayerModule.k[0x5352 ^ 0x53E9] = 0xFFFFAC10 ^ 0x53E9;
        FakePlayerModule.k[0x9A99 ^ 0x9A4F] = 0x9A1C ^ 0x9A4F;
        FakePlayerModule.k[0x9A7 ^ 0x9E7] = 0xFFFFF652 ^ 0x9E7;
        FakePlayerModule.k[0x10AC ^ 0x1182] = 0xC438 ^ 0x1182;
        FakePlayerModule.k[0x9330 ^ 0x9277] = 0x925B ^ 0x9277;
        FakePlayerModule.k[0xA84A ^ 0xA828] = 0xA830 ^ 0xA828;
        FakePlayerModule.k[0x2B15 ^ 0x2B3E] = 0xFFFFD4B1 ^ 0x2B3E;
        FakePlayerModule.k[0x6412 ^ 0x6539] = 0x79A8 ^ 0x6539;
        FakePlayerModule.k[0xFE35 ^ 0xFE88] = 0xFFFF01E7 ^ 0xFE88;
        FakePlayerModule.k[0x2DB8 ^ 0x2CEF] = 0x2CB2 ^ 0x2CEF;
        FakePlayerModule.k[0x603A ^ 0x6052] = 0x6059 ^ 0x6052;
        FakePlayerModule.k[0x5266 ^ 0x52D1] = 0xFFFFADDB ^ 0x52D1;
        FakePlayerModule.k[0x45E9 ^ 0x451E] = 0x4555 ^ 0x451E;
        FakePlayerModule.k[0x664B ^ 0x670A] = 0x6702 ^ 0x670A;
        FakePlayerModule.k[0x3F63 ^ 0x3E20] = 0x3E61 ^ 0x3E20;
        FakePlayerModule.k[0x1AE8 ^ 0x1AE4] = 0x1A32 ^ 0x1AE4;
        FakePlayerModule.k[0x14AF ^ 0x1494] = 0x14F8 ^ 0x1494;
        FakePlayerModule.k[0x9C6 ^ 0x985] = 0xFFFFF62C ^ 0x985;
        FakePlayerModule.k[0x297A ^ 0x2955] = 0x290F ^ 0x2955;
        FakePlayerModule.k[0xD119 ^ 0xD168] = 0xFFFF2EAD ^ 0xD168;
        FakePlayerModule.k[0x103CD ^ 0x1034E] = 0x10342 ^ 0x1034E;
        FakePlayerModule.k[0x2039 ^ 0x2086] = 0x20A8 ^ 0x2086;
        FakePlayerModule.k[0xE0E4 ^ 0xE00B] = 0xE027 ^ 0xE00B;
        FakePlayerModule.k[0x42FC ^ 0x4257] = 0x4219 ^ 0x4257;
        FakePlayerModule.k[0x9594 ^ 0x94C7] = 0x949E ^ 0x94C7;
        FakePlayerModule.k[0x46BE ^ 0x465E] = 0x4649 ^ 0x465E;
        FakePlayerModule.k[0x3D29 ^ 0x3C10] = 0x3C13 ^ 0x3C10;
        FakePlayerModule.k[0x2850 ^ 0x2842] = 0x287C ^ 0x2842;
        FakePlayerModule.k[0xED32 ^ 0xED3A] = 0xED24 ^ 0xED3A;
        FakePlayerModule.k[0xC9C7 ^ 0xC914] = 0xC942 ^ 0xC914;
        FakePlayerModule.k[0x104B4 ^ 0x104EF] = 0xFFFEFB26 ^ 0x104EF;
        FakePlayerModule.k[0x6025 ^ 0x6110] = 0xFFFF9EE0 ^ 0x6110;
        FakePlayerModule.k[0xABCD ^ 0xAA43] = 0xE86A ^ 0xAA43;
        FakePlayerModule.k[0x36AD ^ 0x3653] = 0x3646 ^ 0x3653;
        FakePlayerModule.k[0xC3CF ^ 0xC33D] = 0xC368 ^ 0xC33D;
        FakePlayerModule.k[0x6FA ^ 0x775] = 0x4552 ^ 0x775;
        FakePlayerModule.k[0x3B01 ^ 0x3B06] = 0xFFFFC4B3 ^ 0x3B06;
        FakePlayerModule.k[0x4134 ^ 0x4111] = 0xFFFFBEE8 ^ 0x4111;
        FakePlayerModule.k[0x871E ^ 0x87C2] = 0x8788 ^ 0x87C2;
        FakePlayerModule.k[0x832D ^ 0x8333] = 0x832F ^ 0x8333;
        FakePlayerModule.k[0xBBD5 ^ 0xBB38] = 0xFFFF44DB ^ 0xBB38;
        FakePlayerModule.k[0xA99C ^ 0xA91D] = 0xA914 ^ 0xA91D;
        FakePlayerModule.k[0x58F6 ^ 0x5995] = 0xFFFFA60A ^ 0x5995;
        FakePlayerModule.k[0xEEC6 ^ 0xEE7A] = 0xFFFF11DE ^ 0xEE7A;
        FakePlayerModule.k[0x6990 ^ 0x69E8] = 0xFFFF9608 ^ 0x69E8;
        FakePlayerModule.k[0x107D1 ^ 0x1075E] = 0xFFFEF8BA ^ 0x1075E;
        FakePlayerModule.k[0x1541 ^ 0x15E1] = 0x15CB ^ 0x15E1;
        FakePlayerModule.k[0x104D1 ^ 0x10456] = 0x1047E ^ 0x10456;
        FakePlayerModule.k[0x897B ^ 0x8937] = 0x8916 ^ 0x8937;
        FakePlayerModule.k[0xB01F ^ 0xB01C] = 0xB050 ^ 0xB01C;
        FakePlayerModule.k[0xE0DD ^ 0xE184] = 0xE18F ^ 0xE184;
        FakePlayerModule.k[0xD583 ^ 0xD5B3] = 0xFFFF2A60 ^ 0xD5B3;
        FakePlayerModule.k[0xDAB7 ^ 0xDA2D] = 0xFFFF25BF ^ 0xDA2D;
        FakePlayerModule.k[0xFEFF ^ 0xFEA1] = 0xFE85 ^ 0xFEA1;
        FakePlayerModule.k[0xDEB5 ^ 0xDFE7] = 0xFFFF205A ^ 0xDFE7;
        FakePlayerModule.k[0x10CC0 ^ 0x10CE7] = 0xFFFEF32F ^ 0x10CE7;
        FakePlayerModule.k[0xF9D8 ^ 0xF9BC] = 0xF9A0 ^ 0xF9BC;
        FakePlayerModule.k[0x7011 ^ 0x716B] = 0x7124 ^ 0x716B;
        FakePlayerModule.k[0x8EAA ^ 0x8F2F] = 0x8F2E ^ 0x8F2F;
        FakePlayerModule.k[0x7B3F ^ 0x7B1F] = 0xFFFF84DD ^ 0x7B1F;
        FakePlayerModule.k[0x7FC6 ^ 0x7EFE] = 0xFFFF817C ^ 0x7EFE;
        FakePlayerModule.k[0x1D08 ^ 0x1C3E] = 0xFFFFE3C6 ^ 0x1C3E;
        FakePlayerModule.k[0xD882 ^ 0xD876] = 0xFFFF27DA ^ 0xD876;
        FakePlayerModule.k[0xF73B ^ 0xF620] = 0xF620 ^ 0xF620;
        FakePlayerModule.k[0x103AA ^ 0x10377] = 0xFFFEFC85 ^ 0x10377;
        FakePlayerModule.k[0x6CB4 ^ 0x6DE2] = 0xFFFF922A ^ 0x6DE2;
        FakePlayerModule.k[0xB492 ^ 0xB5FE] = 0xFFFF4A32 ^ 0xB5FE;
        FakePlayerModule.k[0xA5F3 ^ 0xA51F] = 0xFFFF5ADE ^ 0xA51F;
        FakePlayerModule.k[0x17C4 ^ 0x16E7] = 0xECA6 ^ 0x16E7;
        FakePlayerModule.k[0x9BCC ^ 0x9BE6] = 0x9B9B ^ 0x9BE6;
        FakePlayerModule.k[0xB07D ^ 0xB17E] = 0xFFFF4E87 ^ 0xB17E;
        FakePlayerModule.k[0x6C6C ^ 0x6D08] = 0xFFFF92D4 ^ 0x6D08;
        FakePlayerModule.k[0xACBF ^ 0xADD1] = 0xADDE ^ 0xADD1;
        FakePlayerModule.k[0x69F ^ 0x6B3] = 0xFFFFF947 ^ 0x6B3;
        FakePlayerModule.k[0xC99A ^ 0xC982] = 0xC928 ^ 0xC982;
        FakePlayerModule.k[0x6BDA ^ 0x6BA1] = 0x4C68 ^ 0x6BA1;
        FakePlayerModule.k[0x10D82 ^ 0x10CBC] = 0x10CF6 ^ 0x10CBC;
        FakePlayerModule.k[0x70D9 ^ 0x70D8] = 0x70DE ^ 0x70D8;
        FakePlayerModule.k[0x104AE ^ 0x10592] = 0x1052E ^ 0x10592;
        FakePlayerModule.k[0x52E1 ^ 0x5282] = 0x52CA ^ 0x5282;
        FakePlayerModule.k[0x9EA0 ^ 0x9E5D] = 0xFFFF61B0 ^ 0x9E5D;
        FakePlayerModule.k[0x3CB ^ 0x2BB] = 0xFFFFFD52 ^ 0x2BB;
        FakePlayerModule.k[0xE6E2 ^ 0xE6AA] = 0xE6DA ^ 0xE6AA;
        FakePlayerModule.k[0x1291 ^ 0x138D] = 0x138C ^ 0x138D;
        FakePlayerModule.k[0x10973 ^ 0x10915] = 0xFFFEF6C5 ^ 0x10915;
        FakePlayerModule.k[0xAC51 ^ 0xAC7C] = 0xFFFF5392 ^ 0xAC7C;
        FakePlayerModule.k[0xB200 ^ 0xB332] = 0xFFFF4CB1 ^ 0xB332;
        FakePlayerModule.k[0xD1FE ^ 0xD153] = 0xFFFF2E83 ^ 0xD153;
        FakePlayerModule.k[0x996 ^ 0x9DF] = 0xFFFFF644 ^ 0x9DF;
        FakePlayerModule.k[0xCC3D ^ 0xCC04] = 0xCC62 ^ 0xCC04;
        FakePlayerModule.k[0xC209 ^ 0xC254] = 0xFFFF3D20 ^ 0xC254;
        FakePlayerModule.k[0x836D ^ 0x82EF] = 0x82ED ^ 0x82EF;
        FakePlayerModule.k[0xA8F7 ^ 0xA9E3] = 0xFFFF5610 ^ 0xA9E3;
        FakePlayerModule.k[0x10DE9 ^ 0x10D18] = 0xFFFEF2B4 ^ 0x10D18;
        FakePlayerModule.k[0xB516 ^ 0xB547] = 0xB5F7 ^ 0xB547;
        FakePlayerModule.k[0x6F5E ^ 0x6E06] = 0x6E4E ^ 0x6E06;
        FakePlayerModule.k[0xCE0A ^ 0xCE47] = 0xCE61 ^ 0xCE47;
        FakePlayerModule.k[0x19C5 ^ 0x19D9] = 0x19D9 ^ 0x19D9;
        FakePlayerModule.k[0xDB64 ^ 0xDB61] = 0xFFFF24D9 ^ 0xDB61;
        FakePlayerModule.k[0x10600 ^ 0x10725] = 0x1C3C0 ^ 0x10725;
        FakePlayerModule.k[0x71A0 ^ 0x70BA] = 0x70B9 ^ 0x70BA;
        FakePlayerModule.k[0x189B ^ 0x19D6] = 0x19E1 ^ 0x19D6;
        FakePlayerModule.k[0x1738 ^ 0x1728] = 0x176B ^ 0x1728;
        FakePlayerModule.k[0xCF4B ^ 0xCECF] = 0xCECE ^ 0xCECF;
        FakePlayerModule.k[0x6DEB ^ 0x6CCC] = 0xC265 ^ 0x6CCC;
        FakePlayerModule.k[0x5426 ^ 0x554D] = 0xFFFFAACF ^ 0x554D;
        FakePlayerModule.k[0x319C ^ 0x315D] = 0xFFFFCEA7 ^ 0x315D;
        FakePlayerModule.k[0xF739 ^ 0xF60A] = 0xF625 ^ 0xF60A;
        FakePlayerModule.k[0x2C5C ^ 0x2D74] = 0xA1FE ^ 0x2D74;
        FakePlayerModule.k[0x6D7D ^ 0x6C22] = 0x6C7B ^ 0x6C22;
        FakePlayerModule.k[0x4D49 ^ 0x4D5D] = 0xFFFFB28D ^ 0x4D5D;
        FakePlayerModule.k[0xFF54 ^ 0xFF72] = 0xFFFF0083 ^ 0xFF72;
        FakePlayerModule.k[0x6196 ^ 0x61A3] = 0xFFFF9E56 ^ 0x61A3;
        FakePlayerModule.k[0x64DF ^ 0x64C0] = 0x64FA ^ 0x64C0;
        FakePlayerModule.k[0x939F ^ 0x9371] = 0x932A ^ 0x9371;
        FakePlayerModule.k[0x7E5 ^ 0x663] = 0x663 ^ 0x663;
        FakePlayerModule.k[0x136D ^ 0x1308] = 0x1324 ^ 0x1308;
        FakePlayerModule.k[0xD4D ^ 0xD94] = 0xFFFFF241 ^ 0xD94;
        FakePlayerModule.k[0x2FE2 ^ 0x2E95] = 0x2EF0 ^ 0x2E95;
        FakePlayerModule.k[0x1085C ^ 0x10882] = 0x1080F ^ 0x10882;
        FakePlayerModule.k[0xD284 ^ 0xD246] = 0xD208 ^ 0xD246;
        FakePlayerModule.k[0x15AB ^ 0x1532] = 0xFFFFEADE ^ 0x1532;
        FakePlayerModule.k[0x10A7D ^ 0x10B37] = 0xFFFEF4D7 ^ 0x10B37;
        FakePlayerModule.k[0x1529 ^ 0x1507] = 0xFFFFEA89 ^ 0x1507;
        FakePlayerModule.k[0x7F52 ^ 0x7E3F] = 0xFFFF8192 ^ 0x7E3F;
        FakePlayerModule.k[0xB18F ^ 0xB166] = 0xFFFF4EE7 ^ 0xB166;
        FakePlayerModule.k[0x6FA4 ^ 0x6E25] = 0x6E24 ^ 0x6E25;
        FakePlayerModule.k[0x5DC1 ^ 0x5D87] = 0x5D8E ^ 0x5D87;
        FakePlayerModule.k[0xCBDB ^ 0xCB82] = 0xFFFF3447 ^ 0xCB82;
        FakePlayerModule.k[0x74E4 ^ 0x7400] = 0x7466 ^ 0x7400;
        FakePlayerModule.k[0x10289 ^ 0x1027C] = 0xFFFEFDE7 ^ 0x1027C;
        FakePlayerModule.k[0x22D2 ^ 0x2284] = 0x22A7 ^ 0x2284;
        FakePlayerModule.k[0x8D51 ^ 0x8DD7] = 0x8DD9 ^ 0x8DD7;
        FakePlayerModule.k[0x7250 ^ 0x72B7] = 0x72FF ^ 0x72B7;
        FakePlayerModule.k[0x4649 ^ 0x461A] = 0xFFFFB9A9 ^ 0x461A;
        FakePlayerModule.k[0xECC1 ^ 0xEC08] = 0xEC2F ^ 0xEC08;
        FakePlayerModule.k[0x4372 ^ 0x4337] = 0x4373 ^ 0x4337;
        FakePlayerModule.k[0x107C6 ^ 0x107BB] = 0xFFFEF83E ^ 0x107BB;
        FakePlayerModule.k[0xB13F ^ 0xB1B1] = 0xB190 ^ 0xB1B1;
        FakePlayerModule.k[0x10725 ^ 0x1079B] = 0xFFFEF807 ^ 0x1079B;
        FakePlayerModule.k[0xBA47 ^ 0xBAD5] = 0xBACD ^ 0xBAD5;
        FakePlayerModule.k[0x6064 ^ 0x60DD] = 0xFFFF9F57 ^ 0x60DD;
        FakePlayerModule.k[0x9177 ^ 0x9016] = 0xFFFF6FD0 ^ 0x9016;
        FakePlayerModule.k[0xBADD ^ 0xBBA9] = 0xBBDF ^ 0xBBA9;
        FakePlayerModule.k[0xBDA4 ^ 0xBD05] = 0xBD7B ^ 0xBD05;
        FakePlayerModule.k[0x2FF9 ^ 0x2F75] = 0x2F7B ^ 0x2F75;
        FakePlayerModule.k[0xA2B7 ^ 0xA25F] = 0xFFFF5D8E ^ 0xA25F;
        FakePlayerModule.k[0x4187 ^ 0x4086] = 0x409B ^ 0x4086;
        FakePlayerModule.k[0x3DD8 ^ 0x3D43] = 0x3D1D ^ 0x3D43;
        FakePlayerModule.k[0x6F44 ^ 0x6F8F] = 0x6FF1 ^ 0x6F8F;
        FakePlayerModule.k[0xFCCD ^ 0xFD99] = 0xFFFF0278 ^ 0xFD99;
        FakePlayerModule.k[0x98AF ^ 0x98E0] = 0x98C3 ^ 0x98E0;
        FakePlayerModule.k[0x4640 ^ 0x465D] = 0xFFFFB9E9 ^ 0x465D;
        FakePlayerModule.k[0xFD44 ^ 0xFD2F] = 0xFFFF029D ^ 0xFD2F;
        FakePlayerModule.k[0x339B ^ 0x329F] = 0xFFFFCD1A ^ 0x329F;
        FakePlayerModule.k[0x1486 ^ 0x15D7] = 0xFFFFEA13 ^ 0x15D7;
        FakePlayerModule.k[0xAABC ^ 0xAB30] = 0x1FC ^ 0xAB30;
        FakePlayerModule.k[0x3B9D ^ 0x3A82] = 0x3A82 ^ 0x3A82;
        FakePlayerModule.k[0x34D4 ^ 0x34B9] = 0xFFFFCB31 ^ 0x34B9;
        FakePlayerModule.k[0x50F1 ^ 0x51F9] = 0x51A9 ^ 0x51F9;
        FakePlayerModule.k[0xD2BA ^ 0xD2DD] = 0xD2E6 ^ 0xD2DD;
        FakePlayerModule.k[0x4495 ^ 0x44EA] = 0xFFFFBB31 ^ 0x44EA;
        FakePlayerModule.k[0x4847 ^ 0x4978] = 0xFFFFB6BC ^ 0x4978;
        FakePlayerModule.k[0xEEF1 ^ 0xEF78] = 0x45B1 ^ 0xEF78;
        FakePlayerModule.k[0x7964 ^ 0x79A4] = 0x79CC ^ 0x79A4;
        FakePlayerModule.k[0xBD01 ^ 0xBD4A] = 0xBD5E ^ 0xBD4A;
        FakePlayerModule.k[0x973 ^ 0x801] = 0x8E1 ^ 0x801;
        FakePlayerModule.k[0x44BA ^ 0x44B3] = 0xFFFFBB2A ^ 0x44B3;
        FakePlayerModule.k[0x5F98 ^ 0x5FDA] = 0x5F5E ^ 0x5FDA;
        FakePlayerModule.k[0x9B4 ^ 0x930] = 0x9B8 ^ 0x930;
        FakePlayerModule.k[0x1877 ^ 0x188D] = 0x18FC ^ 0x188D;
        FakePlayerModule.k[0xBFD0 ^ 0xBE5A] = 0x1496 ^ 0xBE5A;
        FakePlayerModule.k[0xC3C2 ^ 0xC390] = 0xC3F2 ^ 0xC390;
        FakePlayerModule.k[0x968 ^ 0x9E1] = 0xFFFFF677 ^ 0x9E1;
        FakePlayerModule.k[0xDC2C ^ 0xDD55] = 0xDD72 ^ 0xDD55;
        FakePlayerModule.k[0x45CC ^ 0x4530] = 0x451D ^ 0x4530;
        FakePlayerModule.k[0xA397 ^ 0xA21C] = 0xFFFFF732 ^ 0xA21C;
        FakePlayerModule.k[0xA766 ^ 0xA7C9] = 0xFFFF5872 ^ 0xA7C9;
        FakePlayerModule.k[0x15B0 ^ 0x152E] = 0x155D ^ 0x152E;
        FakePlayerModule.k[0xD34B ^ 0xD26F] = 0xA8AC ^ 0xD26F;
        FakePlayerModule.k[0x2645 ^ 0x2768] = 0x965F ^ 0x2768;
        FakePlayerModule.k[0xA93 ^ 0xBB9] = 0x5117 ^ 0xBB9;
        FakePlayerModule.k[0xAF40 ^ 0xAE31] = 0xAE77 ^ 0xAE31;
        FakePlayerModule.k[0x301B ^ 0x3024] = 0x3052 ^ 0x3024;
        FakePlayerModule.k[0x730F ^ 0x726F] = 0x72EB ^ 0x726F;
        FakePlayerModule.k[0x4694 ^ 0x47D8] = 0x479C ^ 0x47D8;
        FakePlayerModule.k[0x957F ^ 0x9584] = 0xFFFF6A19 ^ 0x9584;
        FakePlayerModule.k[0x3664 ^ 0x367F] = 0x3613 ^ 0x367F;
        FakePlayerModule.k[0x2ED5 ^ 0x2FFC] = 0xE91 ^ 0x2FFC;
        FakePlayerModule.k[0x8309 ^ 0x8240] = 0x8224 ^ 0x8240;
        FakePlayerModule.k[0x71A2 ^ 0x7104] = 0xFFFF8ED8 ^ 0x7104;
        FakePlayerModule.k[0xCC80 ^ 0xCC45] = 0xCC5A ^ 0xCC45;
        FakePlayerModule.k[0x1041C ^ 0x1052C] = 0x10581 ^ 0x1052C;
        FakePlayerModule.k[0xBCB ^ 0xA97] = 0xFFFFF525 ^ 0xA97;
        FakePlayerModule.k[0xB54C ^ 0xB5D4] = 0xB5CE ^ 0xB5D4;
        FakePlayerModule.k[0x69C4 ^ 0x69B3] = 0x69BB ^ 0x69B3;
        FakePlayerModule.k[0xD80F ^ 0xD8D4] = 0xFFFF277D ^ 0xD8D4;
        FakePlayerModule.k[0xD943 ^ 0xD97F] = 0xD975 ^ 0xD97F;
        FakePlayerModule.k[0x5BE4 ^ 0x5ADE] = 0xFFFFA56A ^ 0x5ADE;
        FakePlayerModule.k[0x9D9F ^ 0x9CCF] = 0xFFFF6364 ^ 0x9CCF;
        FakePlayerModule.k[0xE5CB ^ 0xE4C7] = 0xFFFF1B31 ^ 0xE4C7;
        FakePlayerModule.k[0x3387 ^ 0x32A8] = 0x32A8 ^ 0x32A8;
        FakePlayerModule.k[0x4245 ^ 0x4235] = 0xFFFFBDAA ^ 0x4235;
        FakePlayerModule.k[0x3837 ^ 0x3977] = 0xFFFFC69B ^ 0x3977;
        FakePlayerModule.k[0xA037 ^ 0xA068] = 0xFFFF5FF0 ^ 0xA068;
        FakePlayerModule.k[0x2037 ^ 0x2106] = 0x2116 ^ 0x2106;
        FakePlayerModule.k[0xC5CB ^ 0xC57B] = 0xC532 ^ 0xC57B;
        FakePlayerModule.k[0x1017 ^ 0x1033] = 0x1021 ^ 0x1033;
        FakePlayerModule.k[0xC5A8 ^ 0xC51D] = 0xC50D ^ 0xC51D;
        FakePlayerModule.k[0xE24A ^ 0xE2A0] = 0xE2B7 ^ 0xE2A0;
        FakePlayerModule.k[0x3B10 ^ 0x3BA1] = 0x3BD6 ^ 0x3BA1;
        FakePlayerModule.k[0x575F ^ 0x5646] = 0xFFFFA9A6 ^ 0x5646;
        FakePlayerModule.k[0x36E6 ^ 0x37DB] = 0xFFFFC875 ^ 0x37DB;
        FakePlayerModule.k[0xB53D ^ 0xB5FB] = 0xB563 ^ 0xB5FB;
        FakePlayerModule.k[0x3EEA ^ 0x3EDD] = 0x3EF8 ^ 0x3EDD;
        FakePlayerModule.k[0xD95D ^ 0xD9CA] = 0xD9FE ^ 0xD9CA;
        FakePlayerModule.k[0xAA22 ^ 0xAA66] = 0xAA4A ^ 0xAA66;
        FakePlayerModule.k[0xC024 ^ 0xC0A4] = 0xFFFF3F67 ^ 0xC0A4;
        FakePlayerModule.k[0x5840 ^ 0x587D] = 0xFFFFA7B2 ^ 0x587D;
        FakePlayerModule.k[0x9E0C ^ 0x9EB6] = 0xFFFF61CB ^ 0x9EB6;
        FakePlayerModule.k[0x100CB ^ 0x1018F] = 0x101EA ^ 0x1018F;
        FakePlayerModule.k[0xB3D4 ^ 0xB30E] = 0xB333 ^ 0xB30E;
        FakePlayerModule.k[0xE926 ^ 0xE860] = 0xE878 ^ 0xE860;
        FakePlayerModule.k[0xB76 ^ 0xB40] = 0xB0B ^ 0xB40;
        FakePlayerModule.k[0x14F8 ^ 0x14E9] = 0xFFFFEB4B ^ 0x14E9;
        FakePlayerModule.k[0xEE25 ^ 0xEE5F] = 0xEE23 ^ 0xEE5F;
        FakePlayerModule.k[0xF822 ^ 0xF824] = 0xFFFF07CD ^ 0xF824;
        FakePlayerModule.k[0x93FF ^ 0x9358] = 0xFFFF6C98 ^ 0x9358;
        FakePlayerModule.k[0x5EEC ^ 0x5EFA] = 0xFFFFA14C ^ 0x5EFA;
        FakePlayerModule.k[0x310C ^ 0x302E] = 0xFA6E ^ 0x302E;
        FakePlayerModule.k[0x1CE6 ^ 0x1C29] = 0x1C65 ^ 0x1C29;
        FakePlayerModule.k[0x6BC5 ^ 0x6B11] = 0xFFFF94B9 ^ 0x6B11;
        FakePlayerModule.k[0xDF7C ^ 0xDFAE] = 0xDFB0 ^ 0xDFAE;
        FakePlayerModule.k[0xB3B6 ^ 0xB305] = 0xB358 ^ 0xB305;
        FakePlayerModule.k[0x1C14 ^ 0x1C60] = 0xFFFFE3B3 ^ 0x1C60;
        FakePlayerModule.k[0x9224 ^ 0x9304] = 0x9304 ^ 0x9304;
        FakePlayerModule.k[0x9C10 ^ 0x9D17] = 0x9D73 ^ 0x9D17;
        FakePlayerModule.k[0xCF3B ^ 0xCE3E] = 0xCEFE ^ 0xCE3E;
        FakePlayerModule.k[0x696C ^ 0x6809] = 0xFFFF97AA ^ 0x6809;
        FakePlayerModule.k[0x967D ^ 0x9637] = 0xFFFF69CD ^ 0x9637;
        FakePlayerModule.k[0xB67F ^ 0xB6D5] = 0xB69C ^ 0xB6D5;
        FakePlayerModule.k[0x1CA9 ^ 0x1DBF] = 0xFFFFE22B ^ 0x1DBF;
        FakePlayerModule.k[0x7521 ^ 0x75C7] = 0xFFFF8A45 ^ 0x75C7;
        FakePlayerModule.k[0xFE06 ^ 0xFE02] = 0xFFFF01EB ^ 0xFE02;
        FakePlayerModule.k[0x4ED6 ^ 0x4FAB] = 0xFFFFB05E ^ 0x4FAB;
        FakePlayerModule.k[0x7640 ^ 0x772A] = 0x770D ^ 0x772A;
        FakePlayerModule.k[0xE609 ^ 0xE68C] = 0xFFFF1926 ^ 0xE68C;
        FakePlayerModule.k[0xC8EB ^ 0xC995] = 0xFFFF3676 ^ 0xC995;
        FakePlayerModule.k[0xE2C8 ^ 0xE23B] = 0xFFFF1DE6 ^ 0xE23B;
        FakePlayerModule.k[0xBCE ^ 0xAB8] = 0xACA ^ 0xAB8;
        FakePlayerModule.k[0xB26E ^ 0xB2C7] = 0xFFFF4D59 ^ 0xB2C7;
        FakePlayerModule.k[0x10B7D ^ 0x10A14] = 0x10A48 ^ 0x10A14;
        FakePlayerModule.k[0xEE00 ^ 0xEE15] = 0xEE0E ^ 0xEE15;
    }
}

