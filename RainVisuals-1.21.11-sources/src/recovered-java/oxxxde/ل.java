/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.gui.screen.Screen
 */
package oxxxde;

import java.lang.reflect.Field;
import net.minecraft.client.gui.screen.Screen;

public final class \u0644 {
    private static boolean configApplied;
    private static final String FIGURA_PACKAGE = "other.figura.";

    private static boolean isFiguraClassName(String className) {
        return className != null && className.startsWith(FIGURA_PACKAGE);
    }

    public static boolean isFiguraPauseWidget(Object widget) {
        if (widget == null) {
            return false;
        }
        String className = widget.getClass().getName();
        return className.startsWith("other.figura.mixin.gui.PauseScreenMixin$");
    }

    private static void setField(Object owner, String fieldName, Object value) throws ReflectiveOperationException {
        Class<?> type = owner.getClass();
        while (type != null) {
            try {
                Field declared = type.getDeclaredField(fieldName);
                declared.setAccessible(true);
                declared.set(owner, value);
                return;
            }
            catch (NoSuchFieldException ignored) {
                Class<?> clazz = type.getSuperclass();
            }
        }
    }

    public static boolean isFiguraScreen(Screen screen) {
        return screen != null && \u0644.isFiguraClassName(screen.getClass().getName()) && screen.getClass().getName().startsWith("other.figura.gui.");
    }

    public static void applyRuntimeConfig() {
        if (configApplied) {
            return;
        }
        configApplied = true;
        \u0644.setConfigValue("SOUND_BADGE", false);
        \u0644.setConfigValue("ACTION_WHEEL_DECORATIONS", false);
        \u0644.setConfigValue("FIGURA_INVENTORY", false);
        \u0644.setConfigValue("AVATAR_PORTRAIT", false);
        \u0644.setConfigValue("HAS_PAPERDOLL", false);
        \u0644.setConfigValue("PAPERDOLL_ALWAYS_ON", false);
        \u0644.setConfigValue("FIRST_PERSON_PAPERDOLL", false);
        \u0644.setConfigValue("FIRST_PERSON_MATRICES", false);
        \u0644.setConfigValue("RENDER_DEBUG_PARTS_PIVOT", 0);
        \u0644.setConfigValue("CONNECTION_TOASTS", false);
        \u0644.setConfigValue("CHAT_MESSAGES", false);
        \u0644.setConfigValue("SYNC_PINGS", false);
        \u0644.setConfigValue("LOCAL_ASSETS", true);
        \u0644.setConfigValue("ALLOW_NETWORKING", false);
        \u0644.disableKeybindConfig("ACTION_WHEEL_BUTTON");
        \u0644.disableKeybindConfig("POPUP_BUTTON");
        \u0644.disableKeybindConfig("RELOAD_BUTTON");
        \u0644.disableKeybindConfig("PANIC_BUTTON");
        \u0644.disableKeybindConfig("WARDROBE_BUTTON");
    }

    private static void setConfigValue(String fieldName, Object value) {
        try {
            Object config = Class.forName("other.figura.config.Configs").getField(fieldName).get(null);
            \u0644.setField(config, "value", value);
            \u0644.setField(config, "tempValue", value);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static void disableKeybindConfig(String fieldName) {
        try {
            Object config = Class.forName("other.figura.config.Configs").getField(fieldName).get(null);
            \u0644.setField(config, "disabled", true);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private \u0644() {
    }
}

