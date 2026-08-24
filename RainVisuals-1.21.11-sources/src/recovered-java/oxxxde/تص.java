/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.event.events.ClickSlotEvent;
import kotakbaz.rain.event.events.DropEvent;
import kotakbaz.rain.module.Module;
import kotakbaz.rain.module.setting.Setting;
import kotakbaz.rain.module.setting.settings.BooleanSetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0636\u0643;
import oxxxde.\u0638\u0646;
import ru.ocz.protection.annotation.Compile;
import sweetie.evaware.flora.api.Commando;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2={"Loxxxde/\u062a\u0635;", "Loxxxde/\u062f\u0650;", "<init>", "()V", "Loxxxde/\u0634\u0636;", "event", "", "onDrop", "(Lkotakbaz/rain/event/events/DropEvent;)V", "Loxxxde/\u062a\u063a;", "onClickSlot", "(Lkotakbaz/rain/event/events/ClickSlotEvent;)V", "Lnet/minecraft/class_1799;", "stack", "", "isTalismanOrSphere", "(Lnet/minecraft/class_1799;)Z", "Loxxxde/\u062e\u0630;", "lockAll", "Loxxxde/\u062e\u0630;", "lockTalismansAndSpheres", "", "slotSettings", "Ljava/util/List;", "", "OUTSIDE_SLOT", "I", "rain-visuals"})
public final class \u062a\u0635
extends Module {
    @NotNull
    private static final BooleanSetting lockTalismansAndSpheres;
    @NotNull
    private static final List<BooleanSetting> slotSettings;
    @NotNull
    private static final BooleanSetting lockAll;
    private static final int OUTSIDE_SLOT = -999;
    @NotNull
    public static final \u062a\u0635 INSTANCE;

    private final boolean isTalismanOrSphere(ItemStack stack) {
        return stack.isOf(Items.PLAYER_HEAD) || stack.isOf(Items.TOTEM_OF_UNDYING) && stack.hasGlint();
    }

    @Commando
    @Compile
    public final void onDrop(@NotNull DropEvent dropEvent) {
        Intrinsics.checkNotNullParameter(dropEvent, "event");
        if (!this.isEnabled()) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = \u0636\u0643.getMc().player;
        if (clientPlayerEntity == null) {
            return;
        }
        if (((Boolean)lockTalismansAndSpheres.getValue()).booleanValue()) {
            ItemStack itemStack = clientPlayerEntity.getMainHandStack();
            Intrinsics.checkNotNullExpressionValue(itemStack, "getMainHandItem(...)");
            if (this.isTalismanOrSphere(itemStack)) {
                dropEvent.setCancel(true);
            }
        }
    }

    static {
        INSTANCE = new \u062a\u0635();
        lockAll = Module.boolean$default(INSTANCE, "\u0417\u0430\u0431\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0432\u0441\u0435", false, null, 4, null);
        lockTalismansAndSpheres = Module.boolean$default(INSTANCE, "\u0411\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u0430\u0442\u044c \u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d\u044b \u0438 \u0441\u0444\u0435\u0440\u044b", false, null, 4, null);
        int n = 9;
        ArrayList<Setting> arrayList = new ArrayList<Setting>(n);
        int n2 = 0;
        while (n2 < n) {
            int n3 = n2++;
            int index = n3;
            ArrayList<Setting> arrayList2 = arrayList;
            boolean bl = false;
            arrayList2.add(Module.boolean$default(INSTANCE, String.valueOf(index + 1), false, null, 4, null).setVisible(\u062a\u0635::slotSettings$lambda$0$0));
        }
        slotSettings = arrayList;
    }

    @Commando
    @Compile
    public final void onClickSlot(@NotNull ClickSlotEvent clickSlotEvent) {
        block4: {
            ItemStack itemStack;
            block6: {
                ScreenHandler screenHandler;
                block5: {
                    int n;
                    ClientPlayerEntity clientPlayerEntity;
                    Intrinsics.checkNotNullParameter(clickSlotEvent, "event");
                    if (!((Boolean)lockTalismansAndSpheres.getValue()).booleanValue() || (clientPlayerEntity = \u0636\u0643.getMc().player) == null) break block4;
                    screenHandler = clientPlayerEntity.currentScreenHandler;
                    Intrinsics.checkNotNullExpressionValue(screenHandler, "containerMenu");
                    if (clickSlotEvent.getSyncId() != screenHandler.syncId) break block4;
                    if (clickSlotEvent.getSlotActionType() != SlotActionType.THROW || (n = clickSlotEvent.getSlot()) < 0 || n >= ((Collection)screenHandler.slots).size()) break block5;
                    itemStack = ((Slot)screenHandler.slots.get(n)).getStack();
                    break block6;
                }
                if (clickSlotEvent.getSlotActionType() != SlotActionType.PICKUP || clickSlotEvent.getSlot() != -999) break block4;
                itemStack = screenHandler.getCursorStack();
            }
            Intrinsics.checkNotNull(itemStack);
            if (this.isTalismanOrSphere(itemStack)) {
                clickSlotEvent.setCancel(true);
            }
        }
    }

    private static final boolean slotSettings$lambda$0$0() {
        return !((Boolean)lockAll.getValue()).booleanValue();
    }

    private \u062a\u0635() {
        super("LockSlot", \u0638\u0646.getPLAYER(), "\u0411\u043b\u043e\u043a\u0438\u0440\u043e\u0432\u043a\u0430 \u0441\u043b\u043e\u0442\u043e\u0432 \u043e\u0442 \u0432\u044b\u0431\u0440\u043e\u0441\u0430");
    }
}

