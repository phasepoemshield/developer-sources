/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.opengl.GlConst
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.systems.RenderSystem$class_5590
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  net.minecraft.class_10859
 *  net.minecraft.class_10865
 *  net.minecraft.class_9801
 *  net.minecraft.class_9801$class_4574
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL15
 */
package kotakbaz.rain.client.render.main;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
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
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.buffer.a_0;
import kotakbaz.rain.client.render.main.buffer.b;
import kotakbaz.rain.client.render.main.exceptions.impl.A;
import kotakbaz.rain.client.render.main.vertex.B;
import kotakbaz.rain.client.render.main.vertex.format.uploader.b_0;
import net.minecraft.class_10859;
import net.minecraft.class_10865;
import net.minecraft.class_9801;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL15;

public final class C {
    public static final BiConsumer<class_9801, Boolean> a;
    public static final BiConsumer<kotakbaz.rain.client.render.main.vertex.mesh.b_0, Boolean> A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    public C() {
        super();
    }

    private static void drawIndexed(int n, int n2, int n3) {
        GL11.glDrawElements((int)n2, (int)n, (int)n3, (long)0L);
    }

    static {
        kotakbaz.rain.client.render.main.C.b();
        long l = -1237605732213849521L;
        long l2 = -41994006212029166L;
        long l3 = -6045621440565805367L;
        long l4 = -8027333094703034354L;
        long l5 = 1191572317433167754L;
        long l6 = -5190049123018391228L;
        long l7 = -5978408987634599995L;
        long l8 = 1992042899990232130L;
        long l9 = -8107368670799646610L;
        long l10 = 2279285027435570098L;
        long l11 = 8714873961467993800L;
        long l12 = -8745979332881992682L;
        long l13 = 1405950397921103933L;
        long l14 = -7107196965052398156L;
        int n = D[30];
        n += D[31];
        b = new Object[n ^= D[32]];
        long l15 = l14;
        int n2 = D[33];
        n2 ^= D[34];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= D[35]);
        Object[] objectArray = new Object[D[36]];
        objectArray[kotakbaz.rain.client.render.main.C.D[37]] = B;
        objectArray[kotakbaz.rain.client.render.main.C.D[38]] = D[39];
        int n3 = D[40];
        Object object = kotakbaz.rain.client.render.main.C.A()[D[41]];
        if (object == null) {
            char[] cArray = "\u379e\u375c\u375c\u375a\u379b\u373f\u37b3\u37ab\u3745\u37ac\u379b\u3755\u3754\u37a8\u379b\u373e\u3761\u37b4\u3745\u3769\u374b\u3764\u3747\u375d\u3749\u37b7\u37ab\u375a\u3749\u3769\u37b8\u3758\u37ba\u37b4\u373c\u375c\u3762\u37b6\u379c\u3759\u3747\u373d\u373d\u37b7\u375d\u37a4\u379c\u37b8\u373c\u37a2\u373e\u3757\u37ba\u3756\u375e\u374a\u37a8\u37ac\u3758\u3753\u373c\u374b\u3746\u3754".toCharArray();
            for (int i = D[42]; i < D[43]; ++i) {
                int n4 = cArray[i];
                n4 += D[44];
                n4 += D[45];
                n4 += D[46];
                n4 ^= D[47];
                n4 -= D[48];
                n4 += D[49];
                n4 ^= D[50];
                n4 ^= D[51];
                n4 += D[52];
                cArray[i] = (char)(n4 += D[53]);
            }
            object = kotakbaz.rain.client.render.main.C.A()[kotakbaz.rain.client.render.main.C.D[54]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.render.main.C.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = D[55];
        n5 ^= D[56];
        l5 = l16 ^ (0x1800000000L ^ l16) & -1L << (n5 += D[57]);
        long l17 = l12;
        int n6 = D[58];
        n6 ^= D[59];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= D[60]);
        while (true) {
            int n7 = D[61];
            n7 ^= D[62];
            if ((int)l12 >= (int)(l5 >>> (n7 -= D[63]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = D[64];
            n9 ^= D[65];
            int n10 = D[67];
            n10 += D[68];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= D[66])) & -1L >>> (n10 -= D[69]);
            long l19 = l8;
            int n11 = D[70];
            n11 -= D[71];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += D[72]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = D[73];
            n13 += D[74];
            int n14 = D[76];
            n14 ^= D[77];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += D[75])) & -1L >>> (n14 ^= D[78]);
            int n15 = D[79];
            n15 ^= D[80];
            long l21 = l9;
            int n16 = D[82];
            n16 += D[83];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= D[81]) ^ l21) & -1L << (n16 += D[84]);
            int n17 = D[85];
            n17 ^= D[86];
            n17 ^= D[87];
            int n18 = D[88];
            n18 += D[89];
            long l22 = l11;
            int n19 = D[91];
            n19 += D[92];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += D[90]))) ^ l22) & -1L >>> (n19 ^= D[93]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = D[94];
            n20 += D[95];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= D[96]);
            while (true) {
                int n21 = D[97];
                n21 ^= D[98];
                if ((int)(l13 >>> (n21 -= D[99])) >= (int)l11) break;
                int n22 = D[100];
                n22 -= D[101];
                int n23 = D[103];
                n23 += D[104];
                cArray2[(int)(l13 >>> (n22 += kotakbaz.rain.client.render.main.C.D[102]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= D[105]))];
                l13 += 0x100000000L;
            }
            int n24 = D[106];
            n24 += D[107];
            int n25 = (int)(l14 >>> (n24 ^= D[108]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.render.main.C.b[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = D[109];
            n26 += D[110];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= D[111]);
        }
        a = (class_98012, bl) -> {
            class_9801.class_4574 class_45742 = class_98012.method_60822();
            if (class_45742.comp_751() > 0) {
                RenderSystem.class_5590 class_55902 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)class_45742.comp_752());
                int n = D[18];
                n += D[19];
                GpuBuffer gpuBuffer = RenderSystem.getDevice().createBuffer(() -> {
                    int n = D[24];
                    n -= D[25];
                    int n2 = D[27];
                    n2 -= D[28];
                    return (String)b[n ^= D[26]] + (String)b[n2 ^= D[29]];
                }, n -= D[20], class_98012.method_60818());
                GpuBuffer gpuBuffer2 = class_55902.method_68274(class_45742.comp_751());
                VertexFormat.class_5595 class_55952 = class_55902.method_31924();
                ((class_10865)RenderSystem.getDevice()).method_68402().method_68428(class_45742.comp_749(), (class_10859)gpuBuffer);
                int n2 = D[21];
                n2 += D[22];
                GL15.glBindBuffer((int)(n2 += D[23]), (int)ChromaRenderer.getBufferIdGetter().apply((class_10859)gpuBuffer2));
                kotakbaz.rain.client.render.main.C.drawIndexed(class_45742.comp_751(), GlConst.toGl((VertexFormat.class_5596)class_45742.comp_752()), GlConst.toGl((VertexFormat.class_5595)class_55952));
                gpuBuffer.close();
            }
            if (bl.booleanValue()) {
                class_98012.close();
            }
        };
        A = (b_02, bl) -> {
            long l = -2049903487742352970L;
            long l2 = 2646863133576648527L;
            long l3 = 1311087733359887469L;
            long l4 = l2;
            int n = D[0];
            n ^= D[1];
            l2 = l4 ^ ((long)b_02.getIndexCount() ^ l4) & -1L >>> (n += D[2]);
            int n2 = D[3];
            n2 ^= D[4];
            long l5 = l3;
            int n3 = D[6];
            n3 += D[7];
            l3 = l5 ^ ((long)b_02.getVertexCount() << (n2 += D[5]) ^ l5) & -1L << (n3 += D[8]);
            kotakbaz.rain.client.render.main.vertex.A a2 = b_02.getDrawMode();
            int n4 = D[9];
            n4 ^= D[10];
            if ((int)(l3 >>> (n4 ^= D[11])) > 0) {
                b_0.uploadFormatToBuffer(b_02.getVertexBuffer(), b_02.getVertexFormat());
                if (a2.useIndexBuffer()) {
                    B b2 = b_02.getDrawMode().indexBufferGenerator();
                    b b3 = b_02.getIndexBuffer();
                    if (b3.getTarget() != a_0.A) {
                        kotakbaz.rain.client.render.main.exceptions.A.printAndExit(new A(b3.getTarget().h, a_0.A.h));
                    }
                    b3.bind();
                    GL11.glDrawElements((int)a2.glId(), (int)((int)l2), (int)b2.getIndexType().B, (long)0L);
                } else {
                    int n5 = D[12];
                    n5 += D[13];
                    int n6 = D[15];
                    n6 += D[16];
                    GL11.glDrawArrays((int)a2.glId(), (int)(n5 ^= D[14]), (int)((int)(l3 >>> (n6 -= D[17]))));
                }
            }
            if (bl.booleanValue()) {
                b_02.close();
            }
        };
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[D[112]];
        String string = (String)object[D[113]];
        object = object[D[114]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[115]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[116]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[118] ^ D[119]];
                byArray[kotakbaz.rain.client.render.main.C.D[120] ^ kotakbaz.rain.client.render.main.C.D[121]] = D[122] ^ D[123];
                byArray[kotakbaz.rain.client.render.main.C.D[124] ^ kotakbaz.rain.client.render.main.C.D[125]] = D[126] ^ D[127];
                byArray[kotakbaz.rain.client.render.main.C.D[128] ^ kotakbaz.rain.client.render.main.C.D[129]] = D[130] ^ D[131];
                byArray[kotakbaz.rain.client.render.main.C.D[132] ^ kotakbaz.rain.client.render.main.C.D[133]] = D[134] ^ D[135];
                byArray[kotakbaz.rain.client.render.main.C.D[136] ^ kotakbaz.rain.client.render.main.C.D[137]] = D[138] ^ D[139];
                byArray[kotakbaz.rain.client.render.main.C.D[140] ^ kotakbaz.rain.client.render.main.C.D[141]] = D[142] ^ D[143];
                byArray[kotakbaz.rain.client.render.main.C.D[144] ^ kotakbaz.rain.client.render.main.C.D[145]] = D[146] ^ D[147];
                byArray[kotakbaz.rain.client.render.main.C.D[148] ^ kotakbaz.rain.client.render.main.C.D[149]] = D[150] ^ D[151];
                byArray[kotakbaz.rain.client.render.main.C.D[152] ^ kotakbaz.rain.client.render.main.C.D[153]] = D[154] ^ D[155];
                byArray[kotakbaz.rain.client.render.main.C.D[156] ^ kotakbaz.rain.client.render.main.C.D[157]] = D[158] ^ D[159];
                byArray[kotakbaz.rain.client.render.main.C.D[160] ^ kotakbaz.rain.client.render.main.C.D[161]] = D[162] ^ D[163];
                byArray[kotakbaz.rain.client.render.main.C.D[164] ^ kotakbaz.rain.client.render.main.C.D[165]] = D[166] ^ D[167];
                byArray[kotakbaz.rain.client.render.main.C.D[168] ^ kotakbaz.rain.client.render.main.C.D[169]] = D[170] ^ D[171];
                byArray[kotakbaz.rain.client.render.main.C.D[172] ^ kotakbaz.rain.client.render.main.C.D[173]] = D[174] ^ D[175];
                byArray[kotakbaz.rain.client.render.main.C.D[176] ^ kotakbaz.rain.client.render.main.C.D[177]] = D[178] ^ D[179];
                byArray[kotakbaz.rain.client.render.main.C.D[180] ^ kotakbaz.rain.client.render.main.C.D[181]] = D[182] ^ D[183];
                objectArray2[kotakbaz.rain.client.render.main.C.D[117]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[184]];
            if (c == null) {
                byte[] byArray2 = new byte[D[185] ^ D[186]];
                byArray2[kotakbaz.rain.client.render.main.C.D[187] ^ kotakbaz.rain.client.render.main.C.D[188]] = D[189] ^ D[190];
                byArray2[kotakbaz.rain.client.render.main.C.D[191] ^ kotakbaz.rain.client.render.main.C.D[192]] = D[193] ^ D[194];
                byArray2[kotakbaz.rain.client.render.main.C.D[195] ^ kotakbaz.rain.client.render.main.C.D[196]] = D[197] ^ D[198];
                byArray2[kotakbaz.rain.client.render.main.C.D[199] ^ kotakbaz.rain.client.render.main.C.D[200]] = D[201] ^ D[202];
                byArray2[kotakbaz.rain.client.render.main.C.D[203] ^ kotakbaz.rain.client.render.main.C.D[204]] = D[205] ^ D[206];
                byArray2[kotakbaz.rain.client.render.main.C.D[207] ^ kotakbaz.rain.client.render.main.C.D[208]] = D[209] ^ D[210];
                byArray2[kotakbaz.rain.client.render.main.C.D[211] ^ kotakbaz.rain.client.render.main.C.D[212]] = D[213] ^ D[214];
                byArray2[kotakbaz.rain.client.render.main.C.D[215] ^ kotakbaz.rain.client.render.main.C.D[216]] = D[217] ^ D[218];
                byArray2[kotakbaz.rain.client.render.main.C.D[219] ^ kotakbaz.rain.client.render.main.C.D[220]] = D[221] ^ D[222];
                byArray2[kotakbaz.rain.client.render.main.C.D[223] ^ kotakbaz.rain.client.render.main.C.D[224]] = D[225] ^ D[226];
                byArray2[kotakbaz.rain.client.render.main.C.D[227] ^ kotakbaz.rain.client.render.main.C.D[228]] = D[229] ^ D[230];
                byArray2[kotakbaz.rain.client.render.main.C.D[231] ^ kotakbaz.rain.client.render.main.C.D[232]] = D[233] ^ D[234];
                byArray2[kotakbaz.rain.client.render.main.C.D[235] ^ kotakbaz.rain.client.render.main.C.D[236]] = D[237] ^ D[238];
                byArray2[kotakbaz.rain.client.render.main.C.D[239] ^ kotakbaz.rain.client.render.main.C.D[240]] = D[241] ^ D[242];
                byArray2[kotakbaz.rain.client.render.main.C.D[243] ^ kotakbaz.rain.client.render.main.C.D[244]] = D[245] ^ D[246];
                byArray2[kotakbaz.rain.client.render.main.C.D[247] ^ kotakbaz.rain.client.render.main.C.D[248]] = D[249] ^ D[250];
                byArray2[kotakbaz.rain.client.render.main.C.D[251] ^ kotakbaz.rain.client.render.main.C.D[252]] = D[253] ^ D[254];
                byArray2[kotakbaz.rain.client.render.main.C.D[255] ^ kotakbaz.rain.client.render.main.C.D[256]] = D[257] ^ D[258];
                byArray2[kotakbaz.rain.client.render.main.C.D[259] ^ kotakbaz.rain.client.render.main.C.D[260]] = D[261] ^ D[262];
                byArray2[kotakbaz.rain.client.render.main.C.D[263] ^ kotakbaz.rain.client.render.main.C.D[264]] = D[265] ^ D[266];
                byArray2[kotakbaz.rain.client.render.main.C.D[267] ^ kotakbaz.rain.client.render.main.C.D[268]] = D[269] ^ D[270];
                byArray2[kotakbaz.rain.client.render.main.C.D[271] ^ kotakbaz.rain.client.render.main.C.D[272]] = D[273] ^ D[274];
                byArray2[kotakbaz.rain.client.render.main.C.D[275] ^ kotakbaz.rain.client.render.main.C.D[276]] = D[277] ^ D[278];
                byArray2[kotakbaz.rain.client.render.main.C.D[279] ^ kotakbaz.rain.client.render.main.C.D[280]] = D[281] ^ D[282];
                byArray2[kotakbaz.rain.client.render.main.C.D[283] ^ kotakbaz.rain.client.render.main.C.D[284]] = D[285] ^ D[286];
                byArray2[kotakbaz.rain.client.render.main.C.D[287] ^ kotakbaz.rain.client.render.main.C.D[288]] = D[289] ^ D[290];
                byArray2[kotakbaz.rain.client.render.main.C.D[291] ^ kotakbaz.rain.client.render.main.C.D[292]] = D[293] ^ D[294];
                byArray2[kotakbaz.rain.client.render.main.C.D[295] ^ kotakbaz.rain.client.render.main.C.D[296]] = D[297] ^ D[298];
                byArray2[kotakbaz.rain.client.render.main.C.D[299] ^ kotakbaz.rain.client.render.main.C.D[300]] = D[301] ^ D[302];
                byArray2[kotakbaz.rain.client.render.main.C.D[303] ^ kotakbaz.rain.client.render.main.C.D[304]] = D[305] ^ D[306];
                byArray2[kotakbaz.rain.client.render.main.C.D[307] ^ kotakbaz.rain.client.render.main.C.D[308]] = D[309] ^ D[310];
                byArray2[kotakbaz.rain.client.render.main.C.D[311] ^ kotakbaz.rain.client.render.main.C.D[312]] = D[313] ^ D[314];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[315], byArray3, D[316], byArray.length);
                System.arraycopy(byArray2, D[317], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.render.main.C.A()[D[318]];
                if (object4 == null) {
                    char[] cArray = "\u261a\u2610\u267f\u2666\u266c\u2660\u2613\u2649\u2f76\u2642\u2662\u2645\u2f71\u2647\u2617\u2662\u2611\u2661".toCharArray();
                    for (int i = D[319]; i < D[320]; ++i) {
                        int n2 = cArray[i];
                        n2 ^= D[321];
                        n2 += D[322];
                        n2 ^= D[323];
                        n2 -= D[324];
                        n2 += D[325];
                        n2 ^= D[326];
                        n2 ^= D[327];
                        n2 += D[328];
                        n2 -= D[329];
                        cArray[i] = (char)(n2 ^= D[330]);
                    }
                    object4 = kotakbaz.rain.client.render.main.C.A()[kotakbaz.rain.client.render.main.C.D[331]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[332]];
                byArray4[kotakbaz.rain.client.render.main.C.D[333]] = D[334];
                byArray4[kotakbaz.rain.client.render.main.C.D[335]] = D[336];
                byArray4[kotakbaz.rain.client.render.main.C.D[337]] = D[338];
                byArray4[kotakbaz.rain.client.render.main.C.D[339]] = D[340];
                byArray4[kotakbaz.rain.client.render.main.C.D[341]] = D[342];
                byArray4[kotakbaz.rain.client.render.main.C.D[343]] = D[344];
                byArray4[kotakbaz.rain.client.render.main.C.D[345]] = D[346];
                byArray4[kotakbaz.rain.client.render.main.C.D[347]] = D[348];
                byArray4[kotakbaz.rain.client.render.main.C.D[349]] = D[350];
                byArray4[kotakbaz.rain.client.render.main.C.D[351]] = D[352];
                byArray4[kotakbaz.rain.client.render.main.C.D[353]] = D[354];
                byArray4[kotakbaz.rain.client.render.main.C.D[355]] = D[356];
                byArray4[kotakbaz.rain.client.render.main.C.D[357]] = D[358];
                byArray4[kotakbaz.rain.client.render.main.C.D[359]] = D[360];
                byArray4[kotakbaz.rain.client.render.main.C.D[361]] = D[362];
                byArray4[kotakbaz.rain.client.render.main.C.D[363]] = D[364];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, D[365], D[366]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.render.main.C.A()[D[367]];
                if (object5 == null) {
                    char[] cArray = "\ubdb5\ubdc9\uca4f".toCharArray();
                    for (int i = D[368]; i < D[369]; ++i) {
                        int n3 = cArray[i];
                        n3 -= D[370];
                        n3 -= D[371];
                        n3 -= D[372];
                        n3 -= D[373];
                        n3 ^= D[374];
                        n3 -= D[375];
                        n3 ^= D[376];
                        n3 ^= D[377];
                        n3 += D[378];
                        n3 ^= D[379];
                        n3 ^= D[380];
                        n3 -= D[381];
                        n3 ^= D[382];
                        cArray[i] = (char)(n3 -= D[383]);
                    }
                    object5 = kotakbaz.rain.client.render.main.C.A()[kotakbaz.rain.client.render.main.C.D[384]] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, D[385], D[386]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, D[387], byArray6.length);
            Object object6 = kotakbaz.rain.client.render.main.C.A()[D[388]];
            if (object6 == null) {
                char[] cArray = "\ubee5\ubee9\ubedb\ubef7\ubeeb\ubeea\ubeeb\ubef7\ubed4\ubee3\ubeeb\ubedb\ubef9\ubed4\ubec5\ubec8\ubec8\ubebd\ubeb6\ubebf".toCharArray();
                for (int i = D[389]; i < D[390]; ++i) {
                    int n4 = cArray[i];
                    n4 -= D[391];
                    n4 -= D[392];
                    n4 -= D[393];
                    n4 -= D[394];
                    n4 += D[395];
                    n4 -= D[396];
                    n4 -= D[397];
                    n4 += D[398];
                    n4 -= D[399];
                    n4 ^= 0x23FA;
                    n4 -= 43578;
                    n4 += 13531;
                    cArray[i] = (char)(n4 += 52221);
                }
                object6 = kotakbaz.rain.client.render.main.C.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)c), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = d;
        if (d == null) {
            d = new Object[4];
            objectArray = d;
        }
        return objectArray;
    }

    public static void b() {
        D = new int[0xCC67 ^ 0xCDF7];
        kotakbaz.rain.client.render.main.C.D[0xDC02 ^ 0xDD74] = 0x7B30 ^ 0xDD74;
        kotakbaz.rain.client.render.main.C.D[0x1483 ^ 0x14BA] = 0x14A8 ^ 0x14BA;
        kotakbaz.rain.client.render.main.C.D[0x42FF ^ 0x42CE] = 0x4C74 ^ 0x42CE;
        kotakbaz.rain.client.render.main.C.D[0x8A3 ^ 0x88B] = 0x889 ^ 0x88B;
        kotakbaz.rain.client.render.main.C.D[0x65B1 ^ 0x65B9] = 0x6586 ^ 0x65B9;
        kotakbaz.rain.client.render.main.C.D[0x90AF ^ 0x90F3] = 0x90D2 ^ 0x90F3;
        kotakbaz.rain.client.render.main.C.D[0x8200 ^ 0x831F] = 0x3058 ^ 0x831F;
        kotakbaz.rain.client.render.main.C.D[0x8A2E ^ 0x8AA5] = 0xC6 ^ 0x8AA5;
        kotakbaz.rain.client.render.main.C.D[0xDA7C ^ 0xDB4D] = 0xB8C8 ^ 0xDB4D;
        kotakbaz.rain.client.render.main.C.D[0xD2F8 ^ 0xD28C] = 0xD28D ^ 0xD28C;
        kotakbaz.rain.client.render.main.C.D[0x8C4B ^ 0x8C1E] = 0xFFFF73EF ^ 0x8C1E;
        kotakbaz.rain.client.render.main.C.D[0xE8B8 ^ 0xE9C4] = 0xBA77 ^ 0xE9C4;
        kotakbaz.rain.client.render.main.C.D[0x915E ^ 0x91F0] = 0xFFFF0297 ^ 0x91F0;
        kotakbaz.rain.client.render.main.C.D[0x9D5E ^ 0x9C1E] = 0x9C0C ^ 0x9C1E;
        kotakbaz.rain.client.render.main.C.D[0x16D4 ^ 0x17C0] = 0x52A6 ^ 0x17C0;
        kotakbaz.rain.client.render.main.C.D[0x5B64 ^ 0x5A5D] = 0xFFFF0131 ^ 0x5A5D;
        kotakbaz.rain.client.render.main.C.D[0x21A4 ^ 0x20E0] = 0x72B3 ^ 0x20E0;
        kotakbaz.rain.client.render.main.C.D[0x8BE4 ^ 0x8BD1] = 0x5FAF ^ 0x8BD1;
        kotakbaz.rain.client.render.main.C.D[0x1104 ^ 0x117E] = 0xFFFF1757 ^ 0x117E;
        kotakbaz.rain.client.render.main.C.D[0x5F25 ^ 0x5E3F] = 0xFA6B ^ 0x5E3F;
        kotakbaz.rain.client.render.main.C.D[0x10F54 ^ 0x10E1C] = 0x13DE7 ^ 0x10E1C;
        kotakbaz.rain.client.render.main.C.D[0x5D47 ^ 0x5C72] = 0x9CE2 ^ 0x5C72;
        kotakbaz.rain.client.render.main.C.D[0x4445 ^ 0x44BF] = 0x596B ^ 0x44BF;
        kotakbaz.rain.client.render.main.C.D[0xC129 ^ 0xC162] = 0xC127 ^ 0xC162;
        kotakbaz.rain.client.render.main.C.D[0x229F ^ 0x22C0] = 0x22D6 ^ 0x22C0;
        kotakbaz.rain.client.render.main.C.D[0xF1C1 ^ 0xF0C1] = 0xAFF1 ^ 0xF0C1;
        kotakbaz.rain.client.render.main.C.D[0xEBB3 ^ 0xEBE3] = 0xFFFF146A ^ 0xEBE3;
        kotakbaz.rain.client.render.main.C.D[0x4FA3 ^ 0x4F94] = 0x4F9B ^ 0x4F94;
        kotakbaz.rain.client.render.main.C.D[0x5395 ^ 0x5324] = 0xA859 ^ 0x5324;
        kotakbaz.rain.client.render.main.C.D[0x10376 ^ 0x103CF] = 0x1EC71 ^ 0x103CF;
        kotakbaz.rain.client.render.main.C.D[0xFAEE ^ 0xFBCC] = 0x489A ^ 0xFBCC;
        kotakbaz.rain.client.render.main.C.D[0xE5B ^ 0xE36] = 0xE5D ^ 0xE36;
        kotakbaz.rain.client.render.main.C.D[0xBE26 ^ 0xBF1B] = 0xBF1B ^ 0xBF1B;
        kotakbaz.rain.client.render.main.C.D[0x26CC ^ 0x263B] = 0x3BE8 ^ 0x263B;
        kotakbaz.rain.client.render.main.C.D[0x8D42 ^ 0x8C5B] = 0xFFFFD7A4 ^ 0x8C5B;
        kotakbaz.rain.client.render.main.C.D[0x4AAD ^ 0x4A43] = 0x405C ^ 0x4A43;
        kotakbaz.rain.client.render.main.C.D[0xF330 ^ 0xF3BF] = 0x5405 ^ 0xF3BF;
        kotakbaz.rain.client.render.main.C.D[0xA0AE ^ 0xA01C] = 0x5B48 ^ 0xA01C;
        kotakbaz.rain.client.render.main.C.D[0xBF2E ^ 0xBFE5] = 0x6AFF ^ 0xBFE5;
        kotakbaz.rain.client.render.main.C.D[0x44CC ^ 0x44F1] = 0x44A8 ^ 0x44F1;
        kotakbaz.rain.client.render.main.C.D[0x30F6 ^ 0x30EA] = 0x30ED ^ 0x30EA;
        kotakbaz.rain.client.render.main.C.D[0xE413 ^ 0xE419] = 0xE429 ^ 0xE419;
        kotakbaz.rain.client.render.main.C.D[0x500A ^ 0x50DA] = 0x8AC0 ^ 0x50DA;
        kotakbaz.rain.client.render.main.C.D[0x9558 ^ 0x95FB] = 0x1692 ^ 0x95FB;
        kotakbaz.rain.client.render.main.C.D[0xC4D2 ^ 0xC4F0] = 0xFFFF3B7E ^ 0xC4F0;
        kotakbaz.rain.client.render.main.C.D[0x1040D ^ 0x10575] = 0x1693D ^ 0x10575;
        kotakbaz.rain.client.render.main.C.D[0xC76D ^ 0xC7AB] = 0x1CC9E ^ 0xC7AB;
        kotakbaz.rain.client.render.main.C.D[0x24F9 ^ 0x24D4] = 0x225 ^ 0x24D4;
        kotakbaz.rain.client.render.main.C.D[0x17A4 ^ 0x1739] = 0xECB3 ^ 0x1739;
        kotakbaz.rain.client.render.main.C.D[0x5852 ^ 0x5908] = 0xFFFFA6DF ^ 0x5908;
        kotakbaz.rain.client.render.main.C.D[0x3E5A ^ 0x3E15] = 0xFFFFC1E7 ^ 0x3E15;
        kotakbaz.rain.client.render.main.C.D[0x4D72 ^ 0x4D01] = 0x4D00 ^ 0x4D01;
        kotakbaz.rain.client.render.main.C.D[0x1861 ^ 0x1881] = 0x72E6 ^ 0x1881;
        kotakbaz.rain.client.render.main.C.D[0x58DD ^ 0x59C6] = 0xB3B5 ^ 0x59C6;
        kotakbaz.rain.client.render.main.C.D[0x428E ^ 0x439C] = 0xA797 ^ 0x439C;
        kotakbaz.rain.client.render.main.C.D[0x7D82 ^ 0x7D01] = 0x2784 ^ 0x7D01;
        kotakbaz.rain.client.render.main.C.D[0x85AF ^ 0x85A3] = 0x851F ^ 0x85A3;
        kotakbaz.rain.client.render.main.C.D[0x2CDE ^ 0x2C49] = 0xBE0A ^ 0x2C49;
        kotakbaz.rain.client.render.main.C.D[0x3EE2 ^ 0x3FB6] = 0x3FAE ^ 0x3FB6;
        kotakbaz.rain.client.render.main.C.D[0xA42D ^ 0xA55C] = 0xA55F ^ 0xA55C;
        kotakbaz.rain.client.render.main.C.D[0xAB49 ^ 0xAB26] = 0xAB4B ^ 0xAB26;
        kotakbaz.rain.client.render.main.C.D[0x6C93 ^ 0x6C6F] = 0x98B4 ^ 0x6C6F;
        kotakbaz.rain.client.render.main.C.D[0xA550 ^ 0xA5DA] = 0x2F95 ^ 0xA5DA;
        kotakbaz.rain.client.render.main.C.D[0x57C2 ^ 0x56F6] = 0x9657 ^ 0x56F6;
        kotakbaz.rain.client.render.main.C.D[0x1E23 ^ 0x1F46] = 0x1F4E ^ 0x1F46;
        kotakbaz.rain.client.render.main.C.D[0x3BAF ^ 0x3B9C] = 0x5F70 ^ 0x3B9C;
        kotakbaz.rain.client.render.main.C.D[0xE32C ^ 0xE347] = 0xE307 ^ 0xE347;
        kotakbaz.rain.client.render.main.C.D[0x6B39 ^ 0x6A09] = 0x98A ^ 0x6A09;
        kotakbaz.rain.client.render.main.C.D[0x7354 ^ 0x73F3] = 0xFACC ^ 0x73F3;
        kotakbaz.rain.client.render.main.C.D[0xD78B ^ 0xD744] = 0xD41 ^ 0xD744;
        kotakbaz.rain.client.render.main.C.D[0xDD4E ^ 0xDDF2] = 0x5A60 ^ 0xDDF2;
        kotakbaz.rain.client.render.main.C.D[0xC733 ^ 0xC78E] = 0xFFFFBF9D ^ 0xC78E;
        kotakbaz.rain.client.render.main.C.D[0xF178 ^ 0xF1E0] = 0x4936 ^ 0xF1E0;
        kotakbaz.rain.client.render.main.C.D[0x64E0 ^ 0x6592] = 0x7C30 ^ 0x6592;
        kotakbaz.rain.client.render.main.C.D[0x10209 ^ 0x10326] = 0x160BB ^ 0x10326;
        kotakbaz.rain.client.render.main.C.D[0xFBA2 ^ 0xFB20] = 0xA1A6 ^ 0xFB20;
        kotakbaz.rain.client.render.main.C.D[0x213E ^ 0x207B] = 0xF1E ^ 0x207B;
        kotakbaz.rain.client.render.main.C.D[0x3960 ^ 0x3902] = 0x3972 ^ 0x3902;
        kotakbaz.rain.client.render.main.C.D[0x1FBB ^ 0x1F62] = 0xFFFFA7A5 ^ 0x1F62;
        kotakbaz.rain.client.render.main.C.D[0xD039 ^ 0xD0CA] = 0x8BFD ^ 0xD0CA;
        kotakbaz.rain.client.render.main.C.D[0x54D5 ^ 0x55AF] = 0xDFC0 ^ 0x55AF;
        kotakbaz.rain.client.render.main.C.D[0x8558 ^ 0x8430] = 0x8456 ^ 0x8430;
        kotakbaz.rain.client.render.main.C.D[0xB06C ^ 0xB0DA] = 0xBC0D ^ 0xB0DA;
        kotakbaz.rain.client.render.main.C.D[0xD433 ^ 0xD513] = 0x6645 ^ 0xD513;
        kotakbaz.rain.client.render.main.C.D[0xBA60 ^ 0xBA36] = 0xBA33 ^ 0xBA36;
        kotakbaz.rain.client.render.main.C.D[0x4225 ^ 0x429E] = 0xC50C ^ 0x429E;
        kotakbaz.rain.client.render.main.C.D[0xD2E ^ 0xDFF] = 0xD798 ^ 0xDFF;
        kotakbaz.rain.client.render.main.C.D[0x8619 ^ 0x8616] = 0xFFFF7947 ^ 0x8616;
        kotakbaz.rain.client.render.main.C.D[0xBC94 ^ 0xBD96] = 0xE2A6 ^ 0xBD96;
        kotakbaz.rain.client.render.main.C.D[0xB8DB ^ 0xB834] = 0x5163 ^ 0xB834;
        kotakbaz.rain.client.render.main.C.D[0x5FBD ^ 0x5EB2] = 0xBAAB ^ 0x5EB2;
        kotakbaz.rain.client.render.main.C.D[0xC7CF ^ 0xC791] = 0xC7A7 ^ 0xC791;
        kotakbaz.rain.client.render.main.C.D[0x13D6 ^ 0x131C] = 0x85A2 ^ 0x131C;
        kotakbaz.rain.client.render.main.C.D[0x32A8 ^ 0x338E] = 0x5D27 ^ 0x338E;
        kotakbaz.rain.client.render.main.C.D[0x3751 ^ 0x3646] = 0x921F ^ 0x3646;
        kotakbaz.rain.client.render.main.C.D[0xE009 ^ 0xE133] = 0x45F4 ^ 0xE133;
        kotakbaz.rain.client.render.main.C.D[0x6FFB ^ 0x6EC8] = 0xAE72 ^ 0x6EC8;
        kotakbaz.rain.client.render.main.C.D[0xE30B ^ 0xE313] = 0xFFFF1CF1 ^ 0xE313;
        kotakbaz.rain.client.render.main.C.D[0x3B24 ^ 0x3BC3] = 0x139A3 ^ 0x3BC3;
        kotakbaz.rain.client.render.main.C.D[0x10836 ^ 0x1097C] = 0x1E273 ^ 0x1097C;
        kotakbaz.rain.client.render.main.C.D[0x1CD2 ^ 0x1CFB] = 0x1CFB ^ 0x1CFB;
        kotakbaz.rain.client.render.main.C.D[0x7522 ^ 0x7518] = 0x753F ^ 0x7518;
        kotakbaz.rain.client.render.main.C.D[0x42F4 ^ 0x43C6] = 0x2045 ^ 0x43C6;
        kotakbaz.rain.client.render.main.C.D[0xBFAA ^ 0xBE2D] = 0x896F ^ 0xBE2D;
        kotakbaz.rain.client.render.main.C.D[0xFECA ^ 0xFE14] = 0xC686 ^ 0xFE14;
        kotakbaz.rain.client.render.main.C.D[0x10E53 ^ 0x10F24] = 0x14CC2 ^ 0x10F24;
        kotakbaz.rain.client.render.main.C.D[0x9D12 ^ 0x9C4D] = 0x9C4B ^ 0x9C4D;
        kotakbaz.rain.client.render.main.C.D[0x10CED ^ 0x10C4D] = 0x18F2F ^ 0x10C4D;
        kotakbaz.rain.client.render.main.C.D[0x9A7 ^ 0x9BE] = 0xFFFFF63A ^ 0x9BE;
        kotakbaz.rain.client.render.main.C.D[0xA52A ^ 0xA5E4] = 0x70FF ^ 0xA5E4;
        kotakbaz.rain.client.render.main.C.D[0x2957 ^ 0x29A1] = 0x7299 ^ 0x29A1;
        kotakbaz.rain.client.render.main.C.D[0x888F ^ 0x88DD] = 0x88CF ^ 0x88DD;
        kotakbaz.rain.client.render.main.C.D[0x768E ^ 0x760F] = 0x2C8A ^ 0x760F;
        kotakbaz.rain.client.render.main.C.D[0xF7BD ^ 0xF7D3] = 0xF7F1 ^ 0xF7D3;
        kotakbaz.rain.client.render.main.C.D[0x5D36 ^ 0x5D72] = 0x5D3A ^ 0x5D72;
        kotakbaz.rain.client.render.main.C.D[0x694 ^ 0x7F8] = 0xFFFFF836 ^ 0x7F8;
        kotakbaz.rain.client.render.main.C.D[0x9A6A ^ 0x9A09] = 0xFFFF6597 ^ 0x9A09;
        kotakbaz.rain.client.render.main.C.D[0x213B ^ 0x2046] = 0xEA75 ^ 0x2046;
        kotakbaz.rain.client.render.main.C.D[0xA12 ^ 0xB40] = 0xFFFFF497 ^ 0xB40;
        kotakbaz.rain.client.render.main.C.D[0x65A2 ^ 0x65F8] = 0x65D7 ^ 0x65F8;
        kotakbaz.rain.client.render.main.C.D[0x6619 ^ 0x660B] = 0x660D ^ 0x660B;
        kotakbaz.rain.client.render.main.C.D[0xE0D6 ^ 0xE022] = 0xBB1A ^ 0xE022;
        kotakbaz.rain.client.render.main.C.D[0x80BD ^ 0x8138] = 0x8138 ^ 0x8138;
        kotakbaz.rain.client.render.main.C.D[0x6AA0 ^ 0x6AA7] = 0xFFFF9502 ^ 0x6AA7;
        kotakbaz.rain.client.render.main.C.D[0xE4C9 ^ 0xE40B] = 0x7CDD ^ 0xE40B;
        kotakbaz.rain.client.render.main.C.D[0xB8B8 ^ 0xB830] = 0x3251 ^ 0xB830;
        kotakbaz.rain.client.render.main.C.D[0xAA73 ^ 0xAB50] = 0xC5F7 ^ 0xAB50;
        kotakbaz.rain.client.render.main.C.D[0x72DE ^ 0x729C] = 0x72F2 ^ 0x729C;
        kotakbaz.rain.client.render.main.C.D[0x407A ^ 0x4118] = 0xFFFFBEB8 ^ 0x4118;
        kotakbaz.rain.client.render.main.C.D[0x3C1C ^ 0x3D32] = 0xBC6C ^ 0x3D32;
        kotakbaz.rain.client.render.main.C.D[0xC46B ^ 0xC537] = 0xFFFF3A9D ^ 0xC537;
        kotakbaz.rain.client.render.main.C.D[0x528F ^ 0x539E] = 0xB793 ^ 0x539E;
        kotakbaz.rain.client.render.main.C.D[0xE4AE ^ 0xE44D] = 0x2D82 ^ 0xE44D;
        kotakbaz.rain.client.render.main.C.D[0x2E24 ^ 0x2E20] = 0x2E74 ^ 0x2E20;
        kotakbaz.rain.client.render.main.C.D[0x6FE0 ^ 0x6F98] = 0x9642 ^ 0x6F98;
        kotakbaz.rain.client.render.main.C.D[0xEAD3 ^ 0xEB8D] = 0xEB9E ^ 0xEB8D;
        kotakbaz.rain.client.render.main.C.D[0x4717 ^ 0x4737] = 0xFFFFB8BF ^ 0x4737;
        kotakbaz.rain.client.render.main.C.D[0x77C7 ^ 0x77A0] = 0xFFFF883E ^ 0x77A0;
        kotakbaz.rain.client.render.main.C.D[0x804E ^ 0x80E7] = 0xC19D ^ 0x80E7;
        kotakbaz.rain.client.render.main.C.D[0x24E8 ^ 0x248C] = 0xFFFFDB6D ^ 0x248C;
        kotakbaz.rain.client.render.main.C.D[0x59AC ^ 0x5901] = 0x35B8 ^ 0x5901;
        kotakbaz.rain.client.render.main.C.D[0x7F14 ^ 0x7E98] = 0x4029 ^ 0x7E98;
        kotakbaz.rain.client.render.main.C.D[0x1BF9 ^ 0x1B70] = 0x9113 ^ 0x1B70;
        kotakbaz.rain.client.render.main.C.D[0x1CEE ^ 0x1CDE] = 0xBE4 ^ 0x1CDE;
        kotakbaz.rain.client.render.main.C.D[0x6AF1 ^ 0x6AF7] = 0x6ACB ^ 0x6AF7;
        kotakbaz.rain.client.render.main.C.D[0x5F97 ^ 0x5E13] = 0x5E10 ^ 0x5E13;
        kotakbaz.rain.client.render.main.C.D[0x9C54 ^ 0x9DD4] = 0x9DD6 ^ 0x9DD4;
        kotakbaz.rain.client.render.main.C.D[0x3F ^ 0x108] = 0xA5D5 ^ 0x108;
        kotakbaz.rain.client.render.main.C.D[0xBB57 ^ 0xBA5C] = 0x2348 ^ 0xBA5C;
        kotakbaz.rain.client.render.main.C.D[0x52FC ^ 0x528C] = 0x528D ^ 0x528C;
        kotakbaz.rain.client.render.main.C.D[0xB134 ^ 0xB1D9] = 0xFFFF4448 ^ 0xB1D9;
        kotakbaz.rain.client.render.main.C.D[0x73F8 ^ 0x73ED] = 0xFA8A ^ 0x73ED;
        kotakbaz.rain.client.render.main.C.D[0x55F9 ^ 0x548A] = 0x4CE8 ^ 0x548A;
        kotakbaz.rain.client.render.main.C.D[0xFB40 ^ 0xFA02] = 0xC530 ^ 0xFA02;
        kotakbaz.rain.client.render.main.C.D[0xAA17 ^ 0xAAEE] = 0xB705 ^ 0xAAEE;
        kotakbaz.rain.client.render.main.C.D[0xF664 ^ 0xF76C] = 0x3940 ^ 0xF76C;
        kotakbaz.rain.client.render.main.C.D[0x8EC1 ^ 0x8EEA] = 0x8EAA ^ 0x8EEA;
        kotakbaz.rain.client.render.main.C.D[0x9261 ^ 0x92D9] = 0x92D9 ^ 0x92D9;
        kotakbaz.rain.client.render.main.C.D[0xC45 ^ 0xC61] = 0xC62 ^ 0xC61;
        kotakbaz.rain.client.render.main.C.D[0x5F54 ^ 0x5E32] = 0xFFFFA1DF ^ 0x5E32;
        kotakbaz.rain.client.render.main.C.D[0x4EB8 ^ 0x4ECE] = 0x13E6 ^ 0x4ECE;
        kotakbaz.rain.client.render.main.C.D[0x20DF ^ 0x21B1] = 0x20B1 ^ 0x21B1;
        kotakbaz.rain.client.render.main.C.D[0x733E ^ 0x7319] = 0x7319 ^ 0x7319;
        kotakbaz.rain.client.render.main.C.D[0x8F22 ^ 0x8F07] = 0x8F07 ^ 0x8F07;
        kotakbaz.rain.client.render.main.C.D[0xB5BC ^ 0xB579] = 0xFFFE41B6 ^ 0xB579;
        kotakbaz.rain.client.render.main.C.D[0xBF0 ^ 0xB8C] = 0x1540 ^ 0xB8C;
        kotakbaz.rain.client.render.main.C.D[0x1052B ^ 0x10401] = 0x1CA45 ^ 0x10401;
        kotakbaz.rain.client.render.main.C.D[0xA574 ^ 0xA5FA] = 0xFFFFFDD8 ^ 0xA5FA;
        kotakbaz.rain.client.render.main.C.D[0xC02A ^ 0xC0FD] = 0x87F0 ^ 0xC0FD;
        kotakbaz.rain.client.render.main.C.D[0x7F77 ^ 0x7FB7] = 0xE761 ^ 0x7FB7;
        kotakbaz.rain.client.render.main.C.D[0x10C0D ^ 0x10C92] = 0x1F718 ^ 0x10C92;
        kotakbaz.rain.client.render.main.C.D[0x3860 ^ 0x3964] = 0xEBC2 ^ 0x3964;
        kotakbaz.rain.client.render.main.C.D[0x8453 ^ 0x84D7] = 0x1895E ^ 0x84D7;
        kotakbaz.rain.client.render.main.C.D[0xD6FD ^ 0xD77F] = 0xD76F ^ 0xD77F;
        kotakbaz.rain.client.render.main.C.D[0x4D02 ^ 0x4C72] = 0x4C72 ^ 0x4C72;
        kotakbaz.rain.client.render.main.C.D[0xD589 ^ 0xD519] = 0xE583 ^ 0xD519;
        kotakbaz.rain.client.render.main.C.D[0xF38 ^ 0xFD0] = 0x10DAD ^ 0xFD0;
        kotakbaz.rain.client.render.main.C.D[0xB02E ^ 0xB136] = 0x1562 ^ 0xB136;
        kotakbaz.rain.client.render.main.C.D[0xD612 ^ 0xD69E] = 0x7121 ^ 0xD69E;
        kotakbaz.rain.client.render.main.C.D[0x8B3A ^ 0x8B5B] = 0xFFFF7495 ^ 0x8B5B;
        kotakbaz.rain.client.render.main.C.D[0xCC48 ^ 0xCC20] = 0xCC52 ^ 0xCC20;
        kotakbaz.rain.client.render.main.C.D[0xBE9B ^ 0xBE8F] = 0xFFFF4104 ^ 0xBE8F;
        kotakbaz.rain.client.render.main.C.D[0x4E7A ^ 0x4E88] = 0xA7D4 ^ 0x4E88;
        kotakbaz.rain.client.render.main.C.D[0x104CB ^ 0x10429] = 0x16E4E ^ 0x10429;
        kotakbaz.rain.client.render.main.C.D[0x38CF ^ 0x3863] = 0x54D5 ^ 0x3863;
        kotakbaz.rain.client.render.main.C.D[0x9404 ^ 0x9425] = 0xFFFF6BDD ^ 0x9425;
        kotakbaz.rain.client.render.main.C.D[0x743 ^ 0x743] = 0xFFFFF8AF ^ 0x743;
        kotakbaz.rain.client.render.main.C.D[0x90A7 ^ 0x90DA] = 0x8E18 ^ 0x90DA;
        kotakbaz.rain.client.render.main.C.D[0x436D ^ 0x424C] = 0xF10B ^ 0x424C;
        kotakbaz.rain.client.render.main.C.D[0x6C16 ^ 0x6D62] = 0x1740 ^ 0x6D62;
        kotakbaz.rain.client.render.main.C.D[0xFF37 ^ 0xFE57] = 0xFFFF01BD ^ 0xFE57;
        kotakbaz.rain.client.render.main.C.D[0x8FA5 ^ 0x8F20] = 0x182A4 ^ 0x8F20;
        kotakbaz.rain.client.render.main.C.D[0xFEBC ^ 0xFE49] = 0xFFFF5ABE ^ 0xFE49;
        kotakbaz.rain.client.render.main.C.D[0x7BD7 ^ 0x7BAE] = 0x827E ^ 0x7BAE;
        kotakbaz.rain.client.render.main.C.D[0x1951 ^ 0x19E5] = 0x1520 ^ 0x19E5;
        kotakbaz.rain.client.render.main.C.D[0x4BA9 ^ 0x4AE0] = 0xC3EE ^ 0x4AE0;
        kotakbaz.rain.client.render.main.C.D[0x60A6 ^ 0x60DD] = 0x990D ^ 0x60DD;
        kotakbaz.rain.client.render.main.C.D[0xE8A0 ^ 0xE8A5] = 0xE8B2 ^ 0xE8A5;
        kotakbaz.rain.client.render.main.C.D[0xAB93 ^ 0xAB38] = 0xEA42 ^ 0xAB38;
        kotakbaz.rain.client.render.main.C.D[0x5B05 ^ 0x5BC8] = 0x8EDC ^ 0x5BC8;
        kotakbaz.rain.client.render.main.C.D[0x2405 ^ 0x2510] = 0x6026 ^ 0x2510;
        kotakbaz.rain.client.render.main.C.D[0x96DE ^ 0x96FD] = 0x96AB ^ 0x96FD;
        kotakbaz.rain.client.render.main.C.D[0x1F46 ^ 0x1FF6] = 0xE483 ^ 0x1FF6;
        kotakbaz.rain.client.render.main.C.D[0x9DA6 ^ 0x9CAB] = 0x5A2 ^ 0x9CAB;
        kotakbaz.rain.client.render.main.C.D[0xF967 ^ 0xF92E] = 0xFFFF06B5 ^ 0xF92E;
        kotakbaz.rain.client.render.main.C.D[0xA11E ^ 0xA11F] = 0xA10A ^ 0xA11F;
        kotakbaz.rain.client.render.main.C.D[0xBF93 ^ 0xBF13] = 0xE59A ^ 0xBF13;
        kotakbaz.rain.client.render.main.C.D[0xFF70 ^ 0xFE21] = 0xFE22 ^ 0xFE21;
        kotakbaz.rain.client.render.main.C.D[0x8FF5 ^ 0x8E7D] = 0xE43E ^ 0x8E7D;
        kotakbaz.rain.client.render.main.C.D[0x766C ^ 0x76B1] = 0xFFFFB1C7 ^ 0x76B1;
        kotakbaz.rain.client.render.main.C.D[0xECAF ^ 0xECB8] = 0xFFFF133A ^ 0xECB8;
        kotakbaz.rain.client.render.main.C.D[0xEA22 ^ 0xEAFE] = 0xD26C ^ 0xEAFE;
        kotakbaz.rain.client.render.main.C.D[0x8C23 ^ 0x8D1C] = 0x8D1C ^ 0x8D1C;
        kotakbaz.rain.client.render.main.C.D[0x10830 ^ 0x1086D] = 0x1086F ^ 0x1086D;
        kotakbaz.rain.client.render.main.C.D[0x11FC ^ 0x1165] = 0xA9B5 ^ 0x1165;
        kotakbaz.rain.client.render.main.C.D[0x5C8C ^ 0x5CAA] = 0x5CAB ^ 0x5CAA;
        kotakbaz.rain.client.render.main.C.D[0xA176 ^ 0xA125] = 0xA116 ^ 0xA125;
        kotakbaz.rain.client.render.main.C.D[0x7256 ^ 0x72F3] = 0xFBCC ^ 0x72F3;
        kotakbaz.rain.client.render.main.C.D[0x7CA6 ^ 0x7C7C] = 0x3B65 ^ 0x7C7C;
        kotakbaz.rain.client.render.main.C.D[0x74D8 ^ 0x7419] = 0xFFFF1310 ^ 0x7419;
        kotakbaz.rain.client.render.main.C.D[0xED72 ^ 0xEDD3] = 0x6EBA ^ 0xEDD3;
        kotakbaz.rain.client.render.main.C.D[0xA1F7 ^ 0xA106] = 0xFFFFB790 ^ 0xA106;
        kotakbaz.rain.client.render.main.C.D[0xAA79 ^ 0xAB14] = 0xAB13 ^ 0xAB14;
        kotakbaz.rain.client.render.main.C.D[0x7381 ^ 0x72CC] = 0x72CB ^ 0x72CC;
        kotakbaz.rain.client.render.main.C.D[0x3B99 ^ 0x3BA7] = 0x3BFF ^ 0x3BA7;
        kotakbaz.rain.client.render.main.C.D[0xCDBA ^ 0xCD2F] = 0x5F6C ^ 0xCD2F;
        kotakbaz.rain.client.render.main.C.D[0x1BB5 ^ 0x1B53] = 0xD29F ^ 0x1B53;
        kotakbaz.rain.client.render.main.C.D[0x109D0 ^ 0x10988] = 0xFFFEF649 ^ 0x10988;
        kotakbaz.rain.client.render.main.C.D[0x8108 ^ 0x8082] = 0x3F0D ^ 0x8082;
        kotakbaz.rain.client.render.main.C.D[0x5B69 ^ 0x5B91] = 0x4645 ^ 0x5B91;
        kotakbaz.rain.client.render.main.C.D[0x9A82 ^ 0x9A94] = 0xFFFF653E ^ 0x9A94;
        kotakbaz.rain.client.render.main.C.D[0x10156 ^ 0x10032] = 0x10066 ^ 0x10032;
        kotakbaz.rain.client.render.main.C.D[0xCFF0 ^ 0xCEBC] = 0xCEAC ^ 0xCEBC;
        kotakbaz.rain.client.render.main.C.D[0xACF9 ^ 0xAD9E] = 0xAD9F ^ 0xAD9E;
        kotakbaz.rain.client.render.main.C.D[0xD0DA ^ 0xD069] = 0x2B14 ^ 0xD069;
        kotakbaz.rain.client.render.main.C.D[0xD224 ^ 0xD36F] = 0xD36E ^ 0xD36F;
        kotakbaz.rain.client.render.main.C.D[0x627 ^ 0x61C] = 0x657 ^ 0x61C;
        kotakbaz.rain.client.render.main.C.D[0x7BBD ^ 0x7B46] = 0x8F95 ^ 0x7B46;
        kotakbaz.rain.client.render.main.C.D[0xA77A ^ 0xA761] = 0xFFFF5886 ^ 0xA761;
        kotakbaz.rain.client.render.main.C.D[0x44B9 ^ 0x45E4] = 0x45E4 ^ 0x45E4;
        kotakbaz.rain.client.render.main.C.D[0x190A ^ 0x19D9] = 0x4EF3 ^ 0x19D9;
        kotakbaz.rain.client.render.main.C.D[0x8EA9 ^ 0x8EA2] = 0xFFFF712E ^ 0x8EA2;
        kotakbaz.rain.client.render.main.C.D[0xCD7D ^ 0xCC25] = 0xFFFF33CE ^ 0xCC25;
        kotakbaz.rain.client.render.main.C.D[0x741C ^ 0x745F] = 0xFFFF8B91 ^ 0x745F;
        kotakbaz.rain.client.render.main.C.D[0x18C1 ^ 0x1987] = 0x34CF ^ 0x1987;
        kotakbaz.rain.client.render.main.C.D[0x774D ^ 0x7732] = 0x69F0 ^ 0x7732;
        kotakbaz.rain.client.render.main.C.D[0xD3FE ^ 0xD2DA] = 0xBC73 ^ 0xD2DA;
        kotakbaz.rain.client.render.main.C.D[0x72C ^ 0x67F] = 0x676 ^ 0x67F;
        kotakbaz.rain.client.render.main.C.D[0x78E ^ 0x6B6] = 0xA271 ^ 0x6B6;
        kotakbaz.rain.client.render.main.C.D[0x8BD6 ^ 0x8B1F] = 0x1DB6 ^ 0x8B1F;
        kotakbaz.rain.client.render.main.C.D[0x61F8 ^ 0x6147] = 0xF987 ^ 0x6147;
        kotakbaz.rain.client.render.main.C.D[0x3D18 ^ 0x3C57] = 0x3C5C ^ 0x3C57;
        kotakbaz.rain.client.render.main.C.D[0x9971 ^ 0x99EA] = 0x213A ^ 0x99EA;
        kotakbaz.rain.client.render.main.C.D[0xCD0E ^ 0xCC4F] = 0xF79E ^ 0xCC4F;
        kotakbaz.rain.client.render.main.C.D[0x5549 ^ 0x55CE] = 0x1584A ^ 0x55CE;
        kotakbaz.rain.client.render.main.C.D[0xB4EF ^ 0xB4FF] = 0xB48D ^ 0xB4FF;
        kotakbaz.rain.client.render.main.C.D[0x34EE ^ 0x34A2] = 0x34A4 ^ 0x34A2;
        kotakbaz.rain.client.render.main.C.D[0x37B8 ^ 0x3726] = 0xCCEC ^ 0x3726;
        kotakbaz.rain.client.render.main.C.D[0xB5B9 ^ 0xB482] = 0xB482 ^ 0xB482;
        kotakbaz.rain.client.render.main.C.D[0xC6FD ^ 0xC63A] = 0x5097 ^ 0xC63A;
        kotakbaz.rain.client.render.main.C.D[0x2024 ^ 0x20F2] = 0x77DC ^ 0x20F2;
        kotakbaz.rain.client.render.main.C.D[0x77FD ^ 0x77F0] = 0xFFFF8842 ^ 0x77F0;
        kotakbaz.rain.client.render.main.C.D[0xFBA9 ^ 0xFBB6] = 0xFFFF044D ^ 0xFBB6;
        kotakbaz.rain.client.render.main.C.D[0x1023B ^ 0x102A9] = 0xFFFECD8D ^ 0x102A9;
        kotakbaz.rain.client.render.main.C.D[0xD538 ^ 0xD59C] = 0x5CA0 ^ 0xD59C;
        kotakbaz.rain.client.render.main.C.D[0x5FCA ^ 0x5EF6] = 0x5EF6 ^ 0x5EF6;
        kotakbaz.rain.client.render.main.C.D[0x8409 ^ 0x8507] = 0x1C1A ^ 0x8507;
        kotakbaz.rain.client.render.main.C.D[0xD613 ^ 0xD63D] = 0x7A49 ^ 0xD63D;
        kotakbaz.rain.client.render.main.C.D[0xB8F3 ^ 0xB8A7] = 0xFFFF477C ^ 0xB8A7;
        kotakbaz.rain.client.render.main.C.D[0x92D8 ^ 0x93C4] = 0x79AB ^ 0x93C4;
        kotakbaz.rain.client.render.main.C.D[0x3612 ^ 0x3704] = 0x7262 ^ 0x3704;
        kotakbaz.rain.client.render.main.C.D[0xB598 ^ 0xB596] = 0xB5F8 ^ 0xB596;
        kotakbaz.rain.client.render.main.C.D[0x1953 ^ 0x198B] = 0x5E92 ^ 0x198B;
        kotakbaz.rain.client.render.main.C.D[0x100F9 ^ 0x1017F] = 0x1016B ^ 0x1017F;
        kotakbaz.rain.client.render.main.C.D[0x4848 ^ 0x491F] = 0x4912 ^ 0x491F;
        kotakbaz.rain.client.render.main.C.D[0x2F94 ^ 0x2E1D] = 0x7458 ^ 0x2E1D;
        kotakbaz.rain.client.render.main.C.D[0x794E ^ 0x78C5] = 0x7E55 ^ 0x78C5;
        kotakbaz.rain.client.render.main.C.D[0xE59F ^ 0xE4C4] = 0xE4CE ^ 0xE4C4;
        kotakbaz.rain.client.render.main.C.D[0x865C ^ 0x8779] = 0xFFFF1668 ^ 0x8779;
        kotakbaz.rain.client.render.main.C.D[0x5BE4 ^ 0x5BD2] = 0x5BD2 ^ 0x5BD2;
        kotakbaz.rain.client.render.main.C.D[0x6AB1 ^ 0x6AC0] = 0x6AC2 ^ 0x6AC0;
        kotakbaz.rain.client.render.main.C.D[0xA362 ^ 0xA34D] = 0x2AAA ^ 0xA34D;
        kotakbaz.rain.client.render.main.C.D[0x2C7E ^ 0x2D78] = 0xFFDE ^ 0x2D78;
        kotakbaz.rain.client.render.main.C.D[0x87FE ^ 0x86B9] = 0x5E72 ^ 0x86B9;
        kotakbaz.rain.client.render.main.C.D[0x3560 ^ 0x3527] = 0xFFFFCAD8 ^ 0x3527;
        kotakbaz.rain.client.render.main.C.D[0xEB73 ^ 0xEAFE] = 0xB40C ^ 0xEAFE;
        kotakbaz.rain.client.render.main.C.D[0x6964 ^ 0x69A0] = 0x16295 ^ 0x69A0;
        kotakbaz.rain.client.render.main.C.D[0x41BD ^ 0x41BE] = 0x41E3 ^ 0x41BE;
        kotakbaz.rain.client.render.main.C.D[0x3C9C ^ 0x3CDC] = 0x3C9B ^ 0x3CDC;
        kotakbaz.rain.client.render.main.C.D[0x1D35 ^ 0x1C7B] = 0xFFFFE3F8 ^ 0x1C7B;
        kotakbaz.rain.client.render.main.C.D[0x9444 ^ 0x952E] = 0xFFFF6A9F ^ 0x952E;
        kotakbaz.rain.client.render.main.C.D[0xA24B ^ 0xA2A2] = 0x1A0B4 ^ 0xA2A2;
        kotakbaz.rain.client.render.main.C.D[0xB83C ^ 0xB8E9] = 0xEFEB ^ 0xB8E9;
        kotakbaz.rain.client.render.main.C.D[0xF088 ^ 0xF044] = 0x255F ^ 0xF044;
        kotakbaz.rain.client.render.main.C.D[0x665 ^ 0x66C] = 0xFFFFF9F0 ^ 0x66C;
        kotakbaz.rain.client.render.main.C.D[0xF1C3 ^ 0xF0CF] = 0x69D2 ^ 0xF0CF;
        kotakbaz.rain.client.render.main.C.D[0x4B1E ^ 0x4A67] = 0xDD49 ^ 0x4A67;
        kotakbaz.rain.client.render.main.C.D[0xC46B ^ 0xC55D] = 0x5FC ^ 0xC55D;
        kotakbaz.rain.client.render.main.C.D[0xFB62 ^ 0xFB10] = 0xFB10 ^ 0xFB10;
        kotakbaz.rain.client.render.main.C.D[0x10EB9 ^ 0x10E0E] = 0x102CA ^ 0x10E0E;
        kotakbaz.rain.client.render.main.C.D[0x3A71 ^ 0x3AE2] = 0xA71 ^ 0x3AE2;
        kotakbaz.rain.client.render.main.C.D[0xD489 ^ 0xD4D8] = 0xD483 ^ 0xD4D8;
        kotakbaz.rain.client.render.main.C.D[0x16D7 ^ 0x165A] = 0xB1E0 ^ 0x165A;
        kotakbaz.rain.client.render.main.C.D[0x640A ^ 0x649C] = 0xF6A5 ^ 0x649C;
        kotakbaz.rain.client.render.main.C.D[0xE545 ^ 0xE4CB] = 0xFBFD ^ 0xE4CB;
        kotakbaz.rain.client.render.main.C.D[0x5126 ^ 0x517D] = 0x517C ^ 0x517D;
        kotakbaz.rain.client.render.main.C.D[0xF591 ^ 0xF5BB] = 0xF5BB ^ 0xF5BB;
        kotakbaz.rain.client.render.main.C.D[0x3825 ^ 0x381A] = 0xFFFFC7FB ^ 0x381A;
        kotakbaz.rain.client.render.main.C.D[0x6CE3 ^ 0x6C96] = 0x6C96 ^ 0x6C96;
        kotakbaz.rain.client.render.main.C.D[0xC253 ^ 0xC330] = 0xC335 ^ 0xC330;
        kotakbaz.rain.client.render.main.C.D[0x4ADA ^ 0x4BB1] = 0x4BB5 ^ 0x4BB1;
        kotakbaz.rain.client.render.main.C.D[0xBE5A ^ 0xBF53] = 0xFFFF8EA2 ^ 0xBF53;
        kotakbaz.rain.client.render.main.C.D[0x8BF3 ^ 0x8B03] = 0x625F ^ 0x8B03;
        kotakbaz.rain.client.render.main.C.D[0x4910 ^ 0x4996] = 0xFFFEBBE8 ^ 0x4996;
        kotakbaz.rain.client.render.main.C.D[0xBDF5 ^ 0xBD0B] = 0x49D0 ^ 0xBD0B;
        kotakbaz.rain.client.render.main.C.D[0x10FC6 ^ 0x10EEA] = 0x18FB4 ^ 0x10EEA;
        kotakbaz.rain.client.render.main.C.D[0xFD13 ^ 0xFD6D] = 0xFFFF1C79 ^ 0xFD6D;
        kotakbaz.rain.client.render.main.C.D[0xDC34 ^ 0xDD0A] = 0xDD0B ^ 0xDD0A;
        kotakbaz.rain.client.render.main.C.D[0x89AF ^ 0x894E] = 0xFFFF1CDC ^ 0x894E;
        kotakbaz.rain.client.render.main.C.D[0xDB04 ^ 0xDA2D] = 0x1465 ^ 0xDA2D;
        kotakbaz.rain.client.render.main.C.D[0xFA3A ^ 0xFA80] = 0x151E ^ 0xFA80;
        kotakbaz.rain.client.render.main.C.D[0x861B ^ 0x86B9] = 0x5B7 ^ 0x86B9;
        kotakbaz.rain.client.render.main.C.D[0xF1D2 ^ 0xF0D1] = 0x226E ^ 0xF0D1;
        kotakbaz.rain.client.render.main.C.D[0x47F1 ^ 0x467E] = 0x4728 ^ 0x467E;
        kotakbaz.rain.client.render.main.C.D[0x97D0 ^ 0x9798] = 0xFFFF6871 ^ 0x9798;
        kotakbaz.rain.client.render.main.C.D[0x9B79 ^ 0x9A0C] = 0xF5E8 ^ 0x9A0C;
        kotakbaz.rain.client.render.main.C.D[0x476D ^ 0x4604] = 0x4608 ^ 0x4604;
        kotakbaz.rain.client.render.main.C.D[0x5B29 ^ 0x5B97] = 0xDC05 ^ 0x5B97;
        kotakbaz.rain.client.render.main.C.D[0x53DE ^ 0x53B2] = 0xFFFFAC4E ^ 0x53B2;
        kotakbaz.rain.client.render.main.C.D[0xB016 ^ 0xB168] = 0x219E ^ 0xB168;
        kotakbaz.rain.client.render.main.C.D[0x9995 ^ 0x9984] = 0xFFFF6627 ^ 0x9984;
        kotakbaz.rain.client.render.main.C.D[0x6B3F ^ 0x6BDB] = 0xA217 ^ 0x6BDB;
        kotakbaz.rain.client.render.main.C.D[0x8E23 ^ 0x8EC9] = 0x18CB4 ^ 0x8EC9;
        kotakbaz.rain.client.render.main.C.D[0x5A3D ^ 0x5B6B] = 0xFFFFA4FA ^ 0x5B6B;
        kotakbaz.rain.client.render.main.C.D[0xB529 ^ 0xB540] = 0xFFFF4AB0 ^ 0xB540;
        kotakbaz.rain.client.render.main.C.D[0x6575 ^ 0x645D] = 0xAA19 ^ 0x645D;
        kotakbaz.rain.client.render.main.C.D[0x5380 ^ 0x536C] = 0x5973 ^ 0x536C;
        kotakbaz.rain.client.render.main.C.D[0xA6D ^ 0xB6C] = 0x541F ^ 0xB6C;
        kotakbaz.rain.client.render.main.C.D[0x29EA ^ 0x29AC] = 0x299A ^ 0x29AC;
        kotakbaz.rain.client.render.main.C.D[0x9BC6 ^ 0x9AC3] = 0x484F ^ 0x9AC3;
        kotakbaz.rain.client.render.main.C.D[0xAE74 ^ 0xAE48] = 0xAE04 ^ 0xAE48;
        kotakbaz.rain.client.render.main.C.D[0x4C50 ^ 0x4CAD] = 0xB851 ^ 0x4CAD;
        kotakbaz.rain.client.render.main.C.D[0x4217 ^ 0x42F2] = 0x8B3D ^ 0x42F2;
        kotakbaz.rain.client.render.main.C.D[0x10AE2 ^ 0x10AAC] = 0xFFFEF54E ^ 0x10AAC;
        kotakbaz.rain.client.render.main.C.D[0x1860 ^ 0x182A] = 0x180B ^ 0x182A;
        kotakbaz.rain.client.render.main.C.D[0xA224 ^ 0xA367] = 0x2745 ^ 0xA367;
        kotakbaz.rain.client.render.main.C.D[0x7B89 ^ 0x7AE8] = 0x7AE7 ^ 0x7AE8;
        kotakbaz.rain.client.render.main.C.D[0x70B7 ^ 0x7002] = 0x7CC6 ^ 0x7002;
        kotakbaz.rain.client.render.main.C.D[0x1915 ^ 0x1939] = 0xEDD9 ^ 0x1939;
        kotakbaz.rain.client.render.main.C.D[0xA114 ^ 0xA17E] = 0xFFFF5EE2 ^ 0xA17E;
        kotakbaz.rain.client.render.main.C.D[0xF473 ^ 0xF4DC] = 0x9865 ^ 0xF4DC;
        kotakbaz.rain.client.render.main.C.D[0x701B ^ 0x7006] = 0xFFFF8FE6 ^ 0x7006;
        kotakbaz.rain.client.render.main.C.D[0x105B0 ^ 0x10497] = 0x1CAC3 ^ 0x10497;
        kotakbaz.rain.client.render.main.C.D[0x3765 ^ 0x3675] = 0xD27E ^ 0x3675;
        kotakbaz.rain.client.render.main.C.D[0x4DFA ^ 0x4D50] = 0xFFFFF3C0 ^ 0x4D50;
        kotakbaz.rain.client.render.main.C.D[0xE230 ^ 0xE2AA] = 0xFFFFA5BD ^ 0xE2AA;
        kotakbaz.rain.client.render.main.C.D[0x67DB ^ 0x66B4] = 0x66B6 ^ 0x66B4;
        kotakbaz.rain.client.render.main.C.D[0x390B ^ 0x3801] = 0xF62D ^ 0x3801;
        kotakbaz.rain.client.render.main.C.D[0x1201 ^ 0x12D3] = 0xC8C9 ^ 0x12D3;
        kotakbaz.rain.client.render.main.C.D[0x5A54 ^ 0x5A6C] = 0x5A6D ^ 0x5A6C;
        kotakbaz.rain.client.render.main.C.D[0x6E08 ^ 0x6EE3] = 0x64EB ^ 0x6EE3;
        kotakbaz.rain.client.render.main.C.D[0x42D8 ^ 0x42DA] = 0x42FD ^ 0x42DA;
        kotakbaz.rain.client.render.main.C.D[0x39E9 ^ 0x3921] = 0xAF9F ^ 0x3921;
        kotakbaz.rain.client.render.main.C.D[0xAEC7 ^ 0xAE04] = 0x1A534 ^ 0xAE04;
        kotakbaz.rain.client.render.main.C.D[0x662 ^ 0x602] = 0x66E ^ 0x602;
        kotakbaz.rain.client.render.main.C.D[0x8DA5 ^ 0x8CBB] = 0x66D4 ^ 0x8CBB;
        kotakbaz.rain.client.render.main.C.D[0xEA3E ^ 0xEA7F] = 0xEA57 ^ 0xEA7F;
        kotakbaz.rain.client.render.main.C.D[0xAB8A ^ 0xAB75] = 0xF450 ^ 0xAB75;
        kotakbaz.rain.client.render.main.C.D[0x8D1B ^ 0x8D05] = 0xFFFF728A ^ 0x8D05;
        kotakbaz.rain.client.render.main.C.D[0x22A5 ^ 0x23A2] = 0xED88 ^ 0x23A2;
        kotakbaz.rain.client.render.main.C.D[0xD5AA ^ 0xD5EF] = 0xFFFF2A19 ^ 0xD5EF;
        kotakbaz.rain.client.render.main.C.D[0x608E ^ 0x60C3] = 0xFFFF9F07 ^ 0x60C3;
        kotakbaz.rain.client.render.main.C.D[0x4CD4 ^ 0x4DAB] = 0xC473 ^ 0x4DAB;
        kotakbaz.rain.client.render.main.C.D[0x743E ^ 0x74E5] = 0x4C75 ^ 0x74E5;
        kotakbaz.rain.client.render.main.C.D[0x314B ^ 0x31E3] = 0x709D ^ 0x31E3;
        kotakbaz.rain.client.render.main.C.D[0xAFD9 ^ 0xAF0D] = 0xF823 ^ 0xAF0D;
        kotakbaz.rain.client.render.main.C.D[0x10656 ^ 0x1074B] = 0x1ED12 ^ 0x1074B;
        kotakbaz.rain.client.render.main.C.D[0x14D2 ^ 0x1553] = 0x1553 ^ 0x1553;
        kotakbaz.rain.client.render.main.C.D[0x54AA ^ 0x55F3] = 0x55FD ^ 0x55F3;
        kotakbaz.rain.client.render.main.C.D[0xEC8B ^ 0xECDC] = 0xFFFF1338 ^ 0xECDC;
        kotakbaz.rain.client.render.main.C.D[0xE077 ^ 0xE127] = 0xFFFF1EDB ^ 0xE127;
        kotakbaz.rain.client.render.main.C.D[0x10134 ^ 0x10100] = 0x1380D ^ 0x10100;
        kotakbaz.rain.client.render.main.C.D[0x545A ^ 0x542D] = 0x915 ^ 0x542D;
        kotakbaz.rain.client.render.main.C.D[0xF804 ^ 0xF898] = 0x315 ^ 0xF898;
        kotakbaz.rain.client.render.main.C.D[0x2C23 ^ 0x2CFC] = 0x4697 ^ 0x2CFC;
        kotakbaz.rain.client.render.main.C.D[0x850B ^ 0x859A] = 0xB509 ^ 0x859A;
        kotakbaz.rain.client.render.main.C.D[0xC6E5 ^ 0xC7CE] = 0x4688 ^ 0xC7CE;
        kotakbaz.rain.client.render.main.C.D[0x61F5 ^ 0x61EF] = 0x61B0 ^ 0x61EF;
        kotakbaz.rain.client.render.main.C.D[0x46E9 ^ 0x4792] = 0x38DD ^ 0x4792;
        kotakbaz.rain.client.render.main.C.D[0x10600 ^ 0x10666] = 0xFFFEF98A ^ 0x10666;
        kotakbaz.rain.client.render.main.C.D[0xB786 ^ 0xB6AB] = 0xFFFFC871 ^ 0xB6AB;
        kotakbaz.rain.client.render.main.C.D[0x772 ^ 0x717] = 0xFFFFF8BA ^ 0x717;
        kotakbaz.rain.client.render.main.C.D[0xD751 ^ 0xD6D2] = 0xD6C2 ^ 0xD6D2;
        kotakbaz.rain.client.render.main.C.D[0x993B ^ 0x9909] = 0x62C5 ^ 0x9909;
        kotakbaz.rain.client.render.main.C.D[0x49D0 ^ 0x48C3] = 0xDAF ^ 0x48C3;
        kotakbaz.rain.client.render.main.C.D[0xFDBA ^ 0xFD1C] = 0xFFFF8B8B ^ 0xFD1C;
        kotakbaz.rain.client.render.main.C.D[0xE017 ^ 0xE083] = 0x72C0 ^ 0xE083;
        kotakbaz.rain.client.render.main.C.D[0xAF90 ^ 0xAFC9] = 0xAFF9 ^ 0xAFC9;
        kotakbaz.rain.client.render.main.C.D[0x97E5 ^ 0x96B0] = 0x96B2 ^ 0x96B0;
        kotakbaz.rain.client.render.main.C.D[0x181D ^ 0x180E] = 0xFFFFE7A3 ^ 0x180E;
    }
}

