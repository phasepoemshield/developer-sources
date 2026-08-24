/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 *  org.lwjgl.glfw.GLFW
 */
package oxxxde;

import java.util.Collection;
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
import oxxxde.\u0636\u0643;
import oxxxde.\u0637\u062b;
import oxxxde.\u0638\u0646;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"Loxxxde/\u0627\u062a;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u062a\u063a;", "event", "", "onClickSlot", "(Lkotakbaz/rain/event/events/ClickSlotEvent;)V", "", "delayMs", "()J", "", "isShiftDown", "()Z", "isCtrlDown", "", "keyCode", "isKeyDown", "(I)Z", "Loxxxde/\u0637\u064f;", "delay", "Loxxxde/\u0637\u064f;", "getDelay", "()Lkotakbaz/rain/module/setting/settings/SliderSetting;", "stop", "Z", "rain-visuals"})
public final class \u0627\u062a
extends Module {
    private static boolean stop;
    @NotNull
    public static final \u0627\u062a INSTANCE;
    @NotNull
    private static final SliderSetting delay;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Commando
    public final void onClickSlot(@NotNull ClickSlotEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        ClientPlayerEntity player = clientPlayerEntity;
        ClientPlayerInteractionManager clientPlayerInteractionManager = \u0636\u0643.getMc().interactionManager;
        if (clientPlayerInteractionManager == null) {
            return;
        }
        ClientPlayerInteractionManager interaction = clientPlayerInteractionManager;
        ScreenHandler screenHandler = player.currentScreenHandler;
        Intrinsics.checkNotNullExpressionValue(screenHandler, "containerMenu");
        ScreenHandler handler = screenHandler;
        if (stop || event.getSlotActionType() != SlotActionType.THROW) {
            return;
        }
        if (!this.isShiftDown() || !this.isCtrlDown()) {
            return;
        }
        int n = ((Collection)handler.slots).size();
        int n2 = event.getSlot();
        if (!(0 <= n2 ? n2 < n : false)) {
            return;
        }
        Object object = handler.slots.get(event.getSlot());
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        ItemStack sourceStack = \u0637\u062b.getStack((Slot)object);
        if (sourceStack.isEmpty()) {
            return;
        }
        stop = true;
        try {
            Item item = sourceStack.getItem();
            Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
            Item sourceItem = item;
            int slotIndex = 0;
            int n3 = ((Collection)handler.slots).size();
            while (slotIndex < n3) {
                void var7_10;
                Object object2 = handler.slots.get(slotIndex);
                Intrinsics.checkNotNullExpressionValue(object2, "get(...)");
                if (Intrinsics.areEqual(\u0637\u062b.getStack((Slot)object2).getItem(), sourceItem)) {
                    interaction.clickSlot(handler.syncId, slotIndex, 1, SlotActionType.THROW, (PlayerEntity)player);
                }
                ++var7_10;
            }
            stop = false;
        }
        catch (Throwable throwable) {
            stop = false;
            throw throwable;
        }
    }

    @NotNull
    public final SliderSetting getDelay() {
        return delay;
    }

    private final boolean isKeyDown(int keyCode) {
        return GLFW.glfwGetKey((long)\u0636\u0643.getMc().getWindow().getHandle(), (int)keyCode) == 1;
    }

    private final boolean isShiftDown() {
        return this.isKeyDown(340) || this.isKeyDown(344);
    }

    private \u0627\u062a() {
        super("ItemScroller", \u0638\u0646.getPLAYER(), "\u0411\u044b\u0441\u0442\u0440\u043e\u0435 \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0435\u043d\u0438\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u043e\u0432");
    }

    static {
        INSTANCE = new \u0627\u062a();
        delay = Module.slider$default(INSTANCE, "\u0417\u0430\u0434\u0435\u0440\u0436\u043a\u0430", 40.0f, 0.0f, 200.0f, 5.0f, null, 32, null);
    }

    public final long delayMs() {
        return RangesKt.coerceAtLeast((long)((Number)delay.getValue()).floatValue(), 0L);
    }

    private final boolean isCtrlDown() {
        return this.isKeyDown(341) || this.isKeyDown(345);
    }
}

