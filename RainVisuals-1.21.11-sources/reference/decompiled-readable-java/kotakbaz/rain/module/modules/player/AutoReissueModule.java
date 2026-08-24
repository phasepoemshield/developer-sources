/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 *  ru.ocz.protection.annotation.Compile
 */
package kotakbaz.rain.module.modules.player;

import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
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
import oxxxde.\u0627\u064f;
import oxxxde.\u0628\u064f;
import oxxxde.\u062b\u0648;
import oxxxde.\u0635\u0635;
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import oxxxde.\u0642;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001-B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u0017J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010\u001dR\u0016\u0010+\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b+\u0010\u001dR\u0016\u0010,\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b,\u0010\"\u00a8\u0006."}, d2={"Loxxxde/\u0638\u0647;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "now", "resetCycle", "(J)V", "abortActiveCycle", "", "hasOpenGui", "()Z", "Lnet/minecraft/class_1703;", "handler", "", "resolveStorageSlot", "(Lnet/minecraft/class_1703;)Ljava/lang/Integer;", "resolveConfirmSlot", "getBottomRowSecondSlot", "getBottomRowPenultimateSlot", "getContainerSlotCount", "CYCLE_DELAY_MS", "J", "STEP_DELAY_MS", "STEP_TIMEOUT_MS", "CLOSE_TIMEOUT_MS", "PLAYER_INVENTORY_SLOT_COUNT", "I", "", "", "storageKeywords", "Ljava/util/List;", "Loxxxde/\u0642;", "state", "Loxxxde/\u0642;", "nextAuctionAt", "stepStartedAt", "firstScreenSyncId", "State", "rain-visuals"})
public final class AutoReissueModule
extends Module {
    @NotNull
    private static final List<String> storageKeywords;
    private static final long STEP_DELAY_MS = 1000L;
    private static long nextAuctionAt;
    @NotNull
    private static \u0642 state;
    @NotNull
    public static final AutoReissueModule INSTANCE;
    private static final long STEP_TIMEOUT_MS = 15000L;
    private static final int PLAYER_INVENTORY_SLOT_COUNT = 36;
    private static int firstScreenSyncId;
    private static final long CLOSE_TIMEOUT_MS = 2000L;
    private static long stepStartedAt;
    private static final long CYCLE_DELAY_MS = 60000L;

    private final Integer getBottomRowSecondSlot(ScreenHandler handler) {
        Integer n = this.getContainerSlotCount(handler);
        if (n == null) {
            return null;
        }
        int containerSlots = n;
        return containerSlots - 8;
    }

    @Compile
    private final Integer resolveStorageSlot(ScreenHandler screenHandler) {
        int n;
        Integer n2 = this.getBottomRowSecondSlot(screenHandler);
        if (n2 != null && (n = n2.intValue()) >= 0 && n < ((Collection)screenHandler.slots).size()) {
            Object object = screenHandler.slots.get(n);
            Intrinsics.checkNotNullExpressionValue(object, "get(...)");
            Slot slot = (Slot)object;
            ItemStack itemStack = \u0637\u062b.getStack(slot);
            if (!itemStack.isEmpty()) {
                String string = \u0637\u062b.getName(itemStack).getString();
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "ROOT");
                String string2 = string.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(string2, "toLowerCase(...)");
                String string3 = string2;
                Iterable iterable = storageKeywords;
                if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                    for (CharSequence charSequence : iterable) {
                        if (!StringsKt.contains$default((CharSequence)string3, charSequence, false, 2, null)) continue;
                        return n;
                    }
                }
            }
        }
        return null;
    }

    @Commando
    public final void onUpdate(@NotNull PlayerUpdateEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        if (\u0636\u0643.getMc().world == null) {
            return;
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler = \u0636\u0643.getMc().getNetworkHandler();
        if (clientPlayNetworkHandler == null) {
            return;
        }
        ClientPlayNetworkHandler networkHandler = clientPlayNetworkHandler;
        ClientPlayerInteractionManager clientPlayerInteractionManager = \u0636\u0643.getMc().interactionManager;
        if (clientPlayerInteractionManager == null) {
            return;
        }
        ClientPlayerInteractionManager interactionManager = clientPlayerInteractionManager;
        long now = System.currentTimeMillis();
        if (!player.isAlive() || player.isSpectator()) {
            this.resetCycle(now);
            return;
        }
        if (\u062b\u0648.INSTANCE.isCombatTagged()) {
            if (state != \u0642.WAITING_CYCLE) {
                this.abortActiveCycle(now);
            }
            return;
        }
        switch (\u0628\u064f.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1: {
                if (now < nextAuctionAt) {
                    return;
                }
                if (this.hasOpenGui()) {
                    return;
                }
                networkHandler.sendChatCommand("ah");
                state = \u0642.WAITING_STORAGE_SCREEN;
                stepStartedAt = now;
                firstScreenSyncId = -1;
                break;
            }
            case 2: {
                if (now - stepStartedAt > 15000L) {
                    this.resetCycle(now);
                    return;
                }
                if (!(\u0636\u0643.getMc().currentScreen instanceof HandledScreen)) {
                    return;
                }
                ScreenHandler screenHandler = player.currentScreenHandler;
                if (screenHandler == null) {
                    return;
                }
                ScreenHandler handler = screenHandler;
                if (firstScreenSyncId == -1) {
                    firstScreenSyncId = handler.syncId;
                }
                if (now - stepStartedAt < 1000L) {
                    return;
                }
                Integer n = this.resolveStorageSlot(handler);
                if (n == null) {
                    return;
                }
                int slotIndex = n;
                interactionManager.clickSlot(handler.syncId, slotIndex, 0, SlotActionType.PICKUP, (PlayerEntity)player);
                state = \u0642.WAITING_CONFIRM_SCREEN;
                stepStartedAt = now;
                break;
            }
            case 3: {
                if (now - stepStartedAt > 15000L) {
                    this.resetCycle(now);
                    return;
                }
                if (!(\u0636\u0643.getMc().currentScreen instanceof HandledScreen)) {
                    return;
                }
                ScreenHandler screenHandler = player.currentScreenHandler;
                if (screenHandler == null) {
                    return;
                }
                ScreenHandler handler = screenHandler;
                if (handler.syncId == firstScreenSyncId) {
                    return;
                }
                if (now - stepStartedAt < 1000L) {
                    return;
                }
                Integer n = this.resolveConfirmSlot(handler);
                if (n == null) {
                    return;
                }
                int slotIndex = n;
                interactionManager.clickSlot(handler.syncId, slotIndex, 0, SlotActionType.PICKUP, (PlayerEntity)player);
                state = \u0642.WAITING_CLOSE;
                stepStartedAt = now;
                break;
            }
            case 4: {
                if (\u0636\u0643.getMc().currentScreen instanceof HandledScreen) {
                    Screen screen = \u0636\u0643.getMc().currentScreen;
                    if (screen != null) {
                        screen.close();
                    }
                    player.closeHandledScreen();
                    \u0636\u0643.getMc().setScreen(null);
                }
                if (now - stepStartedAt <= 2000L) break;
                this.resetCycle(now);
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        INSTANCE = new AutoReissueModule();
        String[] stringArray = new String[2];
        stringArray[0] = "\u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435";
        stringArray[1] = "storage";
        storageKeywords = CollectionsKt.listOf(stringArray);
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
        state = \u0642.WAITING_CYCLE;
        firstScreenSyncId = -1;
    }

    private AutoReissueModule() {
        super("AutoResale", \u0638\u0646.getPLAYER(), "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u043f\u0435\u0440\u0435\u0432\u044b\u0441\u0442\u0430\u0432\u043b\u044f\u0435\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b");
    }

    private final void resetCycle(long now) {
        state = \u0642.WAITING_CYCLE;
        nextAuctionAt = now + 60000L;
        stepStartedAt = 0L;
        firstScreenSyncId = -1;
    }

    private final Integer getBottomRowPenultimateSlot(ScreenHandler handler) {
        Integer n = this.getContainerSlotCount(handler);
        if (n == null) {
            return null;
        }
        int containerSlots = n;
        return containerSlots + -2;
    }

    @Override
    public void onDisable() {
        this.resetCycle(System.currentTimeMillis());
    }

    private final Integer getContainerSlotCount(ScreenHandler handler) {
        int containerSlots;
        block3: {
            block2: {
                containerSlots = handler.slots.size() - 36;
                if (containerSlots <= 0) break block2;
                if (containerSlots % 9 == 0) break block3;
            }
            return null;
        }
        return containerSlots;
    }

    private final boolean hasOpenGui() {
        return \u0635\u0635.INSTANCE.getCustomScreen() != null || \u0636\u0643.getMc().currentScreen != null;
    }

    private final void abortActiveCycle(long now) {
        state = \u0642.WAITING_CYCLE;
        nextAuctionAt = now;
        stepStartedAt = 0L;
        firstScreenSyncId = -1;
    }

    @Override
    public void onEnable() {
        state = \u0642.WAITING_CYCLE;
        nextAuctionAt = 0L;
        stepStartedAt = 0L;
        firstScreenSyncId = -1;
    }

    /*
     * WARNING - void declaration
     */
    private final Integer resolveConfirmSlot(ScreenHandler handler) {
        void var2_2;
        Integer n = this.getBottomRowPenultimateSlot(handler);
        if (n == null) {
            return null;
        }
        int slotIndex = n;
        if (!(0 <= slotIndex ? slotIndex < ((Collection)handler.slots).size() : false)) {
            return null;
        }
        Object object = handler.slots.get(slotIndex);
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        if (\u0637\u062b.getStack((Slot)object).isEmpty()) {
            return null;
        }
        return (int)var2_2;
    }
}

