/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.ui.mainmenu.changelog;

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

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0010H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u00020\u0002H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b\u00a8\u0006\u0017"}, d2={"Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;", "", "", "type", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lkotakbaz/rain/ui/mainmenu/changelog/ChangeLogItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getType", "getText", "rain-visuals"})
public final class ChangeLogItem {
    @NotNull
    private final String type;
    @NotNull
    private final String text;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public ChangeLogItem(@NotNull String type, @NotNull String text) {
        int n2 = C[0];
        n2 += C[1];
        Intrinsics.checkNotNullParameter(type, (String)a[n2 += C[2]]);
        int n3 = C[3];
        n3 ^= C[4];
        Intrinsics.checkNotNullParameter(text, (String)a[n3 += C[5]]);
        this.type = type;
        this.text = text;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final String component1() {
        return this.type;
    }

    @NotNull
    public final String component2() {
        return this.text;
    }

    @NotNull
    public final ChangeLogItem copy(@NotNull String type, @NotNull String text) {
        int n2 = C[6];
        n2 -= C[7];
        Intrinsics.checkNotNullParameter(type, (String)a[n2 -= C[8]]);
        int n3 = C[9];
        n3 -= C[10];
        Intrinsics.checkNotNullParameter(text, (String)a[n3 += C[11]]);
        return new ChangeLogItem(type, text);
    }

    public static /* synthetic */ ChangeLogItem copy$default(ChangeLogItem changeLogItem, String string, String string2, int n2, Object object) {
        int n3 = C[12];
        n3 ^= C[13];
        if ((n2 & (n3 += C[14])) != 0) {
            string = changeLogItem.type;
        }
        int n4 = C[15];
        n4 -= C[16];
        if ((n2 & (n4 -= C[17])) != 0) {
            string2 = changeLogItem.text;
        }
        return changeLogItem.copy(string, string2);
    }

    @NotNull
    public String toString() {
        String string = this.text;
        String string2 = this.type;
        int n2 = C[18];
        n2 -= C[19];
        n2 += C[20];
        int n3 = C[21];
        n3 -= C[22];
        int n4 = C[24];
        n4 += C[25];
        int n5 = C[27];
        n5 -= C[28];
        return (String)a[n2] + (String)a[n3 += C[23]] + string2 + (String)a[n4 -= C[26]] + string + (String)a[n5 -= C[29]];
    }

    public int hashCode() {
        long l2 = 5181921761327421372L;
        long l3 = 6323628502189813112L;
        int n2 = C[30];
        n2 += C[31];
        long l4 = l3;
        int n3 = C[33];
        n3 ^= C[34];
        l3 = l4 ^ ((long)this.type.hashCode() << (n2 -= C[32]) ^ l4) & -1L << (n3 += C[35]);
        int n4 = C[36];
        n4 += C[37];
        n4 += C[38];
        int n5 = C[39];
        n5 += C[40];
        n5 += C[41];
        int n6 = C[42];
        n6 ^= C[43];
        long l5 = l3;
        int n7 = C[45];
        n7 += C[46];
        l3 = l5 ^ ((long)((int)(l3 >>> n4) * n5 + this.text.hashCode()) << (n6 ^= C[44]) ^ l5) & -1L << (n7 ^= C[47]);
        int n8 = C[48];
        n8 ^= C[49];
        return (int)(l3 >>> (n8 += C[50]));
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            boolean bl = C[51];
            bl ^= C[52];
            return bl -= C[53];
        }
        if (!(other instanceof ChangeLogItem)) {
            boolean bl = C[54];
            bl ^= C[55];
            return bl += C[56];
        }
        ChangeLogItem changeLogItem = (ChangeLogItem)other;
        if (!Intrinsics.areEqual(this.type, changeLogItem.type)) {
            boolean bl = C[57];
            bl ^= C[58];
            return bl ^= C[59];
        }
        if (!Intrinsics.areEqual(this.text, changeLogItem.text)) {
            boolean bl = C[60];
            bl += C[61];
            return bl -= C[62];
        }
        boolean bl = C[63];
        bl ^= C[64];
        return bl ^= C[65];
    }

