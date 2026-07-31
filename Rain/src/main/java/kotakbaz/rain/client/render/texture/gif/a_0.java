/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.texture.gif;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.texture.A;
import kotakbaz.rain.client.render.texture.texture.a;

/*
 * Renamed from kotakbaz.rain.client.render.texture.gif.A
 */
public class a_0
implements A {
    private final String a;
    private int A;
    private long b;
    private final List<a> B = new ArrayList<a>();
    private Iterator<a> c;
    private a C;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    protected a_0(String name) {
        this.a = name;
    }

    protected a_0 create(kotakbaz.rain.client.render.texture.builder.A info) {
        long l2 = -5884974835888109555L;
        long l3 = 325475940859706748L;
        long l4 = -8090377254646161297L;
        this.b = System.currentTimeMillis();
        this.A = info.getDelay();
        long l5 = l4;
        int n2 = F[0];
        n2 -= F[1];
        l4 = l5 ^ (0L ^ l5) & -1L << (n2 += F[2]);
        while (true) {
            int n3 = F[3];
            n3 ^= F[4];
            if ((int)(l4 >>> (n3 += F[5])) >= info.getTextures().size()) break;
            int n4 = F[6];
            n4 += F[7];
            int n5 = F[9];
            n5 -= F[10];
            int n6 = F[12];
            n6 -= F[13];
            this.B.add(kotakbaz.rain.client.render.texture.texture.a.of(this.a.concat((String)d[n4 += F[8]]).concat(String.valueOf((int)(l4 >>> (n5 += F[11])))), info.getTextures().get((int)(l4 >>> (n6 -= F[14])))));
            l4 += 0x100000000L;
        }
        this.c = this.B.iterator();
        if (!this.B.isEmpty()) {
            int n7 = F[15];
            n7 ^= F[16];
            this.C = this.B.get(n7 ^= F[17]);
        }
        return this;
    }

    public void update() {
        if (System.currentTimeMillis() - this.b >= (long)this.A) {
            if (!this.c.hasNext()) {
                this.c = this.B.iterator();
            }
            this.C = this.c.next();
            this.b = System.currentTimeMillis();
        }
    }

    @Override
    public void delete() {
        for (a a2 : this.B) {
            a2.delete();
        }
        this.B.clear();
    }

    @Override
    public void bind() {
        this.C.bind();
    }

    @Override
    public void unBind() {
        this.C.unBind();
    }

    @Override
    public int getTexId() {
        return this.C.getTexId();
    }

    public String getName() {
        return this.a;
    }

    @Override
    public int getWidth() {
        return this.C.getWidth();
    }

    @Override
    public int getHeight() {
        return this.C.getHeight();
    }

    public int getUpdateDelayMillis() {
        return this.A;
    }

    public void setUpdateDelayMillis(int updateDelayMillis) {
        this.A = updateDelayMillis;
    }

    public static a_0 of(String name, kotakbaz.rain.client.render.texture.builder.A info) {
        return new a_0(name).create(info);
    }

    static {
        a_0.b();
        long l2 = -8269370331144767896L;
        long l3 = -319576044724599528L;
        long l4 = 3759593210974910560L;
        long l5 = 8424995546447709189L;
        long l6 = -1213510790121974617L;
        long l7 = -5652098758878076233L;
        long l8 = 3941054571024935803L;
        long l9 = 5905885555506349933L;
        long l10 = 5838621109892438633L;
        long l11 = 312695705251283348L;
        long l12 = -6325976013140788259L;
        long l13 = 2334678499649283454L;
        long l14 = -8337418081557427208L;
        long l15 = 1435151191301189458L;
        int n2 = F[18];
        n2 -= F[19];
        d = new Object[n2 += F[20]];
        long l16 = l15;
        int n3 = F[21];
        n3 ^= F[22];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += F[23]);
        Object[] objectArray = new Object[F[24]];
        objectArray[a_0.F[25]] = D;
        objectArray[a_0.F[26]] = F[27];
        int n4 = F[28];
        Object object = a_0.A()[F[29]];
        if (object == null) {
            char[] cArray = "\u5c7c\u5c79\u5c4a\u5be9\u5bf1\u5c65\u5bed\u5c7e\u5c56\u5c63\u5bec\u5bf1\u5b12\u5c79\u5c49\u5b1b\u5c80\u5b1a\u5b20\u5bec\u5c7e\u5c4c\u5b09\u5c05\u5b1a\u5b09\u5bea\u5c52\u5bf4\u5b09\u5bf4\u5b19\u5bf3\u5bed\u5bef\u5c51\u5c50\u5b0d\u5c53\u5bf7\u5c4c\u5bf3\u5c7e\u5b24".toCharArray();
            for (int i2 = F[30]; i2 < F[31]; ++i2) {
                int n5 = cArray[i2];
                n5 += F[32];
                n5 += F[33];
                n5 += F[34];
                n5 -= F[35];
                n5 ^= F[36];
                n5 += F[37];
                n5 ^= F[38];
                n5 ^= F[39];
                n5 -= F[40];
                n5 += F[41];
                n5 -= F[42];
                n5 -= F[43];
                n5 += F[44];
                n5 += F[45];
                cArray[i2] = (char)(n5 ^= F[46]);
            }
            object = a_0.A()[a_0.F[47]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = F[48];
        n6 -= F[49];
        l6 = l17 ^ (0x300000000L ^ l17) & -1L << (n6 += F[50]);
        long l18 = l13;
        int n7 = F[51];
        n7 -= F[52];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= F[53]);
        while (true) {
            int n8 = F[54];
            n8 ^= F[55];
            if ((int)l13 >= (int)(l6 >>> (n8 += F[56]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = F[57];
            n10 += F[58];
            int n11 = F[60];
            n11 -= F[61];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += F[59])) & -1L >>> (n11 += F[62]);
            long l20 = l9;
            int n12 = F[63];
            n12 ^= F[64];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= F[65]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = F[66];
            n14 -= F[67];
            int n15 = F[69];
            n15 ^= F[70];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += F[68])) & -1L >>> (n15 -= F[71]);
            int n16 = F[72];
            n16 -= F[73];
            long l22 = l10;
            int n17 = F[75];
            n17 += F[76];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= F[74]) ^ l22) & -1L << (n17 -= F[77]);
            int n18 = F[78];
            n18 ^= F[79];
            n18 += F[80];
            int n19 = F[81];
            n19 -= F[82];
            long l23 = l12;
            int n20 = F[84];
            n20 += F[85];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= F[83]))) ^ l23) & -1L >>> (n20 -= F[86]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = F[87];
            n21 -= F[88];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += F[89]);
            while (true) {
                int n22 = F[90];
                n22 ^= F[91];
                if ((int)(l14 >>> (n22 ^= F[92])) >= (int)l12) break;
                int n23 = F[93];
                n23 += F[94];
                int n24 = F[96];
                n24 -= F[97];
                cArray2[(int)(l14 >>> (n23 -= a_0.F[95]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= F[98]))];
                l14 += 0x100000000L;
            }
            int n25 = F[99];
            n25 += F[100];
            int n26 = (int)(l15 >>> (n25 -= F[101]));
            l15 += 0x100000000L;
            a_0.d[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = F[102];
            n27 += F[103];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= F[104]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[F[105]];
        String string = (String)object[F[106]];
        object = object[F[107]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[108]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[109]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[111] ^ F[112]];
                byArray[a_0.F[113] ^ a_0.F[114]] = F[115] ^ F[116];
                byArray[a_0.F[117] ^ a_0.F[118]] = F[119] ^ F[120];
                byArray[a_0.F[121] ^ a_0.F[122]] = F[123] ^ F[124];
                byArray[a_0.F[125] ^ a_0.F[126]] = F[127] ^ F[128];
                byArray[a_0.F[129] ^ a_0.F[130]] = F[131] ^ F[132];
                byArray[a_0.F[133] ^ a_0.F[134]] = F[135] ^ F[136];
                byArray[a_0.F[137] ^ a_0.F[138]] = F[139] ^ F[140];
                byArray[a_0.F[141] ^ a_0.F[142]] = F[143] ^ F[144];
                byArray[a_0.F[145] ^ a_0.F[146]] = F[147] ^ F[148];
                byArray[a_0.F[149] ^ a_0.F[150]] = F[151] ^ F[152];
                byArray[a_0.F[153] ^ a_0.F[154]] = F[155] ^ F[156];
                byArray[a_0.F[157] ^ a_0.F[158]] = F[159] ^ F[160];
                byArray[a_0.F[161] ^ a_0.F[162]] = F[163] ^ F[164];
                byArray[a_0.F[165] ^ a_0.F[166]] = F[167] ^ F[168];
                byArray[a_0.F[169] ^ a_0.F[170]] = F[171] ^ F[172];
                byArray[a_0.F[173] ^ a_0.F[174]] = F[175] ^ F[176];
                objectArray2[a_0.F[110]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[177]];
            if (e == null) {
                byte[] byArray2 = new byte[F[178] ^ F[179]];
                byArray2[a_0.F[180] ^ a_0.F[181]] = F[182] ^ F[183];
                byArray2[a_0.F[184] ^ a_0.F[185]] = F[186] ^ F[187];
                byArray2[a_0.F[188] ^ a_0.F[189]] = F[190] ^ F[191];
                byArray2[a_0.F[192] ^ a_0.F[193]] = F[194] ^ F[195];
                byArray2[a_0.F[196] ^ a_0.F[197]] = F[198] ^ F[199];
                byArray2[a_0.F[200] ^ a_0.F[201]] = F[202] ^ F[203];
                byArray2[a_0.F[204] ^ a_0.F[205]] = F[206] ^ F[207];
                byArray2[a_0.F[208] ^ a_0.F[209]] = F[210] ^ F[211];
                byArray2[a_0.F[212] ^ a_0.F[213]] = F[214] ^ F[215];
                byArray2[a_0.F[216] ^ a_0.F[217]] = F[218] ^ F[219];
                byArray2[a_0.F[220] ^ a_0.F[221]] = F[222] ^ F[223];
                byArray2[a_0.F[224] ^ a_0.F[225]] = F[226] ^ F[227];
                byArray2[a_0.F[228] ^ a_0.F[229]] = F[230] ^ F[231];
                byArray2[a_0.F[232] ^ a_0.F[233]] = F[234] ^ F[235];
                byArray2[a_0.F[236] ^ a_0.F[237]] = F[238] ^ F[239];
                byArray2[a_0.F[240] ^ a_0.F[241]] = F[242] ^ F[243];
                byArray2[a_0.F[244] ^ a_0.F[245]] = F[246] ^ F[247];
                byArray2[a_0.F[248] ^ a_0.F[249]] = F[250] ^ F[251];
                byArray2[a_0.F[252] ^ a_0.F[253]] = F[254] ^ F[255];
                byArray2[a_0.F[256] ^ a_0.F[257]] = F[258] ^ F[259];
                byArray2[a_0.F[260] ^ a_0.F[261]] = F[262] ^ F[263];
                byArray2[a_0.F[264] ^ a_0.F[265]] = F[266] ^ F[267];
                byArray2[a_0.F[268] ^ a_0.F[269]] = F[270] ^ F[271];
                byArray2[a_0.F[272] ^ a_0.F[273]] = F[274] ^ F[275];
                byArray2[a_0.F[276] ^ a_0.F[277]] = F[278] ^ F[279];
                byArray2[a_0.F[280] ^ a_0.F[281]] = F[282] ^ F[283];
                byArray2[a_0.F[284] ^ a_0.F[285]] = F[286] ^ F[287];
                byArray2[a_0.F[288] ^ a_0.F[289]] = F[290] ^ F[291];
                byArray2[a_0.F[292] ^ a_0.F[293]] = F[294] ^ F[295];
                byArray2[a_0.F[296] ^ a_0.F[297]] = F[298] ^ F[299];
                byArray2[a_0.F[300] ^ a_0.F[301]] = F[302] ^ F[303];
                byArray2[a_0.F[304] ^ a_0.F[305]] = F[306] ^ F[307];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, F[308], byArray3, F[309], byArray.length);
                System.arraycopy(byArray2, F[310], byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[F[311]];
                if (object4 == null) {
                    char[] cArray = "\u538a\u5380\u538d\u537e\u5384\u53d0\u53b9\u53e7\u538e\u53e2\u5382\u53eb\u53df\u53e5\u53b5\u5382\u537f\u53cf".toCharArray();
                    for (int i2 = F[312]; i2 < F[313]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += F[314];
                        n3 += F[315];
                        n3 += F[316];
                        n3 ^= F[317];
                        n3 ^= F[318];
                        n3 += F[319];
                        n3 += F[320];
                        n3 += F[321];
                        n3 -= F[322];
                        n3 -= F[323];
                        n3 -= F[324];
                        n3 += F[325];
                        n3 -= F[326];
                        n3 -= F[327];
                        n3 -= F[328];
                        n3 ^= F[329];
                        cArray[i2] = (char)(n3 -= F[330]);
                    }
                    object4 = a_0.A()[a_0.F[331]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[F[332]];
                byArray4[a_0.F[333]] = F[334];
                byArray4[a_0.F[335]] = F[336];
                byArray4[a_0.F[337]] = F[338];
                byArray4[a_0.F[339]] = F[340];
                byArray4[a_0.F[341]] = F[342];
                byArray4[a_0.F[343]] = F[344];
                byArray4[a_0.F[345]] = F[346];
                byArray4[a_0.F[347]] = F[348];
                byArray4[a_0.F[349]] = F[350];
                byArray4[a_0.F[351]] = F[352];
                byArray4[a_0.F[353]] = F[354];
                byArray4[a_0.F[355]] = F[356];
                byArray4[a_0.F[357]] = F[358];
                byArray4[a_0.F[359]] = F[360];
                byArray4[a_0.F[361]] = F[362];
                byArray4[a_0.F[363]] = F[364];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, F[365], F[366]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[F[367]];
                if (object5 == null) {
                    char[] cArray = "\u2424\u2400\u2412".toCharArray();
                    for (int i3 = F[368]; i3 < F[369]; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= F[370];
                        n4 ^= F[371];
                        n4 ^= F[372];
                        n4 -= F[373];
                        n4 ^= F[374];
                        n4 ^= F[375];
                        n4 ^= F[376];
                        n4 += F[377];
                        n4 -= F[378];
                        n4 ^= F[379];
                        cArray[i3] = (char)(n4 += F[380]);
                    }
                    object5 = a_0.A()[a_0.F[381]] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, F[382], F[383]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, F[384], byArray6.length);
            Object object6 = a_0.A()[F[385]];
            if (object6 == null) {
                char[] cArray = "\u720f\u721b\u7201\u6aa5\u7211\u7218\u7211\u6aa5\u723e\u7219\u7211\u7201\u6aab\u723e\u6b6f\u6b7a\u6b7a\u6b77\u6b9c\u6b7d".toCharArray();
                for (int i4 = F[386]; i4 < F[387]; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= F[388];
                    n5 ^= F[389];
                    n5 ^= F[390];
                    n5 -= F[391];
                    n5 ^= F[392];
                    n5 -= F[393];
                    n5 += F[394];
                    n5 += F[395];
                    n5 += F[396];
                    n5 ^= F[397];
                    n5 -= F[398];
                    cArray[i4] = (char)(n5 ^= F[399]);
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
        F = new int[0xF272 ^ 0xF3E2];
        a_0.F[0x10298 ^ 0x103B6] = 0x1C243 ^ 0x103B6;
        a_0.F[0xAC40 ^ 0xACDE] = 0x5207 ^ 0xACDE;
        a_0.F[0x6EDC ^ 0x6EBF] = 0x6EFB ^ 0x6EBF;
        a_0.F[0xDA46 ^ 0xDABE] = 0x5B00 ^ 0xDABE;
        a_0.F[0xBAB0 ^ 0xBACF] = 0x70C1 ^ 0xBACF;
        a_0.F[0x2901 ^ 0x287C] = 0x287E ^ 0x287C;
        a_0.F[0xE3F0 ^ 0xE3C7] = 0xE39C ^ 0xE3C7;
        a_0.F[0x5293 ^ 0x52F1] = 0xFFFFAD17 ^ 0x52F1;
        a_0.F[0xE686 ^ 0xE62D] = 0xE71D ^ 0xE62D;
        a_0.F[0x100C1 ^ 0x1018E] = 0x10186 ^ 0x1018E;
        a_0.F[0x3A91 ^ 0x3AC7] = 0x3ACA ^ 0x3AC7;
        a_0.F[0x1B1D ^ 0x1B52] = 0x1B31 ^ 0x1B52;
        a_0.F[0x9379 ^ 0x9222] = 0x922F ^ 0x9222;
        a_0.F[0xC4F4 ^ 0xC444] = 0xC3ED ^ 0xC444;
        a_0.F[0x3121 ^ 0x3120] = 0x3116 ^ 0x3120;
        a_0.F[0x6583 ^ 0x654C] = 0xFA3F ^ 0x654C;
        a_0.F[0xB6CB ^ 0xB6CB] = 0xB61A ^ 0xB6CB;
        a_0.F[0x609D ^ 0x60BE] = 0x9FCD ^ 0x60BE;
        a_0.F[0xBEB9 ^ 0xBF96] = 0x7E00 ^ 0xBF96;
        a_0.F[0x535F ^ 0x5276] = 0x5165 ^ 0x5276;
        a_0.F[0x6816 ^ 0x682E] = 0xFFFF97DF ^ 0x682E;
        a_0.F[0xE305 ^ 0xE359] = 0xE332 ^ 0xE359;
        a_0.F[0xE921 ^ 0xE96A] = 0xE950 ^ 0xE96A;
        a_0.F[0x1774 ^ 0x1603] = 0x6CE7 ^ 0x1603;
        a_0.F[0x13FC ^ 0x1318] = 0x57B0 ^ 0x1318;
        a_0.F[0xB5F5 ^ 0xB4F6] = 0x235E ^ 0xB4F6;
        a_0.F[0x2CBF ^ 0x2CE2] = 0x2C46 ^ 0x2CE2;
        a_0.F[0x89EE ^ 0x8954] = 0xFFFF5FB6 ^ 0x8954;
        a_0.F[0x7ADD ^ 0x7A68] = 0x4F08 ^ 0x7A68;
        a_0.F[0x10831 ^ 0x1082C] = 0x1082C ^ 0x1082C;
        a_0.F[0x961E ^ 0x9790] = 0x24CE ^ 0x9790;
        a_0.F[0x10839 ^ 0x108DA] = 0x15FD1 ^ 0x108DA;
        a_0.F[0xEE0B ^ 0xEEF1] = 0x6F15 ^ 0xEEF1;
        a_0.F[0x3973 ^ 0x386A] = 0xC0D3 ^ 0x386A;
        a_0.F[0x2970 ^ 0x29BC] = 0xB6CB ^ 0x29BC;
        a_0.F[0x1994 ^ 0x1881] = 0x2D2D ^ 0x1881;
        a_0.F[0x87A4 ^ 0x86A6] = 0xFFFFEE8B ^ 0x86A6;
        a_0.F[0xF198 ^ 0xF0E8] = 0xF0E8 ^ 0xF0E8;
        a_0.F[0xF0E6 ^ 0xF16B] = 0x70C7 ^ 0xF16B;
        a_0.F[0x8D00 ^ 0x8D2A] = 0xFF90 ^ 0x8D2A;
        a_0.F[0x10AE0 ^ 0x10ABE] = 0xFFFEF556 ^ 0x10ABE;
        a_0.F[0x45E5 ^ 0x45B5] = 0x459C ^ 0x45B5;
        a_0.F[0x616E ^ 0x61C6] = 0x8609 ^ 0x61C6;
        a_0.F[0x8546 ^ 0x85DD] = 0xFFFF7F41 ^ 0x85DD;
        a_0.F[0xB081 ^ 0xB074] = 0x14A3 ^ 0xB074;
        a_0.F[0x3BF2 ^ 0x3BC7] = 0x3BD8 ^ 0x3BC7;
        a_0.F[0x192D ^ 0x199C] = 0x199C ^ 0x199C;
        a_0.F[0x2C26 ^ 0x2D1D] = 0xF19D ^ 0x2D1D;
        a_0.F[0xED47 ^ 0xEC79] = 0x4391 ^ 0xEC79;
        a_0.F[0xB437 ^ 0xB485] = 0x8E07 ^ 0xB485;
        a_0.F[0xC6BE ^ 0xC660] = 0xFFFF074E ^ 0xC660;
        a_0.F[0x2FC6 ^ 0x2FCE] = 0xFFFFD06F ^ 0x2FCE;
        a_0.F[0x58B2 ^ 0x59E1] = 0x59EB ^ 0x59E1;
        a_0.F[0xFF7D ^ 0xFF58] = 0xC80C ^ 0xFF58;
        a_0.F[0xC0D3 ^ 0xC046] = 0xDEB6 ^ 0xC046;
        a_0.F[0x4758 ^ 0x465F] = 0x713B ^ 0x465F;
        a_0.F[0xA60F ^ 0xA71E] = 0xDBB1 ^ 0xA71E;
        a_0.F[0x6B6D ^ 0x6B8F] = 0x3C88 ^ 0x6B8F;
        a_0.F[0x3435 ^ 0x3516] = 0x7B89 ^ 0x3516;
        a_0.F[0xB2B0 ^ 0xB382] = 0xA378 ^ 0xB382;
        a_0.F[0x2719 ^ 0x267A] = 0x2671 ^ 0x267A;
        a_0.F[0x60D3 ^ 0x604B] = 0x7EBC ^ 0x604B;
        a_0.F[0x5956 ^ 0x5914] = 0xFFFFA6B9 ^ 0x5914;
        a_0.F[0xF680 ^ 0xF6DA] = 0xFFFF0969 ^ 0xF6DA;
        a_0.F[0x394E ^ 0x3816] = 0xFFFFC790 ^ 0x3816;
        a_0.F[0x66E5 ^ 0x660F] = 0x16719 ^ 0x660F;
        a_0.F[0x1C8A ^ 0x1DD0] = 0x1D93 ^ 0x1DD0;
        a_0.F[0x55E8 ^ 0x5592] = 0x15E03 ^ 0x5592;
        a_0.F[0xE8CF ^ 0xE84A] = 0xBF1C ^ 0xE84A;
        a_0.F[0x4B6B ^ 0x4B77] = 0x4B75 ^ 0x4B77;
        a_0.F[0xC1F3 ^ 0xC183] = 0xE221 ^ 0xC183;
        a_0.F[0x3908 ^ 0x3874] = 0xE67B ^ 0x3874;
        a_0.F[0xD304 ^ 0xD254] = 0xD232 ^ 0xD254;
        a_0.F[0x73E7 ^ 0x7291] = 0x642 ^ 0x7291;
        a_0.F[0x1058C ^ 0x10550] = 0x13B93 ^ 0x10550;
        a_0.F[0x8A72 ^ 0x8ACA] = 0xA3A8 ^ 0x8ACA;
        a_0.F[0x2D17 ^ 0x2D1B] = 0xFFFFD2CE ^ 0x2D1B;
        a_0.F[0xB624 ^ 0xB6A8] = 0xBADF ^ 0xB6A8;
        a_0.F[0xB35F ^ 0xB332] = 0xB333 ^ 0xB332;
        a_0.F[0xE166 ^ 0xE1B4] = 0xFFFFD5A7 ^ 0xE1B4;
        a_0.F[0xAF95 ^ 0xAEED] = 0x826B ^ 0xAEED;
        a_0.F[0x9967 ^ 0x991A] = 0x533D ^ 0x991A;
        a_0.F[0xD293 ^ 0xD26F] = 0x7923 ^ 0xD26F;
        a_0.F[0x2D49 ^ 0x2D9E] = 0x9558 ^ 0x2D9E;
        a_0.F[0xD6FB ^ 0xD60B] = 0x59A2 ^ 0xD60B;
        a_0.F[0xCBCB ^ 0xCBF0] = 0xCBBC ^ 0xCBF0;
        a_0.F[0x5A8D ^ 0x5A6C] = 0xD67 ^ 0x5A6C;
        a_0.F[0x93DF ^ 0x92F3] = 0x5367 ^ 0x92F3;
        a_0.F[0x714F ^ 0x71A6] = 0x170A0 ^ 0x71A6;
        a_0.F[0xFCE1 ^ 0xFC92] = 0x20B3 ^ 0xFC92;
        a_0.F[0x40F1 ^ 0x41FD] = 0x3B34 ^ 0x41FD;
        a_0.F[0x39C9 ^ 0x39FD] = 0x39A1 ^ 0x39FD;
        a_0.F[0x10577 ^ 0x1045D] = 0x10726 ^ 0x1045D;
        a_0.F[0x86F ^ 0x944] = 0xA57 ^ 0x944;
        a_0.F[0x4212 ^ 0x4308] = 0xFFFF4453 ^ 0x4308;
        a_0.F[0x11C8 ^ 0x11E1] = 0x279B ^ 0x11E1;
        a_0.F[0xFDAD ^ 0xFDD1] = 0x1F640 ^ 0xFDD1;
        a_0.F[0x73FB ^ 0x7282] = 0x80AA ^ 0x7282;
        a_0.F[0xE10D ^ 0xE14B] = 0xE14D ^ 0xE14B;
        a_0.F[0x9339 ^ 0x9359] = 0x9365 ^ 0x9359;
        a_0.F[0x7E51 ^ 0x7ED3] = 0x63E9 ^ 0x7ED3;
        a_0.F[0x4439 ^ 0x4495] = 0x45DA ^ 0x4495;
        a_0.F[0xD41B ^ 0xD419] = 0xFFFF2B9C ^ 0xD419;
        a_0.F[0xB244 ^ 0xB372] = 0xB372 ^ 0xB372;
        a_0.F[0xDECE ^ 0xDF45] = 0x719C ^ 0xDF45;
        a_0.F[0xA212 ^ 0xA2D1] = 0xE9B3 ^ 0xA2D1;
        a_0.F[0x3EAA ^ 0x3EF5] = 0x3E99 ^ 0x3EF5;
        a_0.F[0x24C6 ^ 0x2582] = 0xF5F7 ^ 0x2582;
        a_0.F[0x7A22 ^ 0x7AEB] = 0x5BAC ^ 0x7AEB;
        a_0.F[0x7B8D ^ 0x7B9B] = 0xFFFF8413 ^ 0x7B9B;
        a_0.F[0x171C ^ 0x17E1] = 0xBCA2 ^ 0x17E1;
        a_0.F[0x1068E ^ 0x106F7] = 0xD62 ^ 0x106F7;
        a_0.F[0x2B9A ^ 0x2B83] = 0x2B83 ^ 0x2B83;
        a_0.F[0x30A3 ^ 0x3043] = 0x674D ^ 0x3043;
        a_0.F[0xAE21 ^ 0xAE86] = 0xFFFFB6A6 ^ 0xAE86;
        a_0.F[0xAF5E ^ 0xAF0A] = 0xFFFF50D6 ^ 0xAF0A;
        a_0.F[0x88E6 ^ 0x898C] = 0xFFFF7672 ^ 0x898C;
        a_0.F[0x852 ^ 0x913] = 0xD9BE ^ 0x913;
        a_0.F[0x10951 ^ 0x109EC] = 0x1D9CD ^ 0x109EC;
        a_0.F[0xEEFF ^ 0xEFE8] = 0xDA44 ^ 0xEFE8;
        a_0.F[0xF533 ^ 0xF51D] = 0xF963 ^ 0xF51D;
        a_0.F[0x441B ^ 0x4508] = 0x39A7 ^ 0x4508;
        a_0.F[0xE493 ^ 0xE42C] = 0x340D ^ 0xE42C;
        a_0.F[0xF54A ^ 0xF4CC] = 0xB58F ^ 0xF4CC;
        a_0.F[0x128D ^ 0x12E8] = 0x12EA ^ 0x12E8;
        a_0.F[0x7096 ^ 0x71DF] = 0x4C81 ^ 0x71DF;
        a_0.F[0xDAA8 ^ 0xDA29] = 0xC718 ^ 0xDA29;
        a_0.F[0x92D4 ^ 0x93DE] = 0xE60C ^ 0x93DE;
        a_0.F[0xAB8F ^ 0xAAE0] = 0xAAE2 ^ 0xAAE0;
        a_0.F[0x6B97 ^ 0x6AAB] = 0xC149 ^ 0x6AAB;
        a_0.F[0xD02C ^ 0xD0D2] = 0xFFFF8445 ^ 0xD0D2;
        a_0.F[0x18BF ^ 0x1809] = 0x2D29 ^ 0x1809;
        a_0.F[0x1038 ^ 0x1123] = 0xE99A ^ 0x1123;
        a_0.F[0xD9F0 ^ 0xD9D1] = 0x4E5E ^ 0xD9D1;
        a_0.F[0x4752 ^ 0x466D] = 0x8607 ^ 0x466D;
        a_0.F[0x5DE1 ^ 0x5DC7] = 0xE7D2 ^ 0x5DC7;
        a_0.F[0x949F ^ 0x95FA] = 0x95FA ^ 0x95FA;
        a_0.F[0x4FE7 ^ 0x4F7A] = 0xB1A6 ^ 0x4F7A;
        a_0.F[0x2F7 ^ 0x268] = 0xFCD7 ^ 0x268;
        a_0.F[0xDF1F ^ 0xDE10] = 0xA4D5 ^ 0xDE10;
        a_0.F[0x107D9 ^ 0x106ED] = 0x106ED ^ 0x106ED;
        a_0.F[0x89D7 ^ 0x8985] = 0x89E5 ^ 0x8985;
        a_0.F[0x1099D ^ 0x10956] = 0x12811 ^ 0x10956;
        a_0.F[0xF0FA ^ 0xF060] = 0xF54A ^ 0xF060;
        a_0.F[0x3E8C ^ 0x3FD5] = 0x3FD1 ^ 0x3FD5;
        a_0.F[0x974 ^ 0x9E8] = 0xCC2 ^ 0x9E8;
        a_0.F[0xE732 ^ 0xE7DD] = 0x6353 ^ 0xE7DD;
        a_0.F[0x61F4 ^ 0x61C5] = 0xFFFF9E41 ^ 0x61C5;
        a_0.F[0x678C ^ 0x6789] = 0xFFFF983B ^ 0x6789;
        a_0.F[0x10281 ^ 0x10217] = 0x11CE0 ^ 0x10217;
        a_0.F[0x8108 ^ 0x802C] = 0x34D3 ^ 0x802C;
        a_0.F[0xF39E ^ 0xF28C] = 0x8E32 ^ 0xF28C;
        a_0.F[0xCC85 ^ 0xCDBF] = 0xCC1F ^ 0xCDBF;
        a_0.F[0xF970 ^ 0xF9CE] = 0x29FC ^ 0xF9CE;
        a_0.F[0x56D0 ^ 0x56B1] = 0x56C7 ^ 0x56B1;
        a_0.F[0x7CD5 ^ 0x7C05] = 0xB7EE ^ 0x7C05;
        a_0.F[0xFD88 ^ 0xFC04] = 0xB8DD ^ 0xFC04;
        a_0.F[0xB1E0 ^ 0xB09F] = 0xB08F ^ 0xB09F;
        a_0.F[0x42 ^ 0x5A] = 0x59 ^ 0x5A;
        a_0.F[0x1957 ^ 0x1917] = 0xFFFFE68A ^ 0x1917;
        a_0.F[0xE4BE ^ 0xE480] = 0xFFFF1B52 ^ 0xE480;
        a_0.F[0x1C9D ^ 0x1C4C] = 0xD7AD ^ 0x1C4C;
        a_0.F[0x5E4F ^ 0x5F59] = 0xFFFF955F ^ 0x5F59;
        a_0.F[0xB557 ^ 0xB550] = 0xB518 ^ 0xB550;
        a_0.F[0xCB36 ^ 0xCBFC] = 0xFFFF1538 ^ 0xCBFC;
        a_0.F[0x6BF ^ 0x79A] = 0xB36B ^ 0x79A;
        a_0.F[0xBEE4 ^ 0xBEAC] = 0xFFFF4195 ^ 0xBEAC;
        a_0.F[0xDC9E ^ 0xDC2D] = 0xE68F ^ 0xDC2D;
        a_0.F[0x2182 ^ 0x20C0] = 0xCE52 ^ 0x20C0;
        a_0.F[0x6F55 ^ 0x6F58] = 0xFFFF90C2 ^ 0x6F58;
        a_0.F[0x1C7D ^ 0x1D29] = 0x1D40 ^ 0x1D29;
        a_0.F[0x59F8 ^ 0x5909] = 0xD6A8 ^ 0x5909;
        a_0.F[0xCC66 ^ 0xCC3E] = 0xFFFF33E9 ^ 0xCC3E;
        a_0.F[0x5ABB ^ 0x5A22] = 0x5F07 ^ 0x5A22;
        a_0.F[0x1010F ^ 0x10106] = 0x10108 ^ 0x10106;
        a_0.F[0x67BC ^ 0x66A0] = 0x49D4 ^ 0x66A0;
        a_0.F[0xD573 ^ 0xD51B] = 0xD543 ^ 0xD51B;
        a_0.F[0x7D17 ^ 0x7C5B] = 0x7C4B ^ 0x7C5B;
        a_0.F[0x7DB6 ^ 0x7CDD] = 0x7CDA ^ 0x7CDD;
        a_0.F[0x77BF ^ 0x777B] = 0x450 ^ 0x777B;
        a_0.F[0xC3A8 ^ 0xC308] = 0x3DD1 ^ 0xC308;
        a_0.F[0x2B2C ^ 0x2BDA] = 0x8F08 ^ 0x2BDA;
        a_0.F[0x1000C ^ 0x100CD] = 0x14BAF ^ 0x100CD;
        a_0.F[0x6BF3 ^ 0x6B3E] = 0xF44D ^ 0x6B3E;
        a_0.F[0xBBBD ^ 0xBB66] = 0xFC70 ^ 0xBB66;
        a_0.F[0xF316 ^ 0xF384] = 0xE031 ^ 0xF384;
        a_0.F[0x2C90 ^ 0x2C39] = 0x2D77 ^ 0x2C39;
        a_0.F[0xB467 ^ 0xB4A9] = 0xFFFFD469 ^ 0xB4A9;
        a_0.F[0x65B0 ^ 0x6569] = 0x227F ^ 0x6569;
        a_0.F[0xFBF2 ^ 0xFAB5] = 0xAA29 ^ 0xFAB5;
        a_0.F[0x2313 ^ 0x2256] = 0x2A8D ^ 0x2256;
        a_0.F[0xAD8F ^ 0xADFE] = 0x71E3 ^ 0xADFE;
        a_0.F[0x106A3 ^ 0x106BC] = 0x10690 ^ 0x106BC;
        a_0.F[0xCA65 ^ 0xCB48] = 0xADE ^ 0xCB48;
        a_0.F[0xC066 ^ 0xC128] = 0xC10B ^ 0xC128;
        a_0.F[0x2216 ^ 0x22E9] = 0x89AA ^ 0x22E9;
        a_0.F[0x2BB5 ^ 0x2ADD] = 0xFFFFD519 ^ 0x2ADD;
        a_0.F[0xF8EA ^ 0xF83E] = 0x40F8 ^ 0xF83E;
        a_0.F[0xC058 ^ 0xC0FB] = 0xFFFF9B36 ^ 0xC0FB;
        a_0.F[0x84F3 ^ 0x84C9] = 0xFFFF7B5A ^ 0x84C9;
        a_0.F[0x81E6 ^ 0x8181] = 0x81C1 ^ 0x8181;
        a_0.F[0xEFD6 ^ 0xEE9C] = 0x4FE3 ^ 0xEE9C;
        a_0.F[0x89CB ^ 0x8918] = 0x42F9 ^ 0x8918;
        a_0.F[0xC0A9 ^ 0xC12E] = 0x367D ^ 0xC12E;
        a_0.F[0x3B85 ^ 0x3BD4] = 0x3B28 ^ 0x3BD4;
        a_0.F[0xFEFF ^ 0xFE13] = 0x7A9A ^ 0xFE13;
        a_0.F[0x5591 ^ 0x558F] = 0x558F ^ 0x558F;
        a_0.F[0x10CF5 ^ 0x10DC5] = 0x11D11 ^ 0x10DC5;
        a_0.F[0x2F37 ^ 0x2F53] = 0xFFFFD08D ^ 0x2F53;
        a_0.F[0xAB5 ^ 0xBE0] = 0xBEE ^ 0xBE0;
        a_0.F[0xB150 ^ 0xB107] = 0xFFFF4E99 ^ 0xB107;
        a_0.F[0xFF0 ^ 0xFAB] = 0xFFFFF053 ^ 0xFAB;
        a_0.F[0xABC5 ^ 0xAAAB] = 0xABAB ^ 0xAAAB;
        a_0.F[0xC085 ^ 0xC076] = 0x4FD7 ^ 0xC076;
        a_0.F[0xD8BA ^ 0xD83C] = 0x8F67 ^ 0xD83C;
        a_0.F[0x13C5 ^ 0x12FC] = 0x12EE ^ 0x12FC;
        a_0.F[0x440F ^ 0x4575] = 0xB4E ^ 0x4575;
        a_0.F[0x5CFE ^ 0x5C24] = 0x1B19 ^ 0x5C24;
        a_0.F[0x888E ^ 0x89B3] = 0x29F7 ^ 0x89B3;
        a_0.F[0xF3B5 ^ 0xF37D] = 0xD226 ^ 0xF37D;
        a_0.F[0xA57B ^ 0xA503] = 0xBCC3 ^ 0xA503;
        a_0.F[0x55F5 ^ 0x5497] = 0x54F4 ^ 0x5497;
        a_0.F[0x1652 ^ 0x1626] = 0xCA32 ^ 0x1626;
        a_0.F[0x5997 ^ 0x58DA] = 0x58D9 ^ 0x58DA;
        a_0.F[0x23A9 ^ 0x22EF] = 0x80D3 ^ 0x22EF;
        a_0.F[0xCEC5 ^ 0xCEAC] = 0xCEAD ^ 0xCEAC;
        a_0.F[0xC5DE ^ 0xC5C4] = 0xC5C5 ^ 0xC5C4;
        a_0.F[0x10879 ^ 0x1086D] = 0xFFFEF7D5 ^ 0x1086D;
        a_0.F[0x18B9 ^ 0x19C7] = 0x19C7 ^ 0x19C7;
        a_0.F[0x6D03 ^ 0x6DB7] = 0x58CA ^ 0x6DB7;
        a_0.F[0x7FA1 ^ 0x7EE2] = 0x4E30 ^ 0x7EE2;
        a_0.F[0xB037 ^ 0xB062] = 0xB033 ^ 0xB062;
        a_0.F[0x76D5 ^ 0x76A2] = 0xFFFF90C7 ^ 0x76A2;
        a_0.F[0x67D6 ^ 0x67E6] = 0xFFFF9815 ^ 0x67E6;
        a_0.F[0xB531 ^ 0xB5B8] = 0xB9C7 ^ 0xB5B8;
        a_0.F[0x3E85 ^ 0x3EB7] = 0xFFFFC106 ^ 0x3EB7;
        a_0.F[0xF241 ^ 0xF27D] = 0xF25F ^ 0xF27D;
        a_0.F[0xC821 ^ 0xC940] = 0xC941 ^ 0xC940;
        a_0.F[0xB29A ^ 0xB235] = 0xFFFF4A53 ^ 0xB235;
        a_0.F[0xE2E6 ^ 0xE3EE] = 0x967D ^ 0xE3EE;
        a_0.F[0x5A65 ^ 0x5A1E] = 0x151B3 ^ 0x5A1E;
        a_0.F[0xB21E ^ 0xB2C8] = 0xA50 ^ 0xB2C8;
        a_0.F[0x5616 ^ 0x5727] = 0x47F8 ^ 0x5727;
        a_0.F[0x4790 ^ 0x47FE] = 0x47FE ^ 0x47FE;
        a_0.F[0x37BC ^ 0x369E] = 0xFFFF87E5 ^ 0x369E;
        a_0.F[0x3D0C ^ 0x3D07] = 0x3D1C ^ 0x3D07;
        a_0.F[0x25DB ^ 0x2596] = 0xFFFFDA57 ^ 0x2596;
        a_0.F[0xAD04 ^ 0xAC2C] = 0xAF2E ^ 0xAC2C;
        a_0.F[0x506 ^ 0x420] = 0xB0CE ^ 0x420;
        a_0.F[0x5282 ^ 0x5209] = 0x5E5F ^ 0x5209;
        a_0.F[0xC013 ^ 0xC174] = 0xC17D ^ 0xC174;
        a_0.F[0xE7CF ^ 0xE6C1] = 0xFFFF63FD ^ 0xE6C1;
        a_0.F[0x3200 ^ 0x32C5] = 0x41F0 ^ 0x32C5;
        a_0.F[0x4719 ^ 0x461F] = 0x716F ^ 0x461F;
        a_0.F[0x9027 ^ 0x9138] = 0xBE5C ^ 0x9138;
        a_0.F[0x101D4 ^ 0x1013A] = 0x18583 ^ 0x1013A;
        a_0.F[0xCF1A ^ 0xCFBF] = 0x2876 ^ 0xCFBF;
        a_0.F[0x5118 ^ 0x5137] = 0x5137 ^ 0x5137;
        a_0.F[0x4D3D ^ 0x4CBC] = 0x4CBF ^ 0x4CBC;
        a_0.F[0x42B7 ^ 0x43D7] = 0xFFFFBC3A ^ 0x43D7;
        a_0.F[0x4C31 ^ 0x4C23] = 0x4CAE ^ 0x4C23;
        a_0.F[0x295D ^ 0x2840] = 0x724 ^ 0x2840;
        a_0.F[0x10A95 ^ 0x10BDD] = 0x1F4C0 ^ 0x10BDD;
        a_0.F[0x46A6 ^ 0x468E] = 0x4C17 ^ 0x468E;
        a_0.F[0xBACA ^ 0xBA86] = 0xFFFF4521 ^ 0xBA86;
        a_0.F[0x8E98 ^ 0x8F93] = 0xFA18 ^ 0x8F93;
        a_0.F[0x7434 ^ 0x756B] = 0x7567 ^ 0x756B;
        a_0.F[0x7D2D ^ 0x7D7E] = 0x7D02 ^ 0x7D7E;
        a_0.F[0x7DF0 ^ 0x7D32] = 0xFFFFC98F ^ 0x7D32;
        a_0.F[0x62BC ^ 0x6247] = 0xE3FF ^ 0x6247;
        a_0.F[0x7573 ^ 0x75E4] = 0xFFFF9481 ^ 0x75E4;
        a_0.F[0xEBDF ^ 0xEAFE] = 0xA461 ^ 0xEAFE;
        a_0.F[0xB3CE ^ 0xB2CF] = 0x2567 ^ 0xB2CF;
        a_0.F[0x2AE7 ^ 0x2A45] = 0x8E2E ^ 0x2A45;
        a_0.F[0x6C2A ^ 0x6C24] = 0x6C3F ^ 0x6C24;
        a_0.F[0x483E ^ 0x48B3] = 0x8A8A ^ 0x48B3;
        a_0.F[0x733F ^ 0x73BF] = 0xB99A ^ 0x73BF;
        a_0.F[0x66B1 ^ 0x6656] = 0x22E7 ^ 0x6656;
        a_0.F[0xB2D2 ^ 0xB38C] = 0xFFFF4C14 ^ 0xB38C;
        a_0.F[0x7287 ^ 0x73E1] = 0x73C0 ^ 0x73E1;
        a_0.F[0x47BF ^ 0x47D5] = 0x47D7 ^ 0x47D5;
        a_0.F[0x5997 ^ 0x593A] = 0x5E9F ^ 0x593A;
        a_0.F[0x52CA ^ 0x5260] = 0x532F ^ 0x5260;
        a_0.F[0x78F7 ^ 0x7831] = 0xB02 ^ 0x7831;
        a_0.F[0x7E42 ^ 0x7E51] = 0x7E15 ^ 0x7E51;
        a_0.F[0xE3EC ^ 0xE339] = 0x5BFF ^ 0xE339;
        a_0.F[0xDED8 ^ 0xDF89] = 0xDF8F ^ 0xDF89;
        a_0.F[0xA147 ^ 0xA04E] = 0xD5C5 ^ 0xA04E;
        a_0.F[0xAE11 ^ 0xAF6A] = 0x3E67 ^ 0xAF6A;
        a_0.F[0x721C ^ 0x7273] = 0x51C1 ^ 0x7273;
        a_0.F[0x1094E ^ 0x10959] = 0x10903 ^ 0x10959;
        a_0.F[0x5EB1 ^ 0x5FC4] = 0x9C37 ^ 0x5FC4;
        a_0.F[0x1231 ^ 0x13B1] = 0x13A1 ^ 0x13B1;
        a_0.F[0x10D6F ^ 0x10D1D] = 0x1D109 ^ 0x10D1D;
        a_0.F[0x9E8F ^ 0x9E2B] = 0x3A40 ^ 0x9E2B;
        a_0.F[0xB354 ^ 0xB259] = 0xC89C ^ 0xB259;
        a_0.F[0xC219 ^ 0xC28D] = 0xD138 ^ 0xC28D;
        a_0.F[0x6E18 ^ 0x6E3F] = 0xE368 ^ 0x6E3F;
        a_0.F[0xA852 ^ 0xA8A0] = 0xFFFFD8F6 ^ 0xA8A0;
        a_0.F[0xCDD9 ^ 0xCD49] = 0xF7A ^ 0xCD49;
        a_0.F[0x10A3C ^ 0x10B0F] = 0x11BD0 ^ 0x10B0F;
        a_0.F[0x6FE3 ^ 0x6FF2] = 0xFFFF9000 ^ 0x6FF2;
        a_0.F[0x9ABB ^ 0x9B3E] = 0x168F ^ 0x9B3E;
        a_0.F[0xB7A4 ^ 0xB77C] = 0xF078 ^ 0xB77C;
        a_0.F[0x85B4 ^ 0x84A4] = 0xF80A ^ 0x84A4;
        a_0.F[0x8279 ^ 0x8259] = 0x45D0 ^ 0x8259;
        a_0.F[0x31 ^ 0x35] = 0xFFFFFFA9 ^ 0x35;
        a_0.F[0xB9CE ^ 0xB940] = 0x7B73 ^ 0xB940;
        a_0.F[0x1045A ^ 0x1049A] = 0x14FEE ^ 0x1049A;
        a_0.F[0xEE63 ^ 0xEEEB] = 0xB9B0 ^ 0xEEEB;
        a_0.F[0x22EC ^ 0x2287] = 0x2287 ^ 0x2287;
        a_0.F[0xBEB3 ^ 0xBE56] = 0xFAE7 ^ 0xBE56;
        a_0.F[0x2A6A ^ 0x2B03] = 0x2B06 ^ 0x2B03;
        a_0.F[0xFB16 ^ 0xFBFB] = 0x7F75 ^ 0xFBFB;
        a_0.F[0x3A1B ^ 0x3A77] = 0x3A76 ^ 0x3A77;
        a_0.F[0xC1F4 ^ 0xC129] = 0xFFF5 ^ 0xC129;
        a_0.F[0x76CF ^ 0x7673] = 0xA649 ^ 0x7673;
        a_0.F[0x48EA ^ 0x485D] = 0x7D3D ^ 0x485D;
        a_0.F[0x244 ^ 0x363] = 0xB792 ^ 0x363;
        a_0.F[0x9DB ^ 0x8AA] = 0x8A9 ^ 0x8AA;
        a_0.F[0xF0D ^ 0xE82] = 0x9DBC ^ 0xE82;
        a_0.F[0x8C5B ^ 0x8C1F] = 0x8C42 ^ 0x8C1F;
        a_0.F[0x4E0D ^ 0x4EB6] = 0x67C3 ^ 0x4EB6;
        a_0.F[0x1180 ^ 0x11CE] = 0xFFFFEE4A ^ 0x11CE;
        a_0.F[0xE052 ^ 0xE00B] = 0xE052 ^ 0xE00B;
        a_0.F[0xC5BB ^ 0xC54C] = 0x619B ^ 0xC54C;
        a_0.F[0xB5F4 ^ 0xB5F7] = 0xFFFF4A05 ^ 0xB5F7;
        a_0.F[0x7F39 ^ 0x7F78] = 0xFFFF8094 ^ 0x7F78;
        a_0.F[0x5BB3 ^ 0x5B34] = 0xFFFFF3CF ^ 0x5B34;
        a_0.F[0xC015 ^ 0xC0AC] = 0xE9D9 ^ 0xC0AC;
        a_0.F[0xB945 ^ 0xB845] = 0x2FE4 ^ 0xB845;
        a_0.F[0x7D5A ^ 0x7C7A] = 0x32E6 ^ 0x7C7A;
        a_0.F[0x74B6 ^ 0x7480] = 0x74F4 ^ 0x7480;
        a_0.F[0x7923 ^ 0x783D] = 0xFFFFA88D ^ 0x783D;
        a_0.F[0xD320 ^ 0xD217] = 0xD216 ^ 0xD217;
        a_0.F[0x2853 ^ 0x2877] = 0xD1E4 ^ 0x2877;
        a_0.F[0x3365 ^ 0x33C4] = 0x97AF ^ 0x33C4;
        a_0.F[0x30B7 ^ 0x3033] = 0x2D09 ^ 0x3033;
        a_0.F[0x82E0 ^ 0x82EF] = 0x82DA ^ 0x82EF;
        a_0.F[0xC877 ^ 0xC96F] = 0x31C2 ^ 0xC96F;
        a_0.F[0xF6A3 ^ 0xF690] = 0xF60B ^ 0xF690;
        a_0.F[0x6011 ^ 0x6147] = 0xFFFF9E83 ^ 0x6147;
        a_0.F[0x296A ^ 0x290C] = 0x2934 ^ 0x290C;
        a_0.F[0xA2E1 ^ 0xA385] = 0xFFFF5C23 ^ 0xA385;
        a_0.F[0xD57A ^ 0xD561] = 0xD561 ^ 0xD561;
        a_0.F[0x9E39 ^ 0x9E29] = 0xFFFF61EE ^ 0x9E29;
        a_0.F[0x1C8F ^ 0x1DCF] = 0xF82 ^ 0x1DCF;
        a_0.F[0xB5F9 ^ 0xB4C1] = 0xB4C1 ^ 0xB4C1;
        a_0.F[0x3BCE ^ 0x3A99] = 0x3A96 ^ 0x3A99;
        a_0.F[0xD514 ^ 0xD59B] = 0xFFFFE811 ^ 0xD59B;
        a_0.F[0xD41A ^ 0xD51F] = 0xE27B ^ 0xD51F;
        a_0.F[0x5CFB ^ 0x5C1D] = 0xFFFFE74C ^ 0x5C1D;
        a_0.F[0xC633 ^ 0xC76F] = 0xFFFF388C ^ 0xC76F;
        a_0.F[0xE2A6 ^ 0xE2E3] = 0xFFFF1D32 ^ 0xE2E3;
        a_0.F[0x10197 ^ 0x10093] = 0x137ED ^ 0x10093;
        a_0.F[0xB76F ^ 0xB6ED] = 0xB6ED ^ 0xB6ED;
        a_0.F[0x315E ^ 0x3120] = 0xFB05 ^ 0x3120;
        a_0.F[0x22B3 ^ 0x2258] = 0x1235E ^ 0x2258;
        a_0.F[0x95FC ^ 0x948E] = 0x4E8E ^ 0x948E;
        a_0.F[0xED8E ^ 0xECE2] = 0xFFFF1356 ^ 0xECE2;
        a_0.F[0xDD15 ^ 0xDD9F] = 0xD1E8 ^ 0xDD9F;
        a_0.F[0x3B5D ^ 0x3BCC] = 0x287A ^ 0x3BCC;
        a_0.F[0xACE8 ^ 0xACA2] = 0xFFFF5329 ^ 0xACA2;
        a_0.F[0x10482 ^ 0x10488] = 0x10481 ^ 0x10488;
        a_0.F[0xD3F8 ^ 0xD3BB] = 0xD3B2 ^ 0xD3BB;
        a_0.F[0x8FE0 ^ 0x8ED5] = 0x8ED5 ^ 0x8ED5;
        a_0.F[0x102B6 ^ 0x102F1] = 0xFFFEFD46 ^ 0x102F1;
        a_0.F[0x4F0D ^ 0x4E60] = 0x4E6D ^ 0x4E60;
        a_0.F[0x282 ^ 0x3F1] = 0xDB40 ^ 0x3F1;
        a_0.F[0xAFB4 ^ 0xAE3C] = 0x4DA8 ^ 0xAE3C;
        a_0.F[0x3AD5 ^ 0x3BC1] = 0xE60 ^ 0x3BC1;
        a_0.F[0xFAFD ^ 0xFA8B] = 0xE34B ^ 0xFA8B;
        a_0.F[0x312 ^ 0x3EB] = 0x8253 ^ 0x3EB;
        a_0.F[0x5EBD ^ 0x5E13] = 0x59BA ^ 0x5E13;
        a_0.F[0x1670 ^ 0x1722] = 0xFFFFE8BF ^ 0x1722;
        a_0.F[0x2BAD ^ 0x2A29] = 0x1C99 ^ 0x2A29;
        a_0.F[0xB4A4 ^ 0xB488] = 0x1C73 ^ 0xB488;
        a_0.F[0x7532 ^ 0x751F] = 0xA8C2 ^ 0x751F;
        a_0.F[0x77F3 ^ 0x767A] = 0xA0CD ^ 0x767A;
        a_0.F[0x1373 ^ 0x133A] = 0xFFFFECB4 ^ 0x133A;
        a_0.F[0x6DE ^ 0x601] = 0x38DD ^ 0x601;
        a_0.F[0xC588 ^ 0xC4FC] = 0xA7BF ^ 0xC4FC;
        a_0.F[0xA8FF ^ 0xA88A] = 0xB144 ^ 0xA88A;
        a_0.F[0xBA50 ^ 0xBA72] = 0x1920 ^ 0xBA72;
        a_0.F[0xCAED ^ 0xCAD2] = 0xFFFF3543 ^ 0xCAD2;
        a_0.F[0x902 ^ 0x93F] = 0xFFFFF6EB ^ 0x93F;
        a_0.F[0xB934 ^ 0xB91F] = 0xA445 ^ 0xB91F;
        a_0.F[0xDCDE ^ 0xDCCB] = 0xDC85 ^ 0xDCCB;
        a_0.F[0xED1D ^ 0xEC9E] = 0xEC8A ^ 0xEC9E;
        a_0.F[0xCC94 ^ 0xCC07] = 0xFFFF2059 ^ 0xCC07;
        a_0.F[0x6D37 ^ 0x6C6A] = 0x6C68 ^ 0x6C6A;
        a_0.F[0xEF73 ^ 0xEF87] = 0x4B45 ^ 0xEF87;
        a_0.F[0xE895 ^ 0xE8AC] = 0xE88E ^ 0xE8AC;
        a_0.F[0x8C35 ^ 0x8CDD] = 0x18DC8 ^ 0x8CDD;
        a_0.F[0x4A50 ^ 0x4BDA] = 0x8D72 ^ 0x4BDA;
        a_0.F[0xC78 ^ 0xD33] = 0xD32 ^ 0xD33;
        a_0.F[0x521E ^ 0x52D9] = 0x21EC ^ 0x52D9;
        a_0.F[0x4E31 ^ 0x4E97] = 0xA958 ^ 0x4E97;
        a_0.F[0x4A91 ^ 0x4A12] = 0x5728 ^ 0x4A12;
        a_0.F[0xFA9F ^ 0xFA99] = 0xFA8E ^ 0xFA99;
    }
}

