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
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.module.modules.render.r
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotakbaz/rain/module/modules/render/ModuleTimeChanger;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "original", "modifyTime", "(J)J", "Lkotakbaz/rain/module/setting/ModeSetting;", "timeMode", "Lkotakbaz/rain/module/setting/ModeSetting;", "rain-visuals"})
public final class r_0
extends a_0 {
    @NotNull
    public static final r_0 INSTANCE;
    @NotNull
    private static final c a;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    private r_0() {
        int n = d[0];
        n += d[1];
        int n2 = d[3];
        n2 += d[4];
        int n3 = d[6];
        n3 ^= d[7];
        super((String)A[n -= d[2]], kotakbaz.rain.client.extensions.a_0.getRENDER(), (String)A[n2 ^= d[5]] + (String)A[n3 ^= d[8]]);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final long modifyTime(long l) {
        if (!this.isEnabled()) {
            return l;
        }
        String string = (String)a.getValue();
        switch (string.hashCode()) {
            case -302552477: {
                int n = d[9];
                n += d[10];
                if (string.equals((String)A[n += d[11]])) return 12610L;
                break;
            }
            case 2073297932: {
                int n = d[12];
                n -= d[13];
                if (string.equals((String)A[n -= d[14]])) return 6000L;
                break;
            }
            case 32448614: {
                int n = d[15];
                n += d[16];
                if (string.equals((String)A[n ^= d[17]])) return 13000L;
                break;
            }
            case 32171536: {
                int n = d[18];
                n -= d[19];
                if (string.equals((String)A[n += d[20]])) return 1000L;
                break;
            }
            case 2073575010: {
                int n = d[21];
                n += d[22];
                if (string.equals((String)A[n -= d[23]])) return 18000L;
                break;
            }
            case -1729048529: {
                int n = d[24];
                n -= d[25];
                if (!string.equals((String)A[n += d[26]])) break;
                return 23041L;
            }
        }
        long l2 = l;
        return l2;
    }

    static {
        r_0.b();
        long l = -5818808705382204815L;
        long l2 = 5558072834382965710L;
        long l3 = -4622432139587043533L;
        long l4 = -8985079224808533394L;
        long l5 = 7664714633916818047L;
        long l6 = -8563812638628620650L;
        long l7 = -595952385537793119L;
        long l8 = -1689078607034453923L;
        long l9 = 1087526956040648002L;
        long l10 = -6955641475401860919L;
        long l11 = 9197877350777704409L;
        long l12 = 757099264710935392L;
        long l13 = 3695744310554802017L;
        long l14 = -7726617912569578241L;
        int n = d[27];
        n ^= d[28];
        A = new Object[n += d[29]];
        long l15 = l14;
        int n2 = d[30];
        n2 ^= d[31];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += d[32]);
        Object[] objectArray = new Object[d[33]];
        objectArray[r_0.d[34]] = b;
        objectArray[r_0.d[35]] = d[36];
        int n3 = d[37];
        Object object = r_0.A()[d[38]];
        if (object == null) {
            char[] cArray = "\u2684\u2664\u266d\u2675\u2631\u262a\u265b\u2665\u266a\u2692\u265b\u266d\u2691\u2686\u2692\u26be\u2630\u266d\u2667\u268d\u262a\u261b\u266c\u2689\u2633\u2671\u2683\u2693\u2679\u2630\u2677\u266f\u2654\u265a\u2633\u2669\u268c\u2684\u2689\u2657\u2683\u2686\u2685\u265e\u2670\u2624\u262a\u2690\u265a\u2692\u26be\u2691\u2679\u2669\u2686\u2691\u2692\u2689\u2678\u2630\u2690\u2690\u2664\u261b\u2659\u2675\u2655\u267a\u2686\u2685\u268e\u266f\u2670\u261b\u2664\u2673\u267a\u266a\u2678\u2687\u2664\u2627\u2659\u262a\u268d\u2665\u2691\u266d\u2666\u266e\u2670\u2692\u2655\u2666\u2677\u265a\u2669\u2681\u2680\u2626\u2661\u2685\u2672\u2680\u2679\u2679\u268a\u2657\u265b\u2674\u2679\u266e\u2687\u2625\u268d\u266c\u2666\u266a\u2679\u2658\u2659\u2681\u265a\u2664\u267e\u268a\u2688\u262a\u267a\u2692\u265e\u2683\u2659\u2670\u266f\u2629\u268d\u2669\u2681\u2690\u2667\u2666\u268e\u2659\u268c\u265e\u26be\u2630\u2625\u2680\u2658\u266d\u2667\u2669\u2666\u2655\u2631\u2658\u262a\u261b\u2673\u2661\u2669\u2663\u266d\u2667\u268d\u267a\u265a\u2672\u268f\u265b\u2680\u2691\u2685\u265a\u267e\u2680\u2686\u265b\u2671\u2692\u2655\u2629\u2672\u2664\u2658\u265a\u2671\u268e\u2657\u2692\u268d\u2687\u2625\u2681\u267e\u2625\u267a\u2633\u2624\u2666\u268e\u2631\u2668\u2678\u2688\u268e\u2657\u2680\u2660\u2625\u265e\u2684\u267a\u2625\u266a\u268e\u2690\u268a\u2677\u266c\u2664\u266f\u2665\u265a\u268f\u267b\u2693\u2686\u268d\u2629\u2626\u2668\u261b\u2659\u2672\u2667\u261b\u2690\u2685\u2626\u2663\u2655\u2677\u2689\u2686\u266e\u2684\u2626\u2674\u266c\u2658\u2688\u2685\u266f\u2679\u2681\u2678\u2661\u2670\u267a\u268c\u266d\u26be\u267b\u2691\u2631\u2672\u2692\u2667\u2673\u2671\u2655\u267a\u268e\u2690\u2674\u2668\u2665\u2675\u2687\u2672\u265e\u2664\u2669\u261b\u2629\u262a\u262f\u262a\u267a\u265b\u2626\u2626\u2692\u2677\u266f\u2633\u267a\u2629\u2693\u2630\u2685\u2629\u2678\u2633\u268a\u2688\u266a\u2654\u2666\u262a\u2673\u262f\u265b\u267a\u2684\u266e\u2668\u266c\u2679\u2670\u266d\u266f\u268c\u2690\u2678\u2674\u2657\u2668\u2689\u268d\u2671\u266d\u261b\u2625\u268d\u265a\u2681\u2672\u267b\u2663\u265e\u2626\u2626\u267b\u2669\u2670\u2661\u26be\u26be\u262a\u2665\u2660\u2692\u2675\u267a\u2633\u2685\u262a\u262f\u2673\u26be\u266c\u2678\u2685\u268e\u2693\u2685\u2671\u2689\u265a\u2627\u2655\u2633\u265a\u2631\u2686\u2677\u268d\u262f\u2689\u268d".toCharArray();
            for (int i2 = d[39]; i2 < d[40]; ++i2) {
                int n4 = cArray[i2];
                n4 += d[41];
                n4 -= d[42];
                n4 -= d[43];
                n4 -= d[44];
                n4 += d[45];
                n4 ^= d[46];
                n4 ^= d[47];
                n4 ^= d[48];
                n4 += d[49];
                n4 ^= d[50];
                cArray[i2] = (char)(n4 ^= d[51]);
            }
            object = r_0.A()[r_0.d[52]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)r_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = d[53];
        n5 ^= d[54];
        l5 = l16 ^ (0x9800000000L ^ l16) & -1L << (n5 ^= d[55]);
        long l17 = l12;
        int n6 = d[56];
        n6 ^= d[57];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= d[58]);
        while (true) {
            int n7 = d[59];
            n7 ^= d[60];
            if ((int)l12 >= (int)(l5 >>> (n7 += d[61]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = d[62];
            n9 ^= d[63];
            int n10 = d[65];
            n10 ^= d[66];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= d[64])) & -1L >>> (n10 -= d[67]);
            long l19 = l8;
            int n11 = d[68];
            n11 ^= d[69];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= d[70]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = d[71];
            n13 += d[72];
            int n14 = d[74];
            n14 += d[75];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= d[73])) & -1L >>> (n14 ^= d[76]);
            int n15 = d[77];
            n15 -= d[78];
            long l21 = l9;
            int n16 = d[80];
            n16 += d[81];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= d[79]) ^ l21) & -1L << (n16 += d[82]);
            int n17 = d[83];
            n17 ^= d[84];
            n17 -= d[85];
            int n18 = d[86];
            n18 -= d[87];
            long l22 = l11;
            int n19 = d[89];
            n19 += d[90];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= d[88]))) ^ l22) & -1L >>> (n19 ^= d[91]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = d[92];
            n20 -= d[93];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += d[94]);
            while (true) {
                int n21 = d[95];
                if ((int)(l13 >>> (n21 += d[96])) >= (int)l11) break;
                int n22 = d[97];
                n22 -= d[98];
                int n23 = d[100];
                n23 += d[101];
                cArray2[(int)(l13 >>> (n22 += r_0.d[99]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += d[102]))];
                l13 += 0x100000000L;
            }
            int n24 = d[103];
            n24 ^= d[104];
            int n25 = (int)(l14 >>> (n24 ^= d[105]));
            l14 += 0x100000000L;
            r_0.A[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = d[106];
            n26 ^= d[107];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += d[108]);
        }
        INSTANCE = new r_0();
        int n27 = d[109];
        n27 ^= d[110];
        n27 ^= d[111];
        int n28 = d[112];
        n28 += d[113];
        String[] stringArray = new String[n28 += d[114]];
        int n29 = d[115];
        n29 -= d[116];
        int n30 = d[118];
        n30 += d[119];
        stringArray[n29 ^= r_0.d[117]] = (String)A[n30 += d[120]];
        int n31 = d[121];
        n31 ^= d[122];
        int n32 = d[124];
        n32 += d[125];
        stringArray[n31 -= r_0.d[123]] = (String)A[n32 += d[126]];
        int n33 = d[127];
        n33 -= d[128];
        int n34 = d[130];
        n34 -= d[131];
        stringArray[n33 += r_0.d[129]] = (String)A[n34 -= d[132]];
        int n35 = d[133];
        n35 += d[134];
        int n36 = d[136];
        n36 -= d[137];
        stringArray[n35 -= r_0.d[135]] = (String)A[n36 += d[138]];
        int n37 = d[139];
        n37 -= d[140];
        int n38 = d[142];
        n38 -= d[143];
        stringArray[n37 -= r_0.d[141]] = (String)A[n38 ^= d[144]];
        int n39 = d[145];
        n39 -= d[146];
        int n40 = d[148];
        n40 += d[149];
        stringArray[n39 ^= r_0.d[147]] = (String)A[n40 -= d[150]];
        int n41 = d[151];
        n41 ^= d[152];
        a = INSTANCE.mode((String)A[n27], CollectionsKt.listOf(stringArray), n41 -= d[153]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[d[154]];
        String string = (String)object[d[155]];
        object = object[d[156]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[157]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[158]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[160] ^ d[161]];
                byArray[r_0.d[162] ^ r_0.d[163]] = d[164] ^ d[165];
                byArray[r_0.d[166] ^ r_0.d[167]] = d[168] ^ d[169];
                byArray[r_0.d[170] ^ r_0.d[171]] = d[172] ^ d[173];
                byArray[r_0.d[174] ^ r_0.d[175]] = d[176] ^ d[177];
                byArray[r_0.d[178] ^ r_0.d[179]] = d[180] ^ d[181];
                byArray[r_0.d[182] ^ r_0.d[183]] = d[184] ^ d[185];
                byArray[r_0.d[186] ^ r_0.d[187]] = d[188] ^ d[189];
                byArray[r_0.d[190] ^ r_0.d[191]] = d[192] ^ d[193];
                byArray[r_0.d[194] ^ r_0.d[195]] = d[196] ^ d[197];
                byArray[r_0.d[198] ^ r_0.d[199]] = d[200] ^ d[201];
                byArray[r_0.d[202] ^ r_0.d[203]] = d[204] ^ d[205];
                byArray[r_0.d[206] ^ r_0.d[207]] = d[208] ^ d[209];
                byArray[r_0.d[210] ^ r_0.d[211]] = d[212] ^ d[213];
                byArray[r_0.d[214] ^ r_0.d[215]] = d[216] ^ d[217];
                byArray[r_0.d[218] ^ r_0.d[219]] = d[220] ^ d[221];
                byArray[r_0.d[222] ^ r_0.d[223]] = d[224] ^ d[225];
                objectArray2[r_0.d[159]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[226]];
            if (B == null) {
                byte[] byArray2 = new byte[d[227] ^ d[228]];
                byArray2[r_0.d[229] ^ r_0.d[230]] = d[231] ^ d[232];
                byArray2[r_0.d[233] ^ r_0.d[234]] = d[235] ^ d[236];
                byArray2[r_0.d[237] ^ r_0.d[238]] = d[239] ^ d[240];
                byArray2[r_0.d[241] ^ r_0.d[242]] = d[243] ^ d[244];
                byArray2[r_0.d[245] ^ r_0.d[246]] = d[247] ^ d[248];
                byArray2[r_0.d[249] ^ r_0.d[250]] = d[251] ^ d[252];
                byArray2[r_0.d[253] ^ r_0.d[254]] = d[255] ^ d[256];
                byArray2[r_0.d[257] ^ r_0.d[258]] = d[259] ^ d[260];
                byArray2[r_0.d[261] ^ r_0.d[262]] = d[263] ^ d[264];
                byArray2[r_0.d[265] ^ r_0.d[266]] = d[267] ^ d[268];
                byArray2[r_0.d[269] ^ r_0.d[270]] = d[271] ^ d[272];
                byArray2[r_0.d[273] ^ r_0.d[274]] = d[275] ^ d[276];
                byArray2[r_0.d[277] ^ r_0.d[278]] = d[279] ^ d[280];
                byArray2[r_0.d[281] ^ r_0.d[282]] = d[283] ^ d[284];
                byArray2[r_0.d[285] ^ r_0.d[286]] = d[287] ^ d[288];
                byArray2[r_0.d[289] ^ r_0.d[290]] = d[291] ^ d[292];
                byArray2[r_0.d[293] ^ r_0.d[294]] = d[295] ^ d[296];
                byArray2[r_0.d[297] ^ r_0.d[298]] = d[299] ^ d[300];
                byArray2[r_0.d[301] ^ r_0.d[302]] = d[303] ^ d[304];
                byArray2[r_0.d[305] ^ r_0.d[306]] = d[307] ^ d[308];
                byArray2[r_0.d[309] ^ r_0.d[310]] = d[311] ^ d[312];
                byArray2[r_0.d[313] ^ r_0.d[314]] = d[315] ^ d[316];
                byArray2[r_0.d[317] ^ r_0.d[318]] = d[319] ^ d[320];
                byArray2[r_0.d[321] ^ r_0.d[322]] = d[323] ^ d[324];
                byArray2[r_0.d[325] ^ r_0.d[326]] = d[327] ^ d[328];
                byArray2[r_0.d[329] ^ r_0.d[330]] = d[331] ^ d[332];
                byArray2[r_0.d[333] ^ r_0.d[334]] = d[335] ^ d[336];
                byArray2[r_0.d[337] ^ r_0.d[338]] = d[339] ^ d[340];
                byArray2[r_0.d[341] ^ r_0.d[342]] = d[343] ^ d[344];
                byArray2[r_0.d[345] ^ r_0.d[346]] = d[347] ^ d[348];
                byArray2[r_0.d[349] ^ r_0.d[350]] = d[351] ^ d[352];
                byArray2[r_0.d[353] ^ r_0.d[354]] = d[355] ^ d[356];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, d[357], byArray3, d[358], byArray.length);
                System.arraycopy(byArray2, d[359], byArray3, byArray.length, byArray2.length);
                Object object4 = r_0.A()[d[360]];
                if (object4 == null) {
                    char[] cArray = "\uccf4\ucc82\uccef\uccd8\uccd6\ucc92\ucc8b\uccd1\ucc68\uccbc\uccdc\uccc5\uccb9\uccb7\ucc87\uccdc\uccd9\ucc29".toCharArray();
                    for (int i2 = d[361]; i2 < d[362]; ++i2) {
                        int n2 = cArray[i2];
                        n2 += d[363];
                        n2 += d[364];
                        n2 ^= d[365];
                        n2 += d[366];
                        n2 += d[367];
                        n2 += d[368];
                        n2 ^= d[369];
                        n2 += d[370];
                        n2 += d[371];
                        n2 -= d[372];
                        n2 ^= d[373];
                        n2 ^= d[374];
                        cArray[i2] = (char)(n2 += d[375]);
                    }
                    object4 = r_0.A()[r_0.d[376]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[d[377]];
                byArray4[r_0.d[378]] = d[379];
                byArray4[r_0.d[380]] = d[381];
                byArray4[r_0.d[382]] = d[383];
                byArray4[r_0.d[384]] = d[385];
                byArray4[r_0.d[386]] = d[387];
                byArray4[r_0.d[388]] = d[389];
                byArray4[r_0.d[390]] = d[391];
                byArray4[r_0.d[392]] = d[393];
                byArray4[r_0.d[394]] = d[395];
                byArray4[r_0.d[396]] = d[397];
                byArray4[r_0.d[398]] = d[399];
                byArray4[4] = 64;
                byArray4[0] = -76;
                byArray4[12] = 41;
                byArray4[6] = 36;
                byArray4[7] = -8;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 4, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = r_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u755a\u7546\u7540".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n3 = cArray[i3];
                        n3 += 2755;
                        n3 ^= 0x4B89;
                        n3 += 55339;
                        n3 += 23627;
                        n3 += 21099;
                        n3 ^= 0xFFF2;
                        n3 -= 64499;
                        n3 ^= 0x5534;
                        n3 -= 44213;
                        n3 += 17785;
                        n3 ^= 0xCA39;
                        n3 -= 42043;
                        cArray[i3] = (char)(n3 += 60703);
                    }
                    object5 = r_0.A()[2] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = r_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\ua460\ua464\ua592\ua4ae\ua462\ua4df\ua462\ua4ae\ua4cd\ua4ca\ua462\ua592\ua474\ua4cd\ua480\ua481\ua481\ua468\ua46b\ua486".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n4 = cArray[i4];
                    n4 -= 55520;
                    n4 ^= 0x5372;
                    n4 ^= 0x6C34;
                    n4 -= 53480;
                    n4 ^= 0x9B89;
                    n4 -= 27019;
                    n4 -= 55691;
                    n4 += 14891;
                    n4 -= 38590;
                    n4 ^= 0xFE9E;
                    cArray[i4] = (char)(n4 -= 58863);
                }
                object6 = r_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)B), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = C;
        if (C == null) {
            C = new Object[4];
            objectArray = C;
        }
        return objectArray;
    }

    public static void b() {
        d = new int[0x435C ^ 0x42CC];
        r_0.d[0x7537 ^ 0x7518] = 0xB931 ^ 0x7518;
        r_0.d[0x879F ^ 0x875C] = 0xCCDF ^ 0x875C;
        r_0.d[0xF598 ^ 0xF4D8] = 0x753F ^ 0xF4D8;
        r_0.d[0x472B ^ 0x4678] = 0xFFFFCB76 ^ 0x4678;
        r_0.d[0xB6E2 ^ 0xB78F] = 0x68C7 ^ 0xB78F;
        r_0.d[0xA904 ^ 0xA96F] = 0xFFFF56E2 ^ 0xA96F;
        r_0.d[0xC118 ^ 0xC17C] = 0xC12C ^ 0xC17C;
        r_0.d[0x5669 ^ 0x5738] = 0x25CB ^ 0x5738;
        r_0.d[0x10DF5 ^ 0x10CB3] = 0x1D3D7 ^ 0x10CB3;
        r_0.d[0x74E0 ^ 0x75FB] = 0x8760 ^ 0x75FB;
        r_0.d[0x9C6E ^ 0x9CB2] = 0xFE5C ^ 0x9CB2;
        r_0.d[0x6C64 ^ 0x6C6B] = 0xFFFF938F ^ 0x6C6B;
        r_0.d[0x7240 ^ 0x7336] = 0x79A1 ^ 0x7336;
        r_0.d[0xE0F8 ^ 0xE089] = 0xFFFF1F2E ^ 0xE089;
        r_0.d[0x8DD ^ 0x99A] = 0xD691 ^ 0x99A;
        r_0.d[0xBC26 ^ 0xBD4A] = 0xDC4C ^ 0xBD4A;
        r_0.d[0x10879 ^ 0x108E2] = 0x108E0 ^ 0x108E2;
        r_0.d[0xCA2C ^ 0xCA1D] = 0x71A6 ^ 0xCA1D;
        r_0.d[0xD0B2 ^ 0xD041] = 0x21BB ^ 0xD041;
        r_0.d[0x23CB ^ 0x2246] = 0xFFFFDDE1 ^ 0x2246;
        r_0.d[0xE446 ^ 0xE568] = 0x1E75B ^ 0xE568;
        r_0.d[0xF8A1 ^ 0xF8BC] = 0xFFFF0736 ^ 0xF8BC;
        r_0.d[0x3E3B ^ 0x3F5C] = 0x3F5C ^ 0x3F5C;
        r_0.d[0xAAE6 ^ 0xAA4C] = 0x88A5 ^ 0xAA4C;
        r_0.d[0x5E79 ^ 0x5F46] = 0xFFFF214E ^ 0x5F46;
        r_0.d[0x4919 ^ 0x49F5] = 0xD274 ^ 0x49F5;
        r_0.d[0xB2C7 ^ 0xB2B3] = 0xFFFF4D50 ^ 0xB2B3;
        r_0.d[0xA6B9 ^ 0xA733] = 0xA738 ^ 0xA733;
        r_0.d[0xFA5 ^ 0xE8D] = 0x187B ^ 0xE8D;
        r_0.d[0x3A8D ^ 0x3BEF] = 0x69CE ^ 0x3BEF;
        r_0.d[0x6FD9 ^ 0x6EBC] = 0x6EBC ^ 0x6EBC;
        r_0.d[0x68FC ^ 0x686B] = 0x683E ^ 0x686B;
        r_0.d[0x8058 ^ 0x8040] = 0x805D ^ 0x8040;
        r_0.d[0x349D ^ 0x34B9] = 0x34B9 ^ 0x34B9;
        r_0.d[0x8F8D ^ 0x8EDA] = 0xFFFF93DA ^ 0x8EDA;
        r_0.d[0x107B0 ^ 0x106FD] = 0x10B02 ^ 0x106FD;
        r_0.d[0x7C4D ^ 0x7CD2] = 0x7CD2 ^ 0x7CD2;
        r_0.d[0x105A7 ^ 0x1057A] = 0x167F9 ^ 0x1057A;
        r_0.d[0x5E07 ^ 0x5F5D] = 0x1B03 ^ 0x5F5D;
        r_0.d[0xD6B5 ^ 0xD7DF] = 0xD7CD ^ 0xD7DF;
        r_0.d[0x9141 ^ 0x913B] = 0xFFFF6EB4 ^ 0x913B;
        r_0.d[0x3D55 ^ 0x3C6E] = 0xFFFFEB9C ^ 0x3C6E;
        r_0.d[0xC8ED ^ 0xC869] = 0xFFFF37DC ^ 0xC869;
        r_0.d[0xFF86 ^ 0xFEF3] = 0x6345 ^ 0xFEF3;
        r_0.d[0xC668 ^ 0xC6E2] = 0xFFFF3938 ^ 0xC6E2;
        r_0.d[0x4AD5 ^ 0x4B53] = 0x4B56 ^ 0x4B53;
        r_0.d[0xB7C0 ^ 0xB7D1] = 0xB7D7 ^ 0xB7D1;
        r_0.d[0x1055D ^ 0x10443] = 0x10C3C ^ 0x10443;
        r_0.d[0xB71E ^ 0xB648] = 0x54C9 ^ 0xB648;
        r_0.d[0x589C ^ 0x585D] = 0x39DF ^ 0x585D;
        r_0.d[0xACB6 ^ 0xADC2] = 0x5254 ^ 0xADC2;
        r_0.d[0xA8D7 ^ 0xA82C] = 0xF96E ^ 0xA82C;
        r_0.d[0x2F17 ^ 0x2E9F] = 0x2E90 ^ 0x2E9F;
        r_0.d[0x71BB ^ 0x71DC] = 0x71B8 ^ 0x71DC;
        r_0.d[0x20F0 ^ 0x2190] = 0xFAD7 ^ 0x2190;
        r_0.d[0x2C51 ^ 0x2D2E] = 0xFFFFD2B6 ^ 0x2D2E;
        r_0.d[0x164A ^ 0x1612] = 0xFFFFE995 ^ 0x1612;
        r_0.d[0x7D98 ^ 0x7D93] = 0x7DBC ^ 0x7D93;
        r_0.d[0x1337 ^ 0x1373] = 0x1303 ^ 0x1373;
        r_0.d[0xA352 ^ 0xA259] = 0xE3D9 ^ 0xA259;
        r_0.d[0x8736 ^ 0x87E6] = 0x449C ^ 0x87E6;
        r_0.d[0x8298 ^ 0x82AD] = 0x82B0 ^ 0x82AD;
        r_0.d[0xCE1D ^ 0xCEC4] = 0xAB55 ^ 0xCEC4;
        r_0.d[0x3685 ^ 0x360D] = 0x3662 ^ 0x360D;
        r_0.d[0x4583 ^ 0x4526] = 0x8848 ^ 0x4526;
        r_0.d[0x1A50 ^ 0x1A68] = 0x1A4F ^ 0x1A68;
        r_0.d[0x5D78 ^ 0x5D6C] = 0xFFFFA2C7 ^ 0x5D6C;
        r_0.d[0x10A8F ^ 0x10A57] = 0x16FB9 ^ 0x10A57;
        r_0.d[0xCD1D ^ 0xCC0A] = 0xD594 ^ 0xCC0A;
        r_0.d[0xC0B1 ^ 0xC1E8] = 0x85A2 ^ 0xC1E8;
        r_0.d[0x68F0 ^ 0x6989] = 0x6999 ^ 0x6989;
        r_0.d[0xBA46 ^ 0xBA2F] = 0xFFFF45E4 ^ 0xBA2F;
        r_0.d[0xF1E ^ 0xE16] = 0x10B6D ^ 0xE16;
        r_0.d[0xA725 ^ 0xA77E] = 0xA70D ^ 0xA77E;
        r_0.d[0x6074 ^ 0x608B] = 0xFFFFD424 ^ 0x608B;
        r_0.d[0x4F90 ^ 0x4FD1] = 0xFFFFB0B1 ^ 0x4FD1;
        r_0.d[0xB826 ^ 0xB97D] = 0xFD71 ^ 0xB97D;
        r_0.d[0x9315 ^ 0x9313] = 0xFFFF6CEF ^ 0x9313;
        r_0.d[0xC440 ^ 0xC440] = 0xC426 ^ 0xC440;
        r_0.d[0x10530 ^ 0x1055C] = 0x10563 ^ 0x1055C;
        r_0.d[0xBAE2 ^ 0xBA5F] = 0x9A ^ 0xBA5F;
        r_0.d[0x9A91 ^ 0x9A81] = 0x9AA0 ^ 0x9A81;
        r_0.d[0x5155 ^ 0x513A] = 0x5134 ^ 0x513A;
        r_0.d[0x64E4 ^ 0x6563] = 0xFFFF9AB9 ^ 0x6563;
        r_0.d[0x7FE9 ^ 0x7F95] = 0xFFFF801F ^ 0x7F95;
        r_0.d[0x46C5 ^ 0x4621] = 0xBF8D ^ 0x4621;
        r_0.d[0x1C9F ^ 0x1C97] = 0xFFFFE313 ^ 0x1C97;
        r_0.d[0x2F29 ^ 0x2F20] = 0x2F3F ^ 0x2F20;
        r_0.d[0xB061 ^ 0xB011] = 0xFFFF4FE6 ^ 0xB011;
        r_0.d[0xD419 ^ 0xD535] = 0xCFF4 ^ 0xD535;
        r_0.d[0x6438 ^ 0x64E3] = 0x660 ^ 0x64E3;
        r_0.d[0x529D ^ 0x52EF] = 0x5287 ^ 0x52EF;
        r_0.d[0x6E2B ^ 0x6E8A] = 0x40A9 ^ 0x6E8A;
        r_0.d[0x50A9 ^ 0x51F1] = 0xB370 ^ 0x51F1;
        r_0.d[0x7FC5 ^ 0x7EE8] = 0x17CD2 ^ 0x7EE8;
        r_0.d[0xB7C8 ^ 0xB700] = 0xFFFF0E32 ^ 0xB700;
        r_0.d[0x7F80 ^ 0x7FBC] = 0xFFFF8022 ^ 0x7FBC;
        r_0.d[0x5813 ^ 0x5896] = 0x58CB ^ 0x5896;
        r_0.d[0x35E2 ^ 0x34DE] = 0x1C92 ^ 0x34DE;
        r_0.d[0xD102 ^ 0xD04C] = 0xDDB2 ^ 0xD04C;
        r_0.d[0xB92D ^ 0xB917] = 0xFFFF46AF ^ 0xB917;
        r_0.d[0x9E71 ^ 0x9E46] = 0xFFFF6180 ^ 0x9E46;
        r_0.d[0xE1CB ^ 0xE15A] = 0xFFFF1E30 ^ 0xE15A;
        r_0.d[0xFBF4 ^ 0xFA70] = 0xFA78 ^ 0xFA70;
        r_0.d[0x67EF ^ 0x6743] = 0xFFFFBA39 ^ 0x6743;
        r_0.d[0x91D ^ 0x828] = 0xDB9F ^ 0x828;
        r_0.d[0xF457 ^ 0xF44B] = 0xF428 ^ 0xF44B;
        r_0.d[0xA0FD ^ 0xA1BF] = 0xB18B ^ 0xA1BF;
        r_0.d[0x52B8 ^ 0x52BF] = 0x52CC ^ 0x52BF;
        r_0.d[0x107E4 ^ 0x107B7] = 0x107BC ^ 0x107B7;
        r_0.d[0xE911 ^ 0xE915] = 0xFFFF16A9 ^ 0xE915;
        r_0.d[0xB37A ^ 0xB350] = 0xB754 ^ 0xB350;
        r_0.d[0xB944 ^ 0xB99E] = 0xDB1D ^ 0xB99E;
        r_0.d[0xE55C ^ 0xE511] = 0xE516 ^ 0xE511;
        r_0.d[0xF35 ^ 0xE15] = 0x66A ^ 0xE15;
        r_0.d[0x4C7E ^ 0x4CEB] = 0xFFFFB319 ^ 0x4CEB;
        r_0.d[0xFF98 ^ 0xFEBB] = 0xFFFF4219 ^ 0xFEBB;
        r_0.d[0x7E08 ^ 0x7E1A] = 0x7E24 ^ 0x7E1A;
        r_0.d[0xD5F2 ^ 0xD51B] = 0x4E9D ^ 0xD51B;
        r_0.d[0x9DB7 ^ 0x9DF8] = 0x9DB3 ^ 0x9DF8;
        r_0.d[0xF50C ^ 0xF44D] = 0xE468 ^ 0xF44D;
        r_0.d[0xED79 ^ 0xEC64] = 0xE403 ^ 0xEC64;
        r_0.d[0xDCAD ^ 0xDC1B] = 0xED8E ^ 0xDC1B;
        r_0.d[0xCE9E ^ 0xCE62] = 0x9F15 ^ 0xCE62;
        r_0.d[0x53EC ^ 0x5360] = 0x5327 ^ 0x5360;
        r_0.d[0xCE6 ^ 0xCDF] = 0xFFFFF360 ^ 0xCDF;
        r_0.d[0x91CB ^ 0x91A5] = 0xFFFF6E6B ^ 0x91A5;
        r_0.d[0x8557 ^ 0x853D] = 0x8551 ^ 0x853D;
        r_0.d[0x3018 ^ 0x310D] = 0x28FE ^ 0x310D;
        r_0.d[0x10250 ^ 0x10287] = 0x16716 ^ 0x10287;
        r_0.d[0xE821 ^ 0xE871] = 0xE8FC ^ 0xE871;
        r_0.d[0xC228 ^ 0xC26B] = 0xC212 ^ 0xC26B;
        r_0.d[0x6148 ^ 0x606A] = 0x235A ^ 0x606A;
        r_0.d[0x1BA7 ^ 0x1A9D] = 0x32D1 ^ 0x1A9D;
        r_0.d[0x3C41 ^ 0x3D50] = 0x8C7D ^ 0x3D50;
        r_0.d[0x3951 ^ 0x381A] = 0x289 ^ 0x381A;
        r_0.d[0x9585 ^ 0x95FB] = 0x9590 ^ 0x95FB;
        r_0.d[0xF318 ^ 0xF3FA] = 0xF3FA ^ 0xF3FA;
        r_0.d[0x97F0 ^ 0x96AF] = 0xFFFFB254 ^ 0x96AF;
        r_0.d[0x43B1 ^ 0x4396] = 0x4396 ^ 0x4396;
        r_0.d[0xB454 ^ 0xB481] = 0x3439 ^ 0xB481;
        r_0.d[0x936E ^ 0x934B] = 0x9349 ^ 0x934B;
        r_0.d[0x1075D ^ 0x10773] = 0x1EC9B ^ 0x10773;
        r_0.d[0xB3E3 ^ 0xB341] = 0x7E25 ^ 0xB341;
        r_0.d[0x44FC ^ 0x444E] = 0xB565 ^ 0x444E;
        r_0.d[0x2BD0 ^ 0x2B25] = 0x7CD ^ 0x2B25;
        r_0.d[0x80A6 ^ 0x80F0] = 0xFFFF7FAF ^ 0x80F0;
        r_0.d[0x111D ^ 0x1020] = 0x91DB ^ 0x1020;
        r_0.d[0xDD2B ^ 0xDCA7] = 0xDCA4 ^ 0xDCA7;
        r_0.d[0x7CEB ^ 0x7DB5] = 0xA6F2 ^ 0x7DB5;
        r_0.d[0x2AC3 ^ 0x2A60] = 0xE70E ^ 0x2A60;
        r_0.d[0x1FB7 ^ 0x1F50] = 0x2F05 ^ 0x1F50;
        r_0.d[0xF675 ^ 0xF632] = 0xF60D ^ 0xF632;
        r_0.d[0x4A13 ^ 0x4A0D] = 0x4A45 ^ 0x4A0D;
        r_0.d[0x3DD9 ^ 0x3CD7] = 0xA6BC ^ 0x3CD7;
        r_0.d[0x534F ^ 0x533C] = 0xFFFFAC49 ^ 0x533C;
        r_0.d[0xFBD9 ^ 0xFAFC] = 0xEC18 ^ 0xFAFC;
        r_0.d[0x2105 ^ 0x2009] = 0x6191 ^ 0x2009;
        r_0.d[0x92FD ^ 0x92A1] = 0x93A9 ^ 0x92A1;
        r_0.d[0x10A74 ^ 0x10B20] = 0x179C8 ^ 0x10B20;
        r_0.d[0xEA3F ^ 0xEA00] = 0xEA15 ^ 0xEA00;
        r_0.d[0x2ADD ^ 0x2A11] = 0xFFFFEC29 ^ 0x2A11;
        r_0.d[0x7ABB ^ 0x7ADA] = 0x7BD6 ^ 0x7ADA;
        r_0.d[0x5A6C ^ 0x5B48] = 0x1878 ^ 0x5B48;
        r_0.d[0x5D91 ^ 0x5D54] = 0x16D7 ^ 0x5D54;
        r_0.d[0x5F0D ^ 0x5F68] = 0xFFFFA0D3 ^ 0x5F68;
        r_0.d[0x3436 ^ 0x3421] = 0x347D ^ 0x3421;
        r_0.d[0x572 ^ 0x5C3] = 0xBA2A ^ 0x5C3;
        r_0.d[0xE8B6 ^ 0xE864] = 0x68D7 ^ 0xE864;
        r_0.d[0xA003 ^ 0xA188] = 0xFFFF5E26 ^ 0xA188;
        r_0.d[0x3DE1 ^ 0x3D8C] = 0xFFFFC246 ^ 0x3D8C;
        r_0.d[0xB2E1 ^ 0xB2A1] = 0xB29B ^ 0xB2A1;
        r_0.d[0x739C ^ 0x7386] = 0xFFFF8C27 ^ 0x7386;
        r_0.d[0x410E ^ 0x41AE] = 0x6F9D ^ 0x41AE;
        r_0.d[0xE2A ^ 0xE9A] = 0xFFFF4EBB ^ 0xE9A;
        r_0.d[0xCADC ^ 0xCBB2] = 0xF003 ^ 0xCBB2;
        r_0.d[0x77C4 ^ 0x777D] = 0x46EB ^ 0x777D;
        r_0.d[0xA126 ^ 0xA1B8] = 0xA1B9 ^ 0xA1B8;
        r_0.d[0x26D5 ^ 0x27AD] = 0x27AC ^ 0x27AD;
        r_0.d[0x354E ^ 0x3563] = 0x23F4 ^ 0x3563;
        r_0.d[0x6BDC ^ 0x6AF6] = 0x7037 ^ 0x6AF6;
        r_0.d[0xA8DE ^ 0xA9EF] = 0xF4F6 ^ 0xA9EF;
        r_0.d[0x8BBE ^ 0x8AA2] = 0x7879 ^ 0x8AA2;
        r_0.d[0xCAF2 ^ 0xCBF5] = 0xFFFE3113 ^ 0xCBF5;
        r_0.d[0x9CE9 ^ 0x9CB8] = 0xFFFF6347 ^ 0x9CB8;
        r_0.d[0x1664 ^ 0x17E6] = 0x17EC ^ 0x17E6;
        r_0.d[0xC607 ^ 0xC642] = 0xFFFF39C6 ^ 0xC642;
        r_0.d[0x6CD6 ^ 0x6DE2] = 0x30E6 ^ 0x6DE2;
        r_0.d[0x137E ^ 0x13D6] = 0xFFFFFC8E ^ 0x13D6;
        r_0.d[0x575A ^ 0x5779] = 0x5778 ^ 0x5779;
        r_0.d[0xD36A ^ 0xD252] = 0x1FA ^ 0xD252;
        r_0.d[0x35F6 ^ 0x3518] = 0xABE ^ 0x3518;
        r_0.d[0x1031C ^ 0x1025F] = 0x11216 ^ 0x1025F;
        r_0.d[0xEF63 ^ 0xEFC8] = 0xCD20 ^ 0xEFC8;
        r_0.d[0x5BD9 ^ 0x5AFF] = 0x4C09 ^ 0x5AFF;
        r_0.d[0x1781 ^ 0x173D] = 0xADC5 ^ 0x173D;
        r_0.d[0xEEAD ^ 0xEE22] = 0xFFFF11B5 ^ 0xEE22;
        r_0.d[0x3020 ^ 0x317C] = 0x7522 ^ 0x317C;
        r_0.d[0x8916 ^ 0x8898] = 0x8891 ^ 0x8898;
        r_0.d[0x105B2 ^ 0x10481] = 0x159AB ^ 0x10481;
        r_0.d[0xC3E7 ^ 0xC304] = 0x3A88 ^ 0xC304;
        r_0.d[0x5D3E ^ 0x5D3C] = 0x5D71 ^ 0x5D3C;
        r_0.d[0xCAEA ^ 0xCA79] = 0xFFFF35DE ^ 0xCA79;
        r_0.d[0xE354 ^ 0xE357] = 0xE31B ^ 0xE357;
        r_0.d[0x9CBC ^ 0x9DC6] = 0x9DC4 ^ 0x9DC6;
        r_0.d[0xF199 ^ 0xF127] = 0x90AD ^ 0xF127;
        r_0.d[0x3BAD ^ 0x3BA1] = 0x3BFB ^ 0x3BA1;
        r_0.d[0xBF7F ^ 0xBE35] = 0x84A2 ^ 0xBE35;
        r_0.d[0x6224 ^ 0x6303] = 0xFFFF8A7E ^ 0x6303;
        r_0.d[0x616 ^ 0x650] = 0xFFFFF984 ^ 0x650;
        r_0.d[0xE018 ^ 0xE118] = 0xAA54 ^ 0xE118;
        r_0.d[0xAFA2 ^ 0xAF47] = 0x9F4B ^ 0xAF47;
        r_0.d[0xEB5B ^ 0xEA12] = 0xD088 ^ 0xEA12;
        r_0.d[0x6911 ^ 0x69DB] = 0x502B ^ 0x69DB;
        r_0.d[0xA2D7 ^ 0xA22F] = 0x8ED2 ^ 0xA22F;
        r_0.d[0x1B8F ^ 0x1ADD] = 0x6835 ^ 0x1ADD;
        r_0.d[0xC8F1 ^ 0xC8A6] = 0xFFFF371E ^ 0xC8A6;
        r_0.d[0x10A26 ^ 0x10A99] = 0x16B1B ^ 0x10A99;
        r_0.d[0x2DFB ^ 0x2D4E] = 0xDC6B ^ 0x2D4E;
        r_0.d[0x3DC0 ^ 0x3CC2] = 0x8595 ^ 0x3CC2;
        r_0.d[0x2634 ^ 0x2771] = 0xF817 ^ 0x2771;
        r_0.d[0x1707 ^ 0x1706] = 0xFFFFE8E8 ^ 0x1706;
        r_0.d[0x5DF0 ^ 0x5DC4] = 0x5DC4 ^ 0x5DC4;
        r_0.d[0x19D4 ^ 0x199A] = 0xFFFFE606 ^ 0x199A;
        r_0.d[0x518 ^ 0x56D] = 0xFFFFFAFF ^ 0x56D;
        r_0.d[0x9EF ^ 0x8F7] = 0x1108 ^ 0x8F7;
        r_0.d[0x6327 ^ 0x63BA] = 0x63BB ^ 0x63BA;
        r_0.d[0x591E ^ 0x59CD] = 0xD975 ^ 0x59CD;
        r_0.d[0xB601 ^ 0xB662] = 0xFFFF49F2 ^ 0xB662;
        r_0.d[0x4695 ^ 0x46B9] = 0x74FF ^ 0x46B9;
        r_0.d[0x7DD0 ^ 0x7C80] = 0x717E ^ 0x7C80;
        r_0.d[0x2201 ^ 0x231B] = 0xD1C0 ^ 0x231B;
        r_0.d[0x5FCE ^ 0x5F0C] = 0x1482 ^ 0x5F0C;
        r_0.d[0x51F6 ^ 0x5077] = 0xFFFFAF88 ^ 0x5077;
        r_0.d[0x3644 ^ 0x3632] = 0x3668 ^ 0x3632;
        r_0.d[0xCEF8 ^ 0xCE27] = 0x386A ^ 0xCE27;
        r_0.d[0xAA38 ^ 0xAAD9] = 0x5C94 ^ 0xAAD9;
        r_0.d[0x8422 ^ 0x847D] = 0x8418 ^ 0x847D;
        r_0.d[0xBAB0 ^ 0xBA33] = 0xBA1B ^ 0xBA33;
        r_0.d[0xB011 ^ 0xB130] = 0xF213 ^ 0xB130;
        r_0.d[0x30D5 ^ 0x31A6] = 0x2693 ^ 0x31A6;
        r_0.d[0xFFC8 ^ 0xFFDB] = 0xFFFF0007 ^ 0xFFDB;
        r_0.d[0x4805 ^ 0x4885] = 0xFFFFB71C ^ 0x4885;
        r_0.d[0xD248 ^ 0xD334] = 0xD339 ^ 0xD334;
        r_0.d[0x96FB ^ 0x968C] = 0x9690 ^ 0x968C;
        r_0.d[0xB847 ^ 0xB80B] = 0xFFFF47DB ^ 0xB80B;
        r_0.d[0x8AEF ^ 0x8BF0] = 0xFFFF7C45 ^ 0x8BF0;
        r_0.d[0x62B5 ^ 0x638C] = 0x4BD6 ^ 0x638C;
        r_0.d[0x2EE6 ^ 0x2FE9] = 0xFFFF4A55 ^ 0x2FE9;
        r_0.d[0xCE1F ^ 0xCF29] = 0x1C81 ^ 0xCF29;
        r_0.d[0xCAF7 ^ 0xCB85] = 0x2591 ^ 0xCB85;
        r_0.d[0x7AD7 ^ 0x7A70] = 0x6AB7 ^ 0x7A70;
        r_0.d[0xCA44 ^ 0xCA3C] = 0xFFFF35AC ^ 0xCA3C;
        r_0.d[0x73E2 ^ 0x739F] = 0x738F ^ 0x739F;
        r_0.d[0x7870 ^ 0x7889] = 0x29F6 ^ 0x7889;
        r_0.d[0x442 ^ 0x4C0] = 0xFFFFFB29 ^ 0x4C0;
        r_0.d[0xC72D ^ 0xC7E6] = 0xFE1A ^ 0xC7E6;
        r_0.d[0x1DC6 ^ 0x1DF5] = 0x414B ^ 0x1DF5;
        r_0.d[0x69E3 ^ 0x69C3] = 0xFFFF9617 ^ 0x69C3;
        r_0.d[0x67DB ^ 0x66C2] = 0x9419 ^ 0x66C2;
        r_0.d[0xD178 ^ 0xD1F6] = 0xD1F5 ^ 0xD1F6;
        r_0.d[0x6027 ^ 0x6159] = 0x6157 ^ 0x6159;
        r_0.d[0xCD41 ^ 0xCDDB] = 0xCDDA ^ 0xCDDB;
        r_0.d[0x69BB ^ 0x6956] = 0x56E0 ^ 0x6956;
        r_0.d[0x6FB2 ^ 0x6F1D] = 0xD0F4 ^ 0x6F1D;
        r_0.d[0xA423 ^ 0xA497] = 0x5593 ^ 0xA497;
        r_0.d[0xAFBE ^ 0xAF96] = 0xAE16 ^ 0xAF96;
        r_0.d[0xA390 ^ 0xA2E1] = 0x9732 ^ 0xA2E1;
        r_0.d[0x19DD ^ 0x1994] = 0xFFFFE654 ^ 0x1994;
        r_0.d[0x3777 ^ 0x3786] = 0xC64F ^ 0x3786;
        r_0.d[0x4C22 ^ 0x4CE2] = 0xFFFFD28F ^ 0x4CE2;
        r_0.d[0xACC5 ^ 0xAC14] = 0x6F0A ^ 0xAC14;
        r_0.d[0xB ^ 0x11B] = 0x9B70 ^ 0x11B;
        r_0.d[0x57CA ^ 0x571E] = 0xD7D3 ^ 0x571E;
        r_0.d[0x14B6 ^ 0x14C9] = 0xFFFFEBA5 ^ 0x14C9;
        r_0.d[0x1A5B ^ 0x1A7D] = 0x1A7D ^ 0x1A7D;
        r_0.d[0x17F1 ^ 0x1749] = 0xFFFFD917 ^ 0x1749;
        r_0.d[0xA1B2 ^ 0xA08C] = 0x216B ^ 0xA08C;
        r_0.d[0xF380 ^ 0xF370] = 0xCCD6 ^ 0xF370;
        r_0.d[0x42F8 ^ 0x43B4] = 0x7923 ^ 0x43B4;
        r_0.d[0xD4AE ^ 0xD463] = 0xED9F ^ 0xD463;
        r_0.d[0x3E42 ^ 0x3EDE] = 0x3EDE ^ 0x3EDE;
        r_0.d[0x8A6B ^ 0x8AFB] = 0x8A95 ^ 0x8AFB;
        r_0.d[0x3DC8 ^ 0x3D7F] = 0xCE9 ^ 0x3D7F;
        r_0.d[0xC3AE ^ 0xC3CE] = 0xFFFF3C75 ^ 0xC3CE;
        r_0.d[0x2405 ^ 0x249D] = 0x249E ^ 0x249D;
        r_0.d[0x8F58 ^ 0x8FB8] = 0xFFFF8655 ^ 0x8FB8;
        r_0.d[0xEA87 ^ 0xEA89] = 0xFFFF1561 ^ 0xEA89;
        r_0.d[0xDDA7 ^ 0xDD2E] = 0xDD6E ^ 0xDD2E;
        r_0.d[0x54FB ^ 0x54CB] = 0xA320 ^ 0x54CB;
        r_0.d[0x4404 ^ 0x4584] = 0x4585 ^ 0x4584;
        r_0.d[0x5BD1 ^ 0x5AFA] = 0x4062 ^ 0x5AFA;
        r_0.d[0xF606 ^ 0xF65B] = 0xF629 ^ 0xF65B;
        r_0.d[0xADF3 ^ 0xAC90] = 0xFFFF0143 ^ 0xAC90;
        r_0.d[0x8474 ^ 0x8543] = 0x56B1 ^ 0x8543;
        r_0.d[0x1D8B ^ 0x1DE9] = 0x1D95 ^ 0x1DE9;
        r_0.d[0x1A7B ^ 0x1B00] = 0xFFFFE4C1 ^ 0x1B00;
        r_0.d[0xF975 ^ 0xF870] = 0x1FD0D ^ 0xF870;
        r_0.d[0x513B ^ 0x51E5] = 0xA7AF ^ 0x51E5;
        r_0.d[0xADD4 ^ 0xACFD] = 0xB625 ^ 0xACFD;
        r_0.d[0x9C49 ^ 0x9CCF] = 0xFFFF6373 ^ 0x9CCF;
        r_0.d[0x4C50 ^ 0x4C99] = 0xA14 ^ 0x4C99;
        r_0.d[0x7F9A ^ 0x7EE7] = 0xFFFF817E ^ 0x7EE7;
        r_0.d[0x45AB ^ 0x4520] = 0x4548 ^ 0x4520;
        r_0.d[0x10E0D ^ 0x10E07] = 0xFFFEF1B1 ^ 0x10E07;
        r_0.d[0xDC32 ^ 0xDC70] = 0xFFFF2389 ^ 0xDC70;
        r_0.d[0xCB0C ^ 0xCB17] = 0xCBF2 ^ 0xCB17;
        r_0.d[0xB257 ^ 0xB276] = 0xB275 ^ 0xB276;
        r_0.d[0xD987 ^ 0xD881] = 0x1DDFA ^ 0xD881;
        r_0.d[0x69AB ^ 0x69F2] = 0x6944 ^ 0x69F2;
        r_0.d[0x1F40 ^ 0x1F4D] = 0x1F3C ^ 0x1F4D;
        r_0.d[0xD6A ^ 0xDF3] = 0xDA6 ^ 0xDF3;
        r_0.d[0xEC67 ^ 0xEC7E] = 0xFFFF13C8 ^ 0xEC7E;
        r_0.d[0xBD80 ^ 0xBD2D] = 0x9FC5 ^ 0xBD2D;
        r_0.d[0xD01B ^ 0xD089] = 0xFFFF2F41 ^ 0xD089;
        r_0.d[0x8FEA ^ 0x8F43] = 0x9F84 ^ 0x8F43;
        r_0.d[0x73AF ^ 0x7360] = 0xB07E ^ 0x7360;
        r_0.d[0xB403 ^ 0xB515] = 0xACEA ^ 0xB515;
        r_0.d[0xE5B6 ^ 0xE5E2] = 0xFFFF1A4D ^ 0xE5E2;
        r_0.d[0x1DC2 ^ 0x1CCF] = 0x86BE ^ 0x1CCF;
        r_0.d[0x1037F ^ 0x10385] = 0x152F2 ^ 0x10385;
        r_0.d[0x8A74 ^ 0x8A3F] = 0x8A3D ^ 0x8A3F;
        r_0.d[0x2525 ^ 0x24A0] = 0x24EB ^ 0x24A0;
        r_0.d[0xAB1E ^ 0xAA1A] = 0x134D ^ 0xAA1A;
        r_0.d[0x164E ^ 0x1651] = 0x1655 ^ 0x1651;
        r_0.d[0x8D3B ^ 0x8D73] = 0xFFFF72F1 ^ 0x8D73;
        r_0.d[0xC504 ^ 0xC532] = 0xFFFF3AC9 ^ 0xC532;
        r_0.d[0xAF8 ^ 0xAAA] = 0xFFFFF53E ^ 0xAAA;
        r_0.d[0xF477 ^ 0xF57E] = 0xB4E8 ^ 0xF57E;
        r_0.d[0x71CE ^ 0x70A5] = 0xD0A0 ^ 0x70A5;
        r_0.d[0x4356 ^ 0x433E] = 0xFFFFBCB1 ^ 0x433E;
        r_0.d[0x2304 ^ 0x23F2] = 0xF0F ^ 0x23F2;
        r_0.d[0x5DAF ^ 0x5D86] = 0x5595 ^ 0x5D86;
        r_0.d[0xC49D ^ 0xC5F4] = 0xC5F4 ^ 0xC5F4;
        r_0.d[0x5F43 ^ 0x5E16] = 0xBC80 ^ 0x5E16;
        r_0.d[0xA988 ^ 0xA89C] = 0x19B4 ^ 0xA89C;
        r_0.d[0x2603 ^ 0x2700] = 0xFFFF61B5 ^ 0x2700;
        r_0.d[0x9EED ^ 0x9E19] = 0x6FDB ^ 0x9E19;
        r_0.d[0x3F9 ^ 0x343] = 0xB984 ^ 0x343;
        r_0.d[0x19D5 ^ 0x18B4] = 0x4A96 ^ 0x18B4;
        r_0.d[0xF8DD ^ 0xF887] = 0xFFFF071A ^ 0xF887;
        r_0.d[0x638D ^ 0x628C] = 0xDBC5 ^ 0x628C;
        r_0.d[0x7588 ^ 0x750F] = 0x7519 ^ 0x750F;
        r_0.d[0x4AE1 ^ 0x4A52] = 0xBB77 ^ 0x4A52;
        r_0.d[0x71C0 ^ 0x713D] = 0x3A7B ^ 0x713D;
        r_0.d[0x604B ^ 0x6164] = 0x1636D ^ 0x6164;
        r_0.d[0x105BF ^ 0x10511] = 0x1BAFE ^ 0x10511;
        r_0.d[0x623B ^ 0x62FD] = 0x2475 ^ 0x62FD;
        r_0.d[0x8198 ^ 0x810C] = 0xFFFF7EF3 ^ 0x810C;
        r_0.d[0xD4CB ^ 0xD4AD] = 0xD4B8 ^ 0xD4AD;
        r_0.d[0x281A ^ 0x28F2] = 0x18FA ^ 0x28F2;
        r_0.d[0x3BE6 ^ 0x3A80] = 0x3A80 ^ 0x3A80;
        r_0.d[0xED39 ^ 0xEDF7] = 0x2EE6 ^ 0xEDF7;
        r_0.d[0x6234 ^ 0x620F] = 0xFFFF9D80 ^ 0x620F;
        r_0.d[0x544 ^ 0x541] = 0x549 ^ 0x541;
        r_0.d[0xF7E2 ^ 0xF7C0] = 0xF7C0 ^ 0xF7C0;
        r_0.d[0x33F5 ^ 0x32E6] = 0xFFFF7C51 ^ 0x32E6;
        r_0.d[0xFB2B ^ 0xFBEF] = 0xFFFF4FA7 ^ 0xFBEF;
        r_0.d[0xFD2D ^ 0xFD3B] = 0xFFFF02FF ^ 0xFD3B;
        r_0.d[0xE69F ^ 0xE6CA] = 0xFFFF195E ^ 0xE6CA;
        r_0.d[0x9682 ^ 0x97C6] = 0x87F2 ^ 0x97C6;
        r_0.d[0xC7F ^ 0xCB8] = 0x4A35 ^ 0xCB8;
        r_0.d[0x6003 ^ 0x60E9] = 0xFB68 ^ 0x60E9;
        r_0.d[0x2B06 ^ 0x2A62] = 0x7843 ^ 0x2A62;
        r_0.d[0xA7E ^ 0xAA8] = 0x6F30 ^ 0xAA8;
        r_0.d[0x10B21 ^ 0x10B1F] = 0x10B31 ^ 0x10B1F;
        r_0.d[0xD5EA ^ 0xD4A2] = 0xBC6 ^ 0xD4A2;
        r_0.d[0x9BA8 ^ 0x9B43] = 0xFFFFFF7F ^ 0x9B43;
        r_0.d[0x45BD ^ 0x45F7] = 0xFFFFBA19 ^ 0x45F7;
        r_0.d[0x30F ^ 0x3AB] = 0xFFFF314C ^ 0x3AB;
        r_0.d[0xD70D ^ 0xD63D] = 0x1D40E ^ 0xD63D;
        r_0.d[0x467E ^ 0x468C] = 0xB74E ^ 0x468C;
        r_0.d[0x736F ^ 0x7380] = 0xFFFFB3F9 ^ 0x7380;
        r_0.d[0x2187 ^ 0x200E] = 0x206D ^ 0x200E;
        r_0.d[0x729A ^ 0x73EA] = 0xA679 ^ 0x73EA;
        r_0.d[0x9C0D ^ 0x9CEB] = 0xACE3 ^ 0x9CEB;
        r_0.d[0x7BA ^ 0x688] = 0x5B8C ^ 0x688;
        r_0.d[0xEBC4 ^ 0xEBBD] = 0xFFFF141A ^ 0xEBBD;
        r_0.d[0x5891 ^ 0x586F] = 0x1323 ^ 0x586F;
        r_0.d[0x6FB4 ^ 0x6EDB] = 0xD388 ^ 0x6EDB;
        r_0.d[0xEEBC ^ 0xEE8E] = 0x1233 ^ 0xEE8E;
        r_0.d[0x768D ^ 0x77E5] = 0x77E4 ^ 0x77E5;
        r_0.d[0xA228 ^ 0xA215] = 0xA21A ^ 0xA215;
        r_0.d[0xE629 ^ 0xE6BF] = 0xFFFF195D ^ 0xE6BF;
        r_0.d[0xF8D1 ^ 0xF952] = 0xF978 ^ 0xF952;
        r_0.d[0x8FAE ^ 0x8FF0] = 0xFFFF707A ^ 0x8FF0;
        r_0.d[0x411C ^ 0x4041] = 0x9B09 ^ 0x4041;
        r_0.d[0x657C ^ 0x6569] = 0x65CF ^ 0x6569;
        r_0.d[0x105C1 ^ 0x104CB] = 0x14553 ^ 0x104CB;
        r_0.d[0x393C ^ 0x3947] = 0x3960 ^ 0x3947;
        r_0.d[0x9EEE ^ 0x9E63] = 0x9E7E ^ 0x9E63;
        r_0.d[0x3F08 ^ 0x3E47] = 0x33BC ^ 0x3E47;
        r_0.d[0x5611 ^ 0x563A] = 0x8C0E ^ 0x563A;
        r_0.d[0xD701 ^ 0xD676] = 0x64A9 ^ 0xD676;
        r_0.d[0xB823 ^ 0xB9AC] = 0xFFFF4649 ^ 0xB9AC;
        r_0.d[0x3B1 ^ 0x330] = 0x31F ^ 0x330;
        r_0.d[0x5B36 ^ 0x5B8D] = 0xE148 ^ 0x5B8D;
        r_0.d[0x45DA ^ 0x452D] = 0x6991 ^ 0x452D;
        r_0.d[0x10B38 ^ 0x10B9E] = 0x11B5D ^ 0x10B9E;
        r_0.d[0x9730 ^ 0x9622] = 0x270A ^ 0x9622;
    }
}

