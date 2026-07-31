/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.minecraft.class_1268
 *  net.minecraft.class_1280
 *  net.minecraft.class_1282
 *  net.minecraft.class_1293
 *  net.minecraft.class_1294
 *  net.minecraft.class_1297
 *  net.minecraft.class_1297$class_5529
 *  net.minecraft.class_1309
 *  net.minecraft.class_1657
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_238
 *  net.minecraft.class_239$class_240
 *  net.minecraft.class_243
 *  net.minecraft.class_2602
 *  net.minecraft.class_2663
 *  net.minecraft.class_2664
 *  net.minecraft.class_3414
 *  net.minecraft.class_3417
 *  net.minecraft.class_3419
 *  net.minecraft.class_3959
 *  net.minecraft.class_3959$class_242
 *  net.minecraft.class_3959$class_3960
 *  net.minecraft.class_3965
 *  net.minecraft.class_5134
 *  net.minecraft.class_638
 *  net.minecraft.class_745
 *  net.minecraft.class_746
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
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.a;
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.event.events.d_0;
import kotakbaz.rain.mixin.LivingEntityInvoker;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.setting.settings.A;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.class_1268;
import net.minecraft.class_1280;
import net.minecraft.class_1282;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2602;
import net.minecraft.class_2663;
import net.minecraft.class_2664;
import net.minecraft.class_3414;
import net.minecraft.class_3417;
import net.minecraft.class_3419;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_5134;
import net.minecraft.class_638;
import net.minecraft.class_745;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sweetie.evaware.flora.api.Commando;

