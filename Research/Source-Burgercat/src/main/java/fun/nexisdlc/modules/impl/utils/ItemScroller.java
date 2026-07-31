package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.EventClickSlot;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.client.util.InputUtil;
import net.minecraft.item.Item;
import net.minecraft.screen.slot.SlotActionType;
import org.lwjgl.glfw.GLFW;

import java.util.concurrent.ThreadLocalRandom;

@FunctionAdd(name = "ItemScroller", alias = "Item Scroller", category = Category.Utilities, description = "Убирает задержку на перетаскивание предметов и добавляет массовое выбрасывание")
public class ItemScroller extends Function {
    public static SliderSetting delay = new SliderSetting("Задержка", 80L, 30L, 200L, 1L);
    public static BooleanSetting throwAllEnabled = new BooleanSetting("ThrowAll (Shift+Ctrl+Q)", true);
    public static BooleanSetting scrollEnabled = new BooleanSetting("Shift+Drag скролл", true);
    private boolean pauseListening = false;

    public ItemScroller() {
        addSettings(delay, throwAllEnabled, scrollEnabled);
    }

    @EventHandler
    public void onClick(EventClickSlot e) {
        if (nullCheck() || mc.player == null || mc.interactionManager == null) {
            pauseListening = false;
            return;
        }

        if (!throwAllEnabled.get()) return;

        if (isShiftPressed() && isCtrlPressed()
                && e.actionType == SlotActionType.THROW
                && !pauseListening) {
            if (mc.currentScreen != null) {
                if (e.slotId < 0 || e.slotId >= mc.player.currentScreenHandler.slots.size()) {
                    return;
                }
                Item copy = mc.player.currentScreenHandler.slots.get(e.slotId).getStack().getItem();
                pauseListening = true;
                try {
                    for (int i = 0; i < mc.player.currentScreenHandler.slots.size(); ++i) {
                        if (mc.player.currentScreenHandler.slots.get(i).getStack().getItem() == copy
                                && i != e.slotId) {
                            mc.interactionManager.clickSlot(
                                mc.player.currentScreenHandler.syncId,
                                i, 1, SlotActionType.THROW,
                                mc.player
                            );
                        }
                    }
                } finally {
                    pauseListening = false;
                }
            }
        }
    }

    private boolean isShiftPressed() {
        return isKeyPressed(GLFW.GLFW_KEY_LEFT_SHIFT) || isKeyPressed(GLFW.GLFW_KEY_RIGHT_SHIFT);
    }

    private boolean isCtrlPressed() {
        return isKeyPressed(GLFW.GLFW_KEY_LEFT_CONTROL) || isKeyPressed(GLFW.GLFW_KEY_RIGHT_CONTROL);
    }

    public boolean isKeyPressed(int button) {
        if (button < 10) {
            return false;
        }
        return mc != null && mc.getWindow() != null && InputUtil.isKeyPressed(mc.getWindow(), button);
    }

    public static long getDelay() {
        return (long) ThreadLocalRandom.current().nextFloat(delay.get() - 3, delay.get() + 1);
    }
}
