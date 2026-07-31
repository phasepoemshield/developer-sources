/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1657
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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.class_1657;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from kotakbaz.rain.event.events.b
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u000eH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u00020\u0011H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007\u00a8\u0006\u0016"}, d2={"Lkotakbaz/rain/event/events/TotemPopEvent;", "", "Lnet/minecraft/class_1657;", "player", "<init>", "(Lnet/minecraft/class_1657;)V", "component1", "()Lnet/minecraft/class_1657;", "copy", "(Lnet/minecraft/class_1657;)Lkotakbaz/rain/event/events/TotemPopEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_1657;", "getPlayer", "rain-visuals"})
public final class b_0 {
    @NotNull
    private final class_1657 a;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    public b_0(@NotNull class_1657 class_16572) {
        int n = d[0];
        n -= d[1];
        Intrinsics.checkNotNullParameter(class_16572, (String)A[n += d[2]]);
        super();
        this.a = class_16572;
    }

    @NotNull
    public final class_1657 getPlayer() {
        return this.a;
    }

    @NotNull
    public final class_1657 component1() {
        return this.a;
    }

    @NotNull
    public final b_0 copy(@NotNull class_1657 class_16572) {
        int n = d[3];
        n -= d[4];
        Intrinsics.checkNotNullParameter(class_16572, (String)A[n -= d[5]]);
        return new b_0(class_16572);
    }

    public static /* synthetic */ b_0 copy$default(b_0 b_02, class_1657 class_16572, int n, Object object) {
        int n2 = d[6];
        n2 += d[7];
        if ((n & (n2 += d[8])) != 0) {
            class_16572 = b_02.a;
        }
        return b_02.copy(class_16572);
    }

