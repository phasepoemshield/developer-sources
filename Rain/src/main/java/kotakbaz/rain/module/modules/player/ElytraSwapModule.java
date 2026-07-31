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
import kotakbaz.rain.command.Command;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.player.G;
import kotakbaz.rain.module.modules.player.L;
import kotakbaz.rain.module.restrict.FuntimeRestrict;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010\u001eR\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010\u001bR\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010&R\u0016\u0010*\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010&\u00a8\u0006,"}, d2={"Lkotakbaz/rain/module/modules/player/ElytraSwapModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/KeyEvent;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "findElytraSlot", "()Ljava/lang/Integer;", "findChestplateSlot", "inventorySlot", "toHandlerSlot", "(I)Ljava/lang/Integer;", "", "closeInventory", "resetPressed", "resetProgress", "(ZZ)V", "CHEST_HANDLER_SLOT", "I", "", "STEP_DELAY_MS", "J", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "swapBind", "Lkotakbaz/rain/module/setting/settings/BindSetting;", "Lkotakbaz/rain/module/modules/player/ElytraSwapModule$State;", "state", "Lkotakbaz/rain/module/modules/player/ElytraSwapModule$State;", "wasPressed", "Z", "nextActionAt", "targetHandlerSlot", "equipingElytra", "inventoryOpenedByModule", "State", "rain-visuals"})
public final class ElytraSwapModule
extends Module {
    @NotNull
    public static final ElytraSwapModule INSTANCE;
    private static final int a = 6;
    private static final long A = 50L;
    @NotNull
    private static final BindSetting b;
    @NotNull
    private static G B;
    private static boolean c;
    private static long C;
    private static int d;
    private static boolean D;
    private static boolean e;
    private static Object[] E;
    private static Object F;
    private static Object[] g;
    private static Object[] f;
    private static Object[] G;
    public static int[] h;

    private ElytraSwapModule() {
        int n2 = h[0];
        n2 ^= h[1];
        int n3 = h[3];
        n3 -= h[4];
        int n4 = h[6];
        n4 ^= h[7];
        super((String)E[n2 += h[2]], a_0.getPLAYER(), (String)E[n3 ^= h[5]] + (String)E[n4 ^= h[8]]);
    }

    @Override
    public void onEnable() {
        boolean bl = h[9];
        bl ^= h[10];
        boolean bl2 = h[12];
        bl2 -= h[13];
        this.resetProgress(bl -= h[11], bl2 -= h[14]);
    }

    @Override
    public void onDisable() {
        boolean bl = h[15];
        bl ^= h[16];
        boolean bl2 = h[18];
        bl2 ^= h[19];
        this.resetProgress(bl ^= h[17], bl2 += h[20]);
    }

    @Commando
    public final void onKey(@NotNull KeyEvent event) {
        int n2;
        Integer n3;
        long l2 = 2870796918501805072L;
        long l3 = 140736372961143934L;
        long l4 = -1905899249912846825L;
        long l5 = 6102901871978896972L;
        int n4 = h[21];
        n4 += h[22];
        Intrinsics.checkNotNullParameter(event, (String)E[n4 += h[23]]);
        Integer n5 = event.get(KeyEvent.a.getBUTTON());
        if (n5 == null) {
            return;
        }
        int n6 = h[24];
        n6 += h[25];
        long l6 = l3;
        int n7 = h[27];
        n7 += h[28];
        l3 = l6 ^ ((long)n5.intValue() << (n6 += h[26]) ^ l6) & -1L << (n7 ^= h[29]);
        boolean bl = h[30];
        bl -= h[31];
        if (Intrinsics.areEqual(event.get(KeyEvent.a.getMOUSE()), bl ^= h[32])) {
            return;
        }
        boolean bl2 = h[33];
        bl2 -= h[34];
        long l7 = l3;
        int n8 = h[36];
        n8 -= h[37];
        l3 = l7 ^ ((long)Intrinsics.areEqual(event.get(KeyEvent.a.getRELEASE()), bl2 -= h[35]) ^ l7) & -1L >>> (n8 -= h[38]);
        int n9 = h[39];
        n9 ^= h[40];
        if ((int)(l3 >>> (n9 += h[41])) != ((Number)b.getValue()).intValue()) {
            return;
        }
        if ((int)l3 != 0) {
            int n10 = h[42];
            n10 -= h[43];
            c = n10 += h[44];
            return;
        }
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().world == null || kotakbaz.rain.client.extensions.b.getMc().interactionManager == null) {
            return;
        }
        if (kotakbaz.rain.client.extensions.b.getMc().currentScreen != null || B != kotakbaz.rain.module.modules.player.G.a || c) {
            return;
        }
        int n11 = h[45];
        n11 ^= h[46];
        c = n11 -= h[47];
        ItemStack itemStack = clientPlayerEntity2.getEquippedStack(EquipmentSlot.CHEST);
        int n12 = h[48];
        n12 -= h[49];
        long l8 = l5;
        int n13 = h[51];
        n13 += h[52];
        l5 = l8 ^ ((long)itemStack.isOf(Items.ELYTRA) << (n12 -= h[50]) ^ l8) & -1L << (n13 ^= h[53]);
        int n14 = h[54];
        n14 -= h[55];
        Integer n15 = n3 = (int)(l5 >>> (n14 += h[56])) != 0 ? this.findChestplateSlot() : this.findElytraSlot();
        if (n3 == null) {
            String string;
            int n16 = h[57];
            n16 -= h[58];
            if ((int)(l5 >>> (n16 += h[59])) != 0) {
                int n17 = h[60];
                n17 -= h[61];
                int n18 = h[63];
                n18 ^= h[64];
                string = (String)E[n17 += h[62]] + (String)E[n18 += h[65]];
            } else {
                int n19 = h[66];
                n19 ^= h[67];
                int n20 = h[69];
                n20 ^= h[70];
                string = (String)E[n19 += h[68]] + (String)E[n20 ^= h[71]];
            }
            Command.INSTANCE.sendClientMessage(string);
            int n21 = h[72];
            n21 ^= h[73];
            c = n21 += h[74];
            return;
        }
        Integer n22 = this.toHandlerSlot(n3);
        if (n22 == null) {
            int n23 = h[75];
            n23 ^= h[76];
            int n24 = h[78];
            n24 += h[79];
            Command.INSTANCE.sendClientMessage((String)E[n23 += h[77]] + (String)E[n24 ^= h[80]]);
            int n25 = h[81];
            n25 ^= h[82];
            c = n25 += h[83];
            return;
        }
        d = n22;
        int n26 = h[84];
        if ((int)(l5 >>> (n26 -= h[85])) == 0) {
            int n27 = h[86];
            n27 ^= h[87];
            n2 = n27 += h[88];
        } else {
            int n28 = h[89];
            n28 += h[90];
            n2 = n28 -= h[91];
        }
        D = n2;
        B = kotakbaz.rain.module.modules.player.G.A;
        C = 0L;
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = 6787935204668770523L;
        int n2 = h[92];
        n2 ^= h[93];
        Intrinsics.checkNotNullParameter(event, (String)E[n2 += h[94]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            ElytraSwapModule elytraSwapModule = this;
            long l3 = l2;
            int n3 = h[95];
            n3 += h[96];
            l2 = l3 ^ (0L ^ l3) & -1L << (n3 ^= h[97]);
            boolean bl = h[98];
            bl += h[99];
            boolean bl2 = h[101];
            bl2 -= h[102];
            elytraSwapModule.resetProgress(bl += h[100], bl2 -= h[103]);
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().world == null || kotakbaz.rain.client.extensions.b.getMc().interactionManager == null) {
            boolean bl = h[104];
            bl -= h[105];
            boolean bl3 = h[107];
            bl3 ^= h[108];
            this.resetProgress(bl += h[106], bl3 ^= h[109]);
            return;
        }
        if (B == kotakbaz.rain.module.modules.player.G.a) {
            return;
        }
        long l4 = System.currentTimeMillis();
        if (l4 < C) {
            return;
        }
        switch (L.a[B.ordinal()]) {
            case 1: {
                if (kotakbaz.rain.client.extensions.b.getMc().currentScreen == null) {
                    kotakbaz.rain.client.extensions.b.getMc().setScreen((Screen)new InventoryScreen((PlayerEntity)clientPlayerEntity2));
                    int n4 = h[110];
                    n4 += h[111];
                    e = n4 -= h[112];
                }
                C = l4 + 50L;
                B = kotakbaz.rain.module.modules.player.G.b;
                break;
            }
            case 2: {
                if (!(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof InventoryScreen)) {
                    boolean bl = h[113];
                    bl -= h[114];
                    boolean bl4 = h[116];
                    bl4 ^= h[117];
                    this.resetProgress(bl ^= h[115], bl4 += h[118]);
                    return;
                }
                ClientPlayerInteractionManager clientPlayerInteractionManager = kotakbaz.rain.client.extensions.b.getMc().interactionManager;
                if (clientPlayerInteractionManager != null) {
                    int n5 = h[119];
                    n5 -= h[120];
                    int n6 = h[122];
                    n6 += h[123];
                    clientPlayerInteractionManager.clickSlot(clientPlayerEntity2.playerScreenHandler.syncId, n5 -= h[121], n6 ^= h[124], SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity2);
                }
                C = l4 + 50L;
                B = kotakbaz.rain.module.modules.player.G.B;
                break;
            }
            case 3: {
                if (!(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof InventoryScreen) || d < 0) {
                    boolean bl = h[125];
                    bl -= h[126];
                    boolean bl5 = h[128];
                    bl5 += h[129];
                    this.resetProgress(bl -= h[127], bl5 += h[130]);
                    return;
                }
                ClientPlayerInteractionManager clientPlayerInteractionManager = kotakbaz.rain.client.extensions.b.getMc().interactionManager;
                if (clientPlayerInteractionManager != null) {
                    int n7 = h[131];
                    n7 -= h[132];
                    clientPlayerInteractionManager.clickSlot(clientPlayerEntity2.playerScreenHandler.syncId, d, n7 -= h[133], SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity2);
                }
                C = l4 + 50L;
                B = kotakbaz.rain.module.modules.player.G.c;
                break;
            }
            case 4: {
                String string;
                if (!(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof InventoryScreen)) {
                    boolean bl = h[134];
                    bl += h[135];
                    boolean bl6 = h[137];
                    bl6 ^= h[138];
                    this.resetProgress(bl += h[136], bl6 ^= h[139]);
                    return;
                }
                ClientPlayerInteractionManager clientPlayerInteractionManager = kotakbaz.rain.client.extensions.b.getMc().interactionManager;
                if (clientPlayerInteractionManager != null) {
                    int n8 = h[140];
                    n8 += h[141];
                    int n9 = h[143];
                    n9 -= h[144];
                    clientPlayerInteractionManager.clickSlot(clientPlayerEntity2.playerScreenHandler.syncId, n8 ^= h[142], n9 -= h[145], SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity2);
                }
                clientPlayerEntity2.playerScreenHandler.sendContentUpdates();
                if (D) {
                    int n10 = h[146];
                    n10 -= h[147];
                    int n11 = h[149];
                    n11 ^= h[150];
                    string = (String)E[n10 ^= h[148]] + (String)E[n11 += h[151]];
                } else {
                    int n12 = h[152];
                    n12 ^= h[153];
                    int n13 = h[155];
                    n13 += h[156];
                    int n14 = h[158];
                    n14 ^= h[159];
                    string = (String)E[n12 -= h[154]] + (String)E[n13 ^= h[157]] + (String)E[n14 -= h[160]];
                }
                Command.INSTANCE.sendClientMessage(string);
                C = l4 + 50L;
                B = kotakbaz.rain.module.modules.player.G.C;
                break;
            }
            case 5: {
                boolean bl = h[161];
                bl ^= h[162];
                boolean bl7 = h[164];
                bl7 -= h[165];
                this.resetProgress(bl += h[163], bl7 += h[166]);
                break;
            }
            case 6: {
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final Integer findElytraSlot() {
        long l2 = -3554847719402948455L;
        long l3 = 8329382074959819269L;
        long l4 = 9141877675671333281L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return null;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        long l5 = l4;
        int n2 = h[167];
        n2 ^= h[168];
        l4 = l5 ^ (0L ^ l5) & -1L << (n2 += h[169]);
        while (true) {
            int n3 = h[170];
            n3 += h[171];
            int n4 = h[173];
            n4 ^= h[174];
            if ((int)(l4 >>> (n3 += h[172])) >= (n4 -= h[175])) break;
            int n5 = h[176];
            n5 += h[177];
            if (clientPlayerEntity2.getInventory().getStack((int)(l4 >>> (n5 -= h[178]))).isOf(Items.ELYTRA)) {
                int n6 = h[179];
                n6 ^= h[180];
                return (int)(l4 >>> (n6 -= h[181]));
            }
            l4 += 0x100000000L;
        }
        return null;
    }

    private final Integer findChestplateSlot() {
        long l2 = 8522877573262998378L;
        long l3 = -1965796120464957984L;
        long l4 = 7594102561800006271L;
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return null;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        long l5 = l4;
        int n2 = h[182];
        n2 ^= h[183];
        l4 = l5 ^ (0L ^ l5) & -1L << (n2 += h[184]);
        while (true) {
            EquippableComponent equippableComponent;
            int n3 = h[185];
            n3 ^= h[186];
            int n4 = h[188];
            n4 ^= h[189];
            if ((int)(l4 >>> (n3 -= h[187])) >= (n4 += h[190])) break;
            int n5 = h[191];
            n5 += h[192];
            ItemStack itemStack = clientPlayerEntity2.getInventory().getStack((int)(l4 >>> (n5 -= h[193])));
            EquippableComponent equippableComponent2 = equippableComponent = (EquippableComponent)itemStack.get(DataComponentTypes.EQUIPPABLE);
            if ((equippableComponent2 != null ? equippableComponent2.slot() : null) == EquipmentSlot.CHEST) {
                int n6 = h[194];
                n6 ^= h[195];
                return (int)(l4 >>> (n6 ^= h[196]));
            }
            l4 += 0x100000000L;
        }
        return null;
    }

    private final Integer toHandlerSlot(int inventorySlot) {
        Integer n2;
        int n3;
        long l2 = -7073078874846880096L;
        long l3 = 3004588319288754956L;
        long l4 = -5202276325743475245L;
        int n4 = h[197];
        n4 -= h[198];
        long l5 = l4;
        int n5 = h[200];
        n5 ^= h[201];
        l4 = l5 ^ ((long)inventorySlot << (n4 -= h[199]) ^ l5) & -1L << (n5 -= h[202]);
        int n6 = h[203];
        n6 ^= h[204];
        int n7 = h[206];
        n7 += h[207];
        if ((n6 ^= h[205]) <= (int)(l4 >>> (n7 += h[208]))) {
            int n8 = h[209];
            n8 -= h[210];
            int n9 = h[212];
            n9 -= h[213];
            if ((int)(l4 >>> (n8 ^= h[211])) < (n9 += h[214])) {
                int n10 = h[215];
                n10 -= h[216];
                n3 = n10 -= h[217];
            } else {
                int n11 = h[218];
                n11 += h[219];
                n3 = n11 -= h[220];
            }
        } else {
            int n12 = h[221];
            n12 ^= h[222];
            n3 = n12 -= h[223];
        }
        if (n3 != 0) {
            int n13 = h[224];
            n13 ^= h[225];
            n2 = (n13 ^= h[226]) + inventorySlot;
        } else {
            int n14;
            int n15 = h[227];
            n15 ^= h[228];
            int n16 = h[230];
            n16 += h[231];
            if ((n15 ^= h[229]) <= (int)(l4 >>> (n16 -= h[232]))) {
                int n17 = h[233];
                n17 ^= h[234];
                int n18 = h[236];
                n18 += h[237];
                if ((int)(l4 >>> (n17 ^= h[235])) < (n18 ^= h[238])) {
                    int n19 = h[239];
                    n19 += h[240];
                    n14 = n19 += h[241];
                } else {
                    int n20 = h[242];
                    n20 += h[243];
                    n14 = n20 ^= h[244];
                }
            } else {
                int n21 = h[245];
                n21 -= h[246];
                n14 = n21 += h[247];
            }
            n2 = n14 != 0 ? Integer.valueOf(inventorySlot) : null;
        }
        return n2;
    }

    private final void resetProgress(boolean closeInventory, boolean resetPressed) {
        if (closeInventory && e && kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof InventoryScreen) {
            kotakbaz.rain.client.extensions.b.getMc().setScreen(null);
        }
        B = kotakbaz.rain.module.modules.player.G.a;
        C = 0L;
        int n2 = h[248];
        n2 ^= h[249];
        d = n2 += h[250];
        int n3 = h[251];
        n3 -= h[252];
        D = n3 += h[253];
        int n4 = h[254];
        n4 ^= h[255];
        e = n4 += h[256];
        if (resetPressed) {
            int n5 = h[257];
            n5 -= h[258];
            c = n5 ^= h[259];
        }
    }

    static {
        ElytraSwapModule.b();
        long l2 = 2141674207558553888L;
        long l3 = 5395487667305880354L;
        long l4 = 7706747474920676932L;
        long l5 = -1891791774855205307L;
        long l6 = 4486532605039101427L;
        long l7 = 6942426425897058965L;
        long l8 = -314704481026908855L;
        long l9 = -5196540081128890401L;
        long l10 = -2335668336877936135L;
        long l11 = 6188037223040015482L;
        long l12 = 257783727871747204L;
        long l13 = 8210661536194426011L;
        long l14 = -3306090276338032217L;
        long l15 = 6372173363567903463L;
        int n2 = h[260];
        n2 -= h[261];
        E = new Object[n2 -= h[262]];
        long l16 = l15;
        int n3 = h[263];
        n3 -= h[264];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 += h[265]);
        Object[] objectArray = new Object[h[266]];
        objectArray[ElytraSwapModule.h[267]] = f;
        objectArray[ElytraSwapModule.h[268]] = h[269];
        int n4 = h[270];
        Object object = ElytraSwapModule.A()[h[271]];
        if (object == null) {
            char[] cArray = "\ua69f\ua6a1\ua6a5\ua6a9\ua6bd\ua6a8\ua16c\ua050\ua161\ua059\ua057\ua06e\ua04c\ua041\ua16c\ua04a\ua6a1\ua6b9\ua057\ua041\ua179\ua04c\ua05a\ua6b6\ua6b6\ua6a6\ua6a1\ua04c\ua0be\ua176\ua161\ua0bf\ua070\ua168\ua6aa\ua6ba\ua05d\ua179\ua049\ua15f\ua69f\ua054\ua070\ua6b7\ua17a\ua6a0\ua6ab\ua15f\ua6a1\ua04a\ua6a9\ua059\ua176\ua6bd\ua6a6\ua04c\ua043\ua04e\ua17d\ua047\ua179\ua17b\ua17d\ua160\ua6b6\ua04a\ua6a0\ua041\ua047\ua6bb\ua17a\ua179\ua6b6\ua6a3\ua04a\ua049\ua6b6\ua04c\ua04a\ua04d\ua06f\ua054\ua6a5\ua15f\ua17a\ua046\ua6ab\ua04a\ua69f\ua070\ua69e\ua0be\ua04d\ua6ab\ua047\ua6ac\ua17d\ua0be\ua05b\ua044\ua04a\ua15e\ua059\ua6bb\ua6a4\ua6ad\ua6a9\ua047\ua04c\ua057\ua176\ua6bd\ua057\ua04b\ua04d\ua05b\ua05d\ua05d\ua6ab\ua6a6\ua0be\ua04e\ua6aa\ua6a8\ua048\ua04c\ua6b7\ua043\ua6aa\ua047\ua043\ua04b\ua057\ua06e\ua06e\ua0bf\ua054\ua17a\ua070\ua6a7\ua6bd\ua045\ua04b\ua6a9\ua04c\ua6a6\ua04a\ua04b\ua6a6\ua041\ua042\ua04f\ua04f\ua056\ua04f\ua048\ua15f\ua17b\ua17a\ua070\ua6a8\ua0bf\ua168\ua6a9\ua054\ua04b\ua6ba\ua6bd\ua06f\ua050\ua6a6\ua04c\ua6bb\ua176\ua0be\ua042\ua6b9\ua06e\ua04a\ua04a\ua161\ua161\ua043\ua059\ua6ab\ua04e\ua168\ua057\ua04c\ua6a4\ua040\ua164\ua074\ua6a9\ua040\ua044\ua161\ua045\ua046\ua05b\ua048\ua6a8\ua176\ua043\ua17a\ua6aa\ua6a3\ua16c\ua6a8\ua043\ua6a4\ua040\ua054\ua6a7\ua6ab\ua056\ua161\ua6b9\ua04e\ua6ac\ua69f\ua074\ua04c\ua04c\ua04d\ua17d\ua6b7\ua04d\ua6aa\ua04a\ua054\ua057\ua043\ua69f\ua17b\ua6a1\ua168\ua168\ua6b9\ua057\ua04e\ua69f\ua041\ua6a5\ua161\ua04b\ua6b9\ua050\ua17a\ua057\ua6a9\ua69e\ua6a5\ua6a4\ua04d\ua06e\ua045\ua074\ua6b9\ua69f\ua0bf\ua6a9\ua6a0\ua050\ua0bf\ua040\ua045\ua6a4\ua056\ua69e\ua047\ua04f\ua059\ua6b7\ua05d\ua06f\ua6ba\ua16c\ua15e\ua6ab\ua69e\ua05d\ua04f\ua0be\ua04e\ua15e\ua046\ua6a9\ua6a2\ua6a5\ua6bb\ua06e\ua6ab\ua6aa\ua070\ua164\ua054\ua15e\ua0bf\ua04c\ua6b9\ua69f\ua05a\ua04f\ua6b9\ua6a5\ua179\ua6a1\ua048\ua15f\ua176\ua074\ua04f\ua043\ua6bd\ua041\ua17b\ua6a8\ua6a4\ua05d\ua16c\ua6a2\ua6aa\ua6a0\ua17b\ua04d\ua161\ua6a2\ua0be\ua048\ua04f\ua6a8\ua0be\ua049\ua074\ua6a5\ua6a2\ua04f\ua6ab\ua15f\ua6a7\ua040\ua6a2\ua6a8\ua179\ua17d\ua048\ua057\ua045\ua045\ua6ac\ua6a7\ua04b\ua056\ua6bb\ua6a4\ua056\ua6a4\ua6bd\ua049\ua04a\ua6bb\ua054\ua6a2\ua070\ua04a\ua6b7\ua0bf\ua040\ua05d\ua05b\ua045\ua6a5\ua69e\ua69f\ua6ad\ua047\ua04b\ua6bb\ua6ba\ua6bd\ua6a6\ua06e\ua05d\ua6b9\ua6a1\ua047\ua168\ua6a2\ua160\ua69f\ua043\ua17a\ua16c\ua6bb\ua69e\ua6a1\ua04a\ua074\ua15e\ua168\ua6a9\ua6ad\ua042\ua69f\ua047\ua054\ua6ba\ua69f\ua05a\ua074\ua04f\ua044\ua6a0\ua16c\ua6a5\ua6bb\ua0bf\ua0bf\ua044\ua06f\ua6a0\ua15f\ua6a3\ua6b7\ua6ac\ua048\ua69e\ua6a3\ua048\ua054\ua070\ua045\ua6b6\ua17a\ua059\ua69e\ua17b\ua161\ua057\ua059\ua179\ua041\ua6b9\ua6b9\ua164\ua168\ua6bd\ua6a9\ua047\ua17d\ua05b\ua69e\ua074\ua040\ua6b6\ua06f\ua059\ua040\ua057\ua6a0\ua6a2\ua176\ua6ab\ua17d\ua15e\ua06f\ua176\ua6a2\ua160\ua69f\ua6aa\ua043\ua05d\ua049\ua6b7\ua6b6\ua042\ua176\ua04d\ua6bd\ua04a\ua04b\ua6ad\ua043\ua040\ua048\ua6a2\ua6bd\ua04f\ua054\ua17d\ua6a9\ua04d\ua047\ua045\ua6ac\ua04e\ua04e\ua17a\ua6a4\ua160\ua043\ua6b6\ua04c\ua04b\ua6a5\ua05b\ua6b6\ua074\ua6ad\ua043\ua04e\ua04d\ua6ba\ua040\ua059\ua06e\ua05a\ua6ad\ua168\ua070\ua041\ua05a\ua179\ua059\ua6a2\ua6a0\ua6a6\ua6aa\ua6a8\ua05b\ua6b6\ua6b7\ua6bb\ua070\ua070\ua070\ua050\ua6b7\ua6a2\ua176\ua6a2\ua6a5\ua048\ua04b\ua070\ua6a5\ua69f\ua6a1\ua041\ua040\ua161\ua057\ua164\ua6bb\ua6b6\ua04b\ua160\ua070\ua057\ua17b\ua045\ua0be\ua6b7\ua041\ua048\ua048\ua6a8\ua050\ua074\ua6b6\ua04c\ua6a2\ua6b6\ua168".toCharArray();
            for (int i2 = h[272]; i2 < h[273]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= h[274];
                n5 += h[275];
                n5 ^= h[276];
                n5 -= h[277];
                n5 -= h[278];
                n5 += h[279];
                n5 -= h[280];
                n5 ^= h[281];
                n5 += h[282];
                n5 ^= h[283];
                n5 ^= h[284];
                n5 -= h[285];
                cArray[i2] = (char)(n5 ^= h[286]);
            }
            object = ElytraSwapModule.A()[ElytraSwapModule.h[287]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)ElytraSwapModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = h[288];
        n6 ^= h[289];
        l6 = l17 ^ (0xF300000000L ^ l17) & -1L << (n6 += h[290]);
        long l18 = l13;
        int n7 = h[291];
        n7 ^= h[292];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 += h[293]);
        while (true) {
            int n8 = h[294];
            n8 -= h[295];
            if ((int)l13 >= (int)(l6 >>> (n8 += h[296]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = h[297];
            n10 += h[298];
            int n11 = h[300];
            n11 ^= h[301];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 += h[299])) & -1L >>> (n11 += h[302]);
            long l20 = l9;
            int n12 = h[303];
            n12 -= h[304];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= h[305]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = h[306];
            n14 += h[307];
            int n15 = h[309];
            n15 ^= h[310];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= h[308])) & -1L >>> (n15 ^= h[311]);
            int n16 = h[312];
            n16 ^= h[313];
            long l22 = l10;
            int n17 = h[315];
            n17 ^= h[316];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += h[314]) ^ l22) & -1L << (n17 ^= h[317]);
            int n18 = h[318];
            n18 ^= h[319];
            n18 ^= h[320];
            int n19 = h[321];
            n19 -= h[322];
            long l23 = l12;
            int n20 = h[324];
            n20 -= h[325];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= h[323]))) ^ l23) & -1L >>> (n20 += h[326]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = h[327];
            n21 += h[328];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 ^= h[329]);
            while (true) {
                int n22 = h[330];
                n22 += h[331];
                if ((int)(l14 >>> (n22 += h[332])) >= (int)l12) break;
                int n23 = h[333];
                n23 -= h[334];
                int n24 = h[336];
                n24 += h[337];
                cArray2[(int)(l14 >>> (n23 -= ElytraSwapModule.h[335]))] = cArray[(int)l13 + (int)(l14 >>> (n24 -= h[338]))];
                l14 += 0x100000000L;
            }
            int n25 = h[339];
            n25 ^= h[340];
            int n26 = (int)(l15 >>> (n25 += h[341]));
            l15 += 0x100000000L;
            ElytraSwapModule.E[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = h[342];
            n27 -= h[343];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= h[344]);
        }
        INSTANCE = new ElytraSwapModule();
        int n28 = h[345];
        n28 ^= h[346];
        int n29 = h[348];
        n29 -= h[349];
        b = INSTANCE.bind((String)E[n28 += h[347]], n29 -= h[350]);
        B = kotakbaz.rain.module.modules.player.G.a;
        int n30 = h[351];
        n30 -= h[352];
        d = n30 += h[353];
        int n31 = h[354];
        n31 ^= h[355];
        FuntimeRestrict.moduleOnFuntime$default(FuntimeRestrict.INSTANCE, INSTANCE, null, n31 -= h[356], null);
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[h[357]];
        String string = (String)object[h[358]];
        object = object[h[359]];
        Object[] objectArray = g;
        if (g == null) {
            objectArray = g = new Object[h[360]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[h[361]];
                f = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[h[363] ^ h[364]];
                byArray[ElytraSwapModule.h[365] ^ ElytraSwapModule.h[366]] = h[367] ^ h[368];
                byArray[ElytraSwapModule.h[369] ^ ElytraSwapModule.h[370]] = h[371] ^ h[372];
                byArray[ElytraSwapModule.h[373] ^ ElytraSwapModule.h[374]] = h[375] ^ h[376];
                byArray[ElytraSwapModule.h[377] ^ ElytraSwapModule.h[378]] = h[379] ^ h[380];
                byArray[ElytraSwapModule.h[381] ^ ElytraSwapModule.h[382]] = h[383] ^ h[384];
                byArray[ElytraSwapModule.h[385] ^ ElytraSwapModule.h[386]] = h[387] ^ h[388];
                byArray[ElytraSwapModule.h[389] ^ ElytraSwapModule.h[390]] = h[391] ^ h[392];
                byArray[ElytraSwapModule.h[393] ^ ElytraSwapModule.h[394]] = h[395] ^ h[396];
                byArray[ElytraSwapModule.h[397] ^ ElytraSwapModule.h[398]] = h[399] ^ 0x5C80;
                byArray[0x989A ^ 0x989A] = 0xFFFF671E ^ 0x989A;
                byArray[0x96BD ^ 0x96B3] = 0x9687 ^ 0x96B3;
                byArray[0x6779 ^ 0x677A] = 0x6765 ^ 0x677A;
                byArray[0xFC70 ^ 0xFC77] = 0xFFFF03E7 ^ 0xFC77;
                byArray[0x1031 ^ 0x1030] = 0x1057 ^ 0x1030;
                byArray[0x6BFF ^ 0x6BFB] = 0x6BA4 ^ 0x6BFB;
                byArray[0x2BDE ^ 0x2BD2] = 0xFFFFD46B ^ 0x2BD2;
                objectArray2[ElytraSwapModule.h[362]] = byArray;
            }
            byte[] byArray = (byte[])object3[0];
            if (F == null) {
                byte[] byArray2 = new byte[0x5B43 ^ 0x5B63];
                byArray2[0x19B2 ^ 0x19A2] = 0xFFFFE653 ^ 0x19A2;
                byArray2[0x43E1 ^ 0x43FE] = 0x43DE ^ 0x43FE;
                byArray2[0x3019 ^ 0x300E] = 0x3012 ^ 0x300E;
                byArray2[0x4DA9 ^ 0x4DBC] = 0x4DF7 ^ 0x4DBC;
                byArray2[0x502D ^ 0x5021] = 0xFFFFAFB2 ^ 0x5021;
                byArray2[0x1FCF ^ 0x1FD7] = 0xFFFFE072 ^ 0x1FD7;
                byArray2[0xABAC ^ 0xABAD] = 0xFFFF5432 ^ 0xABAD;
                byArray2[0xF4B5 ^ 0xF4A9] = 0xF4A6 ^ 0xF4A9;
                byArray2[0x1DCE ^ 0x1DCD] = 0x1DE1 ^ 0x1DCD;
                byArray2[0x2872 ^ 0x286B] = 0x2801 ^ 0x286B;
                byArray2[0x7832 ^ 0x7823] = 0xFFFF87C2 ^ 0x7823;
                byArray2[0x967D ^ 0x9660] = 0xFFFF69B8 ^ 0x9660;
                byArray2[0xB5A1 ^ 0xB5A8] = 0xFFFF4A70 ^ 0xB5A8;
                byArray2[0xF86A ^ 0xF871] = 0xF837 ^ 0xF871;
                byArray2[0xCB72 ^ 0xCB70] = 0xFFFF3485 ^ 0xCB70;
                byArray2[0x4F0B ^ 0x4F19] = 0xFFFFB0A5 ^ 0x4F19;
                byArray2[0x8FCA ^ 0x8FC1] = 0x8FA5 ^ 0x8FC1;
                byArray2[0xC4D9 ^ 0xC4CF] = 0xC4DD ^ 0xC4CF;
                byArray2[0xA930 ^ 0xA923] = 0xFFFF56EE ^ 0xA923;
                byArray2[0x392A ^ 0x3930] = 0x396C ^ 0x3930;
                byArray2[0x1178 ^ 0x1166] = 0x1100 ^ 0x1166;
                byArray2[0x895 ^ 0x898] = 0x8DE ^ 0x898;
                byArray2[0x9533 ^ 0x953B] = 0x9536 ^ 0x953B;
                byArray2[0xCD21 ^ 0xCD2B] = 0xFFFF32E3 ^ 0xCD2B;
                byArray2[0xAB1C ^ 0xAB12] = 0xFFFF54A7 ^ 0xAB12;
                byArray2[0xEFE7 ^ 0xEFE7] = 0xEFDB ^ 0xEFE7;
                byArray2[0x101D3 ^ 0x101D4] = 0x10194 ^ 0x101D4;
                byArray2[0x27C4 ^ 0x27C2] = 0xFFFFD84D ^ 0x27C2;
                byArray2[0xFB2E ^ 0xFB3A] = 0xFFFF04D5 ^ 0xFB3A;
                byArray2[0xFEB1 ^ 0xFEBE] = 0xFED2 ^ 0xFEBE;
                byArray2[0x6A40 ^ 0x6A44] = 0x6A4B ^ 0x6A44;
                byArray2[0xDE64 ^ 0xDE61] = 0xDE2A ^ 0xDE61;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = ElytraSwapModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u12cc\u6f62\u12c7\u12c0\u12c6\u6f72\u7143\u7129\u7110\u7144\u6f64\u712d\u7141\u713f\u12cf\u6f64\u6f61\u6f71".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 ^= 0xA183;
                        n3 -= 53571;
                        n3 ^= 0xED04;
                        n3 += 10542;
                        n3 ^= 0x34CE;
                        n3 += 58830;
                        n3 ^= 0x4EEF;
                        n3 += 41585;
                        n3 -= 42162;
                        n3 ^= 0xA754;
                        n3 -= 5976;
                        n3 += 36344;
                        n3 += 27129;
                        cArray[i2] = (char)(n3 += 251);
                    }
                    object4 = ElytraSwapModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[6] = -48;
                byArray4[8] = 67;
                byArray4[13] = 80;
                byArray4[5] = -13;
                byArray4[2] = 92;
                byArray4[11] = 118;
                byArray4[0] = 86;
                byArray4[9] = -24;
                byArray4[1] = -106;
                byArray4[3] = 118;
                byArray4[15] = -47;
                byArray4[12] = 48;
                byArray4[14] = 85;
                byArray4[7] = 20;
                byArray4[10] = 17;
                byArray4[4] = 71;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 16, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = ElytraSwapModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u8a03\u8a27\u89f9".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 -= 42545;
                        n4 += 40180;
                        n4 -= 50549;
                        n4 -= 8374;
                        n4 -= 14682;
                        n4 -= 18683;
                        n4 += 39371;
                        n4 += 27515;
                        n4 ^= 0x5DEC;
                        n4 += 38140;
                        n4 -= 44237;
                        cArray[i3] = (char)(n4 ^= 0x28CE);
                    }
                    object5 = ElytraSwapModule.A()[2] = new String(cArray);
                }
                F = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = ElytraSwapModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u8c15\u8c19\u8c0b\u8da7\u8c1b\u8c16\u8c1b\u8da7\u8c00\u8c13\u8c1b\u8c0b\u8da9\u8c00\u8cf5\u8cf4\u8cf4\u8ced\u8cf2\u8cef".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 ^= 0x9180;
                    n5 ^= 0xF323;
                    n5 -= 43877;
                    n5 -= 33206;
                    n5 ^= 0xC0C6;
                    n5 ^= 0x54F8;
                    n5 ^= 0xE278;
                    n5 -= 1868;
                    n5 += 6766;
                    n5 ^= 0x505F;
                    cArray[i4] = (char)(n5 -= 39519);
                }
                object6 = ElytraSwapModule.A()[3] = new String(cArray);
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
        h = new int[0x7393 ^ 0x7203];
        ElytraSwapModule.h[0x74FD ^ 0x74AF] = 0x7487 ^ 0x74AF;
        ElytraSwapModule.h[0x5D01 ^ 0x5C38] = 0x5C75 ^ 0x5C38;
        ElytraSwapModule.h[0xE50B ^ 0xE539] = 0xE527 ^ 0xE539;
        ElytraSwapModule.h[0x2D0E ^ 0x2D84] = 0x2DFC ^ 0x2D84;
        ElytraSwapModule.h[0xA19D ^ 0xA0A3] = 0xA0F7 ^ 0xA0A3;
        ElytraSwapModule.h[0xB226 ^ 0xB36D] = 0xFFFF4CD5 ^ 0xB36D;
        ElytraSwapModule.h[0xEC31 ^ 0xECCF] = 0xFFFF1301 ^ 0xECCF;
        ElytraSwapModule.h[0x8D67 ^ 0x8C6F] = 0x8C4B ^ 0x8C6F;
        ElytraSwapModule.h[0x67B9 ^ 0x67CB] = 0x67BB ^ 0x67CB;
        ElytraSwapModule.h[0xD3FB ^ 0xD2D0] = 0xFFFF2D25 ^ 0xD2D0;
        ElytraSwapModule.h[0x5733 ^ 0x561C] = 0xFFFFA9D6 ^ 0x561C;
        ElytraSwapModule.h[0xDD48 ^ 0xDD4A] = 0xDD41 ^ 0xDD4A;
        ElytraSwapModule.h[0x7D61 ^ 0x7D09] = 0x7D45 ^ 0x7D09;
        ElytraSwapModule.h[0x8105 ^ 0x81E5] = 0xFFFF7E36 ^ 0x81E5;
        ElytraSwapModule.h[0x5CAC ^ 0x5D8D] = 0xFFFFA231 ^ 0x5D8D;
        ElytraSwapModule.h[0x183 ^ 0x12D] = 0xFFFFFEF0 ^ 0x12D;
        ElytraSwapModule.h[0xF60E ^ 0xF76F] = 0xFFFF089A ^ 0xF76F;
        ElytraSwapModule.h[0x102D2 ^ 0x103B5] = 0x103B5 ^ 0x103B5;
        ElytraSwapModule.h[0x57CE ^ 0x56CB] = 0x56AB ^ 0x56CB;
        ElytraSwapModule.h[0x94C6 ^ 0x94FA] = 0xFFFF6B3F ^ 0x94FA;
        ElytraSwapModule.h[0x1792 ^ 0x16FB] = 0x16FA ^ 0x16FB;
        ElytraSwapModule.h[0x7A7C ^ 0x7B29] = 0xFFFF84D4 ^ 0x7B29;
        ElytraSwapModule.h[0xF3CB ^ 0xF394] = 0xFFFF0C24 ^ 0xF394;
        ElytraSwapModule.h[0x54F1 ^ 0x5455] = 0x5429 ^ 0x5455;
        ElytraSwapModule.h[0x34A3 ^ 0x34D3] = 0x34B7 ^ 0x34D3;
        ElytraSwapModule.h[0x1C8D ^ 0x1C7A] = 0xFFFFE39A ^ 0x1C7A;
        ElytraSwapModule.h[0xBDB4 ^ 0xBD33] = 0xFFFF42DF ^ 0xBD33;
        ElytraSwapModule.h[0x3D13 ^ 0x3D8D] = 0xFFFFC22F ^ 0x3D8D;
        ElytraSwapModule.h[0xB059 ^ 0xB136] = 0xFFFF5A63 ^ 0xB136;
        ElytraSwapModule.h[0x30CB ^ 0x3008] = 0xFFFFCFCB ^ 0x3008;
        ElytraSwapModule.h[0xFEBA ^ 0xFFFB] = 0xFFAF ^ 0xFFFB;
        ElytraSwapModule.h[0x6A7B ^ 0x6A01] = 0xFFFF953C ^ 0x6A01;
        ElytraSwapModule.h[0x10EBC ^ 0x10E55] = 0xFFFEF192 ^ 0x10E55;
        ElytraSwapModule.h[0x100B5 ^ 0x1007B] = 0xFFFEFFD2 ^ 0x1007B;
        ElytraSwapModule.h[0xB69C ^ 0xB6E1] = 0xB6C8 ^ 0xB6E1;
        ElytraSwapModule.h[0xD737 ^ 0xD73E] = 0xFFFF28C6 ^ 0xD73E;
        ElytraSwapModule.h[0xB8E2 ^ 0xB9D9] = 0xFFFF4670 ^ 0xB9D9;
        ElytraSwapModule.h[0x1270 ^ 0x1322] = 0xFFFFECA3 ^ 0x1322;
        ElytraSwapModule.h[0xAF8 ^ 0xBD2] = 0xB95 ^ 0xBD2;
        ElytraSwapModule.h[0x8E4F ^ 0x8E87] = 0xFFFF7165 ^ 0x8E87;
        ElytraSwapModule.h[0x935A ^ 0x9259] = 0x9256 ^ 0x9259;
        ElytraSwapModule.h[0x47A4 ^ 0x47BC] = 0x47C1 ^ 0x47BC;
        ElytraSwapModule.h[0xE2E4 ^ 0xE27E] = 0xFFFF1DE4 ^ 0xE27E;
        ElytraSwapModule.h[0x953F ^ 0x958B] = 0xFFFF6A43 ^ 0x958B;
        ElytraSwapModule.h[0x74B ^ 0x7B8] = 0xFFFFF87D ^ 0x7B8;
        ElytraSwapModule.h[0x41C4 ^ 0x4145] = 0xFFFFBEA9 ^ 0x4145;
        ElytraSwapModule.h[0xB4F2 ^ 0xB442] = 0xB43D ^ 0xB442;
        ElytraSwapModule.h[0x9389 ^ 0x9288] = 0x92A5 ^ 0x9288;
        ElytraSwapModule.h[0x6FF1 ^ 0x6E73] = 0x1749 ^ 0x6E73;
        ElytraSwapModule.h[0xE9C6 ^ 0xE9FC] = 0xE9C0 ^ 0xE9FC;
        ElytraSwapModule.h[0x1014C ^ 0x10034] = 0x15660 ^ 0x10034;
        ElytraSwapModule.h[0x8C3B ^ 0x8CE2] = 0xFFFF731B ^ 0x8CE2;
        ElytraSwapModule.h[0xE34E ^ 0xE3F9] = 0xE394 ^ 0xE3F9;
        ElytraSwapModule.h[0x6E ^ 0x171] = 0x171 ^ 0x171;
        ElytraSwapModule.h[0x56F9 ^ 0x56E2] = 0xFFFFA911 ^ 0x56E2;
        ElytraSwapModule.h[0xF19E ^ 0xF0E9] = 0xA6D1 ^ 0xF0E9;
        ElytraSwapModule.h[0x1048A ^ 0x10433] = 0x10444 ^ 0x10433;
        ElytraSwapModule.h[0x4F2A ^ 0x4F2F] = 0xFFFFB0C5 ^ 0x4F2F;
        ElytraSwapModule.h[0xD979 ^ 0xD87F] = 0xFFFF27B5 ^ 0xD87F;
        ElytraSwapModule.h[0x7D80 ^ 0x7D11] = 0xFFFF82C9 ^ 0x7D11;
        ElytraSwapModule.h[0x5237 ^ 0x5201] = 0xFFFFADAC ^ 0x5201;
        ElytraSwapModule.h[0x27C1 ^ 0x2797] = 0xFFFFD845 ^ 0x2797;
        ElytraSwapModule.h[0xC765 ^ 0xC627] = 0xFFFF39EA ^ 0xC627;
        ElytraSwapModule.h[0x79DD ^ 0x796E] = 0xFFFF8689 ^ 0x796E;
        ElytraSwapModule.h[0x7E26 ^ 0x7E4A] = 0x7E09 ^ 0x7E4A;
        ElytraSwapModule.h[0x9F33 ^ 0x9F27] = 0x9F0B ^ 0x9F27;
        ElytraSwapModule.h[0xD8DF ^ 0xD9F7] = 0xFFFF2657 ^ 0xD9F7;
        ElytraSwapModule.h[0x26AF ^ 0x27D6] = 0xB4E6 ^ 0x27D6;
        ElytraSwapModule.h[0x6D8F ^ 0x6D6C] = 0xFFFF9292 ^ 0x6D6C;
        ElytraSwapModule.h[0x4FE8 ^ 0x4E86] = 0x5A41 ^ 0x4E86;
        ElytraSwapModule.h[0xE72F ^ 0xE7BA] = 0xFFFF1861 ^ 0xE7BA;
        ElytraSwapModule.h[0xFFCD ^ 0xFE41] = 0x5461 ^ 0xFE41;
        ElytraSwapModule.h[0x9885 ^ 0x984A] = 0x9870 ^ 0x984A;
        ElytraSwapModule.h[0x5FC0 ^ 0x5EB3] = 0xFFFF48C7 ^ 0x5EB3;
        ElytraSwapModule.h[0x4223 ^ 0x431E] = 0x4328 ^ 0x431E;
        ElytraSwapModule.h[0x566D ^ 0x57E7] = 0xFDC7 ^ 0x57E7;
        ElytraSwapModule.h[0x8190 ^ 0x8166] = 0xFFFF7E89 ^ 0x8166;
        ElytraSwapModule.h[0x9222 ^ 0x92AA] = 0xFFFF6D4A ^ 0x92AA;
        ElytraSwapModule.h[0xF51E ^ 0xF458] = 0xFFFF0B8A ^ 0xF458;
        ElytraSwapModule.h[0xCEB4 ^ 0xCEE3] = 0xFFFF310B ^ 0xCEE3;
        ElytraSwapModule.h[0x9EB2 ^ 0x9FAB] = 0x11DD ^ 0x9FAB;
        ElytraSwapModule.h[0x10380 ^ 0x10379] = 0x10310 ^ 0x10379;
        ElytraSwapModule.h[0x12B4 ^ 0x13BA] = 0x13B8 ^ 0x13BA;
        ElytraSwapModule.h[0x10A14 ^ 0x10A8C] = 0xFFFEF57B ^ 0x10A8C;
        ElytraSwapModule.h[0xCE4 ^ 0xC52] = 0xC40 ^ 0xC52;
        ElytraSwapModule.h[0x4430 ^ 0x44A6] = 0x44C2 ^ 0x44A6;
        ElytraSwapModule.h[0xA600 ^ 0xA634] = 0xA614 ^ 0xA634;
        ElytraSwapModule.h[0x22CF ^ 0x22D8] = 0x2287 ^ 0x22D8;
        ElytraSwapModule.h[0x9FF ^ 0x9B5] = 0x9A2 ^ 0x9B5;
        ElytraSwapModule.h[0x774A ^ 0x778F] = 0xFFFF887E ^ 0x778F;
        ElytraSwapModule.h[0x50A0 ^ 0x51E0] = 0xFFFFAE09 ^ 0x51E0;
        ElytraSwapModule.h[0xE254 ^ 0xE2B3] = 0xE297 ^ 0xE2B3;
        ElytraSwapModule.h[0x471B ^ 0x476C] = 0xFFFFB891 ^ 0x476C;
        ElytraSwapModule.h[0x8136 ^ 0x813A] = 0x8161 ^ 0x813A;
        ElytraSwapModule.h[0xF606 ^ 0xF6EA] = 0xF6B0 ^ 0xF6EA;
        ElytraSwapModule.h[0x2056 ^ 0x20DD] = 0x20A6 ^ 0x20DD;
        ElytraSwapModule.h[0x7BAF ^ 0x7B71] = 0xFFFF84AE ^ 0x7B71;
        ElytraSwapModule.h[0x17C3 ^ 0x16A1] = 0x16D2 ^ 0x16A1;
        ElytraSwapModule.h[0xD01 ^ 0xDC7] = 0xFFFFF253 ^ 0xDC7;
        ElytraSwapModule.h[0xE537 ^ 0xE42C] = 0xCE54 ^ 0xE42C;
        ElytraSwapModule.h[0x83BF ^ 0x82DB] = 0x82D2 ^ 0x82DB;
        ElytraSwapModule.h[0x4FED ^ 0x4F60] = 0x4F22 ^ 0x4F60;
        ElytraSwapModule.h[0xA26A ^ 0xA2C6] = 0xA28A ^ 0xA2C6;
        ElytraSwapModule.h[0xC8AD ^ 0xC9FC] = 0xFFFF3674 ^ 0xC9FC;
        ElytraSwapModule.h[0xA6BB ^ 0xA64B] = 0xFFFF598C ^ 0xA64B;
        ElytraSwapModule.h[0x123D ^ 0x1366] = 0x1348 ^ 0x1366;
        ElytraSwapModule.h[0xDB22 ^ 0xDA31] = 0xDB3 ^ 0xDA31;
        ElytraSwapModule.h[0x6775 ^ 0x6653] = 0x6665 ^ 0x6653;
        ElytraSwapModule.h[0xC2E ^ 0xD5B] = 0x5B06 ^ 0xD5B;
        ElytraSwapModule.h[0x776C ^ 0x775B] = 0xFFFF88E4 ^ 0x775B;
        ElytraSwapModule.h[0xF806 ^ 0xF86D] = 0xF842 ^ 0xF86D;
        ElytraSwapModule.h[0x2FB0 ^ 0x2F8D] = 0xFFFFD022 ^ 0x2F8D;
        ElytraSwapModule.h[0x1029 ^ 0x10A9] = 0xFFFFEF0C ^ 0x10A9;
        ElytraSwapModule.h[0x6F5A ^ 0x6ED4] = 0x3254 ^ 0x6ED4;
        ElytraSwapModule.h[0x7897 ^ 0x7800] = 0x7849 ^ 0x7800;
        ElytraSwapModule.h[0x659B ^ 0x648B] = 0x648B ^ 0x648B;
        ElytraSwapModule.h[0xC936 ^ 0xC873] = 0xC844 ^ 0xC873;
        ElytraSwapModule.h[0x83AF ^ 0x82B8] = 0x294A ^ 0x82B8;
        ElytraSwapModule.h[0x84F3 ^ 0x848F] = 0xFFFF7B3E ^ 0x848F;
        ElytraSwapModule.h[0x3E02 ^ 0x3F45] = 0xFFFFC0C5 ^ 0x3F45;
        ElytraSwapModule.h[0xA5 ^ 0xBA] = 0xFFFFFF1C ^ 0xBA;
        ElytraSwapModule.h[0xECC9 ^ 0xEC9A] = 0xFFFF137E ^ 0xEC9A;
        ElytraSwapModule.h[0xA534 ^ 0xA5E4] = 0xA5D9 ^ 0xA5E4;
        ElytraSwapModule.h[0x57F5 ^ 0x56C0] = 0x56C8 ^ 0x56C0;
        ElytraSwapModule.h[0x5D95 ^ 0x5D74] = 0xFFFFA2D9 ^ 0x5D74;
        ElytraSwapModule.h[0x10B4A ^ 0x10B7F] = 0xFFFEF48B ^ 0x10B7F;
        ElytraSwapModule.h[0x51B2 ^ 0x5190] = 0x51A3 ^ 0x5190;
        ElytraSwapModule.h[0xC75C ^ 0xC710] = 0xC753 ^ 0xC710;
        ElytraSwapModule.h[0x82E8 ^ 0x83FD] = 0xC652 ^ 0x83FD;
        ElytraSwapModule.h[0xF398 ^ 0xF34C] = 0xFFFF0C23 ^ 0xF34C;
        ElytraSwapModule.h[0x4CA7 ^ 0x4C35] = 0xFFFFB3D3 ^ 0x4C35;
        ElytraSwapModule.h[0xB81C ^ 0xB80A] = 0xB821 ^ 0xB80A;
        ElytraSwapModule.h[0x6CE1 ^ 0x6D89] = 0x6D88 ^ 0x6D89;
        ElytraSwapModule.h[0xBEEA ^ 0xBEA8] = 0xBECE ^ 0xBEA8;
        ElytraSwapModule.h[0x3BC2 ^ 0x3B1E] = 0xFFFFC49C ^ 0x3B1E;
        ElytraSwapModule.h[0xEB3E ^ 0xEA5E] = 0xFFFF15D2 ^ 0xEA5E;
        ElytraSwapModule.h[0x100EA ^ 0x10069] = 0x1007E ^ 0x10069;
        ElytraSwapModule.h[0xD9D2 ^ 0xD90D] = 0xD914 ^ 0xD90D;
        ElytraSwapModule.h[0x8BB3 ^ 0x8B60] = 0xFFFF7492 ^ 0x8B60;
        ElytraSwapModule.h[0x9EE4 ^ 0x9ED4] = 0x9E82 ^ 0x9ED4;
        ElytraSwapModule.h[0x4860 ^ 0x49E5] = 0x3FC4 ^ 0x49E5;
        ElytraSwapModule.h[0x7CB3 ^ 0x7CFA] = 0x7CAB ^ 0x7CFA;
        ElytraSwapModule.h[0xA3F1 ^ 0xA2D4] = 0xA2A0 ^ 0xA2D4;
        ElytraSwapModule.h[0xFBAF ^ 0xFA29] = 0x8C02 ^ 0xFA29;
        ElytraSwapModule.h[0xBB44 ^ 0xBB02] = 0xFFFF44D8 ^ 0xBB02;
        ElytraSwapModule.h[0x23A2 ^ 0x23D7] = 0x23D3 ^ 0x23D7;
        ElytraSwapModule.h[0x108B1 ^ 0x10935] = 0x1700F ^ 0x10935;
        ElytraSwapModule.h[0xA6AF ^ 0xA6AE] = 0xA6EF ^ 0xA6AE;
        ElytraSwapModule.h[0xBFE8 ^ 0xBE8B] = 0xBEF3 ^ 0xBE8B;
        ElytraSwapModule.h[0xBDB9 ^ 0xBD0C] = 0xBD03 ^ 0xBD0C;
        ElytraSwapModule.h[0xD567 ^ 0xD5D8] = 0xD5EC ^ 0xD5D8;
        ElytraSwapModule.h[0xA49C ^ 0xA5B0] = 0xFFFF5A7F ^ 0xA5B0;
        ElytraSwapModule.h[0x6289 ^ 0x6207] = 0xFFFF9DBC ^ 0x6207;
        ElytraSwapModule.h[0x649 ^ 0x700] = 0xFFFFF8A3 ^ 0x700;
        ElytraSwapModule.h[0xEC90 ^ 0xEC39] = 0xEC72 ^ 0xEC39;
        ElytraSwapModule.h[0xB46D ^ 0xB4B8] = 0xFFFF4B1C ^ 0xB4B8;
        ElytraSwapModule.h[0xB3CB ^ 0xB331] = 0xB32C ^ 0xB331;
        ElytraSwapModule.h[0x5585 ^ 0x558A] = 0xFFFFAA7C ^ 0x558A;
        ElytraSwapModule.h[0xF2A3 ^ 0xF212] = 0xFFFF0DAC ^ 0xF212;
        ElytraSwapModule.h[0xCB4F ^ 0xCBAB] = 0xFFFF3464 ^ 0xCBAB;
        ElytraSwapModule.h[0x5DA7 ^ 0x5D80] = 0xFFFFA27C ^ 0x5D80;
        ElytraSwapModule.h[0xE213 ^ 0xE2E8] = 0xFFFF1DAF ^ 0xE2E8;
        ElytraSwapModule.h[0x2846 ^ 0x2887] = 0x28B3 ^ 0x2887;
        ElytraSwapModule.h[0x14DB ^ 0x14BA] = 0xFFFFEB4D ^ 0x14BA;
        ElytraSwapModule.h[0xBD1F ^ 0xBDBE] = 0xBDB1 ^ 0xBDBE;
        ElytraSwapModule.h[0xC516 ^ 0xC452] = 0xC4D7 ^ 0xC452;
        ElytraSwapModule.h[0x32A0 ^ 0x33F8] = 0x33C4 ^ 0x33F8;
        ElytraSwapModule.h[0x10DC7 ^ 0x10D25] = 0x10D7F ^ 0x10D25;
        ElytraSwapModule.h[0x5DBB ^ 0x5DFF] = 0x5D98 ^ 0x5DFF;
        ElytraSwapModule.h[0x6100 ^ 0x614F] = 0x6119 ^ 0x614F;
        ElytraSwapModule.h[0xAFDC ^ 0xAEEC] = 0xAEFB ^ 0xAEEC;
        ElytraSwapModule.h[0x40B4 ^ 0x40E0] = 0xFFFFBF3A ^ 0x40E0;
        ElytraSwapModule.h[0xEDB9 ^ 0xECA4] = 0xC498 ^ 0xECA4;
        ElytraSwapModule.h[0x2352 ^ 0x237E] = 0xFFFFDC9F ^ 0x237E;
        ElytraSwapModule.h[0xFA5B ^ 0xFA58] = 0xFA41 ^ 0xFA58;
        ElytraSwapModule.h[0xCA9E ^ 0xCADD] = 0xFFFF3522 ^ 0xCADD;
        ElytraSwapModule.h[0x6868 ^ 0x6868] = 0xFFFF97D5 ^ 0x6868;
        ElytraSwapModule.h[0x949B ^ 0x94DB] = 0xFFFF6B44 ^ 0x94DB;
        ElytraSwapModule.h[0x37E5 ^ 0x3785] = 0x37A2 ^ 0x3785;
        ElytraSwapModule.h[0x178 ^ 0x64] = 0xF75E ^ 0x64;
        ElytraSwapModule.h[0xEDB2 ^ 0xED40] = 0xED37 ^ 0xED40;
        ElytraSwapModule.h[0xCE44 ^ 0xCE1A] = 0xCE33 ^ 0xCE1A;
        ElytraSwapModule.h[0xF118 ^ 0xF188] = 0xFFFF0E26 ^ 0xF188;
        ElytraSwapModule.h[0x131A ^ 0x1229] = 0xFFFFED96 ^ 0x1229;
        ElytraSwapModule.h[0x9019 ^ 0x90BA] = 0x9086 ^ 0x90BA;
        ElytraSwapModule.h[0xA84F ^ 0xA923] = 0x834D ^ 0xA923;
        ElytraSwapModule.h[0x1C85 ^ 0x1C54] = 0xFFFFE3BD ^ 0x1C54;
        ElytraSwapModule.h[0x18D7 ^ 0x19C9] = 0xEF77 ^ 0x19C9;
        ElytraSwapModule.h[0xB29D ^ 0xB3AB] = 0xB3BE ^ 0xB3AB;
        ElytraSwapModule.h[0x25E9 ^ 0x257A] = 0xFFFFDAA0 ^ 0x257A;
        ElytraSwapModule.h[0x706D ^ 0x7007] = 0x7019 ^ 0x7007;
        ElytraSwapModule.h[0x10FDE ^ 0x10ED2] = 0x10ED3 ^ 0x10ED2;
        ElytraSwapModule.h[0xD6AB ^ 0xD785] = 0xD7A4 ^ 0xD785;
        ElytraSwapModule.h[0xE97 ^ 0xEF8] = 0xECB ^ 0xEF8;
        ElytraSwapModule.h[0x6896 ^ 0x685D] = 0xFFFF97A1 ^ 0x685D;
        ElytraSwapModule.h[0xD034 ^ 0xD019] = 0xD005 ^ 0xD019;
        ElytraSwapModule.h[0x599E ^ 0x5984] = 0xFFFFA642 ^ 0x5984;
        ElytraSwapModule.h[0xA885 ^ 0xA807] = 0xA868 ^ 0xA807;
        ElytraSwapModule.h[0x7D5C ^ 0x7DFB] = 0xFFFF8267 ^ 0x7DFB;
        ElytraSwapModule.h[0xC040 ^ 0xC152] = 0xF393 ^ 0xC152;
        ElytraSwapModule.h[0xE187 ^ 0xE0D8] = 0xFFFF1F4E ^ 0xE0D8;
        ElytraSwapModule.h[0x75C ^ 0x7A0] = 0xFFFFF83F ^ 0x7A0;
        ElytraSwapModule.h[0x233 ^ 0x210] = 0x238 ^ 0x210;
        ElytraSwapModule.h[0x24A ^ 0x232] = 0xFFFFFDAE ^ 0x232;
        ElytraSwapModule.h[0x49F0 ^ 0x49D4] = 0xFFFFB68D ^ 0x49D4;
        ElytraSwapModule.h[0x5147 ^ 0x516F] = 0x513A ^ 0x516F;
        ElytraSwapModule.h[0xEC33 ^ 0xEC57] = 0xFFFF13C2 ^ 0xEC57;
        ElytraSwapModule.h[0x4F29 ^ 0x4FF1] = 0x4FA3 ^ 0x4FF1;
        ElytraSwapModule.h[0x2A96 ^ 0x2B1E] = 0x5D35 ^ 0x2B1E;
        ElytraSwapModule.h[0x7C85 ^ 0x7CAC] = 0x7CDB ^ 0x7CAC;
        ElytraSwapModule.h[0x10EBD ^ 0x10E7A] = 0x10E47 ^ 0x10E7A;
        ElytraSwapModule.h[0x6A40 ^ 0x6AE2] = 0xFFFF9528 ^ 0x6AE2;
        ElytraSwapModule.h[0x5E33 ^ 0x5F0F] = 0xFFFFA0B0 ^ 0x5F0F;
        ElytraSwapModule.h[0xB0C5 ^ 0xB1FD] = 0xB1B1 ^ 0xB1FD;
        ElytraSwapModule.h[0x52D4 ^ 0x5359] = 0xFD4 ^ 0x5359;
        ElytraSwapModule.h[0x55FD ^ 0x54F0] = 0x54F0 ^ 0x54F0;
        ElytraSwapModule.h[0x66C7 ^ 0x66ED] = 0x669B ^ 0x66ED;
        ElytraSwapModule.h[0xDDD5 ^ 0xDD33] = 0xFFFF22AC ^ 0xDD33;
        ElytraSwapModule.h[0x752C ^ 0x7436] = 0x3421 ^ 0x7436;
        ElytraSwapModule.h[0x927A ^ 0x9329] = 0xFFFF6CA7 ^ 0x9329;
        ElytraSwapModule.h[0x2701 ^ 0x266C] = 0x32A4 ^ 0x266C;
        ElytraSwapModule.h[0xD51B ^ 0xD455] = 0xD405 ^ 0xD455;
        ElytraSwapModule.h[0xC196 ^ 0xC1F5] = 0xFFFF3E4D ^ 0xC1F5;
        ElytraSwapModule.h[0xDF35 ^ 0xDF3E] = 0xDF3B ^ 0xDF3E;
        ElytraSwapModule.h[0x35B8 ^ 0x35BE] = 0x35D1 ^ 0x35BE;
        ElytraSwapModule.h[0x25EE ^ 0x25C5] = 0x2592 ^ 0x25C5;
        ElytraSwapModule.h[0x3CD9 ^ 0x3D50] = 0x977B ^ 0x3D50;
        ElytraSwapModule.h[0xDB7E ^ 0xDB1C] = 0xDBA8 ^ 0xDB1C;
        ElytraSwapModule.h[0xE7B0 ^ 0xE6D5] = 0xE6D4 ^ 0xE6D5;
        ElytraSwapModule.h[0x58EC ^ 0x59E3] = 0x59E3 ^ 0x59E3;
        ElytraSwapModule.h[0x29AE ^ 0x289F] = 0xFFFFD70C ^ 0x289F;
        ElytraSwapModule.h[0x7A78 ^ 0x7A8C] = 0x7AB0 ^ 0x7A8C;
        ElytraSwapModule.h[0x5FD9 ^ 0x5FBE] = 0x5FB9 ^ 0x5FBE;
        ElytraSwapModule.h[0x37BE ^ 0x3737] = 0x3734 ^ 0x3737;
        ElytraSwapModule.h[0x413B ^ 0x4142] = 0x4119 ^ 0x4142;
        ElytraSwapModule.h[0x106C5 ^ 0x107FA] = 0xFFFEF857 ^ 0x107FA;
        ElytraSwapModule.h[0x7617 ^ 0x771E] = 0xFFFF88E6 ^ 0x771E;
        ElytraSwapModule.h[0xAE4B ^ 0xAE10] = 0xFFFF51C3 ^ 0xAE10;
        ElytraSwapModule.h[0xB83A ^ 0xB94C] = 0xEF18 ^ 0xB94C;
        ElytraSwapModule.h[0xFF6 ^ 0xEB5] = 0xED2 ^ 0xEB5;
        ElytraSwapModule.h[0x6FA1 ^ 0x6F3E] = 0x6F16 ^ 0x6F3E;
        ElytraSwapModule.h[0x9F6E ^ 0x9F81] = 0x9FAA ^ 0x9F81;
        ElytraSwapModule.h[0x4378 ^ 0x431E] = 0x433E ^ 0x431E;
        ElytraSwapModule.h[0x8B57 ^ 0x8B07] = 0xFFFF74F4 ^ 0x8B07;
        ElytraSwapModule.h[0x6CE4 ^ 0x6C90] = 0xFFFF932D ^ 0x6C90;
        ElytraSwapModule.h[0xADCE ^ 0xAD4A] = 0xFFFF52D4 ^ 0xAD4A;
        ElytraSwapModule.h[0xEA39 ^ 0xEA29] = 0xFFFF15D4 ^ 0xEA29;
        ElytraSwapModule.h[0x6D79 ^ 0x6D10] = 0x6D79 ^ 0x6D10;
        ElytraSwapModule.h[0x7C53 ^ 0x7C9F] = 0x7CA7 ^ 0x7C9F;
        ElytraSwapModule.h[0xCC80 ^ 0xCC8E] = 0xFFFF3379 ^ 0xCC8E;
        ElytraSwapModule.h[0x10855 ^ 0x108A4] = 0x108AB ^ 0x108A4;
        ElytraSwapModule.h[0x4221 ^ 0x428A] = 0x4289 ^ 0x428A;
        ElytraSwapModule.h[0x9E9D ^ 0x9FE2] = 0x825C ^ 0x9FE2;
        ElytraSwapModule.h[0xF215 ^ 0xF396] = 0x8ABB ^ 0xF396;
        ElytraSwapModule.h[0xB5FB ^ 0xB4FF] = 0xB4C4 ^ 0xB4FF;
        ElytraSwapModule.h[0xAFD0 ^ 0xAFCE] = 0xFFFF5084 ^ 0xAFCE;
        ElytraSwapModule.h[0xDA80 ^ 0xDA9D] = 0xFFFF2548 ^ 0xDA9D;
        ElytraSwapModule.h[0x590D ^ 0x5973] = 0x5943 ^ 0x5973;
        ElytraSwapModule.h[0x98D0 ^ 0x99DB] = 0x99DB ^ 0x99DB;
        ElytraSwapModule.h[0x851E ^ 0x85DC] = 0x85BE ^ 0x85DC;
        ElytraSwapModule.h[0x1066A ^ 0x106F1] = 0x106F3 ^ 0x106F1;
        ElytraSwapModule.h[0xE691 ^ 0xE67B] = 0xFFFF19D6 ^ 0xE67B;
        ElytraSwapModule.h[0x10175 ^ 0x10144] = 0x1015C ^ 0x10144;
        ElytraSwapModule.h[0x9273 ^ 0x9379] = 0x937A ^ 0x9379;
        ElytraSwapModule.h[0x109F4 ^ 0x109B5] = 0x109DF ^ 0x109B5;
        ElytraSwapModule.h[0xA8CF ^ 0xA89A] = 0xFFFF5720 ^ 0xA89A;
        ElytraSwapModule.h[0x5214 ^ 0x522C] = 0x521E ^ 0x522C;
        ElytraSwapModule.h[0xE944 ^ 0xE9CB] = 0xFFFF164D ^ 0xE9CB;
        ElytraSwapModule.h[0x10011 ^ 0x10196] = 0xFFFE883C ^ 0x10196;
        ElytraSwapModule.h[0x9053 ^ 0x9089] = 0xFFFF6F61 ^ 0x9089;
        ElytraSwapModule.h[0x17A4 ^ 0x179A] = 0xFFFFE877 ^ 0x179A;
        ElytraSwapModule.h[0xF61E ^ 0xF6C5] = 0xFFFF095F ^ 0xF6C5;
        ElytraSwapModule.h[0xC2DB ^ 0xC260] = 0xC275 ^ 0xC260;
        ElytraSwapModule.h[0x8B3A ^ 0x8B7F] = 0x8B2B ^ 0x8B7F;
        ElytraSwapModule.h[0x72DD ^ 0x72E2] = 0x72D9 ^ 0x72E2;
        ElytraSwapModule.h[0x10542 ^ 0x1051B] = 0x10553 ^ 0x1051B;
        ElytraSwapModule.h[0x7645 ^ 0x768C] = 0xFFFF8936 ^ 0x768C;
        ElytraSwapModule.h[0x2522 ^ 0x245F] = 0x3984 ^ 0x245F;
        ElytraSwapModule.h[0xDD1F ^ 0xDDF2] = 0xFFFF2275 ^ 0xDDF2;
        ElytraSwapModule.h[0x8E45 ^ 0x8EF9] = 0xFFFF719E ^ 0x8EF9;
        ElytraSwapModule.h[0xBFAF ^ 0xBF72] = 0xFFFF40B4 ^ 0xBF72;
        ElytraSwapModule.h[0xC97B ^ 0xC836] = 0xC87C ^ 0xC836;
        ElytraSwapModule.h[0xB347 ^ 0xB23D] = 0x2108 ^ 0xB23D;
        ElytraSwapModule.h[0xED5A ^ 0xEC0C] = 0xEC1E ^ 0xEC0C;
        ElytraSwapModule.h[0x481E ^ 0x4830] = 0x4827 ^ 0x4830;
        ElytraSwapModule.h[0xE68E ^ 0xE6D2] = 0xE6BF ^ 0xE6D2;
        ElytraSwapModule.h[0x2972 ^ 0x290D] = 0xFFFFD6F5 ^ 0x290D;
        ElytraSwapModule.h[0x5FC ^ 0x4D1] = 0x4E1 ^ 0x4D1;
        ElytraSwapModule.h[0xEE4C ^ 0xEF26] = 0xEF26 ^ 0xEF26;
        ElytraSwapModule.h[0xC4DB ^ 0xC5F9] = 0xFFFF3A1A ^ 0xC5F9;
        ElytraSwapModule.h[0xFA92 ^ 0xFAC3] = 0xFAF7 ^ 0xFAC3;
        ElytraSwapModule.h[0x8CDA ^ 0x8CFC] = 0xFFFF734F ^ 0x8CFC;
        ElytraSwapModule.h[0xF4DB ^ 0xF4C9] = 0xF4E7 ^ 0xF4C9;
        ElytraSwapModule.h[0x2C14 ^ 0x2D6F] = 0xFFFF41EE ^ 0x2D6F;
        ElytraSwapModule.h[0x1FB4 ^ 0x1F38] = 0xFFFFE043 ^ 0x1F38;
        ElytraSwapModule.h[0x6DC5 ^ 0x6D5C] = 0x6D0D ^ 0x6D5C;
        ElytraSwapModule.h[0x56C8 ^ 0x5630] = 0xFFFFA9BB ^ 0x5630;
        ElytraSwapModule.h[0x763A ^ 0x762F] = 0xFFFF89AA ^ 0x762F;
        ElytraSwapModule.h[0xE991 ^ 0xE9B0] = 0xE9EC ^ 0xE9B0;
        ElytraSwapModule.h[0xB8C3 ^ 0xB836] = 0xB839 ^ 0xB836;
        ElytraSwapModule.h[0xE9C4 ^ 0xE92F] = 0xE965 ^ 0xE92F;
        ElytraSwapModule.h[0x638E ^ 0x63AE] = 0xFFFF9C0B ^ 0x63AE;
        ElytraSwapModule.h[0x8506 ^ 0x8432] = 0xFFFF7B9A ^ 0x8432;
        ElytraSwapModule.h[0x647B ^ 0x64AC] = 0x64E0 ^ 0x64AC;
        ElytraSwapModule.h[0x7DE1 ^ 0x7CE3] = 0x7CFD ^ 0x7CE3;
        ElytraSwapModule.h[0xD5AC ^ 0xD531] = 0xD52B ^ 0xD531;
        ElytraSwapModule.h[0x20BD ^ 0x2017] = 0xFFFFDFC6 ^ 0x2017;
        ElytraSwapModule.h[0x4436 ^ 0x456F] = 0x4549 ^ 0x456F;
        ElytraSwapModule.h[0x49F8 ^ 0x49B3] = 0xFFFFB62B ^ 0x49B3;
        ElytraSwapModule.h[0xD45 ^ 0xDE3] = 0xFFFFF24B ^ 0xDE3;
        ElytraSwapModule.h[0x10CBA ^ 0x10DF2] = 0x10DF1 ^ 0x10DF2;
        ElytraSwapModule.h[0xE3A4 ^ 0xE283] = 0xFFFF1D35 ^ 0xE283;
        ElytraSwapModule.h[0x107A8 ^ 0x107D9] = 0x107F6 ^ 0x107D9;
        ElytraSwapModule.h[0xBAFF ^ 0xBA5A] = 0xBA7E ^ 0xBA5A;
        ElytraSwapModule.h[0x1606 ^ 0x164B] = 0x1660 ^ 0x164B;
        ElytraSwapModule.h[0xE485 ^ 0xE5A5] = 0xFFFF1A24 ^ 0xE5A5;
        ElytraSwapModule.h[0x1E51 ^ 0x1E74] = 0xFFFFE1F2 ^ 0x1E74;
        ElytraSwapModule.h[0x737B ^ 0x73B1] = 0x7389 ^ 0x73B1;
        ElytraSwapModule.h[0xAF2F ^ 0xAE78] = 0xFFFF518E ^ 0xAE78;
        ElytraSwapModule.h[0xCAD4 ^ 0xCA66] = 0xCA7B ^ 0xCA66;
        ElytraSwapModule.h[0xD7C4 ^ 0xD7DD] = 0xFFFF2800 ^ 0xD7DD;
        ElytraSwapModule.h[0x9486 ^ 0x9509] = 0xC989 ^ 0x9509;
        ElytraSwapModule.h[0x7257 ^ 0x7350] = 0x731C ^ 0x7350;
        ElytraSwapModule.h[0xB7BE ^ 0xB6F2] = 0xFFFF4906 ^ 0xB6F2;
        ElytraSwapModule.h[0x41E1 ^ 0x41A6] = 0xFFFFBE22 ^ 0x41A6;
        ElytraSwapModule.h[0xC0E1 ^ 0xC19F] = 0xDC42 ^ 0xC19F;
        ElytraSwapModule.h[0x681E ^ 0x6856] = 0xFFFF97EE ^ 0x6856;
        ElytraSwapModule.h[0x2BBD ^ 0x2B03] = 0xFFFFD496 ^ 0x2B03;
        ElytraSwapModule.h[0x99EC ^ 0x988A] = 0x9888 ^ 0x988A;
        ElytraSwapModule.h[0x3387 ^ 0x33E2] = 0x33CA ^ 0x33E2;
        ElytraSwapModule.h[0xE842 ^ 0xE894] = 0xE8AA ^ 0xE894;
        ElytraSwapModule.h[0x8C75 ^ 0x8CD8] = 0x8CCA ^ 0x8CD8;
        ElytraSwapModule.h[0xE802 ^ 0xE913] = 0xEB53 ^ 0xE913;
        ElytraSwapModule.h[0x950A ^ 0x95E2] = 0xFFFF6A41 ^ 0x95E2;
        ElytraSwapModule.h[0xD2A4 ^ 0xD2A0] = 0xD292 ^ 0xD2A0;
        ElytraSwapModule.h[0x7BB0 ^ 0x7A99] = 0xFFFF855C ^ 0x7A99;
        ElytraSwapModule.h[0xFB96 ^ 0xFBCB] = 0xFFFF0446 ^ 0xFBCB;
        ElytraSwapModule.h[0xC3D7 ^ 0xC3BA] = 0xC3D7 ^ 0xC3BA;
        ElytraSwapModule.h[0x97D3 ^ 0x96B8] = 0xBCC6 ^ 0x96B8;
        ElytraSwapModule.h[0x869D ^ 0x8673] = 0xFFFF79B6 ^ 0x8673;
        ElytraSwapModule.h[0x851E ^ 0x8525] = 0x856B ^ 0x8525;
        ElytraSwapModule.h[0xBC7B ^ 0xBC08] = 0xFFFF43B6 ^ 0xBC08;
        ElytraSwapModule.h[0x14A ^ 0x70] = 0x6F ^ 0x70;
        ElytraSwapModule.h[0xBB3E ^ 0xBA64] = 0xFFFF4596 ^ 0xBA64;
        ElytraSwapModule.h[0x77DC ^ 0x7657] = 0xDC21 ^ 0x7657;
        ElytraSwapModule.h[0x34A8 ^ 0x35F5] = 0x3585 ^ 0x35F5;
        ElytraSwapModule.h[0x4597 ^ 0x452A] = 0xFFFFBAC2 ^ 0x452A;
        ElytraSwapModule.h[0x5774 ^ 0x573A] = 0xFFFFA8B7 ^ 0x573A;
        ElytraSwapModule.h[0x770C ^ 0x7614] = 0x8100 ^ 0x7614;
        ElytraSwapModule.h[0x3DC9 ^ 0x3C99] = 0x3C80 ^ 0x3C99;
        ElytraSwapModule.h[0x9069 ^ 0x9064] = 0x9007 ^ 0x9064;
        ElytraSwapModule.h[0x8833 ^ 0x8904] = 0x8939 ^ 0x8904;
        ElytraSwapModule.h[0x3ADC ^ 0x3AAA] = 0x3AED ^ 0x3AAA;
        ElytraSwapModule.h[0x1ED6 ^ 0x1F57] = 0x6665 ^ 0x1F57;
        ElytraSwapModule.h[0x2ADD ^ 0x2AC1] = 0x2AC3 ^ 0x2AC1;
        ElytraSwapModule.h[0x30 ^ 0x37] = 0xFFFFFFE8 ^ 0x37;
        ElytraSwapModule.h[0xBCED ^ 0xBD91] = 0x2EA4 ^ 0xBD91;
        ElytraSwapModule.h[0x8954 ^ 0x8808] = 0x88C2 ^ 0x8808;
        ElytraSwapModule.h[0xE070 ^ 0xE05F] = 0xE055 ^ 0xE05F;
        ElytraSwapModule.h[0xF152 ^ 0xF158] = 0xFFFF0EA5 ^ 0xF158;
        ElytraSwapModule.h[0xFE22 ^ 0xFEC7] = 0xFEFF ^ 0xFEC7;
        ElytraSwapModule.h[0xEE15 ^ 0xEED8] = 0xFFFF111C ^ 0xEED8;
        ElytraSwapModule.h[0x1CCE ^ 0x1DED] = 0xFFFFE243 ^ 0x1DED;
        ElytraSwapModule.h[0xFB9E ^ 0xFB61] = 0xFB60 ^ 0xFB61;
        ElytraSwapModule.h[0xF93 ^ 0xEE1] = 0xE768 ^ 0xEE1;
        ElytraSwapModule.h[0x10C12 ^ 0x10CBA] = 0x10CF3 ^ 0x10CBA;
        ElytraSwapModule.h[0x20F ^ 0x2B7] = 0xFFFFFD16 ^ 0x2B7;
        ElytraSwapModule.h[0xAC87 ^ 0xADA3] = 0xADA1 ^ 0xADA3;
        ElytraSwapModule.h[0x10F89 ^ 0x10E09] = 0x113D4 ^ 0x10E09;
        ElytraSwapModule.h[0xB34 ^ 0xA6A] = 0xA79 ^ 0xA6A;
        ElytraSwapModule.h[0xB9B4 ^ 0xB8C4] = 0xAC03 ^ 0xB8C4;
        ElytraSwapModule.h[0x7E01 ^ 0x7E95] = 0x7E92 ^ 0x7E95;
        ElytraSwapModule.h[0x9126 ^ 0x9186] = 0xFFFF6E03 ^ 0x9186;
        ElytraSwapModule.h[0xA2FE ^ 0xA38F] = 0x4A04 ^ 0xA38F;
        ElytraSwapModule.h[0x6DEC ^ 0x6CA6] = 0x6CD2 ^ 0x6CA6;
        ElytraSwapModule.h[0x1FDE ^ 0x1FED] = 0xFFFFE059 ^ 0x1FED;
        ElytraSwapModule.h[0x3EB3 ^ 0x3E1C] = 0xFFFFC1B7 ^ 0x3E1C;
        ElytraSwapModule.h[0xAF55 ^ 0xAF6C] = 0xAF62 ^ 0xAF6C;
        ElytraSwapModule.h[0xECA9 ^ 0xED9B] = 0xFFFF1271 ^ 0xED9B;
        ElytraSwapModule.h[0xB0B3 ^ 0xB009] = 0xB04B ^ 0xB009;
        ElytraSwapModule.h[0xA0B1 ^ 0xA037] = 0xA002 ^ 0xA037;
        ElytraSwapModule.h[0x10EA3 ^ 0x10E63] = 0x10E43 ^ 0x10E63;
        ElytraSwapModule.h[0x9842 ^ 0x9818] = 0xFFFF6793 ^ 0x9818;
        ElytraSwapModule.h[0x9B78 ^ 0x9A2C] = 0xFFFF6581 ^ 0x9A2C;
        ElytraSwapModule.h[0x693F ^ 0x684B] = 0x81C2 ^ 0x684B;
        ElytraSwapModule.h[0xE562 ^ 0xE53A] = 0xFFFF1AFD ^ 0xE53A;
        ElytraSwapModule.h[0xEEF0 ^ 0xEFE6] = 0xF009 ^ 0xEFE6;
        ElytraSwapModule.h[0xBD23 ^ 0xBC37] = 0x6AD2 ^ 0xBC37;
        ElytraSwapModule.h[0xBD93 ^ 0xBD82] = 0xBD88 ^ 0xBD82;
        ElytraSwapModule.h[0x2429 ^ 0x2566] = 0xFFFFDABC ^ 0x2566;
        ElytraSwapModule.h[0x4AAC ^ 0x4A29] = 0x4A50 ^ 0x4A29;
        ElytraSwapModule.h[0x238E ^ 0x2386] = 0xFFFFDC32 ^ 0x2386;
        ElytraSwapModule.h[0x1E4C ^ 0x1E37] = 0x1E43 ^ 0x1E37;
        ElytraSwapModule.h[0x74F5 ^ 0x7469] = 0x7470 ^ 0x7469;
        ElytraSwapModule.h[0xA965 ^ 0xA90B] = 0xA939 ^ 0xA90B;
        ElytraSwapModule.h[0xF052 ^ 0xF080] = 0xF097 ^ 0xF080;
        ElytraSwapModule.h[0x8E3D ^ 0x8E2E] = 0xFFFF71D5 ^ 0x8E2E;
        ElytraSwapModule.h[0xD8BA ^ 0xD9BA] = 0xD98B ^ 0xD9BA;
        ElytraSwapModule.h[0x90CC ^ 0x9031] = 0x9069 ^ 0x9031;
        ElytraSwapModule.h[0xEE6A ^ 0xEEAE] = 0xFFFF112F ^ 0xEEAE;
    }
}

