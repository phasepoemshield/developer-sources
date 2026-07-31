package ru.destra.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class ModuleHelper {
    private ModuleHelper() {}

    private static Field enabledField;
    private static Method getValueMethod;

    static {
        try {
            enabledField = Class.forName("ru.destra.core.Module").getDeclaredField("enabled");
            enabledField.setAccessible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            getValueMethod = Class.forName("ru.destra.setting.Setting").getDeclaredMethod("\u0035");
            getValueMethod.setAccessible(true);
        } catch (Exception e) {
            try {
                getValueMethod = Class.forName("ru.destra.setting.Setting").getDeclaredMethod("\u0414");
                getValueMethod.setAccessible(true);
            } catch (Exception e2) {
                try {
                    getValueMethod = Class.forName("ru.destra.setting.Setting").getDeclaredMethod("get");
                    getValueMethod.setAccessible(true);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public static boolean isEnabled(Object module) {
        if (module == null || enabledField == null) return false;
        try {
            return enabledField.getBoolean(module);
        } catch (Exception e) {
            return false;
        }
    }

    public static Object getValue(Object setting) {
        if (setting == null || getValueMethod == null) return null;
        try {
            return getValueMethod.invoke(setting);
        } catch (Exception e) {
            return null;
        }
    }
}
