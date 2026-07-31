/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.system.MemoryUtil
 */
package kotakbaz.rain.client.render.main.vertex.element;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.system.MemoryUtil;

public final class A<T>
extends Record {
    private final int a;
    private final String A;
    private final int b;
    private final Class<T> B;
    private final BiConsumer<Long, T[]> c;
    public static final A<Float> C;
    public static final A<Byte> d;
    public static final A<Byte> D;
    public static final A<Short> e;
    public static final A<Short> E;
    public static final A<Integer> f;
    public static final A<Integer> F;
    private static Object[] g;
    private static Object h;
    private static Object[] H;
    private static Object[] G;
    private static Object[] i;
    public static int[] I;

    public A(int n, String string, int n2, Class<T> clazz, BiConsumer<Long, T[]> biConsumer) {
        super();
        this.a = n;
        this.A = string;
        this.b = n2;
        this.B = clazz;
        this.c = biConsumer;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{A.class, "byteSize;typeName;glId;clazz;uploadConsumer", "a", "A", "b", "B", "c"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{A.class, "byteSize;typeName;glId;clazz;uploadConsumer", "a", "A", "b", "B", "c"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{A.class, "byteSize;typeName;glId;clazz;uploadConsumer", "a", "A", "b", "B", "c"}, this, object);
    }

    public int byteSize() {
        return this.a;
    }

    public String typeName() {
        return this.A;
    }

    public int glId() {
        return this.b;
    }

    public Class<T> clazz() {
        return this.B;
    }

    public BiConsumer<Long, T[]> uploadConsumer() {
        return this.c;
    }

    static {
        kotakbaz.rain.client.render.main.vertex.element.A.b();
        long l2 = -887130690437245293L;
        long l3 = -6636655173798301720L;
        long l4 = -3829755290887252178L;
        long l5 = 6978777701067830820L;
        long l6 = -3300711359990723467L;
        long l7 = 8634417747111809795L;
        long l8 = -3738693944056391029L;
        long l9 = -8294244585179585161L;
        long l10 = 3951483401914971602L;
        long l11 = -3051164354190195784L;
        long l12 = -6230714500213826110L;
        long l13 = -9028388212437949388L;
        long l14 = 98118828422656252L;
        long l15 = -715924173701701180L;
        int n = I[84];
        n ^= I[85];
        g = new Object[n ^= I[86]];
        long l16 = l15;
        int n2 = I[87];
        n2 ^= I[88];
        l15 = l16 ^ (0L ^ l16) & -1L << (n2 ^= I[89]);
        Object[] objectArray = new Object[I[90]];
        objectArray[kotakbaz.rain.client.render.main.vertex.element.A.I[91]] = G;
        objectArray[kotakbaz.rain.client.render.main.vertex.element.A.I[92]] = I[93];
        int n3 = I[94];
        Object object = kotakbaz.rain.client.render.main.vertex.element.A.A()[I[95]];
        if (object == null) {
            char[] cArray = "\u4237\u4228\u4233\u4242\u423d\u4235\u4246\u4225\u422c\u4260\u5f1e\u5f19\u5f16\u4253\u4241\u425e\u4249\u423c\u4260\u422e\u425b\u422e\u4257\u4257\u4239\u4245\u4260\u4255\u4228\u4243\u5f04\u4235\u4241\u422c\u4246\u4247\u4258\u4238\u4233\u4260\u4224\u4240\u4237\u422e\u4259\u4236\u4240\u424e\u5f16\u4259\u423c\u425d\u4257\u4262\u423e\u423c\u4253\u4261\u4238\u424e\u4237\u5f16\u4246\u4256\u4240\u4228\u4225\u422c\u4236\u5f15\u4246\u5f20\u5f1e\u4257\u422a\u5f18\u424b\u425c\u5f15\u4255\u5f04\u424e\u424b\u4259\u4255\u4249\u5f1c\u4243\u4233\u424e\u425a\u4239\u4241\u424c\u425f\u423a\u425c\u4228\u4239\u4240\u5f15\u425b\u4235\u425d\u5f1a\u423c\u4248\u4257\u4240\u424e\u425f\u423a\u422a\u4237\u425c\u424e\u5f19\u425e\u4243\u4241\u4223\u4262\u423b\u5f1e\u4244\u4247\u5f1b\u422b".toCharArray();
            for (int i = I[96]; i < I[97]; ++i) {
                int n4 = cArray[i];
                n4 += I[98];
                n4 -= I[99];
                n4 += I[100];
                n4 -= I[101];
                n4 += I[102];
                n4 += I[103];
                n4 += I[104];
                n4 -= I[105];
                n4 -= I[106];
                n4 ^= I[107];
                n4 ^= I[108];
                n4 -= I[109];
                n4 += I[110];
                cArray[i] = (char)(n4 += I[111]);
            }
            object = kotakbaz.rain.client.render.main.vertex.element.A.A()[kotakbaz.rain.client.render.main.vertex.element.A.I[112]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.main.vertex.element.A.a(objectArray)).toCharArray();
        long l17 = l6;
        int n5 = I[113];
        n5 ^= I[114];
        l6 = l17 ^ (0x4600000000L ^ l17) & -1L << (n5 += I[115]);
        long l18 = l13;
        int n6 = I[116];
        n6 -= I[117];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n6 -= I[118]);
        while (true) {
            int n7 = I[119];
            n7 ^= I[120];
            if ((int)l13 >= (int)(l6 >>> (n7 -= I[121]))) break;
            int n8 = (int)l13;
            long l19 = l13;
            int n9 = I[122];
            n9 += I[123];
            int n10 = I[125];
            n10 += I[126];
            l13 = l19 ^ (l19 ^ l19 + (long)(n9 -= I[124])) & -1L >>> (n10 ^= I[127]);
            long l20 = l9;
            int n11 = I[128];
            n11 ^= I[129];
            l9 = l20 ^ ((long)cArray[n8] ^ l20) & -1L >>> (n11 += I[130]);
            int n12 = (int)l13;
            long l21 = l13;
            int n13 = I[131];
            n13 -= I[132];
            int n14 = I[134];
            n14 ^= I[135];
            l13 = l21 ^ (l21 ^ l21 + (long)(n13 ^= I[133])) & -1L >>> (n14 += I[136]);
            int n15 = I[137];
            n15 -= I[138];
            long l22 = l10;
            int n16 = I[140];
            n16 += I[141];
            l10 = l22 ^ ((long)cArray[n12] << (n15 += I[139]) ^ l22) & -1L << (n16 -= I[142]);
            int n17 = I[143];
            n17 -= I[144];
            n17 += I[145];
            int n18 = I[146];
            n18 -= I[147];
            long l23 = l12;
            int n19 = I[149];
            n19 -= I[150];
            l12 = l23 ^ ((long)((int)l9 << n17 | (int)(l10 >>> (n18 -= I[148]))) ^ l23) & -1L >>> (n19 ^= I[151]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n20 = I[152];
            n20 ^= I[153];
            l14 = l24 ^ (0L ^ l24) & -1L << (n20 -= I[154]);
            while (true) {
                int n21 = I[155];
                n21 -= I[156];
                if ((int)(l14 >>> (n21 ^= I[157])) >= (int)l12) break;
                int n22 = I[158];
                n22 -= I[159];
                int n23 = I[161];
                n23 += I[162];
                cArray2[(int)(l14 >>> (n22 -= kotakbaz.rain.client.render.main.vertex.element.A.I[160]))] = cArray[(int)l13 + (int)(l14 >>> (n23 ^= I[163]))];
                l14 += 0x100000000L;
            }
            int n24 = I[164];
            n24 -= I[165];
            int n25 = (int)(l15 >>> (n24 ^= I[166]));
            l15 += 0x100000000L;
            kotakbaz.rain.client.render.main.vertex.element.A.g[n25] = new String(cArray2);
            long l25 = l13;
            int n26 = I[167];
            n26 += I[168];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n26 ^= I[169]);
        }
        int n27 = I[170];
        n27 -= I[171];
        int n28 = I[173];
        n28 ^= I[174];
        int n29 = I[176];
        n29 -= I[177];
        C = new A<Float>(n27 ^= I[172], (String)g[n28 += I[175]], n29 ^= I[178], Float.class, (l, floatArray) -> {
            long l2;
            long l3 = 7983314737035487457L;
            long l4 = 8422567661031178546L;
            long l5 = l2 = -1855649493438589206L;
            int n = I[72];
            n ^= I[73];
            l2 = l5 ^ (0L ^ l5) & -1L << (n -= I[74]);
            while (true) {
                int n2 = I[75];
                n2 ^= I[76];
                if ((int)(l2 >>> (n2 -= I[77])) >= ((Float[])floatArray).length) break;
                int n3 = I[78];
                n3 ^= I[79];
                int n4 = I[81];
                n4 += I[82];
                MemoryUtil.memPutFloat((long)(l + 4L * (long)((int)(l2 >>> (n3 ^= I[80])))), (float)floatArray[(int)(l2 >>> (n4 += I[83]))].floatValue());
                l2 += 0x100000000L;
            }
        });
        int n30 = I[179];
        n30 += I[180];
        int n31 = I[182];
        n31 -= I[183];
        int n32 = I[185];
        n32 += I[186];
        d = new A<Byte>(n30 += I[181], (String)g[n31 += I[184]], n32 -= I[187], Byte.class, (l, byteArray) -> {
            long l2;
            long l3 = -5634632430479131915L;
            long l4 = 1613759697985993579L;
            long l5 = l2 = 8555795325318947823L;
            int n = I[60];
            n += I[61];
            l2 = l5 ^ (0L ^ l5) & -1L << (n ^= I[62]);
            while (true) {
                int n2 = I[63];
                n2 -= I[64];
                if ((int)(l2 >>> (n2 += I[65])) >= ((Byte[])byteArray).length) break;
                int n3 = I[66];
                n3 += I[67];
                int n4 = I[69];
                n4 += I[70];
                MemoryUtil.memPutByte((long)(l + (long)((int)(l2 >>> (n3 += I[68])))), (byte)byteArray[(int)(l2 >>> (n4 ^= I[71]))]);
                l2 += 0x100000000L;
            }
        });
        int n33 = I[188];
        n33 -= I[189];
        int n34 = I[191];
        n34 ^= I[192];
        int n35 = I[194];
        n35 += I[195];
        D = new A<Byte>(n33 -= I[190], (String)g[n34 -= I[193]], n35 += I[196], Byte.class, (l, byteArray) -> {
            long l2;
            long l3 = 7595090454252777409L;
            long l4 = -5260006166687099937L;
            long l5 = l2 = -1286337624658200549L;
            int n = I[48];
            n -= I[49];
            l2 = l5 ^ (0L ^ l5) & -1L << (n -= I[50]);
            while (true) {
                int n2 = I[51];
                n2 -= I[52];
                if ((int)(l2 >>> (n2 ^= I[53])) >= ((Byte[])byteArray).length) break;
                int n3 = I[54];
                n3 -= I[55];
                int n4 = I[57];
                n4 += I[58];
                MemoryUtil.memPutByte((long)(l + (long)((int)(l2 >>> (n3 += I[56])))), (byte)byteArray[(int)(l2 >>> (n4 += I[59]))]);
                l2 += 0x100000000L;
            }
        });
        int n36 = I[197];
        n36 ^= I[198];
        int n37 = I[200];
        n37 -= I[201];
        int n38 = I[203];
        n38 += I[204];
        e = new A<Short>(n36 ^= I[199], (String)g[n37 -= I[202]], n38 -= I[205], Short.class, (l, shortArray) -> {
            long l2;
            long l3 = 6589773023341659853L;
            long l4 = -6057418802361184007L;
            long l5 = l2 = 4090877653886428454L;
            int n = I[36];
            n -= I[37];
            l2 = l5 ^ (0L ^ l5) & -1L << (n += I[38]);
            while (true) {
                int n2 = I[39];
                n2 += I[40];
                if ((int)(l2 >>> (n2 -= I[41])) >= ((Short[])shortArray).length) break;
                int n3 = I[42];
                n3 ^= I[43];
                int n4 = I[45];
                n4 -= I[46];
                MemoryUtil.memPutShort((long)(l + 2L * (long)((int)(l2 >>> (n3 -= I[44])))), (short)shortArray[(int)(l2 >>> (n4 += I[47]))]);
                l2 += 0x100000000L;
            }
        });
        int n39 = I[206];
        n39 += I[207];
        int n40 = I[209];
        n40 -= I[210];
        int n41 = I[212];
        n41 -= I[213];
        E = new A<Short>(n39 ^= I[208], (String)g[n40 += I[211]], n41 += I[214], Short.class, (l, shortArray) -> {
            long l2;
            long l3 = -5570526293543830130L;
            long l4 = 7698925218607265866L;
            long l5 = l2 = 2693650790369349110L;
            int n = I[24];
            n += I[25];
            l2 = l5 ^ (0L ^ l5) & -1L << (n -= I[26]);
            while (true) {
                int n2 = I[27];
                n2 ^= I[28];
                if ((int)(l2 >>> (n2 += I[29])) >= ((Short[])shortArray).length) break;
                int n3 = I[30];
                n3 += I[31];
                int n4 = I[33];
                n4 ^= I[34];
                MemoryUtil.memPutShort((long)(l + 2L * (long)((int)(l2 >>> (n3 -= I[32])))), (short)shortArray[(int)(l2 >>> (n4 += I[35]))]);
                l2 += 0x100000000L;
            }
        });
        int n42 = I[215];
        n42 ^= I[216];
        int n43 = I[218];
        n43 ^= I[219];
        int n44 = I[221];
        n44 -= I[222];
        f = new A<Integer>(n42 ^= I[217], (String)g[n43 -= I[220]], n44 += I[223], Integer.class, (l, integerArray) -> {
            long l2;
            long l3 = 109029310267272762L;
            long l4 = 6988184812483003273L;
            long l5 = l2 = 886004256903552952L;
            int n = I[12];
            n -= I[13];
            l2 = l5 ^ (0L ^ l5) & -1L << (n ^= I[14]);
            while (true) {
                int n2 = I[15];
                n2 -= I[16];
                if ((int)(l2 >>> (n2 += I[17])) >= ((Integer[])integerArray).length) break;
                int n3 = I[18];
                n3 -= I[19];
                int n4 = I[21];
                n4 -= I[22];
                MemoryUtil.memPutInt((long)(l + 4L * (long)((int)(l2 >>> (n3 ^= I[20])))), (int)integerArray[(int)(l2 >>> (n4 ^= I[23]))]);
                l2 += 0x100000000L;
            }
        });
        int n45 = I[224];
        n45 -= I[225];
        int n46 = I[227];
        n46 -= I[228];
        int n47 = I[230];
        n47 ^= I[231];
        F = new A<Integer>(n45 += I[226], (String)g[n46 ^= I[229]], n47 ^= I[232], Integer.class, (l, integerArray) -> {
            long l2;
            long l3 = -6426713648090601746L;
            long l4 = 1090180304037909937L;
            long l5 = l2 = -6134581857593881562L;
            int n = I[0];
            n += I[1];
            l2 = l5 ^ (0L ^ l5) & -1L << (n -= I[2]);
            while (true) {
                int n2 = I[3];
                n2 -= I[4];
                if ((int)(l2 >>> (n2 ^= I[5])) >= ((Integer[])integerArray).length) break;
                int n3 = I[6];
                n3 += I[7];
                int n4 = I[9];
                n4 ^= I[10];
                MemoryUtil.memPutInt((long)(l + 4L * (long)((int)(l2 >>> (n3 -= I[8])))), (int)integerArray[(int)(l2 >>> (n4 -= I[11]))]);
                l2 += 0x100000000L;
            }
        });
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[I[233]];
        String string = (String)object[I[234]];
        object = object[I[235]];
        Object[] objectArray = H;
        if (H == null) {
            objectArray = H = new Object[I[236]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[I[237]];
                G = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[I[239] ^ I[240]];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[241] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[242]] = I[243] ^ I[244];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[245] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[246]] = I[247] ^ I[248];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[249] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[250]] = I[251] ^ I[252];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[253] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[254]] = I[255] ^ I[256];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[257] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[258]] = I[259] ^ I[260];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[261] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[262]] = I[263] ^ I[264];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[265] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[266]] = I[267] ^ I[268];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[269] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[270]] = I[271] ^ I[272];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[273] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[274]] = I[275] ^ I[276];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[277] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[278]] = I[279] ^ I[280];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[281] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[282]] = I[283] ^ I[284];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[285] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[286]] = I[287] ^ I[288];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[289] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[290]] = I[291] ^ I[292];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[293] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[294]] = I[295] ^ I[296];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[297] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[298]] = I[299] ^ I[300];
                byArray[kotakbaz.rain.client.render.main.vertex.element.A.I[301] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[302]] = I[303] ^ I[304];
                objectArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[238]] = byArray;
            }
            byte[] byArray = (byte[])object3[I[305]];
            if (h == null) {
                byte[] byArray2 = new byte[I[306] ^ I[307]];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[308] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[309]] = I[310] ^ I[311];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[312] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[313]] = I[314] ^ I[315];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[316] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[317]] = I[318] ^ I[319];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[320] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[321]] = I[322] ^ I[323];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[324] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[325]] = I[326] ^ I[327];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[328] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[329]] = I[330] ^ I[331];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[332] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[333]] = I[334] ^ I[335];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[336] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[337]] = I[338] ^ I[339];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[340] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[341]] = I[342] ^ I[343];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[344] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[345]] = I[346] ^ I[347];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[348] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[349]] = I[350] ^ I[351];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[352] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[353]] = I[354] ^ I[355];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[356] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[357]] = I[358] ^ I[359];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[360] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[361]] = I[362] ^ I[363];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[364] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[365]] = I[366] ^ I[367];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[368] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[369]] = I[370] ^ I[371];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[372] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[373]] = I[374] ^ I[375];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[376] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[377]] = I[378] ^ I[379];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[380] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[381]] = I[382] ^ I[383];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[384] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[385]] = I[386] ^ I[387];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[388] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[389]] = I[390] ^ I[391];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[392] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[393]] = I[394] ^ I[395];
                byArray2[kotakbaz.rain.client.render.main.vertex.element.A.I[396] ^ kotakbaz.rain.client.render.main.vertex.element.A.I[397]] = I[398] ^ I[399];
                byArray2[0x21BA ^ 0x21A1] = 0xFFFFDE73 ^ 0x21A1;
                byArray2[0xD1E3 ^ 0xD1E8] = 0xD19C ^ 0xD1E8;
                byArray2[0xCC31 ^ 0xCC32] = 0xCC1C ^ 0xCC32;
                byArray2[0x849 ^ 0x841] = 0xFFFFF7D7 ^ 0x841;
                byArray2[0x11DB ^ 0x11C9] = 0x11C9 ^ 0x11C9;
                byArray2[0xA4F9 ^ 0xA4FB] = 0xA4E6 ^ 0xA4FB;
                byArray2[0xB9F6 ^ 0xB9E3] = 0xFFFF4608 ^ 0xB9E3;
                byArray2[0x5289 ^ 0x528C] = 0x52FA ^ 0x528C;
                byArray2[0xDC87 ^ 0xDC8D] = 0xFFFF236D ^ 0xDC8D;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.main.vertex.element.A.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u0981\u09d7\u097a\u09d5\u09cb\u09e7\u0986\u099c\u09a5\u0979\u09d9\u09a0\u0974\u0972\u0982\u09d9\u09d4\u09e4".toCharArray();
                    for (int i = 0; i < 18; ++i) {
                        int n2 = cArray[i];
                        n2 -= 36738;
                        n2 ^= 0x7806;
                        n2 -= 935;
                        n2 += 59307;
                        n2 -= 42859;
                        n2 ^= 0xE8D5;
                        n2 ^= 0x2B5;
                        n2 ^= 0x6FB5;
                        n2 -= 34807;
                        n2 += 46777;
                        n2 -= 4380;
                        n2 -= 60765;
                        n2 -= 37887;
                        cArray[i] = (char)(n2 += 43199);
                    }
                    object4 = kotakbaz.rain.client.render.main.vertex.element.A.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[13] = 83;
                byArray4[10] = -52;
                byArray4[1] = 57;
                byArray4[5] = -17;
                byArray4[14] = -88;
                byArray4[0] = 120;
                byArray4[3] = 63;
                byArray4[12] = 59;
                byArray4[4] = 110;
                byArray4[6] = 8;
                byArray4[15] = -7;
                byArray4[7] = 96;
                byArray4[8] = 113;
                byArray4[11] = 5;
                byArray4[9] = -59;
                byArray4[2] = 15;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 1, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.main.vertex.element.A.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u3b0e\u3b62\u3b18".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 36416;
                        n3 ^= 0x3820;
                        n3 -= 47489;
                        n3 -= 37443;
                        n3 += 44451;
                        n3 ^= 0xDEE5;
                        n3 -= 56806;
                        n3 += 36231;
                        n3 += 60074;
                        n3 ^= 0xC7AE;
                        n3 -= 31536;
                        n3 -= 44308;
                        n3 ^= 0xA09B;
                        n3 += 43005;
                        cArray[i] = (char)(n3 -= 9406);
                    }
                    object5 = kotakbaz.rain.client.render.main.vertex.element.A.A()[2] = new String(cArray);
                }
                h = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.render.main.vertex.element.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\ucd93\ucd97\ucda5\ucd81\ucd95\ucd94\ucd95\ucd81\ucda2\ucd9d\ucd95\ucda5\ucd87\ucda2\ucdb3\ucdb6\ucdb6\ucdbb\ucc40\ucdb9".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0x8140;
                    n4 += 47843;
                    n4 += 45893;
                    n4 += 13717;
                    n4 += 53014;
                    n4 += 55526;
                    n4 -= 55386;
                    n4 -= 52507;
                    n4 += 60811;
                    cArray[i] = (char)(n4 += 8095);
                }
                object6 = kotakbaz.rain.client.render.main.vertex.element.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)h), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = i;
        if (i == null) {
            i = new Object[4];
            objectArray = i;
        }
        return objectArray;
    }

    public static void b() {
        I = new int[0x1093 ^ 0x1103];
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCFBE ^ 0xCEC5] = 0x7E43 ^ 0xCEC5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6610 ^ 0x66F7] = 0xFFFF996C ^ 0x66F7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3D84 ^ 0x3D8D] = 0xFFFFC262 ^ 0x3D8D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4DFF ^ 0x4CC6] = 0xE104 ^ 0x4CC6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBC86 ^ 0xBC9F] = 0xFFFF4315 ^ 0xBC9F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7E05 ^ 0x7EF6] = 0x5700 ^ 0x7EF6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB1DD ^ 0xB199] = 0xFFFF4E1B ^ 0xB199;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA6A8 ^ 0xA688] = 0xFFFF5928 ^ 0xA688;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1F2F ^ 0x1FD4] = 0xFFFF4D1F ^ 0x1FD4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFA04 ^ 0xFA2F] = 0xFA0B ^ 0xFA2F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x183 ^ 0x1B7] = 0xFFFFFE7D ^ 0x1B7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9F47 ^ 0x9E4E] = 0x6814 ^ 0x9E4E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCB28 ^ 0xCB97] = 0xCBF3 ^ 0xCB97;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7B5F ^ 0x7A5C] = 0xFFFFB233 ^ 0x7A5C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x105CC ^ 0x104BF] = 0x10491 ^ 0x104BF;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD2E9 ^ 0xD2E3] = 0xFFFF2D18 ^ 0xD2E3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF0F9 ^ 0xF0EA] = 0xF0FA ^ 0xF0EA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1FD2 ^ 0x1F49] = 0xFFFFE0AF ^ 0x1F49;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9EDC ^ 0x9ED9] = 0xFFFF610E ^ 0x9ED9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x34D ^ 0x25B] = 0x9579 ^ 0x25B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC0C1 ^ 0xC184] = 0x1D9F ^ 0xC184;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x36EE ^ 0x36ED] = 0x3687 ^ 0x36ED;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDCE4 ^ 0xDDE8] = 0x2BBD ^ 0xDDE8;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE1AD ^ 0xE0F1] = 0xA399 ^ 0xE0F1;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE336 ^ 0xE20A] = 0x7AA9 ^ 0xE20A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8067 ^ 0x8178] = 0xFFFF27A4 ^ 0x8178;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6270 ^ 0x6281] = 0x4B57 ^ 0x6281;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1D49 ^ 0x1D6B] = 0xFFFFE2DC ^ 0x1D6B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4E38 ^ 0x4E78] = 0x4E4A ^ 0x4E78;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF181 ^ 0xF0B6] = 0xEBEB ^ 0xF0B6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10375 ^ 0x103FD] = 0xFFFEFC38 ^ 0x103FD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x13E ^ 0x6E] = 0x9D03 ^ 0x6E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xADE7 ^ 0xAC97] = 0xACB9 ^ 0xAC97;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x109C6 ^ 0x109A9] = 0x17F35 ^ 0x109A9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xEDF8 ^ 0xED85] = 0xFFFF12F5 ^ 0xED85;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x84E6 ^ 0x85CF] = 0x6687 ^ 0x85CF;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD0C4 ^ 0xD0B3] = 0xD0C2 ^ 0xD0B3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA833 ^ 0xA972] = 0x660B ^ 0xA972;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2C6E ^ 0x2CFC] = 0x2C9B ^ 0x2CFC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8220 ^ 0x832B] = 0x751B ^ 0x832B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x56C ^ 0x401] = 0x7C97 ^ 0x401;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5231 ^ 0x5339] = 0x535E ^ 0x5339;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1F36 ^ 0x1E16] = 0x475E ^ 0x1E16;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9592 ^ 0x958C] = 0xFFFF6AC6 ^ 0x958C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA505 ^ 0xA5A1] = 0xA560 ^ 0xA5A1;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x61A8 ^ 0x6199] = 0x61E0 ^ 0x6199;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8C51 ^ 0x8C06] = 0xFFFF739A ^ 0x8C06;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8FDA ^ 0x8FED] = 0xFFFF7058 ^ 0x8FED;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x19B8 ^ 0x18A2] = 0xF2B9 ^ 0x18A2;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD0C6 ^ 0xD007] = 0xFFFF2F90 ^ 0xD007;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCF7C ^ 0xCF8B] = 0x90D4 ^ 0xCF8B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC964 ^ 0xC963] = 0xC935 ^ 0xC963;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD855 ^ 0xD826] = 0xD848 ^ 0xD826;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x699A ^ 0x6916] = 0xFFFF96C8 ^ 0x6916;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCE50 ^ 0xCED2] = 0xCEF5 ^ 0xCED2;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2459 ^ 0x24A5] = 0x89A0 ^ 0x24A5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFE3E ^ 0xFEF9] = 0xFED0 ^ 0xFEF9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3E8 ^ 0x343] = 0x301 ^ 0x343;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xAC50 ^ 0xAC0E] = 0xAC0C ^ 0xAC0E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x102F3 ^ 0x1022E] = 0x1116D ^ 0x1022E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8359 ^ 0x827A] = 0xFFFF1BBA ^ 0x827A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFD22 ^ 0xFC14] = 0xFFFF1894 ^ 0xFC14;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x363F ^ 0x372C] = 0xE028 ^ 0x372C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6226 ^ 0x6347] = 0xBEBD ^ 0x6347;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5964 ^ 0x59C8] = 0xFFFFA678 ^ 0x59C8;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF98B ^ 0xF89F] = 0x2FFF ^ 0xF89F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7175 ^ 0x7190] = 0xFFFF8E62 ^ 0x7190;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA696 ^ 0xA64D] = 0xA62D ^ 0xA64D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x52D7 ^ 0x539A] = 0xD2CF ^ 0x539A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD16E ^ 0xD1DE] = 0xFFFF3A67 ^ 0xD1DE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6858 ^ 0x6958] = 0x29BA ^ 0x6958;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x516D ^ 0x5128] = 0xFFFFAE72 ^ 0x5128;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE8DA ^ 0xE888] = 0xE8A8 ^ 0xE888;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5627 ^ 0x573A] = 0xE79 ^ 0x573A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x156 ^ 0x195] = 0xFFFFFE3F ^ 0x195;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5CAE ^ 0x5D29] = 0x5DEC ^ 0x5D29;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA76D ^ 0xA7E6] = 0xFFFF5832 ^ 0xA7E6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF4E5 ^ 0xF5BA] = 0xB6C4 ^ 0xF5BA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10B64 ^ 0x10B6C] = 0xFFFEF4CD ^ 0x10B6C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA997 ^ 0xA9BB] = 0xFFFF561B ^ 0xA9BB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3C43 ^ 0x3D31] = 0xFFFFC2DB ^ 0x3D31;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8B2E ^ 0x8B66] = 0xFFFF749E ^ 0x8B66;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xACD5 ^ 0xADFD] = 0xEFD8 ^ 0xADFD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8ED1 ^ 0x8E4F] = 0xFFFF7183 ^ 0x8E4F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA2AA ^ 0xA232] = 0xFFFF5DBA ^ 0xA232;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10A14 ^ 0x10B4C] = 0x1625D ^ 0x10B4C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x92FC ^ 0x9265] = 0x9207 ^ 0x9265;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7437 ^ 0x7571] = 0xA922 ^ 0x7571;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7787 ^ 0x772F] = 0xFFFF88E6 ^ 0x772F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1096F ^ 0x1087A] = 0x19F5E ^ 0x1087A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF039 ^ 0xF011] = 0xF001 ^ 0xF011;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA0D0 ^ 0xA054] = 0xFFFF5F9A ^ 0xA054;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8352 ^ 0x823B] = 0x7C98 ^ 0x823B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x60F0 ^ 0x60E5] = 0x60F2 ^ 0x60E5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2A15 ^ 0x2ADA] = 0xFFFFD513 ^ 0x2ADA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDD85 ^ 0xDCBD] = 0x7170 ^ 0xDCBD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10D9F ^ 0x10D53] = 0x10D6B ^ 0x10D53;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8546 ^ 0x840A] = 0x55E ^ 0x840A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2F1B ^ 0x2E6E] = 0x9E5 ^ 0x2E6E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB5E3 ^ 0xB54A] = 0xB511 ^ 0xB54A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6004 ^ 0x60EC] = 0xFFFF9F69 ^ 0x60EC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6B02 ^ 0x6A3D] = 0xF29A ^ 0x6A3D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4E7C ^ 0x4EAC] = 0x4E84 ^ 0x4EAC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDC8 ^ 0xCAE] = 0x6373 ^ 0xCAE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1C46 ^ 0x1C05] = 0x1C6F ^ 0x1C05;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1EE9 ^ 0x1E88] = 0x1E08 ^ 0x1E88;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE9DC ^ 0xE95C] = 0xE96E ^ 0xE95C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4E40 ^ 0x4E57] = 0x4E4D ^ 0x4E57;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFECA ^ 0xFEBF] = 0xFFFF0111 ^ 0xFEBF;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x18CF ^ 0x18BE] = 0x1882 ^ 0x18BE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDA6D ^ 0xDA2C] = 0xFFFF25C6 ^ 0xDA2C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDDC5 ^ 0xDDD5] = 0xDDB7 ^ 0xDDD5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x186C ^ 0x1966] = 0xEF33 ^ 0x1966;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD27A ^ 0xD33E] = 0xF2C ^ 0xD33E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFEDF ^ 0xFE33] = 0xFE32 ^ 0xFE33;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xAEBF ^ 0xAE5D] = 0xAE18 ^ 0xAE5D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10B04 ^ 0x10A7A] = 0x11A09 ^ 0x10A7A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC28C ^ 0xC281] = 0xFFFF3D3B ^ 0xC281;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBC31 ^ 0xBC5D] = 0xE465 ^ 0xBC5D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1C9C ^ 0x1D8C] = 0x38E9 ^ 0x1D8C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB06D ^ 0xB022] = 0xFFFF4FC5 ^ 0xB022;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7E1 ^ 0x6E6] = 0xFFFFF964 ^ 0x6E6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x22FE ^ 0x220B] = 0x7D01 ^ 0x220B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x31D9 ^ 0x3167] = 0x3169 ^ 0x3167;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xEFEE ^ 0xEED0] = 0xFFFF89CE ^ 0xEED0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x23DC ^ 0x22F3] = 0xFFFEDE1A ^ 0x22F3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF0D9 ^ 0xF0CD] = 0xF0B5 ^ 0xF0CD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x24D6 ^ 0x24B5] = 0x7733 ^ 0x24B5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6A60 ^ 0x6A5E] = 0x6A02 ^ 0x6A5E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2B05 ^ 0x2BBF] = 0x2BBF ^ 0x2BBF;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x912F ^ 0x91D2] = 0xD135 ^ 0x91D2;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB7FF ^ 0xB749] = 0xB775 ^ 0xB749;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xEF95 ^ 0xEEC4] = 0x73BA ^ 0xEEC4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4152 ^ 0x4180] = 0x41F0 ^ 0x4180;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x105A1 ^ 0x105AF] = 0x10589 ^ 0x105AF;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x131F ^ 0x13A4] = 0x139B ^ 0x13A4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10140 ^ 0x101AD] = 0x101AC ^ 0x101AD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7532 ^ 0x7511] = 0xFFFF8AC3 ^ 0x7511;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x22CF ^ 0x23E4] = 0xC0B4 ^ 0x23E4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB68E ^ 0xB7CE] = 0x78AD ^ 0xB7CE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFEBC ^ 0xFEA6] = 0xFEAB ^ 0xFEA6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x104C4 ^ 0x105EE] = 0x1E6A2 ^ 0x105EE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE909 ^ 0xE9FD] = 0xC02B ^ 0xE9FD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCE71 ^ 0xCE89] = 0x918A ^ 0xCE89;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1749 ^ 0x17E3] = 0xFFFFE815 ^ 0x17E3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCC5E ^ 0xCD7C] = 0xAB3D ^ 0xCD7C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9CF5 ^ 0x9DEE] = 0x778C ^ 0x9DEE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xEE76 ^ 0xEE77] = 0xFFFF119B ^ 0xEE77;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB3AD ^ 0xB34D] = 0xFFFF4CC3 ^ 0xB34D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7573 ^ 0x7404] = 0x538F ^ 0x7404;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFA87 ^ 0xFA59] = 0xFFFF05E1 ^ 0xFA59;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC000 ^ 0xC0B4] = 0xFFFF3F19 ^ 0xC0B4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA746 ^ 0xA7CB] = 0xA7FB ^ 0xA7CB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7DC3 ^ 0x7CB2] = 0x7C9C ^ 0x7CB2;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x87B4 ^ 0x87E4] = 0xFFFF7813 ^ 0x87E4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4626 ^ 0x46BC] = 0xFFFFB976 ^ 0x46BC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFF46 ^ 0xFF4A] = 0xFFFF008A ^ 0xFF4A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2A06 ^ 0x2A09] = 0x2ACC ^ 0x2A09;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7618 ^ 0x7673] = 0x7FC5 ^ 0x7673;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4A36 ^ 0x4AA9] = 0xFFFFB573 ^ 0x4AA9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1E6F ^ 0x1EB8] = 0x1EC7 ^ 0x1EB8;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBE15 ^ 0xBF68] = 0xAF26 ^ 0xBF68;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1C2 ^ 0x1BB] = 0xFFFFFE11 ^ 0x1BB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBA29 ^ 0xBA00] = 0xBA3B ^ 0xBA00;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD54E ^ 0xD575] = 0xD549 ^ 0xD575;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCDDB ^ 0xCD2B] = 0xA450 ^ 0xCD2B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1406 ^ 0x1588] = 0x8DD4 ^ 0x1588;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8F3B ^ 0x8FDA] = 0xFFFF7015 ^ 0x8FDA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xABBE ^ 0xAAF9] = 0x76E2 ^ 0xAAF9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBD02 ^ 0xBDEB] = 0xBDEA ^ 0xBDEB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC741 ^ 0xC753] = 0xC73B ^ 0xC753;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE1AB ^ 0xE1F0] = 0xE1F0 ^ 0xE1F0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2AB9 ^ 0x2BA1] = 0xBC83 ^ 0x2BA1;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9CA1 ^ 0x9C97] = 0x9CC5 ^ 0x9C97;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x894B ^ 0x890D] = 0x8965 ^ 0x890D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x44C0 ^ 0x44AA] = 0x1D9C ^ 0x44AA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7496 ^ 0x75A3] = 0x6EFE ^ 0x75A3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFC3B ^ 0xFD5F] = 0x92E1 ^ 0xFD5F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xECEF ^ 0xEC0C] = 0xFFFF13F2 ^ 0xEC0C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD6C5 ^ 0xD74A] = 0x4F73 ^ 0xD74A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD46E ^ 0xD4E7] = 0xFFFF2B16 ^ 0xD4E7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC823 ^ 0xC8F7] = 0xDC33 ^ 0xC8F7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD50B ^ 0xD532] = 0xFFFF2A98 ^ 0xD532;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD72B ^ 0xD63A] = 0x157 ^ 0xD63A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xACAA ^ 0xAC72] = 0xFFFF53EA ^ 0xAC72;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFE53 ^ 0xFF55] = 0xFF32 ^ 0xFF55;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4878 ^ 0x4896] = 0x4896 ^ 0x4896;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x42DD ^ 0x42ED] = 0x422A ^ 0x42ED;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB67F ^ 0xB6B4] = 0xA538 ^ 0xB6B4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3154 ^ 0x301E] = 0xD91A ^ 0x301E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3D11 ^ 0x3DA3] = 0xFFFFC218 ^ 0x3DA3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xAD94 ^ 0xACAF] = 0x16D ^ 0xACAF;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA4CF ^ 0xA59D] = 0xFFFFC728 ^ 0xA59D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD722 ^ 0xD773] = 0xD75A ^ 0xD773;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDF7F ^ 0xDFCE] = 0xFFFF2032 ^ 0xDFCE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10D01 ^ 0x10D0A] = 0xFFFEF2FE ^ 0x10D0A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6BC ^ 0x7D6] = 0xFFFF06B5 ^ 0x7D6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1564 ^ 0x1566] = 0x156A ^ 0x1566;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4002 ^ 0x40ED] = 0x2986 ^ 0x40ED;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x23FC ^ 0x22EE] = 0xF58E ^ 0x22EE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD98B ^ 0xD8DD] = 0xDD3F ^ 0xD8DD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3039 ^ 0x315B] = 0xFFFF132D ^ 0x315B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x806 ^ 0x820] = 0x83A ^ 0x820;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x17C1 ^ 0x16C0] = 0x2140 ^ 0x16C0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4A6 ^ 0x5BA] = 0xEFA1 ^ 0x5BA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA37C ^ 0xA2F9] = 0xA23C ^ 0xA2F9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCF5 ^ 0xDBE] = 0xE4FD ^ 0xDBE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD53E ^ 0xD429] = 0xFFFFBCE2 ^ 0xD429;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBEF5 ^ 0xBFBB] = 0xFFFFC104 ^ 0xBFBB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1548 ^ 0x1594] = 0xFFFFEA3E ^ 0x1594;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB1D3 ^ 0xB189] = 0xB18A ^ 0xB189;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDF3E ^ 0xDF11] = 0xDF70 ^ 0xDF11;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8E80 ^ 0x8EE0] = 0x8EE0 ^ 0x8EE0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF8D7 ^ 0xF8B0] = 0xF95F ^ 0xF8B0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC52C ^ 0xC409] = 0x8620 ^ 0xC409;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x35F2 ^ 0x347E] = 0xAC5F ^ 0x347E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5DC9 ^ 0x5C4D] = 0x5C8E ^ 0x5C4D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x261 ^ 0x36E] = 0x2607 ^ 0x36E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10DC4 ^ 0x10D9C] = 0x10DCD ^ 0x10D9C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCC6C ^ 0xCC4B] = 0xCC00 ^ 0xCC4B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x65CB ^ 0x64AC] = 0xB0E ^ 0x64AC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8A30 ^ 0x8A40] = 0x8A40 ^ 0x8A40;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3339 ^ 0x33DD] = 0x33D5 ^ 0x33DD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x94DE ^ 0x941B] = 0xFFFF6BF9 ^ 0x941B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCB48 ^ 0xCBD8] = 0xCBBD ^ 0xCBD8;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5E00 ^ 0x5E1D] = 0x5E0B ^ 0x5E1D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8188 ^ 0x81EC] = 0xCCC4 ^ 0x81EC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9162 ^ 0x906F] = 0xB502 ^ 0x906F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2198 ^ 0x2136] = 0x2130 ^ 0x2136;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10203 ^ 0x102F9] = 0x1AFFC ^ 0x102F9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD2F7 ^ 0xD208] = 0xFFFF6D63 ^ 0xD208;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x852E ^ 0x84A3] = 0x1C9A ^ 0x84A3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD102 ^ 0xD18C] = 0xFFFF2E62 ^ 0xD18C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x31A5 ^ 0x317F] = 0xFFFFCEB5 ^ 0x317F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4492 ^ 0x4417] = 0xFFFFBBA0 ^ 0x4417;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6D ^ 0xCB] = 0xA1 ^ 0xCB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5B92 ^ 0x5B5F] = 0xFFFFA49D ^ 0x5B5F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x495B ^ 0x49CF] = 0x4990 ^ 0x49CF;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC3CA ^ 0xC3A4] = 0x6D9F ^ 0xC3A4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6086 ^ 0x6082] = 0x60F1 ^ 0x6082;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1A32 ^ 0x1B5A] = 0xE5E8 ^ 0x1B5A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x984D ^ 0x9812] = 0x9812 ^ 0x9812;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x75B5 ^ 0x75CB] = 0x75F9 ^ 0x75CB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8E44 ^ 0x8E2C] = 0x761D ^ 0x8E2C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7D16 ^ 0x7C24] = 0x1DBC ^ 0x7C24;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xAA4 ^ 0xA19] = 0xFFFFF5CB ^ 0xA19;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD11A ^ 0xD1F1] = 0xD1F1 ^ 0xD1F1;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x496D ^ 0x499F] = 0x6049 ^ 0x499F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x831C ^ 0x8381] = 0x83B8 ^ 0x8381;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6EDE ^ 0x6E6D] = 0x6EA9 ^ 0x6E6D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8FE8 ^ 0x8F1E] = 0xD01D ^ 0x8F1E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCFBF ^ 0xCE39] = 0xFFFF3133 ^ 0xCE39;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x791F ^ 0x7841] = 0x3B2E ^ 0x7841;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xECFA ^ 0xEC3E] = 0xEC52 ^ 0xEC3E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE0E7 ^ 0xE068] = 0xE085 ^ 0xE068;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB1C0 ^ 0xB1C6] = 0xFFFF4EAD ^ 0xB1C6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x68B8 ^ 0x698B] = 0x833 ^ 0x698B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1ECF ^ 0x1EB9] = 0x1EF0 ^ 0x1EB9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x409A ^ 0x41D9] = 0x8EA0 ^ 0x41D9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7181 ^ 0x70D6] = 0x754D ^ 0x70D6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x50F4 ^ 0x5099] = 0x8402 ^ 0x5099;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x70A3 ^ 0x71A1] = 0x4623 ^ 0x71A1;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x646F ^ 0x6501] = 0x1D98 ^ 0x6501;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9CAF ^ 0x9C8E] = 0xFFFF6377 ^ 0x9C8E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7CA3 ^ 0x7CD7] = 0x7CC0 ^ 0x7CD7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCDE0 ^ 0xCCCC] = 0x2F80 ^ 0xCCCC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3FC1 ^ 0x3F14] = 0x3F7C ^ 0x3F14;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x84BF ^ 0x8582] = 0x1D25 ^ 0x8582;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10AE7 ^ 0x10A36] = 0x10A87 ^ 0x10A36;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2789 ^ 0x27F5] = 0xFFFFD855 ^ 0x27F5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2F50 ^ 0x2FFD] = 0xFFFFD034 ^ 0x2FFD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xFFBA ^ 0xFEC5] = 0xEE8B ^ 0xFEC5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4D0F ^ 0x4C87] = 0xE46E ^ 0x4C87;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x82E3 ^ 0x82D0] = 0xFFFF7D9E ^ 0x82D0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDF76 ^ 0xDE0A] = 0xCE54 ^ 0xDE0A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC93 ^ 0xDE7] = 0x2A60 ^ 0xDE7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x82ED ^ 0x83B0] = 0xC0CE ^ 0x83B0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD818 ^ 0xD818] = 0xD858 ^ 0xD818;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1294 ^ 0x12D6] = 0x12E2 ^ 0x12D6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD577 ^ 0xD5B9] = 0xD5D8 ^ 0xD5B9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBDBA ^ 0xBD1B] = 0xFFFF42F6 ^ 0xBD1B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2B95 ^ 0x2B00] = 0x2B17 ^ 0x2B00;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2392 ^ 0x23C7] = 0xFFFFDC5F ^ 0x23C7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x48FE ^ 0x49D9] = 0xFFFFF412 ^ 0x49D9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x90EC ^ 0x91DC] = 0x1928B ^ 0x91DC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF84 ^ 0xEA9] = 0x10DF4 ^ 0xEA9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7BE5 ^ 0x7B2C] = 0xFFFF84B0 ^ 0x7B2C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF293 ^ 0xF2BE] = 0xFFFF0DD0 ^ 0xF2BE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE133 ^ 0xE0BA] = 0x484C ^ 0xE0BA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x489A ^ 0x485A] = 0xFFFFB7A4 ^ 0x485A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1BB4 ^ 0x1B8E] = 0x1BB4 ^ 0x1B8E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9BBB ^ 0x9B89] = 0x9BA7 ^ 0x9B89;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDAF0 ^ 0xDB7B] = 0x738D ^ 0xDB7B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2A46 ^ 0x2B1D] = 0x420B ^ 0x2B1D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB2E1 ^ 0xB3B8] = 0xDAAE ^ 0xB3B8;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2758 ^ 0x27D9] = 0xFFFFD812 ^ 0x27D9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x104B1 ^ 0x10420] = 0xFFFEFBA8 ^ 0x10420;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7F1B ^ 0x7E63] = 0xCEF1 ^ 0x7E63;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7B3B ^ 0x7B9E] = 0x7BE9 ^ 0x7B9E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x98F ^ 0x9DB] = 0x9B3 ^ 0x9DB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC2C5 ^ 0xC3F4] = 0xC3F4 ^ 0xC3F4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xED04 ^ 0xED12] = 0xFFFF12CF ^ 0xED12;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10332 ^ 0x10261] = 0x19F1F ^ 0x10261;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1792 ^ 0x1705] = 0x1749 ^ 0x1705;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6B41 ^ 0x6B3B] = 0xFFFF94AC ^ 0x6B3B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4716 ^ 0x475D] = 0xFFFFB8FA ^ 0x475D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x33F2 ^ 0x33BC] = 0x338C ^ 0x33BC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3EB4 ^ 0x3E01] = 0xFFFFC191 ^ 0x3E01;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x90CC ^ 0x90F3] = 0x909B ^ 0x90F3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x59AF ^ 0x58CA] = 0x3768 ^ 0x58CA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x686A ^ 0x68B9] = 0xFFFF977D ^ 0x68B9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10290 ^ 0x102AC] = 0x1027D ^ 0x102AC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x87F3 ^ 0x87E8] = 0x87A3 ^ 0x87E8;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x77E6 ^ 0x7741] = 0x77F3 ^ 0x7741;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE27 ^ 0xEF8] = 0xE82 ^ 0xEF8;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9DCD ^ 0x9DF5] = 0xFFFF6276 ^ 0x9DF5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xEA1C ^ 0xEB96] = 0xFFFFBCEE ^ 0xEB96;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCF3 ^ 0xC8B] = 0xFFFFF330 ^ 0xC8B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10391 ^ 0x10328] = 0x11768 ^ 0x10328;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xAA04 ^ 0xAB68] = 0xD3E9 ^ 0xAB68;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xEF82 ^ 0xEFEB] = 0x2EDD ^ 0xEFEB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCB81 ^ 0xCAEA] = 0x3449 ^ 0xCAEA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x328 ^ 0x209] = 0x644B ^ 0x209;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3212 ^ 0x3316] = 0x494 ^ 0x3316;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x104D2 ^ 0x104B7] = 0x160FA ^ 0x104B7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC820 ^ 0xC8F9] = 0xFFFF371A ^ 0xC8F9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x297D ^ 0x2920] = 0x2920 ^ 0x2920;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xAD53 ^ 0xAD6E] = 0xFFFF52C5 ^ 0xAD6E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x78D8 ^ 0x78C7] = 0x78B1 ^ 0x78C7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA28 ^ 0xA0D] = 0xA7A ^ 0xA0D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF669 ^ 0xF697] = 0xB675 ^ 0xF697;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA876 ^ 0xA952] = 0xCF13 ^ 0xA952;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6AEA ^ 0x6ACE] = 0x6AB3 ^ 0x6ACE;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xEB2 ^ 0xF86] = 0x14D5 ^ 0xF86;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE267 ^ 0xE249] = 0xFFFF1DE6 ^ 0xE249;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x508F ^ 0x51D5] = 0x38BF ^ 0x51D5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3459 ^ 0x3413] = 0xFFFFCBF6 ^ 0x3413;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5692 ^ 0x5630] = 0x5651 ^ 0x5630;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDB03 ^ 0xDA0D] = 0xFF68 ^ 0xDA0D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDB2B ^ 0xDA7F] = 0xDFFD ^ 0xDA7F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x34B3 ^ 0x34F4] = 0xFFFFCB16 ^ 0x34F4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD627 ^ 0xD63F] = 0xD69C ^ 0xD63F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5CBE ^ 0x5CED] = 0xFFFFA33A ^ 0x5CED;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7599 ^ 0x7487] = 0x2DCF ^ 0x7487;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xD2F ^ 0xD4D] = 0xCBE8 ^ 0xD4D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9270 ^ 0x9325] = 0x96BE ^ 0x9325;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7A91 ^ 0x7A77] = 0x6E6D ^ 0x7A77;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBC53 ^ 0xBC85] = 0xFFFF4322 ^ 0xBC85;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8C2C ^ 0x8C53] = 0xFFFF73D1 ^ 0x8C53;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2D8E ^ 0x2D44] = 0x2D30 ^ 0x2D44;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5752 ^ 0x564B] = 0xBC5E ^ 0x564B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x1060C ^ 0x106BB] = 0x106B7 ^ 0x106BB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA954 ^ 0xA834] = 0x75D3 ^ 0xA834;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4353 ^ 0x4225] = 0x659F ^ 0x4225;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC1C5 ^ 0xC1F0] = 0xFFFF3E54 ^ 0xC1F0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4A79 ^ 0x4A68] = 0xFFFFB5D5 ^ 0x4A68;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8D2 ^ 0x858] = 0xFFFFF7FD ^ 0x858;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDAC0 ^ 0xDA9C] = 0xDA9D ^ 0xDA9C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF51 ^ 0xFD6] = 0xFFFFF070 ^ 0xFD6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8C1C ^ 0x8CA0] = 0xFFFF7341 ^ 0x8CA0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE86 ^ 0xEF4] = 0xFFFFF17A ^ 0xEF4;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x9B83 ^ 0x9ACA] = 0x7389 ^ 0x9ACA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF515 ^ 0xF495] = 0xF05E ^ 0xF495;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xBD85 ^ 0xBCAB] = 0x1BFFC ^ 0xBCAB;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x58BC ^ 0x58C7] = 0x58CD ^ 0x58C7;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xCDA0 ^ 0xCCA5] = 0xCCC5 ^ 0xCCA5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10346 ^ 0x1036C] = 0xFFFEFC88 ^ 0x1036C;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8C6B ^ 0x8CA9] = 0x9F43 ^ 0x8CA9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5B29 ^ 0x5B60] = 0xFFFFA49D ^ 0x5B60;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xDB42 ^ 0xDA21] = 0x7DB ^ 0xDA21;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7CC7 ^ 0x7C68] = 0x7C5F ^ 0x7C68;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE35A ^ 0xE223] = 0x52A5 ^ 0xE223;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3A22 ^ 0x3B4D] = 0x43DB ^ 0x3B4D;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6E3E ^ 0x6EF8] = 0xFFFF9131 ^ 0x6EF8;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4E85 ^ 0x4E6F] = 0x4E6D ^ 0x4E6F;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x16B0 ^ 0x16D6] = 0x7579 ^ 0x16D6;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7626 ^ 0x766A] = 0xFFFF89B3 ^ 0x766A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x5F1E ^ 0x5E64] = 0xEEA3 ^ 0x5E64;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x6889 ^ 0x681A] = 0xFFFF97F2 ^ 0x681A;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x630A ^ 0x6289] = 0x665C ^ 0x6289;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xB05C ^ 0xB0FC] = 0xFFFF4F2E ^ 0xB0FC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2B21 ^ 0x2A07] = 0x6822 ^ 0x2A07;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xE5DF ^ 0xE559] = 0xFFFF1AA4 ^ 0xE559;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC314 ^ 0xC359] = 0xC307 ^ 0xC359;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x424E ^ 0x42ED] = 0x4283 ^ 0x42ED;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x7364 ^ 0x73DC] = 0xFFFF8C0D ^ 0x73DC;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC656 ^ 0xC69E] = 0xC68C ^ 0xC69E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xA842 ^ 0xA9C3] = 0xAD16 ^ 0xA9C3;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x3AF6 ^ 0x3AEA] = 0x3AAB ^ 0x3AEA;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC834 ^ 0xC97B] = 0x482E ^ 0xC97B;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8AE2 ^ 0x8BA0] = 0xFFFFBB2B ^ 0x8BA0;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xF7EA ^ 0xF6A2] = 0x1FEC ^ 0xF6A2;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x495B ^ 0x48D9] = 0xFFFFB3D5 ^ 0x48D9;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x8903 ^ 0x8955] = 0xFFFF76A2 ^ 0x8955;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0xC49 ^ 0xCD5] = 0xFFFFF318 ^ 0xCD5;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x2C7 ^ 0x3FD] = 0xFFFF5186 ^ 0x3FD;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x35C0 ^ 0x3599] = 0xFFFFCA74 ^ 0x3599;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x90B8 ^ 0x902E] = 0xFFFF6F85 ^ 0x902E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x10AC7 ^ 0x10A3E] = 0x1A73A ^ 0x10A3E;
        kotakbaz.rain.client.render.main.vertex.element.A.I[0x4C49 ^ 0x4CCA] = 0xFFFFB34E ^ 0x4CCA;
    }
}

