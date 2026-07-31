/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.sound;

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
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0005\u0010\tR\u0017\u0010\n\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\u0012\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0014\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0016\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0018\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u001a\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u001c\u001a\u00020\b8\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\r\u00a8\u0006\u001e"}, d2={"Lkotakbaz/rain/client/sound/RainSoundEvents;", "", "<init>", "()V", "", "register", "", "path", "Lnet/minecraft/class_3414;", "(Ljava/lang/String;)Lnet/minecraft/class_3414;", "BELL", "Lnet/minecraft/class_3414;", "getBELL", "()Lnet/minecraft/class_3414;", "BONK", "getBONK", "BUBBLE", "getBUBBLE", "MODULE_DISABLE", "getMODULE_DISABLE", "MODULE_ENABLE", "getMODULE_ENABLE", "POP", "getPOP", "SLIDER", "getSLIDER", "UWU", "getUWU", "VK", "getVK", "rain-visuals"})
public final class RainSoundEvents {
    @NotNull
    public static final RainSoundEvents INSTANCE;
    @NotNull
    private static final SoundEvent a;
    @NotNull
    private static final SoundEvent A;
    @NotNull
    private static final SoundEvent b;
    @NotNull
    private static final SoundEvent B;
    @NotNull
    private static final SoundEvent c;
    @NotNull
    private static final SoundEvent C;
    @NotNull
    private static final SoundEvent d;
    @NotNull
    private static final SoundEvent D;
    @NotNull
    private static final SoundEvent e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    private RainSoundEvents() {
    }

    @NotNull
    public final SoundEvent getBELL() {
        return a;
    }

    @NotNull
    public final SoundEvent getBONK() {
        return A;
    }

    @NotNull
    public final SoundEvent getBUBBLE() {
        return b;
    }

    @NotNull
    public final SoundEvent getMODULE_DISABLE() {
        return B;
    }

    @NotNull
    public final SoundEvent getMODULE_ENABLE() {
        return c;
    }

    @NotNull
    public final SoundEvent getPOP() {
        return C;
    }

    @NotNull
    public final SoundEvent getSLIDER() {
        return d;
    }

    @NotNull
    public final SoundEvent getUWU() {
        return D;
    }

    @NotNull
    public final SoundEvent getVK() {
        return e;
    }

    public final void register() {
    }

    private final SoundEvent register(String path) {
        int n2 = h[0];
        n2 -= h[1];
        Identifier identifier = Identifier.of((String)((String)E[n2 -= h[2]]), (String)path);
        Object object = Registry.register((Registry)Registries.SOUND_EVENT, (Identifier)identifier, (Object)SoundEvent.of((Identifier)identifier));
        int n3 = h[3];
        n3 ^= h[4];
        Intrinsics.checkNotNullExpressionValue(object, (String)E[n3 += h[5]]);
        return (SoundEvent)object;
    }

