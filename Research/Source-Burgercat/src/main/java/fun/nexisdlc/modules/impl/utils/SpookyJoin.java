package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.ui.gui.BaseClickGui;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;

@FunctionAdd(name = "SpookyJoin", alias = "Spooky Join", category = Category.Utilities, description = "Автоматически заходит на режим дуэли SpookyTime")
public class SpookyJoin extends Function {
    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) return;

        if (mc.currentScreen instanceof BaseClickGui) return;

        var item = Items.NETHERITE_SWORD;

        if (!(mc.player.currentScreenHandler instanceof GenericContainerScreenHandler container) || container.getInventory().size() != 54) {
            if (!mc.player.getMainHandStack().isOf(Items.COMPASS)) {
                int compassSlot = findHotbarSlot(Items.COMPASS);
                if (compassSlot != -1) mc.player.getInventory().setSelectedSlot(compassSlot);
            } else {
                mc.interactionManager.interactItem(mc.player, Hand.MAIN_HAND);
            }
            return;
        }

        int slot = findContainerSlot(container, item);
        if (slot != -1) {
            mc.interactionManager.clickSlot(container.syncId, slot, 0, SlotActionType.PICKUP, mc.player);
        }
    }

    private int findHotbarSlot(Item item) {
        for (int i = 0; i < 9; i++) {
            if (mc.player.getInventory().getStack(i).isOf(item)) return i;
        }
        return -1;
    }

    private int findContainerSlot(GenericContainerScreenHandler container, Item item) {
        for (int i = 0; i < 54; i++) {
            if (container.getInventory().getStack(i).isOf(item)) return i;
        }
        return -1;
    }
}