/*
 * Renamed from kotakbaz.rain.module.modules.player.e
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b(\u0010)J/\u0010/\u001a\u00020'2\u0006\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020'2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0002\u00a2\u0006\u0004\b/\u00100J'\u00104\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00101\u001a\u00020\u001f2\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0002\u00a2\u0006\u0004\b7\u00108J'\u0010;\u001a\u00020\u00042\u0006\u0010:\u001a\u0002092\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020=2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00103\u001a\u000202H\u0002\u00a2\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\bD\u0010\u0003R\u0014\u0010E\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010G\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bG\u0010FR\u0014\u0010H\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020\u001f8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001d\u001a\u00020R8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010SR\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010W\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Y\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b[\u0010FR\u0018\u0010\\\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\\\u0010ZR\u001e\u0010^\u001a\n ]*\u0004\u0018\u00010#0#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b^\u0010_\u00a8\u0006`"}, d2={"Lkotakbaz/rain/module/modules/player/FakePlayerModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_1297;", "target", "", "handleAttack", "(Lnet/minecraft/class_1297;)Z", "Lnet/minecraft/class_2664;", "packet", "handleExplosion", "(Lnet/minecraft/class_2664;)V", "entity", "isFakePlayer", "spawnFakePlayer", "Lnet/minecraft/class_745;", "fake", "applyBuffs", "(Lnet/minecraft/class_745;)V", "Lnet/minecraft/class_746;", "player", "copyInventory", "(Lnet/minecraft/class_745;Lnet/minecraft/class_746;)V", "", "cooldown", "calculateMeleeDamage", "(Lnet/minecraft/class_746;Lnet/minecraft/class_745;F)F", "Lnet/minecraft/class_243;", "center", "estimateExplosionDamage", "(Lnet/minecraft/class_243;Lnet/minecraft/class_745;)F", "", "calculateExposure", "(Lnet/minecraft/class_243;Lnet/minecraft/class_745;)D", "min", "max", "", "index", "steps", "lerpBox", "(DDII)D", "damage", "Lnet/minecraft/class_1282;", "damageSource", "applySimulatedDamage", "(Lnet/minecraft/class_745;FLnet/minecraft/class_1282;)V", "", "configuredName", "()Ljava/lang/String;", "Lnet/minecraft/class_638;", "world", "playAttackFeedback", "(Lnet/minecraft/class_638;Lnet/minecraft/class_746;F)V", "Lnet/minecraft/class_3414;", "attackSound", "(Lnet/minecraft/class_746;F)Lnet/minecraft/class_3414;", "shouldPlayCriticalSound", "(Lnet/minecraft/class_746;)Z", "applyLocalHurtFeedback", "(Lnet/minecraft/class_745;Lnet/minecraft/class_1282;)V", "removeFakePlayer", "FAKE_ENTITY_ID", "I", "DEATH_DISABLE_TICKS", "TOTEM_HEALTH", "F", "LOW_COOLDOWN_DAMAGE", "CRYSTAL_EXPLOSION_POWER", "D", "TELEPORT_DISABLE_DISTANCE", "TELEPORT_DISABLE_DISTANCE_SQUARED", "Ljava/util/UUID;", "PROFILE_UUID", "Ljava/util/UUID;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/TextSetting;", "fakeName", "Lkotakbaz/rain/module/setting/settings/TextSetting;", "fakePlayer", "Lnet/minecraft/class_745;", "fakeWorld", "Lnet/minecraft/class_638;", "deathTime", "lastPlayerWorld", "kotlin.jvm.PlatformType", "lastPlayerPos", "Lnet/minecraft/class_243;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nFakePlayerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FakePlayerModule.kt\nkotakbaz/rain/module/modules/player/FakePlayerModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,372:1\n1#2:373\n*E\n"})
public final class e_0
extends a_0 {
    @NotNull
    public static final e_0 INSTANCE;
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
    private static final c e;
    @NotNull
    private static final A E;
    @Nullable
    private static class_745 f;
    @Nullable
    private static class_638 F;
    private static int g;
    @Nullable
    private static class_638 G;
    private static class_243 h;
    private static Object[] H;
    private static Object I;
    private static Object[] j;
    private static Object[] i;
    private static Object[] J;
    public static int[] k;

    private e_0() {
        int n = k[0];
        n += k[1];
        int n2 = k[3];
        n2 -= k[4];
        int n3 = k[6];
        n3 -= k[7];
        super((String)H[n ^= k[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)H[n2 += k[5]] + (String)H[n3 -= k[8]]);
    }

    @Override
    public void onEnable() {
        G = b_0.getMc().field_1687;
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_7462 == null || (class_7462 = class_7462.method_19538()) == null) {
            class_7462 = class_243.field_1353;
        }
        h = class_7462;
        this.spawnFakePlayer();
    }

    @Override
    public void onDisable() {
        this.removeFakePlayer();
        int n = k[9];
        n ^= k[10];
        g = n -= k[11];
        G = null;
        h = class_243.field_1353;
    }

    @Commando
    public final void onUpdate(@NotNull D d2) {
        long l = 5169405000272456146L;
        int n = k[12];
        n += k[13];
        Intrinsics.checkNotNullParameter(d2, (String)H[n ^= k[14]]);
        class_638 class_6382 = b_0.getMc().field_1687;
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_6382 == null || class_7462 == null) {
            boolean bl = k[15];
            bl += k[16];
            this.setEnabled(bl ^= k[17]);
            return;
        }
        if (G != null && !Intrinsics.areEqual(G, class_6382)) {
            boolean bl = k[18];
            bl += k[19];
            this.setEnabled(bl -= k[20]);
            return;
        }
        if (class_7462.method_19538().method_1025(h) > Double.longBitsToDouble(0xEE3B17BCC6050A3BL ^ 0xAE5917BCC6050A3BL)) {
            boolean bl = k[21];
            bl += k[22];
            this.setEnabled(bl += k[23]);
            return;
        }
        G = class_6382;
        h = class_7462.method_19538();
        class_745 class_7452 = f;
        if (class_7452 == null || class_7452.method_31481() || !Intrinsics.areEqual(class_7452.method_37908(), class_6382)) {
            this.spawnFakePlayer();
        }
        class_745 class_7453 = f;
        if (class_7453 == null) {
            return;
        }
        class_745 class_7454 = class_7453;
        if (!Intrinsics.areEqual(class_7454.method_6079().method_7909(), class_1802.field_8288)) {
            class_7454.method_6122(class_1268.field_5810, new class_1799((class_1935)class_1802.field_8288));
        }
        if (class_7454.method_29504()) {
            int n2 = k[24];
            n2 += k[25];
            long l2 = l;
            int n3 = k[27];
            n3 += k[28];
            l = l2 ^ ((long)g << (n2 -= k[26]) ^ l2) & -1L << (n3 += k[29]);
            int n4 = k[30];
            n4 -= k[31];
            int n5 = k[33];
            n5 += k[34];
            g = (int)(l >>> (n4 -= k[32])) + (n5 -= k[35]);
            int n6 = k[36];
            n6 -= k[37];
            if (g > (n6 += k[38])) {
                boolean bl = k[39];
                bl -= k[40];
                this.setEnabled(bl += k[41]);
            }
        } else {
            int n7 = k[42];
            n7 += k[43];
            g = n7 += k[44];
        }
    }

    public final boolean handleAttack(@NotNull class_1297 class_12972) {
        int n = k[45];
        n -= k[46];
        Intrinsics.checkNotNullParameter(class_12972, (String)H[n -= k[47]]);
        if (!this.isEnabled()) {
            boolean bl = k[48];
            bl ^= k[49];
            return bl ^= k[50];
        }
        class_745 class_7452 = f;
        if (class_7452 == null) {
            boolean bl = k[51];
            bl += k[52];
            return bl -= k[53];
        }
        class_745 class_7453 = class_7452;
        if (class_12972.method_5628() != class_7453.method_5628()) {
            boolean bl = k[54];
            bl += k[55];
            return bl += k[56];
        }
        if (class_7453.field_6235 != 0) {
            boolean bl = k[57];
            bl -= k[58];
            return bl -= k[59];
        }
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            boolean bl = k[60];
            bl += k[61];
            return bl += k[62];
        }
        class_638 class_6383 = class_6382;
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_7462 == null) {
            boolean bl = k[63];
            bl ^= k[64];
            return bl += k[65];
        }
        class_746 class_7463 = class_7462;
        float f2 = class_7463.method_7261(0.5f);
        this.playAttackFeedback(class_6383, class_7463, f2);
        class_1282 class_12822 = class_7463.method_48923().method_48802((class_1657)class_7463);
        float f3 = f2 >= 0.85f ? this.calculateMeleeDamage(class_7463, class_7453, f2) : 1.0f;
        Intrinsics.checkNotNull(class_12822);
        this.applySimulatedDamage(class_7453, f3, class_12822);
        class_7463.method_7350();
        kotakbaz.rain.event.a.INSTANCE.post(new d_0((class_1297)class_7453));
        boolean bl = k[66];
        bl += k[67];
        return bl ^= k[68];
    }

    public final void handleExplosion(@NotNull class_2664 class_26642) {
        int n = k[69];
        n ^= k[70];
        Intrinsics.checkNotNullParameter(class_26642, (String)H[n ^= k[71]]);
        if (!this.isEnabled()) {
            return;
        }
        class_745 class_7452 = f;
        if (class_7452 == null) {
            return;
        }
        class_745 class_7453 = class_7452;
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            return;
        }
        class_638 class_6383 = class_6382;
        if (class_7453.field_6235 != 0) {
            return;
        }
        class_243 class_2432 = class_26642.comp_2883();
        int n2 = k[72];
        n2 ^= k[73];
        Intrinsics.checkNotNullExpressionValue(class_2432, (String)H[n2 ^= k[74]]);
        float f2 = this.estimateExplosionDamage(class_2432, class_7453);
        if (f2 <= 0.0f) {
            return;
        }
        class_1282 class_12822 = class_6383.method_48963().method_48830();
        int n3 = k[75];
        n3 += k[76];
        Intrinsics.checkNotNullExpressionValue(class_12822, (String)H[n3 ^= k[77]]);
        this.applySimulatedDamage(class_7453, f2, class_12822);
    }

    public final boolean isFakePlayer(@Nullable class_1297 class_12972) {
        int n;
        class_745 class_7452 = f;
        if (class_7452 == null) {
            boolean bl = k[78];
            bl ^= k[79];
            return bl ^= k[80];
        }
        class_745 class_7453 = class_7452;
        if (class_12972 != null && class_12972.method_5628() == class_7453.method_5628()) {
            int n2 = k[81];
            n2 -= k[82];
            n = n2 += k[83];
        } else {
            int n3 = k[84];
            n3 += k[85];
            n = n3 += k[86];
        }
        return n != 0;
    }

    private final void spawnFakePlayer() {
        class_746 class_7462 = b_0.getMc().field_1724;
        if (class_7462 == null) {
            return;
        }
        class_746 class_7463 = class_7462;
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            return;
        }
        class_638 class_6383 = class_6382;
        this.removeFakePlayer();
        class_745 class_7452 = new class_745(class_6383, new GameProfile(D, this.configuredName()));
        int n = k[87];
        n -= k[88];
        class_7452.method_5838(n -= k[89]);
        class_7452.method_5719((class_1297)class_7463);
        class_7452.method_36456(class_7463.method_36454());
        class_7452.method_36457(class_7463.method_36455());
        class_7452.method_5847(class_7463.field_6241);
        class_7452.method_5636(class_7463.field_6283);
        class_7452.method_18799(class_243.field_1353);
        class_7452.method_24830(class_7463.method_24828());
        class_7452.method_18380(class_7463.method_18376());
        class_7452.method_5660(class_7463.method_5715());
        class_7452.method_5728(class_7463.method_5624());
        class_7452.method_5796(class_7463.method_5681());
        boolean bl = k[90];
        bl -= k[91];
        class_7452.method_5648(bl ^= k[92]);
        class_7452.method_6033(class_7452.method_6063());
        int n2 = k[93];
        n2 += k[94];
        class_7452.field_6235 = n2 ^= k[95];
        int n3 = k[96];
        n3 += k[97];
        class_7452.field_6254 = n3 -= k[98];
        int n4 = k[99];
        n4 -= k[100];
        class_7452.field_6213 = n4 -= k[101];
        int n5 = k[102];
        n5 += k[103];
        class_7452.field_6008 = n5 ^= k[104];
        int n6 = k[105];
        n6 -= k[106];
        class_7452.field_6252 = n6 ^= k[107];
        if (((Boolean)e.getValue()).booleanValue()) {
            this.copyInventory(class_7452, class_7463);
        }
        class_7452.method_6122(class_1268.field_5810, new class_1799((class_1935)class_1802.field_8288));
        class_6383.method_53875((class_1297)class_7452);
        this.applyBuffs(class_7452);
        F = class_6383;
        f = class_7452;
        int n7 = k[108];
        n7 ^= k[109];
        g = n7 += k[110];
    }

    private final void applyBuffs(class_745 class_7452) {
        int n = k[111];
        n ^= k[112];
        int n2 = k[114];
        n2 ^= k[115];
        class_7452.method_6092(new class_1293(class_1294.field_5924, n += k[113], n2 -= k[116]));
        int n3 = k[117];
        n3 ^= k[118];
        int n4 = k[120];
        n4 ^= k[121];
        class_7452.method_6092(new class_1293(class_1294.field_5898, n3 -= k[119], n4 ^= k[122]));
        int n5 = k[123];
        n5 ^= k[124];
        int n6 = k[126];
        n6 -= k[127];
        class_7452.method_6092(new class_1293(class_1294.field_5907, n5 += k[125], n6 -= k[128]));
    }

    private final void copyInventory(class_745 class_7452, class_746 class_7462) {
        class_7452.method_6122(class_1268.field_5808, class_7462.method_6047().method_7972());
        class_7452.method_6122(class_1268.field_5810, class_7462.method_6079().method_7972());
        int n = k[129];
        n ^= k[130];
        int n2 = k[132];
        n2 += k[133];
        class_7452.method_31548().method_5447(n += k[131], class_7462.method_31548().method_5438(n2 -= k[134]).method_7972());
        int n3 = k[135];
        n3 ^= k[136];
        int n4 = k[138];
        n4 -= k[139];
        class_7452.method_31548().method_5447(n3 ^= k[137], class_7462.method_31548().method_5438(n4 += k[140]).method_7972());
        int n5 = k[141];
        n5 ^= k[142];
        int n6 = k[144];
        n6 ^= k[145];
        class_7452.method_31548().method_5447(n5 ^= k[143], class_7462.method_31548().method_5438(n6 -= k[146]).method_7972());
        int n7 = k[147];
        n7 += k[148];
        int n8 = k[150];
        n8 ^= k[151];
        class_7452.method_31548().method_5447(n7 += k[149], class_7462.method_31548().method_5438(n8 -= k[152]).method_7972());
    }

    private final float calculateMeleeDamage(class_746 class_7462, class_745 class_7452, float f2) {
        class_1282 class_12822 = class_7462.method_59958().method_7909().method_64193((class_1309)class_7462);
        if (class_12822 == null) {
            class_12822 = class_7462.method_48923().method_48802((class_1657)class_7462);
        }
        class_1282 class_12823 = class_12822;
        float f3 = (float)class_7462.method_45325(class_5134.field_23721);
        f3 *= 0.2f + f2 * f2 * 0.8f;
        f3 += class_7462.method_59958().method_7909().method_58403((class_1297)class_7452, f3, class_12823) * f2;
        if (this.shouldPlayCriticalSound(class_7462)) {
            f3 *= 1.5f;
        }
        return RangesKt.coerceAtLeast(class_1280.method_5496((class_1309)((class_1309)class_7452), (float)RangesKt.coerceAtLeast(f3, 0.0f), (class_1282)class_12823, (float)class_7452.method_6096(), (float)((float)class_7452.method_45325(class_5134.field_23725))), 0.0f);
    }

    private final float estimateExplosionDamage(class_243 class_2432, class_745 class_7452) {
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            return 0.0f;
        }
        class_638 class_6383 = class_6382;
        double d2 = Double.longBitsToDouble(0x5EFBB15F8C7D6552L ^ 0x1ED3B15F8C7D6552L);
        double d3 = class_2432.method_1022(class_7452.method_19538());
        if (d3 > d2) {
            return 0.0f;
        }
        double d4 = this.calculateExposure(class_2432, class_7452);
        if (d4 <= 0.0) {
            return 0.0f;
        }
        double d5 = RangesKt.coerceAtLeast(1.0 - d3 / d2, 0.0) * d4;
        float f2 = (float)((d5 * d5 + d5) / Double.longBitsToDouble(0x41B65F44CAA91F9CL ^ 0x1B65F44CAA91F9CL) * Double.longBitsToDouble(0xBB988F69AE45CCCAL ^ 0xFB848F69AE45CCCAL) * d2 + 1.0);
        return RangesKt.coerceAtLeast(class_1280.method_5496((class_1309)((class_1309)class_7452), (float)f2, (class_1282)class_6383.method_48963().method_48830(), (float)class_7452.method_6096(), (float)((float)class_7452.method_45325(class_5134.field_23725))), 0.0f);
    }

    private final double calculateExposure(class_243 class_2432, class_745 class_7452) {
        long l = -4341948608462320447L;
        long l2 = 6095486258656117288L;
        long l3 = -4578260405605317804L;
        long l4 = -2633792583082547069L;
        long l5 = -8350754622255261601L;
        long l6 = -1955470456940626572L;
        long l7 = -7119245399630895695L;
        long l8 = -2472407682255428790L;
        long l9 = 113618877596011366L;
        long l10 = -8708284155121674622L;
        long l11 = -1445950396790440071L;
        long l12 = 3060131790545738110L;
        long l13 = -2922813141426716003L;
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            return 0.0;
        }
        class_638 class_6383 = class_6382;
        class_238 class_2382 = class_7452.method_5829();
        long l14 = l12;
        int n = k[153];
        n ^= k[154];
        l12 = l14 ^ (3L ^ l14) & -1L >>> (n -= k[155]);
        long l15 = l13;
        int n2 = k[156];
        n2 ^= k[157];
        long l16 = l13 = l15 ^ (0L ^ l15) & -1L << (n2 += k[158]);
        int n3 = k[159];
        n3 += k[160];
        l13 = l16 ^ (0L ^ l16) & -1L >>> (n3 ^= k[161]);
        long l17 = l10;
        int n4 = k[162];
        n4 += k[163];
        l10 = l17 ^ (0L ^ l17) & -1L << (n4 ^= k[164]);
        while (true) {
            int n5 = k[165];
            n5 += k[166];
            if ((int)(l10 >>> (n5 -= k[167])) >= (int)l12) break;
            long l18 = l11;
            int n6 = k[168];
            n6 -= k[169];
            l11 = l18 ^ (0L ^ l18) & -1L << (n6 ^= k[170]);
            while (true) {
                int n7 = k[171];
                n7 += k[172];
                if ((int)(l11 >>> (n7 -= k[173])) >= (int)l12) break;
                long l19 = l12;
                int n8 = k[174];
                n8 ^= k[175];
                l12 = l19 ^ (0L ^ l19) & -1L << (n8 -= k[176]);
                while (true) {
                    int n9 = k[177];
                    n9 ^= k[178];
                    if ((int)(l12 >>> (n9 += k[179])) >= (int)l12) break;
                    int n10 = k[180];
                    n10 -= k[181];
                    int n11 = k[183];
                    n11 ^= k[184];
                    int n12 = k[186];
                    n12 -= k[187];
                    class_243 class_2433 = new class_243(this.lerpBox(class_2382.field_1323, class_2382.field_1320, (int)(l10 >>> (n10 ^= k[182])), (int)l12), this.lerpBox(class_2382.field_1322, class_2382.field_1325, (int)(l11 >>> (n11 += k[185])), (int)l12), this.lerpBox(class_2382.field_1321, class_2382.field_1324, (int)(l12 >>> (n12 ^= k[188])), (int)l12));
                    class_3965 class_39652 = class_6383.method_17742(new class_3959(class_2433, class_2432, class_3959.class_3960.field_17558, class_3959.class_242.field_1348, (class_1297)class_7452));
                    if (class_39652.method_17783() == class_239.class_240.field_1333) {
                        l13 += 0x100000000L;
                    }
                    long l20 = l13;
                    int n13 = k[189];
                    n13 -= k[190];
                    int n14 = k[192];
                    n14 -= k[193];
                    l13 = l20 ^ (l20 ^ l20 + (long)(n13 += k[191])) & -1L >>> (n14 ^= k[194]);
                    l12 += 0x100000000L;
                }
                l11 += 0x100000000L;
            }
            l10 += 0x100000000L;
        }
        if ((int)l13 == 0) {
            return 0.0;
        }
        int n15 = k[195];
        n15 ^= k[196];
        return (double)((int)(l13 >>> (n15 ^= k[197]))) / (double)((int)l13);
    }

    private final double lerpBox(double d2, double d3, int n, int n2) {
        int n3 = k[198];
        n3 -= k[199];
        if (n2 <= (n3 -= k[200])) {
            return (d2 + d3) * Double.longBitsToDouble(0xDC1847881F78F6E6L ^ 0xE3F847881F78F6E6L);
        }
        int n4 = k[201];
        n4 += k[202];
        double d4 = (double)n / (double)(n2 - (n4 -= k[203]));
        return d2 + (d3 - d2) * d4;
    }

    private final void applySimulatedDamage(class_745 class_7452, float f2, class_1282 class_12822) {
        block3: {
            long l = 1267040201208194933L;
            if (f2 <= 0.0f) {
                return;
            }
            class_7452.method_48922(class_12822);
            float f3 = class_7452.method_6032() + class_7452.method_6067() - f2;
            class_7452.method_6033(f3);
            this.applyLocalHurtFeedback(class_7452, class_12822);
            if (!class_7452.method_29504()) {
                return;
            }
            int n = k[204];
            n += k[205];
            int n2 = k[207];
            n2 += k[208];
            Intrinsics.checkNotNull(class_7452, (String)H[n += k[206]] + (String)H[n2 -= k[209]]);
            if (!((LivingEntityInvoker)class_7452).rain$tryUseDeathProtector(class_12822)) break block3;
            class_7452.method_6033(10.0f);
            class_746 class_7462 = b_0.getMc().field_1724;
            if (class_7462 != null && (class_7462 = class_7462.field_3944) != null) {
                class_746 class_7463 = class_7462;
                long l2 = l;
                int n3 = k[210];
                n3 -= k[211];
                l = l2 ^ (0L ^ l2) & -1L << (n3 -= k[212]);
                byte by = k[213];
                by -= k[214];
                new class_2663((class_1297)class_7452, by ^= k[215]).method_11471((class_2602)class_7463);
            }
        }
    }

    private final String configuredName() {
        String string;
        int n;
        String string2;
        long l = 4789639002182258252L;
        String string3 = string2 = ((Object)StringsKt.trim((CharSequence)((String)E.getValue()))).toString();
        long l2 = l;
        int n2 = k[216];
        n2 += k[217];
        l = l2 ^ (0L ^ l2) & -1L << (n2 -= k[218]);
        if (((CharSequence)string3).length() > 0) {
            int n3 = k[219];
            n3 += k[220];
            n = n3 ^= k[221];
        } else {
            int n4 = k[222];
            n4 -= k[223];
            n = n4 -= k[224];
        }
        if ((string = n != 0 ? string2 : null) == null) {
            int n5 = k[225];
            n5 += k[226];
            string = (String)H[n5 -= k[227]];
        }
        return string;
    }

    private final void playAttackFeedback(class_638 class_6382, class_746 class_7462, float f2) {
        class_3414 class_34142 = this.attackSound(class_7462, f2);
        class_6382.method_55116((class_1297)class_7462, class_34142, class_3419.field_15248, 1.0f, 1.0f);
    }

    private final class_3414 attackSound(class_746 class_7462, float f2) {
        class_3414 class_34142;
        if (this.shouldPlayCriticalSound(class_7462)) {
            class_3414 class_34143 = class_3417.field_15016;
            class_34142 = class_34143;
            int n = k[228];
            n ^= k[229];
            int n2 = k[231];
            n2 ^= k[232];
            Intrinsics.checkNotNullExpressionValue(class_34143, (String)H[n ^= k[230]] + (String)H[n2 ^= k[233]]);
        } else if (class_7462.method_5624() && f2 >= 0.9f) {
            class_3414 class_34144 = class_3417.field_14999;
            class_34142 = class_34144;
            int n = k[234];
            n -= k[235];
            int n3 = k[237];
            n3 += k[238];
            Intrinsics.checkNotNullExpressionValue(class_34144, (String)H[n -= k[236]] + (String)H[n3 ^= k[239]]);
        } else if (f2 >= 0.9f) {
            class_3414 class_34145 = class_3417.field_14840;
            class_34142 = class_34145;
            int n = k[240];
            n -= k[241];
            int n4 = k[243];
            n4 ^= k[244];
            int n5 = k[246];
            n5 ^= k[247];
            Intrinsics.checkNotNullExpressionValue(class_34145, (String)H[n ^= k[242]] + (String)H[n4 += k[245]] + (String)H[n5 -= k[248]]);
        } else {
            class_3414 class_34146 = class_3417.field_14625;
            class_34142 = class_34146;
            int n = k[249];
            n ^= k[250];
            int n6 = k[252];
            n6 += k[253];
            Intrinsics.checkNotNullExpressionValue(class_34146, (String)H[n += k[251]] + (String)H[n6 ^= k[254]]);
        }
        return class_34142;
    }

    private final boolean shouldPlayCriticalSound(class_746 class_7462) {
        int n;
        if (!(!(class_7462.field_6017 > 0.0) || class_7462.method_24828() || class_7462.method_6101() || class_7462.method_5799() || class_7462.method_5765() || class_7462.method_5624() || class_7462.method_6059(class_1294.field_5919))) {
            int n2 = k[255];
            n2 -= k[256];
            n = n2 += k[257];
        } else {
            int n3 = k[258];
            n3 += k[259];
            n = n3 -= k[260];
        }
        return n != 0;
    }

    private final void applyLocalHurtFeedback(class_745 class_7452, class_1282 class_12822) {
        int n = k[261];
        n += k[262];
        class_7452.field_6235 = n -= k[263];
        int n2 = k[264];
        n2 += k[265];
        class_7452.field_6254 = n2 += k[266];
        int n3 = k[267];
        n3 += k[268];
        class_7452.field_6008 = n3 ^= k[269];
        class_746 class_7462 = b_0.getMc().field_1724;
        class_7452.method_5879(class_7462 != null ? class_7462.method_36454() : class_7452.method_36454());
        int n4 = k[270];
        n4 += k[271];
        int n5 = k[273];
        n5 += k[274];
        Intrinsics.checkNotNull(class_7452, (String)H[n4 ^= k[272]] + (String)H[n5 ^= k[275]]);
        ((LivingEntityInvoker)class_7452).rain$playHurtSound(class_12822);
    }

    private final void removeFakePlayer() {
        class_745 class_7452 = f;
        if (class_7452 == null) {
            return;
        }
        class_745 class_7453 = class_7452;
        class_638 class_6382 = F;
        if (class_6382 != null) {
            class_6382.method_2945(class_7453.method_5628(), class_1297.class_5529.field_26999);
        }
        class_7453.method_5650(class_1297.class_5529.field_26999);
        f = null;
        F = null;
    }

    static {
        e_0.b();
        long l = -8469039791124553045L;
        long l2 = -8165445922198007777L;
        long l3 = 5149082726367179233L;
        long l4 = -6763462558819924384L;
        long l5 = 922777760539263245L;
        long l6 = -7675567574954913315L;
        long l7 = -2968336379717887666L;
        long l8 = 1452620563575476478L;
        long l9 = 896234644551271449L;
        long l10 = 4611921072935376922L;
        long l11 = -4835102498479411784L;
        long l12 = 8574899677208009477L;
        long l13 = 3082853389026884341L;
        long l14 = 8895087397648145389L;
        int n = k[276];
        n ^= k[277];
        H = new Object[n ^= k[278]];
        long l15 = l14;
        int n2 = k[279];
        n2 ^= k[280];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= k[281]);
        Object[] objectArray = new Object[k[282]];
        objectArray[e_0.k[283]] = i;
        objectArray[e_0.k[284]] = k[285];
        int n3 = k[286];
        Object object = e_0.A()[k[287]];
        if (object == null) {
            char[] cArray = "\u117f\u119f\u1186\u11a4\u1466\u142f\u1465\u144b\u1433\u144c\u1452\u145c\u1435\u144f\u116b\u1432\u1184\u117a\u117f\u116c\u142a\u11a0\u1466\u1468\u1187\u116b\u144e\u1789\u144d\u1432\u1467\u1793\u11a4\u1450\u1ada\u1467\u1466\u117f\u17bc\u1466\u1434\u11a4\u1449\u1452\u144b\u178a\u142d\u1188\u1ade\u17bb\u142f\u1453\u144d\u144b\u117f\u116c\u1453\u17c5\u1ad9\u1179\u1432\u1789\u142a\u1789\u1433\u117e\u1180\u17bc\u1434\u1793\u1434\u1432\u117f\u17c5\u119e\u17c6\u144c\u142e\u119d\u117a\u1179\u1435\u1434\u1450\u142d\u1449\u117a\u1179\u17bb\u1180\u1451\u1466\u17ab\u1795\u1186\u142a\u117f\u116c\u119f\u142a\u1795\u1789\u1180\u1432\u17c6\u1465\u17bc\u178a\u119f\u1179\u1ada\u144e\u1ade\u1466\u1430\u145c\u1ad9\u145c\u117f\u1187\u142d\u1434\u144c\u1ada\u1188\u144b\u117a\u1adf\u17c7\u142d\u145b\u144a\u1465\u1ade\u145c\u144d\u117d\u116c\u142f\u17ac\u1467\u144f\u142f\u1468\u11a4\u1185\u1184\u1adf\u17ac\u119e\u17bb\u17c5\u1434\u1789\u116c\u119f\u145c\u17c7\u119e\u1450\u142f\u144f\u144b\u1430\u17ac\u17ac\u1add\u1795\u1449\u119e\u144b\u1187\u11a4\u1429\u1ade\u1434\u1ae0\u117d\u142a\u1179\u142f\u17c6\u144c\u1187\u1793\u117e\u144a\u1465\u144d\u1ad9\u1453\u119e\u17bc\u142f\u1429\u17ab\u17ac\u144a\u1ae0\u1add\u17bc\u11a4\u1432\u142a\u17c7\u117a\u17c6\u142e\u1ade\u1ae0\u17c6\u1179\u1789\u1ad9\u144c\u1add\u1449\u178a\u1adf\u1adf\u116b\u117a\u142a\u1ade\u1795\u1431\u1430\u117d\u17bc\u1ada\u117f\u144e\u1429\u142d\u1454\u1468\u1ada\u144c\u1ae0\u17c7\u17ab\u119d\u1ade\u142a\u1187\u17ab\u17c5\u1185\u142a\u144b\u1449\u1ae0\u142a\u1180\u1429\u1431\u1186\u1795\u1466\u142d\u116b\u1793\u119e\u11a0\u1179\u117e\u1186\u1454\u1188\u17c7\u145b\u17ac\u1435\u1add\u1467\u116b\u1188\u145b\u1ade\u17ab\u1184\u178a\u17ac\u1ada\u119f\u1433\u1179\u117f\u17c6\u117f\u142e\u1795\u117a\u1449\u1186\u144d\u144f\u1795\u144f\u1187\u117d\u11a0\u1432\u1180\u1179\u1451\u1ada\u1433\u1450\u17c5\u117f\u116b\u1467\u17c6\u17bb\u142e\u17c6\u1435\u11a0\u1432\u1431\u145b\u1789\u117a\u1452\u144c\u1187\u1ade\u1adf\u1433\u1789\u117e\u1434\u1185\u145c\u1185\u117e\u1ade\u17c5\u117d\u17c5\u1adf\u1adf\u117d\u11a0\u17bb\u1ade\u145b\u1188\u11a0\u1add\u116c\u1793\u144c\u1452\u1187\u144b\u1188\u17ac\u1795\u1ada\u1452\u116c\u117e\u17c7\u144b\u1450\u11a4\u145b\u1185\u1452\u116b\u144e\u119e\u17bc\u1430\u1ada\u1ad9\u178a\u178a\u17ab\u1179\u1450\u116b\u142e\u1185\u119d\u117a\u142a\u144d\u1adf\u1ade\u142e\u117f\u142a\u1467\u1ada\u144f\u1187\u17bb\u142a\u1186\u1ada\u1429\u17ab\u1451\u178a\u1add\u1468\u1adf\u11a4\u142f\u119f\u1180\u144b\u1454\u144e\u178a\u116b\u1434\u145b\u17c7\u1466\u17bc\u119d\u1ade\u1432\u1adf\u1188\u1ade\u1450\u17bc\u116c\u1ade\u1179\u1451\u142f\u142f\u142d\u11a4\u1429\u1454\u142e\u17ab\u1adf\u11a0\u116b\u116b\u1ad9\u1433\u142a\u144e\u1ad9\u1adf\u11a0\u178a\u17bc\u1435\u1449\u1429\u1793\u142d\u17ac\u1454\u17bc\u1179\u1adf\u142e\u1add\u142d\u1184\u178a\u17bc\u145c\u178a\u1453\u117e\u142f\u142f\u1452\u1add\u1789\u1433\u144d\u1453\u1187\u1186\u17ab\u1793\u1188\u17bb\u11a4\u1ae0\u119e\u1452\u1434\u1466\u1466\u1185\u144a\u1795\u144f\u1453\u1429\u1450\u1449\u1ada\u142e\u17ab\u117d\u1466\u1789\u1ae0\u1431\u17c7\u144a\u1ad9\u1430\u1ad9\u144d\u1add\u17ac\u1adf\u119e\u1add\u144c\u117a\u144d\u17c7\u1467\u1186\u1451\u117a\u1450\u119e\u117d\u117f\u1adf\u119e\u1184\u1add\u142d\u1450\u1467\u144e\u142a\u1454\u119f\u1434\u1434\u1430\u1ade\u116c\u1180\u1465\u17c7\u1465\u117d\u116b\u145b\u142e\u1449\u116b\u117a\u119d\u1434\u1451\u1449\u144c\u17ac\u1179\u1433\u1430\u17ac\u144b\u1187\u17c5\u119d\u142d\u142a\u1179\u17c7\u116b\u1453\u144d\u17c7\u1429\u1ad9\u1466\u142d\u119f\u142a\u1432\u119d\u1466\u145c\u1ae0\u116b\u142e\u1adf\u1187\u1188\u117e\u1ad9\u1add\u119f\u1adf\u1432\u116c\u142a\u1186\u1185\u1186\u17c6\u144e\u145b\u1186\u1454\u142e\u1188\u1180\u1ade\u178a\u144f\u17c7\u1187\u144e\u116c\u1435\u1793\u144f\u1449\u117a\u142d\u1453\u1450\u17c7\u142a\u117e\u119d\u1ade\u1465\u1450\u117d\u17c7\u117f\u1467\u1452\u1ad9\u119e\u1adf\u1ade\u11a4\u144d\u17ab\u117e\u17bc\u1429\u116c\u144f\u1184\u144b\u117f\u1adf\u1452\u1add\u1429\u1179\u1432\u142a\u11a0\u142a\u144d\u1465\u17ab\u17ab\u1186\u1795\u1432\u1451\u1429\u1795\u17ac\u17bc\u17ac\u1ada\u1188\u1793\u145c\u1454\u1add\u1793\u1ad9\u1435\u1184\u144c\u144a\u1185\u1431\u17bb\u17bc\u11a4\u1452\u119e\u11a0\u142a\u1179\u1180\u1432\u1188\u145b\u1429\u17ac\u1793\u1188\u1184\u117a\u144f\u17ab\u1184\u119d\u142d\u1ad9\u116c\u11a0\u117f\u1185\u1429\u1435\u144c\u1451\u17c7\u145b\u1187\u178a\u11a4\u116b\u117d\u142e\u1793\u1434\u142a\u1795\u1ade\u145b\u144c\u17c6\u1ae1".toCharArray();
            for (int i2 = k[288]; i2 < k[289]; ++i2) {
                int n4 = cArray[i2];
                n4 += k[290];
                n4 += k[291];
                n4 += k[292];
                n4 -= k[293];
                n4 -= k[294];
                n4 -= k[295];
                n4 += k[296];
                n4 ^= k[297];
                n4 -= k[298];
                n4 ^= k[299];
                n4 -= k[300];
                n4 ^= k[301];
                cArray[i2] = (char)(n4 -= k[302]);
            }
            object = e_0.A()[e_0.k[303]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)e_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = k[304];
        n5 -= k[305];
        l5 = l16 ^ (0x1E100000000L ^ l16) & -1L << (n5 += k[306]);
        long l17 = l12;
        int n6 = k[307];
        n6 += k[308];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= k[309]);
        while (true) {
            int n7 = k[310];
            n7 += k[311];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= k[312]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = k[313];
            n9 -= k[314];
            int n10 = k[316];
            n10 += k[317];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= k[315])) & -1L >>> (n10 ^= k[318]);
            long l19 = l8;
            int n11 = k[319];
            n11 ^= k[320];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= k[321]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = k[322];
            n13 -= k[323];
            int n14 = k[325];
            n14 += k[326];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= k[324])) & -1L >>> (n14 -= k[327]);
            int n15 = k[328];
            n15 -= k[329];
            long l21 = l9;
            int n16 = k[331];
            n16 ^= k[332];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= k[330]) ^ l21) & -1L << (n16 ^= k[333]);
            int n17 = k[334];
            n17 += k[335];
            n17 -= k[336];
            int n18 = k[337];
            n18 ^= k[338];
            long l22 = l11;
            int n19 = k[340];
            n19 -= k[341];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= k[339]))) ^ l22) & -1L >>> (n19 ^= k[342]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = k[343];
            n20 ^= k[344];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += k[345]);
            while (true) {
                int n21 = k[346];
                n21 += k[347];
                if ((int)(l13 >>> (n21 ^= k[348])) >= (int)l11) break;
                int n22 = k[349];
                n22 += k[350];
                int n23 = k[352];
                n23 += k[353];
                cArray2[(int)(l13 >>> (n22 += e_0.k[351]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += k[354]))];
                l13 += 0x100000000L;
            }
            int n24 = k[355];
            n24 -= k[356];
            int n25 = (int)(l14 >>> (n24 -= k[357]));
            l14 += 0x100000000L;
            e_0.H[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = k[358];
            n26 += k[359];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= k[360]);
        }
        INSTANCE = new e_0();
        int n27 = k[361];
        n27 += k[362];
        int n28 = k[364];
        n28 -= k[365];
        UUID uUID = UUID.fromString((String)H[n27 += k[363]] + (String)H[n28 ^= k[366]]);
        int n29 = k[367];
        n29 ^= k[368];
        Intrinsics.checkNotNullExpressionValue(uUID, (String)H[n29 ^= k[369]]);
        D = uUID;
        int n30 = k[370];
        n30 += k[371];
        boolean bl = k[373];
        bl += k[374];
        e = INSTANCE.boolean((String)H[n30 -= k[372]], bl -= k[375]);
        int n31 = k[376];
        n31 ^= k[377];
        int n32 = k[379];
        n32 -= k[380];
        int n33 = k[382];
        n33 ^= k[383];
        E = INSTANCE.text((String)H[n31 += k[378]], (String)H[n32 ^= k[381]], n33 ^= k[384]);
        h = class_243.field_1353;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[k[385]];
        String string = (String)object[k[386]];
        object = object[k[387]];
        Object[] objectArray = j;
        if (j == null) {
            objectArray = j = new Object[k[388]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[k[389]];
                i = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[k[391] ^ k[392]];
                byArray[e_0.k[393] ^ e_0.k[394]] = k[395] ^ k[396];
                byArray[e_0.k[397] ^ e_0.k[398]] = k[399] ^ 0x4229;
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
                objectArray2[e_0.k[390]] = byArray;
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
                Object object4 = e_0.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u7112\u70dc\u70e1\u70c6\u70d0\u70ec\u70dd\u70bf\u70d6\u70ba\u70da\u70c3\u70c7\u70a9\u70f9\u70da\u70e7\u7137".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= 0xEA11;
                        n2 += 51826;
                        n2 += 25443;
                        n2 ^= 0x6275;
                        n2 -= 26245;
                        n2 ^= 0x2316;
                        n2 -= 50266;
                        n2 ^= 0x440A;
                        n2 += 54347;
                        n2 += 37947;
                        cArray[i2] = (char)(n2 += 45276);
                    }
                    object4 = e_0.A()[1] = new String(cArray);
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
                Object object5 = e_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u263a\u263e\u260c".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 -= 355;
                        n3 ^= 0x2AB5;
                        n3 ^= 0xB5F5;
                        n3 -= 53766;
                        n3 ^= 0x7C1A;
                        n3 ^= 0x2CBA;
                        n3 += 32634;
                        n3 += 33131;
                        n3 += 37213;
                        cArray[i3] = (char)(n3 += 46286);
                    }
                    object5 = e_0.A()[2] = new String(cArray);
                }
                I = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = e_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u75cf\u75d3\u753d\u7579\u75cd\u75cc\u75cd\u7579\u753e\u75d5\u75cd\u753d\u75a3\u753e\u752f\u7532\u7532\u7537\u7538\u7531".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 55776;
                    n4 ^= 0x9C81;
                    n4 ^= 0xAA3;
                    n4 -= 2762;
                    n4 += 48363;
                    n4 -= 51372;
                    n4 += 58446;
                    n4 -= 61871;
                    n4 ^= 0xBED0;
                    n4 += 38612;
                    n4 -= 30843;
                    n4 += 35419;
                    cArray[i4] = (char)(n4 += 92);
                }
                object6 = e_0.A()[3] = new String(cArray);
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
        e_0.k[0xB7EC ^ 0xB780] = 0xB7BD ^ 0xB780;
        e_0.k[0xAE0A ^ 0xAE30] = 0xFFFF51C9 ^ 0xAE30;
        e_0.k[0x945E ^ 0x943F] = 0xFFFF6BA4 ^ 0x943F;
        e_0.k[0xBEC5 ^ 0xBFA3] = 0xBFA8 ^ 0xBFA3;
        e_0.k[0xF44C ^ 0xF432] = 0xFFFF0BAD ^ 0xF432;
        e_0.k[0x2FB4 ^ 0x2EDC] = 0x2E91 ^ 0x2EDC;
        e_0.k[0x8E16 ^ 0x8F07] = 0xFFFF708A ^ 0x8F07;
        e_0.k[0xA962 ^ 0xA871] = 0xFFFF57BB ^ 0xA871;
        e_0.k[0xAE29 ^ 0xAEE5] = 0xFFFF5114 ^ 0xAEE5;
        e_0.k[0x2142 ^ 0x203A] = 0xFFFFDFA2 ^ 0x203A;
        e_0.k[0x3DF3 ^ 0x3C9C] = 0xFFFFC339 ^ 0x3C9C;
        e_0.k[0x7221 ^ 0x727B] = 0xFFFF8DDB ^ 0x727B;
        e_0.k[0xCDD8 ^ 0xCCC0] = 0xFFFF3346 ^ 0xCCC0;
        e_0.k[0x1053E ^ 0x10570] = 0xFFFEFAD1 ^ 0x10570;
        e_0.k[0xA9A0 ^ 0xA918] = 0xFFFF5684 ^ 0xA918;
        e_0.k[0xB6F6 ^ 0xB789] = 0xFFFF4866 ^ 0xB789;
        e_0.k[0x4973 ^ 0x4878] = 0x4846 ^ 0x4878;
        e_0.k[0xE722 ^ 0xE720] = 0xE73F ^ 0xE720;
        e_0.k[0x14D8 ^ 0x145A] = 0x144B ^ 0x145A;
        e_0.k[0x4F28 ^ 0x4F1C] = 0x4F0F ^ 0x4F1C;
        e_0.k[0xF3F2 ^ 0xF3DB] = 0xF3A0 ^ 0xF3DB;
        e_0.k[0x803D ^ 0x81BD] = 0x8191 ^ 0x81BD;
        e_0.k[0xFE4F ^ 0xFEBF] = 0xFFFF0151 ^ 0xFEBF;
        e_0.k[0x1023A ^ 0x10219] = 0xFFFEFDFD ^ 0x10219;
        e_0.k[0xAC66 ^ 0xACA8] = 0xACD6 ^ 0xACA8;
        e_0.k[0x3893 ^ 0x38FA] = 0xFFFFC754 ^ 0x38FA;
        e_0.k[0x7F1D ^ 0x7F13] = 0x7F7E ^ 0x7F13;
        e_0.k[0x2CFA ^ 0x2D98] = 0xFFFFD24E ^ 0x2D98;
        e_0.k[0x9031 ^ 0x912C] = 0x912C ^ 0x912C;
        e_0.k[0xF1DB ^ 0xF1FA] = 0xFFFF0E41 ^ 0xF1FA;
        e_0.k[0xD90 ^ 0xD06] = 0xD73 ^ 0xD06;
        e_0.k[0xB3D0 ^ 0xB2D2] = 0xFFFF4D5E ^ 0xB2D2;
        e_0.k[0x15F3 ^ 0x14F3] = 0xFFFFEB0A ^ 0x14F3;
        e_0.k[0x10DEA ^ 0x10D2E] = 0x10D1C ^ 0x10D2E;
        e_0.k[0x4CFC ^ 0x4CA9] = 0xFFFFB354 ^ 0x4CA9;
        e_0.k[0x1C9A ^ 0x1CDB] = 0x1CE5 ^ 0x1CDB;
        e_0.k[0xC072 ^ 0xC01D] = 0xFFFF18C8 ^ 0xC01D;
        e_0.k[0x44B ^ 0x45C] = 0x473 ^ 0x45C;
        e_0.k[0xB71C ^ 0xB627] = 0xB669 ^ 0xB627;
        e_0.k[0xCB6 ^ 0xDA1] = 0xFFFFF227 ^ 0xDA1;
        e_0.k[0xA01E ^ 0xA0BD] = 0xA0BD ^ 0xA0BD;
        e_0.k[0x39E1 ^ 0x38AF] = 0xFFFFC706 ^ 0x38AF;
        e_0.k[0x3567 ^ 0x3537] = 0xFFFFCAB5 ^ 0x3537;
        e_0.k[0x2462 ^ 0x2568] = 0xFFFFDABD ^ 0x2568;
        e_0.k[0xA7B2 ^ 0xA757] = 0xFFFF58BB ^ 0xA757;
        e_0.k[0x6039 ^ 0x61BE] = 0x4E76 ^ 0x61BE;
        e_0.k[0xC2 ^ 0x1EE] = 0xE358 ^ 0x1EE;
        e_0.k[0x108DC ^ 0x10843] = 0x10877 ^ 0x10843;
        e_0.k[0x5574 ^ 0x55E8] = 0xFFFFAA75 ^ 0x55E8;
        e_0.k[0xF487 ^ 0xF4D0] = 0xFFFF5B25 ^ 0xF4D0;
        e_0.k[0xBD1C ^ 0xBD8C] = 0xFFFF4278 ^ 0xBD8C;
        e_0.k[0xCA8A ^ 0xCAB2] = 0xFFFF3522 ^ 0xCAB2;
        e_0.k[0x70D9 ^ 0x7051] = 0xFFFF8FCA ^ 0x7051;
        e_0.k[0x299 ^ 0x246] = 0x230 ^ 0x246;
        e_0.k[0xE2D4 ^ 0xE22B] = 0xFFFF1DF6 ^ 0xE22B;
        e_0.k[0xEDA8 ^ 0xECA5] = 0xEC9B ^ 0xECA5;
        e_0.k[0x289C ^ 0x291F] = 0x291F ^ 0x291F;
        e_0.k[0xE6 ^ 0xE9] = 0xFFFFFFB6 ^ 0xE9;
        e_0.k[0xA523 ^ 0xA456] = 0xFFFF5BA5 ^ 0xA456;
        e_0.k[0x832A ^ 0x83E9] = 0x83E4 ^ 0x83E9;
        e_0.k[0xD140 ^ 0xD1E4] = 0xFFFF2E06 ^ 0xD1E4;
        e_0.k[0xCBB3 ^ 0xCB66] = 0xCBD4 ^ 0xCB66;
        e_0.k[0x2CD0 ^ 0x2C41] = 0xFFFFD38B ^ 0x2C41;
        e_0.k[0x199B ^ 0x1929] = 0xFFFFE69D ^ 0x1929;
        e_0.k[0xE6FE ^ 0xE6F4] = 0xFFFF192B ^ 0xE6F4;
        e_0.k[0x479C ^ 0x4716] = 0x472F ^ 0x4716;
        e_0.k[0xEA2D ^ 0xEB5E] = 0xFFFF14C3 ^ 0xEB5E;
        e_0.k[0x9B06 ^ 0x9BCE] = 0x9BB0 ^ 0x9BCE;
        e_0.k[0x40BE ^ 0x40A7] = 0xFFFFBF19 ^ 0x40A7;
        e_0.k[0xAF1D ^ 0xAE0F] = 0xAE5D ^ 0xAE0F;
        e_0.k[0xF0F7 ^ 0xF1F1] = 0xFFFF0E5F ^ 0xF1F1;
        e_0.k[0xE61 ^ 0xF24] = 0xF10 ^ 0xF24;
        e_0.k[0x4DCF ^ 0x4C9A] = 0xFFFFB363 ^ 0x4C9A;
        e_0.k[0x31B0 ^ 0x3198] = 0x31DB ^ 0x3198;
        e_0.k[0xFC66 ^ 0xFC32] = 0xFFFF03D2 ^ 0xFC32;
        e_0.k[0x1057B ^ 0x1045D] = 0x1DF74 ^ 0x1045D;
        e_0.k[0x6BD8 ^ 0x6B70] = 0x6B77 ^ 0x6B70;
        e_0.k[0x2B92 ^ 0x2BF2] = 0x2B8F ^ 0x2BF2;
        e_0.k[0x8B87 ^ 0x8B40] = 0x8B59 ^ 0x8B40;
        e_0.k[0x6B57 ^ 0x6A58] = 0xFFFF9591 ^ 0x6A58;
        e_0.k[0xEDB9 ^ 0xED2C] = 0xED54 ^ 0xED2C;
        e_0.k[0x7D62 ^ 0x7C77] = 0x7C0C ^ 0x7C77;
        e_0.k[0x6811 ^ 0x68FA] = 0x68B1 ^ 0x68FA;
        e_0.k[0x5C95 ^ 0x5CAB] = 0x5C83 ^ 0x5CAB;
        e_0.k[0x997A ^ 0x9948] = 0xFFFF66BE ^ 0x9948;
        e_0.k[0x96BB ^ 0x96D1] = 0xFFFF692D ^ 0x96D1;
        e_0.k[0x118E ^ 0x1080] = 0x10A1 ^ 0x1080;
        e_0.k[0x2A82 ^ 0x2ADA] = 0x2AEB ^ 0x2ADA;
        e_0.k[0x8F ^ 0x2D] = 0xFFFFFFEF ^ 0x2D;
        e_0.k[0x2EB7 ^ 0x2FED] = 0xFFFFD084 ^ 0x2FED;
        e_0.k[0x715A ^ 0x71B8] = 0x71BD ^ 0x71B8;
        e_0.k[0xC712 ^ 0xC64C] = 0xC62C ^ 0xC64C;
        e_0.k[0xD69B ^ 0xD7D4] = 0xD7C6 ^ 0xD7D4;
        e_0.k[0xBADE ^ 0xBA3D] = 0xBA35 ^ 0xBA3D;
        e_0.k[0xF0EA ^ 0xF0B6] = 0xFFFF0F61 ^ 0xF0B6;
        e_0.k[0xC2A6 ^ 0xC22B] = 0xFFFF3DC8 ^ 0xC22B;
        e_0.k[0x2426 ^ 0x24F7] = 0x249C ^ 0x24F7;
        e_0.k[0x7D2B ^ 0x7C63] = 0x7C47 ^ 0x7C63;
        e_0.k[0x3E37 ^ 0x3E37] = 0x3E2F ^ 0x3E37;
        e_0.k[0x10877 ^ 0x10967] = 0xFFFEF68F ^ 0x10967;
        e_0.k[0x1F27 ^ 0x1F8B] = 0xFFFFE029 ^ 0x1F8B;
        e_0.k[0xB60B ^ 0xB750] = 0xB779 ^ 0xB750;
        e_0.k[0xB01C ^ 0xB0D1] = 0xFFFF4F44 ^ 0xB0D1;
        e_0.k[0x2CF7 ^ 0x2D90] = 0x2DF2 ^ 0x2D90;
        e_0.k[0x2BE0 ^ 0x2B4E] = 0xFFFFD49C ^ 0x2B4E;
        e_0.k[0x12FF ^ 0x1206] = 0x1214 ^ 0x1206;
        e_0.k[0xD2CC ^ 0xD2FF] = 0xFFFF2D1D ^ 0xD2FF;
        e_0.k[0x81A8 ^ 0x8089] = 0x8265 ^ 0x8089;
        e_0.k[0x1273 ^ 0x1251] = 0x127B ^ 0x1251;
        e_0.k[0xECB ^ 0xFD5] = 0xFD7 ^ 0xFD5;
        e_0.k[0x9B4E ^ 0x9B45] = 0x9B03 ^ 0x9B45;
        e_0.k[0xB809 ^ 0xB81A] = 0xFFFF4788 ^ 0xB81A;
        e_0.k[0xF6AB ^ 0xF7E9] = 0xF74C ^ 0xF7E9;
        e_0.k[0x120A ^ 0x1387] = 0x51A7 ^ 0x1387;
        e_0.k[0x5910 ^ 0x590A] = 0x5942 ^ 0x590A;
        e_0.k[0xE4C6 ^ 0xE45B] = 0xE46B ^ 0xE45B;
        e_0.k[0xC9D ^ 0xC65] = 0xC39 ^ 0xC65;
        e_0.k[0x44C9 ^ 0x45FD] = 0xFFFFBA5C ^ 0x45FD;
        e_0.k[0x5DDE ^ 0x5DAC] = 0xFFFFA262 ^ 0x5DAC;
        e_0.k[0xF871 ^ 0xF92C] = 0xFFFF064B ^ 0xF92C;
        e_0.k[0xB1CC ^ 0xB158] = 0xFFFF4EC2 ^ 0xB158;
        e_0.k[0x342B ^ 0x346C] = 0x3435 ^ 0x346C;
        e_0.k[0x5B87 ^ 0x5B31] = 0x5B14 ^ 0x5B31;
        e_0.k[0xF050 ^ 0xF159] = 0xFFFF0EBC ^ 0xF159;
        e_0.k[0x27E7 ^ 0x27EA] = 0xFFFFD860 ^ 0x27EA;
        e_0.k[0xFF4E ^ 0xFEC6] = 0xD11E ^ 0xFEC6;
        e_0.k[0x6E91 ^ 0x6EE7] = 0xFFFF911F ^ 0x6EE7;
        e_0.k[0x8F52 ^ 0x8E29] = 0xFFFF715C ^ 0x8E29;
        e_0.k[0x6FA5 ^ 0x6FCB] = 0x6F80 ^ 0x6FCB;
        e_0.k[0x1FA6 ^ 0x1E91] = 0xFFFFE13B ^ 0x1E91;
        e_0.k[0xAA34 ^ 0xAAFE] = 0xAAA6 ^ 0xAAFE;
        e_0.k[0x9D19 ^ 0x9DEF] = 0x9DC1 ^ 0x9DEF;
        e_0.k[0x5119 ^ 0x51F8] = 0x51FE ^ 0x51F8;
        e_0.k[0x4D52 ^ 0x4D2B] = 0xFFFFB2B3 ^ 0x4D2B;
        e_0.k[0xD5F7 ^ 0xD584] = 0xD59F ^ 0xD584;
        e_0.k[0x4418 ^ 0x44AC] = 0x44B9 ^ 0x44AC;
        e_0.k[0xD5E3 ^ 0xD570] = 0xD565 ^ 0xD570;
        e_0.k[0x441 ^ 0x4CA] = 0x4E8 ^ 0x4CA;
        e_0.k[0xD2AD ^ 0xD208] = 0xD20C ^ 0xD208;
        e_0.k[0x761 ^ 0x62A] = 0x679 ^ 0x62A;
        e_0.k[0x60D4 ^ 0x60A8] = 0x60EB ^ 0x60A8;
        e_0.k[0xA6A7 ^ 0xA7DB] = 0xFFFF5852 ^ 0xA7DB;
        e_0.k[0xE313 ^ 0xE366] = 0xFFFF3B89 ^ 0xE366;
        e_0.k[0x12DD ^ 0x1205] = 0x128D ^ 0x1205;
        e_0.k[0x7B87 ^ 0x7B57] = 0x7B6E ^ 0x7B57;
        e_0.k[0x7F42 ^ 0x7F73] = 0x7F56 ^ 0x7F73;
        e_0.k[0x9602 ^ 0x96D5] = 0x96A9 ^ 0x96D5;
        e_0.k[0x5352 ^ 0x53E9] = 0xFFFFAC10 ^ 0x53E9;
        e_0.k[0x9A99 ^ 0x9A4F] = 0x9A1C ^ 0x9A4F;
        e_0.k[0x9A7 ^ 0x9E7] = 0xFFFFF652 ^ 0x9E7;
        e_0.k[0x10AC ^ 0x1182] = 0xC438 ^ 0x1182;
        e_0.k[0x9330 ^ 0x9277] = 0x925B ^ 0x9277;
        e_0.k[0xA84A ^ 0xA828] = 0xA830 ^ 0xA828;
        e_0.k[0x2B15 ^ 0x2B3E] = 0xFFFFD4B1 ^ 0x2B3E;
        e_0.k[0x6412 ^ 0x6539] = 0x79A8 ^ 0x6539;
        e_0.k[0xFE35 ^ 0xFE88] = 0xFFFF01E7 ^ 0xFE88;
        e_0.k[0x2DB8 ^ 0x2CEF] = 0x2CB2 ^ 0x2CEF;
        e_0.k[0x603A ^ 0x6052] = 0x6059 ^ 0x6052;
        e_0.k[0x5266 ^ 0x52D1] = 0xFFFFADDB ^ 0x52D1;
        e_0.k[0x45E9 ^ 0x451E] = 0x4555 ^ 0x451E;
        e_0.k[0x664B ^ 0x670A] = 0x6702 ^ 0x670A;
        e_0.k[0x3F63 ^ 0x3E20] = 0x3E61 ^ 0x3E20;
        e_0.k[0x1AE8 ^ 0x1AE4] = 0x1A32 ^ 0x1AE4;
        e_0.k[0x14AF ^ 0x1494] = 0x14F8 ^ 0x1494;
        e_0.k[0x9C6 ^ 0x985] = 0xFFFFF62C ^ 0x985;
        e_0.k[0x297A ^ 0x2955] = 0x290F ^ 0x2955;
        e_0.k[0xD119 ^ 0xD168] = 0xFFFF2EAD ^ 0xD168;
        e_0.k[0x103CD ^ 0x1034E] = 0x10342 ^ 0x1034E;
        e_0.k[0x2039 ^ 0x2086] = 0x20A8 ^ 0x2086;
        e_0.k[0xE0E4 ^ 0xE00B] = 0xE027 ^ 0xE00B;
        e_0.k[0x42FC ^ 0x4257] = 0x4219 ^ 0x4257;
        e_0.k[0x9594 ^ 0x94C7] = 0x949E ^ 0x94C7;
        e_0.k[0x46BE ^ 0x465E] = 0x4649 ^ 0x465E;
        e_0.k[0x3D29 ^ 0x3C10] = 0x3C13 ^ 0x3C10;
        e_0.k[0x2850 ^ 0x2842] = 0x287C ^ 0x2842;
        e_0.k[0xED32 ^ 0xED3A] = 0xED24 ^ 0xED3A;
        e_0.k[0xC9C7 ^ 0xC914] = 0xC942 ^ 0xC914;
        e_0.k[0x104B4 ^ 0x104EF] = 0xFFFEFB26 ^ 0x104EF;
        e_0.k[0x6025 ^ 0x6110] = 0xFFFF9EE0 ^ 0x6110;
        e_0.k[0xABCD ^ 0xAA43] = 0xE86A ^ 0xAA43;
        e_0.k[0x36AD ^ 0x3653] = 0x3646 ^ 0x3653;
        e_0.k[0xC3CF ^ 0xC33D] = 0xC368 ^ 0xC33D;
        e_0.k[0x6FA ^ 0x775] = 0x4552 ^ 0x775;
        e_0.k[0x3B01 ^ 0x3B06] = 0xFFFFC4B3 ^ 0x3B06;
        e_0.k[0x4134 ^ 0x4111] = 0xFFFFBEE8 ^ 0x4111;
        e_0.k[0x871E ^ 0x87C2] = 0x8788 ^ 0x87C2;
        e_0.k[0x832D ^ 0x8333] = 0x832F ^ 0x8333;
        e_0.k[0xBBD5 ^ 0xBB38] = 0xFFFF44DB ^ 0xBB38;
        e_0.k[0xA99C ^ 0xA91D] = 0xA914 ^ 0xA91D;
        e_0.k[0x58F6 ^ 0x5995] = 0xFFFFA60A ^ 0x5995;
        e_0.k[0xEEC6 ^ 0xEE7A] = 0xFFFF11DE ^ 0xEE7A;
        e_0.k[0x6990 ^ 0x69E8] = 0xFFFF9608 ^ 0x69E8;
        e_0.k[0x107D1 ^ 0x1075E] = 0xFFFEF8BA ^ 0x1075E;
        e_0.k[0x1541 ^ 0x15E1] = 0x15CB ^ 0x15E1;
        e_0.k[0x104D1 ^ 0x10456] = 0x1047E ^ 0x10456;
        e_0.k[0x897B ^ 0x8937] = 0x8916 ^ 0x8937;
        e_0.k[0xB01F ^ 0xB01C] = 0xB050 ^ 0xB01C;
        e_0.k[0xE0DD ^ 0xE184] = 0xE18F ^ 0xE184;
        e_0.k[0xD583 ^ 0xD5B3] = 0xFFFF2A60 ^ 0xD5B3;
        e_0.k[0xDAB7 ^ 0xDA2D] = 0xFFFF25BF ^ 0xDA2D;
        e_0.k[0xFEFF ^ 0xFEA1] = 0xFE85 ^ 0xFEA1;
        e_0.k[0xDEB5 ^ 0xDFE7] = 0xFFFF205A ^ 0xDFE7;
        e_0.k[0x10CC0 ^ 0x10CE7] = 0xFFFEF32F ^ 0x10CE7;
        e_0.k[0xF9D8 ^ 0xF9BC] = 0xF9A0 ^ 0xF9BC;
        e_0.k[0x7011 ^ 0x716B] = 0x7124 ^ 0x716B;
        e_0.k[0x8EAA ^ 0x8F2F] = 0x8F2E ^ 0x8F2F;
        e_0.k[0x7B3F ^ 0x7B1F] = 0xFFFF84DD ^ 0x7B1F;
        e_0.k[0x7FC6 ^ 0x7EFE] = 0xFFFF817C ^ 0x7EFE;
        e_0.k[0x1D08 ^ 0x1C3E] = 0xFFFFE3C6 ^ 0x1C3E;
        e_0.k[0xD882 ^ 0xD876] = 0xFFFF27DA ^ 0xD876;
        e_0.k[0xF73B ^ 0xF620] = 0xF620 ^ 0xF620;
        e_0.k[0x103AA ^ 0x10377] = 0xFFFEFC85 ^ 0x10377;
        e_0.k[0x6CB4 ^ 0x6DE2] = 0xFFFF922A ^ 0x6DE2;
        e_0.k[0xB492 ^ 0xB5FE] = 0xFFFF4A32 ^ 0xB5FE;
        e_0.k[0xA5F3 ^ 0xA51F] = 0xFFFF5ADE ^ 0xA51F;
        e_0.k[0x17C4 ^ 0x16E7] = 0xECA6 ^ 0x16E7;
        e_0.k[0x9BCC ^ 0x9BE6] = 0x9B9B ^ 0x9BE6;
        e_0.k[0xB07D ^ 0xB17E] = 0xFFFF4E87 ^ 0xB17E;
        e_0.k[0x6C6C ^ 0x6D08] = 0xFFFF92D4 ^ 0x6D08;
        e_0.k[0xACBF ^ 0xADD1] = 0xADDE ^ 0xADD1;
        e_0.k[0x69F ^ 0x6B3] = 0xFFFFF947 ^ 0x6B3;
        e_0.k[0xC99A ^ 0xC982] = 0xC928 ^ 0xC982;
        e_0.k[0x6BDA ^ 0x6BA1] = 0x4C68 ^ 0x6BA1;
        e_0.k[0x10D82 ^ 0x10CBC] = 0x10CF6 ^ 0x10CBC;
        e_0.k[0x70D9 ^ 0x70D8] = 0x70DE ^ 0x70D8;
        e_0.k[0x104AE ^ 0x10592] = 0x1052E ^ 0x10592;
        e_0.k[0x52E1 ^ 0x5282] = 0x52CA ^ 0x5282;
        e_0.k[0x9EA0 ^ 0x9E5D] = 0xFFFF61B0 ^ 0x9E5D;
        e_0.k[0x3CB ^ 0x2BB] = 0xFFFFFD52 ^ 0x2BB;
        e_0.k[0xE6E2 ^ 0xE6AA] = 0xE6DA ^ 0xE6AA;
        e_0.k[0x1291 ^ 0x138D] = 0x138C ^ 0x138D;
        e_0.k[0x10973 ^ 0x10915] = 0xFFFEF6C5 ^ 0x10915;
        e_0.k[0xAC51 ^ 0xAC7C] = 0xFFFF5392 ^ 0xAC7C;
        e_0.k[0xB200 ^ 0xB332] = 0xFFFF4CB1 ^ 0xB332;
        e_0.k[0xD1FE ^ 0xD153] = 0xFFFF2E83 ^ 0xD153;
        e_0.k[0x996 ^ 0x9DF] = 0xFFFFF644 ^ 0x9DF;
        e_0.k[0xCC3D ^ 0xCC04] = 0xCC62 ^ 0xCC04;
        e_0.k[0xC209 ^ 0xC254] = 0xFFFF3D20 ^ 0xC254;
        e_0.k[0x836D ^ 0x82EF] = 0x82ED ^ 0x82EF;
        e_0.k[0xA8F7 ^ 0xA9E3] = 0xFFFF5610 ^ 0xA9E3;
        e_0.k[0x10DE9 ^ 0x10D18] = 0xFFFEF2B4 ^ 0x10D18;
        e_0.k[0xB516 ^ 0xB547] = 0xB5F7 ^ 0xB547;
        e_0.k[0x6F5E ^ 0x6E06] = 0x6E4E ^ 0x6E06;
        e_0.k[0xCE0A ^ 0xCE47] = 0xCE61 ^ 0xCE47;
        e_0.k[0x19C5 ^ 0x19D9] = 0x19D9 ^ 0x19D9;
        e_0.k[0xDB64 ^ 0xDB61] = 0xFFFF24D9 ^ 0xDB61;
        e_0.k[0x10600 ^ 0x10725] = 0x1C3C0 ^ 0x10725;
        e_0.k[0x71A0 ^ 0x70BA] = 0x70B9 ^ 0x70BA;
        e_0.k[0x189B ^ 0x19D6] = 0x19E1 ^ 0x19D6;
        e_0.k[0x1738 ^ 0x1728] = 0x176B ^ 0x1728;
        e_0.k[0xCF4B ^ 0xCECF] = 0xCECE ^ 0xCECF;
        e_0.k[0x6DEB ^ 0x6CCC] = 0xC265 ^ 0x6CCC;
        e_0.k[0x5426 ^ 0x554D] = 0xFFFFAACF ^ 0x554D;
        e_0.k[0x319C ^ 0x315D] = 0xFFFFCEA7 ^ 0x315D;
        e_0.k[0xF739 ^ 0xF60A] = 0xF625 ^ 0xF60A;
        e_0.k[0x2C5C ^ 0x2D74] = 0xA1FE ^ 0x2D74;
        e_0.k[0x6D7D ^ 0x6C22] = 0x6C7B ^ 0x6C22;
        e_0.k[0x4D49 ^ 0x4D5D] = 0xFFFFB28D ^ 0x4D5D;
        e_0.k[0xFF54 ^ 0xFF72] = 0xFFFF0083 ^ 0xFF72;
        e_0.k[0x6196 ^ 0x61A3] = 0xFFFF9E56 ^ 0x61A3;
        e_0.k[0x64DF ^ 0x64C0] = 0x64FA ^ 0x64C0;
        e_0.k[0x939F ^ 0x9371] = 0x932A ^ 0x9371;
        e_0.k[0x7E5 ^ 0x663] = 0x663 ^ 0x663;
        e_0.k[0x136D ^ 0x1308] = 0x1324 ^ 0x1308;
        e_0.k[0xD4D ^ 0xD94] = 0xFFFFF241 ^ 0xD94;
        e_0.k[0x2FE2 ^ 0x2E95] = 0x2EF0 ^ 0x2E95;
        e_0.k[0x1085C ^ 0x10882] = 0x1080F ^ 0x10882;
        e_0.k[0xD284 ^ 0xD246] = 0xD208 ^ 0xD246;
        e_0.k[0x15AB ^ 0x1532] = 0xFFFFEADE ^ 0x1532;
        e_0.k[0x10A7D ^ 0x10B37] = 0xFFFEF4D7 ^ 0x10B37;
        e_0.k[0x1529 ^ 0x1507] = 0xFFFFEA89 ^ 0x1507;
        e_0.k[0x7F52 ^ 0x7E3F] = 0xFFFF8192 ^ 0x7E3F;
        e_0.k[0xB18F ^ 0xB166] = 0xFFFF4EE7 ^ 0xB166;
        e_0.k[0x6FA4 ^ 0x6E25] = 0x6E24 ^ 0x6E25;
        e_0.k[0x5DC1 ^ 0x5D87] = 0x5D8E ^ 0x5D87;
        e_0.k[0xCBDB ^ 0xCB82] = 0xFFFF3447 ^ 0xCB82;
        e_0.k[0x74E4 ^ 0x7400] = 0x7466 ^ 0x7400;
        e_0.k[0x10289 ^ 0x1027C] = 0xFFFEFDE7 ^ 0x1027C;
        e_0.k[0x22D2 ^ 0x2284] = 0x22A7 ^ 0x2284;
        e_0.k[0x8D51 ^ 0x8DD7] = 0x8DD9 ^ 0x8DD7;
        e_0.k[0x7250 ^ 0x72B7] = 0x72FF ^ 0x72B7;
        e_0.k[0x4649 ^ 0x461A] = 0xFFFFB9A9 ^ 0x461A;
        e_0.k[0xECC1 ^ 0xEC08] = 0xEC2F ^ 0xEC08;
        e_0.k[0x4372 ^ 0x4337] = 0x4373 ^ 0x4337;
        e_0.k[0x107C6 ^ 0x107BB] = 0xFFFEF83E ^ 0x107BB;
        e_0.k[0xB13F ^ 0xB1B1] = 0xB190 ^ 0xB1B1;
        e_0.k[0x10725 ^ 0x1079B] = 0xFFFEF807 ^ 0x1079B;
        e_0.k[0xBA47 ^ 0xBAD5] = 0xBACD ^ 0xBAD5;
        e_0.k[0x6064 ^ 0x60DD] = 0xFFFF9F57 ^ 0x60DD;
        e_0.k[0x9177 ^ 0x9016] = 0xFFFF6FD0 ^ 0x9016;
        e_0.k[0xBADD ^ 0xBBA9] = 0xBBDF ^ 0xBBA9;
        e_0.k[0xBDA4 ^ 0xBD05] = 0xBD7B ^ 0xBD05;
        e_0.k[0x2FF9 ^ 0x2F75] = 0x2F7B ^ 0x2F75;
        e_0.k[0xA2B7 ^ 0xA25F] = 0xFFFF5D8E ^ 0xA25F;
        e_0.k[0x4187 ^ 0x4086] = 0x409B ^ 0x4086;
        e_0.k[0x3DD8 ^ 0x3D43] = 0x3D1D ^ 0x3D43;
        e_0.k[0x6F44 ^ 0x6F8F] = 0x6FF1 ^ 0x6F8F;
        e_0.k[0xFCCD ^ 0xFD99] = 0xFFFF0278 ^ 0xFD99;
        e_0.k[0x98AF ^ 0x98E0] = 0x98C3 ^ 0x98E0;
        e_0.k[0x4640 ^ 0x465D] = 0xFFFFB9E9 ^ 0x465D;
        e_0.k[0xFD44 ^ 0xFD2F] = 0xFFFF029D ^ 0xFD2F;
        e_0.k[0x339B ^ 0x329F] = 0xFFFFCD1A ^ 0x329F;
        e_0.k[0x1486 ^ 0x15D7] = 0xFFFFEA13 ^ 0x15D7;
        e_0.k[0xAABC ^ 0xAB30] = 0x1FC ^ 0xAB30;
        e_0.k[0x3B9D ^ 0x3A82] = 0x3A82 ^ 0x3A82;
        e_0.k[0x34D4 ^ 0x34B9] = 0xFFFFCB31 ^ 0x34B9;
        e_0.k[0x50F1 ^ 0x51F9] = 0x51A9 ^ 0x51F9;
        e_0.k[0xD2BA ^ 0xD2DD] = 0xD2E6 ^ 0xD2DD;
        e_0.k[0x4495 ^ 0x44EA] = 0xFFFFBB31 ^ 0x44EA;
        e_0.k[0x4847 ^ 0x4978] = 0xFFFFB6BC ^ 0x4978;
        e_0.k[0xEEF1 ^ 0xEF78] = 0x45B1 ^ 0xEF78;
        e_0.k[0x7964 ^ 0x79A4] = 0x79CC ^ 0x79A4;
        e_0.k[0xBD01 ^ 0xBD4A] = 0xBD5E ^ 0xBD4A;
        e_0.k[0x973 ^ 0x801] = 0x8E1 ^ 0x801;
        e_0.k[0x44BA ^ 0x44B3] = 0xFFFFBB2A ^ 0x44B3;
        e_0.k[0x5F98 ^ 0x5FDA] = 0x5F5E ^ 0x5FDA;
        e_0.k[0x9B4 ^ 0x930] = 0x9B8 ^ 0x930;
        e_0.k[0x1877 ^ 0x188D] = 0x18FC ^ 0x188D;
        e_0.k[0xBFD0 ^ 0xBE5A] = 0x1496 ^ 0xBE5A;
        e_0.k[0xC3C2 ^ 0xC390] = 0xC3F2 ^ 0xC390;
        e_0.k[0x968 ^ 0x9E1] = 0xFFFFF677 ^ 0x9E1;
        e_0.k[0xDC2C ^ 0xDD55] = 0xDD72 ^ 0xDD55;
        e_0.k[0x45CC ^ 0x4530] = 0x451D ^ 0x4530;
        e_0.k[0xA397 ^ 0xA21C] = 0xFFFFF732 ^ 0xA21C;
        e_0.k[0xA766 ^ 0xA7C9] = 0xFFFF5872 ^ 0xA7C9;
        e_0.k[0x15B0 ^ 0x152E] = 0x155D ^ 0x152E;
        e_0.k[0xD34B ^ 0xD26F] = 0xA8AC ^ 0xD26F;
        e_0.k[0x2645 ^ 0x2768] = 0x965F ^ 0x2768;
        e_0.k[0xA93 ^ 0xBB9] = 0x5117 ^ 0xBB9;
        e_0.k[0xAF40 ^ 0xAE31] = 0xAE77 ^ 0xAE31;
        e_0.k[0x301B ^ 0x3024] = 0x3052 ^ 0x3024;
        e_0.k[0x730F ^ 0x726F] = 0x72EB ^ 0x726F;
        e_0.k[0x4694 ^ 0x47D8] = 0x479C ^ 0x47D8;
        e_0.k[0x957F ^ 0x9584] = 0xFFFF6A19 ^ 0x9584;
        e_0.k[0x3664 ^ 0x367F] = 0x3613 ^ 0x367F;
        e_0.k[0x2ED5 ^ 0x2FFC] = 0xE91 ^ 0x2FFC;
        e_0.k[0x8309 ^ 0x8240] = 0x8224 ^ 0x8240;
        e_0.k[0x71A2 ^ 0x7104] = 0xFFFF8ED8 ^ 0x7104;
        e_0.k[0xCC80 ^ 0xCC45] = 0xCC5A ^ 0xCC45;
        e_0.k[0x1041C ^ 0x1052C] = 0x10581 ^ 0x1052C;
        e_0.k[0xBCB ^ 0xA97] = 0xFFFFF525 ^ 0xA97;
        e_0.k[0xB54C ^ 0xB5D4] = 0xB5CE ^ 0xB5D4;
        e_0.k[0x69C4 ^ 0x69B3] = 0x69BB ^ 0x69B3;
        e_0.k[0xD80F ^ 0xD8D4] = 0xFFFF277D ^ 0xD8D4;
        e_0.k[0xD943 ^ 0xD97F] = 0xD975 ^ 0xD97F;
        e_0.k[0x5BE4 ^ 0x5ADE] = 0xFFFFA56A ^ 0x5ADE;
        e_0.k[0x9D9F ^ 0x9CCF] = 0xFFFF6364 ^ 0x9CCF;
        e_0.k[0xE5CB ^ 0xE4C7] = 0xFFFF1B31 ^ 0xE4C7;
        e_0.k[0x3387 ^ 0x32A8] = 0x32A8 ^ 0x32A8;
        e_0.k[0x4245 ^ 0x4235] = 0xFFFFBDAA ^ 0x4235;
        e_0.k[0x3837 ^ 0x3977] = 0xFFFFC69B ^ 0x3977;
        e_0.k[0xA037 ^ 0xA068] = 0xFFFF5FF0 ^ 0xA068;
        e_0.k[0x2037 ^ 0x2106] = 0x2116 ^ 0x2106;
        e_0.k[0xC5CB ^ 0xC57B] = 0xC532 ^ 0xC57B;
        e_0.k[0x1017 ^ 0x1033] = 0x1021 ^ 0x1033;
        e_0.k[0xC5A8 ^ 0xC51D] = 0xC50D ^ 0xC51D;
        e_0.k[0xE24A ^ 0xE2A0] = 0xE2B7 ^ 0xE2A0;
        e_0.k[0x3B10 ^ 0x3BA1] = 0x3BD6 ^ 0x3BA1;
        e_0.k[0x575F ^ 0x5646] = 0xFFFFA9A6 ^ 0x5646;
        e_0.k[0x36E6 ^ 0x37DB] = 0xFFFFC875 ^ 0x37DB;
        e_0.k[0xB53D ^ 0xB5FB] = 0xB563 ^ 0xB5FB;
        e_0.k[0x3EEA ^ 0x3EDD] = 0x3EF8 ^ 0x3EDD;
        e_0.k[0xD95D ^ 0xD9CA] = 0xD9FE ^ 0xD9CA;
        e_0.k[0xAA22 ^ 0xAA66] = 0xAA4A ^ 0xAA66;
        e_0.k[0xC024 ^ 0xC0A4] = 0xFFFF3F67 ^ 0xC0A4;
        e_0.k[0x5840 ^ 0x587D] = 0xFFFFA7B2 ^ 0x587D;
        e_0.k[0x9E0C ^ 0x9EB6] = 0xFFFF61CB ^ 0x9EB6;
        e_0.k[0x100CB ^ 0x1018F] = 0x101EA ^ 0x1018F;
        e_0.k[0xB3D4 ^ 0xB30E] = 0xB333 ^ 0xB30E;
        e_0.k[0xE926 ^ 0xE860] = 0xE878 ^ 0xE860;
        e_0.k[0xB76 ^ 0xB40] = 0xB0B ^ 0xB40;
        e_0.k[0x14F8 ^ 0x14E9] = 0xFFFFEB4B ^ 0x14E9;
        e_0.k[0xEE25 ^ 0xEE5F] = 0xEE23 ^ 0xEE5F;
        e_0.k[0xF822 ^ 0xF824] = 0xFFFF07CD ^ 0xF824;
        e_0.k[0x93FF ^ 0x9358] = 0xFFFF6C98 ^ 0x9358;
        e_0.k[0x5EEC ^ 0x5EFA] = 0xFFFFA14C ^ 0x5EFA;
        e_0.k[0x310C ^ 0x302E] = 0xFA6E ^ 0x302E;
        e_0.k[0x1CE6 ^ 0x1C29] = 0x1C65 ^ 0x1C29;
        e_0.k[0x6BC5 ^ 0x6B11] = 0xFFFF94B9 ^ 0x6B11;
        e_0.k[0xDF7C ^ 0xDFAE] = 0xDFB0 ^ 0xDFAE;
        e_0.k[0xB3B6 ^ 0xB305] = 0xB358 ^ 0xB305;
        e_0.k[0x1C14 ^ 0x1C60] = 0xFFFFE3B3 ^ 0x1C60;
        e_0.k[0x9224 ^ 0x9304] = 0x9304 ^ 0x9304;
        e_0.k[0x9C10 ^ 0x9D17] = 0x9D73 ^ 0x9D17;
        e_0.k[0xCF3B ^ 0xCE3E] = 0xCEFE ^ 0xCE3E;
        e_0.k[0x696C ^ 0x6809] = 0xFFFF97AA ^ 0x6809;
        e_0.k[0x967D ^ 0x9637] = 0xFFFF69CD ^ 0x9637;
        e_0.k[0xB67F ^ 0xB6D5] = 0xB69C ^ 0xB6D5;
        e_0.k[0x1CA9 ^ 0x1DBF] = 0xFFFFE22B ^ 0x1DBF;
        e_0.k[0x7521 ^ 0x75C7] = 0xFFFF8A45 ^ 0x75C7;
        e_0.k[0xFE06 ^ 0xFE02] = 0xFFFF01EB ^ 0xFE02;
        e_0.k[0x4ED6 ^ 0x4FAB] = 0xFFFFB05E ^ 0x4FAB;
        e_0.k[0x7640 ^ 0x772A] = 0x770D ^ 0x772A;
        e_0.k[0xE609 ^ 0xE68C] = 0xFFFF1926 ^ 0xE68C;
        e_0.k[0xC8EB ^ 0xC995] = 0xFFFF3676 ^ 0xC995;
        e_0.k[0xE2C8 ^ 0xE23B] = 0xFFFF1DE6 ^ 0xE23B;
        e_0.k[0xBCE ^ 0xAB8] = 0xACA ^ 0xAB8;
        e_0.k[0xB26E ^ 0xB2C7] = 0xFFFF4D59 ^ 0xB2C7;
        e_0.k[0x10B7D ^ 0x10A14] = 0x10A48 ^ 0x10A14;
        e_0.k[0xEE00 ^ 0xEE15] = 0xEE0E ^ 0xEE15;
    }
}

