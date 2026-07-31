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
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.setting.c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.module.modules.render.c
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2={"Lkotakbaz/rain/module/modules/render/ItemPhysicModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "is2DMode", "()Z", "isPhysicsMode", "", "MODE_PHYSICS", "Ljava/lang/String;", "MODE_2D", "Lkotakbaz/rain/module/setting/ModeSetting;", "modeSetting", "Lkotakbaz/rain/module/setting/ModeSetting;", "rain-visuals"})
public final class c_0
extends a_0 {
    @NotNull
    public static final c_0 INSTANCE;
    @NotNull
    private static final String a = "\u0424\u0438\u0437\u0438\u043a\u0430";
    @NotNull
    private static final String A = "2\u0434";
    @NotNull
    private static final c b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private c_0() {
        int n = e[0];
        n -= e[1];
        int n2 = e[3];
        n2 -= e[4];
        int n3 = e[6];
        n3 += e[7];
        super((String)B[n += e[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)B[n2 -= e[5]] + (String)B[n3 -= e[8]]);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean is2DMode() {
        int n;
        if (this.isEnabled()) {
            int n2 = e[9];
            n2 += e[10];
            if (Intrinsics.areEqual(b.getValue(), (String)B[n2 += e[11]])) {
                int n3 = e[12];
                n3 ^= e[13];
                n = n3 ^= e[14];
                return n != 0;
            }
        }
        int n4 = e[15];
        n4 += e[16];
        n = n4 += e[17];
        return n != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean isPhysicsMode() {
        int n;
        if (this.isEnabled()) {
            int n2 = e[18];
            n2 ^= e[19];
            if (Intrinsics.areEqual(b.getValue(), (String)B[n2 -= e[20]])) {
                int n3 = e[21];
                n3 += e[22];
                n = n3 += e[23];
                return n != 0;
            }
        }
        int n4 = e[24];
        n4 -= e[25];
        n = n4 ^= e[26];
        return n != 0;
    }

    static {
        c_0.b();
        long l = 864411237078474957L;
        long l2 = 6397415172461188946L;
        long l3 = -8426643221524175780L;
        long l4 = -2250549192160256282L;
        long l5 = 8034036143322770861L;
        long l6 = -9164282977427420179L;
        long l7 = -2530365851000501921L;
        long l8 = 4588156230403754890L;
        long l9 = -5523570804915398241L;
        long l10 = -269953930172673667L;
        long l11 = -8296855889803551851L;
        long l12 = 6118527268773059768L;
        long l13 = 2132257845937917985L;
        long l14 = 6911823998575784243L;
        int n = e[27];
        n -= e[28];
        B = new Object[n -= e[29]];
        long l15 = l14;
        int n2 = e[30];
        n2 ^= e[31];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += e[32]);
        Object[] objectArray = new Object[e[33]];
        objectArray[c_0.e[34]] = c;
        objectArray[c_0.e[35]] = e[36];
        int n3 = e[37];
        Object object = c_0.A()[e[38]];
        if (object == null) {
            char[] cArray = "\u1228\u121a\u1212\u1233\u1213\u1207\u11b5\u1233\u1213\u1233\u11f6\u11f5\u1210\u6e5f\u11ff\u11f0\u1204\u11f8\u1227\u11f9\u1219\u1209\u6e7e\u1216\u11ff\u1219\u11b5\u1201\u11b8\u1208\u11b6\u11b9\u11f5\u11fa\u1233\u6e7d\u1202\u1233\u1211\u11b4\u1217\u11b7\u1233\u11d3\u11b8\u11f1\u6e7e\u11d3\u1217\u1225\u11f1\u1213\u1213\u6e7e\u11b9\u6e5f\u1213\u1209\u1211\u1204\u1229\u11f9\u11f0\u1218\u1217\u11f4\u11f1\u1216\u1217\u6e7d\u1227\u11ff\u11f7\u1210\u1212\u11b6\u1201\u1219\u6e63\u1227\u11f6\u11b6\u123e\u11b7\u11f8\u1221\u11f2\u11ba\u1219\u11b9\u121c\u1222\u11b7\u11ba\u1227\u1206\u1209\u121c\u1208\u1208\u11b9\u11f0\u11d3\u1226\u11f5\u6e7e\u1209\u121d\u11f7\u1211\u1220\u1222\u121e\u1233\u11b0\u11fa\u121b\u1219\u11f1\u11f7\u1201\u1210\u11f9\u11b6\u1233\u1200\u1206\u1212\u121b\u11b8\u123e\u1218\u1220\u11fb\u11f7\u121e\u121e\u1208\u11b5\u11f1\u11f1\u6e7e\u6e63\u11f0\u1213\u1216\u1217\u11b6\u11f4\u1221\u1209\u1206\u11f7\u11f2\u1201\u11f7\u11b8\u11f4\u1207\u1233\u121b\u11ba\u1222\u1216\u121e\u1219\u6e7d\u6e63\u121b\u1209\u1206\u1225\u11b5\u11bb\u1216\u11f1\u6e7c\u1233\u6e7c\u11b5\u1203\u1224\u121d\u1208\u1200\u1221\u1218\u11f8\u11b0\u11fa\u11fb\u11f1\u1229\u11b5\u1215\u1213\u1211\u1218\u1217\u1217\u1212\u1225\u11b6\u11ba\u11fb\u1226\u1215\u6e7c\u1217\u1214\u11b6\u11f7\u1202\u1202\u11ec\u11ec".toCharArray();
            for (int i2 = e[39]; i2 < e[40]; ++i2) {
                int n4 = cArray[i2];
                n4 ^= e[41];
                n4 += e[42];
                n4 ^= e[43];
                n4 += e[44];
                n4 -= e[45];
                n4 ^= e[46];
                n4 -= e[47];
                n4 ^= e[48];
                n4 += e[49];
                n4 ^= e[50];
                cArray[i2] = (char)(n4 += e[51]);
            }
            object = c_0.A()[c_0.e[52]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)c_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = e[53];
        n5 += e[54];
        l5 = l16 ^ (0x5100000000L ^ l16) & -1L << (n5 += e[55]);
        long l17 = l12;
        int n6 = e[56];
        n6 -= e[57];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= e[58]);
        while (true) {
            int n7 = e[59];
            n7 -= e[60];
            if ((int)l12 >= (int)(l5 >>> (n7 -= e[61]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = e[62];
            n9 -= e[63];
            int n10 = e[65];
            n10 -= e[66];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += e[64])) & -1L >>> (n10 ^= e[67]);
            long l19 = l8;
            int n11 = e[68];
            n11 += e[69];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= e[70]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = e[71];
            n13 ^= e[72];
            int n14 = e[74];
            n14 -= e[75];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= e[73])) & -1L >>> (n14 ^= e[76]);
            int n15 = e[77];
            n15 ^= e[78];
            long l21 = l9;
            int n16 = e[80];
            n16 ^= e[81];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += e[79]) ^ l21) & -1L << (n16 -= e[82]);
            int n17 = e[83];
            n17 ^= e[84];
            n17 ^= e[85];
            int n18 = e[86];
            n18 ^= e[87];
            long l22 = l11;
            int n19 = e[89];
            n19 += e[90];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += e[88]))) ^ l22) & -1L >>> (n19 += e[91]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = e[92];
            n20 += e[93];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += e[94]);
            while (true) {
                int n21 = e[95];
                n21 ^= e[96];
                if ((int)(l13 >>> (n21 ^= e[97])) >= (int)l11) break;
                int n22 = e[98];
                n22 += e[99];
                int n23 = e[101];
                n23 += e[102];
                cArray2[(int)(l13 >>> (n22 -= c_0.e[100]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= e[103]))];
                l13 += 0x100000000L;
            }
            int n24 = e[104];
            n24 += e[105];
            int n25 = (int)(l14 >>> (n24 ^= e[106]));
            l14 += 0x100000000L;
            c_0.B[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = e[107];
            n26 += e[108];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += e[109]);
        }
        INSTANCE = new c_0();
        int n27 = e[110];
        n27 ^= e[111];
        n27 -= e[112];
        int n28 = e[113];
        n28 ^= e[114];
        String[] stringArray = new String[n28 -= e[115]];
        int n29 = e[116];
        n29 += e[117];
        int n30 = e[119];
        n30 -= e[120];
        stringArray[n29 ^= c_0.e[118]] = (String)B[n30 += e[121]];
        int n31 = e[122];
        n31 += e[123];
        int n32 = e[125];
        n32 -= e[126];
        stringArray[n31 -= c_0.e[124]] = (String)B[n32 += e[127]];
        int n33 = e[128];
        n33 += e[129];
        int n34 = e[131];
        n34 ^= e[132];
        b = a_0.mode$default(INSTANCE, (String)B[n27], CollectionsKt.listOf(stringArray), n33 ^= e[130], n34 ^= e[133], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[e[134]];
        String string = (String)object[e[135]];
        object = object[e[136]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[137]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[138]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[140] ^ e[141]];
                byArray[c_0.e[142] ^ c_0.e[143]] = e[144] ^ e[145];
                byArray[c_0.e[146] ^ c_0.e[147]] = e[148] ^ e[149];
                byArray[c_0.e[150] ^ c_0.e[151]] = e[152] ^ e[153];
                byArray[c_0.e[154] ^ c_0.e[155]] = e[156] ^ e[157];
                byArray[c_0.e[158] ^ c_0.e[159]] = e[160] ^ e[161];
                byArray[c_0.e[162] ^ c_0.e[163]] = e[164] ^ e[165];
                byArray[c_0.e[166] ^ c_0.e[167]] = e[168] ^ e[169];
                byArray[c_0.e[170] ^ c_0.e[171]] = e[172] ^ e[173];
                byArray[c_0.e[174] ^ c_0.e[175]] = e[176] ^ e[177];
                byArray[c_0.e[178] ^ c_0.e[179]] = e[180] ^ e[181];
                byArray[c_0.e[182] ^ c_0.e[183]] = e[184] ^ e[185];
                byArray[c_0.e[186] ^ c_0.e[187]] = e[188] ^ e[189];
                byArray[c_0.e[190] ^ c_0.e[191]] = e[192] ^ e[193];
                byArray[c_0.e[194] ^ c_0.e[195]] = e[196] ^ e[197];
                byArray[c_0.e[198] ^ c_0.e[199]] = e[200] ^ e[201];
                byArray[c_0.e[202] ^ c_0.e[203]] = e[204] ^ e[205];
                objectArray2[c_0.e[139]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[206]];
            if (C == null) {
                byte[] byArray2 = new byte[e[207] ^ e[208]];
                byArray2[c_0.e[209] ^ c_0.e[210]] = e[211] ^ e[212];
                byArray2[c_0.e[213] ^ c_0.e[214]] = e[215] ^ e[216];
                byArray2[c_0.e[217] ^ c_0.e[218]] = e[219] ^ e[220];
                byArray2[c_0.e[221] ^ c_0.e[222]] = e[223] ^ e[224];
                byArray2[c_0.e[225] ^ c_0.e[226]] = e[227] ^ e[228];
                byArray2[c_0.e[229] ^ c_0.e[230]] = e[231] ^ e[232];
                byArray2[c_0.e[233] ^ c_0.e[234]] = e[235] ^ e[236];
                byArray2[c_0.e[237] ^ c_0.e[238]] = e[239] ^ e[240];
                byArray2[c_0.e[241] ^ c_0.e[242]] = e[243] ^ e[244];
                byArray2[c_0.e[245] ^ c_0.e[246]] = e[247] ^ e[248];
                byArray2[c_0.e[249] ^ c_0.e[250]] = e[251] ^ e[252];
                byArray2[c_0.e[253] ^ c_0.e[254]] = e[255] ^ e[256];
                byArray2[c_0.e[257] ^ c_0.e[258]] = e[259] ^ e[260];
                byArray2[c_0.e[261] ^ c_0.e[262]] = e[263] ^ e[264];
                byArray2[c_0.e[265] ^ c_0.e[266]] = e[267] ^ e[268];
                byArray2[c_0.e[269] ^ c_0.e[270]] = e[271] ^ e[272];
                byArray2[c_0.e[273] ^ c_0.e[274]] = e[275] ^ e[276];
                byArray2[c_0.e[277] ^ c_0.e[278]] = e[279] ^ e[280];
                byArray2[c_0.e[281] ^ c_0.e[282]] = e[283] ^ e[284];
                byArray2[c_0.e[285] ^ c_0.e[286]] = e[287] ^ e[288];
                byArray2[c_0.e[289] ^ c_0.e[290]] = e[291] ^ e[292];
                byArray2[c_0.e[293] ^ c_0.e[294]] = e[295] ^ e[296];
                byArray2[c_0.e[297] ^ c_0.e[298]] = e[299] ^ e[300];
                byArray2[c_0.e[301] ^ c_0.e[302]] = e[303] ^ e[304];
                byArray2[c_0.e[305] ^ c_0.e[306]] = e[307] ^ e[308];
                byArray2[c_0.e[309] ^ c_0.e[310]] = e[311] ^ e[312];
                byArray2[c_0.e[313] ^ c_0.e[314]] = e[315] ^ e[316];
                byArray2[c_0.e[317] ^ c_0.e[318]] = e[319] ^ e[320];
                byArray2[c_0.e[321] ^ c_0.e[322]] = e[323] ^ e[324];
                byArray2[c_0.e[325] ^ c_0.e[326]] = e[327] ^ e[328];
                byArray2[c_0.e[329] ^ c_0.e[330]] = e[331] ^ e[332];
                byArray2[c_0.e[333] ^ c_0.e[334]] = e[335] ^ e[336];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, e[337], byArray3, e[338], byArray.length);
                System.arraycopy(byArray2, e[339], byArray3, byArray.length, byArray2.length);
                Object object4 = c_0.A()[e[340]];
                if (object4 == null) {
                    char[] cArray = "\u5bf7\u5c25\u5c2c\u5c23\u5c21\u5c15\u5c00\u5c0e\u5cd3\u5c0f\u5c2f\u5c0a\u5c06\u5c04\u5bf4\u5c2f\u5c26\u5c16".toCharArray();
                    for (int i2 = e[341]; i2 < e[342]; ++i2) {
                        int n2 = cArray[i2];
                        n2 -= e[343];
                        n2 += e[344];
                        n2 -= e[345];
                        n2 ^= e[346];
                        n2 ^= e[347];
                        n2 += e[348];
                        n2 -= e[349];
                        n2 ^= e[350];
                        n2 ^= e[351];
                        n2 += e[352];
                        cArray[i2] = (char)(n2 -= e[353]);
                    }
                    object4 = c_0.A()[c_0.e[354]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[e[355]];
                byArray4[c_0.e[356]] = e[357];
                byArray4[c_0.e[358]] = e[359];
                byArray4[c_0.e[360]] = e[361];
                byArray4[c_0.e[362]] = e[363];
                byArray4[c_0.e[364]] = e[365];
                byArray4[c_0.e[366]] = e[367];
                byArray4[c_0.e[368]] = e[369];
                byArray4[c_0.e[370]] = e[371];
                byArray4[c_0.e[372]] = e[373];
                byArray4[c_0.e[374]] = e[375];
                byArray4[c_0.e[376]] = e[377];
                byArray4[c_0.e[378]] = e[379];
                byArray4[c_0.e[380]] = e[381];
                byArray4[c_0.e[382]] = e[383];
                byArray4[c_0.e[384]] = e[385];
                byArray4[c_0.e[386]] = e[387];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, e[388], e[389]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = c_0.A()[e[390]];
                if (object5 == null) {
                    char[] cArray = "\ub79e\ub7a2\ub78c".toCharArray();
                    for (int i3 = e[391]; i3 < e[392]; ++i3) {
                        int n3 = cArray[i3];
                        n3 += e[393];
                        n3 -= e[394];
                        n3 ^= e[395];
                        n3 ^= e[396];
                        n3 += e[397];
                        n3 += e[398];
                        n3 -= e[399];
                        n3 -= 22993;
                        n3 += 16756;
                        n3 += 1499;
                        n3 ^= 0x6E9D;
                        n3 -= 11647;
                        cArray[i3] = (char)(n3 += 59103);
                    }
                    object5 = c_0.A()[2] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = c_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u9e6e\u9e7a\u9ee4\u8108\u9e74\u9e6f\u9e74\u8108\u9ea9\u9e5c\u9e74\u9ee4\u810a\u9ea9\u9e8e\u9e95\u9e95\u9e96\u9e43\u9e40".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 ^= 0x3120;
                    n4 -= 24421;
                    n4 -= 59623;
                    n4 ^= 0x402B;
                    n4 += 20716;
                    n4 ^= 0x87EC;
                    n4 ^= 0x474D;
                    n4 += 62062;
                    n4 -= 21171;
                    n4 -= 8628;
                    n4 -= 59415;
                    n4 += 23002;
                    n4 ^= 0xFDBC;
                    cArray[i4] = (char)(n4 += 43647);
                }
                object6 = c_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)C), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = D;
        if (D == null) {
            D = new Object[4];
            objectArray = D;
        }
        return objectArray;
    }

    public static void b() {
        e = new int[0x223B ^ 0x23AB];
        c_0.e[0xBA5E ^ 0xBA84] = 0x15CC ^ 0xBA84;
        c_0.e[0xB6E ^ 0xBED] = 0xFFFFF452 ^ 0xBED;
        c_0.e[0x7649 ^ 0x7775] = 0x282F ^ 0x7775;
        c_0.e[0x1508 ^ 0x1468] = 0xC8D5 ^ 0x1468;
        c_0.e[0xF8A1 ^ 0xF8D2] = 0xFFFF0723 ^ 0xF8D2;
        c_0.e[0x91FE ^ 0x91D7] = 0xA224 ^ 0x91D7;
        c_0.e[0x308F ^ 0x31C5] = 0x887C ^ 0x31C5;
        c_0.e[0x1B08 ^ 0x1A17] = 0xFFFFC924 ^ 0x1A17;
        c_0.e[0x7297 ^ 0x7222] = 0x9094 ^ 0x7222;
        c_0.e[0xD35C ^ 0xD2D7] = 0x4C14 ^ 0xD2D7;
        c_0.e[0xAE7 ^ 0xA92] = 0xAF4 ^ 0xA92;
        c_0.e[0xE185 ^ 0xE13E] = 0x60FE ^ 0xE13E;
        c_0.e[0x1019B ^ 0x101DF] = 0x10144 ^ 0x101DF;
        c_0.e[0xFB31 ^ 0xFAB3] = 0xFABF ^ 0xFAB3;
        c_0.e[0x957D ^ 0x9524] = 0x95AA ^ 0x9524;
        c_0.e[0x5FAD ^ 0x5FC1] = 0xFFFFA06E ^ 0x5FC1;
        c_0.e[0x9BF9 ^ 0x9AEB] = 0xFFF9 ^ 0x9AEB;
        c_0.e[0x8B2D ^ 0x8B2F] = 0x8B62 ^ 0x8B2F;
        c_0.e[0xA2F2 ^ 0xA20B] = 0x3179 ^ 0xA20B;
        c_0.e[0xB00 ^ 0xBC8] = 0xFFFFF58A ^ 0xBC8;
        c_0.e[0x1A09 ^ 0x1B8A] = 0x1B88 ^ 0x1B8A;
        c_0.e[0xC554 ^ 0xC584] = 0x1CF4E ^ 0xC584;
        c_0.e[0x547A ^ 0x545A] = 0x5417 ^ 0x545A;
        c_0.e[0xB6B9 ^ 0xB6A9] = 0xB6A3 ^ 0xB6A9;
        c_0.e[0xAE7C ^ 0xAE0C] = 0xFFFF51B9 ^ 0xAE0C;
        c_0.e[0x8C3E ^ 0x8D01] = 0xC271 ^ 0x8D01;
        c_0.e[0x7D84 ^ 0x7D80] = 0x7D85 ^ 0x7D80;
        c_0.e[0xF619 ^ 0xF6D6] = 0x1FC3C ^ 0xF6D6;
        c_0.e[0x2B05 ^ 0x2A8F] = 0x7F6C ^ 0x2A8F;
        c_0.e[0xA073 ^ 0xA03A] = 0xFFFF5FFD ^ 0xA03A;
        c_0.e[0x237F ^ 0x2263] = 0x6B9 ^ 0x2263;
        c_0.e[0xE77F ^ 0xE79D] = 0xF1F3 ^ 0xE79D;
        c_0.e[0xA6F3 ^ 0xA7C6] = 0x7667 ^ 0xA7C6;
        c_0.e[0x61A4 ^ 0x61E3] = 0xFFFF9E7B ^ 0x61E3;
        c_0.e[0x6F03 ^ 0x6F08] = 0x6F76 ^ 0x6F08;
        c_0.e[0x827 ^ 0x94A] = 0x957 ^ 0x94A;
        c_0.e[0x4E7C ^ 0x4FFC] = 0x4FF3 ^ 0x4FFC;
        c_0.e[0x2163 ^ 0x21E9] = 0x21E8 ^ 0x21E9;
        c_0.e[0xEDD5 ^ 0xECA2] = 0xFFFF132B ^ 0xECA2;
        c_0.e[0xB4BE ^ 0xB46F] = 0x6777 ^ 0xB46F;
        c_0.e[0x1C7E ^ 0x1D67] = 0x39B2 ^ 0x1D67;
        c_0.e[0xEED6 ^ 0xEFCE] = 0xAC1F ^ 0xEFCE;
        c_0.e[0x3C21 ^ 0x3D3A] = 0x19B5 ^ 0x3D3A;
        c_0.e[0xBE0A ^ 0xBF6F] = 0xBF35 ^ 0xBF6F;
        c_0.e[0xAC7C ^ 0xAC9B] = 0xA386 ^ 0xAC9B;
        c_0.e[0x32B4 ^ 0x322E] = 0x144D ^ 0x322E;
        c_0.e[0xE625 ^ 0xE663] = 0xE629 ^ 0xE663;
        c_0.e[0xFC2D ^ 0xFCF8] = 0xC7F0 ^ 0xFCF8;
        c_0.e[0x7CA2 ^ 0x7C0F] = 0xDEE ^ 0x7C0F;
        c_0.e[0x980F ^ 0x997F] = 0x9978 ^ 0x997F;
        c_0.e[0xF1B1 ^ 0xF11E] = 0x6681 ^ 0xF11E;
        c_0.e[0x2E18 ^ 0x2E56] = 0xFFFFD192 ^ 0x2E56;
        c_0.e[0x4639 ^ 0x465C] = 0xFFFFB9CF ^ 0x465C;
        c_0.e[0x8447 ^ 0x8417] = 0x840D ^ 0x8417;
        c_0.e[0x8472 ^ 0x8444] = 0x844E ^ 0x8444;
        c_0.e[0x48F3 ^ 0x49BD] = 0x33AA ^ 0x49BD;
        c_0.e[0x3BC0 ^ 0x3ADA] = 0x1E00 ^ 0x3ADA;
        c_0.e[0xBE5 ^ 0xB36] = 0xFFFF27A1 ^ 0xB36;
        c_0.e[0x9FDE ^ 0x9FA2] = 0xFFFF604E ^ 0x9FA2;
        c_0.e[0x86E ^ 0x8CA] = 0xFFFF63E2 ^ 0x8CA;
        c_0.e[0x6728 ^ 0x67EC] = 0x3236 ^ 0x67EC;
        c_0.e[0xC166 ^ 0xC1C3] = 0x556F ^ 0xC1C3;
        c_0.e[0x3EF7 ^ 0x3ED8] = 0x8FC0 ^ 0x3ED8;
        c_0.e[0x43EB ^ 0x431B] = 0xFE6 ^ 0x431B;
        c_0.e[0x4F3C ^ 0x4F7E] = 0x4F4D ^ 0x4F7E;
        c_0.e[0xD34B ^ 0xD20B] = 0x9D43 ^ 0xD20B;
        c_0.e[0x7FE1 ^ 0x7E8E] = 0x7EED ^ 0x7E8E;
        c_0.e[0x4ABB ^ 0x4BB6] = 0x3D6A ^ 0x4BB6;
        c_0.e[0x5DDD ^ 0x5CE4] = 0x3A1 ^ 0x5CE4;
        c_0.e[0x636A ^ 0x6310] = 0x634F ^ 0x6310;
        c_0.e[0x9A77 ^ 0x9A46] = 0x834B ^ 0x9A46;
        c_0.e[0xA696 ^ 0xA6BD] = 0x444E ^ 0xA6BD;
        c_0.e[0x7229 ^ 0x7323] = 0xC8B7 ^ 0x7323;
        c_0.e[0xA36D ^ 0xA373] = 0xFFFF5C97 ^ 0xA373;
        c_0.e[0xD9AD ^ 0xD935] = 0x8B38 ^ 0xD935;
        c_0.e[0x110B ^ 0x1118] = 0xFFFFEEC2 ^ 0x1118;
        c_0.e[0xEB2E ^ 0xEB1C] = 0x8FF1 ^ 0xEB1C;
        c_0.e[0x900F ^ 0x90D9] = 0xABC2 ^ 0x90D9;
        c_0.e[0xAF9B ^ 0xAEA8] = 0x5D93 ^ 0xAEA8;
        c_0.e[0x8B96 ^ 0x8AA8] = 0xC5E0 ^ 0x8AA8;
        c_0.e[0xF86D ^ 0xF959] = 0xA3B ^ 0xF959;
        c_0.e[0x1197 ^ 0x113E] = 0xF0C ^ 0x113E;
        c_0.e[0x9633 ^ 0x963E] = 0x963D ^ 0x963E;
        c_0.e[0xE66C ^ 0xE670] = 0xE66C ^ 0xE670;
        c_0.e[0x5E2 ^ 0x5C8] = 0x458B ^ 0x5C8;
        c_0.e[0x58E ^ 0x5C6] = 0x596 ^ 0x5C6;
        c_0.e[0x9466 ^ 0x9469] = 0x946D ^ 0x9469;
        c_0.e[0x10069 ^ 0x1014E] = 0xC4E ^ 0x1014E;
        c_0.e[0x6760 ^ 0x661E] = 0x6614 ^ 0x661E;
        c_0.e[0xC302 ^ 0xC38D] = 0x9258 ^ 0xC38D;
        c_0.e[0xCC4F ^ 0xCD69] = 0x1C03B ^ 0xCD69;
        c_0.e[0x1840 ^ 0x1894] = 0xCB8A ^ 0x1894;
        c_0.e[0xBB57 ^ 0xBB85] = 0x689B ^ 0xBB85;
        c_0.e[0x1277 ^ 0x13F3] = 0x13F1 ^ 0x13F3;
        c_0.e[0x7777 ^ 0x7615] = 0x7614 ^ 0x7615;
        c_0.e[0x5F9 ^ 0x5E2] = 0x543 ^ 0x5E2;
        c_0.e[0x8069 ^ 0x8080] = 0x59AD ^ 0x8080;
        c_0.e[0xCF32 ^ 0xCE6F] = 0x1D46 ^ 0xCE6F;
        c_0.e[0x873 ^ 0x8E8] = 0x2E85 ^ 0x8E8;
        c_0.e[0xFE36 ^ 0xFEA0] = 0xAC81 ^ 0xFEA0;
        c_0.e[0xCA80 ^ 0xCBC5] = 0x63B8 ^ 0xCBC5;
        c_0.e[0xDD6F ^ 0xDDAD] = 0x8839 ^ 0xDDAD;
        c_0.e[0x6E81 ^ 0x6FCE] = 0x15BD ^ 0x6FCE;
        c_0.e[0x7967 ^ 0x7849] = 0x7AB3 ^ 0x7849;
        c_0.e[0xFB4D ^ 0xFB1E] = 0xFB14 ^ 0xFB1E;
        c_0.e[0x6646 ^ 0x6715] = 0x6715 ^ 0x6715;
        c_0.e[0xFB4D ^ 0xFA43] = 0x8C8F ^ 0xFA43;
        c_0.e[0xF52C ^ 0xF467] = 0xFFFFB25B ^ 0xF467;
        c_0.e[0x4785 ^ 0x47B0] = 0xFFFFB847 ^ 0x47B0;
        c_0.e[0x3EA0 ^ 0x3F81] = 0x6DF3 ^ 0x3F81;
        c_0.e[0x2289 ^ 0x22A1] = 0x2279 ^ 0x22A1;
        c_0.e[0x37A8 ^ 0x3793] = 0x3784 ^ 0x3793;
        c_0.e[0xCEAB ^ 0xCFB8] = 0xFFFF5577 ^ 0xCFB8;
        c_0.e[0x70AE ^ 0x7040] = 0x3CBD ^ 0x7040;
        c_0.e[0x7B06 ^ 0x7A6A] = 0x7A6A ^ 0x7A6A;
        c_0.e[0x1322 ^ 0x1361] = 0x131B ^ 0x1361;
        c_0.e[0x9664 ^ 0x9628] = 0xFFFF69CD ^ 0x9628;
        c_0.e[0xEA63 ^ 0xEAFD] = 0xD169 ^ 0xEAFD;
        c_0.e[0x584 ^ 0x4EC] = 0x4E5 ^ 0x4EC;
        c_0.e[0x79CF ^ 0x789F] = 0x288 ^ 0x789F;
        c_0.e[0x1080B ^ 0x1088B] = 0x108FF ^ 0x1088B;
        c_0.e[0x9CBD ^ 0x9DBF] = 0xF2D ^ 0x9DBF;
        c_0.e[0x10DBF ^ 0x10DB8] = 0x10DBB ^ 0x10DB8;
        c_0.e[0xA581 ^ 0xA4C6] = 0xCA6 ^ 0xA4C6;
        c_0.e[0x2B17 ^ 0x2B63] = 0xFFFFD41F ^ 0x2B63;
        c_0.e[0x5C97 ^ 0x5D1E] = 0x163E ^ 0x5D1E;
        c_0.e[0x393B ^ 0x381F] = 0x6A6F ^ 0x381F;
        c_0.e[0x85A7 ^ 0x859A] = 0x85B5 ^ 0x859A;
        c_0.e[0x77CC ^ 0x77E1] = 0xCC86 ^ 0x77E1;
        c_0.e[0xDF50 ^ 0xDFDC] = 0xA683 ^ 0xDFDC;
        c_0.e[0x5622 ^ 0x5659] = 0xFFFFA9D7 ^ 0x5659;
        c_0.e[0xBE55 ^ 0xBE4A] = 0xBE7D ^ 0xBE4A;
        c_0.e[0xF2EF ^ 0xF3FE] = 0x96FD ^ 0xF3FE;
        c_0.e[0x7A04 ^ 0x7B7B] = 0x7B49 ^ 0x7B7B;
        c_0.e[0xEC74 ^ 0xEC74] = 0xFFFF1321 ^ 0xEC74;
        c_0.e[0x5753 ^ 0x57E9] = 0xD62E ^ 0x57E9;
        c_0.e[0x7C65 ^ 0x7D4F] = 0xCDFE ^ 0x7D4F;
        c_0.e[0x9207 ^ 0x9256] = 0x9231 ^ 0x9256;
        c_0.e[0x9131 ^ 0x9199] = 0x8FB9 ^ 0x9199;
        c_0.e[0x237B ^ 0x23FE] = 0xFFFFDC6D ^ 0x23FE;
        c_0.e[0xBEF7 ^ 0xBEC0] = 0xBEDF ^ 0xBEC0;
        c_0.e[0x100EF ^ 0x101D4] = 0xFFFEA10D ^ 0x101D4;
        c_0.e[0x31B9 ^ 0x3161] = 0xA7A ^ 0x3161;
        c_0.e[0xFC66 ^ 0xFD54] = 0xE36 ^ 0xFD54;
        c_0.e[0x6271 ^ 0x6224] = 0xFFFF9DC2 ^ 0x6224;
        c_0.e[0x83A2 ^ 0x82BC] = 0xAE63 ^ 0x82BC;
        c_0.e[0x645E ^ 0x6575] = 0xFFFF2A32 ^ 0x6575;
        c_0.e[0x5645 ^ 0x572F] = 0x572D ^ 0x572F;
        c_0.e[0x10E4D ^ 0x10E27] = 0x10E69 ^ 0x10E27;
        c_0.e[0x8AAF ^ 0x8A5A] = 0xAED3 ^ 0x8A5A;
        c_0.e[0x3D1D ^ 0x3D0A] = 0x3D35 ^ 0x3D0A;
        c_0.e[0x1725 ^ 0x17A2] = 0x17A0 ^ 0x17A2;
        c_0.e[0xA217 ^ 0xA32D] = 0xFC77 ^ 0xA32D;
        c_0.e[0x997C ^ 0x991A] = 0x9909 ^ 0x991A;
        c_0.e[0x58B2 ^ 0x59AF] = 0x757A ^ 0x59AF;
        c_0.e[0xCFA8 ^ 0xCFCA] = 0xCFA0 ^ 0xCFCA;
        c_0.e[0x2CC8 ^ 0x2C71] = 0x128B3 ^ 0x2C71;
        c_0.e[0xC852 ^ 0xC8C7] = 0x2088 ^ 0xC8C7;
        c_0.e[0x8295 ^ 0x8290] = 0xFFFF7D51 ^ 0x8290;
        c_0.e[0xD69 ^ 0xD8A] = 0x1BAF ^ 0xD8A;
        c_0.e[0x9E67 ^ 0x9ECC] = 0xEF2D ^ 0x9ECC;
        c_0.e[0x732E ^ 0x735F] = 0x735E ^ 0x735F;
        c_0.e[0x9F8D ^ 0x9F1E] = 0x7751 ^ 0x9F1E;
        c_0.e[0x707 ^ 0x652] = 0x652 ^ 0x652;
        c_0.e[0xDC7D ^ 0xDCEF] = 0x34AC ^ 0xDCEF;
        c_0.e[0x7F13 ^ 0x7FF5] = 0x7097 ^ 0x7FF5;
        c_0.e[0x5BE8 ^ 0x5A66] = 0x50CC ^ 0x5A66;
        c_0.e[0xF71D ^ 0xF709] = 0xF771 ^ 0xF709;
        c_0.e[0x4FC9 ^ 0x4F58] = 0x1E8D ^ 0x4F58;
        c_0.e[0xC57C ^ 0xC5DE] = 0x5173 ^ 0xC5DE;
        c_0.e[0xC2AB ^ 0xC3D7] = 0xC3D1 ^ 0xC3D7;
        c_0.e[0x7F03 ^ 0x7FC2] = 0x4EFB ^ 0x7FC2;
        c_0.e[0xF95D ^ 0xF815] = 0x5074 ^ 0xF815;
        c_0.e[0x4F14 ^ 0x4E66] = 0x4E6D ^ 0x4E66;
        c_0.e[0x8258 ^ 0x82A9] = 0xB43E ^ 0x82A9;
        c_0.e[0x2D70 ^ 0x2D61] = 0xFFFFD293 ^ 0x2D61;
        c_0.e[0xF85D ^ 0xF978] = 0x1F422 ^ 0xF978;
        c_0.e[0xB6D5 ^ 0xB6DC] = 0xFFFF497F ^ 0xB6DC;
        c_0.e[0x10A26 ^ 0x10A03] = 0x10A01 ^ 0x10A03;
        c_0.e[0x2807 ^ 0x2906] = 0xBB8A ^ 0x2906;
        c_0.e[0x1493 ^ 0x1598] = 0xAE05 ^ 0x1598;
        c_0.e[0x6B48 ^ 0x6A68] = 0x46B7 ^ 0x6A68;
        c_0.e[0x108A7 ^ 0x109A3] = 0x19B31 ^ 0x109A3;
        c_0.e[0x6A62 ^ 0x6AD4] = 0x16E1D ^ 0x6AD4;
        c_0.e[0x8811 ^ 0x8868] = 0x8855 ^ 0x8868;
        c_0.e[0xD65D ^ 0xD76C] = 0x2413 ^ 0xD76C;
        c_0.e[0x1449 ^ 0x15CF] = 0x15CD ^ 0x15CF;
        c_0.e[0x8F10 ^ 0x8FE2] = 0xB978 ^ 0x8FE2;
        c_0.e[0x10296 ^ 0x103AE] = 0x1D218 ^ 0x103AE;
        c_0.e[0x2B4 ^ 0x280] = 0x280 ^ 0x280;
        c_0.e[0xADA8 ^ 0xAD5F] = 0xFFFF7653 ^ 0xAD5F;
        c_0.e[0x5B6D ^ 0x5BEF] = 0x5B96 ^ 0x5BEF;
        c_0.e[0xCBD1 ^ 0xCBE8] = 0xCBC1 ^ 0xCBE8;
        c_0.e[0x436A ^ 0x43CA] = 0xFFFF87CD ^ 0x43CA;
        c_0.e[0x437C ^ 0x431C] = 0x431C ^ 0x431C;
        c_0.e[0x6244 ^ 0x6373] = 0xB2EC ^ 0x6373;
        c_0.e[0x1246 ^ 0x128A] = 0xFFFF06B0 ^ 0x128A;
        c_0.e[0x9A86 ^ 0x9A48] = 0x9A48 ^ 0x9A48;
        c_0.e[0x86EC ^ 0x8785] = 0x8781 ^ 0x8785;
        c_0.e[0x1360 ^ 0x1201] = 0x17BF ^ 0x1201;
        c_0.e[0xDFAB ^ 0xDF87] = 0x27F4 ^ 0xDF87;
        c_0.e[0xE27 ^ 0xEA6] = 0xEA3 ^ 0xEA6;
        c_0.e[0x10B01 ^ 0x10B5D] = 0x10B6F ^ 0x10B5D;
        c_0.e[0x6389 ^ 0x63AF] = 0x63AF ^ 0x63AF;
        c_0.e[0x3D74 ^ 0x3D61] = 0x3D6A ^ 0x3D61;
        c_0.e[0xD163 ^ 0xD123] = 0xD13C ^ 0xD123;
        c_0.e[0xA2DA ^ 0xA2C3] = 0xFFFF5D6E ^ 0xA2C3;
        c_0.e[0x32D4 ^ 0x322A] = 0xEFBB ^ 0x322A;
        c_0.e[0x1248 ^ 0x1255] = 0x1228 ^ 0x1255;
        c_0.e[0x8B7D ^ 0x8A5F] = 0xD82F ^ 0x8A5F;
        c_0.e[0x3967 ^ 0x3986] = 0x2FE4 ^ 0x3986;
        c_0.e[0x9AF ^ 0x8BF] = 0x7E73 ^ 0x8BF;
        c_0.e[0x56A5 ^ 0x56DD] = 0x56FE ^ 0x56DD;
        c_0.e[0x67D9 ^ 0x6725] = 0xF454 ^ 0x6725;
        c_0.e[0x1F62 ^ 0x1F8D] = 0x5325 ^ 0x1F8D;
        c_0.e[0x8D34 ^ 0x8D85] = 0x1A1A ^ 0x8D85;
        c_0.e[0x38BF ^ 0x39EE] = 0x39EE ^ 0x39EE;
        c_0.e[0x12BD ^ 0x120D] = 0x859C ^ 0x120D;
        c_0.e[0x8C04 ^ 0x8C1E] = 0x8C57 ^ 0x8C1E;
        c_0.e[0x9D60 ^ 0x9D2A] = 0xFFFF62D7 ^ 0x9D2A;
        c_0.e[0x488E ^ 0x48A0] = 0xC388 ^ 0x48A0;
        c_0.e[0x35AD ^ 0x34F1] = 0x7948 ^ 0x34F1;
        c_0.e[0x1063B ^ 0x1068C] = 0x24E ^ 0x1068C;
        c_0.e[0x84EC ^ 0x840C] = 0xAAD4 ^ 0x840C;
        c_0.e[0x10560 ^ 0x1042D] = 0x17E20 ^ 0x1042D;
        c_0.e[0x71C7 ^ 0x7095] = 0x7095 ^ 0x7095;
        c_0.e[0x10DD6 ^ 0x10D1C] = 0x1E693 ^ 0x10D1C;
        c_0.e[0xA8E5 ^ 0xA87C] = 0xFA54 ^ 0xA87C;
        c_0.e[0x98A5 ^ 0x987C] = 0x3734 ^ 0x987C;
        c_0.e[0xBDE0 ^ 0xBD88] = 0xFFFF4279 ^ 0xBD88;
        c_0.e[0x95EC ^ 0x94C1] = 0x962D ^ 0x94C1;
        c_0.e[0xC550 ^ 0xC511] = 0xC59C ^ 0xC511;
        c_0.e[0x3AF2 ^ 0x3A08] = 0xA979 ^ 0x3A08;
        c_0.e[0xA1AE ^ 0xA12A] = 0xA102 ^ 0xA12A;
        c_0.e[0x451E ^ 0x45F3] = 0x91B ^ 0x45F3;
        c_0.e[0x4636 ^ 0x4730] = 0x6955 ^ 0x4730;
        c_0.e[0xA193 ^ 0xA0B0] = 0xFFFF0D1B ^ 0xA0B0;
        c_0.e[0x66AA ^ 0x6690] = 0xFFFF9935 ^ 0x6690;
        c_0.e[0xBC8A ^ 0xBDDC] = 0xBDCE ^ 0xBDDC;
        c_0.e[0xD7A0 ^ 0xD6F8] = 0xA94B ^ 0xD6F8;
        c_0.e[0x2EB8 ^ 0x2E4B] = 0xFFFFE76F ^ 0x2E4B;
        c_0.e[0xA798 ^ 0xA7D7] = 0xFFFF5843 ^ 0xA7D7;
        c_0.e[0x2894 ^ 0x29D6] = 0x59CC ^ 0x29D6;
        c_0.e[0xD3F5 ^ 0xD272] = 0xD272 ^ 0xD272;
        c_0.e[0x98DE ^ 0x984A] = 0xFFFF8F89 ^ 0x984A;
        c_0.e[0x8ABD ^ 0x8BB8] = 0xA5DA ^ 0x8BB8;
        c_0.e[0xBC99 ^ 0xBCF6] = 0xBCA7 ^ 0xBCF6;
        c_0.e[0x497 ^ 0x5BE] = 0xB50B ^ 0x5BE;
        c_0.e[0xE161 ^ 0xE04D] = 0x50FC ^ 0xE04D;
        c_0.e[0xD96A ^ 0xD9AA] = 0xE8D0 ^ 0xD9AA;
        c_0.e[0x77C7 ^ 0x76D0] = 0x351C ^ 0x76D0;
        c_0.e[0xEBC3 ^ 0xEB70] = 0x9C6 ^ 0xEB70;
        c_0.e[0x2D1A ^ 0x2D86] = 0xFFFFF448 ^ 0x2D86;
        c_0.e[0x7499 ^ 0x75A4] = 0x3AE7 ^ 0x75A4;
        c_0.e[0x27F3 ^ 0x277A] = 0x277B ^ 0x277A;
        c_0.e[0x85EB ^ 0x846E] = 0x856E ^ 0x846E;
        c_0.e[0x153E ^ 0x153D] = 0xFFFFEAFA ^ 0x153D;
        c_0.e[0xD36F ^ 0xD338] = 0xD36A ^ 0xD338;
        c_0.e[0xC2FE ^ 0xC246] = 0xFFFE393A ^ 0xC246;
        c_0.e[0xDEEC ^ 0xDF64] = 0xDF67 ^ 0xDF64;
        c_0.e[0xFD9E ^ 0xFD30] = 0x6AAB ^ 0xFD30;
        c_0.e[0xD9A1 ^ 0xD96C] = 0x32E1 ^ 0xD96C;
        c_0.e[0x1F21 ^ 0x1F7E] = 0x1F38 ^ 0x1F7E;
        c_0.e[0x5EFF ^ 0x5E8D] = 0xFFFFA17F ^ 0x5E8D;
        c_0.e[0x792A ^ 0x78A6] = 0xF542 ^ 0x78A6;
        c_0.e[0xF85 ^ 0xE08] = 0xC6E1 ^ 0xE08;
        c_0.e[0x92BF ^ 0x93A9] = 0xD078 ^ 0x93A9;
        c_0.e[0xBCDE ^ 0xBDD1] = 0xCB01 ^ 0xBDD1;
        c_0.e[0xB81B ^ 0xB88C] = 0xEAA4 ^ 0xB88C;
        c_0.e[0x6F71 ^ 0x6E0C] = 0x6E19 ^ 0x6E0C;
        c_0.e[0xC20C ^ 0xC376] = 0xC377 ^ 0xC376;
        c_0.e[0xA6B8 ^ 0xA790] = 0x1AAC2 ^ 0xA790;
        c_0.e[0x2FDD ^ 0x2FEE] = 0x6671 ^ 0x2FEE;
        c_0.e[0xB96C ^ 0xB80F] = 0xB81F ^ 0xB80F;
        c_0.e[0xD59C ^ 0xD50C] = 0xFFFF7B65 ^ 0xD50C;
        c_0.e[0x9271 ^ 0x9253] = 0x9253 ^ 0x9253;
        c_0.e[0x38A9 ^ 0x39F0] = 0x9C73 ^ 0x39F0;
        c_0.e[0xCD9A ^ 0xCDEC] = 0xFFFF320E ^ 0xCDEC;
        c_0.e[0x259D ^ 0x25F0] = 0x25AF ^ 0x25F0;
        c_0.e[0xE00C ^ 0xE01E] = 0xFFFF1FBF ^ 0xE01E;
        c_0.e[0xF1F ^ 0xFBE] = 0x342C ^ 0xFBE;
        c_0.e[0xFFEF ^ 0xFEEF] = 0x237E ^ 0xFEEF;
        c_0.e[0x7902 ^ 0x780B] = 0xC387 ^ 0x780B;
        c_0.e[0x67CB ^ 0x67AA] = 0x67CC ^ 0x67AA;
        c_0.e[0xA952 ^ 0xA91F] = 0xFFFF5657 ^ 0xA91F;
        c_0.e[0x3B5D ^ 0x3B06] = 0xFFFFC4E3 ^ 0x3B06;
        c_0.e[0x3899 ^ 0x3806] = 0x394 ^ 0x3806;
        c_0.e[0xF2F0 ^ 0xF2E6] = 0xFFFF0D51 ^ 0xF2E6;
        c_0.e[0xDBB1 ^ 0xDAEF] = 0xB4C6 ^ 0xDAEF;
        c_0.e[0xAADA ^ 0xAA82] = 0xAA98 ^ 0xAA82;
        c_0.e[0x10604 ^ 0x106DB] = 0xFFFED7E1 ^ 0x106DB;
        c_0.e[0x2828 ^ 0x2950] = 0x2958 ^ 0x2950;
        c_0.e[0x10D5B ^ 0x10C6D] = 0x1DDDB ^ 0x10C6D;
        c_0.e[0xAFCF ^ 0xAF13] = 0x5B ^ 0xAF13;
        c_0.e[0x57B9 ^ 0x5731] = 0x5731 ^ 0x5731;
        c_0.e[0x9A32 ^ 0x9A6C] = 0xFFFF65F2 ^ 0x9A6C;
        c_0.e[0x86D6 ^ 0x8662] = 0x649E ^ 0x8662;
        c_0.e[0x34A ^ 0x20E] = 0x7214 ^ 0x20E;
        c_0.e[0x6F8A ^ 0x6F54] = 0x418C ^ 0x6F54;
        c_0.e[0x8BF5 ^ 0x8B88] = 0x8B1D ^ 0x8B88;
        c_0.e[0x9040 ^ 0x90FC] = 0x1117 ^ 0x90FC;
        c_0.e[0x5309 ^ 0x5331] = 0xFFFFACDF ^ 0x5331;
        c_0.e[0x9F4D ^ 0x9FE1] = 0xFFFF11EF ^ 0x9FE1;
        c_0.e[0x10652 ^ 0x106ED] = 0x137D4 ^ 0x106ED;
        c_0.e[0xEB28 ^ 0xEA7C] = 0xEA7D ^ 0xEA7C;
        c_0.e[0x84A0 ^ 0x85D1] = 0xFFFF7A27 ^ 0x85D1;
        c_0.e[0x6E6F ^ 0x6E11] = 0x6E21 ^ 0x6E11;
        c_0.e[0x4C23 ^ 0x4CC7] = 0x5AA9 ^ 0x4CC7;
        c_0.e[0xA6F0 ^ 0xA637] = 0xA7C3 ^ 0xA637;
        c_0.e[0x42 ^ 0x89] = 0xEB04 ^ 0x89;
        c_0.e[0x62BE ^ 0x63E9] = 0x3848 ^ 0x63E9;
        c_0.e[0x39EB ^ 0x3965] = 0x68B0 ^ 0x3965;
        c_0.e[0x2101 ^ 0x219C] = 0x7F1 ^ 0x219C;
        c_0.e[0x8A96 ^ 0x8A69] = 0x57DB ^ 0x8A69;
        c_0.e[0xE1E0 ^ 0xE10A] = 0x3822 ^ 0xE10A;
        c_0.e[0xB14D ^ 0xB00E] = 0xFFFF3FF0 ^ 0xB00E;
        c_0.e[0x69C1 ^ 0x692A] = 0xFFFF4F86 ^ 0x692A;
        c_0.e[0x920 ^ 0x92A] = 0xFFFFF6C9 ^ 0x92A;
        c_0.e[0xCA15 ^ 0xCA7E] = 0xCA6C ^ 0xCA7E;
        c_0.e[0xE05C ^ 0xE08B] = 0xFFFF2452 ^ 0xE08B;
        c_0.e[0x7764 ^ 0x7745] = 0x7746 ^ 0x7745;
        c_0.e[0x8523 ^ 0x85A8] = 0x85A8 ^ 0x85A8;
        c_0.e[0xE889 ^ 0xE881] = 0xE8FB ^ 0xE881;
        c_0.e[0xF992 ^ 0xF8CD] = 0x4211 ^ 0xF8CD;
        c_0.e[0x10341 ^ 0x10388] = 0x1027C ^ 0x10388;
        c_0.e[0x10229 ^ 0x1024A] = 0xFFFEFDD0 ^ 0x1024A;
        c_0.e[0x8FA5 ^ 0x8F02] = 0x9130 ^ 0x8F02;
        c_0.e[0x84EC ^ 0x84B6] = 0xFFFF7B1B ^ 0x84B6;
        c_0.e[0x9BF1 ^ 0x9AAB] = 0xC1AF ^ 0x9AAB;
        c_0.e[0x22F1 ^ 0x222A] = 0xFFFF72D9 ^ 0x222A;
        c_0.e[0x7C7C ^ 0x7D17] = 0x7D71 ^ 0x7D17;
        c_0.e[0xD877 ^ 0xD823] = 0xFFFF27DF ^ 0xD823;
        c_0.e[0xA14A ^ 0xA0CB] = 0xA092 ^ 0xA0CB;
        c_0.e[0x5555 ^ 0x5413] = 0xFC72 ^ 0x5413;
        c_0.e[0x109C0 ^ 0x109CC] = 0x109B6 ^ 0x109CC;
        c_0.e[0x85CD ^ 0x85A4] = 0x85D9 ^ 0x85A4;
        c_0.e[0x1163 ^ 0x11DD] = 0x20EB ^ 0x11DD;
        c_0.e[0xE512 ^ 0xE565] = 0xFFFF1A89 ^ 0xE565;
        c_0.e[0x35EF ^ 0x35C8] = 0x35C8 ^ 0x35C8;
        c_0.e[0xDFA2 ^ 0xDF5F] = 0x2D5 ^ 0xDF5F;
        c_0.e[0xA863 ^ 0xA81C] = 0xFFFF5787 ^ 0xA81C;
        c_0.e[0x7E9D ^ 0x7E10] = 0x75F ^ 0x7E10;
        c_0.e[0xC505 ^ 0xC411] = 0xA103 ^ 0xC411;
        c_0.e[0x212B ^ 0x204C] = 0x202D ^ 0x204C;
        c_0.e[0x1681 ^ 0x16D7] = 0x1683 ^ 0x16D7;
        c_0.e[0x8B32 ^ 0x8B0C] = 0x8B39 ^ 0x8B0C;
        c_0.e[0xB1ED ^ 0xB0F8] = 0xF320 ^ 0xB0F8;
        c_0.e[0x27F4 ^ 0x275E] = 0x56B7 ^ 0x275E;
        c_0.e[0x9508 ^ 0x9400] = 0xBA65 ^ 0x9400;
        c_0.e[0x404D ^ 0x4069] = 0x4069 ^ 0x4069;
        c_0.e[0xAF8C ^ 0xAEE8] = 0xAEEC ^ 0xAEE8;
        c_0.e[0xCFBF ^ 0xCFE2] = 0xCFB2 ^ 0xCFE2;
        c_0.e[0x308E ^ 0x3075] = 0xFFFF5CCF ^ 0x3075;
        c_0.e[0x7F56 ^ 0x7E1F] = 0xC7A7 ^ 0x7E1F;
        c_0.e[0xA6C1 ^ 0xA602] = 0xF39C ^ 0xA602;
        c_0.e[0x40F ^ 0x4F7] = 0x2067 ^ 0x4F7;
        c_0.e[0x39E0 ^ 0x3966] = 0x3967 ^ 0x3966;
        c_0.e[0x4396 ^ 0x42E5] = 0x42D3 ^ 0x42E5;
        c_0.e[0xDCB6 ^ 0xDC70] = 0xDD87 ^ 0xDC70;
        c_0.e[0x2E7E ^ 0x2EA3] = 0x6F ^ 0x2EA3;
        c_0.e[0xCC77 ^ 0xCCCA] = 0x4D0A ^ 0xCCCA;
        c_0.e[0x3D7 ^ 0x365] = 0xE1DE ^ 0x365;
        c_0.e[0x3F36 ^ 0x3F30] = 0x3F4E ^ 0x3F30;
        c_0.e[0xD755 ^ 0xD7F6] = 0x435A ^ 0xD7F6;
        c_0.e[0x1086 ^ 0x10E1] = 0xFFFFEF67 ^ 0x10E1;
        c_0.e[0xC543 ^ 0xC52D] = 0xFFFF3ACB ^ 0xC52D;
        c_0.e[0xBB75 ^ 0xBB99] = 0x62B1 ^ 0xBB99;
        c_0.e[0xCDEE ^ 0xCD1A] = 0xFB80 ^ 0xCD1A;
        c_0.e[0x4002 ^ 0x4047] = 0xFFFFBF88 ^ 0x4047;
        c_0.e[0x769C ^ 0x7713] = 0x2F82 ^ 0x7713;
        c_0.e[0x3CB5 ^ 0x3DC3] = 0x3DC6 ^ 0x3DC3;
        c_0.e[0x9BC4 ^ 0x9BF4] = 0xA70F ^ 0x9BF4;
        c_0.e[0xE4F ^ 0xE8A] = 0x5B14 ^ 0xE8A;
        c_0.e[0x27D3 ^ 0x27DD] = 0x27A5 ^ 0x27DD;
        c_0.e[0xC495 ^ 0xC4A9] = 0xFFFF3B61 ^ 0xC4A9;
        c_0.e[0xB3AD ^ 0xB3E6] = 0xB3DE ^ 0xB3E6;
        c_0.e[0x732A ^ 0x725E] = 0x7250 ^ 0x725E;
        c_0.e[0xC8E4 ^ 0xC80C] = 0xC76E ^ 0xC80C;
        c_0.e[0xE554 ^ 0xE54C] = 0xFFFF1ABA ^ 0xE54C;
        c_0.e[0xA415 ^ 0xA554] = 0xD55C ^ 0xA554;
        c_0.e[0x8588 ^ 0x848F] = 0xAAFA ^ 0x848F;
        c_0.e[0x685C ^ 0x693A] = 0x6939 ^ 0x693A;
        c_0.e[0xDBFC ^ 0xDB98] = 0xFFFF247C ^ 0xDB98;
        c_0.e[0xF76A ^ 0xF76B] = 0xFFFF08F6 ^ 0xF76B;
        c_0.e[0x10D98 ^ 0x10D6E] = 0x129FE ^ 0x10D6E;
        c_0.e[0x5777 ^ 0x5647] = 0x54BD ^ 0x5647;
        c_0.e[0x6A30 ^ 0x6B5E] = 0x6B53 ^ 0x6B5E;
        c_0.e[0x3812 ^ 0x382D] = 0x387E ^ 0x382D;
        c_0.e[0x7DA8 ^ 0x7D8B] = 0x7D8A ^ 0x7D8B;
        c_0.e[0xFC48 ^ 0xFC1A] = 0xFC47 ^ 0xFC1A;
        c_0.e[0xA276 ^ 0xA293] = 0xADFF ^ 0xA293;
        c_0.e[0x90B3 ^ 0x91FF] = 0x2846 ^ 0x91FF;
        c_0.e[0xB12F ^ 0xB000] = 0xFFFF4D29 ^ 0xB000;
        c_0.e[0xFD28 ^ 0xFC73] = 0xFEE5 ^ 0xFC73;
        c_0.e[0x266E ^ 0x271B] = 0xFFFFD891 ^ 0x271B;
        c_0.e[0xB07C ^ 0xB17F] = 0x239B ^ 0xB17F;
        c_0.e[0xE4B ^ 0xF32] = 0xFFFFF0B5 ^ 0xF32;
        c_0.e[0x6DF9 ^ 0x6C82] = 0x6C97 ^ 0x6C82;
        c_0.e[0x55F1 ^ 0x54FD] = 0xEF69 ^ 0x54FD;
        c_0.e[0x991A ^ 0x99BC] = 0x878B ^ 0x99BC;
    }
}

