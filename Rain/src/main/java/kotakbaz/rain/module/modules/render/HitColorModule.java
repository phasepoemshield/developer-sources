/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.ClientColorModule;
import kotakbaz.rain.module.modules.render.e;
import kotakbaz.rain.module.modules.render.e_0;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00013B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010#R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020-`.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00102\u00a8\u00064"}, d2={"Lkotakbaz/rain/module/modules/render/HitColorModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Ljava/awt/Color;", "getColor", "()Ljava/awt/Color;", "", "shouldColorArmor", "()Z", "isSmoothEnabled", "", "entityId", "originalOverlay", "resolveOverlay", "(II)I", "", "damageProgress", "(I)F", "Lnet/minecraft/class_1309;", "entity", "updateDamageAnimation", "(Lnet/minecraft/class_1309;)F", "Lnet/minecraft/class_638;", "world", "clearState", "(Lnet/minecraft/class_638;)V", "DAMAGE_FADE_IN_SPEED", "F", "DAMAGE_FADE_OUT_SPEED", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "armor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "hitColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "alpha", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "smooth", "Ljava/util/HashMap;", "Lkotakbaz/rain/module/modules/render/HitColorModule$DamageAnimation;", "Lkotlin/collections/HashMap;", "damageAnimations", "Ljava/util/HashMap;", "trackedWorld", "Lnet/minecraft/class_638;", "DamageAnimation", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nHitColorModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitColorModule.kt\nkotakbaz/rain/module/modules/render/HitColorModule\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,120:1\n383#2,7:121\n*S KotlinDebug\n*F\n+ 1 HitColorModule.kt\nkotakbaz/rain/module/modules/render/HitColorModule\n*L\n88#1:121,7\n*E\n"})
public final class HitColorModule
extends Module {
    @NotNull
    public static final HitColorModule INSTANCE;
    private static final float a = 15.0f;
    private static final float A = 8.0f;
    @NotNull
    private static final BooleanSetting b;
    @NotNull
    private static final BooleanSetting B;
    @NotNull
    private static final ColorSetting c;
    @NotNull
    private static final SliderSetting C;
    @NotNull
    private static final BooleanSetting d;
    @NotNull
    private static final HashMap<Integer, e_0> D;
    @Nullable
    private static ClientWorld e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    private HitColorModule() {
        int n2 = h[0];
        n2 ^= h[1];
        int n3 = h[3];
        n3 -= h[4];
        int n4 = h[6];
        n4 += h[7];
        super((String)E[n2 -= h[2]], a_0.getRENDER(), (String)E[n3 += h[5]] + (String)E[n4 -= h[8]]);
    }

    @Override
    public void onEnable() {
        int n2 = h[9];
        n2 ^= h[10];
        HitColorModule.clearState$default(this, null, n2 ^= h[11], null);
    }

    @Override
    public void onDisable() {
        this.clearState(null);
    }

    @NotNull
    public final Color getColor() {
        Color color = (Boolean)B.getValue() != false && ClientColorModule.INSTANCE.isEnabled() ? ClientColorModule.INSTANCE.getClientColor() : (Color)c.getValue();
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((Number)C.getValue()).floatValue());
    }

    public final boolean shouldColorArmor() {
        return (Boolean)b.getValue();
    }

    public final boolean isSmoothEnabled() {
        return (Boolean)d.getValue();
    }

    public final int resolveOverlay(int entityId, int originalOverlay) {
        int n2;
        if (!this.isEnabled() || !((Boolean)d.getValue()).booleanValue()) {
            return originalOverlay;
        }
        float f2 = this.damageProgress(entityId);
        if (f2 <= 0.001f) {
            n2 = OverlayTexture.DEFAULT_UV;
        } else {
            boolean bl = h[12];
            bl += h[13];
            n2 = OverlayTexture.getUv((float)f2, (boolean)(bl -= h[14]));
        }
        return n2;
    }

    private final float damageProgress(int entityId) {
        Entity entity;
        long l2 = -1406253792289211901L;
        ClientWorld clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        if (clientWorld == null) {
            HitColorModule hitColorModule = this;
            long l3 = l2;
            int n2 = h[15];
            n2 += h[16];
            l2 = l3 ^ (0L ^ l3) & -1L << (n2 += h[17]);
            hitColorModule.clearState(null);
            return 0.0f;
        }
        ClientWorld clientWorld2 = clientWorld;
        if (e != clientWorld2) {
            this.clearState(clientWorld2);
        }
        LivingEntity livingEntity = (entity = clientWorld2.getEntityById(entityId)) instanceof LivingEntity ? (LivingEntity)entity : null;
        if (livingEntity == null) {
            HitColorModule hitColorModule = this;
            long l4 = l2;
            int n3 = h[18];
            n3 += h[19];
            l2 = l4 ^ (0L ^ l4) & -1L >>> (n3 -= h[20]);
            D.remove(entityId);
            return 0.0f;
        }
        LivingEntity livingEntity2 = livingEntity;
        return this.updateDamageAnimation(livingEntity2);
    }

    private final float updateDamageAnimation(LivingEntity entity) {
        Object object;
        long l2 = -1849269746601943678L;
        long l3 = System.currentTimeMillis();
        Map map = D;
        Integer n2 = entity.getId();
        long l4 = l2;
        int n3 = h[21];
        n3 ^= h[22];
        l2 = l4 ^ (0L ^ l4) & -1L << (n3 += h[23]);
        Object v = map.get(n2);
        if (v == null) {
            long l5 = l2;
            int n4 = h[24];
            n4 ^= h[25];
            l2 = l5 ^ (0L ^ l5) & -1L >>> (n4 -= h[26]);
            int n5 = h[27];
            n5 += h[28];
            e e2 = new e(0.0f, l3, n5 ^= h[29], null);
            map.put(n2, e2);
            object = e2;
        } else {
            object = v;
        }
        e e3 = (e)object;
        float f2 = (float)RangesKt.coerceAtLeast(l3 - e3.getLastUpdateAt(), 0L) / 1000.0f;
        e3.setLastUpdateAt(l3);
        float f3 = entity.hurtTime > 0 || entity.deathTime > 0 ? 1.0f : 0.0f;
        float f4 = f3 > e3.getProgress() ? 15.0f : 8.0f;
        float f5 = RangesKt.coerceIn(f2 * f4, 0.0f, 1.0f);
        e3.setProgress(e3.getProgress() + (f3 - e3.getProgress()) * f5);
        float f6 = RangesKt.coerceIn(e3.getProgress(), 0.0f, 1.0f);
        if (f6 <= 0.001f && f3 <= 0.0f) {
            D.remove(entity.getId());
            return 0.0f;
        }
        return f6;
    }

    private final void clearState(ClientWorld world) {
        D.clear();
        e = world;
    }

    static /* synthetic */ void clearState$default(HitColorModule hitColorModule, ClientWorld clientWorld, int n2, Object object) {
        int n3 = h[30];
        n3 ^= h[31];
        if ((n2 & (n3 -= h[32])) != 0) {
            clientWorld = kotakbaz.rain.client.extensions.b.getMc().world;
        }
        hitColorModule.clearState(clientWorld);
    }

    private static final boolean useClientColor$lambda$0() {
        return ClientColorModule.INSTANCE.isEnabled();
    }

    private static final boolean hitColor$lambda$0() {
        int n2;
        if (!((Boolean)B.getValue()).booleanValue() || !ClientColorModule.INSTANCE.isEnabled()) {
            int n3 = h[33];
            n3 -= h[34];
            n2 = n3 -= h[35];
        } else {
            int n4 = h[36];
            n4 += h[37];
            n2 = n4 ^= h[38];
        }
        return n2 != 0;
    }

    static {
        HitColorModule.b();
        long l2 = 8813863515305185712L;
        long l3 = 4964688513019021910L;
        long l4 = 1612537610209467041L;
        long l5 = 4349302420579388173L;
        long l6 = -8696524309057856795L;
        long l7 = -2424589180615330839L;
        long l8 = 7346047351167307211L;
        long l9 = 8423476171702118563L;
        long l10 = -8053588996027633516L;
        long l11 = 7262149068751444531L;
        long l12 = 6431179276676654697L;
        long l13 = 110265724310212078L;
        long l14 = 3944407711624947599L;
        long l15 = 4260782033826759126L;
        int n2 = h[39];
        n2 += h[40];
        E = new Object[n2 ^= h[41]];
        long l16 = l15;
        int n3 = h[42];
        n3 += h[43];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= h[44]);
        Object[] objectArray = new Object[h[45]];
        objectArray[HitColorModule.h[46]] = f;
        objectArray[HitColorModule.h[47]] = h[48];
        int n4 = h[49];
        Object object = HitColorModule.A()[h[50]];
        if (object == null) {
            char[] cArray = "\u995a\u998d\u98f4\u998a\u99b5\u98f4\u996b\u999c\u999e\u98c3\u98f9\u98fe\u98f6\u9969\u998d\u98fe\u99b3\u98f5\u995d\u996a\u99b3\u996d\u9955\u999a\u999e\u996d\u99b4\u98f0\u999a\u999e\u98fe\u9956\u9988\u9967\u98f4\u99b3\u996a\u98fe\u9963\u999e\u9963\u9967\u9953\u996d\u9953\u9969\u9998\u98fa\u998b\u9954\u9956\u99b9\u999b\u996e\u998d\u98f3\u98c9\u9968\u998e\u996d\u9952\u9959\u9968\u98fa\u98f8\u98f1\u98fe\u995b\u998a\u98fc\u9968\u98f0\u999e\u98f3\u98f5\u9987\u9968\u9956\u98f4\u99b6\u98f0\u98f1\u9956\u99b9\u98c4\u98f2\u994f\u995b\u9998\u98fb\u98fb\u98c9\u9953\u98ef\u98f3\u996c\u99b9\u9955\u98fb\u99b4\u99b6\u996e\u9959\u9997\u98c3\u995d\u98f1\u98f8\u9987\u98fb\u98ef\u98ef\u98f9\u98f7\u998c\u98fa\u98c4\u996e\u99b5\u99b5\u98f1\u998b\u996a\u98ef\u98c9\u9967\u996e\u99b5\u98c3\u98c3\u9998\u9969\u996b\u98c3\u9998\u98c3\u98c4\u98f7\u9957\u998b\u996b\u9951\u9954\u9954\u9953\u999a\u9950\u98f3\u998c\u9958\u9953\u98f1\u995a\u98fd\u99b5\u9969\u98f9\u98c4\u9957\u98fd\u98f9\u9950\u9952\u98c4\u99b3\u98c9\u99b3\u999e\u999b\u999d\u996d\u995e\u9956\u98f8\u998b\u98f2\u9988\u9958\u9950\u998d\u9987\u98f6\u9964\u998a\u995e\u98ef\u9957\u98fe\u999e\u9987\u9957\u98c3\u9964\u98fd\u9957\u99b3\u98c4\u99b4\u98fb\u996d\u99b9\u99b9\u998a\u99b3\u98f7\u998a\u998e\u999c\u9954\u99b5\u9997\u999b\u999d\u995e\u98c3\u99b9\u9987\u9956\u9969\u99b9\u995b\u9998\u995e\u994f\u98f3\u98c4\u996b\u996c\u9998\u99b4\u99b9\u99b3\u9963\u998a\u9952\u999c\u9968\u9967\u99b5\u98f1\u99b5\u98c4\u99b3\u9998\u98f8\u98f7\u98f1\u999a\u98fa\u99b5\u9957\u98f4\u998c\u9951\u98fa\u98ef\u998d\u999d\u98fe\u996e\u98fe\u99b6\u999a\u99b9\u999c\u998b\u98f5\u98f2\u99b6\u996a\u98c4\u99b1\u98f8\u9964\u999e\u999c\u9964\u98f6\u9998\u998a\u9968\u98f5\u98c3\u996d\u9958\u98c9\u998a\u998e\u998b\u9957\u998d\u9956\u9959\u9987\u998a\u9968\u98fc\u994f\u9969\u999d\u998e\u98fb\u9998\u9958\u98fb\u995a\u9950\u9988\u98f6\u98f2\u98f2\u9988\u995d\u995e\u98fa\u996c\u999e\u9964\u99b6\u98f5".toCharArray();
            for (int i2 = h[51]; i2 < h[52]; ++i2) {
                int n5 = cArray[i2];
                n5 -= h[53];
                n5 += h[54];
                n5 ^= h[55];
                n5 ^= h[56];
                n5 += h[57];
                n5 ^= h[58];
                n5 += h[59];
                n5 += h[60];
                n5 ^= h[61];
                n5 ^= h[62];
                n5 += h[63];
                n5 += h[64];
                cArray[i2] = (char)(n5 ^= h[65]);
            }
            object = HitColorModule.A()[HitColorModule.h[66]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)HitColorModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = h[67];
        n6 ^= h[68];
        l6 = l17 ^ (0x7D00000000L ^ l17) & -1L << (n6 += h[69]);
        long l18 = l13;
        int n7 = h[70];
        n7 ^= h[71];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += h[72]);
        while (true) {
            int n8 = h[73];
            n8 += h[74];
            if ((int)l13 >= (int)(l6 >>> (n8 -= h[75]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = h[76];
            n10 ^= h[77];
            int n11 = h[79];
            n11 -= h[80];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= h[78])) & -1L >>> (n11 ^= h[81]);
            long l20 = l9;
            int n12 = h[82];
            n12 ^= h[83];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += h[84]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = h[85];
            n14 ^= h[86];
            int n15 = h[88];
            n15 -= h[89];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= h[87])) & -1L >>> (n15 ^= h[90]);
            int n16 = h[91];
            n16 ^= h[92];
            long l22 = l10;
            int n17 = h[94];
            n17 += h[95];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= h[93]) ^ l22) & -1L << (n17 += h[96]);
            int n18 = h[97];
            n18 += h[98];
            n18 -= h[99];
            int n19 = h[100];
            n19 -= h[101];
            long l23 = l12;
            int n20 = h[103];
            n20 ^= h[104];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= h[102]))) ^ l23) & -1L >>> (n20 ^= h[105]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = h[106];
            n21 ^= h[107];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= h[108]);
            while (true) {
                int n22 = h[109];
                n22 -= h[110];
                if ((int)(l14 >>> (n22 -= h[111])) >= (int)l12) break;
                int n23 = h[112];
                n23 -= h[113];
                int n24 = h[115];
                n24 += h[116];
                cArray2[(int)(l14 >>> (n23 -= HitColorModule.h[114]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= h[117]))];
                l14 += 0x100000000L;
            }
            int n25 = h[118];
            n25 -= h[119];
            int n26 = (int)(l15 >>> (n25 -= h[120]));
            l15 += 0x100000000L;
            HitColorModule.E[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = h[121];
            n27 ^= h[122];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= h[123]);
        }
        INSTANCE = new HitColorModule();
        int n28 = h[124];
        n28 += h[125];
        int n29 = h[127];
        n29 += h[128];
        boolean bl = h[130];
        bl ^= h[131];
        b = INSTANCE.cfr_renamed_0((String)E[n28 -= h[126]] + (String)E[n29 ^= h[129]], bl ^= h[132]);
        int n30 = h[133];
        n30 ^= h[134];
        boolean bl2 = h[136];
        bl2 -= h[137];
        B = INSTANCE.cfr_renamed_0((String)E[n30 -= h[135]], bl2 -= h[138]).setVisible(HitColorModule::useClientColor$lambda$0);
        int n31 = h[139];
        n31 -= h[140];
        String string = (String)E[n31 += h[141]];
        Color color = Color.RED;
        int n32 = h[142];
        n32 ^= h[143];
        Intrinsics.checkNotNullExpressionValue(color, (String)E[n32 ^= h[144]]);
        c = INSTANCE.color(string, color).setVisible(HitColorModule::hitColor$lambda$0);
        int n33 = h[145];
        n33 -= h[146];
        C = INSTANCE.slider((String)E[n33 -= h[147]], 255.0f, 0.0f, 255.0f, 1.0f);
        int n34 = h[148];
        n34 += h[149];
        boolean bl3 = h[151];
        bl3 -= h[152];
        d = INSTANCE.cfr_renamed_0((String)E[n34 += h[150]], bl3 ^= h[153]);
        D = new HashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[h[154]];
        String string = (String)object[h[155]];
        object = object[h[156]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[157]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[158]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[160] ^ h[161]];
                byArray[HitColorModule.h[162] ^ HitColorModule.h[163]] = h[164] ^ h[165];
                byArray[HitColorModule.h[166] ^ HitColorModule.h[167]] = h[168] ^ h[169];
                byArray[HitColorModule.h[170] ^ HitColorModule.h[171]] = h[172] ^ h[173];
                byArray[HitColorModule.h[174] ^ HitColorModule.h[175]] = h[176] ^ h[177];
                byArray[HitColorModule.h[178] ^ HitColorModule.h[179]] = h[180] ^ h[181];
                byArray[HitColorModule.h[182] ^ HitColorModule.h[183]] = h[184] ^ h[185];
                byArray[HitColorModule.h[186] ^ HitColorModule.h[187]] = h[188] ^ h[189];
                byArray[HitColorModule.h[190] ^ HitColorModule.h[191]] = h[192] ^ h[193];
                byArray[HitColorModule.h[194] ^ HitColorModule.h[195]] = h[196] ^ h[197];
                byArray[HitColorModule.h[198] ^ HitColorModule.h[199]] = h[200] ^ h[201];
                byArray[HitColorModule.h[202] ^ HitColorModule.h[203]] = h[204] ^ h[205];
                byArray[HitColorModule.h[206] ^ HitColorModule.h[207]] = h[208] ^ h[209];
                byArray[HitColorModule.h[210] ^ HitColorModule.h[211]] = h[212] ^ h[213];
                byArray[HitColorModule.h[214] ^ HitColorModule.h[215]] = h[216] ^ h[217];
                byArray[HitColorModule.h[218] ^ HitColorModule.h[219]] = h[220] ^ h[221];
                byArray[HitColorModule.h[222] ^ HitColorModule.h[223]] = h[224] ^ h[225];
                objectArray2[HitColorModule.h[159]] = byArray;
            }
            byte[] byArray = (byte[])object3[h[226]];
            if (F == null) {
                byte[] byArray2 = new byte[h[227] ^ h[228]];
                byArray2[HitColorModule.h[229] ^ HitColorModule.h[230]] = h[231] ^ h[232];
                byArray2[HitColorModule.h[233] ^ HitColorModule.h[234]] = h[235] ^ h[236];
                byArray2[HitColorModule.h[237] ^ HitColorModule.h[238]] = h[239] ^ h[240];
                byArray2[HitColorModule.h[241] ^ HitColorModule.h[242]] = h[243] ^ h[244];
                byArray2[HitColorModule.h[245] ^ HitColorModule.h[246]] = h[247] ^ h[248];
                byArray2[HitColorModule.h[249] ^ HitColorModule.h[250]] = h[251] ^ h[252];
                byArray2[HitColorModule.h[253] ^ HitColorModule.h[254]] = h[255] ^ h[256];
                byArray2[HitColorModule.h[257] ^ HitColorModule.h[258]] = h[259] ^ h[260];
                byArray2[HitColorModule.h[261] ^ HitColorModule.h[262]] = h[263] ^ h[264];
                byArray2[HitColorModule.h[265] ^ HitColorModule.h[266]] = h[267] ^ h[268];
                byArray2[HitColorModule.h[269] ^ HitColorModule.h[270]] = h[271] ^ h[272];
                byArray2[HitColorModule.h[273] ^ HitColorModule.h[274]] = h[275] ^ h[276];
                byArray2[HitColorModule.h[277] ^ HitColorModule.h[278]] = h[279] ^ h[280];
                byArray2[HitColorModule.h[281] ^ HitColorModule.h[282]] = h[283] ^ h[284];
                byArray2[HitColorModule.h[285] ^ HitColorModule.h[286]] = h[287] ^ h[288];
                byArray2[HitColorModule.h[289] ^ HitColorModule.h[290]] = h[291] ^ h[292];
                byArray2[HitColorModule.h[293] ^ HitColorModule.h[294]] = h[295] ^ h[296];
                byArray2[HitColorModule.h[297] ^ HitColorModule.h[298]] = h[299] ^ h[300];
                byArray2[HitColorModule.h[301] ^ HitColorModule.h[302]] = h[303] ^ h[304];
                byArray2[HitColorModule.h[305] ^ HitColorModule.h[306]] = h[307] ^ h[308];
                byArray2[HitColorModule.h[309] ^ HitColorModule.h[310]] = h[311] ^ h[312];
                byArray2[HitColorModule.h[313] ^ HitColorModule.h[314]] = h[315] ^ h[316];
                byArray2[HitColorModule.h[317] ^ HitColorModule.h[318]] = h[319] ^ h[320];
                byArray2[HitColorModule.h[321] ^ HitColorModule.h[322]] = h[323] ^ h[324];
                byArray2[HitColorModule.h[325] ^ HitColorModule.h[326]] = h[327] ^ h[328];
                byArray2[HitColorModule.h[329] ^ HitColorModule.h[330]] = h[331] ^ h[332];
                byArray2[HitColorModule.h[333] ^ HitColorModule.h[334]] = h[335] ^ h[336];
                byArray2[HitColorModule.h[337] ^ HitColorModule.h[338]] = h[339] ^ h[340];
                byArray2[HitColorModule.h[341] ^ HitColorModule.h[342]] = h[343] ^ h[344];
                byArray2[HitColorModule.h[345] ^ HitColorModule.h[346]] = h[347] ^ h[348];
                byArray2[HitColorModule.h[349] ^ HitColorModule.h[350]] = h[351] ^ h[352];
                byArray2[HitColorModule.h[353] ^ HitColorModule.h[354]] = h[355] ^ h[356];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, h[357], byArray3, h[358], byArray.length);
                System.arraycopy(byArray2, h[359], byArray3, byArray.length, byArray2.length);
                Object object4 = HitColorModule.A()[h[360]];
                if (object4 == null) {
                    char[] cArray = "\ufe0d\ufe13\ufe0c\ufe19\ufe0f\uefc3\ufe20\ufe6e\ufe49\ufe75\ufe15\ufe6a\ufe76\ufe74\ufe64\ufe15\ufe16\uee06".toCharArray();
                    for (int i2 = h[361]; i2 < h[362]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= h[363];
                        n3 -= h[364];
                        n3 ^= h[365];
                        n3 -= h[366];
                        n3 -= h[367];
                        n3 -= h[368];
                        n3 -= h[369];
                        n3 ^= h[370];
                        n3 ^= h[371];
                        n3 += h[372];
                        n3 ^= h[373];
                        cArray[i2] = (char)(n3 -= h[374]);
                    }
                    object4 = HitColorModule.A()[HitColorModule.h[375]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[h[376]];
                byArray4[HitColorModule.h[377]] = h[378];
                byArray4[HitColorModule.h[379]] = h[380];
                byArray4[HitColorModule.h[381]] = h[382];
                byArray4[HitColorModule.h[383]] = h[384];
                byArray4[HitColorModule.h[385]] = h[386];
                byArray4[HitColorModule.h[387]] = h[388];
                byArray4[HitColorModule.h[389]] = h[390];
                byArray4[HitColorModule.h[391]] = h[392];
                byArray4[HitColorModule.h[393]] = h[394];
                byArray4[HitColorModule.h[395]] = h[396];
                byArray4[HitColorModule.h[397]] = h[398];
                byArray4[HitColorModule.h[399]] = -92;
                byArray4[8] = -128;
                byArray4[2] = -117;
                byArray4[15] = 119;
                byArray4[7] = -35;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = HitColorModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uf0b0\uf0ac\uf11a".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 56208;
                        n4 -= 56241;
                        n4 ^= 0x3DB2;
                        n4 += 24306;
                        n4 -= 27475;
                        n4 -= 38467;
                        n4 += 23283;
                        n4 ^= 0xCA66;
                        n4 += 45544;
                        n4 -= 23800;
                        n4 -= 602;
                        cArray[i3] = (char)(n4 -= 41535);
                    }
                    object5 = HitColorModule.A()[2] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = HitColorModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub268\ub1fc\ub20e\ub35a\ub1fe\ub269\ub1fe\ub35a\ub1fb\ub1f6\ub1fe\ub20e\ub26c\ub1fb\ub208\ub19f\ub19f\ub1a0\ub215\ub202".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 4710;
                    n5 ^= 0x48C7;
                    n5 += 61352;
                    n5 ^= 0x6848;
                    n5 += 23129;
                    n5 += 44985;
                    n5 ^= 0x6709;
                    n5 ^= 0xD38C;
                    n5 -= 62909;
                    n5 -= 54414;
                    cArray[i4] = (char)(n5 += 8190);
                }
                object6 = HitColorModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)F), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = G;
        if (G == null) {
            G = new Object[4];
            objectArray = G;
        }
        return objectArray;
    }

    public static void b() {
        h = new int[0xD2AC ^ 0xD33C];
        HitColorModule.h[0xF46F ^ 0xF57E] = 0x17C2 ^ 0xF57E;
        HitColorModule.h[0x3BB9 ^ 0x3B24] = 0x3B25 ^ 0x3B24;
        HitColorModule.h[0x6D9C ^ 0x6D68] = 0x77E9 ^ 0x6D68;
        HitColorModule.h[0xA6E5 ^ 0xA6C4] = 0xFFFF595A ^ 0xA6C4;
        HitColorModule.h[0x8B4C ^ 0x8B13] = 0xFFFF74F0 ^ 0x8B13;
        HitColorModule.h[0xCADB ^ 0xCB51] = 0xFFFF349E ^ 0xCB51;
        HitColorModule.h[0xC87A ^ 0xC903] = 0xC90D ^ 0xC903;
        HitColorModule.h[0x5190 ^ 0x51DA] = 0xFFFFAE46 ^ 0x51DA;
        HitColorModule.h[0x571E ^ 0x57BD] = 0x94BB ^ 0x57BD;
        HitColorModule.h[0xDC6A ^ 0xDC66] = 0xFFFF23D6 ^ 0xDC66;
        HitColorModule.h[0x319 ^ 0x319] = 0xFFFFFCA2 ^ 0x319;
        HitColorModule.h[0xBD0A ^ 0xBDB9] = 0xB5CF ^ 0xBDB9;
        HitColorModule.h[0x3C18 ^ 0x3C1C] = 0xFFFFC3E3 ^ 0x3C1C;
        HitColorModule.h[0xA25 ^ 0xA9C] = 0x8CCC ^ 0xA9C;
        HitColorModule.h[0x7823 ^ 0x78CE] = 0x4185 ^ 0x78CE;
        HitColorModule.h[0x5F0D ^ 0x5FF2] = 0xB8B8 ^ 0x5FF2;
        HitColorModule.h[0x801B ^ 0x80E2] = 0xB77C ^ 0x80E2;
        HitColorModule.h[0xE387 ^ 0xE38E] = 0xFFFF1C4A ^ 0xE38E;
        HitColorModule.h[0xDCEC ^ 0xDDF8] = 0x3F5E ^ 0xDDF8;
        HitColorModule.h[0xA6F6 ^ 0xA6A7] = 0xFFFF5916 ^ 0xA6A7;
        HitColorModule.h[0x73FC ^ 0x7329] = 0x4D38 ^ 0x7329;
        HitColorModule.h[0xF375 ^ 0xF200] = 0x9A0D ^ 0xF200;
        HitColorModule.h[0xED31 ^ 0xED8A] = 0x2CEC ^ 0xED8A;
        HitColorModule.h[0xD5F2 ^ 0xD54E] = 0xFFFFEB82 ^ 0xD54E;
        HitColorModule.h[0xF704 ^ 0xF7F9] = 0x10DE ^ 0xF7F9;
        HitColorModule.h[0xA2E ^ 0xA52] = 0xFFFFF5B7 ^ 0xA52;
        HitColorModule.h[0x1058 ^ 0x1097] = 0x6DEF ^ 0x1097;
        HitColorModule.h[0xEE3B ^ 0xEF64] = 0x1E8BC ^ 0xEF64;
        HitColorModule.h[0xBBC1 ^ 0xBAB3] = 0xC594 ^ 0xBAB3;
        HitColorModule.h[0x3EE3 ^ 0x3E30] = 0x21 ^ 0x3E30;
        HitColorModule.h[0x10683 ^ 0x107A1] = 0x116A7 ^ 0x107A1;
        HitColorModule.h[0x3981 ^ 0x3931] = 0xFFFFDFFD ^ 0x3931;
        HitColorModule.h[0xB5C ^ 0xB86] = 0x279C ^ 0xB86;
        HitColorModule.h[0xB25E ^ 0xB22C] = 0xFFFF4DCB ^ 0xB22C;
        HitColorModule.h[0x504D ^ 0x5156] = 0xFFFFE942 ^ 0x5156;
        HitColorModule.h[0x1F81 ^ 0x1F50] = 0x6228 ^ 0x1F50;
        HitColorModule.h[0x37D2 ^ 0x3789] = 0x379A ^ 0x3789;
        HitColorModule.h[0x2DE0 ^ 0x2D20] = 0xFFFF095C ^ 0x2D20;
        HitColorModule.h[0xA2C6 ^ 0xA226] = 0xFFFF389C ^ 0xA226;
        HitColorModule.h[0x8625 ^ 0x86FD] = 0xFFFFFCBC ^ 0x86FD;
        HitColorModule.h[0xCB5B ^ 0xCBDC] = 0xFFFF346A ^ 0xCBDC;
        HitColorModule.h[0x7E05 ^ 0x7E7A] = 0xFFFF8133 ^ 0x7E7A;
        HitColorModule.h[0xB733 ^ 0xB796] = 0x7490 ^ 0xB796;
        HitColorModule.h[0x3263 ^ 0x3230] = 0x3245 ^ 0x3230;
        HitColorModule.h[0x8E33 ^ 0x8EC2] = 0x945C ^ 0x8EC2;
        HitColorModule.h[0xC9DE ^ 0xC894] = 0x5D11 ^ 0xC894;
        HitColorModule.h[0x3E0D ^ 0x3F38] = 0x2BE2 ^ 0x3F38;
        HitColorModule.h[0xBB11 ^ 0xBBE7] = 0x6BDA ^ 0xBBE7;
        HitColorModule.h[0xEEE9 ^ 0xEFE9] = 0x8D6 ^ 0xEFE9;
        HitColorModule.h[0x15B ^ 0x38] = 0xFFFF7C04 ^ 0x38;
        HitColorModule.h[0xFC4E ^ 0xFCE0] = 0xE5D6 ^ 0xFCE0;
        HitColorModule.h[0x10E4 ^ 0x10A4] = 0x8B7B ^ 0x10A4;
        HitColorModule.h[0xEDAC ^ 0xEC82] = 0x7447 ^ 0xEC82;
        HitColorModule.h[0x2696 ^ 0x271F] = 0x2716 ^ 0x271F;
        HitColorModule.h[0xC6ED ^ 0xC7E4] = 0x8996 ^ 0xC7E4;
        HitColorModule.h[0xC6B9 ^ 0xC6CA] = 0xC63D ^ 0xC6CA;
        HitColorModule.h[0xC2A7 ^ 0xC252] = 0x126A ^ 0xC252;
        HitColorModule.h[0x104D7 ^ 0x105B3] = 0x18666 ^ 0x105B3;
        HitColorModule.h[0x7071 ^ 0x708D] = 0x4708 ^ 0x708D;
        HitColorModule.h[0xA61A ^ 0xA66E] = 0xFFFF59EA ^ 0xA66E;
        HitColorModule.h[0x7285 ^ 0x7260] = 0x332E ^ 0x7260;
        HitColorModule.h[0xA0D0 ^ 0xA1D7] = 0xFFFFF726 ^ 0xA1D7;
        HitColorModule.h[0x4DF5 ^ 0x4D13] = 0xC5A ^ 0x4D13;
        HitColorModule.h[0xC0E8 ^ 0xC0B5] = 0xC096 ^ 0xC0B5;
        HitColorModule.h[0xB3FD ^ 0xB383] = 0xB39C ^ 0xB383;
        HitColorModule.h[0xF7E4 ^ 0xF6CD] = 0x7A8 ^ 0xF6CD;
        HitColorModule.h[0xCD53 ^ 0xCD4E] = 0xFFFF32AC ^ 0xCD4E;
        HitColorModule.h[0x92D3 ^ 0x921A] = 0x5D1B ^ 0x921A;
        HitColorModule.h[0x70BA ^ 0x7090] = 0x709D ^ 0x7090;
        HitColorModule.h[0x784A ^ 0x78A5] = 0xFFFFBE47 ^ 0x78A5;
        HitColorModule.h[0x5D73 ^ 0x5D97] = 0x3D36 ^ 0x5D97;
        HitColorModule.h[0x2D70 ^ 0x2C5F] = 0xB4F3 ^ 0x2C5F;
        HitColorModule.h[0x8016 ^ 0x819E] = 0x81EF ^ 0x819E;
        HitColorModule.h[0x988 ^ 0x902] = 0x978 ^ 0x902;
        HitColorModule.h[0xDE29 ^ 0xDE8B] = 0x1D8E ^ 0xDE8B;
        HitColorModule.h[0x6EEA ^ 0x6FAB] = 0x4BA9 ^ 0x6FAB;
        HitColorModule.h[0x3A18 ^ 0x3A7D] = 0x3A1F ^ 0x3A7D;
        HitColorModule.h[0x2FB3 ^ 0x2F22] = 0xFFFFD000 ^ 0x2F22;
        HitColorModule.h[0x3D1F ^ 0x3D70] = 0xFFFFC2D5 ^ 0x3D70;
        HitColorModule.h[0x8D81 ^ 0x8CFF] = 0xFFFF7320 ^ 0x8CFF;
        HitColorModule.h[0xF931 ^ 0xF986] = 0x7FD6 ^ 0xF986;
        HitColorModule.h[0x107A1 ^ 0x10620] = 0x10620 ^ 0x10620;
        HitColorModule.h[0xA35A ^ 0xA2D5] = 0xA2D0 ^ 0xA2D5;
        HitColorModule.h[0x86A6 ^ 0x86F0] = 0x86E4 ^ 0x86F0;
        HitColorModule.h[0xC981 ^ 0xC9A4] = 0xFFFF3609 ^ 0xC9A4;
        HitColorModule.h[0x3F00 ^ 0x3F0F] = 0x3FB7 ^ 0x3F0F;
        HitColorModule.h[0x37A6 ^ 0x36B6] = 0x7F8D ^ 0x36B6;
        HitColorModule.h[0x8E9C ^ 0x8E10] = 0xFFFF71EA ^ 0x8E10;
        HitColorModule.h[0xBB58 ^ 0xBBF5] = 0x4A94 ^ 0xBBF5;
        HitColorModule.h[0x10DA ^ 0x105A] = 0x1039 ^ 0x105A;
        HitColorModule.h[0x15FB ^ 0x149E] = 0x149E ^ 0x149E;
        HitColorModule.h[0x820F ^ 0x827E] = 0x821F ^ 0x827E;
        HitColorModule.h[0x6FAF ^ 0x6EC8] = 0x6EC8 ^ 0x6EC8;
        HitColorModule.h[0xFB78 ^ 0xFB4B] = 0xFB4B ^ 0xFB4B;
        HitColorModule.h[0x40B0 ^ 0x4034] = 0xFFFFBFC1 ^ 0x4034;
        HitColorModule.h[0xA7D ^ 0xAF5] = 0xA4B ^ 0xAF5;
        HitColorModule.h[0xD30E ^ 0xD24D] = 0xF651 ^ 0xD24D;
        HitColorModule.h[0xC0F4 ^ 0xC08D] = 0xC0AE ^ 0xC08D;
        HitColorModule.h[0xA423 ^ 0xA4B9] = 0xA4B8 ^ 0xA4B9;
        HitColorModule.h[0xF4E9 ^ 0xF421] = 0xFFFFC4D3 ^ 0xF421;
        HitColorModule.h[0xD027 ^ 0xD111] = 0xC5CA ^ 0xD111;
        HitColorModule.h[0x7DD7 ^ 0x7DDF] = 0x7DCA ^ 0x7DDF;
        HitColorModule.h[0x7D53 ^ 0x7CD5] = 0xFFFF8327 ^ 0x7CD5;
        HitColorModule.h[0x64BF ^ 0x6478] = 0xAB79 ^ 0x6478;
        HitColorModule.h[0x101C ^ 0x1125] = 0xA3AC ^ 0x1125;
        HitColorModule.h[0x216D ^ 0x21F1] = 0x21F1 ^ 0x21F1;
        HitColorModule.h[0x5D22 ^ 0x5CAF] = 0x5CA3 ^ 0x5CAF;
        HitColorModule.h[0x8C66 ^ 0x8C7E] = 0x8C0B ^ 0x8C7E;
        HitColorModule.h[0x10527 ^ 0x1041B] = 0x1B684 ^ 0x1041B;
        HitColorModule.h[0x57F6 ^ 0x56EE] = 0x8DEF ^ 0x56EE;
        HitColorModule.h[0xC271 ^ 0xC301] = 0x717 ^ 0xC301;
        HitColorModule.h[0x580C ^ 0x5921] = 0xC1EA ^ 0x5921;
        HitColorModule.h[0xA089 ^ 0xA042] = 0x1540 ^ 0xA042;
        HitColorModule.h[0x7A0E ^ 0x7A81] = 0x7AA4 ^ 0x7A81;
        HitColorModule.h[0xB2D7 ^ 0xB251] = 0xFFFF4DEA ^ 0xB251;
        HitColorModule.h[0x9DE7 ^ 0x9CBF] = 0xD90B ^ 0x9CBF;
        HitColorModule.h[0xBFD1 ^ 0xBF93] = 0xBF93 ^ 0xBF93;
        HitColorModule.h[0x5771 ^ 0x57B3] = 0x2D77 ^ 0x57B3;
        HitColorModule.h[0x609D ^ 0x6093] = 0xFFFF9F1F ^ 0x6093;
        HitColorModule.h[0xBA39 ^ 0xBBB2] = 0xBBB3 ^ 0xBBB2;
        HitColorModule.h[0xE38C ^ 0xE2DA] = 0xA76E ^ 0xE2DA;
        HitColorModule.h[0xED17 ^ 0xED79] = 0xED63 ^ 0xED79;
        HitColorModule.h[0x9670 ^ 0x9653] = 0xFFFF69D2 ^ 0x9653;
        HitColorModule.h[0x218A ^ 0x2163] = 0xE8E0 ^ 0x2163;
        HitColorModule.h[0x2064 ^ 0x2131] = 0x648C ^ 0x2131;
        HitColorModule.h[0x460E ^ 0x4763] = 0xB081 ^ 0x4763;
        HitColorModule.h[0xE9A8 ^ 0xE9B2] = 0xE9A7 ^ 0xE9B2;
        HitColorModule.h[0x20AF ^ 0x2037] = 0xFFFFDFEB ^ 0x2037;
        HitColorModule.h[0xFFCE ^ 0xFF17] = 0x7ADB ^ 0xFF17;
        HitColorModule.h[0x63F7 ^ 0x63A9] = 0x63E3 ^ 0x63A9;
        HitColorModule.h[0x70EA ^ 0x7086] = 0x70D9 ^ 0x7086;
        HitColorModule.h[0x27C1 ^ 0x26B2] = 0x1F75 ^ 0x26B2;
        HitColorModule.h[0xEC6A ^ 0xECBC] = 0x6970 ^ 0xECBC;
        HitColorModule.h[0x2C38 ^ 0x2D2F] = 0xF650 ^ 0x2D2F;
        HitColorModule.h[0x10E5E ^ 0x10E9B] = 0x17453 ^ 0x10E9B;
        HitColorModule.h[0xC397 ^ 0xC2D7] = 0x742A ^ 0xC2D7;
        HitColorModule.h[0xBAA0 ^ 0xBBAF] = 0xFFFF0D47 ^ 0xBBAF;
        HitColorModule.h[0x422C ^ 0x43AE] = 0x43E7 ^ 0x43AE;
        HitColorModule.h[0xFAD5 ^ 0xFBBD] = 0xFBBC ^ 0xFBBD;
        HitColorModule.h[0xBFD5 ^ 0xBECB] = 0x6A0C ^ 0xBECB;
        HitColorModule.h[0x7AF3 ^ 0x7BE1] = 0x9947 ^ 0x7BE1;
        HitColorModule.h[0x10C6C ^ 0x10CB2] = 0x169E9 ^ 0x10CB2;
        HitColorModule.h[0x106CC ^ 0x106D8] = 0x106DF ^ 0x106D8;
        HitColorModule.h[0xF95C ^ 0xF96A] = 0x25EE ^ 0xF96A;
        HitColorModule.h[0x29C3 ^ 0x298D] = 0xFFFFD63F ^ 0x298D;
        HitColorModule.h[0x42CD ^ 0x4388] = 0x4B7F ^ 0x4388;
        HitColorModule.h[0xF75C ^ 0xF7D1] = 0xFFFF0870 ^ 0xF7D1;
        HitColorModule.h[0x57B ^ 0x464] = 0xFFFF2F4A ^ 0x464;
        HitColorModule.h[0x10B9C ^ 0x10B82] = 0xFFFEF447 ^ 0x10B82;
        HitColorModule.h[0xD34C ^ 0xD208] = 0xF606 ^ 0xD208;
        HitColorModule.h[0x7EC9 ^ 0x7E7F] = 0xF829 ^ 0x7E7F;
        HitColorModule.h[0x5B09 ^ 0x5A4F] = 0x52BE ^ 0x5A4F;
        HitColorModule.h[0x302 ^ 0x387] = 0x385 ^ 0x387;
        HitColorModule.h[0xB2D8 ^ 0xB2FE] = 0xFFFF4D35 ^ 0xB2FE;
        HitColorModule.h[0x20E5 ^ 0x20CD] = 0x2085 ^ 0x20CD;
        HitColorModule.h[0xD850 ^ 0xD82A] = 0xFFFF27E5 ^ 0xD82A;
        HitColorModule.h[0x4808 ^ 0x4929] = 0x582D ^ 0x4929;
        HitColorModule.h[0x8E83 ^ 0x8E15] = 0x8E0E ^ 0x8E15;
        HitColorModule.h[0x2DD7 ^ 0x2CDA] = 0x65EB ^ 0x2CDA;
        HitColorModule.h[0xAB25 ^ 0xAA5E] = 0xAA5A ^ 0xAA5E;
        HitColorModule.h[0x6312 ^ 0x63A6] = 0x6BE4 ^ 0x63A6;
        HitColorModule.h[0xCDF9 ^ 0xCCDA] = 0xDDA0 ^ 0xCCDA;
        HitColorModule.h[0x10662 ^ 0x10674] = 0x10632 ^ 0x10674;
        HitColorModule.h[0x858D ^ 0x8547] = 0x304A ^ 0x8547;
        HitColorModule.h[0xE9C0 ^ 0xE88B] = 0x7D13 ^ 0xE88B;
        HitColorModule.h[0x4FA2 ^ 0x4F79] = 0x6368 ^ 0x4F79;
        HitColorModule.h[0x407A ^ 0x40ED] = 0x40C6 ^ 0x40ED;
        HitColorModule.h[0x1324 ^ 0x133D] = 0x137D ^ 0x133D;
        HitColorModule.h[0xD846 ^ 0xD845] = 0xD878 ^ 0xD845;
        HitColorModule.h[0x5285 ^ 0x5225] = 0xF218 ^ 0x5225;
        HitColorModule.h[0xE5C2 ^ 0xE59E] = 0xE5CE ^ 0xE59E;
        HitColorModule.h[0x8420 ^ 0x84F4] = 0xBAB7 ^ 0x84F4;
        HitColorModule.h[0x1E80 ^ 0x1F88] = 0xB6A2 ^ 0x1F88;
        HitColorModule.h[0x10421 ^ 0x1042B] = 0xFFFEFBC4 ^ 0x1042B;
        HitColorModule.h[0xE969 ^ 0xE9BE] = 0x6C72 ^ 0xE9BE;
        HitColorModule.h[0xDD7A ^ 0xDD96] = 0x1405 ^ 0xDD96;
        HitColorModule.h[0xCC5E ^ 0xCD26] = 0xCD36 ^ 0xCD26;
        HitColorModule.h[0x458E ^ 0x44A4] = 0xB5DC ^ 0x44A4;
        HitColorModule.h[0xAC48 ^ 0xAC71] = 0x8CA1 ^ 0xAC71;
        HitColorModule.h[0x989B ^ 0x98F3] = 0xFFFF677C ^ 0x98F3;
        HitColorModule.h[0xE551 ^ 0xE40D] = 0x1EECD ^ 0xE40D;
        HitColorModule.h[0x6DBF ^ 0x6D18] = 0x84CF ^ 0x6D18;
        HitColorModule.h[0x7C55 ^ 0x7C16] = 0x7C15 ^ 0x7C16;
        HitColorModule.h[0xDFFB ^ 0xDF18] = 0xBF99 ^ 0xDF18;
        HitColorModule.h[0x10422 ^ 0x1054C] = 0x1B87F ^ 0x1054C;
        HitColorModule.h[0x5EE1 ^ 0x5EC3] = 0x5EDF ^ 0x5EC3;
        HitColorModule.h[0x333D ^ 0x330C] = 0x330E ^ 0x330C;
        HitColorModule.h[0x10749 ^ 0x107F4] = 0x1C692 ^ 0x107F4;
        HitColorModule.h[0x9D27 ^ 0x9C6E] = 0x9FC ^ 0x9C6E;
        HitColorModule.h[0x9724 ^ 0x9761] = 0x976D ^ 0x9761;
        HitColorModule.h[0x9F6C ^ 0x9E37] = 0xFFFE6B60 ^ 0x9E37;
        HitColorModule.h[0xF7DF ^ 0xF71B] = 0x8D9B ^ 0xF71B;
        HitColorModule.h[0xB07B ^ 0xB15D] = 0x8543 ^ 0xB15D;
        HitColorModule.h[0xDED8 ^ 0xDFE2] = 0x6D7D ^ 0xDFE2;
        HitColorModule.h[0x8B74 ^ 0x8B50] = 0x8B4E ^ 0x8B50;
        HitColorModule.h[0x8474 ^ 0x8575] = 0x5A25 ^ 0x8575;
        HitColorModule.h[0x72C9 ^ 0x73CD] = 0xAC83 ^ 0x73CD;
        HitColorModule.h[0x1F82 ^ 0x1F6A] = 0x5E23 ^ 0x1F6A;
        HitColorModule.h[0xAD4E ^ 0xAC1C] = 0xD0AC ^ 0xAC1C;
        HitColorModule.h[0x99F7 ^ 0x9870] = 0x987D ^ 0x9870;
        HitColorModule.h[0xEAF5 ^ 0xEA5C] = 0x38B ^ 0xEA5C;
        HitColorModule.h[0x8057 ^ 0x80F6] = 0x20DB ^ 0x80F6;
        HitColorModule.h[0x26E5 ^ 0x26A8] = 0x26DB ^ 0x26A8;
        HitColorModule.h[0x109A5 ^ 0x109C5] = 0xFFFEF636 ^ 0x109C5;
        HitColorModule.h[0x32B9 ^ 0x32D0] = 0xFFFFCD4A ^ 0x32D0;
        HitColorModule.h[0x8DAD ^ 0x8CC6] = 0x11E7 ^ 0x8CC6;
        HitColorModule.h[0x34B1 ^ 0x348C] = 0x1F3B ^ 0x348C;
        HitColorModule.h[0xB923 ^ 0xB9E2] = 0x6242 ^ 0xB9E2;
        HitColorModule.h[0x4C8B ^ 0x4CDC] = 0xFFFFB34F ^ 0x4CDC;
        HitColorModule.h[0x1836 ^ 0x18E9] = 0x7DB0 ^ 0x18E9;
        HitColorModule.h[0x10EC4 ^ 0x10EF4] = 0x10EF4 ^ 0x10EF4;
        HitColorModule.h[0x75DF ^ 0x75A7] = 0x7580 ^ 0x75A7;
        HitColorModule.h[0x6869 ^ 0x6833] = 0xFFFF97E6 ^ 0x6833;
        HitColorModule.h[0xCB1 ^ 0xDA7] = 0xD6A6 ^ 0xDA7;
        HitColorModule.h[0x99F0 ^ 0x98CF] = 0xFFFFD1BE ^ 0x98CF;
        HitColorModule.h[0x5253 ^ 0x5239] = 0x5208 ^ 0x5239;
        HitColorModule.h[0xB3CC ^ 0xB284] = 0xBA75 ^ 0xB284;
        HitColorModule.h[0x8AE9 ^ 0x8AD6] = 0xEC0B ^ 0x8AD6;
        HitColorModule.h[0xBE98 ^ 0xBE6B] = 0xA4D2 ^ 0xBE6B;
        HitColorModule.h[0x4BC3 ^ 0x4A4D] = 0x4A42 ^ 0x4A4D;
        HitColorModule.h[0x9528 ^ 0x9465] = 0xAF2B ^ 0x9465;
        HitColorModule.h[0xECFE ^ 0xECEB] = 0xECB5 ^ 0xECEB;
        HitColorModule.h[0xB476 ^ 0xB5FA] = 0xB5AB ^ 0xB5FA;
        HitColorModule.h[0x1D5D ^ 0x1C34] = 0x1C34 ^ 0x1C34;
        HitColorModule.h[0xF289 ^ 0xF3B8] = 0x3A10 ^ 0xF3B8;
        HitColorModule.h[0xE178 ^ 0xE01E] = 0xE01E ^ 0xE01E;
        HitColorModule.h[0x14D8 ^ 0x15A9] = 0xD42F ^ 0x15A9;
        HitColorModule.h[0x9D98 ^ 0x9D83] = 0x9DD6 ^ 0x9D83;
        HitColorModule.h[0xE46B ^ 0xE4AD] = 0x2BAB ^ 0xE4AD;
        HitColorModule.h[0x78FE ^ 0x7846] = 0xFE23 ^ 0x7846;
        HitColorModule.h[0xF3CF ^ 0xF354] = 0xF356 ^ 0xF354;
        HitColorModule.h[0x2A35 ^ 0x2A79] = 0xFFFFD5B9 ^ 0x2A79;
        HitColorModule.h[0x94E0 ^ 0x947F] = 0x947F ^ 0x947F;
        HitColorModule.h[0xAA68 ^ 0xAB4F] = 0xFFFF608B ^ 0xAB4F;
        HitColorModule.h[0x3A86 ^ 0x3A0D] = 0x3A53 ^ 0x3A0D;
        HitColorModule.h[0x52AA ^ 0x52E1] = 0x52AA ^ 0x52E1;
        HitColorModule.h[0xE723 ^ 0xE734] = 0xE73C ^ 0xE734;
        HitColorModule.h[0x2448 ^ 0x2506] = 0x1E4C ^ 0x2506;
        HitColorModule.h[0x8F28 ^ 0x8F07] = 0x8F06 ^ 0x8F07;
        HitColorModule.h[0x80CE ^ 0x81E6] = 0xB5F8 ^ 0x81E6;
        HitColorModule.h[0xBB00 ^ 0xBB81] = 0xFFFF442D ^ 0xBB81;
        HitColorModule.h[0xB8F1 ^ 0xB864] = 0xB81C ^ 0xB864;
        HitColorModule.h[0x2246 ^ 0x221E] = 0xFFFFDDB1 ^ 0x221E;
        HitColorModule.h[0x63DE ^ 0x6326] = 0xB31B ^ 0x6326;
        HitColorModule.h[0x37A9 ^ 0x37DC] = 0x3787 ^ 0x37DC;
        HitColorModule.h[0xD839 ^ 0xD826] = 0xD871 ^ 0xD826;
        HitColorModule.h[0x2F6D ^ 0x2E12] = 0x2E14 ^ 0x2E12;
        HitColorModule.h[0xE2F7 ^ 0xE253] = 0xFFFFDEF5 ^ 0xE253;
        HitColorModule.h[0x4052 ^ 0x4057] = 0xFFFFBF9F ^ 0x4057;
        HitColorModule.h[0x57AD ^ 0x57DB] = 0x5743 ^ 0x57DB;
        HitColorModule.h[0xB9D7 ^ 0xB8B8] = 0xF3AD ^ 0xB8B8;
        HitColorModule.h[0x1084E ^ 0x10875] = 0x15C06 ^ 0x10875;
        HitColorModule.h[0x83B1 ^ 0x8232] = 0x8239 ^ 0x8232;
        HitColorModule.h[0x10EBF ^ 0x10E2C] = 0xFFFEF18C ^ 0x10E2C;
        HitColorModule.h[0x58A7 ^ 0x59AC] = 0xFFFFE83B ^ 0x59AC;
        HitColorModule.h[0x84CA ^ 0x8585] = 0xBE88 ^ 0x8585;
        HitColorModule.h[0x151E ^ 0x15F0] = 0x2CA9 ^ 0x15F0;
        HitColorModule.h[0x19FA ^ 0x198A] = 0x19E2 ^ 0x198A;
        HitColorModule.h[0xC7DF ^ 0xC725] = 0xF0A0 ^ 0xC725;
        HitColorModule.h[0xBD9C ^ 0xBC9A] = 0x15B0 ^ 0xBC9A;
        HitColorModule.h[0xECC ^ 0xFCE] = 0xD080 ^ 0xFCE;
        HitColorModule.h[0xD822 ^ 0xD931] = 0xFFFFC404 ^ 0xD931;
        HitColorModule.h[0x1E20 ^ 0x1E68] = 0x1E40 ^ 0x1E68;
        HitColorModule.h[0xD22C ^ 0xD2B5] = 0xD2FA ^ 0xD2B5;
        HitColorModule.h[0x5C24 ^ 0x5D79] = 0x15AC7 ^ 0x5D79;
        HitColorModule.h[0x1CB6 ^ 0x1DBC] = 0x53D2 ^ 0x1DBC;
        HitColorModule.h[0x14CC ^ 0x143E] = 0xEBF ^ 0x143E;
        HitColorModule.h[0x52B6 ^ 0x53C2] = 0x747F ^ 0x53C2;
        HitColorModule.h[0x39B7 ^ 0x391F] = 0xD0EC ^ 0x391F;
        HitColorModule.h[0x3342 ^ 0x3312] = 0x330E ^ 0x3312;
        HitColorModule.h[0xD519 ^ 0xD5AC] = 0xDDDA ^ 0xD5AC;
        HitColorModule.h[0xBAA7 ^ 0xBA77] = 0xC73C ^ 0xBA77;
        HitColorModule.h[0x4E22 ^ 0x4F72] = 0x7438 ^ 0x4F72;
        HitColorModule.h[0xD7AF ^ 0xD7CD] = 0xFFFF2860 ^ 0xD7CD;
        HitColorModule.h[0x59F0 ^ 0x59A5] = 0xFFFFA625 ^ 0x59A5;
        HitColorModule.h[0x10B4F ^ 0x10A2F] = 0xD85 ^ 0x10A2F;
        HitColorModule.h[0x3866 ^ 0x3891] = 0xE880 ^ 0x3891;
        HitColorModule.h[0x89EE ^ 0x8905] = 0x40C1 ^ 0x8905;
        HitColorModule.h[0x10DDC ^ 0x10DF1] = 0x10DF2 ^ 0x10DF1;
        HitColorModule.h[0xD5BC ^ 0xD497] = 0x2592 ^ 0xD497;
        HitColorModule.h[0xFA51 ^ 0xFB66] = 0xFFFF101E ^ 0xFB66;
        HitColorModule.h[0xB2F4 ^ 0xB2B2] = 0xB2F4 ^ 0xB2B2;
        HitColorModule.h[0xE45E ^ 0xE543] = 0x3187 ^ 0xE543;
        HitColorModule.h[0x83A8 ^ 0x829B] = 0xFFFFB4D5 ^ 0x829B;
        HitColorModule.h[0x7AF1 ^ 0x7A2D] = 0x5677 ^ 0x7A2D;
        HitColorModule.h[0xC787 ^ 0xC7E1] = 0xFFFF3805 ^ 0xC7E1;
        HitColorModule.h[0xF38C ^ 0xF2CB] = 0xFA10 ^ 0xF2CB;
        HitColorModule.h[0x8A8F ^ 0x8B8A] = 0x22B9 ^ 0x8B8A;
        HitColorModule.h[0x9200 ^ 0x9249] = 0x9286 ^ 0x9249;
        HitColorModule.h[0x1A42 ^ 0x1A10] = 0x1A39 ^ 0x1A10;
        HitColorModule.h[0x463D ^ 0x464A] = 0x461B ^ 0x464A;
        HitColorModule.h[0x9BA3 ^ 0x9B8D] = 0x9B8D ^ 0x9B8D;
        HitColorModule.h[0x1050B ^ 0x1048E] = 0x1048D ^ 0x1048E;
        HitColorModule.h[0x72A2 ^ 0x7232] = 0xFFFF8DE7 ^ 0x7232;
        HitColorModule.h[0x2CDB ^ 0x2C55] = 0xFFFFD3AD ^ 0x2C55;
        HitColorModule.h[0xAC4A ^ 0xAC87] = 0x1985 ^ 0xAC87;
        HitColorModule.h[0xACA4 ^ 0xAC08] = 0x5D1F ^ 0xAC08;
        HitColorModule.h[0xD1B4 ^ 0xD094] = 0x453 ^ 0xD094;
        HitColorModule.h[0x5E4B ^ 0x5E60] = 0xFFFFA1CC ^ 0x5E60;
        HitColorModule.h[0x8A10 ^ 0x8AA1] = 0x9393 ^ 0x8AA1;
        HitColorModule.h[0x9D66 ^ 0x9C7C] = 0xDBC6 ^ 0x9C7C;
        HitColorModule.h[0x4D0C ^ 0x4C7B] = 0x4C7A ^ 0x4C7B;
        HitColorModule.h[0xE197 ^ 0xE09B] = 0xAEF5 ^ 0xE09B;
        HitColorModule.h[0x9B2C ^ 0x9B12] = 0x876A ^ 0x9B12;
        HitColorModule.h[0x5DF7 ^ 0x5DAE] = 0xFFFFA214 ^ 0x5DAE;
        HitColorModule.h[0x334E ^ 0x33A9] = 0x72D7 ^ 0x33A9;
        HitColorModule.h[0x76F2 ^ 0x76D5] = 0x76DC ^ 0x76D5;
        HitColorModule.h[0x4D60 ^ 0x4DE3] = 0x4DC0 ^ 0x4DE3;
        HitColorModule.h[0xD0AC ^ 0xD090] = 0x1AE4 ^ 0xD090;
        HitColorModule.h[0xA981 ^ 0xA9A8] = 0xA9F3 ^ 0xA9A8;
        HitColorModule.h[0xC431 ^ 0xC56B] = 0x1CFAB ^ 0xC56B;
        HitColorModule.h[0xAC0A ^ 0xAD77] = 0xAD7D ^ 0xAD77;
        HitColorModule.h[0xCFB8 ^ 0xCFD5] = 0xFFFF300A ^ 0xCFD5;
        HitColorModule.h[0x78D6 ^ 0x7868] = 0xA3C6 ^ 0x7868;
        HitColorModule.h[0xAD4A ^ 0xAC08] = 0x8806 ^ 0xAC08;
        HitColorModule.h[0x3E7B ^ 0x3F62] = 0x78D0 ^ 0x3F62;
        HitColorModule.h[0xF7CC ^ 0xF69F] = 0xFFFF75C7 ^ 0xF69F;
        HitColorModule.h[0xC6B5 ^ 0xC787] = 0xE20 ^ 0xC787;
        HitColorModule.h[0x81EB ^ 0x8101] = 0x4892 ^ 0x8101;
        HitColorModule.h[0xFC1E ^ 0xFCB4] = 0xDDD ^ 0xFCB4;
        HitColorModule.h[0x81B7 ^ 0x81B1] = 0x818E ^ 0x81B1;
        HitColorModule.h[0x711D ^ 0x71A2] = 0xAA02 ^ 0x71A2;
        HitColorModule.h[0xC73A ^ 0xC6BE] = 0xC6EF ^ 0xC6BE;
        HitColorModule.h[0xD2C5 ^ 0xD2A4] = 0xD233 ^ 0xD2A4;
        HitColorModule.h[0x4A90 ^ 0x4A02] = 0xFFFFB583 ^ 0x4A02;
        HitColorModule.h[0xD4E2 ^ 0xD419] = 0xE3AB ^ 0xD419;
        HitColorModule.h[0x766C ^ 0x7611] = 0x7652 ^ 0x7611;
        HitColorModule.h[0xF194 ^ 0xF1D3] = 0xFFFF0E6D ^ 0xF1D3;
        HitColorModule.h[0xFD02 ^ 0xFD36] = 0xFC76 ^ 0xFD36;
        HitColorModule.h[0xE090 ^ 0xE1EC] = 0xFFFF1E40 ^ 0xE1EC;
        HitColorModule.h[0x17EA ^ 0x17DD] = 0xA893 ^ 0x17DD;
        HitColorModule.h[0x43 ^ 0xB3] = 0x39EA ^ 0xB3;
        HitColorModule.h[0x5CAE ^ 0x5C94] = 0xFCA6 ^ 0x5C94;
        HitColorModule.h[0xF706 ^ 0xF622] = 0xE724 ^ 0xF622;
        HitColorModule.h[0x10DE9 ^ 0x10D5B] = 0x10524 ^ 0x10D5B;
        HitColorModule.h[0xBC56 ^ 0xBD02] = 0xC1B2 ^ 0xBD02;
        HitColorModule.h[0x637C ^ 0x637E] = 0x6307 ^ 0x637E;
        HitColorModule.h[0x1884 ^ 0x19BF] = 0xAB71 ^ 0x19BF;
        HitColorModule.h[0x671E ^ 0x675F] = 0xA60 ^ 0x675F;
        HitColorModule.h[0xD791 ^ 0xD6F0] = 0x5530 ^ 0xD6F0;
        HitColorModule.h[0xD8C2 ^ 0xD8D0] = 0xD84C ^ 0xD8D0;
        HitColorModule.h[0xB9BE ^ 0xB8C8] = 0xD777 ^ 0xB8C8;
        HitColorModule.h[0x49B8 ^ 0x495A] = 0x495A ^ 0x495A;
        HitColorModule.h[0x876D ^ 0x866E] = 0xFFFFA6E3 ^ 0x866E;
        HitColorModule.h[0x87B4 ^ 0x86E3] = 0xC300 ^ 0x86E3;
        HitColorModule.h[0x8F89 ^ 0x8FB1] = 0xE2BF ^ 0x8FB1;
        HitColorModule.h[0x482A ^ 0x48F8] = 0x76E8 ^ 0x48F8;
        HitColorModule.h[0x5AB7 ^ 0x5BFB] = 0xCE7E ^ 0x5BFB;
        HitColorModule.h[0x10A02 ^ 0x10A56] = 0xFFFEF592 ^ 0x10A56;
        HitColorModule.h[0x1ADF ^ 0x1AD4] = 0x1AFE ^ 0x1AD4;
        HitColorModule.h[0x7D8D ^ 0x7CA8] = 0x48BD ^ 0x7CA8;
        HitColorModule.h[0x404B ^ 0x4046] = 0xFFFFBF9B ^ 0x4046;
        HitColorModule.h[0xE8EA ^ 0xE8DF] = 0x2E9C ^ 0xE8DF;
        HitColorModule.h[0xF26B ^ 0xF24B] = 0xFFFF0DDA ^ 0xF24B;
        HitColorModule.h[0xBFFE ^ 0xBF32] = 0xFFFFF5CA ^ 0xBF32;
        HitColorModule.h[0x5AF7 ^ 0x5AB3] = 0x5AA4 ^ 0x5AB3;
        HitColorModule.h[0xC16E ^ 0xC050] = 0x76AD ^ 0xC050;
        HitColorModule.h[0x9BB4 ^ 0x9BD0] = 0x9BF6 ^ 0x9BD0;
        HitColorModule.h[0x9AFF ^ 0x9AEF] = 0xFFFF6561 ^ 0x9AEF;
        HitColorModule.h[0x1058F ^ 0x10520] = 0x11C12 ^ 0x10520;
        HitColorModule.h[0x242C ^ 0x2514] = 0x31CF ^ 0x2514;
        HitColorModule.h[0x1CC3 ^ 0x1CC4] = 0xFFFFE319 ^ 0x1CC4;
        HitColorModule.h[0x74BC ^ 0x74AF] = 0xFFFF8B24 ^ 0x74AF;
        HitColorModule.h[0xCEE ^ 0xC0F] = 0x6956 ^ 0xC0F;
        HitColorModule.h[0xF988 ^ 0xF989] = 0xFFFF064F ^ 0xF989;
        HitColorModule.h[0x7289 ^ 0x73F3] = 0x73FB ^ 0x73F3;
        HitColorModule.h[0x8EA7 ^ 0x8FBB] = 0xC801 ^ 0x8FBB;
        HitColorModule.h[0x7500 ^ 0x7415] = 0xAF14 ^ 0x7415;
        HitColorModule.h[0x1E40 ^ 0x1EBE] = 0xF981 ^ 0x1EBE;
        HitColorModule.h[0x10079 ^ 0x1004B] = 0x1004B ^ 0x1004B;
        HitColorModule.h[0xEFE0 ^ 0xEE8A] = 0xEE98 ^ 0xEE8A;
        HitColorModule.h[0x22EE ^ 0x23D3] = 0x953D ^ 0x23D3;
        HitColorModule.h[0x9B9E ^ 0x9AFC] = 0x1929 ^ 0x9AFC;
        HitColorModule.h[0xA05 ^ 0xABF] = 0xCBD4 ^ 0xABF;
        HitColorModule.h[0x3B3A ^ 0x3BA4] = 0x3BA5 ^ 0x3BA4;
        HitColorModule.h[0x104CE ^ 0x104E2] = 0xFFFEFB7B ^ 0x104E2;
        HitColorModule.h[0xCD04 ^ 0xCC34] = 0x54F1 ^ 0xCC34;
        HitColorModule.h[0xF48 ^ 0xFC1] = 0xF85 ^ 0xFC1;
        HitColorModule.h[0x8F93 ^ 0x8F4E] = 0xA35F ^ 0x8F4E;
        HitColorModule.h[0x105C2 ^ 0x105A1] = 0x10595 ^ 0x105A1;
        HitColorModule.h[0xAC68 ^ 0xAC79] = 0xFFFF53A3 ^ 0xAC79;
        HitColorModule.h[0xA271 ^ 0xA23E] = 0xFFFF5D93 ^ 0xA23E;
        HitColorModule.h[0x10A3A ^ 0x10A41] = 0xFFFEF58D ^ 0x10A41;
        HitColorModule.h[0x10C1B ^ 0x10C99] = 0xFFFEF34E ^ 0x10C99;
        HitColorModule.h[0x4D0B ^ 0x4C67] = 0xE3A6 ^ 0x4C67;
        HitColorModule.h[0x7000 ^ 0x70A6] = 0x997B ^ 0x70A6;
        HitColorModule.h[0xD567 ^ 0xD50C] = 0xD542 ^ 0xD50C;
        HitColorModule.h[0x917C ^ 0x9160] = 0xFFFF6EEE ^ 0x9160;
        HitColorModule.h[0x596E ^ 0x59A0] = 0x24DD ^ 0x59A0;
        HitColorModule.h[0xF56F ^ 0xF461] = 0xBD5A ^ 0xF461;
        HitColorModule.h[0x24CF ^ 0x24A8] = 0x249D ^ 0x24A8;
        HitColorModule.h[0x1049A ^ 0x105CB] = 0x1796A ^ 0x105CB;
        HitColorModule.h[0xE3D4 ^ 0xE2E0] = 0x2B47 ^ 0xE2E0;
        HitColorModule.h[0xA22E ^ 0xA2ED] = 0xD825 ^ 0xA2ED;
        HitColorModule.h[0x5FAD ^ 0x5F39] = 0xFFFFA056 ^ 0x5F39;
        HitColorModule.h[0x929C ^ 0x931C] = 0x9348 ^ 0x931C;
        HitColorModule.h[0x10900 ^ 0x10859] = 0x294 ^ 0x10859;
        HitColorModule.h[0xEE19 ^ 0xEF35] = 0x1E4D ^ 0xEF35;
        HitColorModule.h[0x1B7C ^ 0x1BD7] = 0xEAB6 ^ 0x1BD7;
        HitColorModule.h[0xBEB3 ^ 0xBFED] = 0x1B847 ^ 0xBFED;
    }
}

