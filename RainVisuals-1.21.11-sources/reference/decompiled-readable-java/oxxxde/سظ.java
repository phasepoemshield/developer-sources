/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.FoodComponent
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Hand
 *  ru.ocz.protection.annotation.Compile
 *  ru.ocz.protection.virtualmachine.annotation.RecompileFormat
 */
package oxxxde;

import kotakbaz.rain.event.events.PlayerUpdateEvent;
import kotakbaz.rain.mixin.ClientPlayerInteractionManagerInvoker;
import kotakbaz.rain.module.Module;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0627\u064f;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0003J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0018\u00a2\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001f\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b \u0010\u0012J\u000f\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b!\u0010\u0003R\u0016\u0010\"\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b'\u0010#\u00a8\u0006("}, d2={"Loxxxde/\u0633\u0638;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "", "onEnable", "onDisable", "Loxxxde/\u0633\u062d;", "event", "onUpdate", "(Lkotakbaz/rain/event/events/PlayerUpdateEvent;)V", "Lnet/minecraft/class_746;", "player", "maintainEating", "(Lnet/minecraft/class_746;)V", "", "slot", "startEating", "(Lnet/minecraft/class_746;I)V", "stopEating", "findFoodSlot", "(Lnet/minecraft/class_746;)Ljava/lang/Integer;", "Lnet/minecraft/class_1799;", "stack", "", "canEat", "(Lnet/minecraft/class_746;Lnet/minecraft/class_1799;)Z", "shouldEat", "(Lnet/minecraft/class_746;)Z", "isActiveEating", "()Z", "shouldAbort", "selectSlot", "resetState", "isEating", "Z", "previousSlot", "I", "eatingSlot", "previousUsePressed", "rain-visuals"})
@RecompileFormat
public final class \u0633\u0638
extends Module {
    private static boolean previousUsePressed;
    private static int eatingSlot;
    private static boolean isEating;
    @NotNull
    public static final \u0633\u0638 INSTANCE;
    private static int previousSlot;

    public final boolean isActiveEating() {
        return this.isEnabled() && isEating;
    }

    private final void stopEating() {
        ClientPlayerEntity player = \u0636\u0643.getMc().player;
        if (isEating) {
            \u0636\u0643.getMc().options.useKey.setPressed(previousUsePressed);
            if (player != null) {
                int n = previousSlot;
                boolean bl = 0 <= n ? n < 9 : false;
                if (bl) {
                    this.selectSlot(player, previousSlot);
                }
            }
        }
        this.resetState();
    }

    private final boolean shouldAbort(ClientPlayerEntity player) {
        if (\u0636\u0643.getMc().currentScreen != null) {
            return true;
        }
        if (!player.isAlive()) {
            return true;
        }
        return player.isSpectator();
    }

    /*
     * WARNING - void declaration
     */
    private final boolean canEat(ClientPlayerEntity player, ItemStack stack) {
        void var5_5;
        void $this$canConsume$iv;
        if (stack.isEmpty()) {
            return false;
        }
        FoodComponent foodComponent = (FoodComponent)stack.get(DataComponentTypes.FOOD);
        if (foodComponent == null) {
            return false;
        }
        FoodComponent food = foodComponent;
        PlayerEntity playerEntity = (PlayerEntity)player;
        boolean ignoreHunger$iv = food.canAlwaysEat();
        boolean $i$f$canConsume = false;
        return $this$canConsume$iv.canConsume((boolean)var5_5);
    }

    @Override
    public void onDisable() {
        this.stopEating();
    }

    private final boolean shouldEat(ClientPlayerEntity player) {
        return player.getHungerManager().getFoodLevel() < 20;
    }

    private \u0633\u0638() {
        super("AutoEat", \u0638\u0646.getPLAYER(), "\u0410\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u0438 \u0435\u0441\u0442 \u043f\u0440\u0438 \u0433\u043e\u043b\u043e\u0434\u0435");
    }

    @Compile
    private final void startEating(ClientPlayerEntity clientPlayerEntity, int n) {
        previousSlot = clientPlayerEntity.getInventory().getSelectedSlot();
        previousUsePressed = \u0636\u0643.getMc().options.useKey.isPressed();
        eatingSlot = n;
        isEating = true;
        this.selectSlot(clientPlayerEntity, n);
        \u0636\u0643.getMc().options.useKey.setPressed(true);
        \u0636\u0643.getMc().interactionManager.interactItem((PlayerEntity)clientPlayerEntity, Hand.MAIN_HAND);
    }

    /*
     * Unable to fully structure code
     */
    @Compile
    private final void maintainEating(ClientPlayerEntity var1_1) {
        if (!this.shouldEat(var1_1)) {
            if (var1_1.isUsingItem()) {
                this.stopEating();
            }
            return;
        }
        if (\u0633\u0638.eatingSlot < 0) ** GOTO lbl-1000
        v0 = var1_1.getInventory().getStack(\u0633\u0638.eatingSlot);
        Intrinsics.checkNotNullExpressionValue(v0, "getItem(...)");
        if (this.canEat(var1_1, v0)) {
            var2_2 = \u0633\u0638.eatingSlot;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = this.findFoodSlot(var1_1);
        }
        if (var2_2 == null) {
            if (var1_1.isUsingItem()) {
                this.stopEating();
            }
            return;
        }
        \u0633\u0638.eatingSlot = var2_2;
        this.selectSlot(var1_1, var2_2);
        \u0636\u0643.getMc().options.useKey.setPressed(true);
        if (var1_1.isUsingItem()) {
            return;
        }
        var3_3 = \u0636\u0643.getMc().interactionManager;
        if (var3_3 == null) {
            return;
        }
        var3_3.interactItem((PlayerEntity)var1_1, Hand.MAIN_HAND);
    }

    private final void resetState() {
        isEating = false;
        previousSlot = -1;
        eatingSlot = -1;
        previousUsePressed = false;
    }

    /*
     * WARNING - void declaration
     */
    private final Integer findFoodSlot(ClientPlayerEntity player) {
        int currentSlot = player.getInventory().getSelectedSlot();
        ItemStack itemStack = player.getInventory().getStack(currentSlot);
        Intrinsics.checkNotNullExpressionValue(itemStack, "getItem(...)");
        if (this.canEat(player, itemStack)) {
            return currentSlot;
        }
        int slot = 0;
        while (slot < 9) {
            void var3_3;
            ItemStack itemStack2 = player.getInventory().getStack(slot);
            Intrinsics.checkNotNullExpressionValue(itemStack2, "getItem(...)");
            if (this.canEat(player, itemStack2)) {
                return slot;
            }
            ++var3_3;
        }
        return null;
    }

    @Override
    public void onEnable() {
        this.resetState();
    }

    static {
        INSTANCE = new \u0633\u0638();
        previousSlot = -1;
        eatingSlot = -1;
        \u0627\u064f.moduleOnFuntime$default(\u0627\u064f.INSTANCE, INSTANCE, null, 2, null);
    }

    private final void selectSlot(ClientPlayerEntity player, int slot) {
        block2: {
            if (!(0 <= slot ? slot < 9 : false)) {
                return;
            }
            if (player.getInventory().getSelectedSlot() == slot) {
                return;
            }
            player.getInventory().setSelectedSlot(slot);
            ClientPlayerInteractionManager clientPlayerInteractionManager = \u0636\u0643.getMc().interactionManager;
            ClientPlayerInteractionManagerInvoker clientPlayerInteractionManagerInvoker = clientPlayerInteractionManager instanceof ClientPlayerInteractionManagerInvoker ? (ClientPlayerInteractionManagerInvoker)clientPlayerInteractionManager : null;
            if (clientPlayerInteractionManagerInvoker == null) break block2;
            clientPlayerInteractionManagerInvoker.rain$syncSelectedSlot();
        }
    }

    @Commando
    @Compile
    public final void onUpdate(@NotNull PlayerUpdateEvent playerUpdateEvent) {
        Intrinsics.checkNotNullParameter(playerUpdateEvent, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            this.resetState();
            return;
        }
        if (\u0636\u0643.getMc().world == null) {
            this.stopEating();
            return;
        }
        if (\u0636\u0643.getMc().interactionManager == null) {
            this.stopEating();
            return;
        }
        if (this.shouldAbort(clientPlayerEntity)) {
            this.stopEating();
            return;
        }
        if (isEating) {
            this.maintainEating(clientPlayerEntity);
            return;
        }
        if (!this.shouldEat(clientPlayerEntity)) {
            return;
        }
        if (clientPlayerEntity.isUsingItem()) {
            return;
        }
        Integer n = this.findFoodSlot(clientPlayerEntity);
        if (n == null) {
            return;
        }
        this.startEating(clientPlayerEntity, n);
    }
}

