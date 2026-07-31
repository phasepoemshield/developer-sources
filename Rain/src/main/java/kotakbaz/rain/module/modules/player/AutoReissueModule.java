/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.player;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Locale;
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
import kotakbaz.rain.module.modules.player.M;
import kotakbaz.rain.module.modules.player.PvpSafeModule;
import kotakbaz.rain.module.modules.player.j;
import kotakbaz.rain.module.restrict.FuntimeRestrict;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001)B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00128\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010\u001aR\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010\u001aR\u0016\u0010(\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010\u001f\u00a8\u0006*"}, d2={"Lkotakbaz/rain/module/modules/player/AutoReissueModule;", "Lkotakbaz/rain/module/Module;", "<init>", "()V", "", "onEnable", "onDisable", "Lkotakbaz/rain/event/events/PlayerUpdateEvent;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "now", "resetCycle", "(J)V", "abortActiveCycle", "Lnet/minecraft/class_1703;", "handler", "", "resolveStorageSlot", "(Lnet/minecraft/class_1703;)Ljava/lang/Integer;", "resolveConfirmSlot", "getBottomRowSecondSlot", "getBottomRowPenultimateSlot", "getContainerSlotCount", "CYCLE_DELAY_MS", "J", "STEP_DELAY_MS", "STEP_TIMEOUT_MS", "CLOSE_TIMEOUT_MS", "PLAYER_INVENTORY_SLOT_COUNT", "I", "", "STORAGE_KEYWORD", "Ljava/lang/String;", "Lkotakbaz/rain/module/modules/player/AutoReissueModule$State;", "state", "Lkotakbaz/rain/module/modules/player/AutoReissueModule$State;", "nextAuctionAt", "stepStartedAt", "firstScreenSyncId", "State", "rain-visuals"})
public final class AutoReissueModule
extends Module {
    @NotNull
    public static final AutoReissueModule INSTANCE;
    private static final long a = 60000L;
    private static final long A = 1000L;
    private static final long b = 15000L;
    private static final long B = 2000L;
    private static final int c = 36;
    @NotNull
    private static final String C = "\u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435";
    @NotNull
    private static M d;
    private static long D;
    private static long e;
    private static int E;
    private static Object[] f;
    private static Object g;
    private static Object[] G;
    private static Object[] F;
    private static Object[] h;
    public static int[] H;

    private AutoReissueModule() {
        int n2 = H[0];
        n2 -= H[1];
        int n3 = H[3];
        n3 ^= H[4];
        int n4 = H[6];
        n4 ^= H[7];
        super((String)f[n2 += H[2]], a_0.getPLAYER(), (String)f[n3 -= H[5]] + (String)f[n4 += H[8]]);
    }

    @Override
    public void onEnable() {
        d = M.a;
        D = 0L;
        e = 0L;
        int n2 = H[9];
        n2 += H[10];
        E = n2 -= H[11];
    }

    @Override
    public void onDisable() {
        this.resetCycle(System.currentTimeMillis());
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        long l2 = 4747236087888073437L;
        long l3 = -7738660003102185378L;
        int n2 = H[12];
        n2 += H[13];
        Intrinsics.checkNotNullParameter(event, (String)f[n2 += H[14]]);
        ClientPlayerEntity clientPlayerEntity = kotakbaz.rain.client.extensions.b.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity2 = clientPlayerEntity;
        if (kotakbaz.rain.client.extensions.b.getMc().world == null) {
            return;
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler = kotakbaz.rain.client.extensions.b.getMc().getNetworkHandler();
        if (clientPlayNetworkHandler == null) {
            return;
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler2 = clientPlayNetworkHandler;
        ClientPlayerInteractionManager clientPlayerInteractionManager = kotakbaz.rain.client.extensions.b.getMc().interactionManager;
        if (clientPlayerInteractionManager == null) {
            return;
        }
        ClientPlayerInteractionManager clientPlayerInteractionManager2 = clientPlayerInteractionManager;
        long l4 = System.currentTimeMillis();
        if (!clientPlayerEntity2.isAlive() || clientPlayerEntity2.isSpectator()) {
            this.resetCycle(l4);
            return;
        }
        if (PvpSafeModule.INSTANCE.isCombatTagged()) {
            if (d != M.a) {
                this.abortActiveCycle(l4);
            }
            return;
        }
        switch (j.a[d.ordinal()]) {
            case 1: {
                if (l4 < D) {
                    return;
                }
                int n3 = H[15];
                n3 += H[16];
                clientPlayNetworkHandler2.sendChatCommand((String)f[n3 -= H[17]]);
                d = M.A;
                e = l4;
                int n4 = H[18];
                n4 -= H[19];
                E = n4 += H[20];
                break;
            }
            case 2: {
                if (l4 - e > 15000L) {
                    this.resetCycle(l4);
                    return;
                }
                if (!(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof HandledScreen)) {
                    return;
                }
                ScreenHandler screenHandler = clientPlayerEntity2.currentScreenHandler;
                if (screenHandler == null) {
                    return;
                }
                ScreenHandler screenHandler2 = screenHandler;
                int n5 = H[21];
                n5 -= H[22];
                if (E == (n5 += H[23])) {
                    E = screenHandler2.syncId;
                }
                if (l4 - e < 1000L) {
                    return;
                }
                Integer n6 = this.resolveStorageSlot(screenHandler2);
                if (n6 == null) {
                    return;
                }
                int n7 = H[24];
                n7 -= H[25];
                long l5 = l3;
                int n8 = H[27];
                n8 += H[28];
                l3 = l5 ^ ((long)n6.intValue() << (n7 ^= H[26]) ^ l5) & -1L << (n8 -= H[29]);
                int n9 = H[30];
                n9 -= H[31];
                int n10 = H[33];
                n10 -= H[34];
                clientPlayerInteractionManager2.clickSlot(screenHandler2.syncId, (int)(l3 >>> (n9 += H[32])), n10 -= H[35], SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity2);
                d = M.b;
                e = l4;
                break;
            }
            case 3: {
                if (l4 - e > 15000L) {
                    this.resetCycle(l4);
                    return;
                }
                if (!(kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof HandledScreen)) {
                    return;
                }
                ScreenHandler screenHandler = clientPlayerEntity2.currentScreenHandler;
                if (screenHandler == null) {
                    return;
                }
                ScreenHandler screenHandler3 = screenHandler;
                if (screenHandler3.syncId == E) {
                    return;
                }
                if (l4 - e < 1000L) {
                    return;
                }
                Integer n11 = this.resolveConfirmSlot(screenHandler3);
                if (n11 == null) {
                    return;
                }
                int n12 = H[36];
                n12 -= H[37];
                long l6 = l3;
                int n13 = H[39];
                n13 += H[40];
                l3 = l6 ^ ((long)n11.intValue() << (n12 ^= H[38]) ^ l6) & -1L << (n13 += H[41]);
                int n14 = H[42];
                n14 ^= H[43];
                int n15 = H[45];
                n15 ^= H[46];
                clientPlayerInteractionManager2.clickSlot(screenHandler3.syncId, (int)(l3 >>> (n14 -= H[44])), n15 += H[47], SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity2);
                d = M.B;
                e = l4;
                break;
            }
            case 4: {
                if (kotakbaz.rain.client.extensions.b.getMc().currentScreen instanceof HandledScreen) {
                    Screen screen = kotakbaz.rain.client.extensions.b.getMc().currentScreen;
                    if (screen != null) {
                        screen.close();
                    }
                    clientPlayerEntity2.closeHandledScreen();
                    kotakbaz.rain.client.extensions.b.getMc().setScreen(null);
                }
                if (l4 - e <= 2000L) break;
                this.resetCycle(l4);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final void resetCycle(long now) {
        d = M.a;
        D = now + 60000L;
        e = 0L;
        int n2 = H[48];
        n2 -= H[49];
        E = n2 += H[50];
    }

    private final void abortActiveCycle(long now) {
        d = M.a;
        D = now;
        e = 0L;
        int n2 = H[51];
        n2 ^= H[52];
        E = n2 += H[53];
    }

    private final Integer resolveStorageSlot(ScreenHandler handler) {
        int n2;
        long l2 = -6491917424631878439L;
        long l3 = 4013324825728942615L;
        long l4 = 3133327568148364034L;
        Integer n3 = this.getBottomRowSecondSlot(handler);
        if (n3 == null) {
            return null;
        }
        int n4 = H[54];
        n4 += H[55];
        long l5 = l4;
        int n5 = H[57];
        n5 ^= H[58];
        l4 = l5 ^ ((long)n3.intValue() << (n4 += H[56]) ^ l5) & -1L << (n5 -= H[59]);
        int n6 = H[60];
        n6 ^= H[61];
        int n7 = H[63];
        n7 ^= H[64];
        if ((n6 -= H[62]) <= (int)(l4 >>> (n7 -= H[65]))) {
            int n8 = H[66];
            n8 ^= H[67];
            if ((int)(l4 >>> (n8 += H[68])) < ((Collection)handler.slots).size()) {
                int n9 = H[69];
                n9 += H[70];
                n2 = n9 += H[71];
            } else {
                int n10 = H[72];
                n10 += H[73];
                n2 = n10 ^= H[74];
            }
        } else {
            int n11 = H[75];
            n11 ^= H[76];
            n2 = n11 += H[77];
        }
        if (n2 == 0) {
            return null;
        }
        int n12 = H[78];
        n12 += H[79];
        ItemStack itemStack = ((Slot)handler.slots.get((int)(l4 >>> (n12 += H[80])))).getStack();
        if (itemStack.isEmpty()) {
            return null;
        }
        String string = itemStack.getName().getString();
        int n13 = H[81];
        n13 += H[82];
        Intrinsics.checkNotNullExpressionValue(string, (String)f[n13 ^= H[83]]);
        String string2 = string;
        Locale locale = Locale.ROOT;
        int n14 = H[84];
        n14 += H[85];
        Intrinsics.checkNotNullExpressionValue(locale, (String)f[n14 ^= H[86]]);
        String string3 = string2.toLowerCase(locale);
        int n15 = H[87];
        n15 += H[88];
        int n16 = H[90];
        n16 ^= H[91];
        Intrinsics.checkNotNullExpressionValue(string3, (String)f[n15 -= H[89]] + (String)f[n16 -= H[92]]);
        String string4 = string3;
        int n17 = H[93];
        n17 ^= H[94];
        boolean bl = H[96];
        bl -= H[97];
        int n18 = H[99];
        n18 ^= H[100];
        if (!StringsKt.contains$default((CharSequence)string4, (String)f[n17 += H[95]], bl ^= H[98], n18 -= H[101], null)) {
            return null;
        }
        int n19 = H[102];
        n19 += H[103];
        return (int)(l4 >>> (n19 ^= H[104]));
    }

    private final Integer resolveConfirmSlot(ScreenHandler handler) {
        int n2;
        long l2 = -6528443663588394548L;
        long l3 = 4191540400397101976L;
        long l4 = -1215383828727623253L;
        Integer n3 = this.getBottomRowPenultimateSlot(handler);
        if (n3 == null) {
            return null;
        }
        int n4 = H[105];
        n4 -= H[106];
        long l5 = l4;
        int n5 = H[108];
        n5 += H[109];
        l4 = l5 ^ ((long)n3.intValue() << (n4 -= H[107]) ^ l5) & -1L << (n5 -= H[110]);
        int n6 = H[111];
        n6 ^= H[112];
        int n7 = H[114];
        n7 += H[115];
        if ((n6 += H[113]) <= (int)(l4 >>> (n7 -= H[116]))) {
            int n8 = H[117];
            n8 += H[118];
            if ((int)(l4 >>> (n8 -= H[119])) < ((Collection)handler.slots).size()) {
                int n9 = H[120];
                n9 += H[121];
                n2 = n9 -= H[122];
            } else {
                int n10 = H[123];
                n10 += H[124];
                n2 = n10 ^= H[125];
            }
        } else {
            int n11 = H[126];
            n11 += H[127];
            n2 = n11 += H[128];
        }
        if (n2 == 0) {
            return null;
        }
        int n12 = H[129];
        n12 ^= H[130];
        if (((Slot)handler.slots.get((int)(l4 >>> (n12 -= H[131])))).getStack().isEmpty()) {
            return null;
        }
        int n13 = H[132];
        n13 -= H[133];
        return (int)(l4 >>> (n13 ^= H[134]));
    }

    private final Integer getBottomRowSecondSlot(ScreenHandler handler) {
        long l2 = -1945943034276373640L;
        Integer n2 = this.getContainerSlotCount(handler);
        if (n2 == null) {
            return null;
        }
        int n3 = H[135];
        n3 -= H[136];
        long l3 = l2;
        int n4 = H[138];
        n4 ^= H[139];
        l2 = l3 ^ ((long)n2.intValue() << (n3 ^= H[137]) ^ l3) & -1L << (n4 += H[140]);
        int n5 = H[141];
        n5 ^= H[142];
        int n6 = H[144];
        n6 += H[145];
        return (int)(l2 >>> (n5 -= H[143])) - (n6 -= H[146]);
    }

    private final Integer getBottomRowPenultimateSlot(ScreenHandler handler) {
        long l2 = -4157216684769265141L;
        Integer n2 = this.getContainerSlotCount(handler);
        if (n2 == null) {
            return null;
        }
        int n3 = H[147];
        n3 -= H[148];
        long l3 = l2;
        int n4 = H[150];
        n4 += H[151];
        l2 = l3 ^ ((long)n2.intValue() << (n3 ^= H[149]) ^ l3) & -1L << (n4 += H[152]);
        int n5 = H[153];
        n5 ^= H[154];
        int n6 = H[156];
        n6 += H[157];
        return (int)(l2 >>> (n5 ^= H[155])) - (n6 += H[158]);
    }

    private final Integer getContainerSlotCount(ScreenHandler handler) {
        long l2;
        block3: {
            block2: {
                long l3 = -7363475181303505778L;
                l2 = -7512722872956256504L;
                int n2 = H[159];
                n2 -= H[160];
                n2 += H[161];
                int n3 = H[162];
                n3 += H[163];
                long l4 = l2;
                int n4 = H[165];
                n4 += H[166];
                l2 = l4 ^ ((long)(handler.slots.size() - n2) << (n3 ^= H[164]) ^ l4) & -1L << (n4 -= H[167]);
                int n5 = H[168];
                n5 -= H[169];
                if ((int)(l2 >>> (n5 ^= H[170])) <= 0) break block2;
                int n6 = H[171];
                n6 += H[172];
                int n7 = H[174];
                n7 += H[175];
                if ((int)(l2 >>> (n6 ^= H[173])) % (n7 ^= H[176]) == 0) break block3;
            }
            return null;
        }
        int n8 = H[177];
        n8 ^= H[178];
        return (int)(l2 >>> (n8 += H[179]));
    }

    static {
        AutoReissueModule.b();
        long l2 = -7052780272299675769L;
        long l3 = -2217792297020621999L;
        long l4 = -5401414005727386421L;
        long l5 = 4023961866418627647L;
        long l6 = 5363536292894972074L;
        long l7 = 450752119923098410L;
        long l8 = 3355624514787950293L;
        long l9 = -1084868324222324744L;
        long l10 = -885199460898066161L;
        long l11 = -8200531476041785098L;
        long l12 = 5240752041049797923L;
        long l13 = 2151213732377273322L;
        long l14 = -6299102861424021992L;
        long l15 = -5430691750551284632L;
        int n2 = H[180];
        n2 ^= H[181];
        f = new Object[n2 -= H[182]];
        long l16 = l15;
        int n3 = H[183];
        n3 -= H[184];
        l15 = l16 ^ (0L ^ l16) & -1L << (n3 ^= H[185]);
        Object[] objectArray = new Object[H[186]];
        objectArray[AutoReissueModule.H[187]] = F;
        objectArray[AutoReissueModule.H[188]] = H[189];
        int n4 = H[190];
        Object object = AutoReissueModule.A()[H[191]];
        if (object == null) {
            char[] cArray = "\u2b37\u28cb\u28cd\u28da\u2b2f\u28d3\u28c5\u28d0\u28f3\u2b2a\u2b2c\u28d8\u28d7\u28d8\u28d5\u2b38\u28d4\u2b24\u28ca\u28f8\u2b31\u28c8\u28fb\u2b21\u2b35\u28c6\u28da\u28c9\u28d4\u2b39\u2b2d\u2b29\u28f0\u28c1\u28fb\u28c1\u28cb\u28fa\u2b27\u28f1\u28cb\u2b38\u28d1\u28db\u2b38\u28d6\u2b28\u28c7\u2b32\u2b32\u2b30\u28c0\u28d6\u28cd\u28c9\u28d6\u28d8\u28ca\u28d4\u2b39\u28da\u2b32\u2b2a\u2b32\u28f8\u28f7\u28f5\u28fb\u2b2b\u28ca\u2b27\u2b36\u2b3b\u28f1\u28c5\u2b2a\u28f0\u28c8\u2b2a\u2b32\u28d3\u28f0\u2b2a\u2b2e\u28d8\u2b38\u2b36\u28c8\u2b3a\u2b24\u2b31\u28cc\u28f6\u28f7\u2b2b\u2b29\u2b39\u2b29\u28f4\u2b2f\u28d4\u28ce\u2b27\u28f6\u2b2c\u28cf\u28d7\u28d6\u28f2\u28cd\u28f1\u28f0\u28d4\u28c4\u28d4\u28cd\u28c1\u28ce\u28f5\u2b35\u2b30\u2b32\u2b2d\u2b2c\u2b24\u28d8\u2b28\u2b24\u28ee\u28cf\u2b39\u28f3\u2b2c\u28f7\u28d3\u28db\u28f3\u2b21\u28c9\u2b35\u28f0\u2b2e\u28d5\u2b39\u28f4\u28d5\u2b36\u2b32\u2b31\u28c0\u2b25\u28ee\u28c8\u28f6\u2b25\u28f2\u28d4\u28f2\u28ca\u28fa\u28ca\u28d4\u28cf\u28c7\u2b3b\u2b2b\u28d7\u2b27\u28c4\u28c6\u28cb\u28cc\u28d5\u28c6\u2b2e\u28d3\u2b37\u2b31\u28d0\u2b2c\u28c7\u28f7\u28c7\u28fa\u28f7\u2b3b\u28d0\u28cf\u28c0\u28f7\u28f5\u2b28\u28d1\u28c4\u28cf\u28c6\u2b27\u2b2b\u2b26\u28c6\u28c8\u28d6\u28ca\u28cc\u2b28\u28ce\u28fb\u28f0\u2b2f\u2b3a\u2b21\u28f3\u28f5\u28d8\u28d1\u2b32\u2b2e\u28cc\u28d1\u28c5\u28c5\u2b37\u2b30\u2b33\u2b31\u28d4\u28ce\u2b36\u28cd\u2b27\u28c6\u28c4\u28d2\u28cc\u2b2d\u2b29\u28c9\u2b2c\u28d0\u28f6\u2b36\u2b20\u28d7\u2b2e\u28fb\u2b2b\u2b27\u28d2\u2b33\u28d2\u28d0\u2b26\u2b36\u2b2f\u28cf\u28c7".toCharArray();
            for (int i2 = H[192]; i2 < H[193]; ++i2) {
                int n5 = cArray[i2];
                n5 ^= H[194];
                n5 -= H[195];
                n5 ^= H[196];
                n5 += H[197];
                n5 -= H[198];
                n5 -= H[199];
                n5 += H[200];
                n5 += H[201];
                n5 -= H[202];
                n5 -= H[203];
                n5 -= H[204];
                n5 -= H[205];
                n5 -= H[206];
                n5 -= H[207];
                n5 += H[208];
                cArray[i2] = (char)(n5 -= H[209]);
            }
            object = AutoReissueModule.A()[AutoReissueModule.H[210]] = new String(cArray);
        }
        objectArray[n4] = (String)object;
        char[] cArray = ((String)AutoReissueModule.a(objectArray)).toCharArray();
        long l17 = l6;
        int n6 = H[211];
        n6 -= H[212];
        l6 = l17 ^ (0x7A00000000L ^ l17) & -1L << (n6 -= H[213]);
        long l18 = l13;
        int n7 = H[214];
        n7 -= H[215];
        l13 = l18 ^ (0L ^ l18) & -1L >>> (n7 ^= H[216]);
        while (true) {
            int n8 = H[217];
            n8 -= H[218];
            if ((int)l13 >= (int)(l6 >>> (n8 += H[219]))) break;
            int n9 = (int)l13;
            long l19 = l13;
            int n10 = H[220];
            n10 ^= H[221];
            int n11 = H[223];
            l13 = l19 ^ (l19 ^ l19 + (long)(n10 ^= H[222])) & -1L >>> (n11 -= H[224]);
            long l20 = l9;
            int n12 = H[225];
            n12 ^= H[226];
            l9 = l20 ^ ((long)cArray[n9] ^ l20) & -1L >>> (n12 ^= H[227]);
            int n13 = (int)l13;
            long l21 = l13;
            int n14 = H[228];
            n14 -= H[229];
            int n15 = H[231];
            n15 += H[232];
            l13 = l21 ^ (l21 ^ l21 + (long)(n14 ^= H[230])) & -1L >>> (n15 -= H[233]);
            int n16 = H[234];
            n16 ^= H[235];
            long l22 = l10;
            int n17 = H[237];
            n17 += H[238];
            l10 = l22 ^ ((long)cArray[n13] << (n16 += H[236]) ^ l22) & -1L << (n17 ^= H[239]);
            int n18 = H[240];
            n18 -= H[241];
            n18 += H[242];
            int n19 = H[243];
            n19 ^= H[244];
            long l23 = l12;
            int n20 = H[246];
            n20 ^= H[247];
            l12 = l23 ^ ((long)((int)l9 << n18 | (int)(l10 >>> (n19 -= H[245]))) ^ l23) & -1L >>> (n20 ^= H[248]);
            char[] cArray2 = new char[(int)l12];
            long l24 = l14;
            int n21 = H[249];
            n21 ^= H[250];
            l14 = l24 ^ (0L ^ l24) & -1L << (n21 -= H[251]);
            while (true) {
                int n22 = H[252];
                n22 -= H[253];
                if ((int)(l14 >>> (n22 ^= H[254])) >= (int)l12) break;
                int n23 = H[255];
                n23 -= H[256];
                int n24 = H[258];
                n24 ^= H[259];
                cArray2[(int)(l14 >>> (n23 ^= AutoReissueModule.H[257]))] = cArray[(int)l13 + (int)(l14 >>> (n24 ^= H[260]))];
                l14 += 0x100000000L;
            }
            int n25 = H[261];
            n25 -= H[262];
            int n26 = (int)(l15 >>> (n25 += H[263]));
            l15 += 0x100000000L;
            AutoReissueModule.f[n26] = new String(cArray2);
            long l25 = l13;
            int n27 = H[264];
            n27 -= H[265];
            l13 = l25 ^ ((long)((int)l13 + (int)l12) ^ l25) & -1L >>> (n27 ^= H[266]);
        }
        INSTANCE = new AutoReissueModule();
        int n28 = H[267];
        n28 ^= H[268];
        FuntimeRestrict.moduleOnFuntime$default(FuntimeRestrict.INSTANCE, INSTANCE, null, n28 += H[269], null);
        d = M.a;
        int n29 = H[270];
        n29 -= H[271];
        E = n29 -= H[272];
    }

    public static Object a(Object[] object) {
        Object object2;
        int n2 = (Integer)object[H[273]];
        String string = (String)object[H[274]];
        object = object[H[275]];
        Object[] objectArray = G;
        if (G == null) {
            objectArray = G = new Object[H[276]];
        }
        if ((object2 = objectArray[n2]) == null) {
            Object object3 = object;
            if (object == null) {
                Object[] objectArray2 = new Object[H[277]];
                F = objectArray2;
                object3 = objectArray2;
                byte[] byArray = new byte[H[279] ^ H[280]];
                byArray[AutoReissueModule.H[281] ^ AutoReissueModule.H[282]] = H[283] ^ H[284];
                byArray[AutoReissueModule.H[285] ^ AutoReissueModule.H[286]] = H[287] ^ H[288];
                byArray[AutoReissueModule.H[289] ^ AutoReissueModule.H[290]] = H[291] ^ H[292];
                byArray[AutoReissueModule.H[293] ^ AutoReissueModule.H[294]] = H[295] ^ H[296];
                byArray[AutoReissueModule.H[297] ^ AutoReissueModule.H[298]] = H[299] ^ H[300];
                byArray[AutoReissueModule.H[301] ^ AutoReissueModule.H[302]] = H[303] ^ H[304];
                byArray[AutoReissueModule.H[305] ^ AutoReissueModule.H[306]] = H[307] ^ H[308];
                byArray[AutoReissueModule.H[309] ^ AutoReissueModule.H[310]] = H[311] ^ H[312];
                byArray[AutoReissueModule.H[313] ^ AutoReissueModule.H[314]] = H[315] ^ H[316];
                byArray[AutoReissueModule.H[317] ^ AutoReissueModule.H[318]] = H[319] ^ H[320];
                byArray[AutoReissueModule.H[321] ^ AutoReissueModule.H[322]] = H[323] ^ H[324];
                byArray[AutoReissueModule.H[325] ^ AutoReissueModule.H[326]] = H[327] ^ H[328];
                byArray[AutoReissueModule.H[329] ^ AutoReissueModule.H[330]] = H[331] ^ H[332];
                byArray[AutoReissueModule.H[333] ^ AutoReissueModule.H[334]] = H[335] ^ H[336];
                byArray[AutoReissueModule.H[337] ^ AutoReissueModule.H[338]] = H[339] ^ H[340];
                byArray[AutoReissueModule.H[341] ^ AutoReissueModule.H[342]] = H[343] ^ H[344];
                objectArray2[AutoReissueModule.H[278]] = byArray;
            }
            byte[] byArray = (byte[])object3[H[345]];
            if (g == null) {
                byte[] byArray2 = new byte[H[346] ^ H[347]];
                byArray2[AutoReissueModule.H[348] ^ AutoReissueModule.H[349]] = H[350] ^ H[351];
                byArray2[AutoReissueModule.H[352] ^ AutoReissueModule.H[353]] = H[354] ^ H[355];
                byArray2[AutoReissueModule.H[356] ^ AutoReissueModule.H[357]] = H[358] ^ H[359];
                byArray2[AutoReissueModule.H[360] ^ AutoReissueModule.H[361]] = H[362] ^ H[363];
                byArray2[AutoReissueModule.H[364] ^ AutoReissueModule.H[365]] = H[366] ^ H[367];
                byArray2[AutoReissueModule.H[368] ^ AutoReissueModule.H[369]] = H[370] ^ H[371];
                byArray2[AutoReissueModule.H[372] ^ AutoReissueModule.H[373]] = H[374] ^ H[375];
                byArray2[AutoReissueModule.H[376] ^ AutoReissueModule.H[377]] = H[378] ^ H[379];
                byArray2[AutoReissueModule.H[380] ^ AutoReissueModule.H[381]] = H[382] ^ H[383];
                byArray2[AutoReissueModule.H[384] ^ AutoReissueModule.H[385]] = H[386] ^ H[387];
                byArray2[AutoReissueModule.H[388] ^ AutoReissueModule.H[389]] = H[390] ^ H[391];
                byArray2[AutoReissueModule.H[392] ^ AutoReissueModule.H[393]] = H[394] ^ H[395];
                byArray2[AutoReissueModule.H[396] ^ AutoReissueModule.H[397]] = H[398] ^ H[399];
                byArray2[0x10797 ^ 0x10790] = 0xFFFEF85E ^ 0x10790;
                byArray2[0xA599 ^ 0xA596] = 0xA587 ^ 0xA596;
                byArray2[0x9FF9 ^ 0x9FFF] = 0x9FC0 ^ 0x9FFF;
                byArray2[0x1CE2 ^ 0x1CF1] = 0xFFFFE322 ^ 0x1CF1;
                byArray2[0x40A ^ 0x40F] = 0xFFFFFBC1 ^ 0x40F;
                byArray2[0xBF25 ^ 0xBF29] = 0xBF4B ^ 0xBF29;
                byArray2[0xA6FA ^ 0xA6E4] = 0xFFFF595C ^ 0xA6E4;
                byArray2[0xA01E ^ 0xA004] = 0xFFFF5FB6 ^ 0xA004;
                byArray2[0x9845 ^ 0x9848] = 0xFFFF67AF ^ 0x9848;
                byArray2[0x55D0 ^ 0x55CD] = 0x55CC ^ 0x55CD;
                byArray2[0xE1B8 ^ 0xE1B0] = 0xE1F3 ^ 0xE1B0;
                byArray2[0x19EA ^ 0x19E1] = 0xFFFFE641 ^ 0x19E1;
                byArray2[0x808B ^ 0x8090] = 0xFFFF7F3D ^ 0x8090;
                byArray2[0x727E ^ 0x7270] = 0xFFFF8D99 ^ 0x7270;
                byArray2[0x5BA2 ^ 0x5BBA] = 0x5B9E ^ 0x5BBA;
                byArray2[0x9DF6 ^ 0x9DE7] = 0x9DD9 ^ 0x9DE7;
                byArray2[0xD162 ^ 0xD161] = 0xFFFF2E84 ^ 0xD161;
                byArray2[0x4733 ^ 0x4723] = 0x4771 ^ 0x4723;
                byArray2[0x3872 ^ 0x3870] = 0xFFFFC7DC ^ 0x3870;
                byte[] byArray3 = new byte[byArray.length + byArray2.length];
                System.arraycopy(byArray, 0, byArray3, 0, byArray.length);
                System.arraycopy(byArray2, 0, byArray3, byArray.length, byArray2.length);
                Object object4 = AutoReissueModule.A()[1];
                if (object4 == null) {
                    char[] cArray = "\u679d\u678f\u6796\u6789\u678b\u66bf\u67aa\u67f4\u67f9\u67f5\u6795\u67d0\u67ec\u67ee\u679e\u6795\u678c\u66bc".toCharArray();
                    for (int i2 = 0; i2 < 18; ++i2) {
                        int n3 = cArray[i2];
                        n3 -= 65218;
                        n3 += 67;
                        n3 += 41924;
                        n3 -= 21893;
                        n3 ^= 0x76CC;
                        n3 -= 41132;
                        n3 ^= 0xE48E;
                        n3 += 48593;
                        n3 += 42451;
                        n3 += 35091;
                        n3 += 29460;
                        n3 ^= 0x41FB;
                        n3 ^= 0x841C;
                        cArray[i2] = (char)(n3 += 7807);
                    }
                    object4 = AutoReissueModule.A()[1] = new String(cArray);
                }
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance((String)object4);
                byte[] byArray4 = new byte[16];
                byArray4[10] = -13;
                byArray4[8] = 38;
                byArray4[7] = 21;
                byArray4[11] = 118;
                byArray4[3] = -78;
                byArray4[12] = 102;
                byArray4[15] = -70;
                byArray4[1] = 55;
                byArray4[4] = -91;
                byArray4[2] = 47;
                byArray4[9] = -60;
                byArray4[0] = 23;
                byArray4[14] = 96;
                byArray4[13] = 127;
                byArray4[6] = -7;
                byArray4[5] = -52;
                PBEKeySpec pBEKeySpec = new PBEKeySpec(new String(byArray3, StandardCharsets.UTF_8).toCharArray(), byArray4, 14, 256);
                byte[] byArray5 = secretKeyFactory.generateSecret(pBEKeySpec).getEncoded();
                Object object5 = AutoReissueModule.A()[2];
                if (object5 == null) {
                    char[] cArray = "\u6992\u6766\u6984".toCharArray();
                    for (int i3 = 0; i3 < 3; ++i3) {
                        int n4 = cArray[i3];
                        n4 += 33953;
                        n4 ^= 0xD002;
                        n4 -= 8423;
                        n4 += 61546;
                        n4 += 55114;
                        n4 -= 14826;
                        n4 ^= 0x9AED;
                        n4 -= 21902;
                        n4 -= 54737;
                        n4 -= 20853;
                        n4 -= 9077;
                        n4 -= 61045;
                        n4 += 47639;
                        n4 ^= 0x7CF7;
                        cArray[i3] = (char)(n4 += 56988);
                    }
                    object5 = AutoReissueModule.A()[2] = new String(cArray);
                }
                g = new SecretKeySpec(byArray5, (String)object5);
            }
            byte[] byArray6 = Base64.getDecoder().decode(string);
            byte[] byArray7 = Arrays.copyOfRange(byArray6, 0, 16);
            byte[] byArray8 = Arrays.copyOfRange(byArray6, 16, byArray6.length);
            Object object6 = AutoReissueModule.A()[3];
            if (object6 == null) {
                char[] cArray = "\u1b59\u1b35\u1b47\u1b6b\u1b57\u1b58\u1b57\u1b6b\u1b4a\u1b2f\u1b57\u1b47\u1b45\u1b4a\u1b39\u1a96\u1a96\u1a91\u1aac\u1a93".toCharArray();
                for (int i4 = 0; i4 < 20; ++i4) {
                    int n5 = cArray[i4];
                    n5 -= 22881;
                    n5 -= 32449;
                    n5 += 3219;
                    n5 ^= 0x3574;
                    n5 -= 56886;
                    n5 -= 40377;
                    n5 -= 3961;
                    n5 ^= 0x29CB;
                    n5 += 42908;
                    n5 += 43596;
                    cArray[i4] = (char)(n5 += 59324);
                }
                object6 = AutoReissueModule.A()[3] = new String(cArray);
            }
            Cipher cipher = Cipher.getInstance((String)object6);
            cipher.init(2, (Key)((SecretKey)g), new IvParameterSpec(byArray7));
            byte[] byArray9 = cipher.doFinal(byArray8);
            object2 = new String(byArray9, StandardCharsets.UTF_8);
        }
        return object2;
    }

    private static Object[] A() {
        Object[] objectArray = h;
        if (h == null) {
            h = new Object[4];
            objectArray = h;
        }
        return objectArray;
    }

    public static void b() {
        H = new int[0x16C9 ^ 0x1759];
        AutoReissueModule.H[0x2F87 ^ 0x2E02] = 0x1A8 ^ 0x2E02;
        AutoReissueModule.H[0x2F48 ^ 0x2E31] = 0x125EE ^ 0x2E31;
        AutoReissueModule.H[0xE569 ^ 0xE536] = 0xFFFF1AC0 ^ 0xE536;
        AutoReissueModule.H[0xE30C ^ 0xE3EE] = 0xE39E ^ 0xE3EE;
        AutoReissueModule.H[0xFF1F ^ 0xFE47] = 0xBA9F ^ 0xFE47;
        AutoReissueModule.H[0xD8B6 ^ 0xD853] = 0xFFFF27FE ^ 0xD853;
        AutoReissueModule.H[0xD192 ^ 0xD01D] = 0x56D0 ^ 0xD01D;
        AutoReissueModule.H[0x6D33 ^ 0x6D65] = 0xFFFF92D6 ^ 0x6D65;
        AutoReissueModule.H[0x1F20 ^ 0x1FDC] = 0xFFFFE0FC ^ 0x1FDC;
        AutoReissueModule.H[0xBFC3 ^ 0xBED3] = 0xBE85 ^ 0xBED3;
        AutoReissueModule.H[0xF5F9 ^ 0xF4A0] = 0xF4A0 ^ 0xF4A0;
        AutoReissueModule.H[0xC01B ^ 0xC01A] = 0xFFFF3FCB ^ 0xC01A;
        AutoReissueModule.H[0x289E ^ 0x282C] = 0x2869 ^ 0x282C;
        AutoReissueModule.H[0xD42B ^ 0xD460] = 0xFFFF2B80 ^ 0xD460;
        AutoReissueModule.H[0x2F17 ^ 0x2FDB] = 0x32B ^ 0x2FDB;
        AutoReissueModule.H[0x735 ^ 0x784] = 0xFFFFF828 ^ 0x784;
        AutoReissueModule.H[0x9F9A ^ 0x9F6A] = 0x9F8B ^ 0x9F6A;
        AutoReissueModule.H[0x7C78 ^ 0x7D76] = 0x7D23 ^ 0x7D76;
        AutoReissueModule.H[0xB5B8 ^ 0xB4F5] = 0xD977 ^ 0xB4F5;
        AutoReissueModule.H[0xA083 ^ 0xA1BE] = 0x2471 ^ 0xA1BE;
        AutoReissueModule.H[0xBEA9 ^ 0xBFD4] = 0x5FFA ^ 0xBFD4;
        AutoReissueModule.H[0xB868 ^ 0xB863] = 0xFFFF47A1 ^ 0xB863;
        AutoReissueModule.H[0x72C0 ^ 0x72B1] = 0x72D8 ^ 0x72B1;
        AutoReissueModule.H[0x9D7D ^ 0x9DA8] = 0xFFFF6238 ^ 0x9DA8;
        AutoReissueModule.H[0xB5A7 ^ 0xB5C0] = 0xB5F5 ^ 0xB5C0;
        AutoReissueModule.H[0x4916 ^ 0x4833] = 0x4716 ^ 0x4833;
        AutoReissueModule.H[0x1822 ^ 0x1834] = 0xFFFFE79E ^ 0x1834;
        AutoReissueModule.H[0x10AC2 ^ 0x10BD7] = 0x10BD6 ^ 0x10BD7;
        AutoReissueModule.H[0x7E08 ^ 0x7EAB] = 0x7EE9 ^ 0x7EAB;
        AutoReissueModule.H[0x10870 ^ 0x10821] = 0xFFFEF7D6 ^ 0x10821;
        AutoReissueModule.H[0x9294 ^ 0x9205] = 0x9220 ^ 0x9205;
        AutoReissueModule.H[0xAEE2 ^ 0xAFE0] = 0xAFBA ^ 0xAFE0;
        AutoReissueModule.H[0x6766 ^ 0x6763] = 0x6722 ^ 0x6763;
        AutoReissueModule.H[0xDC8 ^ 0xDF2] = 0xFFFFF21F ^ 0xDF2;
        AutoReissueModule.H[0xFBD5 ^ 0xFA83] = 0xBE5B ^ 0xFA83;
        AutoReissueModule.H[0x58DC ^ 0x58CD] = 0x58F6 ^ 0x58CD;
        AutoReissueModule.H[0xC3B5 ^ 0xC38E] = 0xFFFF3C35 ^ 0xC38E;
        AutoReissueModule.H[0x4E7B ^ 0x4F31] = 0x479A ^ 0x4F31;
        AutoReissueModule.H[0xAFE7 ^ 0xAEA4] = 0x14E9 ^ 0xAEA4;
        AutoReissueModule.H[0x87BB ^ 0x879D] = 0xFFFF786B ^ 0x879D;
        AutoReissueModule.H[0x830A ^ 0x838F] = 0x83F2 ^ 0x838F;
        AutoReissueModule.H[0x6E60 ^ 0x6E5D] = 0x6E3D ^ 0x6E5D;
        AutoReissueModule.H[0x89EF ^ 0x88FD] = 0x88FF ^ 0x88FD;
        AutoReissueModule.H[0x8593 ^ 0x853A] = 0xFFFF7AE3 ^ 0x853A;
        AutoReissueModule.H[0xDD3A ^ 0xDC64] = 0xB5FF ^ 0xDC64;
        AutoReissueModule.H[0x1A4E ^ 0x1B50] = 0x8010 ^ 0x1B50;
        AutoReissueModule.H[0xFE44 ^ 0xFEAE] = 0xFE97 ^ 0xFEAE;
        AutoReissueModule.H[0x4B60 ^ 0x4BCA] = 0xFFFFB439 ^ 0x4BCA;
        AutoReissueModule.H[0x878 ^ 0x887] = 0xFFFFF75A ^ 0x887;
        AutoReissueModule.H[0xD367 ^ 0xD211] = 0x8EF3 ^ 0xD211;
        AutoReissueModule.H[0xACB3 ^ 0xAC8A] = 0xACBC ^ 0xAC8A;
        AutoReissueModule.H[0x3DDE ^ 0x3DEA] = 0xFFFFC20D ^ 0x3DEA;
        AutoReissueModule.H[0x10104 ^ 0x10030] = 0x1353C ^ 0x10030;
        AutoReissueModule.H[0xED01 ^ 0xED09] = 0xED7E ^ 0xED09;
        AutoReissueModule.H[0x814 ^ 0x941] = 0x4D93 ^ 0x941;
        AutoReissueModule.H[0xBBB5 ^ 0xBBB9] = 0xFFFF445C ^ 0xBBB9;
        AutoReissueModule.H[0x12D7 ^ 0x1356] = 0x833D ^ 0x1356;
        AutoReissueModule.H[0x9867 ^ 0x993C] = 0xCFE0 ^ 0x993C;
        AutoReissueModule.H[0x49DA ^ 0x49A8] = 0x499D ^ 0x49A8;
        AutoReissueModule.H[0x71B0 ^ 0x7115] = 0x716C ^ 0x7115;
        AutoReissueModule.H[0x7626 ^ 0x7601] = 0x7708 ^ 0x7601;
        AutoReissueModule.H[0xD776 ^ 0xD67B] = 0xD627 ^ 0xD67B;
        AutoReissueModule.H[0x25E3 ^ 0x24A5] = 0xC117 ^ 0x24A5;
        AutoReissueModule.H[0x273C ^ 0x274C] = 0xFFFFD8AA ^ 0x274C;
        AutoReissueModule.H[0x8A2A ^ 0x8AE5] = 0x49BE ^ 0x8AE5;
        AutoReissueModule.H[0x76C4 ^ 0x77FE] = 0x9E4F ^ 0x77FE;
        AutoReissueModule.H[0xE028 ^ 0xE143] = 0xA7E2 ^ 0xE143;
        AutoReissueModule.H[0xFBC4 ^ 0xFBAD] = 0xFFFF0462 ^ 0xFBAD;
        AutoReissueModule.H[0x1013C ^ 0x100BF] = 0x190D4 ^ 0x100BF;
        AutoReissueModule.H[0x9ADE ^ 0x9A78] = 0xFFFF658D ^ 0x9A78;
        AutoReissueModule.H[0xC899 ^ 0xC995] = 0xFFFF3610 ^ 0xC995;
        AutoReissueModule.H[0x9F3F ^ 0x9E55] = 0xFFFF2701 ^ 0x9E55;
        AutoReissueModule.H[0x3855 ^ 0x3972] = 0x366B ^ 0x3972;
        AutoReissueModule.H[0xA073 ^ 0xA008] = 0xFFFF5FE6 ^ 0xA008;
        AutoReissueModule.H[0x1CB3 ^ 0x1CB5] = 0x1CB8 ^ 0x1CB5;
        AutoReissueModule.H[0x5272 ^ 0x5371] = 0xFFFFACEA ^ 0x5371;
        AutoReissueModule.H[0x9B27 ^ 0x9B59] = 0x9B29 ^ 0x9B59;
        AutoReissueModule.H[0xB553 ^ 0xB47E] = 0xDDB6 ^ 0xB47E;
        AutoReissueModule.H[0x8DF7 ^ 0x8C82] = 0xD063 ^ 0x8C82;
        AutoReissueModule.H[0x1D4A ^ 0x1D00] = 0xFFFFE291 ^ 0x1D00;
        AutoReissueModule.H[0x7E0B ^ 0x7F6C] = 0x7D35 ^ 0x7F6C;
        AutoReissueModule.H[0x8DB7 ^ 0x8D9E] = 0xFFFF7216 ^ 0x8D9E;
        AutoReissueModule.H[0xAD03 ^ 0xAD40] = 0xAD41 ^ 0xAD40;
        AutoReissueModule.H[0xB4A5 ^ 0xB52B] = 0xFFFFCC24 ^ 0xB52B;
        AutoReissueModule.H[0xB634 ^ 0xB746] = 0xF5F8 ^ 0xB746;
        AutoReissueModule.H[0xE279 ^ 0xE32E] = 0xFFFF584A ^ 0xE32E;
        AutoReissueModule.H[0xC58D ^ 0xC4C9] = 0x7E8F ^ 0xC4C9;
        AutoReissueModule.H[0x6F44 ^ 0x6F03] = 0x6F1D ^ 0x6F03;
        AutoReissueModule.H[0x54AF ^ 0x55E8] = 0xFFFF4FBA ^ 0x55E8;
        AutoReissueModule.H[0x5E17 ^ 0x5E68] = 0xFFFFA1A6 ^ 0x5E68;
        AutoReissueModule.H[0x1BCC ^ 0x1AAD] = 0x11190 ^ 0x1AAD;
        AutoReissueModule.H[0xAF71 ^ 0xAF25] = 0xAF2A ^ 0xAF25;
        AutoReissueModule.H[0xAB36 ^ 0xAB1E] = 0xFFFF5491 ^ 0xAB1E;
        AutoReissueModule.H[0x327F ^ 0x3377] = 0xFFFFCC9D ^ 0x3377;
        AutoReissueModule.H[0x808E ^ 0x80D2] = 0x80B9 ^ 0x80D2;
        AutoReissueModule.H[0x9D86 ^ 0x9D0C] = 0x9D3B ^ 0x9D0C;
        AutoReissueModule.H[0x10019 ^ 0x100C5] = 0xFFFEFF06 ^ 0x100C5;
        AutoReissueModule.H[0x9A14 ^ 0x9AC6] = 0x9AC6 ^ 0x9AC6;
        AutoReissueModule.H[0x8D7D ^ 0x8D65] = 0xFFFF7295 ^ 0x8D65;
        AutoReissueModule.H[0x28C7 ^ 0x2819] = 0xFFFFD7FE ^ 0x2819;
        AutoReissueModule.H[0xD592 ^ 0xD541] = 0xFFFF2A17 ^ 0xD541;
        AutoReissueModule.H[0x8BCD ^ 0x8B42] = 0xFFFF74B7 ^ 0x8B42;
        AutoReissueModule.H[0xE148 ^ 0xE055] = 0x7B16 ^ 0xE055;
        AutoReissueModule.H[0xB3EF ^ 0xB29F] = 0xF06B ^ 0xB29F;
        AutoReissueModule.H[0x7F6F ^ 0x7F57] = 0x7F74 ^ 0x7F57;
        AutoReissueModule.H[0x1080E ^ 0x10979] = 0x15598 ^ 0x10979;
        AutoReissueModule.H[0x5CFD ^ 0x5C92] = 0x5CE3 ^ 0x5C92;
        AutoReissueModule.H[0x986D ^ 0x99E4] = 0x6629 ^ 0x99E4;
        AutoReissueModule.H[0x1708 ^ 0x1603] = 0x1620 ^ 0x1603;
        AutoReissueModule.H[0xC471 ^ 0xC4EF] = 0xFFFF3B4A ^ 0xC4EF;
        AutoReissueModule.H[0x9227 ^ 0x9344] = 0x19879 ^ 0x9344;
        AutoReissueModule.H[0x107B6 ^ 0x10798] = 0x107BD ^ 0x10798;
        AutoReissueModule.H[0xAA22 ^ 0xAB0E] = 0x3821 ^ 0xAB0E;
        AutoReissueModule.H[0x653B ^ 0x6405] = 0xE1C4 ^ 0x6405;
        AutoReissueModule.H[0xD91E ^ 0xD917] = 0xD93C ^ 0xD917;
        AutoReissueModule.H[0x2A2E ^ 0x2B7A] = 0x9EBA ^ 0x2B7A;
        AutoReissueModule.H[0xE632 ^ 0xE6C9] = 0xE686 ^ 0xE6C9;
        AutoReissueModule.H[0xE700 ^ 0xE67C] = 0x65B ^ 0xE67C;
        AutoReissueModule.H[0x1046D ^ 0x104D7] = 0x104D4 ^ 0x104D7;
        AutoReissueModule.H[0xB094 ^ 0xB193] = 0xB1C8 ^ 0xB193;
        AutoReissueModule.H[0xE8A7 ^ 0xE88D] = 0xFFFF1705 ^ 0xE88D;
        AutoReissueModule.H[0x28D9 ^ 0x2845] = 0x2833 ^ 0x2845;
        AutoReissueModule.H[0xCDA7 ^ 0xCD61] = 0xBA07 ^ 0xCD61;
        AutoReissueModule.H[0x1313 ^ 0x1381] = 0x1397 ^ 0x1381;
        AutoReissueModule.H[0x8557 ^ 0x85DF] = 0x85E9 ^ 0x85DF;
        AutoReissueModule.H[0x33F5 ^ 0x3298] = 0x412A ^ 0x3298;
        AutoReissueModule.H[0xD0DF ^ 0xD1E9] = 0xA755 ^ 0xD1E9;
        AutoReissueModule.H[0x98A2 ^ 0x98F8] = 0xFFFF6707 ^ 0x98F8;
        AutoReissueModule.H[0x6A42 ^ 0x6A11] = 0x6A4E ^ 0x6A11;
        AutoReissueModule.H[0xAAFA ^ 0xAA61] = 0xAA3D ^ 0xAA61;
        AutoReissueModule.H[0xF6C1 ^ 0xF7B9] = 0x1FC73 ^ 0xF7B9;
        AutoReissueModule.H[0xE53E ^ 0xE5C9] = 0xE5CC ^ 0xE5C9;
        AutoReissueModule.H[0x7B75 ^ 0x7B5A] = 0xFFFF84E3 ^ 0x7B5A;
        AutoReissueModule.H[0x2CA4 ^ 0x2C4A] = 0x2C0F ^ 0x2C4A;
        AutoReissueModule.H[0x4C70 ^ 0x4C22] = 0x4C4A ^ 0x4C22;
        AutoReissueModule.H[0xCDA3 ^ 0xCDF6] = 0xFFFF3251 ^ 0xCDF6;
        AutoReissueModule.H[0x3DD5 ^ 0x3DFE] = 0xFFFFC242 ^ 0x3DFE;
        AutoReissueModule.H[0x1847 ^ 0x18E0] = 0x18AE ^ 0x18E0;
        AutoReissueModule.H[0x77A0 ^ 0x777A] = 0x772E ^ 0x777A;
        AutoReissueModule.H[0x1011D ^ 0x10069] = 0x15C9C ^ 0x10069;
        AutoReissueModule.H[0xF8F5 ^ 0xF977] = 0x694A ^ 0xF977;
        AutoReissueModule.H[0x1C1 ^ 0x1B5] = 0xFFFFFE47 ^ 0x1B5;
        AutoReissueModule.H[0x5016 ^ 0x5028] = 0xFFFFAFC4 ^ 0x5028;
        AutoReissueModule.H[0xA69D ^ 0xA63C] = 0xFFFF598C ^ 0xA63C;
        AutoReissueModule.H[0xFB10 ^ 0xFA2B] = 0x139D ^ 0xFA2B;
        AutoReissueModule.H[0x69D2 ^ 0x6904] = 0x6972 ^ 0x6904;
        AutoReissueModule.H[0xD153 ^ 0xD125] = 0xD125 ^ 0xD125;
        AutoReissueModule.H[0xEC76 ^ 0xEC99] = 0xFFFF136B ^ 0xEC99;
        AutoReissueModule.H[0x955B ^ 0x958F] = 0xFFFF6A29 ^ 0x958F;
        AutoReissueModule.H[0x1017F ^ 0x10064] = 0xFFFE71DA ^ 0x10064;
        AutoReissueModule.H[0x828 ^ 0x8EF] = 0x21C7 ^ 0x8EF;
        AutoReissueModule.H[0xA42B ^ 0xA48F] = 0xA49B ^ 0xA48F;
        AutoReissueModule.H[0x1E14 ^ 0x1E03] = 0xFFFFE1F7 ^ 0x1E03;
        AutoReissueModule.H[0x892 ^ 0x985] = 0xF6A6 ^ 0x985;
        AutoReissueModule.H[0x362A ^ 0x370E] = 0x12A3 ^ 0x370E;
        AutoReissueModule.H[0xE9D5 ^ 0xE8B0] = 0xEAE9 ^ 0xE8B0;
        AutoReissueModule.H[0xEB84 ^ 0xEB10] = 0xEB47 ^ 0xEB10;
        AutoReissueModule.H[0x133E ^ 0x1365] = 0xFFFFECE8 ^ 0x1365;
        AutoReissueModule.H[0x3689 ^ 0x36BF] = 0xFFFFC945 ^ 0x36BF;
        AutoReissueModule.H[0xA6EC ^ 0xA6AE] = 0xA633 ^ 0xA6AE;
        AutoReissueModule.H[0x16DB ^ 0x17E3] = 0x615F ^ 0x17E3;
        AutoReissueModule.H[0xB37D ^ 0xB2FA] = 0x9D50 ^ 0xB2FA;
        AutoReissueModule.H[0xE861 ^ 0xE803] = 0xE83F ^ 0xE803;
        AutoReissueModule.H[0x7F08 ^ 0x7FD5] = 0x7FF0 ^ 0x7FD5;
        AutoReissueModule.H[0x3B0A ^ 0x3B79] = 0xFFFFC4A4 ^ 0x3B79;
        AutoReissueModule.H[0x5E6D ^ 0x5E0D] = 0x5E6F ^ 0x5E0D;
        AutoReissueModule.H[0x6454 ^ 0x64B2] = 0xFFFF9B25 ^ 0x64B2;
        AutoReissueModule.H[0x35BD ^ 0x354B] = 0x3559 ^ 0x354B;
        AutoReissueModule.H[0xADA5 ^ 0xAD6D] = 0xBD44 ^ 0xAD6D;
        AutoReissueModule.H[0x6736 ^ 0x6636] = 0x6671 ^ 0x6636;
        AutoReissueModule.H[0x9A67 ^ 0x9A04] = 0xFFFF65DE ^ 0x9A04;
        AutoReissueModule.H[0x7E70 ^ 0x7F0E] = 0x9F16 ^ 0x7F0E;
        AutoReissueModule.H[0x782D ^ 0x78FA] = 0x78EB ^ 0x78FA;
        AutoReissueModule.H[0x43AA ^ 0x433D] = 0x435B ^ 0x433D;
        AutoReissueModule.H[0x9A4B ^ 0x9B18] = 0xFFFFD17E ^ 0x9B18;
        AutoReissueModule.H[0xA95E ^ 0xA99E] = 0xA99E ^ 0xA99E;
        AutoReissueModule.H[0x7C87 ^ 0x7C93] = 0xFFFF8321 ^ 0x7C93;
        AutoReissueModule.H[0x9883 ^ 0x986E] = 0xFFFF67E3 ^ 0x986E;
        AutoReissueModule.H[0x631A ^ 0x6251] = 0xFFFF955E ^ 0x6251;
        AutoReissueModule.H[0x9703 ^ 0x9768] = 0xFFFF68C7 ^ 0x9768;
        AutoReissueModule.H[0xAC39 ^ 0xACDD] = 0xFFFF539E ^ 0xACDD;
        AutoReissueModule.H[0x3603 ^ 0x365D] = 0xFFFFC9F4 ^ 0x365D;
        AutoReissueModule.H[0xBAE5 ^ 0xBBE3] = 0xFFFF4436 ^ 0xBBE3;
        AutoReissueModule.H[0x86AE ^ 0x87B7] = 0x9E5 ^ 0x87B7;
        AutoReissueModule.H[0x6C10 ^ 0x6CA7] = 0xFFFF93CD ^ 0x6CA7;
        AutoReissueModule.H[0xCDF7 ^ 0xCDF7] = 0xFFFF3215 ^ 0xCDF7;
        AutoReissueModule.H[0x6BBB ^ 0x6B22] = 0xFFFF9492 ^ 0x6B22;
        AutoReissueModule.H[0x6A5B ^ 0x6A8B] = 0xF9F5 ^ 0x6A8B;
        AutoReissueModule.H[0x9E1C ^ 0x9EE6] = 0x9E8D ^ 0x9EE6;
        AutoReissueModule.H[0xADC5 ^ 0xADA1] = 0xADB8 ^ 0xADA1;
        AutoReissueModule.H[0x722D ^ 0x7280] = 0xFFFF8D55 ^ 0x7280;
        AutoReissueModule.H[0xDA41 ^ 0xDA42] = 0xFFFF25A4 ^ 0xDA42;
        AutoReissueModule.H[0x5937 ^ 0x59F9] = 0x93EC ^ 0x59F9;
        AutoReissueModule.H[0x2675 ^ 0x266E] = 0x2646 ^ 0x266E;
        AutoReissueModule.H[0x3351 ^ 0x322B] = 0xFFFEC678 ^ 0x322B;
        AutoReissueModule.H[0x289D ^ 0x29BE] = 0xFFFFF3A3 ^ 0x29BE;
        AutoReissueModule.H[0xFF65 ^ 0xFF59] = 0xFFFF00D5 ^ 0xFF59;
        AutoReissueModule.H[0xC705 ^ 0xC7AA] = 0xC7EC ^ 0xC7AA;
        AutoReissueModule.H[0xEB6A ^ 0xEBF0] = 0xFFFF143C ^ 0xEBF0;
        AutoReissueModule.H[0x5AD2 ^ 0x5A16] = 0x3FD4 ^ 0x5A16;
        AutoReissueModule.H[0x3A6 ^ 0x28F] = 0x91A2 ^ 0x28F;
        AutoReissueModule.H[0xE1D6 ^ 0xE0BF] = 0xA61E ^ 0xE0BF;
        AutoReissueModule.H[0x94A6 ^ 0x95B0] = 0x95B0 ^ 0x95B0;
        AutoReissueModule.H[0xFE72 ^ 0xFF53] = 0xDAF6 ^ 0xFF53;
        AutoReissueModule.H[0x10FDC ^ 0x10F17] = 0x118FB ^ 0x10F17;
        AutoReissueModule.H[0xE5DF ^ 0xE5C6] = 0xFFFF1A69 ^ 0xE5C6;
        AutoReissueModule.H[0xEEE9 ^ 0xEFA6] = 0xFFFF7DAA ^ 0xEFA6;
        AutoReissueModule.H[0x10A70 ^ 0x10AB9] = 0x1EAB3 ^ 0x10AB9;
        AutoReissueModule.H[0x10D5D ^ 0x10C5C] = 0xFFFEF3EA ^ 0x10C5C;
        AutoReissueModule.H[0x5B2E ^ 0x5B0D] = 0x5B26 ^ 0x5B0D;
        AutoReissueModule.H[0xD2E9 ^ 0xD284] = 0xD2E1 ^ 0xD284;
        AutoReissueModule.H[0xD76F ^ 0xD65C] = 0xFFFF1CDE ^ 0xD65C;
        AutoReissueModule.H[0x21D2 ^ 0x20B6] = 0x22FD ^ 0x20B6;
        AutoReissueModule.H[0x47E4 ^ 0x47AC] = 0xFFFFB870 ^ 0x47AC;
        AutoReissueModule.H[0xC23D ^ 0xC26A] = 0xC2A9 ^ 0xC26A;
        AutoReissueModule.H[0x180D ^ 0x192D] = 0x826D ^ 0x192D;
        AutoReissueModule.H[0xEDE ^ 0xE07] = 0xE32 ^ 0xE07;
        AutoReissueModule.H[0x4CCC ^ 0x4DE3] = 0x2406 ^ 0x4DE3;
        AutoReissueModule.H[0x5B06 ^ 0x5B86] = 0xFFFFA444 ^ 0x5B86;
        AutoReissueModule.H[0xCF53 ^ 0xCF1D] = 0xFFFF3063 ^ 0xCF1D;
        AutoReissueModule.H[0xE47 ^ 0xF54] = 0xF54 ^ 0xF54;
        AutoReissueModule.H[0x6EE5 ^ 0x6E47] = 0xFFFF91B5 ^ 0x6E47;
        AutoReissueModule.H[0xB595 ^ 0xB490] = 0xFFFF4B0A ^ 0xB490;
        AutoReissueModule.H[0x94C0 ^ 0x948D] = 0xFFFF6B6B ^ 0x948D;
        AutoReissueModule.H[0xD6ED ^ 0xD645] = 0xFFFF29E9 ^ 0xD645;
        AutoReissueModule.H[0x5EC ^ 0x4D9] = 0x7260 ^ 0x4D9;
        AutoReissueModule.H[0x1C4 ^ 0x135] = 0x142 ^ 0x135;
        AutoReissueModule.H[0xFBD5 ^ 0xFB6A] = 0xFB6A ^ 0xFB6A;
        AutoReissueModule.H[0xFB95 ^ 0xFADC] = 0xF27E ^ 0xFADC;
        AutoReissueModule.H[0x7EA3 ^ 0x7E30] = 0x7E0C ^ 0x7E30;
        AutoReissueModule.H[0xD9C7 ^ 0xD885] = 0x62C3 ^ 0xD885;
        AutoReissueModule.H[0x3919 ^ 0x3956] = 0x3923 ^ 0x3956;
        AutoReissueModule.H[0xCB6B ^ 0xCA61] = 0xFFFF35A1 ^ 0xCA61;
        AutoReissueModule.H[0xD601 ^ 0xD6E8] = 0xD6E6 ^ 0xD6E8;
        AutoReissueModule.H[0x3750 ^ 0x3610] = 0xB3D1 ^ 0x3610;
        AutoReissueModule.H[0xED0C ^ 0xED33] = 0xED08 ^ 0xED33;
        AutoReissueModule.H[0x599 ^ 0x5D0] = 0xFFFFFA65 ^ 0x5D0;
        AutoReissueModule.H[0xF978 ^ 0xF998] = 0xFFFF064A ^ 0xF998;
        AutoReissueModule.H[0x3F23 ^ 0x3FBB] = 0xFFFFC07B ^ 0x3FBB;
        AutoReissueModule.H[0xE233 ^ 0xE2CD] = 0xFFFF1D6F ^ 0xE2CD;
        AutoReissueModule.H[0xACB3 ^ 0xAC80] = 0xFFFF530A ^ 0xAC80;
        AutoReissueModule.H[0x10673 ^ 0x10635] = 0xFFFEF9C8 ^ 0x10635;
        AutoReissueModule.H[0x2512 ^ 0x241D] = 0x241D ^ 0x241D;
        AutoReissueModule.H[0xC87B ^ 0xC815] = 0xC81E ^ 0xC815;
        AutoReissueModule.H[0xC358 ^ 0xC3C5] = 0xFFFF3C22 ^ 0xC3C5;
        AutoReissueModule.H[0xBEF7 ^ 0xBFC0] = 0xC922 ^ 0xBFC0;
        AutoReissueModule.H[0x56B ^ 0x46F] = 0xFFFFFB8E ^ 0x46F;
        AutoReissueModule.H[0x105FE ^ 0x10552] = 0x10502 ^ 0x10552;
        AutoReissueModule.H[0x159 ^ 0x46] = 0xFFFF64A9 ^ 0x46;
        AutoReissueModule.H[0x6F6D ^ 0x6E4F] = 0x4BE2 ^ 0x6E4F;
        AutoReissueModule.H[0xD227 ^ 0xD262] = 0xFFFF2D84 ^ 0xD262;
        AutoReissueModule.H[0x2975 ^ 0x2913] = 0xFFFFD6F7 ^ 0x2913;
        AutoReissueModule.H[0xB15 ^ 0xBA5] = 0xFFFFF47C ^ 0xBA5;
        AutoReissueModule.H[0xC3DE ^ 0xC336] = 0xC36B ^ 0xC336;
        AutoReissueModule.H[0xE3CF ^ 0xE2FE] = 0xD7F2 ^ 0xE2FE;
        AutoReissueModule.H[0x5A4D ^ 0x5A51] = 0xFFFFA5CB ^ 0x5A51;
        AutoReissueModule.H[0x8DD6 ^ 0x8DE1] = 0x8DE2 ^ 0x8DE1;
        AutoReissueModule.H[0x23E1 ^ 0x236A] = 0x2370 ^ 0x236A;
        AutoReissueModule.H[0x3553 ^ 0x355D] = 0x350B ^ 0x355D;
        AutoReissueModule.H[0x753A ^ 0x7527] = 0xFFFF8A85 ^ 0x7527;
        AutoReissueModule.H[0xE880 ^ 0xE906] = 0xC690 ^ 0xE906;
        AutoReissueModule.H[0x2689 ^ 0x263A] = 0x260D ^ 0x263A;
        AutoReissueModule.H[0x1772 ^ 0x1747] = 0xFFFFE8D5 ^ 0x1747;
        AutoReissueModule.H[0xCF66 ^ 0xCFA4] = 0x7944 ^ 0xCFA4;
        AutoReissueModule.H[0x11C4 ^ 0x11A1] = 0xFFFFEE60 ^ 0x11A1;
        AutoReissueModule.H[0xEEBF ^ 0xEFE5] = 0xB919 ^ 0xEFE5;
        AutoReissueModule.H[0x2209 ^ 0x223B] = 0x2243 ^ 0x223B;
        AutoReissueModule.H[0x4883 ^ 0x4849] = 0xF323 ^ 0x4849;
        AutoReissueModule.H[0x69E3 ^ 0x691B] = 0x692C ^ 0x691B;
        AutoReissueModule.H[0xF42 ^ 0xF37] = 0xFFFFF09F ^ 0xF37;
        AutoReissueModule.H[0x5F36 ^ 0x5F17] = 0x5F6B ^ 0x5F17;
        AutoReissueModule.H[0x68FE ^ 0x6973] = 0xEFBE ^ 0x6973;
        AutoReissueModule.H[0x65CE ^ 0x65DD] = 0xFFFF9A35 ^ 0x65DD;
        AutoReissueModule.H[0xFD29 ^ 0xFC38] = 0xFC39 ^ 0xFC38;
        AutoReissueModule.H[0xF7C5 ^ 0xF746] = 0xF71C ^ 0xF746;
        AutoReissueModule.H[0x94F5 ^ 0x94E7] = 0x94D2 ^ 0x94E7;
        AutoReissueModule.H[0xC9BF ^ 0xC97A] = 0xB5FE ^ 0xC97A;
        AutoReissueModule.H[0x683B ^ 0x68AB] = 0xFFFF9752 ^ 0x68AB;
        AutoReissueModule.H[0xBD0A ^ 0xBC44] = 0xD1C1 ^ 0xBC44;
        AutoReissueModule.H[0xBECA ^ 0xBFE1] = 0x2CC9 ^ 0xBFE1;
        AutoReissueModule.H[0x89DC ^ 0x89ED] = 0x89AC ^ 0x89ED;
        AutoReissueModule.H[0x3C4E ^ 0x3C96] = 0x3CD3 ^ 0x3C96;
        AutoReissueModule.H[0x8AD2 ^ 0x8A6E] = 0x8A6F ^ 0x8A6E;
        AutoReissueModule.H[0x1E05 ^ 0x1EE2] = 0xFFFFE133 ^ 0x1EE2;
        AutoReissueModule.H[0x943A ^ 0x942A] = 0xFFFF6B96 ^ 0x942A;
        AutoReissueModule.H[0xCE43 ^ 0xCF7A] = 0x26CA ^ 0xCF7A;
        AutoReissueModule.H[0xC1C6 ^ 0xC153] = 0xFFFF3E96 ^ 0xC153;
        AutoReissueModule.H[0xDD26 ^ 0xDC32] = 0xDC33 ^ 0xDC32;
        AutoReissueModule.H[0x47E9 ^ 0x4738] = 0xFF06 ^ 0x4738;
        AutoReissueModule.H[0xADB0 ^ 0xADDC] = 0xFFFF521A ^ 0xADDC;
        AutoReissueModule.H[0x464 ^ 0x47E] = 0x41F ^ 0x47E;
        AutoReissueModule.H[0x645F ^ 0x6441] = 0xFFFF9B87 ^ 0x6441;
        AutoReissueModule.H[0x42DD ^ 0x43BD] = 0x1489C ^ 0x43BD;
        AutoReissueModule.H[0xA5D8 ^ 0xA5CD] = 0xFFFF5A78 ^ 0xA5CD;
        AutoReissueModule.H[0xF4 ^ 0x54] = 0x27 ^ 0x54;
        AutoReissueModule.H[0x7BE6 ^ 0x7B62] = 0xFFFF849F ^ 0x7B62;
        AutoReissueModule.H[0x21C7 ^ 0x2082] = 0xC53C ^ 0x2082;
        AutoReissueModule.H[0x38F5 ^ 0x3843] = 0xFFFFC7F6 ^ 0x3843;
        AutoReissueModule.H[0x10DD4 ^ 0x10D69] = 0x10D69 ^ 0x10D69;
        AutoReissueModule.H[0x5E9C ^ 0x5E9B] = 0xFFFFA104 ^ 0x5E9B;
        AutoReissueModule.H[0x857F ^ 0x8440] = 0xFFFFFE6B ^ 0x8440;
        AutoReissueModule.H[0x39BF ^ 0x38D0] = 0x4B62 ^ 0x38D0;
        AutoReissueModule.H[0xAAAF ^ 0xAA5C] = 0xFFFF5598 ^ 0xAA5C;
        AutoReissueModule.H[0x6705 ^ 0x6639] = 0x8F88 ^ 0x6639;
        AutoReissueModule.H[0x10701 ^ 0x10721] = 0xFFFEF8C4 ^ 0x10721;
        AutoReissueModule.H[0x777E ^ 0x7656] = 0x797E ^ 0x7656;
        AutoReissueModule.H[0xB092 ^ 0xB1A2] = 0xD86C ^ 0xB1A2;
        AutoReissueModule.H[0x42FF ^ 0x42B3] = 0xFFFFBD49 ^ 0x42B3;
        AutoReissueModule.H[0x10CFB ^ 0x10C76] = 0xFFFEF384 ^ 0x10C76;
        AutoReissueModule.H[0xF3EB ^ 0xF330] = 0xF30F ^ 0xF330;
        AutoReissueModule.H[0xAEA3 ^ 0xAEA7] = 0xFFFF5108 ^ 0xAEA7;
        AutoReissueModule.H[0x8CA2 ^ 0x8C5F] = 0xFFFF73C1 ^ 0x8C5F;
        AutoReissueModule.H[0x7ACB ^ 0x7A73] = 0xFFFF85FD ^ 0x7A73;
        AutoReissueModule.H[0x75BB ^ 0x74D5] = 0xFFFFF8DF ^ 0x74D5;
        AutoReissueModule.H[0xF152 ^ 0xF034] = 0xF249 ^ 0xF034;
        AutoReissueModule.H[0x3DC4 ^ 0x3C85] = 0x86C8 ^ 0x3C85;
        AutoReissueModule.H[0x3C35 ^ 0x3CD9] = 0x3C86 ^ 0x3CD9;
        AutoReissueModule.H[0xAD41 ^ 0xACC9] = 0x5312 ^ 0xACC9;
        AutoReissueModule.H[0xB0CB ^ 0xB1B8] = 0xF34D ^ 0xB1B8;
        AutoReissueModule.H[0x5DC8 ^ 0x5DCA] = 0xFFFFA23A ^ 0x5DCA;
        AutoReissueModule.H[0xB073 ^ 0xB13B] = 0x5489 ^ 0xB13B;
        AutoReissueModule.H[0x1762 ^ 0x17EC] = 0xFFFFE80B ^ 0x17EC;
        AutoReissueModule.H[0x4142 ^ 0x414D] = 0x41CC ^ 0x414D;
        AutoReissueModule.H[0xBD5A ^ 0xBD78] = 0xBD29 ^ 0xBD78;
        AutoReissueModule.H[0x63C2 ^ 0x62CB] = 0x62C1 ^ 0x62CB;
        AutoReissueModule.H[0x40C1 ^ 0x400C] = 0x9B18 ^ 0x400C;
        AutoReissueModule.H[0x8C67 ^ 0x8D3A] = 0xE49E ^ 0x8D3A;
        AutoReissueModule.H[0xF386 ^ 0xF304] = 0xFFFF0CDF ^ 0xF304;
        AutoReissueModule.H[0x1911 ^ 0x19D0] = 0x18D0 ^ 0x19D0;
        AutoReissueModule.H[0x452C ^ 0x4595] = 0xFFFFBA69 ^ 0x4595;
        AutoReissueModule.H[0xB0B3 ^ 0xB0D9] = 0xB0D9 ^ 0xB0D9;
        AutoReissueModule.H[0xB19 ^ 0xA46] = 0x63E2 ^ 0xA46;
        AutoReissueModule.H[0xF590 ^ 0xF553] = 0xC93 ^ 0xF553;
        AutoReissueModule.H[0xB34B ^ 0xB3A0] = 0xFFFF4C58 ^ 0xB3A0;
        AutoReissueModule.H[0xFB7E ^ 0xFB07] = 0xFB42 ^ 0xFB07;
        AutoReissueModule.H[0xF615 ^ 0xF68A] = 0xF66D ^ 0xF68A;
        AutoReissueModule.H[0xCE9B ^ 0xCFF9] = 0xFFFE3B57 ^ 0xCFF9;
        AutoReissueModule.H[0x2121 ^ 0x2179] = 0xFFFFDEF2 ^ 0x2179;
        AutoReissueModule.H[0x10B5A ^ 0x10ADA] = 0x19AAE ^ 0x10ADA;
        AutoReissueModule.H[0x8B1E ^ 0x8A4C] = 0x3F8C ^ 0x8A4C;
        AutoReissueModule.H[0xBF8B ^ 0xBFAE] = 0xBFE8 ^ 0xBFAE;
        AutoReissueModule.H[0xC3B5 ^ 0xC2E5] = 0xAF60 ^ 0xC2E5;
        AutoReissueModule.H[0xB592 ^ 0xB5E5] = 0xFFFF4A6D ^ 0xB5E5;
        AutoReissueModule.H[0xCA4B ^ 0xCA12] = 0xCA58 ^ 0xCA12;
        AutoReissueModule.H[0x511C ^ 0x5103] = 0xFFFFAE88 ^ 0x5103;
        AutoReissueModule.H[0xC39C ^ 0xC365] = 0xC361 ^ 0xC365;
        AutoReissueModule.H[0x19D7 ^ 0x1993] = 0xFFFFE617 ^ 0x1993;
        AutoReissueModule.H[0x749B ^ 0x7581] = 0xFBD7 ^ 0x7581;
        AutoReissueModule.H[0x892E ^ 0x8924] = 0xFFFF76B2 ^ 0x8924;
        AutoReissueModule.H[0xDA22 ^ 0xDA5F] = 0xFFFF25D8 ^ 0xDA5F;
        AutoReissueModule.H[0xCD1E ^ 0xCDB5] = 0xFFFF3210 ^ 0xCDB5;
        AutoReissueModule.H[0x6D52 ^ 0x6C0E] = 0x5B3 ^ 0x6C0E;
        AutoReissueModule.H[0x75B0 ^ 0x74CF] = 0x94E1 ^ 0x74CF;
        AutoReissueModule.H[0xEF3C ^ 0xEEB7] = 0x117A ^ 0xEEB7;
        AutoReissueModule.H[0x16 ^ 0x138] = 0x68F6 ^ 0x138;
        AutoReissueModule.H[0x18D2 ^ 0x1867] = 0x1830 ^ 0x1867;
        AutoReissueModule.H[0xA965 ^ 0xA9BA] = 0xFFFF5648 ^ 0xA9BA;
        AutoReissueModule.H[0x2D47 ^ 0x2D3F] = 0xFFFFD200 ^ 0x2D3F;
        AutoReissueModule.H[0xEA17 ^ 0xEA33] = 0xEA2F ^ 0xEA33;
        AutoReissueModule.H[0x7706 ^ 0x778A] = 0xFFFF8879 ^ 0x778A;
        AutoReissueModule.H[0x8775 ^ 0x86F9] = 0x23 ^ 0x86F9;
        AutoReissueModule.H[0x77E8 ^ 0x76CE] = 0x79E6 ^ 0x76CE;
        AutoReissueModule.H[0x7D9D ^ 0x7DF5] = 0x7DCC ^ 0x7DF5;
        AutoReissueModule.H[0x4DD5 ^ 0x4C51] = 0x63FB ^ 0x4C51;
        AutoReissueModule.H[0xBA86 ^ 0xBAFA] = 0xFFFF4563 ^ 0xBAFA;
        AutoReissueModule.H[0xCDCD ^ 0xCD2C] = 0xFFFF32C6 ^ 0xCD2C;
        AutoReissueModule.H[0xB856 ^ 0xB8A2] = 0xB8C0 ^ 0xB8A2;
        AutoReissueModule.H[0x1F12 ^ 0x1FE7] = 0xFFFFE061 ^ 0x1FE7;
        AutoReissueModule.H[0x5DBE ^ 0x5DC4] = 0xFFFFA247 ^ 0x5DC4;
        AutoReissueModule.H[0xBA2F ^ 0xBB54] = 0x1B08B ^ 0xBB54;
        AutoReissueModule.H[0xF705 ^ 0xF735] = 0xFFFF08FD ^ 0xF735;
        AutoReissueModule.H[0x10539 ^ 0x105B0] = 0xFFFEFA73 ^ 0x105B0;
        AutoReissueModule.H[0xBC7A ^ 0xBDF0] = 0xFFFFBDDA ^ 0xBDF0;
        AutoReissueModule.H[0xDBB3 ^ 0xDADF] = 0xA967 ^ 0xDADF;
        AutoReissueModule.H[0xB9E3 ^ 0xB88B] = 0xFE2E ^ 0xB88B;
        AutoReissueModule.H[0x4B0E ^ 0x4BB0] = 0x4BB2 ^ 0x4BB0;
        AutoReissueModule.H[0x102DD ^ 0x1038C] = 0x1B643 ^ 0x1038C;
        AutoReissueModule.H[0x1809 ^ 0x1824] = 0x1846 ^ 0x1824;
        AutoReissueModule.H[0x1077 ^ 0x116F] = 0xEE5C ^ 0x116F;
        AutoReissueModule.H[0x2BB4 ^ 0x2B32] = 0xFFFFD492 ^ 0x2B32;
        AutoReissueModule.H[0x3048 ^ 0x3162] = 0xA24D ^ 0x3162;
        AutoReissueModule.H[0x74A4 ^ 0x74F4] = 0x74D9 ^ 0x74F4;
        AutoReissueModule.H[0x10009 ^ 0x1008E] = 0x10097 ^ 0x1008E;
        AutoReissueModule.H[0x17AA ^ 0x1698] = 0x2394 ^ 0x1698;
        AutoReissueModule.H[0x4B94 ^ 0x4A88] = 0xC4DE ^ 0x4A88;
        AutoReissueModule.H[0xF30B ^ 0xF3B0] = 0xF3B0 ^ 0xF3B0;
        AutoReissueModule.H[0xDBFF ^ 0xDB51] = 0xFFFF24DB ^ 0xDB51;
        AutoReissueModule.H[0x847D ^ 0x843C] = 0xFFFF7BC5 ^ 0x843C;
        AutoReissueModule.H[0x3D14 ^ 0x3DF7] = 0xFFFFC24D ^ 0x3DF7;
        AutoReissueModule.H[0x6D3E ^ 0x6DCC] = 0xFFFF926A ^ 0x6DCC;
        AutoReissueModule.H[0x6B82 ^ 0x6B14] = 0xFFFF94EE ^ 0x6B14;
        AutoReissueModule.H[0x6990 ^ 0x6911] = 0xFFFF96B0 ^ 0x6911;
        AutoReissueModule.H[0xD539 ^ 0xD558] = 0xD57E ^ 0xD558;
        AutoReissueModule.H[0x54F ^ 0x50F] = 0x52D ^ 0x50F;
        AutoReissueModule.H[0x36BA ^ 0x360E] = 0xFFFFC9E6 ^ 0x360E;
        AutoReissueModule.H[0xD897 ^ 0xD89A] = 0xFFFF2751 ^ 0xD89A;
        AutoReissueModule.H[0x25B8 ^ 0x25E5] = 0xFFFFDA41 ^ 0x25E5;
        AutoReissueModule.H[0x5821 ^ 0x596D] = 0x51C6 ^ 0x596D;
        AutoReissueModule.H[0x5080 ^ 0x50AC] = 0x50B8 ^ 0x50AC;
        AutoReissueModule.H[0xEF3E ^ 0xEE4F] = 0xACBA ^ 0xEE4F;
    }
}

