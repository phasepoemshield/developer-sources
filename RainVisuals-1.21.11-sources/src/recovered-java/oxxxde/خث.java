/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.EquippableComponent
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.screen.PlayerScreenHandler
 *  net.minecraft.screen.slot.SlotActionType
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import kotakbaz.rain.event.events.KeyEvent;
import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.settings.BindSetting;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.MinecraftClient;
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
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064f;
import oxxxde.\u062d\u0637;
import oxxxde.\u0636\u062b;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010\u001eR\u0016\u0010(\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b(\u0010\u001bR\u0016\u0010)\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010&R\u0016\u0010*\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b*\u0010&\u00a8\u0006,"}, d2={"Loxxxde/\u062e\u062b;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u062a\u0632;", "event", "onKey", "(Lkotakbaz/rain/event/events/KeyEvent;)V", "Loxxxde/\u0633\u062d;", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "", "findElytraSlot", "()Ljava/lang/Integer;", "findChestplateSlot", "inventorySlot", "toHandlerSlot", "(I)Ljava/lang/Integer;", "", "closeInventory", "resetPressed", "resetProgress", "(ZZ)V", "CHEST_HANDLER_SLOT", "I", "", "STEP_DELAY_MS", "J", "Loxxxde/\u0630\u064f;", "swapBind", "Loxxxde/\u0630\u064f;", "Loxxxde/\u0636\u062b;", "state", "Loxxxde/\u0636\u062b;", "wasPressed", "Z", "nextActionAt", "targetHandlerSlot", "equipingElytra", "inventoryOpenedByModule", "State", "rain-visuals"})
public final class \u062e\u062b
extends Module {
    @NotNull
    private static \u0636\u062b state;
    private static long nextActionAt;
    private static boolean wasPressed;
    @NotNull
    private static final BindSetting swapBind;
    @NotNull
    public static final \u062e\u062b INSTANCE;
    private static final int CHEST_HANDLER_SLOT = 6;
    private static int targetHandlerSlot;
    private static boolean equipingElytra;
    private static boolean inventoryOpenedByModule;
    private static final long STEP_DELAY_MS = 50L;

    /*
     * WARNING - void declaration
     */
    private final Integer findChestplateSlot() {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return null;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        int slot = 0;
        while (slot < 36) {
            void var2_2;
            ItemStack stack;
            EquippableComponent equippable;
            Intrinsics.checkNotNullExpressionValue(player.getInventory().getStack(slot), "getItem(...)");
            EquippableComponent equippableComponent = equippable = (EquippableComponent)stack.get(DataComponentTypes.EQUIPPABLE);
            if ((equippableComponent != null ? equippableComponent.slot() : null) == EquipmentSlot.CHEST) {
                return slot;
            }
            ++var2_2;
        }
        return null;
    }

    private final void resetProgress(boolean closeInventory, boolean resetPressed) {
        if (closeInventory && inventoryOpenedByModule && \u0636\u0643.getMc().currentScreen instanceof InventoryScreen) {
            \u0636\u0643.getMc().setScreen(null);
        }
        state = \u0636\u062b.IDLE;
        nextActionAt = 0L;
        targetHandlerSlot = -1;
        equipingElytra = false;
        inventoryOpenedByModule = false;
        if (resetPressed) {
            wasPressed = false;
        }
    }

    /*
     * WARNING - void declaration
     */
    private final Integer findElytraSlot() {
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return null;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        int slot = 0;
        while (slot < 36) {
            void var2_2;
            if (player.getInventory().getStack(slot).isOf(Items.ELYTRA)) {
                return slot;
            }
            ++var2_2;
        }
        return null;
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        ClientPlayerEntity clientPlayerEntity = null;
        long l = 0L;
        ClientPlayerInteractionManager clientPlayerInteractionManager = null;
        MinecraftClient minecraftClient = null;
        PlayerScreenHandler playerScreenHandler = null;
        RainMainMenuScreen$Link rainMainMenuScreen$Link = null;
        String string = null;
        int n = 0;
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        minecraftClient = \u0636\u0643.getMc();
        if (minecraftClient == null) {
            throw new NullPointerException("Null pointer access [field:7]");
        }
        clientPlayerEntity = minecraftClient.player;
        if (clientPlayerEntity == null) {
            this.resetProgress(true, true);
            return;
        }
        minecraftClient = \u0636\u0643.getMc();
        if (minecraftClient == null) {
            throw new NullPointerException("Null pointer access [field:32]");
        }
        if (minecraftClient.world == null) {
            this.resetProgress(true, true);
            return;
        }
        minecraftClient = \u0636\u0643.getMc();
        if (minecraftClient == null) {
            throw new NullPointerException("Null pointer access [field:35]");
        }
        if (minecraftClient.interactionManager == null) {
            this.resetProgress(true, true);
            return;
        }
        if (state == \u0636\u062b.IDLE) {
            return;
        }
        l = System.currentTimeMillis();
        if (l < nextActionAt) {
            return;
        }
        switch (\u062d\u0637.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1: {
                minecraftClient = \u0636\u0643.getMc();
                if (minecraftClient == null) {
                    throw new NullPointerException("Null pointer access [field:79]");
                }
                if (minecraftClient.currentScreen == null) {
                    minecraftClient = \u0636\u0643.getMc();
                    if (minecraftClient == null) {
                        throw new NullPointerException("Null pointer access [invoke:90]");
                    }
                    minecraftClient.setScreen((Screen)new InventoryScreen((PlayerEntity)clientPlayerEntity));
                    inventoryOpenedByModule = true;
                }
                nextActionAt = l + (long)50;
                state = \u0636\u062b.PICKING_CHEST_SLOT;
                return;
            }
            case 2: {
                minecraftClient = \u0636\u0643.getMc();
                if (minecraftClient == null) {
                    throw new NullPointerException("Null pointer access [field:111]");
                }
                if (!(minecraftClient.currentScreen instanceof InventoryScreen)) {
                    this.resetProgress(true, false);
                    return;
                }
                minecraftClient = \u0636\u0643.getMc();
                if (minecraftClient == null) {
                    throw new NullPointerException("Null pointer access [field:127]");
                }
                clientPlayerInteractionManager = minecraftClient.interactionManager;
                if (clientPlayerInteractionManager != null) {
                    playerScreenHandler = clientPlayerEntity.playerScreenHandler;
                    if (playerScreenHandler == null) {
                        throw new NullPointerException("Null pointer access [field:134]");
                    }
                    n = playerScreenHandler.syncId;
                    clientPlayerInteractionManager.clickSlot(n, 6, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
                }
                nextActionAt = l + (long)50;
                state = \u0636\u062b.PICKING_TARGET_SLOT;
                return;
            }
            case 3: {
                minecraftClient = \u0636\u0643.getMc();
                if (minecraftClient == null) {
                    throw new NullPointerException("Null pointer access [field:171]");
                }
                if (!(minecraftClient.currentScreen instanceof InventoryScreen)) {
                    this.resetProgress(true, false);
                    return;
                }
                if (targetHandlerSlot < 0) {
                    this.resetProgress(true, false);
                    return;
                }
                minecraftClient = \u0636\u0643.getMc();
                if (minecraftClient == null) {
                    throw new NullPointerException("Null pointer access [field:190]");
                }
                clientPlayerInteractionManager = minecraftClient.interactionManager;
                if (clientPlayerInteractionManager != null) {
                    playerScreenHandler = clientPlayerEntity.playerScreenHandler;
                    if (playerScreenHandler == null) {
                        throw new NullPointerException("Null pointer access [field:197]");
                    }
                    n = playerScreenHandler.syncId;
                    clientPlayerInteractionManager.clickSlot(n, targetHandlerSlot, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
                }
                nextActionAt = l + (long)50;
                state = \u0636\u062b.PLACING_CHEST_SLOT;
                return;
            }
            case 4: {
                minecraftClient = \u0636\u0643.getMc();
                if (minecraftClient == null) {
                    throw new NullPointerException("Null pointer access [field:234]");
                }
                if (!(minecraftClient.currentScreen instanceof InventoryScreen)) {
                    this.resetProgress(true, false);
                    return;
                }
                minecraftClient = \u0636\u0643.getMc();
                if (minecraftClient == null) {
                    throw new NullPointerException("Null pointer access [field:250]");
                }
                clientPlayerInteractionManager = minecraftClient.interactionManager;
                if (clientPlayerInteractionManager != null) {
                    playerScreenHandler = clientPlayerEntity.playerScreenHandler;
                    if (playerScreenHandler == null) {
                        throw new NullPointerException("Null pointer access [field:257]");
                    }
                    n = playerScreenHandler.syncId;
                    clientPlayerInteractionManager.clickSlot(n, 6, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
                }
                if ((playerScreenHandler = clientPlayerEntity.playerScreenHandler) == null) {
                    throw new NullPointerException("Null pointer access [invoke:283]");
                }
                playerScreenHandler.sendContentUpdates();
                rainMainMenuScreen$Link = RainMainMenuScreen$Link.INSTANCE;
                if (rainMainMenuScreen$Link == null) {
                    throw new NullPointerException("Null pointer access [invoke:304]");
                }
                string = equipingElytra ? "\u042d\u043b\u0438\u0442\u0440\u0430 \u043d\u0430\u0434\u0435\u0442\u0430" : "\u041d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a \u043e\u0434\u0435\u0442";
                rainMainMenuScreen$Link.showMessage(this, string);
                nextActionAt = l + (long)50;
                state = \u0636\u062b.CLOSING_INVENTORY;
                return;
            }
            case 5: {
                this.resetProgress(true, false);
                return;
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override
    public void onDisable() {
        this.resetProgress(true, true);
    }

    @Commando
    @Compile
    public final void onKey(@NotNull KeyEvent keyEvent) {
        Object var2_2 = null;
        Object var5_3 = null;
        MinecraftClient minecraftClient = null;
        ClientPlayerEntity clientPlayerEntity = null;
        Integer n = null;
        ItemStack itemStack = null;
        Integer n2 = null;
        int n3 = 0;
        boolean bl = false;
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        n3 = keyEvent.get(KeyEvent.Companion.getBUTTON());
        if (Intrinsics.areEqual(keyEvent.get(KeyEvent.Companion.getMOUSE()), true)) {
            return;
        }
        bl = Intrinsics.areEqual(keyEvent.get(KeyEvent.Companion.getRELEASE()), true);
        if (n3 != ((Number)swapBind.getValue()).intValue()) {
            return;
        }
        if (bl) {
            wasPressed = false;
            return;
        }
        minecraftClient = \u0636\u0643.getMc();
        clientPlayerEntity = minecraftClient.player;
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
        if (state != \u0636\u062b.IDLE) {
            return;
        }
        if (wasPressed) {
            return;
        }
        wasPressed = true;
        itemStack = clientPlayerEntity.getEquippedStack(EquipmentSlot.CHEST);
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItemBySlot(...)");
        if (itemStack.isOf(Items.ELYTRA)) {
            bl = false;
            n = this.findChestplateSlot();
        } else {
            bl = true;
            n = this.findElytraSlot();
        }
        if (n == null) {
            RainMainMenuScreen$Link.INSTANCE.showMessage(this, bl ? "\u042d\u043b\u0438\u0442\u0440\u0430 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u0430 \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435" : "\u041d\u0430\u0433\u0440\u0443\u0434\u043d\u0438\u043a \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0432 \u0438\u043d\u0432\u0435\u043d\u0442\u0430\u0440\u0435");
            wasPressed = false;
            return;
        }
        n2 = this.toHandlerSlot(n);
        targetHandlerSlot = n2;
        equipingElytra = bl;
        state = \u0636\u062b.OPENING_INVENTORY;
        nextActionAt = 0L;
    }

    private \u062e\u062b() {
        super("ElytraSwap", \u0638\u0646.getPLAYER(), "\u0421\u0432\u0430\u043f \u044d\u043b\u0438\u0442\u0440\u044b \u043f\u043e \u043a\u043d\u043e\u043f\u043a\u0435");
    }

    /*
     * WARNING - void declaration
     */
    private final Integer toHandlerSlot(int inventorySlot) {
        void var1_1;
        int n = inventorySlot;
        return (0 <= n ? n < 9 : false) ? Integer.valueOf(36 + inventorySlot) : ((9 <= n ? n < 36 : false) ? Integer.valueOf((int)var1_1) : null);
    }

    @Override
    public void onEnable() {
        this.resetProgress(false, true);
    }

    static {
        INSTANCE = new \u062e\u062b();
        swapBind = Module.bind$default(INSTANCE, "\u041a\u043d\u043e\u043f\u043a\u0430", 71, null, 4, null);
        state = \u0636\u062b.IDLE;
        targetHandlerSlot = -1;
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
    }
}

