/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1297
 *  net.minecraft.class_1309
 *  net.minecraft.class_4608
 *  net.minecraft.class_638
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
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.render.P;
import kotakbaz.rain.module.modules.render.e;
import kotakbaz.rain.module.modules.render.e_0;
import kotakbaz.rain.module.setting.settings.B;
import kotakbaz.rain.module.setting.settings.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_4608;
import net.minecraft.class_638;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00013B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n\u00a2\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010#R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020-0,j\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020-`.8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b1\u00102\u00a8\u00064"}, d2={"Lkotakbaz/rain/module/modules/render/HitColorModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Ljava/awt/Color;", "getColor", "()Ljava/awt/Color;", "", "shouldColorArmor", "()Z", "isSmoothEnabled", "", "entityId", "originalOverlay", "resolveOverlay", "(II)I", "", "damageProgress", "(I)F", "Lnet/minecraft/class_1309;", "entity", "updateDamageAnimation", "(Lnet/minecraft/class_1309;)F", "Lnet/minecraft/class_638;", "world", "clearState", "(Lnet/minecraft/class_638;)V", "DAMAGE_FADE_IN_SPEED", "F", "DAMAGE_FADE_OUT_SPEED", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "armor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "hitColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "alpha", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "smooth", "Ljava/util/HashMap;", "Lkotakbaz/rain/module/modules/render/HitColorModule$DamageAnimation;", "Lkotlin/collections/HashMap;", "damageAnimations", "Ljava/util/HashMap;", "trackedWorld", "Lnet/minecraft/class_638;", "DamageAnimation", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nHitColorModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitColorModule.kt\nkotakbaz/rain/module/modules/render/HitColorModule\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,120:1\n383#2,7:121\n*S KotlinDebug\n*F\n+ 1 HitColorModule.kt\nkotakbaz/rain/module/modules/render/HitColorModule\n*L\n88#1:121,7\n*E\n"})
public final class X
extends a_0 {
    @NotNull
    public static final X INSTANCE;
    private static final float a = 15.0f;
    private static final float A = 8.0f;
    @NotNull
    private static final c b;
    @NotNull
    private static final c B;
    @NotNull
    private static final B c;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 C;
    @NotNull
    private static final c d;
    @NotNull
    private static final HashMap<Integer, e_0> D;
    @Nullable
    private static class_638 e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    private X() {
        int n = h[0];
        n ^= h[1];
        int n2 = h[3];
        n2 -= h[4];
        int n3 = h[6];
        n3 += h[7];
        super((String)E[n -= h[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)E[n2 += h[5]] + (String)E[n3 -= h[8]]);
    }

    @Override
    public void onEnable() {
        int n = h[9];
        n ^= h[10];
        X.clearState$default(this, null, n ^= h[11], null);
    }

    @Override
    public void onDisable() {
        this.clearState(null);
    }

    @NotNull
    public final Color getColor() {
        Color color = (Boolean)B.getValue() != false && P.INSTANCE.isEnabled() ? P.INSTANCE.getClientColor() : (Color)c.getValue();
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)((Number)C.getValue()).floatValue());
    }

    public final boolean shouldColorArmor() {
        return (Boolean)b.getValue();
    }

    public final boolean isSmoothEnabled() {
        return (Boolean)d.getValue();
    }

    public final int resolveOverlay(int n, int n2) {
        int n3;
        if (!this.isEnabled() || !((Boolean)d.getValue()).booleanValue()) {
            return n2;
        }
        float f2 = this.damageProgress(n);
        if (f2 <= 0.001f) {
            n3 = class_4608.field_21444;
        } else {
            boolean bl = h[12];
            bl += h[13];
            n3 = class_4608.method_23624((float)f2, (boolean)(bl -= h[14]));
        }
        return n3;
    }

    private final float damageProgress(int n) {
        class_1297 class_12972;
        long l = -1406253792289211901L;
        class_638 class_6382 = b_0.getMc().field_1687;
        if (class_6382 == null) {
            X x2 = this;
            long l2 = l;
            int n2 = h[15];
            n2 += h[16];
            l = l2 ^ (0L ^ l2) & -1L << (n2 += h[17]);
            x2.clearState(null);
            return 0.0f;
        }
        class_638 class_6383 = class_6382;
        if (e != class_6383) {
            this.clearState(class_6383);
        }
        class_1309 class_13092 = (class_12972 = class_6383.method_8469(n)) instanceof class_1309 ? (class_1309)class_12972 : null;
        if (class_13092 == null) {
            X x3 = this;
            long l3 = l;
            int n3 = h[18];
            n3 += h[19];
            l = l3 ^ (0L ^ l3) & -1L >>> (n3 -= h[20]);
            D.remove(n);
            return 0.0f;
        }
        class_1309 class_13093 = class_13092;
        return this.updateDamageAnimation(class_13093);
    }

    private final float updateDamageAnimation(class_1309 class_13092) {
        Object object;
        long l = -1849269746601943678L;
        long l2 = System.currentTimeMillis();
        Map map = D;
        Integer n = class_13092.method_5628();
        long l3 = l;
        int n2 = h[21];
        n2 ^= h[22];
        l = l3 ^ (0L ^ l3) & -1L << (n2 += h[23]);
        Object v2 = map.get(n);
        if (v2 == null) {
            long l4 = l;
            int n3 = h[24];
            n3 ^= h[25];
            l = l4 ^ (0L ^ l4) & -1L >>> (n3 -= h[26]);
            int n4 = h[27];
            n4 += h[28];
            e e2 = new e(0.0f, l2, n4 ^= h[29], null);
            map.put(n, e2);
            object = e2;
        } else {
            object = v2;
        }
        e e3 = (e)object;
        float f2 = (float)RangesKt.coerceAtLeast(l2 - e3.getLastUpdateAt(), 0L) / 1000.0f;
        e3.setLastUpdateAt(l2);
        float f3 = class_13092.field_6235 > 0 || class_13092.field_6213 > 0 ? 1.0f : 0.0f;
        float f4 = f3 > e3.getProgress() ? 15.0f : 8.0f;
        float f5 = RangesKt.coerceIn(f2 * f4, 0.0f, 1.0f);
        e3.setProgress(e3.getProgress() + (f3 - e3.getProgress()) * f5);
        float f6 = RangesKt.coerceIn(e3.getProgress(), 0.0f, 1.0f);
        if (f6 <= 0.001f && f3 <= 0.0f) {
            D.remove(class_13092.method_5628());
            return 0.0f;
        }
        return f6;
    }

    private final void clearState(class_638 class_6382) {
        D.clear();
        e = class_6382;
    }

    static /* synthetic */ void clearState$default(X x2, class_638 class_6382, int n, Object object) {
        int n2 = h[30];
        n2 ^= h[31];
        if ((n & (n2 -= h[32])) != 0) {
            class_6382 = b_0.getMc().field_1687;
        }
        x2.clearState(class_6382);
    }

    private static final boolean useClientColor$lambda$0() {
        return P.INSTANCE.isEnabled();
    }

    private static final boolean hitColor$lambda$0() {
        int n;
        if (!((Boolean)B.getValue()).booleanValue() || !P.INSTANCE.isEnabled()) {
            int n2 = h[33];
            n2 -= h[34];
            n = n2 -= h[35];
        } else {
            int n3 = h[36];
            n3 += h[37];
            n = n3 ^= h[38];
        }
        return n != 0;
    }

    static {
        X.b();
        long l = 8813863515305185712L;
        long l2 = 4964688513019021910L;
        long l3 = 1612537610209467041L;
        long l4 = 4349302420579388173L;
        long l5 = -8696524309057856795L;
        long l6 = -2424589180615330839L;
        long l7 = 7346047351167307211L;
        long l8 = 8423476171702118563L;
        long l9 = -8053588996027633516L;
        long l10 = 7262149068751444531L;
        long l11 = 6431179276676654697L;
        long l12 = 110265724310212078L;
        long l13 = 3944407711624947599L;
        long l14 = 4260782033826759126L;
        int n = h[39];
        n += h[40];
        E = new Object[n ^= h[41]];
        long l15 = l14;
        int n2 = h[42];
        n2 += h[43];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= h[44]);
        Object[] objectArray = new Object[h[45]];
        objectArray[X.h[46]] = f;
        objectArray[X.h[47]] = h[48];
        int n3 = h[49];
        Object object = X.A()[h[50]];
        if (object == null) {
            char[] cArray = "\u995a\u998d\u98f4\u998a\u99b5\u98f4\u996b\u999c\u999e\u98c3\u98f9\u98fe\u98f6\u9969\u998d\u98fe\u99b3\u98f5\u995d\u996a\u99b3\u996d\u9955\u999a\u999e\u996d\u99b4\u98f0\u999a\u999e\u98fe\u9956\u9988\u9967\u98f4\u99b3\u996a\u98fe\u9963\u999e\u9963\u9967\u9953\u996d\u9953\u9969\u9998\u98fa\u998b\u9954\u9956\u99b9\u999b\u996e\u998d\u98f3\u98c9\u9968\u998e\u996d\u9952\u9959\u9968\u98fa\u98f8\u98f1\u98fe\u995b\u998a\u98fc\u9968\u98f0\u999e\u98f3\u98f5\u9987\u9968\u9956\u98f4\u99b6\u98f0\u98f1\u9956\u99b9\u98c4\u98f2\u994f\u995b\u9998\u98fb\u98fb\u98c9\u9953\u98ef\u98f3\u996c\u99b9\u9955\u98fb\u99b4\u99b6\u996e\u9959\u9997\u98c3\u995d\u98f1\u98f8\u9987\u98fb\u98ef\u98ef\u98f9\u98f7\u998c\u98fa\u98c4\u996e\u99b5\u99b5\u98f1\u998b\u996a\u98ef\u98c9\u9967\u996e\u99b5\u98c3\u98c3\u9998\u9969\u996b\u98c3\u9998\u98c3\u98c4\u98f7\u9957\u998b\u996b\u9951\u9954\u9954\u9953\u999a\u9950\u98f3\u998c\u9958\u9953\u98f1\u995a\u98fd\u99b5\u9969\u98f9\u98c4\u9957\u98fd\u98f9\u9950\u9952\u98c4\u99b3\u98c9\u99b3\u999e\u999b\u999d\u996d\u995e\u9956\u98f8\u998b\u98f2\u9988\u9958\u9950\u998d\u9987\u98f6\u9964\u998a\u995e\u98ef\u9957\u98fe\u999e\u9987\u9957\u98c3\u9964\u98fd\u9957\u99b3\u98c4\u99b4\u98fb\u996d\u99b9\u99b9\u998a\u99b3\u98f7\u998a\u998e\u999c\u9954\u99b5\u9997\u999b\u999d\u995e\u98c3\u99b9\u9987\u9956\u9969\u99b9\u995b\u9998\u995e\u994f\u98f3\u98c4\u996b\u996c\u9998\u99b4\u99b9\u99b3\u9963\u998a\u9952\u999c\u9968\u9967\u99b5\u98f1\u99b5\u98c4\u99b3\u9998\u98f8\u98f7\u98f1\u999a\u98fa\u99b5\u9957\u98f4\u998c\u9951\u98fa\u98ef\u998d\u999d\u98fe\u996e\u98fe\u99b6\u999a\u99b9\u999c\u998b\u98f5\u98f2\u99b6\u996a\u98c4\u99b1\u98f8\u9964\u999e\u999c\u9964\u98f6\u9998\u998a\u9968\u98f5\u98c3\u996d\u9958\u98c9\u998a\u998e\u998b\u9957\u998d\u9956\u9959\u9987\u998a\u9968\u98fc\u994f\u9969\u999d\u998e\u98fb\u9998\u9958\u98fb\u995a\u9950\u9988\u98f6\u98f2\u98f2\u9988\u995d\u995e\u98fa\u996c\u999e\u9964\u99b6\u98f5".toCharArray();
            for (int i2 = h[51]; i2 < h[52]; ++i2) {
                int n4 = cArray[i2];
                n4 -= h[53];
                n4 += h[54];
                n4 ^= h[55];
                n4 ^= h[56];
                n4 += h[57];
                n4 ^= h[58];
                n4 += h[59];
                n4 += h[60];
                n4 ^= h[61];
                n4 ^= h[62];
                n4 += h[63];
                n4 += h[64];
                cArray[i2] = (char)(n4 ^= h[65]);
            }
            object = X.A()[X.h[66]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)X.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = h[67];
        n5 ^= h[68];
        l5 = l16 ^ (0x7D00000000L ^ l16) & -1L << (n5 += h[69]);
        long l17 = l12;
        int n6 = h[70];
        n6 ^= h[71];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += h[72]);
        while (true) {
            int n7 = h[73];
            n7 += h[74];
            if ((int)l12 >= (int)(l5 >>> (n7 -= h[75]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = h[76];
            n9 ^= h[77];
            int n10 = h[79];
            n10 -= h[80];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= h[78])) & -1L >>> (n10 ^= h[81]);
            long l19 = l8;
            int n11 = h[82];
            n11 ^= h[83];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += h[84]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = h[85];
            n13 ^= h[86];
            int n14 = h[88];
            n14 -= h[89];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= h[87])) & -1L >>> (n14 ^= h[90]);
            int n15 = h[91];
            n15 ^= h[92];
            long l21 = l9;
            int n16 = h[94];
            n16 += h[95];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= h[93]) ^ l21) & -1L << (n16 += h[96]);
            int n17 = h[97];
            n17 += h[98];
            n17 -= h[99];
            int n18 = h[100];
            n18 -= h[101];
            long l22 = l11;
            int n19 = h[103];
            n19 ^= h[104];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= h[102]))) ^ l22) & -1L >>> (n19 ^= h[105]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = h[106];
            n20 ^= h[107];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= h[108]);
            while (true) {
                int n21 = h[109];
                n21 -= h[110];
                if ((int)(l13 >>> (n21 -= h[111])) >= (int)l11) break;
                int n22 = h[112];
                n22 -= h[113];
                int n23 = h[115];
                n23 += h[116];
                cArray2[(int)(l13 >>> (n22 -= X.h[114]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= h[117]))];
                l13 += 0x100000000L;
            }
            int n24 = h[118];
            n24 -= h[119];
            int n25 = (int)(l14 >>> (n24 -= h[120]));
            l14 += 0x100000000L;
            X.E[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = h[121];
            n26 ^= h[122];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= h[123]);
        }
        INSTANCE = new X();
        int n27 = h[124];
        n27 += h[125];
        int n28 = h[127];
        n28 += h[128];
        boolean bl = h[130];
        bl ^= h[131];
        b = INSTANCE.boolean((String)E[n27 -= h[126]] + (String)E[n28 ^= h[129]], bl ^= h[132]);
        int n29 = h[133];
        n29 ^= h[134];
        boolean bl2 = h[136];
        bl2 -= h[137];
        B = INSTANCE.boolean((String)E[n29 -= h[135]], bl2 -= h[138]).setVisible(X::useClientColor$lambda$0);
        int n30 = h[139];
        n30 -= h[140];
        String string = (String)E[n30 += h[141]];
        Color color = Color.RED;
        int n31 = h[142];
        n31 ^= h[143];
        Intrinsics.checkNotNullExpressionValue(color, (String)E[n31 ^= h[144]]);
        c = INSTANCE.color(string, color).setVisible(X::hitColor$lambda$0);
        int n32 = h[145];
        n32 -= h[146];
        C = INSTANCE.slider((String)E[n32 -= h[147]], 255.0f, 0.0f, 255.0f, 1.0f);
        int n33 = h[148];
        n33 += h[149];
        boolean bl3 = h[151];
        bl3 -= h[152];
        d = INSTANCE.boolean((String)E[n33 += h[150]], bl3 ^= h[153]);
        D = new HashMap();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[h[154]];
        String string = (String)object[h[155]];
        object = object[h[156]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[157]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[158]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[160] ^ h[161]];
                byArray[X.h[162] ^ X.h[163]] = h[164] ^ h[165];
                byArray[X.h[166] ^ X.h[167]] = h[168] ^ h[169];
                byArray[X.h[170] ^ X.h[171]] = h[172] ^ h[173];
                byArray[X.h[174] ^ X.h[175]] = h[176] ^ h[177];
                byArray[X.h[178] ^ X.h[179]] = h[180] ^ h[181];
                byArray[X.h[182] ^ X.h[183]] = h[184] ^ h[185];
                byArray[X.h[186] ^ X.h[187]] = h[188] ^ h[189];
                byArray[X.h[190] ^ X.h[191]] = h[192] ^ h[193];
                byArray[X.h[194] ^ X.h[195]] = h[196] ^ h[197];
                byArray[X.h[198] ^ X.h[199]] = h[200] ^ h[201];
                byArray[X.h[202] ^ X.h[203]] = h[204] ^ h[205];
                byArray[X.h[206] ^ X.h[207]] = h[208] ^ h[209];
                byArray[X.h[210] ^ X.h[211]] = h[212] ^ h[213];
                byArray[X.h[214] ^ X.h[215]] = h[216] ^ h[217];
                byArray[X.h[218] ^ X.h[219]] = h[220] ^ h[221];
                byArray[X.h[222] ^ X.h[223]] = h[224] ^ h[225];
                objectArray2[X.h[159]] = byArray;
            }
            byte[] byArray = (byte[])object3[h[226]];
            if (F == null) {
                byte[] byArray2 = new byte[h[227] ^ h[228]];
                byArray2[X.h[229] ^ X.h[230]] = h[231] ^ h[232];
                byArray2[X.h[233] ^ X.h[234]] = h[235] ^ h[236];
                byArray2[X.h[237] ^ X.h[238]] = h[239] ^ h[240];
                byArray2[X.h[241] ^ X.h[242]] = h[243] ^ h[244];
                byArray2[X.h[245] ^ X.h[246]] = h[247] ^ h[248];
                byArray2[X.h[249] ^ X.h[250]] = h[251] ^ h[252];
                byArray2[X.h[253] ^ X.h[254]] = h[255] ^ h[256];
                byArray2[X.h[257] ^ X.h[258]] = h[259] ^ h[260];
                byArray2[X.h[261] ^ X.h[262]] = h[263] ^ h[264];
                byArray2[X.h[265] ^ X.h[266]] = h[267] ^ h[268];
                byArray2[X.h[269] ^ X.h[270]] = h[271] ^ h[272];
                byArray2[X.h[273] ^ X.h[274]] = h[275] ^ h[276];
                byArray2[X.h[277] ^ X.h[278]] = h[279] ^ h[280];
                byArray2[X.h[281] ^ X.h[282]] = h[283] ^ h[284];
                byArray2[X.h[285] ^ X.h[286]] = h[287] ^ h[288];
                byArray2[X.h[289] ^ X.h[290]] = h[291] ^ h[292];
                byArray2[X.h[293] ^ X.h[294]] = h[295] ^ h[296];
                byArray2[X.h[297] ^ X.h[298]] = h[299] ^ h[300];
                byArray2[X.h[301] ^ X.h[302]] = h[303] ^ h[304];
                byArray2[X.h[305] ^ X.h[306]] = h[307] ^ h[308];
                byArray2[X.h[309] ^ X.h[310]] = h[311] ^ h[312];
                byArray2[X.h[313] ^ X.h[314]] = h[315] ^ h[316];
                byArray2[X.h[317] ^ X.h[318]] = h[319] ^ h[320];
                byArray2[X.h[321] ^ X.h[322]] = h[323] ^ h[324];
                byArray2[X.h[325] ^ X.h[326]] = h[327] ^ h[328];
                byArray2[X.h[329] ^ X.h[330]] = h[331] ^ h[332];
                byArray2[X.h[333] ^ X.h[334]] = h[335] ^ h[336];
                byArray2[X.h[337] ^ X.h[338]] = h[339] ^ h[340];
                byArray2[X.h[341] ^ X.h[342]] = h[343] ^ h[344];
                byArray2[X.h[345] ^ X.h[346]] = h[347] ^ h[348];
                byArray2[X.h[349] ^ X.h[350]] = h[351] ^ h[352];
                byArray2[X.h[353] ^ X.h[354]] = h[355] ^ h[356];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, h[357], byArray3, h[358], byArray.length);
                System.arraycopy(byArray2, h[359], byArray3, byArray.length, byArray2.length);
                Object object4 = X.A()[h[360]];
                if (object4 == null) {
                    char[] cArray = "\ufe0d\ufe13\ufe0c\ufe19\ufe0f\uefc3\ufe20\ufe6e\ufe49\ufe75\ufe15\ufe6a\ufe76\ufe74\ufe64\ufe15\ufe16\uee06".toCharArray();
                    for (int i2 = h[361]; i2 < h[362]; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= h[363];
                        n2 -= h[364];
                        n2 ^= h[365];
                        n2 -= h[366];
                        n2 -= h[367];
                        n2 -= h[368];
                        n2 -= h[369];
                        n2 ^= h[370];
                        n2 ^= h[371];
                        n2 += h[372];
                        n2 ^= h[373];
                        cArray[i2] = (char)(n2 -= h[374]);
                    }
                    object4 = X.A()[X.h[375]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[h[376]];
                byArray4[X.h[377]] = h[378];
                byArray4[X.h[379]] = h[380];
                byArray4[X.h[381]] = h[382];
                byArray4[X.h[383]] = h[384];
                byArray4[X.h[385]] = h[386];
                byArray4[X.h[387]] = h[388];
                byArray4[X.h[389]] = h[390];
                byArray4[X.h[391]] = h[392];
                byArray4[X.h[393]] = h[394];
                byArray4[X.h[395]] = h[396];
                byArray4[X.h[397]] = h[398];
                byArray4[X.h[399]] = -92;
                byArray4[8] = -128;
                byArray4[2] = -117;
                byArray4[15] = 119;
                byArray4[7] = -35;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = X.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uf0b0\uf0ac\uf11a".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 56208;
                        n3 -= 56241;
                        n3 ^= 0x3DB2;
                        n3 += 24306;
                        n3 -= 27475;
                        n3 -= 38467;
                        n3 += 23283;
                        n3 ^= 0xCA66;
                        n3 += 45544;
                        n3 -= 23800;
                        n3 -= 602;
                        cArray[i3] = (char)(n3 -= 41535);
                    }
                    object5 = X.A()[2] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = X.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub268\ub1fc\ub20e\ub35a\ub1fe\ub269\ub1fe\ub35a\ub1fb\ub1f6\ub1fe\ub20e\ub26c\ub1fb\ub208\ub19f\ub19f\ub1a0\ub215\ub202".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 += 4710;
                    n4 ^= 0x48C7;
                    n4 += 61352;
                    n4 ^= 0x6848;
                    n4 += 23129;
                    n4 += 44985;
                    n4 ^= 0x6709;
                    n4 ^= 0xD38C;
                    n4 -= 62909;
                    n4 -= 54414;
                    cArray[i4] = (char)(n4 += 8190);
                }
                object6 = X.A()[3] = new String(cArray);
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
        X.h[0xF46F ^ 0xF57E] = 0x17C2 ^ 0xF57E;
        X.h[0x3BB9 ^ 0x3B24] = 0x3B25 ^ 0x3B24;
        X.h[0x6D9C ^ 0x6D68] = 0x77E9 ^ 0x6D68;
        X.h[0xA6E5 ^ 0xA6C4] = 0xFFFF595A ^ 0xA6C4;
        X.h[0x8B4C ^ 0x8B13] = 0xFFFF74F0 ^ 0x8B13;
        X.h[0xCADB ^ 0xCB51] = 0xFFFF349E ^ 0xCB51;
        X.h[0xC87A ^ 0xC903] = 0xC90D ^ 0xC903;
        X.h[0x5190 ^ 0x51DA] = 0xFFFFAE46 ^ 0x51DA;
        X.h[0x571E ^ 0x57BD] = 0x94BB ^ 0x57BD;
        X.h[0xDC6A ^ 0xDC66] = 0xFFFF23D6 ^ 0xDC66;
        X.h[0x319 ^ 0x319] = 0xFFFFFCA2 ^ 0x319;
        X.h[0xBD0A ^ 0xBDB9] = 0xB5CF ^ 0xBDB9;
        X.h[0x3C18 ^ 0x3C1C] = 0xFFFFC3E3 ^ 0x3C1C;
        X.h[0xA25 ^ 0xA9C] = 0x8CCC ^ 0xA9C;
        X.h[0x7823 ^ 0x78CE] = 0x4185 ^ 0x78CE;
        X.h[0x5F0D ^ 0x5FF2] = 0xB8B8 ^ 0x5FF2;
        X.h[0x801B ^ 0x80E2] = 0xB77C ^ 0x80E2;
        X.h[0xE387 ^ 0xE38E] = 0xFFFF1C4A ^ 0xE38E;
        X.h[0xDCEC ^ 0xDDF8] = 0x3F5E ^ 0xDDF8;
        X.h[0xA6F6 ^ 0xA6A7] = 0xFFFF5916 ^ 0xA6A7;
        X.h[0x73FC ^ 0x7329] = 0x4D38 ^ 0x7329;
        X.h[0xF375 ^ 0xF200] = 0x9A0D ^ 0xF200;
        X.h[0xED31 ^ 0xED8A] = 0x2CEC ^ 0xED8A;
        X.h[0xD5F2 ^ 0xD54E] = 0xFFFFEB82 ^ 0xD54E;
        X.h[0xF704 ^ 0xF7F9] = 0x10DE ^ 0xF7F9;
        X.h[0xA2E ^ 0xA52] = 0xFFFFF5B7 ^ 0xA52;
        X.h[0x1058 ^ 0x1097] = 0x6DEF ^ 0x1097;
        X.h[0xEE3B ^ 0xEF64] = 0x1E8BC ^ 0xEF64;
        X.h[0xBBC1 ^ 0xBAB3] = 0xC594 ^ 0xBAB3;
        X.h[0x3EE3 ^ 0x3E30] = 0x21 ^ 0x3E30;
        X.h[0x10683 ^ 0x107A1] = 0x116A7 ^ 0x107A1;
        X.h[0x3981 ^ 0x3931] = 0xFFFFDFFD ^ 0x3931;
        X.h[0xB5C ^ 0xB86] = 0x279C ^ 0xB86;
        X.h[0xB25E ^ 0xB22C] = 0xFFFF4DCB ^ 0xB22C;
        X.h[0x504D ^ 0x5156] = 0xFFFFE942 ^ 0x5156;
        X.h[0x1F81 ^ 0x1F50] = 0x6228 ^ 0x1F50;
        X.h[0x37D2 ^ 0x3789] = 0x379A ^ 0x3789;
        X.h[0x2DE0 ^ 0x2D20] = 0xFFFF095C ^ 0x2D20;
        X.h[0xA2C6 ^ 0xA226] = 0xFFFF389C ^ 0xA226;
        X.h[0x8625 ^ 0x86FD] = 0xFFFFFCBC ^ 0x86FD;
        X.h[0xCB5B ^ 0xCBDC] = 0xFFFF346A ^ 0xCBDC;
        X.h[0x7E05 ^ 0x7E7A] = 0xFFFF8133 ^ 0x7E7A;
        X.h[0xB733 ^ 0xB796] = 0x7490 ^ 0xB796;
        X.h[0x3263 ^ 0x3230] = 0x3245 ^ 0x3230;
        X.h[0x8E33 ^ 0x8EC2] = 0x945C ^ 0x8EC2;
        X.h[0xC9DE ^ 0xC894] = 0x5D11 ^ 0xC894;
        X.h[0x3E0D ^ 0x3F38] = 0x2BE2 ^ 0x3F38;
        X.h[0xBB11 ^ 0xBBE7] = 0x6BDA ^ 0xBBE7;
        X.h[0xEEE9 ^ 0xEFE9] = 0x8D6 ^ 0xEFE9;
        X.h[0x15B ^ 0x38] = 0xFFFF7C04 ^ 0x38;
        X.h[0xFC4E ^ 0xFCE0] = 0xE5D6 ^ 0xFCE0;
        X.h[0x10E4 ^ 0x10A4] = 0x8B7B ^ 0x10A4;
        X.h[0xEDAC ^ 0xEC82] = 0x7447 ^ 0xEC82;
        X.h[0x2696 ^ 0x271F] = 0x2716 ^ 0x271F;
        X.h[0xC6ED ^ 0xC7E4] = 0x8996 ^ 0xC7E4;
        X.h[0xC6B9 ^ 0xC6CA] = 0xC63D ^ 0xC6CA;
        X.h[0xC2A7 ^ 0xC252] = 0x126A ^ 0xC252;
        X.h[0x104D7 ^ 0x105B3] = 0x18666 ^ 0x105B3;
        X.h[0x7071 ^ 0x708D] = 0x4708 ^ 0x708D;
        X.h[0xA61A ^ 0xA66E] = 0xFFFF59EA ^ 0xA66E;
        X.h[0x7285 ^ 0x7260] = 0x332E ^ 0x7260;
        X.h[0xA0D0 ^ 0xA1D7] = 0xFFFFF726 ^ 0xA1D7;
        X.h[0x4DF5 ^ 0x4D13] = 0xC5A ^ 0x4D13;
        X.h[0xC0E8 ^ 0xC0B5] = 0xC096 ^ 0xC0B5;
        X.h[0xB3FD ^ 0xB383] = 0xB39C ^ 0xB383;
        X.h[0xF7E4 ^ 0xF6CD] = 0x7A8 ^ 0xF6CD;
        X.h[0xCD53 ^ 0xCD4E] = 0xFFFF32AC ^ 0xCD4E;
        X.h[0x92D3 ^ 0x921A] = 0x5D1B ^ 0x921A;
        X.h[0x70BA ^ 0x7090] = 0x709D ^ 0x7090;
        X.h[0x784A ^ 0x78A5] = 0xFFFFBE47 ^ 0x78A5;
        X.h[0x5D73 ^ 0x5D97] = 0x3D36 ^ 0x5D97;
        X.h[0x2D70 ^ 0x2C5F] = 0xB4F3 ^ 0x2C5F;
        X.h[0x8016 ^ 0x819E] = 0x81EF ^ 0x819E;
        X.h[0x988 ^ 0x902] = 0x978 ^ 0x902;
        X.h[0xDE29 ^ 0xDE8B] = 0x1D8E ^ 0xDE8B;
        X.h[0x6EEA ^ 0x6FAB] = 0x4BA9 ^ 0x6FAB;
        X.h[0x3A18 ^ 0x3A7D] = 0x3A1F ^ 0x3A7D;
        X.h[0x2FB3 ^ 0x2F22] = 0xFFFFD000 ^ 0x2F22;
        X.h[0x3D1F ^ 0x3D70] = 0xFFFFC2D5 ^ 0x3D70;
        X.h[0x8D81 ^ 0x8CFF] = 0xFFFF7320 ^ 0x8CFF;
        X.h[0xF931 ^ 0xF986] = 0x7FD6 ^ 0xF986;
        X.h[0x107A1 ^ 0x10620] = 0x10620 ^ 0x10620;
        X.h[0xA35A ^ 0xA2D5] = 0xA2D0 ^ 0xA2D5;
        X.h[0x86A6 ^ 0x86F0] = 0x86E4 ^ 0x86F0;
        X.h[0xC981 ^ 0xC9A4] = 0xFFFF3609 ^ 0xC9A4;
        X.h[0x3F00 ^ 0x3F0F] = 0x3FB7 ^ 0x3F0F;
        X.h[0x37A6 ^ 0x36B6] = 0x7F8D ^ 0x36B6;
        X.h[0x8E9C ^ 0x8E10] = 0xFFFF71EA ^ 0x8E10;
        X.h[0xBB58 ^ 0xBBF5] = 0x4A94 ^ 0xBBF5;
        X.h[0x10DA ^ 0x105A] = 0x1039 ^ 0x105A;
        X.h[0x15FB ^ 0x149E] = 0x149E ^ 0x149E;
        X.h[0x820F ^ 0x827E] = 0x821F ^ 0x827E;
        X.h[0x6FAF ^ 0x6EC8] = 0x6EC8 ^ 0x6EC8;
        X.h[0xFB78 ^ 0xFB4B] = 0xFB4B ^ 0xFB4B;
        X.h[0x40B0 ^ 0x4034] = 0xFFFFBFC1 ^ 0x4034;
        X.h[0xA7D ^ 0xAF5] = 0xA4B ^ 0xAF5;
        X.h[0xD30E ^ 0xD24D] = 0xF651 ^ 0xD24D;
        X.h[0xC0F4 ^ 0xC08D] = 0xC0AE ^ 0xC08D;
        X.h[0xA423 ^ 0xA4B9] = 0xA4B8 ^ 0xA4B9;
        X.h[0xF4E9 ^ 0xF421] = 0xFFFFC4D3 ^ 0xF421;
        X.h[0xD027 ^ 0xD111] = 0xC5CA ^ 0xD111;
        X.h[0x7DD7 ^ 0x7DDF] = 0x7DCA ^ 0x7DDF;
        X.h[0x7D53 ^ 0x7CD5] = 0xFFFF8327 ^ 0x7CD5;
        X.h[0x64BF ^ 0x6478] = 0xAB79 ^ 0x6478;
        X.h[0x101C ^ 0x1125] = 0xA3AC ^ 0x1125;
        X.h[0x216D ^ 0x21F1] = 0x21F1 ^ 0x21F1;
        X.h[0x5D22 ^ 0x5CAF] = 0x5CA3 ^ 0x5CAF;
        X.h[0x8C66 ^ 0x8C7E] = 0x8C0B ^ 0x8C7E;
        X.h[0x10527 ^ 0x1041B] = 0x1B684 ^ 0x1041B;
        X.h[0x57F6 ^ 0x56EE] = 0x8DEF ^ 0x56EE;
        X.h[0xC271 ^ 0xC301] = 0x717 ^ 0xC301;
        X.h[0x580C ^ 0x5921] = 0xC1EA ^ 0x5921;
        X.h[0xA089 ^ 0xA042] = 0x1540 ^ 0xA042;
        X.h[0x7A0E ^ 0x7A81] = 0x7AA4 ^ 0x7A81;
        X.h[0xB2D7 ^ 0xB251] = 0xFFFF4DEA ^ 0xB251;
        X.h[0x9DE7 ^ 0x9CBF] = 0xD90B ^ 0x9CBF;
        X.h[0xBFD1 ^ 0xBF93] = 0xBF93 ^ 0xBF93;
        X.h[0x5771 ^ 0x57B3] = 0x2D77 ^ 0x57B3;
        X.h[0x609D ^ 0x6093] = 0xFFFF9F1F ^ 0x6093;
        X.h[0xBA39 ^ 0xBBB2] = 0xBBB3 ^ 0xBBB2;
        X.h[0xE38C ^ 0xE2DA] = 0xA76E ^ 0xE2DA;
        X.h[0xED17 ^ 0xED79] = 0xED63 ^ 0xED79;
        X.h[0x9670 ^ 0x9653] = 0xFFFF69D2 ^ 0x9653;
        X.h[0x218A ^ 0x2163] = 0xE8E0 ^ 0x2163;
        X.h[0x2064 ^ 0x2131] = 0x648C ^ 0x2131;
        X.h[0x460E ^ 0x4763] = 0xB081 ^ 0x4763;
        X.h[0xE9A8 ^ 0xE9B2] = 0xE9A7 ^ 0xE9B2;
        X.h[0x20AF ^ 0x2037] = 0xFFFFDFEB ^ 0x2037;
        X.h[0xFFCE ^ 0xFF17] = 0x7ADB ^ 0xFF17;
        X.h[0x63F7 ^ 0x63A9] = 0x63E3 ^ 0x63A9;
        X.h[0x70EA ^ 0x7086] = 0x70D9 ^ 0x7086;
        X.h[0x27C1 ^ 0x26B2] = 0x1F75 ^ 0x26B2;
        X.h[0xEC6A ^ 0xECBC] = 0x6970 ^ 0xECBC;
        X.h[0x2C38 ^ 0x2D2F] = 0xF650 ^ 0x2D2F;
        X.h[0x10E5E ^ 0x10E9B] = 0x17453 ^ 0x10E9B;
        X.h[0xC397 ^ 0xC2D7] = 0x742A ^ 0xC2D7;
        X.h[0xBAA0 ^ 0xBBAF] = 0xFFFF0D47 ^ 0xBBAF;
        X.h[0x422C ^ 0x43AE] = 0x43E7 ^ 0x43AE;
        X.h[0xFAD5 ^ 0xFBBD] = 0xFBBC ^ 0xFBBD;
        X.h[0xBFD5 ^ 0xBECB] = 0x6A0C ^ 0xBECB;
        X.h[0x7AF3 ^ 0x7BE1] = 0x9947 ^ 0x7BE1;
        X.h[0x10C6C ^ 0x10CB2] = 0x169E9 ^ 0x10CB2;
        X.h[0x106CC ^ 0x106D8] = 0x106DF ^ 0x106D8;
        X.h[0xF95C ^ 0xF96A] = 0x25EE ^ 0xF96A;
        X.h[0x29C3 ^ 0x298D] = 0xFFFFD63F ^ 0x298D;
        X.h[0x42CD ^ 0x4388] = 0x4B7F ^ 0x4388;
        X.h[0xF75C ^ 0xF7D1] = 0xFFFF0870 ^ 0xF7D1;
        X.h[0x57B ^ 0x464] = 0xFFFF2F4A ^ 0x464;
        X.h[0x10B9C ^ 0x10B82] = 0xFFFEF447 ^ 0x10B82;
        X.h[0xD34C ^ 0xD208] = 0xF606 ^ 0xD208;
        X.h[0x7EC9 ^ 0x7E7F] = 0xF829 ^ 0x7E7F;
        X.h[0x5B09 ^ 0x5A4F] = 0x52BE ^ 0x5A4F;
        X.h[0x302 ^ 0x387] = 0x385 ^ 0x387;
        X.h[0xB2D8 ^ 0xB2FE] = 0xFFFF4D35 ^ 0xB2FE;
        X.h[0x20E5 ^ 0x20CD] = 0x2085 ^ 0x20CD;
        X.h[0xD850 ^ 0xD82A] = 0xFFFF27E5 ^ 0xD82A;
        X.h[0x4808 ^ 0x4929] = 0x582D ^ 0x4929;
        X.h[0x8E83 ^ 0x8E15] = 0x8E0E ^ 0x8E15;
        X.h[0x2DD7 ^ 0x2CDA] = 0x65EB ^ 0x2CDA;
        X.h[0xAB25 ^ 0xAA5E] = 0xAA5A ^ 0xAA5E;
        X.h[0x6312 ^ 0x63A6] = 0x6BE4 ^ 0x63A6;
        X.h[0xCDF9 ^ 0xCCDA] = 0xDDA0 ^ 0xCCDA;
        X.h[0x10662 ^ 0x10674] = 0x10632 ^ 0x10674;
        X.h[0x858D ^ 0x8547] = 0x304A ^ 0x8547;
        X.h[0xE9C0 ^ 0xE88B] = 0x7D13 ^ 0xE88B;
        X.h[0x4FA2 ^ 0x4F79] = 0x6368 ^ 0x4F79;
        X.h[0x407A ^ 0x40ED] = 0x40C6 ^ 0x40ED;
        X.h[0x1324 ^ 0x133D] = 0x137D ^ 0x133D;
        X.h[0xD846 ^ 0xD845] = 0xD878 ^ 0xD845;
        X.h[0x5285 ^ 0x5225] = 0xF218 ^ 0x5225;
        X.h[0xE5C2 ^ 0xE59E] = 0xE5CE ^ 0xE59E;
        X.h[0x8420 ^ 0x84F4] = 0xBAB7 ^ 0x84F4;
        X.h[0x1E80 ^ 0x1F88] = 0xB6A2 ^ 0x1F88;
        X.h[0x10421 ^ 0x1042B] = 0xFFFEFBC4 ^ 0x1042B;
        X.h[0xE969 ^ 0xE9BE] = 0x6C72 ^ 0xE9BE;
        X.h[0xDD7A ^ 0xDD96] = 0x1405 ^ 0xDD96;
        X.h[0xCC5E ^ 0xCD26] = 0xCD36 ^ 0xCD26;
        X.h[0x458E ^ 0x44A4] = 0xB5DC ^ 0x44A4;
        X.h[0xAC48 ^ 0xAC71] = 0x8CA1 ^ 0xAC71;
        X.h[0x989B ^ 0x98F3] = 0xFFFF677C ^ 0x98F3;
        X.h[0xE551 ^ 0xE40D] = 0x1EECD ^ 0xE40D;
        X.h[0x6DBF ^ 0x6D18] = 0x84CF ^ 0x6D18;
        X.h[0x7C55 ^ 0x7C16] = 0x7C15 ^ 0x7C16;
        X.h[0xDFFB ^ 0xDF18] = 0xBF99 ^ 0xDF18;
        X.h[0x10422 ^ 0x1054C] = 0x1B87F ^ 0x1054C;
        X.h[0x5EE1 ^ 0x5EC3] = 0x5EDF ^ 0x5EC3;
        X.h[0x333D ^ 0x330C] = 0x330E ^ 0x330C;
        X.h[0x10749 ^ 0x107F4] = 0x1C692 ^ 0x107F4;
        X.h[0x9D27 ^ 0x9C6E] = 0x9FC ^ 0x9C6E;
        X.h[0x9724 ^ 0x9761] = 0x976D ^ 0x9761;
        X.h[0x9F6C ^ 0x9E37] = 0xFFFE6B60 ^ 0x9E37;
        X.h[0xF7DF ^ 0xF71B] = 0x8D9B ^ 0xF71B;
        X.h[0xB07B ^ 0xB15D] = 0x8543 ^ 0xB15D;
        X.h[0xDED8 ^ 0xDFE2] = 0x6D7D ^ 0xDFE2;
        X.h[0x8B74 ^ 0x8B50] = 0x8B4E ^ 0x8B50;
        X.h[0x8474 ^ 0x8575] = 0x5A25 ^ 0x8575;
        X.h[0x72C9 ^ 0x73CD] = 0xAC83 ^ 0x73CD;
        X.h[0x1F82 ^ 0x1F6A] = 0x5E23 ^ 0x1F6A;
        X.h[0xAD4E ^ 0xAC1C] = 0xD0AC ^ 0xAC1C;
        X.h[0x99F7 ^ 0x9870] = 0x987D ^ 0x9870;
        X.h[0xEAF5 ^ 0xEA5C] = 0x38B ^ 0xEA5C;
        X.h[0x8057 ^ 0x80F6] = 0x20DB ^ 0x80F6;
        X.h[0x26E5 ^ 0x26A8] = 0x26DB ^ 0x26A8;
        X.h[0x109A5 ^ 0x109C5] = 0xFFFEF636 ^ 0x109C5;
        X.h[0x32B9 ^ 0x32D0] = 0xFFFFCD4A ^ 0x32D0;
        X.h[0x8DAD ^ 0x8CC6] = 0x11E7 ^ 0x8CC6;
        X.h[0x34B1 ^ 0x348C] = 0x1F3B ^ 0x348C;
        X.h[0xB923 ^ 0xB9E2] = 0x6242 ^ 0xB9E2;
        X.h[0x4C8B ^ 0x4CDC] = 0xFFFFB34F ^ 0x4CDC;
        X.h[0x1836 ^ 0x18E9] = 0x7DB0 ^ 0x18E9;
        X.h[0x10EC4 ^ 0x10EF4] = 0x10EF4 ^ 0x10EF4;
        X.h[0x75DF ^ 0x75A7] = 0x7580 ^ 0x75A7;
        X.h[0x6869 ^ 0x6833] = 0xFFFF97E6 ^ 0x6833;
        X.h[0xCB1 ^ 0xDA7] = 0xD6A6 ^ 0xDA7;
        X.h[0x99F0 ^ 0x98CF] = 0xFFFFD1BE ^ 0x98CF;
        X.h[0x5253 ^ 0x5239] = 0x5208 ^ 0x5239;
        X.h[0xB3CC ^ 0xB284] = 0xBA75 ^ 0xB284;
        X.h[0x8AE9 ^ 0x8AD6] = 0xEC0B ^ 0x8AD6;
        X.h[0xBE98 ^ 0xBE6B] = 0xA4D2 ^ 0xBE6B;
        X.h[0x4BC3 ^ 0x4A4D] = 0x4A42 ^ 0x4A4D;
        X.h[0x9528 ^ 0x9465] = 0xAF2B ^ 0x9465;
        X.h[0xECFE ^ 0xECEB] = 0xECB5 ^ 0xECEB;
        X.h[0xB476 ^ 0xB5FA] = 0xB5AB ^ 0xB5FA;
        X.h[0x1D5D ^ 0x1C34] = 0x1C34 ^ 0x1C34;
        X.h[0xF289 ^ 0xF3B8] = 0x3A10 ^ 0xF3B8;
        X.h[0xE178 ^ 0xE01E] = 0xE01E ^ 0xE01E;
        X.h[0x14D8 ^ 0x15A9] = 0xD42F ^ 0x15A9;
        X.h[0x9D98 ^ 0x9D83] = 0x9DD6 ^ 0x9D83;
        X.h[0xE46B ^ 0xE4AD] = 0x2BAB ^ 0xE4AD;
        X.h[0x78FE ^ 0x7846] = 0xFE23 ^ 0x7846;
        X.h[0xF3CF ^ 0xF354] = 0xF356 ^ 0xF354;
        X.h[0x2A35 ^ 0x2A79] = 0xFFFFD5B9 ^ 0x2A79;
        X.h[0x94E0 ^ 0x947F] = 0x947F ^ 0x947F;
        X.h[0xAA68 ^ 0xAB4F] = 0xFFFF608B ^ 0xAB4F;
        X.h[0x3A86 ^ 0x3A0D] = 0x3A53 ^ 0x3A0D;
        X.h[0x52AA ^ 0x52E1] = 0x52AA ^ 0x52E1;
        X.h[0xE723 ^ 0xE734] = 0xE73C ^ 0xE734;
        X.h[0x2448 ^ 0x2506] = 0x1E4C ^ 0x2506;
        X.h[0x8F28 ^ 0x8F07] = 0x8F06 ^ 0x8F07;
        X.h[0x80CE ^ 0x81E6] = 0xB5F8 ^ 0x81E6;
        X.h[0xBB00 ^ 0xBB81] = 0xFFFF442D ^ 0xBB81;
        X.h[0xB8F1 ^ 0xB864] = 0xB81C ^ 0xB864;
        X.h[0x2246 ^ 0x221E] = 0xFFFFDDB1 ^ 0x221E;
        X.h[0x63DE ^ 0x6326] = 0xB31B ^ 0x6326;
        X.h[0x37A9 ^ 0x37DC] = 0x3787 ^ 0x37DC;
        X.h[0xD839 ^ 0xD826] = 0xD871 ^ 0xD826;
        X.h[0x2F6D ^ 0x2E12] = 0x2E14 ^ 0x2E12;
        X.h[0xE2F7 ^ 0xE253] = 0xFFFFDEF5 ^ 0xE253;
        X.h[0x4052 ^ 0x4057] = 0xFFFFBF9F ^ 0x4057;
        X.h[0x57AD ^ 0x57DB] = 0x5743 ^ 0x57DB;
        X.h[0xB9D7 ^ 0xB8B8] = 0xF3AD ^ 0xB8B8;
        X.h[0x1084E ^ 0x10875] = 0x15C06 ^ 0x10875;
        X.h[0x83B1 ^ 0x8232] = 0x8239 ^ 0x8232;
        X.h[0x10EBF ^ 0x10E2C] = 0xFFFEF18C ^ 0x10E2C;
        X.h[0x58A7 ^ 0x59AC] = 0xFFFFE83B ^ 0x59AC;
        X.h[0x84CA ^ 0x8585] = 0xBE88 ^ 0x8585;
        X.h[0x151E ^ 0x15F0] = 0x2CA9 ^ 0x15F0;
        X.h[0x19FA ^ 0x198A] = 0x19E2 ^ 0x198A;
        X.h[0xC7DF ^ 0xC725] = 0xF0A0 ^ 0xC725;
        X.h[0xBD9C ^ 0xBC9A] = 0x15B0 ^ 0xBC9A;
        X.h[0xECC ^ 0xFCE] = 0xD080 ^ 0xFCE;
        X.h[0xD822 ^ 0xD931] = 0xFFFFC404 ^ 0xD931;
        X.h[0x1E20 ^ 0x1E68] = 0x1E40 ^ 0x1E68;
        X.h[0xD22C ^ 0xD2B5] = 0xD2FA ^ 0xD2B5;
        X.h[0x5C24 ^ 0x5D79] = 0x15AC7 ^ 0x5D79;
        X.h[0x1CB6 ^ 0x1DBC] = 0x53D2 ^ 0x1DBC;
        X.h[0x14CC ^ 0x143E] = 0xEBF ^ 0x143E;
        X.h[0x52B6 ^ 0x53C2] = 0x747F ^ 0x53C2;
        X.h[0x39B7 ^ 0x391F] = 0xD0EC ^ 0x391F;
        X.h[0x3342 ^ 0x3312] = 0x330E ^ 0x3312;
        X.h[0xD519 ^ 0xD5AC] = 0xDDDA ^ 0xD5AC;
        X.h[0xBAA7 ^ 0xBA77] = 0xC73C ^ 0xBA77;
        X.h[0x4E22 ^ 0x4F72] = 0x7438 ^ 0x4F72;
        X.h[0xD7AF ^ 0xD7CD] = 0xFFFF2860 ^ 0xD7CD;
        X.h[0x59F0 ^ 0x59A5] = 0xFFFFA625 ^ 0x59A5;
        X.h[0x10B4F ^ 0x10A2F] = 0xD85 ^ 0x10A2F;
        X.h[0x3866 ^ 0x3891] = 0xE880 ^ 0x3891;
        X.h[0x89EE ^ 0x8905] = 0x40C1 ^ 0x8905;
        X.h[0x10DDC ^ 0x10DF1] = 0x10DF2 ^ 0x10DF1;
        X.h[0xD5BC ^ 0xD497] = 0x2592 ^ 0xD497;
        X.h[0xFA51 ^ 0xFB66] = 0xFFFF101E ^ 0xFB66;
        X.h[0xB2F4 ^ 0xB2B2] = 0xB2F4 ^ 0xB2B2;
        X.h[0xE45E ^ 0xE543] = 0x3187 ^ 0xE543;
        X.h[0x83A8 ^ 0x829B] = 0xFFFFB4D5 ^ 0x829B;
        X.h[0x7AF1 ^ 0x7A2D] = 0x5677 ^ 0x7A2D;
        X.h[0xC787 ^ 0xC7E1] = 0xFFFF3805 ^ 0xC7E1;
        X.h[0xF38C ^ 0xF2CB] = 0xFA10 ^ 0xF2CB;
        X.h[0x8A8F ^ 0x8B8A] = 0x22B9 ^ 0x8B8A;
        X.h[0x9200 ^ 0x9249] = 0x9286 ^ 0x9249;
        X.h[0x1A42 ^ 0x1A10] = 0x1A39 ^ 0x1A10;
        X.h[0x463D ^ 0x464A] = 0x461B ^ 0x464A;
        X.h[0x9BA3 ^ 0x9B8D] = 0x9B8D ^ 0x9B8D;
        X.h[0x1050B ^ 0x1048E] = 0x1048D ^ 0x1048E;
        X.h[0x72A2 ^ 0x7232] = 0xFFFF8DE7 ^ 0x7232;
        X.h[0x2CDB ^ 0x2C55] = 0xFFFFD3AD ^ 0x2C55;
        X.h[0xAC4A ^ 0xAC87] = 0x1985 ^ 0xAC87;
        X.h[0xACA4 ^ 0xAC08] = 0x5D1F ^ 0xAC08;
        X.h[0xD1B4 ^ 0xD094] = 0x453 ^ 0xD094;
        X.h[0x5E4B ^ 0x5E60] = 0xFFFFA1CC ^ 0x5E60;
        X.h[0x8A10 ^ 0x8AA1] = 0x9393 ^ 0x8AA1;
        X.h[0x9D66 ^ 0x9C7C] = 0xDBC6 ^ 0x9C7C;
        X.h[0x4D0C ^ 0x4C7B] = 0x4C7A ^ 0x4C7B;
        X.h[0xE197 ^ 0xE09B] = 0xAEF5 ^ 0xE09B;
        X.h[0x9B2C ^ 0x9B12] = 0x876A ^ 0x9B12;
        X.h[0x5DF7 ^ 0x5DAE] = 0xFFFFA214 ^ 0x5DAE;
        X.h[0x334E ^ 0x33A9] = 0x72D7 ^ 0x33A9;
        X.h[0x76F2 ^ 0x76D5] = 0x76DC ^ 0x76D5;
        X.h[0x4D60 ^ 0x4DE3] = 0x4DC0 ^ 0x4DE3;
        X.h[0xD0AC ^ 0xD090] = 0x1AE4 ^ 0xD090;
        X.h[0xA981 ^ 0xA9A8] = 0xA9F3 ^ 0xA9A8;
        X.h[0xC431 ^ 0xC56B] = 0x1CFAB ^ 0xC56B;
        X.h[0xAC0A ^ 0xAD77] = 0xAD7D ^ 0xAD77;
        X.h[0xCFB8 ^ 0xCFD5] = 0xFFFF300A ^ 0xCFD5;
        X.h[0x78D6 ^ 0x7868] = 0xA3C6 ^ 0x7868;
        X.h[0xAD4A ^ 0xAC08] = 0x8806 ^ 0xAC08;
        X.h[0x3E7B ^ 0x3F62] = 0x78D0 ^ 0x3F62;
        X.h[0xF7CC ^ 0xF69F] = 0xFFFF75C7 ^ 0xF69F;
        X.h[0xC6B5 ^ 0xC787] = 0xE20 ^ 0xC787;
        X.h[0x81EB ^ 0x8101] = 0x4892 ^ 0x8101;
        X.h[0xFC1E ^ 0xFCB4] = 0xDDD ^ 0xFCB4;
        X.h[0x81B7 ^ 0x81B1] = 0x818E ^ 0x81B1;
        X.h[0x711D ^ 0x71A2] = 0xAA02 ^ 0x71A2;
        X.h[0xC73A ^ 0xC6BE] = 0xC6EF ^ 0xC6BE;
        X.h[0xD2C5 ^ 0xD2A4] = 0xD233 ^ 0xD2A4;
        X.h[0x4A90 ^ 0x4A02] = 0xFFFFB583 ^ 0x4A02;
        X.h[0xD4E2 ^ 0xD419] = 0xE3AB ^ 0xD419;
        X.h[0x766C ^ 0x7611] = 0x7652 ^ 0x7611;
        X.h[0xF194 ^ 0xF1D3] = 0xFFFF0E6D ^ 0xF1D3;
        X.h[0xFD02 ^ 0xFD36] = 0xFC76 ^ 0xFD36;
        X.h[0xE090 ^ 0xE1EC] = 0xFFFF1E40 ^ 0xE1EC;
        X.h[0x17EA ^ 0x17DD] = 0xA893 ^ 0x17DD;
        X.h[0x43 ^ 0xB3] = 0x39EA ^ 0xB3;
        X.h[0x5CAE ^ 0x5C94] = 0xFCA6 ^ 0x5C94;
        X.h[0xF706 ^ 0xF622] = 0xE724 ^ 0xF622;
        X.h[0x10DE9 ^ 0x10D5B] = 0x10524 ^ 0x10D5B;
        X.h[0xBC56 ^ 0xBD02] = 0xC1B2 ^ 0xBD02;
        X.h[0x637C ^ 0x637E] = 0x6307 ^ 0x637E;
        X.h[0x1884 ^ 0x19BF] = 0xAB71 ^ 0x19BF;
        X.h[0x671E ^ 0x675F] = 0xA60 ^ 0x675F;
        X.h[0xD791 ^ 0xD6F0] = 0x5530 ^ 0xD6F0;
        X.h[0xD8C2 ^ 0xD8D0] = 0xD84C ^ 0xD8D0;
        X.h[0xB9BE ^ 0xB8C8] = 0xD777 ^ 0xB8C8;
        X.h[0x49B8 ^ 0x495A] = 0x495A ^ 0x495A;
        X.h[0x876D ^ 0x866E] = 0xFFFFA6E3 ^ 0x866E;
        X.h[0x87B4 ^ 0x86E3] = 0xC300 ^ 0x86E3;
        X.h[0x8F89 ^ 0x8FB1] = 0xE2BF ^ 0x8FB1;
        X.h[0x482A ^ 0x48F8] = 0x76E8 ^ 0x48F8;
        X.h[0x5AB7 ^ 0x5BFB] = 0xCE7E ^ 0x5BFB;
        X.h[0x10A02 ^ 0x10A56] = 0xFFFEF592 ^ 0x10A56;
        X.h[0x1ADF ^ 0x1AD4] = 0x1AFE ^ 0x1AD4;
        X.h[0x7D8D ^ 0x7CA8] = 0x48BD ^ 0x7CA8;
        X.h[0x404B ^ 0x4046] = 0xFFFFBF9B ^ 0x4046;
        X.h[0xE8EA ^ 0xE8DF] = 0x2E9C ^ 0xE8DF;
        X.h[0xF26B ^ 0xF24B] = 0xFFFF0DDA ^ 0xF24B;
        X.h[0xBFFE ^ 0xBF32] = 0xFFFFF5CA ^ 0xBF32;
        X.h[0x5AF7 ^ 0x5AB3] = 0x5AA4 ^ 0x5AB3;
        X.h[0xC16E ^ 0xC050] = 0x76AD ^ 0xC050;
        X.h[0x9BB4 ^ 0x9BD0] = 0x9BF6 ^ 0x9BD0;
        X.h[0x9AFF ^ 0x9AEF] = 0xFFFF6561 ^ 0x9AEF;
        X.h[0x1058F ^ 0x10520] = 0x11C12 ^ 0x10520;
        X.h[0x242C ^ 0x2514] = 0x31CF ^ 0x2514;
        X.h[0x1CC3 ^ 0x1CC4] = 0xFFFFE319 ^ 0x1CC4;
        X.h[0x74BC ^ 0x74AF] = 0xFFFF8B24 ^ 0x74AF;
        X.h[0xCEE ^ 0xC0F] = 0x6956 ^ 0xC0F;
        X.h[0xF988 ^ 0xF989] = 0xFFFF064F ^ 0xF989;
        X.h[0x7289 ^ 0x73F3] = 0x73FB ^ 0x73F3;
        X.h[0x8EA7 ^ 0x8FBB] = 0xC801 ^ 0x8FBB;
        X.h[0x7500 ^ 0x7415] = 0xAF14 ^ 0x7415;
        X.h[0x1E40 ^ 0x1EBE] = 0xF981 ^ 0x1EBE;
        X.h[0x10079 ^ 0x1004B] = 0x1004B ^ 0x1004B;
        X.h[0xEFE0 ^ 0xEE8A] = 0xEE98 ^ 0xEE8A;
        X.h[0x22EE ^ 0x23D3] = 0x953D ^ 0x23D3;
        X.h[0x9B9E ^ 0x9AFC] = 0x1929 ^ 0x9AFC;
        X.h[0xA05 ^ 0xABF] = 0xCBD4 ^ 0xABF;
        X.h[0x3B3A ^ 0x3BA4] = 0x3BA5 ^ 0x3BA4;
        X.h[0x104CE ^ 0x104E2] = 0xFFFEFB7B ^ 0x104E2;
        X.h[0xCD04 ^ 0xCC34] = 0x54F1 ^ 0xCC34;
        X.h[0xF48 ^ 0xFC1] = 0xF85 ^ 0xFC1;
        X.h[0x8F93 ^ 0x8F4E] = 0xA35F ^ 0x8F4E;
        X.h[0x105C2 ^ 0x105A1] = 0x10595 ^ 0x105A1;
        X.h[0xAC68 ^ 0xAC79] = 0xFFFF53A3 ^ 0xAC79;
        X.h[0xA271 ^ 0xA23E] = 0xFFFF5D93 ^ 0xA23E;
        X.h[0x10A3A ^ 0x10A41] = 0xFFFEF58D ^ 0x10A41;
        X.h[0x10C1B ^ 0x10C99] = 0xFFFEF34E ^ 0x10C99;
        X.h[0x4D0B ^ 0x4C67] = 0xE3A6 ^ 0x4C67;
        X.h[0x7000 ^ 0x70A6] = 0x997B ^ 0x70A6;
        X.h[0xD567 ^ 0xD50C] = 0xD542 ^ 0xD50C;
        X.h[0x917C ^ 0x9160] = 0xFFFF6EEE ^ 0x9160;
        X.h[0x596E ^ 0x59A0] = 0x24DD ^ 0x59A0;
        X.h[0xF56F ^ 0xF461] = 0xBD5A ^ 0xF461;
        X.h[0x24CF ^ 0x24A8] = 0x249D ^ 0x24A8;
        X.h[0x1049A ^ 0x105CB] = 0x1796A ^ 0x105CB;
        X.h[0xE3D4 ^ 0xE2E0] = 0x2B47 ^ 0xE2E0;
        X.h[0xA22E ^ 0xA2ED] = 0xD825 ^ 0xA2ED;
        X.h[0x5FAD ^ 0x5F39] = 0xFFFFA056 ^ 0x5F39;
        X.h[0x929C ^ 0x931C] = 0x9348 ^ 0x931C;
        X.h[0x10900 ^ 0x10859] = 0x294 ^ 0x10859;
        X.h[0xEE19 ^ 0xEF35] = 0x1E4D ^ 0xEF35;
        X.h[0x1B7C ^ 0x1BD7] = 0xEAB6 ^ 0x1BD7;
        X.h[0xBEB3 ^ 0xBFED] = 0x1B847 ^ 0xBFED;
    }
}

