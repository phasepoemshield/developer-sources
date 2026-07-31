/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.builder;

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
import kotakbaz.rain.client.render.texture.loader.d_0;
import kotakbaz.rain.client.render.texture.texture.A;
import kotakbaz.rain.client.render.texture.texture.B;
import kotakbaz.rain.client.render.texture.texture.b_0;

/*
 * Renamed from kotakbaz.rain.client.render.texture.builder.a
 */
public class a_0<T> {
    private String a = null;
    private T A = null;
    private final d_0<T> b;
    private B B = kotakbaz.rain.client.render.texture.texture.B.A;
    private A c = null;
    private b_0 C = null;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    public a_0(d_0<T> d_02) {
        super();
        this.b = d_02;
    }

    public a_0<T> name(String string) {
        this.a = string;
        return this;
    }

    public a_0<T> path(T t2) {
        this.A = t2;
        return this;
    }

    public a_0<T> colorMode(B b2) {
        this.B = b2;
        return this;
    }

    public a_0<T> filtering(A a2) {
        this.c = a2;
        return this;
    }

    public a_0<T> wrapping(b_0 b_02) {
        this.C = b_02;
        return this;
    }

    public kotakbaz.rain.client.render.texture.texture.a_0 build() {
        try {
            this.checkArguments();
            return kotakbaz.rain.client.render.texture.texture.a_0.of(this.a, this.b.load(this.A, this.B, this.c, this.C));
        }
        catch (Exception exception) {
            throw new UnsupportedOperationException(exception);
        }
    }

    private void checkArguments() {
        if (this.a == null) {
            int n = F[0];
            n ^= F[1];
            int n2 = F[3];
            n2 += F[4];
            throw new IllegalArgumentException((String)d[n ^= F[2]] + (String)d[n2 ^= F[5]]);
        }
        if (this.b == null) {
            int n = F[6];
            n -= F[7];
            n ^= F[8];
            int n3 = F[9];
            n3 += F[10];
            n3 -= F[11];
            int n4 = F[12];
            n4 -= F[13];
            Object[] objectArray = new Object[n4 ^= F[14]];
            int n5 = F[15];
            n5 += F[16];
            objectArray[n5 ^= a_0.F[17]] = this.a;
            throw new IllegalArgumentException(String.format((String)d[n] + (String)d[n3], objectArray));
        }
        if (this.A == null) {
            int n = F[18];
            n -= F[19];
            n += F[20];
            int n6 = F[21];
            n6 -= F[22];
            n6 += F[23];
            int n7 = F[24];
            n7 ^= F[25];
            Object[] objectArray = new Object[n7 += F[26]];
            int n8 = F[27];
            n8 -= F[28];
            objectArray[n8 ^= a_0.F[29]] = this.a;
            throw new IllegalArgumentException(String.format((String)d[n] + (String)d[n6], objectArray));
        }
        if (this.B == null) {
            int n = F[30];
            n -= F[31];
            n -= F[32];
            int n9 = F[33];
            n9 -= F[34];
            n9 += F[35];
            int n10 = F[36];
            n10 -= F[37];
            Object[] objectArray = new Object[n10 += F[38]];
            int n11 = F[39];
            n11 -= F[40];
            objectArray[n11 -= a_0.F[41]] = this.a;
            throw new IllegalArgumentException(String.format((String)d[n] + (String)d[n9], objectArray));
        }
        if (this.c == null) {
            int n = F[42];
            n += F[43];
            n += F[44];
            int n12 = F[45];
            n12 += F[46];
            n12 -= F[47];
            int n13 = F[48];
            n13 -= F[49];
            Object[] objectArray = new Object[n13 ^= F[50]];
            int n14 = F[51];
            n14 += F[52];
            objectArray[n14 += a_0.F[53]] = this.a;
            throw new IllegalArgumentException(String.format((String)d[n] + (String)d[n12], objectArray));
        }
        if (this.C == null) {
            int n = F[54];
            n -= F[55];
            n -= F[56];
            int n15 = F[57];
            n15 -= F[58];
            n15 += F[59];
            int n16 = F[60];
            n16 += F[61];
            Object[] objectArray = new Object[n16 += F[62]];
            int n17 = F[63];
            n17 += F[64];
            objectArray[n17 -= a_0.F[65]] = this.a;
            throw new IllegalArgumentException(String.format((String)d[n] + (String)d[n15], objectArray));
        }
    }

