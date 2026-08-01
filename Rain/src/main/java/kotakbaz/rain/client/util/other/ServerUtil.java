/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.other;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import net.minecraft.client.network.ServerInfo;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lkotakbaz/rain/client/util/other/ServerUtil;", "", "<init>", "()V", "", "hasActiveWorld", "()Z", "isFunTime", "isSingleplayer", "isFunTimeContext", "", "token", "isCurrentServerMatching", "(Ljava/lang/String;)Z", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nServerUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerUtil.kt\nkotakbaz/rain/client/util/other/ServerUtil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
public final class ServerUtil {
    @NotNull
    public static final ServerUtil INSTANCE;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    private ServerUtil() {
    }

    public final boolean hasActiveWorld() {
        int n2;
        if (kotakbaz.rain.client.extensions.b.getMc().player != null && kotakbaz.rain.client.extensions.b.getMc().world != null) {
            int n3 = C[0];
            n3 += C[1];
            n2 = n3 += C[2];
        } else {
            int n4 = C[3];
            n4 -= C[4];
            n2 = n4 += C[5];
        }
        return n2 != 0;
    }

    public final boolean isFunTime() {
        int n2 = C[6];
        n2 += C[7];
        return this.isCurrentServerMatching((String)a[n2 ^= C[8]]);
    }

    public final boolean isSingleplayer() {
        int n2;
        if (this.hasActiveWorld() && kotakbaz.rain.client.extensions.b.getMc().isInSingleplayer()) {
            int n3 = C[9];
            n3 += C[10];
            n2 = n3 ^= C[11];
        } else {
            int n4 = C[12];
            n4 += C[13];
            n2 = n4 ^= C[14];
        }
        return n2 != 0;
    }

    public final boolean isFunTimeContext() {
        int n2;
        if (this.isSingleplayer() || this.isFunTime()) {
            int n3 = C[15];
            n3 ^= C[16];
            n2 = n3 ^= C[17];
        } else {
            int n4 = C[18];
            n4 -= C[19];
            n2 = n4 ^= C[20];
        }
        return n2 != 0;
    }

    public final boolean isCurrentServerMatching(@NotNull String token) {
        String string;
        Object object;
        block10: {
            block9: {
                String string2;
                int n2;
                String string3;
                int n3;
                long l2 = -8994494575268508930L;
                int n4 = C[21];
                n4 += C[22];
                Intrinsics.checkNotNullParameter(token, (String)a[n4 ^= C[23]]);
                if (!this.hasActiveWorld() || kotakbaz.rain.client.extensions.b.getMc().isInSingleplayer()) {
                    boolean bl = C[24];
                    bl -= C[25];
                    return bl += C[26];
                }
                if (((CharSequence)token).length() == 0) {
                    int n5 = C[27];
                    n5 -= C[28];
                    n3 = n5 ^= C[29];
                } else {
                    int n6 = C[30];
                    n6 ^= C[31];
                    n3 = n6 += C[32];
                }
                if (n3 != 0) {
                    boolean bl = C[33];
                    bl -= C[34];
                    return bl += C[35];
                }
                object = kotakbaz.rain.client.extensions.b.getMc().getCurrentServerEntry();
                if (object == null || (string3 = ((ServerInfo)object).address) == null) break block9;
                String string4 = ((Object)StringsKt.trim((CharSequence)string3)).toString();
                if (string4 == null) break block9;
                String string5 = string = string4;
                long l3 = l2;
                int n7 = C[36];
                n7 ^= C[37];
                l2 = l3 ^ (0L ^ l3) & -1L << (n7 += C[38]);
                if (((CharSequence)string5).length() > 0) {
                    int n8 = C[39];
                    n8 -= C[40];
                    n2 = n8 += C[41];
                } else {
                    int n9 = C[42];
                    n9 -= C[43];
                    n2 = n9 += C[44];
                }
                String string6 = string2 = n2 != 0 ? string : null;
                if (string2 == null) break block9;
                string5 = string2;
                Locale locale = Locale.ROOT;
                int n10 = C[45];
                n10 ^= C[46];
                Intrinsics.checkNotNullExpressionValue(locale, (String)a[n10 -= C[47]]);
                String string7 = string5.toLowerCase(locale);
                int n11 = C[48];
                n11 ^= C[49];
                int n12 = C[51];
                n12 ^= C[52];
                Intrinsics.checkNotNullExpressionValue(string7, (String)a[n11 -= C[50]] + (String)a[n12 -= C[53]]);
                string = string7;
                if (string != null) break block10;
            }
            boolean bl = C[54];
            bl -= C[55];
            return bl -= C[56];
        }
        String string8 = string;
        CharSequence charSequence = string8;
        object = token;
        Locale locale = Locale.ROOT;
        int n13 = C[57];
        n13 ^= C[58];
        Intrinsics.checkNotNullExpressionValue(locale, (String)a[n13 ^= C[59]]);
        String string9 = ((String)object).toLowerCase(locale);
        int n14 = C[60];
        n14 -= C[61];
        int n15 = C[63];
        n15 -= C[64];
        Intrinsics.checkNotNullExpressionValue(string9, (String)a[n14 ^= C[62]] + (String)a[n15 -= C[65]]);
        boolean bl = C[66];
        bl ^= C[67];
        int n16 = C[69];
        n16 += C[70];
        return StringsKt.contains$default(charSequence, string9, bl ^= C[68], n16 -= C[71], null);
    }

