/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 *  org.apache.commons.lang3.StringUtils
 *  org.lwjgl.opengl.GL20
 */
package kotakbaz.rain.client.render.main.program;

import java.io.Closeable;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.main.D;
import kotakbaz.rain.client.render.main.exceptions.impl.d_0;
import kotakbaz.rain.client.render.main.program.compile.a_0;
import lombok.Generated;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.opengl.GL20;

public class A
implements D,
kotakbaz.rain.client.render.main.A,
Closeable {
    public static A a;
    private final String A;
    private final int b;
    private final HashSet<kotakbaz.rain.client.render.main.program.a_0> B;
    private final HashMap<String, kotakbaz.rain.client.render.main.program.uniform.A> c = new HashMap();
    private final List<kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A> C = new ArrayList<kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A>();
    private int d;
    private int D;
    private final List<kotakbaz.rain.client.render.main.program.uniform.A> e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    public A(String string, int n, HashSet<kotakbaz.rain.client.render.main.program.a_0> hashSet, HashMap<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> hashMap) {
        super();
        int n2 = h[0];
        n2 ^= h[1];
        this.d = n2 -= h[2];
        int n3 = h[3];
        n3 += h[4];
        this.D = n3 += h[5];
        this.e = new ArrayList<kotakbaz.rain.client.render.main.program.uniform.A>();
        this.A = string;
        this.b = n;
        this.B = hashSet;
        for (Map.Entry<String, kotakbaz.rain.client.render.main.program.uniform.a_0<?>> entry : hashMap.entrySet()) {
            kotakbaz.rain.client.render.main.program.uniform.A a2 = (kotakbaz.rain.client.render.main.program.uniform.A)entry.getValue().uniformCreator().apply((Object)entry.getKey(), (Object)GL20.glGetUniformLocation((int)this.b, (CharSequence)entry.getKey()), (Object)this);
            int n4 = h[6];
            if (a2.getLocation() == (n4 -= h[7]) && !(a2 instanceof kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0)) {
                kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new d_0(a2.getName(), this.A));
            }
            this.c.put(entry.getKey(), a2);
            if (!(a2 instanceof kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A)) continue;
            kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A a3 = (kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A)a2;
            this.C.add(a3);
        }
    }

    @Override
    public kotakbaz.rain.client.render.main.program.compile.A getCompileResult() {
        a_0 a_02;
        int n = h[8];
        n += h[9];
        return new kotakbaz.rain.client.render.main.program.compile.A(a_02, (a_02 = a_0.fromStatusId(GL20.glGetProgrami((int)this.getId(), (int)(n -= h[10])))) == a_0.A ? StringUtils.trim((String)GL20.glGetProgramInfoLog((int)this.getId())) : "");
    }

    @Override
    public void close() {
        this.c.values().forEach(kotakbaz.rain.client.render.main.program.uniform.A::close);
        GL20.glDeleteProgram((int)this.getId());
        this.e.clear();
        this.c.clear();
        this.C.clear();
    }

    @Override
    public void bind() {
        GL20.glUseProgram((int)this.getId());
        a = this;
        if (!this.e.isEmpty()) {
            for (kotakbaz.rain.client.render.main.program.uniform.A a2 : this.e) {
                a2.upload();
            }
            this.e.clear();
        }
    }

    @Override
    public void unbind() {
        if (a == this) {
            int n = h[11];
            n ^= h[12];
            GL20.glUseProgram((int)(n += h[13]));
        }
        a = null;
    }

    public void addUpdatedUniform(kotakbaz.rain.client.render.main.program.uniform.A a2) {
        this.e.add(a2);
    }

    public <T extends kotakbaz.rain.client.render.main.program.uniform.A> T getUniform(String string, kotakbaz.rain.client.render.main.program.uniform.a_0<T> a_02) {
        T t2 = this.getUniformNullable(string, a_02);
        if (t2 == null) {
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new d_0(string, this.A));
        }
        return t2;
    }

    public <T extends kotakbaz.rain.client.render.main.program.uniform.A> void consumeIfUniformPresent(String string, kotakbaz.rain.client.render.main.program.uniform.a_0<T> a_02, Consumer<T> consumer) {
        T t2 = this.getUniformNullable(string, a_02);
        if (t2 != null) {
            consumer.accept(t2);
        }
    }

    public <T extends kotakbaz.rain.client.render.main.program.uniform.A> T getUniformNullable(String string, kotakbaz.rain.client.render.main.program.uniform.a_0<T> a_02) {
        return (T)this.c.get(string);
    }

    public kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A getSampler(int n) {
        long l = -831344496348933641L;
        kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A a2 = this.getSamplerNullable(n);
        if (a2 == null) {
            int n2 = h[14];
            n2 -= h[15];
            long l2 = l;
            int n3 = h[17];
            n3 ^= h[18];
            l = l2 ^ ((long)n << (n2 ^= h[16]) ^ l2) & -1L << (n3 ^= h[19]);
            int n4 = h[20];
            n4 += h[21];
            int n5 = h[23];
            n5 -= h[24];
            int n6 = h[26];
            n6 -= h[27];
            kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new d_0((String)E[n4 += h[22]] + (int)(l >>> (n5 -= h[25])) + (String)E[n6 ^= h[28]], this.A));
        }
        return a2;
    }

    public void consumerIfSamplerPresent(int n, Consumer<kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A> consumer) {
        kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A a2 = this.getSamplerNullable(n);
        if (a2 != null) {
            consumer.accept(a2);
        }
    }

    public kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A getSamplerNullable(int n) {
        return this.C.get(n);
    }

    @Generated
    public String getName() {
        return this.A;
    }

    @Generated
    public int getId() {
        return this.b;
    }

    @Generated
    public HashSet<kotakbaz.rain.client.render.main.program.a_0> getSnippets() {
        return this.B;
    }

    @Generated
    public void setSamplersAmount(int n) {
        this.d = n;
    }

    @Generated
    public int getSamplersAmount() {
        return this.d;
    }

    @Generated
    public void setBuffersIndexAmount(int n) {
        this.D = n;
    }

    @Generated
    public int getBuffersIndexAmount() {
        return this.D;
    }

    static {
        kotakbaz.rain.client.render.main.program.A.b();
        long l = 3417457076664362293L;
        long l2 = -3811936916443107310L;
        long l3 = -2819552034983043870L;
        long l4 = 4480414125862405459L;
        long l5 = -5965160274756261199L;
        long l6 = 573359749881871745L;
        long l7 = -416355220922924810L;
        long l8 = 3733856560515579408L;
        long l9 = -8378441353141054619L;
        long l10 = -4162989534859589157L;
        long l11 = -5615482007196302360L;
        long l12 = 4503526655674477584L;
        long l13 = 5214212259670214834L;
        long l14 = -3007439018417021334L;
        int n = h[29];
        n -= h[30];
        E = new Object[n += h[31]];
        long l15 = l14;
        int n2 = h[32];
        n2 -= h[33];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= h[34]);
        Object[] objectArray = new Object[h[35]];
        objectArray[kotakbaz.rain.client.render.main.program.A.h[36]] = f;
        objectArray[kotakbaz.rain.client.render.main.program.A.h[37]] = h[38];
        int n3 = h[39];
        Object object = kotakbaz.rain.client.render.main.program.A.A()[h[40]];
        if (object == null) {
            char[] cArray = "\u0281\uf26f\uf275\uf275\ufa5c\ufa56\u0281\u02bc\uf240\ufa5d\u0282\uf24d\ufa5e\u02a3\uf26a\u02bc\ufa50\uf275\ufa45\ufa55\uf267\uf240\uf276\ufa54\uf267\ufa5b\u02b5\ufa51\ufa47\u02a0\uf26f\u0280\u02a3\u02bd\ufa5c\ufa4a\u02a3\uf24d\u02bb\u0280\uf275\ufa44\ufa49\u02b9".toCharArray();
            for (int i = h[41]; i < h[42]; ++i) {
                int n4 = cArray[i];
                n4 += h[43];
                n4 += h[44];
                n4 ^= h[45];
                n4 += h[46];
                n4 ^= h[47];
                n4 -= h[48];
                n4 -= h[49];
                n4 -= h[50];
                n4 += h[51];
                n4 -= h[52];
                n4 ^= h[53];
                n4 += h[54];
                cArray[i] = (char)(n4 ^= h[55]);
            }
            object = kotakbaz.rain.client.render.main.program.A.A()[kotakbaz.rain.client.render.main.program.A.h[56]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.main.program.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = h[57];
        n5 += h[58];
        l5 = l16 ^ (0xD00000000L ^ l16) & -1L << (n5 += h[59]);
        long l17 = l12;
        int n6 = h[60];
        n6 += h[61];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += h[62]);
        while (true) {
            int n7 = h[63];
            n7 += h[64];
            if ((int)l12 >= (int)(l5 >>> (n7 += h[65]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = h[66];
            n9 += h[67];
            int n10 = h[69];
            n10 += h[70];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= h[68])) & -1L >>> (n10 ^= h[71]);
            long l19 = l8;
            int n11 = h[72];
            n11 ^= h[73];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= h[74]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = h[75];
            n13 -= h[76];
            int n14 = h[78];
            n14 += h[79];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= h[77])) & -1L >>> (n14 ^= h[80]);
            int n15 = h[81];
            n15 -= h[82];
            long l21 = l9;
            int n16 = h[84];
            n16 += h[85];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= h[83]) ^ l21) & -1L << (n16 ^= h[86]);
            int n17 = h[87];
            n17 += h[88];
            n17 += h[89];
            int n18 = h[90];
            n18 ^= h[91];
            long l22 = l11;
            int n19 = h[93];
            n19 -= h[94];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= h[92]))) ^ l22) & -1L >>> (n19 ^= h[95]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = h[96];
            n20 += h[97];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= h[98]);
            while (true) {
                int n21 = h[99];
                n21 -= h[100];
                if ((int)(l13 >>> (n21 ^= h[101])) >= (int)l11) break;
                int n22 = h[102];
                n22 += h[103];
                int n23 = h[105];
                n23 -= h[106];
                cArray2[(int)(l13 >>> (n22 += kotakbaz.rain.client.render.main.program.A.h[104]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= h[107]))];
                l13 += 0x100000000L;
            }
            int n24 = h[108];
            n24 += h[109];
            int n25 = (int)(l14 >>> (n24 -= h[110]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.render.main.program.A.E[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = h[111];
            n26 += h[112];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += h[113]);
        }
        a = null;
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[h[114]];
        String string = (String)object[h[115]];
        object = object[h[116]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[117]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[118]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[120] ^ h[121]];
                byArray[kotakbaz.rain.client.render.main.program.A.h[122] ^ kotakbaz.rain.client.render.main.program.A.h[123]] = h[124] ^ h[125];
                byArray[kotakbaz.rain.client.render.main.program.A.h[126] ^ kotakbaz.rain.client.render.main.program.A.h[127]] = h[128] ^ h[129];
                byArray[kotakbaz.rain.client.render.main.program.A.h[130] ^ kotakbaz.rain.client.render.main.program.A.h[131]] = h[132] ^ h[133];
                byArray[kotakbaz.rain.client.render.main.program.A.h[134] ^ kotakbaz.rain.client.render.main.program.A.h[135]] = h[136] ^ h[137];
                byArray[kotakbaz.rain.client.render.main.program.A.h[138] ^ kotakbaz.rain.client.render.main.program.A.h[139]] = h[140] ^ h[141];
                byArray[kotakbaz.rain.client.render.main.program.A.h[142] ^ kotakbaz.rain.client.render.main.program.A.h[143]] = h[144] ^ h[145];
                byArray[kotakbaz.rain.client.render.main.program.A.h[146] ^ kotakbaz.rain.client.render.main.program.A.h[147]] = h[148] ^ h[149];
                byArray[kotakbaz.rain.client.render.main.program.A.h[150] ^ kotakbaz.rain.client.render.main.program.A.h[151]] = h[152] ^ h[153];
                byArray[kotakbaz.rain.client.render.main.program.A.h[154] ^ kotakbaz.rain.client.render.main.program.A.h[155]] = h[156] ^ h[157];
                byArray[kotakbaz.rain.client.render.main.program.A.h[158] ^ kotakbaz.rain.client.render.main.program.A.h[159]] = h[160] ^ h[161];
                byArray[kotakbaz.rain.client.render.main.program.A.h[162] ^ kotakbaz.rain.client.render.main.program.A.h[163]] = h[164] ^ h[165];
                byArray[kotakbaz.rain.client.render.main.program.A.h[166] ^ kotakbaz.rain.client.render.main.program.A.h[167]] = h[168] ^ h[169];
                byArray[kotakbaz.rain.client.render.main.program.A.h[170] ^ kotakbaz.rain.client.render.main.program.A.h[171]] = h[172] ^ h[173];
                byArray[kotakbaz.rain.client.render.main.program.A.h[174] ^ kotakbaz.rain.client.render.main.program.A.h[175]] = h[176] ^ h[177];
                byArray[kotakbaz.rain.client.render.main.program.A.h[178] ^ kotakbaz.rain.client.render.main.program.A.h[179]] = h[180] ^ h[181];
                byArray[kotakbaz.rain.client.render.main.program.A.h[182] ^ kotakbaz.rain.client.render.main.program.A.h[183]] = h[184] ^ h[185];
                objectArray2[kotakbaz.rain.client.render.main.program.A.h[119]] = byArray;
            }
            byte[] byArray = (byte[])object3[h[186]];
            if (F == null) {
                byte[] byArray2 = new byte[h[187] ^ h[188]];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[189] ^ kotakbaz.rain.client.render.main.program.A.h[190]] = h[191] ^ h[192];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[193] ^ kotakbaz.rain.client.render.main.program.A.h[194]] = h[195] ^ h[196];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[197] ^ kotakbaz.rain.client.render.main.program.A.h[198]] = h[199] ^ h[200];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[201] ^ kotakbaz.rain.client.render.main.program.A.h[202]] = h[203] ^ h[204];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[205] ^ kotakbaz.rain.client.render.main.program.A.h[206]] = h[207] ^ h[208];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[209] ^ kotakbaz.rain.client.render.main.program.A.h[210]] = h[211] ^ h[212];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[213] ^ kotakbaz.rain.client.render.main.program.A.h[214]] = h[215] ^ h[216];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[217] ^ kotakbaz.rain.client.render.main.program.A.h[218]] = h[219] ^ h[220];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[221] ^ kotakbaz.rain.client.render.main.program.A.h[222]] = h[223] ^ h[224];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[225] ^ kotakbaz.rain.client.render.main.program.A.h[226]] = h[227] ^ h[228];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[229] ^ kotakbaz.rain.client.render.main.program.A.h[230]] = h[231] ^ h[232];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[233] ^ kotakbaz.rain.client.render.main.program.A.h[234]] = h[235] ^ h[236];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[237] ^ kotakbaz.rain.client.render.main.program.A.h[238]] = h[239] ^ h[240];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[241] ^ kotakbaz.rain.client.render.main.program.A.h[242]] = h[243] ^ h[244];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[245] ^ kotakbaz.rain.client.render.main.program.A.h[246]] = h[247] ^ h[248];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[249] ^ kotakbaz.rain.client.render.main.program.A.h[250]] = h[251] ^ h[252];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[253] ^ kotakbaz.rain.client.render.main.program.A.h[254]] = h[255] ^ h[256];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[257] ^ kotakbaz.rain.client.render.main.program.A.h[258]] = h[259] ^ h[260];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[261] ^ kotakbaz.rain.client.render.main.program.A.h[262]] = h[263] ^ h[264];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[265] ^ kotakbaz.rain.client.render.main.program.A.h[266]] = h[267] ^ h[268];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[269] ^ kotakbaz.rain.client.render.main.program.A.h[270]] = h[271] ^ h[272];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[273] ^ kotakbaz.rain.client.render.main.program.A.h[274]] = h[275] ^ h[276];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[277] ^ kotakbaz.rain.client.render.main.program.A.h[278]] = h[279] ^ h[280];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[281] ^ kotakbaz.rain.client.render.main.program.A.h[282]] = h[283] ^ h[284];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[285] ^ kotakbaz.rain.client.render.main.program.A.h[286]] = h[287] ^ h[288];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[289] ^ kotakbaz.rain.client.render.main.program.A.h[290]] = h[291] ^ h[292];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[293] ^ kotakbaz.rain.client.render.main.program.A.h[294]] = h[295] ^ h[296];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[297] ^ kotakbaz.rain.client.render.main.program.A.h[298]] = h[299] ^ h[300];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[301] ^ kotakbaz.rain.client.render.main.program.A.h[302]] = h[303] ^ h[304];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[305] ^ kotakbaz.rain.client.render.main.program.A.h[306]] = h[307] ^ h[308];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[309] ^ kotakbaz.rain.client.render.main.program.A.h[310]] = h[311] ^ h[312];
                byArray2[kotakbaz.rain.client.render.main.program.A.h[313] ^ kotakbaz.rain.client.render.main.program.A.h[314]] = h[315] ^ h[316];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, h[317], byArray3, h[318], byArray.length);
                System.arraycopy(byArray2, h[319], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.main.program.A.A()[h[320]];
                if (object4 == null) {
                    char[] cArray = "\u42a9\u43bb\u42bc\u43c5\u43c7\u438b\u42a0\u42d2\u42d5\u42d1\u42b1\u42de\u42da\u41e4\u42b4\u42b1\u43ba\u438a".toCharArray();
                    for (int i = h[321]; i < h[322]; ++i) {
                        int n2 = cArray[i];
                        n2 += h[323];
                        n2 ^= h[324];
                        n2 ^= h[325];
                        n2 += h[326];
                        n2 -= h[327];
                        n2 -= h[328];
                        n2 += h[329];
                        n2 ^= h[330];
                        n2 ^= h[331];
                        n2 -= h[332];
                        n2 ^= h[333];
                        n2 ^= h[334];
                        n2 ^= h[335];
                        n2 -= h[336];
                        n2 -= h[337];
                        cArray[i] = (char)(n2 += h[338]);
                    }
                    object4 = kotakbaz.rain.client.render.main.program.A.A()[kotakbaz.rain.client.render.main.program.A.h[339]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[h[340]];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[341]] = h[342];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[343]] = h[344];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[345]] = h[346];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[347]] = h[348];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[349]] = h[350];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[351]] = h[352];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[353]] = h[354];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[355]] = h[356];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[357]] = h[358];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[359]] = h[360];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[361]] = h[362];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[363]] = h[364];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[365]] = h[366];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[367]] = h[368];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[369]] = h[370];
                byArray4[kotakbaz.rain.client.render.main.program.A.h[371]] = h[372];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, h[373], h[374]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.main.program.A.A()[h[375]];
                if (object5 == null) {
                    char[] cArray = "\u921e\u9232\u9230".toCharArray();
                    for (int i = h[376]; i < h[377]; ++i) {
                        int n3 = cArray[i];
                        n3 ^= h[378];
                        n3 -= h[379];
                        n3 ^= h[380];
                        n3 ^= h[381];
                        n3 ^= h[382];
                        n3 -= h[383];
                        n3 -= h[384];
                        n3 += h[385];
                        n3 ^= h[386];
                        n3 ^= h[387];
                        n3 += h[388];
                        cArray[i] = (char)(n3 ^= h[389]);
                    }
                    object5 = kotakbaz.rain.client.render.main.program.A.A()[kotakbaz.rain.client.render.main.program.A.h[390]] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, h[391], h[392]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, h[393], byArray6.length);
            Object object6 = kotakbaz.rain.client.render.main.program.A.A()[h[394]];
            if (object6 == null) {
                char[] cArray = "\uc908\uc904\uc8f2\uc916\uc902\uc907\uc902\uc916\uc8f5\uc8fa\uc902\uc8f2\uc914\uc8f5\uc8e8\uc961\uc961\uc960\uc95b\uc95e".toCharArray();
                for (int i = h[395]; i < h[396]; ++i) {
                    int n4 = cArray[i];
                    n4 += h[397];
                    n4 += h[398];
                    n4 -= h[399];
                    n4 -= 53383;
                    n4 -= 42827;
                    n4 += 28368;
                    n4 -= 57618;
                    n4 -= 7892;
                    n4 -= 12247;
                    n4 += 61113;
                    n4 += 27453;
                    n4 -= 44765;
                    n4 ^= 0x52BD;
                    n4 -= 55326;
                    cArray[i] = (char)(n4 -= 53183);
                }
                object6 = kotakbaz.rain.client.render.main.program.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)F), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = G;
        if (G == null) {
            G = new Object[4];
            objectArray = G;
        }
        return objectArray;
    }

    public static void b() {
        h = new int[0xC8F1 ^ 0xC961];
        kotakbaz.rain.client.render.main.program.A.h[0x30E0 ^ 0x30E1] = 0x30F5 ^ 0x30E1;
        kotakbaz.rain.client.render.main.program.A.h[0xF2B2 ^ 0xF2C5] = 0xF2C5 ^ 0xF2C5;
        kotakbaz.rain.client.render.main.program.A.h[0xE7FE ^ 0xE6CB] = 0x130A ^ 0xE6CB;
        kotakbaz.rain.client.render.main.program.A.h[0x10504 ^ 0x10534] = 0x1EB1E ^ 0x10534;
        kotakbaz.rain.client.render.main.program.A.h[0xFCCB ^ 0xFDF5] = 0xFDF5 ^ 0xFDF5;
        kotakbaz.rain.client.render.main.program.A.h[0xF205 ^ 0xF22A] = 0x7623 ^ 0xF22A;
        kotakbaz.rain.client.render.main.program.A.h[0xFCC4 ^ 0xFDFB] = 0xFDFB ^ 0xFDFB;
        kotakbaz.rain.client.render.main.program.A.h[0x66EE ^ 0x66CD] = 0x66CE ^ 0x66CD;
        kotakbaz.rain.client.render.main.program.A.h[0x1509 ^ 0x1469] = 0xFFFFEBCA ^ 0x1469;
        kotakbaz.rain.client.render.main.program.A.h[0xD9B0 ^ 0xD9C9] = 0x7A30 ^ 0xD9C9;
        kotakbaz.rain.client.render.main.program.A.h[0xA06A ^ 0xA122] = 0x230D ^ 0xA122;
        kotakbaz.rain.client.render.main.program.A.h[0xAB7F ^ 0xAB69] = 0xFFFF54F9 ^ 0xAB69;
        kotakbaz.rain.client.render.main.program.A.h[0xD183 ^ 0xD18B] = 0x5A36 ^ 0xD18B;
        kotakbaz.rain.client.render.main.program.A.h[0xA58F ^ 0xA545] = 0x3581 ^ 0xA545;
        kotakbaz.rain.client.render.main.program.A.h[0xA3EE ^ 0xA37A] = 0xFFFFEF73 ^ 0xA37A;
        kotakbaz.rain.client.render.main.program.A.h[0xA43B ^ 0xA57A] = 0xA57A ^ 0xA57A;
        kotakbaz.rain.client.render.main.program.A.h[0x529D ^ 0x538B] = 0x517C ^ 0x538B;
        kotakbaz.rain.client.render.main.program.A.h[0x10BA5 ^ 0x10A80] = 0x13BB7 ^ 0x10A80;
        kotakbaz.rain.client.render.main.program.A.h[0x2F42 ^ 0x2E4A] = 0xE633 ^ 0x2E4A;
        kotakbaz.rain.client.render.main.program.A.h[0x2FED ^ 0x2E82] = 0x2E8E ^ 0x2E82;
        kotakbaz.rain.client.render.main.program.A.h[0x10736 ^ 0x10666] = 0x1709C ^ 0x10666;
        kotakbaz.rain.client.render.main.program.A.h[0x45F6 ^ 0x44FD] = 0x3655 ^ 0x44FD;
        kotakbaz.rain.client.render.main.program.A.h[0x10CD3 ^ 0x10C29] = 0x1258A ^ 0x10C29;
        kotakbaz.rain.client.render.main.program.A.h[0x186E ^ 0x18AA] = 0x313A ^ 0x18AA;
        kotakbaz.rain.client.render.main.program.A.h[0x189 ^ 0x194] = 0x190 ^ 0x194;
        kotakbaz.rain.client.render.main.program.A.h[0xEA33 ^ 0xEAD4] = 0xFFFF29E5 ^ 0xEAD4;
        kotakbaz.rain.client.render.main.program.A.h[0x54D1 ^ 0x5466] = 0x7FD3 ^ 0x5466;
        kotakbaz.rain.client.render.main.program.A.h[0x6121 ^ 0x6192] = 0xCB2F ^ 0x6192;
        kotakbaz.rain.client.render.main.program.A.h[0x879A ^ 0x87DF] = 0xFFFF786B ^ 0x87DF;
        kotakbaz.rain.client.render.main.program.A.h[0xDA20 ^ 0xDA32] = 0xFFFF25B4 ^ 0xDA32;
        kotakbaz.rain.client.render.main.program.A.h[0xC400 ^ 0xC52D] = 0xF084 ^ 0xC52D;
        kotakbaz.rain.client.render.main.program.A.h[0x2CE7 ^ 0x2DEB] = 0x5F1F ^ 0x2DEB;
        kotakbaz.rain.client.render.main.program.A.h[0x10DEF ^ 0x10CF7] = 0x10E00 ^ 0x10CF7;
        kotakbaz.rain.client.render.main.program.A.h[0x5B33 ^ 0x5A31] = 0xAA4C ^ 0x5A31;
        kotakbaz.rain.client.render.main.program.A.h[0x10F97 ^ 0x10F26] = 0x198A9 ^ 0x10F26;
        kotakbaz.rain.client.render.main.program.A.h[0xE3DF ^ 0xE254] = 0xE254 ^ 0xE254;
        kotakbaz.rain.client.render.main.program.A.h[0x3AA8 ^ 0x3ABC] = 0x3AB7 ^ 0x3ABC;
        kotakbaz.rain.client.render.main.program.A.h[0x8DBE ^ 0x8D0B] = 0x27B6 ^ 0x8D0B;
        kotakbaz.rain.client.render.main.program.A.h[0x6B6C ^ 0x6B2B] = 0xFFFF94ED ^ 0x6B2B;
        kotakbaz.rain.client.render.main.program.A.h[0x546D ^ 0x547C] = 0x547A ^ 0x547C;
        kotakbaz.rain.client.render.main.program.A.h[0x109FF ^ 0x108BB] = 0x1CC39 ^ 0x108BB;
        kotakbaz.rain.client.render.main.program.A.h[0xA662 ^ 0xA761] = 0x5710 ^ 0xA761;
        kotakbaz.rain.client.render.main.program.A.h[0xC7BD ^ 0xC63F] = 0x8534 ^ 0xC63F;
        kotakbaz.rain.client.render.main.program.A.h[0xE3CD ^ 0xE240] = 0x2D21 ^ 0xE240;
        kotakbaz.rain.client.render.main.program.A.h[0xD1E0 ^ 0xD11C] = 0xF8BF ^ 0xD11C;
        kotakbaz.rain.client.render.main.program.A.h[0x19D3 ^ 0x19E2] = 0x49CF ^ 0x19E2;
        kotakbaz.rain.client.render.main.program.A.h[0x91C5 ^ 0x90D2] = 0x9242 ^ 0x90D2;
        kotakbaz.rain.client.render.main.program.A.h[0xCF8D ^ 0xCEB6] = 0x2936 ^ 0xCEB6;
        kotakbaz.rain.client.render.main.program.A.h[0xF07 ^ 0xF01] = 0xFFFFF09F ^ 0xF01;
        kotakbaz.rain.client.render.main.program.A.h[0xA5B6 ^ 0xA588] = 0xA5EF ^ 0xA588;
        kotakbaz.rain.client.render.main.program.A.h[0x6B07 ^ 0x6B20] = 0x6B22 ^ 0x6B20;
        kotakbaz.rain.client.render.main.program.A.h[0xF937 ^ 0xF96C] = 0xF957 ^ 0xF96C;
        kotakbaz.rain.client.render.main.program.A.h[0xEF6F ^ 0xEE56] = 0x993 ^ 0xEE56;
        kotakbaz.rain.client.render.main.program.A.h[0x6777 ^ 0x6706] = 0xFFFF98D7 ^ 0x6706;
        kotakbaz.rain.client.render.main.program.A.h[0xC93B ^ 0xC9F4] = 0xCCC7 ^ 0xC9F4;
        kotakbaz.rain.client.render.main.program.A.h[0x3B47 ^ 0x3BC4] = 0x8C19 ^ 0x3BC4;
        kotakbaz.rain.client.render.main.program.A.h[0xC87E ^ 0xC877] = 0xFFFF37F9 ^ 0xC877;
        kotakbaz.rain.client.render.main.program.A.h[0x229A ^ 0x2224] = 0xFDBA ^ 0x2224;
        kotakbaz.rain.client.render.main.program.A.h[0xB119 ^ 0xB053] = 0xEE07 ^ 0xB053;
        kotakbaz.rain.client.render.main.program.A.h[0xAEE4 ^ 0xAEE6] = 0xFFFF5161 ^ 0xAEE6;
        kotakbaz.rain.client.render.main.program.A.h[0x992A ^ 0x9876] = 0x9832 ^ 0x9876;
        kotakbaz.rain.client.render.main.program.A.h[0x9D0C ^ 0x9C54] = 0xFFFF63BA ^ 0x9C54;
        kotakbaz.rain.client.render.main.program.A.h[0xB355 ^ 0xB313] = 0xB321 ^ 0xB313;
        kotakbaz.rain.client.render.main.program.A.h[0x6159 ^ 0x61F4] = 0x2752 ^ 0x61F4;
        kotakbaz.rain.client.render.main.program.A.h[0x3052 ^ 0x3032] = 0xFFFFCF6B ^ 0x3032;
        kotakbaz.rain.client.render.main.program.A.h[0x14A0 ^ 0x149D] = 0x149D ^ 0x149D;
        kotakbaz.rain.client.render.main.program.A.h[0x26D0 ^ 0x27C2] = 0x6478 ^ 0x27C2;
        kotakbaz.rain.client.render.main.program.A.h[0x553E ^ 0x5420] = 0x4746 ^ 0x5420;
        kotakbaz.rain.client.render.main.program.A.h[0x5226 ^ 0x52D0] = 0x6AF8 ^ 0x52D0;
        kotakbaz.rain.client.render.main.program.A.h[0x703E ^ 0x716D] = 0x716C ^ 0x716D;
        kotakbaz.rain.client.render.main.program.A.h[0x3D51 ^ 0x3D86] = 0x3A38 ^ 0x3D86;
        kotakbaz.rain.client.render.main.program.A.h[0xD569 ^ 0xD59D] = 0xD49B ^ 0xD59D;
        kotakbaz.rain.client.render.main.program.A.h[0x8A6A ^ 0x8A2B] = 0xFFFF7593 ^ 0x8A2B;
        kotakbaz.rain.client.render.main.program.A.h[0x8B29 ^ 0x8AA7] = 0x42A4 ^ 0x8AA7;
        kotakbaz.rain.client.render.main.program.A.h[0x28ED ^ 0x29E8] = 0xE199 ^ 0x29E8;
        kotakbaz.rain.client.render.main.program.A.h[0xA756 ^ 0xA748] = 0xFFFF58CF ^ 0xA748;
        kotakbaz.rain.client.render.main.program.A.h[0x4521 ^ 0x444D] = 0xFFFFBB99 ^ 0x444D;
        kotakbaz.rain.client.render.main.program.A.h[0x266E ^ 0x2652] = 0xFFFFD9EB ^ 0x2652;
        kotakbaz.rain.client.render.main.program.A.h[0x8083 ^ 0x819C] = 0xFFFF6D1B ^ 0x819C;
        kotakbaz.rain.client.render.main.program.A.h[0x8C4D ^ 0x8C95] = 0x8B0C ^ 0x8C95;
        kotakbaz.rain.client.render.main.program.A.h[0x10B4 ^ 0x11C8] = 0xAB1E ^ 0x11C8;
        kotakbaz.rain.client.render.main.program.A.h[0x46F2 ^ 0x464A] = 0x6DF7 ^ 0x464A;
        kotakbaz.rain.client.render.main.program.A.h[0x100CF ^ 0x100D3] = 0xFFFEFF20 ^ 0x100D3;
        kotakbaz.rain.client.render.main.program.A.h[0x8AA5 ^ 0x8AA0] = 0xFFFF7535 ^ 0x8AA0;
        kotakbaz.rain.client.render.main.program.A.h[0x1818 ^ 0x1836] = 0x27F2 ^ 0x1836;
        kotakbaz.rain.client.render.main.program.A.h[0x4F83 ^ 0x4E85] = 0x86FC ^ 0x4E85;
        kotakbaz.rain.client.render.main.program.A.h[0x3AC1 ^ 0x3AE0] = 0xFFFFC563 ^ 0x3AE0;
        kotakbaz.rain.client.render.main.program.A.h[0x74C1 ^ 0x75AB] = 0x75FA ^ 0x75AB;
        kotakbaz.rain.client.render.main.program.A.h[0x5A53 ^ 0x5A1E] = 0x5A23 ^ 0x5A1E;
        kotakbaz.rain.client.render.main.program.A.h[0x8E7B ^ 0x8E88] = 0xFFFF7019 ^ 0x8E88;
        kotakbaz.rain.client.render.main.program.A.h[0xE9CE ^ 0xE94F] = 0x845E ^ 0xE94F;
        kotakbaz.rain.client.render.main.program.A.h[0x623B ^ 0x628B] = 0xFFFF0A8D ^ 0x628B;
        kotakbaz.rain.client.render.main.program.A.h[0xA96E ^ 0xA945] = 0x8BA5 ^ 0xA945;
        kotakbaz.rain.client.render.main.program.A.h[0x10888 ^ 0x108BA] = 0x109AB ^ 0x108BA;
        kotakbaz.rain.client.render.main.program.A.h[0x88A6 ^ 0x8893] = 0x336A ^ 0x8893;
        kotakbaz.rain.client.render.main.program.A.h[0x3DC5 ^ 0x3DF6] = 0x4C5 ^ 0x3DF6;
        kotakbaz.rain.client.render.main.program.A.h[0xB95C ^ 0xB9E1] = 0x6661 ^ 0xB9E1;
        kotakbaz.rain.client.render.main.program.A.h[0x5C51 ^ 0x5C34] = 0xFFFFA3E9 ^ 0x5C34;
        kotakbaz.rain.client.render.main.program.A.h[0x62ED ^ 0x62F7] = 0xFFFF9D8B ^ 0x62F7;
        kotakbaz.rain.client.render.main.program.A.h[0x104F8 ^ 0x1040A] = 0x1050C ^ 0x1040A;
        kotakbaz.rain.client.render.main.program.A.h[0xF16D ^ 0xF19C] = 0xF097 ^ 0xF19C;
        kotakbaz.rain.client.render.main.program.A.h[0x46A9 ^ 0x478D] = 0x5AEC ^ 0x478D;
        kotakbaz.rain.client.render.main.program.A.h[0x9659 ^ 0x97D5] = 0x97C1 ^ 0x97D5;
        kotakbaz.rain.client.render.main.program.A.h[0x8CB1 ^ 0x8DD9] = 0xFFFF7250 ^ 0x8DD9;
        kotakbaz.rain.client.render.main.program.A.h[0xFA83 ^ 0xFA60] = 0x78CC ^ 0xFA60;
        kotakbaz.rain.client.render.main.program.A.h[0x1421 ^ 0x1403] = 0x147E ^ 0x1403;
        kotakbaz.rain.client.render.main.program.A.h[0xB4DF ^ 0xB456] = 0x7DD4 ^ 0xB456;
        kotakbaz.rain.client.render.main.program.A.h[0x4E70 ^ 0x4E2C] = 0xFFFFB18E ^ 0x4E2C;
        kotakbaz.rain.client.render.main.program.A.h[0x166E ^ 0x176E] = 0xE96E ^ 0x176E;
        kotakbaz.rain.client.render.main.program.A.h[0xEBEA ^ 0xEB50] = 0xEB50 ^ 0xEB50;
        kotakbaz.rain.client.render.main.program.A.h[0xD042 ^ 0xD1C3] = 0xC2DA ^ 0xD1C3;
        kotakbaz.rain.client.render.main.program.A.h[0xD02B ^ 0xD0E8] = 0xF95F ^ 0xD0E8;
        kotakbaz.rain.client.render.main.program.A.h[0x8E6E ^ 0x8E27] = 0x8E70 ^ 0x8E27;
        kotakbaz.rain.client.render.main.program.A.h[0x111A ^ 0x1054] = 0x24CE ^ 0x1054;
        kotakbaz.rain.client.render.main.program.A.h[0xDDCB ^ 0xDD1B] = 0xD812 ^ 0xDD1B;
        kotakbaz.rain.client.render.main.program.A.h[0xA1B1 ^ 0xA12E] = 0x8559 ^ 0xA12E;
        kotakbaz.rain.client.render.main.program.A.h[0xB6BF ^ 0xB634] = 0xE9C1 ^ 0xB634;
        kotakbaz.rain.client.render.main.program.A.h[0x6E6A ^ 0x6F60] = 0x1D94 ^ 0x6F60;
        kotakbaz.rain.client.render.main.program.A.h[0xAB01 ^ 0xAA30] = 0x9AEF ^ 0xAA30;
        kotakbaz.rain.client.render.main.program.A.h[0x396D ^ 0x39AF] = 0x103F ^ 0x39AF;
        kotakbaz.rain.client.render.main.program.A.h[0xFD1F ^ 0xFC48] = 0xFC48 ^ 0xFC48;
        kotakbaz.rain.client.render.main.program.A.h[0x516A ^ 0x507A] = 0xCF60 ^ 0x507A;
        kotakbaz.rain.client.render.main.program.A.h[0x7CF0 ^ 0x7C6E] = 0x581A ^ 0x7C6E;
        kotakbaz.rain.client.render.main.program.A.h[0x4BC5 ^ 0x4B52] = 0x6EAE ^ 0x4B52;
        kotakbaz.rain.client.render.main.program.A.h[0x577C ^ 0x5782] = 0xA982 ^ 0x5782;
        kotakbaz.rain.client.render.main.program.A.h[0x2BFD ^ 0x2B5C] = 0xF2B ^ 0x2B5C;
        kotakbaz.rain.client.render.main.program.A.h[0x44A4 ^ 0x44CE] = 0xFFFFBB22 ^ 0x44CE;
        kotakbaz.rain.client.render.main.program.A.h[0x100DB ^ 0x1002C] = 0x13871 ^ 0x1002C;
        kotakbaz.rain.client.render.main.program.A.h[0xACAD ^ 0xACBA] = 0xAC01 ^ 0xACBA;
        kotakbaz.rain.client.render.main.program.A.h[0xD5E4 ^ 0xD4DE] = 0x3312 ^ 0xD4DE;
        kotakbaz.rain.client.render.main.program.A.h[0x21B5 ^ 0x2125] = 0x7D7D ^ 0x2125;
        kotakbaz.rain.client.render.main.program.A.h[0x8AF5 ^ 0x8BE9] = 0x1D9C ^ 0x8BE9;
        kotakbaz.rain.client.render.main.program.A.h[0xD9B2 ^ 0xD8CF] = 0x6469 ^ 0xD8CF;
        kotakbaz.rain.client.render.main.program.A.h[0x76BD ^ 0x761B] = 0x177B7 ^ 0x761B;
        kotakbaz.rain.client.render.main.program.A.h[0xCFF8 ^ 0xCFA6] = 0xCF87 ^ 0xCFA6;
        kotakbaz.rain.client.render.main.program.A.h[0x53DE ^ 0x53B3] = 0x53F5 ^ 0x53B3;
        kotakbaz.rain.client.render.main.program.A.h[0x6D4A ^ 0x6C21] = 0x6C2B ^ 0x6C21;
        kotakbaz.rain.client.render.main.program.A.h[0x91E7 ^ 0x90C1] = 0xA1F5 ^ 0x90C1;
        kotakbaz.rain.client.render.main.program.A.h[0xE638 ^ 0xE6E5] = 0xB74F ^ 0xE6E5;
        kotakbaz.rain.client.render.main.program.A.h[0x34AC ^ 0x34A8] = 0x34CD ^ 0x34A8;
        kotakbaz.rain.client.render.main.program.A.h[0x234A ^ 0x22CA] = 0x1593 ^ 0x22CA;
        kotakbaz.rain.client.render.main.program.A.h[0x8ACA ^ 0x8B89] = 0xC5A9 ^ 0x8B89;
        kotakbaz.rain.client.render.main.program.A.h[0xF651 ^ 0xF656] = 0xFFFF09C9 ^ 0xF656;
        kotakbaz.rain.client.render.main.program.A.h[0x3FD1 ^ 0x3F1F] = 0x3A16 ^ 0x3F1F;
        kotakbaz.rain.client.render.main.program.A.h[0x1487 ^ 0x15A0] = 0xFFFFDB7C ^ 0x15A0;
        kotakbaz.rain.client.render.main.program.A.h[0x1A61 ^ 0x1B2C] = 0xBCD4 ^ 0x1B2C;
        kotakbaz.rain.client.render.main.program.A.h[0x4412 ^ 0x44FB] = 0xE7A2 ^ 0x44FB;
        kotakbaz.rain.client.render.main.program.A.h[0xE5E6 ^ 0xE593] = 0xE592 ^ 0xE593;
        kotakbaz.rain.client.render.main.program.A.h[0x7BDF ^ 0x7B8B] = 0xFFFF8425 ^ 0x7B8B;
        kotakbaz.rain.client.render.main.program.A.h[0x3F33 ^ 0x3FF6] = 0x812A ^ 0x3FF6;
        kotakbaz.rain.client.render.main.program.A.h[0x7A9C ^ 0x7B81] = 0x68FF ^ 0x7B81;
        kotakbaz.rain.client.render.main.program.A.h[0x10BDA ^ 0x10BB1] = 0xFFFEF416 ^ 0x10BB1;
        kotakbaz.rain.client.render.main.program.A.h[0xD37D ^ 0xD21E] = 0xD218 ^ 0xD21E;
        kotakbaz.rain.client.render.main.program.A.h[0x3DC0 ^ 0x3C94] = 0x3C84 ^ 0x3C94;
        kotakbaz.rain.client.render.main.program.A.h[0xABF ^ 0xAC4] = 0x108 ^ 0xAC4;
        kotakbaz.rain.client.render.main.program.A.h[0xF9DF ^ 0xF9AD] = 0xF9AC ^ 0xF9AD;
        kotakbaz.rain.client.render.main.program.A.h[0x82B5 ^ 0x8248] = 0x7C48 ^ 0x8248;
        kotakbaz.rain.client.render.main.program.A.h[0x7BB1 ^ 0x7A9D] = 0x3297 ^ 0x7A9D;
        kotakbaz.rain.client.render.main.program.A.h[0x3763 ^ 0x3664] = 0xFFFF01C7 ^ 0x3664;
        kotakbaz.rain.client.render.main.program.A.h[0x4AA3 ^ 0x4AF3] = 0x4A98 ^ 0x4AF3;
        kotakbaz.rain.client.render.main.program.A.h[0xB03 ^ 0xBAC] = 0x9C23 ^ 0xBAC;
        kotakbaz.rain.client.render.main.program.A.h[0x8E79 ^ 0x8E76] = 0xFFFF71DC ^ 0x8E76;
        kotakbaz.rain.client.render.main.program.A.h[0xB45D ^ 0xB474] = 0xB474 ^ 0xB474;
        kotakbaz.rain.client.render.main.program.A.h[0xA958 ^ 0xA9A1] = 0x8017 ^ 0xA9A1;
        kotakbaz.rain.client.render.main.program.A.h[0x8FA1 ^ 0x8ED4] = 0x8EC4 ^ 0x8ED4;
        kotakbaz.rain.client.render.main.program.A.h[0x97B9 ^ 0x96CB] = 0xFFFF6919 ^ 0x96CB;
        kotakbaz.rain.client.render.main.program.A.h[0x5BED ^ 0x5BD5] = 0x5BD5 ^ 0x5BD5;
        kotakbaz.rain.client.render.main.program.A.h[0xFD6B ^ 0xFDD4] = 0xFFFFDDB2 ^ 0xFDD4;
        kotakbaz.rain.client.render.main.program.A.h[0x55D0 ^ 0x558A] = 0xFFFFAA33 ^ 0x558A;
        kotakbaz.rain.client.render.main.program.A.h[0xF15E ^ 0xF012] = 0xAFAA ^ 0xF012;
        kotakbaz.rain.client.render.main.program.A.h[0x56F7 ^ 0x56C0] = 0x53DC ^ 0x56C0;
        kotakbaz.rain.client.render.main.program.A.h[0x1BFA ^ 0x1B46] = 0x30E2 ^ 0x1B46;
        kotakbaz.rain.client.render.main.program.A.h[0xF08D ^ 0xF0AB] = 0xF0AB ^ 0xF0AB;
        kotakbaz.rain.client.render.main.program.A.h[0x2AE6 ^ 0x2A1D] = 0x3B6 ^ 0x2A1D;
        kotakbaz.rain.client.render.main.program.A.h[0x2777 ^ 0x2715] = 0xFFFFD8B5 ^ 0x2715;
        kotakbaz.rain.client.render.main.program.A.h[0x3781 ^ 0x3706] = 0xFE84 ^ 0x3706;
        kotakbaz.rain.client.render.main.program.A.h[0x6558 ^ 0x65BA] = 0xE722 ^ 0x65BA;
        kotakbaz.rain.client.render.main.program.A.h[0x39B2 ^ 0x388E] = 0xDF42 ^ 0x388E;
        kotakbaz.rain.client.render.main.program.A.h[0x452B ^ 0x45A6] = 0x1A53 ^ 0x45A6;
        kotakbaz.rain.client.render.main.program.A.h[0xF7A9 ^ 0xF7DF] = 0xF7DE ^ 0xF7DF;
        kotakbaz.rain.client.render.main.program.A.h[0xA654 ^ 0xA62C] = 0x5C5 ^ 0xA62C;
        kotakbaz.rain.client.render.main.program.A.h[0x6DAC ^ 0x6D29] = 0xDAF4 ^ 0x6D29;
        kotakbaz.rain.client.render.main.program.A.h[0xEDEF ^ 0xED48] = 0x1ECE3 ^ 0xED48;
        kotakbaz.rain.client.render.main.program.A.h[0xA791 ^ 0xA698] = 0xD47F ^ 0xA698;
        kotakbaz.rain.client.render.main.program.A.h[0x5C53 ^ 0x5CEA] = 0x775F ^ 0x5CEA;
        kotakbaz.rain.client.render.main.program.A.h[0x9835 ^ 0x98EB] = 0xC945 ^ 0x98EB;
        kotakbaz.rain.client.render.main.program.A.h[0x4EA0 ^ 0x4FA1] = 0xBFD9 ^ 0x4FA1;
        kotakbaz.rain.client.render.main.program.A.h[0x941B ^ 0x9493] = 0xFFFFA2EE ^ 0x9493;
        kotakbaz.rain.client.render.main.program.A.h[0x7F03 ^ 0x7FF3] = 0x8ABB ^ 0x7FF3;
        kotakbaz.rain.client.render.main.program.A.h[0xBEA7 ^ 0xBEFE] = 0xBE93 ^ 0xBEFE;
        kotakbaz.rain.client.render.main.program.A.h[0x16 ^ 0x5D] = 0xFFFFFF87 ^ 0x5D;
        kotakbaz.rain.client.render.main.program.A.h[0x870E ^ 0x87D8] = 0x8041 ^ 0x87D8;
        kotakbaz.rain.client.render.main.program.A.h[0x4211 ^ 0x4300] = 0xB0 ^ 0x4300;
        kotakbaz.rain.client.render.main.program.A.h[0xE437 ^ 0xE549] = 0xFEE ^ 0xE549;
        kotakbaz.rain.client.render.main.program.A.h[0xD316 ^ 0xD254] = 0xD246 ^ 0xD254;
        kotakbaz.rain.client.render.main.program.A.h[0x4997 ^ 0x4934] = 0xA903 ^ 0x4934;
        kotakbaz.rain.client.render.main.program.A.h[0xE901 ^ 0xE885] = 0x6359 ^ 0xE885;
        kotakbaz.rain.client.render.main.program.A.h[0x1712 ^ 0x1648] = 0xFFFFE9F6 ^ 0x1648;
        kotakbaz.rain.client.render.main.program.A.h[0x8C5D ^ 0x8C64] = 0xFFFF73C4 ^ 0x8C64;
        kotakbaz.rain.client.render.main.program.A.h[0x3C55 ^ 0x3D61] = 0xDB8 ^ 0x3D61;
        kotakbaz.rain.client.render.main.program.A.h[0xE163 ^ 0xE048] = 0xA840 ^ 0xE048;
        kotakbaz.rain.client.render.main.program.A.h[0x746B ^ 0x74BE] = 0x7331 ^ 0x74BE;
        kotakbaz.rain.client.render.main.program.A.h[0x37E0 ^ 0x3701] = 0xB580 ^ 0x3701;
        kotakbaz.rain.client.render.main.program.A.h[0x673D ^ 0x6726] = 0xFFFF98AC ^ 0x6726;
        kotakbaz.rain.client.render.main.program.A.h[0x34F1 ^ 0x3582] = 0x3580 ^ 0x3582;
        kotakbaz.rain.client.render.main.program.A.h[0x4A88 ^ 0x4A11] = 0x6FED ^ 0x4A11;
        kotakbaz.rain.client.render.main.program.A.h[0x1014 ^ 0x1110] = 0xE16D ^ 0x1110;
        kotakbaz.rain.client.render.main.program.A.h[0x1D9C ^ 0x1DE8] = 0x1DE8 ^ 0x1DE8;
        kotakbaz.rain.client.render.main.program.A.h[0x9311 ^ 0x9233] = 0x8F52 ^ 0x9233;
        kotakbaz.rain.client.render.main.program.A.h[0x49A7 ^ 0x4915] = 0xE3AD ^ 0x4915;
        kotakbaz.rain.client.render.main.program.A.h[0xC933 ^ 0xC873] = 0xC872 ^ 0xC873;
        kotakbaz.rain.client.render.main.program.A.h[0x4EBA ^ 0x4FFC] = 0x7E98 ^ 0x4FFC;
        kotakbaz.rain.client.render.main.program.A.h[0x73F6 ^ 0x73FD] = 0x738A ^ 0x73FD;
        kotakbaz.rain.client.render.main.program.A.h[0xB17B ^ 0xB1FF] = 0xFFFFF9FF ^ 0xB1FF;
        kotakbaz.rain.client.render.main.program.A.h[0x63C1 ^ 0x62A7] = 0x62C6 ^ 0x62A7;
        kotakbaz.rain.client.render.main.program.A.h[0x8062 ^ 0x8020] = 0x8010 ^ 0x8020;
        kotakbaz.rain.client.render.main.program.A.h[0x9B19 ^ 0x9B9B] = 0x2C4B ^ 0x9B9B;
        kotakbaz.rain.client.render.main.program.A.h[0x3A24 ^ 0x3B61] = 0x5965 ^ 0x3B61;
        kotakbaz.rain.client.render.main.program.A.h[0xCD34 ^ 0xCC09] = 0xCC09 ^ 0xCC09;
        kotakbaz.rain.client.render.main.program.A.h[0x10A0E ^ 0x10B76] = 0x10B76 ^ 0x10B76;
        kotakbaz.rain.client.render.main.program.A.h[0x66C7 ^ 0x661C] = 0x4230 ^ 0x661C;
        kotakbaz.rain.client.render.main.program.A.h[0x2B87 ^ 0x2A8A] = 0xB58F ^ 0x2A8A;
        kotakbaz.rain.client.render.main.program.A.h[0xF319 ^ 0xF3D2] = 0xFFFF9C83 ^ 0xF3D2;
        kotakbaz.rain.client.render.main.program.A.h[0x10C9B ^ 0x10DB8] = 0xFFFEEF68 ^ 0x10DB8;
        kotakbaz.rain.client.render.main.program.A.h[0x76FC ^ 0x76FC] = 0xFFFF896F ^ 0x76FC;
        kotakbaz.rain.client.render.main.program.A.h[0x6A17 ^ 0x6ADE] = 0xFA11 ^ 0x6ADE;
        kotakbaz.rain.client.render.main.program.A.h[0x5EF ^ 0x5A1] = 0x5CD ^ 0x5A1;
        kotakbaz.rain.client.render.main.program.A.h[0xE78D ^ 0xE78E] = 0xE788 ^ 0xE78E;
        kotakbaz.rain.client.render.main.program.A.h[0xF38B ^ 0xF2BD] = 0x770 ^ 0xF2BD;
        kotakbaz.rain.client.render.main.program.A.h[0x3C2A ^ 0x3CC5] = 0xFFFF3607 ^ 0x3CC5;
        kotakbaz.rain.client.render.main.program.A.h[0x2B99 ^ 0x2B0C] = 0x98C5 ^ 0x2B0C;
        kotakbaz.rain.client.render.main.program.A.h[0x2C8E ^ 0x2C27] = 0x12D8C ^ 0x2C27;
        kotakbaz.rain.client.render.main.program.A.h[0x22D ^ 0x2EB] = 0xBC27 ^ 0x2EB;
        kotakbaz.rain.client.render.main.program.A.h[0x5A3A ^ 0x5A45] = 0x3754 ^ 0x5A45;
        kotakbaz.rain.client.render.main.program.A.h[0x7F3E ^ 0x7FDE] = 0x2E70 ^ 0x7FDE;
        kotakbaz.rain.client.render.main.program.A.h[0xB96F ^ 0xB95B] = 0x94EC ^ 0xB95B;
        kotakbaz.rain.client.render.main.program.A.h[0x1442 ^ 0x1410] = 0xFFFFEBAD ^ 0x1410;
        kotakbaz.rain.client.render.main.program.A.h[0x6073 ^ 0x607E] = 0x6058 ^ 0x607E;
        kotakbaz.rain.client.render.main.program.A.h[0x3668 ^ 0x36E4] = 0xFFFF969C ^ 0x36E4;
        kotakbaz.rain.client.render.main.program.A.h[0xEFFA ^ 0xEEF5] = 0xFFFF8E07 ^ 0xEEF5;
        kotakbaz.rain.client.render.main.program.A.h[0x1B1D ^ 0x1B97] = 0x446E ^ 0x1B97;
        kotakbaz.rain.client.render.main.program.A.h[0x31A6 ^ 0x30FB] = 0x30FA ^ 0x30FB;
        kotakbaz.rain.client.render.main.program.A.h[0xA352 ^ 0xA3B7] = 0x9F2C ^ 0xA3B7;
        kotakbaz.rain.client.render.main.program.A.h[0x768D ^ 0x77E4] = 0x77E9 ^ 0x77E4;
        kotakbaz.rain.client.render.main.program.A.h[0xF6F6 ^ 0xF6B6] = 0xFFFF091C ^ 0xF6B6;
        kotakbaz.rain.client.render.main.program.A.h[0xF0D6 ^ 0xF15C] = 0xF15F ^ 0xF15C;
        kotakbaz.rain.client.render.main.program.A.h[0x3FF4 ^ 0x3F2B] = 0xFFFF911E ^ 0x3F2B;
        kotakbaz.rain.client.render.main.program.A.h[0x4B37 ^ 0x4B22] = 0x4B47 ^ 0x4B22;
        kotakbaz.rain.client.render.main.program.A.h[0x475E ^ 0x471D] = 0xFFFFB8DE ^ 0x471D;
        kotakbaz.rain.client.render.main.program.A.h[0x656 ^ 0x626] = 0x605 ^ 0x626;
        kotakbaz.rain.client.render.main.program.A.h[0x7B33 ^ 0x7A00] = 0x4ACC ^ 0x7A00;
        kotakbaz.rain.client.render.main.program.A.h[0x30BA ^ 0x30DB] = 0x30BC ^ 0x30DB;
        kotakbaz.rain.client.render.main.program.A.h[0xA919 ^ 0xA860] = 0xA863 ^ 0xA860;
        kotakbaz.rain.client.render.main.program.A.h[0xA305 ^ 0xA33E] = 0xA304 ^ 0xA33E;
        kotakbaz.rain.client.render.main.program.A.h[0x9ECB ^ 0x9FE5] = 0xAA4D ^ 0x9FE5;
        kotakbaz.rain.client.render.main.program.A.h[0x37A6 ^ 0x378C] = 0x37A0 ^ 0x378C;
        kotakbaz.rain.client.render.main.program.A.h[0xAD77 ^ 0xAC0C] = 0x511F ^ 0xAC0C;
        kotakbaz.rain.client.render.main.program.A.h[0xF56D ^ 0xF5E3] = 0xA9B6 ^ 0xF5E3;
        kotakbaz.rain.client.render.main.program.A.h[0x931 ^ 0x82B] = 0x9E5E ^ 0x82B;
        kotakbaz.rain.client.render.main.program.A.h[0x10FB4 ^ 0x10EC4] = 0x10EE8 ^ 0x10EC4;
        kotakbaz.rain.client.render.main.program.A.h[0x703E ^ 0x70DA] = 0xF242 ^ 0x70DA;
        kotakbaz.rain.client.render.main.program.A.h[0xF54A ^ 0xF566] = 0xF807 ^ 0xF566;
        kotakbaz.rain.client.render.main.program.A.h[0x6772 ^ 0x6723] = 0xFFFF98EE ^ 0x6723;
        kotakbaz.rain.client.render.main.program.A.h[0x92B3 ^ 0x9211] = 0x7229 ^ 0x9211;
        kotakbaz.rain.client.render.main.program.A.h[0xDE81 ^ 0xDEDE] = 0xDEEC ^ 0xDEDE;
        kotakbaz.rain.client.render.main.program.A.h[0x10E6A ^ 0x10E3F] = 0xFFFEF1C8 ^ 0x10E3F;
        kotakbaz.rain.client.render.main.program.A.h[0x4A32 ^ 0x4AF2] = 0x956C ^ 0x4AF2;
        kotakbaz.rain.client.render.main.program.A.h[0x10940 ^ 0x108C8] = 0x108D8 ^ 0x108C8;
        kotakbaz.rain.client.render.main.program.A.h[0xE588 ^ 0xE582] = 0xFFFF1A4B ^ 0xE582;
        kotakbaz.rain.client.render.main.program.A.h[0xF230 ^ 0xF25E] = 0xFFFF0DF7 ^ 0xF25E;
        kotakbaz.rain.client.render.main.program.A.h[0x82AC ^ 0x8217] = 0xA993 ^ 0x8217;
        kotakbaz.rain.client.render.main.program.A.h[0x4E04 ^ 0x4E2C] = 0x4E2C ^ 0x4E2C;
        kotakbaz.rain.client.render.main.program.A.h[0x501B ^ 0x5102] = 0xC760 ^ 0x5102;
        kotakbaz.rain.client.render.main.program.A.h[0x4400 ^ 0x44E6] = 0x786F ^ 0x44E6;
        kotakbaz.rain.client.render.main.program.A.h[0x405 ^ 0x58C] = 0x59C ^ 0x58C;
        kotakbaz.rain.client.render.main.program.A.h[0x44D7 ^ 0x441B] = 0xD4DF ^ 0x441B;
        kotakbaz.rain.client.render.main.program.A.h[0xE591 ^ 0xE535] = 0x563 ^ 0xE535;
        kotakbaz.rain.client.render.main.program.A.h[0xBCD ^ 0xB6D] = 0x2F29 ^ 0xB6D;
        kotakbaz.rain.client.render.main.program.A.h[0x3D5F ^ 0x3C0E] = 0x1872 ^ 0x3C0E;
        kotakbaz.rain.client.render.main.program.A.h[0x8E2A ^ 0x8F02] = 0xBE36 ^ 0x8F02;
        kotakbaz.rain.client.render.main.program.A.h[0xA53E ^ 0xA5FF] = 0x8C68 ^ 0xA5FF;
        kotakbaz.rain.client.render.main.program.A.h[0x65C5 ^ 0x64D0] = 0x6629 ^ 0x64D0;
        kotakbaz.rain.client.render.main.program.A.h[0x2F3F ^ 0x2F12] = 0xE9B6 ^ 0x2F12;
        kotakbaz.rain.client.render.main.program.A.h[0x7627 ^ 0x770D] = 0x3F07 ^ 0x770D;
        kotakbaz.rain.client.render.main.program.A.h[0x88D0 ^ 0x89B4] = 0x89C5 ^ 0x89B4;
        kotakbaz.rain.client.render.main.program.A.h[0xA19D ^ 0xA155] = 0x1F99 ^ 0xA155;
        kotakbaz.rain.client.render.main.program.A.h[0x136F ^ 0x1218] = 0x121A ^ 0x1218;
        kotakbaz.rain.client.render.main.program.A.h[0x746B ^ 0x7509] = 0xFFFF8ADC ^ 0x7509;
        kotakbaz.rain.client.render.main.program.A.h[0x553D ^ 0x55E9] = 0xC7CD ^ 0x55E9;
        kotakbaz.rain.client.render.main.program.A.h[0x10A15 ^ 0x10A93] = 0x1C318 ^ 0x10A93;
        kotakbaz.rain.client.render.main.program.A.h[0xEF9D ^ 0xEF0C] = 0xB351 ^ 0xEF0C;
        kotakbaz.rain.client.render.main.program.A.h[0xA05F ^ 0xA0C3] = 0xFFFF6592 ^ 0xA0C3;
        kotakbaz.rain.client.render.main.program.A.h[0xBB93 ^ 0xBA16] = 0x16B9 ^ 0xBA16;
        kotakbaz.rain.client.render.main.program.A.h[0xA902 ^ 0xA978] = 0xA2BF ^ 0xA978;
        kotakbaz.rain.client.render.main.program.A.h[0x7718 ^ 0x7782] = 0x4D0F ^ 0x7782;
        kotakbaz.rain.client.render.main.program.A.h[0x1356 ^ 0x1279] = 0x279D ^ 0x1279;
        kotakbaz.rain.client.render.main.program.A.h[0x61E1 ^ 0x6097] = 0x6197 ^ 0x6097;
        kotakbaz.rain.client.render.main.program.A.h[0xBBAD ^ 0xBBB5] = 0xBBD9 ^ 0xBBB5;
        kotakbaz.rain.client.render.main.program.A.h[0xB312 ^ 0xB37D] = 0xB351 ^ 0xB37D;
        kotakbaz.rain.client.render.main.program.A.h[0xE8DB ^ 0xE89F] = 0xFFFF176D ^ 0xE89F;
        kotakbaz.rain.client.render.main.program.A.h[0x2BAD ^ 0x2AF8] = 0x2AF0 ^ 0x2AF8;
        kotakbaz.rain.client.render.main.program.A.h[0xB9A6 ^ 0xB986] = 0xB9A6 ^ 0xB986;
        kotakbaz.rain.client.render.main.program.A.h[0xA847 ^ 0xA871] = 0x952A ^ 0xA871;
        kotakbaz.rain.client.render.main.program.A.h[0xC4C7 ^ 0xC471] = 0xEFC5 ^ 0xC471;
        kotakbaz.rain.client.render.main.program.A.h[0x8086 ^ 0x8032] = 0xFFFFD56C ^ 0x8032;
        kotakbaz.rain.client.render.main.program.A.h[0x1F17 ^ 0x1E90] = 0x1E90 ^ 0x1E90;
        kotakbaz.rain.client.render.main.program.A.h[0x79A4 ^ 0x78D5] = 0x78D1 ^ 0x78D5;
        kotakbaz.rain.client.render.main.program.A.h[0xE210 ^ 0xE371] = 0xE372 ^ 0xE371;
        kotakbaz.rain.client.render.main.program.A.h[0x5893 ^ 0x58DF] = 0xFFFFA743 ^ 0x58DF;
        kotakbaz.rain.client.render.main.program.A.h[0x10AA1 ^ 0x10AC5] = 0x10AB5 ^ 0x10AC5;
        kotakbaz.rain.client.render.main.program.A.h[0x10E6E ^ 0x10E0D] = 0x10E60 ^ 0x10E0D;
        kotakbaz.rain.client.render.main.program.A.h[0x150D ^ 0x141E] = 0x57E0 ^ 0x141E;
        kotakbaz.rain.client.render.main.program.A.h[0x9277 ^ 0x9319] = 0x933E ^ 0x9319;
        kotakbaz.rain.client.render.main.program.A.h[0xF7C8 ^ 0xF7ED] = 0xF7EC ^ 0xF7ED;
        kotakbaz.rain.client.render.main.program.A.h[0x3AEB ^ 0x3A03] = 0x68A ^ 0x3A03;
        kotakbaz.rain.client.render.main.program.A.h[0xE515 ^ 0xE58D] = 0xC038 ^ 0xE58D;
        kotakbaz.rain.client.render.main.program.A.h[0x52B4 ^ 0x52B8] = 0xFFFFAD15 ^ 0x52B8;
        kotakbaz.rain.client.render.main.program.A.h[0x1000C ^ 0x100F3] = 0x1FEB6 ^ 0x100F3;
        kotakbaz.rain.client.render.main.program.A.h[0x5FF4 ^ 0x5F51] = 0xBF66 ^ 0x5F51;
        kotakbaz.rain.client.render.main.program.A.h[0xAF3E ^ 0xAF42] = 0xFFFF5B52 ^ 0xAF42;
        kotakbaz.rain.client.render.main.program.A.h[0x1805 ^ 0x186D] = 0x1874 ^ 0x186D;
        kotakbaz.rain.client.render.main.program.A.h[0x5DE0 ^ 0x5CF4] = 0x1F4E ^ 0x5CF4;
        kotakbaz.rain.client.render.main.program.A.h[0xC4F5 ^ 0xC4A2] = 0xFFFF3BFC ^ 0xC4A2;
        kotakbaz.rain.client.render.main.program.A.h[0xA486 ^ 0xA4F5] = 0xA4F7 ^ 0xA4F5;
        kotakbaz.rain.client.render.main.program.A.h[0x776B ^ 0x77C5] = 0xE04C ^ 0x77C5;
        kotakbaz.rain.client.render.main.program.A.h[0xF9E2 ^ 0xF97F] = 0xC3FC ^ 0xF97F;
        kotakbaz.rain.client.render.main.program.A.h[0xD7A3 ^ 0xD7B3] = 0xFFFF2856 ^ 0xD7B3;
        kotakbaz.rain.client.render.main.program.A.h[0xC0B6 ^ 0xC1E9] = 0xC1EC ^ 0xC1E9;
        kotakbaz.rain.client.render.main.program.A.h[0x10ACA ^ 0x10B9C] = 0xFFFEF404 ^ 0x10B9C;
        kotakbaz.rain.client.render.main.program.A.h[0x433E ^ 0x4394] = 0x530 ^ 0x4394;
        kotakbaz.rain.client.render.main.program.A.h[0xAC1E ^ 0xACC2] = 0x8896 ^ 0xACC2;
        kotakbaz.rain.client.render.main.program.A.h[0x4F3C ^ 0x4EBF] = 0x3244 ^ 0x4EBF;
        kotakbaz.rain.client.render.main.program.A.h[0x4E10 ^ 0x4E34] = 0x4E34 ^ 0x4E34;
        kotakbaz.rain.client.render.main.program.A.h[0xA916 ^ 0xA85F] = 0xAF0D ^ 0xA85F;
        kotakbaz.rain.client.render.main.program.A.h[0x100C2 ^ 0x1003A] = 0x13812 ^ 0x1003A;
        kotakbaz.rain.client.render.main.program.A.h[0x276C ^ 0x27B6] = 0x3E2 ^ 0x27B6;
        kotakbaz.rain.client.render.main.program.A.h[0xAA4C ^ 0xAB07] = 0x8AB1 ^ 0xAB07;
        kotakbaz.rain.client.render.main.program.A.h[0x75FB ^ 0x7517] = 0xD655 ^ 0x7517;
        kotakbaz.rain.client.render.main.program.A.h[0x66B ^ 0x623] = 0xFFFFF9F5 ^ 0x623;
        kotakbaz.rain.client.render.main.program.A.h[0xB804 ^ 0xB8EE] = 0x1BAC ^ 0xB8EE;
        kotakbaz.rain.client.render.main.program.A.h[0xB6D3 ^ 0xB7FA] = 0xFFFF ^ 0xB7FA;
        kotakbaz.rain.client.render.main.program.A.h[0x7A51 ^ 0x7ACA] = 0x4049 ^ 0x7ACA;
        kotakbaz.rain.client.render.main.program.A.h[0x3D7D ^ 0x3C07] = 0x286 ^ 0x3C07;
        kotakbaz.rain.client.render.main.program.A.h[0x36FC ^ 0x36E5] = 0x36CA ^ 0x36E5;
        kotakbaz.rain.client.render.main.program.A.h[0xAE17 ^ 0xAE7E] = 0xFFFF51CD ^ 0xAE7E;
        kotakbaz.rain.client.render.main.program.A.h[0x4A1C ^ 0x4B47] = 0x4B4E ^ 0x4B47;
        kotakbaz.rain.client.render.main.program.A.h[0xBE35 ^ 0xBF41] = 0xBF03 ^ 0xBF41;
        kotakbaz.rain.client.render.main.program.A.h[0xE9A3 ^ 0xE964] = 0x57C6 ^ 0xE964;
        kotakbaz.rain.client.render.main.program.A.h[0x72E2 ^ 0x7387] = 0x7380 ^ 0x7387;
        kotakbaz.rain.client.render.main.program.A.h[0xE643 ^ 0xE63D] = 0x8B28 ^ 0xE63D;
        kotakbaz.rain.client.render.main.program.A.h[0xA950 ^ 0xA9BB] = 0xAB6 ^ 0xA9BB;
        kotakbaz.rain.client.render.main.program.A.h[0xB41E ^ 0xB4CC] = 0x26E8 ^ 0xB4CC;
        kotakbaz.rain.client.render.main.program.A.h[0x5BFA ^ 0x5B29] = 0xFFFF36AB ^ 0x5B29;
        kotakbaz.rain.client.render.main.program.A.h[0x4748 ^ 0x460F] = 0x8C84 ^ 0x460F;
        kotakbaz.rain.client.render.main.program.A.h[0x30A6 ^ 0x31F4] = 0x2EC9 ^ 0x31F4;
        kotakbaz.rain.client.render.main.program.A.h[0x4627 ^ 0x4740] = 0x474F ^ 0x4740;
        kotakbaz.rain.client.render.main.program.A.h[0xB42C ^ 0xB51E] = 0x85C7 ^ 0xB51E;
        kotakbaz.rain.client.render.main.program.A.h[0x7C56 ^ 0x7DD9] = 0xA5FA ^ 0x7DD9;
        kotakbaz.rain.client.render.main.program.A.h[0xE0C ^ 0xF3B] = 0xFAC8 ^ 0xF3B;
        kotakbaz.rain.client.render.main.program.A.h[0xDB05 ^ 0xDB3A] = 0xDB84 ^ 0xDB3A;
        kotakbaz.rain.client.render.main.program.A.h[0x267D ^ 0x2632] = 0xFFFFD9ED ^ 0x2632;
        kotakbaz.rain.client.render.main.program.A.h[0x9358 ^ 0x9260] = 0x67AD ^ 0x9260;
        kotakbaz.rain.client.render.main.program.A.h[0x9803 ^ 0x98ED] = 0x6DA5 ^ 0x98ED;
        kotakbaz.rain.client.render.main.program.A.h[0xF254 ^ 0xF2B9] = 0x7E5 ^ 0xF2B9;
        kotakbaz.rain.client.render.main.program.A.h[0x100FB ^ 0x100B1] = 0xFFFEFF10 ^ 0x100B1;
        kotakbaz.rain.client.render.main.program.A.h[0xA13E ^ 0xA192] = 0xE724 ^ 0xA192;
        kotakbaz.rain.client.render.main.program.A.h[0x690D ^ 0x698D] = 0x4C3 ^ 0x698D;
        kotakbaz.rain.client.render.main.program.A.h[0xCC06 ^ 0xCD36] = 0xF89E ^ 0xCD36;
        kotakbaz.rain.client.render.main.program.A.h[0xCF66 ^ 0xCE47] = 0xD33B ^ 0xCE47;
        kotakbaz.rain.client.render.main.program.A.h[0x6305 ^ 0x6268] = 0x6263 ^ 0x6268;
        kotakbaz.rain.client.render.main.program.A.h[0xAA6A ^ 0xABEC] = 0xABEE ^ 0xABEC;
        kotakbaz.rain.client.render.main.program.A.h[0x4AFA ^ 0x4A69] = 0xF9A0 ^ 0x4A69;
        kotakbaz.rain.client.render.main.program.A.h[0x45A1 ^ 0x4537] = 0x60C1 ^ 0x4537;
        kotakbaz.rain.client.render.main.program.A.h[0x302 ^ 0x354] = 0xFFFFFCD1 ^ 0x354;
        kotakbaz.rain.client.render.main.program.A.h[0xA1F7 ^ 0xA190] = 0xFFFF5E0F ^ 0xA190;
        kotakbaz.rain.client.render.main.program.A.h[0x1E0F ^ 0x1ED6] = 0x3A9E ^ 0x1ED6;
        kotakbaz.rain.client.render.main.program.A.h[0x4B0A ^ 0x4B30] = 0x4B76 ^ 0x4B30;
        kotakbaz.rain.client.render.main.program.A.h[0x1DB1 ^ 0x1DD7] = 0x1DBF ^ 0x1DD7;
        kotakbaz.rain.client.render.main.program.A.h[0x371C ^ 0x3642] = 0x3647 ^ 0x3642;
        kotakbaz.rain.client.render.main.program.A.h[0xFA9D ^ 0xFB93] = 0x6489 ^ 0xFB93;
        kotakbaz.rain.client.render.main.program.A.h[0x5FE ^ 0x5E1] = 0xFFFFFA64 ^ 0x5E1;
        kotakbaz.rain.client.render.main.program.A.h[0x9452 ^ 0x949F] = 0x918C ^ 0x949F;
        kotakbaz.rain.client.render.main.program.A.h[0xCE15 ^ 0xCEBE] = 0x8818 ^ 0xCEBE;
        kotakbaz.rain.client.render.main.program.A.h[0xEEEF ^ 0xEEB7] = 0xEEF2 ^ 0xEEB7;
        kotakbaz.rain.client.render.main.program.A.h[0xFC82 ^ 0xFDCD] = 0xEFD7 ^ 0xFDCD;
        kotakbaz.rain.client.render.main.program.A.h[0x19EA ^ 0x1986] = 0xFFFFE605 ^ 0x1986;
        kotakbaz.rain.client.render.main.program.A.h[0xB615 ^ 0xB606] = 0xFFFF49A6 ^ 0xB606;
        kotakbaz.rain.client.render.main.program.A.h[0x8983 ^ 0x88DA] = 0x88D4 ^ 0x88DA;
        kotakbaz.rain.client.render.main.program.A.h[0xF4F6 ^ 0xF589] = 0xF5B0 ^ 0xF589;
        kotakbaz.rain.client.render.main.program.A.h[0x799B ^ 0x7995] = 0xFFFF86FA ^ 0x7995;
        kotakbaz.rain.client.render.main.program.A.h[0x54A1 ^ 0x5470] = 0xC656 ^ 0x5470;
        kotakbaz.rain.client.render.main.program.A.h[0x3CD0 ^ 0x3C5F] = 0x6002 ^ 0x3C5F;
        kotakbaz.rain.client.render.main.program.A.h[0x78A7 ^ 0x79BC] = 0xFFFF100C ^ 0x79BC;
        kotakbaz.rain.client.render.main.program.A.h[0x9A7 ^ 0x952] = 0x316B ^ 0x952;
        kotakbaz.rain.client.render.main.program.A.h[0xD20A ^ 0xD277] = 0xD9BB ^ 0xD277;
        kotakbaz.rain.client.render.main.program.A.h[0x4F61 ^ 0x4E41] = 0x5D27 ^ 0x4E41;
        kotakbaz.rain.client.render.main.program.A.h[0xCFF3 ^ 0xCFAE] = 0xCF9D ^ 0xCFAE;
        kotakbaz.rain.client.render.main.program.A.h[0x99F6 ^ 0x995E] = 0xFFFE676D ^ 0x995E;
        kotakbaz.rain.client.render.main.program.A.h[0x2625 ^ 0x26B7] = 0x957E ^ 0x26B7;
        kotakbaz.rain.client.render.main.program.A.h[0x10790 ^ 0x107C3] = 0xFFFEF833 ^ 0x107C3;
    }
}