    static {
        ChangeLogItem.b();
        long l2 = -5814221244290067632L;
        long l3 = -130186146089769623L;
        long l4 = -4283356197287669933L;
        long l5 = -426369794143809063L;
        long l6 = -4778259691318619506L;
        long l7 = 7666405790032355112L;
        long l8 = -7279523583769742857L;
        long l9 = -1779811286202435089L;
        long l10 = 6783679564471582753L;
        long l11 = -222128614322139751L;
        long l12 = -7959087405498073099L;
        long l13 = 2756102082653018168L;
        long l14 = -7583025870749725022L;
        long l15 = 2888366898192852885L;
        int n2 = C[66];
        n2 ^= C[67];
        a = new Object[n2 ^= C[68]];
        long l16 = l15;
        int n3 = C[69];
        n3 ^= C[70];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[71]);
        Object[] objectArray = new Object[C[72]];
        objectArray[ChangeLogItem.C[73]] = A;
        objectArray[ChangeLogItem.C[74]] = C[75];
        int n4 = C[76];
        Object object = ChangeLogItem.A()[C[77]];
        if (object == null) {
            char[] cArray = "\u22da\u2073\u2025\u206b\u200a\u203e\u22f9\u203b\u2300\u201a\u1f92\u1f91\u203b\u2013\u2034\u22fe\u2068\u2039\u203d\u22d6\u203b\u2069\u2045\u2073\u2016\u2043\u2076\u206b\u2069\u22fd\u2048\u206c\u2078\u2039\u2027\u2048\u203f\u2027\u1f9f\u2070\u1f9e\u1f94\u203d\u1f9c\u1f92\u1f94\u22fb\u1f94\u2069\u2049\u22da\u2028\u2018\u2063\u22fb\u207a\u2028\u2077\u203f\u2031\u2073\u1f9e\u22d6\u2016\u2077\u204b\u22fe\u1f91\u206b\u2075\u201a\u1f9e\u22fe\u2039\u203c\u203e\u2027\u2050\u2073\u2028\u206c\u204c\u1f91\u1f91\u2300\u206e\u1fa0\u2050\u2018\u22da\u2073\u2015\u22fc\u2018\u22fc\u2039\u22f9\u2065\u2070\u204c\u203f\u2070\u22da\u22d6\u2031\u1f9f\u2078\u22c4".toCharArray();
            for (int i2 = C[78]; i2 < C[79]; ++i2) {
                int n5 = cArray[i2];
                n5 -= C[80];
                n5 ^= C[81];
                n5 += C[82];
                n5 -= C[83];
                n5 ^= C[84];
                n5 -= C[85];
                n5 -= C[86];
                n5 ^= C[87];
                n5 ^= C[88];
                n5 += C[89];
                n5 += C[90];
                n5 -= C[91];
                cArray[i2] = (char)(n5 ^= C[92]);
            }
            object = ChangeLogItem.A()[ChangeLogItem.C[93]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ChangeLogItem.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[94];
        n6 += C[95];
        l6 = l17 ^ (0x3B00000000L ^ l17) & -1L << (n6 ^= C[96]);
        long l18 = l13;
        int n7 = C[97];
        n7 ^= C[98];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= C[99]);
        while (true) {
            int n8 = C[100];
            n8 ^= C[101];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= C[102]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[103];
            n10 ^= C[104];
            int n11 = C[106];
            n11 -= C[107];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= C[105])) & -1L >>> (n11 ^= C[108]);
            long l20 = l9;
            int n12 = C[109];
            n12 -= C[110];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= C[111]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[112];
            n14 -= C[113];
            int n15 = C[115];
            n15 ^= C[116];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[114])) & -1L >>> (n15 += C[117]);
            int n16 = C[118];
            n16 += C[119];
            long l22 = l10;
            int n17 = C[121];
            n17 ^= C[122];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[120]) ^ l22) & -1L << (n17 ^= C[123]);
            int n18 = C[124];
            n18 -= C[125];
            n18 ^= C[126];
            int n19 = C[127];
            n19 -= C[128];
            long l23 = l12;
            int n20 = C[130];
            n20 -= C[131];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= C[129]))) ^ l23) & -1L >>> (n20 += C[132]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[133];
            n21 -= C[134];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 += C[135]);
            while (true) {
                int n22 = C[136];
                n22 ^= C[137];
                if ((int)(l14 >>> (n22 -= C[138])) >= (int)l12) break;
                int n23 = C[139];
                n23 ^= C[140];
                int n24 = C[142];
                n24 -= C[143];
                cArray2[(int)(l14 >>> (n23 -= ChangeLogItem.C[141]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += C[144]))];
                l14 += 0x100000000L;
            }
            int n25 = C[145];
            n25 -= C[146];
            int n26 = (int)(l15 >>> (n25 ^= C[147]));
            l15 += 0x100000000L;
            ChangeLogItem.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[148];
            n27 -= C[149];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += C[150]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[151]];
        String string = (String)object[C[152]];
        object = object[C[153]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[154]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[155]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[157] ^ C[158]];
                byArray[ChangeLogItem.C[159] ^ ChangeLogItem.C[160]] = C[161] ^ C[162];
                byArray[ChangeLogItem.C[163] ^ ChangeLogItem.C[164]] = C[165] ^ C[166];
                byArray[ChangeLogItem.C[167] ^ ChangeLogItem.C[168]] = C[169] ^ C[170];
                byArray[ChangeLogItem.C[171] ^ ChangeLogItem.C[172]] = C[173] ^ C[174];
                byArray[ChangeLogItem.C[175] ^ ChangeLogItem.C[176]] = C[177] ^ C[178];
                byArray[ChangeLogItem.C[179] ^ ChangeLogItem.C[180]] = C[181] ^ C[182];
                byArray[ChangeLogItem.C[183] ^ ChangeLogItem.C[184]] = C[185] ^ C[186];
                byArray[ChangeLogItem.C[187] ^ ChangeLogItem.C[188]] = C[189] ^ C[190];
                byArray[ChangeLogItem.C[191] ^ ChangeLogItem.C[192]] = C[193] ^ C[194];
                byArray[ChangeLogItem.C[195] ^ ChangeLogItem.C[196]] = C[197] ^ C[198];
                byArray[ChangeLogItem.C[199] ^ ChangeLogItem.C[200]] = C[201] ^ C[202];
                byArray[ChangeLogItem.C[203] ^ ChangeLogItem.C[204]] = C[205] ^ C[206];
                byArray[ChangeLogItem.C[207] ^ ChangeLogItem.C[208]] = C[209] ^ C[210];
                byArray[ChangeLogItem.C[211] ^ ChangeLogItem.C[212]] = C[213] ^ C[214];
                byArray[ChangeLogItem.C[215] ^ ChangeLogItem.C[216]] = C[217] ^ C[218];
                byArray[ChangeLogItem.C[219] ^ ChangeLogItem.C[220]] = C[221] ^ C[222];
                objectArray2[ChangeLogItem.C[156]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[223]];
            if (b == null) {
                byte[] byArray2 = new byte[C[224] ^ C[225]];
                byArray2[ChangeLogItem.C[226] ^ ChangeLogItem.C[227]] = C[228] ^ C[229];
                byArray2[ChangeLogItem.C[230] ^ ChangeLogItem.C[231]] = C[232] ^ C[233];
                byArray2[ChangeLogItem.C[234] ^ ChangeLogItem.C[235]] = C[236] ^ C[237];
                byArray2[ChangeLogItem.C[238] ^ ChangeLogItem.C[239]] = C[240] ^ C[241];
                byArray2[ChangeLogItem.C[242] ^ ChangeLogItem.C[243]] = C[244] ^ C[245];
                byArray2[ChangeLogItem.C[246] ^ ChangeLogItem.C[247]] = C[248] ^ C[249];
                byArray2[ChangeLogItem.C[250] ^ ChangeLogItem.C[251]] = C[252] ^ C[253];
                byArray2[ChangeLogItem.C[254] ^ ChangeLogItem.C[255]] = C[256] ^ C[257];
                byArray2[ChangeLogItem.C[258] ^ ChangeLogItem.C[259]] = C[260] ^ C[261];
                byArray2[ChangeLogItem.C[262] ^ ChangeLogItem.C[263]] = C[264] ^ C[265];
                byArray2[ChangeLogItem.C[266] ^ ChangeLogItem.C[267]] = C[268] ^ C[269];
                byArray2[ChangeLogItem.C[270] ^ ChangeLogItem.C[271]] = C[272] ^ C[273];
                byArray2[ChangeLogItem.C[274] ^ ChangeLogItem.C[275]] = C[276] ^ C[277];
                byArray2[ChangeLogItem.C[278] ^ ChangeLogItem.C[279]] = C[280] ^ C[281];
                byArray2[ChangeLogItem.C[282] ^ ChangeLogItem.C[283]] = C[284] ^ C[285];
                byArray2[ChangeLogItem.C[286] ^ ChangeLogItem.C[287]] = C[288] ^ C[289];
                byArray2[ChangeLogItem.C[290] ^ ChangeLogItem.C[291]] = C[292] ^ C[293];
                byArray2[ChangeLogItem.C[294] ^ ChangeLogItem.C[295]] = C[296] ^ C[297];
                byArray2[ChangeLogItem.C[298] ^ ChangeLogItem.C[299]] = C[300] ^ C[301];
                byArray2[ChangeLogItem.C[302] ^ ChangeLogItem.C[303]] = C[304] ^ C[305];
                byArray2[ChangeLogItem.C[306] ^ ChangeLogItem.C[307]] = C[308] ^ C[309];
                byArray2[ChangeLogItem.C[310] ^ ChangeLogItem.C[311]] = C[312] ^ C[313];
                byArray2[ChangeLogItem.C[314] ^ ChangeLogItem.C[315]] = C[316] ^ C[317];
                byArray2[ChangeLogItem.C[318] ^ ChangeLogItem.C[319]] = C[320] ^ C[321];
                byArray2[ChangeLogItem.C[322] ^ ChangeLogItem.C[323]] = C[324] ^ C[325];
                byArray2[ChangeLogItem.C[326] ^ ChangeLogItem.C[327]] = C[328] ^ C[329];
                byArray2[ChangeLogItem.C[330] ^ ChangeLogItem.C[331]] = C[332] ^ C[333];
                byArray2[ChangeLogItem.C[334] ^ ChangeLogItem.C[335]] = C[336] ^ C[337];
                byArray2[ChangeLogItem.C[338] ^ ChangeLogItem.C[339]] = C[340] ^ C[341];
                byArray2[ChangeLogItem.C[342] ^ ChangeLogItem.C[343]] = C[344] ^ C[345];
                byArray2[ChangeLogItem.C[346] ^ ChangeLogItem.C[347]] = C[348] ^ C[349];
                byArray2[ChangeLogItem.C[350] ^ ChangeLogItem.C[351]] = C[352] ^ C[353];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[354], byArray3, C[355], byArray.length);
                System.arraycopy(byArray2, C[356], byArray3, byArray.length, byArray2.length);
                Object object4 = ChangeLogItem.A()[C[357]];
                if (object4 == null) {
                    char[] cArray = "\udb43\udad5\udadc\udadf\udae1\udb25\udad0\udafa\udaef\udafb\udadb\udb06\udaf2\udaf4\udb44\udadb\udad2\udb22".toCharArray();
                    for (int i2 = C[358]; i2 < C[359]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += C[360];
                        n3 -= C[361];
                        n3 -= C[362];
                        n3 -= C[363];
                        n3 ^= C[364];
                        n3 -= C[365];
                        n3 -= C[366];
                        n3 -= C[367];
                        n3 += C[368];
                        n3 ^= C[369];
                        cArray[i2] = (char)(n3 ^= C[370]);
                    }
                    object4 = ChangeLogItem.A()[ChangeLogItem.C[371]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[372]];
                byArray4[ChangeLogItem.C[373]] = C[374];
                byArray4[ChangeLogItem.C[375]] = C[376];
                byArray4[ChangeLogItem.C[377]] = C[378];
                byArray4[ChangeLogItem.C[379]] = C[380];
                byArray4[ChangeLogItem.C[381]] = C[382];
                byArray4[ChangeLogItem.C[383]] = C[384];
                byArray4[ChangeLogItem.C[385]] = C[386];
                byArray4[ChangeLogItem.C[387]] = C[388];
                byArray4[ChangeLogItem.C[389]] = C[390];
                byArray4[ChangeLogItem.C[391]] = C[392];
                byArray4[ChangeLogItem.C[393]] = C[394];
                byArray4[ChangeLogItem.C[395]] = C[396];
                byArray4[ChangeLogItem.C[397]] = C[398];
                byArray4[ChangeLogItem.C[399]] = -117;
                byArray4[3] = 104;
                byArray4[4] = -27;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 25, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ChangeLogItem.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u0612\u0626\u0620".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 35088;
                        n4 += 55697;
                        n4 ^= 0x6274;
                        n4 += 2582;
                        n4 ^= 0xE168;
                        n4 ^= 0x8239;
                        n4 -= 15786;
                        n4 ^= 0x81AB;
                        n4 ^= 0x572D;
                        n4 += 63390;
                        cArray[i3] = (char)(n4 += 4639);
                    }
                    object5 = ChangeLogItem.A()[2] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ChangeLogItem.A()[3];
            if (object6 == null) {
                char[] cArray = "\ud1a9\ud1ad\ud1bb\ud057\ud1ab\ud1aa\ud1ab\ud057\ud1b8\ud1b3\ud1ab\ud1bb\ud05d\ud1b8\ud089\ud08c\ud08c\ud091\ud096\ud08f".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 64305;
                    n5 -= 29217;
                    n5 -= 58178;
                    n5 += 42340;
                    n5 += 26406;
                    n5 -= 25193;
                    n5 -= 14859;
                    n5 ^= 0x7ECB;
                    n5 ^= 0x3E4B;
                    n5 -= 55596;
                    n5 ^= 0xDDAE;
                    cArray[i4] = (char)(n5 ^= 0x100E);
                }
                object6 = ChangeLogItem.A()[3] = new String(cArray);
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
        C = new int[0x8CCA ^ 0x8D5A];
        ChangeLogItem.C[0x440B ^ 0x4400] = 0xFFFFBBD1 ^ 0x4400;
        ChangeLogItem.C[0xAD51 ^ 0xADD9] = 0xFFFF527F ^ 0xADD9;
        ChangeLogItem.C[0x800B ^ 0x816B] = 0xFFFFEA85 ^ 0x816B;
        ChangeLogItem.C[0xF039 ^ 0xF1B5] = 0xF1ED ^ 0xF1B5;
        ChangeLogItem.C[0x2161 ^ 0x218F] = 0x122D2 ^ 0x218F;
        ChangeLogItem.C[0x5815 ^ 0x5967] = 0xC99 ^ 0x5967;
        ChangeLogItem.C[0xD899 ^ 0xD8BC] = 0xFFFF2710 ^ 0xD8BC;
        ChangeLogItem.C[0xE55A ^ 0xE439] = 0xE439 ^ 0xE439;
        ChangeLogItem.C[0xB4A2 ^ 0xB404] = 0xDD0A ^ 0xB404;
        ChangeLogItem.C[0xD62 ^ 0xC15] = 0xC1B ^ 0xC15;
        ChangeLogItem.C[0x3161 ^ 0x318C] = 0xA9CC ^ 0x318C;
        ChangeLogItem.C[0xE1A8 ^ 0xE135] = 0xB800 ^ 0xE135;
        ChangeLogItem.C[0xB9B8 ^ 0xB9B5] = 0xB9D4 ^ 0xB9B5;
        ChangeLogItem.C[0x7810 ^ 0x78E1] = 0x17BB3 ^ 0x78E1;
        ChangeLogItem.C[0x49B ^ 0x4BB] = 0x4FC ^ 0x4BB;
        ChangeLogItem.C[0x1FB9 ^ 0x1F06] = 0x5A43 ^ 0x1F06;
        ChangeLogItem.C[0xDF71 ^ 0xDF81] = 0x1DCD8 ^ 0xDF81;
        ChangeLogItem.C[0x75CF ^ 0x7516] = 0x9814 ^ 0x7516;
        ChangeLogItem.C[0x41BC ^ 0x4090] = 0x7A34 ^ 0x4090;
        ChangeLogItem.C[0x1005C ^ 0x1002D] = 0xFFFEFFBA ^ 0x1002D;
        ChangeLogItem.C[0x10D56 ^ 0x10D7B] = 0xFFFEF28C ^ 0x10D7B;
        ChangeLogItem.C[0x6F5 ^ 0x6E4] = 0x6EB ^ 0x6E4;
        ChangeLogItem.C[0x4393 ^ 0x428D] = 0xC226 ^ 0x428D;
        ChangeLogItem.C[0x3C86 ^ 0x3D97] = 0x577D ^ 0x3D97;
        ChangeLogItem.C[0x3A58 ^ 0x3AC9] = 0x3AD8 ^ 0x3AC9;
        ChangeLogItem.C[0x2E01 ^ 0x2F38] = 0x1202A ^ 0x2F38;
        ChangeLogItem.C[0x2692 ^ 0x27C2] = 0xA7B6 ^ 0x27C2;
        ChangeLogItem.C[0x2F29 ^ 0x2F9A] = 0xBF1E ^ 0x2F9A;
        ChangeLogItem.C[0xF5A1 ^ 0xF532] = 0xF527 ^ 0xF532;
        ChangeLogItem.C[0x86BE ^ 0x864B] = 0xF3EC ^ 0x864B;
        ChangeLogItem.C[0x434B ^ 0x4381] = 0x90A1 ^ 0x4381;
        ChangeLogItem.C[0x99A8 ^ 0x99E8] = 0xFFFF6653 ^ 0x99E8;
        ChangeLogItem.C[0xC634 ^ 0xC707] = 0x47AF ^ 0xC707;
        ChangeLogItem.C[0xCA84 ^ 0xCA6E] = 0x5234 ^ 0xCA6E;
        ChangeLogItem.C[0x2868 ^ 0x280C] = 0x2849 ^ 0x280C;
        ChangeLogItem.C[0x12E7 ^ 0x122B] = 0x4E00 ^ 0x122B;
        ChangeLogItem.C[0xD90F ^ 0xD889] = 0xD8D2 ^ 0xD889;
        ChangeLogItem.C[0x79A1 ^ 0x7919] = 0x463A ^ 0x7919;
        ChangeLogItem.C[0x219D ^ 0x20EE] = 0x20EF ^ 0x20EE;
        ChangeLogItem.C[0xE11F ^ 0xE014] = 0x61BE ^ 0xE014;
        ChangeLogItem.C[0x6A06 ^ 0x6B5D] = 0x358E ^ 0x6B5D;
        ChangeLogItem.C[0x9797 ^ 0x9772] = 0x6017 ^ 0x9772;
        ChangeLogItem.C[0xAD97 ^ 0xAD9B] = 0xADA2 ^ 0xAD9B;
        ChangeLogItem.C[0x3B6 ^ 0x2F9] = 0x82C9 ^ 0x2F9;
        ChangeLogItem.C[0x1ED5 ^ 0x1FAB] = 0xFFFFE029 ^ 0x1FAB;
        ChangeLogItem.C[0xFB16 ^ 0xFB99] = 0xFFFF0431 ^ 0xFB99;
        ChangeLogItem.C[0x1E8A ^ 0x1E27] = 0xFFFEE8AF ^ 0x1E27;
        ChangeLogItem.C[0x5B44 ^ 0x5A42] = 0x44F9 ^ 0x5A42;
        ChangeLogItem.C[0x10CFE ^ 0x10CE3] = 0xFFFEF326 ^ 0x10CE3;
        ChangeLogItem.C[0x5630 ^ 0x572F] = 0xD786 ^ 0x572F;
        ChangeLogItem.C[0x51B0 ^ 0x51B8] = 0x51B1 ^ 0x51B8;
        ChangeLogItem.C[0xFF87 ^ 0xFE86] = 0x6EF2 ^ 0xFE86;
        ChangeLogItem.C[0x917F ^ 0x9052] = 0xAAC5 ^ 0x9052;
        ChangeLogItem.C[0x701E ^ 0x7005] = 0x7017 ^ 0x7005;
        ChangeLogItem.C[0x7195 ^ 0x7018] = 0x7013 ^ 0x7018;
        ChangeLogItem.C[0x9599 ^ 0x9570] = 0x5F8D ^ 0x9570;
        ChangeLogItem.C[0x330A ^ 0x325F] = 0xFC69 ^ 0x325F;
        ChangeLogItem.C[0x65E3 ^ 0x6503] = 0x941A ^ 0x6503;
        ChangeLogItem.C[0xECEE ^ 0xECDB] = 0xECA6 ^ 0xECDB;
        ChangeLogItem.C[0x1007F ^ 0x1005C] = 0x1003C ^ 0x1005C;
        ChangeLogItem.C[0x3201 ^ 0x32DB] = 0xDF8E ^ 0x32DB;
        ChangeLogItem.C[0x910C ^ 0x905B] = 0xDB8 ^ 0x905B;
        ChangeLogItem.C[0xB3EA ^ 0xB268] = 0xB204 ^ 0xB268;
        ChangeLogItem.C[0x99F0 ^ 0x99CE] = 0x9983 ^ 0x99CE;
        ChangeLogItem.C[0x49E1 ^ 0x4865] = 0x4801 ^ 0x4865;
        ChangeLogItem.C[0xB464 ^ 0xB4E5] = 0xFFFF4B76 ^ 0xB4E5;
        ChangeLogItem.C[0x911F ^ 0x904E] = 0x107E ^ 0x904E;
        ChangeLogItem.C[0xC578 ^ 0xC514] = 0xC579 ^ 0xC514;
        ChangeLogItem.C[0x3817 ^ 0x38F5] = 0xCF8C ^ 0x38F5;
        ChangeLogItem.C[0xCCED ^ 0xCDF6] = 0x38B6 ^ 0xCDF6;
        ChangeLogItem.C[0xF65F ^ 0xF613] = 0xF611 ^ 0xF613;
        ChangeLogItem.C[0xCF13 ^ 0xCF86] = 0xFFFF307F ^ 0xCF86;
        ChangeLogItem.C[0xAC0D ^ 0xACF0] = 0xB258 ^ 0xACF0;
        ChangeLogItem.C[0xE612 ^ 0xE67D] = 0xFFFF19EE ^ 0xE67D;
        ChangeLogItem.C[0x1F64 ^ 0x1E3E] = 0x40EB ^ 0x1E3E;
        ChangeLogItem.C[0x2F10 ^ 0x2F60] = 0xFFFFD079 ^ 0x2F60;
        ChangeLogItem.C[0x6D5B ^ 0x6C56] = 0xEDFC ^ 0x6C56;
        ChangeLogItem.C[0x5180 ^ 0x5087] = 0x4E21 ^ 0x5087;
        ChangeLogItem.C[0x9EBB ^ 0x9E5C] = 0x54A1 ^ 0x9E5C;
        ChangeLogItem.C[0x63C3 ^ 0x6291] = 0xACA7 ^ 0x6291;
        ChangeLogItem.C[0xC113 ^ 0xC052] = 0x4EED ^ 0xC052;
        ChangeLogItem.C[0x20EA ^ 0x208B] = 0x2086 ^ 0x208B;
        ChangeLogItem.C[0xB415 ^ 0xB59E] = 0xB59C ^ 0xB59E;
        ChangeLogItem.C[0x652A ^ 0x6570] = 0x5FAB ^ 0x6570;
        ChangeLogItem.C[0x9FBA ^ 0x9E3F] = 0x9E38 ^ 0x9E3F;
        ChangeLogItem.C[0x582D ^ 0x58C6] = 0xC086 ^ 0x58C6;
        ChangeLogItem.C[0x8C01 ^ 0x8CD2] = 0xC86D ^ 0x8CD2;
        ChangeLogItem.C[0xF0A7 ^ 0xF06F] = 0x234F ^ 0xF06F;
        ChangeLogItem.C[0x718E ^ 0x70E2] = 0x5B25 ^ 0x70E2;
        ChangeLogItem.C[0x101A ^ 0x10D7] = 0xFFFFB301 ^ 0x10D7;
        ChangeLogItem.C[0x53DD ^ 0x5298] = 0x51C8 ^ 0x5298;
        ChangeLogItem.C[0x658D ^ 0x654D] = 0x2008 ^ 0x654D;
        ChangeLogItem.C[0xAB60 ^ 0xAA1C] = 0xFFFF55CC ^ 0xAA1C;
        ChangeLogItem.C[0x1C14 ^ 0x1C3A] = 0x1C1A ^ 0x1C3A;
        ChangeLogItem.C[0xBB1C ^ 0xBB1B] = 0xBB6C ^ 0xBB1B;
        ChangeLogItem.C[0x75B ^ 0x647] = 0xFFFF0CDB ^ 0x647;
        ChangeLogItem.C[0x107BB ^ 0x10735] = 0xFFFEF89F ^ 0x10735;
        ChangeLogItem.C[0x8DA4 ^ 0x8DD8] = 0xFFFF7246 ^ 0x8DD8;
        ChangeLogItem.C[0x7034 ^ 0x70A2] = 0xFFFF8F34 ^ 0x70A2;
        ChangeLogItem.C[0x25BF ^ 0x24B1] = 0x4E5C ^ 0x24B1;
        ChangeLogItem.C[0xCA58 ^ 0xCBD9] = 0xCBD1 ^ 0xCBD9;
        ChangeLogItem.C[0x280C ^ 0x28A0] = 0x121FF ^ 0x28A0;
        ChangeLogItem.C[0x5551 ^ 0x540C] = 0xADF ^ 0x540C;
        ChangeLogItem.C[0xA7B5 ^ 0xA6AF] = 0x53F4 ^ 0xA6AF;
        ChangeLogItem.C[0xB789 ^ 0xB78B] = 0xB7CC ^ 0xB78B;
        ChangeLogItem.C[0xF494 ^ 0xF51E] = 0xF56A ^ 0xF51E;
        ChangeLogItem.C[0x4E6B ^ 0x4E41] = 0x4E7D ^ 0x4E41;
        ChangeLogItem.C[0x47F0 ^ 0x46B2] = 0x45EE ^ 0x46B2;
        ChangeLogItem.C[0x4641 ^ 0x460C] = 0x460C ^ 0x460C;
        ChangeLogItem.C[0x10130 ^ 0x101C8] = 0xFFFE199D ^ 0x101C8;
        ChangeLogItem.C[0xCCF9 ^ 0xCC5B] = 0x5ECE ^ 0xCC5B;
        ChangeLogItem.C[0x35FA ^ 0x34B0] = 0x6CE7 ^ 0x34B0;
        ChangeLogItem.C[0x4E6A ^ 0x4FE9] = 0x4FEF ^ 0x4FE9;
        ChangeLogItem.C[0xE5D4 ^ 0xE500] = 0xA1B2 ^ 0xE500;
        ChangeLogItem.C[0xA2EB ^ 0xA255] = 0x10EC ^ 0xA255;
        ChangeLogItem.C[0x2A81 ^ 0x2A54] = 0x6ED2 ^ 0x2A54;
        ChangeLogItem.C[0x2F13 ^ 0x2E55] = 0xEC1F ^ 0x2E55;
        ChangeLogItem.C[0xE298 ^ 0xE385] = 0x16C5 ^ 0xE385;
        ChangeLogItem.C[0xB266 ^ 0xB203] = 0xFFFF4D87 ^ 0xB203;
        ChangeLogItem.C[0xD9FB ^ 0xD94D] = 0x49CD ^ 0xD94D;
        ChangeLogItem.C[0x46C1 ^ 0x4637] = 0xA1FF ^ 0x4637;
        ChangeLogItem.C[0x9718 ^ 0x972C] = 0x973E ^ 0x972C;
        ChangeLogItem.C[0xA859 ^ 0xA967] = 0x27D1 ^ 0xA967;
        ChangeLogItem.C[0x6380 ^ 0x63B3] = 0x63DF ^ 0x63B3;
        ChangeLogItem.C[0x46B7 ^ 0x4625] = 0xFFFFB9F9 ^ 0x4625;
        ChangeLogItem.C[0xFD0C ^ 0xFC15] = 0x70BA ^ 0xFC15;
        ChangeLogItem.C[0xCCE2 ^ 0xCD9B] = 0xCD94 ^ 0xCD9B;
        ChangeLogItem.C[0xA7D ^ 0xACD] = 0x6701 ^ 0xACD;
        ChangeLogItem.C[0x37BD ^ 0x37A4] = 0x37F7 ^ 0x37A4;
        ChangeLogItem.C[0xA46F ^ 0xA43E] = 0x1298 ^ 0xA43E;
        ChangeLogItem.C[0xB9A3 ^ 0xB992] = 0xB9D3 ^ 0xB992;
        ChangeLogItem.C[0x1AF6 ^ 0x1A55] = 0x7358 ^ 0x1A55;
        ChangeLogItem.C[0xCB22 ^ 0xCBD0] = 0xBE7C ^ 0xCBD0;
        ChangeLogItem.C[0xBFB ^ 0xBB4] = 0xBD8 ^ 0xBB4;
        ChangeLogItem.C[0xB80A ^ 0xB961] = 0xD4E4 ^ 0xB961;
        ChangeLogItem.C[0x2B95 ^ 0x2B3B] = 0x12264 ^ 0x2B3B;
        ChangeLogItem.C[0xB049 ^ 0xB115] = 0xFFFF1000 ^ 0xB115;
        ChangeLogItem.C[0xECE2 ^ 0xEC3C] = 0xDE2E ^ 0xEC3C;
        ChangeLogItem.C[0xEF1A ^ 0xEE0D] = 0x62A2 ^ 0xEE0D;
        ChangeLogItem.C[0x2CF4 ^ 0x2C96] = 0x2CE6 ^ 0x2C96;
        ChangeLogItem.C[0x5180 ^ 0x5120] = 0xC3B5 ^ 0x5120;
        ChangeLogItem.C[0x93A9 ^ 0x9229] = 0xFFFF6DAC ^ 0x9229;
        ChangeLogItem.C[0xA28E ^ 0xA3B2] = 0xFFFFBA2C ^ 0xA3B2;
        ChangeLogItem.C[0x8C8D ^ 0x8DF8] = 0x8DF1 ^ 0x8DF8;
        ChangeLogItem.C[0x50D1 ^ 0x50F0] = 0xFFFFAF00 ^ 0x50F0;
        ChangeLogItem.C[0x3A82 ^ 0x3A90] = 0xFFFFC5EE ^ 0x3A90;
        ChangeLogItem.C[0xA6E5 ^ 0xA6C3] = 0xFFFF5977 ^ 0xA6C3;
        ChangeLogItem.C[0xBDA1 ^ 0xBCED] = 0xE4EA ^ 0xBCED;
        ChangeLogItem.C[0xD5D0 ^ 0xD4FF] = 0xB65E ^ 0xD4FF;
        ChangeLogItem.C[0x3E24 ^ 0x3F6A] = 0xBF44 ^ 0x3F6A;
        ChangeLogItem.C[0x6F72 ^ 0x6FF0] = 0x6F7F ^ 0x6FF0;
        ChangeLogItem.C[0x6A8B ^ 0x6BA9] = 0x6B93 ^ 0x6BA9;
        ChangeLogItem.C[0x8957 ^ 0x8921] = 0xFFFF76C1 ^ 0x8921;
        ChangeLogItem.C[0x77DC ^ 0x7655] = 0x7650 ^ 0x7655;
        ChangeLogItem.C[0xBF38 ^ 0xBE56] = 0xF3F1 ^ 0xBE56;
        ChangeLogItem.C[0x41 ^ 0x78] = 0xFFFFFFD2 ^ 0x78;
        ChangeLogItem.C[0x9D94 ^ 0x9DC1] = 0xA6F5 ^ 0x9DC1;
        ChangeLogItem.C[0x7003 ^ 0x7110] = 0xD904 ^ 0x7110;
        ChangeLogItem.C[0xA14C ^ 0xA1A4] = 0xFFFF9481 ^ 0xA1A4;
        ChangeLogItem.C[0x4009 ^ 0x410D] = 0xFFFF331B ^ 0x410D;
        ChangeLogItem.C[0xADCB ^ 0xAD9B] = 0x4A1A ^ 0xAD9B;
        ChangeLogItem.C[0x1B14 ^ 0x1B30] = 0x1BF0 ^ 0x1B30;
        ChangeLogItem.C[0x5433 ^ 0x553C] = 0x3FD6 ^ 0x553C;
        ChangeLogItem.C[0x5FC3 ^ 0x5F74] = 0x605B ^ 0x5F74;
        ChangeLogItem.C[0x77B6 ^ 0x77DC] = 0x771A ^ 0x77DC;
        ChangeLogItem.C[0xC8FF ^ 0xC9EB] = 0x61BE ^ 0xC9EB;
        ChangeLogItem.C[0x1026F ^ 0x10279] = 0xFFFEFDD3 ^ 0x10279;
        ChangeLogItem.C[0x25DF ^ 0x25C1] = 0x2583 ^ 0x25C1;
        ChangeLogItem.C[0x67FC ^ 0x66CB] = 0x169D9 ^ 0x66CB;
        ChangeLogItem.C[0x2044 ^ 0x2003] = 0xFFFFDF8F ^ 0x2003;
        ChangeLogItem.C[0x3A45 ^ 0x3A18] = 0x3A18 ^ 0x3A18;
        ChangeLogItem.C[0x604C ^ 0x60DB] = 0x60DA ^ 0x60DB;
        ChangeLogItem.C[0xEFDD ^ 0xEF0C] = 0xFFFFD7B2 ^ 0xEF0C;
        ChangeLogItem.C[0x16B6 ^ 0x16EF] = 0xCBB5 ^ 0x16EF;
        ChangeLogItem.C[0xFAB5 ^ 0xFAE3] = 0xDCB5 ^ 0xFAE3;
        ChangeLogItem.C[0x2BEF ^ 0x2B38] = 0xC663 ^ 0x2B38;
        ChangeLogItem.C[0xA664 ^ 0xA6D6] = 0xCB1A ^ 0xA6D6;
        ChangeLogItem.C[0x9DBD ^ 0x9D21] = 0x9D21 ^ 0x9D21;
        ChangeLogItem.C[0xDA98 ^ 0xDA43] = 0xE85A ^ 0xDA43;
        ChangeLogItem.C[0xB4C ^ 0xB43] = 0xB14 ^ 0xB43;
        ChangeLogItem.C[0x6B58 ^ 0x6BE5] = 0xD95B ^ 0x6BE5;
        ChangeLogItem.C[0xCD3B ^ 0xCD2E] = 0xFFFF328C ^ 0xCD2E;
        ChangeLogItem.C[0x8D0C ^ 0x8DA3] = 0xE069 ^ 0x8DA3;
        ChangeLogItem.C[0x4329 ^ 0x4258] = 0x9034 ^ 0x4258;
        ChangeLogItem.C[0x1083A ^ 0x10833] = 0x10830 ^ 0x10833;
        ChangeLogItem.C[0x2BA3 ^ 0x2BCA] = 0xFFFFD43F ^ 0x2BCA;
        ChangeLogItem.C[0x108D7 ^ 0x109E1] = 0x6FD ^ 0x109E1;
        ChangeLogItem.C[0x45A3 ^ 0x4484] = 0xAB99 ^ 0x4484;
        ChangeLogItem.C[0x2BB2 ^ 0x2B4B] = 0xCC9B ^ 0x2B4B;
        ChangeLogItem.C[0x455B ^ 0x453B] = 0xFFFFBADB ^ 0x453B;
        ChangeLogItem.C[0x4A68 ^ 0x4A93] = 0x543B ^ 0x4A93;
        ChangeLogItem.C[0xF8BF ^ 0xF82F] = 0xF831 ^ 0xF82F;
        ChangeLogItem.C[0xEF52 ^ 0xEE58] = 0x6FF1 ^ 0xEE58;
        ChangeLogItem.C[0x357A ^ 0x344A] = 0x56E8 ^ 0x344A;
        ChangeLogItem.C[0x2CEB ^ 0x2DB4] = 0xB9B4 ^ 0x2DB4;
        ChangeLogItem.C[0x5B79 ^ 0x5B12] = 0x5B6B ^ 0x5B12;
        ChangeLogItem.C[0x18D6 ^ 0x180A] = 0x2A18 ^ 0x180A;
        ChangeLogItem.C[0x5485 ^ 0x542C] = 0xFFFFD2DA ^ 0x542C;
        ChangeLogItem.C[0x7DDC ^ 0x7D19] = 0xFFFE8235 ^ 0x7D19;
        ChangeLogItem.C[0x4C10 ^ 0x4C07] = 0x4C0D ^ 0x4C07;
        ChangeLogItem.C[0xAD89 ^ 0xACAD] = 0xFFFF535D ^ 0xACAD;
        ChangeLogItem.C[0x440E ^ 0x4488] = 0x44D3 ^ 0x4488;
        ChangeLogItem.C[0xEC6 ^ 0xFD0] = 0x8375 ^ 0xFD0;
        ChangeLogItem.C[0x69A1 ^ 0x698D] = 0x69C1 ^ 0x698D;
        ChangeLogItem.C[0x3543 ^ 0x352D] = 0xFFFFCA99 ^ 0x352D;
        ChangeLogItem.C[0xD70A ^ 0xD752] = 0xC92A ^ 0xD752;
        ChangeLogItem.C[0xCF66 ^ 0xCF5A] = 0xFFFF308F ^ 0xCF5A;
        ChangeLogItem.C[0x103F2 ^ 0x10275] = 0x10278 ^ 0x10275;
        ChangeLogItem.C[0xDBE0 ^ 0xDBDD] = 0xDBA5 ^ 0xDBDD;
        ChangeLogItem.C[0x293E ^ 0x282B] = 0x803F ^ 0x282B;
        ChangeLogItem.C[0x11CC ^ 0x10E6] = 0x2A63 ^ 0x10E6;
        ChangeLogItem.C[0xF31E ^ 0xF22F] = 0x908E ^ 0xF22F;
        ChangeLogItem.C[0xF69 ^ 0xF21] = 0xF22 ^ 0xF21;
        ChangeLogItem.C[0xD891 ^ 0xD870] = 0x2949 ^ 0xD870;
        ChangeLogItem.C[0xAC5A ^ 0xAC39] = 0xAC64 ^ 0xAC39;
        ChangeLogItem.C[0x1E14 ^ 0x1EBC] = 0x67BA ^ 0x1EBC;
        ChangeLogItem.C[0xB4E5 ^ 0xB4EB] = 0xFFFF4B42 ^ 0xB4EB;
        ChangeLogItem.C[0x24B9 ^ 0x25EA] = 0xEBDC ^ 0x25EA;
        ChangeLogItem.C[0x20B2 ^ 0x206A] = 0xCD3F ^ 0x206A;
        ChangeLogItem.C[0xA2E ^ 0xA1E] = 0xA1A ^ 0xA1E;
        ChangeLogItem.C[0xC53 ^ 0xD1A] = 0xCF51 ^ 0xD1A;
        ChangeLogItem.C[0x713B ^ 0x7121] = 0x7162 ^ 0x7121;
        ChangeLogItem.C[0x30FC ^ 0x319E] = 0x319E ^ 0x319E;
        ChangeLogItem.C[0x88BA ^ 0x88F3] = 0x88F3 ^ 0x88F3;
        ChangeLogItem.C[0xD7D6 ^ 0xD729] = 0x475D ^ 0xD729;
        ChangeLogItem.C[0x5F82 ^ 0x5F5F] = 0xFFFF9281 ^ 0x5F5F;
        ChangeLogItem.C[0x2B7E ^ 0x2BE0] = 0x72C5 ^ 0x2BE0;
        ChangeLogItem.C[0x65A8 ^ 0x64CE] = 0x64CE ^ 0x64CE;
        ChangeLogItem.C[0x3E70 ^ 0x3F04] = 0x3F14 ^ 0x3F04;
        ChangeLogItem.C[0x6B26 ^ 0x6B7A] = 0xB4C5 ^ 0x6B7A;
        ChangeLogItem.C[0xAEAE ^ 0xAE69] = 0x7D43 ^ 0xAE69;
        ChangeLogItem.C[0x26D4 ^ 0x26F3] = 0x2601 ^ 0x26F3;
        ChangeLogItem.C[0x1C4E ^ 0x1CB4] = 0x20C ^ 0x1CB4;
        ChangeLogItem.C[0xE463 ^ 0xE4E4] = 0xFFFF1B14 ^ 0xE4E4;
        ChangeLogItem.C[0x4925 ^ 0x4810] = 0xC8B8 ^ 0x4810;
        ChangeLogItem.C[0x6BDD ^ 0x6B99] = 0x6BA5 ^ 0x6B99;
        ChangeLogItem.C[0x9723 ^ 0x9770] = 0x203D ^ 0x9770;
        ChangeLogItem.C[0x7DCD ^ 0x7DB5] = 0xFFFF8232 ^ 0x7DB5;
        ChangeLogItem.C[0xE89F ^ 0xE805] = 0xE804 ^ 0xE805;
        ChangeLogItem.C[0xB375 ^ 0xB35D] = 0xFFFF4CD1 ^ 0xB35D;
        ChangeLogItem.C[0xA4FD ^ 0xA4BB] = 0xFFFF5B66 ^ 0xA4BB;
        ChangeLogItem.C[0x7130 ^ 0x71B3] = 0x71D2 ^ 0x71B3;
        ChangeLogItem.C[0xB94F ^ 0xB94C] = 0xB945 ^ 0xB94C;
        ChangeLogItem.C[0xEF57 ^ 0xEE28] = 0xEE28 ^ 0xEE28;
        ChangeLogItem.C[0x3F33 ^ 0x3F20] = 0xFFFFC0FF ^ 0x3F20;
        ChangeLogItem.C[0x8415 ^ 0x8422] = 0xFFFF7BBC ^ 0x8422;
        ChangeLogItem.C[0x63DC ^ 0x63E7] = 0xFFFF9C7E ^ 0x63E7;
        ChangeLogItem.C[0xF608 ^ 0xF642] = 0xF643 ^ 0xF642;
        ChangeLogItem.C[0x15E5 ^ 0x1561] = 0xFFFFEA93 ^ 0x1561;
        ChangeLogItem.C[0xB9C5 ^ 0xB885] = 0xFFFFC9EA ^ 0xB885;
        ChangeLogItem.C[0xC624 ^ 0xC656] = 0xFFFF39D7 ^ 0xC656;
        ChangeLogItem.C[0x24D2 ^ 0x25F1] = 0x25CF ^ 0x25F1;
        ChangeLogItem.C[0xA78B ^ 0xA72F] = 0xCE21 ^ 0xA72F;
        ChangeLogItem.C[0xA96D ^ 0xA802] = 0x77BB ^ 0xA802;
        ChangeLogItem.C[0x10A85 ^ 0x10A11] = 0x10A92 ^ 0x10A11;
        ChangeLogItem.C[0x10E2C ^ 0x10EB3] = 0x19C21 ^ 0x10EB3;
        ChangeLogItem.C[0xDBAF ^ 0xDBD5] = 0xFFFF2448 ^ 0xDBD5;
        ChangeLogItem.C[0x835E ^ 0x8234] = 0x5B80 ^ 0x8234;
        ChangeLogItem.C[0x1D16 ^ 0x1DE2] = 0x6834 ^ 0x1DE2;
        ChangeLogItem.C[0x592D ^ 0x592D] = 0xFFFFA676 ^ 0x592D;
        ChangeLogItem.C[0x65D3 ^ 0x6567] = 0xF5E7 ^ 0x6567;
        ChangeLogItem.C[0x60B5 ^ 0x61C3] = 0xFFFF9E00 ^ 0x61C3;
        ChangeLogItem.C[0x92BE ^ 0x9395] = 0xA902 ^ 0x9395;
        ChangeLogItem.C[0x8B4E ^ 0x8A5E] = 0xFFFF1F0B ^ 0x8A5E;
        ChangeLogItem.C[0x21B5 ^ 0x2087] = 0xA030 ^ 0x2087;
        ChangeLogItem.C[0x513F ^ 0x5016] = 0xBF0B ^ 0x5016;
        ChangeLogItem.C[0xEC5A ^ 0xEC05] = 0xFFFF1391 ^ 0xEC05;
        ChangeLogItem.C[0xDED9 ^ 0xDE9A] = 0xFFFF213E ^ 0xDE9A;
        ChangeLogItem.C[0x28D4 ^ 0x2827] = 0x5D80 ^ 0x2827;
        ChangeLogItem.C[0xE76C ^ 0xE7C7] = 0x1EE9D ^ 0xE7C7;
        ChangeLogItem.C[0x5DD4 ^ 0x5C8A] = 0xC89D ^ 0x5C8A;
        ChangeLogItem.C[0xD59C ^ 0xD5E1] = 0xFFFF2A2C ^ 0xD5E1;
        ChangeLogItem.C[0xA22F ^ 0xA301] = 0xC1A8 ^ 0xA301;
        ChangeLogItem.C[0x2169 ^ 0x206A] = 0xADDA ^ 0x206A;
        ChangeLogItem.C[0x381C ^ 0x3993] = 0x399F ^ 0x3993;
        ChangeLogItem.C[0x241D ^ 0x247A] = 0xFFFFDBE9 ^ 0x247A;
        ChangeLogItem.C[0x10AA8 ^ 0x10A31] = 0x10A31 ^ 0x10A31;
        ChangeLogItem.C[0x399B ^ 0x3949] = 0xFE6C ^ 0x3949;
        ChangeLogItem.C[0xAE7B ^ 0xAE2F] = 0xDF9F ^ 0xAE2F;
        ChangeLogItem.C[0xB2DE ^ 0xB2B8] = 0xFFFF4D59 ^ 0xB2B8;
        ChangeLogItem.C[0x4231 ^ 0x424A] = 0x4276 ^ 0x424A;
        ChangeLogItem.C[0x10BD1 ^ 0x10B10] = 0xFFFEB19F ^ 0x10B10;
        ChangeLogItem.C[0x7414 ^ 0x746B] = 0xFFFF8BF0 ^ 0x746B;
        ChangeLogItem.C[0xB41E ^ 0xB437] = 0xFFFF4B96 ^ 0xB437;
        ChangeLogItem.C[0xA2F8 ^ 0xA263] = 0xA262 ^ 0xA263;
        ChangeLogItem.C[0x1667 ^ 0x1684] = 0xE1E1 ^ 0x1684;
        ChangeLogItem.C[0x7B82 ^ 0x7BB0] = 0xFFFF846B ^ 0x7BB0;
        ChangeLogItem.C[0x1022C ^ 0x102C3] = 0x191 ^ 0x102C3;
        ChangeLogItem.C[0x9CF8 ^ 0x9C1E] = 0x56F7 ^ 0x9C1E;
        ChangeLogItem.C[0x1352 ^ 0x1358] = 0xFFFFEC8B ^ 0x1358;
        ChangeLogItem.C[0x5A76 ^ 0x5AB9] = 0x9D9D ^ 0x5AB9;
        ChangeLogItem.C[0xAD14 ^ 0xAD3F] = 0xAD6F ^ 0xAD3F;
        ChangeLogItem.C[0x20C1 ^ 0x206B] = 0x596D ^ 0x206B;
        ChangeLogItem.C[0x9814 ^ 0x9929] = 0x7F3B ^ 0x9929;
        ChangeLogItem.C[0xDAA8 ^ 0xDBE0] = 0xFFFFE64B ^ 0xDBE0;
        ChangeLogItem.C[0x405F ^ 0x410B] = 0xFFFF70B0 ^ 0x410B;
        ChangeLogItem.C[0xC875 ^ 0xC8CC] = 0xFFFF0852 ^ 0xC8CC;
        ChangeLogItem.C[0xB0CA ^ 0xB1EB] = 0x3142 ^ 0xB1EB;
        ChangeLogItem.C[0x10E28 ^ 0x10E29] = 0x10E4D ^ 0x10E29;
        ChangeLogItem.C[0xD4A0 ^ 0xD420] = 0xFFFF2BC8 ^ 0xD420;
        ChangeLogItem.C[0x80B1 ^ 0x80E6] = 0x930 ^ 0x80E6;
        ChangeLogItem.C[0xF38C ^ 0xF2E8] = 0xF2E8 ^ 0xF2E8;
        ChangeLogItem.C[0x8D54 ^ 0x8C6B] = 0x2D4 ^ 0x8C6B;
        ChangeLogItem.C[0xE215 ^ 0xE27D] = 0xE218 ^ 0xE27D;
        ChangeLogItem.C[0xA837 ^ 0xA80D] = 0xA83E ^ 0xA80D;
        ChangeLogItem.C[0x1069E ^ 0x106E9] = 0xFFFEF92E ^ 0x106E9;
        ChangeLogItem.C[0xE147 ^ 0xE02E] = 0xA2CC ^ 0xE02E;
        ChangeLogItem.C[0x10E64 ^ 0x10EE8] = 0xFFFEF117 ^ 0x10EE8;
        ChangeLogItem.C[0xF1C8 ^ 0xF1CD] = 0xFFFF0E2B ^ 0xF1CD;
        ChangeLogItem.C[0x75 ^ 0x12C] = 0x9CCF ^ 0x12C;
        ChangeLogItem.C[0x824F ^ 0x82E8] = 0xFBE7 ^ 0x82E8;
        ChangeLogItem.C[0xF461 ^ 0xF415] = 0xFFFF0BE8 ^ 0xF415;
        ChangeLogItem.C[0xA7E5 ^ 0xA71B] = 0x3779 ^ 0xA71B;
        ChangeLogItem.C[0x8134 ^ 0x8077] = 0x8327 ^ 0x8077;
        ChangeLogItem.C[0x619D ^ 0x60E0] = 0x60E1 ^ 0x60E0;
        ChangeLogItem.C[0x85D3 ^ 0x850C] = 0x850C ^ 0x850C;
        ChangeLogItem.C[0x5452 ^ 0x5427] = 0xFFFFAB80 ^ 0x5427;
        ChangeLogItem.C[0xE324 ^ 0xE263] = 0x2028 ^ 0xE263;
        ChangeLogItem.C[0x7DD4 ^ 0x7DC8] = 0x7D82 ^ 0x7DC8;
        ChangeLogItem.C[0x9991 ^ 0x9883] = 0x3086 ^ 0x9883;
        ChangeLogItem.C[0x9C51 ^ 0x9D5D] = 0xFFFFE323 ^ 0x9D5D;
        ChangeLogItem.C[0x699F ^ 0x695B] = 0x169D3 ^ 0x695B;
        ChangeLogItem.C[0xA4B ^ 0xA74] = 0xFFFFF5C0 ^ 0xA74;
        ChangeLogItem.C[0xBD4C ^ 0xBC69] = 0xBC57 ^ 0xBC69;
        ChangeLogItem.C[0x7A9C ^ 0x7A6B] = 0x9DBB ^ 0x7A6B;
        ChangeLogItem.C[0x27C9 ^ 0x2700] = 0xF41D ^ 0x2700;
        ChangeLogItem.C[0x725C ^ 0x728C] = 0xB5A9 ^ 0x728C;
        ChangeLogItem.C[0x10B19 ^ 0x10B0D] = 0x10B6C ^ 0x10B0D;
        ChangeLogItem.C[0x5EFB ^ 0x5F83] = 0xFFFFA008 ^ 0x5F83;
        ChangeLogItem.C[0x108A ^ 0x11AA] = 0xFFFF6EC0 ^ 0x11AA;
        ChangeLogItem.C[0xF40 ^ 0xE18] = 0xFFFF6C05 ^ 0xE18;
        ChangeLogItem.C[0x6C3F ^ 0x6C27] = 0xFFFF93D0 ^ 0x6C27;
        ChangeLogItem.C[0x8888 ^ 0x883D] = 0xFFFFE76E ^ 0x883D;
        ChangeLogItem.C[0xF46D ^ 0xF4BB] = 0xB009 ^ 0xF4BB;
        ChangeLogItem.C[0x19B5 ^ 0x19EE] = 0xB7B5 ^ 0x19EE;
        ChangeLogItem.C[0x62E9 ^ 0x6262] = 0xFFFF9D04 ^ 0x6262;
        ChangeLogItem.C[0xFF8 ^ 0xE82] = 0xEE5 ^ 0xE82;
        ChangeLogItem.C[0x36A3 ^ 0x37A6] = 0xBA16 ^ 0x37A6;
        ChangeLogItem.C[0x108BE ^ 0x1098A] = 0xFFFE76D4 ^ 0x1098A;
        ChangeLogItem.C[0x820E ^ 0x8270] = 0xFFFF7DB1 ^ 0x8270;
        ChangeLogItem.C[0x6371 ^ 0x63B2] = 0x16332 ^ 0x63B2;
        ChangeLogItem.C[0x6E3D ^ 0x6F15] = 0xFFFF7F80 ^ 0x6F15;
        ChangeLogItem.C[0xD807 ^ 0xD842] = 0xD833 ^ 0xD842;
        ChangeLogItem.C[0x88AE ^ 0x881F] = 0xFFFF1A17 ^ 0x881F;
        ChangeLogItem.C[0xCA30 ^ 0xCAB5] = 0xCA3E ^ 0xCAB5;
        ChangeLogItem.C[0xF557 ^ 0xF46C] = 0x127E ^ 0xF46C;
        ChangeLogItem.C[0x5252 ^ 0x535A] = 0xFFFFB25C ^ 0x535A;
        ChangeLogItem.C[0x60C4 ^ 0x608F] = 0x608F ^ 0x608F;
        ChangeLogItem.C[0x1CA2 ^ 0x1C28] = 0x1C27 ^ 0x1C28;
        ChangeLogItem.C[0xB0B ^ 0xA0B] = 0xFFFF6590 ^ 0xA0B;
        ChangeLogItem.C[0xE7B ^ 0xE87] = 0xFFFFEF88 ^ 0xE87;
        ChangeLogItem.C[0x10F3C ^ 0x10EB2] = 0x10ED1 ^ 0x10EB2;
        ChangeLogItem.C[0xEBC2 ^ 0xEB04] = 0x1EB8C ^ 0xEB04;
        ChangeLogItem.C[0x5F5C ^ 0x5E39] = 0x5E38 ^ 0x5E39;
        ChangeLogItem.C[0x99A2 ^ 0x996C] = 0xC547 ^ 0x996C;
        ChangeLogItem.C[0x1207 ^ 0x1351] = 0x8EA1 ^ 0x1351;
        ChangeLogItem.C[0x3982 ^ 0x3939] = 0x8B8F ^ 0x3939;
        ChangeLogItem.C[0xE13A ^ 0xE19F] = 0xFFFF770E ^ 0xE19F;
        ChangeLogItem.C[0x10151 ^ 0x1001A] = 0x15854 ^ 0x1001A;
        ChangeLogItem.C[0xE928 ^ 0xE95B] = 0xFFFF16DF ^ 0xE95B;
        ChangeLogItem.C[0x4234 ^ 0x4230] = 0x4226 ^ 0x4230;
        ChangeLogItem.C[0x10A40 ^ 0x10A01] = 0x10A0F ^ 0x10A01;
        ChangeLogItem.C[0xFA77 ^ 0xFB16] = 0x6F16 ^ 0xFB16;
        ChangeLogItem.C[0x84D9 ^ 0x85BE] = 0x85AC ^ 0x85BE;
        ChangeLogItem.C[0x76F ^ 0x740] = 0x777 ^ 0x740;
        ChangeLogItem.C[0xAF20 ^ 0xAFA9] = 0xFFFF5020 ^ 0xAFA9;
        ChangeLogItem.C[0x7E4 ^ 0x6A9] = 0x5EE7 ^ 0x6A9;
        ChangeLogItem.C[0x5415 ^ 0x5457] = 0xFFFFABC7 ^ 0x5457;
        ChangeLogItem.C[0x6160 ^ 0x61ED] = 0x6194 ^ 0x61ED;
        ChangeLogItem.C[0xCF4D ^ 0xCF13] = 0xCF3F ^ 0xCF13;
        ChangeLogItem.C[0x9A89 ^ 0x9AAB] = 0x9A9B ^ 0x9AAB;
        ChangeLogItem.C[0x1FDC ^ 0x1F60] = 0xADD9 ^ 0x1F60;
        ChangeLogItem.C[0x1E59 ^ 0x1F61] = 0x1107B ^ 0x1F61;
        ChangeLogItem.C[0x9053 ^ 0x913E] = 0x39F9 ^ 0x913E;
        ChangeLogItem.C[0x7B54 ^ 0x7B6C] = 0xFFFF8486 ^ 0x7B6C;
        ChangeLogItem.C[0xCBD9 ^ 0xCB78] = 0xFFFFA66B ^ 0xCB78;
        ChangeLogItem.C[0x8045 ^ 0x80DD] = 0x80DF ^ 0x80DD;
        ChangeLogItem.C[0x330 ^ 0x32F] = 0x30A ^ 0x32F;
        ChangeLogItem.C[0x10B47 ^ 0x10B2A] = 0xFFFEF44D ^ 0x10B2A;
        ChangeLogItem.C[0xA406 ^ 0xA50F] = 0xBBA9 ^ 0xA50F;
        ChangeLogItem.C[0x4D9F ^ 0x4CF7] = 0xE1E6 ^ 0x4CF7;
        ChangeLogItem.C[0xAEC8 ^ 0xAE72] = 0x9151 ^ 0xAE72;
        ChangeLogItem.C[0x7340 ^ 0x730E] = 0x730E ^ 0x730E;
        ChangeLogItem.C[0x9E6B ^ 0x9F10] = 0x9F1A ^ 0x9F10;
        ChangeLogItem.C[0x10917 ^ 0x10907] = 0x10941 ^ 0x10907;
        ChangeLogItem.C[0x3C9 ^ 0x39B] = 0x5813 ^ 0x39B;
        ChangeLogItem.C[0x6706 ^ 0x6642] = 0xFFFF9AF5 ^ 0x6642;
        ChangeLogItem.C[0x10C1A ^ 0x10D02] = 0xFFFE7E79 ^ 0x10D02;
        ChangeLogItem.C[0x2725 ^ 0x2723] = 0x27A7 ^ 0x2723;
        ChangeLogItem.C[0xEA26 ^ 0xEB56] = 0x6CBD ^ 0xEB56;
        ChangeLogItem.C[0x10E4A ^ 0x10E7C] = 0xFFFEF1F4 ^ 0x10E7C;
        ChangeLogItem.C[0xF564 ^ 0xF5A6] = 0xB0E3 ^ 0xF5A6;
        ChangeLogItem.C[0xBEEF ^ 0xBFC9] = 0x50C1 ^ 0xBFC9;
        ChangeLogItem.C[0x67FD ^ 0x6711] = 0xFFFF00B2 ^ 0x6711;
        ChangeLogItem.C[0x202B ^ 0x2111] = 0xC706 ^ 0x2111;
        ChangeLogItem.C[0xEA1D ^ 0xEA64] = 0xFFFF15E5 ^ 0xEA64;
        ChangeLogItem.C[0x4F01 ^ 0x4FE5] = 0xFFFF4713 ^ 0x4FE5;
        ChangeLogItem.C[0xBB65 ^ 0xBBAE] = 0xE787 ^ 0xBBAE;
        ChangeLogItem.C[0x6BBB ^ 0x6AB9] = 0xE704 ^ 0x6AB9;
        ChangeLogItem.C[0x89BB ^ 0x8833] = 0xFFFF77B9 ^ 0x8833;
    }
}

