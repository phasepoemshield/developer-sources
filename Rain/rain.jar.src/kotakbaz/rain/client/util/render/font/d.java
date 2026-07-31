/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.render.font;

import com.google.gson.annotations.SerializedName;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.util.render.font.B;
import kotakbaz.rain.client.util.render.font.F;
import kotakbaz.rain.client.util.render.font.a;
import kotakbaz.rain.client.util.render.font.b;
import kotakbaz.rain.client.util.render.font.b_0;
import kotakbaz.rain.client.util.render.font.f_0;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0005\u001e\u001f !\"B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019\u00a8\u0006#"}, d2={"Lkotakbaz/rain/client/util/render/font/FontData;", "", "<init>", "()V", "Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "atlas", "Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "getAtlas", "()Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;", "setAtlas", "(Lkotakbaz/rain/client/util/render/font/FontData$AtlasData;)V", "Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "metrics", "Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "getMetrics", "()Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;", "setMetrics", "(Lkotakbaz/rain/client/util/render/font/FontData$MetricsData;)V", "", "Lkotakbaz/rain/client/util/render/font/FontData$GlyphData;", "glyphs", "Ljava/util/List;", "getGlyphs", "()Ljava/util/List;", "setGlyphs", "(Ljava/util/List;)V", "Lkotakbaz/rain/client/util/render/font/FontData$KerningData;", "kernings", "getKernings", "setKernings", "AtlasData", "MetricsData", "GlyphData", "BoundsData", "KerningData", "rain-visuals"})
public final class d {
    @SerializedName(value="atlas")
    @NotNull
    private f_0 atlas = new F();
    @SerializedName(value="metrics")
    @NotNull
    private b_0 metrics = new b();
    @SerializedName(value="glyphs")
    @NotNull
    private List<B> glyphs = CollectionsKt.emptyList();
    @SerializedName(value="kerning")
    @NotNull
    private List<a> kernings = CollectionsKt.emptyList();
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    @NotNull
    public final f_0 getAtlas() {
        return this.atlas;
    }

    public final void setAtlas(@NotNull f_0 f_02) {
        int n2 = C[0];
        n2 += C[1];
        Intrinsics.checkNotNullParameter(f_02, (String)a[n2 ^= C[2]]);
        this.atlas = f_02;
    }

    @NotNull
    public final b_0 getMetrics() {
        return this.metrics;
    }

    public final void setMetrics(@NotNull b_0 b_02) {
        int n2 = C[3];
        n2 -= C[4];
        Intrinsics.checkNotNullParameter(b_02, (String)a[n2 ^= C[5]]);
        this.metrics = b_02;
    }

    @NotNull
    public final List<B> getGlyphs() {
        return this.glyphs;
    }

    public final void setGlyphs(@NotNull List<B> list) {
        int n2 = C[6];
        n2 ^= C[7];
        Intrinsics.checkNotNullParameter(list, (String)a[n2 += C[8]]);
        this.glyphs = list;
    }

    @NotNull
    public final List<a> getKernings() {
        return this.kernings;
    }

    public final void setKernings(@NotNull List<a> list) {
        int n2 = C[9];
        n2 ^= C[10];
        Intrinsics.checkNotNullParameter(list, (String)a[n2 -= C[11]]);
        this.kernings = list;
    }

