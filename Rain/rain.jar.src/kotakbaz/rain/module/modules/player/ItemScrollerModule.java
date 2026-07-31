/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import kotakbaz.rain.client.extensions.a_0;
import kotakbaz.rain.client.extensions.b;
import kotakbaz.rain.event.events.ClickSlotEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.SliderSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.glfw.GLFW;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"Lkotakbaz/rain/module/modules/player/ItemScrollerModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "Lkotakbaz/rain/event/events/ClickSlotEvent;", "event", "", "onClickSlot", "(Lkotakbaz/rain/event/events/ClickSlotEvent;)V", "", "delayMs", "()J", "", "isShiftDown", "()Z", "isCtrlDown", "", "keyCode", "isKeyDown", "(I)Z", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "delay", "Lkotakbaz/rain/module/setting/settings/SliderSetting;", "getDelay", "()Lkotakbaz/rain/module/setting/settings/SliderSetting;", "stop", "Z", "rain-visuals"})
public final class ItemScrollerModule
extends Module {
    @NotNull
    public static final ItemScrollerModule INSTANCE;
    @NotNull
    private static final SliderSetting a;
    private static boolean A;
    private static Object[] b;
    private static Object c;
    private static Object[] C;
    private static Object[] B;
    private static Object[] d;
    public static int[] D;

    private ItemScrollerModule() {
        int n2 = D[0];
        n2 -= D[1];
        int n3 = D[3];
        n3 ^= D[4];
        int n4 = D[6];
        n4 -= D[7];
        super((String)b[n2 += D[2]], a_0.getPLAYER(), (String)b[n3 -= D[5]] + (String)b[n4 ^= D[8]]);
    }

    @NotNull
    public final SliderSetting getDelay() {
        return a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Commando
    public final void onClickSlot(@NotNull ClickSlotEvent event) {
        int n2;
        long l2 = -6419818052852556791L;
        long l3 = 2431487999824152062L;
        long l4 = 5033004806979266114L;
        long l5 = 2299778006677216031L;
        long l6 = 1699763574250582270L;
        long l7 = 1094256512581780709L;
        int n3 = D[9];
        n3 -= D[10];
        Intrinsics.checkNotNullParameter(event, (String)b[n3 ^= D[11]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        ClientPlayerInteractionManager clientPlayerInteractionManager = kotakbaz.rain.client.extensions.b.getMc().interactionManager;
        if (clientPlayerInteractionManager == null) {
            return;
        }
        ClientPlayerInteractionManager clientPlayerInteractionManager2 = clientPlayerInteractionManager;
        ScreenHandler screenHandler = clientPlayerEntity2.currentScreenHandler;
        if (A) return;
        if (event.getSlotActionType() != SlotActionType.THROW) {
            return;
        }
        if (!this.isShiftDown()) return;
        if (!this.isCtrlDown()) {
            return;
        }
        int n4 = D[12];
        n4 ^= D[13];
        long l8 = l6;
        int n5 = D[15];
        n5 += D[16];
        l6 = l8 ^ ((long)((Collection)screenHandler.slots).size() << (n4 ^= D[14]) ^ l8) & -1L << (n5 -= D[17]);
        int n6 = D[18];
        n6 -= D[19];
        long l9 = l5;
        int n7 = D[21];
        n7 -= D[22];
        l5 = l9 ^ ((long)event.getSlot() << (n6 += D[20]) ^ l9) & -1L << (n7 -= D[23]);
        int n8 = D[24];
        n8 ^= D[25];
        int n9 = D[27];
        n9 -= D[28];
        if ((n8 ^= D[26]) <= (int)(l5 >>> (n9 += D[29]))) {
            int n10 = D[30];
            n10 += D[31];
            int n11 = D[33];
            n11 -= D[34];
            if ((int)(l5 >>> (n10 += D[32])) < (int)(l6 >>> (n11 -= D[35]))) {
                int n12 = D[36];
                n12 ^= D[37];
                n2 = n12 -= D[38];
            } else {
                int n13 = D[39];
                n13 += D[40];
                n2 = n13 -= D[41];
            }
        } else {
            int n14 = D[42];
            n14 += D[43];
            n2 = n14 ^= D[44];
        }
        if (n2 == 0) {
            return;
        }
        ItemStack itemStack = ((Slot)screenHandler.slots.get(event.getSlot())).getStack();
        if (itemStack.isEmpty()) {
            return;
        }
        int n15 = D[45];
        n15 -= D[46];
        A = n15 += D[47];
        try {
            Item item = itemStack.getItem();
            long l10 = l7;
            int n16 = D[48];
            n16 -= D[49];
            l7 = l10 ^ (0L ^ l10) & -1L >>> (n16 += D[50]);
            int n17 = D[51];
            n17 -= D[52];
            long l11 = l7;
            int n18 = D[54];
            n18 -= D[55];
            l7 = l11 ^ ((long)((Collection)screenHandler.slots).size() << (n17 ^= D[53]) ^ l11) & -1L << (n18 -= D[56]);
            while (true) {
                int n19 = D[57];
                n19 += D[58];
                if ((int)l7 < (int)(l7 >>> (n19 += D[59]))) {
                    if (Intrinsics.areEqual(((Slot)screenHandler.slots.get((int)l7)).getStack().getItem(), item)) {
                        int n20 = D[60];
                        n20 -= D[61];
                        clientPlayerInteractionManager2.clickSlot(screenHandler.syncId, (int)l7, n20 ^= D[62], SlotActionType.THROW, (PlayerEntity)clientPlayerEntity2);
                    }
                    long l12 = l7;
                    int n21 = D[63];
                    n21 -= D[64];
                    int n22 = D[66];
                    n22 -= D[67];
                    l7 = l12 ^ (l12 ^ l12 + (long)(n21 ^= D[65])) & -1L >>> (n22 ^= D[68]);
                    continue;
                }
                break;
            }
        }
        catch (Throwable throwable) {
            int n23 = D[72];
            n23 += D[73];
            A = n23 -= D[74];
            throw throwable;
        }
        int n24 = D[69];
        n24 += D[70];
        A = n24 -= D[71];
    }

    public final long delayMs() {
        return RangesKt.coerceAtLeast((long)((Number)a.getValue()).floatValue(), 0L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean isShiftDown() {
        int n2;
        int n3 = D[75];
        n3 += D[76];
        if (!this.isKeyDown(n3 ^= D[77])) {
            int n4 = D[78];
            n4 ^= D[79];
            if (!this.isKeyDown(n4 -= D[80])) {
                int n5 = D[84];
                n5 -= D[85];
                n2 = n5 ^= D[86];
                return n2 != 0;
            }
        }
        int n6 = D[81];
        n6 -= D[82];
        n2 = n6 += D[83];
        return n2 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final boolean isCtrlDown() {
        int n2;
        int n3 = D[87];
        n3 ^= D[88];
        if (!this.isKeyDown(n3 += D[89])) {
            int n4 = D[90];
            n4 -= D[91];
            if (!this.isKeyDown(n4 -= D[92])) {
                int n5 = D[96];
                n5 ^= D[97];
                n2 = n5 -= D[98];
                return n2 != 0;
            }
        }
        int n6 = D[93];
        n6 -= D[94];
        n2 = n6 ^= D[95];
        return n2 != 0;
    }

    private final boolean isKeyDown(int keyCode) {
        boolean bl;
        int n2 = D[99];
        n2 += D[100];
        if (GLFW.glfwGetKey((long)kotakbaz.rain.client.extensions.b.getMc().getWindow().getHandle(), (int)keyCode) == (n2 += D[101])) {
            boolean bl2 = D[102];
            bl2 ^= D[103];
            bl = bl2 ^= D[104];
        } else {
            boolean bl3 = D[105];
            bl3 -= D[106];
            bl = bl3 -= D[107];
        }
        return bl;
    }

    static {
        ItemScrollerModule.b();
        long l2 = -9182951452454723111L;
        long l3 = 7064382208283424818L;
        long l4 = 3303090443847153952L;
        long l5 = -3599284527477137938L;
        long l6 = -4302765509871795768L;
        long l7 = 651655055504213527L;
        long l8 = 6720183439288634529L;
        long l9 = -6176336545082836965L;
        long l10 = 2628034304733407947L;
        long l11 = -5577690702441614231L;
        long l12 = -3857889707092223128L;
        long l13 = -6416617938976490683L;
        long l14 = 963554813242564755L;
        long l15 = 3740236485164281051L;
        int n2 = D[108];
        n2 += D[109];
        b = new Object[n2 += D[110]];
        long l16 = l15;
        int n3 = D[111];
        n3 -= D[112];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= D[113]);
        Object[] objectArray = new Object[D[114]];
        objectArray[ItemScrollerModule.D[115]] = B;
        objectArray[ItemScrollerModule.D[116]] = D[117];
        int n4 = D[118];
        Object object = ItemScrollerModule.A()[D[119]];
        if (object == null) {
            char[] cArray = "\ub51f\ub533\ub540\ub51c\ub541\ub5ff\ub53d\ub544\ub507\ub502\ub52a\ub529\ub52c\ub509\ub52f\ub550\ub501\ub531\ub5fc\ub529\ub544\ub51c\ub50f\ub51c\ub541\ub549\ub533\ub544\ub53d\ub549\ub535\ub507\ub515\ub535\ub511\ub52e\ub535\ub517\ub50b\ub515\ub513\ub52c\ub50f\ub517\ub52c\ub518\ub51a\ub535\ub555\ub54e\ub51f\ub515\ub50a\ub50c\ub529\ub549\ub52b\ub522\ub540\ub549\ub537\ub50b\ub54d\ub536\ub535\ub542\ub50c\ub534\ub52c\ub5ff\ub53f\ub550\ub52b\ub50c\ub52d\ub555\ub542\ub523\ub510\ub51a\ub5fc\ub50c\ub531\ub50e\ub547\ub516\ub50d\ub543\ub534\ub529\ub5fc\ub520\ub521\ub510\ub52f\ub507\ub536\ub513\ub540\ub538\ub52a\ub53e\ub521\ub517\ub509\ub535\ub541\ub523\ub54d\ub504\ub50f\ub511\ub5ff\ub52c\ub52e\ub507\ub547\ub509\ub516\ub549\ub51e\ub549\ub529\ub536\ub547\ub523\ub510\ub52e\ub53a\ub524\ub550\ub50b\ub510\ub50e\ub51f\ub542\ub53f\ub510\ub540\ub50c\ub51a\ub5ff\ub541\ub5fc\ub542\ub51e\ub534\ub502\ub51a\ub537\ub53b\ub53b".toCharArray();
            for (int i2 = D[120]; i2 < D[121]; ++i2) {
                int n5 = cArray[i2];
                n5 += D[122];
                n5 -= D[123];
                n5 -= D[124];
                n5 += D[125];
                n5 ^= D[126];
                n5 += D[127];
                n5 += D[128];
                n5 ^= D[129];
                n5 -= D[130];
                n5 -= D[131];
                n5 -= D[132];
                cArray[i2] = (char)(n5 += D[133]);
            }
            object = ItemScrollerModule.A()[ItemScrollerModule.D[134]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ItemScrollerModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = D[135];
        n6 += D[136];
        l6 = l17 ^ (0x3C00000000L ^ l17) & -1L << (n6 += D[137]);
        long l18 = l13;
        int n7 = D[138];
        n7 ^= D[139];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 -= D[140]);
        while (true) {
            int n8 = D[141];
            n8 += D[142];
            if ((int)l13 >= (int)(l6 >>> (n8 -= D[143]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = D[144];
            n10 ^= D[145];
            int n11 = D[147];
            n11 ^= D[148];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += D[146])) & -1L >>> (n11 -= D[149]);
            long l20 = l9;
            int n12 = D[150];
            n12 ^= D[151];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 -= D[152]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = D[153];
            n14 += D[154];
            int n15 = D[156];
            n15 += D[157];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 -= D[155])) & -1L >>> (n15 -= D[158]);
            int n16 = D[159];
            n16 -= D[160];
            long l22 = l10;
            int n17 = D[162];
            n17 ^= D[163];
            l10 = l22 ^ ((long)cArray[n13] << (n16 ^= D[161]) ^ l22) & -1L << (n17 -= D[164]);
            int n18 = D[165];
            n18 -= D[166];
            n18 ^= D[167];
            int n19 = D[168];
            n19 -= D[169];
            long l23 = l12;
            int n20 = D[171];
            n20 += D[172];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 += D[170]))) ^ l23) & -1L >>> (n20 ^= D[173]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = D[174];
            n21 -= D[175];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= D[176]);
            while (true) {
                int n22 = D[177];
                n22 ^= D[178];
                if ((int)(l14 >>> (n22 ^= D[179])) >= (int)l12) break;
                int n23 = D[180];
                n23 -= D[181];
                int n24 = D[183];
                n24 -= D[184];
                cArray2[(int)(l14 >>> (n23 -= ItemScrollerModule.D[182]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= D[185]))];
                l14 += 0x100000000L;
            }
            int n25 = D[186];
            n25 += D[187];
            int n26 = (int)(l15 >>> (n25 -= D[188]));
            l15 += 0x100000000L;
            ItemScrollerModule.b[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = D[189];
            n27 += D[190];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= D[191]);
        }
        INSTANCE = new ItemScrollerModule();
        int n28 = D[192];
        n28 -= D[193];
        a = INSTANCE.slider((String)b[n28 ^= D[194]], 40.0f, 0.0f, 200.0f, 5.0f);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[D[195]];
        String string = (String)object[D[196]];
        object = object[D[197]];
        Object[] objectArray = C;
        if (C == null) {
            objectArray = C = new Object[D[198]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[D[199]];
                B = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[D[201] ^ D[202]];
                byArray[ItemScrollerModule.D[203] ^ ItemScrollerModule.D[204]] = D[205] ^ D[206];
                byArray[ItemScrollerModule.D[207] ^ ItemScrollerModule.D[208]] = D[209] ^ D[210];
                byArray[ItemScrollerModule.D[211] ^ ItemScrollerModule.D[212]] = D[213] ^ D[214];
                byArray[ItemScrollerModule.D[215] ^ ItemScrollerModule.D[216]] = D[217] ^ D[218];
                byArray[ItemScrollerModule.D[219] ^ ItemScrollerModule.D[220]] = D[221] ^ D[222];
                byArray[ItemScrollerModule.D[223] ^ ItemScrollerModule.D[224]] = D[225] ^ D[226];
                byArray[ItemScrollerModule.D[227] ^ ItemScrollerModule.D[228]] = D[229] ^ D[230];
                byArray[ItemScrollerModule.D[231] ^ ItemScrollerModule.D[232]] = D[233] ^ D[234];
                byArray[ItemScrollerModule.D[235] ^ ItemScrollerModule.D[236]] = D[237] ^ D[238];
                byArray[ItemScrollerModule.D[239] ^ ItemScrollerModule.D[240]] = D[241] ^ D[242];
                byArray[ItemScrollerModule.D[243] ^ ItemScrollerModule.D[244]] = D[245] ^ D[246];
                byArray[ItemScrollerModule.D[247] ^ ItemScrollerModule.D[248]] = D[249] ^ D[250];
                byArray[ItemScrollerModule.D[251] ^ ItemScrollerModule.D[252]] = D[253] ^ D[254];
                byArray[ItemScrollerModule.D[255] ^ ItemScrollerModule.D[256]] = D[257] ^ D[258];
                byArray[ItemScrollerModule.D[259] ^ ItemScrollerModule.D[260]] = D[261] ^ D[262];
                byArray[ItemScrollerModule.D[263] ^ ItemScrollerModule.D[264]] = D[265] ^ D[266];
                objectArray2[ItemScrollerModule.D[200]] = byArray;
            }
            byte[] byArray = (byte[])object3[D[267]];
            if (c == null) {
                byte[] byArray2 = new byte[D[268] ^ D[269]];
                byArray2[ItemScrollerModule.D[270] ^ ItemScrollerModule.D[271]] = D[272] ^ D[273];
                byArray2[ItemScrollerModule.D[274] ^ ItemScrollerModule.D[275]] = D[276] ^ D[277];
                byArray2[ItemScrollerModule.D[278] ^ ItemScrollerModule.D[279]] = D[280] ^ D[281];
                byArray2[ItemScrollerModule.D[282] ^ ItemScrollerModule.D[283]] = D[284] ^ D[285];
                byArray2[ItemScrollerModule.D[286] ^ ItemScrollerModule.D[287]] = D[288] ^ D[289];
                byArray2[ItemScrollerModule.D[290] ^ ItemScrollerModule.D[291]] = D[292] ^ D[293];
                byArray2[ItemScrollerModule.D[294] ^ ItemScrollerModule.D[295]] = D[296] ^ D[297];
                byArray2[ItemScrollerModule.D[298] ^ ItemScrollerModule.D[299]] = D[300] ^ D[301];
                byArray2[ItemScrollerModule.D[302] ^ ItemScrollerModule.D[303]] = D[304] ^ D[305];
                byArray2[ItemScrollerModule.D[306] ^ ItemScrollerModule.D[307]] = D[308] ^ D[309];
                byArray2[ItemScrollerModule.D[310] ^ ItemScrollerModule.D[311]] = D[312] ^ D[313];
                byArray2[ItemScrollerModule.D[314] ^ ItemScrollerModule.D[315]] = D[316] ^ D[317];
                byArray2[ItemScrollerModule.D[318] ^ ItemScrollerModule.D[319]] = D[320] ^ D[321];
                byArray2[ItemScrollerModule.D[322] ^ ItemScrollerModule.D[323]] = D[324] ^ D[325];
                byArray2[ItemScrollerModule.D[326] ^ ItemScrollerModule.D[327]] = D[328] ^ D[329];
                byArray2[ItemScrollerModule.D[330] ^ ItemScrollerModule.D[331]] = D[332] ^ D[333];
                byArray2[ItemScrollerModule.D[334] ^ ItemScrollerModule.D[335]] = D[336] ^ D[337];
                byArray2[ItemScrollerModule.D[338] ^ ItemScrollerModule.D[339]] = D[340] ^ D[341];
                byArray2[ItemScrollerModule.D[342] ^ ItemScrollerModule.D[343]] = D[344] ^ D[345];
                byArray2[ItemScrollerModule.D[346] ^ ItemScrollerModule.D[347]] = D[348] ^ D[349];
                byArray2[ItemScrollerModule.D[350] ^ ItemScrollerModule.D[351]] = D[352] ^ D[353];
                byArray2[ItemScrollerModule.D[354] ^ ItemScrollerModule.D[355]] = D[356] ^ D[357];
                byArray2[ItemScrollerModule.D[358] ^ ItemScrollerModule.D[359]] = D[360] ^ D[361];
                byArray2[ItemScrollerModule.D[362] ^ ItemScrollerModule.D[363]] = D[364] ^ D[365];
                byArray2[ItemScrollerModule.D[366] ^ ItemScrollerModule.D[367]] = D[368] ^ D[369];
                byArray2[ItemScrollerModule.D[370] ^ ItemScrollerModule.D[371]] = D[372] ^ D[373];
                byArray2[ItemScrollerModule.D[374] ^ ItemScrollerModule.D[375]] = D[376] ^ D[377];
                byArray2[ItemScrollerModule.D[378] ^ ItemScrollerModule.D[379]] = D[380] ^ D[381];
                byArray2[ItemScrollerModule.D[382] ^ ItemScrollerModule.D[383]] = D[384] ^ D[385];
                byArray2[ItemScrollerModule.D[386] ^ ItemScrollerModule.D[387]] = D[388] ^ D[389];
                byArray2[ItemScrollerModule.D[390] ^ ItemScrollerModule.D[391]] = D[392] ^ D[393];
                byArray2[ItemScrollerModule.D[394] ^ ItemScrollerModule.D[395]] = D[396] ^ D[397];
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, D[398], byArray3, D[399], byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ItemScrollerModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u146c\u2a1a\u1463\u2a00\u2a1e\u2a0a\u146f\u1445\u1470\u1444\u1464\u1449\u147d\u147b\u146b\u1464\u2a1d\u2a0d".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0x4AD0;
                        n3 -= 9377;
                        n3 -= 58145;
                        n3 ^= 0xCF04;
                        n3 ^= 0xA1F6;
                        n3 -= 14040;
                        n3 -= 40474;
                        n3 += 16299;
                        n3 += 62892;
                        cArray[i2] = (char)(n3 -= 38941);
                    }
                    object4 = ItemScrollerModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[5] = 14;
                byArray4[4] = 64;
                byArray4[11] = 51;
                byArray4[10] = -83;
                byArray4[8] = 74;
                byArray4[9] = -114;
                byArray4[7] = -77;
                byArray4[13] = 2;
                byArray4[2] = 123;
                byArray4[1] = -63;
                byArray4[15] = 117;
                byArray4[14] = 1;
                byArray4[3] = -94;
                byArray4[0] = -111;
                byArray4[12] = -83;
                byArray4[6] = -10;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 22, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ItemScrollerModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\udaa1\udaa5\uda8f".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 ^= 0xC2;
                        n4 ^= 0x42C4;
                        n4 += 33445;
                        n4 += 25579;
                        n4 ^= 0xB36B;
                        n4 -= 61196;
                        n4 ^= 0xB58C;
                        n4 += 3024;
                        n4 ^= 0x22B1;
                        n4 += 55733;
                        n4 += 63703;
                        n4 += 61944;
                        n4 += 6042;
                        cArray[i3] = (char)(n4 ^= 0x327A);
                    }
                    object5 = ItemScrollerModule.A()[2] = new String(cArray);
                }
                c = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ItemScrollerModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\ud1ef\ud2c3\ud2d5\ud1e1\ud2c5\ud2c6\ud2c5\ud1e1\ud2c0\ud2bd\ud2c5\ud2d5\ud1f3\ud2c0\ud2cf\ucca4\ucca4\ucca7\ucca2\ucca9".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 37121;
                    n5 -= 22817;
                    n5 += 19463;
                    n5 -= 55563;
                    n5 += 11083;
                    n5 ^= 0xAD8C;
                    n5 += 560;
                    n5 -= 12944;
                    n5 ^= 0xD53;
                    n5 ^= 0x7EF7;
                    n5 ^= 0xB67D;
                    n5 ^= 0x53E;
                    cArray[i4] = (char)(n5 -= 15262);
                }
                object6 = ItemScrollerModule.A()[3] = new String(cArray);
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
        D = new int[0xE478 ^ 0xE5E8];
        ItemScrollerModule.D[0xA068 ^ 0xA10C] = 0xFFFF7D39 ^ 0xA10C;
        ItemScrollerModule.D[0x8098 ^ 0x8194] = 0x6728 ^ 0x8194;
        ItemScrollerModule.D[0x3572 ^ 0x3479] = 0x3479 ^ 0x3479;
        ItemScrollerModule.D[0xD706 ^ 0xD7CB] = 0xFFFE2D49 ^ 0xD7CB;
        ItemScrollerModule.D[0xA222 ^ 0xA324] = 0xC96D ^ 0xA324;
        ItemScrollerModule.D[0x5D88 ^ 0x5D35] = 0xFFFFA246 ^ 0x5D35;
        ItemScrollerModule.D[0x10561 ^ 0x10458] = 0x10808 ^ 0x10458;
        ItemScrollerModule.D[0x1867 ^ 0x1815] = 0x1816 ^ 0x1815;
        ItemScrollerModule.D[0x4BD1 ^ 0x4B18] = 0xDF2 ^ 0x4B18;
        ItemScrollerModule.D[0x2579 ^ 0x258D] = 0x6181 ^ 0x258D;
        ItemScrollerModule.D[0x7E39 ^ 0x7E5B] = 0xFFFF81AA ^ 0x7E5B;
        ItemScrollerModule.D[0x892A ^ 0x8951] = 0xDAE3 ^ 0x8951;
        ItemScrollerModule.D[0x16BA ^ 0x163D] = 0xFFFFE9F0 ^ 0x163D;
        ItemScrollerModule.D[0xBC26 ^ 0xBD4E] = 0x8D45 ^ 0xBD4E;
        ItemScrollerModule.D[0x6BEF ^ 0x6A6A] = 0x129C ^ 0x6A6A;
        ItemScrollerModule.D[0x5691 ^ 0x56A4] = 0x5688 ^ 0x56A4;
        ItemScrollerModule.D[0x399 ^ 0x3FA] = 0x3CE ^ 0x3FA;
        ItemScrollerModule.D[0x22A4 ^ 0x2259] = 0x87C0 ^ 0x2259;
        ItemScrollerModule.D[0xABD ^ 0xA71] = 0x10F7F ^ 0xA71;
        ItemScrollerModule.D[0x840C ^ 0x8411] = 0xFFFF7BFC ^ 0x8411;
        ItemScrollerModule.D[0x6945 ^ 0x682F] = 0x213F ^ 0x682F;
        ItemScrollerModule.D[0x4CC ^ 0x5A0] = 0x4CA1 ^ 0x5A0;
        ItemScrollerModule.D[0xD26C ^ 0xD20A] = 0xFFFF2DD0 ^ 0xD20A;
        ItemScrollerModule.D[0xBF2B ^ 0xBF4F] = 0xBF55 ^ 0xBF4F;
        ItemScrollerModule.D[0x6939 ^ 0x69AF] = 0xFFFF960A ^ 0x69AF;
        ItemScrollerModule.D[0x106D9 ^ 0x10626] = 0x1F004 ^ 0x10626;
        ItemScrollerModule.D[0x3FB0 ^ 0x3E83] = 0x2F16 ^ 0x3E83;
        ItemScrollerModule.D[0x4DB4 ^ 0x4D34] = 0xDFBC ^ 0x4D34;
        ItemScrollerModule.D[0x65AA ^ 0x6480] = 0x6780 ^ 0x6480;
        ItemScrollerModule.D[0xF414 ^ 0xF468] = 0x451B ^ 0xF468;
        ItemScrollerModule.D[0x109FC ^ 0x1096B] = 0xFFFEF6E1 ^ 0x1096B;
        ItemScrollerModule.D[0x5BAA ^ 0x5AE1] = 0xB591 ^ 0x5AE1;
        ItemScrollerModule.D[0x48F7 ^ 0x4884] = 0x4884 ^ 0x4884;
        ItemScrollerModule.D[0x84AB ^ 0x8452] = 0xFFFFB5EE ^ 0x8452;
        ItemScrollerModule.D[0xAE97 ^ 0xAE3C] = 0xFFFF517F ^ 0xAE3C;
        ItemScrollerModule.D[0x6E77 ^ 0x6E44] = 0xFFFF91ED ^ 0x6E44;
        ItemScrollerModule.D[0x72FA ^ 0x720C] = 0x3600 ^ 0x720C;
        ItemScrollerModule.D[0xB04E ^ 0xB091] = 0x58DF ^ 0xB091;
        ItemScrollerModule.D[0xC102 ^ 0xC14D] = 0xC118 ^ 0xC14D;
        ItemScrollerModule.D[0x572B ^ 0x5747] = 0x578D ^ 0x5747;
        ItemScrollerModule.D[0x6568 ^ 0x644F] = 0xBD35 ^ 0x644F;
        ItemScrollerModule.D[0xE1E2 ^ 0xE09F] = 0x8BB2 ^ 0xE09F;
        ItemScrollerModule.D[0xE4A3 ^ 0xE439] = 0xE41A ^ 0xE439;
        ItemScrollerModule.D[0x414E ^ 0x4137] = 0x41AF ^ 0x4137;
        ItemScrollerModule.D[0xABE4 ^ 0xABB8] = 0xFFFF541B ^ 0xABB8;
        ItemScrollerModule.D[0xE2BB ^ 0xE227] = 0xFFFF1D63 ^ 0xE227;
        ItemScrollerModule.D[0x48C ^ 0x426] = 0x45E ^ 0x426;
        ItemScrollerModule.D[0x6DEA ^ 0x6C61] = 0x27FA ^ 0x6C61;
        ItemScrollerModule.D[0x2EC3 ^ 0x2E78] = 0x2E08 ^ 0x2E78;
        ItemScrollerModule.D[0x804A ^ 0x8119] = 0x2FE8 ^ 0x8119;
        ItemScrollerModule.D[0x3C53 ^ 0x3C10] = 0xFFFFC399 ^ 0x3C10;
        ItemScrollerModule.D[0xE0E9 ^ 0xE079] = 0xE00F ^ 0xE079;
        ItemScrollerModule.D[0x1DE1 ^ 0x1D3A] = 0xE4E3 ^ 0x1D3A;
        ItemScrollerModule.D[0x42C1 ^ 0x426C] = 0xFFFFBDE4 ^ 0x426C;
        ItemScrollerModule.D[0x4AA3 ^ 0x4A41] = 0xA201 ^ 0x4A41;
        ItemScrollerModule.D[0xAFF9 ^ 0xAE98] = 0x486E ^ 0xAE98;
        ItemScrollerModule.D[0x9500 ^ 0x9530] = 0x953B ^ 0x9530;
        ItemScrollerModule.D[0xC58F ^ 0xC511] = 0xFFFF3A99 ^ 0xC511;
        ItemScrollerModule.D[0x323E ^ 0x3297] = 0xFFFFCD6D ^ 0x3297;
        ItemScrollerModule.D[0x6BF9 ^ 0x6B20] = 0x16BA6 ^ 0x6B20;
        ItemScrollerModule.D[0x34FE ^ 0x3438] = 0x3439 ^ 0x3438;
        ItemScrollerModule.D[0x5D5C ^ 0x5DF9] = 0xFFFFA212 ^ 0x5DF9;
        ItemScrollerModule.D[0xB16C ^ 0xB169] = 0xB122 ^ 0xB169;
        ItemScrollerModule.D[0x2AD4 ^ 0x2BD6] = 0xDDF1 ^ 0x2BD6;
        ItemScrollerModule.D[0x288B ^ 0x285A] = 0xFFFF1F9F ^ 0x285A;
        ItemScrollerModule.D[0x5490 ^ 0x55B1] = 0x2217 ^ 0x55B1;
        ItemScrollerModule.D[0xD56 ^ 0xC48] = 0x7BF1 ^ 0xC48;
        ItemScrollerModule.D[0x8265 ^ 0x8227] = 0xFFFF7DC1 ^ 0x8227;
        ItemScrollerModule.D[0x24E1 ^ 0x242E] = 0xEC42 ^ 0x242E;
        ItemScrollerModule.D[0xDC7D ^ 0xDD7E] = 0xB738 ^ 0xDD7E;
        ItemScrollerModule.D[0x35C2 ^ 0x35AC] = 0xFFFFCA08 ^ 0x35AC;
        ItemScrollerModule.D[0xE8A8 ^ 0xE9B0] = 0xFFFFA0EA ^ 0xE9B0;
        ItemScrollerModule.D[0xB8A2 ^ 0xB9A8] = 0xA58B ^ 0xB9A8;
        ItemScrollerModule.D[0xD3C5 ^ 0xD39D] = 0xD39D ^ 0xD39D;
        ItemScrollerModule.D[0x61DD ^ 0x60F5] = 0xFFFF467E ^ 0x60F5;
        ItemScrollerModule.D[0x7590 ^ 0x75D6] = 0x75EE ^ 0x75D6;
        ItemScrollerModule.D[0xFDF6 ^ 0xFD74] = 0xF418 ^ 0xFD74;
        ItemScrollerModule.D[0x383C ^ 0x3801] = 0xFFFFC7DD ^ 0x3801;
        ItemScrollerModule.D[0x2ED5 ^ 0x2EE2] = 0x2EC0 ^ 0x2EE2;
        ItemScrollerModule.D[0xE0E2 ^ 0xE027] = 0xE027 ^ 0xE027;
        ItemScrollerModule.D[0xA631 ^ 0xA6EF] = 0x5F3C ^ 0xA6EF;
        ItemScrollerModule.D[0x3373 ^ 0x330E] = 0x7A ^ 0x330E;
        ItemScrollerModule.D[0x2C89 ^ 0x2D9E] = 0x9B12 ^ 0x2D9E;
        ItemScrollerModule.D[0x105B6 ^ 0x104DD] = 0x14DC1 ^ 0x104DD;
        ItemScrollerModule.D[0x38B4 ^ 0x393E] = 0x72A8 ^ 0x393E;
        ItemScrollerModule.D[0x57E4 ^ 0x579B] = 0x7DAE ^ 0x579B;
        ItemScrollerModule.D[0xF1A0 ^ 0xF155] = 0xB562 ^ 0xF155;
        ItemScrollerModule.D[0x3432 ^ 0x34D2] = 0xDC92 ^ 0x34D2;
        ItemScrollerModule.D[0xB560 ^ 0xB58B] = 0x415B ^ 0xB58B;
        ItemScrollerModule.D[0x6922 ^ 0x6866] = 0x9976 ^ 0x6866;
        ItemScrollerModule.D[0xCC8C ^ 0xCC9C] = 0xFFFF3363 ^ 0xCC9C;
        ItemScrollerModule.D[0x620 ^ 0x63B] = 0x67E ^ 0x63B;
        ItemScrollerModule.D[0x319B ^ 0x311D] = 0x311D ^ 0x311D;
        ItemScrollerModule.D[0xCF08 ^ 0xCFB2] = 0xFFFF3076 ^ 0xCFB2;
        ItemScrollerModule.D[0x2D7C ^ 0x2DD8] = 0xFFFFD269 ^ 0x2DD8;
        ItemScrollerModule.D[0xDDB7 ^ 0xDDF9] = 0xDC0D ^ 0xDDF9;
        ItemScrollerModule.D[0x591D ^ 0x5942] = 0x594F ^ 0x5942;
        ItemScrollerModule.D[0x4C9C ^ 0x4D92] = 0x98A4 ^ 0x4D92;
        ItemScrollerModule.D[0xB12B ^ 0xB163] = 0xFFFF4EAB ^ 0xB163;
        ItemScrollerModule.D[0xFE6D ^ 0xFE72] = 0xFFFF01E1 ^ 0xFE72;
        ItemScrollerModule.D[0xB8B4 ^ 0xB860] = 0xFFE5 ^ 0xB860;
        ItemScrollerModule.D[0x9DD9 ^ 0x9DAF] = 0x9DAD ^ 0x9DAF;
        ItemScrollerModule.D[0x10937 ^ 0x10817] = 0x17FD0 ^ 0x10817;
        ItemScrollerModule.D[0x6B7A ^ 0x6AF2] = 0xFFFF74F0 ^ 0x6AF2;
        ItemScrollerModule.D[0x133D ^ 0x1355] = 0xFFFFECE7 ^ 0x1355;
        ItemScrollerModule.D[0xE53B ^ 0xE414] = 0x9008 ^ 0xE414;
        ItemScrollerModule.D[0x6CE9 ^ 0x6DA8] = 0x3E76 ^ 0x6DA8;
        ItemScrollerModule.D[0x5AE2 ^ 0x5AE1] = 0xFFFFA504 ^ 0x5AE1;
        ItemScrollerModule.D[0xC465 ^ 0xC55D] = 0xC906 ^ 0xC55D;
        ItemScrollerModule.D[0xDF41 ^ 0xDF9C] = 0x2620 ^ 0xDF9C;
        ItemScrollerModule.D[0x1920 ^ 0x1961] = 0x1969 ^ 0x1961;
        ItemScrollerModule.D[0xEA17 ^ 0xEB75] = 0xC8D6 ^ 0xEB75;
        ItemScrollerModule.D[0xE754 ^ 0xE74C] = 0xE767 ^ 0xE74C;
        ItemScrollerModule.D[0xD0C0 ^ 0xD0A5] = 0xFFFF2F16 ^ 0xD0A5;
        ItemScrollerModule.D[0x10AC3 ^ 0x10BD1] = 0x1B7E0 ^ 0x10BD1;
        ItemScrollerModule.D[0x153D ^ 0x156A] = 0x14E7 ^ 0x156A;
        ItemScrollerModule.D[0x561 ^ 0x5C6] = 0xFFFFFA64 ^ 0x5C6;
        ItemScrollerModule.D[0xC30C ^ 0xC346] = 0xFFFF3CBC ^ 0xC346;
        ItemScrollerModule.D[0xEF83 ^ 0xEE01] = 0x96EE ^ 0xEE01;
        ItemScrollerModule.D[0x3B94 ^ 0x3B86] = 0x3B02 ^ 0x3B86;
        ItemScrollerModule.D[0x718F ^ 0x70D1] = 0x9627 ^ 0x70D1;
        ItemScrollerModule.D[0xF581 ^ 0xF53D] = 0xF529 ^ 0xF53D;
        ItemScrollerModule.D[0x4F40 ^ 0x4F78] = 0x4F42 ^ 0x4F78;
        ItemScrollerModule.D[0x9C4B ^ 0x9D5F] = 0x2138 ^ 0x9D5F;
        ItemScrollerModule.D[0x87FA ^ 0x86CF] = 0x975A ^ 0x86CF;
        ItemScrollerModule.D[0x6515 ^ 0x6405] = 0xB16F ^ 0x6405;
        ItemScrollerModule.D[0x5FD1 ^ 0x5F1B] = 0x19E1 ^ 0x5F1B;
        ItemScrollerModule.D[0x3F9A ^ 0x3FD3] = 0x3FE1 ^ 0x3FD3;
        ItemScrollerModule.D[0x3108 ^ 0x304D] = 0xC14C ^ 0x304D;
        ItemScrollerModule.D[0x2E38 ^ 0x2F03] = 0x5C42 ^ 0x2F03;
        ItemScrollerModule.D[0x71D3 ^ 0x7091] = 0x818D ^ 0x7091;
        ItemScrollerModule.D[0xF250 ^ 0xF25D] = 0xFFFF0D94 ^ 0xF25D;
        ItemScrollerModule.D[0x2CF9 ^ 0x2C0A] = 0x680B ^ 0x2C0A;
        ItemScrollerModule.D[0xE487 ^ 0xE4EE] = 0xFFFF1B22 ^ 0xE4EE;
        ItemScrollerModule.D[0xCB38 ^ 0xCB6B] = 0xFFFF34BA ^ 0xCB6B;
        ItemScrollerModule.D[0x6C2D ^ 0x6D4A] = 0x5D58 ^ 0x6D4A;
        ItemScrollerModule.D[0x8CE8 ^ 0x8DBA] = 0x2357 ^ 0x8DBA;
        ItemScrollerModule.D[0xFDB4 ^ 0xFDC4] = 0xFFFF0221 ^ 0xFDC4;
        ItemScrollerModule.D[0xD099 ^ 0xD0E3] = 0x553 ^ 0xD0E3;
        ItemScrollerModule.D[0xF4EC ^ 0xF58A] = 0xC590 ^ 0xF58A;
        ItemScrollerModule.D[0xBAD3 ^ 0xBBA4] = 0x5103 ^ 0xBBA4;
        ItemScrollerModule.D[0x2C9B ^ 0x2CBE] = 0x2CCB ^ 0x2CBE;
        ItemScrollerModule.D[0x9E7 ^ 0x987] = 0xFFFFF65A ^ 0x987;
        ItemScrollerModule.D[0x54C5 ^ 0x5444] = 0x5DBD ^ 0x5444;
        ItemScrollerModule.D[0xA57D ^ 0xA407] = 0xCF30 ^ 0xA407;
        ItemScrollerModule.D[0xFA1E ^ 0xFA47] = 0xFFFF058F ^ 0xFA47;
        ItemScrollerModule.D[0xA341 ^ 0xA21D] = 0xEC65 ^ 0xA21D;
        ItemScrollerModule.D[0x4810 ^ 0x4885] = 0x48B2 ^ 0x4885;
        ItemScrollerModule.D[0x2217 ^ 0x2361] = 0xC9C9 ^ 0x2361;
        ItemScrollerModule.D[0x327D ^ 0x32AE] = 0x7520 ^ 0x32AE;
        ItemScrollerModule.D[0xE66B ^ 0xE705] = 0xE11 ^ 0xE705;
        ItemScrollerModule.D[0x90DB ^ 0x9051] = 0x901C ^ 0x9051;
        ItemScrollerModule.D[0xE960 ^ 0xE95A] = 0xE96A ^ 0xE95A;
        ItemScrollerModule.D[0x1AC3 ^ 0x1A5E] = 0x1A3A ^ 0x1A5E;
        ItemScrollerModule.D[0x7CF1 ^ 0x7C53] = 0x7C14 ^ 0x7C53;
        ItemScrollerModule.D[0xEA34 ^ 0xEB0B] = 0xB8D5 ^ 0xEB0B;
        ItemScrollerModule.D[0x7CF ^ 0x777] = 0x725 ^ 0x777;
        ItemScrollerModule.D[0xDA79 ^ 0xDACD] = 0xDACC ^ 0xDACD;
        ItemScrollerModule.D[0x100F7 ^ 0x10185] = 0x1E78F ^ 0x10185;
        ItemScrollerModule.D[0x8727 ^ 0x8654] = 0x605B ^ 0x8654;
        ItemScrollerModule.D[0x10194 ^ 0x101A8] = 0xFFFEFE08 ^ 0x101A8;
        ItemScrollerModule.D[0x6998 ^ 0x69BC] = 0x6994 ^ 0x69BC;
        ItemScrollerModule.D[0x8D97 ^ 0x8CA6] = 0xF8BA ^ 0x8CA6;
        ItemScrollerModule.D[0x1A5E ^ 0x1BD1] = 0x1BD1 ^ 0x1BD1;
        ItemScrollerModule.D[0xBECB ^ 0xBEF5] = 0xFFFF4130 ^ 0xBEF5;
        ItemScrollerModule.D[0x4AE1 ^ 0x4B84] = 0x682E ^ 0x4B84;
        ItemScrollerModule.D[0xFB52 ^ 0xFB50] = 0xFFFF04ED ^ 0xFB50;
        ItemScrollerModule.D[0xA8B8 ^ 0xA85D] = 0x5D46 ^ 0xA85D;
        ItemScrollerModule.D[0x3FED ^ 0x3EE0] = 0xD87C ^ 0x3EE0;
        ItemScrollerModule.D[0x10A88 ^ 0x10A26] = 0x10ABF ^ 0x10A26;
        ItemScrollerModule.D[0x819C ^ 0x8166] = 0x4F19 ^ 0x8166;
        ItemScrollerModule.D[0x790B ^ 0x7912] = 0xFFFF8688 ^ 0x7912;
        ItemScrollerModule.D[0x7DF ^ 0x6A1] = 0x44B4 ^ 0x6A1;
        ItemScrollerModule.D[0x5DE5 ^ 0x5DA9] = 0x5D88 ^ 0x5DA9;
        ItemScrollerModule.D[0xD4A5 ^ 0xD5FD] = 0x7B60 ^ 0xD5FD;
        ItemScrollerModule.D[0xA89C ^ 0xA81F] = 0x4022 ^ 0xA81F;
        ItemScrollerModule.D[0xC8BE ^ 0xC81F] = 0xC820 ^ 0xC81F;
        ItemScrollerModule.D[0xC168 ^ 0xC056] = 0x9389 ^ 0xC056;
        ItemScrollerModule.D[0x3A7E ^ 0x3ABA] = 0x3AB8 ^ 0x3ABA;
        ItemScrollerModule.D[0x799B ^ 0x7972] = 0xFFFF2843 ^ 0x7972;
        ItemScrollerModule.D[0x6C66 ^ 0x6C49] = 0xFFFF93CC ^ 0x6C49;
        ItemScrollerModule.D[0xF498 ^ 0xF403] = 0xFFFF0BD6 ^ 0xF403;
        ItemScrollerModule.D[0x7E84 ^ 0x7E54] = 0xB63E ^ 0x7E54;
        ItemScrollerModule.D[0xCCA4 ^ 0xCCC5] = 0xCCE9 ^ 0xCCC5;
        ItemScrollerModule.D[0x8693 ^ 0x87DD] = 0x1A6F ^ 0x87DD;
        ItemScrollerModule.D[0x819D ^ 0x8192] = 0x810E ^ 0x8192;
        ItemScrollerModule.D[0x96DE ^ 0x97C7] = 0x214B ^ 0x97C7;
        ItemScrollerModule.D[0xBF1C ^ 0xBFDD] = 0xFFFF405B ^ 0xBFDD;
        ItemScrollerModule.D[0x7F21 ^ 0x7F09] = 0x7F05 ^ 0x7F09;
        ItemScrollerModule.D[0xEE64 ^ 0xEF07] = 0xCCAD ^ 0xEF07;
        ItemScrollerModule.D[0x68C2 ^ 0x6861] = 0xFFFF97F7 ^ 0x6861;
        ItemScrollerModule.D[0x938E ^ 0x933F] = 0x9325 ^ 0x933F;
        ItemScrollerModule.D[0xD96F ^ 0xD982] = 0x2D5D ^ 0xD982;
        ItemScrollerModule.D[0xA0A8 ^ 0xA0A9] = 0xA0A9 ^ 0xA0A9;
        ItemScrollerModule.D[0xD916 ^ 0xD930] = 0xD96C ^ 0xD930;
        ItemScrollerModule.D[0x931 ^ 0x94F] = 0x7CCA ^ 0x94F;
        ItemScrollerModule.D[0x100D5 ^ 0x1008B] = 0xFFFEFF4E ^ 0x1008B;
        ItemScrollerModule.D[0xD082 ^ 0xD18A] = 0xCDA9 ^ 0xD18A;
        ItemScrollerModule.D[0x5F19 ^ 0x5E53] = 0xB120 ^ 0x5E53;
        ItemScrollerModule.D[0x1ECD ^ 0x1E7D] = 0x1E70 ^ 0x1E7D;
        ItemScrollerModule.D[0x898D ^ 0x8967] = 0x27EF ^ 0x8967;
        ItemScrollerModule.D[0x16D8 ^ 0x164B] = 0xFFFFE9E3 ^ 0x164B;
        ItemScrollerModule.D[0xCC1B ^ 0xCC10] = 0xFFFF33E4 ^ 0xCC10;
        ItemScrollerModule.D[0x101D4 ^ 0x10128] = 0x1A4BD ^ 0x10128;
        ItemScrollerModule.D[0x5F1C ^ 0x5E41] = 0x1075 ^ 0x5E41;
        ItemScrollerModule.D[0xA26A ^ 0xA285] = 0x8A0B ^ 0xA285;
        ItemScrollerModule.D[0x2FEF ^ 0x2E80] = 0xC782 ^ 0x2E80;
        ItemScrollerModule.D[0xC8E8 ^ 0xC8DA] = 0xC8CC ^ 0xC8DA;
        ItemScrollerModule.D[0x66EC ^ 0x66C0] = 0xFFFF9920 ^ 0x66C0;
        ItemScrollerModule.D[0x76F ^ 0x646] = 0xDF3C ^ 0x646;
        ItemScrollerModule.D[0x76D4 ^ 0x77F1] = 0x3F1D ^ 0x77F1;
        ItemScrollerModule.D[0x9F0F ^ 0x9F68] = 0x9F01 ^ 0x9F68;
        ItemScrollerModule.D[0xE23B ^ 0xE317] = 0xFFFF1F83 ^ 0xE317;
        ItemScrollerModule.D[0x68FC ^ 0x69BA] = 0x4420 ^ 0x69BA;
        ItemScrollerModule.D[0xAAE5 ^ 0xAA7C] = 0xFFFF55CF ^ 0xAA7C;
        ItemScrollerModule.D[0x9C8D ^ 0x9CC9] = 0x9CB4 ^ 0x9CC9;
        ItemScrollerModule.D[0x4A25 ^ 0x4B2A] = 0x9E07 ^ 0x4B2A;
        ItemScrollerModule.D[0x9052 ^ 0x9054] = 0xFFFF6F33 ^ 0x9054;
        ItemScrollerModule.D[0xD20C ^ 0xD381] = 0x981A ^ 0xD381;
        ItemScrollerModule.D[0x65B ^ 0x766] = 0x7427 ^ 0x766;
        ItemScrollerModule.D[0xE35D ^ 0xE355] = 0xFFFF1CD7 ^ 0xE355;
        ItemScrollerModule.D[0xB50E ^ 0xB5C0] = 0x1B0CE ^ 0xB5C0;
        ItemScrollerModule.D[0x2A94 ^ 0x2BD4] = 0xFFFF87E3 ^ 0x2BD4;
        ItemScrollerModule.D[0x5394 ^ 0x531F] = 0xFFFFACB4 ^ 0x531F;
        ItemScrollerModule.D[0xB7BF ^ 0xB70A] = 0xFFFF48D2 ^ 0xB70A;
        ItemScrollerModule.D[0x10CAD ^ 0x10C84] = 0x10C99 ^ 0x10C84;
        ItemScrollerModule.D[0x7ED8 ^ 0x7F87] = 0x9971 ^ 0x7F87;
        ItemScrollerModule.D[0x18E0 ^ 0x19E4] = 0x73AD ^ 0x19E4;
        ItemScrollerModule.D[0x36AE ^ 0x3640] = 0xC297 ^ 0x3640;
        ItemScrollerModule.D[0xCAD8 ^ 0xCA4A] = 0xCA33 ^ 0xCA4A;
        ItemScrollerModule.D[0x110 ^ 0x1F8] = 0xAF70 ^ 0x1F8;
        ItemScrollerModule.D[0x60A0 ^ 0x60F1] = 0x60CA ^ 0x60F1;
        ItemScrollerModule.D[0xD13C ^ 0xD1DD] = 0x39FD ^ 0xD1DD;
        ItemScrollerModule.D[0xF5C1 ^ 0xF595] = 0xF5BD ^ 0xF595;
        ItemScrollerModule.D[0xB7CC ^ 0xB64C] = 0xFFFF0BB5 ^ 0xB64C;
        ItemScrollerModule.D[0xB950 ^ 0xB906] = 0xFFFF46B4 ^ 0xB906;
        ItemScrollerModule.D[0xD315 ^ 0xD278] = 0x9B64 ^ 0xD278;
        ItemScrollerModule.D[0xCBB4 ^ 0xCAA8] = 0xCDA9 ^ 0xCAA8;
        ItemScrollerModule.D[0xAA3F ^ 0xAAF7] = 0xAAF7 ^ 0xAAF7;
        ItemScrollerModule.D[0x32E8 ^ 0x32FC] = 0xFFFFCD0D ^ 0x32FC;
        ItemScrollerModule.D[0x86EE ^ 0x86BB] = 0x86CD ^ 0x86BB;
        ItemScrollerModule.D[0xC351 ^ 0xC36E] = 0xC36E ^ 0xC36E;
        ItemScrollerModule.D[0x48FD ^ 0x483E] = 0x483F ^ 0x483E;
        ItemScrollerModule.D[0x64F3 ^ 0x647A] = 0x6423 ^ 0x647A;
        ItemScrollerModule.D[0x66C9 ^ 0x66CD] = 0xFFFF9963 ^ 0x66CD;
        ItemScrollerModule.D[0x47B8 ^ 0x469C] = 0xFFFFF1F9 ^ 0x469C;
        ItemScrollerModule.D[0x1312 ^ 0x137F] = 0xFFFFECE8 ^ 0x137F;
        ItemScrollerModule.D[0xA685 ^ 0xA704] = 0xE516 ^ 0xA704;
        ItemScrollerModule.D[0x74C1 ^ 0x7433] = 0x5CB1 ^ 0x7433;
        ItemScrollerModule.D[0x7AA3 ^ 0x7BFA] = 0xD504 ^ 0x7BFA;
        ItemScrollerModule.D[0x5518 ^ 0x5587] = 0xFFFFAA67 ^ 0x5587;
        ItemScrollerModule.D[0x147A ^ 0x1513] = 0x2501 ^ 0x1513;
        ItemScrollerModule.D[0x9337 ^ 0x93FC] = 0x196F6 ^ 0x93FC;
        ItemScrollerModule.D[0x1CAA ^ 0x1C05] = 0x1C69 ^ 0x1C05;
        ItemScrollerModule.D[0xA4AA ^ 0xA424] = 0xA417 ^ 0xA424;
        ItemScrollerModule.D[0x53AA ^ 0x53A6] = 0xFFFFAC36 ^ 0x53A6;
        ItemScrollerModule.D[0x5DC6 ^ 0x5DB1] = 0x5DB1 ^ 0x5DB1;
        ItemScrollerModule.D[0x4681 ^ 0x4786] = 0x5BAC ^ 0x4786;
        ItemScrollerModule.D[0xCB09 ^ 0xCA7D] = 0x2C5A ^ 0xCA7D;
        ItemScrollerModule.D[0x2131 ^ 0x211A] = 0xFFFFDEF9 ^ 0x211A;
        ItemScrollerModule.D[0xBFB1 ^ 0xBEF6] = 0x936A ^ 0xBEF6;
        ItemScrollerModule.D[0x40E3 ^ 0x41AE] = 0xAEDE ^ 0x41AE;
        ItemScrollerModule.D[0x9753 ^ 0x961B] = 0xFFFF445A ^ 0x961B;
        ItemScrollerModule.D[0x8580 ^ 0x84DB] = 0xCAEF ^ 0x84DB;
        ItemScrollerModule.D[0xFB75 ^ 0xFA74] = 0xFFFFF3F7 ^ 0xFA74;
        ItemScrollerModule.D[0xF1A9 ^ 0xF1E9] = 0xFFFF0E1E ^ 0xF1E9;
        ItemScrollerModule.D[0x643C ^ 0x6448] = 0x6449 ^ 0x6448;
        ItemScrollerModule.D[0xEA2F ^ 0xEB35] = 0xEC59 ^ 0xEB35;
        ItemScrollerModule.D[0x30B1 ^ 0x30C4] = 0x30C4 ^ 0x30C4;
        ItemScrollerModule.D[0x30DB ^ 0x3198] = 0xC099 ^ 0x3198;
        ItemScrollerModule.D[0x4AEB ^ 0x4A7F] = 0xFFFFB580 ^ 0x4A7F;
        ItemScrollerModule.D[0x4F25 ^ 0x4E08] = 0x4D18 ^ 0x4E08;
        ItemScrollerModule.D[0x9B6C ^ 0x9AE0] = 0xD149 ^ 0x9AE0;
        ItemScrollerModule.D[0x9797 ^ 0x96EB] = 0xFFFF0229 ^ 0x96EB;
        ItemScrollerModule.D[0xF92A ^ 0xF9FC] = 0xBE79 ^ 0xF9FC;
        ItemScrollerModule.D[0xCCC1 ^ 0xCC31] = 0xE4B3 ^ 0xCC31;
        ItemScrollerModule.D[0xF36C ^ 0xF250] = 0xFFFF7EF2 ^ 0xF250;
        ItemScrollerModule.D[0x10966 ^ 0x10856] = 0x17C38 ^ 0x10856;
        ItemScrollerModule.D[0xE9F4 ^ 0xE9D5] = 0xFFFF1680 ^ 0xE9D5;
        ItemScrollerModule.D[0x4B82 ^ 0x4BD2] = 0x4B9B ^ 0x4BD2;
        ItemScrollerModule.D[0x77E1 ^ 0x7749] = 0xFFFF88EB ^ 0x7749;
        ItemScrollerModule.D[0x1CA2 ^ 0x1CAC] = 0x1CD5 ^ 0x1CAC;
        ItemScrollerModule.D[0x1F2E ^ 0x1F98] = 0x1F91 ^ 0x1F98;
        ItemScrollerModule.D[0x6F40 ^ 0x6E17] = 0xC0E9 ^ 0x6E17;
        ItemScrollerModule.D[0xE403 ^ 0xE469] = 0xE421 ^ 0xE469;
        ItemScrollerModule.D[0xBC68 ^ 0xBDEB] = 0xC51D ^ 0xBDEB;
        ItemScrollerModule.D[0xAAE ^ 0xBB8] = 0xBD30 ^ 0xBB8;
        ItemScrollerModule.D[0x392D ^ 0x38AB] = 0xD918 ^ 0x38AB;
        ItemScrollerModule.D[0x975D ^ 0x974A] = 0x9774 ^ 0x974A;
        ItemScrollerModule.D[0x8A94 ^ 0x8B85] = 0x5EA8 ^ 0x8B85;
        ItemScrollerModule.D[0xC67E ^ 0xC7F0] = 0xC7F0 ^ 0xC7F0;
        ItemScrollerModule.D[0xFE0F ^ 0xFE54] = 0xFFFF01D9 ^ 0xFE54;
        ItemScrollerModule.D[0x98AC ^ 0x99A5] = 0xFFFF7A2B ^ 0x99A5;
        ItemScrollerModule.D[0x414A ^ 0x4107] = 0xFFFFBEDA ^ 0x4107;
        ItemScrollerModule.D[0xC06A ^ 0xC0B8] = 0x8D2 ^ 0xC0B8;
        ItemScrollerModule.D[0x3EFB ^ 0x3FCF] = 0x2E2B ^ 0x3FCF;
        ItemScrollerModule.D[0x180E ^ 0x1954] = 0x577E ^ 0x1954;
        ItemScrollerModule.D[0xC248 ^ 0xC301] = 0xEE9D ^ 0xC301;
        ItemScrollerModule.D[0xC9DB ^ 0xC95F] = 0x80A1 ^ 0xC95F;
        ItemScrollerModule.D[0x55E7 ^ 0x55B5] = 0x55BE ^ 0x55B5;
        ItemScrollerModule.D[0xFE41 ^ 0xFEBA] = 0x5B2D ^ 0xFEBA;
        ItemScrollerModule.D[0x7E90 ^ 0x7E48] = 0x17EF1 ^ 0x7E48;
        ItemScrollerModule.D[0xF814 ^ 0xF909] = 0xFE6F ^ 0xF909;
        ItemScrollerModule.D[0x2D98 ^ 0x2DBA] = 0xFFFFD235 ^ 0x2DBA;
        ItemScrollerModule.D[0x10AD0 ^ 0x10A63] = 0xFFFEF5F1 ^ 0x10A63;
        ItemScrollerModule.D[0xD3AD ^ 0xD322] = 0xFFFF2CA9 ^ 0xD322;
        ItemScrollerModule.D[0x89D8 ^ 0x88AD] = 0x6EA2 ^ 0x88AD;
        ItemScrollerModule.D[0x29A ^ 0x2E2] = 0x2E2 ^ 0x2E2;
        ItemScrollerModule.D[0x8AD2 ^ 0x8B87] = 0x2576 ^ 0x8B87;
        ItemScrollerModule.D[0x1A3 ^ 0x11C] = 0xFFFFFEDB ^ 0x11C;
        ItemScrollerModule.D[0x890F ^ 0x89DA] = 0xCE2E ^ 0x89DA;
        ItemScrollerModule.D[0xC2C5 ^ 0xC3C5] = 0x35E2 ^ 0xC3C5;
        ItemScrollerModule.D[0xB0F5 ^ 0xB18D] = 0xFFFFA4F0 ^ 0xB18D;
        ItemScrollerModule.D[0xC102 ^ 0xC1E4] = 0x34EC ^ 0xC1E4;
        ItemScrollerModule.D[0x8AD ^ 0x986] = 0xA96 ^ 0x986;
        ItemScrollerModule.D[0xF8F6 ^ 0xF87A] = 0xFFFF07BC ^ 0xF87A;
        ItemScrollerModule.D[0x5A61 ^ 0x5ABD] = 0xA36E ^ 0x5ABD;
        ItemScrollerModule.D[0xD8D0 ^ 0xD8C6] = 0xD8C4 ^ 0xD8C6;
        ItemScrollerModule.D[0x66ED ^ 0x66F1] = 0x66E3 ^ 0x66F1;
        ItemScrollerModule.D[0x6FF9 ^ 0x6F01] = 0xA17E ^ 0x6F01;
        ItemScrollerModule.D[0x39F1 ^ 0x3946] = 0x39FC ^ 0x3946;
        ItemScrollerModule.D[0x4AF2 ^ 0x4B7B] = 0xAADA ^ 0x4B7B;
        ItemScrollerModule.D[0x766A ^ 0x766D] = 0xFFFF8989 ^ 0x766D;
        ItemScrollerModule.D[0x9D25 ^ 0x9DC1] = 0x68C9 ^ 0x9DC1;
        ItemScrollerModule.D[0x55F7 ^ 0x55CE] = 0xFFFFAABB ^ 0x55CE;
        ItemScrollerModule.D[0x89AB ^ 0x888D] = 0x51E6 ^ 0x888D;
        ItemScrollerModule.D[0xA9F2 ^ 0xA8E7] = 0x14C5 ^ 0xA8E7;
        ItemScrollerModule.D[0x9DB8 ^ 0x9CC3] = 0xF7EE ^ 0x9CC3;
        ItemScrollerModule.D[0x1AA8 ^ 0x1A2D] = 0xA172 ^ 0x1A2D;
        ItemScrollerModule.D[0x10454 ^ 0x10411] = 0xFFFEFB79 ^ 0x10411;
        ItemScrollerModule.D[0x22E8 ^ 0x23F3] = 0x2495 ^ 0x23F3;
        ItemScrollerModule.D[0x6381 ^ 0x62BB] = 0x11E2 ^ 0x62BB;
        ItemScrollerModule.D[0x162D ^ 0x16D3] = 0xB346 ^ 0x16D3;
        ItemScrollerModule.D[0x1020 ^ 0x107D] = 0xFFFFEFAC ^ 0x107D;
        ItemScrollerModule.D[0xF2FD ^ 0xF3CA] = 0xFF9A ^ 0xF3CA;
        ItemScrollerModule.D[0x99FF ^ 0x99CB] = 0xFFFF6656 ^ 0x99CB;
        ItemScrollerModule.D[0x46BF ^ 0x4691] = 0xFFFFB979 ^ 0x4691;
        ItemScrollerModule.D[0xF6C8 ^ 0xF7FE] = 0xFBBA ^ 0xF7FE;
        ItemScrollerModule.D[0xDBF9 ^ 0xDAB5] = 0xFFFFCA04 ^ 0xDAB5;
        ItemScrollerModule.D[0x100CF ^ 0x100EC] = 0xFFFEFF4A ^ 0x100EC;
        ItemScrollerModule.D[0x1011C ^ 0x1016D] = 0xFFFEFEEF ^ 0x1016D;
        ItemScrollerModule.D[0x1DDF ^ 0x1D73] = 0x1D16 ^ 0x1D73;
        ItemScrollerModule.D[0xA11D ^ 0xA062] = 0xE270 ^ 0xA062;
        ItemScrollerModule.D[0xCCDC ^ 0xCC30] = 0x38E7 ^ 0xCC30;
        ItemScrollerModule.D[0x391B ^ 0x39DB] = 0xFFFFC675 ^ 0x39DB;
        ItemScrollerModule.D[0x7ABF ^ 0x7B9C] = 0x3370 ^ 0x7B9C;
        ItemScrollerModule.D[0x179F ^ 0x170E] = 0xFFFFE8F0 ^ 0x170E;
        ItemScrollerModule.D[0x5DC8 ^ 0x5D71] = 0x5D39 ^ 0x5D71;
        ItemScrollerModule.D[0x1020D ^ 0x1033F] = 0x112BD ^ 0x1033F;
        ItemScrollerModule.D[0x10DFB ^ 0x10CFE] = 0x166A9 ^ 0x10CFE;
        ItemScrollerModule.D[0x6EF1 ^ 0x6E4F] = 0x6E3B ^ 0x6E4F;
        ItemScrollerModule.D[0xD2A0 ^ 0xD2B1] = 0xD2CA ^ 0xD2B1;
        ItemScrollerModule.D[0xA2D2 ^ 0xA260] = 0xFFFF5DC8 ^ 0xA260;
        ItemScrollerModule.D[0x5595 ^ 0x55B2] = 0x55A3 ^ 0x55B2;
        ItemScrollerModule.D[0x8871 ^ 0x8862] = 0x8837 ^ 0x8862;
        ItemScrollerModule.D[0xD763 ^ 0xD670] = 0x6A52 ^ 0xD670;
        ItemScrollerModule.D[0x1A6C ^ 0x1A07] = 0xFFFFE583 ^ 0x1A07;
        ItemScrollerModule.D[0x1746 ^ 0x1766] = 0x175B ^ 0x1766;
        ItemScrollerModule.D[0x849E ^ 0x85BC] = 0xCD5E ^ 0x85BC;
        ItemScrollerModule.D[0x227D ^ 0x2268] = 0x2208 ^ 0x2268;
        ItemScrollerModule.D[0x86F8 ^ 0x87B7] = 0x1A10 ^ 0x87B7;
        ItemScrollerModule.D[0xCCF6 ^ 0xCDA0] = 0x635C ^ 0xCDA0;
        ItemScrollerModule.D[0x7333 ^ 0x73BE] = 0xFFFF8CC6 ^ 0x73BE;
        ItemScrollerModule.D[0xA781 ^ 0xA78B] = 0xFFFF5802 ^ 0xA78B;
        ItemScrollerModule.D[0x8627 ^ 0x8776] = 0x1AD1 ^ 0x8776;
        ItemScrollerModule.D[0x5983 ^ 0x5944] = 0x5945 ^ 0x5944;
        ItemScrollerModule.D[0xB72A ^ 0xB72A] = 0xB76C ^ 0xB72A;
        ItemScrollerModule.D[0xDC30 ^ 0xDC06] = 0xDC7A ^ 0xDC06;
        ItemScrollerModule.D[0xD2B7 ^ 0xD2A9] = 0xD2F9 ^ 0xD2A9;
        ItemScrollerModule.D[0xF1D6 ^ 0xF114] = 0xF13E ^ 0xF114;
        ItemScrollerModule.D[0x29E9 ^ 0x29C3] = 0xFFFFD63E ^ 0x29C3;
        ItemScrollerModule.D[0x820A ^ 0x835E] = 0x2D9E ^ 0x835E;
        ItemScrollerModule.D[0x2F80 ^ 0x2E07] = 0xCFA6 ^ 0x2E07;
        ItemScrollerModule.D[0x65C2 ^ 0x65F3] = 0x65F2 ^ 0x65F3;
        ItemScrollerModule.D[0xC042 ^ 0xC095] = 0x1C02F ^ 0xC095;
        ItemScrollerModule.D[0xE230 ^ 0xE2D7] = 0x4C5E ^ 0xE2D7;
        ItemScrollerModule.D[0xEA34 ^ 0xEAC5] = 0xFFFF3DE5 ^ 0xEAC5;
        ItemScrollerModule.D[0x1074D ^ 0x1063D] = 0xFFFE109E ^ 0x1063D;
        ItemScrollerModule.D[0x3AEA ^ 0x3AE3] = 0xFFFFC59A ^ 0x3AE3;
        ItemScrollerModule.D[0x95F4 ^ 0x95EE] = 0xFFFF6A5F ^ 0x95EE;
        ItemScrollerModule.D[0x13FF ^ 0x135F] = 0xFFFFEC9E ^ 0x135F;
        ItemScrollerModule.D[0xDD86 ^ 0xDCFF] = 0x3658 ^ 0xDCFF;
        ItemScrollerModule.D[0xCD0C ^ 0xCDEF] = 0x38EF ^ 0xCDEF;
        ItemScrollerModule.D[0x457B ^ 0x440A] = 0xAD08 ^ 0x440A;
        ItemScrollerModule.D[0x4B7D ^ 0x4B36] = 0xFFFFB55E ^ 0x4B36;
        ItemScrollerModule.D[0xCB9B ^ 0xCBC1] = 0xCB48 ^ 0xCBC1;
        ItemScrollerModule.D[0xB21F ^ 0xB232] = 0xB256 ^ 0xB232;
        ItemScrollerModule.D[0xE60 ^ 0xF00] = 0xE995 ^ 0xF00;
        ItemScrollerModule.D[0x157B ^ 0x158C] = 0xDBF3 ^ 0x158C;
        ItemScrollerModule.D[0x2E86 ^ 0x2EC1] = 0xFFFFD161 ^ 0x2EC1;
        ItemScrollerModule.D[0xB909 ^ 0xB9AF] = 0xB996 ^ 0xB9AF;
        ItemScrollerModule.D[0xFD5E ^ 0xFD31] = 0xFFFF02B6 ^ 0xFD31;
        ItemScrollerModule.D[0xC3DC ^ 0xC258] = 0xFFFF4525 ^ 0xC258;
        ItemScrollerModule.D[0x8D1A ^ 0x8C05] = 0xFBA3 ^ 0x8C05;
        ItemScrollerModule.D[0xC2EB ^ 0xC263] = 0xFFFF3D99 ^ 0xC263;
        ItemScrollerModule.D[0x9535 ^ 0x950E] = 0x9575 ^ 0x950E;
        ItemScrollerModule.D[0xBE65 ^ 0xBF35] = 0x2297 ^ 0xBF35;
        ItemScrollerModule.D[0x4C38 ^ 0x4CA0] = 0x4CAF ^ 0x4CA0;
        ItemScrollerModule.D[3 ^ 0xD9] = 0x10060 ^ 0xD9;
        ItemScrollerModule.D[0x3438 ^ 0x3516] = 0x4101 ^ 0x3516;
    }
}

