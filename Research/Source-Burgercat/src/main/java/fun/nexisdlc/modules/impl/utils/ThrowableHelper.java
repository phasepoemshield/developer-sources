package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;

import java.util.Arrays;
import java.util.List;

@FunctionAdd(name = "ThrowableHelper", alias = "Throwable Helper", category = Category.Utilities, description = "Автоматически переключается на метательное оружие при зажатии use key")
public class ThrowableHelper extends Function {
    List<Item> throwables = Arrays.asList(Items.BOW, Items.TRIDENT, Items.CROSSBOW);

    private int previousSlot = -1;
    private boolean wasPressed = false;
    private int ticksToRestore = -1;

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (ticksToRestore > 0) {
            ticksToRestore--;
            if (ticksToRestore == 0 && previousSlot != -1) {
                mc.player.getInventory().setSelectedSlot(previousSlot);
                previousSlot = -1;
            }
        }

        if (mc.options.useKey.isPressed()) {
            Item currentItem = mc.player.getMainHandStack().getItem();

            if (throwables.contains(currentItem)
                    || mc.player.getMainHandStack().contains(DataComponentTypes.FOOD)
                    || mc.player.getMainHandStack().contains(DataComponentTypes.POTION_CONTENTS)) return;

            int bestSlot = findNearestThrowable();

            if (bestSlot != -1 && !wasPressed) {
                previousSlot = mc.player.getInventory().getSelectedSlot();
                mc.player.getInventory().setSelectedSlot(bestSlot);
            }

            wasPressed = true;
        } else {
            if (wasPressed && previousSlot != -1) {
                ticksToRestore = 1;
            }
            wasPressed = false;
        }
    }

    private int findNearestThrowable() {
        int currentSlot = mc.player.getInventory().getSelectedSlot();
        int nearestSlot = -1;
        int minDistance = 10;

        for (int i = 0; i < 9; i++) {
            Item item = mc.player.getInventory().getStack(i).getItem();

            if (throwables.contains(item)) {
                int distance = Math.abs(currentSlot - i);

                if (distance < minDistance) {
                    minDistance = distance;
                    nearestSlot = i;
                }
            }
        }
        return nearestSlot;
    }
}