    static {
        a_0.b();
        long l = -555816342496475432L;
        long l2 = 6503704867556041729L;
        long l3 = -7479501512336160737L;
        long l4 = -3330133798454354281L;
        long l5 = 6164215994034227166L;
        long l6 = -3467025168018647272L;
        long l7 = 1368203849782939553L;
        long l8 = -243395502554101382L;
        long l9 = 3047459886097927917L;
        long l10 = -1896484729571523850L;
        long l11 = -5418923585732165848L;
        long l12 = -8952249823806707422L;
        long l13 = 1846237740832608984L;
        long l14 = -4681092503447134658L;
        int n = F[66];
        n += F[67];
        d = new Object[n ^= F[68]];
        long l15 = l14;
        int n2 = F[69];
        n2 += F[70];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= F[71]);
        Object[] objectArray = new Object[F[72]];
        objectArray[a_0.F[73]] = D;
        objectArray[a_0.F[74]] = F[75];
        int n3 = F[76];
        Object object = a_0.A()[F[77]];
        if (object == null) {
            char[] cArray = "\ude95\ude7e\ude35\ude86\ude27\ude28\udec1\ude87\udedc\ude3b\udedd\uded7\ude04\ude28\uded0\ude3f\uded8\ude36\ud14e\ude05\ude22\ude04\ude28\ude03\ude1f\udefc\udecf\udeda\udedb\ud14e\ude1f\ude35\ude3a\ude35\udefd\ude3f\uded8\ud155\ude2f\ude2e\ude31\udecf\ude3a\udef1\udedc\ude27\ude3c\uded6\ude3f\ude87\ude24\ude05\ude1f\ude3a\udefc\udef9\ude1f\ude3d\udecc\uded7\udefc\ude36\uded7\ude86\udef9\ude26\uded0\udef0\ude27\ude3a\ude87\ude3b\udef1\ude87\ude88\ude24\ude05\udef1\ude05\uded0\ude8e\uded1\udec1\ud148\ude8e\ude39\ude25\udedc\ude38\udec1\ude28\udedb\ude23\udefc\ude2f\ude95\uded7\udefb\ude24\uded9\ude3b\udedb\ud14e\ude3f\ude22\ude2a\uded6\uded8\udefa\ude87\uded1\ude03\udeda\udefb\ude2b\ude35\ude3a\ud148\ude26\ud147\ude2c\udefd\ude23\ude25\ude88\udefc\udeef\udecf\udecb\udedc\ude3a\ude39\udec1\udeca\udefd\ude1e\ude2a\ude3f\ude3f\udefb\ude8e\ude22\uded7\ude2a\ude95\ude04\ude23\udef9\ude26\ude04\udefd\udecb\udefb\udef0\ude27\ude26\ude38\uded8\ude95\ude87\ude05\ud148\udef1\ude2e\ude26\ude05\ude36\udeda\ude36\ude2e\ude88\ude04\ud148\ude2c\ude36\ude02\ude25\ude38\ude30\uded7\udef0\ude25\udecb\ude05\ud147\ude31\udeca\ude1e\uded9\uded1\udefd\ude2e\ud14e\ude86\ude1e\ude2b\ude2b\udecb\ude3f\ude25\ude3a\ude1e\udeca\ude2b\ude2f\udefb\udefc\ude21\udeda\ud147\udef0\ude37\udef9\ude3d\ude86\ud147\ude25\ude22\udeef\ude3f\udecc\ude8e\ude1f\ude87\ude95\udecb\ude2c\uded9\ude87\ude28\ude8e\ude3b\ude38\udecc\ud147\ud147\ude88\udef1\ude87\ude86\udec1\uded6\ude02\ude02\ude30\udedb\ude1f\uded7\udecf\udeca\ud147\ude37\ude3f\udeda\ude2a\uded1\udecb\udedb\uded6\uded6\ude21\ude04\ude03\ud148\uded6\ude3f\ude25\udeef\udedd\ude8e\ude87\uded0\ud14e\udeca\ude27\udedb\uded0\ude3c\udef0\ude02\ude26\ude87\udeda\udec1\ude05\ude3d\ude2b\uded8\ude25\ude86\ude27\ude3d\ude22\udefb\ude88\ude05\ude35\ude30\ude24\udeca\uded0\udec1\ud14e\ude86\udeef\ude26\uded9\udecc\uded8\uded1\udefd\ude25\udedb\udedd\ude3c\udef1\udefb\ude21\ude05\udef1\ude31\ude1f\ude1f\ude3d\ude86\ude1e\ude1f\ude24\ude2b\udeca\udeca\udedc\ude05\ude3b\uded7\udeef\udecc\udefd\ude2c\ude26\ude3a\udecc\ude2e\ud14e\ude37\ude22\ude24\udef1\ud147\ude28\ude27\ud14e\udecc\ude27\udedd\ude86\ud14e\udef1\udefb\ude2e\ude37\ude7e\ude23\ud153".toCharArray();
            for (int i = F[78]; i < F[79]; ++i) {
                int n4 = cArray[i];
                n4 ^= F[80];
                n4 += F[81];
                n4 ^= F[82];
                n4 -= F[83];
                n4 += F[84];
                n4 += F[85];
                n4 -= F[86];
                n4 -= F[87];
                n4 -= F[88];
                n4 -= F[89];
                n4 ^= F[90];
                n4 -= F[91];
                n4 -= F[92];
                n4 -= F[93];
                n4 -= F[94];
                cArray[i] = (char)(n4 ^= F[95]);
            }
            object = a_0.A()[a_0.F[96]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = F[97];
        n5 ^= F[98];
        l5 = l16 ^ (0xFE00000000L ^ l16) & -1L << (n5 += F[99]);
        long l17 = l12;
        int n6 = F[100];
        n6 -= F[101];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= F[102]);
        while (true) {
            int n7 = F[103];
            n7 -= F[104];
            if ((int)l12 >= (int)(l5 >>> (n7 -= F[105]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = F[106];
            n9 -= F[107];
            int n10 = F[109];
            n10 += F[110];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= F[108])) & -1L >>> (n10 += F[111]);
            long l19 = l8;
            int n11 = F[112];
            n11 ^= F[113];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= F[114]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = F[115];
            n13 -= F[116];
            int n14 = F[118];
            n14 ^= F[119];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += F[117])) & -1L >>> (n14 ^= F[120]);
            int n15 = F[121];
            n15 ^= F[122];
            long l21 = l9;
            int n16 = F[124];
            n16 ^= F[125];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += F[123]) ^ l21) & -1L << (n16 ^= F[126]);
            int n17 = F[127];
            n17 ^= F[128];
            n17 -= F[129];
            int n18 = F[130];
            n18 ^= F[131];
            long l22 = l11;
            int n19 = F[133];
            n19 -= F[134];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += F[132]))) ^ l22) & -1L >>> (n19 += F[135]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = F[136];
            n20 += F[137];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= F[138]);
            while (true) {
                int n21 = F[139];
                n21 ^= F[140];
                if ((int)(l13 >>> (n21 ^= F[141])) >= (int)l11) break;
                int n22 = F[142];
                n22 ^= F[143];
                int n23 = F[145];
                n23 ^= F[146];
                cArray2[(int)(l13 >>> (n22 ^= a_0.F[144]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= F[147]))];
                l13 += 0x100000000L;
            }
            int n24 = F[148];
            n24 += F[149];
            int n25 = (int)(l14 >>> (n24 -= F[150]));
            l14 += 0x100000000L;
            a_0.d[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = F[151];
            n26 -= F[152];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= F[153]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[F[154]];
        String string = (String)object[F[155]];
        object = object[F[156]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[157]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[158]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[160] ^ F[161]];
                byArray[a_0.F[162] ^ a_0.F[163]] = F[164] ^ F[165];
                byArray[a_0.F[166] ^ a_0.F[167]] = F[168] ^ F[169];
                byArray[a_0.F[170] ^ a_0.F[171]] = F[172] ^ F[173];
                byArray[a_0.F[174] ^ a_0.F[175]] = F[176] ^ F[177];
                byArray[a_0.F[178] ^ a_0.F[179]] = F[180] ^ F[181];
                byArray[a_0.F[182] ^ a_0.F[183]] = F[184] ^ F[185];
                byArray[a_0.F[186] ^ a_0.F[187]] = F[188] ^ F[189];
                byArray[a_0.F[190] ^ a_0.F[191]] = F[192] ^ F[193];
                byArray[a_0.F[194] ^ a_0.F[195]] = F[196] ^ F[197];
                byArray[a_0.F[198] ^ a_0.F[199]] = F[200] ^ F[201];
                byArray[a_0.F[202] ^ a_0.F[203]] = F[204] ^ F[205];
                byArray[a_0.F[206] ^ a_0.F[207]] = F[208] ^ F[209];
                byArray[a_0.F[210] ^ a_0.F[211]] = F[212] ^ F[213];
                byArray[a_0.F[214] ^ a_0.F[215]] = F[216] ^ F[217];
                byArray[a_0.F[218] ^ a_0.F[219]] = F[220] ^ F[221];
                byArray[a_0.F[222] ^ a_0.F[223]] = F[224] ^ F[225];
                objectArray2[a_0.F[159]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[226]];
            if (e == null) {
                byte[] byArray2 = new byte[F[227] ^ F[228]];
                byArray2[a_0.F[229] ^ a_0.F[230]] = F[231] ^ F[232];
                byArray2[a_0.F[233] ^ a_0.F[234]] = F[235] ^ F[236];
                byArray2[a_0.F[237] ^ a_0.F[238]] = F[239] ^ F[240];
                byArray2[a_0.F[241] ^ a_0.F[242]] = F[243] ^ F[244];
                byArray2[a_0.F[245] ^ a_0.F[246]] = F[247] ^ F[248];
                byArray2[a_0.F[249] ^ a_0.F[250]] = F[251] ^ F[252];
                byArray2[a_0.F[253] ^ a_0.F[254]] = F[255] ^ F[256];
                byArray2[a_0.F[257] ^ a_0.F[258]] = F[259] ^ F[260];
                byArray2[a_0.F[261] ^ a_0.F[262]] = F[263] ^ F[264];
                byArray2[a_0.F[265] ^ a_0.F[266]] = F[267] ^ F[268];
                byArray2[a_0.F[269] ^ a_0.F[270]] = F[271] ^ F[272];
                byArray2[a_0.F[273] ^ a_0.F[274]] = F[275] ^ F[276];
                byArray2[a_0.F[277] ^ a_0.F[278]] = F[279] ^ F[280];
                byArray2[a_0.F[281] ^ a_0.F[282]] = F[283] ^ F[284];
                byArray2[a_0.F[285] ^ a_0.F[286]] = F[287] ^ F[288];
                byArray2[a_0.F[289] ^ a_0.F[290]] = F[291] ^ F[292];
                byArray2[a_0.F[293] ^ a_0.F[294]] = F[295] ^ F[296];
                byArray2[a_0.F[297] ^ a_0.F[298]] = F[299] ^ F[300];
                byArray2[a_0.F[301] ^ a_0.F[302]] = F[303] ^ F[304];
                byArray2[a_0.F[305] ^ a_0.F[306]] = F[307] ^ F[308];
                byArray2[a_0.F[309] ^ a_0.F[310]] = F[311] ^ F[312];
                byArray2[a_0.F[313] ^ a_0.F[314]] = F[315] ^ F[316];
                byArray2[a_0.F[317] ^ a_0.F[318]] = F[319] ^ F[320];
                byArray2[a_0.F[321] ^ a_0.F[322]] = F[323] ^ F[324];
                byArray2[a_0.F[325] ^ a_0.F[326]] = F[327] ^ F[328];
                byArray2[a_0.F[329] ^ a_0.F[330]] = F[331] ^ F[332];
                byArray2[a_0.F[333] ^ a_0.F[334]] = F[335] ^ F[336];
                byArray2[a_0.F[337] ^ a_0.F[338]] = F[339] ^ F[340];
                byArray2[a_0.F[341] ^ a_0.F[342]] = F[343] ^ F[344];
                byArray2[a_0.F[345] ^ a_0.F[346]] = F[347] ^ F[348];
                byArray2[a_0.F[349] ^ a_0.F[350]] = F[351] ^ F[352];
                byArray2[a_0.F[353] ^ a_0.F[354]] = F[355] ^ F[356];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, F[357], byArray3, F[358], byArray.length);
                System.arraycopy(byArray2, F[359], byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[F[360]];
                if (object4 == null) {
                    char[] cArray = "\uaea9\uaeaf\uaeb4\uaead\uaea3\ubbdf\uaeb0\uaf96\uaf9d\uaf81\uaea1\uaf8a\uaf8e\uaf8c\uaebc\uaea1\uaeae\ubbde".toCharArray();
                    for (int i = F[361]; i < F[362]; ++i) {
                        int n2 = cArray[i];
                        n2 ^= F[363];
                        n2 += F[364];
                        n2 -= F[365];
                        n2 += F[366];
                        n2 -= F[367];
                        n2 += F[368];
                        n2 -= F[369];
                        n2 -= F[370];
                        n2 ^= F[371];
                        n2 -= F[372];
                        n2 += F[373];
                        n2 += F[374];
                        n2 ^= F[375];
                        cArray[i] = (char)(n2 += F[376]);
                    }
                    object4 = a_0.A()[a_0.F[377]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[F[378]];
                byArray4[a_0.F[379]] = F[380];
                byArray4[a_0.F[381]] = F[382];
                byArray4[a_0.F[383]] = F[384];
                byArray4[a_0.F[385]] = F[386];
                byArray4[a_0.F[387]] = F[388];
                byArray4[a_0.F[389]] = F[390];
                byArray4[a_0.F[391]] = F[392];
                byArray4[a_0.F[393]] = F[394];
                byArray4[a_0.F[395]] = F[396];
                byArray4[a_0.F[397]] = F[398];
                byArray4[a_0.F[399]] = 118;
                byArray4[12] = 65;
                byArray4[6] = -86;
                byArray4[9] = 22;
                byArray4[0] = -14;
                byArray4[2] = -12;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 16, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u2a34\u2a30\u2a42".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 += 9168;
                        n3 += 4176;
                        n3 -= 55121;
                        n3 -= 14324;
                        n3 ^= 0xC635;
                        n3 ^= 0xB455;
                        n3 += 63527;
                        n3 += 20599;
                        n3 ^= 0x6D68;
                        n3 += 44716;
                        n3 += 28989;
                        cArray[i] = (char)(n3 ^= 0xB0F);
                    }
                    object5 = a_0.A()[2] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = a_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\ue17b\ue247\ue241\ue225\ue231\ue230\ue231\ue225\ue20a\ue1d9\ue231\ue241\ue177\ue20a\ue1db\ue226\ue226\uf5e3\uf5e4\ue1dd".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 11522;
                    n4 -= 33157;
                    n4 += 60581;
                    n4 += 54599;
                    n4 ^= 0xBBC7;
                    n4 -= 63304;
                    n4 ^= 0x95A8;
                    n4 += 52649;
                    n4 += 36490;
                    n4 ^= 0x4C6B;
                    n4 -= 25364;
                    n4 ^= 0xF599;
                    n4 += 1306;
                    cArray[i] = (char)(n4 ^= 0xD57B);
                }
                object6 = a_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)e), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = f;
        if (f == null) {
            f = new Object[4];
            objectArray = f;
        }
        return objectArray;
    }

    public static void b() {
        F = new int[0x2A9E ^ 0x2B0E];
        a_0.F[0x71E9 ^ 0x70D8] = 0x3032 ^ 0x70D8;
        a_0.F[0xDECE ^ 0xDEE7] = 0xFFFF2127 ^ 0xDEE7;
        a_0.F[0xD95B ^ 0xD805] = 0x3011 ^ 0xD805;
        a_0.F[0x10E24 ^ 0x10E6B] = 0x10F07 ^ 0x10E6B;
        a_0.F[0x99EC ^ 0x99CB] = 0xFFFF6673 ^ 0x99CB;
        a_0.F[0x9C6C ^ 0x9CB2] = 0xB0AC ^ 0x9CB2;
        a_0.F[0x1730 ^ 0x178B] = 0x23B7 ^ 0x178B;
        a_0.F[0xDD69 ^ 0xDD36] = 0xB90C ^ 0xDD36;
        a_0.F[0x92CA ^ 0x9291] = 0x1E85 ^ 0x9291;
        a_0.F[0xFA20 ^ 0xFA4F] = 0xFFFF058B ^ 0xFA4F;
        a_0.F[0xBDA8 ^ 0xBDE9] = 0xFFFF4219 ^ 0xBDE9;
        a_0.F[0x3C04 ^ 0x3CA6] = 0xCE6E ^ 0x3CA6;
        a_0.F[0xECAC ^ 0xEC03] = 0x25BF ^ 0xEC03;
        a_0.F[0xBA11 ^ 0xBB5E] = 0x8072 ^ 0xBB5E;
        a_0.F[0xD4CC ^ 0xD4FB] = 0xFFFF2B43 ^ 0xD4FB;
        a_0.F[0x519A ^ 0x50D6] = 0x60DA ^ 0x50D6;
        a_0.F[0x75E6 ^ 0x7501] = 0xF7D9 ^ 0x7501;
        a_0.F[0xC1C ^ 0xD2F] = 0x4DBE ^ 0xD2F;
        a_0.F[0xDA03 ^ 0xDB67] = 0x1D447 ^ 0xDB67;
        a_0.F[0x1B80 ^ 0x1B26] = 0x558B ^ 0x1B26;
        a_0.F[0xF0C6 ^ 0xF0E4] = 0xFFFF0F39 ^ 0xF0E4;
        a_0.F[0xB1B3 ^ 0xB127] = 0xFFFF4E80 ^ 0xB127;
        a_0.F[0x17DA ^ 0x174C] = 0xFFFFE8BF ^ 0x174C;
        a_0.F[0xBC19 ^ 0xBD49] = 0x8635 ^ 0xBD49;
        a_0.F[0x14E7 ^ 0x14DD] = 0x14EA ^ 0x14DD;
        a_0.F[0x868F ^ 0x869A] = 0x869A ^ 0x869A;
        a_0.F[0x7ADC ^ 0x7BDE] = 0xEBB6 ^ 0x7BDE;
        a_0.F[0x6C2E ^ 0x6C3F] = 0xFFFF93AE ^ 0x6C3F;
        a_0.F[0x1C13 ^ 0x1C4D] = 0xC53A ^ 0x1C4D;
        a_0.F[0xC928 ^ 0xC808] = 0xA8AF ^ 0xC808;
        a_0.F[0x7CDA ^ 0x7CA5] = 0xFFFF8357 ^ 0x7CA5;
        a_0.F[0xB5C2 ^ 0xB4A4] = 0xB4A4 ^ 0xB4A4;
        a_0.F[0x662F ^ 0x672A] = 0x90EC ^ 0x672A;
        a_0.F[0xA1DF ^ 0xA17B] = 0xFFFFAC58 ^ 0xA17B;
        a_0.F[0x2CF9 ^ 0x2DEC] = 0x6C84 ^ 0x2DEC;
        a_0.F[0xF044 ^ 0xF160] = 0x57CC ^ 0xF160;
        a_0.F[0xDEF4 ^ 0xDFCC] = 0x5C5B ^ 0xDFCC;
        a_0.F[0xA896 ^ 0xA824] = 0xCA2B ^ 0xA824;
        a_0.F[0x2938 ^ 0x2982] = 0x1DB9 ^ 0x2982;
        a_0.F[0xAF97 ^ 0xAEAA] = 0x4098 ^ 0xAEAA;
        a_0.F[0x167 ^ 0x1FA] = 0x1FB ^ 0x1FA;
        a_0.F[0xB12A ^ 0xB1BD] = 0xB12C ^ 0xB1BD;
        a_0.F[0xA37F ^ 0xA30E] = 0xA326 ^ 0xA30E;
        a_0.F[0x1159 ^ 0x1078] = 0xB6CC ^ 0x1078;
        a_0.F[0x23F7 ^ 0x23BE] = 0x23BE ^ 0x23BE;
        a_0.F[0x4645 ^ 0x4685] = 0x671C ^ 0x4685;
        a_0.F[0xBA7A ^ 0xBAE3] = 0xBADC ^ 0xBAE3;
        a_0.F[0xB8DD ^ 0xB8D2] = 0xFFFF4769 ^ 0xB8D2;
        a_0.F[0xAE40 ^ 0xAF28] = 0xAF29 ^ 0xAF28;
        a_0.F[0x2B05 ^ 0x2A27] = 0x8C8B ^ 0x2A27;
        a_0.F[0x87 ^ 0x1BE] = 0x6A5F ^ 0x1BE;
        a_0.F[0x8F81 ^ 0x8F0B] = 0x8F53 ^ 0x8F0B;
        a_0.F[0xDB9D ^ 0xDBEA] = 0xDBCF ^ 0xDBEA;
        a_0.F[0x85B9 ^ 0x8490] = 0xBC23 ^ 0x8490;
        a_0.F[0x6EB1 ^ 0x6FC6] = 0x6E19 ^ 0x6FC6;
        a_0.F[0x84B3 ^ 0x85C5] = 0xB3BB ^ 0x85C5;
        a_0.F[0xA0AE ^ 0xA013] = 0x942F ^ 0xA013;
        a_0.F[0x5CB2 ^ 0x5C82] = 0x5C17 ^ 0x5C82;
        a_0.F[0x228D ^ 0x22A8] = 0x22BA ^ 0x22A8;
        a_0.F[0xE49D ^ 0xE428] = 0x8629 ^ 0xE428;
        a_0.F[0x4541 ^ 0x45C0] = 0xFFFFBA71 ^ 0x45C0;
        a_0.F[0x9983 ^ 0x99FB] = 0xFFFF665A ^ 0x99FB;
        a_0.F[0x8AC1 ^ 0x8BDB] = 0xE07 ^ 0x8BDB;
        a_0.F[0x2FFC ^ 0x2FFC] = 0x2FC2 ^ 0x2FFC;
        a_0.F[0x99F1 ^ 0x992B] = 0xC419 ^ 0x992B;
        a_0.F[0xCC91 ^ 0xCC5D] = 0xFFFF2422 ^ 0xCC5D;
        a_0.F[0xAF8D ^ 0xAFB1] = 0xFFFF5004 ^ 0xAFB1;
        a_0.F[0x4096 ^ 0x41CA] = 0xC0C7 ^ 0x41CA;
        a_0.F[0x399E ^ 0x38CF] = 0xAE96 ^ 0x38CF;
        a_0.F[0xD11D ^ 0xD071] = 0xF354 ^ 0xD071;
        a_0.F[0xEFD ^ 0xE50] = 0x10357 ^ 0xE50;
        a_0.F[0x7DE4 ^ 0x7D0C] = 0xFF82 ^ 0x7D0C;
        a_0.F[0xE67E ^ 0xE6BC] = 0xA512 ^ 0xE6BC;
        a_0.F[0xB9CD ^ 0xB92B] = 0x3BA5 ^ 0xB92B;
        a_0.F[0x576D ^ 0x5734] = 0xD1BA ^ 0x5734;
        a_0.F[0x57A5 ^ 0x56A2] = 0xFFFF5EAF ^ 0x56A2;
        a_0.F[0x1448 ^ 0x156F] = 0x1710 ^ 0x156F;
        a_0.F[0x43D2 ^ 0x43DB] = 0x43EE ^ 0x43DB;
        a_0.F[0x380A ^ 0x3936] = 0x52CE ^ 0x3936;
        a_0.F[0x296A ^ 0x29ED] = 0xFFFFD678 ^ 0x29ED;
        a_0.F[0x7134 ^ 0x7028] = 0xF5F4 ^ 0x7028;
        a_0.F[0xD29E ^ 0xD3A1] = 0x3D9A ^ 0xD3A1;
        a_0.F[0x19E ^ 0x81] = 0xFFFF9FC7 ^ 0x81;
        a_0.F[0xA546 ^ 0xA415] = 0x3219 ^ 0xA415;
        a_0.F[0x275E ^ 0x2601] = 0xFFFF31A2 ^ 0x2601;
        a_0.F[0x5372 ^ 0x533E] = 0x533C ^ 0x533E;
        a_0.F[0x7C5D ^ 0x7CA7] = 0x162F ^ 0x7CA7;
        a_0.F[0x24D5 ^ 0x24A5] = 0x24F7 ^ 0x24A5;
        a_0.F[0xC3A4 ^ 0xC38C] = 0xFFFF3C74 ^ 0xC38C;
        a_0.F[0x8FAD ^ 0x8E96] = 0xFFFF1A81 ^ 0x8E96;
        a_0.F[0xFF95 ^ 0xFF19] = 0xFFFF0097 ^ 0xFF19;
        a_0.F[0x2F77 ^ 0x2F5D] = 0x2F2A ^ 0x2F5D;
        a_0.F[0x37E6 ^ 0x370D] = 0xFFFFEEE6 ^ 0x370D;
        a_0.F[0x9F11 ^ 0x9E4A] = 0x1F34 ^ 0x9E4A;
        a_0.F[0x504D ^ 0x5041] = 0x5002 ^ 0x5041;
        a_0.F[0xB33E ^ 0xB27F] = 0xCB76 ^ 0xB27F;
        a_0.F[0xEC6B ^ 0xEDE8] = 0xEDE5 ^ 0xEDE8;
        a_0.F[0xE085 ^ 0xE19D] = 0xA0F8 ^ 0xE19D;
        a_0.F[0x33A ^ 0x30B] = 0x359 ^ 0x30B;
        a_0.F[0xD8FA ^ 0xD87E] = 0xFFFF27CD ^ 0xD87E;
        a_0.F[0x44C7 ^ 0x4487] = 0xFFFFBB60 ^ 0x4487;
        a_0.F[0xBFB6 ^ 0xBEB8] = 0x5981 ^ 0xBEB8;
        a_0.F[0xD363 ^ 0xD273] = 0x354A ^ 0xD273;
        a_0.F[0x1178 ^ 0x103F] = 0x10CC ^ 0x103F;
        a_0.F[0xF72D ^ 0xF7E4] = 0x9B4 ^ 0xF7E4;
        a_0.F[0x1E0F ^ 0x1EBE] = 0xD702 ^ 0x1EBE;
        a_0.F[0x8C29 ^ 0x8D13] = 0xE6EB ^ 0x8D13;
        a_0.F[0x392D ^ 0x39B8] = 0x39D4 ^ 0x39B8;
        a_0.F[0x1D14 ^ 0x1C7B] = 0x8748 ^ 0x1C7B;
        a_0.F[0x3A86 ^ 0x3AA6] = 0xFFFFC566 ^ 0x3AA6;
        a_0.F[0xBFAC ^ 0xBFE4] = 0xBFE7 ^ 0xBFE4;
        a_0.F[0x4FA0 ^ 0x4F54] = 0x299E ^ 0x4F54;
        a_0.F[0xE56B ^ 0xE414] = 0xE413 ^ 0xE414;
        a_0.F[0xC16E ^ 0xC134] = 0x9F05 ^ 0xC134;
        a_0.F[0x503A ^ 0x5067] = 0xDBD1 ^ 0x5067;
        a_0.F[0xA1FB ^ 0xA09A] = 0x1AFB2 ^ 0xA09A;
        a_0.F[0x934C ^ 0x927E] = 0xD29F ^ 0x927E;
        a_0.F[0xC670 ^ 0xC613] = 0xC678 ^ 0xC613;
        a_0.F[0x18A0 ^ 0x1986] = 0x1BFE ^ 0x1986;
        a_0.F[0x6E26 ^ 0x6E95] = 0xC94 ^ 0x6E95;
        a_0.F[0xB806 ^ 0xB8C2] = 0xFB49 ^ 0xB8C2;
        a_0.F[0xEDB7 ^ 0xECFC] = 0xDCFC ^ 0xECFC;
        a_0.F[0x9C16 ^ 0x9D1B] = 0x7A2C ^ 0x9D1B;
        a_0.F[0x14F8 ^ 0x145D] = 0xE693 ^ 0x145D;
        a_0.F[0x2681 ^ 0x2700] = 0x2704 ^ 0x2700;
        a_0.F[0x225C ^ 0x234A] = 0x622F ^ 0x234A;
        a_0.F[0x688E ^ 0x68E5] = 0x68EC ^ 0x68E5;
        a_0.F[0x8756 ^ 0x87C8] = 0x87C9 ^ 0x87C8;
        a_0.F[0xC4CD ^ 0xC47B] = 0xE781 ^ 0xC47B;
        a_0.F[0x9958 ^ 0x9941] = 0x9935 ^ 0x9941;
        a_0.F[0x54A8 ^ 0x552A] = 0x551D ^ 0x552A;
        a_0.F[0xD825 ^ 0xD93C] = 0x5CE4 ^ 0xD93C;
        a_0.F[0xBE52 ^ 0xBF05] = 0xFFFFA2EE ^ 0xBF05;
        a_0.F[0x91D1 ^ 0x91C2] = 0x91A7 ^ 0x91C2;
        a_0.F[0x290 ^ 0x384] = 0xCA4A ^ 0x384;
        a_0.F[0x79 ^ 0x7F] = 0xFFFFFF60 ^ 0x7F;
        a_0.F[0x8826 ^ 0x8828] = 0x8845 ^ 0x8828;
        a_0.F[0x7C02 ^ 0x7C30] = 0x7C72 ^ 0x7C30;
        a_0.F[0x9D68 ^ 0x9C03] = 0x95A7 ^ 0x9C03;
        a_0.F[0x39A4 ^ 0x39BF] = 0x39AC ^ 0x39BF;
        a_0.F[0xAF68 ^ 0xAF2B] = 0xFFFF50D3 ^ 0xAF2B;
        a_0.F[0x6AA3 ^ 0x6AE4] = 0x6A86 ^ 0x6AE4;
        a_0.F[0xE505 ^ 0xE466] = 0x1EB02 ^ 0xE466;
        a_0.F[0xAC89 ^ 0xAC8E] = 0xFFFF5305 ^ 0xAC8E;
        a_0.F[0xBA67 ^ 0xBA15] = 0xBA4F ^ 0xBA15;
        a_0.F[0x9792 ^ 0x9617] = 0x9616 ^ 0x9617;
        a_0.F[0xA8BC ^ 0xA8A2] = 0xFFFF574C ^ 0xA8A2;
        a_0.F[0xF1E9 ^ 0xF0B3] = 0x71BE ^ 0xF0B3;
        a_0.F[0x7B31 ^ 0x7BCD] = 0x1145 ^ 0x7BCD;
        a_0.F[0x15D4 ^ 0x15E9] = 0x15C4 ^ 0x15E9;
        a_0.F[0x3B6C ^ 0x3BB7] = 0x668D ^ 0x3BB7;
        a_0.F[0x3BF8 ^ 0x3B40] = 0x18D3 ^ 0x3B40;
        a_0.F[0x12B7 ^ 0x12D9] = 0x12DB ^ 0x12D9;
        a_0.F[0xAFE0 ^ 0xAE90] = 0xB587 ^ 0xAE90;
        a_0.F[0x6B79 ^ 0x6BF7] = 0xFFFF945F ^ 0x6BF7;
        a_0.F[0xDFD3 ^ 0xDFA5] = 0xFFFF2001 ^ 0xDFA5;
        a_0.F[0xE454 ^ 0xE4A2] = 0xA445 ^ 0xE4A2;
        a_0.F[0x2E2D ^ 0x2E9A] = 0xD61 ^ 0x2E9A;
        a_0.F[0x6070 ^ 0x606D] = 0x6031 ^ 0x606D;
        a_0.F[0x61D9 ^ 0x6052] = 0x605A ^ 0x6052;
        a_0.F[0x98F2 ^ 0x986E] = 0x986E ^ 0x986E;
        a_0.F[0x4BD6 ^ 0x4B0A] = 0xFFFFE998 ^ 0x4B0A;
        a_0.F[0x3D39 ^ 0x3CB3] = 0x3CF0 ^ 0x3CB3;
        a_0.F[0x10A6C ^ 0x10AA9] = 0x14905 ^ 0x10AA9;
        a_0.F[0x463B ^ 0x475C] = 0x475C ^ 0x475C;
        a_0.F[0xC857 ^ 0xC87B] = 0xFFFF3792 ^ 0xC87B;
        a_0.F[0x4A36 ^ 0x4BBB] = 0x4BB0 ^ 0x4BBB;
        a_0.F[0xE8C0 ^ 0xE88B] = 0xE88B ^ 0xE88B;
        a_0.F[0xF75B ^ 0xF7A0] = 0xFFFF6281 ^ 0xF7A0;
        a_0.F[0xCBE3 ^ 0xCB97] = 0xCBC3 ^ 0xCB97;
        a_0.F[0x76A8 ^ 0x77BF] = 0x369C ^ 0x77BF;
        a_0.F[0xB13E ^ 0xB011] = 0xD9FD ^ 0xB011;
        a_0.F[0x82F9 ^ 0x8384] = 0x8381 ^ 0x8384;
        a_0.F[0xD001 ^ 0xD0C9] = 0xFFFFD154 ^ 0xD0C9;
        a_0.F[0xD224 ^ 0xD371] = 0x316B ^ 0xD371;
        a_0.F[0xDE9E ^ 0xDFF0] = 0x5B9A ^ 0xDFF0;
        a_0.F[0xB8B0 ^ 0xB8F2] = 0xB8A8 ^ 0xB8F2;
        a_0.F[0x7955 ^ 0x7985] = 0xFFFF278E ^ 0x7985;
        a_0.F[0x240B ^ 0x24C6] = 0x333A ^ 0x24C6;
        a_0.F[0x7F9 ^ 0x6BA] = 0xFFFF8039 ^ 0x6BA;
        a_0.F[0x7F21 ^ 0x7F80] = 0x2DD4 ^ 0x7F80;
        a_0.F[0x44B0 ^ 0x44A6] = 0x44B2 ^ 0x44A6;
        a_0.F[0x574E ^ 0x57DF] = 0xFFFFA860 ^ 0x57DF;
        a_0.F[0x7737 ^ 0x77CF] = 0x3728 ^ 0x77CF;
        a_0.F[0x498C ^ 0x49ED] = 0x4994 ^ 0x49ED;
        a_0.F[0x2B91 ^ 0x2B0A] = 0x2B08 ^ 0x2B0A;
        a_0.F[0xE60C ^ 0xE777] = 0xE778 ^ 0xE777;
        a_0.F[0x8E9C ^ 0x8E37] = 0x18330 ^ 0x8E37;
        a_0.F[0x10DDE ^ 0x10CB4] = 0x10CA6 ^ 0x10CB4;
        a_0.F[0xC910 ^ 0xC96C] = 0xFFFF36CB ^ 0xC96C;
        a_0.F[0xF85F ^ 0xF811] = 0xF811 ^ 0xF811;
        a_0.F[0x2DAD ^ 0x2D72] = 0x165 ^ 0x2D72;
        a_0.F[0x2A1 ^ 0x2DF] = 0x2A2 ^ 0x2DF;
        a_0.F[0x10964 ^ 0x108E0] = 0x108E0 ^ 0x108E0;
        a_0.F[0x781C ^ 0x78F6] = 0x5ED0 ^ 0x78F6;
        a_0.F[0x54DE ^ 0x55CF] = 0x9C0D ^ 0x55CF;
        a_0.F[0x7A61 ^ 0x7B2B] = 0x4B27 ^ 0x7B2B;
        a_0.F[0x2DEE ^ 0x2D8C] = 0xFFFFD240 ^ 0x2D8C;
        a_0.F[0xF28E ^ 0xF3D7] = 0x72DF ^ 0xF3D7;
        a_0.F[0x1EB1 ^ 0x1E62] = 0xE607 ^ 0x1E62;
        a_0.F[0x8563 ^ 0x8594] = 0xC503 ^ 0x8594;
        a_0.F[0x10225 ^ 0x10377] = 0x1953D ^ 0x10377;
        a_0.F[0x1BDD ^ 0x1AD2] = 0xFDA6 ^ 0x1AD2;
        a_0.F[0x5760 ^ 0x5759] = 0x572A ^ 0x5759;
        a_0.F[0x3541 ^ 0x3434] = 0x4369 ^ 0x3434;
        a_0.F[0xD582 ^ 0xD571] = 0xB3E0 ^ 0xD571;
        a_0.F[0x2C41 ^ 0x2C15] = 0xC772 ^ 0x2C15;
        a_0.F[0x6458 ^ 0x649F] = 0x9ACF ^ 0x649F;
        a_0.F[0xC0CF ^ 0xC03D] = 0xA6F7 ^ 0xC03D;
        a_0.F[0xB673 ^ 0xB697] = 0x8796 ^ 0xB697;
        a_0.F[0x66D7 ^ 0x6644] = 0x666B ^ 0x6644;
        a_0.F[0xE870 ^ 0xE976] = 0x1EAD ^ 0xE976;
        a_0.F[0x3140 ^ 0x314D] = 0xFFFFCE9A ^ 0x314D;
        a_0.F[0x181B ^ 0x1889] = 0xFFFFE779 ^ 0x1889;
        a_0.F[0xCE3C ^ 0xCE28] = 0xFFFF31D8 ^ 0xCE28;
        a_0.F[0xDA98 ^ 0xDA1B] = 0xDA4A ^ 0xDA1B;
        a_0.F[0x45B0 ^ 0x458F] = 0x4586 ^ 0x458F;
        a_0.F[0x2FA1 ^ 0x2FE7] = 0x2FB6 ^ 0x2FE7;
        a_0.F[0x6E73 ^ 0x6F0B] = 0x1F34 ^ 0x6F0B;
        a_0.F[0x8FB5 ^ 0x8F5A] = 0x6AC8 ^ 0x8F5A;
        a_0.F[0x5126 ^ 0x515D] = 0xFFFFAED1 ^ 0x515D;
        a_0.F[0xDD40 ^ 0xDC76] = 0x5FE1 ^ 0xDC76;
        a_0.F[0xEE18 ^ 0xEE62] = 0xEE22 ^ 0xEE62;
        a_0.F[0x825B ^ 0x82E2] = 0xA119 ^ 0x82E2;
        a_0.F[0x1AFE ^ 0x1A73] = 0x1A08 ^ 0x1A73;
        a_0.F[0x4405 ^ 0x4468] = 0x4432 ^ 0x4468;
        a_0.F[0x10CBE ^ 0x10DE6] = 0x1EFFF ^ 0x10DE6;
        a_0.F[0xACFD ^ 0xADB5] = 0xAD60 ^ 0xADB5;
        a_0.F[0x20A2 ^ 0x21A2] = 0xCEC7 ^ 0x21A2;
        a_0.F[0x762F ^ 0x7637] = 0x761B ^ 0x7637;
        a_0.F[0xF648 ^ 0xF6AB] = 0xC78A ^ 0xF6AB;
        a_0.F[0x1F8E ^ 0x1F8B] = 0xFFFFE050 ^ 0x1F8B;
        a_0.F[0x8B60 ^ 0x8B6B] = 0x8B16 ^ 0x8B6B;
        a_0.F[0x109D7 ^ 0x1097E] = 0x147D8 ^ 0x1097E;
        a_0.F[0x34C ^ 0x344] = 0xFFFFFCD1 ^ 0x344;
        a_0.F[0x51F1 ^ 0x5179] = 0x517D ^ 0x5179;
        a_0.F[0xE610 ^ 0xE759] = 0xD747 ^ 0xE759;
        a_0.F[0x5F67 ^ 0x5E29] = 0x6555 ^ 0x5E29;
        a_0.F[0xB3E8 ^ 0xB2F3] = 0xFFFFC8A5 ^ 0xB2F3;
        a_0.F[0xCEB1 ^ 0xCE60] = 0x6FE3 ^ 0xCE60;
        a_0.F[0xA7F2 ^ 0xA6F3] = 0x3681 ^ 0xA6F3;
        a_0.F[0xE087 ^ 0xE0B4] = 0xFFFF1F18 ^ 0xE0B4;
        a_0.F[0x10549 ^ 0x105B4] = 0x1EAC6 ^ 0x105B4;
        a_0.F[0x39B1 ^ 0x3950] = 0x1547 ^ 0x3950;
        a_0.F[0x2AAB ^ 0x2A1F] = 0xFFFFB7C6 ^ 0x2A1F;
        a_0.F[0x742 ^ 0x741] = 0x750 ^ 0x741;
        a_0.F[0xBB89 ^ 0xBB83] = 0xBBCF ^ 0xBB83;
        a_0.F[0x1050B ^ 0x1046B] = 0x1EC7F ^ 0x1046B;
        a_0.F[0x5472 ^ 0x541A] = 0x540A ^ 0x541A;
        a_0.F[0x5862 ^ 0x59EA] = 0x59AA ^ 0x59EA;
        a_0.F[0x9A25 ^ 0x9A32] = 0x9A2E ^ 0x9A32;
        a_0.F[0x64A ^ 0x77F] = 0x84F9 ^ 0x77F;
        a_0.F[0x10793 ^ 0x1077F] = 0x12159 ^ 0x1077F;
        a_0.F[0x2AE8 ^ 0x2A3E] = 0xCF5C ^ 0x2A3E;
        a_0.F[0x191A ^ 0x19D4] = 0xB85D ^ 0x19D4;
        a_0.F[0xFA45 ^ 0xFB71] = 0xBB90 ^ 0xFB71;
        a_0.F[0xC5AC ^ 0xC55D] = 0xA395 ^ 0xC55D;
        a_0.F[0x384A ^ 0x390C] = 0x39D9 ^ 0x390C;
        a_0.F[0xE46C ^ 0xE447] = 0xFFFF1BED ^ 0xE447;
        a_0.F[0x10BB2 ^ 0x10B0C] = 0x12AC1 ^ 0x10B0C;
        a_0.F[0x2410 ^ 0x2428] = 0x2400 ^ 0x2428;
        a_0.F[0xCC7E ^ 0xCD3A] = 0xB42D ^ 0xCD3A;
        a_0.F[0xD69A ^ 0xD648] = 0x2E29 ^ 0xD648;
        a_0.F[0x57B ^ 0x478] = 0xFFFF6B88 ^ 0x478;
        a_0.F[0xE464 ^ 0xE57A] = 0x85DD ^ 0xE57A;
        a_0.F[0xDEC2 ^ 0xDE3B] = 0xB4AC ^ 0xDE3B;
        a_0.F[0xFFD3 ^ 0xFF80] = 0x4005 ^ 0xFF80;
        a_0.F[0xA6D1 ^ 0xA6D0] = 0xFFFF5946 ^ 0xA6D0;
        a_0.F[0xDD1C ^ 0xDD40] = 0xF4B5 ^ 0xDD40;
        a_0.F[0x733C ^ 0x735A] = 0x7334 ^ 0x735A;
        a_0.F[0xC5C7 ^ 0xC4B5] = 0x4A4D ^ 0xC4B5;
        a_0.F[0x60E6 ^ 0x6008] = 0x85F4 ^ 0x6008;
        a_0.F[0x7C20 ^ 0x7C76] = 0x8D1F ^ 0x7C76;
        a_0.F[0xE00E ^ 0xE06A] = 0xE06B ^ 0xE06A;
        a_0.F[0x9305 ^ 0x9387] = 0x93BB ^ 0x9387;
        a_0.F[0xF2B9 ^ 0xF2FC] = 0xFFFF0D0D ^ 0xF2FC;
        a_0.F[0x2BB2 ^ 0x2A3B] = 0x2A38 ^ 0x2A3B;
        a_0.F[0x1378 ^ 0x1329] = 0x1F4B ^ 0x1329;
        a_0.F[0xC5C7 ^ 0xC56F] = 0xFFFF7457 ^ 0xC56F;
        a_0.F[0xC8C ^ 0xD00] = 0xFFFFF2A4 ^ 0xD00;
        a_0.F[0x9166 ^ 0x9106] = 0x9106 ^ 0x9106;
        a_0.F[0x3E1D ^ 0x3E6E] = 0x3E1F ^ 0x3E6E;
        a_0.F[0x1201 ^ 0x134C] = 0x282C ^ 0x134C;
        a_0.F[0x7C1D ^ 0x7C30] = 0xFFFF8379 ^ 0x7C30;
        a_0.F[0x2B02 ^ 0x2B50] = 0xACB4 ^ 0x2B50;
        a_0.F[0xEA9 ^ 0xE5C] = 0x4EBC ^ 0xE5C;
        a_0.F[0x1B99 ^ 0x1B66] = 0xFFFF0BB6 ^ 0x1B66;
        a_0.F[0x565B ^ 0x5626] = 0xFFFFA9DC ^ 0x5626;
        a_0.F[0x4E6A ^ 0x4E44] = 0x4E05 ^ 0x4E44;
        a_0.F[0xDA25 ^ 0xDB36] = 0x12D7 ^ 0xDB36;
        a_0.F[0x4F53 ^ 0x4ED4] = 0x4EDE ^ 0x4ED4;
        a_0.F[0x78AD ^ 0x787A] = 0x9D17 ^ 0x787A;
        a_0.F[0x5A29 ^ 0x5ACB] = 0x5ACB ^ 0x5ACB;
        a_0.F[0x89B0 ^ 0x898B] = 0xFFFF764D ^ 0x898B;
        a_0.F[0xA85F ^ 0xA8FC] = 0x5A32 ^ 0xA8FC;
        a_0.F[0x8737 ^ 0x8773] = 0x872D ^ 0x8773;
        a_0.F[0x77D0 ^ 0x76F8] = 0x7480 ^ 0x76F8;
        a_0.F[0x73DE ^ 0x7372] = 0xFFFE81C8 ^ 0x7372;
        a_0.F[0x3576 ^ 0x3596] = 0x199D ^ 0x3596;
        a_0.F[0x8F7A ^ 0x8E59] = 0xFFFFD713 ^ 0x8E59;
        a_0.F[0xFDAB ^ 0xFD3B] = 0xFD4E ^ 0xFD3B;
        a_0.F[0x1003C ^ 0x10076] = 0x10077 ^ 0x10076;
        a_0.F[0x4463 ^ 0x448A] = 0x62B9 ^ 0x448A;
        a_0.F[0x24B2 ^ 0x240D] = 0x5C5 ^ 0x240D;
        a_0.F[0xDB5 ^ 0xD6C] = 0xE801 ^ 0xD6C;
        a_0.F[0x28E4 ^ 0x2830] = 0xFFFF2FB1 ^ 0x2830;
        a_0.F[0x35B0 ^ 0x34E6] = 0xD6FF ^ 0x34E6;
        a_0.F[0xE556 ^ 0xE5DD] = 0xFFFF1A08 ^ 0xE5DD;
        a_0.F[0x19B4 ^ 0x189A] = 0x7174 ^ 0x189A;
        a_0.F[0x615A ^ 0x6145] = 0x616C ^ 0x6145;
        a_0.F[0xF82C ^ 0xF808] = 0xFFFF07CC ^ 0xF808;
        a_0.F[0x1C1F ^ 0x1C3C] = 0x1C05 ^ 0x1C3C;
        a_0.F[0x43BB ^ 0x4332] = 0x4346 ^ 0x4332;
        a_0.F[0x5819 ^ 0x5974] = 0x1F13 ^ 0x5974;
        a_0.F[0xD32 ^ 0xDF8] = 0x1A09 ^ 0xDF8;
        a_0.F[0x61DB ^ 0x618E] = 0x7306 ^ 0x618E;
        a_0.F[0xD2FB ^ 0xD226] = 0x8F1C ^ 0xD226;
        a_0.F[0x8669 ^ 0x8700] = 0x8700 ^ 0x8700;
        a_0.F[0x24D7 ^ 0x24BE] = 0x24EB ^ 0x24BE;
        a_0.F[0x2E22 ^ 0x2FAC] = 0xFFFFD050 ^ 0x2FAC;
        a_0.F[0xDCB7 ^ 0xDD31] = 0xDD74 ^ 0xDD31;
        a_0.F[0xD0C1 ^ 0xD0A4] = 0xFFFF2F17 ^ 0xD0A4;
        a_0.F[0xC284 ^ 0xC304] = 0xC301 ^ 0xC304;
        a_0.F[0x5DB0 ^ 0x5D17] = 0x13B1 ^ 0x5D17;
        a_0.F[0x62D1 ^ 0x6234] = 0xE0B3 ^ 0x6234;
        a_0.F[0x937D ^ 0x9352] = 0xFFFF6CD8 ^ 0x9352;
        a_0.F[0x5F19 ^ 0x5E27] = 0xB01A ^ 0x5E27;
        a_0.F[0xB8A ^ 0xB88] = 0xFFFFF42B ^ 0xB88;
        a_0.F[0x3DD3 ^ 0x3CA7] = 0x72DA ^ 0x3CA7;
        a_0.F[0xDD2C ^ 0xDD40] = 0xFFFF22A5 ^ 0xDD40;
        a_0.F[0x8944 ^ 0x8804] = 0x6639 ^ 0x8804;
        a_0.F[0x73A ^ 0x743] = 0x797 ^ 0x743;
        a_0.F[0xE2E4 ^ 0xE2FE] = 0xFFFF1D57 ^ 0xE2FE;
        a_0.F[0x2148 ^ 0x2190] = 0xC4BC ^ 0x2190;
        a_0.F[0x5205 ^ 0x5233] = 0xFFFFADD4 ^ 0x5233;
        a_0.F[0xC278 ^ 0xC2F7] = 0xFFFF3D0A ^ 0xC2F7;
        a_0.F[0x62F7 ^ 0x6207] = 0x87FB ^ 0x6207;
        a_0.F[0x5646 ^ 0x576D] = 0xFFFF9028 ^ 0x576D;
        a_0.F[0x6D95 ^ 0x6CF0] = 0x6CF0 ^ 0x6CF0;
        a_0.F[0x1009B ^ 0x100FC] = 0x10079 ^ 0x100FC;
        a_0.F[0x17E5 ^ 0x16B1] = 0x80FB ^ 0x16B1;
        a_0.F[0xE043 ^ 0xE096] = 0x18F3 ^ 0xE096;
        a_0.F[0x4E87 ^ 0x4E02] = 0x4ED3 ^ 0x4E02;
        a_0.F[0x453C ^ 0x4556] = 0xFFFFBAB9 ^ 0x4556;
        a_0.F[0x58E ^ 0x5A8] = 0x5E7 ^ 0x5A8;
        a_0.F[0x8CC9 ^ 0x8C75] = 0xB818 ^ 0x8C75;
        a_0.F[0xA466 ^ 0xA4A0] = 0x5AF0 ^ 0xA4A0;
        a_0.F[0x7732 ^ 0x77B4] = 0x77F2 ^ 0x77B4;
        a_0.F[0x27DD ^ 0x26D9] = 0xB6B1 ^ 0x26D9;
        a_0.F[0x9B0A ^ 0x9A06] = 0xAC26 ^ 0x9A06;
        a_0.F[0xEE43 ^ 0xEE77] = 0xEE46 ^ 0xEE77;
        a_0.F[0x7B82 ^ 0x7AFC] = 0xFFFF8549 ^ 0x7AFC;
        a_0.F[0xAAB7 ^ 0xAB9D] = 0x9328 ^ 0xAB9D;
        a_0.F[0xFB96 ^ 0xFAE5] = 0xE07C ^ 0xFAE5;
        a_0.F[0x487E ^ 0x4880] = 0xA7E5 ^ 0x4880;
        a_0.F[0x6312 ^ 0x621A] = 0x95C1 ^ 0x621A;
        a_0.F[0x3C8D ^ 0x3DD0] = 0xD5D0 ^ 0x3DD0;
        a_0.F[0x5E55 ^ 0x5F5F] = 0x697F ^ 0x5F5F;
        a_0.F[0xA1D7 ^ 0xA14D] = 0xA14C ^ 0xA14D;
        a_0.F[0x1048D ^ 0x105F4] = 0x105F5 ^ 0x105F4;
        a_0.F[0x1796 ^ 0x1619] = 0x1617 ^ 0x1619;
        a_0.F[0x5D20 ^ 0x5D3C] = 0xFFFFA28B ^ 0x5D3C;
        a_0.F[0xA6A2 ^ 0xA78E] = 0x9F3B ^ 0xA78E;
        a_0.F[0x9CF9 ^ 0x9CA9] = 0x75E9 ^ 0x9CA9;
        a_0.F[0x5202 ^ 0x5277] = 0xFFFFAD93 ^ 0x5277;
        a_0.F[0x4B55 ^ 0x4A2F] = 0x4A3F ^ 0x4A2F;
        a_0.F[0xECF0 ^ 0xECE2] = 0xEC9C ^ 0xECE2;
        a_0.F[0x3106 ^ 0x314B] = 0x314B ^ 0x314B;
        a_0.F[0x10B2A ^ 0x10BE9] = 0x14845 ^ 0x10BE9;
        a_0.F[0x5C3 ^ 0x508] = 0x12F4 ^ 0x508;
        a_0.F[0x36C3 ^ 0x366D] = 0xFFDD ^ 0x366D;
        a_0.F[0x15F8 ^ 0x14EA] = 0xDD24 ^ 0x14EA;
        a_0.F[0x154C ^ 0x1548] = 0xFFFFEA84 ^ 0x1548;
        a_0.F[0x7277 ^ 0x7335] = 0xA22 ^ 0x7335;
        a_0.F[0x8475 ^ 0x8509] = 0x8560 ^ 0x8509;
        a_0.F[0xCC34 ^ 0xCD56] = 0x1C276 ^ 0xCD56;
        a_0.F[0xA3E9 ^ 0xA349] = 0xF10D ^ 0xA349;
        a_0.F[0xBB5E ^ 0xBB6B] = 0xBB48 ^ 0xBB6B;
        a_0.F[0xBFED ^ 0xBFBA] = 0x8611 ^ 0xBFBA;
        a_0.F[0x628E ^ 0x62D6] = 0x4D9B ^ 0x62D6;
        a_0.F[0x10EAB ^ 0x10EBB] = 0xFFFEF16D ^ 0x10EBB;
        a_0.F[0x1A26 ^ 0x1A07] = 0xFFFFE5A0 ^ 0x1A07;
        a_0.F[0xB259 ^ 0xB352] = 0xFFFF7AC2 ^ 0xB352;
        a_0.F[0x5A0C ^ 0x5B3C] = 0x32D2 ^ 0x5B3C;
        a_0.F[0x434 ^ 0x53D] = 0x330B ^ 0x53D;
        a_0.F[0x29F7 ^ 0x28EA] = 0x484D ^ 0x28EA;
        a_0.F[0x3A31 ^ 0x3A0F] = 0x3A10 ^ 0x3A0F;
        a_0.F[0x29F3 ^ 0x2882] = 0xF8BA ^ 0x2882;
        a_0.F[0xF233 ^ 0xF376] = 0xF3A9 ^ 0xF376;
        a_0.F[0xBC7E ^ 0xBD53] = 0xD4A6 ^ 0xBD53;
        a_0.F[0x1223 ^ 0x1293] = 0xFFFF2487 ^ 0x1293;
        a_0.F[0x6905 ^ 0x69AF] = 0x164AB ^ 0x69AF;
        a_0.F[0x1377 ^ 0x13B8] = 0xB23B ^ 0x13B8;
        a_0.F[0x6A2F ^ 0x6AC2] = 0x8F2E ^ 0x6AC2;
        a_0.F[0x10CE4 ^ 0x10C7C] = 0x10C4E ^ 0x10C7C;
        a_0.F[0x10BCD ^ 0x10AFA] = 0xFFFE76D1 ^ 0x10AFA;
        a_0.F[0x81E1 ^ 0x8161] = 0x8152 ^ 0x8161;
        a_0.F[0x878B ^ 0x8714] = 0x8714 ^ 0x8714;
        a_0.F[0xFD96 ^ 0xFD57] = 0xDC9F ^ 0xFD57;
        a_0.F[0xE297 ^ 0xE3B2] = 0xE1CB ^ 0xE3B2;
    }
}

