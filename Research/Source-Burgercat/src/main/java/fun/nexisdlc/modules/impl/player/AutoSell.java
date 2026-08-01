package fun.nexisdlc.modules.impl.player;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.config.AutoSellConfig;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import fun.nexisdlc.modules.api.settings.impl.StringSetting;
import fun.nexisdlc.ui.hud.NotificationsOverlay;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

@FunctionAdd(name = "AutoSell", alias = "Auto Sell", category = Category.Player, description = "Автоматически продаёт предметы из списка .autosell")
public class AutoSell extends Function {
    private final StringSetting price = new StringSetting("Цена продажи", "10");
    private final SliderSetting amount = new SliderSetting("Количество", 10f, 1f, 64f, 1f);

    private enum SellPhase {
        IDLE, PRE_DELAY, SWAP, SELL, POST_DELAY, SWAP_BACK
    }

    private static SellPhase phase = SellPhase.IDLE;
    private static int phaseTimer = 0;
    private static int sellItemSlot = -1;
    private static String sellItemId;
    private static int sellItemCount;
    private static Text sellItemDisplayName;
    private static String sellPriceStr;
    private static int sellSelectedSlot = -1;

    public AutoSell() {
        addSettings(price, amount);
    }

    public static boolean isSelling() {
        return phase != SellPhase.IDLE;
    }

    private static void reset() {
        phase = SellPhase.IDLE;
        phaseTimer = 0;
        sellItemSlot = -1;
        sellItemId = null;
        sellItemCount = 0;
        sellItemDisplayName = null;
        sellPriceStr = null;
        sellSelectedSlot = -1;
    }

    @EventHandler
    public void onUpdate(UpdateEvent e) {
        if (nullCheck()) return;
        if (mc.currentScreen != null) {
            if (phase != SellPhase.IDLE) reset();
            return;
        }

        switch (phase) {
            case IDLE -> updateIdle();
            case PRE_DELAY -> updatePreDelay();
            case SWAP -> updateSwap();
            case SELL -> updateSell();
            case POST_DELAY -> updatePostDelay();
            case SWAP_BACK -> updateSwapBack();
        }
    }

    private void updateIdle() {
        AutoSellConfig config = Nexis.getInstance().getAutoSellConfig();
        List<String> items = config.getItems();
        if (items.isEmpty()) return;

        int exactCount = amount.get().intValue();
        String priceStr = price.get();

        for (String itemId : items) {
            for (int i = 0; i < 36; i++) {
                ItemStack stack = mc.player.getInventory().getStack(i);
                if (stack.isEmpty()) continue;

                String id = Registries.ITEM.getId(stack.getItem()).toString();
                if (!id.equals(itemId)) continue;
                if (stack.isDamageable()) continue;
                if (stack.getCount() < exactCount) continue;

                sellItemSlot = i;
                sellItemId = id;
                sellItemCount = stack.getCount();
                sellItemDisplayName = stack.getName();
                sellPriceStr = priceStr;
                sellSelectedSlot = mc.player.getInventory().getSelectedSlot();

                phase = SellPhase.PRE_DELAY;
                phaseTimer = 2;
                return;
            }
        }
    }

    private void updatePreDelay() {
        if (--phaseTimer > 0) return;
        phase = SellPhase.SWAP;
    }

    private void updateSwap() {
        int selectedSlot = sellSelectedSlot;

        if (sellItemSlot < 9) {
            mc.player.getInventory().setSelectedSlot(sellItemSlot);
            PlayerInventoryUtil.updateSlots();
        } else {
            PlayerInventoryUtil.clickSlot(sellItemSlot, selectedSlot, SlotActionType.SWAP);
            mc.player.getInventory().setSelectedSlot(selectedSlot);
            PlayerInventoryUtil.updateSlots();
        }

        phase = SellPhase.SELL;
    }

    private void updateSell() {
        ItemStack handStack = mc.player.getMainHandStack();
        String handItemId = Registries.ITEM.getId(handStack.getItem()).toString();
        if (!handItemId.equals(sellItemId)) {
            sendMessage(Formatting.RED + "Ошибка: ожидался " + sellItemId + ", но в руке " + handItemId);
            if (sellItemSlot >= 9) {
                PlayerInventoryUtil.clickSlot(sellItemSlot, sellSelectedSlot, SlotActionType.SWAP);
                mc.player.getInventory().setSelectedSlot(sellSelectedSlot);
                PlayerInventoryUtil.updateSlots();
            } else {
                mc.player.getInventory().setSelectedSlot(sellSelectedSlot);
                PlayerInventoryUtil.updateSlots();
            }
            reset();
            return;
        }

        mc.player.networkHandler.sendChatCommand("ah sell " + sellPriceStr);

        NotificationsOverlay.push(
                Text.literal("Продаю ")
                        .append(sellItemDisplayName)
                        .append(" x" + sellItemCount + " за $" + sellPriceStr),
                2000,
                NotificationsOverlay.Kind.PICKUP,
                handStack
        );

        phase = SellPhase.POST_DELAY;
        phaseTimer = 8;
    }

    private void updatePostDelay() {
        if (--phaseTimer > 0) return;
        phase = SellPhase.SWAP_BACK;
    }

    private void updateSwapBack() {
        if (sellItemSlot >= 9) {
            PlayerInventoryUtil.clickSlot(sellItemSlot, sellSelectedSlot, SlotActionType.SWAP);
            mc.player.getInventory().setSelectedSlot(sellSelectedSlot);
            PlayerInventoryUtil.updateSlots();
        } else {
            mc.player.getInventory().setSelectedSlot(sellSelectedSlot);
            PlayerInventoryUtil.updateSlots();
        }
        reset();
    }

    @Override
    public void onEnable() {
        reset();
        super.onEnable();
    }

    @Override
    public void onDisable() {
        if (phase != SellPhase.IDLE && mc.player != null) {
            if (sellItemSlot >= 9) {
                PlayerInventoryUtil.clickSlot(sellItemSlot, sellSelectedSlot, SlotActionType.SWAP);
                mc.player.getInventory().setSelectedSlot(sellSelectedSlot);
                PlayerInventoryUtil.updateSlots();
            } else {
                mc.player.getInventory().setSelectedSlot(sellSelectedSlot);
                PlayerInventoryUtil.updateSlots();
            }
        }
        reset();
        super.onDisable();
    }
}
