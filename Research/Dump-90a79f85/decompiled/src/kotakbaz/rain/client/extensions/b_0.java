/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.class_310
 *  net.minecraft.class_636
 *  net.minecraft.class_638
 *  net.minecraft.class_746
 */
package kotakbaz.rain.client.extensions;

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
import net.minecraft.class_310;
import net.minecraft.class_636;
import net.minecraft.class_638;
import net.minecraft.class_746;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from kotakbaz.rain.client.extensions.b
 */
@Metadata(mv={2, 3, 0}, k=2, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0011\u0010\u0003\u001a\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0001\u0010\u0002\"\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u000b\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0011\u0010\u000f\u001a\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2={"Lnet/minecraft/class_310;", "getMc", "()Lnet/minecraft/class_310;", "mc", "Lnet/minecraft/class_746;", "getPlayer", "()Lnet/minecraft/class_746;", "player", "Lnet/minecraft/class_638;", "getWorld", "()Lnet/minecraft/class_638;", "world", "Lnet/minecraft/class_636;", "getInteractionManager", "()Lnet/minecraft/class_636;", "interactionManager", "rain-visuals"})
public final class b_0 {
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    @NotNull
    public static final class_310 getMc() {
        class_310 class_3102 = class_310.method_1551();
        int n = C[0];
        n ^= C[1];
        int n2 = C[3];
        n2 -= C[4];
        Intrinsics.checkNotNullExpressionValue(class_3102, (String)a[n ^= C[2]] + (String)a[n2 += C[5]]);
        return class_3102;
    }

    @NotNull
    public static final class_746 getPlayer() {
        class_746 class_7462 = b_0.getMc().field_1724;
        Intrinsics.checkNotNull(class_7462);
        return class_7462;
    }

    @NotNull
    public static final class_638 getWorld() {
        class_638 class_6382 = b_0.getMc().field_1687;
        Intrinsics.checkNotNull(class_6382);
        return class_6382;
    }

    @NotNull
    public static final class_636 getInteractionManager() {
        class_636 class_6362 = b_0.getMc().field_1761;
        Intrinsics.checkNotNull(class_6362);
        return class_6362;
    }

    static {
        b_0.b();
        long l = 1672623304148589829L;
        long l2 = 2605263473309722809L;
        long l3 = 1049778672690078144L;
        long l4 = 4668699482453833093L;
        long l5 = -5015909342977173285L;
        long l6 = 4932992298138427123L;
        long l7 = -5762436453467812869L;
        long l8 = -6971411998194102171L;
        long l9 = -4110309165708184280L;
        long l10 = 3401962605336276599L;
        long l11 = 2751486096433846723L;
        long l12 = 2900834007860686091L;
        long l13 = -4971273004149874505L;
        long l14 = -8756955716184542559L;
        int n = C[6];
        n -= C[7];
        a = new Object[n ^= C[8]];
        long l15 = l14;
        int n2 = C[9];
        n2 -= C[10];
        l14 = l15 ^ (0L ^ l15) & -1L << (n2 -= C[11]);
        Object[] objectArray = new Object[C[12]];
        objectArray[b_0.C[13]] = A;
        objectArray[b_0.C[14]] = C[15];
        int n3 = C[16];
        Object object = b_0.A()[C[17]];
        if (object == null) {
            char[] cArray = "\uf10c\uf130\ue63a\uf0dc\uf0bf\uf0cd\uf125\uf0f8\uf11d\ue673\uf11d\ue676\ue62e\uf0bf\uf102\uf106\uf0ef\uf0e9\uf0ec\uf0e0\uf0dc\uf0e8\uf10d\uf0fa\uf108\uf0e9\uf0d2\uf0c2\ue645\uf100\uf0ff\uf0bb\ue676\uf0ed\uf109\uf0cd\uf0dc\uf0ee\uf0bc\uf131\uf0d2\uf0ec\uf10b\uf105\uf0e6\uf0d0\uf0db\uf0ee\uf0fc\uf0c2\uf136\uf0cd\uf0f8\uf0e8\uf102\uf0ff\ue63a\uf0db\uf10c\uf11a\ue645\uf132\ue62e\uf0e0".toCharArray();
            for (int i = C[18]; i < C[19]; ++i) {
                int n4 = cArray[i];
                n4 += C[20];
                n4 += C[21];
                n4 ^= C[22];
                n4 += C[23];
                n4 ^= C[24];
                n4 += C[25];
                n4 ^= C[26];
                n4 ^= C[27];
                n4 ^= C[28];
                n4 -= C[29];
                cArray[i] = (char)(n4 -= C[30]);
            }
            object = b_0.A()[b_0.C[31]] = new String(cArray);
        }
        objectArray[n3] = (String)object;
        char[] cArray = ((String)b_0.a(objectArray)).toCharArray();
        long l16 = l5;
        int n5 = C[32];
        n5 += C[33];
        l5 = l16 ^ (0x1400000000L ^ l16) & -1L << (n5 ^= C[34]);
        long l17 = l12;
        int n6 = C[35];
        n6 += C[36];
        l12 = l17 ^ (0L ^ l17) & -1L >>> (n6 -= C[37]);
        while (true) {
            int n7 = C[38];
            n7 ^= C[39];
            if ((int)l12 >= (int)(l5 >>> (n7 += C[40]))) break;
            int n8 = (int)l12;
            long l18 = l12;
            int n9 = C[41];
            n9 += C[42];
            int n10 = C[44];
            n10 += C[45];
            l12 = l18 ^ (l18 ^ l18 + (long)(n9 ^= C[43])) & -1L >>> (n10 += C[46]);
            long l19 = l8;
            int n11 = C[47];
            n11 ^= C[48];
            l8 = l19 ^ ((long)cArray[n8] ^ l19) & -1L >>> (n11 -= C[49]);
            int n12 = (int)l12;
            long l20 = l12;
            int n13 = C[50];
            n13 ^= C[51];
            int n14 = C[53];
            n14 -= C[54];
            l12 = l20 ^ (l20 ^ l20 + (long)(n13 -= C[52])) & -1L >>> (n14 += C[55]);
            int n15 = C[56];
            n15 -= C[57];
            long l21 = l9;
            int n16 = C[59];
            n16 ^= C[60];
            l9 = l21 ^ ((long)cArray[n12] << (n15 -= C[58]) ^ l21) & -1L << (n16 -= C[61]);
            int n17 = C[62];
            n17 ^= C[63];
            n17 ^= C[64];
            int n18 = C[65];
            n18 ^= C[66];
            long l22 = l11;
            int n19 = C[68];
            n19 ^= C[69];
            l11 = l22 ^ ((long)((int)l8 << n17 | (int)(l9 >>> (n18 -= C[67]))) ^ l22) & -1L >>> (n19 ^= C[70]);
            char[] cArray2 = new char[(int)l11];
            long l23 = l13;
            int n20 = C[71];
            n20 ^= C[72];
            l13 = l23 ^ (0L ^ l23) & -1L << (n20 ^= C[73]);
            while (true) {
                int n21 = C[74];
                n21 ^= C[75];
                if ((int)(l13 >>> (n21 -= C[76])) >= (int)l11) break;
                int n22 = C[77];
                n22 ^= C[78];
                int n23 = C[80];
                n23 ^= C[81];
                cArray2[(int)(l13 >>> (n22 += b_0.C[79]))] = cArray[(int)l12 + (int)(l13 >>> (n23 -= C[82]))];
                l13 += 0x100000000L;
            }
            int n24 = C[83];
            n24 -= C[84];
            int n25 = (int)(l14 >>> (n24 ^= C[85]));
            l14 += 0x100000000L;
            b_0.a[n25] = new String(cArray2);
            long l24 = l12;
            int n26 = C[86];
            n26 -= C[87];
            l12 = l24 ^ ((long)((int)l12 + (int)l11) ^ l24) & -1L >>> (n26 ^= C[88]);
        }
    }

    public static Object a(Object[] object) {
        Object object2;
        int n = (Integer)object[C[89]];
        String string = (String)object[C[90]];
        object = object[C[91]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[92]];
        }
        if ((object2 = objectArray[n]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[93]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[95] ^ C[96]];
                byArray[b_0.C[97] ^ b_0.C[98]] = C[99] ^ C[100];
                byArray[b_0.C[101] ^ b_0.C[102]] = C[103] ^ C[104];
                byArray[b_0.C[105] ^ b_0.C[106]] = C[107] ^ C[108];
                byArray[b_0.C[109] ^ b_0.C[110]] = C[111] ^ C[112];
                byArray[b_0.C[113] ^ b_0.C[114]] = C[115] ^ C[116];
                byArray[b_0.C[117] ^ b_0.C[118]] = C[119] ^ C[120];
                byArray[b_0.C[121] ^ b_0.C[122]] = C[123] ^ C[124];
                byArray[b_0.C[125] ^ b_0.C[126]] = C[127] ^ C[128];
                byArray[b_0.C[129] ^ b_0.C[130]] = C[131] ^ C[132];
                byArray[b_0.C[133] ^ b_0.C[134]] = C[135] ^ C[136];
                byArray[b_0.C[137] ^ b_0.C[138]] = C[139] ^ C[140];
                byArray[b_0.C[141] ^ b_0.C[142]] = C[143] ^ C[144];
                byArray[b_0.C[145] ^ b_0.C[146]] = C[147] ^ C[148];
                byArray[b_0.C[149] ^ b_0.C[150]] = C[151] ^ C[152];
                byArray[b_0.C[153] ^ b_0.C[154]] = C[155] ^ C[156];
                byArray[b_0.C[157] ^ b_0.C[158]] = C[159] ^ C[160];
                objectArray2[b_0.C[94]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[161]];
            if (b == null) {
                byte[] byArray2 = new byte[C[162] ^ C[163]];
                byArray2[b_0.C[164] ^ b_0.C[165]] = C[166] ^ C[167];
                byArray2[b_0.C[168] ^ b_0.C[169]] = C[170] ^ C[171];
                byArray2[b_0.C[172] ^ b_0.C[173]] = C[174] ^ C[175];
                byArray2[b_0.C[176] ^ b_0.C[177]] = C[178] ^ C[179];
                byArray2[b_0.C[180] ^ b_0.C[181]] = C[182] ^ C[183];
                byArray2[b_0.C[184] ^ b_0.C[185]] = C[186] ^ C[187];
                byArray2[b_0.C[188] ^ b_0.C[189]] = C[190] ^ C[191];
                byArray2[b_0.C[192] ^ b_0.C[193]] = C[194] ^ C[195];
                byArray2[b_0.C[196] ^ b_0.C[197]] = C[198] ^ C[199];
                byArray2[b_0.C[200] ^ b_0.C[201]] = C[202] ^ C[203];
                byArray2[b_0.C[204] ^ b_0.C[205]] = C[206] ^ C[207];
                byArray2[b_0.C[208] ^ b_0.C[209]] = C[210] ^ C[211];
                byArray2[b_0.C[212] ^ b_0.C[213]] = C[214] ^ C[215];
                byArray2[b_0.C[216] ^ b_0.C[217]] = C[218] ^ C[219];
                byArray2[b_0.C[220] ^ b_0.C[221]] = C[222] ^ C[223];
                byArray2[b_0.C[224] ^ b_0.C[225]] = C[226] ^ C[227];
                byArray2[b_0.C[228] ^ b_0.C[229]] = C[230] ^ C[231];
                byArray2[b_0.C[232] ^ b_0.C[233]] = C[234] ^ C[235];
                byArray2[b_0.C[236] ^ b_0.C[237]] = C[238] ^ C[239];
                byArray2[b_0.C[240] ^ b_0.C[241]] = C[242] ^ C[243];
                byArray2[b_0.C[244] ^ b_0.C[245]] = C[246] ^ C[247];
                byArray2[b_0.C[248] ^ b_0.C[249]] = C[250] ^ C[251];
                byArray2[b_0.C[252] ^ b_0.C[253]] = C[254] ^ C[255];
                byArray2[b_0.C[256] ^ b_0.C[257]] = C[258] ^ C[259];
                byArray2[b_0.C[260] ^ b_0.C[261]] = C[262] ^ C[263];
                byArray2[b_0.C[264] ^ b_0.C[265]] = C[266] ^ C[267];
                byArray2[b_0.C[268] ^ b_0.C[269]] = C[270] ^ C[271];
                byArray2[b_0.C[272] ^ b_0.C[273]] = C[274] ^ C[275];
                byArray2[b_0.C[276] ^ b_0.C[277]] = C[278] ^ C[279];
                byArray2[b_0.C[280] ^ b_0.C[281]] = C[282] ^ C[283];
                byArray2[b_0.C[284] ^ b_0.C[285]] = C[286] ^ C[287];
                byArray2[b_0.C[288] ^ b_0.C[289]] = C[290] ^ C[291];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[292], byArray3, C[293], byArray.length);
                System.arraycopy(byArray2, C[294], byArray3, byArray.length, byArray2.length);
                Object object4 = b_0.A()[C[295]];
                if (object4 == null) {
                    char[] cArray = "\u0c2a\u0c1c\u0c25\u0c1e\u0c20\u0c0c\u0c31\u0c43\u0c4e\u0c42\u0c22\u0c47\u0c3b\u0c3d\u0c2d\u0c22\u0c1b\u0c0b".toCharArray();
                    for (int i = C[296]; i < C[297]; ++i) {
                        int n2 = cArray[i];
                        n2 += C[298];
                        n2 += C[299];
                        n2 ^= C[300];
                        n2 ^= C[301];
                        n2 ^= C[302];
                        n2 ^= C[303];
                        n2 ^= C[304];
                        n2 ^= C[305];
                        n2 -= C[306];
                        n2 -= C[307];
                        n2 -= C[308];
                        cArray[i] = (char)(n2 += C[309]);
                    }
                    object4 = b_0.A()[b_0.C[310]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[311]];
                byArray4[b_0.C[312]] = C[313];
                byArray4[b_0.C[314]] = C[315];
                byArray4[b_0.C[316]] = C[317];
                byArray4[b_0.C[318]] = C[319];
                byArray4[b_0.C[320]] = C[321];
                byArray4[b_0.C[322]] = C[323];
                byArray4[b_0.C[324]] = C[325];
                byArray4[b_0.C[326]] = C[327];
                byArray4[b_0.C[328]] = C[329];
                byArray4[b_0.C[330]] = C[331];
                byArray4[b_0.C[332]] = C[333];
                byArray4[b_0.C[334]] = C[335];
                byArray4[b_0.C[336]] = C[337];
                byArray4[b_0.C[338]] = C[339];
                byArray4[b_0.C[340]] = C[341];
                byArray4[b_0.C[342]] = C[343];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[344], C[345]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = b_0.A()[C[346]];
                if (object5 == null) {
                    char[] cArray = "\ufd18\ufd1c\uf2ea".toCharArray();
                    for (int i = C[347]; i < C[348]; ++i) {
                        int n3 = cArray[i];
                        n3 ^= C[349];
                        n3 ^= C[350];
                        n3 ^= C[351];
                        n3 -= C[352];
                        n3 += C[353];
                        n3 += C[354];
                        n3 -= C[355];
                        n3 += C[356];
                        n3 += C[357];
                        n3 += C[358];
                        n3 -= C[359];
                        n3 -= C[360];
                        cArray[i] = (char)(n3 -= C[361]);
                    }
                    object5 = b_0.A()[b_0.C[362]] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, C[363], C[364]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, C[365], byArray6.length);
            Object object6 = b_0.A()[C[366]];
            if (object6 == null) {
                char[] cArray = "\uab9c\uab98\uab66\ua4fa\uab96\uab99\uab96\ua4fa\uab67\uab5e\uab96\uab66\ua4c8\uab67\ua4bc\ua4b3\ua4b3\uab84\ua4bd\ua4b2".toCharArray();
                for (int i = C[367]; i < C[368]; ++i) {
                    int n4 = cArray[i];
                    n4 += C[369];
                    n4 += C[370];
                    n4 ^= C[371];
                    n4 += C[372];
                    n4 ^= C[373];
                    n4 -= C[374];
                    n4 -= C[375];
                    n4 += C[376];
                    n4 ^= C[377];
                    cArray[i] = (char)(n4 ^= C[378]);
                }
                object6 = b_0.A()[b_0.C[379]] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(C[380], (Key)((SecretKey)b), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = c;
        if (c == null) {
            c = new Object[C[381]];
            objectArray = c;
        }
        return objectArray;
    }

    public static void b() {
        C = new int[0x5D6C ^ 0x5C12];
        b_0.C[0xD9B1 ^ 0xD972] = 0xE0E ^ 0xD972;
        b_0.C[0xC048 ^ 0xC0E8] = 0x92CC ^ 0xC0E8;
        b_0.C[0x10D9B ^ 0x10DA0] = 0xFFFEF217 ^ 0x10DA0;
        b_0.C[0xBC3 ^ 0xAAD] = 0xAAE ^ 0xAAD;
        b_0.C[0xF08B ^ 0xF063] = 0xF87D ^ 0xF063;
        b_0.C[0xBA1 ^ 0xAD4] = 0x51D1 ^ 0xAD4;
        b_0.C[0x433F ^ 0x4225] = 0xFFFFA5D6 ^ 0x4225;
        b_0.C[0x7D19 ^ 0x7D25] = 0xFFFF82D8 ^ 0x7D25;
        b_0.C[0xAA1A ^ 0xAAFD] = 0x9B4A ^ 0xAAFD;
        b_0.C[0xB6B9 ^ 0xB681] = 0xB6AA ^ 0xB681;
        b_0.C[0x5E79 ^ 0x5F6B] = 0x382F ^ 0x5F6B;
        b_0.C[0x7900 ^ 0x7929] = 0xFFFF86EE ^ 0x7929;
        b_0.C[0x6640 ^ 0x66C5] = 0xCDE9 ^ 0x66C5;
        b_0.C[0xBFD8 ^ 0xBF5F] = 0x140C ^ 0xBF5F;
        b_0.C[0x32B ^ 0x324] = 0x324 ^ 0x324;
        b_0.C[0xD357 ^ 0xD303] = 0xFFFF2CA5 ^ 0xD303;
        b_0.C[0x4F5B ^ 0x4F45] = 0x37EA ^ 0x4F45;
        b_0.C[0x5201 ^ 0x520D] = 0x520E ^ 0x520D;
        b_0.C[0xC885 ^ 0xC9F9] = 0xC9FB ^ 0xC9F9;
        b_0.C[0x141 ^ 0x128] = 0xA6A6 ^ 0x128;
        b_0.C[0x8976 ^ 0x892B] = 0x892A ^ 0x892B;
        b_0.C[0x9E53 ^ 0x9E5B] = 0xFFFF61C0 ^ 0x9E5B;
        b_0.C[0x5080 ^ 0x50AD] = 0xFFFFAF67 ^ 0x50AD;
        b_0.C[0xFCE3 ^ 0xFCA1] = 0xFCB7 ^ 0xFCA1;
        b_0.C[0xB0F0 ^ 0xB08A] = 0xDCD2 ^ 0xB08A;
        b_0.C[0x57F6 ^ 0x5734] = 0x8035 ^ 0x5734;
        b_0.C[0xD001 ^ 0xD0C7] = 0x5050 ^ 0xD0C7;
        b_0.C[0x869 ^ 0x929] = 0x924 ^ 0x929;
        b_0.C[0xE0A7 ^ 0xE1AF] = 0x9C70 ^ 0xE1AF;
        b_0.C[0x2616 ^ 0x2616] = 0xFFFFD9E7 ^ 0x2616;
        b_0.C[0xEBD6 ^ 0xEB78] = 0x2B46 ^ 0xEB78;
        b_0.C[0x1BDD ^ 0x1B24] = 0x60DF ^ 0x1B24;
        b_0.C[0xD881 ^ 0xD98B] = 0xFFFF5B8F ^ 0xD98B;
        b_0.C[0x7259 ^ 0x734E] = 0x83A1 ^ 0x734E;
        b_0.C[0xF67F ^ 0xF653] = 0xF643 ^ 0xF653;
        b_0.C[0xAB1E ^ 0xAA6F] = 0xFD4E ^ 0xAA6F;
        b_0.C[0x1C99 ^ 0x1C40] = 0x1CDD ^ 0x1C40;
        b_0.C[0xBD5C ^ 0xBDB5] = 0xB5AC ^ 0xBDB5;
        b_0.C[0x4E8F ^ 0x4FB3] = 0x4FB0 ^ 0x4FB3;
        b_0.C[0x9BA3 ^ 0x9A9A] = 0x9AB9 ^ 0x9A9A;
        b_0.C[0x9774 ^ 0x9712] = 0xFCEC ^ 0x9712;
        b_0.C[0x9030 ^ 0x907D] = 0x9099 ^ 0x907D;
        b_0.C[0x2075 ^ 0x20D7] = 0x107D ^ 0x20D7;
        b_0.C[0x8D26 ^ 0x8D87] = 0x8D87 ^ 0x8D87;
        b_0.C[0xE828 ^ 0xE896] = 0x115B ^ 0xE896;
        b_0.C[0xC6EA ^ 0xC650] = 0xFFFF2F5D ^ 0xC650;
        b_0.C[0x4B70 ^ 0x4B69] = 0x5403 ^ 0x4B69;
        b_0.C[0x10D63 ^ 0x10C3B] = 0x10C28 ^ 0x10C3B;
        b_0.C[0x9605 ^ 0x9750] = 0xFFFF68AC ^ 0x9750;
        b_0.C[0xA77E ^ 0xA7F2] = 0x377A ^ 0xA7F2;
        b_0.C[0x2BA7 ^ 0x2B95] = 0x2B81 ^ 0x2B95;
        b_0.C[0xD50B ^ 0xD5DA] = 0xE387 ^ 0xD5DA;
        b_0.C[0xAEA7 ^ 0xAE55] = 0xB639 ^ 0xAE55;
        b_0.C[0x1037F ^ 0x103A8] = 0x6B3 ^ 0x103A8;
        b_0.C[0xEB48 ^ 0xEBA3] = 0xE3BA ^ 0xEBA3;
        b_0.C[0x7EC ^ 0x6A8] = 0x6A8 ^ 0x6A8;
        b_0.C[0x9DBE ^ 0x9C99] = 0x9C98 ^ 0x9C99;
        b_0.C[0x37CD ^ 0x3692] = 0x7CD8 ^ 0x3692;
        b_0.C[0x2D4A ^ 0x2D38] = 0x55B ^ 0x2D38;
        b_0.C[0x951B ^ 0x95FD] = 0xFFFF5BFC ^ 0x95FD;
        b_0.C[0x983A ^ 0x9967] = 0x98AE ^ 0x9967;
        b_0.C[0x323E ^ 0x32F7] = 0x97D3 ^ 0x32F7;
        b_0.C[0x546A ^ 0x5405] = 0x9CE6 ^ 0x5405;
        b_0.C[0x46E5 ^ 0x4642] = 0xC81D ^ 0x4642;
        b_0.C[0x3016 ^ 0x30F6] = 0x987F ^ 0x30F6;
        b_0.C[0x49A3 ^ 0x4962] = 0x9E1E ^ 0x4962;
        b_0.C[0x5BC7 ^ 0x5AEF] = 0x5AEF ^ 0x5AEF;
        b_0.C[0x41A5 ^ 0x4138] = 0x1315 ^ 0x4138;
        b_0.C[0x71A0 ^ 0x70E5] = 0x70BE ^ 0x70E5;
        b_0.C[0x4138 ^ 0x4026] = 0xFFFFDE0F ^ 0x4026;
        b_0.C[0x851 ^ 0x85F] = 0x85E ^ 0x85F;
        b_0.C[0xF495 ^ 0xF40F] = 0xDFA6 ^ 0xF40F;
        b_0.C[0xF069 ^ 0xF104] = 0xF114 ^ 0xF104;
        b_0.C[0x10433 ^ 0x1042B] = 0x1D1F3 ^ 0x1042B;
        b_0.C[0x533E ^ 0x5356] = 0x38A8 ^ 0x5356;
        b_0.C[0x3143 ^ 0x3189] = 0x94F4 ^ 0x3189;
        b_0.C[0x3141 ^ 0x3061] = 0xB8A3 ^ 0x3061;
        b_0.C[0x4B43 ^ 0x4B3B] = 0xB5C5 ^ 0x4B3B;
        b_0.C[0x7D50 ^ 0x7DF6] = 0xF38C ^ 0x7DF6;
        b_0.C[0x7DD5 ^ 0x7CA7] = 0xC066 ^ 0x7CA7;
        b_0.C[0x702A ^ 0x70D4] = 0xB3A ^ 0x70D4;
        b_0.C[0x4D96 ^ 0x4DEA] = 0x21B2 ^ 0x4DEA;
        b_0.C[0xB06C ^ 0xB018] = 0x987B ^ 0xB018;
        b_0.C[0x30D2 ^ 0x308E] = 0x308F ^ 0x308E;
        b_0.C[0x45F3 ^ 0x44F0] = 0xBBB0 ^ 0x44F0;
        b_0.C[0xBD1 ^ 0xB96] = 0xBA7 ^ 0xB96;
        b_0.C[0x4E1B ^ 0x4F6C] = 0xEC21 ^ 0x4F6C;
        b_0.C[0xBF3B ^ 0xBF2B] = 0xBF29 ^ 0xBF2B;
        b_0.C[0xD046 ^ 0xD04B] = 0xD04B ^ 0xD04B;
        b_0.C[0x1823 ^ 0x1889] = 0x8A0 ^ 0x1889;
        b_0.C[0x2E34 ^ 0x2F11] = 0x2F11 ^ 0x2F11;
        b_0.C[0x54C7 ^ 0x54D3] = 0xB9D7 ^ 0x54D3;
        b_0.C[0x87C5 ^ 0x876E] = 0x9776 ^ 0x876E;
        b_0.C[0xA501 ^ 0xA5ED] = 0x77A2 ^ 0xA5ED;
        b_0.C[0x2E94 ^ 0x2EAB] = 0xFFFFD124 ^ 0x2EAB;
        b_0.C[0x10DA0 ^ 0x10CC8] = 0x15973 ^ 0x10CC8;
        b_0.C[0xB4DE ^ 0xB580] = 0x74EA ^ 0xB580;
        b_0.C[0x2D62 ^ 0x2C0B] = 0xBF56 ^ 0x2C0B;
        b_0.C[0xB6BB ^ 0xB785] = 0xB78D ^ 0xB785;
        b_0.C[0x5126 ^ 0x51C8] = 0xFFFF7C09 ^ 0x51C8;
        b_0.C[0x45FA ^ 0x457C] = 0xEE53 ^ 0x457C;
        b_0.C[0xD501 ^ 0xD5C4] = 0x5511 ^ 0xD5C4;
        b_0.C[0xA894 ^ 0xA88F] = 0x5514 ^ 0xA88F;
        b_0.C[0x2A09 ^ 0x2A34] = 0x2A1E ^ 0x2A34;
        b_0.C[0xB0BC ^ 0xB1BE] = 0x4EC3 ^ 0xB1BE;
        b_0.C[0x64D3 ^ 0x65CA] = 0x7DA3 ^ 0x65CA;
        b_0.C[0xCBDE ^ 0xCB95] = 0xCB86 ^ 0xCB95;
        b_0.C[0x271A ^ 0x27D4] = 0x903B ^ 0x27D4;
        b_0.C[0xD8D7 ^ 0xD8A2] = 0x265D ^ 0xD8A2;
        b_0.C[0xFC2F ^ 0xFC1B] = 0xFFFF03E3 ^ 0xFC1B;
        b_0.C[0xDE76 ^ 0xDF40] = 0xDF41 ^ 0xDF40;
        b_0.C[0x800E ^ 0x813B] = 0x5711 ^ 0x813B;
        b_0.C[0x762F ^ 0x765C] = 0xFFFFA1E5 ^ 0x765C;
        b_0.C[0x3166 ^ 0x31EC] = 0xA164 ^ 0x31EC;
        b_0.C[0x9D34 ^ 0x9D65] = 0x9D13 ^ 0x9D65;
        b_0.C[0x9ADB ^ 0x9A52] = 0xAD2 ^ 0x9A52;
        b_0.C[0xDD65 ^ 0xDC51] = 0x701B ^ 0xDC51;
        b_0.C[0xB48B ^ 0xB5E7] = 0xB5F7 ^ 0xB5E7;
        b_0.C[0x30FC ^ 0x307C] = 0xC928 ^ 0x307C;
        b_0.C[0xBF74 ^ 0xBFAF] = 0xBF32 ^ 0xBFAF;
        b_0.C[0xEC37 ^ 0xED05] = 0xF87C ^ 0xED05;
        b_0.C[0x10BCD ^ 0x10B9B] = 0xFFFEF408 ^ 0x10B9B;
        b_0.C[0xFA27 ^ 0xFB3B] = 0x9AA4 ^ 0xFB3B;
        b_0.C[0xA8B7 ^ 0xA9D7] = 0x8BB ^ 0xA9D7;
        b_0.C[0x83D0 ^ 0x82D6] = 0x6C6D ^ 0x82D6;
        b_0.C[0x2B4B ^ 0x2B36] = 0xD26D ^ 0x2B36;
        b_0.C[0x10EDF ^ 0x10E6B] = 0x1CC7C ^ 0x10E6B;
        b_0.C[0x341A ^ 0x3438] = 0x3450 ^ 0x3438;
        b_0.C[0x32E9 ^ 0x32DE] = 0x32CB ^ 0x32DE;
        b_0.C[0xA69 ^ 0xB65] = 0x882E ^ 0xB65;
        b_0.C[0xFC12 ^ 0xFC75] = 0x97D8 ^ 0xFC75;
        b_0.C[0x2C9C ^ 0x2DDA] = 0x2DD1 ^ 0x2DDA;
        b_0.C[0xE595 ^ 0xE541] = 0x1E052 ^ 0xE541;
        b_0.C[0xC618 ^ 0xC6AA] = 0xFFFF191C ^ 0xC6AA;
        b_0.C[0xDEBF ^ 0xDE65] = 0xFFFF2112 ^ 0xDE65;
        b_0.C[0x1FD2 ^ 0x1FE8] = 0xFFFFE04A ^ 0x1FE8;
        b_0.C[0x5A68 ^ 0x5B75] = 0x3AE0 ^ 0x5B75;
        b_0.C[0x55DA ^ 0x54B9] = 0x44B6 ^ 0x54B9;
        b_0.C[0xAC9F ^ 0xADB0] = 0x6E7 ^ 0xADB0;
        b_0.C[0x351B ^ 0x358D] = 0x131C8 ^ 0x358D;
        b_0.C[0x1AEA ^ 0x1A93] = 0x76CE ^ 0x1A93;
        b_0.C[0xB796 ^ 0xB6DF] = 0xFFFF4908 ^ 0xB6DF;
        b_0.C[0x10876 ^ 0x10877] = 0x10811 ^ 0x10877;
        b_0.C[0x49E8 ^ 0x4986] = 0x8122 ^ 0x4986;
        b_0.C[0xEAE9 ^ 0xEAAC] = 0xEABC ^ 0xEAAC;
        b_0.C[0xB67 ^ 0xBE5] = 0xF6A0 ^ 0xBE5;
        b_0.C[0x500C ^ 0x511F] = 0x3642 ^ 0x511F;
        b_0.C[0xE648 ^ 0xE75C] = 0x17BE ^ 0xE75C;
        b_0.C[0xDAD4 ^ 0xDAC5] = 0xDAC5 ^ 0xDAC5;
        b_0.C[0x216 ^ 0x274] = 0xEEAD ^ 0x274;
        b_0.C[0x4628 ^ 0x46AB] = 0xFFFF4455 ^ 0x46AB;
        b_0.C[0x26D9 ^ 0x27BE] = 0x6447 ^ 0x27BE;
        b_0.C[0xA690 ^ 0xA620] = 0x862B ^ 0xA620;
        b_0.C[0x100BA ^ 0x100F5] = 0xFFFEFF67 ^ 0x100F5;
        b_0.C[0x417D ^ 0x411C] = 0xADC8 ^ 0x411C;
        b_0.C[0x6C08 ^ 0x6D2A] = 0xE5CD ^ 0x6D2A;
        b_0.C[0x4FF1 ^ 0x4F54] = 0xC10B ^ 0x4F54;
        b_0.C[0x7E5 ^ 0x749] = 0xC74A ^ 0x749;
        b_0.C[0xA176 ^ 0xA12C] = 0xA12E ^ 0xA12C;
        b_0.C[0x10463 ^ 0x10474] = 0x15633 ^ 0x10474;
        b_0.C[0x5D36 ^ 0x5DAA] = 0x7603 ^ 0x5DAA;
        b_0.C[0xEDDB ^ 0xED43] = 0x1E906 ^ 0xED43;
        b_0.C[0x29C4 ^ 0x29E1] = 0xFFFFD672 ^ 0x29E1;
        b_0.C[0xEFA ^ 0xEE7] = 0x4AFB ^ 0xEE7;
        b_0.C[0xB36 ^ 0xA17] = 0x82DE ^ 0xA17;
        b_0.C[0xFAC4 ^ 0xFA08] = 0x4D9C ^ 0xFA08;
        b_0.C[0x8837 ^ 0x8937] = 0x7678 ^ 0x8937;
        b_0.C[0xC016 ^ 0xC039] = 0xC059 ^ 0xC039;
        b_0.C[0x10941 ^ 0x109C9] = 0x1A2E6 ^ 0x109C9;
        b_0.C[0x39E4 ^ 0x3934] = 0xF6A ^ 0x3934;
        b_0.C[0xC5E ^ 0xC12] = 0xFFFFF3E8 ^ 0xC12;
        b_0.C[0x29CE ^ 0x29AD] = 0xC578 ^ 0x29AD;
        b_0.C[0x3281 ^ 0x3205] = 0xCF40 ^ 0x3205;
        b_0.C[0x53BD ^ 0x5360] = 0xF49F ^ 0x5360;
        b_0.C[0x4DB1 ^ 0x4D15] = 0xC354 ^ 0x4D15;
        b_0.C[0x239D ^ 0x2394] = 0xFFFFDC17 ^ 0x2394;
        b_0.C[0xC9D7 ^ 0xC997] = 0xC9DF ^ 0xC997;
        b_0.C[0x577D ^ 0x5798] = 0x662F ^ 0x5798;
        b_0.C[0xBE81 ^ 0xBE4E] = 0x9D6 ^ 0xBE4E;
        b_0.C[0x73F5 ^ 0x72AF] = 0x72AD ^ 0x72AF;
        b_0.C[0x3C64 ^ 0x3D14] = 0x3D00 ^ 0x3D14;
        b_0.C[0x10C64 ^ 0x10C13] = 0xFFFE0D67 ^ 0x10C13;
        b_0.C[0xE6B7 ^ 0xE669] = 0xFFFFBE42 ^ 0xE669;
        b_0.C[0xCB96 ^ 0xCAAC] = 0xCAAD ^ 0xCAAC;
        b_0.C[0x4153 ^ 0x41D2] = 0xBC95 ^ 0x41D2;
        b_0.C[0xFCC1 ^ 0xFDBB] = 0x4715 ^ 0xFDBB;
        b_0.C[0x2DD4 ^ 0x2D79] = 0xED62 ^ 0x2D79;
        b_0.C[0xC7F9 ^ 0xC69D] = 0xAD28 ^ 0xC69D;
        b_0.C[0x105B0 ^ 0x1055A] = 0xFFFEF293 ^ 0x1055A;
        b_0.C[0x7029 ^ 0x7098] = 0x5097 ^ 0x7098;
        b_0.C[0xB5DD ^ 0xB56E] = 0x9561 ^ 0xB56E;
        b_0.C[0xA413 ^ 0xA514] = 0x4BEC ^ 0xA514;
        b_0.C[0x2D25 ^ 0x2DDF] = 0xFFFFA9FF ^ 0x2DDF;
        b_0.C[0x1346 ^ 0x1345] = 0x1314 ^ 0x1345;
        b_0.C[0x1771 ^ 0x1649] = 0x1640 ^ 0x1649;
        b_0.C[0xE13B ^ 0xE069] = 0xE06D ^ 0xE069;
        b_0.C[0x438D ^ 0x4345] = 0xE677 ^ 0x4345;
        b_0.C[0xCE16 ^ 0xCF32] = 0xCF32 ^ 0xCF32;
        b_0.C[0x10D02 ^ 0x10C67] = 0x19631 ^ 0x10C67;
        b_0.C[0x4D5 ^ 0x5DC] = 0x7817 ^ 0x5DC;
        b_0.C[0x9E3E ^ 0x9EAA] = 0xD9A5 ^ 0x9EAA;
        b_0.C[0xC2E3 ^ 0xC258] = 0xD4F6 ^ 0xC258;
        b_0.C[0x10C03 ^ 0x10CEE] = 0x1DEB4 ^ 0x10CEE;
        b_0.C[0xC453 ^ 0xC543] = 0xA21C ^ 0xC543;
        b_0.C[0x1CF1 ^ 0x1CB2] = 0x1C9F ^ 0x1CB2;
        b_0.C[0x1BB4 ^ 0x1AE7] = 0x1A8C ^ 0x1AE7;
        b_0.C[0x779B ^ 0x770B] = 0x553 ^ 0x770B;
        b_0.C[0x8D40 ^ 0x8D3B] = 0xFFFF1E93 ^ 0x8D3B;
        b_0.C[0x62C7 ^ 0x639B] = 0x6398 ^ 0x639B;
        b_0.C[0x8664 ^ 0x86D8] = 0x7F62 ^ 0x86D8;
        b_0.C[0x73C0 ^ 0x7379] = 0x65D7 ^ 0x7379;
        b_0.C[0x53FB ^ 0x53AB] = 0xFFFFAC79 ^ 0x53AB;
        b_0.C[0x93AE ^ 0x9337] = 0xB892 ^ 0x9337;
        b_0.C[0x1D9A ^ 0x1CE3] = 0xA8EE ^ 0x1CE3;
        b_0.C[0x102B4 ^ 0x103DE] = 0x103DC ^ 0x103DE;
        b_0.C[0xE25 ^ 0xE49] = 0xA9C1 ^ 0xE49;
        b_0.C[0xC531 ^ 0xC534] = 0xC52B ^ 0xC534;
        b_0.C[0x3F42 ^ 0x3FD0] = 0x78DF ^ 0x3FD0;
        b_0.C[0xDF41 ^ 0xDFBA] = 0xA441 ^ 0xDFBA;
        b_0.C[0x7978 ^ 0x795F] = 0xFFFF8690 ^ 0x795F;
        b_0.C[0x8C55 ^ 0x8C1C] = 0x8C65 ^ 0x8C1C;
        b_0.C[0x1036C ^ 0x10240] = 0x11456 ^ 0x10240;
        b_0.C[0x9657 ^ 0x9738] = 0x9738 ^ 0x9738;
        b_0.C[0xA178 ^ 0xA17C] = 0xA10C ^ 0xA17C;
        b_0.C[0x109AC ^ 0x10933] = 0x15B6B ^ 0x10933;
        b_0.C[0xC549 ^ 0xC5DA] = 0xFFFF7D71 ^ 0xC5DA;
        b_0.C[0xFFE9 ^ 0xFEED] = 0x1014 ^ 0xFEED;
        b_0.C[0x6133 ^ 0x61C0] = 0x7999 ^ 0x61C0;
        b_0.C[0xFE83 ^ 0xFF82] = 0xC2 ^ 0xFF82;
        b_0.C[0x9692 ^ 0x966E] = 0xEDF0 ^ 0x966E;
        b_0.C[0x7A30 ^ 0x7A22] = 0x7A22 ^ 0x7A22;
        b_0.C[0x5747 ^ 0x560D] = 0x5607 ^ 0x560D;
        b_0.C[0x3C06 ^ 0x3C66] = 0xB127 ^ 0x3C66;
        b_0.C[0x3C5E ^ 0x3CE8] = 0xFEA9 ^ 0x3CE8;
        b_0.C[0x6972 ^ 0x695C] = 0x691A ^ 0x695C;
        b_0.C[0x3A64 ^ 0x3ABB] = 0x9D44 ^ 0x3ABB;
        b_0.C[0x3E25 ^ 0x3F73] = 0x3F76 ^ 0x3F73;
        b_0.C[0xEC56 ^ 0xEC7D] = 0xFFFF1384 ^ 0xEC7D;
        b_0.C[0x7B67 ^ 0x7B92] = 0x94A4 ^ 0x7B92;
        b_0.C[0xD2F7 ^ 0xD3D4] = 0x5B1D ^ 0xD3D4;
        b_0.C[0xB41A ^ 0xB43A] = 0xB491 ^ 0xB43A;
        b_0.C[0x10307 ^ 0x1038A] = 0x171DC ^ 0x1038A;
        b_0.C[0x270E ^ 0x27F1] = 0x5C78 ^ 0x27F1;
        b_0.C[0x980 ^ 0x88E] = 0x8BF9 ^ 0x88E;
        b_0.C[0x434C ^ 0x4332] = 0xBA66 ^ 0x4332;
        b_0.C[0x8A1D ^ 0x8A1B] = 0x8A17 ^ 0x8A1B;
        b_0.C[0xDBE0 ^ 0xDAA3] = 0xDAB5 ^ 0xDAA3;
        b_0.C[0x35F ^ 0x3F0] = 0xC3EB ^ 0x3F0;
        b_0.C[0x5EF6 ^ 0x5E12] = 0x6FB4 ^ 0x5E12;
        b_0.C[0xF2B2 ^ 0xF3FD] = 0xFFFF0C5A ^ 0xF3FD;
        b_0.C[0xF1E5 ^ 0xF180] = 0x9A79 ^ 0xF180;
        b_0.C[0x10326 ^ 0x1027D] = 0x1027D ^ 0x1027D;
        b_0.C[0x15AE ^ 0x1576] = 0x15ED ^ 0x1576;
        b_0.C[0x66D2 ^ 0x67AF] = 0x67AB ^ 0x67AF;
        b_0.C[0xB21D ^ 0xB23B] = 0xB201 ^ 0xB23B;
        b_0.C[0xC036 ^ 0xC0FB] = 0x7763 ^ 0xC0FB;
        b_0.C[0x214F ^ 0x213F] = 0xE99B ^ 0x213F;
        b_0.C[0x499C ^ 0x48B6] = 0xA142 ^ 0x48B6;
        b_0.C[0x850F ^ 0x8580] = 0xFFFF0806 ^ 0x8580;
        b_0.C[0xE0E5 ^ 0xE19E] = 0xE19D ^ 0xE19E;
        b_0.C[0x55A ^ 0x51C] = 0x53A ^ 0x51C;
        b_0.C[0xEA91 ^ 0xEAC8] = 0xEAC9 ^ 0xEAC8;
        b_0.C[0x1668 ^ 0x16B4] = 0xB151 ^ 0x16B4;
        b_0.C[0x7DDF ^ 0x7CAB] = 0x9F38 ^ 0x7CAB;
        b_0.C[0x3778 ^ 0x37AD] = 0x132B6 ^ 0x37AD;
        b_0.C[0xD7BA ^ 0xD7A0] = 0x297A ^ 0xD7A0;
        b_0.C[0xBDE2 ^ 0xBDB9] = 0xBDB9 ^ 0xBDB9;
        b_0.C[0xE054 ^ 0xE00C] = 0xFFFF1FB5 ^ 0xE00C;
        b_0.C[0x22EE ^ 0x2285] = 0xFFFF7ADE ^ 0x2285;
        b_0.C[0x3221 ^ 0x32DC] = 0x4955 ^ 0x32DC;
        b_0.C[0xBB42 ^ 0xBA31] = 0xF153 ^ 0xBA31;
        b_0.C[0xD6EE ^ 0xD6D8] = 0xD6AD ^ 0xD6D8;
        b_0.C[0x3BE8 ^ 0x3B41] = 0x2B59 ^ 0x3B41;
        b_0.C[0x28E1 ^ 0x28B3] = 0xFFFFD737 ^ 0x28B3;
        b_0.C[0x7B0F ^ 0x7BED] = 0xFFFF2CC9 ^ 0x7BED;
        b_0.C[0x10105 ^ 0x10047] = 0x10045 ^ 0x10047;
        b_0.C[0xB1E1 ^ 0xB0FA] = 0xA893 ^ 0xB0FA;
        b_0.C[0xB95E ^ 0xB921] = 0xFFFFBFEB ^ 0xB921;
        b_0.C[0x6A4E ^ 0x6B43] = 0xE818 ^ 0x6B43;
        b_0.C[0x183B ^ 0x1856] = 0xD0F9 ^ 0x1856;
        b_0.C[0x3470 ^ 0x3423] = 0xFFFFCB1B ^ 0x3423;
        b_0.C[0x65C8 ^ 0x64D9] = 0x384 ^ 0x64D9;
        b_0.C[0xB18 ^ 0xA55] = 0xFFFFF5F7 ^ 0xA55;
        b_0.C[0x1059A ^ 0x105D4] = 0x105BE ^ 0x105D4;
        b_0.C[0x10F49 ^ 0x10E02] = 0xFFFEF1BD ^ 0x10E02;
        b_0.C[0x8F47 ^ 0x8E16] = 0x8E05 ^ 0x8E16;
        b_0.C[0xF602 ^ 0xF6E1] = 0x5E7B ^ 0xF6E1;
        b_0.C[0x1190 ^ 0x10C0] = 0x10C6 ^ 0x10C0;
        b_0.C[0x2FF ^ 0x389] = 0xB6E1 ^ 0x389;
        b_0.C[0xC984 ^ 0xC9C5] = 0xC99E ^ 0xC9C5;
        b_0.C[0x38AA ^ 0x3878] = 0xE51 ^ 0x3878;
        b_0.C[0xEF20 ^ 0xEE68] = 0xEE64 ^ 0xEE68;
        b_0.C[0xEC40 ^ 0xED56] = 0xFFFFE23E ^ 0xED56;
        b_0.C[0x94C0 ^ 0x95F1] = 0x7FF8 ^ 0x95F1;
        b_0.C[0x8E6E ^ 0x8E2A] = 0x8E3C ^ 0x8E2A;
        b_0.C[0xEB3D ^ 0xEB28] = 0x14AC ^ 0xEB28;
        b_0.C[0x9A7D ^ 0x9B24] = 0x9A24 ^ 0x9B24;
        b_0.C[0x9C60 ^ 0x9D50] = 0xB1A8 ^ 0x9D50;
        b_0.C[0x90F6 ^ 0x90F1] = 0x9082 ^ 0x90F1;
        b_0.C[0xBD29 ^ 0xBD4D] = 0x5194 ^ 0xBD4D;
        b_0.C[0xD4CC ^ 0xD407] = 0x7123 ^ 0xD407;
        b_0.C[0x10709 ^ 0x107F9] = 0x11FAE ^ 0x107F9;
        b_0.C[0xD6B7 ^ 0xD799] = 0x11EE ^ 0xD799;
        b_0.C[0x2AD9 ^ 0x2A28] = 0x3271 ^ 0x2A28;
        b_0.C[0x1892 ^ 0x18E3] = 0x3080 ^ 0x18E3;
        b_0.C[0x4311 ^ 0x4344] = 0xFFFFBCF6 ^ 0x4344;
        b_0.C[0x6454 ^ 0x6551] = 0x8BA9 ^ 0x6551;
        b_0.C[0xBBBB ^ 0xBAD9] = 0x9C97 ^ 0xBAD9;
        b_0.C[0xE9CC ^ 0xE9EF] = 0xFFFF16A6 ^ 0xE9EF;
        b_0.C[0xF258 ^ 0xF279] = 0xFFFF0DE4 ^ 0xF279;
        b_0.C[0xA214 ^ 0xA32B] = 0xA31A ^ 0xA32B;
        b_0.C[0x13A ^ 0x1EC] = 0x1049A ^ 0x1EC;
        b_0.C[0xD4A8 ^ 0xD43F] = 0x1D00E ^ 0xD43F;
        b_0.C[0x6D1F ^ 0x6C79] = 0xA3AE ^ 0x6C79;
        b_0.C[0x667E ^ 0x6739] = 0xFFFF98D7 ^ 0x6739;
        b_0.C[0x5C7E ^ 0x5D30] = 0x5D3E ^ 0x5D30;
        b_0.C[0x8630 ^ 0x866F] = 0xB3E ^ 0x866F;
        b_0.C[0xDB79 ^ 0xDA5F] = 0xDA5F ^ 0xDA5F;
        b_0.C[0x16E2 ^ 0x17E9] = 0x6A22 ^ 0x17E9;
        b_0.C[0x10468 ^ 0x104C0] = 0x114C7 ^ 0x104C0;
        b_0.C[0x428A ^ 0x4204] = 0x305C ^ 0x4204;
        b_0.C[0xF96B ^ 0xF842] = 0xF850 ^ 0xF842;
        b_0.C[0xFEC ^ 0xED7] = 0xFFFFF124 ^ 0xED7;
        b_0.C[0x58D0 ^ 0x5810] = 0x8F75 ^ 0x5810;
        b_0.C[0x4830 ^ 0x481A] = 0x482B ^ 0x481A;
        b_0.C[0xED7E ^ 0xEC32] = 0xEC35 ^ 0xEC32;
        b_0.C[0xBFF9 ^ 0xBF3D] = 0x3FED ^ 0xBF3D;
        b_0.C[0xDDD4 ^ 0xDDE5] = 0xFFFF2228 ^ 0xDDE5;
        b_0.C[0x636C ^ 0x6332] = 0x6332 ^ 0x6332;
        b_0.C[0xC541 ^ 0xC565] = 0xC50F ^ 0xC565;
        b_0.C[0x1837 ^ 0x187D] = 0x1874 ^ 0x187D;
        b_0.C[0x10766 ^ 0x1072E] = 0x10746 ^ 0x1072E;
        b_0.C[0x2FC4 ^ 0x2F7C] = 0x39CE ^ 0x2F7C;
        b_0.C[0x6A31 ^ 0x6A3B] = 0xFFFF95B9 ^ 0x6A3B;
        b_0.C[0xD14F ^ 0xD1A0] = 0x3FA ^ 0xD1A0;
        b_0.C[0x810A ^ 0x8134] = 0xFFFF7EE3 ^ 0x8134;
        b_0.C[0xC068 ^ 0xC0DD] = 0x2CA ^ 0xC0DD;
        b_0.C[0xE808 ^ 0xE893] = 0xC34B ^ 0xE893;
        b_0.C[0x49A5 ^ 0x4996] = 0xFFFFB67B ^ 0x4996;
        b_0.C[0x25CA ^ 0x253E] = 0xCA01 ^ 0x253E;
        b_0.C[0x5BF2 ^ 0x5AA6] = 0x5AA9 ^ 0x5AA6;
        b_0.C[0xB432 ^ 0xB4A7] = 0x1B0E6 ^ 0xB4A7;
        b_0.C[0x63CE ^ 0x631D] = 0x5540 ^ 0x631D;
        b_0.C[0xA18F ^ 0xA0A4] = 0x2DB0 ^ 0xA0A4;
        b_0.C[0x8802 ^ 0x889C] = 0xDAB8 ^ 0x889C;
        b_0.C[0x52C2 ^ 0x5261] = 0x62EB ^ 0x5261;
        b_0.C[0x9134 ^ 0x91BF] = 0x140 ^ 0x91BF;
        b_0.C[0x1C9D ^ 0x1DA0] = 0x1DD5 ^ 0x1DA0;
        b_0.C[0xD84E ^ 0xD87B] = 0xD8FB ^ 0xD87B;
        b_0.C[0x5011 ^ 0x5080] = 0x1785 ^ 0x5080;
        b_0.C[0x4FF5 ^ 0x4F14] = 0xE78E ^ 0x4F14;
        b_0.C[0x40C4 ^ 0x403C] = 0x3BD5 ^ 0x403C;
        b_0.C[0x20EE ^ 0x2053] = 0xD9F2 ^ 0x2053;
        b_0.C[0xE5EC ^ 0xE4C1] = 0x306 ^ 0xE4C1;
        b_0.C[0x2A03 ^ 0x2B54] = 0xFFFFD4C7 ^ 0x2B54;
        b_0.C[0x8964 ^ 0x8933] = 0xFFFF76C9 ^ 0x8933;
        b_0.C[0x972E ^ 0x966F] = 0x9653 ^ 0x966F;
        b_0.C[0xBEF6 ^ 0xBEC6] = 0xFFFF414B ^ 0xBEC6;
        b_0.C[0x6646 ^ 0x664D] = 0xFFFF99AC ^ 0x664D;
        b_0.C[0x7199 ^ 0x719B] = 0xFFFF8E0D ^ 0x719B;
        b_0.C[0x7099 ^ 0x70B1] = 0x709A ^ 0x70B1;
        b_0.C[0x5B15 ^ 0x5BA2] = 0x99B5 ^ 0x5BA2;
        b_0.C[0xFEDC ^ 0xFE2B] = 0x111D ^ 0xFE2B;
        b_0.C[0x8FCB ^ 0x8FA1] = 0x2829 ^ 0x8FA1;
        b_0.C[0x7976 ^ 0x79B1] = 0xF964 ^ 0x79B1;
        b_0.C[0x7622 ^ 0x761B] = 0x7672 ^ 0x761B;
        b_0.C[0xC6F4 ^ 0xC6E8] = 0xA533 ^ 0xC6E8;
        b_0.C[0xDA72 ^ 0xDA61] = 0xDA21 ^ 0xDA61;
        b_0.C[0x37E4 ^ 0x36EB] = 0xB5B0 ^ 0x36EB;
        b_0.C[0x40FF ^ 0x41C8] = 0x41D8 ^ 0x41C8;
        b_0.C[0xA225 ^ 0xA29A] = 0x5B3B ^ 0xA29A;
        b_0.C[0x32BB ^ 0x32CD] = 0xCC33 ^ 0x32CD;
        b_0.C[0xC3D2 ^ 0xC2AA] = 0x1847 ^ 0xC2AA;
        b_0.C[0x1768 ^ 0x1777] = 0x1777 ^ 0x1777;
        b_0.C[0x4FE3 ^ 0x4E82] = 0x242E ^ 0x4E82;
        b_0.C[0x36F8 ^ 0x37ED] = 0xC702 ^ 0x37ED;
        b_0.C[0x3AB9 ^ 0x3A4F] = 0xD53A ^ 0x3A4F;
        b_0.C[0x3A02 ^ 0x3A14] = 0xFE31 ^ 0x3A14;
        b_0.C[0x6327 ^ 0x6238] = 0x3AD ^ 0x6238;
        b_0.C[0x109E9 ^ 0x108F1] = 0x11085 ^ 0x108F1;
        b_0.C[0x46C2 ^ 0x47A9] = 0x47A9 ^ 0x47A9;
        b_0.C[0xBE56 ^ 0xBF65] = 0x522C ^ 0xBF65;
    }
}

