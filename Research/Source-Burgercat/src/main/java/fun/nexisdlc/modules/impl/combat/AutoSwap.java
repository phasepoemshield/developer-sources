package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.client.events.impl.client.EventKey;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.ui.hud.NotificationsOverlay;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;

import java.util.Comparator;

@FunctionAdd(name = "AutoSwap", alias = "Auto Swap", category = Category.Combat, description = "Свапает один предмет на другой по клавише")
public class AutoSwap extends Function {
    BindSetting bind = new BindSetting("Кнопка свапа", -1);
    ModeSetting firstItem = new ModeSetting("Первый", "Тотем", "Шар", "Гепл", "Щит", "Тотем");
    ModeSetting secondItem = new ModeSetting("Второй", "Тотем", "Шар", "Гепл", "Щит", "Тотем");

    public AutoSwap() {
        addSettings(firstItem, secondItem, bind);
    }

    @EventHandler
    public void onKey(EventKey e) {
        if (nullCheck() || e.getAction() != 1 || !e.isKeyDown(bind.get())) {
            return;
        }

        if (e.isKeyDown(bind.get())) {
            Slot first = PlayerInventoryUtil.getSlot(getItemByType(firstItem.get()),
                    Comparator.comparing(s -> s.getStack().hasEnchantments()), s -> s.id != 45);
            Slot second = PlayerInventoryUtil.getSlot(getItemByType(secondItem.get()),
                    Comparator.comparing(s -> s.getStack().hasEnchantments()), s -> s.id != 45);

            Slot validSlot = (first != null && mc.player.getOffHandStack().getItem() != first.getStack().getItem()) ? first : second;


            if (validSlot != null) {
                NotificationsOverlay.push(Text.literal("Свапнул: ").append(validSlot.getStack().getName()), 1200, NotificationsOverlay.Kind.PICKUP, validSlot.getStack());

                PlayerInventoryUtil.swapHand(validSlot, Hand.OFF_HAND, true, true);
            }
        }
    }

    private Item getItemByType(String itemType) {
        return switch (itemType) {
            case "Тотем" -> Items.TOTEM_OF_UNDYING;
            case "Шар" -> Items.PLAYER_HEAD;
            case "Гепл" -> Items.GOLDEN_APPLE;
            case "Щит" -> Items.SHIELD;
            default -> Items.AIR;
        };
    }
}
