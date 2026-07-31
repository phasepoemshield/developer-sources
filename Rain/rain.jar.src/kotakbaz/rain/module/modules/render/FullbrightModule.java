/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render;

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
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0003J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0018"}, d2={"Lkotakbaz/rain/module/modules/render/FullbrightModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "usesNightVisionEffect", "()Z", "applyEffectMode", "clearEffectIfNeeded", "Lnet/minecraft/class_1293;", "effect", "isInjectedNightVisionEffect", "(Lnet/minecraft/class_1293;)Z", "", "EFFECT_DURATION", "I", "effectApplied", "Z", "rain-visuals"})
public final class FullbrightModule
extends Module {
    @NotNull
    public static final FullbrightModule INSTANCE;
    private static final int a = 400;
    private static boolean A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private FullbrightModule() {
        int n2 = D[0];
        n2 ^= D[1];
        int n3 = D[3];
        n3 += D[4];
        super((String)b[n2 ^= D[2]], a_0.getRENDER(), (String)b[n3 -= D[5]]);
    }

    @Override
    public void onDisable() {
        this.clearEffectIfNeeded();
        super.onDisable();
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        int n2 = D[6];
        n2 += D[7];
        Intrinsics.checkNotNullParameter(event, (String)b[n2 ^= D[8]]);
        this.applyEffectMode();
    }

    public final boolean usesNightVisionEffect() {
        return this.isEnabled();
    }

    private final void applyEffectMode() {
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        int n2 = D[9];
        n2 ^= D[10];
        n2 -= D[11];
        int n3 = D[12];
        n3 += D[13];
        n3 ^= D[14];
        boolean bl = D[15];
        bl -= D[16];
        boolean bl2 = D[18];
        bl2 -= D[19];
        boolean bl3 = D[21];
        bl3 += D[22];
        clientPlayerEntity2.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, n2, n3, bl ^= D[17], bl2 -= D[20], bl3 ^= D[23]));
        int n4 = D[24];
        n4 ^= D[25];
        A = n4 ^= D[26];
    }

    private final void clearEffectIfNeeded() {
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (!A || clientPlayerEntity == null) {
            int n2 = D[27];
            n2 ^= D[28];
            A = n2 -= D[29];
            return;
        }
        StatusEffectInstance statusEffectInstance = clientPlayerEntity.getStatusEffect(StatusEffects.NIGHT_VISION);
        if (statusEffectInstance != null && this.isInjectedNightVisionEffect(statusEffectInstance)) {
            clientPlayerEntity.removeStatusEffect(StatusEffects.NIGHT_VISION);
        }
        int n3 = D[30];
        n3 += D[31];
        A = n3 -= D[32];
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean isInjectedNightVisionEffect(@NotNull StatusEffectInstance effect) {
        int n2;
        int n3 = D[33];
        n3 -= D[34];
        Intrinsics.checkNotNullParameter(effect, (String)b[n3 -= D[35]]);
        if (Intrinsics.areEqual(effect.getEffectType(), StatusEffects.NIGHT_VISION) && effect.getAmplifier() == 0 && effect.getDuration() > 0) {
            int n4 = D[36];
            n4 ^= D[37];
            if (!(effect.getDuration() > (n4 += D[38]) || effect.isAmbient() || effect.shouldShowParticles() || effect.shouldShowIcon())) {
                int n5 = D[39];
                n5 += D[40];
                n2 = n5 -= D[41];
                return n2 != 0;
            }
        }
        int n6 = D[42];
        n6 -= D[43];
        n2 = n6 += D[44];
        return n2 != 0;
    }

    static {
        FullbrightModule.b();
        long l2 = 2878178797507254586L;
        long l3 = 3758007110324179624L;
        long l4 = 2637074771013594587L;
        long l5 = -7050657664803639166L;
        long l6 = -5730300586902963054L;
        long l7 = -2684356289832993995L;
        long l8 = 441615049671632113L;
        long l9 = 2004190014501394060L;
        long l10 = 5758717520305570162L;
        long l11 = 1479248868407236523L;
        long l12 = -2312763466372471129L;
        long l13 = -3414022727760512668L;
        long l14 = -4630052725187993162L;
        long l15 = -9121332137815719480L;
        int n2 = D[45];
        n2 += D[46];
        b = new Object[n2 += D[47]];
        long l16 = l15;
        int n3 = D[48];
        n3 += D[49];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= D[50]);
        Object[] objectArray = new Object[D[51]];
        objectArray[FullbrightModule.D[52]] = B;
        objectArray[FullbrightModule.D[53]] = D[54];
        int n4 = D[55];
        Object object = FullbrightModule.A()[D[56]];
        if (object == null) {
            char[] cArray = "\u7e9c\u7948\u7e98\u7e86\u79cb\u7965\u7962\u79ca\u7e85\u7e80\u7e9c\u7e97\u7e89\u7ebe\u7e88\u794d\u7e88\u7ea8\u79c4\u7e81\u7e80\u79c3\u794f\u79c2\u7964\u794c\u7ef3\u79c4\u7e87\u79c5\u79c1\u7eaf\u7e9f\u7ef2\u7949\u79c2\u794f\u7960\u7e8c\u7e80\u796a\u7960\u794d\u7e88\u7ef3\u7e99\u7e99\u7ebe\u794c\u7967\u7e9d\u7e88\u79c0\u7e8d\u7ebd\u794d\u7ef2\u7ef3\u7e8d\u7e85\u7ef3\u79c1\u7eac\u7962\u79c1\u794c\u7ebd\u7ea8\u7e92\u79cb\u7e80\u794f\u79ca\u7e87\u7e85\u794c\u7eac\u7967\u7948\u79c5\u7eb6\u7eb9\u7949\u79c2\u7ebd\u79ca\u79c1\u7eb2\u794d\u796b\u7eaf\u7ef2\u794c\u79ca\u7ebd\u7e8f\u794c\u7e98\u7e85\u796b\u79c3\u7e9c\u79c7\u7963\u7e99\u7eaf\u7e89\u7ebb".toCharArray();
            for (int i2 = D[57]; i2 < D[58]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= D[59];
                n5 += D[60];
                n5 -= D[61];
                n5 ^= D[62];
                n5 ^= D[63];
                n5 += D[64];
                n5 ^= D[65];
                n5 -= D[66];
                n5 += D[67];
                n5 += D[68];
                cArray[i2] = (char)(n5 -= D[69]);
            }
            object = FullbrightModule.A()[FullbrightModule.D[70]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)FullbrightModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = D[71];
        n6 += D[72];
        l6 = l17 ^ (0x2C00000000L ^ l17) & -1L << (n6 ^= D[73]);
        long l18 = l13;
        int n7 = D[74];
        n7 ^= D[75];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += D[76]);
        while (true) {
            int n8 = D[77];
            n8 -= D[78];
            if ((int)l13 >= (int)(l6 >>> (n8 += D[79]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = D[80];
            n10 += D[81];
            int n11 = D[83];
            n11 += D[84];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 -= D[82])) & -1L >>> (n11 -= D[85]);
            long l20 = l9;
            int n12 = D[86];
            n12 ^= D[87];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= D[88]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = D[89];
            n14 += D[90];
            int n15 = D[92];
            n15 += D[93];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= D[91])) & -1L >>> (n15 ^= D[94]);
            int n16 = D[95];
            n16 += D[96];
            long l22 = l10;
            int n17 = D[98];
            n17 ^= D[99];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += D[97]) ^ l22) & -1L << (n17 ^= D[100]);
            int n18 = D[101];
            n18 -= D[102];
            n18 ^= D[103];
            int n19 = D[104];
            n19 ^= D[105];
            long l23 = l12;
            int n20 = D[107];
            n20 ^= D[108];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= D[106]))) ^ l23) & -1L >>> (n20 -= D[109]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = D[110];
            n21 ^= D[111];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= D[112]);
            while (true) {
                int n22 = D[113];
                n22 ^= D[114];
                if ((int)(l14 >>> (n22 ^= D[115])) >= (int)l12) break;
                int n23 = D[116];
                n23 += D[117];
                int n24 = D[119];
                n24 += D[120];
                cArray2[(int)(l14 >>> (n23 ^= FullbrightModule.D[118]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= D[121]))];
                l14 += 0x100000000L;
            }
            int n25 = D[122];
            n25 -= D[123];
            int n26 = (int)(l15 >>> (n25 += D[124]));
            l15 += 0x100000000L;
            FullbrightModule.b[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = D[125];
            n27 -= D[126];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += D[127]);
        }
        INSTANCE = new FullbrightModule();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[D[128]];
        String string = (String)object[D[129]];
        object = object[D[130]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[131]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[132]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[134] ^ D[135]];
                byArray[FullbrightModule.D[136] ^ FullbrightModule.D[137]] = D[138] ^ D[139];
                byArray[FullbrightModule.D[140] ^ FullbrightModule.D[141]] = D[142] ^ D[143];
                byArray[FullbrightModule.D[144] ^ FullbrightModule.D[145]] = D[146] ^ D[147];
                byArray[FullbrightModule.D[148] ^ FullbrightModule.D[149]] = D[150] ^ D[151];
                byArray[FullbrightModule.D[152] ^ FullbrightModule.D[153]] = D[154] ^ D[155];
                byArray[FullbrightModule.D[156] ^ FullbrightModule.D[157]] = D[158] ^ D[159];
                byArray[FullbrightModule.D[160] ^ FullbrightModule.D[161]] = D[162] ^ D[163];
                byArray[FullbrightModule.D[164] ^ FullbrightModule.D[165]] = D[166] ^ D[167];
                byArray[FullbrightModule.D[168] ^ FullbrightModule.D[169]] = D[170] ^ D[171];
                byArray[FullbrightModule.D[172] ^ FullbrightModule.D[173]] = D[174] ^ D[175];
                byArray[FullbrightModule.D[176] ^ FullbrightModule.D[177]] = D[178] ^ D[179];
                byArray[FullbrightModule.D[180] ^ FullbrightModule.D[181]] = D[182] ^ D[183];
                byArray[FullbrightModule.D[184] ^ FullbrightModule.D[185]] = D[186] ^ D[187];
                byArray[FullbrightModule.D[188] ^ FullbrightModule.D[189]] = D[190] ^ D[191];
                byArray[FullbrightModule.D[192] ^ FullbrightModule.D[193]] = D[194] ^ D[195];
                byArray[FullbrightModule.D[196] ^ FullbrightModule.D[197]] = D[198] ^ D[199];
                objectArray2[FullbrightModule.D[133]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[200]];
            if (c == null) {
                byte[] byArray2 = new byte[D[201] ^ D[202]];
                byArray2[FullbrightModule.D[203] ^ FullbrightModule.D[204]] = D[205] ^ D[206];
                byArray2[FullbrightModule.D[207] ^ FullbrightModule.D[208]] = D[209] ^ D[210];
                byArray2[FullbrightModule.D[211] ^ FullbrightModule.D[212]] = D[213] ^ D[214];
                byArray2[FullbrightModule.D[215] ^ FullbrightModule.D[216]] = D[217] ^ D[218];
                byArray2[FullbrightModule.D[219] ^ FullbrightModule.D[220]] = D[221] ^ D[222];
                byArray2[FullbrightModule.D[223] ^ FullbrightModule.D[224]] = D[225] ^ D[226];
                byArray2[FullbrightModule.D[227] ^ FullbrightModule.D[228]] = D[229] ^ D[230];
                byArray2[FullbrightModule.D[231] ^ FullbrightModule.D[232]] = D[233] ^ D[234];
                byArray2[FullbrightModule.D[235] ^ FullbrightModule.D[236]] = D[237] ^ D[238];
                byArray2[FullbrightModule.D[239] ^ FullbrightModule.D[240]] = D[241] ^ D[242];
                byArray2[FullbrightModule.D[243] ^ FullbrightModule.D[244]] = D[245] ^ D[246];
                byArray2[FullbrightModule.D[247] ^ FullbrightModule.D[248]] = D[249] ^ D[250];
                byArray2[FullbrightModule.D[251] ^ FullbrightModule.D[252]] = D[253] ^ D[254];
                byArray2[FullbrightModule.D[255] ^ FullbrightModule.D[256]] = D[257] ^ D[258];
                byArray2[FullbrightModule.D[259] ^ FullbrightModule.D[260]] = D[261] ^ D[262];
                byArray2[FullbrightModule.D[263] ^ FullbrightModule.D[264]] = D[265] ^ D[266];
                byArray2[FullbrightModule.D[267] ^ FullbrightModule.D[268]] = D[269] ^ D[270];
                byArray2[FullbrightModule.D[271] ^ FullbrightModule.D[272]] = D[273] ^ D[274];
                byArray2[FullbrightModule.D[275] ^ FullbrightModule.D[276]] = D[277] ^ D[278];
                byArray2[FullbrightModule.D[279] ^ FullbrightModule.D[280]] = D[281] ^ D[282];
                byArray2[FullbrightModule.D[283] ^ FullbrightModule.D[284]] = D[285] ^ D[286];
                byArray2[FullbrightModule.D[287] ^ FullbrightModule.D[288]] = D[289] ^ D[290];
                byArray2[FullbrightModule.D[291] ^ FullbrightModule.D[292]] = D[293] ^ D[294];
                byArray2[FullbrightModule.D[295] ^ FullbrightModule.D[296]] = D[297] ^ D[298];
                byArray2[FullbrightModule.D[299] ^ FullbrightModule.D[300]] = D[301] ^ D[302];
                byArray2[FullbrightModule.D[303] ^ FullbrightModule.D[304]] = D[305] ^ D[306];
                byArray2[FullbrightModule.D[307] ^ FullbrightModule.D[308]] = D[309] ^ D[310];
                byArray2[FullbrightModule.D[311] ^ FullbrightModule.D[312]] = D[313] ^ D[314];
                byArray2[FullbrightModule.D[315] ^ FullbrightModule.D[316]] = D[317] ^ D[318];
                byArray2[FullbrightModule.D[319] ^ FullbrightModule.D[320]] = D[321] ^ D[322];
                byArray2[FullbrightModule.D[323] ^ FullbrightModule.D[324]] = D[325] ^ D[326];
                byArray2[FullbrightModule.D[327] ^ FullbrightModule.D[328]] = D[329] ^ D[330];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[331], byArray3, D[332], byArray.length);
                System.arraycopy(byArray2, D[333], byArray3, byArray.length, byArray2.length);
                Object object4 = FullbrightModule.A()[D[334]];
                if (object4 == null) {
                    char[] cArray = "\u3a79\u34e3\u34be\u3a6d\u3a77\u3513\u34da\u34cc\u349d\u34d1\u3a71\u34a0\u34c4\u34d6\u34c6\u3a71\u34e4\u3514".toCharArray();
                    for (int i2 = D[335]; i2 < D[336]; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= D[337];
                        n3 += D[338];
                        n3 ^= D[339];
                        n3 += D[340];
                        n3 -= D[341];
                        n3 ^= D[342];
                        n3 -= D[343];
                        n3 -= D[344];
                        n3 ^= D[345];
                        n3 += D[346];
                        n3 -= D[347];
                        n3 += D[348];
                        n3 -= D[349];
                        cArray[i2] = (char)(n3 -= D[350]);
                    }
                    object4 = FullbrightModule.A()[FullbrightModule.D[351]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[D[352]];
                byArray4[FullbrightModule.D[353]] = D[354];
                byArray4[FullbrightModule.D[355]] = D[356];
                byArray4[FullbrightModule.D[357]] = D[358];
                byArray4[FullbrightModule.D[359]] = D[360];
                byArray4[FullbrightModule.D[361]] = D[362];
                byArray4[FullbrightModule.D[363]] = D[364];
                byArray4[FullbrightModule.D[365]] = D[366];
                byArray4[FullbrightModule.D[367]] = D[368];
                byArray4[FullbrightModule.D[369]] = D[370];
                byArray4[FullbrightModule.D[371]] = D[372];
                byArray4[FullbrightModule.D[373]] = D[374];
                byArray4[FullbrightModule.D[375]] = D[376];
                byArray4[FullbrightModule.D[377]] = D[378];
                byArray4[FullbrightModule.D[379]] = D[380];
                byArray4[FullbrightModule.D[381]] = D[382];
                byArray4[FullbrightModule.D[383]] = D[384];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, D[385], D[386]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = FullbrightModule.A()[D[387]];
                if (object5 == null) {
                    char[] cArray = "\u7766\u6b32\u6b30".toCharArray();
                    for (int i3 = D[388]; i3 < D[389]; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= D[390];
                        n4 += D[391];
                        n4 -= D[392];
                        n4 += D[393];
                        n4 -= D[394];
                        n4 -= D[395];
                        n4 -= D[396];
                        n4 ^= D[397];
                        n4 += D[398];
                        n4 ^= D[399];
                        n4 ^= 0x9D78;
                        n4 ^= 0xD2DB;
                        n4 -= 18877;
                        cArray[i3] = (char)(n4 -= 11262);
                    }
                    object5 = FullbrightModule.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = FullbrightModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u852b\u851f\u8515\u8521\u8525\u8526\u8525\u8521\u8514\u851d\u8525\u8515\u852f\u8514\u850b\u8508\u8508\u8503\u85e2\u8509".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 36560;
                    n5 += 7136;
                    n5 -= 36161;
                    n5 += 37826;
                    n5 ^= 0x6A73;
                    n5 -= 4547;
                    n5 ^= 0xE3F4;
                    n5 += 62472;
                    n5 += 61613;
                    n5 -= 40174;
                    cArray[i4] = (char)(n5 ^= 0xCAFE);
                }
                object6 = FullbrightModule.A()[3] = new String(cArray);
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
        D = new int[0xABE0 ^ 0xAA70];
        FullbrightModule.D[0xD868 ^ 0xD8F0] = 0x4911 ^ 0xD8F0;
        FullbrightModule.D[0x3188 ^ 0x31F8] = 0xFFFFCE7D ^ 0x31F8;
        FullbrightModule.D[0xF389 ^ 0xF283] = 0xF9B3 ^ 0xF283;
        FullbrightModule.D[0xCDDD ^ 0xCDA7] = 0xCD48 ^ 0xCDA7;
        FullbrightModule.D[0x5C8D ^ 0x5C4F] = 0xFFFF64B0 ^ 0x5C4F;
        FullbrightModule.D[0xE546 ^ 0xE553] = 0xE551 ^ 0xE553;
        FullbrightModule.D[0xD798 ^ 0xD6C7] = 0xD6C6 ^ 0xD6C7;
        FullbrightModule.D[0x8D7C ^ 0x8DF6] = 0xFFFF49C6 ^ 0x8DF6;
        FullbrightModule.D[0x109A0 ^ 0x109C5] = 0x109A9 ^ 0x109C5;
        FullbrightModule.D[0x659C ^ 0x65D4] = 0xFFFF9A5C ^ 0x65D4;
        FullbrightModule.D[0x13A1 ^ 0x12C8] = 0x12CD ^ 0x12C8;
        FullbrightModule.D[0x336B ^ 0x33DE] = 0x6378 ^ 0x33DE;
        FullbrightModule.D[0x2B63 ^ 0x2B4D] = 0xFFFFD483 ^ 0x2B4D;
        FullbrightModule.D[0x4B80 ^ 0x4A88] = 0x41B8 ^ 0x4A88;
        FullbrightModule.D[0xAEB9 ^ 0xAE32] = 0x9599 ^ 0xAE32;
        FullbrightModule.D[0xCB4D ^ 0xCBE5] = 0xA874 ^ 0xCBE5;
        FullbrightModule.D[0x5950 ^ 0x5997] = 0x2605 ^ 0x5997;
        FullbrightModule.D[0xC93A ^ 0xC9F7] = 0xFFFF9F48 ^ 0xC9F7;
        FullbrightModule.D[0x2781 ^ 0x273C] = 0xCC56 ^ 0x273C;
        FullbrightModule.D[0x7ECE ^ 0x7EE8] = 0xFFFF814F ^ 0x7EE8;
        FullbrightModule.D[0xCF98 ^ 0xCFC6] = 0xCF8F ^ 0xCFC6;
        FullbrightModule.D[0x4E11 ^ 0x4E68] = 0x4E64 ^ 0x4E68;
        FullbrightModule.D[0x3C8A ^ 0x3CDE] = 0xFFFFC314 ^ 0x3CDE;
        FullbrightModule.D[0x87AD ^ 0x8756] = 0x9810 ^ 0x8756;
        FullbrightModule.D[0xC70A ^ 0xC7E4] = 0x3BDE ^ 0xC7E4;
        FullbrightModule.D[0xD884 ^ 0xD8A6] = 0xFFFF270A ^ 0xD8A6;
        FullbrightModule.D[0x801D ^ 0x8071] = 0xFFFF7FAA ^ 0x8071;
        FullbrightModule.D[0x1FCB ^ 0x1F3D] = 0x19BB ^ 0x1F3D;
        FullbrightModule.D[0x356C ^ 0x3580] = 0xC9BA ^ 0x3580;
        FullbrightModule.D[0x4E6 ^ 0x4AB] = 0x4F0 ^ 0x4AB;
        FullbrightModule.D[0x3979 ^ 0x39C6] = 0xD2AC ^ 0x39C6;
        FullbrightModule.D[0x24AF ^ 0x25EE] = 0x9CAA ^ 0x25EE;
        FullbrightModule.D[0xACE8 ^ 0xADF6] = 0xB4F4 ^ 0xADF6;
        FullbrightModule.D[0x870A ^ 0x87C9] = 0x408C ^ 0x87C9;
        FullbrightModule.D[0x1D5D ^ 0x1C45] = 0x7A5A ^ 0x1C45;
        FullbrightModule.D[0x817E ^ 0x8141] = 0xEBB9 ^ 0x8141;
        FullbrightModule.D[0x87C ^ 0x88C] = 0x3521 ^ 0x88C;
        FullbrightModule.D[0x713 ^ 0x75F] = 0xFFFFF8B6 ^ 0x75F;
        FullbrightModule.D[0x6209 ^ 0x6370] = 0x6376 ^ 0x6370;
        FullbrightModule.D[0x8ACF ^ 0x8ABD] = 0xFFFF751A ^ 0x8ABD;
        FullbrightModule.D[0xC79A ^ 0xC724] = 0x2C02 ^ 0xC724;
        FullbrightModule.D[0x3161 ^ 0x307C] = 0x292B ^ 0x307C;
        FullbrightModule.D[0xF33A ^ 0xF202] = 0x2370 ^ 0xF202;
        FullbrightModule.D[0xCB8B ^ 0xCAC5] = 0xCAC4 ^ 0xCAC5;
        FullbrightModule.D[0xACA3 ^ 0xAC25] = 0x1ACBE ^ 0xAC25;
        FullbrightModule.D[0x4400 ^ 0x4400] = 0x442B ^ 0x4400;
        FullbrightModule.D[0x1A6A ^ 0x1A0D] = 0x1A21 ^ 0x1A0D;
        FullbrightModule.D[0xF899 ^ 0xF8AE] = 0xF8AC ^ 0xF8AE;
        FullbrightModule.D[0x2FB1 ^ 0x2E92] = 0xC924 ^ 0x2E92;
        FullbrightModule.D[0x10ACB ^ 0x10B4F] = 0x10B4F ^ 0x10B4F;
        FullbrightModule.D[0xEC2D ^ 0xED4D] = 0xED5D ^ 0xED4D;
        FullbrightModule.D[0x87C2 ^ 0x877E] = 0x6C1B ^ 0x877E;
        FullbrightModule.D[0x65C8 ^ 0x65C5] = 0x65A3 ^ 0x65C5;
        FullbrightModule.D[0x72FB ^ 0x727C] = 0x172F7 ^ 0x727C;
        FullbrightModule.D[0x7873 ^ 0x7962] = 0x9582 ^ 0x7962;
        FullbrightModule.D[0xE7A9 ^ 0xE7BF] = 0xE785 ^ 0xE7BF;
        FullbrightModule.D[0x6DAE ^ 0x6D66] = 0x6D66 ^ 0x6D66;
        FullbrightModule.D[0x523A ^ 0x5376] = 0x5376 ^ 0x5376;
        FullbrightModule.D[0x7683 ^ 0x762A] = 0x15BC ^ 0x762A;
        FullbrightModule.D[0xC0A6 ^ 0xC1B0] = 0x7F5A ^ 0xC1B0;
        FullbrightModule.D[0x7C9C ^ 0x7C6F] = 0x7AF5 ^ 0x7C6F;
        FullbrightModule.D[0xB070 ^ 0xB041] = 0xB070 ^ 0xB041;
        FullbrightModule.D[0x6C87 ^ 0x6C5E] = 0xFFFF3F7C ^ 0x6C5E;
        FullbrightModule.D[0x3201 ^ 0x336E] = 0x3364 ^ 0x336E;
        FullbrightModule.D[0x97E3 ^ 0x96DD] = 0xFE21 ^ 0x96DD;
        FullbrightModule.D[0xE4BC ^ 0xE425] = 0x75CD ^ 0xE425;
        FullbrightModule.D[0xE7D0 ^ 0xE752] = 0xE752 ^ 0xE752;
        FullbrightModule.D[0x3071 ^ 0x30BF] = 0x99D4 ^ 0x30BF;
        FullbrightModule.D[0x6B77 ^ 0x6BE8] = 0x692A ^ 0x6BE8;
        FullbrightModule.D[0xA92E ^ 0xA9F5] = 0x437C ^ 0xA9F5;
        FullbrightModule.D[0x10471 ^ 0x104BE] = 0x17677 ^ 0x104BE;
        FullbrightModule.D[0x93C5 ^ 0x92F5] = 0xC9F1 ^ 0x92F5;
        FullbrightModule.D[0x146C ^ 0x140D] = 0x143D ^ 0x140D;
        FullbrightModule.D[0xEA98 ^ 0xEA8B] = 0xEAEE ^ 0xEA8B;
        FullbrightModule.D[0xBF68 ^ 0xBEE1] = 0xD309 ^ 0xBEE1;
        FullbrightModule.D[0x14C2 ^ 0x15E2] = 0x9FCE ^ 0x15E2;
        FullbrightModule.D[0x8853 ^ 0x8897] = 0xF703 ^ 0x8897;
        FullbrightModule.D[0xF6BF ^ 0xF6FD] = 0x90A6 ^ 0xF6FD;
        FullbrightModule.D[0x3C79 ^ 0x3C98] = 0x1818 ^ 0x3C98;
        FullbrightModule.D[0x6E0D ^ 0x6F5B] = 0xD46F ^ 0x6F5B;
        FullbrightModule.D[0xFE7C ^ 0xFE5F] = 0xFFFF01BB ^ 0xFE5F;
        FullbrightModule.D[0x9A0E ^ 0x9B74] = 0x9B6D ^ 0x9B74;
        FullbrightModule.D[0x460A ^ 0x4716] = 0x5E14 ^ 0x4716;
        FullbrightModule.D[0x94E9 ^ 0x9569] = 0xFFFF6A8C ^ 0x9569;
        FullbrightModule.D[0xB53E ^ 0xB527] = 0xB506 ^ 0xB527;
        FullbrightModule.D[0x136 ^ 0x1B8] = 0x3941 ^ 0x1B8;
        FullbrightModule.D[0xCF03 ^ 0xCE22] = 0xFFFFBBC3 ^ 0xCE22;
        FullbrightModule.D[0x2478 ^ 0x242A] = 0xFFFFDB9B ^ 0x242A;
        FullbrightModule.D[0x10D02 ^ 0x10D43] = 0x12698 ^ 0x10D43;
        FullbrightModule.D[0xEDAC ^ 0xEDBB] = 0xED87 ^ 0xEDBB;
        FullbrightModule.D[0xECD6 ^ 0xEDC9] = 0x67FE ^ 0xEDC9;
        FullbrightModule.D[0x9A23 ^ 0x9A83] = 0x8492 ^ 0x9A83;
        FullbrightModule.D[0x1F6E ^ 0x1F20] = 0x1F22 ^ 0x1F20;
        FullbrightModule.D[0xF616 ^ 0xF6D7] = 0x3192 ^ 0xF6D7;
        FullbrightModule.D[0x1052 ^ 0x108D] = 0x3414 ^ 0x108D;
        FullbrightModule.D[0x262A ^ 0x2637] = 0x260E ^ 0x2637;
        FullbrightModule.D[0xEC8F ^ 0xEDF2] = 0xEDFB ^ 0xEDF2;
        FullbrightModule.D[0x54EC ^ 0x559A] = 0xFFFFAA69 ^ 0x559A;
        FullbrightModule.D[0x1E0F ^ 0x1E39] = 0x1E39 ^ 0x1E39;
        FullbrightModule.D[0xD8A ^ 0xCFD] = 0xCF3 ^ 0xCFD;
        FullbrightModule.D[0x8EE7 ^ 0x8EE0] = 0xFFFF710F ^ 0x8EE0;
        FullbrightModule.D[0xE18F ^ 0xE187] = 0xFFFF1E7C ^ 0xE187;
        FullbrightModule.D[0xC3D9 ^ 0xC2CA] = 0x7C26 ^ 0xC2CA;
        FullbrightModule.D[0x49C6 ^ 0x49B7] = 0x49D2 ^ 0x49B7;
        FullbrightModule.D[0x4431 ^ 0x44AC] = 0x466E ^ 0x44AC;
        FullbrightModule.D[0xCCC7 ^ 0xCD8C] = 0xCD8C ^ 0xCD8C;
        FullbrightModule.D[0x94B9 ^ 0x9595] = 0xE55B ^ 0x9595;
        FullbrightModule.D[0xE972 ^ 0xE9B8] = 0xE50E ^ 0xE9B8;
        FullbrightModule.D[0xC4F ^ 0xD22] = 0xD2E ^ 0xD22;
        FullbrightModule.D[0xB67C ^ 0xB651] = 0xB6FC ^ 0xB651;
        FullbrightModule.D[0xAEC ^ 0xA94] = 0xA83 ^ 0xA94;
        FullbrightModule.D[0xC196 ^ 0xC0C4] = 0x2883 ^ 0xC0C4;
        FullbrightModule.D[0x68F8 ^ 0x69D6] = 0x1918 ^ 0x69D6;
        FullbrightModule.D[0x764A ^ 0x76A9] = 0x17F6D ^ 0x76A9;
        FullbrightModule.D[0x2099 ^ 0x2192] = 0x4C3F ^ 0x2192;
        FullbrightModule.D[0x1BD9 ^ 0x1BF5] = 0x1B8B ^ 0x1BF5;
        FullbrightModule.D[0xB806 ^ 0xB94B] = 0xB94B ^ 0xB94B;
        FullbrightModule.D[0xD57F ^ 0xD55E] = 0xFFFF2ACF ^ 0xD55E;
        FullbrightModule.D[0x9EFD ^ 0x9E6B] = 0xAF32 ^ 0x9E6B;
        FullbrightModule.D[0xB7D9 ^ 0xB79F] = 0xB79F ^ 0xB79F;
        FullbrightModule.D[0x947F ^ 0x9426] = 0xFFFF6BDF ^ 0x9426;
        FullbrightModule.D[0x6B38 ^ 0x6A10] = 0xB6B9 ^ 0x6A10;
        FullbrightModule.D[0x87CA ^ 0x87EF] = 0xFFFF7863 ^ 0x87EF;
        FullbrightModule.D[0x65FD ^ 0x64CA] = 0xB5AE ^ 0x64CA;
        FullbrightModule.D[0x6314 ^ 0x6211] = 0x2181 ^ 0x6211;
        FullbrightModule.D[0xE9D9 ^ 0xE93B] = 0xCDA7 ^ 0xE93B;
        FullbrightModule.D[0x10D26 ^ 0x10C19] = 0x1B562 ^ 0x10C19;
        FullbrightModule.D[0xC286 ^ 0xC24A] = 0x6B21 ^ 0xC24A;
        FullbrightModule.D[0x2AAA ^ 0x2AF0] = 0xFFFFD52E ^ 0x2AF0;
        FullbrightModule.D[0xE8FC ^ 0xE848] = 0xB8E4 ^ 0xE848;
        FullbrightModule.D[0x14EE ^ 0x1490] = 0x14D6 ^ 0x1490;
        FullbrightModule.D[0x6DD8 ^ 0x6CF5] = 0xFFFFE397 ^ 0x6CF5;
        FullbrightModule.D[0x3649 ^ 0x367C] = 0x367D ^ 0x367C;
        FullbrightModule.D[0x330D ^ 0x3352] = 0xFFFFCCF2 ^ 0x3352;
        FullbrightModule.D[0xDDDD ^ 0xDD23] = 0xC278 ^ 0xDD23;
        FullbrightModule.D[0x36DC ^ 0x37F3] = 0x6CF3 ^ 0x37F3;
        FullbrightModule.D[0xFD4A ^ 0xFC0F] = 0xFFFF715A ^ 0xFC0F;
        FullbrightModule.D[0xD860 ^ 0xD9EB] = 0xF001 ^ 0xD9EB;
        FullbrightModule.D[0xAE7 ^ 0xBEB] = 0x6656 ^ 0xBEB;
        FullbrightModule.D[0x16B ^ 0x4E] = 0xE7E7 ^ 0x4E;
        FullbrightModule.D[0xB407 ^ 0xB4A9] = 0xFFFFDC97 ^ 0xB4A9;
        FullbrightModule.D[0xE630 ^ 0xE767] = 0xE9D1 ^ 0xE767;
        FullbrightModule.D[0xEE94 ^ 0xEEA7] = 0xEEA4 ^ 0xEEA7;
        FullbrightModule.D[0x7E55 ^ 0x7F32] = 0x7F3A ^ 0x7F32;
        FullbrightModule.D[0xBB90 ^ 0xBB67] = 0xBA15 ^ 0xBB67;
        FullbrightModule.D[0x5447 ^ 0x5429] = 0xFFFFAB85 ^ 0x5429;
        FullbrightModule.D[0xA22E ^ 0xA314] = 0x7266 ^ 0xA314;
        FullbrightModule.D[0x7CA8 ^ 0x7D20] = 0x5D63 ^ 0x7D20;
        FullbrightModule.D[0xF856 ^ 0xF842] = 0xFFFF0793 ^ 0xF842;
        FullbrightModule.D[0x34D9 ^ 0x359D] = 0x473F ^ 0x359D;
        FullbrightModule.D[0xF96 ^ 0xF0A] = 0xDCD ^ 0xF0A;
        FullbrightModule.D[0xCDEF ^ 0xCDEA] = 0xFFFF3263 ^ 0xCDEA;
        FullbrightModule.D[0xB10E ^ 0xB13E] = 0xB127 ^ 0xB13E;
        FullbrightModule.D[0x3A0B ^ 0x3AEC] = 0xBF24 ^ 0x3AEC;
        FullbrightModule.D[0x67C9 ^ 0x66EE] = 0xBA53 ^ 0x66EE;
        FullbrightModule.D[0xEC5 ^ 0xEB9] = 0xFFFFF11A ^ 0xEB9;
        FullbrightModule.D[0xA1FA ^ 0xA1A2] = 0xFFFF5E04 ^ 0xA1A2;
        FullbrightModule.D[0xBAAA ^ 0xBBCB] = 0xBBC6 ^ 0xBBCB;
        FullbrightModule.D[0xF44A ^ 0xF40E] = 0xEE11 ^ 0xF40E;
        FullbrightModule.D[0xA16 ^ 0xA6D] = 0xA1F ^ 0xA6D;
        FullbrightModule.D[0x1064D ^ 0x10611] = 0x1068A ^ 0x10611;
        FullbrightModule.D[0xF0D8 ^ 0xF0BE] = 0xF08E ^ 0xF0BE;
        FullbrightModule.D[0xC73A ^ 0xC666] = 0x2BBA ^ 0xC666;
        FullbrightModule.D[0x5DB4 ^ 0x5D06] = 0xC558 ^ 0x5D06;
        FullbrightModule.D[0x13B1 ^ 0x131E] = 0x84D3 ^ 0x131E;
        FullbrightModule.D[0x3ACB ^ 0x3BA7] = 0x3BEC ^ 0x3BA7;
        FullbrightModule.D[0x5C71 ^ 0x5CE5] = 0x6DAB ^ 0x5CE5;
        FullbrightModule.D[0x5DAA ^ 0x5DDE] = 0x5DC1 ^ 0x5DDE;
        FullbrightModule.D[0x7DC7 ^ 0x7CED] = 0xA044 ^ 0x7CED;
        FullbrightModule.D[0x7A78 ^ 0x7A33] = 0x7A17 ^ 0x7A33;
        FullbrightModule.D[0xD619 ^ 0xD636] = 0xFFFF29BF ^ 0xD636;
        FullbrightModule.D[0x5449 ^ 0x5546] = 0xB9AA ^ 0x5546;
        FullbrightModule.D[0x10F43 ^ 0x10E10] = 0x15EFF ^ 0x10E10;
        FullbrightModule.D[0x7BAF ^ 0x7AE8] = 0x288C ^ 0x7AE8;
        FullbrightModule.D[0x89E9 ^ 0x8865] = 0xA675 ^ 0x8865;
        FullbrightModule.D[0xF9DB ^ 0xF9C3] = 0xFFFF0629 ^ 0xF9C3;
        FullbrightModule.D[0xE16E ^ 0xE1BB] = 0xE316 ^ 0xE1BB;
        FullbrightModule.D[0x3BB1 ^ 0x3B35] = 0x3B34 ^ 0x3B35;
        FullbrightModule.D[0xB3A8 ^ 0xB2D0] = 0xB2B8 ^ 0xB2D0;
        FullbrightModule.D[0xFD5C ^ 0xFDB4] = 0x787C ^ 0xFDB4;
        FullbrightModule.D[0xEBF7 ^ 0xEAE3] = 0x5409 ^ 0xEAE3;
        FullbrightModule.D[0x109ED ^ 0x10860] = 0x12052 ^ 0x10860;
        FullbrightModule.D[0x4D1F ^ 0x4D8C] = 0x147BF ^ 0x4D8C;
        FullbrightModule.D[0x104A7 ^ 0x105D4] = 0x105D5 ^ 0x105D4;
        FullbrightModule.D[0x67E5 ^ 0x67A5] = 0xC36F ^ 0x67A5;
        FullbrightModule.D[0x2F7D ^ 0x2FA5] = 0x8306 ^ 0x2FA5;
        FullbrightModule.D[0x10B90 ^ 0x10B21] = 0x19319 ^ 0x10B21;
        FullbrightModule.D[0x82DD ^ 0x83AF] = 0x8397 ^ 0x83AF;
        FullbrightModule.D[0x5596 ^ 0x55F6] = 0x55A6 ^ 0x55F6;
        FullbrightModule.D[0x1F44 ^ 0x1E38] = 0x1E29 ^ 0x1E38;
        FullbrightModule.D[0x4D15 ^ 0x4DB9] = 0xDA77 ^ 0x4DB9;
        FullbrightModule.D[0x10ED9 ^ 0x10E7D] = 0x1F440 ^ 0x10E7D;
        FullbrightModule.D[0x2EC0 ^ 0x2F86] = 0x5D24 ^ 0x2F86;
        FullbrightModule.D[0x243C ^ 0x2515] = 0xF9BE ^ 0x2515;
        FullbrightModule.D[0x329C ^ 0x325C] = 0xF518 ^ 0x325C;
        FullbrightModule.D[0xB4D ^ 0xB53] = 0xB16 ^ 0xB53;
        FullbrightModule.D[0x100B9 ^ 0x100BB] = 0xFFFEFF6F ^ 0x100BB;
        FullbrightModule.D[0xD61B ^ 0xD6C5] = 0x3C41 ^ 0xD6C5;
        FullbrightModule.D[0x7D36 ^ 0x7DE0] = 0x7F73 ^ 0x7DE0;
        FullbrightModule.D[0xC45 ^ 0xDC6] = 0xDC4 ^ 0xDC6;
        FullbrightModule.D[0xB508 ^ 0xB459] = 0xCF3A ^ 0xB459;
        FullbrightModule.D[0xF939 ^ 0xF98A] = 0x61B2 ^ 0xF98A;
        FullbrightModule.D[0xCA12 ^ 0xCB71] = 0xCB73 ^ 0xCB71;
        FullbrightModule.D[0x5FD4 ^ 0x5EE1] = 0xFFFF352C ^ 0x5EE1;
        FullbrightModule.D[0x83EF ^ 0x8281] = 0xFFFF7D0D ^ 0x8281;
        FullbrightModule.D[0x1C68 ^ 0x1CE0] = 0x2740 ^ 0x1CE0;
        FullbrightModule.D[0x764C ^ 0x76EB] = 0x8CDA ^ 0x76EB;
        FullbrightModule.D[0x74F7 ^ 0x7456] = 0x6A47 ^ 0x7456;
        FullbrightModule.D[0x1643 ^ 0x172B] = 0x171C ^ 0x172B;
        FullbrightModule.D[0x10A07 ^ 0x10B1E] = 0x16D0A ^ 0x10B1E;
        FullbrightModule.D[0xB50A ^ 0xB5DD] = 0x196F ^ 0xB5DD;
        FullbrightModule.D[0x751D ^ 0x740A] = 0x1216 ^ 0x740A;
        FullbrightModule.D[0x3761 ^ 0x3732] = 0xFFFFC8EC ^ 0x3732;
        FullbrightModule.D[0xA480 ^ 0xA48B] = 0xFFFF5B3B ^ 0xA48B;
        FullbrightModule.D[0x7157 ^ 0x7120] = 0x7135 ^ 0x7120;
        FullbrightModule.D[0x102D2 ^ 0x10358] = 0x1B412 ^ 0x10358;
        FullbrightModule.D[0x2E80 ^ 0x2F83] = 0x6C3A ^ 0x2F83;
        FullbrightModule.D[0x7D4D ^ 0x7DE7] = 0x1E39 ^ 0x7DE7;
        FullbrightModule.D[0xB96B ^ 0xB9B7] = 0x5333 ^ 0xB9B7;
        FullbrightModule.D[0xF36A ^ 0xF2EF] = 0xF2EC ^ 0xF2EF;
        FullbrightModule.D[0x9757 ^ 0x976A] = 0xA4CE ^ 0x976A;
        FullbrightModule.D[0x7CCF ^ 0x7CDE] = 0xFFFF831E ^ 0x7CDE;
        FullbrightModule.D[0x364C ^ 0x36D7] = 0xA73F ^ 0x36D7;
        FullbrightModule.D[0x542B ^ 0x550F] = 0xB2B3 ^ 0x550F;
        FullbrightModule.D[0xC52D ^ 0xC5CD] = 0xE151 ^ 0xC5CD;
        FullbrightModule.D[0xA298 ^ 0xA2A2] = 0xA2CE ^ 0xA2A2;
        FullbrightModule.D[0xA919 ^ 0xA953] = 0xA940 ^ 0xA953;
        FullbrightModule.D[0xD19E ^ 0xD19A] = 0xFFFF2E37 ^ 0xD19A;
        FullbrightModule.D[0x4EDA ^ 0x4E1F] = 0x318D ^ 0x4E1F;
        FullbrightModule.D[0xD5C9 ^ 0xD4AB] = 0xD48B ^ 0xD4AB;
        FullbrightModule.D[0x8E49 ^ 0x8E98] = 0xFFFF03EA ^ 0x8E98;
        FullbrightModule.D[0x66BA ^ 0x66A5] = 0x6695 ^ 0x66A5;
        FullbrightModule.D[0x2D37 ^ 0x2C11] = 0xCBAD ^ 0x2C11;
        FullbrightModule.D[0x8B36 ^ 0x8A7C] = 0xD817 ^ 0x8A7C;
        FullbrightModule.D[0xC841 ^ 0xC879] = 0xC879 ^ 0xC879;
        FullbrightModule.D[0x749 ^ 0x62C] = 0x623 ^ 0x62C;
        FullbrightModule.D[0x8BB9 ^ 0x8AE9] = 0x8AFB ^ 0x8AE9;
        FullbrightModule.D[0x86E2 ^ 0x864F] = 0x1182 ^ 0x864F;
        FullbrightModule.D[0xF037 ^ 0xF062] = 0xFFFF0FEA ^ 0xF062;
        FullbrightModule.D[0x5C59 ^ 0x5CFC] = 0xA6CD ^ 0x5CFC;
        FullbrightModule.D[0xDD81 ^ 0xDDE3] = 0xFFFF2217 ^ 0xDDE3;
        FullbrightModule.D[0x84C9 ^ 0x84D2] = 0x84C9 ^ 0x84D2;
        FullbrightModule.D[0xCDFC ^ 0xCD8A] = 0xFFFF3208 ^ 0xCD8A;
        FullbrightModule.D[0x7587 ^ 0x7595] = 0x75A3 ^ 0x7595;
        FullbrightModule.D[0x71B2 ^ 0x70D6] = 0x70A9 ^ 0x70D6;
        FullbrightModule.D[0xFD6 ^ 0xF48] = 0xDD0 ^ 0xF48;
        FullbrightModule.D[0xC4FB ^ 0xC5A3] = 0x974 ^ 0xC5A3;
        FullbrightModule.D[0x28E5 ^ 0x28CF] = 0xFFFFD760 ^ 0x28CF;
        FullbrightModule.D[0x4378 ^ 0x43AC] = 0x413F ^ 0x43AC;
        FullbrightModule.D[0x10447 ^ 0x10547] = 0x18558 ^ 0x10547;
        FullbrightModule.D[0x6A4A ^ 0x6AA5] = 0x5712 ^ 0x6AA5;
        FullbrightModule.D[0xAD6B ^ 0xADD3] = 0x28E6 ^ 0xADD3;
        FullbrightModule.D[0xCE7C ^ 0xCE4E] = 0xCE24 ^ 0xCE4E;
        FullbrightModule.D[0x3677 ^ 0x37F0] = 0xEBD3 ^ 0x37F0;
        FullbrightModule.D[0x3C4D ^ 0x3D19] = 0xDB8B ^ 0x3D19;
        FullbrightModule.D[0x3CE5 ^ 0x3D64] = 0x3D61 ^ 0x3D64;
        FullbrightModule.D[0x10CB0 ^ 0x10D8B] = 0x16579 ^ 0x10D8B;
        FullbrightModule.D[0xD1F4 ^ 0xD10B] = 0x511C ^ 0xD10B;
        FullbrightModule.D[0x1494 ^ 0x15A9] = 0x7D23 ^ 0x15A9;
        FullbrightModule.D[0xA6E1 ^ 0xA7E5] = 0xE457 ^ 0xA7E5;
        FullbrightModule.D[0x526F ^ 0x5234] = 0xFFFFADE2 ^ 0x5234;
        FullbrightModule.D[0x3C2A ^ 0x3CA5] = 0x45E ^ 0x3CA5;
        FullbrightModule.D[0x392B ^ 0x3912] = 0x3912 ^ 0x3912;
        FullbrightModule.D[0x5D42 ^ 0x5DD0] = 0x157CC ^ 0x5DD0;
        FullbrightModule.D[0xEF48 ^ 0xEE49] = 0x6E7B ^ 0xEE49;
        FullbrightModule.D[0x4086 ^ 0x41DC] = 0xD27 ^ 0x41DC;
        FullbrightModule.D[0xADFC ^ 0xAD15] = 0xFFFFD713 ^ 0xAD15;
        FullbrightModule.D[0x4337 ^ 0x439C] = 0x200A ^ 0x439C;
        FullbrightModule.D[0x1015D ^ 0x101B8] = 0x87E ^ 0x101B8;
        FullbrightModule.D[0x1FD5 ^ 0x1F3F] = 0x9AF7 ^ 0x1F3F;
        FullbrightModule.D[0x9BC8 ^ 0x9B3D] = 0x9DB3 ^ 0x9B3D;
        FullbrightModule.D[0xCB76 ^ 0xCBBF] = 0xC729 ^ 0xCBBF;
        FullbrightModule.D[0x35AB ^ 0x355A] = 0xFFFFF73B ^ 0x355A;
        FullbrightModule.D[0x46C4 ^ 0x46B9] = 0x4681 ^ 0x46B9;
        FullbrightModule.D[0xFC88 ^ 0xFC6E] = 0x1F5B9 ^ 0xFC6E;
        FullbrightModule.D[0x26D ^ 0x291] = 0x1DCA ^ 0x291;
        FullbrightModule.D[0x3071 ^ 0x30A3] = 0x427F ^ 0x30A3;
        FullbrightModule.D[0x116B ^ 0x1136] = 0xFFFFEEF8 ^ 0x1136;
        FullbrightModule.D[0x1A7B ^ 0x1B48] = 0x8F0B ^ 0x1B48;
        FullbrightModule.D[0xC99 ^ 0xCFA] = 0xCDC ^ 0xCFA;
        FullbrightModule.D[0xB210 ^ 0xB2C3] = 0xB047 ^ 0xB2C3;
        FullbrightModule.D[0xBE2B ^ 0xBF17] = 0xD7EB ^ 0xBF17;
        FullbrightModule.D[0x10DBB ^ 0x10CB5] = 0x16108 ^ 0x10CB5;
        FullbrightModule.D[0x3C06 ^ 0x3CFF] = 0x3DDD ^ 0x3CFF;
        FullbrightModule.D[0x9651 ^ 0x9676] = 0xFFFF699B ^ 0x9676;
        FullbrightModule.D[0x5E12 ^ 0x5F62] = 0xFFFFA086 ^ 0x5F62;
        FullbrightModule.D[0xB29D ^ 0xB3DD] = 0xABE ^ 0xB3DD;
        FullbrightModule.D[0xCFC3 ^ 0xCEE8] = 0xBE24 ^ 0xCEE8;
        FullbrightModule.D[0x96B1 ^ 0x96CE] = 0x96E0 ^ 0x96CE;
        FullbrightModule.D[0xBBBE ^ 0xBACF] = 0xBACB ^ 0xBACF;
        FullbrightModule.D[0x2876 ^ 0x283F] = 0x2856 ^ 0x283F;
        FullbrightModule.D[0x4AAD ^ 0x4BF6] = 0xCC0A ^ 0x4BF6;
        FullbrightModule.D[0xDEA ^ 0xDD4] = 0x8972 ^ 0xDD4;
        FullbrightModule.D[0xDC8B ^ 0xDC87] = 0xDC91 ^ 0xDC87;
        FullbrightModule.D[0x45C3 ^ 0x444D] = 0x3DDE ^ 0x444D;
        FullbrightModule.D[0x9058 ^ 0x9123] = 0x9128 ^ 0x9123;
        FullbrightModule.D[0x4800 ^ 0x4868] = 0x4855 ^ 0x4868;
        FullbrightModule.D[0xABA6 ^ 0xABA9] = 0xFFFF54CC ^ 0xABA9;
        FullbrightModule.D[0x5E95 ^ 0x5EBC] = 0xFFFFA13F ^ 0x5EBC;
        FullbrightModule.D[0x5FAB ^ 0x5FAD] = 0x5FA7 ^ 0x5FAD;
        FullbrightModule.D[0xB445 ^ 0xB547] = 0x3558 ^ 0xB547;
        FullbrightModule.D[0x6D10 ^ 0x6D2C] = 0x6678 ^ 0x6D2C;
        FullbrightModule.D[0x4EE4 ^ 0x4FA6] = 0xF6C5 ^ 0x4FA6;
        FullbrightModule.D[0x3E7D ^ 0x3EDF] = 0xFFFFDF54 ^ 0x3EDF;
        FullbrightModule.D[0x9E42 ^ 0x9E43] = 0xFFFF61BC ^ 0x9E43;
        FullbrightModule.D[0xD7DD ^ 0xD727] = 0xD64C ^ 0xD727;
        FullbrightModule.D[0x650E ^ 0x643F] = 0xFFFFC0C6 ^ 0x643F;
        FullbrightModule.D[0x193E ^ 0x180A] = 0x8C40 ^ 0x180A;
        FullbrightModule.D[0xE104 ^ 0xE08B] = 0x1AFF ^ 0xE08B;
        FullbrightModule.D[0x4DA8 ^ 0x4CA5] = 0x2109 ^ 0x4CA5;
        FullbrightModule.D[0x50C2 ^ 0x50C1] = 0xFFFFAF1E ^ 0x50C1;
        FullbrightModule.D[0xEA0 ^ 0xE2D] = 0x36D6 ^ 0xE2D;
        FullbrightModule.D[0x135A ^ 0x13CF] = 0x2283 ^ 0x13CF;
        FullbrightModule.D[0xFFFA ^ 0xFFF0] = 0xFFFF006E ^ 0xFFF0;
        FullbrightModule.D[0x60AF ^ 0x61E6] = 0x33F1 ^ 0x61E6;
        FullbrightModule.D[0xC093 ^ 0xC049] = 0x6CEA ^ 0xC049;
        FullbrightModule.D[0x8E34 ^ 0x8EC9] = 0xFFFF6E10 ^ 0x8EC9;
        FullbrightModule.D[0x2A1A ^ 0x2A80] = 0xBB52 ^ 0x2A80;
        FullbrightModule.D[0x10475 ^ 0x1054C] = 0x1D40D ^ 0x1054C;
        FullbrightModule.D[0xC9F3 ^ 0xC9A5] = 0xFFFF3660 ^ 0xC9A5;
        FullbrightModule.D[0x9525 ^ 0x946D] = 0xC606 ^ 0x946D;
        FullbrightModule.D[0x92A9 ^ 0x922C] = 0x922C ^ 0x922C;
        FullbrightModule.D[0x37CF ^ 0x374C] = 0x374D ^ 0x374C;
        FullbrightModule.D[0x9EB5 ^ 0x9EFA] = 0xFFFF613D ^ 0x9EFA;
        FullbrightModule.D[0xC2A0 ^ 0xC27D] = 0xFFFFD70A ^ 0xC27D;
        FullbrightModule.D[0x18CE ^ 0x194C] = 0x184C ^ 0x194C;
        FullbrightModule.D[0xF00D ^ 0xF04A] = 0xF08B ^ 0xF04A;
        FullbrightModule.D[0xC449 ^ 0xC4EF] = 0x3EC8 ^ 0xC4EF;
        FullbrightModule.D[0x926F ^ 0x923E] = 0x9260 ^ 0x923E;
        FullbrightModule.D[0xCC9D ^ 0xCD8F] = 0x2162 ^ 0xCD8F;
        FullbrightModule.D[0xEFBB ^ 0xEECE] = 0xEEC9 ^ 0xEECE;
        FullbrightModule.D[0xC1DE ^ 0xC0CB] = 0x7E30 ^ 0xC0CB;
        FullbrightModule.D[0x99B6 ^ 0x98E3] = 0x77F7 ^ 0x98E3;
        FullbrightModule.D[0x29E5 ^ 0x2911] = 0x2F97 ^ 0x2911;
        FullbrightModule.D[0x55AE ^ 0x55C3] = 0x558F ^ 0x55C3;
        FullbrightModule.D[0x579E ^ 0x57F4] = 0xFFFFA813 ^ 0x57F4;
        FullbrightModule.D[0x32FD ^ 0x32D6] = 0x32FB ^ 0x32D6;
        FullbrightModule.D[0xEF7B ^ 0xEFF2] = 0xD459 ^ 0xEFF2;
        FullbrightModule.D[0x8B87 ^ 0x8AB5] = 0xD1B1 ^ 0x8AB5;
        FullbrightModule.D[0x10C66 ^ 0x10D38] = 0x17044 ^ 0x10D38;
        FullbrightModule.D[0x7E7F ^ 0x7E0A] = 0xFFFF8189 ^ 0x7E0A;
        FullbrightModule.D[0xF1AE ^ 0xF1BE] = 0xFFFF0E1B ^ 0xF1BE;
        FullbrightModule.D[0x2571 ^ 0x2461] = 0xC88C ^ 0x2461;
        FullbrightModule.D[0x104A1 ^ 0x10459] = 0x10532 ^ 0x10459;
        FullbrightModule.D[0x7082 ^ 0x71CD] = 0x71CD ^ 0x71CD;
        FullbrightModule.D[0xC007 ^ 0xC11C] = 0xD819 ^ 0xC11C;
        FullbrightModule.D[0x103ED ^ 0x10356] = 0x1866B ^ 0x10356;
        FullbrightModule.D[0x1CD8 ^ 0x1DAC] = 0x1DE5 ^ 0x1DAC;
        FullbrightModule.D[0x335D ^ 0x3336] = 0xFFFFCC81 ^ 0x3336;
        FullbrightModule.D[0xB039 ^ 0xB10F] = 0x2545 ^ 0xB10F;
        FullbrightModule.D[0x50C4 ^ 0x5055] = 0x15A66 ^ 0x5055;
        FullbrightModule.D[0x3E9E ^ 0x3E55] = 0x9720 ^ 0x3E55;
        FullbrightModule.D[0xC0D7 ^ 0xC0E3] = 0xC0E3 ^ 0xC0E3;
        FullbrightModule.D[0xB348 ^ 0xB241] = 0xB904 ^ 0xB241;
        FullbrightModule.D[0x16D0 ^ 0x16DE] = 0x16A2 ^ 0x16DE;
        FullbrightModule.D[0x1CBB ^ 0x1D3D] = 0x3E7D ^ 0x1D3D;
        FullbrightModule.D[0xAB76 ^ 0xAB9B] = 0x57B5 ^ 0xAB9B;
        FullbrightModule.D[0x1574 ^ 0x1437] = 0x6687 ^ 0x1437;
        FullbrightModule.D[0xD74F ^ 0xD655] = 0xB04A ^ 0xD655;
        FullbrightModule.D[0x9D04 ^ 0x9DF6] = 0xA05B ^ 0x9DF6;
        FullbrightModule.D[0xDD03 ^ 0xDD40] = 0x380E ^ 0xDD40;
        FullbrightModule.D[0x1C74 ^ 0x1D73] = 0x164F ^ 0x1D73;
        FullbrightModule.D[0x4886 ^ 0x48BD] = 0x320F ^ 0x48BD;
        FullbrightModule.D[0x3D76 ^ 0x3DB0] = 0x4214 ^ 0x3DB0;
        FullbrightModule.D[0xEC0D ^ 0xECAE] = 0xF2BF ^ 0xECAE;
        FullbrightModule.D[0xFEE7 ^ 0xFE6B] = 0xC69E ^ 0xFE6B;
        FullbrightModule.D[0x4E3A ^ 0x4E49] = 0xFFFFB1AB ^ 0x4E49;
        FullbrightModule.D[0x105C0 ^ 0x10524] = 0xCF3 ^ 0x10524;
        FullbrightModule.D[0xFE30 ^ 0xFF5B] = 0xFF58 ^ 0xFF5B;
        FullbrightModule.D[0xC084 ^ 0xC0A0] = 0xFFFF3EC5 ^ 0xC0A0;
        FullbrightModule.D[0x1754 ^ 0x17D4] = 0x17D5 ^ 0x17D4;
        FullbrightModule.D[0xB123 ^ 0xB05C] = 0xB05C ^ 0xB05C;
        FullbrightModule.D[0xBA05 ^ 0xBB58] = 0x6E04 ^ 0xBB58;
        FullbrightModule.D[0xC12 ^ 0xC08] = 0xFFFFF3C2 ^ 0xC08;
        FullbrightModule.D[0x6FA1 ^ 0x6FF1] = 0xFFFF90A5 ^ 0x6FF1;
        FullbrightModule.D[0xF8FE ^ 0xF9DC] = 0x73F0 ^ 0xF9DC;
        FullbrightModule.D[0x4CEA ^ 0x4CBD] = 0x4CBE ^ 0x4CBD;
        FullbrightModule.D[0xF036 ^ 0xF0DD] = 0xCF8 ^ 0xF0DD;
        FullbrightModule.D[0x129E ^ 0x1229] = 0x428F ^ 0x1229;
        FullbrightModule.D[0xAADA ^ 0xABA4] = 0xABDA ^ 0xABA4;
        FullbrightModule.D[0xF9C6 ^ 0xF9CF] = 0xFFFF0711 ^ 0xF9CF;
        FullbrightModule.D[0x10900 ^ 0x1091C] = 0x1093E ^ 0x1091C;
        FullbrightModule.D[0x31A ^ 0x38D] = 0x32C1 ^ 0x38D;
        FullbrightModule.D[0x300E ^ 0x304B] = 0xBA74 ^ 0x304B;
        FullbrightModule.D[0xE725 ^ 0xE623] = 0xA591 ^ 0xE623;
        FullbrightModule.D[0x8EAB ^ 0x8E1B] = 0x1627 ^ 0x8E1B;
        FullbrightModule.D[0x29B3 ^ 0x299B] = 0xFFFFD60C ^ 0x299B;
        FullbrightModule.D[0x6E61 ^ 0x6EDB] = 0xFFFF1456 ^ 0x6EDB;
        FullbrightModule.D[0xA3E9 ^ 0xA3C9] = 0xA3BC ^ 0xA3C9;
        FullbrightModule.D[0x6B76 ^ 0x6B12] = 0xFFFF94E0 ^ 0x6B12;
        FullbrightModule.D[0x214B ^ 0x2012] = 0xF828 ^ 0x2012;
        FullbrightModule.D[0x3B52 ^ 0x3B3D] = 0x3B34 ^ 0x3B3D;
        FullbrightModule.D[0x43E3 ^ 0x4333] = 0x31EF ^ 0x4333;
        FullbrightModule.D[0x74C4 ^ 0x7445] = 0x7447 ^ 0x7445;
        FullbrightModule.D[0xF6D4 ^ 0xF644] = 0x1FC7A ^ 0xF644;
        FullbrightModule.D[0x7C20 ^ 0x7D4A] = 0x7D53 ^ 0x7D4A;
        FullbrightModule.D[0xEA99 ^ 0xEBFF] = 0xFFFF1442 ^ 0xEBFF;
        FullbrightModule.D[0x7179 ^ 0x71C0] = 0xF4FD ^ 0x71C0;
        FullbrightModule.D[0x5BB7 ^ 0x5B01] = 0xBE5 ^ 0x5B01;
        FullbrightModule.D[0x6E7 ^ 0x68E] = 0xFFFFF974 ^ 0x68E;
    }
}

