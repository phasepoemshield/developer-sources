/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

import java.awt.Color;
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
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.render.ClientColorModule;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotakbaz.rain.module.setting.settings.ColorSetting;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\u00168\u0006\u00a2\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a\u00a8\u0006\u001d"}, d2={"Lkotakbaz/rain/module/modules/render/ModuleCustomFog;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "useCustomFog", "()Z", "Ljava/awt/Color;", "resolvedFogColor", "()Ljava/awt/Color;", "", "original", "fogSkyArgb", "(I)I", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "useClientColor", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "fogColor", "Lkotakbaz/rain/module/setting/settings/ColorSetting;", "getFogColor", "()Lkotakbaz/rain/module/setting/settings/ColorSetting;", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "fogDistance", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "getFogDistance", "()Lkotakbaz/rain/module/setting/settings/SliderSetting;", "fogDensity", "getFogDensity", "rain-visuals"})
public final class ModuleCustomFog
extends Module {
    @NotNull
    public static final ModuleCustomFog INSTANCE;
    @NotNull
    private static final BooleanSetting a;
    @NotNull
    private static final ColorSetting A;
    @NotNull
    private static final SliderSetting b;
    @NotNull
    private static final SliderSetting B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    private ModuleCustomFog() {
        int n2 = E[0];
        n2 -= E[1];
        int n3 = E[3];
        n3 -= E[4];
        int n4 = E[6];
        n4 ^= E[7];
        super((String)c[n2 += E[2]], a_0.getRENDER(), (String)c[n3 += E[5]] + (String)c[n4 += E[8]]);
    }

    @NotNull
    public final ColorSetting getFogColor() {
        return A;
    }

    @NotNull
    public final SliderSetting getFogDistance() {
        return b;
    }

    @NotNull
    public final SliderSetting getFogDensity() {
        return B;
    }

    public final boolean useCustomFog() {
        return this.isEnabled();
    }

    @NotNull
    public final Color resolvedFogColor() {
        return (Boolean)a.getValue() != false && ClientColorModule.INSTANCE.isEnabled() ? ClientColorModule.INSTANCE.getClientColor() : (Color)A.getValue();
    }

    public final int fogSkyArgb(int original) {
        if (!this.useCustomFog()) {
            return original;
        }
        return this.resolvedFogColor().getRGB();
    }

    private static final boolean useClientColor$lambda$0() {
        return ClientColorModule.INSTANCE.isEnabled();
    }

    private static final boolean fogColor$lambda$0() {
        int n2;
        if (!((Boolean)a.getValue()).booleanValue() || !ClientColorModule.INSTANCE.isEnabled()) {
            int n3 = E[9];
            n3 -= E[10];
            n2 = n3 -= E[11];
        } else {
            int n4 = E[12];
            n4 ^= E[13];
            n2 = n4 -= E[14];
        }
        return n2 != 0;
    }

    static {
        ModuleCustomFog.b();
        long l2 = -3486126841277694982L;
        long l3 = 5393815142731800262L;
        long l4 = 9153045012786661201L;
        long l5 = -6087391993655560043L;
        long l6 = -1229877766080583202L;
        long l7 = -5978991071767680001L;
        long l8 = -5188210815031667665L;
        long l9 = 5934542454794873233L;
        long l10 = -2993251115680092748L;
        long l11 = -7513173158409648756L;
        long l12 = 2636432979382163381L;
        long l13 = 7517692874433885692L;
        long l14 = -7387693372704183419L;
        long l15 = 8545240693373181449L;
        int n2 = E[15];
        n2 += E[16];
        c = new Object[n2 -= E[17]];
        long l16 = l15;
        int n3 = E[18];
        n3 += E[19];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= E[20]);
        Object[] objectArray = new Object[E[21]];
        objectArray[ModuleCustomFog.E[22]] = C;
        objectArray[ModuleCustomFog.E[23]] = E[24];
        int n4 = E[25];
        Object object = ModuleCustomFog.A()[E[26]];
        if (object == null) {
            char[] cArray = "\u03cd\u03cd\u0148\u012c\u03c3\u0174\u0126\u0114\u0179\u0114\u011d\u011b\u0122\u0104\u0155\u0124\u016b\u0177\u0110\u0100\u0109\u0172\u012e\u0100\u012d\u0174\u0108\u0168\u0108\u0169\u03cf\u03cf\u012e\u010b\u012f\u0123\u0175\u0127\u017b\u03cc\u0114\u0179\u0117\u03c4\u0109\u010d\u0168\u012c\u0121\u0109\u03cc\u0155\u012f\u03c3\u0127\u0172\u010d\u0104\u012d\u0172\u017b\u0119\u03c3\u0101\u03c7\u0106\u03ce\u03c2\u0127\u03c3\u010a\u014b\u0127\u014b\u03cc\u0108\u0339\u0107\u03cc\u0127\u0116\u016b\u03cf\u0104\u0100\u0112\u0107\u03cf\u0117\u017d\u010a\u010d\u0123\u012e\u0127\u012e\u0100\u03c1\u011d\u011d\u016b\u0174\u0127\u03cc\u0117\u017a\u0109\u0114\u011d\u0172\u0172\u0168\u0113\u0176\u0174\u011b\u017b\u0110\u0103\u0175\u0168\u03c0\u0179\u0106\u0120\u0168\u0101\u0179\u0122\u0124\u0110\u0108\u012d\u017a\u0124\u0176\u0114\u0113\u0106\u0103\u03c7\u0169\u0103\u03c4\u03c1\u011b\u0117\u017a\u0170\u0339\u03cd\u0101\u0122\u0172\u0177\u0177\u0113\u0109\u0124\u0106\u0124\u011a\u03c6\u0120\u017b\u03cf\u0104\u0176\u0119\u0114\u0113\u012c\u0121\u0114\u0174\u03c6\u017a\u0100\u0155\u0169\u0104\u0148\u016a\u014a\u0106\u016a\u0114\u0109\u0123\u0120\u017b\u0177\u03cd\u0173\u017a\u0170\u0177\u0117\u0110\u0124\u0106\u011b\u03cd\u0107\u0103\u0115\u0108\u0179\u03cd\u0100\u0108\u016b\u0124\u0172\u03c1\u0179\u03ce\u0172\u0121\u0117\u0117\u0124\u0101\u012f\u0175\u0117\u03c4\u0148\u0172\u0339\u0148\u0120\u0155\u0101\u0104\u0179\u0116\u0169\u017a\u0109\u0115\u010b\u0103\u0114\u0110\u011d\u0176\u0113\u0113\u012e\u0103\u014b\u0176\u010b\u0155\u0155".toCharArray();
            for (int i2 = E[27]; i2 < E[28]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= E[29];
                n5 += E[30];
                n5 += E[31];
                n5 ^= E[32];
                n5 -= E[33];
                n5 += E[34];
                n5 ^= E[35];
                n5 -= E[36];
                n5 -= E[37];
                n5 ^= E[38];
                n5 -= E[39];
                n5 -= E[40];
                cArray[i2] = (char)(n5 += E[41]);
            }
            object = ModuleCustomFog.A()[ModuleCustomFog.E[42]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ModuleCustomFog.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = E[43];
        n6 -= E[44];
        l6 = l17 ^ (0x6200000000L ^ l17) & -1L << (n6 ^= E[45]);
        long l18 = l13;
        int n7 = E[46];
        n7 += E[47];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += E[48]);
        while (true) {
            int n8 = E[49];
            n8 += E[50];
            if ((int)l13 >= (int)(l6 >>> (n8 -= E[51]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = E[52];
            n10 ^= E[53];
            int n11 = E[55];
            n11 += E[56];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += E[54])) & -1L >>> (n11 ^= E[57]);
            long l20 = l9;
            int n12 = E[58];
            n12 ^= E[59];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= E[60]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = E[61];
            n14 ^= E[62];
            int n15 = E[64];
            n15 += E[65];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += E[63])) & -1L >>> (n15 ^= E[66]);
            int n16 = E[67];
            n16 -= E[68];
            long l22 = l10;
            int n17 = E[70];
            n17 += E[71];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= E[69]) ^ l22) & -1L << (n17 += E[72]);
            int n18 = E[73];
            n18 ^= E[74];
            n18 ^= E[75];
            int n19 = E[76];
            n19 += E[77];
            long l23 = l12;
            int n20 = E[79];
            n20 ^= E[80];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= E[78]))) ^ l23) & -1L >>> (n20 += E[81]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = E[82];
            n21 ^= E[83];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += E[84]);
            while (true) {
                int n22 = E[85];
                n22 -= E[86];
                if ((int)(l14 >>> (n22 ^= E[87])) >= (int)l12) break;
                int n23 = E[88];
                n23 ^= E[89];
                int n24 = E[91];
                n24 ^= E[92];
                cArray2[(int)(l14 >>> (n23 -= ModuleCustomFog.E[90]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= E[93]))];
                l14 += 0x100000000L;
            }
            int n25 = E[94];
            n25 -= E[95];
            int n26 = (int)(l15 >>> (n25 -= E[96]));
            l15 += 0x100000000L;
            ModuleCustomFog.c[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = E[97];
            n27 += E[98];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= E[99]);
        }
        INSTANCE = new ModuleCustomFog();
        int n28 = E[100];
        n28 ^= E[101];
        boolean bl = E[103];
        bl += E[104];
        a = INSTANCE.cfr_renamed_0((String)c[n28 ^= E[102]], bl -= E[105]).setVisible(ModuleCustomFog::useClientColor$lambda$0);
        int n29 = E[106];
        n29 ^= E[107];
        String string = (String)c[n29 += E[108]];
        Color color = Color.WHITE;
        int n30 = E[109];
        n30 -= E[110];
        Intrinsics.checkNotNullExpressionValue(color, (String)c[n30 -= E[111]]);
        A = INSTANCE.color(string, color).setVisible(ModuleCustomFog::fogColor$lambda$0);
        int n31 = E[112];
        n31 -= E[113];
        b = INSTANCE.slider((String)c[n31 += E[114]], -8.0f, -8.0f, 25.0f, 1.0f);
        int n32 = E[115];
        n32 ^= E[116];
        B = INSTANCE.slider((String)c[n32 -= E[117]], 100.0f, 0.0f, 100.0f, 1.0f);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[E[118]];
        String string = (String)object[E[119]];
        object = object[E[120]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[121]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[122]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[124] ^ E[125]];
                byArray[ModuleCustomFog.E[126] ^ ModuleCustomFog.E[127]] = E[128] ^ E[129];
                byArray[ModuleCustomFog.E[130] ^ ModuleCustomFog.E[131]] = E[132] ^ E[133];
                byArray[ModuleCustomFog.E[134] ^ ModuleCustomFog.E[135]] = E[136] ^ E[137];
                byArray[ModuleCustomFog.E[138] ^ ModuleCustomFog.E[139]] = E[140] ^ E[141];
                byArray[ModuleCustomFog.E[142] ^ ModuleCustomFog.E[143]] = E[144] ^ E[145];
                byArray[ModuleCustomFog.E[146] ^ ModuleCustomFog.E[147]] = E[148] ^ E[149];
                byArray[ModuleCustomFog.E[150] ^ ModuleCustomFog.E[151]] = E[152] ^ E[153];
                byArray[ModuleCustomFog.E[154] ^ ModuleCustomFog.E[155]] = E[156] ^ E[157];
                byArray[ModuleCustomFog.E[158] ^ ModuleCustomFog.E[159]] = E[160] ^ E[161];
                byArray[ModuleCustomFog.E[162] ^ ModuleCustomFog.E[163]] = E[164] ^ E[165];
                byArray[ModuleCustomFog.E[166] ^ ModuleCustomFog.E[167]] = E[168] ^ E[169];
                byArray[ModuleCustomFog.E[170] ^ ModuleCustomFog.E[171]] = E[172] ^ E[173];
                byArray[ModuleCustomFog.E[174] ^ ModuleCustomFog.E[175]] = E[176] ^ E[177];
                byArray[ModuleCustomFog.E[178] ^ ModuleCustomFog.E[179]] = E[180] ^ E[181];
                byArray[ModuleCustomFog.E[182] ^ ModuleCustomFog.E[183]] = E[184] ^ E[185];
                byArray[ModuleCustomFog.E[186] ^ ModuleCustomFog.E[187]] = E[188] ^ E[189];
                objectArray2[ModuleCustomFog.E[123]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[190]];
            if (d == null) {
                byte[] byArray2 = new byte[E[191] ^ E[192]];
                byArray2[ModuleCustomFog.E[193] ^ ModuleCustomFog.E[194]] = E[195] ^ E[196];
                byArray2[ModuleCustomFog.E[197] ^ ModuleCustomFog.E[198]] = E[199] ^ E[200];
                byArray2[ModuleCustomFog.E[201] ^ ModuleCustomFog.E[202]] = E[203] ^ E[204];
                byArray2[ModuleCustomFog.E[205] ^ ModuleCustomFog.E[206]] = E[207] ^ E[208];
                byArray2[ModuleCustomFog.E[209] ^ ModuleCustomFog.E[210]] = E[211] ^ E[212];
                byArray2[ModuleCustomFog.E[213] ^ ModuleCustomFog.E[214]] = E[215] ^ E[216];
                byArray2[ModuleCustomFog.E[217] ^ ModuleCustomFog.E[218]] = E[219] ^ E[220];
                byArray2[ModuleCustomFog.E[221] ^ ModuleCustomFog.E[222]] = E[223] ^ E[224];
                byArray2[ModuleCustomFog.E[225] ^ ModuleCustomFog.E[226]] = E[227] ^ E[228];
                byArray2[ModuleCustomFog.E[229] ^ ModuleCustomFog.E[230]] = E[231] ^ E[232];
                byArray2[ModuleCustomFog.E[233] ^ ModuleCustomFog.E[234]] = E[235] ^ E[236];
                byArray2[ModuleCustomFog.E[237] ^ ModuleCustomFog.E[238]] = E[239] ^ E[240];
                byArray2[ModuleCustomFog.E[241] ^ ModuleCustomFog.E[242]] = E[243] ^ E[244];
                byArray2[ModuleCustomFog.E[245] ^ ModuleCustomFog.E[246]] = E[247] ^ E[248];
                byArray2[ModuleCustomFog.E[249] ^ ModuleCustomFog.E[250]] = E[251] ^ E[252];
                byArray2[ModuleCustomFog.E[253] ^ ModuleCustomFog.E[254]] = E[255] ^ E[256];
                byArray2[ModuleCustomFog.E[257] ^ ModuleCustomFog.E[258]] = E[259] ^ E[260];
                byArray2[ModuleCustomFog.E[261] ^ ModuleCustomFog.E[262]] = E[263] ^ E[264];
                byArray2[ModuleCustomFog.E[265] ^ ModuleCustomFog.E[266]] = E[267] ^ E[268];
                byArray2[ModuleCustomFog.E[269] ^ ModuleCustomFog.E[270]] = E[271] ^ E[272];
                byArray2[ModuleCustomFog.E[273] ^ ModuleCustomFog.E[274]] = E[275] ^ E[276];
                byArray2[ModuleCustomFog.E[277] ^ ModuleCustomFog.E[278]] = E[279] ^ E[280];
                byArray2[ModuleCustomFog.E[281] ^ ModuleCustomFog.E[282]] = E[283] ^ E[284];
                byArray2[ModuleCustomFog.E[285] ^ ModuleCustomFog.E[286]] = E[287] ^ E[288];
                byArray2[ModuleCustomFog.E[289] ^ ModuleCustomFog.E[290]] = E[291] ^ E[292];
                byArray2[ModuleCustomFog.E[293] ^ ModuleCustomFog.E[294]] = E[295] ^ E[296];
                byArray2[ModuleCustomFog.E[297] ^ ModuleCustomFog.E[298]] = E[299] ^ E[300];
                byArray2[ModuleCustomFog.E[301] ^ ModuleCustomFog.E[302]] = E[303] ^ E[304];
                byArray2[ModuleCustomFog.E[305] ^ ModuleCustomFog.E[306]] = E[307] ^ E[308];
                byArray2[ModuleCustomFog.E[309] ^ ModuleCustomFog.E[310]] = E[311] ^ E[312];
                byArray2[ModuleCustomFog.E[313] ^ ModuleCustomFog.E[314]] = E[315] ^ E[316];
                byArray2[ModuleCustomFog.E[317] ^ ModuleCustomFog.E[318]] = E[319] ^ E[320];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, E[321], byArray3, E[322], byArray.length);
                System.arraycopy(byArray2, E[323], byArray3, byArray.length, byArray2.length);
                Object object4 = ModuleCustomFog.A()[E[324]];
                if (object4 == null) {
                    char[] cArray = "\ua879\uaac7\ua87e\uaacd\uaacb\uaa17\ua86a\uaaa0\uaadd\uaaa1\ua841\uaac4\ub428\ub426\ua876\ua841\uaac8\uaa18".toCharArray();
                    for (int i2 = E[325]; i2 < E[326]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= E[327];
                        n3 -= E[328];
                        n3 ^= E[329];
                        n3 ^= E[330];
                        n3 -= E[331];
                        n3 -= E[332];
                        n3 -= E[333];
                        n3 += E[334];
                        n3 ^= E[335];
                        n3 -= E[336];
                        n3 ^= E[337];
                        n3 ^= E[338];
                        cArray[i2] = (char)(n3 += E[339]);
                    }
                    object4 = ModuleCustomFog.A()[ModuleCustomFog.E[340]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[E[341]];
                byArray4[ModuleCustomFog.E[342]] = E[343];
                byArray4[ModuleCustomFog.E[344]] = E[345];
                byArray4[ModuleCustomFog.E[346]] = E[347];
                byArray4[ModuleCustomFog.E[348]] = E[349];
                byArray4[ModuleCustomFog.E[350]] = E[351];
                byArray4[ModuleCustomFog.E[352]] = E[353];
                byArray4[ModuleCustomFog.E[354]] = E[355];
                byArray4[ModuleCustomFog.E[356]] = E[357];
                byArray4[ModuleCustomFog.E[358]] = E[359];
                byArray4[ModuleCustomFog.E[360]] = E[361];
                byArray4[ModuleCustomFog.E[362]] = E[363];
                byArray4[ModuleCustomFog.E[364]] = E[365];
                byArray4[ModuleCustomFog.E[366]] = E[367];
                byArray4[ModuleCustomFog.E[368]] = E[369];
                byArray4[ModuleCustomFog.E[370]] = E[371];
                byArray4[ModuleCustomFog.E[372]] = E[373];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, E[374], E[375]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ModuleCustomFog.A()[E[376]];
                if (object5 == null) {
                    char[] cArray = "\u6425\u6429\u63fb".toCharArray();
                    for (int i3 = E[377]; i3 < E[378]; ++i3) {
                        int n4 = cArray[i3];
                        n4 += E[379];
                        n4 += E[380];
                        n4 += E[381];
                        n4 -= E[382];
                        n4 += E[383];
                        n4 -= E[384];
                        n4 ^= E[385];
                        n4 -= E[386];
                        n4 ^= E[387];
                        n4 -= E[388];
                        n4 -= E[389];
                        n4 -= E[390];
                        cArray[i3] = (char)(n4 ^= E[391]);
                    }
                    object5 = ModuleCustomFog.A()[ModuleCustomFog.E[392]] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, E[393], E[394]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, E[395], byArray6.length);
            Object object6 = ModuleCustomFog.A()[E[396]];
            if (object6 == null) {
                char[] cArray = "\u4c32\u4c36\u4b18\u4864\u4ae8\u4c31\u4ae8\u4864\u4c23\u4c30\u4ae8\u4b18\u4886\u4c23\u4b12\u4c47\u4c47\u4b1a\u4b1d\u4b1c".toCharArray();
                for (int i4 = E[397]; i4 < E[398]; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= E[399];
                    n5 ^= 0xF132;
                    n5 ^= 0xF9B2;
                    n5 += 48627;
                    n5 -= 30755;
                    n5 += 18180;
                    n5 ^= 0xC1A5;
                    n5 -= 7318;
                    n5 ^= 0x9199;
                    n5 += 15579;
                    cArray[i4] = (char)(n5 ^= 0xF4F);
                }
                object6 = ModuleCustomFog.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)d), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = e;
        if (e == null) {
            e = new Object[4];
            objectArray = e;
        }
        return objectArray;
    }

    public static void b() {
        E = new int[0x4EF4 ^ 0x4F64];
        ModuleCustomFog.E[0x174 ^ 0x1D2] = 0x8B9C ^ 0x1D2;
        ModuleCustomFog.E[0x49B8 ^ 0x497C] = 0xE896 ^ 0x497C;
        ModuleCustomFog.E[0xE174 ^ 0xE1FA] = 0xD543 ^ 0xE1FA;
        ModuleCustomFog.E[0x6E67 ^ 0x6E9E] = 0x6690 ^ 0x6E9E;
        ModuleCustomFog.E[0x69A1 ^ 0x69B7] = 0x69B7 ^ 0x69B7;
        ModuleCustomFog.E[0x6A42 ^ 0x6A46] = 0xFFFF95E0 ^ 0x6A46;
        ModuleCustomFog.E[0xBF0A ^ 0xBE44] = 0xDD11 ^ 0xBE44;
        ModuleCustomFog.E[0x2435 ^ 0x24CB] = 0xF4E2 ^ 0x24CB;
        ModuleCustomFog.E[0x49F ^ 0x4C8] = 0x4DF ^ 0x4C8;
        ModuleCustomFog.E[0x59D8 ^ 0x5890] = 0xE2F2 ^ 0x5890;
        ModuleCustomFog.E[0x3B81 ^ 0x3B4E] = 0xFFFF619E ^ 0x3B4E;
        ModuleCustomFog.E[0x69E9 ^ 0x68CA] = 0xE0A3 ^ 0x68CA;
        ModuleCustomFog.E[0x338E ^ 0x336E] = 0x8D00 ^ 0x336E;
        ModuleCustomFog.E[0xECDD ^ 0xECA5] = 0xECA5 ^ 0xECA5;
        ModuleCustomFog.E[0xFA86 ^ 0xFB0D] = 0xFB1D ^ 0xFB0D;
        ModuleCustomFog.E[0x1B18 ^ 0x1BF1] = 0x2FF2 ^ 0x1BF1;
        ModuleCustomFog.E[0x569A ^ 0x5681] = 0x5681 ^ 0x5681;
        ModuleCustomFog.E[0xEE64 ^ 0xEEBD] = 0x8E8C ^ 0xEEBD;
        ModuleCustomFog.E[0x101AE ^ 0x100E1] = 0x19D36 ^ 0x100E1;
        ModuleCustomFog.E[0xC1A ^ 0xD65] = 0xA02E ^ 0xD65;
        ModuleCustomFog.E[0xD124 ^ 0xD1D2] = 0x4B5C ^ 0xD1D2;
        ModuleCustomFog.E[0xE7CA ^ 0xE69E] = 0xE69F ^ 0xE69E;
        ModuleCustomFog.E[0x7C1A ^ 0x7D5A] = 0xE974 ^ 0x7D5A;
        ModuleCustomFog.E[0xCBF6 ^ 0xCB75] = 0x15A6 ^ 0xCB75;
        ModuleCustomFog.E[0xF4DD ^ 0xF470] = 0xCADA ^ 0xF470;
        ModuleCustomFog.E[0x189C ^ 0x19ED] = 0xFFFFE643 ^ 0x19ED;
        ModuleCustomFog.E[0x32C0 ^ 0x324A] = 0x34F ^ 0x324A;
        ModuleCustomFog.E[0xF445 ^ 0xF402] = 0xFFFF0BF7 ^ 0xF402;
        ModuleCustomFog.E[0x8D16 ^ 0x8DA6] = 0x1B98 ^ 0x8DA6;
        ModuleCustomFog.E[0x10616 ^ 0x106DA] = 0x166 ^ 0x106DA;
        ModuleCustomFog.E[0xA42 ^ 0xA79] = 0xA42 ^ 0xA79;
        ModuleCustomFog.E[0xB271 ^ 0xB2E8] = 0x72FE ^ 0xB2E8;
        ModuleCustomFog.E[0xA61B ^ 0xA62B] = 0xA673 ^ 0xA62B;
        ModuleCustomFog.E[0x2877 ^ 0x295B] = 0x9F2A ^ 0x295B;
        ModuleCustomFog.E[0xCF6C ^ 0xCF20] = 0xFFFF30F7 ^ 0xCF20;
        ModuleCustomFog.E[0x4F9F ^ 0x4EDB] = 0x4EDA ^ 0x4EDB;
        ModuleCustomFog.E[0x7FB0 ^ 0x7FB9] = 0xFFFF8087 ^ 0x7FB9;
        ModuleCustomFog.E[0x21AA ^ 0x2155] = 0xF130 ^ 0x2155;
        ModuleCustomFog.E[0xD377 ^ 0xD395] = 0xF242 ^ 0xD395;
        ModuleCustomFog.E[0x7CFE ^ 0x7CBA] = 0xFFFF8369 ^ 0x7CBA;
        ModuleCustomFog.E[0x4EE4 ^ 0x4ED9] = 0x4EF2 ^ 0x4ED9;
        ModuleCustomFog.E[0x4097 ^ 0x405A] = 0xE513 ^ 0x405A;
        ModuleCustomFog.E[0xEBF2 ^ 0xEAB8] = 0x96F0 ^ 0xEAB8;
        ModuleCustomFog.E[0x3A49 ^ 0x3A00] = 0xFFFFC587 ^ 0x3A00;
        ModuleCustomFog.E[0xFE3 ^ 0xF4C] = 0x9955 ^ 0xF4C;
        ModuleCustomFog.E[0x2BFB ^ 0x2A7F] = 0xF84B ^ 0x2A7F;
        ModuleCustomFog.E[0xA6D7 ^ 0xA7A4] = 0xA7A2 ^ 0xA7A4;
        ModuleCustomFog.E[0x87D3 ^ 0x87EA] = 0xFFFF7878 ^ 0x87EA;
        ModuleCustomFog.E[0xA53E ^ 0xA443] = 0x2B06 ^ 0xA443;
        ModuleCustomFog.E[0xDCD3 ^ 0xDCA2] = 0xFFFF236B ^ 0xDCA2;
        ModuleCustomFog.E[0x8346 ^ 0x8205] = 0x8205 ^ 0x8205;
        ModuleCustomFog.E[0x806C ^ 0x8041] = 0x800F ^ 0x8041;
        ModuleCustomFog.E[0xD2E ^ 0xD2F] = 0xFFFFF296 ^ 0xD2F;
        ModuleCustomFog.E[0xDFDC ^ 0xDF1F] = 0xFFFF816C ^ 0xDF1F;
        ModuleCustomFog.E[0xBE09 ^ 0xBF03] = 0xE15D ^ 0xBF03;
        ModuleCustomFog.E[0x1B04 ^ 0x1A3C] = 0x2AD5 ^ 0x1A3C;
        ModuleCustomFog.E[0xBC81 ^ 0xBD0F] = 0xBD1B ^ 0xBD0F;
        ModuleCustomFog.E[0x3902 ^ 0x3839] = 0xFFFF3A04 ^ 0x3839;
        ModuleCustomFog.E[0x6EC5 ^ 0x6FCE] = 0x31CA ^ 0x6FCE;
        ModuleCustomFog.E[0x75CD ^ 0x7595] = 0x757F ^ 0x7595;
        ModuleCustomFog.E[0xDF52 ^ 0xDF41] = 0xFFFF20AB ^ 0xDF41;
        ModuleCustomFog.E[0xC6A8 ^ 0xC67A] = 0xAE82 ^ 0xC67A;
        ModuleCustomFog.E[0xF76C ^ 0xF750] = 0xFFFF08B4 ^ 0xF750;
        ModuleCustomFog.E[0xA476 ^ 0xA409] = 0xEFF ^ 0xA409;
        ModuleCustomFog.E[0x2284 ^ 0x2296] = 0x22AB ^ 0x2296;
        ModuleCustomFog.E[0x9F82 ^ 0x9FA1] = 0xA432 ^ 0x9FA1;
        ModuleCustomFog.E[0x7CD9 ^ 0x7DE5] = 0x8058 ^ 0x7DE5;
        ModuleCustomFog.E[0x6F4E ^ 0x6F01] = 0xFFFF90FF ^ 0x6F01;
        ModuleCustomFog.E[0xF1B8 ^ 0xF0FA] = 0xF0FA ^ 0xF0FA;
        ModuleCustomFog.E[0x2B3F ^ 0x2A69] = 0x2A65 ^ 0x2A69;
        ModuleCustomFog.E[0xDE25 ^ 0xDEF6] = 0xFFFF49D5 ^ 0xDEF6;
        ModuleCustomFog.E[0x3C14 ^ 0x3C45] = 0x3C6D ^ 0x3C45;
        ModuleCustomFog.E[0x62AE ^ 0x624B] = 0x9C11 ^ 0x624B;
        ModuleCustomFog.E[0x4D32 ^ 0x4CBD] = 0x621C ^ 0x4CBD;
        ModuleCustomFog.E[0xA5DD ^ 0xA54D] = 0xFFFF6E1F ^ 0xA54D;
        ModuleCustomFog.E[0x4CF0 ^ 0x4DC5] = 0x7D3D ^ 0x4DC5;
        ModuleCustomFog.E[0x96DC ^ 0x97DB] = 0xFFFFEF64 ^ 0x97DB;
        ModuleCustomFog.E[0x1DC9 ^ 0x1D1F] = 0x60AE ^ 0x1D1F;
        ModuleCustomFog.E[0xE004 ^ 0xE09F] = 0xC255 ^ 0xE09F;
        ModuleCustomFog.E[0x26DE ^ 0x27F9] = 0xFFFFFFF0 ^ 0x27F9;
        ModuleCustomFog.E[0x57FC ^ 0x56EB] = 0xB2DD ^ 0x56EB;
        ModuleCustomFog.E[0x66DF ^ 0x66EE] = 0x6642 ^ 0x66EE;
        ModuleCustomFog.E[0xDB5B ^ 0xDB72] = 0xE7EF ^ 0xDB72;
        ModuleCustomFog.E[0x81BF ^ 0x8139] = 0xDA0B ^ 0x8139;
        ModuleCustomFog.E[0xDB09 ^ 0xDA33] = 0x278E ^ 0xDA33;
        ModuleCustomFog.E[0x9B4E ^ 0x9BCB] = 0x4518 ^ 0x9BCB;
        ModuleCustomFog.E[0x672A ^ 0x6733] = 0x6731 ^ 0x6733;
        ModuleCustomFog.E[0x43A3 ^ 0x42BF] = 0x2425 ^ 0x42BF;
        ModuleCustomFog.E[0x60C2 ^ 0x6066] = 0x8A21 ^ 0x6066;
        ModuleCustomFog.E[0xC5B1 ^ 0xC50E] = 0x815C ^ 0xC50E;
        ModuleCustomFog.E[0x484A ^ 0x48C7] = 0x79C8 ^ 0x48C7;
        ModuleCustomFog.E[0xBA47 ^ 0xBAB5] = 0xD363 ^ 0xBAB5;
        ModuleCustomFog.E[0xEA5B ^ 0xEB32] = 0xEB22 ^ 0xEB32;
        ModuleCustomFog.E[0x5F15 ^ 0x5F3F] = 0x5F3F ^ 0x5F3F;
        ModuleCustomFog.E[0x4ACA ^ 0x4BD3] = 0x2D55 ^ 0x4BD3;
        ModuleCustomFog.E[0x7CA5 ^ 0x7CEF] = 0xFFFF8334 ^ 0x7CEF;
        ModuleCustomFog.E[0x4368 ^ 0x4267] = 0xFFFFB702 ^ 0x4267;
        ModuleCustomFog.E[0x948C ^ 0x95A2] = 0xFFC6 ^ 0x95A2;
        ModuleCustomFog.E[0xB992 ^ 0xB927] = 0xCA69 ^ 0xB927;
        ModuleCustomFog.E[0x3A68 ^ 0x3B5F] = 0xBBF ^ 0x3B5F;
        ModuleCustomFog.E[0x8777 ^ 0x867B] = 0xD825 ^ 0x867B;
        ModuleCustomFog.E[0x543D ^ 0x5458] = 0xFFFFAB9C ^ 0x5458;
        ModuleCustomFog.E[0x410C ^ 0x4008] = 0xEEF0 ^ 0x4008;
        ModuleCustomFog.E[0xB561 ^ 0xB43E] = 0xB41D ^ 0xB43E;
        ModuleCustomFog.E[0x120C ^ 0x1299] = 0x5781 ^ 0x1299;
        ModuleCustomFog.E[0xF914 ^ 0xF820] = 0x2EBE ^ 0xF820;
        ModuleCustomFog.E[0xAC13 ^ 0xACAE] = 0x9D6E ^ 0xACAE;
        ModuleCustomFog.E[0x43F6 ^ 0x43D2] = 0xEB41 ^ 0x43D2;
        ModuleCustomFog.E[0x35D5 ^ 0x345D] = 0x345F ^ 0x345D;
        ModuleCustomFog.E[0x7272 ^ 0x7213] = 0xFFFF8DE0 ^ 0x7213;
        ModuleCustomFog.E[0x14F4 ^ 0x14A6] = 0x1486 ^ 0x14A6;
        ModuleCustomFog.E[0xCAEE ^ 0xCA61] = 0xFEDE ^ 0xCA61;
        ModuleCustomFog.E[0xBD0C ^ 0xBD87] = 0x8C88 ^ 0xBD87;
        ModuleCustomFog.E[0x84A8 ^ 0x84C3] = 0x84E8 ^ 0x84C3;
        ModuleCustomFog.E[0x4735 ^ 0x4755] = 0xFFFFB8E3 ^ 0x4755;
        ModuleCustomFog.E[0x3AF3 ^ 0x3ABB] = 0x3AE5 ^ 0x3ABB;
        ModuleCustomFog.E[0xF945 ^ 0xF939] = 0x7F17 ^ 0xF939;
        ModuleCustomFog.E[0x4364 ^ 0x4257] = 0xFFFF6B7F ^ 0x4257;
        ModuleCustomFog.E[0x2EBF ^ 0x2E61] = 0x900F ^ 0x2E61;
        ModuleCustomFog.E[0x829 ^ 0x85A] = 0x81B ^ 0x85A;
        ModuleCustomFog.E[0x8B24 ^ 0x8A3A] = 0x788A ^ 0x8A3A;
        ModuleCustomFog.E[0x1486 ^ 0x14DB] = 0xFFFFEB13 ^ 0x14DB;
        ModuleCustomFog.E[0xD0D8 ^ 0xD076] = 0x4661 ^ 0xD076;
        ModuleCustomFog.E[0x86B1 ^ 0x87DF] = 0x87D0 ^ 0x87DF;
        ModuleCustomFog.E[0x2860 ^ 0x2890] = 0x12EAB ^ 0x2890;
        ModuleCustomFog.E[0x50AE ^ 0x50DE] = 0x50EA ^ 0x50DE;
        ModuleCustomFog.E[0x3AC5 ^ 0x3AAC] = 0xFFFFC53D ^ 0x3AAC;
        ModuleCustomFog.E[0xCB07 ^ 0xCB2C] = 0xCBA6 ^ 0xCB2C;
        ModuleCustomFog.E[0x42DC ^ 0x42F2] = 0xFFFFBD0C ^ 0x42F2;
        ModuleCustomFog.E[0x5CF2 ^ 0x5DCD] = 0xFFFF362F ^ 0x5DCD;
        ModuleCustomFog.E[0x96B4 ^ 0x96D2] = 0xFFFF6902 ^ 0x96D2;
        ModuleCustomFog.E[0xFAA7 ^ 0xFAAF] = 0xFAE0 ^ 0xFAAF;
        ModuleCustomFog.E[0x955E ^ 0x955E] = 0xFFFF6A32 ^ 0x955E;
        ModuleCustomFog.E[0x4035 ^ 0x4020] = 0x4023 ^ 0x4020;
        ModuleCustomFog.E[0x7ABE ^ 0x7ACB] = 0xFFFF8578 ^ 0x7ACB;
        ModuleCustomFog.E[0x8751 ^ 0x8786] = 0xFFFF0593 ^ 0x8786;
        ModuleCustomFog.E[0xE9F ^ 0xFA6] = 0xF214 ^ 0xFA6;
        ModuleCustomFog.E[0xB18B ^ 0xB09D] = 0x54A5 ^ 0xB09D;
        ModuleCustomFog.E[0x3012 ^ 0x3155] = 0xAB35 ^ 0x3155;
        ModuleCustomFog.E[0x43A5 ^ 0x428F] = 0xF4FE ^ 0x428F;
        ModuleCustomFog.E[0x511D ^ 0x51B4] = 0xDBF7 ^ 0x51B4;
        ModuleCustomFog.E[0xB7EB ^ 0xB737] = 0xD71D ^ 0xB737;
        ModuleCustomFog.E[0xD356 ^ 0xD39E] = 0x83E9 ^ 0xD39E;
        ModuleCustomFog.E[0x10506 ^ 0x10466] = 0x10468 ^ 0x10466;
        ModuleCustomFog.E[0x1006A ^ 0x1011F] = 0xFFFEFEAD ^ 0x1011F;
        ModuleCustomFog.E[0xA961 ^ 0xA9D3] = 0xDA94 ^ 0xA9D3;
        ModuleCustomFog.E[0x3747 ^ 0x361A] = 0xFFFFC9D1 ^ 0x361A;
        ModuleCustomFog.E[0x1962 ^ 0x1806] = 0x180E ^ 0x1806;
        ModuleCustomFog.E[0x10BA9 ^ 0x10B76] = 0xFFFE4AA2 ^ 0x10B76;
        ModuleCustomFog.E[0xF23D ^ 0xF27B] = 0xFFFF0DB6 ^ 0xF27B;
        ModuleCustomFog.E[0x66CF ^ 0x6625] = 0x522C ^ 0x6625;
        ModuleCustomFog.E[0x5560 ^ 0x550A] = 0xFFFFAAB5 ^ 0x550A;
        ModuleCustomFog.E[0x102C0 ^ 0x102AF] = 0x102E0 ^ 0x102AF;
        ModuleCustomFog.E[0x779E ^ 0x7717] = 0x2C2A ^ 0x7717;
        ModuleCustomFog.E[0x1565 ^ 0x15C6] = 0xFF9F ^ 0x15C6;
        ModuleCustomFog.E[0x33C1 ^ 0x337A] = 0x2BA ^ 0x337A;
        ModuleCustomFog.E[0x47A1 ^ 0x4760] = 0xE681 ^ 0x4760;
        ModuleCustomFog.E[0x10D1 ^ 0x11A1] = 0x11A8 ^ 0x11A1;
        ModuleCustomFog.E[0x84C9 ^ 0x8585] = 0x95B6 ^ 0x8585;
        ModuleCustomFog.E[0xF9C9 ^ 0xF945] = 0xC827 ^ 0xF945;
        ModuleCustomFog.E[0x7ABE ^ 0x7A7E] = 0x3E0C ^ 0x7A7E;
        ModuleCustomFog.E[0x6765 ^ 0x67ED] = 0xFFFFC33B ^ 0x67ED;
        ModuleCustomFog.E[0x7A46 ^ 0x7A43] = 0xFFFF85C0 ^ 0x7A43;
        ModuleCustomFog.E[0xCFBF ^ 0xCF5B] = 0xEE8C ^ 0xCF5B;
        ModuleCustomFog.E[0x101F9 ^ 0x100A3] = 0x100A2 ^ 0x100A3;
        ModuleCustomFog.E[0x9EC3 ^ 0x9EE5] = 0x739E ^ 0x9EE5;
        ModuleCustomFog.E[0x10D9C ^ 0x10CB4] = 0x12B33 ^ 0x10CB4;
        ModuleCustomFog.E[0x9E25 ^ 0x9F01] = 0x1711 ^ 0x9F01;
        ModuleCustomFog.E[0x7DCC ^ 0x7D6D] = 0x68F5 ^ 0x7D6D;
        ModuleCustomFog.E[0x23AC ^ 0x23B2] = 0xED17 ^ 0x23B2;
        ModuleCustomFog.E[0x4F63 ^ 0x4F3D] = 0xFFFFB04C ^ 0x4F3D;
        ModuleCustomFog.E[0x4F59 ^ 0x4EDB] = 0xFB29 ^ 0x4EDB;
        ModuleCustomFog.E[0x257B ^ 0x2472] = 0x7A2A ^ 0x2472;
        ModuleCustomFog.E[0x9A87 ^ 0x9AC2] = 0xFFFF6573 ^ 0x9AC2;
        ModuleCustomFog.E[0xF485 ^ 0xF509] = 0xF50A ^ 0xF509;
        ModuleCustomFog.E[0x630 ^ 0x6DB] = 0x32CD ^ 0x6DB;
        ModuleCustomFog.E[0x6155 ^ 0x603A] = 0x601D ^ 0x603A;
        ModuleCustomFog.E[0x99EC ^ 0x98E1] = 0x9257 ^ 0x98E1;
        ModuleCustomFog.E[0xF38D ^ 0xF2D1] = 0xF2D1 ^ 0xF2D1;
        ModuleCustomFog.E[0x905D ^ 0x9096] = 0x19753 ^ 0x9096;
        ModuleCustomFog.E[0x10C9A ^ 0x10CF9] = 0xFFFEF319 ^ 0x10CF9;
        ModuleCustomFog.E[0xF10B ^ 0xF00B] = 0x2022 ^ 0xF00B;
        ModuleCustomFog.E[0x10E10 ^ 0x10E4F] = 0xFFFEF1D4 ^ 0x10E4F;
        ModuleCustomFog.E[0xC20E ^ 0xC221] = 0xFFFF3DEB ^ 0xC221;
        ModuleCustomFog.E[0x2BB2 ^ 0x2B17] = 0xC14E ^ 0x2B17;
        ModuleCustomFog.E[0xC57D ^ 0xC411] = 0xC412 ^ 0xC411;
        ModuleCustomFog.E[0xA57B ^ 0xA5FC] = 0xFEC1 ^ 0xA5FC;
        ModuleCustomFog.E[0xF9FC ^ 0xF89F] = 0xFFFF0734 ^ 0xF89F;
        ModuleCustomFog.E[0xB1A ^ 0xA44] = 0xA42 ^ 0xA44;
        ModuleCustomFog.E[0xAC89 ^ 0xACEE] = 0xFFFF5321 ^ 0xACEE;
        ModuleCustomFog.E[0x10AAC ^ 0x10BDA] = 0x10BC6 ^ 0x10BDA;
        ModuleCustomFog.E[0x7633 ^ 0x7685] = 0x752D ^ 0x7685;
        ModuleCustomFog.E[0xE211 ^ 0xE366] = 0xE266 ^ 0xE366;
        ModuleCustomFog.E[0xBDD5 ^ 0xBDCA] = 0x4025 ^ 0xBDCA;
        ModuleCustomFog.E[0x3D9A ^ 0x3C17] = 0x3C17 ^ 0x3C17;
        ModuleCustomFog.E[0x6B88 ^ 0x6B7C] = 0x2AA ^ 0x6B7C;
        ModuleCustomFog.E[0x87EC ^ 0x8795] = 0x8794 ^ 0x8795;
        ModuleCustomFog.E[0x3F3E ^ 0x3F96] = 0xFFFF4A36 ^ 0x3F96;
        ModuleCustomFog.E[0xF5CB ^ 0xF580] = 0xF5CC ^ 0xF580;
        ModuleCustomFog.E[0xA04C ^ 0xA047] = 0xFFFF5FC5 ^ 0xA047;
        ModuleCustomFog.E[0xB225 ^ 0xB370] = 0xB360 ^ 0xB370;
        ModuleCustomFog.E[0x5E88 ^ 0x5E46] = 0xFB01 ^ 0x5E46;
        ModuleCustomFog.E[0xFE7D ^ 0xFF60] = 0xDD5 ^ 0xFF60;
        ModuleCustomFog.E[0x4719 ^ 0x47C9] = 0xE28E ^ 0x47C9;
        ModuleCustomFog.E[0xA7C4 ^ 0xA695] = 0xFB4B ^ 0xA695;
        ModuleCustomFog.E[0x10CEB ^ 0x10C90] = 0x10C90 ^ 0x10C90;
        ModuleCustomFog.E[0xE83D ^ 0xE8D5] = 0x1698 ^ 0xE8D5;
        ModuleCustomFog.E[0x67C0 ^ 0x66B9] = 0x66B9 ^ 0x66B9;
        ModuleCustomFog.E[0xB676 ^ 0xB644] = 0xFFFF4999 ^ 0xB644;
        ModuleCustomFog.E[0xC2B0 ^ 0xC2AD] = 0x81E8 ^ 0xC2AD;
        ModuleCustomFog.E[0x10689 ^ 0x10691] = 0x10691 ^ 0x10691;
        ModuleCustomFog.E[0x6872 ^ 0x6875] = 0xFFFF97F1 ^ 0x6875;
        ModuleCustomFog.E[0x10094 ^ 0x100D4] = 0x10043 ^ 0x100D4;
        ModuleCustomFog.E[0xF715 ^ 0xF77D] = 0xFFFF08BF ^ 0xF77D;
        ModuleCustomFog.E[0x95B3 ^ 0x94F2] = 0x94F2 ^ 0x94F2;
        ModuleCustomFog.E[0xC7BC ^ 0xC705] = 0xC4A5 ^ 0xC705;
        ModuleCustomFog.E[0x4BAB ^ 0x4A2E] = 0x9459 ^ 0x4A2E;
        ModuleCustomFog.E[0xC559 ^ 0xC44C] = 0x206E ^ 0xC44C;
        ModuleCustomFog.E[0xD01F ^ 0xD05E] = 0xFFFF2FF8 ^ 0xD05E;
        ModuleCustomFog.E[0xB59F ^ 0xB542] = 0xB20 ^ 0xB542;
        ModuleCustomFog.E[0xC59E ^ 0xC4E0] = 0x7DCA ^ 0xC4E0;
        ModuleCustomFog.E[0x7650 ^ 0x7670] = 0x5E80 ^ 0x7670;
        ModuleCustomFog.E[0x26C4 ^ 0x27E5] = 0xAFEC ^ 0x27E5;
        ModuleCustomFog.E[0x6131 ^ 0x6125] = 0x6122 ^ 0x6125;
        ModuleCustomFog.E[0x10481 ^ 0x10496] = 0x10497 ^ 0x10496;
        ModuleCustomFog.E[0xB40C ^ 0xB518] = 0xAC8C ^ 0xB518;
        ModuleCustomFog.E[0xB7EC ^ 0xB6D2] = 0x22FC ^ 0xB6D2;
        ModuleCustomFog.E[0xCE8 ^ 0xDF9] = 0x147F ^ 0xDF9;
        ModuleCustomFog.E[0xC8A3 ^ 0xC837] = 0xFFFF72AB ^ 0xC837;
        ModuleCustomFog.E[0xDAA6 ^ 0xDB2F] = 0xDB2F ^ 0xDB2F;
        ModuleCustomFog.E[0xFDD2 ^ 0xFD56] = 0x23F0 ^ 0xFD56;
        ModuleCustomFog.E[0x2D5F ^ 0x2DFD] = 0xC7A0 ^ 0x2DFD;
        ModuleCustomFog.E[0x27B8 ^ 0x2700] = 0xFFFFDB39 ^ 0x2700;
        ModuleCustomFog.E[0x6085 ^ 0x60D9] = 0xFFFF9F22 ^ 0x60D9;
        ModuleCustomFog.E[0xBB4E ^ 0xBA68] = 0x9DEF ^ 0xBA68;
        ModuleCustomFog.E[0x3AED ^ 0x3A97] = 0x3A96 ^ 0x3A97;
        ModuleCustomFog.E[0xB2D7 ^ 0xB212] = 0xE270 ^ 0xB212;
        ModuleCustomFog.E[0x5F30 ^ 0x5F65] = 0x5F32 ^ 0x5F65;
        ModuleCustomFog.E[0x47E1 ^ 0x4770] = 0x73CF ^ 0x4770;
        ModuleCustomFog.E[0xC95E ^ 0xC824] = 0xC827 ^ 0xC824;
        ModuleCustomFog.E[0x1554 ^ 0x1538] = 0x1556 ^ 0x1538;
        ModuleCustomFog.E[0x109B1 ^ 0x10984] = 0xFFFEF66C ^ 0x10984;
        ModuleCustomFog.E[0xBEBD ^ 0xBFBB] = 0x38C4 ^ 0xBFBB;
        ModuleCustomFog.E[0x81BD ^ 0x8177] = 0x186CB ^ 0x8177;
        ModuleCustomFog.E[0x5436 ^ 0x554E] = 0x554C ^ 0x554E;
        ModuleCustomFog.E[0x6B52 ^ 0x6B8A] = 0x163B ^ 0x6B8A;
        ModuleCustomFog.E[0x9B6A ^ 0x9BEB] = 0x311D ^ 0x9BEB;
        ModuleCustomFog.E[0xA8D1 ^ 0xA952] = 0x86C1 ^ 0xA952;
        ModuleCustomFog.E[0x4CE5 ^ 0x4DCC] = 0xFBA9 ^ 0x4DCC;
        ModuleCustomFog.E[0x101A7 ^ 0x100F4] = 0x1428B ^ 0x100F4;
        ModuleCustomFog.E[0xAC6D ^ 0xAC23] = 0xFFFF53C1 ^ 0xAC23;
        ModuleCustomFog.E[0x2C8C ^ 0x2C36] = 0x1DFD ^ 0x2C36;
        ModuleCustomFog.E[0x10654 ^ 0x106A7] = 0xFFFE90E4 ^ 0x106A7;
        ModuleCustomFog.E[0x1B3F ^ 0x1A76] = 0x8892 ^ 0x1A76;
        ModuleCustomFog.E[0x7827 ^ 0x7821] = 0x7810 ^ 0x7821;
        ModuleCustomFog.E[0x8CDA ^ 0x8C71] = 0xB2DB ^ 0x8C71;
        ModuleCustomFog.E[0x1263 ^ 0x1292] = 0x7B47 ^ 0x1292;
        ModuleCustomFog.E[0x58B7 ^ 0x5871] = 0x806 ^ 0x5871;
        ModuleCustomFog.E[0x7708 ^ 0x760B] = 0xFFFF2734 ^ 0x760B;
        ModuleCustomFog.E[0x103 ^ 1] = 0xAEF9 ^ 1;
        ModuleCustomFog.E[0x5B5D ^ 0x5B5F] = 0x5B12 ^ 0x5B5F;
        ModuleCustomFog.E[0x25C7 ^ 0x25A3] = 0x25B1 ^ 0x25A3;
        ModuleCustomFog.E[0x9BE9 ^ 0x9A95] = 0x7F31 ^ 0x9A95;
        ModuleCustomFog.E[0xF019 ^ 0xF178] = 0xFFFF0EA2 ^ 0xF178;
        ModuleCustomFog.E[0x9AAC ^ 0x9B2A] = 0x654 ^ 0x9B2A;
        ModuleCustomFog.E[0xB7A0 ^ 0xB6F2] = 0xADCC ^ 0xB6F2;
        ModuleCustomFog.E[0x483A ^ 0x4826] = 0x4926 ^ 0x4826;
        ModuleCustomFog.E[0xF83E ^ 0xF833] = 0xFFFF07FA ^ 0xF833;
        ModuleCustomFog.E[0x1034D ^ 0x10262] = 0x1684E ^ 0x10262;
        ModuleCustomFog.E[0x3530 ^ 0x35CB] = 0x3DFD ^ 0x35CB;
        ModuleCustomFog.E[0x20D7 ^ 0x20EF] = 0x20B2 ^ 0x20EF;
        ModuleCustomFog.E[0x8670 ^ 0x86E8] = 0x46FA ^ 0x86E8;
        ModuleCustomFog.E[0x3E6D ^ 0x3F6C] = 0x9189 ^ 0x3F6C;
        ModuleCustomFog.E[0xBFB6 ^ 0xBE3C] = 0xBE2C ^ 0xBE3C;
        ModuleCustomFog.E[0x1578 ^ 0x15A9] = 0x7D56 ^ 0x15A9;
        ModuleCustomFog.E[0xDD0 ^ 0xCB6] = 0xCB4 ^ 0xCB6;
        ModuleCustomFog.E[0x1035A ^ 0x1032E] = 0xFFFEFCD7 ^ 0x1032E;
        ModuleCustomFog.E[0xC876 ^ 0xC841] = 0xFFFF3714 ^ 0xC841;
        ModuleCustomFog.E[0x6DBA ^ 0x6DCC] = 0x6DCD ^ 0x6DCC;
        ModuleCustomFog.E[0x9DBB ^ 0x9D81] = 0x9DBE ^ 0x9D81;
        ModuleCustomFog.E[0x6614 ^ 0x66FA] = 0x160C1 ^ 0x66FA;
        ModuleCustomFog.E[0xB770 ^ 0xB650] = 0x44E0 ^ 0xB650;
        ModuleCustomFog.E[0x2178 ^ 0x2150] = 0x114D ^ 0x2150;
        ModuleCustomFog.E[0xD72C ^ 0xD722] = 0xD765 ^ 0xD722;
        ModuleCustomFog.E[0xF5E9 ^ 0xF4BE] = 0xF4D9 ^ 0xF4BE;
        ModuleCustomFog.E[0x6634 ^ 0x6709] = 0xF331 ^ 0x6709;
        ModuleCustomFog.E[0x54EA ^ 0x55DC] = 0x6535 ^ 0x55DC;
        ModuleCustomFog.E[0xCA2D ^ 0xCA3D] = 0xCA3C ^ 0xCA3D;
        ModuleCustomFog.E[0x185E ^ 0x1950] = 0x13F5 ^ 0x1950;
        ModuleCustomFog.E[0xA079 ^ 0xA085] = 0xA894 ^ 0xA085;
        ModuleCustomFog.E[0x165E ^ 0x1652] = 0xFFFFE9DC ^ 0x1652;
        ModuleCustomFog.E[0xB7FF ^ 0xB6FA] = 0x3184 ^ 0xB6FA;
        ModuleCustomFog.E[0x838F ^ 0x83E2] = 0x8355 ^ 0x83E2;
        ModuleCustomFog.E[0x3882 ^ 0x383C] = 0x383C ^ 0x383C;
        ModuleCustomFog.E[0x6E1F ^ 0x6E1C] = 0x6E38 ^ 0x6E1C;
        ModuleCustomFog.E[0xB121 ^ 0xB053] = 0xB054 ^ 0xB053;
        ModuleCustomFog.E[0x3BE5 ^ 0x3A8D] = 0x3A89 ^ 0x3A8D;
        ModuleCustomFog.E[0x1DD0 ^ 0x1DB2] = 0x1DBF ^ 0x1DB2;
        ModuleCustomFog.E[0x60DE ^ 0x61B5] = 0x61D0 ^ 0x61B5;
        ModuleCustomFog.E[0x6CE6 ^ 0x6C52] = 0xFFFFE0E8 ^ 0x6C52;
        ModuleCustomFog.E[0x4AA9 ^ 0x4A72] = 0xFFFFD5BA ^ 0x4A72;
        ModuleCustomFog.E[0x4523 ^ 0x4458] = 0x358 ^ 0x4458;
        ModuleCustomFog.E[0x4420 ^ 0x457B] = 0x4503 ^ 0x457B;
        ModuleCustomFog.E[0x48D5 ^ 0x4869] = 0x79BE ^ 0x4869;
        ModuleCustomFog.E[0xF82 ^ 0xF64] = 0xF129 ^ 0xF64;
        ModuleCustomFog.E[0x346E ^ 0x34CE] = 0xFFFFDEBC ^ 0x34CE;
        ModuleCustomFog.E[0xEF0A ^ 0xEFF2] = 0x757C ^ 0xEFF2;
        ModuleCustomFog.E[0x191E ^ 0x1879] = 0xFFFFE788 ^ 0x1879;
        ModuleCustomFog.E[0x2DA5 ^ 0x2C80] = 0xB1F ^ 0x2C80;
        ModuleCustomFog.E[0xCA7D ^ 0xCB36] = 0xFC5C ^ 0xCB36;
        ModuleCustomFog.E[0x1439 ^ 0x1469] = 0x146F ^ 0x1469;
        ModuleCustomFog.E[0xA3BA ^ 0xA23A] = 0x8297 ^ 0xA23A;
        ModuleCustomFog.E[0x7B7B ^ 0x7B81] = 0x7390 ^ 0x7B81;
        ModuleCustomFog.E[0x718 ^ 0x62A] = 0xD0B4 ^ 0x62A;
        ModuleCustomFog.E[0x8925 ^ 0x89D2] = 0xFFFFECA1 ^ 0x89D2;
        ModuleCustomFog.E[0x3218 ^ 0x32F4] = 0x6FD ^ 0x32F4;
        ModuleCustomFog.E[0x59EA ^ 0x58C1] = 0xEE90 ^ 0x58C1;
        ModuleCustomFog.E[0x9694 ^ 0x96B6] = 0x3707 ^ 0x96B6;
        ModuleCustomFog.E[0xD2A3 ^ 0xD264] = 0x8213 ^ 0xD264;
        ModuleCustomFog.E[0x154A ^ 0x1510] = 0x156A ^ 0x1510;
        ModuleCustomFog.E[0x5CBC ^ 0x5D3B] = 0x1425 ^ 0x5D3B;
        ModuleCustomFog.E[0x10162 ^ 0x101AB] = 0x617 ^ 0x101AB;
        ModuleCustomFog.E[0xF215 ^ 0xF2F4] = 0xD32E ^ 0xF2F4;
        ModuleCustomFog.E[0x463A ^ 0x46C7] = 0x96EC ^ 0x46C7;
        ModuleCustomFog.E[0x6741 ^ 0x6764] = 0x103C ^ 0x6764;
        ModuleCustomFog.E[0x10E59 ^ 0x10EBA] = 0xFFFED097 ^ 0x10EBA;
        ModuleCustomFog.E[0x9116 ^ 0x9006] = 0x9AA3 ^ 0x9006;
        ModuleCustomFog.E[0x106BE ^ 0x107EE] = 0x1D716 ^ 0x107EE;
        ModuleCustomFog.E[0xE85 ^ 0xFC0] = 0xFC0 ^ 0xFC0;
        ModuleCustomFog.E[0x92BD ^ 0x9267] = 0xF24D ^ 0x9267;
        ModuleCustomFog.E[0x36A2 ^ 0x3634] = 0xF620 ^ 0x3634;
        ModuleCustomFog.E[0xBE20 ^ 0xBF54] = 0xBF5E ^ 0xBF54;
        ModuleCustomFog.E[0x2EC3 ^ 0x2E72] = 0xB86B ^ 0x2E72;
        ModuleCustomFog.E[0x313B ^ 0x3145] = 0x9BB3 ^ 0x3145;
        ModuleCustomFog.E[0xA85D ^ 0xA8CA] = 0x68DC ^ 0xA8CA;
        ModuleCustomFog.E[0xBA86 ^ 0xBA21] = 0x3062 ^ 0xBA21;
        ModuleCustomFog.E[0xB289 ^ 0xB391] = 0x57A9 ^ 0xB391;
        ModuleCustomFog.E[0x3B14 ^ 0x3BF3] = 0xFFFF3A47 ^ 0x3BF3;
        ModuleCustomFog.E[0xE174 ^ 0xE1F4] = 0x4B68 ^ 0xE1F4;
        ModuleCustomFog.E[0xFD09 ^ 0xFD94] = 0xDF5E ^ 0xFD94;
        ModuleCustomFog.E[0x8FDF ^ 0x8FAD] = 0xFFFF7035 ^ 0x8FAD;
        ModuleCustomFog.E[0xBDCB ^ 0xBD7C] = 0xBEDC ^ 0xBD7C;
        ModuleCustomFog.E[0x100D5 ^ 0x10057] = 0x1DE83 ^ 0x10057;
        ModuleCustomFog.E[0x225D ^ 0x237F] = 0xAB6F ^ 0x237F;
        ModuleCustomFog.E[0x5C8 ^ 0x527] = 0x10336 ^ 0x527;
        ModuleCustomFog.E[0xA811 ^ 0xA86C] = 0x2E52 ^ 0xA86C;
        ModuleCustomFog.E[0x2C89 ^ 0x2CCA] = 0xFFFFD3AE ^ 0x2CCA;
        ModuleCustomFog.E[0x34EC ^ 0x3586] = 0x358D ^ 0x3586;
        ModuleCustomFog.E[0x87A4 ^ 0x87F0] = 0x87C5 ^ 0x87F0;
        ModuleCustomFog.E[0xE0F6 ^ 0xE098] = 0xE0F9 ^ 0xE098;
        ModuleCustomFog.E[0x8E5 ^ 0x9C8] = 0x63A5 ^ 0x9C8;
        ModuleCustomFog.E[0x10F8E ^ 0x10F11] = 0x11A89 ^ 0x10F11;
        ModuleCustomFog.E[0x42CF ^ 0x42F0] = 0x42AF ^ 0x42F0;
        ModuleCustomFog.E[0xC0A7 ^ 0xC197] = 0xABF3 ^ 0xC197;
        ModuleCustomFog.E[0xA3CA ^ 0xA3C0] = 0xFFFF5C7B ^ 0xA3C0;
        ModuleCustomFog.E[0xD12B ^ 0xD178] = 0xFFFF2EB3 ^ 0xD178;
        ModuleCustomFog.E[0xE06C ^ 0xE052] = 0xFFFF1FDB ^ 0xE052;
        ModuleCustomFog.E[0xB8E8 ^ 0xB876] = 0xADED ^ 0xB876;
        ModuleCustomFog.E[0xA569 ^ 0xA4E8] = 0x3967 ^ 0xA4E8;
        ModuleCustomFog.E[0x6E3E ^ 0x6E19] = 0xDEC5 ^ 0x6E19;
        ModuleCustomFog.E[0x6907 ^ 0x6818] = 0xFFFF6501 ^ 0x6818;
        ModuleCustomFog.E[0x3D6C ^ 0x3D58] = 0xFFFFC2EC ^ 0x3D58;
        ModuleCustomFog.E[0x54CD ^ 0x54FB] = 0xFFFFAB5E ^ 0x54FB;
        ModuleCustomFog.E[0x499C ^ 0x48C5] = 0x48D4 ^ 0x48C5;
        ModuleCustomFog.E[0x4789 ^ 0x471B] = 0x202 ^ 0x471B;
        ModuleCustomFog.E[0xAE84 ^ 0xAED2] = 0xAEF2 ^ 0xAED2;
        ModuleCustomFog.E[0x61C8 ^ 0x60D3] = 0xFFFFF9E5 ^ 0x60D3;
        ModuleCustomFog.E[0xE56D ^ 0xE54C] = 0x90DD ^ 0xE54C;
        ModuleCustomFog.E[0xC6FD ^ 0xC7EF] = 0xDE7B ^ 0xC7EF;
        ModuleCustomFog.E[0x93D7 ^ 0x933A] = 0x19509 ^ 0x933A;
        ModuleCustomFog.E[0x10A6E ^ 0x10AF2] = 0xFFFED7E9 ^ 0x10AF2;
        ModuleCustomFog.E[0xC3A2 ^ 0xC293] = 0x1409 ^ 0xC293;
        ModuleCustomFog.E[0xB2CB ^ 0xB2DA] = 0xB2E3 ^ 0xB2DA;
        ModuleCustomFog.E[0x7F41 ^ 0x7E23] = 0x7E26 ^ 0x7E23;
        ModuleCustomFog.E[0x91BD ^ 0x90D0] = 0x90AB ^ 0x90D0;
        ModuleCustomFog.E[0x625E ^ 0x6344] = 0x5DE ^ 0x6344;
        ModuleCustomFog.E[0x8A34 ^ 0x8A43] = 0x8A41 ^ 0x8A43;
        ModuleCustomFog.E[0x1E0D ^ 0x1F68] = 0x1F05 ^ 0x1F68;
        ModuleCustomFog.E[0x8414 ^ 0x848E] = 0xA641 ^ 0x848E;
        ModuleCustomFog.E[0x2E ^ 0xDB] = 0x9A4B ^ 0xDB;
        ModuleCustomFog.E[0x2B82 ^ 0x2B31] = 0x587F ^ 0x2B31;
        ModuleCustomFog.E[0xF5A4 ^ 0xF4AC] = 0x73D3 ^ 0xF4AC;
        ModuleCustomFog.E[0x5F39 ^ 0x5FAA] = 0x1AB2 ^ 0x5FAA;
        ModuleCustomFog.E[0x4C7B ^ 0x4C20] = 0x4C33 ^ 0x4C20;
        ModuleCustomFog.E[0xA9D3 ^ 0xA9C9] = 0xA9C9 ^ 0xA9C9;
        ModuleCustomFog.E[0x10D47 ^ 0x10D48] = 0x10D08 ^ 0x10D48;
        ModuleCustomFog.E[0x80A2 ^ 0x81B1] = 0xFFFF678D ^ 0x81B1;
        ModuleCustomFog.E[0xEFDE ^ 0xEE98] = 0xEE8A ^ 0xEE98;
        ModuleCustomFog.E[0xA3C7 ^ 0xA313] = 0xCBEB ^ 0xA313;
        ModuleCustomFog.E[0x10E4C ^ 0x10E01] = 0xFFFEF1EA ^ 0x10E01;
        ModuleCustomFog.E[0xBCA3 ^ 0xBC8F] = 0xBC93 ^ 0xBC8F;
        ModuleCustomFog.E[0x5077 ^ 0x512F] = 0x5122 ^ 0x512F;
        ModuleCustomFog.E[0x3173 ^ 0x31DF] = 0xF2B ^ 0x31DF;
        ModuleCustomFog.E[0xC1D ^ 0xD50] = 0x6F85 ^ 0xD50;
        ModuleCustomFog.E[0xBFFE ^ 0xBF2B] = 0xC28A ^ 0xBF2B;
        ModuleCustomFog.E[0x7D44 ^ 0x7DEE] = 0x4348 ^ 0x7DEE;
        ModuleCustomFog.E[0xA71B ^ 0xA728] = 0xA741 ^ 0xA728;
        ModuleCustomFog.E[0x66C4 ^ 0x669D] = 0x66ED ^ 0x669D;
        ModuleCustomFog.E[0x8717 ^ 0x8755] = 0x8748 ^ 0x8755;
        ModuleCustomFog.E[0x51A2 ^ 0x5160] = 0xF08A ^ 0x5160;
    }
}

