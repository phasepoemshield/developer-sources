/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.class_10865
 *  net.minecraft.class_10868
 */
package kotakbaz.rain.client.render.main;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
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
import net.minecraft.class_10865;
import net.minecraft.class_10868;

/*
 * Renamed from kotakbaz.rain.client.render.main.a
 */
public final class a_0 {
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public a_0() {
        super();
    }

    public static void bindFrameBuffer(int n, GpuTextureView gpuTextureView) {
        int n2 = C[0];
        n2 -= C[1];
        GlStateManager._glBindFramebuffer((int)(n2 -= C[2]), (int)n);
        int n3 = C[3];
        n3 += C[4];
        n3 ^= C[5];
        int n4 = C[6];
        n4 ^= C[7];
        int n5 = C[9];
        n5 -= C[10];
        int n6 = C[12];
        n6 ^= C[13];
        GlStateManager._viewport((int)n3, (int)(n4 -= C[8]), (int)gpuTextureView.getWidth(n5 -= C[11]), (int)gpuTextureView.getHeight(n6 -= C[14]));
    }

    public static int getFrameBufferId(GpuTextureView gpuTextureView, GpuTextureView gpuTextureView2) {
        int n = C[15];
        n -= C[16];
        a_0.validateFrameBufferTexture((String)a[n -= C[17]], gpuTextureView);
        if (gpuTextureView2 != null) {
            int n2 = C[18];
            n2 ^= C[19];
            a_0.validateFrameBufferTexture((String)a[n2 += C[20]], gpuTextureView2);
        }
        return ((class_10868)gpuTextureView.texture()).method_68426(((class_10865)RenderSystem.getDevice()).method_68401(), gpuTextureView2 == null ? null : gpuTextureView2.texture());
    }

    public static void validateFrameBufferTexture(String string, GpuTextureView gpuTextureView) {
        if (gpuTextureView.isClosed()) {
            int n = C[21];
            n ^= C[22];
            int n2 = C[24];
            n2 += C[25];
            throw new IllegalStateException(string.concat((String)a[n -= C[23]] + (String)a[n2 -= C[26]]));
        }
        int n = C[27];
        n += C[28];
        if ((gpuTextureView.texture().usage() & (n -= C[29])) == 0) {
            int n3 = C[30];
            n3 ^= C[31];
            int n4 = C[33];
            n4 ^= C[34];
            throw new IllegalStateException(string.concat((String)a[n3 -= C[32]] + (String)a[n4 -= C[35]]));
        }
        int n5 = C[36];
        n5 -= C[37];
        if (gpuTextureView.texture().getDepthOrLayers() > (n5 -= C[38])) {
            int n6 = C[39];
            n6 -= C[40];
            int n7 = C[42];
            n7 -= C[43];
            throw new UnsupportedOperationException((String)a[n6 += C[41]] + (String)a[n7 -= C[44]]);
        }
    }

