/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.color;

import java.awt.Color;
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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0007\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\nJ-\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\nR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"\u0004\b\u0016\u0010\nR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\nR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\n\u00a8\u0006\u001b"}, d2={"Lkotakbaz/rain/client/util/color/QuadColor;", "", "Ljava/awt/Color;", "color1", "color2", "color3", "color4", "<init>", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", "color", "(Ljava/awt/Color;)V", "", "set", "c1", "c2", "c3", "c4", "Ljava/awt/Color;", "getColor1", "()Ljava/awt/Color;", "setColor1", "getColor2", "setColor2", "getColor3", "setColor3", "getColor4", "setColor4", "rain-visuals"})
public final class A {
    @NotNull
    private Color a;
    @NotNull
    private Color A;
    @NotNull
    private Color b;
    @NotNull
    private Color B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    public A(@NotNull Color color, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4) {
        int n = E[0];
        n += E[1];
        Intrinsics.checkNotNullParameter(color, (String)c[n += E[2]]);
        int n2 = E[3];
        n2 ^= E[4];
        Intrinsics.checkNotNullParameter(color2, (String)c[n2 ^= E[5]]);
        int n3 = E[6];
        n3 ^= E[7];
        Intrinsics.checkNotNullParameter(color3, (String)c[n3 += E[8]]);
        int n4 = E[9];
        n4 += E[10];
        Intrinsics.checkNotNullParameter(color4, (String)c[n4 ^= E[11]]);
        super();
        this.a = color;
        this.A = color2;
        this.b = color3;
        this.B = color4;
    }

    @NotNull
    public final Color getColor1() {
        return this.a;
    }

    public final void setColor1(@NotNull Color color) {
        int n = E[12];
        n -= E[13];
        Intrinsics.checkNotNullParameter(color, (String)c[n ^= E[14]]);
        this.a = color;
    }

    @NotNull
    public final Color getColor2() {
        return this.A;
    }

    public final void setColor2(@NotNull Color color) {
        int n = E[15];
        n ^= E[16];
        Intrinsics.checkNotNullParameter(color, (String)c[n ^= E[17]]);
        this.A = color;
    }

    @NotNull
    public final Color getColor3() {
        return this.b;
    }

    public final void setColor3(@NotNull Color color) {
        int n = E[18];
        n += E[19];
        Intrinsics.checkNotNullParameter(color, (String)c[n -= E[20]]);
        this.b = color;
    }

    @NotNull
    public final Color getColor4() {
        return this.B;
    }

    public final void setColor4(@NotNull Color color) {
        int n = E[21];
        n -= E[22];
        Intrinsics.checkNotNullParameter(color, (String)c[n ^= E[23]]);
        this.B = color;
    }

    public A(@NotNull Color color) {
        int n = E[24];
        n ^= E[25];
        Intrinsics.checkNotNullParameter(color, (String)c[n += E[26]]);
        this(color, color, color, color);
    }

    public final void set(@NotNull Color color) {
        int n = E[27];
        n -= E[28];
        Intrinsics.checkNotNullParameter(color, (String)c[n ^= E[29]]);
        this.a = color;
        this.A = color;
        this.b = color;
        this.B = color;
    }

    public final void set(@NotNull Color color, @NotNull Color color2, @NotNull Color color3, @NotNull Color color4) {
        int n = E[30];
        n -= E[31];
        Intrinsics.checkNotNullParameter(color, (String)c[n ^= E[32]]);
        int n2 = E[33];
        n2 -= E[34];
        Intrinsics.checkNotNullParameter(color2, (String)c[n2 ^= E[35]]);
        int n3 = E[36];
        n3 += E[37];
        Intrinsics.checkNotNullParameter(color3, (String)c[n3 += E[38]]);
        int n4 = E[39];
        n4 ^= E[40];
        Intrinsics.checkNotNullParameter(color4, (String)c[n4 -= E[41]]);
        this.a = color;
        this.A = color2;
        this.b = color3;
        this.B = color4;
    }

    static {
        kotakbaz.rain.client.util.color.A.b();
        long l = 2061107383384447562L;
        long l2 = -964746608072056388L;
        long l3 = 6559026888471842418L;
        long l4 = 3739753943076823418L;
        long l5 = -9170295414962367095L;
        long l6 = 8146643629262616142L;
        long l7 = 6353825808686422641L;
        long l8 = -1529243932776528583L;
        long l9 = 2973383381999046702L;
        long l10 = -3351258995409147343L;
        long l11 = 8955629526210726109L;
        long l12 = -4402575176052381131L;
        long l13 = 7413609993995208677L;
        long l14 = 495766403865080481L;
        int n = E[42];
        n += E[43];
        c = new Object[n ^= E[44]];
        long l15 = l14;
        int n2 = E[45];
        n2 += E[46];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= E[47]);
        Object[] objectArray = new Object[E[48]];
        objectArray[kotakbaz.rain.client.util.color.A.E[49]] = C;
        objectArray[kotakbaz.rain.client.util.color.A.E[50]] = E[51];
        int n3 = E[52];
        Object object = kotakbaz.rain.client.util.color.A.A()[E[53]];
        if (object == null) {
            char[] cArray = "\uec8b\ue4f0\uec7a\ueca1\ue4fb\ue4f3\uecac\uec85\uec88\uec92\uecaf\ue4f1\uec8a\ue4e5\uec7a\ue4ef\uec81\uec86\uec84\ue4f2\uecb2\uec7a\ue4f1\ue4e5\uec8a\uec79\ueca1\uecad\uec97\uecab\uec95\uec99\ue4e5\uec79\ue4f0\uec79\uec74\ueca1\uec85\uec7a\uecab\uecb1\ue4f2\uec98\ue4e4\uec8b\ue4f2\uec96\uec81\ue4e4\uecaa\uec7a\ueca5\ueca5\uec92\uec90\uec86\uecaf\ue4ed\uec91\uec85\uecb6\ue4f3\uec74\uecaf\uecb2\ue4f1\uec7a\uecb6\ue4d9\uecb6\ueca1\uec75\uec84\uec80\uecb2\uec9f\uec91\uec90\uecaa\ue4f6\uecb6\uec84\uec74\uecaf\uec81\uecaa\uec80\uec78\uecb6\ueca0\ue4f2\uec90\uecad\ue4f2\uecb1\uecac\uec8d\ue4e5\uec88\uecb0\uec9e\uec8a\uec77\uec8a\uec80\uec74\uec7e\ue4d9\ue4ed\ue4ea\ue4f2\uec7f\uec75\ueca0\uecad\uec79\uec7e\uecb2\uec8c\uec92\uec84\ueca1\ueca6\uec94\uec81\uec8f\uecb2\uec9f\ue4f6\uec74\uec79\uecac\uecbb\uecac\ueca6\uec78\uecac\ue4d9\uec8c\uec94\ue4e5\uec97\uec85\uec75\uec99\uec9b\ue4f3\uecbb\ue4ed\uec92\uec96\ueca3\uec8c\uec84\uecb3\uec9e\uec9e\uec98\uec86\uecb6\ue4f3\uec93\uec78\uec8d\uec74\ue4e5\ue4ea\ue4f6\uec8d\uec99\uec67".toCharArray();
            for (int i = E[54]; i < E[55]; ++i) {
                int n4 = cArray[i];
                n4 -= E[56];
                n4 += E[57];
                n4 ^= E[58];
                n4 -= E[59];
                n4 ^= E[60];
                n4 ^= E[61];
                n4 -= E[62];
                n4 += E[63];
                n4 ^= E[64];
                n4 += E[65];
                n4 ^= E[66];
                n4 += E[67];
                cArray[i] = (char)(n4 += E[68]);
            }
            object = kotakbaz.rain.client.util.color.A.A()[kotakbaz.rain.client.util.color.A.E[69]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.color.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = E[70];
        n5 -= E[71];
        l5 = l16 ^ (0x6200000000L ^ l16) & -1L << (n5 += E[72]);
        long l17 = l12;
        int n6 = E[73];
        n6 -= E[74];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= E[75]);
        while (true) {
            int n7 = E[76];
            n7 ^= E[77];
            if ((int)l12 >= (int)(l5 >>> (n7 += E[78]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = E[79];
            n9 ^= E[80];
            int n10 = E[82];
            n10 -= E[83];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= E[81])) & -1L >>> (n10 ^= E[84]);
            long l19 = l8;
            int n11 = E[85];
            n11 -= E[86];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= E[87]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = E[88];
            n13 += E[89];
            int n14 = E[91];
            n14 ^= E[92];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= E[90])) & -1L >>> (n14 -= E[93]);
            int n15 = E[94];
            n15 ^= E[95];
            long l21 = l9;
            int n16 = E[97];
            n16 -= E[98];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= E[96]) ^ l21) & -1L << (n16 ^= E[99]);
            int n17 = E[100];
            n17 ^= E[101];
            n17 ^= E[102];
            int n18 = E[103];
            n18 += E[104];
            long l22 = l11;
            int n19 = E[106];
            n19 -= E[107];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += E[105]))) ^ l22) & -1L >>> (n19 ^= E[108]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = E[109];
            n20 ^= E[110];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= E[111]);
            while (true) {
                int n21 = E[112];
                n21 += E[113];
                if ((int)(l13 >>> (n21 += E[114])) >= (int)l11) break;
                int n22 = E[115];
                n22 -= E[116];
                int n23 = E[118];
                n23 -= E[119];
                cArray2[(int)(l13 >>> (n22 -= kotakbaz.rain.client.util.color.A.E[117]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= E[120]))];
                l13 += 0x100000000L;
            }
            int n24 = E[121];
            n24 ^= E[122];
            int n25 = (int)(l14 >>> (n24 += E[123]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.color.A.c[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = E[124];
            n26 ^= E[125];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= E[126]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[E[127]];
        String string = (String)object[E[128]];
        object = object[E[129]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[130]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[131]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[133] ^ E[134]];
                byArray[kotakbaz.rain.client.util.color.A.E[135] ^ kotakbaz.rain.client.util.color.A.E[136]] = E[137] ^ E[138];
                byArray[kotakbaz.rain.client.util.color.A.E[139] ^ kotakbaz.rain.client.util.color.A.E[140]] = E[141] ^ E[142];
                byArray[kotakbaz.rain.client.util.color.A.E[143] ^ kotakbaz.rain.client.util.color.A.E[144]] = E[145] ^ E[146];
                byArray[kotakbaz.rain.client.util.color.A.E[147] ^ kotakbaz.rain.client.util.color.A.E[148]] = E[149] ^ E[150];
                byArray[kotakbaz.rain.client.util.color.A.E[151] ^ kotakbaz.rain.client.util.color.A.E[152]] = E[153] ^ E[154];
                byArray[kotakbaz.rain.client.util.color.A.E[155] ^ kotakbaz.rain.client.util.color.A.E[156]] = E[157] ^ E[158];
                byArray[kotakbaz.rain.client.util.color.A.E[159] ^ kotakbaz.rain.client.util.color.A.E[160]] = E[161] ^ E[162];
                byArray[kotakbaz.rain.client.util.color.A.E[163] ^ kotakbaz.rain.client.util.color.A.E[164]] = E[165] ^ E[166];
                byArray[kotakbaz.rain.client.util.color.A.E[167] ^ kotakbaz.rain.client.util.color.A.E[168]] = E[169] ^ E[170];
                byArray[kotakbaz.rain.client.util.color.A.E[171] ^ kotakbaz.rain.client.util.color.A.E[172]] = E[173] ^ E[174];
                byArray[kotakbaz.rain.client.util.color.A.E[175] ^ kotakbaz.rain.client.util.color.A.E[176]] = E[177] ^ E[178];
                byArray[kotakbaz.rain.client.util.color.A.E[179] ^ kotakbaz.rain.client.util.color.A.E[180]] = E[181] ^ E[182];
                byArray[kotakbaz.rain.client.util.color.A.E[183] ^ kotakbaz.rain.client.util.color.A.E[184]] = E[185] ^ E[186];
                byArray[kotakbaz.rain.client.util.color.A.E[187] ^ kotakbaz.rain.client.util.color.A.E[188]] = E[189] ^ E[190];
                byArray[kotakbaz.rain.client.util.color.A.E[191] ^ kotakbaz.rain.client.util.color.A.E[192]] = E[193] ^ E[194];
                byArray[kotakbaz.rain.client.util.color.A.E[195] ^ kotakbaz.rain.client.util.color.A.E[196]] = E[197] ^ E[198];
                objectArray2[kotakbaz.rain.client.util.color.A.E[132]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[199]];
            if (d == null) {
                byte[] byArray2 = new byte[E[200] ^ E[201]];
                byArray2[kotakbaz.rain.client.util.color.A.E[202] ^ kotakbaz.rain.client.util.color.A.E[203]] = E[204] ^ E[205];
                byArray2[kotakbaz.rain.client.util.color.A.E[206] ^ kotakbaz.rain.client.util.color.A.E[207]] = E[208] ^ E[209];
                byArray2[kotakbaz.rain.client.util.color.A.E[210] ^ kotakbaz.rain.client.util.color.A.E[211]] = E[212] ^ E[213];
                byArray2[kotakbaz.rain.client.util.color.A.E[214] ^ kotakbaz.rain.client.util.color.A.E[215]] = E[216] ^ E[217];
                byArray2[kotakbaz.rain.client.util.color.A.E[218] ^ kotakbaz.rain.client.util.color.A.E[219]] = E[220] ^ E[221];
                byArray2[kotakbaz.rain.client.util.color.A.E[222] ^ kotakbaz.rain.client.util.color.A.E[223]] = E[224] ^ E[225];
                byArray2[kotakbaz.rain.client.util.color.A.E[226] ^ kotakbaz.rain.client.util.color.A.E[227]] = E[228] ^ E[229];
                byArray2[kotakbaz.rain.client.util.color.A.E[230] ^ kotakbaz.rain.client.util.color.A.E[231]] = E[232] ^ E[233];
                byArray2[kotakbaz.rain.client.util.color.A.E[234] ^ kotakbaz.rain.client.util.color.A.E[235]] = E[236] ^ E[237];
                byArray2[kotakbaz.rain.client.util.color.A.E[238] ^ kotakbaz.rain.client.util.color.A.E[239]] = E[240] ^ E[241];
                byArray2[kotakbaz.rain.client.util.color.A.E[242] ^ kotakbaz.rain.client.util.color.A.E[243]] = E[244] ^ E[245];
                byArray2[kotakbaz.rain.client.util.color.A.E[246] ^ kotakbaz.rain.client.util.color.A.E[247]] = E[248] ^ E[249];
                byArray2[kotakbaz.rain.client.util.color.A.E[250] ^ kotakbaz.rain.client.util.color.A.E[251]] = E[252] ^ E[253];
                byArray2[kotakbaz.rain.client.util.color.A.E[254] ^ kotakbaz.rain.client.util.color.A.E[255]] = E[256] ^ E[257];
                byArray2[kotakbaz.rain.client.util.color.A.E[258] ^ kotakbaz.rain.client.util.color.A.E[259]] = E[260] ^ E[261];
                byArray2[kotakbaz.rain.client.util.color.A.E[262] ^ kotakbaz.rain.client.util.color.A.E[263]] = E[264] ^ E[265];
                byArray2[kotakbaz.rain.client.util.color.A.E[266] ^ kotakbaz.rain.client.util.color.A.E[267]] = E[268] ^ E[269];
                byArray2[kotakbaz.rain.client.util.color.A.E[270] ^ kotakbaz.rain.client.util.color.A.E[271]] = E[272] ^ E[273];
                byArray2[kotakbaz.rain.client.util.color.A.E[274] ^ kotakbaz.rain.client.util.color.A.E[275]] = E[276] ^ E[277];
                byArray2[kotakbaz.rain.client.util.color.A.E[278] ^ kotakbaz.rain.client.util.color.A.E[279]] = E[280] ^ E[281];
                byArray2[kotakbaz.rain.client.util.color.A.E[282] ^ kotakbaz.rain.client.util.color.A.E[283]] = E[284] ^ E[285];
                byArray2[kotakbaz.rain.client.util.color.A.E[286] ^ kotakbaz.rain.client.util.color.A.E[287]] = E[288] ^ E[289];
                byArray2[kotakbaz.rain.client.util.color.A.E[290] ^ kotakbaz.rain.client.util.color.A.E[291]] = E[292] ^ E[293];
                byArray2[kotakbaz.rain.client.util.color.A.E[294] ^ kotakbaz.rain.client.util.color.A.E[295]] = E[296] ^ E[297];
                byArray2[kotakbaz.rain.client.util.color.A.E[298] ^ kotakbaz.rain.client.util.color.A.E[299]] = E[300] ^ E[301];
                byArray2[kotakbaz.rain.client.util.color.A.E[302] ^ kotakbaz.rain.client.util.color.A.E[303]] = E[304] ^ E[305];
                byArray2[kotakbaz.rain.client.util.color.A.E[306] ^ kotakbaz.rain.client.util.color.A.E[307]] = E[308] ^ E[309];
                byArray2[kotakbaz.rain.client.util.color.A.E[310] ^ kotakbaz.rain.client.util.color.A.E[311]] = E[312] ^ E[313];
                byArray2[kotakbaz.rain.client.util.color.A.E[314] ^ kotakbaz.rain.client.util.color.A.E[315]] = E[316] ^ E[317];
                byArray2[kotakbaz.rain.client.util.color.A.E[318] ^ kotakbaz.rain.client.util.color.A.E[319]] = E[320] ^ E[321];
                byArray2[kotakbaz.rain.client.util.color.A.E[322] ^ kotakbaz.rain.client.util.color.A.E[323]] = E[324] ^ E[325];
                byArray2[kotakbaz.rain.client.util.color.A.E[326] ^ kotakbaz.rain.client.util.color.A.E[327]] = E[328] ^ E[329];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, E[330], byArray3, E[331], byArray.length);
                System.arraycopy(byArray2, E[332], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.color.A.A()[E[333]];
                if (object4 == null) {
                    char[] cArray = "\uc881\uc8b3\uc88a\uc8ad\uc8af\uc8e3\uc87e\uc8a8\uc89d\uc8a9\uc889\uc8a4\uc8d0\uc8d2\uc882\uc889\uc8b0\uc8e0".toCharArray();
                    for (int i = E[334]; i < E[335]; ++i) {
                        int n2 = cArray[i];
                        n2 -= E[336];
                        n2 -= E[337];
                        n2 -= E[338];
                        n2 -= E[339];
                        n2 += E[340];
                        n2 += E[341];
                        n2 -= E[342];
                        n2 += E[343];
                        n2 -= E[344];
                        n2 -= E[345];
                        n2 ^= E[346];
                        n2 += E[347];
                        n2 ^= E[348];
                        n2 ^= E[349];
                        cArray[i] = (char)(n2 ^= E[350]);
                    }
                    object4 = kotakbaz.rain.client.util.color.A.A()[kotakbaz.rain.client.util.color.A.E[351]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[E[352]];
                byArray4[kotakbaz.rain.client.util.color.A.E[353]] = E[354];
                byArray4[kotakbaz.rain.client.util.color.A.E[355]] = E[356];
                byArray4[kotakbaz.rain.client.util.color.A.E[357]] = E[358];
                byArray4[kotakbaz.rain.client.util.color.A.E[359]] = E[360];
                byArray4[kotakbaz.rain.client.util.color.A.E[361]] = E[362];
                byArray4[kotakbaz.rain.client.util.color.A.E[363]] = E[364];
                byArray4[kotakbaz.rain.client.util.color.A.E[365]] = E[366];
                byArray4[kotakbaz.rain.client.util.color.A.E[367]] = E[368];
                byArray4[kotakbaz.rain.client.util.color.A.E[369]] = E[370];
                byArray4[kotakbaz.rain.client.util.color.A.E[371]] = E[372];
                byArray4[kotakbaz.rain.client.util.color.A.E[373]] = E[374];
                byArray4[kotakbaz.rain.client.util.color.A.E[375]] = E[376];
                byArray4[kotakbaz.rain.client.util.color.A.E[377]] = E[378];
                byArray4[kotakbaz.rain.client.util.color.A.E[379]] = E[380];
                byArray4[kotakbaz.rain.client.util.color.A.E[381]] = E[382];
                byArray4[kotakbaz.rain.client.util.color.A.E[383]] = E[384];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, E[385], E[386]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.color.A.A()[E[387]];
                if (object5 == null) {
                    char[] cArray = "\u96cc\ua900\ua8fa".toCharArray();
                    for (int i = E[388]; i < E[389]; ++i) {
                        int n3 = cArray[i];
                        n3 += E[390];
                        n3 -= E[391];
                        n3 -= E[392];
                        n3 -= E[393];
                        n3 ^= E[394];
                        n3 ^= E[395];
                        n3 ^= E[396];
                        n3 += E[397];
                        n3 += E[398];
                        n3 += E[399];
                        n3 ^= 0x62B6;
                        n3 -= 64919;
                        n3 ^= 0xFE98;
                        n3 += 33306;
                        cArray[i] = (char)(n3 ^= 0xBABC);
                    }
                    object5 = kotakbaz.rain.client.util.color.A.A()[2] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.util.color.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\ub4ee\ub4c2\ub4c0\ub60c\ub4f0\ub4f1\ub4f0\ub60c\ub4bf\ub4b8\ub4f0\ub4c0\ub672\ub4bf\ub4ce\ub523\ub523\ub516\ub4cd\ub524".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 += 39616;
                    n4 += 14533;
                    n4 += 26151;
                    n4 += 55207;
                    n4 -= 42504;
                    n4 ^= 0xD12F;
                    n4 -= 18771;
                    n4 ^= 0x95B5;
                    n4 += 21525;
                    n4 -= 822;
                    n4 += 63033;
                    n4 -= 53754;
                    n4 -= 14170;
                    cArray[i] = (char)(n4 ^= 0x707B);
                }
                object6 = kotakbaz.rain.client.util.color.A.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)d), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = e;
        if (e == null) {
            e = new Object[4];
            objectArray = e;
        }
        return objectArray;
    }

    public static void b() {
        E = new int[0x39B6 ^ 0x3826];
        kotakbaz.rain.client.util.color.A.E[0x8737 ^ 0x87AE] = 0x92A7 ^ 0x87AE;
        kotakbaz.rain.client.util.color.A.E[0xE83C ^ 0xE94A] = 0xE95D ^ 0xE94A;
        kotakbaz.rain.client.util.color.A.E[0xF86B ^ 0xF881] = 0x4188 ^ 0xF881;
        kotakbaz.rain.client.util.color.A.E[0xC0F7 ^ 0xC02C] = 0xBDF9 ^ 0xC02C;
        kotakbaz.rain.client.util.color.A.E[0x10CBB ^ 0x10DE7] = 0x17E3F ^ 0x10DE7;
        kotakbaz.rain.client.util.color.A.E[0xB216 ^ 0xB347] = 0xC867 ^ 0xB347;
        kotakbaz.rain.client.util.color.A.E[0x3216 ^ 0x32D2] = 0xAD2C ^ 0x32D2;
        kotakbaz.rain.client.util.color.A.E[0x343B ^ 0x3486] = 0xFFFF7AD5 ^ 0x3486;
        kotakbaz.rain.client.util.color.A.E[0x710A ^ 0x71C5] = 0x48D7 ^ 0x71C5;
        kotakbaz.rain.client.util.color.A.E[0x3D7C ^ 0x3D8B] = 0x64DC ^ 0x3D8B;
        kotakbaz.rain.client.util.color.A.E[0x2452 ^ 0x256B] = 0xDD5 ^ 0x256B;
        kotakbaz.rain.client.util.color.A.E[0x8662 ^ 0x8640] = 0x8663 ^ 0x8640;
        kotakbaz.rain.client.util.color.A.E[0x83E4 ^ 0x82E0] = 0xFFFF233C ^ 0x82E0;
        kotakbaz.rain.client.util.color.A.E[0xB374 ^ 0xB224] = 0xF8A4 ^ 0xB224;
        kotakbaz.rain.client.util.color.A.E[0xD97C ^ 0xD801] = 0xD80E ^ 0xD801;
        kotakbaz.rain.client.util.color.A.E[0x4EBC ^ 0x4EA0] = 0xFFFFB167 ^ 0x4EA0;
        kotakbaz.rain.client.util.color.A.E[0x529A ^ 0x53AB] = 0x4C6 ^ 0x53AB;
        kotakbaz.rain.client.util.color.A.E[0xDF00 ^ 0xDF83] = 0xDF82 ^ 0xDF83;
        kotakbaz.rain.client.util.color.A.E[0x10B88 ^ 0x10B95] = 0xFFFEF476 ^ 0x10B95;
        kotakbaz.rain.client.util.color.A.E[0x7802 ^ 0x7914] = 0x4684 ^ 0x7914;
        kotakbaz.rain.client.util.color.A.E[0xC3F9 ^ 0xC3ED] = 0xC3DA ^ 0xC3ED;
        kotakbaz.rain.client.util.color.A.E[0x662E ^ 0x67AA] = 0x67AA ^ 0x67AA;
        kotakbaz.rain.client.util.color.A.E[0xE208 ^ 0xE377] = 0xE37A ^ 0xE377;
        kotakbaz.rain.client.util.color.A.E[0x595 ^ 0x5DA] = 0x5A3 ^ 0x5DA;
        kotakbaz.rain.client.util.color.A.E[0x18C6 ^ 0x19EE] = 0x22E4 ^ 0x19EE;
        kotakbaz.rain.client.util.color.A.E[0x2259 ^ 0x22A2] = 0xAC71 ^ 0x22A2;
        kotakbaz.rain.client.util.color.A.E[0x6BCA ^ 0x6B34] = 0x3AC6 ^ 0x6B34;
        kotakbaz.rain.client.util.color.A.E[0xB132 ^ 0xB137] = 0xB11B ^ 0xB137;
        kotakbaz.rain.client.util.color.A.E[0x2E6B ^ 0x2E73] = 0xFFFFD1CD ^ 0x2E73;
        kotakbaz.rain.client.util.color.A.E[0x5988 ^ 0x5969] = 0x342A ^ 0x5969;
        kotakbaz.rain.client.util.color.A.E[0x1040F ^ 0x104B3] = 0x1B562 ^ 0x104B3;
        kotakbaz.rain.client.util.color.A.E[0x1E0F ^ 0x1E7B] = 0x1E21 ^ 0x1E7B;
        kotakbaz.rain.client.util.color.A.E[0x2BFC ^ 0x2B42] = 0x9A93 ^ 0x2B42;
        kotakbaz.rain.client.util.color.A.E[0xB8CF ^ 0xB9B7] = 0xB98F ^ 0xB9B7;
        kotakbaz.rain.client.util.color.A.E[0xC960 ^ 0xC8E9] = 0x6DC0 ^ 0xC8E9;
        kotakbaz.rain.client.util.color.A.E[0x3AB5 ^ 0x3A74] = 0xFFFF4EBF ^ 0x3A74;
        kotakbaz.rain.client.util.color.A.E[0x15D0 ^ 0x15C2] = 0xFFFFEA31 ^ 0x15C2;
        kotakbaz.rain.client.util.color.A.E[0xEDBE ^ 0xECDC] = 0xECD7 ^ 0xECDC;
        kotakbaz.rain.client.util.color.A.E[0xB930 ^ 0xB998] = 0x7A48 ^ 0xB998;
        kotakbaz.rain.client.util.color.A.E[0xFD5E ^ 0xFC53] = 0xF91F ^ 0xFC53;
        kotakbaz.rain.client.util.color.A.E[0x10943 ^ 0x109DC] = 0x452 ^ 0x109DC;
        kotakbaz.rain.client.util.color.A.E[0x3829 ^ 0x3873] = 0xFFFFC784 ^ 0x3873;
        kotakbaz.rain.client.util.color.A.E[0x32C4 ^ 0x3276] = 0x4776 ^ 0x3276;
        kotakbaz.rain.client.util.color.A.E[0x90FA ^ 0x91DF] = 0x6408 ^ 0x91DF;
        kotakbaz.rain.client.util.color.A.E[0xA37F ^ 0xA239] = 0xB705 ^ 0xA239;
        kotakbaz.rain.client.util.color.A.E[0xCD48 ^ 0xCCC6] = 0x68C9 ^ 0xCCC6;
        kotakbaz.rain.client.util.color.A.E[0xC7B4 ^ 0xC7F0] = 0xE6EF ^ 0xC7F0;
        kotakbaz.rain.client.util.color.A.E[0x9F4 ^ 0x950] = 0x10A47 ^ 0x950;
        kotakbaz.rain.client.util.color.A.E[0x682E ^ 0x6957] = 0x6955 ^ 0x6957;
        kotakbaz.rain.client.util.color.A.E[0x7148 ^ 0x7149] = 0x7138 ^ 0x7149;
        kotakbaz.rain.client.util.color.A.E[0x242B ^ 0x24CD] = 0xA584 ^ 0x24CD;
        kotakbaz.rain.client.util.color.A.E[0x8F57 ^ 0x8F57] = 0xFFFF7038 ^ 0x8F57;
        kotakbaz.rain.client.util.color.A.E[0x8ECD ^ 0x8E39] = 0xECE7 ^ 0x8E39;
        kotakbaz.rain.client.util.color.A.E[0x8107 ^ 0x81E8] = 0x1B6C ^ 0x81E8;
        kotakbaz.rain.client.util.color.A.E[0x33A3 ^ 0x33E9] = 0xFFFFCC16 ^ 0x33E9;
        kotakbaz.rain.client.util.color.A.E[0x9BFF ^ 0x9A91] = 0xFFFF6556 ^ 0x9A91;
        kotakbaz.rain.client.util.color.A.E[0x4319 ^ 0x435A] = 0x5444 ^ 0x435A;
        kotakbaz.rain.client.util.color.A.E[0x75C4 ^ 0x7571] = 0xFFFFB543 ^ 0x7571;
        kotakbaz.rain.client.util.color.A.E[0x4E7E ^ 0x4E77] = 0xFFFFB1D9 ^ 0x4E77;
        kotakbaz.rain.client.util.color.A.E[0x104A3 ^ 0x105B0] = 0x13214 ^ 0x105B0;
        kotakbaz.rain.client.util.color.A.E[0xFB39 ^ 0xFAB4] = 0xEB3A ^ 0xFAB4;
        kotakbaz.rain.client.util.color.A.E[0x10DE5 ^ 0x10DE9] = 0x10D95 ^ 0x10DE9;
        kotakbaz.rain.client.util.color.A.E[0x32C0 ^ 0x3292] = 0x32EB ^ 0x3292;
        kotakbaz.rain.client.util.color.A.E[0x2ED ^ 0x244] = 0xFFFF3E1B ^ 0x244;
        kotakbaz.rain.client.util.color.A.E[0xCAFC ^ 0xCBD8] = 0xFFFFC1DE ^ 0xCBD8;
        kotakbaz.rain.client.util.color.A.E[0x7C39 ^ 0x7C62] = 0xFFFF83AB ^ 0x7C62;
        kotakbaz.rain.client.util.color.A.E[0x3FDC ^ 0x3EB4] = 0x3E99 ^ 0x3EB4;
        kotakbaz.rain.client.util.color.A.E[0xFE74 ^ 0xFE02] = 0xFFFF014F ^ 0xFE02;
        kotakbaz.rain.client.util.color.A.E[0x2D51 ^ 0x2C34] = 0x2C3E ^ 0x2C34;
        kotakbaz.rain.client.util.color.A.E[0x600 ^ 0x657] = 0xFFFFF9DE ^ 0x657;
        kotakbaz.rain.client.util.color.A.E[0x2FEF ^ 0x2FA1] = 0x2FA4 ^ 0x2FA1;
        kotakbaz.rain.client.util.color.A.E[0x5CAC ^ 0x5C66] = 0xD906 ^ 0x5C66;
        kotakbaz.rain.client.util.color.A.E[0xA0BD ^ 0xA0C6] = 0xFFFF5F1D ^ 0xA0C6;
        kotakbaz.rain.client.util.color.A.E[0xA00A ^ 0xA043] = 0xA00E ^ 0xA043;
        kotakbaz.rain.client.util.color.A.E[0x105F7 ^ 0x1050B] = 0xFFFE7461 ^ 0x1050B;
        kotakbaz.rain.client.util.color.A.E[0xF94A ^ 0xF872] = 0xD0A6 ^ 0xF872;
        kotakbaz.rain.client.util.color.A.E[0xEBC4 ^ 0xEB89] = 0xEBBB ^ 0xEB89;
        kotakbaz.rain.client.util.color.A.E[0xF7C4 ^ 0xF6A8] = 0xFFFF097B ^ 0xF6A8;
        kotakbaz.rain.client.util.color.A.E[0x10385 ^ 0x103AC] = 0x103EB ^ 0x103AC;
        kotakbaz.rain.client.util.color.A.E[0x51B6 ^ 0x503E] = 0x38D9 ^ 0x503E;
        kotakbaz.rain.client.util.color.A.E[0xCE34 ^ 0xCEBA] = 0x7D92 ^ 0xCEBA;
        kotakbaz.rain.client.util.color.A.E[0xE98F ^ 0xE89B] = 0xDF4A ^ 0xE89B;
        kotakbaz.rain.client.util.color.A.E[0xEE44 ^ 0xEE11] = 0xFFFF1142 ^ 0xEE11;
        kotakbaz.rain.client.util.color.A.E[0xE3F1 ^ 0xE2DF] = 0xB5B5 ^ 0xE2DF;
        kotakbaz.rain.client.util.color.A.E[0xF7DE ^ 0xF6E9] = 0xDE57 ^ 0xF6E9;
        kotakbaz.rain.client.util.color.A.E[0x96A2 ^ 0x97CD] = 0x97C1 ^ 0x97CD;
        kotakbaz.rain.client.util.color.A.E[0x1063E ^ 0x1061D] = 0xFFFEF9C5 ^ 0x1061D;
        kotakbaz.rain.client.util.color.A.E[0xCA8A ^ 0xCA29] = 0x1C936 ^ 0xCA29;
        kotakbaz.rain.client.util.color.A.E[0x4CB4 ^ 0x4DD5] = 0x4DD0 ^ 0x4DD5;
        kotakbaz.rain.client.util.color.A.E[0xF127 ^ 0xF02B] = 0xF514 ^ 0xF02B;
        kotakbaz.rain.client.util.color.A.E[0xB193 ^ 0xB13D] = 0x1B27C ^ 0xB13D;
        kotakbaz.rain.client.util.color.A.E[0x6250 ^ 0x62B0] = 0xFFFFF066 ^ 0x62B0;
        kotakbaz.rain.client.util.color.A.E[0x582A ^ 0x58DC] = 0x192 ^ 0x58DC;
        kotakbaz.rain.client.util.color.A.E[0x879B ^ 0x87C2] = 0xFFFF782C ^ 0x87C2;
        kotakbaz.rain.client.util.color.A.E[0xE1C7 ^ 0xE1E0] = 0xE18D ^ 0xE1E0;
        kotakbaz.rain.client.util.color.A.E[0xC6AF ^ 0xC685] = 0xFFFF392D ^ 0xC685;
        kotakbaz.rain.client.util.color.A.E[0x3450 ^ 0x3469] = 0x608B ^ 0x3469;
        kotakbaz.rain.client.util.color.A.E[0xC939 ^ 0xC83B] = 0x9665 ^ 0xC83B;
        kotakbaz.rain.client.util.color.A.E[0x9FC6 ^ 0x9F4D] = 0x2C61 ^ 0x9F4D;
        kotakbaz.rain.client.util.color.A.E[0x82BD ^ 0x8210] = 0x18103 ^ 0x8210;
        kotakbaz.rain.client.util.color.A.E[0xF13F ^ 0xF076] = 0xE545 ^ 0xF076;
        kotakbaz.rain.client.util.color.A.E[0xD219 ^ 0xD273] = 0xFFFF2DF4 ^ 0xD273;
        kotakbaz.rain.client.util.color.A.E[0x1FCE ^ 0x1FE1] = 0x1FAB ^ 0x1FE1;
        kotakbaz.rain.client.util.color.A.E[0xA359 ^ 0xA374] = 0xFFFF5C8E ^ 0xA374;
        kotakbaz.rain.client.util.color.A.E[0x10B0B ^ 0x10A29] = 0x1FFFD ^ 0x10A29;
        kotakbaz.rain.client.util.color.A.E[0xECDD ^ 0xEC45] = 0xF97E ^ 0xEC45;
        kotakbaz.rain.client.util.color.A.E[0xAE01 ^ 0xAE0C] = 0xAE51 ^ 0xAE0C;
        kotakbaz.rain.client.util.color.A.E[0x7D03 ^ 0x7C67] = 0xFFFF83B6 ^ 0x7C67;
        kotakbaz.rain.client.util.color.A.E[0x33F4 ^ 0x336A] = 0xFEE3 ^ 0x336A;
        kotakbaz.rain.client.util.color.A.E[0xD328 ^ 0xD38A] = 0x1DE0F ^ 0xD38A;
        kotakbaz.rain.client.util.color.A.E[0x595E ^ 0x580D] = 0x7B49 ^ 0x580D;
        kotakbaz.rain.client.util.color.A.E[0x1053D ^ 0x10554] = 0xFFFEFAC6 ^ 0x10554;
        kotakbaz.rain.client.util.color.A.E[0x3DEE ^ 0x3D00] = 0xA796 ^ 0x3D00;
        kotakbaz.rain.client.util.color.A.E[0xC2CC ^ 0xC346] = 0x7D6F ^ 0xC346;
        kotakbaz.rain.client.util.color.A.E[0xD351 ^ 0xD380] = 0xEA92 ^ 0xD380;
        kotakbaz.rain.client.util.color.A.E[0xF979 ^ 0xF9BB] = 0x72D6 ^ 0xF9BB;
        kotakbaz.rain.client.util.color.A.E[0xB853 ^ 0xB8B8] = 0x1B4 ^ 0xB8B8;
        kotakbaz.rain.client.util.color.A.E[0x292F ^ 0x2944] = 0xFFFFD693 ^ 0x2944;
        kotakbaz.rain.client.util.color.A.E[0xEB37 ^ 0xEA51] = 0xEA19 ^ 0xEA51;
        kotakbaz.rain.client.util.color.A.E[0xEE20 ^ 0xEE0C] = 0xFFFF119F ^ 0xEE0C;
        kotakbaz.rain.client.util.color.A.E[0x2D90 ^ 0x2D3A] = 0xEEEA ^ 0x2D3A;
        kotakbaz.rain.client.util.color.A.E[0x6E7D ^ 0x6EAF] = 0x3137 ^ 0x6EAF;
        kotakbaz.rain.client.util.color.A.E[0xD3B8 ^ 0xD2FD] = 0x1D615 ^ 0xD2FD;
        kotakbaz.rain.client.util.color.A.E[0x1081D ^ 0x10822] = 0x123CE ^ 0x10822;
        kotakbaz.rain.client.util.color.A.E[0x3301 ^ 0x3386] = 0x2581 ^ 0x3386;
        kotakbaz.rain.client.util.color.A.E[0xEFAB ^ 0xEEEA] = 0xA35B ^ 0xEEEA;
        kotakbaz.rain.client.util.color.A.E[0x9D06 ^ 0x9D64] = 0xFFFF62A9 ^ 0x9D64;
        kotakbaz.rain.client.util.color.A.E[0x6ECE ^ 0x6E23] = 0xD72F ^ 0x6E23;
        kotakbaz.rain.client.util.color.A.E[0x8FE ^ 0x9E2] = 0xFFFF7930 ^ 0x9E2;
        kotakbaz.rain.client.util.color.A.E[0xDA49 ^ 0xDA16] = 0xDA27 ^ 0xDA16;
        kotakbaz.rain.client.util.color.A.E[0x61DF ^ 0x61D5] = 0xFFFF9E28 ^ 0x61D5;
        kotakbaz.rain.client.util.color.A.E[0x10E6C ^ 0x10F22] = 0x10F22 ^ 0x10F22;
        kotakbaz.rain.client.util.color.A.E[0x4F69 ^ 0x4F78] = 0x4F17 ^ 0x4F78;
        kotakbaz.rain.client.util.color.A.E[0x89C0 ^ 0x898B] = 0x89A5 ^ 0x898B;
        kotakbaz.rain.client.util.color.A.E[0x193D ^ 0x1975] = 0xFFFFE6B5 ^ 0x1975;
        kotakbaz.rain.client.util.color.A.E[0x392B ^ 0x385A] = 0x3852 ^ 0x385A;
        kotakbaz.rain.client.util.color.A.E[0x984E ^ 0x98D4] = 0x8DEF ^ 0x98D4;
        kotakbaz.rain.client.util.color.A.E[0xBB2 ^ 0xB30] = 0xB31 ^ 0xB30;
        kotakbaz.rain.client.util.color.A.E[0x43 ^ 0xF8] = 0xB126 ^ 0xF8;
        kotakbaz.rain.client.util.color.A.E[0x87B0 ^ 0x8743] = 0xE5DE ^ 0x8743;
        kotakbaz.rain.client.util.color.A.E[0x10E11 ^ 0x10ECD] = 0x17323 ^ 0x10ECD;
        kotakbaz.rain.client.util.color.A.E[0x46E9 ^ 0x46EF] = 0x46FC ^ 0x46EF;
        kotakbaz.rain.client.util.color.A.E[0x197E ^ 0x186C] = 0x2FD8 ^ 0x186C;
        kotakbaz.rain.client.util.color.A.E[0x9BA0 ^ 0x9BD2] = 0xFFFF6462 ^ 0x9BD2;
        kotakbaz.rain.client.util.color.A.E[0x10A03 ^ 0x10A3F] = 0x1EA18 ^ 0x10A3F;
        kotakbaz.rain.client.util.color.A.E[0xEC2C ^ 0xECEA] = 0x7314 ^ 0xECEA;
        kotakbaz.rain.client.util.color.A.E[0x9021 ^ 0x907D] = 0x904D ^ 0x907D;
        kotakbaz.rain.client.util.color.A.E[0xE078 ^ 0xE0ED] = 0xFFFF9DEB ^ 0xE0ED;
        kotakbaz.rain.client.util.color.A.E[0x3BF3 ^ 0x3B58] = 0x1381A ^ 0x3B58;
        kotakbaz.rain.client.util.color.A.E[0x2F7B ^ 0x2F18] = 0xFFFFD0B8 ^ 0x2F18;
        kotakbaz.rain.client.util.color.A.E[0xCB4F ^ 0xCAC8] = 0x3A08 ^ 0xCAC8;
        kotakbaz.rain.client.util.color.A.E[0xC2F0 ^ 0xC3EF] = 0x3AAE ^ 0xC3EF;
        kotakbaz.rain.client.util.color.A.E[0xE355 ^ 0xE35A] = 0xFFFF1C81 ^ 0xE35A;
        kotakbaz.rain.client.util.color.A.E[0xE8AC ^ 0xE838] = 0x6A8F ^ 0xE838;
        kotakbaz.rain.client.util.color.A.E[0xAF01 ^ 0xAF24] = 0xAF55 ^ 0xAF24;
        kotakbaz.rain.client.util.color.A.E[0x3793 ^ 0x36E9] = 0xFFFFC94F ^ 0x36E9;
        kotakbaz.rain.client.util.color.A.E[0xDA5 ^ 0xD1C] = 0xCD0B ^ 0xD1C;
        kotakbaz.rain.client.util.color.A.E[0x236B ^ 0x2365] = 0x2378 ^ 0x2365;
        kotakbaz.rain.client.util.color.A.E[0x31E ^ 0x26D] = 0x263 ^ 0x26D;
        kotakbaz.rain.client.util.color.A.E[0x4F2C ^ 0x4F9B] = 0x8FD1 ^ 0x4F9B;
        kotakbaz.rain.client.util.color.A.E[0x54BD ^ 0x548E] = 0x548E ^ 0x548E;
        kotakbaz.rain.client.util.color.A.E[0x44F4 ^ 0x4424] = 0xFFFF82AE ^ 0x4424;
        kotakbaz.rain.client.util.color.A.E[0x38B2 ^ 0x393E] = 0x3990 ^ 0x393E;
        kotakbaz.rain.client.util.color.A.E[0x1126 ^ 0x110E] = 0x1129 ^ 0x110E;
        kotakbaz.rain.client.util.color.A.E[0x552B ^ 0x540D] = 0x6F49 ^ 0x540D;
        kotakbaz.rain.client.util.color.A.E[0x1CFD ^ 0x1DC8] = 0x11B81 ^ 0x1DC8;
        kotakbaz.rain.client.util.color.A.E[0x1583 ^ 0x15B2] = 0x15B2 ^ 0x15B2;
        kotakbaz.rain.client.util.color.A.E[0x8C4E ^ 0x8CAD] = 0x58DE ^ 0x8CAD;
        kotakbaz.rain.client.util.color.A.E[0x1ECB ^ 0x1EB2] = 0x1ED4 ^ 0x1EB2;
        kotakbaz.rain.client.util.color.A.E[0x25D7 ^ 0x2566] = 0x5014 ^ 0x2566;
        kotakbaz.rain.client.util.color.A.E[0x182D ^ 0x1967] = 0x1967 ^ 0x1967;
        kotakbaz.rain.client.util.color.A.E[0x10249 ^ 0x1025E] = 0xFFFEFDBE ^ 0x1025E;
        kotakbaz.rain.client.util.color.A.E[0x699E ^ 0x69EE] = 0x6978 ^ 0x69EE;
        kotakbaz.rain.client.util.color.A.E[0xCD51 ^ 0xCD29] = 0xFFFF3289 ^ 0xCD29;
        kotakbaz.rain.client.util.color.A.E[0x6280 ^ 0x63DB] = 0x5AC3 ^ 0x63DB;
        kotakbaz.rain.client.util.color.A.E[0x8C63 ^ 0x8CC6] = 0x18F99 ^ 0x8CC6;
        kotakbaz.rain.client.util.color.A.E[0xCE43 ^ 0xCE40] = 0xFFFF31E6 ^ 0xCE40;
        kotakbaz.rain.client.util.color.A.E[0xA72E ^ 0xA79E] = 0xD29E ^ 0xA79E;
        kotakbaz.rain.client.util.color.A.E[0x32CE ^ 0x3386] = 0x26F8 ^ 0x3386;
        kotakbaz.rain.client.util.color.A.E[0x7F0B ^ 0x7E37] = 0xFFFFFB86 ^ 0x7E37;
        kotakbaz.rain.client.util.color.A.E[0x436F ^ 0x4267] = 0xD23A ^ 0x4267;
        kotakbaz.rain.client.util.color.A.E[0xFC0A ^ 0xFCED] = 0x7DB5 ^ 0xFCED;
        kotakbaz.rain.client.util.color.A.E[0x90C ^ 0x85E] = 0xEE3F ^ 0x85E;
        kotakbaz.rain.client.util.color.A.E[0xE292 ^ 0xE3BE] = 0xFFFFC142 ^ 0xE3BE;
        kotakbaz.rain.client.util.color.A.E[0x27A9 ^ 0x2723] = 0x3128 ^ 0x2723;
        kotakbaz.rain.client.util.color.A.E[0xE01D ^ 0xE147] = 0xDF50 ^ 0xE147;
        kotakbaz.rain.client.util.color.A.E[0x898F ^ 0x8906] = 0x9F4C ^ 0x8906;
        kotakbaz.rain.client.util.color.A.E[0xD5A7 ^ 0xD5CF] = 0xFFFF2A56 ^ 0xD5CF;
        kotakbaz.rain.client.util.color.A.E[0x5943 ^ 0x59CC] = 0x80CD ^ 0x59CC;
        kotakbaz.rain.client.util.color.A.E[0x3A3F ^ 0x3A87] = 0xFAC0 ^ 0x3A87;
        kotakbaz.rain.client.util.color.A.E[0xAE06 ^ 0xAE78] = 0xAE64 ^ 0xAE78;
        kotakbaz.rain.client.util.color.A.E[0xA3D4 ^ 0xA30E] = 0xDEDA ^ 0xA30E;
        kotakbaz.rain.client.util.color.A.E[0x9FC6 ^ 0x9FB1] = 0xFFFF607C ^ 0x9FB1;
        kotakbaz.rain.client.util.color.A.E[0xB48D ^ 0xB5C6] = 0xB5C6 ^ 0xB5C6;
        kotakbaz.rain.client.util.color.A.E[0x7D69 ^ 0x7D38] = 0x7D33 ^ 0x7D38;
        kotakbaz.rain.client.util.color.A.E[0x992F ^ 0x9950] = 0x9951 ^ 0x9950;
        kotakbaz.rain.client.util.color.A.E[0x9E5 ^ 0x999] = 0xFFFFF662 ^ 0x999;
        kotakbaz.rain.client.util.color.A.E[0xC27D ^ 0xC219] = 0xC244 ^ 0xC219;
        kotakbaz.rain.client.util.color.A.E[0x1150 ^ 0x11A1] = 0x8B25 ^ 0x11A1;
        kotakbaz.rain.client.util.color.A.E[0x2366 ^ 0x2231] = 0x7659 ^ 0x2231;
        kotakbaz.rain.client.util.color.A.E[0x9E34 ^ 0x9E72] = 0x9E3B ^ 0x9E72;
        kotakbaz.rain.client.util.color.A.E[0x5F17 ^ 0x5E0A] = 0xD17B ^ 0x5E0A;
        kotakbaz.rain.client.util.color.A.E[0xEAF2 ^ 0xEA81] = 0xEA27 ^ 0xEA81;
        kotakbaz.rain.client.util.color.A.E[0x9660 ^ 0x96C7] = 0x5517 ^ 0x96C7;
        kotakbaz.rain.client.util.color.A.E[0xB3DC ^ 0xB373] = 0xC67A ^ 0xB373;
        kotakbaz.rain.client.util.color.A.E[0x938F ^ 0x928E] = 0xC372 ^ 0x928E;
        kotakbaz.rain.client.util.color.A.E[0x13CB ^ 0x12F5] = 0x5F5B ^ 0x12F5;
        kotakbaz.rain.client.util.color.A.E[0xDEB0 ^ 0xDE40] = 0xFFFFBB58 ^ 0xDE40;
        kotakbaz.rain.client.util.color.A.E[0x2D85 ^ 0x2DBF] = 0x603D ^ 0x2DBF;
        kotakbaz.rain.client.util.color.A.E[0xD34E ^ 0xD398] = 0xBBC6 ^ 0xD398;
        kotakbaz.rain.client.util.color.A.E[0xE8D8 ^ 0xE9FF] = 0xD2BB ^ 0xE9FF;
        kotakbaz.rain.client.util.color.A.E[0x6A88 ^ 0x6B0D] = 0x6B0E ^ 0x6B0D;
        kotakbaz.rain.client.util.color.A.E[0xCABB ^ 0xCAD6] = 0xFFFF3534 ^ 0xCAD6;
        kotakbaz.rain.client.util.color.A.E[0xD571 ^ 0xD599] = 0xFFFFAB21 ^ 0xD599;
        kotakbaz.rain.client.util.color.A.E[0xE0F1 ^ 0xE1F6] = 0x7185 ^ 0xE1F6;
        kotakbaz.rain.client.util.color.A.E[0xC078 ^ 0xC118] = 0xC108 ^ 0xC118;
        kotakbaz.rain.client.util.color.A.E[0x4481 ^ 0x44B1] = 0x44B2 ^ 0x44B1;
        kotakbaz.rain.client.util.color.A.E[0xB627 ^ 0xB6F2] = 0xE974 ^ 0xB6F2;
        kotakbaz.rain.client.util.color.A.E[0x77EA ^ 0x7734] = 0x1A75 ^ 0x7734;
        kotakbaz.rain.client.util.color.A.E[0x6C ^ 0x14F] = 0xF498 ^ 0x14F;
        kotakbaz.rain.client.util.color.A.E[0xF132 ^ 0xF1A9] = 0x3C2A ^ 0xF1A9;
        kotakbaz.rain.client.util.color.A.E[0xD138 ^ 0xD133] = 0xFFFF2E92 ^ 0xD133;
        kotakbaz.rain.client.util.color.A.E[0xF184 ^ 0xF0FF] = 0xF0F6 ^ 0xF0FF;
        kotakbaz.rain.client.util.color.A.E[0xDF80 ^ 0xDE9A] = 0x51E1 ^ 0xDE9A;
        kotakbaz.rain.client.util.color.A.E[0xFBEE ^ 0xFBEA] = 0xFFFF0467 ^ 0xFBEA;
        kotakbaz.rain.client.util.color.A.E[0xEBE ^ 0xE67] = 0x662E ^ 0xE67;
        kotakbaz.rain.client.util.color.A.E[0x814C ^ 0x8153] = 0x8116 ^ 0x8153;
        kotakbaz.rain.client.util.color.A.E[0x63A9 ^ 0x62B2] = 0xEDC3 ^ 0x62B2;
        kotakbaz.rain.client.util.color.A.E[0xFFF0 ^ 0xFF96] = 0xFFFF0025 ^ 0xFF96;
        kotakbaz.rain.client.util.color.A.E[0xE0D9 ^ 0xE0C9] = 0xFFFF1F75 ^ 0xE0C9;
        kotakbaz.rain.client.util.color.A.E[0x3E81 ^ 0x3E9B] = 0x3EEE ^ 0x3E9B;
        kotakbaz.rain.client.util.color.A.E[0xD0F5 ^ 0xD00D] = 0x8969 ^ 0xD00D;
        kotakbaz.rain.client.util.color.A.E[0x570A ^ 0x57BE] = 0x680B ^ 0x57BE;
        kotakbaz.rain.client.util.color.A.E[0x7D8 ^ 0x711] = 0xFD23 ^ 0x711;
        kotakbaz.rain.client.util.color.A.E[0x7512 ^ 0x7534] = 0xFFFF8A8C ^ 0x7534;
        kotakbaz.rain.client.util.color.A.E[0xA8C4 ^ 0xA9B8] = 0xFFFF5619 ^ 0xA9B8;
        kotakbaz.rain.client.util.color.A.E[0xCD44 ^ 0xCC6D] = 0xF729 ^ 0xCC6D;
        kotakbaz.rain.client.util.color.A.E[0x107A ^ 0x10E9] = 0x9259 ^ 0x10E9;
        kotakbaz.rain.client.util.color.A.E[0x1E9C ^ 0x1ED0] = 0x1EF9 ^ 0x1ED0;
        kotakbaz.rain.client.util.color.A.E[0x61AB ^ 0x60D9] = 0xFFFF9F11 ^ 0x60D9;
        kotakbaz.rain.client.util.color.A.E[0xEA4F ^ 0xEB75] = 0x9166 ^ 0xEB75;
        kotakbaz.rain.client.util.color.A.E[0x8E79 ^ 0x8E29] = 0x8E5C ^ 0x8E29;
        kotakbaz.rain.client.util.color.A.E[0x5B60 ^ 0x5B5E] = 0xAC35 ^ 0x5B5E;
        kotakbaz.rain.client.util.color.A.E[0x63A8 ^ 0x6370] = 0xB6C ^ 0x6370;
        kotakbaz.rain.client.util.color.A.E[0x9FDC ^ 0x9FF8] = 0xFFFF601C ^ 0x9FF8;
        kotakbaz.rain.client.util.color.A.E[0x2281 ^ 0x227C] = 0xACAF ^ 0x227C;
        kotakbaz.rain.client.util.color.A.E[0x343 ^ 0x323] = 0x35F ^ 0x323;
        kotakbaz.rain.client.util.color.A.E[0xF542 ^ 0xF589] = 0x70E5 ^ 0xF589;
        kotakbaz.rain.client.util.color.A.E[0x70CE ^ 0x7189] = 0x64BA ^ 0x7189;
        kotakbaz.rain.client.util.color.A.E[0x1D23 ^ 0x1C26] = 0x426B ^ 0x1C26;
        kotakbaz.rain.client.util.color.A.E[0xF9C9 ^ 0xF945] = 0x4A6D ^ 0xF945;
        kotakbaz.rain.client.util.color.A.E[0x13E ^ 0xE] = 0xFFFFA8A5 ^ 0xE;
        kotakbaz.rain.client.util.color.A.E[0x808D ^ 0x80AD] = 0xFFFF7F0D ^ 0x80AD;
        kotakbaz.rain.client.util.color.A.E[0x12B1 ^ 0x138E] = 0x5E3F ^ 0x138E;
        kotakbaz.rain.client.util.color.A.E[0x5A42 ^ 0x5A74] = 0x5A74 ^ 0x5A74;
        kotakbaz.rain.client.util.color.A.E[0x8E4 ^ 0x879] = 0xFFFF3A4B ^ 0x879;
        kotakbaz.rain.client.util.color.A.E[0x35A5 ^ 0x34E1] = 0x1306F ^ 0x34E1;
        kotakbaz.rain.client.util.color.A.E[0xBEDC ^ 0xBFBB] = 0xBFBD ^ 0xBFBB;
        kotakbaz.rain.client.util.color.A.E[0x3F4A ^ 0x3FC2] = 0x29C9 ^ 0x3FC2;
        kotakbaz.rain.client.util.color.A.E[0xC04 ^ 0xC6A] = 0xFFFFF3D4 ^ 0xC6A;
        kotakbaz.rain.client.util.color.A.E[0xF0D6 ^ 0xF07A] = 0x1F33B ^ 0xF07A;
        kotakbaz.rain.client.util.color.A.E[0xB645 ^ 0xB656] = 0xB606 ^ 0xB656;
        kotakbaz.rain.client.util.color.A.E[0x4D36 ^ 0x4C16] = 0xB55F ^ 0x4C16;
        kotakbaz.rain.client.util.color.A.E[0xF97D ^ 0xF93C] = 0xC948 ^ 0xF93C;
        kotakbaz.rain.client.util.color.A.E[0xAB35 ^ 0xAA45] = 0xFFFF55AD ^ 0xAA45;
        kotakbaz.rain.client.util.color.A.E[0x812 ^ 0x951] = 0x10DB9 ^ 0x951;
        kotakbaz.rain.client.util.color.A.E[0xCCAA ^ 0xCDB2] = 0xFFFF0DB3 ^ 0xCDB2;
        kotakbaz.rain.client.util.color.A.E[0xF0CF ^ 0xF018] = 0x9851 ^ 0xF018;
        kotakbaz.rain.client.util.color.A.E[0x800D ^ 0x8070] = 0xFFFF7FB7 ^ 0x8070;
        kotakbaz.rain.client.util.color.A.E[0x7F8C ^ 0x7FC9] = 0x7FC9 ^ 0x7FC9;
        kotakbaz.rain.client.util.color.A.E[0xD744 ^ 0xD642] = 0x463C ^ 0xD642;
        kotakbaz.rain.client.util.color.A.E[0xD2C0 ^ 0xD3F4] = 0xFFFE2A2A ^ 0xD3F4;
        kotakbaz.rain.client.util.color.A.E[0xF011 ^ 0xF0D9] = 0xACB ^ 0xF0D9;
        kotakbaz.rain.client.util.color.A.E[0xC466 ^ 0xC452] = 0xC450 ^ 0xC452;
        kotakbaz.rain.client.util.color.A.E[0x9B02 ^ 0x9B94] = 0x1923 ^ 0x9B94;
        kotakbaz.rain.client.util.color.A.E[0x402E ^ 0x4094] = 0x80D3 ^ 0x4094;
        kotakbaz.rain.client.util.color.A.E[0x76C4 ^ 0x77D3] = 0x4859 ^ 0x77D3;
        kotakbaz.rain.client.util.color.A.E[0x643F ^ 0x651E] = 0x9C5F ^ 0x651E;
        kotakbaz.rain.client.util.color.A.E[0xAF78 ^ 0xAF66] = 0xFFFF5080 ^ 0xAF66;
        kotakbaz.rain.client.util.color.A.E[0x1E77 ^ 0x1EE6] = 0xFFFF386D ^ 0x1EE6;
        kotakbaz.rain.client.util.color.A.E[0x9A3E ^ 0x9BBC] = 0x9ABC ^ 0x9BBC;
        kotakbaz.rain.client.util.color.A.E[0x4B18 ^ 0x4B95] = 0xF89D ^ 0x4B95;
        kotakbaz.rain.client.util.color.A.E[0xF8F3 ^ 0xF9B1] = 0x1FD5F ^ 0xF9B1;
        kotakbaz.rain.client.util.color.A.E[0x6CB8 ^ 0x6C75] = 0xE919 ^ 0x6C75;
        kotakbaz.rain.client.util.color.A.E[0xB73B ^ 0xB630] = 0xB37C ^ 0xB630;
        kotakbaz.rain.client.util.color.A.E[0xF497 ^ 0xF40B] = 0x3982 ^ 0xF40B;
        kotakbaz.rain.client.util.color.A.E[0x8E4B ^ 0x8F61] = 0x5269 ^ 0x8F61;
        kotakbaz.rain.client.util.color.A.E[0x717A ^ 0x7025] = 0x7024 ^ 0x7025;
        kotakbaz.rain.client.util.color.A.E[0x45C9 ^ 0x45C1] = 0x45DB ^ 0x45C1;
        kotakbaz.rain.client.util.color.A.E[0xA93F ^ 0xA862] = 0x97F ^ 0xA862;
        kotakbaz.rain.client.util.color.A.E[0x7E06 ^ 0x7F35] = 0x1797C ^ 0x7F35;
        kotakbaz.rain.client.util.color.A.E[0xB4A2 ^ 0xB4D3] = 0xFFFF4B09 ^ 0xB4D3;
        kotakbaz.rain.client.util.color.A.E[0xC681 ^ 0xC790] = 0x6018 ^ 0xC790;
        kotakbaz.rain.client.util.color.A.E[0x963D ^ 0x975E] = 0x975D ^ 0x975E;
        kotakbaz.rain.client.util.color.A.E[0xA89E ^ 0xA9B5] = 0x74A8 ^ 0xA9B5;
        kotakbaz.rain.client.util.color.A.E[0x10D2D ^ 0x10D06] = 0xFFFEF2F3 ^ 0x10D06;
        kotakbaz.rain.client.util.color.A.E[0x1C76 ^ 0x1D1F] = 0x1D1F ^ 0x1D1F;
        kotakbaz.rain.client.util.color.A.E[0x5FBF ^ 0x5EC8] = 0x5ECF ^ 0x5EC8;
        kotakbaz.rain.client.util.color.A.E[0x7C7B ^ 0x7DF8] = 0x7DFA ^ 0x7DF8;
        kotakbaz.rain.client.util.color.A.E[0x1EA5 ^ 0x1E65] = 0x9508 ^ 0x1E65;
        kotakbaz.rain.client.util.color.A.E[0x94AF ^ 0x947C] = 0xCBFA ^ 0x947C;
        kotakbaz.rain.client.util.color.A.E[0x3AF3 ^ 0x3BC5] = 0x1363 ^ 0x3BC5;
        kotakbaz.rain.client.util.color.A.E[0xC7D5 ^ 0xC654] = 0xC650 ^ 0xC654;
        kotakbaz.rain.client.util.color.A.E[0xF3CC ^ 0xF2B8] = 0xFFFF0D03 ^ 0xF2B8;
        kotakbaz.rain.client.util.color.A.E[0x6383 ^ 0x6371] = 0x1E7 ^ 0x6371;
        kotakbaz.rain.client.util.color.A.E[0xD2A ^ 0xC07] = 0xD11A ^ 0xC07;
        kotakbaz.rain.client.util.color.A.E[0x8F66 ^ 0x8F70] = 0x8F65 ^ 0x8F70;
        kotakbaz.rain.client.util.color.A.E[0x1057B ^ 0x105CD] = 0x13A78 ^ 0x105CD;
        kotakbaz.rain.client.util.color.A.E[0x9D5A ^ 0x9C16] = 0x9C16 ^ 0x9C16;
        kotakbaz.rain.client.util.color.A.E[0x8912 ^ 0x89E8] = 0x733 ^ 0x89E8;
        kotakbaz.rain.client.util.color.A.E[0xD5F9 ^ 0xD53C] = 0x4ACA ^ 0xD53C;
        kotakbaz.rain.client.util.color.A.E[0xFCA9 ^ 0xFC16] = 0x7775 ^ 0xFC16;
        kotakbaz.rain.client.util.color.A.E[0x32E1 ^ 0x3280] = 0xFFFFCDCD ^ 0x3280;
        kotakbaz.rain.client.util.color.A.E[0xCA2D ^ 0xCAAB] = 0xCCC2 ^ 0xCAAB;
        kotakbaz.rain.client.util.color.A.E[0xF47 ^ 0xFAB] = 0xB6A4 ^ 0xFAB;
        kotakbaz.rain.client.util.color.A.E[0xCD4F ^ 0xCDBA] = 0xAF27 ^ 0xCDBA;
        kotakbaz.rain.client.util.color.A.E[0xAC59 ^ 0xAD2C] = 0xAD28 ^ 0xAD2C;
        kotakbaz.rain.client.util.color.A.E[0xB9B6 ^ 0xB8EF] = 0x79BA ^ 0xB8EF;
        kotakbaz.rain.client.util.color.A.E[0xD6FB ^ 0xD7AF] = 0x4C8A ^ 0xD7AF;
        kotakbaz.rain.client.util.color.A.E[0x3185 ^ 0x3086] = 0x6ECB ^ 0x3086;
        kotakbaz.rain.client.util.color.A.E[0x3E3F ^ 0x3EAF] = 0xE7AC ^ 0x3EAF;
        kotakbaz.rain.client.util.color.A.E[0x109D7 ^ 0x10914] = 0x196EB ^ 0x10914;
        kotakbaz.rain.client.util.color.A.E[0x2F02 ^ 0x2E39] = 0x5423 ^ 0x2E39;
        kotakbaz.rain.client.util.color.A.E[0x78C4 ^ 0x78DD] = 0x78EC ^ 0x78DD;
        kotakbaz.rain.client.util.color.A.E[0x260A ^ 0x26F5] = 0x7709 ^ 0x26F5;
        kotakbaz.rain.client.util.color.A.E[0xA211 ^ 0xA23F] = 0xA24F ^ 0xA23F;
        kotakbaz.rain.client.util.color.A.E[0x3DC0 ^ 0x3DD5] = 0xFFFFC220 ^ 0x3DD5;
        kotakbaz.rain.client.util.color.A.E[0xACE9 ^ 0xAC27] = 0x952E ^ 0xAC27;
        kotakbaz.rain.client.util.color.A.E[0x75DF ^ 0x75DD] = 0x75F4 ^ 0x75DD;
        kotakbaz.rain.client.util.color.A.E[0xBD62 ^ 0xBD07] = 0xFFFF42F9 ^ 0xBD07;
        kotakbaz.rain.client.util.color.A.E[0xE788 ^ 0xE6D6] = 0x4249 ^ 0xE6D6;
        kotakbaz.rain.client.util.color.A.E[0x10325 ^ 0x1024E] = 0x1024F ^ 0x1024E;
        kotakbaz.rain.client.util.color.A.E[0x62F8 ^ 0x6377] = 0x5E05 ^ 0x6377;
        kotakbaz.rain.client.util.color.A.E[0xADF6 ^ 0xAD64] = 0x7467 ^ 0xAD64;
        kotakbaz.rain.client.util.color.A.E[0x352C ^ 0x3423] = 0x93AB ^ 0x3423;
        kotakbaz.rain.client.util.color.A.E[0x6D3C ^ 0x6DDE] = 0xB9B9 ^ 0x6DDE;
        kotakbaz.rain.client.util.color.A.E[0xC290 ^ 0xC3FD] = 0xC3F6 ^ 0xC3FD;
        kotakbaz.rain.client.util.color.A.E[0x4A05 ^ 0x4A45] = 0x79B6 ^ 0x4A45;
        kotakbaz.rain.client.util.color.A.E[0xB0EF ^ 0xB088] = 0xB07D ^ 0xB088;
        kotakbaz.rain.client.util.color.A.E[0x226E ^ 0x223D] = 0x227D ^ 0x223D;
        kotakbaz.rain.client.util.color.A.E[0xC682 ^ 0xC6D4] = 0xFFFF397E ^ 0xC6D4;
        kotakbaz.rain.client.util.color.A.E[0x3E89 ^ 0x3EB4] = 0xC41F ^ 0x3EB4;
        kotakbaz.rain.client.util.color.A.E[0x3DFC ^ 0x3D3B] = 0x3D3B ^ 0x3D3B;
        kotakbaz.rain.client.util.color.A.E[0xD3E8 ^ 0xD3AF] = 0xFFFF2C46 ^ 0xD3AF;
        kotakbaz.rain.client.util.color.A.E[0x10B82 ^ 0x10BEE] = 0xFFFEF47E ^ 0x10BEE;
        kotakbaz.rain.client.util.color.A.E[0x4DAD ^ 0x4D54] = 0x1403 ^ 0x4D54;
        kotakbaz.rain.client.util.color.A.E[0x5781 ^ 0x57DC] = 0xFFFFA805 ^ 0x57DC;
        kotakbaz.rain.client.util.color.A.E[0xB0EB ^ 0xB04B] = 0x1BDCE ^ 0xB04B;
        kotakbaz.rain.client.util.color.A.E[0xD41A ^ 0xD42F] = 0xD42F ^ 0xD42F;
        kotakbaz.rain.client.util.color.A.E[0xF508 ^ 0xF556] = 0xF53B ^ 0xF556;
        kotakbaz.rain.client.util.color.A.E[0x4C20 ^ 0x4C4F] = 0x4C33 ^ 0x4C4F;
        kotakbaz.rain.client.util.color.A.E[0x1D66 ^ 0x1C30] = 0x4198 ^ 0x1C30;
        kotakbaz.rain.client.util.color.A.E[0xA60 ^ 0xABF] = 0x67FC ^ 0xABF;
        kotakbaz.rain.client.util.color.A.E[0x9C49 ^ 0x9D50] = 0xA2DA ^ 0x9D50;
        kotakbaz.rain.client.util.color.A.E[0x3D23 ^ 0x3C33] = 0xFFFF643D ^ 0x3C33;
        kotakbaz.rain.client.util.color.A.E[0x9AF8 ^ 0x9A79] = 0x9A79 ^ 0x9A79;
        kotakbaz.rain.client.util.color.A.E[0xD4B5 ^ 0xD482] = 0xD42E ^ 0xD482;
        kotakbaz.rain.client.util.color.A.E[0xA16E ^ 0xA1A2] = 0xFFFFDB3C ^ 0xA1A2;
        kotakbaz.rain.client.util.color.A.E[0x804F ^ 0x80FC] = 0xBF4F ^ 0x80FC;
        kotakbaz.rain.client.util.color.A.E[0x5E2B ^ 0x5ECF] = 0x8AA1 ^ 0x5ECF;
        kotakbaz.rain.client.util.color.A.E[0x11A8 ^ 0x11DD] = 0x11F1 ^ 0x11DD;
        kotakbaz.rain.client.util.color.A.E[0x4498 ^ 0x44CC] = 0x44D5 ^ 0x44CC;
        kotakbaz.rain.client.util.color.A.E[0x7B7F ^ 0x7BFF] = 0x7BFD ^ 0x7BFF;
        kotakbaz.rain.client.util.color.A.E[0x8DE5 ^ 0x8DFE] = 0xFFFF7251 ^ 0x8DFE;
        kotakbaz.rain.client.util.color.A.E[0x8252 ^ 0x8210] = 0x3F27 ^ 0x8210;
        kotakbaz.rain.client.util.color.A.E[0xBBA1 ^ 0xBB93] = 0xBB92 ^ 0xBB93;
        kotakbaz.rain.client.util.color.A.E[0x71F8 ^ 0x70A0] = 0x232C ^ 0x70A0;
        kotakbaz.rain.client.util.color.A.E[0x6357 ^ 0x623D] = 0x6232 ^ 0x623D;
        kotakbaz.rain.client.util.color.A.E[0x137F ^ 0x1201] = 0xFFFFEDAF ^ 0x1201;
        kotakbaz.rain.client.util.color.A.E[0x8C72 ^ 0x8D7B] = 0x1D08 ^ 0x8D7B;
        kotakbaz.rain.client.util.color.A.E[0xF2DD ^ 0xF3EF] = 0x1F5A2 ^ 0xF3EF;
        kotakbaz.rain.client.util.color.A.E[0xD5BA ^ 0xD5C0] = 0xD5E3 ^ 0xD5C0;
        kotakbaz.rain.client.util.color.A.E[0xB34B ^ 0xB241] = 0xB71B ^ 0xB241;
        kotakbaz.rain.client.util.color.A.E[0xE0ED ^ 0xE0D5] = 0xB2F7 ^ 0xE0D5;
        kotakbaz.rain.client.util.color.A.E[0x108D0 ^ 0x109CE] = 0x1F092 ^ 0x109CE;
        kotakbaz.rain.client.util.color.A.E[0xFB49 ^ 0xFBEF] = 0x1F8F8 ^ 0xFBEF;
        kotakbaz.rain.client.util.color.A.E[0x2E0D ^ 0x2E2C] = 0x2E2C ^ 0x2E2C;
        kotakbaz.rain.client.util.color.A.E[0xB171 ^ 0xB05E] = 0xE733 ^ 0xB05E;
        kotakbaz.rain.client.util.color.A.E[0xAEF1 ^ 0xAFBC] = 0xAFBD ^ 0xAFBC;
        kotakbaz.rain.client.util.color.A.E[0x2DCB ^ 0x2D5C] = 0x3862 ^ 0x2D5C;
        kotakbaz.rain.client.util.color.A.E[0x2612 ^ 0x272F] = 0x5D35 ^ 0x272F;
        kotakbaz.rain.client.util.color.A.E[0xF851 ^ 0xF8B4] = 0x2CC7 ^ 0xF8B4;
        kotakbaz.rain.client.util.color.A.E[0x3E07 ^ 0x3F87] = 0xFFFFC02D ^ 0x3F87;
        kotakbaz.rain.client.util.color.A.E[0x8374 ^ 0x823B] = 0x8229 ^ 0x823B;
        kotakbaz.rain.client.util.color.A.E[0x323D ^ 0x32D4] = 0xB38C ^ 0x32D4;
        kotakbaz.rain.client.util.color.A.E[0x9703 ^ 0x97D7] = 0xC826 ^ 0x97D7;
        kotakbaz.rain.client.util.color.A.E[0x10EE1 ^ 0x10E64] = 0x1081D ^ 0x10E64;
        kotakbaz.rain.client.util.color.A.E[0xD04D ^ 0xD076] = 0x9AF4 ^ 0xD076;
        kotakbaz.rain.client.util.color.A.E[0x9902 ^ 0x9889] = 0xB247 ^ 0x9889;
        kotakbaz.rain.client.util.color.A.E[0x1F9B ^ 0x1ECE] = 0x926B ^ 0x1ECE;
        kotakbaz.rain.client.util.color.A.E[0xCD8C ^ 0xCC99] = 0xFB3D ^ 0xCC99;
        kotakbaz.rain.client.util.color.A.E[0x88C8 ^ 0x89C8] = 0xFFFF27EF ^ 0x89C8;
        kotakbaz.rain.client.util.color.A.E[0x4559 ^ 0x4501] = 0x4509 ^ 0x4501;
        kotakbaz.rain.client.util.color.A.E[0x190E ^ 0x1909] = 0xFFFFE6F6 ^ 0x1909;
        kotakbaz.rain.client.util.color.A.E[0x108D9 ^ 0x1095F] = 0x186BF ^ 0x1095F;
        kotakbaz.rain.client.util.color.A.E[0x6CED ^ 0x6C30] = 0x11E5 ^ 0x6C30;
        kotakbaz.rain.client.util.color.A.E[0x384E ^ 0x38CA] = 0x38CA ^ 0x38CA;
        kotakbaz.rain.client.util.color.A.E[0xE3F0 ^ 0xE2B0] = 0xAF29 ^ 0xE2B0;
        kotakbaz.rain.client.util.color.A.E[0xF5F7 ^ 0xF4F9] = 0x536D ^ 0xF4F9;
        kotakbaz.rain.client.util.color.A.E[0x382A ^ 0x388B] = 0xFFFECAAB ^ 0x388B;
    }
}

