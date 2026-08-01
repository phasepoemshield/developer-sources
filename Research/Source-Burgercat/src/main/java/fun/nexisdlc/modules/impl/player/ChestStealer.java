package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@FunctionAdd(name = "ChestStealer", alias = "Chest Stealer", category = Category.Player, description = "Автоматически лутает сундук")
public class ChestStealer extends Function {
    private final StopWatch timer = new StopWatch();
    private final Random random = new Random();
    private final ModeSetting mode = new ModeSetting("Режим", "Обычный", "Обычный", "ФТ Фаст");
    private final BooleanSetting chestClose = new BooleanSetting("Закрывать", false);
    private final BooleanSetting toggle = new BooleanSetting("Выключать когда залутал", false);
    private final SliderSetting stealDelay = new SliderSetting("Задержка лутания", 10, 0, 200, 10);
    private final BooleanSetting miss = new BooleanSetting("Промахиваться", false);
    private final SliderSetting missPercent = new SliderSetting("Шанс промаха", 15, 0, 75, 1).setVisible(miss::get);

    public ChestStealer() {
        addSettings(mode, chestClose, toggle, stealDelay, miss, missPercent);
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck() || !(mc.currentScreen instanceof GenericContainerScreen screen)) return;
        if (!timer.hasReached(stealDelay.get().longValue())) return;

        GenericContainerScreenHandler container = screen.getScreenHandler();
        Inventory inventory = container.getInventory();
        List<Integer> filled = new ArrayList<>();
        for (int i = 0; i < inventory.size(); i++) {
            ItemStack stack = inventory.getStack(i);
            if (!stack.isEmpty()) filled.add(i);
        }

        if (filled.isEmpty()) {
            if (chestClose.get()) mc.player.closeHandledScreen();
            if (toggle.get()) toggle();
            return;
        }
        if (toggle.get() && mc.player.getInventory().getMainStacks().stream().noneMatch(ItemStack::isEmpty)) {
            mc.player.closeHandledScreen();
            toggle();
            return;
        }
        if (miss.get() && random.nextInt(100) < missPercent.get().intValue()) {
            timer.reset();
            return;
        }

        int slot = mode.is("ФТ Фаст") ? filled.get(random.nextInt(filled.size())) : filled.get(0);
        mc.interactionManager.clickSlot(container.syncId, slot, 0, SlotActionType.QUICK_MOVE, mc.player);
        timer.reset();
    }
}
