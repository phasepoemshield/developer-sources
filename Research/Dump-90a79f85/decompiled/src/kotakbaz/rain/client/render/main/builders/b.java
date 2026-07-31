/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.builders;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.main.b_0;
import kotakbaz.rain.client.render.main.exceptions.A;
import kotakbaz.rain.client.render.main.exceptions.impl.C;
import kotakbaz.rain.client.render.main.exceptions.impl.c_0;
import kotakbaz.rain.client.render.main.program.shader.a_0;

public class b<T> {
    private String a;
    private final HashMap<a_0, kotakbaz.rain.client.render.main.compile.a_0> A;
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> b;
    private final kotakbaz.rain.client.render.main.program.a_0[] B;
    private final b_0<T> c;
    private static Object[] C;
    private static Object D;
    private static Object[] e;
    private static Object[] d;
    private static Object[] E;
    public static int[] f;

    public b(b_0<T> b_02, kotakbaz.rain.client.render.main.program.a_0 ... a_0Array) {
        long l = 5926945475603852244L;
        long l2 = 6360459769746039842L;
        long l3 = -4084182837564291487L;
        super();
        this.A = new HashMap();
        this.b = new HashMap();
        kotakbaz.rain.client.render.main.program.a_0[] a_0Array2 = a_0Array;
        long l4 = l2;
        int n = f[0];
        n ^= f[1];
        l2 = l4 ^ ((long)a_0Array2.length ^ l4) & -1L >>> (n -= f[2]);
        long l5 = l3;
        int n2 = f[3];
        n2 -= f[4];
        l3 = l5 ^ (0L ^ l5) & -1L << (n2 ^= f[5]);
        while (true) {
            int n3 = f[6];
            n3 ^= f[7];
            if ((int)(l3 >>> (n3 ^= f[8])) >= (int)l2) break;
            int n4 = f[9];
            n4 ^= f[10];
            kotakbaz.rain.client.render.main.program.a_0 a_02 = a_0Array2[(int)(l3 >>> (n4 ^= f[11]))];
            a_02.applyTo(this);
            l3 += 0x100000000L;
        }
        this.c = b_02;
        this.B = a_0Array;
    }

    public b<T> name(String string) {
        this.a = string;
        return this;
    }

