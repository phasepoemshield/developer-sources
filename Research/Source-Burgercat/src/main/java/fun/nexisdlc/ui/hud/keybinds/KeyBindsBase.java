package fun.nexisdlc.ui.hud.keybinds;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.utils.client.IMinecraft;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.render.animations.impl.SimpleLinearAnimation;
import fun.nexisdlc.client.utils.render.drag.api.Dragging;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import lombok.RequiredArgsConstructor;
import org.lwjgl.glfw.GLFW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public abstract class KeyBindsBase implements IMinecraft {
    public static final String SETTINGS_SCOPE = "KeyBinds";
    public static final String SETTING_ALWAYS_SHOW = "alwaysShow";
    public static final String SETTING_LINE_BETWEEN_TEXT_AND_BIND = "lineBetweenTextAndBind";
    public static final String SETTING_VARIANT = "variant";
    public static final String VARIANT_DEFAULT = "Дефолт";
    public static final String VARIANT_NEW = "Новый";
    public static float width;
    public static float height;
    final Dragging dragging;

    final Map<Object, Float> bindAnim = new HashMap<>();
    final Map<Object, Float> bindY = new HashMap<>();
    long lastAnimTime = System.currentTimeMillis();
    final SimpleLinearAnimation animation = new SimpleLinearAnimation();
    static final float ITEM_ANIM_DURATION_MS = 200f;
    float lastDragX = Float.NaN;
    float lastDragY = Float.NaN;

    protected static final class BindEntry {
        final Object key;
        final String alias;
        final int bind;
        final boolean active;
        final String categoryIcon;

        BindEntry(Function f) {
            this.key = f;
            this.alias = f.getAlias();
            this.bind = f.getBind();
            this.active = f.isState();
            this.categoryIcon = getCategoryIconStatic(f);
        }

        BindEntry(BooleanSetting s, Function owner) {
            this.key = s;
            this.alias = owner.getAlias() + ": " + s.getName();
            this.bind = s.getBind();
            this.active = s.get();
            this.categoryIcon = getCategoryIconStatic(owner);
        }
    }

    protected List<BindEntry> collectAllEntries() {
        List<BindEntry> result = new ArrayList<>();
        for (Function f : Nexis.getFunctionManager().getVisibleFunctions()) {
            if (isBoundInt(f.getBind())) {
                result.add(new BindEntry(f));
            }
            for (fun.nexisdlc.modules.api.settings.api.Setting<?> s : f.getSettings()) {
                if (s instanceof BooleanSetting bs && bs.isBound()) {
                    result.add(new BindEntry(bs, f));
                }
            }
        }
        return result;
    }

    protected static String getCategoryIconStatic(Function function) {
        if (function == null || function.getCategory() == null || function.getCategory().getIcon() == null || function.getCategory().getIcon().isEmpty()) {
            return "?";
        }
        return function.getCategory().getIcon();
    }

    protected static boolean isBoundInt(int bind) {
        return bind != -1 && bind != 0;
    }

    protected static String getKeyName(int code) {
        if (code == -1 || code == 0) return "-";

        if (code >= 1000) {
            int mouseButton = code - 1000;
            return switch (mouseButton) {
                case 0 -> "LMB";
                case 1 -> "RMB";
                case 2 -> "MMB";
                default -> "MOUSE " + (mouseButton + 1);
            };
        }

        return switch (code) {
            case GLFW.GLFW_KEY_LEFT_SHIFT -> "LSHIFT";
            case GLFW.GLFW_KEY_RIGHT_SHIFT -> "RSHIFT";
            case GLFW.GLFW_KEY_LEFT_CONTROL -> "LCTRL";
            case GLFW.GLFW_KEY_RIGHT_CONTROL -> "RCTRL";
            case GLFW.GLFW_KEY_LEFT_ALT -> "LALT";
            case GLFW.GLFW_KEY_RIGHT_ALT -> "RALT";
            case GLFW.GLFW_KEY_SPACE -> "SPACE";
            case GLFW.GLFW_KEY_ENTER -> "ENTER";
            case GLFW.GLFW_KEY_TAB -> "TAB";
            case GLFW.GLFW_KEY_ESCAPE -> "ESC";
            case GLFW.GLFW_KEY_DELETE -> "DEL";
            case GLFW.GLFW_KEY_INSERT -> "INS";
            case GLFW.GLFW_KEY_HOME -> "HOME";
            case GLFW.GLFW_KEY_END -> "END";
            case GLFW.GLFW_KEY_PAGE_UP -> "PGUP";
            case GLFW.GLFW_KEY_PAGE_DOWN -> "PGDN";
            case GLFW.GLFW_KEY_UP -> "UP";
            case GLFW.GLFW_KEY_DOWN -> "DOWN";
            case GLFW.GLFW_KEY_LEFT -> "LEFT";
            case GLFW.GLFW_KEY_RIGHT -> "RIGHT";
            case GLFW.GLFW_KEY_A -> "A";
            case GLFW.GLFW_KEY_B -> "B";
            case GLFW.GLFW_KEY_C -> "C";
            case GLFW.GLFW_KEY_D -> "D";
            case GLFW.GLFW_KEY_E -> "E";
            case GLFW.GLFW_KEY_F -> "F";
            case GLFW.GLFW_KEY_G -> "G";
            case GLFW.GLFW_KEY_H -> "H";
            case GLFW.GLFW_KEY_I -> "I";
            case GLFW.GLFW_KEY_J -> "J";
            case GLFW.GLFW_KEY_K -> "K";
            case GLFW.GLFW_KEY_L -> "L";
            case GLFW.GLFW_KEY_M -> "M";
            case GLFW.GLFW_KEY_N -> "N";
            case GLFW.GLFW_KEY_O -> "O";
            case GLFW.GLFW_KEY_P -> "P";
            case GLFW.GLFW_KEY_Q -> "Q";
            case GLFW.GLFW_KEY_R -> "R";
            case GLFW.GLFW_KEY_S -> "S";
            case GLFW.GLFW_KEY_T -> "T";
            case GLFW.GLFW_KEY_U -> "U";
            case GLFW.GLFW_KEY_V -> "V";
            case GLFW.GLFW_KEY_W -> "W";
            case GLFW.GLFW_KEY_X -> "X";
            case GLFW.GLFW_KEY_Y -> "Y";
            case GLFW.GLFW_KEY_Z -> "Z";
            case GLFW.GLFW_KEY_0 -> "0";
            case GLFW.GLFW_KEY_1 -> "1";
            case GLFW.GLFW_KEY_2 -> "2";
            case GLFW.GLFW_KEY_3 -> "3";
            case GLFW.GLFW_KEY_4 -> "4";
            case GLFW.GLFW_KEY_5 -> "5";
            case GLFW.GLFW_KEY_6 -> "6";
            case GLFW.GLFW_KEY_7 -> "7";
            case GLFW.GLFW_KEY_8 -> "8";
            case GLFW.GLFW_KEY_9 -> "9";
            case GLFW.GLFW_KEY_APOSTROPHE -> "'";
            case GLFW.GLFW_KEY_COMMA -> ",";
            case GLFW.GLFW_KEY_MINUS -> "-";
            case GLFW.GLFW_KEY_PERIOD -> ".";
            case GLFW.GLFW_KEY_SLASH -> "/";
            case GLFW.GLFW_KEY_SEMICOLON -> ";";
            case GLFW.GLFW_KEY_EQUAL -> "=";
            case GLFW.GLFW_KEY_LEFT_BRACKET -> "[";
            case GLFW.GLFW_KEY_RIGHT_BRACKET -> "]";
            case GLFW.GLFW_KEY_BACKSLASH -> "\\";
            case GLFW.GLFW_KEY_GRAVE_ACCENT -> "GRAVE";
            case GLFW.GLFW_KEY_F1 -> "F1";
            case GLFW.GLFW_KEY_F2 -> "F2";
            case GLFW.GLFW_KEY_F3 -> "F3";
            case GLFW.GLFW_KEY_F4 -> "F4";
            case GLFW.GLFW_KEY_F5 -> "F5";
            case GLFW.GLFW_KEY_F6 -> "F6";
            case GLFW.GLFW_KEY_F7 -> "F7";
            case GLFW.GLFW_KEY_F8 -> "F8";
            case GLFW.GLFW_KEY_F9 -> "F9";
            case GLFW.GLFW_KEY_F10 -> "F10";
            case GLFW.GLFW_KEY_F11 -> "F11";
            case GLFW.GLFW_KEY_F12 -> "F12";
            case GLFW.GLFW_KEY_F13 -> "F13";
            case GLFW.GLFW_KEY_F14 -> "F14";
            case GLFW.GLFW_KEY_F15 -> "F15";
            case GLFW.GLFW_KEY_F16 -> "F16";
            case GLFW.GLFW_KEY_F17 -> "F17";
            case GLFW.GLFW_KEY_F18 -> "F18";
            case GLFW.GLFW_KEY_F19 -> "F19";
            case GLFW.GLFW_KEY_F20 -> "F20";
            case GLFW.GLFW_KEY_F21 -> "F21";
            case GLFW.GLFW_KEY_F22 -> "F22";
            case GLFW.GLFW_KEY_F23 -> "F23";
            case GLFW.GLFW_KEY_F24 -> "F24";
            case GLFW.GLFW_KEY_F25 -> "F25";
            case GLFW.GLFW_KEY_KP_0 -> "KP_0";
            case GLFW.GLFW_KEY_KP_1 -> "KP_1";
            case GLFW.GLFW_KEY_KP_2 -> "KP_2";
            case GLFW.GLFW_KEY_KP_3 -> "KP_3";
            case GLFW.GLFW_KEY_KP_4 -> "KP_4";
            case GLFW.GLFW_KEY_KP_5 -> "KP_5";
            case GLFW.GLFW_KEY_KP_6 -> "KP_6";
            case GLFW.GLFW_KEY_KP_7 -> "KP_7";
            case GLFW.GLFW_KEY_KP_8 -> "KP_8";
            case GLFW.GLFW_KEY_KP_9 -> "KP_9";
            case GLFW.GLFW_KEY_KP_DECIMAL -> "KP_DEC";
            case GLFW.GLFW_KEY_KP_DIVIDE -> "KP_DIV";
            case GLFW.GLFW_KEY_KP_MULTIPLY -> "KP_MUL";
            case GLFW.GLFW_KEY_KP_SUBTRACT -> "KP_SUB";
            case GLFW.GLFW_KEY_KP_ADD -> "KP_ADD";
            case GLFW.GLFW_KEY_KP_ENTER -> "KP_ENTER";
            case GLFW.GLFW_KEY_KP_EQUAL -> "KP_EQ";
            default -> {
                String name = GLFW.glfwGetKeyName(code, 0);
                yield (name != null && !name.isEmpty()) ? name.toUpperCase() : "KEY " + code;
            }
        };
    }

    protected float updateAnimTime() {
        long now = System.currentTimeMillis();
        float dt = (now - lastAnimTime) / 1000f;
        lastAnimTime = now;
        if (!Float.isFinite(dt) || dt < 0f) {
            return 0f;
        }
        return Math.min(dt, 0.05f);
    }

    protected static float centeredTextY(float y, float height, float size) {
        if (FontRegistry.SF_SEMIBOLD == null) {
            return y + height * 0.5f;
        }
        float offset = FontRegistry.centeredBaselineOffset(FontRegistry.SF_SEMIBOLD, 'H', size);
        return y + height * 0.5f + offset + 0.5f;
    }

    protected static float animate(float value, float target, float durationMs, float dt) {
        if (durationMs <= 0f) {
            return target;
        }
        float duration = Math.max(1e-6f, durationMs / 1000f);
        float k = (float) (-Math.log(0.05f) / duration);
        float t = 1f - (float) Math.exp(-k * Math.max(0f, dt));
        return value + (target - value) * MathUtil.clamp(t, 0f, 1f);
    }

    protected void applyDragDelta(float x, float y) {
        if (Float.isFinite(lastDragY)) {
            float dy = y - lastDragY;
            if (Math.abs(dy) > 0.001f) {
                for (Map.Entry<Object, Float> entry : bindY.entrySet()) {
                    entry.setValue(entry.getValue() + dy);
                }
            }
        }
        lastDragX = x;
        lastDragY = y;
    }
}
