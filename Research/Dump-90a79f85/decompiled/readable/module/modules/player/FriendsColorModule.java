/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_1304
 *  net.minecraft.class_1792
 *  net.minecraft.class_1799
 *  net.minecraft.class_1802
 *  net.minecraft.class_1935
 *  net.minecraft.class_9282
 *  net.minecraft.class_9334
 */
package kotakbaz.rain.module.modules.player;

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
import kotakbaz.rain.friend.C;
import kotakbaz.rain.module.a_0;
import kotakbaz.rain.module.modules.player.s;
import kotlin.Metadata;
import net.minecraft.class_1304;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1935;
import net.minecraft.class_9282;
import net.minecraft.class_9334;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0016"}, d2={"Lkotakbaz/rain/module/modules/player/FriendsColorModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "playerName", "", "invisible", "shouldReplaceArmor", "(Ljava/lang/String;Z)Z", "Lnet/minecraft/class_1304;", "slot", "Lnet/minecraft/class_1799;", "createReplacementArmor", "(Lnet/minecraft/class_1304;)Lnet/minecraft/class_1799;", "Lnet/minecraft/class_1792;", "item", "createColoredArmor", "(Lnet/minecraft/class_1792;)Lnet/minecraft/class_1799;", "", "FRIEND_ARMOR_COLOR", "I", "rain-visuals"})
public final class S
extends a_0 {
    @NotNull
    public static final S INSTANCE;
    private static final int a = 65280;
    private static Object[] A;
    private static Object B;
    private static Object[] c;
    private static Object[] b;
    private static Object[] C;
    public static int[] d;

    private S() {
        int n = d[0];
        n ^= d[1];
        int n2 = d[3];
        n2 ^= d[4];
        int n3 = d[6];
        n3 -= d[7];
        super((String)A[n ^= d[2]], kotakbaz.rain.client.extensions.a_0.getPLAYER(), (String)A[n2 ^= d[5]] + (String)A[n3 ^= d[8]]);
    }

    public final boolean shouldReplaceArmor(@Nullable String string, boolean bl) {
        int n;
        if (this.isEnabled() && !bl && kotakbaz.rain.friend.C.INSTANCE.isFriend(string)) {
            int n2 = d[9];
            n2 -= d[10];
            n = n2 += d[11];
        } else {
            int n3 = d[12];
            n3 ^= d[13];
            n = n3 += d[14];
        }
        return n != 0;
    }

    @Nullable
    public final class_1799 createReplacementArmor(@Nullable class_1304 class_13042) {
        int n;
        class_1304 class_13043 = class_13042;
        if (class_13043 == null) {
            int n2 = d[15];
            n2 ^= d[16];
            n = n2 -= d[17];
        } else {
            n = s.a[class_13043.ordinal()];
        }
        class_1792 class_17922 = switch (n) {
            case 1 -> class_1802.field_8267;
            case 2 -> class_1802.field_8577;
            case 3 -> class_1802.field_8570;
            case 4 -> class_1802.field_8370;
            default -> null;
        };
        if (class_17922 == null) {
            return null;
        }
        class_1792 class_17923 = class_17922;
        return this.createColoredArmor(class_17923);
    }

    private final class_1799 createColoredArmor(class_1792 class_17922) {
        class_1799 class_17992;
        long l = 4008894979894482354L;
        class_1799 class_17993 = class_17992 = new class_1799((class_1935)class_17922);
        long l2 = l;
        int n = d[18];
        n ^= d[19];
        l = l2 ^ (0L ^ l2) & -1L << (n ^= d[20]);
        int n2 = d[21];
        n2 += d[22];
        class_17993.method_57379(class_9334.field_49644, (Object)new class_9282(n2 ^= d[23]));
        return class_17992;
    }

    static {
        S.b();
        long l = 996655570088292365L;
        long l2 = 1859170319956916323L;
        long l3 = 8571920146473479266L;
        long l4 = 1631961255454840502L;
        long l5 = 3073001371282336998L;
        long l6 = 1786931130308030660L;
        long l7 = -2592320405375208100L;
        long l8 = 7407786792890022593L;
        long l9 = 1510421639450622261L;
        long l10 = 6350053677341604722L;
        long l11 = 116113238389432612L;
        long l12 = 7175907005367262684L;
        long l13 = -5529429045629004302L;
        long l14 = -637782630374462915L;
        int n = d[24];
        n -= d[25];
        A = new Object[n -= d[26]];
        long l15 = l14;
        int n2 = d[27];
        n2 -= d[28];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 += d[29]);
        Object[] objectArray = new Object[d[30]];
        objectArray[S.d[31]] = b;
        objectArray[S.d[32]] = d[33];
        int n3 = d[34];
        Object object = S.A()[d[35]];
        if (object == null) {
            char[] cArray = "\ua057\ua057\ua38a\ua3a3\ua3a7\ua37d\ua39b\ua058\ua37e\ua3f6\ua39d\ua381\ua3a7\ua3a5\ua37d\u9d8f\u9d8f\ua377\ua3a7\ua39c\ua37d\ua39d\u9dc6\ua37c\ua381\u9dc4\ua378\ua3a5\ua050\u9dc5\u9d97\ua04c\ua3f5\ua39b\ua016\ua3f6\ua37a\ua37d\ua37f\u9d98\ua37c\ua3ec\ua37f\ua3a6\ua383\ua37c\ua39c\u9d97\ua37d\ua385\u9d8f\ua050\ua39e\ua39e\ua37e\ua378\ua057\ua37c\ua381\ua381\ua39e\u9d97\ua37b\ua013\ua39c\ua058\ua37a\ua05a\ua052\ua3f0\ua3f5\ua3a4\ua39c\ua39d\ua3f2\ua3a9\ua37c\ua3a5\ua381\ua3a6\ua057\ua39b\ua37d\ua3f3\ua37a\u9d9a\u9d91\ua3a9\ua058\ua388\u9d98\ua3f3\ua37c\u9d92\ua37f\ua3a5\ua04c\ua378\ua37d\ua3f1\ua3a7\ua016\ua3a4\ua3ec\ua3a5\ua3a8\ua05a\ua04f\ua377\ua3f4\ua3f5\ua388\u9d9f\ua3f4\ua057\ua3a8\ua3f1\u9d8f\ua3f5\ua021\ua3a4\ua04c\ua37f\ua058\u9dc4\ua37f\u9d98\ua3aa\ua387\ua058\ua3f5\ua387\u9dc3\ua39c\ua39d\ua3ec\ua37c\u9d97\ua3a9\u9d9f\ua05a\u9d9f\ua021\u9dc4\ua3f2\u9d97\ua389\u9d98\u9dc4\ua385\u9d8b\u9d8b".toCharArray();
            for (int i2 = d[36]; i2 < d[37]; ++i2) {
                int n4 = cArray[i2];
                n4 -= d[38];
                n4 -= d[39];
                n4 += d[40];
                n4 += d[41];
                n4 += d[42];
                n4 ^= d[43];
                n4 ^= d[44];
                n4 += d[45];
                n4 ^= d[46];
                n4 ^= d[47];
                n4 -= d[48];
                n4 ^= d[49];
                n4 += d[50];
                n4 ^= d[51];
                cArray[i2] = (char)(n4 -= d[52]);
            }
            object = S.A()[S.d[53]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)S.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = d[54];
        n5 -= d[55];
        l5 = l16 ^ (0x3300000000L ^ l16) & -1L << (n5 -= d[56]);
        long l17 = l12;
        int n6 = d[57];
        n6 += d[58];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= d[59]);
        while (true) {
            int n7 = d[60];
            n7 -= d[61];
            if ((int)l12 >= (int)(l5 >>> (n7 += d[62]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = d[63];
            n9 += d[64];
            int n10 = d[66];
            n10 ^= d[67];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 -= d[65])) & -1L >>> (n10 += d[68]);
            long l19 = l8;
            int n11 = d[69];
            n11 -= d[70];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= d[71]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = d[72];
            n13 ^= d[73];
            int n14 = d[75];
            n14 += d[76];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 ^= d[74])) & -1L >>> (n14 -= d[77]);
            int n15 = d[78];
            n15 -= d[79];
            long l21 = l9;
            int n16 = d[81];
            n16 += d[82];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= d[80]) ^ l21) & -1L << (n16 ^= d[83]);
            int n17 = d[84];
            n17 ^= d[85];
            n17 += d[86];
            int n18 = d[87];
            n18 ^= d[88];
            long l22 = l11;
            int n19 = d[90];
            n19 -= d[91];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 ^= d[89]))) ^ l22) & -1L >>> (n19 += d[92]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = d[93];
            n20 -= d[94];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= d[95]);
            while (true) {
                int n21 = d[96];
                n21 -= d[97];
                if ((int)(l13 >>> (n21 += d[98])) >= (int)l11) break;
                int n22 = d[99];
                n22 += d[100];
                int n23 = d[102];
                n23 -= d[103];
                cArray2[(int)(l13 >>> (n22 += S.d[101]))] = cArray[(int)l12 + (int)(l13 >>> (n23 ^= d[104]))];
                l13 += 0x100000000L;
            }
            int n24 = d[105];
            n24 += d[106];
            int n25 = (int)(l14 >>> (n24 ^= d[107]));
            l14 += 0x100000000L;
            S.A[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = d[108];
            n26 ^= d[109];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 -= d[110]);
        }
        INSTANCE = new S();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[d[111]];
        String string = (String)object[d[112]];
        object = object[d[113]];
        Object[] objectArray = c;
        if (c == null) {
            objectArray = c = new Object[d[114]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[d[115]];
                b = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[d[117] ^ d[118]];
                byArray[S.d[119] ^ S.d[120]] = d[121] ^ d[122];
                byArray[S.d[123] ^ S.d[124]] = d[125] ^ d[126];
                byArray[S.d[127] ^ S.d[128]] = d[129] ^ d[130];
                byArray[S.d[131] ^ S.d[132]] = d[133] ^ d[134];
                byArray[S.d[135] ^ S.d[136]] = d[137] ^ d[138];
                byArray[S.d[139] ^ S.d[140]] = d[141] ^ d[142];
                byArray[S.d[143] ^ S.d[144]] = d[145] ^ d[146];
                byArray[S.d[147] ^ S.d[148]] = d[149] ^ d[150];
                byArray[S.d[151] ^ S.d[152]] = d[153] ^ d[154];
                byArray[S.d[155] ^ S.d[156]] = d[157] ^ d[158];
                byArray[S.d[159] ^ S.d[160]] = d[161] ^ d[162];
                byArray[S.d[163] ^ S.d[164]] = d[165] ^ d[166];
                byArray[S.d[167] ^ S.d[168]] = d[169] ^ d[170];
                byArray[S.d[171] ^ S.d[172]] = d[173] ^ d[174];
                byArray[S.d[175] ^ S.d[176]] = d[177] ^ d[178];
                byArray[S.d[179] ^ S.d[180]] = d[181] ^ d[182];
                objectArray2[S.d[116]] = byArray;
            }
            byte[] byArray = (byte[])object3[d[183]];
            if (B == null) {
                byte[] byArray2 = new byte[d[184] ^ d[185]];
                byArray2[S.d[186] ^ S.d[187]] = d[188] ^ d[189];
                byArray2[S.d[190] ^ S.d[191]] = d[192] ^ d[193];
                byArray2[S.d[194] ^ S.d[195]] = d[196] ^ d[197];
                byArray2[S.d[198] ^ S.d[199]] = d[200] ^ d[201];
                byArray2[S.d[202] ^ S.d[203]] = d[204] ^ d[205];
                byArray2[S.d[206] ^ S.d[207]] = d[208] ^ d[209];
                byArray2[S.d[210] ^ S.d[211]] = d[212] ^ d[213];
                byArray2[S.d[214] ^ S.d[215]] = d[216] ^ d[217];
                byArray2[S.d[218] ^ S.d[219]] = d[220] ^ d[221];
                byArray2[S.d[222] ^ S.d[223]] = d[224] ^ d[225];
                byArray2[S.d[226] ^ S.d[227]] = d[228] ^ d[229];
                byArray2[S.d[230] ^ S.d[231]] = d[232] ^ d[233];
                byArray2[S.d[234] ^ S.d[235]] = d[236] ^ d[237];
                byArray2[S.d[238] ^ S.d[239]] = d[240] ^ d[241];
                byArray2[S.d[242] ^ S.d[243]] = d[244] ^ d[245];
                byArray2[S.d[246] ^ S.d[247]] = d[248] ^ d[249];
                byArray2[S.d[250] ^ S.d[251]] = d[252] ^ d[253];
                byArray2[S.d[254] ^ S.d[255]] = d[256] ^ d[257];
                byArray2[S.d[258] ^ S.d[259]] = d[260] ^ d[261];
                byArray2[S.d[262] ^ S.d[263]] = d[264] ^ d[265];
                byArray2[S.d[266] ^ S.d[267]] = d[268] ^ d[269];
                byArray2[S.d[270] ^ S.d[271]] = d[272] ^ d[273];
                byArray2[S.d[274] ^ S.d[275]] = d[276] ^ d[277];
                byArray2[S.d[278] ^ S.d[279]] = d[280] ^ d[281];
                byArray2[S.d[282] ^ S.d[283]] = d[284] ^ d[285];
                byArray2[S.d[286] ^ S.d[287]] = d[288] ^ d[289];
                byArray2[S.d[290] ^ S.d[291]] = d[292] ^ d[293];
                byArray2[S.d[294] ^ S.d[295]] = d[296] ^ d[297];
                byArray2[S.d[298] ^ S.d[299]] = d[300] ^ d[301];
                byArray2[S.d[302] ^ S.d[303]] = d[304] ^ d[305];
                byArray2[S.d[306] ^ S.d[307]] = d[308] ^ d[309];
                byArray2[S.d[310] ^ S.d[311]] = d[312] ^ d[313];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, d[314], byArray3, d[315], byArray.length);
                System.arraycopy(byArray2, d[316], byArray3, byArray.length, byArray2.length);
                Object object4 = S.A()[d[317]];
                if (object4 == null) {
                    char[] cArray = "\u1e7c\u1daa\u1e75\u1e70\u1e6e\u1e5a\u1e81\u1e8f\u1ea0\u1e94\u1e74\u1e93\u1e87\u1dcd\u1e7d\u1e74\u1e67\u1e57".toCharArray();
                    for (int i2 = d[318]; i2 < d[319]; ++i2) {
                        int n2 = cArray[i2];
                        n2 -= d[320];
                        n2 -= d[321];
                        n2 -= d[322];
                        n2 += d[323];
                        n2 += d[324];
                        n2 -= d[325];
                        n2 -= d[326];
                        n2 ^= d[327];
                        n2 ^= d[328];
                        n2 += d[329];
                        n2 ^= d[330];
                        n2 += d[331];
                        n2 ^= d[332];
                        cArray[i2] = (char)(n2 -= d[333]);
                    }
                    object4 = S.A()[S.d[334]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[d[335]];
                byArray4[S.d[336]] = d[337];
                byArray4[S.d[338]] = d[339];
                byArray4[S.d[340]] = d[341];
                byArray4[S.d[342]] = d[343];
                byArray4[S.d[344]] = d[345];
                byArray4[S.d[346]] = d[347];
                byArray4[S.d[348]] = d[349];
                byArray4[S.d[350]] = d[351];
                byArray4[S.d[352]] = d[353];
                byArray4[S.d[354]] = d[355];
                byArray4[S.d[356]] = d[357];
                byArray4[S.d[358]] = d[359];
                byArray4[S.d[360]] = d[361];
                byArray4[S.d[362]] = d[363];
                byArray4[S.d[364]] = d[365];
                byArray4[S.d[366]] = d[367];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, d[368], d[369]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = S.A()[d[370]];
                if (object5 == null) {
                    char[] cArray = "\u042f\u0433\u043d".toCharArray();
                    for (int i3 = d[371]; i3 < d[372]; ++i3) {
                        int n3 = cArray[i3];
                        n3 ^= d[373];
                        n3 ^= d[374];
                        n3 += d[375];
                        n3 -= d[376];
                        n3 -= d[377];
                        n3 ^= d[378];
                        n3 -= d[379];
                        n3 += d[380];
                        n3 += d[381];
                        n3 -= d[382];
                        n3 ^= d[383];
                        cArray[i3] = (char)(n3 -= d[384]);
                    }
                    object5 = S.A()[S.d[385]] = new String(cArray);
                }
                B = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, d[386], d[387]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, d[388], byArray6.length);
            Object object6 = S.A()[d[389]];
            if (object6 == null) {
                char[] cArray = "\uf9c7\uf9cb\uf9fd\uf929\uf9cd\uf9ca\uf9cd\uf929\uf9fc\uf9c5\uf9cd\uf9fd\uf9db\uf9fc\uf9e7\uf9f0\uf9f0\uf9df\uf9e6\uf9f1".toCharArray();
                for (int i4 = d[390]; i4 < d[391]; ++i4) {
                    int n4 = cArray[i4];
                    n4 += d[392];
                    n4 += d[393];
                    n4 ^= d[394];
                    n4 -= d[395];
                    n4 += d[396];
                    n4 -= d[397];
                    n4 ^= d[398];
                    n4 -= d[399];
                    n4 += 44749;
                    cArray[i4] = (char)(n4 += 18030);
                }
                object6 = S.A()[3] = new String(cArray);
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
        d = new int[0xA05F ^ 0xA1CF];
        S.d[0x2D50 ^ 0x2DAC] = 0xFFFF314A ^ 0x2DAC;
        S.d[0xAF92 ^ 0xAF6F] = 0x4C2B ^ 0xAF6F;
        S.d[0x8FCB ^ 0x8F5E] = 0xD7A8 ^ 0x8F5E;
        S.d[0x8B13 ^ 0x8B7D] = 0x8B20 ^ 0x8B7D;
        S.d[0xACED ^ 0xADF0] = 0x341D ^ 0xADF0;
        S.d[0x7DAA ^ 0x7CF3] = 0x7CC0 ^ 0x7CF3;
        S.d[0x2056 ^ 0x2057] = 0xFFFFDFFB ^ 0x2057;
        S.d[0x6994 ^ 0x6929] = 0x9577 ^ 0x6929;
        S.d[0x8B30 ^ 0x8BBB] = 0x82D7 ^ 0x8BBB;
        S.d[0xA66B ^ 0xA631] = 0xA636 ^ 0xA631;
        S.d[0x65CA ^ 0x659D] = 0xFFFF9A76 ^ 0x659D;
        S.d[0xA193 ^ 0xA115] = 0xEE7D ^ 0xA115;
        S.d[0x9E2C ^ 0x9E41] = 0x9E0A ^ 0x9E41;
        S.d[0x91EE ^ 0x90EF] = 0x10D ^ 0x90EF;
        S.d[0x4FBB ^ 0x4EB0] = 0x140B4 ^ 0x4EB0;
        S.d[0x610A ^ 0x607F] = 0xA6AF ^ 0x607F;
        S.d[0xE98B ^ 0xE9DA] = 0xFFFF16B4 ^ 0xE9DA;
        S.d[0x56D ^ 0x563] = 0x57D ^ 0x563;
        S.d[0xE2AF ^ 0xE3B4] = 0x7A59 ^ 0xE3B4;
        S.d[0x1EA9 ^ 0x1E6C] = 0x5E69 ^ 0x1E6C;
        S.d[0xED07 ^ 0xEC8B] = 0xB3CC ^ 0xEC8B;
        S.d[0xA7B9 ^ 0xA7B9] = 0xFFFF5852 ^ 0xA7B9;
        S.d[0xC7FF ^ 0xC714] = 0x7045 ^ 0xC714;
        S.d[0xD09B ^ 0xD052] = 0x28BB ^ 0xD052;
        S.d[0xB20C ^ 0xB29C] = 0xD430 ^ 0xB29C;
        S.d[0x4170 ^ 0x4117] = 0x4179 ^ 0x4117;
        S.d[0x11D ^ 0x1BB] = 0xBF80 ^ 0x1BB;
        S.d[0x454F ^ 0x445C] = 0x209E ^ 0x445C;
        S.d[0x76A4 ^ 0x76EF] = 0x7610 ^ 0x76EF;
        S.d[0x5C6B ^ 0x5CC5] = 0xD71D ^ 0x5CC5;
        S.d[0x148C ^ 0x1481] = 0x14CC ^ 0x1481;
        S.d[0x29FF ^ 0x299E] = 0xFFFFD665 ^ 0x299E;
        S.d[0x9928 ^ 0x99F1] = 0x8CDB ^ 0x99F1;
        S.d[0xCFA9 ^ 0xCFB0] = 0xCFA3 ^ 0xCFB0;
        S.d[0xC3B3 ^ 0xC2D8] = 0xFFFF3D0B ^ 0xC2D8;
        S.d[0xBF7F ^ 0xBFF2] = 0xFFFF492A ^ 0xBFF2;
        S.d[0x49FD ^ 0x4922] = 0xA9CB ^ 0x4922;
        S.d[0xBBCF ^ 0xBBF0] = 0xFFFF4419 ^ 0xBBF0;
        S.d[0xE558 ^ 0xE5E1] = 0x3FC5 ^ 0xE5E1;
        S.d[0x87E6 ^ 0x8779] = 0xB3F1 ^ 0x8779;
        S.d[0x7987 ^ 0x78E0] = 0xFFFF8779 ^ 0x78E0;
        S.d[0x1974 ^ 0x1995] = 0xF97C ^ 0x1995;
        S.d[0xB74C ^ 0xB6C2] = 0x2F5B ^ 0xB6C2;
        S.d[0xD53 ^ 0xC67] = 0x5C7D ^ 0xC67;
        S.d[0x1EEF ^ 0x1E94] = 0xCCB0 ^ 0x1E94;
        S.d[0x102B4 ^ 0x10254] = 0x1E2E4 ^ 0x10254;
        S.d[0xEA00 ^ 0xEA44] = 0xFFFF15C1 ^ 0xEA44;
        S.d[0xE74E ^ 0xE713] = 0xFFFF18E7 ^ 0xE713;
        S.d[0x1F8A ^ 0x1FA3] = 0x33C1 ^ 0x1FA3;
        S.d[0x2921 ^ 0x2866] = 0x5B92 ^ 0x2866;
        S.d[0x1334 ^ 0x13D6] = 0x44EB ^ 0x13D6;
        S.d[0x1D6A ^ 0x1DF6] = 0x87F3 ^ 0x1DF6;
        S.d[0xA8B7 ^ 0xA889] = 0xFFFF570B ^ 0xA889;
        S.d[0x8C1E ^ 0x8CC6] = 0xFFFF6657 ^ 0x8CC6;
        S.d[0x3FE1 ^ 0x3ECF] = 0xAE72 ^ 0x3ECF;
        S.d[0xDE58 ^ 0xDED4] = 0xD7B1 ^ 0xDED4;
        S.d[0xBDFD ^ 0xBD51] = 0x3689 ^ 0xBD51;
        S.d[0x5998 ^ 0x59BF] = 0x101F ^ 0x59BF;
        S.d[0xB987 ^ 0xB94C] = 0x554B ^ 0xB94C;
        S.d[0x4986 ^ 0x4974] = 0xE61E ^ 0x4974;
        S.d[0x49E4 ^ 0x48C2] = 0x8CB9 ^ 0x48C2;
        S.d[0xD9EA ^ 0xD8E8] = 0x10ED ^ 0xD8E8;
        S.d[0x31F6 ^ 0x3113] = 0x6628 ^ 0x3113;
        S.d[0xE6B0 ^ 0xE69C] = 0xF174 ^ 0xE69C;
        S.d[0x2ECE ^ 0x2E9C] = 0x2EF4 ^ 0x2E9C;
        S.d[0xB4A5 ^ 0xB415] = 0x9355 ^ 0xB415;
        S.d[0x3FE0 ^ 0x3FE3] = 0x3FB9 ^ 0x3FE3;
        S.d[0xE1F4 ^ 0xE0B7] = 0xE37B ^ 0xE0B7;
        S.d[0xEF86 ^ 0xEF65] = 0xB85E ^ 0xEF65;
        S.d[0x104B6 ^ 0x105A3] = 0x16161 ^ 0x105A3;
        S.d[0x6A8B ^ 0x6B8E] = 0xA39E ^ 0x6B8E;
        S.d[0x2FF0 ^ 0x2E94] = 0x2E94 ^ 0x2E94;
        S.d[0xEA4B ^ 0xEABA] = 0xD23 ^ 0xEABA;
        S.d[0xC25B ^ 0xC294] = 0x1CA54 ^ 0xC294;
        S.d[0xE369 ^ 0xE3DB] = 0xC49B ^ 0xE3DB;
        S.d[0x2192 ^ 0x20C6] = 0x20CC ^ 0x20C6;
        S.d[0x2C16 ^ 0x2C5C] = 0x2C51 ^ 0x2C5C;
        S.d[0x89CE ^ 0x8963] = 0x2B5 ^ 0x8963;
        S.d[0x4C4D ^ 0x4CE8] = 0xF2E9 ^ 0x4CE8;
        S.d[0x1559 ^ 0x1430] = 0x147B ^ 0x1430;
        S.d[0x89C1 ^ 0x88AC] = 0xFFFF7768 ^ 0x88AC;
        S.d[0xAD98 ^ 0xACC8] = 0xACCD ^ 0xACC8;
        S.d[0x4234 ^ 0x43B9] = 0x79FE ^ 0x43B9;
        S.d[0x107EB ^ 0x1073E] = 0x1D0B5 ^ 0x1073E;
        S.d[0x10485 ^ 0x1048D] = 0x104B5 ^ 0x1048D;
        S.d[0x11F9 ^ 0x11BE] = 0xFFFFEE35 ^ 0x11BE;
        S.d[0x362B ^ 0x3767] = 0xD179 ^ 0x3767;
        S.d[0x579 ^ 0x427] = 0x425 ^ 0x427;
        S.d[0x5303 ^ 0x533F] = 0x5389 ^ 0x533F;
        S.d[0x10C3C ^ 0x10D5E] = 0x10D56 ^ 0x10D5E;
        S.d[0xB20E ^ 0xB2FE] = 0x554F ^ 0xB2FE;
        S.d[0x1824 ^ 0x18B7] = 0x4015 ^ 0x18B7;
        S.d[0x22F7 ^ 0x239D] = 0x239C ^ 0x239D;
        S.d[0x724C ^ 0x7374] = 0x5BC1 ^ 0x7374;
        S.d[0x536F ^ 0x530F] = 0x5303 ^ 0x530F;
        S.d[0x2192 ^ 0x21C6] = 0x21CA ^ 0x21C6;
        S.d[0xB3D3 ^ 0xB3A6] = 0x4034 ^ 0xB3A6;
        S.d[0x407C ^ 0x40E5] = 0xFFFF9562 ^ 0x40E5;
        S.d[0x46DA ^ 0x46F1] = 0x4A59 ^ 0x46F1;
        S.d[0x928A ^ 0x930C] = 0x930C ^ 0x930C;
        S.d[0x9856 ^ 0x9826] = 0x9824 ^ 0x9826;
        S.d[0x2460 ^ 0x2528] = 0x4F5D ^ 0x2528;
        S.d[0x983A ^ 0x98F9] = 0xD8FC ^ 0x98F9;
        S.d[0x2CFC ^ 0x2CDD] = 0x2CDD ^ 0x2CDD;
        S.d[0xA506 ^ 0xA546] = 0xA506 ^ 0xA546;
        S.d[0x60D2 ^ 0x61B3] = 0x61CE ^ 0x61B3;
        S.d[0x9FAA ^ 0x9FA1] = 0x9FBF ^ 0x9FA1;
        S.d[0x533F ^ 0x53BF] = 0x112C ^ 0x53BF;
        S.d[0x4A94 ^ 0x4A89] = 0xFFFFB535 ^ 0x4A89;
        S.d[0x744E ^ 0x746C] = 0x746E ^ 0x746C;
        S.d[0x4631 ^ 0x475F] = 0x4750 ^ 0x475F;
        S.d[0x606D ^ 0x60D5] = 0xBAD1 ^ 0x60D5;
        S.d[0xBAE ^ 0xAEA] = 0x4686 ^ 0xAEA;
        S.d[0xAFE9 ^ 0xAF93] = 0x65BF ^ 0xAF93;
        S.d[0x87F6 ^ 0x87B7] = 0x879F ^ 0x87B7;
        S.d[0x10A76 ^ 0x10A52] = 0x10A52 ^ 0x10A52;
        S.d[0x493C ^ 0x482B] = 0xD619 ^ 0x482B;
        S.d[0xF439 ^ 0xF568] = 0xF557 ^ 0xF568;
        S.d[0xA5F0 ^ 0xA547] = 0xA547 ^ 0xA547;
        S.d[0x3F03 ^ 0x3E03] = 0xAFF1 ^ 0x3E03;
        S.d[0x1694 ^ 0x17D2] = 0x1C41 ^ 0x17D2;
        S.d[0x1148 ^ 0x11AF] = 0x111CE ^ 0x11AF;
        S.d[0xC28C ^ 0xC262] = 0x25EC ^ 0xC262;
        S.d[0x1020C ^ 0x10329] = 0x1259D ^ 0x10329;
        S.d[0x3AA5 ^ 0x3B25] = 0x64FA ^ 0x3B25;
        S.d[0x7856 ^ 0x78A8] = 0xE951 ^ 0x78A8;
        S.d[0xCAAA ^ 0xCA80] = 0x8107 ^ 0xCA80;
        S.d[0xF212 ^ 0xF314] = 0xA60B ^ 0xF314;
        S.d[0x5621 ^ 0x5672] = 0xFFFFA984 ^ 0x5672;
        S.d[0x62C5 ^ 0x628C] = 0xFFFF9D21 ^ 0x628C;
        S.d[0xCED9 ^ 0xCE2C] = 0x614F ^ 0xCE2C;
        S.d[0xBFE0 ^ 0xBFA3] = 0xBFF4 ^ 0xBFA3;
        S.d[0x40A8 ^ 0x406A] = 0x72 ^ 0x406A;
        S.d[0xB611 ^ 0xB763] = 0xB761 ^ 0xB763;
        S.d[0x2ADE ^ 0x2BBE] = 0x2BB3 ^ 0x2BBE;
        S.d[0x2E97 ^ 0x2E88] = 0x2E88 ^ 0x2E88;
        S.d[0xB448 ^ 0xB44F] = 0xFFFF4BA2 ^ 0xB44F;
        S.d[0xEF4D ^ 0xEFD9] = 0xB776 ^ 0xEFD9;
        S.d[0xB1CE ^ 0xB1FE] = 0x9A2A ^ 0xB1FE;
        S.d[0x6816 ^ 0x68FB] = 0xDFAA ^ 0x68FB;
        S.d[0x13CE ^ 0x1287] = 0xA351 ^ 0x1287;
        S.d[0xBAFC ^ 0xBBE0] = 0xFFFFDDFB ^ 0xBBE0;
        S.d[0x2009 ^ 0x2061] = 0xFFFFDFD1 ^ 0x2061;
        S.d[0x1A45 ^ 0x1BC6] = 0x1BD6 ^ 0x1BC6;
        S.d[0xFA12 ^ 0xFAA6] = 0x97F7 ^ 0xFAA6;
        S.d[0xC5ED ^ 0xC5E7] = 0xFFFF3A78 ^ 0xC5E7;
        S.d[0x8493 ^ 0x8587] = 0xE151 ^ 0x8587;
        S.d[0xDA36 ^ 0xDB06] = 0x4BC6 ^ 0xDB06;
        S.d[0x4114 ^ 0x4110] = 0x4114 ^ 0x4110;
        S.d[0x479F ^ 0x46B7] = 0xFFFF7D44 ^ 0x46B7;
        S.d[0x1232 ^ 0x12F3] = 0xEB24 ^ 0x12F3;
        S.d[0x5462 ^ 0x5541] = 0x73F5 ^ 0x5541;
        S.d[0xC93A ^ 0xC9D3] = 0x1C9B2 ^ 0xC9D3;
        S.d[0x5E60 ^ 0x5EB4] = 0xFFFF76BF ^ 0x5EB4;
        S.d[0x93F ^ 0x9A7] = 0x23DE ^ 0x9A7;
        S.d[0x2892 ^ 0x2854] = 0xD0B1 ^ 0x2854;
        S.d[0xD03F ^ 0xD005] = 0xFFFF2F9E ^ 0xD005;
        S.d[0x51AF ^ 0x5165] = 0xBD61 ^ 0x5165;
        S.d[0x89E3 ^ 0x88D8] = 0x88D8 ^ 0x88D8;
        S.d[0xC474 ^ 0xC545] = 0x55E8 ^ 0xC545;
        S.d[0x10900 ^ 0x10858] = 0x10853 ^ 0x10858;
        S.d[0xD29B ^ 0xD310] = 0x6773 ^ 0xD310;
        S.d[0x5968 ^ 0x594D] = 0x59D5 ^ 0x594D;
        S.d[0x9C4 ^ 0x8BB] = 0xEDB6 ^ 0x8BB;
        S.d[0x26B4 ^ 0x27F9] = 0xCA27 ^ 0x27F9;
        S.d[0x627D ^ 0x6372] = 0x4807 ^ 0x6372;
        S.d[0x749C ^ 0x75EF] = 0x75EF ^ 0x75EF;
        S.d[0x104D0 ^ 0x1048B] = 0x104DD ^ 0x1048B;
        S.d[0xBE1D ^ 0xBEB9] = 0x82 ^ 0xBEB9;
        S.d[0xF16 ^ 0xF97] = 0xFFFFB283 ^ 0xF97;
        S.d[0x754A ^ 0x75F5] = 0x8C22 ^ 0x75F5;
        S.d[0x10C9C ^ 0x10DB6] = 0x1E730 ^ 0x10DB6;
        S.d[0xB2AF ^ 0xB280] = 0xB674 ^ 0xB280;
        S.d[0xE5B1 ^ 0xE4B8] = 0xB1AD ^ 0xE4B8;
        S.d[0xAA06 ^ 0xAAFD] = 0x49B9 ^ 0xAAFD;
        S.d[0xA172 ^ 0xA1B5] = 0x595C ^ 0xA1B5;
        S.d[0x64B5 ^ 0x6591] = 0xFFFFBCDF ^ 0x6591;
        S.d[0xF562 ^ 0xF52A] = 0xFFFF0A8B ^ 0xF52A;
        S.d[0x296C ^ 0x294A] = 0xC4A ^ 0x294A;
        S.d[0x8BDB ^ 0x8AE8] = 0xDAFB ^ 0x8AE8;
        S.d[0x743F ^ 0x74D0] = 0x9349 ^ 0x74D0;
        S.d[0x26D0 ^ 0x26A4] = 0x26A4 ^ 0x26A4;
        S.d[0xB383 ^ 0xB3FE] = 0xFFFF9E4F ^ 0xB3FE;
        S.d[0x9B42 ^ 0x9A2A] = 0x9A29 ^ 0x9A2A;
        S.d[0x10545 ^ 0x1040F] = 0x15D13 ^ 0x1040F;
        S.d[0xD7E ^ 0xDE5] = 0x97E5 ^ 0xDE5;
        S.d[0xABC ^ 0xBE6] = 0xBEF ^ 0xBE6;
        S.d[0x1049D ^ 0x105D2] = 0x105C2 ^ 0x105D2;
        S.d[0xD8AC ^ 0xD9E9] = 0x499A ^ 0xD9E9;
        S.d[0xD23E ^ 0xD203] = 0xD21B ^ 0xD203;
        S.d[0xFBFF ^ 0xFBA0] = 0xFB98 ^ 0xFBA0;
        S.d[0xE1BA ^ 0xE174] = 0x1E9BC ^ 0xE174;
        S.d[0x9728 ^ 0x9757] = 0xD5C7 ^ 0x9757;
        S.d[0x1EA3 ^ 0x1FFE] = 0xFFFFE02C ^ 0x1FFE;
        S.d[0x9418 ^ 0x954B] = 0xFFFF6A9C ^ 0x954B;
        S.d[0x6A24 ^ 0x6B72] = 0x6B74 ^ 0x6B72;
        S.d[0xB46E ^ 0xB4DB] = 0xD9C5 ^ 0xB4DB;
        S.d[0xBBD7 ^ 0xBAB2] = 0xBA8A ^ 0xBAB2;
        S.d[0x8545 ^ 0x8432] = 0xF52 ^ 0x8432;
        S.d[0x29B ^ 0x28A] = 0x2CC ^ 0x28A;
        S.d[0x8E3B ^ 0x8E67] = 0x8E08 ^ 0x8E67;
        S.d[0x6918 ^ 0x6929] = 0xF212 ^ 0x6929;
        S.d[0xC07A ^ 0xC01C] = 0xFFFF3FE2 ^ 0xC01C;
        S.d[0x458C ^ 0x44C7] = 0x46BA ^ 0x44C7;
        S.d[0xDCF2 ^ 0xDC23] = 0x1D4E3 ^ 0xDC23;
        S.d[0x6676 ^ 0x66E8] = 0xFCED ^ 0x66E8;
        S.d[0x4D76 ^ 0x4C0D] = 0xFCA5 ^ 0x4C0D;
        S.d[0x4B92 ^ 0x4BF1] = 0xFFFFB422 ^ 0x4BF1;
        S.d[0x9D5B ^ 0x9D43] = 0x9D4D ^ 0x9D43;
        S.d[0x7F30 ^ 0x7FAA] = 0x55D3 ^ 0x7FAA;
        S.d[0x47D8 ^ 0x46D0] = 0x13AB ^ 0x46D0;
        S.d[0x6C9A ^ 0x6C8D] = 0xFFFF930A ^ 0x6C8D;
        S.d[0xDA8F ^ 0xDBE0] = 0xDBAD ^ 0xDBE0;
        S.d[0x1006D ^ 0x100BF] = 0x1D72E ^ 0x100BF;
        S.d[0x4280 ^ 0x43DC] = 0x43DB ^ 0x43DC;
        S.d[0x7A98 ^ 0x7B9B] = 0xB38B ^ 0x7B9B;
        S.d[0xAE82 ^ 0xAF85] = 0xFA90 ^ 0xAF85;
        S.d[0x8CA3 ^ 0x8DBC] = 0xEE86 ^ 0x8DBC;
        S.d[0x352E ^ 0x3515] = 0x3563 ^ 0x3515;
        S.d[0x6066 ^ 0x61EE] = 0x5A6F ^ 0x61EE;
        S.d[0xF502 ^ 0xF48D] = 0x1726 ^ 0xF48D;
        S.d[0x2FC2 ^ 0x2FDC] = 0x2FDF ^ 0x2FDC;
        S.d[0x625D ^ 0x62FD] = 0x5677 ^ 0x62FD;
        S.d[0x92D3 ^ 0x92E0] = 0xECDE ^ 0x92E0;
        S.d[0xE8DD ^ 0xE852] = 0x8EF4 ^ 0xE852;
        S.d[0xFE9F ^ 0xFE8F] = 0xFECE ^ 0xFE8F;
        S.d[0xB518 ^ 0xB439] = 0xD703 ^ 0xB439;
        S.d[0x6EE7 ^ 0x6FFD] = 0xF608 ^ 0x6FFD;
        S.d[0xDFAD ^ 0xDFC2] = 0xDFC3 ^ 0xDFC2;
        S.d[0x7E83 ^ 0x7FC2] = 0xE165 ^ 0x7FC2;
        S.d[0xF4AD ^ 0xF4BF] = 0xF4F4 ^ 0xF4BF;
        S.d[0x9532 ^ 0x954B] = 0xFFFFA0E3 ^ 0x954B;
        S.d[0x6667 ^ 0x67ED] = 0xE6AF ^ 0x67ED;
        S.d[0x1055C ^ 0x10426] = 0x1ECE1 ^ 0x10426;
        S.d[0xD710 ^ 0xD727] = 0xD77D ^ 0xD727;
        S.d[0xE2C3 ^ 0xE3D5] = 0x7DE2 ^ 0xE3D5;
        S.d[0xD126 ^ 0xD010] = 0xF8D0 ^ 0xD010;
        S.d[0x5083 ^ 0x51BE] = 0x51BF ^ 0x51BE;
        S.d[0xC28E ^ 0xC219] = 0xE860 ^ 0xC219;
        S.d[0x4FD1 ^ 0x4F35] = 0x1877 ^ 0x4F35;
        S.d[0x70EC ^ 0x70F0] = 0xFFFF8F0E ^ 0x70F0;
        S.d[0xAD68 ^ 0xADCF] = 0xE095 ^ 0xADCF;
        S.d[0x3D32 ^ 0x3D04] = 0x3D6B ^ 0x3D04;
        S.d[0x1F48 ^ 0x1E61] = 0xDA1B ^ 0x1E61;
        S.d[0xF42C ^ 0xF5AE] = 0xF5AE ^ 0xF5AE;
        S.d[0x1724 ^ 0x178C] = 0x5ADA ^ 0x178C;
        S.d[0xEE5E ^ 0xEEB8] = 0x1EEDB ^ 0xEEB8;
        S.d[0x8CCB ^ 0x8CFE] = 0x8CFE ^ 0x8CFE;
        S.d[0x1002E ^ 0x10123] = 0xF27 ^ 0x10123;
        S.d[0x9BB1 ^ 0x9BAA] = 0x9BC8 ^ 0x9BAA;
        S.d[0x8832 ^ 0x8891] = 0x36A4 ^ 0x8891;
        S.d[0xEC04 ^ 0xED28] = 0x7C3 ^ 0xED28;
        S.d[0x33CD ^ 0x3388] = 0xFFFFCCDF ^ 0x3388;
        S.d[0x6FBA ^ 0x6FF4] = 0xFFFF9037 ^ 0x6FF4;
        S.d[0xC3A9 ^ 0xC286] = 0x522B ^ 0xC286;
        S.d[0x359D ^ 0x356E] = 0x9A0D ^ 0x356E;
        S.d[0x66CE ^ 0x6690] = 0xFFFF994C ^ 0x6690;
        S.d[0xCEC ^ 0xC28] = 0xFFFFB393 ^ 0xC28;
        S.d[0x3355 ^ 0x332B] = 0xE108 ^ 0x332B;
        S.d[0x5FBB ^ 0x5ED7] = 0x5ED9 ^ 0x5ED7;
        S.d[0x7D74 ^ 0x7D78] = 0xFFFF82D7 ^ 0x7D78;
        S.d[0x1098 ^ 0x10C8] = 0xFFFFEF31 ^ 0x10C8;
        S.d[0x9220 ^ 0x920E] = 0x5CDF ^ 0x920E;
        S.d[0x2F3F ^ 0x2FB7] = 0x237D ^ 0x2FB7;
        S.d[0x3EF4 ^ 0x3EB6] = 0x3E7A ^ 0x3EB6;
        S.d[0x540F ^ 0x5422] = 0x72AE ^ 0x5422;
        S.d[0xD10F ^ 0xD13D] = 0x6006 ^ 0xD13D;
        S.d[0x49BD ^ 0x49BF] = 0x49FA ^ 0x49BF;
        S.d[0xFEB6 ^ 0xFE4F] = 0xABC4 ^ 0xFE4F;
        S.d[0xD40 ^ 0xC6D] = 0xE6E0 ^ 0xC6D;
        S.d[0x4CDA ^ 0x4C5F] = 0x335 ^ 0x4C5F;
        S.d[0x5EE1 ^ 0x5FF9] = 0xC1C4 ^ 0x5FF9;
        S.d[0x8DCB ^ 0x8D16] = 0xA9E2 ^ 0x8D16;
        S.d[0xB19A ^ 0xB1D7] = 0xB1BB ^ 0xB1D7;
        S.d[0x2805 ^ 0x2984] = 0x2986 ^ 0x2984;
        S.d[0x62F8 ^ 0x63AA] = 0x63A6 ^ 0x63AA;
        S.d[0x250E ^ 0x241C] = 0x40CD ^ 0x241C;
        S.d[0x39D9 ^ 0x38F9] = 0xFFFFA435 ^ 0x38F9;
        S.d[0x88AC ^ 0x8828] = 0xC740 ^ 0x8828;
        S.d[0x70C ^ 0x7BA] = 0x6AEB ^ 0x7BA;
        S.d[0x10FC1 ^ 0x10EFF] = 0x10EFF ^ 0x10EFF;
        S.d[0x13AF ^ 0x12E1] = 0x12E0 ^ 0x12E1;
        S.d[0x3499 ^ 0x34AD] = 0x2B53 ^ 0x34AD;
        S.d[0xE43F ^ 0xE4FF] = 0xFFFFE282 ^ 0xE4FF;
        S.d[0x8898 ^ 0x88EE] = 0x7B6C ^ 0x88EE;
        S.d[0x4DC4 ^ 0x4D77] = 0x202E ^ 0x4D77;
        S.d[0x3A43 ^ 0x3A9F] = 0x1E7C ^ 0x3A9F;
        S.d[0xB6A ^ 0xA53] = 0x229D ^ 0xA53;
        S.d[0xD45E ^ 0xD4CC] = 0xB260 ^ 0xD4CC;
        S.d[0x5B28 ^ 0x5A4E] = 0x5A4A ^ 0x5A4E;
        S.d[0x634F ^ 0x6300] = 0xFFFF9CAA ^ 0x6300;
        S.d[0x6D81 ^ 0x6D06] = 0x61C7 ^ 0x6D06;
        S.d[0x325E ^ 0x333D] = 0xFFFFCCA3 ^ 0x333D;
        S.d[0x18F ^ 0xB5] = 0xB5 ^ 0xB5;
        S.d[0x76D5 ^ 0x7664] = 0xFFFFAE85 ^ 0x7664;
        S.d[0x1926 ^ 0x1970] = 0xFFFFE6B4 ^ 0x1970;
        S.d[0xA1F1 ^ 0xA0CD] = 0xA0CD ^ 0xA0CD;
        S.d[0x22B8 ^ 0x23E3] = 0xFFFFDC47 ^ 0x23E3;
        S.d[0xC06D ^ 0xC0CC] = 0xFFFF0B8E ^ 0xC0CC;
        S.d[0x13D0 ^ 0x137B] = 0x98A5 ^ 0x137B;
        S.d[0xA8EA ^ 0xA83A] = 0x1A0C2 ^ 0xA83A;
        S.d[0xD4E1 ^ 0xD5ED] = 0x1DB8B ^ 0xD5ED;
        S.d[0xBDEC ^ 0xBC65] = 0xEEE4 ^ 0xBC65;
        S.d[0x10475 ^ 0x1056C] = 0x19B5E ^ 0x1056C;
        S.d[0x2D ^ 0x3B] = 0x7A ^ 0x3B;
        S.d[0x8CF4 ^ 0x8C7E] = 0x80B4 ^ 0x8C7E;
        S.d[0xE057 ^ 0xE12F] = 0xD8FE ^ 0xE12F;
        S.d[0xC485 ^ 0xC407] = 0x8694 ^ 0xC407;
        S.d[0x7CB6 ^ 0x7CFA] = 0xFFFF8377 ^ 0x7CFA;
        S.d[0x3C8F ^ 0x3C06] = 0xFFFFCF1C ^ 0x3C06;
        S.d[0x5737 ^ 0x5649] = 0xA454 ^ 0x5649;
        S.d[0x10C34 ^ 0x10D24] = 0xFFFED9BF ^ 0x10D24;
        S.d[0xD0A9 ^ 0xD1D4] = 0x1768 ^ 0xD1D4;
        S.d[0x6BB8 ^ 0x6B12] = 0x2644 ^ 0x6B12;
        S.d[0x1F93 ^ 0x1FCA] = 0xFFFFE041 ^ 0x1FCA;
        S.d[0x8A73 ^ 0x8A75] = 0x8A50 ^ 0x8A75;
        S.d[0xEA69 ^ 0xEA00] = 0xFFFF1562 ^ 0xEA00;
        S.d[0x680C ^ 0x68AE] = 0x5C24 ^ 0x68AE;
        S.d[0xFBCE ^ 0xFACA] = 0xFFFFCD04 ^ 0xFACA;
        S.d[0x2112 ^ 0x211D] = 0x2119 ^ 0x211D;
        S.d[0x15B1 ^ 0x1532] = 0x5A5E ^ 0x1532;
        S.d[0x939C ^ 0x93ED] = 0x93ED ^ 0x93ED;
        S.d[0x14 ^ 0x2D] = 0xD6 ^ 0x2D;
        S.d[0x2E74 ^ 0x2FF3] = 0x2FE7 ^ 0x2FF3;
        S.d[0x80CB ^ 0x8010] = 0xA4E4 ^ 0x8010;
        S.d[0xC8EC ^ 0xC9DB] = 0xE115 ^ 0xC9DB;
        S.d[0x1A1B ^ 0x1B15] = 0x306F ^ 0x1B15;
        S.d[0xA915 ^ 0xA804] = 0x8371 ^ 0xA804;
        S.d[0x369B ^ 0x37B9] = 0x110D ^ 0x37B9;
        S.d[0x1ACE ^ 0x1BBA] = 0x1BB9 ^ 0x1BBA;
        S.d[0x9C88 ^ 0x9CED] = 0x9CE7 ^ 0x9CED;
        S.d[0x2FEC ^ 0x2EBB] = 0x2E93 ^ 0x2EBB;
        S.d[0x5374 ^ 0x531F] = 0xFFFFACFD ^ 0x531F;
        S.d[0x2A4C ^ 0x2A3F] = 0x2A3E ^ 0x2A3F;
        S.d[0xDF15 ^ 0xDFC3] = 0xCAF7 ^ 0xDFC3;
        S.d[0x7BD4 ^ 0x7B45] = 0xFFFFE239 ^ 0x7B45;
        S.d[0x26F1 ^ 0x2787] = 0x58B7 ^ 0x2787;
        S.d[0x10CD ^ 0x1064] = 0x5D4C ^ 0x1064;
        S.d[0x3926 ^ 0x3942] = 0x3901 ^ 0x3942;
        S.d[0xD486 ^ 0xD479] = 0x459B ^ 0xD479;
        S.d[0xA13B ^ 0xA025] = 0xC312 ^ 0xA025;
        S.d[0xA83A ^ 0xA8D6] = 0xFFFFE06F ^ 0xA8D6;
        S.d[0x45E4 ^ 0x44BB] = 0xFFFFBB30 ^ 0x44BB;
        S.d[0x8346 ^ 0x832C] = 0x834C ^ 0x832C;
        S.d[0xC262 ^ 0xC357] = 0x9344 ^ 0xC357;
        S.d[0x1BAB ^ 0x1B04] = 0x3C4B ^ 0x1B04;
        S.d[0xEC08 ^ 0xEC7F] = 0x2652 ^ 0xEC7F;
        S.d[0xB78B ^ 0xB7D3] = 0xB793 ^ 0xB7D3;
        S.d[0x1B9D ^ 0x1BA5] = 0xFFFFE450 ^ 0x1BA5;
        S.d[0x10C14 ^ 0x10D56] = 0x1B13D ^ 0x10D56;
        S.d[0xF1C0 ^ 0xF128] = 0x1F17D ^ 0xF128;
        S.d[0x4535 ^ 0x4516] = 0x4516 ^ 0x4516;
        S.d[0x1D4A ^ 0x1D90] = 0x397D ^ 0x1D90;
        S.d[0x6620 ^ 0x6775] = 0xFFFF9890 ^ 0x6775;
        S.d[0x8DC3 ^ 0x8CE4] = 0x489E ^ 0x8CE4;
        S.d[0x9DFD ^ 0x9D07] = 0x7E5C ^ 0x9D07;
        S.d[0x994D ^ 0x999A] = 0x8CB0 ^ 0x999A;
        S.d[0xF506 ^ 0xF56A] = 0xF55C ^ 0xF56A;
        S.d[0xE81D ^ 0xE8A1] = 0xFFFFEB31 ^ 0xE8A1;
        S.d[0xFB47 ^ 0xFB35] = 0xFB34 ^ 0xFB35;
        S.d[0x1CC8 ^ 0x1C8E] = 0xFFFFE322 ^ 0x1C8E;
        S.d[0x838D ^ 0x8384] = 0xFFFF7C06 ^ 0x8384;
        S.d[0x2063 ^ 0x20D8] = 0xDC86 ^ 0x20D8;
        S.d[0xADB7 ^ 0xAD97] = 0xAD96 ^ 0xAD97;
        S.d[0x3F24 ^ 0x3E55] = 0x3F55 ^ 0x3E55;
        S.d[0x8D27 ^ 0x8C0C] = 0x6681 ^ 0x8C0C;
        S.d[0x204D ^ 0x2065] = 0xD125 ^ 0x2065;
        S.d[0xC574 ^ 0xC567] = 0xFFFF3ACD ^ 0xC567;
        S.d[0x23BF ^ 0x23C3] = 0xF1E0 ^ 0x23C3;
        S.d[0xD454 ^ 0xD498] = 0xFFFFC71B ^ 0xD498;
        S.d[0x417B ^ 0x41ED] = 0x1942 ^ 0x41ED;
        S.d[0x7408 ^ 0x741D] = 0xFFFF745B ^ 0x741D;
        S.d[0x9223 ^ 0x92AD] = 0x9BC8 ^ 0x92AD;
        S.d[0x44EF ^ 0x4593] = 0x5C9A ^ 0x4593;
        S.d[0x230 ^ 0x2C7] = 0x574C ^ 0x2C7;
        S.d[0xE063 ^ 0xE066] = 0xE039 ^ 0xE066;
        S.d[0x667A ^ 0x66C0] = 0x9A82 ^ 0x66C0;
        S.d[0xA520 ^ 0xA5D8] = 0xFFFF0F96 ^ 0xA5D8;
        S.d[0xBADB ^ 0xBBD1] = 0x1B5C7 ^ 0xBBD1;
        S.d[0x3664 ^ 0x37E0] = 0x37F0 ^ 0x37E0;
        S.d[0x2834 ^ 0x284C] = 0xE260 ^ 0x284C;
        S.d[0x86A ^ 0x8B4] = 0xE859 ^ 0x8B4;
        S.d[0x4AAA ^ 0x4ABE] = 0xFFFFB57F ^ 0x4ABE;
        S.d[0x7898 ^ 0x7805] = 0xE213 ^ 0x7805;
        S.d[0xCBF7 ^ 0xCB03] = 0x642D ^ 0xCB03;
        S.d[0x1049 ^ 0x11CC] = 0x11CF ^ 0x11CC;
        S.d[0x20F7 ^ 0x203A] = 0xCC3D ^ 0x203A;
        S.d[0xC267 ^ 0xC355] = 0x9350 ^ 0xC355;
        S.d[0x626C ^ 0x62BF] = 0xB534 ^ 0x62BF;
        S.d[0xF62E ^ 0xF6D8] = 0xA342 ^ 0xF6D8;
        S.d[0x766C ^ 0x7715] = 0x1961 ^ 0x7715;
        S.d[0x7B56 ^ 0x7B9E] = 0xFFFF7C9A ^ 0x7B9E;
        S.d[0xDE8E ^ 0xDEDB] = 0xDE9B ^ 0xDEDB;
        S.d[0x3ECC ^ 0x3FBC] = 0x3FAC ^ 0x3FBC;
        S.d[0x1013 ^ 0x1009] = 0xFFFFEFF1 ^ 0x1009;
        S.d[0xFCD5 ^ 0xFDEA] = 0xFDF8 ^ 0xFDEA;
        S.d[0x69B9 ^ 0x69DB] = 0x69D4 ^ 0x69DB;
        S.d[0xDFE3 ^ 0xDEA3] = 0x1AE7 ^ 0xDEA3;
        S.d[0xA056 ^ 0xA0BC] = 0x17F9 ^ 0xA0BC;
        S.d[0x88F ^ 0x831] = 0xF1E1 ^ 0x831;
    }
}

