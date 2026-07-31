/*
 * Decompiled with CFR 0.152.
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
import net.minecraft.entity.player.PlayerEntity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u000eH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u00020\u0011H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007\u00a8\u0006\u0016"}, d2={"Lkotakbaz/rain/event/events/TotemPopEvent;", "", "Lnet/minecraft/class_1657;", "player", "<init>", "(Lnet/minecraft/class_1657;)V", "component1", "()Lnet/minecraft/class_1657;", "copy", "(Lnet/minecraft/class_1657;)Lkotakbaz/rain/event/events/TotemPopEvent;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_1657;", "getPlayer", "rain-visuals"})
public final class TotemPopEvent {
    @NotNull
    private final PlayerEntity a;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    public TotemPopEvent(@NotNull PlayerEntity player) {
        int n2 = d[0];
        n2 -= d[1];
        Intrinsics.checkNotNullParameter(player, (String)A[n2 += d[2]]);
        this.a = player;
    }

    @NotNull
    public final PlayerEntity getPlayer() {
        return this.a;
    }

    @NotNull
    public final PlayerEntity component1() {
        return this.a;
    }

    @NotNull
    public final TotemPopEvent copy(@NotNull PlayerEntity player) {
        int n2 = d[3];
        n2 -= d[4];
        Intrinsics.checkNotNullParameter(player, (String)A[n2 -= d[5]]);
        return new TotemPopEvent(player);
    }

    public static /* synthetic */ TotemPopEvent copy$default(TotemPopEvent totemPopEvent, PlayerEntity playerEntity, int n2, Object object) {
        int n3 = d[6];
        n3 += d[7];
        if ((n2 & (n3 += d[8])) != 0) {
            playerEntity = totemPopEvent.a;
        }
        return totemPopEvent.copy(playerEntity);
    }

    @NotNull
    public String toString() {
        PlayerEntity playerEntity = this.a;
        int n2 = d[9];
        n2 -= d[10];
        n2 -= d[11];
        int n3 = d[12];
        n3 ^= d[13];
        int n4 = d[15];
        n4 ^= d[16];
        int n5 = d[18];
        n5 -= d[19];
        return (String)A[n2] + (String)A[n3 ^= d[14]] + (String)A[n4 -= d[17]] + playerEntity + (String)A[n5 -= d[20]];
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            boolean bl = d[21];
            bl ^= d[22];
            return bl -= d[23];
        }
        if (!(other instanceof TotemPopEvent)) {
            boolean bl = d[24];
            bl ^= d[25];
            return bl += d[26];
        }
        TotemPopEvent totemPopEvent = (TotemPopEvent)other;
        if (!Intrinsics.areEqual(this.a, totemPopEvent.a)) {
            boolean bl = d[27];
            bl += d[28];
            return bl += d[29];
        }
        boolean bl = d[30];
        bl += d[31];
        return bl += d[32];
    }

    static {
        TotemPopEvent.b();
        long l2 = -2463489226518814703L;
        long l3 = -490339892166646763L;
        long l4 = 5612892933311361765L;
        long l5 = 9033150680434336864L;
        long l6 = 7317783563340605948L;
        long l7 = 5677285363595565474L;
        long l8 = 5543263136227700938L;
        long l9 = 6708616173294706160L;
        long l10 = 3770763466327695759L;
        long l11 = 2577020014230400321L;
        long l12 = 5825030860023209672L;
        long l13 = 8652855864249277945L;
        long l14 = 617917400023601127L;
        long l15 = -1553729187335663933L;
        int n2 = d[33];
        n2 += d[34];
        A = new Object[n2 ^= d[35]];
        long l16 = l15;
        int n3 = d[36];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += d[37]);
        Object[] objectArray = new Object[d[38]];
        objectArray[TotemPopEvent.d[39]] = b;
        objectArray[TotemPopEvent.d[40]] = d[41];
        int n4 = d[42];
        Object object = TotemPopEvent.A()[d[43]];
        if (object == null) {
            char[] cArray = "\u1c72\u1b82\u1c6b\u3152\u1c8e\u1b97\u1c72\u1c77\u3155\u1c74\u1b97\u1b92\u1c8d\u1c74\u1b9c\u3150\u1c73\u1b90\u1b90\u1c2e\u1c8f\u1c71\u1c70\u1c73\u1b95\u1c7c\u1b80\u1c6b\u1b8c\u1b89\u3152\u1b82\u1b90\u1b96\u1ce1\u1c6b\u1c76\u1cef\u1c73\u1b85\u3157\u1ce5\u1c70\u1b97\u1b9c\u1ce3\u1ce1\u3150\u1b90\u1b8b\u1c2e\u314a\u1ce5\u3150\u1b95\u1c6b\u1ce5\u1ce2\u1b97\u1c7c\u1c75\u1c77\u3155\u1c74\u1ce7\u1ce2\u1ce3\u1b86\u1b95\u1c6b\u1ce5\u1b9c\u1c68\u1b80\u1b9c\u1b8b\u1c77\u1c8f\u1cef\u3155\u1b93\u1ce5\u1c6a\u3148\u1b89\u1d18\u1ce4\u1ce4".toCharArray();
            for (int i2 = d[44]; i2 < d[45]; ++i2) {
                int n5 = cArray[i2];
                n5 -= d[46];
                n5 -= d[47];
                n5 ^= d[48];
                n5 += d[49];
                n5 += d[50];
                n5 -= d[51];
                n5 ^= d[52];
                n5 += d[53];
                n5 ^= d[54];
                n5 -= d[55];
                n5 ^= d[56];
                n5 ^= d[57];
                cArray[i2] = (char)(n5 -= d[58]);
            }
            object = TotemPopEvent.A()[TotemPopEvent.d[59]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)TotemPopEvent.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = d[60];
        n6 ^= d[61];
        l6 = l17 ^ (0x2E00000000L ^ l17) & -1L << (n6 ^= d[62]);
        long l18 = l13;
        int n7 = d[63];
        n7 += d[64];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= d[65]);
        while (true) {
            int n8 = d[66];
            n8 -= d[67];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= d[68]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = d[69];
            n10 -= d[70];
            int n11 = d[72];
            n11 += d[73];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= d[71])) & -1L >>> (n11 += d[74]);
            long l20 = l9;
            int n12 = d[75];
            n12 ^= d[76];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += d[77]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = d[78];
            n14 += d[79];
            int n15 = d[81];
            n15 -= d[82];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += d[80])) & -1L >>> (n15 ^= d[83]);
            int n16 = d[84];
            n16 ^= d[85];
            long l22 = l10;
            int n17 = d[87];
            n17 -= d[88];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= d[86]) ^ l22) & -1L << (n17 -= d[89]);
            int n18 = d[90];
            n18 ^= d[91];
            n18 ^= d[92];
            int n19 = d[93];
            n19 -= d[94];
            long l23 = l12;
            int n20 = d[96];
            n20 -= d[97];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= d[95]))) ^ l23) & -1L >>> (n20 += d[98]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = d[99];
            n21 ^= d[100];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= d[101]);
            while (true) {
                int n22 = d[102];
                n22 += d[103];
                if ((int)(l14 >>> (n22 -= d[104])) >= (int)l12) break;
                int n23 = d[105];
                n23 -= d[106];
                int n24 = d[108];
                n24 ^= d[109];
                cArray2[(int)(l14 >>> (n23 ^= TotemPopEvent.d[107]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= d[110]))];
                l14 += 0x100000000L;
            }
            int n25 = d[111];
            n25 -= d[112];
            int n26 = (int)(l15 >>> (n25 += d[113]));
            l15 += 0x100000000L;
            TotemPopEvent.A[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = d[114];
            n27 += d[115];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= d[116]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[d[117]];
        String string = (String)object[d[118]];
        object = object[d[119]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[120]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[121]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[123] ^ d[124]];
                byArray[TotemPopEvent.d[125] ^ TotemPopEvent.d[126]] = d[127] ^ d[128];
                byArray[TotemPopEvent.d[129] ^ TotemPopEvent.d[130]] = d[131] ^ d[132];
                byArray[TotemPopEvent.d[133] ^ TotemPopEvent.d[134]] = d[135] ^ d[136];
                byArray[TotemPopEvent.d[137] ^ TotemPopEvent.d[138]] = d[139] ^ d[140];
                byArray[TotemPopEvent.d[141] ^ TotemPopEvent.d[142]] = d[143] ^ d[144];
                byArray[TotemPopEvent.d[145] ^ TotemPopEvent.d[146]] = d[147] ^ d[148];
                byArray[TotemPopEvent.d[149] ^ TotemPopEvent.d[150]] = d[151] ^ d[152];
                byArray[TotemPopEvent.d[153] ^ TotemPopEvent.d[154]] = d[155] ^ d[156];
                byArray[TotemPopEvent.d[157] ^ TotemPopEvent.d[158]] = d[159] ^ d[160];
                byArray[TotemPopEvent.d[161] ^ TotemPopEvent.d[162]] = d[163] ^ d[164];
                byArray[TotemPopEvent.d[165] ^ TotemPopEvent.d[166]] = d[167] ^ d[168];
                byArray[TotemPopEvent.d[169] ^ TotemPopEvent.d[170]] = d[171] ^ d[172];
                byArray[TotemPopEvent.d[173] ^ TotemPopEvent.d[174]] = d[175] ^ d[176];
                byArray[TotemPopEvent.d[177] ^ TotemPopEvent.d[178]] = d[179] ^ d[180];
                byArray[TotemPopEvent.d[181] ^ TotemPopEvent.d[182]] = d[183] ^ d[184];
                byArray[TotemPopEvent.d[185] ^ TotemPopEvent.d[186]] = d[187] ^ d[188];
                objectArray2[TotemPopEvent.d[122]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[189]];
            if (B == null) {
                byte[] byArray2 = new byte[d[190] ^ d[191]];
                byArray2[TotemPopEvent.d[192] ^ TotemPopEvent.d[193]] = d[194] ^ d[195];
                byArray2[TotemPopEvent.d[196] ^ TotemPopEvent.d[197]] = d[198] ^ d[199];
                byArray2[TotemPopEvent.d[200] ^ TotemPopEvent.d[201]] = d[202] ^ d[203];
                byArray2[TotemPopEvent.d[204] ^ TotemPopEvent.d[205]] = d[206] ^ d[207];
                byArray2[TotemPopEvent.d[208] ^ TotemPopEvent.d[209]] = d[210] ^ d[211];
                byArray2[TotemPopEvent.d[212] ^ TotemPopEvent.d[213]] = d[214] ^ d[215];
                byArray2[TotemPopEvent.d[216] ^ TotemPopEvent.d[217]] = d[218] ^ d[219];
                byArray2[TotemPopEvent.d[220] ^ TotemPopEvent.d[221]] = d[222] ^ d[223];
                byArray2[TotemPopEvent.d[224] ^ TotemPopEvent.d[225]] = d[226] ^ d[227];
                byArray2[TotemPopEvent.d[228] ^ TotemPopEvent.d[229]] = d[230] ^ d[231];
                byArray2[TotemPopEvent.d[232] ^ TotemPopEvent.d[233]] = d[234] ^ d[235];
                byArray2[TotemPopEvent.d[236] ^ TotemPopEvent.d[237]] = d[238] ^ d[239];
                byArray2[TotemPopEvent.d[240] ^ TotemPopEvent.d[241]] = d[242] ^ d[243];
                byArray2[TotemPopEvent.d[244] ^ TotemPopEvent.d[245]] = d[246] ^ d[247];
                byArray2[TotemPopEvent.d[248] ^ TotemPopEvent.d[249]] = d[250] ^ d[251];
                byArray2[TotemPopEvent.d[252] ^ TotemPopEvent.d[253]] = d[254] ^ d[255];
                byArray2[TotemPopEvent.d[256] ^ TotemPopEvent.d[257]] = d[258] ^ d[259];
                byArray2[TotemPopEvent.d[260] ^ TotemPopEvent.d[261]] = d[262] ^ d[263];
                byArray2[TotemPopEvent.d[264] ^ TotemPopEvent.d[265]] = d[266] ^ d[267];
                byArray2[TotemPopEvent.d[268] ^ TotemPopEvent.d[269]] = d[270] ^ d[271];
                byArray2[TotemPopEvent.d[272] ^ TotemPopEvent.d[273]] = d[274] ^ d[275];
                byArray2[TotemPopEvent.d[276] ^ TotemPopEvent.d[277]] = d[278] ^ d[279];
                byArray2[TotemPopEvent.d[280] ^ TotemPopEvent.d[281]] = d[282] ^ d[283];
                byArray2[TotemPopEvent.d[284] ^ TotemPopEvent.d[285]] = d[286] ^ d[287];
                byArray2[TotemPopEvent.d[288] ^ TotemPopEvent.d[289]] = d[290] ^ d[291];
                byArray2[TotemPopEvent.d[292] ^ TotemPopEvent.d[293]] = d[294] ^ d[295];
                byArray2[TotemPopEvent.d[296] ^ TotemPopEvent.d[297]] = d[298] ^ d[299];
                byArray2[TotemPopEvent.d[300] ^ TotemPopEvent.d[301]] = d[302] ^ d[303];
                byArray2[TotemPopEvent.d[304] ^ TotemPopEvent.d[305]] = d[306] ^ d[307];
                byArray2[TotemPopEvent.d[308] ^ TotemPopEvent.d[309]] = d[310] ^ d[311];
                byArray2[TotemPopEvent.d[312] ^ TotemPopEvent.d[313]] = d[314] ^ d[315];
                byArray2[TotemPopEvent.d[316] ^ TotemPopEvent.d[317]] = d[318] ^ d[319];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, d[320], byArray3, d[321], byArray.length);
                System.arraycopy(byArray2, d[322], byArray3, byArray.length, byArray2.length);
                Object object4 = TotemPopEvent.A()[d[323]];
                if (object4 == null) {
                    char[] cArray = "\u8894\u8886\u8891\u88f8\u88fa\u88f6\u888d\u8d9f\u8da8\u8d9c\u88fc\u8db3\u8da7\u8d99\u8889\u88fc\u8887\u88f7".toCharArray();
                    for (int i2 = d[324]; i2 < d[325]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= d[326];
                        n3 -= d[327];
                        n3 -= d[328];
                        n3 -= d[329];
                        n3 += d[330];
                        n3 ^= d[331];
                        n3 += d[332];
                        n3 ^= d[333];
                        n3 ^= d[334];
                        cArray[i2] = (char)(n3 -= d[335]);
                    }
                    object4 = TotemPopEvent.A()[TotemPopEvent.d[336]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[d[337]];
                byArray4[TotemPopEvent.d[338]] = d[339];
                byArray4[TotemPopEvent.d[340]] = d[341];
                byArray4[TotemPopEvent.d[342]] = d[343];
                byArray4[TotemPopEvent.d[344]] = d[345];
                byArray4[TotemPopEvent.d[346]] = d[347];
                byArray4[TotemPopEvent.d[348]] = d[349];
                byArray4[TotemPopEvent.d[350]] = d[351];
                byArray4[TotemPopEvent.d[352]] = d[353];
                byArray4[TotemPopEvent.d[354]] = d[355];
                byArray4[TotemPopEvent.d[356]] = d[357];
                byArray4[TotemPopEvent.d[358]] = d[359];
                byArray4[TotemPopEvent.d[360]] = d[361];
                byArray4[TotemPopEvent.d[362]] = d[363];
                byArray4[TotemPopEvent.d[364]] = d[365];
                byArray4[TotemPopEvent.d[366]] = d[367];
                byArray4[TotemPopEvent.d[368]] = d[369];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, d[370], d[371]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = TotemPopEvent.A()[d[372]];
                if (object5 == null) {
                    char[] cArray = "\ude7e\ude7a\ude84".toCharArray();
                    for (int i3 = d[373]; i3 < d[374]; ++i3) {
                        int n4 = cArray[i3];
                        n4 += d[375];
                        n4 += d[376];
                        n4 ^= d[377];
                        n4 -= d[378];
                        n4 ^= d[379];
                        n4 ^= d[380];
                        n4 -= d[381];
                        n4 -= d[382];
                        n4 -= d[383];
                        n4 -= d[384];
                        n4 += d[385];
                        n4 ^= d[386];
                        cArray[i3] = (char)(n4 ^= d[387]);
                    }
                    object5 = TotemPopEvent.A()[TotemPopEvent.d[388]] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, d[389], d[390]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, d[391], byArray6.length);
            Object object6 = TotemPopEvent.A()[d[392]];
            if (object6 == null) {
                char[] cArray = "\u8867\u886b\u8895\u88d1\u8865\u8864\u8865\u88d1\u88f6\u886d\u8865\u8895\u88fb\u88f6\u8887\u888a\u888a\u888f\u8890\u8889".toCharArray();
                for (int i4 = d[393]; i4 < d[394]; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= d[395];
                    n5 ^= d[396];
                    n5 ^= d[397];
                    n5 ^= d[398];
                    n5 += d[399];
                    n5 += 64920;
                    n5 ^= 0xCECC;
                    n5 -= 61629;
                    n5 -= 59086;
                    n5 ^= 0x7ECF;
                    cArray[i4] = (char)(n5 -= 57327);
                }
                object6 = TotemPopEvent.A()[3] = new String(cArray);
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
        TotemPopEvent.d[0x101F2 ^ 0x101D1] = 0xFFFEFE33 ^ 0x101D1;
        TotemPopEvent.d[0x5B9D ^ 0x5B72] = 0x553C ^ 0x5B72;
        TotemPopEvent.d[0xFF5F ^ 0xFFAB] = 0x6C37 ^ 0xFFAB;
        TotemPopEvent.d[0xAA21 ^ 0xAA9F] = 0x63B6 ^ 0xAA9F;
        TotemPopEvent.d[0xAF50 ^ 0xAFA2] = 0xFFFF5614 ^ 0xAFA2;
        TotemPopEvent.d[0xF563 ^ 0xF45A] = 0x28A3 ^ 0xF45A;
        TotemPopEvent.d[0x7E64 ^ 0x7F44] = 0xC928 ^ 0x7F44;
        TotemPopEvent.d[0x1563 ^ 0x15C3] = 0xBFBA ^ 0x15C3;
        TotemPopEvent.d[0xC62B ^ 0xC609] = 0xFFFF3993 ^ 0xC609;
        TotemPopEvent.d[0xFB38 ^ 0xFA51] = 0xFA21 ^ 0xFA51;
        TotemPopEvent.d[0x1AEC ^ 0x1BC3] = 0x222A ^ 0x1BC3;
        TotemPopEvent.d[0x5B69 ^ 0x5A43] = 0xFFFF2371 ^ 0x5A43;
        TotemPopEvent.d[0x93FB ^ 0x927E] = 0x927E ^ 0x927E;
        TotemPopEvent.d[0xC7C1 ^ 0xC716] = 0xADB2 ^ 0xC716;
        TotemPopEvent.d[0xB667 ^ 0xB737] = 0xB736 ^ 0xB737;
        TotemPopEvent.d[0x8865 ^ 0x8973] = 0xFFFF9071 ^ 0x8973;
        TotemPopEvent.d[0x3365 ^ 0x325A] = 0xCCC4 ^ 0x325A;
        TotemPopEvent.d[0x1025C ^ 0x10318] = 0x10318 ^ 0x10318;
        TotemPopEvent.d[0x5887 ^ 0x59A2] = 0xFBE5 ^ 0x59A2;
        TotemPopEvent.d[0x8AE9 ^ 0x8BF0] = 0xF04E ^ 0x8BF0;
        TotemPopEvent.d[0x25DC ^ 0x250A] = 0x4F8C ^ 0x250A;
        TotemPopEvent.d[0x5A3C ^ 0x5A5C] = 0x5A58 ^ 0x5A5C;
        TotemPopEvent.d[0x82BD ^ 0x822D] = 0x8559 ^ 0x822D;
        TotemPopEvent.d[0x2EB ^ 0x287] = 0xFFFFFD2D ^ 0x287;
        TotemPopEvent.d[0x76BB ^ 0x77EA] = 0x77FA ^ 0x77EA;
        TotemPopEvent.d[0x8504 ^ 0x85AC] = 0x18492 ^ 0x85AC;
        TotemPopEvent.d[0x22F3 ^ 0x23E1] = 0xFFFF790F ^ 0x23E1;
        TotemPopEvent.d[0x10B39 ^ 0x10BC7] = 0xFFFE5FBB ^ 0x10BC7;
        TotemPopEvent.d[0xD97E ^ 0xD822] = 0xD82D ^ 0xD822;
        TotemPopEvent.d[0xA8FB ^ 0xA8D3] = 0xA8D2 ^ 0xA8D3;
        TotemPopEvent.d[0x6A4D ^ 0x6A45] = 0xFFFF95A4 ^ 0x6A45;
        TotemPopEvent.d[0x7F49 ^ 0x7E02] = 0x3AB ^ 0x7E02;
        TotemPopEvent.d[0x9F7C ^ 0x9F65] = 0xFFFF60C1 ^ 0x9F65;
        TotemPopEvent.d[0x266A ^ 0x2690] = 0xFFFFE01A ^ 0x2690;
        TotemPopEvent.d[0x3B66 ^ 0x3BE0] = 0x13714 ^ 0x3BE0;
        TotemPopEvent.d[0x2AF5 ^ 0x2A35] = 0xD5C ^ 0x2A35;
        TotemPopEvent.d[0x1000E ^ 0x10035] = 0x10035 ^ 0x10035;
        TotemPopEvent.d[0x7DD1 ^ 0x7C51] = 0x7E67 ^ 0x7C51;
        TotemPopEvent.d[0xB6F8 ^ 0xB69D] = 0xFFFF494D ^ 0xB69D;
        TotemPopEvent.d[0xC38A ^ 0xC30B] = 0xA334 ^ 0xC30B;
        TotemPopEvent.d[0x4E52 ^ 0x4E09] = 0x4E0A ^ 0x4E09;
        TotemPopEvent.d[0x1295 ^ 0x13C1] = 0x13C0 ^ 0x13C1;
        TotemPopEvent.d[0xAEAE ^ 0xAE09] = 0x1AF29 ^ 0xAE09;
        TotemPopEvent.d[0x3422 ^ 0x352B] = 0x46C2 ^ 0x352B;
        TotemPopEvent.d[0xE39B ^ 0xE3D3] = 0xFFFF1C0B ^ 0xE3D3;
        TotemPopEvent.d[0xC31E ^ 0xC254] = 0x1F7D ^ 0xC254;
        TotemPopEvent.d[0x1015 ^ 0x108F] = 0xC6DA ^ 0x108F;
        TotemPopEvent.d[0xDB31 ^ 0xDBC0] = 0xDDA7 ^ 0xDBC0;
        TotemPopEvent.d[0xD3BB ^ 0xD2E1] = 0xD2E4 ^ 0xD2E1;
        TotemPopEvent.d[0xF3EC ^ 0xF3BF] = 0xF3B2 ^ 0xF3BF;
        TotemPopEvent.d[0x3CA6 ^ 0x3DAE] = 0x4E51 ^ 0x3DAE;
        TotemPopEvent.d[0x5D6E ^ 0x5DAD] = 0x7ADB ^ 0x5DAD;
        TotemPopEvent.d[0xE8DB ^ 0xE983] = 0xE984 ^ 0xE983;
        TotemPopEvent.d[0xF5E ^ 0xF95] = 0x9BD0 ^ 0xF95;
        TotemPopEvent.d[0x6EDC ^ 0x6EC7] = 0x6ED8 ^ 0x6EC7;
        TotemPopEvent.d[0xB7A2 ^ 0xB79F] = 0xB789 ^ 0xB79F;
        TotemPopEvent.d[0x10D4D ^ 0x10C2B] = 0x10C2D ^ 0x10C2B;
        TotemPopEvent.d[0x9341 ^ 0x93A0] = 0xA001 ^ 0x93A0;
        TotemPopEvent.d[0xEAFF ^ 0xEB71] = 0x6457 ^ 0xEB71;
        TotemPopEvent.d[0x10A82 ^ 0x10A88] = 0x10AE0 ^ 0x10A88;
        TotemPopEvent.d[0x8AE ^ 0x8BE] = 0xFFFFF753 ^ 0x8BE;
        TotemPopEvent.d[0x10720 ^ 0x10642] = 0x1064E ^ 0x10642;
        TotemPopEvent.d[0xC5CA ^ 0xC511] = 0xAA8B ^ 0xC511;
        TotemPopEvent.d[0x173C ^ 0x17C0] = 0xBC23 ^ 0x17C0;
        TotemPopEvent.d[0xB52 ^ 0xB7B] = 0xB7B ^ 0xB7B;
        TotemPopEvent.d[0xB442 ^ 0xB404] = 0xFFFF4BE1 ^ 0xB404;
        TotemPopEvent.d[0x3E55 ^ 0x3F63] = 0xA5CA ^ 0x3F63;
        TotemPopEvent.d[0x2070 ^ 0x2009] = 0x2008 ^ 0x2009;
        TotemPopEvent.d[0xB667 ^ 0xB713] = 0xB711 ^ 0xB713;
        TotemPopEvent.d[0xC249 ^ 0xC25F] = 0xFFFF3DC0 ^ 0xC25F;
        TotemPopEvent.d[0x1DAA ^ 0x1D70] = 0xFFFF8D00 ^ 0x1D70;
        TotemPopEvent.d[0xBA60 ^ 0xBA0F] = 0xBAA9 ^ 0xBA0F;
        TotemPopEvent.d[0x3A30 ^ 0x3AEC] = 0x2816 ^ 0x3AEC;
        TotemPopEvent.d[0x3B41 ^ 0x3BAC] = 0x35E2 ^ 0x3BAC;
        TotemPopEvent.d[0xBD4C ^ 0xBD12] = 0xFFFF42DF ^ 0xBD12;
        TotemPopEvent.d[0x6356 ^ 0x63EB] = 0x63EB ^ 0x63EB;
        TotemPopEvent.d[0xE610 ^ 0xE75C] = 0xB1E6 ^ 0xE75C;
        TotemPopEvent.d[0x138 ^ 0x35] = 0xC605 ^ 0x35;
        TotemPopEvent.d[0x2098 ^ 0x21A5] = 0xDF3B ^ 0x21A5;
        TotemPopEvent.d[0xE921 ^ 0xE916] = 0x2E4E ^ 0xE916;
        TotemPopEvent.d[0x6279 ^ 0x630A] = 0x620A ^ 0x630A;
        TotemPopEvent.d[0x1086F ^ 0x10910] = 0x1E4C6 ^ 0x10910;
        TotemPopEvent.d[0xE437 ^ 0xE45D] = 0xE405 ^ 0xE45D;
        TotemPopEvent.d[0x2761 ^ 0x2626] = 0xB283 ^ 0x2626;
        TotemPopEvent.d[0x5BBB ^ 0x5A9A] = 0xECF2 ^ 0x5A9A;
        TotemPopEvent.d[0x2633 ^ 0x26DD] = 0xFFFFD72B ^ 0x26DD;
        TotemPopEvent.d[0xDF7C ^ 0xDF14] = 0xFFFF20B6 ^ 0xDF14;
        TotemPopEvent.d[0x8FD6 ^ 0x8FEE] = 0x82F6 ^ 0x8FEE;
        TotemPopEvent.d[0x8E0E ^ 0x8F28] = 0x2D11 ^ 0x8F28;
        TotemPopEvent.d[0x5682 ^ 0x562F] = 0x1553E ^ 0x562F;
        TotemPopEvent.d[0x8465 ^ 0x84F2] = 0x396E ^ 0x84F2;
        TotemPopEvent.d[0x4325 ^ 0x431A] = 0xFFFFBCF6 ^ 0x431A;
        TotemPopEvent.d[0xD7A ^ 0xDB6] = 0xC702 ^ 0xDB6;
        TotemPopEvent.d[0xD507 ^ 0xD514] = 0xFFFF2AD5 ^ 0xD514;
        TotemPopEvent.d[0x5AC8 ^ 0x5A21] = 0x30B7 ^ 0x5A21;
        TotemPopEvent.d[0xB834 ^ 0xB8E9] = 0xAA0A ^ 0xB8E9;
        TotemPopEvent.d[0xB9A6 ^ 0xB9AA] = 0xFFFF4626 ^ 0xB9AA;
        TotemPopEvent.d[0x22AC ^ 0x22B8] = 0x22E7 ^ 0x22B8;
        TotemPopEvent.d[0x3E8C ^ 0x3FC9] = 0x3FDB ^ 0x3FC9;
        TotemPopEvent.d[0xBD8C ^ 0xBCE7] = 0xBCEE ^ 0xBCE7;
        TotemPopEvent.d[0xD6ED ^ 0xD76E] = 0x62B0 ^ 0xD76E;
        TotemPopEvent.d[0x2529 ^ 0x25D6] = 0x8E2B ^ 0x25D6;
        TotemPopEvent.d[0x75FF ^ 0x74B6] = 0xD430 ^ 0x74B6;
        TotemPopEvent.d[0xE684 ^ 0xE7E5] = 0xE789 ^ 0xE7E5;
        TotemPopEvent.d[0x49B0 ^ 0x48C8] = 0xE42D ^ 0x48C8;
        TotemPopEvent.d[0x676A ^ 0x6723] = 0x6770 ^ 0x6723;
        TotemPopEvent.d[0x10D2B ^ 0x10D6F] = 0x10D2B ^ 0x10D6F;
        TotemPopEvent.d[0xF640 ^ 0xF72C] = 0xF72C ^ 0xF72C;
        TotemPopEvent.d[0x511C ^ 0x506D] = 0x504D ^ 0x506D;
        TotemPopEvent.d[0x8E50 ^ 0x8F5A] = 0xFCF0 ^ 0x8F5A;
        TotemPopEvent.d[0x1C85 ^ 0x1C63] = 0x9EA5 ^ 0x1C63;
        TotemPopEvent.d[0x8EFA ^ 0x8FA5] = 0x8FE3 ^ 0x8FA5;
        TotemPopEvent.d[0xE74 ^ 0xE61] = 0xFFFFF195 ^ 0xE61;
        TotemPopEvent.d[0xEF04 ^ 0xEE7E] = 0xFB35 ^ 0xEE7E;
        TotemPopEvent.d[0xB0FF ^ 0xB198] = 0xFFFF4E4F ^ 0xB198;
        TotemPopEvent.d[0x6BB3 ^ 0x6A83] = 0x8908 ^ 0x6A83;
        TotemPopEvent.d[0x6200 ^ 0x6304] = 0x4F52 ^ 0x6304;
        TotemPopEvent.d[0x285E ^ 0x28C5] = 0xFFFF016E ^ 0x28C5;
        TotemPopEvent.d[0x96F7 ^ 0x9695] = 0xFFFF697D ^ 0x9695;
        TotemPopEvent.d[0x574D ^ 0x5771] = 0xFFFFA886 ^ 0x5771;
        TotemPopEvent.d[0xE938 ^ 0xE9A7] = 0x43B8 ^ 0xE9A7;
        TotemPopEvent.d[0xCD82 ^ 0xCD0A] = 0x1C1FE ^ 0xCD0A;
        TotemPopEvent.d[0xE66F ^ 0xE6A5] = 0xFFFF8D1A ^ 0xE6A5;
        TotemPopEvent.d[0xF00C ^ 0xF046] = 0xFFFF0FB3 ^ 0xF046;
        TotemPopEvent.d[0x6B72 ^ 0x6A0E] = 0x937C ^ 0x6A0E;
        TotemPopEvent.d[0xC378 ^ 0xC30A] = 0xC359 ^ 0xC30A;
        TotemPopEvent.d[0x1DBE ^ 0x1D6C] = 0xD01A ^ 0x1D6C;
        TotemPopEvent.d[0x433A ^ 0x43F4] = 0xFFFF76A0 ^ 0x43F4;
        TotemPopEvent.d[0xFEAF ^ 0xFE8A] = 0xFEF2 ^ 0xFE8A;
        TotemPopEvent.d[0xCB12 ^ 0xCB0E] = 0xFFFF3488 ^ 0xCB0E;
        TotemPopEvent.d[0x3EB ^ 0x2F8] = 0xA7B4 ^ 0x2F8;
        TotemPopEvent.d[0x19A9 ^ 0x19B6] = 0x19F3 ^ 0x19B6;
        TotemPopEvent.d[0x9A65 ^ 0x9A37] = 0x9A13 ^ 0x9A37;
        TotemPopEvent.d[0x7E69 ^ 0x7E11] = 0x7E10 ^ 0x7E11;
        TotemPopEvent.d[0xA091 ^ 0xA1A6] = 0x3B27 ^ 0xA1A6;
        TotemPopEvent.d[0x10258 ^ 0x102C5] = 0x1A8B3 ^ 0x102C5;
        TotemPopEvent.d[0xDDFE ^ 0xDC96] = 0xDC95 ^ 0xDC96;
        TotemPopEvent.d[0x103F4 ^ 0x10335] = 0x12443 ^ 0x10335;
        TotemPopEvent.d[0x9861 ^ 0x9817] = 0x9815 ^ 0x9817;
        TotemPopEvent.d[0xAD16 ^ 0xAD17] = 0xAD73 ^ 0xAD17;
        TotemPopEvent.d[0x9A0 ^ 0x8D9] = 0x1971 ^ 0x8D9;
        TotemPopEvent.d[0xDD5E ^ 0xDD33] = 0xDD28 ^ 0xDD33;
        TotemPopEvent.d[0x9786 ^ 0x96B7] = 0x753A ^ 0x96B7;
        TotemPopEvent.d[0x6763 ^ 0x662C] = 0x1FB3 ^ 0x662C;
        TotemPopEvent.d[0x7DD3 ^ 0x7D37] = 0xFF9D ^ 0x7D37;
        TotemPopEvent.d[0xB03C ^ 0xB033] = 0xFFFF4FB8 ^ 0xB033;
        TotemPopEvent.d[0xDE36 ^ 0xDE0C] = 0x6D12 ^ 0xDE0C;
        TotemPopEvent.d[0x7146 ^ 0x7010] = 0x7018 ^ 0x7010;
        TotemPopEvent.d[0xBF6 ^ 0xBAC] = 0xFFFFF423 ^ 0xBAC;
        TotemPopEvent.d[0x8242 ^ 0x82FD] = 0x4BF4 ^ 0x82FD;
        TotemPopEvent.d[0x1B81 ^ 0x1BFD] = 0x89F ^ 0x1BFD;
        TotemPopEvent.d[0xDCC8 ^ 0xDC4B] = 0xFFFF43DB ^ 0xDC4B;
        TotemPopEvent.d[0xDAF ^ 0xC86] = 0x8A2A ^ 0xC86;
        TotemPopEvent.d[0x41B5 ^ 0x4106] = 0xF1F0 ^ 0x4106;
        TotemPopEvent.d[0xA333 ^ 0xA26E] = 0xFFFF5DAE ^ 0xA26E;
        TotemPopEvent.d[0x1103 ^ 0x11D6] = 0x7B72 ^ 0x11D6;
        TotemPopEvent.d[0xE7F0 ^ 0xE679] = 0xE679 ^ 0xE679;
        TotemPopEvent.d[0xEF90 ^ 0xEF34] = 0x7B29 ^ 0xEF34;
        TotemPopEvent.d[0xE454 ^ 0xE506] = 0xE50F ^ 0xE506;
        TotemPopEvent.d[0xEC47 ^ 0xED41] = 0xFFFF3EE6 ^ 0xED41;
        TotemPopEvent.d[0x122B ^ 0x129D] = 0x34E6 ^ 0x129D;
        TotemPopEvent.d[0xD849 ^ 0xD80B] = 0xD80A ^ 0xD80B;
        TotemPopEvent.d[0x4805 ^ 0x48B5] = 0x14BA5 ^ 0x48B5;
        TotemPopEvent.d[0xAC99 ^ 0xAC7B] = 0x9FB9 ^ 0xAC7B;
        TotemPopEvent.d[0x288B ^ 0x298E] = 0x5D4 ^ 0x298E;
        TotemPopEvent.d[0x129D ^ 0x1226] = 0x9A1 ^ 0x1226;
        TotemPopEvent.d[0xA826 ^ 0xA813] = 0x7AC0 ^ 0xA813;
        TotemPopEvent.d[0xBB26 ^ 0xBBB0] = 0x618 ^ 0xBBB0;
        TotemPopEvent.d[0x4E5A ^ 0x4F60] = 0xFFFF6C65 ^ 0x4F60;
        TotemPopEvent.d[0x83F2 ^ 0x838F] = 0x5295 ^ 0x838F;
        TotemPopEvent.d[0x831C ^ 0x832E] = 0xCB24 ^ 0x832E;
        TotemPopEvent.d[0x6E7B ^ 0x6F0E] = 0x6F0E ^ 0x6F0E;
        TotemPopEvent.d[0x10E97 ^ 0x10E6E] = 0x1376F ^ 0x10E6E;
        TotemPopEvent.d[0x5FD ^ 0x534] = 0x9171 ^ 0x534;
        TotemPopEvent.d[0xE265 ^ 0xE3EA] = 0x1392 ^ 0xE3EA;
        TotemPopEvent.d[0x66F2 ^ 0x6612] = 0x55B6 ^ 0x6612;
        TotemPopEvent.d[0x60DE ^ 0x60B9] = 0x60B8 ^ 0x60B9;
        TotemPopEvent.d[0x8484 ^ 0x8427] = 0x103C ^ 0x8427;
        TotemPopEvent.d[0xCDBB ^ 0xCD88] = 0x6826 ^ 0xCD88;
        TotemPopEvent.d[0x40A7 ^ 0x404C] = 0x2ADA ^ 0x404C;
        TotemPopEvent.d[0x121E ^ 0x1358] = 0x6A98 ^ 0x1358;
        TotemPopEvent.d[0x4317 ^ 0x4323] = 0x9CB2 ^ 0x4323;
        TotemPopEvent.d[0x7EBA ^ 0x7FC7] = 0x47F5 ^ 0x7FC7;
        TotemPopEvent.d[0xDA6B ^ 0xDA81] = 0xFFFF4FD8 ^ 0xDA81;
        TotemPopEvent.d[0x1079E ^ 0x107B2] = 0x107B2 ^ 0x107B2;
        TotemPopEvent.d[0x884D ^ 0x88AE] = 0xBB0F ^ 0x88AE;
        TotemPopEvent.d[0x93D8 ^ 0x932D] = 0xBB ^ 0x932D;
        TotemPopEvent.d[0x196E ^ 0x187F] = 0xBD33 ^ 0x187F;
        TotemPopEvent.d[0xBA01 ^ 0xBA7F] = 0x6B6D ^ 0xBA7F;
        TotemPopEvent.d[0xBACA ^ 0xBAC7] = 0xBAAE ^ 0xBAC7;
        TotemPopEvent.d[0x2478 ^ 0x25F4] = 0xA847 ^ 0x25F4;
        TotemPopEvent.d[0xA633 ^ 0xA6CB] = 0x9FC8 ^ 0xA6CB;
        TotemPopEvent.d[0x2B90 ^ 0x2BE5] = 0x2BE4 ^ 0x2BE5;
        TotemPopEvent.d[0xCA95 ^ 0xCBE3] = 0xCBE0 ^ 0xCBE3;
        TotemPopEvent.d[0xAA81 ^ 0xAA15] = 0x8047 ^ 0xAA15;
        TotemPopEvent.d[0x50A1 ^ 0x50F5] = 0x50F1 ^ 0x50F5;
        TotemPopEvent.d[0x6481 ^ 0x6599] = 0x1E24 ^ 0x6599;
        TotemPopEvent.d[0x1EAF ^ 0x1EF9] = 0xFFFFE160 ^ 0x1EF9;
        TotemPopEvent.d[0x9848 ^ 0x98FC] = 0x2849 ^ 0x98FC;
        TotemPopEvent.d[0xAC84 ^ 0xADA6] = 0xFFFFE46C ^ 0xADA6;
        TotemPopEvent.d[0x4E ^ 0x97] = 0x6F0D ^ 0x97;
        TotemPopEvent.d[0x9FAB ^ 0x9E2D] = 0x9E3D ^ 0x9E2D;
        TotemPopEvent.d[0x9AAF ^ 0x9BF8] = 0x9B9D ^ 0x9BF8;
        TotemPopEvent.d[0x42CE ^ 0x43C2] = 0x85E3 ^ 0x43C2;
        TotemPopEvent.d[0xD2F5 ^ 0xD2AA] = 0xFFFF2D21 ^ 0xD2AA;
        TotemPopEvent.d[0xBAA3 ^ 0xBA58] = 0x8359 ^ 0xBA58;
        TotemPopEvent.d[0xB789 ^ 0xB794] = 0xB7CF ^ 0xB794;
        TotemPopEvent.d[0x4601 ^ 0x471C] = 0xA7B6 ^ 0x471C;
        TotemPopEvent.d[0x643 ^ 0x748] = 0x74A1 ^ 0x748;
        TotemPopEvent.d[0x2468 ^ 0x24CD] = 0x125F7 ^ 0x24CD;
        TotemPopEvent.d[0xC88F ^ 0xC8E9] = 0xFFFF3728 ^ 0xC8E9;
        TotemPopEvent.d[0x1420 ^ 0x1426] = 0xFFFFEBC2 ^ 0x1426;
        TotemPopEvent.d[0x808E ^ 0x8037] = 0x9BD8 ^ 0x8037;
        TotemPopEvent.d[0x77D1 ^ 0x7719] = 0xE34F ^ 0x7719;
        TotemPopEvent.d[0x3AC9 ^ 0x3BC8] = 0xDEC3 ^ 0x3BC8;
        TotemPopEvent.d[0x80BB ^ 0x81A4] = 0x610E ^ 0x81A4;
        TotemPopEvent.d[0x7925 ^ 0x79BB] = 0xD3C2 ^ 0x79BB;
        TotemPopEvent.d[0xCC28 ^ 0xCCB4] = 0x1AE1 ^ 0xCCB4;
        TotemPopEvent.d[0xE8DB ^ 0xE85C] = 0x1E4A0 ^ 0xE85C;
        TotemPopEvent.d[0x6CFE ^ 0x6DCA] = 0xF756 ^ 0x6DCA;
        TotemPopEvent.d[0x3126 ^ 0x3001] = 0x9246 ^ 0x3001;
        TotemPopEvent.d[0xACF8 ^ 0xAD7C] = 0xAD7E ^ 0xAD7C;
        TotemPopEvent.d[0xBE75 ^ 0xBF72] = 0x9328 ^ 0xBF72;
        TotemPopEvent.d[0x1C11 ^ 0x1CBF] = 0x11FAF ^ 0x1CBF;
        TotemPopEvent.d[0x5F8A ^ 0x5FF9] = 0xFFFFA01F ^ 0x5FF9;
        TotemPopEvent.d[0x5AA6 ^ 0x5BF5] = 0xFFFFA425 ^ 0x5BF5;
        TotemPopEvent.d[0x7025 ^ 0x703D] = 0x706D ^ 0x703D;
        TotemPopEvent.d[0x5523 ^ 0x5478] = 0x541A ^ 0x5478;
        TotemPopEvent.d[0x7FB ^ 0x762] = 0xD139 ^ 0x762;
        TotemPopEvent.d[0xA0E0 ^ 0xA06B] = 0xFFFF9BC7 ^ 0xA06B;
        TotemPopEvent.d[0x8824 ^ 0x88F5] = 0x45E1 ^ 0x88F5;
        TotemPopEvent.d[0x9E0B ^ 0x9E8E] = 0x19278 ^ 0x9E8E;
        TotemPopEvent.d[0x68E6 ^ 0x6873] = 0xD5D1 ^ 0x6873;
        TotemPopEvent.d[0x833E ^ 0x83FB] = 0x84F1 ^ 0x83FB;
        TotemPopEvent.d[0xB2D2 ^ 0xB2F3] = 0xB2B9 ^ 0xB2F3;
        TotemPopEvent.d[0x1B5F ^ 0x1B34] = 0x1B6B ^ 0x1B34;
        TotemPopEvent.d[0x7D13 ^ 0x7C3F] = 0x45CD ^ 0x7C3F;
        TotemPopEvent.d[0x890 ^ 0x88A] = 0x886 ^ 0x88A;
        TotemPopEvent.d[0x10A1 ^ 0x11AF] = 0xD7EF ^ 0x11AF;
        TotemPopEvent.d[0x175F ^ 0x1712] = 0xFFFFE897 ^ 0x1712;
        TotemPopEvent.d[0x55EB ^ 0x55A0] = 0x5569 ^ 0x55A0;
        TotemPopEvent.d[0x9592 ^ 0x95C7] = 0xFFFF6A7A ^ 0x95C7;
        TotemPopEvent.d[0x1747 ^ 0x1716] = 0x1747 ^ 0x1716;
        TotemPopEvent.d[0x88BB ^ 0x8835] = 0x8F41 ^ 0x8835;
        TotemPopEvent.d[0xF12C ^ 0xF1EB] = 0xF6E1 ^ 0xF1EB;
        TotemPopEvent.d[0xB2FE ^ 0xB38C] = 0xB39B ^ 0xB38C;
        TotemPopEvent.d[0xB4E5 ^ 0xB4CF] = 0xB4CD ^ 0xB4CF;
        TotemPopEvent.d[0x8B2F ^ 0x8A20] = 0x4C10 ^ 0x8A20;
        TotemPopEvent.d[0x3CD6 ^ 0x3C47] = 0x1612 ^ 0x3C47;
        TotemPopEvent.d[0x95D5 ^ 0x95F5] = 0x9583 ^ 0x95F5;
        TotemPopEvent.d[0x2913 ^ 0x29B1] = 0xBDAC ^ 0x29B1;
        TotemPopEvent.d[0x80AF ^ 0x8091] = 0xFFFF7F50 ^ 0x8091;
        TotemPopEvent.d[0xAEFC ^ 0xAE57] = 0xFFFFEC21 ^ 0xAE57;
        TotemPopEvent.d[0xBD73 ^ 0xBC04] = 0x8FE5 ^ 0xBC04;
        TotemPopEvent.d[0x7712 ^ 0x7621] = 0x95AC ^ 0x7621;
        TotemPopEvent.d[0x6F95 ^ 0x6F33] = 0x16E0D ^ 0x6F33;
        TotemPopEvent.d[0x4B4A ^ 0x4A7F] = 0xD0FE ^ 0x4A7F;
        TotemPopEvent.d[0xBD3C ^ 0xBD1A] = 0xBD19 ^ 0xBD1A;
        TotemPopEvent.d[0xC41F ^ 0xC55F] = 0xC55F ^ 0xC55F;
        TotemPopEvent.d[0xDE8B ^ 0xDEC8] = 0xFFFF2155 ^ 0xDEC8;
        TotemPopEvent.d[0xB61 ^ 0xB11] = 0xB4B ^ 0xB11;
        TotemPopEvent.d[0xDE28 ^ 0xDE59] = 0xFFFF218D ^ 0xDE59;
        TotemPopEvent.d[0x6966 ^ 0x6912] = 0x690B ^ 0x6912;
        TotemPopEvent.d[0x7D72 ^ 0x7D77] = 0x7D2B ^ 0x7D77;
        TotemPopEvent.d[0x255D ^ 0x2585] = 0x4A0A ^ 0x2585;
        TotemPopEvent.d[0x9FB3 ^ 0x9EB0] = 0x7BBB ^ 0x9EB0;
        TotemPopEvent.d[0x640F ^ 0x651F] = 0xC041 ^ 0x651F;
        TotemPopEvent.d[0x337E ^ 0x3246] = 0xEEB6 ^ 0x3246;
        TotemPopEvent.d[0x40 ^ 0x1CB] = 0x208A ^ 0x1CB;
        TotemPopEvent.d[0xA27C ^ 0xA26B] = 0xA201 ^ 0xA26B;
        TotemPopEvent.d[0x456B ^ 0x456F] = 0x4544 ^ 0x456F;
        TotemPopEvent.d[0x5E3 ^ 0x4F8] = 0x7F46 ^ 0x4F8;
        TotemPopEvent.d[0x431A ^ 0x4390] = 0x87D4 ^ 0x4390;
        TotemPopEvent.d[0x8FCD ^ 0x8FE6] = 0x8FE6 ^ 0x8FE6;
        TotemPopEvent.d[0x2A82 ^ 0x2BBE] = 0xD52E ^ 0x2BBE;
        TotemPopEvent.d[0x23DA ^ 0x2318] = 0xFFFFFBF9 ^ 0x2318;
        TotemPopEvent.d[0x540C ^ 0x54B9] = 0x72C4 ^ 0x54B9;
        TotemPopEvent.d[0x259B ^ 0x248E] = 0xC22D ^ 0x248E;
        TotemPopEvent.d[0x10A77 ^ 0x10A70] = 0x10A4C ^ 0x10A70;
        TotemPopEvent.d[0xCA3B ^ 0xCA81] = 0xD16E ^ 0xCA81;
        TotemPopEvent.d[0x71E7 ^ 0x70D9] = 0xFFFF71D3 ^ 0x70D9;
        TotemPopEvent.d[0xDDF ^ 0xCF1] = 0x352E ^ 0xCF1;
        TotemPopEvent.d[0x22D5 ^ 0x22AE] = 0x31DC ^ 0x22AE;
        TotemPopEvent.d[0x4F0 ^ 0x4BF] = 0xFFFFFB47 ^ 0x4BF;
        TotemPopEvent.d[0xD3F5 ^ 0xD3C3] = 0xF4 ^ 0xD3C3;
        TotemPopEvent.d[0xC09D ^ 0xC00E] = 0xEA73 ^ 0xC00E;
        TotemPopEvent.d[0x97AB ^ 0x96CB] = 0x96C5 ^ 0x96CB;
        TotemPopEvent.d[0xD077 ^ 0xD074] = 0xD0FF ^ 0xD074;
        TotemPopEvent.d[0x9CF3 ^ 0x9D74] = 0x9D64 ^ 0x9D74;
        TotemPopEvent.d[0x52F6 ^ 0x5388] = 0x5F3B ^ 0x5388;
        TotemPopEvent.d[0x6D59 ^ 0x6D9F] = 0x6AB9 ^ 0x6D9F;
        TotemPopEvent.d[0xFD6E ^ 0xFC45] = 0x7AE9 ^ 0xFC45;
        TotemPopEvent.d[0x7440 ^ 0x7421] = 0xFFFF8BED ^ 0x7421;
        TotemPopEvent.d[0x5735 ^ 0x573B] = 0xFFFFA8DB ^ 0x573B;
        TotemPopEvent.d[0xFE43 ^ 0xFF5F] = 0x1FFE ^ 0xFF5F;
        TotemPopEvent.d[0xEB92 ^ 0xEA92] = 0xF91 ^ 0xEA92;
        TotemPopEvent.d[0x2F15 ^ 0x2E9F] = 0x2E8B ^ 0x2E9F;
        TotemPopEvent.d[0x10061 ^ 0x10046] = 0x10046 ^ 0x10046;
        TotemPopEvent.d[0xB929 ^ 0xB918] = 0xED70 ^ 0xB918;
        TotemPopEvent.d[0x9861 ^ 0x9975] = 0x7FCA ^ 0x9975;
        TotemPopEvent.d[0x3554 ^ 0x35DD] = 0xF190 ^ 0x35DD;
        TotemPopEvent.d[0x7311 ^ 0x7383] = 0x59D1 ^ 0x7383;
        TotemPopEvent.d[0xC7FB ^ 0xC676] = 0xA7F3 ^ 0xC676;
        TotemPopEvent.d[0xC7FF ^ 0xC68F] = 0xC68D ^ 0xC68F;
        TotemPopEvent.d[0xC1E1 ^ 0xC188] = 0xC15F ^ 0xC188;
        TotemPopEvent.d[0x3087 ^ 0x30DE] = 0x3088 ^ 0x30DE;
        TotemPopEvent.d[0x8728 ^ 0x87B0] = 0x3A18 ^ 0x87B0;
        TotemPopEvent.d[0x3A69 ^ 0x3A81] = 0x5000 ^ 0x3A81;
        TotemPopEvent.d[0x25F1 ^ 0x25F1] = 0x2575 ^ 0x25F1;
        TotemPopEvent.d[0x2EB9 ^ 0x2FDD] = 0x2FD0 ^ 0x2FDD;
        TotemPopEvent.d[0x7D2A ^ 0x7DDD] = 0xEE4B ^ 0x7DDD;
        TotemPopEvent.d[0x26DE ^ 0x26BD] = 0x26BE ^ 0x26BD;
        TotemPopEvent.d[0x37AF ^ 0x36E1] = 0x7A1F ^ 0x36E1;
        TotemPopEvent.d[0x7CF0 ^ 0x7CE2] = 0x7CC3 ^ 0x7CE2;
        TotemPopEvent.d[0xDE49 ^ 0xDEAC] = 0x5C16 ^ 0xDEAC;
        TotemPopEvent.d[0xA176 ^ 0xA1F6] = 0x70E4 ^ 0xA1F6;
        TotemPopEvent.d[0x1D79 ^ 0x1C3B] = 0x1C3B ^ 0x1C3B;
        TotemPopEvent.d[0x491E ^ 0x4992] = 0x8DD6 ^ 0x4992;
        TotemPopEvent.d[0x63 ^ 0x12E] = 0x9F70 ^ 0x12E;
        TotemPopEvent.d[0x1B45 ^ 0x1B47] = 0xFFFFE4A7 ^ 0x1B47;
        TotemPopEvent.d[0x25F6 ^ 0x2506] = 0x236E ^ 0x2506;
        TotemPopEvent.d[0x36D1 ^ 0x37CF] = 0xD762 ^ 0x37CF;
        TotemPopEvent.d[0x81DE ^ 0x80FD] = 0x3695 ^ 0x80FD;
        TotemPopEvent.d[0x9E7 ^ 0x86F] = 0x86C ^ 0x86F;
        TotemPopEvent.d[0xAFA8 ^ 0xAFF5] = 0xFFFF508D ^ 0xAFF5;
        TotemPopEvent.d[0xCFD2 ^ 0xCEE9] = 0x1210 ^ 0xCEE9;
        TotemPopEvent.d[0x236F ^ 0x222E] = 0x222E ^ 0x222E;
        TotemPopEvent.d[0x6B4C ^ 0x6B22] = 0xFFFF94B3 ^ 0x6B22;
        TotemPopEvent.d[0xF638 ^ 0xF722] = 0x8CBB ^ 0xF722;
        TotemPopEvent.d[0x35B7 ^ 0x35F0] = 0x35CF ^ 0x35F0;
        TotemPopEvent.d[0x9615 ^ 0x9776] = 0x9758 ^ 0x9776;
        TotemPopEvent.d[0xB5C7 ^ 0xB534] = 0xB353 ^ 0xB534;
        TotemPopEvent.d[0x3AFD ^ 0x3A82] = 0xFFFF1456 ^ 0x3A82;
        TotemPopEvent.d[0x27FA ^ 0x27BA] = 0xFFFFD863 ^ 0x27BA;
        TotemPopEvent.d[0xA14F ^ 0xA138] = 0xA138 ^ 0xA138;
        TotemPopEvent.d[0xF576 ^ 0xF54F] = 0x5CD4 ^ 0xF54F;
        TotemPopEvent.d[0x8EDD ^ 0x8E6F] = 0x3EDA ^ 0x8E6F;
        TotemPopEvent.d[0xDD6B ^ 0xDD9D] = 0xFFFFB1E9 ^ 0xDD9D;
        TotemPopEvent.d[0x8F11 ^ 0x8F49] = 0xFFFF70C6 ^ 0x8F49;
        TotemPopEvent.d[0x1334 ^ 0x13E4] = 0xDEE8 ^ 0x13E4;
        TotemPopEvent.d[0x3637 ^ 0x369D] = 0x8B25 ^ 0x369D;
        TotemPopEvent.d[0xB4B ^ 0xB5A] = 0xB39 ^ 0xB5A;
        TotemPopEvent.d[0x8C1B ^ 0x8C94] = 0xFFFF7476 ^ 0x8C94;
        TotemPopEvent.d[0x9AFD ^ 0x9A70] = 0x9D01 ^ 0x9A70;
        TotemPopEvent.d[0xD9E9 ^ 0xD86B] = 0xAAD7 ^ 0xD86B;
        TotemPopEvent.d[0xE5F8 ^ 0xE535] = 0x2F81 ^ 0xE535;
        TotemPopEvent.d[0x237E ^ 0x2392] = 0x2DC8 ^ 0x2392;
        TotemPopEvent.d[0x1B40 ^ 0x1BEC] = 0xA654 ^ 0x1BEC;
        TotemPopEvent.d[0xD02C ^ 0xD0E8] = 0xD7E5 ^ 0xD0E8;
        TotemPopEvent.d[0x1AE2 ^ 0x1A3D] = 0x8DE ^ 0x1A3D;
        TotemPopEvent.d[0x79C5 ^ 0x796A] = 0x17A6E ^ 0x796A;
        TotemPopEvent.d[0xB0D ^ 0xB43] = 0xB06 ^ 0xB43;
        TotemPopEvent.d[0xB14F ^ 0xB1CB] = 0xD1FF ^ 0xB1CB;
        TotemPopEvent.d[0xAE2F ^ 0xAFAE] = 0xD619 ^ 0xAFAE;
        TotemPopEvent.d[0xD388 ^ 0xD3B8] = 0xF99D ^ 0xD3B8;
        TotemPopEvent.d[0x5A97 ^ 0x5BF9] = 0x5BFD ^ 0x5BF9;
        TotemPopEvent.d[0x9A3E ^ 0x9B60] = 0x9B6B ^ 0x9B60;
        TotemPopEvent.d[0xD6F6 ^ 0xD657] = 0x4247 ^ 0xD657;
        TotemPopEvent.d[0x84AB ^ 0x8586] = 0xBC6F ^ 0x8586;
        TotemPopEvent.d[0x8FB0 ^ 0x8FD4] = 0xFFFF7027 ^ 0x8FD4;
        TotemPopEvent.d[0xBC9A ^ 0xBC91] = 0xFFFF4370 ^ 0xBC91;
        TotemPopEvent.d[0x4DD6 ^ 0x4CBB] = 0xFFFFB362 ^ 0x4CBB;
        TotemPopEvent.d[0x8FA5 ^ 0x8FF2] = 0x8FF7 ^ 0x8FF2;
        TotemPopEvent.d[0xA9A3 ^ 0xA987] = 0xFFFF562F ^ 0xA987;
        TotemPopEvent.d[0xDB8A ^ 0xDB6D] = 0x59D7 ^ 0xDB6D;
        TotemPopEvent.d[0x102D2 ^ 0x1020C] = 0xFFFEEF32 ^ 0x1020C;
        TotemPopEvent.d[0xD8E9 ^ 0xD851] = 0xFE2A ^ 0xD851;
        TotemPopEvent.d[0xC79E ^ 0xC7B0] = 0x5C10 ^ 0xC7B0;
        TotemPopEvent.d[0x2F1 ^ 0x3D5] = 0xA188 ^ 0x3D5;
        TotemPopEvent.d[0x1D1F ^ 0x1C2D] = 0xFFA5 ^ 0x1C2D;
        TotemPopEvent.d[0x84DE ^ 0x8462] = 0x9F8D ^ 0x8462;
        TotemPopEvent.d[0xB432 ^ 0xB4E1] = 0x79F5 ^ 0xB4E1;
        TotemPopEvent.d[0x9180 ^ 0x91D0] = 0xFFFF6E14 ^ 0x91D0;
        TotemPopEvent.d[0x203 ^ 0x22C] = 0xB9AC ^ 0x22C;
        TotemPopEvent.d[0xC006 ^ 0xC047] = 0xFFFF3FA2 ^ 0xC047;
        TotemPopEvent.d[0xAE79 ^ 0xAF13] = 0xAF19 ^ 0xAF13;
        TotemPopEvent.d[0xD305 ^ 0xD30C] = 0xD347 ^ 0xD30C;
        TotemPopEvent.d[0x3B58 ^ 0x3B46] = 0xFFFFC400 ^ 0x3B46;
        TotemPopEvent.d[0x54DB ^ 0x549E] = 0x54BB ^ 0x549E;
        TotemPopEvent.d[0x3AC0 ^ 0x3BC2] = 0xDEA9 ^ 0x3BC2;
        TotemPopEvent.d[0x2C3B ^ 0x2C77] = 0x2C25 ^ 0x2C77;
        TotemPopEvent.d[0xF5FE ^ 0xF4AB] = 0xF4AF ^ 0xF4AB;
        TotemPopEvent.d[0x1743 ^ 0x160B] = 0x661D ^ 0x160B;
        TotemPopEvent.d[0xF153 ^ 0xF19C] = 0x3B28 ^ 0xF19C;
        TotemPopEvent.d[0xCE5A ^ 0xCF4D] = 0x29EE ^ 0xCF4D;
        TotemPopEvent.d[0xB73C ^ 0xB7E8] = 0xDD4D ^ 0xB7E8;
        TotemPopEvent.d[0x5D6D ^ 0x5D31] = 0xFFFFA2AD ^ 0x5D31;
        TotemPopEvent.d[0xF001 ^ 0xF0B6] = 0xFFFF2924 ^ 0xF0B6;
        TotemPopEvent.d[0xFA7E ^ 0xFA04] = 0xFA04 ^ 0xFA04;
        TotemPopEvent.d[0x97BF ^ 0x96DA] = 0x96EB ^ 0x96DA;
        TotemPopEvent.d[0x2BD2 ^ 0x2BFF] = 0x2BA7 ^ 0x2BFF;
        TotemPopEvent.d[0xF2C6 ^ 0xF39F] = 0xF38E ^ 0xF39F;
        TotemPopEvent.d[0x963 ^ 0x99E] = 0xA263 ^ 0x99E;
        TotemPopEvent.d[0x6033 ^ 0x6082] = 0xD034 ^ 0x6082;
        TotemPopEvent.d[0xAB78 ^ 0xAA50] = 0x2CF1 ^ 0xAA50;
        TotemPopEvent.d[0xFA65 ^ 0xFACC] = 0x4778 ^ 0xFACC;
        TotemPopEvent.d[0xA631 ^ 0xA74A] = 0x45C4 ^ 0xA74A;
        TotemPopEvent.d[0x609B ^ 0x61F4] = 0x6197 ^ 0x61F4;
        TotemPopEvent.d[0xDC84 ^ 0xDDC7] = 0xDDC6 ^ 0xDDC7;
        TotemPopEvent.d[0xB9F ^ 0xB1D] = 0x6B29 ^ 0xB1D;
    }
}

