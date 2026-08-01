/*
 * Decompiled with CFR 0.152.
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
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2={"Lkotakbaz/rain/module/modules/player/AutoSprintModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_746;", "player", "", "shouldSprint", "(Lnet/minecraft/class_746;)Z", "rain-visuals"})
public final class AutoSprintModule
extends Module {
    @NotNull
    public static final AutoSprintModule INSTANCE;
    private static Object[] a;
    private static Object b;
    private static Object[] B;
    private static Object[] A;
    private static Object[] c;
    public static int[] C;

    private AutoSprintModule() {
        int n2 = C[0];
        n2 -= C[1];
        int n3 = C[3];
        n3 ^= C[4];
        int n4 = C[6];
        n4 -= C[7];
        super((String)a[n2 -= C[2]], a_0.getPLAYER(), (String)a[n3 += C[5]] + (String)a[n4 ^= C[8]]);
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        int n2 = C[9];
        n2 += C[10];
        Intrinsics.checkNotNullParameter(event, (String)a[n2 += C[11]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (this.shouldSprint(clientPlayerEntity2)) {
            boolean bl = C[12];
            bl += C[13];
            clientPlayerEntity2.setSprinting(bl ^= C[14]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean shouldSprint(ClientPlayerEntity player) {
        int n2;
        if (player.isSneaking() || player.isUsingItem()) {
            boolean bl = C[15];
            bl ^= C[16];
            return bl ^= C[17];
        }
        if (player.isTouchingWater() || player.isInLava()) {
            boolean bl = C[18];
            bl ^= C[19];
            return bl += C[20];
        }
        if (player.hasVehicle() || player.isGliding()) {
            boolean bl = C[21];
            bl ^= C[22];
            return bl ^= C[23];
        }
        if (player.input.hasForwardMovement()) {
            int n3 = C[24];
            n3 -= C[25];
            if (player.getHungerManager().getFoodLevel() > (n3 ^= C[26])) {
                int n4 = C[27];
                n4 -= C[28];
                n2 = n4 ^= C[29];
                return n2 != 0;
            }
        }
        int n5 = C[30];
        n5 -= C[31];
        n2 = n5 -= C[32];
        return n2 != 0;
    }

    static {
        AutoSprintModule.b();
        long l2 = 6885687074705405944L;
        long l3 = -8978234389783780645L;
        long l4 = -8323743335912805909L;
        long l5 = 2074986754353551955L;
        long l6 = -684351704777800757L;
        long l7 = 7819416841234544224L;
        long l8 = -1834742788295658190L;
        long l9 = 6320379111555199918L;
        long l10 = 2735919778131280400L;
        long l11 = 2746372486252384047L;
        long l12 = 6018917271879821535L;
        long l13 = -6862609412862609037L;
        long l14 = -4368246932063668197L;
        long l15 = 9213093019244948284L;
        int n2 = C[33];
        n2 -= C[34];
        a = new Object[n2 -= C[35]];
        long l16 = l15;
        int n3 = C[36];
        n3 ^= C[37];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= C[38]);
        Object[] objectArray = new Object[C[39]];
        objectArray[AutoSprintModule.C[40]] = A;
        objectArray[AutoSprintModule.C[41]] = C[42];
        int n4 = C[43];
        Object object = AutoSprintModule.A()[C[44]];
        if (object == null) {
            char[] cArray = "\uea5e\uea59\uea50\uec24\uea0a\uedcb\uea8f\uea4d\uec2a\uec2d\uea8e\uea53\uea50\uea5c\uea91\uec35\uea88\uec37\uedcb\uec3c\uea5a\uea5d\uea93\uea5b\uea8d\uec3b\uec37\uec33\uec3b\uea53\uea0a\uedca\uec2b\uea5e\uea56\uea8c\uea93\uea4f\uea92\uec3a\uedc4\uea53\uea4e\uea8d\uec32\uedca\uec3c\uedc9\uea50\uea5c\uec3d\uea54\uea59\uedc4\uea55\uec39\uea91\uedcb\uea52\uec37\uec3b\uea5c\uea09\uedc4\uec3a\uec2b\uea48\uec38\uec2a\uedca\uea4f\uea51\uea4c\uedc3\uea54\uea53\uec33\uea4c\uea5e\uec28\uea88\uec2f\uec29\uea5e\uea5b\uea5b\uea56\uec3d\uec2b\uea63\uec2e\uea58\uec2d\uec28\uea91\uea8e\uec24\uea58\uec3e\uec3f\uec30\uea48\uec24\uedca\uedca\uea56\uea63\uea52\uea54\uec24\uea88\uec2b\uea53\uea92\uec2a\uea95\uea5f\uec24\uec34\uea4e\uea52\uec35\uec39\uea8d\uea52\uea8d\uec3b\uec3d\uea8c\uec35\uec2b\uec2e\uea4d\uea09\uea8d\uec3e\uea57\uec31\uea57\uea63\uec2c\uec32\uea88\uea4f\uea8c\uea59\uec2b\uea0b\uec35\uea59\uea07\uea07".toCharArray();
            for (int i2 = C[45]; i2 < C[46]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= C[47];
                n5 ^= C[48];
                n5 ^= C[49];
                n5 ^= C[50];
                n5 += C[51];
                n5 -= C[52];
                n5 += C[53];
                n5 += C[54];
                n5 ^= C[55];
                n5 ^= C[56];
                n5 -= C[57];
                n5 += C[58];
                n5 += C[59];
                n5 -= C[60];
                cArray[i2] = (char)(n5 ^= C[61]);
            }
            object = AutoSprintModule.A()[AutoSprintModule.C[62]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)AutoSprintModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = C[63];
        n6 -= C[64];
        l6 = l17 ^ (0x3700000000L ^ l17) & -1L << (n6 += C[65]);
        long l18 = l13;
        int n7 = C[66];
        n7 ^= C[67];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= C[68]);
        while (true) {
            int n8 = C[69];
            n8 -= C[70];
            if ((int)l13 >= (int)(l6 >>> (n8 += C[71]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = C[72];
            n10 += C[73];
            int n11 = C[75];
            n11 ^= C[76];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += C[74])) & -1L >>> (n11 -= C[77]);
            long l20 = l9;
            int n12 = C[78];
            n12 += C[79];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= C[80]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = C[81];
            n14 += C[82];
            int n15 = C[84];
            n15 -= C[85];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= C[83])) & -1L >>> (n15 += C[86]);
            int n16 = C[87];
            n16 ^= C[88];
            long l22 = l10;
            int n17 = C[90];
            n17 -= C[91];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= C[89]) ^ l22) & -1L << (n17 ^= C[92]);
            int n18 = C[93];
            n18 ^= C[94];
            n18 -= C[95];
            int n19 = C[96];
            n19 += C[97];
            long l23 = l12;
            int n20 = C[99];
            n20 += C[100];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= C[98]))) ^ l23) & -1L >>> (n20 += C[101]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = C[102];
            n21 ^= C[103];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= C[104]);
            while (true) {
                int n22 = C[105];
                n22 += C[106];
                if ((int)(l14 >>> (n22 -= C[107])) >= (int)l12) break;
                int n23 = C[108];
                n23 ^= C[109];
                int n24 = C[111];
                n24 -= C[112];
                cArray2[(int)(l14 >>> (n23 += AutoSprintModule.C[110]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= C[113]))];
                l14 += 0x100000000L;
            }
            int n25 = C[114];
            n25 ^= C[115];
            int n26 = (int)(l15 >>> (n25 += C[116]));
            l15 += 0x100000000L;
            AutoSprintModule.a[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = C[117];
            n27 ^= C[118];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 -= C[119]);
        }
        INSTANCE = new AutoSprintModule();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[C[120]];
        String string = (String)object[C[121]];
        object = object[C[122]];
        Object[] objectArray = B;
        if (B == null) {
            objectArray = B = new Object[C[123]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[C[124]];
                A = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[C[126] ^ C[127]];
                byArray[AutoSprintModule.C[128] ^ AutoSprintModule.C[129]] = C[130] ^ C[131];
                byArray[AutoSprintModule.C[132] ^ AutoSprintModule.C[133]] = C[134] ^ C[135];
                byArray[AutoSprintModule.C[136] ^ AutoSprintModule.C[137]] = C[138] ^ C[139];
                byArray[AutoSprintModule.C[140] ^ AutoSprintModule.C[141]] = C[142] ^ C[143];
                byArray[AutoSprintModule.C[144] ^ AutoSprintModule.C[145]] = C[146] ^ C[147];
                byArray[AutoSprintModule.C[148] ^ AutoSprintModule.C[149]] = C[150] ^ C[151];
                byArray[AutoSprintModule.C[152] ^ AutoSprintModule.C[153]] = C[154] ^ C[155];
                byArray[AutoSprintModule.C[156] ^ AutoSprintModule.C[157]] = C[158] ^ C[159];
                byArray[AutoSprintModule.C[160] ^ AutoSprintModule.C[161]] = C[162] ^ C[163];
                byArray[AutoSprintModule.C[164] ^ AutoSprintModule.C[165]] = C[166] ^ C[167];
                byArray[AutoSprintModule.C[168] ^ AutoSprintModule.C[169]] = C[170] ^ C[171];
                byArray[AutoSprintModule.C[172] ^ AutoSprintModule.C[173]] = C[174] ^ C[175];
                byArray[AutoSprintModule.C[176] ^ AutoSprintModule.C[177]] = C[178] ^ C[179];
                byArray[AutoSprintModule.C[180] ^ AutoSprintModule.C[181]] = C[182] ^ C[183];
                byArray[AutoSprintModule.C[184] ^ AutoSprintModule.C[185]] = C[186] ^ C[187];
                byArray[AutoSprintModule.C[188] ^ AutoSprintModule.C[189]] = C[190] ^ C[191];
                objectArray2[AutoSprintModule.C[125]] = byArray;
            }
            byte[] byArray = (byte[])object3[C[192]];
            if (b == null) {
                byte[] byArray2 = new byte[C[193] ^ C[194]];
                byArray2[AutoSprintModule.C[195] ^ AutoSprintModule.C[196]] = C[197] ^ C[198];
                byArray2[AutoSprintModule.C[199] ^ AutoSprintModule.C[200]] = C[201] ^ C[202];
                byArray2[AutoSprintModule.C[203] ^ AutoSprintModule.C[204]] = C[205] ^ C[206];
                byArray2[AutoSprintModule.C[207] ^ AutoSprintModule.C[208]] = C[209] ^ C[210];
                byArray2[AutoSprintModule.C[211] ^ AutoSprintModule.C[212]] = C[213] ^ C[214];
                byArray2[AutoSprintModule.C[215] ^ AutoSprintModule.C[216]] = C[217] ^ C[218];
                byArray2[AutoSprintModule.C[219] ^ AutoSprintModule.C[220]] = C[221] ^ C[222];
                byArray2[AutoSprintModule.C[223] ^ AutoSprintModule.C[224]] = C[225] ^ C[226];
                byArray2[AutoSprintModule.C[227] ^ AutoSprintModule.C[228]] = C[229] ^ C[230];
                byArray2[AutoSprintModule.C[231] ^ AutoSprintModule.C[232]] = C[233] ^ C[234];
                byArray2[AutoSprintModule.C[235] ^ AutoSprintModule.C[236]] = C[237] ^ C[238];
                byArray2[AutoSprintModule.C[239] ^ AutoSprintModule.C[240]] = C[241] ^ C[242];
                byArray2[AutoSprintModule.C[243] ^ AutoSprintModule.C[244]] = C[245] ^ C[246];
                byArray2[AutoSprintModule.C[247] ^ AutoSprintModule.C[248]] = C[249] ^ C[250];
                byArray2[AutoSprintModule.C[251] ^ AutoSprintModule.C[252]] = C[253] ^ C[254];
                byArray2[AutoSprintModule.C[255] ^ AutoSprintModule.C[256]] = C[257] ^ C[258];
                byArray2[AutoSprintModule.C[259] ^ AutoSprintModule.C[260]] = C[261] ^ C[262];
                byArray2[AutoSprintModule.C[263] ^ AutoSprintModule.C[264]] = C[265] ^ C[266];
                byArray2[AutoSprintModule.C[267] ^ AutoSprintModule.C[268]] = C[269] ^ C[270];
                byArray2[AutoSprintModule.C[271] ^ AutoSprintModule.C[272]] = C[273] ^ C[274];
                byArray2[AutoSprintModule.C[275] ^ AutoSprintModule.C[276]] = C[277] ^ C[278];
                byArray2[AutoSprintModule.C[279] ^ AutoSprintModule.C[280]] = C[281] ^ C[282];
                byArray2[AutoSprintModule.C[283] ^ AutoSprintModule.C[284]] = C[285] ^ C[286];
                byArray2[AutoSprintModule.C[287] ^ AutoSprintModule.C[288]] = C[289] ^ C[290];
                byArray2[AutoSprintModule.C[291] ^ AutoSprintModule.C[292]] = C[293] ^ C[294];
                byArray2[AutoSprintModule.C[295] ^ AutoSprintModule.C[296]] = C[297] ^ C[298];
                byArray2[AutoSprintModule.C[299] ^ AutoSprintModule.C[300]] = C[301] ^ C[302];
                byArray2[AutoSprintModule.C[303] ^ AutoSprintModule.C[304]] = C[305] ^ C[306];
                byArray2[AutoSprintModule.C[307] ^ AutoSprintModule.C[308]] = C[309] ^ C[310];
                byArray2[AutoSprintModule.C[311] ^ AutoSprintModule.C[312]] = C[313] ^ C[314];
                byArray2[AutoSprintModule.C[315] ^ AutoSprintModule.C[316]] = C[317] ^ C[318];
                byArray2[AutoSprintModule.C[319] ^ AutoSprintModule.C[320]] = C[321] ^ C[322];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, C[323], byArray3, C[324], byArray.length);
                System.arraycopy(byArray2, C[325], byArray3, byArray.length, byArray2.length);
                Object object4 = AutoSprintModule.A()[C[326]];
                if (object4 == null) {
                    char[] cArray = "\u3813\u3b85\u3bf0\u3b9f\u3b81\u3bf5\u3814\u3b8e\u3b8f\u3b8b\u3beb\u3b8a\u3ba6\u3ba8\u3818\u3beb\u3b86\u3bf6".toCharArray();
                    for (int i2 = C[327]; i2 < C[328]; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= C[329];
                        n3 ^= C[330];
                        n3 ^= C[331];
                        n3 -= C[332];
                        n3 -= C[333];
                        n3 -= C[334];
                        n3 += C[335];
                        n3 ^= C[336];
                        n3 -= C[337];
                        n3 -= C[338];
                        n3 ^= C[339];
                        n3 ^= C[340];
                        cArray[i2] = (char)(n3 ^= C[341]);
                    }
                    object4 = AutoSprintModule.A()[AutoSprintModule.C[342]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[C[343]];
                byArray4[AutoSprintModule.C[344]] = C[345];
                byArray4[AutoSprintModule.C[346]] = C[347];
                byArray4[AutoSprintModule.C[348]] = C[349];
                byArray4[AutoSprintModule.C[350]] = C[351];
                byArray4[AutoSprintModule.C[352]] = C[353];
                byArray4[AutoSprintModule.C[354]] = C[355];
                byArray4[AutoSprintModule.C[356]] = C[357];
                byArray4[AutoSprintModule.C[358]] = C[359];
                byArray4[AutoSprintModule.C[360]] = C[361];
                byArray4[AutoSprintModule.C[362]] = C[363];
                byArray4[AutoSprintModule.C[364]] = C[365];
                byArray4[AutoSprintModule.C[366]] = C[367];
                byArray4[AutoSprintModule.C[368]] = C[369];
                byArray4[AutoSprintModule.C[370]] = C[371];
                byArray4[AutoSprintModule.C[372]] = C[373];
                byArray4[AutoSprintModule.C[374]] = C[375];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, C[376], C[377]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = AutoSprintModule.A()[C[378]];
                if (object5 == null) {
                    char[] cArray = "\u62bd\u6241\u6253".toCharArray();
                    for (int i3 = C[379]; i3 < C[380]; ++i3) {
                        int n4 = cArray[i3];
                        n4 += C[381];
                        n4 += C[382];
                        n4 ^= C[383];
                        n4 -= C[384];
                        n4 -= C[385];
                        n4 -= C[386];
                        n4 ^= C[387];
                        n4 -= C[388];
                        n4 -= C[389];
                        n4 -= C[390];
                        n4 += C[391];
                        n4 ^= C[392];
                        cArray[i3] = (char)(n4 -= C[393]);
                    }
                    object5 = AutoSprintModule.A()[AutoSprintModule.C[394]] = new String(cArray);
                }
                b = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, C[395], C[396]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, C[397], byArray6.length);
            Object object6 = AutoSprintModule.A()[C[398]];
            if (object6 == null) {
                char[] cArray = "\u7339\u7335\u7323\u73c7\u7333\u7338\u7333\u73c7\u7326\u732b\u7333\u7323\u73c5\u7326\u7099\u7092\u7092\u7091\u708c\u708f".toCharArray();
                for (int i4 = C[399]; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x63B1;
                    n5 ^= 0x2294;
                    n5 ^= 0x7085;
                    n5 += 57382;
                    n5 ^= 0x40B7;
                    n5 += 47241;
                    n5 -= 23529;
                    n5 ^= 0xBD6A;
                    n5 -= 39307;
                    n5 += 40572;
                    n5 += 31407;
                    cArray[i4] = (char)(n5 += 31967);
                }
                object6 = AutoSprintModule.A()[3] = new String(cArray);
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
        C = new int[0xBE26 ^ 0xBFB6];
        AutoSprintModule.C[0xB64D ^ 0xB709] = 0xB709 ^ 0xB709;
        AutoSprintModule.C[0xF09E ^ 0xF0DD] = 0xFFFF0F08 ^ 0xF0DD;
        AutoSprintModule.C[0xF0D4 ^ 0xF083] = 0xFFFF0F40 ^ 0xF083;
        AutoSprintModule.C[0x708F ^ 0x70A7] = 0x70A7 ^ 0x70A7;
        AutoSprintModule.C[0x23FA ^ 0x2315] = 0x31FB ^ 0x2315;
        AutoSprintModule.C[0x97D1 ^ 0x97B7] = 0x97FB ^ 0x97B7;
        AutoSprintModule.C[0x227 ^ 0x2B3] = 0xF7D2 ^ 0x2B3;
        AutoSprintModule.C[0x6AAE ^ 0x6AA9] = 0xFFFF9547 ^ 0x6AA9;
        AutoSprintModule.C[0x6B1C ^ 0x6B3A] = 0x6B36 ^ 0x6B3A;
        AutoSprintModule.C[0x61DA ^ 0x6144] = 0xFFFF991F ^ 0x6144;
        AutoSprintModule.C[0x779D ^ 0x768B] = 0x3800 ^ 0x768B;
        AutoSprintModule.C[0x4A15 ^ 0x4AB6] = 0xC069 ^ 0x4AB6;
        AutoSprintModule.C[0xB48F ^ 0xB49D] = 0xFFFF4B38 ^ 0xB49D;
        AutoSprintModule.C[0xD1A7 ^ 0xD109] = 0xFFFF30F8 ^ 0xD109;
        AutoSprintModule.C[0x4A5B ^ 0x4BDB] = 0x8DB6 ^ 0x4BDB;
        AutoSprintModule.C[0x1482 ^ 0x1509] = 0x1509 ^ 0x1509;
        AutoSprintModule.C[0x10A91 ^ 0x10B97] = 0x13B88 ^ 0x10B97;
        AutoSprintModule.C[0x10F94 ^ 0x10EAF] = 0x144A2 ^ 0x10EAF;
        AutoSprintModule.C[0xE630 ^ 0xE732] = 0x9439 ^ 0xE732;
        AutoSprintModule.C[0x52A5 ^ 0x53DC] = 0x52DC ^ 0x53DC;
        AutoSprintModule.C[0x8562 ^ 0x8538] = 0xFFFF7A44 ^ 0x8538;
        AutoSprintModule.C[0xFB3C ^ 0xFA19] = 0x170D ^ 0xFA19;
        AutoSprintModule.C[0x1DA4 ^ 0x1DC4] = 0xFFFFE225 ^ 0x1DC4;
        AutoSprintModule.C[0x49E5 ^ 0x48E5] = 0x3BEE ^ 0x48E5;
        AutoSprintModule.C[0x2B1 ^ 0x252] = 0x98BE ^ 0x252;
        AutoSprintModule.C[0xD896 ^ 0xD88B] = 0xD885 ^ 0xD88B;
        AutoSprintModule.C[0xE3B5 ^ 0xE3CE] = 0xE3CF ^ 0xE3CE;
        AutoSprintModule.C[0x3E31 ^ 0x3F11] = 0x1431 ^ 0x3F11;
        AutoSprintModule.C[0x434D ^ 0x420E] = 0x420E ^ 0x420E;
        AutoSprintModule.C[0xE83E ^ 0xE969] = 0xE979 ^ 0xE969;
        AutoSprintModule.C[0x70D2 ^ 0x71CF] = 0xFFFFE983 ^ 0x71CF;
        AutoSprintModule.C[0x9A91 ^ 0x9AC2] = 0x9ABF ^ 0x9AC2;
        AutoSprintModule.C[0xF59C ^ 0xF4F6] = 0xF4FB ^ 0xF4F6;
        AutoSprintModule.C[0x1539 ^ 0x1593] = 0xB40 ^ 0x1593;
        AutoSprintModule.C[0xFBCA ^ 0xFAAD] = 0xFAF9 ^ 0xFAAD;
        AutoSprintModule.C[0x94B4 ^ 0x9401] = 0xA73A ^ 0x9401;
        AutoSprintModule.C[0x9EBA ^ 0x9E85] = 0x9E37 ^ 0x9E85;
        AutoSprintModule.C[0x256 ^ 0x31F] = 0x831E ^ 0x31F;
        AutoSprintModule.C[0x10712 ^ 0x10729] = 0x1839E ^ 0x10729;
        AutoSprintModule.C[0x8CB8 ^ 0x8C95] = 0x8C95 ^ 0x8C95;
        AutoSprintModule.C[0xAC86 ^ 0xACA7] = 0xFFFF5343 ^ 0xACA7;
        AutoSprintModule.C[0x102FA ^ 0x10235] = 0x19A2D ^ 0x10235;
        AutoSprintModule.C[0xC0C6 ^ 0xC0BE] = 0xC0BF ^ 0xC0BE;
        AutoSprintModule.C[0x10A74 ^ 0x10B26] = 0x1BD12 ^ 0x10B26;
        AutoSprintModule.C[0x10088 ^ 0x101D0] = 0x101DA ^ 0x101D0;
        AutoSprintModule.C[0xB9E3 ^ 0xB8C4] = 0x7C96 ^ 0xB8C4;
        AutoSprintModule.C[0x21EA ^ 0x20E2] = 0x5BD8 ^ 0x20E2;
        AutoSprintModule.C[0x1515 ^ 0x1450] = 0x1450 ^ 0x1450;
        AutoSprintModule.C[0xD6CB ^ 0xD656] = 0xD18E ^ 0xD656;
        AutoSprintModule.C[0xC91E ^ 0xC87B] = 0xFFFF37F2 ^ 0xC87B;
        AutoSprintModule.C[0x4133 ^ 0x4130] = 0xFFFFBE84 ^ 0x4130;
        AutoSprintModule.C[0x1C57 ^ 0x1C5E] = 0x1C5C ^ 0x1C5E;
        AutoSprintModule.C[0xE7F4 ^ 0xE6F8] = 0x4202 ^ 0xE6F8;
        AutoSprintModule.C[0x5DB ^ 0x54D] = 0xFFFF0F84 ^ 0x54D;
        AutoSprintModule.C[0x4153 ^ 0x415B] = 0x417E ^ 0x415B;
        AutoSprintModule.C[0xABDA ^ 0xABB1] = 0xABEA ^ 0xABB1;
        AutoSprintModule.C[0x7F00 ^ 0x7E7E] = 0xA2BC ^ 0x7E7E;
        AutoSprintModule.C[0x43AA ^ 0x43CB] = 0x43D9 ^ 0x43CB;
        AutoSprintModule.C[0x474A ^ 0x462E] = 0x4628 ^ 0x462E;
        AutoSprintModule.C[0xBC9 ^ 0xBFB] = 0xEF9 ^ 0xBFB;
        AutoSprintModule.C[0x6777 ^ 0x6641] = 0x16E3E ^ 0x6641;
        AutoSprintModule.C[0x403D ^ 0x4152] = 0x4166 ^ 0x4152;
        AutoSprintModule.C[0x9A5 ^ 0x96F] = 0x5F79 ^ 0x96F;
        AutoSprintModule.C[0x3EDA ^ 0x3F98] = 0xDF02 ^ 0x3F98;
        AutoSprintModule.C[0x10555 ^ 0x1058A] = 0x1AA9D ^ 0x1058A;
        AutoSprintModule.C[0x72D5 ^ 0x7256] = 0x5BE ^ 0x7256;
        AutoSprintModule.C[0x9288 ^ 0x9254] = 0xDF38 ^ 0x9254;
        AutoSprintModule.C[0xFC8D ^ 0xFCA4] = 0xFCA5 ^ 0xFCA4;
        AutoSprintModule.C[0x11FC ^ 0x1115] = 0xFFFFFBE7 ^ 0x1115;
        AutoSprintModule.C[0xA73B ^ 0xA665] = 0xA66D ^ 0xA665;
        AutoSprintModule.C[0x348 ^ 0x3E3] = 0x1D42 ^ 0x3E3;
        AutoSprintModule.C[0x4D17 ^ 0x4DAF] = 0x47 ^ 0x4DAF;
        AutoSprintModule.C[0x393E ^ 0x386F] = 0xD95B ^ 0x386F;
        AutoSprintModule.C[0x458B ^ 0x4527] = 0x5B6E ^ 0x4527;
        AutoSprintModule.C[0x2A03 ^ 0x2B56] = 0xC588 ^ 0x2B56;
        AutoSprintModule.C[0xBCB5 ^ 0xBD39] = 0xBD29 ^ 0xBD39;
        AutoSprintModule.C[0x706 ^ 0x63A] = 0x4C2B ^ 0x63A;
        AutoSprintModule.C[0x13A8 ^ 0x12A9] = 0x61C1 ^ 0x12A9;
        AutoSprintModule.C[0xCCAC ^ 0xCC12] = 0x19AA ^ 0xCC12;
        AutoSprintModule.C[0xC303 ^ 0xC207] = 0xF218 ^ 0xC207;
        AutoSprintModule.C[0x722F ^ 0x736F] = 0x93F5 ^ 0x736F;
        AutoSprintModule.C[0x249A ^ 0x25C3] = 0xFFFFDA1E ^ 0x25C3;
        AutoSprintModule.C[0x4FC1 ^ 0x4F30] = 0xFFFFA259 ^ 0x4F30;
        AutoSprintModule.C[0xE9B0 ^ 0xE90D] = 0x3CE0 ^ 0xE90D;
        AutoSprintModule.C[0x4C1 ^ 0x5C2] = 0x35D3 ^ 0x5C2;
        AutoSprintModule.C[0xFDC6 ^ 0xFC95] = 0xA50F ^ 0xFC95;
        AutoSprintModule.C[0x4B96 ^ 0x4B5F] = 0x1D0B ^ 0x4B5F;
        AutoSprintModule.C[0xDDBB ^ 0xDDBD] = 0xDDA8 ^ 0xDDBD;
        AutoSprintModule.C[0x87E3 ^ 0x8698] = 0x8698 ^ 0x8698;
        AutoSprintModule.C[0x7960 ^ 0x786E] = 0xDC94 ^ 0x786E;
        AutoSprintModule.C[0x8A0F ^ 0x8A86] = 0xA2DA ^ 0x8A86;
        AutoSprintModule.C[0x4826 ^ 0x486F] = 0xFFFFB7B5 ^ 0x486F;
        AutoSprintModule.C[0x2B9B ^ 0x2AAE] = 0xFFFEDD73 ^ 0x2AAE;
        AutoSprintModule.C[0x9636 ^ 0x969B] = 0x88DE ^ 0x969B;
        AutoSprintModule.C[0x6FF6 ^ 0x6EFC] = 0x15C6 ^ 0x6EFC;
        AutoSprintModule.C[0x4CDD ^ 0x4C33] = 0x5546 ^ 0x4C33;
        AutoSprintModule.C[0xC7C6 ^ 0xC6D4] = 0xAB07 ^ 0xC6D4;
        AutoSprintModule.C[0xE35F ^ 0xE3A3] = 0xEF5F ^ 0xE3A3;
        AutoSprintModule.C[0xAC7E ^ 0xAC7E] = 0xFFFF53B2 ^ 0xAC7E;
        AutoSprintModule.C[0xB196 ^ 0xB1A5] = 0xF0E0 ^ 0xB1A5;
        AutoSprintModule.C[0x117E ^ 0x110C] = 0x1170 ^ 0x110C;
        AutoSprintModule.C[0x61DF ^ 0x61E8] = 0x75A4 ^ 0x61E8;
        AutoSprintModule.C[0xE1D6 ^ 0xE157] = 0x96BF ^ 0xE157;
        AutoSprintModule.C[0xEB44 ^ 0xEA31] = 0xEA38 ^ 0xEA31;
        AutoSprintModule.C[0x755F ^ 0x75D5] = 0x5DE9 ^ 0x75D5;
        AutoSprintModule.C[0x5E64 ^ 0x5E74] = 0xFFFFA1CD ^ 0x5E74;
        AutoSprintModule.C[0x2DFA ^ 0x2CCA] = 0x80B8 ^ 0x2CCA;
        AutoSprintModule.C[0xB19B ^ 0xB090] = 0x1466 ^ 0xB090;
        AutoSprintModule.C[0x44E7 ^ 0x4412] = 0xFFFF11EB ^ 0x4412;
        AutoSprintModule.C[0xDF86 ^ 0xDFF0] = 0xDFA1 ^ 0xDFF0;
        AutoSprintModule.C[0xF379 ^ 0xF3C8] = 0x3CE3 ^ 0xF3C8;
        AutoSprintModule.C[0x13EA ^ 0x13E8] = 0xFFFFEC62 ^ 0x13E8;
        AutoSprintModule.C[0xA85 ^ 0xBAC] = 0xCFDF ^ 0xBAC;
        AutoSprintModule.C[0xAD49 ^ 0xAD46] = 0xAD09 ^ 0xAD46;
        AutoSprintModule.C[0x48DC ^ 0x481A] = 0x37B ^ 0x481A;
        AutoSprintModule.C[0x1C7A ^ 0x1CF6] = 0xD6D1 ^ 0x1CF6;
        AutoSprintModule.C[0x7AE7 ^ 0x7BF8] = 0x50C0 ^ 0x7BF8;
        AutoSprintModule.C[0xD55A ^ 0xD47C] = 0x3922 ^ 0xD47C;
        AutoSprintModule.C[0x6FBD ^ 0x6EA5] = 0xEB1 ^ 0x6EA5;
        AutoSprintModule.C[0x980D ^ 0x997C] = 0xFFFF66EA ^ 0x997C;
        AutoSprintModule.C[0xA374 ^ 0xA222] = 0xA223 ^ 0xA222;
        AutoSprintModule.C[0x7E8D ^ 0x7F03] = 0x7F00 ^ 0x7F03;
        AutoSprintModule.C[0x10FD4 ^ 0x10EA6] = 0x10EA8 ^ 0x10EA6;
        AutoSprintModule.C[0x2843 ^ 0x283E] = 0x283E ^ 0x283E;
        AutoSprintModule.C[0x9EC ^ 0x8FC] = 0x652F ^ 0x8FC;
        AutoSprintModule.C[0x4B4F ^ 0x4BD7] = 0x140D ^ 0x4BD7;
        AutoSprintModule.C[0x17B9 ^ 0x16E6] = 0x16B4 ^ 0x16E6;
        AutoSprintModule.C[0xD27D ^ 0xD298] = 0xFFFFB7DC ^ 0xD298;
        AutoSprintModule.C[0xE13A ^ 0xE1B1] = 0xC9ED ^ 0xE1B1;
        AutoSprintModule.C[0x50B2 ^ 0x5036] = 0x5021 ^ 0x5036;
        AutoSprintModule.C[0x6A0A ^ 0x6A0F] = 0xFFFF95FF ^ 0x6A0F;
        AutoSprintModule.C[0x78CD ^ 0x79AF] = 0x79AD ^ 0x79AF;
        AutoSprintModule.C[0xA2D3 ^ 0xA27C] = 0xBC39 ^ 0xA27C;
        AutoSprintModule.C[0xA742 ^ 0xA798] = 0xBFE1 ^ 0xA798;
        AutoSprintModule.C[0xCBE3 ^ 0xCB84] = 0xFFFF340C ^ 0xCB84;
        AutoSprintModule.C[0xEBA2 ^ 0xEB07] = 0x1EAA3 ^ 0xEB07;
        AutoSprintModule.C[0x35F3 ^ 0x350D] = 0x39F1 ^ 0x350D;
        AutoSprintModule.C[0x329F ^ 0x33B2] = 0x71D1 ^ 0x33B2;
        AutoSprintModule.C[0x599B ^ 0x5920] = 0x14C1 ^ 0x5920;
        AutoSprintModule.C[0x4AD8 ^ 0x4ACE] = 0xFFFFB570 ^ 0x4ACE;
        AutoSprintModule.C[0x336A ^ 0x333C] = 0x335F ^ 0x333C;
        AutoSprintModule.C[0x5621 ^ 0x56D3] = 0x443E ^ 0x56D3;
        AutoSprintModule.C[0x107BF ^ 0x1077E] = 0x1E965 ^ 0x1077E;
        AutoSprintModule.C[0xAB2E ^ 0xAA3A] = 0xE4B1 ^ 0xAA3A;
        AutoSprintModule.C[0xD6E0 ^ 0xD6BC] = 0xFFFF2968 ^ 0xD6BC;
        AutoSprintModule.C[0x8A7D ^ 0x8B5F] = 0xA07F ^ 0x8B5F;
        AutoSprintModule.C[0x1BF4 ^ 0x1B4D] = 0x56AC ^ 0x1B4D;
        AutoSprintModule.C[0x4832 ^ 0x481C] = 0x4884 ^ 0x481C;
        AutoSprintModule.C[0x9462 ^ 0x95E4] = 0x28D3 ^ 0x95E4;
        AutoSprintModule.C[0xBA4 ^ 0xA99] = 0xFFFFBF28 ^ 0xA99;
        AutoSprintModule.C[0xE16D ^ 0xE11D] = 0xE16C ^ 0xE11D;
        AutoSprintModule.C[0x4BC ^ 0x40A] = 0x3742 ^ 0x40A;
        AutoSprintModule.C[0x36A7 ^ 0x36CF] = 0xFFFFC96B ^ 0x36CF;
        AutoSprintModule.C[0xEDFB ^ 0xED29] = 0x7533 ^ 0xED29;
        AutoSprintModule.C[0x1A6D ^ 0x1A01] = 0x1A63 ^ 0x1A01;
        AutoSprintModule.C[0x1CFB ^ 0x1DCF] = 0x115B0 ^ 0x1DCF;
        AutoSprintModule.C[0x10DD5 ^ 0x10D31] = 0x197C0 ^ 0x10D31;
        AutoSprintModule.C[0xDBDF ^ 0xDB1B] = 0x907A ^ 0xDB1B;
        AutoSprintModule.C[0xD502 ^ 0xD41C] = 0xB391 ^ 0xD41C;
        AutoSprintModule.C[0xF8D1 ^ 0xF819] = 0xAE0F ^ 0xF819;
        AutoSprintModule.C[0x800D ^ 0x8114] = 0xFFFF1EFB ^ 0x8114;
        AutoSprintModule.C[0xB507 ^ 0xB559] = 0xB566 ^ 0xB559;
        AutoSprintModule.C[0xC0F3 ^ 0xC1C4] = 0xBCD6 ^ 0xC1C4;
        AutoSprintModule.C[0x2A44 ^ 0x2A09] = 0xFFFFD5A1 ^ 0x2A09;
        AutoSprintModule.C[0x77E7 ^ 0x76C4] = 0x9B81 ^ 0x76C4;
        AutoSprintModule.C[0x4223 ^ 0x4336] = 0xDF5 ^ 0x4336;
        AutoSprintModule.C[0x7589 ^ 0x75F8] = 0xFFFF8A0A ^ 0x75F8;
        AutoSprintModule.C[0x108CE ^ 0x109B2] = 0x109B1 ^ 0x109B2;
        AutoSprintModule.C[0x13BB ^ 0x1377] = 0x499B ^ 0x1377;
        AutoSprintModule.C[0xA1CC ^ 0xA157] = 0xFE86 ^ 0xA157;
        AutoSprintModule.C[0x8311 ^ 0x8350] = 0xFFFF7CE6 ^ 0x8350;
        AutoSprintModule.C[0xED84 ^ 0xEDF3] = 0xEDE1 ^ 0xEDF3;
        AutoSprintModule.C[0xB5E8 ^ 0xB508] = 0x1A16 ^ 0xB508;
        AutoSprintModule.C[0x6DA ^ 0x640] = 0xFFFFA615 ^ 0x640;
        AutoSprintModule.C[0xDAD4 ^ 0xDBA7] = 0xFFFF240B ^ 0xDBA7;
        AutoSprintModule.C[0xB516 ^ 0xB575] = 0xFFFF4AD5 ^ 0xB575;
        AutoSprintModule.C[0x22ED ^ 0x2364] = 0x4F59 ^ 0x2364;
        AutoSprintModule.C[0xCCEB ^ 0xCC30] = 0x814C ^ 0xCC30;
        AutoSprintModule.C[0x10832 ^ 0x1084C] = 0x1DC15 ^ 0x1084C;
        AutoSprintModule.C[0xEF95 ^ 0xEF63] = 0x4548 ^ 0xEF63;
        AutoSprintModule.C[0xE4F8 ^ 0xE595] = 0xFFFF1A42 ^ 0xE595;
        AutoSprintModule.C[0x512E ^ 0x516C] = 0x511A ^ 0x516C;
        AutoSprintModule.C[0xB29B ^ 0xB24A] = 0xFFFFD5F3 ^ 0xB24A;
        AutoSprintModule.C[0xADB3 ^ 0xAC8D] = 0xE69C ^ 0xAC8D;
        AutoSprintModule.C[0x9762 ^ 0x971E] = 0x971F ^ 0x971E;
        AutoSprintModule.C[0xBB40 ^ 0xBA01] = 0x5AC4 ^ 0xBA01;
        AutoSprintModule.C[0x666B ^ 0x6665] = 0xFFFF9983 ^ 0x6665;
        AutoSprintModule.C[0x524 ^ 0x50B] = 0x2EB ^ 0x50B;
        AutoSprintModule.C[0x6D14 ^ 0x6C3A] = 0x2E38 ^ 0x6C3A;
        AutoSprintModule.C[0x10726 ^ 0x10738] = 0xFFFEF817 ^ 0x10738;
        AutoSprintModule.C[0x5C29 ^ 0x5D24] = 0xF9A5 ^ 0x5D24;
        AutoSprintModule.C[0x56E3 ^ 0x56AC] = 0x569E ^ 0x56AC;
        AutoSprintModule.C[0xD5BF ^ 0xD487] = 0xA98F ^ 0xD487;
        AutoSprintModule.C[0x6A04 ^ 0x6A96] = 0xFFFFEB27 ^ 0x6A96;
        AutoSprintModule.C[0xD227 ^ 0xD2FF] = 0xCA86 ^ 0xD2FF;
        AutoSprintModule.C[0xF0FF ^ 0xF196] = 0xFFFF0E3E ^ 0xF196;
        AutoSprintModule.C[0xC85D ^ 0xC896] = 0x927A ^ 0xC896;
        AutoSprintModule.C[0x686E ^ 0x6941] = 0xC52D ^ 0x6941;
        AutoSprintModule.C[0x73D3 ^ 0x7320] = 0xD91F ^ 0x7320;
        AutoSprintModule.C[0x907C ^ 0x9086] = 0x4657 ^ 0x9086;
        AutoSprintModule.C[0x9303 ^ 0x9273] = 0x9274 ^ 0x9273;
        AutoSprintModule.C[0x102A2 ^ 0x102BE] = 0x102E7 ^ 0x102BE;
        AutoSprintModule.C[0x9231 ^ 0x92F2] = 0xD99E ^ 0x92F2;
        AutoSprintModule.C[0xB6A8 ^ 0xB6A9] = 0xB6E8 ^ 0xB6A9;
        AutoSprintModule.C[0x63EE ^ 0x62DC] = 0xCEAE ^ 0x62DC;
        AutoSprintModule.C[0xCAFB ^ 0xCBEA] = 0xFFFF59AB ^ 0xCBEA;
        AutoSprintModule.C[0xF996 ^ 0xF899] = 0x954E ^ 0xF899;
        AutoSprintModule.C[0x1093B ^ 0x10871] = 0x19293 ^ 0x10871;
        AutoSprintModule.C[0xF8E5 ^ 0xF860] = 0xF879 ^ 0xF860;
        AutoSprintModule.C[0xC079 ^ 0xC17C] = 0xFFFF0EF9 ^ 0xC17C;
        AutoSprintModule.C[0x4BCC ^ 0x4B2B] = 0x5E0B ^ 0x4B2B;
        AutoSprintModule.C[0xE7B4 ^ 0xE72B] = 0xE0F3 ^ 0xE72B;
        AutoSprintModule.C[0x10E96 ^ 0x10E07] = 0x1705A ^ 0x10E07;
        AutoSprintModule.C[0x1EAC ^ 0x1EEC] = 0x1EA4 ^ 0x1EEC;
        AutoSprintModule.C[0xC8C2 ^ 0xC984] = 0xC985 ^ 0xC984;
        AutoSprintModule.C[0x7317 ^ 0x7224] = 0x17A5A ^ 0x7224;
        AutoSprintModule.C[0xC81A ^ 0xC892] = 0xE0C6 ^ 0xC892;
        AutoSprintModule.C[0x8A38 ^ 0x8AFD] = 0xC1A9 ^ 0x8AFD;
        AutoSprintModule.C[0xA275 ^ 0xA314] = 0xFFFF5CB5 ^ 0xA314;
        AutoSprintModule.C[0xF30 ^ 0xF90] = 0x8545 ^ 0xF90;
        AutoSprintModule.C[0x2126 ^ 0x2137] = 0xFFFFDEC1 ^ 0x2137;
        AutoSprintModule.C[0x6186 ^ 0x609A] = 0x717 ^ 0x609A;
        AutoSprintModule.C[0x400 ^ 0x45B] = 0xFFFFFBD3 ^ 0x45B;
        AutoSprintModule.C[0x55C7 ^ 0x5548] = 0x9F6F ^ 0x5548;
        AutoSprintModule.C[0xC228 ^ 0xC304] = 0x8106 ^ 0xC304;
        AutoSprintModule.C[0x5FE7 ^ 0x5EB7] = 0xB083 ^ 0x5EB7;
        AutoSprintModule.C[0x4B73 ^ 0x4B51] = 0xFFFFB4FD ^ 0x4B51;
        AutoSprintModule.C[0xC089 ^ 0xC193] = 0xA187 ^ 0xC193;
        AutoSprintModule.C[0x8244 ^ 0x8221] = 0x8229 ^ 0x8221;
        AutoSprintModule.C[0xD61D ^ 0xD6A9] = 0xE593 ^ 0xD6A9;
        AutoSprintModule.C[0xA04B ^ 0xA131] = 0xA133 ^ 0xA131;
        AutoSprintModule.C[0x11E4 ^ 0x11E8] = 0xFFFFEE87 ^ 0x11E8;
        AutoSprintModule.C[0xC14F ^ 0xC1B6] = 0x1711 ^ 0xC1B6;
        AutoSprintModule.C[0x648A ^ 0x65C5] = 0xD0D5 ^ 0x65C5;
        AutoSprintModule.C[0xEC57 ^ 0xEC7C] = 0xEC7E ^ 0xEC7C;
        AutoSprintModule.C[0xED49 ^ 0xEDFB] = 0x228D ^ 0xEDFB;
        AutoSprintModule.C[0xFA0E ^ 0xFB8F] = 0x48C0 ^ 0xFB8F;
        AutoSprintModule.C[0xE9CC ^ 0xE915] = 0xF15C ^ 0xE915;
        AutoSprintModule.C[0x519D ^ 0x50DA] = 0x50DA ^ 0x50DA;
        AutoSprintModule.C[0xAC1D ^ 0xACC9] = 0x78C7 ^ 0xACC9;
        AutoSprintModule.C[0x5870 ^ 0x5924] = 0x57F ^ 0x5924;
        AutoSprintModule.C[0x10D9A ^ 0x10C1F] = 0x1CF48 ^ 0x10C1F;
        AutoSprintModule.C[0xC32 ^ 0xCA7] = 0xF9C4 ^ 0xCA7;
        AutoSprintModule.C[0x9A1F ^ 0x9A51] = 0xFFFF651E ^ 0x9A51;
        AutoSprintModule.C[0xF6A4 ^ 0xF7A3] = 0x8C8E ^ 0xF7A3;
        AutoSprintModule.C[0x5453 ^ 0x5480] = 0x8084 ^ 0x5480;
        AutoSprintModule.C[0xC7BE ^ 0xC7BA] = 0xFFFF381E ^ 0xC7BA;
        AutoSprintModule.C[0x4349 ^ 0x4379] = 0x8259 ^ 0x4379;
        AutoSprintModule.C[0x9CC3 ^ 0x9C7F] = 0x4991 ^ 0x9C7F;
        AutoSprintModule.C[0xD3E0 ^ 0xD33E] = 0x9E52 ^ 0xD33E;
        AutoSprintModule.C[0x1C4D ^ 0x1C5E] = 0xFFFFE3A7 ^ 0x1C5E;
        AutoSprintModule.C[0xE1AF ^ 0xE1C0] = 0xE143 ^ 0xE1C0;
        AutoSprintModule.C[0xAB20 ^ 0xAAAA] = 0xAAA8 ^ 0xAAAA;
        AutoSprintModule.C[0x701F ^ 0x7012] = 0x706A ^ 0x7012;
        AutoSprintModule.C[0x2279 ^ 0x22E9] = 0x5CBB ^ 0x22E9;
        AutoSprintModule.C[0x9C1D ^ 0x9C16] = 0x9C1B ^ 0x9C16;
        AutoSprintModule.C[0xAEF8 ^ 0xAF7A] = 0xC6E9 ^ 0xAF7A;
        AutoSprintModule.C[0xDF1E ^ 0xDE3A] = 0x3364 ^ 0xDE3A;
        AutoSprintModule.C[0x1AA7 ^ 0x1B8D] = 0xDFD0 ^ 0x1B8D;
        AutoSprintModule.C[0xC78F ^ 0xC60B] = 0xA0BD ^ 0xC60B;
        AutoSprintModule.C[0xDE00 ^ 0xDEF4] = 0x74DF ^ 0xDEF4;
        AutoSprintModule.C[0xF30B ^ 0xF312] = 0xFFFF0C9C ^ 0xF312;
        AutoSprintModule.C[0x74C3 ^ 0x75E2] = 0x5EEA ^ 0x75E2;
        AutoSprintModule.C[0x6472 ^ 0x64D5] = 0x16571 ^ 0x64D5;
        AutoSprintModule.C[0x4C28 ^ 0x4DA5] = 0x4DB5 ^ 0x4DA5;
        AutoSprintModule.C[0xDE30 ^ 0xDE10] = 0xFFFF2192 ^ 0xDE10;
        AutoSprintModule.C[0x55BC ^ 0x54F0] = 0x645C ^ 0x54F0;
        AutoSprintModule.C[0x78EF ^ 0x782F] = 0x782F ^ 0x782F;
        AutoSprintModule.C[0xBE21 ^ 0xBFAE] = 0xBFAE ^ 0xBFAE;
        AutoSprintModule.C[0x10361 ^ 0x10344] = 0xFFFEFC9E ^ 0x10344;
        AutoSprintModule.C[0x4D8 ^ 0x428] = 0x16C5 ^ 0x428;
        AutoSprintModule.C[0x2FB2 ^ 0x2EFA] = 0x2EE8 ^ 0x2EFA;
        AutoSprintModule.C[0xDE66 ^ 0xDEFF] = 0x812E ^ 0xDEFF;
        AutoSprintModule.C[0xEBD0 ^ 0xEB47] = 0x1E24 ^ 0xEB47;
        AutoSprintModule.C[0xE991 ^ 0xE9DB] = 0xE9CC ^ 0xE9DB;
        AutoSprintModule.C[0x10D2 ^ 0x11B9] = 0xFFFFEE0A ^ 0x11B9;
        AutoSprintModule.C[0x6C43 ^ 0x6C81] = 0x82BA ^ 0x6C81;
        AutoSprintModule.C[0x42B2 ^ 0x42EB] = 0x42F5 ^ 0x42EB;
        AutoSprintModule.C[0x980D ^ 0x98BD] = 0x579B ^ 0x98BD;
        AutoSprintModule.C[0xE670 ^ 0xE69B] = 0xFFE8 ^ 0xE69B;
        AutoSprintModule.C[0x7530 ^ 0x7596] = 0xFFFE8BFD ^ 0x7596;
        AutoSprintModule.C[0xDAE4 ^ 0xDB92] = 0xDB9D ^ 0xDB92;
        AutoSprintModule.C[0xEDEB ^ 0xEC9F] = 0xEC9F ^ 0xEC9F;
        AutoSprintModule.C[0xD337 ^ 0xD365] = 0xFFFF2CBF ^ 0xD365;
        AutoSprintModule.C[0xD415 ^ 0xD401] = 0xFFFF2BA5 ^ 0xD401;
        AutoSprintModule.C[0xF092 ^ 0xF0F6] = 0xF08E ^ 0xF0F6;
        AutoSprintModule.C[0xCF3D ^ 0xCF17] = 0xCF17 ^ 0xCF17;
        AutoSprintModule.C[0x462D ^ 0x4636] = 0x465E ^ 0x4636;
        AutoSprintModule.C[0xE49D ^ 0xE448] = 0xFFFFCFA3 ^ 0xE448;
        AutoSprintModule.C[0xA57F ^ 0xA5EC] = 0xDBB1 ^ 0xA5EC;
        AutoSprintModule.C[0xAB34 ^ 0xAA0B] = 0x4A94 ^ 0xAA0B;
        AutoSprintModule.C[0xF954 ^ 0xF973] = 0xF970 ^ 0xF973;
        AutoSprintModule.C[0x5085 ^ 0x50CE] = 0xFFFFAF33 ^ 0x50CE;
        AutoSprintModule.C[0x26E9 ^ 0x2693] = 0x2693 ^ 0x2693;
        AutoSprintModule.C[0x10508 ^ 0x105CF] = 0x153D2 ^ 0x105CF;
        AutoSprintModule.C[0x23A9 ^ 0x23D6] = 0xF79F ^ 0x23D6;
        AutoSprintModule.C[0x6528 ^ 0x654A] = 0xFFFF9A99 ^ 0x654A;
        AutoSprintModule.C[0x4520 ^ 0x45A2] = 0x326A ^ 0x45A2;
        AutoSprintModule.C[0x3DC ^ 0x324] = 0xD5F5 ^ 0x324;
        AutoSprintModule.C[0xE8F7 ^ 0xE81B] = 0xF16E ^ 0xE81B;
        AutoSprintModule.C[0x7F96 ^ 0x7EE1] = 0x7EB3 ^ 0x7EE1;
        AutoSprintModule.C[0xD7DA ^ 0xD732] = 0xC203 ^ 0xD732;
        AutoSprintModule.C[0xE2E8 ^ 0xE29B] = 0xFFFF1D33 ^ 0xE29B;
        AutoSprintModule.C[0xBB37 ^ 0xBBC8] = 0xC8DA ^ 0xBBC8;
        AutoSprintModule.C[0xF125 ^ 0xF160] = 0xF1A5 ^ 0xF160;
        AutoSprintModule.C[0xA48D ^ 0xA4E4] = 0xA461 ^ 0xA4E4;
        AutoSprintModule.C[0x15A ^ 0x1D7] = 0xCBF0 ^ 0x1D7;
        AutoSprintModule.C[0x99B5 ^ 0x9933] = 0xFFFF66CC ^ 0x9933;
        AutoSprintModule.C[0xB356 ^ 0xB20B] = 0xFFFF4D8C ^ 0xB20B;
        AutoSprintModule.C[0x8699 ^ 0x868E] = 0xFFFF792B ^ 0x868E;
        AutoSprintModule.C[0x4551 ^ 0x459C] = 0x1F12 ^ 0x459C;
        AutoSprintModule.C[0x10499 ^ 0x105E6] = 0x1CCEC ^ 0x105E6;
        AutoSprintModule.C[0x864F ^ 0x8663] = 0x8663 ^ 0x8663;
        AutoSprintModule.C[0x11B9 ^ 0x1154] = 0xFFFFF7DB ^ 0x1154;
        AutoSprintModule.C[0x6EB3 ^ 0x6E3D] = 0xFFFF5BAF ^ 0x6E3D;
        AutoSprintModule.C[0xD12B ^ 0xD198] = 0x1EB3 ^ 0xD198;
        AutoSprintModule.C[0x1335 ^ 0x1365] = 0xFFFFECC4 ^ 0x1365;
        AutoSprintModule.C[0x5E27 ^ 0x5EF7] = 0xC6ED ^ 0x5EF7;
        AutoSprintModule.C[0x9716 ^ 0x962C] = 0xEB24 ^ 0x962C;
        AutoSprintModule.C[0x2ADE ^ 0x2AE2] = 0x763A ^ 0x2AE2;
        AutoSprintModule.C[0xCC04 ^ 0xCCF9] = 0xC043 ^ 0xCCF9;
        AutoSprintModule.C[0xEC68 ^ 0xED0E] = 0xED0D ^ 0xED0E;
        AutoSprintModule.C[0x6EEB ^ 0x6F83] = 0x6F87 ^ 0x6F83;
        AutoSprintModule.C[0x7C2D ^ 0x7C85] = 0x6221 ^ 0x7C85;
        AutoSprintModule.C[0xD53B ^ 0xD455] = 0xD459 ^ 0xD455;
        AutoSprintModule.C[0x4B37 ^ 0x4A6D] = 0x4A64 ^ 0x4A6D;
        AutoSprintModule.C[0x9206 ^ 0x924A] = 0x927F ^ 0x924A;
        AutoSprintModule.C[0x10150 ^ 0x10124] = 0x10168 ^ 0x10124;
        AutoSprintModule.C[0xD09B ^ 0xD0CF] = 0xD0CF ^ 0xD0CF;
        AutoSprintModule.C[0x5AA1 ^ 0x5AFC] = 0xFFFFA573 ^ 0x5AFC;
        AutoSprintModule.C[0xDE6 ^ 0xD1D] = 0x1F4 ^ 0xD1D;
        AutoSprintModule.C[0x94E4 ^ 0x9463] = 0x947A ^ 0x9463;
        AutoSprintModule.C[0x10CD3 ^ 0x10CBD] = 0x10CF2 ^ 0x10CBD;
        AutoSprintModule.C[0xECA7 ^ 0xEDEC] = 0x92E0 ^ 0xEDEC;
        AutoSprintModule.C[0x3BA ^ 0x2C2] = 0x2D6 ^ 0x2C2;
        AutoSprintModule.C[0x59BF ^ 0x59E7] = 0xFFFFA61A ^ 0x59E7;
        AutoSprintModule.C[0xF781 ^ 0xF736] = 0xC40D ^ 0xF736;
        AutoSprintModule.C[0x26F5 ^ 0x27BB] = 0xA88B ^ 0x27BB;
        AutoSprintModule.C[0x18F4 ^ 0x18AB] = 0xFFFFE70B ^ 0x18AB;
        AutoSprintModule.C[0xFA0E ^ 0xFAD9] = 0xE2B6 ^ 0xFAD9;
        AutoSprintModule.C[0xE0C5 ^ 0xE146] = 0x6EB3 ^ 0xE146;
        AutoSprintModule.C[0x1902 ^ 0x1946] = 0xFFFFE6C5 ^ 0x1946;
        AutoSprintModule.C[0x198A ^ 0x1891] = 0x7F1B ^ 0x1891;
        AutoSprintModule.C[0xA52E ^ 0xA44E] = 0xA445 ^ 0xA44E;
        AutoSprintModule.C[0xB3B5 ^ 0xB2C8] = 0x7F89 ^ 0xB2C8;
        AutoSprintModule.C[0x46C8 ^ 0x462A] = 0xE934 ^ 0x462A;
        AutoSprintModule.C[0xB99F ^ 0xB9AA] = 0x3900 ^ 0xB9AA;
        AutoSprintModule.C[0x1B6B ^ 0x1A37] = 0x1A32 ^ 0x1A37;
        AutoSprintModule.C[0x5FB8 ^ 0x5ED4] = 0x5ED5 ^ 0x5ED4;
        AutoSprintModule.C[0xF2E8 ^ 0xF2F2] = 0xF2FC ^ 0xF2F2;
        AutoSprintModule.C[0x1E0C ^ 0x1F57] = 0xFFFFE0E5 ^ 0x1F57;
        AutoSprintModule.C[0x6BA7 ^ 0x6B46] = 0xFFFF3B8F ^ 0x6B46;
        AutoSprintModule.C[0xC787 ^ 0xC7A3] = 0xFFFF3855 ^ 0xC7A3;
        AutoSprintModule.C[0xF209 ^ 0xF233] = 0x1165 ^ 0xF233;
        AutoSprintModule.C[0x4B27 ^ 0x4B11] = 0x889A ^ 0x4B11;
        AutoSprintModule.C[0x6BC ^ 0x63C] = 0x71D2 ^ 0x63C;
        AutoSprintModule.C[0x9227 ^ 0x9261] = 0x9207 ^ 0x9261;
        AutoSprintModule.C[0x2FA7 ^ 0x2F96] = 0x5C97 ^ 0x2F96;
        AutoSprintModule.C[0x7F2D ^ 0x7F38] = 0x7F23 ^ 0x7F38;
        AutoSprintModule.C[0x16DA ^ 0x16EE] = 0x5DAB ^ 0x16EE;
        AutoSprintModule.C[0x30DD ^ 0x30E4] = 0x35E8 ^ 0x30E4;
        AutoSprintModule.C[0x3C12 ^ 0x3C31] = 0x3C05 ^ 0x3C31;
        AutoSprintModule.C[0x60CA ^ 0x60F2] = 0xDE7E ^ 0x60F2;
        AutoSprintModule.C[0x3679 ^ 0x3673] = 0xFFFFC987 ^ 0x3673;
        AutoSprintModule.C[0x6240 ^ 0x627E] = 0x627E ^ 0x627E;
        AutoSprintModule.C[0x6BD7 ^ 0x6B90] = 0xFFFF9451 ^ 0x6B90;
        AutoSprintModule.C[0xA0B9 ^ 0xA180] = 0xDCDB ^ 0xA180;
        AutoSprintModule.C[0x560D ^ 0x576E] = 0x577F ^ 0x576E;
        AutoSprintModule.C[0xA3C0 ^ 0xA3AD] = 0xFFFF5C1E ^ 0xA3AD;
        AutoSprintModule.C[0xB016 ^ 0xB047] = 0xB0E3 ^ 0xB047;
        AutoSprintModule.C[0x832B ^ 0x837E] = 0x833D ^ 0x837E;
        AutoSprintModule.C[0x504E ^ 0x5098] = 0x8496 ^ 0x5098;
        AutoSprintModule.C[0xF6A ^ 0xF80] = 0x1AB1 ^ 0xF80;
        AutoSprintModule.C[0x998A ^ 0x98A1] = 0xDABC ^ 0x98A1;
        AutoSprintModule.C[0x1A15 ^ 0x1A0A] = 0xFFFFE5A7 ^ 0x1A0A;
        AutoSprintModule.C[0x4BAB ^ 0x4B11] = 0xFFFFF909 ^ 0x4B11;
        AutoSprintModule.C[0xFBCF ^ 0xFB53] = 0xFC8F ^ 0xFB53;
        AutoSprintModule.C[0x846 ^ 0x8EF] = 0x164E ^ 0x8EF;
        AutoSprintModule.C[0x1E9E ^ 0x1F8D] = 0x5115 ^ 0x1F8D;
        AutoSprintModule.C[0x1390 ^ 0x12B8] = 0xD6E5 ^ 0x12B8;
        AutoSprintModule.C[0x7F44 ^ 0x7ECC] = 0xCF0 ^ 0x7ECC;
        AutoSprintModule.C[0x66B7 ^ 0x66FF] = 0x66EF ^ 0x66FF;
        AutoSprintModule.C[0x2CEA ^ 0x2DA7] = 0xCB0A ^ 0x2DA7;
        AutoSprintModule.C[0x402F ^ 0x408E] = 0xCA51 ^ 0x408E;
        AutoSprintModule.C[0xF454 ^ 0xF4A3] = 0x2260 ^ 0xF4A3;
        AutoSprintModule.C[0x9FB6 ^ 0x9F78] = 0xC594 ^ 0x9F78;
        AutoSprintModule.C[0xFE3C ^ 0xFF0D] = 0x531D ^ 0xFF0D;
        AutoSprintModule.C[0x5B98 ^ 0x5BA5] = 0x1FFA ^ 0x5BA5;
        AutoSprintModule.C[0x26A9 ^ 0x26B1] = 0xFFFFD927 ^ 0x26B1;
        AutoSprintModule.C[0x6342 ^ 0x63E0] = 0xE928 ^ 0x63E0;
        AutoSprintModule.C[0x1E4C ^ 0x1E26] = 0xFFFFE1D0 ^ 0x1E26;
        AutoSprintModule.C[0x9F53 ^ 0x9F8E] = 0xD2E9 ^ 0x9F8E;
        AutoSprintModule.C[0x1008 ^ 0x10AC] = 0x1110F ^ 0x10AC;
        AutoSprintModule.C[0x66F1 ^ 0x67E6] = 0x7FA ^ 0x67E6;
        AutoSprintModule.C[0x61F4 ^ 0x60FD] = 0x1B95 ^ 0x60FD;
        AutoSprintModule.C[0x10104 ^ 0x1017D] = 0x1017F ^ 0x1017D;
        AutoSprintModule.C[0xA2C1 ^ 0xA346] = 0x34BE ^ 0xA346;
        AutoSprintModule.C[0xAE44 ^ 0xAE31] = 0xAE52 ^ 0xAE31;
        AutoSprintModule.C[0x9DC6 ^ 0x9D79] = 0x4894 ^ 0x9D79;
        AutoSprintModule.C[0xDA1F ^ 0xDAF9] = 0x4008 ^ 0xDAF9;
    }
}

