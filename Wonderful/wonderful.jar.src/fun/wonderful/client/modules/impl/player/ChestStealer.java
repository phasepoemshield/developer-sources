package fun.wonderful.client.modules.impl.player;

import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import net.minecraft.inventory.Inventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.HopperScreenHandler;
import net.minecraft.screen.slot.Slot;
import ru.ocz.protection.annotation.Compile;

public class ChestStealer
extends Module {
    public static ChestStealer INSTANCE = new ChestStealer();
    private final FloatSetting stealDelay = new FloatSetting("Задержка", 100.0f, 0.0f, 1000.0f, 1.0f);
    private final BooleanSetting randomize = new BooleanSetting("Рандомизация", false);
    private long lastStealTime = 0L;

    public ChestStealer() {
        super("ChestStealer", "Автоматически открывает сундуки и забирает из них предметы", Module.ModuleCategory.PLAYER);
        this.addSettings(this.stealDelay, this.randomize);
    }

    @EventLink
    @Compile
    private native void onUpdate(EventUpdate var1);

    private Optional<Slot> findValidItem(List<Slot> slots, ScreenHandler handler) {
        int containerSlotCount = this.getContainerSlotCount(handler);
        if (containerSlotCount <= 0 || containerSlotCount > slots.size()) {
            return Optional.empty();
        }
        List<Slot> containerSlots = slots.subList(0, containerSlotCount);
        ArrayList<Slot> validSlots = new ArrayList<Slot>();
        for (Slot slot : containerSlots) {
            if (!slot.hasStack() || slot.getStack().isEmpty() || ChestStealer.mc.player.getItemCooldownManager().isCoolingDown(slot.getStack())) continue;
            validSlots.add(slot);
        }
        if (validSlots.isEmpty()) {
            return Optional.empty();
        }
        if (this.randomize.isState()) {
            int randomIndex = ThreadLocalRandom.current().nextInt(validSlots.size());
            return Optional.of((Slot)validSlots.get(randomIndex));
        }
        return Optional.of((Slot)validSlots.get(0));
    }

    private int getContainerSlotCount(ScreenHandler handler) {
        if (handler instanceof GenericContainerScreenHandler) {
            GenericContainerScreenHandler container = (GenericContainerScreenHandler)handler;
            Inventory inventory = container.getInventory();
            return inventory.size();
        }
        if (handler instanceof HopperScreenHandler) {
            return 5;
        }
        return 0;
    }

    @Override
    public void onDisable() {
        this.lastStealTime = 0L;
        super.onDisable();
    }

        return slot -> {
            if (ChestStealer.mc.player.currentScreenHandler == class_17032) {
                ChestStealer.mc.interactionManager.clickSlot(openContainer.syncId, slot.id, 0, SlotActionType.QUICK_MOVE, (PlayerEntity)ChestStealer.mc.player);
                this.lastStealTime = l2;
            }
        };
    }
}