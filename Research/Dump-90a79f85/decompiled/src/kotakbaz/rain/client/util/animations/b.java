/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.animations;

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
import kotakbaz.rain.client.util.animations.A;
import kotakbaz.rain.client.util.animations.a_0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J3\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\r\u00a8\u0006\u0014"}, d2={"Lkotakbaz/rain/client/util/animations/AnimationUtil;", "", "", "initialValue", "<init>", "(F)V", "value", "duration", "Lkotlin/Function1;", "easing", "animate", "(FFLkotlin/jvm/functions/Function1;)F", "currentValue", "F", "startValue", "targetValue", "", "startTimeMs", "J", "durationMs", "rain-visuals"})
public final class b {
    private float a;
    private float A;
    private float b;
    private long B;
    private float c;
    private static Object[] C;
    private static Object D;
    private static Object[] e;
    private static Object[] d;
    private static Object[] E;
    public static int[] f;

    public b(float f2) {
        super();
        this.a = f2;
        this.A = f2;
        this.b = f2;
    }

    public /* synthetic */ b(float f2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        int n2 = f[0];
        n2 ^= f[1];
        if ((n & (n2 += f[2])) != 0) {
            f2 = 0.0f;
        }
        this(f2);
    }

    public final float animate(float f2, float f3, @NotNull Function1<? super Float, Float> function1) {
        long l;
        block9: {
            block8: {
                int n;
                int n2;
                int n3 = f[3];
                n3 += f[4];
                Intrinsics.checkNotNullParameter(function1, (String)C[n3 += f[5]]);
                l = System.currentTimeMillis();
                if (f2 == this.b) {
                    int n4 = f[6];
                    n4 ^= f[7];
                    n2 = n4 -= f[8];
                } else {
                    int n5 = f[9];
                    n5 += f[10];
                    n2 = n5 += f[11];
                }
                if (n2 == 0) break block8;
                if (f3 == this.c) {
                    int n6 = f[12];
                    n6 ^= f[13];
                    n = n6 -= f[14];
                } else {
                    int n7 = f[15];
                    n7 += f[16];
                    n = n7 -= f[17];
                }
                if (n != 0) break block9;
            }
            this.A = this.a;
            this.b = f2;
            this.c = f3;
            this.B = l;
        }
        if (this.c <= 0.0f) {
            this.a = this.b;
            return this.a;
        }
        float f4 = RangesKt.coerceIn((float)(l - this.B) / this.c, 0.0f, 1.0f);
        float f5 = ((Number)function1.invoke(Float.valueOf(f4))).floatValue();
        this.a = this.A + (this.b - this.A) * f5;
        return this.a;
    }

    public static /* synthetic */ float animate$default(b b2, float f2, float f3, Function1 function1, int n, Object object) {
        int n2 = f[18];
        n2 += f[19];
        if ((n & (n2 -= f[20])) != 0) {
            function1 = new a_0(kotakbaz.rain.client.util.animations.A.INSTANCE);
        }
        return b2.animate(f2, f3, function1);
    }

    public b() {
        int n = f[21];
        n += f[22];
        this(0.0f, n -= f[23], null);
    }

