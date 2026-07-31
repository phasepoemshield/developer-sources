/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

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
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0010"}, d2={"Lkotakbaz/rain/module/modules/render/NoFluidModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "shouldClearWaterOverlay", "()Z", "shouldClearWaterFog", "shouldClearLavaFog", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "water", "Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "getWater", "()Lkotakbaz/rain/module/setting/settings/BooleanSetting;", "lava", "getLava", "rain-visuals"})
public final class NoFluidModule
extends Module {
    @NotNull
    public static final NoFluidModule INSTANCE;
    @NotNull
    private static final BooleanSetting a;
    @NotNull
    private static final BooleanSetting A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private NoFluidModule() {
        int n2 = D[0];
        n2 -= D[1];
        int n3 = D[3];
        n3 ^= D[4];
        int n4 = D[6];
        n4 -= D[7];
        super((String)b[n2 ^= D[2]], a_0.getRENDER(), (String)b[n3 += D[5]] + (String)b[n4 ^= D[8]]);
    }

    @NotNull
    public final BooleanSetting getWater() {
        return a;
    }

    @NotNull
    public final BooleanSetting getLava() {
        return A;
    }

    public final boolean shouldClearWaterOverlay() {
        int n2;
        if (this.isEnabled() && ((Boolean)a.getValue()).booleanValue()) {
            int n3 = D[9];
            n3 ^= D[10];
            n2 = n3 += D[11];
        } else {
            int n4 = D[12];
            n4 ^= D[13];
            n2 = n4 -= D[14];
        }
        return n2 != 0;
    }

    public final boolean shouldClearWaterFog() {
        int n2;
        if (this.isEnabled() && ((Boolean)a.getValue()).booleanValue()) {
            int n3 = D[15];
            n3 += D[16];
            n2 = n3 += D[17];
        } else {
            int n4 = D[18];
            n4 += D[19];
            n2 = n4 ^= D[20];
        }
        return n2 != 0;
    }

    public final boolean shouldClearLavaFog() {
        int n2;
        if (this.isEnabled() && ((Boolean)A.getValue()).booleanValue()) {
            int n3 = D[21];
            n3 -= D[22];
            n2 = n3 ^= D[23];
        } else {
            int n4 = D[24];
            n4 += D[25];
            n2 = n4 ^= D[26];
        }
        return n2 != 0;
    }

    static {
        NoFluidModule.b();
        long l2 = 4458667222596666683L;
        long l3 = 19296998380405866L;
        long l4 = 8182740927955889523L;
        long l5 = 6979370889738402554L;
        long l6 = -8542104908882466960L;
        long l7 = 5364005294113270529L;
        long l8 = 3733556604870724920L;
        long l9 = 902599764419655491L;
        long l10 = -1390550698482053324L;
        long l11 = -856377648851037766L;
        long l12 = 749795851895828259L;
        long l13 = -8440312570251988567L;
        long l14 = 6693645400013387346L;
        long l15 = -1473453825484335375L;
        int n2 = D[27];
        n2 += D[28];
        b = new Object[n2 -= D[29]];
        long l16 = l15;
        int n3 = D[30];
        n3 += D[31];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += D[32]);
        Object[] objectArray = new Object[D[33]];
        objectArray[NoFluidModule.D[34]] = B;
        objectArray[NoFluidModule.D[35]] = D[36];
        int n4 = D[37];
        Object object = NoFluidModule.A()[D[38]];
        if (object == null) {
            char[] cArray = "\ud840\ud7b6\ud84d\ud788\ud7b9\ud84f\ud7b3\ud787\ud853\ud777\ud843\ud85a\ud797\ud789\ud7ae\ud7aa\ud84b\ud7a7\ud850\ud7a6\ud79d\ud797\ud78e\ud84d\ud7a9\ud778\ud78e\ud798\ud791\ud856\ud84c\ud7ab\ud7aa\ud79b\ud7a6\ud78b\ud848\ud7a7\ud7b2\ud784\ud78d\ud7af\ud77b\ud78b\ud7b4\ud7b5\ud7b6\ud85a\ud7a9\ud7ad\ud795\ud7a9\ud7aa\ud78a\ud851\ud84e\ud7ae\ud84c\ud7a4\ud855\ud78a\ud78a\ud851\ud78b\ud844\ud7b6\ud7a7\ud7b1\ud7a4\ud844\ud7ab\ud7af\ud798\ud7a8\ud7a8\ud797\ud789\ud847\ud859\ud84a\ud7a0\ud78e\ud7a8\ud847\ud851\ud79d\ud7ac\ud84b\ud795\ud7b6\ud7a7\ud78d\ud7b9\ud84b\ud84f\ud795\ud78a\ud7a6\ud846\ud847\ud798\ud7b4\ud852\ud840\ud786\ud7a3\ud788\ud7a8\ud844\ud7ac\ud783\ud7a8\ud849\ud854\ud84e\ud7ac\ud7ad\ud843\ud855\ud78a\ud854\ud7ba\ud7b9\ud7b9\ud7b2\ud847\ud797\ud783\ud7af\ud798\ud77b\ud7ac\ud843\ud7aa\ud778\ud77d\ud784\ud7b3\ud856\ud847\ud795\ud789\ud789\ud840\ud788\ud7a6\ud77d\ud791\ud777\ud7b4\ud7b0\ud7ad\ud79d\ud843\ud7ad\ud7b2\ud783\ud795\ud78d\ud840\ud7b1\ud778\ud7a7\ud7b3\ud78a\ud849\ud850\ud846\ud84d\ud856\ud849\ud84e\ud784\ud778\ud7a3\ud7b5\ud846\ud7b9\ud850\ud7b2\ud778\ud78a\ud847\ud79d\ud786\ud85a\ud7a9\ud797\ud786\ud851\ud859\ud84c".toCharArray();
            for (int i2 = D[39]; i2 < D[40]; ++i2) {
                int n5 = cArray[i2];
                n5 -= D[41];
                n5 -= D[42];
                n5 -= D[43];
                n5 -= D[44];
                n5 -= D[45];
                n5 ^= D[46];
                n5 ^= D[47];
                n5 += D[48];
                n5 ^= D[49];
                n5 ^= D[50];
                n5 += D[51];
                cArray[i2] = (char)(n5 ^= D[52]);
            }
            object = NoFluidModule.A()[NoFluidModule.D[53]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)NoFluidModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = D[54];
        n6 ^= D[55];
        l6 = l17 ^ (0x4A00000000L ^ l17) & -1L << (n6 += D[56]);
        long l18 = l13;
        int n7 = D[57];
        n7 -= D[58];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= D[59]);
        while (true) {
            int n8 = D[60];
            n8 += D[61];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= D[62]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = D[63];
            n10 -= D[64];
            int n11 = D[66];
            n11 ^= D[67];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= D[65])) & -1L >>> (n11 ^= D[68]);
            long l20 = l9;
            int n12 = D[69];
            n12 ^= D[70];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= D[71]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = D[72];
            n14 ^= D[73];
            int n15 = D[75];
            n15 -= D[76];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= D[74])) & -1L >>> (n15 ^= D[77]);
            int n16 = D[78];
            n16 -= D[79];
            long l22 = l10;
            int n17 = D[81];
            n17 -= D[82];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= D[80]) ^ l22) & -1L << (n17 -= D[83]);
            int n18 = D[84];
            n18 += D[85];
            n18 += D[86];
            int n19 = D[87];
            n19 += D[88];
            long l23 = l12;
            int n20 = D[90];
            n20 ^= D[91];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= D[89]))) ^ l23) & -1L >>> (n20 ^= D[92]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = D[93];
            n21 += D[94];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= D[95]);
            while (true) {
                int n22 = D[96];
                n22 += D[97];
                if ((int)(l14 >>> (n22 -= D[98])) >= (int)l12) break;
                int n23 = D[99];
                n23 += D[100];
                int n24 = D[102];
                n24 ^= D[103];
                cArray2[(int)(l14 >>> (n23 -= NoFluidModule.D[101]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= D[104]))];
                l14 += 0x100000000L;
            }
            int n25 = D[105];
            n25 -= D[106];
            int n26 = (int)(l15 >>> (n25 ^= D[107]));
            l15 += 0x100000000L;
            NoFluidModule.b[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = D[108];
            n27 -= D[109];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= D[110]);
        }
        INSTANCE = new NoFluidModule();
        int n28 = D[111];
        n28 ^= D[112];
        boolean bl = D[114];
        bl += D[115];
        a = INSTANCE.cfr_renamed_0((String)b[n28 += D[113]], bl -= D[116]);
        int n29 = D[117];
        n29 -= D[118];
        boolean bl2 = D[120];
        bl2 ^= D[121];
        A = INSTANCE.cfr_renamed_0((String)b[n29 ^= D[119]], bl2 ^= D[122]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[D[123]];
        String string = (String)object[D[124]];
        object = object[D[125]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[126]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[127]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[129] ^ D[130]];
                byArray[NoFluidModule.D[131] ^ NoFluidModule.D[132]] = D[133] ^ D[134];
                byArray[NoFluidModule.D[135] ^ NoFluidModule.D[136]] = D[137] ^ D[138];
                byArray[NoFluidModule.D[139] ^ NoFluidModule.D[140]] = D[141] ^ D[142];
                byArray[NoFluidModule.D[143] ^ NoFluidModule.D[144]] = D[145] ^ D[146];
                byArray[NoFluidModule.D[147] ^ NoFluidModule.D[148]] = D[149] ^ D[150];
                byArray[NoFluidModule.D[151] ^ NoFluidModule.D[152]] = D[153] ^ D[154];
                byArray[NoFluidModule.D[155] ^ NoFluidModule.D[156]] = D[157] ^ D[158];
                byArray[NoFluidModule.D[159] ^ NoFluidModule.D[160]] = D[161] ^ D[162];
                byArray[NoFluidModule.D[163] ^ NoFluidModule.D[164]] = D[165] ^ D[166];
                byArray[NoFluidModule.D[167] ^ NoFluidModule.D[168]] = D[169] ^ D[170];
                byArray[NoFluidModule.D[171] ^ NoFluidModule.D[172]] = D[173] ^ D[174];
                byArray[NoFluidModule.D[175] ^ NoFluidModule.D[176]] = D[177] ^ D[178];
                byArray[NoFluidModule.D[179] ^ NoFluidModule.D[180]] = D[181] ^ D[182];
                byArray[NoFluidModule.D[183] ^ NoFluidModule.D[184]] = D[185] ^ D[186];
                byArray[NoFluidModule.D[187] ^ NoFluidModule.D[188]] = D[189] ^ D[190];
                byArray[NoFluidModule.D[191] ^ NoFluidModule.D[192]] = D[193] ^ D[194];
                objectArray2[NoFluidModule.D[128]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[195]];
            if (c == null) {
                byte[] byArray2 = new byte[D[196] ^ D[197]];
                byArray2[NoFluidModule.D[198] ^ NoFluidModule.D[199]] = D[200] ^ D[201];
                byArray2[NoFluidModule.D[202] ^ NoFluidModule.D[203]] = D[204] ^ D[205];
                byArray2[NoFluidModule.D[206] ^ NoFluidModule.D[207]] = D[208] ^ D[209];
                byArray2[NoFluidModule.D[210] ^ NoFluidModule.D[211]] = D[212] ^ D[213];
                byArray2[NoFluidModule.D[214] ^ NoFluidModule.D[215]] = D[216] ^ D[217];
                byArray2[NoFluidModule.D[218] ^ NoFluidModule.D[219]] = D[220] ^ D[221];
                byArray2[NoFluidModule.D[222] ^ NoFluidModule.D[223]] = D[224] ^ D[225];
                byArray2[NoFluidModule.D[226] ^ NoFluidModule.D[227]] = D[228] ^ D[229];
                byArray2[NoFluidModule.D[230] ^ NoFluidModule.D[231]] = D[232] ^ D[233];
                byArray2[NoFluidModule.D[234] ^ NoFluidModule.D[235]] = D[236] ^ D[237];
                byArray2[NoFluidModule.D[238] ^ NoFluidModule.D[239]] = D[240] ^ D[241];
                byArray2[NoFluidModule.D[242] ^ NoFluidModule.D[243]] = D[244] ^ D[245];
                byArray2[NoFluidModule.D[246] ^ NoFluidModule.D[247]] = D[248] ^ D[249];
                byArray2[NoFluidModule.D[250] ^ NoFluidModule.D[251]] = D[252] ^ D[253];
                byArray2[NoFluidModule.D[254] ^ NoFluidModule.D[255]] = D[256] ^ D[257];
                byArray2[NoFluidModule.D[258] ^ NoFluidModule.D[259]] = D[260] ^ D[261];
                byArray2[NoFluidModule.D[262] ^ NoFluidModule.D[263]] = D[264] ^ D[265];
                byArray2[NoFluidModule.D[266] ^ NoFluidModule.D[267]] = D[268] ^ D[269];
                byArray2[NoFluidModule.D[270] ^ NoFluidModule.D[271]] = D[272] ^ D[273];
                byArray2[NoFluidModule.D[274] ^ NoFluidModule.D[275]] = D[276] ^ D[277];
                byArray2[NoFluidModule.D[278] ^ NoFluidModule.D[279]] = D[280] ^ D[281];
                byArray2[NoFluidModule.D[282] ^ NoFluidModule.D[283]] = D[284] ^ D[285];
                byArray2[NoFluidModule.D[286] ^ NoFluidModule.D[287]] = D[288] ^ D[289];
                byArray2[NoFluidModule.D[290] ^ NoFluidModule.D[291]] = D[292] ^ D[293];
                byArray2[NoFluidModule.D[294] ^ NoFluidModule.D[295]] = D[296] ^ D[297];
                byArray2[NoFluidModule.D[298] ^ NoFluidModule.D[299]] = D[300] ^ D[301];
                byArray2[NoFluidModule.D[302] ^ NoFluidModule.D[303]] = D[304] ^ D[305];
                byArray2[NoFluidModule.D[306] ^ NoFluidModule.D[307]] = D[308] ^ D[309];
                byArray2[NoFluidModule.D[310] ^ NoFluidModule.D[311]] = D[312] ^ D[313];
                byArray2[NoFluidModule.D[314] ^ NoFluidModule.D[315]] = D[316] ^ D[317];
                byArray2[NoFluidModule.D[318] ^ NoFluidModule.D[319]] = D[320] ^ D[321];
                byArray2[NoFluidModule.D[322] ^ NoFluidModule.D[323]] = D[324] ^ D[325];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[326], byArray3, D[327], byArray.length);
                System.arraycopy(byArray2, D[328], byArray3, byArray.length, byArray2.length);
                Object object4 = NoFluidModule.A()[D[329]];
                if (object4 == null) {
                    char[] cArray = "\uad5f\ueb71\uad68\uad0b\uad0d\ueb41\uacfc\uad06\uad1b\uad07\uad67\uad02\uad0e\uad10\uad60\uad67\ueb6e\ueb3e".toCharArray();
                    for (int i2 = D[330]; i2 < D[331]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += D[332];
                        n3 += D[333];
                        n3 ^= D[334];
                        n3 ^= D[335];
                        n3 -= D[336];
                        n3 -= D[337];
                        n3 -= D[338];
                        n3 -= D[339];
                        n3 ^= D[340];
                        n3 ^= D[341];
                        n3 += D[342];
                        cArray[i2] = (char)(n3 ^= D[343]);
                    }
                    object4 = NoFluidModule.A()[NoFluidModule.D[344]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[345]];
                byArray4[NoFluidModule.D[346]] = D[347];
                byArray4[NoFluidModule.D[348]] = D[349];
                byArray4[NoFluidModule.D[350]] = D[351];
                byArray4[NoFluidModule.D[352]] = D[353];
                byArray4[NoFluidModule.D[354]] = D[355];
                byArray4[NoFluidModule.D[356]] = D[357];
                byArray4[NoFluidModule.D[358]] = D[359];
                byArray4[NoFluidModule.D[360]] = D[361];
                byArray4[NoFluidModule.D[362]] = D[363];
                byArray4[NoFluidModule.D[364]] = D[365];
                byArray4[NoFluidModule.D[366]] = D[367];
                byArray4[NoFluidModule.D[368]] = D[369];
                byArray4[NoFluidModule.D[370]] = D[371];
                byArray4[NoFluidModule.D[372]] = D[373];
                byArray4[NoFluidModule.D[374]] = D[375];
                byArray4[NoFluidModule.D[376]] = D[377];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, D[378], D[379]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = NoFluidModule.A()[D[380]];
                if (object5 == null) {
                    char[] cArray = "\ub76a\ub77e\ub790".toCharArray();
                    for (int i3 = D[381]; i3 < D[382]; ++i3) {
                        int n4 = cArray[i3];
                        n4 += D[383];
                        n4 -= D[384];
                        n4 ^= D[385];
                        n4 ^= D[386];
                        n4 += D[387];
                        n4 -= D[388];
                        n4 += D[389];
                        n4 -= D[390];
                        n4 ^= D[391];
                        n4 ^= D[392];
                        cArray[i3] = (char)(n4 -= D[393]);
                    }
                    object5 = NoFluidModule.A()[NoFluidModule.D[394]] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, D[395], D[396]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, D[397], byArray6.length);
            Object object6 = NoFluidModule.A()[D[398]];
            if (object6 == null) {
                char[] cArray = "\u6640\u6644\u62ca\u62f6\u663a\u6639\u663a\u62f6\u62cf\u6642\u663a\u62ca\u62f4\u62cf\u6620\u6623\u6623\u6688\u6635\u668e".toCharArray();
                for (int i4 = D[399]; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 55137;
                    n5 ^= 0x7FC3;
                    n5 -= 45096;
                    n5 ^= 0x1E08;
                    n5 -= 34984;
                    n5 -= 65416;
                    n5 += 65481;
                    n5 -= 60970;
                    n5 -= 62124;
                    n5 ^= 0x1452;
                    n5 ^= 0x5592;
                    n5 -= 4470;
                    n5 -= 28055;
                    n5 ^= 0xC017;
                    n5 ^= 0xF1BC;
                    cArray[i4] = (char)(n5 += 10942);
                }
                object6 = NoFluidModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)c), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = d;
        if (d == null) {
            d = new Object[4];
            objectArray = d;
        }
        return objectArray;
    }

    public static void b() {
        D = new int[0x8CC4 ^ 0x8D54];
        NoFluidModule.D[0x867A ^ 0x8776] = 0xFFFE72B1 ^ 0x8776;
        NoFluidModule.D[0xC703 ^ 0xC66A] = 0xC63A ^ 0xC66A;
        NoFluidModule.D[0x2E52 ^ 0x2EA9] = 0x9976 ^ 0x2EA9;
        NoFluidModule.D[0x5118 ^ 0x5103] = 0x51F4 ^ 0x5103;
        NoFluidModule.D[0x607B ^ 0x6030] = 0x6011 ^ 0x6030;
        NoFluidModule.D[0xFFD ^ 0xE7C] = 0xCCEF ^ 0xE7C;
        NoFluidModule.D[0x10939 ^ 0x10857] = 0x10857 ^ 0x10857;
        NoFluidModule.D[0xA144 ^ 0xA1E1] = 0xE109 ^ 0xA1E1;
        NoFluidModule.D[0xC25 ^ 0xCA0] = 0x6786 ^ 0xCA0;
        NoFluidModule.D[0x7D1 ^ 0x65B] = 0x659 ^ 0x65B;
        NoFluidModule.D[0x76E1 ^ 0x77DC] = 0x17B7B ^ 0x77DC;
        NoFluidModule.D[0xEE83 ^ 0xEE99] = 0xFFFF1138 ^ 0xEE99;
        NoFluidModule.D[0x8A5D ^ 0x8B49] = 0xFFFF4847 ^ 0x8B49;
        NoFluidModule.D[0x6D15 ^ 0x6C07] = 0x50E8 ^ 0x6C07;
        NoFluidModule.D[0xE604 ^ 0xE647] = 0xFFFF199E ^ 0xE647;
        NoFluidModule.D[0xEDCB ^ 0xED77] = 0x1531 ^ 0xED77;
        NoFluidModule.D[0x2C8B ^ 0x2CBC] = 0x2CDC ^ 0x2CBC;
        NoFluidModule.D[0xC161 ^ 0xC14E] = 0x8D08 ^ 0xC14E;
        NoFluidModule.D[0xAD15 ^ 0xADF5] = 0x29E6 ^ 0xADF5;
        NoFluidModule.D[0xF004 ^ 0xF085] = 0x5C53 ^ 0xF085;
        NoFluidModule.D[0x178F ^ 0x1604] = 0x1604 ^ 0x1604;
        NoFluidModule.D[0xE7FE ^ 0xE7C3] = 0xFFFF185A ^ 0xE7C3;
        NoFluidModule.D[0x4EA5 ^ 0x4ED0] = 0x4E84 ^ 0x4ED0;
        NoFluidModule.D[0x4D10 ^ 0x4C28] = 0xFFFF2CEB ^ 0x4C28;
        NoFluidModule.D[0x785A ^ 0x79D4] = 0x79D7 ^ 0x79D4;
        NoFluidModule.D[0xEB05 ^ 0xEB95] = 0x8859 ^ 0xEB95;
        NoFluidModule.D[0x1049E ^ 0x10435] = 0x19632 ^ 0x10435;
        NoFluidModule.D[0x2344 ^ 0x23A3] = 0x6368 ^ 0x23A3;
        NoFluidModule.D[0xAB1A ^ 0xAA0D] = 0xAE2B ^ 0xAA0D;
        NoFluidModule.D[0x6471 ^ 0x6553] = 0x245D ^ 0x6553;
        NoFluidModule.D[0xC17C ^ 0xC175] = 0xC10F ^ 0xC175;
        NoFluidModule.D[0x9F27 ^ 0x9F91] = 0x19BB1 ^ 0x9F91;
        NoFluidModule.D[0xD6AF ^ 0xD7A6] = 0x888C ^ 0xD7A6;
        NoFluidModule.D[0x4569 ^ 0x45DE] = 0x651F ^ 0x45DE;
        NoFluidModule.D[0x5DA4 ^ 0x5D7D] = 0x111F ^ 0x5D7D;
        NoFluidModule.D[0x69E4 ^ 0x68EB] = 0xEAB ^ 0x68EB;
        NoFluidModule.D[0xBB85 ^ 0xBA03] = 0x6DA ^ 0xBA03;
        NoFluidModule.D[0x889E ^ 0x8826] = 0xA8E3 ^ 0x8826;
        NoFluidModule.D[0x10EB2 ^ 0x10E88] = 0x10EBB ^ 0x10E88;
        NoFluidModule.D[0x64E0 ^ 0x65C5] = 0x24C8 ^ 0x65C5;
        NoFluidModule.D[0x4A81 ^ 0x4A3B] = 0x6AFE ^ 0x4A3B;
        NoFluidModule.D[0x1F4B ^ 0x1F0D] = 0x1F76 ^ 0x1F0D;
        NoFluidModule.D[0xDB1D ^ 0xDB94] = 0xFFFF58A7 ^ 0xDB94;
        NoFluidModule.D[0x6860 ^ 0x68B8] = 0xFFFFDB6A ^ 0x68B8;
        NoFluidModule.D[0x4841 ^ 0x4897] = 0x4F9 ^ 0x4897;
        NoFluidModule.D[0xC4D8 ^ 0xC41F] = 0xC994 ^ 0xC41F;
        NoFluidModule.D[0x391A ^ 0x383C] = 0x7B59 ^ 0x383C;
        NoFluidModule.D[0x6B02 ^ 0x6BBD] = 0x7F85 ^ 0x6BBD;
        NoFluidModule.D[0xD958 ^ 0xD9C1] = 0x5EA7 ^ 0xD9C1;
        NoFluidModule.D[0xD04F ^ 0xD05C] = 0xFFFF2FF0 ^ 0xD05C;
        NoFluidModule.D[0x2EAE ^ 0x2E66] = 0xFFFFDC12 ^ 0x2E66;
        NoFluidModule.D[0x6D54 ^ 0x6C7F] = 0x3ED5 ^ 0x6C7F;
        NoFluidModule.D[0xA9C8 ^ 0xA8B3] = 0xA9B3 ^ 0xA8B3;
        NoFluidModule.D[0x10485 ^ 0x10447] = 0x1107D ^ 0x10447;
        NoFluidModule.D[0x72DB ^ 0x721D] = 0x7F9F ^ 0x721D;
        NoFluidModule.D[0x108B4 ^ 0x1089F] = 0x1A13B ^ 0x1089F;
        NoFluidModule.D[0x793 ^ 0x6B2] = 0x103AD ^ 0x6B2;
        NoFluidModule.D[0x9C9C ^ 0x9CB5] = 0x2735 ^ 0x9CB5;
        NoFluidModule.D[0x5E12 ^ 0x5E53] = 0x5E4C ^ 0x5E53;
        NoFluidModule.D[0xE4BC ^ 0xE494] = 0xE454 ^ 0xE494;
        NoFluidModule.D[0xAF6 ^ 0xB9B] = 0xFFFFF418 ^ 0xB9B;
        NoFluidModule.D[0x67E4 ^ 0x672F] = 0x16251 ^ 0x672F;
        NoFluidModule.D[0x4F52 ^ 0x4F0B] = 0xFFFFB0C7 ^ 0x4F0B;
        NoFluidModule.D[0x6EBB ^ 0x6F85] = 0x7FA2 ^ 0x6F85;
        NoFluidModule.D[0x4ABF ^ 0x4A6D] = 0x4D4A ^ 0x4A6D;
        NoFluidModule.D[0x642A ^ 0x642E] = 0xFFFF9BFD ^ 0x642E;
        NoFluidModule.D[0xBE46 ^ 0xBE35] = 0xFFFF41E8 ^ 0xBE35;
        NoFluidModule.D[0x779B ^ 0x77CE] = 0xFFFF881A ^ 0x77CE;
        NoFluidModule.D[0xB19C ^ 0xB1C1] = 0xFFFF4E3E ^ 0xB1C1;
        NoFluidModule.D[0x83C0 ^ 0x82ED] = 0xD047 ^ 0x82ED;
        NoFluidModule.D[0x9693 ^ 0x9686] = 0x96F4 ^ 0x9686;
        NoFluidModule.D[0x5DEA ^ 0x5D13] = 0x5F3F ^ 0x5D13;
        NoFluidModule.D[0x3968 ^ 0x3903] = 0xFFFFC693 ^ 0x3903;
        NoFluidModule.D[0x1B38 ^ 0x1A0F] = 0x850B ^ 0x1A0F;
        NoFluidModule.D[0x6D34 ^ 0x6DF0] = 0x35D4 ^ 0x6DF0;
        NoFluidModule.D[0xBA9A ^ 0xBBD5] = 0xF973 ^ 0xBBD5;
        NoFluidModule.D[0x3CF3 ^ 0x3C8A] = 0x3CEE ^ 0x3C8A;
        NoFluidModule.D[0x25A9 ^ 0x24FD] = 0xBB61 ^ 0x24FD;
        NoFluidModule.D[0xB474 ^ 0xB410] = 0xFFFF4BFF ^ 0xB410;
        NoFluidModule.D[0xD86F ^ 0xD815] = 0xFFFF27E2 ^ 0xD815;
        NoFluidModule.D[0x95C8 ^ 0x951F] = 0xD97D ^ 0x951F;
        NoFluidModule.D[0x2A83 ^ 0x2AD8] = 0xFFFFD546 ^ 0x2AD8;
        NoFluidModule.D[0xD0D7 ^ 0xD076] = 0x56C3 ^ 0xD076;
        NoFluidModule.D[0xCB36 ^ 0xCBA9] = 0x4D27 ^ 0xCBA9;
        NoFluidModule.D[0x7BAE ^ 0x7BE9] = 0xFFFF8419 ^ 0x7BE9;
        NoFluidModule.D[0xD25F ^ 0xD292] = 0x1D7EC ^ 0xD292;
        NoFluidModule.D[0x7EB2 ^ 0x7EDD] = 0x7EFF ^ 0x7EDD;
        NoFluidModule.D[0x7235 ^ 0x72C9] = 0xC543 ^ 0x72C9;
        NoFluidModule.D[0x96FD ^ 0x96FE] = 0x96FB ^ 0x96FE;
        NoFluidModule.D[0x662B ^ 0x66B6] = 0x1DB9 ^ 0x66B6;
        NoFluidModule.D[0xC650 ^ 0xC6BC] = 0xFFFFE75A ^ 0xC6BC;
        NoFluidModule.D[0x10A2D ^ 0x10B26] = 0x153 ^ 0x10B26;
        NoFluidModule.D[0x268B ^ 0x262C] = 0x122BE ^ 0x262C;
        NoFluidModule.D[0x9F5C ^ 0x9FF2] = 0xDF3 ^ 0x9FF2;
        NoFluidModule.D[0xEF7 ^ 0xF98] = 0xFE5 ^ 0xF98;
        NoFluidModule.D[0xA90D ^ 0xA84A] = 0xA84A ^ 0xA84A;
        NoFluidModule.D[0xBF70 ^ 0xBF5C] = 0x8BB8 ^ 0xBF5C;
        NoFluidModule.D[0x10EF2 ^ 0x10E0C] = 0x15952 ^ 0x10E0C;
        NoFluidModule.D[0xD7C6 ^ 0xD7A0] = 0xD7F7 ^ 0xD7A0;
        NoFluidModule.D[0x8450 ^ 0x845D] = 0x846A ^ 0x845D;
        NoFluidModule.D[0xAC38 ^ 0xAC2A] = 0xAC72 ^ 0xAC2A;
        NoFluidModule.D[0xFA95 ^ 0xFB17] = 0xBEC3 ^ 0xFB17;
        NoFluidModule.D[0x9DF6 ^ 0x9DE8] = 0xFFFF6205 ^ 0x9DE8;
        NoFluidModule.D[0x3719 ^ 0x362A] = 0x5115 ^ 0x362A;
        NoFluidModule.D[0x1EE4 ^ 0x1E7A] = 0x653B ^ 0x1E7A;
        NoFluidModule.D[0xA12C ^ 0xA10A] = 0xA10A ^ 0xA10A;
        NoFluidModule.D[0x4E56 ^ 0x4F01] = 0xB37C ^ 0x4F01;
        NoFluidModule.D[0x19AD ^ 0x1920] = 0x1355 ^ 0x1920;
        NoFluidModule.D[0xA59 ^ 0xA19] = 0xFFFFF5B6 ^ 0xA19;
        NoFluidModule.D[0xF73E ^ 0xF71A] = 0xF71A ^ 0xF71A;
        NoFluidModule.D[0x30C1 ^ 0x31EF] = 0xC0D ^ 0x31EF;
        NoFluidModule.D[0x10933 ^ 0x109B8] = 0x1039E ^ 0x109B8;
        NoFluidModule.D[0xD0CC ^ 0xD036] = 0x67EE ^ 0xD036;
        NoFluidModule.D[0x10B0C ^ 0x10A17] = 0x130ED ^ 0x10A17;
        NoFluidModule.D[0x91B4 ^ 0x90F0] = 0x97AF ^ 0x90F0;
        NoFluidModule.D[0xCAFA ^ 0xCB9B] = 0xCBA6 ^ 0xCB9B;
        NoFluidModule.D[0x8B12 ^ 0x8A32] = 0xFFFE70F9 ^ 0x8A32;
        NoFluidModule.D[0xA445 ^ 0xA529] = 0xA52A ^ 0xA529;
        NoFluidModule.D[0xDF02 ^ 0xDF98] = 0x5887 ^ 0xDF98;
        NoFluidModule.D[0x7569 ^ 0x74E4] = 0x74F4 ^ 0x74E4;
        NoFluidModule.D[0x2240 ^ 0x233A] = 0x232B ^ 0x233A;
        NoFluidModule.D[0x1719 ^ 0x161E] = 0x4934 ^ 0x161E;
        NoFluidModule.D[0x10466 ^ 0x10516] = 0x1051A ^ 0x10516;
        NoFluidModule.D[0x871 ^ 0x844] = 0x844 ^ 0x844;
        NoFluidModule.D[0x9701 ^ 0x97EF] = 0x1035 ^ 0x97EF;
        NoFluidModule.D[0x687C ^ 0x685D] = 0x685E ^ 0x685D;
        NoFluidModule.D[0x557 ^ 0x5FE] = 0xFFFEFED6 ^ 0x5FE;
        NoFluidModule.D[0x4856 ^ 0x4924] = 0x4925 ^ 0x4924;
        NoFluidModule.D[0xACE1 ^ 0xAC84] = 0xACA6 ^ 0xAC84;
        NoFluidModule.D[0xAA56 ^ 0xAA9F] = 0xA714 ^ 0xAA9F;
        NoFluidModule.D[0x395D ^ 0x3925] = 0xFFFFC6B7 ^ 0x3925;
        NoFluidModule.D[0xF896 ^ 0xF870] = 0xB8A2 ^ 0xF870;
        NoFluidModule.D[0x359B ^ 0x35C4] = 0xFFFFCA61 ^ 0x35C4;
        NoFluidModule.D[0x90AE ^ 0x9029] = 0xECF0 ^ 0x9029;
        NoFluidModule.D[0x35B1 ^ 0x34A8] = 0x308E ^ 0x34A8;
        NoFluidModule.D[0x5C5E ^ 0x5CCA] = 0xC311 ^ 0x5CCA;
        NoFluidModule.D[0xA348 ^ 0xA3AB] = 0xEEB5 ^ 0xA3AB;
        NoFluidModule.D[0xBD7E ^ 0xBD12] = 0xFFFF4261 ^ 0xBD12;
        NoFluidModule.D[0x10945 ^ 0x109E3] = 0x14973 ^ 0x109E3;
        NoFluidModule.D[0xDC65 ^ 0xDD3F] = 0xDD39 ^ 0xDD3F;
        NoFluidModule.D[0x461B ^ 0x473F] = 0x631 ^ 0x473F;
        NoFluidModule.D[0x19F6 ^ 0x19E6] = 0xFFFFE640 ^ 0x19E6;
        NoFluidModule.D[0xB58F ^ 0xB5F9] = 0xB58D ^ 0xB5F9;
        NoFluidModule.D[0x1DE5 ^ 0x1D10] = 0xAB5D ^ 0x1D10;
        NoFluidModule.D[0x81E5 ^ 0x81F2] = 0x81B9 ^ 0x81F2;
        NoFluidModule.D[0x60AF ^ 0x6097] = 0xFFFF9F59 ^ 0x6097;
        NoFluidModule.D[0x94E5 ^ 0x9566] = 0x36D3 ^ 0x9566;
        NoFluidModule.D[0xC9F5 ^ 0xC9B7] = 0xC9D8 ^ 0xC9B7;
        NoFluidModule.D[0x8CDF ^ 0x8DCE] = 0xEB8E ^ 0x8DCE;
        NoFluidModule.D[0xAD20 ^ 0xADC4] = 0xFFFF1F41 ^ 0xADC4;
        NoFluidModule.D[0xA09B ^ 0xA1D5] = 0x6A23 ^ 0xA1D5;
        NoFluidModule.D[0x3DE3 ^ 0x3DAB] = 0xFFFFC20A ^ 0x3DAB;
        NoFluidModule.D[0x6B98 ^ 0x6BAA] = 0x7793 ^ 0x6BAA;
        NoFluidModule.D[0x3311 ^ 0x3227] = 0xAD38 ^ 0x3227;
        NoFluidModule.D[0xCC0D ^ 0xCCCD] = 0xD8F7 ^ 0xCCCD;
        NoFluidModule.D[0xE148 ^ 0xE139] = 0xFFFF1EF8 ^ 0xE139;
        NoFluidModule.D[0xC7B2 ^ 0xC6BF] = 0x1CCCA ^ 0xC6BF;
        NoFluidModule.D[0xE3AD ^ 0xE2C6] = 0xFFFF1D20 ^ 0xE2C6;
        NoFluidModule.D[0x34C6 ^ 0x35FA] = 0xFFFEC6AB ^ 0x35FA;
        NoFluidModule.D[0x4786 ^ 0x4752] = 0x4045 ^ 0x4752;
        NoFluidModule.D[0x12C6 ^ 0x126E] = 0x116F3 ^ 0x126E;
        NoFluidModule.D[0xDD5B ^ 0xDD2B] = 0xDD4A ^ 0xDD2B;
        NoFluidModule.D[0x4864 ^ 0x488D] = 0x846 ^ 0x488D;
        NoFluidModule.D[0x60BD ^ 0x61FE] = 0x66EE ^ 0x61FE;
        NoFluidModule.D[0x50D ^ 0x42A] = 0x474A ^ 0x42A;
        NoFluidModule.D[0x7D30 ^ 0x7D85] = 0xFFFE861F ^ 0x7D85;
        NoFluidModule.D[0x8B29 ^ 0x8A10] = 0x1514 ^ 0x8A10;
        NoFluidModule.D[0x6E75 ^ 0x6E7A] = 0x6EB1 ^ 0x6E7A;
        NoFluidModule.D[0xA10 ^ 0xA73] = 0xA20 ^ 0xA73;
        NoFluidModule.D[0x9D10 ^ 0x9C55] = 0x9B45 ^ 0x9C55;
        NoFluidModule.D[0x8BAD ^ 0x8B10] = 0xFFFF8C90 ^ 0x8B10;
        NoFluidModule.D[0x7A58 ^ 0x7AB3] = 0xA4DA ^ 0x7AB3;
        NoFluidModule.D[0x90AC ^ 0x91B6] = 0xAB52 ^ 0x91B6;
        NoFluidModule.D[0x29B3 ^ 0x29C7] = 0x298D ^ 0x29C7;
        NoFluidModule.D[0x73FA ^ 0x7368] = 0x10A4 ^ 0x7368;
        NoFluidModule.D[0x1587 ^ 0x15E0] = 0x15F9 ^ 0x15E0;
        NoFluidModule.D[0xE4D5 ^ 0xE4C8] = 0xE4B2 ^ 0xE4C8;
        NoFluidModule.D[0x9751 ^ 0x971B] = 0x9705 ^ 0x971B;
        NoFluidModule.D[0x6283 ^ 0x628F] = 0xFFFF9D4A ^ 0x628F;
        NoFluidModule.D[0x7F9A ^ 0x7EDA] = 0xFFFF9104 ^ 0x7EDA;
        NoFluidModule.D[0x33AF ^ 0x332B] = 0x5877 ^ 0x332B;
        NoFluidModule.D[0x4D6A ^ 0x4C76] = 0x7683 ^ 0x4C76;
        NoFluidModule.D[0x29FC ^ 0x28AD] = 0x33E5 ^ 0x28AD;
        NoFluidModule.D[0xA9F1 ^ 0xA905] = 0xFFFFE0A0 ^ 0xA905;
        NoFluidModule.D[0x2909 ^ 0x283C] = 0x4F03 ^ 0x283C;
        NoFluidModule.D[0x3ED3 ^ 0x3ED4] = 0xFFFFC11A ^ 0x3ED4;
        NoFluidModule.D[0x29DC ^ 0x2992] = 0x29CD ^ 0x2992;
        NoFluidModule.D[0x223D ^ 0x2323] = 0x1262A ^ 0x2323;
        NoFluidModule.D[0xB6C1 ^ 0xB79F] = 0xB79B ^ 0xB79F;
        NoFluidModule.D[0x5F8F ^ 0x5E0F] = 0x6FD ^ 0x5E0F;
        NoFluidModule.D[0xF476 ^ 0xF47D] = 0xFFFF0BAF ^ 0xF47D;
        NoFluidModule.D[0xAA4E ^ 0xAB4D] = 0x93E8 ^ 0xAB4D;
        NoFluidModule.D[0xD0EF ^ 0xD189] = 0xD18C ^ 0xD189;
        NoFluidModule.D[0xCC0A ^ 0xCCB4] = 0x34F2 ^ 0xCCB4;
        NoFluidModule.D[0x47AD ^ 0x46FE] = 0x7F2 ^ 0x46FE;
        NoFluidModule.D[0xA18C ^ 0xA119] = 0x3E83 ^ 0xA119;
        NoFluidModule.D[0x7D9F ^ 0x7D2E] = 0xFFFF2DE9 ^ 0x7D2E;
        NoFluidModule.D[0x4F62 ^ 0x4EE6] = 0xD750 ^ 0x4EE6;
        NoFluidModule.D[0x6AD ^ 0x7AB] = 0x5889 ^ 0x7AB;
        NoFluidModule.D[0x1FFE ^ 0x1F22] = 0xB8B8 ^ 0x1F22;
        NoFluidModule.D[0x2FD6 ^ 0x2E9E] = 0x2E9E ^ 0x2E9E;
        NoFluidModule.D[0xBB28 ^ 0xBA77] = 0xFFFF45AB ^ 0xBA77;
        NoFluidModule.D[0x5DE8 ^ 0x5CE9] = 0xBB8 ^ 0x5CE9;
        NoFluidModule.D[0x4639 ^ 0x46EC] = 0x41DA ^ 0x46EC;
        NoFluidModule.D[0xECE0 ^ 0xECDC] = 0xFFFF132B ^ 0xECDC;
        NoFluidModule.D[0xF847 ^ 0xF877] = 0x3411 ^ 0xF877;
        NoFluidModule.D[0x9A21 ^ 0x9ABD] = 0xE1FC ^ 0x9ABD;
        NoFluidModule.D[0x83BD ^ 0x82AE] = 0xBE54 ^ 0x82AE;
        NoFluidModule.D[0xC223 ^ 0xC344] = 0xC351 ^ 0xC344;
        NoFluidModule.D[0xD4C4 ^ 0xD415] = 0xAC6A ^ 0xD415;
        NoFluidModule.D[0xB892 ^ 0xB893] = 0xB884 ^ 0xB893;
        NoFluidModule.D[0xDD0C ^ 0xDDE4] = 0xFFFF62C8 ^ 0xDDE4;
        NoFluidModule.D[0x2231 ^ 0x2342] = 0x2365 ^ 0x2342;
        NoFluidModule.D[0xF7ED ^ 0xF740] = 0x656A ^ 0xF740;
        NoFluidModule.D[0xAE57 ^ 0xAF63] = 0xC83E ^ 0xAF63;
        NoFluidModule.D[0x1072 ^ 0x106A] = 0x107D ^ 0x106A;
        NoFluidModule.D[0x6D7B ^ 0x6CF4] = 0x6CF4 ^ 0x6CF4;
        NoFluidModule.D[0x9F65 ^ 0x9E3E] = 0x9E58 ^ 0x9E3E;
        NoFluidModule.D[0xF0D9 ^ 0xF0AE] = 0xFFFF0F4E ^ 0xF0AE;
        NoFluidModule.D[0xD643 ^ 0xD68F] = 0x1D3F2 ^ 0xD68F;
        NoFluidModule.D[0x8656 ^ 0x86C7] = 0xE569 ^ 0x86C7;
        NoFluidModule.D[0x172C ^ 0x1665] = 0x1664 ^ 0x1665;
        NoFluidModule.D[0x9B58 ^ 0x9B08] = 0xFFFF64FD ^ 0x9B08;
        NoFluidModule.D[0xE922 ^ 0xE914] = 0xE926 ^ 0xE914;
        NoFluidModule.D[0x74F5 ^ 0x7425] = 0xFFFFF3EB ^ 0x7425;
        NoFluidModule.D[0x4AB ^ 0x581] = 0x5739 ^ 0x581;
        NoFluidModule.D[0xDDA6 ^ 0xDCA3] = 0xE406 ^ 0xDCA3;
        NoFluidModule.D[0xFC40 ^ 0xFC1C] = 0xFC2B ^ 0xFC1C;
        NoFluidModule.D[0xC725 ^ 0xC79E] = 0x3FD0 ^ 0xC79E;
        NoFluidModule.D[0x700A ^ 0x7067] = 0xFFFF8FC8 ^ 0x7067;
        NoFluidModule.D[0x9679 ^ 0x97F5] = 0x97E5 ^ 0x97F5;
        NoFluidModule.D[0x10072 ^ 0x100C0] = 0x1AFA8 ^ 0x100C0;
        NoFluidModule.D[0x71F7 ^ 0x71B3] = 0xFFFF8E25 ^ 0x71B3;
        NoFluidModule.D[0x9287 ^ 0x9296] = 0xFFFF6D06 ^ 0x9296;
        NoFluidModule.D[0xA95C ^ 0xA86D] = 0x9595 ^ 0xA86D;
        NoFluidModule.D[0x10AA ^ 0x11C9] = 0xFFFFEE4C ^ 0x11C9;
        NoFluidModule.D[0x10A43 ^ 0x10A2D] = 0xFFFEF5C9 ^ 0x10A2D;
        NoFluidModule.D[0x109B3 ^ 0x109D3] = 0x1091B ^ 0x109D3;
        NoFluidModule.D[0x970C ^ 0x9706] = 0x9753 ^ 0x9706;
        NoFluidModule.D[0xEB56 ^ 0xEB13] = 0xFFFF14B8 ^ 0xEB13;
        NoFluidModule.D[0x5885 ^ 0x5827] = 0xDEA3 ^ 0x5827;
        NoFluidModule.D[0x1C7C ^ 0x1D76] = 0x1170D ^ 0x1D76;
        NoFluidModule.D[0xDB5F ^ 0xDBDF] = 0xDBDF ^ 0xDBDF;
        NoFluidModule.D[0x541E ^ 0x5543] = 0x5564 ^ 0x5543;
        NoFluidModule.D[0xDED6 ^ 0xDFBE] = 0xDFB5 ^ 0xDFBE;
        NoFluidModule.D[0x77E5 ^ 0x76B0] = 0x3FDC ^ 0x76B0;
        NoFluidModule.D[0xF8A7 ^ 0xF920] = 0x62E9 ^ 0xF920;
        NoFluidModule.D[0xAC48 ^ 0xACA2] = 0x72C9 ^ 0xACA2;
        NoFluidModule.D[0x10D16 ^ 0x10D00] = 0x10D28 ^ 0x10D00;
        NoFluidModule.D[0x8B1A ^ 0x8B53] = 0xFFFF74ED ^ 0x8B53;
        NoFluidModule.D[0xDCD7 ^ 0xDCBF] = 0xDC91 ^ 0xDCBF;
        NoFluidModule.D[0xBFDE ^ 0xBEBC] = 0xBEB2 ^ 0xBEBC;
        NoFluidModule.D[0xAA10 ^ 0xAA30] = 0xAA47 ^ 0xAA30;
        NoFluidModule.D[0x8D93 ^ 0x8D0B] = 0xA14 ^ 0x8D0B;
        NoFluidModule.D[0xE43E ^ 0xE512] = 0xB780 ^ 0xE512;
        NoFluidModule.D[0xD334 ^ 0xD23A] = 0xB477 ^ 0xD23A;
        NoFluidModule.D[0xECFA ^ 0xEC29] = 0xEB1F ^ 0xEC29;
        NoFluidModule.D[0x10866 ^ 0x108D6] = 0x1A7BE ^ 0x108D6;
        NoFluidModule.D[0xEE6E ^ 0xEE13] = 0xEE13 ^ 0xEE13;
        NoFluidModule.D[0x8F81 ^ 0x8F79] = 0x8D57 ^ 0x8F79;
        NoFluidModule.D[0x10D83 ^ 0x10CF6] = 0x10C8A ^ 0x10CF6;
        NoFluidModule.D[0x8F07 ^ 0x8F6E] = 0xFFFF705D ^ 0x8F6E;
        NoFluidModule.D[0x34A5 ^ 0x3496] = 0x8A8D ^ 0x3496;
        NoFluidModule.D[0x3864 ^ 0x395E] = 0x135E9 ^ 0x395E;
        NoFluidModule.D[0x1017B ^ 0x10140] = 0xFFFEFEE6 ^ 0x10140;
        NoFluidModule.D[0x7F4B ^ 0x7F1A] = 0x7F18 ^ 0x7F1A;
        NoFluidModule.D[0x6516 ^ 0x659C] = 0x194E ^ 0x659C;
        NoFluidModule.D[0x67D7 ^ 0x665F] = 0x6993 ^ 0x665F;
        NoFluidModule.D[0x3C9D ^ 0x3C0B] = 0xA3D0 ^ 0x3C0B;
        NoFluidModule.D[0xFD68 ^ 0xFDE4] = 0xF7C5 ^ 0xFDE4;
        NoFluidModule.D[0xAD53 ^ 0xAD1E] = 0xFFFF528E ^ 0xAD1E;
        NoFluidModule.D[0xE3E4 ^ 0xE3EA] = 0xFFFF1C18 ^ 0xE3EA;
        NoFluidModule.D[0x194F ^ 0x194F] = 0xFFFFE698 ^ 0x194F;
        NoFluidModule.D[0x20C6 ^ 0x205D] = 0x5B10 ^ 0x205D;
        NoFluidModule.D[0xD2C1 ^ 0xD223] = 0x9F22 ^ 0xD223;
        NoFluidModule.D[0x7AF ^ 0x7F9] = 0x7F4 ^ 0x7F9;
        NoFluidModule.D[0xE0CB ^ 0xE19B] = 0x629C ^ 0xE19B;
        NoFluidModule.D[0x21C ^ 0x24E] = 0xFFFFFDDA ^ 0x24E;
        NoFluidModule.D[0xD058 ^ 0xD132] = 0xD13F ^ 0xD132;
        NoFluidModule.D[0xFBF9 ^ 0xFBCD] = 0x1B53 ^ 0xFBCD;
        NoFluidModule.D[0x68B1 ^ 0x68D3] = 0x68E5 ^ 0x68D3;
        NoFluidModule.D[0x95F ^ 0x828] = 0x849 ^ 0x828;
        NoFluidModule.D[0xF5C4 ^ 0xF560] = 0xB5F0 ^ 0xF560;
        NoFluidModule.D[0x8790 ^ 0x874B] = 0x20A4 ^ 0x874B;
        NoFluidModule.D[0x794E ^ 0x783A] = 0x7838 ^ 0x783A;
        NoFluidModule.D[0x3F17 ^ 0x3E28] = 0x2E0B ^ 0x3E28;
        NoFluidModule.D[0xDBCF ^ 0xDBCD] = 0xFFFF240E ^ 0xDBCD;
        NoFluidModule.D[0xFDFD ^ 0xFCE0] = 0xC61A ^ 0xFCE0;
        NoFluidModule.D[0xB262 ^ 0xB2A1] = 0xB2A1 ^ 0xB2A1;
        NoFluidModule.D[0x1055D ^ 0x10522] = 0x10523 ^ 0x10522;
        NoFluidModule.D[0x3942 ^ 0x399D] = 0xBDB5 ^ 0x399D;
        NoFluidModule.D[0x2B8A ^ 0x2BE0] = 0xFFFFD463 ^ 0x2BE0;
        NoFluidModule.D[0xFE45 ^ 0xFE51] = 0xFE55 ^ 0xFE51;
        NoFluidModule.D[0x2383 ^ 0x23A0] = 0x23A1 ^ 0x23A0;
        NoFluidModule.D[0x7422 ^ 0x750D] = 0x48F5 ^ 0x750D;
        NoFluidModule.D[0x53CE ^ 0x5340] = 0x5961 ^ 0x5340;
        NoFluidModule.D[0xFC12 ^ 0xFD9B] = 0xF4D6 ^ 0xFD9B;
        NoFluidModule.D[0x116A ^ 0x11AB] = 0x5CF ^ 0x11AB;
        NoFluidModule.D[0xA9B8 ^ 0xA93A] = 0x5FC ^ 0xA93A;
        NoFluidModule.D[0x7BFC ^ 0x7B5F] = 0x3BC6 ^ 0x7B5F;
        NoFluidModule.D[0x4843 ^ 0x48B3] = 0xFFFF3094 ^ 0x48B3;
        NoFluidModule.D[0x4EDA ^ 0x4E69] = 0x14A48 ^ 0x4E69;
        NoFluidModule.D[0x75A8 ^ 0x7555] = 0xC28A ^ 0x7555;
        NoFluidModule.D[0x40A8 ^ 0x40AE] = 0x408A ^ 0x40AE;
        NoFluidModule.D[0x6439 ^ 0x656B] = 0x6AB1 ^ 0x656B;
        NoFluidModule.D[0x3D9D ^ 0x3CBE] = 0x7DB3 ^ 0x3CBE;
        NoFluidModule.D[0x5926 ^ 0x59B5] = 0xC663 ^ 0x59B5;
        NoFluidModule.D[0x3333 ^ 0x3364] = 0xFFFFCCEE ^ 0x3364;
        NoFluidModule.D[0x8A5F ^ 0x8B5F] = 0xFFFF23BD ^ 0x8B5F;
        NoFluidModule.D[0x10BF2 ^ 0x10B03] = 0x18CC1 ^ 0x10B03;
        NoFluidModule.D[0xC8D7 ^ 0xC995] = 0xCE83 ^ 0xC995;
        NoFluidModule.D[0xCDC1 ^ 0xCD1C] = 0x6AF3 ^ 0xCD1C;
        NoFluidModule.D[0x45B1 ^ 0x4543] = 0xF305 ^ 0x4543;
        NoFluidModule.D[0xD37B ^ 0xD305] = 0xD304 ^ 0xD305;
        NoFluidModule.D[0x9E8A ^ 0x9EB5] = 0xFFFF617A ^ 0x9EB5;
        NoFluidModule.D[0xA8BF ^ 0xA8BA] = 0xA896 ^ 0xA8BA;
        NoFluidModule.D[0x10C8D ^ 0x10D95] = 0x109C3 ^ 0x10D95;
        NoFluidModule.D[0xB912 ^ 0xB802] = 0xDE75 ^ 0xB802;
        NoFluidModule.D[0x7FCA ^ 0x7F7E] = 0x17B5E ^ 0x7F7E;
        NoFluidModule.D[0xC682 ^ 0xC7AA] = 0xFFFF7B2F ^ 0xC7AA;
        NoFluidModule.D[0xF31B ^ 0xF3C5] = 0x77ED ^ 0xF3C5;
        NoFluidModule.D[0x1FF9 ^ 0x1EEF] = 0x1AD5 ^ 0x1EEF;
        NoFluidModule.D[0xA80D ^ 0xA812] = 0xFFFF57AE ^ 0xA812;
        NoFluidModule.D[0xA3D0 ^ 0xA3F5] = 0xA3F7 ^ 0xA3F5;
        NoFluidModule.D[0xDD14 ^ 0xDD97] = 0xB6C8 ^ 0xDD97;
        NoFluidModule.D[0x283B ^ 0x29BE] = 0xCAF9 ^ 0x29BE;
        NoFluidModule.D[0x1997 ^ 0x1958] = 0x6127 ^ 0x1958;
        NoFluidModule.D[0xA8AC ^ 0xA9CC] = 0xA9C6 ^ 0xA9CC;
        NoFluidModule.D[0x56FC ^ 0x57B7] = 0x57A5 ^ 0x57B7;
        NoFluidModule.D[0xD376 ^ 0xD385] = 0x65C8 ^ 0xD385;
        NoFluidModule.D[0xBD85 ^ 0xBCFC] = 0xFFFF4347 ^ 0xBCFC;
        NoFluidModule.D[0x3020 ^ 0x30C1] = 0xB4E9 ^ 0x30C1;
        NoFluidModule.D[0x1D4 ^ 0x178] = 0x9379 ^ 0x178;
        NoFluidModule.D[0x3CC2 ^ 0x3DBA] = 0x3DB5 ^ 0x3DBA;
        NoFluidModule.D[0x9B6A ^ 0x9BD3] = 0xBB17 ^ 0x9BD3;
        NoFluidModule.D[0x5222 ^ 0x535C] = 0x535F ^ 0x535C;
        NoFluidModule.D[0x1C2C ^ 0x1CA4] = 0x6076 ^ 0x1CA4;
        NoFluidModule.D[0x436F ^ 0x4223] = 0x782 ^ 0x4223;
        NoFluidModule.D[0x10F02 ^ 0x10E06] = 0x136B1 ^ 0x10E06;
        NoFluidModule.D[0x19B3 ^ 0x19FF] = 0x198E ^ 0x19FF;
        NoFluidModule.D[0x675A ^ 0x661B] = 0x7638 ^ 0x661B;
        NoFluidModule.D[0x8B59 ^ 0x8B40] = 0xFFFF74CA ^ 0x8B40;
        NoFluidModule.D[0xE3F6 ^ 0xE38D] = 0xE38C ^ 0xE38D;
        NoFluidModule.D[0xEDB6 ^ 0xECCA] = 0xECC8 ^ 0xECCA;
        NoFluidModule.D[0x4E65 ^ 0x4E9A] = 0x19CB ^ 0x4E9A;
        NoFluidModule.D[0x6626 ^ 0x6743] = 0x6721 ^ 0x6743;
        NoFluidModule.D[0x870 ^ 0x901] = 0xFFFFF6E0 ^ 0x901;
        NoFluidModule.D[0x8B39 ^ 0x8B07] = 0xFFFF74B7 ^ 0x8B07;
        NoFluidModule.D[0x688F ^ 0x68C0] = 0x688A ^ 0x68C0;
        NoFluidModule.D[0xDDDD ^ 0xDD89] = 0xDDA6 ^ 0xDD89;
        NoFluidModule.D[0x531A ^ 0x5212] = 0xFFFFF2E9 ^ 0x5212;
        NoFluidModule.D[0x9055 ^ 0x90FF] = 0x19462 ^ 0x90FF;
        NoFluidModule.D[0xBAEB ^ 0xBA25] = 0xC24D ^ 0xBA25;
        NoFluidModule.D[0xB5D2 ^ 0xB524] = 0xB702 ^ 0xB524;
        NoFluidModule.D[0xA927 ^ 0xA916] = 0x968E ^ 0xA916;
        NoFluidModule.D[0x3478 ^ 0x3426] = 0xFFFFCBA0 ^ 0x3426;
        NoFluidModule.D[0xD64D ^ 0xD631] = 0xD633 ^ 0xD631;
        NoFluidModule.D[0x8113 ^ 0x813D] = 0xD318 ^ 0x813D;
        NoFluidModule.D[0xF7D1 ^ 0xF7B0] = 0xFFFF083E ^ 0xF7B0;
        NoFluidModule.D[0xC40F ^ 0xC526] = 0x8646 ^ 0xC526;
        NoFluidModule.D[0x3D87 ^ 0x3CE3] = 0x3CE4 ^ 0x3CE3;
        NoFluidModule.D[0x5311 ^ 0x5363] = 0x530D ^ 0x5363;
        NoFluidModule.D[0x39B7 ^ 0x399D] = 0xE29F ^ 0x399D;
        NoFluidModule.D[0xE360 ^ 0xE239] = 0xE229 ^ 0xE239;
        NoFluidModule.D[0xDF43 ^ 0xDF61] = 0xDF61 ^ 0xDF61;
        NoFluidModule.D[0xB45A ^ 0xB558] = 0x8DE0 ^ 0xB558;
        NoFluidModule.D[0x1064B ^ 0x10681] = 0x3FE ^ 0x10681;
        NoFluidModule.D[0x8A2A ^ 0x8B5C] = 0x8B55 ^ 0x8B5C;
        NoFluidModule.D[0x1027A ^ 0x10220] = 0xFFFEFDA9 ^ 0x10220;
        NoFluidModule.D[0xD1E6 ^ 0xD0BA] = 0xD0B2 ^ 0xD0BA;
        NoFluidModule.D[0x7874 ^ 0x7944] = 0xFFFFBB75 ^ 0x7944;
        NoFluidModule.D[0xA92 ^ 0xA77] = 0x4769 ^ 0xA77;
        NoFluidModule.D[0xF00F ^ 0xF0A0] = 0x5FCD ^ 0xF0A0;
        NoFluidModule.D[0xE9D2 ^ 0xE8E9] = 0x1E44E ^ 0xE8E9;
        NoFluidModule.D[0xCC9C ^ 0xCC0B] = 0x4B14 ^ 0xCC0B;
        NoFluidModule.D[0xB6F3 ^ 0xB7B9] = 0xB7B9 ^ 0xB7B9;
        NoFluidModule.D[0xFC1F ^ 0xFD00] = 0x1F81F ^ 0xFD00;
        NoFluidModule.D[0x6FB7 ^ 0x6EEF] = 0x6EEE ^ 0x6EEF;
        NoFluidModule.D[0xB08F ^ 0xB087] = 0xB0D0 ^ 0xB087;
        NoFluidModule.D[0x8CD4 ^ 0x8DA9] = 0x8DA9 ^ 0x8DA9;
        NoFluidModule.D[0x7726 ^ 0x7670] = 0xEA4C ^ 0x7670;
        NoFluidModule.D[0x7DC8 ^ 0x7D90] = 0x7DF2 ^ 0x7D90;
        NoFluidModule.D[0xFDB7 ^ 0xFD31] = 0x966D ^ 0xFD31;
        NoFluidModule.D[0x9613 ^ 0x9634] = 0x9634 ^ 0x9634;
        NoFluidModule.D[0xB911 ^ 0xB857] = 0xB857 ^ 0xB857;
        NoFluidModule.D[0xB06C ^ 0xB0CC] = 0x3648 ^ 0xB0CC;
        NoFluidModule.D[0x4DFE ^ 0x4D09] = 0x4F25 ^ 0x4D09;
        NoFluidModule.D[0x3CC ^ 0x321] = 0xDD48 ^ 0x321;
        NoFluidModule.D[0x2543 ^ 0x257A] = 0xFFFFDAC3 ^ 0x257A;
        NoFluidModule.D[0xE67B ^ 0xE6A1] = 0x415D ^ 0xE6A1;
        NoFluidModule.D[0x7B32 ^ 0x7BDD] = 0xFC1F ^ 0x7BDD;
        NoFluidModule.D[0xF7F8 ^ 0xF7E4] = 0xFFFF086C ^ 0xF7E4;
        NoFluidModule.D[0x9660 ^ 0x964D] = 0xA198 ^ 0x964D;
        NoFluidModule.D[0x7F2E ^ 0x7E3B] = 0x42C1 ^ 0x7E3B;
        NoFluidModule.D[0x5CC9 ^ 0x5D84] = 0xA3E2 ^ 0x5D84;
        NoFluidModule.D[0xE92D ^ 0xE81F] = 0x8F34 ^ 0xE81F;
        NoFluidModule.D[0x10072 ^ 0x100FD] = 0x1633F ^ 0x100FD;
        NoFluidModule.D[0x33BC ^ 0x3379] = 0x6B7D ^ 0x3379;
        NoFluidModule.D[0xE76F ^ 0xE610] = 0x6DF1 ^ 0xE610;
        NoFluidModule.D[0x70DE ^ 0x708D] = 0x70C3 ^ 0x708D;
    }
}

