/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
package kotakbaz.rain.client.render.main.vertex.format;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.main.vertex.format.A;
import lombok.Generated;

/*
 * Renamed from kotakbaz.rain.client.render.main.vertex.format.a
 */
public class a_0 {
    private final HashMap<String, kotakbaz.rain.client.render.main.vertex.element.a_0> a;
    private final HashMap<kotakbaz.rain.client.render.main.vertex.element.a_0, String> A;
    private final List<kotakbaz.rain.client.render.main.vertex.element.a_0> b;
    private final int B;
    private final int c;
    private final int[] C;
    private A d;
    private static Object[] D;
    private static Object E;
    private static Object[] f;
    private static Object[] e;
    private static Object[] F;
    public static int[] g;

    public a_0(List<kotakbaz.rain.client.render.main.vertex.element.a_0> list, List<String> list2) {
        long l = 1676392018527459383L;
        long l2 = -310029075274136262L;
        long l3 = -4182011089596625873L;
        long l4 = -2034072081072583738L;
        long l5 = -627428173745037867L;
        long l6 = -1305227120784375462L;
        long l7 = -6245178667523617568L;
        long l8 = 8511564254477085424L;
        long l9 = 4136259528782238013L;
        super();
        this.a = new HashMap();
        this.A = new HashMap();
        this.d = null;
        this.b = list;
        this.C = new int[this.b.size()];
        int n3 = g[0];
        n3 += g[1];
        this.B = list.stream().mapToInt(kotakbaz.rain.client.render.main.vertex.element.a_0::mask).reduce(n3 += g[2], (n, n2) -> n | n2);
        long l10 = l8;
        int n4 = g[3];
        n4 -= g[4];
        l8 = l10 ^ (0L ^ l10) & -1L << (n4 -= g[5]);
        long l11 = l9;
        int n5 = g[6];
        n5 += g[7];
        long l12 = l9 = l11 ^ (0L ^ l11) & -1L >>> (n5 ^= g[8]);
        int n6 = g[9];
        n6 += g[10];
        l9 = l12 ^ (0L ^ l12) & -1L << (n6 ^= g[11]);
        while (true) {
            int n7 = g[12];
            n7 += g[13];
            if ((int)(l9 >>> (n7 -= g[14])) >= list.size()) break;
            int n8 = g[15];
            n8 -= g[16];
            kotakbaz.rain.client.render.main.vertex.element.a_0 a_02 = list.get((int)(l9 >>> (n8 -= g[17])));
            int n9 = g[18];
            n9 += g[19];
            n9 -= g[20];
            int n10 = g[21];
            n10 ^= g[22];
            long l13 = l8;
            int n11 = g[24];
            n11 ^= g[25];
            l8 = l13 ^ ((long)((int)(l8 >>> n9) + a_02.getSize()) << (n10 -= g[23]) ^ l13) & -1L << (n11 ^= g[26]);
            int n12 = g[27];
            n12 += g[28];
            if ((int)(l9 >>> (n12 -= g[29])) > 0) {
                int n13 = g[30];
                n13 -= g[31];
                this.C[(int)(l9 >>> (n13 += a_0.g[32]))] = (int)l9;
            } else {
                int n14 = g[33];
                n14 += g[34];
                int n15 = g[36];
                n15 ^= g[37];
                this.C[(int)(l9 >>> (n14 -= a_0.g[35]))] = n15 -= g[38];
            }
            long l14 = l9;
            int n16 = g[39];
            n16 ^= g[40];
            l9 = l14 ^ ((long)((int)l9 + a_02.getSize()) ^ l14) & -1L >>> (n16 += g[41]);
            int n17 = g[42];
            n17 ^= g[43];
            this.a.put(list2.get((int)(l9 >>> (n17 += g[44]))), a_02);
            int n18 = g[45];
            n18 -= g[46];
            this.A.put(a_02, list2.get((int)(l9 >>> (n18 ^= g[47]))));
            l9 += 0x100000000L;
        }
        int n19 = g[48];
        n19 += g[49];
        this.c = (int)(l8 >>> (n19 ^= g[50]));
    }

    public Stream<kotakbaz.rain.client.render.main.vertex.element.a_0> getElementsFromMask(int n) {
        return this.b.stream().filter(a_02 -> {
            int n2;
            if (a_02 != null && (n & a_02.mask()) != 0) {
                int n3 = g[57];
                n3 += g[58];
                n2 = n3 += g[59];
            } else {
                int n4 = g[60];
                n4 -= g[61];
                n2 = n4 ^= g[62];
            }
            return n2 != 0;
        });
    }