    static {
        RainSoundEvents.b();
        long l2 = 3937632200425365532L;
        long l3 = -3518305725232501173L;
        long l4 = 1903907463008609519L;
        long l5 = -1388030883116416577L;
        long l6 = 7478374832813271675L;
        long l7 = 8613871451721536642L;
        long l8 = -1498039281641619609L;
        long l9 = -7830964332032397672L;
        long l10 = -8262032322411396778L;
        long l11 = -4472952937972642417L;
        long l12 = 9171961373023586648L;
        long l13 = 3858830396329977880L;
        long l14 = -2109731848007144541L;
        long l15 = -4883509487687739688L;
        int n2 = h[6];
        n2 ^= h[7];
        E = new Object[n2 += h[8]];
        long l16 = l15;
        int n3 = h[9];
        n3 -= h[10];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 -= h[11]);
        Object[] objectArray = new Object[h[12]];
        objectArray[RainSoundEvents.h[13]] = f;
        objectArray[RainSoundEvents.h[14]] = h[15];
        int n4 = h[16];
        Object object = RainSoundEvents.A()[h[17]];
        if (object == null) {
            char[] cArray = "\u3775\u3771\u377d\u36ac\u36ab\u37e1\u37e9\u37e7\u37c6\u37cd\u377b\u37e4\u37cf\u36a5\u3781\u3657\u3777\u37e9\u37c6\u37e1\u3784\u3771\u3797\u3631\u37da\u37e2\u36aa\u37c8\u3631\u37e6\u37e1\u37cd\u36ab\u37e5\u37d6\u3797\u3771\u36a6\u3775\u3781\u3771\u37cc\u37cb\u36aa\u37d5\u37e1\u36aa\u36af\u37e9\u3631\u37db\u377d\u37db\u37ec\u3792\u37ea\u37e2\u3772\u37cc\u36a6\u36af\u37e5\u37c2\u3657\u3778\u37ec\u37cf\u37de\u37ed\u37e4\u3776\u3776\u37d8\u37c6\u37ec\u37c5\u3640\u37c2\u37eb\u37e8\u37c6\u37e3\u37cc\u3777\u36aa\u3631\u37c2\u37ea\u37db\u36ab\u37c2\u37ec\u36a8\u37c6\u37c9\u36a6\u36af\u37e4\u3634\u3777\u37ca\u37ed\u377a\u36af\u37de\u36a8\u37c9\u37cc\u3778\u377d\u3778\u37c8\u3777\u3780\u37d8\u3778\u3771\u37cd\u37e5\u377a\u37cc\u37e8\u37dd\u37d1\u3780\u377a\u37db\u377d\u3792\u37ca\u37e3\u37de\u37ef\u37c9\u36ac\u37e3\u37e1\u36af\u37d5\u3634\u37d4\u3774\u3776\u3792\u37c9\u37d4\u37be\u37ed\u37ec\u3784\u364e\u364e".toCharArray();
            for (int i2 = h[18]; i2 < h[19]; ++i2) {
                int n5 = cArray[i2];
                n5 -= h[20];
                n5 ^= h[21];
                n5 -= h[22];
                n5 ^= h[23];
                n5 ^= h[24];
                n5 -= h[25];
                n5 += h[26];
                n5 -= h[27];
                n5 += h[28];
                n5 ^= h[29];
                n5 -= h[30];
                cArray[i2] = (char)(n5 ^= h[31]);
            }
            object = RainSoundEvents.A()[RainSoundEvents.h[32]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)RainSoundEvents.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = h[33];
        n6 ^= h[34];
        l6 = l17 ^ (0x5E00000000L ^ l17) & -1L << (n6 += h[35]);
        long l18 = l13;
        int n7 = h[36];
        n7 += h[37];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += h[38]);
        while (true) {
            int n8 = h[39];
            n8 ^= h[40];
            if ((int)l13 >= (int)(l6 >>> (n8 -= h[41]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = h[42];
            n10 -= h[43];
            int n11 = h[45];
            n11 ^= h[46];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= h[44])) & -1L >>> (n11 ^= h[47]);
            long l20 = l9;
            int n12 = h[48];
            n12 -= h[49];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 += h[50]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = h[51];
            n14 -= h[52];
            int n15 = h[54];
            n15 += h[55];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= h[53])) & -1L >>> (n15 -= h[56]);
            int n16 = h[57];
            n16 -= h[58];
            long l22 = l10;
            int n17 = h[60];
            n17 += h[61];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= h[59]) ^ l22) & -1L << (n17 += h[62]);
            int n18 = h[63];
            n18 -= h[64];
            n18 -= h[65];
            int n19 = h[66];
            n19 -= h[67];
            long l23 = l12;
            int n20 = h[69];
            n20 += h[70];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= h[68]))) ^ l23) & -1L >>> (n20 ^= h[71]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = h[72];
            n21 ^= h[73];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= h[74]);
            while (true) {
                int n22 = h[75];
                n22 ^= h[76];
                if ((int)(l14 >>> (n22 -= h[77])) >= (int)l12) break;
                int n23 = h[78];
                n23 += h[79];
                int n24 = h[81];
                n24 -= h[82];
                cArray2[(int)(l14 >>> (n23 -= RainSoundEvents.h[80]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += h[83]))];
                l14 += 0x100000000L;
            }
            int n25 = h[84];
            n25 -= h[85];
            int n26 = (int)(l15 >>> (n25 -= h[86]));
            l15 += 0x100000000L;
            RainSoundEvents.E[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = h[87];
            n27 -= h[88];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= h[89]);
        }
        INSTANCE = new RainSoundEvents();
        int n28 = h[90];
        n28 -= h[91];
        a = INSTANCE.register((String)E[n28 ^= h[92]]);
        int n29 = h[93];
        n29 -= h[94];
        A = INSTANCE.register((String)E[n29 += h[95]]);
        int n30 = h[96];
        n30 -= h[97];
        b = INSTANCE.register((String)E[n30 -= h[98]]);
        int n31 = h[99];
        n31 ^= h[100];
        B = INSTANCE.register((String)E[n31 ^= h[101]]);
        int n32 = h[102];
        n32 -= h[103];
        c = INSTANCE.register((String)E[n32 -= h[104]]);
        int n33 = h[105];
        n33 += h[106];
        C = INSTANCE.register((String)E[n33 += h[107]]);
        int n34 = h[108];
        n34 -= h[109];
        d = INSTANCE.register((String)E[n34 += h[110]]);
        int n35 = h[111];
        n35 ^= h[112];
        D = INSTANCE.register((String)E[n35 ^= h[113]]);
        int n36 = h[114];
        n36 -= h[115];
        e = INSTANCE.register((String)E[n36 -= h[116]]);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[h[117]];
        String string = (String)object[h[118]];
        object = object[h[119]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[120]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[121]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[123] ^ h[124]];
                byArray[RainSoundEvents.h[125] ^ RainSoundEvents.h[126]] = h[127] ^ h[128];
                byArray[RainSoundEvents.h[129] ^ RainSoundEvents.h[130]] = h[131] ^ h[132];
                byArray[RainSoundEvents.h[133] ^ RainSoundEvents.h[134]] = h[135] ^ h[136];
                byArray[RainSoundEvents.h[137] ^ RainSoundEvents.h[138]] = h[139] ^ h[140];
                byArray[RainSoundEvents.h[141] ^ RainSoundEvents.h[142]] = h[143] ^ h[144];
                byArray[RainSoundEvents.h[145] ^ RainSoundEvents.h[146]] = h[147] ^ h[148];
                byArray[RainSoundEvents.h[149] ^ RainSoundEvents.h[150]] = h[151] ^ h[152];
                byArray[RainSoundEvents.h[153] ^ RainSoundEvents.h[154]] = h[155] ^ h[156];
                byArray[RainSoundEvents.h[157] ^ RainSoundEvents.h[158]] = h[159] ^ h[160];
                byArray[RainSoundEvents.h[161] ^ RainSoundEvents.h[162]] = h[163] ^ h[164];
                byArray[RainSoundEvents.h[165] ^ RainSoundEvents.h[166]] = h[167] ^ h[168];
                byArray[RainSoundEvents.h[169] ^ RainSoundEvents.h[170]] = h[171] ^ h[172];
                byArray[RainSoundEvents.h[173] ^ RainSoundEvents.h[174]] = h[175] ^ h[176];
                byArray[RainSoundEvents.h[177] ^ RainSoundEvents.h[178]] = h[179] ^ h[180];
                byArray[RainSoundEvents.h[181] ^ RainSoundEvents.h[182]] = h[183] ^ h[184];
                byArray[RainSoundEvents.h[185] ^ RainSoundEvents.h[186]] = h[187] ^ h[188];
                objectArray2[RainSoundEvents.h[122]] = byArray;
            }
            byte[] byArray = (byte[])object3[h[189]];
            if (F == null) {
                byte[] byArray2 = new byte[h[190] ^ h[191]];
                byArray2[RainSoundEvents.h[192] ^ RainSoundEvents.h[193]] = h[194] ^ h[195];
                byArray2[RainSoundEvents.h[196] ^ RainSoundEvents.h[197]] = h[198] ^ h[199];
                byArray2[RainSoundEvents.h[200] ^ RainSoundEvents.h[201]] = h[202] ^ h[203];
                byArray2[RainSoundEvents.h[204] ^ RainSoundEvents.h[205]] = h[206] ^ h[207];
                byArray2[RainSoundEvents.h[208] ^ RainSoundEvents.h[209]] = h[210] ^ h[211];
                byArray2[RainSoundEvents.h[212] ^ RainSoundEvents.h[213]] = h[214] ^ h[215];
                byArray2[RainSoundEvents.h[216] ^ RainSoundEvents.h[217]] = h[218] ^ h[219];
                byArray2[RainSoundEvents.h[220] ^ RainSoundEvents.h[221]] = h[222] ^ h[223];
                byArray2[RainSoundEvents.h[224] ^ RainSoundEvents.h[225]] = h[226] ^ h[227];
                byArray2[RainSoundEvents.h[228] ^ RainSoundEvents.h[229]] = h[230] ^ h[231];
                byArray2[RainSoundEvents.h[232] ^ RainSoundEvents.h[233]] = h[234] ^ h[235];
                byArray2[RainSoundEvents.h[236] ^ RainSoundEvents.h[237]] = h[238] ^ h[239];
                byArray2[RainSoundEvents.h[240] ^ RainSoundEvents.h[241]] = h[242] ^ h[243];
                byArray2[RainSoundEvents.h[244] ^ RainSoundEvents.h[245]] = h[246] ^ h[247];
                byArray2[RainSoundEvents.h[248] ^ RainSoundEvents.h[249]] = h[250] ^ h[251];
                byArray2[RainSoundEvents.h[252] ^ RainSoundEvents.h[253]] = h[254] ^ h[255];
                byArray2[RainSoundEvents.h[256] ^ RainSoundEvents.h[257]] = h[258] ^ h[259];
                byArray2[RainSoundEvents.h[260] ^ RainSoundEvents.h[261]] = h[262] ^ h[263];
                byArray2[RainSoundEvents.h[264] ^ RainSoundEvents.h[265]] = h[266] ^ h[267];
                byArray2[RainSoundEvents.h[268] ^ RainSoundEvents.h[269]] = h[270] ^ h[271];
                byArray2[RainSoundEvents.h[272] ^ RainSoundEvents.h[273]] = h[274] ^ h[275];
                byArray2[RainSoundEvents.h[276] ^ RainSoundEvents.h[277]] = h[278] ^ h[279];
                byArray2[RainSoundEvents.h[280] ^ RainSoundEvents.h[281]] = h[282] ^ h[283];
                byArray2[RainSoundEvents.h[284] ^ RainSoundEvents.h[285]] = h[286] ^ h[287];
                byArray2[RainSoundEvents.h[288] ^ RainSoundEvents.h[289]] = h[290] ^ h[291];
                byArray2[RainSoundEvents.h[292] ^ RainSoundEvents.h[293]] = h[294] ^ h[295];
                byArray2[RainSoundEvents.h[296] ^ RainSoundEvents.h[297]] = h[298] ^ h[299];
                byArray2[RainSoundEvents.h[300] ^ RainSoundEvents.h[301]] = h[302] ^ h[303];
                byArray2[RainSoundEvents.h[304] ^ RainSoundEvents.h[305]] = h[306] ^ h[307];
                byArray2[RainSoundEvents.h[308] ^ RainSoundEvents.h[309]] = h[310] ^ h[311];
                byArray2[RainSoundEvents.h[312] ^ RainSoundEvents.h[313]] = h[314] ^ h[315];
                byArray2[RainSoundEvents.h[316] ^ RainSoundEvents.h[317]] = h[318] ^ h[319];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, h[320], byArray3, h[321], byArray.length);
                System.arraycopy(byArray2, h[322], byArray3, byArray.length, byArray2.length);
                Object object4 = RainSoundEvents.A()[h[323]];
                if (object4 == null) {
                    char[] cArray = "\ub28b\ub285\ub29c\ub29f\ub299\ub1d5\ub288\ub1b2\ub1af\ub1b3\ub293\ub1b6\ub1ba\ub1a4\ub274\ub293\ub29a\ub1ea".toCharArray();
                    for (int i2 = h[324]; i2 < h[325]; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= h[326];
                        n3 ^= h[327];
                        n3 += h[328];
                        n3 -= h[329];
                        n3 -= h[330];
                        n3 += h[331];
                        n3 ^= h[332];
                        n3 += h[333];
                        n3 -= h[334];
                        n3 -= h[335];
                        n3 -= h[336];
                        cArray[i2] = (char)(n3 ^= h[337]);
                    }
                    object4 = RainSoundEvents.A()[RainSoundEvents.h[338]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[h[339]];
                byArray4[RainSoundEvents.h[340]] = h[341];
                byArray4[RainSoundEvents.h[342]] = h[343];
                byArray4[RainSoundEvents.h[344]] = h[345];
                byArray4[RainSoundEvents.h[346]] = h[347];
                byArray4[RainSoundEvents.h[348]] = h[349];
                byArray4[RainSoundEvents.h[350]] = h[351];
                byArray4[RainSoundEvents.h[352]] = h[353];
                byArray4[RainSoundEvents.h[354]] = h[355];
                byArray4[RainSoundEvents.h[356]] = h[357];
                byArray4[RainSoundEvents.h[358]] = h[359];
                byArray4[RainSoundEvents.h[360]] = h[361];
                byArray4[RainSoundEvents.h[362]] = h[363];
                byArray4[RainSoundEvents.h[364]] = h[365];
                byArray4[RainSoundEvents.h[366]] = h[367];
                byArray4[RainSoundEvents.h[368]] = h[369];
                byArray4[RainSoundEvents.h[370]] = h[371];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, h[372], h[373]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = RainSoundEvents.A()[h[374]];
                if (object5 == null) {
                    char[] cArray = "\u2322\u23c6\u2318".toCharArray();
                    for (int i3 = h[375]; i3 < h[376]; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= h[377];
                        n4 ^= h[378];
                        n4 ^= h[379];
                        n4 -= h[380];
                        n4 -= h[381];
                        n4 ^= h[382];
                        n4 -= h[383];
                        n4 ^= h[384];
                        n4 -= h[385];
                        n4 ^= h[386];
                        cArray[i3] = (char)(n4 ^= h[387]);
                    }
                    object5 = RainSoundEvents.A()[RainSoundEvents.h[388]] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, h[389], h[390]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, h[391], byArray6.length);
            Object object6 = RainSoundEvents.A()[h[392]];
            if (object6 == null) {
                char[] cArray = "\u7ff2\u8146\u8144\u7f20\u7ff4\u8145\u7ff4\u7f20\u8143\u814c\u7ff4\u8144\u8036\u8143\u7f92\u7fe7\u7fe7\u7fea\u7fe1\u7fe8".toCharArray();
                for (int i4 = h[393]; i4 < h[394]; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= h[395];
                    n5 ^= h[396];
                    n5 -= h[397];
                    n5 -= h[398];
                    n5 += h[399];
                    n5 -= 2990;
                    n5 ^= 0x9D70;
                    n5 += 42194;
                    n5 ^= 0x4533;
                    n5 ^= 0xB2F4;
                    n5 += 47033;
                    n5 -= 36572;
                    cArray[i4] = (char)(n5 ^= 0x195E);
                }
                object6 = RainSoundEvents.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)F), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = G;
        if (G == null) {
            G = new Object[4];
            objectArray = G;
        }
        return objectArray;
    }

    public static void b() {
        h = new int[0x3E10 ^ 0x3F80];
        RainSoundEvents.h[0x7B79 ^ 0x7A4E] = 0xA17A ^ 0x7A4E;
        RainSoundEvents.h[0x9021 ^ 0x9144] = 0xFFFF6E8E ^ 0x9144;
        RainSoundEvents.h[0xE797 ^ 0xE76D] = 0x2B8B ^ 0xE76D;
        RainSoundEvents.h[0xEAC7 ^ 0xEA57] = 0x72A8 ^ 0xEA57;
        RainSoundEvents.h[0x2AEA ^ 0x2AAC] = 0x2AFC ^ 0x2AAC;
        RainSoundEvents.h[0x20EE ^ 0x204A] = 0xDA0F ^ 0x204A;
        RainSoundEvents.h[0xE2E1 ^ 0xE362] = 0xEE0D ^ 0xE362;
        RainSoundEvents.h[0x8B10 ^ 0x8BAA] = 0xA35C ^ 0x8BAA;
        RainSoundEvents.h[0x9364 ^ 0x93B6] = 0x6C00 ^ 0x93B6;
        RainSoundEvents.h[0xEEC ^ 0xF62] = 0x3FA9 ^ 0xF62;
        RainSoundEvents.h[0xB49F ^ 0xB5D6] = 0xC447 ^ 0xB5D6;
        RainSoundEvents.h[0x1858 ^ 0x1908] = 0x391 ^ 0x1908;
        RainSoundEvents.h[0x10D4A ^ 0x10D69] = 0xFFFEF2FF ^ 0x10D69;
        RainSoundEvents.h[0x7C10 ^ 0x7CA9] = 0x5452 ^ 0x7CA9;
        RainSoundEvents.h[0x5769 ^ 0x5627] = 0xB460 ^ 0x5627;
        RainSoundEvents.h[0x6FDA ^ 0x6F44] = 0xABAF ^ 0x6F44;
        RainSoundEvents.h[0x7087 ^ 0x7106] = 0xE62B ^ 0x7106;
        RainSoundEvents.h[0x5888 ^ 0x5804] = 0x8BC1 ^ 0x5804;
        RainSoundEvents.h[0x7CB9 ^ 0x7CC4] = 0xB6C1 ^ 0x7CC4;
        RainSoundEvents.h[0x7C0B ^ 0x7D46] = 0x7D60 ^ 0x7D46;
        RainSoundEvents.h[0xF759 ^ 0xF723] = 0xF723 ^ 0xF723;
        RainSoundEvents.h[0x311 ^ 0x235] = 0x8A1 ^ 0x235;
        RainSoundEvents.h[0xB27B ^ 0xB24C] = 0xB26D ^ 0xB24C;
        RainSoundEvents.h[0x30BA ^ 0x30FB] = 0x30DE ^ 0x30FB;
        RainSoundEvents.h[0x10C13 ^ 0x10D2B] = 0x133DC ^ 0x10D2B;
        RainSoundEvents.h[0x7AE6 ^ 0x7A3B] = 0xC42D ^ 0x7A3B;
        RainSoundEvents.h[0x9912 ^ 0x994C] = 0xFFFF66D7 ^ 0x994C;
        RainSoundEvents.h[0x2B9E ^ 0x2B70] = 0xFFFF5E95 ^ 0x2B70;
        RainSoundEvents.h[0x3C89 ^ 0x3CCA] = 0xFFFFC362 ^ 0x3CCA;
        RainSoundEvents.h[0xD99A ^ 0xD9B3] = 0xFFFF2602 ^ 0xD9B3;
        RainSoundEvents.h[0xDCAF ^ 0xDCC7] = 0xDC9A ^ 0xDCC7;
        RainSoundEvents.h[0xA643 ^ 0xA723] = 0xA72F ^ 0xA723;
        RainSoundEvents.h[0xBFFA ^ 0xBFF8] = 0xFFFF403F ^ 0xBFF8;
        RainSoundEvents.h[0x3C73 ^ 0x3D64] = 0xEA32 ^ 0x3D64;
        RainSoundEvents.h[0x1585 ^ 0x15D1] = 0x156D ^ 0x15D1;
        RainSoundEvents.h[0x10237 ^ 0x10355] = 0x1035B ^ 0x10355;
        RainSoundEvents.h[0xA16F ^ 0xA044] = 0xC144 ^ 0xA044;
        RainSoundEvents.h[0xC98B ^ 0xC8EF] = 0xC8EC ^ 0xC8EF;
        RainSoundEvents.h[0x42E1 ^ 0x42DC] = 0x4298 ^ 0x42DC;
        RainSoundEvents.h[0xD310 ^ 0xD301] = 0xD301 ^ 0xD301;
        RainSoundEvents.h[0x287E ^ 0x2950] = 0xFFFF9F60 ^ 0x2950;
        RainSoundEvents.h[0x1E03 ^ 0x1E8B] = 0x5E26 ^ 0x1E8B;
        RainSoundEvents.h[0x899F ^ 0x89AA] = 0x89CD ^ 0x89AA;
        RainSoundEvents.h[0x1F48 ^ 0x1FD4] = 0xE4EE ^ 0x1FD4;
        RainSoundEvents.h[0xDEF6 ^ 0xDE99] = 0xFFFF213C ^ 0xDE99;
        RainSoundEvents.h[0x80D9 ^ 0x80C4] = 0xEAAE ^ 0x80C4;
        RainSoundEvents.h[0x6956 ^ 0x6956] = 0xFFFF968C ^ 0x6956;
        RainSoundEvents.h[0x9E11 ^ 0x9EB8] = 0x1D5F ^ 0x9EB8;
        RainSoundEvents.h[0xD463 ^ 0xD54C] = 0x9CB3 ^ 0xD54C;
        RainSoundEvents.h[0x1E6A ^ 0x1F79] = 0xC26A ^ 0x1F79;
        RainSoundEvents.h[0x954B ^ 0x9565] = 0xFFFF6ABB ^ 0x9565;
        RainSoundEvents.h[0x2590 ^ 0x24DB] = 0x1298 ^ 0x24DB;
        RainSoundEvents.h[0xC18A ^ 0xC0FC] = 0xC0FE ^ 0xC0FC;
        RainSoundEvents.h[0x100C4 ^ 0x100D4] = 0x100D6 ^ 0x100D4;
        RainSoundEvents.h[0x54A ^ 0x453] = 0x3BEF ^ 0x453;
        RainSoundEvents.h[0x92D6 ^ 0x93E0] = 0x48D6 ^ 0x93E0;
        RainSoundEvents.h[0xA596 ^ 0xA5B2] = 0xFFFF5A58 ^ 0xA5B2;
        RainSoundEvents.h[0xE98 ^ 0xE48] = 0xF1BD ^ 0xE48;
        RainSoundEvents.h[0x9310 ^ 0x9323] = 0x9345 ^ 0x9323;
        RainSoundEvents.h[0xF8DD ^ 0xF861] = 0xD097 ^ 0xF861;
        RainSoundEvents.h[0xDAC9 ^ 0xDA1D] = 0xD8DF ^ 0xDA1D;
        RainSoundEvents.h[0x35D4 ^ 0x34E6] = 0xFFFF5817 ^ 0x34E6;
        RainSoundEvents.h[0x64F0 ^ 0x64FF] = 0x64FF ^ 0x64FF;
        RainSoundEvents.h[0x10AAB ^ 0x10AFA] = 0x10A4F ^ 0x10AFA;
        RainSoundEvents.h[0x6422 ^ 0x646A] = 0x6443 ^ 0x646A;
        RainSoundEvents.h[0xC8FB ^ 0xC9E7] = 0x12D1 ^ 0xC9E7;
        RainSoundEvents.h[0xA69E ^ 0xA7D9] = 0x6159 ^ 0xA7D9;
        RainSoundEvents.h[0x2F04 ^ 0x2FB2] = 0xCD84 ^ 0x2FB2;
        RainSoundEvents.h[0x2818 ^ 0x2960] = 0x2963 ^ 0x2960;
        RainSoundEvents.h[0x6B77 ^ 0x6B58] = 0xFFFF94D0 ^ 0x6B58;
        RainSoundEvents.h[0xD1A2 ^ 0xD1D9] = 0x3EAF ^ 0xD1D9;
        RainSoundEvents.h[0x7FC8 ^ 0x7FD1] = 0x2556 ^ 0x7FD1;
        RainSoundEvents.h[0x83F7 ^ 0x82D5] = 0xFFFFD235 ^ 0x82D5;
        RainSoundEvents.h[0x10F31 ^ 0x10E11] = 0x1A123 ^ 0x10E11;
        RainSoundEvents.h[0x388C ^ 0x39B0] = 0xF2E8 ^ 0x39B0;
        RainSoundEvents.h[0xD884 ^ 0xD9D0] = 0xD9D0 ^ 0xD9D0;
        RainSoundEvents.h[0xC2F ^ 0xD5B] = 0xD5C ^ 0xD5B;
        RainSoundEvents.h[0xD16E ^ 0xD193] = 0xF62F ^ 0xD193;
        RainSoundEvents.h[0x32AF ^ 0x325B] = 0x700C ^ 0x325B;
        RainSoundEvents.h[0x71A ^ 0x7FA] = 0xBB13 ^ 0x7FA;
        RainSoundEvents.h[0x45D6 ^ 0x4567] = 0xFD12 ^ 0x4567;
        RainSoundEvents.h[0x9854 ^ 0x9885] = 0x677E ^ 0x9885;
        RainSoundEvents.h[0x3B7A ^ 0x3B73] = 0xFFFFC4B1 ^ 0x3B73;
        RainSoundEvents.h[0xA4B6 ^ 0xA47B] = 0x9531 ^ 0xA47B;
        RainSoundEvents.h[0xB119 ^ 0xB00F] = 0x6769 ^ 0xB00F;
        RainSoundEvents.h[0xB51B ^ 0xB576] = 0xB546 ^ 0xB576;
        RainSoundEvents.h[0x821E ^ 0x827E] = 0x8258 ^ 0x827E;
        RainSoundEvents.h[0x10AC1 ^ 0x10A9C] = 0xFFFEF5EB ^ 0x10A9C;
        RainSoundEvents.h[0x6CF ^ 0x780] = 0x4768 ^ 0x780;
        RainSoundEvents.h[0x10FD0 ^ 0x10EA0] = 0x10EAD ^ 0x10EA0;
        RainSoundEvents.h[0x80B9 ^ 0x8062] = 0x8B4 ^ 0x8062;
        RainSoundEvents.h[0x7D41 ^ 0x7D56] = 0x5CC2 ^ 0x7D56;
        RainSoundEvents.h[0x928F ^ 0x929C] = 0x9204 ^ 0x929C;
        RainSoundEvents.h[0x3331 ^ 0x331C] = 0x336A ^ 0x331C;
        RainSoundEvents.h[0x9DFB ^ 0x9D19] = 0xFFFFDE3B ^ 0x9D19;
        RainSoundEvents.h[0xE6B7 ^ 0xE61D] = 0x65F0 ^ 0xE61D;
        RainSoundEvents.h[0x42AD ^ 0x4266] = 0x8CA8 ^ 0x4266;
        RainSoundEvents.h[0x5A6A ^ 0x5B3B] = 0x3697 ^ 0x5B3B;
        RainSoundEvents.h[0x9B03 ^ 0x9BAE] = 0x656C ^ 0x9BAE;
        RainSoundEvents.h[0xCB51 ^ 0xCBE2] = 0xFFFF8C77 ^ 0xCBE2;
        RainSoundEvents.h[0x8D5A ^ 0x8D6E] = 0xFFFF7290 ^ 0x8D6E;
        RainSoundEvents.h[0x81 ^ 0x36] = 0xE24A ^ 0x36;
        RainSoundEvents.h[0x4E41 ^ 0x4F0B] = 0x2529 ^ 0x4F0B;
        RainSoundEvents.h[0x37D1 ^ 0x3682] = 0x3692 ^ 0x3682;
        RainSoundEvents.h[0x103D0 ^ 0x102C5] = 0x1D593 ^ 0x102C5;
        RainSoundEvents.h[0x137B ^ 0x1322] = 0xFFFFECEA ^ 0x1322;
        RainSoundEvents.h[0x1362 ^ 0x13CE] = 0x9023 ^ 0x13CE;
        RainSoundEvents.h[0x874A ^ 0x8711] = 0xFFFF789E ^ 0x8711;
        RainSoundEvents.h[0x9B5A ^ 0x9B3B] = 0x9B68 ^ 0x9B3B;
        RainSoundEvents.h[0x78D6 ^ 0x79C2] = 0xAE84 ^ 0x79C2;
        RainSoundEvents.h[0xB017 ^ 0xB0E9] = 0xFFFF68B3 ^ 0xB0E9;
        RainSoundEvents.h[0xCC17 ^ 0xCCFD] = 0xE1F6 ^ 0xCCFD;
        RainSoundEvents.h[0xEA2A ^ 0xEA06] = 0xEA1B ^ 0xEA06;
        RainSoundEvents.h[0x7D12 ^ 0x7C1B] = 0x73C9 ^ 0x7C1B;
        RainSoundEvents.h[0x4763 ^ 0x4793] = 0xA3EC ^ 0x4793;
        RainSoundEvents.h[0xA31A ^ 0xA3F9] = 0x1F1C ^ 0xA3F9;
        RainSoundEvents.h[0x49B ^ 0x5AB] = 0x96FC ^ 0x5AB;
        RainSoundEvents.h[0xBCC2 ^ 0xBC8E] = 0xFFFF4365 ^ 0xBC8E;
        RainSoundEvents.h[0x8D82 ^ 0x8D16] = 0x849C ^ 0x8D16;
        RainSoundEvents.h[0x3214 ^ 0x3313] = 0x13633 ^ 0x3313;
        RainSoundEvents.h[0x5D12 ^ 0x5D98] = 0x8E5D ^ 0x5D98;
        RainSoundEvents.h[0xF350 ^ 0xF389] = 0x7B5F ^ 0xF389;
        RainSoundEvents.h[0x611F ^ 0x6075] = 0x607E ^ 0x6075;
        RainSoundEvents.h[0xC7CB ^ 0xC7F3] = 0xC795 ^ 0xC7F3;
        RainSoundEvents.h[0x6AF2 ^ 0x6ACD] = 0x6AEF ^ 0x6ACD;
        RainSoundEvents.h[0xB824 ^ 0xB9A6] = 0x9E89 ^ 0xB9A6;
        RainSoundEvents.h[0x1B72 ^ 0x1A60] = 0xC71E ^ 0x1A60;
        RainSoundEvents.h[0x1898 ^ 0x18E7] = 0xFFFF2D2E ^ 0x18E7;
        RainSoundEvents.h[0x104D5 ^ 0x1047E] = 0x187AE ^ 0x1047E;
        RainSoundEvents.h[0x5851 ^ 0x5893] = 0x6A45 ^ 0x5893;
        RainSoundEvents.h[0xA568 ^ 0xA46D] = 0x1A14D ^ 0xA46D;
        RainSoundEvents.h[0xD9D2 ^ 0xD966] = 0x611C ^ 0xD966;
        RainSoundEvents.h[0xF146 ^ 0xF004] = 0xF004 ^ 0xF004;
        RainSoundEvents.h[0x102B8 ^ 0x102EF] = 0xFFFEFD6D ^ 0x102EF;
        RainSoundEvents.h[0x9994 ^ 0x99CE] = 0xFFFF6614 ^ 0x99CE;
        RainSoundEvents.h[0xC9E2 ^ 0xC979] = 0x320F ^ 0xC979;
        RainSoundEvents.h[0x6A73 ^ 0x6ADC] = 0xFFFF6BC9 ^ 0x6ADC;
        RainSoundEvents.h[0x9599 ^ 0x95ED] = 0x95C0 ^ 0x95ED;
        RainSoundEvents.h[0xFE61 ^ 0xFEF6] = 0x6ADF ^ 0xFEF6;
        RainSoundEvents.h[0x85AA ^ 0x84EC] = 0xCC1C ^ 0x84EC;
        RainSoundEvents.h[0x387A ^ 0x3904] = 0xCBC ^ 0x3904;
        RainSoundEvents.h[0xFA39 ^ 0xFB31] = 0xF4FA ^ 0xFB31;
        RainSoundEvents.h[0x25F6 ^ 0x254D] = 0xFFFFF244 ^ 0x254D;
        RainSoundEvents.h[0x9999 ^ 0x98CC] = 0x98DE ^ 0x98CC;
        RainSoundEvents.h[0x68C7 ^ 0x6819] = 0xFFFF2994 ^ 0x6819;
        RainSoundEvents.h[0xB7BF ^ 0xB79E] = 0xB707 ^ 0xB79E;
        RainSoundEvents.h[0xB058 ^ 0xB0AA] = 0x54CC ^ 0xB0AA;
        RainSoundEvents.h[0x10750 ^ 0x107D1] = 0x1EE34 ^ 0x107D1;
        RainSoundEvents.h[0xB4D8 ^ 0xB479] = 0x4E38 ^ 0xB479;
        RainSoundEvents.h[0x3DCE ^ 0x3D8A] = 0xFFFFC22E ^ 0x3D8A;
        RainSoundEvents.h[0x2D5E ^ 0x2D7B] = 0xFFFFD2A1 ^ 0x2D7B;
        RainSoundEvents.h[0xD12A ^ 0xD05B] = 0xD00A ^ 0xD05B;
        RainSoundEvents.h[0x8C01 ^ 0x8C77] = 0x8C75 ^ 0x8C77;
        RainSoundEvents.h[0xE949 ^ 0xE911] = 0xFFFF168B ^ 0xE911;
        RainSoundEvents.h[0xD2BA ^ 0xD3B7] = 0xF353 ^ 0xD3B7;
        RainSoundEvents.h[0x3AA7 ^ 0x3BBA] = 0xE099 ^ 0x3BBA;
        RainSoundEvents.h[0xF3F2 ^ 0xF37B] = 0x20B7 ^ 0xF37B;
        RainSoundEvents.h[0xB12E ^ 0xB120] = 0xB121 ^ 0xB120;
        RainSoundEvents.h[0x6EE8 ^ 0x6E65] = 0xF69B ^ 0x6E65;
        RainSoundEvents.h[0x6CC5 ^ 0x6C19] = 0xD213 ^ 0x6C19;
        RainSoundEvents.h[0x49A2 ^ 0x49AE] = 0x49AD ^ 0x49AE;
        RainSoundEvents.h[0x10DEF ^ 0x10D49] = 0x12524 ^ 0x10D49;
        RainSoundEvents.h[0xC6D9 ^ 0xC6E2] = 0xC6B8 ^ 0xC6E2;
        RainSoundEvents.h[0xF413 ^ 0xF425] = 0xF440 ^ 0xF425;
        RainSoundEvents.h[0x2F96 ^ 0x2FDD] = 0x2FD2 ^ 0x2FDD;
        RainSoundEvents.h[0xFFA1 ^ 0xFFA9] = 0xFFFF0051 ^ 0xFFA9;
        RainSoundEvents.h[0x32D ^ 0x313] = 0xFFFFFCCA ^ 0x313;
        RainSoundEvents.h[0xB614 ^ 0xB6FF] = 0x9B80 ^ 0xB6FF;
        RainSoundEvents.h[0xE59F ^ 0xE4F7] = 0xE4F1 ^ 0xE4F7;
        RainSoundEvents.h[0x3D2B ^ 0x3D4F] = 0xFFFFC2F8 ^ 0x3D4F;
        RainSoundEvents.h[0xF569 ^ 0xF595] = 0xD233 ^ 0xF595;
        RainSoundEvents.h[0x10C00 ^ 0x10CAE] = 0x1F267 ^ 0x10CAE;
        RainSoundEvents.h[0xDB2E ^ 0xDB32] = 0x7C5B ^ 0xDB32;
        RainSoundEvents.h[0x1049A ^ 0x1051A] = 0x1E771 ^ 0x1051A;
        RainSoundEvents.h[0xA8CB ^ 0xA80F] = 0x94E8 ^ 0xA80F;
        RainSoundEvents.h[0x638B ^ 0x638A] = 0x639A ^ 0x638A;
        RainSoundEvents.h[0x1057F ^ 0x10567] = 0x1DAF1 ^ 0x10567;
        RainSoundEvents.h[0x617E ^ 0x6044] = 0x5ED2 ^ 0x6044;
        RainSoundEvents.h[0x10D4B ^ 0x10C67] = 0x1458C ^ 0x10C67;
        RainSoundEvents.h[0xD0E2 ^ 0xD038] = 0x58B4 ^ 0xD038;
        RainSoundEvents.h[0x5C74 ^ 0x5CFF] = 0x8F40 ^ 0x5CFF;
        RainSoundEvents.h[0x6CD3 ^ 0x6C0B] = 0xE4CA ^ 0x6C0B;
        RainSoundEvents.h[0xFD90 ^ 0xFDC5] = 0xFDB5 ^ 0xFDC5;
        RainSoundEvents.h[0xD4D7 ^ 0xD487] = 0xD499 ^ 0xD487;
        RainSoundEvents.h[0x9BD8 ^ 0x9A55] = 0xAC77 ^ 0x9A55;
        RainSoundEvents.h[0x3531 ^ 0x35C8] = 0xF94E ^ 0x35C8;
        RainSoundEvents.h[0x9A01 ^ 0x9A04] = 0x9A18 ^ 0x9A04;
        RainSoundEvents.h[0xCC81 ^ 0xCC1C] = 0x8F5 ^ 0xCC1C;
        RainSoundEvents.h[0xF6D8 ^ 0xF750] = 0xF753 ^ 0xF750;
        RainSoundEvents.h[0x720D ^ 0x7261] = 0x7256 ^ 0x7261;
        RainSoundEvents.h[0x9F23 ^ 0x9E1C] = 0x5559 ^ 0x9E1C;
        RainSoundEvents.h[0xA42A ^ 0xA438] = 0xA438 ^ 0xA438;
        RainSoundEvents.h[0x6A53 ^ 0x6BD7] = 0x6BD5 ^ 0x6BD7;
        RainSoundEvents.h[0x2069 ^ 0x2018] = 0xFFFFDFC8 ^ 0x2018;
        RainSoundEvents.h[0x156C ^ 0x1432] = 0x1435 ^ 0x1432;
        RainSoundEvents.h[0x2933 ^ 0x298D] = 0xC2D9 ^ 0x298D;
        RainSoundEvents.h[0x199B ^ 0x18E6] = 0xDC30 ^ 0x18E6;
        RainSoundEvents.h[0x9E4E ^ 0x9F06] = 0x2C46 ^ 0x9F06;
        RainSoundEvents.h[0x8ACB ^ 0x8BD0] = 0xB46C ^ 0x8BD0;
        RainSoundEvents.h[0xB783 ^ 0xB7ED] = 0xFFFF4813 ^ 0xB7ED;
        RainSoundEvents.h[0xEBBD ^ 0xEB3E] = 0x2CF ^ 0xEB3E;
        RainSoundEvents.h[0x771 ^ 0x7BD] = 0x36EC ^ 0x7BD;
        RainSoundEvents.h[0xA12A ^ 0xA135] = 0x2288 ^ 0xA135;
        RainSoundEvents.h[0x189E ^ 0x19CC] = 0x19CD ^ 0x19CC;
        RainSoundEvents.h[0xA10D ^ 0xA175] = 0xA174 ^ 0xA175;
        RainSoundEvents.h[0x7EBF ^ 0x7EB9] = 0xFFFF8131 ^ 0x7EB9;
        RainSoundEvents.h[0x88A9 ^ 0x89A2] = 0x8670 ^ 0x89A2;
        RainSoundEvents.h[0xCEA2 ^ 0xCF83] = 0x60B0 ^ 0xCF83;
        RainSoundEvents.h[0xC149 ^ 0xC1DF] = 0x55E3 ^ 0xC1DF;
        RainSoundEvents.h[0x4DC ^ 0x5A7] = 0xDA23 ^ 0x5A7;
        RainSoundEvents.h[0xB10B ^ 0xB160] = 0xB11D ^ 0xB160;
        RainSoundEvents.h[0xD1B3 ^ 0xD1FA] = 0xD18F ^ 0xD1FA;
        RainSoundEvents.h[0xB7AB ^ 0xB7B1] = 0x58E9 ^ 0xB7B1;
        RainSoundEvents.h[0x780E ^ 0x7826] = 0x7852 ^ 0x7826;
        RainSoundEvents.h[0x2A57 ^ 0x2A54] = 0x2A11 ^ 0x2A54;
        RainSoundEvents.h[0xE819 ^ 0xE88A] = 0xE111 ^ 0xE88A;
        RainSoundEvents.h[0xE856 ^ 0xE8AD] = 0x242B ^ 0xE8AD;
        RainSoundEvents.h[0x898F ^ 0x88F8] = 0x88F8 ^ 0x88F8;
        RainSoundEvents.h[0x5809 ^ 0x5823] = 0x5801 ^ 0x5823;
        RainSoundEvents.h[0x10828 ^ 0x109AD] = 0x109AD ^ 0x109AD;
        RainSoundEvents.h[0x85F2 ^ 0x8591] = 0xFFFF7A5F ^ 0x8591;
        RainSoundEvents.h[0xE42B ^ 0xE4C2] = 0xC9BD ^ 0xE4C2;
        RainSoundEvents.h[0x27FE ^ 0x277E] = 0xED7B ^ 0x277E;
        RainSoundEvents.h[0xEF0E ^ 0xEFEA] = 0xF762 ^ 0xEFEA;
        RainSoundEvents.h[0xC53D ^ 0xC45C] = 0xFFFF3BED ^ 0xC45C;
        RainSoundEvents.h[0x866A ^ 0x86ED] = 0xFFFF3998 ^ 0x86ED;
        RainSoundEvents.h[0x51DF ^ 0x517F] = 0x9594 ^ 0x517F;
        RainSoundEvents.h[0x1651 ^ 0x170A] = 0x1764 ^ 0x170A;
        RainSoundEvents.h[0x100A4 ^ 0x10035] = 0x109B1 ^ 0x10035;
        RainSoundEvents.h[0x8518 ^ 0x8435] = 0xCDCA ^ 0x8435;
        RainSoundEvents.h[0xE704 ^ 0xE66A] = 0xE668 ^ 0xE66A;
        RainSoundEvents.h[0x4FAF ^ 0x4FD1] = 0x85D4 ^ 0x4FD1;
        RainSoundEvents.h[0x8580 ^ 0x8505] = 0xC5AE ^ 0x8505;
        RainSoundEvents.h[0x68D7 ^ 0x68DA] = 0x68DA ^ 0x68DA;
        RainSoundEvents.h[0x532D ^ 0x5227] = 0xFFFFA206 ^ 0x5227;
        RainSoundEvents.h[0x3EFB ^ 0x3FDE] = 0x354E ^ 0x3FDE;
        RainSoundEvents.h[0xDB90 ^ 0xDBF2] = 0xFFFF2421 ^ 0xDBF2;
        RainSoundEvents.h[0x430A ^ 0x423B] = 0xD174 ^ 0x423B;
        RainSoundEvents.h[0x3FD2 ^ 0x3F3A] = 0x1242 ^ 0x3F3A;
        RainSoundEvents.h[0x12C1 ^ 0x13BD] = 0xCD58 ^ 0x13BD;
        RainSoundEvents.h[0x92F0 ^ 0x93DA] = 0xF2AD ^ 0x93DA;
        RainSoundEvents.h[0x5E78 ^ 0x5E32] = 0x5E4E ^ 0x5E32;
        RainSoundEvents.h[0xC625 ^ 0xC772] = 0xC71A ^ 0xC772;
        RainSoundEvents.h[0xA00B ^ 0xA05D] = 0xA071 ^ 0xA05D;
        RainSoundEvents.h[0xE40B ^ 0xE472] = 0xE473 ^ 0xE472;
        RainSoundEvents.h[0xEC29 ^ 0xECFC] = 0xEE2C ^ 0xECFC;
        RainSoundEvents.h[0x8AAC ^ 0x8B84] = 0xEA87 ^ 0x8B84;
        RainSoundEvents.h[0xC760 ^ 0xC624] = 0xC624 ^ 0xC624;
        RainSoundEvents.h[0x7F64 ^ 0x7FFD] = 0x84C0 ^ 0x7FFD;
        RainSoundEvents.h[0xE2AE ^ 0xE2E9] = 0xFFFF1D67 ^ 0xE2E9;
        RainSoundEvents.h[0x4390 ^ 0x435F] = 0x7215 ^ 0x435F;
        RainSoundEvents.h[0x5171 ^ 0x507D] = 0x7099 ^ 0x507D;
        RainSoundEvents.h[0xB1B8 ^ 0xB0FD] = 0xB0EF ^ 0xB0FD;
        RainSoundEvents.h[0xEC00 ^ 0xECC9] = 0x2207 ^ 0xECC9;
        RainSoundEvents.h[0xD02E ^ 0xD089] = 0xFFFF071B ^ 0xD089;
        RainSoundEvents.h[0x3208 ^ 0x3377] = 0xA99D ^ 0x3377;
        RainSoundEvents.h[0xBEBA ^ 0xBE91] = 0xBE95 ^ 0xBE91;
        RainSoundEvents.h[0x7CBA ^ 0x7DC0] = 0x3934 ^ 0x7DC0;
        RainSoundEvents.h[0x832F ^ 0x822B] = 0x18718 ^ 0x822B;
        RainSoundEvents.h[0xB43D ^ 0xB506] = 0x8BFE ^ 0xB506;
        RainSoundEvents.h[0xCA8E ^ 0xCAA9] = 0xFFFF350C ^ 0xCAA9;
        RainSoundEvents.h[0x108C7 ^ 0x109D8] = 0x1D2FB ^ 0x109D8;
        RainSoundEvents.h[0xE6CD ^ 0xE7F9] = 0x3CC7 ^ 0xE7F9;
        RainSoundEvents.h[0x1E2E ^ 0x1E29] = 0xFFFFE1B2 ^ 0x1E29;
        RainSoundEvents.h[0x8469 ^ 0x849F] = 0xC6D9 ^ 0x849F;
        RainSoundEvents.h[0xF9DB ^ 0xF941] = 0x27B ^ 0xF941;
        RainSoundEvents.h[0xEFDB ^ 0xEE9A] = 0xEE9A ^ 0xEE9A;
        RainSoundEvents.h[0x97B2 ^ 0x96EA] = 0x96E2 ^ 0x96EA;
        RainSoundEvents.h[0x12C4 ^ 0x12B4] = 0x12C9 ^ 0x12B4;
        RainSoundEvents.h[0x28D8 ^ 0x2897] = 0xFFFFD716 ^ 0x2897;
        RainSoundEvents.h[0x74F8 ^ 0x7414] = 0xFE03 ^ 0x7414;
        RainSoundEvents.h[0x74FB ^ 0x7404] = 0x53B8 ^ 0x7404;
        RainSoundEvents.h[0x6E68 ^ 0x6F6B] = 0x17E8 ^ 0x6F6B;
        RainSoundEvents.h[0x7380 ^ 0x7290] = 0xAF95 ^ 0x7290;
        RainSoundEvents.h[0x10C34 ^ 0x10CF3] = 0x13005 ^ 0x10CF3;
        RainSoundEvents.h[0xC726 ^ 0xC733] = 0xBDF1 ^ 0xC733;
        RainSoundEvents.h[0xF644 ^ 0xF638] = 0x195E ^ 0xF638;
        RainSoundEvents.h[0x79D4 ^ 0x7946] = 0x70CC ^ 0x7946;
        RainSoundEvents.h[0x2192 ^ 0x2173] = 0x9D96 ^ 0x2173;
        RainSoundEvents.h[0xF869 ^ 0xF8FC] = 0x6CC5 ^ 0xF8FC;
        RainSoundEvents.h[0xD068 ^ 0xD156] = 0x1A5D ^ 0xD156;
        RainSoundEvents.h[0x29A1 ^ 0x2959] = 0xE5D4 ^ 0x2959;
        RainSoundEvents.h[0x19A ^ 0x1A6] = 0x1A5 ^ 0x1A6;
        RainSoundEvents.h[0xAF5F ^ 0xAE7C] = 0x14F ^ 0xAE7C;
        RainSoundEvents.h[0x36DA ^ 0x36B3] = 0xFFFFC91B ^ 0x36B3;
        RainSoundEvents.h[0x9F06 ^ 0x9E5B] = 0x9E07 ^ 0x9E5B;
        RainSoundEvents.h[0xF12D ^ 0xF127] = 0xFFFF0E9A ^ 0xF127;
        RainSoundEvents.h[0xE2 ^ 0x47] = 0x2829 ^ 0x47;
        RainSoundEvents.h[0xA640 ^ 0xA6A6] = 0xFFFF41A5 ^ 0xA6A6;
        RainSoundEvents.h[0x6B88 ^ 0x6B35] = 0x6B35 ^ 0x6B35;
        RainSoundEvents.h[0xC674 ^ 0xC7F3] = 0xC7E3 ^ 0xC7F3;
        RainSoundEvents.h[0x895F ^ 0x89AA] = 0xCBF5 ^ 0x89AA;
        RainSoundEvents.h[0x4859 ^ 0x482E] = 0x482E ^ 0x482E;
        RainSoundEvents.h[0xD91 ^ 0xD8F] = 0x7B55 ^ 0xD8F;
        RainSoundEvents.h[0xE9B3 ^ 0xE8D4] = 0xFFFF170E ^ 0xE8D4;
        RainSoundEvents.h[0x9228 ^ 0x9208] = 0x9208 ^ 0x9208;
        RainSoundEvents.h[0xE5E5 ^ 0xE5B7] = 0xE585 ^ 0xE5B7;
        RainSoundEvents.h[0x50AA ^ 0x50E7] = 0xFFFFAF23 ^ 0x50E7;
        RainSoundEvents.h[0xA682 ^ 0xA6E7] = 0xA69A ^ 0xA6E7;
        RainSoundEvents.h[0x141E ^ 0x1527] = 0x2BDF ^ 0x1527;
        RainSoundEvents.h[0x78FB ^ 0x789C] = 0x78CE ^ 0x789C;
        RainSoundEvents.h[0x9B06 ^ 0x9A5C] = 0x9A56 ^ 0x9A5C;
        RainSoundEvents.h[0xB131 ^ 0xB02B] = 0x8FC3 ^ 0xB02B;
        RainSoundEvents.h[0x6D9B ^ 0x6D1D] = 0x2DB0 ^ 0x6D1D;
        RainSoundEvents.h[0xEF3A ^ 0xEE51] = 0xEE30 ^ 0xEE51;
        RainSoundEvents.h[0x6FBC ^ 0x6FB7] = 0xFFFF9052 ^ 0x6FB7;
        RainSoundEvents.h[0xDDF5 ^ 0xDCF4] = 0xA477 ^ 0xDCF4;
        RainSoundEvents.h[0xAE2 ^ 0xB64] = 0xB74 ^ 0xB64;
        RainSoundEvents.h[0x1A1B ^ 0x1A95] = 0x826A ^ 0x1A95;
        RainSoundEvents.h[0xECB0 ^ 0xEDDC] = 0xEDD5 ^ 0xEDDC;
        RainSoundEvents.h[0x2FA4 ^ 0x2EA6] = 0x5603 ^ 0x2EA6;
        RainSoundEvents.h[0xBDD4 ^ 0xBC97] = 0xBC96 ^ 0xBC97;
        RainSoundEvents.h[0x80D4 ^ 0x8012] = 0xBCA2 ^ 0x8012;
        RainSoundEvents.h[0x3FAF ^ 0x3E9A] = 0xE5AE ^ 0x3E9A;
        RainSoundEvents.h[0x7C58 ^ 0x7C61] = 0x7C36 ^ 0x7C61;
        RainSoundEvents.h[0x2C31 ^ 0x2D3E] = 0xDDA ^ 0x2D3E;
        RainSoundEvents.h[0x10FC8 ^ 0x10E88] = 0x10E88 ^ 0x10E88;
        RainSoundEvents.h[0xC130 ^ 0xC102] = 0xC159 ^ 0xC102;
        RainSoundEvents.h[0x4189 ^ 0x410B] = 0xA8E2 ^ 0x410B;
        RainSoundEvents.h[0xEAEF ^ 0xEB9A] = 0xEA9A ^ 0xEB9A;
        RainSoundEvents.h[0xF6FD ^ 0xF610] = 0x7C01 ^ 0xF610;
        RainSoundEvents.h[0xFF0F ^ 0xFE32] = 0x3577 ^ 0xFE32;
        RainSoundEvents.h[0x108A1 ^ 0x1083E] = 0x1CC9A ^ 0x1083E;
        RainSoundEvents.h[0x3AAF ^ 0x3A37] = 0xAE0B ^ 0x3A37;
        RainSoundEvents.h[0x1F60 ^ 0x1FB7] = 0x1D67 ^ 0x1FB7;
        RainSoundEvents.h[0x10C24 ^ 0x10D5D] = 0x19A5D ^ 0x10D5D;
        RainSoundEvents.h[0x369C ^ 0x3656] = 0xFFFF0729 ^ 0x3656;
        RainSoundEvents.h[0x10BE8 ^ 0x10B9A] = 0xFFFEF45C ^ 0x10B9A;
        RainSoundEvents.h[0x9C2D ^ 0x9C85] = 0xB4E8 ^ 0x9C85;
        RainSoundEvents.h[0xF27B ^ 0xF2CE] = 0x10F0 ^ 0xF2CE;
        RainSoundEvents.h[0x76D4 ^ 0x7666] = 0xCE1C ^ 0x7666;
        RainSoundEvents.h[0xD588 ^ 0xD4D1] = 0xFFFF2B3E ^ 0xD4D1;
        RainSoundEvents.h[0x35A0 ^ 0x35E0] = 0xFFFFCA0D ^ 0x35E0;
        RainSoundEvents.h[0x17E1 ^ 0x16BE] = 0x16E9 ^ 0x16BE;
        RainSoundEvents.h[0x1274 ^ 0x1317] = 0xFFFFECFB ^ 0x1317;
        RainSoundEvents.h[0xAC3E ^ 0xACF6] = 0x6235 ^ 0xACF6;
        RainSoundEvents.h[0x10F73 ^ 0x10EFC] = 0x1DA70 ^ 0x10EFC;
        RainSoundEvents.h[0xC5E3 ^ 0xC553] = 0x3B9A ^ 0xC553;
        RainSoundEvents.h[0xE619 ^ 0xE73E] = 0xEDAE ^ 0xE73E;
        RainSoundEvents.h[0x3869 ^ 0x38CB] = 0xC28E ^ 0x38CB;
        RainSoundEvents.h[0xA6AF ^ 0xA7C6] = 0xA7D3 ^ 0xA7C6;
        RainSoundEvents.h[0xBE1B ^ 0xBECD] = 0xFFFF43C4 ^ 0xBECD;
        RainSoundEvents.h[0xE8AF ^ 0xE9A9] = 0xFFFE1370 ^ 0xE9A9;
        RainSoundEvents.h[0x9382 ^ 0x93DD] = 0x93FB ^ 0x93DD;
        RainSoundEvents.h[0xEBFE ^ 0xEB11] = 0x6100 ^ 0xEB11;
        RainSoundEvents.h[0x20F9 ^ 0x218A] = 0xFFFFDE7E ^ 0x218A;
        RainSoundEvents.h[0x87EA ^ 0x86C3] = 0xE7C3 ^ 0x86C3;
        RainSoundEvents.h[0xEDE0 ^ 0xEC6C] = 0x23CC ^ 0xEC6C;
        RainSoundEvents.h[0x10C4F ^ 0x10D41] = 0xFFFED235 ^ 0x10D41;
        RainSoundEvents.h[0x10875 ^ 0x10871] = 0xFFFEF7DF ^ 0x10871;
        RainSoundEvents.h[0x2052 ^ 0x2174] = 0x2B9C ^ 0x2174;
        RainSoundEvents.h[0x2B75 ^ 0x2A07] = 0x2A06 ^ 0x2A07;
        RainSoundEvents.h[0x430D ^ 0x431B] = 0x12E8 ^ 0x431B;
        RainSoundEvents.h[0xF5EC ^ 0xF563] = 0x6DBA ^ 0xF563;
        RainSoundEvents.h[0x14FD ^ 0x145E] = 0xEE22 ^ 0x145E;
        RainSoundEvents.h[0xD5A3 ^ 0xD5C9] = 0xFFFF2A2D ^ 0xD5C9;
        RainSoundEvents.h[0x2C1D ^ 0x2C7B] = 0x2CCB ^ 0x2C7B;
        RainSoundEvents.h[0xB66 ^ 0xB7D] = 0xADC5 ^ 0xB7D;
        RainSoundEvents.h[0x1389 ^ 0x1347] = 0x2246 ^ 0x1347;
        RainSoundEvents.h[0x5BD7 ^ 0x5B14] = 0x69FF ^ 0x5B14;
        RainSoundEvents.h[0x45CD ^ 0x45EB] = 0x45B7 ^ 0x45EB;
        RainSoundEvents.h[0x7300 ^ 0x7331] = 0xFFFF8CAB ^ 0x7331;
        RainSoundEvents.h[0x36FA ^ 0x363F] = 0xAC9 ^ 0x363F;
        RainSoundEvents.h[0x9E84 ^ 0x9E90] = 0x9761 ^ 0x9E90;
        RainSoundEvents.h[0x10B2D ^ 0x10BA9] = 0x1E240 ^ 0x10BA9;
        RainSoundEvents.h[0xA687 ^ 0xA6D4] = 0xFFFF5949 ^ 0xA6D4;
        RainSoundEvents.h[0x2189 ^ 0x2091] = 0x1F33 ^ 0x2091;
        RainSoundEvents.h[0xB3D7 ^ 0xB2B8] = 0xFFFF4D54 ^ 0xB2B8;
        RainSoundEvents.h[0xDFED ^ 0xDEB1] = 0xDEB5 ^ 0xDEB1;
        RainSoundEvents.h[0xB979 ^ 0xB95B] = 0xB948 ^ 0xB95B;
        RainSoundEvents.h[0xFAB9 ^ 0xFA89] = 0xFFFF05D6 ^ 0xFA89;
        RainSoundEvents.h[0x8A22 ^ 0x8A60] = 0xFFFF754C ^ 0x8A60;
        RainSoundEvents.h[0x5491 ^ 0x551A] = 0x789A ^ 0x551A;
        RainSoundEvents.h[0x49B6 ^ 0x4885] = 0xDBCA ^ 0x4885;
        RainSoundEvents.h[0x2D15 ^ 0x2DAD] = 0xCF9B ^ 0x2DAD;
        RainSoundEvents.h[0xA076 ^ 0xA04C] = 0xFFFF5F91 ^ 0xA04C;
        RainSoundEvents.h[0xF4C3 ^ 0xF48D] = 0xF430 ^ 0xF48D;
        RainSoundEvents.h[0xF3D6 ^ 0xF316] = 0xC1F8 ^ 0xF316;
        RainSoundEvents.h[0x9312 ^ 0x9361] = 0xFFFF6CF2 ^ 0x9361;
        RainSoundEvents.h[0x71A5 ^ 0x70F3] = 0x70FC ^ 0x70F3;
        RainSoundEvents.h[0x6EDF ^ 0x6EAA] = 0x6EAB ^ 0x6EAA;
        RainSoundEvents.h[0xAC8A ^ 0xAC79] = 0x480F ^ 0xAC79;
        RainSoundEvents.h[0xD533 ^ 0xD42D] = 0xF0F ^ 0xD42D;
        RainSoundEvents.h[0x5A79 ^ 0x5BF0] = 0x5BF0 ^ 0x5BF0;
        RainSoundEvents.h[0xA6D4 ^ 0xA7C5] = 0x7AD6 ^ 0xA7C5;
        RainSoundEvents.h[0x5CC5 ^ 0x5D4F] = 0x5D5B ^ 0x5D4F;
        RainSoundEvents.h[0xCE72 ^ 0xCF14] = 0xCF11 ^ 0xCF14;
        RainSoundEvents.h[0x790C ^ 0x79D3] = 0xC7C5 ^ 0x79D3;
        RainSoundEvents.h[0xD6AF ^ 0xD6F3] = 0xD6B2 ^ 0xD6F3;
        RainSoundEvents.h[0x5620 ^ 0x56D7] = 0x1488 ^ 0x56D7;
        RainSoundEvents.h[0xBE97 ^ 0xBE70] = 0xA6FA ^ 0xBE70;
        RainSoundEvents.h[0xB2A1 ^ 0xB2E4] = 0xFFFF4DBA ^ 0xB2E4;
        RainSoundEvents.h[0x9C51 ^ 0x9CA0] = 0x78D6 ^ 0x9CA0;
        RainSoundEvents.h[0xAF4C ^ 0xAE21] = 0xFFFF5190 ^ 0xAE21;
        RainSoundEvents.h[0xAD ^ 0x1E1] = 0x1694 ^ 0x1E1;
        RainSoundEvents.h[0x24E6 ^ 0x25E6] = 0x5D7A ^ 0x25E6;
        RainSoundEvents.h[0xDA28 ^ 0xDACD] = 0xC247 ^ 0xDACD;
        RainSoundEvents.h[0xC588 ^ 0xC549] = 0xF7A2 ^ 0xC549;
        RainSoundEvents.h[0xD83D ^ 0xD8EE] = 0x2715 ^ 0xD8EE;
        RainSoundEvents.h[0x18D0 ^ 0x186F] = 0xF31B ^ 0x186F;
    }
}

