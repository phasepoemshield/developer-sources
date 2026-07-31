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
import kotakbaz.rain.module.setting.B;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.module.setting.settings.b
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015"}, d2={"Lkotakbaz/rain/module/setting/settings/BindSetting;", "Lkotakbaz/rain/module/setting/Setting;", "", "", "name", "initialValue", "<init>", "(Ljava/lang/String;I)V", "", "hasBind", "()Z", "key", "", "setKey", "(I)V", "clear", "()V", "Lkotlin/Function0;", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/BindSetting;", "rain-visuals"})
public final class b_0
extends B<Integer> {
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    public b_0(@NotNull String string, int n) {
        int n2 = C[0];
        n2 ^= C[1];
        Intrinsics.checkNotNullParameter(string, (String)a[n2 ^= C[2]]);
        super(string, n);
    }

    public /* synthetic */ b_0(String string, int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        int n3 = C[3];
        n3 ^= C[4];
        if ((n2 & (n3 += C[5])) != 0) {
            int n4 = C[6];
            n4 += C[7];
            n = n4 -= C[8];
        }
        this(string, n);
    }

    public final boolean hasBind() {
        boolean bl;
        int n = C[9];
        n += C[10];
        if (((Number)this.getValue()).intValue() != (n -= C[11])) {
            boolean bl2 = C[12];
            bl2 ^= C[13];
            bl = bl2 ^= C[14];
        } else {
            boolean bl3 = C[15];
            bl3 -= C[16];
            bl = bl3 += C[17];
        }
        return bl;
    }

    public final void setKey(int n) {
        this.set(n);
    }

    public final void clear() {
        int n = C[18];
        n ^= C[19];
        this.set(n ^= C[20]);
    }

    @NotNull
    public b_0 setVisible(@NotNull Function0<Boolean> function0) {
        int n = C[21];
        n += C[22];
        Intrinsics.checkNotNullParameter(function0, (String)a[n -= C[23]]);
        super.setVisible(function0);
        return this;
    }

    static {
        b_0.b();
        long l = 7538272820218174574L;
        long l2 = -1640163424068441112L;
        long l3 = -2963235042462165327L;
        long l4 = 6843525591171278785L;
        long l5 = 5645301504661585288L;
        long l6 = 7572926133887821003L;
        long l7 = 7407820362318397591L;
        long l8 = 9013088141348692432L;
        long l9 = 9023834569035188260L;
        long l10 = 4953008258424524652L;
        long l11 = 8165521010567927748L;
        long l12 = 7076786782411985887L;
        long l13 = 41111336538908761L;
        long l14 = -1156956709638309853L;
        int n = C[24];
        n -= C[25];
        a = new Object[n -= C[26]];
        long l15 = l14;
        int n2 = C[27];
        n2 -= C[28];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= C[29]);
        Object[] objectArray = new Object[C[30]];
        objectArray[b_0.C[31]] = A;
        objectArray[b_0.C[32]] = C[33];
        int n3 = C[34];
        Object object = b_0.A()[C[35]];
        if (object == null) {
            char[] cArray = "\u5744\u5eab\u5ea3\u574b\u5763\u574c\u5733\u5ea3\u5748\u5739\u5763\u5756\u5733\u5739\u5740\u5ea7\u5778\u576d\u5765\u5758\u573f\u5745\u5758\u5eaa\u576a\u575a\u5747\u5eab\u5735\u5ea4\u574c\u5747\u5767\u5761\u576c\u5e9f\u576d\u5759\u5749\u5746\u5ea7\u576a\u5754\u5ea5\u5eaa\u5760\u5736\u5754\u5734\u5778\u575f\u5e21\u5732\u574d\u5ea6\u5768\u573f\u5767\u5755\u5eaa\u5736\u5739\u574e\u5767".toCharArray();
            for (int i2 = C[36]; i2 < C[37]; ++i2) {
                int n4 = cArray[i2];
                n4 += C[38];
                n4 ^= C[39];
                n4 ^= C[40];
                n4 ^= C[41];
                n4 += C[42];
                n4 ^= C[43];
                n4 += C[44];
                n4 ^= C[45];
                n4 += C[46];
                cArray[i2] = (char)(n4 += C[47]);
            }
            object = b_0.A()[b_0.C[48]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)b_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = C[49];
        n5 ^= C[50];
        l5 = l16 ^ (0x1100000000L ^ l16) & -1L << (n5 += C[51]);
        long l17 = l12;
        int n6 = C[52];
        n6 ^= C[53];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= C[54]);
        while (true) {
            int n7 = C[55];
            n7 += C[56];
            if ((int)l12 >= (int)(l5 >>> (n7 += C[57]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = C[58];
            n9 ^= C[59];
            int n10 = C[61];
            n10 -= C[62];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= C[60])) & -1L >>> (n10 -= C[63]);
            long l19 = l8;
            int n11 = C[64];
            n11 -= C[65];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += C[66]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = C[67];
            n13 -= C[68];
            int n14 = C[70];
            n14 += C[71];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= C[69])) & -1L >>> (n14 += C[72]);
            int n15 = C[73];
            n15 ^= C[74];
            long l21 = l9;
            int n16 = C[76];
            n16 ^= C[77];
            l9 = l21 ^ ((long)cArray[n12] << (n15 ^= C[75]) ^ l21) & -1L << (n16 ^= C[78]);
            int n17 = C[79];
            n17 += C[80];
            n17 -= C[81];
            int n18 = C[82];
            n18 -= C[83];
            long l22 = l11;
            int n19 = C[85];
            n19 -= C[86];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= C[84]))) ^ l22) & -1L >>> (n19 -= C[87]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = C[88];
            n20 -= C[89];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 -= C[90]);
            while (true) {
                int n21 = C[91];
                n21 -= C[92];
                if ((int)(l13 >>> (n21 ^= C[93])) >= (int)l11) break;
                int n22 = C[94];
                n22 += C[95];
                int n23 = C[97];
                n23 += C[98];
                cArray2[(int)(l13 >>> (n22 ^= b_0.C[96]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= C[99]))];
                l13 += 0x100000000L;
            }
            int n24 = C[100];
            n24 -= C[101];
            int n25 = (int)(l14 >>> (n24 ^= C[102]));
            l14 += 0x100000000L;
            b_0.a[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = C[103];
            n26 += C[104];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= C[105]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[C[106]];
        String string = (String)object[C[107]];
        object = object[C[108]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[109]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[110]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[112] ^ C[113]];
                byArray[b_0.C[114] ^ b_0.C[115]] = C[116] ^ C[117];
                byArray[b_0.C[118] ^ b_0.C[119]] = C[120] ^ C[121];
                byArray[b_0.C[122] ^ b_0.C[123]] = C[124] ^ C[125];
                byArray[b_0.C[126] ^ b_0.C[127]] = C[128] ^ C[129];
                byArray[b_0.C[130] ^ b_0.C[131]] = C[132] ^ C[133];
                byArray[b_0.C[134] ^ b_0.C[135]] = C[136] ^ C[137];
                byArray[b_0.C[138] ^ b_0.C[139]] = C[140] ^ C[141];
                byArray[b_0.C[142] ^ b_0.C[143]] = C[144] ^ C[145];
                byArray[b_0.C[146] ^ b_0.C[147]] = C[148] ^ C[149];
                byArray[b_0.C[150] ^ b_0.C[151]] = C[152] ^ C[153];
                byArray[b_0.C[154] ^ b_0.C[155]] = C[156] ^ C[157];
                byArray[b_0.C[158] ^ b_0.C[159]] = C[160] ^ C[161];
                byArray[b_0.C[162] ^ b_0.C[163]] = C[164] ^ C[165];
                byArray[b_0.C[166] ^ b_0.C[167]] = C[168] ^ C[169];
                byArray[b_0.C[170] ^ b_0.C[171]] = C[172] ^ C[173];
                byArray[b_0.C[174] ^ b_0.C[175]] = C[176] ^ C[177];
                objectArray2[b_0.C[111]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[178]];
            if (b == null) {
                byte[] byArray2 = new byte[C[179] ^ C[180]];
                byArray2[b_0.C[181] ^ b_0.C[182]] = C[183] ^ C[184];
                byArray2[b_0.C[185] ^ b_0.C[186]] = C[187] ^ C[188];
                byArray2[b_0.C[189] ^ b_0.C[190]] = C[191] ^ C[192];
                byArray2[b_0.C[193] ^ b_0.C[194]] = C[195] ^ C[196];
                byArray2[b_0.C[197] ^ b_0.C[198]] = C[199] ^ C[200];
                byArray2[b_0.C[201] ^ b_0.C[202]] = C[203] ^ C[204];
                byArray2[b_0.C[205] ^ b_0.C[206]] = C[207] ^ C[208];
                byArray2[b_0.C[209] ^ b_0.C[210]] = C[211] ^ C[212];
                byArray2[b_0.C[213] ^ b_0.C[214]] = C[215] ^ C[216];
                byArray2[b_0.C[217] ^ b_0.C[218]] = C[219] ^ C[220];
                byArray2[b_0.C[221] ^ b_0.C[222]] = C[223] ^ C[224];
                byArray2[b_0.C[225] ^ b_0.C[226]] = C[227] ^ C[228];
                byArray2[b_0.C[229] ^ b_0.C[230]] = C[231] ^ C[232];
                byArray2[b_0.C[233] ^ b_0.C[234]] = C[235] ^ C[236];
                byArray2[b_0.C[237] ^ b_0.C[238]] = C[239] ^ C[240];
                byArray2[b_0.C[241] ^ b_0.C[242]] = C[243] ^ C[244];
                byArray2[b_0.C[245] ^ b_0.C[246]] = C[247] ^ C[248];
                byArray2[b_0.C[249] ^ b_0.C[250]] = C[251] ^ C[252];
                byArray2[b_0.C[253] ^ b_0.C[254]] = C[255] ^ C[256];
                byArray2[b_0.C[257] ^ b_0.C[258]] = C[259] ^ C[260];
                byArray2[b_0.C[261] ^ b_0.C[262]] = C[263] ^ C[264];
                byArray2[b_0.C[265] ^ b_0.C[266]] = C[267] ^ C[268];
                byArray2[b_0.C[269] ^ b_0.C[270]] = C[271] ^ C[272];
                byArray2[b_0.C[273] ^ b_0.C[274]] = C[275] ^ C[276];
                byArray2[b_0.C[277] ^ b_0.C[278]] = C[279] ^ C[280];
                byArray2[b_0.C[281] ^ b_0.C[282]] = C[283] ^ C[284];
                byArray2[b_0.C[285] ^ b_0.C[286]] = C[287] ^ C[288];
                byArray2[b_0.C[289] ^ b_0.C[290]] = C[291] ^ C[292];
                byArray2[b_0.C[293] ^ b_0.C[294]] = C[295] ^ C[296];
                byArray2[b_0.C[297] ^ b_0.C[298]] = C[299] ^ C[300];
                byArray2[b_0.C[301] ^ b_0.C[302]] = C[303] ^ C[304];
                byArray2[b_0.C[305] ^ b_0.C[306]] = C[307] ^ C[308];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[309], byArray3, C[310], byArray.length);
                System.arraycopy(byArray2, C[311], byArray3, byArray.length, byArray2.length);
                Object object4 = b_0.A()[C[312]];
                if (object4 == null) {
                    char[] cArray = "\u320e\u3238\u3217\u3212\u323c\u3268\u32e3\u3235\u3202\u3236\u3216\u3229\u325d\u325f\u320f\u3216\u323d\u326d".toCharArray();
                    for (int i2 = C[313]; i2 < C[314]; ++i2) {
                        int n2 = cArray[i2];
                        n2 += C[315];
                        n2 ^= C[316];
                        n2 -= C[317];
                        n2 ^= C[318];
                        n2 -= C[319];
                        n2 -= C[320];
                        n2 ^= C[321];
                        n2 -= C[322];
                        n2 ^= C[323];
                        n2 ^= C[324];
                        n2 ^= C[325];
                        cArray[i2] = (char)(n2 ^= C[326]);
                    }
                    object4 = b_0.A()[b_0.C[327]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[328]];
                byArray4[b_0.C[329]] = C[330];
                byArray4[b_0.C[331]] = C[332];
                byArray4[b_0.C[333]] = C[334];
                byArray4[b_0.C[335]] = C[336];
                byArray4[b_0.C[337]] = C[338];
                byArray4[b_0.C[339]] = C[340];
                byArray4[b_0.C[341]] = C[342];
                byArray4[b_0.C[343]] = C[344];
                byArray4[b_0.C[345]] = C[346];
                byArray4[b_0.C[347]] = C[348];
                byArray4[b_0.C[349]] = C[350];
                byArray4[b_0.C[351]] = C[352];
                byArray4[b_0.C[353]] = C[354];
                byArray4[b_0.C[355]] = C[356];
                byArray4[b_0.C[357]] = C[358];
                byArray4[b_0.C[359]] = C[360];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[361], C[362]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = b_0.A()[C[363]];
                if (object5 == null) {
                    char[] cArray = "\u5d10\u5d24\u5d5e".toCharArray();
                    for (int i3 = C[364]; i3 < C[365]; ++i3) {
                        int n3 = cArray[i3];
                        n3 ^= C[366];
                        n3 ^= C[367];
                        n3 += C[368];
                        n3 += C[369];
                        n3 += C[370];
                        n3 ^= C[371];
                        n3 += C[372];
                        n3 -= C[373];
                        n3 -= C[374];
                        n3 += C[375];
                        n3 ^= C[376];
                        n3 -= C[377];
                        n3 ^= C[378];
                        cArray[i3] = (char)(n3 ^= C[379]);
                    }
                    object5 = b_0.A()[b_0.C[380]] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, C[381], C[382]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, C[383], byArray6.length);
            Object object6 = b_0.A()[C[384]];
            if (object6 == null) {
                char[] cArray = "\ud824\ud820\ud78a\ud7de\ud7da\ud7c9\ud7da\ud7de\ud7bb\ud7d2\ud7da\ud78a\ud830\ud7bb\ud784\ud7a7\ud7a7\ud7bc\ud75d\ud786".toCharArray();
                for (int i4 = C[385]; i4 < C[386]; ++i4) {
                    int n4 = cArray[i4];
                    n4 += C[387];
                    n4 ^= C[388];
                    n4 += C[389];
                    n4 ^= C[390];
                    n4 -= C[391];
                    n4 ^= C[392];
                    n4 += C[393];
                    n4 -= C[394];
                    n4 ^= C[395];
                    n4 -= C[396];
                    n4 ^= C[397];
                    cArray[i4] = (char)(n4 += C[398]);
                }
                object6 = b_0.A()[b_0.C[399]] = new String(cArray);
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
        C = new int[0x10FFA ^ 0x10E6A];
        b_0.C[0x90FC ^ 0x9099] = 0x90AD ^ 0x9099;
        b_0.C[0xAC05 ^ 0xAC34] = 0xAC62 ^ 0xAC34;
        b_0.C[0x2C8D ^ 0x2DCC] = 0xF3C4 ^ 0x2DCC;
        b_0.C[0x9C29 ^ 0x9D03] = 0x19E28 ^ 0x9D03;
        b_0.C[0xE7BC ^ 0xE7E1] = 0xE7A8 ^ 0xE7E1;
        b_0.C[0x93FB ^ 0x9292] = 0x929F ^ 0x9292;
        b_0.C[0xD9DE ^ 0xD8DB] = 0x2300 ^ 0xD8DB;
        b_0.C[0x1959 ^ 0x180E] = 0x1809 ^ 0x180E;
        b_0.C[0xDF74 ^ 0xDF48] = 0xDF72 ^ 0xDF48;
        b_0.C[0x7743 ^ 0x7630] = 0x3D00 ^ 0x7630;
        b_0.C[0x8E9A ^ 0x8EC4] = 0x8EEA ^ 0x8EC4;
        b_0.C[0xCD3A ^ 0xCDD1] = 0xC53B ^ 0xCDD1;
        b_0.C[0x5C6B ^ 0x5D11] = 0xAF6C ^ 0x5D11;
        b_0.C[0x9142 ^ 0x91BC] = 0x6EE9 ^ 0x91BC;
        b_0.C[0xB873 ^ 0xB889] = 0x2588 ^ 0xB889;
        b_0.C[0x1557 ^ 0x1414] = 0x2A78 ^ 0x1414;
        b_0.C[0x4201 ^ 0x4323] = 0x7BD4 ^ 0x4323;
        b_0.C[0x7360 ^ 0x7384] = 0xA739 ^ 0x7384;
        b_0.C[0x480B ^ 0x4957] = 0xFFFFB6F7 ^ 0x4957;
        b_0.C[0xA1D5 ^ 0xA1F7] = 0xA1F5 ^ 0xA1F7;
        b_0.C[0x91AA ^ 0x90B0] = 0xCBAD ^ 0x90B0;
        b_0.C[0x2663 ^ 0x27E5] = 0x5F12 ^ 0x27E5;
        b_0.C[0x39F1 ^ 0x3977] = 0x13EC ^ 0x3977;
        b_0.C[0x55F6 ^ 0x54BB] = 0x54BF ^ 0x54BB;
        b_0.C[0xE841 ^ 0xE87C] = 0xE8AC ^ 0xE87C;
        b_0.C[0x10347 ^ 0x10364] = 0x10364 ^ 0x10364;
        b_0.C[0xB1C4 ^ 0xB1CC] = 0xFFFF4E5D ^ 0xB1CC;
        b_0.C[0x80E9 ^ 0x81E8] = 0xDE75 ^ 0x81E8;
        b_0.C[0x4C27 ^ 0x4C30] = 0x4C6B ^ 0x4C30;
        b_0.C[0x7A5F ^ 0x7B6B] = 0x4FE8 ^ 0x7B6B;
        b_0.C[0x18EA ^ 0x1845] = 0x185B ^ 0x1845;
        b_0.C[0x13D7 ^ 0x13AE] = 0x8849 ^ 0x13AE;
        b_0.C[0x3C67 ^ 0x3CA9] = 0xEF41 ^ 0x3CA9;
        b_0.C[0x73F5 ^ 0x7293] = 0xFFFF8D79 ^ 0x7293;
        b_0.C[0x1A08 ^ 0x1B89] = 0x1B89 ^ 0x1B89;
        b_0.C[0xC725 ^ 0xC61A] = 0xD4FE ^ 0xC61A;
        b_0.C[0x134F ^ 0x134E] = 0xFFFFECBA ^ 0x134E;
        b_0.C[0x922A ^ 0x9283] = 0xF895 ^ 0x9283;
        b_0.C[0x3487 ^ 0x35DD] = 0x35FF ^ 0x35DD;
        b_0.C[0xA693 ^ 0xA68A] = 0xA6C9 ^ 0xA68A;
        b_0.C[0x93A5 ^ 0x92C7] = 0xFFFF6D56 ^ 0x92C7;
        b_0.C[0xBCAA ^ 0xBC28] = 0x9816 ^ 0xBC28;
        b_0.C[0x2001 ^ 0x2090] = 0xFA88 ^ 0x2090;
        b_0.C[0x10352 ^ 0x10245] = 0xFFFFFAF1 ^ 0x10245;
        b_0.C[0xDE82 ^ 0xDE57] = 0x2B9C ^ 0xDE57;
        b_0.C[0x6122 ^ 0x6179] = 0x61B0 ^ 0x6179;
        b_0.C[0x4A30 ^ 0x4ABB] = 0xBE5A ^ 0x4ABB;
        b_0.C[0x9E3F ^ 0x9F29] = 0x1985C ^ 0x9F29;
        b_0.C[0xF49F ^ 0xF46B] = 0x1F833 ^ 0xF46B;
        b_0.C[0x9648 ^ 0x9664] = 0x43D ^ 0x9664;
        b_0.C[0x3547 ^ 0x352B] = 0x352B ^ 0x352B;
        b_0.C[0xF029 ^ 0xF03F] = 0xFFFF0FC2 ^ 0xF03F;
        b_0.C[0x3174 ^ 0x3192] = 0x21F6 ^ 0x3192;
        b_0.C[0x5B32 ^ 0x5B7F] = 0xFFFFA4D6 ^ 0x5B7F;
        b_0.C[0x10DD1 ^ 0x10DA2] = 0x12317 ^ 0x10DA2;
        b_0.C[0x8E3B ^ 0x8EB8] = 0xAA81 ^ 0x8EB8;
        b_0.C[0xD3CF ^ 0xD2D2] = 0x1DEC1 ^ 0xD2D2;
        b_0.C[0x103E3 ^ 0x102DF] = 0x15FAF ^ 0x102DF;
        b_0.C[0xF40F ^ 0xF4C5] = 0x115 ^ 0xF4C5;
        b_0.C[0x5272 ^ 0x525C] = 0x35F7 ^ 0x525C;
        b_0.C[0x653C ^ 0x645B] = 0x6459 ^ 0x645B;
        b_0.C[0x3F39 ^ 0x3E2B] = 0xCF31 ^ 0x3E2B;
        b_0.C[0x9D79 ^ 0x9D29] = 0x9D5C ^ 0x9D29;
        b_0.C[0x4B75 ^ 0x4B31] = 0xFFFFB49F ^ 0x4B31;
        b_0.C[0xA97A ^ 0xA9DD] = 0xC3CB ^ 0xA9DD;
        b_0.C[0xE331 ^ 0xE367] = 0xE37D ^ 0xE367;
        b_0.C[0x31B1 ^ 0x3175] = 0xC6A4 ^ 0x3175;
        b_0.C[0xF3D5 ^ 0xF3EF] = 0xFFFF0C4F ^ 0xF3EF;
        b_0.C[0x3812 ^ 0x3881] = 0x781C ^ 0x3881;
        b_0.C[0x91AC ^ 0x914F] = 0xFFFFBA4D ^ 0x914F;
        b_0.C[0x80B6 ^ 0x802E] = 0xFFFE794D ^ 0x802E;
        b_0.C[0xB727 ^ 0xB644] = 0xB649 ^ 0xB644;
        b_0.C[0xF270 ^ 0xF2BC] = 0x76C ^ 0xF2BC;
        b_0.C[0x673A ^ 0x666F] = 0x6665 ^ 0x666F;
        b_0.C[0x1078B ^ 0x10601] = 0x19E8A ^ 0x10601;
        b_0.C[0x5B8B ^ 0x5AF0] = 0xA46E ^ 0x5AF0;
        b_0.C[0x97FA ^ 0x9756] = 0xFFFFF5C7 ^ 0x9756;
        b_0.C[0x1FC7 ^ 0x1F98] = 0xFFFFE00E ^ 0x1F98;
        b_0.C[0xDF8D ^ 0xDE8B] = 0x2550 ^ 0xDE8B;
        b_0.C[0xEA3D ^ 0xEB5C] = 0xEB53 ^ 0xEB5C;
        b_0.C[0x3816 ^ 0x3946] = 0x3971 ^ 0x3946;
        b_0.C[0xA50F ^ 0xA52E] = 0xA52E ^ 0xA52E;
        b_0.C[0xD26B ^ 0xD356] = 0x7AC6 ^ 0xD356;
        b_0.C[0xA306 ^ 0xA233] = 0xA233 ^ 0xA233;
        b_0.C[0xCAFB ^ 0xCA9B] = 0xFFFF357F ^ 0xCA9B;
        b_0.C[0xDA07 ^ 0xDA7D] = 0x97B9 ^ 0xDA7D;
        b_0.C[0xAF9E ^ 0xAF4A] = 0x48A7 ^ 0xAF4A;
        b_0.C[0xA95A ^ 0xA9F9] = 0x8022 ^ 0xA9F9;
        b_0.C[0xB820 ^ 0xB829] = 0xFFFF47FB ^ 0xB829;
        b_0.C[0x960E ^ 0x9782] = 0xA95C ^ 0x9782;
        b_0.C[0xE008 ^ 0xE03D] = 0xFFFF1F97 ^ 0xE03D;
        b_0.C[0x5847 ^ 0x5881] = 0x4EC7 ^ 0x5881;
        b_0.C[0xF65A ^ 0xF77C] = 0x1FADF ^ 0xF77C;
        b_0.C[0x845F ^ 0x8429] = 0x1FCD ^ 0x8429;
        b_0.C[0x3FC9 ^ 0x3F11] = 0xCAC6 ^ 0x3F11;
        b_0.C[0xC093 ^ 0xC0F2] = 0xC0C5 ^ 0xC0F2;
        b_0.C[0xBCF1 ^ 0xBC98] = 0xBC94 ^ 0xBC98;
        b_0.C[0x90BB ^ 0x9025] = 0x61A ^ 0x9025;
        b_0.C[0x4F66 ^ 0x4E57] = 0x7AC4 ^ 0x4E57;
        b_0.C[0xD8F8 ^ 0xD978] = 0xD97B ^ 0xD978;
        b_0.C[0xC7B9 ^ 0xC772] = 0x32F8 ^ 0xC772;
        b_0.C[0x91C1 ^ 0x91EA] = 0xC58C ^ 0x91EA;
        b_0.C[0xED1A ^ 0xEDE5] = 0x12AC ^ 0xEDE5;
        b_0.C[0x645 ^ 0x754] = 0xF642 ^ 0x754;
        b_0.C[0x3C39 ^ 0x3CFE] = 0x2AEC ^ 0x3CFE;
        b_0.C[0x24CF ^ 0x241D] = 0xC3F0 ^ 0x241D;
        b_0.C[0x263D ^ 0x2620] = 0x260E ^ 0x2620;
        b_0.C[0x7854 ^ 0x7910] = 0x62D ^ 0x7910;
        b_0.C[0x8917 ^ 0x8946] = 0x8941 ^ 0x8946;
        b_0.C[0x2770 ^ 0x2600] = 0x3067 ^ 0x2600;
        b_0.C[0xCACD ^ 0xCAF3] = 0xCAB5 ^ 0xCAF3;
        b_0.C[0x6299 ^ 0x623D] = 0xFFFFB42E ^ 0x623D;
        b_0.C[0x8658 ^ 0x86DF] = 0xAC49 ^ 0x86DF;
        b_0.C[0xEDBC ^ 0xEDBC] = 0xEDCA ^ 0xEDBC;
        b_0.C[0xE488 ^ 0xE5F4] = 0xE5F6 ^ 0xE5F4;
        b_0.C[0xBBDE ^ 0xBB74] = 0x264C ^ 0xBB74;
        b_0.C[0x9269 ^ 0x920E] = 0x928E ^ 0x920E;
        b_0.C[0xB44E ^ 0xB4B9] = 0xDA85 ^ 0xB4B9;
        b_0.C[0xD853 ^ 0xD88A] = 0x33F0 ^ 0xD88A;
        b_0.C[0x166A ^ 0x1691] = 0xFFFF7433 ^ 0x1691;
        b_0.C[0x7810 ^ 0x788D] = 0x81CF ^ 0x788D;
        b_0.C[0xA54F ^ 0xA529] = 0xFFFF5AB3 ^ 0xA529;
        b_0.C[0x9717 ^ 0x9785] = 0xD719 ^ 0x9785;
        b_0.C[0x8906 ^ 0x8828] = 0x41E5 ^ 0x8828;
        b_0.C[0x1F38 ^ 0x1E77] = 0x1E74 ^ 0x1E77;
        b_0.C[0x84A ^ 0x908] = 0xDC43 ^ 0x908;
        b_0.C[0x3F3E ^ 0x3E06] = 0x3E07 ^ 0x3E06;
        b_0.C[0xB4D ^ 0xBE3] = 0xBF6 ^ 0xBE3;
        b_0.C[0x4487 ^ 0x4465] = 0x90D8 ^ 0x4465;
        b_0.C[0xC370 ^ 0xC333] = 0xFFFF3CD7 ^ 0xC333;
        b_0.C[0xA2AB ^ 0xA2CF] = 0xFFFF5D21 ^ 0xA2CF;
        b_0.C[0x3211 ^ 0x3323] = 0x7A0 ^ 0x3323;
        b_0.C[0x8052 ^ 0x803A] = 0xFFFF7F96 ^ 0x803A;
        b_0.C[0xFCC3 ^ 0xFC49] = 0x8AE ^ 0xFC49;
        b_0.C[0xEC6A ^ 0xEC14] = 0x2B5A ^ 0xEC14;
        b_0.C[0x1469 ^ 0x146F] = 0xFFFFEB99 ^ 0x146F;
        b_0.C[0xCAC1 ^ 0xCBCD] = 0xCE1B ^ 0xCBCD;
        b_0.C[0xA190 ^ 0xA19C] = 0xFFFF5E2E ^ 0xA19C;
        b_0.C[0x78B8 ^ 0x78FD] = 0x78C8 ^ 0x78FD;
        b_0.C[0x396B ^ 0x3805] = 0xF827 ^ 0x3805;
        b_0.C[0xAD5 ^ 0xACF] = 0xFFFFF545 ^ 0xACF;
        b_0.C[0x7136 ^ 0x7187] = 0x7199 ^ 0x7187;
        b_0.C[0xEF76 ^ 0xEFEC] = 0x16A1 ^ 0xEFEC;
        b_0.C[0xD50D ^ 0xD58D] = 0x12FC ^ 0xD58D;
        b_0.C[0x608E ^ 0x609F] = 0xFFFF9F5F ^ 0x609F;
        b_0.C[0x4656 ^ 0x46B6] = 0x3AF4 ^ 0x46B6;
        b_0.C[0x89B8 ^ 0x896F] = 0xFFFF8335 ^ 0x896F;
        b_0.C[0x7A8D ^ 0x7A5E] = 0xFFFF6212 ^ 0x7A5E;
        b_0.C[0x66D5 ^ 0x66E1] = 0xFFFF9910 ^ 0x66E1;
        b_0.C[0x662 ^ 0x6B4] = 0xF363 ^ 0x6B4;
        b_0.C[0x7386 ^ 0x7368] = 0x8D2D ^ 0x7368;
        b_0.C[0xC245 ^ 0xC2EE] = 0x5FD6 ^ 0xC2EE;
        b_0.C[0xA6BB ^ 0xA738] = 0x8BF9 ^ 0xA738;
        b_0.C[0xC658 ^ 0xC737] = 0x35F5 ^ 0xC737;
        b_0.C[0x9C1C ^ 0x9C38] = 0x9C38 ^ 0x9C38;
        b_0.C[0x82B3 ^ 0x8254] = 0xFFFF6DD2 ^ 0x8254;
        b_0.C[0xCB60 ^ 0xCBAF] = 0x182D ^ 0xCBAF;
        b_0.C[0xF753 ^ 0xF761] = 0xF733 ^ 0xF761;
        b_0.C[0xD6E5 ^ 0xD620] = 0xC06E ^ 0xD620;
        b_0.C[0x7239 ^ 0x7294] = 0xEFAC ^ 0x7294;
        b_0.C[0x2867 ^ 0x2874] = 0xFFFFD7B9 ^ 0x2874;
        b_0.C[0xF357 ^ 0xF260] = 0xF260 ^ 0xF260;
        b_0.C[0x6683 ^ 0x66F1] = 0x4840 ^ 0x66F1;
        b_0.C[0xC35E ^ 0xC27B] = 0x1CFC3 ^ 0xC27B;
        b_0.C[0x3E9A ^ 0x3E85] = 0x3E85 ^ 0x3E85;
        b_0.C[0x90F2 ^ 0x90A7] = 0x9030 ^ 0x90A7;
        b_0.C[0xEB62 ^ 0xEA17] = 0x4A81 ^ 0xEA17;
        b_0.C[0x94F8 ^ 0x95B6] = 0x9597 ^ 0x95B6;
        b_0.C[0xBC31 ^ 0xBCCD] = 0x21CC ^ 0xBCCD;
        b_0.C[0x4E2 ^ 0x5D2] = 0xCC1F ^ 0x5D2;
        b_0.C[0xF782 ^ 0xF7FD] = 0x30B6 ^ 0xF7FD;
        b_0.C[0x89C3 ^ 0x88AE] = 0x88AD ^ 0x88AE;
        b_0.C[0x8B90 ^ 0x8A19] = 0xAD33 ^ 0x8A19;
        b_0.C[0xC4BA ^ 0xC43F] = 0xE006 ^ 0xC43F;
        b_0.C[0x7398 ^ 0x7297] = 0xFFFFBA97 ^ 0x7297;
        b_0.C[0xD3BF ^ 0xD2A7] = 0x1D5D2 ^ 0xD2A7;
        b_0.C[0xB5AA ^ 0xB493] = 0xB493 ^ 0xB493;
        b_0.C[0x99FA ^ 0x9925] = 0xFFFF1AE9 ^ 0x9925;
        b_0.C[0xCB46 ^ 0xCBA3] = 0xDBC6 ^ 0xCBA3;
        b_0.C[0x94E1 ^ 0x95A7] = 0xFA9 ^ 0x95A7;
        b_0.C[0xA986 ^ 0xA80E] = 0x4F7 ^ 0xA80E;
        b_0.C[0x968D ^ 0x97A6] = 0x1948D ^ 0x97A6;
        b_0.C[0x111D ^ 0x112A] = 0x1123 ^ 0x112A;
        b_0.C[0xF513 ^ 0xF406] = 0x1F37E ^ 0xF406;
        b_0.C[0xDF3E ^ 0xDFE4] = 0x349A ^ 0xDFE4;
        b_0.C[0xB4CE ^ 0xB4BE] = 0x8F9E ^ 0xB4BE;
        b_0.C[0x10807 ^ 0x10924] = 0x131B8 ^ 0x10924;
        b_0.C[0xAE65 ^ 0xAE08] = 0xAE09 ^ 0xAE08;
        b_0.C[0x80E4 ^ 0x81A4] = 0xB590 ^ 0x81A4;
        b_0.C[0x5784 ^ 0x56AC] = 0x15B0F ^ 0x56AC;
        b_0.C[0x4DC8 ^ 0x4CE7] = 0xFFFF7AB3 ^ 0x4CE7;
        b_0.C[0xE28A ^ 0xE2D0] = 0xFFFF1D22 ^ 0xE2D0;
        b_0.C[0xB54E ^ 0xB45A] = 0x4540 ^ 0xB45A;
        b_0.C[0x94FE ^ 0x9570] = 0x877F ^ 0x9570;
        b_0.C[0x437A ^ 0x435A] = 0x435B ^ 0x435A;
        b_0.C[0x80C9 ^ 0x8021] = 0x9045 ^ 0x8021;
        b_0.C[0x4CB7 ^ 0x4CF6] = 0xFFFFB309 ^ 0x4CF6;
        b_0.C[0xF481 ^ 0xF5BB] = 0xF5A9 ^ 0xF5BB;
        b_0.C[0xA227 ^ 0xA2E7] = 0x5371 ^ 0xA2E7;
        b_0.C[0x611B ^ 0x61ED] = 0xF85 ^ 0x61ED;
        b_0.C[0xBAAC ^ 0xBA54] = 0xD43C ^ 0xBA54;
        b_0.C[0x13AB ^ 0x12D5] = 0x12C5 ^ 0x12D5;
        b_0.C[0x18F5 ^ 0x1897] = 0x18B0 ^ 0x1897;
        b_0.C[0x2221 ^ 0x221A] = 0xFFFFDD81 ^ 0x221A;
        b_0.C[0x1702 ^ 0x1649] = 0x1647 ^ 0x1649;
        b_0.C[0x3B56 ^ 0x3A36] = 0xFFFFC5A5 ^ 0x3A36;
        b_0.C[0x9242 ^ 0x9229] = 0x922B ^ 0x9229;
        b_0.C[0xC619 ^ 0xC676] = 0xC676 ^ 0xC676;
        b_0.C[0x24C1 ^ 0x2430] = 0x1287A ^ 0x2430;
        b_0.C[0x4422 ^ 0x4421] = 0xFFFFBB8B ^ 0x4421;
        b_0.C[0x7100 ^ 0x708F] = 0x708C ^ 0x708F;
        b_0.C[0x5AA1 ^ 0x5B92] = 0x6F75 ^ 0x5B92;
        b_0.C[0x1E65 ^ 0x1E95] = 0xE0D0 ^ 0x1E95;
        b_0.C[0x40D6 ^ 0x4025] = 0xFFFEB3B2 ^ 0x4025;
        b_0.C[0x3F1 ^ 0x2AE] = 0x2AE ^ 0x2AE;
        b_0.C[0xB077 ^ 0xB03C] = 0xB051 ^ 0xB03C;
        b_0.C[0x2650 ^ 0x26C0] = 0xFCE2 ^ 0x26C0;
        b_0.C[0xC29C ^ 0xC284] = 0xFFFF3D4B ^ 0xC284;
        b_0.C[0x17A ^ 0x5E] = 0x38A9 ^ 0x5E;
        b_0.C[0x1186 ^ 0x11DE] = 0xFFFFEE15 ^ 0x11DE;
        b_0.C[0x52ED ^ 0x525A] = 0x1298 ^ 0x525A;
        b_0.C[0xC2FF ^ 0xC2E3] = 0xFFFF3D3F ^ 0xC2E3;
        b_0.C[0x9D92 ^ 0x9CDA] = 0x9CCA ^ 0x9CDA;
        b_0.C[0xF914 ^ 0xF9C5] = 0x1E2A ^ 0xF9C5;
        b_0.C[0x661B ^ 0x675C] = 0x675D ^ 0x675C;
        b_0.C[0xD319 ^ 0xD29D] = 0xDDBE ^ 0xD29D;
        b_0.C[0x102C0 ^ 0x10249] = 0x128DF ^ 0x10249;
        b_0.C[0x76F3 ^ 0x7612] = 0xA2A1 ^ 0x7612;
        b_0.C[0x581A ^ 0x5971] = 0x5973 ^ 0x5971;
        b_0.C[0x26A2 ^ 0x269D] = 0x26F7 ^ 0x269D;
        b_0.C[0x1B8A ^ 0x1BD3] = 0xFFFFE46A ^ 0x1BD3;
        b_0.C[0x5957 ^ 0x5806] = 0x580E ^ 0x5806;
        b_0.C[0x4997 ^ 0x48BE] = 0x14B93 ^ 0x48BE;
        b_0.C[0x8D08 ^ 0x8D41] = 0xFFFF72D6 ^ 0x8D41;
        b_0.C[0x5DED ^ 0x5CDB] = 0x5CDB ^ 0x5CDB;
        b_0.C[0x5309 ^ 0x5271] = 0x2569 ^ 0x5271;
        b_0.C[0x2335 ^ 0x23D8] = 0xDD82 ^ 0x23D8;
        b_0.C[0xD12C ^ 0xD1C6] = 0xD908 ^ 0xD1C6;
        b_0.C[0x2CFE ^ 0x2C89] = 0xB76E ^ 0x2C89;
        b_0.C[0xD764 ^ 0xD72A] = 0xFFFF28D2 ^ 0xD72A;
        b_0.C[0x6B4A ^ 0x6A4A] = 0x951F ^ 0x6A4A;
        b_0.C[0x746D ^ 0x74DB] = 0x3464 ^ 0x74DB;
        b_0.C[0x6DB8 ^ 0x6D45] = 0x9215 ^ 0x6D45;
        b_0.C[0x6E21 ^ 0x6E2C] = 0xFFFF91A0 ^ 0x6E2C;
        b_0.C[0x10708 ^ 0x10725] = 0x14A7C ^ 0x10725;
        b_0.C[0x2621 ^ 0x2626] = 0xFFFFD9BC ^ 0x2626;
        b_0.C[0x94AB ^ 0x94E3] = 0xFFFF6B27 ^ 0x94E3;
        b_0.C[0x8163 ^ 0x8146] = 0x8106 ^ 0x8146;
        b_0.C[0x3192 ^ 0x318C] = 0x318F ^ 0x318C;
        b_0.C[0x14E ^ 0x43] = 0x37AA ^ 0x43;
        b_0.C[0xEAF ^ 0xFF1] = 0xFFFFF065 ^ 0xFF1;
        b_0.C[0xF6B8 ^ 0xF6EC] = 0xFFFF090B ^ 0xF6EC;
        b_0.C[0x3FB5 ^ 0x3FDB] = 0x3FDA ^ 0x3FDB;
        b_0.C[0xD1DD ^ 0xD197] = 0xFFFF2E4D ^ 0xD197;
        b_0.C[0x1B25 ^ 0x1A73] = 0xFFFFE5D1 ^ 0x1A73;
        b_0.C[0x600D ^ 0x604A] = 0x600A ^ 0x604A;
        b_0.C[0xA8E1 ^ 0xA9AB] = 0xFFFF566C ^ 0xA9AB;
        b_0.C[0xF519 ^ 0xF598] = 0x32D3 ^ 0xF598;
        b_0.C[0xBAEE ^ 0xBAEB] = 0xFFFF4505 ^ 0xBAEB;
        b_0.C[0xA0A0 ^ 0xA1A3] = 0xFFFF018B ^ 0xA1A3;
        b_0.C[0x4D6F ^ 0x4DA2] = 0x9E5F ^ 0x4DA2;
        b_0.C[0xAD2 ^ 0xAEA] = 0xFFFFF537 ^ 0xAEA;
        b_0.C[0xDCCB ^ 0xDDB6] = 0xDDB6 ^ 0xDDB6;
        b_0.C[0x3100 ^ 0x31C9] = 0xC40F ^ 0x31C9;
        b_0.C[0x52EF ^ 0x52F4] = 0x52DE ^ 0x52F4;
        b_0.C[0x10B4A ^ 0x10B08] = 0x10B2D ^ 0x10B08;
        b_0.C[0x53F9 ^ 0x52E2] = 0xFFFFF668 ^ 0x52E2;
        b_0.C[0xFE6F ^ 0xFE05] = 0xFE04 ^ 0xFE05;
        b_0.C[0x10143 ^ 0x1018B] = 0x117CD ^ 0x1018B;
        b_0.C[0xD1C0 ^ 0xD1B8] = 0xFFFFB5DE ^ 0xD1B8;
        b_0.C[0x926C ^ 0x9313] = 0x9303 ^ 0x9313;
        b_0.C[0x76C7 ^ 0x77E0] = 0x17A1A ^ 0x77E0;
        b_0.C[0x4496 ^ 0x45CF] = 0x45CA ^ 0x45CF;
        b_0.C[0x31F8 ^ 0x30B4] = 0xFFFFCF22 ^ 0x30B4;
        b_0.C[0x50D ^ 0x5B7] = 0xC313 ^ 0x5B7;
        b_0.C[0x2115 ^ 0x2041] = 0xFFFFDFEF ^ 0x2041;
        b_0.C[0xCDC5 ^ 0xCCDB] = 0x1C0CF ^ 0xCCDB;
        b_0.C[0x9FD6 ^ 0x9E8B] = 0x9E8A ^ 0x9E8B;
        b_0.C[0xF05F ^ 0xF05D] = 0xFFFF0FDF ^ 0xF05D;
        b_0.C[0xDA38 ^ 0xDB3C] = 0x84B5 ^ 0xDB3C;
        b_0.C[0x12A2 ^ 0x1294] = 0x12AF ^ 0x1294;
        b_0.C[0x9368 ^ 0x93DC] = 0xE965 ^ 0x93DC;
        b_0.C[0x407 ^ 0x527] = 0x10933 ^ 0x527;
        b_0.C[0x1047 ^ 0x1015] = 0xFFFFEF66 ^ 0x1015;
        b_0.C[0x3DE4 ^ 0x3CEE] = 0x3938 ^ 0x3CEE;
        b_0.C[0x1098A ^ 0x109AD] = 0x1F43F ^ 0x109AD;
        b_0.C[0x4B47 ^ 0x4B3A] = 0x6F4 ^ 0x4B3A;
        b_0.C[0xD15C ^ 0xD1FD] = 0x47CA ^ 0xD1FD;
        b_0.C[0xEA48 ^ 0xEBCF] = 0x87A6 ^ 0xEBCF;
        b_0.C[0xE811 ^ 0xE8D2] = 0x1F4C ^ 0xE8D2;
        b_0.C[0xE711 ^ 0xE630] = 0xDECE ^ 0xE630;
        b_0.C[0x1A57 ^ 0x1A17] = 0xFFFFE5ED ^ 0x1A17;
        b_0.C[0x6BFD ^ 0x6B5D] = 0xFD7D ^ 0x6B5D;
        b_0.C[0x4229 ^ 0x42F5] = 0xA98B ^ 0x42F5;
        b_0.C[0x103A3 ^ 0x102D5] = 0x173A2 ^ 0x102D5;
        b_0.C[0x3796 ^ 0x3702] = 0xFFFF8860 ^ 0x3702;
        b_0.C[0x4D75 ^ 0x4D46] = 0x4D5A ^ 0x4D46;
        b_0.C[0x79B0 ^ 0x79CB] = 0x3405 ^ 0x79CB;
        b_0.C[0x171F ^ 0x176E] = 0x2C5E ^ 0x176E;
        b_0.C[0xEF2E ^ 0xEFDC] = 0x1E384 ^ 0xEFDC;
        b_0.C[0x948A ^ 0x95EE] = 0xFFFF6A79 ^ 0x95EE;
        b_0.C[0xF603 ^ 0xF69F] = 0xFFFFF00A ^ 0xF69F;
        b_0.C[0xA59A ^ 0xA58F] = 0xA5D0 ^ 0xA58F;
        b_0.C[0x821C ^ 0x836E] = 0xF0E1 ^ 0x836E;
        b_0.C[0x10A99 ^ 0x10A22] = 0x1CCA9 ^ 0x10A22;
        b_0.C[0xCAB5 ^ 0xCA22] = 0x1CC84 ^ 0xCA22;
        b_0.C[0x26D5 ^ 0x2665] = 0xFFFFD9BA ^ 0x2665;
        b_0.C[0x3B4F ^ 0x3A62] = 0xF3BE ^ 0x3A62;
        b_0.C[0x1EB8 ^ 0x1EAA] = 0xFFFFE17A ^ 0x1EAA;
        b_0.C[0x4E44 ^ 0x4F28] = 0x4F28 ^ 0x4F28;
        b_0.C[0xAF5C ^ 0xAF4C] = 0xFFFF509D ^ 0xAF4C;
        b_0.C[0x5A6 ^ 0x528] = 0xDF3E ^ 0x528;
        b_0.C[0xDAF1 ^ 0xDBB8] = 0xDBBE ^ 0xDBB8;
        b_0.C[0xFDD6 ^ 0xFD65] = 0x87FC ^ 0xFD65;
        b_0.C[0x1060D ^ 0x106B5] = 0x1460A ^ 0x106B5;
        b_0.C[0x915F ^ 0x900D] = 0x902F ^ 0x900D;
        b_0.C[0x3D90 ^ 0x3DDC] = 0x3DAD ^ 0x3DDC;
        b_0.C[0x5CC3 ^ 0x5C7C] = 0xFFFF5278 ^ 0x5C7C;
        b_0.C[0x1C2D ^ 0x1D31] = 0x462C ^ 0x1D31;
        b_0.C[0x66BE ^ 0x66E9] = 0x66B4 ^ 0x66E9;
        b_0.C[0xECDA ^ 0xECF3] = 0x9626 ^ 0xECF3;
        b_0.C[0x3198 ^ 0x30A3] = 0x8EB3 ^ 0x30A3;
        b_0.C[0x681D ^ 0x6816] = 0x685F ^ 0x6816;
        b_0.C[0xB78 ^ 0xAFA] = 0xAEE ^ 0xAFA;
        b_0.C[0x89E5 ^ 0x896D] = 0xA3D9 ^ 0x896D;
        b_0.C[0x5CAF ^ 0x5DEA] = 0x1697 ^ 0x5DEA;
        b_0.C[0x9B04 ^ 0x9B89] = 0x6F68 ^ 0x9B89;
        b_0.C[0x6C7F ^ 0x6D7D] = 0x32F4 ^ 0x6D7D;
        b_0.C[0xD166 ^ 0xD105] = 0xD17B ^ 0xD105;
        b_0.C[0x1666 ^ 0x17E3] = 0xE024 ^ 0x17E3;
        b_0.C[0x10DB9 ^ 0x10CCE] = 0x1E256 ^ 0x10CCE;
        b_0.C[0xA7E0 ^ 0xA7CA] = 0xA03C ^ 0xA7CA;
        b_0.C[0x68E8 ^ 0x68B4] = 0x68D4 ^ 0x68B4;
        b_0.C[0x3B8E ^ 0x3BC1] = 0xFFFFC463 ^ 0x3BC1;
        b_0.C[0x5597 ^ 0x549F] = 0xAF44 ^ 0x549F;
        b_0.C[0xDEA8 ^ 0xDE80] = 0xEE35 ^ 0xDE80;
        b_0.C[0x1509 ^ 0x1526] = 0x5068 ^ 0x1526;
        b_0.C[0x57A2 ^ 0x56F9] = 0x56F5 ^ 0x56F9;
        b_0.C[0x5015 ^ 0x5091] = 0x74EC ^ 0x5091;
        b_0.C[0xFA4C ^ 0xFA39] = 0xD48C ^ 0xFA39;
        b_0.C[0x4CCE ^ 0x4C21] = 0xB211 ^ 0x4C21;
        b_0.C[0x1006 ^ 0x10A4] = 0x397D ^ 0x10A4;
        b_0.C[0xD250 ^ 0xD329] = 0xDE92 ^ 0xD329;
        b_0.C[0x1918 ^ 0x19ED] = 0x779D ^ 0x19ED;
        b_0.C[0x4B2F ^ 0x4B21] = 0x4B1E ^ 0x4B21;
        b_0.C[0xF3D2 ^ 0xF2C1] = 0x3CE ^ 0xF2C1;
        b_0.C[0xD840 ^ 0xD8DB] = 0x2199 ^ 0xD8DB;
        b_0.C[0x9A7E ^ 0x9B70] = 0xAC93 ^ 0x9B70;
        b_0.C[0x73B7 ^ 0x72C6] = 0x8408 ^ 0x72C6;
        b_0.C[0xFAF3 ^ 0xFAE7] = 0xFFFF0505 ^ 0xFAE7;
        b_0.C[0x1062A ^ 0x106BF] = 0x14622 ^ 0x106BF;
        b_0.C[0x4BA6 ^ 0x4B67] = 0xBCAF ^ 0x4B67;
        b_0.C[0x1053E ^ 0x10435] = 0x101F7 ^ 0x10435;
        b_0.C[0x3F3 ^ 0x3F7] = 0xFFFFFC49 ^ 0x3F7;
        b_0.C[0xB7C9 ^ 0xB745] = 0x4380 ^ 0xB745;
        b_0.C[0x7A66 ^ 0x7B12] = 0xAE24 ^ 0x7B12;
        b_0.C[0xB605 ^ 0xB6AD] = 0xFFFF237D ^ 0xB6AD;
        b_0.C[0x56B5 ^ 0x573E] = 0x4173 ^ 0x573E;
        b_0.C[0x9A82 ^ 0x9BD1] = 0x9BDA ^ 0x9BD1;
        b_0.C[0xDA8B ^ 0xDA55] = 0xA617 ^ 0xDA55;
        b_0.C[0x8AC8 ^ 0x8BA2] = 0x8AA2 ^ 0x8BA2;
        b_0.C[0x2EE9 ^ 0x2E00] = 0x26DD ^ 0x2E00;
        b_0.C[0x112B ^ 0x10A6] = 0x1B78 ^ 0x10A6;
        b_0.C[0xC3F7 ^ 0xC36E] = 0x1C5C8 ^ 0xC36E;
        b_0.C[0xFB78 ^ 0xFA68] = 0xCD8B ^ 0xFA68;
        b_0.C[0xF7D6 ^ 0xF740] = 0x1F1EA ^ 0xF740;
        b_0.C[0x2494 ^ 0x2426] = 0x2426 ^ 0x2426;
        b_0.C[0x292B ^ 0x2807] = 0x12B2C ^ 0x2807;
        b_0.C[0xDECF ^ 0xDE73] = 0x18D7 ^ 0xDE73;
        b_0.C[0x7E19 ^ 0x7F00] = 0x2407 ^ 0x7F00;
        b_0.C[0xBA92 ^ 0xBAB4] = 0xB255 ^ 0xBAB4;
        b_0.C[0x33CF ^ 0x32D0] = 0xFFFEC17F ^ 0x32D0;
        b_0.C[0x1419 ^ 0x14C4] = 0x689B ^ 0x14C4;
        b_0.C[0xD6BB ^ 0xD6CF] = 0xF806 ^ 0xD6CF;
        b_0.C[0x2D18 ^ 0x2D12] = 0x2D64 ^ 0x2D12;
        b_0.C[0x6E5A ^ 0x6F5D] = 0xFFFF6B08 ^ 0x6F5D;
        b_0.C[0x9BDA ^ 0x9B45] = 0xD72 ^ 0x9B45;
        b_0.C[0x40EE ^ 0x4048] = 0x2A57 ^ 0x4048;
        b_0.C[0x23FE ^ 0x22F7] = 0x2722 ^ 0x22F7;
        b_0.C[0x208B ^ 0x2004] = 0xFA1C ^ 0x2004;
        b_0.C[0x6417 ^ 0x6427] = 0x6427 ^ 0x6427;
        b_0.C[0xA738 ^ 0xA701] = 0xA73B ^ 0xA701;
        b_0.C[0xAC41 ^ 0xAC91] = 0x7F79 ^ 0xAC91;
        b_0.C[0x8087 ^ 0x80FB] = 0xFFFF32A9 ^ 0x80FB;
        b_0.C[0x137 ^ 0x1DB] = 0x915 ^ 0x1DB;
        b_0.C[0x1875 ^ 0x1833] = 0x182F ^ 0x1833;
        b_0.C[0x42AB ^ 0x4269] = 0xB5B8 ^ 0x4269;
        b_0.C[0x825 ^ 0x8FE] = 0xE39C ^ 0x8FE;
        b_0.C[0x2554 ^ 0x255B] = 0x254A ^ 0x255B;
        b_0.C[0xFEB8 ^ 0xFE1D] = 0xD7C6 ^ 0xFE1D;
        b_0.C[0x9077 ^ 0x9149] = 0x905A ^ 0x9149;
        b_0.C[0x2DDA ^ 0x2CBF] = 0x2CB6 ^ 0x2CBF;
        b_0.C[0x30CE ^ 0x3073] = 0xC1FB ^ 0x3073;
        b_0.C[0x3336 ^ 0x33CF] = 0xAEC1 ^ 0x33CF;
        b_0.C[0x60EB ^ 0x61B3] = 0x61E5 ^ 0x61B3;
        b_0.C[0x54E9 ^ 0x5581] = 0xFFFFAA4F ^ 0x5581;
        b_0.C[0x4D0A ^ 0x4DB4] = 0xBC22 ^ 0x4DB4;
        b_0.C[0x14FD ^ 0x14AE] = 0xFFFFEB02 ^ 0x14AE;
        b_0.C[0x329E ^ 0x3227] = 0xF488 ^ 0x3227;
        b_0.C[0xC7AE ^ 0xC71B] = 0x87B3 ^ 0xC71B;
    }
}

