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
import kotakbaz.rain.event.events.AttackEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.restrict.FuntimeRestrict;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u000e\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001d\u00a8\u0006\u001f"}, d2={"Lkotakbaz/rain/module/modules/player/ShiftTapModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/AttackEvent;", "event", "onAttack", "(Lkotakbaz/rain/event/events/AttackEvent;)V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "releaseSneak", "Lnet/minecraft/class_746;", "player", "", "isCriticalHit", "(Lnet/minecraft/class_746;)Z", "resetState", "sneaking", "applySneakState", "(Z)V", "", "TAP_TICKS", "I", "tapTicksRemaining", "sneakApplied", "Z", "previousSneakPressed", "rain-visuals"})
public final class ShiftTapModule
extends Module {
    @NotNull
    public static final ShiftTapModule INSTANCE;
    private static final int a = 3;
    private static int A;
    private static boolean b;
    private static boolean B;
    private static Object[] c;
    private static Object d;
    private static Object[] D;
    private static Object[] C;
    private static Object[] e;
    public static int[] E;

    private ShiftTapModule() {
        int n2 = E[0];
        n2 ^= E[1];
        int n3 = E[3];
        n3 ^= E[4];
        int n4 = E[6];
        n4 -= E[7];
        super((String)c[n2 ^= E[2]], a_0.getPLAYER(), (String)c[n3 -= E[5]] + (String)c[n4 ^= E[8]]);
    }

    @Override
    public void onEnable() {
        this.resetState();
    }

    @Override
    public void onDisable() {
        this.releaseSneak();
        this.resetState();
    }

    @Commando
    public final void onAttack(@NotNull AttackEvent event) {
        int n2 = E[9];
        n2 ^= E[10];
        Intrinsics.checkNotNullParameter(event, (String)c[n2 ^= E[11]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().world == null) {
            return;
        }
        if (!(event.getEntity() instanceof LivingEntity)) {
            return;
        }
        if (!this.isCriticalHit(clientPlayerEntity2)) {
            return;
        }
        if (!b) {
            B = kotakbaz.rain.client.extensions.b.getMc().options.sneakKey.isPressed();
            boolean bl = E[12];
            bl += E[13];
            this.applySneakState(bl += E[14]);
            int n3 = E[15];
            n3 ^= E[16];
            b = n3 ^= E[17];
        }
        int n4 = E[18];
        n4 -= E[19];
        A = n4 += E[20];
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = -2498919126508308845L;
        long l3 = -3115246738639112088L;
        int n2 = E[21];
        n2 ^= E[22];
        Intrinsics.checkNotNullParameter(event, (String)c[n2 -= E[23]]);
        if (kotakbaz.rain.client.extensions.b.getMc().player == null) {
            ShiftTapModule shiftTapModule = this;
            long l4 = l2;
            int n3 = E[24];
            n3 -= E[25];
            l2 = l4 ^ (0L ^ l4) & -1L << (n3 += E[26]);
            shiftTapModule.releaseSneak();
            shiftTapModule.resetState();
            return;
        }
        if (A <= 0) {
            return;
        }
        int n4 = E[27];
        n4 ^= E[28];
        long l5 = l3;
        int n5 = E[30];
        n5 ^= E[31];
        l3 = l5 ^ ((long)A << (n4 += E[29]) ^ l5) & -1L << (n5 ^= E[32]);
        int n6 = E[33];
        n6 += E[34];
        int n7 = E[36];
        A = (int)(l3 >>> (n6 -= E[35])) + (n7 -= E[37]);
        if (A <= 0) {
            this.releaseSneak();
        }
    }

    private final void releaseSneak() {
        if (!b) {
            return;
        }
        this.applySneakState(B);
        int n2 = E[38];
        n2 ^= E[39];
        b = n2 += E[40];
    }

    private final boolean isCriticalHit(ClientPlayerEntity player) {
        int n2;
        if (!(player.isOnGround() || !(player.getVelocity().y < 0.0) || player.isClimbing() || player.isTouchingWater() || player.hasVehicle() || player.isSprinting())) {
            int n3 = E[41];
            n3 += E[42];
            n2 = n3 += E[43];
        } else {
            int n4 = E[44];
            n4 += E[45];
            n2 = n4 += E[46];
        }
        return n2 != 0;
    }

    private final void resetState() {
        int n2 = E[47];
        n2 += E[48];
        A = n2 ^= E[49];
        int n3 = E[50];
        n3 += E[51];
        b = n3 ^= E[52];
        int n4 = E[53];
        n4 += E[54];
        B = n4 -= E[55];
    }

    private final void applySneakState(boolean sneaking) {
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        kotakbaz.rain.client.extensions.b.getMc().options.sneakKey.setPressed(sneaking);
        clientPlayerEntity2.setSneaking(sneaking);
    }

    static {
        ShiftTapModule.b();
        long l2 = -1121554290773975236L;
        long l3 = 7725429224987486876L;
        long l4 = 5162837962240121295L;
        long l5 = -4696076563074069070L;
        long l6 = -1824361633604901759L;
        long l7 = -8448581493447883130L;
        long l8 = -6975206561456388610L;
        long l9 = 3797098394821472700L;
        long l10 = -8149664777352357547L;
        long l11 = 8406689557377487567L;
        long l12 = -368402395091409613L;
        long l13 = 2404717862423044202L;
        long l14 = -1554031165219933613L;
        long l15 = 1411023657892774390L;
        int n2 = E[56];
        n2 += E[57];
        c = new Object[n2 -= E[58]];
        long l16 = l15;
        int n3 = E[59];
        n3 += E[60];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += E[61]);
        Object[] objectArray = new Object[E[62]];
        objectArray[ShiftTapModule.E[63]] = C;
        objectArray[ShiftTapModule.E[64]] = E[65];
        int n4 = E[66];
        Object object = ShiftTapModule.A()[E[67]];
        if (object == null) {
            char[] cArray = "\uf4de\uf507\uf4f2\uf4e9\uf514\uf4e6\uf512\uf4f2\uf4da\uf4de\uf50e\uf4de\uf511\uf514\uf4fb\uf50a\uf50b\uf500\uf4e3\uf50b\uf4f4\uf4ea\uf51f\uf50e\uf4de\uf506\uf4e4\uf500\uf4e8\uf4fa\uf50a\uf513\uf505\uf522\uf4e4\uf503\uf4f9\uf4ef\uf50e\uf51c\uf51e\uf4f3\uf4d1\uf513\uf50e\uf4f9\uf51d\uf4f1\uf4fa\uf4ca\uf4e7\uf51e\uf4f9\uf51f\uf4fb\uf4f9\uf51f\uf4f9\uf505\uf51d\uf4f2\uf50f\uf4c5\uf514\uf4f2\uf4e8\uf50a\uf4e4\uf4d9\uf4e5\uf4dd\uf504\uf4ee\uf509\uf500\uf4ef\uf4f2\uf4db\uf4ef\uf51b\uf4dd\uf4d4\uf4d1\uf4d4\uf513\uf4e7\uf4eb\uf507\uf4e0\uf4ea\uf51e\uf4dd\uf520\uf4fe\uf506\uf4d4\uf51e\uf4fc\uf4eb\uf500\uf522\uf4f1\uf4f3\uf4db\uf512\uf51b\uf514\uf4ca\uf4ff\uf4f1\uf4c9\uf522\uf4fb\uf4e4\uf510\uf4e9\uf4d3\uf504\uf50b\uf50d\uf4fd\uf4f9\uf4dd\uf4ff\uf4ff\uf4eb\uf4dd\uf520\uf522\uf4f1\uf51c\uf520\uf4e0\uf4fb\uf4c5\uf4c5\uf4fc\uf4fc\uf4e5\uf503\uf4e6\uf514\uf503\uf4de\uf500\uf50b\uf510\uf514\uf4f4\uf4fb\uf4d7\uf4d7".toCharArray();
            for (int i2 = E[68]; i2 < E[69]; ++i2) {
                int n5 = cArray[i2];
                n5 += E[70];
                n5 -= E[71];
                n5 += E[72];
                n5 += E[73];
                n5 -= E[74];
                n5 -= E[75];
                n5 ^= E[76];
                n5 += E[77];
                n5 -= E[78];
                n5 -= E[79];
                n5 += E[80];
                cArray[i2] = (char)(n5 ^= E[81]);
            }
            object = ShiftTapModule.A()[ShiftTapModule.E[82]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ShiftTapModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = E[83];
        n6 -= E[84];
        l6 = l17 ^ (0x4000000000L ^ l17) & -1L << (n6 += E[85]);
        long l18 = l13;
        int n7 = E[86];
        n7 -= E[87];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= E[88]);
        while (true) {
            int n8 = E[89];
            n8 += E[90];
            if ((int)l13 >= (int)(l6 >>> (n8 ^= E[91]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = E[92];
            n10 += E[93];
            int n11 = E[95];
            n11 ^= E[96];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += E[94])) & -1L >>> (n11 += E[97]);
            long l20 = l9;
            int n12 = E[98];
            n12 += E[99];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= E[100]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = E[101];
            n14 += E[102];
            int n15 = E[104];
            n15 -= E[105];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= E[103])) & -1L >>> (n15 += E[106]);
            int n16 = E[107];
            n16 ^= E[108];
            long l22 = l10;
            int n17 = E[110];
            n17 += E[111];
            l10 = l22 ^ ((long)cArray[n13] << (n16 -= E[109]) ^ l22) & -1L << (n17 -= E[112]);
            int n18 = E[113];
            n18 += E[114];
            n18 -= E[115];
            int n19 = E[116];
            n19 += E[117];
            long l23 = l12;
            int n20 = E[119];
            n20 += E[120];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 ^= E[118]))) ^ l23) & -1L >>> (n20 -= E[121]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = E[122];
            n21 ^= E[123];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= E[124]);
            while (true) {
                int n22 = E[125];
                n22 -= E[126];
                if ((int)(l14 >>> (n22 -= E[127])) >= (int)l12) break;
                int n23 = E[128];
                n23 += E[129];
                int n24 = E[131];
                n24 += E[132];
                cArray2[(int)(l14 >>> (n23 -= ShiftTapModule.E[130]))] = cArray[(int)l13 + (int)(l14 >>> (n24 += E[133]))];
                l14 += 0x100000000L;
            }
            int n25 = E[134];
            n25 += E[135];
            int n26 = (int)(l15 >>> (n25 -= E[136]));
            l15 += 0x100000000L;
            ShiftTapModule.c[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = E[137];
            n27 ^= E[138];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 += E[139]);
        }
        INSTANCE = new ShiftTapModule();
        int n28 = E[140];
        n28 += E[141];
        FuntimeRestrict.moduleOnFuntime$default(FuntimeRestrict.INSTANCE, INSTANCE, null, n28 ^= E[142], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[E[143]];
        String string = (String)object[E[144]];
        object = object[E[145]];
        Object[] objectArray = D;
        if (D == null) {
            objectArray = D = new Object[E[146]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[E[147]];
                C = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[E[149] ^ E[150]];
                byArray[ShiftTapModule.E[151] ^ ShiftTapModule.E[152]] = E[153] ^ E[154];
                byArray[ShiftTapModule.E[155] ^ ShiftTapModule.E[156]] = E[157] ^ E[158];
                byArray[ShiftTapModule.E[159] ^ ShiftTapModule.E[160]] = E[161] ^ E[162];
                byArray[ShiftTapModule.E[163] ^ ShiftTapModule.E[164]] = E[165] ^ E[166];
                byArray[ShiftTapModule.E[167] ^ ShiftTapModule.E[168]] = E[169] ^ E[170];
                byArray[ShiftTapModule.E[171] ^ ShiftTapModule.E[172]] = E[173] ^ E[174];
                byArray[ShiftTapModule.E[175] ^ ShiftTapModule.E[176]] = E[177] ^ E[178];
                byArray[ShiftTapModule.E[179] ^ ShiftTapModule.E[180]] = E[181] ^ E[182];
                byArray[ShiftTapModule.E[183] ^ ShiftTapModule.E[184]] = E[185] ^ E[186];
                byArray[ShiftTapModule.E[187] ^ ShiftTapModule.E[188]] = E[189] ^ E[190];
                byArray[ShiftTapModule.E[191] ^ ShiftTapModule.E[192]] = E[193] ^ E[194];
                byArray[ShiftTapModule.E[195] ^ ShiftTapModule.E[196]] = E[197] ^ E[198];
                byArray[ShiftTapModule.E[199] ^ ShiftTapModule.E[200]] = E[201] ^ E[202];
                byArray[ShiftTapModule.E[203] ^ ShiftTapModule.E[204]] = E[205] ^ E[206];
                byArray[ShiftTapModule.E[207] ^ ShiftTapModule.E[208]] = E[209] ^ E[210];
                byArray[ShiftTapModule.E[211] ^ ShiftTapModule.E[212]] = E[213] ^ E[214];
                objectArray2[ShiftTapModule.E[148]] = byArray;
            }
            byte[] byArray = (byte[])object3[E[215]];
            if (d == null) {
                byte[] byArray2 = new byte[E[216] ^ E[217]];
                byArray2[ShiftTapModule.E[218] ^ ShiftTapModule.E[219]] = E[220] ^ E[221];
                byArray2[ShiftTapModule.E[222] ^ ShiftTapModule.E[223]] = E[224] ^ E[225];
                byArray2[ShiftTapModule.E[226] ^ ShiftTapModule.E[227]] = E[228] ^ E[229];
                byArray2[ShiftTapModule.E[230] ^ ShiftTapModule.E[231]] = E[232] ^ E[233];
                byArray2[ShiftTapModule.E[234] ^ ShiftTapModule.E[235]] = E[236] ^ E[237];
                byArray2[ShiftTapModule.E[238] ^ ShiftTapModule.E[239]] = E[240] ^ E[241];
                byArray2[ShiftTapModule.E[242] ^ ShiftTapModule.E[243]] = E[244] ^ E[245];
                byArray2[ShiftTapModule.E[246] ^ ShiftTapModule.E[247]] = E[248] ^ E[249];
                byArray2[ShiftTapModule.E[250] ^ ShiftTapModule.E[251]] = E[252] ^ E[253];
                byArray2[ShiftTapModule.E[254] ^ ShiftTapModule.E[255]] = E[256] ^ E[257];
                byArray2[ShiftTapModule.E[258] ^ ShiftTapModule.E[259]] = E[260] ^ E[261];
                byArray2[ShiftTapModule.E[262] ^ ShiftTapModule.E[263]] = E[264] ^ E[265];
                byArray2[ShiftTapModule.E[266] ^ ShiftTapModule.E[267]] = E[268] ^ E[269];
                byArray2[ShiftTapModule.E[270] ^ ShiftTapModule.E[271]] = E[272] ^ E[273];
                byArray2[ShiftTapModule.E[274] ^ ShiftTapModule.E[275]] = E[276] ^ E[277];
                byArray2[ShiftTapModule.E[278] ^ ShiftTapModule.E[279]] = E[280] ^ E[281];
                byArray2[ShiftTapModule.E[282] ^ ShiftTapModule.E[283]] = E[284] ^ E[285];
                byArray2[ShiftTapModule.E[286] ^ ShiftTapModule.E[287]] = E[288] ^ E[289];
                byArray2[ShiftTapModule.E[290] ^ ShiftTapModule.E[291]] = E[292] ^ E[293];
                byArray2[ShiftTapModule.E[294] ^ ShiftTapModule.E[295]] = E[296] ^ E[297];
                byArray2[ShiftTapModule.E[298] ^ ShiftTapModule.E[299]] = E[300] ^ E[301];
                byArray2[ShiftTapModule.E[302] ^ ShiftTapModule.E[303]] = E[304] ^ E[305];
                byArray2[ShiftTapModule.E[306] ^ ShiftTapModule.E[307]] = E[308] ^ E[309];
                byArray2[ShiftTapModule.E[310] ^ ShiftTapModule.E[311]] = E[312] ^ E[313];
                byArray2[ShiftTapModule.E[314] ^ ShiftTapModule.E[315]] = E[316] ^ E[317];
                byArray2[ShiftTapModule.E[318] ^ ShiftTapModule.E[319]] = E[320] ^ E[321];
                byArray2[ShiftTapModule.E[322] ^ ShiftTapModule.E[323]] = E[324] ^ E[325];
                byArray2[ShiftTapModule.E[326] ^ ShiftTapModule.E[327]] = E[328] ^ E[329];
                byArray2[ShiftTapModule.E[330] ^ ShiftTapModule.E[331]] = E[332] ^ E[333];
                byArray2[ShiftTapModule.E[334] ^ ShiftTapModule.E[335]] = E[336] ^ E[337];
                byArray2[ShiftTapModule.E[338] ^ ShiftTapModule.E[339]] = E[340] ^ E[341];
                byArray2[ShiftTapModule.E[342] ^ ShiftTapModule.E[343]] = E[344] ^ E[345];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, E[346], byArray3, E[347], byArray.length);
                System.arraycopy(byArray2, E[348], byArray3, byArray.length, byArray2.length);
                Object object4 = ShiftTapModule.A()[E[349]];
                if (object4 == null) {
                    char[] cArray = "\u0ab6\u0b8c\u0aa1\u0b8a\u0ac0\udffc\u0acd\u0b9b\u0aba\u0b9e\u0abe\u0b9f\u0ac3\u0b69\u0ad9\u0abe\udfe3\udf53".toCharArray();
                    for (int i2 = E[350]; i2 < E[351]; ++i2) {
                        int n3 = cArray[i2];
                        n3 += E[352];
                        n3 -= E[353];
                        n3 ^= E[354];
                        n3 ^= E[355];
                        n3 -= E[356];
                        n3 -= E[357];
                        n3 ^= E[358];
                        n3 += E[359];
                        n3 -= E[360];
                        n3 += E[361];
                        n3 -= E[362];
                        n3 ^= E[363];
                        n3 += E[364];
                        n3 += E[365];
                        n3 ^= E[366];
                        cArray[i2] = (char)(n3 -= E[367]);
                    }
                    object4 = ShiftTapModule.A()[ShiftTapModule.E[368]] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[E[369]];
                byArray4[ShiftTapModule.E[370]] = E[371];
                byArray4[ShiftTapModule.E[372]] = E[373];
                byArray4[ShiftTapModule.E[374]] = E[375];
                byArray4[ShiftTapModule.E[376]] = E[377];
                byArray4[ShiftTapModule.E[378]] = E[379];
                byArray4[ShiftTapModule.E[380]] = E[381];
                byArray4[ShiftTapModule.E[382]] = E[383];
                byArray4[ShiftTapModule.E[384]] = E[385];
                byArray4[ShiftTapModule.E[386]] = E[387];
                byArray4[ShiftTapModule.E[388]] = E[389];
                byArray4[ShiftTapModule.E[390]] = E[391];
                byArray4[ShiftTapModule.E[392]] = E[393];
                byArray4[ShiftTapModule.E[394]] = E[395];
                byArray4[ShiftTapModule.E[396]] = E[397];
                byArray4[ShiftTapModule.E[398]] = E[399];
                byArray4[9] = -101;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 21, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ShiftTapModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\udb4b\udb77\udb39".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 2048;
                        n4 ^= 0xD261;
                        n4 += 41041;
                        n4 ^= 0x4012;
                        n4 ^= 0x33E3;
                        n4 -= 50452;
                        n4 -= 852;
                        n4 += 25832;
                        n4 += 16809;
                        n4 ^= 0xA39B;
                        n4 -= 3276;
                        cArray[i3] = (char)(n4 ^= 0x61D);
                    }
                    object5 = ShiftTapModule.A()[2] = new String(cArray);
                }
                d = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ShiftTapModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ud3ae\ud3c2\ud3bc\ud398\ud3ac\ud3b3\ud3ac\ud398\ud3bd\ud3c4\ud3ac\ud3bc\ud3b2\ud3bd\ud04e\ud3e1\ud3e1\ud3e6\ud3df\ud3e0".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 10115;
                    n5 += 15723;
                    n5 ^= 0x8E2C;
                    n5 -= 21679;
                    n5 -= 27856;
                    n5 ^= 0xFA12;
                    n5 ^= 0xAFF4;
                    n5 -= 38772;
                    n5 ^= 0x6395;
                    n5 ^= 0x69D5;
                    n5 += 26583;
                    n5 -= 32702;
                    cArray[i4] = (char)(n5 += 49663);
                }
                object6 = ShiftTapModule.A()[3] = new String(cArray);
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
        E = new int[0x3A2D ^ 0x3BBD];
        ShiftTapModule.E[0x8B7 ^ 0x836] = 0xFFFFF7BD ^ 0x836;
        ShiftTapModule.E[0x1B4 ^ 0x16C] = 0xDE58 ^ 0x16C;
        ShiftTapModule.E[0x969 ^ 0x9B9] = 0xC576 ^ 0x9B9;
        ShiftTapModule.E[0x3CA5 ^ 0x3D9E] = 0x13A2A ^ 0x3D9E;
        ShiftTapModule.E[0x296B ^ 0x2826] = 0x9D63 ^ 0x2826;
        ShiftTapModule.E[0x8AE4 ^ 0x8A7E] = 0xADB2 ^ 0x8A7E;
        ShiftTapModule.E[0x81A0 ^ 0x8025] = 0xFFFF7F91 ^ 0x8025;
        ShiftTapModule.E[0x9BC4 ^ 0x9BB9] = 0xFFFF647F ^ 0x9BB9;
        ShiftTapModule.E[0x10B68 ^ 0x10B27] = 0x16F8D ^ 0x10B27;
        ShiftTapModule.E[0xDB32 ^ 0xDA0A] = 0xFFFF365D ^ 0xDA0A;
        ShiftTapModule.E[0x9533 ^ 0x9442] = 0x9452 ^ 0x9442;
        ShiftTapModule.E[0xA987 ^ 0xA89F] = 0xC14C ^ 0xA89F;
        ShiftTapModule.E[0x8AB1 ^ 0x8A0C] = 0xCBEF ^ 0x8A0C;
        ShiftTapModule.E[0x5B8D ^ 0x5B2C] = 0xFFFF35C3 ^ 0x5B2C;
        ShiftTapModule.E[0x4BA9 ^ 0x4A25] = 0x4A21 ^ 0x4A25;
        ShiftTapModule.E[0x8FE3 ^ 0x8E8D] = 0xDF13 ^ 0x8E8D;
        ShiftTapModule.E[0x3544 ^ 0x3444] = 0xA0AF ^ 0x3444;
        ShiftTapModule.E[0xB3E ^ 0xB90] = 0xB854 ^ 0xB90;
        ShiftTapModule.E[0xF11E ^ 0xF178] = 0xF12A ^ 0xF178;
        ShiftTapModule.E[0x2334 ^ 0x225C] = 0xDBAD ^ 0x225C;
        ShiftTapModule.E[0x7DAC ^ 0x7DB2] = 0x7DE6 ^ 0x7DB2;
        ShiftTapModule.E[0x10A96 ^ 0x10A66] = 0x11057 ^ 0x10A66;
        ShiftTapModule.E[0x278B ^ 0x26F2] = 0x26E7 ^ 0x26F2;
        ShiftTapModule.E[0xDE47 ^ 0xDE40] = 0xDE50 ^ 0xDE40;
        ShiftTapModule.E[0x67E6 ^ 0x6708] = 0x7D5E ^ 0x6708;
        ShiftTapModule.E[0x72A5 ^ 0x723A] = 0xE33A ^ 0x723A;
        ShiftTapModule.E[0x6214 ^ 0x624B] = 0x6251 ^ 0x624B;
        ShiftTapModule.E[0x3EBE ^ 0x3E88] = 0xFFFFC125 ^ 0x3E88;
        ShiftTapModule.E[0xBB8F ^ 0xBBEC] = 0xBB95 ^ 0xBBEC;
        ShiftTapModule.E[0xCD56 ^ 0xCDD0] = 0xCDB4 ^ 0xCDD0;
        ShiftTapModule.E[0xA425 ^ 0xA543] = 0xC0ED ^ 0xA543;
        ShiftTapModule.E[0x7070 ^ 0x70AD] = 0x9755 ^ 0x70AD;
        ShiftTapModule.E[0x341A ^ 0x3535] = 0x31F9 ^ 0x3535;
        ShiftTapModule.E[0x8584 ^ 0x85F2] = 0xFFFF7A64 ^ 0x85F2;
        ShiftTapModule.E[0x9651 ^ 0x97D9] = 0x97D8 ^ 0x97D9;
        ShiftTapModule.E[0x4652 ^ 0x4678] = 0x4602 ^ 0x4678;
        ShiftTapModule.E[0x68BB ^ 0x687B] = 0xF7C2 ^ 0x687B;
        ShiftTapModule.E[0xD65D ^ 0xD686] = 0x317E ^ 0xD686;
        ShiftTapModule.E[0xF396 ^ 0xF2EB] = 0xFFFF0D0F ^ 0xF2EB;
        ShiftTapModule.E[0xBBCA ^ 0xBB83] = 0xF0A7 ^ 0xBB83;
        ShiftTapModule.E[0xCC83 ^ 0xCC59] = 0x2BB0 ^ 0xCC59;
        ShiftTapModule.E[0x1175 ^ 0x1178] = 0x1178 ^ 0x1178;
        ShiftTapModule.E[0x8719 ^ 0x869D] = 0x869E ^ 0x869D;
        ShiftTapModule.E[0xB4CA ^ 0xB4D1] = 0xFFFF4B4C ^ 0xB4D1;
        ShiftTapModule.E[0xB6E5 ^ 0xB670] = 0x4E5C ^ 0xB670;
        ShiftTapModule.E[0x8806 ^ 0x891D] = 0x18AAC ^ 0x891D;
        ShiftTapModule.E[0x830 ^ 0x80B] = 0xFFFFF767 ^ 0x80B;
        ShiftTapModule.E[0x6ADC ^ 0x6AF3] = 0xFFFF957F ^ 0x6AF3;
        ShiftTapModule.E[0x10E6E ^ 0x10E3A] = 0x10E4C ^ 0x10E3A;
        ShiftTapModule.E[0x4F40 ^ 0x4E00] = 0xF24A ^ 0x4E00;
        ShiftTapModule.E[0x107C2 ^ 0x10781] = 0x10781 ^ 0x10781;
        ShiftTapModule.E[0x65AF ^ 0x6561] = 0x9ECD ^ 0x6561;
        ShiftTapModule.E[0x3C23 ^ 0x3CC1] = 0xA4A5 ^ 0x3CC1;
        ShiftTapModule.E[0xF882 ^ 0xF824] = 0xD49F ^ 0xF824;
        ShiftTapModule.E[0xF937 ^ 0xF9BC] = 0xFFFF064E ^ 0xF9BC;
        ShiftTapModule.E[0x5FB0 ^ 0x5F22] = 0x5F23 ^ 0x5F22;
        ShiftTapModule.E[0xB70C ^ 0xB71E] = 0xB7AF ^ 0xB71E;
        ShiftTapModule.E[0xA440 ^ 0xA525] = 0x1CC8 ^ 0xA525;
        ShiftTapModule.E[0xB208 ^ 0xB35F] = 0x6F58 ^ 0xB35F;
        ShiftTapModule.E[0xA936 ^ 0xA988] = 0xE85E ^ 0xA988;
        ShiftTapModule.E[0xA1D ^ 0xAD1] = 0xF17D ^ 0xAD1;
        ShiftTapModule.E[0x2FBF ^ 0x2F76] = 0x12A1E ^ 0x2F76;
        ShiftTapModule.E[0x10B6A ^ 0x10B08] = 0xFFFEF47F ^ 0x10B08;
        ShiftTapModule.E[0x424D ^ 0x428B] = 0x1FD9 ^ 0x428B;
        ShiftTapModule.E[0xAC1C ^ 0xACB4] = 0x1AAA6 ^ 0xACB4;
        ShiftTapModule.E[0xE1F9 ^ 0xE0F7] = 0x9BF2 ^ 0xE0F7;
        ShiftTapModule.E[0x7193 ^ 0x71B4] = 0x71E0 ^ 0x71B4;
        ShiftTapModule.E[0x160B ^ 0x1786] = 0xFFFFE807 ^ 0x1786;
        ShiftTapModule.E[0x8616 ^ 0x860F] = 0x8612 ^ 0x860F;
        ShiftTapModule.E[0x96EA ^ 0x97C0] = 0xCF0E ^ 0x97C0;
        ShiftTapModule.E[0xE134 ^ 0xE1B0] = 0xE1B4 ^ 0xE1B0;
        ShiftTapModule.E[0x5752 ^ 0x57A7] = 0xB004 ^ 0x57A7;
        ShiftTapModule.E[0xB432 ^ 0xB4C5] = 0x7AC6 ^ 0xB4C5;
        ShiftTapModule.E[0x7B87 ^ 0x7BA7] = 0x7BA3 ^ 0x7BA7;
        ShiftTapModule.E[0xEE9B ^ 0xEE87] = 0xFFFF1158 ^ 0xEE87;
        ShiftTapModule.E[0x5CF7 ^ 0x5C86] = 0x5CF0 ^ 0x5C86;
        ShiftTapModule.E[0x4DFB ^ 0x4D02] = 0x8301 ^ 0x4D02;
        ShiftTapModule.E[0x7564 ^ 0x75A0] = 0x28F2 ^ 0x75A0;
        ShiftTapModule.E[0x6D2B ^ 0x6DB7] = 0xFDFD ^ 0x6DB7;
        ShiftTapModule.E[0x2F30 ^ 0x2E09] = 0x3DE4 ^ 0x2E09;
        ShiftTapModule.E[0x1040F ^ 0x1046A] = 0xFFFEFB02 ^ 0x1046A;
        ShiftTapModule.E[0xA18D ^ 0xA0C8] = 0x678F ^ 0xA0C8;
        ShiftTapModule.E[0x5AD6 ^ 0x5AE5] = 0xFFFFA508 ^ 0x5AE5;
        ShiftTapModule.E[0x6BCB ^ 0x6B99] = 0x6B99 ^ 0x6B99;
        ShiftTapModule.E[0x65C9 ^ 0x64CE] = 0xE2E ^ 0x64CE;
        ShiftTapModule.E[0x6232 ^ 0x631C] = 0x67C7 ^ 0x631C;
        ShiftTapModule.E[0x792D ^ 0x79F3] = 0x77E3 ^ 0x79F3;
        ShiftTapModule.E[0xEC0D ^ 0xED08] = 0xE8BB ^ 0xED08;
        ShiftTapModule.E[0x10B33 ^ 0x10B06] = 0x10B7F ^ 0x10B06;
        ShiftTapModule.E[0x2F02 ^ 0x2E3C] = 0x9259 ^ 0x2E3C;
        ShiftTapModule.E[0xD592 ^ 0xD4E5] = 0xD49C ^ 0xD4E5;
        ShiftTapModule.E[0x3DD5 ^ 0x3D6E] = 0x7CB0 ^ 0x3D6E;
        ShiftTapModule.E[0xBD18 ^ 0xBDFE] = 0xDC2D ^ 0xBDFE;
        ShiftTapModule.E[0xED87 ^ 0xED4C] = 0x16EE ^ 0xED4C;
        ShiftTapModule.E[0xA2EF ^ 0xA38F] = 0x76AC ^ 0xA38F;
        ShiftTapModule.E[0x81B0 ^ 0x81E0] = 0x949C ^ 0x81E0;
        ShiftTapModule.E[0xE8FD ^ 0xE8F4] = 0xE8E7 ^ 0xE8F4;
        ShiftTapModule.E[0x1E57 ^ 0x1E23] = 0xFFFFE16D ^ 0x1E23;
        ShiftTapModule.E[0x86CE ^ 0x863D] = 0x619E ^ 0x863D;
        ShiftTapModule.E[0x43DB ^ 0x42F8] = 0xBDED ^ 0x42F8;
        ShiftTapModule.E[0x8F7F ^ 0x8E54] = 0xD69F ^ 0x8E54;
        ShiftTapModule.E[0x4BC1 ^ 0x4A85] = 0xFFFF720B ^ 0x4A85;
        ShiftTapModule.E[0x8ADD ^ 0x8A20] = 0x7973 ^ 0x8A20;
        ShiftTapModule.E[0x26F7 ^ 0x27CD] = 0x12065 ^ 0x27CD;
        ShiftTapModule.E[0x5DD2 ^ 0x5DCF] = 0xFFFFA211 ^ 0x5DCF;
        ShiftTapModule.E[0xBE3D ^ 0xBE63] = 0xBE01 ^ 0xBE63;
        ShiftTapModule.E[0xD223 ^ 0xD30A] = 0x1B3F ^ 0xD30A;
        ShiftTapModule.E[0xD976 ^ 0xD99C] = 0xFDAC ^ 0xD99C;
        ShiftTapModule.E[0x82DB ^ 0x838F] = 0xFFFF7AC0 ^ 0x838F;
        ShiftTapModule.E[0x993B ^ 0x987C] = 0xA4FD ^ 0x987C;
        ShiftTapModule.E[0x9814 ^ 0x9926] = 0x744F ^ 0x9926;
        ShiftTapModule.E[0x15A9 ^ 0x1516] = 0x8AA5 ^ 0x1516;
        ShiftTapModule.E[0x1959 ^ 0x187E] = 0xD04B ^ 0x187E;
        ShiftTapModule.E[0x5C3F ^ 0x5D4F] = 0x5D4E ^ 0x5D4F;
        ShiftTapModule.E[0x8D1E ^ 0x8C45] = 0x8C45 ^ 0x8C45;
        ShiftTapModule.E[0x629B ^ 0x62F5] = 0x6225 ^ 0x62F5;
        ShiftTapModule.E[0x1B62 ^ 0x1B9E] = 0xE894 ^ 0x1B9E;
        ShiftTapModule.E[0x57C1 ^ 0x56C9] = 0xFFFFC39B ^ 0x56C9;
        ShiftTapModule.E[0x10552 ^ 0x10577] = 0xFFFEFADE ^ 0x10577;
        ShiftTapModule.E[0xF572 ^ 0xF55A] = 0xF536 ^ 0xF55A;
        ShiftTapModule.E[0x932 ^ 0x9C6] = 0xEE5B ^ 0x9C6;
        ShiftTapModule.E[0x97A6 ^ 0x97DE] = 0x97FA ^ 0x97DE;
        ShiftTapModule.E[0xE1F3 ^ 0xE158] = 0x529B ^ 0xE158;
        ShiftTapModule.E[0xA55D ^ 0xA44D] = 0xDF6E ^ 0xA44D;
        ShiftTapModule.E[0xB7D3 ^ 0xB6C5] = 0xDF5B ^ 0xB6C5;
        ShiftTapModule.E[0x52B2 ^ 0x524C] = 0xC680 ^ 0x524C;
        ShiftTapModule.E[0x87F7 ^ 0x8723] = 0xCC33 ^ 0x8723;
        ShiftTapModule.E[0x10E9E ^ 0x10E7D] = 0x19614 ^ 0x10E7D;
        ShiftTapModule.E[0xAB33 ^ 0xAB1A] = 0xFFFF54DD ^ 0xAB1A;
        ShiftTapModule.E[0xE925 ^ 0xE96B] = 0x661 ^ 0xE96B;
        ShiftTapModule.E[0xCE91 ^ 0xCFC9] = 0x139C ^ 0xCFC9;
        ShiftTapModule.E[0x5B04 ^ 0x5A47] = 0x9D00 ^ 0x5A47;
        ShiftTapModule.E[0x56DD ^ 0x57B0] = 0x1FCE ^ 0x57B0;
        ShiftTapModule.E[0x6162 ^ 0x61AA] = 0x164F5 ^ 0x61AA;
        ShiftTapModule.E[0x75E5 ^ 0x75F4] = 0x75B9 ^ 0x75F4;
        ShiftTapModule.E[0x6814 ^ 0x68C7] = 0x23D8 ^ 0x68C7;
        ShiftTapModule.E[0xC00C ^ 0xC032] = 0xC031 ^ 0xC032;
        ShiftTapModule.E[0x45B9 ^ 0x4560] = 0x9A74 ^ 0x4560;
        ShiftTapModule.E[0x24E8 ^ 0x25CE] = 0xEDE4 ^ 0x25CE;
        ShiftTapModule.E[0xBA5F ^ 0xBB60] = 0x70D ^ 0xBB60;
        ShiftTapModule.E[0x38D6 ^ 0x3871] = 0x13E66 ^ 0x3871;
        ShiftTapModule.E[0xB56C ^ 0xB427] = 0x162 ^ 0xB427;
        ShiftTapModule.E[0xE8E0 ^ 0xE9FF] = 0x1917 ^ 0xE9FF;
        ShiftTapModule.E[0xB340 ^ 0xB235] = 0xB23F ^ 0xB235;
        ShiftTapModule.E[0xEC78 ^ 0xECE5] = 0xFFFF8368 ^ 0xECE5;
        ShiftTapModule.E[0x916D ^ 0x91AC] = 0xE24 ^ 0x91AC;
        ShiftTapModule.E[0x77C ^ 0x795] = 0x6653 ^ 0x795;
        ShiftTapModule.E[0x6FA9 ^ 0x6FFF] = 0x6F38 ^ 0x6FFF;
        ShiftTapModule.E[0xE317 ^ 0xE37D] = 0xFFFF1C86 ^ 0xE37D;
        ShiftTapModule.E[0xEDF0 ^ 0xEDFB] = 0xFFFF1272 ^ 0xEDFB;
        ShiftTapModule.E[0xBECE ^ 0xBE77] = 0x4D60 ^ 0xBE77;
        ShiftTapModule.E[0xDDF1 ^ 0xDC87] = 0xDC8B ^ 0xDC87;
        ShiftTapModule.E[0x75DE ^ 0x745E] = 0x7454 ^ 0x745E;
        ShiftTapModule.E[0x14B7 ^ 0x15C3] = 0x15C6 ^ 0x15C3;
        ShiftTapModule.E[0x10771 ^ 0x107F3] = 0xFFFEF876 ^ 0x107F3;
        ShiftTapModule.E[0x8B3D ^ 0x8B8C] = 0xFFFF054A ^ 0x8B8C;
        ShiftTapModule.E[0x9603 ^ 0x9707] = 0x92C6 ^ 0x9707;
        ShiftTapModule.E[0x4E64 ^ 0x4EEB] = 0x4EEA ^ 0x4EEB;
        ShiftTapModule.E[0x8B88 ^ 0x8B64] = 0xAF18 ^ 0x8B64;
        ShiftTapModule.E[0x5B5A ^ 0x5BF8] = 0xCAF9 ^ 0x5BF8;
        ShiftTapModule.E[0xD018 ^ 0xD020] = 0xFFFF2F1A ^ 0xD020;
        ShiftTapModule.E[0xB0D0 ^ 0xB1FD] = 0xE936 ^ 0xB1FD;
        ShiftTapModule.E[0xF818 ^ 0xF8E7] = 0x6C27 ^ 0xF8E7;
        ShiftTapModule.E[0x10A33 ^ 0x10A73] = 0x10A72 ^ 0x10A73;
        ShiftTapModule.E[0x8B44 ^ 0x8A19] = 0x8A18 ^ 0x8A19;
        ShiftTapModule.E[0xC239 ^ 0xC32A] = 0x1F67 ^ 0xC32A;
        ShiftTapModule.E[0x405C ^ 0x40EA] = 0x373 ^ 0x40EA;
        ShiftTapModule.E[0xEC02 ^ 0xEC36] = 0xFFFF13B1 ^ 0xEC36;
        ShiftTapModule.E[0x103D3 ^ 0x10291] = 0x1C5D6 ^ 0x10291;
        ShiftTapModule.E[0xEC25 ^ 0xED57] = 0xED5A ^ 0xED57;
        ShiftTapModule.E[0xE15A ^ 0xE009] = 0xE6E7 ^ 0xE009;
        ShiftTapModule.E[0x403B ^ 0x4157] = 0xF9C1 ^ 0x4157;
        ShiftTapModule.E[0xC4D0 ^ 0xC463] = 0x87FA ^ 0xC463;
        ShiftTapModule.E[0x25E ^ 0x21F] = 0x21F ^ 0x21F;
        ShiftTapModule.E[0xB814 ^ 0xB908] = 0x1BA93 ^ 0xB908;
        ShiftTapModule.E[0x73C4 ^ 0x72AF] = 0x1BA ^ 0x72AF;
        ShiftTapModule.E[0xC3F ^ 0xCF0] = 0xC03D ^ 0xCF0;
        ShiftTapModule.E[0xC415 ^ 0xC525] = 0xFFFF3E63 ^ 0xC525;
        ShiftTapModule.E[0x20C4 ^ 0x20C1] = 0xFFFFDF25 ^ 0x20C1;
        ShiftTapModule.E[0xF5E7 ^ 0xF4C5] = 0xBD2 ^ 0xF4C5;
        ShiftTapModule.E[0x7ED3 ^ 0x7E48] = 0xEE06 ^ 0x7E48;
        ShiftTapModule.E[0x82B7 ^ 0x82F5] = 0x82F7 ^ 0x82F5;
        ShiftTapModule.E[0xEDBF ^ 0xED93] = 0xFFFF127C ^ 0xED93;
        ShiftTapModule.E[0xFBBE ^ 0xFB7B] = 0xFFFF59C8 ^ 0xFB7B;
        ShiftTapModule.E[0x70E ^ 0x7FF] = 0x1DB3 ^ 0x7FF;
        ShiftTapModule.E[0xF3CE ^ 0xF3D6] = 0xFFFF0C09 ^ 0xF3D6;
        ShiftTapModule.E[0xA0BC ^ 0xA05C] = 0xAE27 ^ 0xA05C;
        ShiftTapModule.E[0x6A7B ^ 0x6B5F] = 0xFFFF6BF5 ^ 0x6B5F;
        ShiftTapModule.E[0x2347 ^ 0x2312] = 0x234B ^ 0x2312;
        ShiftTapModule.E[0xC62E ^ 0xC728] = 0xADC2 ^ 0xC728;
        ShiftTapModule.E[0x4E90 ^ 0x4EE9] = 0xFFFFB179 ^ 0x4EE9;
        ShiftTapModule.E[0xFD44 ^ 0xFD17] = 0xFD2A ^ 0xFD17;
        ShiftTapModule.E[0x2892 ^ 0x2987] = 0xF5CA ^ 0x2987;
        ShiftTapModule.E[0xD38B ^ 0xD208] = 0xFFFF2DB4 ^ 0xD208;
        ShiftTapModule.E[0xF136 ^ 0xF0B4] = 0xF0B4 ^ 0xF0B4;
        ShiftTapModule.E[0x25F9 ^ 0x24A5] = 0x24A5 ^ 0x24A5;
        ShiftTapModule.E[0xBC45 ^ 0xBCDB] = 0x2C91 ^ 0xBCDB;
        ShiftTapModule.E[0x7EC1 ^ 0x7FDF] = 0x8F23 ^ 0x7FDF;
        ShiftTapModule.E[0xB8D8 ^ 0xB9EC] = 0x54E3 ^ 0xB9EC;
        ShiftTapModule.E[0x2155 ^ 0x215F] = 0xFFFFDEC1 ^ 0x215F;
        ShiftTapModule.E[0x10D09 ^ 0x10C10] = 0x16587 ^ 0x10C10;
        ShiftTapModule.E[0x1CE3 ^ 0x1CED] = 0xFFFFE379 ^ 0x1CED;
        ShiftTapModule.E[0x5B1D ^ 0x5A2E] = 0xB755 ^ 0x5A2E;
        ShiftTapModule.E[0xDC9D ^ 0xDCFC] = 0xDC92 ^ 0xDCFC;
        ShiftTapModule.E[0xF13B ^ 0xF13B] = 0xF116 ^ 0xF13B;
        ShiftTapModule.E[0xF950 ^ 0xF960] = 0xF937 ^ 0xF960;
        ShiftTapModule.E[0xCFF4 ^ 0xCFBF] = 0xF1CA ^ 0xCFBF;
        ShiftTapModule.E[0x1E2E ^ 0x1E3A] = 0xFFFFE189 ^ 0x1E3A;
        ShiftTapModule.E[0x2DBC ^ 0x2D51] = 0x96A ^ 0x2D51;
        ShiftTapModule.E[0xBA77 ^ 0xBA96] = 0xB49B ^ 0xBA96;
        ShiftTapModule.E[0x87D1 ^ 0x87D9] = 0xFFFF7835 ^ 0x87D9;
        ShiftTapModule.E[0xD997 ^ 0xD941] = 0x9251 ^ 0xD941;
        ShiftTapModule.E[0xFDD1 ^ 0xFC5B] = 0xFC5C ^ 0xFC5B;
        ShiftTapModule.E[0x5A57 ^ 0x5B24] = 0x5B06 ^ 0x5B24;
        ShiftTapModule.E[0x22F9 ^ 0x23AB] = 0x2546 ^ 0x23AB;
        ShiftTapModule.E[0xDB02 ^ 0xDB33] = 0xFFFF24D0 ^ 0xDB33;
        ShiftTapModule.E[0xD84A ^ 0xD836] = 0xFFFF27C7 ^ 0xD836;
        ShiftTapModule.E[0x6B7B ^ 0x6A22] = 0xB625 ^ 0x6A22;
        ShiftTapModule.E[0x909C ^ 0x91A0] = 0xFFFE69BB ^ 0x91A0;
        ShiftTapModule.E[0xCA8C ^ 0xCA69] = 0x5200 ^ 0xCA69;
        ShiftTapModule.E[0x31 ^ 0xB8] = 0xFFFFFF45 ^ 0xB8;
        ShiftTapModule.E[0xE52D ^ 0xE57A] = 0xE550 ^ 0xE57A;
        ShiftTapModule.E[0x873C ^ 0x8601] = 0x181B5 ^ 0x8601;
        ShiftTapModule.E[0x3386 ^ 0x32E5] = 0xE92C ^ 0x32E5;
        ShiftTapModule.E[0x723 ^ 0x62C] = 0x7D2F ^ 0x62C;
        ShiftTapModule.E[0x6387 ^ 0x63DC] = 0xFFFF9C29 ^ 0x63DC;
        ShiftTapModule.E[0xE4B1 ^ 0xE5E7] = 0x39F3 ^ 0xE5E7;
        ShiftTapModule.E[0xA537 ^ 0xA505] = 0xFFFF5A9F ^ 0xA505;
        ShiftTapModule.E[0x38DC ^ 0x38DD] = 0xFFFFC770 ^ 0x38DD;
        ShiftTapModule.E[0x811A ^ 0x81BF] = 0xAD7A ^ 0x81BF;
        ShiftTapModule.E[0xD55C ^ 0xD46A] = 0xC789 ^ 0xD46A;
        ShiftTapModule.E[0x84A3 ^ 0x84D1] = 0xFFFF7B6F ^ 0x84D1;
        ShiftTapModule.E[0xFE2F ^ 0xFE15] = 0xFFFF0190 ^ 0xFE15;
        ShiftTapModule.E[0xF87E ^ 0xF96C] = 0x253F ^ 0xF96C;
        ShiftTapModule.E[0x5DFC ^ 0x5D0E] = 0xBAAC ^ 0x5D0E;
        ShiftTapModule.E[0x60B6 ^ 0x6197] = 0x917F ^ 0x6197;
        ShiftTapModule.E[0x7CCB ^ 0x7C77] = 0x3DA1 ^ 0x7C77;
        ShiftTapModule.E[0x54AE ^ 0x5463] = 0xFFFF5035 ^ 0x5463;
        ShiftTapModule.E[0x244A ^ 0x2488] = 0xBB31 ^ 0x2488;
        ShiftTapModule.E[0x8EF7 ^ 0x8E3D] = 0x18B62 ^ 0x8E3D;
        ShiftTapModule.E[0x78DD ^ 0x7845] = 0x5F89 ^ 0x7845;
        ShiftTapModule.E[0x4DA5 ^ 0x4D08] = 0xFEB3 ^ 0x4D08;
        ShiftTapModule.E[0xF241 ^ 0xF2C1] = 0xF2DB ^ 0xF2C1;
        ShiftTapModule.E[0x154C ^ 0x1402] = 0x459 ^ 0x1402;
        ShiftTapModule.E[0x2D6F ^ 0x2D36] = 0xFFFFD28A ^ 0x2D36;
        ShiftTapModule.E[0xD237 ^ 0xD349] = 0xD342 ^ 0xD349;
        ShiftTapModule.E[0xADC4 ^ 0xADB4] = 0xAD8C ^ 0xADB4;
        ShiftTapModule.E[0x512E ^ 0x5062] = 0xFFFF1AAA ^ 0x5062;
        ShiftTapModule.E[0x9A44 ^ 0x9B55] = 0xE056 ^ 0x9B55;
        ShiftTapModule.E[0x1885 ^ 0x1862] = 0x79A4 ^ 0x1862;
        ShiftTapModule.E[0x1E48 ^ 0x1F5C] = 0xC36D ^ 0x1F5C;
        ShiftTapModule.E[0x1D8B ^ 0x1DBC] = 0x1D9A ^ 0x1DBC;
        ShiftTapModule.E[0x198 ^ 0x1C4] = 0xFFFFFE4B ^ 0x1C4;
        ShiftTapModule.E[0x1B4D ^ 0x1A78] = 0xF703 ^ 0x1A78;
        ShiftTapModule.E[0x83D2 ^ 0x82FE] = 0xFFFF2592 ^ 0x82FE;
        ShiftTapModule.E[0x4908 ^ 0x480B] = 0x4DB8 ^ 0x480B;
        ShiftTapModule.E[0xE766 ^ 0xE627] = 0x5A4A ^ 0xE627;
        ShiftTapModule.E[0xCC76 ^ 0xCC2B] = 0xCC3B ^ 0xCC2B;
        ShiftTapModule.E[0xDED8 ^ 0xDE49] = 0xDE49 ^ 0xDE49;
        ShiftTapModule.E[0xD6DF ^ 0xD624] = 0x2577 ^ 0xD624;
        ShiftTapModule.E[0x6491 ^ 0x65A0] = 0x616C ^ 0x65A0;
        ShiftTapModule.E[0x38CB ^ 0x3846] = 0x3815 ^ 0x3846;
        ShiftTapModule.E[0x6FE1 ^ 0x6F3E] = 0x6133 ^ 0x6F3E;
        ShiftTapModule.E[0x243F ^ 0x2458] = 0xFFFFDBE3 ^ 0x2458;
        ShiftTapModule.E[0x1CB6 ^ 0x1DA1] = 0x7436 ^ 0x1DA1;
        ShiftTapModule.E[0xAD4C ^ 0xAD70] = 0xAD17 ^ 0xAD70;
        ShiftTapModule.E[0xD48D ^ 0xD475] = 0x1A68 ^ 0xD475;
        ShiftTapModule.E[0x186C ^ 0x18D4] = 0xEBE8 ^ 0x18D4;
        ShiftTapModule.E[0xDFA4 ^ 0xDFC8] = 0xFFFF2003 ^ 0xDFC8;
        ShiftTapModule.E[0x2061 ^ 0x204A] = 0xFFFFDF8A ^ 0x204A;
        ShiftTapModule.E[0xB818 ^ 0xB821] = 0xB871 ^ 0xB821;
        ShiftTapModule.E[0x562B ^ 0x562F] = 0xFFFFA9A9 ^ 0x562F;
        ShiftTapModule.E[0x2EEA ^ 0x2EAD] = 0x7DFC ^ 0x2EAD;
        ShiftTapModule.E[0x3B7C ^ 0x3B30] = 0x2E46 ^ 0x3B30;
        ShiftTapModule.E[0x9C2C ^ 0x9CBB] = 0xBB7B ^ 0x9CBB;
        ShiftTapModule.E[0x2891 ^ 0x2805] = 0x2805 ^ 0x2805;
        ShiftTapModule.E[0x6FBF ^ 0x6FB9] = 0xFFFF9047 ^ 0x6FB9;
        ShiftTapModule.E[0x7A1B ^ 0x7B16] = 0xBAA3 ^ 0x7B16;
        ShiftTapModule.E[0xFB58 ^ 0xFB1D] = 0xFB85 ^ 0xFB1D;
        ShiftTapModule.E[0xA74A ^ 0xA72E] = 0xFFFF58FE ^ 0xA72E;
        ShiftTapModule.E[0x754D ^ 0x7405] = 0x48BE ^ 0x7405;
        ShiftTapModule.E[0xC365 ^ 0xC2EA] = 0xC2B5 ^ 0xC2EA;
        ShiftTapModule.E[0x133E ^ 0x13D1] = 0x99D ^ 0x13D1;
        ShiftTapModule.E[0x56CE ^ 0x56A5] = 0xFFFFA926 ^ 0x56A5;
        ShiftTapModule.E[0xFC50 ^ 0xFCD5] = 0xFC92 ^ 0xFCD5;
        ShiftTapModule.E[0x28C0 ^ 0x2986] = 0x1508 ^ 0x2986;
        ShiftTapModule.E[0x6369 ^ 0x6382] = 0x47B9 ^ 0x6382;
        ShiftTapModule.E[0xE6D9 ^ 0xE66D] = 0xA5F4 ^ 0xE66D;
        ShiftTapModule.E[0xD43C ^ 0xD5BA] = 0xD5B4 ^ 0xD5BA;
        ShiftTapModule.E[0xEF7E ^ 0xEE02] = 0xEE04 ^ 0xEE02;
        ShiftTapModule.E[0x48ED ^ 0x4838] = 0xFFFFFCE8 ^ 0x4838;
        ShiftTapModule.E[0x28C7 ^ 0x28AE] = 0x28AD ^ 0x28AE;
        ShiftTapModule.E[0xE007 ^ 0xE08D] = 0xFFFF1F5E ^ 0xE08D;
        ShiftTapModule.E[0xBE74 ^ 0xBE4B] = 0xBE4B ^ 0xBE4B;
        ShiftTapModule.E[0x3F31 ^ 0x3E6B] = 0x3E6B ^ 0x3E6B;
        ShiftTapModule.E[0xCA4C ^ 0xCB26] = 0x2E53 ^ 0xCB26;
        ShiftTapModule.E[0xC489 ^ 0xC4FA] = 0xC4DE ^ 0xC4FA;
        ShiftTapModule.E[0x61C0 ^ 0x618D] = 0x68BB ^ 0x618D;
        ShiftTapModule.E[0xC88B ^ 0xC89E] = 0xC8E3 ^ 0xC89E;
        ShiftTapModule.E[0x7CEE ^ 0x7C69] = 0xFFFF83D6 ^ 0x7C69;
        ShiftTapModule.E[0x7026 ^ 0x7127] = 0xE5E7 ^ 0x7127;
        ShiftTapModule.E[0xACE4 ^ 0xADCC] = 0xFFFF9A2C ^ 0xADCC;
        ShiftTapModule.E[0x85EC ^ 0x8467] = 0xFFFF7BCC ^ 0x8467;
        ShiftTapModule.E[0x6649 ^ 0x666B] = 0xFFFF99C4 ^ 0x666B;
        ShiftTapModule.E[0x103E5 ^ 0x10287] = 0x18B01 ^ 0x10287;
        ShiftTapModule.E[0x103C0 ^ 0x10247] = 0x1027F ^ 0x10247;
        ShiftTapModule.E[0x4D42 ^ 0x4DE8] = 0x14BFA ^ 0x4DE8;
        ShiftTapModule.E[0x2AC3 ^ 0x2A00] = 0x775B ^ 0x2A00;
        ShiftTapModule.E[0x5658 ^ 0x567E] = 0xFFFFA9BE ^ 0x567E;
        ShiftTapModule.E[0xB906 ^ 0xB927] = 0xB979 ^ 0xB927;
        ShiftTapModule.E[0x7F9 ^ 0x7A1] = 0x7DC ^ 0x7A1;
        ShiftTapModule.E[0x6D94 ^ 0x6CC5] = 0x7C87 ^ 0x6CC5;
        ShiftTapModule.E[0x10CAC ^ 0x10C6B] = 0x937 ^ 0x10C6B;
        ShiftTapModule.E[0x675 ^ 0x6A4] = 0xCA6A ^ 0x6A4;
        ShiftTapModule.E[0x75C2 ^ 0x74CB] = 0x1E2B ^ 0x74CB;
        ShiftTapModule.E[0x3F19 ^ 0x3E78] = 0x17BC ^ 0x3E78;
        ShiftTapModule.E[0x1757 ^ 0x161D] = 0xA348 ^ 0x161D;
        ShiftTapModule.E[0x4326 ^ 0x4249] = 0x5F37 ^ 0x4249;
        ShiftTapModule.E[0x2B8C ^ 0x2BA1] = 0xFFFFD43E ^ 0x2BA1;
        ShiftTapModule.E[0xE628 ^ 0xE637] = 0xE647 ^ 0xE637;
        ShiftTapModule.E[0xA996 ^ 0xA960] = 0x6775 ^ 0xA960;
        ShiftTapModule.E[0x4F17 ^ 0x4FB8] = 0x3E9B ^ 0x4FB8;
        ShiftTapModule.E[0xA9B3 ^ 0xA8E6] = 0xAE08 ^ 0xA8E6;
        ShiftTapModule.E[0xD60C ^ 0xD676] = 0xFFFF29C4 ^ 0xD676;
        ShiftTapModule.E[0x8BB1 ^ 0x8B22] = 0x8B23 ^ 0x8B22;
        ShiftTapModule.E[0x3F49 ^ 0x3FA1] = 0xFFFFA1D4 ^ 0x3FA1;
        ShiftTapModule.E[0xCC14 ^ 0xCD1F] = 0xCAA ^ 0xCD1F;
        ShiftTapModule.E[0x10C5A ^ 0x10C49] = 0x10C28 ^ 0x10C49;
        ShiftTapModule.E[0x3002 ^ 0x307C] = 0x3059 ^ 0x307C;
        ShiftTapModule.E[0x1F87 ^ 0x1F27] = 0x8E26 ^ 0x1F27;
        ShiftTapModule.E[0x10CEC ^ 0x10CD1] = 0x10C9C ^ 0x10CD1;
        ShiftTapModule.E[0x79D8 ^ 0x7897] = 0x68D5 ^ 0x7897;
        ShiftTapModule.E[0xBB5E ^ 0xBBEE] = 0xCAC0 ^ 0xBBEE;
        ShiftTapModule.E[0x7D6A ^ 0x7DB8] = 0xB177 ^ 0x7DB8;
        ShiftTapModule.E[0x4F18 ^ 0x4E7C] = 0x2B7 ^ 0x4E7C;
        ShiftTapModule.E[0x1238 ^ 0x1366] = 0x1366 ^ 0x1366;
        ShiftTapModule.E[0xB109 ^ 0xB169] = 0xFFFF4EC1 ^ 0xB169;
        ShiftTapModule.E[0xB046 ^ 0xB050] = 0xB04D ^ 0xB050;
        ShiftTapModule.E[0xF32 ^ 0xE2F] = 0x10D9E ^ 0xE2F;
        ShiftTapModule.E[0xB7A5 ^ 0xB781] = 0xFFFF4829 ^ 0xB781;
        ShiftTapModule.E[0x9D77 ^ 0x9D02] = 0x9D6A ^ 0x9D02;
        ShiftTapModule.E[0xB71F ^ 0xB7AA] = 0xF46E ^ 0xB7AA;
        ShiftTapModule.E[0x5886 ^ 0x5884] = 0xFFFFA705 ^ 0x5884;
        ShiftTapModule.E[0x50CE ^ 0x5084] = 0xDC90 ^ 0x5084;
        ShiftTapModule.E[0xF79D ^ 0xF61C] = 0xFFFF09D4 ^ 0xF61C;
        ShiftTapModule.E[0xCDCA ^ 0xCDA7] = 0xCD8F ^ 0xCDA7;
        ShiftTapModule.E[0xD296 ^ 0xD3ED] = 0xD3FB ^ 0xD3ED;
        ShiftTapModule.E[0xC498 ^ 0xC444] = 0x23E7 ^ 0xC444;
        ShiftTapModule.E[0x9286 ^ 0x9208] = 0xFFFF6DDE ^ 0x9208;
        ShiftTapModule.E[0x4336 ^ 0x433A] = 0x4357 ^ 0x433A;
        ShiftTapModule.E[0x10C08 ^ 0x10D57] = 0x10D45 ^ 0x10D57;
        ShiftTapModule.E[0xCD11 ^ 0xCC26] = 0xDFCB ^ 0xCC26;
        ShiftTapModule.E[0xEF0E ^ 0xEE2E] = 0x1ED5 ^ 0xEE2E;
        ShiftTapModule.E[0x5D74 ^ 0x5DD0] = 0x716B ^ 0x5DD0;
        ShiftTapModule.E[0x3C24 ^ 0x3CB2] = 0xC48E ^ 0x3CB2;
        ShiftTapModule.E[0x1471 ^ 0x1516] = 0xD279 ^ 0x1516;
        ShiftTapModule.E[0xB998 ^ 0xB9C9] = 0x8634 ^ 0xB9C9;
        ShiftTapModule.E[0x24EB ^ 0x2472] = 0x3E4 ^ 0x2472;
        ShiftTapModule.E[0x2C9D ^ 0x2D13] = 0x2D1C ^ 0x2D13;
        ShiftTapModule.E[0x2E58 ^ 0x2EE2] = 0xDDDE ^ 0x2EE2;
        ShiftTapModule.E[0x8EF4 ^ 0x8ED7] = 0xFFFF713A ^ 0x8ED7;
        ShiftTapModule.E[0xDD86 ^ 0xDC8A] = 0xFFFFE2A3 ^ 0xDC8A;
        ShiftTapModule.E[0x2B45 ^ 0x2BE6] = 0x756 ^ 0x2BE6;
        ShiftTapModule.E[0x443E ^ 0x4489] = 0xB7B3 ^ 0x4489;
        ShiftTapModule.E[0xD3D1 ^ 0xD341] = 0xD343 ^ 0xD341;
        ShiftTapModule.E[0xC3E4 ^ 0xC333] = 0xC333 ^ 0xC333;
        ShiftTapModule.E[0xB888 ^ 0xB88B] = 0xB8E9 ^ 0xB88B;
        ShiftTapModule.E[0x3BE2 ^ 0x3B50] = 0x4A7E ^ 0x3B50;
        ShiftTapModule.E[0x54E ^ 0x554] = 0x50A ^ 0x554;
        ShiftTapModule.E[0xFC26 ^ 0xFD24] = 0xF88C ^ 0xFD24;
        ShiftTapModule.E[0x46BE ^ 0x4617] = 0x1401C ^ 0x4617;
        ShiftTapModule.E[0xB6FE ^ 0xB6E9] = 0xB6B4 ^ 0xB6E9;
        ShiftTapModule.E[0x8F52 ^ 0x8FD1] = 0xFFFF7004 ^ 0x8FD1;
        ShiftTapModule.E[0x920 ^ 0x966] = 0x72B6 ^ 0x966;
        ShiftTapModule.E[0xED8E ^ 0xEDD4] = 0xEDCD ^ 0xEDD4;
        ShiftTapModule.E[0x982D ^ 0x985A] = 0xFFFF67D6 ^ 0x985A;
        ShiftTapModule.E[0x24CE ^ 0x2434] = 0xD760 ^ 0x2434;
        ShiftTapModule.E[0x10C62 ^ 0x10D1D] = 0x10D54 ^ 0x10D1D;
        ShiftTapModule.E[0x8B0E ^ 0x8A14] = 0x189A1 ^ 0x8A14;
        ShiftTapModule.E[0xBEE7 ^ 0xBE6B] = 0xFFFF41EA ^ 0xBE6B;
        ShiftTapModule.E[0x5FD6 ^ 0x5FC6] = 0xFFFFA04C ^ 0x5FC6;
        ShiftTapModule.E[0x93EC ^ 0x92E6] = 0x534B ^ 0x92E6;
        ShiftTapModule.E[0xAF11 ^ 0xAF59] = 0x6C9A ^ 0xAF59;
        ShiftTapModule.E[0x80E3 ^ 0x818A] = 0x199E ^ 0x818A;
        ShiftTapModule.E[0x2FA9 ^ 0x2FD6] = 0xFFFFD057 ^ 0x2FD6;
        ShiftTapModule.E[0x2B5B ^ 0x2A23] = 0x2A21 ^ 0x2A23;
        ShiftTapModule.E[0x17B4 ^ 0x17CF] = 0x17AC ^ 0x17CF;
        ShiftTapModule.E[0xF1A8 ^ 0xF1C0] = 0xF1E8 ^ 0xF1C0;
        ShiftTapModule.E[0x944A ^ 0x951A] = 0x8559 ^ 0x951A;
        ShiftTapModule.E[0x7620 ^ 0x764F] = 0xFFFF89C7 ^ 0x764F;
        ShiftTapModule.E[0x29AD ^ 0x2983] = 0x29F1 ^ 0x2983;
        ShiftTapModule.E[0xEFA6 ^ 0xEE83] = 0x1196 ^ 0xEE83;
        ShiftTapModule.E[0x8A4 ^ 0x82C] = 0x82F ^ 0x82C;
        ShiftTapModule.E[0x5232 ^ 0x52D6] = 0xCAB4 ^ 0x52D6;
        ShiftTapModule.E[0xEB79 ^ 0xEBD5] = 0x5811 ^ 0xEBD5;
        ShiftTapModule.E[0xDE51 ^ 0xDFD8] = 0xDF95 ^ 0xDFD8;
        ShiftTapModule.E[0x265F ^ 0x2716] = 0x1B97 ^ 0x2716;
        ShiftTapModule.E[0x3D1A ^ 0x3C60] = 0x3C68 ^ 0x3C60;
        ShiftTapModule.E[0xC708 ^ 0xC707] = 0xFFFF38C1 ^ 0xC707;
        ShiftTapModule.E[0x8F76 ^ 0x8F32] = 0x8F32 ^ 0x8F32;
    }
}

