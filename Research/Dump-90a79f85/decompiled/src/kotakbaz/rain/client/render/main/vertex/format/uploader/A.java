/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.ARBVertexAttribBinding
 *  org.lwjgl.opengl.GL30
 */
package kotakbaz.rain.client.render.main.vertex.format.uploader;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.vertex.format.a_0;
import org.lwjgl.opengl.ARBVertexAttribBinding;
import org.lwjgl.opengl.GL30;

public class A
extends kotakbaz.rain.client.render.main.vertex.format.uploader.a_0 {
    private final boolean a;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    /*
     * Unable to fully structure code
     */
    protected A() {
        block3: {
            block2: {
                super();
                var3_1 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0];
                var3_1 -= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[1];
                var5_2 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[3];
                var5_2 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[4];
                if (!((String)kotakbaz.rain.client.render.main.vertex.format.uploader.A.A[var3_1 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[2]]).equals(GL30.glGetString((int)(var5_2 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[5])))) break block2;
                var7_3 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[6];
                var7_3 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[7];
                var1_4 = GL30.glGetString((int)(var7_3 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[8]));
                var9_5 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[9];
                var9_5 -= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[10];
                if (var1_4.contains((String)kotakbaz.rain.client.render.main.vertex.format.uploader.A.A[var9_5 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[11]])) ** GOTO lbl-1000
                var11_6 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[12];
                var11_6 += kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[13];
                if (var1_4.contains((String)kotakbaz.rain.client.render.main.vertex.format.uploader.A.A[var11_6 -= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[14]])) ** GOTO lbl-1000
                var13_7 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[15];
                var13_7 += kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[16];
                if (var1_4.contains((String)kotakbaz.rain.client.render.main.vertex.format.uploader.A.A[var13_7 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[17]])) lbl-1000:
                // 3 sources

                {
                    var15_8 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[18];
                    var15_8 -= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[19];
                    v0 = var15_8 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[20];
                } else {
                    var17_9 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[21];
                    var17_9 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[22];
                    v0 = var17_9 ^= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[23];
                }
                this.a = v0;
                break block3;
            }
            var19_10 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[24];
            var19_10 -= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[25];
            this.a = var19_10 += kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[26];
        }
    }

    @Override
    public void applyFormatToBuffer(b b2, a_0 a_02) {
        kotakbaz.rain.client.render.main.vertex.format.A a2 = a_02.getVertexFormatBufferOrCreate(() -> this.createVertexFormatBuffer(a_02));
        GL30.glBindVertexArray((int)a2.glId());
        if (a2.buffer().get() != b2) {
            if (this.a && a2.buffer().get() != null && a2.buffer().get().getId() == b2.getId()) {
                int n = d[27];
                n += d[28];
                int n2 = d[30];
                n2 -= d[31];
                int n3 = d[33];
                ARBVertexAttribBinding.glBindVertexBuffer((int)(n += d[29]), (int)(n2 += d[32]), (long)0L, (int)(n3 -= d[34]));
            }
            int n = d[35];
            n -= d[36];
            ARBVertexAttribBinding.glBindVertexBuffer((int)(n -= d[37]), (int)b2.getId(), (long)0L, (int)a_02.getVertexSize());
            a2.buffer().set(b2);
        }
    }

    @Override
    public kotakbaz.rain.client.render.main.vertex.format.A createVertexFormatBuffer(a_0 a_02) {
        long l = 7821908519888117174L;
        long l2 = 5342853889387692073L;
        long l3 = 4690892972683423662L;
        long l4 = -4117976303872343541L;
        long l5 = -364504261180857087L;
        long l6 = -625188563186512603L;
        int n = d[38];
        n -= d[39];
        long l7 = l2;
        int n2 = d[41];
        n2 ^= d[42];
        l2 = l7 ^ ((long)GL30.glGenVertexArrays() << (n -= d[40]) ^ l7) & -1L << (n2 ^= d[43]);
        int n3 = d[44];
        n3 += d[45];
        GL30.glBindVertexArray((int)((int)(l2 >>> (n3 += d[46]))));
        List<kotakbaz.rain.client.render.main.vertex.element.a_0> list = a_02.getVertexElements();
        long l8 = l6;
        int n4 = d[47];
        n4 -= d[48];
        l6 = l8 ^ (0L ^ l8) & -1L << (n4 ^= d[49]);
        while (true) {
            int n5 = d[50];
            n5 ^= d[51];
            if ((int)(l6 >>> (n5 ^= d[52])) >= list.size()) break;
            int n6 = d[53];
            n6 ^= d[54];
            kotakbaz.rain.client.render.main.vertex.element.a_0 a_03 = list.get((int)(l6 >>> (n6 -= d[55])));
            int n7 = d[56];
            n7 += d[57];
            GL30.glEnableVertexAttribArray((int)((int)(l6 >>> (n7 += d[58]))));
            int n8 = d[59];
            n8 -= d[60];
            if (a_03.getType().glId() == (n8 ^= d[61])) {
                int n9 = d[62];
                n9 += d[63];
                boolean bl = d[65];
                bl += d[66];
                ARBVertexAttribBinding.glVertexAttribFormat((int)((int)(l6 >>> (n9 -= d[64]))), (int)a_03.getCount(), (int)a_03.getType().glId(), (boolean)(bl += d[67]), (int)a_02.getElementOffset(a_03));
            } else {
                int n10 = d[68];
                n10 -= d[69];
                ARBVertexAttribBinding.glVertexAttribIFormat((int)((int)(l6 >>> (n10 -= d[70]))), (int)a_03.getCount(), (int)a_03.getType().glId(), (int)a_02.getElementOffset(a_03));
            }
            int n11 = d[71];
            n11 -= d[72];
            int n12 = d[74];
            n12 -= d[75];
            ARBVertexAttribBinding.glVertexAttribBinding((int)((int)(l6 >>> (n11 ^= d[73]))), (int)(n12 ^= d[76]));
            l6 += 0x100000000L;
        }
        int n13 = d[77];
        n13 += d[78];
        return new kotakbaz.rain.client.render.main.vertex.format.A((int)(l2 >>> (n13 += d[79])), a_02, new AtomicReference<b>());
    }

    static {
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.b();
        long l = 5785664150264959445L;
        long l2 = -9085394663369680701L;
        long l3 = 6516010670709230317L;
        long l4 = -4524929743439391233L;
        long l5 = 2904478586576242787L;
        long l6 = -3513348488431881318L;
        long l7 = -7374805381542445164L;
        long l8 = 8494630819258764047L;
        long l9 = 7790573370750609498L;
        long l10 = -7190428183733024027L;
        long l11 = 4551410628929773952L;
        long l12 = -4017268054255521212L;
        long l13 = 8242364416744237170L;
        long l14 = 6423676448500675019L;
        int n = d[80];
        n += d[81];
        A = new Object[n += d[82]];
        long l15 = l14;
        int n2 = d[83];
        n2 ^= d[84];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= d[85]);
        Object[] objectArray = new Object[d[86]];
        objectArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[87]] = b;
        objectArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[88]] = d[89];
        int n3 = d[90];
        Object object = kotakbaz.rain.client.render.main.vertex.format.uploader.A.A()[d[91]];
        if (object == null) {
            char[] cArray = "\ua816\ua87c\ua841\ua850\ua820\ua841\ua81b\ua881\ua852\ua842\ua7aa\ua853\ua7a6\ua816\ua86f\ua857\ua86a\ua7a4\ua81a\ua821\ua84a\ua857\ua872\ua845\ua86f\ua84d\ua865\ua84c\ua7af\ua84b\ua881\ua866\ua853\ua86f\ua84d\ua87f\ua7b0\ua81b\ua81c\ua7a6\ua87a\ua852\ua881\ua7a9\ua876\ua871\ua882\ua7aa\ua858\ua86b\ua7af\ua858\ua7b0\ua820\ua7a6\ua820\ua846\ua7ab\ua833\ua7a6\ua869\ua833\ua821\ua851".toCharArray();
            for (int i = d[92]; i < d[93]; ++i) {
                int n4 = cArray[i];
                n4 -= d[94];
                n4 ^= d[95];
                n4 += d[96];
                n4 += d[97];
                n4 ^= d[98];
                n4 -= d[99];
                n4 ^= d[100];
                n4 ^= d[101];
                n4 ^= d[102];
                n4 ^= d[103];
                n4 -= d[104];
                n4 -= d[105];
                n4 += d[106];
                cArray[i] = (char)(n4 -= d[107]);
            }
            object = kotakbaz.rain.client.render.main.vertex.format.uploader.A.A()[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[108]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.main.vertex.format.uploader.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = d[109];
        n5 -= d[110];
        l5 = l16 ^ (0x1E00000000L ^ l16) & -1L << (n5 += d[111]);
        long l17 = l12;
        int n6 = d[112];
        n6 += d[113];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += d[114]);
        while (true) {
            int n7 = d[115];
            n7 -= d[116];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= d[117]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = d[118];
            n9 += d[119];
            int n10 = d[121];
            n10 += d[122];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += d[120])) & -1L >>> (n10 -= d[123]);
            long l19 = l8;
            int n11 = d[124];
            n11 ^= d[125];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= d[126]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = d[127];
            n13 ^= d[128];
            int n14 = d[130];
            n14 ^= d[131];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= d[129])) & -1L >>> (n14 += d[132]);
            int n15 = d[133];
            n15 += d[134];
            long l21 = l9;
            int n16 = d[136];
            n16 ^= d[137];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= d[135]) ^ l21) & -1L << (n16 ^= d[138]);
            int n17 = d[139];
            n17 ^= d[140];
            int n18 = d[142];
            n18 += d[143];
            long l22 = l11;
            int n19 = d[145];
            l11 = l22 ^ ((long)((int)l8 << (n17 -= d[141]) | (int)(l9 >>> (n18 ^= d[144]))) ^ l22) & -1L >>> (n19 += d[146]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = d[147];
            n20 -= d[148];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= d[149]);
            while (true) {
                int n21 = d[150];
                n21 ^= d[151];
                if ((int)(l13 >>> (n21 += d[152])) >= (int)l11) break;
                int n22 = d[153];
                n22 += d[154];
                int n23 = d[156];
                n23 += d[157];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[155]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += d[158]))];
                l13 += 0x100000000L;
            }
            int n24 = d[159];
            n24 += d[160];
            int n25 = (int)(l14 >>> (n24 ^= d[161]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.render.main.vertex.format.uploader.A.A[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = d[162];
            n26 -= d[163];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= d[164]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[d[165]];
        String string = (String)object[d[166]];
        object = object[d[167]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[168]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[169]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[171] ^ d[172]];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[173] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[174]] = d[175] ^ d[176];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[177] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[178]] = d[179] ^ d[180];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[181] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[182]] = d[183] ^ d[184];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[185] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[186]] = d[187] ^ d[188];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[189] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[190]] = d[191] ^ d[192];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[193] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[194]] = d[195] ^ d[196];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[197] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[198]] = d[199] ^ d[200];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[201] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[202]] = d[203] ^ d[204];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[205] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[206]] = d[207] ^ d[208];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[209] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[210]] = d[211] ^ d[212];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[213] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[214]] = d[215] ^ d[216];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[217] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[218]] = d[219] ^ d[220];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[221] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[222]] = d[223] ^ d[224];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[225] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[226]] = d[227] ^ d[228];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[229] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[230]] = d[231] ^ d[232];
                byArray[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[233] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[234]] = d[235] ^ d[236];
                objectArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[170]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[237]];
            if (B == null) {
                byte[] byArray2 = new byte[d[238] ^ d[239]];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[240] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[241]] = d[242] ^ d[243];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[244] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[245]] = d[246] ^ d[247];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[248] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[249]] = d[250] ^ d[251];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[252] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[253]] = d[254] ^ d[255];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[256] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[257]] = d[258] ^ d[259];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[260] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[261]] = d[262] ^ d[263];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[264] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[265]] = d[266] ^ d[267];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[268] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[269]] = d[270] ^ d[271];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[272] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[273]] = d[274] ^ d[275];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[276] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[277]] = d[278] ^ d[279];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[280] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[281]] = d[282] ^ d[283];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[284] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[285]] = d[286] ^ d[287];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[288] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[289]] = d[290] ^ d[291];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[292] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[293]] = d[294] ^ d[295];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[296] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[297]] = d[298] ^ d[299];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[300] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[301]] = d[302] ^ d[303];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[304] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[305]] = d[306] ^ d[307];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[308] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[309]] = d[310] ^ d[311];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[312] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[313]] = d[314] ^ d[315];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[316] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[317]] = d[318] ^ d[319];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[320] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[321]] = d[322] ^ d[323];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[324] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[325]] = d[326] ^ d[327];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[328] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[329]] = d[330] ^ d[331];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[332] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[333]] = d[334] ^ d[335];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[336] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[337]] = d[338] ^ d[339];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[340] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[341]] = d[342] ^ d[343];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[344] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[345]] = d[346] ^ d[347];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[348] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[349]] = d[350] ^ d[351];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[352] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[353]] = d[354] ^ d[355];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[356] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[357]] = d[358] ^ d[359];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[360] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[361]] = d[362] ^ d[363];
                byArray2[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[364] ^ kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[365]] = d[366] ^ d[367];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, d[368], byArray3, d[369], byArray.length);
                System.arraycopy(byArray2, d[370], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.A()[d[371]];
                if (object4 == null) {
                    char[] cArray = "\u6ca5\u6cb3\u6ca4\u6cb9\u6cb7\u6d03\u6f70\u70de\u70c9\u70dd\u6cbd\u70a2\u70d6\u70dc\u6cac\u6cbd\u6cb6\u6d06".toCharArray();
                    for (int i = d[372]; i < d[373]; ++i) {
                        int n2 = cArray[i];
                        n2 += d[374];
                        n2 ^= d[375];
                        n2 += d[376];
                        n2 += d[377];
                        n2 += d[378];
                        n2 ^= d[379];
                        n2 ^= d[380];
                        n2 -= d[381];
                        n2 -= d[382];
                        n2 ^= d[383];
                        n2 -= d[384];
                        cArray[i] = (char)(n2 -= d[385]);
                    }
                    object4 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.A()[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[386]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[d[387]];
                byArray4[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[388]] = d[389];
                byArray4[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[390]] = d[391];
                byArray4[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[392]] = d[393];
                byArray4[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[394]] = d[395];
                byArray4[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[396]] = d[397];
                byArray4[kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[398]] = d[399];
                byArray4[1] = -64;
                byArray4[14] = -62;
                byArray4[15] = -114;
                byArray4[8] = 32;
                byArray4[3] = -93;
                byArray4[7] = -13;
                byArray4[11] = 112;
                byArray4[4] = -47;
                byArray4[13] = -109;
                byArray4[6] = -62;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 13, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u02f1\u02f5\u02ff".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 -= 32160;
                        n3 ^= 0x8864;
                        n3 ^= 0xBCC5;
                        n3 += 33170;
                        n3 += 3698;
                        n3 -= 24498;
                        n3 -= 19059;
                        n3 ^= 0xC654;
                        n3 ^= 0xEA56;
                        n3 += 45912;
                        n3 += 8633;
                        n3 -= 63290;
                        n3 += 13403;
                        n3 -= 12415;
                        cArray[i] = (char)(n3 -= 40255);
                    }
                    object5 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.A()[2] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\uddc9\udca5\udddb\udcaf\uddcb\uddfa\uddcb\udcaf\udd70\udd73\uddcb\udddb\udd55\udd70\udd69\uddcc\uddcc\udd11\udd6e\uddc7".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0xE5A5;
                    n4 -= 42021;
                    n4 += 64710;
                    n4 ^= 0xDC48;
                    n4 -= 57481;
                    n4 ^= 0xCB6A;
                    n4 ^= 0xFD6C;
                    n4 += 39217;
                    n4 -= 10161;
                    n4 += 49137;
                    n4 ^= 0x54;
                    n4 += 55861;
                    n4 -= 10874;
                    cArray[i] = (char)(n4 ^= 0x3C7B);
                }
                object6 = kotakbaz.rain.client.render.main.vertex.format.uploader.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)B), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = C;
        if (C == null) {
            C = new Object[4];
            objectArray = C;
        }
        return objectArray;
    }

    public static void b() {
        d = new int[0x3FC9 ^ 0x3E59];
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x869 ^ 0x906] = 0x94E4 ^ 0x906;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x73C1 ^ 0x7313] = 0x3A02 ^ 0x7313;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x822A ^ 0x8346] = 0x1EA9 ^ 0x8346;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC179 ^ 0xC1FB] = 0xC1CB ^ 0xC1FB;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xADAB ^ 0xADB9] = 0xAD85 ^ 0xADB9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE5EC ^ 0xE465] = 0xFFFF1BD1 ^ 0xE465;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBB48 ^ 0xBBAD] = 0x5DB9 ^ 0xBBAD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x70CF ^ 0x7017] = 0x31B1 ^ 0x7017;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x101B9 ^ 0x101A2] = 0xFFFEFEC6 ^ 0x101A2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x77DF ^ 0x76A7] = 0xBC33 ^ 0x76A7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC06 ^ 0xD6F] = 0xE64 ^ 0xD6F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x750A ^ 0x752C] = 0xFFFF8ACA ^ 0x752C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2B53 ^ 0x2B8E] = 0xB42E ^ 0x2B8E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE128 ^ 0xE1CA] = 0xE8CB ^ 0xE1CA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3A4A ^ 0x3B3F] = 0x3B2D ^ 0x3B3F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD8E1 ^ 0xD9A2] = 0xEEDD ^ 0xD9A2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE6C5 ^ 0xE7D2] = 0x6A45 ^ 0xE7D2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1A0C ^ 0x1B1C] = 0x3B90 ^ 0x1B1C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1741 ^ 0x1714] = 0xFFFFE8C2 ^ 0x1714;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFBFE ^ 0xFAD1] = 0xD55E ^ 0xFAD1;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9588 ^ 0x9492] = 0x941B ^ 0x9492;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2AE4 ^ 0x2AB3] = 0x2AB3 ^ 0x2AB3;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8F7C ^ 0x8E46] = 0xFFFF4718 ^ 0x8E46;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3FF3 ^ 0x3E96] = 0x3E8D ^ 0x3E96;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4C2B ^ 0x4C51] = 0x4C5C ^ 0x4C51;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE2C2 ^ 0xE21B] = 0xBC71 ^ 0xE21B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE9A6 ^ 0xE8FA] = 0x4485 ^ 0xE8FA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA592 ^ 0xA4EF] = 0xEB74 ^ 0xA4EF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8464 ^ 0x8468] = 0xFFFF7BB8 ^ 0x8468;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x51AB ^ 0x5184] = 0xFFFFAE70 ^ 0x5184;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBCE3 ^ 0xBCC9] = 0xBCAA ^ 0xBCC9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x19F2 ^ 0x1972] = 0xFFFFE6CF ^ 0x1972;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10766 ^ 0x10637] = 0x1A296 ^ 0x10637;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10B19 ^ 0x10A11] = 0x160D3 ^ 0x10A11;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1009C ^ 0x100EC] = 0x10080 ^ 0x100EC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD153 ^ 0xD065] = 0xFFFFED1A ^ 0xD065;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3B5D ^ 0x3B2E] = 0x3BDC ^ 0x3B2E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x238B ^ 0x22A1] = 0x7691 ^ 0x22A1;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1071A ^ 0x107A8] = 0x13C29 ^ 0x107A8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2C65 ^ 0x2CAC] = 0x4361 ^ 0x2CAC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x92AE ^ 0x93E9] = 0x84A5 ^ 0x93E9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF2D2 ^ 0xF2E9] = 0xE678 ^ 0xF2E9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2B90 ^ 0x2AEF] = 0x5073 ^ 0x2AEF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8D93 ^ 0x8D6F] = 0xADEA ^ 0x8D6F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7473 ^ 0x755A] = 0x216A ^ 0x755A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x33B5 ^ 0x33BE] = 0xFFFFCC6B ^ 0x33BE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5385 ^ 0x52EF] = 0x5187 ^ 0x52EF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3820 ^ 0x38E7] = 0x4F4C ^ 0x38E7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x51D6 ^ 0x5137] = 0x5833 ^ 0x5137;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7D16 ^ 0x7DF2] = 0x74F3 ^ 0x7DF2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x825 ^ 0x8F9] = 0x5694 ^ 0x8F9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD103 ^ 0xD1C5] = 0xA61B ^ 0xD1C5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x99E8 ^ 0x98B6] = 0xFFFFCB4A ^ 0x98B6;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE0E0 ^ 0xE197] = 0xF337 ^ 0xE197;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x43D0 ^ 0x437F] = 0xFFFF686A ^ 0x437F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4294 ^ 0x43D1] = 0x549D ^ 0x43D1;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7CE4 ^ 0x7C6C] = 0xFFFF83B2 ^ 0x7C6C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xEF71 ^ 0xEE3D] = 0x5DBA ^ 0xEE3D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9FD5 ^ 0x9EDE] = 0xF41C ^ 0x9EDE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x28BB ^ 0x28F5] = 0xFFFFD75F ^ 0x28F5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x349E ^ 0x3490] = 0xFFFFCB07 ^ 0x3490;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFB30 ^ 0xFA49] = 0xC59D ^ 0xFA49;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC66F ^ 0xC742] = 0xE8CD ^ 0xC742;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9AAC ^ 0x9AF2] = 0x15F1 ^ 0x9AF2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8F0C ^ 0x8E2B] = 0xD458 ^ 0x8E2B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA979 ^ 0xA902] = 0xA93D ^ 0xA902;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6ACF ^ 0x6A1F] = 0x2699 ^ 0x6A1F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5200 ^ 0x5259] = 0x5259 ^ 0x5259;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7A0A ^ 0x7A3D] = 0xFFFF85A8 ^ 0x7A3D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10F34 ^ 0x10E05] = 0x1916B ^ 0x10E05;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF2B9 ^ 0xF2A5] = 0xF286 ^ 0xF2A5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x104B2 ^ 0x105FA] = 0x14476 ^ 0x105FA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1020E ^ 0x10316] = 0x103F1 ^ 0x10316;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1A47 ^ 0x1AD3] = 0xFFFFE51C ^ 0x1AD3;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3551 ^ 0x35BF] = 0x73CE ^ 0x35BF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3073 ^ 0x3165] = 0xBCB2 ^ 0x3165;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2A5D ^ 0x2B10] = 0x9887 ^ 0x2B10;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7577 ^ 0x74F3] = 0x74F1 ^ 0x74F3;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8073 ^ 0x80CC] = 0xF106 ^ 0x80CC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x19E ^ 0x196] = 0xFFFFFE44 ^ 0x196;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6D5 ^ 0x7BD] = 0x4AC ^ 0x7BD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xDAE6 ^ 0xDA4B] = 0xECF ^ 0xDA4B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD3AC ^ 0xD326] = 0xD319 ^ 0xD326;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBB5E ^ 0xBA72] = 0x95E8 ^ 0xBA72;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5020 ^ 0x50EE] = 0x1C68 ^ 0x50EE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x55D1 ^ 0x54B2] = 0x6E4F ^ 0x54B2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5299 ^ 0x52CB] = 0xFFFFAD5A ^ 0x52CB;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB0D0 ^ 0xB036] = 0x5626 ^ 0xB036;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFF44 ^ 0xFF0F] = 0xFF5F ^ 0xFF0F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD0E3 ^ 0xD1A2] = 0xE6DD ^ 0xD1A2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1B77 ^ 0x1A4E] = 0x2CD4 ^ 0x1A4E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x102C9 ^ 0x103DD] = 0x18E5E ^ 0x103DD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6606 ^ 0x6632] = 0xFFFF99E4 ^ 0x6632;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBD2B ^ 0xBD5A] = 0xBD5B ^ 0xBD5A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBECA ^ 0xBE72] = 0xF02 ^ 0xBE72;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5B54 ^ 0x5B38] = 0x5B38 ^ 0x5B38;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x485A ^ 0x4920] = 0xD555 ^ 0x4920;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC260 ^ 0xC30E] = 0xFFFFA15C ^ 0xC30E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE735 ^ 0xE73F] = 0xE735 ^ 0xE73F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x84BF ^ 0x8411] = 0x5097 ^ 0x8411;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9F77 ^ 0x9EFA] = 0x9EF4 ^ 0x9EFA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD665 ^ 0xD67B] = 0xD645 ^ 0xD67B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x42AA ^ 0x4209] = 0x421B ^ 0x4209;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB4DA ^ 0xB4E9] = 0xFFFF4B17 ^ 0xB4E9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x608E ^ 0x6188] = 0xFFFF93A8 ^ 0x6188;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBDD9 ^ 0xBC90] = 0xFD16 ^ 0xBC90;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x67EB ^ 0x66B6] = 0xCAD5 ^ 0x66B6;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3187 ^ 0x3156] = 0x784C ^ 0x3156;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD9BF ^ 0xD9C2] = 0xFFFF267D ^ 0xD9C2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xEABE ^ 0xEBA7] = 0xEB51 ^ 0xEBA7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3E44 ^ 0x3E9A] = 0xA134 ^ 0x3E9A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA7BE ^ 0xA63B] = 0xFFFF59C3 ^ 0xA63B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2F84 ^ 0x2F19] = 0x2F31 ^ 0x2F19;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4C29 ^ 0x4C94] = 0x3D6E ^ 0x4C94;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9D12 ^ 0x9C32] = 0x8AA ^ 0x9C32;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x630C ^ 0x6308] = 0xFFFF9CF5 ^ 0x6308;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x987C ^ 0x988E] = 0x902 ^ 0x988E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7E9C ^ 0x7FD7] = 0x3E51 ^ 0x7FD7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3C9D ^ 0x3CFB] = 0xB1C3 ^ 0x3CFB;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xAE34 ^ 0xAEDE] = 0x3598 ^ 0xAEDE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB4A8 ^ 0xB441] = 0x2F07 ^ 0xB441;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x59DB ^ 0x5851] = 0x5858 ^ 0x5851;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB490 ^ 0xB5D2] = 0xFFFF7D11 ^ 0xB5D2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7DB4 ^ 0x7D2F] = 0xFFFF82F4 ^ 0x7D2F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8069 ^ 0x8049] = 0x8051 ^ 0x8049;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE0C ^ 0xE2E] = 0xFFFFF1C0 ^ 0xE2E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4BCC ^ 0x4B9F] = 0xFFFFB409 ^ 0x4B9F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD261 ^ 0xD335] = 0x5585 ^ 0xD335;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7319 ^ 0x727D] = 0x7261 ^ 0x727D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA083 ^ 0xA1F5] = 0x8715 ^ 0xA1F5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF60A ^ 0xF6FC] = 0xFFFFA9BC ^ 0xF6FC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE461 ^ 0xE400] = 0xC6A7 ^ 0xE400;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA9AA ^ 0xA957] = 0x89CB ^ 0xA957;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xEFBB ^ 0xEE8E] = 0x2C50 ^ 0xEE8E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8F38 ^ 0x8E2D] = 0x3BA ^ 0x8E2D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x57CC ^ 0x564A] = 0x5646 ^ 0x564A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFD95 ^ 0xFD25] = 0x29A3 ^ 0xFD25;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x291 ^ 0x2D9] = 0x2BE ^ 0x2D9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x19A6 ^ 0x191C] = 0x765E ^ 0x191C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFC80 ^ 0xFDAE] = 0xFFFF2D89 ^ 0xFDAE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7AFA ^ 0x7B7D] = 0xFFFF84D2 ^ 0x7B7D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC79 ^ 0xC86] = 0x2C1A ^ 0xC86;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x78A1 ^ 0x7858] = 0x78E ^ 0x7858;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6CBB ^ 0x6CE7] = 0x6CE7 ^ 0x6CE7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xEB79 ^ 0xEA2F] = 0x6C87 ^ 0xEA2F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2A18 ^ 0x2B42] = 0xFFFFAEDE ^ 0x2B42;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8852 ^ 0x88CC] = 0xFFFF772F ^ 0x88CC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6E91 ^ 0x6E2A] = 0x137 ^ 0x6E2A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8A98 ^ 0x8B87] = 0x1867F ^ 0x8B87;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFF6F ^ 0xFE63] = 0x8E89 ^ 0xFE63;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB1 ^ 0x1A2] = 0x2126 ^ 0x1A2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x99DF ^ 0x98F7] = 0xCCC3 ^ 0x98F7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4FEE ^ 0x4F96] = 0x4FF7 ^ 0x4F96;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6400 ^ 0x6400] = 0xFFFF9B9D ^ 0x6400;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6671 ^ 0x677C] = 0x1798 ^ 0x677C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7C94 ^ 0x7DE8] = 0xF041 ^ 0x7DE8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x726 ^ 0x783] = 0x782 ^ 0x783;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10A33 ^ 0x10A6B] = 0x10A6A ^ 0x10A6B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC8B7 ^ 0xC81E] = 0xC81F ^ 0xC81E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF628 ^ 0xF6FD] = 0xB754 ^ 0xF6FD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF77F ^ 0xF784] = 0x8852 ^ 0xF784;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC963 ^ 0xC9E2] = 0xFFFF3678 ^ 0xC9E2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x134E ^ 0x1272] = 0x9A5C ^ 0x1272;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xEF63 ^ 0xEF46] = 0xFFFF10A2 ^ 0xEF46;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x950C ^ 0x956C] = 0x898B ^ 0x956C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6146 ^ 0x613F] = 0x616D ^ 0x613F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3933 ^ 0x3993] = 0x39C0 ^ 0x3993;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA32F ^ 0xA38E] = 0xA3AB ^ 0xA38E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3256 ^ 0x3209] = 0xD8C ^ 0x3209;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xADE8 ^ 0xADB5] = 0xADF5 ^ 0xADB5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2A69 ^ 0x2B23] = 0xFFFF952A ^ 0x2B23;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA570 ^ 0xA456] = 0xFE28 ^ 0xA456;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x71C7 ^ 0x7047] = 0x204B ^ 0x7047;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD0E9 ^ 0xD07A] = 0xD040 ^ 0xD07A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1011C ^ 0x10146] = 0x10144 ^ 0x10146;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7F28 ^ 0x7FDD] = 0xDF72 ^ 0x7FDD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA9C3 ^ 0xA9B5] = 0xFFFF5604 ^ 0xA9B5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x605A ^ 0x60EB] = 0x5B63 ^ 0x60EB;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6091 ^ 0x605D] = 0xF9C ^ 0x605D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4DA2 ^ 0x4D5C] = 0xFFFF922C ^ 0x4D5C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xCF7B ^ 0xCFAD] = 0x8E0B ^ 0xCFAD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x440C ^ 0x44A0] = 0x36A6 ^ 0x44A0;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBF96 ^ 0xBE87] = 0x9E03 ^ 0xBE87;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6797 ^ 0x661C] = 0xFFFF99E5 ^ 0x661C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC83D ^ 0xC8FE] = 0xDABE ^ 0xC8FE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBD07 ^ 0xBC00] = 0xB186 ^ 0xBC00;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3024 ^ 0x302D] = 0xFFFFCFF2 ^ 0x302D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4389 ^ 0x42DB] = 0xFFFF19AA ^ 0x42DB;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x106D8 ^ 0x106B6] = 0xFFFEF933 ^ 0x106B6;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x904 ^ 0x83C] = 0x3EA9 ^ 0x83C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF269 ^ 0xF244] = 0xFFFF0DA8 ^ 0xF244;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x839F ^ 0x82CA] = 0x47C ^ 0x82CA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB574 ^ 0xB5FF] = 0xFFFF4AEA ^ 0xB5FF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4473 ^ 0x449F] = 0xDFD9 ^ 0x449F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x50FE ^ 0x505C] = 0xFFFFAFF7 ^ 0x505C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2054 ^ 0x206A] = 0xFFFFDF9D ^ 0x206A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1962 ^ 0x19A6] = 0xB9A ^ 0x19A6;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10A75 ^ 0x10A34] = 0xFFFEF560 ^ 0x10A34;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10B17 ^ 0x10B91] = 0xFFFEF423 ^ 0x10B91;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE21A ^ 0xE20A] = 0xE23B ^ 0xE20A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC3D5 ^ 0xC393] = 0xFFFF3C57 ^ 0xC393;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x181E ^ 0x192A] = 0xDBE9 ^ 0x192A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x920E ^ 0x932D] = 0x7B6 ^ 0x932D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xDA77 ^ 0xDA26] = 0xDA4B ^ 0xDA26;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10857 ^ 0x1083F] = 0x10D84 ^ 0x1083F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA042 ^ 0xA131] = 0xA130 ^ 0xA131;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x42D8 ^ 0x42DA] = 0xFFFFBD6B ^ 0x42DA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10279 ^ 0x10236] = 0x1021F ^ 0x10236;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3994 ^ 0x3913] = 0x393E ^ 0x3913;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x32B1 ^ 0x338A] = 0x510 ^ 0x338A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6AF2 ^ 0x6A95] = 0xAD2C ^ 0x6A95;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC55F ^ 0xC558] = 0xFFFF3A93 ^ 0xC558;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF64E ^ 0xF69D] = 0xFFFF404E ^ 0xF69D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFF09 ^ 0xFE7B] = 0xFE7B ^ 0xFE7B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE9BD ^ 0xE9A8] = 0xFFFF1619 ^ 0xE9A8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4F7F ^ 0x4F49] = 0xFFFFB0D3 ^ 0x4F49;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xCC6C ^ 0xCCAD] = 0xDE99 ^ 0xCCAD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB4F4 ^ 0xB477] = 0xFFFF4B8C ^ 0xB477;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x154F ^ 0x15A0] = 0x53F1 ^ 0x15A0;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x87F8 ^ 0x86CF] = 0x4411 ^ 0x86CF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3C8F ^ 0x3C8A] = 0xFFFFC326 ^ 0x3C8A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB4C ^ 0xA08] = 0x1D4D ^ 0xA08;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x937D ^ 0x923B] = 0xFFFF7A9C ^ 0x923B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1029B ^ 0x102F8] = 0x157F7 ^ 0x102F8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x41B6 ^ 0x4139] = 0xFFFFBEA1 ^ 0x4139;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9464 ^ 0x945D] = 0xFFFF6B94 ^ 0x945D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x93E2 ^ 0x93CB] = 0x93D3 ^ 0x93CB;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8185 ^ 0x81B0] = 0x819F ^ 0x81B0;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8CFC ^ 0x8C40] = 0xE302 ^ 0x8C40;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4253 ^ 0x42D7] = 0x4282 ^ 0x42D7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE8E9 ^ 0xE8D5] = 0xE8F0 ^ 0xE8D5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFAED ^ 0xFA5A] = 0xFFFFB4C5 ^ 0xFA5A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4B84 ^ 0x4B69] = 0x4B69 ^ 0x4B69;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xED4A ^ 0xED47] = 0xFFFF128D ^ 0xED47;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4A40 ^ 0x4B7E] = 0xC34E ^ 0x4B7E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3CC2 ^ 0x3C35] = 0x9C9A ^ 0x3C35;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD641 ^ 0xD7C2] = 0xD7D2 ^ 0xD7C2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4461 ^ 0x4521] = 0x7245 ^ 0x4521;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x14E4 ^ 0x148E] = 0x32B2 ^ 0x148E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xCE0F ^ 0xCE71] = 0xFFFF319D ^ 0xCE71;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x121C ^ 0x1313] = 0x63F7 ^ 0x1313;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFD83 ^ 0xFC82] = 0xFABB ^ 0xFC82;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xACF1 ^ 0xAC57] = 0xAC55 ^ 0xAC57;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3BF1 ^ 0x3BA5] = 0x3BC5 ^ 0x3BA5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x53A1 ^ 0x53BE] = 0x53E8 ^ 0x53BE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x541A ^ 0x5480] = 0x54E2 ^ 0x5480;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB5CB ^ 0xB587] = 0xB5AC ^ 0xB587;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5430 ^ 0x5533] = 0x530A ^ 0x5533;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x385F ^ 0x3849] = 0xFFFFC7B0 ^ 0x3849;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE0FA ^ 0xE0C8] = 0xE0C0 ^ 0xE0C8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2DA ^ 0x264] = 0x7398 ^ 0x264;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA540 ^ 0xA418] = 0xDE23 ^ 0xA418;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4146 ^ 0x4016] = 0xE4BC ^ 0x4016;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x15EA ^ 0x14E3] = 0x7E21 ^ 0x14E3;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD997 ^ 0xD9AF] = 0xD9E6 ^ 0xD9AF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE914 ^ 0xE89A] = 0xE89A ^ 0xE89A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7820 ^ 0x78B0] = 0x78C7 ^ 0x78B0;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3133 ^ 0x312A] = 0xFFFFCEA6 ^ 0x312A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9F4E ^ 0x9E15] = 0xE438 ^ 0x9E15;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE4C5 ^ 0xE45A] = 0xFFFF1BE8 ^ 0xE45A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x125 ^ 0x159] = 0xFFFFFEEA ^ 0x159;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2972 ^ 0x2814] = 0x281C ^ 0x2814;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC889 ^ 0xC8C0] = 0xFFFF3748 ^ 0xC8C0;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD50B ^ 0xD527] = 0xD500 ^ 0xD527;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3504 ^ 0x3474] = 0x3474 ^ 0x3474;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5983 ^ 0x59E1] = 0x5D8D ^ 0x59E1;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x239C ^ 0x2287] = 0x2271 ^ 0x2287;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x90AC ^ 0x90C8] = 0xB97B ^ 0x90C8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5709 ^ 0x5736] = 0x5725 ^ 0x5736;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC7D ^ 0xCC9] = 0x3748 ^ 0xCC9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB175 ^ 0xB151] = 0xB136 ^ 0xB151;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBD2E ^ 0xBDBC] = 0xFFFF4246 ^ 0xBDBC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB32F ^ 0xB3B8] = 0xFFFF4C75 ^ 0xB3B8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB669 ^ 0xB698] = 0x271C ^ 0xB698;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1AA5 ^ 0x1BB8] = 0x11640 ^ 0x1BB8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x430 ^ 0x445] = 0x41B ^ 0x445;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7548 ^ 0x7572] = 0x757C ^ 0x7572;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x987F ^ 0x9857] = 0xFFFF67E6 ^ 0x9857;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6794 ^ 0x677C] = 0x816C ^ 0x677C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB6BF ^ 0xB645] = 0xC9EF ^ 0xB645;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xDDD3 ^ 0xDD9E] = 0xDDD3 ^ 0xDD9E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x27F4 ^ 0x267C] = 0x2676 ^ 0x267C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x941B ^ 0x94FC] = 0xFFFF8D26 ^ 0x94FC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1462 ^ 0x1407] = 0x6892 ^ 0x1407;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9B82 ^ 0x9B2A] = 0x9B2B ^ 0x9B2A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x88CC ^ 0x8827] = 0x132B ^ 0x8827;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5CAC ^ 0x5DFF] = 0xF95E ^ 0x5DFF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x96AD ^ 0x96C2] = 0xFFFF6930 ^ 0x96C2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFD21 ^ 0xFC5F] = 0x46B3 ^ 0xFC5F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB86F ^ 0xB944] = 0xED74 ^ 0xB944;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB26A ^ 0xB2E7] = 0xB29D ^ 0xB2E7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF7EF ^ 0xF7FC] = 0xF7A9 ^ 0xF7FC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9495 ^ 0x9458] = 0xD8D4 ^ 0x9458;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7DE7 ^ 0x7C6B] = 0x7C6E ^ 0x7C6B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD226 ^ 0xD2BA] = 0xD2AF ^ 0xD2BA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBE63 ^ 0xBE08] = 0x8356 ^ 0xBE08;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9581 ^ 0x959C] = 0x95E5 ^ 0x959C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC4F2 ^ 0xC430] = 0xD60C ^ 0xC430;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF48C ^ 0xF41A] = 0xFFFF0B54 ^ 0xF41A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x95F0 ^ 0x94F5] = 0x9973 ^ 0x94F5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC854 ^ 0xC820] = 0xC854 ^ 0xC820;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC2DC ^ 0xC3EC] = 0x5C91 ^ 0xC3EC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB22 ^ 0xBAE] = 0xFFFFF431 ^ 0xBAE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x35F8 ^ 0x34EA] = 0xFFFFEBD6 ^ 0x34EA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8FB2 ^ 0x8E33] = 0xBF2E ^ 0x8E33;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xAC63 ^ 0xAC5E] = 0xAC34 ^ 0xAC5E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA82F ^ 0xA850] = 0xA876 ^ 0xA850;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD640 ^ 0xD671] = 0xD677 ^ 0xD671;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xF4FD ^ 0xF438] = 0x83E7 ^ 0xF438;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8DFC ^ 0x8DEB] = 0x8DA3 ^ 0x8DEB;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD764 ^ 0xD666] = 0xFFFF2FB2 ^ 0xD666;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x70B1 ^ 0x701B] = 0x701B ^ 0x701B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7BA8 ^ 0x7B77] = 0xFFFF1B44 ^ 0x7B77;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x108B9 ^ 0x1080C] = 0x1B97F ^ 0x1080C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x64FB ^ 0x647E] = 0x6425 ^ 0x647E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8EE6 ^ 0x8EE9] = 0xFFFF716B ^ 0x8EE9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD982 ^ 0xD8E3] = 0xE21E ^ 0xD8E3;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xEAAE ^ 0xEABA] = 0xFFFF155C ^ 0xEABA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA20E ^ 0xA2B8] = 0x13C8 ^ 0xA2B8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA17C ^ 0xA1E4] = 0xFFFF5E79 ^ 0xA1E4;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x1066A ^ 0x106BE] = 0x14FAF ^ 0x106BE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7A90 ^ 0x7A81] = 0xFFFF8530 ^ 0x7A81;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6A75 ^ 0x6A6F] = 0x6A37 ^ 0x6A6F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBCC2 ^ 0xBDA9] = 0xBEA2 ^ 0xBDA9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10A03 ^ 0x10A47] = 0xFFFEF5A6 ^ 0x10A47;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x87C2 ^ 0x8709] = 0xE8C2 ^ 0x8709;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xCF67 ^ 0xCFE9] = 0xCF56 ^ 0xCFE9;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xFFC9 ^ 0xFEB2] = 0x5D75 ^ 0xFEB2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x79AB ^ 0x7829] = 0x7828 ^ 0x7829;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7081 ^ 0x7071] = 0xE1E2 ^ 0x7071;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x64FA ^ 0x65C8] = 0xFAEB ^ 0x65C8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA8B1 ^ 0xA8E1] = 0xA8E7 ^ 0xA8E1;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE955 ^ 0xE982] = 0xA870 ^ 0xE982;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xEEE1 ^ 0xEECF] = 0xEEC2 ^ 0xEECF;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x345B ^ 0x341B] = 0xFFFFCBF1 ^ 0x341B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xDA2D ^ 0xDA6F] = 0xDA0E ^ 0xDA6F;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x561F ^ 0x5720] = 0xDF0B ^ 0x5720;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x15FC ^ 0x15FA] = 0xAE1 ^ 0x15FA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x14A9 ^ 0x15E7] = 0xA669 ^ 0x15E7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE6E6 ^ 0xE769] = 0xE714 ^ 0xE769;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x32A1 ^ 0x3241] = 0xADEF ^ 0x3241;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x94FB ^ 0x95DE] = 0xCFAD ^ 0x95DE;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6734 ^ 0x663E] = 0xCDE ^ 0x663E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB880 ^ 0xB9BD] = 0x3196 ^ 0xB9BD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBDAC ^ 0xBD3D] = 0xBD1B ^ 0xBD3D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB593 ^ 0xB4F3] = 0x8E10 ^ 0xB4F3;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9DB1 ^ 0x9DF4] = 0xFFFF6209 ^ 0x9DF4;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7687 ^ 0x77F6] = 0x77F6 ^ 0x77F6;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x282 ^ 0x2C8] = 0x2B3 ^ 0x2C8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6ACA ^ 0x6A43] = 0xFFFF9582 ^ 0x6A43;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xAE2E ^ 0xAF0A] = 0xF561 ^ 0xAF0A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x16 ^ 0x64] = 0xFFFFFFD7 ^ 0x64;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9EC9 ^ 0x9FFA] = 0x94 ^ 0x9FFA;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x33D5 ^ 0x32D5] = 0x34F3 ^ 0x32D5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x7D4D ^ 0x7C6C] = 0xE8F7 ^ 0x7C6C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10A0D ^ 0x10AD7] = 0x154BA ^ 0x10AD7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2DC4 ^ 0x2DAD] = 0xD8F1 ^ 0x2DAD;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x2742 ^ 0x27F1] = 0x1C38 ^ 0x27F1;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9DCF ^ 0x9DCC] = 0x829D ^ 0x9DCC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC2A4 ^ 0xC3F3] = 0x4545 ^ 0xC3F3;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x45F0 ^ 0x455B] = 0x374D ^ 0x455B;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xDE0F ^ 0xDE78] = 0xFFFF2197 ^ 0xDE78;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x55E ^ 0x439] = 0x422 ^ 0x439;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9633 ^ 0x9614] = 0x9601 ^ 0x9614;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3C53 ^ 0x3CC6] = 0x3C8D ^ 0x3CC6;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x28EC ^ 0x28DC] = 0xFFFFD712 ^ 0x28DC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5A1A ^ 0x5A31] = 0x5A6A ^ 0x5A31;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4334 ^ 0x432C] = 0xFFFFBC18 ^ 0x432C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x73EC ^ 0x72B5] = 0x898 ^ 0x72B5;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xAED0 ^ 0xAE69] = 0xC126 ^ 0xAE69;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x406A ^ 0x403C] = 0x403F ^ 0x403C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xB7C9 ^ 0xB78A] = 0xB7C1 ^ 0xB78A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xD8EC ^ 0xD837] = 0xFFFF7999 ^ 0xD837;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x15D4 ^ 0x1593] = 0x159C ^ 0x1593;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA382 ^ 0xA28C] = 0xFFFF2D9D ^ 0xA28C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x56FC ^ 0x5608] = 0xF6AB ^ 0x5608;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xDBB4 ^ 0xDB74] = 0xAA88 ^ 0xDB74;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC783 ^ 0xC71A] = 0xFFFF3883 ^ 0xC71A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x10ABE ^ 0x10A46] = 0x17592 ^ 0x10A46;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE21B ^ 0xE2E8] = 0x736C ^ 0xE2E8;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x4152 ^ 0x4171] = 0x413A ^ 0x4171;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE3D1 ^ 0xE332] = 0xEA58 ^ 0xE332;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA707 ^ 0xA648] = 0x15DF ^ 0xA648;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x6F7B ^ 0x6FB1] = 0x70 ^ 0x6FB1;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x373 ^ 0x21E] = 0x9FFC ^ 0x21E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x44DF ^ 0x44B2] = 0xFFFFBB01 ^ 0x44B2;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x9FFB ^ 0x9F33] = 0xE8ED ^ 0x9F33;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xE25A ^ 0xE32E] = 0xE32E ^ 0xE32E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xBA15 ^ 0xBB4A] = 0x1729 ^ 0xBB4A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x31D7 ^ 0x31F6] = 0xFFFFCE18 ^ 0x31F6;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3C03 ^ 0x3D1D] = 0x13087 ^ 0x3D1D;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xC43B ^ 0xC527] = 0x1C8CD ^ 0xC527;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3D6F ^ 0x3D6E] = 0xFFFFC283 ^ 0x3D6E;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x691E ^ 0x687C] = 0xFFFFAD7B ^ 0x687C;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0xA4D5 ^ 0xA41A] = 0xFFFF1765 ^ 0xA41A;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x5448 ^ 0x5413] = 0x5413 ^ 0x5413;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x91AF ^ 0x9108] = 0x9108 ^ 0x9108;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x8C03 ^ 0x8CA7] = 0xFFFF731E ^ 0x8CA7;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x14FE ^ 0x15DC] = 0x8154 ^ 0x15DC;
        kotakbaz.rain.client.render.main.vertex.format.uploader.A.d[0x3F0 ^ 0x2F4] = 0xF73 ^ 0x2F4;
    }
}

