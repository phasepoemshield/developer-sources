/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_2561
 *  net.minecraft.class_2572
 *  net.minecraft.class_2583
 *  net.minecraft.class_2588
 *  net.minecraft.class_5251
 *  net.minecraft.class_7417
 *  net.minecraft.class_8828$class_2585
 */
package kotakbaz.rain.client.util.other;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.util.other.D;
import kotakbaz.rain.client.util.other.c_0;
import kotakbaz.rain.client.util.render.font.f;
import kotakbaz.rain.client.util.render.font.f_0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.class_2561;
import net.minecraft.class_2572;
import net.minecraft.class_2583;
import net.minecraft.class_2588;
import net.minecraft.class_5251;
import net.minecraft.class_7417;
import net.minecraft.class_8828;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u0013\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\n8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Lkotakbaz/rain/client/util/other/TextUtil;", "", "<init>", "()V", "Lnet/minecraft/class_2561;", "text", "", "Lkotakbaz/rain/client/util/render/font/MsdfGlyph$ColoredGlyph;", "parseTextToColoredGlyphs", "(Lnet/minecraft/class_2561;)Ljava/util/List;", "", "currentColor", "", "out", "", "parseTextRecursive", "(Lnet/minecraft/class_2561;ILjava/util/List;)V", "CACHE_LIMIT", "I", "kotakbaz/rain/client/util/other/TextUtil$glyphCache$1", "glyphCache", "Lkotakbaz/rain/client/util/other/TextUtil$glyphCache$1;", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTextUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextUtil.kt\nkotakbaz/rain/client/util/other/TextUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,65:1\n1#2:66\n*E\n"})
public final class A {
    @NotNull
    public static final A INSTANCE;
    private static final int a = 1000;
    @NotNull
    private static final c_0 A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private A() {
        super();
    }

    @NotNull
    public final List<f_0> parseTextToColoredGlyphs(@NotNull class_2561 class_25612) {
        long l = -4684630741725262237L;
        int n = D[0];
        n += D[1];
        Intrinsics.checkNotNullParameter(class_25612, (String)b[n -= D[2]]);
        List list = (List)A.get((Object)class_25612);
        if (list != null) {
            List list2 = list;
            long l2 = l;
            int n2 = D[3];
            n2 += D[4];
            l = l2 ^ (0L ^ l2) & -1L << (n2 += D[5]);
            return list2;
        }
        ArrayList arrayList = new ArrayList(class_25612.getString().length());
        int n3 = D[6];
        n3 ^= D[7];
        this.parseTextRecursive(class_25612, n3 -= D[8], arrayList);
        ((Map)A).put(class_25612, arrayList);
        return arrayList;
    }

    private final void parseTextRecursive(class_2561 class_25612, int n, List<f_0> list) {
        int n2;
        int n3;
        long l = 4248602717861638392L;
        long l2 = -4404470136234732082L;
        long l3 = 2727176910691914032L;
        long l4 = 7735199340861032661L;
        long l5 = -6832456775106176026L;
        long l6 = -5905638271379482958L;
        long l7 = -5352575169051048544L;
        class_2583 class_25832 = class_25612.method_10866();
        class_5251 class_52512 = class_25832.method_10973();
        if (class_52512 != null) {
            int n4 = D[9];
            n4 ^= D[10];
            n3 = class_52512.method_27716() | (n4 += D[11]);
        } else {
            n3 = n;
        }
        int n5 = D[12];
        n5 ^= D[13];
        long l8 = l5;
        int n6 = D[15];
        n6 += D[16];
        l5 = l8 ^ ((long)n3 << (n5 += D[14]) ^ l8) & -1L << (n6 -= D[17]);
        class_7417 class_74172 = class_25612.method_10851();
        Object object = class_74172;
        String string = object instanceof class_8828.class_2585 ? ((class_8828.class_2585)class_74172).comp_737() : (object instanceof class_2588 ? ((class_2588)class_74172).method_11022() : (object instanceof class_2572 ? ((class_2572)class_74172).method_10901() : ""));
        object = string;
        Intrinsics.checkNotNull(object);
        if (((CharSequence)object).length() == 0) {
            int n7 = D[18];
            n7 -= D[19];
            n2 = n7 ^= D[20];
        } else {
            int n8 = D[21];
            n8 += D[22];
            n2 = n8 ^= D[23];
        }
        if (n2 != 0) {
            for (class_2561 class_25613 : class_25612.method_10855()) {
                Intrinsics.checkNotNull(class_25613);
                int n9 = D[24];
                n9 -= D[25];
                this.parseTextRecursive(class_25613, (int)(l5 >>> (n9 += D[26])), list);
            }
            return;
        }
        object = string;
        Intrinsics.checkNotNull(object);
        string = kotakbaz.rain.client.util.other.D.INSTANCE.replaceSymbols((String)object);
        long l9 = l7;
        int n10 = D[27];
        n10 ^= D[28];
        l7 = l9 ^ (0L ^ l9) & -1L << (n10 ^= D[29]);
        while (true) {
            block13: {
                block12: {
                    int n11 = D[30];
                    n11 += D[31];
                    if ((int)(l7 >>> (n11 -= D[32])) >= string.length()) break;
                    int n12 = D[33];
                    n12 -= D[34];
                    long l10 = l7;
                    int n13 = D[36];
                    n13 += D[37];
                    l7 = l10 ^ ((long)string.charAt((int)(l7 >>> (n12 ^= D[35]))) ^ l10) & -1L >>> (n13 -= D[38]);
                    int n14 = D[39];
                    n14 -= D[40];
                    if ((int)l7 == (n14 -= D[41])) break block12;
                    int n15 = D[42];
                    n15 ^= D[43];
                    if ((int)l7 != (n15 ^= D[44])) break block13;
                }
                int n16 = D[45];
                n16 -= D[46];
                int n17 = D[48];
                n17 ^= D[49];
                if ((int)(l7 >>> (n16 += D[47])) + (n17 ^= D[50]) < string.length()) {
                    l7 += 0x200000000L;
                    continue;
                }
            }
            int n18 = D[51];
            n18 ^= D[52];
            list.add(new f((char)l7, (int)(l5 >>> (n18 += D[53]))));
            l7 += 0x100000000L;
        }
        for (class_2561 class_25614 : class_25612.method_10855()) {
            Intrinsics.checkNotNull(class_25614);
            int n19 = D[54];
            n19 ^= D[55];
            this.parseTextRecursive(class_25614, (int)(l5 >>> (n19 += D[56])), list);
        }
    }

