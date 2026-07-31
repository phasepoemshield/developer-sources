/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1306
 *  net.minecraft.class_4587
 */
package kotakbaz.rain.event.events;

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
import kotakbaz.rain.event.types.a_0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1306;
import net.minecraft.class_4587;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.event.events.f
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013\u00a8\u0006\u0015"}, d2={"Lkotakbaz/rain/event/events/HandSwingEvent;", "Lkotakbaz/rain/event/types/EventCancellable;", "Lnet/minecraft/class_4587;", "matrices", "Lnet/minecraft/class_1306;", "arm", "", "swingProgress", "equipProgress", "<init>", "(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;FF)V", "Lnet/minecraft/class_4587;", "getMatrices", "()Lnet/minecraft/class_4587;", "Lnet/minecraft/class_1306;", "getArm", "()Lnet/minecraft/class_1306;", "F", "getSwingProgress", "()F", "getEquipProgress", "rain-visuals"})
public final class f_0
extends a_0 {
    @NotNull
    private final class_4587 a;
    @NotNull
    private final class_1306 A;
    private final float b;
    private final float B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    public f_0(@NotNull class_4587 class_45872, @NotNull class_1306 class_13062, float f2, float f3) {
        int n = E[0];
        n += E[1];
        Intrinsics.checkNotNullParameter(class_45872, (String)c[n += E[2]]);
        int n2 = E[3];
        n2 ^= E[4];
        Intrinsics.checkNotNullParameter(class_13062, (String)c[n2 ^= E[5]]);
        super();
        this.a = class_45872;
        this.A = class_13062;
        this.b = f2;
        this.B = f3;
    }

    @NotNull
    public final class_4587 getMatrices() {
        return this.a;
    }

    @NotNull
    public final class_1306 getArm() {
        return this.A;
    }

    public final float getSwingProgress() {
        return this.b;
    }

    public final float getEquipProgress() {
        return this.B;
    }

    static {
        f_0.b();
        long l = -757319832204331806L;
        long l2 = -1438244042758211795L;
        long l3 = 3460081103022222365L;
        long l4 = 7780577224421380332L;
        long l5 = -3172829649167924621L;
        long l6 = -7848679360102859865L;
        long l7 = 5292052951718620927L;
        long l8 = -2004333860484539966L;
        long l9 = -2872217317175665776L;
        long l10 = -8317214070297372253L;
        long l11 = -8091074244315229031L;
        long l12 = -4332072064017585975L;
        long l13 = 3002061958597395564L;
        long l14 = 631388460800197667L;
        int n = E[6];
        n -= E[7];
        c = new Object[n += E[8]];
        long l15 = l14;
        int n2 = E[9];
        n2 -= E[10];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= E[11]);
        Object[] objectArray = new Object[E[12]];
        objectArray[f_0.E[13]] = C;
        objectArray[f_0.E[14]] = E[15];
        int n3 = E[16];
        Object object = f_0.A()[E[17]];
        if (object == null) {
            char[] cArray = "\u54db\u54c7\u5735\u54fc\u54f3\u54f5\u54f0\u5494\u5463\u54f8\u54c3\u5495\u54d1\u5461\u5716\u5713\u54c7\u54f6\u54c2\u5461\u54fe\u5716\u570c\u54cc\u5494\u5710\u570c\u54fc\u54f7\u54f7\u54ed\u54f5\u54c2\u54e8\u54c8\u571b\u54c1\u5494\u54db\u54f3\u54ec\u54f2\u54f5\u570f".toCharArray();
            for (int i = E[18]; i < E[19]; ++i) {
                int n4 = cArray[i];
                n4 ^= E[20];
                n4 ^= E[21];
                n4 ^= E[22];
                n4 += E[23];
                n4 += E[24];
                n4 ^= E[25];
                n4 -= E[26];
                n4 += E[27];
                n4 -= E[28];
                n4 += E[29];
                n4 += E[30];
                cArray[i] = (char)(n4 ^= E[31]);
            }
            object = f_0.A()[f_0.E[32]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)f_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = E[33];
        n5 -= E[34];
        l5 = l16 ^ (0xF00000000L ^ l16) & -1L << (n5 += E[35]);
        long l17 = l12;
        int n6 = E[36];
        n6 -= E[37];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= E[38]);
        while (true) {
            int n7 = E[39];
            n7 ^= E[40];
            if ((int)l12 >= (int)(l5 >>> (n7 -= E[41]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = E[42];
            n9 -= E[43];
            int n10 = E[45];
            n10 -= E[46];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= E[44])) & -1L >>> (n10 -= E[47]);
            long l19 = l8;
            int n11 = E[48];
            n11 += E[49];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 ^= E[50]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = E[51];
            n13 ^= E[52];
            int n14 = E[54];
            n14 ^= E[55];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= E[53])) & -1L >>> (n14 += E[56]);
            int n15 = E[57];
            n15 ^= E[58];
            long l21 = l9;
            int n16 = E[60];
            n16 += E[61];
            l9 = l21 ^ ((long)cArray[n12] << (n15 += E[59]) ^ l21) & -1L << (n16 ^= E[62]);
            int n17 = E[63];
            n17 -= E[64];
            int n18 = E[66];
            n18 += E[67];
            long l22 = l11;
            int n19 = E[69];
            l11 = l22 ^ ((long)((int)l8 << (n17 -= E[65]) | (int)(l9 >>> (n18 += E[68]))) ^ l22) & -1L >>> (n19 -= E[70]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = E[71];
            n20 ^= E[72];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 += E[73]);
            while (true) {
                int n21 = E[74];
                n21 ^= E[75];
                if ((int)(l13 >>> (n21 -= E[76])) >= (int)l11) break;
                int n22 = E[77];
                n22 ^= E[78];
                int n23 = E[80];
                n23 ^= E[81];
                cArray2[(int)(l13 >>> (n22 += f_0.E[79]))] = cArray[(int)l12 + (int)(l13 >>> (n23 += E[82]))];
                l13 += 0x100000000L;
            }
            int n24 = E[83];
            n24 ^= E[84];
            int n25 = (int)(l14 >>> (n24 ^= E[85]));
            l14 += 0x100000000L;
            f_0.c[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = E[86];
            n26 += E[87];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 += E[88]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[E[89]];
        String string = (String)object[E[90]];
        object = object[E[91]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[92]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[93]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[95] ^ E[96]];
                byArray[f_0.E[97] ^ f_0.E[98]] = E[99] ^ E[100];
                byArray[f_0.E[101] ^ f_0.E[102]] = E[103] ^ E[104];
                byArray[f_0.E[105] ^ f_0.E[106]] = E[107] ^ E[108];
                byArray[f_0.E[109] ^ f_0.E[110]] = E[111] ^ E[112];
                byArray[f_0.E[113] ^ f_0.E[114]] = E[115] ^ E[116];
                byArray[f_0.E[117] ^ f_0.E[118]] = E[119] ^ E[120];
                byArray[f_0.E[121] ^ f_0.E[122]] = E[123] ^ E[124];
                byArray[f_0.E[125] ^ f_0.E[126]] = E[127] ^ E[128];
                byArray[f_0.E[129] ^ f_0.E[130]] = E[131] ^ E[132];
                byArray[f_0.E[133] ^ f_0.E[134]] = E[135] ^ E[136];
                byArray[f_0.E[137] ^ f_0.E[138]] = E[139] ^ E[140];
                byArray[f_0.E[141] ^ f_0.E[142]] = E[143] ^ E[144];
                byArray[f_0.E[145] ^ f_0.E[146]] = E[147] ^ E[148];
                byArray[f_0.E[149] ^ f_0.E[150]] = E[151] ^ E[152];
                byArray[f_0.E[153] ^ f_0.E[154]] = E[155] ^ E[156];
                byArray[f_0.E[157] ^ f_0.E[158]] = E[159] ^ E[160];
                objectArray2[f_0.E[94]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[161]];
            if (d == null) {
                byte[] byArray2 = new byte[E[162] ^ E[163]];
                byArray2[f_0.E[164] ^ f_0.E[165]] = E[166] ^ E[167];
                byArray2[f_0.E[168] ^ f_0.E[169]] = E[170] ^ E[171];
                byArray2[f_0.E[172] ^ f_0.E[173]] = E[174] ^ E[175];
                byArray2[f_0.E[176] ^ f_0.E[177]] = E[178] ^ E[179];
                byArray2[f_0.E[180] ^ f_0.E[181]] = E[182] ^ E[183];
                byArray2[f_0.E[184] ^ f_0.E[185]] = E[186] ^ E[187];
                byArray2[f_0.E[188] ^ f_0.E[189]] = E[190] ^ E[191];
                byArray2[f_0.E[192] ^ f_0.E[193]] = E[194] ^ E[195];
                byArray2[f_0.E[196] ^ f_0.E[197]] = E[198] ^ E[199];
                byArray2[f_0.E[200] ^ f_0.E[201]] = E[202] ^ E[203];
                byArray2[f_0.E[204] ^ f_0.E[205]] = E[206] ^ E[207];
                byArray2[f_0.E[208] ^ f_0.E[209]] = E[210] ^ E[211];
                byArray2[f_0.E[212] ^ f_0.E[213]] = E[214] ^ E[215];
                byArray2[f_0.E[216] ^ f_0.E[217]] = E[218] ^ E[219];
                byArray2[f_0.E[220] ^ f_0.E[221]] = E[222] ^ E[223];
                byArray2[f_0.E[224] ^ f_0.E[225]] = E[226] ^ E[227];
                byArray2[f_0.E[228] ^ f_0.E[229]] = E[230] ^ E[231];
                byArray2[f_0.E[232] ^ f_0.E[233]] = E[234] ^ E[235];
                byArray2[f_0.E[236] ^ f_0.E[237]] = E[238] ^ E[239];
                byArray2[f_0.E[240] ^ f_0.E[241]] = E[242] ^ E[243];
                byArray2[f_0.E[244] ^ f_0.E[245]] = E[246] ^ E[247];
                byArray2[f_0.E[248] ^ f_0.E[249]] = E[250] ^ E[251];
                byArray2[f_0.E[252] ^ f_0.E[253]] = E[254] ^ E[255];
                byArray2[f_0.E[256] ^ f_0.E[257]] = E[258] ^ E[259];
                byArray2[f_0.E[260] ^ f_0.E[261]] = E[262] ^ E[263];
                byArray2[f_0.E[264] ^ f_0.E[265]] = E[266] ^ E[267];
                byArray2[f_0.E[268] ^ f_0.E[269]] = E[270] ^ E[271];
                byArray2[f_0.E[272] ^ f_0.E[273]] = E[274] ^ E[275];
                byArray2[f_0.E[276] ^ f_0.E[277]] = E[278] ^ E[279];
                byArray2[f_0.E[280] ^ f_0.E[281]] = E[282] ^ E[283];
                byArray2[f_0.E[284] ^ f_0.E[285]] = E[286] ^ E[287];
                byArray2[f_0.E[288] ^ f_0.E[289]] = E[290] ^ E[291];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, E[292], byArray3, E[293], byArray.length);
                System.arraycopy(byArray2, E[294], byArray3, byArray.length, byArray2.length);
                Object object4 = f_0.A()[E[295]];
                if (object4 == null) {
                    char[] cArray = "\u67dc\u6bb6\u6bbd\u6bb8\u6bb2\u6be6\u67c1\u6c13\u6ba8\u6c14\u6bb4\u6c1f\u6beb\u6c15\u67c5\u6bb4\u6c0b\u6bfb".toCharArray();
                    for (int i = E[296]; i < E[297]; ++i) {
                        int n2 = cArray[i];
                        n2 += E[298];
                        n2 ^= E[299];
                        n2 -= E[300];
                        n2 ^= E[301];
                        n2 += E[302];
                        n2 += E[303];
                        n2 ^= E[304];
                        n2 ^= E[305];
                        n2 ^= E[306];
                        n2 -= E[307];
                        cArray[i] = (char)(n2 ^= E[308]);
                    }
                    object4 = f_0.A()[f_0.E[309]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[E[310]];
                byArray4[f_0.E[311]] = E[312];
                byArray4[f_0.E[313]] = E[314];
                byArray4[f_0.E[315]] = E[316];
                byArray4[f_0.E[317]] = E[318];
                byArray4[f_0.E[319]] = E[320];
                byArray4[f_0.E[321]] = E[322];
                byArray4[f_0.E[323]] = E[324];
                byArray4[f_0.E[325]] = E[326];
                byArray4[f_0.E[327]] = E[328];
                byArray4[f_0.E[329]] = E[330];
                byArray4[f_0.E[331]] = E[332];
                byArray4[f_0.E[333]] = E[334];
                byArray4[f_0.E[335]] = E[336];
                byArray4[f_0.E[337]] = E[338];
                byArray4[f_0.E[339]] = E[340];
                byArray4[f_0.E[341]] = E[342];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, E[343], E[344]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = f_0.A()[E[345]];
                if (object5 == null) {
                    char[] cArray = "\u7775\u7779\u774b".toCharArray();
                    for (int i = E[346]; i < E[347]; ++i) {
                        int n3 = cArray[i];
                        n3 += E[348];
                        n3 += E[349];
                        n3 += E[350];
                        n3 ^= E[351];
                        n3 ^= E[352];
                        n3 += E[353];
                        n3 += E[354];
                        n3 -= E[355];
                        n3 ^= E[356];
                        cArray[i] = (char)(n3 += E[357]);
                    }
                    object5 = f_0.A()[f_0.E[358]] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, E[359], E[360]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, E[361], byArray6.length);
            Object object6 = f_0.A()[E[362]];
            if (object6 == null) {
                char[] cArray = "\u92c7\u92cb\u9235\uc091\u92c5\u92c4\u92c5\uc091\u9236\u927d\u92c5\u9235\uc09b\u9236\u9267\u926a\u926a\u921f\u9210\u9219".toCharArray();
                for (int i = E[363]; i < E[364]; ++i) {
                    int n4 = cArray[i];
                    n4 ^= E[365];
                    n4 -= E[366];
                    n4 ^= E[367];
                    n4 += E[368];
                    n4 ^= E[369];
                    n4 ^= E[370];
                    n4 += E[371];
                    n4 -= E[372];
                    n4 += E[373];
                    n4 += E[374];
                    n4 -= E[375];
                    n4 ^= E[376];
                    cArray[i] = (char)(n4 -= E[377]);
                }
                object6 = f_0.A()[f_0.E[378]] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(E[379], (Key)((SecretKey)d), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = e;
        if (e == null) {
            e = new Object[E[380]];
            objectArray = e;
        }
        return objectArray;
    }

    public static void b() {
        E = new int[0x7701 ^ 0x767C];
        f_0.E[0x10CCC ^ 0x10DCE] = 0x16109 ^ 0x10DCE;
        f_0.E[0xB813 ^ 0xB856] = 0xB840 ^ 0xB856;
        f_0.E[0x6497 ^ 0x64DE] = 0x64B3 ^ 0x64DE;
        f_0.E[0xA513 ^ 0xA578] = 0xF879 ^ 0xA578;
        f_0.E[0xD52F ^ 0xD543] = 0x8873 ^ 0xD543;
        f_0.E[0xB9C1 ^ 0xB894] = 0xB893 ^ 0xB894;
        f_0.E[0xA1EB ^ 0xA191] = 0xF579 ^ 0xA191;
        f_0.E[0x15F0 ^ 0x1531] = 0xE5D6 ^ 0x1531;
        f_0.E[0x80E9 ^ 0x80EC] = 0x80E6 ^ 0x80EC;
        f_0.E[0xB6C8 ^ 0xB6CB] = 0xB698 ^ 0xB6CB;
        f_0.E[0x1B59 ^ 0x1BBC] = 0x8DBC ^ 0x1BBC;
        f_0.E[0x9D79 ^ 0x9DC8] = 0x19A2E ^ 0x9DC8;
        f_0.E[0x1051B ^ 0x1054F] = 0xFFFEFA80 ^ 0x1054F;
        f_0.E[0x2311 ^ 0x231F] = 0x231E ^ 0x231F;
        f_0.E[0xF7E9 ^ 0xF6A0] = 0xF6AD ^ 0xF6A0;
        f_0.E[0xF16F ^ 0xF071] = 0xFFFF41BC ^ 0xF071;
        f_0.E[0x136E ^ 0x1230] = 0x1918 ^ 0x1230;
        f_0.E[0x124E ^ 0x1316] = 0x1216 ^ 0x1316;
        f_0.E[0x6943 ^ 0x691B] = 0x6974 ^ 0x691B;
        f_0.E[0x228B ^ 0x23E3] = 0x23F3 ^ 0x23E3;
        f_0.E[0x1D06 ^ 0x1DDF] = 0xCFE4 ^ 0x1DDF;
        f_0.E[0xE758 ^ 0xE73E] = 0x3337 ^ 0xE73E;
        f_0.E[0xFF08 ^ 0xFE08] = 0x92DB ^ 0xFE08;
        f_0.E[0xDBC2 ^ 0xDBFB] = 0xDBB1 ^ 0xDBFB;
        f_0.E[0xBFE4 ^ 0xBE94] = 0x1D7D ^ 0xBE94;
        f_0.E[0x5EF0 ^ 0x5E38] = 0x6FA5 ^ 0x5E38;
        f_0.E[0x26BC ^ 0x27DF] = 0xF015 ^ 0x27DF;
        f_0.E[0xFE3B ^ 0xFF3F] = 0xB679 ^ 0xFF3F;
        f_0.E[0x6FE9 ^ 0x6FBE] = 0xFFFF904F ^ 0x6FBE;
        f_0.E[0x2832 ^ 0x280F] = 0x281C ^ 0x280F;
        f_0.E[0x4C42 ^ 0x4CEB] = 0x252F ^ 0x4CEB;
        f_0.E[0x5613 ^ 0x5778] = 0x5778 ^ 0x5778;
        f_0.E[0x9E04 ^ 0x9F14] = 0xEE90 ^ 0x9F14;
        f_0.E[0xD0C4 ^ 0xD00A] = 0xFFFF0E68 ^ 0xD00A;
        f_0.E[0x5F85 ^ 0x5EB2] = 0x5EB3 ^ 0x5EB2;
        f_0.E[0xF2D4 ^ 0xF2FA] = 0xF2B0 ^ 0xF2FA;
        f_0.E[0xCFC9 ^ 0xCEB5] = 0xCEB1 ^ 0xCEB5;
        f_0.E[0x1792 ^ 0x16C0] = 0xFFFFE92B ^ 0x16C0;
        f_0.E[0x34D8 ^ 0x341F] = 0x106D ^ 0x341F;
        f_0.E[0x9B53 ^ 0x9B4C] = 0x9902 ^ 0x9B4C;
        f_0.E[0x8845 ^ 0x883E] = 0xDCC2 ^ 0x883E;
        f_0.E[0xF25E ^ 0xF220] = 0x58D0 ^ 0xF220;
        f_0.E[0x3E7A ^ 0x3E66] = 0x97AE ^ 0x3E66;
        f_0.E[0xC408 ^ 0xC42F] = 0xC46B ^ 0xC42F;
        f_0.E[0xB47F ^ 0xB50D] = 0x6586 ^ 0xB50D;
        f_0.E[0x1B4B ^ 0x1B5C] = 0x2E7F ^ 0x1B5C;
        f_0.E[0xB9A5 ^ 0xB963] = 0xFFFF62D4 ^ 0xB963;
        f_0.E[0x6B9 ^ 0x7A5] = 0x499E ^ 0x7A5;
        f_0.E[0x949E ^ 0x9449] = 0x19254 ^ 0x9449;
        f_0.E[0x2F8 ^ 0x243] = 0x103DB ^ 0x243;
        f_0.E[0xF51 ^ 0xFA2] = 0x7DD ^ 0xFA2;
        f_0.E[0xB25E ^ 0xB2D6] = 0xD201 ^ 0xB2D6;
        f_0.E[0xBF0A ^ 0xBE0B] = 0xD2CC ^ 0xBE0B;
        f_0.E[0xE53E ^ 0xE47F] = 0xE47B ^ 0xE47F;
        f_0.E[0xA68E ^ 0xA791] = 0xE9B6 ^ 0xA791;
        f_0.E[0xCEAF ^ 0xCFD4] = 0xCFD6 ^ 0xCFD4;
        f_0.E[0x6B53 ^ 0x6A5B] = 0xCCE9 ^ 0x6A5B;
        f_0.E[0xC2D9 ^ 0xC24B] = 0x2364 ^ 0xC24B;
        f_0.E[0x886E ^ 0x887D] = 0x8851 ^ 0x887D;
        f_0.E[0xF78A ^ 0xF7A5] = 0xFFFF0847 ^ 0xF7A5;
        f_0.E[0xD781 ^ 0xD734] = 0x59F ^ 0xD734;
        f_0.E[0x3154 ^ 0x3069] = 0x3066 ^ 0x3069;
        f_0.E[0xA45B ^ 0xA52A] = 0x6DC0 ^ 0xA52A;
        f_0.E[0x10749 ^ 0x1061A] = 0x10619 ^ 0x1061A;
        f_0.E[0xD613 ^ 0xD633] = 0xD633 ^ 0xD633;
        f_0.E[0xFE93 ^ 0xFE32] = 0xFE32 ^ 0xFE32;
        f_0.E[0x13D5 ^ 0x138E] = 0x138E ^ 0x138E;
        f_0.E[0x753F ^ 0x7466] = 0x7464 ^ 0x7466;
        f_0.E[0x2D12 ^ 0x2C5D] = 0x2C54 ^ 0x2C5D;
        f_0.E[0xE966 ^ 0xE966] = 0xE97F ^ 0xE966;
        f_0.E[0x56DA ^ 0x57FE] = 0x57FE ^ 0x57FE;
        f_0.E[0xE133 ^ 0xE1FE] = 0xC02B ^ 0xE1FE;
        f_0.E[0x7DA8 ^ 0x7D48] = 0xE8C3 ^ 0x7D48;
        f_0.E[0x6209 ^ 0x6264] = 0x424D ^ 0x6264;
        f_0.E[0x10D96 ^ 0x10DD1] = 0x10DC5 ^ 0x10DD1;
        f_0.E[0x94CB ^ 0x94C9] = 0xFFFF6B2C ^ 0x94C9;
        f_0.E[0x9105 ^ 0x918F] = 0x6F66 ^ 0x918F;
        f_0.E[0x235 ^ 0x283] = 0xD04A ^ 0x283;
        f_0.E[0x727C ^ 0x728A] = 0xFFFFB72B ^ 0x728A;
        f_0.E[0x865F ^ 0x86D9] = 0xE60E ^ 0x86D9;
        f_0.E[0xE8C4 ^ 0xE995] = 0xE990 ^ 0xE995;
        f_0.E[0x7D9D ^ 0x7D75] = 0x52C0 ^ 0x7D75;
        f_0.E[0xF1A1 ^ 0xF0C1] = 0xF09 ^ 0xF0C1;
        f_0.E[0x26D1 ^ 0x278A] = 0x2789 ^ 0x278A;
        f_0.E[0xB86F ^ 0xB8B4] = 0x6A8F ^ 0xB8B4;
        f_0.E[0x87A0 ^ 0x8785] = 0xFFFF782B ^ 0x8785;
        f_0.E[0x108B5 ^ 0x1081D] = 0x161C4 ^ 0x1081D;
        f_0.E[0x2242 ^ 0x22A4] = 0xB4AA ^ 0x22A4;
        f_0.E[0xC5AF ^ 0xC533] = 0x8A1 ^ 0xC533;
        f_0.E[0x6CF9 ^ 0x6C41] = 0x16DC6 ^ 0x6C41;
        f_0.E[0xC3F4 ^ 0xC2A2] = 0xC2BA ^ 0xC2A2;
        f_0.E[0x2F1C ^ 0x2FCA] = 0x12999 ^ 0x2FCA;
        f_0.E[0xE77 ^ 0xF02] = 0x33DA ^ 0xF02;
        f_0.E[0xA306 ^ 0xA25B] = 0x2E09 ^ 0xA25B;
        f_0.E[0x40 ^ 0x5B] = 0x893D ^ 0x5B;
        f_0.E[0x266E ^ 0x2750] = 0xFFFFD8A3 ^ 0x2750;
        f_0.E[0x4F28 ^ 0x4E1A] = 0x3E30 ^ 0x4E1A;
        f_0.E[0xEE48 ^ 0xEE3E] = 0x9BC2 ^ 0xEE3E;
        f_0.E[0xA41D ^ 0xA509] = 0x6E7C ^ 0xA509;
        f_0.E[0xEC2C ^ 0xED1D] = 0x124A ^ 0xED1D;
        f_0.E[0x3A6 ^ 0x2DE] = 0x2440 ^ 0x2DE;
        f_0.E[0xF94C ^ 0xF965] = 0xFFFF06C6 ^ 0xF965;
        f_0.E[0xD84F ^ 0xD8FD] = 0x1DF74 ^ 0xD8FD;
        f_0.E[0xF1EA ^ 0xF188] = 0x2001 ^ 0xF188;
        f_0.E[0x88A8 ^ 0x88C2] = 0xD5F2 ^ 0x88C2;
        f_0.E[0xD982 ^ 0xD8DD] = 0xDBF5 ^ 0xD8DD;
        f_0.E[0xD3A9 ^ 0xD36C] = 0xF71E ^ 0xD36C;
        f_0.E[0x144A ^ 0x1429] = 0xC58D ^ 0x1429;
        f_0.E[0x9CD9 ^ 0x9CDE] = 0xFFFF6374 ^ 0x9CDE;
        f_0.E[0x9B23 ^ 0x9A4F] = 0x9A5B ^ 0x9A4F;
        f_0.E[0xDAD8 ^ 0xDA54] = 0x24BD ^ 0xDA54;
        f_0.E[0x436F ^ 0x4339] = 0xFFFFBCF9 ^ 0x4339;
        f_0.E[0xF3CF ^ 0xF383] = 0xF3EC ^ 0xF383;
        f_0.E[0xF735 ^ 0xF797] = 0x3078 ^ 0xF797;
        f_0.E[0x66F5 ^ 0x66CF] = 0x66D8 ^ 0x66CF;
        f_0.E[0x387B ^ 0x383A] = 0xFFFFC792 ^ 0x383A;
        f_0.E[0xACD6 ^ 0xAC2A] = 0xDBE7 ^ 0xAC2A;
        f_0.E[0xA4CB ^ 0xA432] = 0x651F ^ 0xA432;
        f_0.E[0x32CA ^ 0x32E6] = 0x32B4 ^ 0x32E6;
        f_0.E[0xAAAE ^ 0xAAA8] = 0xFFFF552E ^ 0xAAA8;
        f_0.E[0x4A40 ^ 0x4AB1] = 0x42CE ^ 0x4AB1;
        f_0.E[0xF9B6 ^ 0xF8A0] = 0x33F9 ^ 0xF8A0;
        f_0.E[0xCBB ^ 0xDFF] = 0xDFA ^ 0xDFF;
        f_0.E[0x6BF6 ^ 0x6B5C] = 0xFFFFFD2F ^ 0x6B5C;
        f_0.E[0xA389 ^ 0xA2AC] = 0xA2AC ^ 0xA2AC;
        f_0.E[0x9D40 ^ 0x9D59] = 0x5A9A ^ 0x9D59;
        f_0.E[0xFF99 ^ 0xFEB6] = 0x2332 ^ 0xFEB6;
        f_0.E[0x8794 ^ 0x8775] = 0x12E4 ^ 0x8775;
        f_0.E[0x738A ^ 0x73CC] = 0xFFFF8C3A ^ 0x73CC;
        f_0.E[0xD964 ^ 0xD904] = 0x6083 ^ 0xD904;
        f_0.E[0x10411 ^ 0x10524] = 0x10525 ^ 0x10524;
        f_0.E[0x7D61 ^ 0x7DBD] = 0x5FE9 ^ 0x7DBD;
        f_0.E[0xCE7E ^ 0xCEAB] = 0x1C8B6 ^ 0xCEAB;
        f_0.E[0x525B ^ 0x523F] = 0x83B6 ^ 0x523F;
        f_0.E[0x100A5 ^ 0x10191] = 0x1A1BE ^ 0x10191;
        f_0.E[0xFFA3 ^ 0xFFFD] = 0xFFFD ^ 0xFFFD;
        f_0.E[0x3771 ^ 0x37D2] = 0xF01D ^ 0x37D2;
        f_0.E[0x5074 ^ 0x5113] = 0x5113 ^ 0x5113;
        f_0.E[0x549D ^ 0x559B] = 0x1CC2 ^ 0x559B;
        f_0.E[0x7D34 ^ 0x7DA9] = 0xF9BA ^ 0x7DA9;
        f_0.E[0x10338 ^ 0x1034A] = 0xF51 ^ 0x1034A;
        f_0.E[0x93AB ^ 0x9367] = 0xB2BA ^ 0x9367;
        f_0.E[0x4154 ^ 0x407A] = 0x945E ^ 0x407A;
        f_0.E[0x53D7 ^ 0x5359] = 0x4C10 ^ 0x5359;
        f_0.E[0xB846 ^ 0xB94A] = 0xC406 ^ 0xB94A;
        f_0.E[0x7C05 ^ 0x7D1F] = 0xFFFFB869 ^ 0x7D1F;
        f_0.E[0x18D7 ^ 0x1991] = 0x19F0 ^ 0x1991;
        f_0.E[0xD3CA ^ 0xD382] = 0xFFFF2C25 ^ 0xD382;
        f_0.E[0xAB23 ^ 0xABAA] = 0x5544 ^ 0xABAA;
        f_0.E[0x9559 ^ 0x95A2] = 0x548F ^ 0x95A2;
        f_0.E[0x77B3 ^ 0x76D2] = 0x9E4B ^ 0x76D2;
        f_0.E[0x5455 ^ 0x54E5] = 0x15312 ^ 0x54E5;
        f_0.E[0xCC63 ^ 0xCCA3] = 0x3C44 ^ 0xCCA3;
        f_0.E[0x2AFF ^ 0x2A7C] = 0x5464 ^ 0x2A7C;
        f_0.E[0x7FD6 ^ 0x7FD2] = 0x7F8B ^ 0x7FD2;
        f_0.E[0x6ADD ^ 0x6A56] = 0x94EF ^ 0x6A56;
        f_0.E[0x23D7 ^ 0x2283] = 0x22D5 ^ 0x2283;
        f_0.E[0x342 ^ 0x3B6] = 0x3990 ^ 0x3B6;
        f_0.E[0x42D4 ^ 0x4393] = 0x4393 ^ 0x4393;
        f_0.E[0x38AF ^ 0x3812] = 0x3B61 ^ 0x3812;
        f_0.E[0x1012F ^ 0x1016B] = 0x10107 ^ 0x1016B;
        f_0.E[0x10B45 ^ 0x10B8C] = 0x13A18 ^ 0x10B8C;
        f_0.E[0x8044 ^ 0x8034] = 0xA011 ^ 0x8034;
        f_0.E[0x7B56 ^ 0x7A6C] = 0x7A3D ^ 0x7A6C;
        f_0.E[0xB1D7 ^ 0xB163] = 0x63D3 ^ 0xB163;
        f_0.E[0x2784 ^ 0x27DE] = 0x27DC ^ 0x27DE;
        f_0.E[0xFC62 ^ 0xFC07] = 0x2807 ^ 0xFC07;
        f_0.E[0x7C7F ^ 0x7CBD] = 0x8C1A ^ 0x7CBD;
        f_0.E[0x493B ^ 0x4810] = 0xB5E0 ^ 0x4810;
        f_0.E[0x718D ^ 0x71D0] = 0x71D1 ^ 0x71D0;
        f_0.E[0x10E4 ^ 0x1063] = 0x70CB ^ 0x1063;
        f_0.E[0xCEB8 ^ 0xCEFA] = 0xFFFF3104 ^ 0xCEFA;
        f_0.E[0x6E80 ^ 0x6E2E] = 0xFFFF467C ^ 0x6E2E;
        f_0.E[0x4D36 ^ 0x4DB9] = 0xFFFFAD6C ^ 0x4DB9;
        f_0.E[0x29F1 ^ 0x29C3] = 0xFFFFD616 ^ 0x29C3;
        f_0.E[0x421A ^ 0x4230] = 0x42F3 ^ 0x4230;
        f_0.E[0xC712 ^ 0xC759] = 0xFFFF3891 ^ 0xC759;
        f_0.E[0xCB6E ^ 0xCB73] = 0x7EAF ^ 0xCB73;
        f_0.E[0x927E ^ 0x935F] = 0xC74D ^ 0x935F;
        f_0.E[0xBC34 ^ 0xBC5D] = 0xE169 ^ 0xBC5D;
        f_0.E[0xF61E ^ 0xF714] = 0x518D ^ 0xF714;
        f_0.E[0x973 ^ 0x83B] = 0x811 ^ 0x83B;
        f_0.E[0x63E ^ 0x6A0] = 0x82B6 ^ 0x6A0;
        f_0.E[0xA9E9 ^ 0xA93B] = 0x1A1E9 ^ 0xA93B;
        f_0.E[0xAD82 ^ 0xACEB] = 0xACFB ^ 0xACEB;
        f_0.E[0x73A3 ^ 0x73CB] = 0xA7C2 ^ 0x73CB;
        f_0.E[0x809 ^ 0x94B] = 0xFFFFF6D9 ^ 0x94B;
        f_0.E[0x8F4 ^ 0x9A3] = 0x9B4 ^ 0x9A3;
        f_0.E[0x57F3 ^ 0x56D4] = 0x56D5 ^ 0x56D4;
        f_0.E[0xFAB5 ^ 0xFBCC] = 0xF873 ^ 0xFBCC;
        f_0.E[0x565A ^ 0x5691] = 0x6705 ^ 0x5691;
        f_0.E[0xF99C ^ 0xF8EA] = 0x60D0 ^ 0xF8EA;
        f_0.E[0x8A82 ^ 0x8ADD] = 0x334A ^ 0x8ADD;
        f_0.E[0xC048 ^ 0xC07C] = 0xFFFF3FB5 ^ 0xC07C;
        f_0.E[0x8888 ^ 0x88F5] = 0x2208 ^ 0x88F5;
        f_0.E[0xDC46 ^ 0xDD22] = 0xDA8 ^ 0xDD22;
        f_0.E[0x6746 ^ 0x67F1] = 0xB55A ^ 0x67F1;
        f_0.E[0x51DF ^ 0x50D4] = 0xF66C ^ 0x50D4;
        f_0.E[0xAA60 ^ 0xAA57] = 0xFFFF55BB ^ 0xAA57;
        f_0.E[0x109AE ^ 0x108A9] = 0x141FF ^ 0x108A9;
        f_0.E[0xBE13 ^ 0xBE7C] = 0xFFFF61AA ^ 0xBE7C;
        f_0.E[0x98B4 ^ 0x98E5] = 0x98F3 ^ 0x98E5;
        f_0.E[0x2BE0 ^ 0x2A9A] = 0x2A99 ^ 0x2A9A;
        f_0.E[0xB258 ^ 0xB239] = 0x63B3 ^ 0xB239;
        f_0.E[0xC0FB ^ 0xC07B] = 0x6A8B ^ 0xC07B;
        f_0.E[0xE2E ^ 0xEB9] = 0x5927 ^ 0xEB9;
        f_0.E[0x31AF ^ 0x30B4] = 0xA21 ^ 0x30B4;
        f_0.E[0x84D0 ^ 0x85B6] = 0x85B4 ^ 0x85B6;
        f_0.E[0xF7F6 ^ 0xF6F9] = 0x8BB1 ^ 0xF6F9;
        f_0.E[0x2A44 ^ 0x2AA0] = 0xBCB8 ^ 0x2AA0;
        f_0.E[0x42B7 ^ 0x43B2] = 0xAE4 ^ 0x43B2;
        f_0.E[0x79AA ^ 0x7946] = 0x95CB ^ 0x7946;
        f_0.E[0xB5E0 ^ 0xB4A0] = 0xFFFF4B5D ^ 0xB4A0;
        f_0.E[0x21E9 ^ 0x2164] = 0x3E22 ^ 0x2164;
        f_0.E[0x3F69 ^ 0x3FB4] = 0x1DF3 ^ 0x3FB4;
        f_0.E[0x239 ^ 0x377] = 0x31F ^ 0x377;
        f_0.E[0x2092 ^ 0x21BB] = 0x21A9 ^ 0x21BB;
        f_0.E[0x1C4A ^ 0x1D76] = 0x1D19 ^ 0x1D76;
        f_0.E[0xE2C5 ^ 0xE3FA] = 0xE3F6 ^ 0xE3FA;
        f_0.E[0x1F8D ^ 0x1F70] = 0x68BF ^ 0x1F70;
        f_0.E[0x6D85 ^ 0x6D1E] = 0xFFFF5F58 ^ 0x6D1E;
        f_0.E[0xC1EC ^ 0xC149] = 0x358F ^ 0xC149;
        f_0.E[0x2B8A ^ 0x2AA7] = 0x7685 ^ 0x2AA7;
        f_0.E[0x395B ^ 0x394E] = 0x542E ^ 0x394E;
        f_0.E[0x7DDD ^ 0x7DE2] = 0xFFFF820D ^ 0x7DE2;
        f_0.E[0xA457 ^ 0xA4F3] = 0x503E ^ 0xA4F3;
        f_0.E[0xE31A ^ 0xE380] = 0x2E12 ^ 0xE380;
        f_0.E[0xB6A1 ^ 0xB7FD] = 0x23FC ^ 0xB7FD;
        f_0.E[0xAAD1 ^ 0xAB81] = 0xFFFF5468 ^ 0xAB81;
        f_0.E[0x2DFB ^ 0x2D5C] = 0xD99A ^ 0x2D5C;
        f_0.E[0x7E77 ^ 0x7EDC] = 0x1718 ^ 0x7EDC;
        f_0.E[0x644B ^ 0x657B] = 0x441E ^ 0x657B;
        f_0.E[0x54DC ^ 0x54ED] = 0xFFFFAB07 ^ 0x54ED;
        f_0.E[0xBCDF ^ 0xBDE6] = 0xBDED ^ 0xBDE6;
        f_0.E[0xFD78 ^ 0xFD9B] = 0x680A ^ 0xFD9B;
        f_0.E[0xBB07 ^ 0xBBEA] = 0x5775 ^ 0xBBEA;
        f_0.E[0x6EE9 ^ 0x6E6B] = 0x1046 ^ 0x6E6B;
        f_0.E[0xACDA ^ 0xADEC] = 0xADFC ^ 0xADEC;
        f_0.E[0x9560 ^ 0x9535] = 0xFFFF6AC3 ^ 0x9535;
        f_0.E[0x93E1 ^ 0x93EC] = 0x93EC ^ 0x93EC;
        f_0.E[0x3685 ^ 0x3654] = 0x13EBE ^ 0x3654;
        f_0.E[0xBC7F ^ 0xBCD9] = 0x4817 ^ 0xBCD9;
        f_0.E[0x8BBF ^ 0x8BCC] = 0xFFFE7823 ^ 0x8BCC;
        f_0.E[0xF400 ^ 0xF53B] = 0xF533 ^ 0xF53B;
        f_0.E[0xCE07 ^ 0xCF16] = 0xBE9D ^ 0xCF16;
        f_0.E[0x2C7F ^ 0x2CC0] = 0x2FB3 ^ 0x2CC0;
        f_0.E[0x2505 ^ 0x243D] = 0x2430 ^ 0x243D;
        f_0.E[0x1B60 ^ 0x1B7A] = 0xD94E ^ 0x1B7A;
        f_0.E[0x70E ^ 0x66B] = 0x9404 ^ 0x66B;
        f_0.E[0x743C ^ 0x746E] = 0xFFFF8B9F ^ 0x746E;
        f_0.E[0xE430 ^ 0xE469] = 0xE468 ^ 0xE469;
        f_0.E[0x20D2 ^ 0x20C6] = 0x7266 ^ 0x20C6;
        f_0.E[0xB58A ^ 0xB50B] = 0xCB26 ^ 0xB50B;
        f_0.E[0xF6C2 ^ 0xF608] = 0xFFFF386B ^ 0xF608;
        f_0.E[0x7F1B ^ 0x7F8D] = 0x287D ^ 0x7F8D;
        f_0.E[0x3C1F ^ 0x3C3C] = 0xFFFFC3FE ^ 0x3C3C;
        f_0.E[0x60B3 ^ 0x605A] = 0x4FE1 ^ 0x605A;
        f_0.E[0x1AEC ^ 0x1AFD] = 0x1AFD ^ 0x1AFD;
        f_0.E[0x637E ^ 0x63AA] = 0x165A1 ^ 0x63AA;
        f_0.E[0xE395 ^ 0xE2B3] = 0xE2B3 ^ 0xE2B3;
        f_0.E[0x1AB5 ^ 0x1A83] = 0xFFFFE543 ^ 0x1A83;
        f_0.E[0x91D4 ^ 0x91E8] = 0xFFFF6E29 ^ 0x91E8;
        f_0.E[0xFD21 ^ 0xFDB8] = 0x3024 ^ 0xFDB8;
        f_0.E[0xE4F1 ^ 0xE4C2] = 0xFFFF1B66 ^ 0xE4C2;
        f_0.E[0xE4B6 ^ 0xE5B8] = 0xFFFF6776 ^ 0xE5B8;
        f_0.E[0xC8A0 ^ 0xC8EE] = 0xFFFF3746 ^ 0xC8EE;
        f_0.E[0x551A ^ 0x5403] = 0x6E96 ^ 0x5403;
        f_0.E[0xFE8C ^ 0xFF94] = 0xC50C ^ 0xFF94;
        f_0.E[0x9EB4 ^ 0x9FDA] = 0x6B78 ^ 0x9FDA;
        f_0.E[0x5BD8 ^ 0x5B5D] = 0x3B80 ^ 0x5B5D;
        f_0.E[0x6693 ^ 0x67E7] = 0x1B12 ^ 0x67E7;
        f_0.E[0xFF11 ^ 0xFF81] = 0xE0C8 ^ 0xFF81;
        f_0.E[0xC5BA ^ 0xC5CB] = 0x1C9DB ^ 0xC5CB;
        f_0.E[0x43F6 ^ 0x4389] = 0xE959 ^ 0x4389;
        f_0.E[0x10866 ^ 0x10876] = 0x10874 ^ 0x10876;
        f_0.E[0xEF34 ^ 0xEF0C] = 0xFFFF10F8 ^ 0xEF0C;
        f_0.E[0x30DA ^ 0x3009] = 0x138E3 ^ 0x3009;
        f_0.E[0xBD21 ^ 0xBD71] = 0xBD48 ^ 0xBD71;
        f_0.E[0x349D ^ 0x34A3] = 0xFFFFCB57 ^ 0x34A3;
        f_0.E[0x10270 ^ 0x1035C] = 0x1512D ^ 0x1035C;
        f_0.E[0x7FA9 ^ 0x7F42] = 0x50F9 ^ 0x7F42;
        f_0.E[0xED67 ^ 0xED6B] = 0xED68 ^ 0xED6B;
        f_0.E[0xFD93 ^ 0xFD64] = 0xC745 ^ 0xFD64;
        f_0.E[0xCFB1 ^ 0xCFFE] = 0xFFFF306C ^ 0xCFFE;
        f_0.E[0x3C5 ^ 0x379] = 6 ^ 0x379;
        f_0.E[0xBDEF ^ 0xBCB5] = 0xBCB5 ^ 0xBCB5;
        f_0.E[0x522C ^ 0x532F] = 0x3FE8 ^ 0x532F;
        f_0.E[0x893B ^ 0x8848] = 0x67BB ^ 0x8848;
        f_0.E[0xDBC1 ^ 0xDB0E] = 0xFADB ^ 0xDB0E;
        f_0.E[0xBC33 ^ 0xBD51] = 0xF328 ^ 0xBD51;
        f_0.E[0xC3A ^ 0xD29] = 0x7CA2 ^ 0xD29;
        f_0.E[0x10A2A ^ 0x10A23] = 0x10ACD ^ 0x10A23;
        f_0.E[0x636F ^ 0x634B] = 0xFFFF9C2E ^ 0x634B;
        f_0.E[0x9DD2 ^ 0x9CF8] = 0xD788 ^ 0x9CF8;
        f_0.E[0x6D49 ^ 0x6D61] = 0xFFFF92E6 ^ 0x6D61;
        f_0.E[0x4622 ^ 0x4761] = 0x4763 ^ 0x4761;
        f_0.E[0x31D6 ^ 0x3106] = 0x139ED ^ 0x3106;
        f_0.E[0x2BFB ^ 0x2B09] = 0x230C ^ 0x2B09;
        f_0.E[0x511C ^ 0x515F] = 0xFFFFAEE9 ^ 0x515F;
        f_0.E[0xB0D2 ^ 0xB1F0] = 0xFFFF1A13 ^ 0xB1F0;
        f_0.E[0xF2F ^ 0xE63] = 0xE12 ^ 0xE63;
        f_0.E[0xEC6C ^ 0xEC99] = 0xD6B8 ^ 0xEC99;
        f_0.E[0xCC76 ^ 0xCC4D] = 0xFFFF338E ^ 0xCC4D;
        f_0.E[0x6578 ^ 0x65CB] = 0x1622D ^ 0x65CB;
        f_0.E[0x99C1 ^ 0x99F4] = 0x9998 ^ 0x99F4;
        f_0.E[0xB20E ^ 0xB2F4] = 0xFFFF8C72 ^ 0xB2F4;
        f_0.E[0x9332 ^ 0x9372] = 0x9345 ^ 0x9372;
        f_0.E[0xD5E5 ^ 0xD5EE] = 0xD596 ^ 0xD5EE;
        f_0.E[0xE170 ^ 0xE1AE] = 0xFFFF3C16 ^ 0xE1AE;
        f_0.E[0x63E6 ^ 0x6325] = 0x93C2 ^ 0x6325;
        f_0.E[0x8B49 ^ 0x8B79] = 0x8B72 ^ 0x8B79;
        f_0.E[0x3D05 ^ 0x3DF5] = 0x358C ^ 0x3DF5;
        f_0.E[0xF3B7 ^ 0xF29F] = 0xF29F ^ 0xF29F;
        f_0.E[0xD159 ^ 0xD125] = 0x85CD ^ 0xD125;
        f_0.E[0x56E3 ^ 0x5604] = 0xC004 ^ 0x5604;
        f_0.E[0x9AE5 ^ 0x9AEA] = 0x9AEA ^ 0x9AEA;
        f_0.E[0x6A11 ^ 0x6B5A] = 0x6B50 ^ 0x6B5A;
        f_0.E[0x35C9 ^ 0x35E4] = 0x35A8 ^ 0x35E4;
        f_0.E[0xDD08 ^ 0xDD99] = 0x3CB7 ^ 0xDD99;
        f_0.E[0x8F2F ^ 0x8F73] = 0x8F72 ^ 0x8F73;
        f_0.E[0xB2FF ^ 0xB200] = 0xC5CF ^ 0xB200;
        f_0.E[0x1322 ^ 0x1345] = 0xFFFF38EA ^ 0x1345;
        f_0.E[0x101EA ^ 0x101C8] = 0xFFFEFE75 ^ 0x101C8;
        f_0.E[0x1F75 ^ 0x1FD8] = 0xC823 ^ 0x1FD8;
        f_0.E[0x62DF ^ 0x628C] = 0x6295 ^ 0x628C;
        f_0.E[0x51A8 ^ 0x514A] = 0xC4FD ^ 0x514A;
        f_0.E[0x4C76 ^ 0x4D55] = 0x1947 ^ 0x4D55;
        f_0.E[0xEC34 ^ 0xED79] = 0xED7F ^ 0xED79;
        f_0.E[0x5F19 ^ 0x5E2A] = 0x5A0 ^ 0x5E2A;
        f_0.E[0x1E28 ^ 0x1E92] = 0x11F50 ^ 0x1E92;
        f_0.E[0xDEF6 ^ 0xDFD6] = 0x8BC7 ^ 0xDFD6;
        f_0.E[0x778 ^ 0x7BC] = 0x23D9 ^ 0x7BC;
        f_0.E[0x18F9 ^ 0x18F8] = 0x18FB ^ 0x18F8;
        f_0.E[0xF095 ^ 0xF1FF] = 0xF1FC ^ 0xF1FF;
        f_0.E[0x609A ^ 0x6070] = 0xFFFFB07B ^ 0x6070;
        f_0.E[0x8D28 ^ 0x8C35] = 0xC212 ^ 0x8C35;
        f_0.E[0x2E9 ^ 0x3FC] = 0xC88C ^ 0x3FC;
        f_0.E[0xF1EC ^ 0xF1FE] = 0xF1FE ^ 0xF1FE;
        f_0.E[0xC544 ^ 0xC533] = 0xB098 ^ 0xC533;
        f_0.E[0x5E45 ^ 0x5EE5] = 0xDAF3 ^ 0x5EE5;
        f_0.E[0x7F4F ^ 0x7E22] = 0x5460 ^ 0x7E22;
        f_0.E[0xFA39 ^ 0xFAE3] = 0xFFFFD75F ^ 0xFAE3;
        f_0.E[0x7E28 ^ 0x7E96] = 0xFFFF8242 ^ 0x7E96;
        f_0.E[0xA97C ^ 0xA875] = 0xECD ^ 0xA875;
        f_0.E[0xF229 ^ 0xF324] = 0x8E6C ^ 0xF324;
        f_0.E[0xCA8A ^ 0xCA64] = 0x269B ^ 0xCA64;
        f_0.E[0x45BA ^ 0x45AC] = 0xAC8F ^ 0x45AC;
        f_0.E[0xCDE5 ^ 0xCDC4] = 0xCDDF ^ 0xCDC4;
        f_0.E[0x1FF0 ^ 0x1F1F] = 0xF380 ^ 0x1F1F;
        f_0.E[0x4F3D ^ 0x4FB9] = 0x3194 ^ 0x4FB9;
        f_0.E[0x8D1E ^ 0x8D16] = 0x8D30 ^ 0x8D16;
        f_0.E[0x1B48 ^ 0x1B02] = 0xFFFFE445 ^ 0x1B02;
        f_0.E[0xBF82 ^ 0xBEED] = 0x3E4A ^ 0xBEED;
        f_0.E[0x38AC ^ 0x39E6] = 0x39A9 ^ 0x39E6;
        f_0.E[0xADF4 ^ 0xACB1] = 0xACBF ^ 0xACB1;
        f_0.E[0x6818 ^ 0x68A1] = 0x16939 ^ 0x68A1;
        f_0.E[0x8CAB ^ 0x8CB5] = 0x5679 ^ 0x8CB5;
        f_0.E[0x3CB8 ^ 0x3C9E] = 0xFFFFC309 ^ 0x3C9E;
        f_0.E[0xE311 ^ 0xE266] = 0xC6D8 ^ 0xE266;
        f_0.E[0x2662 ^ 0x26F6] = 0xC7D9 ^ 0x26F6;
        f_0.E[0x1005E ^ 0x100F1] = 0x1D70A ^ 0x100F1;
        f_0.E[0xE6E0 ^ 0xE63F] = 0xC478 ^ 0xE63F;
        f_0.E[0x811C ^ 0x8172] = 0xA157 ^ 0x8172;
        f_0.E[0x89A2 ^ 0x89D7] = 0xFC29 ^ 0x89D7;
        f_0.E[0x1BC3 ^ 0x1B5B] = 0x4CAB ^ 0x1B5B;
        f_0.E[0x13D0 ^ 0x13C8] = 0xCF5B ^ 0x13C8;
        f_0.E[0x7A15 ^ 0x7A8A] = 0xFFFF013B ^ 0x7A8A;
        f_0.E[0x208B ^ 0x2018] = 0xC16A ^ 0x2018;
        f_0.E[0x7593 ^ 0x754B] = 0xA769 ^ 0x754B;
        f_0.E[0x3304 ^ 0x330E] = 0x3358 ^ 0x330E;
        f_0.E[0xC4A ^ 0xCE6] = 0xDB03 ^ 0xCE6;
        f_0.E[0x101AC ^ 0x10187] = 0x101F7 ^ 0x10187;
        f_0.E[0x5FCF ^ 0x5EDD] = 0xFFFFD0C8 ^ 0x5EDD;
        f_0.E[0x19BF ^ 0x18A8] = 0xD3D8 ^ 0x18A8;
        f_0.E[0x27AB ^ 0x27E6] = 0xFFFFD8C0 ^ 0x27E6;
        f_0.E[0x676A ^ 0x6712] = 0x12EE ^ 0x6712;
        f_0.E[0x254E ^ 0x25B6] = 0xE48E ^ 0x25B6;
        f_0.E[0xDFB3 ^ 0xDFC7] = 0x1D3DC ^ 0xDFC7;
        f_0.E[0xB994 ^ 0xB901] = 0xEEF7 ^ 0xB901;
        f_0.E[0x20A5 ^ 0x20DC] = 0x743C ^ 0x20DC;
        f_0.E[0x410D ^ 0x41F3] = 0xFFFFC9A8 ^ 0x41F3;
    }
}

