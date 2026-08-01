/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting.settings;

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
import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/*
 * Signature claims super is kotakbaz.rain.module.setting.B<java.lang.String>, not kotakbaz.rain.module.setting.Setting - discarding signature.
 * Duplicate member names - consider using --renamedupmembers true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0012\u0010\u001bR\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u001c\u00a8\u0006\u001d"}, d2={"Lkotakbaz/rain/module/setting/settings/TextSetting;", "Lkotakbaz/rain/module/setting/Setting;", "", "name", "initialValue", "", "maxLength", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "text", "", "setText", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "", "validator", "setValidator", "(Lkotlin/jvm/functions/Function1;)Lkotakbaz/rain/module/setting/settings/TextSetting;", "setMaxLength", "(I)Lkotakbaz/rain/module/setting/settings/TextSetting;", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/TextSetting;", "I", "getMaxLength", "()I", "(I)V", "Lkotlin/jvm/functions/Function1;", "rain-visuals"})
public final class TextSetting
extends Setting {
    private int a;
    @NotNull
    private Function1<? super String, Boolean> A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    public TextSetting(@NotNull String name, @NotNull String initialValue, int maxLength) {
        int n2 = D[0];
        n2 -= D[1];
        Intrinsics.checkNotNullParameter(name, (String)b[n2 ^= D[2]]);
        int n3 = D[3];
        n3 += D[4];
        Intrinsics.checkNotNullParameter(initialValue, (String)b[n3 ^= D[5]]);
        super(name, initialValue);
        this.a = maxLength;
        this.A = TextSetting::validator$lambda$0;
    }

    public /* synthetic */ TextSetting(String string, String string2, int n2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = D[6];
        n4 -= D[7];
        if ((n3 & (n4 -= D[8])) != 0) {
            string2 = "";
        }
        int n5 = D[9];
        n5 ^= D[10];
        if ((n3 & (n5 -= D[11])) != 0) {
            int n6 = D[12];
            n6 -= D[13];
            n2 = n6 ^= D[14];
        }
        this(string, string2, n2);
    }

    public final int getMaxLength() {
        return this.a;
    }

    public final void setMaxLength(int n2) {
        this.a = n2;
    }

    public final void setText(@NotNull String text) {
        int n2 = D[15];
        n2 += D[16];
        Intrinsics.checkNotNullParameter(text, (String)b[n2 -= D[17]]);
        int n3 = D[18];
        n3 -= D[19];
        String string = StringsKt.take(text, RangesKt.coerceAtLeast(this.a, n3 += D[20]));
        if (this.A.invoke(string).booleanValue()) {
            this.set(string);
        }
    }

    @NotNull
    public final TextSetting setValidator(@NotNull Function1<? super String, Boolean> validator) {
        int n2 = D[21];
        n2 += D[22];
        Intrinsics.checkNotNullParameter(validator, (String)b[n2 ^= D[23]]);
        this.A = validator;
        return this;
    }

    @NotNull
    public final TextSetting setMaxLength(int maxLength) {
        int n2 = D[24];
        n2 -= D[25];
        this.a = RangesKt.coerceAtLeast(maxLength, n2 += D[26]);
        return this;
    }

    @NotNull
    public TextSetting setVisible(@NotNull Function0<Boolean> condition) {
        int n2 = D[27];
        n2 ^= D[28];
        Intrinsics.checkNotNullParameter(condition, (String)b[n2 -= D[29]]);
        super.setVisible(condition);
        return this;
    }

    private static final boolean validator$lambda$0(String it) {
        int n2 = D[30];
        n2 += D[31];
        Intrinsics.checkNotNullParameter(it, (String)b[n2 ^= D[32]]);
        boolean bl = D[33];
        bl ^= D[34];
        return bl ^= D[35];
    }

    static {
        TextSetting.b();
        long l2 = -7692104944999611478L;
        long l3 = 7771124182463482446L;
        long l4 = -7876497156241248867L;
        long l5 = 4134653922573700004L;
        long l6 = -5537756497048546653L;
        long l7 = 2624887862685546425L;
        long l8 = -1788880483591427921L;
        long l9 = 767417828136677871L;
        long l10 = 1078240619992141047L;
        long l11 = -9131656951222118210L;
        long l12 = 4413509656674069738L;
        long l13 = -5742918078618789433L;
        long l14 = 820350889786657376L;
        long l15 = 1758638949712851752L;
        int n2 = D[36];
        n2 += D[37];
        b = new Object[n2 ^= D[38]];
        long l16 = l15;
        int n3 = D[39];
        n3 -= D[40];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= D[41]);
        Object[] objectArray = new Object[D[42]];
        objectArray[TextSetting.D[43]] = B;
        objectArray[TextSetting.D[44]] = D[45];
        int n4 = D[46];
        Object object = TextSetting.A()[D[47]];
        if (object == null) {
            char[] cArray = "\uae05\u9ac8\u9932\u9a9c\u992d\u9a92\u993c\uae0e\u9a97\u9a9b\u9a57\u9af1\u9af1\uae00\u993e\u9ac7\u9ac8\u9927\u9ac7\u992c\u9923\u9a98\u9921\u9a9b\u992c\u9af0\u9a9c\u9a9c\u9a9b\u9af2\u993c\u9928\u9a92\u9af0\u9afd\u9a99\uae79\u9ac7\u9920\u9ae6\u9a9b\u9a59\uae05\uae02\u991f\uae00\u9afc\u992f\uae01\uae0c\uae0d\u9921\u9afc\u9931\u9922\u9931\u992b\uae77\u993b\u9ac7\u9a92\u992e\u9a57\uae78\uae05\u9932\uae7a\u9af1\uae7f\u9930\u9932\u9afb\u9a58\u9926\u9ae6\u992d\u9922\u9925\u991f\u9a8f\u9afe\u9a91\u9a9c\uae0d\u9afb\u992b\u9ac7\u9af1\u992f\u9a58\uae0b\uae0b\u993c\uae7a\uae79\u992b\u9ae6\u9a9a\u9a90\u9af2\u993e\u993c\u9928\u9a58\u9a59\u992e\u9a9c\u9af4".toCharArray();
            for (int i2 = D[48]; i2 < D[49]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= D[50];
                n5 += D[51];
                n5 ^= D[52];
                n5 ^= D[53];
                n5 += D[54];
                n5 ^= D[55];
                n5 -= D[56];
                n5 ^= D[57];
                n5 ^= D[58];
                n5 -= D[59];
                n5 += D[60];
                n5 += D[61];
                cArray[i2] = (char)(n5 ^= D[62]);
            }
            object = TextSetting.A()[TextSetting.D[63]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)TextSetting.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = D[64];
        n6 += D[65];
        l6 = l17 ^ (0x3400000000L ^ l17) & -1L << (n6 += D[66]);
        long l18 = l13;
        int n7 = D[67];
        n7 ^= D[68];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= D[69]);
        while (true) {
            int n8 = D[70];
            n8 -= D[71];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= D[72]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = D[73];
            n10 += D[74];
            int n11 = D[76];
            n11 -= D[77];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= D[75])) & -1L >>> (n11 ^= D[78]);
            long l20 = l9;
            int n12 = D[79];
            n12 -= D[80];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= D[81]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = D[82];
            n14 += D[83];
            int n15 = D[85];
            n15 += D[86];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= D[84])) & -1L >>> (n15 += D[87]);
            int n16 = D[88];
            n16 += D[89];
            long l22 = l10;
            int n17 = D[91];
            n17 += D[92];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= D[90]) ^ l22) & -1L << (n17 ^= D[93]);
            int n18 = D[94];
            n18 += D[95];
            int n19 = D[97];
            n19 ^= D[98];
            long l23 = l12;
            int n20 = D[100];
            l12 = l23 ^ ((long)((int)l9 << (n18 += D[96]) | (int)(l10 >>> (n19 -= D[99]))) ^ l23) & -1L >>> (n20 -= D[101]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = D[102];
            n21 ^= D[103];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= D[104]);
            while (true) {
                int n22 = D[105];
                n22 ^= D[106];
                if ((int)(l14 >>> (n22 ^= D[107])) >= (int)l12) break;
                int n23 = D[108];
                n23 -= D[109];
                int n24 = D[111];
                n24 -= D[112];
                cArray2[(int)(l14 >>> (n23 ^= TextSetting.D[110]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= D[113]))];
                l14 += 0x100000000L;
            }
            int n25 = D[114];
            n25 += D[115];
            int n26 = (int)(l15 >>> (n25 ^= D[116]));
            l15 += 0x100000000L;
            TextSetting.b[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = D[117];
            n27 -= D[118];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += D[119]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[D[120]];
        String string = (String)object[D[121]];
        object = object[D[122]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[123]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[124]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[126] ^ D[127]];
                byArray[TextSetting.D[128] ^ TextSetting.D[129]] = D[130] ^ D[131];
                byArray[TextSetting.D[132] ^ TextSetting.D[133]] = D[134] ^ D[135];
                byArray[TextSetting.D[136] ^ TextSetting.D[137]] = D[138] ^ D[139];
                byArray[TextSetting.D[140] ^ TextSetting.D[141]] = D[142] ^ D[143];
                byArray[TextSetting.D[144] ^ TextSetting.D[145]] = D[146] ^ D[147];
                byArray[TextSetting.D[148] ^ TextSetting.D[149]] = D[150] ^ D[151];
                byArray[TextSetting.D[152] ^ TextSetting.D[153]] = D[154] ^ D[155];
                byArray[TextSetting.D[156] ^ TextSetting.D[157]] = D[158] ^ D[159];
                byArray[TextSetting.D[160] ^ TextSetting.D[161]] = D[162] ^ D[163];
                byArray[TextSetting.D[164] ^ TextSetting.D[165]] = D[166] ^ D[167];
                byArray[TextSetting.D[168] ^ TextSetting.D[169]] = D[170] ^ D[171];
                byArray[TextSetting.D[172] ^ TextSetting.D[173]] = D[174] ^ D[175];
                byArray[TextSetting.D[176] ^ TextSetting.D[177]] = D[178] ^ D[179];
                byArray[TextSetting.D[180] ^ TextSetting.D[181]] = D[182] ^ D[183];
                byArray[TextSetting.D[184] ^ TextSetting.D[185]] = D[186] ^ D[187];
                byArray[TextSetting.D[188] ^ TextSetting.D[189]] = D[190] ^ D[191];
                objectArray2[TextSetting.D[125]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[192]];
            if (c == null) {
                byte[] byArray2 = new byte[D[193] ^ D[194]];
                byArray2[TextSetting.D[195] ^ TextSetting.D[196]] = D[197] ^ D[198];
                byArray2[TextSetting.D[199] ^ TextSetting.D[200]] = D[201] ^ D[202];
                byArray2[TextSetting.D[203] ^ TextSetting.D[204]] = D[205] ^ D[206];
                byArray2[TextSetting.D[207] ^ TextSetting.D[208]] = D[209] ^ D[210];
                byArray2[TextSetting.D[211] ^ TextSetting.D[212]] = D[213] ^ D[214];
                byArray2[TextSetting.D[215] ^ TextSetting.D[216]] = D[217] ^ D[218];
                byArray2[TextSetting.D[219] ^ TextSetting.D[220]] = D[221] ^ D[222];
                byArray2[TextSetting.D[223] ^ TextSetting.D[224]] = D[225] ^ D[226];
                byArray2[TextSetting.D[227] ^ TextSetting.D[228]] = D[229] ^ D[230];
                byArray2[TextSetting.D[231] ^ TextSetting.D[232]] = D[233] ^ D[234];
                byArray2[TextSetting.D[235] ^ TextSetting.D[236]] = D[237] ^ D[238];
                byArray2[TextSetting.D[239] ^ TextSetting.D[240]] = D[241] ^ D[242];
                byArray2[TextSetting.D[243] ^ TextSetting.D[244]] = D[245] ^ D[246];
                byArray2[TextSetting.D[247] ^ TextSetting.D[248]] = D[249] ^ D[250];
                byArray2[TextSetting.D[251] ^ TextSetting.D[252]] = D[253] ^ D[254];
                byArray2[TextSetting.D[255] ^ TextSetting.D[256]] = D[257] ^ D[258];
                byArray2[TextSetting.D[259] ^ TextSetting.D[260]] = D[261] ^ D[262];
                byArray2[TextSetting.D[263] ^ TextSetting.D[264]] = D[265] ^ D[266];
                byArray2[TextSetting.D[267] ^ TextSetting.D[268]] = D[269] ^ D[270];
                byArray2[TextSetting.D[271] ^ TextSetting.D[272]] = D[273] ^ D[274];
                byArray2[TextSetting.D[275] ^ TextSetting.D[276]] = D[277] ^ D[278];
                byArray2[TextSetting.D[279] ^ TextSetting.D[280]] = D[281] ^ D[282];
                byArray2[TextSetting.D[283] ^ TextSetting.D[284]] = D[285] ^ D[286];
                byArray2[TextSetting.D[287] ^ TextSetting.D[288]] = D[289] ^ D[290];
                byArray2[TextSetting.D[291] ^ TextSetting.D[292]] = D[293] ^ D[294];
                byArray2[TextSetting.D[295] ^ TextSetting.D[296]] = D[297] ^ D[298];
                byArray2[TextSetting.D[299] ^ TextSetting.D[300]] = D[301] ^ D[302];
                byArray2[TextSetting.D[303] ^ TextSetting.D[304]] = D[305] ^ D[306];
                byArray2[TextSetting.D[307] ^ TextSetting.D[308]] = D[309] ^ D[310];
                byArray2[TextSetting.D[311] ^ TextSetting.D[312]] = D[313] ^ D[314];
                byArray2[TextSetting.D[315] ^ TextSetting.D[316]] = D[317] ^ D[318];
                byArray2[TextSetting.D[319] ^ TextSetting.D[320]] = D[321] ^ D[322];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[323], byArray3, D[324], byArray.length);
                System.arraycopy(byArray2, D[325], byArray3, byArray.length, byArray2.length);
                Object object4 = TextSetting.A()[D[326]];
                if (object4 == null) {
                    char[] cArray = "\udddf\ude55\ude4c\ude5b\ude51\udac5\udda0\uddae\udd8b\udda7\ude47\uddaa\uddb6\uddb4\udda4\ude47\ude56\udac6".toCharArray();
                    for (int i2 = D[327]; i2 < D[328]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= D[329];
                        n3 -= D[330];
                        n3 += D[331];
                        n3 -= D[332];
                        n3 += D[333];
                        n3 ^= D[334];
                        n3 ^= D[335];
                        n3 += D[336];
                        n3 ^= D[337];
                        n3 ^= D[338];
                        n3 ^= D[339];
                        n3 ^= D[340];
                        cArray[i2] = (char)(n3 += D[341]);
                    }
                    object4 = TextSetting.A()[TextSetting.D[342]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[343]];
                byArray4[TextSetting.D[344]] = D[345];
                byArray4[TextSetting.D[346]] = D[347];
                byArray4[TextSetting.D[348]] = D[349];
                byArray4[TextSetting.D[350]] = D[351];
                byArray4[TextSetting.D[352]] = D[353];
                byArray4[TextSetting.D[354]] = D[355];
                byArray4[TextSetting.D[356]] = D[357];
                byArray4[TextSetting.D[358]] = D[359];
                byArray4[TextSetting.D[360]] = D[361];
                byArray4[TextSetting.D[362]] = D[363];
                byArray4[TextSetting.D[364]] = D[365];
                byArray4[TextSetting.D[366]] = D[367];
                byArray4[TextSetting.D[368]] = D[369];
                byArray4[TextSetting.D[370]] = D[371];
                byArray4[TextSetting.D[372]] = D[373];
                byArray4[TextSetting.D[374]] = D[375];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, D[376], D[377]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = TextSetting.A()[D[378]];
                if (object5 == null) {
                    char[] cArray = "\u5064\u5060\u5fd6".toCharArray();
                    for (int i3 = D[379]; i3 < D[380]; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= D[381];
                        n4 += D[382];
                        n4 += D[383];
                        n4 ^= D[384];
                        n4 -= D[385];
                        n4 -= D[386];
                        n4 += D[387];
                        n4 ^= D[388];
                        n4 -= D[389];
                        n4 ^= D[390];
                        n4 ^= D[391];
                        n4 -= D[392];
                        n4 ^= D[393];
                        cArray[i3] = (char)(n4 += D[394]);
                    }
                    object5 = TextSetting.A()[TextSetting.D[395]] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, D[396], D[397]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, D[398], byArray6.length);
            Object object6 = TextSetting.A()[D[399]];
            if (object6 == null) {
                char[] cArray = "\u1c97\u206b\u205d\u1cb9\u1c8d\u1c8e\u1c8d\u1cb9\u2068\u1c95\u1c8d\u205d\u1e1b\u2068\u2077\u204c\u204c\u205f\u207a\u2071".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 += 23761;
                    n5 += 18610;
                    n5 ^= 0x5E12;
                    n5 += 58643;
                    n5 += 932;
                    n5 += 56021;
                    n5 += 53658;
                    n5 ^= 0x74BA;
                    n5 -= 8330;
                    n5 ^= 0x137B;
                    n5 ^= 0x9B1C;
                    cArray[i4] = (char)(n5 ^= 0xAD2C);
                }
                object6 = TextSetting.A()[3] = new String(cArray);
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
        D = new int[0x10AEB ^ 0x10B7B];
        TextSetting.D[0x108D5 ^ 0x10980] = 0x15B3E ^ 0x10980;
        TextSetting.D[0x23C3 ^ 0x22F7] = 0x6622 ^ 0x22F7;
        TextSetting.D[0xA4C7 ^ 0xA4B9] = 0xA902 ^ 0xA4B9;
        TextSetting.D[0x354D ^ 0x340F] = 0x2D0B ^ 0x340F;
        TextSetting.D[0x1BB ^ 0x109] = 0xFFFF4876 ^ 0x109;
        TextSetting.D[0xF0FD ^ 0xF186] = 0xF186 ^ 0xF186;
        TextSetting.D[0x2AFF ^ 0x2AC9] = 0x9D9 ^ 0x2AC9;
        TextSetting.D[0x11BE ^ 0x11B2] = 0xFFFFEE7B ^ 0x11B2;
        TextSetting.D[0x7330 ^ 0x722C] = 0x4EDB ^ 0x722C;
        TextSetting.D[0x40BE ^ 0x41BB] = 0xFFFFDDE5 ^ 0x41BB;
        TextSetting.D[0xC308 ^ 0xC338] = 0xC338 ^ 0xC338;
        TextSetting.D[0x524E ^ 0x52F1] = 0xD90F ^ 0x52F1;
        TextSetting.D[0xE2F2 ^ 0xE215] = 0x1E175 ^ 0xE215;
        TextSetting.D[0xD56C ^ 0xD5FA] = 0xFFFF5949 ^ 0xD5FA;
        TextSetting.D[0x7FD2 ^ 0x7FE1] = 0x3740 ^ 0x7FE1;
        TextSetting.D[0x15E5 ^ 0x1581] = 0xFFFFEA51 ^ 0x1581;
        TextSetting.D[0x30AB ^ 0x31CF] = 0x31C9 ^ 0x31CF;
        TextSetting.D[0x130D ^ 0x1343] = 0x1321 ^ 0x1343;
        TextSetting.D[0x5D0F ^ 0x5DB5] = 0xFFFFCF8B ^ 0x5DB5;
        TextSetting.D[0x12E1 ^ 0x120B] = 0x11174 ^ 0x120B;
        TextSetting.D[0x9CD6 ^ 0x9CDD] = 0x9CC6 ^ 0x9CDD;
        TextSetting.D[0xD176 ^ 0xD001] = 0xFFFF2FE1 ^ 0xD001;
        TextSetting.D[0x9168 ^ 0x9018] = 0x901C ^ 0x9018;
        TextSetting.D[0xC95 ^ 0xC37] = 0x557D ^ 0xC37;
        TextSetting.D[0x7D36 ^ 0x7D09] = 0x7D09 ^ 0x7D09;
        TextSetting.D[0x68C0 ^ 0x6989] = 0xFA68 ^ 0x6989;
        TextSetting.D[0x5519 ^ 0x5477] = 0x547C ^ 0x5477;
        TextSetting.D[0xF853 ^ 0xF889] = 0xF097 ^ 0xF889;
        TextSetting.D[0x60E1 ^ 0x6068] = 0x16A52 ^ 0x6068;
        TextSetting.D[0x3127 ^ 0x31B4] = 0xD139 ^ 0x31B4;
        TextSetting.D[0x7B66 ^ 0x7A09] = 0xFFFF85F4 ^ 0x7A09;
        TextSetting.D[0xF8C4 ^ 0xF9CC] = 0xA1B8 ^ 0xF9CC;
        TextSetting.D[0x62CA ^ 0x621F] = 0x4FB4 ^ 0x621F;
        TextSetting.D[0x3576 ^ 0x356C] = 0x3566 ^ 0x356C;
        TextSetting.D[0x3F09 ^ 0x3E2D] = 0x3675 ^ 0x3E2D;
        TextSetting.D[0x29A5 ^ 0x29ED] = 0xFFFFD608 ^ 0x29ED;
        TextSetting.D[0x7A83 ^ 0x7A76] = 0xEF26 ^ 0x7A76;
        TextSetting.D[0x9188 ^ 0x9093] = 0xAC75 ^ 0x9093;
        TextSetting.D[0x731D ^ 0x7392] = 0xF658 ^ 0x7392;
        TextSetting.D[0x7D08 ^ 0x7DD9] = 0xFFFFEBCB ^ 0x7DD9;
        TextSetting.D[0xAB1B ^ 0xAA92] = 0x9FEF ^ 0xAA92;
        TextSetting.D[0xF5B7 ^ 0xF519] = 0x3316 ^ 0xF519;
        TextSetting.D[0xF60D ^ 0xF65F] = 0xF602 ^ 0xF65F;
        TextSetting.D[0x144F ^ 0x1456] = 0x1455 ^ 0x1456;
        TextSetting.D[0x85D1 ^ 0x8492] = 0x8492 ^ 0x8492;
        TextSetting.D[0x8857 ^ 0x888B] = 0x711B ^ 0x888B;
        TextSetting.D[0xFECD ^ 0xFF4F] = 0xE9C4 ^ 0xFF4F;
        TextSetting.D[0xD4B2 ^ 0xD45A] = 0x1D725 ^ 0xD45A;
        TextSetting.D[0x6233 ^ 0x6276] = 0xFFFF9DE2 ^ 0x6276;
        TextSetting.D[0x64A3 ^ 0x65C0] = 0xFFFF9A46 ^ 0x65C0;
        TextSetting.D[0x1052 ^ 0x10F2] = 0x498B ^ 0x10F2;
        TextSetting.D[0xEC73 ^ 0xED42] = 0x889B ^ 0xED42;
        TextSetting.D[0xA30E ^ 0xA388] = 0xFFFF6D36 ^ 0xA388;
        TextSetting.D[0x8030 ^ 0x80D0] = 0x8CF1 ^ 0x80D0;
        TextSetting.D[0x448A ^ 0x4479] = 0xD12B ^ 0x4479;
        TextSetting.D[0x107DB ^ 0x10655] = 0x10645 ^ 0x10655;
        TextSetting.D[0x999 ^ 0x960] = 0xA69C ^ 0x960;
        TextSetting.D[0x548 ^ 0x554] = 0xFFFFFABF ^ 0x554;
        TextSetting.D[0x54B4 ^ 0x541C] = 0xEC3B ^ 0x541C;
        TextSetting.D[0xE8A4 ^ 0xE89D] = 0x5B0B ^ 0xE89D;
        TextSetting.D[0xBCCA ^ 0xBC9D] = 0xFFFF430D ^ 0xBC9D;
        TextSetting.D[0xD782 ^ 0xD77A] = 0x78BC ^ 0xD77A;
        TextSetting.D[0x1897 ^ 0x18A6] = 0x18CA ^ 0x18A6;
        TextSetting.D[0x2D52 ^ 0x2D85] = 0x2589 ^ 0x2D85;
        TextSetting.D[0xBA46 ^ 0xBA8C] = 0xD770 ^ 0xBA8C;
        TextSetting.D[0x783F ^ 0x7814] = 0x7814 ^ 0x7814;
        TextSetting.D[0xC168 ^ 0xC1AB] = 0xA16C ^ 0xC1AB;
        TextSetting.D[0x40B2 ^ 0x4014] = 0xFFFFC190 ^ 0x4014;
        TextSetting.D[0x4DC ^ 0x4D8] = 0xFFFFFB20 ^ 0x4D8;
        TextSetting.D[0xE75A ^ 0xE662] = 0x1E857 ^ 0xE662;
        TextSetting.D[0x75C4 ^ 0x7587] = 0xFFFF8A28 ^ 0x7587;
        TextSetting.D[0x10001 ^ 0x1003A] = 0x18A00 ^ 0x1003A;
        TextSetting.D[0xBABE ^ 0xBAE8] = 0xBA88 ^ 0xBAE8;
        TextSetting.D[0xFFE5 ^ 0xFF41] = 0x8106 ^ 0xFF41;
        TextSetting.D[0xAEC3 ^ 0xAE4F] = 0x2B83 ^ 0xAE4F;
        TextSetting.D[0x10BB3 ^ 0x10B71] = 0x1726A ^ 0x10B71;
        TextSetting.D[0xE0FF ^ 0xE0D9] = 0xFFFF1F05 ^ 0xE0D9;
        TextSetting.D[0x172C ^ 0x1664] = 0x1676 ^ 0x1664;
        TextSetting.D[0x5C21 ^ 0x5C90] = 0xEA53 ^ 0x5C90;
        TextSetting.D[0x3D48 ^ 0x3D1C] = 0x3D43 ^ 0x3D1C;
        TextSetting.D[0x25E8 ^ 0x24FD] = 0x98CE ^ 0x24FD;
        TextSetting.D[0xBE56 ^ 0xBF1A] = 0xC27D ^ 0xBF1A;
        TextSetting.D[0x68A3 ^ 0x69DE] = 0xDE7B ^ 0x69DE;
        TextSetting.D[0xEDB2 ^ 0xED79] = 0x1E15A ^ 0xED79;
        TextSetting.D[0xDE86 ^ 0xDE9E] = 0xFFFF2167 ^ 0xDE9E;
        TextSetting.D[0x9562 ^ 0x9519] = 0x9518 ^ 0x9519;
        TextSetting.D[0x937C ^ 0x92F0] = 0x92F0 ^ 0x92F0;
        TextSetting.D[0x8ACA ^ 0x8ABE] = 0xFFFF750E ^ 0x8ABE;
        TextSetting.D[0x1A1A ^ 0x1ABF] = 0x64FC ^ 0x1ABF;
        TextSetting.D[0x3D82 ^ 0x3CDE] = 0x3CD1 ^ 0x3CDE;
        TextSetting.D[0x54E7 ^ 0x54DD] = 0x5DA4 ^ 0x54DD;
        TextSetting.D[0xC5F3 ^ 0xC582] = 0xC5A7 ^ 0xC582;
        TextSetting.D[0x2488 ^ 0x24C1] = 0xFFFFDB79 ^ 0x24C1;
        TextSetting.D[0xFD67 ^ 0xFC40] = 0xB16A ^ 0xFC40;
        TextSetting.D[0x598C ^ 0x58EB] = 0x58B3 ^ 0x58EB;
        TextSetting.D[0xE35D ^ 0xE3FE] = 0xBA88 ^ 0xE3FE;
        TextSetting.D[0xC163 ^ 0xC147] = 0xFFFF3EAA ^ 0xC147;
        TextSetting.D[0x4E3A ^ 0x4F63] = 0xFFFFB09B ^ 0x4F63;
        TextSetting.D[0x968F ^ 0x96F7] = 0x96F6 ^ 0x96F7;
        TextSetting.D[0x5480 ^ 0x547C] = 0x2A42 ^ 0x547C;
        TextSetting.D[0x29B7 ^ 0x28A3] = 0x94F3 ^ 0x28A3;
        TextSetting.D[0xA193 ^ 0xA178] = 0x67CA ^ 0xA178;
        TextSetting.D[0x48FD ^ 0x49CF] = 0x2C60 ^ 0x49CF;
        TextSetting.D[0x4145 ^ 0x412F] = 0xFFFFBEA0 ^ 0x412F;
        TextSetting.D[0x36BB ^ 0x3660] = 0xCFEB ^ 0x3660;
        TextSetting.D[0xA574 ^ 0xA40D] = 0xA50D ^ 0xA40D;
        TextSetting.D[0x2149 ^ 0x21F1] = 0x4C30 ^ 0x21F1;
        TextSetting.D[0x5BF4 ^ 0x5AE2] = 0xE6B2 ^ 0x5AE2;
        TextSetting.D[0x10A0B ^ 0x10B30] = 0x16FF8 ^ 0x10B30;
        TextSetting.D[0x87BF ^ 0x872A] = 0xF400 ^ 0x872A;
        TextSetting.D[0x300C ^ 0x3125] = 0xFFFF83DD ^ 0x3125;
        TextSetting.D[0xC02E ^ 0xC144] = 0xC147 ^ 0xC144;
        TextSetting.D[0x8BA4 ^ 0x8AEB] = 0x7C84 ^ 0x8AEB;
        TextSetting.D[0x98AA ^ 0x98C9] = 0x98E3 ^ 0x98C9;
        TextSetting.D[0x37E2 ^ 0x36DF] = 0xFFFFAD83 ^ 0x36DF;
        TextSetting.D[0xB754 ^ 0xB632] = 0xB630 ^ 0xB632;
        TextSetting.D[0xE347 ^ 0xE354] = 0xFFFF1CD8 ^ 0xE354;
        TextSetting.D[0xA445 ^ 0xA467] = 0xA444 ^ 0xA467;
        TextSetting.D[0x8389 ^ 0x82C7] = 0x56EC ^ 0x82C7;
        TextSetting.D[0xBB62 ^ 0xBA68] = 0xE21C ^ 0xBA68;
        TextSetting.D[0x5CD8 ^ 0x5C08] = 0x35AD ^ 0x5C08;
        TextSetting.D[0xC61A ^ 0xC645] = 0xC60D ^ 0xC645;
        TextSetting.D[0x7BC9 ^ 0x7ABA] = 0x7ABF ^ 0x7ABA;
        TextSetting.D[0xBCB9 ^ 0xBD3A] = 0x5AD4 ^ 0xBD3A;
        TextSetting.D[0x100A7 ^ 0x1003A] = 0xCB4 ^ 0x1003A;
        TextSetting.D[0xCD78 ^ 0xCD55] = 0xCD55 ^ 0xCD55;
        TextSetting.D[0xA0CE ^ 0xA0E1] = 0xA0E1 ^ 0xA0E1;
        TextSetting.D[0xDDE3 ^ 0xDD01] = 0xD120 ^ 0xDD01;
        TextSetting.D[0xE0D5 ^ 0xE0E8] = 0x8F14 ^ 0xE0E8;
        TextSetting.D[0x1BFE ^ 0x1B1F] = 0xFFFFE896 ^ 0x1B1F;
        TextSetting.D[0x8D5B ^ 0x8C71] = 0xC14C ^ 0x8C71;
        TextSetting.D[0x4FD2 ^ 0x4EBE] = 0x4EB7 ^ 0x4EBE;
        TextSetting.D[0x1EB ^ 0x1A4] = 0xFFFFFE77 ^ 0x1A4;
        TextSetting.D[0x1011B ^ 0x1012E] = 0x119E3 ^ 0x1012E;
        TextSetting.D[0xCC72 ^ 0xCC6D] = 0xCC0C ^ 0xCC6D;
        TextSetting.D[0xE996 ^ 0xE9F6] = 0xFFFF1646 ^ 0xE9F6;
        TextSetting.D[0xBEF ^ 0xABF] = 0xB3EE ^ 0xABF;
        TextSetting.D[0x6CB0 ^ 0x6D3D] = 0x6D2D ^ 0x6D3D;
        TextSetting.D[0x103C6 ^ 0x1035D] = 0x1E449 ^ 0x1035D;
        TextSetting.D[0x5CAF ^ 0x5DB0] = 0xABA9 ^ 0x5DB0;
        TextSetting.D[0x8319 ^ 0x8226] = 0x9B25 ^ 0x8226;
        TextSetting.D[0x28AE ^ 0x28F2] = 0x28FF ^ 0x28F2;
        TextSetting.D[0x997A ^ 0x9961] = 0x9952 ^ 0x9961;
        TextSetting.D[0xA0BF ^ 0xA1F8] = 0xA1F8 ^ 0xA1F8;
        TextSetting.D[0x451E ^ 0x4445] = 0xFFFFBBED ^ 0x4445;
        TextSetting.D[0x9AF8 ^ 0x9A34] = 0x19613 ^ 0x9A34;
        TextSetting.D[0xD3FA ^ 0xD2F9] = 0xB16E ^ 0xD2F9;
        TextSetting.D[0x10646 ^ 0x10644] = 0x1060E ^ 0x10644;
        TextSetting.D[0xED13 ^ 0xED03] = 0xFFFF12BD ^ 0xED03;
        TextSetting.D[0xDDE8 ^ 0xDDE2] = 0xFFFF226B ^ 0xDDE2;
        TextSetting.D[0x4265 ^ 0x42E6] = 0xE484 ^ 0x42E6;
        TextSetting.D[0x7C47 ^ 0x7CC3] = 0x4DFF ^ 0x7CC3;
        TextSetting.D[0x6664 ^ 0x6692] = 0xF3D9 ^ 0x6692;
        TextSetting.D[0x777A ^ 0x767E] = 0x15E5 ^ 0x767E;
        TextSetting.D[0x3B4C ^ 0x3B0E] = 0xFFFFC4CF ^ 0x3B0E;
        TextSetting.D[0x601D ^ 0x612D] = 0x482 ^ 0x612D;
        TextSetting.D[0x90AC ^ 0x903C] = 0x70B9 ^ 0x903C;
        TextSetting.D[0x6C85 ^ 0x6C41] = 0xC96 ^ 0x6C41;
        TextSetting.D[0x8CC0 ^ 0x8C9B] = 0xFFFF737F ^ 0x8C9B;
        TextSetting.D[0x523F ^ 0x5221] = 0xFFFFADF5 ^ 0x5221;
        TextSetting.D[0xCC2B ^ 0xCCBF] = 0xBF9C ^ 0xCCBF;
        TextSetting.D[0x3C82 ^ 0x3C18] = 0xDB28 ^ 0x3C18;
        TextSetting.D[0x7047 ^ 0x7070] = 0x69C4 ^ 0x7070;
        TextSetting.D[0xCCC6 ^ 0xCC12] = 0xE1E4 ^ 0xCC12;
        TextSetting.D[0x3108 ^ 0x31DE] = 0x1C28 ^ 0x31DE;
        TextSetting.D[0xFB31 ^ 0xFA11] = 0xC0D ^ 0xFA11;
        TextSetting.D[0x5A ^ 0x154] = 0xBE4E ^ 0x154;
        TextSetting.D[0x8ABB ^ 0x8AFF] = 0x8AE4 ^ 0x8AFF;
        TextSetting.D[0xF80D ^ 0xF934] = 0xFFFE08CC ^ 0xF934;
        TextSetting.D[0xA687 ^ 0xA6F1] = 0xA686 ^ 0xA6F1;
        TextSetting.D[0xB559 ^ 0xB5B7] = 0x730E ^ 0xB5B7;
        TextSetting.D[0x366D ^ 0x362D] = 0x36A6 ^ 0x362D;
        TextSetting.D[0x1C3C ^ 0x1CDA] = 0x2035 ^ 0x1CDA;
        TextSetting.D[0x6AA4 ^ 0x6BF5] = 0x3647 ^ 0x6BF5;
        TextSetting.D[0x8E9A ^ 0x8EB9] = 0x8EA3 ^ 0x8EB9;
        TextSetting.D[0x8E69 ^ 0x8E8C] = 0xFFFF4DC2 ^ 0x8E8C;
        TextSetting.D[0xE78 ^ 0xED1] = 0xB6F5 ^ 0xED1;
        TextSetting.D[0xF286 ^ 0xF3A4] = 0x5B8 ^ 0xF3A4;
        TextSetting.D[0x3BE5 ^ 0x3AE4] = 0x84AB ^ 0x3AE4;
        TextSetting.D[0x109E2 ^ 0x10990] = 0xFFFEF6BD ^ 0x10990;
        TextSetting.D[0x21AF ^ 0x2171] = 0xD8E1 ^ 0x2171;
        TextSetting.D[0x63B1 ^ 0x6316] = 0x1D55 ^ 0x6316;
        TextSetting.D[0xB8D2 ^ 0xB861] = 0xEA2 ^ 0xB861;
        TextSetting.D[0xDF89 ^ 0xDFD3] = 0xFFFF2073 ^ 0xDFD3;
        TextSetting.D[0xEFCE ^ 0xEE49] = 0x77F1 ^ 0xEE49;
        TextSetting.D[0x7B46 ^ 0x7A1B] = 0xFFFF8581 ^ 0x7A1B;
        TextSetting.D[0xA2DA ^ 0xA276] = 0x6430 ^ 0xA276;
        TextSetting.D[0xA500 ^ 0xA551] = 0xFFFF5AB3 ^ 0xA551;
        TextSetting.D[0x2EF3 ^ 0x2E02] = 0x1265B ^ 0x2E02;
        TextSetting.D[0x767D ^ 0x76D7] = 0xFFFF317C ^ 0x76D7;
        TextSetting.D[0xF485 ^ 0xF4E0] = 0xFFFF0B50 ^ 0xF4E0;
        TextSetting.D[0x920 ^ 0x877] = 0x867 ^ 0x877;
        TextSetting.D[0xB964 ^ 0xB961] = 0xFFFF46B0 ^ 0xB961;
        TextSetting.D[0x9744 ^ 0x979B] = 0x9BB9 ^ 0x979B;
        TextSetting.D[0x78F3 ^ 0x788A] = 0x7888 ^ 0x788A;
        TextSetting.D[0x8043 ^ 0x81C8] = 0x81CA ^ 0x81C8;
        TextSetting.D[0x3ED0 ^ 0x3F86] = 0x3F87 ^ 0x3F86;
        TextSetting.D[0xACB ^ 0xA75] = 0x81C3 ^ 0xA75;
        TextSetting.D[0x107E0 ^ 0x107CA] = 0x107C9 ^ 0x107CA;
        TextSetting.D[0xB4F7 ^ 0xB40A] = 0xFFFF35C0 ^ 0xB40A;
        TextSetting.D[0x75E3 ^ 0x7572] = 0x95FF ^ 0x7572;
        TextSetting.D[0xB1C7 ^ 0xB09F] = 0xB097 ^ 0xB09F;
        TextSetting.D[0x4088 ^ 0x4086] = 0xFFFFBF51 ^ 0x4086;
        TextSetting.D[0xE2E4 ^ 0xE229] = 0x1EE19 ^ 0xE229;
        TextSetting.D[0x9B10 ^ 0x9A51] = 0xFFFF7CF7 ^ 0x9A51;
        TextSetting.D[0x7582 ^ 0x757D] = 0xCB11 ^ 0x757D;
        TextSetting.D[0x81FA ^ 0x81EE] = 0xFFFF7E1B ^ 0x81EE;
        TextSetting.D[0x10CB9 ^ 0x10C37] = 0x189C4 ^ 0x10C37;
        TextSetting.D[0xC8ED ^ 0xC9FC] = 0xFFFF1627 ^ 0xC9FC;
        TextSetting.D[0x14C1 ^ 0x146A] = 0xAC4E ^ 0x146A;
        TextSetting.D[0xCA01 ^ 0xCA83] = 0x6C95 ^ 0xCA83;
        TextSetting.D[0xE346 ^ 0xE34F] = 0xFFFF1CD9 ^ 0xE34F;
        TextSetting.D[0x2D81 ^ 0x2CAF] = 0xCDA0 ^ 0x2CAF;
        TextSetting.D[0xC0F1 ^ 0xC0AF] = 0xC0B7 ^ 0xC0AF;
        TextSetting.D[0x9DA4 ^ 0x9DB5] = 0xFFFF624E ^ 0x9DB5;
        TextSetting.D[0x26EC ^ 0x26CC] = 0x26F9 ^ 0x26CC;
        TextSetting.D[0x89B4 ^ 0x89D3] = 0x89C2 ^ 0x89D3;
        TextSetting.D[0x86E9 ^ 0x8663] = 0xFFFE73FB ^ 0x8663;
        TextSetting.D[0xC164 ^ 0xC01E] = 0xC01C ^ 0xC01E;
        TextSetting.D[0xE4A8 ^ 0xE4DD] = 0xE4E2 ^ 0xE4DD;
        TextSetting.D[0x10AEB ^ 0x10B6B] = 0x10DEE ^ 0x10B6B;
        TextSetting.D[0xF051 ^ 0xF07D] = 0xF07C ^ 0xF07D;
        TextSetting.D[0x57F ^ 0x45E] = 0xFFFF0DE7 ^ 0x45E;
        TextSetting.D[0xF1E2 ^ 0xF0D5] = 0x1FEFD ^ 0xF0D5;
        TextSetting.D[0x9A56 ^ 0x9B6C] = 0x19559 ^ 0x9B6C;
        TextSetting.D[0xC309 ^ 0xC210] = 0x902A ^ 0xC210;
        TextSetting.D[0x28B ^ 0x23F] = 0x82BB ^ 0x23F;
        TextSetting.D[0x1084A ^ 0x108DD] = 0x17BF7 ^ 0x108DD;
        TextSetting.D[0x2240 ^ 0x2353] = 0x9F15 ^ 0x2353;
        TextSetting.D[0x10260 ^ 0x1031E] = 0x186BB ^ 0x1031E;
        TextSetting.D[0x25 ^ 0xCA] = 0x10899 ^ 0xCA;
        TextSetting.D[0x8977 ^ 0x89FC] = 0x183C6 ^ 0x89FC;
        TextSetting.D[0xE51B ^ 0xE5DA] = 0x9CE1 ^ 0xE5DA;
        TextSetting.D[0xC5F5 ^ 0xC4DA] = 0xA174 ^ 0xC4DA;
        TextSetting.D[0xE4C3 ^ 0xE4B4] = 0xE4EC ^ 0xE4B4;
        TextSetting.D[0x4FB9 ^ 0x4F20] = 0xA834 ^ 0x4F20;
        TextSetting.D[0x9453 ^ 0x94CC] = 0x19842 ^ 0x94CC;
        TextSetting.D[0x898F ^ 0x8975] = 0x26B3 ^ 0x8975;
        TextSetting.D[0x3D3 ^ 0x2EF] = 0x662D ^ 0x2EF;
        TextSetting.D[0x7788 ^ 0x76C8] = 0x6FCC ^ 0x76C8;
        TextSetting.D[0x5C35 ^ 0x5CAD] = 0xBBB5 ^ 0x5CAD;
        TextSetting.D[0xE997 ^ 0xE8A4] = 0xAC65 ^ 0xE8A4;
        TextSetting.D[0x1BE1 ^ 0x1AD7] = 0x5E02 ^ 0x1AD7;
        TextSetting.D[0x9406 ^ 0x954C] = 0xBB2F ^ 0x954C;
        TextSetting.D[0xF9C1 ^ 0xF8DC] = 0xC465 ^ 0xF8DC;
        TextSetting.D[0x68CA ^ 0x684D] = 0x597B ^ 0x684D;
        TextSetting.D[0xA514 ^ 0xA559] = 0xFFFF5AC7 ^ 0xA559;
        TextSetting.D[0xFC45 ^ 0xFC6B] = 0xFC69 ^ 0xFC6B;
        TextSetting.D[0xCB34 ^ 0xCBA6] = 0xFFFFD4F1 ^ 0xCBA6;
        TextSetting.D[0x59F3 ^ 0x59CF] = 0x5F74 ^ 0x59CF;
        TextSetting.D[0x73A0 ^ 0x73DD] = 0x73DD ^ 0x73DD;
        TextSetting.D[0xF9D7 ^ 0xF9FF] = 0xFFFF0668 ^ 0xF9FF;
        TextSetting.D[0x434F ^ 0x43CA] = 0x72FC ^ 0x43CA;
        TextSetting.D[0x676 ^ 0x774] = 0xB90D ^ 0x774;
        TextSetting.D[0xAD60 ^ 0xAC60] = 0x1219 ^ 0xAC60;
        TextSetting.D[0xB674 ^ 0xB6C4] = 0xA ^ 0xB6C4;
        TextSetting.D[0xAFA2 ^ 0xAF62] = 0xAF62 ^ 0xAF62;
        TextSetting.D[0x1E2F ^ 0x1EDF] = 0x11696 ^ 0x1EDF;
        TextSetting.D[0x1B35 ^ 0x1B68] = 0xFFFFE4B9 ^ 0x1B68;
        TextSetting.D[0xBDE7 ^ 0xBDAC] = 0xFFFF424D ^ 0xBDAC;
        TextSetting.D[0xE474 ^ 0xE4F9] = 0x6133 ^ 0xE4F9;
        TextSetting.D[0x6EBA ^ 0x6E48] = 0x16601 ^ 0x6E48;
        TextSetting.D[0xCF47 ^ 0xCF9F] = 0xC781 ^ 0xCF9F;
        TextSetting.D[0x10DE4 ^ 0x10D2A] = 0x10D ^ 0x10D2A;
        TextSetting.D[0x954F ^ 0x9437] = 0x9439 ^ 0x9437;
        TextSetting.D[0xE668 ^ 0xE6D5] = 0x6D2B ^ 0xE6D5;
        TextSetting.D[0xA62E ^ 0xA607] = 0xFFFF5983 ^ 0xA607;
        TextSetting.D[0xAC2E ^ 0xADA1] = 0xADA2 ^ 0xADA1;
        TextSetting.D[0xB130 ^ 0xB1AE] = 0xFFFE429D ^ 0xB1AE;
        TextSetting.D[0xBCDF ^ 0xBD59] = 0xE90F ^ 0xBD59;
        TextSetting.D[0x2B78 ^ 0x2B20] = 0xFFFFD4A5 ^ 0x2B20;
        TextSetting.D[0x83A6 ^ 0x83C7] = 0x83BE ^ 0x83C7;
        TextSetting.D[0x7116 ^ 0x706A] = 0x7069 ^ 0x706A;
        TextSetting.D[0x1B29 ^ 0x1B63] = 0x1B4B ^ 0x1B63;
        TextSetting.D[0x27B8 ^ 0x26B1] = 0xFFFF8147 ^ 0x26B1;
        TextSetting.D[0xDDFA ^ 0xDC8F] = 0xFFFF2305 ^ 0xDC8F;
        TextSetting.D[0x6C3B ^ 0x6C48] = 0x6C2B ^ 0x6C48;
        TextSetting.D[0xA7C5 ^ 0xA640] = 0x78CF ^ 0xA640;
        TextSetting.D[0x5FC5 ^ 0x5FE4] = 0x5FDC ^ 0x5FE4;
        TextSetting.D[0xD9A5 ^ 0xD9B7] = 0xFFFF2620 ^ 0xD9B7;
        TextSetting.D[0xCD36 ^ 0xCC3B] = 0xFFFF8CD0 ^ 0xCC3B;
        TextSetting.D[0x8878 ^ 0x8802] = 0x8802 ^ 0x8802;
        TextSetting.D[0x344 ^ 0x3E5] = 0x5A93 ^ 0x3E5;
        TextSetting.D[0x6C00 ^ 0x6D12] = 0x4D12 ^ 0x6D12;
        TextSetting.D[0x4729 ^ 0x4792] = 0x2A5D ^ 0x4792;
        TextSetting.D[0x26EC ^ 0x2600] = 0xE0B9 ^ 0x2600;
        TextSetting.D[0xC755 ^ 0xC7DD] = 0x1CDE2 ^ 0xC7DD;
        TextSetting.D[0xF84 ^ 0xFBC] = 0xC428 ^ 0xFBC;
        TextSetting.D[0xEF2C ^ 0xEF24] = 0xEF79 ^ 0xEF24;
        TextSetting.D[0x109AE ^ 0x10918] = 0xFFFE7644 ^ 0x10918;
        TextSetting.D[0xEF6A ^ 0xEFAF] = 0x8F22 ^ 0xEFAF;
        TextSetting.D[0xE345 ^ 0xE352] = 0xE319 ^ 0xE352;
        TextSetting.D[0x2F81 ^ 0x2EDF] = 0x2EDF ^ 0x2EDF;
        TextSetting.D[0xFA67 ^ 0xFA6A] = 0xFA6C ^ 0xFA6A;
        TextSetting.D[0xF523 ^ 0xF43D] = 0xC8CA ^ 0xF43D;
        TextSetting.D[0x691E ^ 0x69D1] = 0x72 ^ 0x69D1;
        TextSetting.D[0xE4D9 ^ 0xE551] = 0x9889 ^ 0xE551;
        TextSetting.D[0x2BE6 ^ 0x2A97] = 0xFFFFD551 ^ 0x2A97;
        TextSetting.D[0x2142 ^ 0x2185] = 0x4C7B ^ 0x2185;
        TextSetting.D[0x58AD ^ 0x59E9] = 0x59E9 ^ 0x59E9;
        TextSetting.D[0xA44D ^ 0xA541] = 0x1A5B ^ 0xA541;
        TextSetting.D[0xF8D ^ 0xF5F] = 0x66FA ^ 0xF5F;
        TextSetting.D[0xED47 ^ 0xED51] = 0xFFFF12FF ^ 0xED51;
        TextSetting.D[0xAFA1 ^ 0xAF20] = 0x942 ^ 0xAF20;
        TextSetting.D[0xC0FC ^ 0xC1E4] = 0x93A2 ^ 0xC1E4;
        TextSetting.D[0xE028 ^ 0xE148] = 0xE149 ^ 0xE148;
        TextSetting.D[0x4120 ^ 0x4054] = 0x4053 ^ 0x4054;
        TextSetting.D[0xB350 ^ 0xB362] = 0x4FA2 ^ 0xB362;
        TextSetting.D[0xA701 ^ 0xA758] = 0xFFFF58A3 ^ 0xA758;
        TextSetting.D[0xD144 ^ 0xD14B] = 0xD174 ^ 0xD14B;
        TextSetting.D[0x6E30 ^ 0x6ECE] = 0x10F0 ^ 0x6ECE;
        TextSetting.D[0xF84A ^ 0xF8A7] = 0xFFFFC1FA ^ 0xF8A7;
        TextSetting.D[0xD836 ^ 0xD92C] = 0x8B6A ^ 0xD92C;
        TextSetting.D[0x215C ^ 0x2135] = 0xFFFFDECB ^ 0x2135;
        TextSetting.D[0xB191 ^ 0xB0F8] = 0xFFFF4F17 ^ 0xB0F8;
        TextSetting.D[0xDAE9 ^ 0xDA34] = 0xFFFFDC26 ^ 0xDA34;
        TextSetting.D[0x10C04 ^ 0x10C69] = 0x10C58 ^ 0x10C69;
        TextSetting.D[0xEE02 ^ 0xEEAF] = 0x28E9 ^ 0xEEAF;
        TextSetting.D[0x9000 ^ 0x916B] = 0xFFFF6EE2 ^ 0x916B;
        TextSetting.D[0x8344 ^ 0x8361] = 0xFFFF7C8C ^ 0x8361;
        TextSetting.D[0xFDE4 ^ 0xFCB7] = 0x8CE0 ^ 0xFCB7;
        TextSetting.D[0x84AD ^ 0x84CF] = 0x84FC ^ 0x84CF;
        TextSetting.D[0xFBC0 ^ 0xFAAD] = 0xFA9E ^ 0xFAAD;
        TextSetting.D[0xF543 ^ 0xF46F] = 0x1560 ^ 0xF46F;
        TextSetting.D[0xE679 ^ 0xE69D] = 0xDA72 ^ 0xE69D;
        TextSetting.D[0x27C ^ 0x22C] = 0x23D ^ 0x22C;
        TextSetting.D[0x13BD ^ 0x13D3] = 0x1397 ^ 0x13D3;
        TextSetting.D[0x6120 ^ 0x6150] = 0xFFFF9E8C ^ 0x6150;
        TextSetting.D[0xFF19 ^ 0xFF85] = 0x1F309 ^ 0xFF85;
        TextSetting.D[0xC877 ^ 0xC931] = 0xC930 ^ 0xC931;
        TextSetting.D[0xD8A8 ^ 0xD9DE] = 0xD9DB ^ 0xD9DE;
        TextSetting.D[0xB0FA ^ 0xB17E] = 0x8950 ^ 0xB17E;
        TextSetting.D[0x9608 ^ 0x972E] = 0x9F76 ^ 0x972E;
        TextSetting.D[0x1999 ^ 0x18A7] = 0x7C65 ^ 0x18A7;
        TextSetting.D[0x603A ^ 0x6119] = 0x6941 ^ 0x6119;
        TextSetting.D[0x7669 ^ 0x76BA] = 0x5B42 ^ 0x76BA;
        TextSetting.D[0xE6BE ^ 0xE6B8] = 0xE6C1 ^ 0xE6B8;
        TextSetting.D[0x8F8 ^ 0x80C] = 0x9D47 ^ 0x80C;
        TextSetting.D[0x8CE8 ^ 0x8C8E] = 0x8CBA ^ 0x8C8E;
        TextSetting.D[0xC45C ^ 0xC4AB] = 0x6B64 ^ 0xC4AB;
        TextSetting.D[0x4438 ^ 0x45B2] = 0xE58C ^ 0x45B2;
        TextSetting.D[0xD431 ^ 0xD53E] = 0xF526 ^ 0xD53E;
        TextSetting.D[0x1062A ^ 0x10614] = 0x1E54B ^ 0x10614;
        TextSetting.D[0x95F7 ^ 0x95D0] = 0xFFFF6AEB ^ 0x95D0;
        TextSetting.D[0x1DF5 ^ 0x1D9E] = 0x1DCF ^ 0x1D9E;
        TextSetting.D[0x6378 ^ 0x6383] = 0x1DB5 ^ 0x6383;
        TextSetting.D[0x4B8 ^ 0x4BB] = 0xFFFFFB63 ^ 0x4BB;
        TextSetting.D[0xE686 ^ 0xE780] = 0x841B ^ 0xE780;
        TextSetting.D[0xEA6E ^ 0xEA73] = 0xFFFF15A7 ^ 0xEA73;
        TextSetting.D[0xB38E ^ 0xB29E] = 0x929E ^ 0xB29E;
        TextSetting.D[0xBA3F ^ 0xBA90] = 0x7CD6 ^ 0xBA90;
        TextSetting.D[0xB20D ^ 0xB28D] = 0x14E4 ^ 0xB28D;
        TextSetting.D[0xF98E ^ 0xF98F] = 0xF9BB ^ 0xF98F;
        TextSetting.D[0x54F5 ^ 0x5440] = 0xD4C3 ^ 0x5440;
        TextSetting.D[0x3FDD ^ 0x3F3E] = 0x3CF ^ 0x3F3E;
        TextSetting.D[0xBA4D ^ 0xBB17] = 0xBB1D ^ 0xBB17;
        TextSetting.D[0x9EDC ^ 0x9EDB] = 0x9EC1 ^ 0x9EDB;
        TextSetting.D[0x875C ^ 0x87B5] = 0xFFFE7B12 ^ 0x87B5;
        TextSetting.D[0x98A5 ^ 0x98C9] = 0x985C ^ 0x98C9;
        TextSetting.D[0x3AC2 ^ 0x3AD7] = 0x3A77 ^ 0x3AD7;
        TextSetting.D[0xBC7E ^ 0xBD2A] = 0xFB77 ^ 0xBD2A;
        TextSetting.D[0x15A7 ^ 0x15D8] = 0x1873 ^ 0x15D8;
        TextSetting.D[0x3E39 ^ 0x3F66] = 0xFFFFC09D ^ 0x3F66;
        TextSetting.D[0x6100 ^ 0x6028] = 0x2D15 ^ 0x6028;
        TextSetting.D[0x4F54 ^ 0x4F54] = 0x4F29 ^ 0x4F54;
        TextSetting.D[0x1E7A ^ 0x1F37] = 0x7ADE ^ 0x1F37;
        TextSetting.D[0xEA9B ^ 0xEB1A] = 0x9492 ^ 0xEB1A;
        TextSetting.D[0x7D8A ^ 0x7DE5] = 0xFFFF8204 ^ 0x7DE5;
        TextSetting.D[0xFBC ^ 0xF00] = 0x84FF ^ 0xF00;
        TextSetting.D[0x4D61 ^ 0x4C54] = 0xFFFFF761 ^ 0x4C54;
        TextSetting.D[0x14AC ^ 0x1587] = 0xF494 ^ 0x1587;
        TextSetting.D[0xBF2 ^ 0xAA0] = 0xC552 ^ 0xAA0;
        TextSetting.D[0x8338 ^ 0x83F0] = 0xEE0C ^ 0x83F0;
        TextSetting.D[0x1F8D ^ 0x1FE5] = 0x1FE0 ^ 0x1FE5;
        TextSetting.D[0x2D2D ^ 0x2C08] = 0xFFFFDBFD ^ 0x2C08;
        TextSetting.D[0xB4E3 ^ 0xB4B0] = 0xB4B1 ^ 0xB4B0;
        TextSetting.D[0xCA8E ^ 0xCBEC] = 0xCBE0 ^ 0xCBEC;
        TextSetting.D[0x45A6 ^ 0x456F] = 0x28FF ^ 0x456F;
        TextSetting.D[0x3A24 ^ 0x3A58] = 0x3A59 ^ 0x3A58;
        TextSetting.D[0x10F78 ^ 0x10E07] = 0x109A2 ^ 0x10E07;
        TextSetting.D[0xFE3 ^ 0xE86] = 0xED2 ^ 0xE86;
        TextSetting.D[0x5B3F ^ 0x5A57] = 0x5A5A ^ 0x5A57;
        TextSetting.D[0xB0DF ^ 0xB1BE] = 0xB1B2 ^ 0xB1BE;
        TextSetting.D[0x105F7 ^ 0x105B1] = 0xFFFEFA3B ^ 0x105B1;
        TextSetting.D[0x491E ^ 0x4809] = 0x1A40 ^ 0x4809;
        TextSetting.D[0xDEEB ^ 0xDE2D] = 0xBEFA ^ 0xDE2D;
        TextSetting.D[0xEF94 ^ 0xEE9F] = 0x5188 ^ 0xEE9F;
        TextSetting.D[0xDF1F ^ 0xDF4A] = 0xDF7A ^ 0xDF4A;
        TextSetting.D[0x10B76 ^ 0x10A04] = 0x10A0A ^ 0x10A04;
        TextSetting.D[0xCAD5 ^ 0xCA92] = 0xFFFF3557 ^ 0xCA92;
        TextSetting.D[0x10524 ^ 0x10568] = 0xFFFEFA88 ^ 0x10568;
        TextSetting.D[0xC0FF ^ 0xC0CB] = 0x9DC9 ^ 0xC0CB;
        TextSetting.D[0x6021 ^ 0x6096] = 0xE015 ^ 0x6096;
        TextSetting.D[0x5A4D ^ 0x5A0C] = 0xFFFFA5D8 ^ 0x5A0C;
        TextSetting.D[0x10A8B ^ 0x10A52] = 0x10207 ^ 0x10A52;
        TextSetting.D[0xCF92 ^ 0xCE95] = 0x96F2 ^ 0xCE95;
        TextSetting.D[0x1735 ^ 0x1618] = 0xF74D ^ 0x1618;
        TextSetting.D[0x26AB ^ 0x2612] = 0x4BDD ^ 0x2612;
        TextSetting.D[0x80D8 ^ 0x8193] = 0xEBF5 ^ 0x8193;
        TextSetting.D[0xEFB2 ^ 0xEEF7] = 0xEEF7 ^ 0xEEF7;
    }
}