    static {
        ServerUtil.b();
        long l2 = -7413511302175371272L;
        long l3 = -822892742211787099L;
        long l4 = 4760341869783472629L;
        long l5 = 1658535360821101744L;
        long l6 = 278045814350645675L;
        long l7 = -443272158238472159L;
        long l8 = 5384164892732409504L;
        long l9 = -3060663613392361894L;
        long l10 = -332086879168841237L;
        long l11 = -2222557034045807156L;
        long l12 = -782194696164389367L;
        long l13 = -507987109041794060L;
        long l14 = -8982787900238735375L;
        long l15 = 7273922736066848392L;
        int n2 = C[72];
        n2 -= C[73];
        a = new Object[n2 += C[74]];
        long l16 = l15;
        int n3 = C[75];
        n3 -= C[76];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += C[77]);
        Object[] objectArray = new Object[C[78]];
        objectArray[ServerUtil.C[79]] = A;
        objectArray[ServerUtil.C[80]] = C[81];
        int n4 = C[82];
        Object object = ServerUtil.A()[C[83]];
        if (object == null) {
            char[] cArray = "\uca49\uca5e\uca4b\uca38\uca42\ucbfb\ucbfe\uca2a\uca58\uca51\uca3e\uca27\uca3e\uca51\uca45\uca59\uca25\uca5f\uca41\uca3b\uca59\uca28\uca44\uca2e\uca3d\uca5b\ucbfc\uca54\uca54\ucbf9\uca55\uca43\uca2a\uca34\uca3a\uca26\uca49\uca34\uca22\ucbfc\uca37\uca4b\uca26\uca3d\ucbfb\uca49\uca38\ucbf6\uca39\uca24\uca5f\uca3d\uca29\uca2e\uca36\ucbf4\uca24\uca27\uca37\ucbf1\uca41\uca21\ucbf6\ucbf1\uca43\ucbf8\ucbfe\uca23\uca48\uca22\uca29\uca21\uca38\uca23\uca26\uca20\uca51\ucbf1\uca5b\uca27\uca38\ucbff\uca3f\uca56\uca37\ucbfa\uca3e\uca4b\ucbf1\uca57\ucbf5\uca3d\uca43\uca4e\uca45\uca20\uca5b\uca4a\ucbf7\uca48\ucbfa\uca49\uca4b\uca2e\uca5f\uca44\ucbf5\ucbf7\uca54\ucbf8\uca34\uca35\uca27\uca39\uca39\uca37\ucbfc\ucbf1\uca24\uca4a\ucbf4\uca38\uca23\uca56\uca36\uca54\uca44\uca46".toCharArray();
            for (int i2 = C[84]; i2 < C[85]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= C[86];
                n5 ^= C[87];
                n5 ^= C[88];
                n5 -= C[89];
                n5 += C[90];
                n5 ^= C[91];
                n5 ^= C[92];
                n5 += C[93];
                n5 -= C[94];
                n5 ^= C[95];
                cArray[i2] = (char)(n5 += C[96]);
            }
            object = ServerUtil.A()[ServerUtil.C[97]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ServerUtil.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[98];
        n6 += C[99];
        l6 = l17 ^ (0x4400000000L ^ l17) & -1L << (n6 -= C[100]);
        long l18 = l13;
        int n7 = C[101];
        n7 -= C[102];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += C[103]);
        while (true) {
            int n8 = C[104];
            n8 ^= C[105];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= C[106]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[107];
            n10 += C[108];
            int n11 = C[110];
            n11 ^= C[111];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[109])) & -1L >>> (n11 += C[112]);
            long l20 = l9;
            int n12 = C[113];
            n12 ^= C[114];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[115]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[116];
            n14 ^= C[117];
            int n15 = C[119];
            n15 += C[120];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += C[118])) & -1L >>> (n15 -= C[121]);
            int n16 = C[122];
            n16 ^= C[123];
            long l22 = l10;
            int n17 = C[125];
            n17 += C[126];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += C[124]) ^ l22) & -1L << (n17 ^= C[127]);
            int n18 = C[128];
            n18 -= C[129];
            n18 += C[130];
            int n19 = C[131];
            n19 += C[132];
            long l23 = l12;
            int n20 = C[134];
            n20 += C[135];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[133]))) ^ l23) & -1L >>> (n20 ^= C[136]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[137];
            n21 += C[138];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= C[139]);
            while (true) {
                int n22 = C[140];
                n22 ^= C[141];
                if ((int)(l14 >>> (n22 ^= C[142])) >= (int)l12) break;
                int n23 = C[143];
                n23 += C[144];
                int n24 = C[146];
                n24 -= C[147];
                cArray2[(int)(l14 >>> (n23 += ServerUtil.C[145]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= C[148]))];
                l14 += 0x100000000L;
            }
            int n25 = C[149];
            n25 ^= C[150];
            int n26 = (int)(l15 >>> (n25 -= C[151]));
            l15 += 0x100000000L;
            ServerUtil.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[152];
            n27 -= C[153];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[154]);
        }
        INSTANCE = new ServerUtil();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[155]];
        String string = (String)object[C[156]];
        object = object[C[157]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[158]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[159]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[161] ^ C[162]];
                byArray[ServerUtil.C[163] ^ ServerUtil.C[164]] = C[165] ^ C[166];
                byArray[ServerUtil.C[167] ^ ServerUtil.C[168]] = C[169] ^ C[170];
                byArray[ServerUtil.C[171] ^ ServerUtil.C[172]] = C[173] ^ C[174];
                byArray[ServerUtil.C[175] ^ ServerUtil.C[176]] = C[177] ^ C[178];
                byArray[ServerUtil.C[179] ^ ServerUtil.C[180]] = C[181] ^ C[182];
                byArray[ServerUtil.C[183] ^ ServerUtil.C[184]] = C[185] ^ C[186];
                byArray[ServerUtil.C[187] ^ ServerUtil.C[188]] = C[189] ^ C[190];
                byArray[ServerUtil.C[191] ^ ServerUtil.C[192]] = C[193] ^ C[194];
                byArray[ServerUtil.C[195] ^ ServerUtil.C[196]] = C[197] ^ C[198];
                byArray[ServerUtil.C[199] ^ ServerUtil.C[200]] = C[201] ^ C[202];
                byArray[ServerUtil.C[203] ^ ServerUtil.C[204]] = C[205] ^ C[206];
                byArray[ServerUtil.C[207] ^ ServerUtil.C[208]] = C[209] ^ C[210];
                byArray[ServerUtil.C[211] ^ ServerUtil.C[212]] = C[213] ^ C[214];
                byArray[ServerUtil.C[215] ^ ServerUtil.C[216]] = C[217] ^ C[218];
                byArray[ServerUtil.C[219] ^ ServerUtil.C[220]] = C[221] ^ C[222];
                byArray[ServerUtil.C[223] ^ ServerUtil.C[224]] = C[225] ^ C[226];
                objectArray2[ServerUtil.C[160]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[227]];
            if (b == null) {
                byte[] byArray2 = new byte[C[228] ^ C[229]];
                byArray2[ServerUtil.C[230] ^ ServerUtil.C[231]] = C[232] ^ C[233];
                byArray2[ServerUtil.C[234] ^ ServerUtil.C[235]] = C[236] ^ C[237];
                byArray2[ServerUtil.C[238] ^ ServerUtil.C[239]] = C[240] ^ C[241];
                byArray2[ServerUtil.C[242] ^ ServerUtil.C[243]] = C[244] ^ C[245];
                byArray2[ServerUtil.C[246] ^ ServerUtil.C[247]] = C[248] ^ C[249];
                byArray2[ServerUtil.C[250] ^ ServerUtil.C[251]] = C[252] ^ C[253];
                byArray2[ServerUtil.C[254] ^ ServerUtil.C[255]] = C[256] ^ C[257];
                byArray2[ServerUtil.C[258] ^ ServerUtil.C[259]] = C[260] ^ C[261];
                byArray2[ServerUtil.C[262] ^ ServerUtil.C[263]] = C[264] ^ C[265];
                byArray2[ServerUtil.C[266] ^ ServerUtil.C[267]] = C[268] ^ C[269];
                byArray2[ServerUtil.C[270] ^ ServerUtil.C[271]] = C[272] ^ C[273];
                byArray2[ServerUtil.C[274] ^ ServerUtil.C[275]] = C[276] ^ C[277];
                byArray2[ServerUtil.C[278] ^ ServerUtil.C[279]] = C[280] ^ C[281];
                byArray2[ServerUtil.C[282] ^ ServerUtil.C[283]] = C[284] ^ C[285];
                byArray2[ServerUtil.C[286] ^ ServerUtil.C[287]] = C[288] ^ C[289];
                byArray2[ServerUtil.C[290] ^ ServerUtil.C[291]] = C[292] ^ C[293];
                byArray2[ServerUtil.C[294] ^ ServerUtil.C[295]] = C[296] ^ C[297];
                byArray2[ServerUtil.C[298] ^ ServerUtil.C[299]] = C[300] ^ C[301];
                byArray2[ServerUtil.C[302] ^ ServerUtil.C[303]] = C[304] ^ C[305];
                byArray2[ServerUtil.C[306] ^ ServerUtil.C[307]] = C[308] ^ C[309];
                byArray2[ServerUtil.C[310] ^ ServerUtil.C[311]] = C[312] ^ C[313];
                byArray2[ServerUtil.C[314] ^ ServerUtil.C[315]] = C[316] ^ C[317];
                byArray2[ServerUtil.C[318] ^ ServerUtil.C[319]] = C[320] ^ C[321];
                byArray2[ServerUtil.C[322] ^ ServerUtil.C[323]] = C[324] ^ C[325];
                byArray2[ServerUtil.C[326] ^ ServerUtil.C[327]] = C[328] ^ C[329];
                byArray2[ServerUtil.C[330] ^ ServerUtil.C[331]] = C[332] ^ C[333];
                byArray2[ServerUtil.C[334] ^ ServerUtil.C[335]] = C[336] ^ C[337];
                byArray2[ServerUtil.C[338] ^ ServerUtil.C[339]] = C[340] ^ C[341];
                byArray2[ServerUtil.C[342] ^ ServerUtil.C[343]] = C[344] ^ C[345];
                byArray2[ServerUtil.C[346] ^ ServerUtil.C[347]] = C[348] ^ C[349];
                byArray2[ServerUtil.C[350] ^ ServerUtil.C[351]] = C[352] ^ C[353];
                byArray2[ServerUtil.C[354] ^ ServerUtil.C[355]] = C[356] ^ C[357];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[358], byArray3, C[359], byArray.length);
                System.arraycopy(byArray2, C[360], byArray3, byArray.length, byArray2.length);
                Object object4 = ServerUtil.A()[C[361]];
                if (object4 == null) {
                    char[] cArray = "\u172f\u1749\u1722\u1723\u177d\u16b9\u178e\u1788\u16d3\u1787\u1727\u178c\u1780\u177a\u172a\u1727\u1720\u16d0".toCharArray();
                    for (int i2 = C[362]; i2 < C[363]; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= C[364];
                        n3 -= C[365];
                        n3 += C[366];
                        n3 += C[367];
                        n3 -= C[368];
                        n3 ^= C[369];
                        n3 -= C[370];
                        n3 ^= C[371];
                        n3 -= C[372];
                        n3 ^= C[373];
                        n3 -= C[374];
                        cArray[i2] = (char)(n3 -= C[375]);
                    }
                    object4 = ServerUtil.A()[ServerUtil.C[376]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[377]];
                byArray4[ServerUtil.C[378]] = C[379];
                byArray4[ServerUtil.C[380]] = C[381];
                byArray4[ServerUtil.C[382]] = C[383];
                byArray4[ServerUtil.C[384]] = C[385];
                byArray4[ServerUtil.C[386]] = C[387];
                byArray4[ServerUtil.C[388]] = C[389];
                byArray4[ServerUtil.C[390]] = C[391];
                byArray4[ServerUtil.C[392]] = C[393];
                byArray4[ServerUtil.C[394]] = C[395];
                byArray4[ServerUtil.C[396]] = C[397];
                byArray4[ServerUtil.C[398]] = C[399];
                byArray4[8] = -10;
                byArray4[5] = -80;
                byArray4[7] = -26;
                byArray4[15] = 57;
                byArray4[1] = 116;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 19, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ServerUtil.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u37d4\u3780\u379a".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0x761;
                        n4 -= 54596;
                        n4 -= 20548;
                        n4 ^= 0x4FE5;
                        n4 -= 44872;
                        n4 += 57104;
                        n4 -= 56850;
                        n4 ^= 0xF16;
                        n4 -= 40824;
                        n4 -= 11995;
                        n4 -= 62140;
                        n4 ^= 0xBE9D;
                        n4 += 18942;
                        cArray[i3] = (char)(n4 += 20351);
                    }
                    object5 = ServerUtil.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ServerUtil.A()[3];
            if (object6 == null) {
                char[] cArray = "\u966d\u9669\u965b\u4bff\u966b\u9670\u966b\u4bff\u96c2\u9663\u966b\u965b\u4bf9\u96c2\u984d\u984e\u984e\u96c5\u9824\u96c7".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 7762;
                    n5 ^= 0xCF32;
                    n5 -= 37539;
                    n5 += 27428;
                    n5 += 47158;
                    n5 ^= 0x3106;
                    n5 ^= 0xA847;
                    n5 -= 13401;
                    n5 ^= 0xBA4C;
                    cArray[i4] = (char)(n5 += 61501);
                }
                object6 = ServerUtil.A()[3] = new String(cArray);
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
        C = new int[0x1A6B ^ 0x1BFB];
        ServerUtil.C[0x99B7 ^ 0x99D1] = 0x99F2 ^ 0x99D1;
        ServerUtil.C[0x1F09 ^ 0x1E4F] = 0xEDA0 ^ 0x1E4F;
        ServerUtil.C[0x139 ^ 0x119] = 0x127 ^ 0x119;
        ServerUtil.C[0xF200 ^ 0xF2B9] = 0x7A0B ^ 0xF2B9;
        ServerUtil.C[0xE61 ^ 0xE7E] = 0xFFFFF1E8 ^ 0xE7E;
        ServerUtil.C[0x9E69 ^ 0x9E72] = 0xFFFF6148 ^ 0x9E72;
        ServerUtil.C[0xBB9D ^ 0xBBA4] = 0xFFFF4474 ^ 0xBBA4;
        ServerUtil.C[0xC2C1 ^ 0xC3CA] = 0x96D7 ^ 0xC3CA;
        ServerUtil.C[0x601A ^ 0x6004] = 0x6050 ^ 0x6004;
        ServerUtil.C[0xACBD ^ 0xADC7] = 0xADCB ^ 0xADC7;
        ServerUtil.C[0x6452 ^ 0x6509] = 0x4243 ^ 0x6509;
        ServerUtil.C[0xB3AA ^ 0xB2CC] = 0xB2CC ^ 0xB2CC;
        ServerUtil.C[0xB602 ^ 0xB6A7] = 0xFFFF63B2 ^ 0xB6A7;
        ServerUtil.C[0xFE26 ^ 0xFF34] = 0xEDA7 ^ 0xFF34;
        ServerUtil.C[0x13EF ^ 0x1313] = 0xFFFFDF25 ^ 0x1313;
        ServerUtil.C[0x7705 ^ 0x7764] = 0x7764 ^ 0x7764;
        ServerUtil.C[0x5B29 ^ 0x5A45] = 0x82F6 ^ 0x5A45;
        ServerUtil.C[0x10FEE ^ 0x10F27] = 0xFFFED230 ^ 0x10F27;
        ServerUtil.C[0x9CC2 ^ 0x9CCF] = 0x9CED ^ 0x9CCF;
        ServerUtil.C[0x82D7 ^ 0x82FF] = 0x82DF ^ 0x82FF;
        ServerUtil.C[0xDF3E ^ 0xDF01] = 0xFFFF20F4 ^ 0xDF01;
        ServerUtil.C[0x1503 ^ 0x148E] = 0xFFFFEB4A ^ 0x148E;
        ServerUtil.C[0x6734 ^ 0x67F0] = 0x30F4 ^ 0x67F0;
        ServerUtil.C[0x80E7 ^ 0x80B1] = 0x7683 ^ 0x80B1;
        ServerUtil.C[0x1802 ^ 0x18B3] = 0x8254 ^ 0x18B3;
        ServerUtil.C[0xE05C ^ 0xE011] = 0xFFFF1F99 ^ 0xE011;
        ServerUtil.C[0x2574 ^ 0x2420] = 0xFFFFF96D ^ 0x2420;
        ServerUtil.C[0xF3DF ^ 0xF2A3] = 0xF2AD ^ 0xF2A3;
        ServerUtil.C[0x5880 ^ 0x58B1] = 0xFFFFA75D ^ 0x58B1;
        ServerUtil.C[0x792A ^ 0x780D] = 0x891 ^ 0x780D;
        ServerUtil.C[0x3507 ^ 0x35C8] = 0x9C0A ^ 0x35C8;
        ServerUtil.C[0xDFF ^ 0xDDE] = 0xFFFFF223 ^ 0xDDE;
        ServerUtil.C[0x759E ^ 0x7513] = 0x7519 ^ 0x7513;
        ServerUtil.C[0xEEDA ^ 0xEEE4] = 0xFFFF1152 ^ 0xEEE4;
        ServerUtil.C[0xA06C ^ 0xA084] = 0xFFFFAF62 ^ 0xA084;
        ServerUtil.C[0x9834 ^ 0x9895] = 0x4F4F ^ 0x9895;
        ServerUtil.C[0x2ACF ^ 0x2A25] = 0x1073 ^ 0x2A25;
        ServerUtil.C[0x8BDB ^ 0x8A82] = 0x430B ^ 0x8A82;
        ServerUtil.C[0xD2A3 ^ 0xD261] = 0x686 ^ 0xD261;
        ServerUtil.C[0xEF96 ^ 0xEFC2] = 0xEFC2 ^ 0xEFC2;
        ServerUtil.C[0x6252 ^ 0x631A] = 0xFFFF6F11 ^ 0x631A;
        ServerUtil.C[0xD8D5 ^ 0xD822] = 0x64CE ^ 0xD822;
        ServerUtil.C[0xD420 ^ 0xD4C7] = 0x24B6 ^ 0xD4C7;
        ServerUtil.C[0x34E5 ^ 0x35C4] = 0xAE21 ^ 0x35C4;
        ServerUtil.C[0xBF23 ^ 0xBFE6] = 0xFFFF174A ^ 0xBFE6;
        ServerUtil.C[0x1D69 ^ 0x1C63] = 0x4977 ^ 0x1C63;
        ServerUtil.C[0x3101 ^ 0x301C] = 0xDB26 ^ 0x301C;
        ServerUtil.C[0x2E75 ^ 0x2E8D] = 0xFFFF6DD0 ^ 0x2E8D;
        ServerUtil.C[0xF708 ^ 0xF64C] = 0xFFFF8146 ^ 0xF64C;
        ServerUtil.C[0x28AE ^ 0x284C] = 0x23A4 ^ 0x284C;
        ServerUtil.C[0x100C9 ^ 0x10085] = 0x100F1 ^ 0x10085;
        ServerUtil.C[0x8C32 ^ 0x8D1F] = 0xEA42 ^ 0x8D1F;
        ServerUtil.C[0x263D ^ 0x26E9] = 0xF213 ^ 0x26E9;
        ServerUtil.C[0x4281 ^ 0x4254] = 0x96D7 ^ 0x4254;
        ServerUtil.C[0xCE0C ^ 0xCE34] = 0xCE43 ^ 0xCE34;
        ServerUtil.C[0x7E34 ^ 0x7ED1] = 0x7ECA ^ 0x7ED1;
        ServerUtil.C[0x4781 ^ 0x47A8] = 0xFFFFB815 ^ 0x47A8;
        ServerUtil.C[0x57C2 ^ 0x56D5] = 0x2E02 ^ 0x56D5;
        ServerUtil.C[0x4615 ^ 0x468B] = 0x468A ^ 0x468B;
        ServerUtil.C[0x103CB ^ 0x103C1] = 0x103A8 ^ 0x103C1;
        ServerUtil.C[0x1CDC ^ 0x1CF1] = 0xFFFFE32B ^ 0x1CF1;
        ServerUtil.C[0x9BD3 ^ 0x9ABD] = 0x4EF8 ^ 0x9ABD;
        ServerUtil.C[0xF92F ^ 0xF9DB] = 0xFFFFEFCD ^ 0xF9DB;
        ServerUtil.C[0x48E2 ^ 0x48B1] = 0x48B1 ^ 0x48B1;
        ServerUtil.C[0x32AB ^ 0x3325] = 0x3328 ^ 0x3325;
        ServerUtil.C[0x303C ^ 0x30B0] = 0xFFFFCF7A ^ 0x30B0;
        ServerUtil.C[0xD6E4 ^ 0xD791] = 0x31DC ^ 0xD791;
        ServerUtil.C[0x3BC9 ^ 0x3AE1] = 0xFFFFB5B2 ^ 0x3AE1;
        ServerUtil.C[0x7C67 ^ 0x7C45] = 0xFFFF83DA ^ 0x7C45;
        ServerUtil.C[0xD39E ^ 0xD346] = 0xF532 ^ 0xD346;
        ServerUtil.C[0x3C2B ^ 0x3C73] = 0x55A0 ^ 0x3C73;
        ServerUtil.C[0x8ADB ^ 0x8ABE] = 0x8AAB ^ 0x8ABE;
        ServerUtil.C[0x58F ^ 0x4F9] = 0x1B47 ^ 0x4F9;
        ServerUtil.C[0x866E ^ 0x862A] = 0x8621 ^ 0x862A;
        ServerUtil.C[0x59A ^ 0x509] = 0x54D ^ 0x509;
        ServerUtil.C[0x9B8B ^ 0x9B98] = 0xFFFF6432 ^ 0x9B98;
        ServerUtil.C[0xE2A0 ^ 0xE2EA] = 0xFFFF1D43 ^ 0xE2EA;
        ServerUtil.C[0x1DEF ^ 0x1CFF] = 0xFFFEEF78 ^ 0x1CFF;
        ServerUtil.C[0x10004 ^ 0x10126] = 0x1F791 ^ 0x10126;
        ServerUtil.C[0x2577 ^ 0x25A1] = 0xF15B ^ 0x25A1;
        ServerUtil.C[0x8174 ^ 0x817A] = 0x8167 ^ 0x817A;
        ServerUtil.C[0x60C6 ^ 0x61CB] = 0x34D6 ^ 0x61CB;
        ServerUtil.C[0x9FCF ^ 0x9F6C] = 0xB5AC ^ 0x9F6C;
        ServerUtil.C[0x3306 ^ 0x3246] = 0xFFFF26D1 ^ 0x3246;
        ServerUtil.C[0xD97B ^ 0xD87E] = 0x1583 ^ 0xD87E;
        ServerUtil.C[0x520E ^ 0x52E0] = 0x6C8C ^ 0x52E0;
        ServerUtil.C[0xC55D ^ 0xC568] = 0xC554 ^ 0xC568;
        ServerUtil.C[0x4825 ^ 0x4816] = 0xFFFFB7A1 ^ 0x4816;
        ServerUtil.C[0x7A1E ^ 0x7A7D] = 0x7A46 ^ 0x7A7D;
        ServerUtil.C[0xCC8B ^ 0xCDEE] = 0x841D ^ 0xCDEE;
        ServerUtil.C[0x10041 ^ 0x10067] = 0xFFFEFFCD ^ 0x10067;
        ServerUtil.C[0xB8C4 ^ 0xB9E1] = 0x4F48 ^ 0xB9E1;
        ServerUtil.C[0x1260 ^ 0x12FB] = 0x12FA ^ 0x12FB;
        ServerUtil.C[0xEAE5 ^ 0xEA93] = 0xEA87 ^ 0xEA93;
        ServerUtil.C[0x57B5 ^ 0x57CE] = 0x57DE ^ 0x57CE;
        ServerUtil.C[0xBF24 ^ 0xBE19] = 0xA1F6 ^ 0xBE19;
        ServerUtil.C[0x70B9 ^ 0x70CD] = 0x70CD ^ 0x70CD;
        ServerUtil.C[0x9EF7 ^ 0x9EB8] = 0x9EB8 ^ 0x9EB8;
        ServerUtil.C[0x4CDA ^ 0x4CC6] = 0xFFFFB36E ^ 0x4CC6;
        ServerUtil.C[0xA4D2 ^ 0xA440] = 0xA4EA ^ 0xA440;
        ServerUtil.C[0x7B13 ^ 0x7A59] = 0x1288 ^ 0x7A59;
        ServerUtil.C[0x4077 ^ 0x401A] = 0x4070 ^ 0x401A;
        ServerUtil.C[0xC6B3 ^ 0xC6AE] = 0xFFFF393D ^ 0xC6AE;
        ServerUtil.C[0x39C1 ^ 0x389B] = 0x1FC8 ^ 0x389B;
        ServerUtil.C[0x5CAC ^ 0x5CDC] = 0xFFFFA32D ^ 0x5CDC;
        ServerUtil.C[0x285 ^ 0x3B3] = 0xFBDE ^ 0x3B3;
        ServerUtil.C[0xFFE3 ^ 0xFE97] = 0x99CD ^ 0xFE97;
        ServerUtil.C[0x6E ^ 0xE9] = 0x9D ^ 0xE9;
        ServerUtil.C[0x38F4 ^ 0x3840] = 0xDBA1 ^ 0x3840;
        ServerUtil.C[0x8FC ^ 0x9C9] = 0xE20A ^ 0x9C9;
        ServerUtil.C[0x8C22 ^ 0x8CA2] = 0x8CAC ^ 0x8CA2;
        ServerUtil.C[0x4121 ^ 0x401A] = 0x5FF5 ^ 0x401A;
        ServerUtil.C[0xD80C ^ 0xD83A] = 0xD8B6 ^ 0xD83A;
        ServerUtil.C[0xBF03 ^ 0xBE71] = 0xB788 ^ 0xBE71;
        ServerUtil.C[0x1BD5 ^ 0x1A9C] = 0xE968 ^ 0x1A9C;
        ServerUtil.C[0xFB73 ^ 0xFAF5] = 0xFAF5 ^ 0xFAF5;
        ServerUtil.C[0xAD8E ^ 0xACA2] = 0xCBF6 ^ 0xACA2;
        ServerUtil.C[0xEA32 ^ 0xEA5D] = 0xFFFF15CB ^ 0xEA5D;
        ServerUtil.C[0xE9C8 ^ 0xE929] = 0xFFFF1D28 ^ 0xE929;
        ServerUtil.C[0x10DB4 ^ 0x10CE2] = 0x1C57F ^ 0x10CE2;
        ServerUtil.C[0x3AD0 ^ 0x3B9B] = 0x5342 ^ 0x3B9B;
        ServerUtil.C[0xE2E4 ^ 0xE2A2] = 0xFFFF1D1C ^ 0xE2A2;
        ServerUtil.C[0x140D ^ 0x14A5] = 0xF9E9 ^ 0x14A5;
        ServerUtil.C[0xF61D ^ 0xF723] = 0x1C0C ^ 0xF723;
        ServerUtil.C[0xE57 ^ 0xEBB] = 0xFFFFCB0E ^ 0xEBB;
        ServerUtil.C[0x3F9F ^ 0x3F51] = 0xE77C ^ 0x3F51;
        ServerUtil.C[0x9E57 ^ 0x9F6B] = 0x80AD ^ 0x9F6B;
        ServerUtil.C[0x9518 ^ 0x940B] = 0x8698 ^ 0x940B;
        ServerUtil.C[0x3B2F ^ 0x3B5C] = 0x3B76 ^ 0x3B5C;
        ServerUtil.C[0x1069A ^ 0x106A7] = 0xFFFEF92B ^ 0x106A7;
        ServerUtil.C[0xABAE ^ 0xAAAA] = 0x672C ^ 0xAAAA;
        ServerUtil.C[0x131B ^ 0x1387] = 0x1385 ^ 0x1387;
        ServerUtil.C[0x72A4 ^ 0x738E] = 0x14D4 ^ 0x738E;
        ServerUtil.C[0x2577 ^ 0x2420] = 0xEDA9 ^ 0x2420;
        ServerUtil.C[0x2F97 ^ 0x2FBD] = 0xFFFFD034 ^ 0x2FBD;
        ServerUtil.C[0x3639 ^ 0x3776] = 0x13AC2 ^ 0x3776;
        ServerUtil.C[0xF231 ^ 0xF26A] = 0xE782 ^ 0xF26A;
        ServerUtil.C[0x9B74 ^ 0x9BE4] = 0xFFFF645F ^ 0x9BE4;
        ServerUtil.C[0xD5DD ^ 0xD5CD] = 0xFFFF2A03 ^ 0xD5CD;
        ServerUtil.C[0xBAD7 ^ 0xBBF4] = 0x4D5D ^ 0xBBF4;
        ServerUtil.C[0x8DBE ^ 0x8D4C] = 0x64F3 ^ 0x8D4C;
        ServerUtil.C[0x651D ^ 0x65A1] = 0xBE3A ^ 0x65A1;
        ServerUtil.C[0x33D7 ^ 0x3378] = 0xA9EC ^ 0x3378;
        ServerUtil.C[0x10C7E ^ 0x10C3E] = 0xFFFEF3A8 ^ 0x10C3E;
        ServerUtil.C[0x5D83 ^ 0x5CAA] = 0x2C36 ^ 0x5CAA;
        ServerUtil.C[0x369B ^ 0x3601] = 0x3664 ^ 0x3601;
        ServerUtil.C[0xC997 ^ 0xC8FD] = 0xC8FD ^ 0xC8FD;
        ServerUtil.C[0xAB7F ^ 0xAB4B] = 0xFFFF54BC ^ 0xAB4B;
        ServerUtil.C[0xB547 ^ 0xB556] = 0xB565 ^ 0xB556;
        ServerUtil.C[0x102CD ^ 0x10247] = 0xFFFEFDAA ^ 0x10247;
        ServerUtil.C[0x8164 ^ 0x80EE] = 0x80E7 ^ 0x80EE;
        ServerUtil.C[0x3DAD ^ 0x3C92] = 0xD7A0 ^ 0x3C92;
        ServerUtil.C[0xDC3A ^ 0xDDB9] = 0xFFFF222F ^ 0xDDB9;
        ServerUtil.C[0xFDD6 ^ 0xFD36] = 0xF6DE ^ 0xFD36;
        ServerUtil.C[0x231F ^ 0x2318] = 0x2314 ^ 0x2318;
        ServerUtil.C[0xEDAF ^ 0xED5C] = 0x4F4 ^ 0xED5C;
        ServerUtil.C[0xCF6B ^ 0xCE52] = 0x3635 ^ 0xCE52;
        ServerUtil.C[0xA726 ^ 0xA7FC] = 0x8188 ^ 0xA7FC;
        ServerUtil.C[0x10695 ^ 0x10714] = 0x10749 ^ 0x10714;
        ServerUtil.C[0xB717 ^ 0xB70D] = 0xFFFF48B4 ^ 0xB70D;
        ServerUtil.C[0x206D ^ 0x20BD] = 0x8977 ^ 0x20BD;
        ServerUtil.C[0x292A ^ 0x296D] = 0xFFFFD6B5 ^ 0x296D;
        ServerUtil.C[0xF1B4 ^ 0xF13A] = 0xFFFF0EDA ^ 0xF13A;
        ServerUtil.C[0x100C0 ^ 0x101AD] = 0x1165E ^ 0x101AD;
        ServerUtil.C[0x8173 ^ 0x810A] = 0xFFFF7E8E ^ 0x810A;
        ServerUtil.C[0x68FD ^ 0x6975] = 0x6971 ^ 0x6975;
        ServerUtil.C[0x6A3C ^ 0x6AD3] = 0x54AA ^ 0x6AD3;
        ServerUtil.C[0x71EE ^ 0x717F] = 0xFFFF8EA8 ^ 0x717F;
        ServerUtil.C[0x854C ^ 0x8543] = 0xFFFF7ABF ^ 0x8543;
        ServerUtil.C[0x86B6 ^ 0x864D] = 0xB591 ^ 0x864D;
        ServerUtil.C[0xD0A2 ^ 0xD1FF] = 0xF6B5 ^ 0xD1FF;
        ServerUtil.C[0x4740 ^ 0x4792] = 0xEE58 ^ 0x4792;
        ServerUtil.C[0x6A6 ^ 0x7FA] = 0xFFFFDF3D ^ 0x7FA;
        ServerUtil.C[0x62BF ^ 0x6239] = 0xFFFF9D07 ^ 0x6239;
        ServerUtil.C[0xD83A ^ 0xD8A3] = 0xD8D3 ^ 0xD8A3;
        ServerUtil.C[0x62B2 ^ 0x6226] = 0x6260 ^ 0x6226;
        ServerUtil.C[0x5663 ^ 0x5730] = 0x758A ^ 0x5730;
        ServerUtil.C[0xA312 ^ 0xA251] = 0x2A90 ^ 0xA251;
        ServerUtil.C[0x4A0F ^ 0x4AD4] = 0xD34F ^ 0x4AD4;
        ServerUtil.C[0xAECA ^ 0xAEA8] = 0xAEBA ^ 0xAEA8;
        ServerUtil.C[0x6FF0 ^ 0x6F48] = 0xE7F4 ^ 0x6F48;
        ServerUtil.C[0x35CC ^ 0x3539] = 0xDC91 ^ 0x3539;
        ServerUtil.C[0x1C2D ^ 0x1C21] = 0xFFFFE3DA ^ 0x1C21;
        ServerUtil.C[0xB48B ^ 0xB4C9] = 0xB4E1 ^ 0xB4C9;
        ServerUtil.C[0x707F ^ 0x70F4] = 0xFFFF8F06 ^ 0x70F4;
        ServerUtil.C[0x10987 ^ 0x109D7] = 0x109D6 ^ 0x109D7;
        ServerUtil.C[0x55C1 ^ 0x5561] = 0x5561 ^ 0x5561;
        ServerUtil.C[0x3232 ^ 0x3217] = 0x3227 ^ 0x3217;
        ServerUtil.C[0xC738 ^ 0xC620] = 0xFFFF417D ^ 0xC620;
        ServerUtil.C[0xAFDC ^ 0xAEB3] = 0xC176 ^ 0xAEB3;
        ServerUtil.C[0x8DDD ^ 0x8D2D] = 0xB369 ^ 0x8D2D;
        ServerUtil.C[0x6D09 ^ 0x6D3B] = 0x6D05 ^ 0x6D3B;
        ServerUtil.C[0xD30B ^ 0xD345] = 0xD346 ^ 0xD345;
        ServerUtil.C[0xFC1D ^ 0xFC60] = 0xFC3F ^ 0xFC60;
        ServerUtil.C[0x28E8 ^ 0x284C] = 0x288 ^ 0x284C;
        ServerUtil.C[0x1DA4 ^ 0x1D5A] = 0x5708 ^ 0x1D5A;
        ServerUtil.C[0x3A8D ^ 0x3A15] = 0x3A3E ^ 0x3A15;
        ServerUtil.C[0x289E ^ 0x29DB] = 0xA11A ^ 0x29DB;
        ServerUtil.C[0xFF33 ^ 0xFF31] = 0xFFFF00AA ^ 0xFF31;
        ServerUtil.C[0x5FEC ^ 0x5FF5] = 0xFFFFA04E ^ 0x5FF5;
        ServerUtil.C[0x7BF9 ^ 0x7B38] = 0xFFFF5042 ^ 0x7B38;
        ServerUtil.C[0x1BE2 ^ 0x1AF6] = 0x875 ^ 0x1AF6;
        ServerUtil.C[0x1D26 ^ 0x1DFB] = 0xFFFF7BCE ^ 0x1DFB;
        ServerUtil.C[0x12EA ^ 0x1383] = 0x1382 ^ 0x1383;
        ServerUtil.C[0xFA9C ^ 0xFB9C] = 0xB1EE ^ 0xFB9C;
        ServerUtil.C[0x9C73 ^ 0x9DFF] = 0x9DF9 ^ 0x9DFF;
        ServerUtil.C[0x10A4C ^ 0x10A49] = 0x10A1E ^ 0x10A49;
        ServerUtil.C[0x3C44 ^ 0x3C0F] = 0x3D03 ^ 0x3C0F;
        ServerUtil.C[0xA49E ^ 0xA497] = 0xFFFF5B73 ^ 0xA497;
        ServerUtil.C[0x8E81 ^ 0x8E28] = 0xFFFF9CE6 ^ 0x8E28;
        ServerUtil.C[0xA5DF ^ 0xA5F8] = 0xA59C ^ 0xA5F8;
        ServerUtil.C[0xDF2F ^ 0xDF43] = 0xDF61 ^ 0xDF43;
        ServerUtil.C[0xECA1 ^ 0xEDD6] = 0x40D8 ^ 0xEDD6;
        ServerUtil.C[0xE5A2 ^ 0xE581] = 0xFFFF1A22 ^ 0xE581;
        ServerUtil.C[0xD088 ^ 0xD199] = 0x1DDD9 ^ 0xD199;
        ServerUtil.C[0x11EB ^ 0x111A] = 0x2F63 ^ 0x111A;
        ServerUtil.C[0x33D3 ^ 0x32FC] = 0x13043 ^ 0x32FC;
        ServerUtil.C[0x10683 ^ 0x1079A] = 0x17F4D ^ 0x1079A;
        ServerUtil.C[0x7648 ^ 0x7666] = 0x762A ^ 0x7666;
        ServerUtil.C[0xA9F3 ^ 0xA9A6] = 0xA926 ^ 0xA9A6;
        ServerUtil.C[0xE94 ^ 0xFBF] = 0x68E2 ^ 0xFBF;
        ServerUtil.C[0x2052 ^ 0x2160] = 0xCAA6 ^ 0x2160;
        ServerUtil.C[0xC483 ^ 0xC4F1] = 0xFFFF3B0B ^ 0xC4F1;
        ServerUtil.C[0xC671 ^ 0xC74B] = 0xD8BB ^ 0xC74B;
        ServerUtil.C[0x153B ^ 0x1514] = 0xFFFFEA85 ^ 0x1514;
        ServerUtil.C[0xB1D ^ 0xB8B] = 0xFFFFF421 ^ 0xB8B;
        ServerUtil.C[0x335C ^ 0x3242] = 0xA9B5 ^ 0x3242;
        ServerUtil.C[0xA0CE ^ 0xA0B9] = 0xFFFF5FD8 ^ 0xA0B9;
        ServerUtil.C[0x16E ^ 0x1C4] = 0xEC88 ^ 0x1C4;
        ServerUtil.C[0x7CF ^ 0x771] = 0xDCEA ^ 0x771;
        ServerUtil.C[0xD887 ^ 0xD903] = 0xD908 ^ 0xD903;
        ServerUtil.C[0x85D9 ^ 0x85CE] = 0xFFFF7A18 ^ 0x85CE;
        ServerUtil.C[0x5F51 ^ 0x5E3A] = 0x5E28 ^ 0x5E3A;
        ServerUtil.C[0x9CB8 ^ 0x9CE4] = 0xD1CE ^ 0x9CE4;
        ServerUtil.C[0xC3F3 ^ 0xC2C2] = 0x1C07D ^ 0xC2C2;
        ServerUtil.C[0xDEE ^ 0xCE6] = 0x71CE ^ 0xCE6;
        ServerUtil.C[0xD57E ^ 0xD588] = 0x6972 ^ 0xD588;
        ServerUtil.C[0x4208 ^ 0x423F] = 0x422A ^ 0x423F;
        ServerUtil.C[0x22AD ^ 0x22F3] = 0xC26F ^ 0x22F3;
        ServerUtil.C[0x722 ^ 0x623] = 0x4C7A ^ 0x623;
        ServerUtil.C[0xB020 ^ 0xB150] = 0x11A6 ^ 0xB150;
        ServerUtil.C[0x251C ^ 0x25B1] = 0xFFFF1E3C ^ 0x25B1;
        ServerUtil.C[0xABA7 ^ 0xABD6] = 0xFFFF5426 ^ 0xABD6;
        ServerUtil.C[0x8011 ^ 0x8137] = 0xF1A7 ^ 0x8137;
        ServerUtil.C[0x2C4E ^ 0x2C4D] = 0xFFFFD3E3 ^ 0x2C4D;
        ServerUtil.C[0x3DD3 ^ 0x3C58] = 0x3C6D ^ 0x3C58;
        ServerUtil.C[0x214B ^ 0x212F] = 0x2102 ^ 0x212F;
        ServerUtil.C[0xC002 ^ 0xC08B] = 0xFFFF3F6E ^ 0xC08B;
        ServerUtil.C[0x5694 ^ 0x57EF] = 0xFFFFA849 ^ 0x57EF;
        ServerUtil.C[0x1414 ^ 0x1570] = 0x5CEC ^ 0x1570;
        ServerUtil.C[0x6A33 ^ 0x6B71] = 0xE3B2 ^ 0x6B71;
        ServerUtil.C[0x6239 ^ 0x6295] = 0xA6F1 ^ 0x6295;
        ServerUtil.C[0x7380 ^ 0x730F] = 0x7381 ^ 0x730F;
        ServerUtil.C[0x5DD9 ^ 0x5DD2] = 0x5D9E ^ 0x5DD2;
        ServerUtil.C[0x1422 ^ 0x1458] = 0x14C3 ^ 0x1458;
        ServerUtil.C[0xCB33 ^ 0xCBD0] = 0xCBD0 ^ 0xCBD0;
        ServerUtil.C[0xC890 ^ 0xC9C5] = 0xEB7F ^ 0xC9C5;
        ServerUtil.C[0x42C0 ^ 0x43E4] = 0xB535 ^ 0x43E4;
        ServerUtil.C[0xCA11 ^ 0xCB50] = 0x2062 ^ 0xCB50;
        ServerUtil.C[0x86F ^ 0x961] = 0x1052C ^ 0x961;
        ServerUtil.C[0xD7E2 ^ 0xD7D8] = 0xD7BE ^ 0xD7D8;
        ServerUtil.C[0x14B6 ^ 0x15AA] = 0xFFFF0130 ^ 0x15AA;
        ServerUtil.C[0xF93E ^ 0xF988] = 0x1A69 ^ 0xF988;
        ServerUtil.C[0x1091E ^ 0x109F5] = 0x133AC ^ 0x109F5;
        ServerUtil.C[0x4BA3 ^ 0x4B60] = 0x1C6A ^ 0x4B60;
        ServerUtil.C[0xDB41 ^ 0xDB9D] = 0x420C ^ 0xDB9D;
        ServerUtil.C[0xC743 ^ 0xC64F] = 0x9334 ^ 0xC64F;
        ServerUtil.C[0x8279 ^ 0x833E] = 0x70CA ^ 0x833E;
        ServerUtil.C[0x6C28 ^ 0x6C92] = 0xE42E ^ 0x6C92;
        ServerUtil.C[0x7D99 ^ 0x7C90] = 0x1CC ^ 0x7C90;
        ServerUtil.C[0x535E ^ 0x53F5] = 0x979A ^ 0x53F5;
        ServerUtil.C[0xC3D4 ^ 0xC3D5] = 0xC3D1 ^ 0xC3D5;
        ServerUtil.C[0x3FE6 ^ 0x3E81] = 0x3E81 ^ 0x3E81;
        ServerUtil.C[0x9FD6 ^ 0x9EE6] = 0xFFFE63BB ^ 0x9EE6;
        ServerUtil.C[0xBF31 ^ 0xBF58] = 0xFFFF40D7 ^ 0xBF58;
        ServerUtil.C[0xDE98 ^ 0xDE54] = 0x679 ^ 0xDE54;
        ServerUtil.C[0x5627 ^ 0x5744] = 0x1EB7 ^ 0x5744;
        ServerUtil.C[0x4C97 ^ 0x4CCD] = 0x925A ^ 0x4CCD;
        ServerUtil.C[0x1F0E ^ 0x1E51] = 0xC972 ^ 0x1E51;
        ServerUtil.C[0xEAFE ^ 0xEAE8] = 0xEADF ^ 0xEAE8;
        ServerUtil.C[0x4BF ^ 0x46C] = 0xD094 ^ 0x46C;
        ServerUtil.C[0x2FC6 ^ 0x2F91] = 0xD562 ^ 0x2F91;
        ServerUtil.C[0x38E7 ^ 0x382A] = 0xE03C ^ 0x382A;
        ServerUtil.C[0xA081 ^ 0xA000] = 0xFFFF5F9F ^ 0xA000;
        ServerUtil.C[0x9EA2 ^ 0x9F2B] = 0xFFFF60CA ^ 0x9F2B;
        ServerUtil.C[0xAF68 ^ 0xAF1D] = 0xFFFF50F0 ^ 0xAF1D;
        ServerUtil.C[0xF01E ^ 0xF018] = 0xF008 ^ 0xF018;
        ServerUtil.C[0x224E ^ 0x2333] = 0xFFFFDCE7 ^ 0x2333;
        ServerUtil.C[0xBE2B ^ 0xBE90] = 0x650B ^ 0xBE90;
        ServerUtil.C[0xF896 ^ 0xF8C7] = 0xF8C7 ^ 0xF8C7;
        ServerUtil.C[0xCD4A ^ 0xCC12] = 0x5A9 ^ 0xCC12;
        ServerUtil.C[0x9F97 ^ 0x9FC5] = 0x9FC7 ^ 0x9FC5;
        ServerUtil.C[0xDDCE ^ 0xDDB2] = 0xFFFF2227 ^ 0xDDB2;
        ServerUtil.C[0xE410 ^ 0xE487] = 0xFFFF1B7E ^ 0xE487;
        ServerUtil.C[0x8C33 ^ 0x8C59] = 0xFFFF739D ^ 0x8C59;
        ServerUtil.C[0xA66A ^ 0xA687] = 0x9CDE ^ 0xA687;
        ServerUtil.C[0xD2EC ^ 0xD211] = 0xE1CD ^ 0xD211;
        ServerUtil.C[0x92E5 ^ 0x93DD] = 0xFFFF9457 ^ 0x93DD;
        ServerUtil.C[0xD7A5 ^ 0xD795] = 0xFFFF283D ^ 0xD795;
        ServerUtil.C[0x1FCF ^ 0x1FA1] = 0xFFFFE018 ^ 0x1FA1;
        ServerUtil.C[0xD857 ^ 0xD81E] = 0xD85E ^ 0xD81E;
        ServerUtil.C[0x632A ^ 0x63C3] = 0x93B2 ^ 0x63C3;
        ServerUtil.C[0xDF70 ^ 0xDE0F] = 0xDE0B ^ 0xDE0F;
        ServerUtil.C[0xECB4 ^ 0xECCB] = 0xFFFF1306 ^ 0xECCB;
        ServerUtil.C[0xF1F1 ^ 0xF1E4] = 0xFFFF0E7A ^ 0xF1E4;
        ServerUtil.C[0xF8B ^ 0xF72] = 0xB39E ^ 0xF72;
        ServerUtil.C[0xE4CC ^ 0xE4C8] = 0xE4CD ^ 0xE4C8;
        ServerUtil.C[0x85A6 ^ 0x8522] = 0x8538 ^ 0x8522;
        ServerUtil.C[0xECD3 ^ 0xED82] = 0x1E036 ^ 0xED82;
        ServerUtil.C[0x40EE ^ 0x4085] = 0x40CC ^ 0x4085;
        ServerUtil.C[0x5BF ^ 0x593] = 0x598 ^ 0x593;
        ServerUtil.C[0x8C32 ^ 0x8C8F] = 0xFFFFA8AF ^ 0x8C8F;
        ServerUtil.C[0x3FBB ^ 0x3E3E] = 0x3E15 ^ 0x3E3E;
        ServerUtil.C[0x3BD9 ^ 0x3AD6] = 0x13696 ^ 0x3AD6;
        ServerUtil.C[0xC2F9 ^ 0xC2DD] = 0xC29B ^ 0xC2DD;
        ServerUtil.C[0xEEF ^ 0xE50] = 0xDABA ^ 0xE50;
        ServerUtil.C[0x2056 ^ 0x201E] = 0x2081 ^ 0x201E;
        ServerUtil.C[0xA5C ^ 0xA3C] = 0xAFC3 ^ 0xA3C;
        ServerUtil.C[0x10BA9 ^ 0x10B6E] = 0x12991 ^ 0x10B6E;
        ServerUtil.C[0xF0BA ^ 0xF05C] = 0x37 ^ 0xF05C;
        ServerUtil.C[0xBACB ^ 0xBBD1] = 0x50EF ^ 0xBBD1;
        ServerUtil.C[0x853D ^ 0x858A] = 0xD31 ^ 0x858A;
        ServerUtil.C[0xBE5C ^ 0xBEC1] = 0xBEC1 ^ 0xBEC1;
        ServerUtil.C[0xF7B7 ^ 0xF6DF] = 0xF6DF ^ 0xF6DF;
        ServerUtil.C[0xB928 ^ 0xB9F9] = 0xFFFFEFA4 ^ 0xB9F9;
        ServerUtil.C[0xCC87 ^ 0xCCD8] = 0xEF55 ^ 0xCCD8;
        ServerUtil.C[0x71DC ^ 0x7143] = 0x7142 ^ 0x7143;
        ServerUtil.C[0xF1BD ^ 0xF1F8] = 0xF1E4 ^ 0xF1F8;
        ServerUtil.C[0x1D7E ^ 0x1DD9] = 0xF09C ^ 0x1DD9;
        ServerUtil.C[0x166 ^ 0x36] = 0xFFFEF24E ^ 0x36;
        ServerUtil.C[0xAF8 ^ 0xB86] = 0xB8C ^ 0xB86;
        ServerUtil.C[0x11C6 ^ 0x10BF] = 0x10AF ^ 0x10BF;
        ServerUtil.C[0x2870 ^ 0x28DE] = 0xECBA ^ 0x28DE;
        ServerUtil.C[0xFA44 ^ 0xFABB] = 0xB0E2 ^ 0xFABB;
        ServerUtil.C[0x6EB0 ^ 0x6F90] = 0xF47C ^ 0x6F90;
        ServerUtil.C[0xE96E ^ 0xE916] = 0xE955 ^ 0xE916;
        ServerUtil.C[0xA543 ^ 0xA4C4] = 0xFFFF5B2E ^ 0xA4C4;
        ServerUtil.C[0x464F ^ 0x4750] = 0xDCB5 ^ 0x4750;
        ServerUtil.C[0x1FF7 ^ 0x1FE3] = 0x1F88 ^ 0x1FE3;
        ServerUtil.C[0x75B0 ^ 0x7538] = 0xFFFF8AAA ^ 0x7538;
        ServerUtil.C[0x5D39 ^ 0x5C58] = 0x8B7B ^ 0x5C58;
        ServerUtil.C[0x6E50 ^ 0x6F52] = 0xA2BF ^ 0x6F52;
        ServerUtil.C[0x4872 ^ 0x48C7] = 0xAB56 ^ 0x48C7;
        ServerUtil.C[0x104D7 ^ 0x10558] = 0xFFFEFAB5 ^ 0x10558;
        ServerUtil.C[0x617A ^ 0x61C9] = 0x822B ^ 0x61C9;
        ServerUtil.C[0x32F5 ^ 0x33C6] = 0xD805 ^ 0x33C6;
        ServerUtil.C[0xA0C1 ^ 0xA18C] = 0xC955 ^ 0xA18C;
        ServerUtil.C[0x4B8E ^ 0x4B57] = 0x6D49 ^ 0x4B57;
        ServerUtil.C[0xA725 ^ 0xA766] = 0xA745 ^ 0xA766;
        ServerUtil.C[0x9765 ^ 0x9724] = 0x9779 ^ 0x9724;
        ServerUtil.C[0x1205 ^ 0x12A7] = 0xC56D ^ 0x12A7;
        ServerUtil.C[0x6D55 ^ 0x6C43] = 0x1488 ^ 0x6C43;
        ServerUtil.C[0x6A00 ^ 0x6B4C] = 0x3AA ^ 0x6B4C;
        ServerUtil.C[0xDB23 ^ 0xDA6D] = 0x1D7D7 ^ 0xDA6D;
        ServerUtil.C[0x912D ^ 0x919D] = 0xB05 ^ 0x919D;
        ServerUtil.C[0xF8D1 ^ 0xF9A2] = 0x1AD8 ^ 0xF9A2;
        ServerUtil.C[0x13DF ^ 0x12AE] = 0xA0F9 ^ 0x12AE;
        ServerUtil.C[0xB400 ^ 0xB4DE] = 0x2D4F ^ 0xB4DE;
        ServerUtil.C[0x539B ^ 0x53A7] = 0xFFFFAC9A ^ 0x53A7;
        ServerUtil.C[0x782C ^ 0x797E] = 0x5BC5 ^ 0x797E;
        ServerUtil.C[0xF1FB ^ 0xF13D] = 0xA639 ^ 0xF13D;
        ServerUtil.C[0xA235 ^ 0xA2B6] = 0xFFFF5DDF ^ 0xA2B6;
        ServerUtil.C[0xF4C5 ^ 0xF477] = 0x6EEF ^ 0xF477;
        ServerUtil.C[0x6944 ^ 0x698F] = 0xB1A3 ^ 0x698F;
        ServerUtil.C[0xA011 ^ 0xA126] = 0x5941 ^ 0xA126;
        ServerUtil.C[0x1073E ^ 0x1073E] = 0x1075C ^ 0x1073E;
        ServerUtil.C[0xA98B ^ 0xA8F3] = 0xA8F2 ^ 0xA8F3;
        ServerUtil.C[0x119A ^ 0x1099] = 0xDD64 ^ 0x1099;
        ServerUtil.C[0x515B ^ 0x5039] = 0x19D9 ^ 0x5039;
        ServerUtil.C[0x42A6 ^ 0x43B3] = 0x5120 ^ 0x43B3;
        ServerUtil.C[0x8E48 ^ 0x8F66] = 0x18DC8 ^ 0x8F66;
        ServerUtil.C[0x20FE ^ 0x203E] = 0xF4D9 ^ 0x203E;
        ServerUtil.C[0xCB90 ^ 0xCBEE] = 0xFFFF3460 ^ 0xCBEE;
        ServerUtil.C[0x32B2 ^ 0x3265] = 0x141E ^ 0x3265;
        ServerUtil.C[0x10144 ^ 0x10156] = 0x10143 ^ 0x10156;
        ServerUtil.C[0x3236 ^ 0x3330] = 0x4E74 ^ 0x3330;
        ServerUtil.C[0x4B54 ^ 0x4A53] = 0x370F ^ 0x4A53;
        ServerUtil.C[0x107BD ^ 0x107A5] = 0x107A7 ^ 0x107A5;
        ServerUtil.C[0x3E8B ^ 0x3E83] = 0x3E9E ^ 0x3E83;
        ServerUtil.C[0x9AE0 ^ 0x9A65] = 0xFFFF65C6 ^ 0x9A65;
        ServerUtil.C[0xF40C ^ 0xF464] = 0xF40F ^ 0xF464;
        ServerUtil.C[0xB899 ^ 0xB8FE] = 0xB8D0 ^ 0xB8FE;
        ServerUtil.C[0x570B ^ 0x566B] = 0xFFFF7ED0 ^ 0x566B;
        ServerUtil.C[0xB375 ^ 0xB38F] = 0x8055 ^ 0xB38F;
        ServerUtil.C[0x10AD7 ^ 0x10A33] = 0x10A08 ^ 0x10A33;
        ServerUtil.C[0xF345 ^ 0xF38F] = 0xD175 ^ 0xF38F;
        ServerUtil.C[0xA4A1 ^ 0xA5FF] = 0x72DF ^ 0xA5FF;
        ServerUtil.C[0xE0F9 ^ 0xE0D2] = 0xFFFF1F46 ^ 0xE0D2;
        ServerUtil.C[0xFA10 ^ 0xFB0B] = 0x1031 ^ 0xFB0B;
        ServerUtil.C[0x2F79 ^ 0x2F20] = 0x56D6 ^ 0x2F20;
        ServerUtil.C[0x4045 ^ 0x409A] = 0x4B74 ^ 0x409A;
        ServerUtil.C[0x915E ^ 0x91DC] = 0xFFFF6E7D ^ 0x91DC;
        ServerUtil.C[0x7CD0 ^ 0x7D52] = 0x7D50 ^ 0x7D52;
        ServerUtil.C[0xFBE8 ^ 0xFBD3] = 0xFFFF0465 ^ 0xFBD3;
        ServerUtil.C[0x1315 ^ 0x1221] = 0xFFFF061C ^ 0x1221;
        ServerUtil.C[0x10C56 ^ 0x10CC3] = 0xFFFEF370 ^ 0x10CC3;
        ServerUtil.C[0x30BE ^ 0x313E] = 0x313D ^ 0x313E;
        ServerUtil.C[0xE163 ^ 0xE1C5] = 0xCB01 ^ 0xE1C5;
        ServerUtil.C[0x102ED ^ 0x102B0] = 0x10DFC ^ 0x102B0;
        ServerUtil.C[0x73B4 ^ 0x737C] = 0x5186 ^ 0x737C;
    }
}

