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
import kotakbaz.rain.client.render.texture.gif.a_0;
import kotakbaz.rain.client.render.texture.gif.b;

public class B {
    private String a = null;
    private kotakbaz.rain.client.render.texture.loader.B A = null;
    private b b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    private B() {
    }

    public B name(String name) {
        this.a = name;
        return this;
    }

    public B loader(kotakbaz.rain.client.render.texture.loader.B loader) {
        this.A = loader;
        return this;
    }

    public B decompileMode(b decompileMode) {
        this.b = decompileMode;
        return this;
    }

    public a_0 build() {
        try {
            this.checkArguments();
            return a_0.of(this.a, this.A.load(this.b));
        }
        catch (Exception exception) {
            throw new UnsupportedOperationException(exception);
        }
    }

    private void checkArguments() {
        if (this.a == null) {
            int n2 = e[0];
            n2 ^= e[1];
            int n3 = e[3];
            n3 ^= e[4];
            throw new IllegalArgumentException((String)B[n2 += e[2]] + (String)B[n3 -= e[5]]);
        }
        if (this.A == null) {
            int n4 = e[6];
            n4 ^= e[7];
            n4 += e[8];
            int n5 = e[9];
            n5 += e[10];
            n5 += e[11];
            int n6 = e[12];
            n6 -= e[13];
            Object[] objectArray = new Object[n6 -= e[14]];
            int n7 = e[15];
            n7 -= e[16];
            objectArray[n7 -= kotakbaz.rain.client.render.texture.builder.B.e[17]] = this.a;
            throw new IllegalArgumentException(String.format((String)B[n4] + (String)B[n5], objectArray));
        }
        if (this.b == null) {
            int n8 = e[18];
            n8 += e[19];
            n8 -= e[20];
            int n9 = e[21];
            n9 += e[22];
            n9 ^= e[23];
            int n10 = e[24];
            n10 -= e[25];
            Object[] objectArray = new Object[n10 ^= e[26]];
            int n11 = e[27];
            n11 += e[28];
            objectArray[n11 -= kotakbaz.rain.client.render.texture.builder.B.e[29]] = this.a;
            throw new IllegalArgumentException(String.format((String)B[n8] + (String)B[n9], objectArray));
        }
    }

    public static B builder() {
        return new B();
    }

