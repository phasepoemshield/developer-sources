/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.GameOptions
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.slot.SlotActionType
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.modules.player.ItemSwapModule;
import kotakbaz.rain.module.setting.ModeSetting;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.GameOptions;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064f;
import oxxxde.\u062b\u0625;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import oxxxde.\u0639;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u00029:B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001bJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001d\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b \u0010\u0003J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020'8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u0010)R\u0016\u00107\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u0010&R\u0016\u00108\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u00105\u00a8\u0006;"}, d2={"Loxxxde/\u062a\u0628;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u062a\u0632;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Loxxxde/\u0633\u062d;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_1799;", "stack", "Loxxxde/\u062b\u062c;", "currentOffhandType", "(Lnet/minecraft/class_1799;)Lkotakbaz/rain/module/modules/player/ItemSwapModule$SwapItem;", "sourceType", "targetTypeFor", "(Lkotakbaz/rain/module/modules/player/ItemSwapModule$SwapItem;)Lkotakbaz/rain/module/modules/player/ItemSwapModule$SwapItem;", "type", "", "findInventorySlot", "(Lkotakbaz/rain/module/modules/player/ItemSwapModule$SwapItem;)Ljava/lang/Integer;", "selectedFirstItem", "()Lkotakbaz/rain/module/modules/player/ItemSwapModule$SwapItem;", "selectedSecondItem", "inventorySlot", "toHandlerSlot", "(I)Ljava/lang/Integer;", "stopMovement", "", "resetPressed", "resetProgress", "(Z)V", "OFFHAND_SWAP_BUTTON", "I", "", "STEP_DELAY_MS", "J", "Loxxxde/\u0630\u064f;", "swapKey", "Loxxxde/\u0630\u064f;", "Loxxxde/\u0638\u064a;", "firstItem", "Loxxxde/\u0638\u064a;", "secondItem", "Loxxxde/\u062b\u0625;", "state", "Loxxxde/\u062b\u0625;", "wasPressed", "Z", "nextActionAt", "targetHandlerSlot", "movementStopped", "SwapItem", "State", "rain-visuals"})
public final class \u062a\u0628
extends Module {
    @NotNull
    public static final \u062a\u0628 INSTANCE;
    @NotNull
    private static \u062b\u0625 state;
    @NotNull
    private static final ModeSetting secondItem;
    private static long nextActionAt;
    @NotNull
    private static final BindSetting swapKey;
    private static boolean wasPressed;
    private static boolean movementStopped;
    private static int targetHandlerSlot;
    private static final int OFFHAND_SWAP_BUTTON = 40;
    private static final long STEP_DELAY_MS = 80L;
    @NotNull
    private static final ModeSetting firstItem;

    /*
     * WARNING - void declaration
     */
    static {
        void var3_5;
        Collection<String> collection;
        ItemSwapModule.SwapItem item$iv$iv;
        int n;
        ItemSwapModule.SwapItem[] $this$mapTo$iv$iv;
        ItemSwapModule.SwapItem[] $this$map$iv;
        INSTANCE = new \u062a\u0628();
        swapKey = Module.bind$default(INSTANCE, "\u041a\u043d\u043e\u043f\u043a\u0430", 82, null, 4, null);
        ItemSwapModule.SwapItem[] swapItemArray = ItemSwapModule.SwapItem.values();
        String string = "\u041f\u0440\u0435\u0434\u043c\u0435\u0442 1";
        Module module = INSTANCE;
        boolean $i$f$map = false;
        void var2_4 = $this$map$iv;
        Collection destination$iv$iv = new ArrayList($this$map$iv.length);
        boolean $i$f$mapTo = false;
        int n2 = $this$mapTo$iv$iv.length;
        for (n = 0; n < n2; ++n) {
            item$iv$iv = $this$mapTo$iv$iv[n];
            void it = item$iv$iv;
            collection = destination$iv$iv;
            boolean bl = false;
            collection.add(it.getTitle());
        }
        collection = (List)destination$iv$iv;
        firstItem = Module.mode$default(module, string, (List)collection, 0, null, 8, null);
        $this$map$iv = ItemSwapModule.SwapItem.values();
        string = "\u041f\u0440\u0435\u0434\u043c\u0435\u0442 2";
        module = INSTANCE;
        $i$f$map = false;
        $this$mapTo$iv$iv = $this$map$iv;
        destination$iv$iv = new ArrayList($this$map$iv.length);
        $i$f$mapTo = false;
        n2 = $this$mapTo$iv$iv.length;
        for (n = 0; n < n2; ++n) {
            item$iv$iv = $this$mapTo$iv$iv[n];
            ItemSwapModule.SwapItem swapItem = item$iv$iv;
            collection = destination$iv$iv;
            boolean bl = false;
            collection.add(swapItem.getTitle());
        }
        collection = (List)var3_5;
        secondItem = Module.mode$default(module, string, collection, 1, null, 8, null);
        state = \u062b\u0625.IDLE;
        targetHandlerSlot = -1;
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
    }

    private final ItemSwapModule.SwapItem selectedFirstItem() {
        ItemSwapModule.SwapItem swapItem;
        ItemSwapModule.SwapItem[] swapItemArray = ItemSwapModule.SwapItem.values();
        int n = firstItem.getSelectedIndex();
        boolean bl = 0 <= n ? n < swapItemArray.length : false;
        if (bl) {
            swapItem = swapItemArray[n];
        } else {
            int n2 = n;
            boolean bl2 = false;
            swapItem = ItemSwapModule.SwapItem.TALISMAN;
        }
        return swapItem;
    }

    @Override
    public void onEnable() {
        this.resetProgress(true);
    }

    /*
     * WARNING - void declaration
     */
    private final void stopMovement() {
        void var1_1;
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        GameOptions gameOptions = \u0636\u0643.getMc().options;
        Intrinsics.checkNotNullExpressionValue(gameOptions, "options");
        GameOptions options = gameOptions;
        options.forwardKey.setPressed(false);
        options.backKey.setPressed(false);
        options.leftKey.setPressed(false);
        options.rightKey.setPressed(false);
        options.jumpKey.setPressed(false);
        options.sprintKey.setPressed(false);
        var1_1.setSprinting(false);
        movementStopped = true;
    }

    private \u062a\u0628() {
        super("ItemSwap", \u0638\u0646.getPLAYER(), "\u0411\u044b\u0441\u0442\u0440\u044b\u0439 \u0441\u0432\u0430\u043f \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432");
    }

    /*
     * WARNING - void declaration
     */
    private final Integer findInventorySlot(ItemSwapModule.SwapItem type) {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return null;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        int slot = 0;
        while (slot < 36) {
            void var3_3;
            ItemStack itemStack = player.getInventory().getStack(slot);
            Intrinsics.checkNotNullExpressionValue(itemStack, "getItem(...)");
            if (type.matches(itemStack)) {
                return slot;
            }
            ++var3_3;
        }
        return null;
    }

    @Commando
    @Compile
    public final void onKey(@NotNull KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        int n = keyEvent.get(KeyEvent.Companion.getBUTTON());
        if (Intrinsics.areEqual(keyEvent.get(KeyEvent.Companion.getMOUSE()), true)) {
            return;
        }
        boolean bl = Intrinsics.areEqual(keyEvent.get(KeyEvent.Companion.getRELEASE()), true);
        if (n != ((Number)swapKey.getValue()).intValue()) {
            return;
        }
        if (bl) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        if (\u0636\u0643.getMc().world == null) {
            return;
        }
        if (\u0636\u0643.getMc().interactionManager == null) {
            return;
        }
        if (\u0636\u0643.getMc().currentScreen != null) {
            return;
        }
        if (state != \u062b\u0625.IDLE) {
            return;
        }
        if (wasPressed) {
            return;
        }
        ItemStack itemStack = clientPlayerEntity.getOffHandStack();
        Intrinsics.checkNotNullExpressionValue(itemStack, "getOffhandItem(...)");
        ItemSwapModule.SwapItem swapItem = this.currentOffhandType(itemStack);
        if (swapItem == null) {
            RainMainMenuScreen$Link.INSTANCE.showMessage(this, "\u041d\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u043e\u0433\u043e \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u0434\u043b\u044f \u0441\u0432\u0430\u043f\u0430 \u0432 \u043b\u0435\u0432\u043e\u0439 \u0440\u0443\u043a\u0435");
            return;
        }
        ItemSwapModule.SwapItem swapItem2 = this.targetTypeFor(swapItem);
        Integer n2 = this.findInventorySlot(swapItem2);
        if (n2 == null) {
            RainMainMenuScreen$Link.INSTANCE.showMessage(this, \u062a\u0628.lamda$onKey$1_1735e1c4(swapItem2.getTitle()));
            return;
        }
        Integer n3 = this.toHandlerSlot(n2);
        if (n3 == null) {
            RainMainMenuScreen$Link.INSTANCE.showMessage(this, "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0438\u0442\u044c \u0441\u043b\u043e\u0442 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430");
            return;
        }
        wasPressed = true;
        targetHandlerSlot = n3;
        state = \u062b\u0625.STOPPING_MOVEMENT;
        nextActionAt = 0L;
    }

    private final ItemSwapModule.SwapItem selectedSecondItem() {
        ItemSwapModule.SwapItem swapItem;
        ItemSwapModule.SwapItem[] swapItemArray = ItemSwapModule.SwapItem.values();
        int n = secondItem.getSelectedIndex();
        boolean bl = 0 <= n ? n < swapItemArray.length : false;
        if (bl) {
            swapItem = swapItemArray[n];
        } else {
            int n2 = n;
            boolean bl2 = false;
            swapItem = ItemSwapModule.SwapItem.SPHERE;
        }
        return swapItem;
    }

    @Override
    public void onDisable() {
        this.resetProgress(true);
    }

    private final ItemSwapModule.SwapItem currentOffhandType(ItemStack stack) {
        ItemSwapModule.SwapItem first = this.selectedFirstItem();
        ItemSwapModule.SwapItem second = this.selectedSecondItem();
        return first.matches(stack) ? first : (second.matches(stack) ? second : null);
    }

    /*
     * WARNING - void declaration
     */
    private final ItemSwapModule.SwapItem targetTypeFor(ItemSwapModule.SwapItem sourceType) {
        void var2_2;
        ItemSwapModule.SwapItem first = this.selectedFirstItem();
        ItemSwapModule.SwapItem second = this.selectedSecondItem();
        return sourceType == first ? second : var2_2;
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        block9: {
            block8: {
                block7: {
                    long l;
                    ClientPlayerEntity clientPlayerEntity;
                    block6: {
                        block5: {
                            block4: {
                                Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
                                clientPlayerEntity = \u0636\u0643.getMc().player;
                                if (clientPlayerEntity == null || \u0636\u0643.getMc().world == null || \u0636\u0643.getMc().interactionManager == null) {
                                    this.resetProgress(true);
                                    return;
                                }
                                if (state == \u062b\u0625.IDLE) {
                                    return;
                                }
                                l = System.currentTimeMillis();
                                if (l < nextActionAt) {
                                    return;
                                }
                                \u062b\u0625 \u062b\u06252 = state;
                                int n = \u0639.$EnumSwitchMapping$0[\u062b\u06252.ordinal()];
                                if (n == 1) break block4;
                                if (n == 2) break block5;
                                if (n == 3) break block6;
                                if (n == 4) break block7;
                                if (n == 5) break block8;
                                break block9;
                            }
                            this.stopMovement();
                            nextActionAt = l + 80L;
                            state = \u062b\u0625.WAITING_BEFORE_SWAP;
                            return;
                        }
                        this.stopMovement();
                        nextActionAt = l + 80L;
                        state = \u062b\u0625.SWAPPING;
                        return;
                    }
                    this.stopMovement();
                    if (targetHandlerSlot < 0) {
                        this.resetProgress(false);
                        return;
                    }
                    \u0636\u0643.getMc().interactionManager.clickSlot(clientPlayerEntity.playerScreenHandler.syncId, targetHandlerSlot, 40, SlotActionType.SWAP, (PlayerEntity)clientPlayerEntity);
                    clientPlayerEntity.playerScreenHandler.sendContentUpdates();
                    nextActionAt = l + 80L;
                    state = \u062b\u0625.FINISHING;
                    return;
                }
                this.resetProgress(false);
                return;
            }
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /*
     * WARNING - void declaration
     */
    private final Integer toHandlerSlot(int inventorySlot) {
        void var1_1;
        int n = inventorySlot;
        return (0 <= n ? n < 9 : false) ? Integer.valueOf(36 + inventorySlot) : ((9 <= n ? n < 36 : false) ? Integer.valueOf((int)var1_1) : null);
    }

    private final void resetProgress(boolean resetPressed) {
        state = \u062b\u0625.IDLE;
        nextActionAt = 0L;
        targetHandlerSlot = -1;
        if (movementStopped) {
            KeyBinding.updatePressedStates();
            movementStopped = false;
        }
        if (resetPressed) {
            wasPressed = false;
        }
    }

    static /* synthetic */ String lamda$onKey$1_1735e1c4(String string) {
        return string + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435";
    }
}

