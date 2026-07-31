/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render.target;

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
import kotakbaz.rain.client.extensions.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0017\u0010\u0014\u00a8\u0006\u0018"}, d2={"Lkotakbaz/rain/module/modules/render/target/TargetTracker;", "", "<init>", "()V", "", "update", "Lnet/minecraft/class_1657;", "currentTarget", "()Lnet/minecraft/class_1657;", "liveTarget", "hoveredTarget", "player", "track", "(Lnet/minecraft/class_1657;)V", "hoveredPlayer", "", "isUsableTarget", "(Lnet/minecraft/class_1657;)Z", "", "HOLD_MILLIS", "J", "LIVE_TARGET_MILLIS", "Lnet/minecraft/class_1657;", "lastSeenAt", "rain-visuals"})
@SourceDebugExtension(value={"SMAP\nTargetTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetTracker.kt\nkotakbaz/rain/module/modules/render/target/TargetTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1#2:63\n*E\n"})
public final class TargetTracker {
    @NotNull
    public static final TargetTracker INSTANCE;
    private static final long a = 3000L;
    private static final long A = 100L;
    @Nullable
    private static PlayerEntity b;
    private static long B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    private TargetTracker() {
    }

    public final void update() {
        long l2 = 3103673200913839705L;
        PlayerEntity playerEntity = this.hoveredPlayer();
        long l3 = System.currentTimeMillis();
        if (playerEntity != null) {
            b = playerEntity;
            B = l3;
        } else {
            int n2;
            PlayerEntity playerEntity2 = b;
            if (playerEntity2 != null) {
                PlayerEntity playerEntity3 = playerEntity2;
                long l4 = l2;
                int n3 = E[0];
                n3 ^= E[1];
                l2 = l4 ^ (0L ^ l4) & -1L << (n3 ^= E[2]);
                int n4 = E[3];
                n4 ^= E[4];
                if (this.isUsableTarget(playerEntity3) == (n4 -= E[5])) {
                    int n5 = E[6];
                    n5 -= E[7];
                    n2 = n5 -= E[8];
                } else {
                    int n6 = E[9];
                    n6 += E[10];
                    n2 = n6 += E[11];
                }
            } else {
                int n7 = E[12];
                n7 -= E[13];
                n2 = n7 -= E[14];
            }
            if (n2 == 0 && l3 - B > 3000L) {
                b = null;
            }
        }
    }

    @Nullable
    public final PlayerEntity currentTarget() {
        PlayerEntity playerEntity = b;
        if (playerEntity == null) {
            return null;
        }
        PlayerEntity playerEntity2 = playerEntity;
        if (!this.isUsableTarget(playerEntity2)) {
            return null;
        }
        if (System.currentTimeMillis() - B > 3000L) {
            return null;
        }
        return playerEntity2;
    }

    @Nullable
    public final PlayerEntity liveTarget() {
        PlayerEntity playerEntity = b;
        if (playerEntity == null) {
            return null;
        }
        PlayerEntity playerEntity2 = playerEntity;
        if (!this.isUsableTarget(playerEntity2)) {
            return null;
        }
        if (System.currentTimeMillis() - B > 100L) {
            return null;
        }
        return playerEntity2;
    }

    @Nullable
    public final PlayerEntity hoveredTarget() {
        return this.hoveredPlayer();
    }

    public final void track(@NotNull PlayerEntity player) {
        int n2 = E[15];
        n2 += E[16];
        Intrinsics.checkNotNullParameter(player, (String)c[n2 += E[17]]);
        if (!this.isUsableTarget(player)) {
            return;
        }
        b = player;
        B = System.currentTimeMillis();
    }

    private final PlayerEntity hoveredPlayer() {
        long l2 = -1455860101364129657L;
        HitResult hitResult = kotakbaz.rain.client.extensions.b.getMc().crosshairTarget;
        EntityHitResult entityHitResult = hitResult instanceof EntityHitResult ? (EntityHitResult)hitResult : null;
        if (entityHitResult == null) {
            return null;
        }
        EntityHitResult entityHitResult2 = entityHitResult;
        Entity entity = entityHitResult2.getEntity();
        PlayerEntity playerEntity = entity instanceof PlayerEntity ? (PlayerEntity)entity : null;
        if (playerEntity == null) {
            return null;
        }
        PlayerEntity playerEntity2 = playerEntity;
        if (Intrinsics.areEqual(playerEntity2, kotakbaz.rain.client.extensions.b.getMc().player)) {
            return null;
        }
        hitResult = playerEntity2;
        entity = hitResult;
        long l3 = l2;
        int n2 = E[18];
        n2 += E[19];
        l2 = l3 ^ (0L ^ l3) & -1L << (n2 ^= E[20]);
        return this.isUsableTarget((PlayerEntity)entity) ? hitResult : null;
    }

    private final boolean isUsableTarget(PlayerEntity player) {
        int n2;
        if (!player.isRemoved() && player.isAlive()) {
            int n3 = E[21];
            n3 += E[22];
            n2 = n3 -= E[23];
        } else {
            int n4 = E[24];
            n4 -= E[25];
            n2 = n4 += E[26];
        }
        return n2 != 0;
    }

