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
import kotakbaz.rain.client.render.texture.texture.a_0;

public class A
implements kotakbaz.rain.client.render.texture.A {
    private final String a;
    private int A;
    private long b;
    private final List<a_0> B = new ArrayList<a_0>();
    private Iterator<a_0> c;
    private a_0 C;
    private static Object[] d;
    private static Object e;
    private static Object[] E;
    private static Object[] D;
    private static Object[] f;
    public static int[] F;

    protected A(String string) {
        super();
        this.a = string;
    }

    protected A create(kotakbaz.rain.client.render.texture.builder.A a2) {
        long l = -5884974835888109555L;
        long l2 = 325475940859706748L;
        long l3 = -8090377254646161297L;
        this.b = System.currentTimeMillis();
        this.A = a2.getDelay();
        long l4 = l3;
        int n = F[0];
        n -= F[1];
        l3 = l4 ^ (0L ^ l4) & -1L << (n += F[2]);
        while (true) {
            int n2 = F[3];
            n2 ^= F[4];
            if ((int)(l3 >>> (n2 += F[5])) >= a2.getTextures().size()) break;
            int n3 = F[6];
            n3 += F[7];
            int n4 = F[9];
            n4 -= F[10];
            int n5 = F[12];
            n5 -= F[13];
            this.B.add(a_0.of(this.a.concat((String)d[n3 += F[8]]).concat(String.valueOf((int)(l3 >>> (n4 += F[11])))), a2.getTextures().get((int)(l3 >>> (n5 -= F[14])))));
            l3 += 0x100000000L;
        }
        this.c = this.B.iterator();
        if (!this.B.isEmpty()) {
            int n6 = F[15];
            n6 ^= F[16];
            this.C = this.B.get(n6 ^= F[17]);
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
        for (a_0 a_02 : this.B) {
            a_02.delete();
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

    public void setUpdateDelayMillis(int n) {
        this.A = n;
    }

    public static A of(String string, kotakbaz.rain.client.render.texture.builder.A a2) {
        return new A(string).create(a2);
    }

    static {
        kotakbaz.rain.client.render.texture.gif.A.b();
        long l = -8269370331144767896L;
        long l2 = -319576044724599528L;
        long l3 = 3759593210974910560L;
        long l4 = 8424995546447709189L;
        long l5 = -1213510790121974617L;
        long l6 = -5652098758878076233L;
        long l7 = 3941054571024935803L;
        long l8 = 5905885555506349933L;
        long l9 = 5838621109892438633L;
        long l10 = 312695705251283348L;
        long l11 = -6325976013140788259L;
        long l12 = 2334678499649283454L;
        long l13 = -8337418081557427208L;
        long l14 = 1435151191301189458L;
        int n = F[18];
        n -= F[19];
        d = new Object[n += F[20]];
        long l15 = l14;
        int n2 = F[21];
        n2 ^= F[22];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += F[23]);
        Object[] objectArray = new Object[F[24]];
        objectArray[kotakbaz.rain.client.render.texture.gif.A.F[25]] = D;
        objectArray[kotakbaz.rain.client.render.texture.gif.A.F[26]] = F[27];
        int n3 = F[28];
        Object object = kotakbaz.rain.client.render.texture.gif.A.A()[F[29]];
        if (object == null) {
            char[] cArray = "\u5c7c\u5c79\u5c4a\u5be9\u5bf1\u5c65\u5bed\u5c7e\u5c56\u5c63\u5bec\u5bf1\u5b12\u5c79\u5c49\u5b1b\u5c80\u5b1a\u5b20\u5bec\u5c7e\u5c4c\u5b09\u5c05\u5b1a\u5b09\u5bea\u5c52\u5bf4\u5b09\u5bf4\u5b19\u5bf3\u5bed\u5bef\u5c51\u5c50\u5b0d\u5c53\u5bf7\u5c4c\u5bf3\u5c7e\u5b24".toCharArray();
            for (int i = F[30]; i < F[31]; ++i) {
                int n4 = cArray[i];
                n4 += F[32];
                n4 += F[33];
                n4 += F[34];
                n4 -= F[35];
                n4 ^= F[36];
                n4 += F[37];
                n4 ^= F[38];
                n4 ^= F[39];
                n4 -= F[40];
                n4 += F[41];
                n4 -= F[42];
                n4 -= F[43];
                n4 += F[44];
                n4 += F[45];
                cArray[i] = (char)(n4 ^= F[46]);
            }
            object = kotakbaz.rain.client.render.texture.gif.A.A()[kotakbaz.rain.client.render.texture.gif.A.F[47]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.texture.gif.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = F[48];
        n5 -= F[49];
        l5 = l16 ^ (0x300000000L ^ l16) & -1L << (n5 += F[50]);
        long l17 = l12;
        int n6 = F[51];
        n6 -= F[52];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= F[53]);
        while (true) {
            int n7 = F[54];
            n7 ^= F[55];
            if ((int)l12 >= (int)(l5 >>> (n7 += F[56]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = F[57];
            n9 += F[58];
            int n10 = F[60];
            n10 -= F[61];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += F[59])) & -1L >>> (n10 += F[62]);
            long l19 = l8;
            int n11 = F[63];
            n11 ^= F[64];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= F[65]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = F[66];
            n13 -= F[67];
            int n14 = F[69];
            n14 ^= F[70];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += F[68])) & -1L >>> (n14 -= F[71]);
            int n15 = F[72];
            n15 -= F[73];
            long l21 = l9;
            int n16 = F[75];
            n16 += F[76];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= F[74]) ^ l21) & -1L << (n16 -= F[77]);
            int n17 = F[78];
            n17 ^= F[79];
            n17 += F[80];
            int n18 = F[81];
            n18 -= F[82];
            long l22 = l11;
            int n19 = F[84];
            n19 += F[85];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= F[83]))) ^ l22) & -1L >>> (n19 -= F[86]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = F[87];
            n20 -= F[88];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += F[89]);
            while (true) {
                int n21 = F[90];
                n21 ^= F[91];
                if ((int)(l13 >>> (n21 ^= F[92])) >= (int)l11) break;
                int n22 = F[93];
                n22 += F[94];
                int n23 = F[96];
                n23 -= F[97];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.client.render.texture.gif.A.F[95]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= F[98]))];
                l13 += 0x100000000L;
            }
            int n24 = F[99];
            n24 += F[100];
            int n25 = (int)(l14 >>> (n24 -= F[101]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.render.texture.gif.A.d[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = F[102];
            n26 += F[103];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= F[104]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[F[105]];
        String string = (String)object[F[106]];
        object = object[F[107]];
        Object[] objectArray = E;
        if (E == null) {
            objectArray = E = new Object[F[108]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[F[109]];
                D = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[F[111] ^ F[112]];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[113] ^ kotakbaz.rain.client.render.texture.gif.A.F[114]] = F[115] ^ F[116];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[117] ^ kotakbaz.rain.client.render.texture.gif.A.F[118]] = F[119] ^ F[120];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[121] ^ kotakbaz.rain.client.render.texture.gif.A.F[122]] = F[123] ^ F[124];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[125] ^ kotakbaz.rain.client.render.texture.gif.A.F[126]] = F[127] ^ F[128];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[129] ^ kotakbaz.rain.client.render.texture.gif.A.F[130]] = F[131] ^ F[132];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[133] ^ kotakbaz.rain.client.render.texture.gif.A.F[134]] = F[135] ^ F[136];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[137] ^ kotakbaz.rain.client.render.texture.gif.A.F[138]] = F[139] ^ F[140];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[141] ^ kotakbaz.rain.client.render.texture.gif.A.F[142]] = F[143] ^ F[144];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[145] ^ kotakbaz.rain.client.render.texture.gif.A.F[146]] = F[147] ^ F[148];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[149] ^ kotakbaz.rain.client.render.texture.gif.A.F[150]] = F[151] ^ F[152];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[153] ^ kotakbaz.rain.client.render.texture.gif.A.F[154]] = F[155] ^ F[156];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[157] ^ kotakbaz.rain.client.render.texture.gif.A.F[158]] = F[159] ^ F[160];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[161] ^ kotakbaz.rain.client.render.texture.gif.A.F[162]] = F[163] ^ F[164];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[165] ^ kotakbaz.rain.client.render.texture.gif.A.F[166]] = F[167] ^ F[168];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[169] ^ kotakbaz.rain.client.render.texture.gif.A.F[170]] = F[171] ^ F[172];
                byArray[kotakbaz.rain.client.render.texture.gif.A.F[173] ^ kotakbaz.rain.client.render.texture.gif.A.F[174]] = F[175] ^ F[176];
                objectArray2[kotakbaz.rain.client.render.texture.gif.A.F[110]] = byArray;
            }
            byte[] byArray = (byte[])object3[F[177]];
            if (e == null) {
                byte[] byArray2 = new byte[F[178] ^ F[179]];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[180] ^ kotakbaz.rain.client.render.texture.gif.A.F[181]] = F[182] ^ F[183];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[184] ^ kotakbaz.rain.client.render.texture.gif.A.F[185]] = F[186] ^ F[187];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[188] ^ kotakbaz.rain.client.render.texture.gif.A.F[189]] = F[190] ^ F[191];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[192] ^ kotakbaz.rain.client.render.texture.gif.A.F[193]] = F[194] ^ F[195];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[196] ^ kotakbaz.rain.client.render.texture.gif.A.F[197]] = F[198] ^ F[199];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[200] ^ kotakbaz.rain.client.render.texture.gif.A.F[201]] = F[202] ^ F[203];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[204] ^ kotakbaz.rain.client.render.texture.gif.A.F[205]] = F[206] ^ F[207];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[208] ^ kotakbaz.rain.client.render.texture.gif.A.F[209]] = F[210] ^ F[211];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[212] ^ kotakbaz.rain.client.render.texture.gif.A.F[213]] = F[214] ^ F[215];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[216] ^ kotakbaz.rain.client.render.texture.gif.A.F[217]] = F[218] ^ F[219];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[220] ^ kotakbaz.rain.client.render.texture.gif.A.F[221]] = F[222] ^ F[223];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[224] ^ kotakbaz.rain.client.render.texture.gif.A.F[225]] = F[226] ^ F[227];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[228] ^ kotakbaz.rain.client.render.texture.gif.A.F[229]] = F[230] ^ F[231];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[232] ^ kotakbaz.rain.client.render.texture.gif.A.F[233]] = F[234] ^ F[235];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[236] ^ kotakbaz.rain.client.render.texture.gif.A.F[237]] = F[238] ^ F[239];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[240] ^ kotakbaz.rain.client.render.texture.gif.A.F[241]] = F[242] ^ F[243];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[244] ^ kotakbaz.rain.client.render.texture.gif.A.F[245]] = F[246] ^ F[247];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[248] ^ kotakbaz.rain.client.render.texture.gif.A.F[249]] = F[250] ^ F[251];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[252] ^ kotakbaz.rain.client.render.texture.gif.A.F[253]] = F[254] ^ F[255];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[256] ^ kotakbaz.rain.client.render.texture.gif.A.F[257]] = F[258] ^ F[259];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[260] ^ kotakbaz.rain.client.render.texture.gif.A.F[261]] = F[262] ^ F[263];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[264] ^ kotakbaz.rain.client.render.texture.gif.A.F[265]] = F[266] ^ F[267];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[268] ^ kotakbaz.rain.client.render.texture.gif.A.F[269]] = F[270] ^ F[271];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[272] ^ kotakbaz.rain.client.render.texture.gif.A.F[273]] = F[274] ^ F[275];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[276] ^ kotakbaz.rain.client.render.texture.gif.A.F[277]] = F[278] ^ F[279];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[280] ^ kotakbaz.rain.client.render.texture.gif.A.F[281]] = F[282] ^ F[283];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[284] ^ kotakbaz.rain.client.render.texture.gif.A.F[285]] = F[286] ^ F[287];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[288] ^ kotakbaz.rain.client.render.texture.gif.A.F[289]] = F[290] ^ F[291];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[292] ^ kotakbaz.rain.client.render.texture.gif.A.F[293]] = F[294] ^ F[295];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[296] ^ kotakbaz.rain.client.render.texture.gif.A.F[297]] = F[298] ^ F[299];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[300] ^ kotakbaz.rain.client.render.texture.gif.A.F[301]] = F[302] ^ F[303];
                byArray2[kotakbaz.rain.client.render.texture.gif.A.F[304] ^ kotakbaz.rain.client.render.texture.gif.A.F[305]] = F[306] ^ F[307];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, F[308], byArray3, F[309], byArray.length);
                System.arraycopy(byArray2, F[310], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.texture.gif.A.A()[F[311]];
                if (object4 == null) {
                    char[] cArray = "\u538a\u5380\u538d\u537e\u5384\u53d0\u53b9\u53e7\u538e\u53e2\u5382\u53eb\u53df\u53e5\u53b5\u5382\u537f\u53cf".toCharArray();
                    for (int i = F[312]; i < F[313]; ++i) {
                        int n2 = cArray[i];
                        n2 += F[314];
                        n2 += F[315];
                        n2 += F[316];
                        n2 ^= F[317];
                        n2 ^= F[318];
                        n2 += F[319];
                        n2 += F[320];
                        n2 += F[321];
                        n2 -= F[322];
                        n2 -= F[323];
                        n2 -= F[324];
                        n2 += F[325];
                        n2 -= F[326];
                        n2 -= F[327];
                        n2 -= F[328];
                        n2 ^= F[329];
                        cArray[i] = (char)(n2 -= F[330]);
                    }
                    object4 = kotakbaz.rain.client.render.texture.gif.A.A()[kotakbaz.rain.client.render.texture.gif.A.F[331]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[F[332]];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[333]] = F[334];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[335]] = F[336];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[337]] = F[338];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[339]] = F[340];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[341]] = F[342];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[343]] = F[344];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[345]] = F[346];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[347]] = F[348];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[349]] = F[350];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[351]] = F[352];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[353]] = F[354];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[355]] = F[356];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[357]] = F[358];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[359]] = F[360];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[361]] = F[362];
                byArray4[kotakbaz.rain.client.render.texture.gif.A.F[363]] = F[364];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, F[365], F[366]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.texture.gif.A.A()[F[367]];
                if (object5 == null) {
                    char[] cArray = "\u2424\u2400\u2412".toCharArray();
                    for (int i = F[368]; i < F[369]; ++i) {
                        int n3 = cArray[i];
                        n3 -= F[370];
                        n3 ^= F[371];
                        n3 ^= F[372];
                        n3 -= F[373];
                        n3 ^= F[374];
                        n3 ^= F[375];
                        n3 ^= F[376];
                        n3 += F[377];
                        n3 -= F[378];
                        n3 ^= F[379];
                        cArray[i] = (char)(n3 += F[380]);
                    }
                    object5 = kotakbaz.rain.client.render.texture.gif.A.A()[kotakbaz.rain.client.render.texture.gif.A.F[381]] = new String(cArray);
                }
                e = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, F[382], F[383]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, F[384], byArray6.length);
            Object object6 = kotakbaz.rain.client.render.texture.gif.A.A()[F[385]];
            if (object6 == null) {
                char[] cArray = "\u720f\u721b\u7201\u6aa5\u7211\u7218\u7211\u6aa5\u723e\u7219\u7211\u7201\u6aab\u723e\u6b6f\u6b7a\u6b7a\u6b77\u6b9c\u6b7d".toCharArray();
                for (int i = F[386]; i < F[387]; ++i) {
                    int n4 = cArray[i];
                    n4 -= F[388];
                    n4 ^= F[389];
                    n4 ^= F[390];
                    n4 -= F[391];
                    n4 ^= F[392];
                    n4 -= F[393];
                    n4 += F[394];
                    n4 += F[395];
                    n4 += F[396];
                    n4 ^= F[397];
                    n4 -= F[398];
                    cArray[i] = (char)(n4 ^= F[399]);
                }
                object6 = kotakbaz.rain.client.render.texture.gif.A.A()[3] = new String(cArray);
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
        kotakbaz.rain.client.render.texture.gif.A.F[0x10298 ^ 0x103B6] = 0x1C243 ^ 0x103B6;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAC40 ^ 0xACDE] = 0x5207 ^ 0xACDE;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6EDC ^ 0x6EBF] = 0x6EFB ^ 0x6EBF;
        kotakbaz.rain.client.render.texture.gif.A.F[0xDA46 ^ 0xDABE] = 0x5B00 ^ 0xDABE;
        kotakbaz.rain.client.render.texture.gif.A.F[0xBAB0 ^ 0xBACF] = 0x70C1 ^ 0xBACF;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2901 ^ 0x287C] = 0x287E ^ 0x287C;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE3F0 ^ 0xE3C7] = 0xE39C ^ 0xE3C7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5293 ^ 0x52F1] = 0xFFFFAD17 ^ 0x52F1;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE686 ^ 0xE62D] = 0xE71D ^ 0xE62D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x100C1 ^ 0x1018E] = 0x10186 ^ 0x1018E;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3A91 ^ 0x3AC7] = 0x3ACA ^ 0x3AC7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1B1D ^ 0x1B52] = 0x1B31 ^ 0x1B52;
        kotakbaz.rain.client.render.texture.gif.A.F[0x9379 ^ 0x9222] = 0x922F ^ 0x9222;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC4F4 ^ 0xC444] = 0xC3ED ^ 0xC444;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3121 ^ 0x3120] = 0x3116 ^ 0x3120;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6583 ^ 0x654C] = 0xFA3F ^ 0x654C;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB6CB ^ 0xB6CB] = 0xB61A ^ 0xB6CB;
        kotakbaz.rain.client.render.texture.gif.A.F[0x609D ^ 0x60BE] = 0x9FCD ^ 0x60BE;
        kotakbaz.rain.client.render.texture.gif.A.F[0xBEB9 ^ 0xBF96] = 0x7E00 ^ 0xBF96;
        kotakbaz.rain.client.render.texture.gif.A.F[0x535F ^ 0x5276] = 0x5165 ^ 0x5276;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6816 ^ 0x682E] = 0xFFFF97DF ^ 0x682E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE305 ^ 0xE359] = 0xE332 ^ 0xE359;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE921 ^ 0xE96A] = 0xE950 ^ 0xE96A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1774 ^ 0x1603] = 0x6CE7 ^ 0x1603;
        kotakbaz.rain.client.render.texture.gif.A.F[0x13FC ^ 0x1318] = 0x57B0 ^ 0x1318;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB5F5 ^ 0xB4F6] = 0x235E ^ 0xB4F6;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2CBF ^ 0x2CE2] = 0x2C46 ^ 0x2CE2;
        kotakbaz.rain.client.render.texture.gif.A.F[0x89EE ^ 0x8954] = 0xFFFF5FB6 ^ 0x8954;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7ADD ^ 0x7A68] = 0x4F08 ^ 0x7A68;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10831 ^ 0x1082C] = 0x1082C ^ 0x1082C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x961E ^ 0x9790] = 0x24CE ^ 0x9790;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10839 ^ 0x108DA] = 0x15FD1 ^ 0x108DA;
        kotakbaz.rain.client.render.texture.gif.A.F[0xEE0B ^ 0xEEF1] = 0x6F15 ^ 0xEEF1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3973 ^ 0x386A] = 0xC0D3 ^ 0x386A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2970 ^ 0x29BC] = 0xB6CB ^ 0x29BC;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1994 ^ 0x1881] = 0x2D2D ^ 0x1881;
        kotakbaz.rain.client.render.texture.gif.A.F[0x87A4 ^ 0x86A6] = 0xFFFFEE8B ^ 0x86A6;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF198 ^ 0xF0E8] = 0xF0E8 ^ 0xF0E8;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF0E6 ^ 0xF16B] = 0x70C7 ^ 0xF16B;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8D00 ^ 0x8D2A] = 0xFF90 ^ 0x8D2A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10AE0 ^ 0x10ABE] = 0xFFFEF556 ^ 0x10ABE;
        kotakbaz.rain.client.render.texture.gif.A.F[0x45E5 ^ 0x45B5] = 0x459C ^ 0x45B5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x616E ^ 0x61C6] = 0x8609 ^ 0x61C6;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8546 ^ 0x85DD] = 0xFFFF7F41 ^ 0x85DD;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB081 ^ 0xB074] = 0x14A3 ^ 0xB074;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3BF2 ^ 0x3BC7] = 0x3BD8 ^ 0x3BC7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x192D ^ 0x199C] = 0x199C ^ 0x199C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2C26 ^ 0x2D1D] = 0xF19D ^ 0x2D1D;
        kotakbaz.rain.client.render.texture.gif.A.F[0xED47 ^ 0xEC79] = 0x4391 ^ 0xEC79;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB437 ^ 0xB485] = 0x8E07 ^ 0xB485;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC6BE ^ 0xC660] = 0xFFFF074E ^ 0xC660;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2FC6 ^ 0x2FCE] = 0xFFFFD06F ^ 0x2FCE;
        kotakbaz.rain.client.render.texture.gif.A.F[0x58B2 ^ 0x59E1] = 0x59EB ^ 0x59E1;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFF7D ^ 0xFF58] = 0xC80C ^ 0xFF58;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC0D3 ^ 0xC046] = 0xDEB6 ^ 0xC046;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4758 ^ 0x465F] = 0x713B ^ 0x465F;
        kotakbaz.rain.client.render.texture.gif.A.F[0xA60F ^ 0xA71E] = 0xDBB1 ^ 0xA71E;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6B6D ^ 0x6B8F] = 0x3C88 ^ 0x6B8F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3435 ^ 0x3516] = 0x7B89 ^ 0x3516;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB2B0 ^ 0xB382] = 0xA378 ^ 0xB382;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2719 ^ 0x267A] = 0x2671 ^ 0x267A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x60D3 ^ 0x604B] = 0x7EBC ^ 0x604B;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5956 ^ 0x5914] = 0xFFFFA6B9 ^ 0x5914;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF680 ^ 0xF6DA] = 0xFFFF0969 ^ 0xF6DA;
        kotakbaz.rain.client.render.texture.gif.A.F[0x394E ^ 0x3816] = 0xFFFFC790 ^ 0x3816;
        kotakbaz.rain.client.render.texture.gif.A.F[0x66E5 ^ 0x660F] = 0x16719 ^ 0x660F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1C8A ^ 0x1DD0] = 0x1D93 ^ 0x1DD0;
        kotakbaz.rain.client.render.texture.gif.A.F[0x55E8 ^ 0x5592] = 0x15E03 ^ 0x5592;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE8CF ^ 0xE84A] = 0xBF1C ^ 0xE84A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4B6B ^ 0x4B77] = 0x4B75 ^ 0x4B77;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC1F3 ^ 0xC183] = 0xE221 ^ 0xC183;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3908 ^ 0x3874] = 0xE67B ^ 0x3874;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD304 ^ 0xD254] = 0xD232 ^ 0xD254;
        kotakbaz.rain.client.render.texture.gif.A.F[0x73E7 ^ 0x7291] = 0x642 ^ 0x7291;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1058C ^ 0x10550] = 0x13B93 ^ 0x10550;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8A72 ^ 0x8ACA] = 0xA3A8 ^ 0x8ACA;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2D17 ^ 0x2D1B] = 0xFFFFD2CE ^ 0x2D1B;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB624 ^ 0xB6A8] = 0xBADF ^ 0xB6A8;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB35F ^ 0xB332] = 0xB333 ^ 0xB332;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE166 ^ 0xE1B4] = 0xFFFFD5A7 ^ 0xE1B4;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAF95 ^ 0xAEED] = 0x826B ^ 0xAEED;
        kotakbaz.rain.client.render.texture.gif.A.F[0x9967 ^ 0x991A] = 0x533D ^ 0x991A;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD293 ^ 0xD26F] = 0x7923 ^ 0xD26F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2D49 ^ 0x2D9E] = 0x9558 ^ 0x2D9E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD6FB ^ 0xD60B] = 0x59A2 ^ 0xD60B;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCBCB ^ 0xCBF0] = 0xCBBC ^ 0xCBF0;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5A8D ^ 0x5A6C] = 0xD67 ^ 0x5A6C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x93DF ^ 0x92F3] = 0x5367 ^ 0x92F3;
        kotakbaz.rain.client.render.texture.gif.A.F[0x714F ^ 0x71A6] = 0x170A0 ^ 0x71A6;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFCE1 ^ 0xFC92] = 0x20B3 ^ 0xFC92;
        kotakbaz.rain.client.render.texture.gif.A.F[0x40F1 ^ 0x41FD] = 0x3B34 ^ 0x41FD;
        kotakbaz.rain.client.render.texture.gif.A.F[0x39C9 ^ 0x39FD] = 0x39A1 ^ 0x39FD;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10577 ^ 0x1045D] = 0x10726 ^ 0x1045D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x86F ^ 0x944] = 0xA57 ^ 0x944;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4212 ^ 0x4308] = 0xFFFF4453 ^ 0x4308;
        kotakbaz.rain.client.render.texture.gif.A.F[0x11C8 ^ 0x11E1] = 0x279B ^ 0x11E1;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFDAD ^ 0xFDD1] = 0x1F640 ^ 0xFDD1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x73FB ^ 0x7282] = 0x80AA ^ 0x7282;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE10D ^ 0xE14B] = 0xE14D ^ 0xE14B;
        kotakbaz.rain.client.render.texture.gif.A.F[0x9339 ^ 0x9359] = 0x9365 ^ 0x9359;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7E51 ^ 0x7ED3] = 0x63E9 ^ 0x7ED3;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4439 ^ 0x4495] = 0x45DA ^ 0x4495;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD41B ^ 0xD419] = 0xFFFF2B9C ^ 0xD419;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB244 ^ 0xB372] = 0xB372 ^ 0xB372;
        kotakbaz.rain.client.render.texture.gif.A.F[0xDECE ^ 0xDF45] = 0x719C ^ 0xDF45;
        kotakbaz.rain.client.render.texture.gif.A.F[0xA212 ^ 0xA2D1] = 0xE9B3 ^ 0xA2D1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3EAA ^ 0x3EF5] = 0x3E99 ^ 0x3EF5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x24C6 ^ 0x2582] = 0xF5F7 ^ 0x2582;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7A22 ^ 0x7AEB] = 0x5BAC ^ 0x7AEB;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7B8D ^ 0x7B9B] = 0xFFFF8413 ^ 0x7B9B;
        kotakbaz.rain.client.render.texture.gif.A.F[0x171C ^ 0x17E1] = 0xBCA2 ^ 0x17E1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1068E ^ 0x106F7] = 0xD62 ^ 0x106F7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2B9A ^ 0x2B83] = 0x2B83 ^ 0x2B83;
        kotakbaz.rain.client.render.texture.gif.A.F[0x30A3 ^ 0x3043] = 0x674D ^ 0x3043;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAE21 ^ 0xAE86] = 0xFFFFB6A6 ^ 0xAE86;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAF5E ^ 0xAF0A] = 0xFFFF50D6 ^ 0xAF0A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x88E6 ^ 0x898C] = 0xFFFF7672 ^ 0x898C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x852 ^ 0x913] = 0xD9BE ^ 0x913;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10951 ^ 0x109EC] = 0x1D9CD ^ 0x109EC;
        kotakbaz.rain.client.render.texture.gif.A.F[0xEEFF ^ 0xEFE8] = 0xDA44 ^ 0xEFE8;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF533 ^ 0xF51D] = 0xF963 ^ 0xF51D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x441B ^ 0x4508] = 0x39A7 ^ 0x4508;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE493 ^ 0xE42C] = 0x340D ^ 0xE42C;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF54A ^ 0xF4CC] = 0xB58F ^ 0xF4CC;
        kotakbaz.rain.client.render.texture.gif.A.F[0x128D ^ 0x12E8] = 0x12EA ^ 0x12E8;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7096 ^ 0x71DF] = 0x4C81 ^ 0x71DF;
        kotakbaz.rain.client.render.texture.gif.A.F[0xDAA8 ^ 0xDA29] = 0xC718 ^ 0xDA29;
        kotakbaz.rain.client.render.texture.gif.A.F[0x92D4 ^ 0x93DE] = 0xE60C ^ 0x93DE;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAB8F ^ 0xAAE0] = 0xAAE2 ^ 0xAAE0;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6B97 ^ 0x6AAB] = 0xC149 ^ 0x6AAB;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD02C ^ 0xD0D2] = 0xFFFF8445 ^ 0xD0D2;
        kotakbaz.rain.client.render.texture.gif.A.F[0x18BF ^ 0x1809] = 0x2D29 ^ 0x1809;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1038 ^ 0x1123] = 0xE99A ^ 0x1123;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD9F0 ^ 0xD9D1] = 0x4E5E ^ 0xD9D1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4752 ^ 0x466D] = 0x8607 ^ 0x466D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5DE1 ^ 0x5DC7] = 0xE7D2 ^ 0x5DC7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x949F ^ 0x95FA] = 0x95FA ^ 0x95FA;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4FE7 ^ 0x4F7A] = 0xB1A6 ^ 0x4F7A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2F7 ^ 0x268] = 0xFCD7 ^ 0x268;
        kotakbaz.rain.client.render.texture.gif.A.F[0xDF1F ^ 0xDE10] = 0xA4D5 ^ 0xDE10;
        kotakbaz.rain.client.render.texture.gif.A.F[0x107D9 ^ 0x106ED] = 0x106ED ^ 0x106ED;
        kotakbaz.rain.client.render.texture.gif.A.F[0x89D7 ^ 0x8985] = 0x89E5 ^ 0x8985;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1099D ^ 0x10956] = 0x12811 ^ 0x10956;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF0FA ^ 0xF060] = 0xF54A ^ 0xF060;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3E8C ^ 0x3FD5] = 0x3FD1 ^ 0x3FD5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x974 ^ 0x9E8] = 0xCC2 ^ 0x9E8;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE732 ^ 0xE7DD] = 0x6353 ^ 0xE7DD;
        kotakbaz.rain.client.render.texture.gif.A.F[0x61F4 ^ 0x61C5] = 0xFFFF9E41 ^ 0x61C5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x678C ^ 0x6789] = 0xFFFF983B ^ 0x6789;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10281 ^ 0x10217] = 0x11CE0 ^ 0x10217;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8108 ^ 0x802C] = 0x34D3 ^ 0x802C;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF39E ^ 0xF28C] = 0x8E32 ^ 0xF28C;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCC85 ^ 0xCDBF] = 0xCC1F ^ 0xCDBF;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF970 ^ 0xF9CE] = 0x29FC ^ 0xF9CE;
        kotakbaz.rain.client.render.texture.gif.A.F[0x56D0 ^ 0x56B1] = 0x56C7 ^ 0x56B1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7CD5 ^ 0x7C05] = 0xB7EE ^ 0x7C05;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFD88 ^ 0xFC04] = 0xB8DD ^ 0xFC04;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB1E0 ^ 0xB09F] = 0xB08F ^ 0xB09F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x42 ^ 0x5A] = 0x59 ^ 0x5A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1957 ^ 0x1917] = 0xFFFFE68A ^ 0x1917;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE4BE ^ 0xE480] = 0xFFFF1B52 ^ 0xE480;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1C9D ^ 0x1C4C] = 0xD7AD ^ 0x1C4C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5E4F ^ 0x5F59] = 0xFFFF955F ^ 0x5F59;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB557 ^ 0xB550] = 0xB518 ^ 0xB550;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCB36 ^ 0xCBFC] = 0xFFFF1538 ^ 0xCBFC;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6BF ^ 0x79A] = 0xB36B ^ 0x79A;
        kotakbaz.rain.client.render.texture.gif.A.F[0xBEE4 ^ 0xBEAC] = 0xFFFF4195 ^ 0xBEAC;
        kotakbaz.rain.client.render.texture.gif.A.F[0xDC9E ^ 0xDC2D] = 0xE68F ^ 0xDC2D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2182 ^ 0x20C0] = 0xCE52 ^ 0x20C0;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6F55 ^ 0x6F58] = 0xFFFF90C2 ^ 0x6F58;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1C7D ^ 0x1D29] = 0x1D40 ^ 0x1D29;
        kotakbaz.rain.client.render.texture.gif.A.F[0x59F8 ^ 0x5909] = 0xD6A8 ^ 0x5909;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCC66 ^ 0xCC3E] = 0xFFFF33E9 ^ 0xCC3E;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5ABB ^ 0x5A22] = 0x5F07 ^ 0x5A22;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1010F ^ 0x10106] = 0x10108 ^ 0x10106;
        kotakbaz.rain.client.render.texture.gif.A.F[0x67BC ^ 0x66A0] = 0x49D4 ^ 0x66A0;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD573 ^ 0xD51B] = 0xD543 ^ 0xD51B;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7D17 ^ 0x7C5B] = 0x7C4B ^ 0x7C5B;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7DB6 ^ 0x7CDD] = 0x7CDA ^ 0x7CDD;
        kotakbaz.rain.client.render.texture.gif.A.F[0x77BF ^ 0x777B] = 0x450 ^ 0x777B;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC3A8 ^ 0xC308] = 0x3DD1 ^ 0xC308;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2B2C ^ 0x2BDA] = 0x8F08 ^ 0x2BDA;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1000C ^ 0x100CD] = 0x14BAF ^ 0x100CD;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6BF3 ^ 0x6B3E] = 0xF44D ^ 0x6B3E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xBBBD ^ 0xBB66] = 0xFC70 ^ 0xBB66;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF316 ^ 0xF384] = 0xE031 ^ 0xF384;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2C90 ^ 0x2C39] = 0x2D77 ^ 0x2C39;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB467 ^ 0xB4A9] = 0xFFFFD469 ^ 0xB4A9;
        kotakbaz.rain.client.render.texture.gif.A.F[0x65B0 ^ 0x6569] = 0x227F ^ 0x6569;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFBF2 ^ 0xFAB5] = 0xAA29 ^ 0xFAB5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2313 ^ 0x2256] = 0x2A8D ^ 0x2256;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAD8F ^ 0xADFE] = 0x71E3 ^ 0xADFE;
        kotakbaz.rain.client.render.texture.gif.A.F[0x106A3 ^ 0x106BC] = 0x10690 ^ 0x106BC;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCA65 ^ 0xCB48] = 0xADE ^ 0xCB48;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC066 ^ 0xC128] = 0xC10B ^ 0xC128;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2216 ^ 0x22E9] = 0x89AA ^ 0x22E9;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2BB5 ^ 0x2ADD] = 0xFFFFD519 ^ 0x2ADD;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF8EA ^ 0xF83E] = 0x40F8 ^ 0xF83E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC058 ^ 0xC0FB] = 0xFFFF9B36 ^ 0xC0FB;
        kotakbaz.rain.client.render.texture.gif.A.F[0x84F3 ^ 0x84C9] = 0xFFFF7B5A ^ 0x84C9;
        kotakbaz.rain.client.render.texture.gif.A.F[0x81E6 ^ 0x8181] = 0x81C1 ^ 0x8181;
        kotakbaz.rain.client.render.texture.gif.A.F[0xEFD6 ^ 0xEE9C] = 0x4FE3 ^ 0xEE9C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x89CB ^ 0x8918] = 0x42F9 ^ 0x8918;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC0A9 ^ 0xC12E] = 0x367D ^ 0xC12E;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3B85 ^ 0x3BD4] = 0x3B28 ^ 0x3BD4;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFEFF ^ 0xFE13] = 0x7A9A ^ 0xFE13;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5591 ^ 0x558F] = 0x558F ^ 0x558F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10CF5 ^ 0x10DC5] = 0x11D11 ^ 0x10DC5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2F37 ^ 0x2F53] = 0xFFFFD08D ^ 0x2F53;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAB5 ^ 0xBE0] = 0xBEE ^ 0xBE0;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB150 ^ 0xB107] = 0xFFFF4E99 ^ 0xB107;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFF0 ^ 0xFAB] = 0xFFFFF053 ^ 0xFAB;
        kotakbaz.rain.client.render.texture.gif.A.F[0xABC5 ^ 0xAAAB] = 0xABAB ^ 0xAAAB;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC085 ^ 0xC076] = 0x4FD7 ^ 0xC076;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD8BA ^ 0xD83C] = 0x8F67 ^ 0xD83C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x13C5 ^ 0x12FC] = 0x12EE ^ 0x12FC;
        kotakbaz.rain.client.render.texture.gif.A.F[0x440F ^ 0x4575] = 0xB4E ^ 0x4575;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5CFE ^ 0x5C24] = 0x1B19 ^ 0x5C24;
        kotakbaz.rain.client.render.texture.gif.A.F[0x888E ^ 0x89B3] = 0x29F7 ^ 0x89B3;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF3B5 ^ 0xF37D] = 0xD226 ^ 0xF37D;
        kotakbaz.rain.client.render.texture.gif.A.F[0xA57B ^ 0xA503] = 0xBCC3 ^ 0xA503;
        kotakbaz.rain.client.render.texture.gif.A.F[0x55F5 ^ 0x5497] = 0x54F4 ^ 0x5497;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1652 ^ 0x1626] = 0xCA32 ^ 0x1626;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5997 ^ 0x58DA] = 0x58D9 ^ 0x58DA;
        kotakbaz.rain.client.render.texture.gif.A.F[0x23A9 ^ 0x22EF] = 0x80D3 ^ 0x22EF;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCEC5 ^ 0xCEAC] = 0xCEAD ^ 0xCEAC;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC5DE ^ 0xC5C4] = 0xC5C5 ^ 0xC5C4;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10879 ^ 0x1086D] = 0xFFFEF7D5 ^ 0x1086D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x18B9 ^ 0x19C7] = 0x19C7 ^ 0x19C7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6D03 ^ 0x6DB7] = 0x58CA ^ 0x6DB7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7FA1 ^ 0x7EE2] = 0x4E30 ^ 0x7EE2;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB037 ^ 0xB062] = 0xB033 ^ 0xB062;
        kotakbaz.rain.client.render.texture.gif.A.F[0x76D5 ^ 0x76A2] = 0xFFFF90C7 ^ 0x76A2;
        kotakbaz.rain.client.render.texture.gif.A.F[0x67D6 ^ 0x67E6] = 0xFFFF9815 ^ 0x67E6;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB531 ^ 0xB5B8] = 0xB9C7 ^ 0xB5B8;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3E85 ^ 0x3EB7] = 0xFFFFC106 ^ 0x3EB7;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF241 ^ 0xF27D] = 0xF25F ^ 0xF27D;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC821 ^ 0xC940] = 0xC941 ^ 0xC940;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB29A ^ 0xB235] = 0xFFFF4A53 ^ 0xB235;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE2E6 ^ 0xE3EE] = 0x967D ^ 0xE3EE;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5A65 ^ 0x5A1E] = 0x151B3 ^ 0x5A1E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB21E ^ 0xB2C8] = 0xA50 ^ 0xB2C8;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5616 ^ 0x5727] = 0x47F8 ^ 0x5727;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4790 ^ 0x47FE] = 0x47FE ^ 0x47FE;
        kotakbaz.rain.client.render.texture.gif.A.F[0x37BC ^ 0x369E] = 0xFFFF87E5 ^ 0x369E;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3D0C ^ 0x3D07] = 0x3D1C ^ 0x3D07;
        kotakbaz.rain.client.render.texture.gif.A.F[0x25DB ^ 0x2596] = 0xFFFFDA57 ^ 0x2596;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAD04 ^ 0xAC2C] = 0xAF2E ^ 0xAC2C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x506 ^ 0x420] = 0xB0CE ^ 0x420;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5282 ^ 0x5209] = 0x5E5F ^ 0x5209;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC013 ^ 0xC174] = 0xC17D ^ 0xC174;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE7CF ^ 0xE6C1] = 0xFFFF63FD ^ 0xE6C1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3200 ^ 0x32C5] = 0x41F0 ^ 0x32C5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4719 ^ 0x461F] = 0x716F ^ 0x461F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x9027 ^ 0x9138] = 0xBE5C ^ 0x9138;
        kotakbaz.rain.client.render.texture.gif.A.F[0x101D4 ^ 0x1013A] = 0x18583 ^ 0x1013A;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCF1A ^ 0xCFBF] = 0x2876 ^ 0xCFBF;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5118 ^ 0x5137] = 0x5137 ^ 0x5137;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4D3D ^ 0x4CBC] = 0x4CBF ^ 0x4CBC;
        kotakbaz.rain.client.render.texture.gif.A.F[0x42B7 ^ 0x43D7] = 0xFFFFBC3A ^ 0x43D7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4C31 ^ 0x4C23] = 0x4CAE ^ 0x4C23;
        kotakbaz.rain.client.render.texture.gif.A.F[0x295D ^ 0x2840] = 0x724 ^ 0x2840;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10A95 ^ 0x10BDD] = 0x1F4C0 ^ 0x10BDD;
        kotakbaz.rain.client.render.texture.gif.A.F[0x46A6 ^ 0x468E] = 0x4C17 ^ 0x468E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xBACA ^ 0xBA86] = 0xFFFF4521 ^ 0xBA86;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8E98 ^ 0x8F93] = 0xFA18 ^ 0x8F93;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7434 ^ 0x756B] = 0x7567 ^ 0x756B;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7D2D ^ 0x7D7E] = 0x7D02 ^ 0x7D7E;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7DF0 ^ 0x7D32] = 0xFFFFC98F ^ 0x7D32;
        kotakbaz.rain.client.render.texture.gif.A.F[0x62BC ^ 0x6247] = 0xE3FF ^ 0x6247;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7573 ^ 0x75E4] = 0xFFFF9481 ^ 0x75E4;
        kotakbaz.rain.client.render.texture.gif.A.F[0xEBDF ^ 0xEAFE] = 0xA461 ^ 0xEAFE;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB3CE ^ 0xB2CF] = 0x2567 ^ 0xB2CF;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2AE7 ^ 0x2A45] = 0x8E2E ^ 0x2A45;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6C2A ^ 0x6C24] = 0x6C3F ^ 0x6C24;
        kotakbaz.rain.client.render.texture.gif.A.F[0x483E ^ 0x48B3] = 0x8A8A ^ 0x48B3;
        kotakbaz.rain.client.render.texture.gif.A.F[0x733F ^ 0x73BF] = 0xB99A ^ 0x73BF;
        kotakbaz.rain.client.render.texture.gif.A.F[0x66B1 ^ 0x6656] = 0x22E7 ^ 0x6656;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB2D2 ^ 0xB38C] = 0xFFFF4C14 ^ 0xB38C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7287 ^ 0x73E1] = 0x73C0 ^ 0x73E1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x47BF ^ 0x47D5] = 0x47D7 ^ 0x47D5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5997 ^ 0x593A] = 0x5E9F ^ 0x593A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x52CA ^ 0x5260] = 0x532F ^ 0x5260;
        kotakbaz.rain.client.render.texture.gif.A.F[0x78F7 ^ 0x7831] = 0xB02 ^ 0x7831;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7E42 ^ 0x7E51] = 0x7E15 ^ 0x7E51;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE3EC ^ 0xE339] = 0x5BFF ^ 0xE339;
        kotakbaz.rain.client.render.texture.gif.A.F[0xDED8 ^ 0xDF89] = 0xDF8F ^ 0xDF89;
        kotakbaz.rain.client.render.texture.gif.A.F[0xA147 ^ 0xA04E] = 0xD5C5 ^ 0xA04E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAE11 ^ 0xAF6A] = 0x3E67 ^ 0xAF6A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x721C ^ 0x7273] = 0x51C1 ^ 0x7273;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1094E ^ 0x10959] = 0x10903 ^ 0x10959;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5EB1 ^ 0x5FC4] = 0x9C37 ^ 0x5FC4;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1231 ^ 0x13B1] = 0x13A1 ^ 0x13B1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10D6F ^ 0x10D1D] = 0x1D109 ^ 0x10D1D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x9E8F ^ 0x9E2B] = 0x3A40 ^ 0x9E2B;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB354 ^ 0xB259] = 0xC89C ^ 0xB259;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC219 ^ 0xC28D] = 0xD138 ^ 0xC28D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6E18 ^ 0x6E3F] = 0xE368 ^ 0x6E3F;
        kotakbaz.rain.client.render.texture.gif.A.F[0xA852 ^ 0xA8A0] = 0xFFFFD8F6 ^ 0xA8A0;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCDD9 ^ 0xCD49] = 0xF7A ^ 0xCD49;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10A3C ^ 0x10B0F] = 0x11BD0 ^ 0x10B0F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6FE3 ^ 0x6FF2] = 0xFFFF9000 ^ 0x6FF2;
        kotakbaz.rain.client.render.texture.gif.A.F[0x9ABB ^ 0x9B3E] = 0x168F ^ 0x9B3E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB7A4 ^ 0xB77C] = 0xF078 ^ 0xB77C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x85B4 ^ 0x84A4] = 0xF80A ^ 0x84A4;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8279 ^ 0x8259] = 0x45D0 ^ 0x8259;
        kotakbaz.rain.client.render.texture.gif.A.F[0x31 ^ 0x35] = 0xFFFFFFA9 ^ 0x35;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB9CE ^ 0xB940] = 0x7B73 ^ 0xB940;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1045A ^ 0x1049A] = 0x14FEE ^ 0x1049A;
        kotakbaz.rain.client.render.texture.gif.A.F[0xEE63 ^ 0xEEEB] = 0xB9B0 ^ 0xEEEB;
        kotakbaz.rain.client.render.texture.gif.A.F[0x22EC ^ 0x2287] = 0x2287 ^ 0x2287;
        kotakbaz.rain.client.render.texture.gif.A.F[0xBEB3 ^ 0xBE56] = 0xFAE7 ^ 0xBE56;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2A6A ^ 0x2B03] = 0x2B06 ^ 0x2B03;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFB16 ^ 0xFBFB] = 0x7F75 ^ 0xFBFB;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3A1B ^ 0x3A77] = 0x3A76 ^ 0x3A77;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC1F4 ^ 0xC129] = 0xFFF5 ^ 0xC129;
        kotakbaz.rain.client.render.texture.gif.A.F[0x76CF ^ 0x7673] = 0xA649 ^ 0x7673;
        kotakbaz.rain.client.render.texture.gif.A.F[0x48EA ^ 0x485D] = 0x7D3D ^ 0x485D;
        kotakbaz.rain.client.render.texture.gif.A.F[0x244 ^ 0x363] = 0xB792 ^ 0x363;
        kotakbaz.rain.client.render.texture.gif.A.F[0x9DB ^ 0x8AA] = 0x8A9 ^ 0x8AA;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF0D ^ 0xE82] = 0x9DBC ^ 0xE82;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8C5B ^ 0x8C1F] = 0x8C42 ^ 0x8C1F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4E0D ^ 0x4EB6] = 0x67C3 ^ 0x4EB6;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1180 ^ 0x11CE] = 0xFFFFEE4A ^ 0x11CE;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE052 ^ 0xE00B] = 0xE052 ^ 0xE00B;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC5BB ^ 0xC54C] = 0x619B ^ 0xC54C;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB5F4 ^ 0xB5F7] = 0xFFFF4A05 ^ 0xB5F7;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7F39 ^ 0x7F78] = 0xFFFF8094 ^ 0x7F78;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5BB3 ^ 0x5B34] = 0xFFFFF3CF ^ 0x5B34;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC015 ^ 0xC0AC] = 0xE9D9 ^ 0xC0AC;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB945 ^ 0xB845] = 0x2FE4 ^ 0xB845;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7D5A ^ 0x7C7A] = 0x32E6 ^ 0x7C7A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x74B6 ^ 0x7480] = 0x74F4 ^ 0x7480;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7923 ^ 0x783D] = 0xFFFFA88D ^ 0x783D;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD320 ^ 0xD217] = 0xD216 ^ 0xD217;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2853 ^ 0x2877] = 0xD1E4 ^ 0x2877;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3365 ^ 0x33C4] = 0x97AF ^ 0x33C4;
        kotakbaz.rain.client.render.texture.gif.A.F[0x30B7 ^ 0x3033] = 0x2D09 ^ 0x3033;
        kotakbaz.rain.client.render.texture.gif.A.F[0x82E0 ^ 0x82EF] = 0x82DA ^ 0x82EF;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC877 ^ 0xC96F] = 0x31C2 ^ 0xC96F;
        kotakbaz.rain.client.render.texture.gif.A.F[0xF6A3 ^ 0xF690] = 0xF60B ^ 0xF690;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6011 ^ 0x6147] = 0xFFFF9E83 ^ 0x6147;
        kotakbaz.rain.client.render.texture.gif.A.F[0x296A ^ 0x290C] = 0x2934 ^ 0x290C;
        kotakbaz.rain.client.render.texture.gif.A.F[0xA2E1 ^ 0xA385] = 0xFFFF5C23 ^ 0xA385;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD57A ^ 0xD561] = 0xD561 ^ 0xD561;
        kotakbaz.rain.client.render.texture.gif.A.F[0x9E39 ^ 0x9E29] = 0xFFFF61EE ^ 0x9E29;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1C8F ^ 0x1DCF] = 0xF82 ^ 0x1DCF;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB5F9 ^ 0xB4C1] = 0xB4C1 ^ 0xB4C1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3BCE ^ 0x3A99] = 0x3A96 ^ 0x3A99;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD514 ^ 0xD59B] = 0xFFFFE811 ^ 0xD59B;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD41A ^ 0xD51F] = 0xE27B ^ 0xD51F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5CFB ^ 0x5C1D] = 0xFFFFE74C ^ 0x5C1D;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC633 ^ 0xC76F] = 0xFFFF388C ^ 0xC76F;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE2A6 ^ 0xE2E3] = 0xFFFF1D32 ^ 0xE2E3;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10197 ^ 0x10093] = 0x137ED ^ 0x10093;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB76F ^ 0xB6ED] = 0xB6ED ^ 0xB6ED;
        kotakbaz.rain.client.render.texture.gif.A.F[0x315E ^ 0x3120] = 0xFB05 ^ 0x3120;
        kotakbaz.rain.client.render.texture.gif.A.F[0x22B3 ^ 0x2258] = 0x1235E ^ 0x2258;
        kotakbaz.rain.client.render.texture.gif.A.F[0x95FC ^ 0x948E] = 0x4E8E ^ 0x948E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xED8E ^ 0xECE2] = 0xFFFF1356 ^ 0xECE2;
        kotakbaz.rain.client.render.texture.gif.A.F[0xDD15 ^ 0xDD9F] = 0xD1E8 ^ 0xDD9F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3B5D ^ 0x3BCC] = 0x287A ^ 0x3BCC;
        kotakbaz.rain.client.render.texture.gif.A.F[0xACE8 ^ 0xACA2] = 0xFFFF5329 ^ 0xACA2;
        kotakbaz.rain.client.render.texture.gif.A.F[0x10482 ^ 0x10488] = 0x10481 ^ 0x10488;
        kotakbaz.rain.client.render.texture.gif.A.F[0xD3F8 ^ 0xD3BB] = 0xD3B2 ^ 0xD3BB;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8FE0 ^ 0x8ED5] = 0x8ED5 ^ 0x8ED5;
        kotakbaz.rain.client.render.texture.gif.A.F[0x102B6 ^ 0x102F1] = 0xFFFEFD46 ^ 0x102F1;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4F0D ^ 0x4E60] = 0x4E6D ^ 0x4E60;
        kotakbaz.rain.client.render.texture.gif.A.F[0x282 ^ 0x3F1] = 0xDB40 ^ 0x3F1;
        kotakbaz.rain.client.render.texture.gif.A.F[0xAFB4 ^ 0xAE3C] = 0x4DA8 ^ 0xAE3C;
        kotakbaz.rain.client.render.texture.gif.A.F[0x3AD5 ^ 0x3BC1] = 0xE60 ^ 0x3BC1;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFAFD ^ 0xFA8B] = 0xE34B ^ 0xFA8B;
        kotakbaz.rain.client.render.texture.gif.A.F[0x312 ^ 0x3EB] = 0x8253 ^ 0x3EB;
        kotakbaz.rain.client.render.texture.gif.A.F[0x5EBD ^ 0x5E13] = 0x59BA ^ 0x5E13;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1670 ^ 0x1722] = 0xFFFFE8BF ^ 0x1722;
        kotakbaz.rain.client.render.texture.gif.A.F[0x2BAD ^ 0x2A29] = 0x1C99 ^ 0x2A29;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB4A4 ^ 0xB488] = 0x1C73 ^ 0xB488;
        kotakbaz.rain.client.render.texture.gif.A.F[0x7532 ^ 0x751F] = 0xA8C2 ^ 0x751F;
        kotakbaz.rain.client.render.texture.gif.A.F[0x77F3 ^ 0x767A] = 0xA0CD ^ 0x767A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x1373 ^ 0x133A] = 0xFFFFECB4 ^ 0x133A;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6DE ^ 0x601] = 0x38DD ^ 0x601;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC588 ^ 0xC4FC] = 0xA7BF ^ 0xC4FC;
        kotakbaz.rain.client.render.texture.gif.A.F[0xA8FF ^ 0xA88A] = 0xB144 ^ 0xA88A;
        kotakbaz.rain.client.render.texture.gif.A.F[0xBA50 ^ 0xBA72] = 0x1920 ^ 0xBA72;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCAED ^ 0xCAD2] = 0xFFFF3543 ^ 0xCAD2;
        kotakbaz.rain.client.render.texture.gif.A.F[0x902 ^ 0x93F] = 0xFFFFF6EB ^ 0x93F;
        kotakbaz.rain.client.render.texture.gif.A.F[0xB934 ^ 0xB91F] = 0xA445 ^ 0xB91F;
        kotakbaz.rain.client.render.texture.gif.A.F[0xDCDE ^ 0xDCCB] = 0xDC85 ^ 0xDCCB;
        kotakbaz.rain.client.render.texture.gif.A.F[0xED1D ^ 0xEC9E] = 0xEC8A ^ 0xEC9E;
        kotakbaz.rain.client.render.texture.gif.A.F[0xCC94 ^ 0xCC07] = 0xFFFF2059 ^ 0xCC07;
        kotakbaz.rain.client.render.texture.gif.A.F[0x6D37 ^ 0x6C6A] = 0x6C68 ^ 0x6C6A;
        kotakbaz.rain.client.render.texture.gif.A.F[0xEF73 ^ 0xEF87] = 0x4B45 ^ 0xEF87;
        kotakbaz.rain.client.render.texture.gif.A.F[0xE895 ^ 0xE8AC] = 0xE88E ^ 0xE8AC;
        kotakbaz.rain.client.render.texture.gif.A.F[0x8C35 ^ 0x8CDD] = 0x18DC8 ^ 0x8CDD;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4A50 ^ 0x4BDA] = 0x8D72 ^ 0x4BDA;
        kotakbaz.rain.client.render.texture.gif.A.F[0xC78 ^ 0xD33] = 0xD32 ^ 0xD33;
        kotakbaz.rain.client.render.texture.gif.A.F[0x521E ^ 0x52D9] = 0x21EC ^ 0x52D9;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4E31 ^ 0x4E97] = 0xA958 ^ 0x4E97;
        kotakbaz.rain.client.render.texture.gif.A.F[0x4A91 ^ 0x4A12] = 0x5728 ^ 0x4A12;
        kotakbaz.rain.client.render.texture.gif.A.F[0xFA9F ^ 0xFA99] = 0xFA8E ^ 0xFA99;
    }
}