    @NotNull
    public String toString() {
        class_1657 class_16572 = this.a;
        int n = d[9];
        n -= d[10];
        n -= d[11];
        int n2 = d[12];
        n2 ^= d[13];
        int n3 = d[15];
        n3 ^= d[16];
        int n4 = d[18];
        n4 -= d[19];
        return (String)A[n] + (String)A[n2 ^= d[14]] + (String)A[n3 -= d[17]] + class_16572 + (String)A[n4 -= d[20]];
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            boolean bl = d[21];
            bl ^= d[22];
            return bl -= d[23];
        }
        if (!(object instanceof b_0)) {
            boolean bl = d[24];
            bl ^= d[25];
            return bl += d[26];
        }
        b_0 b_02 = (b_0)object;
        if (!Intrinsics.areEqual(this.a, b_02.a)) {
            boolean bl = d[27];
            bl += d[28];
            return bl += d[29];
        }
        boolean bl = d[30];
        bl += d[31];
        return bl += d[32];
    }

    static {
        b_0.b();
        long l = -2463489226518814703L;
        long l2 = -490339892166646763L;
        long l3 = 5612892933311361765L;
        long l4 = 9033150680434336864L;
        long l5 = 7317783563340605948L;
        long l6 = 5677285363595565474L;
        long l7 = 5543263136227700938L;
        long l8 = 6708616173294706160L;
        long l9 = 3770763466327695759L;
        long l10 = 2577020014230400321L;
        long l11 = 5825030860023209672L;
        long l12 = 8652855864249277945L;
        long l13 = 617917400023601127L;
        long l14 = -1553729187335663933L;
        int n = d[33];
        n += d[34];
        A = new Object[n ^= d[35]];
        long l15 = l14;
        int n2 = d[36];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += d[37]);
        Object[] objectArray = new Object[d[38]];
        objectArray[b_0.d[39]] = b;
        objectArray[b_0.d[40]] = d[41];
        int n3 = d[42];
        Object object = b_0.A()[d[43]];
        if (object == null) {
            char[] cArray = "\u1c72\u1b82\u1c6b\u3152\u1c8e\u1b97\u1c72\u1c77\u3155\u1c74\u1b97\u1b92\u1c8d\u1c74\u1b9c\u3150\u1c73\u1b90\u1b90\u1c2e\u1c8f\u1c71\u1c70\u1c73\u1b95\u1c7c\u1b80\u1c6b\u1b8c\u1b89\u3152\u1b82\u1b90\u1b96\u1ce1\u1c6b\u1c76\u1cef\u1c73\u1b85\u3157\u1ce5\u1c70\u1b97\u1b9c\u1ce3\u1ce1\u3150\u1b90\u1b8b\u1c2e\u314a\u1ce5\u3150\u1b95\u1c6b\u1ce5\u1ce2\u1b97\u1c7c\u1c75\u1c77\u3155\u1c74\u1ce7\u1ce2\u1ce3\u1b86\u1b95\u1c6b\u1ce5\u1b9c\u1c68\u1b80\u1b9c\u1b8b\u1c77\u1c8f\u1cef\u3155\u1b93\u1ce5\u1c6a\u3148\u1b89\u1d18\u1ce4\u1ce4".toCharArray();
            for (int i = d[44]; i < d[45]; ++i) {
                int n4 = cArray[i];
                n4 -= d[46];
                n4 -= d[47];
                n4 ^= d[48];
                n4 += d[49];
                n4 += d[50];
                n4 -= d[51];
                n4 ^= d[52];
                n4 += d[53];
                n4 ^= d[54];
                n4 -= d[55];
                n4 ^= d[56];
                n4 ^= d[57];
                cArray[i] = (char)(n4 -= d[58]);
            }
            object = b_0.A()[b_0.d[59]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)b_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = d[60];
        n5 ^= d[61];
        l5 = l16 ^ (0x2E00000000L ^ l16) & -1L << (n5 ^= d[62]);
        long l17 = l12;
        int n6 = d[63];
        n6 += d[64];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 ^= d[65]);
        while (true) {
            int n7 = d[66];
            n7 -= d[67];
            if ((int)l12 >= (int)(l5 >>> (n7 ^= d[68]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = d[69];
            n9 -= d[70];
            int n10 = d[72];
            n10 += d[73];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= d[71])) & -1L >>> (n10 += d[74]);
            long l19 = l8;
            int n11 = d[75];
            n11 ^= d[76];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 += d[77]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = d[78];
            n13 += d[79];
            int n14 = d[81];
            n14 -= d[82];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 += d[80])) & -1L >>> (n14 ^= d[83]);
            int n15 = d[84];
            n15 ^= d[85];
            long l21 = l9;
            int n16 = d[87];
            n16 -= d[88];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= d[86]) ^ l21) & -1L << (n16 -= d[89]);
            int n17 = d[90];
            n17 ^= d[91];
            n17 ^= d[92];
            int n18 = d[93];
            n18 -= d[94];
            long l22 = l11;
            int n19 = d[96];
            n19 -= d[97];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= d[95]))) ^ l22) & -1L >>> (n19 += d[98]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = d[99];
            n20 ^= d[100];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= d[101]);
            while (true) {
                int n21 = d[102];
                n21 += d[103];
                if ((int)(l13 >>> (n21 -= d[104])) >= (int)l11) break;
                int n22 = d[105];
                n22 -= d[106];
                int n23 = d[108];
                n23 ^= d[109];
                cArray2[(int)(l13 >>> (n22 ^= b_0.d[107]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= d[110]))];
                l13 += 0x100000000L;
            }
            int n24 = d[111];
            n24 -= d[112];
            int n25 = (int)(l14 >>> (n24 += d[113]));
            l14 += 0x100000000L;
            b_0.A[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = d[114];
            n26 += d[115];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= d[116]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[d[117]];
        String string = (String)object[d[118]];
        object = object[d[119]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[120]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[121]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[123] ^ d[124]];
                byArray[b_0.d[125] ^ b_0.d[126]] = d[127] ^ d[128];
                byArray[b_0.d[129] ^ b_0.d[130]] = d[131] ^ d[132];
                byArray[b_0.d[133] ^ b_0.d[134]] = d[135] ^ d[136];
                byArray[b_0.d[137] ^ b_0.d[138]] = d[139] ^ d[140];
                byArray[b_0.d[141] ^ b_0.d[142]] = d[143] ^ d[144];
                byArray[b_0.d[145] ^ b_0.d[146]] = d[147] ^ d[148];
                byArray[b_0.d[149] ^ b_0.d[150]] = d[151] ^ d[152];
                byArray[b_0.d[153] ^ b_0.d[154]] = d[155] ^ d[156];
                byArray[b_0.d[157] ^ b_0.d[158]] = d[159] ^ d[160];
                byArray[b_0.d[161] ^ b_0.d[162]] = d[163] ^ d[164];
                byArray[b_0.d[165] ^ b_0.d[166]] = d[167] ^ d[168];
                byArray[b_0.d[169] ^ b_0.d[170]] = d[171] ^ d[172];
                byArray[b_0.d[173] ^ b_0.d[174]] = d[175] ^ d[176];
                byArray[b_0.d[177] ^ b_0.d[178]] = d[179] ^ d[180];
                byArray[b_0.d[181] ^ b_0.d[182]] = d[183] ^ d[184];
                byArray[b_0.d[185] ^ b_0.d[186]] = d[187] ^ d[188];
                objectArray2[b_0.d[122]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[189]];
            if (B == null) {
                byte[] byArray2 = new byte[d[190] ^ d[191]];
                byArray2[b_0.d[192] ^ b_0.d[193]] = d[194] ^ d[195];
                byArray2[b_0.d[196] ^ b_0.d[197]] = d[198] ^ d[199];
                byArray2[b_0.d[200] ^ b_0.d[201]] = d[202] ^ d[203];
                byArray2[b_0.d[204] ^ b_0.d[205]] = d[206] ^ d[207];
                byArray2[b_0.d[208] ^ b_0.d[209]] = d[210] ^ d[211];
                byArray2[b_0.d[212] ^ b_0.d[213]] = d[214] ^ d[215];
                byArray2[b_0.d[216] ^ b_0.d[217]] = d[218] ^ d[219];
                byArray2[b_0.d[220] ^ b_0.d[221]] = d[222] ^ d[223];
                byArray2[b_0.d[224] ^ b_0.d[225]] = d[226] ^ d[227];
                byArray2[b_0.d[228] ^ b_0.d[229]] = d[230] ^ d[231];
                byArray2[b_0.d[232] ^ b_0.d[233]] = d[234] ^ d[235];
                byArray2[b_0.d[236] ^ b_0.d[237]] = d[238] ^ d[239];
                byArray2[b_0.d[240] ^ b_0.d[241]] = d[242] ^ d[243];
                byArray2[b_0.d[244] ^ b_0.d[245]] = d[246] ^ d[247];
                byArray2[b_0.d[248] ^ b_0.d[249]] = d[250] ^ d[251];
                byArray2[b_0.d[252] ^ b_0.d[253]] = d[254] ^ d[255];
                byArray2[b_0.d[256] ^ b_0.d[257]] = d[258] ^ d[259];
                byArray2[b_0.d[260] ^ b_0.d[261]] = d[262] ^ d[263];
                byArray2[b_0.d[264] ^ b_0.d[265]] = d[266] ^ d[267];
                byArray2[b_0.d[268] ^ b_0.d[269]] = d[270] ^ d[271];
                byArray2[b_0.d[272] ^ b_0.d[273]] = d[274] ^ d[275];
                byArray2[b_0.d[276] ^ b_0.d[277]] = d[278] ^ d[279];
                byArray2[b_0.d[280] ^ b_0.d[281]] = d[282] ^ d[283];
                byArray2[b_0.d[284] ^ b_0.d[285]] = d[286] ^ d[287];
                byArray2[b_0.d[288] ^ b_0.d[289]] = d[290] ^ d[291];
                byArray2[b_0.d[292] ^ b_0.d[293]] = d[294] ^ d[295];
                byArray2[b_0.d[296] ^ b_0.d[297]] = d[298] ^ d[299];
                byArray2[b_0.d[300] ^ b_0.d[301]] = d[302] ^ d[303];
                byArray2[b_0.d[304] ^ b_0.d[305]] = d[306] ^ d[307];
                byArray2[b_0.d[308] ^ b_0.d[309]] = d[310] ^ d[311];
                byArray2[b_0.d[312] ^ b_0.d[313]] = d[314] ^ d[315];
                byArray2[b_0.d[316] ^ b_0.d[317]] = d[318] ^ d[319];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, d[320], byArray3, d[321], byArray.length);
                System.arraycopy(byArray2, d[322], byArray3, byArray.length, byArray2.length);
                Object object4 = b_0.A()[d[323]];
                if (object4 == null) {
                    char[] cArray = "\u8894\u8886\u8891\u88f8\u88fa\u88f6\u888d\u8d9f\u8da8\u8d9c\u88fc\u8db3\u8da7\u8d99\u8889\u88fc\u8887\u88f7".toCharArray();
                    for (int i = d[324]; i < d[325]; ++i) {
                        int n2 = cArray[i];
                        n2 ^= d[326];
                        n2 -= d[327];
                        n2 -= d[328];
                        n2 -= d[329];
                        n2 += d[330];
                        n2 ^= d[331];
                        n2 += d[332];
                        n2 ^= d[333];
                        n2 ^= d[334];
                        cArray[i] = (char)(n2 -= d[335]);
                    }
                    object4 = b_0.A()[b_0.d[336]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[d[337]];
                byArray4[b_0.d[338]] = d[339];
                byArray4[b_0.d[340]] = d[341];
                byArray4[b_0.d[342]] = d[343];
                byArray4[b_0.d[344]] = d[345];
                byArray4[b_0.d[346]] = d[347];
                byArray4[b_0.d[348]] = d[349];
                byArray4[b_0.d[350]] = d[351];
                byArray4[b_0.d[352]] = d[353];
                byArray4[b_0.d[354]] = d[355];
                byArray4[b_0.d[356]] = d[357];
                byArray4[b_0.d[358]] = d[359];
                byArray4[b_0.d[360]] = d[361];
                byArray4[b_0.d[362]] = d[363];
                byArray4[b_0.d[364]] = d[365];
                byArray4[b_0.d[366]] = d[367];
                byArray4[b_0.d[368]] = d[369];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, d[370], d[371]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = b_0.A()[d[372]];
                if (object5 == null) {
                    char[] cArray = "\ude7e\ude7a\ude84".toCharArray();
                    for (int i = d[373]; i < d[374]; ++i) {
                        int n3 = cArray[i];
                        n3 += d[375];
                        n3 += d[376];
                        n3 ^= d[377];
                        n3 -= d[378];
                        n3 ^= d[379];
                        n3 ^= d[380];
                        n3 -= d[381];
                        n3 -= d[382];
                        n3 -= d[383];
                        n3 -= d[384];
                        n3 += d[385];
                        n3 ^= d[386];
                        cArray[i] = (char)(n3 ^= d[387]);
                    }
                    object5 = b_0.A()[b_0.d[388]] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, d[389], d[390]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, d[391], byArray6.length);
            Object object6 = b_0.A()[d[392]];
            if (object6 == null) {
                char[] cArray = "\u8867\u886b\u8895\u88d1\u8865\u8864\u8865\u88d1\u88f6\u886d\u8865\u8895\u88fb\u88f6\u8887\u888a\u888a\u888f\u8890\u8889".toCharArray();
                for (int i = d[393]; i < d[394]; ++i) {
                    int n4 = cArray[i];
                    n4 ^= d[395];
                    n4 ^= d[396];
                    n4 ^= d[397];
                    n4 ^= d[398];
                    n4 += d[399];
                    n4 += 64920;
                    n4 ^= 0xCECC;
                    n4 -= 61629;
                    n4 -= 59086;
                    n4 ^= 0x7ECF;
                    cArray[i] = (char)(n4 -= 57327);
                }
                object6 = b_0.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)B), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = C;
        if (C == null) {
            C = new Object[4];
            objectArray = C;
        }
        return objectArray;
    }

    public static void b() {
        d = new int[0x4F97 ^ 0x4E07];
        b_0.d[0x101F2 ^ 0x101D1] = 0xFFFEFE33 ^ 0x101D1;
        b_0.d[0x5B9D ^ 0x5B72] = 0x553C ^ 0x5B72;
        b_0.d[0xFF5F ^ 0xFFAB] = 0x6C37 ^ 0xFFAB;
        b_0.d[0xAA21 ^ 0xAA9F] = 0x63B6 ^ 0xAA9F;
        b_0.d[0xAF50 ^ 0xAFA2] = 0xFFFF5614 ^ 0xAFA2;
        b_0.d[0xF563 ^ 0xF45A] = 0x28A3 ^ 0xF45A;
        b_0.d[0x7E64 ^ 0x7F44] = 0xC928 ^ 0x7F44;
        b_0.d[0x1563 ^ 0x15C3] = 0xBFBA ^ 0x15C3;
        b_0.d[0xC62B ^ 0xC609] = 0xFFFF3993 ^ 0xC609;
        b_0.d[0xFB38 ^ 0xFA51] = 0xFA21 ^ 0xFA51;
        b_0.d[0x1AEC ^ 0x1BC3] = 0x222A ^ 0x1BC3;
        b_0.d[0x5B69 ^ 0x5A43] = 0xFFFF2371 ^ 0x5A43;
        b_0.d[0x93FB ^ 0x927E] = 0x927E ^ 0x927E;
        b_0.d[0xC7C1 ^ 0xC716] = 0xADB2 ^ 0xC716;
        b_0.d[0xB667 ^ 0xB737] = 0xB736 ^ 0xB737;
        b_0.d[0x8865 ^ 0x8973] = 0xFFFF9071 ^ 0x8973;
        b_0.d[0x3365 ^ 0x325A] = 0xCCC4 ^ 0x325A;
        b_0.d[0x1025C ^ 0x10318] = 0x10318 ^ 0x10318;
        b_0.d[0x5887 ^ 0x59A2] = 0xFBE5 ^ 0x59A2;
        b_0.d[0x8AE9 ^ 0x8BF0] = 0xF04E ^ 0x8BF0;
        b_0.d[0x25DC ^ 0x250A] = 0x4F8C ^ 0x250A;
        b_0.d[0x5A3C ^ 0x5A5C] = 0x5A58 ^ 0x5A5C;
        b_0.d[0x82BD ^ 0x822D] = 0x8559 ^ 0x822D;
        b_0.d[0x2EB ^ 0x287] = 0xFFFFFD2D ^ 0x287;
        b_0.d[0x76BB ^ 0x77EA] = 0x77FA ^ 0x77EA;
        b_0.d[0x8504 ^ 0x85AC] = 0x18492 ^ 0x85AC;
        b_0.d[0x22F3 ^ 0x23E1] = 0xFFFF790F ^ 0x23E1;
        b_0.d[0x10B39 ^ 0x10BC7] = 0xFFFE5FBB ^ 0x10BC7;
        b_0.d[0xD97E ^ 0xD822] = 0xD82D ^ 0xD822;
        b_0.d[0xA8FB ^ 0xA8D3] = 0xA8D2 ^ 0xA8D3;
        b_0.d[0x6A4D ^ 0x6A45] = 0xFFFF95A4 ^ 0x6A45;
        b_0.d[0x7F49 ^ 0x7E02] = 0x3AB ^ 0x7E02;
        b_0.d[0x9F7C ^ 0x9F65] = 0xFFFF60C1 ^ 0x9F65;
        b_0.d[0x266A ^ 0x2690] = 0xFFFFE01A ^ 0x2690;
        b_0.d[0x3B66 ^ 0x3BE0] = 0x13714 ^ 0x3BE0;
        b_0.d[0x2AF5 ^ 0x2A35] = 0xD5C ^ 0x2A35;
        b_0.d[0x1000E ^ 0x10035] = 0x10035 ^ 0x10035;
        b_0.d[0x7DD1 ^ 0x7C51] = 0x7E67 ^ 0x7C51;
        b_0.d[0xB6F8 ^ 0xB69D] = 0xFFFF494D ^ 0xB69D;
        b_0.d[0xC38A ^ 0xC30B] = 0xA334 ^ 0xC30B;
        b_0.d[0x4E52 ^ 0x4E09] = 0x4E0A ^ 0x4E09;
        b_0.d[0x1295 ^ 0x13C1] = 0x13C0 ^ 0x13C1;
        b_0.d[0xAEAE ^ 0xAE09] = 0x1AF29 ^ 0xAE09;
        b_0.d[0x3422 ^ 0x352B] = 0x46C2 ^ 0x352B;
        b_0.d[0xE39B ^ 0xE3D3] = 0xFFFF1C0B ^ 0xE3D3;
        b_0.d[0xC31E ^ 0xC254] = 0x1F7D ^ 0xC254;
        b_0.d[0x1015 ^ 0x108F] = 0xC6DA ^ 0x108F;
        b_0.d[0xDB31 ^ 0xDBC0] = 0xDDA7 ^ 0xDBC0;
        b_0.d[0xD3BB ^ 0xD2E1] = 0xD2E4 ^ 0xD2E1;
        b_0.d[0xF3EC ^ 0xF3BF] = 0xF3B2 ^ 0xF3BF;
        b_0.d[0x3CA6 ^ 0x3DAE] = 0x4E51 ^ 0x3DAE;
        b_0.d[0x5D6E ^ 0x5DAD] = 0x7ADB ^ 0x5DAD;
        b_0.d[0xE8DB ^ 0xE983] = 0xE984 ^ 0xE983;
        b_0.d[0xF5E ^ 0xF95] = 0x9BD0 ^ 0xF95;
        b_0.d[0x6EDC ^ 0x6EC7] = 0x6ED8 ^ 0x6EC7;
        b_0.d[0xB7A2 ^ 0xB79F] = 0xB789 ^ 0xB79F;
        b_0.d[0x10D4D ^ 0x10C2B] = 0x10C2D ^ 0x10C2B;
        b_0.d[0x9341 ^ 0x93A0] = 0xA001 ^ 0x93A0;
        b_0.d[0xEAFF ^ 0xEB71] = 0x6457 ^ 0xEB71;
        b_0.d[0x10A82 ^ 0x10A88] = 0x10AE0 ^ 0x10A88;
        b_0.d[0x8AE ^ 0x8BE] = 0xFFFFF753 ^ 0x8BE;
        b_0.d[0x10720 ^ 0x10642] = 0x1064E ^ 0x10642;
        b_0.d[0xC5CA ^ 0xC511] = 0xAA8B ^ 0xC511;
        b_0.d[0x173C ^ 0x17C0] = 0xBC23 ^ 0x17C0;
        b_0.d[0xB52 ^ 0xB7B] = 0xB7B ^ 0xB7B;
        b_0.d[0xB442 ^ 0xB404] = 0xFFFF4BE1 ^ 0xB404;
        b_0.d[0x3E55 ^ 0x3F63] = 0xA5CA ^ 0x3F63;
        b_0.d[0x2070 ^ 0x2009] = 0x2008 ^ 0x2009;
        b_0.d[0xB667 ^ 0xB713] = 0xB711 ^ 0xB713;
        b_0.d[0xC249 ^ 0xC25F] = 0xFFFF3DC0 ^ 0xC25F;
        b_0.d[0x1DAA ^ 0x1D70] = 0xFFFF8D00 ^ 0x1D70;
        b_0.d[0xBA60 ^ 0xBA0F] = 0xBAA9 ^ 0xBA0F;
        b_0.d[0x3A30 ^ 0x3AEC] = 0x2816 ^ 0x3AEC;
        b_0.d[0x3B41 ^ 0x3BAC] = 0x35E2 ^ 0x3BAC;
        b_0.d[0xBD4C ^ 0xBD12] = 0xFFFF42DF ^ 0xBD12;
        b_0.d[0x6356 ^ 0x63EB] = 0x63EB ^ 0x63EB;
        b_0.d[0xE610 ^ 0xE75C] = 0xB1E6 ^ 0xE75C;
        b_0.d[0x138 ^ 0x35] = 0xC605 ^ 0x35;
        b_0.d[0x2098 ^ 0x21A5] = 0xDF3B ^ 0x21A5;
        b_0.d[0xE921 ^ 0xE916] = 0x2E4E ^ 0xE916;
        b_0.d[0x6279 ^ 0x630A] = 0x620A ^ 0x630A;
        b_0.d[0x1086F ^ 0x10910] = 0x1E4C6 ^ 0x10910;
        b_0.d[0xE437 ^ 0xE45D] = 0xE405 ^ 0xE45D;
        b_0.d[0x2761 ^ 0x2626] = 0xB283 ^ 0x2626;
        b_0.d[0x5BBB ^ 0x5A9A] = 0xECF2 ^ 0x5A9A;
        b_0.d[0x2633 ^ 0x26DD] = 0xFFFFD72B ^ 0x26DD;
        b_0.d[0xDF7C ^ 0xDF14] = 0xFFFF20B6 ^ 0xDF14;
        b_0.d[0x8FD6 ^ 0x8FEE] = 0x82F6 ^ 0x8FEE;
        b_0.d[0x8E0E ^ 0x8F28] = 0x2D11 ^ 0x8F28;
        b_0.d[0x5682 ^ 0x562F] = 0x1553E ^ 0x562F;
        b_0.d[0x8465 ^ 0x84F2] = 0x396E ^ 0x84F2;
        b_0.d[0x4325 ^ 0x431A] = 0xFFFFBCF6 ^ 0x431A;
        b_0.d[0xD7A ^ 0xDB6] = 0xC702 ^ 0xDB6;
        b_0.d[0xD507 ^ 0xD514] = 0xFFFF2AD5 ^ 0xD514;
        b_0.d[0x5AC8 ^ 0x5A21] = 0x30B7 ^ 0x5A21;
        b_0.d[0xB834 ^ 0xB8E9] = 0xAA0A ^ 0xB8E9;
        b_0.d[0xB9A6 ^ 0xB9AA] = 0xFFFF4626 ^ 0xB9AA;
        b_0.d[0x22AC ^ 0x22B8] = 0x22E7 ^ 0x22B8;
        b_0.d[0x3E8C ^ 0x3FC9] = 0x3FDB ^ 0x3FC9;
        b_0.d[0xBD8C ^ 0xBCE7] = 0xBCEE ^ 0xBCE7;
        b_0.d[0xD6ED ^ 0xD76E] = 0x62B0 ^ 0xD76E;
        b_0.d[0x2529 ^ 0x25D6] = 0x8E2B ^ 0x25D6;
        b_0.d[0x75FF ^ 0x74B6] = 0xD430 ^ 0x74B6;
        b_0.d[0xE684 ^ 0xE7E5] = 0xE789 ^ 0xE7E5;
        b_0.d[0x49B0 ^ 0x48C8] = 0xE42D ^ 0x48C8;
        b_0.d[0x676A ^ 0x6723] = 0x6770 ^ 0x6723;
        b_0.d[0x10D2B ^ 0x10D6F] = 0x10D2B ^ 0x10D6F;
        b_0.d[0xF640 ^ 0xF72C] = 0xF72C ^ 0xF72C;
        b_0.d[0x511C ^ 0x506D] = 0x504D ^ 0x506D;
        b_0.d[0x8E50 ^ 0x8F5A] = 0xFCF0 ^ 0x8F5A;
        b_0.d[0x1C85 ^ 0x1C63] = 0x9EA5 ^ 0x1C63;
        b_0.d[0x8EFA ^ 0x8FA5] = 0x8FE3 ^ 0x8FA5;
        b_0.d[0xE74 ^ 0xE61] = 0xFFFFF195 ^ 0xE61;
        b_0.d[0xEF04 ^ 0xEE7E] = 0xFB35 ^ 0xEE7E;
        b_0.d[0xB0FF ^ 0xB198] = 0xFFFF4E4F ^ 0xB198;
        b_0.d[0x6BB3 ^ 0x6A83] = 0x8908 ^ 0x6A83;
        b_0.d[0x6200 ^ 0x6304] = 0x4F52 ^ 0x6304;
        b_0.d[0x285E ^ 0x28C5] = 0xFFFF016E ^ 0x28C5;
        b_0.d[0x96F7 ^ 0x9695] = 0xFFFF697D ^ 0x9695;
        b_0.d[0x574D ^ 0x5771] = 0xFFFFA886 ^ 0x5771;
        b_0.d[0xE938 ^ 0xE9A7] = 0x43B8 ^ 0xE9A7;
        b_0.d[0xCD82 ^ 0xCD0A] = 0x1C1FE ^ 0xCD0A;
        b_0.d[0xE66F ^ 0xE6A5] = 0xFFFF8D1A ^ 0xE6A5;
        b_0.d[0xF00C ^ 0xF046] = 0xFFFF0FB3 ^ 0xF046;
        b_0.d[0x6B72 ^ 0x6A0E] = 0x937C ^ 0x6A0E;
        b_0.d[0xC378 ^ 0xC30A] = 0xC359 ^ 0xC30A;
        b_0.d[0x1DBE ^ 0x1D6C] = 0xD01A ^ 0x1D6C;
        b_0.d[0x433A ^ 0x43F4] = 0xFFFF76A0 ^ 0x43F4;
        b_0.d[0xFEAF ^ 0xFE8A] = 0xFEF2 ^ 0xFE8A;
        b_0.d[0xCB12 ^ 0xCB0E] = 0xFFFF3488 ^ 0xCB0E;
        b_0.d[0x3EB ^ 0x2F8] = 0xA7B4 ^ 0x2F8;
        b_0.d[0x19A9 ^ 0x19B6] = 0x19F3 ^ 0x19B6;
        b_0.d[0x9A65 ^ 0x9A37] = 0x9A13 ^ 0x9A37;
        b_0.d[0x7E69 ^ 0x7E11] = 0x7E10 ^ 0x7E11;
        b_0.d[0xA091 ^ 0xA1A6] = 0x3B27 ^ 0xA1A6;
        b_0.d[0x10258 ^ 0x102C5] = 0x1A8B3 ^ 0x102C5;
        b_0.d[0xDDFE ^ 0xDC96] = 0xDC95 ^ 0xDC96;
        b_0.d[0x103F4 ^ 0x10335] = 0x12443 ^ 0x10335;
        b_0.d[0x9861 ^ 0x9817] = 0x9815 ^ 0x9817;
        b_0.d[0xAD16 ^ 0xAD17] = 0xAD73 ^ 0xAD17;
        b_0.d[0x9A0 ^ 0x8D9] = 0x1971 ^ 0x8D9;
        b_0.d[0xDD5E ^ 0xDD33] = 0xDD28 ^ 0xDD33;
        b_0.d[0x9786 ^ 0x96B7] = 0x753A ^ 0x96B7;
        b_0.d[0x6763 ^ 0x662C] = 0x1FB3 ^ 0x662C;
        b_0.d[0x7DD3 ^ 0x7D37] = 0xFF9D ^ 0x7D37;
        b_0.d[0xB03C ^ 0xB033] = 0xFFFF4FB8 ^ 0xB033;
        b_0.d[0xDE36 ^ 0xDE0C] = 0x6D12 ^ 0xDE0C;
        b_0.d[0x7146 ^ 0x7010] = 0x7018 ^ 0x7010;
        b_0.d[0xBF6 ^ 0xBAC] = 0xFFFFF423 ^ 0xBAC;
        b_0.d[0x8242 ^ 0x82FD] = 0x4BF4 ^ 0x82FD;
        b_0.d[0x1B81 ^ 0x1BFD] = 0x89F ^ 0x1BFD;
        b_0.d[0xDCC8 ^ 0xDC4B] = 0xFFFF43DB ^ 0xDC4B;
        b_0.d[0xDAF ^ 0xC86] = 0x8A2A ^ 0xC86;
        b_0.d[0x41B5 ^ 0x4106] = 0xF1F0 ^ 0x4106;
        b_0.d[0xA333 ^ 0xA26E] = 0xFFFF5DAE ^ 0xA26E;
        b_0.d[0x1103 ^ 0x11D6] = 0x7B72 ^ 0x11D6;
        b_0.d[0xE7F0 ^ 0xE679] = 0xE679 ^ 0xE679;
        b_0.d[0xEF90 ^ 0xEF34] = 0x7B29 ^ 0xEF34;
        b_0.d[0xE454 ^ 0xE506] = 0xE50F ^ 0xE506;
        b_0.d[0xEC47 ^ 0xED41] = 0xFFFF3EE6 ^ 0xED41;
        b_0.d[0x122B ^ 0x129D] = 0x34E6 ^ 0x129D;
        b_0.d[0xD849 ^ 0xD80B] = 0xD80A ^ 0xD80B;
        b_0.d[0x4805 ^ 0x48B5] = 0x14BA5 ^ 0x48B5;
        b_0.d[0xAC99 ^ 0xAC7B] = 0x9FB9 ^ 0xAC7B;
        b_0.d[0x288B ^ 0x298E] = 0x5D4 ^ 0x298E;
        b_0.d[0x129D ^ 0x1226] = 0x9A1 ^ 0x1226;
        b_0.d[0xA826 ^ 0xA813] = 0x7AC0 ^ 0xA813;
        b_0.d[0xBB26 ^ 0xBBB0] = 0x618 ^ 0xBBB0;
        b_0.d[0x4E5A ^ 0x4F60] = 0xFFFF6C65 ^ 0x4F60;
        b_0.d[0x83F2 ^ 0x838F] = 0x5295 ^ 0x838F;
        b_0.d[0x831C ^ 0x832E] = 0xCB24 ^ 0x832E;
        b_0.d[0x6E7B ^ 0x6F0E] = 0x6F0E ^ 0x6F0E;
        b_0.d[0x10E97 ^ 0x10E6E] = 0x1376F ^ 0x10E6E;
        b_0.d[0x5FD ^ 0x534] = 0x9171 ^ 0x534;
        b_0.d[0xE265 ^ 0xE3EA] = 0x1392 ^ 0xE3EA;
        b_0.d[0x66F2 ^ 0x6612] = 0x55B6 ^ 0x6612;
        b_0.d[0x60DE ^ 0x60B9] = 0x60B8 ^ 0x60B9;
        b_0.d[0x8484 ^ 0x8427] = 0x103C ^ 0x8427;
        b_0.d[0xCDBB ^ 0xCD88] = 0x6826 ^ 0xCD88;
        b_0.d[0x40A7 ^ 0x404C] = 0x2ADA ^ 0x404C;
        b_0.d[0x121E ^ 0x1358] = 0x6A98 ^ 0x1358;
        b_0.d[0x4317 ^ 0x4323] = 0x9CB2 ^ 0x4323;
        b_0.d[0x7EBA ^ 0x7FC7] = 0x47F5 ^ 0x7FC7;
        b_0.d[0xDA6B ^ 0xDA81] = 0xFFFF4FD8 ^ 0xDA81;
        b_0.d[0x1079E ^ 0x107B2] = 0x107B2 ^ 0x107B2;
        b_0.d[0x884D ^ 0x88AE] = 0xBB0F ^ 0x88AE;
        b_0.d[0x93D8 ^ 0x932D] = 0xBB ^ 0x932D;
        b_0.d[0x196E ^ 0x187F] = 0xBD33 ^ 0x187F;
        b_0.d[0xBA01 ^ 0xBA7F] = 0x6B6D ^ 0xBA7F;
        b_0.d[0xBACA ^ 0xBAC7] = 0xBAAE ^ 0xBAC7;
        b_0.d[0x2478 ^ 0x25F4] = 0xA847 ^ 0x25F4;
        b_0.d[0xA633 ^ 0xA6CB] = 0x9FC8 ^ 0xA6CB;
        b_0.d[0x2B90 ^ 0x2BE5] = 0x2BE4 ^ 0x2BE5;
        b_0.d[0xCA95 ^ 0xCBE3] = 0xCBE0 ^ 0xCBE3;
        b_0.d[0xAA81 ^ 0xAA15] = 0x8047 ^ 0xAA15;
        b_0.d[0x50A1 ^ 0x50F5] = 0x50F1 ^ 0x50F5;
        b_0.d[0x6481 ^ 0x6599] = 0x1E24 ^ 0x6599;
        b_0.d[0x1EAF ^ 0x1EF9] = 0xFFFFE160 ^ 0x1EF9;
        b_0.d[0x9848 ^ 0x98FC] = 0x2849 ^ 0x98FC;
        b_0.d[0xAC84 ^ 0xADA6] = 0xFFFFE46C ^ 0xADA6;
        b_0.d[0x4E ^ 0x97] = 0x6F0D ^ 0x97;
        b_0.d[0x9FAB ^ 0x9E2D] = 0x9E3D ^ 0x9E2D;
        b_0.d[0x9AAF ^ 0x9BF8] = 0x9B9D ^ 0x9BF8;
        b_0.d[0x42CE ^ 0x43C2] = 0x85E3 ^ 0x43C2;
        b_0.d[0xD2F5 ^ 0xD2AA] = 0xFFFF2D21 ^ 0xD2AA;
        b_0.d[0xBAA3 ^ 0xBA58] = 0x8359 ^ 0xBA58;
        b_0.d[0xB789 ^ 0xB794] = 0xB7CF ^ 0xB794;
        b_0.d[0x4601 ^ 0x471C] = 0xA7B6 ^ 0x471C;
        b_0.d[0x643 ^ 0x748] = 0x74A1 ^ 0x748;
        b_0.d[0x2468 ^ 0x24CD] = 0x125F7 ^ 0x24CD;
        b_0.d[0xC88F ^ 0xC8E9] = 0xFFFF3728 ^ 0xC8E9;
        b_0.d[0x1420 ^ 0x1426] = 0xFFFFEBC2 ^ 0x1426;
        b_0.d[0x808E ^ 0x8037] = 0x9BD8 ^ 0x8037;
        b_0.d[0x77D1 ^ 0x7719] = 0xE34F ^ 0x7719;
        b_0.d[0x3AC9 ^ 0x3BC8] = 0xDEC3 ^ 0x3BC8;
        b_0.d[0x80BB ^ 0x81A4] = 0x610E ^ 0x81A4;
        b_0.d[0x7925 ^ 0x79BB] = 0xD3C2 ^ 0x79BB;
        b_0.d[0xCC28 ^ 0xCCB4] = 0x1AE1 ^ 0xCCB4;
        b_0.d[0xE8DB ^ 0xE85C] = 0x1E4A0 ^ 0xE85C;
        b_0.d[0x6CFE ^ 0x6DCA] = 0xF756 ^ 0x6DCA;
        b_0.d[0x3126 ^ 0x3001] = 0x9246 ^ 0x3001;
        b_0.d[0xACF8 ^ 0xAD7C] = 0xAD7E ^ 0xAD7C;
        b_0.d[0xBE75 ^ 0xBF72] = 0x9328 ^ 0xBF72;
        b_0.d[0x1C11 ^ 0x1CBF] = 0x11FAF ^ 0x1CBF;
        b_0.d[0x5F8A ^ 0x5FF9] = 0xFFFFA01F ^ 0x5FF9;
        b_0.d[0x5AA6 ^ 0x5BF5] = 0xFFFFA425 ^ 0x5BF5;
        b_0.d[0x7025 ^ 0x703D] = 0x706D ^ 0x703D;
        b_0.d[0x5523 ^ 0x5478] = 0x541A ^ 0x5478;
        b_0.d[0x7FB ^ 0x762] = 0xD139 ^ 0x762;
        b_0.d[0xA0E0 ^ 0xA06B] = 0xFFFF9BC7 ^ 0xA06B;
        b_0.d[0x8824 ^ 0x88F5] = 0x45E1 ^ 0x88F5;
        b_0.d[0x9E0B ^ 0x9E8E] = 0x19278 ^ 0x9E8E;
        b_0.d[0x68E6 ^ 0x6873] = 0xD5D1 ^ 0x6873;
        b_0.d[0x833E ^ 0x83FB] = 0x84F1 ^ 0x83FB;
        b_0.d[0xB2D2 ^ 0xB2F3] = 0xB2B9 ^ 0xB2F3;
        b_0.d[0x1B5F ^ 0x1B34] = 0x1B6B ^ 0x1B34;
        b_0.d[0x7D13 ^ 0x7C3F] = 0x45CD ^ 0x7C3F;
        b_0.d[0x890 ^ 0x88A] = 0x886 ^ 0x88A;
        b_0.d[0x10A1 ^ 0x11AF] = 0xD7EF ^ 0x11AF;
        b_0.d[0x175F ^ 0x1712] = 0xFFFFE897 ^ 0x1712;
        b_0.d[0x55EB ^ 0x55A0] = 0x5569 ^ 0x55A0;
        b_0.d[0x9592 ^ 0x95C7] = 0xFFFF6A7A ^ 0x95C7;
        b_0.d[0x1747 ^ 0x1716] = 0x1747 ^ 0x1716;
        b_0.d[0x88BB ^ 0x8835] = 0x8F41 ^ 0x8835;
        b_0.d[0xF12C ^ 0xF1EB] = 0xF6E1 ^ 0xF1EB;
        b_0.d[0xB2FE ^ 0xB38C] = 0xB39B ^ 0xB38C;
        b_0.d[0xB4E5 ^ 0xB4CF] = 0xB4CD ^ 0xB4CF;
        b_0.d[0x8B2F ^ 0x8A20] = 0x4C10 ^ 0x8A20;
        b_0.d[0x3CD6 ^ 0x3C47] = 0x1612 ^ 0x3C47;
        b_0.d[0x95D5 ^ 0x95F5] = 0x9583 ^ 0x95F5;
        b_0.d[0x2913 ^ 0x29B1] = 0xBDAC ^ 0x29B1;
        b_0.d[0x80AF ^ 0x8091] = 0xFFFF7F50 ^ 0x8091;
        b_0.d[0xAEFC ^ 0xAE57] = 0xFFFFEC21 ^ 0xAE57;
        b_0.d[0xBD73 ^ 0xBC04] = 0x8FE5 ^ 0xBC04;
        b_0.d[0x7712 ^ 0x7621] = 0x95AC ^ 0x7621;
        b_0.d[0x6F95 ^ 0x6F33] = 0x16E0D ^ 0x6F33;
        b_0.d[0x4B4A ^ 0x4A7F] = 0xD0FE ^ 0x4A7F;
        b_0.d[0xBD3C ^ 0xBD1A] = 0xBD19 ^ 0xBD1A;
        b_0.d[0xC41F ^ 0xC55F] = 0xC55F ^ 0xC55F;
        b_0.d[0xDE8B ^ 0xDEC8] = 0xFFFF2155 ^ 0xDEC8;
        b_0.d[0xB61 ^ 0xB11] = 0xB4B ^ 0xB11;
        b_0.d[0xDE28 ^ 0xDE59] = 0xFFFF218D ^ 0xDE59;
        b_0.d[0x6966 ^ 0x6912] = 0x690B ^ 0x6912;
        b_0.d[0x7D72 ^ 0x7D77] = 0x7D2B ^ 0x7D77;
        b_0.d[0x255D ^ 0x2585] = 0x4A0A ^ 0x2585;
        b_0.d[0x9FB3 ^ 0x9EB0] = 0x7BBB ^ 0x9EB0;
        b_0.d[0x640F ^ 0x651F] = 0xC041 ^ 0x651F;
        b_0.d[0x337E ^ 0x3246] = 0xEEB6 ^ 0x3246;
        b_0.d[0x40 ^ 0x1CB] = 0x208A ^ 0x1CB;
        b_0.d[0xA27C ^ 0xA26B] = 0xA201 ^ 0xA26B;
        b_0.d[0x456B ^ 0x456F] = 0x4544 ^ 0x456F;
        b_0.d[0x5E3 ^ 0x4F8] = 0x7F46 ^ 0x4F8;
        b_0.d[0x431A ^ 0x4390] = 0x87D4 ^ 0x4390;
        b_0.d[0x8FCD ^ 0x8FE6] = 0x8FE6 ^ 0x8FE6;
        b_0.d[0x2A82 ^ 0x2BBE] = 0xD52E ^ 0x2BBE;
        b_0.d[0x23DA ^ 0x2318] = 0xFFFFFBF9 ^ 0x2318;
        b_0.d[0x540C ^ 0x54B9] = 0x72C4 ^ 0x54B9;
        b_0.d[0x259B ^ 0x248E] = 0xC22D ^ 0x248E;
        b_0.d[0x10A77 ^ 0x10A70] = 0x10A4C ^ 0x10A70;
        b_0.d[0xCA3B ^ 0xCA81] = 0xD16E ^ 0xCA81;
        b_0.d[0x71E7 ^ 0x70D9] = 0xFFFF71D3 ^ 0x70D9;
        b_0.d[0xDDF ^ 0xCF1] = 0x352E ^ 0xCF1;
        b_0.d[0x22D5 ^ 0x22AE] = 0x31DC ^ 0x22AE;
        b_0.d[0x4F0 ^ 0x4BF] = 0xFFFFFB47 ^ 0x4BF;
        b_0.d[0xD3F5 ^ 0xD3C3] = 0xF4 ^ 0xD3C3;
        b_0.d[0xC09D ^ 0xC00E] = 0xEA73 ^ 0xC00E;
        b_0.d[0x97AB ^ 0x96CB] = 0x96C5 ^ 0x96CB;
        b_0.d[0xD077 ^ 0xD074] = 0xD0FF ^ 0xD074;
        b_0.d[0x9CF3 ^ 0x9D74] = 0x9D64 ^ 0x9D74;
        b_0.d[0x52F6 ^ 0x5388] = 0x5F3B ^ 0x5388;
        b_0.d[0x6D59 ^ 0x6D9F] = 0x6AB9 ^ 0x6D9F;
        b_0.d[0xFD6E ^ 0xFC45] = 0x7AE9 ^ 0xFC45;
        b_0.d[0x7440 ^ 0x7421] = 0xFFFF8BED ^ 0x7421;
        b_0.d[0x5735 ^ 0x573B] = 0xFFFFA8DB ^ 0x573B;
        b_0.d[0xFE43 ^ 0xFF5F] = 0x1FFE ^ 0xFF5F;
        b_0.d[0xEB92 ^ 0xEA92] = 0xF91 ^ 0xEA92;
        b_0.d[0x2F15 ^ 0x2E9F] = 0x2E8B ^ 0x2E9F;
        b_0.d[0x10061 ^ 0x10046] = 0x10046 ^ 0x10046;
        b_0.d[0xB929 ^ 0xB918] = 0xED70 ^ 0xB918;
        b_0.d[0x9861 ^ 0x9975] = 0x7FCA ^ 0x9975;
        b_0.d[0x3554 ^ 0x35DD] = 0xF190 ^ 0x35DD;
        b_0.d[0x7311 ^ 0x7383] = 0x59D1 ^ 0x7383;
        b_0.d[0xC7FB ^ 0xC676] = 0xA7F3 ^ 0xC676;
        b_0.d[0xC7FF ^ 0xC68F] = 0xC68D ^ 0xC68F;
        b_0.d[0xC1E1 ^ 0xC188] = 0xC15F ^ 0xC188;
        b_0.d[0x3087 ^ 0x30DE] = 0x3088 ^ 0x30DE;
        b_0.d[0x8728 ^ 0x87B0] = 0x3A18 ^ 0x87B0;
        b_0.d[0x3A69 ^ 0x3A81] = 0x5000 ^ 0x3A81;
        b_0.d[0x25F1 ^ 0x25F1] = 0x2575 ^ 0x25F1;
        b_0.d[0x2EB9 ^ 0x2FDD] = 0x2FD0 ^ 0x2FDD;
        b_0.d[0x7D2A ^ 0x7DDD] = 0xEE4B ^ 0x7DDD;
        b_0.d[0x26DE ^ 0x26BD] = 0x26BE ^ 0x26BD;
        b_0.d[0x37AF ^ 0x36E1] = 0x7A1F ^ 0x36E1;
        b_0.d[0x7CF0 ^ 0x7CE2] = 0x7CC3 ^ 0x7CE2;
        b_0.d[0xDE49 ^ 0xDEAC] = 0x5C16 ^ 0xDEAC;
        b_0.d[0xA176 ^ 0xA1F6] = 0x70E4 ^ 0xA1F6;
        b_0.d[0x1D79 ^ 0x1C3B] = 0x1C3B ^ 0x1C3B;
        b_0.d[0x491E ^ 0x4992] = 0x8DD6 ^ 0x4992;
        b_0.d[0x63 ^ 0x12E] = 0x9F70 ^ 0x12E;
        b_0.d[0x1B45 ^ 0x1B47] = 0xFFFFE4A7 ^ 0x1B47;
        b_0.d[0x25F6 ^ 0x2506] = 0x236E ^ 0x2506;
        b_0.d[0x36D1 ^ 0x37CF] = 0xD762 ^ 0x37CF;
        b_0.d[0x81DE ^ 0x80FD] = 0x3695 ^ 0x80FD;
        b_0.d[0x9E7 ^ 0x86F] = 0x86C ^ 0x86F;
        b_0.d[0xAFA8 ^ 0xAFF5] = 0xFFFF508D ^ 0xAFF5;
        b_0.d[0xCFD2 ^ 0xCEE9] = 0x1210 ^ 0xCEE9;
        b_0.d[0x236F ^ 0x222E] = 0x222E ^ 0x222E;
        b_0.d[0x6B4C ^ 0x6B22] = 0xFFFF94B3 ^ 0x6B22;
        b_0.d[0xF638 ^ 0xF722] = 0x8CBB ^ 0xF722;
        b_0.d[0x35B7 ^ 0x35F0] = 0x35CF ^ 0x35F0;
        b_0.d[0x9615 ^ 0x9776] = 0x9758 ^ 0x9776;
        b_0.d[0xB5C7 ^ 0xB534] = 0xB353 ^ 0xB534;
        b_0.d[0x3AFD ^ 0x3A82] = 0xFFFF1456 ^ 0x3A82;
        b_0.d[0x27FA ^ 0x27BA] = 0xFFFFD863 ^ 0x27BA;
        b_0.d[0xA14F ^ 0xA138] = 0xA138 ^ 0xA138;
        b_0.d[0xF576 ^ 0xF54F] = 0x5CD4 ^ 0xF54F;
        b_0.d[0x8EDD ^ 0x8E6F] = 0x3EDA ^ 0x8E6F;
        b_0.d[0xDD6B ^ 0xDD9D] = 0xFFFFB1E9 ^ 0xDD9D;
        b_0.d[0x8F11 ^ 0x8F49] = 0xFFFF70C6 ^ 0x8F49;
        b_0.d[0x1334 ^ 0x13E4] = 0xDEE8 ^ 0x13E4;
        b_0.d[0x3637 ^ 0x369D] = 0x8B25 ^ 0x369D;
        b_0.d[0xB4B ^ 0xB5A] = 0xB39 ^ 0xB5A;
        b_0.d[0x8C1B ^ 0x8C94] = 0xFFFF7476 ^ 0x8C94;
        b_0.d[0x9AFD ^ 0x9A70] = 0x9D01 ^ 0x9A70;
        b_0.d[0xD9E9 ^ 0xD86B] = 0xAAD7 ^ 0xD86B;
        b_0.d[0xE5F8 ^ 0xE535] = 0x2F81 ^ 0xE535;
        b_0.d[0x237E ^ 0x2392] = 0x2DC8 ^ 0x2392;
        b_0.d[0x1B40 ^ 0x1BEC] = 0xA654 ^ 0x1BEC;
        b_0.d[0xD02C ^ 0xD0E8] = 0xD7E5 ^ 0xD0E8;
        b_0.d[0x1AE2 ^ 0x1A3D] = 0x8DE ^ 0x1A3D;
        b_0.d[0x79C5 ^ 0x796A] = 0x17A6E ^ 0x796A;
        b_0.d[0xB0D ^ 0xB43] = 0xB06 ^ 0xB43;
        b_0.d[0xB14F ^ 0xB1CB] = 0xD1FF ^ 0xB1CB;
        b_0.d[0xAE2F ^ 0xAFAE] = 0xD619 ^ 0xAFAE;
        b_0.d[0xD388 ^ 0xD3B8] = 0xF99D ^ 0xD3B8;
        b_0.d[0x5A97 ^ 0x5BF9] = 0x5BFD ^ 0x5BF9;
        b_0.d[0x9A3E ^ 0x9B60] = 0x9B6B ^ 0x9B60;
        b_0.d[0xD6F6 ^ 0xD657] = 0x4247 ^ 0xD657;
        b_0.d[0x84AB ^ 0x8586] = 0xBC6F ^ 0x8586;
        b_0.d[0x8FB0 ^ 0x8FD4] = 0xFFFF7027 ^ 0x8FD4;
        b_0.d[0xBC9A ^ 0xBC91] = 0xFFFF4370 ^ 0xBC91;
        b_0.d[0x4DD6 ^ 0x4CBB] = 0xFFFFB362 ^ 0x4CBB;
        b_0.d[0x8FA5 ^ 0x8FF2] = 0x8FF7 ^ 0x8FF2;
        b_0.d[0xA9A3 ^ 0xA987] = 0xFFFF562F ^ 0xA987;
        b_0.d[0xDB8A ^ 0xDB6D] = 0x59D7 ^ 0xDB6D;
        b_0.d[0x102D2 ^ 0x1020C] = 0xFFFEEF32 ^ 0x1020C;
        b_0.d[0xD8E9 ^ 0xD851] = 0xFE2A ^ 0xD851;
        b_0.d[0xC79E ^ 0xC7B0] = 0x5C10 ^ 0xC7B0;
        b_0.d[0x2F1 ^ 0x3D5] = 0xA188 ^ 0x3D5;
        b_0.d[0x1D1F ^ 0x1C2D] = 0xFFA5 ^ 0x1C2D;
        b_0.d[0x84DE ^ 0x8462] = 0x9F8D ^ 0x8462;
        b_0.d[0xB432 ^ 0xB4E1] = 0x79F5 ^ 0xB4E1;
        b_0.d[0x9180 ^ 0x91D0] = 0xFFFF6E14 ^ 0x91D0;
        b_0.d[0x203 ^ 0x22C] = 0xB9AC ^ 0x22C;
        b_0.d[0xC006 ^ 0xC047] = 0xFFFF3FA2 ^ 0xC047;
        b_0.d[0xAE79 ^ 0xAF13] = 0xAF19 ^ 0xAF13;
        b_0.d[0xD305 ^ 0xD30C] = 0xD347 ^ 0xD30C;
        b_0.d[0x3B58 ^ 0x3B46] = 0xFFFFC400 ^ 0x3B46;
        b_0.d[0x54DB ^ 0x549E] = 0x54BB ^ 0x549E;
        b_0.d[0x3AC0 ^ 0x3BC2] = 0xDEA9 ^ 0x3BC2;
        b_0.d[0x2C3B ^ 0x2C77] = 0x2C25 ^ 0x2C77;
        b_0.d[0xF5FE ^ 0xF4AB] = 0xF4AF ^ 0xF4AB;
        b_0.d[0x1743 ^ 0x160B] = 0x661D ^ 0x160B;
        b_0.d[0xF153 ^ 0xF19C] = 0x3B28 ^ 0xF19C;
        b_0.d[0xCE5A ^ 0xCF4D] = 0x29EE ^ 0xCF4D;
        b_0.d[0xB73C ^ 0xB7E8] = 0xDD4D ^ 0xB7E8;
        b_0.d[0x5D6D ^ 0x5D31] = 0xFFFFA2AD ^ 0x5D31;
        b_0.d[0xF001 ^ 0xF0B6] = 0xFFFF2924 ^ 0xF0B6;
        b_0.d[0xFA7E ^ 0xFA04] = 0xFA04 ^ 0xFA04;
        b_0.d[0x97BF ^ 0x96DA] = 0x96EB ^ 0x96DA;
        b_0.d[0x2BD2 ^ 0x2BFF] = 0x2BA7 ^ 0x2BFF;
        b_0.d[0xF2C6 ^ 0xF39F] = 0xF38E ^ 0xF39F;
        b_0.d[0x963 ^ 0x99E] = 0xA263 ^ 0x99E;
        b_0.d[0x6033 ^ 0x6082] = 0xD034 ^ 0x6082;
        b_0.d[0xAB78 ^ 0xAA50] = 0x2CF1 ^ 0xAA50;
        b_0.d[0xFA65 ^ 0xFACC] = 0x4778 ^ 0xFACC;
        b_0.d[0xA631 ^ 0xA74A] = 0x45C4 ^ 0xA74A;
        b_0.d[0x609B ^ 0x61F4] = 0x6197 ^ 0x61F4;
        b_0.d[0xDC84 ^ 0xDDC7] = 0xDDC6 ^ 0xDDC7;
        b_0.d[0xB9F ^ 0xB1D] = 0x6B29 ^ 0xB1D;
    }
}

