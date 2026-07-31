/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_746
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.Rain;
import kotakbaz.rain.client.extensions.b_0;
import kotakbaz.rain.event.events.D;
import kotakbaz.rain.mixin.MinecraftClientAccessor;
import kotakbaz.rain.mixin.MinecraftClientInvoker;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.setting.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_310;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a"}, d2={"Lkotakbaz/rain/module/modules/player/TapeMouseModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "shouldClickNow", "()Z", "Lkotakbaz/rain/module/setting/ModeSetting;", "button", "Lkotakbaz/rain/module/setting/ModeSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "delay", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "", "BUTTON_LEFT", "I", "BUTTON_RIGHT", "", "lastActionAt", "J", "rain-visuals"})
public final class B
extends a_0 {
    @NotNull
    public static final B INSTANCE;
    @NotNull
    private static final c a;
    @NotNull
    private static final kotakbaz.rain.module.setting.settings.a_0 A;
    private static final int b = 0;
    private static final int B = 1;
    private static long c;
    private static Object[] C;
    private static Object D;
    private static Object[] e;
    private static Object[] d;
    private static Object[] E;
    public static int[] f;

    private B() {
        int n = f[0];
        n += f[1];
        int n2 = f[3];
        n2 -= f[4];
        int n3 = f[6];
        n3 += f[7];
        super((String)C[n += f[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)C[n2 -= f[5]] + (String)C[n3 += f[8]]);
    }

    @Override
    public void onEnable() {
        c = 0L;
    }

    @Commando
    public final void onUpdate(@NotNull D d2) {
        int n = f[9];
        n += f[10];
        Intrinsics.checkNotNullParameter(d2, (String)C[n ^= f[11]]);
        if (!this.shouldClickNow()) {
            return;
        }
        long l = System.currentTimeMillis();
        if (l - c < (long)((Number)A.getValue()).floatValue()) {
            return;
        }
        class_310 class_3102 = b_0.getMc();
        int n2 = f[12];
        n2 += f[13];
        int n3 = f[15];
        n3 ^= f[16];
        Intrinsics.checkNotNull(class_3102, (String)C[n2 -= f[14]] + (String)C[n3 ^= f[17]]);
        MinecraftClientInvoker minecraftClientInvoker = (MinecraftClientInvoker)class_3102;
        switch (a.getSelectedIndex()) {
            case 1: {
                int n4;
                if (((MinecraftClientAccessor)class_3102).rain$getItemUseCooldown() != 0) {
                    return;
                }
                class_746 class_7462 = class_3102.field_1724;
                if (class_7462 != null) {
                    int n5 = f[18];
                    n5 += f[19];
                    if (class_7462.method_6115() == (n5 -= f[20])) {
                        int n6 = f[21];
                        n6 ^= f[22];
                        n4 = n6 ^= f[23];
                    } else {
                        int n7 = f[24];
                        n7 -= f[25];
                        n4 = n7 += f[26];
                    }
                } else {
                    int n8 = f[27];
                    n8 -= f[28];
                    n4 = n8 ^= f[29];
                }
                if (n4 != 0) {
                    return;
                }
                minecraftClientInvoker.rain$doItemUse();
                c = l;
                break;
            }
            case 0: {
                minecraftClientInvoker.rain$doAttack();
                c = l;
                break;
            }
        }
    }

    private final boolean shouldClickNow() {
        if (!this.isEnabled()) {
            boolean bl = f[30];
            bl -= f[31];
            return bl ^= f[32];
        }
        if (kotakbaz.rain.module.modules.player.a_0.INSTANCE.isActiveEating()) {
            boolean bl = f[33];
            bl -= f[34];
            return bl += f[35];
        }
        if (Rain.INSTANCE.getCustomScreen() != null) {
            boolean bl = f[36];
            bl ^= f[37];
            return bl ^= f[38];
        }
        if (b_0.getMc().field_1724 == null || b_0.getMc().field_1687 == null || b_0.getMc().field_1761 == null) {
            boolean bl = f[39];
            bl -= f[40];
            return bl ^= f[41];
        }
        if (b_0.getMc().field_1755 != null) {
            boolean bl = f[42];
            bl -= f[43];
            return bl += f[44];
        }
        return b_0.getMc().field_1729.method_1613();
    }

    static {
        kotakbaz.rain.module.modules.player.B.b();
        long l = 8315277336805279357L;
        long l2 = -5702647681956332008L;
        long l3 = -7388490138720690825L;
        long l4 = -1042365428487883820L;
        long l5 = -4954766769147204978L;
        long l6 = -3601875158898906488L;
        long l7 = 1847352033878375877L;
        long l8 = 4173448645415803738L;
        long l9 = 4696095533775277803L;
        long l10 = 7600283445364884046L;
        long l11 = 7862179440466700046L;
        long l12 = 7916212458058671835L;
        long l13 = -4706069704206488271L;
        long l14 = 8136065155605895611L;
        int n = f[45];
        n ^= f[46];
        C = new Object[n -= f[47]];
        long l15 = l14;
        int n2 = f[48];
        n2 += f[49];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= f[50]);
        Object[] objectArray = new Object[f[51]];
        objectArray[kotakbaz.rain.module.modules.player.B.f[52]] = d;
        objectArray[kotakbaz.rain.module.modules.player.B.f[53]] = f[54];
        int n3 = f[55];
        Object object = kotakbaz.rain.module.modules.player.B.A()[f[56]];
        if (object == null) {
            char[] cArray = "\u2e2b\u2e26\u0668\u4a32\u06c7\u065f\u067b\u21ed\u067b\u06ca\u0669\u06c0\u065d\u0667\u4a32\u4a2c\u2e26\u21f0\u067b\u0668\u2e2b\u068c\u21ef\u4a32\u068f\u2e26\u4a32\u068c\u06ca\u21ed\u4d89\u06bc\u21f1\u066a\u068f\u06bc\u2e2b\u21ee\u4a2f\u0693\u068d\u2e26\u065e\u21f2\u06c5\u0668\u06c5\u067b\u066a\u0692\u06c7\u0691\u0694\u0663\u06cb\u06c2\u066a\u06c8\u21f1\u21ee\u4a34\u066a\u21ed\u06c0\u0693\u0690\u06c5\u4a34\u0660\u4a2e\u4a30\u21ec\u06c4\u068e\u06bd\u06c8\u4a2c\u4a2c\u06bf\u21ee\u06c1\u06c2\u2e2b\u0690\u4a32\u4a2d\u065f\u06cb\u4a33\u0690\u06c6\u2e2b\u06bd\u0666\u4a2e\u0694\u06cb\u21f1\u06bd\u06c7\u21ef\u2e49\u21f4\u21f2\u06c0\u4a30\u065e\u067b\u06be\u06c6\u0694\u06cb\u06c1\u21f4\u21ed\u066a\u069b\u06be\u06c5\u21ed\u069b\u067b\u066a\u0666\u0662\u06bf\u06c8\u21f1\u06c2\u06c4\u0666\u0666\u0663\u06bd\u2e2b\u0661\u06c0\u0667\u067b\u06c4\u06bc\u065e\u2e2b\u06c7\u4a33\u21f4\u0669\u4a34\u069b\u4a34\u4a33\u068f\u067b\u069b\u21f1\u4a2d\u0694\u06c4\u06c0\u21ee\u4a2f\u069b\u2e2a\u2e26\u06c4\u0665\u21ee\u0669\u2e2a\u06c6\u065f\u065f\u06cb\u0692\u4a2d\u06bd\u4a31\u065e\u0660\u4a33\u066a\u21ec\u06c0\u06c8\u06c2\u066a\u065e\u068e\u065d\u4a32\u065f\u4a33\u4a31\u06c0\u06c1\u065c\u2e2b\u0666\u0664\u0662\u0661\u21f1\u06ca\u4a32\u21ee\u2e2a\u069b\u06c4\u4a30\u065e\u068f\u06bd\u06c8\u2e49\u065c\u06bf\u21f0\u06bd\u06c4\u06cb\u0665\u06c4\u0693\u0692\u4a2c\u0691\u0690\u2e26\u06c5\u068d\u066a\u06ca\u065c\u06c1\u4a30\u06c8\u4a2c\u0664\u06c2\u0664\u2e2b\u21f0\u2e2a\u0668\u065d\u0662\u4a2f\u06bc\u0661\u065e\u0667\u4a2c\u066a\u065f\u066b\u4a2e\u069b\u0666\u0669\u0692\u0665\u4a34\u4a2c\u4a31\u2e2b\u4a2d\u4a2f\u21f1\u06c6\u0667\u21f1\u0661\u06c5\u06c3\u065c\u21f1\u06c8\u21ec\u4a2d\u0664\u0667\u21ee\u0668\u0662\u0691\u065c\u2e26\u06c7\u4a2f\u21f1\u21f2\u06c5\u4a31\u066b\u21ef\u06bf\u069b\u0663\u068c\u21f8".toCharArray();
            for (int i2 = f[57]; i2 < f[58]; ++i2) {
                int n4 = cArray[i2];
                n4 ^= f[59];
                n4 += f[60];
                n4 ^= f[61];
                n4 ^= f[62];
                n4 += f[63];
                n4 ^= f[64];
                n4 -= f[65];
                n4 += f[66];
                n4 += f[67];
                n4 += f[68];
                n4 ^= f[69];
                n4 += f[70];
                cArray[i2] = (char)(n4 -= f[71]);
            }
            object = kotakbaz.rain.module.modules.player.B.A()[kotakbaz.rain.module.modules.player.B.f[72]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.module.modules.player.B.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = f[73];
        n5 += f[74];
        l5 = l16 ^ (0xA600000000L ^ l16) & -1L << (n5 ^= f[75]);
        long l17 = l12;
        int n6 = f[76];
        n6 ^= f[77];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= f[78]);
        while (true) {
            int n7 = f[79];
            n7 ^= f[80];
            if ((int)l12 >= (int)(l5 >>> (n7 += f[81]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = f[82];
            n9 ^= f[83];
            int n10 = f[85];
            n10 += f[86];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= f[84])) & -1L >>> (n10 += f[87]);
            long l19 = l8;
            int n11 = f[88];
            n11 ^= f[89];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= f[90]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = f[91];
            n13 -= f[92];
            int n14 = f[94];
            n14 += f[95];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= f[93])) & -1L >>> (n14 -= f[96]);
            int n15 = f[97];
            n15 ^= f[98];
            long l21 = l9;
            int n16 = f[100];
            n16 -= f[101];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += f[99]) ^ l21) & -1L << (n16 -= f[102]);
            int n17 = f[103];
            n17 -= f[104];
            n17 ^= f[105];
            int n18 = f[106];
            n18 += f[107];
            long l22 = l11;
            int n19 = f[109];
            n19 += f[110];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += f[108]))) ^ l22) & -1L >>> (n19 -= f[111]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = f[112];
            n20 ^= f[113];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= f[114]);
            while (true) {
                int n21 = f[115];
                n21 -= f[116];
                if ((int)(l13 >>> (n21 ^= f[117])) >= (int)l11) break;
                int n22 = f[118];
                n22 += f[119];
                int n23 = f[121];
                n23 ^= f[122];
                cArray2[(int)(l13 >>> (n22 ^= kotakbaz.rain.module.modules.player.B.f[120]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += f[123]))];
                l13 += 0x100000000L;
            }
            int n24 = f[124];
            n24 -= f[125];
            int n25 = (int)(l14 >>> (n24 += f[126]));
            l14 += 0x100000000L;
            kotakbaz.rain.module.modules.player.B.C[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = f[127];
            n26 ^= f[128];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= f[129]);
        }
        INSTANCE = new B();
        int n27 = f[130];
        n27 ^= f[131];
        n27 ^= f[132];
        int n28 = f[133];
        n28 -= f[134];
        String[] stringArray = new String[n28 ^= f[135]];
        int n29 = f[136];
        n29 ^= f[137];
        int n30 = f[139];
        n30 ^= f[140];
        stringArray[n29 += kotakbaz.rain.module.modules.player.B.f[138]] = (String)C[n30 -= f[141]];
        int n31 = f[142];
        n31 ^= f[143];
        int n32 = f[145];
        n32 ^= f[146];
        stringArray[n31 -= kotakbaz.rain.module.modules.player.B.f[144]] = (String)C[n32 ^= f[147]];
        int n33 = f[148];
        n33 += f[149];
        int n34 = f[151];
        n34 += f[152];
        a = a_0.mode$default(INSTANCE, (String)C[n27], CollectionsKt.listOf(stringArray), n33 += f[150], n34 += f[153], null);
        int n35 = f[154];
        n35 += f[155];
        A = INSTANCE.slider((String)C[n35 ^= f[156]], 500.0f, 200.0f, 2000.0f, 10.0f);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[f[157]];
        String string = (String)object[f[158]];
        object = object[f[159]];
        Object[] objectArray = e;
        if (e == null) {
            objectArray = e = new Object[f[160]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[f[161]];
                d = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[f[163] ^ f[164]];
                byArray[kotakbaz.rain.module.modules.player.B.f[165] ^ kotakbaz.rain.module.modules.player.B.f[166]] = f[167] ^ f[168];
                byArray[kotakbaz.rain.module.modules.player.B.f[169] ^ kotakbaz.rain.module.modules.player.B.f[170]] = f[171] ^ f[172];
                byArray[kotakbaz.rain.module.modules.player.B.f[173] ^ kotakbaz.rain.module.modules.player.B.f[174]] = f[175] ^ f[176];
                byArray[kotakbaz.rain.module.modules.player.B.f[177] ^ kotakbaz.rain.module.modules.player.B.f[178]] = f[179] ^ f[180];
                byArray[kotakbaz.rain.module.modules.player.B.f[181] ^ kotakbaz.rain.module.modules.player.B.f[182]] = f[183] ^ f[184];
                byArray[kotakbaz.rain.module.modules.player.B.f[185] ^ kotakbaz.rain.module.modules.player.B.f[186]] = f[187] ^ f[188];
                byArray[kotakbaz.rain.module.modules.player.B.f[189] ^ kotakbaz.rain.module.modules.player.B.f[190]] = f[191] ^ f[192];
                byArray[kotakbaz.rain.module.modules.player.B.f[193] ^ kotakbaz.rain.module.modules.player.B.f[194]] = f[195] ^ f[196];
                byArray[kotakbaz.rain.module.modules.player.B.f[197] ^ kotakbaz.rain.module.modules.player.B.f[198]] = f[199] ^ f[200];
                byArray[kotakbaz.rain.module.modules.player.B.f[201] ^ kotakbaz.rain.module.modules.player.B.f[202]] = f[203] ^ f[204];
                byArray[kotakbaz.rain.module.modules.player.B.f[205] ^ kotakbaz.rain.module.modules.player.B.f[206]] = f[207] ^ f[208];
                byArray[kotakbaz.rain.module.modules.player.B.f[209] ^ kotakbaz.rain.module.modules.player.B.f[210]] = f[211] ^ f[212];
                byArray[kotakbaz.rain.module.modules.player.B.f[213] ^ kotakbaz.rain.module.modules.player.B.f[214]] = f[215] ^ f[216];
                byArray[kotakbaz.rain.module.modules.player.B.f[217] ^ kotakbaz.rain.module.modules.player.B.f[218]] = f[219] ^ f[220];
                byArray[kotakbaz.rain.module.modules.player.B.f[221] ^ kotakbaz.rain.module.modules.player.B.f[222]] = f[223] ^ f[224];
                byArray[kotakbaz.rain.module.modules.player.B.f[225] ^ kotakbaz.rain.module.modules.player.B.f[226]] = f[227] ^ f[228];
                objectArray2[kotakbaz.rain.module.modules.player.B.f[162]] = byArray;
            }
            byte[] byArray = (byte[])object3[f[229]];
            if (D == null) {
                byte[] byArray2 = new byte[f[230] ^ f[231]];
                byArray2[kotakbaz.rain.module.modules.player.B.f[232] ^ kotakbaz.rain.module.modules.player.B.f[233]] = f[234] ^ f[235];
                byArray2[kotakbaz.rain.module.modules.player.B.f[236] ^ kotakbaz.rain.module.modules.player.B.f[237]] = f[238] ^ f[239];
                byArray2[kotakbaz.rain.module.modules.player.B.f[240] ^ kotakbaz.rain.module.modules.player.B.f[241]] = f[242] ^ f[243];
                byArray2[kotakbaz.rain.module.modules.player.B.f[244] ^ kotakbaz.rain.module.modules.player.B.f[245]] = f[246] ^ f[247];
                byArray2[kotakbaz.rain.module.modules.player.B.f[248] ^ kotakbaz.rain.module.modules.player.B.f[249]] = f[250] ^ f[251];
                byArray2[kotakbaz.rain.module.modules.player.B.f[252] ^ kotakbaz.rain.module.modules.player.B.f[253]] = f[254] ^ f[255];
                byArray2[kotakbaz.rain.module.modules.player.B.f[256] ^ kotakbaz.rain.module.modules.player.B.f[257]] = f[258] ^ f[259];
                byArray2[kotakbaz.rain.module.modules.player.B.f[260] ^ kotakbaz.rain.module.modules.player.B.f[261]] = f[262] ^ f[263];
                byArray2[kotakbaz.rain.module.modules.player.B.f[264] ^ kotakbaz.rain.module.modules.player.B.f[265]] = f[266] ^ f[267];
                byArray2[kotakbaz.rain.module.modules.player.B.f[268] ^ kotakbaz.rain.module.modules.player.B.f[269]] = f[270] ^ f[271];
                byArray2[kotakbaz.rain.module.modules.player.B.f[272] ^ kotakbaz.rain.module.modules.player.B.f[273]] = f[274] ^ f[275];
                byArray2[kotakbaz.rain.module.modules.player.B.f[276] ^ kotakbaz.rain.module.modules.player.B.f[277]] = f[278] ^ f[279];
                byArray2[kotakbaz.rain.module.modules.player.B.f[280] ^ kotakbaz.rain.module.modules.player.B.f[281]] = f[282] ^ f[283];
                byArray2[kotakbaz.rain.module.modules.player.B.f[284] ^ kotakbaz.rain.module.modules.player.B.f[285]] = f[286] ^ f[287];
                byArray2[kotakbaz.rain.module.modules.player.B.f[288] ^ kotakbaz.rain.module.modules.player.B.f[289]] = f[290] ^ f[291];
                byArray2[kotakbaz.rain.module.modules.player.B.f[292] ^ kotakbaz.rain.module.modules.player.B.f[293]] = f[294] ^ f[295];
                byArray2[kotakbaz.rain.module.modules.player.B.f[296] ^ kotakbaz.rain.module.modules.player.B.f[297]] = f[298] ^ f[299];
                byArray2[kotakbaz.rain.module.modules.player.B.f[300] ^ kotakbaz.rain.module.modules.player.B.f[301]] = f[302] ^ f[303];
                byArray2[kotakbaz.rain.module.modules.player.B.f[304] ^ kotakbaz.rain.module.modules.player.B.f[305]] = f[306] ^ f[307];
                byArray2[kotakbaz.rain.module.modules.player.B.f[308] ^ kotakbaz.rain.module.modules.player.B.f[309]] = f[310] ^ f[311];
                byArray2[kotakbaz.rain.module.modules.player.B.f[312] ^ kotakbaz.rain.module.modules.player.B.f[313]] = f[314] ^ f[315];
                byArray2[kotakbaz.rain.module.modules.player.B.f[316] ^ kotakbaz.rain.module.modules.player.B.f[317]] = f[318] ^ f[319];
                byArray2[kotakbaz.rain.module.modules.player.B.f[320] ^ kotakbaz.rain.module.modules.player.B.f[321]] = f[322] ^ f[323];
                byArray2[kotakbaz.rain.module.modules.player.B.f[324] ^ kotakbaz.rain.module.modules.player.B.f[325]] = f[326] ^ f[327];
                byArray2[kotakbaz.rain.module.modules.player.B.f[328] ^ kotakbaz.rain.module.modules.player.B.f[329]] = f[330] ^ f[331];
                byArray2[kotakbaz.rain.module.modules.player.B.f[332] ^ kotakbaz.rain.module.modules.player.B.f[333]] = f[334] ^ f[335];
                byArray2[kotakbaz.rain.module.modules.player.B.f[336] ^ kotakbaz.rain.module.modules.player.B.f[337]] = f[338] ^ f[339];
                byArray2[kotakbaz.rain.module.modules.player.B.f[340] ^ kotakbaz.rain.module.modules.player.B.f[341]] = f[342] ^ f[343];
                byArray2[kotakbaz.rain.module.modules.player.B.f[344] ^ kotakbaz.rain.module.modules.player.B.f[345]] = f[346] ^ f[347];
                byArray2[kotakbaz.rain.module.modules.player.B.f[348] ^ kotakbaz.rain.module.modules.player.B.f[349]] = f[350] ^ f[351];
                byArray2[kotakbaz.rain.module.modules.player.B.f[352] ^ kotakbaz.rain.module.modules.player.B.f[353]] = f[354] ^ f[355];
                byArray2[kotakbaz.rain.module.modules.player.B.f[356] ^ kotakbaz.rain.module.modules.player.B.f[357]] = f[358] ^ f[359];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, f[360], byArray3, f[361], byArray.length);
                System.arraycopy(byArray2, f[362], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.module.modules.player.B.A()[f[363]];
                if (object4 == null) {
                    char[] cArray = "\ud36b\ud7dd\ud360\ud7d7\ud7d9\ud66d\ud384\ud53e\ud427\ud343\ud7a3\ud50a\ud376\ud378\ud388\ud7a3\ud7d6\ud666".toCharArray();
                    for (int i2 = f[364]; i2 < f[365]; ++i2) {
                        int n2 = cArray[i2];
                        n2 ^= f[366];
                        n2 += f[367];
                        n2 += f[368];
                        n2 ^= f[369];
                        n2 += f[370];
                        n2 += f[371];
                        n2 ^= f[372];
                        n2 ^= f[373];
                        n2 ^= f[374];
                        n2 -= f[375];
                        n2 ^= f[376];
                        n2 -= f[377];
                        n2 -= f[378];
                        n2 += f[379];
                        cArray[i2] = (char)(n2 += f[380]);
                    }
                    object4 = kotakbaz.rain.module.modules.player.B.A()[kotakbaz.rain.module.modules.player.B.f[381]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[f[382]];
                byArray4[kotakbaz.rain.module.modules.player.B.f[383]] = f[384];
                byArray4[kotakbaz.rain.module.modules.player.B.f[385]] = f[386];
                byArray4[kotakbaz.rain.module.modules.player.B.f[387]] = f[388];
                byArray4[kotakbaz.rain.module.modules.player.B.f[389]] = f[390];
                byArray4[kotakbaz.rain.module.modules.player.B.f[391]] = f[392];
                byArray4[kotakbaz.rain.module.modules.player.B.f[393]] = f[394];
                byArray4[kotakbaz.rain.module.modules.player.B.f[395]] = f[396];
                byArray4[kotakbaz.rain.module.modules.player.B.f[397]] = f[398];
                byArray4[kotakbaz.rain.module.modules.player.B.f[399]] = -36;
                byArray4[0] = 67;
                byArray4[8] = 56;
                byArray4[2] = -116;
                byArray4[13] = -49;
                byArray4[7] = 84;
                byArray4[11] = -20;
                byArray4[4] = 34;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 17, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.module.modules.player.B.A()[2];
                if (object5 == null) {
                    char[] cArray = "\uf71d\uf719\uf76f".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 ^= 0x3C31;
                        n3 ^= 0x1A91;
                        n3 += 25186;
                        n3 -= 65332;
                        n3 += 7477;
                        n3 -= 54551;
                        n3 ^= 0xFD37;
                        n3 ^= 0x6D5A;
                        n3 += 24635;
                        cArray[i3] = (char)(n3 -= 19806);
                    }
                    object5 = kotakbaz.rain.module.modules.player.B.A()[2] = new String(cArray);
                }
                D = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.module.modules.player.B.A()[3];
            if (object6 == null) {
                char[] cArray = "\u3ec5\u3ec9\u3ed7\u3ed3\u3ec7\u3ec6\u3ec7\u3ed3\u3ed4\u3eaf\u3ec7\u3ed7\u3ef9\u3ed4\u3f25\u3f58\u3f58\u3e0d\u3e12\u3f2b".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 += 20224;
                    n4 ^= 0xF063;
                    n4 += 8243;
                    n4 -= 40055;
                    n4 -= 34327;
                    n4 ^= 0xD568;
                    n4 += 27800;
                    n4 += 57113;
                    n4 -= 26058;
                    n4 ^= 0xE42B;
                    n4 += 36542;
                    cArray[i4] = (char)(n4 -= 65182);
                }
                object6 = kotakbaz.rain.module.modules.player.B.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)D), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = E;
        if (E == null) {
            E = new Object[4];
            objectArray = E;
        }
        return objectArray;
    }

    public static void b() {
        f = new int[0x2A7E ^ 0x2BEE];
        kotakbaz.rain.module.modules.player.B.f[0x53D7 ^ 0x53FB] = 0xFFFFAC31 ^ 0x53FB;
        kotakbaz.rain.module.modules.player.B.f[0xD391 ^ 0xD300] = 0xD37B ^ 0xD300;
        kotakbaz.rain.module.modules.player.B.f[0x632 ^ 0x73E] = 0x1073F ^ 0x73E;
        kotakbaz.rain.module.modules.player.B.f[0x4E6A ^ 0x4E2F] = 0xBC12 ^ 0x4E2F;
        kotakbaz.rain.module.modules.player.B.f[0x30CB ^ 0x305C] = 0xFFFFCFF3 ^ 0x305C;
        kotakbaz.rain.module.modules.player.B.f[0xEA24 ^ 0xEAD3] = 0x2CDF ^ 0xEAD3;
        kotakbaz.rain.module.modules.player.B.f[0xEB ^ 0x1F1] = 0xFFFF24BF ^ 0x1F1;
        kotakbaz.rain.module.modules.player.B.f[0x4AF1 ^ 0x4B9C] = 0x4B8E ^ 0x4B9C;
        kotakbaz.rain.module.modules.player.B.f[0xB72C ^ 0xB78C] = 0xB78D ^ 0xB78C;
        kotakbaz.rain.module.modules.player.B.f[0xD575 ^ 0xD5BD] = 0x3D45 ^ 0xD5BD;
        kotakbaz.rain.module.modules.player.B.f[0x432 ^ 0x41A] = 0xFFFFFB8D ^ 0x41A;
        kotakbaz.rain.module.modules.player.B.f[0x4DCE ^ 0x4D42] = 0xFFFFB29D ^ 0x4D42;
        kotakbaz.rain.module.modules.player.B.f[0x8541 ^ 0x85EB] = 0xF8B2 ^ 0x85EB;
        kotakbaz.rain.module.modules.player.B.f[0x2D ^ 0x117] = 0xCB04 ^ 0x117;
        kotakbaz.rain.module.modules.player.B.f[0x3E05 ^ 0x3F76] = 0xD31D ^ 0x3F76;
        kotakbaz.rain.module.modules.player.B.f[0x187D ^ 0x1976] = 0x6A85 ^ 0x1976;
        kotakbaz.rain.module.modules.player.B.f[0x14DA ^ 0x14C3] = 0x1481 ^ 0x14C3;
        kotakbaz.rain.module.modules.player.B.f[0xA7AE ^ 0xA68D] = 0x737 ^ 0xA68D;
        kotakbaz.rain.module.modules.player.B.f[0xB3B3 ^ 0xB2BA] = 0xC149 ^ 0xB2BA;
        kotakbaz.rain.module.modules.player.B.f[0xDCB7 ^ 0xDDD6] = 0x84A8 ^ 0xDDD6;
        kotakbaz.rain.module.modules.player.B.f[0x4165 ^ 0x400F] = 0x400F ^ 0x400F;
        kotakbaz.rain.module.modules.player.B.f[0xA086 ^ 0xA1AF] = 0x4214 ^ 0xA1AF;
        kotakbaz.rain.module.modules.player.B.f[0x9523 ^ 0x943C] = 0xB661 ^ 0x943C;
        kotakbaz.rain.module.modules.player.B.f[0x3274 ^ 0x3289] = 0xE99F ^ 0x3289;
        kotakbaz.rain.module.modules.player.B.f[0x8FBA ^ 0x8F5A] = 0x18601 ^ 0x8F5A;
        kotakbaz.rain.module.modules.player.B.f[0x81ED ^ 0x80B6] = 0x4275 ^ 0x80B6;
        kotakbaz.rain.module.modules.player.B.f[0x7BE8 ^ 0x7B57] = 0x7430 ^ 0x7B57;
        kotakbaz.rain.module.modules.player.B.f[0xE5F7 ^ 0xE5B0] = 0x4ACE ^ 0xE5B0;
        kotakbaz.rain.module.modules.player.B.f[0x556D ^ 0x5414] = 0xBFAD ^ 0x5414;
        kotakbaz.rain.module.modules.player.B.f[0x412A ^ 0x41C3] = 0x197A ^ 0x41C3;
        kotakbaz.rain.module.modules.player.B.f[0x9D36 ^ 0x9DD5] = 0x3CAF ^ 0x9DD5;
        kotakbaz.rain.module.modules.player.B.f[0x5B4C ^ 0x5BDF] = 0x5BD4 ^ 0x5BDF;
        kotakbaz.rain.module.modules.player.B.f[0xA879 ^ 0xA974] = 0x1A96F ^ 0xA974;
        kotakbaz.rain.module.modules.player.B.f[0xE7CD ^ 0xE687] = 0xD3A5 ^ 0xE687;
        kotakbaz.rain.module.modules.player.B.f[0x440B ^ 0x451C] = 0x4D20 ^ 0x451C;
        kotakbaz.rain.module.modules.player.B.f[0x473 ^ 0x5F0] = 0x5FE ^ 0x5F0;
        kotakbaz.rain.module.modules.player.B.f[0x10034 ^ 0x100BE] = 0xFFFEFF32 ^ 0x100BE;
        kotakbaz.rain.module.modules.player.B.f[0x101F3 ^ 0x1007F] = 0x10009 ^ 0x1007F;
        kotakbaz.rain.module.modules.player.B.f[0xB0DD ^ 0xB198] = 0xE75F ^ 0xB198;
        kotakbaz.rain.module.modules.player.B.f[0xCCEC ^ 0xCC8D] = 0xFFFF33B0 ^ 0xCC8D;
        kotakbaz.rain.module.modules.player.B.f[0xF348 ^ 0xF3EA] = 0xF3EA ^ 0xF3EA;
        kotakbaz.rain.module.modules.player.B.f[0xF629 ^ 0xF767] = 0xFFFFAEB5 ^ 0xF767;
        kotakbaz.rain.module.modules.player.B.f[0x6FC3 ^ 0x6F43] = 0xFFFF90CE ^ 0x6F43;
        kotakbaz.rain.module.modules.player.B.f[0x56B4 ^ 0x57F3] = 0x134 ^ 0x57F3;
        kotakbaz.rain.module.modules.player.B.f[0x10198 ^ 0x100FD] = 0x16732 ^ 0x100FD;
        kotakbaz.rain.module.modules.player.B.f[0x1D83 ^ 0x1CBB] = 0xD69B ^ 0x1CBB;
        kotakbaz.rain.module.modules.player.B.f[0xBFBD ^ 0xBFAB] = 0xBF8C ^ 0xBFAB;
        kotakbaz.rain.module.modules.player.B.f[0xCB75 ^ 0xCA5D] = 0x29EC ^ 0xCA5D;
        kotakbaz.rain.module.modules.player.B.f[0xB1C ^ 0xB92] = 0xBDB ^ 0xB92;
        kotakbaz.rain.module.modules.player.B.f[0xB922 ^ 0xB862] = 0xB62 ^ 0xB862;
        kotakbaz.rain.module.modules.player.B.f[0x7CE3 ^ 0x7DF2] = 0xABFB ^ 0x7DF2;
        kotakbaz.rain.module.modules.player.B.f[0x1B7E ^ 0x1B33] = 0x1B6F ^ 0x1B33;
        kotakbaz.rain.module.modules.player.B.f[0xE2F9 ^ 0xE3CA] = 0x2418 ^ 0xE3CA;
        kotakbaz.rain.module.modules.player.B.f[0x4B5D ^ 0x4B53] = 0xFFFFB485 ^ 0x4B53;
        kotakbaz.rain.module.modules.player.B.f[0xCBB7 ^ 0xCBC9] = 0xCBB5 ^ 0xCBC9;
        kotakbaz.rain.module.modules.player.B.f[0xA0E ^ 0xA2B] = 0xFFFFF5F2 ^ 0xA2B;
        kotakbaz.rain.module.modules.player.B.f[0x964A ^ 0x9636] = 0xFFFF697C ^ 0x9636;
        kotakbaz.rain.module.modules.player.B.f[0x2B36 ^ 0x2B92] = 0x94E5 ^ 0x2B92;
        kotakbaz.rain.module.modules.player.B.f[0xF750 ^ 0xF61F] = 0x5014 ^ 0xF61F;
        kotakbaz.rain.module.modules.player.B.f[0x1B3E ^ 0x1A30] = 0xFFFEE586 ^ 0x1A30;
        kotakbaz.rain.module.modules.player.B.f[0xFFB8 ^ 0xFFAD] = 0xFFFF0019 ^ 0xFFAD;
        kotakbaz.rain.module.modules.player.B.f[0xF55B ^ 0xF5D4] = 0xF5D4 ^ 0xF5D4;
        kotakbaz.rain.module.modules.player.B.f[0xB702 ^ 0xB624] = 0xFFFF57DE ^ 0xB624;
        kotakbaz.rain.module.modules.player.B.f[0xB41B ^ 0xB431] = 0xB409 ^ 0xB431;
        kotakbaz.rain.module.modules.player.B.f[0x5E3 ^ 0x4E6] = 0x6FD3 ^ 0x4E6;
        kotakbaz.rain.module.modules.player.B.f[0xF68D ^ 0xF7A3] = 0xFFFF832C ^ 0xF7A3;
        kotakbaz.rain.module.modules.player.B.f[0xB32 ^ 0xA29] = 0xD0DF ^ 0xA29;
        kotakbaz.rain.module.modules.player.B.f[0xF056 ^ 0xF08E] = 0xCD6F ^ 0xF08E;
        kotakbaz.rain.module.modules.player.B.f[0x39F7 ^ 0x39FA] = 0xFFFFC676 ^ 0x39FA;
        kotakbaz.rain.module.modules.player.B.f[0xC18C ^ 0xC1AC] = 0xFFFF3E3A ^ 0xC1AC;
        kotakbaz.rain.module.modules.player.B.f[0xA30E ^ 0xA21C] = 0xFFFF8B98 ^ 0xA21C;
        kotakbaz.rain.module.modules.player.B.f[0x40A6 ^ 0x4077] = 0xA2E4 ^ 0x4077;
        kotakbaz.rain.module.modules.player.B.f[0xA4CC ^ 0xA43F] = 0xF84E ^ 0xA43F;
        kotakbaz.rain.module.modules.player.B.f[0x560 ^ 0x5BC] = 0xC106 ^ 0x5BC;
        kotakbaz.rain.module.modules.player.B.f[0x10E1C ^ 0x10E79] = 0xFFFEF1EB ^ 0x10E79;
        kotakbaz.rain.module.modules.player.B.f[0xE2AD ^ 0xE21D] = 0xFC5 ^ 0xE21D;
        kotakbaz.rain.module.modules.player.B.f[0x5D2 ^ 0x5B4] = 0x5EA ^ 0x5B4;
        kotakbaz.rain.module.modules.player.B.f[0x10C94 ^ 0x10C39] = 0x1E1EA ^ 0x10C39;
        kotakbaz.rain.module.modules.player.B.f[0xD4E9 ^ 0xD4BB] = 0xD4E0 ^ 0xD4BB;
        kotakbaz.rain.module.modules.player.B.f[0x969A ^ 0x965D] = 0xFFFF8104 ^ 0x965D;
        kotakbaz.rain.module.modules.player.B.f[0x442C ^ 0x448B] = 0xFFFFAB89 ^ 0x448B;
        kotakbaz.rain.module.modules.player.B.f[0x49EA ^ 0x48F2] = 0x9201 ^ 0x48F2;
        kotakbaz.rain.module.modules.player.B.f[0xA356 ^ 0xA20C] = 0x60AD ^ 0xA20C;
        kotakbaz.rain.module.modules.player.B.f[0xC727 ^ 0xC706] = 0xFFFF38BB ^ 0xC706;
        kotakbaz.rain.module.modules.player.B.f[0xB946 ^ 0xB852] = 0xB075 ^ 0xB852;
        kotakbaz.rain.module.modules.player.B.f[0x127A ^ 0x1262] = 0xFFFFED84 ^ 0x1262;
        kotakbaz.rain.module.modules.player.B.f[0xFCC6 ^ 0xFCBF] = 0xFFFF0314 ^ 0xFCBF;
        kotakbaz.rain.module.modules.player.B.f[0xB5F5 ^ 0xB518] = 0xCC7A ^ 0xB518;
        kotakbaz.rain.module.modules.player.B.f[0x1FCB ^ 0x1FF9] = 0x1FC7 ^ 0x1FF9;
        kotakbaz.rain.module.modules.player.B.f[0xA2C8 ^ 0xA241] = 0xFFFF5D9C ^ 0xA241;
        kotakbaz.rain.module.modules.player.B.f[0x15C0 ^ 0x144F] = 0x1445 ^ 0x144F;
        kotakbaz.rain.module.modules.player.B.f[0x17F1 ^ 0x178C] = 0xFFFFE82A ^ 0x178C;
        kotakbaz.rain.module.modules.player.B.f[0x1019B ^ 0x101A1] = 0x1008D ^ 0x101A1;
        kotakbaz.rain.module.modules.player.B.f[0x2EA ^ 0x3E9] = 0xA291 ^ 0x3E9;
        kotakbaz.rain.module.modules.player.B.f[0xCB1B ^ 0xCB2F] = 0xCB2F ^ 0xCB2F;
        kotakbaz.rain.module.modules.player.B.f[0x9BF4 ^ 0x9A7F] = 0x9A7A ^ 0x9A7F;
        kotakbaz.rain.module.modules.player.B.f[0x722B ^ 0x73AA] = 0x73A9 ^ 0x73AA;
        kotakbaz.rain.module.modules.player.B.f[0x47F8 ^ 0x47A4] = 0xFFFFB82E ^ 0x47A4;
        kotakbaz.rain.module.modules.player.B.f[0xF21 ^ 0xF5A] = 0xFFFFF09A ^ 0xF5A;
        kotakbaz.rain.module.modules.player.B.f[0x2EC8 ^ 0x2ECB] = 0xFFFFD107 ^ 0x2ECB;
        kotakbaz.rain.module.modules.player.B.f[0xEB4A ^ 0xEA2A] = 0xB343 ^ 0xEA2A;
        kotakbaz.rain.module.modules.player.B.f[0x9D22 ^ 0x9DA7] = 0xFFFF6296 ^ 0x9DA7;
        kotakbaz.rain.module.modules.player.B.f[0xF569 ^ 0xF56C] = 0xF573 ^ 0xF56C;
        kotakbaz.rain.module.modules.player.B.f[0x3211 ^ 0x3334] = 0x2D41 ^ 0x3334;
        kotakbaz.rain.module.modules.player.B.f[0x2570 ^ 0x2405] = 0xE3D4 ^ 0x2405;
        kotakbaz.rain.module.modules.player.B.f[0xE293 ^ 0xE2A0] = 0xE2A3 ^ 0xE2A0;
        kotakbaz.rain.module.modules.player.B.f[0x1F2E ^ 0x1E1F] = 0xD9CD ^ 0x1E1F;
        kotakbaz.rain.module.modules.player.B.f[0xDBB7 ^ 0xDB77] = 0xD458 ^ 0xDB77;
        kotakbaz.rain.module.modules.player.B.f[0xF254 ^ 0xF246] = 0xF223 ^ 0xF246;
        kotakbaz.rain.module.modules.player.B.f[0x10FFC ^ 0x10F21] = 0x67C ^ 0x10F21;
        kotakbaz.rain.module.modules.player.B.f[0xEDDB ^ 0xEDD7] = 0xED9B ^ 0xEDD7;
        kotakbaz.rain.module.modules.player.B.f[0x616D ^ 0x6059] = 0x717C ^ 0x6059;
        kotakbaz.rain.module.modules.player.B.f[0xE9C ^ 0xFB1] = 0x84A0 ^ 0xFB1;
        kotakbaz.rain.module.modules.player.B.f[0xCAB ^ 0xC5B] = 0x503F ^ 0xC5B;
        kotakbaz.rain.module.modules.player.B.f[0x9F67 ^ 0x9FA9] = 0x3230 ^ 0x9FA9;
        kotakbaz.rain.module.modules.player.B.f[0x8169 ^ 0x801D] = 0xDB12 ^ 0x801D;
        kotakbaz.rain.module.modules.player.B.f[0x8F2 ^ 0x9FA] = 0x7A18 ^ 0x9FA;
        kotakbaz.rain.module.modules.player.B.f[0xFA09 ^ 0xFA73] = 0xFFFF05B8 ^ 0xFA73;
        kotakbaz.rain.module.modules.player.B.f[0x6F8 ^ 0x61E] = 0xCAF2 ^ 0x61E;
        kotakbaz.rain.module.modules.player.B.f[0xC547 ^ 0xC47A] = 0x2878 ^ 0xC47A;
        kotakbaz.rain.module.modules.player.B.f[0x2AA1 ^ 0x2BA3] = 0xFFFF755F ^ 0x2BA3;
        kotakbaz.rain.module.modules.player.B.f[0xA40E ^ 0xA407] = 0xA45D ^ 0xA407;
        kotakbaz.rain.module.modules.player.B.f[0x22E ^ 0x205] = 0x207 ^ 0x205;
        kotakbaz.rain.module.modules.player.B.f[0x4677 ^ 0x474E] = 0x8D7C ^ 0x474E;
        kotakbaz.rain.module.modules.player.B.f[0x4D7 ^ 0x42D] = 0xFFFEF05E ^ 0x42D;
        kotakbaz.rain.module.modules.player.B.f[0x4EC8 ^ 0x4E7F] = 0xFFFF85F5 ^ 0x4E7F;
        kotakbaz.rain.module.modules.player.B.f[0x2BE8 ^ 0x2BE9] = 0x2BCC ^ 0x2BE9;
        kotakbaz.rain.module.modules.player.B.f[0x2832 ^ 0x2976] = 0x7FB0 ^ 0x2976;
        kotakbaz.rain.module.modules.player.B.f[0x6AD7 ^ 0x6A82] = 0x6A0C ^ 0x6A82;
        kotakbaz.rain.module.modules.player.B.f[0x125D ^ 0x133F] = 0xFFFFB59C ^ 0x133F;
        kotakbaz.rain.module.modules.player.B.f[0x3284 ^ 0x33F8] = 0xCA67 ^ 0x33F8;
        kotakbaz.rain.module.modules.player.B.f[0x33AD ^ 0x33F2] = 0xFFFFCC4D ^ 0x33F2;
        kotakbaz.rain.module.modules.player.B.f[0xA0BC ^ 0xA132] = 0xA136 ^ 0xA132;
        kotakbaz.rain.module.modules.player.B.f[0xBD63 ^ 0xBD0F] = 0xBD17 ^ 0xBD0F;
        kotakbaz.rain.module.modules.player.B.f[0xE82C ^ 0xE973] = 0x512C ^ 0xE973;
        kotakbaz.rain.module.modules.player.B.f[0xB23B ^ 0xB358] = 0xEA26 ^ 0xB358;
        kotakbaz.rain.module.modules.player.B.f[0x34DD ^ 0x35FC] = 0x9446 ^ 0x35FC;
        kotakbaz.rain.module.modules.player.B.f[0x88DF ^ 0x899D] = 0xFFFFC561 ^ 0x899D;
        kotakbaz.rain.module.modules.player.B.f[0x6ED7 ^ 0x6F53] = 0xFFFF908C ^ 0x6F53;
        kotakbaz.rain.module.modules.player.B.f[0xD823 ^ 0xD848] = 0xFFFF27C4 ^ 0xD848;
        kotakbaz.rain.module.modules.player.B.f[0x10045 ^ 0x10015] = 0x1005E ^ 0x10015;
        kotakbaz.rain.module.modules.player.B.f[0x404C ^ 0x40D9] = 0xFFFFBF42 ^ 0x40D9;
        kotakbaz.rain.module.modules.player.B.f[0x40BE ^ 0x40B4] = 0xFFFFBF61 ^ 0x40B4;
        kotakbaz.rain.module.modules.player.B.f[0xBECB ^ 0xBE9F] = 0xBE97 ^ 0xBE9F;
        kotakbaz.rain.module.modules.player.B.f[0xCA3D ^ 0xCA22] = 0xFFFF35BB ^ 0xCA22;
        kotakbaz.rain.module.modules.player.B.f[0x6ECA ^ 0x6F94] = 0xD7C7 ^ 0x6F94;
        kotakbaz.rain.module.modules.player.B.f[0x2A20 ^ 0x2AD2] = 0x7697 ^ 0x2AD2;
        kotakbaz.rain.module.modules.player.B.f[0x8107 ^ 0x814C] = 0x8136 ^ 0x814C;
        kotakbaz.rain.module.modules.player.B.f[0xDD51 ^ 0xDC73] = 0x7D81 ^ 0xDC73;
        kotakbaz.rain.module.modules.player.B.f[0x3336 ^ 0x33FC] = 0x7ACE ^ 0x33FC;
        kotakbaz.rain.module.modules.player.B.f[0xEBC1 ^ 0xEBF9] = 0xEBF9 ^ 0xEBF9;
        kotakbaz.rain.module.modules.player.B.f[0x112F ^ 0x101A] = 0x127 ^ 0x101A;
        kotakbaz.rain.module.modules.player.B.f[0x489 ^ 0x5FB] = 0xCDB0 ^ 0x5FB;
        kotakbaz.rain.module.modules.player.B.f[0x9401 ^ 0x9403] = 0xFFFF6BC9 ^ 0x9403;
        kotakbaz.rain.module.modules.player.B.f[0xB8A1 ^ 0xB840] = 0x1958 ^ 0xB840;
        kotakbaz.rain.module.modules.player.B.f[0x9D42 ^ 0x9D59] = 0xFFFF62A4 ^ 0x9D59;
        kotakbaz.rain.module.modules.player.B.f[0x4BC4 ^ 0x4BFF] = 0x2DFC ^ 0x4BFF;
        kotakbaz.rain.module.modules.player.B.f[0xE5F9 ^ 0xE492] = 0xE493 ^ 0xE492;
        kotakbaz.rain.module.modules.player.B.f[0x29D6 ^ 0x2934] = 0x882B ^ 0x2934;
        kotakbaz.rain.module.modules.player.B.f[0xD136 ^ 0xD1F4] = 0x56C1 ^ 0xD1F4;
        kotakbaz.rain.module.modules.player.B.f[0x2576 ^ 0x243B] = 0x8230 ^ 0x243B;
        kotakbaz.rain.module.modules.player.B.f[0x27E0 ^ 0x27AA] = 0xFFFFD842 ^ 0x27AA;
        kotakbaz.rain.module.modules.player.B.f[0x7093 ^ 0x7074] = 0xBCB8 ^ 0x7074;
        kotakbaz.rain.module.modules.player.B.f[0xE066 ^ 0xE040] = 0xE077 ^ 0xE040;
        kotakbaz.rain.module.modules.player.B.f[0xBB1D ^ 0xBBF6] = 0xE34F ^ 0xBBF6;
        kotakbaz.rain.module.modules.player.B.f[0x9E15 ^ 0x9ED6] = 0xFFFFE613 ^ 0x9ED6;
        kotakbaz.rain.module.modules.player.B.f[0xD4DE ^ 0xD4E2] = 0x8D46 ^ 0xD4E2;
        kotakbaz.rain.module.modules.player.B.f[0x43D4 ^ 0x4359] = 0xFFFFBCBB ^ 0x4359;
        kotakbaz.rain.module.modules.player.B.f[0x10112 ^ 0x10074] = 0xFFFE9810 ^ 0x10074;
        kotakbaz.rain.module.modules.player.B.f[0xD0FF ^ 0xD0C1] = 0xF548 ^ 0xD0C1;
        kotakbaz.rain.module.modules.player.B.f[0x4CEB ^ 0x4DA0] = 0x7880 ^ 0x4DA0;
        kotakbaz.rain.module.modules.player.B.f[0x9E9E ^ 0x9E2B] = 0xAA1A ^ 0x9E2B;
        kotakbaz.rain.module.modules.player.B.f[0x1536 ^ 0x1549] = 0x153D ^ 0x1549;
        kotakbaz.rain.module.modules.player.B.f[0xE090 ^ 0xE035] = 0xF09E ^ 0xE035;
        kotakbaz.rain.module.modules.player.B.f[0xA3E2 ^ 0xA2D2] = 0x6506 ^ 0xA2D2;
        kotakbaz.rain.module.modules.player.B.f[0x65F3 ^ 0x65ED] = 0xFFFF9AC2 ^ 0x65ED;
        kotakbaz.rain.module.modules.player.B.f[0xE950 ^ 0xE9B8] = 0xB11E ^ 0xE9B8;
        kotakbaz.rain.module.modules.player.B.f[0x108CB ^ 0x1082F] = 0x1A930 ^ 0x1082F;
        kotakbaz.rain.module.modules.player.B.f[0x584D ^ 0x5924] = 0x5924 ^ 0x5924;
        kotakbaz.rain.module.modules.player.B.f[0xA1CD ^ 0xA1D1] = 0xA1D7 ^ 0xA1D1;
        kotakbaz.rain.module.modules.player.B.f[0xCDC7 ^ 0xCDAD] = 0xCDD1 ^ 0xCDAD;
        kotakbaz.rain.module.modules.player.B.f[0x243A ^ 0x244C] = 0xFFFFDB1F ^ 0x244C;
        kotakbaz.rain.module.modules.player.B.f[0x6CF0 ^ 0x6DF4] = 0x6CD ^ 0x6DF4;
        kotakbaz.rain.module.modules.player.B.f[0xA8F1 ^ 0xA858] = 0xD50B ^ 0xA858;
        kotakbaz.rain.module.modules.player.B.f[0xBD30 ^ 0xBDC6] = 0x7BE1 ^ 0xBDC6;
        kotakbaz.rain.module.modules.player.B.f[0x5BD7 ^ 0x5B41] = 0xFFFFA499 ^ 0x5B41;
        kotakbaz.rain.module.modules.player.B.f[0xEE6C ^ 0xEF79] = 0xE745 ^ 0xEF79;
        kotakbaz.rain.module.modules.player.B.f[0x10996 ^ 0x109DE] = 0x109DE ^ 0x109DE;
        kotakbaz.rain.module.modules.player.B.f[0x546A ^ 0x5470] = 0x542C ^ 0x5470;
        kotakbaz.rain.module.modules.player.B.f[0x437C ^ 0x42FB] = 0x42F7 ^ 0x42FB;
        kotakbaz.rain.module.modules.player.B.f[0x8595 ^ 0x848C] = 0x5E7A ^ 0x848C;
        kotakbaz.rain.module.modules.player.B.f[0xD4E6 ^ 0xD4E9] = 0xD4CF ^ 0xD4E9;
        kotakbaz.rain.module.modules.player.B.f[0x5B62 ^ 0x5A1F] = 0x5A1E ^ 0x5A1F;
        kotakbaz.rain.module.modules.player.B.f[0xCA44 ^ 0xCAA1] = 0xCAA1 ^ 0xCAA1;
        kotakbaz.rain.module.modules.player.B.f[0x74FC ^ 0x7447] = 0xFFFFEF5B ^ 0x7447;
        kotakbaz.rain.module.modules.player.B.f[0xBBA9 ^ 0xBAFF] = 0xFFFFA6DD ^ 0xBAFF;
        kotakbaz.rain.module.modules.player.B.f[0x6AB8 ^ 0x6BC2] = 0x1658 ^ 0x6BC2;
        kotakbaz.rain.module.modules.player.B.f[0x4050 ^ 0x408E] = 0x149D5 ^ 0x408E;
        kotakbaz.rain.module.modules.player.B.f[0xDC8C ^ 0xDDBA] = 0xCCE2 ^ 0xDDBA;
        kotakbaz.rain.module.modules.player.B.f[0x6DF1 ^ 0x6D7A] = 0x6D4D ^ 0x6D7A;
        kotakbaz.rain.module.modules.player.B.f[0xD2C7 ^ 0xD261] = 0xC2C8 ^ 0xD261;
        kotakbaz.rain.module.modules.player.B.f[0x2F64 ^ 0x2F24] = 0x5EB5 ^ 0x2F24;
        kotakbaz.rain.module.modules.player.B.f[0x2F85 ^ 0x2F57] = 0xCDC5 ^ 0x2F57;
        kotakbaz.rain.module.modules.player.B.f[0xFB21 ^ 0xFB3C] = 0xFFFF04CB ^ 0xFB3C;
        kotakbaz.rain.module.modules.player.B.f[0x10640 ^ 0x106B9] = 0xD4B ^ 0x106B9;
        kotakbaz.rain.module.modules.player.B.f[0x7489 ^ 0x7463] = 0xFFFFD346 ^ 0x7463;
        kotakbaz.rain.module.modules.player.B.f[0x1F2D ^ 0x1E75] = 0xDCA2 ^ 0x1E75;
        kotakbaz.rain.module.modules.player.B.f[0xFDCC ^ 0xFD9A] = 0xFFFF021F ^ 0xFD9A;
        kotakbaz.rain.module.modules.player.B.f[0xDEE8 ^ 0xDFA4] = 0x79A1 ^ 0xDFA4;
        kotakbaz.rain.module.modules.player.B.f[0xFD77 ^ 0xFD60] = 0xFFFF02F2 ^ 0xFD60;
        kotakbaz.rain.module.modules.player.B.f[0x3E54 ^ 0x3EE6] = 0x3F4F ^ 0x3EE6;
        kotakbaz.rain.module.modules.player.B.f[0x8AD7 ^ 0x8B87] = 0x821B ^ 0x8B87;
        kotakbaz.rain.module.modules.player.B.f[0xADFA ^ 0xAD3E] = 0x2A0B ^ 0xAD3E;
        kotakbaz.rain.module.modules.player.B.f[0x74EC ^ 0x74A5] = 0x74D7 ^ 0x74A5;
        kotakbaz.rain.module.modules.player.B.f[0x116A ^ 0x11B5] = 0xFFFEE762 ^ 0x11B5;
        kotakbaz.rain.module.modules.player.B.f[0x8F90 ^ 0x8F97] = 0x8F8D ^ 0x8F97;
        kotakbaz.rain.module.modules.player.B.f[0xEA6D ^ 0xEAEE] = 0xFFFF1513 ^ 0xEAEE;
        kotakbaz.rain.module.modules.player.B.f[0x2113 ^ 0x2152] = 0xE2A3 ^ 0x2152;
        kotakbaz.rain.module.modules.player.B.f[0xCB46 ^ 0xCB33] = 0xCB29 ^ 0xCB33;
        kotakbaz.rain.module.modules.player.B.f[0xD821 ^ 0xD8CD] = 0xA1B6 ^ 0xD8CD;
        kotakbaz.rain.module.modules.player.B.f[0xCD9A ^ 0xCD1B] = 0xFFFF32C2 ^ 0xCD1B;
        kotakbaz.rain.module.modules.player.B.f[0xC1F6 ^ 0xC1DB] = 0xFFFF3E24 ^ 0xC1DB;
        kotakbaz.rain.module.modules.player.B.f[0x340E ^ 0x3459] = 0x3454 ^ 0x3459;
        kotakbaz.rain.module.modules.player.B.f[0x195C ^ 0x1832] = 0x44D2 ^ 0x1832;
        kotakbaz.rain.module.modules.player.B.f[0x771B ^ 0x7748] = 0x771A ^ 0x7748;
        kotakbaz.rain.module.modules.player.B.f[0xB6A4 ^ 0xB784] = 0x163A ^ 0xB784;
        kotakbaz.rain.module.modules.player.B.f[0xB32E ^ 0xB36A] = 0x4D96 ^ 0xB36A;
        kotakbaz.rain.module.modules.player.B.f[0x993A ^ 0x9830] = 0xEBD9 ^ 0x9830;
        kotakbaz.rain.module.modules.player.B.f[0x2076 ^ 0x207E] = 0x2025 ^ 0x207E;
        kotakbaz.rain.module.modules.player.B.f[0xA97C ^ 0xA87A] = 0xC37D ^ 0xA87A;
        kotakbaz.rain.module.modules.player.B.f[0xDD78 ^ 0xDDE3] = 0xDDC2 ^ 0xDDE3;
        kotakbaz.rain.module.modules.player.B.f[0x4A3C ^ 0x4B17] = 0xA8AC ^ 0x4B17;
        kotakbaz.rain.module.modules.player.B.f[0xFF54 ^ 0xFF84] = 0x521D ^ 0xFF84;
        kotakbaz.rain.module.modules.player.B.f[0x3072 ^ 0x3156] = 0x2F28 ^ 0x3156;
        kotakbaz.rain.module.modules.player.B.f[0x73E1 ^ 0x73EA] = 0x73C6 ^ 0x73EA;
        kotakbaz.rain.module.modules.player.B.f[0x9449 ^ 0x9474] = 0x1453 ^ 0x9474;
        kotakbaz.rain.module.modules.player.B.f[0xDC80 ^ 0xDC3C] = 0xB8F9 ^ 0xDC3C;
        kotakbaz.rain.module.modules.player.B.f[0x8C3B ^ 0x8C65] = 0x8CF1 ^ 0x8C65;
        kotakbaz.rain.module.modules.player.B.f[0x26C1 ^ 0x2660] = 0x2661 ^ 0x2660;
        kotakbaz.rain.module.modules.player.B.f[0xF9AA ^ 0xF894] = 0x14F5 ^ 0xF894;
        kotakbaz.rain.module.modules.player.B.f[0x5AF4 ^ 0x5AE0] = 0xFFFFA510 ^ 0x5AE0;
        kotakbaz.rain.module.modules.player.B.f[0x5D83 ^ 0x5C90] = 0x8A99 ^ 0x5C90;
        kotakbaz.rain.module.modules.player.B.f[0xDF8A ^ 0xDF18] = 0xDF6F ^ 0xDF18;
        kotakbaz.rain.module.modules.player.B.f[0xB944 ^ 0xB963] = 0xFFFF46B3 ^ 0xB963;
        kotakbaz.rain.module.modules.player.B.f[0x8827 ^ 0x8823] = 0xFFFF778F ^ 0x8823;
        kotakbaz.rain.module.modules.player.B.f[0x5618 ^ 0x562F] = 0x562D ^ 0x562F;
        kotakbaz.rain.module.modules.player.B.f[0x100B9 ^ 0x101B6] = 0x1AD ^ 0x101B6;
        kotakbaz.rain.module.modules.player.B.f[0x4592 ^ 0x45EA] = 0xFFFFBA4B ^ 0x45EA;
        kotakbaz.rain.module.modules.player.B.f[0x54F1 ^ 0x55F1] = 0xF480 ^ 0x55F1;
        kotakbaz.rain.module.modules.player.B.f[0xA34E ^ 0xA2CB] = 0xA2CD ^ 0xA2CB;
        kotakbaz.rain.module.modules.player.B.f[0xE5CE ^ 0xE5BD] = 0xFFFF1A5A ^ 0xE5BD;
        kotakbaz.rain.module.modules.player.B.f[0x2E7C ^ 0x2FFE] = 0xFFFFD017 ^ 0x2FFE;
        kotakbaz.rain.module.modules.player.B.f[0xBC14 ^ 0xBC25] = 0xFFFF43D3 ^ 0xBC25;
        kotakbaz.rain.module.modules.player.B.f[0x573F ^ 0x5668] = 0xB5A6 ^ 0x5668;
        kotakbaz.rain.module.modules.player.B.f[0x2F1A ^ 0x2E6C] = 0x4C19 ^ 0x2E6C;
        kotakbaz.rain.module.modules.player.B.f[0x7DA3 ^ 0x7C91] = 0xFFFF4495 ^ 0x7C91;
        kotakbaz.rain.module.modules.player.B.f[0xDF11 ^ 0xDE9C] = 0xDE93 ^ 0xDE9C;
        kotakbaz.rain.module.modules.player.B.f[0x10616 ^ 0x1075F] = 0x1327F ^ 0x1075F;
        kotakbaz.rain.module.modules.player.B.f[0x22D3 ^ 0x22D5] = 0xFFFFDD45 ^ 0x22D5;
        kotakbaz.rain.module.modules.player.B.f[0xE539 ^ 0xE51B] = 0xE530 ^ 0xE51B;
        kotakbaz.rain.module.modules.player.B.f[0x5460 ^ 0x557C] = 0x7721 ^ 0x557C;
        kotakbaz.rain.module.modules.player.B.f[0xD076 ^ 0xD0EF] = 0xD098 ^ 0xD0EF;
        kotakbaz.rain.module.modules.player.B.f[0x682F ^ 0x68F8] = 0x5560 ^ 0x68F8;
        kotakbaz.rain.module.modules.player.B.f[0x1927 ^ 0x181C] = 0xD22E ^ 0x181C;
        kotakbaz.rain.module.modules.player.B.f[0x4EC8 ^ 0x4E93] = 0xFFFFB17D ^ 0x4E93;
        kotakbaz.rain.module.modules.player.B.f[0x30E5 ^ 0x300A] = 0x4968 ^ 0x300A;
        kotakbaz.rain.module.modules.player.B.f[0xF108 ^ 0xF16A] = 0xFFFF0ECC ^ 0xF16A;
        kotakbaz.rain.module.modules.player.B.f[0x80CA ^ 0x81AD] = 0xE662 ^ 0x81AD;
        kotakbaz.rain.module.modules.player.B.f[0xC9E9 ^ 0xC9A5] = 0xFFFF365B ^ 0xC9A5;
        kotakbaz.rain.module.modules.player.B.f[0x5144 ^ 0x5172] = 0x5172 ^ 0x5172;
        kotakbaz.rain.module.modules.player.B.f[0xED0C ^ 0xED2F] = 0xED41 ^ 0xED2F;
        kotakbaz.rain.module.modules.player.B.f[0x2B24 ^ 0x2A3A] = 0xFFFFF7AB ^ 0x2A3A;
        kotakbaz.rain.module.modules.player.B.f[0x10263 ^ 0x102DE] = 0x10DFE ^ 0x102DE;
        kotakbaz.rain.module.modules.player.B.f[0x2AEF ^ 0x2A75] = 0xFFFFD5B4 ^ 0x2A75;
        kotakbaz.rain.module.modules.player.B.f[0xB357 ^ 0xB30D] = 0xFFFF4CEE ^ 0xB30D;
        kotakbaz.rain.module.modules.player.B.f[0xB2E1 ^ 0xB22E] = 0xFFFFE036 ^ 0xB22E;
        kotakbaz.rain.module.modules.player.B.f[0xB457 ^ 0xB48D] = 0x7037 ^ 0xB48D;
        kotakbaz.rain.module.modules.player.B.f[0xF4B0 ^ 0xF4D9] = 0xF4EF ^ 0xF4D9;
        kotakbaz.rain.module.modules.player.B.f[0x59DD ^ 0x5928] = 0x9F24 ^ 0x5928;
        kotakbaz.rain.module.modules.player.B.f[0xF9AE ^ 0xF899] = 0xE9A4 ^ 0xF899;
        kotakbaz.rain.module.modules.player.B.f[0x4C33 ^ 0x4D5F] = 0x4D5F ^ 0x4D5F;
        kotakbaz.rain.module.modules.player.B.f[0x2AAA ^ 0x2ACD] = 0x2AB6 ^ 0x2ACD;
        kotakbaz.rain.module.modules.player.B.f[0xF45A ^ 0xF481] = 0xFFFFCFB8 ^ 0xF481;
        kotakbaz.rain.module.modules.player.B.f[0xC1AF ^ 0xC0F2] = 0x78AD ^ 0xC0F2;
        kotakbaz.rain.module.modules.player.B.f[0xFA8B ^ 0xFA65] = 0xFFFF7CF4 ^ 0xFA65;
        kotakbaz.rain.module.modules.player.B.f[0xF345 ^ 0xF3BB] = 0xFFFFD717 ^ 0xF3BB;
        kotakbaz.rain.module.modules.player.B.f[0x4E72 ^ 0x4FF4] = 0x4FE5 ^ 0x4FF4;
        kotakbaz.rain.module.modules.player.B.f[0x8996 ^ 0x8920] = 0xBD1C ^ 0x8920;
        kotakbaz.rain.module.modules.player.B.f[0x17F7 ^ 0x16F0] = 0x7DC5 ^ 0x16F0;
        kotakbaz.rain.module.modules.player.B.f[0x5700 ^ 0x5770] = 0xFFFFA89D ^ 0x5770;
        kotakbaz.rain.module.modules.player.B.f[0xC230 ^ 0xC31C] = 0x481D ^ 0xC31C;
        kotakbaz.rain.module.modules.player.B.f[0xB247 ^ 0xB2B8] = 0x69AE ^ 0xB2B8;
        kotakbaz.rain.module.modules.player.B.f[0x287B ^ 0x2839] = 0x88 ^ 0x2839;
        kotakbaz.rain.module.modules.player.B.f[0xF17A ^ 0xF1C2] = 0xC5FE ^ 0xF1C2;
        kotakbaz.rain.module.modules.player.B.f[0x652F ^ 0x65DB] = 0xA3DA ^ 0x65DB;
        kotakbaz.rain.module.modules.player.B.f[0x8786 ^ 0x86FD] = 0x8800 ^ 0x86FD;
        kotakbaz.rain.module.modules.player.B.f[0xEC48 ^ 0xEC20] = 0xEC75 ^ 0xEC20;
        kotakbaz.rain.module.modules.player.B.f[0xF5E0 ^ 0xF4A6] = 0xFFFF5DCC ^ 0xF4A6;
        kotakbaz.rain.module.modules.player.B.f[0x4FD8 ^ 0x4EB0] = 0x4EB0 ^ 0x4EB0;
        kotakbaz.rain.module.modules.player.B.f[0x73ED ^ 0x72B1] = 0xCAFD ^ 0x72B1;
        kotakbaz.rain.module.modules.player.B.f[0xBA8 ^ 0xA82] = 0xFFFF16DA ^ 0xA82;
        kotakbaz.rain.module.modules.player.B.f[0x72EF ^ 0x7397] = 0xC50E ^ 0x7397;
        kotakbaz.rain.module.modules.player.B.f[0x8A0C ^ 0x8AF4] = 0x18105 ^ 0x8AF4;
        kotakbaz.rain.module.modules.player.B.f[0x7850 ^ 0x7809] = 0xFFFF87FD ^ 0x7809;
        kotakbaz.rain.module.modules.player.B.f[0xC2E2 ^ 0xC25B] = 0xA692 ^ 0xC25B;
        kotakbaz.rain.module.modules.player.B.f[0x1AAE ^ 0x1AED] = 0x453E ^ 0x1AED;
        kotakbaz.rain.module.modules.player.B.f[0x67CD ^ 0x6779] = 0x66D0 ^ 0x6779;
        kotakbaz.rain.module.modules.player.B.f[0x10A43 ^ 0x10AF9] = 0x16E3C ^ 0x10AF9;
        kotakbaz.rain.module.modules.player.B.f[0x1FE2 ^ 0x1EB6] = 0xFD66 ^ 0x1EB6;
        kotakbaz.rain.module.modules.player.B.f[0x1427 ^ 0x1484] = 0xABE3 ^ 0x1484;
        kotakbaz.rain.module.modules.player.B.f[0x76F3 ^ 0x7658] = 0xB7D ^ 0x7658;
        kotakbaz.rain.module.modules.player.B.f[0x7416 ^ 0x7439] = 0xFFFF8BA8 ^ 0x7439;
        kotakbaz.rain.module.modules.player.B.f[0x43A6 ^ 0x42F3] = 0xA13D ^ 0x42F3;
        kotakbaz.rain.module.modules.player.B.f[0x1021F ^ 0x10271] = 0x10253 ^ 0x10271;
        kotakbaz.rain.module.modules.player.B.f[0x6DA5 ^ 0x6DEB] = 0xFFFF9269 ^ 0x6DEB;
        kotakbaz.rain.module.modules.player.B.f[0x773D ^ 0x7612] = 0xFD03 ^ 0x7612;
        kotakbaz.rain.module.modules.player.B.f[0xFC32 ^ 0xFD73] = 0x4E65 ^ 0xFD73;
        kotakbaz.rain.module.modules.player.B.f[0xCB40 ^ 0xCA37] = 0x8960 ^ 0xCA37;
        kotakbaz.rain.module.modules.player.B.f[0xC29 ^ 0xCB7] = 0xCB5 ^ 0xCB7;
        kotakbaz.rain.module.modules.player.B.f[0x424D ^ 0x42D5] = 0xFFFFBD0B ^ 0x42D5;
        kotakbaz.rain.module.modules.player.B.f[0x59D5 ^ 0x5901] = 0xBB93 ^ 0x5901;
        kotakbaz.rain.module.modules.player.B.f[0x9E2C ^ 0x9EB8] = 0x9E35 ^ 0x9EB8;
        kotakbaz.rain.module.modules.player.B.f[0xDB84 ^ 0xDAEB] = 0xF229 ^ 0xDAEB;
        kotakbaz.rain.module.modules.player.B.f[0xFB55 ^ 0xFB0D] = 0xFFFF04FA ^ 0xFB0D;
        kotakbaz.rain.module.modules.player.B.f[0x5869 ^ 0x594E] = 0x473B ^ 0x594E;
        kotakbaz.rain.module.modules.player.B.f[0x3CA4 ^ 0x3C58] = 0xE753 ^ 0x3C58;
        kotakbaz.rain.module.modules.player.B.f[0x2A90 ^ 0x2BC2] = 0xFFFFDDCD ^ 0x2BC2;
        kotakbaz.rain.module.modules.player.B.f[0x744F ^ 0x7400] = 0x7436 ^ 0x7400;
        kotakbaz.rain.module.modules.player.B.f[0xE62E ^ 0xE6A8] = 0xFFFF1926 ^ 0xE6A8;
        kotakbaz.rain.module.modules.player.B.f[0x3189 ^ 0x31E6] = 0xFFFFCE2D ^ 0x31E6;
        kotakbaz.rain.module.modules.player.B.f[0x99BA ^ 0x9976] = 0xD044 ^ 0x9976;
        kotakbaz.rain.module.modules.player.B.f[0xE454 ^ 0xE51C] = 0xD03E ^ 0xE51C;
        kotakbaz.rain.module.modules.player.B.f[0xF49F ^ 0xF5EE] = 0x8969 ^ 0xF5EE;
        kotakbaz.rain.module.modules.player.B.f[0x5F8D ^ 0x5EB1] = 0xB2B4 ^ 0x5EB1;
        kotakbaz.rain.module.modules.player.B.f[0x4D57 ^ 0x4DA6] = 0x11D7 ^ 0x4DA6;
        kotakbaz.rain.module.modules.player.B.f[0x7987 ^ 0x7951] = 0x44B0 ^ 0x7951;
        kotakbaz.rain.module.modules.player.B.f[0x3F68 ^ 0x3E2B] = 0x8D3D ^ 0x3E2B;
        kotakbaz.rain.module.modules.player.B.f[0x3939 ^ 0x39BE] = 0xFFFFC61F ^ 0x39BE;
        kotakbaz.rain.module.modules.player.B.f[0x45F5 ^ 0x4526] = 0xFFFF5851 ^ 0x4526;
        kotakbaz.rain.module.modules.player.B.f[0xBAEC ^ 0xBB66] = 0xFFFF44BF ^ 0xBB66;
        kotakbaz.rain.module.modules.player.B.f[0x1BBF ^ 0x1BCB] = 0xFFFFE466 ^ 0x1BCB;
        kotakbaz.rain.module.modules.player.B.f[0x1E25 ^ 0x1E0C] = 0x1E35 ^ 0x1E0C;
        kotakbaz.rain.module.modules.player.B.f[0xD506 ^ 0xD407] = 0x757F ^ 0xD407;
        kotakbaz.rain.module.modules.player.B.f[0x6049 ^ 0x6090] = 0xA42E ^ 0x6090;
        kotakbaz.rain.module.modules.player.B.f[0xF95 ^ 0xF09] = 0xFFFFF0EF ^ 0xF09;
        kotakbaz.rain.module.modules.player.B.f[0xF9D0 ^ 0xF94F] = 0xF94F ^ 0xF94F;
        kotakbaz.rain.module.modules.player.B.f[0x361B ^ 0x3765] = 0x3775 ^ 0x3765;
        kotakbaz.rain.module.modules.player.B.f[0xEB00 ^ 0xEA1D] = 0xC840 ^ 0xEA1D;
        kotakbaz.rain.module.modules.player.B.f[0x876 ^ 0x867] = 0xFFFFF7C5 ^ 0x867;
        kotakbaz.rain.module.modules.player.B.f[0xA65B ^ 0xA702] = 0x65C1 ^ 0xA702;
        kotakbaz.rain.module.modules.player.B.f[0xE86D ^ 0xE830] = 0xE855 ^ 0xE830;
        kotakbaz.rain.module.modules.player.B.f[0x10EF7 ^ 0x10E58] = 0x1E3B3 ^ 0x10E58;
        kotakbaz.rain.module.modules.player.B.f[0x6A70 ^ 0x6AB6] = 0x824E ^ 0x6AB6;
        kotakbaz.rain.module.modules.player.B.f[0xF921 ^ 0xF911] = 0xF979 ^ 0xF911;
        kotakbaz.rain.module.modules.player.B.f[0x92EC ^ 0x928F] = 0xFFFF6D0A ^ 0x928F;
        kotakbaz.rain.module.modules.player.B.f[0x100D2 ^ 0x101ED] = 0x1EDEF ^ 0x101ED;
        kotakbaz.rain.module.modules.player.B.f[0x9818 ^ 0x98D5] = 0x3544 ^ 0x98D5;
        kotakbaz.rain.module.modules.player.B.f[0x2303 ^ 0x2393] = 0x23DB ^ 0x2393;
        kotakbaz.rain.module.modules.player.B.f[0x1089A ^ 0x10812] = 0xFFFEF7BB ^ 0x10812;
        kotakbaz.rain.module.modules.player.B.f[0x5F5 ^ 0x491] = 0x6356 ^ 0x491;
        kotakbaz.rain.module.modules.player.B.f[0x5BF0 ^ 0x5AE0] = 0x8CE6 ^ 0x5AE0;
        kotakbaz.rain.module.modules.player.B.f[0xF4F9 ^ 0xF49D] = 0xF48D ^ 0xF49D;
        kotakbaz.rain.module.modules.player.B.f[0xF0F6 ^ 0xF1E0] = 0xFFFF063E ^ 0xF1E0;
        kotakbaz.rain.module.modules.player.B.f[0x38EF ^ 0x386B] = 0x380E ^ 0x386B;
        kotakbaz.rain.module.modules.player.B.f[0x3D60 ^ 0x3DDE] = 0x32F1 ^ 0x3DDE;
        kotakbaz.rain.module.modules.player.B.f[0xF273 ^ 0xF257] = 0xFFFF0DB9 ^ 0xF257;
        kotakbaz.rain.module.modules.player.B.f[0xF909 ^ 0xF858] = 0xF1D8 ^ 0xF858;
        kotakbaz.rain.module.modules.player.B.f[0x67D0 ^ 0x67C3] = 0xFFFF984F ^ 0x67C3;
        kotakbaz.rain.module.modules.player.B.f[0x35F ^ 0x34F] = 0xFFFFFCCB ^ 0x34F;
        kotakbaz.rain.module.modules.player.B.f[0x8505 ^ 0x8543] = 0x78FD ^ 0x8543;
        kotakbaz.rain.module.modules.player.B.f[0x977A ^ 0x9745] = 0x7A2A ^ 0x9745;
        kotakbaz.rain.module.modules.player.B.f[0x5B4A ^ 0x5BD7] = 0x5BD6 ^ 0x5BD7;
        kotakbaz.rain.module.modules.player.B.f[0xE66B ^ 0xE606] = 0xFFFF19CF ^ 0xE606;
        kotakbaz.rain.module.modules.player.B.f[0x444F ^ 0x442F] = 0x441C ^ 0x442F;
        kotakbaz.rain.module.modules.player.B.f[0xCE86 ^ 0xCE37] = 0xCF9D ^ 0xCE37;
        kotakbaz.rain.module.modules.player.B.f[0x93B5 ^ 0x93B5] = 0x93AC ^ 0x93B5;
        kotakbaz.rain.module.modules.player.B.f[0xCB19 ^ 0xCBD0] = 0x82EB ^ 0xCBD0;
        kotakbaz.rain.module.modules.player.B.f[0x38F1 ^ 0x38A0] = 0xFFFFC703 ^ 0x38A0;
        kotakbaz.rain.module.modules.player.B.f[0x647 ^ 0x737] = 0x9DD5 ^ 0x737;
        kotakbaz.rain.module.modules.player.B.f[0x9249 ^ 0x92E5] = 0xEFBC ^ 0x92E5;
        kotakbaz.rain.module.modules.player.B.f[0x404D ^ 0x4088] = 0xA87E ^ 0x4088;
        kotakbaz.rain.module.modules.player.B.f[0x8E13 ^ 0x8E26] = 0x8E27 ^ 0x8E26;
        kotakbaz.rain.module.modules.player.B.f[0xE986 ^ 0xE80E] = 0xFFFF1788 ^ 0xE80E;
        kotakbaz.rain.module.modules.player.B.f[0xFF66 ^ 0xFF14] = 0xFFFF00C5 ^ 0xFF14;
        kotakbaz.rain.module.modules.player.B.f[0x6F2E ^ 0x6FFB] = 0x521F ^ 0x6FFB;
        kotakbaz.rain.module.modules.player.B.f[0x7080 ^ 0x702E] = 0x9DF6 ^ 0x702E;
        kotakbaz.rain.module.modules.player.B.f[0x3F51 ^ 0x3FD3] = 0xFFFFC042 ^ 0x3FD3;
        kotakbaz.rain.module.modules.player.B.f[0x5164 ^ 0x51D7] = 0x500D ^ 0x51D7;
        kotakbaz.rain.module.modules.player.B.f[0xC317 ^ 0xC29E] = 0xC29F ^ 0xC29E;
        kotakbaz.rain.module.modules.player.B.f[0x794F ^ 0x798E] = 0xFEBB ^ 0x798E;
        kotakbaz.rain.module.modules.player.B.f[0xE9FC ^ 0xE9D2] = 0xE9B6 ^ 0xE9D2;
        kotakbaz.rain.module.modules.player.B.f[0x5D29 ^ 0x5D81] = 0x4D28 ^ 0x5D81;
        kotakbaz.rain.module.modules.player.B.f[0x4C5E ^ 0x4CA5] = 0x14757 ^ 0x4CA5;
        kotakbaz.rain.module.modules.player.B.f[0xF18B ^ 0xF0F4] = 0xF0FD ^ 0xF0F4;
        kotakbaz.rain.module.modules.player.B.f[0x58B8 ^ 0x58C9] = 0x58D5 ^ 0x58C9;
        kotakbaz.rain.module.modules.player.B.f[0xB7B0 ^ 0xB6E3] = 0xBF63 ^ 0xB6E3;
        kotakbaz.rain.module.modules.player.B.f[0xAAF9 ^ 0xAA32] = 0xE378 ^ 0xAA32;
        kotakbaz.rain.module.modules.player.B.f[0x4320 ^ 0x42A0] = 0xFFFFBD1B ^ 0x42A0;
        kotakbaz.rain.module.modules.player.B.f[0x7F24 ^ 0x7F1D] = 0x7F1D ^ 0x7F1D;
        kotakbaz.rain.module.modules.player.B.f[0x8B88 ^ 0x8BFF] = 0x8BD1 ^ 0x8BFF;
    }
}