    static {
        kotakbaz.rain.client.util.animations.b.b();
        long l = 2488259968568435686L;
        long l2 = -3272959200136873052L;
        long l3 = -4439077743936432575L;
        long l4 = 4239520828227946426L;
        long l5 = -3405286870076347404L;
        long l6 = 2142950055421149912L;
        long l7 = 5591523167261612545L;
        long l8 = 8043479021233615851L;
        long l9 = 8104082385159630852L;
        long l10 = -5060808534905611252L;
        long l11 = 4133984251350064808L;
        long l12 = -5101904781298260970L;
        long l13 = -2252876149338394275L;
        long l14 = -1267500562540867720L;
        int n = f[24];
        n += f[25];
        C = new Object[n ^= f[26]];
        long l15 = l14;
        int n2 = f[27];
        n2 -= f[28];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= f[29]);
        Object[] objectArray = new Object[f[30]];
        objectArray[kotakbaz.rain.client.util.animations.b.f[31]] = d;
        objectArray[kotakbaz.rain.client.util.animations.b.f[32]] = f[33];
        int n3 = f[34];
        Object object = kotakbaz.rain.client.util.animations.b.A()[f[35]];
        if (object == null) {
            char[] cArray = "\u54a9\u54bd\u54b9\u54b7\u54bc\u55ca\u55fd\u55c4\u54b4\u5600\u54a8\u54a9\u54c0\u55cd\u54a4\u59a1\u55e1\u5499\u55e1\u54b6\u54aa\u54ab\u54be\u55cf\u55ff\u55de\u55dd\u5499\u5974\u54bc\u54c2\u55cd\u55c7\u55cd\u55fd\u54b9\u55cf\u5497\u54af\u55cf\u54b4\u55c6\u55cd\u597b".toCharArray();
            for (int i = f[36]; i < f[37]; ++i) {
                int n4 = cArray[i];
                n4 -= f[38];
                n4 += f[39];
                n4 -= f[40];
                n4 ^= f[41];
                n4 -= f[42];
                n4 ^= f[43];
                n4 -= f[44];
                n4 -= f[45];
                n4 += f[46];
                n4 ^= f[47];
                cArray[i] = (char)(n4 ^= f[48]);
            }
            object = kotakbaz.rain.client.util.animations.b.A()[kotakbaz.rain.client.util.animations.b.f[49]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.animations.b.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = f[50];
        n5 += f[51];
        l5 = l16 ^ (0x800000000L ^ l16) & -1L << (n5 -= f[52]);
        long l17 = l12;
        int n6 = f[53];
        n6 ^= f[54];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 += f[55]);
        while (true) {
            int n7 = f[56];
            n7 -= f[57];
            if ((int)l12 >= (int)(l5 >>> (n7 -= f[58]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = f[59];
            n9 += f[60];
            int n10 = f[62];
            n10 -= f[63];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 += f[61])) & -1L >>> (n10 += f[64]);
            long l19 = l8;
            int n11 = f[65];
            n11 -= f[66];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += f[67]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = f[68];
            n13 -= f[69];
            int n14 = f[71];
            n14 ^= f[72];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= f[70])) & -1L >>> (n14 ^= f[73]);
            int n15 = f[74];
            n15 -= f[75];
            long l21 = l9;
            int n16 = f[77];
            n16 -= f[78];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= f[76]) ^ l21) & -1L << (n16 += f[79]);
            int n17 = f[80];
            n17 -= f[81];
            n17 ^= f[82];
            int n18 = f[83];
            n18 += f[84];
            long l22 = l11;
            int n19 = f[86];
            n19 += f[87];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += f[85]))) ^ l22) & -1L >>> (n19 -= f[88]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = f[89];
            n20 ^= f[90];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += f[91]);
            while (true) {
                int n21 = f[92];
                n21 -= f[93];
                if ((int)(l13 >>> (n21 ^= f[94])) >= (int)l11) break;
                int n22 = f[95];
                n22 -= f[96];
                int n23 = f[98];
                n23 -= f[99];
                cArray2[(int)(l13 >>> (n22 ^= kotakbaz.rain.client.util.animations.b.f[97]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += f[100]))];
                l13 += 0x100000000L;
            }
            int n24 = f[101];
            n24 ^= f[102];
            int n25 = (int)(l14 >>> (n24 ^= f[103]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.animations.b.C[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = f[104];
            n26 += f[105];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= f[106]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[f[107]];
        String string = (String)object[f[108]];
        object = object[f[109]];
        Object[] objectArray = e;
        if (e == null) {
            objectArray = e = new Object[f[110]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[f[111]];
                d = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[f[113] ^ f[114]];
                byArray[kotakbaz.rain.client.util.animations.b.f[115] ^ kotakbaz.rain.client.util.animations.b.f[116]] = f[117] ^ f[118];
                byArray[kotakbaz.rain.client.util.animations.b.f[119] ^ kotakbaz.rain.client.util.animations.b.f[120]] = f[121] ^ f[122];
                byArray[kotakbaz.rain.client.util.animations.b.f[123] ^ kotakbaz.rain.client.util.animations.b.f[124]] = f[125] ^ f[126];
                byArray[kotakbaz.rain.client.util.animations.b.f[127] ^ kotakbaz.rain.client.util.animations.b.f[128]] = f[129] ^ f[130];
                byArray[kotakbaz.rain.client.util.animations.b.f[131] ^ kotakbaz.rain.client.util.animations.b.f[132]] = f[133] ^ f[134];
                byArray[kotakbaz.rain.client.util.animations.b.f[135] ^ kotakbaz.rain.client.util.animations.b.f[136]] = f[137] ^ f[138];
                byArray[kotakbaz.rain.client.util.animations.b.f[139] ^ kotakbaz.rain.client.util.animations.b.f[140]] = f[141] ^ f[142];
                byArray[kotakbaz.rain.client.util.animations.b.f[143] ^ kotakbaz.rain.client.util.animations.b.f[144]] = f[145] ^ f[146];
                byArray[kotakbaz.rain.client.util.animations.b.f[147] ^ kotakbaz.rain.client.util.animations.b.f[148]] = f[149] ^ f[150];
                byArray[kotakbaz.rain.client.util.animations.b.f[151] ^ kotakbaz.rain.client.util.animations.b.f[152]] = f[153] ^ f[154];
                byArray[kotakbaz.rain.client.util.animations.b.f[155] ^ kotakbaz.rain.client.util.animations.b.f[156]] = f[157] ^ f[158];
                byArray[kotakbaz.rain.client.util.animations.b.f[159] ^ kotakbaz.rain.client.util.animations.b.f[160]] = f[161] ^ f[162];
                byArray[kotakbaz.rain.client.util.animations.b.f[163] ^ kotakbaz.rain.client.util.animations.b.f[164]] = f[165] ^ f[166];
                byArray[kotakbaz.rain.client.util.animations.b.f[167] ^ kotakbaz.rain.client.util.animations.b.f[168]] = f[169] ^ f[170];
                byArray[kotakbaz.rain.client.util.animations.b.f[171] ^ kotakbaz.rain.client.util.animations.b.f[172]] = f[173] ^ f[174];
                byArray[kotakbaz.rain.client.util.animations.b.f[175] ^ kotakbaz.rain.client.util.animations.b.f[176]] = f[177] ^ f[178];
                objectArray2[kotakbaz.rain.client.util.animations.b.f[112]] = byArray;
            }
            byte[] byArray = (byte[])object3[f[179]];
            if (D == null) {
                byte[] byArray2 = new byte[f[180] ^ f[181]];
                byArray2[kotakbaz.rain.client.util.animations.b.f[182] ^ kotakbaz.rain.client.util.animations.b.f[183]] = f[184] ^ f[185];
                byArray2[kotakbaz.rain.client.util.animations.b.f[186] ^ kotakbaz.rain.client.util.animations.b.f[187]] = f[188] ^ f[189];
                byArray2[kotakbaz.rain.client.util.animations.b.f[190] ^ kotakbaz.rain.client.util.animations.b.f[191]] = f[192] ^ f[193];
                byArray2[kotakbaz.rain.client.util.animations.b.f[194] ^ kotakbaz.rain.client.util.animations.b.f[195]] = f[196] ^ f[197];
                byArray2[kotakbaz.rain.client.util.animations.b.f[198] ^ kotakbaz.rain.client.util.animations.b.f[199]] = f[200] ^ f[201];
                byArray2[kotakbaz.rain.client.util.animations.b.f[202] ^ kotakbaz.rain.client.util.animations.b.f[203]] = f[204] ^ f[205];
                byArray2[kotakbaz.rain.client.util.animations.b.f[206] ^ kotakbaz.rain.client.util.animations.b.f[207]] = f[208] ^ f[209];
                byArray2[kotakbaz.rain.client.util.animations.b.f[210] ^ kotakbaz.rain.client.util.animations.b.f[211]] = f[212] ^ f[213];
                byArray2[kotakbaz.rain.client.util.animations.b.f[214] ^ kotakbaz.rain.client.util.animations.b.f[215]] = f[216] ^ f[217];
                byArray2[kotakbaz.rain.client.util.animations.b.f[218] ^ kotakbaz.rain.client.util.animations.b.f[219]] = f[220] ^ f[221];
                byArray2[kotakbaz.rain.client.util.animations.b.f[222] ^ kotakbaz.rain.client.util.animations.b.f[223]] = f[224] ^ f[225];
                byArray2[kotakbaz.rain.client.util.animations.b.f[226] ^ kotakbaz.rain.client.util.animations.b.f[227]] = f[228] ^ f[229];
                byArray2[kotakbaz.rain.client.util.animations.b.f[230] ^ kotakbaz.rain.client.util.animations.b.f[231]] = f[232] ^ f[233];
                byArray2[kotakbaz.rain.client.util.animations.b.f[234] ^ kotakbaz.rain.client.util.animations.b.f[235]] = f[236] ^ f[237];
                byArray2[kotakbaz.rain.client.util.animations.b.f[238] ^ kotakbaz.rain.client.util.animations.b.f[239]] = f[240] ^ f[241];
                byArray2[kotakbaz.rain.client.util.animations.b.f[242] ^ kotakbaz.rain.client.util.animations.b.f[243]] = f[244] ^ f[245];
                byArray2[kotakbaz.rain.client.util.animations.b.f[246] ^ kotakbaz.rain.client.util.animations.b.f[247]] = f[248] ^ f[249];
                byArray2[kotakbaz.rain.client.util.animations.b.f[250] ^ kotakbaz.rain.client.util.animations.b.f[251]] = f[252] ^ f[253];
                byArray2[kotakbaz.rain.client.util.animations.b.f[254] ^ kotakbaz.rain.client.util.animations.b.f[255]] = f[256] ^ f[257];
                byArray2[kotakbaz.rain.client.util.animations.b.f[258] ^ kotakbaz.rain.client.util.animations.b.f[259]] = f[260] ^ f[261];
                byArray2[kotakbaz.rain.client.util.animations.b.f[262] ^ kotakbaz.rain.client.util.animations.b.f[263]] = f[264] ^ f[265];
                byArray2[kotakbaz.rain.client.util.animations.b.f[266] ^ kotakbaz.rain.client.util.animations.b.f[267]] = f[268] ^ f[269];
                byArray2[kotakbaz.rain.client.util.animations.b.f[270] ^ kotakbaz.rain.client.util.animations.b.f[271]] = f[272] ^ f[273];
                byArray2[kotakbaz.rain.client.util.animations.b.f[274] ^ kotakbaz.rain.client.util.animations.b.f[275]] = f[276] ^ f[277];
                byArray2[kotakbaz.rain.client.util.animations.b.f[278] ^ kotakbaz.rain.client.util.animations.b.f[279]] = f[280] ^ f[281];
                byArray2[kotakbaz.rain.client.util.animations.b.f[282] ^ kotakbaz.rain.client.util.animations.b.f[283]] = f[284] ^ f[285];
                byArray2[kotakbaz.rain.client.util.animations.b.f[286] ^ kotakbaz.rain.client.util.animations.b.f[287]] = f[288] ^ f[289];
                byArray2[kotakbaz.rain.client.util.animations.b.f[290] ^ kotakbaz.rain.client.util.animations.b.f[291]] = f[292] ^ f[293];
                byArray2[kotakbaz.rain.client.util.animations.b.f[294] ^ kotakbaz.rain.client.util.animations.b.f[295]] = f[296] ^ f[297];
                byArray2[kotakbaz.rain.client.util.animations.b.f[298] ^ kotakbaz.rain.client.util.animations.b.f[299]] = f[300] ^ f[301];
                byArray2[kotakbaz.rain.client.util.animations.b.f[302] ^ kotakbaz.rain.client.util.animations.b.f[303]] = f[304] ^ f[305];
                byArray2[kotakbaz.rain.client.util.animations.b.f[306] ^ kotakbaz.rain.client.util.animations.b.f[307]] = f[308] ^ f[309];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, f[310], byArray3, f[311], byArray.length);
                System.arraycopy(byArray2, f[312], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.animations.b.A()[f[313]];
                if (object4 == null) {
                    char[] cArray = "\udc4f\udc41\udc1a\udc33\udc45\udbb1\udc56\udc68\udc63\udc67\udc47\udc3c\udc60\udc52\udc42\udc47\udc40\udbb0".toCharArray();
                    for (int i = f[314]; i < f[315]; ++i) {
                        int n2 = cArray[i];
                        n2 -= f[316];
                        n2 ^= f[317];
                        n2 ^= f[318];
                        n2 += f[319];
                        n2 += f[320];
                        n2 += f[321];
                        n2 -= f[322];
                        n2 -= f[323];
                        n2 ^= f[324];
                        n2 += f[325];
                        n2 -= f[326];
                        cArray[i] = (char)(n2 ^= f[327]);
                    }
                    object4 = kotakbaz.rain.client.util.animations.b.A()[kotakbaz.rain.client.util.animations.b.f[328]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[f[329]];
                byArray4[kotakbaz.rain.client.util.animations.b.f[330]] = f[331];
                byArray4[kotakbaz.rain.client.util.animations.b.f[332]] = f[333];
                byArray4[kotakbaz.rain.client.util.animations.b.f[334]] = f[335];
                byArray4[kotakbaz.rain.client.util.animations.b.f[336]] = f[337];
                byArray4[kotakbaz.rain.client.util.animations.b.f[338]] = f[339];
                byArray4[kotakbaz.rain.client.util.animations.b.f[340]] = f[341];
                byArray4[kotakbaz.rain.client.util.animations.b.f[342]] = f[343];
                byArray4[kotakbaz.rain.client.util.animations.b.f[344]] = f[345];
                byArray4[kotakbaz.rain.client.util.animations.b.f[346]] = f[347];
                byArray4[kotakbaz.rain.client.util.animations.b.f[348]] = f[349];
                byArray4[kotakbaz.rain.client.util.animations.b.f[350]] = f[351];
                byArray4[kotakbaz.rain.client.util.animations.b.f[352]] = f[353];
                byArray4[kotakbaz.rain.client.util.animations.b.f[354]] = f[355];
                byArray4[kotakbaz.rain.client.util.animations.b.f[356]] = f[357];
                byArray4[kotakbaz.rain.client.util.animations.b.f[358]] = f[359];
                byArray4[kotakbaz.rain.client.util.animations.b.f[360]] = f[361];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, f[362], f[363]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.animations.b.A()[f[364]];
                if (object5 == null) {
                    char[] cArray = "\uaae1\uaacd\uaad3".toCharArray();
                    for (int i = f[365]; i < f[366]; ++i) {
                        int n3 = cArray[i];
                        n3 -= f[367];
                        n3 -= f[368];
                        n3 += f[369];
                        n3 -= f[370];
                        n3 ^= f[371];
                        n3 += f[372];
                        n3 ^= f[373];
                        n3 -= f[374];
                        n3 -= f[375];
                        n3 ^= f[376];
                        n3 -= f[377];
                        cArray[i] = (char)(n3 += f[378]);
                    }
                    object5 = kotakbaz.rain.client.util.animations.b.A()[kotakbaz.rain.client.util.animations.b.f[379]] = new String(cArray);
                }
                D = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, f[380], f[381]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, f[382], byArray6.length);
            Object object6 = kotakbaz.rain.client.util.animations.b.A()[f[383]];
            if (object6 == null) {
                char[] cArray = "\u986f\u986b\u915d\u9fd1\u986d\u986e\u986d\u9fd1\u9130\u9135\u986d\u915d\u987b\u9130\u914f\u914c\u914c\u9f97\u9f92\u9169".toCharArray();
                for (int i = f[384]; i < f[385]; ++i) {
                    int n4 = cArray[i];
                    n4 ^= f[386];
                    n4 -= f[387];
                    n4 -= f[388];
                    n4 -= f[389];
                    n4 += f[390];
                    n4 -= f[391];
                    n4 ^= f[392];
                    n4 ^= f[393];
                    n4 ^= f[394];
                    n4 += f[395];
                    n4 ^= f[396];
                    n4 -= f[397];
                    n4 -= f[398];
                    cArray[i] = (char)(n4 += f[399]);
                }
                object6 = kotakbaz.rain.client.util.animations.b.A()[3] = new String(cArray);
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
        f = new int[0x3F0B ^ 0x3E9B];
        kotakbaz.rain.client.util.animations.b.f[0x1E0D ^ 0x1EC1] = 0xFFFFCD17 ^ 0x1EC1;
        kotakbaz.rain.client.util.animations.b.f[0xAA3C ^ 0xAAA3] = 0x81A ^ 0xAAA3;
        kotakbaz.rain.client.util.animations.b.f[0x8E2F ^ 0x8F6A] = 0x7F23 ^ 0x8F6A;
        kotakbaz.rain.client.util.animations.b.f[0x61AF ^ 0x617E] = 0x6ADB ^ 0x617E;
        kotakbaz.rain.client.util.animations.b.f[0xFDBB ^ 0xFD37] = 0xD0B9 ^ 0xFD37;
        kotakbaz.rain.client.util.animations.b.f[0xD78F ^ 0xD7E8] = 0xFFFF2869 ^ 0xD7E8;
        kotakbaz.rain.client.util.animations.b.f[0x109AC ^ 0x10952] = 0xC69 ^ 0x10952;
        kotakbaz.rain.client.util.animations.b.f[0x5D44 ^ 0x5D9A] = 0xB8F7 ^ 0x5D9A;
        kotakbaz.rain.client.util.animations.b.f[0xC61E ^ 0xC61A] = 0xC626 ^ 0xC61A;
        kotakbaz.rain.client.util.animations.b.f[0xF937 ^ 0xF93C] = 0xF961 ^ 0xF93C;
        kotakbaz.rain.client.util.animations.b.f[0x7AA6 ^ 0x7BD5] = 0x7D82 ^ 0x7BD5;
        kotakbaz.rain.client.util.animations.b.f[0x52B6 ^ 0x538A] = 0x9EF8 ^ 0x538A;
        kotakbaz.rain.client.util.animations.b.f[0x104CA ^ 0x1047C] = 0x1CBD7 ^ 0x1047C;
        kotakbaz.rain.client.util.animations.b.f[0xF368 ^ 0xF352] = 0xF30B ^ 0xF352;
        kotakbaz.rain.client.util.animations.b.f[0x3479 ^ 0x34C6] = 0xB023 ^ 0x34C6;
        kotakbaz.rain.client.util.animations.b.f[0x10A32 ^ 0x10A65] = 0x10A73 ^ 0x10A65;
        kotakbaz.rain.client.util.animations.b.f[0xCB0D ^ 0xCA52] = 0xFFFF35A9 ^ 0xCA52;
        kotakbaz.rain.client.util.animations.b.f[0xFDF6 ^ 0xFDF1] = 0xFFFF021F ^ 0xFDF1;
        kotakbaz.rain.client.util.animations.b.f[0x2123 ^ 0x2064] = 0xA69B ^ 0x2064;
        kotakbaz.rain.client.util.animations.b.f[0x5F8A ^ 0x5F68] = 0xC859 ^ 0x5F68;
        kotakbaz.rain.client.util.animations.b.f[0x9229 ^ 0x920D] = 0x920D ^ 0x920D;
        kotakbaz.rain.client.util.animations.b.f[0x6083 ^ 0x601F] = 0x10A0 ^ 0x601F;
        kotakbaz.rain.client.util.animations.b.f[0x440F ^ 0x44D4] = 0x2DEE ^ 0x44D4;
        kotakbaz.rain.client.util.animations.b.f[0xDA4B ^ 0xDB13] = 0xDB16 ^ 0xDB13;
        kotakbaz.rain.client.util.animations.b.f[0xB2E ^ 0xB88] = 0xB0E5 ^ 0xB88;
        kotakbaz.rain.client.util.animations.b.f[0x6A12 ^ 0x6AE0] = 0x163C4 ^ 0x6AE0;
        kotakbaz.rain.client.util.animations.b.f[0x4BA2 ^ 0x4AB0] = 0x8281 ^ 0x4AB0;
        kotakbaz.rain.client.util.animations.b.f[0xE817 ^ 0xE941] = 0xE94C ^ 0xE941;
        kotakbaz.rain.client.util.animations.b.f[0x54B5 ^ 0x54F5] = 0x54E0 ^ 0x54F5;
        kotakbaz.rain.client.util.animations.b.f[0x53DC ^ 0x52B5] = 0xFFFFAD51 ^ 0x52B5;
        kotakbaz.rain.client.util.animations.b.f[0x7537 ^ 0x74B6] = 0x74A2 ^ 0x74B6;
        kotakbaz.rain.client.util.animations.b.f[0x203B ^ 0x2040] = 0x150A ^ 0x2040;
        kotakbaz.rain.client.util.animations.b.f[0xFC64 ^ 0xFCF4] = 0xA7FF ^ 0xFCF4;
        kotakbaz.rain.client.util.animations.b.f[0x74B3 ^ 0x7419] = 0x2B26 ^ 0x7419;
        kotakbaz.rain.client.util.animations.b.f[0x536E ^ 0x53EB] = 0x15E94 ^ 0x53EB;
        kotakbaz.rain.client.util.animations.b.f[0xC3B7 ^ 0xC2F9] = 0xC2F8 ^ 0xC2F9;
        kotakbaz.rain.client.util.animations.b.f[0x74FD ^ 0x7443] = 0xF0AC ^ 0x7443;
        kotakbaz.rain.client.util.animations.b.f[0x1066E ^ 0x10726] = 0x10727 ^ 0x10726;
        kotakbaz.rain.client.util.animations.b.f[0xD840 ^ 0xD8B3] = 0x1D193 ^ 0xD8B3;
        kotakbaz.rain.client.util.animations.b.f[0x339 ^ 0x33C] = 0xFFFFFCCD ^ 0x33C;
        kotakbaz.rain.client.util.animations.b.f[0x5E3A ^ 0x5EDC] = 0x5C8A ^ 0x5EDC;
        kotakbaz.rain.client.util.animations.b.f[0xA733 ^ 0xA643] = 0x5110 ^ 0xA643;
        kotakbaz.rain.client.util.animations.b.f[0x9B94 ^ 0x9B34] = 0x3981 ^ 0x9B34;
        kotakbaz.rain.client.util.animations.b.f[0x10B84 ^ 0x10B1C] = 0x1E3F1 ^ 0x10B1C;
        kotakbaz.rain.client.util.animations.b.f[0xF145 ^ 0xF001] = 0xFEA9 ^ 0xF001;
        kotakbaz.rain.client.util.animations.b.f[0xCEDB ^ 0xCF98] = 0x202F ^ 0xCF98;
        kotakbaz.rain.client.util.animations.b.f[0xDC49 ^ 0xDD45] = 0xFFFFA094 ^ 0xDD45;
        kotakbaz.rain.client.util.animations.b.f[0xA14D ^ 0xA104] = 0xA132 ^ 0xA104;
        kotakbaz.rain.client.util.animations.b.f[0xAF2E ^ 0xAFDF] = 0x88F ^ 0xAFDF;
        kotakbaz.rain.client.util.animations.b.f[0x578E ^ 0x571D] = 0x8216 ^ 0x571D;
        kotakbaz.rain.client.util.animations.b.f[0x9C27 ^ 0x9C4A] = 0x9C4A ^ 0x9C4A;
        kotakbaz.rain.client.util.animations.b.f[0x7788 ^ 0x7715] = 0x780 ^ 0x7715;
        kotakbaz.rain.client.util.animations.b.f[0x101FB ^ 0x10190] = 0x10191 ^ 0x10190;
        kotakbaz.rain.client.util.animations.b.f[0xFAE4 ^ 0xFB64] = 0xFB64 ^ 0xFB64;
        kotakbaz.rain.client.util.animations.b.f[0x83B5 ^ 0x82B3] = 0xFFE8 ^ 0x82B3;
        kotakbaz.rain.client.util.animations.b.f[0xEFCB ^ 0xEFAB] = 0xEF9A ^ 0xEFAB;
        kotakbaz.rain.client.util.animations.b.f[0x1C46 ^ 0x1D25] = 0x1D00 ^ 0x1D25;
        kotakbaz.rain.client.util.animations.b.f[0x8F08 ^ 0x8E35] = 0x9E46 ^ 0x8E35;
        kotakbaz.rain.client.util.animations.b.f[0xA2C ^ 0xA6F] = 0xFFFFF5C6 ^ 0xA6F;
        kotakbaz.rain.client.util.animations.b.f[0xEC56 ^ 0xEC6A] = 0xFFFF1396 ^ 0xEC6A;
        kotakbaz.rain.client.util.animations.b.f[0xE5B6 ^ 0xE521] = 0xDC5 ^ 0xE521;
        kotakbaz.rain.client.util.animations.b.f[0xDE2D ^ 0xDEF2] = 0x3B82 ^ 0xDEF2;
        kotakbaz.rain.client.util.animations.b.f[0xBE37 ^ 0xBE8E] = 0x7134 ^ 0xBE8E;
        kotakbaz.rain.client.util.animations.b.f[0x7B3 ^ 0x733] = 0x8A81 ^ 0x733;
        kotakbaz.rain.client.util.animations.b.f[0xDA5D ^ 0xDADC] = 0xFFFFA8FE ^ 0xDADC;
        kotakbaz.rain.client.util.animations.b.f[0x643B ^ 0x64F3] = 0x34B2 ^ 0x64F3;
        kotakbaz.rain.client.util.animations.b.f[0xD17C ^ 0xD1D7] = 0x9BA9 ^ 0xD1D7;
        kotakbaz.rain.client.util.animations.b.f[0xF21B ^ 0xF2F6] = 0x7D40 ^ 0xF2F6;
        kotakbaz.rain.client.util.animations.b.f[0xF191 ^ 0xF18B] = 0xFFFF0E5A ^ 0xF18B;
        kotakbaz.rain.client.util.animations.b.f[0x5B7C ^ 0x5BB8] = 0xFFFFFEA9 ^ 0x5BB8;
        kotakbaz.rain.client.util.animations.b.f[0xEF2C ^ 0xEFF1] = 0x86CB ^ 0xEFF1;
        kotakbaz.rain.client.util.animations.b.f[0x5555 ^ 0x5435] = 0x5431 ^ 0x5435;
        kotakbaz.rain.client.util.animations.b.f[0xC226 ^ 0xC258] = 0xF712 ^ 0xC258;
        kotakbaz.rain.client.util.animations.b.f[0x3DC8 ^ 0x3CB5] = 0x3CA5 ^ 0x3CB5;
        kotakbaz.rain.client.util.animations.b.f[0xB7FF ^ 0xB7DE] = 0xB7DE ^ 0xB7DE;
        kotakbaz.rain.client.util.animations.b.f[0xC223 ^ 0xC2A9] = 0x56D4 ^ 0xC2A9;
        kotakbaz.rain.client.util.animations.b.f[0x2516 ^ 0x2548] = 0xFFFFDAE9 ^ 0x2548;
        kotakbaz.rain.client.util.animations.b.f[0xCB8B ^ 0xCB7F] = 0x1C238 ^ 0xCB7F;
        kotakbaz.rain.client.util.animations.b.f[0x79C4 ^ 0x78D4] = 0xFFFF99CB ^ 0x78D4;
        kotakbaz.rain.client.util.animations.b.f[0xA81E ^ 0xA924] = 0xA924 ^ 0xA924;
        kotakbaz.rain.client.util.animations.b.f[0x89FF ^ 0x89A7] = 0xFFFF7646 ^ 0x89A7;
        kotakbaz.rain.client.util.animations.b.f[0x7616 ^ 0x76BB] = 0xFFFFC315 ^ 0x76BB;
        kotakbaz.rain.client.util.animations.b.f[0xFB77 ^ 0xFB7F] = 0xFFFF04BB ^ 0xFB7F;
        kotakbaz.rain.client.util.animations.b.f[0x2F69 ^ 0x2F50] = 0x2F46 ^ 0x2F50;
        kotakbaz.rain.client.util.animations.b.f[0xBAED ^ 0xBA9A] = 0x8C23 ^ 0xBA9A;
        kotakbaz.rain.client.util.animations.b.f[0xFE01 ^ 0xFE3A] = 0xFE55 ^ 0xFE3A;
        kotakbaz.rain.client.util.animations.b.f[0x9E34 ^ 0x9EDE] = 0x1170 ^ 0x9EDE;
        kotakbaz.rain.client.util.animations.b.f[0xDF7A ^ 0xDF18] = 0xFFFF20EF ^ 0xDF18;
        kotakbaz.rain.client.util.animations.b.f[0x11AB ^ 0x10D4] = 0x10D7 ^ 0x10D4;
        kotakbaz.rain.client.util.animations.b.f[0xE151 ^ 0xE157] = 0xE17C ^ 0xE157;
        kotakbaz.rain.client.util.animations.b.f[0x34FB ^ 0x346E] = 0xE133 ^ 0x346E;
        kotakbaz.rain.client.util.animations.b.f[0xD855 ^ 0xD96D] = 0xD96D ^ 0xD96D;
        kotakbaz.rain.client.util.animations.b.f[0x9263 ^ 0x9325] = 0x159A ^ 0x9325;
        kotakbaz.rain.client.util.animations.b.f[0x353C ^ 0x3521] = 0xFFFFCAC2 ^ 0x3521;
        kotakbaz.rain.client.util.animations.b.f[0x5946 ^ 0x58CC] = 0xBADD ^ 0x58CC;
        kotakbaz.rain.client.util.animations.b.f[0x62DE ^ 0x62B1] = 0x62B0 ^ 0x62B1;
        kotakbaz.rain.client.util.animations.b.f[0x108B ^ 0x11A5] = 0x11BA1 ^ 0x11A5;
        kotakbaz.rain.client.util.animations.b.f[0x716C ^ 0x7135] = 0x71ED ^ 0x7135;
        kotakbaz.rain.client.util.animations.b.f[0xC9F ^ 0xCEE] = 0xD572 ^ 0xCEE;
        kotakbaz.rain.client.util.animations.b.f[0x10C69 ^ 0x10CDD] = 0x1174C ^ 0x10CDD;
        kotakbaz.rain.client.util.animations.b.f[0x890F ^ 0x89A7] = 0xD698 ^ 0x89A7;
        kotakbaz.rain.client.util.animations.b.f[0x103F7 ^ 0x103F5] = 0xFFFEFC62 ^ 0x103F5;
        kotakbaz.rain.client.util.animations.b.f[0xB0A4 ^ 0xB08D] = 0x63F8 ^ 0xB08D;
        kotakbaz.rain.client.util.animations.b.f[0x3F60 ^ 0x3FA5] = 0x655C ^ 0x3FA5;
        kotakbaz.rain.client.util.animations.b.f[0xE310 ^ 0xE251] = 0xF467 ^ 0xE251;
        kotakbaz.rain.client.util.animations.b.f[0x772 ^ 0x60A] = 0x20E1 ^ 0x60A;
        kotakbaz.rain.client.util.animations.b.f[0x1076A ^ 0x1074C] = 0x1507E ^ 0x1074C;
        kotakbaz.rain.client.util.animations.b.f[0xA122 ^ 0xA00A] = 0xFFFF3336 ^ 0xA00A;
        kotakbaz.rain.client.util.animations.b.f[0xC427 ^ 0xC495] = 0xB96C ^ 0xC495;
        kotakbaz.rain.client.util.animations.b.f[0x4EEF ^ 0x4E41] = 0x431 ^ 0x4E41;
        kotakbaz.rain.client.util.animations.b.f[0x946 ^ 0x848] = 0x1684 ^ 0x848;
        kotakbaz.rain.client.util.animations.b.f[0xEA7B ^ 0xEB6D] = 0x7AE9 ^ 0xEB6D;
        kotakbaz.rain.client.util.animations.b.f[0x108AC ^ 0x10988] = 0x1FEC4 ^ 0x10988;
        kotakbaz.rain.client.util.animations.b.f[0x25B9 ^ 0x25A1] = 0xFFFFDA7D ^ 0x25A1;
        kotakbaz.rain.client.util.animations.b.f[0x77E0 ^ 0x76CC] = 0xFFFF215F ^ 0x76CC;
        kotakbaz.rain.client.util.animations.b.f[0x563C ^ 0x564F] = 0xF21D ^ 0x564F;
        kotakbaz.rain.client.util.animations.b.f[0x952F ^ 0x9425] = 0x1607 ^ 0x9425;
        kotakbaz.rain.client.util.animations.b.f[0x739D ^ 0x72BB] = 0x1E40 ^ 0x72BB;
        kotakbaz.rain.client.util.animations.b.f[0x8019 ^ 0x8088] = 0xFFFF2401 ^ 0x8088;
        kotakbaz.rain.client.util.animations.b.f[0x70FD ^ 0x71B1] = 0x71B6 ^ 0x71B1;
        kotakbaz.rain.client.util.animations.b.f[0xF609 ^ 0xF732] = 0xF720 ^ 0xF732;
        kotakbaz.rain.client.util.animations.b.f[0x8AA9 ^ 0x8B26] = 0x9EFA ^ 0x8B26;
        kotakbaz.rain.client.util.animations.b.f[0x89EB ^ 0x890B] = 0x6C0B ^ 0x890B;
        kotakbaz.rain.client.util.animations.b.f[0xB0AE ^ 0xB18B] = 0x46C1 ^ 0xB18B;
        kotakbaz.rain.client.util.animations.b.f[0xF25B ^ 0xF31B] = 0xD25D ^ 0xF31B;
        kotakbaz.rain.client.util.animations.b.f[0x4D44 ^ 0x4DA5] = 0xA8D5 ^ 0x4DA5;
        kotakbaz.rain.client.util.animations.b.f[0x97B7 ^ 0x9695] = 0x61CA ^ 0x9695;
        kotakbaz.rain.client.util.animations.b.f[0x7599 ^ 0x74E5] = 0x74E5 ^ 0x74E5;
        kotakbaz.rain.client.util.animations.b.f[0x9827 ^ 0x98D0] = 0xE94D ^ 0x98D0;
        kotakbaz.rain.client.util.animations.b.f[0x918A ^ 0x90E8] = 0x90E2 ^ 0x90E8;
        kotakbaz.rain.client.util.animations.b.f[0xA21E ^ 0xA343] = 0xFFFF5C97 ^ 0xA343;
        kotakbaz.rain.client.util.animations.b.f[0xDFAF ^ 0xDF7F] = 0xFFFF2B2B ^ 0xDF7F;
        kotakbaz.rain.client.util.animations.b.f[0x2F5C ^ 0x2E09] = 0x2E41 ^ 0x2E09;
        kotakbaz.rain.client.util.animations.b.f[0xD267 ^ 0xD360] = 0xAE2F ^ 0xD360;
        kotakbaz.rain.client.util.animations.b.f[0x921C ^ 0x934E] = 0x9347 ^ 0x934E;
        kotakbaz.rain.client.util.animations.b.f[0xFD78 ^ 0xFD49] = 0xFD49 ^ 0xFD49;
        kotakbaz.rain.client.util.animations.b.f[0xE9BA ^ 0xE996] = 0xE6AF ^ 0xE996;
        kotakbaz.rain.client.util.animations.b.f[0xC471 ^ 0xC45A] = 0x8DC2 ^ 0xC45A;
        kotakbaz.rain.client.util.animations.b.f[0x73C3 ^ 0x736C] = 0xE9D ^ 0x736C;
        kotakbaz.rain.client.util.animations.b.f[0x65CC ^ 0x6555] = 0x8D91 ^ 0x6555;
        kotakbaz.rain.client.util.animations.b.f[0x2991 ^ 0x296D] = 0xFFFFC830 ^ 0x296D;
        kotakbaz.rain.client.util.animations.b.f[0xDD24 ^ 0xDD3A] = 0xDD39 ^ 0xDD3A;
        kotakbaz.rain.client.util.animations.b.f[0xEFA3 ^ 0xEFB2] = 0xFFFF1028 ^ 0xEFB2;
        kotakbaz.rain.client.util.animations.b.f[0x9CC0 ^ 0x9C7D] = 0x6242 ^ 0x9C7D;
        kotakbaz.rain.client.util.animations.b.f[0xBAF ^ 0xA21] = 0x69BA ^ 0xA21;
        kotakbaz.rain.client.util.animations.b.f[0xECB8 ^ 0xEDF7] = 0xFFFF1208 ^ 0xEDF7;
        kotakbaz.rain.client.util.animations.b.f[0xF73A ^ 0xF74F] = 0xFFFFAC84 ^ 0xF74F;
        kotakbaz.rain.client.util.animations.b.f[0x4EB9 ^ 0x4E8D] = 0x4EB6 ^ 0x4E8D;
        kotakbaz.rain.client.util.animations.b.f[0xFC95 ^ 0xFCD0] = 0xFFFF0368 ^ 0xFCD0;
        kotakbaz.rain.client.util.animations.b.f[0xBE0D ^ 0xBE82] = 0xE583 ^ 0xBE82;
        kotakbaz.rain.client.util.animations.b.f[0x10026 ^ 0x1008F] = 0x15FF2 ^ 0x1008F;
        kotakbaz.rain.client.util.animations.b.f[0xD0F5 ^ 0xD1AF] = 0xD1A0 ^ 0xD1AF;
        kotakbaz.rain.client.util.animations.b.f[0x83D9 ^ 0x8254] = 0x5D6C ^ 0x8254;
        kotakbaz.rain.client.util.animations.b.f[0x7C89 ^ 0x7CCE] = 0xFFFF8311 ^ 0x7CCE;
        kotakbaz.rain.client.util.animations.b.f[0x962B ^ 0x9627] = 0xFFFF69B0 ^ 0x9627;
        kotakbaz.rain.client.util.animations.b.f[0xDF4C ^ 0xDF20] = 0xDF22 ^ 0xDF20;
        kotakbaz.rain.client.util.animations.b.f[0x2145 ^ 0x2019] = 0x201A ^ 0x2019;
        kotakbaz.rain.client.util.animations.b.f[0x757 ^ 0x794] = 0x5D6D ^ 0x794;
        kotakbaz.rain.client.util.animations.b.f[0xBB97 ^ 0xBB36] = 0x19D0 ^ 0xBB36;
        kotakbaz.rain.client.util.animations.b.f[0xA657 ^ 0xA7D3] = 0xF0F1 ^ 0xA7D3;
        kotakbaz.rain.client.util.animations.b.f[0x6189 ^ 0x61D8] = 0xFFFF9E1B ^ 0x61D8;
        kotakbaz.rain.client.util.animations.b.f[0x8CCD ^ 0x8DF3] = 0x6917 ^ 0x8DF3;
        kotakbaz.rain.client.util.animations.b.f[0xF78 ^ 0xFAA] = 0x4A36 ^ 0xFAA;
        kotakbaz.rain.client.util.animations.b.f[0x1BEA ^ 0x1AFD] = 0x8B62 ^ 0x1AFD;
        kotakbaz.rain.client.util.animations.b.f[0x5518 ^ 0x5504] = 0x5517 ^ 0x5504;
        kotakbaz.rain.client.util.animations.b.f[0xD63D ^ 0xD63D] = 0xFFFF299F ^ 0xD63D;
        kotakbaz.rain.client.util.animations.b.f[0x105E6 ^ 0x10555] = 0x10555 ^ 0x10555;
        kotakbaz.rain.client.util.animations.b.f[0xBA1 ^ 0xBA0] = 0xFFFFF468 ^ 0xBA0;
        kotakbaz.rain.client.util.animations.b.f[0xA685 ^ 0xA6AF] = 0x3C07 ^ 0xA6AF;
        kotakbaz.rain.client.util.animations.b.f[0xBFA8 ^ 0xBEA7] = 0xA072 ^ 0xBEA7;
        kotakbaz.rain.client.util.animations.b.f[0x37C1 ^ 0x364D] = 0xDC15 ^ 0x364D;
        kotakbaz.rain.client.util.animations.b.f[0xEAA3 ^ 0xEBDA] = 0xC4C7 ^ 0xEBDA;
        kotakbaz.rain.client.util.animations.b.f[0xDB35 ^ 0xDA2B] = 0x5ED6 ^ 0xDA2B;
        kotakbaz.rain.client.util.animations.b.f[0xA30 ^ 0xA0D] = 0xFFFFF59B ^ 0xA0D;
        kotakbaz.rain.client.util.animations.b.f[0x2A2C ^ 0x2A54] = 0x1CEB ^ 0x2A54;
        kotakbaz.rain.client.util.animations.b.f[0x6EA6 ^ 0x6E05] = 0xD569 ^ 0x6E05;
        kotakbaz.rain.client.util.animations.b.f[0x6D33 ^ 0x6D05] = 0xFFFF92C8 ^ 0x6D05;
        kotakbaz.rain.client.util.animations.b.f[0x6285 ^ 0x6266] = 0xF55A ^ 0x6266;
        kotakbaz.rain.client.util.animations.b.f[0x2F55 ^ 0x2F47] = 0xFFFFD0F4 ^ 0x2F47;
        kotakbaz.rain.client.util.animations.b.f[0x6079 ^ 0x6011] = 0xFFFF9FD7 ^ 0x6011;
        kotakbaz.rain.client.util.animations.b.f[0xAB31 ^ 0xABD8] = 0xA99D ^ 0xABD8;
        kotakbaz.rain.client.util.animations.b.f[0x633C ^ 0x63A6] = 0x8B4B ^ 0x63A6;
        kotakbaz.rain.client.util.animations.b.f[0x21E5 ^ 0x2152] = 0xEEE8 ^ 0x2152;
        kotakbaz.rain.client.util.animations.b.f[0xEE3A ^ 0xEF0E] = 0xFFFF3B01 ^ 0xEF0E;
        kotakbaz.rain.client.util.animations.b.f[0xF286 ^ 0xF2FF] = 0xC429 ^ 0xF2FF;
        kotakbaz.rain.client.util.animations.b.f[0x39F2 ^ 0x3909] = 0x27B0 ^ 0x3909;
        kotakbaz.rain.client.util.animations.b.f[0x10D47 ^ 0x10DBA] = 0x11303 ^ 0x10DBA;
        kotakbaz.rain.client.util.animations.b.f[0x2A37 ^ 0x2A9B] = 0x60EB ^ 0x2A9B;
        kotakbaz.rain.client.util.animations.b.f[0xC29B ^ 0xC3D2] = 0xC3C2 ^ 0xC3D2;
        kotakbaz.rain.client.util.animations.b.f[0xF34C ^ 0xF3A0] = 0x7C08 ^ 0xF3A0;
        kotakbaz.rain.client.util.animations.b.f[0x5CCE ^ 0x5CBA] = 0xF8EC ^ 0x5CBA;
        kotakbaz.rain.client.util.animations.b.f[0xD788 ^ 0xD69D] = 0x1EA3 ^ 0xD69D;
        kotakbaz.rain.client.util.animations.b.f[0xB4E0 ^ 0xB563] = 0x9BC1 ^ 0xB563;
        kotakbaz.rain.client.util.animations.b.f[0x3EBC ^ 0x3E91] = 0x717B ^ 0x3E91;
        kotakbaz.rain.client.util.animations.b.f[0x10C31 ^ 0x10C95] = 0x1B7F8 ^ 0x10C95;
        kotakbaz.rain.client.util.animations.b.f[0x7012 ^ 0x709A] = 0xE4E7 ^ 0x709A;
        kotakbaz.rain.client.util.animations.b.f[0x2B5B ^ 0x2BBF] = 0xBCC3 ^ 0x2BBF;
        kotakbaz.rain.client.util.animations.b.f[0x3269 ^ 0x3340] = 0x5FA5 ^ 0x3340;
        kotakbaz.rain.client.util.animations.b.f[0xD5F4 ^ 0xD53A] = 0xDE93 ^ 0xD53A;
        kotakbaz.rain.client.util.animations.b.f[0xB8C ^ 0xAFA] = 0xBFA3 ^ 0xAFA;
        kotakbaz.rain.client.util.animations.b.f[0xF08C ^ 0xF191] = 0x944C ^ 0xF191;
        kotakbaz.rain.client.util.animations.b.f[0xAA66 ^ 0xABEF] = 0xCAFF ^ 0xABEF;
        kotakbaz.rain.client.util.animations.b.f[0x6709 ^ 0x6753] = 0x6714 ^ 0x6753;
        kotakbaz.rain.client.util.animations.b.f[0xD675 ^ 0xD778] = 0x5552 ^ 0xD778;
        kotakbaz.rain.client.util.animations.b.f[0xC4D3 ^ 0xC4B9] = 0xFFFF3B1D ^ 0xC4B9;
        kotakbaz.rain.client.util.animations.b.f[0xD17E ^ 0xD01A] = 0xD012 ^ 0xD01A;
        kotakbaz.rain.client.util.animations.b.f[0x588 ^ 0x4E7] = 0x28C5 ^ 0x4E7;
        kotakbaz.rain.client.util.animations.b.f[0x10F4E ^ 0x10EC9] = 0x17F21 ^ 0x10EC9;
        kotakbaz.rain.client.util.animations.b.f[0x69F0 ^ 0x69B4] = 0xFFFF9653 ^ 0x69B4;
        kotakbaz.rain.client.util.animations.b.f[0x1D6 ^ 0x85] = 0xFFFFFF1C ^ 0x85;
        kotakbaz.rain.client.util.animations.b.f[0xAC79 ^ 0xACBB] = 0xF65E ^ 0xACBB;
        kotakbaz.rain.client.util.animations.b.f[0x1099 ^ 0x1185] = 0x747F ^ 0x1185;
        kotakbaz.rain.client.util.animations.b.f[0xB40A ^ 0xB4DD] = 0xF88 ^ 0xB4DD;
        kotakbaz.rain.client.util.animations.b.f[0x403F ^ 0x414B] = 0x2E72 ^ 0x414B;
        kotakbaz.rain.client.util.animations.b.f[0x74EB ^ 0x748F] = 0x74E3 ^ 0x748F;
        kotakbaz.rain.client.util.animations.b.f[0xB6FC ^ 0xB6DE] = 0xB6DC ^ 0xB6DE;
        kotakbaz.rain.client.util.animations.b.f[0x4367 ^ 0x4357] = 0xFEA8 ^ 0x4357;
        kotakbaz.rain.client.util.animations.b.f[0xFB2E ^ 0xFB75] = 0xFFFF04F4 ^ 0xFB75;
        kotakbaz.rain.client.util.animations.b.f[0x237D ^ 0x23EB] = 0xF6E5 ^ 0x23EB;
        kotakbaz.rain.client.util.animations.b.f[0x614E ^ 0x6147] = 0xFFFF9EC5 ^ 0x6147;
        kotakbaz.rain.client.util.animations.b.f[0x8FA9 ^ 0x8FE3] = 0x8FDA ^ 0x8FE3;
        kotakbaz.rain.client.util.animations.b.f[0x9773 ^ 0x966A] = 0x7F5 ^ 0x966A;
        kotakbaz.rain.client.util.animations.b.f[0x1138 ^ 0x103A] = 0x5B22 ^ 0x103A;
        kotakbaz.rain.client.util.animations.b.f[0xE4AB ^ 0xE483] = 0xEFE6 ^ 0xE483;
        kotakbaz.rain.client.util.animations.b.f[0xAB72 ^ 0xABC2] = 0xD63B ^ 0xABC2;
        kotakbaz.rain.client.util.animations.b.f[0x9B63 ^ 0x9BC1] = 0x3974 ^ 0x9BC1;
        kotakbaz.rain.client.util.animations.b.f[0xF9B3 ^ 0xF8DD] = 0xF8DE ^ 0xF8DD;
        kotakbaz.rain.client.util.animations.b.f[0x7C2 ^ 0x6C2] = 0xFFFEFC2F ^ 0x6C2;
        kotakbaz.rain.client.util.animations.b.f[0x106C5 ^ 0x107CD] = 0x17AC3 ^ 0x107CD;
        kotakbaz.rain.client.util.animations.b.f[0x69D0 ^ 0x6929] = 0x18B4 ^ 0x6929;
        kotakbaz.rain.client.util.animations.b.f[0x3491 ^ 0x34F0] = 0x34CF ^ 0x34F0;
        kotakbaz.rain.client.util.animations.b.f[0xC738 ^ 0xC7BE] = 0x1CA9A ^ 0xC7BE;
        kotakbaz.rain.client.util.animations.b.f[0xB063 ^ 0xB08B] = 0xB283 ^ 0xB08B;
        kotakbaz.rain.client.util.animations.b.f[0xA519 ^ 0xA558] = 0xA52C ^ 0xA558;
        kotakbaz.rain.client.util.animations.b.f[0x6485 ^ 0x64D6] = 0x64C7 ^ 0x64D6;
        kotakbaz.rain.client.util.animations.b.f[0xB139 ^ 0xB023] = 0xD5F5 ^ 0xB023;
        kotakbaz.rain.client.util.animations.b.f[0xE298 ^ 0xE3E2] = 0xBA1C ^ 0xE3E2;
        kotakbaz.rain.client.util.animations.b.f[0xB84F ^ 0xB976] = 0xB977 ^ 0xB976;
        kotakbaz.rain.client.util.animations.b.f[0x7137 ^ 0x718B] = 0x8F82 ^ 0x718B;
        kotakbaz.rain.client.util.animations.b.f[0xFE3A ^ 0xFF56] = 0xFF54 ^ 0xFF56;
        kotakbaz.rain.client.util.animations.b.f[0x4279 ^ 0x4368] = 0x5DBD ^ 0x4368;
        kotakbaz.rain.client.util.animations.b.f[0xA2B0 ^ 0xA385] = 0x8874 ^ 0xA385;
        kotakbaz.rain.client.util.animations.b.f[0x6E70 ^ 0x6EA8] = 0xFFFF2A73 ^ 0x6EA8;
        kotakbaz.rain.client.util.animations.b.f[0x4668 ^ 0x473F] = 0x472A ^ 0x473F;
        kotakbaz.rain.client.util.animations.b.f[0x2657 ^ 0x275E] = 0x5A11 ^ 0x275E;
        kotakbaz.rain.client.util.animations.b.f[0x27BB ^ 0x277C] = 0x7737 ^ 0x277C;
        kotakbaz.rain.client.util.animations.b.f[0xB78A ^ 0xB741] = 0x9B42 ^ 0xB741;
        kotakbaz.rain.client.util.animations.b.f[0x8E4B ^ 0x8EFE] = 0x954F ^ 0x8EFE;
        kotakbaz.rain.client.util.animations.b.f[0xCD48 ^ 0xCD91] = 0x76C4 ^ 0xCD91;
        kotakbaz.rain.client.util.animations.b.f[0x109FF ^ 0x10874] = 0x10342 ^ 0x10874;
        kotakbaz.rain.client.util.animations.b.f[0x30A1 ^ 0x31DA] = 0x31D8 ^ 0x31DA;
        kotakbaz.rain.client.util.animations.b.f[0xAC0D ^ 0xAC64] = 0xFFFF53DA ^ 0xAC64;
        kotakbaz.rain.client.util.animations.b.f[0xEC96 ^ 0xEDE3] = 0xEF0A ^ 0xEDE3;
        kotakbaz.rain.client.util.animations.b.f[0xEA35 ^ 0xEB52] = 0xFFFF148C ^ 0xEB52;
        kotakbaz.rain.client.util.animations.b.f[0xEA82 ^ 0xEBE7] = 0xFFFF1469 ^ 0xEBE7;
        kotakbaz.rain.client.util.animations.b.f[0x3DAE ^ 0x3D68] = 0x6D2A ^ 0x3D68;
        kotakbaz.rain.client.util.animations.b.f[0xE847 ^ 0xE849] = 0xFFFF17CA ^ 0xE849;
        kotakbaz.rain.client.util.animations.b.f[0x6D32 ^ 0x6DA6] = 0xB8A8 ^ 0x6DA6;
        kotakbaz.rain.client.util.animations.b.f[0x7F6D ^ 0x7FA0] = 0x53A3 ^ 0x7FA0;
        kotakbaz.rain.client.util.animations.b.f[0x5E34 ^ 0x5E68] = 0xFFFFA155 ^ 0x5E68;
        kotakbaz.rain.client.util.animations.b.f[0xE80 ^ 0xE3B] = 0xF004 ^ 0xE3B;
        kotakbaz.rain.client.util.animations.b.f[0xF57E ^ 0xF569] = 0xFFFF0AFE ^ 0xF569;
        kotakbaz.rain.client.util.animations.b.f[0x4B55 ^ 0x4BC7] = 0x10CC ^ 0x4BC7;
        kotakbaz.rain.client.util.animations.b.f[0xF15 ^ 0xF0A] = 0xF0A ^ 0xF0A;
        kotakbaz.rain.client.util.animations.b.f[0xD1EA ^ 0xD0F9] = 0x18C7 ^ 0xD0F9;
        kotakbaz.rain.client.util.animations.b.f[0x9F67 ^ 0x9E63] = 0xD548 ^ 0x9E63;
        kotakbaz.rain.client.util.animations.b.f[0x8B86 ^ 0x8AD8] = 0x8AD6 ^ 0x8AD8;
        kotakbaz.rain.client.util.animations.b.f[0x715D ^ 0x71D4] = 0xFFFF1A6B ^ 0x71D4;
        kotakbaz.rain.client.util.animations.b.f[0x8A25 ^ 0x8B24] = 0x18E1D ^ 0x8B24;
        kotakbaz.rain.client.util.animations.b.f[0x6D3 ^ 0x7CC] = 0x832B ^ 0x7CC;
        kotakbaz.rain.client.util.animations.b.f[0xAB5E ^ 0xABDD] = 0x1A6F2 ^ 0xABDD;
        kotakbaz.rain.client.util.animations.b.f[0xA143 ^ 0xA018] = 0xFFFF5FFA ^ 0xA018;
        kotakbaz.rain.client.util.animations.b.f[0xA5C2 ^ 0xA508] = 0x891B ^ 0xA508;
        kotakbaz.rain.client.util.animations.b.f[0x471A ^ 0x4756] = 0x4760 ^ 0x4756;
        kotakbaz.rain.client.util.animations.b.f[0x4BBF ^ 0x4BC5] = 0x7D7A ^ 0x4BC5;
        kotakbaz.rain.client.util.animations.b.f[0xE659 ^ 0xE7DC] = 0x9D9F ^ 0xE7DC;
        kotakbaz.rain.client.util.animations.b.f[0xC165 ^ 0xC137] = 0xC109 ^ 0xC137;
        kotakbaz.rain.client.util.animations.b.f[0x10E76 ^ 0x10F01] = 0x13E88 ^ 0x10F01;
        kotakbaz.rain.client.util.animations.b.f[0x1128 ^ 0x1138] = 0x112D ^ 0x1138;
        kotakbaz.rain.client.util.animations.b.f[0x8329 ^ 0x8391] = 0x4C71 ^ 0x8391;
        kotakbaz.rain.client.util.animations.b.f[0xB305 ^ 0xB325] = 0xB324 ^ 0xB325;
        kotakbaz.rain.client.util.animations.b.f[0x86FD ^ 0x8647] = 0x787B ^ 0x8647;
        kotakbaz.rain.client.util.animations.b.f[0x1CEC ^ 0x1C93] = 0x9122 ^ 0x1C93;
        kotakbaz.rain.client.util.animations.b.f[0xD176 ^ 0xD10A] = 0xE440 ^ 0xD10A;
        kotakbaz.rain.client.util.animations.b.f[0x167C ^ 0x165B] = 0x8808 ^ 0x165B;
        kotakbaz.rain.client.util.animations.b.f[0x2EC1 ^ 0x2EF2] = 0x2ED1 ^ 0x2EF2;
        kotakbaz.rain.client.util.animations.b.f[0x78AA ^ 0x7885] = 0x5A0E ^ 0x7885;
        kotakbaz.rain.client.util.animations.b.f[0x1BA5 ^ 0x1BF5] = 0xFFFFE404 ^ 0x1BF5;
        kotakbaz.rain.client.util.animations.b.f[0x9800 ^ 0x98EB] = 0x175D ^ 0x98EB;
        kotakbaz.rain.client.util.animations.b.f[0x8C96 ^ 0x8DCF] = 0x8DD0 ^ 0x8DCF;
        kotakbaz.rain.client.util.animations.b.f[0x2433 ^ 0x2482] = 0x591E ^ 0x2482;
        kotakbaz.rain.client.util.animations.b.f[0xB31D ^ 0xB24C] = 0xFFFF4D80 ^ 0xB24C;
        kotakbaz.rain.client.util.animations.b.f[0x522 ^ 0x51D] = 0xFFFFFA91 ^ 0x51D;
        kotakbaz.rain.client.util.animations.b.f[0xB1C0 ^ 0xB0F6] = 0xB0F6 ^ 0xB0F6;
        kotakbaz.rain.client.util.animations.b.f[0xAA8A ^ 0xAAC1] = 0xAAE2 ^ 0xAAC1;
        kotakbaz.rain.client.util.animations.b.f[0x2F74 ^ 0x2F21] = 0x2F3C ^ 0x2F21;
        kotakbaz.rain.client.util.animations.b.f[0x5468 ^ 0x5548] = 0xFFFF2E70 ^ 0x5548;
        kotakbaz.rain.client.util.animations.b.f[0x393B ^ 0x3870] = 0xFFFFC7B8 ^ 0x3870;
        kotakbaz.rain.client.util.animations.b.f[0x4955 ^ 0x4956] = 0xFFFFB685 ^ 0x4956;
        kotakbaz.rain.client.util.animations.b.f[0x4F92 ^ 0x4FCD] = 0x4F9D ^ 0x4FCD;
        kotakbaz.rain.client.util.animations.b.f[0x4E25 ^ 0x4F0F] = 0xE75C ^ 0x4F0F;
        kotakbaz.rain.client.util.animations.b.f[0xD520 ^ 0xD517] = 0xFFFF2AF0 ^ 0xD517;
        kotakbaz.rain.client.util.animations.b.f[0x97D3 ^ 0x9712] = 0x13F7 ^ 0x9712;
        kotakbaz.rain.client.util.animations.b.f[0x5032 ^ 0x510D] = 0x11F9 ^ 0x510D;
        kotakbaz.rain.client.util.animations.b.f[0x262 ^ 0x34F] = 0xAB0B ^ 0x34F;
        kotakbaz.rain.client.util.animations.b.f[0xBB87 ^ 0xBB91] = 0xFFFF441F ^ 0xBB91;
        kotakbaz.rain.client.util.animations.b.f[0x96F1 ^ 0x9616] = 0x9453 ^ 0x9616;
        kotakbaz.rain.client.util.animations.b.f[0x4AB6 ^ 0x4A4C] = 0x54E3 ^ 0x4A4C;
        kotakbaz.rain.client.util.animations.b.f[0x1615 ^ 0x1658] = 0xFFFFE9B2 ^ 0x1658;
        kotakbaz.rain.client.util.animations.b.f[0xCB57 ^ 0xCB74] = 0xCB74 ^ 0xCB74;
        kotakbaz.rain.client.util.animations.b.f[0x30CD ^ 0x31E6] = 0x99A2 ^ 0x31E6;
        kotakbaz.rain.client.util.animations.b.f[0x4FF8 ^ 0x4FCA] = 0x4FF2 ^ 0x4FCA;
        kotakbaz.rain.client.util.animations.b.f[0x4E98 ^ 0x4FAA] = 0x6449 ^ 0x4FAA;
        kotakbaz.rain.client.util.animations.b.f[0xCA1 ^ 0xC2F] = 0x21A1 ^ 0xC2F;
        kotakbaz.rain.client.util.animations.b.f[0xCE11 ^ 0xCEE9] = 0xBF56 ^ 0xCEE9;
        kotakbaz.rain.client.util.animations.b.f[0x4F70 ^ 0x4FD5] = 0xFFFF0B7D ^ 0x4FD5;
        kotakbaz.rain.client.util.animations.b.f[0xCE81 ^ 0xCE94] = 0xCE9E ^ 0xCE94;
        kotakbaz.rain.client.util.animations.b.f[0x4EB4 ^ 0x4E8A] = 0xFFFFB11D ^ 0x4E8A;
        kotakbaz.rain.client.util.animations.b.f[0x107AE ^ 0x106C5] = 0x107C5 ^ 0x106C5;
        kotakbaz.rain.client.util.animations.b.f[0xD390 ^ 0xD2FD] = 0xD2FD ^ 0xD2FD;
        kotakbaz.rain.client.util.animations.b.f[0x1B07 ^ 0x1A34] = 0x31C5 ^ 0x1A34;
        kotakbaz.rain.client.util.animations.b.f[0x9CAF ^ 0x9DAA] = 0xD6B4 ^ 0x9DAA;
        kotakbaz.rain.client.util.animations.b.f[0xA3D ^ 0xAA6] = 0x7A16 ^ 0xAA6;
        kotakbaz.rain.client.util.animations.b.f[0x243F ^ 0x24A1] = 0x541E ^ 0x24A1;
        kotakbaz.rain.client.util.animations.b.f[0x83DC ^ 0x83F2] = 0x9F98 ^ 0x83F2;
        kotakbaz.rain.client.util.animations.b.f[0xD427 ^ 0xD4C9] = 0x7398 ^ 0xD4C9;
        kotakbaz.rain.client.util.animations.b.f[0xA06D ^ 0xA082] = 0x7D2 ^ 0xA082;
        kotakbaz.rain.client.util.animations.b.f[0xD11E ^ 0xD1CB] = 0x9450 ^ 0xD1CB;
        kotakbaz.rain.client.util.animations.b.f[0x5723 ^ 0x5706] = 0x572A ^ 0x5706;
        kotakbaz.rain.client.util.animations.b.f[0x52EB ^ 0x52F8] = 0x52EC ^ 0x52F8;
        kotakbaz.rain.client.util.animations.b.f[0xBDB4 ^ 0xBD67] = 0xF8FC ^ 0xBD67;
        kotakbaz.rain.client.util.animations.b.f[0xFE12 ^ 0xFF60] = 0xFDD5 ^ 0xFF60;
        kotakbaz.rain.client.util.animations.b.f[0x66C3 ^ 0x67F4] = 0x67F4 ^ 0x67F4;
        kotakbaz.rain.client.util.animations.b.f[0x7482 ^ 0x75CF] = 0xFFFF8A6A ^ 0x75CF;
        kotakbaz.rain.client.util.animations.b.f[0x1ABD ^ 0x1BCC] = 0xF1A9 ^ 0x1BCC;
        kotakbaz.rain.client.util.animations.b.f[0x9B49 ^ 0x9A51] = 0xFFFFF414 ^ 0x9A51;
        kotakbaz.rain.client.util.animations.b.f[0xC1D8 ^ 0xC127] = 0x1C41E ^ 0xC127;
        kotakbaz.rain.client.util.animations.b.f[0xEF10 ^ 0xEF75] = 0xFFFF10FD ^ 0xEF75;
        kotakbaz.rain.client.util.animations.b.f[0xF2E2 ^ 0xF3B6] = 0xF3B4 ^ 0xF3B6;
        kotakbaz.rain.client.util.animations.b.f[0xB6E0 ^ 0xB6FB] = 0xB6ED ^ 0xB6FB;
        kotakbaz.rain.client.util.animations.b.f[0x7D3C ^ 0x7C1B] = 0x10FE ^ 0x7C1B;
        kotakbaz.rain.client.util.animations.b.f[0xB509 ^ 0xB402] = 0x3628 ^ 0xB402;
        kotakbaz.rain.client.util.animations.b.f[0xAFCF ^ 0xAEB1] = 0xAEA1 ^ 0xAEB1;
        kotakbaz.rain.client.util.animations.b.f[0xCC1A ^ 0xCD58] = 0xA22E ^ 0xCD58;
        kotakbaz.rain.client.util.animations.b.f[0x304C ^ 0x3157] = 0x548A ^ 0x3157;
        kotakbaz.rain.client.util.animations.b.f[0x740F ^ 0x750C] = 0x3E12 ^ 0x750C;
        kotakbaz.rain.client.util.animations.b.f[0x10AA5 ^ 0x10AF8] = 0xFFFEF544 ^ 0x10AF8;
        kotakbaz.rain.client.util.animations.b.f[0xF5E0 ^ 0xF481] = 0xFFFF0B18 ^ 0xF481;
        kotakbaz.rain.client.util.animations.b.f[0x4B61 ^ 0x4B1C] = 0xFFFF81EE ^ 0x4B1C;
        kotakbaz.rain.client.util.animations.b.f[0xA3C6 ^ 0xA2F6] = 0x1A8F1 ^ 0xA2F6;
        kotakbaz.rain.client.util.animations.b.f[0x9633 ^ 0x9727] = 0x5F39 ^ 0x9727;
        kotakbaz.rain.client.util.animations.b.f[0xAD6 ^ 0xA94] = 0xFFFFF569 ^ 0xA94;
        kotakbaz.rain.client.util.animations.b.f[0x4CBA ^ 0x4C31] = 0x61B8 ^ 0x4C31;
        kotakbaz.rain.client.util.animations.b.f[0x5304 ^ 0x53CD] = 0x386 ^ 0x53CD;
        kotakbaz.rain.client.util.animations.b.f[0x4352 ^ 0x431C] = 0x433C ^ 0x431C;
        kotakbaz.rain.client.util.animations.b.f[0x30B3 ^ 0x3073] = 0xFFFF4B37 ^ 0x3073;
        kotakbaz.rain.client.util.animations.b.f[0x5915 ^ 0x587D] = 0x587B ^ 0x587D;
        kotakbaz.rain.client.util.animations.b.f[0x991D ^ 0x996F] = 0x40E3 ^ 0x996F;
        kotakbaz.rain.client.util.animations.b.f[0x559B ^ 0x55CD] = 0xFFFFAA26 ^ 0x55CD;
        kotakbaz.rain.client.util.animations.b.f[0x2D7B ^ 0x2C2B] = 0x2C20 ^ 0x2C2B;
        kotakbaz.rain.client.util.animations.b.f[0xB5AD ^ 0xB52F] = 0x389D ^ 0xB52F;
        kotakbaz.rain.client.util.animations.b.f[0xB8B7 ^ 0xB86B] = 0xFFFF2EE9 ^ 0xB86B;
        kotakbaz.rain.client.util.animations.b.f[0x692E ^ 0x69A3] = 0xFFFFBBF1 ^ 0x69A3;
        kotakbaz.rain.client.util.animations.b.f[0xB552 ^ 0xB463] = 0x1BE62 ^ 0xB463;
        kotakbaz.rain.client.util.animations.b.f[0xA5B8 ^ 0xA5D6] = 0xA5D7 ^ 0xA5D6;
        kotakbaz.rain.client.util.animations.b.f[0xF741 ^ 0xF795] = 0xFFFF4DD8 ^ 0xF795;
        kotakbaz.rain.client.util.animations.b.f[0x6892 ^ 0x6835] = 0x3707 ^ 0x6835;
        kotakbaz.rain.client.util.animations.b.f[0x10534 ^ 0x1047E] = 0x1047E ^ 0x1047E;
        kotakbaz.rain.client.util.animations.b.f[0x4DF5 ^ 0x4D83] = 0xE9D5 ^ 0x4D83;
        kotakbaz.rain.client.util.animations.b.f[0x10965 ^ 0x10906] = 0x10945 ^ 0x10906;
        kotakbaz.rain.client.util.animations.b.f[0xC11 ^ 0xC24] = 0xFFFFF3D0 ^ 0xC24;
        kotakbaz.rain.client.util.animations.b.f[0x10A9F ^ 0x10AF9] = 0x10AD0 ^ 0x10AF9;
        kotakbaz.rain.client.util.animations.b.f[0xC799 ^ 0xC7E9] = 0xC7E9 ^ 0xC7E9;
        kotakbaz.rain.client.util.animations.b.f[0xFF52 ^ 0xFEDA] = 0x5175 ^ 0xFEDA;
        kotakbaz.rain.client.util.animations.b.f[0xBF4E ^ 0xBF44] = 0xBF65 ^ 0xBF44;
        kotakbaz.rain.client.util.animations.b.f[0xE610 ^ 0xE644] = 0xFFFF19B6 ^ 0xE644;
        kotakbaz.rain.client.util.animations.b.f[0x2D08 ^ 0x2D47] = 0x2D11 ^ 0x2D47;
        kotakbaz.rain.client.util.animations.b.f[0xEB69 ^ 0xEB99] = 0xFFFFB313 ^ 0xEB99;
        kotakbaz.rain.client.util.animations.b.f[0x93F7 ^ 0x92D6] = 0x1631 ^ 0x92D6;
        kotakbaz.rain.client.util.animations.b.f[0x79E7 ^ 0x78C4] = 0x8F8E ^ 0x78C4;
        kotakbaz.rain.client.util.animations.b.f[0xFA21 ^ 0xFA2C] = 0xFA3F ^ 0xFA2C;
        kotakbaz.rain.client.util.animations.b.f[0x83EE ^ 0x836A] = 0x18E4E ^ 0x836A;
        kotakbaz.rain.client.util.animations.b.f[0x7EB2 ^ 0x7F30] = 0x74B1 ^ 0x7F30;
        kotakbaz.rain.client.util.animations.b.f[0x22C4 ^ 0x220B] = 0x29AE ^ 0x220B;
        kotakbaz.rain.client.util.animations.b.f[0xB3E7 ^ 0xB261] = 0xDCE4 ^ 0xB261;
        kotakbaz.rain.client.util.animations.b.f[0x8E36 ^ 0x8F5C] = 0x8F5B ^ 0x8F5C;
        kotakbaz.rain.client.util.animations.b.f[0xE526 ^ 0xE5D0] = 0x944D ^ 0xE5D0;
        kotakbaz.rain.client.util.animations.b.f[0xBBC9 ^ 0xBB81] = 0xFFFF4448 ^ 0xBB81;
        kotakbaz.rain.client.util.animations.b.f[0x107C3 ^ 0x107FB] = 0x10774 ^ 0x107FB;
        kotakbaz.rain.client.util.animations.b.f[0x102F2 ^ 0x10228] = 0x16B0D ^ 0x10228;
        kotakbaz.rain.client.util.animations.b.f[0x172 ^ 0x187] = 0x108A7 ^ 0x187;
        kotakbaz.rain.client.util.animations.b.f[0x6239 ^ 0x6220] = 0xFFFF9DD4 ^ 0x6220;
        kotakbaz.rain.client.util.animations.b.f[0xA7BC ^ 0xA759] = 0x3065 ^ 0xA759;
        kotakbaz.rain.client.util.animations.b.f[0x5A5D ^ 0x5ADA] = 0xCEA5 ^ 0x5ADA;
        kotakbaz.rain.client.util.animations.b.f[0x53EE ^ 0x53FA] = 0xFFFFAC39 ^ 0x53FA;
        kotakbaz.rain.client.util.animations.b.f[0x304F ^ 0x3040] = 0xFFFFCFC5 ^ 0x3040;
        kotakbaz.rain.client.util.animations.b.f[0xEA52 ^ 0xEB7D] = 0x1E17C ^ 0xEB7D;
        kotakbaz.rain.client.util.animations.b.f[0x69FE ^ 0x6928] = 0xD273 ^ 0x6928;
        kotakbaz.rain.client.util.animations.b.f[0x2545 ^ 0x2423] = 0x242F ^ 0x2423;
        kotakbaz.rain.client.util.animations.b.f[0xDCCB ^ 0xDC8D] = 0xDCA3 ^ 0xDC8D;
    }
}