    static {
        kotakbaz.rain.client.util.other.A.b();
        long l = 5761889708834044457L;
        long l2 = 4326770243951347164L;
        long l3 = -3617390922999962951L;
        long l4 = 6452141300404077926L;
        long l5 = -5298908065538654962L;
        long l6 = 6777884959348301288L;
        long l7 = 6030085506259046073L;
        long l8 = 8921605947617656519L;
        long l9 = 7718103387149703458L;
        long l10 = 2655891717705222956L;
        long l11 = -4222759680519587908L;
        long l12 = -7066810214407174816L;
        long l13 = 4944081598717373819L;
        long l14 = 770679698560555868L;
        int n = D[57];
        n += D[58];
        b = new Object[n -= D[59]];
        long l15 = l14;
        int n2 = D[60];
        n2 -= D[61];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 ^= D[62]);
        Object[] objectArray = new Object[D[63]];
        objectArray[kotakbaz.rain.client.util.other.A.D[64]] = B;
        objectArray[kotakbaz.rain.client.util.other.A.D[65]] = D[66];
        int n3 = D[67];
        Object object = kotakbaz.rain.client.util.other.A.A()[D[68]];
        if (object == null) {
            char[] cArray = "\u16cb\u1205\u1734\u16c0\u16d2\u16c7\u16fc\u16fb\u16db\u1204\u16c0\u16d0\u172c\u1204\u16de\u172f\u1724\u1681\u1713\u16f7\u121f\u16ca\u16cf\u16d6\u16f7\u1732\u16c1\u16fc\u173b\u16db\u121f\u1733\u172c\u16cb\u1205\u1731\u173b\u16d0\u173b\u1715\u1737\u173b\u16d0\u1728".toCharArray();
            for (int i = D[69]; i < D[70]; ++i) {
                int n4 = cArray[i];
                n4 ^= D[71];
                n4 -= D[72];
                n4 ^= D[73];
                n4 += D[74];
                n4 -= D[75];
                n4 -= D[76];
                n4 ^= D[77];
                n4 -= D[78];
                n4 ^= D[79];
                n4 += D[80];
                cArray[i] = (char)(n4 += D[81]);
            }
            object = kotakbaz.rain.client.util.other.A.A()[kotakbaz.rain.client.util.other.A.D[82]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)kotakbaz.rain.client.util.other.A.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = D[83];
        n5 ^= D[84];
        l5 = l16 ^ (0x600000000L ^ l16) & -1L << (n5 += D[85]);
        long l17 = l12;
        int n6 = D[86];
        n6 ^= D[87];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= D[88]);
        while (true) {
            int n7 = D[89];
            n7 ^= D[90];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= D[91]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = D[92];
            n9 -= D[93];
            int n10 = D[95];
            n10 += D[96];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= D[94])) & -1L >>> (n10 -= D[97]);
            long l19 = l8;
            int n11 = D[98];
            n11 += D[99];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += D[100]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = D[101];
            n13 ^= D[102];
            int n14 = D[104];
            n14 ^= D[105];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += D[103])) & -1L >>> (n14 += D[106]);
            int n15 = D[107];
            n15 += D[108];
            long l21 = l9;
            int n16 = D[110];
            n16 += D[111];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += D[109]) ^ l21) & -1L << (n16 += D[112]);
            int n17 = D[113];
            n17 -= D[114];
            n17 ^= D[115];
            int n18 = D[116];
            n18 ^= D[117];
            long l22 = l11;
            int n19 = D[119];
            n19 += D[120];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= D[118]))) ^ l22) & -1L >>> (n19 -= D[121]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = D[122];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= D[123]);
            while (true) {
                int n21 = D[124];
                n21 += D[125];
                if ((int)(l13 >>> (n21 -= D[126])) >= (int)l11) break;
                int n22 = D[127];
                n22 ^= D[128];
                int n23 = D[130];
                n23 ^= D[131];
                cArray2[(int)(l13 >>> (n22 ^= kotakbaz.rain.client.util.other.A.D[129]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= D[132]))];
                l13 += 0x100000000L;
            }
            int n24 = D[133];
            n24 += D[134];
            int n25 = (int)(l14 >>> (n24 -= D[135]));
            l14 += 0x100000000L;
            kotakbaz.rain.client.util.other.A.b[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = D[136];
            n26 ^= D[137];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= D[138]);
        }
        INSTANCE = new A();
        A = new c_0();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[D[139]];
        String string = (String)object[D[140]];
        object = object[D[141]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[142]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[143]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[145] ^ D[146]];
                byArray[kotakbaz.rain.client.util.other.A.D[147] ^ kotakbaz.rain.client.util.other.A.D[148]] = D[149] ^ D[150];
                byArray[kotakbaz.rain.client.util.other.A.D[151] ^ kotakbaz.rain.client.util.other.A.D[152]] = D[153] ^ D[154];
                byArray[kotakbaz.rain.client.util.other.A.D[155] ^ kotakbaz.rain.client.util.other.A.D[156]] = D[157] ^ D[158];
                byArray[kotakbaz.rain.client.util.other.A.D[159] ^ kotakbaz.rain.client.util.other.A.D[160]] = D[161] ^ D[162];
                byArray[kotakbaz.rain.client.util.other.A.D[163] ^ kotakbaz.rain.client.util.other.A.D[164]] = D[165] ^ D[166];
                byArray[kotakbaz.rain.client.util.other.A.D[167] ^ kotakbaz.rain.client.util.other.A.D[168]] = D[169] ^ D[170];
                byArray[kotakbaz.rain.client.util.other.A.D[171] ^ kotakbaz.rain.client.util.other.A.D[172]] = D[173] ^ D[174];
                byArray[kotakbaz.rain.client.util.other.A.D[175] ^ kotakbaz.rain.client.util.other.A.D[176]] = D[177] ^ D[178];
                byArray[kotakbaz.rain.client.util.other.A.D[179] ^ kotakbaz.rain.client.util.other.A.D[180]] = D[181] ^ D[182];
                byArray[kotakbaz.rain.client.util.other.A.D[183] ^ kotakbaz.rain.client.util.other.A.D[184]] = D[185] ^ D[186];
                byArray[kotakbaz.rain.client.util.other.A.D[187] ^ kotakbaz.rain.client.util.other.A.D[188]] = D[189] ^ D[190];
                byArray[kotakbaz.rain.client.util.other.A.D[191] ^ kotakbaz.rain.client.util.other.A.D[192]] = D[193] ^ D[194];
                byArray[kotakbaz.rain.client.util.other.A.D[195] ^ kotakbaz.rain.client.util.other.A.D[196]] = D[197] ^ D[198];
                byArray[kotakbaz.rain.client.util.other.A.D[199] ^ kotakbaz.rain.client.util.other.A.D[200]] = D[201] ^ D[202];
                byArray[kotakbaz.rain.client.util.other.A.D[203] ^ kotakbaz.rain.client.util.other.A.D[204]] = D[205] ^ D[206];
                byArray[kotakbaz.rain.client.util.other.A.D[207] ^ kotakbaz.rain.client.util.other.A.D[208]] = D[209] ^ D[210];
                objectArray2[kotakbaz.rain.client.util.other.A.D[144]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[211]];
            if (c == null) {
                byte[] byArray2 = new byte[D[212] ^ D[213]];
                byArray2[kotakbaz.rain.client.util.other.A.D[214] ^ kotakbaz.rain.client.util.other.A.D[215]] = D[216] ^ D[217];
                byArray2[kotakbaz.rain.client.util.other.A.D[218] ^ kotakbaz.rain.client.util.other.A.D[219]] = D[220] ^ D[221];
                byArray2[kotakbaz.rain.client.util.other.A.D[222] ^ kotakbaz.rain.client.util.other.A.D[223]] = D[224] ^ D[225];
                byArray2[kotakbaz.rain.client.util.other.A.D[226] ^ kotakbaz.rain.client.util.other.A.D[227]] = D[228] ^ D[229];
                byArray2[kotakbaz.rain.client.util.other.A.D[230] ^ kotakbaz.rain.client.util.other.A.D[231]] = D[232] ^ D[233];
                byArray2[kotakbaz.rain.client.util.other.A.D[234] ^ kotakbaz.rain.client.util.other.A.D[235]] = D[236] ^ D[237];
                byArray2[kotakbaz.rain.client.util.other.A.D[238] ^ kotakbaz.rain.client.util.other.A.D[239]] = D[240] ^ D[241];
                byArray2[kotakbaz.rain.client.util.other.A.D[242] ^ kotakbaz.rain.client.util.other.A.D[243]] = D[244] ^ D[245];
                byArray2[kotakbaz.rain.client.util.other.A.D[246] ^ kotakbaz.rain.client.util.other.A.D[247]] = D[248] ^ D[249];
                byArray2[kotakbaz.rain.client.util.other.A.D[250] ^ kotakbaz.rain.client.util.other.A.D[251]] = D[252] ^ D[253];
                byArray2[kotakbaz.rain.client.util.other.A.D[254] ^ kotakbaz.rain.client.util.other.A.D[255]] = D[256] ^ D[257];
                byArray2[kotakbaz.rain.client.util.other.A.D[258] ^ kotakbaz.rain.client.util.other.A.D[259]] = D[260] ^ D[261];
                byArray2[kotakbaz.rain.client.util.other.A.D[262] ^ kotakbaz.rain.client.util.other.A.D[263]] = D[264] ^ D[265];
                byArray2[kotakbaz.rain.client.util.other.A.D[266] ^ kotakbaz.rain.client.util.other.A.D[267]] = D[268] ^ D[269];
                byArray2[kotakbaz.rain.client.util.other.A.D[270] ^ kotakbaz.rain.client.util.other.A.D[271]] = D[272] ^ D[273];
                byArray2[kotakbaz.rain.client.util.other.A.D[274] ^ kotakbaz.rain.client.util.other.A.D[275]] = D[276] ^ D[277];
                byArray2[kotakbaz.rain.client.util.other.A.D[278] ^ kotakbaz.rain.client.util.other.A.D[279]] = D[280] ^ D[281];
                byArray2[kotakbaz.rain.client.util.other.A.D[282] ^ kotakbaz.rain.client.util.other.A.D[283]] = D[284] ^ D[285];
                byArray2[kotakbaz.rain.client.util.other.A.D[286] ^ kotakbaz.rain.client.util.other.A.D[287]] = D[288] ^ D[289];
                byArray2[kotakbaz.rain.client.util.other.A.D[290] ^ kotakbaz.rain.client.util.other.A.D[291]] = D[292] ^ D[293];
                byArray2[kotakbaz.rain.client.util.other.A.D[294] ^ kotakbaz.rain.client.util.other.A.D[295]] = D[296] ^ D[297];
                byArray2[kotakbaz.rain.client.util.other.A.D[298] ^ kotakbaz.rain.client.util.other.A.D[299]] = D[300] ^ D[301];
                byArray2[kotakbaz.rain.client.util.other.A.D[302] ^ kotakbaz.rain.client.util.other.A.D[303]] = D[304] ^ D[305];
                byArray2[kotakbaz.rain.client.util.other.A.D[306] ^ kotakbaz.rain.client.util.other.A.D[307]] = D[308] ^ D[309];
                byArray2[kotakbaz.rain.client.util.other.A.D[310] ^ kotakbaz.rain.client.util.other.A.D[311]] = D[312] ^ D[313];
                byArray2[kotakbaz.rain.client.util.other.A.D[314] ^ kotakbaz.rain.client.util.other.A.D[315]] = D[316] ^ D[317];
                byArray2[kotakbaz.rain.client.util.other.A.D[318] ^ kotakbaz.rain.client.util.other.A.D[319]] = D[320] ^ D[321];
                byArray2[kotakbaz.rain.client.util.other.A.D[322] ^ kotakbaz.rain.client.util.other.A.D[323]] = D[324] ^ D[325];
                byArray2[kotakbaz.rain.client.util.other.A.D[326] ^ kotakbaz.rain.client.util.other.A.D[327]] = D[328] ^ D[329];
                byArray2[kotakbaz.rain.client.util.other.A.D[330] ^ kotakbaz.rain.client.util.other.A.D[331]] = D[332] ^ D[333];
                byArray2[kotakbaz.rain.client.util.other.A.D[334] ^ kotakbaz.rain.client.util.other.A.D[335]] = D[336] ^ D[337];
                byArray2[kotakbaz.rain.client.util.other.A.D[338] ^ kotakbaz.rain.client.util.other.A.D[339]] = D[340] ^ D[341];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[342], byArray3, D[343], byArray.length);
                System.arraycopy(byArray2, D[344], byArray3, byArray.length, byArray2.length);
                Object object4 = kotakbaz.rain.client.util.other.A.A()[D[345]];
                if (object4 == null) {
                    char[] cArray = "\ud967\ud979\ud964\ud96b\ud96d\ud9c9\ud900\ud932\ud8bb\ud90f\ud96f\ud906\ud91a\ud90c\ud91c\ud96f\ud97a\ud9ca".toCharArray();
                    for (int i = D[346]; i < D[347]; ++i) {
                        int n2 = cArray[i];
                        n2 ^= D[348];
                        n2 += D[349];
                        n2 += D[350];
                        n2 -= D[351];
                        n2 += D[352];
                        n2 -= D[353];
                        n2 += D[354];
                        n2 -= D[355];
                        n2 ^= D[356];
                        n2 -= D[357];
                        n2 += D[358];
                        cArray[i] = (char)(n2 -= D[359]);
                    }
                    object4 = kotakbaz.rain.client.util.other.A.A()[kotakbaz.rain.client.util.other.A.D[360]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[361]];
                byArray4[kotakbaz.rain.client.util.other.A.D[362]] = D[363];
                byArray4[kotakbaz.rain.client.util.other.A.D[364]] = D[365];
                byArray4[kotakbaz.rain.client.util.other.A.D[366]] = D[367];
                byArray4[kotakbaz.rain.client.util.other.A.D[368]] = D[369];
                byArray4[kotakbaz.rain.client.util.other.A.D[370]] = D[371];
                byArray4[kotakbaz.rain.client.util.other.A.D[372]] = D[373];
                byArray4[kotakbaz.rain.client.util.other.A.D[374]] = D[375];
                byArray4[kotakbaz.rain.client.util.other.A.D[376]] = D[377];
                byArray4[kotakbaz.rain.client.util.other.A.D[378]] = D[379];
                byArray4[kotakbaz.rain.client.util.other.A.D[380]] = D[381];
                byArray4[kotakbaz.rain.client.util.other.A.D[382]] = D[383];
                byArray4[kotakbaz.rain.client.util.other.A.D[384]] = D[385];
                byArray4[kotakbaz.rain.client.util.other.A.D[386]] = D[387];
                byArray4[kotakbaz.rain.client.util.other.A.D[388]] = D[389];
                byArray4[kotakbaz.rain.client.util.other.A.D[390]] = D[391];
                byArray4[kotakbaz.rain.client.util.other.A.D[392]] = D[393];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, D[394], D[395]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = kotakbaz.rain.client.util.other.A.A()[D[396]];
                if (object5 == null) {
                    char[] cArray = "\u6d36\u6d32\u6d24".toCharArray();
                    for (int i = D[397]; i < D[398]; ++i) {
                        int n3 = cArray[i];
                        n3 += D[399];
                        n3 -= 60009;
                        n3 += 46505;
                        n3 ^= 0x75AB;
                        n3 ^= 0xBBCF;
                        n3 -= 42352;
                        n3 -= 46449;
                        n3 += 26385;
                        n3 -= 55025;
                        n3 ^= 0x1C92;
                        n3 ^= 0x6454;
                        n3 -= 22869;
                        n3 += 33370;
                        n3 ^= 0x1B3D;
                        n3 += 60285;
                        cArray[i] = (char)(n3 -= 29566);
                    }
                    object5 = kotakbaz.rain.client.util.other.A.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = kotakbaz.rain.client.util.other.A.A()[3];
            if (object6 == null) {
                char[] cArray = "\u951e\u950a\u9514\u95d8\u9504\u9505\u9504\u95d8\u94e7\u94ec\u9504\u9514\u94fa\u94e7\u95be\u9523\u9523\u9526\u9519\u9510".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 -= 24000;
                    n4 += 2673;
                    n4 ^= 0xDB83;
                    n4 -= 13620;
                    n4 -= 49255;
                    n4 ^= 0x9F28;
                    n4 -= 58152;
                    n4 += 6649;
                    n4 -= 6827;
                    n4 -= 17692;
                    n4 ^= 0xEFAC;
                    cArray[i] = (char)(n4 -= 64718);
                }
                object6 = kotakbaz.rain.client.util.other.A.A()[3] = new String(cArray);
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
        D = new int[0x58DB ^ 0x594B];
        kotakbaz.rain.client.util.other.A.D[0xA175 ^ 0xA181] = 0x482A ^ 0xA181;
        kotakbaz.rain.client.util.other.A.D[0x8FCA ^ 0x8FC7] = 0xFFFF7008 ^ 0x8FC7;
        kotakbaz.rain.client.util.other.A.D[0x57B0 ^ 0x57D4] = 0x5797 ^ 0x57D4;
        kotakbaz.rain.client.util.other.A.D[0xFB3A ^ 0xFBBA] = 0xFBED ^ 0xFBBA;
        kotakbaz.rain.client.util.other.A.D[0xFF4E ^ 0xFE45] = 0x5F1E ^ 0xFE45;
        kotakbaz.rain.client.util.other.A.D[0xA4 ^ 0x34] = 0x34 ^ 0x34;
        kotakbaz.rain.client.util.other.A.D[0x5637 ^ 0x5601] = 0x5663 ^ 0x5601;
        kotakbaz.rain.client.util.other.A.D[0xEBD8 ^ 0xEBED] = 0xFFFF1429 ^ 0xEBED;
        kotakbaz.rain.client.util.other.A.D[0x6D88 ^ 0x6CBE] = 0x5A72 ^ 0x6CBE;
        kotakbaz.rain.client.util.other.A.D[0x72F9 ^ 0x73B6] = 0xFE6A ^ 0x73B6;
        kotakbaz.rain.client.util.other.A.D[0x74EB ^ 0x7415] = 0x7E5D ^ 0x7415;
        kotakbaz.rain.client.util.other.A.D[0x10813 ^ 0x10959] = 0x1A83D ^ 0x10959;
        kotakbaz.rain.client.util.other.A.D[0x32DC ^ 0x33A0] = 0x33AB ^ 0x33A0;
        kotakbaz.rain.client.util.other.A.D[0x7ADD ^ 0x7BE3] = 0xA905 ^ 0x7BE3;
        kotakbaz.rain.client.util.other.A.D[0x108F2 ^ 0x10983] = 0x109E9 ^ 0x10983;
        kotakbaz.rain.client.util.other.A.D[0x334 ^ 0x2BE] = 0x2AE ^ 0x2BE;
        kotakbaz.rain.client.util.other.A.D[0xB5DD ^ 0xB4CD] = 0xFFFFF79C ^ 0xB4CD;
        kotakbaz.rain.client.util.other.A.D[0xC679 ^ 0xC61F] = 0xFFFF3994 ^ 0xC61F;
        kotakbaz.rain.client.util.other.A.D[0x29FD ^ 0x29E8] = 0x2935 ^ 0x29E8;
        kotakbaz.rain.client.util.other.A.D[0x2857 ^ 0x2852] = 0xFFFFD7B4 ^ 0x2852;
        kotakbaz.rain.client.util.other.A.D[0xB6D2 ^ 0xB6CE] = 0xB6FF ^ 0xB6CE;
        kotakbaz.rain.client.util.other.A.D[0x55E9 ^ 0x55F8] = 0x55CD ^ 0x55F8;
        kotakbaz.rain.client.util.other.A.D[0xF485 ^ 0xF414] = 0x138A ^ 0xF414;
        kotakbaz.rain.client.util.other.A.D[0xC761 ^ 0xC74E] = 0xFFFF38AA ^ 0xC74E;
        kotakbaz.rain.client.util.other.A.D[0xE2FC ^ 0xE212] = 0x7B10 ^ 0xE212;
        kotakbaz.rain.client.util.other.A.D[0x1696 ^ 0x17F0] = 0xC4BE ^ 0x17F0;
        kotakbaz.rain.client.util.other.A.D[0x3D8F ^ 0x3D4C] = 0x4614 ^ 0x3D4C;
        kotakbaz.rain.client.util.other.A.D[0x761 ^ 0x7AF] = 0xE3 ^ 0x7AF;
        kotakbaz.rain.client.util.other.A.D[0xCA10 ^ 0xCA32] = 0xFFFF358A ^ 0xCA32;
        kotakbaz.rain.client.util.other.A.D[0xBE78 ^ 0xBEC5] = 0x6DB ^ 0xBEC5;
        kotakbaz.rain.client.util.other.A.D[0x9096 ^ 0x91A7] = 0x9E13 ^ 0x91A7;
        kotakbaz.rain.client.util.other.A.D[0xC559 ^ 0xC51C] = 0xC51C ^ 0xC51C;
        kotakbaz.rain.client.util.other.A.D[0x5113 ^ 0x517C] = 0xFFFFAE84 ^ 0x517C;
        kotakbaz.rain.client.util.other.A.D[0x5B23 ^ 0x5A0E] = 0x15CB1 ^ 0x5A0E;
        kotakbaz.rain.client.util.other.A.D[0xADB8 ^ 0xACB6] = 0x103E ^ 0xACB6;
        kotakbaz.rain.client.util.other.A.D[0x6E3C ^ 0x6E16] = 0x6070 ^ 0x6E16;
        kotakbaz.rain.client.util.other.A.D[0x6397 ^ 0x629B] = 0xC3C0 ^ 0x629B;
        kotakbaz.rain.client.util.other.A.D[0xEC30 ^ 0xEC18] = 0xEC00 ^ 0xEC18;
        kotakbaz.rain.client.util.other.A.D[0x333E ^ 0x32B5] = 0x33B5 ^ 0x32B5;
        kotakbaz.rain.client.util.other.A.D[0x18E6 ^ 0x1884] = 0xFFFFE73F ^ 0x1884;
        kotakbaz.rain.client.util.other.A.D[0xA4EB ^ 0xA5DF] = 0xFFFF867A ^ 0xA5DF;
        kotakbaz.rain.client.util.other.A.D[0xA9C0 ^ 0xA97A] = 0xCA85 ^ 0xA97A;
        kotakbaz.rain.client.util.other.A.D[0x4C0D ^ 0x4C98] = 0xB974 ^ 0x4C98;
        kotakbaz.rain.client.util.other.A.D[0x3426 ^ 0x3473] = 0xFFFFCBF7 ^ 0x3473;
        kotakbaz.rain.client.util.other.A.D[0x5C7 ^ 0x4B1] = 0x4BB ^ 0x4B1;
        kotakbaz.rain.client.util.other.A.D[0xAA04 ^ 0xAA1F] = 0xAA74 ^ 0xAA1F;
        kotakbaz.rain.client.util.other.A.D[0x2CA2 ^ 0x2D23] = 0x2D61 ^ 0x2D23;
        kotakbaz.rain.client.util.other.A.D[0x46B8 ^ 0x46DD] = 0xFFFFB947 ^ 0x46DD;
        kotakbaz.rain.client.util.other.A.D[0x4CA7 ^ 0x4C5A] = 0xEBF4 ^ 0x4C5A;
        kotakbaz.rain.client.util.other.A.D[0xEF0C ^ 0xEE19] = 0x90FA ^ 0xEE19;
        kotakbaz.rain.client.util.other.A.D[0xE53B ^ 0xE4BE] = 0xE4A1 ^ 0xE4BE;
        kotakbaz.rain.client.util.other.A.D[0xB8CC ^ 0xB8ED] = 0xB8CD ^ 0xB8ED;
        kotakbaz.rain.client.util.other.A.D[0x6BBA ^ 0x6BF9] = 0x6BFB ^ 0x6BF9;
        kotakbaz.rain.client.util.other.A.D[0x21BF ^ 0x20A2] = 0xFE46 ^ 0x20A2;
        kotakbaz.rain.client.util.other.A.D[0x59D6 ^ 0x590D] = 0xB6FB ^ 0x590D;
        kotakbaz.rain.client.util.other.A.D[0x9E24 ^ 0x9E48] = 0xFFFF61A7 ^ 0x9E48;
        kotakbaz.rain.client.util.other.A.D[0x769F ^ 0x77B5] = 0x17114 ^ 0x77B5;
        kotakbaz.rain.client.util.other.A.D[0xD511 ^ 0xD5DC] = 0xFFFF2D38 ^ 0xD5DC;
        kotakbaz.rain.client.util.other.A.D[0x9B53 ^ 0x9B60] = 0x9B3E ^ 0x9B60;
        kotakbaz.rain.client.util.other.A.D[0x7E13 ^ 0x7F51] = 0x1769A ^ 0x7F51;
        kotakbaz.rain.client.util.other.A.D[0xC32A ^ 0xC235] = 0xBC09 ^ 0xC235;
        kotakbaz.rain.client.util.other.A.D[0x327E ^ 0x32E7] = 0xFFFFBAF9 ^ 0x32E7;
        kotakbaz.rain.client.util.other.A.D[0xFB97 ^ 0xFAE5] = 0xFAE5 ^ 0xFAE5;
        kotakbaz.rain.client.util.other.A.D[0x7CF0 ^ 0x7C23] = 0x7C23 ^ 0x7C23;
        kotakbaz.rain.client.util.other.A.D[0x52EE ^ 0x520B] = 0xFF ^ 0x520B;
        kotakbaz.rain.client.util.other.A.D[0x609A ^ 0x619D] = 0xE4D1 ^ 0x619D;
        kotakbaz.rain.client.util.other.A.D[0x11E ^ 0x4D] = 0x8886 ^ 0x4D;
        kotakbaz.rain.client.util.other.A.D[0x4B22 ^ 0x4B62] = 0x4B62 ^ 0x4B62;
        kotakbaz.rain.client.util.other.A.D[0x5CE4 ^ 0x5CC4] = 0xFFFFA323 ^ 0x5CC4;
        kotakbaz.rain.client.util.other.A.D[0x7221 ^ 0x7207] = 0x721E ^ 0x7207;
        kotakbaz.rain.client.util.other.A.D[0x376 ^ 0x3C6] = 0x1074D ^ 0x3C6;
        kotakbaz.rain.client.util.other.A.D[0x3BB0 ^ 0x3B32] = 0xFFFFC4EE ^ 0x3B32;
        kotakbaz.rain.client.util.other.A.D[0x9D67 ^ 0x9DEF] = 0x9DBD ^ 0x9DEF;
        kotakbaz.rain.client.util.other.A.D[0xB662 ^ 0xB608] = 0xFFFF49E9 ^ 0xB608;
        kotakbaz.rain.client.util.other.A.D[0x105B3 ^ 0x105A9] = 0xFFFEFA5F ^ 0x105A9;
        kotakbaz.rain.client.util.other.A.D[0xEAFD ^ 0xEA4E] = 0x1ED71 ^ 0xEA4E;
        kotakbaz.rain.client.util.other.A.D[0x31F6 ^ 0x3105] = 0xD8DD ^ 0x3105;
        kotakbaz.rain.client.util.other.A.D[0x68C9 ^ 0x68BD] = 0x68B1 ^ 0x68BD;
        kotakbaz.rain.client.util.other.A.D[0x75AF ^ 0x7519] = 0x1722F ^ 0x7519;
        kotakbaz.rain.client.util.other.A.D[0xCD7D ^ 0xCC54] = 0x28CB ^ 0xCC54;
        kotakbaz.rain.client.util.other.A.D[0x9FCC ^ 0x9F4D] = 0xFFFF6085 ^ 0x9F4D;
        kotakbaz.rain.client.util.other.A.D[0x7ACD ^ 0x7BA8] = 0x6754 ^ 0x7BA8;
        kotakbaz.rain.client.util.other.A.D[0x789B ^ 0x787A] = 0x7A53 ^ 0x787A;
        kotakbaz.rain.client.util.other.A.D[0x892E ^ 0x8929] = 0xFFFF7682 ^ 0x8929;
        kotakbaz.rain.client.util.other.A.D[0xF3EA ^ 0xF3B9] = 0xFFFF0CDE ^ 0xF3B9;
        kotakbaz.rain.client.util.other.A.D[0x2B11 ^ 0x2BBA] = 0xB082 ^ 0x2BBA;
        kotakbaz.rain.client.util.other.A.D[0xF465 ^ 0xF523] = 0xE5C6 ^ 0xF523;
        kotakbaz.rain.client.util.other.A.D[0x6201 ^ 0x6224] = 0x6254 ^ 0x6224;
        kotakbaz.rain.client.util.other.A.D[0xFEBE ^ 0xFF8B] = 0x23AD ^ 0xFF8B;
        kotakbaz.rain.client.util.other.A.D[0x10D2D ^ 0x10C3A] = 0x16DCE ^ 0x10C3A;
        kotakbaz.rain.client.util.other.A.D[0xFC92 ^ 0xFD92] = 0xF7EC ^ 0xFD92;
        kotakbaz.rain.client.util.other.A.D[0xE473 ^ 0xE418] = 0xE497 ^ 0xE418;
        kotakbaz.rain.client.util.other.A.D[0x6FC4 ^ 0x6F89] = 0x51FC ^ 0x6F89;
        kotakbaz.rain.client.util.other.A.D[0x19C9 ^ 0x18F9] = 0x1752 ^ 0x18F9;
        kotakbaz.rain.client.util.other.A.D[0x4237 ^ 0x42FC] = 0x45BF ^ 0x42FC;
        kotakbaz.rain.client.util.other.A.D[0x5C56 ^ 0x5D34] = 0x1012 ^ 0x5D34;
        kotakbaz.rain.client.util.other.A.D[0x44DB ^ 0x4406] = 0xABF0 ^ 0x4406;
        kotakbaz.rain.client.util.other.A.D[0x9AF1 ^ 0x9BE2] = 0xE501 ^ 0x9BE2;
        kotakbaz.rain.client.util.other.A.D[0xF338 ^ 0xF30A] = 0xF365 ^ 0xF30A;
        kotakbaz.rain.client.util.other.A.D[0x68E7 ^ 0x685E] = 0xBDE ^ 0x685E;
        kotakbaz.rain.client.util.other.A.D[0x36EA ^ 0x3626] = 0x316A ^ 0x3626;
        kotakbaz.rain.client.util.other.A.D[0xC2FF ^ 0xC298] = 0xFFFF3D68 ^ 0xC298;
        kotakbaz.rain.client.util.other.A.D[0x9958 ^ 0x99A4] = 0xFFFFC1D2 ^ 0x99A4;
        kotakbaz.rain.client.util.other.A.D[0x7C0 ^ 0x695] = 0x8E5E ^ 0x695;
        kotakbaz.rain.client.util.other.A.D[0x182E ^ 0x1940] = 0x1942 ^ 0x1940;
        kotakbaz.rain.client.util.other.A.D[0xE836 ^ 0xE896] = 0xEFF3 ^ 0xE896;
        kotakbaz.rain.client.util.other.A.D[0x3500 ^ 0x3452] = 0xBC91 ^ 0x3452;
        kotakbaz.rain.client.util.other.A.D[0x9E0F ^ 0x9E99] = 0x6B76 ^ 0x9E99;
        kotakbaz.rain.client.util.other.A.D[0x6E7E ^ 0x6EF8] = 0xFFFF917A ^ 0x6EF8;
        kotakbaz.rain.client.util.other.A.D[0xCA92 ^ 0xCA70] = 0x9886 ^ 0xCA70;
        kotakbaz.rain.client.util.other.A.D[0x27B5 ^ 0x26AB] = 0x5891 ^ 0x26AB;
        kotakbaz.rain.client.util.other.A.D[0x1090A ^ 0x10875] = 0xFFFEF7BA ^ 0x10875;
        kotakbaz.rain.client.util.other.A.D[0x9EB2 ^ 0x9E0A] = 0xFDF5 ^ 0x9E0A;
        kotakbaz.rain.client.util.other.A.D[0xD7C ^ 0xDF9] = 0xD05 ^ 0xDF9;
        kotakbaz.rain.client.util.other.A.D[0xE22F ^ 0xE30C] = 0x644D ^ 0xE30C;
        kotakbaz.rain.client.util.other.A.D[0xDBA6 ^ 0xDB96] = 0xFFFF2406 ^ 0xDB96;
        kotakbaz.rain.client.util.other.A.D[0x4CC9 ^ 0x4DCB] = 0x3D3 ^ 0x4DCB;
        kotakbaz.rain.client.util.other.A.D[0xA63 ^ 0xA95] = 0xAB6C ^ 0xA95;
        kotakbaz.rain.client.util.other.A.D[0xDBF9 ^ 0xDAE1] = 0xBB62 ^ 0xDAE1;
        kotakbaz.rain.client.util.other.A.D[0x2C6 ^ 0x261] = 0xBF22 ^ 0x261;
        kotakbaz.rain.client.util.other.A.D[0x90F7 ^ 0x906C] = 0x158 ^ 0x906C;
        kotakbaz.rain.client.util.other.A.D[0xCB79 ^ 0xCA57] = 0xC5F2 ^ 0xCA57;
        kotakbaz.rain.client.util.other.A.D[0x33C5 ^ 0x335D] = 0x44C1 ^ 0x335D;
        kotakbaz.rain.client.util.other.A.D[0xDFCB ^ 0xDFF4] = 0xDFF7 ^ 0xDFF4;
        kotakbaz.rain.client.util.other.A.D[0xF108 ^ 0xF1F2] = 0x565C ^ 0xF1F2;
        kotakbaz.rain.client.util.other.A.D[0xE254 ^ 0xE36B] = 0x3199 ^ 0xE36B;
        kotakbaz.rain.client.util.other.A.D[0x774B ^ 0x766B] = 0xFFFFF7B6 ^ 0x766B;
        kotakbaz.rain.client.util.other.A.D[0xF9D2 ^ 0xF9D3] = 0xFFFF0648 ^ 0xF9D3;
        kotakbaz.rain.client.util.other.A.D[0x4FB0 ^ 0x4ED8] = 0x4ED9 ^ 0x4ED8;
        kotakbaz.rain.client.util.other.A.D[0xFE16 ^ 0xFECF] = 0x34F1 ^ 0xFECF;
        kotakbaz.rain.client.util.other.A.D[0x9BD ^ 0x99E] = 0x9D6 ^ 0x99E;
        kotakbaz.rain.client.util.other.A.D[0x127B ^ 0x1277] = 0x1261 ^ 0x1277;
        kotakbaz.rain.client.util.other.A.D[0x1C65 ^ 0x1CAA] = 0x8708 ^ 0x1CAA;
        kotakbaz.rain.client.util.other.A.D[0x6F89 ^ 0x6E86] = 0xD203 ^ 0x6E86;
        kotakbaz.rain.client.util.other.A.D[0x3B6E ^ 0x3A19] = 0x3A76 ^ 0x3A19;
        kotakbaz.rain.client.util.other.A.D[0x10292 ^ 0x102C0] = 0x102C0 ^ 0x102C0;
        kotakbaz.rain.client.util.other.A.D[0x6145 ^ 0x61D8] = 0xFFFF0F5D ^ 0x61D8;
        kotakbaz.rain.client.util.other.A.D[0xE7F6 ^ 0xE6D2] = 0x6186 ^ 0xE6D2;
        kotakbaz.rain.client.util.other.A.D[0x43B ^ 0x480] = 0xBC8B ^ 0x480;
        kotakbaz.rain.client.util.other.A.D[0x2DB ^ 0x247] = 0x9371 ^ 0x247;
        kotakbaz.rain.client.util.other.A.D[0x409C ^ 0x4028] = 0x1471E ^ 0x4028;
        kotakbaz.rain.client.util.other.A.D[0x10C71 ^ 0x10C35] = 0x10C35 ^ 0x10C35;
        kotakbaz.rain.client.util.other.A.D[0xDA6E ^ 0xDB49] = 0x3FD6 ^ 0xDB49;
        kotakbaz.rain.client.util.other.A.D[0x4586 ^ 0x45D6] = 0xCF0D ^ 0x45D6;
        kotakbaz.rain.client.util.other.A.D[0x5755 ^ 0x5778] = 0x5740 ^ 0x5778;
        kotakbaz.rain.client.util.other.A.D[0xAEA5 ^ 0xAEAB] = 0xAEEC ^ 0xAEAB;
        kotakbaz.rain.client.util.other.A.D[0xF692 ^ 0xF71F] = 0xF71F ^ 0xF71F;
        kotakbaz.rain.client.util.other.A.D[0x2110 ^ 0x204C] = 0xF41C ^ 0x204C;
        kotakbaz.rain.client.util.other.A.D[0x5329 ^ 0x53FC] = 0xF0AC ^ 0x53FC;
        kotakbaz.rain.client.util.other.A.D[0xCF61 ^ 0xCE73] = 0xB08B ^ 0xCE73;
        kotakbaz.rain.client.util.other.A.D[0x882B ^ 0x8865] = 0xE813 ^ 0x8865;
        kotakbaz.rain.client.util.other.A.D[0x4546 ^ 0x45D5] = 0xB03C ^ 0x45D5;
        kotakbaz.rain.client.util.other.A.D[0x315 ^ 0x204] = 0xBE81 ^ 0x204;
        kotakbaz.rain.client.util.other.A.D[0x83D6 ^ 0x83D5] = 0x83B5 ^ 0x83D5;
        kotakbaz.rain.client.util.other.A.D[0x73CF ^ 0x7308] = 0xC725 ^ 0x7308;
        kotakbaz.rain.client.util.other.A.D[0xB5AD ^ 0xB505] = 0x84A ^ 0xB505;
        kotakbaz.rain.client.util.other.A.D[0x2336 ^ 0x23B9] = 0x23B8 ^ 0x23B9;
        kotakbaz.rain.client.util.other.A.D[0x2D06 ^ 0x2D5C] = 0x2D6A ^ 0x2D5C;
        kotakbaz.rain.client.util.other.A.D[0x9BB2 ^ 0x9BC9] = 0xFFFF6406 ^ 0x9BC9;
        kotakbaz.rain.client.util.other.A.D[0x32D9 ^ 0x32C7] = 0xFFFFCD14 ^ 0x32C7;
        kotakbaz.rain.client.util.other.A.D[0x4388 ^ 0x431F] = 0x348D ^ 0x431F;
        kotakbaz.rain.client.util.other.A.D[0x67FE ^ 0x6793] = 0xFFFF9831 ^ 0x6793;
        kotakbaz.rain.client.util.other.A.D[0xDFEA ^ 0xDE68] = 0xDE60 ^ 0xDE68;
        kotakbaz.rain.client.util.other.A.D[0xC994 ^ 0xC96D] = 0x688C ^ 0xC96D;
        kotakbaz.rain.client.util.other.A.D[0xE250 ^ 0xE28A] = 0xD61 ^ 0xE28A;
        kotakbaz.rain.client.util.other.A.D[0xBBB1 ^ 0xBBFB] = 0xC289 ^ 0xBBFB;
        kotakbaz.rain.client.util.other.A.D[0xBC3D ^ 0xBD44] = 0xFFFF42DB ^ 0xBD44;
        kotakbaz.rain.client.util.other.A.D[0x4E2 ^ 0x591] = 0xFFFFFA3B ^ 0x591;
        kotakbaz.rain.client.util.other.A.D[0xD5C ^ 0xDFD] = 0xAD9 ^ 0xDFD;
        kotakbaz.rain.client.util.other.A.D[0xD55A ^ 0xD53A] = 0xFFFF2AD0 ^ 0xD53A;
        kotakbaz.rain.client.util.other.A.D[0xF04C ^ 0xF090] = 0xFFFFE0A5 ^ 0xF090;
        kotakbaz.rain.client.util.other.A.D[0x1D58 ^ 0x1C38] = 0x9DEE ^ 0x1C38;
        kotakbaz.rain.client.util.other.A.D[0xC64A ^ 0xC68E] = 0xBDD7 ^ 0xC68E;
        kotakbaz.rain.client.util.other.A.D[0xA031 ^ 0xA046] = 0xA047 ^ 0xA046;
        kotakbaz.rain.client.util.other.A.D[0x924E ^ 0x928B] = 0xFFFF1626 ^ 0x928B;
        kotakbaz.rain.client.util.other.A.D[0xE3AE ^ 0xE39F] = 0xFFFF1C61 ^ 0xE39F;
        kotakbaz.rain.client.util.other.A.D[0x10DA1 ^ 0x10D75] = 0x1AE05 ^ 0x10D75;
        kotakbaz.rain.client.util.other.A.D[0x4A80 ^ 0x4A7F] = 0x4036 ^ 0x4A7F;
        kotakbaz.rain.client.util.other.A.D[0xE363 ^ 0xE3A3] = 0x5054 ^ 0xE3A3;
        kotakbaz.rain.client.util.other.A.D[0x7A2F ^ 0x7A04] = 0xFFFF8587 ^ 0x7A04;
        kotakbaz.rain.client.util.other.A.D[0x1822 ^ 0x18F3] = 0x830C ^ 0x18F3;
        kotakbaz.rain.client.util.other.A.D[0x935 ^ 0x9AA] = 0xEC5 ^ 0x9AA;
        kotakbaz.rain.client.util.other.A.D[0x9E43 ^ 0x9FCF] = 0x9FCD ^ 0x9FCF;
        kotakbaz.rain.client.util.other.A.D[0x6503 ^ 0x6407] = 0xFFFFD5B5 ^ 0x6407;
        kotakbaz.rain.client.util.other.A.D[0x948F ^ 0x9594] = 0x4B70 ^ 0x9594;
        kotakbaz.rain.client.util.other.A.D[0xA9CF ^ 0xA9B7] = 0xA98D ^ 0xA9B7;
        kotakbaz.rain.client.util.other.A.D[0x393A ^ 0x3812] = 0xDCE4 ^ 0x3812;
        kotakbaz.rain.client.util.other.A.D[0xCDD1 ^ 0xCCF0] = 0xB2CC ^ 0xCCF0;
        kotakbaz.rain.client.util.other.A.D[0x935D ^ 0x9264] = 0xA4A3 ^ 0x9264;
        kotakbaz.rain.client.util.other.A.D[0x4BF9 ^ 0x4B2B] = 0xD081 ^ 0x4B2B;
        kotakbaz.rain.client.util.other.A.D[0xA3CC ^ 0xA38D] = 0xA38C ^ 0xA38D;
        kotakbaz.rain.client.util.other.A.D[0xE0A7 ^ 0xE1E7] = 0x3375 ^ 0xE1E7;
        kotakbaz.rain.client.util.other.A.D[0x20D6 ^ 0x21BB] = 0xFFFFDE7E ^ 0x21BB;
        kotakbaz.rain.client.util.other.A.D[0x2642 ^ 0x277F] = 0x29D7 ^ 0x277F;
        kotakbaz.rain.client.util.other.A.D[0xCBD9 ^ 0xCA83] = 0xCA83 ^ 0xCA83;
        kotakbaz.rain.client.util.other.A.D[0xF4E1 ^ 0xF413] = 0x1DD7 ^ 0xF413;
        kotakbaz.rain.client.util.other.A.D[0x7343 ^ 0x73B2] = 0xEABE ^ 0x73B2;
        kotakbaz.rain.client.util.other.A.D[0x65D3 ^ 0x65B2] = 0xFFFF9A16 ^ 0x65B2;
        kotakbaz.rain.client.util.other.A.D[0x39EE ^ 0x39F6] = 0x39DC ^ 0x39F6;
        kotakbaz.rain.client.util.other.A.D[0x106E1 ^ 0x106D8] = 0x106D4 ^ 0x106D8;
        kotakbaz.rain.client.util.other.A.D[0x9AD2 ^ 0x9A13] = 0x29A1 ^ 0x9A13;
        kotakbaz.rain.client.util.other.A.D[0xB1C9 ^ 0xB192] = 0xB1DB ^ 0xB192;
        kotakbaz.rain.client.util.other.A.D[0x280E ^ 0x28A4] = 0x95EB ^ 0x28A4;
        kotakbaz.rain.client.util.other.A.D[0xFEDE ^ 0xFE88] = 0xFEB4 ^ 0xFE88;
        kotakbaz.rain.client.util.other.A.D[0xCE13 ^ 0xCF0F] = 0x11CE ^ 0xCF0F;
        kotakbaz.rain.client.util.other.A.D[0x8F7D ^ 0x8E06] = 0xFFFF71A6 ^ 0x8E06;
        kotakbaz.rain.client.util.other.A.D[0xA6D6 ^ 0xA655] = 0xA66C ^ 0xA655;
        kotakbaz.rain.client.util.other.A.D[0xFE36 ^ 0xFE95] = 0x87B5 ^ 0xFE95;
        kotakbaz.rain.client.util.other.A.D[0x6AE8 ^ 0x6BE1] = 0xEEAD ^ 0x6BE1;
        kotakbaz.rain.client.util.other.A.D[0xC64 ^ 0xC6C] = 0xFFFFF396 ^ 0xC6C;
        kotakbaz.rain.client.util.other.A.D[0x2C1D ^ 0x2D55] = 0xFFFFC205 ^ 0x2D55;
        kotakbaz.rain.client.util.other.A.D[0xCF1E ^ 0xCF17] = 0xFF00CF44 ^ 0xCF17;
        kotakbaz.rain.client.util.other.A.D[0x7920 ^ 0x78AF] = 0xA20C ^ 0x78AF;
        kotakbaz.rain.client.util.other.A.D[0x5220 ^ 0x5306] = 0xB786 ^ 0x5306;
        kotakbaz.rain.client.util.other.A.D[0x10A1F ^ 0x10B09] = 0x16AEA ^ 0x10B09;
        kotakbaz.rain.client.util.other.A.D[0x7D98 ^ 0x7CDD] = 0x17505 ^ 0x7CDD;
        kotakbaz.rain.client.util.other.A.D[0x905D ^ 0x9085] = 0xFFFFA541 ^ 0x9085;
        kotakbaz.rain.client.util.other.A.D[0xF61D ^ 0xF68F] = 0x1101 ^ 0xF68F;
        kotakbaz.rain.client.util.other.A.D[0x16B6 ^ 0x1691] = 0x1834 ^ 0x1691;
        kotakbaz.rain.client.util.other.A.D[0x1009C ^ 0x101A7] = 0x10F0F ^ 0x101A7;
        kotakbaz.rain.client.util.other.A.D[0xFF6 ^ 0xEAB] = 0xF26A ^ 0xEAB;
        kotakbaz.rain.client.util.other.A.D[0x9889 ^ 0x9883] = 0x98A3 ^ 0x9883;
        kotakbaz.rain.client.util.other.A.D[0x4328 ^ 0x43A5] = 0x43A5 ^ 0x43A5;
        kotakbaz.rain.client.util.other.A.D[0x6FD9 ^ 0x6EA9] = 0x6EA4 ^ 0x6EA9;
        kotakbaz.rain.client.util.other.A.D[0x175F ^ 0x1765] = 0xFFFFE888 ^ 0x1765;
        kotakbaz.rain.client.util.other.A.D[0xB8E3 ^ 0xB996] = 0xB9BE ^ 0xB996;
        kotakbaz.rain.client.util.other.A.D[0x6722 ^ 0x67CE] = 0xBEB ^ 0x67CE;
        kotakbaz.rain.client.util.other.A.D[0xEED7 ^ 0xEE66] = 0x1EADB ^ 0xEE66;
        kotakbaz.rain.client.util.other.A.D[0xC086 ^ 0xC08D] = 0xFFFF3F00 ^ 0xC08D;
        kotakbaz.rain.client.util.other.A.D[0xA06D ^ 0xA0A7] = 0x148D ^ 0xA0A7;
        kotakbaz.rain.client.util.other.A.D[0x1068C ^ 0x107C2] = 0x18A04 ^ 0x107C2;
        kotakbaz.rain.client.util.other.A.D[0xCC43 ^ 0xCCA5] = 0xDD9D ^ 0xCCA5;
        kotakbaz.rain.client.util.other.A.D[0xBC30 ^ 0xBDB7] = 0xBDF8 ^ 0xBDB7;
        kotakbaz.rain.client.util.other.A.D[0x4A0B ^ 0x4AFC] = 0xEB1D ^ 0x4AFC;
        kotakbaz.rain.client.util.other.A.D[0xD2D4 ^ 0xD2BA] = 0xD2D2 ^ 0xD2BA;
        kotakbaz.rain.client.util.other.A.D[0x5716 ^ 0x5709] = 0x573D ^ 0x5709;
        kotakbaz.rain.client.util.other.A.D[0x6D8C ^ 0x6DF5] = 0x6DEE ^ 0x6DF5;
        kotakbaz.rain.client.util.other.A.D[0xF8A9 ^ 0xF823] = 0xFFFF07E2 ^ 0xF823;
        kotakbaz.rain.client.util.other.A.D[0xAE1E ^ 0xAE42] = 0xFFFF51A2 ^ 0xAE42;
        kotakbaz.rain.client.util.other.A.D[0x9537 ^ 0x9598] = 0x1911E ^ 0x9598;
        kotakbaz.rain.client.util.other.A.D[0xF905 ^ 0xF80F] = 0x5946 ^ 0xF80F;
        kotakbaz.rain.client.util.other.A.D[0xFB33 ^ 0xFAB7] = 0xFAB0 ^ 0xFAB7;
        kotakbaz.rain.client.util.other.A.D[0xF8D1 ^ 0xF8AD] = 0xF873 ^ 0xF8AD;
        kotakbaz.rain.client.util.other.A.D[0x5CEC ^ 0x5CD0] = 0xFFFFA311 ^ 0x5CD0;
        kotakbaz.rain.client.util.other.A.D[0x1F49 ^ 0x1FFE] = 0x7C01 ^ 0x1FFE;
        kotakbaz.rain.client.util.other.A.D[0xA85F ^ 0xA8BC] = 0xFA48 ^ 0xA8BC;
        kotakbaz.rain.client.util.other.A.D[0x5CA2 ^ 0x5CB1] = 0xFFFFA34F ^ 0x5CB1;
        kotakbaz.rain.client.util.other.A.D[0xBEA2 ^ 0xBE2E] = 0xBE2C ^ 0xBE2E;
        kotakbaz.rain.client.util.other.A.D[0x6D35 ^ 0x6DAF] = 0x1A33 ^ 0x6DAF;
        kotakbaz.rain.client.util.other.A.D[0x75F2 ^ 0x74A5] = 0x74A5 ^ 0x74A5;
        kotakbaz.rain.client.util.other.A.D[0x1F00 ^ 0x1E67] = 0x49F8 ^ 0x1E67;
        kotakbaz.rain.client.util.other.A.D[0x10186 ^ 0x101F5] = 0xFFFEFE43 ^ 0x101F5;
        kotakbaz.rain.client.util.other.A.D[0x578D ^ 0x5724] = 0xFFFF15FB ^ 0x5724;
        kotakbaz.rain.client.util.other.A.D[0x8A36 ^ 0x8AC3] = 0x631B ^ 0x8AC3;
        kotakbaz.rain.client.util.other.A.D[0x82A4 ^ 0x8290] = 0x8292 ^ 0x8290;
        kotakbaz.rain.client.util.other.A.D[0x10E5 ^ 0x103A] = 0x1213 ^ 0x103A;
        kotakbaz.rain.client.util.other.A.D[0x6BA0 ^ 0x6AF1] = 0xE72D ^ 0x6AF1;
        kotakbaz.rain.client.util.other.A.D[0x528F ^ 0x53D6] = 0x53D7 ^ 0x53D6;
        kotakbaz.rain.client.util.other.A.D[0x3ED9 ^ 0x3F9D] = 0x13600 ^ 0x3F9D;
        kotakbaz.rain.client.util.other.A.D[0x945A ^ 0x9575] = 0x9AC1 ^ 0x9575;
        kotakbaz.rain.client.util.other.A.D[0xDA56 ^ 0xDBD8] = 0xDBDB ^ 0xDBD8;
        kotakbaz.rain.client.util.other.A.D[0xEC97 ^ 0xECA0] = 0xFFFF132A ^ 0xECA0;
        kotakbaz.rain.client.util.other.A.D[0xFA89 ^ 0xFBD2] = 0xFBC0 ^ 0xFBD2;
        kotakbaz.rain.client.util.other.A.D[0x7F1E ^ 0x7F7D] = 0x7F5F ^ 0x7F7D;
        kotakbaz.rain.client.util.other.A.D[0x3F90 ^ 0x3F60] = 0xFFFF59CA ^ 0x3F60;
        kotakbaz.rain.client.util.other.A.D[0x8210 ^ 0x830A] = 0x5DE7 ^ 0x830A;
        kotakbaz.rain.client.util.other.A.D[0x6270 ^ 0x62C2] = 0x16649 ^ 0x62C2;
        kotakbaz.rain.client.util.other.A.D[0x6B9F ^ 0x6AF4] = 0x6ADB ^ 0x6AF4;
        kotakbaz.rain.client.util.other.A.D[0x99AA ^ 0x98AF] = 0xD6B3 ^ 0x98AF;
        kotakbaz.rain.client.util.other.A.D[0x11AB ^ 0x1150] = 0xB6FE ^ 0x1150;
        kotakbaz.rain.client.util.other.A.D[0x2DE6 ^ 0x2C8C] = 0x2C8F ^ 0x2C8C;
        kotakbaz.rain.client.util.other.A.D[0xC917 ^ 0xC99E] = 0xFFFF362D ^ 0xC99E;
        kotakbaz.rain.client.util.other.A.D[0xC0CD ^ 0xC025] = 0xD103 ^ 0xC025;
        kotakbaz.rain.client.util.other.A.D[0x10904 ^ 0x1090B] = 0x1098D ^ 0x1090B;
        kotakbaz.rain.client.util.other.A.D[0x2E90 ^ 0x2FCE] = 0x538A ^ 0x2FCE;
        kotakbaz.rain.client.util.other.A.D[0x9CC7 ^ 0x9CD5] = 0xFFFF6376 ^ 0x9CD5;
        kotakbaz.rain.client.util.other.A.D[0xBCD1 ^ 0xBC3B] = 0xD069 ^ 0xBC3B;
        kotakbaz.rain.client.util.other.A.D[0xEFE9 ^ 0xEFB8] = 0xC0A6 ^ 0xEFB8;
        kotakbaz.rain.client.util.other.A.D[0xA83D ^ 0xA901] = 0xFFFF5827 ^ 0xA901;
        kotakbaz.rain.client.util.other.A.D[0x9B64 ^ 0x9A19] = 0x9A19 ^ 0x9A19;
        kotakbaz.rain.client.util.other.A.D[0x10C54 ^ 0x10C49] = 0x10C33 ^ 0x10C49;
        kotakbaz.rain.client.util.other.A.D[0xA2B4 ^ 0xA210] = 0xDB35 ^ 0xA210;
        kotakbaz.rain.client.util.other.A.D[0xE736 ^ 0xE63B] = 0x4760 ^ 0xE63B;
        kotakbaz.rain.client.util.other.A.D[0x62EC ^ 0x63ED] = 0x69A4 ^ 0x63ED;
        kotakbaz.rain.client.util.other.A.D[0xB43A ^ 0xB53C] = 0x3077 ^ 0xB53C;
        kotakbaz.rain.client.util.other.A.D[0x409F ^ 0x41F3] = 0x41FC ^ 0x41F3;
        kotakbaz.rain.client.util.other.A.D[0x70E7 ^ 0x706C] = 0x706D ^ 0x706C;
        kotakbaz.rain.client.util.other.A.D[0xF608 ^ 0xF60A] = 0xF67C ^ 0xF60A;
        kotakbaz.rain.client.util.other.A.D[0x5D90 ^ 0x5D32] = 0x5A57 ^ 0x5D32;
        kotakbaz.rain.client.util.other.A.D[0x6984 ^ 0x6928] = 0xF214 ^ 0x6928;
        kotakbaz.rain.client.util.other.A.D[0x10918 ^ 0x10970] = 0xFFFEF68D ^ 0x10970;
        kotakbaz.rain.client.util.other.A.D[0xD5FA ^ 0xD55C] = 0xAC79 ^ 0xD55C;
        kotakbaz.rain.client.util.other.A.D[0xBDE9 ^ 0xBDFD] = 0xFFFF4259 ^ 0xBDFD;
        kotakbaz.rain.client.util.other.A.D[0x74C7 ^ 0x7472] = 0xFFFE8CE2 ^ 0x7472;
        kotakbaz.rain.client.util.other.A.D[0xBF0B ^ 0xBE48] = 0x1B790 ^ 0xBE48;
        kotakbaz.rain.client.util.other.A.D[0x39CF ^ 0x3882] = 0x99FF ^ 0x3882;
        kotakbaz.rain.client.util.other.A.D[0x4632 ^ 0x4647] = 0xFFFFB9CE ^ 0x4647;
        kotakbaz.rain.client.util.other.A.D[0x223 ^ 0x34C] = 0xFFFFFCF7 ^ 0x34C;
        kotakbaz.rain.client.util.other.A.D[0xB589 ^ 0xB400] = 0xB473 ^ 0xB400;
        kotakbaz.rain.client.util.other.A.D[0x4416 ^ 0x453A] = 0xFFFEBC7A ^ 0x453A;
        kotakbaz.rain.client.util.other.A.D[0x6DA6 ^ 0x6D78] = 0x6F5D ^ 0x6D78;
        kotakbaz.rain.client.util.other.A.D[0x3F4B ^ 0x3F73] = 0x3F4B ^ 0x3F73;
        kotakbaz.rain.client.util.other.A.D[0x5846 ^ 0x5838] = 0x5840 ^ 0x5838;
        kotakbaz.rain.client.util.other.A.D[0xF4DE ^ 0xF597] = 0xE567 ^ 0xF597;
        kotakbaz.rain.client.util.other.A.D[0x7F34 ^ 0x7FD9] = 0x1384 ^ 0x7FD9;
        kotakbaz.rain.client.util.other.A.D[0x505A ^ 0x50B5] = 0xC9B9 ^ 0x50B5;
        kotakbaz.rain.client.util.other.A.D[0x36C8 ^ 0x37B0] = 0x37BE ^ 0x37B0;
        kotakbaz.rain.client.util.other.A.D[0xAF8 ^ 0xAFE] = 0xAAC ^ 0xAFE;
        kotakbaz.rain.client.util.other.A.D[0x863F ^ 0x86C7] = 0xFFFFD8E9 ^ 0x86C7;
        kotakbaz.rain.client.util.other.A.D[0x104C1 ^ 0x105F3] = 0x1D9C3 ^ 0x105F3;
        kotakbaz.rain.client.util.other.A.D[0xE132 ^ 0xE18C] = 0x5984 ^ 0xE18C;
        kotakbaz.rain.client.util.other.A.D[0xCFD5 ^ 0xCEE2] = 0xF825 ^ 0xCEE2;
        kotakbaz.rain.client.util.other.A.D[0x64EF ^ 0x64B2] = 0x64E6 ^ 0x64B2;
        kotakbaz.rain.client.util.other.A.D[0x7162 ^ 0x7136] = 0xFFFF8ECD ^ 0x7136;
        kotakbaz.rain.client.util.other.A.D[0x6631 ^ 0x669C] = 0xFFFF0212 ^ 0x669C;
        kotakbaz.rain.client.util.other.A.D[0x3C0 ^ 0x347] = 0x319 ^ 0x347;
        kotakbaz.rain.client.util.other.A.D[0x4132 ^ 0x41E2] = 0xDA48 ^ 0x41E2;
        kotakbaz.rain.client.util.other.A.D[0x96B3 ^ 0x962D] = 0x71B ^ 0x962D;
        kotakbaz.rain.client.util.other.A.D[0x8188 ^ 0x80C4] = 0x21F1 ^ 0x80C4;
        kotakbaz.rain.client.util.other.A.D[0x9A20 ^ 0x9A1B] = 0xFFFF65E3 ^ 0x9A1B;
        kotakbaz.rain.client.util.other.A.D[0xBCC9 ^ 0xBCB9] = 0xFFFF4379 ^ 0xBCB9;
        kotakbaz.rain.client.util.other.A.D[0x1AD4 ^ 0x1B9F] = 0xBAE2 ^ 0x1B9F;
        kotakbaz.rain.client.util.other.A.D[0x2634 ^ 0x264E] = 0xFFFFD9A1 ^ 0x264E;
        kotakbaz.rain.client.util.other.A.D[0xA287 ^ 0xA3BD] = 0xAD16 ^ 0xA3BD;
        kotakbaz.rain.client.util.other.A.D[0x8B8B ^ 0x8B8F] = 0xFFFF7455 ^ 0x8B8F;
        kotakbaz.rain.client.util.other.A.D[0x2C5D ^ 0x2C1B] = 0x2C37 ^ 0x2C1B;
        kotakbaz.rain.client.util.other.A.D[0x11B3 ^ 0x11CC] = 0xFFFFEE73 ^ 0x11CC;
        kotakbaz.rain.client.util.other.A.D[0x109BD ^ 0x109AD] = 0xFFFEF662 ^ 0x109AD;
        kotakbaz.rain.client.util.other.A.D[0x61AC ^ 0x60FC] = 0xED5F ^ 0x60FC;
        kotakbaz.rain.client.util.other.A.D[0x666F ^ 0x664B] = 0xFFFF9982 ^ 0x664B;
        kotakbaz.rain.client.util.other.A.D[0x10A7B ^ 0x10ADE] = 0x1738C ^ 0x10ADE;
        kotakbaz.rain.client.util.other.A.D[0x178E ^ 0x178E] = 0x1755 ^ 0x178E;
        kotakbaz.rain.client.util.other.A.D[0x330C ^ 0x3382] = 0x3383 ^ 0x3382;
        kotakbaz.rain.client.util.other.A.D[0xC7E9 ^ 0xC7AE] = 0x9C6E ^ 0xC7AE;
        kotakbaz.rain.client.util.other.A.D[0x3B4B ^ 0x3A43] = 0xBF22 ^ 0x3A43;
        kotakbaz.rain.client.util.other.A.D[0x4C8D ^ 0x4CC1] = 0x814 ^ 0x4CC1;
        kotakbaz.rain.client.util.other.A.D[0xB7F6 ^ 0xB711] = 0xA623 ^ 0xB711;
        kotakbaz.rain.client.util.other.A.D[0x65DD ^ 0x65F4] = 0x659F ^ 0x65F4;
        kotakbaz.rain.client.util.other.A.D[0xA53A ^ 0xA573] = 0x3081 ^ 0xA573;
        kotakbaz.rain.client.util.other.A.D[0x43A8 ^ 0x43DA] = 0xFFFFBC17 ^ 0x43DA;
        kotakbaz.rain.client.util.other.A.D[0xDFFF ^ 0xDF6B] = 0x2A84 ^ 0xDF6B;
        kotakbaz.rain.client.util.other.A.D[0x9C04 ^ 0x9D67] = 0xFDAE ^ 0x9D67;
        kotakbaz.rain.client.util.other.A.D[0xF7AE ^ 0xF7F9] = 0xFFFF0837 ^ 0xF7F9;
        kotakbaz.rain.client.util.other.A.D[0x9EDA ^ 0x9FCE] = 0xFFFF1EE5 ^ 0x9FCE;
        kotakbaz.rain.client.util.other.A.D[0x5565 ^ 0x541B] = 0x541A ^ 0x541B;
        kotakbaz.rain.client.util.other.A.D[0x2DD3 ^ 0x2D11] = 0x9EE6 ^ 0x2D11;
        kotakbaz.rain.client.util.other.A.D[0x248E ^ 0x25D6] = 0x25D6 ^ 0x25D6;
        kotakbaz.rain.client.util.other.A.D[0xAF3A ^ 0xAFF3] = 0xFFFFE45A ^ 0xAFF3;
        kotakbaz.rain.client.util.other.A.D[0x79A ^ 0x6F3] = 0x6E3 ^ 0x6F3;
        kotakbaz.rain.client.util.other.A.D[0x8020 ^ 0x801E] = 0x8005 ^ 0x801E;
        kotakbaz.rain.client.util.other.A.D[0xD9A5 ^ 0xD998] = 0xFFFF261E ^ 0xD998;
        kotakbaz.rain.client.util.other.A.D[0x32FB ^ 0x338F] = 0x3389 ^ 0x338F;
        kotakbaz.rain.client.util.other.A.D[0xF8B1 ^ 0xF9A8] = 0x985C ^ 0xF9A8;
        kotakbaz.rain.client.util.other.A.D[0xE1CE ^ 0xE127] = 0xF015 ^ 0xE127;
        kotakbaz.rain.client.util.other.A.D[0x1A35 ^ 0x1B72] = 0xB82 ^ 0x1B72;
        kotakbaz.rain.client.util.other.A.D[0xBF60 ^ 0xBEE0] = 0xBEE4 ^ 0xBEE0;
        kotakbaz.rain.client.util.other.A.D[0x8368 ^ 0x837F] = 0x8316 ^ 0x837F;
        kotakbaz.rain.client.util.other.A.D[0x7FA1 ^ 0x7F1E] = 0xCCE2 ^ 0x7F1E;
        kotakbaz.rain.client.util.other.A.D[0x103E9 ^ 0x103C5] = 0xFFFEFC27 ^ 0x103C5;
        kotakbaz.rain.client.util.other.A.D[0x7072 ^ 0x7108] = 0x7101 ^ 0x7108;
        kotakbaz.rain.client.util.other.A.D[0x7423 ^ 0x747B] = 0xFFFF8BA9 ^ 0x747B;
        kotakbaz.rain.client.util.other.A.D[0xE67C ^ 0xE74F] = 0x3B69 ^ 0xE74F;
        kotakbaz.rain.client.util.other.A.D[0x7AE0 ^ 0x7AA8] = 0xA31A ^ 0x7AA8;
        kotakbaz.rain.client.util.other.A.D[0xA3BC ^ 0xA358] = 0xFFFF0E5D ^ 0xA358;
        kotakbaz.rain.client.util.other.A.D[0x1051F ^ 0x105A3] = 0x1BDAB ^ 0x105A3;
        kotakbaz.rain.client.util.other.A.D[0x186F ^ 0x1884] = 0x74D9 ^ 0x1884;
        kotakbaz.rain.client.util.other.A.D[0xB192 ^ 0xB1CD] = 0xFFFF4E17 ^ 0xB1CD;
        kotakbaz.rain.client.util.other.A.D[0x43F ^ 0x4E9] = 0xCEC7 ^ 0x4E9;
        kotakbaz.rain.client.util.other.A.D[0xE410 ^ 0xE513] = 0xAB0F ^ 0xE513;
        kotakbaz.rain.client.util.other.A.D[0x10914 ^ 0x109D2] = 0x1728B ^ 0x109D2;
        kotakbaz.rain.client.util.other.A.D[0x1001D ^ 0x10142] = 0x13897 ^ 0x10142;
        kotakbaz.rain.client.util.other.A.D[0x89FE ^ 0x89BC] = 0x89BC ^ 0x89BC;
        kotakbaz.rain.client.util.other.A.D[0x72E7 ^ 0x72B9] = 0xFFFF8D32 ^ 0x72B9;
        kotakbaz.rain.client.util.other.A.D[0xB200 ^ 0xB2C8] = 0x6E2 ^ 0xB2C8;
        kotakbaz.rain.client.util.other.A.D[0x10390 ^ 0x102C6] = 0x102C6 ^ 0x102C6;
        kotakbaz.rain.client.util.other.A.D[0xEE85 ^ 0xEFE4] = 0x35A2 ^ 0xEFE4;
        kotakbaz.rain.client.util.other.A.D[0xBAB7 ^ 0xBB92] = 0x3CD3 ^ 0xBB92;
        kotakbaz.rain.client.util.other.A.D[0x9D7B ^ 0x9D55] = 0xFFFF62A9 ^ 0x9D55;
        kotakbaz.rain.client.util.other.A.D[0x63AC ^ 0x63C5] = 0xFFFF9C07 ^ 0x63C5;
        kotakbaz.rain.client.util.other.A.D[0x103A6 ^ 0x10220] = 0x1022C ^ 0x10220;
        kotakbaz.rain.client.util.other.A.D[0xF4A ^ 0xE72] = 0x38B7 ^ 0xE72;
        kotakbaz.rain.client.util.other.A.D[0xDCFC ^ 0xDD7F] = 0xFFFF22FB ^ 0xDD7F;
        kotakbaz.rain.client.util.other.A.D[0x7C3D ^ 0x7C64] = 0x7C3B ^ 0x7C64;
        kotakbaz.rain.client.util.other.A.D[0x1699 ^ 0x17B2] = 0x1110D ^ 0x17B2;
        kotakbaz.rain.client.util.other.A.D[0x9227 ^ 0x9343] = 0xD28A ^ 0x9343;
        kotakbaz.rain.client.util.other.A.D[0x4DF0 ^ 0x4D10] = 0xFFFFB0A6 ^ 0x4D10;
        kotakbaz.rain.client.util.other.A.D[0x93E ^ 0x87F] = 0xDA8D ^ 0x87F;
        kotakbaz.rain.client.util.other.A.D[0x7231 ^ 0x729F] = 0xE9A3 ^ 0x729F;
        kotakbaz.rain.client.util.other.A.D[0xFCB1 ^ 0xFD93] = 0x7AD7 ^ 0xFD93;
        kotakbaz.rain.client.util.other.A.D[0xA4F4 ^ 0xA485] = 0xFFFF5BF6 ^ 0xA485;
        kotakbaz.rain.client.util.other.A.D[0x3E63 ^ 0x3E28] = 0x5FDC ^ 0x3E28;
        kotakbaz.rain.client.util.other.A.D[0xC4C7 ^ 0xC54F] = 0xC54A ^ 0xC54F;
        kotakbaz.rain.client.util.other.A.D[0x10D14 ^ 0x10C40] = 0x18492 ^ 0x10C40;
        kotakbaz.rain.client.util.other.A.D[0xB84F ^ 0xB898] = 0x72A6 ^ 0xB898;
        kotakbaz.rain.client.util.other.A.D[0x3D60 ^ 0x3DE4] = 0xFFFFC221 ^ 0x3DE4;
        kotakbaz.rain.client.util.other.A.D[0x6C6D ^ 0x6C10] = 0xFFFF93AA ^ 0x6C10;
        kotakbaz.rain.client.util.other.A.D[0x40F ^ 0x479] = 0xFFFFFBDC ^ 0x479;
        kotakbaz.rain.client.util.other.A.D[0x48C9 ^ 0x4886] = 0x2860 ^ 0x4886;
        kotakbaz.rain.client.util.other.A.D[0xEBC1 ^ 0xEBD7] = 0xFFFF145B ^ 0xEBD7;
        kotakbaz.rain.client.util.other.A.D[0x104B8 ^ 0x104A1] = 0x104A1 ^ 0x104A1;
    }
}