    public kotakbaz.rain.client.render.main.vertex.element.a_0 getVertexElement(String string) {
        kotakbaz.rain.client.render.main.vertex.element.a_0 a_02 = this.a.get(string);
        if (a_02 == null) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.vertex.A(string));
        }
        return a_02;
    }

    public String getVertexElementName(kotakbaz.rain.client.render.main.vertex.element.a_0 a_02) {
        return this.A.get(a_02);
    }

    public int getElementOffset(kotakbaz.rain.client.render.main.vertex.element.a_0 a_02) {
        return this.C[a_02.getId()];
    }

    public A getVertexFormatBufferOrCreate(Supplier<A> supplier) {
        if (this.d == null) {
            this.d = supplier.get();
        }
        return this.d;
    }

    public static kotakbaz.rain.client.render.main.builders.A builder() {
        int n = g[51];
        n ^= g[52];
        int n2 = g[54];
        n2 ^= g[55];
        return new kotakbaz.rain.client.render.main.builders.A().element((String)D[n += g[53]], kotakbaz.rain.client.render.main.vertex.element.A.C, n2 ^= g[56]);
    }

    @Generated
    public List<kotakbaz.rain.client.render.main.vertex.element.a_0> getVertexElements() {
        return this.b;
    }

    @Generated
    public int getElementsMask() {
        return this.B;
    }

    @Generated
    public int getVertexSize() {
        return this.c;
    }

    @Generated
    public int[] getElementOffsets() {
        return this.C;
    }

    static {
        a_0.b();
        long l = -2990162567254473561L;
        long l2 = 2969284545085857606L;
        long l3 = 577585269785428767L;
        long l4 = 7626838582728473395L;
        long l5 = -4949057858309712378L;
        long l6 = 1901025928250576848L;
        long l7 = 8303086868365967347L;
        long l8 = -8385140010221650832L;
        long l9 = -8646200410741352590L;
        long l10 = 1891583826482449953L;
        long l11 = -8604400960864762529L;
        long l12 = -4641533888142780384L;
        long l13 = -7181106107628759945L;
        long l14 = -3389087372945219697L;
        int n = g[63];
        n ^= g[64];
        D = new Object[n += g[65]];
        long l15 = l14;
        int n2 = g[66];
        n2 += g[67];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += g[68]);
        Object[] objectArray = new Object[g[69]];
        objectArray[a_0.g[70]] = e;
        objectArray[a_0.g[71]] = g[72];
        int n3 = g[73];
        Object object = a_0.A()[g[74]];
        if (object == null) {
            char[] cArray = "\u5e04\ud66b\u5e3a\u5e04\ud675\u5e05\u5e0b\u5e12\u5e07\ud670\u5e35\ud67b\u5e02\ud67e\ud66a\u5e06\ud664\u5e13\ud676\u5e17\ud661\u5e04\ud67a\u5e1b\ud67b\ud67b\u5e19\u5e1f\ud67c\u5e1f\u5e03\ud67a\ud67e\u5e12\u5e02\ud66a\u5e3a\ud671\ud677\u5e37\u5e32\u5e1e\u5e19\ud64f".toCharArray();
            for (int i = g[75]; i < g[76]; ++i) {
                int n4 = cArray[i];
                n4 ^= g[77];
                n4 ^= g[78];
                n4 -= g[79];
                n4 += g[80];
                n4 ^= g[81];
                n4 ^= g[82];
                n4 += g[83];
                n4 += g[84];
                n4 -= g[85];
                n4 -= g[86];
                n4 += g[87];
                cArray[i] = (char)(n4 ^= g[88]);
            }
            object = a_0.A()[a_0.g[89]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = g[90];
        n5 ^= g[91];
        l5 = l16 ^ (0xA00000000L ^ l16) & -1L << (n5 += g[92]);
        long l17 = l12;
        int n6 = g[93];
        n6 ^= g[94];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= g[95]);
        while (true) {
            int n7 = g[96];
            n7 -= g[97];
            if ((int)l12 >= (int)(l5 >>> (n7 -= g[98]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = g[99];
            n9 -= g[100];
            int n10 = g[102];
            n10 += g[103];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += g[101])) & -1L >>> (n10 -= g[104]);
            long l19 = l8;
            int n11 = g[105];
            n11 -= g[106];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= g[107]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = g[108];
            n13 ^= g[109];
            int n14 = g[111];
            n14 ^= g[112];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= g[110])) & -1L >>> (n14 ^= g[113]);
            int n15 = g[114];
            n15 ^= g[115];
            long l21 = l9;
            int n16 = g[117];
            n16 += g[118];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += g[116]) ^ l21) & -1L << (n16 ^= g[119]);
            int n17 = g[120];
            n17 += g[121];
            n17 -= g[122];
            int n18 = g[123];
            n18 ^= g[124];
            long l22 = l11;
            int n19 = g[126];
            n19 ^= g[127];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += g[125]))) ^ l22) & -1L >>> (n19 -= g[128]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = g[129];
            n20 -= g[130];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += g[131]);
            while (true) {
                int n21 = g[132];
                n21 -= g[133];
                if ((int)(l13 >>> (n21 -= g[134])) >= (int)l11) break;
                int n22 = g[135];
                n22 += g[136];
                int n23 = g[138];
                n23 += g[139];
                cArray2[(int)(l13 >>> (n22 -= a_0.g[137]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= g[140]))];
                l13 += 0x100000000L;
            }
            int n24 = g[141];
            n24 -= g[142];
            int n25 = (int)(l14 >>> (n24 += g[143]));
            l14 += 0x100000000L;
            a_0.D[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = g[144];
            n26 -= g[145];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= g[146]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[g[147]];
        String string = (String)object[g[148]];
        object = object[g[149]];
        Object[] objectArray = f;
        if (f == null) {
            objectArray = f = new Object[g[150]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[g[151]];
                e = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[g[153] ^ g[154]];
                byArray[a_0.g[155] ^ a_0.g[156]] = g[157] ^ g[158];
                byArray[a_0.g[159] ^ a_0.g[160]] = g[161] ^ g[162];
                byArray[a_0.g[163] ^ a_0.g[164]] = g[165] ^ g[166];
                byArray[a_0.g[167] ^ a_0.g[168]] = g[169] ^ g[170];
                byArray[a_0.g[171] ^ a_0.g[172]] = g[173] ^ g[174];
                byArray[a_0.g[175] ^ a_0.g[176]] = g[177] ^ g[178];
                byArray[a_0.g[179] ^ a_0.g[180]] = g[181] ^ g[182];
                byArray[a_0.g[183] ^ a_0.g[184]] = g[185] ^ g[186];
                byArray[a_0.g[187] ^ a_0.g[188]] = g[189] ^ g[190];
                byArray[a_0.g[191] ^ a_0.g[192]] = g[193] ^ g[194];
                byArray[a_0.g[195] ^ a_0.g[196]] = g[197] ^ g[198];
                byArray[a_0.g[199] ^ a_0.g[200]] = g[201] ^ g[202];
                byArray[a_0.g[203] ^ a_0.g[204]] = g[205] ^ g[206];
                byArray[a_0.g[207] ^ a_0.g[208]] = g[209] ^ g[210];
                byArray[a_0.g[211] ^ a_0.g[212]] = g[213] ^ g[214];
                byArray[a_0.g[215] ^ a_0.g[216]] = g[217] ^ g[218];
                objectArray2[a_0.g[152]] = byArray;
            }
            byte[] byArray = (byte[])object3[g[219]];
            if (E == null) {
                byte[] byArray2 = new byte[g[220] ^ g[221]];
                byArray2[a_0.g[222] ^ a_0.g[223]] = g[224] ^ g[225];
                byArray2[a_0.g[226] ^ a_0.g[227]] = g[228] ^ g[229];
                byArray2[a_0.g[230] ^ a_0.g[231]] = g[232] ^ g[233];
                byArray2[a_0.g[234] ^ a_0.g[235]] = g[236] ^ g[237];
                byArray2[a_0.g[238] ^ a_0.g[239]] = g[240] ^ g[241];
                byArray2[a_0.g[242] ^ a_0.g[243]] = g[244] ^ g[245];
                byArray2[a_0.g[246] ^ a_0.g[247]] = g[248] ^ g[249];
                byArray2[a_0.g[250] ^ a_0.g[251]] = g[252] ^ g[253];
                byArray2[a_0.g[254] ^ a_0.g[255]] = g[256] ^ g[257];
                byArray2[a_0.g[258] ^ a_0.g[259]] = g[260] ^ g[261];
                byArray2[a_0.g[262] ^ a_0.g[263]] = g[264] ^ g[265];
                byArray2[a_0.g[266] ^ a_0.g[267]] = g[268] ^ g[269];
                byArray2[a_0.g[270] ^ a_0.g[271]] = g[272] ^ g[273];
                byArray2[a_0.g[274] ^ a_0.g[275]] = g[276] ^ g[277];
                byArray2[a_0.g[278] ^ a_0.g[279]] = g[280] ^ g[281];
                byArray2[a_0.g[282] ^ a_0.g[283]] = g[284] ^ g[285];
                byArray2[a_0.g[286] ^ a_0.g[287]] = g[288] ^ g[289];
                byArray2[a_0.g[290] ^ a_0.g[291]] = g[292] ^ g[293];
                byArray2[a_0.g[294] ^ a_0.g[295]] = g[296] ^ g[297];
                byArray2[a_0.g[298] ^ a_0.g[299]] = g[300] ^ g[301];
                byArray2[a_0.g[302] ^ a_0.g[303]] = g[304] ^ g[305];
                byArray2[a_0.g[306] ^ a_0.g[307]] = g[308] ^ g[309];
                byArray2[a_0.g[310] ^ a_0.g[311]] = g[312] ^ g[313];
                byArray2[a_0.g[314] ^ a_0.g[315]] = g[316] ^ g[317];
                byArray2[a_0.g[318] ^ a_0.g[319]] = g[320] ^ g[321];
                byArray2[a_0.g[322] ^ a_0.g[323]] = g[324] ^ g[325];
                byArray2[a_0.g[326] ^ a_0.g[327]] = g[328] ^ g[329];
                byArray2[a_0.g[330] ^ a_0.g[331]] = g[332] ^ g[333];
                byArray2[a_0.g[334] ^ a_0.g[335]] = g[336] ^ g[337];
                byArray2[a_0.g[338] ^ a_0.g[339]] = g[340] ^ g[341];
                byArray2[a_0.g[342] ^ a_0.g[343]] = g[344] ^ g[345];
                byArray2[a_0.g[346] ^ a_0.g[347]] = g[348] ^ g[349];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, g[350], byArray3, g[351], byArray.length);
                System.arraycopy(byArray2, g[352], byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[g[353]];
                if (object4 == null) {
                    char[] cArray = "\u92ad\u93df\u93d0\u93d9\u93db\u93cf\u9124\u92b6\u9289\u92b5\u93d5\u92b2\u92be\u92b8\u92a8\u93d5\u93de\u93ce".toCharArray();
                    for (int i = g[354]; i < g[355]; ++i) {
                        int n2 = cArray[i];
                        n2 ^= g[356];
                        n2 ^= g[357];
                        n2 += g[358];
                        n2 ^= g[359];
                        n2 ^= g[360];
                        n2 += g[361];
                        n2 -= g[362];
                        n2 += g[363];
                        n2 ^= g[364];
                        cArray[i] = (char)(n2 += g[365]);
                    }
                    object4 = a_0.A()[a_0.g[366]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[g[367]];
                byArray4[a_0.g[368]] = g[369];
                byArray4[a_0.g[370]] = g[371];
                byArray4[a_0.g[372]] = g[373];
                byArray4[a_0.g[374]] = g[375];
                byArray4[a_0.g[376]] = g[377];
                byArray4[a_0.g[378]] = g[379];
                byArray4[a_0.g[380]] = g[381];
                byArray4[a_0.g[382]] = g[383];
                byArray4[a_0.g[384]] = g[385];
                byArray4[a_0.g[386]] = g[387];
                byArray4[a_0.g[388]] = g[389];
                byArray4[a_0.g[390]] = g[391];
                byArray4[a_0.g[392]] = g[393];
                byArray4[a_0.g[394]] = g[395];
                byArray4[a_0.g[396]] = g[397];
                byArray4[a_0.g[398]] = g[399];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 11, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u4f14\u4f18\u4f2e".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 += 43488;
                        n3 -= 17410;
                        n3 += 30980;
                        n3 -= 2885;
                        n3 ^= 0xAAE;
                        n3 ^= 0xB893;
                        n3 += 10708;
                        n3 -= 27476;
                        n3 += 60474;
                        n3 ^= 0xA83C;
                        n3 -= 62845;
                        n3 -= 13533;
                        cArray[i] = (char)(n3 -= 26847);
                    }
                    object5 = a_0.A()[2] = new String(cArray);
                }
                E = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = a_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u1edf\u2063\u1f91\u1ead\u2061\u207c\u2061\u1ead\u2072\u2069\u2061\u1f91\u2073\u2072\u207f\u1f36\u1f36\u1f87\u2068\u1f85".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 37248;
                    n4 ^= 0xB593;
                    n4 += 7141;
                    n4 ^= 0xDCB5;
                    n4 -= 8454;
                    n4 += 63527;
                    n4 += 24344;
                    n4 ^= 0xF67B;
                    n4 += 5596;
                    n4 ^= 0x2C0D;
                    n4 -= 12367;
                    cArray[i] = (char)(n4 -= 50847);
                }
                object6 = a_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)E), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = F;
        if (F == null) {
            F = new Object[4];
            objectArray = F;
        }
        return objectArray;
    }

    public static void b() {
        g = new int[0xCEC6 ^ 0xCF56];
        a_0.g[0xD913 ^ 0xD9A8] = 0x11D4 ^ 0xD9A8;
        a_0.g[0x11CF ^ 0x1183] = 0x11AF ^ 0x1183;
        a_0.g[0x8EB8 ^ 0x8F88] = 0xFC4E ^ 0x8F88;
        a_0.g[0x1923 ^ 0x19B9] = 0x5E04 ^ 0x19B9;
        a_0.g[0x2D6A ^ 0x2D03] = 0xFFFFD2BA ^ 0x2D03;
        a_0.g[0x71AF ^ 0x7083] = 0xE772 ^ 0x7083;
        a_0.g[0x501C ^ 0x512B] = 0xAD8 ^ 0x512B;
        a_0.g[0xC238 ^ 0xC36D] = 0x8790 ^ 0xC36D;
        a_0.g[0x8502 ^ 0x847B] = 0x840C ^ 0x847B;
        a_0.g[0xDA28 ^ 0xDB42] = 0x58AE ^ 0xDB42;
        a_0.g[0x32F4 ^ 0x33D6] = 0x6D5A ^ 0x33D6;
        a_0.g[0x5A7D ^ 0x5BF4] = 0x5BB4 ^ 0x5BF4;
        a_0.g[0x10D53 ^ 0x10D97] = 0x174FC ^ 0x10D97;
        a_0.g[0x3BA9 ^ 0x3B03] = 0xB0E5 ^ 0x3B03;
        a_0.g[0x816 ^ 0x815] = 0xFFFFF7D4 ^ 0x815;
        a_0.g[0x87CB ^ 0x877B] = 0x3C38 ^ 0x877B;
        a_0.g[0xC446 ^ 0xC4E9] = 0x7FA1 ^ 0xC4E9;
        a_0.g[0x5FA7 ^ 0x5F5D] = 0x2FF9 ^ 0x5F5D;
        a_0.g[0x762D ^ 0x7605] = 0x7634 ^ 0x7605;
        a_0.g[0xFB1D ^ 0xFB69] = 0xFFFF04CA ^ 0xFB69;
        a_0.g[0x82E1 ^ 0x83E0] = 0x4BBD ^ 0x83E0;
        a_0.g[0xC88B ^ 0xC9DD] = 0xF533 ^ 0xC9DD;
        a_0.g[0xDC05 ^ 0xDC57] = 0x57C3 ^ 0xDC57;
        a_0.g[0x6976 ^ 0x6874] = 0x9F9A ^ 0x6874;
        a_0.g[0xE5D8 ^ 0xE4E9] = 0x9733 ^ 0xE4E9;
        a_0.g[0xD838 ^ 0xD858] = 0xFFFF2761 ^ 0xD858;
        a_0.g[0x5BAC ^ 0x5B38] = 0x5B3A ^ 0x5B38;
        a_0.g[0xFEE8 ^ 0xFF9B] = 0xFFFF0007 ^ 0xFF9B;
        a_0.g[0x7B70 ^ 0x7B2A] = 0xFFFF849F ^ 0x7B2A;
        a_0.g[0x301E ^ 0x314D] = 0x75B0 ^ 0x314D;
        a_0.g[0x5F52 ^ 0x5F61] = 0x5F42 ^ 0x5F61;
        a_0.g[0xB403 ^ 0xB4F7] = 0xFFFFDE30 ^ 0xB4F7;
        a_0.g[0xB29C ^ 0xB27A] = 0x1880 ^ 0xB27A;
        a_0.g[0x3D9B ^ 0x3D57] = 0xB49B ^ 0x3D57;
        a_0.g[0x1439 ^ 0x1533] = 0x7A47 ^ 0x1533;
        a_0.g[0xA1E3 ^ 0xA08E] = 0x2C01 ^ 0xA08E;
        a_0.g[0x352E ^ 0x35E4] = 0xE3F1 ^ 0x35E4;
        a_0.g[0xD580 ^ 0xD500] = 0xFFFF2AA3 ^ 0xD500;
        a_0.g[0xCCC7 ^ 0xCC0E] = 0xFFFFE5C0 ^ 0xCC0E;
        a_0.g[0xF741 ^ 0xF706] = 0xF707 ^ 0xF706;
        a_0.g[0xDF29 ^ 0xDFC9] = 0xFFFF1F95 ^ 0xDFC9;
        a_0.g[0xEBE6 ^ 0xEB4D] = 0x4206 ^ 0xEB4D;
        a_0.g[0x8CFD ^ 0x8CC4] = 0xFFFF7388 ^ 0x8CC4;
        a_0.g[0xBFB ^ 0xBAD] = 0x99C1 ^ 0xBAD;
        a_0.g[0xBFE9 ^ 0xBFCA] = 0xFFFF4069 ^ 0xBFCA;
        a_0.g[0xD055 ^ 0xD030] = 0xD00A ^ 0xD030;
        a_0.g[0x3227 ^ 0x322B] = 0xFFFFCDE2 ^ 0x322B;
        a_0.g[0x5DE1 ^ 0x5C61] = 0x5C62 ^ 0x5C61;
        a_0.g[0xBCC3 ^ 0xBDA4] = 0xCA4C ^ 0xBDA4;
        a_0.g[0x327F ^ 0x32B7] = 0xE4A2 ^ 0x32B7;
        a_0.g[0xAD17 ^ 0xAD8B] = 0x9CC4 ^ 0xAD8B;
        a_0.g[0xD663 ^ 0xD6DF] = 0x1EA5 ^ 0xD6DF;
        a_0.g[0xF37D ^ 0xF218] = 0xBC6A ^ 0xF218;
        a_0.g[0x150C ^ 0x15D2] = 0x2A37 ^ 0x15D2;
        a_0.g[0x3B9D ^ 0x3BC5] = 0xCA4A ^ 0x3BC5;
        a_0.g[0x1031C ^ 0x103F1] = 0x1DCEF ^ 0x103F1;
        a_0.g[0x54A4 ^ 0x5470] = 0x3378 ^ 0x5470;
        a_0.g[0x710D ^ 0x719E] = 0x719F ^ 0x719E;
        a_0.g[0x48EC ^ 0x49B7] = 0x84DB ^ 0x49B7;
        a_0.g[0x77DF ^ 0x769B] = 0xFFFFED4A ^ 0x769B;
        a_0.g[0x4888 ^ 0x4835] = 0x801F ^ 0x4835;
        a_0.g[0x7282 ^ 0x73FF] = 0x73C2 ^ 0x73FF;
        a_0.g[0xC985 ^ 0xC8FD] = 0xC8FC ^ 0xC8FD;
        a_0.g[0xB6AC ^ 0xB721] = 0xFFFF48FD ^ 0xB721;
        a_0.g[0xBA7 ^ 0xB18] = 0xCF35 ^ 0xB18;
        a_0.g[0xE7C7 ^ 0xE714] = 0x801B ^ 0xE714;
        a_0.g[0xF222 ^ 0xF23A] = 0xFFFF0DCC ^ 0xF23A;
        a_0.g[0xFD12 ^ 0xFDFA] = 0x5708 ^ 0xFDFA;
        a_0.g[0x10390 ^ 0x102D8] = 0x13DA3 ^ 0x102D8;
        a_0.g[0x3791 ^ 0x3795] = 0xFFFFC810 ^ 0x3795;
        a_0.g[0xF676 ^ 0xF73A] = 0xFFFF2820 ^ 0xF73A;
        a_0.g[0xFC98 ^ 0xFDB0] = 0xFFFF87C3 ^ 0xFDB0;
        a_0.g[0x8651 ^ 0x8700] = 0x4A10 ^ 0x8700;
        a_0.g[0x9CCF ^ 0x9DBF] = 0x9DB3 ^ 0x9DBF;
        a_0.g[0xECC6 ^ 0xECAE] = 0xEC8B ^ 0xECAE;
        a_0.g[0x468C ^ 0x47A8] = 0xFFFFE690 ^ 0x47A8;
        a_0.g[0xF996 ^ 0xF8E8] = 0xF8E6 ^ 0xF8E8;
        a_0.g[0x7229 ^ 0x72AB] = 0xFFFF8D15 ^ 0x72AB;
        a_0.g[0x33BF ^ 0x33FE] = 0xFFFFCC2F ^ 0x33FE;
        a_0.g[0x55EB ^ 0x55FA] = 0x559E ^ 0x55FA;
        a_0.g[0xF660 ^ 0xF6F7] = 0xF6F6 ^ 0xF6F7;
        a_0.g[0x8E3B ^ 0x8F16] = 0x18A4 ^ 0x8F16;
        a_0.g[0xB692 ^ 0xB787] = 0xA22A ^ 0xB787;
        a_0.g[0xB381 ^ 0xB2AE] = 0xC174 ^ 0xB2AE;
        a_0.g[0xCB ^ 0x149] = 0x14E ^ 0x149;
        a_0.g[0x9ACE ^ 0x9A12] = 0xD78F ^ 0x9A12;
        a_0.g[0xFE51 ^ 0xFF5A] = 0x9029 ^ 0xFF5A;
        a_0.g[0x614A ^ 0x6167] = 0x6146 ^ 0x6167;
        a_0.g[0xF8A9 ^ 0xF921] = 0xF925 ^ 0xF921;
        a_0.g[0x10F4E ^ 0x10F0C] = 0xFFFEF0DB ^ 0x10F0C;
        a_0.g[0xDE7 ^ 0xD35] = 0x6C34 ^ 0xD35;
        a_0.g[0x56D7 ^ 0x5612] = 0xFFFFD0F8 ^ 0x5612;
        a_0.g[0x10357 ^ 0x103F0] = 0x18814 ^ 0x103F0;
        a_0.g[0x7F08 ^ 0x7FBC] = 0xD022 ^ 0x7FBC;
        a_0.g[0x15EA ^ 0x146D] = 0x1473 ^ 0x146D;
        a_0.g[0x191D ^ 0x1837] = 0x8F87 ^ 0x1837;
        a_0.g[0x101E6 ^ 0x10136] = 0x16037 ^ 0x10136;
        a_0.g[0xE164 ^ 0xE16E] = 0xE156 ^ 0xE16E;
        a_0.g[0x1038A ^ 0x1037F] = 0x1964A ^ 0x1037F;
        a_0.g[0x1D0B ^ 0x1D30] = 0x1D5B ^ 0x1D30;
        a_0.g[0x49D8 ^ 0x48B1] = 0x2488 ^ 0x48B1;
        a_0.g[0x7007 ^ 0x7028] = 0x7014 ^ 0x7028;
        a_0.g[0x2D9F ^ 0x2D1C] = 0x2D27 ^ 0x2D1C;
        a_0.g[0xF9D6 ^ 0xF888] = 0xF888 ^ 0xF888;
        a_0.g[0x678 ^ 0x6DD] = 0xFFFF70CF ^ 0x6DD;
        a_0.g[0x3A83 ^ 0x3BF4] = 0x3BBE ^ 0x3BF4;
        a_0.g[0x6EF0 ^ 0x6FE6] = 0xAF76 ^ 0x6FE6;
        a_0.g[0x1F30 ^ 0x1F88] = 0x26F7 ^ 0x1F88;
        a_0.g[0xB98D ^ 0xB983] = 0xFFFF4652 ^ 0xB983;
        a_0.g[0x6FA1 ^ 0x6F7A] = 0x6F7A ^ 0x6F7A;
        a_0.g[0x100F ^ 0x107F] = 0xFFFFEFA5 ^ 0x107F;
        a_0.g[0x64B6 ^ 0x6582] = 0xE7C3 ^ 0x6582;
        a_0.g[0xF616 ^ 0xF706] = 0x95E6 ^ 0xF706;
        a_0.g[0xC7AB ^ 0xC7DD] = 0xC7BD ^ 0xC7DD;
        a_0.g[0x667D ^ 0x6693] = 0x6FA5 ^ 0x6693;
        a_0.g[0xD162 ^ 0xD035] = 0xECD1 ^ 0xD035;
        a_0.g[0xA0A0 ^ 0xA0DD] = 0xA096 ^ 0xA0DD;
        a_0.g[0xAA8E ^ 0xABCF] = 0xAB36 ^ 0xABCF;
        a_0.g[0x948E ^ 0x95FB] = 0x95D3 ^ 0x95FB;
        a_0.g[0x10F89 ^ 0x10EEB] = 0x10EEB ^ 0x10EEB;
        a_0.g[0x9A30 ^ 0x9B4C] = 0x9B47 ^ 0x9B4C;
        a_0.g[0xBE68 ^ 0xBE6E] = 0xBE60 ^ 0xBE6E;
        a_0.g[0xD90F ^ 0xD970] = 0xD957 ^ 0xD970;
        a_0.g[0xC69E ^ 0xC636] = 0x4DD0 ^ 0xC636;
        a_0.g[0x6B6 ^ 0x6B3] = 0x6AF ^ 0x6B3;
        a_0.g[0xBDE8 ^ 0xBD84] = 0xFFFF4203 ^ 0xBD84;
        a_0.g[0x644E ^ 0x6496] = 0x3342 ^ 0x6496;
        a_0.g[0x9329 ^ 0x926A] = 0xF62E ^ 0x926A;
        a_0.g[0x51F5 ^ 0x50EC] = 0x907A ^ 0x50EC;
        a_0.g[0x9A2F ^ 0x9AED] = 0x5EC0 ^ 0x9AED;
        a_0.g[0xBC7C ^ 0xBC7B] = 0xFFFF43AE ^ 0xBC7B;
        a_0.g[0xA106 ^ 0xA182] = 0xFFFF5E49 ^ 0xA182;
        a_0.g[0xF6E7 ^ 0xF793] = 0xF79C ^ 0xF793;
        a_0.g[0x982 ^ 0x9E8] = 0xFFFFF630 ^ 0x9E8;
        a_0.g[0x9F8B ^ 0x9E84] = 0xFC19 ^ 0x9E84;
        a_0.g[0x4758 ^ 0x47F1] = 0xCC43 ^ 0x47F1;
        a_0.g[0x5960 ^ 0x5913] = 0xFFFFA680 ^ 0x5913;
        a_0.g[0xDC33 ^ 0xDDB8] = 0xDDBD ^ 0xDDB8;
        a_0.g[0x7FE1 ^ 0x7FAF] = 0xABDD ^ 0x7FAF;
        a_0.g[0x1BEC ^ 0x1B4A] = 0x92A4 ^ 0x1B4A;
        a_0.g[0x7302 ^ 0x73AC] = 0xDAEE ^ 0x73AC;
        a_0.g[0x819E ^ 0x8110] = 0xFFFF7EAC ^ 0x8110;
        a_0.g[0x9999 ^ 0x994F] = 0xFE47 ^ 0x994F;
        a_0.g[0x6867 ^ 0x6955] = 0xEB13 ^ 0x6955;
        a_0.g[0x109F4 ^ 0x10906] = 0x19C37 ^ 0x10906;
        a_0.g[0xEE28 ^ 0xEF65] = 0xCFD2 ^ 0xEF65;
        a_0.g[0x3355 ^ 0x3300] = 0x350B ^ 0x3300;
        a_0.g[0xD6D4 ^ 0xD6B5] = 0xFFFF2932 ^ 0xD6B5;
        a_0.g[0x75CA ^ 0x74ED] = 0xF15C ^ 0x74ED;
        a_0.g[0x19A9 ^ 0x188A] = 0x4616 ^ 0x188A;
        a_0.g[0x2BE9 ^ 0x2BCC] = 0x2B9D ^ 0x2BCC;
        a_0.g[0xDFA8 ^ 0xDE86] = 0xAD50 ^ 0xDE86;
        a_0.g[0x52BA ^ 0x52F5] = 0x4846 ^ 0x52F5;
        a_0.g[0x2092 ^ 0x2047] = 0xFFFFB8A5 ^ 0x2047;
        a_0.g[0x3683 ^ 0x3669] = 0xE962 ^ 0x3669;
        a_0.g[0x2F42 ^ 0x2FCA] = 0xFFFFD038 ^ 0x2FCA;
        a_0.g[0x5770 ^ 0x563A] = 0x7695 ^ 0x563A;
        a_0.g[0xA903 ^ 0xA95C] = 0xA933 ^ 0xA95C;
        a_0.g[0x3654 ^ 0x36E7] = 0x997A ^ 0x36E7;
        a_0.g[0x1D6B ^ 0x1C4B] = 0x2313 ^ 0x1C4B;
        a_0.g[0x10BB5 ^ 0x10BF5] = 0xFFFEF46A ^ 0x10BF5;
        a_0.g[0x6CAB ^ 0x6DE9] = 0x9A6 ^ 0x6DE9;
        a_0.g[0x9A60 ^ 0x9ABD] = 0xD700 ^ 0x9ABD;
        a_0.g[0x458F ^ 0x44CA] = 0x208E ^ 0x44CA;
        a_0.g[0x8581 ^ 0x8581] = 0xFFFF7AE9 ^ 0x8581;
        a_0.g[0xE5D7 ^ 0xE4B1] = 0xD07 ^ 0xE4B1;
        a_0.g[0x130 ^ 0x1BF] = 0xFFFFFE5B ^ 0x1BF;
        a_0.g[0xB16E ^ 0xB174] = 0xFFFF4EC4 ^ 0xB174;
        a_0.g[0xE81A ^ 0xE917] = 0x8664 ^ 0xE917;
        a_0.g[0x1EF2 ^ 0x1FE0] = 0xA56 ^ 0x1FE0;
        a_0.g[0x2CA4 ^ 0x2C1E] = 0x1561 ^ 0x2C1E;
        a_0.g[0xDBA5 ^ 0xDACD] = 0xF265 ^ 0xDACD;
        a_0.g[0xB8B9 ^ 0xB8C3] = 0xFFFF4711 ^ 0xB8C3;
        a_0.g[0xB0D ^ 0xB47] = 0xB47 ^ 0xB47;
        a_0.g[0x4407 ^ 0x457C] = 0xFFFFBAB4 ^ 0x457C;
        a_0.g[0x921F ^ 0x924F] = 0x343C ^ 0x924F;
        a_0.g[0x7D8B ^ 0x7CB8] = 0xFEFB ^ 0x7CB8;
        a_0.g[0xDB67 ^ 0xDBEE] = 0xFFFF241F ^ 0xDBEE;
        a_0.g[0xF96E ^ 0xF853] = 0xE241 ^ 0xF853;
        a_0.g[0x4A0B ^ 0x4A66] = 0xFFFFB5FC ^ 0x4A66;
        a_0.g[0xEF09 ^ 0xEF5D] = 0x1797 ^ 0xEF5D;
        a_0.g[0xE0AC ^ 0xE1B4] = 0x2153 ^ 0xE1B4;
        a_0.g[0x678F ^ 0x66D0] = 0x66D0 ^ 0x66D0;
        a_0.g[0xB06 ^ 0xB20] = 0xFFFFF4C2 ^ 0xB20;
        a_0.g[0x5928 ^ 0x5849] = 0x5848 ^ 0x5849;
        a_0.g[0x575B ^ 0x5784] = 0x687E ^ 0x5784;
        a_0.g[0x877B ^ 0x867F] = 0x71AC ^ 0x867F;
        a_0.g[0x269F ^ 0x2711] = 0x2719 ^ 0x2711;
        a_0.g[0xF84D ^ 0xF852] = 0xF862 ^ 0xF852;
        a_0.g[0x30DE ^ 0x3048] = 0x3049 ^ 0x3048;
        a_0.g[0x3C42 ^ 0x3D64] = 0xB8D6 ^ 0x3D64;
        a_0.g[0x8817 ^ 0x885E] = 0x885C ^ 0x885E;
        a_0.g[0xA11F ^ 0xA108] = 0xFFFF5EBF ^ 0xA108;
        a_0.g[0xD345 ^ 0xD37F] = 0xD335 ^ 0xD37F;
        a_0.g[0x3ECB ^ 0x3EAC] = 0xFFFFC113 ^ 0x3EAC;
        a_0.g[8 ^ 0x14E] = 0x3E0F ^ 0x14E;
        a_0.g[0xDB52 ^ 0xDBD3] = 0xFFFF2470 ^ 0xDBD3;
        a_0.g[0xF591 ^ 0xF4CD] = 0x39B0 ^ 0xF4CD;
        a_0.g[0xE930 ^ 0xE941] = 0xFFFF16D6 ^ 0xE941;
        a_0.g[0x2B1F ^ 0x2A36] = 0xAF87 ^ 0x2A36;
        a_0.g[0xB56A ^ 0xB513] = 0xB577 ^ 0xB513;
        a_0.g[0x90A0 ^ 0x90E6] = 0x90E6 ^ 0x90E6;
        a_0.g[0x85DD ^ 0x8543] = 0xB40C ^ 0x8543;
        a_0.g[0x57FA ^ 0x5771] = 0x5741 ^ 0x5771;
        a_0.g[0x4B31 ^ 0x4B39] = 0xFFFFB4FA ^ 0x4B39;
        a_0.g[0x7488 ^ 0x7592] = 0x172B3 ^ 0x7592;
        a_0.g[0x869D ^ 0x8680] = 0xFFFF7955 ^ 0x8680;
        a_0.g[0xACCC ^ 0xAC2B] = 0x6D0 ^ 0xAC2B;
        a_0.g[0x8C2C ^ 0x8D14] = 0xFFFF2907 ^ 0x8D14;
        a_0.g[0x905 ^ 0x92F] = 0x917 ^ 0x92F;
        a_0.g[0xEA3D ^ 0xEAFE] = 0x9394 ^ 0xEAFE;
        a_0.g[0xCB31 ^ 0xCBBC] = 0xFFFF3444 ^ 0xCBBC;
        a_0.g[0x62C ^ 0x63F] = 0x64A ^ 0x63F;
        a_0.g[0xA0E3 ^ 0xA1BB] = 0xFFFF62FF ^ 0xA1BB;
        a_0.g[0x9B7B ^ 0x9A3B] = 0x9AD5 ^ 0x9A3B;
        a_0.g[0x25AC ^ 0x2557] = 0x55EA ^ 0x2557;
        a_0.g[0x7142 ^ 0x7079] = 0x6A6B ^ 0x7079;
        a_0.g[0xAE01 ^ 0xAE5D] = 0xAE62 ^ 0xAE5D;
        a_0.g[0xA344 ^ 0xA358] = 0xA34D ^ 0xA358;
        a_0.g[0xBED0 ^ 0xBE20] = 0xFFFF4896 ^ 0xBE20;
        a_0.g[0x1065D ^ 0x10776] = 0x190C4 ^ 0x10776;
        a_0.g[0xB715 ^ 0xB7AB] = 0x7FD1 ^ 0xB7AB;
        a_0.g[0x103C9 ^ 0x102A2] = 0x10B5F ^ 0x102A2;
        a_0.g[0x3F65 ^ 0x3F7C] = 0x3F1A ^ 0x3F7C;
        a_0.g[0x418C ^ 0x419C] = 0x41CC ^ 0x419C;
        a_0.g[0x1B63 ^ 0x1B52] = 0xFFFFE4DA ^ 0x1B52;
        a_0.g[0x4317 ^ 0x43FB] = 0xFFFF633D ^ 0x43FB;
        a_0.g[0x60F ^ 0x6F8] = 0x6099 ^ 0x6F8;
        a_0.g[0x10ADC ^ 0x10A39] = 0x1F440 ^ 0x10A39;
        a_0.g[0xDC6C ^ 0xDD72] = 0xE201 ^ 0xDD72;
        a_0.g[0xF1C5 ^ 0xF08C] = 0xCFDE ^ 0xF08C;
        a_0.g[0x49D8 ^ 0x498B] = 0x3EFF ^ 0x498B;
        a_0.g[0x6556 ^ 0x644A] = 0xFFFE9CC3 ^ 0x644A;
        a_0.g[0xBAB1 ^ 0xBA6B] = 0xEDBF ^ 0xBA6B;
        a_0.g[0x5BB8 ^ 0x5B5C] = 0xA569 ^ 0x5B5C;
        a_0.g[0x6330 ^ 0x6385] = 0xCC69 ^ 0x6385;
        a_0.g[0xC8A1 ^ 0xC895] = 0xFFFF3707 ^ 0xC895;
        a_0.g[0xF56C ^ 0xF5FD] = 0xFFFF0A73 ^ 0xF5FD;
        a_0.g[0xD141 ^ 0xD042] = 0x27B0 ^ 0xD042;
        a_0.g[0xA824 ^ 0xA8A2] = 0xFFFF577E ^ 0xA8A2;
        a_0.g[0xF71C ^ 0xF60F] = 0xE3A2 ^ 0xF60F;
        a_0.g[0x9E9B ^ 0x9E50] = 0x1792 ^ 0x9E50;
        a_0.g[0xAF24 ^ 0xAFEA] = 0x2626 ^ 0xAFEA;
        a_0.g[0x38A5 ^ 0x3807] = 0x1516 ^ 0x3807;
        a_0.g[0xC35 ^ 0xC71] = 0xFFFFF3A1 ^ 0xC71;
        a_0.g[0x272E ^ 0x278D] = 0xAE6C ^ 0x278D;
        a_0.g[0xCF4F ^ 0xCF31] = 0xFFFF30D5 ^ 0xCF31;
        a_0.g[0x7125 ^ 0x7062] = 0x4F30 ^ 0x7062;
        a_0.g[0x922E ^ 0x9311] = 0x93E8 ^ 0x9311;
        a_0.g[0x1AEF ^ 0x1A74] = 0x2B3E ^ 0x1A74;
        a_0.g[0xBCC1 ^ 0xBC82] = 0xBCFB ^ 0xBC82;
        a_0.g[0xD0AC ^ 0xD0CF] = 0xFFFF2FAB ^ 0xD0CF;
        a_0.g[0x3188 ^ 0x309C] = 0x256D ^ 0x309C;
        a_0.g[0x329C ^ 0x32D9] = 0x32DA ^ 0x32D9;
        a_0.g[0xA5C2 ^ 0xA575] = 0x9C06 ^ 0xA575;
        a_0.g[0x6A7C ^ 0x6A00] = 0xFFFF95FE ^ 0x6A00;
        a_0.g[0x4ACA ^ 0x4AD8] = 0xFFFFB53C ^ 0x4AD8;
        a_0.g[0xEA5E ^ 0xEA2C] = 0xFFFF15C2 ^ 0xEA2C;
        a_0.g[0x5F7 ^ 0x5AC] = 0x5F8 ^ 0x5AC;
        a_0.g[0x63FE ^ 0x6288] = 0x6281 ^ 0x6288;
        a_0.g[0x9EED ^ 0x9E89] = 0xFFFF6114 ^ 0x9E89;
        a_0.g[0xA87A ^ 0xA88C] = 0xCEE0 ^ 0xA88C;
        a_0.g[0x8576 ^ 0x847F] = 0xECB2 ^ 0x847F;
        a_0.g[0xE318 ^ 0xE37A] = 0xFFFF1CE8 ^ 0xE37A;
        a_0.g[0x104BC ^ 0x10538] = 0x10538 ^ 0x10538;
        a_0.g[0x86A8 ^ 0x87F1] = 0xBB15 ^ 0x87F1;
        a_0.g[0x8492 ^ 0x843F] = 0x2D59 ^ 0x843F;
        a_0.g[0x697B ^ 0x69A2] = 0x3E0D ^ 0x69A2;
        a_0.g[0x10509 ^ 0x10528] = 0x1053D ^ 0x10528;
        a_0.g[0xC3F7 ^ 0xC3D0] = 0xC3CC ^ 0xC3D0;
        a_0.g[0x2161 ^ 0x2005] = 0x3914 ^ 0x2005;
        a_0.g[0xFE06 ^ 0xFE9E] = 0xFE9E ^ 0xFE9E;
        a_0.g[0x3F51 ^ 0x3FC3] = 0xFFFFC003 ^ 0x3FC3;
        a_0.g[0x2B7F ^ 0x2BF8] = 0x2BE7 ^ 0x2BF8;
        a_0.g[0x47D9 ^ 0x47F7] = 0x47F2 ^ 0x47F7;
        a_0.g[0xA853 ^ 0xA826] = 0xFFFF5777 ^ 0xA826;
        a_0.g[0x10E52 ^ 0x10E6C] = 0x10E57 ^ 0x10E6C;
        a_0.g[0x3F69 ^ 0x3F88] = 0x72 ^ 0x3F88;
        a_0.g[0xEEAD ^ 0xEEAC] = 0xEE9C ^ 0xEEAC;
        a_0.g[0xB4C3 ^ 0xB5CF] = 0xFFFF250E ^ 0xB5CF;
        a_0.g[0xA59 ^ 0xB12] = 0x2BA5 ^ 0xB12;
        a_0.g[0xFCB8 ^ 0xFC93] = 0xFCD2 ^ 0xFC93;
        a_0.g[0xD6DF ^ 0xD63C] = 0x2845 ^ 0xD63C;
        a_0.g[0x7BB8 ^ 0x7BB3] = 0xFFFF8465 ^ 0x7BB3;
        a_0.g[0xA74C ^ 0xA745] = 0xFFFF58FB ^ 0xA745;
        a_0.g[0x3246 ^ 0x3291] = 0x6541 ^ 0x3291;
        a_0.g[0xE984 ^ 0xE9EF] = 0xFFFF162E ^ 0xE9EF;
        a_0.g[0x5FD8 ^ 0x5F1E] = 0x2675 ^ 0x5F1E;
        a_0.g[0x28EA ^ 0x296C] = 0x296E ^ 0x296C;
        a_0.g[0xEBB ^ 0xF31] = 0xF34 ^ 0xF31;
        a_0.g[0x65D7 ^ 0x65D8] = 0x650C ^ 0x65D8;
        a_0.g[0x36C2 ^ 0x3689] = 0x3689 ^ 0x3689;
        a_0.g[0x6A2D ^ 0x6AB2] = 0x47A9 ^ 0x6AB2;
        a_0.g[0x5CF6 ^ 0x5C57] = 0x713E ^ 0x5C57;
        a_0.g[0xE84B ^ 0xE972] = 0xB281 ^ 0xE972;
        a_0.g[0x1C24 ^ 0x1DAB] = 0xFFFFE248 ^ 0x1DAB;
        a_0.g[0x91E5 ^ 0x90F4] = 0xF269 ^ 0x90F4;
        a_0.g[0x88D ^ 0x893] = 0x811 ^ 0x893;
        a_0.g[0x3AEB ^ 0x3BA5] = 0xF6A1 ^ 0x3BA5;
        a_0.g[0x4233 ^ 0x4282] = 0xF9EF ^ 0x4282;
        a_0.g[0x2F78 ^ 0x2F17] = 0x2F7A ^ 0x2F17;
        a_0.g[0xB62D ^ 0xB636] = 0xFFFF49D6 ^ 0xB636;
        a_0.g[0xAB73 ^ 0xAB8E] = 0xDB33 ^ 0xAB8E;
        a_0.g[0xF63C ^ 0xF647] = 0xF66C ^ 0xF647;
        a_0.g[0xF831 ^ 0xF80E] = 0xFFFF07A1 ^ 0xF80E;
        a_0.g[0xB18B ^ 0xB14C] = 0x6751 ^ 0xB14C;
        a_0.g[0xDD7B ^ 0xDC17] = 0x4CD8 ^ 0xDC17;
        a_0.g[0x2240 ^ 0x2226] = 0x22A0 ^ 0x2226;
        a_0.g[0xF0C5 ^ 0xF03B] = 0x3866 ^ 0xF03B;
        a_0.g[0x6C4D ^ 0x6D45] = 0x583 ^ 0x6D45;
        a_0.g[0xE911 ^ 0xE931] = 0xFFFF16FF ^ 0xE931;
        a_0.g[0xEA40 ^ 0xEABC] = 0xFFFF6590 ^ 0xEABC;
        a_0.g[0x9439 ^ 0x956B] = 0xD188 ^ 0x956B;
        a_0.g[0xECF3 ^ 0xEDCD] = 0xED3D ^ 0xEDCD;
        a_0.g[0x39EC ^ 0x386F] = 0xFFFFC79F ^ 0x386F;
        a_0.g[0x99C2 ^ 0x98A1] = 0x98B3 ^ 0x98A1;
        a_0.g[0x4CD7 ^ 0x4C42] = 0x4C42 ^ 0x4C42;
        a_0.g[0x8958 ^ 0x8847] = 0xB73C ^ 0x8847;
        a_0.g[0x901D ^ 0x90B9] = 0x1957 ^ 0x90B9;
        a_0.g[0x2E ^ 0x40] = 0x5C ^ 0x40;
        a_0.g[0x5EEA ^ 0x5E08] = 0xA06C ^ 0x5E08;
        a_0.g[0x1676 ^ 0x170C] = 0x1706 ^ 0x170C;
        a_0.g[0xF833 ^ 0xF827] = 0xF81E ^ 0xF827;
        a_0.g[0x5B23 ^ 0x5B6B] = 0x5B6B ^ 0x5B6B;
        a_0.g[0x9573 ^ 0x9582] = 0x9CA2 ^ 0x9582;
        a_0.g[0x2620 ^ 0x2751] = 0x2770 ^ 0x2751;
        a_0.g[0xCAC1 ^ 0xCA2E] = 0xC30E ^ 0xCA2E;
        a_0.g[0xC469 ^ 0xC4EC] = 0xFFFF3B23 ^ 0xC4EC;
        a_0.g[0xD168 ^ 0xD017] = 0xD072 ^ 0xD017;
        a_0.g[0x8F3B ^ 0x8E0D] = 0xD5E4 ^ 0x8E0D;
        a_0.g[0x62BF ^ 0x62AA] = 0x62B1 ^ 0x62AA;
        a_0.g[0x731D ^ 0x7247] = 0xBF3C ^ 0x7247;
        a_0.g[0x1063D ^ 0x10600] = 0xFFFEF9F6 ^ 0x10600;
        a_0.g[0x4F7A ^ 0x4F58] = 0xFFFFB0F6 ^ 0x4F58;
        a_0.g[0x3BDF ^ 0x3B1E] = 0xFF56 ^ 0x3B1E;
        a_0.g[0xE966 ^ 0xE9A9] = 0x88A5 ^ 0xE9A9;
        a_0.g[0x8B9A ^ 0x8B28] = 0x306B ^ 0x8B28;
        a_0.g[0x9394 ^ 0x92C0] = 0xFFFF29B1 ^ 0x92C0;
        a_0.g[0x108C7 ^ 0x1083E] = 0x16E5F ^ 0x1083E;
        a_0.g[0xD217 ^ 0xD347] = 0xFFFFE198 ^ 0xD347;
        a_0.g[0x3B60 ^ 0x3B50] = 0x3B7E ^ 0x3B50;
        a_0.g[0x7FB8 ^ 0x7F69] = 0xFFFFE1A1 ^ 0x7F69;
        a_0.g[0x87AF ^ 0x862E] = 0x8646 ^ 0x862E;
        a_0.g[0x9C25 ^ 0x9CE8] = 0xFFFFEAAB ^ 0x9CE8;
        a_0.g[0x7C4F ^ 0x7C7A] = 0x7C35 ^ 0x7C7A;
        a_0.g[0xBC82 ^ 0xBCB4] = 0xFFFF431F ^ 0xBCB4;
        a_0.g[0x83FF ^ 0x82B0] = 0x4FA0 ^ 0x82B0;
        a_0.g[0xCA35 ^ 0xCB00] = 0x4943 ^ 0xCB00;
        a_0.g[0xC8A9 ^ 0xC88D] = 0xFFFF373E ^ 0xC88D;
        a_0.g[0x838A ^ 0x8297] = 0x185B8 ^ 0x8297;
        a_0.g[0xD9EF ^ 0xD88F] = 0xD88F ^ 0xD88F;
        a_0.g[0x10EF8 ^ 0x10EB5] = 0x1BCB5 ^ 0x10EB5;
        a_0.g[0x1989 ^ 0x18B3] = 0x2B0 ^ 0x18B3;
        a_0.g[0x252 ^ 0x2EB] = 0xFFFFC478 ^ 0x2EB;
        a_0.g[0x4839 ^ 0x494B] = 0x4946 ^ 0x494B;
        a_0.g[0x800C ^ 0x8025] = 0xFFFF7FD6 ^ 0x8025;
        a_0.g[0x5C77 ^ 0x5D72] = 0xAA80 ^ 0x5D72;
        a_0.g[0x87B5 ^ 0x87E4] = 0x4850 ^ 0x87E4;
        a_0.g[0x2C74 ^ 0x2C8C] = 0xFFFFB55A ^ 0x2C8C;
        a_0.g[0x4A4E ^ 0x4A10] = 0xFFFFB5FF ^ 0x4A10;
        a_0.g[0x50A1 ^ 0x51A1] = 0xFFFF6622 ^ 0x51A1;
        a_0.g[0xF9DA ^ 0xF9D8] = 0xF9B0 ^ 0xF9D8;
        a_0.g[0xCC69 ^ 0xCC55] = 0xCC64 ^ 0xCC55;
        a_0.g[0x103C6 ^ 0x102C1] = 0x16A0C ^ 0x102C1;
        a_0.g[0xE5B ^ 0xFD7] = 0xFD1 ^ 0xFD7;
        a_0.g[0x1C1F ^ 0x1C09] = 0xFFFFE3C5 ^ 0x1C09;
        a_0.g[0xE98B ^ 0xE94B] = 0x2D66 ^ 0xE94B;
        a_0.g[0x10CBA ^ 0x10CE3] = 0x10CE3 ^ 0x10CE3;
        a_0.g[0x4FFC ^ 0x4F17] = 0x9009 ^ 0x4F17;
        a_0.g[0xEA0D ^ 0xEA5A] = 0x7054 ^ 0xEA5A;
        a_0.g[0x10193 ^ 0x101EB] = 0xFFFEFE95 ^ 0x101EB;
        a_0.g[0xB7CA ^ 0xB697] = 0x7BFB ^ 0xB697;
        a_0.g[0xCE35 ^ 0xCE95] = 0xE384 ^ 0xCE95;
        a_0.g[0x2253 ^ 0x22AC] = 0xEAF1 ^ 0x22AC;
        a_0.g[0x44A3 ^ 0x44D4] = 0xFFFFBB45 ^ 0x44D4;
        a_0.g[0xF986 ^ 0xF916] = 0xFFFF0678 ^ 0xF916;
        a_0.g[0x9DAB ^ 0x9D58] = 0x86D ^ 0x9D58;
        a_0.g[0x108CE ^ 0x108F9] = 0x10880 ^ 0x108F9;
        a_0.g[0x151F ^ 0x1512] = 0x153A ^ 0x1512;
        a_0.g[0x2CB2 ^ 0x2C8A] = 0xFFFFD35B ^ 0x2C8A;
        a_0.g[0x6CE5 ^ 0x6DFE] = 0x16AD1 ^ 0x6DFE;
        a_0.g[0xCC24 ^ 0xCC88] = 0x65CA ^ 0xCC88;
        a_0.g[0x32D4 ^ 0x33F5] = 0xC8E ^ 0x33F5;
        a_0.g[0x346C ^ 0x3440] = 0xFFFFCBE7 ^ 0x3440;
        a_0.g[0xA4FB ^ 0xA462] = 0xE3CF ^ 0xA462;
        a_0.g[0x2A32 ^ 0x2B0E] = 0xFFFFCE83 ^ 0x2B0E;
        a_0.g[0x84BA ^ 0x8436] = 0xFFFF7BEC ^ 0x8436;
        a_0.g[0xC97 ^ 0xC1D] = 0xFFFFF3D7 ^ 0xC1D;
        a_0.g[0x6B75 ^ 0x6A62] = 0xAAF4 ^ 0x6A62;
        a_0.g[0x8494 ^ 0x84C9] = 0xFFFF7B69 ^ 0x84C9;
        a_0.g[0x8076 ^ 0x8118] = 0x8119 ^ 0x8118;
        a_0.g[0x3CFA ^ 0x3C67] = 0xFFFFF2EC ^ 0x3C67;
        a_0.g[0x3CD3 ^ 0x3C3A] = 0x96C1 ^ 0x3C3A;
        a_0.g[0xF979 ^ 0xF9CF] = 0x5651 ^ 0xF9CF;
        a_0.g[0x13FF ^ 0x1290] = 0x1280 ^ 0x1290;
        a_0.g[0x5CBC ^ 0x5DB2] = 0x3F20 ^ 0x5DB2;
        a_0.g[0xC14E ^ 0xC06B] = 0x9EF7 ^ 0xC06B;
        a_0.g[0x10968 ^ 0x1095A] = 0xFFFEF6CC ^ 0x1095A;
        a_0.g[0x7240 ^ 0x7346] = 0x1B99 ^ 0x7346;
        a_0.g[0x4F7C ^ 0x4EF9] = 0x4ECB ^ 0x4EF9;
    }
}

