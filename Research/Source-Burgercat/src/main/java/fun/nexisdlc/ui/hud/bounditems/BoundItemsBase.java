package fun.nexisdlc.ui.hud.bounditems;

import com.mojang.blaze3d.systems.RenderSystem;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.impl.player.ClickAction;
import fun.nexisdlc.modules.impl.utils.ServerAssistant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.List;

public abstract class BoundItemsBase implements IMinecraft {
    public static final String SETTINGS_SCOPE = "BoundItems";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";
    public static float width;
    public static float height;

    protected static final float ITEM_SPACING = 5.0f;
    protected static final float MAIN_BLOCK_HEIGHT = 40f;
    protected static final float BIND_BLOCK_HEIGHT = 25f;
    protected static final float TOTAL_BLOCK_HEIGHT = MAIN_BLOCK_HEIGHT + BIND_BLOCK_HEIGHT;
    protected static final float MIN_WIDTH = 42f;

    protected final Dragging dragging;

    protected BoundItemsBase(Dragging dragging) {
        this.dragging = dragging;
    }

    protected List<BoundEntry> collectEntries() {
        List<BoundEntry> entries = new ArrayList<>();
        var manager = Nexis.getFunctionManager();
        ClickAction clickAction = manager.getClickAction();
        if (clickAction != null) {
            for (ClickAction.KeyBind bind : clickAction.getKeyBindings()) {
                if (bind == null || bind.setting() == null) continue;
                int key = bind.setting().get();
                if (key == -1 || key == 0 || !bind.setting().isVisible()) continue;
                addEntry(entries, bind.item(), key);
            }
            if (clickAction.getExpBind() != null && clickAction.getExpBind().get() != -1 && clickAction.getExpBind().isVisible()) {
                addEntry(entries, Items.EXPERIENCE_BOTTLE, clickAction.getExpBind().get());
            }
        }
        ServerAssistant serverAssistant = manager.getServerAssistant();
        if (serverAssistant != null) {
            for (ServerAssistant.KeyBind bind : serverAssistant.getKeyBindings()) {
                if (bind == null || bind.setting() == null) continue;
                int key = bind.setting().get();
                if (key == -1 || key == 0 || !bind.setting().isVisible()) continue;
                addEntry(entries, bind.item(), key);
            }
        }

        return entries;
    }

    protected void addEntry(List<BoundEntry> entries, Item item, int key) {
        if (item == null) return;
        ItemStack stack = findStack(item);
        int count = countItem(item);
        entries.add(new BoundEntry(stack, count, key));
    }

    protected ItemStack findStack(Item item) {
        if (mc.player == null) return new ItemStack(item);
        for (int i = 0; i < 36; i++) {
            ItemStack stack = mc.player.getInventory().getStack(i);
            if (!stack.isEmpty() && stack.getItem() == item) return stack;
        }
        if (mc.player.getOffHandStack().getItem() == item) {
            return mc.player.getOffHandStack();
        }
        return new ItemStack(item);
    }

    protected int countItem(Item item) {
        if (mc.player == null) return 0;
        int total = 0;
        for (int i = 0; i < 36; i++) {
            ItemStack stack = mc.player.getInventory().getStack(i);
            if (!stack.isEmpty() && stack.getItem() == item) total += stack.getCount();
        }
        ItemStack offhand = mc.player.getOffHandStack();
        if (!offhand.isEmpty() && offhand.getItem() == item) {
            total += offhand.getCount();
        }
        return total;
    }

    protected void renderVanillaItem(Renderer2D render, ItemStack stack,
                                     float x, float y, float size, float hudScale) {
        renderVanillaItem(render, stack, x, y, size, hudScale, 1f);
    }

    protected void renderVanillaItem(Renderer2D render, ItemStack stack,
                                     float x, float y, float size, float hudScale, float alpha) {
        if (stack == null || stack.isEmpty()) return;
        if (mc == null || mc.getItemRenderer() == null) return;
        if (size <= 0f || hudScale <= 0f) return;
        var context = Nexis.getInstance().testRender.getDrawContext();
        if (context == null) return;

        double windowScale = mc.getWindow().getScaleFactor();
        if (windowScale <= 0.0) return;

        float absX = x * hudScale;
        float absY = y * hudScale;
        float absSize = size * hudScale;

        var matrices = context.getMatrices();
        matrices.pushMatrix();
        matrices.translate((float) (absX / windowScale), (float) (absY / windowScale));
        float guiScale = (float) (absSize / (16f * windowScale));
        matrices.scale(guiScale, guiScale);
        context.drawItemWithoutEntity(stack, 0, 0, 0);
        matrices.popMatrix();
        render.resetPipelineState();
    }