    public b<T> shader(String string, T t2, a_0 a_02) {
        if (this.A.containsKey((Object)a_02)) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.a_0(string, a_02, this.A.get((Object)a_02).name()));
        }
        this.A.put(a_02, this.c.createGlslFileEntry(string, t2));
        return this;
    }

    public b<T> shader(kotakbaz.rain.client.render.main.compile.a_0 a_02, a_0 a_03) {
        if (this.A.containsKey((Object)a_03)) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new kotakbaz.rain.client.render.main.exceptions.impl.a_0(a_02.name(), a_03, this.A.get((Object)a_03).name()));
        }
        this.A.put(a_03, a_02);
        return this;
    }

    public <S extends kotakbaz.rain.client.render.main.program.uniform.A> b<T> uniform(String string, kotakbaz.rain.client.render.main.program.uniform.a_0<S> a_02) {
        if (this.b.containsKey(string)) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new c_0(string));
        }
        this.b.put(string, a_02);
        return this;
    }

    public b<T> sampler(String string) {
        this.uniform(string, kotakbaz.rain.client.render.main.program.uniform.a_0.h);
        return this;
    }

    public kotakbaz.rain.client.render.main.program.A build() {
        if (this.a == null) {
            int n = f[12];
            n -= f[13];
            int n2 = f[15];
            n2 -= f[16];
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new C((String)C[n += f[14]] + (String)C[n2 += f[17]]));
        }
        if (!this.A.containsKey((Object)a_0.C)) {
            if (!this.A.containsKey((Object)a_0.a)) {
                int n = f[18];
                n ^= f[19];
                n ^= f[20];
                int n3 = f[21];
                n3 ^= f[22];
                n3 ^= f[23];
                int n4 = f[24];
                n4 ^= f[25];
                Object[] objectArray = new Object[n4 ^= f[26]];
                int n5 = f[27];
                n5 += f[28];
                objectArray[n5 -= kotakbaz.rain.client.render.main.builders.b.f[29]] = this.a;
                kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new C(String.format((String)C[n] + (String)C[n3], objectArray)));
            }
            if (!this.A.containsKey((Object)a_0.A)) {
                int n = f[30];
                n -= f[31];
                n ^= f[32];
                int n6 = f[33];
                n6 ^= f[34];
                n6 -= f[35];
                int n7 = f[36];
                n7 += f[37];
                Object[] objectArray = new Object[n7 -= f[38]];
                int n8 = f[39];
                n8 += f[40];
                objectArray[n8 -= kotakbaz.rain.client.render.main.builders.b.f[41]] = this.a;
                kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new C(String.format((String)C[n] + (String)C[n6], objectArray)));
            }
        }
        ArrayList<kotakbaz.rain.client.render.main.program.shader.A> arrayList = new ArrayList<kotakbaz.rain.client.render.main.program.shader.A>();
        this.A.forEach((a_02, a_03) -> arrayList.add(kotakbaz.rain.client.render.main.compile.b.compileShader(a_03, a_02)));
        return kotakbaz.rain.client.render.main.compile.b.compileProgram(this.a, arrayList, this.B, this.b);
    }

    public kotakbaz.rain.client.render.main.program.a_0 buildSnippet() {
        return new kotakbaz.rain.client.render.main.program.a_0(this.A, this.b);
    }

    static {
        kotakbaz.rain.client.render.main.builders.b.b();
        long l = -5758376936831671254L;
        long l2 = 2789800341868762328L;
        long l3 = 3465472678073942452L;
        long l4 = 3121269426343220330L;
        long l5 = -6441461794807493535L;
        long l6 = -8911245094752164167L;
        long l7 = -8360456181089198607L;
        long l8 = -4350534447794052727L;
        long l9 = -153516187029499110L;
        long l10 = -8504359161422551625L;
        long l11 = 5145249115267546522L;
        long l12 = 1861397786883748201L;
        long l13 = 2476643045427159951L;
        long l14 = -4535691548628131450L;
        int n = f[42];
        n += f[43];
        C = new Object[n += f[44]];
        long l15 = l14;
        int n2 = f[45];
        n2 += f[46];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += f[47]);
        Object[] objectArray = new Object[f[48]];
        objectArray[kotakbaz.rain.client.render.main.builders.b.f[49]] = d;
        objectArray[kotakbaz.rain.client.render.main.builders.b.f[50]] = f[51];
        int n3 = f[52];
        Object object = kotakbaz.rain.client.render.main.builders.b.A()[f[53]];
        if (object == null) {
            char[] cArray = "\ubde2\ubdf7\ubf90\ubf8d\ubdcf\ubdef\ubdd6\ubdd9\ubdd6\ubddf\ubdf5\ubd87\ubca9\ubdec\ubdef\ubde3\ubdc9\ubdff\ubdca\ubcb5\ubddc\ubde2\ubf8d\ubdf5\ubde4\ubcb0\ubde2\ubdd9\ubcb7\ubddc\ubdfc\ubdfa\ubcb5\ubd85\ubdff\ubdc9\ubcb6\ubddf\ubdef\ubcb0\ubcaf\ubdd6\ubdea\ubdea\ubdcd\ubf8d\ubd88\ubdfc\ubde3\ubcb6\ubca9\ubf90\ubde5\ubd86\ubddb\ubdf6\ubd81\ubde6\ubdeb\ubf90\ubdd9\ubdfc\ubcb5\ubd82\ubf90\ubf8d\ubd82\ubde1\ubde6\ubcb8\ubcb6\ubddc\ubddb\ubcaf\ubd83\ubdca\ubcb0\ubdeb\ubcb8\ubde9\ubdea\ubde5\ubd88\ubd86\ubde9\ubcab\ubd86\ubdec\ubde9\ubde5\ubdef\ubdd0\ubdff\ubdd6\ubc41\ubdcc\ubdd9\ubcae\ubdea\ubdfb\ubcaf\ubf90\ubddb\ubdda\ubde7\ubcad\ubdfc\ubde3\ubde2\ubdeb\ubd84\ubde4\ubdf7\ubcb6\ubdfc\ubdd8\ubdf6\ubdfc\ubd88\ubdd2\ubf90\ubdf6\ubdf2\ubdf5\ubc41\ubde5\ubdfb\ubdef\ubcb0\ubd83\ubcaf\ubcb8\ubdfc\ubd83\ubcb7\ubcb6\ubf90\ubc41\ubdc9\ubcaa\ubdcd\ubcae\ubcb6\ubdd0\ubdea\ubde3\ubde7\ubde9\ubcb5\ubcac\ubcae\ubdec\ubcb0\ubdf6\ubcb8\ubdd5\ubdcf\ubd86\ubd87\ubdda\ubdd5\ubd85\ubdfa\ubdea\ubcad\ubcac\ubdec\ubd84\ubd86\ubdfc\ubcb8\ubdea\ubde2\ubdff\ubdeb\ubde6\ubdcf\ubdec\ubf90\ubddb\ubd83\ubdea\ubde4\ubdea\ubd85\ubcb8\ubdcb\ubcb6\ubcaa\ubddf\ubdc9\ubdd7".toCharArray();
            for (int i = f[54]; i < f[55]; ++i) {
                int n4 = cArray[i];
                n4 ^= f[56];
                n4 -= f[57];
                n4 -= f[58];
                n4 -= f[59];
                n4 ^= f[60];
                n4 -= f[61];
                n4 -= f[62];
                n4 += f[63];
                n4 += f[64];
                n4 ^= f[65];
                cArray[i] = (char)(n4 -= f[66]);
            }
            object = kotakbaz.rain.client.render.main.builders.b.A()[kotakbaz.rain.client.render.main.builders.b.f[67]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.main.builders.b.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = f[68];
        n5 ^= f[69];
        l5 = l16 ^ (0x7A00000000L ^ l16) & -1L << (n5 -= f[70]);
        long l17 = l12;
        int n6 = f[71];
        n6 += f[72];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= f[73]);
        while (true) {
            int n7 = f[74];
            n7 -= f[75];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= f[76]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = f[77];
            n9 -= f[78];
            int n10 = f[80];
            n10 ^= f[81];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= f[79])) & -1L >>> (n10 -= f[82]);
            long l19 = l8;
            int n11 = f[83];
            n11 -= f[84];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= f[85]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = f[86];
            n13 -= f[87];
            int n14 = f[89];
            n14 -= f[90];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= f[88])) & -1L >>> (n14 -= f[91]);
            int n15 = f[92];
            n15 ^= f[93];
            long l21 = l9;
            int n16 = f[95];
            n16 -= f[96];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= f[94]) ^ l21) & -1L << (n16 += f[97]);
            int n17 = f[98];
            n17 += f[99];
            n17 ^= f[100];
            int n18 = f[101];
            n18 += f[102];
            long l22 = l11;
            int n19 = f[104];
            n19 ^= f[105];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= f[103]))) ^ l22) & -1L >>> (n19 += f[106]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = f[107];
            n20 ^= f[108];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= f[109]);
            while (true) {
                int n21 = f[110];
                n21 ^= f[111];
                if ((int)(l13 >>> (n21 -= f[112])) >= (int)l11) break;
                int n22 = f[113];
                n22 += f[114];
                int n23 = f[116];
                n23 -= f[117];
                cArray2[(int)(l13 >>> (n22 ^= kotakbaz.rain.client.render.main.builders.b.f[115]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= f[118]))];
                l13 += 0x100000000L;
            }
            int n24 = f[119];
            n24 ^= f[120];
            int n25 = (int)(l14 >>> (n24 -= f[121]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.render.main.builders.b.C[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = f[122];
            n26 -= f[123];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= f[124]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[f[125]];
        String string = (String)object[f[126]];
        object = object[f[127]];
        Object[] objectArray = e;
        if (e == null) {
            objectArray = e = new Object[f[128]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[f[129]];
                d = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[f[131] ^ f[132]];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[133] ^ kotakbaz.rain.client.render.main.builders.b.f[134]] = f[135] ^ f[136];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[137] ^ kotakbaz.rain.client.render.main.builders.b.f[138]] = f[139] ^ f[140];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[141] ^ kotakbaz.rain.client.render.main.builders.b.f[142]] = f[143] ^ f[144];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[145] ^ kotakbaz.rain.client.render.main.builders.b.f[146]] = f[147] ^ f[148];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[149] ^ kotakbaz.rain.client.render.main.builders.b.f[150]] = f[151] ^ f[152];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[153] ^ kotakbaz.rain.client.render.main.builders.b.f[154]] = f[155] ^ f[156];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[157] ^ kotakbaz.rain.client.render.main.builders.b.f[158]] = f[159] ^ f[160];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[161] ^ kotakbaz.rain.client.render.main.builders.b.f[162]] = f[163] ^ f[164];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[165] ^ kotakbaz.rain.client.render.main.builders.b.f[166]] = f[167] ^ f[168];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[169] ^ kotakbaz.rain.client.render.main.builders.b.f[170]] = f[171] ^ f[172];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[173] ^ kotakbaz.rain.client.render.main.builders.b.f[174]] = f[175] ^ f[176];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[177] ^ kotakbaz.rain.client.render.main.builders.b.f[178]] = f[179] ^ f[180];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[181] ^ kotakbaz.rain.client.render.main.builders.b.f[182]] = f[183] ^ f[184];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[185] ^ kotakbaz.rain.client.render.main.builders.b.f[186]] = f[187] ^ f[188];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[189] ^ kotakbaz.rain.client.render.main.builders.b.f[190]] = f[191] ^ f[192];
                byArray[kotakbaz.rain.client.render.main.builders.b.f[193] ^ kotakbaz.rain.client.render.main.builders.b.f[194]] = f[195] ^ f[196];
                objectArray2[kotakbaz.rain.client.render.main.builders.b.f[130]] = byArray;
            }
            byte[] byArray = (byte[])object3[f[197]];
            if (D == null) {
                byte[] byArray2 = new byte[f[198] ^ f[199]];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[200] ^ kotakbaz.rain.client.render.main.builders.b.f[201]] = f[202] ^ f[203];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[204] ^ kotakbaz.rain.client.render.main.builders.b.f[205]] = f[206] ^ f[207];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[208] ^ kotakbaz.rain.client.render.main.builders.b.f[209]] = f[210] ^ f[211];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[212] ^ kotakbaz.rain.client.render.main.builders.b.f[213]] = f[214] ^ f[215];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[216] ^ kotakbaz.rain.client.render.main.builders.b.f[217]] = f[218] ^ f[219];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[220] ^ kotakbaz.rain.client.render.main.builders.b.f[221]] = f[222] ^ f[223];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[224] ^ kotakbaz.rain.client.render.main.builders.b.f[225]] = f[226] ^ f[227];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[228] ^ kotakbaz.rain.client.render.main.builders.b.f[229]] = f[230] ^ f[231];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[232] ^ kotakbaz.rain.client.render.main.builders.b.f[233]] = f[234] ^ f[235];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[236] ^ kotakbaz.rain.client.render.main.builders.b.f[237]] = f[238] ^ f[239];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[240] ^ kotakbaz.rain.client.render.main.builders.b.f[241]] = f[242] ^ f[243];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[244] ^ kotakbaz.rain.client.render.main.builders.b.f[245]] = f[246] ^ f[247];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[248] ^ kotakbaz.rain.client.render.main.builders.b.f[249]] = f[250] ^ f[251];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[252] ^ kotakbaz.rain.client.render.main.builders.b.f[253]] = f[254] ^ f[255];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[256] ^ kotakbaz.rain.client.render.main.builders.b.f[257]] = f[258] ^ f[259];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[260] ^ kotakbaz.rain.client.render.main.builders.b.f[261]] = f[262] ^ f[263];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[264] ^ kotakbaz.rain.client.render.main.builders.b.f[265]] = f[266] ^ f[267];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[268] ^ kotakbaz.rain.client.render.main.builders.b.f[269]] = f[270] ^ f[271];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[272] ^ kotakbaz.rain.client.render.main.builders.b.f[273]] = f[274] ^ f[275];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[276] ^ kotakbaz.rain.client.render.main.builders.b.f[277]] = f[278] ^ f[279];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[280] ^ kotakbaz.rain.client.render.main.builders.b.f[281]] = f[282] ^ f[283];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[284] ^ kotakbaz.rain.client.render.main.builders.b.f[285]] = f[286] ^ f[287];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[288] ^ kotakbaz.rain.client.render.main.builders.b.f[289]] = f[290] ^ f[291];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[292] ^ kotakbaz.rain.client.render.main.builders.b.f[293]] = f[294] ^ f[295];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[296] ^ kotakbaz.rain.client.render.main.builders.b.f[297]] = f[298] ^ f[299];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[300] ^ kotakbaz.rain.client.render.main.builders.b.f[301]] = f[302] ^ f[303];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[304] ^ kotakbaz.rain.client.render.main.builders.b.f[305]] = f[306] ^ f[307];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[308] ^ kotakbaz.rain.client.render.main.builders.b.f[309]] = f[310] ^ f[311];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[312] ^ kotakbaz.rain.client.render.main.builders.b.f[313]] = f[314] ^ f[315];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[316] ^ kotakbaz.rain.client.render.main.builders.b.f[317]] = f[318] ^ f[319];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[320] ^ kotakbaz.rain.client.render.main.builders.b.f[321]] = f[322] ^ f[323];
                byArray2[kotakbaz.rain.client.render.main.builders.b.f[324] ^ kotakbaz.rain.client.render.main.builders.b.f[325]] = f[326] ^ f[327];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, f[328], byArray3, f[329], byArray.length);
                System.arraycopy(byArray2, f[330], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.main.builders.b.A()[f[331]];
                if (object4 == null) {
                    char[] cArray = "\ue75a\ue748\ue747\ue746\ue754\ue738\uec7b\ue891\ue876\ue892\ue6f2\ue87d\uec69\uec7f\ue6ef\ue6f2\ue749\ue739".toCharArray();
                    for (int i = f[332]; i < f[333]; ++i) {
                        int n2 = cArray[i];
                        n2 -= f[334];
                        n2 ^= f[335];
                        n2 ^= f[336];
                        n2 -= f[337];
                        n2 += f[338];
                        n2 += f[339];
                        n2 -= f[340];
                        n2 -= f[341];
                        n2 -= f[342];
                        n2 += f[343];
                        n2 ^= f[344];
                        n2 -= f[345];
                        n2 ^= f[346];
                        cArray[i] = (char)(n2 -= f[347]);
                    }
                    object4 = kotakbaz.rain.client.render.main.builders.b.A()[kotakbaz.rain.client.render.main.builders.b.f[348]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[f[349]];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[350]] = f[351];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[352]] = f[353];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[354]] = f[355];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[356]] = f[357];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[358]] = f[359];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[360]] = f[361];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[362]] = f[363];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[364]] = f[365];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[366]] = f[367];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[368]] = f[369];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[370]] = f[371];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[372]] = f[373];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[374]] = f[375];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[376]] = f[377];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[378]] = f[379];
                byArray4[kotakbaz.rain.client.render.main.builders.b.f[380]] = f[381];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, f[382], f[383]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.main.builders.b.A()[f[384]];
                if (object5 == null) {
                    char[] cArray = "\ueef9\ueec5\ueecb".toCharArray();
                    for (int i = f[385]; i < f[386]; ++i) {
                        int n3 = cArray[i];
                        n3 -= f[387];
                        n3 += f[388];
                        n3 += f[389];
                        n3 ^= f[390];
                        n3 ^= f[391];
                        n3 -= f[392];
                        n3 += f[393];
                        n3 -= f[394];
                        n3 -= f[395];
                        n3 ^= f[396];
                        cArray[i] = (char)(n3 += f[397]);
                    }
                    object5 = kotakbaz.rain.client.render.main.builders.b.A()[kotakbaz.rain.client.render.main.builders.b.f[398]] = new String(cArray);
                }
                D = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, f[399], 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.render.main.builders.b.A()[3];
            if (object6 == null) {
                char[] cArray = "\u4ede\u4e22\u4e34\u4ed0\u4e24\u4e25\u4e24\u4ed0\u4e2f\u4e2c\u4e24\u4e34\u4ed2\u4e2f\u4e3e\u4e03\u4e03\u4e06\u4e11\u4e08".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0xB1A0;
                    n4 -= 44386;
                    n4 ^= 0x6503;
                    n4 -= 20003;
                    n4 -= 33224;
                    n4 -= 50921;
                    n4 -= 8014;
                    n4 += 14703;
                    n4 += 3601;
                    n4 -= 49396;
                    n4 -= 44213;
                    n4 -= 49173;
                    n4 += 5502;
                    n4 -= 33438;
                    cArray[i] = (char)(n4 -= 11614);
                }
                object6 = kotakbaz.rain.client.render.main.builders.b.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)D), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = E;
        if (E == null) {
            E = new Object[4];
            objectArray = E;
        }
        return objectArray;
    }

    public static void b() {
        f = new int[0x549C ^ 0x550C];
        kotakbaz.rain.client.render.main.builders.b.f[0x5736 ^ 0x57B7] = 0x57B6 ^ 0x57B7;
        kotakbaz.rain.client.render.main.builders.b.f[0xDE1F ^ 0xDE51] = 0xFFFF218F ^ 0xDE51;
        kotakbaz.rain.client.render.main.builders.b.f[0xC8AA ^ 0xC8C1] = 0xFFFF3758 ^ 0xC8C1;
        kotakbaz.rain.client.render.main.builders.b.f[0xA6D3 ^ 0xA6D7] = 0xFFFF591A ^ 0xA6D7;
        kotakbaz.rain.client.render.main.builders.b.f[0x7F8F ^ 0x7F2A] = 0xA692 ^ 0x7F2A;
        kotakbaz.rain.client.render.main.builders.b.f[0xFF3B ^ 0xFF58] = 0xFFFF00D2 ^ 0xFF58;
        kotakbaz.rain.client.render.main.builders.b.f[0x6CC2 ^ 0x6C0E] = 0x2377 ^ 0x6C0E;
        kotakbaz.rain.client.render.main.builders.b.f[0x4C89 ^ 0x4CCD] = 0xFFFFB32E ^ 0x4CCD;
        kotakbaz.rain.client.render.main.builders.b.f[0xC8EE ^ 0xC8C9] = 0xFFFF3702 ^ 0xC8C9;
        kotakbaz.rain.client.render.main.builders.b.f[0x376E ^ 0x3662] = 0xFE6C ^ 0x3662;
        kotakbaz.rain.client.render.main.builders.b.f[0x4CB1 ^ 0x4DBE] = 0x85B1 ^ 0x4DBE;
        kotakbaz.rain.client.render.main.builders.b.f[0x104F3 ^ 0x10438] = 0x14A1C ^ 0x10438;
        kotakbaz.rain.client.render.main.builders.b.f[0x2FA1 ^ 0x2E22] = 0x4373 ^ 0x2E22;
        kotakbaz.rain.client.render.main.builders.b.f[0x6A96 ^ 0x6AA4] = 0x6AA5 ^ 0x6AA4;
        kotakbaz.rain.client.render.main.builders.b.f[0x6A48 ^ 0x6B3F] = 0xFFFF94F7 ^ 0x6B3F;
        kotakbaz.rain.client.render.main.builders.b.f[0x93D4 ^ 0x9320] = 0xDD63 ^ 0x9320;
        kotakbaz.rain.client.render.main.builders.b.f[0x9924 ^ 0x9982] = 0x403C ^ 0x9982;
        kotakbaz.rain.client.render.main.builders.b.f[0x5A52 ^ 0x5AB7] = 0x4195 ^ 0x5AB7;
        kotakbaz.rain.client.render.main.builders.b.f[0x2912 ^ 0x2857] = 0x7948 ^ 0x2857;
        kotakbaz.rain.client.render.main.builders.b.f[0x5DC9 ^ 0x5D7A] = 0xFFFF1845 ^ 0x5D7A;
        kotakbaz.rain.client.render.main.builders.b.f[0x859B ^ 0x8508] = 0xFFFF79C6 ^ 0x8508;
        kotakbaz.rain.client.render.main.builders.b.f[0xDEED ^ 0xDFE3] = 0x17A0 ^ 0xDFE3;
        kotakbaz.rain.client.render.main.builders.b.f[0x17F9 ^ 0x16F1] = 0x641E ^ 0x16F1;
        kotakbaz.rain.client.render.main.builders.b.f[0xC18E ^ 0xC097] = 0xD07 ^ 0xC097;
        kotakbaz.rain.client.render.main.builders.b.f[0x6AA7 ^ 0x6B28] = 0x6B28 ^ 0x6B28;
        kotakbaz.rain.client.render.main.builders.b.f[0x2274 ^ 0x229B] = 0x3CBE ^ 0x229B;
        kotakbaz.rain.client.render.main.builders.b.f[0xFC54 ^ 0xFCCB] = 0xFFFF0A38 ^ 0xFCCB;
        kotakbaz.rain.client.render.main.builders.b.f[0xBB56 ^ 0xBB06] = 0xBB19 ^ 0xBB06;
        kotakbaz.rain.client.render.main.builders.b.f[0xF84B ^ 0xF89E] = 0x4A27 ^ 0xF89E;
        kotakbaz.rain.client.render.main.builders.b.f[0xFB70 ^ 0xFA3C] = 0xFA3C ^ 0xFA3C;
        kotakbaz.rain.client.render.main.builders.b.f[0x47FE ^ 0x46A0] = 0x46AE ^ 0x46A0;
        kotakbaz.rain.client.render.main.builders.b.f[0x264D ^ 0x277E] = 0xD919 ^ 0x277E;
        kotakbaz.rain.client.render.main.builders.b.f[0xA6E2 ^ 0xA78A] = 0xA780 ^ 0xA78A;
        kotakbaz.rain.client.render.main.builders.b.f[0x2897 ^ 0x28A4] = 0x28A4 ^ 0x28A4;
        kotakbaz.rain.client.render.main.builders.b.f[0x13D8 ^ 0x13E6] = 0x9DDB ^ 0x13E6;
        kotakbaz.rain.client.render.main.builders.b.f[0xF08C ^ 0xF0E4] = 0xFFFF0FB8 ^ 0xF0E4;
        kotakbaz.rain.client.render.main.builders.b.f[0xD5DB ^ 0xD546] = 0xDC62 ^ 0xD546;
        kotakbaz.rain.client.render.main.builders.b.f[0x10BE5 ^ 0x10B94] = 0xFFFEF413 ^ 0x10B94;
        kotakbaz.rain.client.render.main.builders.b.f[0x6153 ^ 0x61F3] = 0x68DF ^ 0x61F3;
        kotakbaz.rain.client.render.main.builders.b.f[0x63F1 ^ 0x6374] = 0xD6D5 ^ 0x6374;
        kotakbaz.rain.client.render.main.builders.b.f[0xD642 ^ 0xD687] = 0xD687 ^ 0xD687;
        kotakbaz.rain.client.render.main.builders.b.f[0xD952 ^ 0xD912] = 0xFFDC ^ 0xD912;
        kotakbaz.rain.client.render.main.builders.b.f[0xE279 ^ 0xE305] = 0xE305 ^ 0xE305;
        kotakbaz.rain.client.render.main.builders.b.f[0x4487 ^ 0x4450] = 0xF6E9 ^ 0x4450;
        kotakbaz.rain.client.render.main.builders.b.f[0x2F7 ^ 0x2DB] = 0x2B6 ^ 0x2DB;
        kotakbaz.rain.client.render.main.builders.b.f[0x3435 ^ 0x34E5] = 0x8D42 ^ 0x34E5;
        kotakbaz.rain.client.render.main.builders.b.f[0x27D ^ 0x2E1] = 0xAEB ^ 0x2E1;
        kotakbaz.rain.client.render.main.builders.b.f[0xD5D4 ^ 0xD5C7] = 0xD5C0 ^ 0xD5C7;
        kotakbaz.rain.client.render.main.builders.b.f[0xBBE7 ^ 0xBA69] = 0xBA6B ^ 0xBA69;
        kotakbaz.rain.client.render.main.builders.b.f[0xF0C6 ^ 0xF197] = 0xE61F ^ 0xF197;
        kotakbaz.rain.client.render.main.builders.b.f[0x3FA7 ^ 0x3EC2] = 0x3E9B ^ 0x3EC2;
        kotakbaz.rain.client.render.main.builders.b.f[0x1B4B ^ 0x1A49] = 0x70FB ^ 0x1A49;
        kotakbaz.rain.client.render.main.builders.b.f[0x9040 ^ 0x907F] = 0x8762 ^ 0x907F;
        kotakbaz.rain.client.render.main.builders.b.f[0x6B96 ^ 0x6AB4] = 0xFFFF913A ^ 0x6AB4;
        kotakbaz.rain.client.render.main.builders.b.f[0x2C59 ^ 0x2C9E] = 0x8EB2 ^ 0x2C9E;
        kotakbaz.rain.client.render.main.builders.b.f[0x1034C ^ 0x1033E] = 0x1030A ^ 0x1033E;
        kotakbaz.rain.client.render.main.builders.b.f[0x22ED ^ 0x221B] = 0x6C72 ^ 0x221B;
        kotakbaz.rain.client.render.main.builders.b.f[0x6839 ^ 0x69B9] = 0x69BB ^ 0x69B9;
        kotakbaz.rain.client.render.main.builders.b.f[0x2A40 ^ 0x2A03] = 0x2A03 ^ 0x2A03;
        kotakbaz.rain.client.render.main.builders.b.f[0xEDF9 ^ 0xEDD9] = 0xFFFF1218 ^ 0xEDD9;
        kotakbaz.rain.client.render.main.builders.b.f[0x688D ^ 0x6906] = 0xC49C ^ 0x6906;
        kotakbaz.rain.client.render.main.builders.b.f[0xBC19 ^ 0xBD90] = 0xD459 ^ 0xBD90;
        kotakbaz.rain.client.render.main.builders.b.f[0x95B4 ^ 0x959F] = 0xFFFF6A2A ^ 0x959F;
        kotakbaz.rain.client.render.main.builders.b.f[0x76B5 ^ 0x77CE] = 0xFFFF8867 ^ 0x77CE;
        kotakbaz.rain.client.render.main.builders.b.f[0x9305 ^ 0x922C] = 0x9E0B ^ 0x922C;
        kotakbaz.rain.client.render.main.builders.b.f[0x9DA2 ^ 0x9D76] = 0x2FD9 ^ 0x9D76;
        kotakbaz.rain.client.render.main.builders.b.f[0xA748 ^ 0xA603] = 0xA602 ^ 0xA603;
        kotakbaz.rain.client.render.main.builders.b.f[0xEF4A ^ 0xEF12] = 0xFFFF10A2 ^ 0xEF12;
        kotakbaz.rain.client.render.main.builders.b.f[0x103E ^ 0x1073] = 0xFFFFEF93 ^ 0x1073;
        kotakbaz.rain.client.render.main.builders.b.f[0x4BF6 ^ 0x4B0C] = 0xFFFFF24A ^ 0x4B0C;
        kotakbaz.rain.client.render.main.builders.b.f[0xD1FE ^ 0xD1F6] = 0xFFFF2E02 ^ 0xD1F6;
        kotakbaz.rain.client.render.main.builders.b.f[0xEC64 ^ 0xEC46] = 0xFFFF139F ^ 0xEC46;
        kotakbaz.rain.client.render.main.builders.b.f[0x82AF ^ 0x83DA] = 0x83EE ^ 0x83DA;
        kotakbaz.rain.client.render.main.builders.b.f[0x1E2A ^ 0x1EA5] = 0x3F2D ^ 0x1EA5;
        kotakbaz.rain.client.render.main.builders.b.f[0x91E9 ^ 0x9087] = 0x908C ^ 0x9087;
        kotakbaz.rain.client.render.main.builders.b.f[0xA0BA ^ 0xA0D0] = 0xFFFF5F59 ^ 0xA0D0;
        kotakbaz.rain.client.render.main.builders.b.f[0x36F ^ 0x273] = 0x754A ^ 0x273;
        kotakbaz.rain.client.render.main.builders.b.f[0x5B61 ^ 0x5B87] = 0xFFFFBF13 ^ 0x5B87;
        kotakbaz.rain.client.render.main.builders.b.f[0xF4C1 ^ 0xF4EB] = 0xFFFF0B0F ^ 0xF4EB;
        kotakbaz.rain.client.render.main.builders.b.f[0x106B1 ^ 0x1060D] = 0xF6E ^ 0x1060D;
        kotakbaz.rain.client.render.main.builders.b.f[0x5DDC ^ 0x5D50] = 0xFC ^ 0x5D50;
        kotakbaz.rain.client.render.main.builders.b.f[0x1061C ^ 0x106FF] = 0x1F26E ^ 0x106FF;
        kotakbaz.rain.client.render.main.builders.b.f[0xED97 ^ 0xED3D] = 0xA3BC ^ 0xED3D;
        kotakbaz.rain.client.render.main.builders.b.f[0xB6B2 ^ 0xB7EB] = 0x8A99 ^ 0xB7EB;
        kotakbaz.rain.client.render.main.builders.b.f[0x5F75 ^ 0x5E0D] = 0x5E04 ^ 0x5E0D;
        kotakbaz.rain.client.render.main.builders.b.f[0xDA6D ^ 0xDB3F] = 0x195 ^ 0xDB3F;
        kotakbaz.rain.client.render.main.builders.b.f[0x12C4 ^ 0x121F] = 0xC624 ^ 0x121F;
        kotakbaz.rain.client.render.main.builders.b.f[0x92C6 ^ 0x92D7] = 0xFFFF6D0F ^ 0x92D7;
        kotakbaz.rain.client.render.main.builders.b.f[0x71C ^ 0x70B] = 0xFFFFF8A2 ^ 0x70B;
        kotakbaz.rain.client.render.main.builders.b.f[0xBF3 ^ 0xBDB] = 0xFFFFF401 ^ 0xBDB;
        kotakbaz.rain.client.render.main.builders.b.f[0xA35F ^ 0xA3DC] = 0xC18 ^ 0xA3DC;
        kotakbaz.rain.client.render.main.builders.b.f[0x6E5A ^ 0x6E57] = 0x6E61 ^ 0x6E57;
        kotakbaz.rain.client.render.main.builders.b.f[0x2917 ^ 0x2967] = 0xFFFFD6D4 ^ 0x2967;
        kotakbaz.rain.client.render.main.builders.b.f[0xD892 ^ 0xD9DD] = 0x74B9 ^ 0xD9DD;
        kotakbaz.rain.client.render.main.builders.b.f[0xDD6E ^ 0xDD0A] = 0xFFFF22DB ^ 0xDD0A;
        kotakbaz.rain.client.render.main.builders.b.f[0xCE2D ^ 0xCF0C] = 0xCB45 ^ 0xCF0C;
        kotakbaz.rain.client.render.main.builders.b.f[0xDEE4 ^ 0xDEC1] = 0xFFFF2114 ^ 0xDEC1;
        kotakbaz.rain.client.render.main.builders.b.f[0x8C68 ^ 0x8D3D] = 0x1E36 ^ 0x8D3D;
        kotakbaz.rain.client.render.main.builders.b.f[0x358B ^ 0x350C] = 0x80EC ^ 0x350C;
        kotakbaz.rain.client.render.main.builders.b.f[0xC56C ^ 0xC50B] = 0xC51B ^ 0xC50B;
        kotakbaz.rain.client.render.main.builders.b.f[0xA24F ^ 0xA2A2] = 0xBC87 ^ 0xA2A2;
        kotakbaz.rain.client.render.main.builders.b.f[0x4B94 ^ 0x4ABF] = 0x4698 ^ 0x4ABF;
        kotakbaz.rain.client.render.main.builders.b.f[0xDA7E ^ 0xDB7D] = 0xB1F8 ^ 0xDB7D;
        kotakbaz.rain.client.render.main.builders.b.f[0x512D ^ 0x5029] = 0x76F ^ 0x5029;
        kotakbaz.rain.client.render.main.builders.b.f[0x259 ^ 0x2C0] = 0xAC3 ^ 0x2C0;
        kotakbaz.rain.client.render.main.builders.b.f[0x2CFD ^ 0x2CCC] = 0x2CCC ^ 0x2CCC;
        kotakbaz.rain.client.render.main.builders.b.f[0x5511 ^ 0x5477] = 0x547A ^ 0x5477;
        kotakbaz.rain.client.render.main.builders.b.f[0x8C83 ^ 0x8C47] = 0xB053 ^ 0x8C47;
        kotakbaz.rain.client.render.main.builders.b.f[0x10F94 ^ 0x10ECB] = 0x10EEC ^ 0x10ECB;
        kotakbaz.rain.client.render.main.builders.b.f[0x10201 ^ 0x1026D] = 0x1020D ^ 0x1026D;
        kotakbaz.rain.client.render.main.builders.b.f[0x2BD4 ^ 0x2B25] = 0x96E7 ^ 0x2B25;
        kotakbaz.rain.client.render.main.builders.b.f[0x7E32 ^ 0x7ED0] = 0x8A46 ^ 0x7ED0;
        kotakbaz.rain.client.render.main.builders.b.f[0x315A ^ 0x316C] = 0x316C ^ 0x316C;
        kotakbaz.rain.client.render.main.builders.b.f[0x2BF0 ^ 0x2AE7] = 0xBB06 ^ 0x2AE7;
        kotakbaz.rain.client.render.main.builders.b.f[0xC24B ^ 0xC335] = 0xC328 ^ 0xC335;
        kotakbaz.rain.client.render.main.builders.b.f[0xFDC1 ^ 0xFDC4] = 0xFFFF021F ^ 0xFDC4;
        kotakbaz.rain.client.render.main.builders.b.f[0x4C26 ^ 0x4CAB] = 0x6D4C ^ 0x4CAB;
        kotakbaz.rain.client.render.main.builders.b.f[0xEEED ^ 0xEEF3] = 0xFFFF1178 ^ 0xEEF3;
        kotakbaz.rain.client.render.main.builders.b.f[0x3D38 ^ 0x3C0E] = 0x8DE ^ 0x3C0E;
        kotakbaz.rain.client.render.main.builders.b.f[0x10187 ^ 0x100E7] = 0x100E2 ^ 0x100E7;
        kotakbaz.rain.client.render.main.builders.b.f[0x10F5 ^ 0x11A9] = 0x11A8 ^ 0x11A9;
        kotakbaz.rain.client.render.main.builders.b.f[0x9338 ^ 0x925F] = 0x9277 ^ 0x925F;
        kotakbaz.rain.client.render.main.builders.b.f[0xDA6C ^ 0xDAF4] = 0xBA95 ^ 0xDAF4;
        kotakbaz.rain.client.render.main.builders.b.f[0x5ED2 ^ 0x5FB9] = 0xFFFFA03C ^ 0x5FB9;
        kotakbaz.rain.client.render.main.builders.b.f[0x60E7 ^ 0x606C] = 0x3DB9 ^ 0x606C;
        kotakbaz.rain.client.render.main.builders.b.f[0xE7D7 ^ 0xE680] = 0xFBB1 ^ 0xE680;
        kotakbaz.rain.client.render.main.builders.b.f[0x346E ^ 0x34D9] = 0xFFFF0DA7 ^ 0x34D9;
        kotakbaz.rain.client.render.main.builders.b.f[0x10C46 ^ 0x10C71] = 0x10CB1 ^ 0x10C71;
        kotakbaz.rain.client.render.main.builders.b.f[0x10B7 ^ 0x10F5] = 0xCC3A ^ 0x10F5;
        kotakbaz.rain.client.render.main.builders.b.f[0x9B4D ^ 0x9A74] = 0x3AEA ^ 0x9A74;
        kotakbaz.rain.client.render.main.builders.b.f[0x4FE2 ^ 0x4F0A] = 0x3E5E ^ 0x4F0A;
        kotakbaz.rain.client.render.main.builders.b.f[0xCAA9 ^ 0xCAF5] = 0xCA93 ^ 0xCAF5;
        kotakbaz.rain.client.render.main.builders.b.f[0x5432 ^ 0x5464] = 0xFFFFABD0 ^ 0x5464;
        kotakbaz.rain.client.render.main.builders.b.f[0x9D87 ^ 0x9DF2] = 0xFFFF6205 ^ 0x9DF2;
        kotakbaz.rain.client.render.main.builders.b.f[0x10142 ^ 0x10104] = 0xFFFEFE97 ^ 0x10104;
        kotakbaz.rain.client.render.main.builders.b.f[0xCCD4 ^ 0xCDE8] = 0x1C6A0 ^ 0xCDE8;
        kotakbaz.rain.client.render.main.builders.b.f[0x19AF ^ 0x19BD] = 0x19C0 ^ 0x19BD;
        kotakbaz.rain.client.render.main.builders.b.f[0xD380 ^ 0xD208] = 0xB3C0 ^ 0xD208;
        kotakbaz.rain.client.render.main.builders.b.f[0xBE18 ^ 0xBEF3] = 0xCFA0 ^ 0xBEF3;
        kotakbaz.rain.client.render.main.builders.b.f[0x769C ^ 0x77C4] = 0x4276 ^ 0x77C4;
        kotakbaz.rain.client.render.main.builders.b.f[0x4BF2 ^ 0x4BBA] = 0x4BD9 ^ 0x4BBA;
        kotakbaz.rain.client.render.main.builders.b.f[0x26EC ^ 0x26CF] = 0xFFFFD91F ^ 0x26CF;
        kotakbaz.rain.client.render.main.builders.b.f[0x55BE ^ 0x5513] = 0x156F8 ^ 0x5513;
        kotakbaz.rain.client.render.main.builders.b.f[0x75EB ^ 0x74CD] = 0xFFFFCB12 ^ 0x74CD;
        kotakbaz.rain.client.render.main.builders.b.f[0xE4BD ^ 0xE453] = 0xFA2D ^ 0xE453;
        kotakbaz.rain.client.render.main.builders.b.f[0xA676 ^ 0xA625] = 0xFFFF59D3 ^ 0xA625;
        kotakbaz.rain.client.render.main.builders.b.f[0x9D6C ^ 0x9DEA] = 0x284B ^ 0x9DEA;
        kotakbaz.rain.client.render.main.builders.b.f[0x5B63 ^ 0x5B2F] = 0x5B42 ^ 0x5B2F;
        kotakbaz.rain.client.render.main.builders.b.f[0x73BD ^ 0x72CC] = 0x72F5 ^ 0x72CC;
        kotakbaz.rain.client.render.main.builders.b.f[0xBDD0 ^ 0xBD30] = 0x49BA ^ 0xBD30;
        kotakbaz.rain.client.render.main.builders.b.f[0xC399 ^ 0xC29C] = 0x95C0 ^ 0xC29C;
        kotakbaz.rain.client.render.main.builders.b.f[0x1493 ^ 0x15AE] = 0x11EE2 ^ 0x15AE;
        kotakbaz.rain.client.render.main.builders.b.f[0xFD87 ^ 0xFD35] = 0x478A ^ 0xFD35;
        kotakbaz.rain.client.render.main.builders.b.f[0x8C42 ^ 0x8CB1] = 0x3173 ^ 0x8CB1;
        kotakbaz.rain.client.render.main.builders.b.f[0x665A ^ 0x66CF] = 0x6A3 ^ 0x66CF;
        kotakbaz.rain.client.render.main.builders.b.f[0x75BD ^ 0x7599] = 0x75A1 ^ 0x7599;
        kotakbaz.rain.client.render.main.builders.b.f[0xC26D ^ 0xC293] = 0xFFFFD319 ^ 0xC293;
        kotakbaz.rain.client.render.main.builders.b.f[0xD8A7 ^ 0xD835] = 0xDB26 ^ 0xD835;
        kotakbaz.rain.client.render.main.builders.b.f[0x9B32 ^ 0x9B9C] = 0x19878 ^ 0x9B9C;
        kotakbaz.rain.client.render.main.builders.b.f[0x951E ^ 0x9523] = 0x31B8 ^ 0x9523;
        kotakbaz.rain.client.render.main.builders.b.f[0xC2DA ^ 0xC260] = 0x1CB03 ^ 0xC260;
        kotakbaz.rain.client.render.main.builders.b.f[0x114F ^ 0x1134] = 0xFFFFEEBF ^ 0x1134;
        kotakbaz.rain.client.render.main.builders.b.f[0x49B8 ^ 0x496B] = 0xF0D9 ^ 0x496B;
        kotakbaz.rain.client.render.main.builders.b.f[0x5A8 ^ 0x4C5] = 0x484 ^ 0x4C5;
        kotakbaz.rain.client.render.main.builders.b.f[0x94C0 ^ 0x94CC] = 0x9499 ^ 0x94CC;
        kotakbaz.rain.client.render.main.builders.b.f[0xE9C9 ^ 0xE95E] = 0x8902 ^ 0xE95E;
        kotakbaz.rain.client.render.main.builders.b.f[0x8A5F ^ 0x8BDB] = 0x5C49 ^ 0x8BDB;
        kotakbaz.rain.client.render.main.builders.b.f[0x676A ^ 0x67B6] = 0x3989 ^ 0x67B6;
        kotakbaz.rain.client.render.main.builders.b.f[0x96F6 ^ 0x9646] = 0x195A2 ^ 0x9646;
        kotakbaz.rain.client.render.main.builders.b.f[0xC5C8 ^ 0xC56A] = 0x859F ^ 0xC56A;
        kotakbaz.rain.client.render.main.builders.b.f[0xFE77 ^ 0xFE9D] = 0x8FB8 ^ 0xFE9D;
        kotakbaz.rain.client.render.main.builders.b.f[0x19DE ^ 0x1904] = 0xCD3C ^ 0x1904;
        kotakbaz.rain.client.render.main.builders.b.f[0xFCFD ^ 0xFC93] = 0xFC99 ^ 0xFC93;
        kotakbaz.rain.client.render.main.builders.b.f[0xA298 ^ 0xA227] = 0xFFFF31BC ^ 0xA227;
        kotakbaz.rain.client.render.main.builders.b.f[0xA67D ^ 0xA758] = 0xE779 ^ 0xA758;
        kotakbaz.rain.client.render.main.builders.b.f[0xB8F9 ^ 0xB9FE] = 0xEEA2 ^ 0xB9FE;
        kotakbaz.rain.client.render.main.builders.b.f[0x3F45 ^ 0x3FEC] = 0x7168 ^ 0x3FEC;
        kotakbaz.rain.client.render.main.builders.b.f[0x3B2F ^ 0x3A1D] = 0xFFFF3BF7 ^ 0x3A1D;
        kotakbaz.rain.client.render.main.builders.b.f[0xF680 ^ 0xF78A] = 0xFFFF7AF3 ^ 0xF78A;
        kotakbaz.rain.client.render.main.builders.b.f[0x7F9C ^ 0x7FC9] = 0xFFFF8058 ^ 0x7FC9;
        kotakbaz.rain.client.render.main.builders.b.f[0xF67E ^ 0xF609] = 0xF61C ^ 0xF609;
        kotakbaz.rain.client.render.main.builders.b.f[0x3891 ^ 0x399A] = 0x4B77 ^ 0x399A;
        kotakbaz.rain.client.render.main.builders.b.f[0x9A9F ^ 0x9AFE] = 0xFFFF6568 ^ 0x9AFE;
        kotakbaz.rain.client.render.main.builders.b.f[0xE004 ^ 0xE0ED] = 0x91BE ^ 0xE0ED;
        kotakbaz.rain.client.render.main.builders.b.f[0x1920 ^ 0x1856] = 0x1850 ^ 0x1856;
        kotakbaz.rain.client.render.main.builders.b.f[0x7417 ^ 0x757B] = 0x7577 ^ 0x757B;
        kotakbaz.rain.client.render.main.builders.b.f[0x392F ^ 0x39A6] = 0x640B ^ 0x39A6;
        kotakbaz.rain.client.render.main.builders.b.f[0x14DB ^ 0x1462] = 0x11D03 ^ 0x1462;
        kotakbaz.rain.client.render.main.builders.b.f[0xE9DF ^ 0xE944] = 0xFFFF1EB1 ^ 0xE944;
        kotakbaz.rain.client.render.main.builders.b.f[0xB4C1 ^ 0xB470] = 0xECC ^ 0xB470;
        kotakbaz.rain.client.render.main.builders.b.f[0xC68C ^ 0xC7F1] = 0xFFFF3841 ^ 0xC7F1;
        kotakbaz.rain.client.render.main.builders.b.f[0x2DE6 ^ 0x2CA5] = 0xE8D0 ^ 0x2CA5;
        kotakbaz.rain.client.render.main.builders.b.f[0x5968 ^ 0x599A] = 0xFFFF1B83 ^ 0x599A;
        kotakbaz.rain.client.render.main.builders.b.f[0xCEED ^ 0xCF8C] = 0xFFFF3044 ^ 0xCF8C;
        kotakbaz.rain.client.render.main.builders.b.f[0xB183 ^ 0xB0A7] = 0xF094 ^ 0xB0A7;
        kotakbaz.rain.client.render.main.builders.b.f[0xE49F ^ 0xE5B3] = 0x8D2 ^ 0xE5B3;
        kotakbaz.rain.client.render.main.builders.b.f[0x1BB3 ^ 0x1B39] = 0x4695 ^ 0x1B39;
        kotakbaz.rain.client.render.main.builders.b.f[0xE667 ^ 0xE74A] = 0xA28 ^ 0xE74A;
        kotakbaz.rain.client.render.main.builders.b.f[0x5300 ^ 0x53F0] = 0xEE22 ^ 0x53F0;
        kotakbaz.rain.client.render.main.builders.b.f[0x57D0 ^ 0x57DE] = 0xFFFFA83A ^ 0x57DE;
        kotakbaz.rain.client.render.main.builders.b.f[0x76ED ^ 0x77AB] = 0xFFFFD945 ^ 0x77AB;
        kotakbaz.rain.client.render.main.builders.b.f[0xFDD2 ^ 0xFD97] = 0xFDC7 ^ 0xFD97;
        kotakbaz.rain.client.render.main.builders.b.f[0x2E9 ^ 0x223] = 0x4C30 ^ 0x223;
        kotakbaz.rain.client.render.main.builders.b.f[0x3211 ^ 0x32D8] = 0x7CFC ^ 0x32D8;
        kotakbaz.rain.client.render.main.builders.b.f[0xEA2B ^ 0xEA60] = 0xEA34 ^ 0xEA60;
        kotakbaz.rain.client.render.main.builders.b.f[0x4117 ^ 0x417E] = 0xFFFFBEB5 ^ 0x417E;
        kotakbaz.rain.client.render.main.builders.b.f[0xC76F ^ 0xC736] = 0xC7BC ^ 0xC736;
        kotakbaz.rain.client.render.main.builders.b.f[0x5324 ^ 0x5236] = 0xFFFF8437 ^ 0x5236;
        kotakbaz.rain.client.render.main.builders.b.f[0x1E0B ^ 0x1E73] = 0x1E58 ^ 0x1E73;
        kotakbaz.rain.client.render.main.builders.b.f[0x508D ^ 0x50B5] = 0x46F5 ^ 0x50B5;
        kotakbaz.rain.client.render.main.builders.b.f[0xBC54 ^ 0xBD13] = 0xEC0C ^ 0xBD13;
        kotakbaz.rain.client.render.main.builders.b.f[0x4AE2 ^ 0x4BF9] = 0x8669 ^ 0x4BF9;
        kotakbaz.rain.client.render.main.builders.b.f[0x10AA0 ^ 0x10ADE] = 0x10ADC ^ 0x10ADE;
        kotakbaz.rain.client.render.main.builders.b.f[0xB6CC ^ 0xB678] = 0xCC7 ^ 0xB678;
        kotakbaz.rain.client.render.main.builders.b.f[0xE81 ^ 0xEE7] = 0xFFFFF178 ^ 0xEE7;
        kotakbaz.rain.client.render.main.builders.b.f[0x43AD ^ 0x43B6] = 0xFFFFBCCB ^ 0x43B6;
        kotakbaz.rain.client.render.main.builders.b.f[0x5914 ^ 0x59BC] = 0x8002 ^ 0x59BC;
        kotakbaz.rain.client.render.main.builders.b.f[0x8EDD ^ 0x8EF4] = 0xFFFF7151 ^ 0x8EF4;
        kotakbaz.rain.client.render.main.builders.b.f[0x7C05 ^ 0x7D77] = 0x7D74 ^ 0x7D77;
        kotakbaz.rain.client.render.main.builders.b.f[0xE1EE ^ 0xE126] = 0xAF0C ^ 0xE126;
        kotakbaz.rain.client.render.main.builders.b.f[0x35EB ^ 0x355E] = 0xF3E3 ^ 0x355E;
        kotakbaz.rain.client.render.main.builders.b.f[0xFF46 ^ 0xFE2C] = 0xFE2E ^ 0xFE2C;
        kotakbaz.rain.client.render.main.builders.b.f[0xC867 ^ 0xC86C] = 0xFFFF37BF ^ 0xC86C;
        kotakbaz.rain.client.render.main.builders.b.f[0x2435 ^ 0x24A4] = 0x27BC ^ 0x24A4;
        kotakbaz.rain.client.render.main.builders.b.f[0x2230 ^ 0x2366] = 0xFDEB ^ 0x2366;
        kotakbaz.rain.client.render.main.builders.b.f[0xED7 ^ 0xE89] = 0xFFFFF150 ^ 0xE89;
        kotakbaz.rain.client.render.main.builders.b.f[0x1FF7 ^ 0x1F13] = 0x437 ^ 0x1F13;
        kotakbaz.rain.client.render.main.builders.b.f[0x928F ^ 0x92F6] = 0x92E8 ^ 0x92F6;
        kotakbaz.rain.client.render.main.builders.b.f[0x1B44 ^ 0x1B24] = 0x1B36 ^ 0x1B24;
        kotakbaz.rain.client.render.main.builders.b.f[0x6E62 ^ 0x6F31] = 0x729A ^ 0x6F31;
        kotakbaz.rain.client.render.main.builders.b.f[0x796 ^ 0x76D] = 0x418A ^ 0x76D;
        kotakbaz.rain.client.render.main.builders.b.f[0x27 ^ 0x66] = 0x22E9 ^ 0x66;
        kotakbaz.rain.client.render.main.builders.b.f[0x5746 ^ 0x575E] = 0xFFFFA8DA ^ 0x575E;
        kotakbaz.rain.client.render.main.builders.b.f[0x9493 ^ 0x9413] = 0x9412 ^ 0x9413;
        kotakbaz.rain.client.render.main.builders.b.f[0xEA99 ^ 0xEAD0] = 0xFFFF157A ^ 0xEAD0;
        kotakbaz.rain.client.render.main.builders.b.f[0x28E5 ^ 0x28DF] = 0x5DD ^ 0x28DF;
        kotakbaz.rain.client.render.main.builders.b.f[0xC24D ^ 0xC2B0] = 0x2C88 ^ 0xC2B0;
        kotakbaz.rain.client.render.main.builders.b.f[0xBA5 ^ 0xBA6] = 0xFFFFF46E ^ 0xBA6;
        kotakbaz.rain.client.render.main.builders.b.f[0x6948 ^ 0x6912] = 0x6921 ^ 0x6912;
        kotakbaz.rain.client.render.main.builders.b.f[0xD67B ^ 0xD607] = 0xFFFF29F3 ^ 0xD607;
        kotakbaz.rain.client.render.main.builders.b.f[0x103AE ^ 0x102A3] = 0x1CAAC ^ 0x102A3;
        kotakbaz.rain.client.render.main.builders.b.f[0xE171 ^ 0xE1A8] = 0x3593 ^ 0xE1A8;
        kotakbaz.rain.client.render.main.builders.b.f[0x7178 ^ 0x71EC] = 0x72FF ^ 0x71EC;
        kotakbaz.rain.client.render.main.builders.b.f[0xA7ED ^ 0xA7BA] = 0xA7B9 ^ 0xA7BA;
        kotakbaz.rain.client.render.main.builders.b.f[0x407F ^ 0x40E5] = 0x48EF ^ 0x40E5;
        kotakbaz.rain.client.render.main.builders.b.f[0xBE4C ^ 0xBE23] = 0xFFFF41FA ^ 0xBE23;
        kotakbaz.rain.client.render.main.builders.b.f[0x41CD ^ 0x4182] = 0x4181 ^ 0x4182;
        kotakbaz.rain.client.render.main.builders.b.f[0x97D4 ^ 0x9778] = 0xD9F9 ^ 0x9778;
        kotakbaz.rain.client.render.main.builders.b.f[0xEDA2 ^ 0xEC28] = 0xBB2 ^ 0xEC28;
        kotakbaz.rain.client.render.main.builders.b.f[0x794 ^ 0x761] = 0x4931 ^ 0x761;
        kotakbaz.rain.client.render.main.builders.b.f[0x7D54 ^ 0x7C00] = 0xEFEB ^ 0x7C00;
        kotakbaz.rain.client.render.main.builders.b.f[0xFBB2 ^ 0xFAAC] = 0xFFFF7217 ^ 0xFAAC;
        kotakbaz.rain.client.render.main.builders.b.f[0x2EE ^ 0x3FE] = 0x2A29 ^ 0x3FE;
        kotakbaz.rain.client.render.main.builders.b.f[0x41AC ^ 0x41B3] = 0xFFFFBE74 ^ 0x41B3;
        kotakbaz.rain.client.render.main.builders.b.f[0x4CA6 ^ 0x4C05] = 0xFFFFF30F ^ 0x4C05;
        kotakbaz.rain.client.render.main.builders.b.f[0x90D ^ 0x847] = 0x847 ^ 0x847;
        kotakbaz.rain.client.render.main.builders.b.f[0x5CF6 ^ 0x5DD1] = 0x1DF0 ^ 0x5DD1;
        kotakbaz.rain.client.render.main.builders.b.f[0x5C40 ^ 0x5D58] = 0x90C7 ^ 0x5D58;
        kotakbaz.rain.client.render.main.builders.b.f[0x69C4 ^ 0x68D5] = 0x4113 ^ 0x68D5;
        kotakbaz.rain.client.render.main.builders.b.f[0xA0DF ^ 0xA07E] = 0xE085 ^ 0xA07E;
        kotakbaz.rain.client.render.main.builders.b.f[0x5F44 ^ 0x5E71] = 0x6AC2 ^ 0x5E71;
        kotakbaz.rain.client.render.main.builders.b.f[0x77D8 ^ 0x77D7] = 0x779C ^ 0x77D7;
        kotakbaz.rain.client.render.main.builders.b.f[0x24FB ^ 0x242A] = 0x9D98 ^ 0x242A;
        kotakbaz.rain.client.render.main.builders.b.f[0x28AF ^ 0x2879] = 0xFFFF6559 ^ 0x2879;
        kotakbaz.rain.client.render.main.builders.b.f[0x107E3 ^ 0x106EA] = 0x17407 ^ 0x106EA;
        kotakbaz.rain.client.render.main.builders.b.f[0x93E0 ^ 0x92CF] = 0x7FAD ^ 0x92CF;
        kotakbaz.rain.client.render.main.builders.b.f[0x8B57 ^ 0x8B43] = 0x8B3D ^ 0x8B43;
        kotakbaz.rain.client.render.main.builders.b.f[0x545A ^ 0x5549] = 0x7C8F ^ 0x5549;
        kotakbaz.rain.client.render.main.builders.b.f[0x64E0 ^ 0x64CD] = 0xFFFF9B50 ^ 0x64CD;
        kotakbaz.rain.client.render.main.builders.b.f[0xF1DD ^ 0xF1C4] = 0xF1B0 ^ 0xF1C4;
        kotakbaz.rain.client.render.main.builders.b.f[0xEA2B ^ 0xEA7A] = 0xEA1D ^ 0xEA7A;
        kotakbaz.rain.client.render.main.builders.b.f[0x53F0 ^ 0x538A] = 0xFFFFACD5 ^ 0x538A;
        kotakbaz.rain.client.render.main.builders.b.f[0x8B75 ^ 0x8B63] = 0x8B11 ^ 0x8B63;
        kotakbaz.rain.client.render.main.builders.b.f[0x603 ^ 0x785] = 0x3483 ^ 0x785;
        kotakbaz.rain.client.render.main.builders.b.f[0xEF24 ^ 0xEF26] = 0xFFFF108F ^ 0xEF26;
        kotakbaz.rain.client.render.main.builders.b.f[0x9580 ^ 0x956C] = 0x8B5D ^ 0x956C;
        kotakbaz.rain.client.render.main.builders.b.f[0xC5F9 ^ 0xC4B1] = 0xC4B1 ^ 0xC4B1;
        kotakbaz.rain.client.render.main.builders.b.f[0x5BFD ^ 0x5B43] = 0x3717 ^ 0x5B43;
        kotakbaz.rain.client.render.main.builders.b.f[0x7E71 ^ 0x7FF0] = 0x7FF0 ^ 0x7FF0;
        kotakbaz.rain.client.render.main.builders.b.f[0xF89C ^ 0xF9A2] = 0xFFFE0D1C ^ 0xF9A2;
        kotakbaz.rain.client.render.main.builders.b.f[0x8818 ^ 0x886B] = 0xFFFF77F0 ^ 0x886B;
        kotakbaz.rain.client.render.main.builders.b.f[0x9DB6 ^ 0x9CF8] = 0x311B ^ 0x9CF8;
        kotakbaz.rain.client.render.main.builders.b.f[0x4F70 ^ 0x4F45] = 0x4F45 ^ 0x4F45;
        kotakbaz.rain.client.render.main.builders.b.f[0x953 ^ 0x9C3] = 0x2823 ^ 0x9C3;
        kotakbaz.rain.client.render.main.builders.b.f[0x70CD ^ 0x7066] = 0xFFFFC119 ^ 0x7066;
        kotakbaz.rain.client.render.main.builders.b.f[0xCEDD ^ 0xCFBE] = 0xCFD0 ^ 0xCFBE;
        kotakbaz.rain.client.render.main.builders.b.f[0xF7A9 ^ 0xF69E] = 0xC22D ^ 0xF69E;
        kotakbaz.rain.client.render.main.builders.b.f[0xE626 ^ 0xE6C1] = 0xFDE3 ^ 0xE6C1;
        kotakbaz.rain.client.render.main.builders.b.f[0x912E ^ 0x912E] = 0x917E ^ 0x912E;
        kotakbaz.rain.client.render.main.builders.b.f[0xB387 ^ 0xB3DC] = 0xB3EB ^ 0xB3DC;
        kotakbaz.rain.client.render.main.builders.b.f[0x24C5 ^ 0x2595] = 0x8A3D ^ 0x2595;
        kotakbaz.rain.client.render.main.builders.b.f[0x485E ^ 0x4970] = 0xA40A ^ 0x4970;
        kotakbaz.rain.client.render.main.builders.b.f[0xC754 ^ 0xC674] = 0xC221 ^ 0xC674;
        kotakbaz.rain.client.render.main.builders.b.f[0xA457 ^ 0xA479] = 0xA46F ^ 0xA479;
        kotakbaz.rain.client.render.main.builders.b.f[0x5EA8 ^ 0x5FF3] = 0x4668 ^ 0x5FF3;
        kotakbaz.rain.client.render.main.builders.b.f[0xFB3F ^ 0xFBF1] = 0xFFFF4B11 ^ 0xFBF1;
        kotakbaz.rain.client.render.main.builders.b.f[0x130E ^ 0x1226] = 0x1E18 ^ 0x1226;
        kotakbaz.rain.client.render.main.builders.b.f[0x731 ^ 0x708] = 0x4E29 ^ 0x708;
        kotakbaz.rain.client.render.main.builders.b.f[0xE380 ^ 0xE2B4] = 0xD61F ^ 0xE2B4;
        kotakbaz.rain.client.render.main.builders.b.f[0xE964 ^ 0xE9E0] = 0x4634 ^ 0xE9E0;
        kotakbaz.rain.client.render.main.builders.b.f[0x639 ^ 0x6E1] = 0xD2C7 ^ 0x6E1;
        kotakbaz.rain.client.render.main.builders.b.f[0x515E ^ 0x51D0] = 0x7030 ^ 0x51D0;
        kotakbaz.rain.client.render.main.builders.b.f[0x7844 ^ 0x78C6] = 0x78C6 ^ 0x78C6;
        kotakbaz.rain.client.render.main.builders.b.f[0x10A89 ^ 0x10BE6] = 0xFFFEF41A ^ 0x10BE6;
        kotakbaz.rain.client.render.main.builders.b.f[0xB1BD ^ 0xB085] = 0x1013 ^ 0xB085;
        kotakbaz.rain.client.render.main.builders.b.f[0xBE59 ^ 0xBE3B] = 0xBE0C ^ 0xBE3B;
        kotakbaz.rain.client.render.main.builders.b.f[0x8E0C ^ 0x8E51] = 0xFFFF71CE ^ 0x8E51;
        kotakbaz.rain.client.render.main.builders.b.f[0xDEB7 ^ 0xDF87] = 0x21E0 ^ 0xDF87;
        kotakbaz.rain.client.render.main.builders.b.f[0x52CE ^ 0x529A] = 0x52DF ^ 0x529A;
        kotakbaz.rain.client.render.main.builders.b.f[0xEFB2 ^ 0xEE91] = 0xEAD8 ^ 0xEE91;
        kotakbaz.rain.client.render.main.builders.b.f[0x14F1 ^ 0x14E4] = 0xFFFFEB3D ^ 0x14E4;
        kotakbaz.rain.client.render.main.builders.b.f[0xBA3F ^ 0xBAED] = 0xFFFFFCAB ^ 0xBAED;
        kotakbaz.rain.client.render.main.builders.b.f[0x3F71 ^ 0x3E67] = 0xAFF0 ^ 0x3E67;
        kotakbaz.rain.client.render.main.builders.b.f[0x753A ^ 0x747B] = 0xB00E ^ 0x747B;
        kotakbaz.rain.client.render.main.builders.b.f[0x9EB7 ^ 0x9E0C] = 0xFFFE68A6 ^ 0x9E0C;
        kotakbaz.rain.client.render.main.builders.b.f[0xD765 ^ 0xD7BB] = 0xFFFF7668 ^ 0xD7BB;
        kotakbaz.rain.client.render.main.builders.b.f[0xA0A6 ^ 0xA092] = 0xA090 ^ 0xA092;
        kotakbaz.rain.client.render.main.builders.b.f[0x9ADC ^ 0x9AF3] = 0x9A9E ^ 0x9AF3;
        kotakbaz.rain.client.render.main.builders.b.f[0x1C08 ^ 0x1C96] = 0x15BA ^ 0x1C96;
        kotakbaz.rain.client.render.main.builders.b.f[0xFC1 ^ 0xE43] = 0xE40 ^ 0xE43;
        kotakbaz.rain.client.render.main.builders.b.f[0xF45E ^ 0xF4F1] = 0xFFFE08B9 ^ 0xF4F1;
        kotakbaz.rain.client.render.main.builders.b.f[0xF301 ^ 0xF3DC] = 0xADFC ^ 0xF3DC;
        kotakbaz.rain.client.render.main.builders.b.f[0x7996 ^ 0x79B7] = 0x79BE ^ 0x79B7;
        kotakbaz.rain.client.render.main.builders.b.f[0xEE00 ^ 0xEF70] = 0xEF78 ^ 0xEF70;
        kotakbaz.rain.client.render.main.builders.b.f[0xB8DB ^ 0xB8BE] = 0xB82F ^ 0xB8BE;
        kotakbaz.rain.client.render.main.builders.b.f[0xC41A ^ 0xC492] = 0x7133 ^ 0xC492;
        kotakbaz.rain.client.render.main.builders.b.f[0x1959 ^ 0x1924] = 0x1925 ^ 0x1924;
        kotakbaz.rain.client.render.main.builders.b.f[0xB62D ^ 0xB75E] = 0xFFFF48C7 ^ 0xB75E;
        kotakbaz.rain.client.render.main.builders.b.f[0x74B1 ^ 0x7580] = 0x8BE7 ^ 0x7580;
        kotakbaz.rain.client.render.main.builders.b.f[0x87E8 ^ 0x869C] = 0x869D ^ 0x869C;
        kotakbaz.rain.client.render.main.builders.b.f[0x23A0 ^ 0x22E2] = 0xE6B2 ^ 0x22E2;
        kotakbaz.rain.client.render.main.builders.b.f[0x94A9 ^ 0x95E0] = 0x95E0 ^ 0x95E0;
        kotakbaz.rain.client.render.main.builders.b.f[0x819C ^ 0x815D] = 0xBD43 ^ 0x815D;
        kotakbaz.rain.client.render.main.builders.b.f[0x7AC5 ^ 0x7BA1] = 0x7BA6 ^ 0x7BA1;
        kotakbaz.rain.client.render.main.builders.b.f[0x38D ^ 0x297] = 0xFFFF30BA ^ 0x297;
        kotakbaz.rain.client.render.main.builders.b.f[0xEA55 ^ 0xEA52] = 0xEA73 ^ 0xEA52;
        kotakbaz.rain.client.render.main.builders.b.f[0x10CFD ^ 0x10C3B] = 0x1AE37 ^ 0x10C3B;
        kotakbaz.rain.client.render.main.builders.b.f[0x10308 ^ 0x1024C] = 0x1535E ^ 0x1024C;
        kotakbaz.rain.client.render.main.builders.b.f[0xF274 ^ 0xF233] = 0xFFFF0D14 ^ 0xF233;
        kotakbaz.rain.client.render.main.builders.b.f[0xFBD1 ^ 0xFBCB] = 0xFFFF043A ^ 0xFBCB;
        kotakbaz.rain.client.render.main.builders.b.f[0x398C ^ 0x3801] = 0xC1AD ^ 0x3801;
        kotakbaz.rain.client.render.main.builders.b.f[0xA8C6 ^ 0xA861] = 0x71FC ^ 0xA861;
        kotakbaz.rain.client.render.main.builders.b.f[0xC831 ^ 0xC887] = 0xE36 ^ 0xC887;
        kotakbaz.rain.client.render.main.builders.b.f[0x5AF9 ^ 0x5A36] = 0x154A ^ 0x5A36;
        kotakbaz.rain.client.render.main.builders.b.f[0x355A ^ 0x355C] = 0xFFFFCAA9 ^ 0x355C;
        kotakbaz.rain.client.render.main.builders.b.f[0x1D39 ^ 0x1C64] = 0x1C74 ^ 0x1C64;
        kotakbaz.rain.client.render.main.builders.b.f[0xBFBC ^ 0xBFBD] = 0xFFFF4024 ^ 0xBFBD;
        kotakbaz.rain.client.render.main.builders.b.f[0x99FF ^ 0x9903] = 0x7725 ^ 0x9903;
        kotakbaz.rain.client.render.main.builders.b.f[0x255B ^ 0x25E3] = 0xE352 ^ 0x25E3;
        kotakbaz.rain.client.render.main.builders.b.f[0x4CC2 ^ 0x4CBD] = 0x4CBD ^ 0x4CBD;
        kotakbaz.rain.client.render.main.builders.b.f[0x2B30 ^ 0x2B20] = 0x2B02 ^ 0x2B20;
        kotakbaz.rain.client.render.main.builders.b.f[0xD9A6 ^ 0xD965] = 0xFFFF1AE5 ^ 0xD965;
        kotakbaz.rain.client.render.main.builders.b.f[0xE8FE ^ 0xE8CE] = 0xE8CD ^ 0xE8CE;
        kotakbaz.rain.client.render.main.builders.b.f[0x1081F ^ 0x10889] = 0x168E8 ^ 0x10889;
        kotakbaz.rain.client.render.main.builders.b.f[0x202D ^ 0x2157] = 0x2153 ^ 0x2157;
        kotakbaz.rain.client.render.main.builders.b.f[0x60E4 ^ 0x6029] = 0x2F55 ^ 0x6029;
        kotakbaz.rain.client.render.main.builders.b.f[0x710E ^ 0x700E] = 0x1A81 ^ 0x700E;
        kotakbaz.rain.client.render.main.builders.b.f[0xDDC5 ^ 0xDD05] = 0xB151 ^ 0xDD05;
        kotakbaz.rain.client.render.main.builders.b.f[0xAFB1 ^ 0xAEB7] = 0xFFFF0634 ^ 0xAEB7;
        kotakbaz.rain.client.render.main.builders.b.f[0x950C ^ 0x9473] = 0x9573 ^ 0x9473;
        kotakbaz.rain.client.render.main.builders.b.f[0x73BB ^ 0x73E4] = 0x7378 ^ 0x73E4;
        kotakbaz.rain.client.render.main.builders.b.f[0xA67A ^ 0xA65C] = 0xA650 ^ 0xA65C;
        kotakbaz.rain.client.render.main.builders.b.f[0x6DD0 ^ 0x6C57] = 0x68CF ^ 0x6C57;
        kotakbaz.rain.client.render.main.builders.b.f[0xC15E ^ 0xC027] = 0xC066 ^ 0xC027;
        kotakbaz.rain.client.render.main.builders.b.f[0x340D ^ 0x34EC] = 0xC07D ^ 0x34EC;
        kotakbaz.rain.client.render.main.builders.b.f[0x7F2C ^ 0x7FDB] = 0x318B ^ 0x7FDB;
        kotakbaz.rain.client.render.main.builders.b.f[0x29F7 ^ 0x2928] = 0x7708 ^ 0x2928;
        kotakbaz.rain.client.render.main.builders.b.f[0x232C ^ 0x23D4] = 0x6524 ^ 0x23D4;
        kotakbaz.rain.client.render.main.builders.b.f[0x10B7C ^ 0x10B40] = 0x1131A ^ 0x10B40;
        kotakbaz.rain.client.render.main.builders.b.f[0xD434 ^ 0xD429] = 0xFFFF2BFA ^ 0xD429;
        kotakbaz.rain.client.render.main.builders.b.f[0x32F6 ^ 0x33CC] = 0x930A ^ 0x33CC;
        kotakbaz.rain.client.render.main.builders.b.f[0xCDEF ^ 0xCCD0] = 0x1C79C ^ 0xCCD0;
        kotakbaz.rain.client.render.main.builders.b.f[0xF506 ^ 0xF5F9] = 0x1BC1 ^ 0xF5F9;
        kotakbaz.rain.client.render.main.builders.b.f[0x83BE ^ 0x8285] = 0x221B ^ 0x8285;
        kotakbaz.rain.client.render.main.builders.b.f[0x51CD ^ 0x5169] = 0x119C ^ 0x5169;
        kotakbaz.rain.client.render.main.builders.b.f[0xC0B3 ^ 0xC0DE] = 0xFFFF3F07 ^ 0xC0DE;
        kotakbaz.rain.client.render.main.builders.b.f[0x4ED1 ^ 0x4FCC] = 0x38FC ^ 0x4FCC;
        kotakbaz.rain.client.render.main.builders.b.f[0xA104 ^ 0xA13F] = 0xE999 ^ 0xA13F;
        kotakbaz.rain.client.render.main.builders.b.f[0xBEE1 ^ 0xBFCB] = 0xB3B9 ^ 0xBFCB;
        kotakbaz.rain.client.render.main.builders.b.f[0xAF6 ^ 0xBB6] = 0xCFCF ^ 0xBB6;
        kotakbaz.rain.client.render.main.builders.b.f[0x3C60 ^ 0x3C69] = 0xFFFFC3AF ^ 0x3C69;
        kotakbaz.rain.client.render.main.builders.b.f[0xC1DC ^ 0xC11E] = 0xFD0A ^ 0xC11E;
        kotakbaz.rain.client.render.main.builders.b.f[0x393 ^ 0x2F1] = 0x2FE ^ 0x2F1;
        kotakbaz.rain.client.render.main.builders.b.f[0x62CA ^ 0x6233] = 0x24D4 ^ 0x6233;
        kotakbaz.rain.client.render.main.builders.b.f[0x94BA ^ 0x94F0] = 0x9451 ^ 0x94F0;
        kotakbaz.rain.client.render.main.builders.b.f[0xFE0E ^ 0xFF82] = 0x6639 ^ 0xFF82;
        kotakbaz.rain.client.render.main.builders.b.f[0xC4E3 ^ 0xC4FF] = 0xC4A9 ^ 0xC4FF;
        kotakbaz.rain.client.render.main.builders.b.f[0x6C3A ^ 0x6C30] = 0x6C05 ^ 0x6C30;
        kotakbaz.rain.client.render.main.builders.b.f[0xFDCC ^ 0xFCD3] = 0x8BE3 ^ 0xFCD3;
        kotakbaz.rain.client.render.main.builders.b.f[0xC2D0 ^ 0xC3C4] = 0x522E ^ 0xC3C4;
        kotakbaz.rain.client.render.main.builders.b.f[0x234C ^ 0x224D] = 0x48C8 ^ 0x224D;
        kotakbaz.rain.client.render.main.builders.b.f[0x1D10 ^ 0x1C79] = 0xFFFFE3B9 ^ 0x1C79;
        kotakbaz.rain.client.render.main.builders.b.f[0xA628 ^ 0xA65E] = 0xFFFF59CA ^ 0xA65E;
        kotakbaz.rain.client.render.main.builders.b.f[0xD875 ^ 0xD92F] = 0x4D6 ^ 0xD92F;
        kotakbaz.rain.client.render.main.builders.b.f[0x56F8 ^ 0x568C] = 0xFFFFA927 ^ 0x568C;
        kotakbaz.rain.client.render.main.builders.b.f[0xBD03 ^ 0xBC4E] = 0xBC5C ^ 0xBC4E;
        kotakbaz.rain.client.render.main.builders.b.f[0x32FB ^ 0x33EE] = 0xA20F ^ 0x33EE;
        kotakbaz.rain.client.render.main.builders.b.f[0x161F ^ 0x179A] = 0xD55F ^ 0x179A;
        kotakbaz.rain.client.render.main.builders.b.f[0x674D ^ 0x67F0] = 0xBA0 ^ 0x67F0;
        kotakbaz.rain.client.render.main.builders.b.f[0xDCC2 ^ 0xDC90] = 0xDCC8 ^ 0xDC90;
    }
}