    static {
        d.b();
        long l2 = -2225571133980158385L;
        long l3 = -3192090027232393873L;
        long l4 = -6954360970914176733L;
        long l5 = -797317471190350361L;
        long l6 = -3654071176213253442L;
        long l7 = -9175106556485922726L;
        long l8 = 4226847400140859236L;
        long l9 = 4860181830617161466L;
        long l10 = -2605685191184361573L;
        long l11 = 4203574047804163089L;
        long l12 = 7312942100875006242L;
        long l13 = 5683670712907845135L;
        long l14 = 4275981307019356962L;
        long l15 = 5875432921105324258L;
        int n2 = C[12];
        n2 += C[13];
        a = new Object[n2 ^= C[14]];
        long l16 = l15;
        int n3 = C[15];
        n3 += C[16];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[17]);
        Object[] objectArray = new Object[C[18]];
        objectArray[d.C[19]] = A;
        objectArray[d.C[20]] = C[21];
        int n4 = C[22];
        Object object = d.A()[C[23]];
        if (object == null) {
            char[] cArray = "\u65fd\u65f4\u65f0\u65d3\u65da\u6587\u6582\u65e7\u643c\u65c6\u65c6\u65dc\u643d\u65da\u643b\u65cb\u65d4\u6583\u65d3\u65d3\u65c8\u65d6\u643d\u65c9\u65d8\u65e7\u65fd\u65d3\u65d8\u65c4\u65d5\u65fc\u65f1\u65df\u65d0\u65ea\u6439\u65d1\u65d8\u65f8\u65f6\u65ea\u65f4\u65f0\u65f7\u6584\u6583\u65ff\u65e8\u643a\u65d0\u65f2\u65d8\u65d2\u65c9\u6587\u65c2\u65f1\u65f5\u6438\u643d\u65d3\u65d4\u65f4\u65d6\u65c7\u65d6\u65e6\u65d2\u65d6\u643a\u65f0\u65c9\u65d2\u6430\u65d8\u65d3\u65ea\u65e8\u643d\u65fc\u65dc\u65c8\u6430\u65d5\u65f4\u65ce\u65ce".toCharArray();
            for (int i2 = C[24]; i2 < C[25]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= C[26];
                n5 ^= C[27];
                n5 ^= C[28];
                n5 ^= C[29];
                n5 ^= C[30];
                n5 += C[31];
                n5 += C[32];
                n5 += C[33];
                n5 -= C[34];
                n5 -= C[35];
                n5 -= C[36];
                cArray[i2] = (char)(n5 -= C[37]);
            }
            object = d.A()[d.C[38]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)d.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[39];
        n6 -= C[40];
        l6 = l17 ^ (0x2400000000L ^ l17) & -1L << (n6 += C[41]);
        long l18 = l13;
        int n7 = C[42];
        n7 += C[43];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[44]);
        while (true) {
            int n8 = C[45];
            n8 -= C[46];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= C[47]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[48];
            n10 += C[49];
            int n11 = C[51];
            n11 += C[52];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[50])) & -1L >>> (n11 += C[53]);
            long l20 = l9;
            int n12 = C[54];
            n12 -= C[55];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += C[56]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[57];
            n14 += C[58];
            int n15 = C[60];
            n15 -= C[61];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[59])) & -1L >>> (n15 ^= C[62]);
            int n16 = C[63];
            n16 += C[64];
            long l22 = l10;
            int n17 = C[66];
            n17 ^= C[67];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += C[65]) ^ l22) & -1L << (n17 += C[68]);
            int n18 = C[69];
            n18 ^= C[70];
            n18 -= C[71];
            int n19 = C[72];
            n19 -= C[73];
            long l23 = l12;
            int n20 = C[75];
            n20 -= C[76];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += C[74]))) ^ l23) & -1L >>> (n20 -= C[77]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[78];
            n21 ^= C[79];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[80]);
            while (true) {
                int n22 = C[81];
                n22 += C[82];
                if ((int)(l14 >>> (n22 -= C[83])) >= (int)l12) break;
                int n23 = C[84];
                n23 += C[85];
                int n24 = C[87];
                n24 += C[88];
                cArray2[(int)(l14 >>> (n23 -= d.C[86]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[89]))];
                l14 += 0x100000000L;
            }
            int n25 = C[90];
            n25 -= C[91];
            int n26 = (int)(l15 >>> (n25 ^= C[92]));
            l15 += 0x100000000L;
            d.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[93];
            n27 -= C[94];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[95]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[96]];
        String string = (String)object[C[97]];
        object = object[C[98]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[99]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[100]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[102] ^ C[103]];
                byArray[d.C[104] ^ d.C[105]] = C[106] ^ C[107];
                byArray[d.C[108] ^ d.C[109]] = C[110] ^ C[111];
                byArray[d.C[112] ^ d.C[113]] = C[114] ^ C[115];
                byArray[d.C[116] ^ d.C[117]] = C[118] ^ C[119];
                byArray[d.C[120] ^ d.C[121]] = C[122] ^ C[123];
                byArray[d.C[124] ^ d.C[125]] = C[126] ^ C[127];
                byArray[d.C[128] ^ d.C[129]] = C[130] ^ C[131];
                byArray[d.C[132] ^ d.C[133]] = C[134] ^ C[135];
                byArray[d.C[136] ^ d.C[137]] = C[138] ^ C[139];
                byArray[d.C[140] ^ d.C[141]] = C[142] ^ C[143];
                byArray[d.C[144] ^ d.C[145]] = C[146] ^ C[147];
                byArray[d.C[148] ^ d.C[149]] = C[150] ^ C[151];
                byArray[d.C[152] ^ d.C[153]] = C[154] ^ C[155];
                byArray[d.C[156] ^ d.C[157]] = C[158] ^ C[159];
                byArray[d.C[160] ^ d.C[161]] = C[162] ^ C[163];
                byArray[d.C[164] ^ d.C[165]] = C[166] ^ C[167];
                objectArray2[d.C[101]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[168]];
            if (b == null) {
                byte[] byArray2 = new byte[C[169] ^ C[170]];
                byArray2[d.C[171] ^ d.C[172]] = C[173] ^ C[174];
                byArray2[d.C[175] ^ d.C[176]] = C[177] ^ C[178];
                byArray2[d.C[179] ^ d.C[180]] = C[181] ^ C[182];
                byArray2[d.C[183] ^ d.C[184]] = C[185] ^ C[186];
                byArray2[d.C[187] ^ d.C[188]] = C[189] ^ C[190];
                byArray2[d.C[191] ^ d.C[192]] = C[193] ^ C[194];
                byArray2[d.C[195] ^ d.C[196]] = C[197] ^ C[198];
                byArray2[d.C[199] ^ d.C[200]] = C[201] ^ C[202];
                byArray2[d.C[203] ^ d.C[204]] = C[205] ^ C[206];
                byArray2[d.C[207] ^ d.C[208]] = C[209] ^ C[210];
                byArray2[d.C[211] ^ d.C[212]] = C[213] ^ C[214];
                byArray2[d.C[215] ^ d.C[216]] = C[217] ^ C[218];
                byArray2[d.C[219] ^ d.C[220]] = C[221] ^ C[222];
                byArray2[d.C[223] ^ d.C[224]] = C[225] ^ C[226];
                byArray2[d.C[227] ^ d.C[228]] = C[229] ^ C[230];
                byArray2[d.C[231] ^ d.C[232]] = C[233] ^ C[234];
                byArray2[d.C[235] ^ d.C[236]] = C[237] ^ C[238];
                byArray2[d.C[239] ^ d.C[240]] = C[241] ^ C[242];
                byArray2[d.C[243] ^ d.C[244]] = C[245] ^ C[246];
                byArray2[d.C[247] ^ d.C[248]] = C[249] ^ C[250];
                byArray2[d.C[251] ^ d.C[252]] = C[253] ^ C[254];
                byArray2[d.C[255] ^ d.C[256]] = C[257] ^ C[258];
                byArray2[d.C[259] ^ d.C[260]] = C[261] ^ C[262];
                byArray2[d.C[263] ^ d.C[264]] = C[265] ^ C[266];
                byArray2[d.C[267] ^ d.C[268]] = C[269] ^ C[270];
                byArray2[d.C[271] ^ d.C[272]] = C[273] ^ C[274];
                byArray2[d.C[275] ^ d.C[276]] = C[277] ^ C[278];
                byArray2[d.C[279] ^ d.C[280]] = C[281] ^ C[282];
                byArray2[d.C[283] ^ d.C[284]] = C[285] ^ C[286];
                byArray2[d.C[287] ^ d.C[288]] = C[289] ^ C[290];
                byArray2[d.C[291] ^ d.C[292]] = C[293] ^ C[294];
                byArray2[d.C[295] ^ d.C[296]] = C[297] ^ C[298];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[299], byArray3, C[300], byArray.length);
                System.arraycopy(byArray2, C[301], byArray3, byArray.length, byArray2.length);
                Object object4 = d.A()[C[302]];
                if (object4 == null) {
                    char[] cArray = "\u27f1\u252b\u27ee\u2535\u251f\u251b\u27ea\u27cc\u27e5\u24f9\u2519\u27d0\u2414\u2416\u2406\u2519\u2534\u2524".toCharArray();
                    for (int i2 = C[303]; i2 < C[304]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= C[305];
                        n3 += C[306];
                        n3 ^= C[307];
                        n3 += C[308];
                        n3 ^= C[309];
                        n3 ^= C[310];
                        n3 ^= C[311];
                        n3 ^= C[312];
                        n3 ^= C[313];
                        n3 ^= C[314];
                        n3 -= C[315];
                        n3 += C[316];
                        cArray[i2] = (char)(n3 -= C[317]);
                    }
                    object4 = d.A()[d.C[318]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[319]];
                byArray4[d.C[320]] = C[321];
                byArray4[d.C[322]] = C[323];
                byArray4[d.C[324]] = C[325];
                byArray4[d.C[326]] = C[327];
                byArray4[d.C[328]] = C[329];
                byArray4[d.C[330]] = C[331];
                byArray4[d.C[332]] = C[333];
                byArray4[d.C[334]] = C[335];
                byArray4[d.C[336]] = C[337];
                byArray4[d.C[338]] = C[339];
                byArray4[d.C[340]] = C[341];
                byArray4[d.C[342]] = C[343];
                byArray4[d.C[344]] = C[345];
                byArray4[d.C[346]] = C[347];
                byArray4[d.C[348]] = C[349];
                byArray4[d.C[350]] = C[351];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[352], C[353]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = d.A()[C[354]];
                if (object5 == null) {
                    char[] cArray = "\ud539\ud535\ud58b".toCharArray();
                    for (int i3 = C[355]; i3 < C[356]; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= C[357];
                        n4 ^= C[358];
                        n4 += C[359];
                        n4 ^= C[360];
                        n4 += C[361];
                        n4 += C[362];
                        n4 -= C[363];
                        n4 -= C[364];
                        n4 -= C[365];
                        n4 ^= C[366];
                        n4 ^= C[367];
                        n4 ^= C[368];
                        cArray[i3] = (char)(n4 ^= C[369]);
                    }
                    object5 = d.A()[d.C[370]] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, C[371], C[372]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, C[373], byArray6.length);
            Object object6 = d.A()[C[374]];
            if (object6 == null) {
                char[] cArray = "\uc74b\uc73f\uc745\uc761\uc715\uc752\uc715\uc761\uc740\uc73d\uc715\uc745\uc74f\uc740\ud42b\ud3f4\ud3f4\ud3f3\ud41e\ud3f9".toCharArray();
                for (int i4 = C[375]; i4 < C[376]; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= C[377];
                    n5 -= C[378];
                    n5 -= C[379];
                    n5 ^= C[380];
                    n5 += C[381];
                    n5 += C[382];
                    n5 ^= C[383];
                    n5 ^= C[384];
                    n5 += C[385];
                    n5 += C[386];
                    n5 += C[387];
                    n5 ^= C[388];
                    cArray[i4] = (char)(n5 += C[389]);
                }
                object6 = d.A()[d.C[390]] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(C[391], (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[C[392]];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x93B9 ^ 0x9230];
        d.C[0x907C ^ 0x900D] = 0x137B ^ 0x900D;
        d.C[0xE0F0 ^ 0xE1B0] = 0xE1BA ^ 0xE1B0;
        d.C[0x9172 ^ 0x9115] = 0x41A4 ^ 0x9115;
        d.C[0x10DED ^ 0x10D3E] = 0x1108C ^ 0x10D3E;
        d.C[0x74A9 ^ 0x75F1] = 0x75F5 ^ 0x75F1;
        d.C[0x202F ^ 0x2121] = 0x1BC5 ^ 0x2121;
        d.C[0x8E23 ^ 0x8ED0] = 0xF545 ^ 0x8ED0;
        d.C[0xDB71 ^ 0xDA01] = 0x40BA ^ 0xDA01;
        d.C[0x8F15 ^ 0x8FFE] = 0x1889C ^ 0x8FFE;
        d.C[0xD64 ^ 0xD98] = 0x8C2D ^ 0xD98;
        d.C[0x503B ^ 0x5175] = 0x517A ^ 0x5175;
        d.C[0xE5E6 ^ 0xE5C4] = 0xAE98 ^ 0xE5C4;
        d.C[0xB25E ^ 0xB369] = 0x4259 ^ 0xB369;
        d.C[0xCB67 ^ 0xCB7B] = 0xAD7F ^ 0xCB7B;
        d.C[0xEAF8 ^ 0xEA8A] = 0xFFFF962E ^ 0xEA8A;
        d.C[0x1FBA ^ 0x1ED7] = 0x1C66 ^ 0x1ED7;
        d.C[0x6129 ^ 0x61D4] = 0xFFFF1F9F ^ 0x61D4;
        d.C[0x7629 ^ 0x7766] = 0x7775 ^ 0x7766;
        d.C[0x50C8 ^ 0x51DF] = 0x4E2B ^ 0x51DF;
        d.C[0xB41D ^ 0xB4E6] = 0x3559 ^ 0xB4E6;
        d.C[0xD4DC ^ 0xD5B0] = 0x4B1F ^ 0xD5B0;
        d.C[0x8A15 ^ 0x8B6A] = 0x9EBA ^ 0x8B6A;
        d.C[0x3AD ^ 0x324] = 0x961A ^ 0x324;
        d.C[0xAC0E ^ 0xACD3] = 0x1285 ^ 0xACD3;
        d.C[0x9C2A ^ 0x9CEE] = 0xCF40 ^ 0x9CEE;
        d.C[0xB892 ^ 0xB81D] = 0xC2DE ^ 0xB81D;
        d.C[0xE818 ^ 0xE938] = 0xBD38 ^ 0xE938;
        d.C[0x342B ^ 0x340C] = 0x3401 ^ 0x340C;
        d.C[0xC3B4 ^ 0xC2AD] = 0xDD37 ^ 0xC2AD;
        d.C[0x455B ^ 0x458B] = 0xCA16 ^ 0x458B;
        d.C[0xDE40 ^ 0xDE3F] = 0x3CE0 ^ 0xDE3F;
        d.C[0xAF1C ^ 0xAFED] = 0xFFFFBC01 ^ 0xAFED;
        d.C[0x292E ^ 0x283D] = 0x7B45 ^ 0x283D;
        d.C[0x4433 ^ 0x44B1] = 0xFD1F ^ 0x44B1;
        d.C[0x4A68 ^ 0x4B6D] = 0xFFFF9D76 ^ 0x4B6D;
        d.C[0x2C10 ^ 0x2C16] = 0x2C6C ^ 0x2C16;
        d.C[0x4EDB ^ 0x4E80] = 0xFFFFB162 ^ 0x4E80;
        d.C[0xE0CA ^ 0xE076] = 0x77E ^ 0xE076;
        d.C[0x9388 ^ 0x9290] = 0x8D6B ^ 0x9290;
        d.C[0x67B0 ^ 0x6704] = 0x5732 ^ 0x6704;
        d.C[0x1FE9 ^ 0x1F67] = 0xFFFF9A47 ^ 0x1F67;
        d.C[0x26D2 ^ 0x268C] = 0xFFFFD953 ^ 0x268C;
        d.C[0xDF36 ^ 0xDE13] = 0x1204 ^ 0xDE13;
        d.C[0xAF7 ^ 0xA11] = 0xE47F ^ 0xA11;
        d.C[0x20B7 ^ 0x21ED] = 0x21E4 ^ 0x21ED;
        d.C[0xCE52 ^ 0xCE2A] = 0xD248 ^ 0xCE2A;
        d.C[0x3B7A ^ 0x3BD6] = 0x825F ^ 0x3BD6;
        d.C[0xF8DC ^ 0xF845] = 0x3960 ^ 0xF845;
        d.C[0x7CE3 ^ 0x7D83] = 0x7D8B ^ 0x7D83;
        d.C[0xD44A ^ 0xD42E] = 0xD42F ^ 0xD42E;
        d.C[0x99E0 ^ 0x98C4] = 0x54BE ^ 0x98C4;
        d.C[0x437A ^ 0x4204] = 0x148A ^ 0x4204;
        d.C[0x421F ^ 0x439F] = 0xF0AF ^ 0x439F;
        d.C[0x612F ^ 0x6069] = 0x606A ^ 0x6069;
        d.C[0x5BBD ^ 0x5BB9] = 0xFFFFA400 ^ 0x5BB9;
        d.C[0xFCD4 ^ 0xFCA8] = 0x1E76 ^ 0xFCA8;
        d.C[0xB437 ^ 0xB444] = 0x3732 ^ 0xB444;
        d.C[0x4455 ^ 0x451C] = 0xFFFFBAE7 ^ 0x451C;
        d.C[0x8AB5 ^ 0x8A75] = 0x181BF ^ 0x8A75;
        d.C[0x1F5B ^ 0x1F1D] = 0x1F1F ^ 0x1F1D;
        d.C[0xE0F2 ^ 0xE1EF] = 0xBBE2 ^ 0xE1EF;
        d.C[0xF2C5 ^ 0xF3E9] = 0xF3E9 ^ 0xF3E9;
        d.C[0x5919 ^ 0x5933] = 0x592F ^ 0x5933;
        d.C[0xB183 ^ 0xB144] = 0x5646 ^ 0xB144;
        d.C[0x10F7D ^ 0x10E37] = 0x10E30 ^ 0x10E37;
        d.C[0x92D1 ^ 0x9257] = 0x1A6C ^ 0x9257;
        d.C[0x6256 ^ 0x634C] = 0x7CB7 ^ 0x634C;
        d.C[0x537C ^ 0x527E] = 0x946C ^ 0x527E;
        d.C[0x3118 ^ 0x3136] = 0x3171 ^ 0x3136;
        d.C[0x3D3F ^ 0x3C49] = 0x3C4A ^ 0x3C49;
        d.C[0xFC1A ^ 0xFCCB] = 0x7304 ^ 0xFCCB;
        d.C[0xF8AD ^ 0xF9AB] = 0xD007 ^ 0xF9AB;
        d.C[0x519D ^ 0x5111] = 0x2BD8 ^ 0x5111;
        d.C[0x5A98 ^ 0x5A55] = 0x2728 ^ 0x5A55;
        d.C[0x17FE ^ 0x179C] = 0x179C ^ 0x179C;
        d.C[0x6F9B ^ 0x6E97] = 0x5473 ^ 0x6E97;
        d.C[0x27E7 ^ 0x274E] = 0xDE00 ^ 0x274E;
        d.C[0x3B9B ^ 0x3AB6] = 0x3AB6 ^ 0x3AB6;
        d.C[0xB9AF ^ 0xB93E] = 0x646C ^ 0xB93E;
        d.C[0x32F7 ^ 0x32C6] = 0xFFFFCD6B ^ 0x32C6;
        d.C[0x21BF ^ 0x21A4] = 0xE977 ^ 0x21A4;
        d.C[0xB82D ^ 0xB8D9] = 0xC345 ^ 0xB8D9;
        d.C[0xE3CA ^ 0xE3AC] = 0x330D ^ 0xE3AC;
        d.C[0x227B ^ 0x2374] = 0xB12E ^ 0x2374;
        d.C[0x4780 ^ 0x46DE] = 0x46DB ^ 0x46DE;
        d.C[0xBD18 ^ 0xBD7D] = 0xBD7D ^ 0xBD7D;
        d.C[0xAA2C ^ 0xAA9D] = 0x5C8B ^ 0xAA9D;
        d.C[0x10C5 ^ 0x11E4] = 0x4580 ^ 0x11E4;
        d.C[0x4D0D ^ 0x4D7B] = 0xFFFFACB5 ^ 0x4D7B;
        d.C[0x81F ^ 0x895] = 0xFFFF625C ^ 0x895;
        d.C[0x704E ^ 0x70DC] = 0xAD86 ^ 0x70DC;
        d.C[0x47C ^ 0x474] = 0xFFFFFBAD ^ 0x474;
        d.C[0xE675 ^ 0xE69C] = 0x5E1C ^ 0xE69C;
        d.C[0x8ADB ^ 0x8B98] = 0x8BF0 ^ 0x8B98;
        d.C[0x28D ^ 0x39D] = 0x91D3 ^ 0x39D;
        d.C[0x3D74 ^ 0x3DB1] = 0xFFFF91A8 ^ 0x3DB1;
        d.C[0x107C8 ^ 0x107C2] = 0xFFFEF82D ^ 0x107C2;
        d.C[0x17BE ^ 0x175B] = 0xF950 ^ 0x175B;
        d.C[0x1120 ^ 0x11A0] = 0xA856 ^ 0x11A0;
        d.C[0xB546 ^ 0xB403] = 0xB410 ^ 0xB403;
        d.C[0x76A9 ^ 0x76B0] = 0x76E8 ^ 0x76B0;
        d.C[0x5C7A ^ 0x5CE2] = 0x9DC3 ^ 0x5CE2;
        d.C[0x6603 ^ 0x66C8] = 0x1BD4 ^ 0x66C8;
        d.C[0x4CFA ^ 0x4D89] = 0x4D89 ^ 0x4D89;
        d.C[0xE600 ^ 0xE63D] = 0xFFFF19DE ^ 0xE63D;
        d.C[0x576D ^ 0x578D] = 0x383E ^ 0x578D;
        d.C[0x1023F ^ 0x1024A] = 0x11C08 ^ 0x1024A;
        d.C[0x397C ^ 0x39DD] = 0xAD74 ^ 0x39DD;
        d.C[0x780E ^ 0x7879] = 0x663B ^ 0x7879;
        d.C[0x1FCB ^ 0x1E90] = 0x1EA4 ^ 0x1E90;
        d.C[0x9DEF ^ 0x9C8B] = 0x9C88 ^ 0x9C8B;
        d.C[0xA5C7 ^ 0xA543] = 0x2D43 ^ 0xA543;
        d.C[0xE5DD ^ 0xE4CC] = 0xFFFF893A ^ 0xE4CC;
        d.C[0x6BB4 ^ 0x6B2E] = 0xAA2E ^ 0x6B2E;
        d.C[0x29F0 ^ 0x28C0] = 0x28D2 ^ 0x28C0;
        d.C[0xDBFE ^ 0xDA85] = 0x5A0D ^ 0xDA85;
        d.C[0xE4CE ^ 0xE4A2] = 0x44F5 ^ 0xE4A2;
        d.C[0x8A40 ^ 0x8AD7] = 0x18EC4 ^ 0x8AD7;
        d.C[0x47E9 ^ 0x47B8] = 0x4786 ^ 0x47B8;
        d.C[0xBC80 ^ 0xBC5F] = 0xD3E1 ^ 0xBC5F;
        d.C[0xDF60 ^ 0xDF76] = 0xDF74 ^ 0xDF76;
        d.C[0xF637 ^ 0xF67C] = 0xF6C3 ^ 0xF67C;
        d.C[0xD3E8 ^ 0xD304] = 0x1D478 ^ 0xD304;
        d.C[0xD70F ^ 0xD702] = 0xD713 ^ 0xD702;
        d.C[0xFCED ^ 0xFDBE] = 0xFDDD ^ 0xFDBE;
        d.C[0x6EFA ^ 0x6EDE] = 0x24D3 ^ 0x6EDE;
        d.C[0x574E ^ 0x5766] = 0xFFFFA8DB ^ 0x5766;
        d.C[0xAA94 ^ 0xABBB] = 0xABBB ^ 0xABBB;
        d.C[0x6A87 ^ 0x6ABE] = 0x6A87 ^ 0x6ABE;
        d.C[0xF7A ^ 0xFC0] = 0x2D13 ^ 0xFC0;
        d.C[0xEA67 ^ 0xEAA5] = 0x1E16F ^ 0xEAA5;
        d.C[0xB4D4 ^ 0xB5D5] = 0x739E ^ 0xB5D5;
        d.C[0x3D0E ^ 0x3DF1] = 0xFBF0 ^ 0x3DF1;
        d.C[0xA009 ^ 0xA150] = 0xFFFF5E8D ^ 0xA150;
        d.C[0x10E24 ^ 0x10EF6] = 0x1816B ^ 0x10EF6;
        d.C[0x3349 ^ 0x331E] = 0x335D ^ 0x331E;
        d.C[0x12E0 ^ 0x1243] = 0x86EA ^ 0x1243;
        d.C[0x4A8F ^ 0x4AE4] = 0x6979 ^ 0x4AE4;
        d.C[0xFA79 ^ 0xFB43] = 0x9596 ^ 0xFB43;
        d.C[0x65D5 ^ 0x650C] = 0xC7C9 ^ 0x650C;
        d.C[0x1692 ^ 0x1682] = 0x16B0 ^ 0x1682;
        d.C[0xC70D ^ 0xC7B0] = 0xFFFFDF01 ^ 0xC7B0;
        d.C[0x95D7 ^ 0x9584] = 0xFFFF6A46 ^ 0x9584;
        d.C[0x1B0F ^ 0x1B2E] = 0x4445 ^ 0x1B2E;
        d.C[0xD6FB ^ 0xD633] = 0x313D ^ 0xD633;
        d.C[0xDAAE ^ 0xDAB3] = 0x5387 ^ 0xDAB3;
        d.C[0x104C ^ 0x113E] = 0x113C ^ 0x113E;
        d.C[0x10E6A ^ 0x10EAC] = 0x15D02 ^ 0x10EAC;
        d.C[0x3EBD ^ 0x3F85] = 0x10F7 ^ 0x3F85;
        d.C[0x45B8 ^ 0x44C4] = 0x4C2F ^ 0x44C4;
        d.C[0xA2 ^ 0xAC] = 0xFFFFFF30 ^ 0xAC;
        d.C[0x375C ^ 0x3624] = 0x3630 ^ 0x3624;
        d.C[0x1D9B ^ 0x1DD1] = 0x1DEF ^ 0x1DD1;
        d.C[0xC4D0 ^ 0xC451] = 0x7DA7 ^ 0xC451;
        d.C[0x28B4 ^ 0x285A] = 0x12F26 ^ 0x285A;
        d.C[0xAE35 ^ 0xAF7E] = 0xAF38 ^ 0xAF7E;
        d.C[0xE79B ^ 0xE75A] = 0xFFFE135A ^ 0xE75A;
        d.C[0xE926 ^ 0xE913] = 0xFFFF16B6 ^ 0xE913;
        d.C[0x94D ^ 0x9C5] = 0x9CF6 ^ 0x9C5;
        d.C[0x19FB ^ 0x1981] = 0x5E4 ^ 0x1981;
        d.C[0x633A ^ 0x6258] = 0x625A ^ 0x6258;
        d.C[0x75B ^ 0x7DC] = 0x8FD3 ^ 0x7DC;
        d.C[0x1B00 ^ 0x1A86] = 0x1A85 ^ 0x1A86;
        d.C[0xA8A8 ^ 0xA885] = 0xA8F6 ^ 0xA885;
        d.C[0xC921 ^ 0xC9B7] = 0xFFFE324A ^ 0xC9B7;
        d.C[0xF61D ^ 0xF6DE] = 0xA56D ^ 0xF6DE;
        d.C[0xA2E3 ^ 0xA3E8] = 0x991E ^ 0xA3E8;
        d.C[0x79AF ^ 0x7911] = 0x9E19 ^ 0x7911;
        d.C[0xF302 ^ 0xF206] = 0xDBAA ^ 0xF206;
        d.C[0x10E7E ^ 0x10EDA] = 0x187FF ^ 0x10EDA;
        d.C[0xF8F5 ^ 0xF972] = 0xF970 ^ 0xF972;
        d.C[0x6076 ^ 0x6002] = 0x7E45 ^ 0x6002;
        d.C[0x678A ^ 0x671F] = 0x1630C ^ 0x671F;
        d.C[0x9E40 ^ 0x9E1D] = 0xFFFF61EE ^ 0x9E1D;
        d.C[0xCACE ^ 0xCA77] = 0xFFFF1755 ^ 0xCA77;
        d.C[0x913A ^ 0x91B1] = 0x48F ^ 0x91B1;
        d.C[0x8479 ^ 0x8547] = 0x8546 ^ 0x8547;
        d.C[0xC62F ^ 0xC615] = 0xFFFF39AB ^ 0xC615;
        d.C[0xF941 ^ 0xF826] = 0x1A02 ^ 0xF826;
        d.C[0xFE00 ^ 0xFF6A] = 0x80E7 ^ 0xFF6A;
        d.C[0xF2E4 ^ 0xF24E] = 0xB20 ^ 0xF24E;
        d.C[0x92A2 ^ 0x9277] = 0x8F80 ^ 0x9277;
        d.C[0xFC41 ^ 0xFC7A] = 0xFFFF038C ^ 0xFC7A;
        d.C[0xF7B1 ^ 0xF7AF] = 0x9D7B ^ 0xF7AF;
        d.C[0xA7B ^ 0xA21] = 0xA41 ^ 0xA21;
        d.C[0x696B ^ 0x6933] = 0x6901 ^ 0x6933;
        d.C[0x1CE0 ^ 0x1C37] = 0xBEDC ^ 0x1C37;
        d.C[0xDE14 ^ 0xDE37] = 0xB3CA ^ 0xDE37;
        d.C[0xC76A ^ 0xC7DA] = 0x31FB ^ 0xC7DA;
        d.C[0xB1C3 ^ 0xB046] = 0x619D ^ 0xB046;
        d.C[0x7D3 ^ 0x6F5] = 0xCA8F ^ 0x6F5;
        d.C[0xEEFD ^ 0xEFE6] = 0xB5C2 ^ 0xEFE6;
        d.C[0x9E31 ^ 0x9E11] = 0xF779 ^ 0x9E11;
        d.C[0x7EF9 ^ 0x7FD2] = 0x7FD2 ^ 0x7FD2;
        d.C[0x2BD0 ^ 0x2AEC] = 0xD1F1 ^ 0x2AEC;
        d.C[0xEB0 ^ 0xEA1] = 0xEBB ^ 0xEA1;
        d.C[0xDF7A ^ 0xDFE4] = 0xFFFFA505 ^ 0xDFE4;
        d.C[0xBCE7 ^ 0xBDC5] = 0xE9C5 ^ 0xBDC5;
        d.C[0xF54E ^ 0xF5A9] = 0x4D36 ^ 0xF5A9;
        d.C[0x1001B ^ 0x1000F] = 0x1000E ^ 0x1000F;
        d.C[0xEF31 ^ 0xEE45] = 0xEE55 ^ 0xEE45;
        d.C[0xED21 ^ 0xEDB1] = 0x30EA ^ 0xEDB1;
        d.C[0xBD1C ^ 0xBD59] = 0xFFFF428E ^ 0xBD59;
        d.C[0x6F15 ^ 0x6E20] = 0x344D ^ 0x6E20;
        d.C[0x3790 ^ 0x374A] = 0x95BB ^ 0x374A;
        d.C[0x9083 ^ 0x91FA] = 0x8CFB ^ 0x91FA;
        d.C[0x45F4 ^ 0x45F3] = 0x45A3 ^ 0x45F3;
        d.C[0x6E2 ^ 0x6ED] = 0x6E5 ^ 0x6ED;
        d.C[0x5B38 ^ 0x5BE6] = 0xE5B8 ^ 0x5BE6;
        d.C[0xC609 ^ 0xC65D] = 0xFFFF39F9 ^ 0xC65D;
        d.C[0x1B4C ^ 0x1A58] = 0x4921 ^ 0x1A58;
        d.C[0x57CF ^ 0x56E6] = 0xFFFF909F ^ 0x56E6;
        d.C[0x7C4A ^ 0x7CED] = 0xF5C4 ^ 0x7CED;
        d.C[0xD29C ^ 0xD2D5] = 0xD2F8 ^ 0xD2D5;
        d.C[0x749C ^ 0x7471] = 0x1737E ^ 0x7471;
        d.C[0x4603 ^ 0x4686] = 0xCE89 ^ 0x4686;
        d.C[0xC1BD ^ 0xC118] = 0x4831 ^ 0xC118;
        d.C[0x81B5 ^ 0x8190] = 0x3C0F ^ 0x8190;
        d.C[0x44A7 ^ 0x44FE] = 0x44AB ^ 0x44FE;
        d.C[0xDBE2 ^ 0xDB15] = 0x29CA ^ 0xDB15;
        d.C[0x2E4E ^ 0x2F13] = 0xFFFFD0E6 ^ 0x2F13;
        d.C[0xDE45 ^ 0xDE75] = 0xDEEF ^ 0xDE75;
        d.C[0xB2D4 ^ 0xB2EC] = 0xB2E9 ^ 0xB2EC;
        d.C[0xD554 ^ 0xD47A] = 0xD47B ^ 0xD47A;
        d.C[0x36BE ^ 0x36D7] = 0x154A ^ 0x36D7;
        d.C[0x3999 ^ 0x39A7] = 0xFFFFC616 ^ 0x39A7;
        d.C[0x573E ^ 0x57CC] = 0xBBA8 ^ 0x57CC;
        d.C[0x770 ^ 0x779] = 0xFFFFF8B8 ^ 0x779;
        d.C[0x6479 ^ 0x643B] = 0x6401 ^ 0x643B;
        d.C[0xBCE7 ^ 0xBCF2] = 0xBCF2 ^ 0xBCF2;
        d.C[0xB5B3 ^ 0xB4C6] = 0xB4D6 ^ 0xB4C6;
        d.C[0xEC2C ^ 0xEC0A] = 0xEC0A ^ 0xEC0A;
        d.C[0x7D96 ^ 0x7DD7] = 0x7D9C ^ 0x7DD7;
        d.C[0xA2D0 ^ 0xA27B] = 0x1BED ^ 0xA27B;
        d.C[0xA61F ^ 0xA6A4] = 0x41AC ^ 0xA6A4;
        d.C[0xDC9C ^ 0xDC03] = 0x5911 ^ 0xDC03;
        d.C[0xBBC3 ^ 0xBBEC] = 0xBBE0 ^ 0xBBEC;
        d.C[0x70DE ^ 0x70E2] = 0xFFFF8F96 ^ 0x70E2;
        d.C[0x101F1 ^ 0x101F0] = 0x10188 ^ 0x101F0;
        d.C[0xCBA3 ^ 0xCAF3] = 0xCAF8 ^ 0xCAF3;
        d.C[0x4438 ^ 0x4458] = 0x4459 ^ 0x4458;
        d.C[0x7E86 ^ 0x7E4F] = 0x9915 ^ 0x7E4F;
        d.C[0x2A7D ^ 0x2AF0] = 0x5033 ^ 0x2AF0;
        d.C[0x5CC2 ^ 0x5C2D] = 0xB055 ^ 0x5C2D;
        d.C[0xDC36 ^ 0xDD5D] = 0xEE32 ^ 0xDD5D;
        d.C[0x4237 ^ 0x4225] = 0x4226 ^ 0x4225;
        d.C[0xAA7B ^ 0xAB37] = 0xAB3F ^ 0xAB37;
        d.C[0x1095E ^ 0x10802] = 0x10803 ^ 0x10802;
        d.C[0xEE3E ^ 0xEE29] = 0xEE29 ^ 0xEE29;
        d.C[0x7B99 ^ 0x7B9A] = 0xFFFF845D ^ 0x7B9A;
        d.C[0x30BC ^ 0x313D] = 0x886D ^ 0x313D;
        d.C[0x1228 ^ 0x1260] = 0x126F ^ 0x1260;
        d.C[0x100E3 ^ 0x10054] = 0x12281 ^ 0x10054;
        d.C[0x42 ^ 0xF1] = 0x30CC ^ 0xF1;
        d.C[0xF011 ^ 0xF00E] = 0x9969 ^ 0xF00E;
        d.C[0xCAB9 ^ 0xCAD7] = 0xFFFF956D ^ 0xCAD7;
        d.C[0x4768 ^ 0x475C] = 0x4726 ^ 0x475C;
        d.C[0x8033 ^ 0x80D2] = 0xEF1A ^ 0x80D2;
        d.C[0x36F4 ^ 0x364C] = 0x149F ^ 0x364C;
        d.C[0xC87B ^ 0xC83C] = 0xFFFF37F9 ^ 0xC83C;
        d.C[0x379B ^ 0x36DF] = 0x36DD ^ 0x36DF;
        d.C[0x29EF ^ 0x2991] = 0xFFFF34D3 ^ 0x2991;
        d.C[0x1E49 ^ 0x1F16] = 0x1F57 ^ 0x1F16;
        d.C[0xA8E9 ^ 0xA9F5] = 0xF3C4 ^ 0xA9F5;
        d.C[0xCB0C ^ 0xCB25] = 0xFFFF34F5 ^ 0xCB25;
        d.C[0x6FC0 ^ 0x6FF2] = 0x6FB4 ^ 0x6FF2;
        d.C[0x3A1E ^ 0x3AC8] = 0x276B ^ 0x3AC8;
        d.C[0xFB0C ^ 0xFA59] = 0xFFFF0593 ^ 0xFA59;
        d.C[0x2289 ^ 0x23A3] = 0x1A2D ^ 0x23A3;
        d.C[0xD0CA ^ 0xD1F9] = 0x570 ^ 0xD1F9;
        d.C[0xAD3A ^ 0xAD57] = 0xD0E ^ 0xAD57;
        d.C[0x10221 ^ 0x1033E] = 0x1572E ^ 0x1033E;
        d.C[0xAE5F ^ 0xAE74] = 0xFFFF51EC ^ 0xAE74;
        d.C[0x5D3D ^ 0x5D6D] = 0x5D13 ^ 0x5D6D;
        d.C[0xBCDE ^ 0xBDE5] = 0x6393 ^ 0xBDE5;
        d.C[0x8DF6 ^ 0x8CF1] = 0x9F1A ^ 0x8CF1;
        d.C[0x884 ^ 0x81F] = 0xC93A ^ 0x81F;
        d.C[0xE350 ^ 0xE305] = 0xE357 ^ 0xE305;
        d.C[0xE451 ^ 0xE4EE] = 0x1EF33 ^ 0xE4EE;
        d.C[0xA964 ^ 0xA819] = 0x34B5 ^ 0xA819;
        d.C[0xE9E1 ^ 0xE90B] = 0x5197 ^ 0xE90B;
        d.C[0x5A35 ^ 0x5B08] = 0x15D6 ^ 0x5B08;
        d.C[0x99D2 ^ 0x98CC] = 0xC2FD ^ 0x98CC;
        d.C[0xCE65 ^ 0xCE25] = 0xFFFF31EB ^ 0xCE25;
        d.C[0x421A ^ 0x42E2] = 0xB02B ^ 0x42E2;
        d.C[0x923A ^ 0x92A6] = 0x17B3 ^ 0x92A6;
        d.C[0x6E8D ^ 0x6E2D] = 0xFA8F ^ 0x6E2D;
        d.C[0xE29A ^ 0xE298] = 0xFFFF1D28 ^ 0xE298;
        d.C[0xF2DC ^ 0xF238] = 0x1C56 ^ 0xF238;
        d.C[0xBA2F ^ 0xBAD5] = 0x481C ^ 0xBAD5;
        d.C[0xD996 ^ 0xD8F3] = 0xA53 ^ 0xD8F3;
        d.C[0xE94C ^ 0xE82A] = 0xEA ^ 0xE82A;
        d.C[0x4F73 ^ 0x4E47] = 0xF2B ^ 0x4E47;
        d.C[0xC22F ^ 0xC270] = 0xFFFF3D84 ^ 0xC270;
        d.C[0xCA50 ^ 0xCB42] = 0x590C ^ 0xCB42;
        d.C[0x3BB ^ 0x3D8] = 0x3D9 ^ 0x3D8;
        d.C[0xCEAE ^ 0xCECF] = 0xCECD ^ 0xCECF;
        d.C[0xDA94 ^ 0xDBA2] = 0xEE6F ^ 0xDBA2;
        d.C[0x25F7 ^ 0x24CE] = 0x119D ^ 0x24CE;
        d.C[0x7047 ^ 0x704C] = 0x7062 ^ 0x704C;
        d.C[0xDFDF ^ 0xDE89] = 0xDE87 ^ 0xDE89;
        d.C[0xD153 ^ 0xD17F] = 0xFFFF2EEB ^ 0xD17F;
        d.C[0xE7CE ^ 0xE781] = 0xE784 ^ 0xE781;
        d.C[0xFE53 ^ 0xFF61] = 0x92E8 ^ 0xFF61;
        d.C[0xB1DC ^ 0xB1C4] = 0xB1C4 ^ 0xB1C4;
        d.C[0x1035 ^ 0x1080] = 0xFFFFDF47 ^ 0x1080;
        d.C[0x4D99 ^ 0x4C9A] = 0x653E ^ 0x4C9A;
        d.C[0xFCE1 ^ 0xFD8E] = 0xBDA ^ 0xFD8E;
        d.C[0x6D63 ^ 0x6D09] = 0x4EBC ^ 0x6D09;
        d.C[0xE14F ^ 0xE070] = 0xE060 ^ 0xE070;
        d.C[0xC26B ^ 0xC23D] = 0xFFFF3DEB ^ 0xC23D;
        d.C[0xE70E ^ 0xE761] = 0x4738 ^ 0xE761;
        d.C[0xDD0D ^ 0xDC6C] = 0xDD6C ^ 0xDC6C;
        d.C[0x8993 ^ 0x893C] = 0x7F06 ^ 0x893C;
        d.C[0x4DAA ^ 0x4D37] = 0xC825 ^ 0x4D37;
        d.C[0xE225 ^ 0xE2EA] = 0x6D6E ^ 0xE2EA;
        d.C[0xBB55 ^ 0xBB66] = 0xBB67 ^ 0xBB66;
        d.C[0xEF84 ^ 0xEF74] = 0x310 ^ 0xEF74;
        d.C[0x1C7 ^ 0x1F0] = 0xFFFFFE0B ^ 0x1F0;
        d.C[0x1011F ^ 0x1015B] = 0x10132 ^ 0x1015B;
        d.C[0xAD52 ^ 0xAC28] = 0x5F2A ^ 0xAC28;
        d.C[0x4753 ^ 0x4765] = 0x4773 ^ 0x4765;
        d.C[0xB7D4 ^ 0xB6F3] = 0x8F65 ^ 0xB6F3;
        d.C[0xECFF ^ 0xECB1] = 0xECEA ^ 0xECB1;
        d.C[0x9FC ^ 0x88D] = 0x9773 ^ 0x88D;
        d.C[0x2E4F ^ 0x2F67] = 0x16E9 ^ 0x2F67;
        d.C[0xFA26 ^ 0xFB2B] = 0xC1B4 ^ 0xFB2B;
        d.C[0x41F2 ^ 0x419A] = 0x6205 ^ 0x419A;
        d.C[0xE599 ^ 0xE557] = 0x984E ^ 0xE557;
        d.C[0x5DEE ^ 0x5CFB] = 0xF91 ^ 0x5CFB;
        d.C[0x8395 ^ 0x829D] = 0x9172 ^ 0x829D;
        d.C[0x10D2D ^ 0x10C2D] = 0x1CA3F ^ 0x10C2D;
        d.C[0x4401 ^ 0x44FF] = 0xC54A ^ 0x44FF;
        d.C[0x95B4 ^ 0x95B1] = 0x95BE ^ 0x95B1;
        d.C[0xE220 ^ 0xE311] = 0x1295 ^ 0xE311;
        d.C[0x99B7 ^ 0x99AD] = 0x3E5C ^ 0x99AD;
        d.C[0xED10 ^ 0xED5C] = 0xED0A ^ 0xED5C;
        d.C[0x6DAA ^ 0x6D95] = 0x6D92 ^ 0x6D95;
        d.C[0xE6C6 ^ 0xE797] = 0xFFFF187E ^ 0xE797;
        d.C[0x3D07 ^ 0x3D44] = 0xFFFFC2C9 ^ 0x3D44;
        d.C[0xB9D ^ 0xBE6] = 0x1782 ^ 0xBE6;
        d.C[0x1539 ^ 0x142F] = 0x4756 ^ 0x142F;
        d.C[0xD5BE ^ 0xD436] = 0xD432 ^ 0xD436;
        d.C[0xDA49 ^ 0xDA9D] = 0xC73E ^ 0xDA9D;
        d.C[0x6836 ^ 0x689E] = 0x689E ^ 0x689E;
        d.C[0xC9F8 ^ 0xC8BF] = 0xC8CF ^ 0xC8BF;
        d.C[0x4696 ^ 0x463B] = 0xFFFF0027 ^ 0x463B;
        d.C[0x9FAD ^ 0x9FF1] = 0x9FAF ^ 0x9FF1;
        d.C[0x7645 ^ 0x7635] = 0xF540 ^ 0x7635;
        d.C[0x645D ^ 0x64CE] = 0xB99C ^ 0x64CE;
        d.C[0x610E ^ 0x608D] = 0x94DB ^ 0x608D;
        d.C[0x5CE0 ^ 0x5D64] = 0x4F1E ^ 0x5D64;
        d.C[0xA7EA ^ 0xA797] = 0x4548 ^ 0xA797;
        d.C[0x7651 ^ 0x7603] = 0xFFFF89A7 ^ 0x7603;
        d.C[0x10A09 ^ 0x10B44] = 0x10B3D ^ 0x10B44;
        d.C[0x4A31 ^ 0x4AD3] = 0x2560 ^ 0x4AD3;
        d.C[0x2C80 ^ 0x2C76] = 0x57EA ^ 0x2C76;
        d.C[0x9464 ^ 0x9464] = 0xFFFF6B5E ^ 0x9464;
        d.C[0x8561 ^ 0x8468] = 0xFFFF681F ^ 0x8468;
        d.C[0x88F4 ^ 0x8983] = 0x8983 ^ 0x8983;
        d.C[0x3A7C ^ 0x3B34] = 0x3B34 ^ 0x3B34;
        d.C[0xAE9 ^ 0xA35] = 0xB46B ^ 0xA35;
        d.C[0x473B ^ 0x478D] = 0x77BB ^ 0x478D;
        d.C[0xE62D ^ 0xE6CE] = 0x8AE ^ 0xE6CE;
        d.C[0xFA3E ^ 0xFBBC] = 0xD4D ^ 0xFBBC;
        d.C[0xA3F ^ 0xB5C] = 0xB5C ^ 0xB5C;
        d.C[0x4D20 ^ 0x4DEA] = 0xAAE4 ^ 0x4DEA;
        d.C[0xEE7F ^ 0xEE86] = 0xFFFFE3CA ^ 0xEE86;
        d.C[0x17D4 ^ 0x17D8] = 0xFFFFE85F ^ 0x17D8;
        d.C[0x930E ^ 0x93AC] = 0xFFFFF8CA ^ 0x93AC;
        d.C[0x1AE6 ^ 0x1BA4] = 0x1BA8 ^ 0x1BA4;
        d.C[0xAD2B ^ 0xAD99] = 0x5BB8 ^ 0xAD99;
        d.C[0xA5F1 ^ 0xA55F] = 0x1CD6 ^ 0xA55F;
        d.C[0xCE8B ^ 0xCE53] = 0x6CA2 ^ 0xCE53;
        d.C[0x9F3 ^ 0x89B] = 0xEEFC ^ 0x89B;
        d.C[0xE9EE ^ 0xE922] = 0x943B ^ 0xE922;
        d.C[0x10AC8 ^ 0x10BC2] = 0x1182D ^ 0x10BC2;
        d.C[0x2F07 ^ 0x2F14] = 0x2F14 ^ 0x2F14;
        d.C[0x600 ^ 0x683] = 0xBF75 ^ 0x683;
        d.C[0x4609 ^ 0x46E1] = 0xFE7D ^ 0x46E1;
        d.C[0xB3F3 ^ 0xB328] = 0xD74 ^ 0xB328;
        d.C[0x7F28 ^ 0x7E46] = 0x9235 ^ 0x7E46;
        d.C[0x58C7 ^ 0x5853] = 0x15C48 ^ 0x5853;
        d.C[0x1001D ^ 0x1013E] = 0x1CD43 ^ 0x1013E;
        d.C[0xE238 ^ 0xE2CD] = 0x9907 ^ 0xE2CD;
        d.C[0xAAC7 ^ 0xAB86] = 0xAB86 ^ 0xAB86;
        d.C[0x1FF6 ^ 0x1F8F] = 0x3EB ^ 0x1F8F;
        d.C[0x688A ^ 0x69DD] = 0xFFFF9639 ^ 0x69DD;
        d.C[0x10514 ^ 0x105B2] = 0xFFFE7338 ^ 0x105B2;
        d.C[0xC3E4 ^ 0xC2B0] = 0xC2B6 ^ 0xC2B0;
        d.C[0x6314 ^ 0x6359] = 0x6310 ^ 0x6359;
        d.C[0xD2D7 ^ 0xD385] = 0xD388 ^ 0xD385;
        d.C[0x93B8 ^ 0x92D1] = 0xD89A ^ 0x92D1;
    }
}

