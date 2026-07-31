/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.config;

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
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from kotakbaz.rain.config.b
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0010H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b\u00a8\u0006\u0017"}, d2={"Lkotakbaz/rain/config/ConfigInfo;", "", "", "name", "author", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/config/ConfigInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getAuthor", "rain-visuals"})
public final class b_0 {
    @NotNull
    private final String a;
    @NotNull
    private final String A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    public b_0(@NotNull String string, @NotNull String string2) {
        int n = D[0];
        n += D[1];
        Intrinsics.checkNotNullParameter(string, (String)b[n -= D[2]]);
        int n2 = D[3];
        n2 -= D[4];
        Intrinsics.checkNotNullParameter(string2, (String)b[n2 -= D[5]]);
        super();
        this.a = string;
        this.A = string2;
    }

    @NotNull
    public final String getName() {
        return this.a;
    }

    @NotNull
    public final String getAuthor() {
        return this.A;
    }

    @NotNull
    public final String component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.A;
    }

    @NotNull
    public final b_0 copy(@NotNull String string, @NotNull String string2) {
        int n = D[6];
        n ^= D[7];
        Intrinsics.checkNotNullParameter(string, (String)b[n ^= D[8]]);
        int n2 = D[9];
        n2 -= D[10];
        Intrinsics.checkNotNullParameter(string2, (String)b[n2 ^= D[11]]);
        return new b_0(string, string2);
    }

    public static /* synthetic */ b_0 copy$default(b_0 b_02, String string, String string2, int n, Object object) {
        int n2 = D[12];
        n2 += D[13];
        if ((n & (n2 += D[14])) != 0) {
            string = b_02.a;
        }
        int n3 = D[15];
        n3 -= D[16];
        if ((n & (n3 -= D[17])) != 0) {
            string2 = b_02.A;
        }
        return b_02.copy(string, string2);
    }

    @NotNull
    public String toString() {
        String string = this.A;
        String string2 = this.a;
        int n = D[18];
        n ^= D[19];
        n ^= D[20];
        int n2 = D[21];
        n2 -= D[22];
        int n3 = D[24];
        n3 ^= D[25];
        int n4 = D[27];
        n4 ^= D[28];
        return (String)b[n] + (String)b[n2 -= D[23]] + string2 + (String)b[n3 -= D[26]] + string + (String)b[n4 ^= D[29]];
    }

    public int hashCode() {
        long l = 6155559577500468072L;
        long l2 = -8374230388351064253L;
        int n = D[30];
        n += D[31];
        long l3 = l2;
        int n2 = D[33];
        n2 += D[34];
        l2 = l3 ^ ((long)this.a.hashCode() << (n ^= D[32]) ^ l3) & -1L << (n2 -= D[35]);
        int n3 = D[36];
        n3 -= D[37];
        n3 -= D[38];
        int n4 = D[39];
        n4 += D[40];
        n4 -= D[41];
        int n5 = D[42];
        n5 ^= D[43];
        long l4 = l2;
        int n6 = D[45];
        n6 += D[46];
        l2 = l4 ^ ((long)((int)(l2 >>> n3) * n4 + this.A.hashCode()) << (n5 -= D[44]) ^ l4) & -1L << (n6 -= D[47]);
        int n7 = D[48];
        n7 -= D[49];
        return (int)(l2 >>> (n7 ^= D[50]));
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            boolean bl = D[51];
            bl += D[52];
            return bl += D[53];
        }
        if (!(object instanceof b_0)) {
            boolean bl = D[54];
            bl ^= D[55];
            return bl += D[56];
        }
        b_0 b_02 = (b_0)object;
        if (!Intrinsics.areEqual(this.a, b_02.a)) {
            boolean bl = D[57];
            bl ^= D[58];
            return bl += D[59];
        }
        if (!Intrinsics.areEqual(this.A, b_02.A)) {
            boolean bl = D[60];
            bl -= D[61];
            return bl -= D[62];
        }
        boolean bl = D[63];
        bl += D[64];
        return bl ^= D[65];
    }

    static {
        b_0.b();
        long l = -3165016898792279037L;
        long l2 = 5068642047897752475L;
        long l3 = -243226094789773554L;
        long l4 = 2440457064309239140L;
        long l5 = -9162602000431336253L;
        long l6 = -3495525641218740198L;
        long l7 = 2702624618355082042L;
        long l8 = 1662027562513358927L;
        long l9 = -5710136087791444706L;
        long l10 = 9067465173620900726L;
        long l11 = 1369159569876373412L;
        long l12 = -3303620479055298306L;
        long l13 = -7287694698429213767L;
        long l14 = -3474563581383245662L;
        int n = D[66];
        n += D[67];
        b = new Object[n -= D[68]];
        long l15 = l14;
        int n2 = D[69];
        n2 ^= D[70];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= D[71]);
        Object[] objectArray = new Object[D[72]];
        objectArray[b_0.D[73]] = B;
        objectArray[b_0.D[74]] = D[75];
        int n3 = D[76];
        Object object = b_0.A()[D[77]];
        if (object == null) {
            char[] cArray = "\ubdf2\ubdfd\ubdeb\ubde7\ubdfd\ube11\ube18\ubdf5\ubde6\ubddb\ube19\ubdfa\ubdda\ube0d\ubdd8\ube17\ubddc\ube21\ubdf9\ube0a\ubdeb\ubdf3\ube33\ubddb\ube14\ubdda\ubdf4\ubde0\ubdd7\ubdec\ubdfe\ubddb\ubdfb\ubdef\ube0f\ube0f\ubdfa\ube07\ubdda\ubde7\ubde6\ube1d\ube1a\ube10\ubdee\ubdd6\ube11\ube18\ube00\ubdea\ubdfa\ubdf9\ubdda\ube09\ubde7\ubdf5\ube10\ubddb\ubdf9\ubdfe\ubddb\ubdf5\ube17\ube19\ube2f\ubdfd\ube1a\ubdf6\ubdf3\ube20\ubdde\ube0d\ube0c\ube10\ube12\ube15\ubdeb\ubdf4\ube13\ubded\ubdef\ubdef\ubdfa\ube1a\ubdeb\ube09\ubdd8\ube14\ube16\ubdf8\ubdf9\ubdd6\ubdf5\ube0f\ube1b\ube0f\ube21\ubdf2\ubdde\ube1d\ube1c\ubdfe\ubdf9\ubdf4\ubdd8\ubdfc\ube09\ube25".toCharArray();
            for (int i = D[78]; i < D[79]; ++i) {
                int n4 = cArray[i];
                n4 += D[80];
                n4 -= D[81];
                n4 += D[82];
                n4 += D[83];
                n4 -= D[84];
                n4 += D[85];
                n4 -= D[86];
                n4 += D[87];
                n4 -= D[88];
                n4 ^= D[89];
                cArray[i] = (char)(n4 ^= D[90]);
            }
            object = b_0.A()[b_0.D[91]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)b_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = D[92];
        n5 ^= D[93];
        l5 = l16 ^ (0x3E00000000L ^ l16) & -1L << (n5 += D[94]);
        long l17 = l12;
        int n6 = D[95];
        n6 -= D[96];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= D[97]);
        while (true) {
            int n7 = D[98];
            n7 += D[99];
            if ((int)l12 >= (int)(l5 >>> (n7 += D[100]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = D[101];
            n9 -= D[102];
            int n10 = D[104];
            n10 ^= D[105];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= D[103])) & -1L >>> (n10 += D[106]);
            long l19 = l8;
            int n11 = D[107];
            n11 -= D[108];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += D[109]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = D[110];
            n13 += D[111];
            int n14 = D[113];
            n14 ^= D[114];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += D[112])) & -1L >>> (n14 -= D[115]);
            int n15 = D[116];
            n15 += D[117];
            long l21 = l9;
            int n16 = D[119];
            n16 -= D[120];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= D[118]) ^ l21) & -1L << (n16 += D[121]);
            int n17 = D[122];
            n17 -= D[123];
            n17 -= D[124];
            int n18 = D[125];
            n18 += D[126];
            long l22 = l11;
            int n19 = D[128];
            n19 -= D[129];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 += D[127]))) ^ l22) & -1L >>> (n19 += D[130]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = D[131];
            n20 += D[132];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= D[133]);
            while (true) {
                int n21 = D[134];
                n21 -= D[135];
                if ((int)(l13 >>> (n21 -= D[136])) >= (int)l11) break;
                int n22 = D[137];
                n22 ^= D[138];
                int n23 = D[140];
                n23 -= D[141];
                cArray2[(int)(l13 >>> (n22 += b_0.D[139]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= D[142]))];
                l13 += 0x100000000L;
            }
            int n24 = D[143];
            n24 ^= D[144];
            int n25 = (int)(l14 >>> (n24 -= D[145]));
            l14 += 0x100000000L;
            b_0.b[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = D[146];
            n26 += D[147];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= D[148]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[D[149]];
        String string = (String)object[D[150]];
        object = object[D[151]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[152]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[153]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[155] ^ D[156]];
                byArray[b_0.D[157] ^ b_0.D[158]] = D[159] ^ D[160];
                byArray[b_0.D[161] ^ b_0.D[162]] = D[163] ^ D[164];
                byArray[b_0.D[165] ^ b_0.D[166]] = D[167] ^ D[168];
                byArray[b_0.D[169] ^ b_0.D[170]] = D[171] ^ D[172];
                byArray[b_0.D[173] ^ b_0.D[174]] = D[175] ^ D[176];
                byArray[b_0.D[177] ^ b_0.D[178]] = D[179] ^ D[180];
                byArray[b_0.D[181] ^ b_0.D[182]] = D[183] ^ D[184];
                byArray[b_0.D[185] ^ b_0.D[186]] = D[187] ^ D[188];
                byArray[b_0.D[189] ^ b_0.D[190]] = D[191] ^ D[192];
                byArray[b_0.D[193] ^ b_0.D[194]] = D[195] ^ D[196];
                byArray[b_0.D[197] ^ b_0.D[198]] = D[199] ^ D[200];
                byArray[b_0.D[201] ^ b_0.D[202]] = D[203] ^ D[204];
                byArray[b_0.D[205] ^ b_0.D[206]] = D[207] ^ D[208];
                byArray[b_0.D[209] ^ b_0.D[210]] = D[211] ^ D[212];
                byArray[b_0.D[213] ^ b_0.D[214]] = D[215] ^ D[216];
                byArray[b_0.D[217] ^ b_0.D[218]] = D[219] ^ D[220];
                objectArray2[b_0.D[154]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[221]];
            if (c == null) {
                byte[] byArray2 = new byte[D[222] ^ D[223]];
                byArray2[b_0.D[224] ^ b_0.D[225]] = D[226] ^ D[227];
                byArray2[b_0.D[228] ^ b_0.D[229]] = D[230] ^ D[231];
                byArray2[b_0.D[232] ^ b_0.D[233]] = D[234] ^ D[235];
                byArray2[b_0.D[236] ^ b_0.D[237]] = D[238] ^ D[239];
                byArray2[b_0.D[240] ^ b_0.D[241]] = D[242] ^ D[243];
                byArray2[b_0.D[244] ^ b_0.D[245]] = D[246] ^ D[247];
                byArray2[b_0.D[248] ^ b_0.D[249]] = D[250] ^ D[251];
                byArray2[b_0.D[252] ^ b_0.D[253]] = D[254] ^ D[255];
                byArray2[b_0.D[256] ^ b_0.D[257]] = D[258] ^ D[259];
                byArray2[b_0.D[260] ^ b_0.D[261]] = D[262] ^ D[263];
                byArray2[b_0.D[264] ^ b_0.D[265]] = D[266] ^ D[267];
                byArray2[b_0.D[268] ^ b_0.D[269]] = D[270] ^ D[271];
                byArray2[b_0.D[272] ^ b_0.D[273]] = D[274] ^ D[275];
                byArray2[b_0.D[276] ^ b_0.D[277]] = D[278] ^ D[279];
                byArray2[b_0.D[280] ^ b_0.D[281]] = D[282] ^ D[283];
                byArray2[b_0.D[284] ^ b_0.D[285]] = D[286] ^ D[287];
                byArray2[b_0.D[288] ^ b_0.D[289]] = D[290] ^ D[291];
                byArray2[b_0.D[292] ^ b_0.D[293]] = D[294] ^ D[295];
                byArray2[b_0.D[296] ^ b_0.D[297]] = D[298] ^ D[299];
                byArray2[b_0.D[300] ^ b_0.D[301]] = D[302] ^ D[303];
                byArray2[b_0.D[304] ^ b_0.D[305]] = D[306] ^ D[307];
                byArray2[b_0.D[308] ^ b_0.D[309]] = D[310] ^ D[311];
                byArray2[b_0.D[312] ^ b_0.D[313]] = D[314] ^ D[315];
                byArray2[b_0.D[316] ^ b_0.D[317]] = D[318] ^ D[319];
                byArray2[b_0.D[320] ^ b_0.D[321]] = D[322] ^ D[323];
                byArray2[b_0.D[324] ^ b_0.D[325]] = D[326] ^ D[327];
                byArray2[b_0.D[328] ^ b_0.D[329]] = D[330] ^ D[331];
                byArray2[b_0.D[332] ^ b_0.D[333]] = D[334] ^ D[335];
                byArray2[b_0.D[336] ^ b_0.D[337]] = D[338] ^ D[339];
                byArray2[b_0.D[340] ^ b_0.D[341]] = D[342] ^ D[343];
                byArray2[b_0.D[344] ^ b_0.D[345]] = D[346] ^ D[347];
                byArray2[b_0.D[348] ^ b_0.D[349]] = D[350] ^ D[351];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[352], byArray3, D[353], byArray.length);
                System.arraycopy(byArray2, D[354], byArray3, byArray.length, byArray2.length);
                Object object4 = b_0.A()[D[355]];
                if (object4 == null) {
                    char[] cArray = "\u74de\u7374\u737b\u736a\u7370\u7404\u735f\u73d5\u73ba\u73d6\u7376\u73d1\u73cd\u73d3\u7363\u7376\u736d\u73fd".toCharArray();
                    for (int i = D[356]; i < D[357]; ++i) {
                        int n2 = cArray[i];
                        n2 += D[358];
                        n2 -= D[359];
                        n2 += D[360];
                        n2 ^= D[361];
                        n2 ^= D[362];
                        n2 += D[363];
                        n2 += D[364];
                        n2 ^= D[365];
                        n2 ^= D[366];
                        n2 -= D[367];
                        cArray[i] = (char)(n2 ^= D[368]);
                    }
                    object4 = b_0.A()[b_0.D[369]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[370]];
                byArray4[b_0.D[371]] = D[372];
                byArray4[b_0.D[373]] = D[374];
                byArray4[b_0.D[375]] = D[376];
                byArray4[b_0.D[377]] = D[378];
                byArray4[b_0.D[379]] = D[380];
                byArray4[b_0.D[381]] = D[382];
                byArray4[b_0.D[383]] = D[384];
                byArray4[b_0.D[385]] = D[386];
                byArray4[b_0.D[387]] = D[388];
                byArray4[b_0.D[389]] = D[390];
                byArray4[b_0.D[391]] = D[392];
                byArray4[b_0.D[393]] = D[394];
                byArray4[b_0.D[395]] = D[396];
                byArray4[b_0.D[397]] = D[398];
                byArray4[b_0.D[399]] = -58;
                byArray4[0] = -63;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 12, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = b_0.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u7b67\u7bbb\u7bb9".toCharArray();
                    for (int i = 0; i < 3; ++i) {
                        int n3 = cArray[i];
                        n3 += 30641;
                        n3 ^= 0x4381;
                        n3 -= 26849;
                        n3 -= 31203;
                        n3 -= 27204;
                        n3 ^= 0xEA55;
                        n3 += 45014;
                        n3 -= 63544;
                        n3 += 39000;
                        n3 ^= 0xBF28;
                        n3 += 12842;
                        cArray[i] = (char)(n3 ^= 0x98FD);
                    }
                    object5 = b_0.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = b_0.A()[3];
            if (object6 == null) {
                char[] cArray = "\u4d95\u4da1\u4dbf\u4e03\u4daf\u4da8\u4daf\u4e03\u4dbe\u4da7\u4daf\u4dbf\u4e11\u4dbe\u4e35\u4e4a\u4e4a\u4e4d\u4e4c\u4e4b".toCharArray();
                for (int i = 0; i < 20; ++i) {
                    int n4 = cArray[i];
                    n4 ^= 0xBE0;
                    n4 ^= 0x1C2;
                    n4 ^= 0x5CE4;
                    n4 ^= 0xD307;
                    n4 ^= 0x5DCA;
                    n4 += 19019;
                    n4 -= 29933;
                    n4 += 40815;
                    n4 -= 27985;
                    n4 -= 8186;
                    n4 ^= 0xD55B;
                    n4 -= 20316;
                    n4 += 60541;
                    cArray[i] = (char)(n4 ^= 0x45DD);
                }
                object6 = b_0.A()[3] = new String(cArray);
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
        D = new int[0xC353 ^ 0xC2C3];
        b_0.D[0xA59F ^ 0xA50C] = 0xA53C ^ 0xA50C;
        b_0.D[0xA26A ^ 0xA3E4] = 0xFFFF5C31 ^ 0xA3E4;
        b_0.D[0x10C8D ^ 0x10DC3] = 0xFFFE682F ^ 0x10DC3;
        b_0.D[0x7D17 ^ 0x7D63] = 0x7DCB ^ 0x7D63;
        b_0.D[0xEC64 ^ 0xECFF] = 0x5827 ^ 0xECFF;
        b_0.D[0xD39 ^ 0xDEF] = 0xEF75 ^ 0xDEF;
        b_0.D[0xEBE2 ^ 0xEAF6] = 0x1E4A9 ^ 0xEAF6;
        b_0.D[0x1EAB ^ 0x1FF9] = 0xFFFF644E ^ 0x1FF9;
        b_0.D[0xF635 ^ 0xF6E7] = 0xC8FF ^ 0xF6E7;
        b_0.D[0x6173 ^ 0x6160] = 0x6101 ^ 0x6160;
        b_0.D[0xB856 ^ 0xB9D7] = 0xB9D2 ^ 0xB9D7;
        b_0.D[0x818D ^ 0x8121] = 0x2D00 ^ 0x8121;
        b_0.D[0x905C ^ 0x9109] = 0x5F4C ^ 0x9109;
        b_0.D[0x10896 ^ 0x1098D] = 0x1C686 ^ 0x1098D;
        b_0.D[0xDF76 ^ 0xDE2B] = 0x53B2 ^ 0xDE2B;
        b_0.D[0x5326 ^ 0x527D] = 0xB539 ^ 0x527D;
        b_0.D[0xBD62 ^ 0xBD0C] = 0xFFFF4299 ^ 0xBD0C;
        b_0.D[0x7C7D ^ 0x7CA5] = 0x9E3F ^ 0x7CA5;
        b_0.D[0x21F7 ^ 0x20E2] = 0x12EBE ^ 0x20E2;
        b_0.D[0x4F80 ^ 0x4F9A] = 0x4F80 ^ 0x4F9A;
        b_0.D[0xE5A7 ^ 0xE4DC] = 0xE4DF ^ 0xE4DC;
        b_0.D[0xC2D3 ^ 0xC252] = 0xC25B ^ 0xC252;
        b_0.D[0xD1A4 ^ 0xD162] = 0x9538 ^ 0xD162;
        b_0.D[0xAC25 ^ 0xADA0] = 0xADAF ^ 0xADA0;
        b_0.D[0xD35B ^ 0xD373] = 0xFFFF2CAB ^ 0xD373;
        b_0.D[0x33AC ^ 0x33A0] = 0xFFFFCC5C ^ 0x33A0;
        b_0.D[0x1DE9 ^ 0x1DD9] = 0xFFFFE24B ^ 0x1DD9;
        b_0.D[0xE34A ^ 0xE32C] = 0xE375 ^ 0xE32C;
        b_0.D[0x8F20 ^ 0x8F06] = 0xFFFF70C4 ^ 0x8F06;
        b_0.D[0x118A ^ 0x11FB] = 0xFFFFEEC7 ^ 0x11FB;
        b_0.D[0xBBD9 ^ 0xBA98] = 0x92C6 ^ 0xBA98;
        b_0.D[0x53A9 ^ 0x52B0] = 0x9DBB ^ 0x52B0;
        b_0.D[0x2A74 ^ 0x2B3F] = 0x2BAE ^ 0x2B3F;
        b_0.D[0x335F ^ 0x323D] = 0x323D ^ 0x323D;
        b_0.D[0x76EF ^ 0x77D7] = 0xB76B ^ 0x77D7;
        b_0.D[0xCB2F ^ 0xCBB6] = 0xCBB7 ^ 0xCBB6;
        b_0.D[0x336C ^ 0x3271] = 0x8DFD ^ 0x3271;
        b_0.D[0x254F ^ 0x2530] = 0xFFFFDAEB ^ 0x2530;
        b_0.D[0x915C ^ 0x9161] = 0xFFFF6EE6 ^ 0x9161;
        b_0.D[0xA55B ^ 0xA4D3] = 0xA4E3 ^ 0xA4D3;
        b_0.D[0x1CBA ^ 0x1CB7] = 0x1CF6 ^ 0x1CB7;
        b_0.D[0x8A2 ^ 0x8E6] = 0x8F8 ^ 0x8E6;
        b_0.D[0xC8BA ^ 0xC981] = 0x930 ^ 0xC981;
        b_0.D[0x77BC ^ 0x77E1] = 0xFFFF8848 ^ 0x77E1;
        b_0.D[0xC471 ^ 0xC446] = 0xFFFF3BCC ^ 0xC446;
        b_0.D[0x881D ^ 0x8821] = 0xFFFF7729 ^ 0x8821;
        b_0.D[0x3893 ^ 0x382A] = 0xC2AB ^ 0x382A;
        b_0.D[0xFC65 ^ 0xFD13] = 0xFD2D ^ 0xFD13;
        b_0.D[0xC9CB ^ 0xC8F2] = 0x843 ^ 0xC8F2;
        b_0.D[0x550A ^ 0x5488] = 0xFFFFAB6F ^ 0x5488;
        b_0.D[0xDBAA ^ 0xDB7F] = 0x39E3 ^ 0xDB7F;
        b_0.D[0xB14D ^ 0xB1FB] = 0xE5FB ^ 0xB1FB;
        b_0.D[0xE680 ^ 0xE662] = 0xFFFE1419 ^ 0xE662;
        b_0.D[0xD713 ^ 0xD7EA] = 0x8C3B ^ 0xD7EA;
        b_0.D[0xEAFA ^ 0xEBAD] = 0x25E8 ^ 0xEBAD;
        b_0.D[0x5F5B ^ 0x5E19] = 0x7641 ^ 0x5E19;
        b_0.D[0x54F4 ^ 0x541B] = 0x87C6 ^ 0x541B;
        b_0.D[0x76 ^ 0xA1] = 0xE243 ^ 0xA1;
        b_0.D[0x5519 ^ 0x55E7] = 0xFFFFBCE6 ^ 0x55E7;
        b_0.D[0x31CB ^ 0x3095] = 0xBD3B ^ 0x3095;
        b_0.D[0xDFF3 ^ 0xDEB7] = 0xAE32 ^ 0xDEB7;
        b_0.D[0x11F4 ^ 0x1113] = 0xE6AF ^ 0x1113;
        b_0.D[0x43ED ^ 0x42C6] = 0x1C70 ^ 0x42C6;
        b_0.D[0xFFB2 ^ 0xFFA2] = 0xFF81 ^ 0xFFA2;
        b_0.D[0x9EC9 ^ 0x9E27] = 0xFFFFB219 ^ 0x9E27;
        b_0.D[0x2425 ^ 0x2528] = 0x59C4 ^ 0x2528;
        b_0.D[0xA7E ^ 0xA2E] = 0x7A8E ^ 0xA2E;
        b_0.D[0x2D55 ^ 0x2CD5] = 0xFFFFD35F ^ 0x2CD5;
        b_0.D[0x80A2 ^ 0x8069] = 0xFFFF759C ^ 0x8069;
        b_0.D[0xEDB7 ^ 0xED9C] = 0xFFFF126E ^ 0xED9C;
        b_0.D[0x2F8D ^ 0x2F32] = 0xFFFF6A7A ^ 0x2F32;
        b_0.D[0xB0B8 ^ 0xB1F7] = 0x2BFD ^ 0xB1F7;
        b_0.D[0xF2DD ^ 0xF3C7] = 0x3CEA ^ 0xF3C7;
        b_0.D[0x10F4 ^ 0x10D0] = 0xFFFFEF38 ^ 0x10D0;
        b_0.D[0xC762 ^ 0xC647] = 0x1C73C ^ 0xC647;
        b_0.D[0x62D0 ^ 0x6258] = 0x6207 ^ 0x6258;
        b_0.D[0x127E ^ 0x12E3] = 0x83D0 ^ 0x12E3;
        b_0.D[0x963F ^ 0x975E] = 0x975E ^ 0x975E;
        b_0.D[0x348A ^ 0x35FA] = 0xB324 ^ 0x35FA;
        b_0.D[0x5C00 ^ 0x5D49] = 0x5DD8 ^ 0x5D49;
        b_0.D[0xF12E ^ 0xF053] = 0xF052 ^ 0xF053;
        b_0.D[0xB0B4 ^ 0xB0AD] = 0xB0A4 ^ 0xB0AD;
        b_0.D[0xB49D ^ 0xB44E] = 0x8A76 ^ 0xB44E;
        b_0.D[0xE8A1 ^ 0xE8A9] = 0xE8D1 ^ 0xE8A9;
        b_0.D[0xAF8D ^ 0xAE8A] = 0x1E04 ^ 0xAE8A;
        b_0.D[0x3A57 ^ 0x3AD9] = 0xFFFFC56C ^ 0x3AD9;
        b_0.D[0xA2D1 ^ 0xA286] = 0x34C0 ^ 0xA286;
        b_0.D[0x5A8C ^ 0x5AF5] = 0x5AE8 ^ 0x5AF5;
        b_0.D[0x4F84 ^ 0x4F75] = 0x9F06 ^ 0x4F75;
        b_0.D[0x8A57 ^ 0x8AD0] = 0x8AE8 ^ 0x8AD0;
        b_0.D[0x10807 ^ 0x1089D] = 0x1089D ^ 0x1089D;
        b_0.D[0x9F3F ^ 0x9E20] = 0x21AC ^ 0x9E20;
        b_0.D[0xA3CE ^ 0xA2AE] = 0xA2AE ^ 0xA2AE;
        b_0.D[0x95DA ^ 0x9521] = 0xCEF0 ^ 0x9521;
        b_0.D[0x7E ^ 0xE8] = 0xEA ^ 0xE8;
        b_0.D[0xDA69 ^ 0xDBE2] = 0xDBE0 ^ 0xDBE2;
        b_0.D[0x7DE0 ^ 0x7DC2] = 0xFFFF8205 ^ 0x7DC2;
        b_0.D[0x68C0 ^ 0x6840] = 0xFFFF97EF ^ 0x6840;
        b_0.D[0x6B97 ^ 0x6AC4] = 0xEEBF ^ 0x6AC4;
        b_0.D[0xFFD2 ^ 0xFF58] = 0xFFFF0083 ^ 0xFF58;
        b_0.D[0x573B ^ 0x57AE] = 0x57AF ^ 0x57AE;
        b_0.D[0x439A ^ 0x438E] = 0xFFFFBC39 ^ 0x438E;
        b_0.D[0xB999 ^ 0xB964] = 0xAFF7 ^ 0xB964;
        b_0.D[0x3358 ^ 0x3333] = 0x3312 ^ 0x3333;
        b_0.D[0xCDE8 ^ 0xCDA2] = 0xCDA3 ^ 0xCDA2;
        b_0.D[0x2B0E ^ 0x2B8C] = 0x2BF6 ^ 0x2B8C;
        b_0.D[0xC66E ^ 0xC6E7] = 0xC6E9 ^ 0xC6E7;
        b_0.D[0x1602 ^ 0x1607] = 0xFFFFE9D2 ^ 0x1607;
        b_0.D[0x1453 ^ 0x1502] = 0x9179 ^ 0x1502;
        b_0.D[0x7E2 ^ 0x716] = 0x3310 ^ 0x716;
        b_0.D[0x7E7E ^ 0x7E9B] = 0x8927 ^ 0x7E9B;
        b_0.D[0x7919 ^ 0x7873] = 0x5DAF ^ 0x7873;
        b_0.D[0x2646 ^ 0x26FD] = 0xFFFF2395 ^ 0x26FD;
        b_0.D[0x842C ^ 0x845F] = 0x8421 ^ 0x845F;
        b_0.D[0x95CA ^ 0x94AE] = 0x94AE ^ 0x94AE;
        b_0.D[0x8B19 ^ 0x8BFD] = 0x7C5D ^ 0x8BFD;
        b_0.D[0x42C5 ^ 0x42D4] = 0x428C ^ 0x42D4;
        b_0.D[0x6BD5 ^ 0x6B25] = 0xBB5D ^ 0x6B25;
        b_0.D[0x2D07 ^ 0x2DF5] = 0xFDB0 ^ 0x2DF5;
        b_0.D[0xAB81 ^ 0xABD9] = 0x55A0 ^ 0xABD9;
        b_0.D[0x8D7D ^ 0x8D2F] = 0x8AAE ^ 0x8D2F;
        b_0.D[0x23F8 ^ 0x2397] = 0x23C4 ^ 0x2397;
        b_0.D[0x66C7 ^ 0x67E7] = 0x9005 ^ 0x67E7;
        b_0.D[0x847E ^ 0x8521] = 0x8B8 ^ 0x8521;
        b_0.D[0x3B3B ^ 0x3A17] = 0xC2EF ^ 0x3A17;
        b_0.D[0xC9A0 ^ 0xC96F] = 0x1CF88 ^ 0xC96F;
        b_0.D[0x68A8 ^ 0x69E4] = 0xF3EA ^ 0x69E4;
        b_0.D[0xBE97 ^ 0xBFFE] = 0x8A98 ^ 0xBFFE;
        b_0.D[0x2BAC ^ 0x2AD3] = 0x2ADB ^ 0x2AD3;
        b_0.D[0xF083 ^ 0xF063] = 0x1FD89 ^ 0xF063;
        b_0.D[0xC760 ^ 0xC708] = 0xFFFF380A ^ 0xC708;
        b_0.D[0xCF82 ^ 0xCFB3] = 0xFFFF304D ^ 0xCFB3;
        b_0.D[0x4DAC ^ 0x4D72] = 0xE655 ^ 0x4D72;
        b_0.D[0xB2CD ^ 0xB2F4] = 0xB2D6 ^ 0xB2F4;
        b_0.D[0x7B70 ^ 0x7A17] = 0x3C25 ^ 0x7A17;
        b_0.D[0x5BDF ^ 0x5B27] = 0xE2 ^ 0x5B27;
        b_0.D[0x4741 ^ 0x47CE] = 0x470D ^ 0x47CE;
        b_0.D[0x950C ^ 0x948A] = 0x94B4 ^ 0x948A;
        b_0.D[0x808D ^ 0x80D2] = 0xFFFF7F9A ^ 0x80D2;
        b_0.D[0x892C ^ 0x89AA] = 0x891D ^ 0x89AA;
        b_0.D[0x8F4B ^ 0x8F82] = 0x8584 ^ 0x8F82;
        b_0.D[0x59E3 ^ 0x59BA] = 0x70E6 ^ 0x59BA;
        b_0.D[0x6E5D ^ 0x6EFC] = 0x3461 ^ 0x6EFC;
        b_0.D[0xD22C ^ 0xD374] = 0x342B ^ 0xD374;
        b_0.D[0xCA6 ^ 0xCBE] = 0xC96 ^ 0xCBE;
        b_0.D[0x22CF ^ 0x23B5] = 0xFFFFDC66 ^ 0x23B5;
        b_0.D[0x5342 ^ 0x5272] = 0x7BE2 ^ 0x5272;
        b_0.D[0xF9B ^ 0xF09] = 0xFFFFF059 ^ 0xF09;
        b_0.D[0x639F ^ 0x632D] = 0x5C0F ^ 0x632D;
        b_0.D[0x60C8 ^ 0x6057] = 0xFFFF0E98 ^ 0x6057;
        b_0.D[0x9643 ^ 0x965F] = 0x960C ^ 0x965F;
        b_0.D[0x1073B ^ 0x1077A] = 0x10741 ^ 0x1077A;
        b_0.D[0x3FA1 ^ 0x3F7A] = 0x5825 ^ 0x3F7A;
        b_0.D[0x6088 ^ 0x61FC] = 0xFFFF9E06 ^ 0x61FC;
        b_0.D[0xE04C ^ 0xE179] = 0xE7E8 ^ 0xE179;
        b_0.D[0xD347 ^ 0xD2CD] = 0xFFFF2D18 ^ 0xD2CD;
        b_0.D[0x10AED ^ 0x10BDF] = 0x12277 ^ 0x10BDF;
        b_0.D[0x5717 ^ 0x576C] = 0x5744 ^ 0x576C;
        b_0.D[0xEC4F ^ 0xEC9F] = 0x1EA00 ^ 0xEC9F;
        b_0.D[0xA755 ^ 0xA795] = 0x1D22 ^ 0xA795;
        b_0.D[0x4F39 ^ 0x4E3B] = 0xADA2 ^ 0x4E3B;
        b_0.D[0xB93B ^ 0xB9B8] = 0xB98E ^ 0xB9B8;
        b_0.D[0xB683 ^ 0xB657] = 0x884F ^ 0xB657;
        b_0.D[0x2AA4 ^ 0x2BAA] = 0x576E ^ 0x2BAA;
        b_0.D[0xE130 ^ 0xE11D] = 0xE10C ^ 0xE11D;
        b_0.D[0x43F3 ^ 0x43E4] = 0xFFFFBC0D ^ 0x43E4;
        b_0.D[0x84D5 ^ 0x8417] = 0x18411 ^ 0x8417;
        b_0.D[0xC147 ^ 0xC059] = 0xFFFF8013 ^ 0xC059;
        b_0.D[0x8F02 ^ 0x8F2D] = 0x8F31 ^ 0x8F2D;
        b_0.D[0xF66D ^ 0xF759] = 0xF1D5 ^ 0xF759;
        b_0.D[0x4060 ^ 0x406F] = 0x4012 ^ 0x406F;
        b_0.D[0xCA0 ^ 0xCA1] = 0xFFFFF32C ^ 0xCA1;
        b_0.D[0xD23E ^ 0xD248] = 0xD207 ^ 0xD248;
        b_0.D[0xA754 ^ 0xA7EA] = 0x1D5D ^ 0xA7EA;
        b_0.D[0x1D88 ^ 0x1DBD] = 0xFFFFE258 ^ 0x1DBD;
        b_0.D[0xBCB5 ^ 0xBDD8] = 0x9C15 ^ 0xBDD8;
        b_0.D[0xCB74 ^ 0xCA70] = 0x7AE8 ^ 0xCA70;
        b_0.D[0xE3F7 ^ 0xE3DE] = 0xFFFF1C2D ^ 0xE3DE;
        b_0.D[0xC35A ^ 0xC320] = 0xC383 ^ 0xC320;
        b_0.D[0x1C51 ^ 0x1CAD] = 0xA36 ^ 0x1CAD;
        b_0.D[0x44B4 ^ 0x4468] = 0x2309 ^ 0x4468;
        b_0.D[0x10023 ^ 0x10115] = 0xFFFEF83A ^ 0x10115;
        b_0.D[0xCEBE ^ 0xCF94] = 0xFFFF6E88 ^ 0xCF94;
        b_0.D[0x7CB8 ^ 0x7CF3] = 0x7CF3 ^ 0x7CF3;
        b_0.D[0x7D1 ^ 0x7CC] = 0x7F3 ^ 0x7CC;
        b_0.D[0x1783 ^ 0x1607] = 0x1667 ^ 0x1607;
        b_0.D[0x7F6D ^ 0x7F56] = 0xFFFF80DB ^ 0x7F56;
        b_0.D[0x6320 ^ 0x6345] = 0x634E ^ 0x6345;
        b_0.D[0x992C ^ 0x9914] = 0x997C ^ 0x9914;
        b_0.D[0x711C ^ 0x717E] = 0xFFFF8ECC ^ 0x717E;
        b_0.D[0x97E3 ^ 0x9741] = 0xCDD5 ^ 0x9741;
        b_0.D[0xCEA7 ^ 0xCFD4] = 0xCFD2 ^ 0xCFD4;
        b_0.D[0x181F ^ 0x188F] = 0x18CE ^ 0x188F;
        b_0.D[0x6D9C ^ 0x6D02] = 0xFC3C ^ 0x6D02;
        b_0.D[0xF261 ^ 0xF352] = 0xDAD8 ^ 0xF352;
        b_0.D[0xC967 ^ 0xC912] = 0xFFFF36D5 ^ 0xC912;
        b_0.D[0xDE1A ^ 0xDF19] = 0x3CC9 ^ 0xDF19;
        b_0.D[0xF500 ^ 0xF5E9] = 0x10BA ^ 0xF5E9;
        b_0.D[0x49ED ^ 0x48A7] = 0x482A ^ 0x48A7;
        b_0.D[0x191F ^ 0x1871] = 0x802F ^ 0x1871;
        b_0.D[0x1982 ^ 0x18D4] = 0xD69A ^ 0x18D4;
        b_0.D[0x2509 ^ 0x247B] = 0x246B ^ 0x247B;
        b_0.D[0xD7AE ^ 0xD6F2] = 0x5B6E ^ 0xD6F2;
        b_0.D[0xCB0E ^ 0xCB41] = 0xCB2D ^ 0xCB41;
        b_0.D[0xE28B ^ 0xE29D] = 0xE28B ^ 0xE29D;
        b_0.D[0xD930 ^ 0xD917] = 0xD92D ^ 0xD917;
        b_0.D[0x2E40 ^ 0x2EB7] = 0x1AA1 ^ 0x2EB7;
        b_0.D[0x8FB8 ^ 0x8F08] = 0xC4D ^ 0x8F08;
        b_0.D[0x58 ^ 0x11B] = 0x2945 ^ 0x11B;
        b_0.D[0xE327 ^ 0xE346] = 0xFFFF1CC4 ^ 0xE346;
        b_0.D[0x483B ^ 0x4809] = 0xFFFFB7BD ^ 0x4809;
        b_0.D[0xA6ED ^ 0xA646] = 0xFFFFF5FC ^ 0xA646;
        b_0.D[0xF95D ^ 0xF95D] = 0xF92C ^ 0xF95D;
        b_0.D[0x5A7C ^ 0x5A77] = 0xFFFFA5D2 ^ 0x5A77;
        b_0.D[0xDE5D ^ 0xDE53] = 0xFFFF2197 ^ 0xDE53;
        b_0.D[0x249D ^ 0x251E] = 0x2510 ^ 0x251E;
        b_0.D[0x64E5 ^ 0x65CB] = 0xFFFF62E0 ^ 0x65CB;
        b_0.D[0x4FF8 ^ 0x4F49] = 0x7061 ^ 0x4F49;
        b_0.D[0x43C2 ^ 0x43E2] = 0xFFFFBC77 ^ 0x43E2;
        b_0.D[0x7C47 ^ 0x7C6D] = 0x7C6D ^ 0x7C6D;
        b_0.D[0x1D26 ^ 0x1DA3] = 0x1DD9 ^ 0x1DA3;
        b_0.D[0x4819 ^ 0x48BF] = 0xFFE2 ^ 0x48BF;
        b_0.D[0xE3D1 ^ 0xE3B8] = 0xFFFF1C21 ^ 0xE3B8;
        b_0.D[0x90FB ^ 0x9013] = 0x7549 ^ 0x9013;
        b_0.D[0x1280 ^ 0x1220] = 0x831E ^ 0x1220;
        b_0.D[0xEA02 ^ 0xEA7F] = 0xEAD9 ^ 0xEA7F;
        b_0.D[0x2FE8 ^ 0x2EC5] = 0xD62E ^ 0x2EC5;
        b_0.D[0x56C9 ^ 0x5746] = 0x5741 ^ 0x5746;
        b_0.D[0xE29F ^ 0xE3AE] = 0xCA24 ^ 0xE3AE;
        b_0.D[0xFE25 ^ 0xFEC3] = 0x967 ^ 0xFEC3;
        b_0.D[0xF491 ^ 0xF582] = 0x1CF ^ 0xF582;
        b_0.D[0xA227 ^ 0xA261] = 0xA253 ^ 0xA261;
        b_0.D[0x33F6 ^ 0x3337] = 0x1333A ^ 0x3337;
        b_0.D[0xE30B ^ 0xE3A8] = 0xFFFF4682 ^ 0xE3A8;
        b_0.D[0x66BE ^ 0x66A0] = 0xFFFF996E ^ 0x66A0;
        b_0.D[0x10CB5 ^ 0x10CAA] = 0xFFFEF34D ^ 0x10CAA;
        b_0.D[0xED5A ^ 0xEC36] = 0xD9FB ^ 0xEC36;
        b_0.D[0xAE40 ^ 0xAF28] = 0x7EDB ^ 0xAF28;
        b_0.D[0xBAF6 ^ 0xBA59] = 0xFFFFC6B6 ^ 0xBA59;
        b_0.D[0x2A6E ^ 0x2AA0] = 0x12C3F ^ 0x2AA0;
        b_0.D[0x48F9 ^ 0x48E2] = 0x488B ^ 0x48E2;
        b_0.D[0xB611 ^ 0xB6BB] = 0x1A9A ^ 0xB6BB;
        b_0.D[0x1CB5 ^ 0x1CC7] = 0xFFFFE365 ^ 0x1CC7;
        b_0.D[0xCE85 ^ 0xCE5F] = 0xA93E ^ 0xCE5F;
        b_0.D[0x10B0B ^ 0x10BCE] = 0x14F96 ^ 0x10BCE;
        b_0.D[0x689C ^ 0x68DE] = 0xFFFF973D ^ 0x68DE;
        b_0.D[0xF25B ^ 0xF284] = 0x5983 ^ 0xF284;
        b_0.D[0xB8BB ^ 0xB993] = 0xE73C ^ 0xB993;
        b_0.D[0xF095 ^ 0xF183] = 0xFFFE0001 ^ 0xF183;
        b_0.D[0xCAD4 ^ 0xCBF5] = 0x3C1D ^ 0xCBF5;
        b_0.D[0x8425 ^ 0x841F] = 0x844E ^ 0x841F;
        b_0.D[0x100E3 ^ 0x10057] = 0x13F75 ^ 0x10057;
        b_0.D[0x9BC0 ^ 0x9BB8] = 0x9BB2 ^ 0x9BB8;
        b_0.D[0x2293 ^ 0x23BA] = 0x7D0C ^ 0x23BA;
        b_0.D[0x19E9 ^ 0x188A] = 0x188B ^ 0x188A;
        b_0.D[0xAA66 ^ 0xAB67] = 0x48B7 ^ 0xAB67;
        b_0.D[0x552B ^ 0x55BC] = 0x55BC ^ 0x55BC;
        b_0.D[0xCF35 ^ 0xCE12] = 0x1CF69 ^ 0xCE12;
        b_0.D[0x63A7 ^ 0x62E2] = 0x1261 ^ 0x62E2;
        b_0.D[0xAE18 ^ 0xAF00] = 0x6015 ^ 0xAF00;
        b_0.D[0x832A ^ 0x8396] = 0x791F ^ 0x8396;
        b_0.D[0x589B ^ 0x58D2] = 0x58D2 ^ 0x58D2;
        b_0.D[0xD865 ^ 0xD8AD] = 0x9CF7 ^ 0xD8AD;
        b_0.D[0x69B ^ 0x712] = 0x71E ^ 0x712;
        b_0.D[0x10A34 ^ 0x10B24] = 0x1FF7C ^ 0x10B24;
        b_0.D[0xFB43 ^ 0xFB17] = 0x83A5 ^ 0xFB17;
        b_0.D[0xC1FA ^ 0xC1F9] = 0xFFFF3E1E ^ 0xC1F9;
        b_0.D[0x19C3 ^ 0x1920] = 0x114C6 ^ 0x1920;
        b_0.D[0x45E ^ 0x4D5] = 0x49E ^ 0x4D5;
        b_0.D[0xCE3 ^ 0xC83] = 0xFFFFF325 ^ 0xC83;
        b_0.D[0xD523 ^ 0xD45D] = 0xFFFF2BBA ^ 0xD45D;
        b_0.D[0x2682 ^ 0x265F] = 0x265F ^ 0x265F;
        b_0.D[0xAFD8 ^ 0xAFF6] = 0xAFDD ^ 0xAFF6;
        b_0.D[0xA20D ^ 0xA2E7] = 0xFFFFB860 ^ 0xA2E7;
        b_0.D[0x7FF8 ^ 0x7F5F] = 0xC85C ^ 0x7F5F;
        b_0.D[0xFD4A ^ 0xFDFD] = 0xFFFF564E ^ 0xFDFD;
        b_0.D[0x7C75 ^ 0x7CB6] = 0x17C9B ^ 0x7CB6;
        b_0.D[0x48C5 ^ 0x489B] = 0x48C0 ^ 0x489B;
        b_0.D[0xF21C ^ 0xF252] = 0xF252 ^ 0xF252;
        b_0.D[0xA3BE ^ 0xA367] = 0xC402 ^ 0xA367;
        b_0.D[0x8FC8 ^ 0x8F23] = 0x6A70 ^ 0x8F23;
        b_0.D[0x5F1 ^ 0x569] = 0x568 ^ 0x569;
        b_0.D[0xC985 ^ 0xC92B] = 0x4A6E ^ 0xC92B;
        b_0.D[0x10783 ^ 0x10747] = 0x741 ^ 0x10747;
        b_0.D[0x8878 ^ 0x882D] = 0xEA1E ^ 0x882D;
        b_0.D[0xFD92 ^ 0xFD95] = 0xFFFF0238 ^ 0xFD95;
        b_0.D[0x6FE5 ^ 0x6FA5] = 0xFFFF9002 ^ 0x6FA5;
        b_0.D[0x4AB5 ^ 0x4BA7] = 0xFFFF400F ^ 0x4BA7;
        b_0.D[0x14B7 ^ 0x1442] = 0x2054 ^ 0x1442;
        b_0.D[0xF97B ^ 0xF996] = 0x2A4B ^ 0xF996;
        b_0.D[0xA24D ^ 0xA322] = 0xE97C ^ 0xA322;
        b_0.D[0x96F3 ^ 0x9612] = 0x19BF4 ^ 0x9612;
        b_0.D[0xFEDD ^ 0xFFCA] = 0x1F196 ^ 0xFFCA;
        b_0.D[0xCAC4 ^ 0xCBC2] = 0xFFFF84BC ^ 0xCBC2;
        b_0.D[0x35A8 ^ 0x34A1] = 0xC65D ^ 0x34A1;
        b_0.D[0x852F ^ 0x84A8] = 0x84A2 ^ 0x84A8;
        b_0.D[0x7A6E ^ 0x7B2E] = 0x537E ^ 0x7B2E;
        b_0.D[0xB788 ^ 0xB699] = 0x42D4 ^ 0xB699;
        b_0.D[0x7C2C ^ 0x7C28] = 0x7C39 ^ 0x7C28;
        b_0.D[0x5BF0 ^ 0x5A88] = 0xFFFFA546 ^ 0x5A88;
        b_0.D[0x8217 ^ 0x8371] = 0xEC51 ^ 0x8371;
        b_0.D[0x7CA7 ^ 0x7D88] = 0x8563 ^ 0x7D88;
        b_0.D[0x4666 ^ 0x4659] = 0x46CA ^ 0x4659;
        b_0.D[0xCFF9 ^ 0xCEF1] = 0x3C0D ^ 0xCEF1;
        b_0.D[0xB3DE ^ 0xB30F] = 0x8D12 ^ 0xB30F;
        b_0.D[0x14CF ^ 0x14AB] = 0x14AC ^ 0x14AB;
        b_0.D[0x462A ^ 0x477A] = 0xC303 ^ 0x477A;
        b_0.D[0xC533 ^ 0xC560] = 0xCB12 ^ 0xC560;
        b_0.D[0xA46E ^ 0xA4E3] = 0xFFFF5B58 ^ 0xA4E3;
        b_0.D[0xB4B5 ^ 0xB486] = 0xFFFF4B51 ^ 0xB486;
        b_0.D[0xCAD3 ^ 0xCA6E] = 0x70DA ^ 0xCA6E;
        b_0.D[0x85AD ^ 0x8515] = 0xD115 ^ 0x8515;
        b_0.D[0x6371 ^ 0x63D8] = 0xCFF9 ^ 0x63D8;
        b_0.D[0xEF3D ^ 0xEF4D] = 0xEF54 ^ 0xEF4D;
        b_0.D[0xE04A ^ 0xE01B] = 0x56A ^ 0xE01B;
        b_0.D[0x109D4 ^ 0x109F1] = 0x109F7 ^ 0x109F1;
        b_0.D[0x6278 ^ 0x623D] = 0xFFFF9DAA ^ 0x623D;
        b_0.D[0x85C4 ^ 0x8548] = 0xFFFF7A18 ^ 0x8548;
        b_0.D[0x32FE ^ 0x3282] = 0x32E9 ^ 0x3282;
        b_0.D[0x10F1C ^ 0x10E2B] = 0x108BA ^ 0x10E2B;
        b_0.D[0xE746 ^ 0xE600] = 0xFFFF690A ^ 0xE600;
        b_0.D[0x627F ^ 0x62D2] = 0xE19B ^ 0x62D2;
        b_0.D[0x8B1A ^ 0x8B8E] = 0xFFFF742E ^ 0x8B8E;
        b_0.D[0x8FA5 ^ 0x8EFC] = 0x69B8 ^ 0x8EFC;
        b_0.D[0xC212 ^ 0xC35A] = 0xC3D3 ^ 0xC35A;
        b_0.D[0x7A18 ^ 0x7A5F] = 0xFFFF85DA ^ 0x7A5F;
        b_0.D[0x66DB ^ 0x67E4] = 0x26C5 ^ 0x67E4;
        b_0.D[0x91B1 ^ 0x91EB] = 0xA745 ^ 0x91EB;
        b_0.D[0xA5B9 ^ 0xA5CE] = 0xA5C3 ^ 0xA5CE;
        b_0.D[0x6DEA ^ 0x6DE3] = 0xFFFF9225 ^ 0x6DE3;
        b_0.D[0x8178 ^ 0x8001] = 0x8008 ^ 0x8001;
        b_0.D[0x42FC ^ 0x42B0] = 0x42B2 ^ 0x42B0;
        b_0.D[0x1456 ^ 0x145C] = 0x147C ^ 0x145C;
        b_0.D[0x80C4 ^ 0x80AE] = 0xFFFF7F2B ^ 0x80AE;
        b_0.D[0x1528 ^ 0x140E] = 0x11532 ^ 0x140E;
        b_0.D[0x2AA2 ^ 0x2A9C] = 0xFFFFD51D ^ 0x2A9C;
        b_0.D[0xCC12 ^ 0xCCE1] = 0x1C92 ^ 0xCCE1;
        b_0.D[0x15F9 ^ 0x15BA] = 0x15F9 ^ 0x15BA;
        b_0.D[0xFA6C ^ 0xFA24] = 0xFA27 ^ 0xFA24;
        b_0.D[0xD236 ^ 0xD36C] = 0xFFFFCB9F ^ 0xD36C;
        b_0.D[0x10211 ^ 0x10276] = 0xFFFEFDC5 ^ 0x10276;
        b_0.D[0xA1F0 ^ 0xA14A] = 0x5BC3 ^ 0xA14A;
        b_0.D[0x6B4C ^ 0x6B7A] = 0x6B68 ^ 0x6B7A;
        b_0.D[0xADFD ^ 0xAD91] = 0xFFFF5226 ^ 0xAD91;
        b_0.D[0x1AE0 ^ 0x1A1A] = 0xFFFFBE43 ^ 0x1A1A;
        b_0.D[0xCF14 ^ 0xCE53] = 0xBED0 ^ 0xCE53;
        b_0.D[0x5A5D ^ 0x5A7E] = 0xFFFFA5FC ^ 0x5A7E;
        b_0.D[0x86 ^ 0xCB] = 0xCB ^ 0xCB;
        b_0.D[0x1066F ^ 0x10763] = 0x17B80 ^ 0x10763;
        b_0.D[0xF155 ^ 0xF192] = 0xB5B7 ^ 0xF192;
        b_0.D[0x6A90 ^ 0x6BB2] = 0x9C18 ^ 0x6BB2;
        b_0.D[0x4518 ^ 0x4469] = 0x4468 ^ 0x4469;
        b_0.D[0x1086B ^ 0x1086D] = 0xFFFEF7BC ^ 0x1086D;
        b_0.D[0x10548 ^ 0x1051E] = 0x1C5D8 ^ 0x1051E;
        b_0.D[0xBCCC ^ 0xBCED] = 0xFFFF4336 ^ 0xBCED;
        b_0.D[0xE134 ^ 0xE16F] = 0xE16F ^ 0xE16F;
        b_0.D[0xA0BB ^ 0xA008] = 0xFFFF60CF ^ 0xA008;
        b_0.D[0xEE91 ^ 0xEFAC] = 0xAE8D ^ 0xEFAC;
        b_0.D[0x787 ^ 0x68D] = 0xFFFF0B81 ^ 0x68D;
        b_0.D[0xFEB4 ^ 0xFFE0] = 0x31B2 ^ 0xFFE0;
        b_0.D[0xA7D9 ^ 0xA735] = 0x74E9 ^ 0xA735;
        b_0.D[0x53FF ^ 0x5309] = 0xFFFF9891 ^ 0x5309;
        b_0.D[0xB9BB ^ 0xB98F] = 0xB9CA ^ 0xB98F;
        b_0.D[0xBA2 ^ 0xAD5] = 0xAD8 ^ 0xAD5;
        b_0.D[0x676B ^ 0x660E] = 0x661C ^ 0x660E;
        b_0.D[0xB5B3 ^ 0xB48F] = 0xF5BC ^ 0xB48F;
        b_0.D[0x10CFA ^ 0x10CA6] = 0x10CCA ^ 0x10CA6;
        b_0.D[0xA7B9 ^ 0xA7BB] = 0xFFFF5847 ^ 0xA7BB;
        b_0.D[0xD00B ^ 0xD135] = 0xFFFF6FE8 ^ 0xD135;
        b_0.D[0x991C ^ 0x9826] = 0xFFFFA710 ^ 0x9826;
        b_0.D[0x5801 ^ 0x590A] = 0xABF6 ^ 0x590A;
        b_0.D[0x6C28 ^ 0x6C3D] = 0xFFFF93C2 ^ 0x6C3D;
        b_0.D[0x183D ^ 0x1938] = 0xA9B6 ^ 0x1938;
        b_0.D[0xF049 ^ 0xF1C5] = 0xF1E4 ^ 0xF1C5;
        b_0.D[0x631 ^ 0x652] = 0x635 ^ 0x652;
        b_0.D[0x1D99 ^ 0x1DF4] = 0xFFFFE242 ^ 0x1DF4;
        b_0.D[0x6D7F ^ 0x6CF2] = 0x6CF9 ^ 0x6CF2;
        b_0.D[0x10800 ^ 0x108A4] = 0x15230 ^ 0x108A4;
        b_0.D[0xD792 ^ 0xD758] = 0xDD5F ^ 0xD758;
        b_0.D[0x956A ^ 0x95A7] = 0x1933F ^ 0x95A7;
        b_0.D[0x82EF ^ 0x8247] = 0x351A ^ 0x8247;
        b_0.D[0x10146 ^ 0x1002D] = 0x1B480 ^ 0x1002D;
        b_0.D[0x2AA5 ^ 0x2A10] = 0x7E1E ^ 0x2A10;
        b_0.D[0x8158 ^ 0x81DC] = 0x81F8 ^ 0x81DC;
        b_0.D[0xE0CF ^ 0xE0E3] = 0xFFFF1F31 ^ 0xE0E3;
        b_0.D[0x105C9 ^ 0x10484] = 0x19E8E ^ 0x10484;
        b_0.D[0x2E21 ^ 0x2EBD] = 0x9A75 ^ 0x2EBD;
        b_0.D[0x5D2E ^ 0x5C21] = 0x20CD ^ 0x5C21;
        b_0.D[0xE389 ^ 0xE2AD] = 0x1E3D1 ^ 0xE2AD;
        b_0.D[0x654 ^ 0x6AB] = 0x1038 ^ 0x6AB;
        b_0.D[0xBA67 ^ 0xBAAB] = 0xB0AC ^ 0xBAAB;
        b_0.D[0x3FF ^ 0x2E3] = 0xBD70 ^ 0x2E3;
        b_0.D[0x100CE ^ 0x101CE] = 0x1E20F ^ 0x101CE;
        b_0.D[0xB18D ^ 0xB19F] = 0xFFFF4E4F ^ 0xB19F;
        b_0.D[0xF2A9 ^ 0xF38A] = 0x462 ^ 0xF38A;
        b_0.D[0x1B8D ^ 0x1AF1] = 0x1A92 ^ 0x1AF1;
        b_0.D[0xE1CC ^ 0xE15D] = 0xE13F ^ 0xE15D;
        b_0.D[0x37E ^ 0x300] = 0xFFFFFC9F ^ 0x300;
        b_0.D[0x6073 ^ 0x6106] = 0x6102 ^ 0x6106;
        b_0.D[0x2FA5 ^ 0x2F00] = 0x9852 ^ 0x2F00;
    }
}

