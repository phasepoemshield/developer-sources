/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.engine.dispatcher;

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
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.vertex.mesh.a_0;
import kotakbaz.rain.client.render.main.vertex.mesh.b_0;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2={"Lkotakbaz/rain/client/util/render/engine/dispatcher/RenderBatch;", "", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "owner", "Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "builder", "state", "<init>", "(Lkotakbaz/rain/client/util/render/engine/Renderable;Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;Ljava/lang/Object;)V", "", "flush", "()V", "Lkotakbaz/rain/client/util/render/engine/Renderable;", "getOwner", "()Lkotakbaz/rain/client/util/render/engine/Renderable;", "Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "getBuilder", "()Lkotakbaz/rain/client/render/main/vertex/mesh/MeshBuilder;", "Ljava/lang/Object;", "getState", "()Ljava/lang/Object;", "rain-visuals"})
public final class RenderBatch {
    @NotNull
    private final Renderable a;
    @Nullable
    private final a_0 A;
    @Nullable
    private final Object b;
    private static Object[] B;
    private static Object C;
    private static Object[] d;
    private static Object[] c;
    private static Object[] D;
    public static int[] e;

    public RenderBatch(@NotNull Renderable owner, @Nullable a_0 builder, @Nullable Object state2) {
        int n2 = e[0];
        n2 -= e[1];
        Intrinsics.checkNotNullParameter(owner, (String)B[n2 ^= e[2]]);
        this.a = owner;
        this.A = builder;
        this.b = state2;
    }

    @NotNull
    public final Renderable getOwner() {
        return this.a;
    }

    @Nullable
    public final a_0 getBuilder() {
        return this.A;
    }

    @Nullable
    public final Object getState() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void flush() {
        long l2 = 1520004664094408798L;
        if (this.A == null) {
            return;
        }
        try {
            b_0 b_02;
            b_0 b_03 = b_02 = this.A.buildNullable();
            if (b_03 != null) {
                b_0 b_04 = b_03;
                long l3 = l2;
                int n2 = e[3];
                n2 ^= e[4];
                l2 = l3 ^ (0L ^ l3) & -1L << (n2 ^= e[5]);
                this.a.renderBatch(b_02, this.b);
            }
        }
        finally {
            ChromaRenderer.recycleMeshBuilder(this.A);
        }
    }