    static {
        TargetTracker.b();
        long l2 = 7096581936119916564L;
        long l3 = 9024621507154364323L;
        long l4 = -2824530855440244587L;
        long l5 = -5734505797219146152L;
        long l6 = 4487281698083480646L;
        long l7 = 5269006013484678311L;
        long l8 = -4769330017757038957L;
        long l9 = 6929959090617440707L;
        long l10 = 7542594006039233177L;
        long l11 = 6112608231436457441L;
        long l12 = -8720585433300608227L;
        long l13 = -8835440923563207341L;
        long l14 = -8013375890935003713L;
        long l15 = 663087414143543508L;
        int n2 = E[27];
        n2 -= E[28];
        c = new Object[n2 ^= E[29]];
        long l16 = l15;
        int n3 = E[30];
        n3 -= E[31];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= E[32]);
        Object[] objectArray = new Object[E[33]];
        objectArray[TargetTracker.E[34]] = C;
        objectArray[TargetTracker.E[35]] = E[36];
        int n4 = E[37];
        Object object = TargetTracker.A()[E[38]];
        if (object == null) {
            char[] cArray = "\u8d37\u8d24\u8d3b\u8d4a\u8d3b\u8cd3\u8d2c\u8d4a\u8d08\u889b\u8d3b\u889a\u8d36\u8d04\u8d21\u8d29\u8d0b\u8d49\u8897\u8d60\u8d0b\u8cd0\u8d4d\u8ccf\u8895\u8d45\u8d44\u8d2c\u8d3b\u8d60\u8d45\u8d22\u8cd1\u8d4d\u8cc1\u8d37\u8cc1\u8d4a\u8d2e\u8d63\u8d63\u8d35\u8cc3\u8d5f".toCharArray();
            for (int i2 = E[39]; i2 < E[40]; ++i2) {
                int n5 = cArray[i2];
                n5 -= E[41];
                n5 += E[42];
                n5 ^= E[43];
                n5 ^= E[44];
                n5 ^= E[45];
                n5 ^= E[46];
                n5 -= E[47];
                n5 += E[48];
                n5 -= E[49];
                n5 ^= E[50];
                n5 ^= E[51];
                n5 ^= E[52];
                n5 += E[53];
                cArray[i2] = (char)(n5 ^= E[54]);
            }
            object = TargetTracker.A()[TargetTracker.E[55]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)TargetTracker.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = E[56];
        n6 ^= E[57];
        l6 = l17 ^ (0x800000000L ^ l17) & -1L << (n6 += E[58]);
        long l18 = l13;
        int n7 = E[59];
        n7 += E[60];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += E[61]);
        while (true) {
            int n8 = E[62];
            n8 -= E[63];
            if ((int)l13 >= (int)(l6 >>> (n8 -= E[64]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = E[65];
            n10 -= E[66];
            int n11 = E[68];
            n11 ^= E[69];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += E[67])) & -1L >>> (n11 += E[70]);
            long l20 = l9;
            int n12 = E[71];
            n12 -= E[72];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= E[73]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = E[74];
            n14 -= E[75];
            int n15 = E[77];
            n15 += E[78];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 += E[76])) & -1L >>> (n15 ^= E[79]);
            int n16 = E[80];
            n16 ^= E[81];
            long l22 = l10;
            int n17 = E[83];
            n17 += E[84];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += E[82]) ^ l22) & -1L << (n17 += E[85]);
            int n18 = E[86];
            n18 += E[87];
            n18 += E[88];
            int n19 = E[89];
            n19 ^= E[90];
            long l23 = l12;
            int n20 = E[92];
            n20 ^= E[93];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += E[91]))) ^ l23) & -1L >>> (n20 ^= E[94]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = E[95];
            n21 += E[96];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= E[97]);
            while (true) {
                int n22 = E[98];
                n22 -= E[99];
                if ((int)(l14 >>> (n22 -= E[100])) >= (int)l12) break;
                int n23 = E[101];
                n23 += E[102];
                int n24 = E[104];
                n24 ^= E[105];
                cArray2[(int)(l14 >>> (n23 += TargetTracker.E[103]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= E[106]))];
                l14 += 0x100000000L;
            }
            int n25 = E[107];
            n25 += E[108];
            int n26 = (int)(l15 >>> (n25 ^= E[109]));
            l15 += 0x100000000L;
            TargetTracker.c[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = E[110];
            n27 += E[111];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= E[112]);
        }
        INSTANCE = new TargetTracker();
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[E[113]];
        String string = (String)object[E[114]];
        object = object[E[115]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[116]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[117]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[119] ^ E[120]];
                byArray[TargetTracker.E[121] ^ TargetTracker.E[122]] = E[123] ^ E[124];
                byArray[TargetTracker.E[125] ^ TargetTracker.E[126]] = E[127] ^ E[128];
                byArray[TargetTracker.E[129] ^ TargetTracker.E[130]] = E[131] ^ E[132];
                byArray[TargetTracker.E[133] ^ TargetTracker.E[134]] = E[135] ^ E[136];
                byArray[TargetTracker.E[137] ^ TargetTracker.E[138]] = E[139] ^ E[140];
                byArray[TargetTracker.E[141] ^ TargetTracker.E[142]] = E[143] ^ E[144];
                byArray[TargetTracker.E[145] ^ TargetTracker.E[146]] = E[147] ^ E[148];
                byArray[TargetTracker.E[149] ^ TargetTracker.E[150]] = E[151] ^ E[152];
                byArray[TargetTracker.E[153] ^ TargetTracker.E[154]] = E[155] ^ E[156];
                byArray[TargetTracker.E[157] ^ TargetTracker.E[158]] = E[159] ^ E[160];
                byArray[TargetTracker.E[161] ^ TargetTracker.E[162]] = E[163] ^ E[164];
                byArray[TargetTracker.E[165] ^ TargetTracker.E[166]] = E[167] ^ E[168];
                byArray[TargetTracker.E[169] ^ TargetTracker.E[170]] = E[171] ^ E[172];
                byArray[TargetTracker.E[173] ^ TargetTracker.E[174]] = E[175] ^ E[176];
                byArray[TargetTracker.E[177] ^ TargetTracker.E[178]] = E[179] ^ E[180];
                byArray[TargetTracker.E[181] ^ TargetTracker.E[182]] = E[183] ^ E[184];
                objectArray2[TargetTracker.E[118]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[185]];
            if (d == null) {
                byte[] byArray2 = new byte[E[186] ^ E[187]];
                byArray2[TargetTracker.E[188] ^ TargetTracker.E[189]] = E[190] ^ E[191];
                byArray2[TargetTracker.E[192] ^ TargetTracker.E[193]] = E[194] ^ E[195];
                byArray2[TargetTracker.E[196] ^ TargetTracker.E[197]] = E[198] ^ E[199];
                byArray2[TargetTracker.E[200] ^ TargetTracker.E[201]] = E[202] ^ E[203];
                byArray2[TargetTracker.E[204] ^ TargetTracker.E[205]] = E[206] ^ E[207];
                byArray2[TargetTracker.E[208] ^ TargetTracker.E[209]] = E[210] ^ E[211];
                byArray2[TargetTracker.E[212] ^ TargetTracker.E[213]] = E[214] ^ E[215];
                byArray2[TargetTracker.E[216] ^ TargetTracker.E[217]] = E[218] ^ E[219];
                byArray2[TargetTracker.E[220] ^ TargetTracker.E[221]] = E[222] ^ E[223];
                byArray2[TargetTracker.E[224] ^ TargetTracker.E[225]] = E[226] ^ E[227];
                byArray2[TargetTracker.E[228] ^ TargetTracker.E[229]] = E[230] ^ E[231];
                byArray2[TargetTracker.E[232] ^ TargetTracker.E[233]] = E[234] ^ E[235];
                byArray2[TargetTracker.E[236] ^ TargetTracker.E[237]] = E[238] ^ E[239];
                byArray2[TargetTracker.E[240] ^ TargetTracker.E[241]] = E[242] ^ E[243];
                byArray2[TargetTracker.E[244] ^ TargetTracker.E[245]] = E[246] ^ E[247];
                byArray2[TargetTracker.E[248] ^ TargetTracker.E[249]] = E[250] ^ E[251];
                byArray2[TargetTracker.E[252] ^ TargetTracker.E[253]] = E[254] ^ E[255];
                byArray2[TargetTracker.E[256] ^ TargetTracker.E[257]] = E[258] ^ E[259];
                byArray2[TargetTracker.E[260] ^ TargetTracker.E[261]] = E[262] ^ E[263];
                byArray2[TargetTracker.E[264] ^ TargetTracker.E[265]] = E[266] ^ E[267];
                byArray2[TargetTracker.E[268] ^ TargetTracker.E[269]] = E[270] ^ E[271];
                byArray2[TargetTracker.E[272] ^ TargetTracker.E[273]] = E[274] ^ E[275];
                byArray2[TargetTracker.E[276] ^ TargetTracker.E[277]] = E[278] ^ E[279];
                byArray2[TargetTracker.E[280] ^ TargetTracker.E[281]] = E[282] ^ E[283];
                byArray2[TargetTracker.E[284] ^ TargetTracker.E[285]] = E[286] ^ E[287];
                byArray2[TargetTracker.E[288] ^ TargetTracker.E[289]] = E[290] ^ E[291];
                byArray2[TargetTracker.E[292] ^ TargetTracker.E[293]] = E[294] ^ E[295];
                byArray2[TargetTracker.E[296] ^ TargetTracker.E[297]] = E[298] ^ E[299];
                byArray2[TargetTracker.E[300] ^ TargetTracker.E[301]] = E[302] ^ E[303];
                byArray2[TargetTracker.E[304] ^ TargetTracker.E[305]] = E[306] ^ E[307];
                byArray2[TargetTracker.E[308] ^ TargetTracker.E[309]] = E[310] ^ E[311];
                byArray2[TargetTracker.E[312] ^ TargetTracker.E[313]] = E[314] ^ E[315];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, E[316], byArray3, E[317], byArray.length);
                System.arraycopy(byArray2, E[318], byArray3, byArray.length, byArray2.length);
                Object object4 = TargetTracker.A()[E[319]];
                if (object4 == null) {
                    char[] cArray = "\u245a\u2434\u2425\u2bde\u2458\u2b84\u2bc1\u2a73\u2a6e\u2a72\u2bd2\u2bc7\u2bcb\u2a7d\u2bcd\u2bd2\u242b\u2bbb".toCharArray();
                    for (int i2 = E[320]; i2 < E[321]; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= E[322];
                        n3 ^= E[323];
                        n3 -= E[324];
                        n3 -= E[325];
                        n3 += E[326];
                        n3 += E[327];
                        n3 ^= E[328];
                        n3 += E[329];
                        n3 -= E[330];
                        n3 ^= E[331];
                        n3 += E[332];
                        n3 -= E[333];
                        n3 -= E[334];
                        n3 ^= E[335];
                        n3 ^= E[336];
                        cArray[i2] = (char)(n3 -= E[337]);
                    }
                    object4 = TargetTracker.A()[TargetTracker.E[338]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[E[339]];
                byArray4[TargetTracker.E[340]] = E[341];
                byArray4[TargetTracker.E[342]] = E[343];
                byArray4[TargetTracker.E[344]] = E[345];
                byArray4[TargetTracker.E[346]] = E[347];
                byArray4[TargetTracker.E[348]] = E[349];
                byArray4[TargetTracker.E[350]] = E[351];
                byArray4[TargetTracker.E[352]] = E[353];
                byArray4[TargetTracker.E[354]] = E[355];
                byArray4[TargetTracker.E[356]] = E[357];
                byArray4[TargetTracker.E[358]] = E[359];
                byArray4[TargetTracker.E[360]] = E[361];
                byArray4[TargetTracker.E[362]] = E[363];
                byArray4[TargetTracker.E[364]] = E[365];
                byArray4[TargetTracker.E[366]] = E[367];
                byArray4[TargetTracker.E[368]] = E[369];
                byArray4[TargetTracker.E[370]] = E[371];
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, E[372], E[373]);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = TargetTracker.A()[E[374]];
                if (object5 == null) {
                    char[] cArray = "\u450f\u44f3\u44fd".toCharArray();
                    for (int i3 = E[375]; i3 < E[376]; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= E[377];
                        n4 += E[378];
                        n4 -= E[379];
                        n4 ^= E[380];
                        n4 -= E[381];
                        n4 ^= E[382];
                        n4 ^= E[383];
                        n4 -= E[384];
                        n4 -= E[385];
                        cArray[i3] = (char)(n4 ^= E[386]);
                    }
                    object5 = TargetTracker.A()[TargetTracker.E[387]] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, E[388], E[389]);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, E[390], byArray6.length);
            Object object6 = TargetTracker.A()[E[391]];
            if (object6 == null) {
                char[] cArray = "\ue34f\ue353\ue33d\ue0a9\ue34d\ue352\ue34d\ue0a9\ue32c\ue355\ue34d\ue33d\ue0a3\ue32c\ue1ef\ue1f0\ue1f0\ue1f7\ue1de\ue1e1".toCharArray();
                for (int i4 = E[392]; i4 < E[393]; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= E[394];
                    n5 += E[395];
                    n5 += E[396];
                    n5 ^= E[397];
                    n5 ^= E[398];
                    n5 += E[399];
                    n5 += 55992;
                    n5 -= 47657;
                    n5 ^= 0xF179;
                    n5 += 61514;
                    n5 ^= 0x85DB;
                    cArray[i4] = (char)(n5 += 40061);
                }
                object6 = TargetTracker.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)d), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = e;
        if (e == null) {
            e = new Object[4];
            objectArray = e;
        }
        return objectArray;
    }

    public static void b() {
        E = new int[0x7D82 ^ 0x7C12];
        TargetTracker.E[0xAA04 ^ 0xAB7A] = 0xDBC ^ 0xAB7A;
        TargetTracker.E[0xD183 ^ 0xD123] = 0x7EF ^ 0xD123;
        TargetTracker.E[0x2557 ^ 0x2447] = 0x123F5 ^ 0x2447;
        TargetTracker.E[0xA411 ^ 0xA571] = 0xA579 ^ 0xA571;
        TargetTracker.E[0xEF46 ^ 0xEE7A] = 0xEE7A ^ 0xEE7A;
        TargetTracker.E[0xED5 ^ 0xF52] = 0xF51 ^ 0xF52;
        TargetTracker.E[0x9A0C ^ 0x9B42] = 0x2997 ^ 0x9B42;
        TargetTracker.E[0xA54 ^ 0xAB1] = 0xD5B ^ 0xAB1;
        TargetTracker.E[0xAEA5 ^ 0xAE9D] = 0xFFFF5140 ^ 0xAE9D;
        TargetTracker.E[0x6881 ^ 0x68B7] = 0x57A8 ^ 0x68B7;
        TargetTracker.E[0x4A29 ^ 0x4B1B] = 0xFFFFAA23 ^ 0x4B1B;
        TargetTracker.E[0xA897 ^ 0xA809] = 0x7EC5 ^ 0xA809;
        TargetTracker.E[0xEA10 ^ 0xEA92] = 0x13DF ^ 0xEA92;
        TargetTracker.E[0x326A ^ 0x3370] = 0xB5D5 ^ 0x3370;
        TargetTracker.E[0x2F62 ^ 0x2F52] = 0x26F8 ^ 0x2F52;
        TargetTracker.E[0xEA7A ^ 0xEA5F] = 0xEA5D ^ 0xEA5F;
        TargetTracker.E[0x42B6 ^ 0x4241] = 0x4A9C ^ 0x4241;
        TargetTracker.E[0xDB7C ^ 0xDBED] = 0x2A18 ^ 0xDBED;
        TargetTracker.E[0xDD2B ^ 0xDD03] = 0xDD2F ^ 0xDD03;
        TargetTracker.E[0x1030 ^ 0x10C4] = 0x1806 ^ 0x10C4;
        TargetTracker.E[0xAC8D ^ 0xAC14] = 0x447B ^ 0xAC14;
        TargetTracker.E[0x5E66 ^ 0x5E1C] = 0xB9C ^ 0x5E1C;
        TargetTracker.E[0x79B8 ^ 0x7974] = 0x17A98 ^ 0x7974;
        TargetTracker.E[0xD6B ^ 0xCE2] = 0xCF6 ^ 0xCE2;
        TargetTracker.E[0x7318 ^ 0x7265] = 0x3D70 ^ 0x7265;
        TargetTracker.E[0x2DD1 ^ 0x2D03] = 0xFFFF3CE8 ^ 0x2D03;
        TargetTracker.E[0xEDB4 ^ 0xEDEB] = 0xEDA5 ^ 0xEDEB;
        TargetTracker.E[0x12EB ^ 0x12B5] = 0xFFFFED26 ^ 0x12B5;
        TargetTracker.E[0x54BA ^ 0x54C2] = 0x5D1E ^ 0x54C2;
        TargetTracker.E[0xB7CB ^ 0xB7B0] = 0xE26F ^ 0xB7B0;
        TargetTracker.E[0x98A0 ^ 0x984F] = 0xE9FA ^ 0x984F;
        TargetTracker.E[0xCD8E ^ 0xCD69] = 0xCA83 ^ 0xCD69;
        TargetTracker.E[0xCC35 ^ 0xCCBE] = 0xBFEF ^ 0xCCBE;
        TargetTracker.E[0xE81F ^ 0xE92B] = 0x3843 ^ 0xE92B;
        TargetTracker.E[0x1296 ^ 0x1389] = 0xEA1B ^ 0x1389;
        TargetTracker.E[0xAEB4 ^ 0xAE98] = 0x7B1D ^ 0xAE98;
        TargetTracker.E[0x2E24 ^ 0x2F3C] = 0xA9AC ^ 0x2F3C;
        TargetTracker.E[0x4592 ^ 0x4414] = 0x4404 ^ 0x4414;
        TargetTracker.E[0x1D5E ^ 0x1D75] = 0xD70 ^ 0x1D75;
        TargetTracker.E[0x9676 ^ 0x96EA] = 0x7E85 ^ 0x96EA;
        TargetTracker.E[0x5107 ^ 0x5057] = 0xCA8A ^ 0x5057;
        TargetTracker.E[0xB211 ^ 0xB292] = 0xFFFFB428 ^ 0xB292;
        TargetTracker.E[0x2437 ^ 0x2531] = 0xFFFFCE57 ^ 0x2531;
        TargetTracker.E[0x72EC ^ 0x7281] = 0xFFFF8D60 ^ 0x7281;
        TargetTracker.E[0x2600 ^ 0x26E3] = 0x5686 ^ 0x26E3;
        TargetTracker.E[0x6BA0 ^ 0x6B44] = 0x6CA7 ^ 0x6B44;
        TargetTracker.E[0x2E45 ^ 0x2E62] = 0x2E62 ^ 0x2E62;
        TargetTracker.E[0x447D ^ 0x4511] = 0x4516 ^ 0x4511;
        TargetTracker.E[0x10817 ^ 0x108C8] = 0x1C849 ^ 0x108C8;
        TargetTracker.E[0x89A2 ^ 0x8912] = 0xEBCC ^ 0x8912;
        TargetTracker.E[0xF98C ^ 0xF91C] = 0xCEC8 ^ 0xF91C;
        TargetTracker.E[0xDA9D ^ 0xDBC1] = 0xDBC8 ^ 0xDBC1;
        TargetTracker.E[0x4C70 ^ 0x4C62] = 0x4C01 ^ 0x4C62;
        TargetTracker.E[0xD22 ^ 0xD19] = 0xD24 ^ 0xD19;
        TargetTracker.E[0x118E ^ 0x11B4] = 0x1183 ^ 0x11B4;
        TargetTracker.E[0x8FD8 ^ 0x8EB0] = 0x8EBA ^ 0x8EB0;
        TargetTracker.E[0x6FF6 ^ 0x6FF2] = 0xFFFF906A ^ 0x6FF2;
        TargetTracker.E[0x109D0 ^ 0x109B3] = 0x109B3 ^ 0x109B3;
        TargetTracker.E[0x90D ^ 0x941] = 0x914 ^ 0x941;
        TargetTracker.E[0xEC32 ^ 0xEC14] = 0xEC14 ^ 0xEC14;
        TargetTracker.E[0x5129 ^ 0x5166] = 0x5129 ^ 0x5166;
        TargetTracker.E[0x50B3 ^ 0x5009] = 0x2AF1 ^ 0x5009;
        TargetTracker.E[0x8756 ^ 0x870E] = 0x8746 ^ 0x870E;
        TargetTracker.E[0xD508 ^ 0xD56F] = 0xD565 ^ 0xD56F;
        TargetTracker.E[0x965 ^ 0x96B] = 0x968 ^ 0x96B;
        TargetTracker.E[0xB14F ^ 0xB180] = 0x1B27D ^ 0xB180;
        TargetTracker.E[0x326D ^ 0x3242] = 0xF608 ^ 0x3242;
        TargetTracker.E[0x51CA ^ 0x504A] = 0xACD6 ^ 0x504A;
        TargetTracker.E[0x7978 ^ 0x79EF] = 0xFFFF3C28 ^ 0x79EF;
        TargetTracker.E[0x2679 ^ 0x2658] = 0x265B ^ 0x2658;
        TargetTracker.E[0xB7E6 ^ 0xB6BC] = 0xB6BA ^ 0xB6BC;
        TargetTracker.E[0x4573 ^ 0x459A] = 0x14EAF ^ 0x459A;
        TargetTracker.E[0x60EA ^ 0x602C] = 0x1276 ^ 0x602C;
        TargetTracker.E[0xE3B0 ^ 0xE29F] = 0x7C67 ^ 0xE29F;
        TargetTracker.E[0x89EF ^ 0x893B] = 0x8161 ^ 0x893B;
        TargetTracker.E[0x8D6E ^ 0x8DB2] = 0x4D37 ^ 0x8DB2;
        TargetTracker.E[0xFC44 ^ 0xFC0C] = 0xFFFF0390 ^ 0xFC0C;
        TargetTracker.E[0xB0A0 ^ 0xB077] = 0xB838 ^ 0xB077;
        TargetTracker.E[0x3644 ^ 0x36B2] = 0x3E5F ^ 0x36B2;
        TargetTracker.E[0xFB81 ^ 0xFB3C] = 0xDE50 ^ 0xFB3C;
        TargetTracker.E[0x71BC ^ 0x7135] = 0x203 ^ 0x7135;
        TargetTracker.E[0x3722 ^ 0x3655] = 0x3655 ^ 0x3655;
        TargetTracker.E[0xF7DB ^ 0xF7E8] = 0xF1F8 ^ 0xF7E8;
        TargetTracker.E[0xE11B ^ 0xE189] = 0x107A ^ 0xE189;
        TargetTracker.E[0xA02B ^ 0xA0B1] = 0x48DE ^ 0xA0B1;
        TargetTracker.E[0xCF96 ^ 0xCF12] = 0x365F ^ 0xCF12;
        TargetTracker.E[0x58BD ^ 0x5832] = 0xFFFF9040 ^ 0x5832;
        TargetTracker.E[0x9041 ^ 0x91CD] = 0xA9E ^ 0x91CD;
        TargetTracker.E[0x4F5D ^ 0x4FF0] = 0x2D2C ^ 0x4FF0;
        TargetTracker.E[0x99F7 ^ 0x9884] = 0x98BD ^ 0x9884;
        TargetTracker.E[0x777A ^ 0x7794] = 0xFFFFF9FB ^ 0x7794;
        TargetTracker.E[0xAE7A ^ 0xAE11] = 0xFFFF518D ^ 0xAE11;
        TargetTracker.E[0xC8AA ^ 0xC84B] = 0xB82E ^ 0xC84B;
        TargetTracker.E[0x10CAA ^ 0x10C73] = 0x1B64D ^ 0x10C73;
        TargetTracker.E[0x86BF ^ 0x863A] = 0xA582 ^ 0x863A;
        TargetTracker.E[0x19A5 ^ 0x18AF] = 0xFFFF233A ^ 0x18AF;
        TargetTracker.E[0x4D64 ^ 0x4C4F] = 0x2319 ^ 0x4C4F;
        TargetTracker.E[0x363D ^ 0x3774] = 0xD65A ^ 0x3774;
        TargetTracker.E[0x10C4A ^ 0x10D59] = 0xAE9 ^ 0x10D59;
        TargetTracker.E[0x1035B ^ 0x1023F] = 0x1023B ^ 0x1023F;
        TargetTracker.E[0xD354 ^ 0xD36D] = 0xD359 ^ 0xD36D;
        TargetTracker.E[0x33A7 ^ 0x3383] = 0x3383 ^ 0x3383;
        TargetTracker.E[0xD485 ^ 0xD589] = 0xC16 ^ 0xD589;
        TargetTracker.E[0x2505 ^ 0x25C2] = 0x578D ^ 0x25C2;
        TargetTracker.E[0xA383 ^ 0xA352] = 0x4D57 ^ 0xA352;
        TargetTracker.E[0x97A8 ^ 0x9726] = 0xA0F2 ^ 0x9726;
        TargetTracker.E[0x8A42 ^ 0x8B05] = 0x9C0E ^ 0x8B05;
        TargetTracker.E[0x9C55 ^ 0x9C11] = 0x9C37 ^ 0x9C11;
        TargetTracker.E[0xCB38 ^ 0xCBCD] = 0xC310 ^ 0xCBCD;
        TargetTracker.E[0xF9F8 ^ 0xF914] = 0x88B1 ^ 0xF914;
        TargetTracker.E[0x4E27 ^ 0x4F75] = 0x4F74 ^ 0x4F75;
        TargetTracker.E[0x4792 ^ 0x473B] = 0xEAB1 ^ 0x473B;
        TargetTracker.E[0x105CB ^ 0x10480] = 0x1A2B1 ^ 0x10480;
        TargetTracker.E[0x7DCC ^ 0x7DF3] = 0x7D90 ^ 0x7DF3;
        TargetTracker.E[0x1020 ^ 0x1117] = 0xC067 ^ 0x1117;
        TargetTracker.E[0xB1BA ^ 0xB137] = 0x86E4 ^ 0xB137;
        TargetTracker.E[0xAED1 ^ 0xAFAD] = 0x325E ^ 0xAFAD;
        TargetTracker.E[0x5F2C ^ 0x5E35] = 0xD8A2 ^ 0x5E35;
        TargetTracker.E[0xC8BF ^ 0xC8D5] = 0xFFFF3714 ^ 0xC8D5;
        TargetTracker.E[0xE315 ^ 0xE3EB] = 0xAD46 ^ 0xE3EB;
        TargetTracker.E[0xA9E1 ^ 0xA92F] = 0x1AAB6 ^ 0xA92F;
        TargetTracker.E[0x95C ^ 0x842] = 0xFFFF0E22 ^ 0x842;
        TargetTracker.E[0x2E1E ^ 0x2F05] = 0xA992 ^ 0x2F05;
        TargetTracker.E[0x6FC2 ^ 0x6FA3] = 0xFFFF9015 ^ 0x6FA3;
        TargetTracker.E[0x10224 ^ 0x10204] = 0xFFFEFDD7 ^ 0x10204;
        TargetTracker.E[0x1046B ^ 0x1055B] = 0x11BBB ^ 0x1055B;
        TargetTracker.E[0x10716 ^ 0x10625] = 0x118DE ^ 0x10625;
        TargetTracker.E[0xFD7A ^ 0xFC59] = 0xF80F ^ 0xFC59;
        TargetTracker.E[0xD494 ^ 0xD5A2] = 0xFFFFFB60 ^ 0xD5A2;
        TargetTracker.E[0x50C0 ^ 0x51E2] = 0x5597 ^ 0x51E2;
        TargetTracker.E[0xFBFF ^ 0xFB59] = 0xF6EF ^ 0xFB59;
        TargetTracker.E[0x10B3E ^ 0x10BBF] = 0x1F2FA ^ 0x10BBF;
        TargetTracker.E[0xF4D5 ^ 0xF5DD] = 0x31F0 ^ 0xF5DD;
        TargetTracker.E[0x100F6 ^ 0x1018E] = 0x1018D ^ 0x1018E;
        TargetTracker.E[0x1049 ^ 0x110C] = 0xF9E5 ^ 0x110C;
        TargetTracker.E[0x175 ^ 0x123] = 0xFFFFFE90 ^ 0x123;
        TargetTracker.E[0x6C99 ^ 0x6C4F] = 0x6421 ^ 0x6C4F;
        TargetTracker.E[0x1067 ^ 0x1070] = 0x1077 ^ 0x1070;
        TargetTracker.E[0xE8F1 ^ 0xE9D5] = 0x6A78 ^ 0xE9D5;
        TargetTracker.E[0x9CD8 ^ 0x9C93] = 0x9C97 ^ 0x9C93;
        TargetTracker.E[0xF394 ^ 0xF3FB] = 0xF382 ^ 0xF3FB;
        TargetTracker.E[0x6B70 ^ 0x6B5E] = 0xB176 ^ 0x6B5E;
        TargetTracker.E[0x48F7 ^ 0x4843] = 0x5EBF ^ 0x4843;
        TargetTracker.E[0xDD9 ^ 0xCE1] = 0x400B ^ 0xCE1;
        TargetTracker.E[0x4346 ^ 0x42CE] = 0x42CE ^ 0x42CE;
        TargetTracker.E[0x4D7D ^ 0x4DD8] = 0x4060 ^ 0x4DD8;
        TargetTracker.E[0x84CE ^ 0x85E0] = 0x1B14 ^ 0x85E0;
        TargetTracker.E[0x4332 ^ 0x437F] = 0x43A8 ^ 0x437F;
        TargetTracker.E[0xE24A ^ 0xE30B] = 0xE319 ^ 0xE30B;
        TargetTracker.E[0xC251 ^ 0xC2A1] = 0xCA6A ^ 0xC2A1;
        TargetTracker.E[0x1CAF ^ 0x1CF4] = 0x1C88 ^ 0x1CF4;
        TargetTracker.E[0xD5C4 ^ 0xD5CC] = 0xD5E4 ^ 0xD5CC;
        TargetTracker.E[0x1BB1 ^ 0x1B0F] = 0x3E08 ^ 0x1B0F;
        TargetTracker.E[0x346B ^ 0x3530] = 0xFFFFCAA9 ^ 0x3530;
        TargetTracker.E[0x6136 ^ 0x6047] = 0x6072 ^ 0x6047;
        TargetTracker.E[0x2907 ^ 0x2918] = 0x2911 ^ 0x2918;
        TargetTracker.E[0x2C7F ^ 0x2D32] = 0xBE41 ^ 0x2D32;
        TargetTracker.E[0x26D7 ^ 0x26EB] = 0x26E9 ^ 0x26EB;
        TargetTracker.E[0xFC5B ^ 0xFC35] = 0xFFFF03C1 ^ 0xFC35;
        TargetTracker.E[0x6C33 ^ 0x6D38] = 0xA907 ^ 0x6D38;
        TargetTracker.E[0xBCB5 ^ 0xBC0E] = 0xC6D6 ^ 0xBC0E;
        TargetTracker.E[0x2719 ^ 0x2674] = 0x2622 ^ 0x2674;
        TargetTracker.E[0x10AA5 ^ 0x10BDF] = 0x144FF ^ 0x10BDF;
        TargetTracker.E[0x59A3 ^ 0x59C5] = 0x59C4 ^ 0x59C5;
        TargetTracker.E[0xDE3B ^ 0xDE3B] = 0xDE3F ^ 0xDE3B;
        TargetTracker.E[0x1853 ^ 0x1913] = 0x1913 ^ 0x1913;
        TargetTracker.E[0xA9A9 ^ 0xA96A] = 0x6CD2 ^ 0xA96A;
        TargetTracker.E[0xEA2F ^ 0xEB65] = 0x5AEA ^ 0xEB65;
        TargetTracker.E[0x9916 ^ 0x9900] = 0xFFFF66E9 ^ 0x9900;
        TargetTracker.E[0xCEC ^ 0xD66] = 0xA926 ^ 0xD66;
        TargetTracker.E[0x3757 ^ 0x3712] = 0x3710 ^ 0x3712;
        TargetTracker.E[0x3756 ^ 0x373F] = 0x3717 ^ 0x373F;
        TargetTracker.E[0xCC52 ^ 0xCC49] = 0xFFFF33CA ^ 0xCC49;
        TargetTracker.E[0xA7ED ^ 0xA69F] = 0xA69A ^ 0xA69F;
        TargetTracker.E[0xFAC5 ^ 0xFA74] = 0xEC8D ^ 0xFA74;
        TargetTracker.E[0xE710 ^ 0xE774] = 0xE731 ^ 0xE774;
        TargetTracker.E[0xCA88 ^ 0xCA4D] = 0xB802 ^ 0xCA4D;
        TargetTracker.E[0x109F0 ^ 0x1095A] = 0x1A4D3 ^ 0x1095A;
        TargetTracker.E[0xB047 ^ 0xB05D] = 0xFFFF4FB6 ^ 0xB05D;
        TargetTracker.E[0xB937 ^ 0xB84C] = 0x40EC ^ 0xB84C;
        TargetTracker.E[0x2632 ^ 0x26C9] = 0xE406 ^ 0x26C9;
        TargetTracker.E[0x6CB2 ^ 0x6DAF] = 0x943D ^ 0x6DAF;
        TargetTracker.E[0xA4F3 ^ 0xA4DE] = 0x7659 ^ 0xA4DE;
        TargetTracker.E[0x3252 ^ 0x3208] = 0xFFFFCDB7 ^ 0x3208;
        TargetTracker.E[0x1061E ^ 0x10758] = 0x1B751 ^ 0x10758;
        TargetTracker.E[0x10343 ^ 0x103E4] = 0x10E2A ^ 0x103E4;
        TargetTracker.E[0x436 ^ 0x57E] = 0xF1B2 ^ 0x57E;
        TargetTracker.E[0xDC1E ^ 0xDC8A] = 0x2D79 ^ 0xDC8A;
        TargetTracker.E[0xDE70 ^ 0xDE21] = 0xFFFF21C8 ^ 0xDE21;
        TargetTracker.E[0xFA36 ^ 0xFAE5] = 0x14E0 ^ 0xFAE5;
        TargetTracker.E[0x741F ^ 0x754A] = 0xFFFF8AF1 ^ 0x754A;
        TargetTracker.E[0x5CB5 ^ 0x5C3F] = 0x2F05 ^ 0x5C3F;
        TargetTracker.E[0xB17 ^ 0xBCC] = 0xB1F2 ^ 0xBCC;
        TargetTracker.E[0x10F6F ^ 0x10E45] = 0xFFFE9ED7 ^ 0x10E45;
        TargetTracker.E[0x142C ^ 0x148F] = 0xCDB8 ^ 0x148F;
        TargetTracker.E[0xE69 ^ 0xEB1] = 0xB498 ^ 0xEB1;
        TargetTracker.E[0x10508 ^ 0x10511] = 0xFFFEFABF ^ 0x10511;
        TargetTracker.E[0xCCB ^ 0xDDC] = 0xF3CB ^ 0xDDC;
        TargetTracker.E[0x2019 ^ 0x20B1] = 0x2D07 ^ 0x20B1;
        TargetTracker.E[0xC628 ^ 0xC69B] = 0xFFFF2FC8 ^ 0xC69B;
        TargetTracker.E[0xBBD9 ^ 0xBACB] = 0x1BD39 ^ 0xBACB;
        TargetTracker.E[0xC177 ^ 0xC1F1] = 0xE242 ^ 0xC1F1;
        TargetTracker.E[0xE05A ^ 0xE134] = 0xE137 ^ 0xE134;
        TargetTracker.E[0x48C7 ^ 0x483E] = 0x8AF1 ^ 0x483E;
        TargetTracker.E[0x446B ^ 0x457E] = 0xBB69 ^ 0x457E;
        TargetTracker.E[0xF14C ^ 0xF1AC] = 0x81DF ^ 0xF1AC;
        TargetTracker.E[0x5F0F ^ 0x5F1A] = 0x5F05 ^ 0x5F1A;
        TargetTracker.E[0xABAC ^ 0xABA5] = 0xFFFF5475 ^ 0xABA5;
        TargetTracker.E[0x9210 ^ 0x9377] = 0x932E ^ 0x9377;
        TargetTracker.E[0x24A8 ^ 0x2469] = 0xE1D1 ^ 0x2469;
        TargetTracker.E[0x8F29 ^ 0x8F49] = 0xFFFF70C1 ^ 0x8F49;
        TargetTracker.E[0x133B ^ 0x138E] = 0xD712 ^ 0x138E;
        TargetTracker.E[0x913A ^ 0x919B] = 0x48EA ^ 0x919B;
        TargetTracker.E[0x868B ^ 0x865E] = 0x8E11 ^ 0x865E;
        TargetTracker.E[0x675E ^ 0x6600] = 0x660E ^ 0x6600;
        TargetTracker.E[0xCD88 ^ 0xCD26] = 0xAFF8 ^ 0xCD26;
        TargetTracker.E[0xB88E ^ 0xB8DA] = 0xFFFF4717 ^ 0xB8DA;
        TargetTracker.E[0xA5CD ^ 0xA541] = 0xD67B ^ 0xA541;
        TargetTracker.E[0xB0CA ^ 0xB1A3] = 0xB1C5 ^ 0xB1A3;
        TargetTracker.E[0x2F88 ^ 0x2F7B] = 0x27B1 ^ 0x2F7B;
        TargetTracker.E[0x7513 ^ 0x757B] = 0xFFFF8AB2 ^ 0x757B;
        TargetTracker.E[0xE1D9 ^ 0xE134] = 0x9081 ^ 0xE134;
        TargetTracker.E[0x72D5 ^ 0x7233] = 0x75D0 ^ 0x7233;
        TargetTracker.E[0xEC77 ^ 0xEDFA] = 0xA55C ^ 0xEDFA;
        TargetTracker.E[0x6CFA ^ 0x6DD2] = 0x288 ^ 0x6DD2;
        TargetTracker.E[0x576 ^ 0x44B] = 0x44B ^ 0x44B;
        TargetTracker.E[0xA1 ^ 3] = 0xD973 ^ 3;
        TargetTracker.E[0x27A8 ^ 0x2743] = 0x12C76 ^ 0x2743;
        TargetTracker.E[0x6078 ^ 0x6155] = 0xFFAD ^ 0x6155;
        TargetTracker.E[0x7147 ^ 0x70C8] = 0x4FD0 ^ 0x70C8;
        TargetTracker.E[0xF50D ^ 0xF46C] = 0xFFFF0BC1 ^ 0xF46C;
        TargetTracker.E[0x3F84 ^ 0x3E85] = 0x8B77 ^ 0x3E85;
        TargetTracker.E[0xC23D ^ 0xC2D7] = 0xFFFE360C ^ 0xC2D7;
        TargetTracker.E[0x9ADA ^ 0x9A32] = 0x1910F ^ 0x9A32;
        TargetTracker.E[0x3780 ^ 0x37D0] = 0xFFFFC864 ^ 0x37D0;
        TargetTracker.E[0x3E48 ^ 0x3E44] = 0x3E46 ^ 0x3E44;
        TargetTracker.E[0xA95 ^ 0xBB4] = 0xFE2 ^ 0xBB4;
        TargetTracker.E[0xB98D ^ 0xB98F] = 0xB9C2 ^ 0xB98F;
        TargetTracker.E[0xF9A ^ 0xF62] = 0xCDA7 ^ 0xF62;
        TargetTracker.E[0x84E ^ 0x845] = 0x833 ^ 0x845;
        TargetTracker.E[0x575 ^ 0x5E0] = 0xBFBE ^ 0x5E0;
        TargetTracker.E[0x3CBD ^ 0x3DDE] = 0xFFFFC21B ^ 0x3DDE;
        TargetTracker.E[0xC146 ^ 0xC07C] = 0xFFFF732D ^ 0xC07C;
        TargetTracker.E[0x7601 ^ 0x7654] = 0xFFFF89FE ^ 0x7654;
        TargetTracker.E[0xC405 ^ 0xC519] = 0x3C8B ^ 0xC519;
        TargetTracker.E[0x2C72 ^ 0x2C43] = 0x88C8 ^ 0x2C43;
        TargetTracker.E[0x7CD6 ^ 0x7D5D] = 0x500F ^ 0x7D5D;
        TargetTracker.E[0xD2A8 ^ 0xD2CD] = 0xD2D8 ^ 0xD2CD;
        TargetTracker.E[0xE134 ^ 0xE1A2] = 0x5BF1 ^ 0xE1A2;
        TargetTracker.E[0x85F6 ^ 0x858B] = 0x18945 ^ 0x858B;
        TargetTracker.E[0x7B6C ^ 0x7B26] = 0xFFFF8496 ^ 0x7B26;
        TargetTracker.E[0xDD33 ^ 0xDDC1] = 0xD560 ^ 0xDDC1;
        TargetTracker.E[0xC1A3 ^ 0xC0E7] = 0x39A0 ^ 0xC0E7;
        TargetTracker.E[0xD5FF ^ 0xD58D] = 0xD58F ^ 0xD58D;
        TargetTracker.E[0x3E0B ^ 0x3E90] = 0xFFFF2905 ^ 0x3E90;
        TargetTracker.E[0x70EA ^ 0x70FA] = 0xFFFF8F16 ^ 0x70FA;
        TargetTracker.E[0x2CDD ^ 0x2DE6] = 0x6109 ^ 0x2DE6;
        TargetTracker.E[0x72FB ^ 0x728B] = 0x72C6 ^ 0x728B;
        TargetTracker.E[0x1061E ^ 0x10620] = 0x1068A ^ 0x10620;
        TargetTracker.E[0xA843 ^ 0xA840] = 0xFFFF57F4 ^ 0xA840;
        TargetTracker.E[0xA05B ^ 0xA12B] = 0xA120 ^ 0xA12B;
        TargetTracker.E[0x81CA ^ 0x8172] = 0x45E4 ^ 0x8172;
        TargetTracker.E[0xF995 ^ 0xF8D9] = 0x1E2B ^ 0xF8D9;
        TargetTracker.E[0x9B90 ^ 0x9BD1] = 0xFFFF6465 ^ 0x9BD1;
        TargetTracker.E[0x7514 ^ 0x75DC] = 0x179C5 ^ 0x75DC;
        TargetTracker.E[0x100AB ^ 0x100B3] = 0xFFFEFF70 ^ 0x100B3;
        TargetTracker.E[0xDD0D ^ 0xDD0A] = 0xDD4C ^ 0xDD0A;
        TargetTracker.E[0xBD10 ^ 0xBD3A] = 0xD29B ^ 0xBD3A;
        TargetTracker.E[0x480E ^ 0x48CE] = 0x8D6F ^ 0x48CE;
        TargetTracker.E[0x8B43 ^ 0x8B46] = 0x8B6D ^ 0x8B46;
        TargetTracker.E[0xF89 ^ 0xF9A] = 0xFFFFF052 ^ 0xF9A;
        TargetTracker.E[0xD0CF ^ 0xD18C] = 0x3869 ^ 0xD18C;
        TargetTracker.E[0x7FC0 ^ 0x7EE5] = 0xFD56 ^ 0x7EE5;
        TargetTracker.E[0x2430 ^ 0x2564] = 0x256B ^ 0x2564;
        TargetTracker.E[0x293E ^ 0x2917] = 0x4B77 ^ 0x2917;
        TargetTracker.E[0x420B ^ 0x4229] = 0x4229 ^ 0x4229;
        TargetTracker.E[0xF392 ^ 0xF3ED] = 0xFFFE00F9 ^ 0xF3ED;
        TargetTracker.E[0xD952 ^ 0xD998] = 0x1D5C4 ^ 0xD998;
        TargetTracker.E[0xF05C ^ 0xF03E] = 0xF05B ^ 0xF03E;
        TargetTracker.E[0xB3A8 ^ 0xB3B5] = 0xFFFF4C2C ^ 0xB3B5;
        TargetTracker.E[0xD2BA ^ 0xD2FA] = 0xD2DD ^ 0xD2FA;
        TargetTracker.E[0x901E ^ 0x917B] = 0xFFFF6EB7 ^ 0x917B;
        TargetTracker.E[0x2CDA ^ 0x2C9C] = 0xFFFFD360 ^ 0x2C9C;
        TargetTracker.E[0xA605 ^ 0xA786] = 0xA784 ^ 0xA786;
        TargetTracker.E[0xB228 ^ 0xB29A] = 0xA466 ^ 0xB29A;
        TargetTracker.E[0x8FE6 ^ 0x8F2D] = 0x18329 ^ 0x8F2D;
        TargetTracker.E[0x2147 ^ 0x21CF] = 0x27C ^ 0x21CF;
        TargetTracker.E[0xF25D ^ 0xF20E] = 0xF2A7 ^ 0xF20E;
        TargetTracker.E[0x107AE ^ 0x107BF] = 0x107E6 ^ 0x107BF;
        TargetTracker.E[0x7B76 ^ 0x7B70] = 0x7B1F ^ 0x7B70;
        TargetTracker.E[0x8EA6 ^ 0x8F8F] = 0xE0D9 ^ 0x8F8F;
        TargetTracker.E[0x56B ^ 0x51A] = 0x51B ^ 0x51A;
        TargetTracker.E[0xE6B0 ^ 0xE64A] = 0xFFFFDB55 ^ 0xE64A;
        TargetTracker.E[0x1B3D ^ 0x1B92] = 0x7934 ^ 0x1B92;
        TargetTracker.E[0xD0F0 ^ 0xD1A9] = 0xFFFF2E77 ^ 0xD1A9;
        TargetTracker.E[0xE59 ^ 0xEE0] = 0xEE0 ^ 0xEE0;
        TargetTracker.E[0x2650 ^ 0x26E7] = 0xE275 ^ 0x26E7;
        TargetTracker.E[0x73FB ^ 0x7291] = 0x729D ^ 0x7291;
        TargetTracker.E[0x59E1 ^ 0x58E5] = 0x4C09 ^ 0x58E5;
        TargetTracker.E[0xBB8C ^ 0xBBCE] = 0xBBEE ^ 0xBBCE;
        TargetTracker.E[0x2565 ^ 0x240A] = 0xFFFFDBFD ^ 0x240A;
        TargetTracker.E[0xDF5E ^ 0xDF8E] = 0x3197 ^ 0xDF8E;
        TargetTracker.E[0x10742 ^ 0x1075E] = 0xFFFEF8B5 ^ 0x1075E;
        TargetTracker.E[0x164B ^ 0x1602] = 0x1617 ^ 0x1602;
        TargetTracker.E[0x1148 ^ 0x11B7] = 0x5F2B ^ 0x11B7;
        TargetTracker.E[0x62AD ^ 0x6209] = 0xBB79 ^ 0x6209;
        TargetTracker.E[0x680A ^ 0x690F] = 0x7DF0 ^ 0x690F;
        TargetTracker.E[0x4D08 ^ 0x4C0F] = 0x58F0 ^ 0x4C0F;
        TargetTracker.E[0x8185 ^ 0x8105] = 0x18DC4 ^ 0x8105;
        TargetTracker.E[0x2761 ^ 0x2715] = 0x2714 ^ 0x2715;
        TargetTracker.E[0xFFA8 ^ 0xFE8E] = 0xFFFF82F6 ^ 0xFE8E;
        TargetTracker.E[0x7A4B ^ 0x7B13] = 0x7B11 ^ 0x7B13;
        TargetTracker.E[0xFCF9 ^ 0xFCC4] = 0xFFFF0325 ^ 0xFCC4;
        TargetTracker.E[0x383F ^ 0x38F2] = 0x13B0F ^ 0x38F2;
        TargetTracker.E[0x3034 ^ 0x302A] = 0xFFFFCFD6 ^ 0x302A;
        TargetTracker.E[0x6133 ^ 0x600C] = 0x600D ^ 0x600C;
        TargetTracker.E[0xBA07 ^ 0xBB82] = 0xBB92 ^ 0xBB82;
        TargetTracker.E[0xFC37 ^ 0xFC49] = 0x1F088 ^ 0xFC49;
        TargetTracker.E[0x221E ^ 0x224C] = 0xFFFFDD8F ^ 0x224C;
        TargetTracker.E[0xC821 ^ 0xC852] = 0xC852 ^ 0xC852;
        TargetTracker.E[0x5D09 ^ 0x5C62] = 0x5C41 ^ 0x5C62;
        TargetTracker.E[0xA4B3 ^ 0xA5BC] = 0x7C2D ^ 0xA5BC;
        TargetTracker.E[0xB826 ^ 0xB8B5] = 0xFFFFB6CC ^ 0xB8B5;
        TargetTracker.E[0x9036 ^ 0x9039] = 0xFFFF6F82 ^ 0x9039;
        TargetTracker.E[0xEE38 ^ 0xEF18] = 0xEB45 ^ 0xEF18;
        TargetTracker.E[0xA386 ^ 0xA319] = 0xFFFF8A4A ^ 0xA319;
        TargetTracker.E[0x14AB ^ 0x1417] = 0x3174 ^ 0x1417;
        TargetTracker.E[0xBB5B ^ 0xBA65] = 0xBA65 ^ 0xBA65;
        TargetTracker.E[0x7914 ^ 0x7819] = 0xA188 ^ 0x7819;
        TargetTracker.E[0x74B1 ^ 0x75BF] = 0xAC45 ^ 0x75BF;
        TargetTracker.E[0xBA65 ^ 0xBBE4] = 0x47FA ^ 0xBBE4;
        TargetTracker.E[0x4DBB ^ 0x4CAA] = 0x14B1A ^ 0x4CAA;
        TargetTracker.E[0x435A ^ 0x432F] = 0x432E ^ 0x432F;
        TargetTracker.E[0x4A41 ^ 0x4A40] = 0x4A29 ^ 0x4A40;
        TargetTracker.E[0x703E ^ 0x7009] = 0x7009 ^ 0x7009;
        TargetTracker.E[0x101A4 ^ 0x10187] = 0x10186 ^ 0x10187;
        TargetTracker.E[0xEAF7 ^ 0xEB8E] = 0x5ACE ^ 0xEB8E;
        TargetTracker.E[0x4E5D ^ 0x4F00] = 0x4F27 ^ 0x4F00;
        TargetTracker.E[0x6B8D ^ 0x6ABC] = 0x7447 ^ 0x6ABC;
        TargetTracker.E[0xF90A ^ 0xF826] = 0x66C4 ^ 0xF826;
        TargetTracker.E[0xB898 ^ 0xB8DB] = 0xB8B6 ^ 0xB8DB;
        TargetTracker.E[0x1DC9 ^ 0x1C9E] = 0x1CB8 ^ 0x1C9E;
        TargetTracker.E[0x3405 ^ 0x3563] = 0x3563 ^ 0x3563;
        TargetTracker.E[0xDE70 ^ 0xDEB2] = 0xFFFFE49B ^ 0xDEB2;
        TargetTracker.E[0xB77A ^ 0xB716] = 0xB733 ^ 0xB716;
        TargetTracker.E[0x5F76 ^ 0x5F2B] = 0x5F47 ^ 0x5F2B;
        TargetTracker.E[0x1B49 ^ 0x1B94] = 0xDB15 ^ 0x1B94;
        TargetTracker.E[0xF9BA ^ 0xF94B] = 0xF181 ^ 0xF94B;
        TargetTracker.E[0x3B45 ^ 0x3B9F] = 0xFFFF7E3F ^ 0x3B9F;
        TargetTracker.E[0x52F ^ 0x556] = 0x50DF ^ 0x556;
        TargetTracker.E[0x9BED ^ 0x9A9B] = 0x9A99 ^ 0x9A9B;
        TargetTracker.E[0x90A6 ^ 0x919F] = 0xDD70 ^ 0x919F;
        TargetTracker.E[0xA6B5 ^ 0xA6A1] = 0xA6AA ^ 0xA6A1;
        TargetTracker.E[0xFB68 ^ 0xFA61] = 0x3E5E ^ 0xFA61;
        TargetTracker.E[0x36DA ^ 0x3789] = 0x3799 ^ 0x3789;
        TargetTracker.E[0xFCCB ^ 0xFC4C] = 0xDFDF ^ 0xFC4C;
        TargetTracker.E[0x3A1F ^ 0x3B9B] = 0x3B9B ^ 0x3B9B;
        TargetTracker.E[0x74EB ^ 0x74AC] = 0xFFFF8B7D ^ 0x74AC;
        TargetTracker.E[0xE444 ^ 0xE4A6] = 0x94C5 ^ 0xE4A6;
        TargetTracker.E[0x67E1 ^ 0x66D4] = 0xB7A4 ^ 0x66D4;
        TargetTracker.E[0xC20F ^ 0xC2D1] = 0xFFFFFD86 ^ 0xC2D1;
        TargetTracker.E[0x5AF4 ^ 0x5B96] = 0x5B9B ^ 0x5B96;
        TargetTracker.E[0x9980 ^ 0x993F] = 0xBC53 ^ 0x993F;
        TargetTracker.E[0xB0EE ^ 0xB0E4] = 0xFFFF4F5E ^ 0xB0E4;
        TargetTracker.E[0xD283 ^ 0xD2F5] = 0xD2F5 ^ 0xD2F5;
        TargetTracker.E[0x1704 ^ 0x17F9] = 0x5965 ^ 0x17F9;
        TargetTracker.E[0x8820 ^ 0x8920] = 0x3CD4 ^ 0x8920;
        TargetTracker.E[0xC7F2 ^ 0xC76A] = 0x7D39 ^ 0xC76A;
        TargetTracker.E[0x37B9 ^ 0x3724] = 0xE1EC ^ 0x3724;
        TargetTracker.E[0x7A33 ^ 0x7A98] = 0xFFFF28E4 ^ 0x7A98;
        TargetTracker.E[0x2F4E ^ 0x2E18] = 0x2E19 ^ 0x2E18;
        TargetTracker.E[0x991E ^ 0x99B2] = 0x343B ^ 0x99B2;
        TargetTracker.E[0xFC4E ^ 0xFD3A] = 0xFD23 ^ 0xFD3A;
        TargetTracker.E[0xD236 ^ 0xD335] = 0x66C7 ^ 0xD335;
        TargetTracker.E[0x7537 ^ 0x75F3] = 0x7BF ^ 0x75F3;
        TargetTracker.E[0xC493 ^ 0xC49E] = 0xFFFF3B61 ^ 0xC49E;
        TargetTracker.E[0xBF82 ^ 0xBEA5] = 0x3D16 ^ 0xBEA5;
        TargetTracker.E[0x6B02 ^ 0x6B36] = 0xA024 ^ 0x6B36;
        TargetTracker.E[0x5728 ^ 0x563E] = 0xFFFF57F4 ^ 0x563E;
        TargetTracker.E[0xF2FE ^ 0xF2CB] = 0x5AB2 ^ 0xF2CB;
        TargetTracker.E[0x9023 ^ 0x9121] = 0x24A5 ^ 0x9121;
        TargetTracker.E[0x5E34 ^ 0x5EFD] = 0x152F9 ^ 0x5EFD;
        TargetTracker.E[0xBC76 ^ 0xBC38] = 0xFFFF43A0 ^ 0xBC38;
        TargetTracker.E[0x666E ^ 0x6632] = 0xFFFF99ED ^ 0x6632;
        TargetTracker.E[0xC28B ^ 0xC277] = 0x8CE6 ^ 0xC277;
        TargetTracker.E[0x2660 ^ 0x2722] = 0x7DA0 ^ 0x2722;
        TargetTracker.E[0xFBAD ^ 0xFAB9] = 0x4BA ^ 0xFAB9;
        TargetTracker.E[0x1CF3 ^ 0x1DBC] = 0x476B ^ 0x1DBC;
        TargetTracker.E[0x643C ^ 0x65B2] = 0x8FA5 ^ 0x65B2;
        TargetTracker.E[0x5954 ^ 0x5966] = 0xFAA9 ^ 0x5966;
        TargetTracker.E[0xEF0C ^ 0xEE79] = 0xEF79 ^ 0xEE79;
        TargetTracker.E[0xECB7 ^ 0xEDC8] = 0xA71 ^ 0xEDC8;
        TargetTracker.E[0x1D6 ^ 0x160] = 0xC5F6 ^ 0x160;
        TargetTracker.E[0xEB64 ^ 0xEAE6] = 0x9BB9 ^ 0xEAE6;
        TargetTracker.E[0x3359 ^ 0x3300] = 0x331B ^ 0x3300;
        TargetTracker.E[0xEC0D ^ 0xED5C] = 0x9241 ^ 0xED5C;
        TargetTracker.E[0x3A38 ^ 0x3A44] = 0x6FC4 ^ 0x3A44;
        TargetTracker.E[0x7D50 ^ 0x7D27] = 0x74EB ^ 0x7D27;
        TargetTracker.E[0x1A1F ^ 0x1B40] = 0xFFFFE4DF ^ 0x1B40;
        TargetTracker.E[0xF6B3 ^ 0xF6E4] = 0xF6F1 ^ 0xF6E4;
    }
}

