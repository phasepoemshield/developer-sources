/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.draggable.animation;

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
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.client.draggable.animation.a
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0015\u0010\b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n\u00a2\u0006\u0004\b\b\u0010\u000bR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0004\u0010\fj\u0002\b\rj\u0002\b\u000e\u00a8\u0006\u000f"}, d2={"Lkotakbaz/rain/client/draggable/animation/Easing;", "", "Lkotlin/Function1;", "", "function", "<init>", "(Ljava/lang/String;ILkotlin/jvm/functions/Function1;)V", "x", "apply", "(D)D", "", "(F)F", "Lkotlin/jvm/functions/Function1;", "LINEAR", "SINE_OUT", "rain-visuals"})
public final class a_0
extends Enum<a_0> {
    @NotNull
    private final Function1<Double, Double> a;
    public static final /* enum */ a_0 A;
    public static final /* enum */ a_0 b;
    private static final /* synthetic */ a_0[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private a_0(Function1<? super Double, Double> function1) {
        this.a = function1;
    }

    public final double apply(double d2) {
        return ((Number)this.a.invoke(d2)).doubleValue();
    }

    public final float apply(float f2) {
        return (float)((Number)this.a.invoke(Double.valueOf(f2))).doubleValue();
    }

    public static a_0[] values() {
        return (a_0[])$VALUES.clone();
    }

    public static a_0 valueOf(String string) {
        return Enum.valueOf(a_0.class, string);
    }

    @NotNull
    public static EnumEntries<a_0> getEntries() {
        return $ENTRIES;
    }

    private static final double _init_$lambda$0(double d2) {
        return d2;
    }

    private static final double _init_$lambda$1(double d2) {
        return Math.sin(d2 * Double.longBitsToDouble(0x98425948255DE4B6L ^ 0xD84B78B37119C9AEL) / Double.longBitsToDouble(0x77C6D8F10BBFA3FBL ^ 0x37C6D8F10BBFA3FBL));
    }

    private static final /* synthetic */ a_0[] $values() {
        int n = e[0];
        n ^= e[1];
        a_0[] a_0Array = new a_0[n += e[2]];
        int n2 = e[3];
        n2 += e[4];
        a_0Array[n2 -= a_0.e[5]] = A;
        int n3 = e[6];
        n3 -= e[7];
        a_0Array[n3 += a_0.e[8]] = b;
        return a_0Array;
    }

    static {
        a_0.b();
        long l = 3908647552304975430L;
        long l2 = -6909331876990163876L;
        long l3 = 6922756887335900064L;
        long l4 = -4193631825189674426L;
        long l5 = 3243093943062288022L;
        long l6 = 8679912281449723631L;
        long l7 = 4407352590728123383L;
        long l8 = -629340345375724044L;
        long l9 = -331714492650438249L;
        long l10 = 5797134023565940170L;
        long l11 = -955876569765752001L;
        long l12 = -3992175417527300147L;
        long l13 = 2227993328186317540L;
        long l14 = 3790180621599051161L;
        int n = e[9];
        n += e[10];
        B = new Object[n += e[11]];
        long l15 = l14;
        int n2 = e[12];
        n2 ^= e[13];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= e[14]);
        Object[] objectArray = new Object[e[15]];
        objectArray[a_0.e[16]] = c;
        objectArray[a_0.e[17]] = e[18];
        int n3 = e[19];
        Object object = a_0.A()[e[20]];
        if (object == null) {
            char[] cArray = "\u3a0d\u3982\u39df\u3a0c\u356c\u3a0e\u372c\u3a0a\u34c2\u34c3\u377a\u3982\u356d\u3778\u3778\u3778\u34c2\u3757\u3568\u372b\u372b\u3a0d\u356b\u3a0e\u356b\u3a0b\u34c4\u377b\u372b\u39e0\u3980\u3a1c\u3987\u39e3\u3575\u3a1b\u34c3\u3729\u39f7\u34bf\u3a10\u39f7\u3a1d\u39e3\u34c1\u377e\u356a\u34c1\u3568\u39e7\u3a1e\u3729\u3728\u397f\u356a\u3a1c\u39df\u372a\u377c\u34c3\u39e1\u372c\u377a\u39e5".toCharArray();
            for (int i = e[21]; i < e[22]; ++i) {
                int n4 = cArray[i];
                n4 += e[23];
                n4 += e[24];
                n4 ^= e[25];
                n4 ^= e[26];
                n4 += e[27];
                n4 += e[28];
                n4 -= e[29];
                n4 ^= e[30];
                n4 += e[31];
                n4 ^= e[32];
                n4 ^= e[33];
                n4 += e[34];
                n4 += e[35];
                n4 ^= e[36];
                n4 -= e[37];
                cArray[i] = (char)(n4 -= e[38]);
            }
            object = a_0.A()[a_0.e[39]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = e[40];
        n5 -= e[41];
        l5 = l16 ^ (0x1200000000L ^ l16) & -1L << (n5 ^= e[42]);
        long l17 = l12;
        int n6 = e[43];
        n6 -= e[44];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += e[45]);
        while (true) {
            int n7 = e[46];
            n7 += e[47];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= e[48]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = e[49];
            n9 -= e[50];
            int n10 = e[52];
            n10 += e[53];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += e[51])) & -1L >>> (n10 += e[54]);
            long l19 = l8;
            int n11 = e[55];
            n11 -= e[56];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= e[57]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = e[58];
            n13 -= e[59];
            int n14 = e[61];
            n14 += e[62];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= e[60])) & -1L >>> (n14 ^= e[63]);
            int n15 = e[64];
            n15 -= e[65];
            long l21 = l9;
            int n16 = e[67];
            n16 += e[68];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= e[66]) ^ l21) & -1L << (n16 += e[69]);
            int n17 = e[70];
            n17 -= e[71];
            n17 -= e[72];
            int n18 = e[73];
            n18 -= e[74];
            long l22 = l11;
            int n19 = e[76];
            n19 -= e[77];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += e[75]))) ^ l22) & -1L >>> (n19 -= e[78]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = e[79];
            n20 ^= e[80];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= e[81]);
            while (true) {
                int n21 = e[82];
                n21 -= e[83];
                if ((int)(l13 >>> (n21 -= e[84])) >= (int)l11) break;
                int n22 = e[85];
                n22 ^= e[86];
                int n23 = e[88];
                n23 ^= e[89];
                cArray2[(int)(l13 >>> (n22 ^= a_0.e[87]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= e[90]))];
                l13 += 0x100000000L;
            }
            int n24 = e[91];
            n24 += e[92];
            int n25 = (int)(l14 >>> (n24 ^= e[93]));
            l14 += 0x100000000L;
            a_0.B[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = e[94];
            n26 += e[95];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= e[96]);
        }
        int n27 = e[97];
        n27 ^= e[98];
        int n28 = e[100];
        n28 -= e[101];
        A = new a_0(a_0::_init_$lambda$0);
        int n29 = e[103];
        n29 ^= e[104];
        int n30 = e[106];
        n30 -= e[107];
        b = new a_0(a_0::_init_$lambda$1);
        $VALUES = a_0.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[e[109]];
        String string = (String)object[e[110]];
        object = object[e[111]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[112]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[113]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[115] ^ e[116]];
                byArray[a_0.e[117] ^ a_0.e[118]] = e[119] ^ e[120];
                byArray[a_0.e[121] ^ a_0.e[122]] = e[123] ^ e[124];
                byArray[a_0.e[125] ^ a_0.e[126]] = e[127] ^ e[128];
                byArray[a_0.e[129] ^ a_0.e[130]] = e[131] ^ e[132];
                byArray[a_0.e[133] ^ a_0.e[134]] = e[135] ^ e[136];
                byArray[a_0.e[137] ^ a_0.e[138]] = e[139] ^ e[140];
                byArray[a_0.e[141] ^ a_0.e[142]] = e[143] ^ e[144];
                byArray[a_0.e[145] ^ a_0.e[146]] = e[147] ^ e[148];
                byArray[a_0.e[149] ^ a_0.e[150]] = e[151] ^ e[152];
                byArray[a_0.e[153] ^ a_0.e[154]] = e[155] ^ e[156];
                byArray[a_0.e[157] ^ a_0.e[158]] = e[159] ^ e[160];
                byArray[a_0.e[161] ^ a_0.e[162]] = e[163] ^ e[164];
                byArray[a_0.e[165] ^ a_0.e[166]] = e[167] ^ e[168];
                byArray[a_0.e[169] ^ a_0.e[170]] = e[171] ^ e[172];
                byArray[a_0.e[173] ^ a_0.e[174]] = e[175] ^ e[176];
                byArray[a_0.e[177] ^ a_0.e[178]] = e[179] ^ e[180];
                objectArray2[a_0.e[114]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[181]];
            if (C == null) {
                byte[] byArray2 = new byte[e[182] ^ e[183]];
                byArray2[a_0.e[184] ^ a_0.e[185]] = e[186] ^ e[187];
                byArray2[a_0.e[188] ^ a_0.e[189]] = e[190] ^ e[191];
                byArray2[a_0.e[192] ^ a_0.e[193]] = e[194] ^ e[195];
                byArray2[a_0.e[196] ^ a_0.e[197]] = e[198] ^ e[199];
                byArray2[a_0.e[200] ^ a_0.e[201]] = e[202] ^ e[203];
                byArray2[a_0.e[204] ^ a_0.e[205]] = e[206] ^ e[207];
                byArray2[a_0.e[208] ^ a_0.e[209]] = e[210] ^ e[211];
                byArray2[a_0.e[212] ^ a_0.e[213]] = e[214] ^ e[215];
                byArray2[a_0.e[216] ^ a_0.e[217]] = e[218] ^ e[219];
                byArray2[a_0.e[220] ^ a_0.e[221]] = e[222] ^ e[223];
                byArray2[a_0.e[224] ^ a_0.e[225]] = e[226] ^ e[227];
                byArray2[a_0.e[228] ^ a_0.e[229]] = e[230] ^ e[231];
                byArray2[a_0.e[232] ^ a_0.e[233]] = e[234] ^ e[235];
                byArray2[a_0.e[236] ^ a_0.e[237]] = e[238] ^ e[239];
                byArray2[a_0.e[240] ^ a_0.e[241]] = e[242] ^ e[243];
                byArray2[a_0.e[244] ^ a_0.e[245]] = e[246] ^ e[247];
                byArray2[a_0.e[248] ^ a_0.e[249]] = e[250] ^ e[251];
                byArray2[a_0.e[252] ^ a_0.e[253]] = e[254] ^ e[255];
                byArray2[a_0.e[256] ^ a_0.e[257]] = e[258] ^ e[259];
                byArray2[a_0.e[260] ^ a_0.e[261]] = e[262] ^ e[263];
                byArray2[a_0.e[264] ^ a_0.e[265]] = e[266] ^ e[267];
                byArray2[a_0.e[268] ^ a_0.e[269]] = e[270] ^ e[271];
                byArray2[a_0.e[272] ^ a_0.e[273]] = e[274] ^ e[275];
                byArray2[a_0.e[276] ^ a_0.e[277]] = e[278] ^ e[279];
                byArray2[a_0.e[280] ^ a_0.e[281]] = e[282] ^ e[283];
                byArray2[a_0.e[284] ^ a_0.e[285]] = e[286] ^ e[287];
                byArray2[a_0.e[288] ^ a_0.e[289]] = e[290] ^ e[291];
                byArray2[a_0.e[292] ^ a_0.e[293]] = e[294] ^ e[295];
                byArray2[a_0.e[296] ^ a_0.e[297]] = e[298] ^ e[299];
                byArray2[a_0.e[300] ^ a_0.e[301]] = e[302] ^ e[303];
                byArray2[a_0.e[304] ^ a_0.e[305]] = e[306] ^ e[307];
                byArray2[a_0.e[308] ^ a_0.e[309]] = e[310] ^ e[311];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, e[312], byArray3, e[313], byArray.length);
                System.arraycopy(byArray2, e[314], byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[e[315]];
                if (object4 == null) {
                    char[] cArray = "\u3182\u30d0\u30ff\u30d6\u30d4\u3160\u30eb\u3199\u31a6\u319a\u30fa\u319d\u3171\u3177\u3187\u30fa\u30d1\u3161".toCharArray();
                    for (int i = e[316]; i < e[317]; ++i) {
                        int n2 = cArray[i];
                        n2 ^= e[318];
                        n2 += e[319];
                        n2 += e[320];
                        n2 -= e[321];
                        n2 += e[322];
                        n2 ^= e[323];
                        n2 ^= e[324];
                        n2 -= e[325];
                        n2 -= e[326];
                        n2 += e[327];
                        cArray[i] = (char)(n2 ^= e[328]);
                    }
                    object4 = a_0.A()[a_0.e[329]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[e[330]];
                byArray4[a_0.e[331]] = e[332];
                byArray4[a_0.e[333]] = e[334];
                byArray4[a_0.e[335]] = e[336];
                byArray4[a_0.e[337]] = e[338];
                byArray4[a_0.e[339]] = e[340];
                byArray4[a_0.e[341]] = e[342];
                byArray4[a_0.e[343]] = e[344];
                byArray4[a_0.e[345]] = e[346];
                byArray4[a_0.e[347]] = e[348];
                byArray4[a_0.e[349]] = e[350];
                byArray4[a_0.e[351]] = e[352];
                byArray4[a_0.e[353]] = e[354];
                byArray4[a_0.e[355]] = e[356];
                byArray4[a_0.e[357]] = e[358];
                byArray4[a_0.e[359]] = e[360];
                byArray4[a_0.e[361]] = e[362];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, e[363], e[364]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[e[365]];
                if (object5 == null) {
                    char[] cArray = "\u096e\u0942\u0970".toCharArray();
                    for (int i = e[366]; i < e[367]; ++i) {
                        int n3 = cArray[i];
                        n3 -= e[368];
                        n3 -= e[369];
                        n3 += e[370];
                        n3 ^= e[371];
                        n3 += e[372];
                        n3 ^= e[373];
                        n3 -= e[374];
                        n3 += e[375];
                        n3 -= e[376];
                        n3 += e[377];
                        n3 ^= e[378];
                        n3 -= e[379];
                        n3 -= e[380];
                        cArray[i] = (char)(n3 -= e[381]);
                    }
                    object5 = a_0.A()[a_0.e[382]] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, e[383], e[384]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, e[385], byArray6.length);
            Object object6 = a_0.A()[e[386]];
            if (object6 == null) {
                char[] cArray = "\uf8f4\uf8f0\ufa1e\uf902\uf8ee\uf8ef\uf8ee\uf902\ufa25\uf8f6\uf8ee\ufa1e\uf900\ufa25\ufa14\ufa11\ufa11\ufa1c\ufa43\ufa1a".toCharArray();
                for (int i = e[387]; i < e[388]; ++i) {
                    int n4 = cArray[i];
                    n4 -= e[389];
                    n4 += e[390];
                    n4 ^= e[391];
                    n4 -= e[392];
                    n4 -= e[393];
                    n4 -= e[394];
                    n4 -= e[395];
                    n4 += e[396];
                    n4 += e[397];
                    cArray[i] = (char)(n4 += e[398]);
                }
                object6 = a_0.A()[a_0.e[399]] = new String(cArray);
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
        e = new int[0x75D2 ^ 0x7442];
        a_0.e[0xFB39 ^ 0xFB09] = 0xFB07 ^ 0xFB09;
        a_0.e[0xCEE3 ^ 0xCFB9] = 0xFFFF3044 ^ 0xCFB9;
        a_0.e[0xDE1C ^ 0xDF1E] = 0x7D21 ^ 0xDF1E;
        a_0.e[0x91EB ^ 0x9090] = 0x5FAE ^ 0x9090;
        a_0.e[0x5EA ^ 0x4A6] = 0x4FC ^ 0x4A6;
        a_0.e[0x870E ^ 0x8684] = 0xAA51 ^ 0x8684;
        a_0.e[0x1245 ^ 0x13C0] = 0xD460 ^ 0x13C0;
        a_0.e[0x7465 ^ 0x74A8] = 0x160E ^ 0x74A8;
        a_0.e[0x28BD ^ 0x28CE] = 0x2590 ^ 0x28CE;
        a_0.e[0x1042E ^ 0x10554] = 0x18F08 ^ 0x10554;
        a_0.e[0x1025E ^ 0x102E0] = 0xFFFE5270 ^ 0x102E0;
        a_0.e[0x10498 ^ 0x10582] = 0xFFFE899B ^ 0x10582;
        a_0.e[0x45DE ^ 0x459E] = 0xFFFFBA2A ^ 0x459E;
        a_0.e[0xA8F ^ 0xA4D] = 0xFA1B ^ 0xA4D;
        a_0.e[0x2286 ^ 0x2289] = 0x228A ^ 0x2289;
        a_0.e[0xCEF2 ^ 0xCFC1] = 0xCAA2 ^ 0xCFC1;
        a_0.e[0x6959 ^ 0x6869] = 0x6D06 ^ 0x6869;
        a_0.e[0xEB5A ^ 0xEA60] = 0xEA60 ^ 0xEA60;
        a_0.e[0xC631 ^ 0xC61B] = 0xFFFF3987 ^ 0xC61B;
        a_0.e[0xE12A ^ 0xE127] = 0xE125 ^ 0xE127;
        a_0.e[0xBA3 ^ 0xAAE] = 0x3B1A ^ 0xAAE;
        a_0.e[0xE7DA ^ 0xE6D4] = 0xD717 ^ 0xE6D4;
        a_0.e[0x6DAA ^ 0x6DC8] = 0x6DD9 ^ 0x6DC8;
        a_0.e[0x6046 ^ 0x6171] = 0x9BCD ^ 0x6171;
        a_0.e[0x1A3C ^ 0x1AA7] = 0x2BFC ^ 0x1AA7;
        a_0.e[0xC305 ^ 0xC252] = 0xC255 ^ 0xC252;
        a_0.e[0x2F87 ^ 0x2FFF] = 0xEC79 ^ 0x2FFF;
        a_0.e[0xC911 ^ 0xC956] = 0xC964 ^ 0xC956;
        a_0.e[0x10E75 ^ 0x10E5A] = 0xFFFEF184 ^ 0x10E5A;
        a_0.e[0x3220 ^ 0x3304] = 0x254D ^ 0x3304;
        a_0.e[0xF103 ^ 0xF14F] = 0xFFFF0E83 ^ 0xF14F;
        a_0.e[0x39D1 ^ 0x3971] = 0xA740 ^ 0x3971;
        a_0.e[0x459B ^ 0x449E] = 0x6DCB ^ 0x449E;
        a_0.e[0xD42C ^ 0xD4C1] = 0xD48 ^ 0xD4C1;
        a_0.e[0x7AA6 ^ 0x7BE2] = 0x172A ^ 0x7BE2;
        a_0.e[0xD5D2 ^ 0xD480] = 0xD4A5 ^ 0xD480;
        a_0.e[0x4939 ^ 0x49E1] = 0xAC9D ^ 0x49E1;
        a_0.e[0xF62D ^ 0xF60F] = 0x289D ^ 0xF60F;
        a_0.e[0x89B1 ^ 0x8946] = 0xBD7D ^ 0x8946;
        a_0.e[0xA821 ^ 0xA8E5] = 0x23FE ^ 0xA8E5;
        a_0.e[0x9B7A ^ 0x9BAD] = 0x7F94 ^ 0x9BAD;
        a_0.e[0xFC3B ^ 0xFC2C] = 0x7A2C ^ 0xFC2C;
        a_0.e[0x11BC ^ 0x10B3] = 0x2107 ^ 0x10B3;
        a_0.e[0xE6A4 ^ 0xE65C] = 0xC1C4 ^ 0xE65C;
        a_0.e[0xFF31 ^ 0xFE31] = 0x5C72 ^ 0xFE31;
        a_0.e[0x1024A ^ 0x1029F] = 0x1E6A6 ^ 0x1029F;
        a_0.e[0x102FE ^ 0x1027D] = 0xFFFE66F1 ^ 0x1027D;
        a_0.e[0x5ED1 ^ 0x5FDA] = 0xB966 ^ 0x5FDA;
        a_0.e[0xE58A ^ 0xE560] = 0xFFFFE7EC ^ 0xE560;
        a_0.e[0xFCCA ^ 0xFCFC] = 0xFCDA ^ 0xFCFC;
        a_0.e[0x4611 ^ 0x46F8] = 0xBBA9 ^ 0x46F8;
        a_0.e[0x2C62 ^ 0x2D68] = 0xFFFF3459 ^ 0x2D68;
        a_0.e[0x22CD ^ 0x2204] = 0x7212 ^ 0x2204;
        a_0.e[0x27CC ^ 0x27E8] = 0x40D1 ^ 0x27E8;
        a_0.e[0x606A ^ 0x60B0] = 0xFFFF7A42 ^ 0x60B0;
        a_0.e[0x117C ^ 0x11FA] = 0x40E0 ^ 0x11FA;
        a_0.e[0xB69E ^ 0xB629] = 0xBA43 ^ 0xB629;
        a_0.e[0x954 ^ 0x960] = 0x95C ^ 0x960;
        a_0.e[0x601F ^ 0x6100] = 0xEEA9 ^ 0x6100;
        a_0.e[0x319E ^ 0x3142] = 0xDA16 ^ 0x3142;
        a_0.e[0x414F ^ 0x4135] = 0x42EC ^ 0x4135;
        a_0.e[0x2665 ^ 0x26C4] = 0x3F8A ^ 0x26C4;
        a_0.e[0x5431 ^ 0x542F] = 0x460 ^ 0x542F;
        a_0.e[0x814B ^ 0x8147] = 0xFFFF7EE0 ^ 0x8147;
        a_0.e[0xD9A0 ^ 0xD953] = 0x4CDB ^ 0xD953;
        a_0.e[0x9E7 ^ 0x9BA] = 0x9E1 ^ 0x9BA;
        a_0.e[0x8190 ^ 0x8101] = 0x3C32 ^ 0x8101;
        a_0.e[0xC4B0 ^ 0xC498] = 0xFFFF3B01 ^ 0xC498;
        a_0.e[0x7F9B ^ 0x7FED] = 0xBC6B ^ 0x7FED;
        a_0.e[0x4701 ^ 0x47C9] = 0x17C1 ^ 0x47C9;
        a_0.e[0xB7C9 ^ 0xB7AD] = 0xB782 ^ 0xB7AD;
        a_0.e[0xE090 ^ 0xE06F] = 0x175D ^ 0xE06F;
        a_0.e[0xC8F1 ^ 0xC8E0] = 0xC8E1 ^ 0xC8E0;
        a_0.e[0xCDC7 ^ 0xCDBC] = 0xCE17 ^ 0xCDBC;
        a_0.e[0xA7D2 ^ 0xA6F5] = 0xB0BC ^ 0xA6F5;
        a_0.e[0x1900 ^ 0x198D] = 0x11768 ^ 0x198D;
        a_0.e[0x91A2 ^ 0x90BA] = 0xE304 ^ 0x90BA;
        a_0.e[0xBCCB ^ 0xBC5E] = 0x8507 ^ 0xBC5E;
        a_0.e[0x7BAE ^ 0x7A92] = 0x7A92 ^ 0x7A92;
        a_0.e[0xF9EF ^ 0xF930] = 0x1269 ^ 0xF930;
        a_0.e[0xAA6D ^ 0xAAF5] = 0x93A0 ^ 0xAAF5;
        a_0.e[0x8ED2 ^ 0x8E37] = 0xCF53 ^ 0x8E37;
        a_0.e[0xA854 ^ 0xA823] = 0x6B86 ^ 0xA823;
        a_0.e[0x6763 ^ 0x6670] = 0x2B58 ^ 0x6670;
        a_0.e[0xAF39 ^ 0xAE40] = 0xB69B ^ 0xAE40;
        a_0.e[0x9A47 ^ 0x9B3B] = 0x7A24 ^ 0x9B3B;
        a_0.e[0xAB48 ^ 0xAACE] = 0x9DDC ^ 0xAACE;
        a_0.e[0x48D9 ^ 0x48EE] = 0xFFFFB728 ^ 0x48EE;
        a_0.e[0xDB7 ^ 0xDDA] = 0xDDB ^ 0xDDA;
        a_0.e[0x10EC ^ 0x1048] = 0x90B ^ 0x1048;
        a_0.e[0x2B19 ^ 0x2B56] = 0x2B35 ^ 0x2B56;
        a_0.e[0xDD60 ^ 0xDDD4] = 0x437C ^ 0xDDD4;
        a_0.e[0xB8DF ^ 0xB9BF] = 0xB9F1 ^ 0xB9BF;
        a_0.e[0x45FB ^ 0x452F] = 0xA111 ^ 0x452F;
        a_0.e[0x383 ^ 0x308] = 0xFFFF2A0F ^ 0x308;
        a_0.e[0x967 ^ 0x989] = 0xFFFF2F96 ^ 0x989;
        a_0.e[0x10B2F ^ 0x10BF1] = 0xFFFE1F10 ^ 0x10BF1;
        a_0.e[0xEDD6 ^ 0xEDD1] = 0xED88 ^ 0xEDD1;
        a_0.e[0x7100 ^ 0x71BC] = 0xDEE9 ^ 0x71BC;
        a_0.e[0x6246 ^ 0x6297] = 0x9E1E ^ 0x6297;
        a_0.e[0x7947 ^ 0x7913] = 0x790C ^ 0x7913;
        a_0.e[0xF849 ^ 0xF8A9] = 0x5528 ^ 0xF8A9;
        a_0.e[0x7289 ^ 0x729C] = 0x729C ^ 0x729C;
        a_0.e[0x770C ^ 0x7783] = 0xFFFE86AD ^ 0x7783;
        a_0.e[0xE578 ^ 0xE4F8] = 0xE4E8 ^ 0xE4F8;
        a_0.e[0xB037 ^ 0xB0DF] = 0x4D9C ^ 0xB0DF;
        a_0.e[0x2271 ^ 0x225D] = 0xFFFFDDE2 ^ 0x225D;
        a_0.e[0x40C ^ 0x49E] = 0xB9AE ^ 0x49E;
        a_0.e[0xB859 ^ 0xB877] = 0xB827 ^ 0xB877;
        a_0.e[0xF3F2 ^ 0xF271] = 0xF271 ^ 0xF271;
        a_0.e[0x68B6 ^ 0x68F8] = 0xFFFF9751 ^ 0x68F8;
        a_0.e[0x8633 ^ 0x868A] = 0x1857D ^ 0x868A;
        a_0.e[0x4246 ^ 0x42EA] = 0xF28C ^ 0x42EA;
        a_0.e[0xBF12 ^ 0xBF4C] = 0xBF46 ^ 0xBF4C;
        a_0.e[0xB59F ^ 0xB5F7] = 0xB5BC ^ 0xB5F7;
        a_0.e[0x44C ^ 0x571] = 0x563 ^ 0x571;
        a_0.e[0xD0A3 ^ 0xD037] = 0x6D07 ^ 0xD037;
        a_0.e[0x1377 ^ 0x1393] = 0x52F2 ^ 0x1393;
        a_0.e[0x108CF ^ 0x109BE] = 0x1233A ^ 0x109BE;
        a_0.e[0xD740 ^ 0xD623] = 0xD627 ^ 0xD623;
        a_0.e[0xD51 ^ 0xC7E] = 0x22F6 ^ 0xC7E;
        a_0.e[0xAB52 ^ 0xABB3] = 0x622 ^ 0xABB3;
        a_0.e[0x6B12 ^ 0x6B20] = 0x6B4A ^ 0x6B20;
        a_0.e[0xC3DD ^ 0xC3C4] = 0x59C0 ^ 0xC3C4;
        a_0.e[0xBB43 ^ 0xBA09] = 0xBA19 ^ 0xBA09;
        a_0.e[0x7507 ^ 0x750E] = 0x751E ^ 0x750E;
        a_0.e[0x10897 ^ 0x1081B] = 0x1DEF3 ^ 0x1081B;
        a_0.e[0x17B1 ^ 0x1796] = 0x1796 ^ 0x1796;
        a_0.e[0xB02E ^ 0xB0DA] = 0x84F5 ^ 0xB0DA;
        a_0.e[0xF035 ^ 0xF074] = 0xFFFF0FCE ^ 0xF074;
        a_0.e[0xB31 ^ 0xA30] = 0xA862 ^ 0xA30;
        a_0.e[0x79E6 ^ 0x7895] = 0xE5B2 ^ 0x7895;
        a_0.e[0x4BAA ^ 0x4BF0] = 0xFFFFB453 ^ 0x4BF0;
        a_0.e[0xC6BB ^ 0xC7FC] = 0x8BE7 ^ 0xC7FC;
        a_0.e[0xFEBE ^ 0xFE16] = 0x417F ^ 0xFE16;
        a_0.e[0x434E ^ 0x43F1] = 0xECBF ^ 0x43F1;
        a_0.e[0x1010A ^ 0x1006B] = 0x1006D ^ 0x1006B;
        a_0.e[0x3578 ^ 0x343A] = 0x955F ^ 0x343A;
        a_0.e[0x8A7B ^ 0x8B32] = 0x8B33 ^ 0x8B32;
        a_0.e[0x9807 ^ 0x996C] = 0x9962 ^ 0x996C;
        a_0.e[0xEA00 ^ 0xEA6B] = 0xEA33 ^ 0xEA6B;
        a_0.e[0x4D4B ^ 0x4D14] = 0xFFFFB299 ^ 0x4D14;
        a_0.e[0xECE1 ^ 0xEC0A] = 0x115B ^ 0xEC0A;
        a_0.e[0x825C ^ 0x8205] = 0xFFFF7DE6 ^ 0x8205;
        a_0.e[0x1705 ^ 0x17A7] = 0xEE4 ^ 0x17A7;
        a_0.e[0x712E ^ 0x71DC] = 0xE445 ^ 0x71DC;
        a_0.e[0x10DB7 ^ 0x10D06] = 0x193AC ^ 0x10D06;
        a_0.e[0xFE86 ^ 0xFFF6] = 0x2736 ^ 0xFFF6;
        a_0.e[0x16BD ^ 0x16A7] = 0x1A43 ^ 0x16A7;
        a_0.e[0xB66C ^ 0xB6C5] = 0x6A6 ^ 0xB6C5;
        a_0.e[0xB5F4 ^ 0xB531] = 0x3E3F ^ 0xB531;
        a_0.e[0xDF16 ^ 0xDFBC] = 0x6FDA ^ 0xDFBC;
        a_0.e[0xF393 ^ 0xF212] = 0xF202 ^ 0xF212;
        a_0.e[0x3FD1 ^ 0x3FEA] = 0xFFFFC036 ^ 0x3FEA;
        a_0.e[0xD943 ^ 0xD875] = 0x22E4 ^ 0xD875;
        a_0.e[0x4B28 ^ 0x4B48] = 0xFFFFB4FF ^ 0x4B48;
        a_0.e[0xF50D ^ 0xF484] = 0xB3D1 ^ 0xF484;
        a_0.e[0x10620 ^ 0x1075F] = 0x1075F ^ 0x1075F;
        a_0.e[0xDF1C ^ 0xDFE5] = 0xF872 ^ 0xDFE5;
        a_0.e[0xC0D5 ^ 0xC1AD] = 0x69F6 ^ 0xC1AD;
        a_0.e[0x198B ^ 0x18EC] = 0x18E5 ^ 0x18EC;
        a_0.e[0x7E7C ^ 0x7E41] = 0x7EC6 ^ 0x7E41;
        a_0.e[0xC591 ^ 0xC52C] = 0x6A62 ^ 0xC52C;
        a_0.e[0x9F9F ^ 0x9F11] = 0x191FA ^ 0x9F11;
        a_0.e[0xC13 ^ 0xC91] = 0x97CD ^ 0xC91;
        a_0.e[0xD8D4 ^ 0xD824] = 0x4DB1 ^ 0xD824;
        a_0.e[0x8A60 ^ 0x8B67] = 0xA232 ^ 0x8B67;
        a_0.e[0xFD71 ^ 0xFC18] = 0xFC17 ^ 0xFC18;
        a_0.e[0x3735 ^ 0x367A] = 0x3670 ^ 0x367A;
        a_0.e[0xAE21 ^ 0xAE74] = 0xFFFF51E3 ^ 0xAE74;
        a_0.e[0xDF0F ^ 0xDE0B] = 0xF741 ^ 0xDE0B;
        a_0.e[0x6D28 ^ 0x6D34] = 0xAC99 ^ 0x6D34;
        a_0.e[0x97C8 ^ 0x9783] = 0x978A ^ 0x9783;
        a_0.e[0x97E1 ^ 0x97C7] = 0x301B ^ 0x97C7;
        a_0.e[0xF4AA ^ 0xF5F1] = 0xF5F1 ^ 0xF5F1;
        a_0.e[0xBDA0 ^ 0xBC8E] = 0x925E ^ 0xBC8E;
        a_0.e[0x45E1 ^ 0x4588] = 0x45F5 ^ 0x4588;
        a_0.e[0xEB58 ^ 0xEA67] = 0xE873 ^ 0xEA67;
        a_0.e[0x108E1 ^ 0x109B5] = 0xFFFEF60F ^ 0x109B5;
        a_0.e[0x828C ^ 0x8227] = 0x3243 ^ 0x8227;
        a_0.e[0xE921 ^ 0xE94B] = 0xE9DE ^ 0xE94B;
        a_0.e[0x10B0A ^ 0x10B3F] = 0xFFFEF481 ^ 0x10B3F;
        a_0.e[0x42EB ^ 0x423D] = 0xFFFF59BF ^ 0x423D;
        a_0.e[0x56EA ^ 0x57C9] = 0x810D ^ 0x57C9;
        a_0.e[0x497D ^ 0x4956] = 0xFFFFB6E6 ^ 0x4956;
        a_0.e[0x323A ^ 0x33B6] = 0xCE8F ^ 0x33B6;
        a_0.e[0x10331 ^ 0x10363] = 0x10369 ^ 0x10363;
        a_0.e[0x815B ^ 0x819C] = 0xA92 ^ 0x819C;
        a_0.e[0x5285 ^ 0x5298] = 0xD676 ^ 0x5298;
        a_0.e[0xCC00 ^ 0xCC53] = 0xFFFF3398 ^ 0xCC53;
        a_0.e[0x95F8 ^ 0x94F1] = 0x724D ^ 0x94F1;
        a_0.e[0x668A ^ 0x669C] = 0x66DC ^ 0x669C;
        a_0.e[0xCF34 ^ 0xCF70] = 0xCF40 ^ 0xCF70;
        a_0.e[0x311 ^ 0x37F] = 0x37D ^ 0x37F;
        a_0.e[0x4A9E ^ 0x4AE2] = 0x493B ^ 0x4AE2;
        a_0.e[0x8C2F ^ 0x8D0D] = 0x5B95 ^ 0x8D0D;
        a_0.e[0x79F1 ^ 0x7928] = 0x9C4C ^ 0x7928;
        a_0.e[0x6156 ^ 0x6146] = 0x6146 ^ 0x6146;
        a_0.e[0x8D4F ^ 0x8D92] = 0x66CB ^ 0x8D92;
        a_0.e[0xD0E9 ^ 0xD1B7] = 0xFFFF2E14 ^ 0xD1B7;
        a_0.e[0x7FB1 ^ 0x7ECC] = 0x8DB3 ^ 0x7ECC;
        a_0.e[0xFAF4 ^ 0xFB7F] = 0x29B8 ^ 0xFB7F;
        a_0.e[0xB0EB ^ 0xB1CD] = 0xA7C8 ^ 0xB1CD;
        a_0.e[0x6580 ^ 0x64FE] = 0x64FC ^ 0x64FE;
        a_0.e[0xF9DB ^ 0xF960] = 0x1FA97 ^ 0xF960;
        a_0.e[0xB5DC ^ 0xB512] = 0xD7DE ^ 0xB512;
        a_0.e[0x4809 ^ 0x48AC] = 0xF7C4 ^ 0x48AC;
        a_0.e[0xF18F ^ 0xF1F2] = 0xA33F ^ 0xF1F2;
        a_0.e[0xB65B ^ 0xB7D6] = 0xAA6B ^ 0xB7D6;
        a_0.e[0xF667 ^ 0xF636] = 0xFFFF09D4 ^ 0xF636;
        a_0.e[0x9D50 ^ 0x9C53] = 0x3E01 ^ 0x9C53;
        a_0.e[0x2F6E ^ 0x2E31] = 0x2E3C ^ 0x2E31;
        a_0.e[0x8D5C ^ 0x8C09] = 0x8C05 ^ 0x8C09;
        a_0.e[0x25D3 ^ 0x25BF] = 0xFFFFDA7B ^ 0x25BF;
        a_0.e[0x5C29 ^ 0x5D3D] = 0xF18B ^ 0x5D3D;
        a_0.e[0x7633 ^ 0x76B7] = 0xEDEB ^ 0x76B7;
        a_0.e[0x98BF ^ 0x99CA] = 0x45D8 ^ 0x99CA;
        a_0.e[0x7B5A ^ 0x7B96] = 0x192A ^ 0x7B96;
        a_0.e[0x3781 ^ 0x3689] = 0xD026 ^ 0x3689;
        a_0.e[0xB1F2 ^ 0xB1FC] = 0xFFFF4E79 ^ 0xB1FC;
        a_0.e[0x9AEA ^ 0x9AD6] = 0xFFFF656C ^ 0x9AD6;
        a_0.e[0x33EE ^ 0x32FB] = 0x9E45 ^ 0x32FB;
        a_0.e[0xFB12 ^ 0xFB84] = 0xC2D1 ^ 0xFB84;
        a_0.e[0x75FA ^ 0x74FC] = 0x5D8B ^ 0x74FC;
        a_0.e[0xF366 ^ 0xF225] = 0x9243 ^ 0xF225;
        a_0.e[0x838A ^ 0x82D6] = 0xFFFF7D7B ^ 0x82D6;
        a_0.e[0xAB61 ^ 0xABF6] = 0x92DA ^ 0xABF6;
        a_0.e[0x84AA ^ 0x85F3] = 0x85F2 ^ 0x85F3;
        a_0.e[0xF4A7 ^ 0xF5BC] = 0x860B ^ 0xF5BC;
        a_0.e[0xC902 ^ 0xC9A4] = 0x76CD ^ 0xC9A4;
        a_0.e[0x541A ^ 0x5442] = 0x5422 ^ 0x5442;
        a_0.e[0x19BF ^ 0x18C9] = 0xB09C ^ 0x18C9;
        a_0.e[0xA27D ^ 0xA245] = 0xFFFF5DEB ^ 0xA245;
        a_0.e[0x63B2 ^ 0x6391] = 0x5C47 ^ 0x6391;
        a_0.e[0x1087B ^ 0x10833] = 0x1080F ^ 0x10833;
        a_0.e[0x96FF ^ 0x961D] = 0xFFFFC404 ^ 0x961D;
        a_0.e[0x9A4 ^ 0x9E1] = 0x994 ^ 0x9E1;
        a_0.e[0xE267 ^ 0xE2D1] = 0xEE9B ^ 0xE2D1;
        a_0.e[0xEE9 ^ 0xE9C] = 0xCD10 ^ 0xE9C;
        a_0.e[0x1FBD ^ 0x1FCF] = 0x1FCF ^ 0x1FCF;
        a_0.e[0x2813 ^ 0x290A] = 0x5ABD ^ 0x290A;
        a_0.e[0x9D84 ^ 0x9CC4] = 0x9FF0 ^ 0x9CC4;
        a_0.e[0x1D1F ^ 0x1D9F] = 0x4F5D ^ 0x1D9F;
        a_0.e[0x6D5 ^ 0x6D1] = 0xFFFFF952 ^ 0x6D1;
        a_0.e[0xFBD5 ^ 0xFACB] = 0xFFFF8AD3 ^ 0xFACB;
        a_0.e[0x2789 ^ 0x275B] = 0xFFFF243E ^ 0x275B;
        a_0.e[0xB4FC ^ 0xB479] = 0xE567 ^ 0xB479;
        a_0.e[0x65F3 ^ 0x649C] = 0x649F ^ 0x649C;
        a_0.e[0x4F16 ^ 0x4E45] = 0x4E46 ^ 0x4E45;
        a_0.e[0x10BA1 ^ 0x10A93] = 0xFFFEF02F ^ 0x10A93;
        a_0.e[0xDA35 ^ 0xDA06] = 0xDA1C ^ 0xDA06;
        a_0.e[0x475D ^ 0x4714] = 0xFFFFB8A6 ^ 0x4714;
        a_0.e[0xD46A ^ 0xD460] = 0xFFFF2BD3 ^ 0xD460;
        a_0.e[0x80D4 ^ 0x80C6] = 0x80C6 ^ 0x80C6;
        a_0.e[0x7AC8 ^ 0x7BDF] = 0xD761 ^ 0x7BDF;
        a_0.e[0xC61B ^ 0xC64B] = 0xC62A ^ 0xC64B;
        a_0.e[0x15D6 ^ 0x1527] = 0x80AF ^ 0x1527;
        a_0.e[0x765B ^ 0x76A7] = 0x818C ^ 0x76A7;
        a_0.e[0x7A9D ^ 0x7BC0] = 0x7BCB ^ 0x7BC0;
        a_0.e[0xFD6 ^ 0xFB0] = 0xFFFFF076 ^ 0xFB0;
        a_0.e[0x61DB ^ 0x60CB] = 0x2DE9 ^ 0x60CB;
        a_0.e[0x88E7 ^ 0x8879] = 0x1648 ^ 0x8879;
        a_0.e[0x3D03 ^ 0x3D18] = 0x7570 ^ 0x3D18;
        a_0.e[0xE490 ^ 0xE419] = 0x32F9 ^ 0xE419;
        a_0.e[0xB545 ^ 0xB40E] = 0xB400 ^ 0xB40E;
        a_0.e[0xC2E9 ^ 0xC3A4] = 0xC3A6 ^ 0xC3A4;
        a_0.e[0x4CF1 ^ 0x4C6E] = 0xFFFF2DFD ^ 0x4C6E;
        a_0.e[0x4D16 ^ 0x4C7B] = 0x4C79 ^ 0x4C7B;
        a_0.e[0x1E9A ^ 0x1E91] = 0x1EAE ^ 0x1E91;
        a_0.e[0x598D ^ 0x58E8] = 0x58E0 ^ 0x58E8;
        a_0.e[0x380E ^ 0x38F5] = 0x1F62 ^ 0x38F5;
        a_0.e[0xCBA8 ^ 0xCA81] = 0x8578 ^ 0xCA81;
        a_0.e[0xE330 ^ 0xE2B7] = 0x3622 ^ 0xE2B7;
        a_0.e[0x83F1 ^ 0x83B2] = 0xFFFF7CC9 ^ 0x83B2;
        a_0.e[0xE49D ^ 0xE456] = 0xB440 ^ 0xE456;
        a_0.e[0xBE69 ^ 0xBE23] = 0xFFFF41B8 ^ 0xBE23;
        a_0.e[0x5202 ^ 0x5347] = 0x6A3F ^ 0x5347;
        a_0.e[0xDB48 ^ 0xDBFA] = 0x4552 ^ 0xDBFA;
        a_0.e[0x3E3 ^ 0x359] = 0x100B2 ^ 0x359;
        a_0.e[0x889D ^ 0x89EF] = 0x3F2A ^ 0x89EF;
        a_0.e[0xACDE ^ 0xADCC] = 0xFFFF1F58 ^ 0xADCC;
        a_0.e[0xBBD9 ^ 0xBBF9] = 0xFA28 ^ 0xBBF9;
        a_0.e[0x3FA1 ^ 0x3F90] = 0x3FC1 ^ 0x3F90;
        a_0.e[0x7DBE ^ 0x7D97] = 0xFFFF824A ^ 0x7D97;
        a_0.e[0xD74 ^ 0xC54] = 0xDA9B ^ 0xC54;
        a_0.e[0xDC94 ^ 0xDDDA] = 0xDDE1 ^ 0xDDDA;
        a_0.e[0x50CD ^ 0x5063] = 0x9ADF ^ 0x5063;
        a_0.e[0x52C6 ^ 0x52A9] = 0x52A9 ^ 0x52A9;
        a_0.e[0x9AF0 ^ 0x9BEC] = 0x1446 ^ 0x9BEC;
        a_0.e[0x5E50 ^ 0x5E8B] = 0xBBEF ^ 0x5E8B;
        a_0.e[0x8E03 ^ 0x8EFE] = 0x79CC ^ 0x8EFE;
        a_0.e[0xBDF4 ^ 0xBC83] = 0x58D6 ^ 0xBC83;
        a_0.e[0x9F88 ^ 0x9F49] = 0x6F12 ^ 0x9F49;
        a_0.e[0x953 ^ 0x911] = 0xFFFFF6CB ^ 0x911;
        a_0.e[0x90E6 ^ 0x918C] = 0x91FE ^ 0x918C;
        a_0.e[0x799 ^ 0x767] = 0xFFFF0F88 ^ 0x767;
        a_0.e[0xF8C6 ^ 0xF8F8] = 0xFFFF0757 ^ 0xF8F8;
        a_0.e[0xA63 ^ 0xB49] = 0xFFFFBB50 ^ 0xB49;
        a_0.e[0xEEF6 ^ 0xEED7] = 0x3C26 ^ 0xEED7;
        a_0.e[0x716E ^ 0x7111] = 0xFFFFDC3E ^ 0x7111;
        a_0.e[0xD97B ^ 0xD944] = 0xD952 ^ 0xD944;
        a_0.e[0xB329 ^ 0xB3B9] = 0x1BD52 ^ 0xB3B9;
        a_0.e[0xC7A7 ^ 0xC78A] = 0xC7A5 ^ 0xC78A;
        a_0.e[0xEF45 ^ 0xEF3C] = 0xECEC ^ 0xEF3C;
        a_0.e[0x85B ^ 0x838] = 0x806 ^ 0x838;
        a_0.e[0x2A4B ^ 0x2A4B] = 0xFFFFD5CF ^ 0x2A4B;
        a_0.e[0x6417 ^ 0x6411] = 0xFFFF9BFC ^ 0x6411;
        a_0.e[0xEB5E ^ 0xEAD1] = 0xEAD2 ^ 0xEAD1;
        a_0.e[0x7118 ^ 0x7033] = 0x3FCA ^ 0x7033;
        a_0.e[0x8F70 ^ 0x8E45] = 0x74F9 ^ 0x8E45;
        a_0.e[0x1375 ^ 0x1258] = 0x3CD0 ^ 0x1258;
        a_0.e[0x4300 ^ 0x4367] = 0xFFFFBCA8 ^ 0x4367;
        a_0.e[0x2008 ^ 0x2124] = 0xFBB ^ 0x2124;
        a_0.e[0x26D ^ 0x33B] = 0xFFFFFC8E ^ 0x33B;
        a_0.e[0xC18C ^ 0xC179] = 0xF542 ^ 0xC179;
        a_0.e[0xED9 ^ 0xF57] = 0x5BD9 ^ 0xF57;
        a_0.e[0x32C0 ^ 0x33D6] = 0x9F6E ^ 0x33D6;
        a_0.e[0xA2EA ^ 0xA29A] = 0xA29B ^ 0xA29A;
        a_0.e[0xE331 ^ 0xE389] = 0x1E068 ^ 0xE389;
        a_0.e[0xDB49 ^ 0xDB2C] = 0xDB45 ^ 0xDB2C;
        a_0.e[0x6B23 ^ 0x6A18] = 0x6A19 ^ 0x6A18;
        a_0.e[0x2E0F ^ 0x2F3E] = 0x2A5D ^ 0x2F3E;
        a_0.e[0xFBDF ^ 0xFB70] = 0xFFFFCE04 ^ 0xFB70;
        a_0.e[0xFA36 ^ 0xFA42] = 0xF70C ^ 0xFA42;
        a_0.e[0x6B80 ^ 0x6A91] = 0x27B9 ^ 0x6A91;
        a_0.e[0x3B86 ^ 0x3B7C] = 0x1CD4 ^ 0x3B7C;
        a_0.e[0x34C7 ^ 0x3586] = 0x11F3 ^ 0x3586;
        a_0.e[0x3E86 ^ 0x3E25] = 0x270D ^ 0x3E25;
        a_0.e[0xDAD9 ^ 0xDAFC] = 0x4046 ^ 0xDAFC;
        a_0.e[0xEAF3 ^ 0xEA69] = 0xDB56 ^ 0xEA69;
        a_0.e[0x180F ^ 0x187E] = 0x187F ^ 0x187E;
        a_0.e[0xE974 ^ 0xE825] = 0xE820 ^ 0xE825;
        a_0.e[0xB9B9 ^ 0xB9A6] = 0xBAC9 ^ 0xB9A6;
        a_0.e[0xC6B2 ^ 0xC615] = 0x7932 ^ 0xC615;
        a_0.e[0x2512 ^ 0x25D4] = 0xAEE6 ^ 0x25D4;
        a_0.e[0x61D3 ^ 0x60F6] = 0x76BF ^ 0x60F6;
        a_0.e[0xA8A ^ 0xA19] = 0xFFFF48FC ^ 0xA19;
        a_0.e[0x7BCD ^ 0x7BD5] = 0x9654 ^ 0x7BD5;
        a_0.e[0xF694 ^ 0xF624] = 0x3C98 ^ 0xF624;
        a_0.e[0x6003 ^ 0x611E] = 0xEEB7 ^ 0x611E;
        a_0.e[0x76B9 ^ 0x7655] = 0xAFD2 ^ 0x7655;
        a_0.e[0x60B6 ^ 0x6197] = 0xB753 ^ 0x6197;
        a_0.e[0x10A5C ^ 0x10A5F] = 0x10A00 ^ 0x10A5F;
        a_0.e[0xD ^ 0x40] = 0x43 ^ 0x40;
        a_0.e[0x10B50 ^ 0x10A38] = 0xFFFEF592 ^ 0x10A38;
        a_0.e[0x442C ^ 0x4424] = 0x4449 ^ 0x4424;
        a_0.e[0xEA70 ^ 0xEA86] = 0xFFFF2135 ^ 0xEA86;
        a_0.e[0x7D61 ^ 0x7DE0] = 0xE6B7 ^ 0x7DE0;
        a_0.e[0xA8DC ^ 0xA9B0] = 0xA8B0 ^ 0xA9B0;
        a_0.e[0x37CF ^ 0x36FB] = 0xCC45 ^ 0x36FB;
        a_0.e[0xFF31 ^ 0xFE19] = 0xB1FC ^ 0xFE19;
        a_0.e[0xBBB2 ^ 0xBB62] = 0x47EA ^ 0xBB62;
        a_0.e[0xF9C3 ^ 0xF99F] = 0xFFFF0678 ^ 0xF99F;
        a_0.e[0x9A68 ^ 0x9B20] = 0xAFEF ^ 0x9B20;
        a_0.e[0x4F1B ^ 0x4E4B] = 0xFFFFB1CA ^ 0x4E4B;
        a_0.e[0x8472 ^ 0x852A] = 0xFFFF7AD6 ^ 0x852A;
        a_0.e[0x5C0F ^ 0x5D7B] = 0x6170 ^ 0x5D7B;
        a_0.e[0x7857 ^ 0x7856] = 0xFFFF87AD ^ 0x7856;
        a_0.e[0x6424 ^ 0x6430] = 0x6430 ^ 0x6430;
        a_0.e[0xA6EB ^ 0xA6E9] = 0xFFFF596A ^ 0xA6E9;
        a_0.e[0x5FF8 ^ 0x5F72] = 0x899A ^ 0x5F72;
        a_0.e[0x3F93 ^ 0x3F53] = 0xCF0E ^ 0x3F53;
        a_0.e[0x9E87 ^ 0x9EDC] = 0x9E48 ^ 0x9EDC;
        a_0.e[0x13C8 ^ 0x132E] = 0x5255 ^ 0x132E;
        a_0.e[0x81E3 ^ 0x80DA] = 0x80DA ^ 0x80DA;
        a_0.e[0xD983 ^ 0xD94C] = 0xBBEA ^ 0xD94C;
        a_0.e[0xD425 ^ 0xD54B] = 0xD54B ^ 0xD54B;
        a_0.e[0xA3BB ^ 0xA354] = 0x7ADD ^ 0xA354;
        a_0.e[0xDFA6 ^ 0xDF9C] = 0xFFFF200B ^ 0xDF9C;
        a_0.e[0xF30E ^ 0xF3ED] = 0x5E7C ^ 0xF3ED;
        a_0.e[0xD0AB ^ 0xD068] = 0x2033 ^ 0xD068;
        a_0.e[0x6974 ^ 0x684A] = 0x4CB8 ^ 0x684A;
        a_0.e[0x95B5 ^ 0x9518] = 0x5FA4 ^ 0x9518;
        a_0.e[0x10A39 ^ 0x10A00] = 0xFFFEF5F8 ^ 0x10A00;
        a_0.e[0x529F ^ 0x529A] = 0xFFFFAD78 ^ 0x529A;
        a_0.e[0x7C82 ^ 0x7C37] = 0x7C37 ^ 0x7C37;
        a_0.e[0x10864 ^ 0x109E6] = 0x109E5 ^ 0x109E6;
        a_0.e[0x10EBF ^ 0x10E37] = 0x15F2D ^ 0x10E37;
        a_0.e[0x5CCC ^ 0x5C55] = 0x6D6C ^ 0x5C55;
        a_0.e[0x9B60 ^ 0x9A58] = 0x9A58 ^ 0x9A58;
        a_0.e[0xD550 ^ 0xD507] = 0xFFFF2AB6 ^ 0xD507;
        a_0.e[0x2899 ^ 0x2804] = 0xB632 ^ 0x2804;
        a_0.e[0xD845 ^ 0xD88F] = 0xFFFF770B ^ 0xD88F;
        a_0.e[0x6850 ^ 0x6806] = 0x6800 ^ 0x6806;
        a_0.e[0xD1B8 ^ 0xD16B] = 0x2DE2 ^ 0xD16B;
        a_0.e[0xEF1C ^ 0xEF9B] = 0xFFFF4148 ^ 0xEF9B;
        a_0.e[0xB6EC ^ 0xB7AA] = 0xCEA0 ^ 0xB7AA;
        a_0.e[0xAFDB ^ 0xAED7] = 0x9F67 ^ 0xAED7;
        a_0.e[0x8DDF ^ 0x8D99] = 0x8DE7 ^ 0x8D99;
        a_0.e[0xA1E3 ^ 0xA085] = 0xA0D3 ^ 0xA085;
        a_0.e[0xE852 ^ 0xE9D6] = 0xE9C2 ^ 0xE9D6;
        a_0.e[0xAE4B ^ 0xAEAC] = 0xEFC8 ^ 0xAEAC;
        a_0.e[0xE9FA ^ 0xE898] = 0xFFFF170E ^ 0xE898;
        a_0.e[0x862B ^ 0x8655] = 0xD497 ^ 0x8655;
        a_0.e[0x9A25 ^ 0x9AB9] = 0xAB86 ^ 0x9AB9;
        a_0.e[0xA12D ^ 0xA14C] = 0xA163 ^ 0xA14C;
        a_0.e[0x9E83 ^ 0x9F0B] = 0x7A4E ^ 0x9F0B;
        a_0.e[0x4966 ^ 0x49D5] = 0xD731 ^ 0x49D5;
        a_0.e[0x8FE ^ 0x8ED] = 0x8EF ^ 0x8ED;
        a_0.e[0x431E ^ 0x427A] = 0x421E ^ 0x427A;
    }
}