    protected static String getKeyName(int code) {
        if (code <= 0) return "NONE";
        if (code >= 1000) {
            int mouseButton = code - 1000;
            return switch (mouseButton) {
                case 0 -> "LMB";
                case 1 -> "RMB";
                case 2 -> "MMB";
                default -> "M" + (mouseButton + 1);
            };
        }
        switch (code) {
            case GLFW.GLFW_KEY_LEFT_SHIFT: return "LSHIFT";
            case GLFW.GLFW_KEY_RIGHT_SHIFT: return "RSHIFT";
            case GLFW.GLFW_KEY_LEFT_CONTROL: return "LCTRL";
            case GLFW.GLFW_KEY_RIGHT_CONTROL: return "RCTRL";
            case GLFW.GLFW_KEY_LEFT_ALT: return "LALT";
            case GLFW.GLFW_KEY_RIGHT_ALT: return "RALT";
            case GLFW.GLFW_KEY_ESCAPE: return "ESC";
            case GLFW.GLFW_KEY_DELETE: return "DEL";
            case GLFW.GLFW_KEY_INSERT: return "INS";
            case GLFW.GLFW_KEY_HOME: return "HOME";
            case GLFW.GLFW_KEY_END: return "END";
            case GLFW.GLFW_KEY_PAGE_UP: return "PGUP";
            case GLFW.GLFW_KEY_PAGE_DOWN: return "PGDN";
            case GLFW.GLFW_KEY_TAB: return "TAB";
            case GLFW.GLFW_KEY_ENTER: return "ENTER";
            case GLFW.GLFW_KEY_SPACE: return "SPACE";
            case GLFW.GLFW_KEY_BACKSPACE: return "BACK";
            case GLFW.GLFW_KEY_CAPS_LOCK: return "CAPS";
            case GLFW.GLFW_KEY_UP: return "UP";
            case GLFW.GLFW_KEY_DOWN: return "DOWN";
            case GLFW.GLFW_KEY_LEFT: return "LEFT";
            case GLFW.GLFW_KEY_RIGHT: return "RIGHT";
            case GLFW.GLFW_KEY_F1: return "F1";
            case GLFW.GLFW_KEY_F2: return "F2";
            case GLFW.GLFW_KEY_F3: return "F3";
            case GLFW.GLFW_KEY_F4: return "F4";
            case GLFW.GLFW_KEY_F5: return "F5";
            case GLFW.GLFW_KEY_F6: return "F6";
            case GLFW.GLFW_KEY_F7: return "F7";
            case GLFW.GLFW_KEY_F8: return "F8";
            case GLFW.GLFW_KEY_F9: return "F9";
            case GLFW.GLFW_KEY_F10: return "F10";
            case GLFW.GLFW_KEY_F11: return "F11";
            case GLFW.GLFW_KEY_F12: return "F12";
            case GLFW.GLFW_KEY_F13: return "F13";
            case GLFW.GLFW_KEY_F14: return "F14";
            case GLFW.GLFW_KEY_F15: return "F15";
            case GLFW.GLFW_KEY_F16: return "F16";
            case GLFW.GLFW_KEY_F17: return "F17";
            case GLFW.GLFW_KEY_F18: return "F18";
            case GLFW.GLFW_KEY_F19: return "F19";
            case GLFW.GLFW_KEY_F20: return "F20";
            case GLFW.GLFW_KEY_F21: return "F21";
            case GLFW.GLFW_KEY_F22: return "F22";
            case GLFW.GLFW_KEY_F23: return "F23";
            case GLFW.GLFW_KEY_F24: return "F24";
            case GLFW.GLFW_KEY_F25: return "F25";
            case GLFW.GLFW_KEY_NUM_LOCK: return "NUM";
            case GLFW.GLFW_KEY_SCROLL_LOCK: return "SCROLL";
            case GLFW.GLFW_KEY_PAUSE: return "PAUSE";
            case GLFW.GLFW_KEY_PRINT_SCREEN: return "PRINT";
            case GLFW.GLFW_KEY_MENU: return "MENU";
            case GLFW.GLFW_KEY_KP_0: return "NUM0";
            case GLFW.GLFW_KEY_KP_1: return "NUM1";
            case GLFW.GLFW_KEY_KP_2: return "NUM2";
            case GLFW.GLFW_KEY_KP_3: return "NUM3";
            case GLFW.GLFW_KEY_KP_4: return "NUM4";
            case GLFW.GLFW_KEY_KP_5: return "NUM5";
            case GLFW.GLFW_KEY_KP_6: return "NUM6";
            case GLFW.GLFW_KEY_KP_7: return "NUM7";
            case GLFW.GLFW_KEY_KP_8: return "NUM8";
            case GLFW.GLFW_KEY_KP_9: return "NUM9";
            case GLFW.GLFW_KEY_KP_DECIMAL: return "NUM.";
            case GLFW.GLFW_KEY_KP_DIVIDE: return "NUM/";
            case GLFW.GLFW_KEY_KP_MULTIPLY: return "NUM*";
            case GLFW.GLFW_KEY_KP_SUBTRACT: return "NUM-";
            case GLFW.GLFW_KEY_KP_ADD: return "NUM+";
            case GLFW.GLFW_KEY_KP_ENTER: return "NUMENTER";
            case GLFW.GLFW_KEY_KP_EQUAL: return "NUM=";
        }
        String name = GLFW.glfwGetKeyName(code, 0);
        return (name != null) ? name.toUpperCase() : "KEY " + code;
    }

    protected record BoundEntry(ItemStack stack, int count, int bind) {}
}