    static {
        kotakbaz.rain.client.render.texture.builder.B.b();
        long l2 = -1648124269951665865L;
        long l3 = 5375775568890312744L;
        long l4 = -1836271666670151473L;
        long l5 = 4642523750055540028L;
        long l6 = -5996060731465581703L;
        long l7 = 7746468769549001583L;
        long l8 = 7637951393108863054L;
        long l9 = -7277112325711305340L;
        long l10 = 9037142770448370307L;
        long l11 = -3764700908680462868L;
        long l12 = -1592926607646961702L;
        long l13 = 9175109487475807322L;
        long l14 = -5411931476893255077L;
        long l15 = -3944618401929658217L;
        int n2 = e[30];
        n2 ^= e[31];
        B = new Object[n2 += e[32]];
        long l16 = l15;
        int n3 = e[33];
        n3 ^= e[34];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= e[35]);
        Object[] objectArray = new Object[e[36]];
        objectArray[kotakbaz.rain.client.render.texture.builder.B.e[37]] = c;
        objectArray[kotakbaz.rain.client.render.texture.builder.B.e[38]] = e[39];
        int n4 = e[40];
        Object object = kotakbaz.rain.client.render.texture.builder.B.A()[e[41]];
        if (object == null) {
            char[] cArray = "\ua5c7\ua960\ua56d\ua5d6\ua5c7\ua59f\ua5cc\ua5c7\ua5db\ua57c\ua5dc\ua928\ua5a3\ua5ce\ua5ce\ua5cd\ua5de\ua584\ua575\ua5d8\ua5c7\ua583\ua5c8\ua580\ua929\ua56b\ua5e1\ua95f\ua56b\ua5a0\ua928\ua931\ua571\ua5cc\ua584\ua582\ua962\ua56b\ua586\ua56d\ua586\ua92a\ua5a3\ua92d\ua928\ua580\ua92d\ua5cc\ua5cc\ua92e\ua567\ua56e\ua583\ua57a\ua583\ua57f\ua92c\ua580\ua5c7\ua5e1\ua580\ua5c8\ua57c\ua5dc\ua57e\ua965\ua963\ua5cd\ua964\ua5d6\ua964\ua57f\ua5d5\ua577\ua585\ua929\ua5d8\ua56e\ua56e\ua92c\ua5d6\ua57c\ua5dc\ua963\ua929\ua966\ua95f\ua5d5\ua581\ua5a0\ua964\ua56c\ua5ce\ua5c7\ua960\ua5e1\ua585\ua5d8\ua5d7\ua580\ua583\ua57d\ua5a0\ua57d\ua5c8\ua57b\ua5e1\ua568\ua5de\ua57c\ua57c\ua5da\ua56b\ua936\ua57d\ua57a\ua578\ua575\ua568\ua5ca\ua578\ua5c9\ua5dc\ua575\ua5d5\ua5ce\ua583\ua5ce\ua57f\ua57a\ua5d8\ua578\ua580\ua964\ua5a3\ua5cd\ua5ce\ua5c7\ua5a3\ua92d\ua56c\ua5ce\ua585\ua5d5\ua960\ua577\ua57d\ua92e\ua568\ua963\ua57d\ua927\ua5c9\ua57b\ua56d\ua582\ua92d\ua5dd\ua5db\ua929\ua5cb\ua578\ua931\ua92c\ua5a5\ua586\ua5ce\ua5cd\ua5d5\ua5cc\ua963\ua579".toCharArray();
            for (int i2 = e[42]; i2 < e[43]; ++i2) {
                int n5 = cArray[i2];
                n5 -= e[44];
                n5 -= e[45];
                n5 ^= e[46];
                n5 ^= e[47];
                n5 += e[48];
                n5 += e[49];
                n5 -= e[50];
                n5 += e[51];
                n5 += e[52];
                n5 += e[53];
                n5 -= e[54];
                n5 ^= e[55];
                n5 += e[56];
                n5 += e[57];
                cArray[i2] = (char)(n5 ^= e[58]);
            }
            object = kotakbaz.rain.client.render.texture.builder.B.A()[kotakbaz.rain.client.render.texture.builder.B.e[59]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.texture.builder.B.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = e[60];
        n6 += e[61];
        l6 = l17 ^ (0x6B00000000L ^ l17) & -1L << (n6 += e[62]);
        long l18 = l13;
        int n7 = e[63];
        n7 += e[64];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= e[65]);
        while (true) {
            int n8 = e[66];
            n8 += e[67];
            if ((int)l13 >= (int)(l6 >>> (n8 += e[68]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = e[69];
            n10 -= e[70];
            int n11 = e[72];
            n11 += e[73];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= e[71])) & -1L >>> (n11 += e[74]);
            long l20 = l9;
            int n12 = e[75];
            n12 ^= e[76];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= e[77]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = e[78];
            n14 += e[79];
            int n15 = e[81];
            n15 -= e[82];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= e[80])) & -1L >>> (n15 -= e[83]);
            int n16 = e[84];
            n16 ^= e[85];
            long l22 = l10;
            int n17 = e[87];
            n17 ^= e[88];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= e[86]) ^ l22) & -1L << (n17 += e[89]);
            int n18 = e[90];
            n18 -= e[91];
            n18 -= e[92];
            int n19 = e[93];
            n19 += e[94];
            long l23 = l12;
            int n20 = e[96];
            n20 += e[97];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= e[95]))) ^ l23) & -1L >>> (n20 -= e[98]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = e[99];
            n21 -= e[100];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= e[101]);
            while (true) {
                int n22 = e[102];
                n22 -= e[103];
                if ((int)(l14 >>> (n22 -= e[104])) >= (int)l12) break;
                int n23 = e[105];
                n23 += e[106];
                int n24 = e[108];
                n24 += e[109];
                cArray2[(int)(l14 >>> (n23 += kotakbaz.rain.client.render.texture.builder.B.e[107]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= e[110]))];
                l14 += 0x100000000L;
            }
            int n25 = e[111];
            n25 += e[112];
            int n26 = (int)(l15 >>> (n25 ^= e[113]));
            l15 += 0x100000000L;
            kotakbaz.rain.client.render.texture.builder.B.B[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = e[114];
            n27 ^= e[115];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += e[116]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[e[117]];
        String string = (String)object[e[118]];
        object = object[e[119]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[120]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[121]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[123] ^ e[124]];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[125] ^ kotakbaz.rain.client.render.texture.builder.B.e[126]] = e[127] ^ e[128];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[129] ^ kotakbaz.rain.client.render.texture.builder.B.e[130]] = e[131] ^ e[132];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[133] ^ kotakbaz.rain.client.render.texture.builder.B.e[134]] = e[135] ^ e[136];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[137] ^ kotakbaz.rain.client.render.texture.builder.B.e[138]] = e[139] ^ e[140];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[141] ^ kotakbaz.rain.client.render.texture.builder.B.e[142]] = e[143] ^ e[144];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[145] ^ kotakbaz.rain.client.render.texture.builder.B.e[146]] = e[147] ^ e[148];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[149] ^ kotakbaz.rain.client.render.texture.builder.B.e[150]] = e[151] ^ e[152];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[153] ^ kotakbaz.rain.client.render.texture.builder.B.e[154]] = e[155] ^ e[156];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[157] ^ kotakbaz.rain.client.render.texture.builder.B.e[158]] = e[159] ^ e[160];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[161] ^ kotakbaz.rain.client.render.texture.builder.B.e[162]] = e[163] ^ e[164];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[165] ^ kotakbaz.rain.client.render.texture.builder.B.e[166]] = e[167] ^ e[168];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[169] ^ kotakbaz.rain.client.render.texture.builder.B.e[170]] = e[171] ^ e[172];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[173] ^ kotakbaz.rain.client.render.texture.builder.B.e[174]] = e[175] ^ e[176];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[177] ^ kotakbaz.rain.client.render.texture.builder.B.e[178]] = e[179] ^ e[180];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[181] ^ kotakbaz.rain.client.render.texture.builder.B.e[182]] = e[183] ^ e[184];
                byArray[kotakbaz.rain.client.render.texture.builder.B.e[185] ^ kotakbaz.rain.client.render.texture.builder.B.e[186]] = e[187] ^ e[188];
                objectArray2[kotakbaz.rain.client.render.texture.builder.B.e[122]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[189]];
            if (C == null) {
                byte[] byArray2 = new byte[e[190] ^ e[191]];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[192] ^ kotakbaz.rain.client.render.texture.builder.B.e[193]] = e[194] ^ e[195];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[196] ^ kotakbaz.rain.client.render.texture.builder.B.e[197]] = e[198] ^ e[199];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[200] ^ kotakbaz.rain.client.render.texture.builder.B.e[201]] = e[202] ^ e[203];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[204] ^ kotakbaz.rain.client.render.texture.builder.B.e[205]] = e[206] ^ e[207];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[208] ^ kotakbaz.rain.client.render.texture.builder.B.e[209]] = e[210] ^ e[211];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[212] ^ kotakbaz.rain.client.render.texture.builder.B.e[213]] = e[214] ^ e[215];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[216] ^ kotakbaz.rain.client.render.texture.builder.B.e[217]] = e[218] ^ e[219];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[220] ^ kotakbaz.rain.client.render.texture.builder.B.e[221]] = e[222] ^ e[223];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[224] ^ kotakbaz.rain.client.render.texture.builder.B.e[225]] = e[226] ^ e[227];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[228] ^ kotakbaz.rain.client.render.texture.builder.B.e[229]] = e[230] ^ e[231];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[232] ^ kotakbaz.rain.client.render.texture.builder.B.e[233]] = e[234] ^ e[235];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[236] ^ kotakbaz.rain.client.render.texture.builder.B.e[237]] = e[238] ^ e[239];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[240] ^ kotakbaz.rain.client.render.texture.builder.B.e[241]] = e[242] ^ e[243];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[244] ^ kotakbaz.rain.client.render.texture.builder.B.e[245]] = e[246] ^ e[247];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[248] ^ kotakbaz.rain.client.render.texture.builder.B.e[249]] = e[250] ^ e[251];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[252] ^ kotakbaz.rain.client.render.texture.builder.B.e[253]] = e[254] ^ e[255];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[256] ^ kotakbaz.rain.client.render.texture.builder.B.e[257]] = e[258] ^ e[259];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[260] ^ kotakbaz.rain.client.render.texture.builder.B.e[261]] = e[262] ^ e[263];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[264] ^ kotakbaz.rain.client.render.texture.builder.B.e[265]] = e[266] ^ e[267];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[268] ^ kotakbaz.rain.client.render.texture.builder.B.e[269]] = e[270] ^ e[271];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[272] ^ kotakbaz.rain.client.render.texture.builder.B.e[273]] = e[274] ^ e[275];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[276] ^ kotakbaz.rain.client.render.texture.builder.B.e[277]] = e[278] ^ e[279];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[280] ^ kotakbaz.rain.client.render.texture.builder.B.e[281]] = e[282] ^ e[283];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[284] ^ kotakbaz.rain.client.render.texture.builder.B.e[285]] = e[286] ^ e[287];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[288] ^ kotakbaz.rain.client.render.texture.builder.B.e[289]] = e[290] ^ e[291];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[292] ^ kotakbaz.rain.client.render.texture.builder.B.e[293]] = e[294] ^ e[295];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[296] ^ kotakbaz.rain.client.render.texture.builder.B.e[297]] = e[298] ^ e[299];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[300] ^ kotakbaz.rain.client.render.texture.builder.B.e[301]] = e[302] ^ e[303];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[304] ^ kotakbaz.rain.client.render.texture.builder.B.e[305]] = e[306] ^ e[307];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[308] ^ kotakbaz.rain.client.render.texture.builder.B.e[309]] = e[310] ^ e[311];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[312] ^ kotakbaz.rain.client.render.texture.builder.B.e[313]] = e[314] ^ e[315];
                byArray2[kotakbaz.rain.client.render.texture.builder.B.e[316] ^ kotakbaz.rain.client.render.texture.builder.B.e[317]] = e[318] ^ e[319];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, e[320], byArray3, e[321], byArray.length);
                System.arraycopy(byArray2, e[322], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.texture.builder.B.A()[e[323]];
                if (object4 == null) {
                    char[] cArray = "\u8c80\uf316\uf30b\uf314\uf30a\uf366\u8cb7\u8ca5\u8ca4\u8ca8\uf308\u8ca9\u8cad\u8cb3\uf303\uf308\uf30d\uf31d".toCharArray();
                    for (int i2 = e[324]; i2 < e[325]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= e[326];
                        n3 -= e[327];
                        n3 ^= e[328];
                        n3 -= e[329];
                        n3 -= e[330];
                        n3 -= e[331];
                        n3 += e[332];
                        n3 -= e[333];
                        n3 -= e[334];
                        n3 ^= e[335];
                        cArray[i2] = (char)(n3 += e[336]);
                    }
                    object4 = kotakbaz.rain.client.render.texture.builder.B.A()[kotakbaz.rain.client.render.texture.builder.B.e[337]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[e[338]];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[339]] = e[340];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[341]] = e[342];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[343]] = e[344];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[345]] = e[346];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[347]] = e[348];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[349]] = e[350];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[351]] = e[352];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[353]] = e[354];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[355]] = e[356];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[357]] = e[358];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[359]] = e[360];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[361]] = e[362];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[363]] = e[364];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[365]] = e[366];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[367]] = e[368];
                byArray4[kotakbaz.rain.client.render.texture.builder.B.e[369]] = e[370];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, e[371], e[372]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.texture.builder.B.A()[e[373]];
                if (object5 == null) {
                    char[] cArray = "\u1ee6\u1ee2\u1ed4".toCharArray();
                    for (int i3 = e[374]; i3 < e[375]; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= e[376];
                        n4 += e[377];
                        n4 += e[378];
                        n4 -= e[379];
                        n4 -= e[380];
                        n4 += e[381];
                        n4 += e[382];
                        n4 += e[383];
                        n4 -= e[384];
                        n4 -= e[385];
                        n4 += e[386];
                        n4 ^= e[387];
                        n4 ^= e[388];
                        cArray[i3] = (char)(n4 ^= e[389]);
                    }
                    object5 = kotakbaz.rain.client.render.texture.builder.B.A()[kotakbaz.rain.client.render.texture.builder.B.e[390]] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, e[391], e[392]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, e[393], byArray6.length);
            Object object6 = kotakbaz.rain.client.render.texture.builder.B.A()[e[394]];
            if (object6 == null) {
                char[] cArray = "\ud112\ud116\ud104\ud2a0\ud114\ud117\ud114\ud2a0\ud105\ud13c\ud114\ud104\ud2a6\ud105\ud2f2\ud2f9\ud2f9\ud2fa\ud2e3\ud2f8".toCharArray();
                for (int i4 = e[395]; i4 < e[396]; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= e[397];
                    n5 += e[398];
                    n5 ^= e[399];
                    n5 ^= 0xBF44;
                    n5 ^= 0x7586;
                    n5 += 28057;
                    n5 -= 43962;
                    n5 += 8636;
                    n5 += 27485;
                    cArray[i4] = (char)(n5 -= 52606);
                }
                object6 = kotakbaz.rain.client.render.texture.builder.B.A()[3] = new String(cArray);
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
        e = new int[0xBE2C ^ 0xBFBC];
        kotakbaz.rain.client.render.texture.builder.B.e[0x88F6 ^ 0x88BC] = 0x88A4 ^ 0x88BC;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD83C ^ 0xD838] = 0xD80C ^ 0xD838;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7516 ^ 0x7510] = 0x7534 ^ 0x7510;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6E3F ^ 0x6E31] = 0xFFFF91D4 ^ 0x6E31;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB28C ^ 0xB390] = 0x1B1D7 ^ 0xB390;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10CF3 ^ 0x10CAD] = 0x10CAB ^ 0x10CAD;
        kotakbaz.rain.client.render.texture.builder.B.e[0x85FD ^ 0x8512] = 0xF240 ^ 0x8512;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF67 ^ 0xE7C] = 0x12EB ^ 0xE7C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x64 ^ 0x139] = 0x130 ^ 0x139;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE485 ^ 0xE5DF] = 0xE5C5 ^ 0xE5DF;
        kotakbaz.rain.client.render.texture.builder.B.e[0xDC15 ^ 0xDCD7] = 0xFFFFF956 ^ 0xDCD7;
        kotakbaz.rain.client.render.texture.builder.B.e[0x76E1 ^ 0x7793] = 0x77F5 ^ 0x7793;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5490 ^ 0x5511] = 0x1921 ^ 0x5511;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1F1E ^ 0x1F29] = 0xAD13 ^ 0x1F29;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4F8A ^ 0x4F36] = 0xB1E6 ^ 0x4F36;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8163 ^ 0x8175] = 0xFFFF7EBD ^ 0x8175;
        kotakbaz.rain.client.render.texture.builder.B.e[0x686B ^ 0x68A3] = 0xEC09 ^ 0x68A3;
        kotakbaz.rain.client.render.texture.builder.B.e[0x989E ^ 0x98DE] = 0xFFFF6715 ^ 0x98DE;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3FA7 ^ 0x3F12] = 0xB395 ^ 0x3F12;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7463 ^ 0x7403] = 0x7439 ^ 0x7403;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB5FF ^ 0xB579] = 0xAA78 ^ 0xB579;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6F13 ^ 0x6F63] = 0x6F65 ^ 0x6F63;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9F97 ^ 0x9F88] = 0xFFFF607C ^ 0x9F88;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF7FC ^ 0xF782] = 0xCA06 ^ 0xF782;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2DB4 ^ 0x2D71] = 0xC37E ^ 0x2D71;
        kotakbaz.rain.client.render.texture.builder.B.e[0xEA1E ^ 0xEAA3] = 0xEAA3 ^ 0xEAA3;
        kotakbaz.rain.client.render.texture.builder.B.e[0xFABF ^ 0xFAF9] = 0xFFFF0567 ^ 0xFAF9;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1084E ^ 0x10864] = 0x10864 ^ 0x10864;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10971 ^ 0x10800] = 0x1080D ^ 0x10800;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE439 ^ 0xE4F2] = 0x605D ^ 0xE4F2;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8855 ^ 0x882D] = 0x882C ^ 0x882D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5195 ^ 0x5130] = 0xAFC9 ^ 0x5130;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5951 ^ 0x582D] = 0xE7C6 ^ 0x582D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3115 ^ 0x3134] = 0x311A ^ 0x3134;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10BF ^ 0x11C5] = 0xD042 ^ 0x11C5;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC3ED ^ 0xC33D] = 0x814 ^ 0xC33D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xBD8F ^ 0xBCB8] = 0x7B3B ^ 0xBCB8;
        kotakbaz.rain.client.render.texture.builder.B.e[0x226A ^ 0x2356] = 0xEAD4 ^ 0x2356;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC681 ^ 0xC6B2] = 0xA782 ^ 0xC6B2;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4EA0 ^ 0x4E32] = 0x2C9B ^ 0x4E32;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC6A3 ^ 0xC60F] = 0xD4F6 ^ 0xC60F;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF7CC ^ 0xF7F1] = 0xFFFF086D ^ 0xF7F1;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9447 ^ 0x94F8] = 0x4F00 ^ 0x94F8;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7483 ^ 0x74CE] = 0xFFFF8B7A ^ 0x74CE;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD10E ^ 0xD13A] = 0xBDA8 ^ 0xD13A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x866C ^ 0x8711] = 0x547D ^ 0x8711;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1EB2 ^ 0x1E6D] = 0x1CA6 ^ 0x1E6D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7A18 ^ 0x7B01] = 0x6796 ^ 0x7B01;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5973 ^ 0x5966] = 0x59F6 ^ 0x5966;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9289 ^ 0x923F] = 0x1EBD ^ 0x923F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4CB9 ^ 0x4D87] = 0x8405 ^ 0x4D87;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF3A2 ^ 0xF363] = 0x2969 ^ 0xF363;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9B2D ^ 0x9B37] = 0x9B6B ^ 0x9B37;
        kotakbaz.rain.client.render.texture.builder.B.e[0x13A9 ^ 0x13C3] = 0xFFFFEC18 ^ 0x13C3;
        kotakbaz.rain.client.render.texture.builder.B.e[0x335C ^ 0x33C7] = 0xFFFF578E ^ 0x33C7;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2758 ^ 0x2639] = 0x263F ^ 0x2639;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6070 ^ 0x6099] = 0xCEFA ^ 0x6099;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1013D ^ 0x1013F] = 0xFFFEFE9F ^ 0x1013F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7F44 ^ 0x7FFD] = 0x8127 ^ 0x7FFD;
        kotakbaz.rain.client.render.texture.builder.B.e[0x81C3 ^ 0x81AD] = 0xFFFF7E48 ^ 0x81AD;
        kotakbaz.rain.client.render.texture.builder.B.e[0xAED7 ^ 0xAFD3] = 0xE3EC ^ 0xAFD3;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4301 ^ 0x43BA] = 0xBD21 ^ 0x43BA;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4992 ^ 0x4939] = 0x5B8C ^ 0x4939;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8B65 ^ 0x8B6F] = 0x8B1C ^ 0x8B6F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9C48 ^ 0x9CF6] = 0x472E ^ 0x9CF6;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD426 ^ 0xD531] = 0xE434 ^ 0xD531;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6161 ^ 0x6158] = 0xE463 ^ 0x6158;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4109 ^ 0x41E4] = 0x36B6 ^ 0x41E4;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB8BD ^ 0xB8AF] = 0xB838 ^ 0xB8AF;
        kotakbaz.rain.client.render.texture.builder.B.e[0x281B ^ 0x2803] = 0xFFFFD7F2 ^ 0x2803;
        kotakbaz.rain.client.render.texture.builder.B.e[0xDD17 ^ 0xDC92] = 0xEB4B ^ 0xDC92;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB06A ^ 0xB179] = 0x69C ^ 0xB179;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB92F ^ 0xB95C] = 0xB924 ^ 0xB95C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x109D0 ^ 0x10964] = 0x1DBAE ^ 0x10964;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9D78 ^ 0x9C38] = 0x9C38 ^ 0x9C38;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF510 ^ 0xF442] = 0xF452 ^ 0xF442;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB583 ^ 0xB4DB] = 0xFFFF4B42 ^ 0xB4DB;
        kotakbaz.rain.client.render.texture.builder.B.e[0xEE18 ^ 0xEE4B] = 0xEE2F ^ 0xEE4B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x321 ^ 0x244] = 0x245 ^ 0x244;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3A0E ^ 0x3B68] = 0x3B73 ^ 0x3B68;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10115 ^ 0x1013A] = 0x1ABB1 ^ 0x1013A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x307A ^ 0x30D4] = 0x2D12 ^ 0x30D4;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6314 ^ 0x630A] = 0xFFFF9C7B ^ 0x630A;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD31E ^ 0xD257] = 0xED05 ^ 0xD257;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1EA9 ^ 0x1EE2] = 0x1EDE ^ 0x1EE2;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF2FE ^ 0xF2FE] = 0xF2FB ^ 0xF2FE;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA20F ^ 0xA384] = 0xA384 ^ 0xA384;
        kotakbaz.rain.client.render.texture.builder.B.e[0x842D ^ 0x845B] = 0x8459 ^ 0x845B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8707 ^ 0x8782] = 0x988E ^ 0x8782;
        kotakbaz.rain.client.render.texture.builder.B.e[0x11A6 ^ 0x11E5] = 0xFFFFEE3C ^ 0x11E5;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC206 ^ 0xC32F] = 0xF31C ^ 0xC32F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x25A6 ^ 0x24E7] = 0x24E7 ^ 0x24E7;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4DDD ^ 0x4CFF] = 0x63F9 ^ 0x4CFF;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF0B8 ^ 0xF197] = 0xD25A ^ 0xF197;
        kotakbaz.rain.client.render.texture.builder.B.e[0xFC4E ^ 0xFD18] = 0xFFFF02D2 ^ 0xFD18;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF2D8 ^ 0xF3AC] = 0xF2AC ^ 0xF3AC;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD365 ^ 0xD311] = 0xFFFF2CF5 ^ 0xD311;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF607 ^ 0xF726] = 0xD86B ^ 0xF726;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3CB2 ^ 0x3DDC] = 0x3DD1 ^ 0x3DDC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x82C7 ^ 0x828E] = 0xFFFF7D44 ^ 0x828E;
        kotakbaz.rain.client.render.texture.builder.B.e[0x33D7 ^ 0x33CA] = 0x33F7 ^ 0x33CA;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB5B7 ^ 0xB5EF] = 0xB5D7 ^ 0xB5EF;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3DB9 ^ 0x3D24] = 0x799D ^ 0x3D24;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6C89 ^ 0x6DA9] = 0x42EF ^ 0x6DA9;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7A4C ^ 0x7AE8] = 0xE5F6 ^ 0x7AE8;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7490 ^ 0x75E6] = 0x75E6 ^ 0x75E6;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4CEE ^ 0x4C86] = 0x4CD1 ^ 0x4C86;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3756 ^ 0x3731] = 0x3754 ^ 0x3731;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10C49 ^ 0x10D2B] = 0xFFFEF2EC ^ 0x10D2B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4E5F ^ 0x4F0A] = 0x4F05 ^ 0x4F0A;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCD2 ^ 0xC90] = 0xFFFFF34E ^ 0xC90;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7863 ^ 0x78EC] = 0xFFFFD0EA ^ 0x78EC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1372 ^ 0x1305] = 0x1305 ^ 0x1305;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10313 ^ 0x103DF] = 0x17205 ^ 0x103DF;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3DCC ^ 0x3CC5] = 0x7032 ^ 0x3CC5;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7754 ^ 0x77A7] = 0x1E4A ^ 0x77A7;
        kotakbaz.rain.client.render.texture.builder.B.e[0x19D0 ^ 0x19BF] = 0xFFFFE630 ^ 0x19BF;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE847 ^ 0xE909] = 0x10B1 ^ 0xE909;
        kotakbaz.rain.client.render.texture.builder.B.e[0xBA04 ^ 0xBAFF] = 0xA292 ^ 0xBAFF;
        kotakbaz.rain.client.render.texture.builder.B.e[0xAE5D ^ 0xAEAD] = 0xC74E ^ 0xAEAD;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC193 ^ 0xC01F] = 0xC00B ^ 0xC01F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4E07 ^ 0x4E5A] = 0xFFFFB1B1 ^ 0x4E5A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10100 ^ 0x1006D] = 0x10066 ^ 0x1006D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC77E ^ 0xC7A7] = 0x69E7 ^ 0xC7A7;
        kotakbaz.rain.client.render.texture.builder.B.e[0x39D5 ^ 0x38C3] = 0x9AB ^ 0x38C3;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD16D ^ 0xD029] = 0xD029 ^ 0xD029;
        kotakbaz.rain.client.render.texture.builder.B.e[0x60E6 ^ 0x6066] = 0x5DE2 ^ 0x6066;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB35F ^ 0xB22A] = 0xB228 ^ 0xB22A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2B5D ^ 0x2B79] = 0x2B7A ^ 0x2B79;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4521 ^ 0x45DF] = 0xFFFFEDB7 ^ 0x45DF;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD796 ^ 0xD7FA] = 0xFFFF2805 ^ 0xD7FA;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC6CF ^ 0xC693] = 0xC68E ^ 0xC693;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5DC9 ^ 0x5D92] = 0xFFFFA234 ^ 0x5D92;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC8BB ^ 0xC9D3] = 0xFFFF3635 ^ 0xC9D3;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3FAF ^ 0x3F6F] = 0xE57B ^ 0x3F6F;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB19E ^ 0xB0C7] = 0xB0C0 ^ 0xB0C7;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5E2F ^ 0x5F4C] = 0x5F4F ^ 0x5F4C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x28B6 ^ 0x29FA] = 0xB53C ^ 0x29FA;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8492 ^ 0x8423] = 0x56E5 ^ 0x8423;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA5FB ^ 0xA536] = 0xD4FE ^ 0xA536;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD3D7 ^ 0xD304] = 0x183E ^ 0xD304;
        kotakbaz.rain.client.render.texture.builder.B.e[0x27B9 ^ 0x272E] = 0xFFFF309D ^ 0x272E;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6CBF ^ 0x6DB5] = 0x217E ^ 0x6DB5;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7B82 ^ 0x7B25] = 0xFFFF7A05 ^ 0x7B25;
        kotakbaz.rain.client.render.texture.builder.B.e[0xECDC ^ 0xED93] = 0x6268 ^ 0xED93;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3F8B ^ 0x3F2D] = 0xC1DB ^ 0x3F2D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF987 ^ 0xF919] = 0xBDA2 ^ 0xF919;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5301 ^ 0x521F] = 0x1502E ^ 0x521F;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCD1E ^ 0xCC11] = 0xB23 ^ 0xCC11;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1995 ^ 0x18C2] = 0x18CE ^ 0x18C2;
        kotakbaz.rain.client.render.texture.builder.B.e[0x62D8 ^ 0x6350] = 0x6340 ^ 0x6350;
        kotakbaz.rain.client.render.texture.builder.B.e[0x235B ^ 0x2304] = 0xFFFFDCD5 ^ 0x2304;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD3B1 ^ 0xD2ED] = 0xFFFF2D1B ^ 0xD2ED;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8169 ^ 0x802F] = 0xB38F ^ 0x802F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9F69 ^ 0x9E45] = 0xBD8C ^ 0x9E45;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF32B ^ 0xF25B] = 0xF21A ^ 0xF25B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x78E6 ^ 0x78C5] = 0x78EA ^ 0x78C5;
        kotakbaz.rain.client.render.texture.builder.B.e[0x70E6 ^ 0x7037] = 0xBB0D ^ 0x7037;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCCC9 ^ 0xCC45] = 0x2034 ^ 0xCC45;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD638 ^ 0xD651] = 0xD641 ^ 0xD651;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5C07 ^ 0x5C48] = 0xFFFFA381 ^ 0x5C48;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF718 ^ 0xF62B] = 0x4D9D ^ 0xF62B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x104C8 ^ 0x104BD] = 0x104BC ^ 0x104BD;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1DFF ^ 0x1D9A] = 0x1DB2 ^ 0x1D9A;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD7 ^ 0x1A8] = 0xC4E4 ^ 0x1A8;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB035 ^ 0xB16E] = 0xB16E ^ 0xB16E;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6CFE ^ 0x6C75] = 0xFFFF7FA5 ^ 0x6C75;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1075B ^ 0x1077C] = 0x1077C ^ 0x1077C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6EB9 ^ 0x6FEA] = 0x6FEE ^ 0x6FEA;
        kotakbaz.rain.client.render.texture.builder.B.e[0x236B ^ 0x239F] = 0x9923 ^ 0x239F;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCD45 ^ 0xCD6E] = 0xCDC2 ^ 0xCD6E;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD9D4 ^ 0xD90A] = 0xDBB1 ^ 0xD90A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x467C ^ 0x4697] = 0xE8F4 ^ 0x4697;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4E76 ^ 0x4F66] = 0xF885 ^ 0x4F66;
        kotakbaz.rain.client.render.texture.builder.B.e[0x69CD ^ 0x696C] = 0xF673 ^ 0x696C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3DEC ^ 0x3D75] = 0xA681 ^ 0x3D75;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6B7D ^ 0x6B93] = 0x1C81 ^ 0x6B93;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3831 ^ 0x390C] = 0xF09F ^ 0x390C;
        kotakbaz.rain.client.render.texture.builder.B.e[0xAB3D ^ 0xAB2D] = 0xAB3E ^ 0xAB2D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x71D7 ^ 0x7133] = 0x49E0 ^ 0x7133;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5C4B ^ 0x5D4C] = 0x1179 ^ 0x5D4C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x27D8 ^ 0x26BC] = 0x26FB ^ 0x26BC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2537 ^ 0x2523] = 0x2570 ^ 0x2523;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4921 ^ 0x49F3] = 0xFFFF7D59 ^ 0x49F3;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC3D0 ^ 0xC29B] = 0x197D ^ 0xC29B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x613E ^ 0x61BD] = 0xFFFF73A6 ^ 0x61BD;
        kotakbaz.rain.client.render.texture.builder.B.e[0x931A ^ 0x932B] = 0x89A5 ^ 0x932B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5D02 ^ 0x5D7E] = 0xD2C7 ^ 0x5D7E;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4706 ^ 0x4606] = 0x2461 ^ 0x4606;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE9FF ^ 0xE929] = 0x881A ^ 0xE929;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5AA ^ 0x5D7] = 0x3853 ^ 0x5D7;
        kotakbaz.rain.client.render.texture.builder.B.e[0x15AC ^ 0x153F] = 0xFFFF8801 ^ 0x153F;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD5CE ^ 0xD4A4] = 0xD4C5 ^ 0xD4A4;
        kotakbaz.rain.client.render.texture.builder.B.e[0x40E9 ^ 0x40A5] = 0xFFFFBF0D ^ 0x40A5;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA000 ^ 0xA16F] = 0xA167 ^ 0xA16F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x35E5 ^ 0x3547] = 0xAA59 ^ 0x3547;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2C8B ^ 0x2C92] = 0xFFFFD306 ^ 0x2C92;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA1F4 ^ 0xA1A0] = 0xFFFF5E05 ^ 0xA1A0;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB3C9 ^ 0xB3DA] = 0xFFFF4C67 ^ 0xB3DA;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10BEF ^ 0x10ACB] = 0x17273 ^ 0x10ACB;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10C0E ^ 0x10D5E] = 0x18560 ^ 0x10D5E;
        kotakbaz.rain.client.render.texture.builder.B.e[0x723A ^ 0x72AE] = 0x1007 ^ 0x72AE;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF71C ^ 0xF643] = 0xF64D ^ 0xF643;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6D1D ^ 0x6C18] = 0x202D ^ 0x6C18;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4A4D ^ 0x4A75] = 0x84AE ^ 0x4A75;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB30A ^ 0xB350] = 0xFFFF4C83 ^ 0xB350;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3BBE ^ 0x3B81] = 0x3B4B ^ 0x3B81;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8A6B ^ 0x8AE6] = 0xDD1A ^ 0x8AE6;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6F58 ^ 0x6EDE] = 0x6EDC ^ 0x6EDE;
        kotakbaz.rain.client.render.texture.builder.B.e[0x47C0 ^ 0x4649] = 0x4659 ^ 0x4649;
        kotakbaz.rain.client.render.texture.builder.B.e[0xBA40 ^ 0xBAB8] = 0xA2CF ^ 0xBAB8;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCD32 ^ 0xCC08] = 0x6F0E ^ 0xCC08;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6DB2 ^ 0x6C3D] = 0x4AE ^ 0x6C3D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xAEA5 ^ 0xAE59] = 0xF98C ^ 0xAE59;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD773 ^ 0xD6FE] = 0x221F ^ 0xD6FE;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4636 ^ 0x46C9] = 0x110B ^ 0x46C9;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2BF ^ 0x283] = 0x2D6 ^ 0x283;
        kotakbaz.rain.client.render.texture.builder.B.e[0x10DDE ^ 0x10DDB] = 0x10DC3 ^ 0x10DDB;
        kotakbaz.rain.client.render.texture.builder.B.e[0x85D8 ^ 0x84F3] = 0xB4C0 ^ 0x84F3;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4F8B ^ 0x4EA1] = 0xFFFF813C ^ 0x4EA1;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7944 ^ 0x793D] = 0x793C ^ 0x793D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1D90 ^ 0x1D06] = 0xF55A ^ 0x1D06;
        kotakbaz.rain.client.render.texture.builder.B.e[0x428 ^ 0x479] = 0x4CF ^ 0x479;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8F1 ^ 0x82A] = 0xA66A ^ 0x82A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x67A0 ^ 0x66BD] = 0x164E1 ^ 0x66BD;
        kotakbaz.rain.client.render.texture.builder.B.e[0x474A ^ 0x4784] = 0x3630 ^ 0x4784;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7C39 ^ 0x7D71] = 0x91B0 ^ 0x7D71;
        kotakbaz.rain.client.render.texture.builder.B.e[0xAEE6 ^ 0xAE55] = 0xFFFF834E ^ 0xAE55;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7BE ^ 0x7EE] = 0x7C7 ^ 0x7EE;
        kotakbaz.rain.client.render.texture.builder.B.e[0x885A ^ 0x88D4] = 0xDF20 ^ 0x88D4;
        kotakbaz.rain.client.render.texture.builder.B.e[0xAF6 ^ 0xA32] = 0xE420 ^ 0xA32;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7EAD ^ 0x7FA0] = 0xB892 ^ 0x7FA0;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3739 ^ 0x360F] = 0xFFFF0E0D ^ 0x360F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4D00 ^ 0x4C26] = 0xFFFFCB47 ^ 0x4C26;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9C1F ^ 0x9C1C] = 0x9C33 ^ 0x9C1C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x99CB ^ 0x99C2] = 0xFFFF66DB ^ 0x99C2;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1012A ^ 0x10162] = 0x1015C ^ 0x10162;
        kotakbaz.rain.client.render.texture.builder.B.e[0x637B ^ 0x624A] = 0xD9FC ^ 0x624A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2681 ^ 0x2686] = 0xFFFFD93E ^ 0x2686;
        kotakbaz.rain.client.render.texture.builder.B.e[0x63B4 ^ 0x623A] = 0xD499 ^ 0x623A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x902F ^ 0x90C3] = 0xE79D ^ 0x90C3;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC294 ^ 0xC2C1] = 0xC295 ^ 0xC2C1;
        kotakbaz.rain.client.render.texture.builder.B.e[0x332 ^ 0x2B1] = 0xD626 ^ 0x2B1;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1169 ^ 0x11B3] = 0xBF9C ^ 0x11B3;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9186 ^ 0x91E2] = 0xFFFF6E4D ^ 0x91E2;
        kotakbaz.rain.client.render.texture.builder.B.e[0x35D0 ^ 0x351A] = 0xFFFF4E10 ^ 0x351A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x382B ^ 0x3823] = 0x384B ^ 0x3823;
        kotakbaz.rain.client.render.texture.builder.B.e[0x631 ^ 0x72B] = 0xFFFFE454 ^ 0x72B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3996 ^ 0x39E9] = 0x423 ^ 0x39E9;
        kotakbaz.rain.client.render.texture.builder.B.e[0x366 ^ 0x327] = 0x352 ^ 0x327;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF8C7 ^ 0xF94D] = 0xF94E ^ 0xF94D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA163 ^ 0xA1A5] = 0xFFFFB052 ^ 0xA1A5;
        kotakbaz.rain.client.render.texture.builder.B.e[0x35A5 ^ 0x35A4] = 0x35C4 ^ 0x35A4;
        kotakbaz.rain.client.render.texture.builder.B.e[0x20BA ^ 0x208F] = 0xB77D ^ 0x208F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5EA0 ^ 0x5E4A] = 0xF038 ^ 0x5E4A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x329 ^ 0x25A] = 0x253 ^ 0x25A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5A2D ^ 0x5B38] = 0x6A3D ^ 0x5B38;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB5CF ^ 0xB4CD] = 0xD6B2 ^ 0xB4CD;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5169 ^ 0x501E] = 0x501D ^ 0x501E;
        kotakbaz.rain.client.render.texture.builder.B.e[0xFD30 ^ 0xFDA1] = 0x9F0C ^ 0xFDA1;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7A8F ^ 0x7A26] = 0x68D6 ^ 0x7A26;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1FEB ^ 0x1FCD] = 0x1FCC ^ 0x1FCD;
        kotakbaz.rain.client.render.texture.builder.B.e[0x94E5 ^ 0x95BB] = 0x95F1 ^ 0x95BB;
        kotakbaz.rain.client.render.texture.builder.B.e[0xFCFD ^ 0xFC20] = 0xFEEB ^ 0xFC20;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF7A9 ^ 0xF739] = 0xA0CD ^ 0xF739;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9B4D ^ 0x9A6A] = 0xE2DB ^ 0x9A6A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x42D3 ^ 0x43AB] = 0x62CE ^ 0x43AB;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD7FF ^ 0xD7E8] = 0xD7B0 ^ 0xD7E8;
        kotakbaz.rain.client.render.texture.builder.B.e[0x95A9 ^ 0x9560] = 0x11CF ^ 0x9560;
        kotakbaz.rain.client.render.texture.builder.B.e[0x37A9 ^ 0x370A] = 0xFFFF57F6 ^ 0x370A;
        kotakbaz.rain.client.render.texture.builder.B.e[0xEF0D ^ 0xEF37] = 0x1D49 ^ 0xEF37;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3089 ^ 0x3015] = 0xABE7 ^ 0x3015;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3EBC ^ 0x3FA4] = 0x2332 ^ 0x3FA4;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB98B ^ 0xB96D] = 0xFFFF7E22 ^ 0xB96D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC78D ^ 0xC70A] = 0xFFFF27DE ^ 0xC70A;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE8C6 ^ 0xE84C] = 0x43D ^ 0xE84C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8321 ^ 0x821E] = 0x4B8D ^ 0x821E;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1094D ^ 0x1092F] = 0x10937 ^ 0x1092F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1580 ^ 0x1561] = 0x1229 ^ 0x1561;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB669 ^ 0xB652] = 0xB652 ^ 0xB652;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCAD3 ^ 0xCBBA] = 0xCBBF ^ 0xCBBA;
        kotakbaz.rain.client.render.texture.builder.B.e[0x42FA ^ 0x4272] = 0x5D73 ^ 0x4272;
        kotakbaz.rain.client.render.texture.builder.B.e[0x74ED ^ 0x74FC] = 0xFFFF8B76 ^ 0x74FC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x199A ^ 0x19E0] = 0x19E0 ^ 0x19E0;
        kotakbaz.rain.client.render.texture.builder.B.e[0x104E9 ^ 0x105EA] = 0x16792 ^ 0x105EA;
        kotakbaz.rain.client.render.texture.builder.B.e[0x768A ^ 0x76BC] = 0x570B ^ 0x76BC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8719 ^ 0x878C] = 0x6FD3 ^ 0x878C;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC81B ^ 0xC91D] = 0xFFFF7A84 ^ 0xC91D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD156 ^ 0xD1D2] = 0x3C5C ^ 0xD1D2;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4308 ^ 0x4273] = 0xFF9B ^ 0x4273;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9057 ^ 0x9065] = 0x672A ^ 0x9065;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2727 ^ 0x2647] = 0x266C ^ 0x2647;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3D0C ^ 0x3DA3] = 0xFFFFDF99 ^ 0x3DA3;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD894 ^ 0xD9C0] = 0xFFFF264B ^ 0xD9C0;
        kotakbaz.rain.client.render.texture.builder.B.e[0x14F1 ^ 0x159A] = 0x1598 ^ 0x159A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x66B9 ^ 0x669C] = 0x669C ^ 0x669C;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB63F ^ 0xB659] = 0xB685 ^ 0xB659;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCB2C ^ 0xCB12] = 0xCB3D ^ 0xCB12;
        kotakbaz.rain.client.render.texture.builder.B.e[0xDEB6 ^ 0xDE61] = 0xBF53 ^ 0xDE61;
        kotakbaz.rain.client.render.texture.builder.B.e[0xBA01 ^ 0xBAE9] = 0x1487 ^ 0xBAE9;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9D99 ^ 0x9DEB] = 0x9DAF ^ 0x9DEB;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF017 ^ 0xF122] = 0x36A1 ^ 0xF122;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE8D ^ 0xEFC] = 0xFFFFF149 ^ 0xEFC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x92E ^ 0x81A] = 0xCF99 ^ 0x81A;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE680 ^ 0xE677] = 0x5CC3 ^ 0xE677;
        kotakbaz.rain.client.render.texture.builder.B.e[0x59C9 ^ 0x58A5] = 0xFFFFA719 ^ 0x58A5;
        kotakbaz.rain.client.render.texture.builder.B.e[0x496E ^ 0x49B2] = 0x4B76 ^ 0x49B2;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8187 ^ 0x80D6] = 0x80D7 ^ 0x80D6;
        kotakbaz.rain.client.render.texture.builder.B.e[0x70F7 ^ 0x70FB] = 0xFFFF8F74 ^ 0x70FB;
        kotakbaz.rain.client.render.texture.builder.B.e[0x744E ^ 0x756D] = 0x5A20 ^ 0x756D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5D1D ^ 0x5D33] = 0x779A ^ 0x5D33;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1A7E ^ 0x1A9D] = 0x1DD5 ^ 0x1A9D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xEE72 ^ 0xEF6D] = 0x1ED31 ^ 0xEF6D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8F9C ^ 0x8FE7] = 0x4E ^ 0x8FE7;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB00C ^ 0xB141] = 0x94A6 ^ 0xB141;
        kotakbaz.rain.client.render.texture.builder.B.e[0x5950 ^ 0x5988] = 0xF7D8 ^ 0x5988;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4585 ^ 0x45D3] = 0xFFFFBA02 ^ 0x45D3;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1DFF ^ 0x1D60] = 0xFFFFA652 ^ 0x1D60;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7D98 ^ 0x7D35] = 0x60F4 ^ 0x7D35;
        kotakbaz.rain.client.render.texture.builder.B.e[0x54BC ^ 0x547F] = 0x8E75 ^ 0x547F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6DE ^ 0x7CC] = 0xFFFF4FE3 ^ 0x7CC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x94D0 ^ 0x9554] = 0xB9EC ^ 0x9554;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCC1C ^ 0xCD32] = 0xEEBD ^ 0xCD32;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA989 ^ 0xA921] = 0x57D7 ^ 0xA921;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7462 ^ 0x74D2] = 0x6914 ^ 0x74D2;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA41E ^ 0xA510] = 0x620D ^ 0xA510;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1F4D ^ 0x1ECF] = 0x303A ^ 0x1ECF;
        kotakbaz.rain.client.render.texture.builder.B.e[0xDB87 ^ 0xDB7E] = 0xC313 ^ 0xDB7E;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB2ED ^ 0xB36D] = 0xA80 ^ 0xB36D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x315 ^ 0x39C] = 0xEFE3 ^ 0x39C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x25FB ^ 0x251E] = 0x1DD1 ^ 0x251E;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3766 ^ 0x3643] = 0x4EF2 ^ 0x3643;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9882 ^ 0x98CC] = 0x98AD ^ 0x98CC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x278B ^ 0x2687] = 0xE1AD ^ 0x2687;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9B96 ^ 0x9B63] = 0x21D7 ^ 0x9B63;
        kotakbaz.rain.client.render.texture.builder.B.e[0xFA72 ^ 0xFB42] = 0x40F6 ^ 0xFB42;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2440 ^ 0x2421] = 0xFFFFDBDF ^ 0x2421;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA529 ^ 0xA5A8] = 0x482D ^ 0xA5A8;
        kotakbaz.rain.client.render.texture.builder.B.e[0xA0D0 ^ 0xA032] = 0xA70E ^ 0xA032;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6B84 ^ 0x6B9F] = 0x6B16 ^ 0x6B9F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x238F ^ 0x2338] = 0xFFFF503B ^ 0x2338;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6AF0 ^ 0x6B89] = 0xFF0F ^ 0x6B89;
        kotakbaz.rain.client.render.texture.builder.B.e[0x531B ^ 0x5336] = 0xF33 ^ 0x5336;
        kotakbaz.rain.client.render.texture.builder.B.e[0x3B59 ^ 0x3B34] = 0xFFFFC4F2 ^ 0x3B34;
        kotakbaz.rain.client.render.texture.builder.B.e[0x15E ^ 0x1A4] = 0xFFFFE618 ^ 0x1A4;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4A2C ^ 0x4ADA] = 0xF02A ^ 0x4ADA;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7FC0 ^ 0x7E47] = 0x7E47 ^ 0x7E47;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD9CD ^ 0xD888] = 0xD89A ^ 0xD888;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE58F ^ 0xE584] = 0xE5F2 ^ 0xE584;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9E41 ^ 0x9F73] = 0x24E3 ^ 0x9F73;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9DDC ^ 0x9DEC] = 0xB147 ^ 0x9DEC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x106A ^ 0x108D] = 0x2842 ^ 0x108D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9C3E ^ 0x9C69] = 0x9CCC ^ 0x9C69;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC7F ^ 0xCE7] = 0xE4BB ^ 0xCE7;
        kotakbaz.rain.client.render.texture.builder.B.e[0x801F ^ 0x8132] = 0xA2FF ^ 0x8132;
        kotakbaz.rain.client.render.texture.builder.B.e[0x226 ^ 0x36C] = 0xB068 ^ 0x36C;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4B16 ^ 0x4B0A] = 0xFFFFB4BE ^ 0x4B0A;
        kotakbaz.rain.client.render.texture.builder.B.e[0x34F ^ 0x39A] = 0x62A8 ^ 0x39A;
        kotakbaz.rain.client.render.texture.builder.B.e[0xB2E5 ^ 0xB286] = 0xFFFF4D31 ^ 0xB286;
        kotakbaz.rain.client.render.texture.builder.B.e[0xEBE7 ^ 0xEAEC] = 0xA61B ^ 0xEAEC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1AFB ^ 0x1BC3] = 0xB8C8 ^ 0x1BC3;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC7FA ^ 0xC708] = 0xAE83 ^ 0xC708;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7A9D ^ 0x7B95] = 0x377B ^ 0x7B95;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF691 ^ 0xF66C] = 0xA1AE ^ 0xF66C;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE514 ^ 0xE53D] = 0xE53D ^ 0xE53D;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9FBD ^ 0x9F9D] = 0xFFFF601C ^ 0x9F9D;
        kotakbaz.rain.client.render.texture.builder.B.e[0xBA8C ^ 0xBBB5] = 0x18A8 ^ 0xBBB5;
        kotakbaz.rain.client.render.texture.builder.B.e[0x4B4C ^ 0x4BCE] = 0xA640 ^ 0x4BCE;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF8DD ^ 0xF9C9] = 0xC8CB ^ 0xF9C9;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCA1F ^ 0xCB37] = 0xFB11 ^ 0xCB37;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2D92 ^ 0x2CD0] = 0x2CD0 ^ 0x2CD0;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2413 ^ 0x2574] = 0x257E ^ 0x2574;
        kotakbaz.rain.client.render.texture.builder.B.e[0x99A0 ^ 0x98E3] = 0x98E2 ^ 0x98E3;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7684 ^ 0x763E] = 0x88EE ^ 0x763E;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9695 ^ 0x96CC] = 0xFFFF694F ^ 0x96CC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x12FE ^ 0x1264] = 0x8996 ^ 0x1264;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD863 ^ 0xD84B] = 0xD849 ^ 0xD84B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6D42 ^ 0x6DE8] = 0x7F11 ^ 0x6DE8;
        kotakbaz.rain.client.render.texture.builder.B.e[0x2FDD ^ 0x2F09] = 0x4E38 ^ 0x2F09;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7E2C ^ 0x7F17] = 0xDC0A ^ 0x7F17;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCF65 ^ 0xCE1B] = 0xF677 ^ 0xCE1B;
        kotakbaz.rain.client.render.texture.builder.B.e[0x9ED1 ^ 0x9EFD] = 0xAF9F ^ 0x9EFD;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC85F ^ 0xC8ED] = 0x1A27 ^ 0xC8ED;
        kotakbaz.rain.client.render.texture.builder.B.e[0xE44 ^ 0xE03] = 0xFFFFF1E9 ^ 0xE03;
        kotakbaz.rain.client.render.texture.builder.B.e[0xAF3 ^ 0xA02] = 0x63EF ^ 0xA02;
        kotakbaz.rain.client.render.texture.builder.B.e[0xFCAC ^ 0xFCFE] = 0xFCCC ^ 0xFCFE;
        kotakbaz.rain.client.render.texture.builder.B.e[0x7F1A ^ 0x7FBA] = 0x3B01 ^ 0x7FBA;
        kotakbaz.rain.client.render.texture.builder.B.e[0x6704 ^ 0x676F] = 0x675A ^ 0x676F;
        kotakbaz.rain.client.render.texture.builder.B.e[0x8D27 ^ 0x8D9F] = 0x11D ^ 0x8D9F;
        kotakbaz.rain.client.render.texture.builder.B.e[0xC6D9 ^ 0xC6D6] = 0xFFFF394B ^ 0xC6D6;
        kotakbaz.rain.client.render.texture.builder.B.e[0xCBE0 ^ 0xCAE1] = 0xA899 ^ 0xCAE1;
        kotakbaz.rain.client.render.texture.builder.B.e[0xBB51 ^ 0xBB5C] = 0xFFFF44F5 ^ 0xBB5C;
        kotakbaz.rain.client.render.texture.builder.B.e[0xF4C ^ 0xFAC] = 0x8F0 ^ 0xFAC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x104E2 ^ 0x105A5] = 0x11F44 ^ 0x105A5;
        kotakbaz.rain.client.render.texture.builder.B.e[0x1B53 ^ 0x1B16] = 0xFFFFE49F ^ 0x1B16;
        kotakbaz.rain.client.render.texture.builder.B.e[0xD601 ^ 0xD710] = 0x60F5 ^ 0xD710;
        kotakbaz.rain.client.render.texture.builder.B.e[0xBA23 ^ 0xBAEC] = 0xCB24 ^ 0xBAEC;
        kotakbaz.rain.client.render.texture.builder.B.e[0xBFB0 ^ 0xBF92] = 0xBFF3 ^ 0xBF92;
        kotakbaz.rain.client.render.texture.builder.B.e[0x45A8 ^ 0x45EC] = 0x4585 ^ 0x45EC;
        kotakbaz.rain.client.render.texture.builder.B.e[0x26AB ^ 0x266C] = 0xC863 ^ 0x266C;
    }
}