    static {
        a_0.b();
        long l = 6614223874617608993L;
        long l2 = -5205815542353699563L;
        long l3 = 2269822686702304470L;
        long l4 = -1858122105343678474L;
        long l5 = 4548525901414630237L;
        long l6 = -1402147178766374420L;
        long l7 = -7550307262637825671L;
        long l8 = 2839143643223366309L;
        long l9 = 5305135742153721690L;
        long l10 = 2873236811966754034L;
        long l11 = -2198262509998558634L;
        long l12 = -1926036488310663271L;
        long l13 = 501627301586457560L;
        long l14 = -4775560121456224408L;
        int n = C[45];
        n ^= C[46];
        a = new Object[n += C[47]];
        long l15 = l14;
        int n2 = C[48];
        n2 ^= C[49];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += C[50]);
        Object[] objectArray = new Object[C[51]];
        objectArray[a_0.C[52]] = A;
        objectArray[a_0.C[53]] = C[54];
        int n3 = C[55];
        Object object = a_0.A()[C[56]];
        if (object == null) {
            char[] cArray = "\u5c70\u5ca1\u5c4f\u5c6e\u5c72\u5c56\u5c9f\u5c8a\u5c71\u5c5d\u5c7d\u5bb3\u5c93\u5c78\u5c94\u5c71\u5c6d\u5c4e\u5c85\u5c56\u5c92\u5c83\u5c3d\u5ca1\u5c7f\u5c81\u5c93\u5c7d\u5c88\u5c9f\u5c3d\u5c70\u5c8e\u5c81\u5c70\u5c63\u5c59\u5c85\u5c8d\u5c7c\u5c94\u5c94\u5c85\u5c5a\u5c94\u5c74\u5c7a\u5c68\u5c59\u5c5a\u5c3b\u5c3a\u5ba8\u5c63\u5c5b\u5bb3\u5c6d\u5c7e\u5c88\u5c91\u5c81\u5c81\u5c95\u5ca1\u5c85\u5c7a\u5c7c\u5c59\u5c56\u5ca1\u5c74\u5c4e\u5c51\u5c78\u5c9e\u5c56\u5c71\u5c54\u5c3d\u5bb5\u5c7a\u5c63\u5c71\u5c78\u5c3a\u5c72\u5c57\u5c7f\u5c73\u5bb5\u5c92\u5c5d\u5c72\u5ca4\u5c94\u5c3c\u5c63\u5c78\u5c57\u5ca4\u5c79\u5c63\u5c74\u5c8f\u5c3a\u5c85\u5c76\u5bb3\u5c7b\u5c95\u5c93\u5c3a\u5c90\u5c51\u5c95\u5c84\u5c76\u5c8a\u5c62\u5c7a\u5c83\u5c59\u5c74\u5c62\u5bb5\u5c73\u5c5c\u5c8f\u5c84\u5c5d\u5c3b\u5c58\u5c9e\u5c5d\u5c79\u5c54\u5c74\u5c3b\u5c5d\u5c84\u5c85\u5c94\u5c78\u5c54\u5c70\u5c7c\u5c5a\u5c4f\u5c95\u5c5b\u5c95\u5c3d\u5c3b\u5c82\u5bb3\u5c7d\u5c57\u5c93\u5c94\u5bb5\u5c59\u5c65\u5c7d\u5c82\u5c7b\u5c51\u5c70\u5c63\u5c74\u5c74\u5c90\u5c70\u5c82\u5ba8\u5c4e\u5c83\u5c91\u5c93\u5c74\u5c93\u5c6f\u5c5a\u5c59\u5c3c\u5c7e\u5c56\u5c7d\u5c85\u5c63\u5c79\u5c3b\u5c7e\u5c6e\u5c7a\u5c93\u5c74\u5c94\u5c3d\u5c5a\u5c8d\u5c8f\u5c3b\u5c77\u5c70\u5c8e\u5c6e\u5c88\u5c9e\u5c93\u5c65\u5c4f\u5c79\u5c7c\u5c9e\u5bb5\u5c5a\u5c5a\u5c84\u5bb5\u5c65\u5c62\u5c76\u5c71\u5c8f\u5c81\u5c3b\u5c91\u5c54\u5c95\u5c92\u5c72\u5c81\u5c92\u5ba8\u5c74\u5c73\u5c6d\u5c5a\u5c3c\u5c85\u5c79\u5c78\u5c68\u5c7d\u5c9e\u5c68\u5c90\u5c74\u5c72\u5c7c\u5c7b\u5bb2\u5c81\u5c5b\u5c5d\u5c59".toCharArray();
            for (int i = C[57]; i < C[58]; ++i) {
                int n4 = cArray[i];
                n4 -= C[59];
                n4 += C[60];
                n4 += C[61];
                n4 -= C[62];
                n4 -= C[63];
                n4 ^= C[64];
                n4 -= C[65];
                n4 ^= C[66];
                n4 += C[67];
                n4 += C[68];
                cArray[i] = (char)(n4 += C[69]);
            }
            object = a_0.A()[a_0.C[70]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)a_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = C[71];
        n5 += C[72];
        l5 = l16 ^ (0xA200000000L ^ l16) & -1L << (n5 ^= C[73]);
        long l17 = l12;
        int n6 = C[74];
        n6 -= C[75];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += C[76]);
        while (true) {
            int n7 = C[77];
            n7 ^= C[78];
            if ((int)l12 >= (int)(l5 >>> (n7 -= C[79]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = C[80];
            n9 += C[81];
            int n10 = C[83];
            n10 += C[84];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= C[82])) & -1L >>> (n10 -= C[85]);
            long l19 = l8;
            int n11 = C[86];
            n11 -= C[87];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= C[88]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = C[89];
            n13 -= C[90];
            int n14 = C[92];
            n14 ^= C[93];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= C[91])) & -1L >>> (n14 ^= C[94]);
            int n15 = C[95];
            n15 += C[96];
            long l21 = l9;
            int n16 = C[98];
            n16 += C[99];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= C[97]) ^ l21) & -1L << (n16 ^= C[100]);
            int n17 = C[101];
            n17 += C[102];
            n17 ^= C[103];
            int n18 = C[104];
            n18 += C[105];
            long l22 = l11;
            int n19 = C[107];
            n19 -= C[108];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= C[106]))) ^ l22) & -1L >>> (n19 -= C[109]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = C[110];
            n20 += C[111];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += C[112]);
            while (true) {
                int n21 = C[113];
                n21 ^= C[114];
                if ((int)(l13 >>> (n21 ^= C[115])) >= (int)l11) break;
                int n22 = C[116];
                n22 += C[117];
                int n23 = C[119];
                n23 ^= C[120];
                cArray2[(int)(l13 >>> (n22 += a_0.C[118]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= C[121]))];
                l13 += 0x100000000L;
            }
            int n24 = C[122];
            n24 -= C[123];
            int n25 = (int)(l14 >>> (n24 -= C[124]));
            l14 += 0x100000000L;
            a_0.a[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = C[125];
            n26 -= C[126];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= C[127]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[C[128]];
        String string = (String)object[C[129]];
        object = object[C[130]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[131]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[132]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[134] ^ C[135]];
                byArray[a_0.C[136] ^ a_0.C[137]] = C[138] ^ C[139];
                byArray[a_0.C[140] ^ a_0.C[141]] = C[142] ^ C[143];
                byArray[a_0.C[144] ^ a_0.C[145]] = C[146] ^ C[147];
                byArray[a_0.C[148] ^ a_0.C[149]] = C[150] ^ C[151];
                byArray[a_0.C[152] ^ a_0.C[153]] = C[154] ^ C[155];
                byArray[a_0.C[156] ^ a_0.C[157]] = C[158] ^ C[159];
                byArray[a_0.C[160] ^ a_0.C[161]] = C[162] ^ C[163];
                byArray[a_0.C[164] ^ a_0.C[165]] = C[166] ^ C[167];
                byArray[a_0.C[168] ^ a_0.C[169]] = C[170] ^ C[171];
                byArray[a_0.C[172] ^ a_0.C[173]] = C[174] ^ C[175];
                byArray[a_0.C[176] ^ a_0.C[177]] = C[178] ^ C[179];
                byArray[a_0.C[180] ^ a_0.C[181]] = C[182] ^ C[183];
                byArray[a_0.C[184] ^ a_0.C[185]] = C[186] ^ C[187];
                byArray[a_0.C[188] ^ a_0.C[189]] = C[190] ^ C[191];
                byArray[a_0.C[192] ^ a_0.C[193]] = C[194] ^ C[195];
                byArray[a_0.C[196] ^ a_0.C[197]] = C[198] ^ C[199];
                objectArray2[a_0.C[133]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[200]];
            if (b == null) {
                byte[] byArray2 = new byte[C[201] ^ C[202]];
                byArray2[a_0.C[203] ^ a_0.C[204]] = C[205] ^ C[206];
                byArray2[a_0.C[207] ^ a_0.C[208]] = C[209] ^ C[210];
                byArray2[a_0.C[211] ^ a_0.C[212]] = C[213] ^ C[214];
                byArray2[a_0.C[215] ^ a_0.C[216]] = C[217] ^ C[218];
                byArray2[a_0.C[219] ^ a_0.C[220]] = C[221] ^ C[222];
                byArray2[a_0.C[223] ^ a_0.C[224]] = C[225] ^ C[226];
                byArray2[a_0.C[227] ^ a_0.C[228]] = C[229] ^ C[230];
                byArray2[a_0.C[231] ^ a_0.C[232]] = C[233] ^ C[234];
                byArray2[a_0.C[235] ^ a_0.C[236]] = C[237] ^ C[238];
                byArray2[a_0.C[239] ^ a_0.C[240]] = C[241] ^ C[242];
                byArray2[a_0.C[243] ^ a_0.C[244]] = C[245] ^ C[246];
                byArray2[a_0.C[247] ^ a_0.C[248]] = C[249] ^ C[250];
                byArray2[a_0.C[251] ^ a_0.C[252]] = C[253] ^ C[254];
                byArray2[a_0.C[255] ^ a_0.C[256]] = C[257] ^ C[258];
                byArray2[a_0.C[259] ^ a_0.C[260]] = C[261] ^ C[262];
                byArray2[a_0.C[263] ^ a_0.C[264]] = C[265] ^ C[266];
                byArray2[a_0.C[267] ^ a_0.C[268]] = C[269] ^ C[270];
                byArray2[a_0.C[271] ^ a_0.C[272]] = C[273] ^ C[274];
                byArray2[a_0.C[275] ^ a_0.C[276]] = C[277] ^ C[278];
                byArray2[a_0.C[279] ^ a_0.C[280]] = C[281] ^ C[282];
                byArray2[a_0.C[283] ^ a_0.C[284]] = C[285] ^ C[286];
                byArray2[a_0.C[287] ^ a_0.C[288]] = C[289] ^ C[290];
                byArray2[a_0.C[291] ^ a_0.C[292]] = C[293] ^ C[294];
                byArray2[a_0.C[295] ^ a_0.C[296]] = C[297] ^ C[298];
                byArray2[a_0.C[299] ^ a_0.C[300]] = C[301] ^ C[302];
                byArray2[a_0.C[303] ^ a_0.C[304]] = C[305] ^ C[306];
                byArray2[a_0.C[307] ^ a_0.C[308]] = C[309] ^ C[310];
                byArray2[a_0.C[311] ^ a_0.C[312]] = C[313] ^ C[314];
                byArray2[a_0.C[315] ^ a_0.C[316]] = C[317] ^ C[318];
                byArray2[a_0.C[319] ^ a_0.C[320]] = C[321] ^ C[322];
                byArray2[a_0.C[323] ^ a_0.C[324]] = C[325] ^ C[326];
                byArray2[a_0.C[327] ^ a_0.C[328]] = C[329] ^ C[330];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[331], byArray3, C[332], byArray.length);
                System.arraycopy(byArray2, C[333], byArray3, byArray.length, byArray2.length);
                Object object4 = a_0.A()[C[334]];
                if (object4 == null) {
                    char[] cArray = "\u944e\u2e58\u2e57\u2e5a\u2e54\u2de8\u944b\u9435\u942a\u9436\u2e56\u9431\u943d\u943f\u944f\u2e56\u2e5d\u2ded".toCharArray();
                    for (int i = C[335]; i < C[336]; ++i) {
                        int n2 = cArray[i];
                        n2 += C[337];
                        n2 -= C[338];
                        n2 ^= C[339];
                        n2 ^= C[340];
                        n2 -= C[341];
                        n2 -= C[342];
                        n2 -= C[343];
                        n2 ^= C[344];
                        n2 += C[345];
                        cArray[i] = (char)(n2 -= C[346]);
                    }
                    object4 = a_0.A()[a_0.C[347]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[348]];
                byArray4[a_0.C[349]] = C[350];
                byArray4[a_0.C[351]] = C[352];
                byArray4[a_0.C[353]] = C[354];
                byArray4[a_0.C[355]] = C[356];
                byArray4[a_0.C[357]] = C[358];
                byArray4[a_0.C[359]] = C[360];
                byArray4[a_0.C[361]] = C[362];
                byArray4[a_0.C[363]] = C[364];
                byArray4[a_0.C[365]] = C[366];
                byArray4[a_0.C[367]] = C[368];
                byArray4[a_0.C[369]] = C[370];
                byArray4[a_0.C[371]] = C[372];
                byArray4[a_0.C[373]] = C[374];
                byArray4[a_0.C[375]] = C[376];
                byArray4[a_0.C[377]] = C[378];
                byArray4[a_0.C[379]] = C[380];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[381], C[382]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = a_0.A()[C[383]];
                if (object5 == null) {
                    char[] cArray = "\uec4b\uec5f\uec71".toCharArray();
                    for (int i = C[384]; i < C[385]; ++i) {
                        int n3 = cArray[i];
                        n3 -= C[386];
                        n3 += C[387];
                        n3 -= C[388];
                        n3 -= C[389];
                        n3 += C[390];
                        n3 ^= C[391];
                        n3 -= C[392];
                        n3 += C[393];
                        n3 += C[394];
                        n3 -= C[395];
                        n3 += C[396];
                        n3 ^= C[397];
                        n3 ^= C[398];
                        n3 -= C[399];
                        n3 += 27449;
                        cArray[i] = (char)(n3 += 2109);
                    }
                    object5 = a_0.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = a_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u6164\u6160\u60f6\u616a\u6166\u6165\u6166\u616a\u60f3\u616e\u6166\u60f6\u6150\u60f3\u6104\u60ff\u60ff\u610c\u62a9\u6102".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 15936;
                    n4 -= 10049;
                    n4 -= 357;
                    n4 += 10999;
                    n4 ^= 0x1FA9;
                    n4 -= 33753;
                    n4 -= 10987;
                    n4 -= 8476;
                    n4 += 7548;
                    n4 ^= 0x8B2D;
                    n4 += 59837;
                    cArray[i] = (char)(n4 += 38319);
                }
                object6 = a_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[4];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x1ED7 ^ 0x1F47];
        a_0.C[0x9807 ^ 0x98B6] = 0xCB5E ^ 0x98B6;
        a_0.C[0x92BC ^ 0x9330] = 0xA0A3 ^ 0x9330;
        a_0.C[0x589E ^ 0x585A] = 0x55A ^ 0x585A;
        a_0.C[0xE61E ^ 0xE63D] = 0xFFFF198F ^ 0xE63D;
        a_0.C[0x881D ^ 0x88B9] = 0x2D00 ^ 0x88B9;
        a_0.C[0xF804 ^ 0xF8CE] = 0xA2B1 ^ 0xF8CE;
        a_0.C[0xC4B9 ^ 0xC4DE] = 0xFFFF3B73 ^ 0xC4DE;
        a_0.C[0x8C3D ^ 0x8D1A] = 0x4686 ^ 0x8D1A;
        a_0.C[0x3487 ^ 0x3432] = 0xD5EC ^ 0x3432;
        a_0.C[0xDFA9 ^ 0xDF0C] = 0x7AB8 ^ 0xDF0C;
        a_0.C[0x847B ^ 0x8502] = 0x850F ^ 0x8502;
        a_0.C[0x10D6F ^ 0x10DFF] = 0x1B03A ^ 0x10DFF;
        a_0.C[0xE9C9 ^ 0xE8F2] = 0xE1D5 ^ 0xE8F2;
        a_0.C[0xBF0E ^ 0xBF24] = 0xBF28 ^ 0xBF24;
        a_0.C[0x107FC ^ 0x106EC] = 0x19BC5 ^ 0x106EC;
        a_0.C[0x584A ^ 0x592E] = 0x591D ^ 0x592E;
        a_0.C[0xE32B ^ 0xE381] = 0xD89C ^ 0xE381;
        a_0.C[0xD0B8 ^ 0xD1F3] = 0xD1F3 ^ 0xD1F3;
        a_0.C[0xA18C ^ 0xA0FD] = 0xA0F5 ^ 0xA0FD;
        a_0.C[0x420C ^ 0x4346] = 0x5041 ^ 0x4346;
        a_0.C[0xE310 ^ 0xE29B] = 0x1389 ^ 0xE29B;
        a_0.C[0xCAA5 ^ 0xCBC9] = 0xCBC7 ^ 0xCBC9;
        a_0.C[0x1BBE ^ 0x1BF2] = 0xFFFFE435 ^ 0x1BF2;
        a_0.C[0x4D5D ^ 0x4C51] = 0x7500 ^ 0x4C51;
        a_0.C[0xE856 ^ 0xE882] = 0x9242 ^ 0xE882;
        a_0.C[0xA6A1 ^ 0xA7BC] = 0xFFFFFF9F ^ 0xA7BC;
        a_0.C[0xF0C7 ^ 0xF09D] = 0xF080 ^ 0xF09D;
        a_0.C[0x10EB7 ^ 0x10E7E] = 0x15421 ^ 0x10E7E;
        a_0.C[0xD566 ^ 0xD5F7] = 0x6833 ^ 0xD5F7;
        a_0.C[0x6CF4 ^ 0x6CB9] = 0x6C96 ^ 0x6CB9;
        a_0.C[0xCE24 ^ 0xCF10] = 0x2158 ^ 0xCF10;
        a_0.C[0xE36 ^ 0xF6A] = 0xF7A ^ 0xF6A;
        a_0.C[0xCE46 ^ 0xCE03] = 0x2CED ^ 0xCE03;
        a_0.C[0x82F7 ^ 0x822C] = 0x5C6E ^ 0x822C;
        a_0.C[0x1089B ^ 0x10809] = 0x1B59D ^ 0x10809;
        a_0.C[0x83FD ^ 0x836A] = 0x536E ^ 0x836A;
        a_0.C[0x8289 ^ 0x82D5] = 0x82E3 ^ 0x82D5;
        a_0.C[0xE676 ^ 0xE717] = 0xE714 ^ 0xE717;
        a_0.C[0xF12C ^ 0xF1B9] = 0x21BD ^ 0xF1B9;
        a_0.C[0x617 ^ 0x647] = 0xFFFFF9C9 ^ 0x647;
        a_0.C[0x16F4 ^ 0x1670] = 0x1671 ^ 0x1670;
        a_0.C[0xF484 ^ 0xF5DF] = 0xF5DE ^ 0xF5DF;
        a_0.C[0xBF9A ^ 0xBF6B] = 0xFFFFF183 ^ 0xBF6B;
        a_0.C[0x6F82 ^ 0x6FFA] = 0xFFFF903D ^ 0x6FFA;
        a_0.C[0x8150 ^ 0x810E] = 0x8162 ^ 0x810E;
        a_0.C[0xCEC1 ^ 0xCFB7] = 0xCFBC ^ 0xCFB7;
        a_0.C[0x434E ^ 0x439D] = 0x395C ^ 0x439D;
        a_0.C[0xDC25 ^ 0xDCDE] = 0x70FE ^ 0xDCDE;
        a_0.C[0x8E61 ^ 0x8EC1] = 0xBD93 ^ 0x8EC1;
        a_0.C[0x26 ^ 0x102] = 0x513B ^ 0x102;
        a_0.C[0x8DF1 ^ 0x8D33] = 0xE0F8 ^ 0x8D33;
        a_0.C[0xA1F4 ^ 0xA091] = 0xA09D ^ 0xA091;
        a_0.C[0x105B9 ^ 0x10439] = 0x10439 ^ 0x10439;
        a_0.C[0xC7F7 ^ 0xC77E] = 0xE4CC ^ 0xC77E;
        a_0.C[0x6226 ^ 0x62F4] = 0x16B6A ^ 0x62F4;
        a_0.C[0x9A0E ^ 0x9A75] = 0xFFFF65DD ^ 0x9A75;
        a_0.C[0xABCC ^ 0xAB87] = 0xAB97 ^ 0xAB87;
        a_0.C[0x77E7 ^ 0x7759] = 0xFFFF7210 ^ 0x7759;
        a_0.C[0x219A ^ 0x2175] = 0x9033 ^ 0x2175;
        a_0.C[0x1067A ^ 0x10686] = 0x1AABB ^ 0x10686;
        a_0.C[0x102C3 ^ 0x103CC] = 0x19EFF ^ 0x103CC;
        a_0.C[0xFE18 ^ 0xFED5] = 0xFFFFC0DB ^ 0xFED5;
        a_0.C[0x1DF4 ^ 0x1CE2] = 0xD398 ^ 0x1CE2;
        a_0.C[0x1789 ^ 0x17B9] = 0x17BC ^ 0x17B9;
        a_0.C[0x269B ^ 0x2799] = 0x970A ^ 0x2799;
        a_0.C[0x10AEC ^ 0x10BEC] = 0x1BB7F ^ 0x10BEC;
        a_0.C[0xEBBB ^ 0xEB17] = 0xB54C ^ 0xEB17;
        a_0.C[0x9420 ^ 0x9563] = 0x8B91 ^ 0x9563;
        a_0.C[0x9A5E ^ 0x9ABC] = 0xA57 ^ 0x9ABC;
        a_0.C[0xA768 ^ 0xA79F] = 0xB1C5 ^ 0xA79F;
        a_0.C[0xFF69 ^ 0xFE4C] = 0xAE71 ^ 0xFE4C;
        a_0.C[0xB781 ^ 0xB7DC] = 0xB7A6 ^ 0xB7DC;
        a_0.C[0x9F88 ^ 0x9ED0] = 0x1BDE ^ 0x9ED0;
        a_0.C[0x697C ^ 0x6828] = 0x1B7B ^ 0x6828;
        a_0.C[0x1610 ^ 0x16FC] = 0xA92C ^ 0x16FC;
        a_0.C[0xFC10 ^ 0xFC69] = 0xFC04 ^ 0xFC69;
        a_0.C[0x9756 ^ 0x965F] = 0xFFFF45D6 ^ 0x965F;
        a_0.C[0xE5BA ^ 0xE48C] = 0xAC4 ^ 0xE48C;
        a_0.C[0xA654 ^ 0xA694] = 0xCB0F ^ 0xA694;
        a_0.C[0xA44A ^ 0xA49B] = 0xFFFE52B7 ^ 0xA49B;
        a_0.C[0xC9A9 ^ 0xC992] = 0x9192 ^ 0xC992;
        a_0.C[0x3C52 ^ 0x3C44] = 0xFFFFC3E2 ^ 0x3C44;
        a_0.C[0x86C2 ^ 0x87E2] = 0x2D6B ^ 0x87E2;
        a_0.C[0x4A12 ^ 0x4AAD] = 0xB06F ^ 0x4AAD;
        a_0.C[0xEFEB ^ 0xEF71] = 0xFFFF5C32 ^ 0xEF71;
        a_0.C[0xC136 ^ 0xC05E] = 0xFFFF3FFE ^ 0xC05E;
        a_0.C[0x44BC ^ 0x441E] = 0x7738 ^ 0x441E;
        a_0.C[0xF25C ^ 0xF3DE] = 0xAEFC ^ 0xF3DE;
        a_0.C[0xA415 ^ 0xA50F] = 0x642D ^ 0xA50F;
        a_0.C[0x2336 ^ 0x23DD] = 0x9C09 ^ 0x23DD;
        a_0.C[0x2EA7 ^ 0x2FB5] = 0xB29C ^ 0x2FB5;
        a_0.C[0x3913 ^ 0x3812] = 0xFFFF7707 ^ 0x3812;
        a_0.C[0x1B0B ^ 0x1BD2] = 0x54A8 ^ 0x1BD2;
        a_0.C[0x3669 ^ 0x360F] = 0x361E ^ 0x360F;
        a_0.C[0xF557 ^ 0xF418] = 0xF418 ^ 0xF418;
        a_0.C[0xB7E7 ^ 0xB6FF] = 0x77DD ^ 0xB6FF;
        a_0.C[0x2D53 ^ 0x2D48] = 0xFFFFD2B9 ^ 0x2D48;
        a_0.C[0x81F2 ^ 0x81F5] = 0xFFFF7E04 ^ 0x81F5;
        a_0.C[0xD786 ^ 0xD6E5] = 0xD6E1 ^ 0xD6E5;
        a_0.C[0x943A ^ 0x9458] = 0x9442 ^ 0x9458;
        a_0.C[0xC5D4 ^ 0xC5D4] = 0x4940 ^ 0xC5D4;
        a_0.C[0xF1E5 ^ 0xF0D4] = 0x6808 ^ 0xF0D4;
        a_0.C[0xD2F5 ^ 0xD256] = 0xE107 ^ 0xD256;
        a_0.C[0x3917 ^ 0x39D1] = 0xFFFF9B19 ^ 0x39D1;
        a_0.C[0xD29E ^ 0xD3C9] = 0xBA84 ^ 0xD3C9;
        a_0.C[0xE33B ^ 0xE3B7] = 0x4915 ^ 0xE3B7;
        a_0.C[0xCD67 ^ 0xCDE6] = 0xCDE4 ^ 0xCDE6;
        a_0.C[0x96D8 ^ 0x978A] = 0x466A ^ 0x978A;
        a_0.C[0x107C5 ^ 0x10712] = 0x1481D ^ 0x10712;
        a_0.C[0xC9B6 ^ 0xC95C] = 0xCB52 ^ 0xC95C;
        a_0.C[0x10F81 ^ 0x10E0C] = 0x12D99 ^ 0x10E0C;
        a_0.C[0x8596 ^ 0x8598] = 0x85D4 ^ 0x8598;
        a_0.C[0x1D0A ^ 0x1C37] = 0x155B ^ 0x1C37;
        a_0.C[0xBF1B ^ 0xBF52] = 0xFFFF40DE ^ 0xBF52;
        a_0.C[0x1E78 ^ 0x1E1B] = 0x1E78 ^ 0x1E1B;
        a_0.C[0x9D36 ^ 0x9C3D] = 0xA56F ^ 0x9C3D;
        a_0.C[0xDF68 ^ 0xDE4E] = 0x8E77 ^ 0xDE4E;
        a_0.C[0x23F3 ^ 0x2293] = 0xFFFFDD3E ^ 0x2293;
        a_0.C[0x3903 ^ 0x3989] = 0xFFFFE5DA ^ 0x3989;
        a_0.C[0x7776 ^ 0x7786] = 0xC6D3 ^ 0x7786;
        a_0.C[0x18D5 ^ 0x1820] = 0xFFFF491D ^ 0x1820;
        a_0.C[0x5912 ^ 0x593B] = 0xFFFFA6C0 ^ 0x593B;
        a_0.C[0xCC6A ^ 0xCC16] = 0xCC3A ^ 0xCC16;
        a_0.C[0xE019 ^ 0xE09C] = 0xE09C ^ 0xE09C;
        a_0.C[0x70E2 ^ 0x70B4] = 0x70ED ^ 0x70B4;
        a_0.C[0x10A4E ^ 0x10A62] = 0xFFFEF5D0 ^ 0x10A62;
        a_0.C[0xA064 ^ 0xA049] = 0xA071 ^ 0xA049;
        a_0.C[0x70CB ^ 0x7032] = 0x664C ^ 0x7032;
        a_0.C[0x1075 ^ 0x1019] = 0x1020 ^ 0x1019;
        a_0.C[0xA141 ^ 0xA047] = 0xD4D8 ^ 0xA047;
        a_0.C[0xC5B7 ^ 0xC57F] = 0xC57F ^ 0xC57F;
        a_0.C[0xB84E ^ 0xB8CD] = 0xB8CC ^ 0xB8CD;
        a_0.C[0x6DE0 ^ 0x6DDE] = 0x99FD ^ 0x6DDE;
        a_0.C[0xE55E ^ 0xE53E] = 0xE528 ^ 0xE53E;
        a_0.C[0xE5E5 ^ 0xE4A5] = 0xF645 ^ 0xE4A5;
        a_0.C[0x3B0A ^ 0x3B12] = 0x3B07 ^ 0x3B12;
        a_0.C[0xDDBB ^ 0xDD63] = 0x927D ^ 0xDD63;
        a_0.C[0x680 ^ 0x65D] = 0xFFFF279E ^ 0x65D;
        a_0.C[0x6C5 ^ 0x65C] = 0x4ADF ^ 0x65C;
        a_0.C[0x6C27 ^ 0x6C70] = 0x6C26 ^ 0x6C70;
        a_0.C[0xE06 ^ 0xE4E] = 0xFFFFF1A1 ^ 0xE4E;
        a_0.C[0x10BED ^ 0x10B04] = 0xFFFEF681 ^ 0x10B04;
        a_0.C[0x974D ^ 0x9649] = 0xE2D6 ^ 0x9649;
        a_0.C[0x1B20 ^ 0x1A6E] = 0x1A6F ^ 0x1A6E;
        a_0.C[0x10555 ^ 0x104D6] = 0x10F14 ^ 0x104D6;
        a_0.C[0xE218 ^ 0xE285] = 0x770C ^ 0xE285;
        a_0.C[0xEA88 ^ 0xEAC9] = 0xD612 ^ 0xEAC9;
        a_0.C[0x7C5E ^ 0x7CBF] = 0xEC67 ^ 0x7CBF;
        a_0.C[0xE59E ^ 0xE4A9] = 0x1EA12 ^ 0xE4A9;
        a_0.C[0xB0C1 ^ 0xB0F9] = 0xB0F9 ^ 0xB0F9;
        a_0.C[0x93D0 ^ 0x93D2] = 0xFFFF6C17 ^ 0x93D2;
        a_0.C[0x10 ^ 0x16C] = 0xFFFFFEB4 ^ 0x16C;
        a_0.C[0xA348 ^ 0xA218] = 0xA20A ^ 0xA218;
        a_0.C[0xF52 ^ 0xE4D] = 0xA4D2 ^ 0xE4D;
        a_0.C[0x780C ^ 0x7843] = 0xFFFF87C0 ^ 0x7843;
        a_0.C[0x681 ^ 0x7C4] = 0x192A ^ 0x7C4;
        a_0.C[0x6CFD ^ 0x6CA6] = 0x6CB9 ^ 0x6CA6;
        a_0.C[0xE41C ^ 0xE598] = 0x7F5E ^ 0xE598;
        a_0.C[0x7B50 ^ 0x7B71] = 0xFFFF848F ^ 0x7B71;
        a_0.C[0xB466 ^ 0xB4EE] = 0x9752 ^ 0xB4EE;
        a_0.C[0x8ABC ^ 0x8B83] = 0x996F ^ 0x8B83;
        a_0.C[0xCFC2 ^ 0xCE93] = 0x3F93 ^ 0xCE93;
        a_0.C[0xE999 ^ 0xE9DE] = 0xFFFF1663 ^ 0xE9DE;
        a_0.C[0x9068 ^ 0x9077] = 0xFFFF6FCB ^ 0x9077;
        a_0.C[0x2F08 ^ 0x2F4A] = 0xF326 ^ 0x2F4A;
        a_0.C[0x10E6A ^ 0x10E2E] = 0x17623 ^ 0x10E2E;
        a_0.C[0x438F ^ 0x43A7] = 0x4387 ^ 0x43A7;
        a_0.C[0x496C ^ 0x4879] = 0x876E ^ 0x4879;
        a_0.C[0xFC2F ^ 0xFCE8] = 0xA1EF ^ 0xFCE8;
        a_0.C[0x10BB3 ^ 0x10ADE] = 0x10AD0 ^ 0x10ADE;
        a_0.C[0xDE03 ^ 0xDF3D] = 0xD611 ^ 0xDF3D;
        a_0.C[0xF054 ^ 0xF14A] = 0x56B7 ^ 0xF14A;
        a_0.C[0xC19C ^ 0xC13D] = 0xF26C ^ 0xC13D;
        a_0.C[0x3CDF ^ 0x3DA2] = 0x3DA0 ^ 0x3DA2;
        a_0.C[0x28D4 ^ 0x299D] = 0x3AF0 ^ 0x299D;
        a_0.C[0xA8CD ^ 0xA817] = 0xE709 ^ 0xA817;
        a_0.C[0x2D00 ^ 0x2D4A] = 0x2D23 ^ 0x2D4A;
        a_0.C[0x10753 ^ 0x10600] = 0x1C7E0 ^ 0x10600;
        a_0.C[0x403B ^ 0x4155] = 0xFFFFBEF5 ^ 0x4155;
        a_0.C[0xAB4D ^ 0xAB77] = 0xAA77 ^ 0xAB77;
        a_0.C[0x1518 ^ 0x151B] = 0xFFFFEA72 ^ 0x151B;
        a_0.C[0x2DCD ^ 0x2C93] = 0xFFFFD34B ^ 0x2C93;
        a_0.C[0x457B ^ 0x4458] = 0x1469 ^ 0x4458;
        a_0.C[0x43CB ^ 0x4334] = 0xF3AA ^ 0x4334;
        a_0.C[0x55EB ^ 0x55F5] = 0xFFFFAA5E ^ 0x55F5;
        a_0.C[0x2B8F ^ 0x2BDC] = 0x2B06 ^ 0x2BDC;
        a_0.C[0x6495 ^ 0x64B3] = 0x6484 ^ 0x64B3;
        a_0.C[0xE797 ^ 0xE748] = 0x77BD ^ 0xE748;
        a_0.C[0xE3F0 ^ 0xE2AD] = 0xE2A2 ^ 0xE2AD;
        a_0.C[0x5787 ^ 0x57BB] = 0xBE4B ^ 0x57BB;
        a_0.C[0xEEE5 ^ 0xEFE0] = 0x9B33 ^ 0xEFE0;
        a_0.C[0x97D7 ^ 0x9771] = 0xFFFFCD23 ^ 0x9771;
        a_0.C[0x897D ^ 0x893D] = 0xCEC8 ^ 0x893D;
        a_0.C[0xC697 ^ 0xC6A3] = 0xC6A3 ^ 0xC6A3;
        a_0.C[0x4461 ^ 0x4525] = 0x5BC2 ^ 0x4525;
        a_0.C[0xAFA4 ^ 0xAF30] = 0x7F31 ^ 0xAF30;
        a_0.C[0x103EB ^ 0x102D9] = 0x19A1E ^ 0x102D9;
        a_0.C[0x8331 ^ 0x831F] = 0x830F ^ 0x831F;
        a_0.C[0x4F3B ^ 0x4E03] = 0x140BA ^ 0x4E03;
        a_0.C[0x2606 ^ 0x2759] = 0x2758 ^ 0x2759;
        a_0.C[0xCC8E ^ 0xCC8A] = 0xCCF0 ^ 0xCC8A;
        a_0.C[0xD921 ^ 0xD80D] = 0xF901 ^ 0xD80D;
        a_0.C[0x6AB4 ^ 0x6ABB] = 0x6ACA ^ 0x6ABB;
        a_0.C[0x10CEB ^ 0x10DC5] = 0x12CC9 ^ 0x10DC5;
        a_0.C[0xAC72 ^ 0xAD5F] = 0xFFFF73F6 ^ 0xAD5F;
        a_0.C[0x9161 ^ 0x9153] = 0x914E ^ 0x9153;
        a_0.C[0x2B16 ^ 0x2BF5] = 0xCEF2 ^ 0x2BF5;
        a_0.C[0x65A5 ^ 0x6541] = 0x8054 ^ 0x6541;
        a_0.C[0x1044B ^ 0x104C4] = 0x1AE69 ^ 0x104C4;
        a_0.C[0xCE6E ^ 0xCE00] = 0xCED5 ^ 0xCE00;
        a_0.C[0x2397 ^ 0x2324] = 0x70CC ^ 0x2324;
        a_0.C[0x4682 ^ 0x4693] = 0x46CF ^ 0x4693;
        a_0.C[0x2399 ^ 0x228D] = 0xEDF7 ^ 0x228D;
        a_0.C[0x7053 ^ 0x7056] = 0xFFFF8FB5 ^ 0x7056;
        a_0.C[0xB432 ^ 0xB4D7] = 0xFFFFAE69 ^ 0xB4D7;
        a_0.C[0x8437 ^ 0x843A] = 0x843D ^ 0x843A;
        a_0.C[0xA94 ^ 0xAA7] = 0xAA4 ^ 0xAA7;
        a_0.C[0x5DDB ^ 0x5D23] = 0x4B76 ^ 0x5D23;
        a_0.C[0xB334 ^ 0xB380] = 0x5254 ^ 0xB380;
        a_0.C[0x8FE6 ^ 0x8ECC] = 0x4556 ^ 0x8ECC;
        a_0.C[0x5C36 ^ 0x5D4C] = 0xFFFFA2F8 ^ 0x5D4C;
        a_0.C[0xFFF2 ^ 0xFF31] = 0x92AE ^ 0xFF31;
        a_0.C[0x91AC ^ 0x902A] = 0xB8A2 ^ 0x902A;
        a_0.C[0xF449 ^ 0xF46D] = 0xFFFF0BAE ^ 0xF46D;
        a_0.C[0xF274 ^ 0xF306] = 0xFFFF0CCB ^ 0xF306;
        a_0.C[0xF9FC ^ 0xF939] = 0xA43E ^ 0xF939;
        a_0.C[0x6327 ^ 0x634A] = 0xFFFF9CAE ^ 0x634A;
        a_0.C[0x81E0 ^ 0x80C8] = 0x4B52 ^ 0x80C8;
        a_0.C[0xBCDC ^ 0xBCD0] = 0xBC9B ^ 0xBCD0;
        a_0.C[0xB90 ^ 0xA87] = 0xCBB5 ^ 0xA87;
        a_0.C[0x839F ^ 0x8325] = 0xFFFF6E25 ^ 0x8325;
        a_0.C[0xDEA ^ 0xDDB] = 0xDDD ^ 0xDDB;
        a_0.C[0x4E53 ^ 0x4ECD] = 0xDB28 ^ 0x4ECD;
        a_0.C[0xF1FC ^ 0xF1F6] = 0xFFFF0E6B ^ 0xF1F6;
        a_0.C[0x5107 ^ 0x5194] = 0xEC50 ^ 0x5194;
        a_0.C[0x3080 ^ 0x3007] = 0x59CB ^ 0x3007;
        a_0.C[0xEEC3 ^ 0xEEC8] = 0xFFFF117A ^ 0xEEC8;
        a_0.C[0x10E7E ^ 0x10E93] = 0x1B112 ^ 0x10E93;
        a_0.C[0x788 ^ 0x6AA] = 0xAC23 ^ 0x6AA;
        a_0.C[0x3EC0 ^ 0x3E6E] = 0xFFFF9F9A ^ 0x3E6E;
        a_0.C[0xE7C9 ^ 0xE755] = 0x72DC ^ 0xE755;
        a_0.C[0x5179 ^ 0x51C9] = 0x223 ^ 0x51C9;
        a_0.C[0x544A ^ 0x5435] = 0xFFFFABA5 ^ 0x5435;
        a_0.C[0x28C0 ^ 0x2867] = 0x8DD3 ^ 0x2867;
        a_0.C[0x67D4 ^ 0x6653] = 0xE1A ^ 0x6653;
        a_0.C[0xA73B ^ 0xA78D] = 0x466A ^ 0xA78D;
        a_0.C[0x98E5 ^ 0x99ED] = 0xB59B ^ 0x99ED;
        a_0.C[0x571F ^ 0x5787] = 0x1B08 ^ 0x5787;
        a_0.C[0x1094A ^ 0x10806] = 0x10806 ^ 0x10806;
        a_0.C[0xD48C ^ 0xD5E3] = 0xD5E9 ^ 0xD5E3;
        a_0.C[0x4C13 ^ 0x4C76] = 0xFFFFB3DA ^ 0x4C76;
        a_0.C[0x58B0 ^ 0x59EA] = 0xA035 ^ 0x59EA;
        a_0.C[0xF55E ^ 0xF5E6] = 0xE749 ^ 0xF5E6;
        a_0.C[0xAADC ^ 0xABA4] = 0xABA3 ^ 0xABA4;
        a_0.C[0xAF7 ^ 0xBDC] = 0x2AC4 ^ 0xBDC;
        a_0.C[0x651C ^ 0x640D] = 0xF935 ^ 0x640D;
        a_0.C[0xFAE5 ^ 0xFAC7] = 0xFA80 ^ 0xFAC7;
        a_0.C[0x97E0 ^ 0x9721] = 0xFABE ^ 0x9721;
        a_0.C[0xCF09 ^ 0xCE15] = 0x69E8 ^ 0xCE15;
        a_0.C[0x2845 ^ 0x28C5] = 0x28C4 ^ 0x28C5;
        a_0.C[0x2E3E ^ 0x2EEB] = 0x5435 ^ 0x2EEB;
        a_0.C[0x2DE4 ^ 0x2C8D] = 0x2C84 ^ 0x2C8D;
        a_0.C[0x109EC ^ 0x10912] = 0x1A52F ^ 0x10912;
        a_0.C[0x1358 ^ 0x1300] = 0xFFFFECE3 ^ 0x1300;
        a_0.C[0xD702 ^ 0xD710] = 0xFFFF289C ^ 0xD710;
        a_0.C[0x78AB ^ 0x79EC] = 0x6AFC ^ 0x79EC;
        a_0.C[0x93F4 ^ 0x93D3] = 0x93F9 ^ 0x93D3;
        a_0.C[0x2889 ^ 0x29F6] = 0x29F4 ^ 0x29F6;
        a_0.C[0xC882 ^ 0xC876] = 0x6694 ^ 0xC876;
        a_0.C[0x8D9F ^ 0x8C11] = 0x7E06 ^ 0x8C11;
        a_0.C[0xD378 ^ 0xD321] = 0xD31C ^ 0xD321;
        a_0.C[0x10D69 ^ 0x10C53] = 0x2EA ^ 0x10C53;
        a_0.C[0x4F81 ^ 0x4E8C] = 0x778B ^ 0x4E8C;
        a_0.C[0x3961 ^ 0x3916] = 0xFFFFC65C ^ 0x3916;
        a_0.C[0x989E ^ 0x9879] = 0x9A72 ^ 0x9879;
        a_0.C[0xEF5D ^ 0xEF3C] = 0xEF13 ^ 0xEF3C;
        a_0.C[0xAFEF ^ 0xAFE9] = 0xAFD8 ^ 0xAFE9;
        a_0.C[0x1162 ^ 0x11E4] = 0x7838 ^ 0x11E4;
        a_0.C[0xEDF ^ 0xE09] = 0x74C9 ^ 0xE09;
        a_0.C[0x7454 ^ 0x74C2] = 0xA488 ^ 0x74C2;
        a_0.C[0xC907 ^ 0xC860] = 0xC865 ^ 0xC860;
        a_0.C[0x10606 ^ 0x10612] = 0xFFFEF9B5 ^ 0x10612;
        a_0.C[0xA180 ^ 0xA13B] = 0xB39F ^ 0xA13B;
        a_0.C[0x609A ^ 0x6110] = 0xC1FF ^ 0x6110;
        a_0.C[0xC6A9 ^ 0xC604] = 0x9859 ^ 0xC604;
        a_0.C[0x5FE6 ^ 0x5FB4] = 0xFFFFA022 ^ 0x5FB4;
        a_0.C[0x3754 ^ 0x3619] = 0x3619 ^ 0x3619;
        a_0.C[0x1D12 ^ 0x1D78] = 0x1D13 ^ 0x1D78;
        a_0.C[0xF96D ^ 0xF913] = 0xFFFF0686 ^ 0xF913;
        a_0.C[0xA706 ^ 0xA61D] = 0x1EE ^ 0xA61D;
        a_0.C[0xF4A3 ^ 0xF494] = 0xF496 ^ 0xF494;
        a_0.C[0xA6D1 ^ 0xA6A2] = 0xA684 ^ 0xA6A2;
        a_0.C[0x2CC2 ^ 0x2C31] = 0x82D9 ^ 0x2C31;
        a_0.C[0x3CAB ^ 0x3CED] = 0x3CED ^ 0x3CED;
        a_0.C[0x6523 ^ 0x6453] = 0x6426 ^ 0x6453;
        a_0.C[0xEDA5 ^ 0xED90] = 0xED91 ^ 0xED90;
        a_0.C[0xA350 ^ 0xA3FF] = 0xFDA2 ^ 0xA3FF;
        a_0.C[0xFF25 ^ 0xFE26] = 0x8AA0 ^ 0xFE26;
        a_0.C[0x8193 ^ 0x813A] = 0xBA78 ^ 0x813A;
        a_0.C[0x95FF ^ 0x9557] = 0xAE1D ^ 0x9557;
        a_0.C[0x86B3 ^ 0x8783] = 0x1F44 ^ 0x8783;
        a_0.C[0xF880 ^ 0xF868] = 0xFA66 ^ 0xF868;
        a_0.C[0xB02C ^ 0xB05E] = 0xFFFF4FC4 ^ 0xB05E;
        a_0.C[0x4B94 ^ 0x4B9D] = 0xFFFFB4D2 ^ 0x4B9D;
        a_0.C[0xAC60 ^ 0xAD59] = 0xFFFE5C18 ^ 0xAD59;
        a_0.C[0x6CA5 ^ 0x6C4B] = 0xD39B ^ 0x6C4B;
        a_0.C[0x8D89 ^ 0x8CB5] = 0x8599 ^ 0x8CB5;
        a_0.C[0xAFAE ^ 0xAF93] = 0xE622 ^ 0xAF93;
        a_0.C[0xE7FB ^ 0xE6F5] = 0xDFA4 ^ 0xE6F5;
        a_0.C[0xCC58 ^ 0xCC4F] = 0xCC52 ^ 0xCC4F;
        a_0.C[0x5DF4 ^ 0x5CC1] = 0xFFFF4D72 ^ 0x5CC1;
        a_0.C[0x45E6 ^ 0x446E] = 0x1C22 ^ 0x446E;
        a_0.C[0x4F61 ^ 0x4F2F] = 0xFFFFB0A3 ^ 0x4F2F;
        a_0.C[0x8A39 ^ 0x8A44] = 0xFFFF7501 ^ 0x8A44;
        a_0.C[0x4DA7 ^ 0x4D38] = 0xD8B1 ^ 0x4D38;
        a_0.C[0xFB5C ^ 0xFB73] = 0xFFFF0493 ^ 0xFB73;
        a_0.C[0x701D ^ 0x70B6] = 0x4BF4 ^ 0x70B6;
        a_0.C[0xFBDE ^ 0xFBF5] = 0xFBAF ^ 0xFBF5;
        a_0.C[0x6667 ^ 0x660C] = 0x6631 ^ 0x660C;
        a_0.C[0x456 ^ 0x446] = 0x457 ^ 0x446;
        a_0.C[0x2FD6 ^ 0x2F2C] = 0x3979 ^ 0x2F2C;
        a_0.C[0xB640 ^ 0xB653] = 0xFFFF4984 ^ 0xB653;
        a_0.C[0x8931 ^ 0x8983] = 0xFFFF25A4 ^ 0x8983;
        a_0.C[0xA080 ^ 0xA1A1] = 0xFFFFF4E8 ^ 0xA1A1;
        a_0.C[0xC2 ^ 0x3F] = 0xFFFF538F ^ 0x3F;
        a_0.C[0xAAA1 ^ 0xAA97] = 0xAA97 ^ 0xAA97;
        a_0.C[0xF5D2 ^ 0xF4C1] = 0x3BA7 ^ 0xF4C1;
        a_0.C[0x40B6 ^ 0x41F4] = 0x5314 ^ 0x41F4;
        a_0.C[0xEB7A ^ 0xEA3C] = 0xF4DB ^ 0xEA3C;
        a_0.C[0xDFEE ^ 0xDF9F] = 0xFFFF2003 ^ 0xDF9F;
        a_0.C[0xF450 ^ 0xF536] = 0xF505 ^ 0xF536;
        a_0.C[0x784F ^ 0x79C0] = 0x7EF8 ^ 0x79C0;
        a_0.C[0xEDB8 ^ 0xECBF] = 0xC0CE ^ 0xECBF;
        a_0.C[0x1F73 ^ 0x1FB8] = 0xDE0B ^ 0x1FB8;
        a_0.C[0x3B84 ^ 0x3AF1] = 0x3AFA ^ 0x3AF1;
        a_0.C[0xAEDE ^ 0xAECB] = 0xFFFF514D ^ 0xAECB;
        a_0.C[0xCDEF ^ 0xCC91] = 0xCD91 ^ 0xCC91;
        a_0.C[0xFEFA ^ 0xFE36] = 0x3F9A ^ 0xFE36;
        a_0.C[0x35B6 ^ 0x3544] = 0x8411 ^ 0x3544;
        a_0.C[0x90EF ^ 0x9087] = 0x9019 ^ 0x9087;
        a_0.C[0x4CE2 ^ 0x4C3C] = 0x9277 ^ 0x4C3C;
        a_0.C[0x1084B ^ 0x1083D] = 0xFFFEF7ED ^ 0x1083D;
        a_0.C[0x4A67 ^ 0x4A08] = 0xFFFFB5C0 ^ 0x4A08;
        a_0.C[0x586D ^ 0x583C] = 0x5835 ^ 0x583C;
        a_0.C[0x12E9 ^ 0x1360] = 0x55EE ^ 0x1360;
        a_0.C[0xF4B1 ^ 0xF4C1] = 0xFFFF0B42 ^ 0xF4C1;
        a_0.C[0x69F2 ^ 0x69D7] = 0xFFFF965C ^ 0x69D7;
        a_0.C[0x41D4 ^ 0x40AF] = 0x40AD ^ 0x40AF;
        a_0.C[0x9518 ^ 0x95D7] = 0x19C49 ^ 0x95D7;
        a_0.C[0x3CF9 ^ 0x3C83] = 0xFFFFC377 ^ 0x3C83;
        a_0.C[0xE47 ^ 0xF6E] = 0xC484 ^ 0xF6E;
        a_0.C[0xE53E ^ 0xE589] = 0x457 ^ 0xE589;
        a_0.C[0x813F ^ 0x8066] = 0x6849 ^ 0x8066;
        a_0.C[0x911A ^ 0x906D] = 0x906D ^ 0x906D;
        a_0.C[0xFB6D ^ 0xFB71] = 0xFFFF04E9 ^ 0xFB71;
        a_0.C[0x7950 ^ 0x785A] = 0x542C ^ 0x785A;
        a_0.C[0x9D3 ^ 0x9BA] = 0xFFFFF657 ^ 0x9BA;
        a_0.C[0x5B8F ^ 0x5BD0] = 0xFFFFA429 ^ 0x5BD0;
        a_0.C[0x95B5 ^ 0x94C6] = 0x94C1 ^ 0x94C6;
        a_0.C[0x75BC ^ 0x75E9] = 0x75A0 ^ 0x75E9;
        a_0.C[0x535D ^ 0x5236] = 0x5230 ^ 0x5236;
        a_0.C[0xDC22 ^ 0xDC1B] = 0xDC1B ^ 0xDC1B;
        a_0.C[0xF9D2 ^ 0xF893] = 0xFFFF15A8 ^ 0xF893;
        a_0.C[0x10015 ^ 0x100C5] = 0x95B ^ 0x100C5;
        a_0.C[0xA1B1 ^ 0xA10C] = 0x5BCE ^ 0xA10C;
        a_0.C[0x596F ^ 0x591A] = 0x5928 ^ 0x591A;
        a_0.C[0x8C96 ^ 0x8C18] = 0xFFFFD91E ^ 0x8C18;
        a_0.C[0xB3FF ^ 0xB2CC] = 0x5C9C ^ 0xB2CC;
        a_0.C[0x550F ^ 0x55C1] = 0x946D ^ 0x55C1;
        a_0.C[0x3A6A ^ 0x3A8A] = 0xAA61 ^ 0x3A8A;
        a_0.C[0xE509 ^ 0xE58B] = 0xE58B ^ 0xE58B;
        a_0.C[0x400 ^ 0x48B] = 0x2739 ^ 0x48B;
        a_0.C[0x666D ^ 0x6670] = 0xFFFF99F1 ^ 0x6670;
        a_0.C[0xB2B ^ 0xB4F] = 0xB12 ^ 0xB4F;
        a_0.C[0x52BC ^ 0x53DE] = 0xFFFFAC2A ^ 0x53DE;
        a_0.C[0xB43F ^ 0xB569] = 0xC822 ^ 0xB569;
        a_0.C[0xDEA9 ^ 0xDE75] = 0x3E ^ 0xDE75;
        a_0.C[0xD04E ^ 0xD0C3] = 0x7A6E ^ 0xD0C3;
        a_0.C[0xB868 ^ 0xB902] = 0xFFFF46FD ^ 0xB902;
        a_0.C[0xB748 ^ 0xB63C] = 0xB65C ^ 0xB63C;
        a_0.C[0x3FB2 ^ 0x3FC6] = 0x3FD8 ^ 0x3FC6;
        a_0.C[0xE2CB ^ 0xE39E] = 0x67A9 ^ 0xE39E;
        a_0.C[0x108DE ^ 0x109F1] = 0x1912D ^ 0x109F1;
        a_0.C[0x5C9C ^ 0x5C7A] = 0xB96F ^ 0x5C7A;
        a_0.C[0x3DB3 ^ 0x3D8C] = 0x12F8 ^ 0x3D8C;
        a_0.C[0xF1CA ^ 0xF13C] = 0x5FDE ^ 0xF13C;
        a_0.C[0xA696 ^ 0xA78F] = 0x66C5 ^ 0xA78F;
        a_0.C[0xADFC ^ 0xAC7D] = 0xAC7E ^ 0xAC7D;
        a_0.C[0x97F2 ^ 0x97A6] = 0xFFFF6829 ^ 0x97A6;
        a_0.C[0x74B3 ^ 0x740F] = 0x8EC4 ^ 0x740F;
        a_0.C[0x22E4 ^ 0x22FE] = 0x22F7 ^ 0x22FE;
        a_0.C[0x54AE ^ 0x54A6] = 0xFFFFAB66 ^ 0x54A6;
        a_0.C[0xCE39 ^ 0xCEA2] = 0x8221 ^ 0xCEA2;
        a_0.C[0x10827 ^ 0x10807] = 0x10811 ^ 0x10807;
        a_0.C[0x3AF ^ 0x3B6] = 0xFFFFFC4C ^ 0x3B6;
        a_0.C[0x6A3F ^ 0x6A3E] = 0xFFFF95B1 ^ 0x6A3E;
        a_0.C[0xEB7C ^ 0xEB3F] = 0x3143 ^ 0xEB3F;
        a_0.C[0x8576 ^ 0x85CF] = 0x976B ^ 0x85CF;
        a_0.C[0x1025F ^ 0x103DA] = 0x10EFD ^ 0x103DA;
        a_0.C[0x28E7 ^ 0x29AF] = 0x3AA8 ^ 0x29AF;
    }
}