    static {
        RenderBatch.b();
        long l2 = -5640122410979167584L;
        long l3 = 7219254788100117068L;
        long l4 = -4370628696145342864L;
        long l5 = -2640098580290126970L;
        long l6 = 4729075887573970079L;
        long l7 = -2242362435957077467L;
        long l8 = 4479175584776289465L;
        long l9 = -2021248770457683459L;
        long l10 = -1723324078704776644L;
        long l11 = -3636185133280556711L;
        long l12 = -8110599390803697045L;
        long l13 = 6162488861752026346L;
        long l14 = -423424289614044319L;
        long l15 = 2718862595831258875L;
        int n2 = e[6];
        n2 -= e[7];
        B = new Object[n2 ^= e[8]];
        long l16 = l15;
        int n3 = e[9];
        n3 ^= e[10];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += e[11]);
        Object[] objectArray = new Object[e[12]];
        objectArray[RenderBatch.e[13]] = c;
        objectArray[RenderBatch.e[14]] = e[15];
        int n4 = e[16];
        Object object = RenderBatch.A()[e[17]];
        if (object == null) {
            char[] cArray = "\ub9e1\ub9cf\ub9ae\ub9a4\ub9b1\ub9c0\ub9c6\ub9f4\ub9e5\ub9c6\ub9e4\ub9a4\ub9da\ub9e3\ub9f0\uba12\ub9d1\ub9ab\ub9f1\ub9b1\ub9f7\ub9e4\ub9d3\ub9fc\ub9d0\ub9c9\ub9fe\ub9a2\ub9ef\ub9e7\ub9fb\ub9e9\ub9e7\ub9f3\ub9c3\ub9e7\ub9e3\ub9fa\ub9e0\ub91c\uba1b\ub9e5\ub9f0\ub9f6".toCharArray();
            for (int i2 = e[18]; i2 < e[19]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= e[20];
                n5 += e[21];
                n5 ^= e[22];
                n5 -= e[23];
                n5 += e[24];
                n5 ^= e[25];
                n5 ^= e[26];
                n5 += e[27];
                n5 -= e[28];
                n5 ^= e[29];
                n5 -= e[30];
                n5 -= e[31];
                n5 ^= e[32];
                cArray[i2] = (char)(n5 += e[33]);
            }
            object = RenderBatch.A()[RenderBatch.e[34]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)RenderBatch.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = e[35];
        n6 ^= e[36];
        l6 = l17 ^ (0x700000000L ^ l17) & -1L << (n6 -= e[37]);
        long l18 = l13;
        int n7 = e[38];
        n7 -= e[39];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= e[40]);
        while (true) {
            int n8 = e[41];
            if ((int)l13 >= (int)(l6 >>> (n8 += e[42]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = e[43];
            n10 ^= e[44];
            int n11 = e[46];
            n11 += e[47];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += e[45])) & -1L >>> (n11 ^= e[48]);
            long l20 = l9;
            int n12 = e[49];
            n12 += e[50];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= e[51]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = e[52];
            n14 -= e[53];
            int n15 = e[55];
            n15 ^= e[56];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= e[54])) & -1L >>> (n15 += e[57]);
            int n16 = e[58];
            n16 ^= e[59];
            long l22 = l10;
            int n17 = e[61];
            n17 ^= e[62];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += e[60]) ^ l22) & -1L << (n17 -= e[63]);
            int n18 = e[64];
            n18 += e[65];
            n18 ^= e[66];
            int n19 = e[67];
            n19 ^= e[68];
            long l23 = l12;
            int n20 = e[70];
            n20 -= e[71];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= e[69]))) ^ l23) & -1L >>> (n20 -= e[72]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = e[73];
            n21 -= e[74];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += e[75]);
            while (true) {
                int n22 = e[76];
                n22 ^= e[77];
                if ((int)(l14 >>> (n22 += e[78])) >= (int)l12) break;
                int n23 = e[79];
                n23 += e[80];
                int n24 = e[82];
                n24 ^= e[83];
                cArray2[(int)(l14 >>> (n23 ^= RenderBatch.e[81]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= e[84]))];
                l14 += 0x100000000L;
            }
            int n25 = e[85];
            n25 ^= e[86];
            int n26 = (int)(l15 >>> (n25 += e[87]));
            l15 += 0x100000000L;
            RenderBatch.B[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = e[88];
            n27 -= e[89];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= e[90]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[e[91]];
        String string = (String)object[e[92]];
        object = object[e[93]];
        Object[] objectArray = d;
        if (d == null) {
            objectArray = d = new Object[e[94]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[e[95]];
                c = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[e[97] ^ e[98]];
                byArray[RenderBatch.e[99] ^ RenderBatch.e[100]] = e[101] ^ e[102];
                byArray[RenderBatch.e[103] ^ RenderBatch.e[104]] = e[105] ^ e[106];
                byArray[RenderBatch.e[107] ^ RenderBatch.e[108]] = e[109] ^ e[110];
                byArray[RenderBatch.e[111] ^ RenderBatch.e[112]] = e[113] ^ e[114];
                byArray[RenderBatch.e[115] ^ RenderBatch.e[116]] = e[117] ^ e[118];
                byArray[RenderBatch.e[119] ^ RenderBatch.e[120]] = e[121] ^ e[122];
                byArray[RenderBatch.e[123] ^ RenderBatch.e[124]] = e[125] ^ e[126];
                byArray[RenderBatch.e[127] ^ RenderBatch.e[128]] = e[129] ^ e[130];
                byArray[RenderBatch.e[131] ^ RenderBatch.e[132]] = e[133] ^ e[134];
                byArray[RenderBatch.e[135] ^ RenderBatch.e[136]] = e[137] ^ e[138];
                byArray[RenderBatch.e[139] ^ RenderBatch.e[140]] = e[141] ^ e[142];
                byArray[RenderBatch.e[143] ^ RenderBatch.e[144]] = e[145] ^ e[146];
                byArray[RenderBatch.e[147] ^ RenderBatch.e[148]] = e[149] ^ e[150];
                byArray[RenderBatch.e[151] ^ RenderBatch.e[152]] = e[153] ^ e[154];
                byArray[RenderBatch.e[155] ^ RenderBatch.e[156]] = e[157] ^ e[158];
                byArray[RenderBatch.e[159] ^ RenderBatch.e[160]] = e[161] ^ e[162];
                objectArray2[RenderBatch.e[96]] = byArray;
            }
            byte[] byArray = (byte[])object3[e[163]];
            if (C == null) {
                byte[] byArray2 = new byte[e[164] ^ e[165]];
                byArray2[RenderBatch.e[166] ^ RenderBatch.e[167]] = e[168] ^ e[169];
                byArray2[RenderBatch.e[170] ^ RenderBatch.e[171]] = e[172] ^ e[173];
                byArray2[RenderBatch.e[174] ^ RenderBatch.e[175]] = e[176] ^ e[177];
                byArray2[RenderBatch.e[178] ^ RenderBatch.e[179]] = e[180] ^ e[181];
                byArray2[RenderBatch.e[182] ^ RenderBatch.e[183]] = e[184] ^ e[185];
                byArray2[RenderBatch.e[186] ^ RenderBatch.e[187]] = e[188] ^ e[189];
                byArray2[RenderBatch.e[190] ^ RenderBatch.e[191]] = e[192] ^ e[193];
                byArray2[RenderBatch.e[194] ^ RenderBatch.e[195]] = e[196] ^ e[197];
                byArray2[RenderBatch.e[198] ^ RenderBatch.e[199]] = e[200] ^ e[201];
                byArray2[RenderBatch.e[202] ^ RenderBatch.e[203]] = e[204] ^ e[205];
                byArray2[RenderBatch.e[206] ^ RenderBatch.e[207]] = e[208] ^ e[209];
                byArray2[RenderBatch.e[210] ^ RenderBatch.e[211]] = e[212] ^ e[213];
                byArray2[RenderBatch.e[214] ^ RenderBatch.e[215]] = e[216] ^ e[217];
                byArray2[RenderBatch.e[218] ^ RenderBatch.e[219]] = e[220] ^ e[221];
                byArray2[RenderBatch.e[222] ^ RenderBatch.e[223]] = e[224] ^ e[225];
                byArray2[RenderBatch.e[226] ^ RenderBatch.e[227]] = e[228] ^ e[229];
                byArray2[RenderBatch.e[230] ^ RenderBatch.e[231]] = e[232] ^ e[233];
                byArray2[RenderBatch.e[234] ^ RenderBatch.e[235]] = e[236] ^ e[237];
                byArray2[RenderBatch.e[238] ^ RenderBatch.e[239]] = e[240] ^ e[241];
                byArray2[RenderBatch.e[242] ^ RenderBatch.e[243]] = e[244] ^ e[245];
                byArray2[RenderBatch.e[246] ^ RenderBatch.e[247]] = e[248] ^ e[249];
                byArray2[RenderBatch.e[250] ^ RenderBatch.e[251]] = e[252] ^ e[253];
                byArray2[RenderBatch.e[254] ^ RenderBatch.e[255]] = e[256] ^ e[257];
                byArray2[RenderBatch.e[258] ^ RenderBatch.e[259]] = e[260] ^ e[261];
                byArray2[RenderBatch.e[262] ^ RenderBatch.e[263]] = e[264] ^ e[265];
                byArray2[RenderBatch.e[266] ^ RenderBatch.e[267]] = e[268] ^ e[269];
                byArray2[RenderBatch.e[270] ^ RenderBatch.e[271]] = e[272] ^ e[273];
                byArray2[RenderBatch.e[274] ^ RenderBatch.e[275]] = e[276] ^ e[277];
                byArray2[RenderBatch.e[278] ^ RenderBatch.e[279]] = e[280] ^ e[281];
                byArray2[RenderBatch.e[282] ^ RenderBatch.e[283]] = e[284] ^ e[285];
                byArray2[RenderBatch.e[286] ^ RenderBatch.e[287]] = e[288] ^ e[289];
                byArray2[RenderBatch.e[290] ^ RenderBatch.e[291]] = e[292] ^ e[293];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, e[294], byArray3, e[295], byArray.length);
                System.arraycopy(byArray2, e[296], byArray3, byArray.length, byArray2.length);
                Object object4 = RenderBatch.A()[e[297]];
                if (object4 == null) {
                    char[] cArray = "\u2443\u2475\u244e\u2477\u2469\u3d65\u27fa\u27cc\u2427\u27cb\u246b\u2420\u27d4\u27d6\u27c6\u246b\u2474\u3d64".toCharArray();
                    for (int i2 = e[298]; i2 < e[299]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= e[300];
                        n3 ^= e[301];
                        n3 += e[302];
                        n3 ^= e[303];
                        n3 += e[304];
                        n3 ^= e[305];
                        n3 -= e[306];
                        n3 += e[307];
                        n3 -= e[308];
                        n3 += e[309];
                        cArray[i2] = (char)(n3 += e[310]);
                    }
                    object4 = RenderBatch.A()[RenderBatch.e[311]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[e[312]];
                byArray4[RenderBatch.e[313]] = e[314];
                byArray4[RenderBatch.e[315]] = e[316];
                byArray4[RenderBatch.e[317]] = e[318];
                byArray4[RenderBatch.e[319]] = e[320];
                byArray4[RenderBatch.e[321]] = e[322];
                byArray4[RenderBatch.e[323]] = e[324];
                byArray4[RenderBatch.e[325]] = e[326];
                byArray4[RenderBatch.e[327]] = e[328];
                byArray4[RenderBatch.e[329]] = e[330];
                byArray4[RenderBatch.e[331]] = e[332];
                byArray4[RenderBatch.e[333]] = e[334];
                byArray4[RenderBatch.e[335]] = e[336];
                byArray4[RenderBatch.e[337]] = e[338];
                byArray4[RenderBatch.e[339]] = e[340];
                byArray4[RenderBatch.e[341]] = e[342];
                byArray4[RenderBatch.e[343]] = e[344];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, e[345], e[346]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = RenderBatch.A()[e[347]];
                if (object5 == null) {
                    char[] cArray = "\ubde7\ubde3\ubd31".toCharArray();
                    for (int i3 = e[348]; i3 < e[349]; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= e[350];
                        n4 -= e[351];
                        n4 ^= e[352];
                        n4 ^= e[353];
                        n4 ^= e[354];
                        n4 -= e[355];
                        n4 -= e[356];
                        n4 ^= e[357];
                        n4 ^= e[358];
                        n4 ^= e[359];
                        n4 += e[360];
                        n4 -= e[361];
                        n4 += e[362];
                        cArray[i3] = (char)(n4 ^= e[363]);
                    }
                    object5 = RenderBatch.A()[RenderBatch.e[364]] = new String(cArray);
                }
                C = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, e[365], e[366]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, e[367], byArray6.length);
            Object object6 = RenderBatch.A()[e[368]];
            if (object6 == null) {
                char[] cArray = "\u1937\u1943\u1949\u190d\u1939\u1934\u1939\u190d\u194a\u1971\u1939\u1949\u1973\u194a\u1997\u1996\u1996\u194f\u1958\u1955".toCharArray();
                for (int i4 = e[369]; i4 < e[370]; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= e[371];
                    n5 += e[372];
                    n5 -= e[373];
                    n5 += e[374];
                    n5 ^= e[375];
                    n5 += e[376];
                    n5 ^= e[377];
                    n5 -= e[378];
                    n5 -= e[379];
                    n5 += e[380];
                    n5 += e[381];
                    cArray[i4] = (char)(n5 ^= e[382]);
                }
                object6 = RenderBatch.A()[RenderBatch.e[383]] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(e[384], (Key)((SecretKey)C), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = D;
        if (D == null) {
            D = new Object[e[385]];
            objectArray = D;
        }
        return objectArray;
    }

    public static void b() {
        e = new int[0x97B9 ^ 0x963B];
        RenderBatch.e[0x83E ^ 0x8D3] = 0xD29C ^ 0x8D3;
        RenderBatch.e[0xF692 ^ 0xF65D] = 0xC4F ^ 0xF65D;
        RenderBatch.e[0x7A0A ^ 0x7AE0] = 0xA0BC ^ 0x7AE0;
        RenderBatch.e[0xDDD8 ^ 0xDDF4] = 0xDDB0 ^ 0xDDF4;
        RenderBatch.e[0xC248 ^ 0xC25C] = 0xC63D ^ 0xC25C;
        RenderBatch.e[0x471A ^ 0x47F3] = 0x6A7A ^ 0x47F3;
        RenderBatch.e[0x109F4 ^ 0x108C0] = 0x170AB ^ 0x108C0;
        RenderBatch.e[0xA864 ^ 0xA89E] = 0x1A993 ^ 0xA89E;
        RenderBatch.e[0x492 ^ 0x58E] = 0xFFFF4523 ^ 0x58E;
        RenderBatch.e[0xAB7A ^ 0xAB40] = 0xAB3F ^ 0xAB40;
        RenderBatch.e[0xF951 ^ 0xF84C] = 0x474D ^ 0xF84C;
        RenderBatch.e[0xC525 ^ 0xC57C] = 0xFFFF3AA8 ^ 0xC57C;
        RenderBatch.e[0x6991 ^ 0x6914] = 0xFFFF90D4 ^ 0x6914;
        RenderBatch.e[0x3186 ^ 0x3142] = 0x7DF1 ^ 0x3142;
        RenderBatch.e[0x1413 ^ 0x1495] = 0x1296 ^ 0x1495;
        RenderBatch.e[0x6F8F ^ 0x6FA0] = 0x6FA5 ^ 0x6FA0;
        RenderBatch.e[0x8830 ^ 0x881D] = 0xFFFF77F6 ^ 0x881D;
        RenderBatch.e[0x858E ^ 0x8518] = 0x1D22 ^ 0x8518;
        RenderBatch.e[0x64FC ^ 0x6451] = 0xB3C0 ^ 0x6451;
        RenderBatch.e[0xE8B3 ^ 0xE9B2] = 0xAE8 ^ 0xE9B2;
        RenderBatch.e[0xCBA4 ^ 0xCBF1] = 0xFFFF34F9 ^ 0xCBF1;
        RenderBatch.e[0x833A ^ 0x838A] = 0xFFFFD5CD ^ 0x838A;
        RenderBatch.e[0xC6CB ^ 0xC7F2] = 0xC7F1 ^ 0xC7F2;
        RenderBatch.e[0x286D ^ 0x2858] = 0xFFFFD796 ^ 0x2858;
        RenderBatch.e[0xB379 ^ 0xB334] = 0xFFFF4CBB ^ 0xB334;
        RenderBatch.e[0xDF4D ^ 0xDFC3] = 0xBB50 ^ 0xDFC3;
        RenderBatch.e[0x3650 ^ 0x36D9] = 0xFFFF869B ^ 0x36D9;
        RenderBatch.e[0x171C ^ 0x1638] = 0xAE1F ^ 0x1638;
        RenderBatch.e[0xE94A ^ 0xE865] = 0x4412 ^ 0xE865;
        RenderBatch.e[0xDE70 ^ 0xDE1B] = 0x6401 ^ 0xDE1B;
        RenderBatch.e[0x5163 ^ 0x5024] = 0x5026 ^ 0x5024;
        RenderBatch.e[0x558C ^ 0x55E1] = 0xFFFF1011 ^ 0x55E1;
        RenderBatch.e[0x6E11 ^ 0x6E83] = 0x1075 ^ 0x6E83;
        RenderBatch.e[0xB393 ^ 0xB286] = 0x10A6 ^ 0xB286;
        RenderBatch.e[0xEE74 ^ 0xEE14] = 0xEE14 ^ 0xEE14;
        RenderBatch.e[0x9F13 ^ 0x9F36] = 0xFFFF60D7 ^ 0x9F36;
        RenderBatch.e[0x2ABE ^ 0x2AF2] = 0x2AC1 ^ 0x2AF2;
        RenderBatch.e[0x480 ^ 0x404] = 0x207 ^ 0x404;
        RenderBatch.e[0x74BA ^ 0x75ED] = 0x75E5 ^ 0x75ED;
        RenderBatch.e[0x141F ^ 0x1418] = 0x144C ^ 0x1418;
        RenderBatch.e[0x299D ^ 0x29D4] = 0x299E ^ 0x29D4;
        RenderBatch.e[0x3286 ^ 0x33EB] = 0x33EB ^ 0x33EB;
        RenderBatch.e[0x2C99 ^ 0x2DD0] = 0x2DD6 ^ 0x2DD0;
        RenderBatch.e[0x7A25 ^ 0x7A03] = 0x7A06 ^ 0x7A03;
        RenderBatch.e[0x54DA ^ 0x54A7] = 0x7FA9 ^ 0x54A7;
        RenderBatch.e[0x66EB ^ 0x664B] = 0xFC1E ^ 0x664B;
        RenderBatch.e[0x7925 ^ 0x7868] = 0x786F ^ 0x7868;
        RenderBatch.e[0x3BEE ^ 0x3ACF] = 0xCE8B ^ 0x3ACF;
        RenderBatch.e[0x95E0 ^ 0x95E4] = 0x95A6 ^ 0x95E4;
        RenderBatch.e[0xB487 ^ 0xB4E0] = 0xE387 ^ 0xB4E0;
        RenderBatch.e[0xDE5B ^ 0xDF34] = 0xDF24 ^ 0xDF34;
        RenderBatch.e[0x7E ^ 0x14D] = 0x7F74 ^ 0x14D;
        RenderBatch.e[0x7C60 ^ 0x7C54] = 0x7C5D ^ 0x7C54;
        RenderBatch.e[0x7EFF ^ 0x7E63] = 0x7239 ^ 0x7E63;
        RenderBatch.e[0x332A ^ 0x33E0] = 0x132AC ^ 0x33E0;
        RenderBatch.e[0xCFAB ^ 0xCF20] = 0xABB1 ^ 0xCF20;
        RenderBatch.e[0x70F8 ^ 0x71F3] = 0x86C3 ^ 0x71F3;
        RenderBatch.e[0x1050 ^ 0x1000] = 0xFFFFEF9D ^ 0x1000;
        RenderBatch.e[0x599D ^ 0x58A5] = 0x58B5 ^ 0x58A5;
        RenderBatch.e[0x6DF8 ^ 0x6D40] = 0xFFFF1F0D ^ 0x6D40;
        RenderBatch.e[0x1799 ^ 0x1740] = 0x7438 ^ 0x1740;
        RenderBatch.e[0xE475 ^ 0xE46F] = 0x6427 ^ 0xE46F;
        RenderBatch.e[0x3E13 ^ 0x3F6E] = 0xBEC1 ^ 0x3F6E;
        RenderBatch.e[0xD20C ^ 0xD281] = 0xB65B ^ 0xD281;
        RenderBatch.e[0x5FB5 ^ 0x5EEB] = 0xAA8 ^ 0x5EEB;
        RenderBatch.e[0x6942 ^ 0x69FD] = 0x16FA8 ^ 0x69FD;
        RenderBatch.e[0x8555 ^ 0x8521] = 0x80C9 ^ 0x8521;
        RenderBatch.e[0xE91 ^ 0xFF8] = 0x7800 ^ 0xFF8;
        RenderBatch.e[0xAC3E ^ 0xACC6] = 0xFFFF7707 ^ 0xACC6;
        RenderBatch.e[0x10D2C ^ 0x10D74] = 0x10D75 ^ 0x10D74;
        RenderBatch.e[0xE6 ^ 0x1CB] = 0xF67E ^ 0x1CB;
        RenderBatch.e[0x9C89 ^ 0x9D89] = 0xFFFF811B ^ 0x9D89;
        RenderBatch.e[0x10BD2 ^ 0x10ABA] = 0x11182 ^ 0x10ABA;
        RenderBatch.e[0x102DA ^ 0x10236] = 0x1D870 ^ 0x10236;
        RenderBatch.e[0x61D ^ 0x682] = 0x9CD0 ^ 0x682;
        RenderBatch.e[0x9827 ^ 0x9953] = 0x9E30 ^ 0x9953;
        RenderBatch.e[0x9393 ^ 0x93E0] = 0x9606 ^ 0x93E0;
        RenderBatch.e[0xCECB ^ 0xCE41] = 0x8193 ^ 0xCE41;
        RenderBatch.e[0x8561 ^ 0x8524] = 0xFFFF7AC6 ^ 0x8524;
        RenderBatch.e[0xAD3E ^ 0xAC18] = 0xAC18 ^ 0xAC18;
        RenderBatch.e[0xC69A ^ 0xC69A] = 0xC6CD ^ 0xC69A;
        RenderBatch.e[0x7BB2 ^ 0x7AC7] = 0x3B13 ^ 0x7AC7;
        RenderBatch.e[0xF855 ^ 0xF827] = 0x9FCB ^ 0xF827;
        RenderBatch.e[0x4791 ^ 0x478F] = 0xE9B ^ 0x478F;
        RenderBatch.e[0x77E9 ^ 0x77C9] = 0xF4D1 ^ 0x77C9;
        RenderBatch.e[0xDBB6 ^ 0xDB64] = 0x7317 ^ 0xDB64;
        RenderBatch.e[0xD522 ^ 0xD53D] = 0xC548 ^ 0xD53D;
        RenderBatch.e[0xC552 ^ 0xC401] = 0xC40D ^ 0xC401;
        RenderBatch.e[0xE657 ^ 0xE6CD] = 0xD4D6 ^ 0xE6CD;
        RenderBatch.e[0xCDD7 ^ 0xCD6E] = 0x40EA ^ 0xCD6E;
        RenderBatch.e[0x2189 ^ 0x20FA] = 0xE59B ^ 0x20FA;
        RenderBatch.e[0xC875 ^ 0xC948] = 0xC943 ^ 0xC948;
        RenderBatch.e[0x4E9C ^ 0x4E2A] = 0xC3B2 ^ 0x4E2A;
        RenderBatch.e[0x6881 ^ 0x6887] = 0x68AA ^ 0x6887;
        RenderBatch.e[0x34FF ^ 0x345E] = 0xFFFF5195 ^ 0x345E;
        RenderBatch.e[0x10D51 ^ 0x10C6A] = 0x10C6F ^ 0x10C6A;
        RenderBatch.e[0xFAB3 ^ 0xFB8C] = 0xFB8D ^ 0xFB8C;
        RenderBatch.e[0x6E6F ^ 0x6E01] = 0xD413 ^ 0x6E01;
        RenderBatch.e[0x998 ^ 0x8D8] = 0x8BD ^ 0x8D8;
        RenderBatch.e[0xF4F1 ^ 0xF431] = 0x1F266 ^ 0xF431;
        RenderBatch.e[0x8187 ^ 0x81EB] = 0x3BF9 ^ 0x81EB;
        RenderBatch.e[0x9193 ^ 0x91F9] = 0xC69E ^ 0x91F9;
        RenderBatch.e[0xB892 ^ 0xB81E] = 0xDC8D ^ 0xB81E;
        RenderBatch.e[0x3AAC ^ 0x3A3B] = 0x82A ^ 0x3A3B;
        RenderBatch.e[0xC13C ^ 0xC1F5] = 0x9231 ^ 0xC1F5;
        RenderBatch.e[0x1065 ^ 0x117C] = 0xF4B2 ^ 0x117C;
        RenderBatch.e[0xBF09 ^ 0xBE07] = 0x7A06 ^ 0xBE07;
        RenderBatch.e[0x6131 ^ 0x6052] = 0x615D ^ 0x6052;
        RenderBatch.e[0x4AE6 ^ 0x4AF5] = 0x4AD9 ^ 0x4AF5;
        RenderBatch.e[0xBDE9 ^ 0xBCEA] = 0x52F6 ^ 0xBCEA;
        RenderBatch.e[0x2FA7 ^ 0x2FC5] = 0x4B1C ^ 0x2FC5;
        RenderBatch.e[0x616D ^ 0x6058] = 0xAEC6 ^ 0x6058;
        RenderBatch.e[0xEE1A ^ 0xEEE9] = 0x96DA ^ 0xEEE9;
        RenderBatch.e[0x460 ^ 0x49E] = 0xE7DA ^ 0x49E;
        RenderBatch.e[0x960C ^ 0x9635] = 0xFFFF69F9 ^ 0x9635;
        RenderBatch.e[0x571A ^ 0x5636] = 0x77A4 ^ 0x5636;
        RenderBatch.e[0x46FE ^ 0x4790] = 0x4780 ^ 0x4790;
        RenderBatch.e[0x9109 ^ 0x9063] = 0xF59B ^ 0x9063;
        RenderBatch.e[0x10BB5 ^ 0x10B6F] = 0x197B8 ^ 0x10B6F;
        RenderBatch.e[0xEC3A ^ 0xED6B] = 0xED65 ^ 0xED6B;
        RenderBatch.e[0x7249 ^ 0x72E5] = 0xFFFF5ACE ^ 0x72E5;
        RenderBatch.e[0xD9C5 ^ 0xD9C0] = 0xFFFF2632 ^ 0xD9C0;
        RenderBatch.e[0xBFAA ^ 0xBED0] = 0xA228 ^ 0xBED0;
        RenderBatch.e[0x6F28 ^ 0x6F06] = 0xFFFF9095 ^ 0x6F06;
        RenderBatch.e[0x3A2B ^ 0x3AFB] = 0xFFFF3F58 ^ 0x3AFB;
        RenderBatch.e[0x19CC ^ 0x18E7] = 0x18F5 ^ 0x18E7;
        RenderBatch.e[0x4E10 ^ 0x4F90] = 0x4F92 ^ 0x4F90;
        RenderBatch.e[0x4EAA ^ 0x4E58] = 0x3666 ^ 0x4E58;
        RenderBatch.e[0xA1B0 ^ 0xA1BD] = 0xA1BD ^ 0xA1BD;
        RenderBatch.e[0xEF13 ^ 0xEFB8] = 0x3829 ^ 0xEFB8;
        RenderBatch.e[0x85D7 ^ 0x8488] = 0xCD6D ^ 0x8488;
        RenderBatch.e[0x2F54 ^ 0x2E7C] = 0x2E7C ^ 0x2E7C;
        RenderBatch.e[0x3DA0 ^ 0x3D7B] = 0xA1AE ^ 0x3D7B;
        RenderBatch.e[0xDABA ^ 0xDACC] = 0xDF24 ^ 0xDACC;
        RenderBatch.e[0xC0FE ^ 0xC18E] = 0xC18D ^ 0xC18E;
        RenderBatch.e[0xF820 ^ 0xF917] = 0xF916 ^ 0xF917;
        RenderBatch.e[0xCF40 ^ 0xCF00] = 0xCF0E ^ 0xCF00;
        RenderBatch.e[0x1C70 ^ 0x1D7C] = 0xEA2D ^ 0x1D7C;
        RenderBatch.e[0xC93B ^ 0xC860] = 0xC862 ^ 0xC860;
        RenderBatch.e[0x58E7 ^ 0x581E] = 0x7C01 ^ 0x581E;
        RenderBatch.e[0x4FB4 ^ 0x4FFB] = 0x4F76 ^ 0x4FFB;
        RenderBatch.e[0x8AD7 ^ 0x8BB7] = 0x4731 ^ 0x8BB7;
        RenderBatch.e[0xBAC5 ^ 0xBBCD] = 0x18BC ^ 0xBBCD;
        RenderBatch.e[0x7E2D ^ 0x7E4E] = 0xC6EE ^ 0x7E4E;
        RenderBatch.e[0xBFB9 ^ 0xBF1F] = 0xB44E ^ 0xBF1F;
        RenderBatch.e[0x8B81 ^ 0x8ACB] = 0xFFFF750A ^ 0x8ACB;
        RenderBatch.e[0x5029 ^ 0x514B] = 0xF3A0 ^ 0x514B;
        RenderBatch.e[0xED52 ^ 0xEC10] = 0xFFFF13B6 ^ 0xEC10;
        RenderBatch.e[0x10A74 ^ 0x10AB8] = 0xFFFFF448 ^ 0x10AB8;
        RenderBatch.e[0xC0BB ^ 0xC1DC] = 0x600A ^ 0xC1DC;
        RenderBatch.e[0x954B ^ 0x9545] = 0x9544 ^ 0x9545;
        RenderBatch.e[0xBE93 ^ 0xBEA3] = 0xFFFF411B ^ 0xBEA3;
        RenderBatch.e[0xBBCD ^ 0xBB5D] = 0xC5AB ^ 0xBB5D;
        RenderBatch.e[0xBC18 ^ 0xBD5B] = 0xBD51 ^ 0xBD5B;
        RenderBatch.e[0x4633 ^ 0x46E7] = 0xFFFF1150 ^ 0x46E7;
        RenderBatch.e[0x5AB4 ^ 0x5A96] = 0x5A96 ^ 0x5A96;
        RenderBatch.e[0x3B00 ^ 0x3A31] = 0x1F89 ^ 0x3A31;
        RenderBatch.e[0xF4E5 ^ 0xF5A3] = 0xFFFF0A2D ^ 0xF5A3;
        RenderBatch.e[0x1E14 ^ 0x1F13] = 0xBC27 ^ 0x1F13;
        RenderBatch.e[0x101C8 ^ 0x1019E] = 0xFFFEFE1B ^ 0x1019E;
        RenderBatch.e[0x408E ^ 0x402B] = 0xF69D ^ 0x402B;
        RenderBatch.e[0xFA64 ^ 0xFA18] = 0xD125 ^ 0xFA18;
        RenderBatch.e[0x10433 ^ 0x104FD] = 0x1FEE1 ^ 0x104FD;
        RenderBatch.e[0x8B2E ^ 0x8B10] = 0x8B62 ^ 0x8B10;
        RenderBatch.e[0x6859 ^ 0x6887] = 0xFFA5 ^ 0x6887;
        RenderBatch.e[0x10D53 ^ 0x10C73] = 0xFFFE07CE ^ 0x10C73;
        RenderBatch.e[0xF8AD ^ 0xF889] = 0xFFFF071A ^ 0xF889;
        RenderBatch.e[0x84ED ^ 0x8591] = 0xD1BB ^ 0x8591;
        RenderBatch.e[0x69CB ^ 0x6998] = 0x699C ^ 0x6998;
        RenderBatch.e[0x58E1 ^ 0x58EB] = 0x58BF ^ 0x58EB;
        RenderBatch.e[0xCF63 ^ 0xCF31] = 0xCF1D ^ 0xCF31;
        RenderBatch.e[0x1072E ^ 0x107CD] = 0x1E7AD ^ 0x107CD;
        RenderBatch.e[0x1069 ^ 0x100F] = 0xA8A4 ^ 0x100F;
        RenderBatch.e[0xBACB ^ 0xBBB2] = 0x1C95 ^ 0xBBB2;
        RenderBatch.e[0xF4A ^ 0xF62] = 0xFFFFF0F1 ^ 0xF62;
        RenderBatch.e[0x3E0F ^ 0x3EFE] = 0xEAD7 ^ 0x3EFE;
        RenderBatch.e[0x6F1D ^ 0x6F80] = 0xFFFF9C21 ^ 0x6F80;
        RenderBatch.e[0x5B0F ^ 0x5A56] = 0x5A44 ^ 0x5A56;
        RenderBatch.e[0xD20 ^ 0xD82] = 0x97D7 ^ 0xD82;
        RenderBatch.e[0x37B1 ^ 0x3728] = 0x527 ^ 0x3728;
        RenderBatch.e[0x6E7A ^ 0x6E4B] = 0xFFFF91BD ^ 0x6E4B;
        RenderBatch.e[0x7E1 ^ 0x799] = 0x16F8 ^ 0x799;
        RenderBatch.e[0xD0 ^ 0xE8] = 0x8A ^ 0xE8;
        RenderBatch.e[0x83C4 ^ 0x8306] = 0xCF83 ^ 0x8306;
        RenderBatch.e[0x249E ^ 0x24D9] = 0xFFFFDB6E ^ 0x24D9;
        RenderBatch.e[0xD47E ^ 0xD4C3] = 0xDEC0 ^ 0xD4C3;
        RenderBatch.e[0x91E4 ^ 0x90CE] = 0x90CE ^ 0x90CE;
        RenderBatch.e[0x83AE ^ 0x82E1] = 0x82EC ^ 0x82E1;
        RenderBatch.e[0xF955 ^ 0xF9F6] = 0xF9F6 ^ 0xF9F6;
        RenderBatch.e[0xE09B ^ 0xE0F3] = 0xB794 ^ 0xE0F3;
        RenderBatch.e[0xF334 ^ 0xF32C] = 0xE3EE ^ 0xF32C;
        RenderBatch.e[0x89A3 ^ 0x88B2] = 0x4CA5 ^ 0x88B2;
        RenderBatch.e[0xF73B ^ 0xF640] = 0xAD38 ^ 0xF640;
        RenderBatch.e[0xD89A ^ 0xD875] = 0xC5C ^ 0xD875;
        RenderBatch.e[0xFD09 ^ 0xFC33] = 0xFFFF03D0 ^ 0xFC33;
        RenderBatch.e[0x8D38 ^ 0x8C3C] = 0xFFFF9DFE ^ 0x8C3C;
        RenderBatch.e[0xCA47 ^ 0xCA3D] = 0xDB5C ^ 0xCA3D;
        RenderBatch.e[0xD37A ^ 0xD387] = 0x1D281 ^ 0xD387;
        RenderBatch.e[0x174A ^ 0x1674] = 0x1620 ^ 0x1674;
        RenderBatch.e[0xCFC6 ^ 0xCEE4] = 0x768B ^ 0xCEE4;
        RenderBatch.e[0x533D ^ 0x537F] = 0xFFFFAC9F ^ 0x537F;
        RenderBatch.e[0x300E ^ 0x30C6] = 0x637C ^ 0x30C6;
        RenderBatch.e[0xAD64 ^ 0xAD45] = 0x94B8 ^ 0xAD45;
        RenderBatch.e[0x24B5 ^ 0x2404] = 0x8D9B ^ 0x2404;
        RenderBatch.e[0x1A6E ^ 0x1A26] = 0xFFFFE586 ^ 0x1A26;
        RenderBatch.e[0x810A ^ 0x8042] = 0xFFFF7FCF ^ 0x8042;
        RenderBatch.e[0xD9D9 ^ 0xD8B8] = 0x91FF ^ 0xD8B8;
        RenderBatch.e[0x93C8 ^ 0x92C2] = 0x65E9 ^ 0x92C2;
        RenderBatch.e[0x9606 ^ 0x9777] = 0x9777 ^ 0x9777;
        RenderBatch.e[0x9473 ^ 0x9504] = 0xD661 ^ 0x9504;
        RenderBatch.e[0xD895 ^ 0xD897] = 0xD8FD ^ 0xD897;
        RenderBatch.e[0xA360 ^ 0xA3A1] = 0x1A5F4 ^ 0xA3A1;
        RenderBatch.e[0xD1B3 ^ 0xD10D] = 0x1D750 ^ 0xD10D;
        RenderBatch.e[0xAEA9 ^ 0xAFD7] = 0x4258 ^ 0xAFD7;
        RenderBatch.e[0x1808 ^ 0x1899] = 0xFFFF9994 ^ 0x1899;
        RenderBatch.e[0xA1F9 ^ 0xA1A2] = 0xA1A3 ^ 0xA1A2;
        RenderBatch.e[0x35F ^ 0x398] = 0x505C ^ 0x398;
        RenderBatch.e[0x12ED ^ 0x122B] = 0x41F0 ^ 0x122B;
        RenderBatch.e[0x58D7 ^ 0x59F2] = 0xE18C ^ 0x59F2;
        RenderBatch.e[0x10AB0 ^ 0x10BB2] = 0x1E5A2 ^ 0x10BB2;
        RenderBatch.e[0x906F ^ 0x9064] = 0x9013 ^ 0x9064;
        RenderBatch.e[0x4DD6 ^ 0x4C97] = 0x4C98 ^ 0x4C97;
        RenderBatch.e[0xA819 ^ 0xA8E6] = 0x4BBC ^ 0xA8E6;
        RenderBatch.e[0xE53D ^ 0xE506] = 0xFFFF1A9C ^ 0xE506;
        RenderBatch.e[0x7B9C ^ 0x7AD7] = 0x7AD7 ^ 0x7AD7;
        RenderBatch.e[0x10E20 ^ 0x10E7E] = 0x10E7F ^ 0x10E7E;
        RenderBatch.e[0xF7F3 ^ 0xF7D4] = 0xF786 ^ 0xF7D4;
        RenderBatch.e[0x47FD ^ 0x47C1] = 0x47FA ^ 0x47C1;
        RenderBatch.e[0x3D81 ^ 0x3CFE] = 0x3CFD ^ 0x3CFE;
        RenderBatch.e[0xD1B1 ^ 0xD1D8] = 0x8691 ^ 0xD1D8;
        RenderBatch.e[0x652E ^ 0x6442] = 0x6440 ^ 0x6442;
        RenderBatch.e[0x1B ^ 0x18] = 0xFFFFFF88 ^ 0x18;
        RenderBatch.e[0x6994 ^ 0x6941] = 0xC13B ^ 0x6941;
        RenderBatch.e[0xDD0C ^ 0xDDE4] = 0xF023 ^ 0xDDE4;
        RenderBatch.e[0x240C ^ 0x2492] = 0x28C8 ^ 0x2492;
        RenderBatch.e[0x2A8C ^ 0x2B8A] = 0x88B8 ^ 0x2B8A;
        RenderBatch.e[0xFD71 ^ 0xFDF1] = 0xF9F6 ^ 0xFDF1;
        RenderBatch.e[0xF8A7 ^ 0xF8E3] = 0xF8B3 ^ 0xF8E3;
        RenderBatch.e[0xD16A ^ 0xD143] = 0xD1D9 ^ 0xD143;
        RenderBatch.e[0x9770 ^ 0x9628] = 0x963F ^ 0x9628;
        RenderBatch.e[0x4A1C ^ 0x4AF9] = 0xAA99 ^ 0x4AF9;
        RenderBatch.e[0xB585 ^ 0xB404] = 0xB400 ^ 0xB404;
        RenderBatch.e[0x656C ^ 0x645A] = 0x8655 ^ 0x645A;
        RenderBatch.e[0xBC1F ^ 0xBC0F] = 0xBC0D ^ 0xBC0F;
        RenderBatch.e[0x3042 ^ 0x303D] = 0x3435 ^ 0x303D;
        RenderBatch.e[0xB2E7 ^ 0xB210] = 0x960F ^ 0xB210;
        RenderBatch.e[0x2CEE ^ 0x2C31] = 0xBB0E ^ 0x2C31;
        RenderBatch.e[0x495A ^ 0x496D] = 0x495B ^ 0x496D;
        RenderBatch.e[0x4527 ^ 0x4463] = 0xFFFFBBE5 ^ 0x4463;
        RenderBatch.e[0x6843 ^ 0x68D7] = 0xF0ED ^ 0x68D7;
        RenderBatch.e[0x46CB ^ 0x468D] = 0xFFFFB9FA ^ 0x468D;
        RenderBatch.e[0xA834 ^ 0xA845] = 0xCF81 ^ 0xA845;
        RenderBatch.e[0xF73 ^ 0xF03] = 0x68EF ^ 0xF03;
        RenderBatch.e[0xE6E1 ^ 0xE674] = 0x7E6E ^ 0xE674;
        RenderBatch.e[0x4E6F ^ 0x4F7C] = 0xED5C ^ 0x4F7C;
        RenderBatch.e[0xFD63 ^ 0xFC6E] = 0xB5E ^ 0xFC6E;
        RenderBatch.e[0xD1CD ^ 0xD12A] = 0xFCA3 ^ 0xD12A;
        RenderBatch.e[0x97E8 ^ 0x96E7] = 0x52F0 ^ 0x96E7;
        RenderBatch.e[0x1737 ^ 0x1752] = 0xAFAF ^ 0x1752;
        RenderBatch.e[0x6291 ^ 0x622B] = 0x6832 ^ 0x622B;
        RenderBatch.e[0xAB79 ^ 0xABD0] = 0xA082 ^ 0xABD0;
        RenderBatch.e[0xAC0A ^ 0xAC73] = 0xFFFF4299 ^ 0xAC73;
        RenderBatch.e[0xF98D ^ 0xF923] = 0x50BD ^ 0xF923;
        RenderBatch.e[0x6130 ^ 0x616A] = 0x6167 ^ 0x616A;
        RenderBatch.e[0x1CA1 ^ 0x1DED] = 0x1DF5 ^ 0x1DED;
        RenderBatch.e[0x50B4 ^ 0x503C] = 0x1FEE ^ 0x503C;
        RenderBatch.e[0xBA97 ^ 0xBA73] = 0xFFFFA5DB ^ 0xBA73;
        RenderBatch.e[0x902F ^ 0x90EC] = 0xDC71 ^ 0x90EC;
        RenderBatch.e[0x1757 ^ 0x174B] = 0xE8E5 ^ 0x174B;
        RenderBatch.e[0xD7C9 ^ 0xD748] = 0xFFFF2CB2 ^ 0xD748;
        RenderBatch.e[0xDA16 ^ 0xDB40] = 0xFFFF2480 ^ 0xDB40;
        RenderBatch.e[0x6305 ^ 0x6346] = 0x6314 ^ 0x6346;
        RenderBatch.e[0x8931 ^ 0x8955] = 0x31FE ^ 0x8955;
        RenderBatch.e[0xDFAC ^ 0xDF18] = 0xFFFFA669 ^ 0xDF18;
        RenderBatch.e[0xE61C ^ 0xE70B] = 0x2C5 ^ 0xE70B;
        RenderBatch.e[0x10A96 ^ 0x10BE4] = 0x10BF0 ^ 0x10BE4;
        RenderBatch.e[0x7FE2 ^ 0x7F48] = 0xA8C0 ^ 0x7F48;
        RenderBatch.e[0x54A0 ^ 0x54F7] = 0xFFFFAB64 ^ 0x54F7;
        RenderBatch.e[0x908C ^ 0x9030] = 0xFFFF6597 ^ 0x9030;
        RenderBatch.e[0x2637 ^ 0x2620] = 0x9141 ^ 0x2620;
        RenderBatch.e[0x10452 ^ 0x10500] = 0xFFFEFA97 ^ 0x10500;
        RenderBatch.e[0xEA20 ^ 0xEB6E] = 0xEB5A ^ 0xEB6E;
        RenderBatch.e[0xBE39 ^ 0xBE38] = 0xFFFF41D5 ^ 0xBE38;
        RenderBatch.e[0xEDAD ^ 0xEC8E] = 0x54F0 ^ 0xEC8E;
        RenderBatch.e[0x7E9F ^ 0x7FE7] = 0x7E1 ^ 0x7FE7;
        RenderBatch.e[0x10010 ^ 0x10122] = 0x1EE0A ^ 0x10122;
        RenderBatch.e[0x6100 ^ 0x6141] = 0xFFFF9EA3 ^ 0x6141;
        RenderBatch.e[0x7CC4 ^ 0x7C71] = 0xFAAA ^ 0x7C71;
        RenderBatch.e[0x9C04 ^ 0x9C32] = 0x9C08 ^ 0x9C32;
        RenderBatch.e[0x10BA1 ^ 0x10B51] = 0xFFFE20FC ^ 0x10B51;
        RenderBatch.e[0x757C ^ 0x7464] = 0x91E3 ^ 0x7464;
        RenderBatch.e[0x6026 ^ 0x6053] = 0x65CC ^ 0x6053;
        RenderBatch.e[0xA85A ^ 0xA811] = 0xA807 ^ 0xA811;
        RenderBatch.e[0x3FD0 ^ 0x3F8F] = 0x3F8E ^ 0x3F8F;
        RenderBatch.e[0x9214 ^ 0x92D1] = 0xDE4C ^ 0x92D1;
        RenderBatch.e[0xC188 ^ 0xC0B8] = 0xE1E0 ^ 0xC0B8;
        RenderBatch.e[0x2879 ^ 0x286F] = 0x16E ^ 0x286F;
        RenderBatch.e[0xF3C4 ^ 0xF3D6] = 0xF3D6 ^ 0xF3D6;
        RenderBatch.e[0x9874 ^ 0x98E7] = 0xDC ^ 0x98E7;
        RenderBatch.e[0xCD6C ^ 0xCD17] = 0xE626 ^ 0xCD17;
        RenderBatch.e[0x5711 ^ 0x571E] = 0x571E ^ 0x571E;
        RenderBatch.e[0x6233 ^ 0x62D1] = 0x82A1 ^ 0x62D1;
        RenderBatch.e[0x8E79 ^ 0x8F1D] = 0x444C ^ 0x8F1D;
        RenderBatch.e[0xC42 ^ 0xC70] = 0xC64 ^ 0xC70;
        RenderBatch.e[0x9360 ^ 0x9371] = 0x9371 ^ 0x9371;
        RenderBatch.e[0xED39 ^ 0xEC6D] = 0xEC29 ^ 0xEC6D;
        RenderBatch.e[0x8D90 ^ 0x8C80] = 0xFFFFB706 ^ 0x8C80;
        RenderBatch.e[0xCED6 ^ 0xCEF5] = 0xFFFF3167 ^ 0xCEF5;
        RenderBatch.e[0x9D05 ^ 0x9D9D] = 0xAF86 ^ 0x9D9D;
        RenderBatch.e[0xA9E9 ^ 0xA9D6] = 0xA9F9 ^ 0xA9D6;
        RenderBatch.e[0x2FDD ^ 0x2F0E] = 0x8774 ^ 0x2F0E;
        RenderBatch.e[0x7B50 ^ 0x7BF4] = 0xCD62 ^ 0x7BF4;
        RenderBatch.e[0x7D1D ^ 0x7DB2] = 0xD42D ^ 0x7DB2;
        RenderBatch.e[0x494C ^ 0x49AC] = 0xDE8B ^ 0x49AC;
        RenderBatch.e[0xF2B1 ^ 0xF25A] = 0x2815 ^ 0xF25A;
        RenderBatch.e[0xF535 ^ 0xF539] = 0xF53A ^ 0xF539;
        RenderBatch.e[0x2F87 ^ 0x2E8E] = 0x8DBA ^ 0x2E8E;
        RenderBatch.e[0x47DB ^ 0x4720] = 0x14626 ^ 0x4720;
        RenderBatch.e[0xB7F0 ^ 0xB7E9] = 0x232F ^ 0xB7E9;
        RenderBatch.e[0xC4F8 ^ 0xC425] = 0x58F0 ^ 0xC425;
        RenderBatch.e[0x6B87 ^ 0x6B04] = 0x6D01 ^ 0x6B04;
        RenderBatch.e[0x79AA ^ 0x7980] = 0xFFFF8606 ^ 0x7980;
        RenderBatch.e[0x45EE ^ 0x4581] = 0x2264 ^ 0x4581;
        RenderBatch.e[0x3A85 ^ 0x3BE0] = 0xF731 ^ 0x3BE0;
        RenderBatch.e[0x7077 ^ 0x703D] = 0x707D ^ 0x703D;
        RenderBatch.e[0x5F8D ^ 0x5FB0] = 0x5F8D ^ 0x5FB0;
        RenderBatch.e[0x538B ^ 0x53A0] = 0x53F2 ^ 0x53A0;
        RenderBatch.e[0x10A0A ^ 0x10AEC] = 0x12761 ^ 0x10AEC;
        RenderBatch.e[0x7DEB ^ 0x7DE3] = 0xFFFF823B ^ 0x7DE3;
        RenderBatch.e[0x1B11 ^ 0x1BC6] = 0x78BE ^ 0x1BC6;
        RenderBatch.e[0x384E ^ 0x38AF] = 0xAF90 ^ 0x38AF;
        RenderBatch.e[0x4C9A ^ 0x4D8E] = 0xEFE2 ^ 0x4D8E;
        RenderBatch.e[0xC289 ^ 0xC3D4] = 0xC3D7 ^ 0xC3D4;
        RenderBatch.e[0x6B95 ^ 0x6A83] = 0x8F4A ^ 0x6A83;
        RenderBatch.e[0xC483 ^ 0xC4DE] = 0xC4DE ^ 0xC4DE;
        RenderBatch.e[0xBAE6 ^ 0xBBBA] = 0xBBBA ^ 0xBBBA;
        RenderBatch.e[0x2134 ^ 0x21AF] = 0x2DF1 ^ 0x21AF;
        RenderBatch.e[0xFC15 ^ 0xFD32] = 0xFD32 ^ 0xFD32;
        RenderBatch.e[0x1070F ^ 0x10712] = 0x12FE0 ^ 0x10712;
        RenderBatch.e[0x58A9 ^ 0x59C2] = 0xDA7D ^ 0x59C2;
        RenderBatch.e[0xDF88 ^ 0xDF81] = 0xFFFF207C ^ 0xDF81;
        RenderBatch.e[0xAC36 ^ 0xAC84] = 0x2A50 ^ 0xAC84;
        RenderBatch.e[0xA622 ^ 0xA739] = 0x1838 ^ 0xA739;
        RenderBatch.e[0x206D ^ 0x20A6] = 0x121F8 ^ 0x20A6;
        RenderBatch.e[0x1075B ^ 0x107DC] = 0x1480B ^ 0x107DC;
        RenderBatch.e[0xC759 ^ 0xC785] = 0xFFFFA4DB ^ 0xC785;
        RenderBatch.e[0x388B ^ 0x39CE] = 0x39CA ^ 0x39CE;
        RenderBatch.e[0xD61F ^ 0xD731] = 0xB207 ^ 0xD731;
        RenderBatch.e[0xD448 ^ 0xD485] = 0x1D5DB ^ 0xD485;
        RenderBatch.e[0x2281 ^ 0x223A] = 0x2839 ^ 0x223A;
        RenderBatch.e[0xF615 ^ 0xF600] = 0x5821 ^ 0xF600;
        RenderBatch.e[0xE4FC ^ 0xE400] = 0xFFFE1A92 ^ 0xE400;
        RenderBatch.e[0x3609 ^ 0x3717] = 0xC356 ^ 0x3717;
        RenderBatch.e[0x911F ^ 0x9143] = 0x9141 ^ 0x9143;
        RenderBatch.e[0x14B9 ^ 0x144D] = 0xFFFF93CC ^ 0x144D;
        RenderBatch.e[0xF8BA ^ 0xF854] = 0x2C7D ^ 0xF854;
        RenderBatch.e[0xB6FD ^ 0xB6E6] = 0x9BCB ^ 0xB6E6;
        RenderBatch.e[0xE7AB ^ 0xE77D] = 0x8410 ^ 0xE77D;
        RenderBatch.e[0xAAF ^ 0xBFF] = 0xFFFFF41A ^ 0xBFF;
        RenderBatch.e[0x787B ^ 0x78DC] = 0x738E ^ 0x78DC;
        RenderBatch.e[0x68F9 ^ 0x6887] = 0x43BA ^ 0x6887;
        RenderBatch.e[0xF21B ^ 0xF31E] = 0x1D02 ^ 0xF31E;
        RenderBatch.e[0xA9FC ^ 0xA99D] = 0xCD54 ^ 0xA99D;
        RenderBatch.e[0x6538 ^ 0x658B] = 0xE350 ^ 0x658B;
        RenderBatch.e[0xEFF6 ^ 0xEEDF] = 0xEEDE ^ 0xEEDF;
        RenderBatch.e[0x10B9A ^ 0x10B42] = 0x16841 ^ 0x10B42;
        RenderBatch.e[0x10C6 ^ 0x1193] = 0x119A ^ 0x1193;
        RenderBatch.e[0x28AD ^ 0x2822] = 0x56D7 ^ 0x2822;
        RenderBatch.e[0xBD36 ^ 0xBD78] = 0xBD1C ^ 0xBD78;
        RenderBatch.e[0x7389 ^ 0x72FF] = 0x288B ^ 0x72FF;
        RenderBatch.e[0x87D ^ 0x80A] = 0x1966 ^ 0x80A;
        RenderBatch.e[0x7CBC ^ 0x7C0B] = 0xF18F ^ 0x7C0B;
        RenderBatch.e[0x7575 ^ 0x75F7] = 0x71F0 ^ 0x75F7;
        RenderBatch.e[0x613E ^ 0x6024] = 0xDF2F ^ 0x6024;
        RenderBatch.e[0x939 ^ 0x90A] = 0x920 ^ 0x90A;
        RenderBatch.e[0x616D ^ 0x6072] = 0x9436 ^ 0x6072;
        RenderBatch.e[0xD8B9 ^ 0xD84F] = 0xFC44 ^ 0xD84F;
        RenderBatch.e[0x7FFE ^ 0x7F0B] = 0x738 ^ 0x7F0B;
        RenderBatch.e[0x2125 ^ 0x21F4] = 0xDBE6 ^ 0x21F4;
        RenderBatch.e[0xF224 ^ 0xF342] = 0x8B6 ^ 0xF342;
        RenderBatch.e[0x9EF9 ^ 0x9EAD] = 0x9EA5 ^ 0x9EAD;
        RenderBatch.e[0xBC1B ^ 0xBD09] = 0x1F3E ^ 0xBD09;
        RenderBatch.e[0x5AA0 ^ 0x5A08] = 0xFFFFAED6 ^ 0x5A08;
        RenderBatch.e[0x47BD ^ 0x47EC] = 0x47E6 ^ 0x47EC;
        RenderBatch.e[0x32C6 ^ 0x339C] = 0x329C ^ 0x339C;
        RenderBatch.e[0xF4B9 ^ 0xF585] = 0xF5C5 ^ 0xF585;
    }
}

